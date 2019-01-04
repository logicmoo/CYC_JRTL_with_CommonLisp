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

package  com.cyc.cycjava.cycl.inference;

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


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;

public  final class collection_intersection extends SubLTranslatedFile {

  //// Constructor

  private collection_intersection() {}
  public static final SubLFile me = new collection_intersection();
  public static final String myName = "com.cyc.cycjava.cycl.inference.collection_intersection";

  //// Definitions

  /** Whether this support is enabled */
  @SubL(source = "cycl/inference/collection-intersection.lisp", position = 1510) 
  private static SubLSymbol $collection_intersection_genls_support_enabledP$ = null;

  /** This would only ever need to be T if you were pasting this code into an older image that didn't have
the nart indexing bug fixed. */
  @SubL(source = "cycl/inference/collection-intersection.lisp", position = 3061) 
  private static SubLSymbol $nart_indexing_bug_workaround_enabledP$ = null;

  @SubL(source = "cycl/inference/collection-intersection.lisp", position = 8983) 
  public static final SubLObject genls_collection_intersection_after_adding_int(SubLObject gaf) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $collection_intersection_genls_support_enabledP$.getDynamicValue(thread))) {
        {
          SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(assertions_high.assertion_mt(gaf));
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
              mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
              {
                SubLObject spec = assertions_high.gaf_arg1(gaf);
                SubLObject genl = assertions_high.gaf_arg2(gaf);
                SubLObject specs = genls.all_specs(spec, UNPROVIDED, UNPROVIDED);
                SubLObject v_genls = genls.all_genls(genl, UNPROVIDED, UNPROVIDED);
                SubLObject candidate_spec_narts = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
                SubLObject candidate_genl_narts = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
                {
                  SubLObject cdolist_list_var = specs;
                  SubLObject candidate_spec = NIL;
                  for (candidate_spec = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), candidate_spec = cdolist_list_var.first()) {
                    set_utilities.set_add_all(Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2812"), candidate_spec_narts);
                  }
                }
                {
                  SubLObject cdolist_list_var = v_genls;
                  SubLObject candidate_genl = NIL;
                  for (candidate_genl = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), candidate_genl = cdolist_list_var.first()) {
                    set_utilities.set_add_all(Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2813"), candidate_genl_narts);
                  }
                }
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2826");
                {
                  SubLObject set_contents_var = set.do_set_internal(candidate_genl_narts);
                  SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                  SubLObject state = NIL;
                  for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                    {
                      SubLObject candidate_genl_nart = set_contents.do_set_contents_next(basis_object, state);
                      if ((NIL != set_contents.do_set_contents_element_validP(state, candidate_genl_nart))) {
                        Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2807");
                      }
                    }
                  }
                }
              }
            } finally {
              mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/collection-intersection.lisp", position = 21490) 
  private static SubLSymbol $collection_intersection_defining_mt$ = null;

  /** The rule used to justify each collectionIntersection genl of ?SPEC */
  @SubL(source = "cycl/inference/collection-intersection.lisp", position = 21716) 
  private static SubLSymbol $collection_intersection_genls_rule$ = null;

  /** The rule used to justify each spec of ?GENL */
  @SubL(source = "cycl/inference/collection-intersection.lisp", position = 22296) 
  private static SubLSymbol $collection_intersection_specs_rule$ = null;

  public static final SubLObject declare_collection_intersection_file() {
    //declareFunction(myName, "cyc_collection_intersection_after_adding", "CYC-COLLECTION-INTERSECTION-AFTER-ADDING", 2, 0, false);
    //declareFunction(myName, "cyc_collection_intersection_2_after_adding", "CYC-COLLECTION-INTERSECTION-2-AFTER-ADDING", 2, 0, false);
    //declareFunction(myName, "possibly_add_collection_intersection_nart", "POSSIBLY-ADD-COLLECTION-INTERSECTION-NART", 1, 0, false);
    //declareFunction(myName, "add_collection_intersection_nart", "ADD-COLLECTION-INTERSECTION-NART", 1, 0, false);
    //declareFunction(myName, "add_collection_intersection_nart_genls_links", "ADD-COLLECTION-INTERSECTION-NART-GENLS-LINKS", 1, 0, false);
    //declareFunction(myName, "add_collection_intersection_nart_specs_links", "ADD-COLLECTION-INTERSECTION-NART-SPECS-LINKS", 1, 0, false);
    //declareFunction(myName, "add_collection_intersection_nart_genls_links_int", "ADD-COLLECTION-INTERSECTION-NART-GENLS-LINKS-INT", 1, 0, false);
    //declareFunction(myName, "compute_mt_specific_justification_for_collection_intersection_genls_asent", "COMPUTE-MT-SPECIFIC-JUSTIFICATION-FOR-COLLECTION-INTERSECTION-GENLS-ASENT", 2, 0, false);
    //declareFunction(myName, "compute_more_supports_for_collection_intersection_genls_asent", "COMPUTE-MORE-SUPPORTS-FOR-COLLECTION-INTERSECTION-GENLS-ASENT", 1, 0, false);
    //declareFunction(myName, "compute_mt_placement_for_collection_intersection_genls_justified_asents", "COMPUTE-MT-PLACEMENT-FOR-COLLECTION-INTERSECTION-GENLS-JUSTIFIED-ASENTS", 1, 0, false);
    //declareFunction(myName, "minimize_genls_hl_supports", "MINIMIZE-GENLS-HL-SUPPORTS", 1, 0, false);
    //declareFunction(myName, "max_floor_mts_of_genls_justification", "MAX-FLOOR-MTS-OF-GENLS-JUSTIFICATION", 1, 0, false);
    //declareFunction(myName, "assert_collection_intersection_genls_link", "ASSERT-COLLECTION-INTERSECTION-GENLS-LINK", 3, 0, false);
    declareFunction(myName, "genls_collection_intersection_after_adding_int", "GENLS-COLLECTION-INTERSECTION-AFTER-ADDING-INT", 1, 0, false);
    //declareFunction(myName, "consider_all_combinations_for_genls_collection_intersection", "CONSIDER-ALL-COMBINATIONS-FOR-GENLS-COLLECTION-INTERSECTION", 2, 3, false);
    //declareFunction(myName, "consider_all_genl_narts_for_genls_collection_intersection", "CONSIDER-ALL-GENL-NARTS-FOR-GENLS-COLLECTION-INTERSECTION", 4, 0, false);
    //declareFunction(myName, "collection_intersection_genls_sweep_part_1", "COLLECTION-INTERSECTION-GENLS-SWEEP-PART-1", 0, 1, false);
    //declareFunction(myName, "collection_intersection_genls_sweep_part_2", "COLLECTION-INTERSECTION-GENLS-SWEEP-PART-2", 0, 1, false);
    //declareFunction(myName, "collection_intersection_genls_sweep_by_query", "COLLECTION-INTERSECTION-GENLS-SWEEP-BY-QUERY", 1, 1, false);
    //declareFunction(myName, "collection_intersection_nat_max_proper_genls", "COLLECTION-INTERSECTION-NAT-MAX-PROPER-GENLS", 1, 0, false);
    //declareFunction(myName, "collection_intersection_nat_proper_genls", "COLLECTION-INTERSECTION-NAT-PROPER-GENLS", 1, 1, false);
    //declareFunction(myName, "collection_intersection_nat_max_proper_specs", "COLLECTION-INTERSECTION-NAT-MAX-PROPER-SPECS", 1, 0, false);
    //declareFunction(myName, "collection_intersection_nat_proper_specs", "COLLECTION-INTERSECTION-NAT-PROPER-SPECS", 1, 1, false);
    //declareFunction(myName, "collection_intersection_narts_with_constituent_collection", "COLLECTION-INTERSECTION-NARTS-WITH-CONSTITUENT-COLLECTION", 1, 0, false);
    //declareFunction(myName, "collection_intersection_2_fn_narts_with_constituent_collection", "COLLECTION-INTERSECTION-2-FN-NARTS-WITH-CONSTITUENT-COLLECTION", 1, 0, false);
    //declareFunction(myName, "collection_intersection_fn_narts_with_constituent_collection", "COLLECTION-INTERSECTION-FN-NARTS-WITH-CONSTITUENT-COLLECTION", 1, 0, false);
    //declareFunction(myName, "fully_bound_collection_intersection_nat_p", "FULLY-BOUND-COLLECTION-INTERSECTION-NAT-P", 1, 0, false);
    //declareFunction(myName, "collection_intersection_nart_p", "COLLECTION-INTERSECTION-NART-P", 1, 0, false);
    //declareFunction(myName, "fully_bound_collection_intersection_nat_formula_p", "FULLY-BOUND-COLLECTION-INTERSECTION-NAT-FORMULA-P", 1, 0, false);
    //declareFunction(myName, "collection_intersection_nat_collections", "COLLECTION-INTERSECTION-NAT-COLLECTIONS", 1, 0, false);
    //declareFunction(myName, "term_constituent_collections", "TERM-CONSTITUENT-COLLECTIONS", 1, 0, false);
    //declareFunction(myName, "genls_collection_intersection_fn_collection_intersection_fn_pos_check_in_any_mt", "GENLS-COLLECTION-INTERSECTION-FN-COLLECTION-INTERSECTION-FN-POS-CHECK-IN-ANY-MT", 2, 0, false);
    //declareFunction(myName, "genls_collection_intersection_fn_collection_intersection_fn_pos_check", "GENLS-COLLECTION-INTERSECTION-FN-COLLECTION-INTERSECTION-FN-POS-CHECK", 2, 0, false);
    //declareFunction(myName, "genls_collection_intersection_fn_pos_check", "GENLS-COLLECTION-INTERSECTION-FN-POS-CHECK", 2, 0, false);
    //declareFunction(myName, "collection_intersection_genls_rule_support", "COLLECTION-INTERSECTION-GENLS-RULE-SUPPORT", 0, 0, false);
    //declareFunction(myName, "collection_intersection_specs_rule_support", "COLLECTION-INTERSECTION-SPECS-RULE-SUPPORT", 0, 0, false);
    //declareFunction(myName, "justify_collection_intersection_genls_narts", "JUSTIFY-COLLECTION-INTERSECTION-GENLS-NARTS", 2, 1, false);
    //declareFunction(myName, "justify_collection_intersection_specs", "JUSTIFY-COLLECTION-INTERSECTION-SPECS", 2, 1, false);
    //declareFunction(myName, "justify_collection_intersection_genls_link_in_any_mt", "JUSTIFY-COLLECTION-INTERSECTION-GENLS-LINK-IN-ANY-MT", 2, 0, false);
    //declareFunction(myName, "justify_collection_intersection_genls_asent", "JUSTIFY-COLLECTION-INTERSECTION-GENLS-ASENT", 1, 0, false);
    //declareFunction(myName, "why_genls_collection_intersection_fn", "WHY-GENLS-COLLECTION-INTERSECTION-FN", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_collection_intersection_file() {
    $collection_intersection_genls_support_enabledP$ = defparameter("*COLLECTION-INTERSECTION-GENLS-SUPPORT-ENABLED?*", NIL);
    $nart_indexing_bug_workaround_enabledP$ = deflexical("*NART-INDEXING-BUG-WORKAROUND-ENABLED?*", NIL);
    $collection_intersection_defining_mt$ = deflexical("*COLLECTION-INTERSECTION-DEFINING-MT*", $const21$UniversalVocabularyMt);
    $collection_intersection_genls_rule$ = deflexical("*COLLECTION-INTERSECTION-GENLS-RULE*", $list29);
    $collection_intersection_specs_rule$ = deflexical("*COLLECTION-INTERSECTION-SPECS-RULE*", $list30);
    return NIL;
  }

  public static final SubLObject setup_collection_intersection_file() {
    // CVS_ID("Id: collection-intersection.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_kb_function($sym0$CYC_COLLECTION_INTERSECTION_AFTER_ADDING);
    utilities_macros.register_kb_function($sym1$CYC_COLLECTION_INTERSECTION_2_AFTER_ADDING);
    utilities_macros.note_funcall_helper_function($sym25$FULLY_BOUND_COLLECTION_INTERSECTION_NAT_P);
    utilities_macros.note_funcall_helper_function($sym26$COLLECTION_INTERSECTION_NART_P);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CYC_COLLECTION_INTERSECTION_AFTER_ADDING = makeSymbol("CYC-COLLECTION-INTERSECTION-AFTER-ADDING");
  public static final SubLSymbol $sym1$CYC_COLLECTION_INTERSECTION_2_AFTER_ADDING = makeSymbol("CYC-COLLECTION-INTERSECTION-2-AFTER-ADDING");
  public static final SubLObject $const2$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLList $list3 = list(makeSymbol("HL-MODULE"), makeSymbol("ASENT"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLSymbol $kw4$CODE = makeKeyword("CODE");
  public static final SubLObject $const5$collectionIntersection = constant_handles.reader_make_constant_shell(makeString("collectionIntersection"));
  public static final SubLList $list6 = cons(makeSymbol("ASENT"), makeSymbol("ANY-MT-JUSTIFICATION"));
  public static final SubLSymbol $kw7$GENLS = makeKeyword("GENLS");
  public static final SubLSymbol $kw8$FORWARD = makeKeyword("FORWARD");
  public static final SubLString $str9$Computing___genls_between_collect = makeString("Computing #$genls between collection intersection narts...");
  public static final SubLObject $const10$CollectionIntersectionFn = constant_handles.reader_make_constant_shell(makeString("CollectionIntersectionFn"));
  public static final SubLSymbol $sym11$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str12$_A = makeString("~A");
  public static final SubLSymbol $sym13$VALID_NART_ = makeSymbol("VALID-NART?");
  public static final SubLSymbol $sym14$GAF_ARG1 = makeSymbol("GAF-ARG1");
  public static final SubLObject $const15$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell(makeString("CollectionIntersection2Fn"));
  public static final SubLSymbol $sym16$_NART = makeSymbol("?NART");
  public static final SubLString $str17$_s_did_not_contain_a_variable_nam = makeString("~s did not contain a variable named ?NART");
  public static final SubLObject $const18$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLList $list19 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));
  public static final SubLString $str20$Found__a_narts_for_a_total_of__a_ = makeString("Found ~a narts for a total of ~a pairs.~%");
  public static final SubLObject $const21$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));
  public static final SubLSymbol $kw22$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw23$TRUE = makeKeyword("TRUE");
  public static final SubLObject $const24$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLSymbol $sym25$FULLY_BOUND_COLLECTION_INTERSECTION_NAT_P = makeSymbol("FULLY-BOUND-COLLECTION-INTERSECTION-NAT-P");
  public static final SubLSymbol $sym26$COLLECTION_INTERSECTION_NART_P = makeSymbol("COLLECTION-INTERSECTION-NART-P");
  public static final SubLString $str27$Unexpected_collection_intersectio = makeString("Unexpected collection intersection nat ~s");
  public static final SubLSymbol $sym28$RELEVANT_MT_IS_ANY_MT = makeSymbol("RELEVANT-MT-IS-ANY-MT");
  public static final SubLList $list29 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("collectionIntersection")), makeSymbol("?SPEC"), makeSymbol("?SPEC-CONSTITUENT-COLS")), list(constant_handles.reader_make_constant_shell(makeString("collectionIntersection")), makeSymbol("?GENL"), makeSymbol("?GENL-CONSTITUENT-COLS")), list(constant_handles.reader_make_constant_shell(makeString("forAll")), makeSymbol("?GENL-CONSTIT-COL"), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeSymbol("?GENL-CONSTIT-COL"), makeSymbol("?GENL-CONSTITUENT-COLS")), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), makeSymbol("?SPEC-CONSTIT-COL"), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeSymbol("?SPEC-CONSTIT-COL"), makeSymbol("?SPEC-CONSTITUENT-COLS")), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?SPEC-CONSTIT-COL"), makeSymbol("?GENL-CONSTIT-COL"))))))), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?SPEC"), makeSymbol("?GENL")));
  public static final SubLList $list30 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("collectionIntersection")), makeSymbol("?GENL"), makeSymbol("?GENL-CONSTITUENT-COLS")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?SPEC"), constant_handles.reader_make_constant_shell(makeString("Collection"))), list(constant_handles.reader_make_constant_shell(makeString("forAll")), makeSymbol("?GENL-CONSTIT-COL"), list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeSymbol("?GENL-CONSTIT-COL"), makeSymbol("?GENL-CONSTITUENT-COLS")), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?SPEC"), makeSymbol("?GENL-CONSTIT-COL"))))), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?SPEC"), makeSymbol("?GENL")));
  public static final SubLSymbol $kw31$TRUE_MON = makeKeyword("TRUE-MON");
  public static final SubLObject $const32$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $sym33$JUSTIFY_COLLECTION_INTERSECTION_GENLS_ASENT = makeSymbol("JUSTIFY-COLLECTION-INTERSECTION-GENLS-ASENT");

  //// Initializers

  public void declareFunctions() {
    declare_collection_intersection_file();
  }

  public void initializeVariables() {
    init_collection_intersection_file();
  }

  public void runTopLevelForms() {
    setup_collection_intersection_file();
  }

}
