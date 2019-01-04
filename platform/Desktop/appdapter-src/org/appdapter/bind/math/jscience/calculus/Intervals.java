package org.appdapter.bind.math.jscience.calculus;

import org.appdapter.bind.math.jscience.calculus.Integers.Natural64;
import org.appdapter.core.math.number.IntegNumeric;
import org.appdapter.core.math.set.RealSet;
import org.slf4j.LoggerFactory;
import org.jscience.mathematics.number.Float64;
import org.appdapter.core.math.number.RealNumeric;
import org.slf4j.Logger;

public class Intervals
{
    static Logger theLogger;
    Reals.Real64 rrr;
    RealNumeric<? super Reals.Real64> r2;

    public Intervals() {
        this.rrr = new Reals.Real64(Float64.ONE);
        this.r2 = (RealNumeric<? super Reals.Real64>)this.rrr;
    }

    public static void main(final String[] args) {
        Intervals.theLogger.info("Hi!");
    }

    static {
        Intervals.theLogger = LoggerFactory.getLogger((Class)Intervals.class);
    }

    public abstract static class RealSet64 extends RealSet.Basic<Reals.Real64, Reals.NonnegativeReal64, Integers.Natural64>
    {
        public RealSet64(final Integers.Natural64 dim) {
            super((Natural64)dim);
        }
    }
}

/*

	Total time: 19 ms

*/