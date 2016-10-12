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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLVector;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLCompiledFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// Internal Imports

//// External Imports

public class Functions extends SubLTrampolineFile {

	//// Constructors

	public static class SubLFuncallCountComaprator implements Comparator<SubLCompiledFunction.FuncallCounts> {
		private int arity = 0;

		public SubLFuncallCountComaprator(int arity) {
			this.arity = arity;
		}

		public int compare(SubLCompiledFunction.FuncallCounts o1, SubLCompiledFunction.FuncallCounts o2) {
			if (o1.counts[this.arity] == o2.counts[this.arity])
				return 0;
			return o1.counts[this.arity] < o2.counts[this.arity] ? 1 : -1;
		}

		public boolean equals(Object obj) {
			return obj == this;
		}
	}

	public static SubLFile me = new Functions();

	//// Public Area

	public static SubLSymbol $call_arguments_limit$;

	public static SubLVector hackVectorCache = null; // @hack

	public static SubLObject hackVectorList = null; // @hack

	public static SubLObject apply(SubLObject function, SubLObject arg) {
		if (function == CommonSymbols.VECTOR.getFunction()) { // @hack
			if (arg == CommonSymbols.NIL)
				return SubLVector.EMPTY_VECTOR;
			if (arg.toList().equal(Functions.hackVectorList))
				return Functions.hackVectorCache;
			Functions.hackVectorList = arg;
			return Functions.hackVectorCache = SubLObjectFactory.makeVector(arg.toList());
		}
		SubLObject arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8;
		SubLObject loopVar = arg;
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function);
		arg0 = loopVar.first();
		loopVar = loopVar.rest();
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0);
		arg1 = loopVar.first();
		loopVar = loopVar.rest();
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0, arg1);
		arg2 = loopVar.first();
		loopVar = loopVar.rest();
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0, arg1, arg2);
		arg3 = loopVar.first();
		loopVar = loopVar.rest();
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0, arg1, arg2, arg3);
		arg4 = loopVar.first();
		loopVar = loopVar.rest();
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0, arg1, arg2, arg3, arg4);
		arg5 = loopVar.first();
		loopVar = loopVar.rest();
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0, arg1, arg2, arg3, arg4, arg5);
		arg6 = loopVar.first();
		loopVar = loopVar.rest();
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		arg7 = loopVar.first();
		loopVar = loopVar.rest();
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		arg8 = loopVar.first();
		loopVar = loopVar.rest();
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		return Functions.apply(function, arg, Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
	}

	public static SubLObject apply(SubLObject function, SubLObject arg, SubLObject otherArgs) {
		SubLObject arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8;
		SubLObject loopVar = otherArgs;
		arg0 = arg;
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0);
		arg1 = loopVar.first();
		loopVar = loopVar.rest();
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0, arg1);
		arg2 = loopVar.first();
		loopVar = loopVar.rest();
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0, arg1, arg2);
		arg3 = loopVar.first();
		loopVar = loopVar.rest();
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0, arg1, arg2, arg3);
		arg4 = loopVar.first();
		loopVar = loopVar.rest();
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0, arg1, arg2, arg3, arg4);
		arg5 = loopVar.first();
		loopVar = loopVar.rest();
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0, arg1, arg2, arg3, arg4, arg5);
		arg6 = loopVar.first();
		loopVar = loopVar.rest();
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		arg7 = loopVar.first();
		loopVar = loopVar.rest();
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		arg8 = loopVar.first();
		loopVar = loopVar.rest();
		if (loopVar == CommonSymbols.NIL)
			return Functions.funcall(function, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		Resourcer resourcer = Resourcer.getInstance();
		SubLObject[] args = null;
		try {
			args = resourcer.acquireSubLObjectArray(1);
			args[0] = otherArgs;
			return Functions.apply(function, arg, args);
		} finally {
			resourcer.releaseSubLObjectArray(args);
		}
	}

	public static SubLObject apply(SubLObject function, SubLObject arg, SubLObject[] restArgs) {
		int restLength = restArgs.length;
		// @note this is somewhat inefficient we should investigate better ways
		// of implementing this -APB
		ArrayList<SubLObject> list = new ArrayList<SubLObject>(1 + restLength + 16);
		SubLObject lastList = arg;
		if (restLength > 0) {
			list.add(arg);
			for (int i = 0; i < restLength - 1; i++)
				list.add(restArgs[i]);
			lastList = restArgs[restLength - 1];
		}
		if (!lastList.isList())
			Errors.error("Invalid argument supplied to APPLY: " + arg + ".");
		Resourcer resourcer = Resourcer.getInstance();
		if (lastList != CommonSymbols.NIL) {
			SubLListListIterator iter = null;
			try {
				iter = resourcer.acquireSubLListListIterator(lastList.toList());
				while (iter.hasNext())
					list.add(iter.nextSubLObject());
			} finally {
				resourcer.releaseSubLListListIterator(iter);
			}
		}
		SubLObject[] args = null;
		try {
			args = resourcer.acquireSubLObjectArray(list.size());
			list.toArray(args);
			SubLObject result = Functions.funcall(function, args);
			return result;
		} finally {
			resourcer.releaseSubLObjectArray(args);
		}
	}

	public static SubLList arglist(SubLObject function) {
		SubLFunction functionTyped = function.getFunc();
		return functionTyped.getArglist();
	}

	public static SubLObject clear_funcall_stats() {
		return Errors.unimplementedMethod("CLEAR-FUNCALL-STATS");
	}

	public static SubLObject funcall(SubLObject function) {
		return ZeroArityFunction.makeInstance(function.getFunc()).processItem();
	}

	public static SubLObject funcall(SubLObject function, SubLObject arg1) {
		return UnaryFunction.makeInstance(function.getFunc()).processItem(arg1);
	}

	public static SubLObject funcall(SubLObject function, SubLObject arg1, SubLObject arg2) {
		return BinaryFunction.makeInstance(function.getFunc()).processItem(arg1, arg2);
	}

	public static SubLObject funcall(SubLObject function, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
		return TernaryFunction.makeInstance(function.getFunc()).processItem(arg1, arg2, arg3);
	}

	public static SubLObject funcall(SubLObject function, SubLObject arg1, SubLObject arg2, SubLObject arg3,
			SubLObject arg4) {
		return QuataryFunction.makeInstance(function.getFunc()).processItem(arg1, arg2, arg3, arg4);
	}

	public static SubLObject funcall(SubLObject function, SubLObject arg1, SubLObject arg2, SubLObject arg3,
			SubLObject arg4, SubLObject arg5) {
		return QuintaryFunction.makeInstance(function.getFunc()).processItem(arg1, arg2, arg3, arg4, arg5);
	}

	public static SubLObject funcall(SubLObject function, SubLObject arg1, SubLObject arg2, SubLObject arg3,
			SubLObject arg4, SubLObject arg5, SubLObject arg6) {
		Resourcer resourcer = Resourcer.getInstance();
		SubLObject[] args = null;
		try {
			args = resourcer.acquireSubLObjectArray(6);
			args[0] = arg1;
			args[1] = arg2;
			args[2] = arg3;
			args[3] = arg4;
			args[4] = arg5;
			args[5] = arg6;
			return Functions.funcall(function, args);
		} finally {
			resourcer.releaseSubLObjectArray(args);
		}
	}

	public static SubLObject funcall(SubLObject function, SubLObject arg1, SubLObject arg2, SubLObject arg3,
			SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7) {
		Resourcer resourcer = Resourcer.getInstance();
		SubLObject[] args = null;
		try {
			args = resourcer.acquireSubLObjectArray(7);
			args[0] = arg1;
			args[1] = arg2;
			args[2] = arg3;
			args[3] = arg4;
			args[4] = arg5;
			args[5] = arg6;
			args[6] = arg7;
			return Functions.funcall(function, args);
		} finally {
			resourcer.releaseSubLObjectArray(args);
		}
	}

	public static SubLObject funcall(SubLObject function, SubLObject arg1, SubLObject arg2, SubLObject arg3,
			SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8) {
		Resourcer resourcer = Resourcer.getInstance();
		SubLObject[] args = null;
		try {
			args = resourcer.acquireSubLObjectArray(8);
			args[0] = arg1;
			args[1] = arg2;
			args[2] = arg3;
			args[3] = arg4;
			args[4] = arg5;
			args[5] = arg6;
			args[6] = arg7;
			args[7] = arg8;
			return Functions.funcall(function, args);
		} finally {
			resourcer.releaseSubLObjectArray(args);
		}
	}

	public static SubLObject funcall(SubLObject function, SubLObject arg1, SubLObject arg2, SubLObject arg3,
			SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8, SubLObject arg9) {
		Resourcer resourcer = Resourcer.getInstance();
		SubLObject[] args = null;
		try {
			args = resourcer.acquireSubLObjectArray(9);
			args[0] = arg1;
			args[1] = arg2;
			args[2] = arg3;
			args[3] = arg4;
			args[4] = arg5;
			args[5] = arg6;
			args[6] = arg7;
			args[7] = arg8;
			args[8] = arg9;
			return Functions.funcall(function, args);
		} finally {
			resourcer.releaseSubLObjectArray(args);
		}
	}

	public static SubLObject funcall(SubLObject function, SubLObject[] args) {
		if (args.length < 6)
			switch (args.length) {
			case 0:
				return Functions.funcall(function);
			case 1:
				return Functions.funcall(function, args[0]);
			case 2:
				return Functions.funcall(function, args[0], args[1]);
			case 3:
				return Functions.funcall(function, args[0], args[1], args[2]);
			case 4:
				return Functions.funcall(function, args[0], args[1], args[2], args[3]);
			case 5:
				return Functions.funcall(function, args[0], args[1], args[2], args[3], args[4]);
			}
		return function.getFunc().funcall(args);
	}

	public static SubLObject funcall_stats(SubLObject minNumOfCalls) {
		if (minNumOfCalls == CommonSymbols.UNPROVIDED)
			minNumOfCalls = SubLNumberFactory.makeInteger(SubLCompiledFunction.MIN_FUNCALL_COUNTS_TO_CARE_ABOUT);
		if (!SubLCompiledFunction.SHOULD_MAINTAIN_FUNCALL_COUNTS) {
			System.out.println("Funcall stats are currently not being maintained.");
			return CommonSymbols.NIL;
		}
		ArrayList<SubLCompiledFunction.FuncallCounts> list = SubLCompiledFunction.funcallCountsArray;
		for (int i = 0, size = SubLCompiledFunction.MAX_ARITY_TO_MAINTAIN_COUNTS_FOR + 1; i < size; i++) {
			SubLCompiledFunction.FuncallCounts[] results = list
					.toArray(new SubLCompiledFunction.FuncallCounts[list.size()]);
			Arrays.sort(results, new SubLFuncallCountComaprator(i));
			boolean hasPrintHeader = false;
			for (int j = 0, size2 = results.length; j < size2; j++) {
				SubLCompiledFunction.FuncallCounts obj1 = results[j];
				if (obj1.counts[i] < minNumOfCalls.intValue())
					break;
				if (!hasPrintHeader) {
					System.out.println("******************************");
					System.out.println("FUNCALLS OF ARITY: " + i);
					hasPrintHeader = true;
				}
				System.out.println(obj1.getMethodName() + " " + obj1.counts[i]);
			}
		}
		return CommonSymbols.NIL;
	}

	public static SubLObject print_function(SubLObject function, SubLObject stream) {
		stream.toOutputTextStream().writeString(function.toString());
		return function;
	}

	/** Creates a new instance of Functions. */
	public Functions() {
	}

	//// Initializers

	public void declareFunctions() {
		SubLFiles.declareFunction(Functions.me, "funcall", "FUNCALL", 1, 0, true);
		SubLFiles.declareFunction(Functions.me, "apply", "APPLY", 2, 0, true);
		SubLFiles.declareFunction(Functions.me, "arglist", "ARGLIST", 1, 0, false);
		SubLFiles.declareFunction(Functions.me, "funcall_stats", "FUNCALL-STATS", 0, 1, false);
		SubLFiles.declareFunction(Functions.me, "clear_funcall_stats", "CLEAR_FUNCALL-STATS", 0, 0, false);
	}

	public void initializeVariables() {
		Functions.$call_arguments_limit$ = SubLFiles.defconstant(Functions.me, "CALL-ARGUMENTS-LIMIT",
				SubLObjectFactory.makeInteger(16384));
	}

	public void runTopLevelForms() {
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	//// Main

}
