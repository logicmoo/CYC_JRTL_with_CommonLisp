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
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_defns;
//dm import com.cyc.cycjava_1.cycl.at_utilities;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.clausifier;
//dm import com.cyc.cycjava_1.cycl.collection_defns;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.czer_meta;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.formula_pattern_match;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.pattern_match;
//dm import com.cyc.cycjava_1.cycl.relation_evaluation;
//dm import com.cyc.cycjava_1.cycl.simplifier;
//dm import com.cyc.cycjava_1.cycl.skolems;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.transform_list_utilities;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;
//dm import com.cyc.cycjava_1.cycl.wff;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class uncanonicalizer extends SubLTranslatedFile {

  //// Constructor

  private uncanonicalizer() {}
  public static final SubLFile me = new uncanonicalizer();
  public static final String myName = "com.cyc.cycjava_1.cycl.uncanonicalizer";

  //// Definitions

  /** A dictionary of the variables in the formula being uncanonicalized.  May change as variables are ununiquified. */
  @SubL(source = "cycl/uncanonicalizer.lisp", position = 547) 
  private static SubLSymbol $ununiquified_el_vars$ = null;

  /** should the uncanonicalizer cache the el formula it computes for each assertion? */
  @SubL(source = "cycl/uncanonicalizer.lisp", position = 1136) 
  public static SubLSymbol $cache_el_formulaP$ = null;

  public static final class $fast_fi_not_el_termP$UnaryFunction extends UnaryFunction {
    public $fast_fi_not_el_termP$UnaryFunction() { super(extractFunctionNamed("FAST-FI-NOT-EL-TERM?")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4209"); }
  }

  /** extend this as necessary */
  @SubL(source = "cycl/uncanonicalizer.lisp", position = 4880) 
  private static SubLSymbol $potentially_interestingly_uncanonicalizable_tense_terms$ = null;

  public static final class $potentially_interestingly_uncanonicalizable_tense_termP$UnaryFunction extends UnaryFunction {
    public $potentially_interestingly_uncanonicalizable_tense_termP$UnaryFunction() { super(extractFunctionNamed("POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERM?")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4227"); }
  }

  @SubL(source = "cycl/uncanonicalizer.lisp", position = 5233) 
  private static SubLSymbol $cached_assertion_el_formula_int_caching_state$ = null;

  /** variables whose leading universal quantification should be retained? */
  @SubL(source = "cycl/uncanonicalizer.lisp", position = 5346) 
  private static SubLSymbol $retain_leading_universals$ = null;

  /** A list of all variables that are universally quantified */
  @SubL(source = "cycl/uncanonicalizer.lisp", position = 5476) 
  private static SubLSymbol $vars_to_universalize$ = null;

  /** A hash table to store free-variables and the skolem functions that reference them */
  @SubL(source = "cycl/uncanonicalizer.lisp", position = 5587) 
  private static SubLSymbol $universal_vars_to_skolem$ = null;

  /** max number of conjuncts that will be attempted to put in dnf during uncanonicalization */
  @SubL(source = "cycl/uncanonicalizer.lisp", position = 41463) 
  public static SubLSymbol $uncanonicalizer_dnf_threshold$ = null;

  /** A list of variables to use for zero-arity skolems */
  @SubL(source = "cycl/uncanonicalizer.lisp", position = 55044) 
  private static SubLSymbol $default_skolem_vars$ = null;

  public static final SubLObject declare_uncanonicalizer_file() {
    //declareMacro(myName, "remembering_ununiquified_el_vars", "REMEMBERING-UNUNIQUIFIED-EL-VARS");
    //declareFunction(myName, "assertion_el_formula_memoized_internal", "ASSERTION-EL-FORMULA-MEMOIZED-INTERNAL", 1, 0, false);
    //declareFunction(myName, "assertion_el_formula_memoized", "ASSERTION-EL-FORMULA-MEMOIZED", 1, 0, false);
    //declareFunction(myName, "assertion_el_formula", "ASSERTION-EL-FORMULA", 1, 0, false);
    //declareFunction(myName, "assertion_elmt", "ASSERTION-ELMT", 1, 0, false);
    //declareFunction(myName, "assertion_el_ist_formula", "ASSERTION-EL-IST-FORMULA", 1, 0, false);
    //declareFunction(myName, "interesting_uncanonicalizationsP", "INTERESTING-UNCANONICALIZATIONS?", 1, 0, false);
    //declareFunction(myName, "fast_fi_not_el_termP", "FAST-FI-NOT-EL-TERM?", 1, 0, false); new $fast_fi_not_el_termP$UnaryFunction();
    //declareFunction(myName, "potentially_interestingly_uncanonicalizable_tense_termP", "POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERM?", 1, 0, false); new $potentially_interestingly_uncanonicalizable_tense_termP$UnaryFunction();
    //declareFunction(myName, "clear_cached_assertion_el_formula_int", "CLEAR-CACHED-ASSERTION-EL-FORMULA-INT", 0, 0, false);
    //declareFunction(myName, "remove_cached_assertion_el_formula_int", "REMOVE-CACHED-ASSERTION-EL-FORMULA-INT", 1, 0, false);
    //declareFunction(myName, "cached_assertion_el_formula_int_internal", "CACHED-ASSERTION-EL-FORMULA-INT-INTERNAL", 1, 0, false);
    //declareFunction(myName, "cached_assertion_el_formula_int", "CACHED-ASSERTION-EL-FORMULA-INT", 1, 0, false);
    //declareFunction(myName, "assertion_el_formula_int", "ASSERTION-EL-FORMULA-INT", 1, 0, false);
    //declareFunction(myName, "unwrap_el_formulas_of_assertions_destructive", "UNWRAP-EL-FORMULAS-OF-ASSERTIONS-DESTRUCTIVE", 1, 0, false);
    //declareFunction(myName, "new_assertion_el_formula_int", "NEW-ASSERTION-EL-FORMULA-INT", 1, 0, false);
    //declareFunction(myName, "cnf_el_formula", "CNF-EL-FORMULA", 1, 2, false);
    //declareFunction(myName, "cnfs_el_formula", "CNFS-EL-FORMULA", 1, 2, false);
    //declareFunction(myName, "hl_dnfs_to_hl_cnfs", "HL-DNFS-TO-HL-CNFS", 1, 0, false);
    //declareFunction(myName, "hl_cnfs_to_hl_dnfs", "HL-CNFS-TO-HL-DNFS", 1, 0, false);
    //declareFunction(myName, "dnfs_el_formula", "DNFS-EL-FORMULA", 1, 2, false);
    //declareFunction(myName, "el_cnfs_to_el_implication", "EL-CNFS-TO-EL-IMPLICATION", 2, 0, false);
    //declareFunction(myName, "remove_index_lits_from_cnfs", "REMOVE-INDEX-LITS-FROM-CNFS", 2, 0, false);
    //declareFunction(myName, "cnf_intermediate_el_formula", "CNF-INTERMEDIATE-EL-FORMULA", 1, 0, false);
    //declareFunction(myName, "el_version", "EL-VERSION", 1, 1, false);
    //declareFunction(myName, "el_explicitify_implicit_meta_literals", "EL-EXPLICITIFY-IMPLICIT-META-LITERALS", 1, 0, false);
    //declareFunction(myName, "el_pragmatic_requirements", "EL-PRAGMATIC-REQUIREMENTS", 1, 0, false);
    //declareFunction(myName, "el_pragmatic_requirement", "EL-PRAGMATIC-REQUIREMENT", 1, 0, false);
    //declareFunction(myName, "el_exceptions", "EL-EXCEPTIONS", 1, 0, false);
    //declareFunction(myName, "el_except_for", "EL-EXCEPT-FOR", 1, 0, false);
    //declareFunction(myName, "el_except_when", "EL-EXCEPT-WHEN", 1, 0, false);
    //declareFunction(myName, "unpackage_cnf_clauses", "UNPACKAGE-CNF-CLAUSES", 1, 0, false);
    //declareFunction(myName, "remove_truesentence_refs", "REMOVE-TRUESENTENCE-REFS", 1, 0, false);
    //declareFunction(myName, "true_sentence_vars", "TRUE-SENTENCE-VARS", 1, 0, false);
    //declareFunction(myName, "undo_variables", "UNDO-VARIABLES", 1, 0, false);
    //declareFunction(myName, "unremove_universals", "UNREMOVE-UNIVERSALS", 1, 0, false);
    //declareFunction(myName, "unremove_universals_int", "UNREMOVE-UNIVERSALS-INT", 1, 0, false);
    //declareFunction(myName, "inter_formula_terms", "INTER-FORMULA-TERMS", 2, 2, false);
    //declareFunction(myName, "inter_formula_skolems", "INTER-FORMULA-SKOLEMS", 2, 0, false);
    //declareFunction(myName, "some_tree_find", "SOME-TREE-FIND", 2, 2, false);
    //declareFunction(myName, "unremove_existentials_and_refd_universals", "UNREMOVE-EXISTENTIALS-AND-REFD-UNIVERSALS", 2, 0, false);
    //declareFunction(myName, "undo_skolem_mt", "UNDO-SKOLEM-MT", 2, 0, false);
    //declareFunction(myName, "base_kb_ist_sentenceP", "BASE-KB-IST-SENTENCE?", 1, 0, false);
    //declareFunction(myName, "segregate_skolems", "SEGREGATE-SKOLEMS", 1, 0, false);
    //declareFunction(myName, "undo_existentials_and_refd_universals", "UNDO-EXISTENTIALS-AND-REFD-UNIVERSALS", 1, 1, false);
    //declareFunction(myName, "init_existentialize_formula", "INIT-EXISTENTIALIZE-FORMULA", 2, 0, false);
    //declareFunction(myName, "existentialize_formula", "EXISTENTIALIZE-FORMULA", 2, 0, false);
    //declareFunction(myName, "implications_in", "IMPLICATIONS-IN", 1, 0, false);
    //declareFunction(myName, "undo_implications", "UNDO-IMPLICATIONS", 1, 0, false);
    //declareFunction(myName, "implicatable_disjunctionP", "IMPLICATABLE-DISJUNCTION?", 1, 0, false);
    //declareFunction(myName, "implicatable_conjunctionP", "IMPLICATABLE-CONJUNCTION?", 1, 0, false);
    //declareFunction(myName, "uncanon_dnf_1", "UNCANON-DNF-1", 1, 0, false);
    //declareFunction(myName, "naut_formulaP", "NAUT-FORMULA?", 1, 0, false);
    //declareFunction(myName, "ists_out", "ISTS-OUT", 1, 0, false);
    //declareFunction(myName, "simplifiable_ist_expressionP", "SIMPLIFIABLE-IST-EXPRESSION?", 1, 0, false);
    //declareFunction(myName, "simplify_ist_expression", "SIMPLIFY-IST-EXPRESSION", 1, 0, false);
    //declareFunction(myName, "remove_leading_universals", "REMOVE-LEADING-UNIVERSALS", 1, 0, false);
    //declareFunction(myName, "sentence_free_vars_not_bound_to_skolems", "SENTENCE-FREE-VARS-NOT-BOUND-TO-SKOLEMS", 1, 1, false);
    //declareFunction(myName, "add_universal_var_placeholder", "ADD-UNIVERSAL-VAR-PLACEHOLDER", 1, 0, false);
    //declareFunction(myName, "check_for_universal_var_placeholder", "CHECK-FOR-UNIVERSAL-VAR-PLACEHOLDER", 1, 0, false);
    //declareFunction(myName, "remove_universal_var_placeholder", "REMOVE-UNIVERSAL-VAR-PLACEHOLDER", 1, 0, false);
    //declareFunction(myName, "skolem_fn_arg_vars", "SKOLEM-FN-ARG-VARS", 1, 0, false);
    //declareFunction(myName, "formula_unreified_skolems", "FORMULA-UNREIFIED-SKOLEMS", 1, 0, false);
    //declareFunction(myName, "universal_vars_to_skolem_table", "UNIVERSAL-VARS-TO-SKOLEM-TABLE", 1, 1, false);
    //declareFunction(myName, "remove_skolem_from_universal_vars_to_skolem", "REMOVE-SKOLEM-FROM-UNIVERSAL-VARS-TO-SKOLEM", 1, 0, false);
    //declareFunction(myName, "num_args_of_skolem_fn", "NUM-ARGS-OF-SKOLEM-FN", 1, 0, false);
    //declareFunction(myName, "order_skolems_inner_to_outer", "ORDER-SKOLEMS-INNER-TO-OUTER", 1, 0, false);
    //declareFunction(myName, "nsubst_hl_vars", "NSUBST-HL-VARS", 2, 0, false);
    //declareFunction(myName, "unreify_cnfs_nats", "UNREIFY-CNFS-NATS", 1, 2, false);
    //declareFunction(myName, "gather_skolem_constants", "GATHER-SKOLEM-CONSTANTS", 1, 1, false);
    //declareFunction(myName, "unreify_cnfs_terms", "UNREIFY-CNFS-TERMS", 1, 2, false);
    //declareFunction(myName, "unreify_cnfs_assertions", "UNREIFY-CNFS-ASSERTIONS", 1, 1, false);
    //declareFunction(myName, "wrapped_assertion_el_formula_wrt_mt", "WRAPPED-ASSERTION-EL-FORMULA-WRT-MT", 1, 0, false);
    //declareFunction(myName, "subst_index_in", "SUBST-INDEX-IN", 2, 0, false);
    //declareFunction(myName, "unreify_cnfs_skolem", "UNREIFY-CNFS-SKOLEM", 3, 0, false);
    //declareFunction(myName, "expression_subst_skolem", "EXPRESSION-SUBST-SKOLEM", 3, 1, false);
    //declareFunction(myName, "sk_fn_arg_wrt", "SK-FN-ARG-WRT", 2, 2, false);
    //declareFunction(myName, "sk_var_wrt", "SK-VAR-WRT", 2, 2, false);
    //declareFunction(myName, "skolem_uniquify", "SKOLEM-UNIQUIFY", 1, 0, false);
    //declareFunction(myName, "ununiquify_el_var", "UNUNIQUIFY-EL-VAR", 1, 0, false);
    //declareFunction(myName, "remember_ununiquified_el_var", "REMEMBER-UNUNIQUIFIED-EL-VAR", 2, 0, false);
    //declareFunction(myName, "ununiquification_conflictP", "UNUNIQUIFICATION-CONFLICT?", 2, 0, false);
    //declareFunction(myName, "skolem_el_cnfs_from_assertions", "SKOLEM-EL-CNFS-FROM-ASSERTIONS", 3, 0, false);
    //declareFunction(myName, "possibly_make_ist_sentence", "POSSIBLY-MAKE-IST-SENTENCE", 3, 0, false);
    //declareFunction(myName, "assertions_in_same_mtP", "ASSERTIONS-IN-SAME-MT?", 1, 0, false);
    //declareFunction(myName, "el_cnfs", "EL-CNFS", 1, 2, false);
    //declareFunction(myName, "repair_assertion_vars", "REPAIR-ASSERTION-VARS", 1, 0, false);
    //declareFunction(myName, "index_lits_to_remove", "INDEX-LITS-TO-REMOVE", 1, 0, false);
    //declareFunction(myName, "tou_lits_to_remove", "TOU-LITS-TO-REMOVE", 1, 0, false);
    //declareFunction(myName, "evaluate_lits_to_remove", "EVALUATE-LITS-TO-REMOVE", 1, 0, false);
    //declareFunction(myName, "variable_should_not_be_substituted_during_unczeP", "VARIABLE-SHOULD-NOT-BE-SUBSTITUTED-DURING-UNCZE?", 2, 0, false);
    //declareFunction(myName, "equals_lits_to_remove", "EQUALS-LITS-TO-REMOVE", 1, 0, false);
    //declareFunction(myName, "uncanonicalize_recursive_query", "UNCANONICALIZE-RECURSIVE-QUERY", 1, 0, false);
    //declareFunction(myName, "uncanonicalize_recursive_query_vars", "UNCANONICALIZE-RECURSIVE-QUERY-VARS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_uncanonicalizer_file() {
    $ununiquified_el_vars$ = defparameter("*UNUNIQUIFIED-EL-VARS*", NIL);
    $cache_el_formulaP$ = defparameter("*CACHE-EL-FORMULA?*", NIL);
    $potentially_interestingly_uncanonicalizable_tense_terms$ = deflexical("*POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERMS*", $list29);
    $cached_assertion_el_formula_int_caching_state$ = deflexical("*CACHED-ASSERTION-EL-FORMULA-INT-CACHING-STATE*", NIL);
    $retain_leading_universals$ = defparameter("*RETAIN-LEADING-UNIVERSALS*", NIL);
    $vars_to_universalize$ = defparameter("*VARS-TO-UNIVERSALIZE*", NIL);
    $universal_vars_to_skolem$ = defparameter("*UNIVERSAL-VARS-TO-SKOLEM*", NIL);
    $uncanonicalizer_dnf_threshold$ = defparameter("*UNCANONICALIZER-DNF-THRESHOLD*", FIVE_INTEGER);
    $default_skolem_vars$ = deflexical("*DEFAULT-SKOLEM-VARS*", $list103);
    return NIL;
  }

  public static final SubLObject setup_uncanonicalizer_file() {
    // CVS_ID("Id: uncanonicalizer.lisp 127877 2009-05-27 15:07:45Z pace ");
    memoization_state.note_memoized_function($sym7$ASSERTION_EL_FORMULA_MEMOIZED);
    utilities_macros.register_cyc_api_function($sym12$ASSERTION_EL_FORMULA, $list13, $str14$Return_the_EL_formula_for_ASSERTI, $list15, $list16);
    utilities_macros.register_cyc_api_function($sym17$ASSERTION_EL_IST_FORMULA, $list13, $str18$Return_the_el_formula_in___ist_fo, $list15, $list19);
    memoization_state.note_globally_cached_function($sym30$CACHED_ASSERTION_EL_FORMULA_INT);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("CNF"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$CLET = makeSymbol("CLET");
  public static final SubLList $list2 = list(list(makeSymbol("*UNUNIQUIFIED-EL-VARS*"), list(makeSymbol("NEW-DICTIONARY"))));
  public static final SubLSymbol $sym3$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym4$VAR = makeSymbol("VAR");
  public static final SubLSymbol $sym5$CLAUSE_VARIABLES = makeSymbol("CLAUSE-VARIABLES");
  public static final SubLList $list6 = list(list(makeSymbol("REMEMBER-UNUNIQUIFIED-EL-VAR"), makeSymbol("VAR"), makeSymbol("VAR")));
  public static final SubLSymbol $sym7$ASSERTION_EL_FORMULA_MEMOIZED = makeSymbol("ASSERTION-EL-FORMULA-MEMOIZED");
  public static final SubLSymbol $kw8$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym9$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym10$SKOLEM_FUNCTION_P = makeSymbol("SKOLEM-FUNCTION-P");
  public static final SubLSymbol $sym11$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $sym12$ASSERTION_EL_FORMULA = makeSymbol("ASSERTION-EL-FORMULA");
  public static final SubLList $list13 = list(makeSymbol("ASSERTION"));
  public static final SubLString $str14$Return_the_EL_formula_for_ASSERTI = makeString("Return the EL formula for ASSERTION.  Does uncanonicalization, and converts HL terms to EL.");
  public static final SubLList $list15 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")));
  public static final SubLList $list16 = list(makeSymbol("LISTP"));
  public static final SubLSymbol $sym17$ASSERTION_EL_IST_FORMULA = makeSymbol("ASSERTION-EL-IST-FORMULA");
  public static final SubLString $str18$Return_the_el_formula_in___ist_fo = makeString("Return the el formula in #$ist format for ASSERTION.");
  public static final SubLList $list19 = list(makeSymbol("CONSP"));
  public static final SubLSymbol $sym20$FAST_FI_NOT_EL_TERM_ = makeSymbol("FAST-FI-NOT-EL-TERM?");
  public static final SubLSymbol $sym21$FAST_REIFIED_SKOLEM_ = makeSymbol("FAST-REIFIED-SKOLEM?");
  public static final SubLSymbol $sym22$POTENTIALLY_INTERESTINGLY_UNCANONICALIZABLE_TENSE_TERM_ = makeSymbol("POTENTIALLY-INTERESTINGLY-UNCANONICALIZABLE-TENSE-TERM?");
  public static final SubLSymbol $sym23$QUOTED_TERM_WITH_HL_VAR_ = makeSymbol("QUOTED-TERM-WITH-HL-VAR?");
  public static final SubLObject $const24$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLObject $const25$evaluate = constant_handles.reader_make_constant_shell(makeString("evaluate"));
  public static final SubLObject $const26$equals = constant_handles.reader_make_constant_shell(makeString("equals"));
  public static final SubLObject $const27$SkolemFunctionFn = constant_handles.reader_make_constant_shell(makeString("SkolemFunctionFn"));
  public static final SubLObject $const28$trueSentence = constant_handles.reader_make_constant_shell(makeString("trueSentence"));
  public static final SubLList $list29 = list(constant_handles.reader_make_constant_shell(makeString("IntervalEndedByFn")), constant_handles.reader_make_constant_shell(makeString("IntervalStartedByFn")));
  public static final SubLSymbol $sym30$CACHED_ASSERTION_EL_FORMULA_INT = makeSymbol("CACHED-ASSERTION-EL-FORMULA-INT");
  public static final SubLSymbol $sym31$_CACHED_ASSERTION_EL_FORMULA_INT_CACHING_STATE_ = makeSymbol("*CACHED-ASSERTION-EL-FORMULA-INT-CACHING-STATE*");
  public static final SubLInteger $int32$1024 = makeInteger(1024);
  public static final SubLSymbol $kw33$FALSE = makeKeyword("FALSE");
  public static final SubLList $list34 = list(makeKeyword("TREE-FIND"), list(constant_handles.reader_make_constant_shell(makeString("UncanonicalizerAssertionFn")), list(constant_handles.reader_make_constant_shell(makeString("SubLQuoteFn")), list(makeKeyword("BIND"), makeSymbol("EL-FORMULA")))));
  public static final SubLSymbol $sym35$EL_FORMULA = makeSymbol("EL-FORMULA");
  public static final SubLObject $const36$UncanonicalizerAssertionFn = constant_handles.reader_make_constant_shell(makeString("UncanonicalizerAssertionFn"));
  public static final SubLObject $const37$SubLQuoteFn = constant_handles.reader_make_constant_shell(makeString("SubLQuoteFn"));
  public static final SubLSymbol $sym38$INDEX_LITS_TO_REMOVE = makeSymbol("INDEX-LITS-TO-REMOVE");
  public static final SubLSymbol $sym39$DNF_LITERALS = makeSymbol("DNF-LITERALS");
  public static final SubLSymbol $sym40$CLAUSE_FROM_EL_LITERALS = makeSymbol("CLAUSE-FROM-EL-LITERALS");
  public static final SubLSymbol $sym41$CNF_LITERALS = makeSymbol("CNF-LITERALS");
  public static final SubLObject $const42$meetsPragmaticRequirement = constant_handles.reader_make_constant_shell(makeString("meetsPragmaticRequirement"));
  public static final SubLList $list43 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));
  public static final SubLList $list44 = list(makeSymbol("PRAG-PRED"), makeSymbol("VAR-LIST"), makeSymbol("ASSERTION"));
  public static final SubLSymbol $sym45$NEGATE = makeSymbol("NEGATE");
  public static final SubLObject $const46$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLObject $const47$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLObject $const48$pragmaticRequirement = constant_handles.reader_make_constant_shell(makeString("pragmaticRequirement"));
  public static final SubLObject $const49$abnormal = constant_handles.reader_make_constant_shell(makeString("abnormal"));
  public static final SubLList $list50 = list(makeSymbol("AB-PRED"), makeSymbol("EXCEPTION-LIST"), makeSymbol("ASSERTION"));
  public static final SubLSymbol $sym51$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLObject $const52$exceptFor = constant_handles.reader_make_constant_shell(makeString("exceptFor"));
  public static final SubLObject $const53$exceptWhen = constant_handles.reader_make_constant_shell(makeString("exceptWhen"));
  public static final SubLSymbol $sym54$NEG_LITS = makeSymbol("NEG-LITS");
  public static final SubLObject $const55$implies = constant_handles.reader_make_constant_shell(makeString("implies"));
  public static final SubLSymbol $sym56$NEGATE_ATOMIC = makeSymbol("NEGATE-ATOMIC");
  public static final SubLSymbol $sym57$REMOVE_TRUESENTENCE_REFS = makeSymbol("REMOVE-TRUESENTENCE-REFS");
  public static final SubLList $list58 = list(makeSymbol("QUANTIFIER"), makeSymbol("VAR"), makeSymbol("SUBSENT"));
  public static final SubLList $list59 = list(makeSymbol("QUANTIFIER"), makeSymbol("N"), makeSymbol("VAR"), makeSymbol("SUBSENT"));
  public static final SubLList $list60 = list(makeSymbol("NEG-FORM"), makeSymbol("NEW-FORMULA"));
  public static final SubLString $str61$unanticipated_formula___s = makeString("unanticipated formula: ~s");
  public static final SubLSymbol $sym62$TRUE_SENTENCE_VARS = makeSymbol("TRUE-SENTENCE-VARS");
  public static final SubLSymbol $sym63$UNDO_VARIABLES = makeSymbol("UNDO-VARIABLES");
  public static final SubLString $str64$_S_is_not_well_formed_ = makeString("~S is not well formed.");
  public static final SubLObject $const65$forAll = constant_handles.reader_make_constant_shell(makeString("forAll"));
  public static final SubLSymbol $sym66$UNREMOVE_UNIVERSALS_INT = makeSymbol("UNREMOVE-UNIVERSALS-INT");
  public static final SubLObject $const67$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
  public static final SubLSymbol $sym68$UNREIFIED_SKOLEM_TERM_ = makeSymbol("UNREIFIED-SKOLEM-TERM?");
  public static final SubLSymbol $sym69$UNDO_EXISTENTIALS_AND_REFD_UNIVERSALS = makeSymbol("UNDO-EXISTENTIALS-AND-REFD-UNIVERSALS");
  public static final SubLObject $const70$thereExists = constant_handles.reader_make_constant_shell(makeString("thereExists"));
  public static final SubLObject $const71$IntervalMinFn = constant_handles.reader_make_constant_shell(makeString("IntervalMinFn"));
  public static final SubLObject $const72$thereExistAtLeast = constant_handles.reader_make_constant_shell(makeString("thereExistAtLeast"));
  public static final SubLObject $const73$IntervalMaxFn = constant_handles.reader_make_constant_shell(makeString("IntervalMaxFn"));
  public static final SubLObject $const74$thereExistAtMost = constant_handles.reader_make_constant_shell(makeString("thereExistAtMost"));
  public static final SubLObject $const75$Integer = constant_handles.reader_make_constant_shell(makeString("Integer"));
  public static final SubLObject $const76$thereExistExactly = constant_handles.reader_make_constant_shell(makeString("thereExistExactly"));
  public static final SubLObject $const77$Unity = constant_handles.reader_make_constant_shell(makeString("Unity"));
  public static final SubLList $list78 = list(makeSymbol("UNIT"), makeSymbol("MIN"), makeSymbol("MAX"));
  public static final SubLObject $const79$PlusInfinity = constant_handles.reader_make_constant_shell(makeString("PlusInfinity"));
  public static final SubLObject $const80$or = constant_handles.reader_make_constant_shell(makeString("or"));
  public static final SubLSymbol $sym81$UNDO_IMPLICATIONS = makeSymbol("UNDO-IMPLICATIONS");
  public static final SubLSymbol $sym82$UNCANON_DNF_1 = makeSymbol("UNCANON-DNF-1");
  public static final SubLString $str83$_s_is_not_well_formed_ = makeString("~s is not well formed.");
  public static final SubLSymbol $sym84$IST_SENTENCE_P = makeSymbol("IST-SENTENCE-P");
  public static final SubLSymbol $sym85$SIMPLIFIABLE_IST_EXPRESSION_ = makeSymbol("SIMPLIFIABLE-IST-EXPRESSION?");
  public static final SubLSymbol $sym86$SIMPLIFY_IST_EXPRESSION = makeSymbol("SIMPLIFY-IST-EXPRESSION");
  public static final SubLSymbol $kw87$IGNORE = makeKeyword("IGNORE");
  public static final SubLString $str88$unable_to_simplify___ist_expressi = makeString("unable to simplify #$ist expression ~s");
  public static final SubLSymbol $sym89$REMOVE_LEADING_UNIVERSALS = makeSymbol("REMOVE-LEADING-UNIVERSALS");
  public static final SubLSymbol $sym90$SKOLEM_FUNCTION_VAR = makeSymbol("SKOLEM-FUNCTION-VAR");
  public static final SubLSymbol $sym91$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLSymbol $sym92$SKOLEM_NUMBER = makeSymbol("SKOLEM-NUMBER");
  public static final SubLSymbol $sym93$_ = makeSymbol(">");
  public static final SubLSymbol $sym94$NUM_ARGS_OF_SKOLEM_FN = makeSymbol("NUM-ARGS-OF-SKOLEM-FN");
  public static final SubLSymbol $sym95$TERM_OF_UNIT = makeSymbol("TERM-OF-UNIT");
  public static final SubLSymbol $sym96$SKOLEM_CONSTANT_ = makeSymbol("SKOLEM-CONSTANT?");
  public static final SubLSymbol $sym97$NART_P = makeSymbol("NART-P");
  public static final SubLSymbol $sym98$REIFIED_SKOLEM_CONSTANT_TERM_ = makeSymbol("REIFIED-SKOLEM-CONSTANT-TERM?");
  public static final SubLSymbol $sym99$FIND_NART = makeSymbol("FIND-NART");
  public static final SubLSymbol $sym100$KB_ASSERTION_ = makeSymbol("KB-ASSERTION?");
  public static final SubLSymbol $sym101$WRAPPED_ASSERTION_EL_FORMULA_WRT_MT = makeSymbol("WRAPPED-ASSERTION-EL-FORMULA-WRT-MT");
  public static final SubLSymbol $sym102$OPAQUE_ARG_WRT_SKOLEM_ = makeSymbol("OPAQUE-ARG-WRT-SKOLEM?");
  public static final SubLList $list103 = list(makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z"), makeSymbol("?A"), makeSymbol("?B"), makeSymbol("?C"), makeSymbol("?D"), makeSymbol("?E"));
  public static final SubLSymbol $sym104$VARIABLE_BINDING_VARIABLE = makeSymbol("VARIABLE-BINDING-VARIABLE");
  public static final SubLSymbol $sym105$DIGIT_CHAR_P = makeSymbol("DIGIT-CHAR-P");
  public static final SubLSymbol $sym106$NOT_DIGIT_CHAR_P = makeSymbol("NOT-DIGIT-CHAR-P");
  public static final SubLSymbol $kw107$UNUNUNIQUIFIABLE = makeKeyword("UNUNUNIQUIFIABLE");
  public static final SubLSymbol $sym108$NAT_FUNCTOR = makeSymbol("NAT-FUNCTOR");
  public static final SubLSymbol $sym109$LITERAL_ARG1 = makeSymbol("LITERAL-ARG1");
  public static final SubLSymbol $sym110$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLSymbol $sym111$DEFAULT_EL_VAR_FOR_HL_VAR = makeSymbol("DEFAULT-EL-VAR-FOR-HL-VAR");

  //// Initializers

  public void declareFunctions() {
    declare_uncanonicalizer_file();
  }

  public void initializeVariables() {
    init_uncanonicalizer_file();
  }

  public void runTopLevelForms() {
    setup_uncanonicalizer_file();
  }

}
