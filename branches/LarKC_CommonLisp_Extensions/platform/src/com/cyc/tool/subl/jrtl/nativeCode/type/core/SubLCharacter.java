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

package  com.cyc.tool.subl.jrtl.nativeCode.type.core;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// External Imports

public  final class SubLCharacter extends AbstractSubLObject implements SubLObject, Comparable {
  
	// common lisp addtions
	@Override
	public String writeToString() {
		// TODO Auto-generated method stub
		return toString();
	}
	
  //// Constructors
  
  /**
   * Creates a new instance of SubLCharacter.
   */
  private SubLCharacter(int charNum, String name1) {
    if (charNum > MAX_CHAR_CODE) {
      Errors.error("Got invalid character code: " + (int)charNum);
    }
    theChar = (char)charNum;
    charArray[charNum] = this;
    charNames = new String[1];
    charNames[0] = mainName = name1;
    hashCode = Character.toLowerCase(theChar);
  }
  
  /**
   * Creates a new instance of SubLCharacter.
   */
  private SubLCharacter(int charNum, String name1, String name2) {
    if (charNum > MAX_CHAR_CODE) {
      Errors.error("Got invalid character code: " + (int)charNum);
    }
    theChar = (char)charNum;
    charArray[charNum] = this;
    charNames = new String[2];
    charNames[0] = mainName = name1;
    charNames[1] = name2;
    hashCode = Character.toLowerCase(theChar);
  }
  
  /**
   * Creates a new instance of SubLCharacter.
   */
  private SubLCharacter(int charNum, String name1, String name2, String name3) {
    if (charNum > MAX_CHAR_CODE) {
      Errors.error("Got invalid character code: " + (int)charNum);
    }
    theChar = (char)charNum;
    charArray[charNum] = this;
    charNames = new String[3];
    charNames[0] = mainName = name1;
    charNames[1] = name2;
    charNames[2] = name3;
    hashCode = Character.toLowerCase(theChar);
  }
   
  /**
   * Creates a new instance of SubLCharacter.
   */
  private SubLCharacter(int charNum, String name1, String name2, String name3, String name4) {
    if (charNum > MAX_CHAR_CODE) {
      Errors.error("Got invalid character code: " + (int)charNum);
    }
    theChar = (char)charNum;
    charArray[charNum] = this;
    charNames = new String[4];
    charNames[0] = mainName = name1;
    charNames[1] = name2;
    charNames[2] = name3;
    charNames[3] = name4;
    hashCode = Character.toLowerCase(theChar);
  }
  
  public static final SubLCharacter makeChar(int aChar) {
    return charArray[aChar];
  }
  
  //// Public Area
  
  /** Method created to avoid casting */
  public final SubLCharacter toChar() { 
    return this;
  }
  
  /** Method created to avoid casting */
  public final char charValue() {
    return theChar;
  }
  
  public static final SubLCharacter getCharFromName(SubLString name) {
    Object myChar = null;
    myChar = charNameToSubLCharacterMap_CaseSensitive.get(name);
    if (myChar == null) {
      // @todo figure out why this lowercasing is needed, I'd expect EQUALP to handle this
      myChar = charNameToSubLCharacterMap_CaseInsensitive.get(name.toLowerCase());
    }
    if (myChar == null) {
      Errors.error("Invalid character " + name);
    }
    return (SubLCharacter)myChar;
  }
  
  public final char getChar() {
    return theChar;
  }
  
  public final int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return hashCode;
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  
  public final boolean canFastHash() {
    return true;
  }
  
  public final Object clone() {
    return this;
  }
  
  public final SubLObject makeCopy() {
    return this;
  }
  
  public final SubLObject makeDeepCopy() {
    return this;
  }
  
  public final String toString() {
    return "#\\" + mainName;
  }
  
  public final boolean isAlphaChar() {
    return Character.isLetter(theChar);
  }
  
  public final boolean isUpperCase() {
    return Character.isUpperCase(theChar);
  }
  
  public final boolean isLowerCase() {
    return Character.isLowerCase(theChar);
  }
  
  public final boolean isBothCases() {
    return isUpperCase() && isLowerCase();
  }
  
  public final boolean isDigit() {
    return Character.isDigit(theChar);
  }
  
  public final boolean isAlphNumeric() {
    return Character.isLetterOrDigit(theChar);
  }
  
  public final boolean isCharInDigitNumber(int radix) {
    final int val = charInDigitNumber(radix);
    return val >= 0;
  }
  
  public final int charInDigitNumber(int radix) {
    if (radix > Character.MAX_RADIX) {
      Errors.error(radix + " is too large to be an input radix.");
    }
    if (radix < Character.MIN_RADIX) {
      Errors.error(radix + " is too small to be an input radix.");
    }
    final int val = Character.digit(theChar, radix);
    return val;
  }
  
  public final SubLCharacter toUpperCase() {
    return makeChar(Character.toUpperCase(theChar));
  }
  
  public final SubLCharacter toLowerCase() {
    return makeChar(Character.toLowerCase(theChar));
  }
  
  public final int compareTo(Object o) {
    if (equals(o)) { return 0; }
    //@todo throw a better error if o is not of the right type -APB
    return lessThan((SubLCharacter)o) ? -1 : 1;
  }
  
  public final boolean lessThan(SubLCharacter c) {
    return theChar < c.theChar;
  }
  
  public final boolean lessThanOrEqual(SubLCharacter c) {
    return theChar <= c.theChar;
  }
  
  public final boolean greaterThan(SubLCharacter c) {
    return theChar > c.theChar;
  }
  
  public final boolean greaterThanOrEqual(SubLCharacter c) {
    return theChar >= c.theChar;
  }
  
  public final boolean lessThanIgnoringCase(SubLCharacter c) {
    return caseInsensitiveConvert(theChar) < caseInsensitiveConvert(c.theChar);
  }
  
  public final boolean lessThanOrEqualIgnoringCase(SubLCharacter c) {
    return caseInsensitiveConvert(theChar) <= caseInsensitiveConvert(c.theChar);
  }
  
  public final boolean greaterThanIgnoringCase(SubLCharacter c) {
    return caseInsensitiveConvert(theChar) > caseInsensitiveConvert(c.theChar);
  }
  
  public final boolean greaterThanOrEqualIgnoringCase(SubLCharacter c) {
    return caseInsensitiveConvert(theChar) >= caseInsensitiveConvert(c.theChar);
  }
  
  public final boolean equals(Object obj) {
    return obj == this;
  }
  
  public final boolean equalsIgnoringCase(SubLCharacter c) {
    return caseInsensitiveConvert(theChar) == caseInsensitiveConvert(c.theChar);
  }
  
  /** equalp is case-insensitive for characters. */
  public final boolean equalp(SubLObject obj) {
    if (this == obj) { return true; }
    if (!obj.isChar()) { return false; }
    return equalsIgnoringCase(obj.toChar());
  }
  
  public final static String CHAR_TYPE_NAME = "CHAR";
  
  public String toTypeName() {
    return CHAR_TYPE_NAME;
  }
  
  public static interface CaseInsensitiveDesc {}
  
  public static interface CaseSensitiveDesc {}
  
  public static interface CharCompareDesc {
    public boolean isCaseSensitive();
    public boolean compare(char char1, char char2);
    public int process(int prefixSize, int charsLeft1, int charsLeft2);
  };
  
  //// CASE SENSITIVE COMPARISONS
  
  private static final class CharE_Desc implements CharCompareDesc, CaseSensitiveDesc {
    public boolean isCaseSensitive() { return true; }
    public boolean compare(char char1, char char2) { return char1 == char2; }
    public int process(int prefixSize, int charsLeft1, int charsLeft2) { 
      return ((charsLeft1 == charsLeft2) && (charsLeft1 == 0)) ? prefixSize : -1;
    }
  };
  
  public static final CharCompareDesc charE_Desc = new CharE_Desc();
  
  private static final class CharL_Desc implements CharCompareDesc, CaseSensitiveDesc {
    public boolean isCaseSensitive() { return true; }
    public boolean compare(char char1, char char2) { return char1 < char2; }
    public int process(int prefixSize, int charsLeft1, int charsLeft2) { 
      return (charsLeft1 < charsLeft2) ? prefixSize : -1;
    }
  };
  
  public static final CharCompareDesc charL_Desc = new CharL_Desc();
  
  private static final class CharLE_Desc implements CharCompareDesc, CaseSensitiveDesc {
    public boolean isCaseSensitive() { return true; }
    public boolean compare(char char1, char char2) { return char1 <= char2; }
    public int process(int prefixSize, int charsLeft1, int charsLeft2) { 
      return (charsLeft1 <= charsLeft2) ? prefixSize : -1; 
    }
  };
  
  public static final CharCompareDesc charLE_Desc = new CharLE_Desc();
  
  private static final class CharG_Desc implements CharCompareDesc, CaseSensitiveDesc {
    public boolean isCaseSensitive() { return true; }
    public boolean compare(char char1, char char2) { return char1 > char2; }
    public int process(int prefixSize, int charsLeft1, int charsLeft2) { 
      return (charsLeft1 > charsLeft2) ? prefixSize : -1; 
    }
  };
  
  public static final CharCompareDesc charG_Desc = new CharG_Desc();
  
  private static final class CharGE_Desc implements CharCompareDesc, CaseSensitiveDesc {
    public boolean isCaseSensitive() { return true; }
    public boolean compare(char char1, char char2) { return char1 >= char2; }
    public int process(int prefixSize, int charsLeft1, int charsLeft2) { 
      return (charsLeft1 >= charsLeft2) ? prefixSize : -1; 
    }
  };
  
  public static final CharCompareDesc charGE_Desc = new CharGE_Desc();
  
  
  //// CASE INSENSITIVE COMPARISONS
  
  private static final class CharEIgnoringCase_Description implements CharCompareDesc, CaseInsensitiveDesc {
    public boolean isCaseSensitive() { return false; }
    public boolean compare(char char1, char char2) { 
      return caseInsensitiveConvert(char1) == caseInsensitiveConvert(char2); 
    }
    public int process(int prefixSize, int charsLeft1, int charsLeft2) { 
      return ((charsLeft1 == charsLeft2) && (charsLeft1 == 0)) ? prefixSize : -1; 
    }
  };
  
  public static final CharCompareDesc charEIgnoringCaseDesc = new CharEIgnoringCase_Description();
  
  private static final class CharLIgnoringCase_Description implements CharCompareDesc, CaseInsensitiveDesc {
    public boolean isCaseSensitive() { return false; }
    public boolean compare(char char1, char char2) { 
      return caseInsensitiveConvert(char1) < caseInsensitiveConvert(char2); 
    }
    public int process(int prefixSize, int charsLeft1, int charsLeft2) { 
      return charsLeft1 < charsLeft2 ? prefixSize : -1; 
    }
  };
  
  public static final CharCompareDesc charLIgnoringCaseDesc = new CharLIgnoringCase_Description();
  
  private static final class CharLEIgnoringCase_Description implements CharCompareDesc, CaseInsensitiveDesc {
    public boolean isCaseSensitive() { return false; }
    public boolean compare(char char1, char char2) { 
      return caseInsensitiveConvert(char1) <= caseInsensitiveConvert(char2); 
    }
    public int process(int prefixSize, int charsLeft1, int charsLeft2) { 
      return charsLeft1 <= charsLeft2 ? prefixSize : -1; 
    }
  };
  
  public static final CharCompareDesc charLEIgnoringCaseDesc = new CharLEIgnoringCase_Description();
  
  private static final class CharGIgnoringCase_Description implements CharCompareDesc, CaseInsensitiveDesc {
    public boolean isCaseSensitive() { return false; }
    public boolean compare(char char1, char char2) { 
      return caseInsensitiveConvert(char1) > caseInsensitiveConvert(char2); 
    }
    public int process(int prefixSize, int charsLeft1, int charsLeft2) { { 
      return charsLeft1 > charsLeft2 ? prefixSize : -1; 
    } }
  };
  
  public static final CharCompareDesc charGIgnoringCaseDesc = new CharGIgnoringCase_Description();
  
  private static final class CharGEIgnoringCase_Description implements CharCompareDesc, CaseInsensitiveDesc {
    public boolean isCaseSensitive() { return false; }
    public boolean compare(char char1, char char2) { 
      return caseInsensitiveConvert(char1) >= caseInsensitiveConvert(char2); 
    }
    public int process(int prefixSize, int charsLeft1, int charsLeft2) { 
      return charsLeft1 >= charsLeft2 ? prefixSize : -1; 
    }
  };
  
  public static final CharCompareDesc charGEIgnoringCaseDesc = new CharGEIgnoringCase_Description();
  
  public final SubLSymbol getType(){ 
    return Types.$dtp_character$;
  }
  
  public final SubLFixnum getTypeCode() {
    return CommonSymbols.EIGHT_INTEGER;
  }
    
  public final boolean isNil() { return false; }
  public final boolean isBoolean() { return false; }
  public final boolean isSymbol() { return false; }
  public final boolean isKeyword() { return false; }
  public final boolean isAtom() { return true; }
  public final boolean isCons() { return false; }
  public final boolean isList() { return false; }
  public final boolean isSequence() { return false; }
  public final boolean isNumber() { return false; }
  public final boolean isFixnum() { return false; }
  public final boolean isBignum() { return false; }
  public final boolean isIntBignum() { return false; }
  public final boolean isLongBignum() { return false; }
  public final boolean isBigIntegerBignum() { return false; }
  public final boolean isInteger() { return false; }
  public final boolean isDouble() { return false; }
  public final boolean isChar() { return true; }
  public final boolean isString() { return false; }
  public final boolean isVector() { return false; }
  public final boolean isFunction() { return false; }
  public final boolean isFunctionSpec() { return false; }
  public final boolean isMacroOperator() { return false; }
  public final boolean isHashtable() { return false; }
  public final boolean isProcess() { return false; }
  public final boolean isLock() { return false; }
  public final boolean isReadWriteLock() { return false; }
  public final boolean isStructure() { return false; }
  public final boolean isStream() { return false; }
  public final boolean isPackage() { return false; }
  public final boolean isError() { return false; }
  public final boolean isGuid() { return false; }
  public final boolean isSemaphore() { return false; }
  public final boolean isEnvironment() { return false; }
  public final boolean isHashtableIterator() { return false; }
  public final boolean isRegexPattern() { return false; }
  public final boolean isKeyhash() { return false; }
  public final boolean isKeyhashIterator() { return false; }
  
  public static final char caseInsensitiveConvert(char theChar) {
    return Character.toUpperCase(theChar);
  }
  
  //// Protected Area
  
  //// Private Area
  
  private static final void initChars() {
    for (int i = 0, size = charArray.length; i < size; i++) {
      SubLCharacter curChar = charArray[i];
      String[] curNames = charArray[i].charNames;
      // @hack this will fail if we switch over to UTF-8
      boolean caseSensitive = ((i >= 65) && (i <= 90)) || ((i >= 97) && (i <= 122));
      // iff A-Z or a-z, use the case-sensitive map
      SubLHashtable charMap = caseSensitive
              ? charNameToSubLCharacterMap_CaseSensitive
              : charNameToSubLCharacterMap_CaseInsensitive;
      for (int j = 0, size2 = curNames.length; j < size2; j++) {
        SubLString curName = SubLObjectFactory.makeString(caseSensitive
                ? curNames[j]
                // @todo figure out why this lowercasing is needed, I'd expect EQUALP to handle this
                : curNames[j].toLowerCase());
        charMap.put(curName, curChar);
      }
    }
  }
  
  //// Internal Rep
  
  private final char theChar;
  private final String[] charNames;
  private final int hashCode;
  private final String mainName;
  
  private static final SubLHashtable charNameToSubLCharacterMap_CaseSensitive = 
    SubLObjectFactory.makeHashtable(26*5, BinaryFunction.EQUAL_TEST);
  
  private static final SubLHashtable charNameToSubLCharacterMap_CaseInsensitive =
    SubLObjectFactory.makeHashtable(26*5, BinaryFunction.EQUALP_TEST);      
  
  static final SubLCharacter[] charArray = new SubLCharacter[256];
  
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
  };
  
  static {
    initChars();
  }
  
  public static final int MAX_CHAR_CODE = 255;
  
}
