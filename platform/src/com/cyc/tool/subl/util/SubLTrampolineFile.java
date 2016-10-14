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

package com.cyc.tool.subl.util;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
//import com.cyc.tool.subl.jrtl.nativeCode.subLisp.DiskDumper;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
//// Internal Imports
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
//// External Imports
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class SubLTrampolineFile implements SubLFile, CommonSymbols {

	//// Constructors

	public static final boolean assertionsDisabledInClass = true;

	// @note This method violate the expectation that all functions return a
	// value.
	// This is purposefully done for efficiency.
	public static void checkType(SubLObject obj, SubLObject typeSymbol) {
		// obj.checkType(typeSymbol);
	}

	//// Public Area

	// @note This method violate the expectation that all functions return a
	// value.
	// This is purposefully done for efficiency.
	public static void enforceType(SubLObject obj, SubLSymbol predicate) {
		if (SubLNil.NIL == UnaryFunction.makeInstance(predicate).processItem(obj))
			Errors.error(SubLObjectFactory.makeString("Got invalid type for object: " + obj + "." + " Wanted type: "
					+ predicate + " Actual type: " + obj.toTypeName()));
	}

	public static BinaryFunction extractBinaryFunc(SubLObject func) {
		if (func == CommonSymbols.UNPROVIDED || func == CommonSymbols.NIL || func == CommonSymbols.EQL)
			return BinaryFunction.EQL_TEST;
		if (func == CommonSymbols.EQ)
			return BinaryFunction.EQ_TEST;
		if (func == CommonSymbols.EQUAL)
			return BinaryFunction.EQUAL_TEST;
		if (func == CommonSymbols.EQUALP)
			return BinaryFunction.EQUALP_TEST;
		return BinaryFunction.makeInstance(func.getFunc());
	}

	public static int extractCount(SubLObject count) {
		return count == CommonSymbols.UNPROVIDED || count == CommonSymbols.NIL ? SubLSequence.ALL_OCCURRENCES
				: count.intValue();
	}

	public static int extractEnd(SubLObject end) {
		return end == CommonSymbols.UNPROVIDED || end == CommonSymbols.NIL ? CommonSymbols.PROCESS_TO_END
				: end.intValue();
	}

	public static int extractEndUsingSize(SubLObject end, SubLObject seq) {
		return end == CommonSymbols.UNPROVIDED || end == CommonSymbols.NIL ? seq.size() : end.intValue();
	}

	public static SubLPackage extractPackage(SubLObject thePackage) {
		return thePackage == CommonSymbols.UNPROVIDED ? SubLPackage.getCurrentPackage() : thePackage.toPackage();
	}

	public static int extractStart(SubLObject start) {
		return start == CommonSymbols.UNPROVIDED ? 0 : start.intValue();
	}

	public static UnaryFunction extractUnaryFunc(SubLObject func) {
		return func == CommonSymbols.UNPROVIDED || func == CommonSymbols.NIL || func == CommonSymbols.IDENTITY
				? UnaryFunction.IDENTITY_UNARY_FUNC : UnaryFunction.makeInstance(func.getFunc());
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	//// Main

	/** Creates a new instance of SubLTrampolineFile. */
	public SubLTrampolineFile() {
		// DiskDumper.addStaticObject(this);
	}

}
