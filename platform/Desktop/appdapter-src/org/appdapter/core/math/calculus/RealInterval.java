package org.appdapter.core.math.calculus;

import org.appdapter.core.math.set.RealSet;
import org.appdapter.core.math.number.IntegNumeric;
import org.appdapter.core.math.number.RealNumeric;

public interface RealInterval<RN extends RealNumeric<? super RN>, MDRN extends RealNumeric.Nonnegative<? super MDRN>, DimN extends IntegNumeric.Natural<? super DimN>> extends RealSet<RN, MDRN, DimN>
{
    RN getLowerBound();

    RN getUpperBound();

    boolean isLowerBoundOpen();

    boolean isLowerBoundClosed();

    boolean isUpperBoundOpen();

    boolean isUpperBoundClosed();

    public abstract static class Basic<RN extends RealNumeric<RN>, MDRN extends RealNumeric.Nonnegative<MDRN>, DimN extends IntegNumeric.Natural<DimN>> extends RealSet.Basic<RN, MDRN, DimN> implements RealInterval<RN, MDRN, DimN>
    {
        public Basic(final DimN dim) {
            super((DimN)dim);
        }

        public boolean isLessThan(final RN a, final RN b) {
            return a.compareTo((RN)b) < 0;
        }

        public boolean isBelowLowerBound(final RN v) {
            return this.isLessThan(v, this.getLowerBound());
        }

        public boolean isAboveUpperBound(final RN v) {
            return this.isLessThan(this.getUpperBound(), v);
        }

        @Override
		public boolean containsElement(final RN v) {
            return !this.isBelowLowerBound(v) && !this.isAboveUpperBound(v);
        }
    }

    public abstract static class Maker<RN extends RealNumeric<RN>, MDRN extends RealNumeric.Nonnegative<MDRN>, DimN extends IntegNumeric.Natural<DimN>>
    {
        public abstract RealInterval<RN, MDRN, DimN> makeInterval(final RN p0, final boolean p1, final RN p2, final boolean p3);

        public RealInterval<RN, MDRN, DimN> makeClosedInterval(final RN lowBound, final RN highBound) {
            return this.makeInterval(lowBound, false, highBound, false);
        }

        public RealInterval<RN, MDRN, DimN> makeOpenInterval(final RN lowBound, final RN highBound) {
            return this.makeInterval(lowBound, true, highBound, true);
        }
    }
}

/*

	Total time: 12 ms

*/