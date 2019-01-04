package org.appdapter.bind.math.jscience.number;

import org.jscience.mathematics.structure.Ring;
import org.jscience.mathematics.number.FieldNumber;
import org.jscience.mathematics.number.Float64;

public class BucksumFloat64Funcs
{
    public static Float64 makeFloat64(final double doubleValue) {
        return Float64.valueOf(doubleValue);
    }
    
    public static FieldNumberFactory<Float64> getNumberFactory() {
        return (FieldNumberFactory<Float64>)new FieldNumberFactory<Float64>() {
            public Float64 getZero() {
                return Float64.ZERO;
            }
            
            public Float64 getOne() {
                return Float64.ONE;
            }
            
            public Float64 makeNumberFromDouble(final double d) {
                return BucksumFloat64Funcs.makeFloat64(d);
            }
            
            public Float64[] makeArray(final int size) {
                return (Float64[])GeneralFactory.makeArrayForClass((Class)Float64.class, size);
            }
            
            public Float64 makeNumberFromInt(final int i) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
    }
}

/*

	Total time: 23 ms
	
*/