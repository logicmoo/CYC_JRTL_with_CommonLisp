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

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_completion_interface;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class constant_completion_high extends SubLTranslatedFile {

  //// Constructor

  private constant_completion_high() {}
  public static final SubLFile me = new constant_completion_high();
  public static final String myName = "com.cyc.cycjava_1.cycl.constant_completion_high";

  //// Definitions

  /** Return T iff CHAR is a character which is allowed in a valid constant name. */
  @SubL(source = "cycl/constant-completion-high.lisp", position = 1323) 
  public static final SubLObject valid_constant_name_char_p(SubLObject v_char) {
    checkType(v_char, $sym0$CHARACTERP);
    return makeBoolean(((NIL != Characters.alphanumericp(v_char))
          || (NIL != Sequences.find(v_char, $str7$___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
  }

  /** Return T iff STRING is a valid name for a constant. */
  @SubL(source = "cycl/constant-completion-high.lisp", position = 1896) 
  public static final SubLObject valid_constant_name_p(SubLObject string) {
    return makeBoolean((string.isString()
           && Sequences.length(string).numGE(TWO_INTEGER)
           && (NIL == Sequences.find_if(Symbols.symbol_function($sym14$INVALID_CONSTANT_NAME_CHAR_P), string, UNPROVIDED, UNPROVIDED, UNPROVIDED))));
  }

  /** Return T iff CHAR is a character which is not allowed in a valid constant name. */
  @SubL(source = "cycl/constant-completion-high.lisp", position = 2148) 
  public static final SubLObject invalid_constant_name_char_p(SubLObject v_char) {
    return makeBoolean((NIL == valid_constant_name_char_p(v_char)));
  }

  public static final class $invalid_constant_name_char_p$UnaryFunction extends UnaryFunction {
    public $invalid_constant_name_char_p$UnaryFunction() { super(extractFunctionNamed("INVALID-CONSTANT-NAME-CHAR-P")); }
    public SubLObject processItem(SubLObject arg1) { return invalid_constant_name_char_p(arg1); }
  }

  /** Do we require that constant names be case-insensitively unique? */
  @SubL(source = "cycl/constant-completion-high.lisp", position = 2576) 
  public static SubLSymbol $require_case_insensitive_name_uniqueness$ = null;

  /** Return a list of constants whose names differ from STRING only by case. */
  @SubL(source = "cycl/constant-completion-high.lisp", position = 3818) 
  public static final SubLObject constant_name_case_collisions(SubLObject string) {
    checkType(string, $sym15$VALID_CONSTANT_NAME_P);
    {
      SubLObject uses = constant_complete(string, NIL, T, UNPROVIDED, UNPROVIDED);
      uses = Sequences.delete(string, uses, Symbols.symbol_function(EQUAL), Symbols.symbol_function($sym28$CONSTANT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED);
      return uses;
    }
  }

  /** Return a constant whose name differs from STRING only by case. */
  @SubL(source = "cycl/constant-completion-high.lisp", position = 4257) 
  public static final SubLObject constant_name_case_collision(SubLObject string) {
    checkType(string, $sym15$VALID_CONSTANT_NAME_P);
    return constant_name_case_collisions(string).first();
  }

  /** Return a valid constant whose name exactly matches STRING.
Optionally the START and END character positions can be
specified, such that the STRING matches characters between the START and 
END range.  If no constant exists, return NIL. */
  @SubL(source = "cycl/constant-completion-high.lisp", position = 4518) 
  public static final SubLObject constant_complete_exact(SubLObject string, SubLObject start, SubLObject end) {
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    if ((end == UNPROVIDED)) {
      end = NIL;
    }
    checkType(string, $sym18$STRINGP);
    checkType(start, $sym36$FIXNUMP);
    return constant_completion_interface.kb_constant_complete_exact(string, start, end);
  }

  /** Return all valid constants with PREFIX as a prefix of their name
When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.
When EXACT-LENGTH? is non-nil, the prefix must be the entire string
Optionally the START and END character positions can be
specified, such that the PREFIX matches characters between the START and 
END range.  If no constant exists, return NIL. */
  @SubL(source = "cycl/constant-completion-high.lisp", position = 5035) 
  public static final SubLObject constant_complete(SubLObject prefix, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
    if ((case_sensitiveP == UNPROVIDED)) {
      case_sensitiveP = NIL;
    }
    if ((exact_lengthP == UNPROVIDED)) {
      exact_lengthP = NIL;
    }
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    if ((end == UNPROVIDED)) {
      end = NIL;
    }
    checkType(prefix, $sym18$STRINGP);
    checkType(case_sensitiveP, $sym41$BOOLEANP);
    checkType(exact_lengthP, $sym41$BOOLEANP);
    checkType(start, $sym36$FIXNUMP);
    return constant_completion_interface.kb_constant_complete(prefix, case_sensitiveP, exact_lengthP, start, end);
  }

  @SubL(source = "cycl/constant-completion-high.lisp", position = 7968) 
  public static final SubLObject new_constant_completion_iterator(SubLObject forwardP, SubLObject buffer_size) {
    if ((forwardP == UNPROVIDED)) {
      forwardP = T;
    }
    if ((buffer_size == UNPROVIDED)) {
      buffer_size = ONE_INTEGER;
    }
    return constant_completion_interface.kb_new_constant_completion_iterator(forwardP, buffer_size);
  }

  /** Call FUNCTION on each constant in the completion table */
  @SubL(source = "cycl/constant-completion-high.lisp", position = 8386) 
  public static final SubLObject map_constants_in_completions(SubLObject function) {
    {
      SubLObject iterator = new_constant_completion_iterator(UNPROVIDED, UNPROVIDED);
      return iteration.map_iterator(function, iterator);
    }
  }

  public static final SubLObject declare_constant_completion_high_file() {
    declareFunction(myName, "valid_constant_name_char", "VALID-CONSTANT-NAME-CHAR", 1, 0, false);
    declareFunction(myName, "valid_constant_name_char_p", "VALID-CONSTANT-NAME-CHAR-P", 1, 0, false);
    declareFunction(myName, "valid_constant_name", "VALID-CONSTANT-NAME", 1, 0, false);
    declareFunction(myName, "valid_constant_name_p", "VALID-CONSTANT-NAME-P", 1, 0, false);
    declareFunction(myName, "invalid_constant_name_char_p", "INVALID-CONSTANT-NAME-CHAR-P", 1, 0, false); new $invalid_constant_name_char_p$UnaryFunction();
    declareFunction(myName, "constant_name_spec_p", "CONSTANT-NAME-SPEC-P", 1, 0, false);
    declareFunction(myName, "constant_name_available", "CONSTANT-NAME-AVAILABLE", 1, 0, false);
    declareFunction(myName, "uniquify_constant_name", "UNIQUIFY-CONSTANT-NAME", 1, 0, false);
    declareFunction(myName, "constant_name_case_collisions", "CONSTANT-NAME-CASE-COLLISIONS", 1, 0, false);
    declareFunction(myName, "constant_name_case_collision", "CONSTANT-NAME-CASE-COLLISION", 1, 0, false);
    declareFunction(myName, "constant_complete_exact", "CONSTANT-COMPLETE-EXACT", 1, 2, false);
    declareFunction(myName, "constant_complete", "CONSTANT-COMPLETE", 1, 4, false);
    declareFunction(myName, "constant_apropos", "CONSTANT-APROPOS", 1, 3, false);
    declareFunction(myName, "constant_postfix", "CONSTANT-POSTFIX", 1, 3, false);
    declareFunction(myName, "n_constants_before", "N-CONSTANTS-BEFORE", 2, 4, false);
    declareFunction(myName, "n_constants_after", "N-CONSTANTS-AFTER", 2, 4, false);
    declareFunction(myName, "new_constant_completion_iterator", "NEW-CONSTANT-COMPLETION-ITERATOR", 0, 2, false);
    declareFunction(myName, "new_directed_constant_completion_iterator", "NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR", 1, 5, false);
    declareFunction(myName, "map_constants_in_completions", "MAP-CONSTANTS-IN-COMPLETIONS", 1, 0, false);
    declareFunction(myName, "map_constant_completions_around", "MAP-CONSTANT-COMPLETIONS-AROUND", 2, 3, false);
    declareMacro(myName, "do_constants_in_completions", "DO-CONSTANTS-IN-COMPLETIONS");
    declareMacro(myName, "do_constant_completions_around", "DO-CONSTANT-COMPLETIONS-AROUND");
    return NIL;
  }

  public static final SubLObject init_constant_completion_high_file() {
    $require_case_insensitive_name_uniqueness$ = defparameter("*REQUIRE-CASE-INSENSITIVE-NAME-UNIQUENESS*", T);
    return NIL;
  }

  public static final SubLObject setup_constant_completion_high_file() {
        utilities_macros.register_obsolete_cyc_api_function($sym1$VALID_CONSTANT_NAME_CHAR, $list2, $list3, $str4$Deprecated_in_favor_of_valid_cons, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym8$VALID_CONSTANT_NAME_CHAR_P, $list3, $str9$Return_T_iff_CHAR_is_a_character_, $list5, $list6);
    utilities_macros.register_obsolete_cyc_api_function($sym10$VALID_CONSTANT_NAME, $list11, $list12, $str13$Deprecated_in_favor_of_valid_cons, NIL, $list6);
    utilities_macros.register_cyc_api_function($sym15$VALID_CONSTANT_NAME_P, $list12, $str16$Return_T_iff_STRING_is_a_valid_na, NIL, $list6);
    utilities_macros.register_cyc_api_function($sym19$CONSTANT_NAME_AVAILABLE, $list20, $str21$Return_T_iff_NAME_is_a_valid_cons, $list22, $list6);
    utilities_macros.register_cyc_api_function($sym24$UNIQUIFY_CONSTANT_NAME, $list20, $str25$Return_a_unique__currently_unused, $list26, $list27);
    utilities_macros.register_cyc_api_function($sym29$CONSTANT_NAME_CASE_COLLISIONS, $list12, $str30$Return_a_list_of_constants_whose_, $list31, $list32);
    utilities_macros.register_cyc_api_function($sym33$CONSTANT_NAME_CASE_COLLISION, $list12, $str34$Return_a_constant_whose_name_diff, $list31, $list35);
    utilities_macros.register_cyc_api_function($sym37$CONSTANT_COMPLETE_EXACT, $list38, $str39$Return_a_valid_constant_whose_nam, $list40, NIL);
    utilities_macros.register_cyc_api_function($sym42$CONSTANT_COMPLETE, $list43, $str44$Return_all_valid_constants_with_P, $list45, NIL);
    utilities_macros.register_cyc_api_function($sym46$CONSTANT_APROPOS, $list47, $str48$Return_all_valid_constants_with_S, $list49, NIL);
    utilities_macros.register_cyc_api_function($sym50$CONSTANT_POSTFIX, $list51, $str52$Return_all_valid_constants_with_P, $list53, NIL);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CHARACTERP = makeSymbol("CHARACTERP");
  public static final SubLSymbol $sym1$VALID_CONSTANT_NAME_CHAR = makeSymbol("VALID-CONSTANT-NAME-CHAR");
  public static final SubLList $list2 = list(makeSymbol("VALID-CONSTANT-NAME-CHAR-P"));
  public static final SubLList $list3 = list(makeSymbol("CHAR"));
  public static final SubLString $str4$Deprecated_in_favor_of_valid_cons = makeString("Deprecated in favor of valid-constant-name-char-p\n   Return T iff CHAR is a character which is allowed in a valid constant name.");
  public static final SubLList $list5 = list(list(makeSymbol("CHAR"), makeSymbol("CHARACTERP")));
  public static final SubLList $list6 = list(makeSymbol("BOOLEANP"));
  public static final SubLString $str7$___ = makeString("-_:");
  public static final SubLSymbol $sym8$VALID_CONSTANT_NAME_CHAR_P = makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
  public static final SubLString $str9$Return_T_iff_CHAR_is_a_character_ = makeString("Return T iff CHAR is a character which is allowed in a valid constant name.");
  public static final SubLSymbol $sym10$VALID_CONSTANT_NAME = makeSymbol("VALID-CONSTANT-NAME");
  public static final SubLList $list11 = list(makeSymbol("VALID-CONSTANT-NAME-P"));
  public static final SubLList $list12 = list(makeSymbol("STRING"));
  public static final SubLString $str13$Deprecated_in_favor_of_valid_cons = makeString("Deprecated in favor of valid-constant-name-p\n   Return T iff STRING is a valid name for a constant.");
  public static final SubLSymbol $sym14$INVALID_CONSTANT_NAME_CHAR_P = makeSymbol("INVALID-CONSTANT-NAME-CHAR-P");
  public static final SubLSymbol $sym15$VALID_CONSTANT_NAME_P = makeSymbol("VALID-CONSTANT-NAME-P");
  public static final SubLString $str16$Return_T_iff_STRING_is_a_valid_na = makeString("Return T iff STRING is a valid name for a constant.");
  public static final SubLSymbol $kw17$UNNAMED = makeKeyword("UNNAMED");
  public static final SubLSymbol $sym18$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym19$CONSTANT_NAME_AVAILABLE = makeSymbol("CONSTANT-NAME-AVAILABLE");
  public static final SubLList $list20 = list(makeSymbol("NAME"));
  public static final SubLString $str21$Return_T_iff_NAME_is_a_valid_cons = makeString("Return T iff NAME is a valid constant name currently available for use.");
  public static final SubLList $list22 = list(list(makeSymbol("NAME"), makeSymbol("STRINGP")));
  public static final SubLString $str23$_ = makeString("-");
  public static final SubLSymbol $sym24$UNIQUIFY_CONSTANT_NAME = makeSymbol("UNIQUIFY-CONSTANT-NAME");
  public static final SubLString $str25$Return_a_unique__currently_unused = makeString("Return a unique, currently unused constant name based on NAME, which must be a valid constant name.");
  public static final SubLList $list26 = list(list(makeSymbol("NAME"), makeSymbol("VALID-CONSTANT-NAME-P")));
  public static final SubLList $list27 = list(makeSymbol("STRINGP"));
  public static final SubLSymbol $sym28$CONSTANT_NAME = makeSymbol("CONSTANT-NAME");
  public static final SubLSymbol $sym29$CONSTANT_NAME_CASE_COLLISIONS = makeSymbol("CONSTANT-NAME-CASE-COLLISIONS");
  public static final SubLString $str30$Return_a_list_of_constants_whose_ = makeString("Return a list of constants whose names differ from STRING only by case.");
  public static final SubLList $list31 = list(list(makeSymbol("STRING"), makeSymbol("VALID-CONSTANT-NAME-P")));
  public static final SubLList $list32 = list(makeSymbol("LISTP"));
  public static final SubLSymbol $sym33$CONSTANT_NAME_CASE_COLLISION = makeSymbol("CONSTANT-NAME-CASE-COLLISION");
  public static final SubLString $str34$Return_a_constant_whose_name_diff = makeString("Return a constant whose name differs from STRING only by case.");
  public static final SubLList $list35 = list(makeSymbol("CONSTANT-P"));
  public static final SubLSymbol $sym36$FIXNUMP = makeSymbol("FIXNUMP");
  public static final SubLSymbol $sym37$CONSTANT_COMPLETE_EXACT = makeSymbol("CONSTANT-COMPLETE-EXACT");
  public static final SubLList $list38 = list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));
  public static final SubLString $str39$Return_a_valid_constant_whose_nam = makeString("Return a valid constant whose name exactly matches STRING.\nOptionally the START and END character positions can be\nspecified, such that the STRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");
  public static final SubLList $list40 = list(list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")));
  public static final SubLSymbol $sym41$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLSymbol $sym42$CONSTANT_COMPLETE = makeSymbol("CONSTANT-COMPLETE");
  public static final SubLList $list43 = list(makeSymbol("PREFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), makeSymbol("EXACT-LENGTH?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));
  public static final SubLString $str44$Return_all_valid_constants_with_P = makeString("Return all valid constants with PREFIX as a prefix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nWhen EXACT-LENGTH? is non-nil, the prefix must be the entire string\nOptionally the START and END character positions can be\nspecified, such that the PREFIX matches characters between the START and \nEND range.  If no constant exists, return NIL.");
  public static final SubLList $list45 = list(list(makeSymbol("PREFIX"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("EXACT-LENGTH?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")));
  public static final SubLSymbol $sym46$CONSTANT_APROPOS = makeSymbol("CONSTANT-APROPOS");
  public static final SubLList $list47 = list(makeSymbol("SUBSTRING"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));
  public static final SubLString $str48$Return_all_valid_constants_with_S = makeString("Return all valid constants with SUBSTRING somewhere in their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");
  public static final SubLList $list49 = list(list(makeSymbol("SUBSTRING"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")));
  public static final SubLSymbol $sym50$CONSTANT_POSTFIX = makeSymbol("CONSTANT-POSTFIX");
  public static final SubLList $list51 = list(makeSymbol("POSTFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));
  public static final SubLString $str52$Return_all_valid_constants_with_P = makeString("Return all valid constants with POSTFIX as a postfix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");
  public static final SubLList $list53 = list(list(makeSymbol("POSTFIX"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")));
  public static final SubLList $list54 = list(list(makeSymbol("CONSTANT"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("FORWARD"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list55 = list(makeKeyword("DONE"), makeKeyword("FORWARD"));
  public static final SubLSymbol $kw56$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw57$DONE = makeKeyword("DONE");
  public static final SubLSymbol $kw58$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $sym59$ITERATOR = makeUninternedSymbol("ITERATOR");
  public static final SubLSymbol $sym60$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym61$NEW_CONSTANT_COMPLETION_ITERATOR = makeSymbol("NEW-CONSTANT-COMPLETION-ITERATOR");
  public static final SubLSymbol $sym62$DO_ITERATOR = makeSymbol("DO-ITERATOR");
  public static final SubLSymbol $sym63$ITERATION_FINALIZE = makeSymbol("ITERATION-FINALIZE");
  public static final SubLList $list64 = list(list(makeSymbol("CONSTANT"), makeSymbol("STRING"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("FORWARD"), T), list(makeSymbol("CASE-SENSITIVE"), T), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list65 = list(makeKeyword("DONE"), makeKeyword("FORWARD"), makeKeyword("CASE-SENSITIVE"), makeKeyword("START"), makeKeyword("END"));
  public static final SubLSymbol $kw66$CASE_SENSITIVE = makeKeyword("CASE-SENSITIVE");
  public static final SubLSymbol $kw67$START = makeKeyword("START");
  public static final SubLSymbol $kw68$END = makeKeyword("END");
  public static final SubLSymbol $sym69$ITERATOR = makeUninternedSymbol("ITERATOR");
  public static final SubLSymbol $sym70$NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR = makeSymbol("NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR");

  //// Initializers

  public void declareFunctions() {
    declare_constant_completion_high_file();
  }

  public void initializeVariables() {
    init_constant_completion_high_file();
  }

  public void runTopLevelForms() {
    setup_constant_completion_high_file();
  }

}
