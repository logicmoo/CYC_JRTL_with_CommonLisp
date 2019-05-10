package org.appdapter.core.math.set;

import org.appdapter.core.math.number.SeqNumeric;

public interface DimensionalSet<V, DimN extends SeqNumeric.Nonnegative>
{
    DimN getDimension();
}

/*

	Total time: 4 ms
	
*/