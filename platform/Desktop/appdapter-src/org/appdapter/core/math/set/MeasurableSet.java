package org.appdapter.core.math.set;

import org.appdapter.core.math.number.ExtendedRealNumeric;

public interface MeasurableSet<V, MN extends ExtendedRealNumeric.Nonnegative<? super MN>> extends GeneralSet<V>
{
    MN measure();
}

/*

	Total time: 4 ms
	
*/