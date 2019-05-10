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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.ghl_marking_utilities;
//dm import com.cyc.cycjava_1.cycl.ghl_search_methods;
//dm import com.cyc.cycjava_1.cycl.ghl_search_utilities;
//dm import com.cyc.cycjava_1.cycl.gt_utilities;
//dm import com.cyc.cycjava_1.cycl.gt_vars;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.relation_evaluation;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.tva_inference;
//dm import com.cyc.cycjava_1.cycl.tva_utilities;

public  final class tva_tactic extends SubLTranslatedFile {

  //// Constructor

  private tva_tactic() {}
  public static final SubLFile me = new tva_tactic();
  public static final String myName = "com.cyc.cycjava_1.cycl.tva_tactic";

  //// Definitions

  public static final class $tva_tactic_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $type; }
    public SubLObject getField3() { return $tva_pred; }
    public SubLObject getField4() { return $index_pred; }
    public SubLObject getField5() { return $transitive_pred; }
    public SubLObject getField6() { return $argnum; }
    public SubLObject getField7() { return $term; }
    public SubLObject getField8() { return $cost; }
    public SubLObject getField9() { return $precomputation; }
    public SubLObject getField10() { return $parent_pred; }
    public SubLObject getField11() { return $parent_pred_inverseP; }
    public SubLObject setField2(SubLObject value) { return $type = value; }
    public SubLObject setField3(SubLObject value) { return $tva_pred = value; }
    public SubLObject setField4(SubLObject value) { return $index_pred = value; }
    public SubLObject setField5(SubLObject value) { return $transitive_pred = value; }
    public SubLObject setField6(SubLObject value) { return $argnum = value; }
    public SubLObject setField7(SubLObject value) { return $term = value; }
    public SubLObject setField8(SubLObject value) { return $cost = value; }
    public SubLObject setField9(SubLObject value) { return $precomputation = value; }
    public SubLObject setField10(SubLObject value) { return $parent_pred = value; }
    public SubLObject setField11(SubLObject value) { return $parent_pred_inverseP = value; }
    public SubLObject $type = NIL;
    public SubLObject $tva_pred = NIL;
    public SubLObject $index_pred = NIL;
    public SubLObject $transitive_pred = NIL;
    public SubLObject $argnum = NIL;
    public SubLObject $term = NIL;
    public SubLObject $cost = NIL;
    public SubLObject $precomputation = NIL;
    public SubLObject $parent_pred = NIL;
    public SubLObject $parent_pred_inverseP = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($tva_tactic_native.class, $sym0$TVA_TACTIC, $sym1$TVA_TACTIC_P, $list2, $list3, new String[] {"$type", "$tva_pred", "$index_pred", "$transitive_pred", "$argnum", "$term", "$cost", "$precomputation", "$parent_pred", "$parent_pred_inverseP"}, $list4, $list5, $sym6$PRINT_TVA_TACTIC);
  }

  @SubL(source = "cycl/tva-tactic.lisp", position = 981) 
  public static SubLSymbol $dtp_tva_tactic$ = null;

  @SubL(source = "cycl/tva-tactic.lisp", position = 981) 
  public static final SubLObject tva_tactic_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10214");
    return NIL;
  }

  public static final class $tva_tactic_p$UnaryFunction extends UnaryFunction {
    public $tva_tactic_p$UnaryFunction() { super(extractFunctionNamed("TVA-TACTIC-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10231"); }
  }

  /** The TVA tactic types, in order of intended execution (faster ones first). */
  @SubL(source = "cycl/tva-tactic.lisp", position = 7113) 
  private static SubLSymbol $tva_tactic_types$ = null;

  public static final SubLObject declare_tva_tactic_file() {
    declareFunction(myName, "tva_tactic_print_function_trampoline", "TVA-TACTIC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "tva_tactic_p", "TVA-TACTIC-P", 1, 0, false); new $tva_tactic_p$UnaryFunction();
    //declareFunction(myName, "tva_type", "TVA-TYPE", 1, 0, false);
    //declareFunction(myName, "tva_tva_pred", "TVA-TVA-PRED", 1, 0, false);
    //declareFunction(myName, "tva_index_pred", "TVA-INDEX-PRED", 1, 0, false);
    //declareFunction(myName, "tva_transitive_pred", "TVA-TRANSITIVE-PRED", 1, 0, false);
    //declareFunction(myName, "tva_argnum", "TVA-ARGNUM", 1, 0, false);
    //declareFunction(myName, "tva_term", "TVA-TERM", 1, 0, false);
    //declareFunction(myName, "tva_cost", "TVA-COST", 1, 0, false);
    //declareFunction(myName, "tva_precomputation", "TVA-PRECOMPUTATION", 1, 0, false);
    //declareFunction(myName, "tva_parent_pred", "TVA-PARENT-PRED", 1, 0, false);
    //declareFunction(myName, "tva_parent_pred_inverseP", "TVA-PARENT-PRED-INVERSE?", 1, 0, false);
    //declareFunction(myName, "_csetf_tva_type", "_CSETF-TVA-TYPE", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_tva_pred", "_CSETF-TVA-TVA-PRED", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_index_pred", "_CSETF-TVA-INDEX-PRED", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_transitive_pred", "_CSETF-TVA-TRANSITIVE-PRED", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_argnum", "_CSETF-TVA-ARGNUM", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_term", "_CSETF-TVA-TERM", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_cost", "_CSETF-TVA-COST", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_precomputation", "_CSETF-TVA-PRECOMPUTATION", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_parent_pred", "_CSETF-TVA-PARENT-PRED", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_parent_pred_inverseP", "_CSETF-TVA-PARENT-PRED-INVERSE?", 2, 0, false);
    //declareFunction(myName, "make_tva_tactic", "MAKE-TVA-TACTIC", 0, 1, false);
    //declareFunction(myName, "print_tva_tactic", "PRINT-TVA-TACTIC", 3, 0, false);
    //declareFunction(myName, "show_tva_tactic", "SHOW-TVA-TACTIC", 1, 1, false);
    //declareFunction(myName, "new_tva_tactic", "NEW-TVA-TACTIC", 7, 0, false);
    //declareFunction(myName, "copy_tva_tactic", "COPY-TVA-TACTIC", 2, 0, false);
    //declareFunction(myName, "tva_tactic_tva_pred", "TVA-TACTIC-TVA-PRED", 1, 0, false);
    //declareFunction(myName, "tva_tactic_index_pred", "TVA-TACTIC-INDEX-PRED", 1, 0, false);
    //declareFunction(myName, "tva_tactic_transitive_pred", "TVA-TACTIC-TRANSITIVE-PRED", 1, 0, false);
    //declareFunction(myName, "tva_tactic_parent_pred", "TVA-TACTIC-PARENT-PRED", 1, 0, false);
    //declareFunction(myName, "tva_tactic_parent_pred_inverseP", "TVA-TACTIC-PARENT-PRED-INVERSE?", 1, 0, false);
    //declareFunction(myName, "tva_tactic_argnum", "TVA-TACTIC-ARGNUM", 1, 0, false);
    //declareFunction(myName, "tva_tactic_term", "TVA-TACTIC-TERM", 1, 0, false);
    //declareFunction(myName, "tva_tactic_cost", "TVA-TACTIC-COST", 1, 0, false);
    //declareFunction(myName, "tva_tactic_type", "TVA-TACTIC-TYPE", 1, 0, false);
    //declareFunction(myName, "tva_tactic_precomputation", "TVA-TACTIC-PRECOMPUTATION", 1, 0, false);
    //declareFunction(myName, "tva_tactic_tva_argnum", "TVA-TACTIC-TVA-ARGNUM", 2, 0, false);
    //declareFunction(myName, "tva_tactic_direction", "TVA-TACTIC-DIRECTION", 1, 0, false);
    //declareFunction(myName, "tva_forward_direction_tacticP", "TVA-FORWARD-DIRECTION-TACTIC?", 1, 0, false);
    //declareFunction(myName, "tva_sentence_arg_for_tactic", "TVA-SENTENCE-ARG-FOR-TACTIC", 2, 0, false);
    //declareFunction(myName, "tva_tactic_argnum_to_strategy_argnum", "TVA-TACTIC-ARGNUM-TO-STRATEGY-ARGNUM", 2, 0, false);
    //declareMacro(myName, "do_tva_precomputation_table", "DO-TVA-PRECOMPUTATION-TABLE");
    //declareFunction(myName, "set_tva_tactic_index_pred", "SET-TVA-TACTIC-INDEX-PRED", 2, 0, false);
    //declareFunction(myName, "set_tva_tactic_cost", "SET-TVA-TACTIC-COST", 2, 0, false);
    //declareFunction(myName, "set_tva_tactic_precomputation", "SET-TVA-TACTIC-PRECOMPUTATION", 2, 0, false);
    //declareFunction(myName, "set_tva_tactic_cost_possible_precomputation", "SET-TVA-TACTIC-COST-POSSIBLE-PRECOMPUTATION", 2, 0, false);
    //declareFunction(myName, "sufficient_tactic_p", "SUFFICIENT-TACTIC-P", 1, 0, false);
    //declareFunction(myName, "tva_tactic_type_p", "TVA-TACTIC-TYPE-P", 1, 0, false);
    //declareFunction(myName, "tva_typeL", "TVA-TYPE<", 2, 0, false);
    //declareFunction(myName, "tva_lookup_tactic_p", "TVA-LOOKUP-TACTIC-P", 1, 0, false);
    //declareFunction(myName, "tva_precomputed_tactic_p", "TVA-PRECOMPUTED-TACTIC-P", 1, 0, false);
    //declareFunction(myName, "tva_calculate_closure_tactic_p", "TVA-CALCULATE-CLOSURE-TACTIC-P", 1, 0, false);
    //declareFunction(myName, "tva_predicate_extent_tactic_p", "TVA-PREDICATE-EXTENT-TACTIC-P", 1, 0, false);
    //declareFunction(myName, "tva_tacticL", "TVA-TACTIC<", 2, 0, false);
    //declareFunction(myName, "tva_tactic_subsumes_tactic_p", "TVA-TACTIC-SUBSUMES-TACTIC-P", 2, 1, false);
    //declareFunction(myName, "tva_tactics_overlap_p", "TVA-TACTICS-OVERLAP-P", 2, 0, false);
    //declareFunction(myName, "tva_inverse_tactics_overlap_p", "TVA-INVERSE-TACTICS-OVERLAP-P", 2, 0, false);
    //declareFunction(myName, "determine_tva_tactic_type", "DETERMINE-TVA-TACTIC-TYPE", 4, 0, false);
    //declareFunction(myName, "determine_tactic_type_from_cardinality", "DETERMINE-TACTIC-TYPE-FROM-CARDINALITY", 4, 0, false);
    //declareFunction(myName, "tva_cost_and_precomputation", "TVA-COST-AND-PRECOMPUTATION", 2, 0, false);
    //declareFunction(myName, "prune_sbhl_closure_wrt_genl_preds_and_inverse", "PRUNE-SBHL-CLOSURE-WRT-GENL-PREDS-AND-INVERSE", 2, 0, false);
    //declareFunction(myName, "compute_tva_closure", "COMPUTE-TVA-CLOSURE", 3, 0, false);
    //declareFunction(myName, "tva_closure_cardinality", "TVA-CLOSURE-CARDINALITY", 1, 0, false);
    //declareFunction(myName, "tva_closure_cardinality_estimate", "TVA-CLOSURE-CARDINALITY-ESTIMATE", 3, 0, false);
    //declareMacro(myName, "tva_do_all_gaf_arg_index", "TVA-DO-ALL-GAF-ARG-INDEX");
    //declareMacro(myName, "do_tva_sentences_for_lookup_tactic", "DO-TVA-SENTENCES-FOR-LOOKUP-TACTIC");
    //declareMacro(myName, "do_tva_sentences_for_precomputed_tactic", "DO-TVA-SENTENCES-FOR-PRECOMPUTED-TACTIC");
    //declareMacro(myName, "do_tva_sentences_for_calculate_closure_tactic", "DO-TVA-SENTENCES-FOR-CALCULATE-CLOSURE-TACTIC");
    //declareMacro(myName, "do_tva_sentences_for_predicate_extent_tactic", "DO-TVA-SENTENCES-FOR-PREDICATE-EXTENT-TACTIC");
    //declareFunction(myName, "possibly_discharge_evaluatable_predicate_meta_tactic", "POSSIBLY-DISCHARGE-EVALUATABLE-PREDICATE-META-TACTIC", 3, 0, false);
    //declareFunction(myName, "discharge_tva_precomputed_tactic", "DISCHARGE-TVA-PRECOMPUTED-TACTIC", 3, 0, false);
    //declareFunction(myName, "discharge_tva_calculate_closure_tactic", "DISCHARGE-TVA-CALCULATE-CLOSURE-TACTIC", 3, 0, false);
    //declareFunction(myName, "discharge_tva_predicate_extent_tactic", "DISCHARGE-TVA-PREDICATE-EXTENT-TACTIC", 3, 0, false);
    //declareFunction(myName, "tva_justify_subsumption", "TVA-JUSTIFY-SUBSUMPTION", 3, 0, false);
    //declareFunction(myName, "tva_index_to_parent_pred_justification", "TVA-INDEX-TO-PARENT-PRED-JUSTIFICATION", 2, 0, false);
    //declareFunction(myName, "tva_parent_to_asent_pred_justification", "TVA-PARENT-TO-ASENT-PRED-JUSTIFICATION", 2, 0, false);
    //declareFunction(myName, "genl_inverse_support_in_supportsP", "GENL-INVERSE-SUPPORT-IN-SUPPORTS?", 3, 0, false);
    //declareFunction(myName, "genl_preds_support_in_supportsP", "GENL-PREDS-SUPPORT-IN-SUPPORTS?", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_tva_tactic_file() {
    $dtp_tva_tactic$ = defconstant("*DTP-TVA-TACTIC*", $sym0$TVA_TACTIC);
    $tva_tactic_types$ = deflexical("*TVA-TACTIC-TYPES*", $list60);
    return NIL;
  }

  public static final SubLObject setup_tva_tactic_file() {
    // CVS_ID("Id: tva-tactic.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_tva_tactic$.getGlobalValue(), Symbols.symbol_function($sym7$TVA_TACTIC_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$TVA_TYPE, $sym9$_CSETF_TVA_TYPE);
    Structures.def_csetf($sym10$TVA_TVA_PRED, $sym11$_CSETF_TVA_TVA_PRED);
    Structures.def_csetf($sym12$TVA_INDEX_PRED, $sym13$_CSETF_TVA_INDEX_PRED);
    Structures.def_csetf($sym14$TVA_TRANSITIVE_PRED, $sym15$_CSETF_TVA_TRANSITIVE_PRED);
    Structures.def_csetf($sym16$TVA_ARGNUM, $sym17$_CSETF_TVA_ARGNUM);
    Structures.def_csetf($sym18$TVA_TERM, $sym19$_CSETF_TVA_TERM);
    Structures.def_csetf($sym20$TVA_COST, $sym21$_CSETF_TVA_COST);
    Structures.def_csetf($sym22$TVA_PRECOMPUTATION, $sym23$_CSETF_TVA_PRECOMPUTATION);
    Structures.def_csetf($sym24$TVA_PARENT_PRED, $sym25$_CSETF_TVA_PARENT_PRED);
    Structures.def_csetf($sym26$TVA_PARENT_PRED_INVERSE_, $sym27$_CSETF_TVA_PARENT_PRED_INVERSE_);
    Equality.identity($sym0$TVA_TACTIC);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$TVA_TACTIC = makeSymbol("TVA-TACTIC");
  public static final SubLSymbol $sym1$TVA_TACTIC_P = makeSymbol("TVA-TACTIC-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("TYPE"), makeSymbol("TVA-PRED"), makeSymbol("INDEX-PRED"), makeSymbol("TRANSITIVE-PRED"), makeSymbol("ARGNUM"), makeSymbol("TERM"), makeSymbol("COST"), makeSymbol("PRECOMPUTATION"), makeSymbol("PARENT-PRED"), makeSymbol("PARENT-PRED-INVERSE?")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("TYPE"), makeKeyword("TVA-PRED"), makeKeyword("INDEX-PRED"), makeKeyword("TRANSITIVE-PRED"), makeKeyword("ARGNUM"), makeKeyword("TERM"), makeKeyword("COST"), makeKeyword("PRECOMPUTATION"), makeKeyword("PARENT-PRED"), makeKeyword("PARENT-PRED-INVERSE?")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("TVA-TYPE"), makeSymbol("TVA-TVA-PRED"), makeSymbol("TVA-INDEX-PRED"), makeSymbol("TVA-TRANSITIVE-PRED"), makeSymbol("TVA-ARGNUM"), makeSymbol("TVA-TERM"), makeSymbol("TVA-COST"), makeSymbol("TVA-PRECOMPUTATION"), makeSymbol("TVA-PARENT-PRED"), makeSymbol("TVA-PARENT-PRED-INVERSE?")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-TVA-TYPE"), makeSymbol("_CSETF-TVA-TVA-PRED"), makeSymbol("_CSETF-TVA-INDEX-PRED"), makeSymbol("_CSETF-TVA-TRANSITIVE-PRED"), makeSymbol("_CSETF-TVA-ARGNUM"), makeSymbol("_CSETF-TVA-TERM"), makeSymbol("_CSETF-TVA-COST"), makeSymbol("_CSETF-TVA-PRECOMPUTATION"), makeSymbol("_CSETF-TVA-PARENT-PRED"), makeSymbol("_CSETF-TVA-PARENT-PRED-INVERSE?")});
  public static final SubLSymbol $sym6$PRINT_TVA_TACTIC = makeSymbol("PRINT-TVA-TACTIC");
  public static final SubLSymbol $sym7$TVA_TACTIC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TVA-TACTIC-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$TVA_TYPE = makeSymbol("TVA-TYPE");
  public static final SubLSymbol $sym9$_CSETF_TVA_TYPE = makeSymbol("_CSETF-TVA-TYPE");
  public static final SubLSymbol $sym10$TVA_TVA_PRED = makeSymbol("TVA-TVA-PRED");
  public static final SubLSymbol $sym11$_CSETF_TVA_TVA_PRED = makeSymbol("_CSETF-TVA-TVA-PRED");
  public static final SubLSymbol $sym12$TVA_INDEX_PRED = makeSymbol("TVA-INDEX-PRED");
  public static final SubLSymbol $sym13$_CSETF_TVA_INDEX_PRED = makeSymbol("_CSETF-TVA-INDEX-PRED");
  public static final SubLSymbol $sym14$TVA_TRANSITIVE_PRED = makeSymbol("TVA-TRANSITIVE-PRED");
  public static final SubLSymbol $sym15$_CSETF_TVA_TRANSITIVE_PRED = makeSymbol("_CSETF-TVA-TRANSITIVE-PRED");
  public static final SubLSymbol $sym16$TVA_ARGNUM = makeSymbol("TVA-ARGNUM");
  public static final SubLSymbol $sym17$_CSETF_TVA_ARGNUM = makeSymbol("_CSETF-TVA-ARGNUM");
  public static final SubLSymbol $sym18$TVA_TERM = makeSymbol("TVA-TERM");
  public static final SubLSymbol $sym19$_CSETF_TVA_TERM = makeSymbol("_CSETF-TVA-TERM");
  public static final SubLSymbol $sym20$TVA_COST = makeSymbol("TVA-COST");
  public static final SubLSymbol $sym21$_CSETF_TVA_COST = makeSymbol("_CSETF-TVA-COST");
  public static final SubLSymbol $sym22$TVA_PRECOMPUTATION = makeSymbol("TVA-PRECOMPUTATION");
  public static final SubLSymbol $sym23$_CSETF_TVA_PRECOMPUTATION = makeSymbol("_CSETF-TVA-PRECOMPUTATION");
  public static final SubLSymbol $sym24$TVA_PARENT_PRED = makeSymbol("TVA-PARENT-PRED");
  public static final SubLSymbol $sym25$_CSETF_TVA_PARENT_PRED = makeSymbol("_CSETF-TVA-PARENT-PRED");
  public static final SubLSymbol $sym26$TVA_PARENT_PRED_INVERSE_ = makeSymbol("TVA-PARENT-PRED-INVERSE?");
  public static final SubLSymbol $sym27$_CSETF_TVA_PARENT_PRED_INVERSE_ = makeSymbol("_CSETF-TVA-PARENT-PRED-INVERSE?");
  public static final SubLSymbol $kw28$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw29$TVA_PRED = makeKeyword("TVA-PRED");
  public static final SubLSymbol $kw30$INDEX_PRED = makeKeyword("INDEX-PRED");
  public static final SubLSymbol $kw31$TRANSITIVE_PRED = makeKeyword("TRANSITIVE-PRED");
  public static final SubLSymbol $kw32$ARGNUM = makeKeyword("ARGNUM");
  public static final SubLSymbol $kw33$TERM = makeKeyword("TERM");
  public static final SubLSymbol $kw34$COST = makeKeyword("COST");
  public static final SubLSymbol $kw35$PRECOMPUTATION = makeKeyword("PRECOMPUTATION");
  public static final SubLSymbol $kw36$PARENT_PRED = makeKeyword("PARENT-PRED");
  public static final SubLSymbol $kw37$PARENT_PRED_INVERSE_ = makeKeyword("PARENT-PRED-INVERSE?");
  public static final SubLString $str38$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str39$__ = makeString("#<");
  public static final SubLSymbol $kw40$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw41$BASE = makeKeyword("BASE");
  public static final SubLString $str42$tva_pred____a__ = makeString("tva-pred : ~a~%");
  public static final SubLString $str43$tva_index_pred____a__ = makeString("tva-index-pred : ~a~%");
  public static final SubLString $str44$tva_transitive_pred____a__ = makeString("tva-transitive-pred : ~a~%");
  public static final SubLString $str45$tva_argnum____a__ = makeString("tva-argnum : ~a~%");
  public static final SubLString $str46$tva_term____S__ = makeString("tva-term : ~S~%");
  public static final SubLString $str47$tva_cost____a__ = makeString("tva-cost : ~a~%");
  public static final SubLString $str48$tva_tactic_type____a__ = makeString("tva-tactic-type : ~a~%");
  public static final SubLString $str49$tva_precomputation____a__ = makeString("tva-precomputation : ~a~%");
  public static final SubLString $str50$tva_parent_pred____a__ = makeString("tva-parent-pred : ~a~%");
  public static final SubLString $str51$tva_parent_pred_inverse_____a = makeString("tva-parent-pred-inverse? : ~a");
  public static final SubLSymbol $kw52$FREE = makeKeyword("FREE");
  public static final SubLSymbol $kw53$FORWARD = makeKeyword("FORWARD");
  public static final SubLList $list54 = list(list(makeSymbol("ARG-VAR"), makeSymbol("TVA-TACTIC"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym55$MARKING_VAR = makeUninternedSymbol("MARKING-VAR");
  public static final SubLSymbol $sym56$DO_SBHL_TABLE = makeSymbol("DO-SBHL-TABLE");
  public static final SubLSymbol $sym57$TVA_TACTIC_PRECOMPUTATION = makeSymbol("TVA-TACTIC-PRECOMPUTATION");
  public static final SubLSymbol $sym58$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym59$TVA_PRECOMPUTATION_P = makeSymbol("TVA-PRECOMPUTATION-P");
  public static final SubLList $list60 = list(makeKeyword("LOOKUP"), makeKeyword("PRECOMPUTED-CLOSURE"), makeKeyword("CALCULATE-CLOSURE"), makeKeyword("PREDICATE-EXTENT"));
  public static final SubLSymbol $kw61$LOOKUP = makeKeyword("LOOKUP");
  public static final SubLSymbol $kw62$PRECOMPUTED_CLOSURE = makeKeyword("PRECOMPUTED-CLOSURE");
  public static final SubLSymbol $kw63$CALCULATE_CLOSURE = makeKeyword("CALCULATE-CLOSURE");
  public static final SubLSymbol $kw64$PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
  public static final SubLObject $const65$transitiveViaArg = constant_handles.reader_make_constant_shell(makeString("transitiveViaArg"));
  public static final SubLObject $const66$conservativeViaArg = constant_handles.reader_make_constant_shell(makeString("conservativeViaArg"));
  public static final SubLObject $const67$transitiveViaArgInverse = constant_handles.reader_make_constant_shell(makeString("transitiveViaArgInverse"));
  public static final SubLObject $const68$conservativeViaArgInverse = constant_handles.reader_make_constant_shell(makeString("conservativeViaArgInverse"));
  public static final SubLObject $const69$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLObject $const70$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLString $str71$Continue_ = makeString("Continue?");
  public static final SubLString $str72$Error_in_predicate__a = makeString("Error in predicate ~a");
  public static final SubLSymbol $kw73$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLString $str74$Error_in_direction__a = makeString("Error in direction ~a");
  public static final SubLList $list75 = list(list(makeSymbol("SENTENCE-VAR"), makeSymbol("MT-VAR"), makeSymbol("PRED"), makeSymbol("TERM"), makeSymbol("ARGNUM"), makeSymbol("DONE?-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym76$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym77$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym78$DO_GAF_ARG_INDEX = makeSymbol("DO-GAF-ARG-INDEX");
  public static final SubLSymbol $kw79$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $kw80$INDEX = makeKeyword("INDEX");
  public static final SubLSymbol $kw81$TRUTH = makeKeyword("TRUTH");
  public static final SubLSymbol $kw82$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw83$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym84$PWHEN_FEATURE = makeSymbol("PWHEN-FEATURE");
  public static final SubLSymbol $kw85$CYC_SKSI = makeKeyword("CYC-SKSI");
  public static final SubLSymbol $sym86$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym87$SKSI_GAF_ARG_POSSIBLE_P = makeSymbol("SKSI-GAF-ARG-POSSIBLE-P");
  public static final SubLSymbol $sym88$DO_SKSI_GAF_ARG_INDEX_GP = makeSymbol("DO-SKSI-GAF-ARG-INDEX-GP");
  public static final SubLSymbol $kw89$INDEX_ARGNUM = makeKeyword("INDEX-ARGNUM");
  public static final SubLList $list90 = list(list(makeSymbol("SENTENCE-VAR"), makeSymbol("MT-VAR"), makeSymbol("TACTIC"), makeSymbol("DONE?-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym91$PRED = makeUninternedSymbol("PRED");
  public static final SubLSymbol $sym92$ARG = makeUninternedSymbol("ARG");
  public static final SubLSymbol $sym93$ARGNUM = makeUninternedSymbol("ARGNUM");
  public static final SubLSymbol $sym94$TVA_TACTIC_ARGNUM = makeSymbol("TVA-TACTIC-ARGNUM");
  public static final SubLSymbol $sym95$TVA_TACTIC_TERM = makeSymbol("TVA-TACTIC-TERM");
  public static final SubLSymbol $sym96$TVA_DO_ALL_GAF_ARG_INDEX = makeSymbol("TVA-DO-ALL-GAF-ARG-INDEX");
  public static final SubLSymbol $sym97$PRED = makeUninternedSymbol("PRED");
  public static final SubLSymbol $sym98$ARG = makeUninternedSymbol("ARG");
  public static final SubLSymbol $sym99$ARGNUM = makeUninternedSymbol("ARGNUM");
  public static final SubLSymbol $sym100$DO_TVA_PRECOMPUTATION_TABLE = makeSymbol("DO-TVA-PRECOMPUTATION-TABLE");
  public static final SubLSymbol $sym101$ARG = makeUninternedSymbol("ARG");
  public static final SubLSymbol $sym102$TRANS_PRED = makeUninternedSymbol("TRANS-PRED");
  public static final SubLSymbol $sym103$TRANS_PRED_MODULE = makeUninternedSymbol("TRANS-PRED-MODULE");
  public static final SubLSymbol $sym104$DIRECTION = makeUninternedSymbol("DIRECTION");
  public static final SubLSymbol $sym105$ARGNUM = makeUninternedSymbol("ARGNUM");
  public static final SubLSymbol $sym106$PRED = makeUninternedSymbol("PRED");
  public static final SubLSymbol $sym107$LINK_NODE = makeUninternedSymbol("LINK-NODE");
  public static final SubLSymbol $sym108$TVA_TACTIC_TRANSITIVE_PRED = makeSymbol("TVA-TACTIC-TRANSITIVE-PRED");
  public static final SubLSymbol $sym109$TVA_DIRECTION_FOR_TVA_PRED = makeSymbol("TVA-DIRECTION-FOR-TVA-PRED");
  public static final SubLSymbol $sym110$TVA_TACTIC_TVA_PRED = makeSymbol("TVA-TACTIC-TVA-PRED");
  public static final SubLSymbol $sym111$PIF = makeSymbol("PIF");
  public static final SubLList $list112 = list(constant_handles.reader_make_constant_shell(makeString("genlPreds")));
  public static final SubLSymbol $sym113$GET_SBHL_MODULE = makeSymbol("GET-SBHL-MODULE");
  public static final SubLSymbol $sym114$DO_ALL_SIMPLE_TRUE_LINKS_FOR_INVERSES = makeSymbol("DO-ALL-SIMPLE-TRUE-LINKS-FOR-INVERSES");
  public static final SubLSymbol $sym115$DO_GHL_CLOSURE = makeSymbol("DO-GHL-CLOSURE");
  public static final SubLSymbol $sym116$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym117$PRED = makeUninternedSymbol("PRED");
  public static final SubLList $list118 = list(makeSymbol("TVA-ITERATES-KB-PREDICATE-EXTENT?"));
  public static final SubLSymbol $sym119$DO_PREDICATE_EXTENT_INDEX = makeSymbol("DO-PREDICATE-EXTENT-INDEX");
  public static final SubLList $list120 = list(makeSymbol("TVA-ITERATES-SKSI-PREDICATE-EXTENT?"));
  public static final SubLSymbol $sym121$DO_SKSI_PREDICATE_EXTENT_INDEX = makeSymbol("DO-SKSI-PREDICATE-EXTENT-INDEX");
  public static final SubLList $list122 = list(makeSymbol("FAIL-SPACE"), makeSymbol("GOAL-SPACE"));
  public static final SubLString $str123$Continue_Anyway_ = makeString("Continue Anyway?");

  //// Initializers

  public void declareFunctions() {
    declare_tva_tactic_file();
  }

  public void initializeVariables() {
    init_tva_tactic_file();
  }

  public void runTopLevelForms() {
    setup_tva_tactic_file();
  }

}
