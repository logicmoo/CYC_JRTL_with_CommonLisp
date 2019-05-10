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

package  com.cyc.cycjava_1.cycl;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.string_utilities;
import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class standard_tokenization extends SubLTranslatedFile {

  //// Constructor

  private standard_tokenization() {}
  public static final SubLFile me = new standard_tokenization();
  public static final String myName = "com.cyc.cycjava_1.cycl.standard_tokenization";

  //// Definitions

  @SubL(source = "cycl/standard-tokenization.lisp", position = 2463) 
  private static SubLSymbol $standard_punctuation_chars$ = null;

  /** chars that are only punctuation if they are word-final */
  @SubL(source = "cycl/standard-tokenization.lisp", position = 2688) 
  private static SubLSymbol $standard_word_final_punctuation_chars$ = null;

  @SubL(source = "cycl/standard-tokenization.lisp", position = 2914) 
  private static SubLSymbol $standard_white_space_chars$ = null;

  public static final class $dot_analysis_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $found; }
    public SubLObject getField3() { return $remains; }
    public SubLObject getField4() { return $accumulator; }
    public SubLObject getField5() { return $state; }
    public SubLObject setField2(SubLObject value) { return $found = value; }
    public SubLObject setField3(SubLObject value) { return $remains = value; }
    public SubLObject setField4(SubLObject value) { return $accumulator = value; }
    public SubLObject setField5(SubLObject value) { return $state = value; }
    public SubLObject $found = NIL;
    public SubLObject $remains = NIL;
    public SubLObject $accumulator = NIL;
    public SubLObject $state = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($dot_analysis_native.class, $sym9$DOT_ANALYSIS, $sym10$DOT_ANALYSIS_P, $list11, $list12, new String[] {"$found", "$remains", "$accumulator", "$state"}, $list13, $list14, $sym15$PPRINT_DOT_ANALYSIS);
  }

  @SubL(source = "cycl/standard-tokenization.lisp", position = 5968) 
  public static SubLSymbol $dtp_dot_analysis$ = null;

  @SubL(source = "cycl/standard-tokenization.lisp", position = 5968) 
  public static final SubLObject dot_analysis_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9013");
    return NIL;
  }

  public static final class $dot_analysis_p$UnaryFunction extends UnaryFunction {
    public $dot_analysis_p$UnaryFunction() { super(extractFunctionNamed("DOT-ANALYSIS-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9005"); }
  }

  public static final SubLObject declare_standard_tokenization_file() {
    //declareFunction(myName, "standard_raw_tokenization", "STANDARD-RAW-TOKENIZATION", 1, 0, false);
    //declareFunction(myName, "standard_token_chunker", "STANDARD-TOKEN-CHUNKER", 1, 0, false);
    //declareFunction(myName, "standard_string_tokenize", "STANDARD-STRING-TOKENIZE", 1, 0, false);
    //declareFunction(myName, "standard_punctuation_chars", "STANDARD-PUNCTUATION-CHARS", 0, 0, false);
    //declareFunction(myName, "standard_white_space_chars", "STANDARD-WHITE-SPACE-CHARS", 0, 0, false);
    //declareFunction(myName, "tokenize_sentence", "TOKENIZE-SENTENCE", 1, 3, false);
    //declareFunction(myName, "scanner_char_classify", "SCANNER-CHAR-CLASSIFY", 4, 0, false);
    declareFunction(myName, "dot_analysis_print_function_trampoline", "DOT-ANALYSIS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "dot_analysis_p", "DOT-ANALYSIS-P", 1, 0, false); new $dot_analysis_p$UnaryFunction();
    //declareFunction(myName, "dot_analysis_found", "DOT-ANALYSIS-FOUND", 1, 0, false);
    //declareFunction(myName, "dot_analysis_remains", "DOT-ANALYSIS-REMAINS", 1, 0, false);
    //declareFunction(myName, "dot_analysis_accumulator", "DOT-ANALYSIS-ACCUMULATOR", 1, 0, false);
    //declareFunction(myName, "dot_analysis_state", "DOT-ANALYSIS-STATE", 1, 0, false);
    //declareFunction(myName, "_csetf_dot_analysis_found", "_CSETF-DOT-ANALYSIS-FOUND", 2, 0, false);
    //declareFunction(myName, "_csetf_dot_analysis_remains", "_CSETF-DOT-ANALYSIS-REMAINS", 2, 0, false);
    //declareFunction(myName, "_csetf_dot_analysis_accumulator", "_CSETF-DOT-ANALYSIS-ACCUMULATOR", 2, 0, false);
    //declareFunction(myName, "_csetf_dot_analysis_state", "_CSETF-DOT-ANALYSIS-STATE", 2, 0, false);
    //declareFunction(myName, "make_dot_analysis", "MAKE-DOT-ANALYSIS", 0, 1, false);
    //declareFunction(myName, "pprint_dot_analysis", "PPRINT-DOT-ANALYSIS", 3, 0, false);
    //declareFunction(myName, "perform_dot_analysis", "PERFORM-DOT-ANALYSIS", 1, 0, false);
    //declareFunction(myName, "init_dot_analysis", "INIT-DOT-ANALYSIS", 1, 0, false);
    //declareFunction(myName, "find_current_dot_type", "FIND-CURRENT-DOT-TYPE", 1, 0, false);
    //declareFunction(myName, "dot_analysis_dfa", "DOT-ANALYSIS-DFA", 1, 0, false);
    //declareFunction(myName, "dot_analysis_default", "DOT-ANALYSIS-DEFAULT", 1, 0, false);
    //declareFunction(myName, "dot_analysis_dot_string", "DOT-ANALYSIS-DOT-STRING", 1, 0, false);
    //declareFunction(myName, "dot_analysis_string", "DOT-ANALYSIS-STRING", 1, 0, false);
    //declareFunction(myName, "dot_analysis_dot_integer", "DOT-ANALYSIS-DOT-INTEGER", 1, 0, false);
    //declareFunction(myName, "dot_analysis_integer", "DOT-ANALYSIS-INTEGER", 1, 0, false);
    //declareFunction(myName, "clean_dot_accumulator", "CLEAN-DOT-ACCUMULATOR", 2, 0, false);
    //declareFunction(myName, "new_interval_token", "NEW-INTERVAL-TOKEN", 0, 3, false);
    //declareFunction(myName, "interval_token_p", "INTERVAL-TOKEN-P", 1, 0, false);
    //declareFunction(myName, "interval_token_start", "INTERVAL-TOKEN-START", 1, 0, false);
    //declareFunction(myName, "interval_token_end", "INTERVAL-TOKEN-END", 1, 0, false);
    //declareFunction(myName, "interval_token_length", "INTERVAL-TOKEN-LENGTH", 1, 0, false);
    //declareFunction(myName, "interval_token_value", "INTERVAL-TOKEN-VALUE", 1, 0, false);
    //declareFunction(myName, "interval_token_value_set", "INTERVAL-TOKEN-VALUE-SET", 2, 0, false);
    //declareFunction(myName, "string_token_p", "STRING-TOKEN-P", 1, 0, false);
    //declareFunction(myName, "new_string_token", "NEW-STRING-TOKEN", 0, 2, false);
    //declareFunction(myName, "string_token_string", "STRING-TOKEN-STRING", 1, 0, false);
    //declareFunction(myName, "string_token_value", "STRING-TOKEN-VALUE", 1, 0, false);
    //declareFunction(myName, "copy_string_token", "COPY-STRING-TOKEN", 1, 0, false);
    //declareFunction(myName, "string_token_string_set", "STRING-TOKEN-STRING-SET", 2, 0, false);
    //declareFunction(myName, "string_token_value_set", "STRING-TOKEN-VALUE-SET", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_standard_tokenization_file() {
    $standard_punctuation_chars$ = deflexical("*STANDARD-PUNCTUATION-CHARS*", $list1);
    $standard_word_final_punctuation_chars$ = deflexical("*STANDARD-WORD-FINAL-PUNCTUATION-CHARS*", $list2);
    $standard_white_space_chars$ = deflexical("*STANDARD-WHITE-SPACE-CHARS*", string_utilities.whitespace_chars());
    $dtp_dot_analysis$ = defconstant("*DTP-DOT-ANALYSIS*", $sym9$DOT_ANALYSIS);
    return NIL;
  }

  public static final SubLObject setup_standard_tokenization_file() {
    // CVS_ID("Id: standard-tokenization.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_dot_analysis$.getGlobalValue(), Symbols.symbol_function($sym16$DOT_ANALYSIS_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym17$DOT_ANALYSIS_FOUND, $sym18$_CSETF_DOT_ANALYSIS_FOUND);
    Structures.def_csetf($sym19$DOT_ANALYSIS_REMAINS, $sym20$_CSETF_DOT_ANALYSIS_REMAINS);
    Structures.def_csetf($sym21$DOT_ANALYSIS_ACCUMULATOR, $sym22$_CSETF_DOT_ANALYSIS_ACCUMULATOR);
    Structures.def_csetf($sym23$DOT_ANALYSIS_STATE, $sym24$_CSETF_DOT_ANALYSIS_STATE);
    Equality.identity($sym9$DOT_ANALYSIS);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$STRINGP = makeSymbol("STRINGP");
  public static final SubLList $list1 = list(new SubLObject[] {Characters.CHAR_semicolon, Characters.CHAR_comma, Characters.CHAR_colon, Characters.CHAR_quotation, Characters.CHAR_quote, Characters.CHAR_exclamation, Characters.CHAR_question, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_percent, Characters.CHAR_dollar, Characters.CHAR_hyphen, Characters.CHAR_caret, Characters.CHAR_asterisk});
  public static final SubLList $list2 = list(Characters.CHAR_period);
  public static final SubLSymbol $kw3$GOBBLE_WS = makeKeyword("GOBBLE-WS");
  public static final SubLSymbol $kw4$WHITE_SPACE = makeKeyword("WHITE-SPACE");
  public static final SubLSymbol $kw5$IN_WORD = makeKeyword("IN-WORD");
  public static final SubLSymbol $kw6$WORD_FINAL_PUNCTUATION = makeKeyword("WORD-FINAL-PUNCTUATION");
  public static final SubLSymbol $kw7$PUNCTUATION = makeKeyword("PUNCTUATION");
  public static final SubLSymbol $kw8$GENERIC = makeKeyword("GENERIC");
  public static final SubLSymbol $sym9$DOT_ANALYSIS = makeSymbol("DOT-ANALYSIS");
  public static final SubLSymbol $sym10$DOT_ANALYSIS_P = makeSymbol("DOT-ANALYSIS-P");
  public static final SubLList $list11 = list(makeSymbol("FOUND"), makeSymbol("REMAINS"), makeSymbol("ACCUMULATOR"), makeSymbol("STATE"));
  public static final SubLList $list12 = list(makeKeyword("FOUND"), makeKeyword("REMAINS"), makeKeyword("ACCUMULATOR"), makeKeyword("STATE"));
  public static final SubLList $list13 = list(makeSymbol("DOT-ANALYSIS-FOUND"), makeSymbol("DOT-ANALYSIS-REMAINS"), makeSymbol("DOT-ANALYSIS-ACCUMULATOR"), makeSymbol("DOT-ANALYSIS-STATE"));
  public static final SubLList $list14 = list(makeSymbol("_CSETF-DOT-ANALYSIS-FOUND"), makeSymbol("_CSETF-DOT-ANALYSIS-REMAINS"), makeSymbol("_CSETF-DOT-ANALYSIS-ACCUMULATOR"), makeSymbol("_CSETF-DOT-ANALYSIS-STATE"));
  public static final SubLSymbol $sym15$PPRINT_DOT_ANALYSIS = makeSymbol("PPRINT-DOT-ANALYSIS");
  public static final SubLSymbol $sym16$DOT_ANALYSIS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DOT-ANALYSIS-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym17$DOT_ANALYSIS_FOUND = makeSymbol("DOT-ANALYSIS-FOUND");
  public static final SubLSymbol $sym18$_CSETF_DOT_ANALYSIS_FOUND = makeSymbol("_CSETF-DOT-ANALYSIS-FOUND");
  public static final SubLSymbol $sym19$DOT_ANALYSIS_REMAINS = makeSymbol("DOT-ANALYSIS-REMAINS");
  public static final SubLSymbol $sym20$_CSETF_DOT_ANALYSIS_REMAINS = makeSymbol("_CSETF-DOT-ANALYSIS-REMAINS");
  public static final SubLSymbol $sym21$DOT_ANALYSIS_ACCUMULATOR = makeSymbol("DOT-ANALYSIS-ACCUMULATOR");
  public static final SubLSymbol $sym22$_CSETF_DOT_ANALYSIS_ACCUMULATOR = makeSymbol("_CSETF-DOT-ANALYSIS-ACCUMULATOR");
  public static final SubLSymbol $sym23$DOT_ANALYSIS_STATE = makeSymbol("DOT-ANALYSIS-STATE");
  public static final SubLSymbol $sym24$_CSETF_DOT_ANALYSIS_STATE = makeSymbol("_CSETF-DOT-ANALYSIS-STATE");
  public static final SubLSymbol $kw25$FOUND = makeKeyword("FOUND");
  public static final SubLSymbol $kw26$REMAINS = makeKeyword("REMAINS");
  public static final SubLSymbol $kw27$ACCUMULATOR = makeKeyword("ACCUMULATOR");
  public static final SubLSymbol $kw28$STATE = makeKeyword("STATE");
  public static final SubLString $str29$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str30$__AP_Found_________S__ = makeString("#<AP:Found        ~S~%");
  public static final SubLString $str31$_____Remains_______S__ = makeString("     Remains      ~S~%");
  public static final SubLString $str32$_____Accumulator___S__ = makeString("     Accumulator  ~S~%");
  public static final SubLString $str33$_____State_________S___ = makeString("     State        ~S>~%");
  public static final SubLString $str34$_ = makeString(".");
  public static final SubLSymbol $kw35$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $kw36$DOT = makeKeyword("DOT");
  public static final SubLSymbol $kw37$NUM = makeKeyword("NUM");
  public static final SubLSymbol $kw38$STRING = makeKeyword("STRING");
  public static final SubLSymbol $kw39$PUNCT = makeKeyword("PUNCT");
  public static final SubLSymbol $kw40$DOT_STRING_WANTED = makeKeyword("DOT-STRING-WANTED");
  public static final SubLSymbol $kw41$STRING_WANTED = makeKeyword("STRING-WANTED");
  public static final SubLSymbol $kw42$DOT_INTEGER_WANTED = makeKeyword("DOT-INTEGER-WANTED");
  public static final SubLSymbol $kw43$INTEGER_WANTED = makeKeyword("INTEGER-WANTED");
  public static final SubLSymbol $sym44$CCONCATENATE = makeSymbol("CCONCATENATE");
  public static final SubLSymbol $sym45$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLString $str46$_a_is_not_greater_than_or_equal_t = makeString("~a is not greater than or equal to ~a");
  public static final SubLSymbol $sym47$INTERVAL_TOKEN_P = makeSymbol("INTERVAL-TOKEN-P");

  //// Initializers

  public void declareFunctions() {
    declare_standard_tokenization_file();
  }

  public void initializeVariables() {
    init_standard_tokenization_file();
  }

  public void runTopLevelForms() {
    setup_standard_tokenization_file();
  }

}
