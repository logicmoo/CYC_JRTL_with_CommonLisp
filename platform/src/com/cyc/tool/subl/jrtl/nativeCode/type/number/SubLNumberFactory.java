/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.armedbear.lisp.Bignum;
import org.armedbear.lisp.DoubleFloat;
import org.armedbear.lisp.Fixnum;

public class SubLNumberFactory {
	private static SubLFixnum[] getCache(int value) {
		boolean negative = value < 0;
		int cacheNum = (negative ? Math.abs(value) - 1 : value) / SubLNumberFactory.CACHE_SHARD_SIZE;
		SubLFixnum[][] signedCache = negative ? SubLNumberFactory.negFixNumCache : SubLNumberFactory.posFixNumCache;
		SubLFixnum[] result = signedCache[cacheNum];
		return result == null ? (signedCache[cacheNum] = new SubLFixnum[SubLNumberFactory.CACHE_SHARD_SIZE]) : result;
	}

	private static int getCacheIndex(int value) {
		return (value < 0 ? Math.abs(value) - 1 : value) % SubLNumberFactory.CACHE_SHARD_SIZE;
	}

	private static int getFixNumBits() {
		String fixNumBitsStr = System.getProperty("FIX_NUM_BITS");
		int fixNumBits = FIX_NUM_BITS;
		if (fixNumBitsStr != null)
			try {
				fixNumBits = Integer.parseInt(fixNumBitsStr);
				if (fixNumBits < 16)
					fixNumBits = 16;
				if (fixNumBits > 32)
					fixNumBits = 32;
			} catch (Exception ex) {
			}
		return fixNumBits;
	}

	private static int getFixNumBitsToPreallocate() {
	        int fixNumBitsToPreallocate = FIX_NUM_BITS_TO_PREALLOCATE;
		String fixnumBitsToPreallocateStr = System.getProperty("FIX_NUM_BITS_TO_PREALLOCATE");
		if (fixnumBitsToPreallocateStr != null)
			try {
				fixNumBitsToPreallocate = Integer.parseInt(fixnumBitsToPreallocateStr);
				if (fixNumBitsToPreallocate < 8)
					fixNumBitsToPreallocate = 8;
				if (fixNumBitsToPreallocate > 31)
					fixNumBitsToPreallocate = 31;
				if (fixNumBitsToPreallocate > SubLNumberFactory.FIXNUM_BIT_SIZE)
					fixNumBitsToPreallocate = SubLNumberFactory.FIXNUM_BIT_SIZE;
			} catch (Exception ex) {
			}
		return fixNumBitsToPreallocate;
	}

	private static void precacheIntegerRange(int minNum, int maxNum) {
		for (int number = minNum; number <= maxNum; ++number)
			makeInteger(number);
	}

	public static String goodTimeEstimate(long millis) {
		long secs = Math.max(1L, millis / 1000L);
		if (secs <= 60L)
			return secs + "s";
		long mins = secs / 60L;
		long secs_rem = 1L + secs % 60L;
		if (mins <= 60L)
			return mins + "m " + secs_rem + "s";
		long hrs = mins / 60L;
		long mins_rem = 1L + mins % 60L;
		if (hrs > 24L) {
			long days = hrs / 24L;
			long hrs_rem = 1L + hrs % 24L;
			return days + "d " + hrs_rem + "h";
		}
		return hrs + "h " + mins_rem + "m";
	}

	public static SubLDoubleFloat makeDouble(double theDouble) {
		return new DoubleFloat(theDouble);
	}

	public static SubLDoubleFloat makeDouble(String theDouble) {
		return new DoubleFloat(new Double(theDouble.trim()));
	}

	public static SubLInteger makeInteger(BigInteger theBigInt) {
		if (theBigInt.compareTo(SubLNumberFactory.MAX_LONG_VALUE_BIGNUM) <= 0
				&& theBigInt.compareTo(SubLNumberFactory.MIN_LONG_VALUE_BIGNUM) >= 0)
			return makeInteger(theBigInt.longValue());
		return (SubLInteger) Bignum.getInstance(theBigInt);
	}
	public static SubLInteger makeInteger(int value) {
		if (SubLNumberFactory.MIN_FIXNUM <= value && value <= SubLNumberFactory.MAX_FIXNUM) {
			int cacheIndex = getCacheIndex(value);
			SubLFixnum[] cache = getCache(value);
			SubLInteger result = cache[cacheIndex];
			return result == null ? (cache[cacheIndex] = (SubLFixnum) Fixnum.getInstanceInternal(value)) : result;
		}
		return Fixnum.getInstanceInternal(value);
	}

	public static SubLInteger makeInteger(long theLong) {
		if (theLong <= Integer.MAX_VALUE && theLong >= Integer.MIN_VALUE)
			return makeInteger((int) theLong);
		return Bignum.getInstance(theLong);
	}

	public static SubLInteger makeInteger(String stringRep) {
		BigInteger theBigInt = new BigInteger(stringRep.trim());
		return makeInteger(theBigInt);
	}

	public static SubLInteger makeInteger(String stringRep, int radix) {
		BigInteger theBigInt = new BigInteger(stringRep.trim(), radix);
		return makeInteger(theBigInt);
	}

	public static SubLInteger makeSmallInteger(int value) {
		return getCache(value)[getCacheIndex(value)].toInteger();
	}

        public static int FIX_NUM_BITS_TO_PREALLOCATE = 8; // was 16
        public static int FIX_NUM_BITS = 26;

	private static BigInteger MAX_LONG_VALUE_BIGNUM;
	private static BigInteger MIN_LONG_VALUE_BIGNUM;
	public static int DEFAULT_FIXNUM_BIT_SIZE = 26;
	public static int MIN_FIXNUM_BIT_SIZE = 16;
	public static int MAX_FIXNUM_BIT_SIZE = 32;
	public static int FIXNUM_BIT_SIZE;
	public static int MAX_FIXNUM;
	public static int MIN_FIXNUM;
	public static int MIN_FIXNUM_BIT_SIZE_TO_PREALLOCATE = 8;
	public static int MAX_FIXNUM_BIT_SIZE_TO_PREALLOCATE = 31;
	public static int FIXNUM_BIT_SIZE_TO_PRECACHE;
	public static int MAX_FIXNUM_TO_PRECACHE;
	public static int MIN_FIXNUM_TO_PRECACHE;
	private static int defaultMaxFixnumToPrecache;
	private static int defaultMinFixnumToPrecache;
	public static int FIXNUM_MAGNITUDE_TO_PRECACHE;
	public static int CACHE_SHARD_SIZE;
	public static int NUM_CACHE_SHARDS;
	private static SubLFixnum[][] posFixNumCache;
	private static SubLFixnum[][] negFixNumCache;
	static {
		MAX_LONG_VALUE_BIGNUM = new BigInteger("9223372036854775807");
		MIN_LONG_VALUE_BIGNUM = new BigInteger("-9223372036854775808");
		FIXNUM_BIT_SIZE = getFixNumBits();
		MAX_FIXNUM = SubLNumberFactory.FIXNUM_BIT_SIZE == 32 ? Integer.MAX_VALUE
				: (int) Math.pow(2.0, SubLNumberFactory.FIXNUM_BIT_SIZE - 1) - 1;
		MIN_FIXNUM = SubLNumberFactory.FIXNUM_BIT_SIZE == 32 ? Integer.MIN_VALUE
				: (int) -Math.pow(2.0, SubLNumberFactory.FIXNUM_BIT_SIZE - 1);
		FIXNUM_BIT_SIZE_TO_PRECACHE = getFixNumBitsToPreallocate();
		MAX_FIXNUM_TO_PRECACHE = (int) Math.pow(2.0, SubLNumberFactory.FIXNUM_BIT_SIZE_TO_PRECACHE - 1) - 1;
		MIN_FIXNUM_TO_PRECACHE = (int) -Math.pow(2.0, SubLNumberFactory.FIXNUM_BIT_SIZE_TO_PRECACHE - 1);
		defaultMaxFixnumToPrecache = (int) Math.pow(2.0, 15.0) - 1;
		defaultMinFixnumToPrecache = (int) -Math.pow(2.0, 15.0);
		FIXNUM_MAGNITUDE_TO_PRECACHE = (int) Math.pow(2.0, SubLNumberFactory.FIXNUM_BIT_SIZE_TO_PRECACHE);
		CACHE_SHARD_SIZE = SubLNumberFactory.MAX_FIXNUM_TO_PRECACHE + 1;
		NUM_CACHE_SHARDS = (int) ((SubLNumberFactory.MAX_FIXNUM + 1L) / SubLNumberFactory.CACHE_SHARD_SIZE);
		posFixNumCache = new SubLFixnum[SubLNumberFactory.NUM_CACHE_SHARDS][];
		negFixNumCache = new SubLFixnum[SubLNumberFactory.NUM_CACHE_SHARDS][];
		if (SubLNumberFactory.FIXNUM_BIT_SIZE_TO_PRECACHE <= 16)
			precacheIntegerRange(SubLNumberFactory.MIN_FIXNUM_TO_PRECACHE, SubLNumberFactory.MAX_FIXNUM_TO_PRECACHE);
		else {
			long startMS = System.currentTimeMillis();
			precacheIntegerRange(SubLNumberFactory.defaultMinFixnumToPrecache,
					SubLNumberFactory.defaultMaxFixnumToPrecache);
			long stopMS = System.currentTimeMillis();
			int iterations = (int) Math.pow(2.0, SubLNumberFactory.FIXNUM_BIT_SIZE_TO_PRECACHE - 16);
			long estimatedDuration = (stopMS - startMS) * iterations;
			System.out.printf("Pre-allocating FIXNUM range [%d,%d] ... this should take %s.\n",
					SubLNumberFactory.MIN_FIXNUM_TO_PRECACHE, SubLNumberFactory.MAX_FIXNUM_TO_PRECACHE,
					goodTimeEstimate(estimatedDuration));
			precacheIntegerRange(SubLNumberFactory.defaultMaxFixnumToPrecache,
					SubLNumberFactory.MAX_FIXNUM_TO_PRECACHE);
			long trueEndMS = System.currentTimeMillis();
			System.out.printf("FIXNUM pre-allocation took %s.\n", goodTimeEstimate(trueEndMS - startMS));
		}
	}
	public static SubLBigDecimal makeDecimal(BigDecimal d) {
		return new SubLBigDecimal(d);
	}
}
