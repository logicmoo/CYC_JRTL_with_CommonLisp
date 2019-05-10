package org.appdapter.core.math.number;

public interface RealNumeric<RN> extends ExtendedRealNumeric<RN>, Numeric.Finite<RN>
{
    public interface Positive<PRN> extends Nonnegative<PRN>, ExtendedRealNumeric.Positive<PRN>
    {
    }
    
    public interface Nonnegative<NNRN> extends RealNumeric<NNRN>, ExtendedRealNumeric.Nonnegative<NNRN>
    {
    }
}

/*

	Total time: 5 ms
	
*/