package com.zircky.industrialsorcerygreg.utils;

import com.gregtechceu.gtceu.utils.codec.GTCodecUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.ints.Int2IntArrayMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.IntIntImmutablePair;
import it.unimi.dsi.fastutil.ints.IntIntPair;

import java.util.List;
import java.util.stream.Collectors;

public final class ISGCodecUtils {
  public static final Codec<IntIntPair> INT_INT_PAIR_CODEC = Codec.INT.listOf().comapFlatMap(
      integers -> integers.size() == 2 ?
          DataResult.success(new IntIntImmutablePair(integers.get(0), integers.get(1))) :
          DataResult.error(() -> "Invalid pair size."),
      pair -> List.of(pair.keyInt(), pair.valueInt()));

  public static final Codec<Int2IntMap> INT2INT_MAP_CODEC = INT_INT_PAIR_CODEC.listOf().xmap(
      pairs -> new Int2IntArrayMap(
          pairs.stream().collect(Collectors.toUnmodifiableMap(IntIntPair::keyInt, IntIntPair::valueInt))),
      map -> map.int2IntEntrySet().stream()
          .map(entry -> new IntIntImmutablePair(entry.getIntKey(), entry.getIntValue()))
          .collect(Collectors.toUnmodifiableList()));
}
