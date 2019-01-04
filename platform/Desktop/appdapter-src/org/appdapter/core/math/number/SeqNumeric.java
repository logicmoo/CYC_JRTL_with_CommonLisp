package org.appdapter.core.math.number;

public interface SeqNumeric<SN> extends Numeric.Scalar<SN>, Numeric.Comparable<SN>
{
    public interface Ordinal<OIN> extends Positive<OIN>
    {
    }
    
    public interface Positive<PIN> extends Nonnegative<PIN>, Numeric.Positive<PIN>
    {
    }
    
    public interface Nonnegative<NNSN> extends SeqNumeric<NNSN>, Numeric.Nonnegative<NNSN>
    {
    }
    
    public interface Cardinal<CIN> extends Positive<CIN>
    {
    }
    
    public interface Finite<FIN> extends SeqNumeric<FIN>, Numeric.Finite<FIN>
    {
    }
}

/*

	Total time: 4 ms
	
*/