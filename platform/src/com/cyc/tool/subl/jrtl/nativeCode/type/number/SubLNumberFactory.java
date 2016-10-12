/*
 * SubLNumberFactory.java
 *
 * Created on January 6, 2006, 2:22 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import java.math.BigInteger;

/**
 *
 * @author Tony Brusseau
 */
public class SubLNumberFactory {

	public static int FIXNUM_BIT_SIZE = 28;

	static {
		System.setProperty("FIX_NUM_BITS", "" + FIXNUM_BIT_SIZE);
	}
	private static BigInteger MAX_LONG_VALUE_BIGNUM = new BigInteger("" + Long.MAX_VALUE);

	private static BigInteger MIN_LONG_VALUE_BIGNUM = new BigInteger("" + Long.MIN_VALUE);


	public static int MAX_FIXNUM = (int) Math.pow(2, SubLNumberFactory.FIXNUM_BIT_SIZE - 1) - 1;

	public static int MIN_FIXNUM = (int) -Math.pow(2, SubLNumberFactory.FIXNUM_BIT_SIZE - 1);

	public static int FIXNUM_MAGNITUDE = (int) Math.pow(2, SubLNumberFactory.FIXNUM_BIT_SIZE);

	public static int FIXNUM_BIT_SIZE_TO_PRECACHE = 16;

	public static int MAX_FIXNUM_TO_PRECACHE = (int) Math.pow(2, SubLNumberFactory.FIXNUM_BIT_SIZE_TO_PRECACHE - 1) - 1;

	public static int MIN_FIXNUM_TO_PRECACHE = (int) -Math.pow(2, SubLNumberFactory.FIXNUM_BIT_SIZE_TO_PRECACHE - 1);

	public static int FIXNUM_MAGNITUDE_TO_PRECACHE = (int) Math.pow(2, SubLNumberFactory.FIXNUM_BIT_SIZE_TO_PRECACHE);
	private static SubLFixnum[] fixNumCache = new SubLFixnum[SubLNumberFactory.FIXNUM_MAGNITUDE];

	static {
		int i = SubLNumberFactory.FIXNUM_BIT_SIZE == SubLNumberFactory.FIXNUM_BIT_SIZE_TO_PRECACHE ? 0
				: (int) Math.pow(2, SubLNumberFactory.FIXNUM_BIT_SIZE - SubLNumberFactory.FIXNUM_BIT_SIZE_TO_PRECACHE);
		for (int start = SubLNumberFactory.MIN_FIXNUM_TO_PRECACHE, size = SubLNumberFactory.FIXNUM_MAGNITUDE_TO_PRECACHE; i < size; i++)
			SubLNumberFactory.fixNumCache[i] = new SubLFixnum(start++);
  //static
	}
/*
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
		int fixNumBits = 26;
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
		String fixnumBitsToPreallocateStr = System.getProperty("FIX_NUM_BITS_TO_PREALLOCATE");
		int fixNumBitsToPreallocate = 16;
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
*/
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
		return new SubLDoubleFloat(theDouble);
	}

	public static SubLDoubleFloat makeDouble(String theDouble) {
		return new SubLDoubleFloat(new Double(theDouble.trim()));
	}

	public static SubLInteger makeInteger(BigInteger theBigInt) {
		if (theBigInt.compareTo(SubLNumberFactory.MAX_LONG_VALUE_BIGNUM) <= 0
				&& theBigInt.compareTo(SubLNumberFactory.MIN_LONG_VALUE_BIGNUM) >= 0)
			return SubLNumberFactory.makeInteger(theBigInt.longValue());
		return new SubLBigIntBignum(theBigInt);
	}

	public static SubLInteger makeInteger(int value) {
		if (value <= SubLNumberFactory.MAX_FIXNUM) {
			int cacheIndex = value - SubLNumberFactory.MIN_FIXNUM;
			if (cacheIndex >= 0) {
				SubLInteger result = SubLNumberFactory.fixNumCache[cacheIndex];
				return result == null ? SubLNumberFactory.fixNumCache[cacheIndex] = new SubLFixnum(value) : result;
			}
		}
		return new SubLIntegerBignum(value);
	}

	public static SubLInteger makeInteger(long theLong) {
		if (theLong <= Integer.MAX_VALUE && theLong >= Integer.MIN_VALUE)
			return SubLNumberFactory.makeInteger((int) theLong);
		return new SubLLongBignum(theLong);
	}

	public static SubLInteger makeInteger(String stringRep) {
		BigInteger theBigInt = new BigInteger(stringRep.trim());
		return SubLNumberFactory.makeInteger(theBigInt);
	}

	public static SubLInteger makeInteger(String stringRep, int radix) {
		BigInteger theBigInt = new BigInteger(stringRep.trim(), radix);
		return SubLNumberFactory.makeInteger(theBigInt);
	}

	/**
	 * @warning this method bypasses checking, assuming the number given is
	 *          small enough so that it is guaranteed to be initialized at
	 *          startup.
	 */
	public static SubLInteger makeSmallInteger(int value) {
		return SubLNumberFactory.fixNumCache[value - SubLNumberFactory.MIN_FIXNUM];
	}

	/** Creates a new instance of SubLNumberFactory */
	private SubLNumberFactory() {
	}

	/*
	 * private static int MAX_INTEGER_CACHE_SIZE = 10000;f
	 *
	 * private static Map integerCache = new
	 * LinkedHashMap(MAX_INTEGER_CACHE_SIZE+1, .75F, true) { // This method is
	 * called just after a new entry has been added public boolean
	 * removeEldestEntry(Map.Entry eldest) { if (size() > MAX_BIGNUM_CACHE_SIZE)
	 * { ((SubLThread)Thread.currentThread()).getResourcer().
	 * releaseSubLIntegerBignum((SubLIntegerBignum)eldest.getKey()); return
	 * true; } return false; }
	 *
	 * };
	 *
	 * private static int MAX_BIGNUM_CACHE_SIZE = 10000;
	 *
	 * private static Map bigNumCache = new
	 * LinkedHashMap(MAX_BIGNUM_CACHE_SIZE+1, .75F, true) { // This method is
	 * called just after a new entry has been added public boolean
	 * removeEldestEntry(Map.Entry eldest) { return size() >
	 * MAX_BIGNUM_CACHE_SIZE; } };
	 */
}
