package com.zircky.industrialsorcerygreg.api.data.wireless;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Tuple;
import net.minecraft.world.level.saveddata.SavedData;
import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class WirelessEnergySavedData extends SavedData {

  private static final String DATA_NAME = "gtceu_wireless_energy";
  private static final String ENERGY_LIST_TAG = "gtceu_wireless_energy_map";

  private final Map<UUID, WirelessEnergyData> globalWirelessEnergy = new HashMap<>();

  public static WirelessEnergySavedData getOrCreate(final ServerLevel serverLevel) {
    return serverLevel.getDataStorage().computeIfAbsent(
        WirelessEnergySavedData::new,
        WirelessEnergySavedData::new,
        DATA_NAME
    );
  }

  public WirelessEnergySavedData() {
  }

  public WirelessEnergySavedData(final CompoundTag tag) {
    final ListTag list = tag.getList(ENERGY_LIST_TAG, Tag.TAG_COMPOUND);

    for (int i = 0; i < list.size(); i++) {
      final CompoundTag entryTag = list.getCompound(i);
      final String uuidString = entryTag.getString("uuid");

      if (uuidString.isBlank()) {
        continue;
      }

      final UUID uuid = UUID.fromString(uuidString);
      final CompoundTag dataTag = entryTag.getCompound("energyData");

      globalWirelessEnergy.put(uuid, WirelessEnergyData.fromNBT(dataTag));
    }
  }

  @Override
  public @NotNull CompoundTag save(final @NotNull CompoundTag tag) {
    final ListTag list = new ListTag();

    for (final Map.Entry<UUID, WirelessEnergyData> entry : globalWirelessEnergy.entrySet()) {
      final CompoundTag entryTag = new CompoundTag();

      entryTag.putString("uuid", entry.getKey().toString());
      entryTag.put("energyData", entry.getValue().toNBT());

      list.add(entryTag);
    }

    tag.put(ENERGY_LIST_TAG, list);
    return tag;
  }

  public BigInteger getEnergyStored(final UUID uuid) {
    return getOrCreateData(uuid).energyStored;
  }

  public BigInteger getTotalNetworkEnergyStored(final UUID uuid) {
    return getEnergyStored(uuid).add(getEnergyBuffered(uuid));
  }

  public BigInteger getTotalNetworkEnergyStoredExceptLocalBuffer(final UUID uuid, final BlockPos localBufferPos) {
    return getEnergyStored(uuid).add(getEnergyBufferedExceptLocal(uuid, localBufferPos));
  }

  public BigInteger getEnergyCapacity(final UUID uuid) {
    return getOrCreateData(uuid).energyCapacity;
  }

  public boolean isActive(final UUID uuid) {
    return getOrCreateData(uuid).active;
  }

  public void setActive(final UUID uuid, final boolean active) {
    getOrCreateData(uuid).active = active;
    setDirty();
  }

  public void setCapacity(final UUID uuid, final BigInteger capacity) {
    if (capacity.signum() < 0) {
      throw new IllegalArgumentException("capacity cannot be negative");
    }

    final WirelessEnergyData data = getOrCreateData(uuid);
    data.energyCapacity = capacity;

    if (data.energyStored.compareTo(capacity) > 0) {
      data.energyStored = capacity;
    }

    setDirty();
  }

  public void setCapacity(final UUID uuid, final long capacity) {
    setCapacity(uuid, BigInteger.valueOf(capacity));
  }

  public void setEnergy(final UUID uuid, final BigInteger energy) {
    if (energy.signum() < 0) {
      throw new IllegalArgumentException("energy cannot be negative");
    }

    final WirelessEnergyData data = getOrCreateData(uuid);

    if (data.energyCapacity.signum() > 0 && energy.compareTo(data.energyCapacity) > 0) {
      data.energyStored = data.energyCapacity;
    } else {
      data.energyStored = energy;
    }

    setDirty();
  }

  public void setEnergy(final UUID uuid, final long energy) {
    setEnergy(uuid, BigInteger.valueOf(energy));
  }

  public long insertEnergy(final UUID uuid, final long amount) {
    if (amount <= 0) {
      return 0;
    }

    final WirelessEnergyData data = getOrCreateData(uuid);
    final BigInteger amountValue = BigInteger.valueOf(amount);
    final BigInteger newStored = data.energyStored.add(amountValue);

    if (data.energyCapacity.signum() > 0 && newStored.compareTo(data.energyCapacity) > 0) {
      final BigInteger inserted = data.energyCapacity.subtract(data.energyStored).max(BigInteger.ZERO);
      data.energyStored = data.energyCapacity;
      setDirty();
      return inserted.longValue();
    }

    data.energyStored = newStored;
    setDirty();
    return amount;
  }

  public long extractEnergy(final UUID uuid, final long amount) {
    if (amount <= 0) {
      return 0;
    }

    final WirelessEnergyData data = getOrCreateData(uuid);
    final BigInteger requested = BigInteger.valueOf(amount);
    final BigInteger extracted = data.energyStored.min(requested);

    if (extracted.signum() <= 0) {
      return 0;
    }

    data.energyStored = data.energyStored.subtract(extracted);
    setDirty();

    return extracted.longValue();
  }

  public long getEnergyInput(final UUID uuid) {
    return sumLongValues(getOrCreateData(uuid).energyInput);
  }

  public void setEnergyInput(final UUID uuid, final BlockPos pos, final long input) {
    getOrCreateData(uuid).energyInput.put(pos.immutable(), Math.max(0, input));
    setDirty();
  }

  public void removeEnergyInput(final UUID uuid, final BlockPos pos) {
    getOrCreateData(uuid).energyInput.remove(pos);
    setDirty();
  }

  public long getEnergyOutput(final UUID uuid) {
    return sumLongValues(getOrCreateData(uuid).energyOutput);
  }

  public void setEnergyOutput(final UUID uuid, final BlockPos pos, final long output) {
    getOrCreateData(uuid).energyOutput.put(pos.immutable(), Math.max(0, output));
    setDirty();
  }

  public void removeEnergyOutput(final UUID uuid, final BlockPos pos) {
    getOrCreateData(uuid).energyOutput.remove(pos);
    setDirty();
  }

  public BigInteger getEnergyBuffered(final UUID uuid) {
    BigInteger sum = BigInteger.ZERO;

    for (final long value : getOrCreateData(uuid).energyBuffered.values()) {
      sum = sum.add(BigInteger.valueOf(value));
    }

    return sum;
  }

  public BigInteger getEnergyBufferedExceptLocal(final UUID uuid, final BlockPos localBufferPos) {
    BigInteger sum = BigInteger.ZERO;

    for (final Map.Entry<BlockPos, Long> entry : getOrCreateData(uuid).energyBuffered.entrySet()) {
      if (!entry.getKey().equals(localBufferPos)) {
        sum = sum.add(BigInteger.valueOf(entry.getValue()));
      }
    }

    return sum;
  }

  public void setEnergyBuffered(final UUID uuid, final BlockPos pos, final long buffered) {
    getOrCreateData(uuid).energyBuffered.put(pos.immutable(), Math.max(0, buffered));
    setDirty();
  }

  public void removeEnergyBuffered(final UUID uuid, final BlockPos pos) {
    getOrCreateData(uuid).energyBuffered.remove(pos);
    setDirty();
  }

  public long getPassiveDrain(final UUID uuid) {
    return sumLongValues(getOrCreateData(uuid).passiveDrain);
  }

  public void setPassiveDrain(final UUID uuid, final BlockPos pos, final long drain) {
    getOrCreateData(uuid).passiveDrain.put(pos.immutable(), Math.max(0, drain));
    setDirty();
  }

  public void removePassiveDrain(final UUID uuid, final BlockPos pos) {
    getOrCreateData(uuid).passiveDrain.remove(pos);
    setDirty();
  }

  public void clearWirelessEnergy(final UUID uuid) {
    globalWirelessEnergy.put(uuid, new WirelessEnergyData());
    setDirty();
  }

  public void clearGlobalWirelessEnergy() {
    globalWirelessEnergy.clear();
    setDirty();
  }

  private WirelessEnergyData getOrCreateData(final UUID uuid) {
    if (uuid == null) {
      throw new IllegalArgumentException("uuid cannot be null");
    }

    return globalWirelessEnergy.computeIfAbsent(uuid, key -> new WirelessEnergyData());
  }

  private static long sumLongValues(final Map<BlockPos, Long> values) {
    long sum = 0;

    for (final long value : values.values()) {
      sum += value;
    }

    return sum;
  }

  public static final class WirelessEnergyData {

    private BigInteger energyStored = BigInteger.ZERO;
    private BigInteger energyCapacity = BigInteger.ZERO;
    private boolean active;

    private final Map<BlockPos, Long> energyInput = new HashMap<>();
    private final Map<BlockPos, Long> energyOutput = new HashMap<>();
    private final Map<BlockPos, Long> energyBuffered = new HashMap<>();
    private final Map<BlockPos, Long> passiveDrain = new HashMap<>();

    private static WirelessEnergyData fromNBT(final CompoundTag tag) {
      final WirelessEnergyData data = new WirelessEnergyData();

      data.energyStored = readBigInteger(tag, "energyStored");
      data.energyCapacity = readBigInteger(tag, "energyCapacity");
      data.active = tag.getBoolean("isActive");

      return data;
    }

    private CompoundTag toNBT() {
      final CompoundTag tag = new CompoundTag();

      tag.putByteArray("energyStored", energyStored.toByteArray());
      tag.putByteArray("energyCapacity", energyCapacity.toByteArray());
      tag.putBoolean("isActive", active);

      return tag;
    }

    private static BigInteger readBigInteger(final CompoundTag tag, final String key) {
      if (!tag.contains(key)) {
        return BigInteger.ZERO;
      }

      return new BigInteger(tag.getByteArray(key));
    }
  }
}