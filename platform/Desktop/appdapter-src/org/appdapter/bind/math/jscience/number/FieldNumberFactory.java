package org.appdapter.bind.math.jscience.number;

import org.jscience.mathematics.number.FieldNumber;

public interface FieldNumberFactory<FN extends FieldNumber<FN>> extends RingElementFactory<FN>
{
    FN makeNumberFromDouble(final double p0);
    
    FN makeNumberFromInt(final int p0);
}

/*

	Total time: 4 ms
	
*/