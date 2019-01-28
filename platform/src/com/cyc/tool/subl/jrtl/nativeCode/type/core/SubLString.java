//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLSequence.EQL_TEST;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLSequence.IDENTITY_UNARY_FUNC;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import org.armedbear.lisp.AbstractArray;
import org.armedbear.lisp.AbstractString;
import org.armedbear.lisp.AbstractVector;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispObject;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLDoubleFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLMacro;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStreamFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackageIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.ComparatorGenericKey;
import com.cyc.tool.subl.util.ComparatorIdentityKey;

abstract public class SubLString extends AbstractVector  implements SubLObject, SubLSequence, Cloneable, CharSequence {
	private SubLString(char[] chars) {
		this.chars = chars;
	}
	@Override
	public AbstractString toLispObject()
	{
		return (AbstractString) this;
	}
    protected SubLString(){}
	private SubLString(char[] chars, int length) {
		if (chars.length < length)
			Errors.error("Error in string constructor.");
		System.arraycopy(chars, 0, this.chars = new char[length], 0, length);
	}

	public SubLString(final char[] chars, int start, int end) {
		int size = end - start;
		if (chars.length < size)
			Errors.error("Error in string constructor.");
		System.arraycopy(chars, start, this.chars = new char[size], 0, size);
	}

	SubLString(int length, char defaultChar) {
		if (length < 0)
			Errors.error("Attempt to create string with negative size: " + length);
		Arrays.fill(chars = new char[length], defaultChar);
	}

	SubLString(String str) {
		if (str == null)
			str = "";
		chars = str.toCharArray();
		string = str;
	}

	public final static String convertSubLStringToJavaString(String string) {
		if (string == null)
			return null;
		String result = string.replaceAll("\\\\", "\\\\\\\\");
		result = result.replaceAll("\\$", "\\\\\\$");
		return result;
	}

	public final static String escapeDoubleQuotes(String string) {
		if (string == null)
			return null;
		String result = string.replaceAll("\\\\", "\\\\\\\\");
		return result.replaceAll("\\\"", "\\\\\\\"");
	}

	public final static String unescapeDoubleQuotes(String string) {
		if (string == null)
			return null;
		String result = string.replaceAll("\\\\\\\"", "\\\"");
		return result.replaceAll("\\\\\\\\", "\\\\");
	}

	protected char[] chars;
	protected String string;
	protected int hash;
	public final static String STRING_TYPE_NAME = "STRING";
	public final static int UPCHAR_OFFSET = -32;

	private int calCharsToTrim(SubLSequence charsToTrim, boolean atStart) {
		int result = 0;
		if (atStart)
			for (int i = 0, size = this.size(); i < size
					&& charsToTrim.positionOf(SubLCharacter.constants[charAt(i)]) >= 0; ++i)
				++result;
		else
			for (int i = this.size() - 1; i >= 0
					&& charsToTrim.positionOf(SubLCharacter.constants[charAt(i)]) >= 0; --i)
				++result;
		return result;
	}

	private int internalSize() {
		if (chars == null)
			return string.length();
		return chars.length;
	}

	@Override
	public final boolean canFastHash() {
		return true;
	}

	public final SubLString capitalize(boolean isDestructive) {
		return this.capitalize(isDestructive, 0, this.size());
	}

	public final SubLString capitalize(boolean isDestructive, int start, int end) {
		SubLString result = isDestructive ? this : makeCopy().toStr();
		if (start < 0)
			start = 0;
		if (end < 0 || end > this.size())
			end = this.size();
		boolean lastWasAlphNumeric = false;
		for (int i = start; i < end; ++i) {
			if (lastWasAlphNumeric)
				result.setChar(i, Character.toLowerCase(result.charAt(i)));
			else
				result.setChar(i, Character.toUpperCase(result.charAt(i)));
			lastWasAlphNumeric = Character.isLetterOrDigit(result.charAt(i));
		}
		return result;
	}

	@Override
	public char charAt(int index) {
		if (chars == null)
			return string.charAt(index);
		return chars[index];
	}

	@Override
	public final Object clone() {
		return makeCopy();
	}

	public final int compare(SubLString compareString, LarKCCharacter.CharCompareDesc compareDesc, int start1, int start2,
			int end1, int end2) {
		int curIndex1;
		start1 = curIndex1 = start1 < 0 ? 0 : start1;
		int curIndex2;
		start2 = curIndex2 = start2 < 0 ? 0 : start2;
		int size = this.size();
		int compareSize = compareString.internalSize();
		int fin1 = end1 > size ? size : end1;
		int fin2 = end2 > compareSize ? compareSize : end2;
		if (fin1 < 0)
			fin1 = size;
		if (fin2 < 0)
			fin2 = compareSize;
		int answer = 0;
		if (!compareDesc.isCaseSensitive())
			while (curIndex1 < fin1 && curIndex2 < fin2
					&& SubLCharacter.caseInsensitiveConvert(charAt(curIndex1)) == SubLCharacter
							.caseInsensitiveConvert(compareString.charAt(curIndex2))) {
				++answer;
				++curIndex1;
				++curIndex2;
			}
		else
			while (curIndex1 < fin1 && curIndex2 < fin2 && charAt(curIndex1) == compareString.charAt(curIndex2)) {
				++answer;
				++curIndex1;
				++curIndex2;
			}
		if (curIndex1 != fin1 && curIndex2 != fin2) {
			if (!compareDesc.compare(charAt(curIndex1), compareString.charAt(curIndex2)))
				answer = -1;
		} else
			answer = compareDesc.process(answer, fin1 - curIndex1, fin2 - curIndex2);
		return answer >= 0 ? answer + start1 : answer;
	}

	@Override
	public final SubLSequence delete(int startIndex, int endIndexExclusive) {
		if (endIndexExclusive <= startIndex)
			return this;
		int deleteCount = endIndexExclusive - startIndex;
		int size = internalSize();
		if (chars == null)
			chars = string.toCharArray();
		for (int i = endIndexExclusive, j = startIndex; i < size; ++i, ++j)
			chars[j] = chars[i];
		size -= deleteCount;
		char[] oldbuf = chars;
		System.arraycopy(oldbuf, 0, chars = new char[size], 0, size);
		setMutated();
		return this;
	}

	@Override
	public final boolean equal(SubLObject obj) {
		if (obj == null)
			return false;
		if (!obj.isString())
			return false;
		SubLString other = obj.toStr();
		int ownSize = internalSize();
		if (other.internalSize() != ownSize)
			return false;
		for (int i = 0; i < ownSize; ++i)
			if (charAt(i) != other.charAt(i))
				return false;
		return true;
	}

	@Override
	public final boolean equalp(SubLObject obj) {
		if (obj == null)
			return false;
		if (!obj.isString())
			return false;
		SubLString other = obj.toStr();
		int ownSize = internalSize();
		if (other.internalSize() != ownSize)
			return false;
		for (int i = 0; i < ownSize; ++i)
			if (Character.toUpperCase(charAt(i)) != Character.toUpperCase(other.charAt(i)))
				return false;
		return true;
	}

	@Override
	public final boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof CharSequence))
			return false;
		CharSequence obj2 = (CharSequence) obj;
		if (length() != obj2.length())
			return false;
		for (int i = 0, size = obj2.length(); i < size; ++i)
			if (charAt(i) != obj2.charAt(i))
				return false;
		return true;
	}

	@Override
	public final SubLObject get(int index) {
		return SubLCharacter.constants[charAt(index)];
	}

	public final char getChar(int index) {
		return charAt(index);
	}

	@Override
	public final SubLCharacter getCharacter(int index) {
		return SubLCharacter.constants[charAt(index)];
	}

	@Override
	public final String getFileDesignator() {
		return getStringValue();
	}

	@Override
	public String getStringValue() {
		if (string == null)
			string = new String(chars, 0, chars.length);
		return string;
	}

	@Override
	public final SubLSymbol getType() {
		return Types.$dtp_string$;
	}

	@Override
	public final SubLFixnum getTypeCode() {
		return CommonSymbols.THIRTY_TWO_INTEGER;
	}

	@Override
	public final int hashCode(int currentDepth) {
		int h = hash;
		if (h == 0) {
			for (int i = 0, curSize = this.size(); i < curSize; ++i) {
				char curChar = charAt(i);
				h = 31 * h + (curChar >= 'a' && curChar <= 'z' ? curChar - 32 : curChar);
			}
			hash = h;
		}
		return h;
	}

	@Override
	public final boolean isAlien() {
		return false;
	}

	@Override
	public final boolean isArrayBased() {
		return true;
	}

	@Override
	public final boolean isAtom() {
		return true;
	}

	@Override
	public final boolean isBigIntegerBignum() {
		return false;
	}

	@Override
	public final boolean isBignum() {
		return false;
	}

	@Override
	public final boolean isBoolean() {
		return false;
	}

	@Override
	public final boolean isChar() {
		return false;
	}

	@Override
	public final boolean isCons() {
		return false;
	}

	@Override
	public final boolean isDouble() {
		return false;
	}

	@Override
	public final boolean isEnvironment() {
		return false;
	}

	@Override
	public final boolean isError() {
		return false;
	}

	@Override
	public final boolean isFixnum() {
		return false;
	}

	@Override
	public final boolean isFunction() {
		return false;
	}

	@Override
	public final boolean isFunctionSpec() {
		return false;
	}

	@Override
	public final boolean isGuid() {
		return false;
	}

	@Override
	public final boolean isHashtable() {
		return false;
	}

	@Override
	public final boolean isHashtableIterator() {
		return false;
	}

	@Override
	public final boolean isIntBignum() {
		return false;
	}

	@Override
	public final boolean isInteger() {
		return false;
	}

	@Override
	public final boolean isKeyhash() {
		return false;
	}

	@Override
	public final boolean isKeyhashIterator() {
		return false;
	}

	@Override
	public final boolean isKeyword() {
		return false;
	}

	@Override
	public final boolean isList() {
		return false;
	}

	@Override
	public final boolean isLock() {
		return false;
	}

	@Override
	public final boolean isLongBignum() {
		return false;
	}

	@Override
	public final boolean isMacroOperator() {
		return false;
	}

	@Override
	public final boolean isNil() {
		return false;
	}

	@Override
	public final boolean isNumber() {
		return false;
	}

	@Override
	public final boolean isPackage() {
		return false;
	}

	@Override
	public final boolean isPackageIterator() {
		return false;
	}

	@Override
	public final boolean isProcess() {
		return false;
	}

	@Override
	public final boolean isReadWriteLock() {
		return false;
	}

	@Override
	public final boolean isRegexPattern() {
		return false;
	}

	@Override
	public final boolean isSemaphore() {
		return false;
	}

	@Override
	public final boolean isSequence() {
		return true;
	}

	@Override
	public final boolean isStream() {
		return false;
	}

	@Override
	public final boolean isString() {
		return true;
	}

	@Override
	public final boolean isStructure() {
		return false;
	}

	@Override
	public final boolean isSymbol() {
		return false;
	}

	@Override
	public final boolean isVector() {
		return false;
	}

	public final SubLString leftTrim(SubLSequence charsToTrim) {
		int trimCount = calCharsToTrim(charsToTrim, true);
		return SubLObjectFactory.makeString(toCharArray(), trimCount, this.size());
	}

	@Override
	public int length() {
		return internalSize();
	}

	@Override
	public final SubLObject makeCopy() {
		return SubLObjectFactory.makeString(getStringValue());
	}

	@Override
	public final SubLObject makeDeepCopy() {
		Errors.unimplementedMethod("SubLString.makeDeepCopy()");
		return null;
	}

	@Override
	public final SubLSequence makeSequenceFromJavaList(List newBuf) {
		int size = newBuf.size();
		char[] theBuff = new char[size];
		for (int i = 0; i < size; ++i) {
			SubLObject obj = (SubLObject) newBuf.get(i);
			theBuff[i] = obj.charValue();
		}
		return SubLObjectFactory.makeString(theBuff);
	}

	public final SubLString rightTrim(SubLSequence charsToTrim) {
		int trimCount = calCharsToTrim(charsToTrim, false);
		return SubLObjectFactory.makeString(toCharArray(), 0, this.size() - trimCount);
	}

	public final void set(int index, char newVal) {
		setChar(index, newVal);
	}

	@Override
	public final void set(int index, SubLObject newVal) {
		setChar(index, newVal.charValue());
	}

	public final void setChar(int index, char newChar) {
		if (chars == null)
			chars = string.toCharArray();
		chars[index] = newChar;
		setMutated();
	}

	public final void setInternal(int index, char newVal) {
		setChar(index, newVal);
	}

	public final void setMutated() {
		string = null;
		hash = 0;
	}

	@Override
	public final int size() {
		return internalSize();
	}

	@Override
	public final int size(int max) {
		return internalSize();
	}

	@Override
	public final SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
		SubLCharacter[] chars = (SubLCharacter[]) this.toArray();
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			Arrays.sort(chars, new ComparatorIdentityKey<Object>(pred));
		else
			Arrays.sort(chars, new ComparatorGenericKey<Object>(pred, key));
		if (chars != null)
			this.chars = new char[chars.length];
		for (int i = 0, size = chars.length; i < size; ++i)
			this.chars[i] = chars[i].charValue();
		setMutated();
		return this;
	}

	@Override
	public final SubLSequence subSeq(int start, int end) {
		if (start < 0)
			start = 0;
		int size = length();
		if (end > size)
			end = size;
		if (start >= end)
			return SubLObjectFactory.makeString("");
		char[] charArray = new char[end - start];
		getStringValue().getChars(start, end, charArray, 0);
		return SubLObjectFactory.makeString(new String(charArray));
	}

	@Override
	public final CharSequence subSequence(int start, int end) {
		return subSeq(start, end).toStr();
	}

	//@Override
	@Override
	public final Object[] toArray() {
		return this.toArray(new SubLCharacter[internalSize()]);
	}

	//@Override
	@Override
	public final Object[] toArray(Object[] a) {
		int size = internalSize();
		if (a.length < size)
			Errors.error("Unable to duplicate string.");
		for (int i = 0; i < size; ++i)
			a[i] = getCharacter(i);
		return a;
	}

	public final char[] toCharArray() {
		if (chars == null)
			chars = string.toCharArray();
		return chars;
	}

	@Override
	public final SubLInputBinaryStream toInputBinaryStream() {
		if ("/dev/null".equals(getStringValue()))
			return SubLStreamFactory.makeStringInputStream("");
		return SubLStreamFactory.makeInputBinaryStream(getStringValue(), CommonSymbols.OVERWRITE_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
	}

	@Override
	public final SubLInputStream toInputStream() {
		return toInputTextStream();
	}

	@Override
	public final SubLInputTextStream toInputTextStream() {
		if ("/dev/null".equals(getStringValue()))
			SubLStreamFactory.makeStringInputStream("");
		return SubLStreamFactory.makeInputTextStream(getStringValue(), CommonSymbols.OVERWRITE_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
	}

	public final SubLString toLowerCase() {
		String str = getStringValue();
		return SubLObjectFactory.makeString(str.toLowerCase());
	}

	public final SubLString toLowerCase(boolean isDestructive) {
		return this.toLowerCase(isDestructive, 0, this.size());
	}

	public final SubLString toLowerCase(boolean isDestructive, int start, int end) {
		SubLString result = isDestructive ? this : makeCopy().toStr();
		if (start < 0)
			start = 0;
		if (end < 0 || end > this.size())
			end = this.size();
		for (int i = start; i < end; ++i)
			result.setChar(i, Character.toLowerCase(charAt(i)));
		return result;
	}

	@Override
	public final SubLOutputBinaryStream toOutputBinaryStream() {
		if ("/dev/null".equals(getStringValue()))
			return SubLStreamFactory.makeBroadcastStream();
		return SubLStreamFactory.makeOutputBinaryStream(getStringValue(), CommonSymbols.OVERWRITE_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
	}

	@Override
	public final SubLOutputStream toOutputStream() {
		return toOutputTextStream();
	}

	@Override
	public final SubLOutputTextStream toOutputTextStream() {
		if ("/dev/null".equals(getStringValue()))
			return SubLStreamFactory.makeBroadcastStream();
		return SubLStreamFactory.makeOutputTextStream(getStringValue(), CommonSymbols.OVERWRITE_KEYWORD,
				CommonSymbols.CREATE_KEYWORD);
	}

	@Override
	public final SubLString toStr() {
		return this;
	}


	public final String toStringSubL() {
		return "\"" + escapeDoubleQuotes(getStringValue()) + "\"";
	}

	@Override
	public String toString() {
		return getStringValue();
	}

	@Override
	public final String toTypeName() {
		return "STRING";
	}

	public final SubLString toUpperCase() {
		String str = getStringValue();
		return SubLObjectFactory.makeString(str.toUpperCase());
	}

	public final SubLString toUpperCase(boolean isDestructive) {
		return this.toUpperCase(isDestructive, 0, this.size());
	}

	public final SubLString toUpperCase(boolean isDestructive, int start, int end) {
		SubLString result = isDestructive ? this : makeCopy().toStr();
		if (start < 0)
			start = 0;
		if (end < 0 || end > this.size())
			end = this.size();
		for (int i = start; i < end; ++i)
			result.setChar(i, Character.toUpperCase(charAt(i)));
		return result;
	}

	public final SubLString trim(SubLSequence charsToTrim) {
		int startTrimCount = calCharsToTrim(charsToTrim, true);
		if (startTrimCount == this.size())
			return SubLObjectFactory.makeString("");
		int endTrimCount = calCharsToTrim(charsToTrim, false);
		int size = this.size();
		SubLString result = SubLObjectFactory.makeString(toCharArray(), startTrimCount, size - endTrimCount);
		return result;
	}

	@Override
	public final SubLSequence concatenate(SubLObject[] sequences) {
		return AbstractSubLSequence.concatenate(this, sequences);
	}

	@Override
	public final int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.count(this, item, test, key, start, end);
	}

	@Override
	public final int countIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.countIf(this, test, key, start, end);
	}

	@Override
	public final SubLSequence fill(SubLObject item, int start, int end) {
		return AbstractSubLSequence.fill(this, item, start, end);
	}

	@Override
	public final SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.find(this, item, test, key, start, end);
	}

	@Override
	public final SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.findIf(this, test, key, start, end);
	}

	@Override
	public final int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
			int start2, int end2) {
		return AbstractSubLSequence.indexOfMismatch(this, otherSeq, test, key, start1, end1, start2, end2);
	}

	@Override
	public final int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.positionOf(this, item, test, key, start, end);
	}

	@Override
	public final int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.positionOfIf(this, test, key, start, end);
	}

	@Override
	public final SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue) {
		return AbstractSubLSequence.reduce(this, func, start, end, initialValue);
	}

	@Override
	public final SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start, int end, int count) {
		return AbstractSubLSequence.remove(this, item, isDestructive, test, key, start, end, count);
	}

	@Override
	public final SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start,
			int end) {
		return AbstractSubLSequence.removeDuplicates(this, isDestructive, test, key, start, end);
	}

	@Override
	public final SubLSequence removeDuplicatesFast(BinaryFunction test, int start, int end) {
		return AbstractSubLSequence.removeDuplicatesFast(this, test, start, end);
	}

	@Override
	public final SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start, int end,
			int count) {
		return AbstractSubLSequence.removeIf(this, test, isDestructive, key, start, end, count);
	}

	@Override
	public final SubLSequence replace(SubLSequence seq, int start1, int end1, int start2, int end2) {
		return AbstractSubLSequence.replace(this, seq, start1, end1, start2, end2);
	}

	@Override
	public final SubLSequence reverse(boolean isDestructive) {
		return AbstractSubLSequence.reverse(this, isDestructive);
	}

	@Override
	public final int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2,
			int end2) {
		return AbstractSubLSequence.search(this, otherSeq, test, key, start1, end1, start2, end2);
	}

	@Override
	public final SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end, int count) {
		return AbstractSubLSequence.substitute(this, newItem, oldItem, isDestructive, test, key, start, end, count);
	}

	@Override
	public final SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end, int count) {
		return AbstractSubLSequence.substituteIf(this, newItem, test, isDestructive, key, start, end, count);
	}


	@Override
	public final SubLSequence concatenate(SubLSequence seq1) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize1;
		args[0] = seq1;
		return this.concatenate(args);
	}

	@Override
	public final int count(SubLObject item) {
		return this.count(item, EQL_TEST, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE);
	}

	@Override
	public final int count(SubLObject item, BinaryFunction test) {
		return this.count(item, test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE);
	}

	@Override
	public final int count(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return this.count(item, test, key, 0, Integer.MAX_VALUE);
	}

	@Override
	public final int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start) {
		return this.count(item, test, key, start, Integer.MAX_VALUE);
	}

	@Override
	public final int countIf(UnaryFunction test) {
		return this.countIf(test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE);
	}

	@Override
	public final int countIf(UnaryFunction test, UnaryFunction key) {
		return this.countIf(test, key, 0, Integer.MAX_VALUE);
	}

	@Override
	public final int countIf(UnaryFunction test, UnaryFunction key, int start) {
		return this.countIf(test, key, start, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence deleteItems(boolean[] itemsToDelete, int count) {
		return AbstractSubLList.deleteItems(this, itemsToDelete, count);
	}

	@Override
	public final SubLSequence fill(SubLObject item) {
		return this.fill(item, 0, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence fill(SubLObject item, int start) {
		return this.fill(item, start, Integer.MAX_VALUE);
	}

	@Override
	public final SubLObject find(SubLObject item) {
		return this.find(item, EQL_TEST, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE);
	}

	@Override
	public final SubLObject find(SubLObject item, BinaryFunction test) {
		return this.find(item, test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE);
	}

	@Override
	public final SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return this.find(item, test, key, 0, Integer.MAX_VALUE);
	}

	@Override
	public final SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start) {
		return this.find(item, test, key, start, Integer.MAX_VALUE);
	}

	@Override
	public final SubLObject findIf(UnaryFunction test) {
		Errors.unimplementedMethod("findIf");
		return null;
	}

	@Override
	public final SubLObject findIf(UnaryFunction test, UnaryFunction key) {
		Errors.unimplementedMethod("findIf");
		return null;
	}

	@Override
	public final SubLObject findIf(UnaryFunction test, UnaryFunction key, int start) {
		Errors.unimplementedMethod("findIf");
		return null;
	}

	@Override
	public final int indexOfMismatch(SubLSequence otherSeq) {
		return this.indexOfMismatch(otherSeq, EQL_TEST, IDENTITY_UNARY_FUNC,
				0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	@Override
	public final int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test) {
		return this.indexOfMismatch(otherSeq, test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE, 0,
				Integer.MAX_VALUE);
	}

	@Override
	public final int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		return this.indexOfMismatch(otherSeq, test, key, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	@Override
	public final int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1) {
		return this.indexOfMismatch(otherSeq, test, key, start1, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	@Override
	public final int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1) {
		return this.indexOfMismatch(otherSeq, test, key, start1, end1, 0, Integer.MAX_VALUE);
	}

	@Override
	public final int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
			int start2) {
		return this.indexOfMismatch(otherSeq, test, key, start1, end1, start2, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence merge(SubLSequence otherSeq, BinaryFunction test) {
		return this.merge(otherSeq, test, UnaryFunction.IDENTITY_UNARY_FUNC);
	}

	@Override
	public final SubLSequence merge(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		return (SubLSequence) Errors.unimplementedMethod("cmerge: on " + otherSeq.getType());
	}

	@Override
	public final int positionOf(SubLObject item) {
		return this.positionOf(item, EQL_TEST, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE);
	}

	@Override
	public final int positionOf(SubLObject item, BinaryFunction test) {
		return this.positionOf(item, test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE);
	}

	@Override
	public final int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return this.positionOf(item, test, key, 0, Integer.MAX_VALUE);
	}

	@Override
	public final int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start) {
		return this.positionOf(item, test, key, start, Integer.MAX_VALUE);
	}

	@Override
	public final int positionOfIf(UnaryFunction test) {
		return this.positionOfIf(test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE);
	}

	@Override
	public final int positionOfIf(UnaryFunction test, UnaryFunction key) {
		return this.positionOfIf(test, key, 0, Integer.MAX_VALUE);
	}

	@Override
	public final int positionOfIf(UnaryFunction test, UnaryFunction key, int start) {
		return this.positionOfIf(test, key, start, Integer.MAX_VALUE);
	}

	@Override
	public final SubLObject reduce(BinaryFunction func) {
		return this.reduce(func, 0, Integer.MAX_VALUE, SubLSequence.NO_INIT_VALUE);
	}

	@Override
	public final SubLObject reduce(BinaryFunction func, int start) {
		return this.reduce(func, start, Integer.MAX_VALUE, SubLSequence.NO_INIT_VALUE);
	}

	@Override
	public final SubLObject reduce(BinaryFunction func, int start, int end) {
		return this.reduce(func, start, end, SubLSequence.NO_INIT_VALUE);
	}

	@Override
	public final SubLSequence remove(SubLObject item, boolean isDestructive) {
		return this.remove(item, isDestructive, EQL_TEST, IDENTITY_UNARY_FUNC,
				0, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test) {
		return this.remove(item, isDestructive, test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE,
				Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		return this.remove(item, isDestructive, test, key, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start) {
		return this.remove(item, isDestructive, test, key, start, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start, int end) {
		return this.remove(item, isDestructive, test, key, start, end, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence removeDuplicates(boolean isDestructive) {
		return this.removeDuplicates(isDestructive, EQL_TEST,
				IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test) {
		return this.removeDuplicates(isDestructive, test, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		return this.removeDuplicates(isDestructive, test, key, 0, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start) {
		return this.removeDuplicates(isDestructive, test, key, start, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence removeIf(UnaryFunction test, boolean isDestructive) {
		return this.removeIf(test, isDestructive, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE,
				Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key) {
		return this.removeIf(test, isDestructive, key, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start) {
		return this.removeIf(test, isDestructive, key, start, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start, int end) {
		return this.removeIf(test, isDestructive, key, start, end, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence replace(SubLSequence seq) {
		return this.replace(seq, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence replace(SubLSequence seq, int start1) {
		return this.replace(seq, start1, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence replace(SubLSequence seq, int start1, int end1) {
		return this.replace(seq, start1, end1, 0, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence replace(SubLSequence seq, int start1, int end1, int start2) {
		return this.replace(seq, start1, end1, start2, Integer.MAX_VALUE);
	}

	@Override
	public final int search(SubLSequence otherSeq) {
		return this.search(otherSeq, EQL_TEST, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	@Override
	public final int search(SubLSequence otherSeq, BinaryFunction test) {
		return this.search(otherSeq, test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE, 0,
				Integer.MAX_VALUE);
	}

	@Override
	public final int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		return this.search(otherSeq, test, key, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	@Override
	public final int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1) {
		return this.search(otherSeq, test, key, start1, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	@Override
	public final int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1) {
		return this.search(otherSeq, test, key, start1, end1, 0, Integer.MAX_VALUE);
	}

	@Override
	public final int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2) {
		return this.search(otherSeq, test, key, start1, end1, start2, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence sort(boolean isDestructive, BinaryFunction pred) {
		return this.sort(isDestructive, pred, IDENTITY_UNARY_FUNC);
	}

	@Override
	public final SubLSequence subSeq(int start) {
		return this.subSeq(start, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive) {
		return this.substitute(newItem, oldItem, isDestructive, EQL_TEST,
				IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test) {
		return this.substitute(newItem, oldItem, isDestructive, test, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key) {
		return this.substitute(newItem, oldItem, isDestructive, test, key, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start) {
		return this.substitute(newItem, oldItem, isDestructive, test, key, start, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end) {
		return this.substitute(newItem, oldItem, isDestructive, test, key, start, end, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive) {
		return this.substituteIf(newItem, test, isDestructive, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key) {
		return this.substituteIf(newItem, test, isDestructive, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start) {
		return this.substituteIf(newItem, test, isDestructive, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end) {
		return this.substituteIf(newItem, test, isDestructive, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public final SubLSequence toSeq() {
		return this;
	}

	private SubLObject structFieldError(int fieldNum) {

			Errors.error(this + " does not have a slot: " + fieldNum + ".");
		return SubLNil.NIL;
	}

	@Override
	public final SubLObject add(SubLObject num) {
		return Errors.error("Not a number: " + this + ".");
	}

	@Override
	public final void addKey(SubLObject key) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"KEYHASH");
	}

	@Override
	public final SubLList asArrayList() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return null;
	}

	@Override
	public final SubLList asConsList() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return null;
	}

	@Override
	public final BigInteger bigIntegerValue() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"NUMBER");
		return BigInteger.ZERO;
	}

	@Override
	public final void bind(SubLObject newValue, SubLObject[] bindings) {
		Errors.error("Illegal attempt to bind non symbol: " + this + ".");
	}

	@Override
	public final char charValue() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"CHAR");
		return '\0';
	}

	@Override
	public final void checkType(SubLSymbol predicate) throws SubLException {
	}

	@Override
	public final void checkTypeInternal(SubLSymbol predicate) throws SubLException {
	}


	@Override
	public final SubLObject currentBinding(SubLObject[] bindings) {
		Errors.error("Illegal attempt to get binding for non symbol: " + this + ".");
		return SubLNil.NIL;
	}

	@Override
	public final SubLObject dec() {
		return Errors.error("Not a number: " + this + ".");
	}

	@Override
	public final double doubleValue() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"NUMBER");
		return Double.MIN_VALUE;
	}

	@Override
	public final SubLObject eighth() {
		return this.get(7);
	}

	@Override
	public final void enforceType(SubLSymbol predicate) throws SubLException {
		UnaryFunction Function = UnaryFunction.makeInstance(predicate);
		if (SubLNil.NIL == Function.processItem(this))
			Errors.error(SubLObjectFactory.makeString("Got invalid type for object: " + this + "." + " Wanted type: "
					+ predicate + " Actual type: " + toTypeName()));
	}

	@Override
	public final void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
	}

	@Override
	public final boolean eql(SubLObject obj) {
		return obj == this;
	}


	@Override
	public final SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this;
	}

	@Override
	public final SubLObject fifth() {
		return this.get(4);
	}

	@Override
	public final SubLObject first() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return SubLNil.NIL;
	}

	@Override
	public final SubLObject fourth() {
		return this.get(3);
	}


	@Override
	public final SubLObject get(SubLObject obj) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"HASHTABLE");
		return SubLNil.NIL;
	}

	@Override
	public final SubLObject getField(int fieldNum) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"STRUCT");
		return SubLNil.NIL;
	}

	@Override
	public final SubLObject getField0() {
		return structFieldError(0);
	}

	@Override
	public final SubLObject getField1() {
		return structFieldError(1);
	}

	@Override
	public final SubLObject getField10() {
		return structFieldError(10);
	}

	@Override
	public final SubLObject getField11() {
		return structFieldError(11);
	}

	@Override
	public final SubLObject getField12() {
		return structFieldError(12);
	}

	@Override
	public final SubLObject getField13() {
		return structFieldError(13);
	}

	@Override
	public final SubLObject getField14() {
		return structFieldError(14);
	}

	@Override
	public final SubLObject getField15() {
		return structFieldError(15);
	}

	@Override
	public final SubLObject getField16() {
		return structFieldError(16);
	}

	@Override
	public final SubLObject getField17() {
		return structFieldError(17);
	}

	@Override
	public final SubLObject getField18() {
		return structFieldError(18);
	}

	@Override
	public final SubLObject getField19() {
		return structFieldError(19);
	}

	@Override
	public final SubLObject getField2() {
		return structFieldError(2);
	}

	@Override
	public final SubLObject getField20() {
		return structFieldError(20);
	}

	@Override
	public final SubLObject getField3() {
		return structFieldError(3);
	}

	@Override
	public final SubLObject getField4() {
		return structFieldError(4);
	}

	@Override
	public final SubLObject getField5() {
		return structFieldError(5);
	}

	@Override
	public final SubLObject getField6() {
		return structFieldError(6);
	}

	@Override
	public final SubLObject getField7() {
		return structFieldError(7);
	}

	@Override
	public final SubLObject getField8() {
		return structFieldError(8);
	}

	@Override
	public final SubLObject getField9() {
		return structFieldError(9);
	}


	@Override
	public final SubLFunction getFunc() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"FUNCTION");
		return null;
	}

	@Override
	public final int getNumSize() {
		Errors.error("Not a number: " + this + ".");
		return -1;
	}

	@Override
	public final SubLStream getStream(boolean followSynonymStream) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"STREAM");
		return null;
	}

	@Override
	public final int hashCode() {
		return this.hashCode(0);
	}

	@Override
	public final boolean hasKey(SubLObject obj) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"KEYHASH");
		return false;
	}

	@Override
	public final SubLObject inc() {
		return Errors.error("Not a number: " + this + ".");
	}

	@Override
	public final int intValue() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"NUMBER");
		return Integer.MIN_VALUE;
	}

	@Override
	public final boolean isNegative() {
		return false;
	}

	@Override
	public final boolean isPositive() {
		return false;
	}

	@Override
	public final boolean isZero() {
		return false;
	}

	@Override
	public final SubLObject last(int i) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return null;
	}

	@Override
	public final long longValue() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"NUMBER");
		return Long.MIN_VALUE;
	}


	@Override
	public final SubLObject mult(SubLObject num) {
		return Errors.error("Not a number: " + this + ".");
	}

	@Override
	public final SubLObject ninth() {
		return this.get(8);
	}

	@Override
	public final SubLObject nthCdr(int index) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return null;
	}

	@Override
	public final boolean numE(SubLObject x) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"NUMBER");
		return false;
	}

	@Override
	public final boolean numG(SubLObject x) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"NUMBER");
		return false;
	}

	@Override
	public final boolean numGE(SubLObject x) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"NUMBER");
		return false;
	}

	@Override
	public final boolean numL(SubLObject x) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"NUMBER");
		return false;
	}

	@Override
	public final boolean numLE(SubLObject x) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"NUMBER");
		return false;
	}

	@Override
	public final SubLObject put(SubLObject key, SubLObject value) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"HASHTABLE");
		return SubLNil.NIL;
	}

	@Override
	public final void rebind(SubLObject oldValue, SubLObject[] bindings) {
		Errors.error("Illegal attempt to rebind non symbol: " + this + ".");
	}

	@Override
	public final boolean remKey(SubLObject obj) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"HASHTABLE");
		return false;
	}

	@Override
	public final SubLObject remove(SubLObject obj) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"HASHTABLE");
		return SubLNil.NIL;
	}

	@Override
	public final SubLObject rest() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return SubLNil.NIL;
	}


	@Override
	public final SubLObject second() {
		return this.get(1);
	}

	@Override
	public final void setField(int fieldNum, SubLObject value) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"STRUCT");
	}

	@Override
	public final SubLObject setField0(SubLObject newVal) {
		return structFieldError(0);
	}

	@Override
	public final SubLObject setField1(SubLObject newVal) {
		return structFieldError(1);
	}

	@Override
	public final SubLObject setField10(SubLObject newVal) {
		return structFieldError(10);
	}

	@Override
	public final SubLObject setField11(SubLObject newVal) {
		return structFieldError(11);
	}

	@Override
	public final SubLObject setField12(SubLObject newVal) {
		return structFieldError(12);
	}

	@Override
	public final SubLObject setField13(SubLObject newVal) {
		return structFieldError(13);
	}

	@Override
	public final SubLObject setField14(SubLObject newVal) {
		return structFieldError(14);
	}

	@Override
	public final SubLObject setField15(SubLObject newVal) {
		return structFieldError(15);
	}

	@Override
	public final SubLObject setField16(SubLObject newVal) {
		return structFieldError(16);
	}

	@Override
	public final SubLObject setField17(SubLObject newVal) {
		return structFieldError(17);
	}

	@Override
	public final SubLObject setField18(SubLObject newVal) {
		return structFieldError(18);
	}

	@Override
	public final SubLObject setField19(SubLObject newVal) {
		return structFieldError(19);
	}

	@Override
	public final SubLObject setField2(SubLObject newVal) {
		return structFieldError(2);
	}

	@Override
	public final SubLObject setField20(SubLObject newVal) {
		return structFieldError(20);
	}

	@Override
	public final SubLObject setField3(SubLObject newVal) {
		return structFieldError(3);
	}

	@Override
	public final SubLObject setField4(SubLObject newVal) {
		return structFieldError(4);
	}

	@Override
	public final SubLObject setField5(SubLObject newVal) {
		return structFieldError(5);
	}

	@Override
	public final SubLObject setField6(SubLObject newVal) {
		return structFieldError(6);
	}

	@Override
	public final SubLObject setField7(SubLObject newVal) {
		return structFieldError(7);
	}

	@Override
	public final SubLObject setField8(SubLObject newVal) {
		return structFieldError(8);
	}

	@Override
	public final SubLObject setField9(SubLObject newVal) {
		return structFieldError(9);
	}

	@Override
	public final SubLCons setFirst(SubLObject first) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return null;
	}

	@Override
	public final SubLCons setRest(SubLObject rest) {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return null;
	}

	@Override
	public final SubLObject seventh() {
		return this.get(6);
	}

	@Override
	public final SubLObject sixth() {
		return this.get(5);
	}


	@Override
	public final SubLObject sub(SubLObject num) {
		return Errors.error("Not a number: " + this + ".");
	}

//	@Override
//	public final int superHash() {
//		return super.hashCode();
//	}

	@Override
	public final SubLObject tenth() {
		return this.get(9);
	}

	@Override
	public final SubLObject third() {
		return this.get(2);
	}

	@Override
	public final SubLCharacter toChar() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"CHAR");
		return null;
	}

	@Override
	public final SubLCons toCons() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"CONS");
		return null;
	}

	@Override
	public final SubLDoubleFloat toDouble() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"FLOAT");
		return null;
	}

	@Override
	public final SubLEnvironment toEnv() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"ENVIRONMENT");
		return null;
	}

	@Override
	public final SubLFixnum toFixnum() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"FIXNUM");
		return null;
	}

	@Override
	public final SubLGuid toGuid() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"GUID");
		return null;
	}

	@Override
	public final SubLHashtable toHashtable() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"HASHTABLE");
		return null;
	}

	@Override
	public final SubLHashtableIterator toHashtableIterator() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"HASHTABLE-ITERATOR");
		return null;
	}


	@Override
	public final SubLInteger toInteger() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"INTEGER");
		return null;
	}

	@Override
	public final SubLKeyhash toKeyhash() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"KEYHASH");
		return null;
	}

	@Override
	public final SubLKeyhashIterator toKeyhashIterator() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"KEYHASH-ITERATOR");
		return null;
	}

	@Override
	public final SubLList toList() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LIST");
		return null;
	}

	@Override
	public final SubLLock toLock() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"LOCK");
		return null;
	}

	@Override
	public final SubLMacro toMacro() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"MACRO");
		return null;
	}

	@Override
	public final SubLNumber toNumber() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"NUMBER");
		return null;
	}


	@Override
	public final SubLPackage toPackage() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"PACKAGE");
		return null;
	}

	@Override
	public final SubLPackageIterator toPackageIterator() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"PACKAGE");
		return null;
	}

	@Override
	public final SubLProcess toProcess() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"PROCESS");
		return null;
	}

	@Override
	public final SubLReadWriteLock toReadWriteLock() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"READ-WRITE-LOCK");
		return null;
	}

	@Override
	public final SubLRegexPattern toRegexPattern() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"REGEX-PATTERN");
		return null;
	}

	@Override
	public final SubLSemaphore toSemaphore() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"SEMAPHORE");
		return null;
	}

	@Override
	public final SubLStruct toStruct() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"STRUCTURE");
		return null;
	}

	@Override
	public final SubLSymbol toSymbol() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"SYMBOL");
		return null;
	}


	@Override
	public final SubLVector toVect() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"VECTOR");
		return null;
	}

	@Override
	public String getString() {
		return getStringValue();
	}

}
