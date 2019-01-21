package org.appdapter.bind.math.jscience.calculus;

import org.appdapter.core.math.number.Numeric;
import java.math.BigDecimal;
import org.jscience.mathematics.number.Integer64;
import org.appdapter.core.math.number.IntegNumeric;
import org.jscience.mathematics.number.Integer64;

public class Integers
{
    public static class Int64 extends NumberWrapper<Int64, Integer64> implements IntegNumeric<NumberWrapper<Int64, Integer64>>
    {
        public Int64(final Integer64 jsciNum) {
            super((Integer64)jsciNum);
        }

        @Override
		public boolean isScalar() {
            return true;
        }

        @Override
		public boolean isZero() {
            return ((Integer64)this.getJScienceNumber()).equals((Object)Integer64.ZERO);
        }

        @Override
		public boolean isPositive() {
            return ((Integer64)this.getJScienceNumber()).isGreaterThan((Integer64)Integer64.ZERO);
        }

        @Override
		public boolean isNonnegative() {
            return ((Integer64)this.getJScienceNumber()).isLessThan((Integer64)Integer64.ZERO);
        }

        @Override
		public boolean isFinite() {
            return true;
        }

        @Override
		public Whole64 asNonnegative() {
            if (this instanceof Whole64) {
                return (Whole64)this;
            }
            if (this.isNonnegative()) {
                return new Whole64((Integer64)this.getJScienceNumber());
            }
            throw this.downcastFailureException((Class)Whole64.class);
        }

        @Override
		public Natural64 asPositive() {
            if (this instanceof Natural64) {
                return (Natural64)this;
            }
            if (this.isPositive()) {
                return new Natural64((Integer64)this.getJScienceNumber());
            }
            throw this.downcastFailureException((Class)Natural64.class);
        }

        @Override
		public Zero64 asZero() {
            if (this instanceof Zero64) {
                return (Zero64)this;
            }
            if (this.isZero()) {
                return new Zero64((Integer64)this.getJScienceNumber());
            }
            throw this.downcastFailureException((Class)Zero64.class);
        }

        @Override
		public Int64 asFinite() {
            return this;
        }

        @Override
		public Whole64 abs() {
            if (this.isNonnegative()) {
                return this.asNonnegative();
            }
            return new Whole64(((Integer64)this.getJScienceNumber()).abs());
        }

        @Override
		public Int64 copy() {
            return new Int64((Integer64)this.getJScienceNumber());
        }

        @Override
		public Int64 times(final NumberWrapper<Int64, Integer64> other) {
            return new Int64(((Integer64)this.getJScienceNumber()).times((Integer64)other.getJScienceNumber()));
        }

        @Override
		public Int64 plus(final NumberWrapper<Int64, Integer64> other) {
            return new Int64(((Integer64)this.getJScienceNumber()).plus((Integer64)other.getJScienceNumber()));
        }

        @Override
		public Int64 opposite() {
            return new Int64(((Integer64)this.getJScienceNumber()).opposite());
        }
    }

    public static class Whole64 extends Int64 implements IntegNumeric.Whole<NumberWrapper<Int64, Integer64>>
    {
        public Whole64(final Integer64 jsciNum) {
            super(jsciNum);
            if (!this.isNonnegative()) {
                this.downcastFailureException((Class)Whole64.class);
            }
        }
    }

    public static class Natural64 extends Whole64 implements IntegNumeric.Natural<NumberWrapper<Int64, Integer64>>
    {
        public static final Natural64 ONE;

        public Natural64(final Integer64 jsciNum) {
            super(jsciNum);
            if (!this.isPositive()) {
                this.downcastFailureException((Class)Natural64.class);
            }
        }

        static {
            ONE = new Natural64(Integer64.ONE);
        }
    }

    public static class Zero64 extends Whole64 implements IntegNumeric.Zero<NumberWrapper<Int64, Integer64>>
    {
        public static final Zero64 ZERO;

        public Zero64(final Integer64 jsciNum) {
            super(jsciNum);
            if (!this.isZero()) {
                this.downcastFailureException((Class)Zero64.class);
            }
        }

        static {
            ZERO = new Zero64(Integer64.ZERO);
        }
    }
}

/*

	Total time: 37 ms

*/