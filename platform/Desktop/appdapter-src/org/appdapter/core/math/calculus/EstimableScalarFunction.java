package org.appdapter.core.math.calculus;

import org.appdapter.core.math.number.Numeric;

public interface EstimableScalarFunction<DomainValue, RangeNumber extends Numeric.Scalar<RangeNumber>, PositiveRangeNumber extends Numeric.Positive<RangeNumber>>
{
    RangeNumber estimateValue(final DomainValue p0, final PositiveRangeNumber p1);
}

/*

	Total time: 4 ms
	
*/