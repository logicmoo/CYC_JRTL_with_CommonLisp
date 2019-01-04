package org.appdapter.bind.math.jscience.function;

public interface CompactlySupportedUF<DomainType, RangeType> extends UnivariateFunction<DomainType, RangeType>
{
    DomainType getSupportLowerBound();
    
    DomainType getSupportUpperBound();
}

/*

	Total time: 4 ms
	
*/