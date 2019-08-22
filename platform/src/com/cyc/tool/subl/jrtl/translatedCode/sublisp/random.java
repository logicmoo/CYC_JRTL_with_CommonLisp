/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import java.util.Random;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;


public class random extends SubLTrampolineFile {
    public static SubLObject random(SubLObject limit) {
        int randomInt = randomState.nextInt(limit.intValue());
        return SubLNumberFactory.makeInteger(randomInt);
    }

    public static SubLObject seed_random(SubLObject seed) {
        if (seed == UNPROVIDED)
            seed = SubLNil.NIL;

        if (seed == SubLNil.NIL)
            randomState.setSeed(get_internal_real_time().longValue() % Long.MAX_VALUE);
        else
            randomState.setSeed(seed.longValue());

        return seed;
    }

    public static final SubLFile me = new random();

    // Public Area
    public static final SubLInteger RAND_MAX = SubLNumberFactory.makeInteger(Integer.MAX_VALUE);

    // defconstant
    public static final SubLSymbol $rand_max$ = makeSymbol("*RAND-MAX*");

    // Protected Area
    // Private Area
    private static final Random randomState = new Random();

    

    @Override
    public void declareFunctions() {
        declareFunction(me, "random", "RANDOM", 1, 0, false);
        declareFunction(me, "seed_random", "SEED-RANDOM", 0, 1, false);
    }

    @Override
    public void initializeVariables() {
        defconstant(me, "*RAND-MAX*", RAND_MAX);
    }

    @Override
    public void runTopLevelForms() {
        randomState.setSeed(System.nanoTime());
    }
}

