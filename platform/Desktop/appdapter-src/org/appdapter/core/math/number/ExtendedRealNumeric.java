package org.appdapter.core.math.number;

public interface ExtendedRealNumeric<ERN> extends Numeric.Scalar<ERN>, Numeric.Comparable<ERN>
{
    boolean isRealNumeric();
    
    RealNumeric<ERN> asRealNumeric();
    
    public interface Zero<ZERN> extends Nonnegative<ZERN>, Numeric.Zero<ZERN>
    {
    }
    
    public interface Nonnegative<NNERN> extends ExtendedRealNumeric<NNERN>, Numeric.Nonnegative<NNERN>
    {
    }
    
    public interface Infinite<IERN> extends ExtendedRealNumeric<IERN>, Numeric.Infinite<IERN>
    {
    }
    
    public interface Positive<PERN> extends Nonnegative<PERN>, Numeric.Positive<PERN>
    {
    }
}

/*

	Total time: 5 ms
	
*/