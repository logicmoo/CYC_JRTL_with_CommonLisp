//
// For LarKC
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import java.util.Random;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class random extends SubLTrampolineFile {
	public static SubLObject random(SubLObject limit) {
		int randomInt = random.randomState.nextInt(limit.intValue());
		return SubLNumberFactory.makeInteger(randomInt);
	}

	public static SubLObject seed_random(SubLObject seed) {
		if (seed == CommonSymbols.UNPROVIDED)
			seed = SubLNil.NIL;
		if (seed == SubLNil.NIL)
			random.randomState.setSeed(Time.get_internal_real_time().longValue() % Long.MAX_VALUE);
		else
			random.randomState.setSeed(seed.longValue());
		return seed;
	}

	public static SubLFile me;
	public static SubLInteger RAND_MAX;
	public static SubLSymbol $rand_max$;
	private static Random randomState;
	static {
		me = new random();
		RAND_MAX = SubLNumberFactory.makeInteger(Integer.MAX_VALUE);
		randomState = new Random();
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(random.me, "random", "RANDOM", 1, 0, false);
		SubLFiles.declareFunction(random.me, "seed_random", "SEED-RANDOM", 0, 1, false);
	}

	@Override
	public void initializeVariables() {
		random.$rand_max$ = SubLFiles.defconstant(random.me, "*RAND-MAX*", random.RAND_MAX);
	}

	@Override
	public void runTopLevelForms() {
		random.randomState.setSeed(System.nanoTime());
	}
}
