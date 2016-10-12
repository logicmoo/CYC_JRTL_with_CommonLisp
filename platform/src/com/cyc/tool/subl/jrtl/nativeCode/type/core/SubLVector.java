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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.AbstractArray;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.ComparatorGenericKey;
import com.cyc.tool.subl.util.ComparatorIdentityKey;

//// Internal Imports

//// External Imports

public class SubLVector extends AbstractSubLArraySequence implements SubLSequence, CommonSymbols {

	//// Constructors

	private static int SXHASH_TYPE_SPEC_PRIME_VECTOR = 199;

	public static String VECTOR_TYPE_NAME = "VECTOR";

	public static SubLVector EMPTY_VECTOR = new SubLVector(0);

	private SubLObject[] vect;

	//// Public Area

	private int size = 0;

	/** Creates a new instance of SubLVector. */
	public SubLVector(int length) {
		this(length, CommonSymbols.NIL);
	}

	public SubLVector(int length, SubLObject value) {
		this.vect = new SubLObject[length];
		Arrays.fill(this.vect, value);
		this.size = this.vect.length;
	}

	public SubLVector(List<SubLObject> list) {
		this(list.toArray(new SubLObject[list.size()]));
	}

	SubLVector(SubLObject[] vect) {
		this.vect = vect;
		this.size = vect.length;
	}
	
	public void fillVoid(SubLObject obj) {
		Arrays.fill(this.vect, obj);		
	}

	public AbstractArray adjustArray(int size, AbstractArray displacedTo, int displacement) {
		this.unimplimentedLispFunction();
		return null;
	}

	public AbstractArray adjustArray(int size, SubLObject initialElement, SubLObject initialContents) {
		this.unimplimentedLispFunction();
		return null;
	}

	public void aset(int index, SubLObject newValue) {
		this.unimplimentedLispFunction();

	}

	public boolean canFastHash() {
		return false;
	}

	public int capacity() {
		this.unimplimentedLispFunction();
		return 0;
	}

	public Object clone() {
		return this.makeCopy();
	}

	public SubLSequence delete(int startIndex, int endIndexExclusive) {
		if (endIndexExclusive <= startIndex)
			return this;
		int deleteCount = endIndexExclusive - startIndex;
		for (int i = endIndexExclusive, j = startIndex; i < this.size; i++, j++)
			this.vect[j] = this.vect[i];
		for (int i = this.size - deleteCount; i < this.size; i++)
			this.vect[i] = null;
		this.size -= deleteCount;
		return this;
	}

	public boolean equalp(SubLObject obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (!obj.isVector())
			return false;
		SubLVector otherVect = obj.toVect();
		if (this.size != otherVect.size)
			return false;
		for (int i = 0; i < this.size; i++)
			if (!this.vect[i].equalp(otherVect.vect[i]))
				return false;
		return true;
	}

	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SubLObject))
			return false;
		SubLObject sublObj = (SubLObject) obj;
		if (!sublObj.isVector())
			return false;
		SubLVector otherVect = sublObj.toVect();
		if (this.size != otherVect.size)
			return false;
		for (int i = 0; i < this.size; i++)
			if (!this.vect[i].equals(otherVect.vect[i]))
				return false;
		return true;
	}

	public SubLSequence fill(SubLObject item, int start, int end) {
		if (end < 0)
			return this;
		if (start < 0)
			start = 0;
		if (end > this.size())
			end = this.size();
		Arrays.fill(this.vect, start, end, item);
		return this;
	}

	public SubLObject get(int i) {
		return this.vect[i];
	}

	public SubLObject getElementType() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLSymbol getType() {
		return Types.$dtp_vector$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.THIRTY_THREE_INTEGER;
	}

	public int hashCode(int currentDepth) {
		if (currentDepth >= SubLObject.MAX_HASH_DEPTH)
			return SubLObject.DEFAULT_EXCEEDED_HASH_VALUE;
		int compositeHash = SubLVector.SXHASH_TYPE_SPEC_PRIME_VECTOR;
		int compositeState = Sxhash.INITIAL_COMPOSITE_STATE;

		for (int i = 0; i < this.size && i < SubLObject.MAX_HASH_LENGTH; i++) {
			int partHash = this.vect[i].hashCode(currentDepth + 1);
			compositeState = Sxhash.updateCompositeState(compositeState);
			compositeHash = Sxhash.compositeUpdate(compositeHash, partHash, compositeState);
		}
		return compositeHash;
	}

	public boolean isAlien() {
		return false;
	}

	public boolean isArrayBased() {
		return true;
	}

	public boolean isAtom() {
		return true;
	}

	public boolean isBigIntegerBignum() {
		return false;
	}

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return false;
	}

	public boolean isChar() {
		return false;
	}

	public boolean isCons() {
		return false;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public boolean isEnvironment() {
		return false;
	}

	public boolean isError() {
		return false;
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isFunction() {
		return false;
	}

	public boolean isFunctionSpec() {
		return false;
	}

	public boolean isGuid() {
		return false;
	}

	public boolean isHashtable() {
		return false;
	}

	public boolean isHashtableIterator() {
		return false;
	}

	public boolean isIntBignum() {
		return false;
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isKeyhash() {
		return false;
	}

	public boolean isKeyhashIterator() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isList() {
		return false;
	}

	public boolean isLock() {
		return false;
	}

	public boolean isLongBignum() {
		return false;
	}

	public boolean isMacroOperator() {
		return false;
	}

	public boolean isNil() {
		return false;
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isPackage() {
		return false;
	}

	public boolean isPackageIterator() {
		return false;
	}

	public boolean isProcess() {
		return false;
	}

	public boolean isReadWriteLock() {
		return false;
	}

	public boolean isRegexPattern() {
		return false;
	}

	public boolean isSemaphore() {
		return false;
	}

	public boolean isSequence() {
		return true;
	}

	public boolean isStream() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return true;
	}

	public SubLObject makeCopy() {
		return new SubLVector((SubLObject[]) this.toArray(new SubLObject[this.size]));
	}

	public SubLObject makeDeepCopy() {
		Errors.unimplementedMethod("SubLVector.makeDeepCopy()");
		return null;
	}

	public SubLSequence makeSequenceFromJavaList(List<SubLObject> newBuf) {
		return new SubLVector(newBuf.toArray(new SubLObject[newBuf.size()]));
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	public SubLObject reverse() {
		this.unimplimentedLispFunction();
		return null;
	}

	public void set(int i, SubLObject obj) {
		this.vect[i] = obj;
	}

	public void shrink(int n) {
		this.unimplimentedLispFunction();

	}

	public int size() {
		return this.size;
	}

	public SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
		SubLVector result = isDestructive ? this : this.makeCopy().toVect();
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			Arrays.sort(result.vect, new ComparatorIdentityKey<SubLObject>(pred)); // @todo
																					// get
																					// rid
																					// of
																					// new
		else
			Arrays.sort(result.vect, new ComparatorGenericKey<SubLObject>(pred, key)); // @todo
																						// get
																						// rid
																						// of
																						// new
		return result;
	}

	public SubLObject subseq(int start, int end) {
		this.unimplimentedLispFunction();
		return null;
	}

	/**
	 * @Note this is dangerous...returns internal guts...consider using clone()
	 *       instead.
	 */
	public Object[] toArray() {
		return this.vect;
	}

	public Object[] toArray(Object[] obj) {
		for (int i = 0, size1 = obj.length < this.size ? obj.length : this.size; i < size1; i++)
			obj[i] = this.vect[i];
		return obj;
	}

	public List<SubLObject> toListOfSubLObjects() {
		List<SubLObject> result = new ArrayList<SubLObject>(this.vect.length);
		for (int i = 0, realSize = this.vect.length; i < realSize; ++i)
			result.add(this.vect[i]);
		return result;
	}

	public String toString() {
		if (PrintLow.shouldPrintAtCurrentLevel()) {
			SubLObject oldLevel = PrintLow.maybeIncreasePrintLevel();
			try {
				StringBuilder buf = new StringBuilder("#(");
				boolean checkLength = PrintLow.controlPrintLength();
				int printLength = PrintLow.maxPrintLength();
				int counter = 0;
				boolean terminatedEarly = false;
				for (int i = 0; i < this.size; i++) {
					buf.append(this.vect[i]);
					if (checkLength) {
						counter++;
						if (counter >= printLength) {
							buf.append(" ... ");
							terminatedEarly = true;
							break;
						}
					}
					if (i < this.size - 1)
						buf.append(" ");
				}
				buf.append(")");
				return buf.toString();
			} finally {
				PrintLow.maybeDecreasePrintLevel(oldLevel);
			}
		} else
			return "#( # )";
	}

	public String toTypeName() {
		return SubLVector.VECTOR_TYPE_NAME;
	}

	/** Method created to avoid casting */
	public SubLVector toVect() { // SubLVector
		return this;
	}

	//// Main

}
