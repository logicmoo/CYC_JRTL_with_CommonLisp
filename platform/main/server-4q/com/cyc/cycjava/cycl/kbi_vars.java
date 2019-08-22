/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      KBI-VARS
 *  source file: /cyc/top/cycl/kbi-vars.lisp
 *  created:     2019/07/03 17:37:19
 */
public final class kbi_vars extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kbi_vars() {
    }

    public static final SubLFile me = new kbi_vars();


























    // defparameter
    public static final SubLSymbol $within_kbi_sweepP$ = makeSymbol("*WITHIN-KBI-SWEEP?*");







    // defparameter
    public static final SubLSymbol $kbi_disable_selection_filtersP$ = makeSymbol("*KBI-DISABLE-SELECTION-FILTERS?*");

    // defparameter
    public static final SubLSymbol $kbi_print_idsP$ = makeSymbol("*KBI-PRINT-IDS?*");

    // defparameter
    public static final SubLSymbol $kbi_print_whyP$ = makeSymbol("*KBI-PRINT-WHY?*");

    // defparameter
    public static final SubLSymbol $kbi_print_note_fn$ = makeSymbol("*KBI-PRINT-NOTE-FN*");

    // defparameter
    public static final SubLSymbol $kbi_print_note$ = makeSymbol("*KBI-PRINT-NOTE*");

    // defparameter
    public static final SubLSymbol $kbi_directory$ = makeSymbol("*KBI-DIRECTORY*");

    // defparameter
    public static final SubLSymbol $kbi_print_nilsP$ = makeSymbol("*KBI-PRINT-NILS?*");













    // defparameter
    public static final SubLSymbol $kbi_resuming_fort_diagnostic_sweepP$ = makeSymbol("*KBI-RESUMING-FORT-DIAGNOSTIC-SWEEP?*");



    // defparameter
    public static final SubLSymbol $kbi_resuming_constant_diagnostic_sweepP$ = makeSymbol("*KBI-RESUMING-CONSTANT-DIAGNOSTIC-SWEEP?*");





    // defparameter
    public static final SubLSymbol $isa_sbhlXkb_mismatch_constants$ = makeSymbol("*ISA-SBHL/KB-MISMATCH-CONSTANTS*");

    // defparameter
    public static final SubLSymbol $superiors_sbhlXkb_mismatch_constants$ = makeSymbol("*SUPERIORS-SBHL/KB-MISMATCH-CONSTANTS*");

    // defparameter
    public static final SubLSymbol $inferiors_sbhlXkb_mismatch_constants$ = makeSymbol("*INFERIORS-SBHL/KB-MISMATCH-CONSTANTS*");



    // defparameter
    public static final SubLSymbol $kbi_resuming_assertion_diagnostic_sweepP$ = makeSymbol("*KBI-RESUMING-ASSERTION-DIAGNOSTIC-SWEEP?*");

    // defparameter
    public static final SubLSymbol $find_assertions_wXo_mtP$ = makeSymbol("*FIND-ASSERTIONS-W/O-MT?*");

    // defparameter
    public static final SubLSymbol $assertions_wXo_mt$ = makeSymbol("*ASSERTIONS-W/O-MT*");

    // defparameter
    public static final SubLSymbol $find_assertions_wXo_valid_idP$ = makeSymbol("*FIND-ASSERTIONS-W/O-VALID-ID?*");

    // defparameter
    public static final SubLSymbol $assertions_wXo_valid_id$ = makeSymbol("*ASSERTIONS-W/O-VALID-ID*");

    // defparameter
    public static final SubLSymbol $find_assertions_wXo_tvP$ = makeSymbol("*FIND-ASSERTIONS-W/O-TV?*");

    // defparameter
    public static final SubLSymbol $assertions_wXo_tv$ = makeSymbol("*ASSERTIONS-W/O-TV*");

    // defparameter
    public static final SubLSymbol $find_assertions_wXo_directionP$ = makeSymbol("*FIND-ASSERTIONS-W/O-DIRECTION?*");

    // defparameter
    public static final SubLSymbol $assertions_wXo_direction$ = makeSymbol("*ASSERTIONS-W/O-DIRECTION*");

    // defparameter
    public static final SubLSymbol $find_assertions_wXo_valid_var_namesP$ = makeSymbol("*FIND-ASSERTIONS-W/O-VALID-VAR-NAMES?*");

    // defparameter
    public static final SubLSymbol $assertions_wXo_valid_var_names$ = makeSymbol("*ASSERTIONS-W/O-VALID-VAR-NAMES*");

    // defparameter
    public static final SubLSymbol $find_assertions_wXo_prefered_var_namesP$ = makeSymbol("*FIND-ASSERTIONS-W/O-PREFERED-VAR-NAMES?*");

    // defparameter
    public static final SubLSymbol $assertions_wXo_prefered_var_names$ = makeSymbol("*ASSERTIONS-W/O-PREFERED-VAR-NAMES*");

    // defparameter
    public static final SubLSymbol $find_assertions_wXo_sourceP$ = makeSymbol("*FIND-ASSERTIONS-W/O-SOURCE?*");

    // defparameter
    public static final SubLSymbol $assertions_wXo_source$ = makeSymbol("*ASSERTIONS-W/O-SOURCE*");

    // defparameter
    public static final SubLSymbol $find_assertions_wXmal_sourcesP$ = makeSymbol("*FIND-ASSERTIONS-W/MAL-SOURCES?*");

    // defparameter
    public static final SubLSymbol $assertions_wXmal_sources$ = makeSymbol("*ASSERTIONS-W/MAL-SOURCES*");

    // defparameter
    public static final SubLSymbol $find_assertions_misindexedP$ = makeSymbol("*FIND-ASSERTIONS-MISINDEXED?*");



    // defparameter
    public static final SubLSymbol $find_assertions_redundant_wrt_mtP$ = makeSymbol("*FIND-ASSERTIONS-REDUNDANT-WRT-MT?*");



    // defparameter
    public static final SubLSymbol $find_assertion_duplicatesP$ = makeSymbol("*FIND-ASSERTION-DUPLICATES?*");



    // defparameter
    public static final SubLSymbol $find_assertions_redundant_wrt_isaP$ = makeSymbol("*FIND-ASSERTIONS-REDUNDANT-WRT-ISA?*");



    // defparameter
    public static final SubLSymbol $find_assertions_non_constant_arg_isa_wXo_defnsP$ = makeSymbol("*FIND-ASSERTIONS-NON-CONSTANT-ARG-ISA-W/O-DEFNS?*");

    // defparameter
    public static final SubLSymbol $assertions_non_constant_arg_isa_wXo_defns$ = makeSymbol("*ASSERTIONS-NON-CONSTANT-ARG-ISA-W/O-DEFNS*");

    // defparameter
    public static final SubLSymbol $find_assertions_not_canonicalP$ = makeSymbol("*FIND-ASSERTIONS-NOT-CANONICAL?*");



    // defparameter
    public static final SubLSymbol $find_assertions_not_accessibleP$ = makeSymbol("*FIND-ASSERTIONS-NOT-ACCESSIBLE?*");



    // defparameter
    public static final SubLSymbol $find_assertions_not_wffP$ = makeSymbol("*FIND-ASSERTIONS-NOT-WFF?*");



    // defparameter
    public static final SubLSymbol $find_assertions_inform_mising_istP$ = makeSymbol("*FIND-ASSERTIONS-INFORM-MISING-IST?*");



    // defparameter
    public static final SubLSymbol $find_assertions_wXmal_doc_stringP$ = makeSymbol("*FIND-ASSERTIONS-W/MAL-DOC-STRING?*");

    // defparameter
    public static final SubLSymbol $assertions_wXmal_doc_string$ = makeSymbol("*ASSERTIONS-W/MAL-DOC-STRING*");

    // defparameter
    public static final SubLSymbol $find_assertions_wXatomic_neg_litP$ = makeSymbol("*FIND-ASSERTIONS-W/ATOMIC-NEG-LIT?*");

    // defparameter
    public static final SubLSymbol $assertions_wXatomic_neg_lit$ = makeSymbol("*ASSERTIONS-W/ATOMIC-NEG-LIT*");

    // defparameter
    public static final SubLSymbol $diagnose_assertion_axiomP$ = makeSymbol("*DIAGNOSE-ASSERTION-AXIOM?*");

    // defparameter
    public static final SubLSymbol $assertions_wXaxioms_diagnosis$ = makeSymbol("*ASSERTIONS-W/AXIOMS-DIAGNOSIS*");

    // defparameter
    public static final SubLSymbol $diagnose_assertion_sourcesP$ = makeSymbol("*DIAGNOSE-ASSERTION-SOURCES?*");

    // defparameter
    public static final SubLSymbol $assertions_wXsource_diagnosis$ = makeSymbol("*ASSERTIONS-W/SOURCE-DIAGNOSIS*");



    // defparameter
    public static final SubLSymbol $kbi_resuming_axiom_diagnostic_sweepP$ = makeSymbol("*KBI-RESUMING-AXIOM-DIAGNOSTIC-SWEEP?*");



    // defparameter
    public static final SubLSymbol $kbi_resuming_cnf_diagnostic_sweepP$ = makeSymbol("*KBI-RESUMING-CNF-DIAGNOSTIC-SWEEP?*");



    // defparameter
    public static final SubLSymbol $kbi_iXo_mode$ = makeSymbol("*KBI-I/O-MODE*");



    // defparameter
    public static final SubLSymbol $kbi_caching_findingsP$ = makeSymbol("*KBI-CACHING-FINDINGS?*");

    // defparameter
    public static final SubLSymbol $kbi_repairing_findingsP$ = makeSymbol("*KBI-REPAIRING-FINDINGS?*");

    // defparameter
    public static final SubLSymbol $kbi_transmit_repairsP$ = makeSymbol("*KBI-TRANSMIT-REPAIRS?*");

    // defparameter
    public static final SubLSymbol $kbi_print_resultsP$ = makeSymbol("*KBI-PRINT-RESULTS?*");

    public static final SubLObject declare_kbi_vars_file() {
        return NIL;
    }

    public static final SubLObject init_kbi_vars_file() {
        defparameter("*KBI-MODULES*", NIL);
        defparameter("*KBI-MODULE-ATTRIBUTES*", NIL);
        defparameter("*KBI-ATTRIBUTE-ATTRIBUTES*", $list_alt4);
        defparameter("*KBI-DOMAINS*", NIL);
        defparameter("*KBI-DOMAIN-ATTRIBUTES*", NIL);
        defparameter("*KBI-MT*", $$BaseKB);
        defparameter("*KBI-LAST-DOMAIN*", NIL);
        defparameter("*KBI-RELEVANT-MT-FUNCTION*", NIL);
        defparameter("*KBI-ONLY-CONCERNS*", NIL);
        defparameter("*KBI-ONLY-CRITICALITIES*", NIL);
        defparameter("*KBI-SKIP-CONCERNS*", NIL);
        defparameter("*KBI-SKIP-CRITICALITIES*", NIL);
        defparameter("*WITHIN-KBI-SWEEP?*", NIL);
        defparameter("*KBI-SWEEP-SELECT-FN*", IDENTITY);
        defparameter("*KBI-LEVEL*", FIVE_INTEGER);
        defparameter("*KBI-ASSERTION*", NIL);
        defparameter("*KBI-DISABLE-SELECTION-FILTERS?*", NIL);
        defparameter("*KBI-PRINT-IDS?*", NIL);
        defparameter("*KBI-PRINT-WHY?*", T);
        defparameter("*KBI-PRINT-NOTE-FN*", NIL);
        defparameter("*KBI-PRINT-NOTE*", NIL);
        defparameter("*KBI-DIRECTORY*", NIL);
        defparameter("*KBI-PRINT-NILS?*", NIL);
        defparameter("*LAST-DIAGNOSTIC-DOMAIN*", NIL);
        defparameter("*KBI-DOMAIN-MODULES*", make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
        defparameter("*KBI-START-TIMES*", make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
        defparameter("*KBI-PROGRESS-COUNTS*", make_hash_table($int$32, UNPROVIDED, UNPROVIDED));
        defparameter("*KBI-ITEMS-TO-CONSIDER*", ZERO_INTEGER);
        defparameter("*KBI-LAST-FORT-CONSIDERED*", NIL);
        defparameter("*KBI-RESUMING-FORT-DIAGNOSTIC-SWEEP?*", NIL);
        defparameter("*KBI-LAST-CONSTANT-CONSIDERED*", NIL);
        defparameter("*KBI-RESUMING-CONSTANT-DIAGNOSTIC-SWEEP?*", NIL);
        defparameter("*DUPLICATE-SUPERIORS-SBHL-CONSTANTS*", NIL);
        defparameter("*DUPLICATE-INFERIORS-SBHL-CONSTANTS*", NIL);
        defparameter("*ISA-SBHL/KB-MISMATCH-CONSTANTS*", NIL);
        defparameter("*SUPERIORS-SBHL/KB-MISMATCH-CONSTANTS*", NIL);
        defparameter("*INFERIORS-SBHL/KB-MISMATCH-CONSTANTS*", NIL);
        defparameter("*KBI-LAST-ASSERTION-CONSIDERED*", NIL);
        defparameter("*KBI-RESUMING-ASSERTION-DIAGNOSTIC-SWEEP?*", NIL);
        defparameter("*FIND-ASSERTIONS-W/O-MT?*", T);
        defparameter("*ASSERTIONS-W/O-MT*", NIL);
        defparameter("*FIND-ASSERTIONS-W/O-VALID-ID?*", T);
        defparameter("*ASSERTIONS-W/O-VALID-ID*", NIL);
        defparameter("*FIND-ASSERTIONS-W/O-TV?*", T);
        defparameter("*ASSERTIONS-W/O-TV*", NIL);
        defparameter("*FIND-ASSERTIONS-W/O-DIRECTION?*", T);
        defparameter("*ASSERTIONS-W/O-DIRECTION*", NIL);
        defparameter("*FIND-ASSERTIONS-W/O-VALID-VAR-NAMES?*", T);
        defparameter("*ASSERTIONS-W/O-VALID-VAR-NAMES*", NIL);
        defparameter("*FIND-ASSERTIONS-W/O-PREFERED-VAR-NAMES?*", T);
        defparameter("*ASSERTIONS-W/O-PREFERED-VAR-NAMES*", NIL);
        defparameter("*FIND-ASSERTIONS-W/O-SOURCE?*", T);
        defparameter("*ASSERTIONS-W/O-SOURCE*", NIL);
        defparameter("*FIND-ASSERTIONS-W/MAL-SOURCES?*", T);
        defparameter("*ASSERTIONS-W/MAL-SOURCES*", NIL);
        defparameter("*FIND-ASSERTIONS-MISINDEXED?*", T);
        defparameter("*ASSERTIONS-MISINDEXED*", NIL);
        defparameter("*FIND-ASSERTIONS-REDUNDANT-WRT-MT?*", T);
        defparameter("*ASSERTIONS-REDUNDANT-WRT-MT*", NIL);
        defparameter("*FIND-ASSERTION-DUPLICATES?*", T);
        defparameter("*ASSERTION-DUPLICATES*", NIL);
        defparameter("*FIND-ASSERTIONS-REDUNDANT-WRT-ISA?*", T);
        defparameter("*ASSERTIONS-REDUNDANT-WRT-ISA*", NIL);
        defparameter("*FIND-ASSERTIONS-NON-CONSTANT-ARG-ISA-W/O-DEFNS?*", T);
        defparameter("*ASSERTIONS-NON-CONSTANT-ARG-ISA-W/O-DEFNS*", NIL);
        defparameter("*FIND-ASSERTIONS-NOT-CANONICAL?*", T);
        defparameter("*ASSERTIONS-NOT-CANONICAL*", NIL);
        defparameter("*FIND-ASSERTIONS-NOT-ACCESSIBLE?*", T);
        defparameter("*ASSERTIONS-NOT-ACCESSIBLE*", NIL);
        defparameter("*FIND-ASSERTIONS-NOT-WFF?*", T);
        defparameter("*ASSERTIONS-NOT-WFF*", NIL);
        defparameter("*FIND-ASSERTIONS-INFORM-MISING-IST?*", T);
        defparameter("*ASSERTIONS-INFORM-MISING-IST*", NIL);
        defparameter("*FIND-ASSERTIONS-W/MAL-DOC-STRING?*", T);
        defparameter("*ASSERTIONS-W/MAL-DOC-STRING*", NIL);
        defparameter("*FIND-ASSERTIONS-W/ATOMIC-NEG-LIT?*", T);
        defparameter("*ASSERTIONS-W/ATOMIC-NEG-LIT*", NIL);
        defparameter("*DIAGNOSE-ASSERTION-AXIOM?*", T);
        defparameter("*ASSERTIONS-W/AXIOMS-DIAGNOSIS*", NIL);
        defparameter("*DIAGNOSE-ASSERTION-SOURCES?*", T);
        defparameter("*ASSERTIONS-W/SOURCE-DIAGNOSIS*", NIL);
        defparameter("*KBI-LAST-AXIOM-CONSIDERED*", NIL);
        defparameter("*KBI-RESUMING-AXIOM-DIAGNOSTIC-SWEEP?*", NIL);
        defparameter("*KBI-LAST-CNF-CONSIDERED*", NIL);
        defparameter("*KBI-RESUMING-CNF-DIAGNOSTIC-SWEEP?*", NIL);
        defparameter("*KBI-TRACE-LEVEL*", ONE_INTEGER);
        defparameter("*KBI-I/O-MODE*", $NL);
        defparameter("*KBI-PREDICATE-TABLE*", make_hash_table($int$128, UNPROVIDED, UNPROVIDED));
        defparameter("*KBI-CACHING-FINDINGS?*", NIL);
        defparameter("*KBI-REPAIRING-FINDINGS?*", NIL);
        defparameter("*KBI-TRANSMIT-REPAIRS?*", NIL);
        defparameter("*KBI-PRINT-RESULTS?*", NIL);
        return NIL;
    }

    public static final SubLObject setup_kbi_vars_file() {
                {
            SubLObject item_var = $kbi_modules$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_modules$, $$$all_known_kbi_modules);
        {
            SubLObject item_var = $kbi_module_attributes$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_module_attributes$, $str_alt3$recognized_attributes_for_definin);
        {
            SubLObject item_var = $kbi_attribute_attributes$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_attribute_attributes$, $str_alt6$meta_attributes_used_to_specify_a);
        {
            SubLObject item_var = $kbi_domains$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_domains$, $str_alt8$types_of_objects_for_which_kbi_mo);
        {
            SubLObject item_var = $kbi_domain_attributes$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_domain_attributes$, $str_alt10$attributes_used_to_define_kbi_dom);
        {
            SubLObject item_var = $kbi_mt$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_mt$, $str_alt13$default_mt_for_kb_integrity_analy);
        mt_vars.note_mt_var($kbi_mt$, UNPROVIDED);
        {
            SubLObject item_var = $kbi_last_domain$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_last_domain$, $$$most_recent_domain_diagnosed);
        {
            SubLObject item_var = $kbi_relevant_mt_function$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_relevant_mt_function$, $str_alt17$relevant_mt_function_for_kb_integ);
        {
            SubLObject item_var = $kbi_only_concerns$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_only_concerns$, $str_alt19$only_these_modules_having_these_c);
        {
            SubLObject item_var = $kbi_only_criticalities$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_only_criticalities$, $str_alt21$only_these_modules_having_critica);
        {
            SubLObject item_var = $kbi_skip_concerns$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_skip_concerns$, $str_alt23$no_modules_having_these_these_con);
        {
            SubLObject item_var = $kbi_skip_criticalities$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_skip_criticalities$, $str_alt25$no_modules_having_these_criticali);
        {
            SubLObject item_var = $sym26$_WITHIN_KBI_SWEEP__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym26$_WITHIN_KBI_SWEEP__, $str_alt27$is_a_kbi_sweep_being_performed_);
        {
            SubLObject item_var = $kbi_sweep_select_fn$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_sweep_select_fn$, $str_alt29$select_function_applied_during_kb);
        {
            SubLObject item_var = $kbi_level$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_level$, $str_alt31$maximum_testing_level_for_kb_diag);
        {
            SubLObject item_var = $kbi_assertion$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_assertion$, $str_alt33$assertion_currently_being_diagnos);
        {
            SubLObject item_var = $sym34$_KBI_DISABLE_SELECTION_FILTERS__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym34$_KBI_DISABLE_SELECTION_FILTERS__, $str_alt35$should_kbi_modules_be_run_regardl);
        {
            SubLObject item_var = $last_diagnostic_domain$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($last_diagnostic_domain$, $str_alt37$domain_subject_of_the_most_recent);
        {
            SubLObject item_var = $kbi_domain_modules$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_domain_modules$, $$$table_of_kbi_modules_by_domain);
        {
            SubLObject item_var = $kbi_start_times$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_start_times$, $str_alt42$table_of_kbi_sweep_start_times_by);
        {
            SubLObject item_var = $kbi_progress_counts$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_progress_counts$, $str_alt44$table_of_items_considered_duing_c);
        {
            SubLObject item_var = $kbi_items_to_consider$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_items_to_consider$, $str_alt46$number_of_items_included_during_c);
        {
            SubLObject item_var = $kbi_last_fort_considered$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_last_fort_considered$, $str_alt48$id_of_most_recent_fort_considered);
        {
            SubLObject item_var = $sym49$_KBI_RESUMING_FORT_DIAGNOSTIC_SWEEP__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym49$_KBI_RESUMING_FORT_DIAGNOSTIC_SWEEP__, $str_alt50$continue_last_kbi_fort_diagnosis_);
        {
            SubLObject item_var = $kbi_last_constant_considered$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_last_constant_considered$, $str_alt52$id_of_most_recent_constant_consid);
        {
            SubLObject item_var = $sym53$_KBI_RESUMING_CONSTANT_DIAGNOSTIC_SWEEP__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym53$_KBI_RESUMING_CONSTANT_DIAGNOSTIC_SWEEP__, $str_alt54$continue_last_kbi_constant_diagno);
        {
            SubLObject item_var = $duplicate_superiors_sbhl_constants$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($duplicate_superiors_sbhl_constants$, $str_alt56$sbhl_constants__e_g___collections);
        {
            SubLObject item_var = $duplicate_inferiors_sbhl_constants$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($duplicate_inferiors_sbhl_constants$, $str_alt58$sbhl_constants__e_g___collections);
        {
            SubLObject item_var = $sym59$_ISA_SBHL_KB_MISMATCH_CONSTANTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym59$_ISA_SBHL_KB_MISMATCH_CONSTANTS_, $str_alt60$constants_s_t__sbhl_disagrees_wit);
        {
            SubLObject item_var = $sym61$_SUPERIORS_SBHL_KB_MISMATCH_CONSTANTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym61$_SUPERIORS_SBHL_KB_MISMATCH_CONSTANTS_, $str_alt62$sbhl_constants_s_t__sbhl_disagree);
        {
            SubLObject item_var = $sym63$_INFERIORS_SBHL_KB_MISMATCH_CONSTANTS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym63$_INFERIORS_SBHL_KB_MISMATCH_CONSTANTS_, $str_alt64$sbhl_constants_s_t__sbhl_disagree);
        {
            SubLObject item_var = $kbi_last_assertion_considered$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_last_assertion_considered$, $str_alt66$id_of_most_recent_assertion_consi);
        {
            SubLObject item_var = $sym67$_KBI_RESUMING_ASSERTION_DIAGNOSTIC_SWEEP__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym67$_KBI_RESUMING_ASSERTION_DIAGNOSTIC_SWEEP__, $str_alt68$continue_last_kbi_assertion_diagn);
        {
            SubLObject item_var = $sym69$_FIND_ASSERTIONS_W_O_MT__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym69$_FIND_ASSERTIONS_W_O_MT__, $str_alt70$include__assertion_w_o_mt_in_asse);
        {
            SubLObject item_var = $sym71$_ASSERTIONS_W_O_MT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym71$_ASSERTIONS_W_O_MT_, $str_alt72$assertions_with_missing__or_inval);
        {
            SubLObject item_var = $sym73$_FIND_ASSERTIONS_W_O_VALID_ID__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym73$_FIND_ASSERTIONS_W_O_VALID_ID__, $str_alt74$include__assertion_w_o_valid_id_i);
        {
            SubLObject item_var = $sym75$_ASSERTIONS_W_O_VALID_ID_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym75$_ASSERTIONS_W_O_VALID_ID_, $str_alt76$assertions_with_missing__or_inval);
        {
            SubLObject item_var = $sym77$_FIND_ASSERTIONS_W_O_TV__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym77$_FIND_ASSERTIONS_W_O_TV__, $str_alt78$include__assertion_w_o_tv_in_asse);
        {
            SubLObject item_var = $sym79$_ASSERTIONS_W_O_TV_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym79$_ASSERTIONS_W_O_TV_, $str_alt80$assertions_with_missing__or_inval);
        {
            SubLObject item_var = $sym81$_FIND_ASSERTIONS_W_O_DIRECTION__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym81$_FIND_ASSERTIONS_W_O_DIRECTION__, $str_alt82$include__assertion_w_o_direction_);
        {
            SubLObject item_var = $sym83$_ASSERTIONS_W_O_DIRECTION_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym83$_ASSERTIONS_W_O_DIRECTION_, $str_alt84$assertions_with_missing__or_inval);
        {
            SubLObject item_var = $sym85$_FIND_ASSERTIONS_W_O_VALID_VAR_NAMES__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym85$_FIND_ASSERTIONS_W_O_VALID_VAR_NAMES__, $str_alt86$include__assertion_w_o_valid_var_);
        {
            SubLObject item_var = $sym87$_ASSERTIONS_W_O_VALID_VAR_NAMES_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym87$_ASSERTIONS_W_O_VALID_VAR_NAMES_, $str_alt88$assertions_with_missing__or_inval);
        {
            SubLObject item_var = $sym89$_FIND_ASSERTIONS_W_O_PREFERED_VAR_NAMES__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym89$_FIND_ASSERTIONS_W_O_PREFERED_VAR_NAMES__, $str_alt90$include__assertion_w_o_prefered_v);
        {
            SubLObject item_var = $sym91$_ASSERTIONS_W_O_PREFERED_VAR_NAMES_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym91$_ASSERTIONS_W_O_PREFERED_VAR_NAMES_, $str_alt92$assertions_with_undesirable_varia);
        {
            SubLObject item_var = $sym93$_FIND_ASSERTIONS_W_O_SOURCE__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym93$_FIND_ASSERTIONS_W_O_SOURCE__, $str_alt94$include__assertion_w_o_source_in_);
        {
            SubLObject item_var = $sym95$_ASSERTIONS_W_O_SOURCE_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym95$_ASSERTIONS_W_O_SOURCE_, $$$assertions_with_no_source);
        {
            SubLObject item_var = $sym97$_FIND_ASSERTIONS_W_MAL_SOURCES__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym97$_FIND_ASSERTIONS_W_MAL_SOURCES__, $str_alt98$include__assertion_w_mal_sources_);
        {
            SubLObject item_var = $sym99$_ASSERTIONS_W_MAL_SOURCES_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym99$_ASSERTIONS_W_MAL_SOURCES_, $$$assertions_with_invalid_sources);
        {
            SubLObject item_var = $sym101$_FIND_ASSERTIONS_MISINDEXED__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym101$_FIND_ASSERTIONS_MISINDEXED__, $str_alt102$include__assertion_misindexed_in_);
        {
            SubLObject item_var = $assertions_misindexed$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertions_misindexed$, $str_alt104$assertions_that_are_missing_from_);
        {
            SubLObject item_var = $sym105$_FIND_ASSERTIONS_REDUNDANT_WRT_MT__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym105$_FIND_ASSERTIONS_REDUNDANT_WRT_MT__, $str_alt106$include__assertion_redundant_wrt_);
        {
            SubLObject item_var = $assertions_redundant_wrt_mt$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertions_redundant_wrt_mt$, $str_alt108$assertions_sharing_cnf_with_other);
        {
            SubLObject item_var = $sym109$_FIND_ASSERTION_DUPLICATES__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym109$_FIND_ASSERTION_DUPLICATES__, $str_alt110$include__assertion_duplicates_in_);
        {
            SubLObject item_var = $assertion_duplicates$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertion_duplicates$, $str_alt112$assertions_st_some_different_asse);
        {
            SubLObject item_var = $sym113$_FIND_ASSERTIONS_REDUNDANT_WRT_ISA__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym113$_FIND_ASSERTIONS_REDUNDANT_WRT_ISA__, $str_alt114$include__assertion_redundant_wrt_);
        {
            SubLObject item_var = $assertions_redundant_wrt_isa$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertions_redundant_wrt_isa$, $str_alt116$test_assertion_for_redundant___is);
        {
            SubLObject item_var = $sym117$_FIND_ASSERTIONS_NON_CONSTANT_ARG_ISA_W_O_DEFNS__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym117$_FIND_ASSERTIONS_NON_CONSTANT_ARG_ISA_W_O_DEFNS__, $str_alt118$include__assertion_non_constant_a);
        {
            SubLObject item_var = $sym119$_ASSERTIONS_NON_CONSTANT_ARG_ISA_W_O_DEFNS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym119$_ASSERTIONS_NON_CONSTANT_ARG_ISA_W_O_DEFNS_, $str_alt120$assertions_with_non_constant_args);
        {
            SubLObject item_var = $sym121$_FIND_ASSERTIONS_NOT_CANONICAL__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym121$_FIND_ASSERTIONS_NOT_CANONICAL__, $str_alt122$include__assertion_not_canonical_);
        {
            SubLObject item_var = $assertions_not_canonical$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertions_not_canonical$, $str_alt124$non_canonical_assertions);
        {
            SubLObject item_var = $sym125$_FIND_ASSERTIONS_NOT_ACCESSIBLE__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym125$_FIND_ASSERTIONS_NOT_ACCESSIBLE__, $str_alt126$include__assertion_not_accessible);
        {
            SubLObject item_var = $assertions_not_accessible$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertions_not_accessible$, $str_alt128$non_accessible_assertions);
        {
            SubLObject item_var = $sym129$_FIND_ASSERTIONS_NOT_WFF__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym129$_FIND_ASSERTIONS_NOT_WFF__, $str_alt130$include__assertion_not_wff_in_ass);
        {
            SubLObject item_var = $assertions_not_wff$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertions_not_wff$, $$$assertions_with_wff_violations);
        {
            SubLObject item_var = $sym133$_FIND_ASSERTIONS_INFORM_MISING_IST__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym133$_FIND_ASSERTIONS_INFORM_MISING_IST__, $str_alt134$include__assertion_inform_mising_);
        {
            SubLObject item_var = $assertions_inform_mising_ist$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($assertions_inform_mising_ist$, $str_alt136$__informStatement_assertions_w_o_);
        {
            SubLObject item_var = $sym137$_FIND_ASSERTIONS_W_MAL_DOC_STRING__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym137$_FIND_ASSERTIONS_W_MAL_DOC_STRING__, $str_alt138$include__assertion_w_mal_doc_stri);
        {
            SubLObject item_var = $sym139$_ASSERTIONS_W_MAL_DOC_STRING_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym139$_ASSERTIONS_W_MAL_DOC_STRING_, $str_alt140$assertions_w_mal_documentation_st);
        {
            SubLObject item_var = $sym141$_FIND_ASSERTIONS_W_ATOMIC_NEG_LIT__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym141$_FIND_ASSERTIONS_W_ATOMIC_NEG_LIT__, $str_alt142$include__assertion_w_atomic_neg_l);
        {
            SubLObject item_var = $sym143$_ASSERTIONS_W_ATOMIC_NEG_LIT_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym143$_ASSERTIONS_W_ATOMIC_NEG_LIT_, $str_alt144$assertions_of_negated_atomic_sent);
        {
            SubLObject item_var = $sym145$_DIAGNOSE_ASSERTION_AXIOM__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym145$_DIAGNOSE_ASSERTION_AXIOM__, $str_alt146$include__diagnose_assertions_axio);
        {
            SubLObject item_var = $sym147$_ASSERTIONS_W_AXIOMS_DIAGNOSIS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym147$_ASSERTIONS_W_AXIOMS_DIAGNOSIS_, $str_alt148$assertions_with_axiom_diagnostic_);
        {
            SubLObject item_var = $sym149$_DIAGNOSE_ASSERTION_SOURCES__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym149$_DIAGNOSE_ASSERTION_SOURCES__, $str_alt150$include__diagnose_assertion_sourc);
        {
            SubLObject item_var = $sym151$_ASSERTIONS_W_SOURCE_DIAGNOSIS_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym151$_ASSERTIONS_W_SOURCE_DIAGNOSIS_, $str_alt152$assertions_with_source_diagnostic);
        {
            SubLObject item_var = $kbi_last_axiom_considered$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_last_axiom_considered$, $str_alt154$id_of_most_recent_axiom_considere);
        {
            SubLObject item_var = $sym155$_KBI_RESUMING_AXIOM_DIAGNOSTIC_SWEEP__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym155$_KBI_RESUMING_AXIOM_DIAGNOSTIC_SWEEP__, $str_alt156$continue_last_kbi_axiom_diagnosis);
        {
            SubLObject item_var = $kbi_last_cnf_considered$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_last_cnf_considered$, $str_alt158$id_of_most_recent_assertions_cons);
        {
            SubLObject item_var = $sym159$_KBI_RESUMING_CNF_DIAGNOSTIC_SWEEP__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym159$_KBI_RESUMING_CNF_DIAGNOSTIC_SWEEP__, $str_alt160$continue_last_kbi_cnf_diagnosis_s);
        {
            SubLObject item_var = $kbi_trace_level$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_trace_level$, $str_alt162$controls_extent_of_tracing__warni);
        {
            SubLObject item_var = $sym164$_KBI_I_O_MODE_;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym164$_KBI_I_O_MODE_, $str_alt165$communication_mode_for_kbi_i_o__e);
        {
            SubLObject item_var = $kbi_predicate_table$;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($kbi_predicate_table$, $str_alt168$Used_internally_by_kbi_constant_p);
        {
            SubLObject item_var = $sym169$_KBI_CACHING_FINDINGS__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym169$_KBI_CACHING_FINDINGS__, $str_alt170$should_kbi_findings_be_saved_);
        {
            SubLObject item_var = $sym171$_KBI_REPAIRING_FINDINGS__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym171$_KBI_REPAIRING_FINDINGS__, $str_alt172$should_kbi_findings_be_repaired_);
        {
            SubLObject item_var = $sym173$_KBI_TRANSMIT_REPAIRS__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym173$_KBI_TRANSMIT_REPAIRS__, $str_alt174$should_kbi_repairs_be_transmitted);
        {
            SubLObject item_var = $sym175$_KBI_PRINT_RESULTS__;
            if (NIL == member(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                utilities_macros.$kbi_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbi_state_variables$.getGlobalValue()));
            }
        }
        utilities_macros.note_state_variable_documentation($sym175$_KBI_PRINT_RESULTS__, $str_alt176$should_kbi_results_be_printed_);
        return NIL;
    }

    // // Internal Constants
    public static final SubLSymbol $kbi_modules$ = makeSymbol("*KBI-MODULES*");

    static private final SubLString $$$all_known_kbi_modules = makeString("all known kbi modules");

    public static final SubLSymbol $kbi_module_attributes$ = makeSymbol("*KBI-MODULE-ATTRIBUTES*");

    static private final SubLString $str_alt3$recognized_attributes_for_definin = makeString("recognized attributes for defining kbi modules");

    static private final SubLList $list_alt4 = list(makeKeyword("VALUE-TYPE"), makeKeyword("CANDIDATE-VALUES"), makeKeyword("NECESSITY"), makeKeyword("PRINT-NAME"), makeKeyword("DOC"), makeKeyword("VERBOSE"), makeKeyword("DEFAULT"), makeKeyword("INVERSE"));

    public static final SubLSymbol $kbi_attribute_attributes$ = makeSymbol("*KBI-ATTRIBUTE-ATTRIBUTES*");

    static private final SubLString $str_alt6$meta_attributes_used_to_specify_a = makeString("meta-attributes used to specify a kbi attribute");

    public static final SubLSymbol $kbi_domains$ = makeSymbol("*KBI-DOMAINS*");

    static private final SubLString $str_alt8$types_of_objects_for_which_kbi_mo = makeString("types of objects for which kbi modules are defined");

    public static final SubLSymbol $kbi_domain_attributes$ = makeSymbol("*KBI-DOMAIN-ATTRIBUTES*");

    static private final SubLString $str_alt10$attributes_used_to_define_kbi_dom = makeString("attributes used to define kbi domains");

    public static final SubLObject $$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));

    public static final SubLSymbol $kbi_mt$ = makeSymbol("*KBI-MT*");

    static private final SubLString $str_alt13$default_mt_for_kb_integrity_analy = makeString("default mt for kb integrity analysis");

    public static final SubLSymbol $kbi_last_domain$ = makeSymbol("*KBI-LAST-DOMAIN*");

    static private final SubLString $$$most_recent_domain_diagnosed = makeString("most recent domain diagnosed");

    public static final SubLSymbol $kbi_relevant_mt_function$ = makeSymbol("*KBI-RELEVANT-MT-FUNCTION*");

    static private final SubLString $str_alt17$relevant_mt_function_for_kb_integ = makeString("relevant-mt function for kb integrity analysis");

    public static final SubLSymbol $kbi_only_concerns$ = makeSymbol("*KBI-ONLY-CONCERNS*");

    static private final SubLString $str_alt19$only_these_modules_having_these_c = makeString("only these modules having these concerns will be considered during kbi analysis");

    public static final SubLSymbol $kbi_only_criticalities$ = makeSymbol("*KBI-ONLY-CRITICALITIES*");

    static private final SubLString $str_alt21$only_these_modules_having_critica = makeString("only these modules having criticality values will be considered during kbi analysis");

    public static final SubLSymbol $kbi_skip_concerns$ = makeSymbol("*KBI-SKIP-CONCERNS*");

    static private final SubLString $str_alt23$no_modules_having_these_these_con = makeString("no modules having these these concerns will be considered during kbi analysis");

    public static final SubLSymbol $kbi_skip_criticalities$ = makeSymbol("*KBI-SKIP-CRITICALITIES*");

    static private final SubLString $str_alt25$no_modules_having_these_criticali = makeString("no modules having these criticality values will be considered during kbi analysis");

    static private final SubLSymbol $sym26$_WITHIN_KBI_SWEEP__ = makeSymbol("*WITHIN-KBI-SWEEP?*");

    static private final SubLString $str_alt27$is_a_kbi_sweep_being_performed_ = makeString("is a kbi sweep being performed?");

    public static final SubLSymbol $kbi_sweep_select_fn$ = makeSymbol("*KBI-SWEEP-SELECT-FN*");

    static private final SubLString $str_alt29$select_function_applied_during_kb = makeString("select function applied during kbi sweeps");

    public static final SubLSymbol $kbi_level$ = makeSymbol("*KBI-LEVEL*");

    static private final SubLString $str_alt31$maximum_testing_level_for_kb_diag = makeString("maximum testing level for kb diagnostics");

    public static final SubLSymbol $kbi_assertion$ = makeSymbol("*KBI-ASSERTION*");

    static private final SubLString $str_alt33$assertion_currently_being_diagnos = makeString("assertion currently being diagnosed");

    static private final SubLSymbol $sym34$_KBI_DISABLE_SELECTION_FILTERS__ = makeSymbol("*KBI-DISABLE-SELECTION-FILTERS?*");

    static private final SubLString $str_alt35$should_kbi_modules_be_run_regardl = makeString("should kbi modules be run regardless of selection filters (e.g., durrign supplant analysis)?");

    public static final SubLSymbol $last_diagnostic_domain$ = makeSymbol("*LAST-DIAGNOSTIC-DOMAIN*");

    static private final SubLString $str_alt37$domain_subject_of_the_most_recent = makeString("domain subject of the most recent kbi sweep");



    public static final SubLSymbol $kbi_domain_modules$ = makeSymbol("*KBI-DOMAIN-MODULES*");

    static private final SubLString $$$table_of_kbi_modules_by_domain = makeString("table of kbi modules by domain");

    public static final SubLSymbol $kbi_start_times$ = makeSymbol("*KBI-START-TIMES*");

    static private final SubLString $str_alt42$table_of_kbi_sweep_start_times_by = makeString("table of kbi sweep start times by domain");

    public static final SubLSymbol $kbi_progress_counts$ = makeSymbol("*KBI-PROGRESS-COUNTS*");

    static private final SubLString $str_alt44$table_of_items_considered_duing_c = makeString("table of items considered duing current kbi sweep of domain");

    public static final SubLSymbol $kbi_items_to_consider$ = makeSymbol("*KBI-ITEMS-TO-CONSIDER*");

    static private final SubLString $str_alt46$number_of_items_included_during_c = makeString("number of items included during current kbi sweep");

    public static final SubLSymbol $kbi_last_fort_considered$ = makeSymbol("*KBI-LAST-FORT-CONSIDERED*");

    static private final SubLString $str_alt48$id_of_most_recent_fort_considered = makeString("id of most recent fort considered during a kbi fort diagnosis sweep, resuming will skip forts through this one");

    static private final SubLSymbol $sym49$_KBI_RESUMING_FORT_DIAGNOSTIC_SWEEP__ = makeSymbol("*KBI-RESUMING-FORT-DIAGNOSTIC-SWEEP?*");

    static private final SubLString $str_alt50$continue_last_kbi_fort_diagnosis_ = makeString("continue last kbi fort diagnosis sweep, skipping all forts encountered through *kbi-last-fort-considered*");

    public static final SubLSymbol $kbi_last_constant_considered$ = makeSymbol("*KBI-LAST-CONSTANT-CONSIDERED*");

    static private final SubLString $str_alt52$id_of_most_recent_constant_consid = makeString("id of most recent constant considered during a kbi constant diagnosis sweep, resuming will skip constants through this one");

    static private final SubLSymbol $sym53$_KBI_RESUMING_CONSTANT_DIAGNOSTIC_SWEEP__ = makeSymbol("*KBI-RESUMING-CONSTANT-DIAGNOSTIC-SWEEP?*");

    static private final SubLString $str_alt54$continue_last_kbi_constant_diagno = makeString("continue last kbi constant diagnosis sweep, skipping all constants encountered through *kbi-last-constant-considered*");

    public static final SubLSymbol $duplicate_superiors_sbhl_constants$ = makeSymbol("*DUPLICATE-SUPERIORS-SBHL-CONSTANTS*");

    static private final SubLString $str_alt56$sbhl_constants__e_g___collections = makeString("sbhl constants (e.g., collections) with duplicate superiors (e.g., genls)");

    public static final SubLSymbol $duplicate_inferiors_sbhl_constants$ = makeSymbol("*DUPLICATE-INFERIORS-SBHL-CONSTANTS*");

    static private final SubLString $str_alt58$sbhl_constants__e_g___collections = makeString("sbhl constants (e.g., collections) with duplicate inferiors (e.g., specs)");

    static private final SubLSymbol $sym59$_ISA_SBHL_KB_MISMATCH_CONSTANTS_ = makeSymbol("*ISA-SBHL/KB-MISMATCH-CONSTANTS*");

    static private final SubLString $str_alt60$constants_s_t__sbhl_disagrees_wit = makeString("constants s.t. sbhl disagrees with kb re isa collections");

    static private final SubLSymbol $sym61$_SUPERIORS_SBHL_KB_MISMATCH_CONSTANTS_ = makeSymbol("*SUPERIORS-SBHL/KB-MISMATCH-CONSTANTS*");

    static private final SubLString $str_alt62$sbhl_constants_s_t__sbhl_disagree = makeString("sbhl constants s.t. sbhl disagrees with kb re superiors");

    static private final SubLSymbol $sym63$_INFERIORS_SBHL_KB_MISMATCH_CONSTANTS_ = makeSymbol("*INFERIORS-SBHL/KB-MISMATCH-CONSTANTS*");

    static private final SubLString $str_alt64$sbhl_constants_s_t__sbhl_disagree = makeString("sbhl constants s.t. sbhl disagrees with kb re inferiors");

    public static final SubLSymbol $kbi_last_assertion_considered$ = makeSymbol("*KBI-LAST-ASSERTION-CONSIDERED*");

    static private final SubLString $str_alt66$id_of_most_recent_assertion_consi = makeString("id of most recent assertion considered during a kbi constant diagnosis sweep, resuming will skip constants through this one");

    static private final SubLSymbol $sym67$_KBI_RESUMING_ASSERTION_DIAGNOSTIC_SWEEP__ = makeSymbol("*KBI-RESUMING-ASSERTION-DIAGNOSTIC-SWEEP?*");

    static private final SubLString $str_alt68$continue_last_kbi_assertion_diagn = makeString("continue last kbi assertion diagnosis sweep, skipping all constants encountered through *kbi-last-constant-considered*");

    static private final SubLSymbol $sym69$_FIND_ASSERTIONS_W_O_MT__ = makeSymbol("*FIND-ASSERTIONS-W/O-MT?*");

    static private final SubLString $str_alt70$include__assertion_w_o_mt_in_asse = makeString("include :assertion-w/o-mt in assertion diagnostics?");

    static private final SubLSymbol $sym71$_ASSERTIONS_W_O_MT_ = makeSymbol("*ASSERTIONS-W/O-MT*");

    static private final SubLString $str_alt72$assertions_with_missing__or_inval = makeString("assertions with missing (or invalid) mt");

    static private final SubLSymbol $sym73$_FIND_ASSERTIONS_W_O_VALID_ID__ = makeSymbol("*FIND-ASSERTIONS-W/O-VALID-ID?*");

    static private final SubLString $str_alt74$include__assertion_w_o_valid_id_i = makeString("include :assertion-w/o-valid-id in assertion diagnostics?");

    static private final SubLSymbol $sym75$_ASSERTIONS_W_O_VALID_ID_ = makeSymbol("*ASSERTIONS-W/O-VALID-ID*");

    static private final SubLString $str_alt76$assertions_with_missing__or_inval = makeString("assertions with missing (or invalid) id");

    static private final SubLSymbol $sym77$_FIND_ASSERTIONS_W_O_TV__ = makeSymbol("*FIND-ASSERTIONS-W/O-TV?*");

    static private final SubLString $str_alt78$include__assertion_w_o_tv_in_asse = makeString("include :assertion-w/o-tv in assertion diagnostics?");

    static private final SubLSymbol $sym79$_ASSERTIONS_W_O_TV_ = makeSymbol("*ASSERTIONS-W/O-TV*");

    static private final SubLString $str_alt80$assertions_with_missing__or_inval = makeString("assertions with missing (or invalid) tv");

    static private final SubLSymbol $sym81$_FIND_ASSERTIONS_W_O_DIRECTION__ = makeSymbol("*FIND-ASSERTIONS-W/O-DIRECTION?*");

    static private final SubLString $str_alt82$include__assertion_w_o_direction_ = makeString("include :assertion-w/o-direction in assertion diagnostics?");

    static private final SubLSymbol $sym83$_ASSERTIONS_W_O_DIRECTION_ = makeSymbol("*ASSERTIONS-W/O-DIRECTION*");

    static private final SubLString $str_alt84$assertions_with_missing__or_inval = makeString("assertions with missing (or invalid) direction");

    static private final SubLSymbol $sym85$_FIND_ASSERTIONS_W_O_VALID_VAR_NAMES__ = makeSymbol("*FIND-ASSERTIONS-W/O-VALID-VAR-NAMES?*");

    static private final SubLString $str_alt86$include__assertion_w_o_valid_var_ = makeString("include :assertion-w/o-valid-var-names in assertion diagnostics?");

    static private final SubLSymbol $sym87$_ASSERTIONS_W_O_VALID_VAR_NAMES_ = makeSymbol("*ASSERTIONS-W/O-VALID-VAR-NAMES*");

    static private final SubLString $str_alt88$assertions_with_missing__or_inval = makeString("assertions with missing (or invalid) variable names");

    static private final SubLSymbol $sym89$_FIND_ASSERTIONS_W_O_PREFERED_VAR_NAMES__ = makeSymbol("*FIND-ASSERTIONS-W/O-PREFERED-VAR-NAMES?*");

    static private final SubLString $str_alt90$include__assertion_w_o_prefered_v = makeString("include :assertion-w/o-prefered-var-names in assertion diagnostics?");

    static private final SubLSymbol $sym91$_ASSERTIONS_W_O_PREFERED_VAR_NAMES_ = makeSymbol("*ASSERTIONS-W/O-PREFERED-VAR-NAMES*");

    static private final SubLString $str_alt92$assertions_with_undesirable_varia = makeString("assertions with undesirable variable names");

    static private final SubLSymbol $sym93$_FIND_ASSERTIONS_W_O_SOURCE__ = makeSymbol("*FIND-ASSERTIONS-W/O-SOURCE?*");

    static private final SubLString $str_alt94$include__assertion_w_o_source_in_ = makeString("include :assertion-w/o-source in assertion diagnostics?");

    static private final SubLSymbol $sym95$_ASSERTIONS_W_O_SOURCE_ = makeSymbol("*ASSERTIONS-W/O-SOURCE*");

    static private final SubLString $$$assertions_with_no_source = makeString("assertions with no source");

    static private final SubLSymbol $sym97$_FIND_ASSERTIONS_W_MAL_SOURCES__ = makeSymbol("*FIND-ASSERTIONS-W/MAL-SOURCES?*");

    static private final SubLString $str_alt98$include__assertion_w_mal_sources_ = makeString("include :assertion-w/mal-sources in assertion diagnostics?");

    static private final SubLSymbol $sym99$_ASSERTIONS_W_MAL_SOURCES_ = makeSymbol("*ASSERTIONS-W/MAL-SOURCES*");

    static private final SubLString $$$assertions_with_invalid_sources = makeString("assertions with invalid sources");

    static private final SubLSymbol $sym101$_FIND_ASSERTIONS_MISINDEXED__ = makeSymbol("*FIND-ASSERTIONS-MISINDEXED?*");

    static private final SubLString $str_alt102$include__assertion_misindexed_in_ = makeString("include :assertion-misindexed in assertion diagnostics?");

    public static final SubLSymbol $assertions_misindexed$ = makeSymbol("*ASSERTIONS-MISINDEXED*");

    static private final SubLString $str_alt104$assertions_that_are_missing_from_ = makeString("assertions that are missing from appropriate constant indices");

    static private final SubLSymbol $sym105$_FIND_ASSERTIONS_REDUNDANT_WRT_MT__ = makeSymbol("*FIND-ASSERTIONS-REDUNDANT-WRT-MT?*");

    static private final SubLString $str_alt106$include__assertion_redundant_wrt_ = makeString("include :assertion-redundant-wrt-mt in assertion diagnostics?");

    public static final SubLSymbol $assertions_redundant_wrt_mt$ = makeSymbol("*ASSERTIONS-REDUNDANT-WRT-MT*");

    static private final SubLString $str_alt108$assertions_sharing_cnf_with_other = makeString("assertions sharing cnf with other assertions in #$genlMts");

    static private final SubLSymbol $sym109$_FIND_ASSERTION_DUPLICATES__ = makeSymbol("*FIND-ASSERTION-DUPLICATES?*");

    static private final SubLString $str_alt110$include__assertion_duplicates_in_ = makeString("include :assertion-duplicates in assertion diagnostics?");

    public static final SubLSymbol $assertion_duplicates$ = makeSymbol("*ASSERTION-DUPLICATES*");

    static private final SubLString $str_alt112$assertions_st_some_different_asse = makeString("assertions st some different assertion has a common cnf and mt");

    static private final SubLSymbol $sym113$_FIND_ASSERTIONS_REDUNDANT_WRT_ISA__ = makeSymbol("*FIND-ASSERTIONS-REDUNDANT-WRT-ISA?*");

    static private final SubLString $str_alt114$include__assertion_redundant_wrt_ = makeString("include :assertion-redundant-wrt-isa in assertion diagnostics?");

    public static final SubLSymbol $assertions_redundant_wrt_isa$ = makeSymbol("*ASSERTIONS-REDUNDANT-WRT-ISA*");

    static private final SubLString $str_alt116$test_assertion_for_redundant___is = makeString("test assertion for redundant #$isa literals");

    static private final SubLSymbol $sym117$_FIND_ASSERTIONS_NON_CONSTANT_ARG_ISA_W_O_DEFNS__ = makeSymbol("*FIND-ASSERTIONS-NON-CONSTANT-ARG-ISA-W/O-DEFNS?*");

    static private final SubLString $str_alt118$include__assertion_non_constant_a = makeString("include :assertion-non-constant-arg-isa-w/o-defns in assertion diagnostics?");

    static private final SubLSymbol $sym119$_ASSERTIONS_NON_CONSTANT_ARG_ISA_W_O_DEFNS_ = makeSymbol("*ASSERTIONS-NON-CONSTANT-ARG-ISA-W/O-DEFNS*");

    static private final SubLString $str_alt120$assertions_with_non_constant_args = makeString("assertions with non-constant args not admitted by defns");

    static private final SubLSymbol $sym121$_FIND_ASSERTIONS_NOT_CANONICAL__ = makeSymbol("*FIND-ASSERTIONS-NOT-CANONICAL?*");

    static private final SubLString $str_alt122$include__assertion_not_canonical_ = makeString("include :assertion-not-canonical in assertion diagnostics?");

    public static final SubLSymbol $assertions_not_canonical$ = makeSymbol("*ASSERTIONS-NOT-CANONICAL*");

    static private final SubLString $str_alt124$non_canonical_assertions = makeString("non-canonical assertions");

    static private final SubLSymbol $sym125$_FIND_ASSERTIONS_NOT_ACCESSIBLE__ = makeSymbol("*FIND-ASSERTIONS-NOT-ACCESSIBLE?*");

    static private final SubLString $str_alt126$include__assertion_not_accessible = makeString("include :assertion-not-accessible in assertion diagnostics?");

    public static final SubLSymbol $assertions_not_accessible$ = makeSymbol("*ASSERTIONS-NOT-ACCESSIBLE*");

    static private final SubLString $str_alt128$non_accessible_assertions = makeString("non-accessible assertions");

    static private final SubLSymbol $sym129$_FIND_ASSERTIONS_NOT_WFF__ = makeSymbol("*FIND-ASSERTIONS-NOT-WFF?*");

    static private final SubLString $str_alt130$include__assertion_not_wff_in_ass = makeString("include :assertion-not-wff in assertion diagnostics?");

    public static final SubLSymbol $assertions_not_wff$ = makeSymbol("*ASSERTIONS-NOT-WFF*");

    static private final SubLString $$$assertions_with_wff_violations = makeString("assertions with wff violations");

    static private final SubLSymbol $sym133$_FIND_ASSERTIONS_INFORM_MISING_IST__ = makeSymbol("*FIND-ASSERTIONS-INFORM-MISING-IST?*");

    static private final SubLString $str_alt134$include__assertion_inform_mising_ = makeString("include :assertion-inform-mising-ist in assertion diagnostics?");

    public static final SubLSymbol $assertions_inform_mising_ist$ = makeSymbol("*ASSERTIONS-INFORM-MISING-IST*");

    static private final SubLString $str_alt136$__informStatement_assertions_w_o_ = makeString("#$informStatement assertions w/o corresponding #$ist assertions");

    static private final SubLSymbol $sym137$_FIND_ASSERTIONS_W_MAL_DOC_STRING__ = makeSymbol("*FIND-ASSERTIONS-W/MAL-DOC-STRING?*");

    static private final SubLString $str_alt138$include__assertion_w_mal_doc_stri = makeString("include :assertion-w/mal-doc-string in assertion diagnostics?");

    static private final SubLSymbol $sym139$_ASSERTIONS_W_MAL_DOC_STRING_ = makeSymbol("*ASSERTIONS-W/MAL-DOC-STRING*");

    static private final SubLString $str_alt140$assertions_w_mal_documentation_st = makeString("assertions w/mal documentation strings");

    static private final SubLSymbol $sym141$_FIND_ASSERTIONS_W_ATOMIC_NEG_LIT__ = makeSymbol("*FIND-ASSERTIONS-W/ATOMIC-NEG-LIT?*");

    static private final SubLString $str_alt142$include__assertion_w_atomic_neg_l = makeString("include :assertion-w/atomic-neg-lit in assertion diagnostics?");

    static private final SubLSymbol $sym143$_ASSERTIONS_W_ATOMIC_NEG_LIT_ = makeSymbol("*ASSERTIONS-W/ATOMIC-NEG-LIT*");

    static private final SubLString $str_alt144$assertions_of_negated_atomic_sent = makeString("assertions of negated atomic sentences");

    static private final SubLSymbol $sym145$_DIAGNOSE_ASSERTION_AXIOM__ = makeSymbol("*DIAGNOSE-ASSERTION-AXIOM?*");

    static private final SubLString $str_alt146$include__diagnose_assertions_axio = makeString("include :diagnose-assertions-axioms in assertion diagnostics?");

    static private final SubLSymbol $sym147$_ASSERTIONS_W_AXIOMS_DIAGNOSIS_ = makeSymbol("*ASSERTIONS-W/AXIOMS-DIAGNOSIS*");

    static private final SubLString $str_alt148$assertions_with_axiom_diagnostic_ = makeString("assertions with axiom diagnostic results");

    static private final SubLSymbol $sym149$_DIAGNOSE_ASSERTION_SOURCES__ = makeSymbol("*DIAGNOSE-ASSERTION-SOURCES?*");

    static private final SubLString $str_alt150$include__diagnose_assertion_sourc = makeString("include :diagnose-assertion-sources in assertion diagnostics?");

    static private final SubLSymbol $sym151$_ASSERTIONS_W_SOURCE_DIAGNOSIS_ = makeSymbol("*ASSERTIONS-W/SOURCE-DIAGNOSIS*");

    static private final SubLString $str_alt152$assertions_with_source_diagnostic = makeString("assertions with source diagnostic results");

    public static final SubLSymbol $kbi_last_axiom_considered$ = makeSymbol("*KBI-LAST-AXIOM-CONSIDERED*");

    static private final SubLString $str_alt154$id_of_most_recent_axiom_considere = makeString("id of most recent axiom considered during a kbi axiom diagnosis sweep, resuming will skip axioms through this one");

    static private final SubLSymbol $sym155$_KBI_RESUMING_AXIOM_DIAGNOSTIC_SWEEP__ = makeSymbol("*KBI-RESUMING-AXIOM-DIAGNOSTIC-SWEEP?*");

    static private final SubLString $str_alt156$continue_last_kbi_axiom_diagnosis = makeString("continue last kbi axiom diagnosis sweep, skipping all axioms encountered through *kbi-last-axiom-considered*");

    public static final SubLSymbol $kbi_last_cnf_considered$ = makeSymbol("*KBI-LAST-CNF-CONSIDERED*");

    static private final SubLString $str_alt158$id_of_most_recent_assertions_cons = makeString("id of most recent assertions considered during a kbi cnf diagnosis sweep, resuming will skip assertions through this one");

    static private final SubLSymbol $sym159$_KBI_RESUMING_CNF_DIAGNOSTIC_SWEEP__ = makeSymbol("*KBI-RESUMING-CNF-DIAGNOSTIC-SWEEP?*");

    static private final SubLString $str_alt160$continue_last_kbi_cnf_diagnosis_s = makeString("continue last kbi cnf diagnosis sweep, skipping all assertions encountered through *kbi-last-cnf-considered*");

    public static final SubLSymbol $kbi_trace_level$ = makeSymbol("*KBI-TRACE-LEVEL*");

    static private final SubLString $str_alt162$controls_extent_of_tracing__warni = makeString("controls extent of tracing, warnings, etc., for the kbi modules [0 .. 5]");



    static private final SubLSymbol $sym164$_KBI_I_O_MODE_ = makeSymbol("*KBI-I/O-MODE*");

    static private final SubLString $str_alt165$communication_mode_for_kbi_i_o__e = makeString("communication mode for kbi i/o (e.g., :el :nl)");

    public static final SubLInteger $int$128 = makeInteger(128);

    public static final SubLSymbol $kbi_predicate_table$ = makeSymbol("*KBI-PREDICATE-TABLE*");

    static private final SubLString $str_alt168$Used_internally_by_kbi_constant_p = makeString("Used internally by kbi constant predicate-specific checks");

    static private final SubLSymbol $sym169$_KBI_CACHING_FINDINGS__ = makeSymbol("*KBI-CACHING-FINDINGS?*");

    static private final SubLString $str_alt170$should_kbi_findings_be_saved_ = makeString("should kbi findings be saved?");

    static private final SubLSymbol $sym171$_KBI_REPAIRING_FINDINGS__ = makeSymbol("*KBI-REPAIRING-FINDINGS?*");

    static private final SubLString $str_alt172$should_kbi_findings_be_repaired_ = makeString("should kbi findings be repaired?");

    static private final SubLSymbol $sym173$_KBI_TRANSMIT_REPAIRS__ = makeSymbol("*KBI-TRANSMIT-REPAIRS?*");

    static private final SubLString $str_alt174$should_kbi_repairs_be_transmitted = makeString("should kbi repairs be transmitted?");

    static private final SubLSymbol $sym175$_KBI_PRINT_RESULTS__ = makeSymbol("*KBI-PRINT-RESULTS?*");

    static private final SubLString $str_alt176$should_kbi_results_be_printed_ = makeString("should kbi results be printed?");

    // // Initializers
    public void declareFunctions() {
        declare_kbi_vars_file();
    }

    public void initializeVariables() {
        init_kbi_vars_file();
    }

    public void runTopLevelForms() {
        setup_kbi_vars_file();
    }
}

