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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
//import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLIntegerBignum.MutableSubLIntegerBignum;
import java.util.*;
import java.math.*;

/**
 *
 * @author Tony Brusseau
 */
public final class SubLNumberFactory {
  
  /** Creates a new instance of SubLNumberFactory */
  private SubLNumberFactory() {}
  
  public static final SubLDoubleFloat makeDouble(String theDouble) {
    return new SubLDoubleFloat(new Double(theDouble.trim()));
  }
  
  public static final SubLDoubleFloat makeDouble(double theDouble) {
    return new SubLDoubleFloat(theDouble);
  }
  
  /** @warning this method bypasses checking, assuming the number given
      is small enough so that it is guaranteed to be initialized at startup. */
  public static final SubLInteger makeSmallInteger(int value) {
    return fixNumCache[value - MIN_FIXNUM];
  }
  
  public static final SubLInteger makeInteger(int value) {
    if (value <= MAX_FIXNUM) {
      int cacheIndex = value - MIN_FIXNUM;
      if (cacheIndex >= 0) {
        SubLInteger result = fixNumCache[cacheIndex];
        return (result == null) ? fixNumCache[cacheIndex] = new SubLFixnum(value) : result;
      }
    }
    return new SubLIntegerBignum(value);
  }
  
  public static final SubLInteger makeInteger(long theLong) {
    if ((theLong <= Integer.MAX_VALUE) && (theLong >= Integer.MIN_VALUE)) {
      return makeInteger((int)theLong);
    }
    return new SubLLongBignum(theLong);
  }
  
  public static final SubLInteger makeInteger(BigInteger theBigInt) {
    if ((theBigInt.compareTo(MAX_LONG_VALUE_BIGNUM) <= 0) && 
        (theBigInt.compareTo(MIN_LONG_VALUE_BIGNUM) >= 0)){
      return makeInteger(theBigInt.longValue());
    } 
    return new SubLBigIntBignum(theBigInt);
  }
  
  public static final SubLInteger makeInteger(String stringRep) {
    BigInteger theBigInt = new BigInteger(stringRep.trim());
    return makeInteger(theBigInt);
  }
  
  public static final SubLInteger makeInteger(String stringRep, int radix) {
    BigInteger theBigInt = new BigInteger(stringRep.trim(), radix);
    return makeInteger(theBigInt);
  }
  
  private static final BigInteger MAX_LONG_VALUE_BIGNUM = new BigInteger(""+Long.MAX_VALUE);
  private static final BigInteger MIN_LONG_VALUE_BIGNUM = new BigInteger(""+Long.MIN_VALUE);
  
  
  
  public static final int FIXNUM_BIT_SIZE = 24;
  
  public static final int MAX_FIXNUM = (int)Math.pow(2, FIXNUM_BIT_SIZE - 1) - 1;
  
  public static final int MIN_FIXNUM = (int)-Math.pow(2, FIXNUM_BIT_SIZE - 1);
  
  public static final int FIXNUM_MAGNITUDE = (int)Math.pow(2, FIXNUM_BIT_SIZE);
  
  
  
  public static final int FIXNUM_BIT_SIZE_TO_PRECACHE = 16;
  
  public static final int MAX_FIXNUM_TO_PRECACHE = (int)Math.pow(2, FIXNUM_BIT_SIZE_TO_PRECACHE - 1) - 1;
  
  public static final int MIN_FIXNUM_TO_PRECACHE = (int)-Math.pow(2, FIXNUM_BIT_SIZE_TO_PRECACHE - 1);
  
  public static final int FIXNUM_MAGNITUDE_TO_PRECACHE = (int)Math.pow(2, FIXNUM_BIT_SIZE_TO_PRECACHE);
  
  private static final SubLFixnum[] fixNumCache = new SubLFixnum[FIXNUM_MAGNITUDE];
  
  static {
    int i = (FIXNUM_BIT_SIZE == FIXNUM_BIT_SIZE_TO_PRECACHE) ? 0 : (int)Math.pow(2, FIXNUM_BIT_SIZE - FIXNUM_BIT_SIZE_TO_PRECACHE);
    for (int start = MIN_FIXNUM_TO_PRECACHE, size = FIXNUM_MAGNITUDE_TO_PRECACHE; i < size; i++) {
      fixNumCache[i] = new SubLFixnum(start++);
    }
  }
  
  /*private static int MAX_INTEGER_CACHE_SIZE = 10000;
   
  private static Map integerCache = new LinkedHashMap(MAX_INTEGER_CACHE_SIZE+1, .75F, true) {
    // This method is called just after a new entry has been added
    public boolean removeEldestEntry(Map.Entry eldest) {
      if (size() > MAX_BIGNUM_CACHE_SIZE) {
        ((SubLThread)Thread.currentThread()).getResourcer().
          releaseSubLIntegerBignum((SubLIntegerBignum)eldest.getKey());
        return true;
      }
      return false;
    }
   
  };
   
  private static int MAX_BIGNUM_CACHE_SIZE = 10000;
   
  private static Map bigNumCache = new LinkedHashMap(MAX_BIGNUM_CACHE_SIZE+1, .75F, true) {
    // This method is called just after a new entry has been added
    public boolean removeEldestEntry(Map.Entry eldest) {
      return size() > MAX_BIGNUM_CACHE_SIZE;
    }
  };*/
}
