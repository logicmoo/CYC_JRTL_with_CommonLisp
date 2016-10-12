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

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

//// External Imports
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class CatchableThrow extends RuntimeException implements CommonSymbols {

	//// Constructors

	public static void throwToCatch(SubLObject target) throws CatchableThrow {
		CatchableThrow.throwToCatch(target, CommonSymbols.NIL);
	}

	//// Public Area

	public static void throwToCatch(SubLObject target, SubLObject result) throws CatchableThrow {
		throw new CatchableThrow(target, result);
	}

	private SubLObject target;

	private SubLObject result;

	/** Creates a new instance of SubLThrow. */
	private CatchableThrow(SubLObject target, SubLObject result) {
		this.target = target;
		this.result = result;
	}

	public String getMessage() {
		return "Attempt to throw to the non-existent tag " + this.target;
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	public SubLObject getResult() {
		return this.result;
	}

	public SubLObject getTarget() {
		return this.target;
	}
}
