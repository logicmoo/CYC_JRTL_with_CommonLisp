/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import org.armedbear.lisp.LispHashTable;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;

public class LarKCCharacter {
	private static class CharE_Desc implements CharCompareDesc, CaseSensitiveDesc {
		@Override
		public boolean compare(char char1, char char2) {
			return char1 == char2;
		}

		@Override
		public boolean isCaseSensitive() {
			return true;
		}

		@Override
		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 == charsLeft2 && charsLeft1 == 0 ? prefixSize : -1;
		}
	}

	private static class CharEIgnoringCase_Description implements CharCompareDesc, CaseInsensitiveDesc {
		@Override
		public boolean compare(char char1, char char2) {
			return SubLCharacter.caseInsensitiveConvert(char1) == SubLCharacter.caseInsensitiveConvert(char2);
		}

		@Override
		public boolean isCaseSensitive() {
			return false;
		}

		@Override
		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 == charsLeft2 && charsLeft1 == 0 ? prefixSize : -1;
		}
	}

	private static class CharG_Desc implements CharCompareDesc, CaseSensitiveDesc {
		@Override
		public boolean compare(char char1, char char2) {
			return char1 > char2;
		}

		@Override
		public boolean isCaseSensitive() {
			return true;
		}

		@Override
		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 > charsLeft2 ? prefixSize : -1;
		}
	}

	private static class CharGE_Desc implements CharCompareDesc, CaseSensitiveDesc {
		@Override
		public boolean compare(char char1, char char2) {
			return char1 >= char2;
		}

		@Override
		public boolean isCaseSensitive() {
			return true;
		}

		@Override
		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 >= charsLeft2 ? prefixSize : -1;
		}
	}

	private static class CharGEIgnoringCase_Description implements CharCompareDesc, CaseInsensitiveDesc {
		@Override
		public boolean compare(char char1, char char2) {
			return SubLCharacter.caseInsensitiveConvert(char1) >= SubLCharacter.caseInsensitiveConvert(char2);
		}

		@Override
		public boolean isCaseSensitive() {
			return false;
		}

		@Override
		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 >= charsLeft2 ? prefixSize : -1;
		}
	}

	private static class CharGIgnoringCase_Description implements CharCompareDesc, CaseInsensitiveDesc {
		@Override
		public boolean compare(char char1, char char2) {
			return SubLCharacter.caseInsensitiveConvert(char1) > SubLCharacter.caseInsensitiveConvert(char2);
		}

		@Override
		public boolean isCaseSensitive() {
			return false;
		}

		@Override
		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 > charsLeft2 ? prefixSize : -1;
		}
	}

	private static class CharL_Desc implements CharCompareDesc, CaseSensitiveDesc {
		@Override
		public boolean compare(char char1, char char2) {
			return char1 < char2;
		}

		@Override
		public boolean isCaseSensitive() {
			return true;
		}

		@Override
		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 < charsLeft2 ? prefixSize : -1;
		}
	}

	private static class CharLE_Desc implements CharCompareDesc, CaseSensitiveDesc {
		@Override
		public boolean compare(char char1, char char2) {
			return char1 <= char2;
		}

		@Override
		public boolean isCaseSensitive() {
			return true;
		}

		@Override
		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 <= charsLeft2 ? prefixSize : -1;
		}
	}

	private static class CharLEIgnoringCase_Description implements CharCompareDesc, CaseInsensitiveDesc {
		@Override
		public boolean compare(char char1, char char2) {
			return SubLCharacter.caseInsensitiveConvert(char1) <= SubLCharacter.caseInsensitiveConvert(char2);
		}

		@Override
		public boolean isCaseSensitive() {
			return false;
		}

		@Override
		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 <= charsLeft2 ? prefixSize : -1;
		}
	}

	private static class CharLIgnoringCase_Description implements CharCompareDesc, CaseInsensitiveDesc {
		@Override
		public boolean compare(char char1, char char2) {
			return SubLCharacter.caseInsensitiveConvert(char1) < SubLCharacter.caseInsensitiveConvert(char2);
		}

		@Override
		public boolean isCaseSensitive() {
			return false;
		}

		@Override
		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 < charsLeft2 ? prefixSize : -1;
		}
	}

	public interface CaseInsensitiveDesc {
	}

	public interface CaseSensitiveDesc {
	}

	public interface CharCompareDesc {
		boolean compare(char p0, char p1);

		boolean isCaseSensitive();

		int process(int p0, int p1, int p2);
	}

	private static void initChars() {		
		for (int i = 0, size = SubLCharacter.constants.length; i < size; ++i) {
			SubLCharacter curChar = SubLCharacter.constants[i];
			String[] curNames = SubLCharacter.constants[i].charNames;
			boolean caseSensitive = i >= 65 && i <= 90 || i >= 97 && i <= 122;
			LispHashTable charMap = caseSensitive ? charNameToSubLCharacterMap_CaseSensitive
					: charNameToSubLCharacterMap_CaseInsensitive;
			String cnmae = curChar.toStringSubL();
			if(cnmae!=null) {
				SubLString mainName = SubLObjectFactory.makeString(caseSensitive ? cnmae : cnmae.toLowerCase());
				charMap.put(mainName, curChar);
			}
			for (int j = 0, size2 = curNames.length; j < size2; ++j) {
				SubLString curName = SubLObjectFactory
						.makeString(caseSensitive ? curNames[j] : curNames[j].toLowerCase());
				charMap.put(curName, curChar);
			}
		}
		charNameToSubLCharacterMap_CaseSensitive.put(SubLObjectFactory.makeString("Space"),SubLCharacter.constants[32]);
		charNameToSubLCharacterMap_CaseInsensitive.put(SubLObjectFactory.makeString("space"),SubLCharacter.constants[32]);
	}

	public static SubLCharacter getCharFromName(SubLString name) {
		Object myChar = null;
		myChar = charNameToSubLCharacterMap_CaseSensitive.get(name);
		if (myChar == null)
			myChar = charNameToSubLCharacterMap_CaseInsensitive.get(name.toLowerCase());
		if (myChar == null)
			Errors.error("Invalid character " + name);
		return (SubLCharacter) myChar;
	}

	public static String CHAR_TYPE_NAME = "CHAR";
	public static CharCompareDesc charE_Desc;
	public static CharCompareDesc charL_Desc;
	public static CharCompareDesc charLE_Desc;
	public static CharCompareDesc charG_Desc;
	public static CharCompareDesc charGE_Desc;
	public static CharCompareDesc charEIgnoringCaseDesc;
	public static CharCompareDesc charLIgnoringCaseDesc;
	public static CharCompareDesc charLEIgnoringCaseDesc;
	public static CharCompareDesc charGIgnoringCaseDesc;
	public static CharCompareDesc charGEIgnoringCaseDesc;
	static LispHashTable charNameToSubLCharacterMap_CaseSensitive;
	static LispHashTable charNameToSubLCharacterMap_CaseInsensitive;
	public static int MAX_CHAR_CODE = 255;
	static {
		charE_Desc = new CharE_Desc();
		charL_Desc = new CharL_Desc();
		charLE_Desc = new CharLE_Desc();
		charG_Desc = new CharG_Desc();
		charGE_Desc = new CharGE_Desc();
		charEIgnoringCaseDesc = new CharEIgnoringCase_Description();
		charLIgnoringCaseDesc = new CharLIgnoringCase_Description();
		charLEIgnoringCaseDesc = new CharLEIgnoringCase_Description();
		charGIgnoringCaseDesc = new CharGIgnoringCase_Description();
		charGEIgnoringCaseDesc = new CharGEIgnoringCase_Description();
		charNameToSubLCharacterMap_CaseSensitive = SubLObjectFactory.makeHashtable(130, BinaryFunction.EQUAL_TEST);
		charNameToSubLCharacterMap_CaseInsensitive = SubLObjectFactory.makeHashtable(130, BinaryFunction.EQUALP_TEST);
		initChars();
	}

}
