/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.LarKCCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;

public class Strings extends SubLSystemTrampolineFile {
	private static SubLObject compare(SubLObject string1, SubLObject string2, LarKCCharacter.CharCompareDesc compareDesc,
			SubLObject start1, SubLObject end1, SubLObject start2, SubLObject end2) {
		int start1Typed = SubLSystemTrampolineFile.extractStart(start1);
		int start2Typed = SubLSystemTrampolineFile.extractStart(start2);
		int end1Typed = SubLSystemTrampolineFile.extractEnd(end1);
		int end2Typed = SubLSystemTrampolineFile.extractEnd(end2);
		int result = string1.toStr().compare(string2.toStr(), compareDesc, start1Typed, start2Typed, end1Typed,
				end2Typed);
		if (result < 0)
			return SubLNil.NIL;
		return SubLNumberFactory.makeInteger(result);
	}

	public static SubLObject make_string(SubLObject size, SubLObject initialElement) {
		if (initialElement == CommonSymbols.UNPROVIDED)
			initialElement = Characters.CHAR_space;
		return SubLObjectFactory.makeString(size.intValue(), initialElement.charValue());
	}

	public static SubLObject nstring_capitalize(SubLObject string, SubLObject start, SubLObject end) {
		SubLString stringTyped = string.toStr();
		int startTyped = SubLSystemTrampolineFile.extractStart(start);
		int endTyped = SubLSystemTrampolineFile.extractEnd(end);
		SubLString result = stringTyped.capitalize(true, startTyped, endTyped);
		return result;
	}

	public static SubLObject nstring_downcase(SubLObject string, SubLObject start, SubLObject end) {
		SubLString stringTyped = string.toStr();
		int startTyped = SubLSystemTrampolineFile.extractStart(start);
		int endTyped = SubLSystemTrampolineFile.extractEnd(end);
		SubLString result = stringTyped.toLowerCase(true, startTyped, endTyped);
		return result;
	}

	public static SubLObject nstring_upcase(SubLObject string, SubLObject start, SubLObject end) {
		SubLString stringTyped = string.toStr();
		int startTyped = SubLSystemTrampolineFile.extractStart(start);
		int endTyped = SubLSystemTrampolineFile.extractEnd(end);
		SubLString result = stringTyped.toUpperCase(true, startTyped, endTyped);
		return result;
	}

	public static SubLObject set_char(SubLObject string, SubLObject index, SubLObject character) {
		string.set(index.intValue(), character);
		return string;
	}

	public static SubLObject string(SubLObject object) {
		if (object.isString())
			return object;
		if (object.isChar())
			return SubLObjectFactory.makeString("" + object.charValue());
		if (object.isSymbol())
			return object.toSymbol().getSubLName();
		return SubLObjectFactory.makeString("" + object);
	}

	public static SubLObject string_capitalize(SubLObject string, SubLObject start, SubLObject end) {
		SubLString stringTyped = string.toStr();
		int startTyped = SubLSystemTrampolineFile.extractStart(start);
		int endTyped = SubLSystemTrampolineFile.extractEnd(end);
		SubLString result = stringTyped.capitalize(false, startTyped, endTyped);
		return result;
	}

	public static SubLObject string_downcase(SubLObject string, SubLObject start, SubLObject end) {
		SubLString stringTyped = string.toStr();
		int startTyped = SubLSystemTrampolineFile.extractStart(start);
		int endTyped = SubLSystemTrampolineFile.extractEnd(end);
		SubLString result = stringTyped.toLowerCase(false, startTyped, endTyped);
		return result;
	}

	public static SubLObject string_equal(SubLObject string1, SubLObject string2) {
		return string_equal(string1, string2, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
	}

	public static SubLObject string_equal(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
			SubLObject start2, SubLObject end2) {
		SubLObject result = compare(string1, string2, LarKCCharacter.charEIgnoringCaseDesc, start1, end1, start2, end2);
		return result.isNumber() ? CommonSymbols.T : result;
	}

	public static SubLObject string_greaterp(SubLObject string1, SubLObject string2) {
		return string_greaterp(string1, string2, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
	}

	public static SubLObject string_greaterp(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
			SubLObject start2, SubLObject end2) {
		return compare(string1, string2, LarKCCharacter.charGIgnoringCaseDesc, start1, end1, start2, end2);
	}

	public static SubLObject string_left_trim(SubLObject char_list, SubLObject string) {
		return string.toStr().leftTrim(char_list.toSeq());
	}

	public static SubLObject string_lessp(SubLObject string1, SubLObject string2) {
		return string_lessp(string1, string2, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
	}

	public static SubLObject string_lessp(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
			SubLObject start2, SubLObject end2) {
		return compare(string1, string2, LarKCCharacter.charLIgnoringCaseDesc, start1, end1, start2, end2);
	}

	public static SubLObject string_not_equal(SubLObject string1, SubLObject string2) {
		return string_not_equal(string1, string2, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
	}

	public static SubLObject string_not_equal(SubLObject string1, SubLObject string2, SubLObject start1,
			SubLObject end1, SubLObject start2, SubLObject end2) {
		return SubLObjectFactory
				.makeBoolean(string_equal(string1, string2, start1, end1, start2, end2) == SubLNil.NIL);
	}

	public static SubLObject string_not_greaterp(SubLObject string1, SubLObject string2) {
		return string_not_greaterp(string1, string2, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
	}

	public static SubLObject string_not_greaterp(SubLObject string1, SubLObject string2, SubLObject start1,
			SubLObject end1, SubLObject start2, SubLObject end2) {
		return compare(string1, string2, LarKCCharacter.charLEIgnoringCaseDesc, start1, end1, start2, end2);
	}

	public static SubLObject string_not_lessp(SubLObject string1, SubLObject string2) {
		return string_not_lessp(string1, string2, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
	}

	public static SubLObject string_not_lessp(SubLObject string1, SubLObject string2, SubLObject start1,
			SubLObject end1, SubLObject start2, SubLObject end2) {
		return compare(string1, string2, LarKCCharacter.charGEIgnoringCaseDesc, start1, end1, start2, end2);
	}

	public static SubLObject string_right_trim(SubLObject char_list, SubLObject string) {
		return string.toStr().rightTrim(char_list.toSeq());
	}

	public static SubLObject string_trim(SubLObject char_list, SubLObject string) {
		return string.toStr().trim(char_list.toSeq());
	}

	public static SubLObject string_upcase(SubLObject string, SubLObject start, SubLObject end) {
		SubLString stringTyped = string.toStr();
		int startTyped = SubLSystemTrampolineFile.extractStart(start);
		int endTyped = SubLSystemTrampolineFile.extractEnd(end);
		SubLString result = stringTyped.toUpperCase(false, startTyped, endTyped);
		return result;
	}

	public static SubLObject stringE(SubLObject string1, SubLObject string2) {
		return stringE(string1, string2, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED);
	}

	public static SubLObject stringE(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
			SubLObject start2, SubLObject end2) {
		SubLObject result = compare(string1, string2, LarKCCharacter.charE_Desc, start1, end1, start2, end2);
		return result.isNumber() ? CommonSymbols.T : result;
	}

	public static SubLObject stringG(SubLObject string1, SubLObject string2) {
		return stringG(string1, string2, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED);
	}

	public static SubLObject stringG(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
			SubLObject start2, SubLObject end2) {
		return compare(string1, string2, LarKCCharacter.charG_Desc, start1, end1, start2, end2);
	}

	public static SubLObject stringGE(SubLObject string1, SubLObject string2) {
		return stringGE(string1, string2, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED);
	}

	public static SubLObject stringGE(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
			SubLObject start2, SubLObject end2) {
		return compare(string1, string2, LarKCCharacter.charGE_Desc, start1, end1, start2, end2);
	}

	public static SubLObject stringL(SubLObject string1, SubLObject string2) {
		return stringL(string1, string2, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED);
	}

	public static SubLObject stringL(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
			SubLObject start2, SubLObject end2) {
		return compare(string1, string2, LarKCCharacter.charL_Desc, start1, end1, start2, end2);
	}

	public static SubLObject stringLE(SubLObject string1, SubLObject string2) {
		return stringLE(string1, string2, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED);
	}

	public static SubLObject stringLE(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
			SubLObject start2, SubLObject end2) {
		return compare(string1, string2, LarKCCharacter.charLE_Desc, start1, end1, start2, end2);
	}

	public static SubLObject stringNE(SubLObject string1, SubLObject string2) {
		return stringNE(string1, string2, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED);
	}

	public static SubLObject stringNE(SubLObject string1, SubLObject string2, SubLObject start1, SubLObject end1,
			SubLObject start2, SubLObject end2) {
		return SubLObjectFactory
				.makeBoolean(stringE(string1, string2, start1, end1, start2, end2) == SubLNil.NIL);
	}

	public static SubLObject sublisp_char(SubLObject string, SubLObject index) {
		return string.getCharacter(index.intValue());
	}

	public static SubLFile me;
	static {
		me = new Strings();
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(Strings.me, "make_string", "MAKE-STRING", 1, 1, false);
		SubLFiles.declareFunction(Strings.me, "string", "STRING", 1, 0, false);
		SubLFiles.declareFunction(Strings.me, "sublisp_char", "CHAR", 2, 0, false);
		SubLFiles.declareFunction(Strings.me, "set_char", "SET-CHAR", 3, 0, false);
		SubLFiles.declareFunction(Strings.me, "stringE", "STRING=", 2, 4, false);
		SubLFiles.declareFunction(Strings.me, "stringL", "STRING<", 2, 4, false);
		SubLFiles.declareFunction(Strings.me, "stringLE", "STRING<=", 2, 4, false);
		SubLFiles.declareFunction(Strings.me, "stringG", "STRING>", 2, 4, false);
		SubLFiles.declareFunction(Strings.me, "stringGE", "STRING>=", 2, 4, false);
		SubLFiles.declareFunction(Strings.me, "string_upcase", "STRING-UPCASE", 1, 2, false);
		SubLFiles.declareFunction(Strings.me, "string_downcase", "STRING-DOWNCASE", 1, 2, false);
		SubLFiles.declareFunction(Strings.me, "string_capitalize", "STRING-CAPITALIZE", 1, 2, false);
		SubLFiles.declareFunction(Strings.me, "nstring_upcase", "NSTRING-UPCASE", 1, 2, false);
		SubLFiles.declareFunction(Strings.me, "nstring_downcase", "NSTRING-DOWNCASE", 1, 2, false);
		SubLFiles.declareFunction(Strings.me, "nstring_capitalize", "NSTRING-CAPITALIZE", 1, 2, false);
		SubLFiles.declareFunction(Strings.me, "string_equal", "STRING-EQUAL", 2, 4, false);
		SubLFiles.declareFunction(Strings.me, "string_greaterp", "STRING-GREATERP", 2, 4, false);
		SubLFiles.declareFunction(Strings.me, "string_left_trim", "STRING-LEFT-TRIM", 2, 0, false);
		SubLFiles.declareFunction(Strings.me, "string_lessp", "STRING-LESSP", 2, 4, false);
		SubLFiles.declareFunction(Strings.me, "string_not_equal", "STRING-NOT-EQUAL", 2, 4, false);
		SubLFiles.declareFunction(Strings.me, "string_not_greaterp", "STRING-NOT-GREATERP", 2, 4, false);
		SubLFiles.declareFunction(Strings.me, "string_not_lessp", "STRING-NOT-LESSP", 2, 4, false);
		SubLFiles.declareFunction(Strings.me, "string_right_trim", "STRING-RIGHT-TRIM", 2, 0, false);
		SubLFiles.declareFunction(Strings.me, "string_trim", "STRING-TRIM", 2, 0, false);
		SubLFiles.declareFunction(Strings.me, "stringNE", "STRING/=", 2, 4, false);
	}

	@Override
	public void initializeVariables() {
	}

	@Override
	public void runTopLevelForms() {
	}
}
