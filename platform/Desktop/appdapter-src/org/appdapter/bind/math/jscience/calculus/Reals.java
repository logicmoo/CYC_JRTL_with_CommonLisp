package org.appdapter.bind.math.jscience.calculus;

import org.jscience.mathematics.number.Number;
import java.math.BigDecimal;
import org.appdapter.core.math.number.Numeric;
import org.jscience.mathematics.number.FieldNumber;
import org.appdapter.core.math.number.RealNumeric;
import org.jscience.mathematics.number.Float64;

public class Reals
{
    public static class Real64 extends FieldNumberWrapper<Real64, Float64> implements RealNumeric<FieldNumberWrapper<Real64, Float64>>
    {
        public Real64(final Float64 jsciNum) {
            super(jsciNum);
        }

        @Override
		public FieldNumberWrapper<Real64, Float64> abs() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
		public FieldNumberWrapper<Real64, Float64> copy() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
		public FieldNumberWrapper<Real64, Float64> times(final FieldNumberWrapper<Real64, Float64> r) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
		public FieldNumberWrapper<Real64, Float64> plus(final FieldNumberWrapper<Real64, Float64> g) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
		public FieldNumberWrapper<Real64, Float64> opposite() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
		public FieldNumberWrapper<Real64, Float64> inverse() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
		public boolean isScalar() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
		public boolean isZero() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
		public boolean isPositive() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
		public boolean isNonnegative() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
		public boolean isFinite() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
		public NonnegativeReal64 asNonnegative() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
		public PositiveReal64 asPositive() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
		public Numeric.Zero<FieldNumberWrapper<Real64, Float64>> asZero() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
		public Numeric.Finite<FieldNumberWrapper<Real64, Float64>> asFinite() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
		public boolean isRealNumeric() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
		public Real64 asRealNumeric() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    public static class NonnegativeReal64 extends Real64 implements RealNumeric.Nonnegative<FieldNumberWrapper<Real64, Float64>>
    {
        public NonnegativeReal64(final Float64 jsciNum) {
            super(jsciNum);
            if (!this.isNonnegative()) {
                this.downcastFailureException((Class)NonnegativeReal64.class);
            }
        }
    }

    public static class PositiveReal64 extends NonnegativeReal64 implements RealNumeric.Positive<FieldNumberWrapper<Real64, Float64>>
    {
        public PositiveReal64(final Float64 jsciNum) {
            super(jsciNum);
            if (!this.isPositive()) {
                this.downcastFailureException((Class)PositiveReal64.class);
            }
        }
    }
}

/*

	Total time: 33 ms

*/