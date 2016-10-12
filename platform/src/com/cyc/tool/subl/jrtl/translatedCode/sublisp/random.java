/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import java.util.Random;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// Internal Imports

//// External Imports

public class random extends SubLTrampolineFile {

	//// Constructors

	public static SubLFile me = new random();

	//// Public Area
	public static SubLInteger RAND_MAX = SubLNumberFactory.makeInteger(Integer.MAX_VALUE);

	public static SubLSymbol $rand_max$;
	private static Random randomState = new Random();

	public static SubLObject random(SubLObject limit) {
		int randomInt = random.randomState.nextInt(limit.intValue());
		return SubLNumberFactory.makeInteger(randomInt);
	}

	public static SubLObject seed_random(SubLObject seed) {
		if (seed == CommonSymbols.UNPROVIDED)
			seed = CommonSymbols.NIL;
		if (seed == CommonSymbols.NIL)
			random.randomState.setSeed(Time.get_internal_real_time().longValue() % Long.MAX_VALUE);
		else
			random.randomState.setSeed(seed.longValue());
		return seed;
	}

	//// Initializers

	/** Creates a new instance of random. */
	public random() {
	}

	public void declareFunctions() {
		SubLFiles.declareFunction(random.me, "random", "RANDOM", 1, 0, false);
		SubLFiles.declareFunction(random.me, "seed_random", "SEED-RANDOM", 0, 1, false);
	}

	public void initializeVariables() {
		random.$rand_max$ = SubLFiles.defconstant(random.me, "*RAND-MAX*", random.RAND_MAX);
	}

	//// Protected Area

	//// Private Area

	public void runTopLevelForms() {
		random.randomState.setSeed(System.currentTimeMillis());
	}

	//// Internal Rep

	//// Main

}
