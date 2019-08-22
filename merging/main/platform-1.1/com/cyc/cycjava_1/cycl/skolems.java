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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.api_control_vars;
//dm import com.cyc.cycjava_1.cycl.arity;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_var_types;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.canon_tl;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.clausifier;
//dm import com.cyc.cycjava_1.cycl.collection_defns;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.cyc_kernel;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.czer_meta;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.deduction_handles;
//dm import com.cyc.cycjava_1.cycl.deductions_high;
//dm import com.cyc.cycjava_1.cycl.disjoint_with;
//dm import com.cyc.cycjava_1.cycl.el_grammar;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.formula_pattern_match;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.inference.harness.hl_prototypes;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.kb_utilities;
//dm import com.cyc.cycjava_1.cycl.ke;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.operation_communication;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.transform_list_utilities;
//dm import com.cyc.cycjava_1.cycl.uncanonicalizer;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class skolems extends SubLTranslatedFile {

  //// Constructor

  private skolems() {}
  public static final SubLFile me = new skolems();
  public static final String myName = "com.cyc.cycjava_1.cycl.skolems";

  //// Definitions

  /** variable mapping for current skolem defn */
  @SubL(source = "cycl/skolems.lisp", position = 7597) 
  private static SubLSymbol $skolem_arg_sort$ = null;

  @SubL(source = "cycl/skolems.lisp", position = 13044) 
  private static SubLSymbol $formula_constant_str_caching_state$ = null;

  /** Bound while recomputing skolem defns */
  @SubL(source = "cycl/skolems.lisp", position = 29649) 
  private static SubLSymbol $recompute_skolem_defn_info$ = null;

  @SubL(source = "cycl/skolems.lisp", position = 59286) 
  private static SubLSymbol $skolems_with_known_issues$ = null;

  @SubL(source = "cycl/skolems.lisp", position = 62492) 
  private static SubLSymbol $skolems_safe_to_recanonicalize_at_el$ = null;

  @SubL(source = "cycl/skolems.lisp", position = 72150) 
  private static SubLSymbol $target_consequent_literal_count$ = null;

  public static final SubLObject declare_skolems_file() {
    //declareFunction("reify_skolems_in", "REIFY-SKOLEMS-IN", 4, 0, false);
    //declareFunction("canonicalize_fns_in_sk_term", "CANONICALIZE-FNS-IN-SK-TERM", 1, 0, false);
    declareFunction("subst_skolem_in", "SUBST-SKOLEM-IN", 3, 0, false);
    declareFunction("skolem_function_dependent_vars", "SKOLEM-FUNCTION-DEPENDENT-VARS", 1, 0, false);
    declareFunction("skolem_function_var", "SKOLEM-FUNCTION-VAR", 1, 0, false);
    //declareFunction("skolem_args", "SKOLEM-ARGS", 3, 0, false);
    //declareFunction("canonicalize_skolem_term", "CANONICALIZE-SKOLEM-TERM", 4, 0, false);
    //declareFunction("replace_unreified_skolem_terms_with_variables", "REPLACE-UNREIFIED-SKOLEM-TERMS-WITH-VARIABLES", 1, 0, false);
    //declareFunction("lookup_sk_constant_from_defns", "LOOKUP-SK-CONSTANT-FROM-DEFNS", 3, 0, false);
    //declareFunction("defn_unreified_sk_term", "DEFN-UNREIFIED-SK-TERM", 3, 0, false);
    //declareFunction("skolem_collection", "SKOLEM-COLLECTION", 1, 0, false);
    //declareFunction("create_skolem", "CREATE-SKOLEM", 5, 0, false);
    //declareFunction("sk_defn_from_clauses", "SK-DEFN-FROM-CLAUSES", 2, 1, false);
    //declareFunction("alpha_sort_clauses", "ALPHA-SORT-CLAUSES", 1, 0, false);
    //declareFunction("rename_skolem_clause_vars", "RENAME-SKOLEM-CLAUSE-VARS", 2, 1, false);
    //declareFunction("sk_defn_var", "SK-DEFN-VAR", 0, 0, false);
    //declareFunction("clear_formula_constant_str", "CLEAR-FORMULA-CONSTANT-STR", 0, 0, false);
    //declareFunction("remove_formula_constant_str", "REMOVE-FORMULA-CONSTANT-STR", 1, 0, false);
    //declareFunction("formula_constant_str_internal", "FORMULA-CONSTANT-STR-INTERNAL", 1, 0, false);
    //declareFunction("formula_constant_str", "FORMULA-CONSTANT-STR", 1, 0, false);
    //declareFunction("cyc_var_except_for_x_0P", "CYC-VAR-EXCEPT-FOR-X-0?", 1, 0, false);
    //declareFunction("make_sk_defn", "MAKE-SK-DEFN", 4, 0, false);
    //declareFunction("sk_arity", "SK-ARITY", 1, 1, false);
    //declareFunction("make_unreified_sk_nat", "MAKE-UNREIFIED-SK-NAT", 4, 0, false);
    //declareFunction("skolem_defn", "SKOLEM-DEFN", 1, 0, false);
    //declareFunction("skolem_defnXkey", "SKOLEM-DEFN&KEY", 1, 0, false);
    //declareFunction("skolem_defn_key", "SKOLEM-DEFN-KEY", 1, 0, false);
    declareFunction("skolem_of_defn", "SKOLEM-OF-DEFN", 1, 0, false);
    declareFunction("unreified_sk_term", "UNREIFIED-SK-TERM", 1, 0, false);
    //declareFunction("skolem_defn_mt", "SKOLEM-DEFN-MT", 1, 0, false);
    declareFunction("skolem_seqvar", "SKOLEM-SEQVAR", 1, 0, false);
    declareFunction("skolem_defn_seqvar", "SKOLEM-DEFN-SEQVAR", 1, 0, false);
    //declareFunction("old_format_skolemP", "OLD-FORMAT-SKOLEM?", 1, 0, false);
    declareFunction("skolem_number", "SKOLEM-NUMBER", 1, 0, false);
    //declareFunction("skolem_defn_number", "SKOLEM-DEFN-NUMBER", 1, 0, false);
    //declareFunction("skolem_defn_args", "SKOLEM-DEFN-ARGS", 1, 0, false);
    declareFunction("skolem_var", "SKOLEM-VAR", 1, 0, false);
    //declareFunction("el_unreified_sk_term", "EL-UNREIFIED-SK-TERM", 1, 0, false);
    //declareFunction("compute_unreified_sk_term_via_hl", "COMPUTE-UNREIFIED-SK-TERM-VIA-HL", 1, 0, false);
    //declareFunction("compute_skolem_info_from_assertions", "COMPUTE-SKOLEM-INFO-FROM-ASSERTIONS", 2, 0, false);
    declareFunction("skolem_table_key_from_defn", "SKOLEM-TABLE-KEY-FROM-DEFN", 1, 0, false);
    declareFunction("skolem_table_key_from_constant", "SKOLEM-TABLE-KEY-FROM-CONSTANT", 1, 0, false);
    declareFunction("skolem_hash_key", "SKOLEM-HASH-KEY", 2, 0, false);
    //declareFunction("opaquify_unreified_skolem_terms", "OPAQUIFY-UNREIFIED-SKOLEM-TERMS", 1, 0, false);
    declareFunction("skolem_defns_from_key_specification", "SKOLEM-DEFNS-FROM-KEY-SPECIFICATION", 2, 0, false);
    //declareFunction("cnfs_of_skolem_defn", "CNFS-OF-SKOLEM-DEFN", 1, 0, false);
    //declareFunction("mt_of_skolem_defn", "MT-OF-SKOLEM-DEFN", 1, 0, false);
    //declareFunction("skolem_defn_cnfs", "SKOLEM-DEFN-CNFS", 1, 0, false);
    //declareFunction("skolem_defn_assertions_robust", "SKOLEM-DEFN-ASSERTIONS-ROBUST", 1, 1, false);
    declareFunction("skolem_function_has_no_defn_assertions_robustP", "SKOLEM-FUNCTION-HAS-NO-DEFN-ASSERTIONS-ROBUST?", 1, 0, false);
    declareFunction("skolem_function_has_no_defn_assertionsP", "SKOLEM-FUNCTION-HAS-NO-DEFN-ASSERTIONS?", 1, 0, false);
    //declareFunction("skolem_defining_bookkeeping_assertion", "SKOLEM-DEFINING-BOOKKEEPING-ASSERTION", 1, 0, false);
    //declareFunction("skolem_defn_assertions", "SKOLEM-DEFN-ASSERTIONS", 1, 1, false);
    declareFunction("skolems_defn_assertions", "SKOLEMS-DEFN-ASSERTIONS", 1, 0, false);
    declareFunction("skolem_defn_siblings", "SKOLEM-DEFN-SIBLINGS", 1, 0, false);
    //declareFunction("skolem_defn_proper_siblings", "SKOLEM-DEFN-PROPER-SIBLINGS", 1, 0, false);
    //declareFunction("skolem_canonical_sibling", "SKOLEM-CANONICAL-SIBLING", 1, 0, false);
    declareFunction("skolems_min_mt", "SKOLEMS-MIN-MT", 1, 0, false);
    declareFunction("skolem_only_mentioned_in_el_templatesP", "SKOLEM-ONLY-MENTIONED-IN-EL-TEMPLATES?", 2, 0, false);
    //declareFunction("skolem_defn_assertionP", "SKOLEM-DEFN-ASSERTION?", 2, 1, false);
    //declareFunction("gaf_has_corresponding_cnf_in_skolem_defnP", "GAF-HAS-CORRESPONDING-CNF-IN-SKOLEM-DEFN?", 2, 1, false);
    //declareFunction("constant_denoting_reified_skolem_fnP", "CONSTANT-DENOTING-REIFIED-SKOLEM-FN?", 1, 0, false);
    //declareFunction("computed_skolem_assertionP", "COMPUTED-SKOLEM-ASSERTION?", 1, 0, false);
    //declareFunction("skolem_defining_assertionP", "SKOLEM-DEFINING-ASSERTION?", 1, 0, false);
    //declareFunction("defn_assertion_of_skolemP", "DEFN-ASSERTION-OF-SKOLEM?", 2, 0, false);
    //declareFunction("assertion_skolems", "ASSERTION-SKOLEMS", 1, 0, false);
    //declareFunction("defn_assertion_skolems", "DEFN-ASSERTION-SKOLEMS", 1, 0, false);
    //declareFunction("all_skolem_mt_defn_assertions", "ALL-SKOLEM-MT-DEFN-ASSERTIONS", 2, 1, false);
    //declareFunction("recomputing_skolem_defn_info_constant", "RECOMPUTING-SKOLEM-DEFN-INFO-CONSTANT", 0, 0, false);
    //declareFunction("recomputing_skolem_defn_info_var", "RECOMPUTING-SKOLEM-DEFN-INFO-VAR", 0, 0, false);
    //declareFunction("really_recomputing_skolem_defnP", "REALLY-RECOMPUTING-SKOLEM-DEFN?", 0, 0, false);
    //declareFunction("recomputing_skolem_defn_info_defn", "RECOMPUTING-SKOLEM-DEFN-INFO-DEFN", 0, 0, false);
    //declareFunction("recomputing_skolem_defn_info_key", "RECOMPUTING-SKOLEM-DEFN-INFO-KEY", 0, 0, false);
    //declareFunction("recomputing_skolem_defn_info_blist", "RECOMPUTING-SKOLEM-DEFN-INFO-BLIST", 0, 0, false);
    //declareFunction("set_recomputing_skolem_defn_result", "SET-RECOMPUTING-SKOLEM-DEFN-RESULT", 2, 0, false);
    //declareFunction("set_recomputing_skolem_defn_blist", "SET-RECOMPUTING-SKOLEM-DEFN-BLIST", 1, 0, false);
    //declareFunction("recomputing_skolem_defnP", "RECOMPUTING-SKOLEM-DEFN?", 0, 0, false);
    //declareFunction("recomputing_defn_of_skolemP", "RECOMPUTING-DEFN-OF-SKOLEM?", 1, 0, false);
    //declareFunction("recomputing_skolem_defn_ofP", "RECOMPUTING-SKOLEM-DEFN-OF?", 1, 0, false);
    //declareFunction("note_skolem_binding", "NOTE-SKOLEM-BINDING", 2, 0, false);
    //declareFunction("recompute_skolem_defn", "RECOMPUTE-SKOLEM-DEFN", 6, 0, false);
    //declareFunction("remove_defn_of_skolem", "REMOVE-DEFN-OF-SKOLEM", 1, 1, false);
    //declareFunction("add_skolem_defn", "ADD-SKOLEM-DEFN", 1, 1, false);
    //declareFunction("kb_skolems", "KB-SKOLEMS", 0, 0, false);
    declareFunction("skolem_table_contains_old_format_skolemsP", "SKOLEM-TABLE-CONTAINS-OLD-FORMAT-SKOLEMS?", 0, 0, false);
    //declareFunction("reset_skolem_defn_table", "RESET-SKOLEM-DEFN-TABLE", 0, 2, false);
    //declareFunction("reset_defn_of_skolem", "RESET-DEFN-OF-SKOLEM", 1, 1, false);
    //declareFunction("skolem_defn_from_assertions", "SKOLEM-DEFN-FROM-ASSERTIONS", 1, 1, false);
    //declareFunction("reset_skolem_defn_from_assertions", "RESET-SKOLEM-DEFN-FROM-ASSERTIONS", 1, 2, false);
    declareFunction("skolem_variable_from_assertions", "SKOLEM-VARIABLE-FROM-ASSERTIONS", 2, 0, false);
    declareFunction("skolem_scalar_termP", "SKOLEM-SCALAR-TERM?", 1, 1, false);
    declareFunction("skolem_result_types_from_cnfs", "SKOLEM-RESULT-TYPES-FROM-CNFS", 2, 2, false);
    //declareFunction("guess_skolem_result_types_from_cnfs", "GUESS-SKOLEM-RESULT-TYPES-FROM-CNFS", 3, 2, false);
    //declareFunction("skolem_cnfs_pos_lit_types", "SKOLEM-CNFS-POS-LIT-TYPES", 2, 1, false);
    declareFunction("skolem_var_isa_constraints_wrt_cnfs", "SKOLEM-VAR-ISA-CONSTRAINTS-WRT-CNFS", 2, 1, false);
    declareFunction("skolem_var_genl_constraints_wrt_cnfs", "SKOLEM-VAR-GENL-CONSTRAINTS-WRT-CNFS", 2, 1, false);
    //declareFunction("skolem_arg_isa_constraints", "SKOLEM-ARG-ISA-CONSTRAINTS", 2, 1, false);
    //declareFunction("install_skolem_arg_types", "INSTALL-SKOLEM-ARG-TYPES", 0, 2, false);
    //declareFunction("cnf_fn_argn_isa", "CNF-FN-ARGN-ISA", 3, 1, false);
    //declareFunction("cnf_fn_argn_var", "CNF-FN-ARGN-VAR", 3, 0, false);
    //declareFunction("interpolate_arg_type", "INTERPOLATE-ARG-TYPE", 1, 1, false);
    //declareFunction("max_skolem_arity", "MAX-SKOLEM-ARITY", 0, 0, false);
    declareFunction("skolems_of_arity", "SKOLEMS-OF-ARITY", 0, 1, false);
    declareFunction("skolem_hosedP", "SKOLEM-HOSED?", 1, 0, false);
    declareFunction("skolem_ill_formedP", "SKOLEM-ILL-FORMED?", 1, 0, false);
    declareFunction("skolem_rule_hosedP", "SKOLEM-RULE-HOSED?", 2, 0, false);
    //declareFunction("all_hosed_skolems", "ALL-HOSED-SKOLEMS", 0, 0, false);
    //declareFunction("multi_skolem_skolems", "MULTI-SKOLEM-SKOLEMS", 0, 0, false);
    //declareFunction("misindexed_skolem_keys", "MISINDEXED-SKOLEM-KEYS", 0, 1, false);
    //declareFunction("sk_defns_wXo_sk_constants", "SK-DEFNS-W/O-SK-CONSTANTS", 0, 1, false);
    //declareFunction("sk_keys_wXo_sk_defns", "SK-KEYS-W/O-SK-DEFNS", 0, 1, false);
    //declareFunction("install_skolemfunction_fn_in_skolem_defns", "INSTALL-SKOLEMFUNCTION-FN-IN-SKOLEM-DEFNS", 0, 2, false);
    //declareFunction("sk_defns_wXo_mts", "SK-DEFNS-W/O-MTS", 0, 1, false);
    declareFunction("skolem_wffP", "SKOLEM-WFF?", 1, 0, false);
    declareFunction("skolem_not_wffP", "SKOLEM-NOT-WFF?", 1, 0, false);
    declareFunction("why_skolem_not_wff", "WHY-SKOLEM-NOT-WFF", 1, 0, false);
    declareFunction("skolem_defn_wffP", "SKOLEM-DEFN-WFF?", 1, 0, false);
    //declareFunction("skolem_defn_not_wffP", "SKOLEM-DEFN-NOT-WFF?", 1, 0, false);
    declareFunction("why_skolem_defn_not_wff", "WHY-SKOLEM-DEFN-NOT-WFF", 1, 0, false);
    //declareFunction("skolem_all_goodP", "SKOLEM-ALL-GOOD?", 1, 0, false);
    declareFunction("skolem_function_skolem_assertion_goodP", "SKOLEM-FUNCTION-SKOLEM-ASSERTION-GOOD?", 1, 0, false);
    declareFunction("skolem_functions_with_bad_skolem_assertions", "SKOLEM-FUNCTIONS-WITH-BAD-SKOLEM-ASSERTIONS", 0, 0, false);
    //declareFunction("diagnose_all_skolems", "DIAGNOSE-ALL-SKOLEMS", 0, 0, false);
    //declareFunction("diagnose_skolems", "DIAGNOSE-SKOLEMS", 1, 1, false);
    //declareFunction("diagnose_skolem", "DIAGNOSE-SKOLEM", 1, 0, false);
    //declareFunction("diagnose_just_this_skolem_internal", "DIAGNOSE-JUST-THIS-SKOLEM-INTERNAL", 1, 0, false);
    //declareFunction("diagnose_just_this_skolem", "DIAGNOSE-JUST-THIS-SKOLEM", 1, 0, false);
    //declareFunction("recanonicalize_skolem_defn_assertions", "RECANONICALIZE-SKOLEM-DEFN-ASSERTIONS", 1, 0, false);
    declareFunction("skolem_safe_to_recanonicalize_at_elP", "SKOLEM-SAFE-TO-RECANONICALIZE-AT-EL?", 1, 0, false);
    //declareFunction("compute_target_consequent_literal_count", "COMPUTE-TARGET-CONSEQUENT-LITERAL-COUNT", 1, 0, false);
    //declareFunction("conjunction_of_literalsP", "CONJUNCTION-OF-LITERALS?", 1, 0, false);
    //declareFunction("modernize_skolem_axiom_table", "MODERNIZE-SKOLEM-AXIOM-TABLE", 0, 0, false);
    //declareFunction("possibly_modernize_unreified_sk_term", "POSSIBLY-MODERNIZE-UNREIFIED-SK-TERM", 1, 0, false);
    declareFunction("skolems_with_mismatched_unreified_sk_terms", "SKOLEMS-WITH-MISMATCHED-UNREIFIED-SK-TERMS", 0, 0, false);
    declareFunction("skolem_unreified_sk_terms_matchP", "SKOLEM-UNREIFIED-SK-TERMS-MATCH?", 1, 0, false);
    //declareFunction("possibly_nrepair_skolems_with_duplicate_vars", "POSSIBLY-NREPAIR-SKOLEMS-WITH-DUPLICATE-VARS", 1, 0, false);
    //declareFunction("possibly_nrepair_skolem_with_duplicate_vars", "POSSIBLY-NREPAIR-SKOLEM-WITH-DUPLICATE-VARS", 1, 0, false);
    //declareFunction("nrepair_skolem_with_duplicate_vars", "NREPAIR-SKOLEM-WITH-DUPLICATE-VARS", 1, 0, false);
    //declareFunction("possibly_nrepair_skolems_with_malformed_numbers", "POSSIBLY-NREPAIR-SKOLEMS-WITH-MALFORMED-NUMBERS", 1, 0, false);
    //declareFunction("possibly_nrepair_skolem_with_malformed_numbers", "POSSIBLY-NREPAIR-SKOLEM-WITH-MALFORMED-NUMBERS", 1, 0, false);
    //declareFunction("nrepair_skolem_with_malformed_numbers", "NREPAIR-SKOLEM-WITH-MALFORMED-NUMBERS", 1, 0, false);
    declareFunction("tmi_skolemP", "TMI-SKOLEM?", 1, 0, false);
    //declareFunction("recanonicalize_tmi_skolems", "RECANONICALIZE-TMI-SKOLEMS", 1, 0, false);
    //declareFunction("recanonicalize_tmi_skolem", "RECANONICALIZE-TMI-SKOLEM", 1, 0, false);
    //declareFunction("possibly_rehabilitate_skolem_defn_table", "POSSIBLY-REHABILITATE-SKOLEM-DEFN-TABLE", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_skolems_file() {
    $skolem_arg_sort$ = defparameter("*SKOLEM-ARG-SORT*", NIL);
    $formula_constant_str_caching_state$ = deflexical("*FORMULA-CONSTANT-STR-CACHING-STATE*", NIL);
    $recompute_skolem_defn_info$ = defparameter("*RECOMPUTE-SKOLEM-DEFN-INFO*", NIL);
    $skolems_with_known_issues$ = deflexical("*SKOLEMS-WITH-KNOWN-ISSUES*", $list105);
    $skolems_safe_to_recanonicalize_at_el$ = deflexical("*SKOLEMS-SAFE-TO-RECANONICALIZE-AT-EL*", $list106);
    $target_consequent_literal_count$ = defparameter("*TARGET-CONSEQUENT-LITERAL-COUNT*", $kw118$UNINITIALIZED);
    return NIL;
  }

  public static final SubLObject setup_skolems_file() {
        memoization_state.note_globally_cached_function($sym24$FORMULA_CONSTANT_STR);
    memoization_state.note_memoized_function($sym109$DIAGNOSE_JUST_THIS_SKOLEM);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("UNREIFIED-SK-TERM"), makeSymbol("SKOLEM-TERM"));
  public static final SubLObject $const1$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLList $list2 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));
  public static final SubLObject $const3$SkolemFunctionFn = constant_handles.reader_make_constant_shell(makeString("SkolemFunctionFn"));
  public static final SubLObject $const4$SkolemFunction = constant_handles.reader_make_constant_shell(makeString("SkolemFunction"));
  public static final SubLObject $const5$SkolemFuncN = constant_handles.reader_make_constant_shell(makeString("SkolemFuncN"));
  public static final SubLObject $const6$SkolemFuncNFn = constant_handles.reader_make_constant_shell(makeString("SkolemFuncNFn"));
  public static final SubLString $str7$unreified_skolem_term_references_ = makeString("unreified-skolem-term references unknown skolem type: ~s");
  public static final SubLSymbol $sym8$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym9$_ = makeSymbol("<");
  public static final SubLSymbol $sym10$CDR = makeSymbol("CDR");
  public static final SubLString $str11$skolem_args____s_vs__s = makeString("skolem-args : ~s vs ~s");
  public static final SubLSymbol $sym12$CLAUSE_FREE_SEQUENCE_VARIABLES = makeSymbol("CLAUSE-FREE-SEQUENCE-VARIABLES");
  public static final SubLSymbol $sym13$CLAUSE_FREE_TERM_VARIABLES = makeSymbol("CLAUSE-FREE-TERM-VARIABLES");
  public static final SubLSymbol $kw14$TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE = makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");
  public static final SubLSymbol $sym15$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLSymbol $sym16$UNREIFIED_SKOLEM_TERM_ = makeSymbol("UNREIFIED-SKOLEM-TERM?");
  public static final SubLSymbol $sym17$SKOLEM_FUNCTION_VAR = makeSymbol("SKOLEM-FUNCTION-VAR");
  public static final SubLList $list18 = list(makeSymbol("OLD-SK-CONSTANT"), makeSymbol("OLD-UNREIFIED-SK-TERM"), makeSymbol("SK-MT"), makeSymbol("OLD-DEFN"));
  public static final SubLObject $const19$VariableAritySkolemFuncN = constant_handles.reader_make_constant_shell(makeString("VariableAritySkolemFuncN"));
  public static final SubLObject $const20$FixedAritySkolemFuncN = constant_handles.reader_make_constant_shell(makeString("FixedAritySkolemFuncN"));
  public static final SubLObject $const21$VariableAritySkolemFunction = constant_handles.reader_make_constant_shell(makeString("VariableAritySkolemFunction"));
  public static final SubLObject $const22$FixedAritySkolemFunction = constant_handles.reader_make_constant_shell(makeString("FixedAritySkolemFunction"));
  public static final SubLSymbol $sym23$STRING_ = makeSymbol("STRING<");
  public static final SubLSymbol $sym24$FORMULA_CONSTANT_STR = makeSymbol("FORMULA-CONSTANT-STR");
  public static final SubLSymbol $kw25$EL_VAR = makeKeyword("EL-VAR");
  public static final SubLSymbol $sym26$CYC_VAR_EXCEPT_FOR_X_0_ = makeSymbol("CYC-VAR-EXCEPT-FOR-X-0?");
  public static final SubLSymbol $sym27$_FORMULA_CONSTANT_STR_CACHING_STATE_ = makeSymbol("*FORMULA-CONSTANT-STR-CACHING-STATE*");
  public static final SubLInteger $int28$64 = makeInteger(64);
  public static final SubLSymbol $kw29$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym30$_X_0 = makeSymbol("?X-0");
  public static final SubLSymbol $kw31$MAPPING_DONE = makeKeyword("MAPPING-DONE");
  public static final SubLList $list32 = list(makeSymbol("SKOLEM-TYPE"), makeSymbol("VARS"), makeSymbol("SK-VAR"), makeSymbol("SEQVAR-OR-NUMBER"), makeSymbol("&OPTIONAL"), makeSymbol("NUMBER"));
  public static final SubLString $str33$Multiple_skolem_sequence_variable = makeString("Multiple skolem sequence variables: ~a ~a ~a");
  public static final SubLString $str34$SkolemFuncN_appears_as_SkolemFunc = makeString("SkolemFuncN appears as SkolemFunction: ~a");
  public static final SubLSymbol $sym35$_X = makeSymbol("?X");
  public static final SubLList $list36 = list(makeSymbol("SK-CONSTANT"), makeSymbol("UNREIFIED-SK-TERM"), makeSymbol("MT"), makeSymbol("CNFS"));
  public static final SubLSymbol $sym37$FALSE = makeSymbol("FALSE");
  public static final SubLSymbol $kw38$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym39$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $sym40$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const41$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const42$skolem = constant_handles.reader_make_constant_shell(makeString("skolem"));
  public static final SubLSymbol $sym43$ASSERTION_IST_FORMULA = makeSymbol("ASSERTION-IST-FORMULA");
  public static final SubLSymbol $sym44$SKOLEM_FUNCTION_P = makeSymbol("SKOLEM-FUNCTION-P");
  public static final SubLSymbol $sym45$RELEVANT_MT_IS_GENL_MT = makeSymbol("RELEVANT-MT-IS-GENL-MT");
  public static final SubLSymbol $sym46$OPAQUE_ARG_WRT_EL_TEMPLATE_ = makeSymbol("OPAQUE-ARG-WRT-EL-TEMPLATE?");
  public static final SubLString $str47$_in_gaf_has_corresponding_cnf_in_ = makeString("[in gaf-has-corresponding-cnf-in-skolem-defn?] skolem ~s is not a skolem constant");
  public static final SubLObject $const48$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $sym49$SENTENCE_ARG0 = makeSymbol("SENTENCE-ARG0");
  public static final SubLSymbol $sym50$DEDUCTION_ASSERTION = makeSymbol("DEDUCTION-ASSERTION");
  public static final SubLSymbol $sym51$ASSERTION_FORMULA = makeSymbol("ASSERTION-FORMULA");
  public static final SubLSymbol $sym52$REIFIED_SKOLEM_FN_IN_ANY_MT_ = makeSymbol("REIFIED-SKOLEM-FN-IN-ANY-MT?");
  public static final SubLString $str53$recomputing_skolem_defn_info_cons = makeString("recomputing-skolem-defn-info-constant called when not recomputing a skolem defn");
  public static final SubLString $str54$recomputing_skolem_defn_info_var_ = makeString("recomputing-skolem-defn-info-var called when not recomputing a skolem defn");
  public static final SubLString $str55$really_recomputing_skolem_defn__c = makeString("really-recomputing-skolem-defn? called when not recomputing a skolem defn");
  public static final SubLString $str56$recomputing_skolem_defn_info_defn = makeString("recomputing-skolem-defn-info-defn called when not recomputing a skolem defn");
  public static final SubLString $str57$recomputing_skolem_defn_info_key_ = makeString("recomputing-skolem-defn-info-key called when not recomputing a skolem defn");
  public static final SubLString $str58$recomputing_skolem_defn_info_blis = makeString("recomputing-skolem-defn-info-blist called when not recomputing a skolem defn");
  public static final SubLString $str59$set_recomputing_skolem_defn_resul = makeString("set-recomputing-skolem-defn-result called when not recomputing a skolem defn");
  public static final SubLString $str60$set_recomputing_skolem_defn_blist = makeString("set-recomputing-skolem-defn-blist called when not recomputing a skolem defn");
  public static final SubLSymbol $kw61$GAF = makeKeyword("GAF");
  public static final SubLString $str62$note_skolem_binding_called_when_n = makeString("note-skolem-binding called when not recomputing a skolem defn");
  public static final SubLString $str63$Total_KB_Skolems___a = makeString("Total KB Skolems: ~a");
  public static final SubLString $str64$building_skolem_defn_table = makeString("building skolem defn table");
  public static final SubLSymbol $sym65$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str66$_A = makeString("~A");
  public static final SubLString $str67$____reified_skolem__a_not_known_t = makeString("~%~%reified skolem ~a not known to be an instance of #$SkolemFunction");
  public static final SubLObject $const68$IntervalMinFn = constant_handles.reader_make_constant_shell(makeString("IntervalMinFn"));
  public static final SubLObject $const69$IntervalMaxFn = constant_handles.reader_make_constant_shell(makeString("IntervalMaxFn"));
  public static final SubLObject $const70$ScalarInterval = constant_handles.reader_make_constant_shell(makeString("ScalarInterval"));
  public static final SubLSymbol $kw71$UNNAMED_SKOLEM_FN = makeKeyword("UNNAMED-SKOLEM-FN");
  public static final SubLString $str72$__disjoint_result_types___s____s = makeString("~%disjoint result types: ~s : ~s");
  public static final SubLString $str73$__explicit_result_types___s____s = makeString("~%explicit result types: ~s : ~s");
  public static final SubLString $str74$__tacit_result_isa___s____s = makeString("~%tacit result isa: ~s : ~s");
  public static final SubLString $str75$__no_result_types___s = makeString("~%no result types: ~s");
  public static final SubLString $str76$__tacit_result_genl___s____s = makeString("~%tacit result genl: ~s : ~s");
  public static final SubLObject $const77$CycLReifiableDenotationalTerm = constant_handles.reader_make_constant_shell(makeString("CycLReifiableDenotationalTerm"));
  public static final SubLList $list78 = list(constant_handles.reader_make_constant_shell(makeString("NonNegativeScalarInterval")));
  public static final SubLString $str79$mapping_skolem_defn_table = makeString("mapping skolem defn table");
  public static final SubLList $list80 = list(makeSymbol("SKOLEM"), makeSymbol("UNREIFIED-SK-TERM"), makeSymbol("MT"), makeSymbol("CNFS"));
  public static final SubLString $str81$__tacit_arg__s_type___s____s = makeString("~%tacit arg ~s type: ~s : ~s");
  public static final SubLString $str82$__no_arg__s_type___s____s = makeString("~%no arg ~s type: ~s : ~s");
  public static final SubLString $str83$mapping_skolem_axiom_table = makeString("mapping skolem axiom table");
  public static final SubLList $list84 = list(makeSymbol("CONSTANT"), makeSymbol("LISPY"), makeSymbol("MT"), makeSymbol("CNFS"));
  public static final SubLSymbol $sym85$CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P = makeSymbol("CYC-CONST-GENERAL-EXISTENTIAL-OPERATOR-P");
  public static final SubLString $str86$fixing_skolems_w_o_mts = makeString("fixing skolems w/o mts");
  public static final SubLList $list87 = list(makeKeyword("SKOLEM-DEFN-MISSING"));
  public static final SubLSymbol $kw88$SKOLEM_DEFN_NOT_LIST = makeKeyword("SKOLEM-DEFN-NOT-LIST");
  public static final SubLSymbol $kw89$SKOLEM_DEFN_MAL_LENGTH = makeKeyword("SKOLEM-DEFN-MAL-LENGTH");
  public static final SubLList $list90 = listS(makeSymbol("FIRST"), makeSymbol("&OPTIONAL"), makeSymbol("SECOND"), makeSymbol("THIRD"), makeSymbol("FOURTH"), makeSymbol("ORTS"));
  public static final SubLSymbol $kw91$SKOLEM_DEFN_ORTS = makeKeyword("SKOLEM-DEFN-ORTS");
  public static final SubLSymbol $kw92$SKOLEM_DEFN_MAL_SKOLEM_FORT = makeKeyword("SKOLEM-DEFN-MAL-SKOLEM-FORT");
  public static final SubLSymbol $kw93$SKOLEM_DEFN_MAL_UNREIFIED_FN_LENGTH = makeKeyword("SKOLEM-DEFN-MAL-UNREIFIED-FN-LENGTH");
  public static final SubLList $list94 = list(makeSymbol("SKOLEM-FN-FUNCTION"), makeSymbol("ARGS"), makeSymbol("VAR"), makeSymbol("SEQVAR-OR-NUMBER"), makeSymbol("&OPTIONAL"), makeSymbol("NUMBER"));
  public static final SubLSymbol $kw95$SKOLEM_DEFN_MAL_SKOLEM_FN_TYPE = makeKeyword("SKOLEM-DEFN-MAL-SKOLEM-FN-TYPE");
  public static final SubLSymbol $kw96$SKOLEM_DEFN_MAL_SKOLEM_FN_ARGS = makeKeyword("SKOLEM-DEFN-MAL-SKOLEM-FN-ARGS");
  public static final SubLSymbol $kw97$SKOLEM_DEFN_ARGS_W_O_NUMBER = makeKeyword("SKOLEM-DEFN-ARGS-W/O-NUMBER");
  public static final SubLSymbol $kw98$SKOLEM_DEFN_NON_VAR_ARGS = makeKeyword("SKOLEM-DEFN-NON-VAR-ARGS");
  public static final SubLSymbol $kw99$SKOLEM_DEFN_MAL_SK_VAR = makeKeyword("SKOLEM-DEFN-MAL-SK-VAR");
  public static final SubLSymbol $kw100$SKOLEM_DEFN_ARGS_SK_TYPE_NUMBER_MISMATCH = makeKeyword("SKOLEM-DEFN-ARGS-SK-TYPE/NUMBER-MISMATCH");
  public static final SubLObject $const101$Unity = constant_handles.reader_make_constant_shell(makeString("Unity"));
  public static final SubLSymbol $kw102$SKOLEM_DEFN_OBSOLETE_NUMBER = makeKeyword("SKOLEM-DEFN-OBSOLETE-NUMBER");
  public static final SubLSymbol $kw103$SKOLEM_DEFN_MAL_MT = makeKeyword("SKOLEM-DEFN-MAL-MT");
  public static final SubLList $list104 = list(makeKeyword("SKOLEM-DEFN-W/O-CLAUSES"));
  public static final SubLList $list105 = list(new SubLObject[] {constant_handles.reader_make_constant_shell(makeString("ThePrototypicalFixedAritySkolemFunction")), constant_handles.reader_make_constant_shell(makeString("SKF-4855075916")), constant_handles.reader_make_constant_shell(makeString("SKF-9401565")), constant_handles.reader_make_constant_shell(makeString("SKF-30608153")), constant_handles.reader_make_constant_shell(makeString("SKF-358427")), constant_handles.reader_make_constant_shell(makeString("SKF-981029")), constant_handles.reader_make_constant_shell(makeString("SKF-378457")), constant_handles.reader_make_constant_shell(makeString("SKF-7897525238")), constant_handles.reader_make_constant_shell(makeString("SKF-23426283")), constant_handles.reader_make_constant_shell(makeString("SKF-4978723980")), constant_handles.reader_make_constant_shell(makeString("SKF-8095780367")), constant_handles.reader_make_constant_shell(makeString("SKF-2283707389")), constant_handles.reader_make_constant_shell(makeString("SKF-3819196850")), constant_handles.reader_make_constant_shell(makeString("SKF-2177078880")), constant_handles.reader_make_constant_shell(makeString("SKF-9178370244")), constant_handles.reader_make_constant_shell(makeString("SKF-2313708415")), constant_handles.reader_make_constant_shell(makeString("SKF-54808499")), constant_handles.reader_make_constant_shell(makeString("SKF-2396342019")), constant_handles.reader_make_constant_shell(makeString("SKF-0540013113")), constant_handles.reader_make_constant_shell(makeString("SKF-7329112212")), constant_handles.reader_make_constant_shell(makeString("SKF-2463549462")), constant_handles.reader_make_constant_shell(makeString("SKF-7267986583")), constant_handles.reader_make_constant_shell(makeString("SKF-2341431804")), constant_handles.reader_make_constant_shell(makeString("SKF-5635570701")), constant_handles.reader_make_constant_shell(makeString("SKF-8712676684")), constant_handles.reader_make_constant_shell(makeString("SKF-6439069748")), constant_handles.reader_make_constant_shell(makeString("SKF-3035846539")), constant_handles.reader_make_constant_shell(makeString("SKF-9609006789")), constant_handles.reader_make_constant_shell(makeString("SKF-2094656502")), constant_handles.reader_make_constant_shell(makeString("SKF-1622895730")), constant_handles.reader_make_constant_shell(makeString("SKF-6034791567")), constant_handles.reader_make_constant_shell(makeString("SKF-8429706273")), constant_handles.reader_make_constant_shell(makeString("SKF-5002539315")), constant_handles.reader_make_constant_shell(makeString("SKF-7731242586")), constant_handles.reader_make_constant_shell(makeString("SKF-1935351914")), constant_handles.reader_make_constant_shell(makeString("SKF-5819554541")), constant_handles.reader_make_constant_shell(makeString("SKF-7665225690")), constant_handles.reader_make_constant_shell(makeString("SKF-5742181768")), constant_handles.reader_make_constant_shell(makeString("SKF-7774820049")), constant_handles.reader_make_constant_shell(makeString("SKF-9832002172")), constant_handles.reader_make_constant_shell(makeString("SKF-9099460346")), constant_handles.reader_make_constant_shell(makeString("SKF-6802057837")), constant_handles.reader_make_constant_shell(makeString("SKF-0233545031")), constant_handles.reader_make_constant_shell(makeString("SKF-7143243607")), constant_handles.reader_make_constant_shell(makeString("SKF-5547792583")), constant_handles.reader_make_constant_shell(makeString("SKF-1970550724")), constant_handles.reader_make_constant_shell(makeString("SKF-2043784885")), constant_handles.reader_make_constant_shell(makeString("SKF-1714183462")), constant_handles.reader_make_constant_shell(makeString("SKF-6071957396")), constant_handles.reader_make_constant_shell(makeString("SKF-7004599156")), constant_handles.reader_make_constant_shell(makeString("SKF-0633671947")), constant_handles.reader_make_constant_shell(makeString("SKF-4928965872")), constant_handles.reader_make_constant_shell(makeString("SKF-4365040835")), constant_handles.reader_make_constant_shell(makeString("SKF-9778251013")), constant_handles.reader_make_constant_shell(makeString("SKF-8146092452")), constant_handles.reader_make_constant_shell(makeString("SKF-0882987459")), constant_handles.reader_make_constant_shell(makeString("SKF-6693421741")), constant_handles.reader_make_constant_shell(makeString("SKF-1800635573")), constant_handles.reader_make_constant_shell(makeString("SKF-5174206356")), constant_handles.reader_make_constant_shell(makeString("SKF-8137704160")), constant_handles.reader_make_constant_shell(makeString("SKF-6138620537")), constant_handles.reader_make_constant_shell(makeString("SKF-6954747722")), constant_handles.reader_make_constant_shell(makeString("SKF-8822929547")), constant_handles.reader_make_constant_shell(makeString("SKF-6574888924")), constant_handles.reader_make_constant_shell(makeString("SKF-4648710733")), constant_handles.reader_make_constant_shell(makeString("SKF-3574121958")), constant_handles.reader_make_constant_shell(makeString("SKF-7111033530")), constant_handles.reader_make_constant_shell(makeString("SKF-1259710929")), constant_handles.reader_make_constant_shell(makeString("SKF-9511328868")), constant_handles.reader_make_constant_shell(makeString("SKF-7988430072")), constant_handles.reader_make_constant_shell(makeString("SKF-9334424285")), constant_handles.reader_make_constant_shell(makeString("SKF-0241028856")), constant_handles.reader_make_constant_shell(makeString("SKF-8824048486")), constant_handles.reader_make_constant_shell(makeString("SKF-4709173148")), constant_handles.reader_make_constant_shell(makeString("SKF-9085853324")), constant_handles.reader_make_constant_shell(makeString("SKF-5615627058")), constant_handles.reader_make_constant_shell(makeString("SKF-6491665291")), constant_handles.reader_make_constant_shell(makeString("SKF-0256832978")), constant_handles.reader_make_constant_shell(makeString("SKF-1494753028")), constant_handles.reader_make_constant_shell(makeString("SKF-3439360561")), constant_handles.reader_make_constant_shell(makeString("SKF-4359556905")), constant_handles.reader_make_constant_shell(makeString("SKF-1746016905")), constant_handles.reader_make_constant_shell(makeString("SKF-4430979996")), constant_handles.reader_make_constant_shell(makeString("SKF-5792768502")), constant_handles.reader_make_constant_shell(makeString("SKF-5965884944")), constant_handles.reader_make_constant_shell(makeString("SKF-4975731367")), constant_handles.reader_make_constant_shell(makeString("SKF-2918153882")), constant_handles.reader_make_constant_shell(makeString("SKF-0992686716")), constant_handles.reader_make_constant_shell(makeString("SKF-8537516687")), constant_handles.reader_make_constant_shell(makeString("SKF-7685719048")), constant_handles.reader_make_constant_shell(makeString("SKF-1488659619")), constant_handles.reader_make_constant_shell(makeString("SKF-9837174340")), constant_handles.reader_make_constant_shell(makeString("SKF-0372211184")), constant_handles.reader_make_constant_shell(makeString("SKF-6796242698")), constant_handles.reader_make_constant_shell(makeString("SKF-4631282123")), constant_handles.reader_make_constant_shell(makeString("SKF-8747036173")), constant_handles.reader_make_constant_shell(makeString("SKF-9214557550")), constant_handles.reader_make_constant_shell(makeString("SKF-2969771224")), constant_handles.reader_make_constant_shell(makeString("SKF-3201009743")), constant_handles.reader_make_constant_shell(makeString("SKF-8199787846")), constant_handles.reader_make_constant_shell(makeString("SKF-1857924337")), constant_handles.reader_make_constant_shell(makeString("SKF-2577476768")), constant_handles.reader_make_constant_shell(makeString("SKF-9606922473")), constant_handles.reader_make_constant_shell(makeString("SKF-3890236588")), constant_handles.reader_make_constant_shell(makeString("SKF-2976547342")), constant_handles.reader_make_constant_shell(makeString("SKF-2734536924")), constant_handles.reader_make_constant_shell(makeString("SKF-4107434815")), constant_handles.reader_make_constant_shell(makeString("SKF-8121330546")), constant_handles.reader_make_constant_shell(makeString("SKF-0714339318")), constant_handles.reader_make_constant_shell(makeString("SKF-3616130689")), constant_handles.reader_make_constant_shell(makeString("SKF-4918966")), constant_handles.reader_make_constant_shell(makeString("SKF-12370394")), constant_handles.reader_make_constant_shell(makeString("SKF-58467056")), constant_handles.reader_make_constant_shell(makeString("SKF-61049284")), constant_handles.reader_make_constant_shell(makeString("SKF-14302329")), constant_handles.reader_make_constant_shell(makeString("SKF-4779393528")), constant_handles.reader_make_constant_shell(makeString("SKF-1305979122")), constant_handles.reader_make_constant_shell(makeString("SKF-7033956451")), constant_handles.reader_make_constant_shell(makeString("SKF-4442841559"))});
  public static final SubLObject $list106 = _constant_106_initializer();
  public static final SubLString $str107$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLString $str108$_a__a__s__ = makeString("~a ~a ~s~%");
  public static final SubLSymbol $sym109$DIAGNOSE_JUST_THIS_SKOLEM = makeSymbol("DIAGNOSE-JUST-THIS-SKOLEM");
  public static final SubLSymbol $kw110$PARTIALLY_UNFINDABLE = makeKeyword("PARTIALLY-UNFINDABLE");
  public static final SubLSymbol $kw111$UNFINDABLE = makeKeyword("UNFINDABLE");
  public static final SubLSymbol $kw112$FREE_VARIABLE = makeKeyword("FREE-VARIABLE");
  public static final SubLSymbol $kw113$MULTIPLE_MTS = makeKeyword("MULTIPLE-MTS");
  public static final SubLSymbol $kw114$RAW_SKOLEM = makeKeyword("RAW-SKOLEM");
  public static final SubLSymbol $kw115$UNREIFIED_SKOLEM = makeKeyword("UNREIFIED-SKOLEM");
  public static final SubLSymbol $kw116$KNOWN_ISSUE = makeKeyword("KNOWN-ISSUE");
  public static final SubLList $list117 = list(makeKeyword("RAW-SKOLEM"), makeKeyword("UNREIFIED-SKOLEM"), makeKeyword("FREE-VARIABLE"));
  public static final SubLSymbol $kw118$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLString $str119$different_el_formulas_for__a____s = makeString("different el formulas for ~a:~%~s~%~s");
  public static final SubLList $list120 = list(constant_handles.reader_make_constant_shell(makeString("thereExists")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(makeKeyword("TEST"), makeSymbol("CONJUNCTION-OF-LITERALS?")));
  public static final SubLList $list121 = list(constant_handles.reader_make_constant_shell(makeString("thereExists")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(makeKeyword("TEST"), makeSymbol("CONJUNCTION-OF-LITERALS?"))));
  public static final SubLList $list122 = list(constant_handles.reader_make_constant_shell(makeString("thereExists")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(makeKeyword("TEST"), makeSymbol("CONJUNCTION-OF-LITERALS?")))));
  public static final SubLList $list123 = list(constant_handles.reader_make_constant_shell(makeString("implies")), makeKeyword("ANYTHING"), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(makeKeyword("TEST"), makeSymbol("CONJUNCTION-OF-LITERALS?"))));
  public static final SubLList $list124 = list(constant_handles.reader_make_constant_shell(makeString("implies")), makeKeyword("ANYTHING"), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(makeKeyword("TEST"), makeSymbol("CONJUNCTION-OF-LITERALS?")))));
  public static final SubLList $list125 = list(constant_handles.reader_make_constant_shell(makeString("implies")), makeKeyword("ANYTHING"), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(makeKeyword("TEST"), makeSymbol("CONJUNCTION-OF-LITERALS?"))))));
  public static final SubLList $list126 = list(constant_handles.reader_make_constant_shell(makeString("implies")), makeKeyword("ANYTHING"), list(list(makeKeyword("TEST"), makeSymbol("CYC-CONST-BOUNDED-EXISTENTIAL-OPERATOR-P")), list(makeKeyword("TEST"), makeSymbol("GROUND?")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(makeKeyword("TEST"), makeSymbol("CONJUNCTION-OF-LITERALS?"))));
  public static final SubLList $list127 = list(constant_handles.reader_make_constant_shell(makeString("and")), list(makeKeyword("TEST"), makeSymbol("EL-LITERAL-P")), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(constant_handles.reader_make_constant_shell(makeString("temporalMicrotheoriesIntersect")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"))));
  public static final SubLList $list128 = list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("thereExists")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(constant_handles.reader_make_constant_shell(makeString("temporalMicrotheoriesIntersect")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"))), list(makeKeyword("TEST"), makeSymbol("EL-LITERAL-P")));
  public static final SubLSymbol $kw129$IGNORE = makeKeyword("IGNORE");
  public static final SubLList $list130 = list(makeSymbol("SKOLEM-TYPE"), makeSymbol("VARS"), makeSymbol("SK-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("NUMBER"));
  public static final SubLString $str131$Skolem_type_mismatch___a__a__a = makeString("Skolem type mismatch: ~a ~a ~a");
  public static final SubLString $str132$ = makeString("");
  public static final SubLString $str133$temporalMicrotheoriesIntersect_ = makeString("temporalMicrotheoriesIntersect ");
  public static final SubLString $str134$___amismatch_for__a___a___a__ = makeString("~%~amismatch for ~a~%~a~%~a~%");
  public static final SubLList $list135 = list(makeSymbol("SK-FN"), makeSymbol("VARS"), makeSymbol("VAR"), makeSymbol("SEQVAR"));
  public static final SubLString $str136$Error = makeString("Error");
  public static final SubLList $list137 = list(makeSymbol("SK-FN"), makeSymbol("VARS"), makeSymbol("VAR"), makeSymbol("SEQVAR"), makeSymbol("&OPTIONAL"), makeSymbol("EXISTING-NUMBER"));
  public static final SubLSymbol $sym138$SKOLEM_SCALAR_TERM_ = makeSymbol("SKOLEM-SCALAR-TERM?");
  public static final SubLList $list139 = list(makeSymbol("ASS1"), makeSymbol("ASS2"));
  public static final SubLObject $const140$temporalMicrotheoriesIntersect = constant_handles.reader_make_constant_shell(makeString("temporalMicrotheoriesIntersect"));
  public static final SubLList $list141 = list(makeSymbol("CONTENT-ASS"), makeSymbol("TMI-ASS"));
  public static final SubLObject $const142$thereExists = constant_handles.reader_make_constant_shell(makeString("thereExists"));
  public static final SubLSymbol $sym143$_TIME = makeSymbol("?TIME");
  public static final SubLObject $const144$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLObject $const145$MtSpace = constant_handles.reader_make_constant_shell(makeString("MtSpace"));
  public static final SubLList $list146 = list(list(constant_handles.reader_make_constant_shell(makeString("MtTimeDimFn")), makeSymbol("?TIME")));
  public static final SubLObject $const147$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLList $list148 = list(list(constant_handles.reader_make_constant_shell(makeString("temporalMicrotheoriesIntersect")), list(constant_handles.reader_make_constant_shell(makeString("MtTimeDimFn")), makeSymbol("?TIME")), list(constant_handles.reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn")), list(constant_handles.reader_make_constant_shell(makeString("IntervalEndedByFn")), constant_handles.reader_make_constant_shell(makeString("Now-Indexical"))), constant_handles.reader_make_constant_shell(makeString("TimePoint")))));
  public static final SubLObject $const149$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
  public static final SubLList $list150 = list(new SubLObject[] {constant_handles.reader_make_constant_shell(makeString("SKF-2172650888")), constant_handles.reader_make_constant_shell(makeString("SKF-6548862369")), constant_handles.reader_make_constant_shell(makeString("SKF-8409811003")), constant_handles.reader_make_constant_shell(makeString("SKF-7363528201")), constant_handles.reader_make_constant_shell(makeString("SKF-1358114357")), constant_handles.reader_make_constant_shell(makeString("SKF-4072021064")), constant_handles.reader_make_constant_shell(makeString("SKF-1681761679")), constant_handles.reader_make_constant_shell(makeString("SKF-2548755082")), constant_handles.reader_make_constant_shell(makeString("SKF-6067931751")), constant_handles.reader_make_constant_shell(makeString("SKF-5709128133")), constant_handles.reader_make_constant_shell(makeString("SKF-1590734700")), constant_handles.reader_make_constant_shell(makeString("SKF-5134195828")), constant_handles.reader_make_constant_shell(makeString("SKF-3907269039")), constant_handles.reader_make_constant_shell(makeString("SKF-6454474627")), constant_handles.reader_make_constant_shell(makeString("SKF-9567857250")), constant_handles.reader_make_constant_shell(makeString("SKF-5128698501")), constant_handles.reader_make_constant_shell(makeString("SKF-0849952130")), constant_handles.reader_make_constant_shell(makeString("SKF-5716409094")), constant_handles.reader_make_constant_shell(makeString("SKF-9715593487")), constant_handles.reader_make_constant_shell(makeString("SKF-4012481774")), constant_handles.reader_make_constant_shell(makeString("SKF-9973400181")), constant_handles.reader_make_constant_shell(makeString("SKF-4749210628")), constant_handles.reader_make_constant_shell(makeString("SKF-7688139609")), constant_handles.reader_make_constant_shell(makeString("SKF-7103881989")), constant_handles.reader_make_constant_shell(makeString("SKF-5296958920")), constant_handles.reader_make_constant_shell(makeString("SKF-9684239747")), constant_handles.reader_make_constant_shell(makeString("SKF-9283857452")), constant_handles.reader_make_constant_shell(makeString("SKF-8076090600")), constant_handles.reader_make_constant_shell(makeString("SKF-8853185369")), constant_handles.reader_make_constant_shell(makeString("SKF-2870709283")), constant_handles.reader_make_constant_shell(makeString("SKF-4865105368")), constant_handles.reader_make_constant_shell(makeString("SKF-6632523431")), constant_handles.reader_make_constant_shell(makeString("SKF-8236383708")), constant_handles.reader_make_constant_shell(makeString("SKF-0341790583")), constant_handles.reader_make_constant_shell(makeString("SKF-5342612010"))});
  public static final SubLString $str151$recanonicalizing_skolems = makeString("recanonicalizing skolems");

  //// Internal Constant Initializer Methods

  private static final SubLObject _constant_106_initializer() {
    return list(new SubLObject[] {constant_handles.reader_make_constant_shell(makeString("SKF-16971619")), constant_handles.reader_make_constant_shell(makeString("SKF-9662286")), constant_handles.reader_make_constant_shell(makeString("SKF-45878693")), constant_handles.reader_make_constant_shell(makeString("SKF-27834981")), constant_handles.reader_make_constant_shell(makeString("SKF-12369461")), constant_handles.reader_make_constant_shell(makeString("SKF-10688698")), constant_handles.reader_make_constant_shell(makeString("SKF-45547787")), constant_handles.reader_make_constant_shell(makeString("SKF-31789746")), constant_handles.reader_make_constant_shell(makeString("SKF-26692934")), constant_handles.reader_make_constant_shell(makeString("SKF-48466118")), constant_handles.reader_make_constant_shell(makeString("SKF-60531811")), constant_handles.reader_make_constant_shell(makeString("SKF-29624762")), constant_handles.reader_make_constant_shell(makeString("SKF-22643466")), constant_handles.reader_make_constant_shell(makeString("SKF-29472649")), constant_handles.reader_make_constant_shell(makeString("SKF-6535610808")), constant_handles.reader_make_constant_shell(makeString("SKF-6391880459")), constant_handles.reader_make_constant_shell(makeString("SKF-6069753105")), constant_handles.reader_make_constant_shell(makeString("SKF-1836062444")), constant_handles.reader_make_constant_shell(makeString("SKF-1140288587")), constant_handles.reader_make_constant_shell(makeString("SKF-0975510193")), constant_handles.reader_make_constant_shell(makeString("SKF-0417114039")), constant_handles.reader_make_constant_shell(makeString("SKF-2399775374")), constant_handles.reader_make_constant_shell(makeString("SKF-9741300383")), constant_handles.reader_make_constant_shell(makeString("SKF-0828551493")), constant_handles.reader_make_constant_shell(makeString("SKF-2588418129")), constant_handles.reader_make_constant_shell(makeString("SKF-1857929740")), constant_handles.reader_make_constant_shell(makeString("SKF-9771221235")), constant_handles.reader_make_constant_shell(makeString("SKF-5248881133")), constant_handles.reader_make_constant_shell(makeString("SKF-30037247")), constant_handles.reader_make_constant_shell(makeString("SKF-60060919")), constant_handles.reader_make_constant_shell(makeString("SKF-10786079")), constant_handles.reader_make_constant_shell(makeString("SKF-14077376")), constant_handles.reader_make_constant_shell(makeString("SKF-55914574")), constant_handles.reader_make_constant_shell(makeString("SKF-16648407")), constant_handles.reader_make_constant_shell(makeString("SKF-44601733")), constant_handles.reader_make_constant_shell(makeString("SKF-7913899905")), constant_handles.reader_make_constant_shell(makeString("SKF-4396958760")), constant_handles.reader_make_constant_shell(makeString("SKF-8020199718")), constant_handles.reader_make_constant_shell(makeString("SKF-20333")), constant_handles.reader_make_constant_shell(makeString("SKF-3701677947")), constant_handles.reader_make_constant_shell(makeString("SKF-2758282998")), constant_handles.reader_make_constant_shell(makeString("SKF-32592026")), constant_handles.reader_make_constant_shell(makeString("SKF-15476867")), constant_handles.reader_make_constant_shell(makeString("SKF-11623545")), constant_handles.reader_make_constant_shell(makeString("SKF-39071040")), constant_handles.reader_make_constant_shell(makeString("SKF-22133371")), constant_handles.reader_make_constant_shell(makeString("SKF-49114437")), constant_handles.reader_make_constant_shell(makeString("SKF-6397777")), constant_handles.reader_make_constant_shell(makeString("SKF-27545347")), constant_handles.reader_make_constant_shell(makeString("SKF-44682034")), constant_handles.reader_make_constant_shell(makeString("SKF-55141454")), constant_handles.reader_make_constant_shell(makeString("SKF-29896988")), constant_handles.reader_make_constant_shell(makeString("SKF-42443574")), constant_handles.reader_make_constant_shell(makeString("SKF-13447977")), constant_handles.reader_make_constant_shell(makeString("SKF-30519480")), constant_handles.reader_make_constant_shell(makeString("SKF-62227276")), constant_handles.reader_make_constant_shell(makeString("SKF-17408839")), constant_handles.reader_make_constant_shell(makeString("SKF-58430677")), constant_handles.reader_make_constant_shell(makeString("SKF-59662976")), constant_handles.reader_make_constant_shell(makeString("SKF-12620975")), constant_handles.reader_make_constant_shell(makeString("SKF-9433064")), constant_handles.reader_make_constant_shell(makeString("SKF-9205245")), constant_handles.reader_make_constant_shell(makeString("SKF-DepictedGroupMember")), constant_handles.reader_make_constant_shell(makeString("SKF-19625320")), constant_handles.reader_make_constant_shell(makeString("SKF-3784346661")), constant_handles.reader_make_constant_shell(makeString("SKF-6544284149")), constant_handles.reader_make_constant_shell(makeString("SKF-0614825063")), constant_handles.reader_make_constant_shell(makeString("SKF-0016213450")), constant_handles.reader_make_constant_shell(makeString("SKF-22649603")), constant_handles.reader_make_constant_shell(makeString("SKF-4118636")), constant_handles.reader_make_constant_shell(makeString("SKF-19878232")), constant_handles.reader_make_constant_shell(makeString("SKF-15013378")), constant_handles.reader_make_constant_shell(makeString("SKF-65815517")), constant_handles.reader_make_constant_shell(makeString("SKF-56452378")), constant_handles.reader_make_constant_shell(makeString("SKF-49139121")), constant_handles.reader_make_constant_shell(makeString("SKF-12749049")), constant_handles.reader_make_constant_shell(makeString("SKF-2910558946")), constant_handles.reader_make_constant_shell(makeString("SKF-2910558946")), constant_handles.reader_make_constant_shell(makeString("SKF-8609688279")), constant_handles.reader_make_constant_shell(makeString("SKF-3254220233")), constant_handles.reader_make_constant_shell(makeString("SKF-4116454483")), constant_handles.reader_make_constant_shell(makeString("SKF-9882206036")), constant_handles.reader_make_constant_shell(makeString("SKF-7876960574")), constant_handles.reader_make_constant_shell(makeString("SKF-7849157406")), constant_handles.reader_make_constant_shell(makeString("SKF-0013694801")), constant_handles.reader_make_constant_shell(makeString("SKF-3786700124")), constant_handles.reader_make_constant_shell(makeString("SKF-1714230847")), constant_handles.reader_make_constant_shell(makeString("SKF-7566265665")), constant_handles.reader_make_constant_shell(makeString("SKF-8055872557")), constant_handles.reader_make_constant_shell(makeString("SKF-6624619390")), constant_handles.reader_make_constant_shell(makeString("SKF-4749393956")), constant_handles.reader_make_constant_shell(makeString("SKF-9902000475")), constant_handles.reader_make_constant_shell(makeString("SKF-2176445673")), constant_handles.reader_make_constant_shell(makeString("SKF-9582976901")), constant_handles.reader_make_constant_shell(makeString("SKF-62641426")), constant_handles.reader_make_constant_shell(makeString("SKF-37581079")), constant_handles.reader_make_constant_shell(makeString("SKF-9780389")), constant_handles.reader_make_constant_shell(makeString("SKF-51938893")), constant_handles.reader_make_constant_shell(makeString("SKF-33012437")), constant_handles.reader_make_constant_shell(makeString("SKF-9412760")), constant_handles.reader_make_constant_shell(makeString("SKF-22314298")), constant_handles.reader_make_constant_shell(makeString("SKF-52903378")), constant_handles.reader_make_constant_shell(makeString("SKF-59517423")), constant_handles.reader_make_constant_shell(makeString("SKF-24705784")), constant_handles.reader_make_constant_shell(makeString("SKF-22566254")), constant_handles.reader_make_constant_shell(makeString("SKF-35236481")), constant_handles.reader_make_constant_shell(makeString("SKF-26725746")), constant_handles.reader_make_constant_shell(makeString("SKF-55356852")), constant_handles.reader_make_constant_shell(makeString("SKF-3634339")), constant_handles.reader_make_constant_shell(makeString("SKF-65815517")), constant_handles.reader_make_constant_shell(makeString("SKF-56452378")), constant_handles.reader_make_constant_shell(makeString("SKF-49139121")), constant_handles.reader_make_constant_shell(makeString("SKF-12749049")), constant_handles.reader_make_constant_shell(makeString("SKF-4408119749")), constant_handles.reader_make_constant_shell(makeString("SKF-3789312666")), constant_handles.reader_make_constant_shell(makeString("SKF-0283155048")), constant_handles.reader_make_constant_shell(makeString("SKF-9294061441")), constant_handles.reader_make_constant_shell(makeString("SKF-4876245588")), constant_handles.reader_make_constant_shell(makeString("SKF-2809645919")), constant_handles.reader_make_constant_shell(makeString("SKF-1124554131")), constant_handles.reader_make_constant_shell(makeString("SKF-0220610914")), constant_handles.reader_make_constant_shell(makeString("SKF-4790221775")), constant_handles.reader_make_constant_shell(makeString("SKF-1168015263")), constant_handles.reader_make_constant_shell(makeString("SKF-4318796173")), constant_handles.reader_make_constant_shell(makeString("SKF-1828131226")), constant_handles.reader_make_constant_shell(makeString("SKF-2199671088")), constant_handles.reader_make_constant_shell(makeString("SKF-9895165404")), constant_handles.reader_make_constant_shell(makeString("SKF-6604522774")), constant_handles.reader_make_constant_shell(makeString("SKF-6086634185")), constant_handles.reader_make_constant_shell(makeString("SKF-0428133650")), constant_handles.reader_make_constant_shell(makeString("SKF-7899934995")), constant_handles.reader_make_constant_shell(makeString("SKF-0860923384")), constant_handles.reader_make_constant_shell(makeString("SKF-4146570201")), constant_handles.reader_make_constant_shell(makeString("SKF-0406242321")), constant_handles.reader_make_constant_shell(makeString("SKF-4468030352")), constant_handles.reader_make_constant_shell(makeString("SKF-8519691249")), constant_handles.reader_make_constant_shell(makeString("SKF-6471415053")), constant_handles.reader_make_constant_shell(makeString("SKF-6816884555")), constant_handles.reader_make_constant_shell(makeString("SKF-2207590761")), constant_handles.reader_make_constant_shell(makeString("SKF-4785728462")), constant_handles.reader_make_constant_shell(makeString("SKF-6959780810")), constant_handles.reader_make_constant_shell(makeString("SKF-2698165023")), constant_handles.reader_make_constant_shell(makeString("SKF-1592332182")), constant_handles.reader_make_constant_shell(makeString("SKF-9127604959")), constant_handles.reader_make_constant_shell(makeString("SKF-3352641286")), constant_handles.reader_make_constant_shell(makeString("SKF-9726105841")), constant_handles.reader_make_constant_shell(makeString("SKF-0624682876")), constant_handles.reader_make_constant_shell(makeString("SKF-9673514545")), constant_handles.reader_make_constant_shell(makeString("SKF-1902545429")), constant_handles.reader_make_constant_shell(makeString("SKF-6876074534")), constant_handles.reader_make_constant_shell(makeString("SKF-8288491486")), constant_handles.reader_make_constant_shell(makeString("SKF-4637358284")), constant_handles.reader_make_constant_shell(makeString("SKF-0635199939")), constant_handles.reader_make_constant_shell(makeString("SKF-4292973565")), constant_handles.reader_make_constant_shell(makeString("SKF-7798353664")), constant_handles.reader_make_constant_shell(makeString("SKF-34523039")), constant_handles.reader_make_constant_shell(makeString("SKF-33538847")), constant_handles.reader_make_constant_shell(makeString("SKF-58036047")), constant_handles.reader_make_constant_shell(makeString("SKF-9708075")), constant_handles.reader_make_constant_shell(makeString("SKF-13094314")), constant_handles.reader_make_constant_shell(makeString("SKF-27004431")), constant_handles.reader_make_constant_shell(makeString("SKF-47290403")), constant_handles.reader_make_constant_shell(makeString("SKF-49713991")), constant_handles.reader_make_constant_shell(makeString("SKF-40178904")), constant_handles.reader_make_constant_shell(makeString("SKF-62659908")), constant_handles.reader_make_constant_shell(makeString("SKF-61484227")), constant_handles.reader_make_constant_shell(makeString("SKF-35458681")), constant_handles.reader_make_constant_shell(makeString("SKF-17599345")), constant_handles.reader_make_constant_shell(makeString("SKF-53668837")), constant_handles.reader_make_constant_shell(makeString("SKF-24102297")), constant_handles.reader_make_constant_shell(makeString("SKF-32709431")), constant_handles.reader_make_constant_shell(makeString("SKF-51752162")), constant_handles.reader_make_constant_shell(makeString("SKF-35359227")), constant_handles.reader_make_constant_shell(makeString("SKF-20847759")), constant_handles.reader_make_constant_shell(makeString("SKF-51781280")), constant_handles.reader_make_constant_shell(makeString("SKF-51473172")), constant_handles.reader_make_constant_shell(makeString("SKF-36777684")), constant_handles.reader_make_constant_shell(makeString("SKF-27183984")), constant_handles.reader_make_constant_shell(makeString("SKF-24538299")), constant_handles.reader_make_constant_shell(makeString("SKF-51270566")), constant_handles.reader_make_constant_shell(makeString("SKF-6498804")), constant_handles.reader_make_constant_shell(makeString("SKF-52375281")), constant_handles.reader_make_constant_shell(makeString("SKF-59156909")), constant_handles.reader_make_constant_shell(makeString("SKF-59507392")), constant_handles.reader_make_constant_shell(makeString("SKF-21555986")), constant_handles.reader_make_constant_shell(makeString("SKF-0925186357")), constant_handles.reader_make_constant_shell(makeString("SKF-6223276020")), constant_handles.reader_make_constant_shell(makeString("SKF-5400448981")), constant_handles.reader_make_constant_shell(makeString("SKF-0033649819")), constant_handles.reader_make_constant_shell(makeString("SKF-8779626658")), constant_handles.reader_make_constant_shell(makeString("SKF-2650598318")), constant_handles.reader_make_constant_shell(makeString("SKF-1317366451")), constant_handles.reader_make_constant_shell(makeString("SKF-5713244721")), constant_handles.reader_make_constant_shell(makeString("SKF-5494021688")), constant_handles.reader_make_constant_shell(makeString("SKF-50021281")), constant_handles.reader_make_constant_shell(makeString("SKF-52700384")), constant_handles.reader_make_constant_shell(makeString("SKF-27017330")), constant_handles.reader_make_constant_shell(makeString("SKF-6926447")), constant_handles.reader_make_constant_shell(makeString("SKF-57742011")), constant_handles.reader_make_constant_shell(makeString("SKF-32797409")), constant_handles.reader_make_constant_shell(makeString("SKF-36775099")), constant_handles.reader_make_constant_shell(makeString("SKF-8803460")), constant_handles.reader_make_constant_shell(makeString("SKF-11685259")), constant_handles.reader_make_constant_shell(makeString("SKF-49596986")), constant_handles.reader_make_constant_shell(makeString("SKF-1515868")), constant_handles.reader_make_constant_shell(makeString("SKF-12425256")), constant_handles.reader_make_constant_shell(makeString("SKF-26526786")), constant_handles.reader_make_constant_shell(makeString("SKF-757265")), constant_handles.reader_make_constant_shell(makeString("SKF-66361621")), constant_handles.reader_make_constant_shell(makeString("SKF-50135687")), constant_handles.reader_make_constant_shell(makeString("SKF-28256974")), constant_handles.reader_make_constant_shell(makeString("SKF-52059331")), constant_handles.reader_make_constant_shell(makeString("SKF-60879947")), constant_handles.reader_make_constant_shell(makeString("SKF-10095100")), constant_handles.reader_make_constant_shell(makeString("SKF-20576203")), constant_handles.reader_make_constant_shell(makeString("SKF-49828332")), constant_handles.reader_make_constant_shell(makeString("SKF-44916076")), constant_handles.reader_make_constant_shell(makeString("SKF-63714570")), constant_handles.reader_make_constant_shell(makeString("SKF-3886762")), constant_handles.reader_make_constant_shell(makeString("SKF-14991605")), constant_handles.reader_make_constant_shell(makeString("SKF-35022890")), constant_handles.reader_make_constant_shell(makeString("SKF-9692584")), constant_handles.reader_make_constant_shell(makeString("SKF-56789029")), constant_handles.reader_make_constant_shell(makeString("SKF-63331999")), constant_handles.reader_make_constant_shell(makeString("SKF-60839916")), constant_handles.reader_make_constant_shell(makeString("SKF-11805601")), constant_handles.reader_make_constant_shell(makeString("MarriedCoupleFn")), constant_handles.reader_make_constant_shell(makeString("SKF-54717125")), constant_handles.reader_make_constant_shell(makeString("SKF-47103024")), constant_handles.reader_make_constant_shell(makeString("SKF-32504795")), constant_handles.reader_make_constant_shell(makeString("SKF-50991035")), constant_handles.reader_make_constant_shell(makeString("SKF-54893967")), constant_handles.reader_make_constant_shell(makeString("SKF-4588740")), constant_handles.reader_make_constant_shell(makeString("SKF-34044423")), constant_handles.reader_make_constant_shell(makeString("SKF-23158350")), constant_handles.reader_make_constant_shell(makeString("SKF-26216492")), constant_handles.reader_make_constant_shell(makeString("SKF-23792367")), constant_handles.reader_make_constant_shell(makeString("SKF-26655735")), constant_handles.reader_make_constant_shell(makeString("SKF-36384184")), constant_handles.reader_make_constant_shell(makeString("SKF-28223401")), constant_handles.reader_make_constant_shell(makeString("SKF-30705866")), constant_handles.reader_make_constant_shell(makeString("SKF-31089449")), constant_handles.reader_make_constant_shell(makeString("SKF-43795517")), constant_handles.reader_make_constant_shell(makeString("SKF-54692934")), constant_handles.reader_make_constant_shell(makeString("SKF-62874373")), constant_handles.reader_make_constant_shell(makeString("SKF-13198899")), constant_handles.reader_make_constant_shell(makeString("SKF-6598020")), constant_handles.reader_make_constant_shell(makeString("SKF-66712623")), constant_handles.reader_make_constant_shell(makeString("SKF-61590093")), constant_handles.reader_make_constant_shell(makeString("SKF-4298210")), constant_handles.reader_make_constant_shell(makeString("SKF-13358052")), constant_handles.reader_make_constant_shell(makeString("SKF-1077450")), constant_handles.reader_make_constant_shell(makeString("SKF-27216176")), constant_handles.reader_make_constant_shell(makeString("SKF-28083191")), constant_handles.reader_make_constant_shell(makeString("SKF-539243")), constant_handles.reader_make_constant_shell(makeString("SKF-14104209")), constant_handles.reader_make_constant_shell(makeString("SKF-6066610")), constant_handles.reader_make_constant_shell(makeString("SKF-14779626")), constant_handles.reader_make_constant_shell(makeString("SKF-1007216")), constant_handles.reader_make_constant_shell(makeString("SKF-49463821")), constant_handles.reader_make_constant_shell(makeString("SKF-764714")), constant_handles.reader_make_constant_shell(makeString("SKF-59277817")), constant_handles.reader_make_constant_shell(makeString("SKF-24473185")), constant_handles.reader_make_constant_shell(makeString("SKF-22799176")), constant_handles.reader_make_constant_shell(makeString("SKF-13378825")), constant_handles.reader_make_constant_shell(makeString("SKF-8692086")), constant_handles.reader_make_constant_shell(makeString("SKF-59150515")), constant_handles.reader_make_constant_shell(makeString("SKF-6649426")), constant_handles.reader_make_constant_shell(makeString("SKF-18423567")), constant_handles.reader_make_constant_shell(makeString("SKF-61014428")), constant_handles.reader_make_constant_shell(makeString("SKF-612301")), constant_handles.reader_make_constant_shell(makeString("SKF-390407")), constant_handles.reader_make_constant_shell(makeString("SKF-469762")), constant_handles.reader_make_constant_shell(makeString("SKF-57350382")), constant_handles.reader_make_constant_shell(makeString("SKF-550621")), constant_handles.reader_make_constant_shell(makeString("SKF-41449368")), constant_handles.reader_make_constant_shell(makeString("SKF-20918103")), constant_handles.reader_make_constant_shell(makeString("SKF-447007")), constant_handles.reader_make_constant_shell(makeString("SKF-1383963")), constant_handles.reader_make_constant_shell(makeString("SKF-348190")), constant_handles.reader_make_constant_shell(makeString("SKF-693803")), constant_handles.reader_make_constant_shell(makeString("SKF-133452")), constant_handles.reader_make_constant_shell(makeString("SKF-2813385")), constant_handles.reader_make_constant_shell(makeString("SKF-31097107")), constant_handles.reader_make_constant_shell(makeString("SKF-57888")), constant_handles.reader_make_constant_shell(makeString("SKF-10895131")), constant_handles.reader_make_constant_shell(makeString("SKF-13225721")), constant_handles.reader_make_constant_shell(makeString("SKF-43450038")), constant_handles.reader_make_constant_shell(makeString("SKF-21119958")), constant_handles.reader_make_constant_shell(makeString("SKF-47744038")), constant_handles.reader_make_constant_shell(makeString("SKF-466900")), constant_handles.reader_make_constant_shell(makeString("SKF-46555292")), constant_handles.reader_make_constant_shell(makeString("SKF-23253528")), constant_handles.reader_make_constant_shell(makeString("SKF-924570")), constant_handles.reader_make_constant_shell(makeString("SKF-BandMemPlaying")), constant_handles.reader_make_constant_shell(makeString("SKF-48376054")), constant_handles.reader_make_constant_shell(makeString("SKF-121716")), constant_handles.reader_make_constant_shell(makeString("SKF-7364934")), constant_handles.reader_make_constant_shell(makeString("SKF-14760742")), constant_handles.reader_make_constant_shell(makeString("SKF-17172575")), constant_handles.reader_make_constant_shell(makeString("SKF-23584353")), constant_handles.reader_make_constant_shell(makeString("SKF-53200158")), constant_handles.reader_make_constant_shell(makeString("SKF-48653451")), constant_handles.reader_make_constant_shell(makeString("SKF-55897365")), constant_handles.reader_make_constant_shell(makeString("SKF-52891476")), constant_handles.reader_make_constant_shell(makeString("SKF-33105457")), constant_handles.reader_make_constant_shell(makeString("SKF-10518089")), constant_handles.reader_make_constant_shell(makeString("SKF-33158362")), constant_handles.reader_make_constant_shell(makeString("SKF-66304485")), constant_handles.reader_make_constant_shell(makeString("SKF-810295")), constant_handles.reader_make_constant_shell(makeString("SKF-968219")), constant_handles.reader_make_constant_shell(makeString("SKF-9855449")), constant_handles.reader_make_constant_shell(makeString("SKF-51029398")), constant_handles.reader_make_constant_shell(makeString("SKF-9874778")), constant_handles.reader_make_constant_shell(makeString("SKF-14008069")), constant_handles.reader_make_constant_shell(makeString("SKF-197207")), constant_handles.reader_make_constant_shell(makeString("SKF-9176578")), constant_handles.reader_make_constant_shell(makeString("SKF-62825")), constant_handles.reader_make_constant_shell(makeString("SKF-476059")), constant_handles.reader_make_constant_shell(makeString("SKF-366078")), constant_handles.reader_make_constant_shell(makeString("SKF-17345463")), constant_handles.reader_make_constant_shell(makeString("SKF-51339287")), constant_handles.reader_make_constant_shell(makeString("SKF-1046930")), constant_handles.reader_make_constant_shell(makeString("SKF-828757")), constant_handles.reader_make_constant_shell(makeString("SKF-51633710")), constant_handles.reader_make_constant_shell(makeString("SKF-19769806")), constant_handles.reader_make_constant_shell(makeString("SKF-46906520")), constant_handles.reader_make_constant_shell(makeString("SKF-20309046")), constant_handles.reader_make_constant_shell(makeString("SKF-7477821")), constant_handles.reader_make_constant_shell(makeString("SKF-21294579")), constant_handles.reader_make_constant_shell(makeString("SKF-17746")), constant_handles.reader_make_constant_shell(makeString("SKF-42407080")), constant_handles.reader_make_constant_shell(makeString("SKF-32539269")), constant_handles.reader_make_constant_shell(makeString("SKF-17651656")), constant_handles.reader_make_constant_shell(makeString("SKF-49636199")), constant_handles.reader_make_constant_shell(makeString("SKF-63665039")), constant_handles.reader_make_constant_shell(makeString("SKF-923916")), constant_handles.reader_make_constant_shell(makeString("SKF-41511095")), constant_handles.reader_make_constant_shell(makeString("SKF-402998")), constant_handles.reader_make_constant_shell(makeString("SKF-1827166")), constant_handles.reader_make_constant_shell(makeString("SKF-25558723")), constant_handles.reader_make_constant_shell(makeString("SKF-92235")), constant_handles.reader_make_constant_shell(makeString("SKF-24405989")), constant_handles.reader_make_constant_shell(makeString("SKF-37741853")), constant_handles.reader_make_constant_shell(makeString("SKF-681210")), constant_handles.reader_make_constant_shell(makeString("SKF-16612795")), constant_handles.reader_make_constant_shell(makeString("SKF-55392675")), constant_handles.reader_make_constant_shell(makeString("SKF-41395088")), constant_handles.reader_make_constant_shell(makeString("SKF-427687")), constant_handles.reader_make_constant_shell(makeString("SKF-46187940")), constant_handles.reader_make_constant_shell(makeString("SKF-18860364")), constant_handles.reader_make_constant_shell(makeString("SKF-846216")), constant_handles.reader_make_constant_shell(makeString("SKF-5393361")), constant_handles.reader_make_constant_shell(makeString("SKF-12316220")), constant_handles.reader_make_constant_shell(makeString("SKF-54217404")), constant_handles.reader_make_constant_shell(makeString("SKF-5169399")), constant_handles.reader_make_constant_shell(makeString("SKF-920133")), constant_handles.reader_make_constant_shell(makeString("SKF-3247485")), constant_handles.reader_make_constant_shell(makeString("SKF-2269494")), constant_handles.reader_make_constant_shell(makeString("SKF-13038949")), constant_handles.reader_make_constant_shell(makeString("SKF-28759634")), constant_handles.reader_make_constant_shell(makeString("SKF-17122972")), constant_handles.reader_make_constant_shell(makeString("SKF-953550")), constant_handles.reader_make_constant_shell(makeString("SKF-906137")), constant_handles.reader_make_constant_shell(makeString("SKF-14962533")), constant_handles.reader_make_constant_shell(makeString("SKF-8254998")), constant_handles.reader_make_constant_shell(makeString("SKF-46599863")), constant_handles.reader_make_constant_shell(makeString("SKF-36778441")), constant_handles.reader_make_constant_shell(makeString("SKF-45777401")), constant_handles.reader_make_constant_shell(makeString("SKF-45356858")), constant_handles.reader_make_constant_shell(makeString("SKF-28542904")), constant_handles.reader_make_constant_shell(makeString("SKF-33462840")), constant_handles.reader_make_constant_shell(makeString("SKF-18834377")), constant_handles.reader_make_constant_shell(makeString("SKF-23165858")), constant_handles.reader_make_constant_shell(makeString("SKF-171447")), constant_handles.reader_make_constant_shell(makeString("SKF-38743072")), constant_handles.reader_make_constant_shell(makeString("SKF-62752838")), constant_handles.reader_make_constant_shell(makeString("SKF-46799967")), constant_handles.reader_make_constant_shell(makeString("SKF-38741805")), constant_handles.reader_make_constant_shell(makeString("SKF-22034341")), constant_handles.reader_make_constant_shell(makeString("SKF-49949893")), constant_handles.reader_make_constant_shell(makeString("SKF-750835")), constant_handles.reader_make_constant_shell(makeString("SKF-27330810")), constant_handles.reader_make_constant_shell(makeString("SKF-61593935")), constant_handles.reader_make_constant_shell(makeString("SKF-29534329")), constant_handles.reader_make_constant_shell(makeString("SKF-8780298")), constant_handles.reader_make_constant_shell(makeString("SKF-10230735")), constant_handles.reader_make_constant_shell(makeString("SKF-28051850")), constant_handles.reader_make_constant_shell(makeString("SKF-15346572")), constant_handles.reader_make_constant_shell(makeString("SKF-38351646")), constant_handles.reader_make_constant_shell(makeString("SKF-54477051")), constant_handles.reader_make_constant_shell(makeString("SKF-58577410")), constant_handles.reader_make_constant_shell(makeString("SKF-41179398")), constant_handles.reader_make_constant_shell(makeString("SKF-9098087")), constant_handles.reader_make_constant_shell(makeString("SKF-464896")), constant_handles.reader_make_constant_shell(makeString("SKF-13765056")), constant_handles.reader_make_constant_shell(makeString("SKF-54796118")), constant_handles.reader_make_constant_shell(makeString("SKF-892012")), constant_handles.reader_make_constant_shell(makeString("SKF-5733810632")), constant_handles.reader_make_constant_shell(makeString("SKF-9732365118")), constant_handles.reader_make_constant_shell(makeString("SKF-8062776921")), constant_handles.reader_make_constant_shell(makeString("SKF-9356282252")), constant_handles.reader_make_constant_shell(makeString("SKF-7770326773")), constant_handles.reader_make_constant_shell(makeString("SKF-9303451156")), constant_handles.reader_make_constant_shell(makeString("SKF-7682359700")), constant_handles.reader_make_constant_shell(makeString("SKF-0472592080")), constant_handles.reader_make_constant_shell(makeString("SKF-5868767078")), constant_handles.reader_make_constant_shell(makeString("SKF-6969827182")), constant_handles.reader_make_constant_shell(makeString("SKF-8235654414")), constant_handles.reader_make_constant_shell(makeString("SKF-9268693067")), constant_handles.reader_make_constant_shell(makeString("SKF-4188164665")), constant_handles.reader_make_constant_shell(makeString("SKF-3268848892")), constant_handles.reader_make_constant_shell(makeString("SKF-3954038304")), constant_handles.reader_make_constant_shell(makeString("SKF-8411301306")), constant_handles.reader_make_constant_shell(makeString("SKF-6870027660")), constant_handles.reader_make_constant_shell(makeString("SKF-2200319382")), constant_handles.reader_make_constant_shell(makeString("SKF-8663443543")), constant_handles.reader_make_constant_shell(makeString("SKF-6270260084")), constant_handles.reader_make_constant_shell(makeString("SKF-7428624994")), constant_handles.reader_make_constant_shell(makeString("SKF-6367907452")), constant_handles.reader_make_constant_shell(makeString("SKF-7752915649")), constant_handles.reader_make_constant_shell(makeString("SKF-4786775108")), constant_handles.reader_make_constant_shell(makeString("SKF-5640043419")), constant_handles.reader_make_constant_shell(makeString("SKF-6071218505")), constant_handles.reader_make_constant_shell(makeString("SKF-3183844767")), constant_handles.reader_make_constant_shell(makeString("SKF-7356970316")), constant_handles.reader_make_constant_shell(makeString("SKF-4272845489")), constant_handles.reader_make_constant_shell(makeString("SKF-5224425512")), constant_handles.reader_make_constant_shell(makeString("SKF-3795912959")), constant_handles.reader_make_constant_shell(makeString("SKF-7714022869")), constant_handles.reader_make_constant_shell(makeString("SKF-8565886278")), constant_handles.reader_make_constant_shell(makeString("SKF-0519624184")), constant_handles.reader_make_constant_shell(makeString("SKF-4286299680")), constant_handles.reader_make_constant_shell(makeString("SKF-3516286017")), constant_handles.reader_make_constant_shell(makeString("SKF-8782865500")), constant_handles.reader_make_constant_shell(makeString("SKF-4515155650")), constant_handles.reader_make_constant_shell(makeString("SKF-5391096127")), constant_handles.reader_make_constant_shell(makeString("SKF-8826617065")), constant_handles.reader_make_constant_shell(makeString("SKF-6950497514")), constant_handles.reader_make_constant_shell(makeString("SKF-4751258604")), constant_handles.reader_make_constant_shell(makeString("SKF-3616130689")), constant_handles.reader_make_constant_shell(makeString("SKF-7131788917")), constant_handles.reader_make_constant_shell(makeString("SKF-4848573733")), constant_handles.reader_make_constant_shell(makeString("SKF-2401054776")), constant_handles.reader_make_constant_shell(makeString("SKF-0985467323"))});
  }

  //// Initializers

  public void declareFunctions() {
    declare_skolems_file();
  }

  public void initializeVariables() {
    init_skolems_file();
  }

  public void runTopLevelForms() {
    setup_skolems_file();
  }

}
