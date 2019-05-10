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

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;

 import com.cyc.cycjava.cycl.*;
 import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;



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


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.deduction_handles;
//dm import com.cyc.cycjava_1.cycl.deductions_interface;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_hl_supports;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class deductions_high extends SubLTranslatedFile {

  //// Constructor

  private deductions_high() {}
  public static final SubLFile me = new deductions_high();
  public static final String myName = "com.cyc.cycjava_1.cycl.deductions_high";

  //// Definitions

  @SubL(source = "cycl/deductions-high.lisp", position = 1641) 
  public static final SubLObject create_deduction_spec(SubLObject supports) {
    checkType(supports, $sym7$HL_JUSTIFICATION_P);
    {
      SubLObject canon_supports = arguments.canonicalize_supports(supports, T);
      return cons($kw6$DEDUCTION, canon_supports);
    }
  }

  /** Returns the list of supports specified by DEDUCTION-SPEC */
  @SubL(source = "cycl/deductions-high.lisp", position = 2064) 
  public static final SubLObject deduction_spec_supports(SubLObject deduction_spec) {
    return deduction_spec.rest();
  }

  @SubL(source = "cycl/deductions-high.lisp", position = 2213) 
  public static final SubLObject create_deduction_with_tv(SubLObject assertion, SubLObject supports, SubLObject tv) {
    {
      SubLObject deduction = create_deduction(assertion, supports, enumeration_types.tv_truth(tv));
      set_deduction_strength(deduction, enumeration_types.tv_strength(tv));
      return deduction;
    }
  }

  @SubL(source = "cycl/deductions-high.lisp", position = 2582) 
  public static final SubLObject create_deduction_for_hl_support(SubLObject hl_support, SubLObject justification) {
    {
      SubLObject tv = arguments.hl_support_tv(hl_support);
      SubLObject deduction = create_deduction_with_tv(hl_support, justification, tv);
      return deduction;
    }
  }

  @SubL(source = "cycl/deductions-high.lisp", position = 2843) 
  public static final SubLObject create_deduction(SubLObject assertion, SubLObject supports, SubLObject truth) {
    return deductions_interface.kb_create_deduction(assertion, supports, truth);
  }

  @SubL(source = "cycl/deductions-high.lisp", position = 2959) 
  public static final SubLObject remove_deduction(SubLObject deduction) {
    return deductions_interface.kb_remove_deduction(deduction);
  }

  @SubL(source = "cycl/deductions-high.lisp", position = 3046) 
  public static final SubLObject set_deduction_strength(SubLObject deduction, SubLObject new_strength) {
    return deductions_interface.kb_set_deduction_strength(deduction, new_strength);
  }

  /** Find the deduction that justifies ASSERTION via SUPPORTS having TRUTH.
   Return NIL if not present. */
  @SubL(source = "cycl/deductions-high.lisp", position = 3575) 
  public static final SubLObject find_deduction(SubLObject assertion, SubLObject supports, SubLObject truth) {
    if ((truth == UNPROVIDED)) {
      truth = $kw9$TRUE;
    }
    return deductions_interface.kb_lookup_deduction(assertion, supports, truth);
  }

  @SubL(source = "cycl/deductions-high.lisp", position = 3812) 
  public static final SubLObject deduction_supports_equal(SubLObject supports1, SubLObject supports2) {
    return makeBoolean((Sequences.length(supports1).numE(Sequences.length(supports2))
           && (NIL != list_utilities.sets_equalP(supports1, supports2, $sym10$SUPPORT_EQUAL))));
  }

  /** Return the support for which DEDUCTION is a deduction. */
  @SubL(source = "cycl/deductions-high.lisp", position = 5899) 
  public static final SubLObject deduction_assertion(SubLObject deduction) {
    checkType(deduction, $sym8$DEDUCTION_P);
    return ((NIL != deduction_handles.deduction_handle_validP(deduction)) ? ((SubLObject) deductions_interface.kb_deduction_assertion(deduction)) : NIL);
  }

  /** Return the truth of DEDUCTION -- either :true :false or :unknown. */
  @SubL(source = "cycl/deductions-high.lisp", position = 6243) 
  public static final SubLObject deduction_truth(SubLObject deduction) {
    checkType(deduction, $sym8$DEDUCTION_P);
    if ((NIL == deduction_handles.deduction_handle_validP(deduction))) {
      return $kw17$UNKNOWN;
    }
    return deductions_interface.kb_deduction_truth(deduction);
  }

  /** Return the current argumentation strength of DEDUCTION -- either :monotonic, :default, or :unknown. */
  @SubL(source = "cycl/deductions-high.lisp", position = 6616) 
  public static final SubLObject deduction_strength(SubLObject deduction) {
    checkType(deduction, $sym8$DEDUCTION_P);
    return ((NIL != deduction_handles.deduction_handle_validP(deduction)) ? ((SubLObject) deductions_interface.kb_deduction_strength(deduction)) : NIL);
  }

  /** Return the assertions which together constitute this DEDUCTION. */
  @SubL(source = "cycl/deductions-high.lisp", position = 6993) 
  public static final SubLObject deduction_supports(SubLObject deduction) {
    checkType(deduction, $sym8$DEDUCTION_P);
    return ((NIL != deduction_handles.deduction_handle_validP(deduction)) ? ((SubLObject) kb_hl_supports.possibly_unreify_kb_hl_supports(deductions_interface.kb_deduction_supports(deduction))) : NIL);
  }

  @SubL(source = "cycl/deductions-high.lisp", position = 8739) 
  public static SubLSymbol $deduction_dump_id_table$ = null;

  @SubL(source = "cycl/deductions-high.lisp", position = 9117) 
  public static final SubLObject find_deduction_by_dump_id(SubLObject dump_id) {
    return deduction_handles.find_deduction_by_id(dump_id);
  }

  public static final SubLObject declare_deductions_high_file() {
    declareMacro(myName, "do_deduction_supports", "DO-DEDUCTION-SUPPORTS");
    declareFunction(myName, "deduction_spec_p", "DEDUCTION-SPEC-P", 1, 0, false);
    declareFunction(myName, "create_deduction_spec", "CREATE-DEDUCTION-SPEC", 1, 0, false);
    declareFunction(myName, "deduction_to_deduction_spec", "DEDUCTION-TO-DEDUCTION-SPEC", 1, 0, false);
    declareFunction(myName, "deduction_spec_supports", "DEDUCTION-SPEC-SUPPORTS", 1, 0, false);
    declareFunction(myName, "create_deduction_with_tv", "CREATE-DEDUCTION-WITH-TV", 3, 0, false);
    declareFunction(myName, "create_deduction_for_hl_support", "CREATE-DEDUCTION-FOR-HL-SUPPORT", 2, 0, false);
    declareFunction(myName, "create_deduction", "CREATE-DEDUCTION", 3, 0, false);
    declareFunction(myName, "remove_deduction", "REMOVE-DEDUCTION", 1, 0, false);
    declareFunction(myName, "set_deduction_strength", "SET-DEDUCTION-STRENGTH", 2, 0, false);
    declareFunction(myName, "random_deduction", "RANDOM-DEDUCTION", 0, 0, false);
    declareFunction(myName, "find_deduction", "FIND-DEDUCTION", 2, 1, false);
    declareFunction(myName, "deduction_supports_equal", "DEDUCTION-SUPPORTS-EQUAL", 2, 0, false);
    declareFunction(myName, "deduction_equal", "DEDUCTION-EQUAL", 2, 0, false);
    declareFunction(myName, "invalid_deduction", "INVALID-DEDUCTION", 1, 1, false);
    declareFunction(myName, "forward_deductionP", "FORWARD-DEDUCTION?", 1, 0, false);
    declareFunction(myName, "lifting_deduction_p", "LIFTING-DEDUCTION-P", 1, 0, false);
    declareFunction(myName, "skolem_deduction_p", "SKOLEM-DEDUCTION-P", 1, 0, false);
    declareFunction(myName, "deduction_assertion", "DEDUCTION-ASSERTION", 1, 0, false);
    declareFunction(myName, "deduction_truth", "DEDUCTION-TRUTH", 1, 0, false);
    declareFunction(myName, "deduction_strength", "DEDUCTION-STRENGTH", 1, 0, false);
    declareFunction(myName, "deduction_supports", "DEDUCTION-SUPPORTS", 1, 0, false);
    declareFunction(myName, "deduction_mt", "DEDUCTION-MT", 1, 0, false);
    declareFunction(myName, "deduction_id_from_recipe", "DEDUCTION-ID-FROM-RECIPE", 2, 1, false);
    declareFunction(myName, "deduction_checkpoint_p", "DEDUCTION-CHECKPOINT-P", 1, 0, false);
    declareFunction(myName, "new_deduction_checkpoint", "NEW-DEDUCTION-CHECKPOINT", 0, 0, false);
    declareFunction(myName, "deduction_checkpoint_currentP", "DEDUCTION-CHECKPOINT-CURRENT?", 1, 0, false);
    declareFunction(myName, "deduction_dump_id", "DEDUCTION-DUMP-ID", 1, 0, false);
    declareFunction(myName, "find_deduction_by_dump_id", "FIND-DEDUCTION-BY-DUMP-ID", 1, 0, false);
    declareMacro(myName, "with_deduction_dump_id_table", "WITH-DEDUCTION-DUMP-ID-TABLE");
    return NIL;
  }

  public static final SubLObject init_deductions_high_file() {
    $deduction_dump_id_table$ = defparameter("*DEDUCTION-DUMP-ID-TABLE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_deductions_high_file() {
    // CVS_ID("Id: deductions-high.lisp 127912 2009-06-02 17:55:55Z pace ");
    utilities_macros.register_cyc_api_function($sym12$DEDUCTION_ASSERTION, $list13, $str14$Return_the_support_for_which_DEDU, $list15, $list16);
    utilities_macros.register_cyc_api_function($sym18$DEDUCTION_TRUTH, $list13, $str19$Return_the_truth_of_DEDUCTION____, $list15, $list20);
    utilities_macros.register_cyc_api_function($sym21$DEDUCTION_STRENGTH, $list13, $str22$Return_the_current_argumentation_, $list15, $list23);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("SUPPORT"), makeSymbol("DEDUCTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list1 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw2$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw3$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym4$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym5$DEDUCTION_SUPPORTS = makeSymbol("DEDUCTION-SUPPORTS");
  public static final SubLSymbol $kw6$DEDUCTION = makeKeyword("DEDUCTION");
  public static final SubLSymbol $sym7$HL_JUSTIFICATION_P = makeSymbol("HL-JUSTIFICATION-P");
  public static final SubLSymbol $sym8$DEDUCTION_P = makeSymbol("DEDUCTION-P");
  public static final SubLSymbol $kw9$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym10$SUPPORT_EQUAL = makeSymbol("SUPPORT-EQUAL");
  public static final SubLObject $const11$skolem = constant_handles.reader_make_constant_shell(makeString("skolem"));
  public static final SubLSymbol $sym12$DEDUCTION_ASSERTION = makeSymbol("DEDUCTION-ASSERTION");
  public static final SubLList $list13 = list(makeSymbol("DEDUCTION"));
  public static final SubLString $str14$Return_the_support_for_which_DEDU = makeString("Return the support for which DEDUCTION is a deduction.");
  public static final SubLList $list15 = list(list(makeSymbol("DEDUCTION"), makeSymbol("DEDUCTION-P")));
  public static final SubLList $list16 = list(makeSymbol("SUPPORT-P"));
  public static final SubLSymbol $kw17$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLSymbol $sym18$DEDUCTION_TRUTH = makeSymbol("DEDUCTION-TRUTH");
  public static final SubLString $str19$Return_the_truth_of_DEDUCTION____ = makeString("Return the truth of DEDUCTION -- either :true :false or :unknown.");
  public static final SubLList $list20 = list(makeSymbol("TRUTH-P"));
  public static final SubLSymbol $sym21$DEDUCTION_STRENGTH = makeSymbol("DEDUCTION-STRENGTH");
  public static final SubLString $str22$Return_the_current_argumentation_ = makeString("Return the current argumentation strength of DEDUCTION -- either :monotonic, :default, or :unknown.");
  public static final SubLList $list23 = list(makeSymbol("EL-STRENGTH-P"));
  public static final SubLSymbol $sym24$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLList $list25 = list(makeSymbol("CHECKPOINT-COUNT"), makeSymbol("CHECKPOINT-NEXT-ID"));
  public static final SubLSymbol $sym26$CLET = makeSymbol("CLET");
  public static final SubLList $list27 = list(list(makeSymbol("*DEDUCTION-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-DEDUCTION-DUMP-ID-TABLE"))), list(makeSymbol("*CFASL-DEDUCTION-HANDLE-FUNC*"), list(makeSymbol("QUOTE"), makeSymbol("DEDUCTION-DUMP-ID"))));

  //// Initializers

  public void declareFunctions() {
    declare_deductions_high_file();
  }

  public void initializeVariables() {
    init_deductions_high_file();
  }

  public void runTopLevelForms() {
    setup_deductions_high_file();
  }

}
