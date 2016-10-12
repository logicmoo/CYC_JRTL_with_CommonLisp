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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// External Imports

public class SubLCharacter extends AbstractSubLObject implements SubLObject, Comparable {

	public static interface CaseInsensitiveDesc {
	}

	//// Constructors

	public static interface CaseSensitiveDesc {
	}

	public static interface CharCompareDesc {
		public boolean compare(char char1, char char2);

		public boolean isCaseSensitive();

		public int process(int prefixSize, int charsLeft1, int charsLeft2);
	}

	private static class CharE_Desc implements CharCompareDesc, CaseSensitiveDesc {
		public boolean compare(char char1, char char2) {
			return char1 == char2;
		}

		public boolean isCaseSensitive() {
			return true;
		}

		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 == charsLeft2 && charsLeft1 == 0 ? prefixSize : -1;
		}
	}

	private static class CharEIgnoringCase_Description implements CharCompareDesc, CaseInsensitiveDesc {
		public boolean compare(char char1, char char2) {
			return SubLCharacter.caseInsensitiveConvert(char1) == SubLCharacter.caseInsensitiveConvert(char2);
		}

		public boolean isCaseSensitive() {
			return false;
		}

		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 == charsLeft2 && charsLeft1 == 0 ? prefixSize : -1;
		}
	}

	private static class CharG_Desc implements CharCompareDesc, CaseSensitiveDesc {
		public boolean compare(char char1, char char2) {
			return char1 > char2;
		}

		public boolean isCaseSensitive() {
			return true;
		}

		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 > charsLeft2 ? prefixSize : -1;
		}
	}

	//// Public Area

	private static class CharGE_Desc implements CharCompareDesc, CaseSensitiveDesc {
		public boolean compare(char char1, char char2) {
			return char1 >= char2;
		}

		public boolean isCaseSensitive() {
			return true;
		}

		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 >= charsLeft2 ? prefixSize : -1;
		}
	}

	private static class CharGEIgnoringCase_Description implements CharCompareDesc, CaseInsensitiveDesc {
		public boolean compare(char char1, char char2) {
			return SubLCharacter.caseInsensitiveConvert(char1) >= SubLCharacter.caseInsensitiveConvert(char2);
		}

		public boolean isCaseSensitive() {
			return false;
		}

		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 >= charsLeft2 ? prefixSize : -1;
		}
	}

	private static class CharGIgnoringCase_Description implements CharCompareDesc, CaseInsensitiveDesc {
		public boolean compare(char char1, char char2) {
			return SubLCharacter.caseInsensitiveConvert(char1) > SubLCharacter.caseInsensitiveConvert(char2);
		}

		public boolean isCaseSensitive() {
			return false;
		}

		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			{
				return charsLeft1 > charsLeft2 ? prefixSize : -1;
			}
		}
	}

	private static class CharL_Desc implements CharCompareDesc, CaseSensitiveDesc {
		public boolean compare(char char1, char char2) {
			return char1 < char2;
		}

		public boolean isCaseSensitive() {
			return true;
		}

		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 < charsLeft2 ? prefixSize : -1;
		}
	}

	private static class CharLE_Desc implements CharCompareDesc, CaseSensitiveDesc {
		public boolean compare(char char1, char char2) {
			return char1 <= char2;
		}

		public boolean isCaseSensitive() {
			return true;
		}

		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 <= charsLeft2 ? prefixSize : -1;
		}
	}

	private static class CharLEIgnoringCase_Description implements CharCompareDesc, CaseInsensitiveDesc {
		public boolean compare(char char1, char char2) {
			return SubLCharacter.caseInsensitiveConvert(char1) <= SubLCharacter.caseInsensitiveConvert(char2);
		}

		public boolean isCaseSensitive() {
			return false;
		}

		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 <= charsLeft2 ? prefixSize : -1;
		}
	}

	private static class CharLIgnoringCase_Description implements CharCompareDesc, CaseInsensitiveDesc {
		public boolean compare(char char1, char char2) {
			return SubLCharacter.caseInsensitiveConvert(char1) < SubLCharacter.caseInsensitiveConvert(char2);
		}

		public boolean isCaseSensitive() {
			return false;
		}

		public int process(int prefixSize, int charsLeft1, int charsLeft2) {
			return charsLeft1 < charsLeft2 ? prefixSize : -1;
		}
	}

	public static String CHAR_TYPE_NAME = "CHAR";

	public static CharCompareDesc charE_Desc = new CharE_Desc();

	public static CharCompareDesc charL_Desc = new CharL_Desc();

	public static CharCompareDesc charLE_Desc = new CharLE_Desc();

	public static CharCompareDesc charG_Desc = new CharG_Desc();

	public static CharCompareDesc charGE_Desc = new CharGE_Desc();

	public static CharCompareDesc charEIgnoringCaseDesc = new CharEIgnoringCase_Description();

	public static CharCompareDesc charLIgnoringCaseDesc = new CharLIgnoringCase_Description();

	public static CharCompareDesc charLEIgnoringCaseDesc = new CharLEIgnoringCase_Description();

	public static CharCompareDesc charGIgnoringCaseDesc = new CharGIgnoringCase_Description();

	public static CharCompareDesc charGEIgnoringCaseDesc = new CharGEIgnoringCase_Description();

	private static SubLHashtable charNameToSubLCharacterMap_CaseSensitive = SubLObjectFactory.makeHashtable(26 * 5,
			BinaryFunction.EQUAL_TEST);

	private static SubLHashtable charNameToSubLCharacterMap_CaseInsensitive = SubLObjectFactory.makeHashtable(26 * 5,
			BinaryFunction.EQUALP_TEST);

	static SubLCharacter[] charArray = new SubLCharacter[256];

	static {
		new SubLCharacter(0, "Null", "NUL");
		new SubLCharacter(1, "Control-a", "c-a", "SOH");
		new SubLCharacter(2, "Control-b", "c-b", "STX");
		new SubLCharacter(3, "Control-c", "c-c", "ETX");
		new SubLCharacter(4, "Control-d", "c-d", "EOT");
		new SubLCharacter(5, "Control-e", "c-e", "ENQ");
		new SubLCharacter(6, "Control-f", "c-f", "ACK");
		new SubLCharacter(7, "Bell", "BEL");
		new SubLCharacter(8, "Backspace", "BS");
		new SubLCharacter(9, "Tab", "HT");
		new SubLCharacter(10, "Newline", "Linefeed", "LF", "NL");
		new SubLCharacter(11, "Vertical-Tab", "VT");
		new SubLCharacter(12, "Page", "FF");
		new SubLCharacter(13, "Return", "CR");
		new SubLCharacter(14, "Control-n", "c-n", "SO");
		new SubLCharacter(15, "Control-o", "c-o", "SI");
		new SubLCharacter(16, "Control-p", "c-p", "DLE");
		new SubLCharacter(17, "Control-q", "c-q", "DC1");
		new SubLCharacter(18, "Control-r", "c-r", "DC2");
		new SubLCharacter(19, "Control-s", "c-s", "DC3");
		new SubLCharacter(20, "Control-t", "c-t", "DC4");
		new SubLCharacter(21, "Control-u", "c-u", "NAK");
		new SubLCharacter(22, "Control-v", "c-v", "SYN");
		new SubLCharacter(23, "Control-w", "c-w", "ETB");
		new SubLCharacter(24, "Control-x", "c-x", "CAN");
		new SubLCharacter(25, "Control-y", "c-y", "EM");
		new SubLCharacter(26, "Control-z", "c-z", "SUB");
		new SubLCharacter(27, "Escape", "ESC", "ALT");
		new SubLCharacter(28, "Control-\\", "c-\\", "FS");
		new SubLCharacter(29, "Control-]", "c-]", "GS");
		new SubLCharacter(30, "Control-^", "c-^", "RS");
		new SubLCharacter(31, "Control-_", "c-_", "US");
		new SubLCharacter(32, "Space", "SP");
		new SubLCharacter(33, "!");
		new SubLCharacter(34, "\"");
		new SubLCharacter(35, "#");
		new SubLCharacter(36, "$");
		new SubLCharacter(37, "%");
		new SubLCharacter(38, "&");
		new SubLCharacter(39, "'");
		new SubLCharacter(40, "(");
		new SubLCharacter(41, ")");
		new SubLCharacter(42, "*");
		new SubLCharacter(43, "+");
		new SubLCharacter(44, ",");
		new SubLCharacter(45, "-");
		new SubLCharacter(46, ".");
		new SubLCharacter(47, "/");
		new SubLCharacter(48, "0");
		new SubLCharacter(49, "1");
		new SubLCharacter(50, "2");
		new SubLCharacter(51, "3");
		new SubLCharacter(52, "4");
		new SubLCharacter(53, "5");
		new SubLCharacter(54, "6");
		new SubLCharacter(55, "7");
		new SubLCharacter(56, "8");
		new SubLCharacter(57, "9");
		new SubLCharacter(58, ":");
		new SubLCharacter(59, ";");
		new SubLCharacter(60, "<");
		new SubLCharacter(61, "=");
		new SubLCharacter(62, ">");
		new SubLCharacter(63, "?");
		new SubLCharacter(64, "@");
		new SubLCharacter(65, "A");
		new SubLCharacter(66, "B");
		new SubLCharacter(67, "C");
		new SubLCharacter(68, "D");
		new SubLCharacter(69, "E");
		new SubLCharacter(70, "F");
		new SubLCharacter(71, "G");
		new SubLCharacter(72, "H");
		new SubLCharacter(73, "I");
		new SubLCharacter(74, "J");
		new SubLCharacter(75, "K");
		new SubLCharacter(76, "L");
		new SubLCharacter(77, "M");
		new SubLCharacter(78, "N");
		new SubLCharacter(79, "O");
		new SubLCharacter(80, "P");
		new SubLCharacter(81, "Q");
		new SubLCharacter(82, "R");
		new SubLCharacter(83, "S");
		new SubLCharacter(84, "T");
		new SubLCharacter(85, "U");
		new SubLCharacter(86, "V");
		new SubLCharacter(87, "W");
		new SubLCharacter(88, "X");
		new SubLCharacter(89, "Y");
		new SubLCharacter(90, "Z");
		new SubLCharacter(91, "[");
		new SubLCharacter(92, "\\");
		new SubLCharacter(93, "]");
		new SubLCharacter(94, "^");
		new SubLCharacter(95, "_");
		new SubLCharacter(96, "`");
		new SubLCharacter(97, "a");
		new SubLCharacter(98, "b");
		new SubLCharacter(99, "c");
		new SubLCharacter(100, "d");
		new SubLCharacter(101, "e");
		new SubLCharacter(102, "f");
		new SubLCharacter(103, "g");
		new SubLCharacter(104, "h");
		new SubLCharacter(105, "i");
		new SubLCharacter(106, "j");
		new SubLCharacter(107, "k");
		new SubLCharacter(108, "l");
		new SubLCharacter(109, "m");
		new SubLCharacter(110, "n");
		new SubLCharacter(111, "o");
		new SubLCharacter(112, "p");
		new SubLCharacter(113, "q");
		new SubLCharacter(114, "r");
		new SubLCharacter(115, "s");
		new SubLCharacter(116, "t");
		new SubLCharacter(117, "u");
		new SubLCharacter(118, "v");
		new SubLCharacter(119, "w");
		new SubLCharacter(120, "x");
		new SubLCharacter(121, "y");
		new SubLCharacter(122, "z");
		new SubLCharacter(123, "{");
		new SubLCharacter(124, "|");
		new SubLCharacter(125, "}");
		new SubLCharacter(126, "~");
		new SubLCharacter(127, "Rubout", "DEL");
		new SubLCharacter(128, "Meta-Null", "m-Null");
		new SubLCharacter(129, "Control-Meta-a", "c-m-a");
		new SubLCharacter(130, "Control-Meta-b", "c-m-b");
		new SubLCharacter(131, "Control-Meta-c", "c-m-c");
		new SubLCharacter(132, "Control-Meta-d", "c-m-d");
		new SubLCharacter(133, "Control-Meta-e", "c-m-e");
		new SubLCharacter(134, "Control-Meta-f", "c-m-f");
		new SubLCharacter(135, "Meta-Bell", "m-Bell");
		new SubLCharacter(136, "Meta-Backspace", "m-Backspace");
		new SubLCharacter(137, "Meta-Tab", "m-Tab");
		new SubLCharacter(138, "Meta-Newline", "m-Newline");
		new SubLCharacter(139, "Meta-Vertical-Tab", "m-Vertical-Tab");
		new SubLCharacter(140, "Meta-Page", "m-Page");
		new SubLCharacter(141, "Meta-Return", "m-Return");
		new SubLCharacter(142, "Control-Meta-n", "c-m-n");
		new SubLCharacter(143, "Control-Meta-o", "c-m-o");
		new SubLCharacter(144, "Control-Meta-p", "c-m-p");
		new SubLCharacter(145, "Control-Meta-q", "c-m-q");
		new SubLCharacter(146, "Control-Meta-r", "c-m-r");
		new SubLCharacter(147, "Control-Meta-s", "c-m-s");
		new SubLCharacter(148, "Control-Meta-t", "c-m-t");
		new SubLCharacter(149, "Control-Meta-u", "c-m-u");
		new SubLCharacter(150, "Control-Meta-v", "c-m-v");
		new SubLCharacter(151, "Control-Meta-w", "c-m-w");
		new SubLCharacter(152, "Control-Meta-x", "c-m-x");
		new SubLCharacter(153, "Control-Meta-y", "c-m-y");
		new SubLCharacter(154, "Control-Meta-z", "c-m-z");
		new SubLCharacter(155, "Meta-Escape", "m-Escape");
		new SubLCharacter(156, "Control-Meta-\\", "c-m-\\");
		new SubLCharacter(157, "Control-Meta-]", "c-m-]");
		new SubLCharacter(158, "Control-Meta-^", "c-m-^");
		new SubLCharacter(159, "Control-Meta-_", "c-m-_");
		new SubLCharacter(160, "Meta-Space", "m-Space");
		new SubLCharacter(161, "Meta-!", "m-!");
		new SubLCharacter(162, "Meta-\"", "m-\"");
		new SubLCharacter(163, "Meta-#", "m-#");
		new SubLCharacter(164, "Meta-$", "m-$");
		new SubLCharacter(165, "Meta-%", "m-%");
		new SubLCharacter(166, "Meta-&", "m-&");
		new SubLCharacter(167, "Meta-'", "m-'");
		new SubLCharacter(168, "Meta-(", "m-(");
		new SubLCharacter(169, "Meta-)", "m-)");
		new SubLCharacter(170, "Meta-*", "m-*");
		new SubLCharacter(171, "Meta-+", "m-+");
		new SubLCharacter(172, "Meta-,", "m-,");
		new SubLCharacter(173, "Meta--", "m--");
		new SubLCharacter(174, "Meta-.", "m-.");
		new SubLCharacter(175, "Meta-/", "m-/");
		new SubLCharacter(176, "Meta-0", "m-0");
		new SubLCharacter(177, "Meta-1", "m-1");
		new SubLCharacter(178, "Meta-2", "m-2");
		new SubLCharacter(179, "Meta-3", "m-3");
		new SubLCharacter(180, "Meta-4", "m-4");
		new SubLCharacter(181, "Meta-5", "m-5");
		new SubLCharacter(182, "Meta-6", "m-6");
		new SubLCharacter(183, "Meta-7", "m-7");
		new SubLCharacter(184, "Meta-8", "m-8");
		new SubLCharacter(185, "Meta-9", "m-9");
		new SubLCharacter(186, "Meta-:", "m-:");
		new SubLCharacter(187, "Meta-;", "m-;");
		new SubLCharacter(188, "Meta-<", "m-<");
		new SubLCharacter(189, "Meta-=", "m-=");
		new SubLCharacter(190, "Meta->", "m->");
		new SubLCharacter(191, "Meta-?", "m-?");
		new SubLCharacter(192, "Meta-@", "m-@");
		new SubLCharacter(193, "Meta-A", "m-A");
		new SubLCharacter(194, "Meta-B", "m-B");
		new SubLCharacter(195, "Meta-C", "m-C");
		new SubLCharacter(196, "Meta-D", "m-D");
		new SubLCharacter(197, "Meta-E", "m-E");
		new SubLCharacter(198, "Meta-F", "m-F");
		new SubLCharacter(199, "Meta-G", "m-G");
		new SubLCharacter(200, "Meta-H", "m-H");
		new SubLCharacter(201, "Meta-I", "m-I");
		new SubLCharacter(202, "Meta-J", "m-J");
		new SubLCharacter(203, "Meta-K", "m-K");
		new SubLCharacter(204, "Meta-L", "m-L");
		new SubLCharacter(205, "Meta-M", "m-M");
		new SubLCharacter(206, "Meta-N", "m-N");
		new SubLCharacter(207, "Meta-O", "m-O");
		new SubLCharacter(208, "Meta-P", "m-P");
		new SubLCharacter(209, "Meta-Q", "m-Q");
		new SubLCharacter(210, "Meta-R", "m-R");
		new SubLCharacter(211, "Meta-S", "m-S");
		new SubLCharacter(212, "Meta-T", "m-T");
		new SubLCharacter(213, "Meta-U", "m-U");
		new SubLCharacter(214, "Meta-V", "m-V");
		new SubLCharacter(215, "Meta-W", "m-W");
		new SubLCharacter(216, "Meta-X", "m-X");
		new SubLCharacter(217, "Meta-Y", "m-Y");
		new SubLCharacter(218, "Meta-Z", "m-Z");
		new SubLCharacter(219, "Meta-[", "m-[");
		new SubLCharacter(220, "Meta-\\", "m-\\");
		new SubLCharacter(221, "Meta-]", "m-]");
		new SubLCharacter(222, "Meta-^", "m-^");
		new SubLCharacter(223, "Meta-_", "m-_");
		new SubLCharacter(224, "Meta-`", "m-`");
		new SubLCharacter(225, "Meta-a", "m-a");
		new SubLCharacter(226, "Meta-b", "m-b");
		new SubLCharacter(227, "Meta-c", "m-c");
		new SubLCharacter(228, "Meta-d", "m-d");
		new SubLCharacter(229, "Meta-e", "m-e");
		new SubLCharacter(230, "Meta-f", "m-f");
		new SubLCharacter(231, "Meta-g", "m-g");
		new SubLCharacter(232, "Meta-h", "m-h");
		new SubLCharacter(233, "Meta-i", "m-i");
		new SubLCharacter(234, "Meta-j", "m-j");
		new SubLCharacter(235, "Meta-k", "m-k");
		new SubLCharacter(236, "Meta-l", "m-l");
		new SubLCharacter(237, "Meta-m", "m-m");
		new SubLCharacter(238, "Meta-n", "m-n");
		new SubLCharacter(239, "Meta-o", "m-o");
		new SubLCharacter(240, "Meta-p", "m-p");
		new SubLCharacter(241, "Meta-q", "m-q");
		new SubLCharacter(242, "Meta-r", "m-r");
		new SubLCharacter(243, "Meta-s", "m-s");
		new SubLCharacter(244, "Meta-t", "m-t");
		new SubLCharacter(245, "Meta-u", "m-u");
		new SubLCharacter(246, "Meta-v", "m-v");
		new SubLCharacter(247, "Meta-w", "m-w");
		new SubLCharacter(248, "Meta-x", "m-x");
		new SubLCharacter(249, "Meta-y", "m-y");
		new SubLCharacter(250, "Meta-z", "m-z");
		new SubLCharacter(251, "Meta-{", "m-{");
		new SubLCharacter(252, "Meta-|", "m-|");
		new SubLCharacter(253, "Meta-}", "m-}");
		new SubLCharacter(254, "Meta-~", "m-~");
		new SubLCharacter(255, "Meta-Rubout", "m-Rubout");
	}

	final public static int MAX_CHAR_CODE = 255;

	public static char caseInsensitiveConvert(char theChar) {
		return Character.toUpperCase(theChar);
	}

	public static SubLCharacter getCharFromName(SubLString name) {
		Object myChar = null;
		myChar = SubLCharacter.charNameToSubLCharacterMap_CaseSensitive.get(name);
		if (myChar == null)
			// @todo figure out why this lowercasing is needed, I'd expect
			// EQUALP to handle this
			myChar = SubLCharacter.charNameToSubLCharacterMap_CaseInsensitive.get(name.toLowerCase());
		if (myChar == null)
			Errors.error("Invalid character " + name);
		return (SubLCharacter) myChar;
	}

	private static void initChars() {
		for (int i = 0, size = SubLCharacter.charArray.length; i < size; i++) {
			SubLCharacter curChar = SubLCharacter.charArray[i];
			String[] curNames = SubLCharacter.charArray[i].charNames;
			// @hack this will fail if we switch over to UTF-8
			boolean caseSensitive = i >= 65 && i <= 90 || i >= 97 && i <= 122;
			// iff A-Z or a-z, use the case-sensitive map
			SubLHashtable charMap = caseSensitive ? SubLCharacter.charNameToSubLCharacterMap_CaseSensitive
					: SubLCharacter.charNameToSubLCharacterMap_CaseInsensitive;
			for (int j = 0, size2 = curNames.length; j < size2; j++) {
				SubLString curName = SubLObjectFactory.makeString(caseSensitive ? curNames[j]
						// @todo figure out why this lowercasing is needed, I'd
						// expect EQUALP to handle this
						: curNames[j].toLowerCase());
				charMap.put(curName, curChar);
			}
		}
	}

	public static SubLCharacter makeChar(int aChar) {
		return SubLCharacter.charArray[aChar];
	}

	private char theChar;

	private String[] charNames;

	private int hashCode;

	private String mainName;

	/**
	 * Creates a new instance of SubLCharacter.
	 */
	private SubLCharacter(int charNum, String name1) {
		if (charNum > SubLCharacter.MAX_CHAR_CODE)
			Errors.error("Got invalid character code: " + charNum);
		this.theChar = (char) charNum;
		SubLCharacter.charArray[charNum] = this;
		this.charNames = new String[1];
		this.charNames[0] = this.mainName = name1;
		this.hashCode = Character.toLowerCase(this.theChar);
	}

	/**
	 * Creates a new instance of SubLCharacter.
	 */
	private SubLCharacter(int charNum, String name1, String name2) {
		if (charNum > SubLCharacter.MAX_CHAR_CODE)
			Errors.error("Got invalid character code: " + charNum);
		this.theChar = (char) charNum;
		SubLCharacter.charArray[charNum] = this;
		this.charNames = new String[2];
		this.charNames[0] = this.mainName = name1;
		this.charNames[1] = name2;
		this.hashCode = Character.toLowerCase(this.theChar);
	}

	/**
	 * Creates a new instance of SubLCharacter.
	 */
	private SubLCharacter(int charNum, String name1, String name2, String name3) {
		if (charNum > SubLCharacter.MAX_CHAR_CODE)
			Errors.error("Got invalid character code: " + charNum);
		this.theChar = (char) charNum;
		SubLCharacter.charArray[charNum] = this;
		this.charNames = new String[3];
		this.charNames[0] = this.mainName = name1;
		this.charNames[1] = name2;
		this.charNames[2] = name3;
		this.hashCode = Character.toLowerCase(this.theChar);
	}

	/**
	 * Creates a new instance of SubLCharacter.
	 */
	private SubLCharacter(int charNum, String name1, String name2, String name3, String name4) {
		if (charNum > SubLCharacter.MAX_CHAR_CODE)
			Errors.error("Got invalid character code: " + charNum);
		this.theChar = (char) charNum;
		SubLCharacter.charArray[charNum] = this;
		this.charNames = new String[4];
		this.charNames[0] = this.mainName = name1;
		this.charNames[1] = name2;
		this.charNames[2] = name3;
		this.charNames[3] = name4;
		this.hashCode = Character.toLowerCase(this.theChar);
	}

	public boolean canFastHash() {
		return true;
	};

	//// CASE SENSITIVE COMPARISONS

	public int charInDigitNumber(int radix) {
		if (radix > Character.MAX_RADIX)
			Errors.error(radix + " is too large to be an input radix.");
		if (radix < Character.MIN_RADIX)
			Errors.error(radix + " is too small to be an input radix.");
		int val = Character.digit(this.theChar, radix);
		return val;
	};

	/** Method created to avoid casting */
	public char charValue() {
		return this.theChar;
	}

	public Object clone() {
		return this;
	};

	public int compareTo(Object o) {
		if (this.equals(o))
			return 0;
		// @todo throw a better error if o is not of the right type -APB
		return this.lessThan((SubLCharacter) o) ? -1 : 1;
	}

	/** equalp is case-insensitive for characters. */
	public boolean equalp(SubLObject obj) {
		if (this == obj)
			return true;
		if (!obj.isChar())
			return false;
		return this.equalsIgnoringCase(obj.toChar());
	};

	public boolean equals(Object obj) {
		return obj == this;
	}

	public boolean equalsIgnoringCase(SubLCharacter c) {
		return SubLCharacter.caseInsensitiveConvert(this.theChar) == SubLCharacter.caseInsensitiveConvert(c.theChar);
	};

	public char getChar() {
		return this.theChar;
	}

	public SubLSymbol getType() {
		return Types.$dtp_character$;
	};

	public SubLFixnum getTypeCode() {
		return CommonSymbols.EIGHT_INTEGER;
	}

	//// CASE INSENSITIVE COMPARISONS

	public boolean greaterThan(SubLCharacter c) {
		return this.theChar > c.theChar;
	};

	public boolean greaterThanIgnoringCase(SubLCharacter c) {
		return SubLCharacter.caseInsensitiveConvert(this.theChar) > SubLCharacter.caseInsensitiveConvert(c.theChar);
	}

	public boolean greaterThanOrEqual(SubLCharacter c) {
		return this.theChar >= c.theChar;
	};

	public boolean greaterThanOrEqualIgnoringCase(SubLCharacter c) {
		return SubLCharacter.caseInsensitiveConvert(this.theChar) >= SubLCharacter.caseInsensitiveConvert(c.theChar);
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < SubLObject.MAX_HASH_DEPTH)
			return this.hashCode;
		else
			return SubLObject.DEFAULT_EXCEEDED_HASH_VALUE;
	};

	public boolean isAlphaChar() {
		return Character.isLetter(this.theChar);
	}

	public boolean isAlphNumeric() {
		return Character.isLetterOrDigit(this.theChar);
	};

	public boolean isAtom() {
		return true;
	}

	public boolean isBigIntegerBignum() {
		return false;
	};

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return false;
	}

	public boolean isBothCases() {
		return this.isUpperCase() && this.isLowerCase();
	}

	public boolean isChar() {
		return true;
	}

	public boolean isCharInDigitNumber(int radix) {
		int val = this.charInDigitNumber(radix);
		return val >= 0;
	}

	public boolean isCons() {
		return false;
	}

	public boolean isDigit() {
		return Character.isDigit(this.theChar);
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

	public boolean isLowerCase() {
		return Character.isLowerCase(this.theChar);
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
		return false;
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

	public boolean isUpperCase() {
		return Character.isUpperCase(this.theChar);
	}

	public boolean isVector() {
		return false;
	}

	public boolean lessThan(SubLCharacter c) {
		return this.theChar < c.theChar;
	}

	//// Protected Area

	//// Private Area

	public boolean lessThanIgnoringCase(SubLCharacter c) {
		return SubLCharacter.caseInsensitiveConvert(this.theChar) < SubLCharacter.caseInsensitiveConvert(c.theChar);
	}

	//// Internal Rep

	public boolean lessThanOrEqual(SubLCharacter c) {
		return this.theChar <= c.theChar;
	}

	public boolean lessThanOrEqualIgnoringCase(SubLCharacter c) {
		return SubLCharacter.caseInsensitiveConvert(this.theChar) <= SubLCharacter.caseInsensitiveConvert(c.theChar);
	}

	public SubLObject makeCopy() {
		return this;
	}

	public SubLObject makeDeepCopy() {
		return this;
	}

	/** Method created to avoid casting */
	public SubLCharacter toChar() {
		return this;
	}

	public SubLCharacter toLowerCase() {
		return SubLCharacter.makeChar(Character.toLowerCase(this.theChar));
	}

	public String toString() {
		return "#\\" + this.mainName;
	}

	public String toTypeName() {
		return SubLCharacter.CHAR_TYPE_NAME;
	};

	public SubLCharacter toUpperCase() {
		return SubLCharacter.makeChar(Character.toUpperCase(this.theChar));
	}

	// common lisp addtions

	public String writeToString() {
		// TODO Auto-generated method stub
		return this.toString();
	}

	static {
		SubLCharacter.initChars();
	}

}
