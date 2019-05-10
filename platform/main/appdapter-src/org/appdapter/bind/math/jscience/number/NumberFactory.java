package org.appdapter.bind.math.jscience.number;

import java.lang.reflect.Array;
import org.jscience.mathematics.number.Number;

public abstract class NumberFactory<RN extends Number<RN>>
{
    public abstract RN makeNumberFromDouble(final double p0);
    
    public RN makeNumberFromLong(final long lnum) {
        return this.makeNumberFromDouble(1.0 * lnum);
    }
    
    public RN makeNumberFromRatioOfLongs(final long numer, final long denom) {
        return this.makeNumberFromDouble(1.0 * numer / denom);
    }
    
    public RN getZero() {
        return this.makeNumberFromLong(0L);
    }
    
    public RN getOne() {
        return this.makeNumberFromLong(1L);
    }
    
    public RN getOneHalf() {
        return this.makeNumberFromRatioOfLongs(1L, 2L);
    }
    
    public abstract RN[] makeArray(final int p0);
    
    public static <SRN> SRN[] makeArrayForClass(final Class<SRN> type, final int size) {
        return (SRN[])Array.newInstance(type, size);
    }
}

/*

	Total time: 19 ms
	
*/