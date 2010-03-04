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

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// Internal Imports

//// External Imports

public  class Characters extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of Characters. */
  public Characters() {}
  public static final SubLFile me = new Characters();
  
  //// Public Area
  
  public static final SubLObject alphanumericp(SubLObject c) {
    if (c.toChar().isAlphNumeric()) {
      return T;
    }
    return NIL;
  }
  
  public static final SubLObject digit_char_p(SubLObject c, SubLObject radix) {
    if (radix == UNPROVIDED) { radix = TEN_INTEGER; }
    final int result = c.toChar().charInDigitNumber(radix.intValue());
    if (result >= 0) {
      return SubLNumberFactory.makeInteger(result);
    } else {
      return NIL;
    }
  }
  
  public static final SubLObject alpha_char_p(SubLObject c) {
    if (c.toChar().isAlphaChar()) {
      return T;
    }
    return NIL;
  }
  
  public static final SubLObject upper_case_p(SubLObject c) {
    if (c.toChar().isUpperCase()) {
      return T;
    }
    return NIL;
  }
  
  public static final SubLObject lower_case_p(SubLObject c) {
    if (c.toChar().isLowerCase()) {
      return T;
    }
    return NIL;
  }
  
  public static final SubLObject both_case_p(SubLObject c) {
    return alpha_char_p(c);
  }
  
  public static final SubLObject char_code(SubLObject c) {
    return SubLObjectFactory.makeInteger(c.charValue()); //@todo consider storing the code as a number
  }
  
  public static final SubLObject code_char(SubLObject code) {
   int val = code.intValue();
   if ((val < 0) || (val > SubLCharacter.MAX_CHAR_CODE)) { 
     return NIL;
   }
    return SubLCharacter.makeChar(val);
  }
  
  public static final SubLObject digit_char(SubLObject digit) {
    char val = Character.toUpperCase(Character.forDigit(digit.intValue(), Character.MAX_RADIX));
    if (val == 0) { return NIL; }
    return SubLObjectFactory.makeChar(val);
  }
  
  public static final SubLObject name_character(SubLObject namestring) {
    return SubLCharacter.getCharFromName(namestring.toStr());
  }
  
  public static final SubLObject char_upcase(SubLObject c) {
    return c.toChar().toUpperCase();
  }
  
  public static final SubLObject char_downcase(SubLObject c) {
    return c.toChar().toLowerCase();
  }
  
  // Case insensitive comparisons
  
  public static final SubLObject char_equal(SubLObject char1, SubLObject char2) {
    if (char1.toChar().equalsIgnoringCase(char2.toChar())) {
      return T;
    }
    return NIL;
  }
  
  public static final SubLObject char_not_equal(SubLObject char1, SubLObject char2) {
    if (char1.toChar().equalsIgnoringCase(char2.toChar())) {
      return NIL;
    }
    return T;
  }
  
  public static final SubLObject char_greaterp(SubLObject char1, SubLObject char2) {
    if (char1.toChar().greaterThanIgnoringCase(char2.toChar())) {
      return T;
    }
    return NIL;
  }
  
  public static final SubLObject char_lessp(SubLObject char1, SubLObject char2) {
    if (char1.toChar().lessThanIgnoringCase(char2.toChar())) {
      return T;
    }
    return NIL;
  }
  
  public static final SubLObject char_not_greaterp(SubLObject char1, SubLObject char2) {
    if (char1.toChar().lessThanOrEqualIgnoringCase(char2.toChar())) {
      return T;
    }
    return NIL;
  }
  
  public static final SubLObject char_not_lessp(SubLObject char1, SubLObject char2) {
    if (char1.toChar().greaterThanOrEqualIgnoringCase(char2.toChar())) {
      return T;
    }
    return NIL;
  }
  
  // Case sensitive comparisons
  
  public static final SubLObject charE(SubLObject char1, SubLObject char2) {
    return (char1 == char2) ? T : NIL; //@hack should be .toChar() calls here
  }
  
  public static final SubLObject charNE(SubLObject char1, SubLObject char2) {
    return (char1 == char2) ? NIL : T; //@hack should be .toChar() calls here
  }
  
  public static final SubLObject charG(SubLObject char1, SubLObject char2) {
    return (char1.toChar().greaterThan(char2.toChar())) ? T : NIL;
  }
  
  public static final SubLObject charL(SubLObject char1, SubLObject char2) {
    return (char1.toChar().lessThan(char2.toChar())) ? T : NIL;
  }
  
  public static final SubLObject charLE(SubLObject char1, SubLObject char2) {
    return (char1.toChar().lessThanOrEqual(char2.toChar())) ? T : NIL;
  }
  
  public static final SubLObject charGE(SubLObject char1, SubLObject char2) {
    return (char1.toChar().greaterThanOrEqual(char2.toChar())) ? T : NIL;
  }
  
  public static SubLCharacter CHAR_null;
  public static SubLCharacter CHAR_backspace;
  public static SubLCharacter CHAR_tab;
  public static SubLCharacter CHAR_newline;
  public static SubLCharacter CHAR_return;
  public static SubLCharacter CHAR_page;
  public static SubLCharacter CHAR_escape;
  public static SubLCharacter CHAR_space;
  public static SubLCharacter CHAR_exclamation;
  public static SubLCharacter CHAR_quotation;
  public static SubLCharacter CHAR_hash;
  public static SubLCharacter CHAR_dollar;
  public static SubLCharacter CHAR_percent;
  public static SubLCharacter CHAR_ampersand;
  public static SubLCharacter CHAR_quote;
  public static SubLCharacter CHAR_lparen;
  public static SubLCharacter CHAR_rparen;
  public static SubLCharacter CHAR_asterisk;
  public static SubLCharacter CHAR_plus;
  public static SubLCharacter CHAR_comma;
  public static SubLCharacter CHAR_hyphen;
  public static SubLCharacter CHAR_period;
  public static SubLCharacter CHAR_slash;
  public static SubLCharacter CHAR_0;
  public static SubLCharacter CHAR_1;
  public static SubLCharacter CHAR_2;
  public static SubLCharacter CHAR_3;
  public static SubLCharacter CHAR_4;
  public static SubLCharacter CHAR_5;
  public static SubLCharacter CHAR_6;
  public static SubLCharacter CHAR_7;
  public static SubLCharacter CHAR_8;
  public static SubLCharacter CHAR_9;
  public static SubLCharacter CHAR_colon;
  public static SubLCharacter CHAR_semicolon;
  public static SubLCharacter CHAR_less;
  public static SubLCharacter CHAR_equal;
  public static SubLCharacter CHAR_greater;
  public static SubLCharacter CHAR_question;
  public static SubLCharacter CHAR_at;
  public static SubLCharacter CHAR_A;
  public static SubLCharacter CHAR_B;
  public static SubLCharacter CHAR_C;
  public static SubLCharacter CHAR_D;
  public static SubLCharacter CHAR_E;
  public static SubLCharacter CHAR_F;
  public static SubLCharacter CHAR_G;
  public static SubLCharacter CHAR_H;
  public static SubLCharacter CHAR_I;
  public static SubLCharacter CHAR_J;
  public static SubLCharacter CHAR_K;
  public static SubLCharacter CHAR_L;
  public static SubLCharacter CHAR_M;
  public static SubLCharacter CHAR_N;
  public static SubLCharacter CHAR_O;
  public static SubLCharacter CHAR_P;
  public static SubLCharacter CHAR_Q;
  public static SubLCharacter CHAR_R;
  public static SubLCharacter CHAR_S;
  public static SubLCharacter CHAR_T;
  public static SubLCharacter CHAR_U;
  public static SubLCharacter CHAR_V;
  public static SubLCharacter CHAR_W;
  public static SubLCharacter CHAR_X;
  public static SubLCharacter CHAR_Y;
  public static SubLCharacter CHAR_Z;
  public static SubLCharacter CHAR_lbracket;
  public static SubLCharacter CHAR_backslash;
  public static SubLCharacter CHAR_rbracket;
  public static SubLCharacter CHAR_caret;
  public static SubLCharacter CHAR_underbar;
  public static SubLCharacter CHAR_backquote;
  public static SubLCharacter CHAR_a;
  public static SubLCharacter CHAR_b;
  public static SubLCharacter CHAR_c;
  public static SubLCharacter CHAR_d;
  public static SubLCharacter CHAR_e;
  public static SubLCharacter CHAR_f;
  public static SubLCharacter CHAR_g;
  public static SubLCharacter CHAR_h;
  public static SubLCharacter CHAR_i;
  public static SubLCharacter CHAR_j;
  public static SubLCharacter CHAR_k;
  public static SubLCharacter CHAR_l;
  public static SubLCharacter CHAR_m;
  public static SubLCharacter CHAR_n;
  public static SubLCharacter CHAR_o;
  public static SubLCharacter CHAR_p;
  public static SubLCharacter CHAR_q;
  public static SubLCharacter CHAR_r;
  public static SubLCharacter CHAR_s;
  public static SubLCharacter CHAR_t;
  public static SubLCharacter CHAR_u;
  public static SubLCharacter CHAR_v;
  public static SubLCharacter CHAR_w;
  public static SubLCharacter CHAR_x;
  public static SubLCharacter CHAR_y;
  public static SubLCharacter CHAR_z;
  public static SubLCharacter CHAR_lbrace;
  public static SubLCharacter CHAR_vertical;
  public static SubLCharacter CHAR_rbrace;
  public static SubLCharacter CHAR_tilde;
  public static SubLCharacter CHAR_rubout;
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "alpha_char_p", "ALPHA-CHAR-P", 1, 0, false);
    SubLFiles.declareFunction(me, "alphanumericp", "ALPHANUMERICP", 1, 0, false);
    SubLFiles.declareFunction(me, "both_case_p", "BOTH-CASE-P", 1, 0, false);
    SubLFiles.declareFunction(me, "char_code", "CHAR-CODE", 1, 0, false);
    SubLFiles.declareFunction(me, "char_downcase", "CHAR-DOWNCASE", 1, 0, false);
    SubLFiles.declareFunction(me, "char_equal", "CHAR-EQUAL", 2, 0, false);
    SubLFiles.declareFunction(me, "char_greaterp", "CHAR-GREATERP", 2, 0, false);
    SubLFiles.declareFunction(me, "char_lessp", "CHAR-LESSP", 2, 0, false);
    SubLFiles.declareFunction(me, "char_not_equal", "CHAR-NOT-EQUAL", 2, 0, false);
    SubLFiles.declareFunction(me, "char_not_greaterp", "CHAR-NOT-GREATERP", 2, 0, false);
    SubLFiles.declareFunction(me, "char_not_lessp", "CHAR-NOT-LESSP", 2, 0, false);
    SubLFiles.declareFunction(me, "char_upcase", "CHAR-UPCASE", 1, 0, false);
    SubLFiles.declareFunction(me, "charNE", "CHAR/=", 2, 0, false);
    SubLFiles.declareFunction(me, "charL", "CHAR<", 2, 0, false);
    SubLFiles.declareFunction(me, "charLE", "CHAR<=", 2, 0, false);
    SubLFiles.declareFunction(me, "charE", "CHAR=", 2, 0, false);
    SubLFiles.declareFunction(me, "charG", "CHAR>", 2, 0, false);
    SubLFiles.declareFunction(me, "charGE", "CHAR>=", 2, 0, false);
    SubLFiles.declareFunction(me, "code_char", "CODE-CHAR", 1, 0, false);
    SubLFiles.declareFunction(me, "digit_char", "DIGIT-CHAR", 1, 0, false);
    SubLFiles.declareFunction(me, "digit_char_p", "DIGIT-CHAR-P", 1, 1, false);
    SubLFiles.declareFunction(me, "lower_case_p", "LOWER-CASE-P", 1, 0, false);
    SubLFiles.declareFunction(me, "upper_case_p", "UPPER-CASE-P", 1, 0, false);
    SubLFiles.declareFunction(me, "name_character", "NAME-CHARACTER", 1, 0, false);
  }
  
  public void initializeVariables() {
    CHAR_null = SubLObjectFactory.makeChar((char) 0);
    CHAR_backspace =SubLObjectFactory.makeChar('\b');
    CHAR_tab = SubLObjectFactory.makeChar('\t');
    CHAR_newline = SubLObjectFactory.makeChar('\n');
    CHAR_return = SubLObjectFactory.makeChar('\r');
    CHAR_page = SubLObjectFactory.makeChar('\f');
    CHAR_escape = SubLObjectFactory.makeChar((char) 27);
    CHAR_space = SubLObjectFactory.makeChar(' ');
    CHAR_exclamation = SubLObjectFactory.makeChar('!');
    CHAR_quotation = SubLObjectFactory.makeChar('"');
    CHAR_hash = SubLObjectFactory.makeChar('#');
    CHAR_dollar = SubLObjectFactory.makeChar('$');
    CHAR_percent = SubLObjectFactory.makeChar('%');
    CHAR_ampersand = SubLObjectFactory.makeChar('&');
    CHAR_quote = SubLObjectFactory.makeChar('\'');
    CHAR_lparen = SubLObjectFactory.makeChar('(');
    CHAR_rparen = SubLObjectFactory.makeChar(')');
    CHAR_asterisk = SubLObjectFactory.makeChar('*');
    CHAR_plus = SubLObjectFactory.makeChar('+');
    CHAR_comma = SubLObjectFactory.makeChar(',');
    CHAR_hyphen = SubLObjectFactory.makeChar('-');
    CHAR_period = SubLObjectFactory.makeChar('.');
    CHAR_slash = SubLObjectFactory.makeChar('/');
    CHAR_0 = SubLObjectFactory.makeChar('0');
    CHAR_1 = SubLObjectFactory.makeChar('1');
    CHAR_2 = SubLObjectFactory.makeChar('2');
    CHAR_3 = SubLObjectFactory.makeChar('3');
    CHAR_4 = SubLObjectFactory.makeChar('4');
    CHAR_5 = SubLObjectFactory.makeChar('5');
    CHAR_6 = SubLObjectFactory.makeChar('6');
    CHAR_7 = SubLObjectFactory.makeChar('7');
    CHAR_8 = SubLObjectFactory.makeChar('8');
    CHAR_9 = SubLObjectFactory.makeChar('9');
    CHAR_colon = SubLObjectFactory.makeChar(':');
    CHAR_semicolon = SubLObjectFactory.makeChar(';');
    CHAR_less = SubLObjectFactory.makeChar('<');
    CHAR_equal = SubLObjectFactory.makeChar('=');
    CHAR_greater = SubLObjectFactory.makeChar('>');
    CHAR_question = SubLObjectFactory.makeChar('?');
    CHAR_at = SubLObjectFactory.makeChar('@');
    CHAR_A = SubLObjectFactory.makeChar('A');
    CHAR_B = SubLObjectFactory.makeChar('B');
    CHAR_C = SubLObjectFactory.makeChar('C');
    CHAR_D = SubLObjectFactory.makeChar('D');
    CHAR_E = SubLObjectFactory.makeChar('E');
    CHAR_F = SubLObjectFactory.makeChar('F');
    CHAR_G = SubLObjectFactory.makeChar('G');
    CHAR_H = SubLObjectFactory.makeChar('H');
    CHAR_I = SubLObjectFactory.makeChar('I');
    CHAR_J = SubLObjectFactory.makeChar('J');
    CHAR_K = SubLObjectFactory.makeChar('K');
    CHAR_L = SubLObjectFactory.makeChar('L');
    CHAR_M = SubLObjectFactory.makeChar('M');
    CHAR_N = SubLObjectFactory.makeChar('N');
    CHAR_O = SubLObjectFactory.makeChar('O');
    CHAR_P = SubLObjectFactory.makeChar('P');
    CHAR_Q = SubLObjectFactory.makeChar('Q');
    CHAR_R = SubLObjectFactory.makeChar('R');
    CHAR_S = SubLObjectFactory.makeChar('S');
    CHAR_T = SubLObjectFactory.makeChar('T');
    CHAR_U = SubLObjectFactory.makeChar('U');
    CHAR_V = SubLObjectFactory.makeChar('V');
    CHAR_W = SubLObjectFactory.makeChar('W');
    CHAR_X = SubLObjectFactory.makeChar('X');
    CHAR_Y = SubLObjectFactory.makeChar('Y');
    CHAR_Z = SubLObjectFactory.makeChar('Z');
    CHAR_lbracket = SubLObjectFactory.makeChar('[');
    CHAR_backslash = SubLObjectFactory.makeChar('\\');
    CHAR_rbracket = SubLObjectFactory.makeChar(']');
    CHAR_caret = SubLObjectFactory.makeChar('^');
    CHAR_underbar = SubLObjectFactory.makeChar('_');
    CHAR_backquote = SubLObjectFactory.makeChar('`');
    CHAR_a = SubLObjectFactory.makeChar('a');
    CHAR_b = SubLObjectFactory.makeChar('b');
    CHAR_c = SubLObjectFactory.makeChar('c');
    CHAR_d = SubLObjectFactory.makeChar('d');
    CHAR_e = SubLObjectFactory.makeChar('e');
    CHAR_f = SubLObjectFactory.makeChar('f');
    CHAR_g = SubLObjectFactory.makeChar('g');
    CHAR_h = SubLObjectFactory.makeChar('h');
    CHAR_i = SubLObjectFactory.makeChar('i');
    CHAR_j = SubLObjectFactory.makeChar('j');
    CHAR_k = SubLObjectFactory.makeChar('k');
    CHAR_l = SubLObjectFactory.makeChar('l');
    CHAR_m = SubLObjectFactory.makeChar('m');
    CHAR_n = SubLObjectFactory.makeChar('n');
    CHAR_o = SubLObjectFactory.makeChar('o');
    CHAR_p = SubLObjectFactory.makeChar('p');
    CHAR_q = SubLObjectFactory.makeChar('q');
    CHAR_r = SubLObjectFactory.makeChar('r');
    CHAR_s = SubLObjectFactory.makeChar('s');
    CHAR_t = SubLObjectFactory.makeChar('t');
    CHAR_u = SubLObjectFactory.makeChar('u');
    CHAR_v = SubLObjectFactory.makeChar('v');
    CHAR_w = SubLObjectFactory.makeChar('w');
    CHAR_x = SubLObjectFactory.makeChar('x');
    CHAR_y = SubLObjectFactory.makeChar('y');
    CHAR_z = SubLObjectFactory.makeChar('z');
    CHAR_lbrace = SubLObjectFactory.makeChar('{');
    CHAR_vertical = SubLObjectFactory.makeChar('|');
    CHAR_rbrace = SubLObjectFactory.makeChar('}');
    CHAR_tilde = SubLObjectFactory.makeChar('~');
    CHAR_rubout = SubLObjectFactory.makeChar('\u007F');
    //charNameToSubLCharacterMap.put("Null", CHAR_null);
    //charNameToSubLCharacterMap.put("NUL", CHAR_null);
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area
  
  
  //// Internal Rep
  
  //// Main
  
}
