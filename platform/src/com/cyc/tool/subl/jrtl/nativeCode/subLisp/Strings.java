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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter.CharCompareDesc;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// Internal Imports

//// External Imports

public  final class Strings extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of Strings. */
  public Strings() {}
  public static final SubLFile me = new Strings();
  
  //// Public Area
  
  public static final SubLObject make_string(SubLObject size, SubLObject initialElement) {
    if (initialElement == UNPROVIDED) { initialElement = Characters.CHAR_space; }
    return SubLObjectFactory.makeString(size.intValue(), initialElement.charValue());
  }
  
  public static final SubLObject string(SubLObject object) {
    if (object.isString()) { return object; }
    if (object.isChar()) { return SubLObjectFactory.makeString("" + object.charValue()); }
    if (object.isSymbol()) { return object.toSymbol().getSubLName(); }
    return SubLObjectFactory.makeString("" + object);
  }
  
  public static final SubLObject sublisp_char(SubLObject string, SubLObject index) {
    return string.getCharacter(index.intValue());
  }
  
  public static final SubLObject set_char(SubLObject string, SubLObject index, SubLObject character) {
    string.set(index.intValue(), character);
    return string;
  }
  
  //// STRING EQUAL EQUAL
  
  public static final SubLObject stringE(SubLObject string1, SubLObject string2,
    SubLObject start1, SubLObject end1, SubLObject start2, SubLObject end2) {
    SubLObject result = compare(string1, string2, SubLCharacter.charE_Desc,
      start1, end1, start2, end2);
    return result.isNumber() ? T : result;
  }
  
  public static final SubLObject stringE(SubLObject string1, SubLObject string2) {
    return stringE(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }
  
  //// STRING LESS THAN
  
  public static final SubLObject stringL(SubLObject string1, SubLObject string2,
    SubLObject start1, SubLObject end1, SubLObject start2, SubLObject end2) {
    return compare(string1, string2, SubLCharacter.charL_Desc,
      start1, end1, start2, end2);
  }
  
  public static final SubLObject stringL(SubLObject string1, SubLObject string2) {
    return stringL(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }
  
  ///// STRING LESS THAN OR EQUAL TO
  
  public static final SubLObject stringLE(SubLObject string1, SubLObject string2,
    SubLObject start1, SubLObject end1, SubLObject start2, SubLObject end2) {
    return compare(string1, string2, SubLCharacter.charLE_Desc,
      start1, end1, start2, end2);
  }
  
  public static final SubLObject stringLE(SubLObject string1, SubLObject string2) {
    return stringLE(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }
  
  //// STRING GREATER THAN
  
  public static final SubLObject stringG(SubLObject string1, SubLObject string2,
    SubLObject start1, SubLObject end1, SubLObject start2, SubLObject end2) {
    return compare(string1, string2, SubLCharacter.charG_Desc,
      start1, end1, start2, end2);
  }
  
  public static final SubLObject stringG(SubLObject string1, SubLObject string2) {
    return stringG(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }
  
  ///// STRING GREATER THAN OR EQUAL TO
  
  public static final SubLObject stringGE(SubLObject string1, SubLObject string2,
    SubLObject start1, SubLObject end1, SubLObject start2, SubLObject end2) {
    return compare(string1, string2, SubLCharacter.charGE_Desc,
      start1, end1, start2, end2);
  }
  
  public static final SubLObject stringGE(SubLObject string1, SubLObject string2) {
    return stringGE(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }
  
  //// CASE INSENSITIVE COMPARISONS
  
  public static final SubLObject string_equal(SubLObject string1, 
      SubLObject string2, SubLObject start1, SubLObject end1, 
      SubLObject start2, SubLObject end2) {
    SubLObject result = compare(string1, string2, SubLCharacter.charEIgnoringCaseDesc,
      start1, end1, start2, end2);
    return result.isNumber() ? T : result;
  }
  
  public static final SubLObject string_equal(SubLObject string1, SubLObject string2) {
    return string_equal(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }
  
  public static final SubLObject string_greaterp(SubLObject string1, 
      SubLObject string2, SubLObject start1, SubLObject end1, 
      SubLObject start2, SubLObject end2) {
    return compare(string1, string2, SubLCharacter.charGIgnoringCaseDesc,
      start1, end1, start2, end2);
  }
  
  public static final SubLObject string_greaterp(SubLObject string1, SubLObject string2) {
    return string_greaterp(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }
  
  public static final SubLObject string_lessp(SubLObject string1, 
      SubLObject string2, SubLObject start1, SubLObject end1, 
      SubLObject start2, SubLObject end2) {
    return compare(string1, string2, SubLCharacter.charLIgnoringCaseDesc,
      start1, end1, start2, end2);
  }
  
  public static final SubLObject string_lessp(SubLObject string1, SubLObject string2) {
    return string_lessp(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }
  
  public static final SubLObject string_not_greaterp(SubLObject string1, 
      SubLObject string2, SubLObject start1, SubLObject end1, 
      SubLObject start2, SubLObject end2) {
    return compare(string1, string2, SubLCharacter.charLEIgnoringCaseDesc,
      start1, end1, start2, end2);
  }
  
  public static final SubLObject string_not_greaterp(SubLObject string1, SubLObject string2) {
    return string_not_greaterp(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }
  
  public static final SubLObject string_not_lessp(SubLObject string1, 
      SubLObject string2, SubLObject start1, SubLObject end1, 
      SubLObject start2, SubLObject end2) {
    return compare(string1, string2, SubLCharacter.charGEIgnoringCaseDesc,
      start1, end1, start2, end2);
  }
  
  public static final SubLObject string_not_lessp(SubLObject string1, SubLObject string2) {
    return string_not_lessp(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }
  
  public static final SubLObject string_upcase(SubLObject string,
      SubLObject start, SubLObject end) {
    SubLString stringTyped = string.toStr();
    int startTyped = extractStart(start);
    int endTyped = extractEnd(end);
    SubLString result = stringTyped.toUpperCase(false, startTyped, endTyped);
    return result;
  }
  
  public static final SubLObject string_downcase(SubLObject string,
      SubLObject start, SubLObject end) {
    SubLString stringTyped = string.toStr();
    int startTyped = extractStart(start);
    int endTyped = extractEnd(end);
    SubLString result = stringTyped.toLowerCase(false, startTyped, endTyped);
    return result;
  }
  
  public static final SubLObject string_capitalize(SubLObject string,
      SubLObject start, SubLObject end) {
    SubLString stringTyped = string.toStr();
    int startTyped = extractStart(start);
    int endTyped = extractEnd(end);
    SubLString result = stringTyped.capitalize(false, startTyped, endTyped);
    return result;
  }
  
  public static final SubLObject nstring_upcase(SubLObject string,
      SubLObject start, SubLObject end) {
    SubLString stringTyped = string.toStr();
    int startTyped = extractStart(start);
    int endTyped = extractEnd(end);
    SubLString result = stringTyped.toUpperCase(true, startTyped, endTyped);
    return result;
  }
  
  public static final SubLObject nstring_downcase(SubLObject string,
      SubLObject start, SubLObject end) {
    SubLString stringTyped = string.toStr();
    int startTyped = extractStart(start);
    int endTyped = extractEnd(end);
    SubLString result = stringTyped.toLowerCase(true, startTyped, endTyped);
    return result;
  }
  
  public static final SubLObject nstring_capitalize(SubLObject string,
      SubLObject start, SubLObject end) {
    SubLString stringTyped = string.toStr();
    int startTyped = extractStart(start);
    int endTyped = extractEnd(end);
    SubLString result = stringTyped.capitalize(true, startTyped, endTyped);
    return result;
  }
  
  public static final SubLObject stringNE(SubLObject string1, 
      SubLObject string2, SubLObject start1, SubLObject end1, 
      SubLObject start2, SubLObject end2) {
    return SubLObjectFactory.
      makeBoolean(stringE(string1, string2, start1, end1, start2, end2) == NIL);
  }
  
  public static final SubLObject stringNE(SubLObject string1, SubLObject string2) {
    return stringNE(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }
  
  public static final SubLObject string_not_equal(SubLObject string1, 
      SubLObject string2, SubLObject start1, SubLObject end1, 
      SubLObject start2, SubLObject end2) {
    return SubLObjectFactory.
      makeBoolean(string_equal(string1, string2, start1, end1, start2, end2) == NIL);
  }
  
  public static final SubLObject string_not_equal(SubLObject string1, SubLObject string2) {
    return string_not_equal(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }
  
  public static final SubLObject string_left_trim(SubLObject char_list, SubLObject string) {
    return string.toStr().leftTrim(char_list.toSeq());
  }
  
  public static final SubLObject string_right_trim(SubLObject char_list, SubLObject string) {
    return string.toStr().rightTrim(char_list.toSeq());
  }
  
  public static final SubLObject string_trim(SubLObject char_list, SubLObject string) {
    return string.toStr().trim(char_list.toSeq());
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "make_string",  "MAKE-STRING",  1, 1, false);
    SubLFiles.declareFunction(me, "string",       "STRING",       1, 0, false);
    SubLFiles.declareFunction(me, "sublisp_char", "CHAR",         2, 0, false);
    SubLFiles.declareFunction(me, "set_char",     "SET-CHAR",     3, 0, false);
    
    SubLFiles.declareFunction(me, "stringE",      "STRING=",      2, 4, false);
    SubLFiles.declareFunction(me, "stringL",      "STRING<",      2, 4, false);
    SubLFiles.declareFunction(me, "stringLE",     "STRING<=",     2, 4, false);
    SubLFiles.declareFunction(me, "stringG",      "STRING>",      2, 4, false);
    SubLFiles.declareFunction(me, "stringGE",     "STRING>=",     2, 4, false);
    
    SubLFiles.declareFunction(me, "string_upcase",     "STRING-UPCASE",     1, 2, false);
    SubLFiles.declareFunction(me, "string_downcase",   "STRING-DOWNCASE",   1, 2, false);
    SubLFiles.declareFunction(me, "string_capitalize", "STRING-CAPITALIZE", 1, 2, false);
    SubLFiles.declareFunction(me, "nstring_upcase",     "NSTRING-UPCASE",     1, 2, false);
    SubLFiles.declareFunction(me, "nstring_downcase",   "NSTRING-DOWNCASE",   1, 2, false);
    SubLFiles.declareFunction(me, "nstring_capitalize", "NSTRING-CAPITALIZE", 1, 2, false);
    
    SubLFiles.declareFunction(me, "string_equal", "STRING-EQUAL", 2, 4, false);
    SubLFiles.declareFunction(me, "string_greaterp", "STRING-GREATERP", 2, 4, false);
    SubLFiles.declareFunction(me, "string_left_trim", "STRING-LEFT-TRIM", 2, 0, false);
    SubLFiles.declareFunction(me, "string_lessp", "STRING-LESSP", 2, 4, false);
    SubLFiles.declareFunction(me, "string_not_equal", "STRING-NOT-EQUAL", 2, 4, false);
    SubLFiles.declareFunction(me, "string_not_greaterp", "STRING-NOT-GREATERP", 2, 4, false);
    SubLFiles.declareFunction(me, "string_not_lessp", "STRING-NOT-LESSP", 2, 4, false);
    SubLFiles.declareFunction(me, "string_right_trim", "STRING-RIGHT-TRIM", 2, 0, false);
    SubLFiles.declareFunction(me, "string_trim", "STRING-TRIM", 2, 0, false);
    SubLFiles.declareFunction(me, "stringNE", "STRING/=", 2, 4, false);
  }
  
  public void initializeVariables() {
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area
  
  private static final SubLObject compare(SubLObject string1, SubLObject string2,
      CharCompareDesc compareDesc, SubLObject start1, SubLObject end1, 
      SubLObject start2, SubLObject end2) {
    int start1Typed = extractStart(start1);
    int start2Typed = extractStart(start2);
    int end1Typed = extractEnd(end1);
    int end2Typed = extractEnd(end2);
    int result = string1.toStr().compare(string2.toStr(), compareDesc, 
      start1Typed, start2Typed, end1Typed, end2Typed);
    if (result < 0) { return NIL; }
    return SubLNumberFactory.makeInteger(result);
  }
  
  //// Internal Rep
  
  //// Main
  
}
