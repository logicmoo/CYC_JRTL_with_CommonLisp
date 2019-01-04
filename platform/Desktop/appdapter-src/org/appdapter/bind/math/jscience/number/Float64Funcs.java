package org.appdapter.bind.math.jscience.number;

import org.jscience.mathematics.number.Number;
import org.jscience.mathematics.number.Float64;

public class Float64Funcs
{
    public static Float64 makeFloat64(final double doubleValue) {
        return Float64.valueOf(doubleValue);
    }
    
    public static NumberFactory<Float64> getNumberFactory() {
        return new NumberFactory<Float64>() {
            public Float64 getZero() {
                return Float64.ZERO;
            }
            
            public Float64 getOne() {
                return Float64.ONE;
            }
            
            public Float64 getOneHalf() {
                return Float64.valueOf(0.5);
            }
            
            public Float64 makeNumberFromDouble(final double d) {
                return Float64Funcs.makeFloat64(d);
            }
            
            public Float64 makeNumberFromInt(final int i) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
            
            public Float64[] makeArray(final int size) {
                return (Float64[])makeArrayForClass((Class)Float64.class, size);
            }
        };
    }
}

/*

	Total time: 22 ms
	
*/