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

package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.AbstractSubLVector;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;

//// External Imports

public abstract class AbstractSubLArraySequence extends AbstractSubLVector implements SubLSequence {

	//// Constructors

	//// Public Area

	public Object clone() {
		Errors.unimplementedMethod("AbstractSubLArraySequence.clone()");
		return null;
	}

	public SubLSequence concatenate(SubLObject[] sequences) {
		return AbstractSubLSequence.concatenate(this, sequences);
	}

	public int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.count(this, item, test, key, start, end);
	}

	public int countIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.countIf(this, test, key, start, end);
	}

	public SubLSequence fill(SubLObject item, int start, int end) {
		return AbstractSubLSequence.fill(this, item, start, end);
	}

	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.find(this, item, test, key, start, end);
	}

	public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.findIf(this, test, key, start, end);
	}

	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
			int start2, int end2) {
		return AbstractSubLSequence.indexOfMismatch(this, otherSeq, test, key, start1, end1, start2, end2);
	}

	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.positionOf(this, item, test, key, start, end);
	}

	public int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.positionOfIf(this, test, key, start, end);
	}

	public SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue) {
		return AbstractSubLSequence.reduce(this, func, start, end, initialValue);
	}

	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start, int end, int count) {
		return AbstractSubLSequence.remove(this, item, isDestructive, test, key, start, end, count);
	}

	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start,
			int end) {
		return AbstractSubLSequence.removeDuplicates(this, isDestructive, test, key, start, end);
	}

	public SubLSequence removeDuplicatesFast(BinaryFunction test, int start, int end) {
		return AbstractSubLSequence.removeDuplicatesFast(this, test, start, end);
	}

	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start, int end,
			int count) {
		return AbstractSubLSequence.removeIf(this, test, isDestructive, key, start, end, count);
	}

	public SubLSequence replace(SubLSequence seq, int start1, int end1, int start2, int end2) {
		return AbstractSubLSequence.replace(this, seq, start1, end1, start2, end2);
	}

	public SubLSequence reverse(boolean isDestructive) {
		return AbstractSubLSequence.reverse(this, isDestructive);
	}

	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2,
			int end2) {
		return AbstractSubLSequence.search(this, otherSeq, test, key, start1, end1, start2, end2);
	}

	public SubLSequence subSeq(int start, int end) {
		return AbstractSubLSequence.subSeq(this, start, end);
	}

	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end, int count) {
		return AbstractSubLSequence.substitute(this, newItem, oldItem, isDestructive, test, key, start, end, count);
	}

	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end, int count) {
		return AbstractSubLSequence.substituteIf(this, newItem, test, isDestructive, key, start, end, count);
	}

	//// Internal Rep

	//// Main

}
