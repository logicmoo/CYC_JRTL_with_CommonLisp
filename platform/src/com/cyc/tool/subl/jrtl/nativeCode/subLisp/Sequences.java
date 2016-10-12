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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// Internal Imports

//// External Imports

public class Sequences extends SubLTrampolineFile {

	//// Constructors

	public static SubLFile me = new Sequences();

	public static SubLObject cconcatenate(SubLObject sequence1, SubLObject sequence2) {
		SubLSequence sequence1Typed = sequence1.toSeq();
		SubLSequence sequence2Typed = sequence2.toSeq();
		SubLObject result = sequence1Typed.concatenate(sequence2Typed);
		return result;
	}

	//// Public Area

	public static SubLObject cconcatenate(SubLObject sequence, SubLObject[] moreSequences) {
		SubLSequence sequenceTyped = sequence.toSeq();
		if (moreSequences.length == 0)
			return (SubLObject) sequenceTyped.clone();
		if (moreSequences.length == 1)
			return Sequences.cconcatenate(sequence, moreSequences[0]);
		SubLObject result = sequenceTyped.concatenate(moreSequences);
		return result;
	}

	public static SubLObject copy_seq(SubLObject sequence) {
		return sequence.makeCopy().toSeq();
	}

	public static SubLObject count(SubLObject item, SubLObject sequence, SubLObject test, SubLObject key,
			SubLObject start, SubLObject end) {
		SubLSequence sequenceTyped = sequence.toSeq();
		BinaryFunction testFunction = SubLTrampolineFile.extractBinaryFunc(test);
		UnaryFunction keyFunction = SubLTrampolineFile.extractUnaryFunc(key);
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		int result = sequenceTyped.count(item, testFunction, keyFunction, startTyped, endTyped);
		return result == SubLSequence.NOT_FOUND ? (SubLObject) CommonSymbols.NIL
				: SubLNumberFactory.makeInteger(result);
	}

	public static SubLObject count_if(SubLObject test, SubLObject sequence, SubLObject key, SubLObject start,
			SubLObject end) {
		SubLSequence sequenceTyped = sequence.toSeq();
		UnaryFunction testFunction = SubLTrampolineFile.extractUnaryFunc(test);
		UnaryFunction keyFunction = SubLTrampolineFile.extractUnaryFunc(key);
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		int result = sequenceTyped.countIf(testFunction, keyFunction, startTyped, endTyped);
		if (result == SubLSequence.NOT_FOUND)
			return CommonSymbols.NIL;
		return SubLNumberFactory.makeInteger(result);
	}

	public static SubLObject creduce(SubLObject function, SubLObject sequence, SubLObject start, SubLObject end,
			SubLObject initValue) {
		SubLSequence sequenceTyped = sequence.toSeq();
		if (initValue == CommonSymbols.UNPROVIDED)
			initValue = SubLSequence.NO_INIT_VALUE;
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		BinaryFunction testFunction = SubLTrampolineFile.extractBinaryFunc(function);
		SubLObject result = sequenceTyped.reduce(testFunction, startTyped, endTyped, initValue);
		return result;
	}

	public static SubLObject delete(SubLObject item, SubLObject sequence, SubLObject test, SubLObject key,
			SubLObject start, SubLObject end, SubLObject count) {
		SubLSequence sequenceTyped = sequence.toSeq();
		BinaryFunction testFunction = SubLTrampolineFile.extractBinaryFunc(test);
		UnaryFunction keyFunction = SubLTrampolineFile.extractUnaryFunc(key);
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		int countTyped = SubLTrampolineFile.extractCount(count);
		SubLObject result = sequenceTyped.remove(item, true, testFunction, keyFunction, startTyped, endTyped,
				countTyped);
		return result;
	}

	public static SubLObject delete_duplicates(SubLObject sequence, SubLObject test, SubLObject key, SubLObject start,
			SubLObject end) {
		SubLSequence sequenceTyped = sequence.toSeq();
		BinaryFunction testFunction = SubLTrampolineFile.extractBinaryFunc(test);
		UnaryFunction keyFunction = SubLTrampolineFile.extractUnaryFunc(key);
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		SubLSequence result = sequenceTyped.removeDuplicates(true, testFunction, keyFunction, startTyped, endTyped);
		return result;
	}

	public static SubLObject delete_if(SubLObject test, SubLObject sequence, SubLObject key, SubLObject start,
			SubLObject end, SubLObject count) {
		SubLSequence sequenceTyped = sequence.toSeq();
		UnaryFunction testFunction = SubLTrampolineFile.extractUnaryFunc(test);
		UnaryFunction keyFunction = SubLTrampolineFile.extractUnaryFunc(key);
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		int countTyped = SubLTrampolineFile.extractCount(count);
		SubLSequence result = sequenceTyped.removeIf(testFunction, true, keyFunction, startTyped, endTyped, countTyped);
		return result;
	}

	public static SubLObject elt(SubLObject sequence, SubLObject index) {
		return sequence.get(index.intValue());
	}

	public static SubLObject fill(SubLObject sequence, SubLObject item, SubLObject start, SubLObject end) {
		SubLSequence sequenceTyped = sequence.toSeq();
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		sequenceTyped.fill(item, startTyped, endTyped);
		return sequenceTyped;
	}

	public static SubLObject find(SubLObject item, SubLObject sequence, SubLObject test, SubLObject key,
			SubLObject start, SubLObject end) {
		SubLSequence sequenceTyped = sequence.toSeq();
		BinaryFunction testFunction = SubLTrampolineFile.extractBinaryFunc(test);
		UnaryFunction keyFunction = SubLTrampolineFile.extractUnaryFunc(key);
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		SubLObject result = sequenceTyped.find(item, testFunction, keyFunction, startTyped, endTyped);
		return result;
	}

	public static SubLObject find_if(SubLObject test, SubLObject sequence, SubLObject key, SubLObject start,
			SubLObject end) {
		SubLSequence sequenceTyped = sequence.toSeq();
		UnaryFunction testFunction = SubLTrampolineFile.extractUnaryFunc(test);
		UnaryFunction keyFunction = SubLTrampolineFile.extractUnaryFunc(key);
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		SubLObject result = sequenceTyped.findIf(testFunction, keyFunction, startTyped, endTyped);
		return result;
	}

	public static SubLObject length(SubLObject sequence) {
		return SubLNumberFactory.makeInteger(sequence.size());
	}

	public static SubLObject length_with_cutoff(SubLObject sequence, SubLObject max) {
		return SubLNumberFactory.makeInteger(sequence.size(max.intValue()));
	}

	public static SubLObject mismatch(SubLObject sequence1, SubLObject sequence2, SubLObject test, SubLObject key,
			SubLObject start1, SubLObject end1, SubLObject start2, SubLObject end2) {
		SubLSequence sequence1Typed = sequence1.toSeq();
		SubLSequence sequence2Typed = sequence2.toSeq();
		int start1Typed = SubLTrampolineFile.extractStart(start1);
		int end1Typed = SubLTrampolineFile.extractEnd(end1);
		int start2Typed = SubLTrampolineFile.extractStart(start2);
		int end2Typed = SubLTrampolineFile.extractEnd(end2);
		BinaryFunction testFunction = SubLTrampolineFile.extractBinaryFunc(test);
		UnaryFunction keyFunction = SubLTrampolineFile.extractUnaryFunc(key);
		int result = sequence1Typed.indexOfMismatch(sequence2Typed, testFunction, keyFunction, start1Typed, end1Typed,
				start2Typed, end2Typed);
		if (result == SubLSequence.MATCH_EVERYWHERE)
			return CommonSymbols.NIL;
		return SubLNumberFactory.makeInteger(result);
	}

	public static SubLObject nreverse(SubLObject sequence) {
		return sequence.reverse(true);
	}

	public static SubLObject nsubstitute(SubLObject newItem, SubLObject oldItem, SubLObject sequence, SubLObject test,
			SubLObject key, SubLObject start, SubLObject end, SubLObject count) {
		SubLSequence sequenceTyped = sequence.toSeq();
		BinaryFunction testFunction = SubLTrampolineFile.extractBinaryFunc(test);
		UnaryFunction keyFunction = SubLTrampolineFile.extractUnaryFunc(key);
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		int countTyped = SubLTrampolineFile.extractCount(count);
		SubLSequence result = sequenceTyped.substitute(newItem, oldItem, true, testFunction, keyFunction, startTyped,
				endTyped, countTyped);
		return result;
	}

	public static SubLObject nsubstitute_if(SubLObject newItem, SubLObject test, SubLObject sequence, SubLObject key,
			SubLObject start, SubLObject end, SubLObject count) {
		SubLSequence sequenceTyped = sequence.toSeq();
		UnaryFunction testFunction = SubLTrampolineFile.extractUnaryFunc(test);
		UnaryFunction keyFunction = SubLTrampolineFile.extractUnaryFunc(key);
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		int countTyped = SubLTrampolineFile.extractCount(count);
		SubLSequence result = sequenceTyped.substituteIf(newItem, testFunction, true, keyFunction, startTyped, endTyped,
				countTyped);
		return result;
	}

	public static SubLObject position(SubLObject item, SubLObject sequence, SubLObject test, SubLObject key,
			SubLObject start, SubLObject end) {
		if (sequence == CommonSymbols.NIL)
			return CommonSymbols.NIL;
		SubLSequence sequenceTyped = sequence.toSeq();
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		BinaryFunction testBFF = SubLTrampolineFile.extractBinaryFunc(test);
		UnaryFunction keyUF = SubLTrampolineFile.extractUnaryFunc(key);
		int result = sequenceTyped.positionOf(item, testBFF, keyUF, startTyped, endTyped);
		if (result == SubLSequence.NOT_FOUND)
			return CommonSymbols.NIL;
		return SubLNumberFactory.makeInteger(result);
	}

	public static SubLObject position_if(SubLObject test, SubLObject sequence, SubLObject key, SubLObject start,
			SubLObject end) {
		if (sequence == CommonSymbols.NIL)
			return CommonSymbols.NIL;
		SubLSequence sequenceTyped = sequence.toSeq();
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		UnaryFunction testBFF = SubLTrampolineFile.extractUnaryFunc(test);
		UnaryFunction keyUF = SubLTrampolineFile.extractUnaryFunc(key);
		int result = sequenceTyped.positionOfIf(testBFF, keyUF, startTyped, endTyped);
		if (result == SubLSequence.NOT_FOUND)
			return CommonSymbols.NIL;
		return SubLNumberFactory.makeInteger(result);
	}

	public static SubLObject remove(SubLObject item, SubLObject sequence, SubLObject test, SubLObject key,
			SubLObject start, SubLObject end, SubLObject count) {
		SubLSequence sequenceTyped = sequence.toSeq();
		BinaryFunction testFunction = SubLTrampolineFile.extractBinaryFunc(test);
		UnaryFunction keyFunction = SubLTrampolineFile.extractUnaryFunc(key);
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		int countTyped = SubLTrampolineFile.extractCount(count);
		return sequenceTyped.remove(item, false, testFunction, keyFunction, startTyped, endTyped, countTyped);
	}

	public static SubLObject remove_duplicates(SubLObject sequence, SubLObject test, SubLObject key, SubLObject start,
			SubLObject end) {
		SubLSequence sequenceTyped = sequence.toSeq();
		BinaryFunction testFunction = SubLTrampolineFile.extractBinaryFunc(test);
		UnaryFunction keyFunction = SubLTrampolineFile.extractUnaryFunc(key);
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		SubLSequence result = sequenceTyped.removeDuplicates(false, testFunction, keyFunction, startTyped, endTyped);
		return result;
	}

	public static SubLObject remove_if(SubLObject test, SubLObject sequence, SubLObject key, SubLObject start,
			SubLObject end, SubLObject count) {
		SubLSequence sequenceTyped = sequence.toSeq();
		UnaryFunction testFunction = SubLTrampolineFile.extractUnaryFunc(test);
		UnaryFunction keyFunction = SubLTrampolineFile.extractUnaryFunc(key);
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		int countTyped = SubLTrampolineFile.extractCount(count);
		SubLSequence result = sequenceTyped.removeIf(testFunction, false, keyFunction, startTyped, endTyped,
				countTyped);
		return result;
	}

	public static SubLObject replace(SubLObject sequence1, SubLObject sequence2, SubLObject start1, SubLObject end1,
			SubLObject start2, SubLObject end2) {
		SubLSequence sequence1Typed = sequence1.toSeq();
		SubLSequence sequence2Typed = sequence2.toSeq();
		int start1Typed = SubLTrampolineFile.extractStart(start1);
		int end1Typed = SubLTrampolineFile.extractEnd(end1);
		int start2Typed = SubLTrampolineFile.extractStart(start2);
		int end2Typed = SubLTrampolineFile.extractEnd(end2);
		SubLObject result = sequence1Typed.replace(sequence2Typed, start1Typed, end1Typed, start2Typed, end2Typed);
		return result;
	}

	public static SubLObject reverse(SubLObject sequence) {
		return sequence.reverse(false);
	}

	public static SubLObject search(SubLObject sequence1, SubLObject sequence2, SubLObject test, SubLObject key,
			SubLObject start1, SubLObject end1, SubLObject start2, SubLObject end2) {
		SubLSequence sequence1Typed = sequence1.toSeq();
		SubLSequence sequence2Typed = sequence2.toSeq();
		int start1Typed = SubLTrampolineFile.extractStart(start1);
		int end1Typed = SubLTrampolineFile.extractEnd(end1);
		int start2Typed = SubLTrampolineFile.extractStart(start2);
		int end2Typed = SubLTrampolineFile.extractEnd(end2);
		BinaryFunction testBFF = SubLTrampolineFile.extractBinaryFunc(test);
		UnaryFunction keyUF = SubLTrampolineFile.extractUnaryFunc(key);
		int result = sequence1Typed.search(sequence2Typed, testBFF, keyUF, start1Typed, end1Typed, start2Typed,
				end2Typed);
		if (result == SubLSequence.NOT_FOUND)
			return CommonSymbols.NIL;
		return SubLNumberFactory.makeInteger(result);
	}

	public static SubLObject subseq(SubLObject sequence, SubLObject start, SubLObject end) {
		SubLSequence sequenceTyped = sequence.toSeq();
		int endTyped = SubLTrampolineFile.extractEnd(end);
		int startTyped = SubLTrampolineFile.extractStart(start);
		SubLObject result = sequenceTyped.subSeq(startTyped, endTyped);
		return result;
	}

	public static SubLObject substitute(SubLObject newItem, SubLObject oldItem, SubLObject sequence, SubLObject test,
			SubLObject key, SubLObject start, SubLObject end, SubLObject count) {
		SubLSequence sequenceTyped = sequence.toSeq();
		BinaryFunction testFunction = SubLTrampolineFile.extractBinaryFunc(test);
		UnaryFunction keyFunction = SubLTrampolineFile.extractUnaryFunc(key);
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		int countTyped = SubLTrampolineFile.extractCount(count);
		SubLSequence result = sequenceTyped.substitute(newItem, oldItem, false, testFunction, keyFunction, startTyped,
				endTyped, countTyped);
		return result;
	}

	public static SubLObject substitute_if(SubLObject newItem, SubLObject test, SubLObject sequence, SubLObject key,
			SubLObject start, SubLObject end, SubLObject count) {
		SubLSequence sequenceTyped = sequence.toSeq();
		UnaryFunction testFunction = SubLTrampolineFile.extractUnaryFunc(test);
		UnaryFunction keyFunction = SubLTrampolineFile.extractUnaryFunc(key);
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		int countTyped = SubLTrampolineFile.extractCount(count);
		SubLSequence result = sequenceTyped.substituteIf(newItem, testFunction, false, keyFunction, startTyped,
				endTyped, countTyped);
		return result;
	}

	/** Creates a new instance of Sequences. */
	public Sequences() {
	}

	//// Initializers

	public void declareFunctions() {
		SubLFiles.declareFunction(Sequences.me, "elt", "ELT", 2, 0, false);
		SubLFiles.declareFunction(Sequences.me, "subseq", "SUBSEQ", 2, 1, false);
		SubLFiles.declareFunction(Sequences.me, "copy_seq", "COPY-SEQ", 1, 0, false);
		SubLFiles.declareFunction(Sequences.me, "length", "LENGTH", 1, 0, false);
		SubLFiles.declareFunction(Sequences.me, "length_with_cutoff", "LENGTH-WITH-CUTOFF", 2, 0, false);
		SubLFiles.declareFunction(Sequences.me, "reverse", "REVERSE", 1, 0, false);
		SubLFiles.declareFunction(Sequences.me, "nreverse", "NREVERSE", 1, 0, false);

		SubLFiles.declareFunction(Sequences.me, "cconcatenate", "CCONCATENATE", 1, 0, true);
		SubLFiles.declareFunction(Sequences.me, "creduce", "CREDUCE", 2, 3, false);

		SubLFiles.declareFunction(Sequences.me, "fill", "FILL", 2, 2, false);
		SubLFiles.declareFunction(Sequences.me, "replace", "REPLACE", 2, 4, false);
		SubLFiles.declareFunction(Sequences.me, "remove", "REMOVE", 2, 5, false);
		SubLFiles.declareFunction(Sequences.me, "remove_if", "REMOVE-IF", 2, 4, false);
		SubLFiles.declareFunction(Sequences.me, "delete", "DELETE", 2, 5, false);
		SubLFiles.declareFunction(Sequences.me, "delete_if", "DELETE-IF", 2, 4, false);
		SubLFiles.declareFunction(Sequences.me, "remove_duplicates", "REMOVE-DUPLICATES", 1, 4, false);
		SubLFiles.declareFunction(Sequences.me, "delete_duplicates", "DELETE-DUPLICATES", 1, 4, false);
		SubLFiles.declareFunction(Sequences.me, "substitute", "SUBSTITUTE", 3, 5, false);
		SubLFiles.declareFunction(Sequences.me, "substitute_if", "SUBSTITUTE-IF", 3, 4, false);
		SubLFiles.declareFunction(Sequences.me, "nsubstitute", "NSUBSTITUTE", 3, 5, false);
		SubLFiles.declareFunction(Sequences.me, "nsubstitute_if", "NSUBSTITUTE-IF", 3, 4, false);

		SubLFiles.declareFunction(Sequences.me, "position", "POSITION", 2, 4, false);
		SubLFiles.declareFunction(Sequences.me, "position_if", "POSITION-IF", 2, 3, false);
		SubLFiles.declareFunction(Sequences.me, "find", "FIND", 2, 4, false);
		SubLFiles.declareFunction(Sequences.me, "find_if", "FIND-IF", 2, 3, false);
		SubLFiles.declareFunction(Sequences.me, "count", "COUNT", 2, 4, false);
		SubLFiles.declareFunction(Sequences.me, "count_if", "COUNT-IF", 2, 3, false);

		SubLFiles.declareFunction(Sequences.me, "mismatch", "MISMATCH", 2, 6, false);
		SubLFiles.declareFunction(Sequences.me, "search", "SEARCH", 2, 6, false);
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
