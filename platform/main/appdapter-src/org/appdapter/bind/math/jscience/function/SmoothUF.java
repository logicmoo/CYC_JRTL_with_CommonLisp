package org.appdapter.bind.math.jscience.function;

public interface SmoothUF<DomainType, RangeType> extends UnivariateFunction<DomainType, RangeType>
{
    RangeType getDerivativeAtInput(final DomainType p0, final int p1);
}

/*

	Total time: 4 ms
	
*/