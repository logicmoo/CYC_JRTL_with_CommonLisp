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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.inference.ask_utilities;
//dm import com.cyc.cycjava_1.cycl.backward;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_strategist;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class cycl_query_specification extends SubLTranslatedFile {

  //// Constructor

  private cycl_query_specification() {}
  public static final SubLFile me = new cycl_query_specification();
  public static final String myName = "com.cyc.cycjava_1.cycl.cycl_query_specification";

  //// Definitions

  public static final class $cycl_query_specification_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $cycl_id; }
    public SubLObject getField3() { return $formula; }
    public SubLObject getField4() { return $mt; }
    public SubLObject getField5() { return $comment; }
    public SubLObject getField6() { return $max_number_of_results; }
    public SubLObject getField7() { return $back_chaining; }
    public SubLObject getField8() { return $time_cutoff_secs; }
    public SubLObject getField9() { return $max_depth; }
    public SubLObject getField10() { return $removal_cost_cutoff; }
    public SubLObject getField11() { return $enable_negation_by_failure; }
    public SubLObject getField12() { return $enable_hl_predicate_backchaining; }
    public SubLObject getField13() { return $enable_cache_backwards_query_results; }
    public SubLObject getField14() { return $enable_unbound_predicate_backchaining; }
    public SubLObject getField15() { return $enable_semantic_pruning; }
    public SubLObject getField16() { return $enable_consideration_of_disjunctive_temporal_relations; }
    public SubLObject setField2(SubLObject value) { return $cycl_id = value; }
    public SubLObject setField3(SubLObject value) { return $formula = value; }
    public SubLObject setField4(SubLObject value) { return $mt = value; }
    public SubLObject setField5(SubLObject value) { return $comment = value; }
    public SubLObject setField6(SubLObject value) { return $max_number_of_results = value; }
    public SubLObject setField7(SubLObject value) { return $back_chaining = value; }
    public SubLObject setField8(SubLObject value) { return $time_cutoff_secs = value; }
    public SubLObject setField9(SubLObject value) { return $max_depth = value; }
    public SubLObject setField10(SubLObject value) { return $removal_cost_cutoff = value; }
    public SubLObject setField11(SubLObject value) { return $enable_negation_by_failure = value; }
    public SubLObject setField12(SubLObject value) { return $enable_hl_predicate_backchaining = value; }
    public SubLObject setField13(SubLObject value) { return $enable_cache_backwards_query_results = value; }
    public SubLObject setField14(SubLObject value) { return $enable_unbound_predicate_backchaining = value; }
    public SubLObject setField15(SubLObject value) { return $enable_semantic_pruning = value; }
    public SubLObject setField16(SubLObject value) { return $enable_consideration_of_disjunctive_temporal_relations = value; }
    public SubLObject $cycl_id = NIL;
    public SubLObject $formula = NIL;
    public SubLObject $mt = NIL;
    public SubLObject $comment = NIL;
    public SubLObject $max_number_of_results = NIL;
    public SubLObject $back_chaining = NIL;
    public SubLObject $time_cutoff_secs = NIL;
    public SubLObject $max_depth = NIL;
    public SubLObject $removal_cost_cutoff = NIL;
    public SubLObject $enable_negation_by_failure = NIL;
    public SubLObject $enable_hl_predicate_backchaining = NIL;
    public SubLObject $enable_cache_backwards_query_results = NIL;
    public SubLObject $enable_unbound_predicate_backchaining = NIL;
    public SubLObject $enable_semantic_pruning = NIL;
    public SubLObject $enable_consideration_of_disjunctive_temporal_relations = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($cycl_query_specification_native.class, $sym0$CYCL_QUERY_SPECIFICATION, $sym1$CYCL_QUERY_SPECIFICATION_P, $list2, $list3, new String[] {"$cycl_id", "$formula", "$mt", "$comment", "$max_number_of_results", "$back_chaining", "$time_cutoff_secs", "$max_depth", "$removal_cost_cutoff", "$enable_negation_by_failure", "$enable_hl_predicate_backchaining", "$enable_cache_backwards_query_results", "$enable_unbound_predicate_backchaining", "$enable_semantic_pruning", "$enable_consideration_of_disjunctive_temporal_relations"}, $list4, $list5, $sym6$CYCL_QUERY_SPECIFICATION_PRINT);
  }

  @SubL(source = "cycl/cycl-query-specification.lisp", position = 1604) 
  public static SubLSymbol $dtp_cycl_query_specification$ = null;

  @SubL(source = "cycl/cycl-query-specification.lisp", position = 1604) 
  public static final SubLObject cycl_query_specification_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23853");
    return NIL;
  }

  public static final class $cycl_query_specification_p$UnaryFunction extends UnaryFunction {
    public $cycl_query_specification_p$UnaryFunction() { super(extractFunctionNamed("CYCL-QUERY-SPECIFICATION-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23852"); }
  }

  public static final SubLObject declare_cycl_query_specification_file() {
    declareFunction(myName, "cycl_query_specification_print_function_trampoline", "CYCL-QUERY-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "cycl_query_specification_p", "CYCL-QUERY-SPECIFICATION-P", 1, 0, false); new $cycl_query_specification_p$UnaryFunction();
    declareFunction(myName, "cycl_query_spec_cycl_id", "CYCL-QUERY-SPEC-CYCL-ID", 1, 0, false);
    declareFunction(myName, "cycl_query_spec_formula", "CYCL-QUERY-SPEC-FORMULA", 1, 0, false);
    declareFunction(myName, "cycl_query_spec_mt", "CYCL-QUERY-SPEC-MT", 1, 0, false);
    declareFunction(myName, "cycl_query_spec_comment", "CYCL-QUERY-SPEC-COMMENT", 1, 0, false);
    declareFunction(myName, "cycl_query_spec_max_number_of_results", "CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS", 1, 0, false);
    declareFunction(myName, "cycl_query_spec_back_chaining", "CYCL-QUERY-SPEC-BACK-CHAINING", 1, 0, false);
    declareFunction(myName, "cycl_query_spec_time_cutoff_secs", "CYCL-QUERY-SPEC-TIME-CUTOFF-SECS", 1, 0, false);
    declareFunction(myName, "cycl_query_spec_max_depth", "CYCL-QUERY-SPEC-MAX-DEPTH", 1, 0, false);
    declareFunction(myName, "cycl_query_spec_removal_cost_cutoff", "CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF", 1, 0, false);
    declareFunction(myName, "cycl_query_spec_enable_negation_by_failure", "CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE", 1, 0, false);
    declareFunction(myName, "cycl_query_spec_enable_hl_predicate_backchaining", "CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING", 1, 0, false);
    declareFunction(myName, "cycl_query_spec_enable_cache_backwards_query_results", "CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS", 1, 0, false);
    declareFunction(myName, "cycl_query_spec_enable_unbound_predicate_backchaining", "CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING", 1, 0, false);
    declareFunction(myName, "cycl_query_spec_enable_semantic_pruning", "CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING", 1, 0, false);
    declareFunction(myName, "cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations", "CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS", 1, 0, false);
    declareFunction(myName, "_csetf_cycl_query_spec_cycl_id", "_CSETF-CYCL-QUERY-SPEC-CYCL-ID", 2, 0, false);
    declareFunction(myName, "_csetf_cycl_query_spec_formula", "_CSETF-CYCL-QUERY-SPEC-FORMULA", 2, 0, false);
    declareFunction(myName, "_csetf_cycl_query_spec_mt", "_CSETF-CYCL-QUERY-SPEC-MT", 2, 0, false);
    declareFunction(myName, "_csetf_cycl_query_spec_comment", "_CSETF-CYCL-QUERY-SPEC-COMMENT", 2, 0, false);
    declareFunction(myName, "_csetf_cycl_query_spec_max_number_of_results", "_CSETF-CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS", 2, 0, false);
    declareFunction(myName, "_csetf_cycl_query_spec_back_chaining", "_CSETF-CYCL-QUERY-SPEC-BACK-CHAINING", 2, 0, false);
    declareFunction(myName, "_csetf_cycl_query_spec_time_cutoff_secs", "_CSETF-CYCL-QUERY-SPEC-TIME-CUTOFF-SECS", 2, 0, false);
    declareFunction(myName, "_csetf_cycl_query_spec_max_depth", "_CSETF-CYCL-QUERY-SPEC-MAX-DEPTH", 2, 0, false);
    declareFunction(myName, "_csetf_cycl_query_spec_removal_cost_cutoff", "_CSETF-CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF", 2, 0, false);
    declareFunction(myName, "_csetf_cycl_query_spec_enable_negation_by_failure", "_CSETF-CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE", 2, 0, false);
    declareFunction(myName, "_csetf_cycl_query_spec_enable_hl_predicate_backchaining", "_CSETF-CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING", 2, 0, false);
    declareFunction(myName, "_csetf_cycl_query_spec_enable_cache_backwards_query_results", "_CSETF-CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS", 2, 0, false);
    declareFunction(myName, "_csetf_cycl_query_spec_enable_unbound_predicate_backchaining", "_CSETF-CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING", 2, 0, false);
    declareFunction(myName, "_csetf_cycl_query_spec_enable_semantic_pruning", "_CSETF-CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING", 2, 0, false);
    declareFunction(myName, "_csetf_cycl_query_spec_enable_consideration_of_disjunctive_temporal_relations", "_CSETF-CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS", 2, 0, false);
    declareFunction(myName, "make_cycl_query_specification", "MAKE-CYCL-QUERY-SPECIFICATION", 0, 1, false);
    declareFunction(myName, "cycl_query_specification_cycl_id", "CYCL-QUERY-SPECIFICATION-CYCL-ID", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_formula", "CYCL-QUERY-SPECIFICATION-FORMULA", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_mt", "CYCL-QUERY-SPECIFICATION-MT", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_comment", "CYCL-QUERY-SPECIFICATION-COMMENT", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_max_number_of_results", "CYCL-QUERY-SPECIFICATION-MAX-NUMBER-OF-RESULTS", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_back_chaining", "CYCL-QUERY-SPECIFICATION-BACK-CHAINING", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_time_cutoff_secs", "CYCL-QUERY-SPECIFICATION-TIME-CUTOFF-SECS", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_max_depth", "CYCL-QUERY-SPECIFICATION-MAX-DEPTH", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_conditional_sentenceP", "CYCL-QUERY-SPECIFICATION-CONDITIONAL-SENTENCE?", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_removal_cost_cutoff", "CYCL-QUERY-SPECIFICATION-REMOVAL-COST-CUTOFF", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_enable_negation_by_failure", "CYCL-QUERY-SPECIFICATION-ENABLE-NEGATION-BY-FAILURE", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_enable_hl_predicate_backchaining", "CYCL-QUERY-SPECIFICATION-ENABLE-HL-PREDICATE-BACKCHAINING", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_enable_cache_backwards_query_results", "CYCL-QUERY-SPECIFICATION-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_enable_unbound_predicate_backchaining", "CYCL-QUERY-SPECIFICATION-ENABLE-UNBOUND-PREDICATE-BACKCHAINING", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_enable_semantic_pruning", "CYCL-QUERY-SPECIFICATION-ENABLE-SEMANTIC-PRUNING", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_enable_consideration_of_disjunctive_temporal_relations", "CYCL-QUERY-SPECIFICATION-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_copy", "CYCL-QUERY-SPECIFICATION-COPY", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_print", "CYCL-QUERY-SPECIFICATION-PRINT", 3, 0, false);
    declareFunction(myName, "cycl_query_specification_new", "CYCL-QUERY-SPECIFICATION-NEW", 0, 0, false);
    declareFunction(myName, "cycl_query_specification_assign_param", "CYCL-QUERY-SPECIFICATION-ASSIGN-PARAM", 3, 0, false);
    declareFunction(myName, "cycl_query_specification_get", "CYCL-QUERY-SPECIFICATION-GET", 1, 1, false);
    declareFunction(myName, "cycl_query_specification_ask_int", "CYCL-QUERY-SPECIFICATION-ASK-INT", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_ask", "CYCL-QUERY-SPECIFICATION-ASK", 1, 0, false);
    declareFunction(myName, "cycl_query_specification_set_mt", "CYCL-QUERY-SPECIFICATION-SET-MT", 2, 0, false);
    declareFunction(myName, "cycl_query_specification_new_query_from_old", "CYCL-QUERY-SPECIFICATION-NEW-QUERY-FROM-OLD", 3, 0, false);
    declareFunction(myName, "new_continuable_inference_from_cycl_query_spec", "NEW-CONTINUABLE-INFERENCE-FROM-CYCL-QUERY-SPEC", 1, 0, false);
    declareFunction(myName, "continue_cycl_query_spec_inference", "CONTINUE-CYCL-QUERY-SPEC-INFERENCE", 2, 0, false);
    declareFunction(myName, "static_query_properties_from_cycl_query_spec", "STATIC-QUERY-PROPERTIES-FROM-CYCL-QUERY-SPEC", 1, 0, false);
    declareFunction(myName, "dynamic_query_properties_from_cycl_query_spec", "DYNAMIC-QUERY-PROPERTIES-FROM-CYCL-QUERY-SPEC", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_cycl_query_specification_file() {
    $dtp_cycl_query_specification$ = defconstant("*DTP-CYCL-QUERY-SPECIFICATION*", $sym0$CYCL_QUERY_SPECIFICATION);
    return NIL;
  }

  public static final SubLObject setup_cycl_query_specification_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_cycl_query_specification$.getGlobalValue(), Symbols.symbol_function($sym7$CYCL_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$CYCL_QUERY_SPEC_CYCL_ID, $sym9$_CSETF_CYCL_QUERY_SPEC_CYCL_ID);
    Structures.def_csetf($sym10$CYCL_QUERY_SPEC_FORMULA, $sym11$_CSETF_CYCL_QUERY_SPEC_FORMULA);
    Structures.def_csetf($sym12$CYCL_QUERY_SPEC_MT, $sym13$_CSETF_CYCL_QUERY_SPEC_MT);
    Structures.def_csetf($sym14$CYCL_QUERY_SPEC_COMMENT, $sym15$_CSETF_CYCL_QUERY_SPEC_COMMENT);
    Structures.def_csetf($sym16$CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS, $sym17$_CSETF_CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS);
    Structures.def_csetf($sym18$CYCL_QUERY_SPEC_BACK_CHAINING, $sym19$_CSETF_CYCL_QUERY_SPEC_BACK_CHAINING);
    Structures.def_csetf($sym20$CYCL_QUERY_SPEC_TIME_CUTOFF_SECS, $sym21$_CSETF_CYCL_QUERY_SPEC_TIME_CUTOFF_SECS);
    Structures.def_csetf($sym22$CYCL_QUERY_SPEC_MAX_DEPTH, $sym23$_CSETF_CYCL_QUERY_SPEC_MAX_DEPTH);
    Structures.def_csetf($sym24$CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF, $sym25$_CSETF_CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF);
    Structures.def_csetf($sym26$CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE, $sym27$_CSETF_CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE);
    Structures.def_csetf($sym28$CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING, $sym29$_CSETF_CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING);
    Structures.def_csetf($sym30$CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS, $sym31$_CSETF_CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS);
    Structures.def_csetf($sym32$CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING, $sym33$_CSETF_CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING);
    Structures.def_csetf($sym34$CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING, $sym35$_CSETF_CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING);
    Structures.def_csetf($sym36$CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELA, $sym37$_CSETF_CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPOR);
    Equality.identity($sym0$CYCL_QUERY_SPECIFICATION);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CYCL_QUERY_SPECIFICATION = makeSymbol("CYCL-QUERY-SPECIFICATION");
  public static final SubLSymbol $sym1$CYCL_QUERY_SPECIFICATION_P = makeSymbol("CYCL-QUERY-SPECIFICATION-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("CYCL-ID"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("COMMENT"), makeSymbol("MAX-NUMBER-OF-RESULTS"), makeSymbol("BACK-CHAINING"), makeSymbol("TIME-CUTOFF-SECS"), makeSymbol("MAX-DEPTH"), makeSymbol("REMOVAL-COST-CUTOFF"), makeSymbol("ENABLE-NEGATION-BY-FAILURE"), makeSymbol("ENABLE-HL-PREDICATE-BACKCHAINING"), makeSymbol("ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), makeSymbol("ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), makeSymbol("ENABLE-SEMANTIC-PRUNING"), makeSymbol("ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("CYCL-ID"), makeKeyword("FORMULA"), makeKeyword("MT"), makeKeyword("COMMENT"), makeKeyword("MAX-NUMBER-OF-RESULTS"), makeKeyword("BACK-CHAINING"), makeKeyword("TIME-CUTOFF-SECS"), makeKeyword("MAX-DEPTH"), makeKeyword("REMOVAL-COST-CUTOFF"), makeKeyword("ENABLE-NEGATION-BY-FAILURE"), makeKeyword("ENABLE-HL-PREDICATE-BACKCHAINING"), makeKeyword("ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), makeKeyword("ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), makeKeyword("ENABLE-SEMANTIC-PRUNING"), makeKeyword("ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("CYCL-QUERY-SPEC-CYCL-ID"), makeSymbol("CYCL-QUERY-SPEC-FORMULA"), makeSymbol("CYCL-QUERY-SPEC-MT"), makeSymbol("CYCL-QUERY-SPEC-COMMENT"), makeSymbol("CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS"), makeSymbol("CYCL-QUERY-SPEC-BACK-CHAINING"), makeSymbol("CYCL-QUERY-SPEC-TIME-CUTOFF-SECS"), makeSymbol("CYCL-QUERY-SPEC-MAX-DEPTH"), makeSymbol("CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING"), makeSymbol("CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-CYCL-QUERY-SPEC-CYCL-ID"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-FORMULA"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-MT"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-COMMENT"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-BACK-CHAINING"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-TIME-CUTOFF-SECS"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-MAX-DEPTH"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING"), makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS")});
  public static final SubLSymbol $sym6$CYCL_QUERY_SPECIFICATION_PRINT = makeSymbol("CYCL-QUERY-SPECIFICATION-PRINT");
  public static final SubLSymbol $sym7$CYCL_QUERY_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CYCL-QUERY-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$CYCL_QUERY_SPEC_CYCL_ID = makeSymbol("CYCL-QUERY-SPEC-CYCL-ID");
  public static final SubLSymbol $sym9$_CSETF_CYCL_QUERY_SPEC_CYCL_ID = makeSymbol("_CSETF-CYCL-QUERY-SPEC-CYCL-ID");
  public static final SubLSymbol $sym10$CYCL_QUERY_SPEC_FORMULA = makeSymbol("CYCL-QUERY-SPEC-FORMULA");
  public static final SubLSymbol $sym11$_CSETF_CYCL_QUERY_SPEC_FORMULA = makeSymbol("_CSETF-CYCL-QUERY-SPEC-FORMULA");
  public static final SubLSymbol $sym12$CYCL_QUERY_SPEC_MT = makeSymbol("CYCL-QUERY-SPEC-MT");
  public static final SubLSymbol $sym13$_CSETF_CYCL_QUERY_SPEC_MT = makeSymbol("_CSETF-CYCL-QUERY-SPEC-MT");
  public static final SubLSymbol $sym14$CYCL_QUERY_SPEC_COMMENT = makeSymbol("CYCL-QUERY-SPEC-COMMENT");
  public static final SubLSymbol $sym15$_CSETF_CYCL_QUERY_SPEC_COMMENT = makeSymbol("_CSETF-CYCL-QUERY-SPEC-COMMENT");
  public static final SubLSymbol $sym16$CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS = makeSymbol("CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS");
  public static final SubLSymbol $sym17$_CSETF_CYCL_QUERY_SPEC_MAX_NUMBER_OF_RESULTS = makeSymbol("_CSETF-CYCL-QUERY-SPEC-MAX-NUMBER-OF-RESULTS");
  public static final SubLSymbol $sym18$CYCL_QUERY_SPEC_BACK_CHAINING = makeSymbol("CYCL-QUERY-SPEC-BACK-CHAINING");
  public static final SubLSymbol $sym19$_CSETF_CYCL_QUERY_SPEC_BACK_CHAINING = makeSymbol("_CSETF-CYCL-QUERY-SPEC-BACK-CHAINING");
  public static final SubLSymbol $sym20$CYCL_QUERY_SPEC_TIME_CUTOFF_SECS = makeSymbol("CYCL-QUERY-SPEC-TIME-CUTOFF-SECS");
  public static final SubLSymbol $sym21$_CSETF_CYCL_QUERY_SPEC_TIME_CUTOFF_SECS = makeSymbol("_CSETF-CYCL-QUERY-SPEC-TIME-CUTOFF-SECS");
  public static final SubLSymbol $sym22$CYCL_QUERY_SPEC_MAX_DEPTH = makeSymbol("CYCL-QUERY-SPEC-MAX-DEPTH");
  public static final SubLSymbol $sym23$_CSETF_CYCL_QUERY_SPEC_MAX_DEPTH = makeSymbol("_CSETF-CYCL-QUERY-SPEC-MAX-DEPTH");
  public static final SubLSymbol $sym24$CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF = makeSymbol("CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF");
  public static final SubLSymbol $sym25$_CSETF_CYCL_QUERY_SPEC_REMOVAL_COST_CUTOFF = makeSymbol("_CSETF-CYCL-QUERY-SPEC-REMOVAL-COST-CUTOFF");
  public static final SubLSymbol $sym26$CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE = makeSymbol("CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE");
  public static final SubLSymbol $sym27$_CSETF_CYCL_QUERY_SPEC_ENABLE_NEGATION_BY_FAILURE = makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-NEGATION-BY-FAILURE");
  public static final SubLSymbol $sym28$CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING = makeSymbol("CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING");
  public static final SubLSymbol $sym29$_CSETF_CYCL_QUERY_SPEC_ENABLE_HL_PREDICATE_BACKCHAINING = makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-HL-PREDICATE-BACKCHAINING");
  public static final SubLSymbol $sym30$CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS = makeSymbol("CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS");
  public static final SubLSymbol $sym31$_CSETF_CYCL_QUERY_SPEC_ENABLE_CACHE_BACKWARDS_QUERY_RESULTS = makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-CACHE-BACKWARDS-QUERY-RESULTS");
  public static final SubLSymbol $sym32$CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING = makeSymbol("CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING");
  public static final SubLSymbol $sym33$_CSETF_CYCL_QUERY_SPEC_ENABLE_UNBOUND_PREDICATE_BACKCHAINING = makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-UNBOUND-PREDICATE-BACKCHAINING");
  public static final SubLSymbol $sym34$CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING = makeSymbol("CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING");
  public static final SubLSymbol $sym35$_CSETF_CYCL_QUERY_SPEC_ENABLE_SEMANTIC_PRUNING = makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-SEMANTIC-PRUNING");
  public static final SubLSymbol $sym36$CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELA = makeSymbol("CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS");
  public static final SubLSymbol $sym37$_CSETF_CYCL_QUERY_SPEC_ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPOR = makeSymbol("_CSETF-CYCL-QUERY-SPEC-ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS");
  public static final SubLSymbol $kw38$CYCL_ID = makeKeyword("CYCL-ID");
  public static final SubLSymbol $kw39$FORMULA = makeKeyword("FORMULA");
  public static final SubLSymbol $kw40$MT = makeKeyword("MT");
  public static final SubLSymbol $kw41$COMMENT = makeKeyword("COMMENT");
  public static final SubLSymbol $kw42$MAX_NUMBER_OF_RESULTS = makeKeyword("MAX-NUMBER-OF-RESULTS");
  public static final SubLSymbol $kw43$BACK_CHAINING = makeKeyword("BACK-CHAINING");
  public static final SubLSymbol $kw44$TIME_CUTOFF_SECS = makeKeyword("TIME-CUTOFF-SECS");
  public static final SubLSymbol $kw45$MAX_DEPTH = makeKeyword("MAX-DEPTH");
  public static final SubLSymbol $kw46$REMOVAL_COST_CUTOFF = makeKeyword("REMOVAL-COST-CUTOFF");
  public static final SubLSymbol $kw47$ENABLE_NEGATION_BY_FAILURE = makeKeyword("ENABLE-NEGATION-BY-FAILURE");
  public static final SubLSymbol $kw48$ENABLE_HL_PREDICATE_BACKCHAINING = makeKeyword("ENABLE-HL-PREDICATE-BACKCHAINING");
  public static final SubLSymbol $kw49$ENABLE_CACHE_BACKWARDS_QUERY_RESULTS = makeKeyword("ENABLE-CACHE-BACKWARDS-QUERY-RESULTS");
  public static final SubLSymbol $kw50$ENABLE_UNBOUND_PREDICATE_BACKCHAINING = makeKeyword("ENABLE-UNBOUND-PREDICATE-BACKCHAINING");
  public static final SubLSymbol $kw51$ENABLE_SEMANTIC_PRUNING = makeKeyword("ENABLE-SEMANTIC-PRUNING");
  public static final SubLSymbol $kw52$ENABLE_CONSIDERATION_OF_DISJUNCTIVE_TEMPORAL_RELATIONS = makeKeyword("ENABLE-CONSIDERATION-OF-DISJUNCTIVE-TEMPORAL-RELATIONS");
  public static final SubLString $str53$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str54$___Acycl_query_specification___ = makeString("~%~Acycl-query-specification:~%");
  public static final SubLString $str55$_Acycl_id____A__ = makeString("~Acycl-id:  ~A~%");
  public static final SubLString $str56$_Aformula___A__ = makeString("~Aformula: ~A~%");
  public static final SubLString $str57$_Amt___S__ = makeString("~Amt: ~S~%");
  public static final SubLString $str58$_Acomment___A__ = makeString("~Acomment: ~A~%");
  public static final SubLString $str59$_Amax_number_of_results___A__ = makeString("~Amax-number-of-results: ~A~%");
  public static final SubLString $str60$_Aback_chaining___A__ = makeString("~Aback-chaining: ~A~%");
  public static final SubLString $str61$_Atime_cutoff_secs___A__ = makeString("~Atime-cutoff-secs: ~A~%");
  public static final SubLString $str62$_Amax_depth___A__ = makeString("~Amax-depth: ~A~%");
  public static final SubLString $str63$_Aremoval_cost_cutoff___A__ = makeString("~Aremoval-cost-cutoff: ~A~%");
  public static final SubLString $str64$_Aenable_negation_by_failure___A_ = makeString("~Aenable-negation-by-failure: ~A~%");
  public static final SubLString $str65$_Aenable_hl_predicate_backchainin = makeString("~Aenable-hl-predicate-backchaining: ~A~%");
  public static final SubLString $str66$_Aenable_cache_backwards_query_re = makeString("~Aenable-cache-backwards-query-results: ~A~%");
  public static final SubLString $str67$_Aenable_unbound_predicate_backch = makeString("~Aenable-unbound-predicate-backchaining: ~A~%");
  public static final SubLString $str68$_Aenable_semantic_pruning___A__ = makeString("~Aenable-semantic-pruning: ~A~%");
  public static final SubLString $str69$_Aenable_consideration_of_disjunc = makeString("~Aenable-consideration-of-disjunctive-temporal-relations: ~A~%~%");
  public static final SubLInteger $int70$30 = makeInteger(30);
  public static final SubLInteger $int71$10000 = makeInteger(10000);
  public static final SubLObject $const72$InferenceFormulaParameter = constant_handles.reader_make_constant_shell(makeString("InferenceFormulaParameter"));
  public static final SubLObject $const73$InferenceMicrotheoryParameter = constant_handles.reader_make_constant_shell(makeString("InferenceMicrotheoryParameter"));
  public static final SubLObject $const74$InferenceMaxAnswersParameter = constant_handles.reader_make_constant_shell(makeString("InferenceMaxAnswersParameter"));
  public static final SubLObject $const75$InferenceMaxTransformationStepsPa = constant_handles.reader_make_constant_shell(makeString("InferenceMaxTransformationStepsParameter"));
  public static final SubLObject $const76$InferenceMaxTimeParameter = constant_handles.reader_make_constant_shell(makeString("InferenceMaxTimeParameter"));
  public static final SubLObject $const77$InferenceMaxProofDepthParameter = constant_handles.reader_make_constant_shell(makeString("InferenceMaxProofDepthParameter"));
  public static final SubLObject $const78$InferenceAllowUnboundPredicateTra = constant_handles.reader_make_constant_shell(makeString("InferenceAllowUnboundPredicateTransformationParameter"));
  public static final SubLObject $const79$InferenceProductivityLimitParamet = constant_handles.reader_make_constant_shell(makeString("InferenceProductivityLimitParameter"));
  public static final SubLObject $const80$InferenceEnableConsiderDisjunctiv = constant_handles.reader_make_constant_shell(makeString("InferenceEnableConsiderDisjunctiveTemporalRelationsParameter"));
  public static final SubLObject $const81$InferenceEnableSemanticPruningPar = constant_handles.reader_make_constant_shell(makeString("InferenceEnableSemanticPruningParameter"));
  public static final SubLObject $const82$InferenceCacheInferenceResultsPar = constant_handles.reader_make_constant_shell(makeString("InferenceCacheInferenceResultsParameter"));
  public static final SubLObject $const83$InferenceAllowHLPredicateTransfor = constant_handles.reader_make_constant_shell(makeString("InferenceAllowHLPredicateTransformationParameter"));
  public static final SubLObject $const84$InferenceNegationByFailureParamet = constant_handles.reader_make_constant_shell(makeString("InferenceNegationByFailureParameter"));
  public static final SubLObject $const85$comment = constant_handles.reader_make_constant_shell(makeString("comment"));
  public static final SubLSymbol $sym86$CYCL_DENOTATIONAL_TERM_P = makeSymbol("CYCL-DENOTATIONAL-TERM-P");
  public static final SubLSymbol $sym87$MICROTHEORY_P = makeSymbol("MICROTHEORY-P");
  public static final SubLList $list88 = list(makeSymbol("?COMMENT"));
  public static final SubLObject $const89$softwareParameterValueInSpecifica = constant_handles.reader_make_constant_shell(makeString("softwareParameterValueInSpecification"));
  public static final SubLSymbol $sym90$_PARAM = makeSymbol("?PARAM");
  public static final SubLSymbol $sym91$_VAL = makeSymbol("?VAL");
  public static final SubLList $list92 = list(makeSymbol("PARAM"), makeSymbol("VAL"));
  public static final SubLSymbol $kw93$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
  public static final SubLSymbol $kw94$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $kw95$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");
  public static final SubLSymbol $kw96$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $kw97$MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
  public static final SubLSymbol $kw98$MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");
  public static final SubLSymbol $kw99$RETURN = makeKeyword("RETURN");
  public static final SubLSymbol $kw100$BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");
  public static final SubLSymbol $kw101$PRODUCTIVITY_LIMIT = makeKeyword("PRODUCTIVITY-LIMIT");
  public static final SubLSymbol $kw102$ANSWER_LANGUAGE = makeKeyword("ANSWER-LANGUAGE");
  public static final SubLSymbol $kw103$HL = makeKeyword("HL");
  public static final SubLSymbol $kw104$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");
  public static final SubLSymbol $kw105$MAX_TIME = makeKeyword("MAX-TIME");
  public static final SubLSymbol $kw106$MAX_NUMBER = makeKeyword("MAX-NUMBER");

  //// Initializers

  public void declareFunctions() {
    declare_cycl_query_specification_file();
  }

  public void initializeVariables() {
    init_cycl_query_specification_file();
  }

  public void runTopLevelForms() {
    setup_cycl_query_specification_file();
  }

}
