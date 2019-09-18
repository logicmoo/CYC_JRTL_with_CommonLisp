/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;

public class Sort extends SubLSystemTrampolineFile {
	public static SubLObject cmerge(SubLObject seq1, SubLObject seq2, SubLObject predicate, SubLObject key) {
		if (key == CommonSymbols.UNPROVIDED)
			key = CommonSymbols.IDENTITY;
		BinaryFunction predicateTyped = SubLSystemTrampolineFile.extractBinaryFunc(predicate);
		UnaryFunction keyTyped = SubLSystemTrampolineFile.extractUnaryFunc(key);
		return seq1.toSeq().merge(seq2.toSeq(), predicateTyped, keyTyped);
	}

	public static SubLObject sort(SubLObject sequence, SubLObject predicate) {
		return stable_sort(sequence, predicate);
	}

	public static SubLObject sort(SubLObject sequence, SubLObject predicate, SubLObject key) {
		return stable_sort(sequence, predicate, key);
	}

	public static SubLObject stable_sort(SubLObject sequence, SubLObject predicate) {
		SubLSequence sequenceTyped = sequence.toSeq();
		BinaryFunction predicateTyped = SubLSystemTrampolineFile.extractBinaryFunc(predicate);
		SubLObject result = sequenceTyped.sort(true, predicateTyped);
		return result;
	}

	public static SubLObject stable_sort(SubLObject sequence, SubLObject predicate, SubLObject key) {
		if (key == CommonSymbols.UNPROVIDED)
			key = CommonSymbols.IDENTITY;
		if (key == CommonSymbols.IDENTITY)
			return stable_sort(sequence, predicate);
		SubLSequence sequenceTyped = sequence.toSeq();
		BinaryFunction predicateTyped = SubLSystemTrampolineFile.extractBinaryFunc(predicate);
		UnaryFunction keyTyped = SubLSystemTrampolineFile.extractUnaryFunc(key);
		SubLObject result = sequenceTyped.sort(true, predicateTyped, keyTyped);
		return result;
	}

	public static SubLFile me;
	static {
		me = new Sort();
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(Sort.me, "sort", "SORT", 2, 1, false);
		SubLFiles.declareFunction(Sort.me, "stable_sort", "STABLE-SORT", 2, 1, false);
		SubLFiles.declareFunction(Sort.me, "cmerge", "CMERGE", 3, 1, false);
	}

	@Override
	public void initializeVariables() {
	}

	@Override
	public void runTopLevelForms() {
	}
}
