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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// Internal Imports

//// External Imports

public class Sort extends SubLTrampolineFile {

	//// Constructors

	public static SubLFile me = new Sort();

	public static SubLObject cmerge(SubLObject seq1, SubLObject seq2, SubLObject predicate, SubLObject key) {
		if (key == CommonSymbols.UNPROVIDED)
			key = CommonSymbols.IDENTITY;
		BinaryFunction predicateTyped = SubLTrampolineFile.extractBinaryFunc(predicate);
		UnaryFunction keyTyped = SubLTrampolineFile.extractUnaryFunc(key);
		return seq1.toSeq().merge(seq2.toSeq(), predicateTyped, keyTyped);
	}

	//// Public Area

	public static SubLObject sort(SubLObject sequence, SubLObject predicate) {
		return Sort.stable_sort(sequence, predicate);
	}

	public static SubLObject sort(SubLObject sequence, SubLObject predicate, SubLObject key) {
		return Sort.stable_sort(sequence, predicate, key);
	}

	public static SubLObject stable_sort(SubLObject sequence, SubLObject predicate) {
		SubLSequence sequenceTyped = sequence.toSeq();
		BinaryFunction predicateTyped = SubLTrampolineFile.extractBinaryFunc(predicate);
		SubLObject result = sequenceTyped.sort(true, predicateTyped);
		return result;
	}

	public static SubLObject stable_sort(SubLObject sequence, SubLObject predicate, SubLObject key) {
		if (key == CommonSymbols.UNPROVIDED)
			key = CommonSymbols.IDENTITY;
		if (key == CommonSymbols.IDENTITY)
			return Sort.stable_sort(sequence, predicate);
		SubLSequence sequenceTyped = sequence.toSeq();
		BinaryFunction predicateTyped = SubLTrampolineFile.extractBinaryFunc(predicate);
		UnaryFunction keyTyped = SubLTrampolineFile.extractUnaryFunc(key);
		SubLObject result = sequenceTyped.sort(true, predicateTyped, keyTyped);
		return result;
	}

	/** Creates a new instance of Sort. */
	public Sort() {
	}

	//// Initializers

	public void declareFunctions() {
		SubLFiles.declareFunction(Sort.me, "sort", "SORT", 2, 1, false);
		SubLFiles.declareFunction(Sort.me, "stable_sort", "STABLE-SORT", 2, 1, false);
		SubLFiles.declareFunction(Sort.me, "cmerge", "CMERGE", 3, 1, false);
	}

	public void initializeVariables() {
	}

	public void runTopLevelForms() {
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	//// Main

}
