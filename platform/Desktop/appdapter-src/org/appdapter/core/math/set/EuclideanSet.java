package org.appdapter.core.math.set;

import org.appdapter.core.math.number.SeqNumeric;
import org.appdapter.core.math.number.IntegNumeric;
import org.appdapter.core.math.number.RealNumeric;

public interface EuclideanSet<V, DistN extends RealNumeric.Nonnegative<? super DistN>, MeasN extends RealNumeric.Nonnegative<? super MeasN>, DimN extends IntegNumeric.Natural<? super DimN>> extends MetricSet<V, DistN>, MeasurableSet<V, MeasN>, DimensionalSet<V, DimN>
{
    DimN getDimension();
    
    public abstract static class Basic<V, MeasAndDistRN extends RealNumeric.Nonnegative<? super MeasAndDistRN>, DimN extends IntegNumeric.Natural<? super DimN>> extends MetricSet.Basic<V, MeasAndDistRN> implements EuclideanSet<V, MeasAndDistRN, MeasAndDistRN, DimN>
    {
        private DimN myDimension;
        
        public Basic(final DimN dim) {
            this.myDimension = dim;
        }
        
        public DimN getDimension() {
            return this.myDimension;
        }
    }
}

/*

	Total time: 7 ms
	
*/