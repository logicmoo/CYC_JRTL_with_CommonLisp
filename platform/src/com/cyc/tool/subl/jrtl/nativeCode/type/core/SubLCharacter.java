/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import org.armedbear.lisp.LispCharacter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

final public class SubLCharacter extends LispCharacter implements SubLObject, Comparable {

	@Override
	final public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof SubLCharacter))
			return super.equals(obj);
		assert charValue() != ((SubLCharacter) obj).charValue();
		return false;
	}

	private static boolean charArrayInited;

	public SubLCharacter(int charNum, String... namez) {
		super((char) charNum);
		if (charNum < 256) {
			// Errors.error("Got invalid character code: " + charNum);
			// value = (char) charNum;
			SubLCharacter.constants[charNum] = this;
		}
		charNames = namez;
		if (namez.length > 0)
			mainName = namez[0];
		hashCode = Character.toLowerCase(value);
	}

	public static char caseInsensitiveConvert(char theChar) {
		return Character.toUpperCase(theChar);
	}

	public static SubLCharacter getCharFromName(SubLString name) {
		Object myChar = null;
		myChar = LarKCCharacter.charNameToSubLCharacterMap_CaseSensitive.get(name);
		if (myChar != null)
			return (SubLCharacter) myChar;
		myChar = LarKCCharacter.charNameToSubLCharacterMap_CaseInsensitive.get(name.toLowerCase());
		if (myChar != null)
			return (SubLCharacter) myChar;
		int n = nameToChar(name.getStringValue());
		if (n >= 0) {
			myChar = LispCharacter.getInstance((char) n);
		}
		if (myChar == null)
			Errors.error("Invalid character " + name);
		return (SubLCharacter) myChar;
	}

	public static SubLCharacter makeChar(int aChar) {
		if (!charArrayInited) {
			initCharArray();
		}
		return SubLCharacter.constants[aChar];
	}

	private static void initCharArray() {
		// constants = (SubLCharacter[])LispCharacter.constants;
	}

	// private char value;
	String[] charNames;
	private int hashCode;
	private String mainName;

//	static SubLCharacter[] constants;// = new SubLCharacter[256];
	@Override
	public boolean canFastHash() {
		return true;
	}

	public int charInDigitNumber(int radix) {
		if (radix > 36)
			Errors.error(radix + " is too large to be an input radix.");
		if (radix < 2)
			Errors.error(radix + " is too small to be an input radix.");
		int val = Character.digit(value, radix);
		return val;
	}

	@Override
	public char charValue() {
		return value;
	}

	@Override
	public Object clone() {
		return this;
	}

	@Override
	public int compareTo(Object o) {
		if (lispEquals(o))
			return 0;
		return lessThan((SubLCharacter) o) ? -1 : 1;
	}

	@Override
	public boolean equalp(SubLObject obj) {
		return this == obj || obj.isChar() && equalsIgnoringCase(obj.toChar());
	}

	@Override
	public boolean lispEquals(Object obj) {
		return obj == this;
	}

	public boolean equalsIgnoringCase(SubLCharacter c) {
		return caseInsensitiveConvert(value) == caseInsensitiveConvert(c.value);
	}

	@Override
	public SubLSymbol getType() {
		return Types.$dtp_character$;
	}

	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.EIGHT_INTEGER;
	}

	public boolean greaterThan(SubLCharacter c) {
		return value > c.value;
	}

	public boolean greaterThanIgnoringCase(SubLCharacter c) {
		return caseInsensitiveConvert(value) > caseInsensitiveConvert(c.value);
	}

	public boolean greaterThanOrEqual(SubLCharacter c) {
		return value >= c.value;
	}

	public boolean greaterThanOrEqualIgnoringCase(SubLCharacter c) {
		return caseInsensitiveConvert(value) >= caseInsensitiveConvert(c.value);
	}

	@Override
	public int hashCode(int currentDepth) {
		if (currentDepth < 8)
			return hashCode;
		return 0;
	}

	@Override
	public boolean isAlien() {
		return false;
	}

	public boolean isAlphaChar() {
		return Character.isLetter(value);
	}

	public boolean isAlphNumeric() {
		return Character.isLetterOrDigit(value);
	}

	@Override
	public boolean isAtom() {
		return true;
	}

	@Override
	public boolean isBigIntegerBignum() {
		return false;
	}

	@Override
	public boolean isBignum() {
		return false;
	}

	@Override
	public boolean isBoolean() {
		return false;
	}

	public boolean isBothCases() {
		return isUpperCase() && isLowerCase();
	}

	@Override
	public boolean isChar() {
		return true;
	}

	public boolean isCharInDigitNumber(int radix) {
		int val = charInDigitNumber(radix);
		return val >= 0;
	}

	@Override
	public boolean isCons() {
		return false;
	}

	public boolean isDigit() {
		return Character.isDigit(value);
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public boolean isEnvironment() {
		return false;
	}

	@Override
	public boolean isError() {
		return false;
	}

	@Override
	public boolean isFixnum() {
		return false;
	}

	@Override
	public boolean isFunction() {
		return false;
	}

	@Override
	public boolean isFunctionSpec() {
		return false;
	}

	@Override
	public boolean isGuid() {
		return false;
	}

	@Override
	public boolean isHashtable() {
		return false;
	}

	@Override
	public boolean isHashtableIterator() {
		return false;
	}

	@Override
	public boolean isIntBignum() {
		return false;
	}

	@Override
	public boolean isInteger() {
		return false;
	}

	@Override
	public boolean isKeyhash() {
		return false;
	}

	@Override
	public boolean isKeyhashIterator() {
		return false;
	}

	@Override
	public boolean isKeyword() {
		return false;
	}

	@Override
	public boolean isList() {
		return false;
	}

	@Override
	public boolean isLock() {
		return false;
	}

	@Override
	public boolean isLongBignum() {
		return false;
	}

	public boolean isLowerCase() {
		return Character.isLowerCase(value);
	}

	@Override
	public boolean isMacroOperator() {
		return false;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public boolean isNumber() {
		return false;
	}

	@Override
	public boolean isPackage() {
		return false;
	}

	@Override
	public boolean isPackageIterator() {
		return false;
	}

	@Override
	public boolean isProcess() {
		return false;
	}

	@Override
	public boolean isReadWriteLock() {
		return false;
	}

	@Override
	public boolean isRegexPattern() {
		return false;
	}

	@Override
	public boolean isSemaphore() {
		return false;
	}

	@Override
	public boolean isSequence() {
		return false;
	}

	@Override
	public boolean isStream() {
		return false;
	}

	@Override
	public boolean isString() {
		return false;
	}

	@Override
	public boolean isStructure() {
		return false;
	}

	@Override
	public boolean isSymbol() {
		return false;
	}

	public boolean isUpperCase() {
		return Character.isUpperCase(value);
	}

	@Override
	public boolean isVector() {
		return false;
	}

	public boolean lessThan(SubLCharacter c) {
		return value < c.value;
	}

	public boolean lessThanIgnoringCase(SubLCharacter c) {
		return caseInsensitiveConvert(value) < caseInsensitiveConvert(c.value);
	}

	public boolean lessThanOrEqual(SubLCharacter c) {
		return value <= c.value;
	}

	public boolean lessThanOrEqualIgnoringCase(SubLCharacter c) {
		return caseInsensitiveConvert(value) <= caseInsensitiveConvert(c.value);
	}

	@Override
	public SubLObject makeCopy() {
		return this;
	}

	@Override
	public SubLObject makeDeepCopy() {
		return this;
	}

	@Override
	public SubLCharacter toChar() {
		return this;
	}

	public SubLCharacter toLowerCase() {
		return makeChar(Character.toLowerCase(value));
	}

	// @Override
	public String toStringSubL() {
		if (mainName == null) {
			return charToName(value);
		}
		return "#\\" + mainName;
	}

	@Override
	public String toTypeName() {
		return "CHAR";
	}

	public SubLCharacter toUpperCase() {
		return makeChar(Character.toUpperCase(value));
	}

}
