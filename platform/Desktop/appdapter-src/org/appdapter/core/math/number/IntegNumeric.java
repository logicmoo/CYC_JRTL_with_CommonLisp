package org.appdapter.core.math.number;

public interface IntegNumeric<IN> extends SeqNumeric.Finite<IN>
{
    public interface Zero<ZIN> extends Whole<ZIN>, Numeric.Zero<ZIN>
    {
    }
    
    public interface Whole<WIN> extends IntegNumeric<WIN>, SeqNumeric.Nonnegative<WIN>
    {
    }
    
    public interface Natural<NIN> extends Whole<NIN>, SeqNumeric.Positive<NIN>, SeqNumeric.Cardinal<NIN>, SeqNumeric.Ordinal<NIN>
    {
    }
}

/*

	Total time: 5 ms
	
*/