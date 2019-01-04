package org.appdapter.bind.math.jscience.number;

import org.jscience.mathematics.number.FieldNumber;

public interface WackyNumberFactory<FNT extends FieldNumber<FNT>> extends RingElementFactory<FNT>
{
    FNT getOneHalf();
    
    FNT makeFromDouble(final double p0);
    
    FNT makeFromInt(final int p0);
}

/*

	Total time: 4 ms
	
*/