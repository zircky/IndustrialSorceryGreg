package com.zircky.industrialsorcerygreg.api.util;

public class ISGUtility {
  public static double powInt(double base, int exp) {
    if (exp > 0) return powBySquaring(base, exp);
    if (exp < 0) return 1.0 / powBySquaring(base, -exp);
    return 1.0;
  }

  /**
   * Computes base raised to non-negative integer exponent.
   */
  private static double powBySquaring(double base, int exp) {
    // IEEE 754 double: 1 sign bit, 11 exponent bits, 52 mantissa bits. Exponent is stored with offset 1023.
    // The result is directly constructed for bases 2 and 4 from the exponent bits.
    if (base == 2) return exp > 1023 ? Double.POSITIVE_INFINITY : Double.longBitsToDouble(exp + 1023L << 52);
    if (base == 4) return exp > 511 ? Double.POSITIVE_INFINITY : Double.longBitsToDouble(exp * 2L + 1023L << 52);
    double result = 1.0;
    while (exp > 0) {
      if ((exp & 1) == 1) result *= base;
      base *= base;
      exp >>= 1;
    }
    return result;
  }

  /**
   * Computes base raised to the power of a long exponent. Typically faster than
   * {@link java.lang.Math#pow(double, double)} when {@code exp} is a long.
   */
  public static double powInt(double base, long exp) {
    if (exp > 0) return powBySquaring(base, exp);
    if (exp < 0) return 1.0 / powBySquaring(base, -exp);
    return 1.0;
  }

  private static double powBySquaring(double base, long exp) {
    // IEEE 754 double: 1 sign bit, 11 exponent bits, 52 mantissa bits. Exponent is stored with offset 1023.
    // The result is directly constructed for bases 2 and 4 from the exponent bits.
    if (base == 2) return exp > 1023 ? Double.POSITIVE_INFINITY : Double.longBitsToDouble(exp + 1023L << 52);
    if (base == 4) return exp > 511 ? Double.POSITIVE_INFINITY : Double.longBitsToDouble(exp * 2L + 1023L << 52);
    double result = 1.0;
    while (exp > 0) {
      if ((exp & 1) == 1) result *= base;
      base *= base;
      exp >>= 1;
    }
    return result;
  }
}
