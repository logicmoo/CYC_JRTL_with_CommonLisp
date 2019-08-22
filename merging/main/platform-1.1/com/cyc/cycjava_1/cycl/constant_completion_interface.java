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
//dm import com.cyc.cycjava_1.cycl.constant_completion_low;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.hl_interface_infrastructure;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class constant_completion_interface extends SubLTranslatedFile {

  //// Constructor

  private constant_completion_interface() {}
  public static final SubLFile me = new constant_completion_interface();
  public static final String myName = "com.cyc.cycjava_1.cycl.constant_completion_interface";

  //// Definitions

  /** Return a valid constant whose name exactly matches STRING.
   Optionally the START and END character positions can be
   specified, such that the STRING matches characters between the START and 
   END range.  If no constant exists, return NIL. */
  @SubL(source = "cycl/constant-completion-interface.lisp", position = 847) 
  public static final SubLObject kb_constant_complete_exact(SubLObject string, SubLObject start, SubLObject end) {
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    if ((end == UNPROVIDED)) {
      end = NIL;
    }
    checkType(string, $sym0$STRINGP);
    checkType(start, $sym1$FIXNUMP);
    if ((NIL != end)) {
      checkType(end, $sym1$FIXNUMP);
    }
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29536");
    } else {
      return constant_completion_low.kb_constant_complete_exact_internal(string, start, end);
    }
  }

  /** Return all valid constants with PREFIX as a prefix of their name
   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.
   When EXACT-LENGTH? is non-nil, the prefix must be the entire string
   Optionally the START and END character positions can be
   specified, such that the PREFIX matches characters between the START and 
   END range.  If no constant exists, return NIL. */
  @SubL(source = "cycl/constant-completion-interface.lisp", position = 1392) 
  public static final SubLObject kb_constant_complete(SubLObject prefix, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
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
    checkType(prefix, $sym0$STRINGP);
    checkType(case_sensitiveP, $sym8$BOOLEANP);
    checkType(exact_lengthP, $sym8$BOOLEANP);
    checkType(start, $sym1$FIXNUMP);
    if ((NIL != end)) {
      checkType(end, $sym1$FIXNUMP);
    }
    if ((NIL != hl_interface_infrastructure.hl_access_remoteP())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29537");
    } else {
      return constant_completion_low.kb_constant_complete_internal(prefix, case_sensitiveP, exact_lengthP, start, end);
    }
  }

  /** Returns an iterator for the constants in the constant completion table. */
  @SubL(source = "cycl/constant-completion-interface.lisp", position = 5225) 
  public static final SubLObject kb_new_constant_completion_iterator(SubLObject forwardP, SubLObject buffer_size) {
    if ((forwardP == UNPROVIDED)) {
      forwardP = T;
    }
    if ((buffer_size == UNPROVIDED)) {
      buffer_size = ONE_INTEGER;
    }
    return hl_interface_infrastructure.new_hl_store_iterator(list($sym29$KB_NEW_CONSTANT_COMPLETION_ITERATOR_INTERNAL, list_utilities.quotify(forwardP)), buffer_size);
  }

  public static final SubLObject declare_constant_completion_interface_file() {
    declareFunction(myName, "kb_constant_complete_exact", "KB-CONSTANT-COMPLETE-EXACT", 1, 2, false);
    declareFunction(myName, "kb_constant_complete", "KB-CONSTANT-COMPLETE", 1, 4, false);
    declareFunction(myName, "kb_constant_apropos", "KB-CONSTANT-APROPOS", 1, 3, false);
    declareFunction(myName, "kb_constant_postfix", "KB-CONSTANT-POSTFIX", 1, 3, false);
    declareFunction(myName, "kb_n_constants_before", "KB-N-CONSTANTS-BEFORE", 2, 4, false);
    declareFunction(myName, "kb_n_constants_after", "KB-N-CONSTANTS-AFTER", 2, 4, false);
    declareFunction(myName, "kb_new_constant_completion_iterator", "KB-NEW-CONSTANT-COMPLETION-ITERATOR", 0, 2, false);
    declareFunction(myName, "kb_new_directed_constant_completion_iterator", "KB-NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR", 1, 5, false);
    return NIL;
  }

  public static final SubLObject init_constant_completion_interface_file() {
    return NIL;
  }

  public static final SubLObject setup_constant_completion_interface_file() {
        utilities_macros.register_cyc_api_function($sym2$KB_CONSTANT_COMPLETE_EXACT, $list4, $str5$Return_a_valid_constant_whose_nam, $list6, $list7);
    utilities_macros.register_cyc_api_function($sym9$KB_CONSTANT_COMPLETE, $list10, $str11$Return_all_valid_constants_with_P, $list12, $list13);
    utilities_macros.register_cyc_api_function($sym14$KB_CONSTANT_APROPOS, $list15, $str16$Return_all_valid_constants_with_S, $list17, $list13);
    utilities_macros.register_cyc_api_function($sym18$KB_CONSTANT_POSTFIX, $list19, $str20$Return_all_valid_constants_with_P, $list21, $list13);
    utilities_macros.register_cyc_api_function($sym23$KB_N_CONSTANTS_BEFORE, $list24, $str25$Return_the_N_constants_with_names, $list26, $list13);
    utilities_macros.register_cyc_api_function($sym27$KB_N_CONSTANTS_AFTER, $list24, $str28$Return_the_N_constants_with_names, $list26, $list13);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym1$FIXNUMP = makeSymbol("FIXNUMP");
  public static final SubLSymbol $sym2$KB_CONSTANT_COMPLETE_EXACT = makeSymbol("KB-CONSTANT-COMPLETE-EXACT");
  public static final SubLSymbol $sym3$QUOTE = makeSymbol("QUOTE");
  public static final SubLList $list4 = list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));
  public static final SubLString $str5$Return_a_valid_constant_whose_nam = makeString("Return a valid constant whose name exactly matches STRING.\n   Optionally the START and END character positions can be\n   specified, such that the STRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");
  public static final SubLList $list6 = list(list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));
  public static final SubLList $list7 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSTANT-P")));
  public static final SubLSymbol $sym8$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLSymbol $sym9$KB_CONSTANT_COMPLETE = makeSymbol("KB-CONSTANT-COMPLETE");
  public static final SubLList $list10 = list(makeSymbol("PREFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), makeSymbol("EXACT-LENGTH?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));
  public static final SubLString $str11$Return_all_valid_constants_with_P = makeString("Return all valid constants with PREFIX as a prefix of their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   When EXACT-LENGTH? is non-nil, the prefix must be the entire string\n   Optionally the START and END character positions can be\n   specified, such that the PREFIX matches characters between the START and \n   END range.  If no constant exists, return NIL.");
  public static final SubLList $list12 = list(list(makeSymbol("PREFIX"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("EXACT-LENGTH?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));
  public static final SubLList $list13 = list(list(makeSymbol("LIST"), makeSymbol("CONSTANT-P")));
  public static final SubLSymbol $sym14$KB_CONSTANT_APROPOS = makeSymbol("KB-CONSTANT-APROPOS");
  public static final SubLList $list15 = list(makeSymbol("SUBSTRING"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));
  public static final SubLString $str16$Return_all_valid_constants_with_S = makeString("Return all valid constants with SUBSTRING somewhere in their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   Optionally the START and END character positions can be\n   specified, such that the SUBSTRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");
  public static final SubLList $list17 = list(list(makeSymbol("SUBSTRING"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));
  public static final SubLSymbol $sym18$KB_CONSTANT_POSTFIX = makeSymbol("KB-CONSTANT-POSTFIX");
  public static final SubLList $list19 = list(makeSymbol("POSTFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));
  public static final SubLString $str20$Return_all_valid_constants_with_P = makeString("Return all valid constants with POSTFIX as a postfix of their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   Optionally the START and END character positions can be\n   specified, such that the SUBSTRING matches characters between the START and \n   END range.  If no constant exists, return NIL.");
  public static final SubLList $list21 = list(list(makeSymbol("POSTFIX"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));
  public static final SubLSymbol $sym22$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym23$KB_N_CONSTANTS_BEFORE = makeSymbol("KB-N-CONSTANTS-BEFORE");
  public static final SubLList $list24 = list(makeSymbol("N"), makeSymbol("STRING"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"), makeSymbol("STRICT?"));
  public static final SubLString $str25$Return_the_N_constants_with_names = makeString("Return the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,\n   the comparison is done in a case-sensitive fashion.  Optionally the START and END\n   character positions can be specified, such that STRING matches characters between\n   the START and END range.  If STRICT? is non-nil, then only constants strictly\n   before the string are returned.");
  public static final SubLList $list26 = list(list(makeSymbol("N"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")), list(makeSymbol("END"), list(makeSymbol("NIL-OR"), makeSymbol("FIXNUMP"))));
  public static final SubLSymbol $sym27$KB_N_CONSTANTS_AFTER = makeSymbol("KB-N-CONSTANTS-AFTER");
  public static final SubLString $str28$Return_the_N_constants_with_names = makeString("Return the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,\n   the comparison is done in a case-sensitive fashion.  Optionally the START and END\n   character positions can be specified, such that STRING matches characters between\n   the START and END range.  If STRICT? is non-nil, then only constants strictly after\n   the string are returned.");
  public static final SubLSymbol $sym29$KB_NEW_CONSTANT_COMPLETION_ITERATOR_INTERNAL = makeSymbol("KB-NEW-CONSTANT-COMPLETION-ITERATOR-INTERNAL");
  public static final SubLSymbol $sym30$KB_NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR_INTERNAL = makeSymbol("KB-NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR-INTERNAL");

  //// Initializers

  public void declareFunctions() {
    declare_constant_completion_interface_file();
  }

  public void initializeVariables() {
    init_constant_completion_interface_file();
  }

  public void runTopLevelForms() {
    setup_constant_completion_interface_file();
  }

}
