package org.appdapter.core.math.set;

import org.appdapter.core.math.number.IntegNumeric;
import org.appdapter.core.math.number.RealNumeric;

public interface RealSet<RN extends RealNumeric<? super RN>, MDRN extends RealNumeric.Nonnegative<? super MDRN>, DimN extends IntegNumeric.Natural<? super DimN>> extends EuclideanSet<RN, MDRN, MDRN, DimN>
{
    public abstract static class Basic<RN extends RealNumeric<? super RN>, MDRN extends RealNumeric.Nonnegative<? super MDRN>, DimN extends IntegNumeric.Natural<? super DimN>> extends EuclideanSet.Basic<RN, MDRN, DimN> implements RealSet<RN, MDRN, DimN>
    {
        public Basic(final DimN dim) {
            super(dim);
        }
    }
}

/*

	Total time: 5 ms

*/