package org.appdapter.core.math.set;

import org.appdapter.core.math.number.RealNumeric;

public interface MetricSet<V, Distance extends RealNumeric.Nonnegative<? super Distance>> extends TopologicalSet<V>
{
    Distance distanceForElementPair(final V p0, final V p1);
    
    boolean isComplete();
    
    boolean isBounded();
    
    boolean isTotallyBounded();
    
    public abstract static class Basic<V, D extends RealNumeric.Nonnegative<? super D>> implements MetricSet<V, D>
    {
        @Override
		public boolean isCompact() {
            return this.isClosed() && this.isTotallyBounded();
        }
    }
}

/*

	Total time: 6 ms
	
*/