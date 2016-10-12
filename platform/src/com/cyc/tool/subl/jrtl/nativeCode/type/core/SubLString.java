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

import java.util.Arrays;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.AbstractArray;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.AbstractString;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SimpleString;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter.CharCompareDesc;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStreamFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.ComparatorGenericKey;
import com.cyc.tool.subl.util.ComparatorIdentityKey;

//// External Imports

public abstract /* final */ class SubLString extends AbstractString
		implements SubLObject, SubLSequence, Cloneable, CharSequence {

	public static String STRING_TYPE_NAME = "STRING";

	public static String convertSubLStringToJavaString(String string) {
		if (string == null)
			return null;
		String result = string.replaceAll("\\\\", "\\\\\\\\");
		result = result.replaceAll("\\$", "\\\\\\$"); // $ is a reserved regex
														// character
		return result;
	}

	/**
	 * Escapes embedded double quote and backslash characters in the given
	 * string.
	 *
	 * @param string
	 *            the given string
	 * @return the given string with embeded double quote characters preceded by
	 *         a backslash character, and with embedded backslash characters
	 *         preceded by another (escaping) backslash character
	 * @note this is a copy from StringUtils under opencyc, move somewhere
	 *       better, if it's even really needed -APB
	 */
	public static String escapeDoubleQuotes(String string) {
		if (string == null)
			return null;
		String result = string.replaceAll("\\\\", "\\\\\\\\");
		return result.replaceAll("\\\"", "\\\\\\\"");
	}

	/**
	 * Un-escapes embedded double quote and backslash characters in the given
	 * string.
	 *
	 * @param string
	 *            the given string
	 * @return the given string with un-escaped backslash and double quote
	 *         characters
	 * @note this is a copy from StringUtils under opencyc, move somewhere
	 *       better, if it's even really needed -APB
	 */
	public static String unescapeDoubleQuotes(String string) {
		if (string == null)
			return null;
		String result = string.replaceAll("\\\\\\\"", "\\\"");
		return result.replaceAll("\\\\\\\\", "\\\\");
	}

	protected char[] buf;

	protected int size = 0;

	//// Public Area

	private String string = null;

	int hash = 0;

	//// Constructors
	protected SubLString() {

	}

	/** Creates a new instance of SubLString. */
	protected SubLString(char[] chars) {
		this.buf = chars;
		this.size = this.buf.length;
	}

	/** Creates a new instance of SubLString. */
	protected SubLString(char[] chars, int length) {
		if (chars.length < length)
			Errors.error("Error in string constructor.");
		this.buf = new char[length];
		this.size = length;
		System.arraycopy(chars, 0, this.buf, 0, length);
	}

	/** Creates a new instance of SubLString. */
	protected SubLString(char[] chars, int start, int end) {
		this.size = end - start;
		if (chars.length < this.size)
			Errors.error("Error in string constructor.");
		this.buf = new char[this.size];
		System.arraycopy(chars, start, this.buf, 0, this.size);
	}

	protected SubLString(int length, char defaultChar) {
		if (this.size < 0)
			Errors.error("Attempt to create string with negative size: " + this.size);
		this.buf = new char[length];
		this.size = length;
		Arrays.fill(this.buf, defaultChar);
	}

	/** Creates a new instance of SubLString. */
	protected SubLString(String str) {
		if (str == null)
			str = "";
		this.buf = str.toCharArray();
		this.size = this.buf.length;
		this.string = str;
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

	private int calCharsToTrim(SubLSequence charsToTrim, boolean atStart) {
		int result = 0;
		if (atStart) {
			for (int i = 0, size = this.size(); i < size; i++)
				if (charsToTrim.positionOf(SubLCharacter.charArray[this.buf[i]]) >= 0)
					result++;
				else
					break;
		} else
			for (int i = this.size() - 1; i >= 0; i--)
				if (charsToTrim.positionOf(SubLCharacter.charArray[this.buf[i]]) >= 0)
					result++;
				else
					break;
		return result;
	}

	public boolean canFastHash() {
		return true;
	}

	public int capacity() {
		this.unimplimentedLispFunction();
		return 0;
	}

	public SubLString capitalize(boolean isDestructive) {
		return this.capitalize(isDestructive, 0, this.size());
	}

	public SubLString capitalize(boolean isDestructive, int start, int end) {
		SubLString result = isDestructive ? this : this.makeCopy().toStr();
		if (start < 0)
			start = 0;
		if (end < 0 || end > this.size())
			end = this.size();
		boolean lastWasAlphNumeric = false;
		for (int i = start; i < end; i++) {
			if (lastWasAlphNumeric)
				result.setChar(i, Character.toLowerCase(result.charAt(i)));
			else
				result.setChar(i, Character.toUpperCase(result.charAt(i)));
			lastWasAlphNumeric = Character.isLetterOrDigit(result.charAt(i));
		}
		return result;
	}

	public char charAt(int index) {
		return this.buf[index];
	}

	public Object clone() {
		return this.makeCopy();
	}

	public int compare(SubLString compareString, CharCompareDesc compareDesc, int start1, int start2, int end1,
			int end2) {
		int curIndex1 = start1 = start1 < 0 ? 0 : start1;
		int curIndex2 = start2 = start2 < 0 ? 0 : start2;
		int fin1 = end1 > this.size ? this.size : end1;
		int fin2 = end2 > compareString.size ? compareString.size : end2;
		if (fin1 < 0)
			fin1 = this.size;
		if (fin2 < 0)
			fin2 = compareString.size;
		/* first gobble up common prefix */
		int answer = 0;
		if (!compareDesc.isCaseSensitive())
			while (curIndex1 < fin1 && curIndex2 < fin2
					&& SubLCharacter.caseInsensitiveConvert(this.buf[curIndex1]) == SubLCharacter
							.caseInsensitiveConvert(compareString.buf[curIndex2])) {
				answer++;
				curIndex1++;
				curIndex2++;
			}
		else
			while (curIndex1 < fin1 && curIndex2 < fin2 && this.buf[curIndex1] == compareString.buf[curIndex2]) {
				answer++;
				curIndex1++;
				curIndex2++;
			}
		/* if the strings are both not at the end, compare the remainders */
		if (curIndex1 != fin1 && curIndex2 != fin2) {
			if (!compareDesc.compare(this.buf[curIndex1], compareString.buf[curIndex2]))
				answer = -1;
		} else
			answer = compareDesc.process(answer, fin1 - curIndex1, fin2 - curIndex2);
		return answer >= 0 ? answer + start1 : answer;
	}

	public SubLSequence delete(int startIndex, int endIndexExclusive) {
		if (endIndexExclusive <= startIndex)
			return this;
		int deleteCount = endIndexExclusive - startIndex;
		for (int i = endIndexExclusive, j = startIndex; i < this.size; i++, j++)
			this.buf[j] = this.buf[i];
		for (int i = this.size - deleteCount; i < this.size; i++)
			this.buf[i] = ' ';
		this.size -= deleteCount;
		this.setMutated();
		return this;
	}

	public boolean equal(SubLObject obj) {
		if (obj == null)
			return false;
		if (!obj.isString())
			return false;
		SubLString other = obj.toStr();
		if (other.size != this.size)
			return false;
		for (int i = 0; i < this.size; i++)
			if (this.buf[i] != other.buf[i])
				return false;
		return true;
	}

	/** Two strings are equalp iff they are case-insensitively equal. */
	public boolean equalp(SubLObject obj) {
		if (obj == null)
			return false;
		if (!obj.isString())
			return super.equalp(obj);
		SubLString other = obj.toStr();
		if (other.size != this.size)
			return false;
		for (int i = 0; i < this.size; i++)
			if (Character.toUpperCase(this.buf[i]) != Character.toUpperCase(other.buf[i]))
				return false;
		return true;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof CharSequence) {
			CharSequence obj2 = (CharSequence) obj;
			if (this.length() != obj2.length())
				return false;
			for (int i = 0, size = obj2.length(); i < size; i++)
				if (this.charAt(i) != obj2.charAt(i))
					return false;
			return true;
		}
		return false;
	}

	public void fill(char c) {
		Arrays.fill(this.buf, c);
		this.string = null;
	}

	public void fillVoid(SubLObject obj) {
		this.unimplimentedLispFunction();

	}

	public SubLObject get(int index) {
		return SubLCharacter.charArray[this.buf[index]];
	}

	public char getChar(int index) {
		return this.buf[index];
	}

	/** Method created to avoid casting */
	public SubLCharacter getCharacter(int index) {
		return SubLCharacter.charArray[this.buf[index]];
	}

	/** Method created to avoid instanceof tests */
	public String getFileDesignator() {
		return this.getString();
	}

	public String getString() {
		if (this.string == null)
			this.string = new String(this.buf, 0, this.size);
		return this.string;
	}

	public SubLSymbol getType() {
		return Types.$dtp_string$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.THIRTY_TWO_INTEGER;
	}

	public int hashCode(int currentDepth) {
		int h = this.hash;
		if (h == 0) {
			for (int i = 0, curSize = this.size(); i < curSize; i++)
				h = 31 * h + Character.toUpperCase(this.buf[i]);
			this.hash = h;
		}
		return h;
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
		return true;
	}

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return true;
	} // per HyperSpec

	public SubLString leftTrim(SubLSequence charsToTrim) {
		int trimCount = this.calCharsToTrim(charsToTrim, true);
		return new SimpleString(this.toCharArray(), trimCount, this.size());
	}

	public int length() {
		return this.size;
	}

	public SubLObject makeCopy() {
		return new SimpleString(this.getString());
	}

	public SubLObject makeDeepCopy() {
		Errors.unimplementedMethod("SubLString.makeDeepCopy()");
		return null;
	}

	public SubLSequence makeSequenceFromJavaList(List newBuf) {
		int size = newBuf.size();
		char[] theBuff = new char[size];
		for (int i = 0; i < size; i++) {
			SubLObject obj = (SubLObject) newBuf.get(i);
			theBuff[i] = obj.charValue();
		}
		return new SimpleString(theBuff);
	}

	public SubLObject reverse() {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLString rightTrim(SubLSequence charsToTrim) {
		int trimCount = this.calCharsToTrim(charsToTrim, false);
		return new SimpleString(this.toCharArray(), 0, this.size() - trimCount);
	}

	public void set(int index, char newVal) {
		this.buf[index] = newVal;
		this.setMutated();
	}

	public void set(int index, SubLObject newVal) {
		this.buf[index] = newVal.charValue();
		this.setMutated();
	}

	// non in order to let ComplexString override
	public void setChar(int index, char newChar) {
		this.buf[index] = newChar;
		this.setMutated();
	}

	public void setMutated() {
		this.string = null;
		this.hash = 0;
	}

	public void shrink(int n) {
		this.unimplimentedLispFunction();

	}

	public int size() {
		return this.size;
	}

	public SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
		SubLCharacter[] chars = (SubLCharacter[]) this.toArray();
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			Arrays.sort(chars, new ComparatorIdentityKey<SubLCharacter>(pred)); // @todo
																				// get
																				// rid
																				// of
																				// new
		else
			Arrays.sort(chars, new ComparatorGenericKey<SubLCharacter>(pred, key)); // @todo
																					// get
																					// rid
																					// of
																					// new
		for (int i = 0, size = this.buf.length; i < size; i++)
			this.buf[i] = chars[i].getChar();
		this.setMutated();
		return this;
	}

	public SubLObject subseq(int start, int end) {
		this.unimplimentedLispFunction();
		return null;
	}

	public SubLSequence subSeq(int start, int end) {
		if (start < 0)
			start = 0;
		int size = this.length();
		if (end > size)
			end = size;
		if (start >= end)
			return SubLObjectFactory.makeString("");
		char[] charArray = new char[end - start];
		this.getString().getChars(start, end, charArray, 0);
		return SubLObjectFactory.makeString(new String(charArray));
	}

	public CharSequence subSequence(int start, int end) {
		return this.subSeq(start, end).toStr();
	}

	public Object[] toArray() {
		return this.toArray(new SubLCharacter[this.buf.length]);
	}

	public Object[] toArray(Object a[]) {
		if (a.length < this.buf.length)
			Errors.error("Unable to duplicate string.");
		for (int i = 0, size = this.buf.length; i < size; i++)
			a[i] = this.getCharacter(i);
		return a;
	}

	/** @Note this is dangerous...returns internals... */
	public char[] toCharArray() {
		return this.buf;
	}

	public SubLInputBinaryStream toInputBinaryStream() {
		if ("/dev/null".equals(this.getString()))
			return SubLStreamFactory.makeStringInputStream("");
		return SubLStreamFactory.makeInputBinaryStream(this.getString(), CommonSymbols.OVERWRITE_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
	}

	//// Protected Area

	public SubLInputStream toInputStream() {
		return this.toInputTextStream();
	}

	//// Private Area

	public SubLInputTextStream toInputTextStream() {
		if ("/dev/null".equals(this.getString()))
			SubLStreamFactory.makeStringInputStream("");
		return SubLStreamFactory.makeInputTextStream(this.getString(), CommonSymbols.OVERWRITE_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
	}

	//// Internal Rep

	public SubLString toLowerCase() {
		String str = this.getString();
		return SubLObjectFactory.makeString(str.toLowerCase());
	}

	public SubLString toLowerCase(boolean isDestructive) {
		return this.toLowerCase(isDestructive, 0, this.size());
	}

	public SubLString toLowerCase(boolean isDestructive, int start, int end) {
		SubLString result = isDestructive ? this : this.makeCopy().toStr();
		if (start < 0)
			start = 0;
		if (end < 0 || end > this.size())
			end = this.size();
		for (int i = start; i < end; i++)
			result.setChar(i, Character.toLowerCase(this.charAt(i)));
		return result;
	}

	public SubLOutputBinaryStream toOutputBinaryStream() {
		if ("/dev/null".equals(this.getString()))
			return SubLStreamFactory.makeBroadcastStream();
		return SubLStreamFactory.makeOutputBinaryStream(this.getString(), CommonSymbols.OVERWRITE_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
	}

	public SubLOutputStream toOutputStream() {
		return this.toOutputTextStream();
	}

	public SubLOutputTextStream toOutputTextStream() {
		if ("/dev/null".equals(this.getString()))
			return SubLStreamFactory.makeBroadcastStream();
		return SubLStreamFactory.makeOutputTextStream(this.getString(), CommonSymbols.OVERWRITE_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
	}

	/** Method created to avoid casting */
	public SubLString toStr() {
		return this;
	}

	public String toString() {
		// @Note see if escapeQuoteChars is more appropriate here -APB
		return "\"" + SubLString.escapeDoubleQuotes(this.getString()) + "\"";
	}

	public String toTypeName() {
		return SubLString.STRING_TYPE_NAME;
	}

	public SubLString toUpperCase() {
		String str = this.getString();
		return SubLObjectFactory.makeString(str.toUpperCase());
	}

	public SubLString toUpperCase(boolean isDestructive) {
		return this.toUpperCase(isDestructive, 0, this.size());
	}

	public SubLString toUpperCase(boolean isDestructive, int start, int end) {
		SubLString result = isDestructive ? this : this.makeCopy().toStr();
		if (start < 0)
			start = 0;
		if (end < 0 || end > this.size())
			end = this.size();
		for (int i = start; i < end; i++)
			result.setChar(i, Character.toUpperCase(this.charAt(i)));
		return result;
	}

	public SubLString trim(SubLSequence charsToTrim) {
		int startTrimCount = this.calCharsToTrim(charsToTrim, true);
		int size = this.size();
		if (startTrimCount == size)
			return SubLObjectFactory.makeString("");
		int endTrimCount = this.calCharsToTrim(charsToTrim, false);
		size = this.size();
		SubLString result = new SimpleString(this.toCharArray(), startTrimCount, size - endTrimCount);
		return result;
	}

	public void setInternal(int index, char newVal) {
		this.buf[index] = newVal;
	}

}
