/**
 *
 */
/**
 *
 */
/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.arguments.asserted_argument_p;
import static com.cyc.cycjava.cycl.arguments.support_equal;
import static com.cyc.cycjava.cycl.constant_handles.constant_count;
import static com.cyc.cycjava.cycl.constant_handles.constant_suid;
import static com.cyc.cycjava.cycl.constant_handles.do_constants_table;
import static com.cyc.cycjava.cycl.constant_handles.find_constant_by_suid;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.deduction_handles.deduction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_abnormal_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.simple_variable_rename_impossibleP;
import static com.cyc.cycjava.cycl.el_utilities.term_is_one_of_argsP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.kb_indexing.num_gaf_arg_index;
import static com.cyc.cycjava.cycl.kb_indexing.num_predicate_extent_index;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$mt$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mt_function$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.$relevant_mts$;
import static com.cyc.cycjava.cycl.mt_relevance_macros.relevant_mtP;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_function;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt;
import static com.cyc.cycjava.cycl.mt_relevance_macros.update_inference_mt_relevance_mt_list;
import static com.cyc.cycjava.cycl.mt_relevance_macros.with_inference_mt_relevance_validate;
import static com.cyc.cycjava.cycl.set.new_set;
import static com.cyc.cycjava.cycl.set.set_add;
import static com.cyc.cycjava.cycl.set.set_element_list;
import static com.cyc.cycjava.cycl.set.set_memberP;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_delayed_mode_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_delayed_mode_string$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_formula_arg_n;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      ASSERTION-UTILITIES
 * source file: /cyc/top/cycl/assertion-utilities.lisp
 * created:     2019/07/03 17:37:25
 */
public final class assertion_utilities extends SubLTranslatedFile implements V12 {
    /**
     *
     *
     * @return list of assertion-p; all the assertions which have the same
    CNF as ASSERTION but are in a different mt.
     * @unknown destructible
     */
    @LispMethod(comment = "@return list of assertion-p; all the assertions which have the same\r\nCNF as ASSERTION but are in a different mt.\r\n@unknown destructible")
    public static final SubLObject sibling_mt_assertions(SubLObject assertion) {
        {
            SubLObject clause_struc = assertions_low.assertion_clause_struc(assertion);
            if (NIL != clause_struc) {
                {
                    SubLObject all_assertions = clause_strucs.clause_struc_assertions(clause_struc);
                    return remove(assertion, all_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static final SubLFile me = new assertion_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.assertion_utilities";


    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $excepted_assertion_max_depth$ = makeSymbol("*EXCEPTED-ASSERTION-MAX-DEPTH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $excepted_assertion_shallow_max_depth$ = makeSymbol("*EXCEPTED-ASSERTION-SHALLOW-MAX-DEPTH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $doomed_assertion_max_depth$ = makeSymbol("*DOOMED-ASSERTION-MAX-DEPTH*");

    // deflexical
    /**
     * If we're searching for this many terms or more, it's more efficient to
     * construct a set.
     */
    @LispMethod(comment = "If we\'re searching for this many terms or more, it\'s more efficient to\r\nconstruct a set.\ndeflexical\nIf we\'re searching for this many terms or more, it\'s more efficient to\nconstruct a set.")
    private static final SubLSymbol $assertion_mentions_any_of_terms_set_watermark$ = makeSymbol("*ASSERTION-MENTIONS-ANY-OF-TERMS-SET-WATERMARK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $assertion_mentions_any_of_terms_set_lambda$ = makeSymbol("*ASSERTION-MENTIONS-ANY-OF-TERMS-SET-LAMBDA*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $assertion_mentions_any_of_terms_dict_lambda$ = makeSymbol("*ASSERTION-MENTIONS-ANY-OF-TERMS-DICT-LAMBDA*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $newest_constant_of_assertions$ = makeSymbol("*NEWEST-CONSTANT-OF-ASSERTIONS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cached_self_looping_rule_assertionP_caching_state$ = makeSymbol("*CACHED-SELF-LOOPING-RULE-ASSERTION?-CACHING-STATE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cached_self_expanding_rule_assertionP_caching_state$ = makeSymbol("*CACHED-SELF-EXPANDING-RULE-ASSERTION?-CACHING-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $all_forward_rules_relevant_to_term_threshold$ = makeSymbol("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-THRESHOLD*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $within_safe_all_forward_rules_relevant_to_termP$ = makeSymbol("*WITHIN-SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERM?*");

    // defparameter
    // to avoid infinite recursion going up
    /**
     * to avoid infinite recursion going up
     */
    @LispMethod(comment = "to avoid infinite recursion going up\ndefparameter")
    private static final SubLSymbol $all_forward_rules_relevant_to_term_argument_set$ = makeSymbol("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-ARGUMENT-SET*");

    // defparameter
    // to avoid infinite recursion going down
    /**
     * to avoid infinite recursion going down
     */
    @LispMethod(comment = "to avoid infinite recursion going down\ndefparameter")
    private static final SubLSymbol $all_forward_rules_relevant_to_term_dependent_set$ = makeSymbol("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-DEPENDENT-SET*");

    // defparameter
    // to avoid wasting work on duplicate narts
    /**
     * to avoid wasting work on duplicate narts
     */
    @LispMethod(comment = "to avoid wasting work on duplicate narts\ndefparameter")
    private static final SubLSymbol $all_forward_rules_relevant_to_term_nart_set$ = makeSymbol("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-NART-SET*");

    // defparameter
    // the answer, built up by side effect
    /**
     * the answer, built up by side effect
     */
    @LispMethod(comment = "the answer, built up by side effect\ndefparameter")
    private static final SubLSymbol $all_forward_rules_relevant_to_term_result_set$ = makeSymbol("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-RESULT-SET*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $deduction_asserted_assertion_supports_deductions_processed$ = makeSymbol("*DEDUCTION-ASSERTED-ASSERTION-SUPPORTS-DEDUCTIONS-PROCESSED*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $deduction_asserted_assertion_counts$ = makeSymbol("*DEDUCTION-ASSERTED-ASSERTION-COUNTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rarest_term$ = makeSymbol("*RAREST-TERM*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rarest_count$ = makeSymbol("*RAREST-COUNT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("RULE-VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc rules")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list1 = list(makeKeyword("PROGRESS-MESSAGE"), $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLString $$$mapping_Cyc_rules = makeString("mapping Cyc rules");

    static private final SubLList $list7 = list(makeSymbol("NEW-RULE-ITERATOR"));

    static private final SubLSymbol $sym8$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");

    static private final SubLSymbol $sym9$TOTAL = makeUninternedSymbol("TOTAL");

    static private final SubLSymbol $sym10$SOFAR = makeUninternedSymbol("SOFAR");

    static private final SubLList $list12 = list(list(makeSymbol("RULE-COUNT")));

    static private final SubLList $list13 = list(ZERO_INTEGER);

    private static final SubLSymbol DO_RULES = makeSymbol("DO-RULES");

    static private final SubLList $list18 = list(list(makeSymbol("GAF-VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc GAFs")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $$$mapping_Cyc_GAFs = makeString("mapping Cyc GAFs");

    private static final SubLSymbol DO_ASSERTIONS = makeSymbol("DO-ASSERTIONS");

    static private final SubLSymbol $sym22$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    static private final SubLList $list23 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym24$PROGRESS_MESSAGE_VAR = makeUninternedSymbol("PROGRESS-MESSAGE-VAR");

    private static final SubLSymbol DO_ASSERTIONS_BACKWARDS = makeSymbol("DO-ASSERTIONS-BACKWARDS");

    private static final SubLSymbol $sym26$SOFAR_VAR = makeUninternedSymbol("SOFAR-VAR");

    private static final SubLSymbol $sym27$TOTAL_VAR = makeUninternedSymbol("TOTAL-VAR");

    static private final SubLList $list28 = list(list(makeSymbol("ASSERTION-COUNT")));

    private static final SubLSymbol $sym29$ID_VAR = makeUninternedSymbol("ID-VAR");

    private static final SubLSymbol DO_NUMBERS = makeSymbol("DO-NUMBERS");

    private static final SubLList $list32 = list(makeSymbol("NEXT-ASSERTION-ID"));

    private static final SubLList $list36 = list(list(makeSymbol("DEPENDENT-ASSERTION"), makeSymbol("ASSERTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym37$DEDUCTION = makeUninternedSymbol("DEDUCTION");

    private static final SubLSymbol DO_ASSERTION_DEPENDENTS = makeSymbol("DO-ASSERTION-DEPENDENTS");

    private static final SubLSymbol DEDUCTION_ASSERTION = makeSymbol("DEDUCTION-ASSERTION");

    private static final SubLList $list41 = list(list(makeSymbol("SUPPORTING-ASSERTION"), makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list42 = list($DONE);

    private static final SubLSymbol $sym43$ARGUMENT = makeUninternedSymbol("ARGUMENT");

    private static final SubLSymbol DO_ASSERTION_ARGUMENTS = makeSymbol("DO-ASSERTION-ARGUMENTS");

    private static final SubLSymbol DO_DEDUCTION_SUPPORTS = makeSymbol("DO-DEDUCTION-SUPPORTS");

    private static final SubLString $str47$Gathering_mt_relevant_dependents_ = makeString("Gathering mt-relevant dependents from root set of ");

    private static final SubLString $$$_assertions = makeString(" assertions");



    private static final SubLString $$$Removing_ = makeString("Removing ");

    private static final SubLString $str51$_mt_relevant_dependents = makeString(" mt-relevant dependents");

    private static final SubLString $str52$Deduction__A_supporting_missing_K = makeString("Deduction ~A supporting missing KB HL support?! ~A~%");

    private static final SubLString $str53$deduction_dependent_deductions_ca = makeString("deduction-dependent-deductions called on deduction ~A supporting invalid object ~A");





    private static final SubLSymbol $sym60$_EXIT = makeSymbol("%EXIT");







    private static final SubLSymbol ABNORMAL_ASSERTION_P = makeSymbol("ABNORMAL-ASSERTION-P");







    private static final SubLSymbol ASSERTION_MENTIONS_ANY_OF_TERMS_IN_SET_LAMBDA = makeSymbol("ASSERTION-MENTIONS-ANY-OF-TERMS-IN-SET-LAMBDA");

    private static final SubLSymbol ASSERTION_MENTIONS_ANY_OF_TERMS_IN_DICT_LAMBDA = makeSymbol("ASSERTION-MENTIONS-ANY-OF-TERMS-IN-DICT-LAMBDA");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLSymbol ASSERTED_SECOND = makeSymbol("ASSERTED-SECOND");

    private static final SubLSymbol EL_VAR_NAME = makeSymbol("EL-VAR-NAME");





    private static final SubLSymbol $sym80$FORWARD_ASSERTION_ = makeSymbol("FORWARD-ASSERTION?");

    private static final SubLSymbol ASSERTION_DEPENDENT_COUNT = makeSymbol("ASSERTION-DEPENDENT-COUNT");

    private static final SubLString $str82$Sorting_newest_constants___Part_2 = makeString("Sorting newest constants : Part 2");

    private static final SubLString $$$Computing_newest_constants = makeString("Computing newest constants");

    private static final SubLString $str86$Sorting_newest_constants___Part_1 = makeString("Sorting newest constants : Part 1");

    private static final SubLSymbol $sym87$ASSERTION_HAS_META_ASSERTIONS_ = makeSymbol("ASSERTION-HAS-META-ASSERTIONS?");

    private static final SubLList $list88 = list(makeSymbol("ASSERTION"));

    private static final SubLString $str89$Return_T_iff_ASSERTION_has_some_m = makeString("Return T iff ASSERTION has some meta-assertions.");

    private static final SubLList $list90 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")));

    private static final SubLList $list91 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol ALL_META_ASSERTIONS = makeSymbol("ALL-META-ASSERTIONS");

    private static final SubLSymbol $sym93$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");



    private static final SubLSymbol META_ASSERTION_P = makeSymbol("META-ASSERTION-P");

    private static final SubLSymbol ASSERTION_LIST_P = makeSymbol("ASSERTION-LIST-P");

    private static final SubLSymbol $sym99$SAFE__ = makeSymbol("SAFE-<");

    private static final SubLSymbol $sym101$TERM__ = makeSymbol("TERM-<");

    private static final SubLSymbol $sym102$DEFINITIONAL_PRED__ = makeSymbol("DEFINITIONAL-PRED-<");

    private static final SubLSymbol GAF_PREDICATE = makeSymbol("GAF-PREDICATE");

    private static final SubLSymbol $sym105$ISA_HL_VAR_THING_LIT_ = makeSymbol("ISA-HL-VAR-THING-LIT?");

    private static final SubLString $str106$Type_constraint__Mt_should_be_can = makeString("Type constraint: Mt should be canonical ~a, but isn't ~a");

    private static final SubLString $str107$Expected_a_single_DNF_clause_of_c = makeString("Expected a single DNF clause of constraints for ~a but got more than one: ~a");

    private static final SubLSymbol $sym108$CACHED_SELF_LOOPING_RULE_ASSERTION_ = makeSymbol("CACHED-SELF-LOOPING-RULE-ASSERTION?");

    private static final SubLSymbol $sym109$_CACHED_SELF_LOOPING_RULE_ASSERTION__CACHING_STATE_ = makeSymbol("*CACHED-SELF-LOOPING-RULE-ASSERTION?-CACHING-STATE*");

    private static final SubLSymbol $sym110$CACHED_SELF_EXPANDING_RULE_ASSERTION_ = makeSymbol("CACHED-SELF-EXPANDING-RULE-ASSERTION?");

    private static final SubLSymbol $sym111$_CACHED_SELF_EXPANDING_RULE_ASSERTION__CACHING_STATE_ = makeSymbol("*CACHED-SELF-EXPANDING-RULE-ASSERTION?-CACHING-STATE*");

    private static final SubLInteger $int$212 = makeInteger(212);

    private static final SubLSymbol $ALL_FORWARD_RULES_RELEVANT_TO_TERMS_THRESHOLD_EXCEEDED = makeKeyword("ALL-FORWARD-RULES-RELEVANT-TO-TERMS-THRESHOLD-EXCEEDED");

    private static final SubLSymbol $sym115$_ = makeSymbol(">");

    private static final SubLList $list118 = list(makeKeyword("ARGUMENT*"), makeKeyword("DEPENDENT*"));



    private static final SubLSymbol $kw120$ARGUMENT_ = makeKeyword("ARGUMENT*");

    private static final SubLSymbol $kw121$DEPENDENT_ = makeKeyword("DEPENDENT*");

    private static final SubLString $str122$can_t_handle_argument__S_yet = makeString("can't handle argument ~S yet");

    private static final SubLString $str123$can_t_handle_sub_support__S_yet = makeString("can't handle sub-support ~S yet");

    private static final SubLString $$$gathering_exception_rules = makeString("gathering exception rules");

    private static final SubLString $$$gathering_pragma_rules = makeString("gathering pragma rules");

    private static final SubLString $$$gathering_lifting_rules = makeString("gathering lifting rules");





    private static final SubLString $str129$__ = makeString("??");

    private static final SubLString $str131$Verifying_that_all_embedded_asser = makeString("Verifying that all embedded assertions are findable via ID");

    private static final SubLString $str132$Looking_for_assertions_with_no_ar = makeString("Looking for assertions with no arguments");

    private static final SubLString $$$mapping_Cyc_assertions = makeString("mapping Cyc assertions");

    private static final SubLSymbol UPDATE_RAREST_TERM = makeSymbol("UPDATE-RAREST-TERM");

    private static final SubLSymbol $sym136$_ = makeSymbol("<");

    private static final SubLSymbol MEMOIZED_ASSERTION_TERM_RARITY = makeSymbol("MEMOIZED-ASSERTION-TERM-RARITY");

    // Definitions
    public static final SubLObject do_rules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject rule_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    rule_var = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            if (NIL == member(current_1, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                        {
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : $$$mapping_Cyc_rules;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL == progress_message) {
                                    return listS(DO_KEYHASH, list(rule_var, $list_alt7, $DONE, done), append(body, NIL));
                                } else {
                                    {
                                        SubLObject message_var = $sym8$MESSAGE_VAR;
                                        SubLObject total = $sym9$TOTAL;
                                        SubLObject sofar = $sym10$SOFAR;
                                        return list(CLET, list(list(message_var, progress_message), bq_cons(total, $list_alt12), bq_cons(sofar, $list_alt13)), list(NOTING_PERCENT_PROGRESS, message_var, listS(DO_RULES, list(rule_var, $PROGRESS_MESSAGE, NIL, $DONE, done), list(CINC, sofar), list(NOTE_PERCENT_PROGRESS, sofar, total), append(body, NIL))));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // Definitions
    public static SubLObject do_rules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rule_var = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        rule_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : $$$mapping_Cyc_rules;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL == progress_message) {
            return listS(DO_ITERATOR, list(rule_var, $list7, $DONE, done), append(body, NIL));
        }
        final SubLObject message_var = $sym8$MESSAGE_VAR;
        final SubLObject total = $sym9$TOTAL;
        final SubLObject sofar = $sym10$SOFAR;
        return list(CLET, list(list(message_var, progress_message), bq_cons(total, $list12), bq_cons(sofar, $list13)), list(NOTING_PERCENT_PROGRESS, message_var, listS(DO_RULES, list(rule_var, $PROGRESS_MESSAGE, NIL, $DONE, done), list(CINC, sofar), list(NOTE_PERCENT_PROGRESS, sofar, total), append(body, NIL))));
    }

    public static final SubLObject do_gafs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt18);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject gaf_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt18);
                    gaf_var = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt18);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt18);
                            if (NIL == member(current_2, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt18);
                        }
                        {
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : $$$mapping_Cyc_GAFs;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(DO_ASSERTIONS, list(gaf_var, progress_message, $DONE, done), listS(PWHEN, list($sym22$GAF_ASSERTION_, gaf_var), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_gafs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gaf_var = NIL;
        destructuring_bind_must_consp(current, datum, $list18);
        gaf_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list18);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list18);
            if (NIL == member(current_$2, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list18);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : $$$mapping_Cyc_GAFs;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(DO_ASSERTIONS, list(gaf_var, progress_message, $DONE, done), listS(PWHEN, list($sym22$GAF_ASSERTION_, gaf_var), append(body, NIL)));
    }

    public static SubLObject do_assertions_backwards(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list23);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        assertion_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list23);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list23);
            if (NIL == member(current_$3, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list23);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (!progress_message.isAtom()) {
            final SubLObject progress_message_var = $sym24$PROGRESS_MESSAGE_VAR;
            return list(CLET, list(list(progress_message_var, progress_message)), listS(DO_ASSERTIONS_BACKWARDS, list(assertion_var, $PROGRESS_MESSAGE, progress_message_var, $DONE, done), append(body, NIL)));
        }
        if (NIL != progress_message) {
            final SubLObject sofar_var = $sym26$SOFAR_VAR;
            final SubLObject total_var = $sym27$TOTAL_VAR;
            return list(CLET, list(bq_cons(total_var, $list28), bq_cons(sofar_var, $list13)), list(NOTING_PERCENT_PROGRESS, progress_message, listS(DO_ASSERTIONS_BACKWARDS, list(assertion_var, $DONE, done), list(NOTE_PERCENT_PROGRESS, sofar_var, total_var), list(CINC, sofar_var), append(body, NIL))));
        }
        final SubLObject id_var = $sym29$ID_VAR;
        return list(DO_NUMBERS, list(new SubLObject[]{ id_var, $START, $list32, $END, MINUS_ONE_INTEGER, $DELTA, MINUS_ONE_INTEGER, $DONE, done }), list(CLET, list(list(assertion_var, list(FIND_ASSERTION_BY_ID, id_var))), listS(PWHEN, assertion_var, append(body, NIL))));
    }

    public static final SubLObject do_assertion_dependent_assertions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject dependent_assertion = NIL;
                    SubLObject assertion = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt23);
                    dependent_assertion = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt23);
                    assertion = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject deduction = $sym24$DEDUCTION;
                            return list(DO_ASSERTION_DEPENDENTS, list(deduction, assertion), list(CLET, list(list(dependent_assertion, list(DEDUCTION_ASSERTION, deduction))), listS(PWHEN, list(ASSERTION_P, dependent_assertion), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt23);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_assertion_dependent_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dependent_assertion = NIL;
        SubLObject assertion = NIL;
        destructuring_bind_must_consp(current, datum, $list36);
        dependent_assertion = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        assertion = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject deduction = $sym37$DEDUCTION;
            return list(DO_ASSERTION_DEPENDENTS, list(deduction, assertion), list(CLET, list(list(dependent_assertion, list(DEDUCTION_ASSERTION, deduction))), listS(PWHEN, list(ASSERTION_P, dependent_assertion), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list36);
        return NIL;
    }

    public static final SubLObject do_assertion_supporting_assertions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt28);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject supporting_assertion = NIL;
                    SubLObject assertion = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    supporting_assertion = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt28);
                    assertion = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt28);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt28);
                            if (NIL == member(current_3, $list_alt29, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt28);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject argument = $sym30$ARGUMENT;
                                return list(DO_ASSERTION_ARGUMENTS, list(argument, assertion, $DONE, done), list(PWHEN, list(DEDUCTION_P, argument), list(DO_DEDUCTION_SUPPORTS, list(supporting_assertion, argument, $DONE, done), listS(PWHEN, list(ASSERTION_P, supporting_assertion), append(body, NIL)))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_assertion_supporting_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject supporting_assertion = NIL;
        SubLObject assertion = NIL;
        destructuring_bind_must_consp(current, datum, $list41);
        supporting_assertion = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list41);
        assertion = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list41);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list41);
            if (NIL == member(current_$4, $list42, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list41);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject argument = $sym43$ARGUMENT;
        return list(DO_ASSERTION_ARGUMENTS, list(argument, assertion, $DONE, done), list(PWHEN, list(DEDUCTION_P, argument), list(DO_DEDUCTION_SUPPORTS, list(supporting_assertion, argument, $DONE, done), listS(PWHEN, list(ASSERTION_P, supporting_assertion), append(body, NIL)))));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a list of HL assertions.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a list of HL assertions.")
    public static final SubLObject assertion_list_p_alt(SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            {
                SubLObject cdolist_list_var = v_object;
                SubLObject subobject = NIL;
                for (subobject = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subobject = cdolist_list_var.first()) {
                    if (NIL == assertion_handles.assertion_p(subobject)) {
                        return NIL;
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a list of HL assertions.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a list of HL assertions.")
    public static SubLObject assertion_list_p(final SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject subobject = NIL;
            subobject = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == assertion_handles.assertion_p(subobject)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                subobject = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a list of HL rule assertions.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a list of HL rule assertions.")
    public static final SubLObject list_of_rule_assertion_p_alt(SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            {
                SubLObject cdolist_list_var = v_object;
                SubLObject subobject = NIL;
                for (subobject = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subobject = cdolist_list_var.first()) {
                    if (NIL == assertions_high.rule_assertionP(subobject)) {
                        return NIL;
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a list of HL rule assertions.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a list of HL rule assertions.")
    public static SubLObject list_of_rule_assertion_p(final SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject subobject = NIL;
            subobject = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == assertions_high.rule_assertionP(subobject)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                subobject = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    /**
     * Return a list of all assertions that have some supporting argument
     * that is a deduction that is dependent on ASSERTION.
     */
    @LispMethod(comment = "Return a list of all assertions that have some supporting argument\r\nthat is a deduction that is dependent on ASSERTION.\nReturn a list of all assertions that have some supporting argument\nthat is a deduction that is dependent on ASSERTION.")
    public static final SubLObject assertion_dependent_assertions_alt(SubLObject assertion) {
        if (NIL != assertions_high.assertion_has_dependents_p(assertion)) {
            {
                SubLObject dependents = assertions_high.assertion_dependents(assertion);
                SubLObject result_set = set_contents.new_set_contents(length(dependents), symbol_function(EQ));
                SubLObject cdolist_list_var = dependents;
                SubLObject deduction = NIL;
                for (deduction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , deduction = cdolist_list_var.first()) {
                    {
                        SubLObject dependent_assertion = deductions_high.deduction_assertion(deduction);
                        result_set = set_contents.set_contents_add(dependent_assertion, result_set, symbol_function(EQ));
                    }
                }
                return set_contents.set_contents_element_list(result_set);
            }
        }
        return NIL;
    }

    /**
     * Return a list of all assertions that have some supporting argument
     * that is a deduction that is dependent on ASSERTION.
     */
    @LispMethod(comment = "Return a list of all assertions that have some supporting argument\r\nthat is a deduction that is dependent on ASSERTION.\nReturn a list of all assertions that have some supporting argument\nthat is a deduction that is dependent on ASSERTION.")
    public static SubLObject assertion_dependent_assertions(final SubLObject assertion) {
        if (NIL != assertions_high.assertion_has_dependents_p(assertion)) {
            SubLObject result_set = set_contents.new_set_contents(assertions_high.assertion_dependent_count(assertion), symbol_function(EQL));
            final SubLObject set_contents_var = assertions_high.assertion_dependents(assertion);
            SubLObject basis_object;
            SubLObject state;
            SubLObject deduction;
            SubLObject dependent_supported_object;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                deduction = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                    dependent_supported_object = deductions_high.deduction_supported_object(deduction);
                    if (NIL != assertion_handles.assertion_p(dependent_supported_object)) {
                        result_set = set_contents.set_contents_add(dependent_supported_object, result_set, symbol_function(EQL));
                    }
                }
            }
            return set_contents.set_contents_element_list(result_set);
        }
        return NIL;
    }

    public static SubLObject remove_relevant_assertion_dependents(final SubLObject assertion, final SubLObject possibly_relevant_mt) {
        return remove_relevant_assertions_dependents(list(assertion), possibly_relevant_mt);
    }

    public static SubLObject remove_relevant_assertions_dependents(final SubLObject assertions, final SubLObject possibly_relevant_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject checked_deduction_count = ZERO_INTEGER;
        SubLObject removed_deduction_count = ZERO_INTEGER;
        SubLObject checked_deductions = set_contents.new_set_contents(UNPROVIDED, UNPROVIDED);
        SubLObject deductions_to_check = NIL;
        SubLObject deductions_to_remove = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject set_contents_var = assertions_high.assertion_dependents(assertion);
            SubLObject basis_object;
            SubLObject state;
            SubLObject dependent;
            SubLObject item_var;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                dependent = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, dependent)) {
                    item_var = dependent;
                    if (NIL == member(item_var, deductions_to_check, symbol_function(EQL), symbol_function(IDENTITY))) {
                        deductions_to_check = cons(item_var, deductions_to_check);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        SubLObject _prev_bind_0 = $percent_progress_delayed_mode_seconds$.currentBinding(thread);
        SubLObject _prev_bind_2 = $percent_progress_delayed_mode_string$.currentBinding(thread);
        SubLObject _prev_bind_3 = $last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_4 = $last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_5 = $within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_6 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $percent_progress_delayed_mode_seconds$.bind(THREE_INTEGER, thread);
            $percent_progress_delayed_mode_string$.bind(cconcatenate($str47$Gathering_mt_relevant_dependents_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(assertions)), $$$_assertions }), thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(cconcatenate($str47$Gathering_mt_relevant_dependents_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(assertions)), $$$_assertions }));
                while (NIL != deductions_to_check) {
                    final SubLObject deduction = deductions_to_check.first();
                    deductions_to_check = deductions_to_check.rest();
                    if ((NIL != assertion_handles.assertion_p(deductions_high.deduction_supported_object(deduction))) && (NIL != sksi_infrastructure_utilities.mt_relevant_to_mt_memoizedP(deductions_high.deduction_mt(deduction), possibly_relevant_mt, UNPROVIDED))) {
                        final SubLObject possible_assertion = deductions_high.deduction_supported_object(deduction);
                        SubLObject deduction_excepting_its_own_supportP = NIL;
                        if (((NIL != assertion_handles.assertion_p(possible_assertion)) && (NIL != gaf_assertion_with_pred_p(possible_assertion, $$except))) && (NIL != list_utilities.member_equalP(assertions_high.gaf_arg1(possible_assertion), deductions_high.deduction_supports(deduction)))) {
                            deduction_excepting_its_own_supportP = T;
                        }
                        if (NIL == deduction_excepting_its_own_supportP) {
                            deductions_to_remove = cons(deduction, deductions_to_remove);
                        }
                    }
                    SubLObject cdolist_list_var2 = deduction_dependent_deductions(deduction);
                    SubLObject sub_deduction = NIL;
                    sub_deduction = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        if (NIL == set_contents.set_contents_memberP(sub_deduction, checked_deductions, UNPROVIDED)) {
                            deductions_to_check = cons(sub_deduction, deductions_to_check);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        sub_deduction = cdolist_list_var2.first();
                    } 
                    checked_deductions = set_contents.set_contents_add(deduction, checked_deductions, UNPROVIDED);
                    checked_deduction_count = add(checked_deduction_count, ONE_INTEGER);
                    note_percent_progress(set_contents.set_contents_size(checked_deductions), add(set_contents.set_contents_size(checked_deductions), length(deductions_to_check)));
                } 
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_6, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_5, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_4, thread);
            $last_percent_progress_index$.rebind(_prev_bind_3, thread);
            $percent_progress_delayed_mode_string$.rebind(_prev_bind_2, thread);
            $percent_progress_delayed_mode_seconds$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = $percent_progress_delayed_mode_seconds$.currentBinding(thread);
        _prev_bind_2 = $percent_progress_delayed_mode_string$.currentBinding(thread);
        _prev_bind_3 = $last_percent_progress_index$.currentBinding(thread);
        _prev_bind_4 = $last_percent_progress_prediction$.currentBinding(thread);
        _prev_bind_5 = $within_noting_percent_progress$.currentBinding(thread);
        _prev_bind_6 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $percent_progress_delayed_mode_seconds$.bind(THREE_INTEGER, thread);
            $percent_progress_delayed_mode_string$.bind(cconcatenate($$$Removing_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(deductions_to_remove)), $str51$_mt_relevant_dependents }), thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(cconcatenate($$$Removing_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(deductions_to_remove)), $str51$_mt_relevant_dependents }));
                SubLObject cdolist_list_var3 = deductions_to_remove;
                SubLObject deduction2 = NIL;
                deduction2 = cdolist_list_var3.first();
                while (NIL != cdolist_list_var3) {
                    if (NIL != deduction_handles.valid_deductionP(deduction2, UNPROVIDED)) {
                        tms.tms_remove_deduction(deduction2);
                        removed_deduction_count = add(removed_deduction_count, ONE_INTEGER);
                    }
                    cdolist_list_var3 = cdolist_list_var3.rest();
                    deduction2 = cdolist_list_var3.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_6, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_5, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_4, thread);
            $last_percent_progress_index$.rebind(_prev_bind_3, thread);
            $percent_progress_delayed_mode_string$.rebind(_prev_bind_2, thread);
            $percent_progress_delayed_mode_seconds$.rebind(_prev_bind_0, thread);
        }
        return removed_deduction_count;
    }

    public static SubLObject deduction_dependent_deductions(final SubLObject deduction) {
        final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
        if (NIL != assertion_handles.assertion_p(supported_object)) {
            return assertions_high.assertion_dependent_list(supported_object);
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(supported_object)) {
            return kb_hl_supports_interface.kb_kb_hl_support_dependents(supported_object);
        }
        if (NIL == arguments.hl_support_p(supported_object)) {
            Errors.warn($str53$deduction_dependent_deductions_ca, deduction_handles.deduction_id(deduction), supported_object);
            return NIL;
        }
        final SubLObject kb_hl_support = kb_hl_supports_high.find_kb_hl_support(supported_object);
        if (NIL == kb_hl_support) {
            Errors.warn($str52$Deduction__A_supporting_missing_K, deduction, supported_object);
            return NIL;
        }
        return kb_hl_supports_interface.kb_kb_hl_support_dependents(kb_hl_support);
    }

    public static SubLObject assertion_dependent_supported_object_counts(final SubLObject assertion) {
        if (NIL != assertions_high.assertion_has_dependents_p(assertion)) {
            SubLObject assertion_set = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQL));
            SubLObject kb_hl_support_set = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQUAL));
            SubLObject clause_struct_set = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQL));
            final SubLObject set_contents_var = assertions_high.assertion_dependents(assertion);
            SubLObject basis_object;
            SubLObject state;
            SubLObject deduction;
            SubLObject dependent_supported_object;
            SubLObject clause_struct;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                deduction = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                    dependent_supported_object = deductions_high.deduction_supported_object(deduction);
                    if (NIL != assertion_handles.assertion_p(dependent_supported_object)) {
                        assertion_set = set_contents.set_contents_add(dependent_supported_object, assertion_set, symbol_function(EQL));
                        clause_struct = assertions_low.assertion_clause_struc(dependent_supported_object);
                        if (NIL != clause_struct) {
                            clause_struct_set = set_contents.set_contents_add(clause_struct, clause_struct_set, UNPROVIDED);
                        } else {
                            clause_struct_set = set_contents.set_contents_add(dependent_supported_object, clause_struct_set, UNPROVIDED);
                        }
                    } else
                        if (NIL != kb_hl_support_handles.kb_hl_support_p(dependent_supported_object)) {
                            kb_hl_support_set = set_contents.set_contents_add(dependent_supported_object, kb_hl_support_set, symbol_function(EQUAL));
                        } else
                            if (NIL != arguments.hl_support_p(dependent_supported_object)) {
                                kb_hl_support_set = set_contents.set_contents_add(dependent_supported_object, kb_hl_support_set, symbol_function(EQUAL));
                            }


                }
            }
            return values(set_contents.set_contents_size(assertion_set), set_contents.set_contents_size(kb_hl_support_set), set_contents.set_contents_size(clause_struct_set));
        }
        return values(ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER);
    }

    public static final SubLObject true_assertionP_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertions_high.assertion_has_truthP(assertion, $TRUE)));
    }

    public static SubLObject true_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertions_high.assertion_has_truthP(assertion, $TRUE)));
    }

    public static final SubLObject false_assertionP_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertions_high.assertion_has_truthP(assertion, $FALSE)));
    }

    public static SubLObject false_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertions_high.assertion_has_truthP(assertion, $FALSE)));
    }

    public static final SubLObject unknown_assertionP_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertions_high.assertion_has_truthP(assertion, $UNKNOWN)));
    }

    public static SubLObject unknown_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertions_high.assertion_has_truthP(assertion, $UNKNOWN)));
    }

    public static final SubLObject true_gaf_assertionP_alt(SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != com.cyc.cycjava.cycl.assertion_utilities.true_assertionP(v_object)));
    }

    public static SubLObject true_gaf_assertionP(final SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != true_assertionP(v_object)));
    }

    public static final SubLObject false_gaf_assertionP_alt(SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != com.cyc.cycjava.cycl.assertion_utilities.false_assertionP(v_object)));
    }

    public static SubLObject false_gaf_assertionP(final SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != false_assertionP(v_object)));
    }

    /**
     * Return T iff ASSERTION is an (HL) #$CycLNLSemanticAssertion
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Return T iff ASSERTION is an (HL) #$CycLNLSemanticAssertion\r\n\r\n@unknown baxter")
    public static final SubLObject nl_semantic_assertionP_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != isa.isa_in_any_mtP(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion)), $$NLSemanticPredicate)));
    }

    /**
     * Return T iff ASSERTION is an (HL) #$CycLNLSemanticAssertion
     *
     * @unknown baxter
     */
    @LispMethod(comment = "Return T iff ASSERTION is an (HL) #$CycLNLSemanticAssertion\r\n\r\n@unknown baxter")
    public static SubLObject nl_semantic_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != isa.isa_in_any_mtP(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion)), $$NLSemanticPredicate)));
    }

    public static SubLObject obsolete_ruleP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            return numG(kb_indexing.num_gaf_arg_index(assertion, ONE_INTEGER, $$obsoleteRule, UNPROVIDED), ZERO_INTEGER);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject assertion_matches_typeP_alt(SubLObject assertion, SubLObject type_spec) {
        return makeBoolean((NIL == type_spec) || (NIL != assertions_high.assertion_has_typeP(assertion, type_spec)));
    }

    public static SubLObject assertion_matches_typeP(final SubLObject assertion, final SubLObject type_spec) {
        return makeBoolean((NIL == type_spec) || (NIL != assertions_high.assertion_has_typeP(assertion, type_spec)));
    }

    public static final SubLObject assertion_matches_truthP_alt(SubLObject assertion, SubLObject truth_spec) {
        return makeBoolean((NIL == truth_spec) || (NIL != assertions_high.assertion_has_truth(assertion, truth_spec)));
    }

    public static SubLObject assertion_matches_truthP(final SubLObject assertion, final SubLObject truth_spec) {
        return makeBoolean((NIL == truth_spec) || (NIL != assertions_high.assertion_has_truth(assertion, truth_spec)));
    }

    public static final SubLObject assertion_matches_directionP_alt(SubLObject assertion, SubLObject direction_spec) {
        return makeBoolean((NIL == direction_spec) || (NIL != assertions_high.assertion_has_direction(assertion, direction_spec)));
    }

    public static SubLObject assertion_matches_directionP(final SubLObject assertion, final SubLObject direction_spec) {
        return makeBoolean((NIL == direction_spec) || (NIL != assertions_high.assertion_has_direction(assertion, direction_spec)));
    }

    public static final SubLObject assertion_matches_truth_and_directionP_alt(SubLObject assertion, SubLObject truth_spec, SubLObject direction_spec) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.assertion_utilities.assertion_matches_truthP(assertion, truth_spec)) && (NIL != com.cyc.cycjava.cycl.assertion_utilities.assertion_matches_directionP(assertion, direction_spec)));
    }

    public static SubLObject assertion_matches_truth_and_directionP(final SubLObject assertion, final SubLObject truth_spec, final SubLObject direction_spec) {
        return makeBoolean((NIL != assertion_matches_truthP(assertion, truth_spec)) && (NIL != assertion_matches_directionP(assertion, direction_spec)));
    }

    public static final SubLObject assertion_matches_type_truth_and_directionP_alt(SubLObject assertion, SubLObject type_spec, SubLObject truth_spec, SubLObject direction_spec) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.assertion_utilities.assertion_matches_typeP(assertion, type_spec)) && (NIL != com.cyc.cycjava.cycl.assertion_utilities.assertion_matches_truthP(assertion, truth_spec))) && (NIL != com.cyc.cycjava.cycl.assertion_utilities.assertion_matches_directionP(assertion, direction_spec)));
    }

    public static SubLObject assertion_matches_type_truth_and_directionP(final SubLObject assertion, final SubLObject type_spec, final SubLObject truth_spec, final SubLObject direction_spec) {
        return makeBoolean(((NIL != assertion_matches_typeP(assertion, type_spec)) && (NIL != assertion_matches_truthP(assertion, truth_spec))) && (NIL != assertion_matches_directionP(assertion, direction_spec)));
    }

    public static final SubLObject gaf_has_term_in_argnumP_alt(SubLObject assertion, SubLObject v_term, SubLObject argnum) {
        {
            SubLObject arg = assertions_high.gaf_arg(assertion, argnum);
            return equal(v_term, arg);
        }
    }

    public static SubLObject gaf_has_term_in_argnumP(final SubLObject assertion, final SubLObject v_term, final SubLObject argnum) {
        final SubLObject arg = assertions_high.gaf_arg(assertion, argnum);
        return equal(v_term, arg);
    }

    /**
     *
     *
     * @return booleanp; whether ASSERTION has TERM as one of its top-level arguments.
     */
    @LispMethod(comment = "@return booleanp; whether ASSERTION has TERM as one of its top-level arguments.")
    public static final SubLObject gaf_has_term_in_some_argnumP_alt(SubLObject assertion, SubLObject v_term) {
        return term_is_one_of_argsP(v_term, assertions_high.gaf_formula(assertion));
    }

    /**
     *
     *
     * @return booleanp; whether ASSERTION has TERM as one of its top-level arguments.
     */
    @LispMethod(comment = "@return booleanp; whether ASSERTION has TERM as one of its top-level arguments.")
    public static SubLObject gaf_has_term_in_some_argnumP(final SubLObject assertion, final SubLObject v_term) {
        return term_is_one_of_argsP(v_term, assertions_high.gaf_formula(assertion));
    }

    public static SubLObject true_gaf_assertion_with_pred_p(final SubLObject assertion, final SubLObject pred) {
        return makeBoolean((NIL != true_assertionP(assertion)) && pred.eql(assertions_high.gaf_predicate(assertion)));
    }

    /**
     *
     *
     * @return boolean; t iff ASSERTION is a gaf with PRED as its arg0.
    Assumes equality can be tested with #'eq.
     */
    @LispMethod(comment = "@return boolean; t iff ASSERTION is a gaf with PRED as its arg0.\r\nAssumes equality can be tested with #\'eq.")
    public static final SubLObject gaf_assertion_with_pred_p_alt(SubLObject assertion, SubLObject pred) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(assertion)) && (pred == assertions_high.gaf_predicate(assertion)));
    }

    /**
     *
     *
     * @return boolean; t iff ASSERTION is a gaf with PRED as its arg0.
    Assumes equality can be tested with #'eq.
     */
    @LispMethod(comment = "@return boolean; t iff ASSERTION is a gaf with PRED as its arg0.\r\nAssumes equality can be tested with #\'eq.")
    public static SubLObject gaf_assertion_with_pred_p(final SubLObject assertion, final SubLObject pred) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(assertion)) && pred.eql(assertions_high.gaf_predicate(assertion)));
    }

    /**
     *
     *
     * @return boolean; t iff GAF-ASSERTION has PRED as its arg0.
    Assumes that GAF-ASSERTION is a gaf and that equality can be tested with #'eq.
     */
    @LispMethod(comment = "@return boolean; t iff GAF-ASSERTION has PRED as its arg0.\r\nAssumes that GAF-ASSERTION is a gaf and that equality can be tested with #\'eq.")
    public static final SubLObject gaf_assertion_has_pred_p_alt(SubLObject gaf_assertion, SubLObject pred) {
        return eq(pred, assertions_high.gaf_predicate(gaf_assertion));
    }

    /**
     *
     *
     * @return boolean; t iff GAF-ASSERTION has PRED as its arg0.
    Assumes that GAF-ASSERTION is a gaf and that equality can be tested with #'eq.
     */
    @LispMethod(comment = "@return boolean; t iff GAF-ASSERTION has PRED as its arg0.\r\nAssumes that GAF-ASSERTION is a gaf and that equality can be tested with #\'eq.")
    public static SubLObject gaf_assertion_has_pred_p(final SubLObject gaf_assertion, final SubLObject pred) {
        return eql(pred, assertions_high.gaf_predicate(gaf_assertion));
    }

    /**
     *
     *
     * @return boolean; t iff ASSERTION is a gaf with any pred in PRED-LIST as its arg0.
    Assumes equality can be tested with #'eq.
     */
    @LispMethod(comment = "@return boolean; t iff ASSERTION is a gaf with any pred in PRED-LIST as its arg0.\r\nAssumes equality can be tested with #\'eq.")
    public static final SubLObject gaf_assertion_with_any_of_preds_p_alt(SubLObject assertion, SubLObject pred_list) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            return subl_promotions.memberP(assertions_high.gaf_predicate(assertion), pred_list, symbol_function(EQ), UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff ASSERTION is a gaf with any pred in PRED-LIST as its arg0.
    Assumes equality can be tested with #'eq.
     */
    @LispMethod(comment = "@return boolean; t iff ASSERTION is a gaf with any pred in PRED-LIST as its arg0.\r\nAssumes equality can be tested with #\'eq.")
    public static SubLObject gaf_assertion_with_any_of_preds_p(final SubLObject assertion, final SubLObject pred_list) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            return subl_promotions.memberP(assertions_high.gaf_predicate(assertion), pred_list, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff ASSERTION is a gaf with #$isa as its arg0.
     */
    @LispMethod(comment = "@return boolean; t iff ASSERTION is a gaf with #$isa as its arg0.")
    public static final SubLObject isa_gaf_p_alt(SubLObject assertion) {
        return com.cyc.cycjava.cycl.assertion_utilities.gaf_assertion_with_pred_p(assertion, $$isa);
    }

    /**
     *
     *
     * @return boolean; t iff ASSERTION is a gaf with #$isa as its arg0.
     */
    @LispMethod(comment = "@return boolean; t iff ASSERTION is a gaf with #$isa as its arg0.")
    public static SubLObject isa_gaf_p(final SubLObject assertion) {
        return gaf_assertion_with_pred_p(assertion, $$isa);
    }

    /**
     *
     *
     * @return boolean; t iff ASSERTION is a gaf with #$genls as its arg0.
     */
    @LispMethod(comment = "@return boolean; t iff ASSERTION is a gaf with #$genls as its arg0.")
    public static final SubLObject genls_gaf_p_alt(SubLObject assertion) {
        return com.cyc.cycjava.cycl.assertion_utilities.gaf_assertion_with_pred_p(assertion, $$genls);
    }

    /**
     *
     *
     * @return boolean; t iff ASSERTION is a gaf with #$genls as its arg0.
     */
    @LispMethod(comment = "@return boolean; t iff ASSERTION is a gaf with #$genls as its arg0.")
    public static SubLObject genls_gaf_p(final SubLObject assertion) {
        return gaf_assertion_with_pred_p(assertion, $$genls);
    }

    /**
     *
     *
     * @return cnf-p; the CNF for ASSERTION, with its EL variable names
    substituted back in.
     */
    @LispMethod(comment = "@return cnf-p; the CNF for ASSERTION, with its EL variable names\r\nsubstituted back in.")
    public static final SubLObject assertion_cnf_with_el_vars_only_alt(SubLObject assertion) {
        return cycl_utilities.cnf_sublis_el_variables(assertions_high.assertion_cnf(assertion), assertions_high.assertion_el_variables(assertion));
    }

    /**
     *
     *
     * @return cnf-p; the CNF for ASSERTION, with its EL variable names
    substituted back in.
     */
    @LispMethod(comment = "@return cnf-p; the CNF for ASSERTION, with its EL variable names\r\nsubstituted back in.")
    public static SubLObject assertion_cnf_with_el_vars_only(final SubLObject assertion) {
        return cycl_utilities.cnf_sublis_el_variables(assertions_high.assertion_cnf(assertion), assertions_high.assertion_el_variables(assertion));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a rule assertion concluding to #$abnormal,
    which must have been canonicalized from an #$exceptWhen meta-assertion.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a rule assertion concluding to #$abnormal,\r\nwhich must have been canonicalized from an #$exceptWhen meta-assertion.")
    public static final SubLObject except_when_rule_p_alt(SubLObject v_object) {
        if (NIL != assertions_high.rule_assertionP(v_object)) {
            {
                SubLObject cdolist_list_var = clauses.pos_lits(assertions_high.assertion_cnf(v_object));
                SubLObject pos_lit = NIL;
                for (pos_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos_lit = cdolist_list_var.first()) {
                    if (NIL != el_abnormal_p(pos_lit)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a rule assertion concluding to #$abnormal,
    which must have been canonicalized from an #$exceptWhen meta-assertion.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a rule assertion concluding to #$abnormal,\r\nwhich must have been canonicalized from an #$exceptWhen meta-assertion.")
    public static SubLObject except_when_rule_p(final SubLObject v_object) {
        if (NIL != assertions_high.rule_assertionP(v_object)) {
            SubLObject cdolist_list_var = clauses.pos_lits(assertions_high.assertion_cnf(v_object));
            SubLObject pos_lit = NIL;
            pos_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != el_abnormal_p(pos_lit)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                pos_lit = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a gaf assertion with a predicate of #$abnormal,
    which must have been canonicalized from an #$exceptFor meta-assertion.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a gaf assertion with a predicate of #$abnormal,\r\nwhich must have been canonicalized from an #$exceptFor meta-assertion.")
    public static final SubLObject except_for_gaf_p_alt(SubLObject v_object) {
        if (NIL != assertions_high.gaf_assertionP(v_object)) {
            if (NIL != el_abnormal_p(assertions_high.gaf_formula(v_object))) {
                return T;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a gaf assertion with a predicate of #$abnormal,
    which must have been canonicalized from an #$exceptFor meta-assertion.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a gaf assertion with a predicate of #$abnormal,\r\nwhich must have been canonicalized from an #$exceptFor meta-assertion.")
    public static SubLObject except_for_gaf_p(final SubLObject v_object) {
        if ((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != el_abnormal_p(assertions_high.gaf_formula(v_object)))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject abnormal_assertion_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.assertion_utilities.except_when_rule_p(v_object)) || (NIL != com.cyc.cycjava.cycl.assertion_utilities.except_for_gaf_p(v_object)));
    }

    public static SubLObject abnormal_assertion_p(final SubLObject v_object) {
        return makeBoolean((NIL != except_when_rule_p(v_object)) || (NIL != except_for_gaf_p(v_object)));
    }

    /**
     *
     *
     * @unknown the #$abnormal literal in ASSERTION.
     */
    @LispMethod(comment = "@unknown the #$abnormal literal in ASSERTION.")
    public static final SubLObject abnormal_literal_from_assertion_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ABNORMAL_ASSERTION_P);
        if (NIL != com.cyc.cycjava.cycl.assertion_utilities.except_for_gaf_p(assertion)) {
            return clause_utilities.gaf_cnf_literal(assertions_high.assertion_cnf(assertion));
        } else {
            {
                SubLObject cdolist_list_var = clauses.pos_lits(assertions_high.assertion_cnf(assertion));
                SubLObject pos_lit = NIL;
                for (pos_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos_lit = cdolist_list_var.first()) {
                    if (NIL != el_abnormal_p(pos_lit)) {
                        return pos_lit;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown the #$abnormal literal in ASSERTION.
     */
    @LispMethod(comment = "@unknown the #$abnormal literal in ASSERTION.")
    public static SubLObject abnormal_literal_from_assertion(final SubLObject assertion) {
        assert NIL != abnormal_assertion_p(assertion) : "! assertion_utilities.abnormal_assertion_p(assertion) " + ("assertion_utilities.abnormal_assertion_p(assertion) " + "CommonSymbols.NIL != assertion_utilities.abnormal_assertion_p(assertion) ") + assertion;
        if (NIL != except_for_gaf_p(assertion)) {
            return clause_utilities.gaf_cnf_literal(assertions_high.assertion_cnf(assertion));
        }
        SubLObject cdolist_list_var = clauses.pos_lits(assertions_high.assertion_cnf(assertion));
        SubLObject pos_lit = NIL;
        pos_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_abnormal_p(pos_lit)) {
                return pos_lit;
            }
            cdolist_list_var = cdolist_list_var.rest();
            pos_lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject somewhere_excepted_assertionP(final SubLObject assertion, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = excepted_assertionP_int(assertion, NIL, justifyP, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject excepted_assertionP(SubLObject assertion) {
        return com.cyc.cycjava.cycl.assertion_utilities.excepted_assertionP_int(assertion, UNPROVIDED);
    }

    public static SubLObject excepted_assertionP(final SubLObject assertion, SubLObject justifyP, SubLObject depth) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = $excepted_assertion_max_depth$.getDynamicValue();
        }
        if (NIL != mt_relevance_macros.any_or_all_mts_are_relevantP()) {
            return NIL;
        }
        return excepted_assertionP_int(assertion, NIL, justifyP, depth);
    }

    public static SubLObject excepted_assertion_in_any_mtP(final SubLObject assertion, SubLObject justifyP, SubLObject depth) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = $excepted_assertion_max_depth$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            return excepted_assertionP_int(assertion, NIL, justifyP, depth);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }

    /**
     * Check whether ASSERTION is excepted in the current mt context.
     */
    @LispMethod(comment = "Check whether ASSERTION is excepted in the current mt context.")
    public static final SubLObject excepted_assertionP_int(SubLObject assertion, SubLObject checked_assertions) {
        if (checked_assertions == UNPROVIDED) {
            checked_assertions = NIL;
        }
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL == assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != list_utilities.member_eqP(assertion, checked_assertions)) {
            return NIL;
        }
        checked_assertions = cons(assertion, checked_assertions);
        {
            SubLObject excepted_assertionP = NIL;
            SubLObject mt = assertions_high.assertion_mt(assertion);
            if ((NIL != forts.fort_p(mt)) && (NIL != somewhere_cache.some_pred_assertion_somewhereP($$exceptMt, mt, ONE_INTEGER, UNPROVIDED))) {
                {
                    SubLObject exceptions = kb_mapping_utilities.pred_value_gafs(mt, $$exceptMt, ONE_INTEGER, UNPROVIDED);
                    if (NIL == excepted_assertionP) {
                        {
                            SubLObject csome_list_var = exceptions;
                            SubLObject exception = NIL;
                            for (exception = csome_list_var.first(); !((NIL != excepted_assertionP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , exception = csome_list_var.first()) {
                                if (NIL == com.cyc.cycjava.cycl.assertion_utilities.excepted_assertionP_int(exception, checked_assertions)) {
                                    excepted_assertionP = T;
                                }
                            }
                        }
                    }
                }
            }
            if (NIL == excepted_assertionP) {
                if (NIL != somewhere_cache.some_pred_assertion_somewhereP($$except, assertion, ONE_INTEGER, UNPROVIDED)) {
                    {
                        SubLObject exceptions = kb_mapping_utilities.pred_value_gafs(assertion, $$except, ONE_INTEGER, UNPROVIDED);
                        if (NIL == excepted_assertionP) {
                            {
                                SubLObject csome_list_var = exceptions;
                                SubLObject exception = NIL;
                                for (exception = csome_list_var.first(); !((NIL != excepted_assertionP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , exception = csome_list_var.first()) {
                                    if (NIL == com.cyc.cycjava.cycl.assertion_utilities.excepted_assertionP_int(exception, checked_assertions)) {
                                        excepted_assertionP = T;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (NIL == excepted_assertionP) {
                {
                    SubLObject non_excepted_support_foundP = NIL;
                    SubLObject rest = NIL;
                    for (rest = assertions_high.assertion_arguments(assertion); !((NIL != non_excepted_support_foundP) || (NIL == rest)); rest = rest.rest()) {
                        {
                            SubLObject argument = rest.first();
                            if (NIL != asserted_argument_p(argument)) {
                                non_excepted_support_foundP = T;
                            } else {
                                {
                                    SubLObject excepted_support_foundP = NIL;
                                    SubLObject rest_4 = NIL;
                                    for (rest_4 = deductions_high.deduction_supports(argument); !((NIL != excepted_support_foundP) || (NIL == rest_4)); rest_4 = rest_4.rest()) {
                                        {
                                            SubLObject support = rest_4.first();
                                            if ((NIL != assertion_handles.assertion_p(support)) && (NIL != com.cyc.cycjava.cycl.assertion_utilities.excepted_assertionP_int(support, checked_assertions))) {
                                                excepted_support_foundP = T;
                                            }
                                        }
                                    }
                                    if (NIL == excepted_support_foundP) {
                                        non_excepted_support_foundP = T;
                                    }
                                }
                            }
                        }
                    }
                    excepted_assertionP = makeBoolean(NIL == non_excepted_support_foundP);
                }
            }
            return excepted_assertionP;
        }
    }

    public static SubLObject excepted_assertionP_int(final SubLObject assertion, SubLObject checked_assertions, SubLObject justifyP, SubLObject depth) {
        if (checked_assertions == UNPROVIDED) {
            checked_assertions = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (depth.isInteger() && depth.numLE(ZERO_INTEGER)) {
            return NIL;
        }
        if (NIL == assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
            return NIL;
        }
        if (NIL == checked_assertions) {
            checked_assertions = set.new_set(symbol_function(EQL), ZERO_INTEGER);
        }
        if (NIL != set.set_memberP(assertion, checked_assertions)) {
            return NIL;
        }
        set.set_add(assertion, checked_assertions);
        SubLObject excepted_assertionP = NIL;
        SubLObject justification = NIL;
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        if ((NIL != forts.fort_p(mt)) && (NIL != somewhere_cache.some_pred_assertion_somewhereP($$exceptMt, mt, ONE_INTEGER, UNPROVIDED))) {
            final SubLObject exceptions = kb_mapping_utilities.pred_value_gafs(mt, $$exceptMt, ONE_INTEGER, UNPROVIDED);
            if (NIL == excepted_assertionP) {
                SubLObject csome_list_var = exceptions;
                SubLObject exception = NIL;
                exception = csome_list_var.first();
                while ((NIL == excepted_assertionP) && (NIL != csome_list_var)) {
                    if (NIL == excepted_assertionP_int(exception, checked_assertions, NIL, depth.isInteger() ? subtract(depth, ONE_INTEGER) : NIL)) {
                        excepted_assertionP = T;
                        final SubLObject item_var = exception;
                        if (NIL == member(item_var, justification, symbol_function(EQL), symbol_function(IDENTITY))) {
                            justification = cons(item_var, justification);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    exception = csome_list_var.first();
                } 
            }
        }
        if ((NIL == excepted_assertionP) && (NIL != somewhere_cache.some_pred_assertion_somewhereP($$except, assertion, ONE_INTEGER, UNPROVIDED))) {
            final SubLObject exceptions = kb_mapping_utilities.pred_value_gafs(assertion, $$except, ONE_INTEGER, UNPROVIDED);
            if (NIL == excepted_assertionP) {
                SubLObject csome_list_var = exceptions;
                SubLObject exception = NIL;
                exception = csome_list_var.first();
                while ((NIL == excepted_assertionP) && (NIL != csome_list_var)) {
                    if (NIL == excepted_assertionP_int(exception, checked_assertions, NIL, depth.isInteger() ? subtract(depth, ONE_INTEGER) : NIL)) {
                        excepted_assertionP = T;
                        final SubLObject item_var = exception;
                        if (NIL == member(item_var, justification, symbol_function(EQL), symbol_function(IDENTITY))) {
                            justification = cons(item_var, justification);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    exception = csome_list_var.first();
                } 
            }
        }
        if (NIL == excepted_assertionP) {
            SubLObject non_excepted_support_foundP = NIL;
            SubLObject some_excepted_support_justification = NIL;
            SubLObject rest;
            SubLObject argument;
            SubLObject excepted_support_foundP;
            SubLObject rest_$7;
            SubLObject support;
            SubLObject excepted_supportP;
            for (rest = NIL, rest = assertions_high.assertion_arguments(assertion); (NIL == non_excepted_support_foundP) && (NIL != rest); rest = rest.rest()) {
                argument = rest.first();
                if (NIL != arguments.asserted_argument_p(argument)) {
                    non_excepted_support_foundP = T;
                } else {
                    for (excepted_support_foundP = NIL, rest_$7 = NIL, rest_$7 = deductions_high.deduction_supports(argument); (NIL == excepted_support_foundP) && (NIL != rest_$7); rest_$7 = rest_$7.rest()) {
                        support = rest_$7.first();
                        if (NIL != assertion_handles.assertion_p(support)) {
                            excepted_supportP = excepted_assertionP_int(support, checked_assertions, justifyP, depth.isInteger() ? subtract(depth, ONE_INTEGER) : NIL);
                            if (NIL != excepted_supportP) {
                                excepted_support_foundP = T;
                                some_excepted_support_justification = excepted_supportP;
                            }
                        }
                    }
                    if (NIL == excepted_support_foundP) {
                        non_excepted_support_foundP = T;
                    }
                }
            }
            excepted_assertionP = makeBoolean((NIL == non_excepted_support_foundP) && (NIL != some_excepted_support_justification));
            if ((NIL != excepted_assertionP) && (NIL != justifyP)) {
                justification = some_excepted_support_justification;
            }
        }
        return NIL != justifyP ? justification : excepted_assertionP;
    }

    public static final SubLObject excepted_assertion_in_mtP(SubLObject assertion, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $relevant_mts$.currentBinding(thread);
                    try {
                        $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
                        $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
                        $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
                        result = com.cyc.cycjava.cycl.assertion_utilities.excepted_assertionP(assertion);
                    } finally {
                        $relevant_mts$.rebind(_prev_bind_2, thread);
                        $relevant_mt_function$.rebind(_prev_bind_1, thread);
                        $mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject excepted_assertion_in_mtP(final SubLObject assertion, final SubLObject mt, SubLObject justifyP, SubLObject depth) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = excepted_assertionP(assertion, justifyP, depth);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject excepted_assertion_in_mtP_shallow(final SubLObject assertion, final SubLObject mt, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = excepted_assertionP(assertion, justifyP, $excepted_assertion_shallow_max_depth$.getDynamicValue(thread));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject doomed_assertionP(final SubLObject assertion, SubLObject justifyP, SubLObject depth) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = $doomed_assertion_max_depth$.getDynamicValue();
        }
        if (NIL != mt_relevance_macros.any_or_all_mts_are_relevantP()) {
            return NIL;
        }
        return doomed_assertionP_int(assertion, NIL, justifyP, depth);
    }

    public static SubLObject doomed_assertionP_int(final SubLObject assertion, SubLObject checked_assertions, SubLObject justifyP, SubLObject depth) {
        if (checked_assertions == UNPROVIDED) {
            checked_assertions = NIL;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (depth.isInteger() && depth.numLE(ZERO_INTEGER)) {
            return NIL;
        }
        if (NIL == assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
            return NIL;
        }
        if (NIL == checked_assertions) {
            checked_assertions = set.new_set(symbol_function(EQL), ZERO_INTEGER);
        }
        if (NIL != set.set_memberP(assertion, checked_assertions)) {
            return NIL;
        }
        set.set_add(assertion, checked_assertions);
        SubLObject doomed_assertionP = NIL;
        SubLObject justification = NIL;
        if ((NIL == doomed_assertionP) && (NIL == assertions_high.assertion_arguments(assertion))) {
            doomed_assertionP = T;
            if (NIL == member(assertion, justification, symbol_function(EQL), symbol_function(IDENTITY))) {
                justification = cons(assertion, justification);
            }
        }
        if ((NIL == doomed_assertionP) && (NIL == doomed_assertionP)) {
            SubLObject csome_list_var = cycl_utilities.expression_gather(assertions_high.assertion_cnf(assertion), ASSERTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject sub_assertion = NIL;
            sub_assertion = csome_list_var.first();
            while ((NIL == doomed_assertionP) && (NIL != csome_list_var)) {
                final SubLObject doomed_supportP = doomed_assertionP_int(sub_assertion, checked_assertions, justifyP, depth.isInteger() ? subtract(depth, ONE_INTEGER) : NIL);
                if (NIL != doomed_supportP) {
                    doomed_assertionP = T;
                    final SubLObject item_var = sub_assertion;
                    if (NIL == member(item_var, justification, symbol_function(EQL), symbol_function(IDENTITY))) {
                        justification = cons(item_var, justification);
                    }
                }
                csome_list_var = csome_list_var.rest();
                sub_assertion = csome_list_var.first();
            } 
        }
        if (NIL == doomed_assertionP) {
            SubLObject non_doomed_support_foundP = NIL;
            SubLObject some_doomed_support_justification = NIL;
            SubLObject rest;
            SubLObject argument;
            SubLObject doomed_support_foundP;
            SubLObject rest_$8;
            SubLObject support;
            SubLObject doomed_supportP2;
            for (rest = NIL, rest = assertions_high.assertion_arguments(assertion); (NIL == non_doomed_support_foundP) && (NIL != rest); rest = rest.rest()) {
                argument = rest.first();
                if (NIL != arguments.asserted_argument_p(argument)) {
                    non_doomed_support_foundP = T;
                } else {
                    for (doomed_support_foundP = NIL, rest_$8 = NIL, rest_$8 = deductions_high.deduction_supports(argument); (NIL == doomed_support_foundP) && (NIL != rest_$8); rest_$8 = rest_$8.rest()) {
                        support = rest_$8.first();
                        if (NIL != assertion_handles.assertion_p(support)) {
                            doomed_supportP2 = doomed_assertionP_int(support, checked_assertions, justifyP, depth.isInteger() ? subtract(depth, ONE_INTEGER) : NIL);
                            if (NIL != doomed_supportP2) {
                                doomed_support_foundP = T;
                                some_doomed_support_justification = doomed_supportP2;
                            }
                        }
                    }
                    if (NIL == doomed_support_foundP) {
                        non_doomed_support_foundP = T;
                    }
                }
            }
            doomed_assertionP = makeBoolean((NIL == non_doomed_support_foundP) && (NIL != some_doomed_support_justification));
            if ((NIL != doomed_assertionP) && (NIL != justifyP)) {
                justification = some_doomed_support_justification;
            }
        }
        return NIL != justifyP ? justification : doomed_assertionP;
    }

    public static final SubLObject assertion_matches_mtP_alt(SubLObject assertion) {
        return relevant_mtP(assertions_high.assertion_mt(assertion));
    }

    public static SubLObject assertion_matches_mtP(final SubLObject assertion) {
        return mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(assertion));
    }

    /**
     *
     *
     * @return booleanp			; t iff ASSERTION has at least one argument for it,
    either true or false.
     */
    @LispMethod(comment = "@return booleanp\t\t\t; t iff ASSERTION has at least one argument for it,\r\neither true or false.")
    public static final SubLObject assertion_has_argumentsP_alt(SubLObject assertion) {
        return list_utilities.sublisp_boolean(assertions_high.assertion_arguments(assertion));
    }

    /**
     *
     *
     * @return booleanp			; t iff ASSERTION has at least one argument for it,
    either true or false.
     */
    @LispMethod(comment = "@return booleanp\t\t\t; t iff ASSERTION has at least one argument for it,\r\neither true or false.")
    public static SubLObject assertion_has_argumentsP(final SubLObject assertion) {
        return list_utilities.sublisp_boolean(assertions_high.assertion_arguments(assertion));
    }

    public static SubLObject assertion_argument_count(final SubLObject assertion) {
        return length(assertions_high.assertion_arguments(assertion));
    }

    /**
     * Return T iff ASSERTION has an deduction argument which contains SUPPORT
     */
    @LispMethod(comment = "Return T iff ASSERTION has an deduction argument which contains SUPPORT")
    public static final SubLObject assertion_has_deduction_with_supportP_alt(SubLObject assertion, SubLObject support) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(support, SUPPORT_P);
        {
            SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
            SubLObject deduction = NIL;
            for (deduction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , deduction = cdolist_list_var.first()) {
                if (NIL != deduction_p(deduction)) {
                    {
                        SubLObject cdolist_list_var_5 = deductions_high.deduction_supports(deduction);
                        SubLObject deduction_support = NIL;
                        for (deduction_support = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , deduction_support = cdolist_list_var_5.first()) {
                            if (NIL != support_equal(deduction_support, support)) {
                                return T;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Return T iff ASSERTION has an deduction argument which contains SUPPORT
     */
    @LispMethod(comment = "Return T iff ASSERTION has an deduction argument which contains SUPPORT")
    public static SubLObject assertion_has_deduction_with_supportP(final SubLObject assertion, final SubLObject support) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != arguments.support_p(support) : "! arguments.support_p(support) " + ("arguments.support_p(support) " + "CommonSymbols.NIL != arguments.support_p(support) ") + support;
        SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
        SubLObject deduction = NIL;
        deduction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != deduction_handles.deduction_p(deduction)) {
                SubLObject cdolist_list_var_$9 = deductions_high.deduction_supports(deduction);
                SubLObject deduction_support = NIL;
                deduction_support = cdolist_list_var_$9.first();
                while (NIL != cdolist_list_var_$9) {
                    if (NIL != arguments.support_equal(deduction_support, support)) {
                        return T;
                    }
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    deduction_support = cdolist_list_var_$9.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            deduction = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Return T iff ASSERTION has a dependent deduction which contains SUPPORT
     */
    @LispMethod(comment = "Return T iff ASSERTION has a dependent deduction which contains SUPPORT")
    public static final SubLObject assertion_has_dependent_with_supportP_alt(SubLObject assertion, SubLObject support) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(support, SUPPORT_P);
        {
            SubLObject cdolist_list_var = assertions_high.assertion_dependents(assertion);
            SubLObject deduction = NIL;
            for (deduction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , deduction = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_6 = deductions_high.deduction_supports(deduction);
                    SubLObject deduction_support = NIL;
                    for (deduction_support = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , deduction_support = cdolist_list_var_6.first()) {
                        if (NIL != support_equal(deduction_support, support)) {
                            return T;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Return T iff ASSERTION has a dependent deduction which contains SUPPORT
     */
    @LispMethod(comment = "Return T iff ASSERTION has a dependent deduction which contains SUPPORT")
    public static SubLObject assertion_has_dependent_with_supportP(final SubLObject assertion, final SubLObject support) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != arguments.support_p(support) : "! arguments.support_p(support) " + ("arguments.support_p(support) " + "CommonSymbols.NIL != arguments.support_p(support) ") + support;
        final SubLObject set_contents_var = assertions_high.assertion_dependents(assertion);
        SubLObject basis_object;
        SubLObject state;
        SubLObject deduction;
        SubLObject cdolist_list_var;
        SubLObject deduction_support;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            deduction = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                cdolist_list_var = deductions_high.deduction_supports(deduction);
                deduction_support = NIL;
                deduction_support = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != arguments.support_equal(deduction_support, support)) {
                        return T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    deduction_support = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static SubLObject assertion_has_dependent_with_supportP_kb_hl_support_aware_version(final SubLObject assertion, final SubLObject support) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != arguments.support_p(support) : "! arguments.support_p(support) " + ("arguments.support_p(support) " + "CommonSymbols.NIL != arguments.support_p(support) ") + support;
        SubLObject deductions_to_check = NIL;
        final SubLObject set_contents_var = assertions_high.assertion_dependents(assertion);
        SubLObject basis_object;
        SubLObject state;
        SubLObject deduction;
        SubLObject supported_object;
        SubLObject item_var;
        SubLObject cdolist_list_var;
        SubLObject dependent_deduction;
        SubLObject item_var2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            deduction = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                supported_object = deductions_high.deduction_supported_object(deduction);
                if (NIL != assertion_handles.assertion_p(supported_object)) {
                    item_var = deduction;
                    if (NIL == member(item_var, deductions_to_check, symbol_function(EQL), symbol_function(IDENTITY))) {
                        deductions_to_check = cons(item_var, deductions_to_check);
                    }
                } else {
                    cdolist_list_var = deduction_dependent_deductions(deduction);
                    dependent_deduction = NIL;
                    dependent_deduction = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        item_var2 = dependent_deduction;
                        if (NIL == member(item_var2, deductions_to_check, symbol_function(EQL), symbol_function(IDENTITY))) {
                            deductions_to_check = cons(item_var2, deductions_to_check);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        dependent_deduction = cdolist_list_var.first();
                    } 
                }
            }
        }
        SubLObject cdolist_list_var2 = deductions_to_check;
        SubLObject deduction_to_check = NIL;
        deduction_to_check = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject cdolist_list_var_$10 = deductions_high.deduction_supports(deduction_to_check);
            SubLObject deduction_support = NIL;
            deduction_support = cdolist_list_var_$10.first();
            while (NIL != cdolist_list_var_$10) {
                if (NIL != arguments.support_equal(deduction_support, support)) {
                    return T;
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                deduction_support = cdolist_list_var_$10.first();
            } 
            cdolist_list_var2 = cdolist_list_var2.rest();
            deduction_to_check = cdolist_list_var2.first();
        } 
        return NIL;
    }

    /**
     * Return T iff ASSERTION is an assertion with #$assertedMoreSpecifically in its hl-formula.
     */
    @LispMethod(comment = "Return T iff ASSERTION is an assertion with #$assertedMoreSpecifically in its hl-formula.")
    public static final SubLObject assertion_mentions_asserted_more_specificallyP_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != cycl_utilities.assertion_find($$assertedMoreSpecifically, assertion, NIL, symbol_function(EQ), UNPROVIDED)));
    }

    /**
     * Return T iff ASSERTION is an assertion with #$assertedMoreSpecifically in its hl-formula.
     */
    @LispMethod(comment = "Return T iff ASSERTION is an assertion with #$assertedMoreSpecifically in its hl-formula.")
    public static SubLObject assertion_mentions_asserted_more_specificallyP(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != cycl_utilities.assertion_find($$assertedMoreSpecifically, assertion, NIL, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Return T iff ASSERTION's cnf or mt contains any term in TERMS.
     * If ASSERTION is a meta-assertion, recurse down sub-assertions.
     * By convention, negated gafs do not necessarily mention the term #$not.
     */
    @LispMethod(comment = "Return T iff ASSERTION\'s cnf or mt contains any term in TERMS.\r\nIf ASSERTION is a meta-assertion, recurse down sub-assertions.\r\nBy convention, negated gafs do not necessarily mention the term #$not.\nReturn T iff ASSERTION\'s cnf or mt contains any term in TERMS.\nIf ASSERTION is a meta-assertion, recurse down sub-assertions.\nBy convention, negated gafs do not necessarily mention the term #$not.")
    public static final SubLObject assertion_mentions_any_of_termsP_alt(SubLObject assertion, SubLObject terms) {
        if (NIL != list_utilities.lengthG(terms, $assertion_mentions_any_of_terms_set_watermark$.getGlobalValue(), UNPROVIDED)) {
            {
                SubLObject term_set = set_utilities.construct_set_from_list(terms, symbol_function(EQUAL), UNPROVIDED);
                return com.cyc.cycjava.cycl.assertion_utilities.assertion_mentions_any_of_terms_in_setP(assertion, term_set);
            }
        } else {
            {
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    if (NIL != assertions_high.assertion_mentions_termP(assertion, v_term)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Return T iff ASSERTION's cnf or mt contains any term in TERMS.
     * If ASSERTION is a meta-assertion, recurse down sub-assertions.
     * By convention, negated gafs do not necessarily mention the term #$not.
     */
    @LispMethod(comment = "Return T iff ASSERTION\'s cnf or mt contains any term in TERMS.\r\nIf ASSERTION is a meta-assertion, recurse down sub-assertions.\r\nBy convention, negated gafs do not necessarily mention the term #$not.\nReturn T iff ASSERTION\'s cnf or mt contains any term in TERMS.\nIf ASSERTION is a meta-assertion, recurse down sub-assertions.\nBy convention, negated gafs do not necessarily mention the term #$not.")
    public static SubLObject assertion_mentions_any_of_termsP(final SubLObject assertion, final SubLObject terms) {
        if (NIL != list_utilities.lengthG(terms, $assertion_mentions_any_of_terms_set_watermark$.getGlobalValue(), UNPROVIDED)) {
            final SubLObject term_set = set_utilities.construct_set_from_list(terms, symbol_function(EQUAL), UNPROVIDED);
            return assertion_mentions_any_of_terms_in_setP(assertion, term_set);
        }
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertions_high.assertion_mentions_termP(assertion, v_term)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject assertion_mentions_any_of_terms_in_set_lambda_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return set_memberP(v_object, $assertion_mentions_any_of_terms_set_lambda$.getDynamicValue(thread));
        }
    }

    public static SubLObject assertion_mentions_any_of_terms_in_set_lambda(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_memberP(v_object, $assertion_mentions_any_of_terms_set_lambda$.getDynamicValue(thread));
    }

    /**
     * Return T iff ASSERTION's cnf or mt contains any term in TERM-SET.
     * If ASSERTION is a meta-assertion, recurse down sub-assertions.
     * By convention, negated gafs do not necessarily mention the term #$not.
     */
    @LispMethod(comment = "Return T iff ASSERTION\'s cnf or mt contains any term in TERM-SET.\r\nIf ASSERTION is a meta-assertion, recurse down sub-assertions.\r\nBy convention, negated gafs do not necessarily mention the term #$not.\nReturn T iff ASSERTION\'s cnf or mt contains any term in TERM-SET.\nIf ASSERTION is a meta-assertion, recurse down sub-assertions.\nBy convention, negated gafs do not necessarily mention the term #$not.")
    public static final SubLObject assertion_mentions_any_of_terms_in_setP_alt(SubLObject assertion, SubLObject term_set) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject resultP = NIL;
                {
                    SubLObject _prev_bind_0 = $assertion_mentions_any_of_terms_set_lambda$.currentBinding(thread);
                    try {
                        $assertion_mentions_any_of_terms_set_lambda$.bind(term_set, thread);
                        resultP = list_utilities.sublisp_boolean(cycl_utilities.assertion_find_if(ASSERTION_MENTIONS_ANY_OF_TERMS_IN_SET_LAMBDA, assertion, T, UNPROVIDED));
                    } finally {
                        $assertion_mentions_any_of_terms_set_lambda$.rebind(_prev_bind_0, thread);
                    }
                }
                return resultP;
            }
        }
    }

    /**
     * Return T iff ASSERTION's cnf or mt contains any term in TERM-SET.
     * If ASSERTION is a meta-assertion, recurse down sub-assertions.
     * By convention, negated gafs do not necessarily mention the term #$not.
     */
    @LispMethod(comment = "Return T iff ASSERTION\'s cnf or mt contains any term in TERM-SET.\r\nIf ASSERTION is a meta-assertion, recurse down sub-assertions.\r\nBy convention, negated gafs do not necessarily mention the term #$not.\nReturn T iff ASSERTION\'s cnf or mt contains any term in TERM-SET.\nIf ASSERTION is a meta-assertion, recurse down sub-assertions.\nBy convention, negated gafs do not necessarily mention the term #$not.")
    public static SubLObject assertion_mentions_any_of_terms_in_setP(final SubLObject assertion, final SubLObject term_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resultP = NIL;
        final SubLObject _prev_bind_0 = $assertion_mentions_any_of_terms_set_lambda$.currentBinding(thread);
        try {
            $assertion_mentions_any_of_terms_set_lambda$.bind(term_set, thread);
            resultP = list_utilities.sublisp_boolean(cycl_utilities.assertion_find_if(ASSERTION_MENTIONS_ANY_OF_TERMS_IN_SET_LAMBDA, assertion, T, UNPROVIDED));
        } finally {
            $assertion_mentions_any_of_terms_set_lambda$.rebind(_prev_bind_0, thread);
        }
        return resultP;
    }

    public static final SubLObject assertion_mentions_any_of_terms_in_dict_lambda_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return dictionary_utilities.dictionary_has_keyP($assertion_mentions_any_of_terms_dict_lambda$.getDynamicValue(thread), v_object);
        }
    }

    public static SubLObject assertion_mentions_any_of_terms_in_dict_lambda(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary_utilities.dictionary_has_keyP($assertion_mentions_any_of_terms_dict_lambda$.getDynamicValue(thread), v_object);
    }

    /**
     * Return T iff ASSERTION's cnf or mt contains any term in TERM-DICTIONARY's keylist.
     * If ASSERTION is a meta-assertion, recurse down sub-assertions.
     * By convention, negated gafs do not necessarily mention the term #$not.
     */
    @LispMethod(comment = "Return T iff ASSERTION\'s cnf or mt contains any term in TERM-DICTIONARY\'s keylist.\r\nIf ASSERTION is a meta-assertion, recurse down sub-assertions.\r\nBy convention, negated gafs do not necessarily mention the term #$not.\nReturn T iff ASSERTION\'s cnf or mt contains any term in TERM-DICTIONARY\'s keylist.\nIf ASSERTION is a meta-assertion, recurse down sub-assertions.\nBy convention, negated gafs do not necessarily mention the term #$not.")
    public static final SubLObject assertion_mentions_any_of_terms_in_dictionary_keysP_alt(SubLObject assertion, SubLObject term_dictionary) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject resultP = NIL;
                {
                    SubLObject _prev_bind_0 = $assertion_mentions_any_of_terms_dict_lambda$.currentBinding(thread);
                    try {
                        $assertion_mentions_any_of_terms_dict_lambda$.bind(term_dictionary, thread);
                        resultP = list_utilities.sublisp_boolean(cycl_utilities.assertion_find_if(ASSERTION_MENTIONS_ANY_OF_TERMS_IN_DICT_LAMBDA, assertion, T, UNPROVIDED));
                    } finally {
                        $assertion_mentions_any_of_terms_dict_lambda$.rebind(_prev_bind_0, thread);
                    }
                }
                return resultP;
            }
        }
    }

    /**
     * Return T iff ASSERTION's cnf or mt contains any term in TERM-DICTIONARY's keylist.
     * If ASSERTION is a meta-assertion, recurse down sub-assertions.
     * By convention, negated gafs do not necessarily mention the term #$not.
     */
    @LispMethod(comment = "Return T iff ASSERTION\'s cnf or mt contains any term in TERM-DICTIONARY\'s keylist.\r\nIf ASSERTION is a meta-assertion, recurse down sub-assertions.\r\nBy convention, negated gafs do not necessarily mention the term #$not.\nReturn T iff ASSERTION\'s cnf or mt contains any term in TERM-DICTIONARY\'s keylist.\nIf ASSERTION is a meta-assertion, recurse down sub-assertions.\nBy convention, negated gafs do not necessarily mention the term #$not.")
    public static SubLObject assertion_mentions_any_of_terms_in_dictionary_keysP(final SubLObject assertion, final SubLObject term_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resultP = NIL;
        final SubLObject _prev_bind_0 = $assertion_mentions_any_of_terms_dict_lambda$.currentBinding(thread);
        try {
            $assertion_mentions_any_of_terms_dict_lambda$.bind(term_dictionary, thread);
            resultP = list_utilities.sublisp_boolean(cycl_utilities.assertion_find_if(ASSERTION_MENTIONS_ANY_OF_TERMS_IN_DICT_LAMBDA, assertion, T, UNPROVIDED));
        } finally {
            $assertion_mentions_any_of_terms_dict_lambda$.rebind(_prev_bind_0, thread);
        }
        return resultP;
    }

    public static final SubLObject random_gaf_with_pred_alt(SubLObject pred) {
        return com.cyc.cycjava.cycl.assertion_utilities.random_gaf_with_predicate(pred);
    }

    public static SubLObject random_gaf_with_pred(final SubLObject pred) {
        return random_gaf_with_predicate(pred);
    }

    /**
     * Returns a random gaf with predicate PRED.
     */
    @LispMethod(comment = "Returns a random gaf with predicate PRED.")
    public static final SubLObject random_gaf_with_predicate_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                if (num_predicate_extent_index(pred, UNPROVIDED).numG($int$10000)) {
                    while (NIL == com.cyc.cycjava.cycl.assertion_utilities.gaf_assertion_with_pred_p(result, pred)) {
                        result = assertions_high.random_assertion(UNPROVIDED);
                    } 
                } else {
                    {
                        SubLObject total = num_predicate_extent_index(pred, UNPROVIDED);
                        SubLObject i = random.random(total);
                        SubLObject count = ZERO_INTEGER;
                        SubLObject result_7 = NIL;
                        {
                            SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $mt$.currentBinding(thread);
                            try {
                                $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                $mt$.bind($$EverythingPSC, thread);
                                {
                                    SubLObject pred_var = pred;
                                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                            SubLObject done_var = result_7;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                {
                                                                    SubLObject done_var_8 = result_7;
                                                                    SubLObject token_var_9 = NIL;
                                                                    while (NIL == done_var_8) {
                                                                        {
                                                                            SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_9);
                                                                            SubLObject valid_10 = makeBoolean(token_var_9 != gaf);
                                                                            if (NIL != valid_10) {
                                                                                if (i.numE(count)) {
                                                                                    result_7 = gaf;
                                                                                } else {
                                                                                    count = add(count, ONE_INTEGER);
                                                                                }
                                                                            }
                                                                            done_var_8 = makeBoolean((NIL == valid_10) || (NIL != result_7));
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_11, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean((NIL == valid) || (NIL != result_7));
                                                }
                                            } 
                                        }
                                    }
                                }
                            } finally {
                                $mt$.rebind(_prev_bind_1, thread);
                                $relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * Returns a random gaf with predicate PRED.
     */
    @LispMethod(comment = "Returns a random gaf with predicate PRED.")
    public static SubLObject random_gaf_with_predicate(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (kb_indexing.num_predicate_extent_index(pred, UNPROVIDED).numG($int$10000)) {
            while (NIL == gaf_assertion_with_pred_p(result, pred)) {
                result = assertions_high.random_assertion(UNPROVIDED);
            } 
        } else {
            final SubLObject total = kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
            final SubLObject i = random.random(total);
            SubLObject count = ZERO_INTEGER;
            SubLObject result_$11 = NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_0_$12 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$13 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                        SubLObject done_var = result_$11;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$14 = result_$11;
                                    final SubLObject token_var_$15 = NIL;
                                    while (NIL == done_var_$14) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$15);
                                        final SubLObject valid_$16 = makeBoolean(!token_var_$15.eql(gaf));
                                        if (NIL != valid_$16) {
                                            if (i.numE(count)) {
                                                result_$11 = gaf;
                                            } else {
                                                count = add(count, ONE_INTEGER);
                                            }
                                        }
                                        done_var_$14 = makeBoolean((NIL == valid_$16) || (NIL != result_$11));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != result_$11));
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_8, thread);
                        $is_noting_progressP$.rebind(_prev_bind_7, thread);
                        $progress_count$.rebind(_prev_bind_6, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        $progress_notification_count$.rebind(_prev_bind_4, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$13, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    /**
     * Returns a random gaf with predicate PRED and ARG in the ARGNUMth position.
     */
    @LispMethod(comment = "Returns a random gaf with predicate PRED and ARG in the ARGNUMth position.")
    public static final SubLObject random_gaf_with_predicate_and_arg_alt(SubLObject pred, SubLObject arg, SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = num_gaf_arg_index(arg, argnum, pred, UNPROVIDED);
                SubLObject i = random.random(total);
                SubLObject count = ZERO_INTEGER;
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $mt$.currentBinding(thread);
                    try {
                        $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        $mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject pred_var = pred;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg, argnum, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg, argnum, pred_var);
                                    SubLObject done_var = result;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                            if (NIL != valid) {
                                                {
                                                    SubLObject final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_12 = result;
                                                            SubLObject token_var_13 = NIL;
                                                            while (NIL == done_var_12) {
                                                                {
                                                                    SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_13);
                                                                    SubLObject valid_14 = makeBoolean(token_var_13 != gaf);
                                                                    if (NIL != valid_14) {
                                                                        if (i.numE(count)) {
                                                                            result = gaf;
                                                                        } else {
                                                                            count = add(count, ONE_INTEGER);
                                                                        }
                                                                    }
                                                                    done_var_12 = makeBoolean((NIL == valid_14) || (NIL != result));
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_15, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != result));
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        $mt$.rebind(_prev_bind_1, thread);
                        $relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Returns a random gaf with predicate PRED and ARG in the ARGNUMth position.
     */
    @LispMethod(comment = "Returns a random gaf with predicate PRED and ARG in the ARGNUMth position.")
    public static SubLObject random_gaf_with_predicate_and_arg(final SubLObject pred, final SubLObject arg, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total = kb_indexing.num_gaf_arg_index(arg, argnum, pred, UNPROVIDED);
        final SubLObject i = random.random(total);
        SubLObject count = ZERO_INTEGER;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg, argnum, pred)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg, argnum, pred);
                SubLObject done_var = result;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$18 = result;
                            final SubLObject token_var_$19 = NIL;
                            while (NIL == done_var_$18) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                final SubLObject valid_$20 = makeBoolean(!token_var_$19.eql(gaf));
                                if (NIL != valid_$20) {
                                    if (i.numE(count)) {
                                        result = gaf;
                                    } else {
                                        count = add(count, ONE_INTEGER);
                                    }
                                }
                                done_var_$18 = makeBoolean((NIL == valid_$20) || (NIL != result));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != result));
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject random_rule_mentioning_alt(SubLObject fort) {
        return list_utilities.random_element(com.cyc.cycjava.cycl.assertion_utilities.rules_mentioning(fort));
    }

    public static SubLObject random_rule_mentioning(final SubLObject fort) {
        return list_utilities.random_element(rules_mentioning(fort));
    }

    public static final SubLObject rules_mentioning_alt(SubLObject fort) {
        {
            SubLObject result = NIL;
            if (NIL != kb_mapping_macros.do_term_index_key_validator(fort, $RULE)) {
                {
                    SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, $RULE);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                            if (NIL != valid) {
                                {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                        {
                                            SubLObject done_var_16 = NIL;
                                            SubLObject token_var_17 = NIL;
                                            while (NIL == done_var_16) {
                                                {
                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_17);
                                                    SubLObject valid_18 = makeBoolean(token_var_17 != ass);
                                                    if (NIL != valid_18) {
                                                        if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec)) {
                                                            result = cons(ass, result);
                                                        }
                                                    }
                                                    done_var_16 = makeBoolean(NIL == valid_18);
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                            }
                                        }
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    } 
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject rules_mentioning(final SubLObject fort) {
        SubLObject result = NIL;
        if (NIL != kb_mapping_macros.do_term_index_key_validator(fort, $RULE)) {
            final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, $RULE);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                        SubLObject done_var_$22 = NIL;
                        final SubLObject token_var_$23 = NIL;
                        while (NIL == done_var_$22) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$23);
                            final SubLObject valid_$24 = makeBoolean(!token_var_$23.eql(ass));
                            if ((NIL != valid_$24) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec))) {
                                result = cons(ass, result);
                            }
                            done_var_$22 = makeBoolean(NIL == valid_$24);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return nreverse(result);
    }

    /**
     *
     *
     * @return integerp			; the number of rules mentioning FORT.
     */
    @LispMethod(comment = "@return integerp\t\t\t; the number of rules mentioning FORT.")
    public static final SubLObject rule_count_mentioning_alt(SubLObject fort) {
        {
            SubLObject count = ZERO_INTEGER;
            if (NIL != kb_mapping_macros.do_term_index_key_validator(fort, $RULE)) {
                {
                    SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, $RULE);
                    SubLObject done_var = NIL;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                            if (NIL != valid) {
                                {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                        {
                                            SubLObject done_var_19 = NIL;
                                            SubLObject token_var_20 = NIL;
                                            while (NIL == done_var_19) {
                                                {
                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_20);
                                                    SubLObject valid_21 = makeBoolean(token_var_20 != ass);
                                                    if (NIL != valid_21) {
                                                        if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec)) {
                                                            count = add(count, ONE_INTEGER);
                                                        }
                                                    }
                                                    done_var_19 = makeBoolean(NIL == valid_21);
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                            }
                                        }
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    } 
                }
            }
            return count;
        }
    }

    /**
     *
     *
     * @return integerp			; the number of rules mentioning FORT.
     */
    @LispMethod(comment = "@return integerp\t\t\t; the number of rules mentioning FORT.")
    public static SubLObject rule_count_mentioning(final SubLObject fort) {
        SubLObject count = ZERO_INTEGER;
        if (NIL != kb_mapping_macros.do_term_index_key_validator(fort, $RULE)) {
            final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, $RULE);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                        SubLObject done_var_$25 = NIL;
                        final SubLObject token_var_$26 = NIL;
                        while (NIL == done_var_$25) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                            final SubLObject valid_$27 = makeBoolean(!token_var_$26.eql(ass));
                            if ((NIL != valid_$27) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec))) {
                                count = add(count, ONE_INTEGER);
                            }
                            done_var_$25 = makeBoolean(NIL == valid_$27);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return count;
    }

    public static SubLObject random_assertions(final SubLObject n) {
        SubLObject result = NIL;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
            result = cons(assertions_high.random_assertion(UNPROVIDED), result);
        }
        return result;
    }

    /**
     *
     *
     * @return booleanp; whether ASSERTION1 was asserted earlier than ASSERTION2.
    If there is not enough bookkeeping information to tell, returns NIL.
     */
    @LispMethod(comment = "@return booleanp; whether ASSERTION1 was asserted earlier than ASSERTION2.\r\nIf there is not enough bookkeeping information to tell, returns NIL.")
    public static final SubLObject assertion_earlierP_alt(SubLObject assertion1, SubLObject assertion2) {
        {
            SubLObject date1 = assertions_high.asserted_when(assertion1);
            SubLObject date2 = assertions_high.asserted_when(assertion2);
            if (NIL == date1) {
                return NIL;
            } else {
                if (NIL == date2) {
                    return NIL;
                } else {
                    if (date1.numL(date2)) {
                        return T;
                    } else {
                        if (date1.numG(date2)) {
                            return NIL;
                        } else {
                            {
                                SubLObject second1 = assertions_high.asserted_second(assertion1);
                                SubLObject second2 = assertions_high.asserted_second(assertion2);
                                if (NIL == second1) {
                                    return NIL;
                                } else {
                                    if (NIL == second2) {
                                        return NIL;
                                    } else {
                                        if (second1.numL(second2)) {
                                            return T;
                                        } else {
                                            if (second1.numG(second2)) {
                                                return NIL;
                                            } else {
                                                return NIL;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp; whether ASSERTION1 was asserted earlier than ASSERTION2.
    If there is not enough bookkeeping information to tell, returns NIL.
     */
    @LispMethod(comment = "@return booleanp; whether ASSERTION1 was asserted earlier than ASSERTION2.\r\nIf there is not enough bookkeeping information to tell, returns NIL.")
    public static SubLObject assertion_earlierP(final SubLObject assertion1, final SubLObject assertion2) {
        final SubLObject date1 = assertions_high.asserted_when(assertion1);
        final SubLObject date2 = assertions_high.asserted_when(assertion2);
        if (NIL == date1) {
            return NIL;
        }
        if (NIL == date2) {
            return NIL;
        }
        if (date1.numL(date2)) {
            return T;
        }
        if (date1.numG(date2)) {
            return NIL;
        }
        final SubLObject second1 = assertions_high.asserted_second(assertion1);
        final SubLObject second2 = assertions_high.asserted_second(assertion2);
        if (NIL == second1) {
            return NIL;
        }
        if (NIL == second2) {
            return NIL;
        }
        if (second1.numL(second2)) {
            return T;
        }
        if (second1.numG(second2)) {
            return NIL;
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether ASSERTION1 was asserted later than ASSERTION2.
    If there is not enough bookkeeping information to tell, returns NIL.
     */
    @LispMethod(comment = "@return booleanp; whether ASSERTION1 was asserted later than ASSERTION2.\r\nIf there is not enough bookkeeping information to tell, returns NIL.")
    public static final SubLObject assertion_laterP_alt(SubLObject assertion1, SubLObject assertion2) {
        {
            SubLObject date1 = assertions_high.asserted_when(assertion1);
            SubLObject date2 = assertions_high.asserted_when(assertion2);
            if (NIL == date1) {
                return NIL;
            } else {
                if (NIL == date2) {
                    return NIL;
                } else {
                    if (date1.numG(date2)) {
                        return T;
                    } else {
                        if (date1.numL(date2)) {
                            return NIL;
                        } else {
                            {
                                SubLObject second1 = assertions_high.asserted_second(assertion1);
                                SubLObject second2 = assertions_high.asserted_second(assertion2);
                                if (NIL == second1) {
                                    return NIL;
                                } else {
                                    if (NIL == second2) {
                                        return NIL;
                                    } else {
                                        if (second1.numG(second2)) {
                                            return T;
                                        } else {
                                            if (second1.numL(second2)) {
                                                return NIL;
                                            } else {
                                                return NIL;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp; whether ASSERTION1 was asserted later than ASSERTION2.
    If there is not enough bookkeeping information to tell, returns NIL.
     */
    @LispMethod(comment = "@return booleanp; whether ASSERTION1 was asserted later than ASSERTION2.\r\nIf there is not enough bookkeeping information to tell, returns NIL.")
    public static SubLObject assertion_laterP(final SubLObject assertion1, final SubLObject assertion2) {
        final SubLObject date1 = assertions_high.asserted_when(assertion1);
        final SubLObject date2 = assertions_high.asserted_when(assertion2);
        if (NIL == date1) {
            return NIL;
        }
        if (NIL == date2) {
            return NIL;
        }
        if (date1.numG(date2)) {
            return T;
        }
        if (date1.numL(date2)) {
            return NIL;
        }
        final SubLObject second1 = assertions_high.asserted_second(assertion1);
        final SubLObject second2 = assertions_high.asserted_second(assertion2);
        if (NIL == second1) {
            return NIL;
        }
        if (NIL == second2) {
            return NIL;
        }
        if (second1.numG(second2)) {
            return T;
        }
        if (second1.numL(second2)) {
            return NIL;
        }
        return NIL;
    }

    /**
     *
     *
     * @return assertionp; the assertion asserted earliest among ASSERTIONS.
    If there is not enough bookkeeping information to tell, returns NIL.
     */
    @LispMethod(comment = "@return assertionp; the assertion asserted earliest among ASSERTIONS.\r\nIf there is not enough bookkeeping information to tell, returns NIL.")
    public static final SubLObject earliest_assertion_alt(SubLObject assertions) {
        if (NIL == assertions) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(assertions)) {
            return assertions.first();
        }
        {
            SubLObject dates = Mapping.mapcar(ASSERTED_WHEN, assertions);
            if (NIL == list_utilities.every_in_list(INTEGERP, dates, UNPROVIDED)) {
                return NIL;
            }
            {
                SubLObject earliest_date = number_utilities.minimum(dates, UNPROVIDED);
                SubLObject earliest_date_assertions = NIL;
                {
                    SubLObject cdolist_list_var = assertions;
                    SubLObject ass = NIL;
                    for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                        if (earliest_date.numE(assertions_high.asserted_when(ass))) {
                            earliest_date_assertions = cons(ass, earliest_date_assertions);
                        }
                    }
                }
                if (NIL != list_utilities.singletonP(earliest_date_assertions)) {
                    return earliest_date_assertions.first();
                }
                {
                    SubLObject times = Mapping.mapcar(ASSERTED_SECOND, earliest_date_assertions);
                    if (NIL == list_utilities.every_in_list(INTEGERP, times, UNPROVIDED)) {
                        return NIL;
                    }
                    {
                        SubLObject earliest_time = number_utilities.minimum(times, UNPROVIDED);
                        SubLObject earliest_time_assertions = NIL;
                        SubLObject cdolist_list_var = earliest_date_assertions;
                        SubLObject ass = NIL;
                        for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                            if (earliest_time.numE(assertions_high.asserted_second(ass))) {
                                earliest_time_assertions = cons(ass, earliest_time_assertions);
                            }
                        }
                        if (NIL != list_utilities.singletonP(earliest_time_assertions)) {
                            return earliest_time_assertions.first();
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return assertionp; the assertion asserted earliest among ASSERTIONS.
    If there is not enough bookkeeping information to tell, returns NIL.
     */
    @LispMethod(comment = "@return assertionp; the assertion asserted earliest among ASSERTIONS.\r\nIf there is not enough bookkeeping information to tell, returns NIL.")
    public static SubLObject earliest_assertion(final SubLObject assertions) {
        if (NIL == assertions) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(assertions)) {
            return assertions.first();
        }
        final SubLObject dates = Mapping.mapcar(ASSERTED_WHEN, assertions);
        if (NIL == list_utilities.every_in_list(INTEGERP, dates, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject earliest_date = number_utilities.minimum(dates, UNPROVIDED);
        SubLObject earliest_date_assertions = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject ass = NIL;
        ass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (earliest_date.numE(assertions_high.asserted_when(ass))) {
                earliest_date_assertions = cons(ass, earliest_date_assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ass = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.singletonP(earliest_date_assertions)) {
            return earliest_date_assertions.first();
        }
        final SubLObject times = Mapping.mapcar(ASSERTED_SECOND, earliest_date_assertions);
        if (NIL == list_utilities.every_in_list(INTEGERP, times, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject earliest_time = number_utilities.minimum(times, UNPROVIDED);
        SubLObject earliest_time_assertions = NIL;
        SubLObject cdolist_list_var2 = earliest_date_assertions;
        SubLObject ass2 = NIL;
        ass2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (earliest_time.numE(assertions_high.asserted_second(ass2))) {
                earliest_time_assertions = cons(ass2, earliest_time_assertions);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            ass2 = cdolist_list_var2.first();
        } 
        if (NIL != list_utilities.singletonP(earliest_time_assertions)) {
            return earliest_time_assertions.first();
        }
        return NIL;
    }

    /**
     * Primitively modifies ASSERTION's variables by resetting the EL variable names of ASSERTION,
     * renaming the current ones according to RENAME-VARIABLE-MAP.
     * RENAME-VARIABLE-MAP is an alist containing (OLD-VAR . NEW-VAR) pairs,
     * each of which is expected to be an el-var?.
     * Assumes it is not the case that @xref SIMPLE-VARIABLE-RENAME-IMPOSSIBLE?.
     */
    @LispMethod(comment = "Primitively modifies ASSERTION\'s variables by resetting the EL variable names of ASSERTION,\r\nrenaming the current ones according to RENAME-VARIABLE-MAP.\r\nRENAME-VARIABLE-MAP is an alist containing (OLD-VAR . NEW-VAR) pairs,\r\neach of which is expected to be an el-var?.\r\nAssumes it is not the case that @xref SIMPLE-VARIABLE-RENAME-IMPOSSIBLE?.\nPrimitively modifies ASSERTION\'s variables by resetting the EL variable names of ASSERTION,\nrenaming the current ones according to RENAME-VARIABLE-MAP.\nRENAME-VARIABLE-MAP is an alist containing (OLD-VAR . NEW-VAR) pairs,\neach of which is expected to be an el-var?.\nAssumes it is not the case that @xref SIMPLE-VARIABLE-RENAME-IMPOSSIBLE?.")
    public static final SubLObject rename_assertion_variables_alt(SubLObject assertion, SubLObject rename_variable_map) {
        {
            SubLObject assertion_old_el_variables = assertions_high.assertion_el_variables(assertion);
            SubLObject assertion_new_el_variables = bindings.apply_bindings(rename_variable_map, assertion_old_el_variables);
            SubLObject assertion_new_el_variable_names = Mapping.mapcar(EL_VAR_NAME, assertion_new_el_variables);
            assertions_interface.kb_set_assertion_variable_names(assertion, assertion_new_el_variable_names);
        }
        return T;
    }

    /**
     * Primitively modifies ASSERTION's variables by resetting the EL variable names of ASSERTION,
     * renaming the current ones according to RENAME-VARIABLE-MAP.
     * RENAME-VARIABLE-MAP is an alist containing (OLD-VAR . NEW-VAR) pairs,
     * each of which is expected to be an el-var?.
     * Assumes it is not the case that @xref SIMPLE-VARIABLE-RENAME-IMPOSSIBLE?.
     */
    @LispMethod(comment = "Primitively modifies ASSERTION\'s variables by resetting the EL variable names of ASSERTION,\r\nrenaming the current ones according to RENAME-VARIABLE-MAP.\r\nRENAME-VARIABLE-MAP is an alist containing (OLD-VAR . NEW-VAR) pairs,\r\neach of which is expected to be an el-var?.\r\nAssumes it is not the case that @xref SIMPLE-VARIABLE-RENAME-IMPOSSIBLE?.\nPrimitively modifies ASSERTION\'s variables by resetting the EL variable names of ASSERTION,\nrenaming the current ones according to RENAME-VARIABLE-MAP.\nRENAME-VARIABLE-MAP is an alist containing (OLD-VAR . NEW-VAR) pairs,\neach of which is expected to be an el-var?.\nAssumes it is not the case that @xref SIMPLE-VARIABLE-RENAME-IMPOSSIBLE?.")
    public static SubLObject rename_assertion_variables(final SubLObject assertion, final SubLObject rename_variable_map) {
        final SubLObject assertion_old_el_variables = assertions_high.assertion_el_variables(assertion);
        final SubLObject assertion_new_el_variables = bindings.apply_bindings(rename_variable_map, assertion_old_el_variables);
        final SubLObject assertion_new_el_variable_names = Mapping.mapcar(EL_VAR_NAME, assertion_new_el_variables);
        assertions_interface.kb_set_assertion_variable_names(assertion, assertion_new_el_variable_names);
        return T;
    }

    /**
     * Primitively modifies ASSERTION's variables by resetting the EL variable names of ASSERTION,
     * if it is provably possible to do so without changing the logical intent of ASSERTION.
     *
     * @see rename-assertion-variables
     * @return boolean; whether ASSERTION's variables were renamed.
     */
    @LispMethod(comment = "Primitively modifies ASSERTION\'s variables by resetting the EL variable names of ASSERTION,\r\nif it is provably possible to do so without changing the logical intent of ASSERTION.\r\n\r\n@see rename-assertion-variables\r\n@return boolean; whether ASSERTION\'s variables were renamed.\nPrimitively modifies ASSERTION\'s variables by resetting the EL variable names of ASSERTION,\nif it is provably possible to do so without changing the logical intent of ASSERTION.")
    public static final SubLObject possibly_rename_assertion_variables_alt(SubLObject assertion, SubLObject rename_variable_alist) {
        if (NIL != simple_variable_rename_impossibleP(assertion, rename_variable_alist)) {
            return NIL;
        } else {
            return com.cyc.cycjava.cycl.assertion_utilities.rename_assertion_variables(assertion, rename_variable_alist);
        }
    }

    /**
     * Primitively modifies ASSERTION's variables by resetting the EL variable names of ASSERTION,
     * if it is provably possible to do so without changing the logical intent of ASSERTION.
     *
     * @see rename-assertion-variables
     * @return boolean; whether ASSERTION's variables were renamed.
     */
    @LispMethod(comment = "Primitively modifies ASSERTION\'s variables by resetting the EL variable names of ASSERTION,\r\nif it is provably possible to do so without changing the logical intent of ASSERTION.\r\n\r\n@see rename-assertion-variables\r\n@return boolean; whether ASSERTION\'s variables were renamed.\nPrimitively modifies ASSERTION\'s variables by resetting the EL variable names of ASSERTION,\nif it is provably possible to do so without changing the logical intent of ASSERTION.")
    public static SubLObject possibly_rename_assertion_variables(final SubLObject assertion, final SubLObject rename_variable_alist) {
        if (NIL != simple_variable_rename_impossibleP(assertion, rename_variable_alist)) {
            return NIL;
        }
        return rename_assertion_variables(assertion, rename_variable_alist);
    }

    /**
     * Return an el query formula for the antecedent of ASSERTION.
     */
    @LispMethod(comment = "Return an el query formula for the antecedent of ASSERTION.")
    public static final SubLObject assertion_antecedent_query_formula_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject antecedent_lits = clauses.neg_lits(assertions_high.assertion_cnf(assertion));
            SubLObject antecedent_dnf = clauses.make_dnf(NIL, antecedent_lits);
            SubLObject antecedent_hl_formula = clauses.dnf_formula(antecedent_dnf);
            return fi.perform_fi_substitutions(copy_tree(antecedent_hl_formula), assertions_high.assertion_el_variables(assertion));
        }
    }

    /**
     * Return an el query formula for the antecedent of ASSERTION.
     */
    @LispMethod(comment = "Return an el query formula for the antecedent of ASSERTION.")
    public static SubLObject assertion_antecedent_query_formula(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject antecedent_lits = clauses.neg_lits(assertions_high.assertion_cnf(assertion));
        final SubLObject antecedent_dnf = clauses.make_dnf(NIL, antecedent_lits);
        final SubLObject antecedent_hl_formula = clauses.dnf_formula(antecedent_dnf);
        return fi.perform_fi_substitutions(copy_tree(antecedent_hl_formula), assertions_high.assertion_el_variables(assertion));
    }

    /**
     * Return an el query formula for the already known extent of ASSERTION.
     */
    @LispMethod(comment = "Return an el query formula for the already known extent of ASSERTION.")
    public static final SubLObject assertion_known_extent_query_formula_alt(SubLObject assertion) {
        return com.cyc.cycjava.cycl.assertion_utilities.assertion_known_extent_query_formula_int(assertion, $$knownSentence);
    }

    /**
     * Return an el query formula for the already known extent of ASSERTION.
     */
    @LispMethod(comment = "Return an el query formula for the already known extent of ASSERTION.")
    public static SubLObject assertion_known_extent_query_formula(final SubLObject assertion) {
        return assertion_known_extent_query_formula_int(assertion, $$knownSentence);
    }

    /**
     * Return an el query formula for the not already known extent of ASSERTION.
     */
    @LispMethod(comment = "Return an el query formula for the not already known extent of ASSERTION.")
    public static final SubLObject assertion_unknown_extent_query_formula_alt(SubLObject assertion) {
        return com.cyc.cycjava.cycl.assertion_utilities.assertion_known_extent_query_formula_int(assertion, $$unknownSentence);
    }

    /**
     * Return an el query formula for the not already known extent of ASSERTION.
     */
    @LispMethod(comment = "Return an el query formula for the not already known extent of ASSERTION.")
    public static SubLObject assertion_unknown_extent_query_formula(final SubLObject assertion) {
        return assertion_known_extent_query_formula_int(assertion, $$unknownSentence);
    }

    public static final SubLObject assertion_known_extent_query_formula_int_alt(SubLObject assertion, SubLObject known_pred) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject antecedent_lits = clauses.neg_lits(assertions_high.assertion_cnf(assertion));
            SubLObject antecedent_dnf = clauses.make_dnf(NIL, antecedent_lits);
            SubLObject antecedent_hl_formula = clauses.dnf_formula(antecedent_dnf);
            SubLObject consequent_lits = clauses.pos_lits(assertions_high.assertion_cnf(assertion));
            SubLObject consequent_dnf = clauses.make_dnf(NIL, consequent_lits);
            SubLObject consequent_hl_formula = clauses.dnf_formula(consequent_dnf);
            SubLObject known_consequent_formula = make_unary_formula(known_pred, consequent_hl_formula);
            SubLObject query_hl_formula = simplifier.simplify_cycl_sentence(make_conjunction(list(antecedent_hl_formula, known_consequent_formula)), UNPROVIDED);
            return fi.perform_fi_substitutions(copy_tree(query_hl_formula), assertions_high.assertion_el_variables(assertion));
        }
    }

    public static SubLObject assertion_known_extent_query_formula_int(final SubLObject assertion, final SubLObject known_pred) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject antecedent_lits = clauses.neg_lits(assertions_high.assertion_cnf(assertion));
        final SubLObject antecedent_dnf = clauses.make_dnf(NIL, antecedent_lits);
        final SubLObject antecedent_hl_formula = clauses.dnf_formula(antecedent_dnf);
        final SubLObject consequent_lits = clauses.pos_lits(assertions_high.assertion_cnf(assertion));
        final SubLObject consequent_dnf = clauses.make_dnf(NIL, consequent_lits);
        final SubLObject consequent_hl_formula = clauses.dnf_formula(consequent_dnf);
        final SubLObject known_consequent_formula = make_unary_formula(known_pred, consequent_hl_formula);
        final SubLObject query_hl_formula = simplifier.simplify_cycl_sentence(make_conjunction(list(antecedent_hl_formula, known_consequent_formula)), UNPROVIDED);
        return fi.perform_fi_substitutions(copy_tree(query_hl_formula), assertions_high.assertion_el_variables(assertion));
    }

    /**
     * Gather information describing this assertion.  Used by the Java API client.
     */
    @LispMethod(comment = "Gather information describing this assertion.  Used by the Java API client.")
    public static final SubLObject assertion_info_alt(SubLObject assertion) {
        return list(fi.assertion_hl_formula(assertion, UNPROVIDED), assertions_high.assertion_mt(assertion), assertions_high.cyc_assertion_tv(assertion), assertions_high.assertion_direction(assertion), assertions_high.assertion_arguments(assertion), assertions_high.gaf_assertionP(assertion));
    }

    /**
     * Gather information describing this assertion.  Used by the Java API client.
     */
    @LispMethod(comment = "Gather information describing this assertion.  Used by the Java API client.")
    public static SubLObject assertion_info(final SubLObject assertion) {
        return list(fi.assertion_hl_formula(assertion, UNPROVIDED), assertions_high.assertion_mt(assertion), assertions_high.cyc_assertion_tv(assertion), assertions_high.assertion_direction(assertion), assertions_high.assertion_arguments(assertion), assertions_high.gaf_assertionP(assertion));
    }

    public static final SubLObject assertion_literal_count_alt(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            return ONE_INTEGER;
        } else {
            return com.cyc.cycjava.cycl.assertion_utilities.rule_literal_count(assertion);
        }
    }

    public static SubLObject assertion_literal_count(final SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            return ONE_INTEGER;
        }
        return rule_literal_count(assertion);
    }

    public static final SubLObject rule_literal_count_alt(SubLObject rule) {
        {
            SubLObject cnf = assertions_high.assertion_cnf(rule);
            return clause_utilities.clause_literal_count(cnf);
        }
    }

    public static SubLObject rule_literal_count(final SubLObject rule) {
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        return clause_utilities.clause_literal_count(cnf);
    }

    public static SubLObject assertion_supporting_assertions(final SubLObject assertion) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != deduction_handles.deduction_p(argument)) {
                SubLObject cdolist_list_var_$28 = deductions_high.deduction_supports(argument);
                SubLObject supporting_assertion = NIL;
                supporting_assertion = cdolist_list_var_$28.first();
                while (NIL != cdolist_list_var_$28) {
                    if (NIL != assertion_handles.assertion_p(supporting_assertion)) {
                        result = cons(supporting_assertion, result);
                    }
                    cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                    supporting_assertion = cdolist_list_var_$28.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject assertion_supporting_forward_assertions(final SubLObject assertion) {
        return list_utilities.remove_if_not($sym80$FORWARD_ASSERTION_, assertion_supporting_assertions(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject assertion_cheapest_forward_supporting_assertion(final SubLObject assertion) {
        final SubLObject supporting_forward_assertions = assertion_supporting_forward_assertions(assertion);
        return NIL != supporting_forward_assertions ? number_utilities.minimum(supporting_forward_assertions, ASSERTION_DEPENDENT_COUNT) : NIL;
    }

    /**
     *
     *
     * @param ASSERTION
    assertion-p
     * 		
     * @unknown INTEGERP ; ASSERTION's creation time in universal time integer format.
     */
    @LispMethod(comment = "@param ASSERTION\nassertion-p\r\n\t\t\r\n@unknown INTEGERP ; ASSERTION\'s creation time in universal time integer format.")
    public static final SubLObject assertion_universal_time_alt(SubLObject assertion) {
        {
            SubLObject universal_second = assertions_high.asserted_second(assertion);
            if (NIL != universal_second) {
                {
                    SubLObject universal_date = assertions_high.asserted_when(assertion);
                    if (NIL != universal_date) {
                        return numeric_date_utilities.universal_time_from_date_and_second(universal_date, universal_second);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param ASSERTION
    assertion-p
     * 		
     * @unknown INTEGERP ; ASSERTION's creation time in universal time integer format.
     */
    @LispMethod(comment = "@param ASSERTION\nassertion-p\r\n\t\t\r\n@unknown INTEGERP ; ASSERTION\'s creation time in universal time integer format.")
    public static SubLObject assertion_universal_time(final SubLObject assertion) {
        final SubLObject universal_second = assertions_high.asserted_second(assertion);
        if (NIL != universal_second) {
            final SubLObject universal_date = assertions_high.asserted_when(assertion);
            if (NIL != universal_date) {
                return numeric_date_utilities.universal_time_from_date_and_second(universal_date, universal_second);
            }
        }
        return NIL;
    }

    /**
     * Return a list of all assertions sorted by an estimate of their creation time
     */
    @LispMethod(comment = "Return a list of all assertions sorted by an estimate of their creation time")
    public static final SubLObject all_assertions_sorted_by_creation_time_estimate_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = $newest_constant_of_assertions$.currentBinding(thread);
                    try {
                        $newest_constant_of_assertions$.bind(NIL, thread);
                        com.cyc.cycjava.cycl.assertion_utilities.initialize_newest_constant_table();
                        {
                            SubLObject idx = do_constants_table();
                            SubLObject total = id_index_count(idx);
                            SubLObject sofar = ZERO_INTEGER;
                            SubLTrampolineFile.checkType($str_alt59$Sorting_newest_constants___Part_2, STRINGP);
                            {
                                SubLObject _prev_bind_0_22 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($str_alt59$Sorting_newest_constants___Part_2);
                                    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                        {
                                            SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                            SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                            SubLObject constant = NIL;
                                            while (NIL != id) {
                                                constant = do_id_index_state_object(idx, $SKIP, id, state_var);
                                                if (NIL != do_id_index_id_and_object_validP(id, constant, $SKIP)) {
                                                    note_percent_progress(sofar, total);
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    {
                                                        SubLObject assertions = gethash(constant, $newest_constant_of_assertions$.getDynamicValue(thread), NIL);
                                                        SubLObject cdolist_list_var = assertions;
                                                        SubLObject ass = NIL;
                                                        for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                                                            v_answer = cons(ass, v_answer);
                                                        }
                                                    }
                                                }
                                                id = do_id_index_next_id(idx, T, id, state_var);
                                                state_var = do_id_index_next_state(idx, T, id, state_var);
                                            } 
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_22, thread);
                                }
                            }
                        }
                    } finally {
                        $newest_constant_of_assertions$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(v_answer);
            }
        }
    }

    /**
     * Return a list of all assertions sorted by an estimate of their creation time
     */
    @LispMethod(comment = "Return a list of all assertions sorted by an estimate of their creation time")
    public static SubLObject all_assertions_sorted_by_creation_time_estimate() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = $newest_constant_of_assertions$.currentBinding(thread);
        try {
            $newest_constant_of_assertions$.bind(NIL, thread);
            initialize_newest_constant_table();
            final SubLObject idx = do_constants_table();
            final SubLObject mess = $str82$Sorting_newest_constants___Part_2;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
            final SubLObject _prev_bind_0_$29 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$30 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$30, $SKIP)) {
                        final SubLObject idx_$31 = idx_$30;
                        if (NIL == id_index_dense_objects_empty_p(idx_$31, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$31);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject constant;
                            SubLObject cdolist_list_var;
                            SubLObject assertions;
                            SubLObject ass;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                constant = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(constant)) {
                                        constant = $SKIP;
                                    }
                                    assertions = cdolist_list_var = gethash(constant, $newest_constant_of_assertions$.getDynamicValue(thread), NIL);
                                    ass = NIL;
                                    ass = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        v_answer = cons(ass, v_answer);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        ass = cdolist_list_var.first();
                                    } 
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$32 = idx_$30;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$32)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$32);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$32);
                            final SubLObject end_id = id_index_next_id(idx_$32);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
                                    SubLObject cdolist_list_var2;
                                    final SubLObject assertions2 = cdolist_list_var2 = gethash(constant2, $newest_constant_of_assertions$.getDynamicValue(thread), NIL);
                                    SubLObject ass2 = NIL;
                                    ass2 = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        v_answer = cons(ass2, v_answer);
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        ass2 = cdolist_list_var2.first();
                                    } 
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$29, thread);
            }
        } finally {
            $newest_constant_of_assertions$.rebind(_prev_bind_0, thread);
        }
        return nreverse(v_answer);
    }

    /**
     * Return the newest constant referenced in ASSERTION.
     */
    @LispMethod(comment = "Return the newest constant referenced in ASSERTION.")
    public static final SubLObject assertion_newest_constant_alt(SubLObject assertion) {
        {
            SubLObject newest_suid = MINUS_ONE_INTEGER;
            SubLObject constants = assertions_high.assertion_constants(assertion);
            SubLObject cdolist_list_var = constants;
            SubLObject constant = NIL;
            for (constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constant = cdolist_list_var.first()) {
                if (NIL != valid_constantP(constant, UNPROVIDED)) {
                    {
                        SubLObject suid = constant_suid(constant);
                        if (suid.numG(newest_suid)) {
                            newest_suid = suid;
                        }
                    }
                }
            }
            return find_constant_by_suid(newest_suid);
        }
    }

    /**
     * Return the newest constant referenced in ASSERTION.
     */
    @LispMethod(comment = "Return the newest constant referenced in ASSERTION.")
    public static SubLObject assertion_newest_constant(final SubLObject assertion) {
        SubLObject newest_suid = MINUS_ONE_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject constants = cdolist_list_var = assertions_high.assertion_constants(assertion);
        SubLObject constant = NIL;
        constant = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != valid_constantP(constant, UNPROVIDED)) {
                final SubLObject suid = constant_suid(constant);
                if (suid.numG(newest_suid)) {
                    newest_suid = suid;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            constant = cdolist_list_var.first();
        } 
        return find_constant_by_suid(newest_suid);
    }

    public static final SubLObject initialize_newest_constant_table_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $newest_constant_of_assertions$.setDynamicValue(make_hash_table(constant_count(), symbol_function(EQ), UNPROVIDED), thread);
            {
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$Computing_newest_constants, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$Computing_newest_constants);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject ass = NIL;
                                while (NIL != id) {
                                    ass = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, ass, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        {
                                            SubLObject newest_constant = com.cyc.cycjava.cycl.assertion_utilities.assertion_newest_constant(ass);
                                            sethash(newest_constant, $newest_constant_of_assertions$.getDynamicValue(thread), cons(ass, gethash(newest_constant, $newest_constant_of_assertions$.getDynamicValue(thread), NIL)));
                                        }
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            {
                SubLObject table_var = $newest_constant_of_assertions$.getDynamicValue(thread);
                $progress_note$.setDynamicValue($str_alt63$Sorting_newest_constants___Part_1, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject constant = NIL;
                            SubLObject assertions = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        constant = getEntryKey(cdohash_entry);
                                        assertions = getEntryValue(cdohash_entry);
                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        sethash(constant, $newest_constant_of_assertions$.getDynamicValue(thread), nreverse(assertions));
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject initialize_newest_constant_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $newest_constant_of_assertions$.setDynamicValue(make_hash_table(constant_count(), symbol_function(EQL), UNPROVIDED), thread);
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$Computing_newest_constants;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$34 = idx;
                if (NIL == id_index_objects_empty_p(idx_$34, $SKIP)) {
                    final SubLObject idx_$35 = idx_$34;
                    if (NIL == id_index_dense_objects_empty_p(idx_$35, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$35);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        SubLObject newest_constant;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                newest_constant = assertion_newest_constant(ass);
                                sethash(newest_constant, $newest_constant_of_assertions$.getDynamicValue(thread), cons(ass, gethash(newest_constant, $newest_constant_of_assertions$.getDynamicValue(thread), NIL)));
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$36 = idx_$34;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$36)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$36);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$36);
                        final SubLObject end_id = id_index_next_id(idx_$36);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                final SubLObject newest_constant2 = assertion_newest_constant(ass2);
                                sethash(newest_constant2, $newest_constant_of_assertions$.getDynamicValue(thread), cons(ass2, gethash(newest_constant2, $newest_constant_of_assertions$.getDynamicValue(thread), NIL)));
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        final SubLObject table_var = $newest_constant_of_assertions$.getDynamicValue(thread);
        final SubLObject _prev_bind_5 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_9 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_11 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_12 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str86$Sorting_newest_constants___Part_1, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(hash_table_count(table_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject constant = NIL;
                SubLObject assertions = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        constant = getEntryKey(cdohash_entry);
                        assertions = getEntryValue(cdohash_entry);
                        sethash(constant, $newest_constant_of_assertions$.getDynamicValue(thread), nreverse(assertions));
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } finally {
                final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_12, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_11, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_10, thread);
            $last_percent_progress_index$.rebind(_prev_bind_9, thread);
            $progress_sofar$.rebind(_prev_bind_8, thread);
            $progress_total$.rebind(_prev_bind_7, thread);
            $progress_start_time$.rebind(_prev_bind_6, thread);
            $progress_note$.rebind(_prev_bind_5, thread);
        }
        return NIL;
    }

    /**
     * Return T iff ASSERTION has some meta-assertions.
     */
    @LispMethod(comment = "Return T iff ASSERTION has some meta-assertions.")
    public static final SubLObject assertion_has_meta_assertionsP_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        return list_utilities.sublisp_boolean(assertions_low.assertion_index(assertion));
    }

    /**
     * Return T iff ASSERTION has some meta-assertions.
     */
    @LispMethod(comment = "Return T iff ASSERTION has some meta-assertions.")
    public static SubLObject assertion_has_meta_assertionsP(final SubLObject assertion) {
        SubLTrampolineFile.enforceType(assertion, ASSERTION_P);
        return list_utilities.sublisp_boolean(assertions_low.assertion_index(assertion));
    }

    /**
     * Return all the meta assertions recursively for ASSERTION.
     * It returns the meta-assertions, followed by meta-meta-assertions and so on.
     *
     * @unknown destructible
     */
    @LispMethod(comment = "Return all the meta assertions recursively for ASSERTION.\r\nIt returns the meta-assertions, followed by meta-meta-assertions and so on.\r\n\r\n@unknown destructible\nReturn all the meta assertions recursively for ASSERTION.\nIt returns the meta-assertions, followed by meta-meta-assertions and so on.")
    public static final SubLObject all_meta_assertions_alt(SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        if (NIL == com.cyc.cycjava.cycl.assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
            return NIL;
        }
        {
            SubLObject meta_assertions = kb_accessors.all_term_assertions(assertion, UNPROVIDED);
            return delete_duplicates(nconc(meta_assertions, Mapping.mapcan(symbol_function(ALL_META_ASSERTIONS), meta_assertions, EMPTY_SUBL_OBJECT_ARRAY)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Return all the meta assertions recursively for ASSERTION.
     * It returns the meta-assertions, followed by meta-meta-assertions and so on.
     *
     * @unknown destructible
     */
    @LispMethod(comment = "Return all the meta assertions recursively for ASSERTION.\r\nIt returns the meta-assertions, followed by meta-meta-assertions and so on.\r\n\r\n@unknown destructible\nReturn all the meta assertions recursively for ASSERTION.\nIt returns the meta-assertions, followed by meta-meta-assertions and so on.")
    public static SubLObject all_meta_assertions(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        if (NIL == assertion_has_meta_assertionsP(assertion)) {
            return NIL;
        }
        final SubLObject meta_assertions = kb_accessors.all_term_assertions(assertion, UNPROVIDED);
        return delete_duplicates(nconc(meta_assertions, Mapping.mapcan(symbol_function(ALL_META_ASSERTIONS), meta_assertions, EMPTY_SUBL_OBJECT_ARRAY)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject meta_assertion_list_for_editing_alt(SubLObject assertion) {
        {
            SubLObject meta_assertions = com.cyc.cycjava.cycl.assertion_utilities.all_meta_assertions(assertion);
            SubLObject meta_assertion_list = NIL;
            SubLObject cdolist_list_var = meta_assertions;
            SubLObject meta_assertion = NIL;
            for (meta_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , meta_assertion = cdolist_list_var.first()) {
                meta_assertion_list = cons(list(meta_assertion, assertions_high.assertion_mt(meta_assertion)), meta_assertion_list);
            }
            return nreverse(meta_assertion_list);
        }
    }

    public static SubLObject meta_assertion_list_for_editing(final SubLObject assertion) {
        final SubLObject meta_assertions = all_meta_assertions(assertion);
        SubLObject meta_assertion_list = NIL;
        SubLObject cdolist_list_var = meta_assertions;
        SubLObject meta_assertion = NIL;
        meta_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            meta_assertion_list = cons(list(meta_assertion, assertions_high.assertion_mt(meta_assertion)), meta_assertion_list);
            cdolist_list_var = cdolist_list_var.rest();
            meta_assertion = cdolist_list_var.first();
        } 
        return nreverse(meta_assertion_list);
    }

    /**
     * Return T iff ASSERTION is an assertion about another assertion.
     */
    @LispMethod(comment = "Return T iff ASSERTION is an assertion about another assertion.")
    public static final SubLObject meta_assertion_p_alt(SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != cycl_utilities.assertion_find_if(ASSERTION_P, assertion, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Return T iff ASSERTION is an assertion about another assertion.
     */
    @LispMethod(comment = "Return T iff ASSERTION is an assertion about another assertion.")
    public static SubLObject meta_assertion_p(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != cycl_utilities.assertion_find_if(ASSERTION_P, assertion, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject rule_meta_assertion_p(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != cycl_utilities.assertion_find_if($sym93$RULE_ASSERTION_, assertion, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject pragmatic_requirement_rule_p(final SubLObject assertion) {
        return makeBoolean(((NIL != assertions_high.rule_assertionP(assertion)) && (NIL != rule_meta_assertion_p(assertion))) && (NIL != removal_modules_formula_arg_n.formula_has_operatorP(clauses.pos_lits(assertions_high.assertion_cnf(assertion)).first(), $$meetsPragmaticRequirement)));
    }

    /**
     * Return the EL formula for META-ASSERTION with all sub-formulas for ASSERTION
     * replaced by ASSERTION-INDEXICAL.
     */
    @LispMethod(comment = "Return the EL formula for META-ASSERTION with all sub-formulas for ASSERTION\r\nreplaced by ASSERTION-INDEXICAL.\nReturn the EL formula for META-ASSERTION with all sub-formulas for ASSERTION\nreplaced by ASSERTION-INDEXICAL.")
    public static final SubLObject meta_assertion_el_formula_alt(SubLObject meta_assertion, SubLObject assertion, SubLObject assertion_indexical) {
        SubLTrampolineFile.checkType(meta_assertion, META_ASSERTION_P);
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        {
            SubLObject meta_assertion_el_formula = uncanonicalizer.assertion_el_formula(meta_assertion);
            if (NIL != cycl_utilities.expression_find(assertion, assertions_high.assertion_cons(meta_assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                if (NIL != hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), assertions_high.assertion_mt(meta_assertion))) {
                    {
                        SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula(assertion);
                        meta_assertion_el_formula = cycl_utilities.expression_subst(assertion_indexical, assertion_el_formula, meta_assertion_el_formula, symbol_function(EQUAL), UNPROVIDED);
                    }
                } else {
                    {
                        SubLObject assertion_el_ist_formula = uncanonicalizer.assertion_el_ist_formula(assertion);
                        meta_assertion_el_formula = cycl_utilities.expression_subst(assertion_indexical, assertion_el_ist_formula, meta_assertion_el_formula, symbol_function(EQUAL), UNPROVIDED);
                    }
                }
            }
            return meta_assertion_el_formula;
        }
    }

    /**
     * Return the EL formula for META-ASSERTION with all sub-formulas for ASSERTION
     * replaced by ASSERTION-INDEXICAL.
     */
    @LispMethod(comment = "Return the EL formula for META-ASSERTION with all sub-formulas for ASSERTION\r\nreplaced by ASSERTION-INDEXICAL.\nReturn the EL formula for META-ASSERTION with all sub-formulas for ASSERTION\nreplaced by ASSERTION-INDEXICAL.")
    public static SubLObject meta_assertion_el_formula(final SubLObject meta_assertion, final SubLObject assertion, final SubLObject assertion_indexical) {
        assert NIL != meta_assertion_p(meta_assertion) : "! assertion_utilities.meta_assertion_p(meta_assertion) " + ("assertion_utilities.meta_assertion_p(meta_assertion) " + "CommonSymbols.NIL != assertion_utilities.meta_assertion_p(meta_assertion) ") + meta_assertion;
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        SubLObject meta_assertion_el_formula = uncanonicalizer.assertion_el_formula(meta_assertion);
        if (NIL != cycl_utilities.expression_find(assertion, assertions_high.assertion_cons(meta_assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            if (NIL != hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), assertions_high.assertion_mt(meta_assertion))) {
                final SubLObject assertion_el_formula = uncanonicalizer.assertion_el_formula(assertion);
                meta_assertion_el_formula = cycl_utilities.expression_subst(assertion_indexical, assertion_el_formula, meta_assertion_el_formula, symbol_function(EQUAL), UNPROVIDED);
            } else {
                final SubLObject assertion_el_ist_formula = uncanonicalizer.assertion_el_ist_formula(assertion);
                meta_assertion_el_formula = cycl_utilities.expression_subst(assertion_indexical, assertion_el_ist_formula, meta_assertion_el_formula, symbol_function(EQUAL), UNPROVIDED);
            }
        }
        return meta_assertion_el_formula;
    }

    /**
     *
     *
     * @return boolean; t iff MT is the assertion-mt of every assertion in ASSERTIONS.
     */
    @LispMethod(comment = "@return boolean; t iff MT is the assertion-mt of every assertion in ASSERTIONS.")
    public static final SubLObject mt_of_assertions_p_alt(SubLObject mt, SubLObject assertions) {
        SubLTrampolineFile.checkType(mt, HLMT_P);
        SubLTrampolineFile.checkType(assertions, ASSERTION_LIST_P);
        {
            SubLObject mal_mtP = NIL;
            if (NIL == mal_mtP) {
                {
                    SubLObject csome_list_var = assertions;
                    SubLObject assertion = NIL;
                    for (assertion = csome_list_var.first(); !((NIL != mal_mtP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                        mal_mtP = makeBoolean(NIL == hlmt.hlmt_equal(mt, assertions_high.assertion_mt(assertion)));
                    }
                }
            }
            return makeBoolean(NIL == mal_mtP);
        }
    }

    /**
     *
     *
     * @return boolean; t iff MT is the assertion-mt of every assertion in ASSERTIONS.
     */
    @LispMethod(comment = "@return boolean; t iff MT is the assertion-mt of every assertion in ASSERTIONS.")
    public static SubLObject mt_of_assertions_p(final SubLObject mt, final SubLObject assertions) {
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        assert NIL != assertion_list_p(assertions) : "! assertion_utilities.assertion_list_p(assertions) " + ("assertion_utilities.assertion_list_p(assertions) " + "CommonSymbols.NIL != assertion_utilities.assertion_list_p(assertions) ") + assertions;
        SubLObject mal_mtP = NIL;
        if (NIL == mal_mtP) {
            SubLObject csome_list_var;
            SubLObject assertion;
            for (csome_list_var = assertions, assertion = NIL, assertion = csome_list_var.first(); (NIL == mal_mtP) && (NIL != csome_list_var); mal_mtP = makeBoolean(NIL == hlmt.hlmt_equal(mt, assertions_high.assertion_mt(assertion))) , csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
            }
        }
        return makeBoolean(NIL == mal_mtP);
    }

    /**
     *
     *
     * @return listp; list of every assertion in ASSERTIONS whose mt is MT.
     */
    @LispMethod(comment = "@return listp; list of every assertion in ASSERTIONS whose mt is MT.")
    public static final SubLObject assertions_of_mt_alt(SubLObject assertions, SubLObject mt) {
        SubLTrampolineFile.checkType(mt, HLMT_P);
        SubLTrampolineFile.checkType(assertions, ASSERTION_LIST_P);
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                if (NIL != hlmt.hlmt_equal(mt, assertions_high.assertion_mt(assertion))) {
                    result = cons(assertion, result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     *
     *
     * @return listp; list of every assertion in ASSERTIONS whose mt is MT.
     */
    @LispMethod(comment = "@return listp; list of every assertion in ASSERTIONS whose mt is MT.")
    public static SubLObject assertions_of_mt(final SubLObject assertions, final SubLObject mt) {
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        assert NIL != assertion_list_p(assertions) : "! assertion_utilities.assertion_list_p(assertions) " + ("assertion_utilities.assertion_list_p(assertions) " + "CommonSymbols.NIL != assertion_utilities.assertion_list_p(assertions) ") + assertions;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != hlmt.hlmt_equal(mt, assertions_high.assertion_mt(assertion))) {
                result = cons(assertion, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    /**
     *
     *
     * @return listp; list of every mt in ASSERTIONS.
    NB: this will not delete semantically duplicated hlmts.
     */
    @LispMethod(comment = "@return listp; list of every mt in ASSERTIONS.\r\nNB: this will not delete semantically duplicated hlmts.")
    public static final SubLObject mts_of_assertions_alt(SubLObject assertions) {
        SubLTrampolineFile.checkType(assertions, ASSERTION_LIST_P);
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                result = cons(assertions_high.assertion_mt(assertion), result);
            }
            return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return listp; list of every mt in ASSERTIONS.
    NB: this will not delete semantically duplicated hlmts.
     */
    @LispMethod(comment = "@return listp; list of every mt in ASSERTIONS.\r\nNB: this will not delete semantically duplicated hlmts.")
    public static SubLObject mts_of_assertions(final SubLObject assertions) {
        assert NIL != assertion_list_p(assertions) : "! assertion_utilities.assertion_list_p(assertions) " + ("assertion_utilities.assertion_list_p(assertions) " + "CommonSymbols.NIL != assertion_utilities.assertion_list_p(assertions) ") + assertions;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(assertions_high.assertion_mt(assertion), result);
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return nil or mt?, the unique minimum MT of ASSERTIONS' microtheories, if there is a unique one.  NIL otherwise.
     */
    @LispMethod(comment = "@return nil or mt?, the unique minimum MT of ASSERTIONS\' microtheories, if there is a unique one.  NIL otherwise.")
    public static final SubLObject assertions_min_mt_alt(SubLObject assertions) {
        {
            SubLObject mts = genl_mts.min_mts(Mapping.mapcar(ASSERTION_MT, assertions), UNPROVIDED);
            if (NIL != list_utilities.singletonP(mts)) {
                return list_utilities.only_one(mts);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return nil or mt?, the unique minimum MT of ASSERTIONS' microtheories, if there is a unique one.  NIL otherwise.
     */
    @LispMethod(comment = "@return nil or mt?, the unique minimum MT of ASSERTIONS\' microtheories, if there is a unique one.  NIL otherwise.")
    public static SubLObject assertions_min_mt(final SubLObject assertions) {
        final SubLObject mts = genl_mts.min_mts(Mapping.mapcar(ASSERTION_MT, assertions), UNPROVIDED);
        if (NIL != list_utilities.singletonP(mts)) {
            return list_utilities.only_one(mts);
        }
        return NIL;
    }

    public static SubLObject sort_assertions(final SubLObject assertions) {
        return Sort.sort(assertions, symbol_function($sym99$SAFE__), symbol_function(ASSERTION_ID));
    }

    public static final SubLObject sort_gafs_by_term_alt(SubLObject gafs, SubLObject term_sort_func, SubLObject pred_sort_func) {
        if (term_sort_func == UNPROVIDED) {
            term_sort_func = $sym74$TERM__;
        }
        if (pred_sort_func == UNPROVIDED) {
            pred_sort_func = $sym75$DEFINITIONAL_PRED__;
        }
        gafs = Sort.sort(gafs, symbol_function($sym76$_), symbol_function(ASSERTION_ID));
        gafs = Sort.stable_sort(gafs, pred_sort_func, symbol_function(GAF_PREDICATE));
        gafs = Sort.stable_sort(gafs, term_sort_func, symbol_function(GAF_ARG1));
        return gafs;
    }

    public static SubLObject sort_gafs_by_term(SubLObject gafs, SubLObject term_sort_func, SubLObject pred_sort_func) {
        if (term_sort_func == UNPROVIDED) {
            term_sort_func = $sym101$TERM__;
        }
        if (pred_sort_func == UNPROVIDED) {
            pred_sort_func = $sym102$DEFINITIONAL_PRED__;
        }
        gafs = sort_assertions(gafs);
        gafs = Sort.stable_sort(gafs, pred_sort_func, symbol_function(GAF_PREDICATE));
        gafs = Sort.stable_sort(gafs, term_sort_func, symbol_function(GAF_ARG1));
        return gafs;
    }

    /**
     * Returns a DNF clause expressing the implicit type constraints on the
     * variables of RULE.  Does not return #$isa constraints to #$Thing.
     */
    @LispMethod(comment = "Returns a DNF clause expressing the implicit type constraints on the\r\nvariables of RULE.  Does not return #$isa constraints to #$Thing.\nReturns a DNF clause expressing the implicit type constraints on the\nvariables of RULE.  Does not return #$isa constraints to #$Thing.")
    public static final SubLObject rule_type_constraints_alt(SubLObject rule) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cnf = assertions_high.assertion_cnf(rule);
                SubLObject mt = assertions_high.assertion_mt(rule);
                SubLObject constraints = NIL;
                {
                    SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = at_vars.$at_check_inter_arg_genlP$.currentBinding(thread);
                    try {
                        at_vars.$at_check_inter_arg_isaP$.bind(T, thread);
                        at_vars.$at_check_inter_arg_genlP$.bind(T, thread);
                        constraints = at_var_types.hl_cnf_variables_arg_constraints(cnf, mt);
                    } finally {
                        at_vars.$at_check_inter_arg_genlP$.rebind(_prev_bind_1, thread);
                        at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_0, thread);
                    }
                }
                constraints = remove_if($sym80$ISA_HL_VAR_THING_LIT_, constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if ((NIL != constraints) && (NIL != cycl_utilities.formula_args(constraints, UNPROVIDED))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject dnf_constraint_clauses = clausifier.dnf_clausal_form(constraints, mt);
                        SubLObject new_mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == hlmt.hlmt_equal(new_mt, mt)) {
                            Errors.warn($str_alt81$Type_constraint__Mt_should_be_can, mt, new_mt);
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == list_utilities.singletonP(dnf_constraint_clauses)) {
                                Errors.error($str_alt82$Expected_a_single_DNF_clause_of_c, rule, dnf_constraint_clauses);
                            }
                        }
                        return dnf_constraint_clauses.first();
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Returns a DNF clause expressing the implicit type constraints on the
     * variables of RULE.  Does not return #$isa constraints to #$Thing.
     */
    @LispMethod(comment = "Returns a DNF clause expressing the implicit type constraints on the\r\nvariables of RULE.  Does not return #$isa constraints to #$Thing.\nReturns a DNF clause expressing the implicit type constraints on the\nvariables of RULE.  Does not return #$isa constraints to #$Thing.")
    public static SubLObject rule_type_constraints(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        final SubLObject mt = assertions_high.assertion_mt(rule);
        SubLObject constraints = NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_check_inter_arg_genlP$.currentBinding(thread);
        try {
            at_vars.$at_check_inter_arg_isaP$.bind(T, thread);
            at_vars.$at_check_inter_arg_genlP$.bind(T, thread);
            constraints = at_var_types.hl_cnf_variables_arg_constraints(cnf, mt);
        } finally {
            at_vars.$at_check_inter_arg_genlP$.rebind(_prev_bind_2, thread);
            at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_0, thread);
        }
        constraints = remove_if($sym105$ISA_HL_VAR_THING_LIT_, constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != constraints) && (NIL != cycl_utilities.formula_args(constraints, UNPROVIDED))) {
            thread.resetMultipleValues();
            final SubLObject dnf_constraint_clauses = clausifier.dnf_clausal_form(constraints, mt);
            final SubLObject new_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == hlmt.hlmt_equal(new_mt, mt)) {
                Errors.warn($str106$Type_constraint__Mt_should_be_can, mt, new_mt);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(dnf_constraint_clauses))) {
                Errors.error($str107$Expected_a_single_DNF_clause_of_c, rule, dnf_constraint_clauses);
            }
            return dnf_constraint_clauses.first();
        }
        return NIL;
    }

    public static final SubLObject self_looping_ruleP_alt(SubLObject rule) {
        if (NIL != assertions_high.rule_assertionP(rule)) {
            return com.cyc.cycjava.cycl.assertion_utilities.cached_self_looping_rule_assertionP(rule);
        }
        return NIL;
    }

    public static SubLObject self_looping_ruleP(final SubLObject rule) {
        if (NIL != assertions_high.rule_assertionP(rule)) {
            return cached_self_looping_rule_assertionP(rule);
        }
        return NIL;
    }

    public static final SubLObject clear_cached_self_looping_rule_assertionP_alt() {
        {
            SubLObject cs = $cached_self_looping_rule_assertionP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_self_looping_rule_assertionP() {
        final SubLObject cs = $cached_self_looping_rule_assertionP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_self_looping_rule_assertionP_alt(SubLObject rule) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_self_looping_rule_assertionP_caching_state$.getGlobalValue(), list(rule), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_self_looping_rule_assertionP(final SubLObject rule) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_self_looping_rule_assertionP_caching_state$.getGlobalValue(), list(rule), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_self_looping_rule_assertionP_internal_alt(SubLObject rule) {
        {
            SubLObject cnf = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf);
            SubLObject pos_lit = NIL;
            for (pos_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos_lit = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_23 = clauses.neg_lits(cnf);
                    SubLObject neg_lit = NIL;
                    for (neg_lit = cdolist_list_var_23.first(); NIL != cdolist_list_var_23; cdolist_list_var_23 = cdolist_list_var_23.rest() , neg_lit = cdolist_list_var_23.first()) {
                        if (NIL != unification.unify_possible(pos_lit, neg_lit)) {
                            return T;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cached_self_looping_rule_assertionP_internal(final SubLObject rule) {
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        SubLObject cdolist_list_var = clauses.pos_lits(cnf);
        SubLObject pos_lit = NIL;
        pos_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$39 = clauses.neg_lits(cnf);
            SubLObject neg_lit = NIL;
            neg_lit = cdolist_list_var_$39.first();
            while (NIL != cdolist_list_var_$39) {
                if (NIL != unification.unify_possible(pos_lit, neg_lit)) {
                    return T;
                }
                cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                neg_lit = cdolist_list_var_$39.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pos_lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject cached_self_looping_rule_assertionP_alt(SubLObject rule) {
        {
            SubLObject caching_state = $cached_self_looping_rule_assertionP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym83$CACHED_SELF_LOOPING_RULE_ASSERTION_, $sym84$_CACHED_SELF_LOOPING_RULE_ASSERTION__CACHING_STATE_, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, $kw85$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw85$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.assertion_utilities.cached_self_looping_rule_assertionP_internal(rule)));
                    memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject cached_self_looping_rule_assertionP(final SubLObject rule) {
        SubLObject caching_state = $cached_self_looping_rule_assertionP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym108$CACHED_SELF_LOOPING_RULE_ASSERTION_, $sym109$_CACHED_SELF_LOOPING_RULE_ASSERTION__CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_self_looping_rule_assertionP_internal(rule)));
            memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject self_expanding_ruleP_alt(SubLObject rule) {
        if (NIL != assertions_high.rule_assertionP(rule)) {
            return com.cyc.cycjava.cycl.assertion_utilities.cached_self_expanding_rule_assertionP(rule);
        }
        return NIL;
    }

    public static SubLObject self_expanding_ruleP(final SubLObject rule) {
        if (NIL != assertions_high.rule_assertionP(rule)) {
            return cached_self_expanding_rule_assertionP(rule);
        }
        return NIL;
    }

    public static final SubLObject clear_cached_self_expanding_rule_assertionP_alt() {
        {
            SubLObject cs = $cached_self_expanding_rule_assertionP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_cached_self_expanding_rule_assertionP() {
        final SubLObject cs = $cached_self_expanding_rule_assertionP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_cached_self_expanding_rule_assertionP_alt(SubLObject rule) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_self_expanding_rule_assertionP_caching_state$.getGlobalValue(), list(rule), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_cached_self_expanding_rule_assertionP(final SubLObject rule) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_self_expanding_rule_assertionP_caching_state$.getGlobalValue(), list(rule), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cached_self_expanding_rule_assertionP_internal_alt(SubLObject rule) {
        {
            SubLObject cnf = assertions_high.assertion_cnf(rule);
            SubLObject witness = NIL;
            SubLObject rest = NIL;
            for (rest = clauses.pos_lits(cnf); !((NIL != witness) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject pos_lit = rest.first();
                    SubLObject count = ZERO_INTEGER;
                    SubLObject cdolist_list_var = clauses.neg_lits(cnf);
                    SubLObject neg_lit = NIL;
                    for (neg_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , neg_lit = cdolist_list_var.first()) {
                        if (NIL != unification.unify_possible(pos_lit, neg_lit)) {
                            count = add(count, ONE_INTEGER);
                        }
                    }
                    if (count.numGE(TWO_INTEGER)) {
                        witness = pos_lit;
                    }
                }
            }
            return list_utilities.sublisp_boolean(witness);
        }
    }

    public static SubLObject cached_self_expanding_rule_assertionP_internal(final SubLObject rule) {
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        SubLObject witness;
        SubLObject rest;
        SubLObject pos_lit;
        SubLObject count;
        SubLObject cdolist_list_var;
        SubLObject neg_lit;
        for (witness = NIL, rest = NIL, rest = clauses.pos_lits(cnf); (NIL == witness) && (NIL != rest); rest = rest.rest()) {
            pos_lit = rest.first();
            count = ZERO_INTEGER;
            cdolist_list_var = clauses.neg_lits(cnf);
            neg_lit = NIL;
            neg_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != unification.unify_possible(pos_lit, neg_lit)) {
                    count = add(count, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                neg_lit = cdolist_list_var.first();
            } 
            if (count.numGE(TWO_INTEGER)) {
                witness = pos_lit;
            }
        }
        return list_utilities.sublisp_boolean(witness);
    }

    public static final SubLObject cached_self_expanding_rule_assertionP_alt(SubLObject rule) {
        {
            SubLObject caching_state = $cached_self_expanding_rule_assertionP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym86$CACHED_SELF_EXPANDING_RULE_ASSERTION_, $sym87$_CACHED_SELF_EXPANDING_RULE_ASSERTION__CACHING_STATE_, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, $kw85$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw85$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.assertion_utilities.cached_self_expanding_rule_assertionP_internal(rule)));
                    memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject cached_self_expanding_rule_assertionP(final SubLObject rule) {
        SubLObject caching_state = $cached_self_expanding_rule_assertionP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym110$CACHED_SELF_EXPANDING_RULE_ASSERTION_, $sym111$_CACHED_SELF_EXPANDING_RULE_ASSERTION__CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_self_expanding_rule_assertionP_internal(rule)));
            memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject safe_all_forward_rules_relevant_to_term(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        SubLObject rules = NIL;
        SubLObject threshold_exceededP = NIL;
        try {
            thread.throwStack.push($ALL_FORWARD_RULES_RELEVANT_TO_TERMS_THRESHOLD_EXCEEDED);
            final SubLObject _prev_bind_0 = $within_safe_all_forward_rules_relevant_to_termP$.currentBinding(thread);
            try {
                $within_safe_all_forward_rules_relevant_to_termP$.bind(T, thread);
                rules = all_forward_rules_relevant_to_term_int(fort);
            } finally {
                $within_safe_all_forward_rules_relevant_to_termP$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            threshold_exceededP = Errors.handleThrowable(ccatch_env_var, $ALL_FORWARD_RULES_RELEVANT_TO_TERMS_THRESHOLD_EXCEEDED);
        } finally {
            thread.throwStack.pop();
        }
        rules = Sort.sort(rules, symbol_function($sym115$_), symbol_function(ASSERTION_DEPENDENT_COUNT));
        if (NIL != threshold_exceededP) {
            return $ALL;
        }
        return rules;
    }

    /**
     * Return a list of all the forward rules involved in a deduction
     * that is either an argument* or a dependent* of some assertion
     * on FORT.  'argument*' and 'dependent*' mean 'transitive argument'
     * and 'transitive dependent'.
     */
    @LispMethod(comment = "Return a list of all the forward rules involved in a deduction\r\nthat is either an argument* or a dependent* of some assertion\r\non FORT.  \'argument*\' and \'dependent*\' mean \'transitive argument\'\r\nand \'transitive dependent\'.\nReturn a list of all the forward rules involved in a deduction\nthat is either an argument* or a dependent* of some assertion\non FORT.  \'argument*\' and \'dependent*\' mean \'transitive argument\'\nand \'transitive dependent\'.")
    public static final SubLObject all_forward_rules_relevant_to_term_alt(SubLObject fort) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        {
            SubLObject rules = com.cyc.cycjava.cycl.assertion_utilities.all_forward_rules_relevant_to_term_int(fort);
            rules = Sort.sort(rules, symbol_function($sym89$_), symbol_function(ASSERTION_DEPENDENT_COUNT));
            return rules;
        }
    }

    /**
     * Return a list of all the forward rules involved in a deduction
     * that is either an argument* or a dependent* of some assertion
     * on FORT.  'argument*' and 'dependent*' mean 'transitive argument'
     * and 'transitive dependent'.
     */
    @LispMethod(comment = "Return a list of all the forward rules involved in a deduction\r\nthat is either an argument* or a dependent* of some assertion\r\non FORT.  \'argument*\' and \'dependent*\' mean \'transitive argument\'\r\nand \'transitive dependent\'.\nReturn a list of all the forward rules involved in a deduction\nthat is either an argument* or a dependent* of some assertion\non FORT.  \'argument*\' and \'dependent*\' mean \'transitive argument\'\nand \'transitive dependent\'.")
    public static SubLObject all_forward_rules_relevant_to_term(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        SubLObject rules = all_forward_rules_relevant_to_term_int(fort);
        rules = Sort.sort(rules, symbol_function($sym115$_), symbol_function(ASSERTION_DEPENDENT_COUNT));
        return rules;
    }

    public static SubLObject safe_all_forward_rules_relevant_to_terms(final SubLObject v_forts) {
        return possibly_safe_all_forward_rules_relevant_to_terms(v_forts, T);
    }

    /**
     * Return a list of all the forward rules involved in a deduction
     * that is either an argument* or a dependent* of some assertion
     * on one of the terms in FORTS.  'argument*' and 'dependent*' mean
     * 'transitive argument' and 'transitive dependent'.
     */
    @LispMethod(comment = "Return a list of all the forward rules involved in a deduction\r\nthat is either an argument* or a dependent* of some assertion\r\non one of the terms in FORTS.  \'argument*\' and \'dependent*\' mean\r\n\'transitive argument\' and \'transitive dependent\'.\nReturn a list of all the forward rules involved in a deduction\nthat is either an argument* or a dependent* of some assertion\non one of the terms in FORTS.  \'argument*\' and \'dependent*\' mean\n\'transitive argument\' and \'transitive dependent\'.")
    public static final SubLObject all_forward_rules_relevant_to_terms_alt(SubLObject v_forts) {
        {
            SubLObject list_var = v_forts;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, FORT_P);
                }
            }
        }
        {
            SubLObject rules = NIL;
            SubLObject cdolist_list_var = v_forts;
            SubLObject fort = NIL;
            for (fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_24 = com.cyc.cycjava.cycl.assertion_utilities.all_forward_rules_relevant_to_term(fort);
                    SubLObject rule = NIL;
                    for (rule = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest() , rule = cdolist_list_var_24.first()) {
                        {
                            SubLObject item_var = rule;
                            if (NIL == member(item_var, rules, symbol_function(EQ), symbol_function(IDENTITY))) {
                                rules = cons(item_var, rules);
                            }
                        }
                    }
                }
            }
            rules = Sort.sort(rules, symbol_function($sym89$_), symbol_function(ASSERTION_DEPENDENT_COUNT));
            return rules;
        }
    }

    /**
     * Return a list of all the forward rules involved in a deduction
     * that is either an argument* or a dependent* of some assertion
     * on one of the terms in FORTS.  'argument*' and 'dependent*' mean
     * 'transitive argument' and 'transitive dependent'.
     */
    @LispMethod(comment = "Return a list of all the forward rules involved in a deduction\r\nthat is either an argument* or a dependent* of some assertion\r\non one of the terms in FORTS.  \'argument*\' and \'dependent*\' mean\r\n\'transitive argument\' and \'transitive dependent\'.\nReturn a list of all the forward rules involved in a deduction\nthat is either an argument* or a dependent* of some assertion\non one of the terms in FORTS.  \'argument*\' and \'dependent*\' mean\n\'transitive argument\' and \'transitive dependent\'.")
    public static SubLObject all_forward_rules_relevant_to_terms(final SubLObject v_forts) {
        return possibly_safe_all_forward_rules_relevant_to_terms(v_forts, NIL);
    }

    public static SubLObject possibly_safe_all_forward_rules_relevant_to_term(final SubLObject fort, final SubLObject safeP) {
        return NIL != safeP ? safe_all_forward_rules_relevant_to_term(fort) : all_forward_rules_relevant_to_term(fort);
    }

    public static SubLObject possibly_safe_all_forward_rules_relevant_to_terms(final SubLObject v_forts, final SubLObject safeP) {
        assert NIL != list_utilities.non_dotted_list_p(v_forts) : "! list_utilities.non_dotted_list_p(v_forts) " + ("list_utilities.non_dotted_list_p(v_forts) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(v_forts) ") + v_forts;
        SubLObject cdolist_list_var = v_forts;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject rules = NIL;
        cdolist_list_var = v_forts;
        SubLObject fort = NIL;
        fort = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$40 = possibly_safe_all_forward_rules_relevant_to_term(fort, safeP);
            SubLObject rule = NIL;
            rule = cdolist_list_var_$40.first();
            while (NIL != cdolist_list_var_$40) {
                final SubLObject item_var = rule;
                if (NIL == member(item_var, rules, symbol_function(EQL), symbol_function(IDENTITY))) {
                    rules = cons(item_var, rules);
                }
                cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                rule = cdolist_list_var_$40.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        } 
        rules = Sort.sort(rules, symbol_function($sym115$_), symbol_function(ASSERTION_DEPENDENT_COUNT));
        return rules;
    }

    /**
     * Returns all supports of DEDUCTION that are forward rules.
     */
    @LispMethod(comment = "Returns all supports of DEDUCTION that are forward rules.")
    public static final SubLObject deduction_forward_rule_supports_alt(SubLObject deduction) {
        {
            SubLObject forward_rules = NIL;
            SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                if (NIL != assertions_high.forward_ruleP(support)) {
                    forward_rules = cons(support, forward_rules);
                }
            }
            return nreverse(forward_rules);
        }
    }

    /**
     * Returns all supports of DEDUCTION that are forward rules.
     */
    @LispMethod(comment = "Returns all supports of DEDUCTION that are forward rules.")
    public static SubLObject deduction_forward_rule_supports(final SubLObject deduction) {
        SubLObject forward_rules = NIL;
        SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertions_high.forward_ruleP(support)) {
                forward_rules = cons(support, forward_rules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return nreverse(forward_rules);
    }

    public static final SubLObject all_forward_rules_relevant_to_term_int_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rules = NIL;
                {
                    SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $all_forward_rules_relevant_to_term_argument_set$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $all_forward_rules_relevant_to_term_dependent_set$.currentBinding(thread);
                    SubLObject _prev_bind_4 = $all_forward_rules_relevant_to_term_nart_set$.currentBinding(thread);
                    SubLObject _prev_bind_5 = $all_forward_rules_relevant_to_term_result_set$.currentBinding(thread);
                    try {
                        $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        $mt$.bind($$EverythingPSC, thread);
                        $all_forward_rules_relevant_to_term_argument_set$.bind(new_set(symbol_function(EQ), UNPROVIDED), thread);
                        $all_forward_rules_relevant_to_term_dependent_set$.bind(new_set(symbol_function(EQ), UNPROVIDED), thread);
                        $all_forward_rules_relevant_to_term_nart_set$.bind(new_set(symbol_function(EQ), UNPROVIDED), thread);
                        $all_forward_rules_relevant_to_term_result_set$.bind(new_set(symbol_function(EQ), UNPROVIDED), thread);
                        com.cyc.cycjava.cycl.assertion_utilities.compute_all_forward_rules_relevant_to_term(fort, $list_alt92);
                        rules = $all_forward_rules_relevant_to_term_result_set$.getDynamicValue(thread);
                    } finally {
                        $all_forward_rules_relevant_to_term_result_set$.rebind(_prev_bind_5, thread);
                        $all_forward_rules_relevant_to_term_nart_set$.rebind(_prev_bind_4, thread);
                        $all_forward_rules_relevant_to_term_dependent_set$.rebind(_prev_bind_3, thread);
                        $all_forward_rules_relevant_to_term_argument_set$.rebind(_prev_bind_2, thread);
                        $mt$.rebind(_prev_bind_1, thread);
                        $relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return set_element_list(rules);
            }
        }
    }

    public static SubLObject all_forward_rules_relevant_to_term_int(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $all_forward_rules_relevant_to_term_argument_set$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $all_forward_rules_relevant_to_term_dependent_set$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $all_forward_rules_relevant_to_term_nart_set$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $all_forward_rules_relevant_to_term_result_set$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            $all_forward_rules_relevant_to_term_argument_set$.bind(set.new_set(symbol_function(EQL), UNPROVIDED), thread);
            $all_forward_rules_relevant_to_term_dependent_set$.bind(set.new_set(symbol_function(EQL), UNPROVIDED), thread);
            $all_forward_rules_relevant_to_term_nart_set$.bind(set.new_set(symbol_function(EQL), UNPROVIDED), thread);
            $all_forward_rules_relevant_to_term_result_set$.bind(set.new_set(symbol_function(EQL), UNPROVIDED), thread);
            compute_all_forward_rules_relevant_to_term(fort, $list118);
            rules = $all_forward_rules_relevant_to_term_result_set$.getDynamicValue(thread);
        } finally {
            $all_forward_rules_relevant_to_term_result_set$.rebind(_prev_bind_6, thread);
            $all_forward_rules_relevant_to_term_nart_set$.rebind(_prev_bind_5, thread);
            $all_forward_rules_relevant_to_term_dependent_set$.rebind(_prev_bind_4, thread);
            $all_forward_rules_relevant_to_term_argument_set$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return set.set_element_list(rules);
    }

    public static final SubLObject compute_all_forward_rules_relevant_to_term_alt(SubLObject fort, SubLObject walk_directions) {
        if (NIL != kb_mapping_macros.do_term_index_key_validator(fort, NIL)) {
            {
                SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, NIL);
                SubLObject done_var = NIL;
                SubLObject token_var = NIL;
                while (NIL == done_var) {
                    {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                        if (NIL != valid) {
                            {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                    {
                                        SubLObject done_var_25 = NIL;
                                        SubLObject token_var_26 = NIL;
                                        while (NIL == done_var_25) {
                                            {
                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_26);
                                                SubLObject valid_27 = makeBoolean(token_var_26 != assertion);
                                                if (NIL != valid_27) {
                                                    if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec)) {
                                                        {
                                                            SubLObject cdolist_list_var = walk_directions;
                                                            SubLObject walk_direction = NIL;
                                                            for (walk_direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , walk_direction = cdolist_list_var.first()) {
                                                                com.cyc.cycjava.cycl.assertion_utilities.compute_all_forward_rules_relevant_to_assertion(assertion, walk_direction);
                                                            }
                                                        }
                                                    }
                                                }
                                                done_var_25 = makeBoolean(NIL == valid_27);
                                            }
                                        } 
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                        }
                                    }
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
            }
        }
        return NIL;
    }

    public static SubLObject compute_all_forward_rules_relevant_to_term(final SubLObject fort, final SubLObject walk_directions) {
        if (NIL != kb_mapping_macros.do_term_index_key_validator(fort, NIL)) {
            final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, NIL);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                        SubLObject done_var_$41 = NIL;
                        final SubLObject token_var_$42 = NIL;
                        while (NIL == done_var_$41) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$42);
                            final SubLObject valid_$43 = makeBoolean(!token_var_$42.eql(assertion));
                            if ((NIL != valid_$43) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec))) {
                                SubLObject cdolist_list_var = walk_directions;
                                SubLObject walk_direction = NIL;
                                walk_direction = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    compute_all_forward_rules_relevant_to_assertion(assertion, walk_direction);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    walk_direction = cdolist_list_var.first();
                                } 
                            }
                            done_var_$41 = makeBoolean(NIL == valid_$43);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return NIL;
    }

    public static final SubLObject compute_all_forward_rules_relevant_to_assertion_alt(SubLObject assertion, SubLObject walk_direction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = walk_direction;
                if (pcase_var.eql($kw93$ARGUMENT_)) {
                    if (NIL != set_memberP(assertion, $all_forward_rules_relevant_to_term_argument_set$.getDynamicValue(thread))) {
                        return NIL;
                    }
                    set_add(assertion, $all_forward_rules_relevant_to_term_argument_set$.getDynamicValue(thread));
                } else {
                    if (pcase_var.eql($kw94$DEPENDENT_)) {
                        if (NIL != set_memberP(assertion, $all_forward_rules_relevant_to_term_dependent_set$.getDynamicValue(thread))) {
                            return NIL;
                        }
                        set_add(assertion, $all_forward_rules_relevant_to_term_dependent_set$.getDynamicValue(thread));
                    }
                }
            }
            {
                SubLObject cdolist_list_var = cycl_utilities.expression_narts(assertion, T, UNPROVIDED);
                SubLObject nart = NIL;
                for (nart = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nart = cdolist_list_var.first()) {
                    if (NIL == set_memberP(nart, $all_forward_rules_relevant_to_term_nart_set$.getDynamicValue(thread))) {
                        set_add(nart, $all_forward_rules_relevant_to_term_nart_set$.getDynamicValue(thread));
                        if (NIL != kb_accessors.skolemize_forwardP(cycl_utilities.nat_functor(nart), assertions_high.assertion_mt(assertion))) {
                            com.cyc.cycjava.cycl.assertion_utilities.compute_all_forward_rules_relevant_to_term(nart, list(walk_direction));
                        }
                    }
                }
            }
            com.cyc.cycjava.cycl.assertion_utilities.compute_all_forward_rules_relevant_to_assertion_int(assertion, walk_direction);
            return NIL;
        }
    }

    public static SubLObject compute_all_forward_rules_relevant_to_assertion(final SubLObject assertion, final SubLObject walk_direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != gaf_assertion_with_pred_p(assertion, $$trueRule)) {
            return NIL;
        }
        if (NIL == assertions_high.forward_deduced_assertionP(assertion, NIL)) {
            return NIL;
        }
        if (walk_direction.eql($kw120$ARGUMENT_)) {
            if (NIL != set.set_memberP(assertion, $all_forward_rules_relevant_to_term_argument_set$.getDynamicValue(thread))) {
                return NIL;
            }
            set.set_add(assertion, $all_forward_rules_relevant_to_term_argument_set$.getDynamicValue(thread));
        } else
            if (walk_direction.eql($kw121$DEPENDENT_)) {
                if (NIL != set.set_memberP(assertion, $all_forward_rules_relevant_to_term_dependent_set$.getDynamicValue(thread))) {
                    return NIL;
                }
                set.set_add(assertion, $all_forward_rules_relevant_to_term_dependent_set$.getDynamicValue(thread));
            }

        SubLObject cdolist_list_var = cycl_utilities.expression_narts(assertion, T, UNPROVIDED);
        SubLObject nart = NIL;
        nart = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == set.set_memberP(nart, $all_forward_rules_relevant_to_term_nart_set$.getDynamicValue(thread))) {
                set.set_add(nart, $all_forward_rules_relevant_to_term_nart_set$.getDynamicValue(thread));
                if (NIL != kb_accessors.skolemize_forwardP(cycl_utilities.nat_functor(nart), assertions_high.assertion_mt(assertion))) {
                    compute_all_forward_rules_relevant_to_term(nart, list(walk_direction));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            nart = cdolist_list_var.first();
        } 
        compute_all_forward_rules_relevant_to_assertion_int(assertion, walk_direction);
        return NIL;
    }

    public static final SubLObject compute_all_forward_rules_relevant_to_assertion_int_alt(SubLObject assertion, SubLObject walk_direction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                SubLObject argument = NIL;
                for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                    if (NIL != deduction_p(argument)) {
                        set_utilities.set_add_all(com.cyc.cycjava.cycl.assertion_utilities.deduction_forward_rule_supports(argument), $all_forward_rules_relevant_to_term_result_set$.getDynamicValue(thread));
                    }
                }
            }
            {
                SubLObject pcase_var = walk_direction;
                if (pcase_var.eql($kw93$ARGUMENT_)) {
                    {
                        SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                        SubLObject argument = NIL;
                        for (argument = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , argument = cdolist_list_var.first()) {
                            if (NIL != deduction_p(argument)) {
                                {
                                    SubLObject cdolist_list_var_28 = deductions_high.deduction_supports(argument);
                                    SubLObject supporting_assertion = NIL;
                                    for (supporting_assertion = cdolist_list_var_28.first(); NIL != cdolist_list_var_28; cdolist_list_var_28 = cdolist_list_var_28.rest() , supporting_assertion = cdolist_list_var_28.first()) {
                                        if (NIL != assertion_handles.assertion_p(supporting_assertion)) {
                                            com.cyc.cycjava.cycl.assertion_utilities.compute_all_forward_rules_relevant_to_assertion(supporting_assertion, walk_direction);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($kw94$DEPENDENT_)) {
                        {
                            SubLObject cdolist_list_var = assertions_high.assertion_dependents(assertion);
                            SubLObject deduction = NIL;
                            for (deduction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , deduction = cdolist_list_var.first()) {
                                {
                                    SubLObject dependent_assertion = deductions_high.deduction_assertion(deduction);
                                    if (NIL != assertion_handles.assertion_p(dependent_assertion)) {
                                        com.cyc.cycjava.cycl.assertion_utilities.compute_all_forward_rules_relevant_to_assertion(dependent_assertion, walk_direction);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject compute_all_forward_rules_relevant_to_assertion_int(final SubLObject assertion, final SubLObject walk_direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != deduction_handles.deduction_p(argument)) {
                final SubLObject supports = deduction_forward_rule_supports(argument);
                set_utilities.set_add_all(supports, $all_forward_rules_relevant_to_term_result_set$.getDynamicValue(thread));
                if (NIL != $within_safe_all_forward_rules_relevant_to_termP$.getDynamicValue(thread)) {
                    final SubLObject size = set.set_size($all_forward_rules_relevant_to_term_result_set$.getDynamicValue(thread));
                    if (size.numG($all_forward_rules_relevant_to_term_threshold$.getDynamicValue(thread))) {
                        sublisp_throw($ALL_FORWARD_RULES_RELEVANT_TO_TERMS_THRESHOLD_EXCEEDED, size);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        } 
        if (walk_direction.eql($kw120$ARGUMENT_)) {
            SubLObject cdolist_list_var2 = assertions_high.assertion_arguments(assertion);
            SubLObject argument2 = NIL;
            argument2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (NIL != deduction_handles.deduction_p(argument2)) {
                    SubLObject cdolist_list_var_$44 = deductions_high.deduction_supports(argument2);
                    SubLObject supporting_assertion = NIL;
                    supporting_assertion = cdolist_list_var_$44.first();
                    while (NIL != cdolist_list_var_$44) {
                        if (NIL != assertion_handles.assertion_p(supporting_assertion)) {
                            compute_all_forward_rules_relevant_to_assertion(supporting_assertion, walk_direction);
                        }
                        cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                        supporting_assertion = cdolist_list_var_$44.first();
                    } 
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                argument2 = cdolist_list_var2.first();
            } 
        } else
            if (walk_direction.eql($kw121$DEPENDENT_)) {
                final SubLObject set_contents_var = assertions_high.assertion_dependents(assertion);
                SubLObject basis_object;
                SubLObject state;
                SubLObject deduction;
                SubLObject dependent_assertion;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    deduction = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                        dependent_assertion = deductions_high.deduction_assertion(deduction);
                        if (NIL != assertion_handles.assertion_p(dependent_assertion)) {
                            compute_all_forward_rules_relevant_to_assertion(dependent_assertion, walk_direction);
                        }
                    }
                }
            }

        return NIL;
    }

    public static SubLObject deduction_asserted_assertion_supports(final SubLObject deduction, SubLObject depth_limit) {
        if (depth_limit == UNPROVIDED) {
            depth_limit = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $deduction_asserted_assertion_supports_deductions_processed$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $deduction_asserted_assertion_counts$.currentBinding(thread);
        try {
            $deduction_asserted_assertion_supports_deductions_processed$.bind(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
            $deduction_asserted_assertion_counts$.bind(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
            deduction_asserted_assertion_supports_int(deduction, depth_limit);
            return dictionary_utilities.copy_dictionary($deduction_asserted_assertion_counts$.getDynamicValue(thread));
        } finally {
            $deduction_asserted_assertion_counts$.rebind(_prev_bind_2, thread);
            $deduction_asserted_assertion_supports_deductions_processed$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject deduction_asserted_assertion_supports_int(final SubLObject deduction, final SubLObject depth_limit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != dictionary.dictionary_lookup($deduction_asserted_assertion_supports_deductions_processed$.getDynamicValue(thread), deduction, UNPROVIDED)) {
            return NIL;
        }
        dictionary.dictionary_enter($deduction_asserted_assertion_supports_deductions_processed$.getDynamicValue(thread), deduction, T);
        SubLObject supports_to_descend = deductions_high.deduction_supports(deduction);
        SubLObject deductions_to_descend = NIL;
        SubLObject done_supports = NIL;
        SubLObject support = NIL;
        while (NIL != supports_to_descend) {
            support = supports_to_descend.first();
            supports_to_descend = supports_to_descend.rest();
            if ((NIL != assertion_handles.assertion_p(support)) && (NIL != assertions_high.asserted_assertionP(support))) {
                dictionary_utilities.dictionary_increment($deduction_asserted_assertion_counts$.getDynamicValue(thread), support, UNPROVIDED);
            } else
                if ((NIL != assertion_handles.assertion_p(support)) && (NIL != assertions_high.deduced_assertionP(support))) {
                    SubLObject cdolist_list_var = assertions_high.assertion_arguments(support);
                    SubLObject argument = NIL;
                    argument = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL != assertion_handles.assertion_p(argument)) && (NIL != assertions_high.asserted_assertionP(argument))) {
                            dictionary_utilities.dictionary_increment($deduction_asserted_assertion_counts$.getDynamicValue(thread), support, UNPROVIDED);
                        } else
                            if (NIL != deduction_handles.deduction_p(argument)) {
                                final SubLObject item_var = argument;
                                if (NIL == member(item_var, deductions_to_descend, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    deductions_to_descend = cons(item_var, deductions_to_descend);
                                }
                            } else {
                                Errors.sublisp_break($str122$can_t_handle_argument__S_yet, new SubLObject[]{ argument });
                            }

                        cdolist_list_var = cdolist_list_var.rest();
                        argument = cdolist_list_var.first();
                    } 
                } else {
                    SubLObject cdolist_list_var = arguments.support_justification(support);
                    SubLObject sub_support = NIL;
                    sub_support = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != deduction_handles.deduction_p(sub_support)) {
                            final SubLObject item_var = sub_support;
                            if (NIL == member(item_var, deductions_to_descend, symbol_function(EQL), symbol_function(IDENTITY))) {
                                deductions_to_descend = cons(item_var, deductions_to_descend);
                            }
                        } else
                            if (NIL != arguments.support_p(sub_support)) {
                                if (NIL == list_utilities.member_equalP(sub_support, done_supports)) {
                                    final SubLObject item_var = sub_support;
                                    if (NIL == member(item_var, supports_to_descend, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        supports_to_descend = cons(item_var, supports_to_descend);
                                    }
                                }
                            } else {
                                Errors.sublisp_break($str123$can_t_handle_sub_support__S_yet, new SubLObject[]{ sub_support });
                            }

                        cdolist_list_var = cdolist_list_var.rest();
                        sub_support = cdolist_list_var.first();
                    } 
                }

            final SubLObject item_var2 = support;
            if (NIL == member(item_var2, done_supports, symbol_function(EQL), symbol_function(IDENTITY))) {
                done_supports = cons(item_var2, done_supports);
            }
        } 
        if (!depth_limit.eql(ONE_INTEGER)) {
            SubLObject cdolist_list_var = deductions_to_descend;
            SubLObject deduction_to_descend = NIL;
            deduction_to_descend = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                deduction_asserted_assertion_supports_int(deduction_to_descend, subtract(depth_limit, ONE_INTEGER));
                cdolist_list_var = cdolist_list_var.rest();
                deduction_to_descend = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject assertion_asserted_assertion_supports(final SubLObject assertion, SubLObject depth_limit) {
        if (depth_limit == UNPROVIDED) {
            depth_limit = ZERO_INTEGER;
        }
        final SubLObject result = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = assertions_high.assertion_deductions(assertion);
        SubLObject deduction = NIL;
        deduction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject assertion_supports = deduction_asserted_assertion_supports(deduction, depth_limit);
            set_utilities.set_add_all(dictionary.dictionary_keys(assertion_supports), result);
            cdolist_list_var = cdolist_list_var.rest();
            deduction = cdolist_list_var.first();
        } 
        return set.set_element_list(result);
    }

    /**
     * Return a list of all exception rules visible from MT.
     */
    @LispMethod(comment = "Return a list of all exception rules visible from MT.")
    public static final SubLObject gather_all_exception_rules_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject exceptions = new_set(symbol_function(EQ), UNPROVIDED);
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $relevant_mts$.currentBinding(thread);
                    try {
                        $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
                        $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
                        $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject message_var = $$$gathering_exception_rules;
                            SubLObject total = assertions_low.rule_count();
                            SubLObject sofar = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_29 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_30 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2_31 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble(message_var);
                                    {
                                        SubLObject vector_var = keyhash.do_keyhash_nodes(assertions_low.kb_rule_set());
                                        SubLObject backwardP_var = NIL;
                                        SubLObject length = length(vector_var);
                                        SubLObject v_iteration = NIL;
                                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            {
                                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                SubLObject rule = aref(vector_var, element_num);
                                                if (NIL != keyhash.do_keyhash_valid_key_p(rule)) {
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    note_percent_progress(sofar, total);
                                                    if (NIL != abnormal.rule_has_exceptionsP(rule)) {
                                                        if (NIL != kb_mapping_macros.do_exception_rule_index_key_validator(rule, NIL)) {
                                                            {
                                                                SubLObject iterator_var = kb_mapping_macros.new_exception_rule_final_index_spec_iterator(rule, NIL);
                                                                SubLObject done_var = NIL;
                                                                SubLObject token_var = NIL;
                                                                while (NIL == done_var) {
                                                                    {
                                                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                        if (NIL != valid) {
                                                                            {
                                                                                SubLObject final_index_iterator = NIL;
                                                                                try {
                                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                                                    {
                                                                                        SubLObject done_var_32 = NIL;
                                                                                        SubLObject token_var_33 = NIL;
                                                                                        while (NIL == done_var_32) {
                                                                                            {
                                                                                                SubLObject except = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_33);
                                                                                                SubLObject valid_34 = makeBoolean(token_var_33 != except);
                                                                                                if (NIL != valid_34) {
                                                                                                    set_add(except, exceptions);
                                                                                                }
                                                                                                done_var_32 = makeBoolean(NIL == valid_34);
                                                                                            }
                                                                                        } 
                                                                                    }
                                                                                } finally {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            if (NIL != final_index_iterator) {
                                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                            }
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_35, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var = makeBoolean(NIL == valid);
                                                                    }
                                                                } 
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2_31, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_30, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_29, thread);
                                }
                            }
                        }
                    } finally {
                        $relevant_mts$.rebind(_prev_bind_2, thread);
                        $relevant_mt_function$.rebind(_prev_bind_1, thread);
                        $mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return Sort.sort(set_element_list(exceptions), symbol_function($sym76$_), symbol_function(ASSERTION_ID));
            }
        }
    }

    /**
     * Return a list of all exception rules visible from MT.
     */
    @LispMethod(comment = "Return a list of all exception rules visible from MT.")
    public static SubLObject gather_all_exception_rules(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject exceptions = set.new_set(symbol_function(EQL), UNPROVIDED);
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject message_var = $$$gathering_exception_rules;
            final SubLObject total = assertions_low.rule_count();
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0_$45 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$46 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_2_$47 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message_var);
                    final SubLObject iterator_var = kb_iterators.new_rule_iterator();
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject rule = iteration.iteration_next(iterator_var);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            sofar = add(sofar, ONE_INTEGER);
                            note_percent_progress(sofar, total);
                            if ((NIL != abnormal.rule_has_exceptionsP(rule)) && (NIL != kb_mapping_macros.do_exception_rule_index_key_validator(rule, NIL))) {
                                final SubLObject iterator_var_$48 = kb_mapping_macros.new_exception_rule_final_index_spec_iterator(rule, NIL);
                                SubLObject done_var_$49 = NIL;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var_$49) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var_$48, token_var);
                                    final SubLObject valid_$50 = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid_$50) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                            SubLObject done_var_$50 = NIL;
                                            final SubLObject token_var_$52 = NIL;
                                            while (NIL == done_var_$50) {
                                                final SubLObject except = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$52);
                                                final SubLObject valid_$51 = makeBoolean(!token_var_$52.eql(except));
                                                if (NIL != valid_$51) {
                                                    set.set_add(except, exceptions);
                                                }
                                                done_var_$50 = makeBoolean(NIL == valid_$51);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                                            }
                                        }
                                    }
                                    done_var_$49 = makeBoolean(NIL == valid_$50);
                                } 
                            }
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_2_$47, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$46, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$45, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sort_assertions(set.set_element_list(exceptions));
    }

    /**
     * Return a list of all pragma rules visible from MT.
     */
    @LispMethod(comment = "Return a list of all pragma rules visible from MT.")
    public static final SubLObject gather_all_pragma_rules_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pragmas = new_set(symbol_function(EQ), UNPROVIDED);
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = $mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $relevant_mts$.currentBinding(thread);
                    try {
                        $mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
                        $relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
                        $relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject message_var = $$$gathering_pragma_rules;
                            SubLObject total = assertions_low.rule_count();
                            SubLObject sofar = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_36 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_37 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2_38 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble(message_var);
                                    {
                                        SubLObject vector_var = keyhash.do_keyhash_nodes(assertions_low.kb_rule_set());
                                        SubLObject backwardP_var = NIL;
                                        SubLObject length = length(vector_var);
                                        SubLObject v_iteration = NIL;
                                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            {
                                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                SubLObject rule = aref(vector_var, element_num);
                                                if (NIL != keyhash.do_keyhash_valid_key_p(rule)) {
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    note_percent_progress(sofar, total);
                                                    if (NIL != inference_worker_transformation.rule_assertion_has_some_pragmatic_requirementP(rule, UNPROVIDED)) {
                                                        if (NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule, NIL)) {
                                                            {
                                                                SubLObject iterator_var = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule, NIL);
                                                                SubLObject done_var = NIL;
                                                                SubLObject token_var = NIL;
                                                                while (NIL == done_var) {
                                                                    {
                                                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                        if (NIL != valid) {
                                                                            {
                                                                                SubLObject final_index_iterator = NIL;
                                                                                try {
                                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                                                                    {
                                                                                        SubLObject done_var_39 = NIL;
                                                                                        SubLObject token_var_40 = NIL;
                                                                                        while (NIL == done_var_39) {
                                                                                            {
                                                                                                SubLObject pragma = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_40);
                                                                                                SubLObject valid_41 = makeBoolean(token_var_40 != pragma);
                                                                                                if (NIL != valid_41) {
                                                                                                    set_add(pragma, pragmas);
                                                                                                }
                                                                                                done_var_39 = makeBoolean(NIL == valid_41);
                                                                                            }
                                                                                        } 
                                                                                    }
                                                                                } finally {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            if (NIL != final_index_iterator) {
                                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                            }
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_42, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var = makeBoolean(NIL == valid);
                                                                    }
                                                                } 
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2_38, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_37, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_36, thread);
                                }
                            }
                        }
                    } finally {
                        $relevant_mts$.rebind(_prev_bind_2, thread);
                        $relevant_mt_function$.rebind(_prev_bind_1, thread);
                        $mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return Sort.sort(set_element_list(pragmas), symbol_function($sym76$_), symbol_function(ASSERTION_ID));
            }
        }
    }

    /**
     * Return a list of all pragma rules visible from MT.
     */
    @LispMethod(comment = "Return a list of all pragma rules visible from MT.")
    public static SubLObject gather_all_pragma_rules(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pragmas = set.new_set(symbol_function(EQL), UNPROVIDED);
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject message_var = $$$gathering_pragma_rules;
            final SubLObject total = assertions_low.rule_count();
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0_$56 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$57 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_2_$58 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message_var);
                    final SubLObject iterator_var = kb_iterators.new_rule_iterator();
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject rule = iteration.iteration_next(iterator_var);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            sofar = add(sofar, ONE_INTEGER);
                            note_percent_progress(sofar, total);
                            if ((NIL != inference_worker_transformation.rule_assertion_has_some_pragmatic_requirementP(rule, UNPROVIDED)) && (NIL != kb_mapping_macros.do_pragma_rule_index_key_validator(rule, NIL))) {
                                final SubLObject iterator_var_$59 = kb_mapping_macros.new_pragma_rule_final_index_spec_iterator(rule, NIL);
                                SubLObject done_var_$60 = NIL;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var_$60) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var_$59, token_var);
                                    final SubLObject valid_$61 = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid_$61) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                                            SubLObject done_var_$61 = NIL;
                                            final SubLObject token_var_$63 = NIL;
                                            while (NIL == done_var_$61) {
                                                final SubLObject pragma = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$63);
                                                final SubLObject valid_$62 = makeBoolean(!token_var_$63.eql(pragma));
                                                if (NIL != valid_$62) {
                                                    set.set_add(pragma, pragmas);
                                                }
                                                done_var_$61 = makeBoolean(NIL == valid_$62);
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$57 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                            }
                                        }
                                    }
                                    done_var_$60 = makeBoolean(NIL == valid_$61);
                                } 
                            }
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$58 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_2_$58, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$57, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$56, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sort_assertions(set.set_element_list(pragmas));
    }

    /**
     * Return a list of all lifting rules.
     */
    @LispMethod(comment = "Return a list of all lifting rules.")
    public static final SubLObject gather_all_lifting_rules_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lifting_rules = new_set(symbol_function(EQ), UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $mt$.currentBinding(thread);
                    try {
                        $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        $mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject message_var = $$$gathering_lifting_rules;
                            SubLObject total = assertions_low.rule_count();
                            SubLObject sofar = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_43 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_44 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble(message_var);
                                    {
                                        SubLObject vector_var = keyhash.do_keyhash_nodes(assertions_low.kb_rule_set());
                                        SubLObject backwardP_var = NIL;
                                        SubLObject length = length(vector_var);
                                        SubLObject v_iteration = NIL;
                                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            {
                                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                SubLObject rule = aref(vector_var, element_num);
                                                if (NIL != keyhash.do_keyhash_valid_key_p(rule)) {
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    note_percent_progress(sofar, total);
                                                    if (NIL != com.cyc.cycjava.cycl.assertion_utilities.lifting_ruleP(rule)) {
                                                        set_add(rule, lifting_rules);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_44, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_43, thread);
                                }
                            }
                        }
                    } finally {
                        $mt$.rebind(_prev_bind_1, thread);
                        $relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return Sort.sort(set_element_list(lifting_rules), symbol_function($sym76$_), symbol_function(ASSERTION_ID));
            }
        }
    }

    /**
     * Return a list of all lifting rules.
     */
    @LispMethod(comment = "Return a list of all lifting rules.")
    public static SubLObject gather_all_lifting_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lifting_rules = set.new_set(symbol_function(EQL), UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject message_var = $$$gathering_lifting_rules;
            final SubLObject total = assertions_low.rule_count();
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0_$67 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$68 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message_var);
                    final SubLObject iterator_var = kb_iterators.new_rule_iterator();
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject rule = iteration.iteration_next(iterator_var);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            sofar = add(sofar, ONE_INTEGER);
                            note_percent_progress(sofar, total);
                            if (NIL != lifting_ruleP(rule)) {
                                set.set_add(rule, lifting_rules);
                            }
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$68, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$67, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return sort_assertions(set.set_element_list(lifting_rules));
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("RULE-VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc rules")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt1 = list(makeKeyword("PROGRESS-MESSAGE"), $DONE);

    private static final SubLSymbol DO_KEYHASH = makeSymbol("DO-KEYHASH");

    static private final SubLList $list_alt7 = list(makeSymbol("KB-RULE-SET"));

    static private final SubLList $list_alt12 = list(list(makeSymbol("RULE-COUNT")));

    static private final SubLList $list_alt13 = list(ZERO_INTEGER);

    static private final SubLList $list_alt18 = list(list(makeSymbol("GAF-VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc GAFs")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt23 = list(list(makeSymbol("DEPENDENT-ASSERTION"), makeSymbol("ASSERTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym24$DEDUCTION = makeUninternedSymbol("DEDUCTION");

    static private final SubLList $list_alt28 = list(list(makeSymbol("SUPPORTING-ASSERTION"), makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt29 = list($DONE);

    static private final SubLSymbol $sym30$ARGUMENT = makeUninternedSymbol("ARGUMENT");

    /**
     * Return T iff RULE is a lifting rule
     */
    @LispMethod(comment = "Return T iff RULE is a lifting rule")
    public static final SubLObject lifting_ruleP_alt(SubLObject rule) {
        if (NIL != assertions_high.rule_assertionP(rule)) {
            {
                SubLObject cnf = assertions_high.assertion_cnf(rule);
                {
                    SubLObject cdolist_list_var = clauses.neg_lits(cnf);
                    SubLObject neg_lit = NIL;
                    for (neg_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , neg_lit = cdolist_list_var.first()) {
                        if (NIL != el_formula_with_operator_p(neg_lit, $$ist)) {
                            return neg_lit;
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = clauses.pos_lits(cnf);
                    SubLObject pos_lit = NIL;
                    for (pos_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos_lit = cdolist_list_var.first()) {
                        if (NIL != el_formula_with_operator_p(pos_lit, $$ist)) {
                            return pos_lit;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Return T iff RULE is a lifting rule
     */
    @LispMethod(comment = "Return T iff RULE is a lifting rule")
    public static SubLObject lifting_ruleP(final SubLObject rule) {
        if (NIL != assertions_high.rule_assertionP(rule)) {
            final SubLObject cnf = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf);
            SubLObject neg_lit = NIL;
            neg_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != el_formula_with_operator_p(neg_lit, $$ist)) {
                    return neg_lit;
                }
                cdolist_list_var = cdolist_list_var.rest();
                neg_lit = cdolist_list_var.first();
            } 
            cdolist_list_var = clauses.pos_lits(cnf);
            SubLObject pos_lit = NIL;
            pos_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != el_formula_with_operator_p(pos_lit, $$ist)) {
                    return pos_lit;
                }
                cdolist_list_var = cdolist_list_var.rest();
                pos_lit = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    static private final SubLString $str_alt59$Sorting_newest_constants___Part_2 = makeString("Sorting newest constants : Part 2");

    public static SubLObject lifting_consequent_ruleP(final SubLObject rule) {
        if (NIL != assertions_high.rule_assertionP(rule)) {
            final SubLObject cnf = assertions_high.assertion_cnf(rule);
            SubLObject cdolist_list_var = clauses.pos_lits(cnf);
            SubLObject pos_lit = NIL;
            pos_lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != el_formula_with_operator_p(pos_lit, $$ist)) {
                    return pos_lit;
                }
                cdolist_list_var = cdolist_list_var.rest();
                pos_lit = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    static private final SubLString $str_alt63$Sorting_newest_constants___Part_1 = makeString("Sorting newest constants : Part 1");

    static private final SubLSymbol $sym64$ASSERTION_HAS_META_ASSERTIONS_ = makeSymbol("ASSERTION-HAS-META-ASSERTIONS?");

    static private final SubLList $list_alt65 = list(makeSymbol("ASSERTION"));

    static private final SubLString $str_alt66$Return_T_iff_ASSERTION_has_some_m = makeString("Return T iff ASSERTION has some meta-assertions.");

    static private final SubLList $list_alt67 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")));

    static private final SubLList $list_alt68 = list(makeSymbol("BOOLEANP"));

    public static SubLObject universal_lifting_ruleP(final SubLObject rule) {
        return makeBoolean((NIL != lifting_consequent_ruleP(rule)) && (NIL != kb_mapping_utilities.fpred_value_in_any_mt(rule, $$universalLiftingRule, ONE_INTEGER, ONE_INTEGER, UNPROVIDED)));
    }

    static private final SubLSymbol $sym74$TERM__ = makeSymbol("TERM-<");

    public static final SubLObject rule_has_unlabelled_dont_care_variableP_alt(SubLObject rule) {
        SubLTrampolineFile.checkType(rule, $sym99$RULE_ASSERTION_);
        if (NIL == assertions_high.meta_assertionP(rule)) {
            {
                SubLObject cnf = assertions_high.assertion_cnf(rule);
                SubLObject names = assertions_high.assertion_variable_names(rule);
                SubLObject list_var = NIL;
                SubLObject name = NIL;
                SubLObject id = NIL;
                for (list_var = names, name = list_var.first(), id = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , name = list_var.first() , id = add(ONE_INTEGER, id)) {
                    {
                        SubLObject variable = variables.find_variable_by_id(id);
                        if (ONE_INTEGER.numE(list_utilities.simple_tree_count(variable, cnf))) {
                            if (NIL == string_utilities.starts_with(name, $str_alt100$__)) {
                                return variable;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject rule_has_unlabelled_dont_care_variableP(final SubLObject rule) {
        assert NIL != assertions_high.rule_assertionP(rule) : "! assertions_high.rule_assertionP(rule) " + ("assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) ") + rule;
        if (NIL != assertions_high.single_literal_ruleP(rule)) {
            return NIL;
        }
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        final SubLObject names = assertions_high.assertion_variable_names(rule);
        SubLObject list_var = NIL;
        SubLObject name = NIL;
        SubLObject id = NIL;
        list_var = names;
        name = list_var.first();
        for (id = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , name = list_var.first() , id = add(ONE_INTEGER, id)) {
            final SubLObject variable = variables.find_variable_by_id(id);
            SubLObject lit_count = ZERO_INTEGER;
            SubLObject cdolist_list_var = clauses.neg_lits(cnf);
            SubLObject lit = NIL;
            lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != cycl_utilities.expression_find(variable, lit, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    lit_count = add(lit_count, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                lit = cdolist_list_var.first();
            } 
            cdolist_list_var = clauses.pos_lits(cnf);
            lit = NIL;
            lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != cycl_utilities.expression_find(variable, lit, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    lit_count = add(lit_count, ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                lit = cdolist_list_var.first();
            } 
            if (ONE_INTEGER.numE(lit_count) && (NIL == string_utilities.starts_with(name, $str129$__))) {
                return variable;
            }
        }
        return NIL;
    }

    static private final SubLSymbol $sym75$DEFINITIONAL_PRED__ = makeSymbol("DEFINITIONAL-PRED-<");

    static private final SubLSymbol $sym76$_ = makeSymbol("<");

    static private final SubLSymbol $sym80$ISA_HL_VAR_THING_LIT_ = makeSymbol("ISA-HL-VAR-THING-LIT?");

    static private final SubLString $str_alt81$Type_constraint__Mt_should_be_can = makeString("Type constraint: Mt should be canonical ~a, but isn't ~a");

    static private final SubLString $str_alt82$Expected_a_single_DNF_clause_of_c = makeString("Expected a single DNF clause of constraints for ~a but got more than one: ~a");

    static private final SubLSymbol $sym83$CACHED_SELF_LOOPING_RULE_ASSERTION_ = makeSymbol("CACHED-SELF-LOOPING-RULE-ASSERTION?");

    static private final SubLSymbol $sym84$_CACHED_SELF_LOOPING_RULE_ASSERTION__CACHING_STATE_ = makeSymbol("*CACHED-SELF-LOOPING-RULE-ASSERTION?-CACHING-STATE*");

    public static final SubLSymbol $kw85$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym86$CACHED_SELF_EXPANDING_RULE_ASSERTION_ = makeSymbol("CACHED-SELF-EXPANDING-RULE-ASSERTION?");

    static private final SubLSymbol $sym87$_CACHED_SELF_EXPANDING_RULE_ASSERTION__CACHING_STATE_ = makeSymbol("*CACHED-SELF-EXPANDING-RULE-ASSERTION?-CACHING-STATE*");

    static private final SubLSymbol $sym89$_ = makeSymbol(">");

    static private final SubLList $list_alt92 = list(makeKeyword("ARGUMENT*"), makeKeyword("DEPENDENT*"));

    public static final SubLSymbol $kw93$ARGUMENT_ = makeKeyword("ARGUMENT*");

    public static final SubLSymbol $kw94$DEPENDENT_ = makeKeyword("DEPENDENT*");

    public static final SubLObject rule_unlabelled_dont_care_variables_alt(SubLObject rule) {
        SubLTrampolineFile.checkType(rule, $sym99$RULE_ASSERTION_);
        if (NIL == assertions_high.meta_assertionP(rule)) {
            {
                SubLObject cnf = assertions_high.assertion_cnf(rule);
                SubLObject names = assertions_high.assertion_variable_names(rule);
                SubLObject unlabelled_dont_care_variables = NIL;
                SubLObject list_var = NIL;
                SubLObject name = NIL;
                SubLObject id = NIL;
                for (list_var = names, name = list_var.first(), id = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , name = list_var.first() , id = add(ONE_INTEGER, id)) {
                    {
                        SubLObject variable = variables.find_variable_by_id(id);
                        if (ONE_INTEGER.numE(list_utilities.simple_tree_count(variable, cnf))) {
                            if (NIL == string_utilities.starts_with(name, $str_alt100$__)) {
                                unlabelled_dont_care_variables = cons(variable, unlabelled_dont_care_variables);
                            }
                        }
                    }
                }
                return nreverse(unlabelled_dont_care_variables);
            }
        }
        return NIL;
    }

    public static SubLObject rule_unlabelled_dont_care_variables(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertions_high.rule_assertionP(rule) : "! assertions_high.rule_assertionP(rule) " + ("assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) ") + rule;
        if (NIL != assertions_high.single_literal_ruleP(rule)) {
            return NIL;
        }
        final SubLObject cnf = assertions_high.assertion_cnf(rule);
        final SubLObject names = assertions_high.assertion_variable_names(rule);
        SubLObject unlabelled_dont_care_variables = NIL;
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind(FALSE, thread);
            SubLObject list_var = NIL;
            SubLObject name = NIL;
            SubLObject id = NIL;
            list_var = names;
            name = list_var.first();
            for (id = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , name = list_var.first() , id = add(ONE_INTEGER, id)) {
                final SubLObject variable = variables.find_variable_by_id(id);
                SubLObject lit_count = ZERO_INTEGER;
                SubLObject cdolist_list_var = clauses.neg_lits(cnf);
                SubLObject lit = NIL;
                lit = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != cycl_utilities.expression_find(variable, lit, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        lit_count = add(lit_count, ONE_INTEGER);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    lit = cdolist_list_var.first();
                } 
                cdolist_list_var = clauses.pos_lits(cnf);
                lit = NIL;
                lit = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != cycl_utilities.expression_find(variable, lit, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        lit_count = add(lit_count, ONE_INTEGER);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    lit = cdolist_list_var.first();
                } 
                if (ONE_INTEGER.numE(lit_count) && (NIL == string_utilities.starts_with(name, $str129$__))) {
                    unlabelled_dont_care_variables = cons(variable, unlabelled_dont_care_variables);
                }
            }
        } finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
        return nreverse(unlabelled_dont_care_variables);
    }

    static private final SubLSymbol $sym99$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    static private final SubLString $str_alt100$__ = makeString("??");

    static private final SubLString $str_alt101$Verifying_that_all_embedded_asser = makeString("Verifying that all embedded assertions are findable via ID");

    static private final SubLString $str_alt102$Looking_for_assertions_with_no_ar = makeString("Looking for assertions with no arguments");

    /**
     * This should be T for all assertions.
     */
    @LispMethod(comment = "This should be T for all assertions.")
    public static final SubLObject assertion_findable_by_idP_alt(SubLObject assertion) {
        return eq(assertion, assertion_handles.find_assertion_by_id(assertion_handles.assertion_id(assertion)));
    }

    /**
     * This should be T for all assertions.
     */
    @LispMethod(comment = "This should be T for all assertions.")
    public static SubLObject assertion_findable_by_idP(final SubLObject assertion) {
        return eql(assertion, assertion_handles.find_assertion_by_id(assertion_handles.assertion_id(assertion)));
    }

    public static SubLObject embedded_assertions(final SubLObject assertion, SubLObject include_selfP, SubLObject penetrate_hl_structuresP) {
        if (include_selfP == UNPROVIDED) {
            include_selfP = NIL;
        }
        if (penetrate_hl_structuresP == UNPROVIDED) {
            penetrate_hl_structuresP = NIL;
        }
        final SubLObject embedded_assertions = (NIL != include_selfP) ? cycl_utilities.expression_gather(assertion, ASSERTION_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED) : cycl_utilities.expression_gather(fi.assertion_hl_formula(assertion, UNPROVIDED), ASSERTION_P, penetrate_hl_structuresP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return embedded_assertions;
    }

    /**
     * Checks assertions embedded in ASSERTION to verify that they are findable by their ids.
     *
     * @param INCLUDE-SELF?
     * 		booleanp; whether to also check ASSERTION.
     */
    @LispMethod(comment = "Checks assertions embedded in ASSERTION to verify that they are findable by their ids.\r\n\r\n@param INCLUDE-SELF?\r\n\t\tbooleanp; whether to also check ASSERTION.")
    public static final SubLObject embedded_assertions_findable_by_idP_alt(SubLObject assertion, SubLObject include_selfP) {
        if (include_selfP == UNPROVIDED) {
            include_selfP = NIL;
        }
        {
            SubLObject embedded_assertions = (NIL != include_selfP) ? ((SubLObject) (cycl_utilities.expression_gather(assertion, ASSERTION_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : cycl_utilities.expression_gather(fi.assertion_hl_formula(assertion, UNPROVIDED), ASSERTION_P, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = embedded_assertions;
            SubLObject embedded_assertion = NIL;
            for (embedded_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , embedded_assertion = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.assertion_utilities.assertion_findable_by_idP(embedded_assertion)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    /**
     * Checks assertions embedded in ASSERTION to verify that they are findable by their ids.
     *
     * @param INCLUDE-SELF?
     * 		booleanp; whether to also check ASSERTION.
     */
    @LispMethod(comment = "Checks assertions embedded in ASSERTION to verify that they are findable by their ids.\r\n\r\n@param INCLUDE-SELF?\r\n\t\tbooleanp; whether to also check ASSERTION.")
    public static SubLObject embedded_assertions_findable_by_idP(final SubLObject assertion, SubLObject include_selfP) {
        if (include_selfP == UNPROVIDED) {
            include_selfP = NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject embedded_assertions = cdolist_list_var = embedded_assertions(assertion, include_selfP, UNPROVIDED);
        SubLObject embedded_assertion = NIL;
        embedded_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == assertion_findable_by_idP(embedded_assertion)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            embedded_assertion = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject assertions_containing_assertions_not_findable_by_id_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hosed_assertions = NIL;
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt101$Verifying_that_all_embedded_asser, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($str_alt101$Verifying_that_all_embedded_asser);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject ass = NIL;
                                while (NIL != id) {
                                    ass = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, ass, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL != com.cyc.cycjava.cycl.assertion_utilities.meta_assertion_p(ass)) {
                                            if (NIL == com.cyc.cycjava.cycl.assertion_utilities.embedded_assertions_findable_by_idP(ass, NIL)) {
                                                hosed_assertions = cons(ass, hosed_assertions);
                                            }
                                        }
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(hosed_assertions);
            }
        }
    }

    public static SubLObject assertions_containing_assertions_not_findable_by_id() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hosed_assertions = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str131$Verifying_that_all_embedded_asser;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$70 = idx;
                if (NIL == id_index_objects_empty_p(idx_$70, $SKIP)) {
                    final SubLObject idx_$71 = idx_$70;
                    if (NIL == id_index_dense_objects_empty_p(idx_$71, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$71);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if ((NIL != meta_assertion_p(ass)) && (NIL == embedded_assertions_findable_by_idP(ass, NIL))) {
                                    hosed_assertions = cons(ass, hosed_assertions);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$72 = idx_$70;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$72)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$72);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$72);
                        final SubLObject end_id = id_index_next_id(idx_$72);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if ((NIL != meta_assertion_p(ass2)) && (NIL == embedded_assertions_findable_by_idP(ass2, NIL))) {
                                    hosed_assertions = cons(ass2, hosed_assertions);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$73 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$73, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(hosed_assertions);
    }

    public static final SubLObject assertions_with_no_arguments_alt(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertions = NIL;
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt102$Looking_for_assertions_with_no_ar, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($str_alt102$Looking_for_assertions_with_no_ar);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject ass = NIL;
                                while (NIL != id) {
                                    ass = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, ass, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL == assertions_high.assertion_arguments(ass)) {
                                            if (NIL != verboseP) {
                                                print(ass, UNPROVIDED);
                                                force_output(UNPROVIDED);
                                            }
                                            assertions = cons(ass, assertions);
                                        }
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(assertions);
            }
        }
    }

    public static SubLObject assertions_with_no_arguments(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str132$Looking_for_assertions_with_no_ar;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$74 = idx;
                if (NIL == id_index_objects_empty_p(idx_$74, $SKIP)) {
                    final SubLObject idx_$75 = idx_$74;
                    if (NIL == id_index_dense_objects_empty_p(idx_$75, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$75);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL == assertions_high.assertion_arguments(ass)) {
                                    if (NIL != verboseP) {
                                        print(ass, UNPROVIDED);
                                        force_output(UNPROVIDED);
                                    }
                                    assertions = cons(ass, assertions);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$76 = idx_$74;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$76)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$76);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$76);
                        final SubLObject end_id = id_index_next_id(idx_$76);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL == assertions_high.assertion_arguments(ass2)) {
                                    if (NIL != verboseP) {
                                        print(ass2, UNPROVIDED);
                                        force_output(UNPROVIDED);
                                    }
                                    assertions = cons(ass2, assertions);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(assertions);
    }

    public static final SubLObject syntactically_ill_formed_assertion_count_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$mapping_Cyc_assertions, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_Cyc_assertions);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject ass = NIL;
                                while (NIL != id) {
                                    ass = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, ass, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL != com.cyc.cycjava.cycl.assertion_utilities.syntactically_ill_formed_assertionP(ass)) {
                                            count = add(count, ONE_INTEGER);
                                        }
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject syntactically_ill_formed_assertion_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$mapping_Cyc_assertions;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$78 = idx;
                if (NIL == id_index_objects_empty_p(idx_$78, $SKIP)) {
                    final SubLObject idx_$79 = idx_$78;
                    if (NIL == id_index_dense_objects_empty_p(idx_$79, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$79);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != syntactically_ill_formed_assertionP(ass)) {
                                    count = add(count, ONE_INTEGER);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$80 = idx_$78;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$80)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$80);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$80);
                        final SubLObject end_id = id_index_next_id(idx_$80);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != syntactically_ill_formed_assertionP(ass2)) {
                                    count = add(count, ONE_INTEGER);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$81 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static final SubLObject syntactically_ill_formed_assertions_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$mapping_Cyc_assertions, STRINGP);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_Cyc_assertions);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject ass = NIL;
                                while (NIL != id) {
                                    ass = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, ass, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL != com.cyc.cycjava.cycl.assertion_utilities.syntactically_ill_formed_assertionP(ass)) {
                                            result = cons(ass, result);
                                        }
                                    }
                                    id = do_id_index_next_id(idx, T, id, state_var);
                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    public static SubLObject syntactically_ill_formed_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$mapping_Cyc_assertions;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$82 = idx;
                if (NIL == id_index_objects_empty_p(idx_$82, $SKIP)) {
                    final SubLObject idx_$83 = idx_$82;
                    if (NIL == id_index_dense_objects_empty_p(idx_$83, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$83);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != syntactically_ill_formed_assertionP(ass)) {
                                    result = cons(ass, result);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$84 = idx_$82;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$84)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$84);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$84);
                        final SubLObject end_id = id_index_next_id(idx_$84);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != syntactically_ill_formed_assertionP(ass2)) {
                                    result = cons(ass2, result);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$85 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static final SubLObject syntactically_ill_formed_assertionP_alt(SubLObject ass) {
        return makeBoolean(NIL == cycl_grammar.cycl_sentence_p(fi.assertion_hl_formula(ass, UNPROVIDED)));
    }

    public static SubLObject syntactically_ill_formed_assertionP(final SubLObject ass) {
        return makeBoolean(NIL == cycl_grammar.cycl_sentence_p(fi.assertion_hl_formula(ass, UNPROVIDED)));
    }

    public static SubLObject assertion_rarest_term(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = NIL;
        SubLObject count = NIL;
        final SubLObject _prev_bind_0 = $rarest_term$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $rarest_count$.currentBinding(thread);
        try {
            $rarest_term$.bind($UNSPECIFIED, thread);
            $rarest_count$.bind($most_positive_fixnum$.getGlobalValue(), thread);
            cycl_utilities.assertion_map(symbol_function(UPDATE_RAREST_TERM), assertion, UNPROVIDED, UNPROVIDED);
            v_term = $rarest_term$.getDynamicValue(thread);
            count = $rarest_count$.getDynamicValue(thread);
        } finally {
            $rarest_count$.rebind(_prev_bind_2, thread);
            $rarest_term$.rebind(_prev_bind_0, thread);
        }
        return values(v_term, count);
    }

    public static SubLObject assertion_term_rarity(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_term = assertion_rarest_term(assertion);
        final SubLObject count = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(count, v_term);
    }

    public static SubLObject sort_assertions_via_term_rarity(SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                assertions = Sort.stable_sort(assertions, symbol_function($sym136$_), symbol_function(MEMOIZED_ASSERTION_TERM_RARITY));
            } finally {
                final SubLObject _prev_bind_0_$86 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$86, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    public static SubLObject update_rarest_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != indexed_term_p(v_term)) {
            final SubLObject count = kb_indexing.num_index(v_term);
            if (count.numL($rarest_count$.getDynamicValue(thread))) {
                $rarest_term$.setDynamicValue(v_term, thread);
                $rarest_count$.setDynamicValue(count, thread);
            }
        }
        return NIL;
    }

    public static SubLObject memoized_assertion_term_rarity_internal(final SubLObject assertion) {
        return assertion_term_rarity(assertion);
    }

    public static SubLObject memoized_assertion_term_rarity(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_assertion_term_rarity_internal(assertion);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MEMOIZED_ASSERTION_TERM_RARITY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MEMOIZED_ASSERTION_TERM_RARITY, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MEMOIZED_ASSERTION_TERM_RARITY, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(memoized_assertion_term_rarity_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject declare_assertion_utilities_file_alt() {
        declareMacro("do_rules", "DO-RULES");
        declareMacro("do_gafs", "DO-GAFS");
        declareMacro("do_assertion_dependent_assertions", "DO-ASSERTION-DEPENDENT-ASSERTIONS");
        declareMacro("do_assertion_supporting_assertions", "DO-ASSERTION-SUPPORTING-ASSERTIONS");
        declareFunction("assertion_list_p", "ASSERTION-LIST-P", 1, 0, false);
        declareFunction("list_of_rule_assertion_p", "LIST-OF-RULE-ASSERTION-P", 1, 0, false);
        declareFunction("assertion_dependent_assertions", "ASSERTION-DEPENDENT-ASSERTIONS", 1, 0, false);
        declareFunction("true_assertionP", "TRUE-ASSERTION?", 1, 0, false);
        declareFunction("false_assertionP", "FALSE-ASSERTION?", 1, 0, false);
        declareFunction("unknown_assertionP", "UNKNOWN-ASSERTION?", 1, 0, false);
        declareFunction("true_gaf_assertionP", "TRUE-GAF-ASSERTION?", 1, 0, false);
        declareFunction("false_gaf_assertionP", "FALSE-GAF-ASSERTION?", 1, 0, false);
        declareFunction("nl_semantic_assertionP", "NL-SEMANTIC-ASSERTION?", 1, 0, false);
        declareFunction("assertion_matches_typeP", "ASSERTION-MATCHES-TYPE?", 2, 0, false);
        declareFunction("assertion_matches_truthP", "ASSERTION-MATCHES-TRUTH?", 2, 0, false);
        declareFunction("assertion_matches_directionP", "ASSERTION-MATCHES-DIRECTION?", 2, 0, false);
        declareFunction("assertion_matches_truth_and_directionP", "ASSERTION-MATCHES-TRUTH-AND-DIRECTION?", 3, 0, false);
        declareFunction("assertion_matches_type_truth_and_directionP", "ASSERTION-MATCHES-TYPE-TRUTH-AND-DIRECTION?", 4, 0, false);
        declareFunction("gaf_has_term_in_argnumP", "GAF-HAS-TERM-IN-ARGNUM?", 3, 0, false);
        declareFunction("gaf_has_term_in_some_argnumP", "GAF-HAS-TERM-IN-SOME-ARGNUM?", 2, 0, false);
        declareFunction("gaf_assertion_with_pred_p", "GAF-ASSERTION-WITH-PRED-P", 2, 0, false);
        declareFunction("gaf_assertion_has_pred_p", "GAF-ASSERTION-HAS-PRED-P", 2, 0, false);
        declareFunction("gaf_assertion_with_any_of_preds_p", "GAF-ASSERTION-WITH-ANY-OF-PREDS-P", 2, 0, false);
        declareFunction("isa_gaf_p", "ISA-GAF-P", 1, 0, false);
        declareFunction("genls_gaf_p", "GENLS-GAF-P", 1, 0, false);
        declareFunction("assertion_cnf_with_el_vars_only", "ASSERTION-CNF-WITH-EL-VARS-ONLY", 1, 0, false);
        declareFunction("except_when_rule_p", "EXCEPT-WHEN-RULE-P", 1, 0, false);
        declareFunction("except_for_gaf_p", "EXCEPT-FOR-GAF-P", 1, 0, false);
        declareFunction("abnormal_assertion_p", "ABNORMAL-ASSERTION-P", 1, 0, false);
        declareFunction("abnormal_literal_from_assertion", "ABNORMAL-LITERAL-FROM-ASSERTION", 1, 0, false);
        declareFunction("excepted_assertionP", "EXCEPTED-ASSERTION?", 1, 0, false);
        declareFunction("excepted_assertionP_int", "EXCEPTED-ASSERTION?-INT", 1, 1, false);
        declareFunction("excepted_assertion_in_mtP", "EXCEPTED-ASSERTION-IN-MT?", 2, 0, false);
        declareFunction("assertion_matches_mtP", "ASSERTION-MATCHES-MT?", 1, 0, false);
        declareFunction("assertion_has_argumentsP", "ASSERTION-HAS-ARGUMENTS?", 1, 0, false);
        declareFunction("assertion_has_deduction_with_supportP", "ASSERTION-HAS-DEDUCTION-WITH-SUPPORT?", 2, 0, false);
        declareFunction("assertion_has_dependent_with_supportP", "ASSERTION-HAS-DEPENDENT-WITH-SUPPORT?", 2, 0, false);
        declareFunction("assertion_mentions_asserted_more_specificallyP", "ASSERTION-MENTIONS-ASSERTED-MORE-SPECIFICALLY?", 1, 0, false);
        declareFunction("assertion_mentions_any_of_termsP", "ASSERTION-MENTIONS-ANY-OF-TERMS?", 2, 0, false);
        declareFunction("assertion_mentions_any_of_terms_in_set_lambda", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-SET-LAMBDA", 1, 0, false);
        declareFunction("assertion_mentions_any_of_terms_in_setP", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-SET?", 2, 0, false);
        declareFunction("assertion_mentions_any_of_terms_in_dict_lambda", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-DICT-LAMBDA", 1, 0, false);
        declareFunction("assertion_mentions_any_of_terms_in_dictionary_keysP", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-DICTIONARY-KEYS?", 2, 0, false);
        declareFunction("random_gaf_with_pred", "RANDOM-GAF-WITH-PRED", 1, 0, false);
        declareFunction("random_gaf_with_predicate", "RANDOM-GAF-WITH-PREDICATE", 1, 0, false);
        declareFunction("random_gaf_with_predicate_and_arg", "RANDOM-GAF-WITH-PREDICATE-AND-ARG", 3, 0, false);
        declareFunction("random_rule_mentioning", "RANDOM-RULE-MENTIONING", 1, 0, false);
        declareFunction("rules_mentioning", "RULES-MENTIONING", 1, 0, false);
        declareFunction("rule_count_mentioning", "RULE-COUNT-MENTIONING", 1, 0, false);
        declareFunction("assertion_earlierP", "ASSERTION-EARLIER?", 2, 0, false);
        declareFunction("assertion_laterP", "ASSERTION-LATER?", 2, 0, false);
        declareFunction("earliest_assertion", "EARLIEST-ASSERTION", 1, 0, false);
        declareFunction("rename_assertion_variables", "RENAME-ASSERTION-VARIABLES", 2, 0, false);
        declareFunction("possibly_rename_assertion_variables", "POSSIBLY-RENAME-ASSERTION-VARIABLES", 2, 0, false);
        declareFunction("assertion_antecedent_query_formula", "ASSERTION-ANTECEDENT-QUERY-FORMULA", 1, 0, false);
        declareFunction("assertion_known_extent_query_formula", "ASSERTION-KNOWN-EXTENT-QUERY-FORMULA", 1, 0, false);
        declareFunction("assertion_unknown_extent_query_formula", "ASSERTION-UNKNOWN-EXTENT-QUERY-FORMULA", 1, 0, false);
        declareFunction("assertion_known_extent_query_formula_int", "ASSERTION-KNOWN-EXTENT-QUERY-FORMULA-INT", 2, 0, false);
        declareFunction("assertion_info", "ASSERTION-INFO", 1, 0, false);
        declareFunction("assertion_literal_count", "ASSERTION-LITERAL-COUNT", 1, 0, false);
        declareFunction("rule_literal_count", "RULE-LITERAL-COUNT", 1, 0, false);
        declareFunction("assertion_universal_time", "ASSERTION-UNIVERSAL-TIME", 1, 0, false);
        declareFunction("all_assertions_sorted_by_creation_time_estimate", "ALL-ASSERTIONS-SORTED-BY-CREATION-TIME-ESTIMATE", 0, 0, false);
        declareFunction("assertion_newest_constant", "ASSERTION-NEWEST-CONSTANT", 1, 0, false);
        declareFunction("initialize_newest_constant_table", "INITIALIZE-NEWEST-CONSTANT-TABLE", 0, 0, false);
        declareFunction("assertion_has_meta_assertionsP", "ASSERTION-HAS-META-ASSERTIONS?", 1, 0, false);
        declareFunction("all_meta_assertions", "ALL-META-ASSERTIONS", 1, 0, false);
        declareFunction("meta_assertion_list_for_editing", "META-ASSERTION-LIST-FOR-EDITING", 1, 0, false);
        declareFunction("meta_assertion_p", "META-ASSERTION-P", 1, 0, false);
        declareFunction("meta_assertion_el_formula", "META-ASSERTION-EL-FORMULA", 3, 0, false);
        declareFunction("mt_of_assertions_p", "MT-OF-ASSERTIONS-P", 2, 0, false);
        declareFunction("assertions_of_mt", "ASSERTIONS-OF-MT", 2, 0, false);
        declareFunction("mts_of_assertions", "MTS-OF-ASSERTIONS", 1, 0, false);
        declareFunction("sibling_mt_assertions", "SIBLING-MT-ASSERTIONS", 1, 0, false);
        declareFunction("assertions_min_mt", "ASSERTIONS-MIN-MT", 1, 0, false);
        declareFunction("sort_gafs_by_term", "SORT-GAFS-BY-TERM", 1, 2, false);
        declareFunction("rule_type_constraints", "RULE-TYPE-CONSTRAINTS", 1, 0, false);
        declareFunction("self_looping_ruleP", "SELF-LOOPING-RULE?", 1, 0, false);
        declareFunction("clear_cached_self_looping_rule_assertionP", "CLEAR-CACHED-SELF-LOOPING-RULE-ASSERTION?", 0, 0, false);
        declareFunction("remove_cached_self_looping_rule_assertionP", "REMOVE-CACHED-SELF-LOOPING-RULE-ASSERTION?", 1, 0, false);
        declareFunction("cached_self_looping_rule_assertionP_internal", "CACHED-SELF-LOOPING-RULE-ASSERTION?-INTERNAL", 1, 0, false);
        declareFunction("cached_self_looping_rule_assertionP", "CACHED-SELF-LOOPING-RULE-ASSERTION?", 1, 0, false);
        declareFunction("self_expanding_ruleP", "SELF-EXPANDING-RULE?", 1, 0, false);
        declareFunction("clear_cached_self_expanding_rule_assertionP", "CLEAR-CACHED-SELF-EXPANDING-RULE-ASSERTION?", 0, 0, false);
        declareFunction("remove_cached_self_expanding_rule_assertionP", "REMOVE-CACHED-SELF-EXPANDING-RULE-ASSERTION?", 1, 0, false);
        declareFunction("cached_self_expanding_rule_assertionP_internal", "CACHED-SELF-EXPANDING-RULE-ASSERTION?-INTERNAL", 1, 0, false);
        declareFunction("cached_self_expanding_rule_assertionP", "CACHED-SELF-EXPANDING-RULE-ASSERTION?", 1, 0, false);
        declareFunction("all_forward_rules_relevant_to_term", "ALL-FORWARD-RULES-RELEVANT-TO-TERM", 1, 0, false);
        declareFunction("all_forward_rules_relevant_to_terms", "ALL-FORWARD-RULES-RELEVANT-TO-TERMS", 1, 0, false);
        declareFunction("deduction_forward_rule_supports", "DEDUCTION-FORWARD-RULE-SUPPORTS", 1, 0, false);
        declareFunction("all_forward_rules_relevant_to_term_int", "ALL-FORWARD-RULES-RELEVANT-TO-TERM-INT", 1, 0, false);
        declareFunction("compute_all_forward_rules_relevant_to_term", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-TERM", 2, 0, false);
        declareFunction("compute_all_forward_rules_relevant_to_assertion", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-ASSERTION", 2, 0, false);
        declareFunction("compute_all_forward_rules_relevant_to_assertion_int", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-ASSERTION-INT", 2, 0, false);
        declareFunction("gather_all_exception_rules", "GATHER-ALL-EXCEPTION-RULES", 0, 1, false);
        declareFunction("gather_all_pragma_rules", "GATHER-ALL-PRAGMA-RULES", 0, 1, false);
        declareFunction("gather_all_lifting_rules", "GATHER-ALL-LIFTING-RULES", 0, 0, false);
        declareFunction("lifting_ruleP", "LIFTING-RULE?", 1, 0, false);
        declareFunction("rule_has_unlabelled_dont_care_variableP", "RULE-HAS-UNLABELLED-DONT-CARE-VARIABLE?", 1, 0, false);
        declareFunction("rule_unlabelled_dont_care_variables", "RULE-UNLABELLED-DONT-CARE-VARIABLES", 1, 0, false);
        declareFunction("assertion_findable_by_idP", "ASSERTION-FINDABLE-BY-ID?", 1, 0, false);
        declareFunction("embedded_assertions_findable_by_idP", "EMBEDDED-ASSERTIONS-FINDABLE-BY-ID?", 1, 1, false);
        declareFunction("assertions_containing_assertions_not_findable_by_id", "ASSERTIONS-CONTAINING-ASSERTIONS-NOT-FINDABLE-BY-ID", 0, 0, false);
        declareFunction("assertions_with_no_arguments", "ASSERTIONS-WITH-NO-ARGUMENTS", 0, 1, false);
        declareFunction("syntactically_ill_formed_assertion_count", "SYNTACTICALLY-ILL-FORMED-ASSERTION-COUNT", 0, 0, false);
        declareFunction("syntactically_ill_formed_assertions", "SYNTACTICALLY-ILL-FORMED-ASSERTIONS", 0, 0, false);
        declareFunction("syntactically_ill_formed_assertionP", "SYNTACTICALLY-ILL-FORMED-ASSERTION?", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_assertion_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("do_rules", "DO-RULES");
            declareMacro("do_gafs", "DO-GAFS");
            declareMacro("do_assertions_backwards", "DO-ASSERTIONS-BACKWARDS");
            declareMacro("do_assertion_dependent_assertions", "DO-ASSERTION-DEPENDENT-ASSERTIONS");
            declareMacro("do_assertion_supporting_assertions", "DO-ASSERTION-SUPPORTING-ASSERTIONS");
            declareFunction("assertion_list_p", "ASSERTION-LIST-P", 1, 0, false);
            declareFunction("list_of_rule_assertion_p", "LIST-OF-RULE-ASSERTION-P", 1, 0, false);
            declareFunction("assertion_dependent_assertions", "ASSERTION-DEPENDENT-ASSERTIONS", 1, 0, false);
            declareFunction("remove_relevant_assertion_dependents", "REMOVE-RELEVANT-ASSERTION-DEPENDENTS", 2, 0, false);
            declareFunction("remove_relevant_assertions_dependents", "REMOVE-RELEVANT-ASSERTIONS-DEPENDENTS", 2, 0, false);
            declareFunction("deduction_dependent_deductions", "DEDUCTION-DEPENDENT-DEDUCTIONS", 1, 0, false);
            declareFunction("assertion_dependent_supported_object_counts", "ASSERTION-DEPENDENT-SUPPORTED-OBJECT-COUNTS", 1, 0, false);
            declareFunction("true_assertionP", "TRUE-ASSERTION?", 1, 0, false);
            declareFunction("false_assertionP", "FALSE-ASSERTION?", 1, 0, false);
            declareFunction("unknown_assertionP", "UNKNOWN-ASSERTION?", 1, 0, false);
            declareFunction("true_gaf_assertionP", "TRUE-GAF-ASSERTION?", 1, 0, false);
            declareFunction("false_gaf_assertionP", "FALSE-GAF-ASSERTION?", 1, 0, false);
            declareFunction("nl_semantic_assertionP", "NL-SEMANTIC-ASSERTION?", 1, 0, false);
            declareFunction("obsolete_ruleP", "OBSOLETE-RULE?", 1, 0, false);
            declareFunction("assertion_matches_typeP", "ASSERTION-MATCHES-TYPE?", 2, 0, false);
            declareFunction("assertion_matches_truthP", "ASSERTION-MATCHES-TRUTH?", 2, 0, false);
            declareFunction("assertion_matches_directionP", "ASSERTION-MATCHES-DIRECTION?", 2, 0, false);
            declareFunction("assertion_matches_truth_and_directionP", "ASSERTION-MATCHES-TRUTH-AND-DIRECTION?", 3, 0, false);
            declareFunction("assertion_matches_type_truth_and_directionP", "ASSERTION-MATCHES-TYPE-TRUTH-AND-DIRECTION?", 4, 0, false);
            declareFunction("gaf_has_term_in_argnumP", "GAF-HAS-TERM-IN-ARGNUM?", 3, 0, false);
            declareFunction("gaf_has_term_in_some_argnumP", "GAF-HAS-TERM-IN-SOME-ARGNUM?", 2, 0, false);
            declareFunction("true_gaf_assertion_with_pred_p", "TRUE-GAF-ASSERTION-WITH-PRED-P", 2, 0, false);
            declareFunction("gaf_assertion_with_pred_p", "GAF-ASSERTION-WITH-PRED-P", 2, 0, false);
            declareFunction("gaf_assertion_has_pred_p", "GAF-ASSERTION-HAS-PRED-P", 2, 0, false);
            declareFunction("gaf_assertion_with_any_of_preds_p", "GAF-ASSERTION-WITH-ANY-OF-PREDS-P", 2, 0, false);
            declareFunction("isa_gaf_p", "ISA-GAF-P", 1, 0, false);
            declareFunction("genls_gaf_p", "GENLS-GAF-P", 1, 0, false);
            declareFunction("assertion_cnf_with_el_vars_only", "ASSERTION-CNF-WITH-EL-VARS-ONLY", 1, 0, false);
            declareFunction("except_when_rule_p", "EXCEPT-WHEN-RULE-P", 1, 0, false);
            declareFunction("except_for_gaf_p", "EXCEPT-FOR-GAF-P", 1, 0, false);
            declareFunction("abnormal_assertion_p", "ABNORMAL-ASSERTION-P", 1, 0, false);
            declareFunction("abnormal_literal_from_assertion", "ABNORMAL-LITERAL-FROM-ASSERTION", 1, 0, false);
            declareFunction("somewhere_excepted_assertionP", "SOMEWHERE-EXCEPTED-ASSERTION?", 1, 1, false);
            declareFunction("excepted_assertionP", "EXCEPTED-ASSERTION?", 1, 2, false);
            declareFunction("excepted_assertion_in_any_mtP", "EXCEPTED-ASSERTION-IN-ANY-MT?", 1, 2, false);
            declareFunction("excepted_assertionP_int", "EXCEPTED-ASSERTION?-INT", 1, 3, false);
            declareFunction("excepted_assertion_in_mtP", "EXCEPTED-ASSERTION-IN-MT?", 2, 2, false);
            declareFunction("excepted_assertion_in_mtP_shallow", "EXCEPTED-ASSERTION-IN-MT?-SHALLOW", 2, 1, false);
            declareFunction("doomed_assertionP", "DOOMED-ASSERTION?", 1, 2, false);
            declareFunction("doomed_assertionP_int", "DOOMED-ASSERTION?-INT", 1, 3, false);
            declareFunction("assertion_matches_mtP", "ASSERTION-MATCHES-MT?", 1, 0, false);
            declareFunction("assertion_has_argumentsP", "ASSERTION-HAS-ARGUMENTS?", 1, 0, false);
            declareFunction("assertion_argument_count", "ASSERTION-ARGUMENT-COUNT", 1, 0, false);
            declareFunction("assertion_has_deduction_with_supportP", "ASSERTION-HAS-DEDUCTION-WITH-SUPPORT?", 2, 0, false);
            declareFunction("assertion_has_dependent_with_supportP", "ASSERTION-HAS-DEPENDENT-WITH-SUPPORT?", 2, 0, false);
            declareFunction("assertion_has_dependent_with_supportP_kb_hl_support_aware_version", "ASSERTION-HAS-DEPENDENT-WITH-SUPPORT?-KB-HL-SUPPORT-AWARE-VERSION", 2, 0, false);
            declareFunction("assertion_mentions_asserted_more_specificallyP", "ASSERTION-MENTIONS-ASSERTED-MORE-SPECIFICALLY?", 1, 0, false);
            declareFunction("assertion_mentions_any_of_termsP", "ASSERTION-MENTIONS-ANY-OF-TERMS?", 2, 0, false);
            declareFunction("assertion_mentions_any_of_terms_in_set_lambda", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-SET-LAMBDA", 1, 0, false);
            declareFunction("assertion_mentions_any_of_terms_in_setP", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-SET?", 2, 0, false);
            declareFunction("assertion_mentions_any_of_terms_in_dict_lambda", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-DICT-LAMBDA", 1, 0, false);
            declareFunction("assertion_mentions_any_of_terms_in_dictionary_keysP", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-DICTIONARY-KEYS?", 2, 0, false);
            declareFunction("random_gaf_with_pred", "RANDOM-GAF-WITH-PRED", 1, 0, false);
            declareFunction("random_gaf_with_predicate", "RANDOM-GAF-WITH-PREDICATE", 1, 0, false);
            declareFunction("random_gaf_with_predicate_and_arg", "RANDOM-GAF-WITH-PREDICATE-AND-ARG", 3, 0, false);
            declareFunction("random_rule_mentioning", "RANDOM-RULE-MENTIONING", 1, 0, false);
            declareFunction("rules_mentioning", "RULES-MENTIONING", 1, 0, false);
            declareFunction("rule_count_mentioning", "RULE-COUNT-MENTIONING", 1, 0, false);
            declareFunction("random_assertions", "RANDOM-ASSERTIONS", 1, 0, false);
            declareFunction("assertion_earlierP", "ASSERTION-EARLIER?", 2, 0, false);
            declareFunction("assertion_laterP", "ASSERTION-LATER?", 2, 0, false);
            declareFunction("earliest_assertion", "EARLIEST-ASSERTION", 1, 0, false);
            declareFunction("rename_assertion_variables", "RENAME-ASSERTION-VARIABLES", 2, 0, false);
            declareFunction("possibly_rename_assertion_variables", "POSSIBLY-RENAME-ASSERTION-VARIABLES", 2, 0, false);
            declareFunction("assertion_antecedent_query_formula", "ASSERTION-ANTECEDENT-QUERY-FORMULA", 1, 0, false);
            declareFunction("assertion_known_extent_query_formula", "ASSERTION-KNOWN-EXTENT-QUERY-FORMULA", 1, 0, false);
            declareFunction("assertion_unknown_extent_query_formula", "ASSERTION-UNKNOWN-EXTENT-QUERY-FORMULA", 1, 0, false);
            declareFunction("assertion_known_extent_query_formula_int", "ASSERTION-KNOWN-EXTENT-QUERY-FORMULA-INT", 2, 0, false);
            declareFunction("assertion_info", "ASSERTION-INFO", 1, 0, false);
            declareFunction("assertion_literal_count", "ASSERTION-LITERAL-COUNT", 1, 0, false);
            declareFunction("rule_literal_count", "RULE-LITERAL-COUNT", 1, 0, false);
            declareFunction("assertion_supporting_assertions", "ASSERTION-SUPPORTING-ASSERTIONS", 1, 0, false);
            declareFunction("assertion_supporting_forward_assertions", "ASSERTION-SUPPORTING-FORWARD-ASSERTIONS", 1, 0, false);
            declareFunction("assertion_cheapest_forward_supporting_assertion", "ASSERTION-CHEAPEST-FORWARD-SUPPORTING-ASSERTION", 1, 0, false);
            declareFunction("assertion_universal_time", "ASSERTION-UNIVERSAL-TIME", 1, 0, false);
            declareFunction("all_assertions_sorted_by_creation_time_estimate", "ALL-ASSERTIONS-SORTED-BY-CREATION-TIME-ESTIMATE", 0, 0, false);
            declareFunction("assertion_newest_constant", "ASSERTION-NEWEST-CONSTANT", 1, 0, false);
            declareFunction("initialize_newest_constant_table", "INITIALIZE-NEWEST-CONSTANT-TABLE", 0, 0, false);
            declareFunction("assertion_has_meta_assertionsP", "ASSERTION-HAS-META-ASSERTIONS?", 1, 0, false);
            declareFunction("all_meta_assertions", "ALL-META-ASSERTIONS", 1, 0, false);
            declareFunction("meta_assertion_list_for_editing", "META-ASSERTION-LIST-FOR-EDITING", 1, 0, false);
            declareFunction("meta_assertion_p", "META-ASSERTION-P", 1, 0, false);
            declareFunction("rule_meta_assertion_p", "RULE-META-ASSERTION-P", 1, 0, false);
            declareFunction("pragmatic_requirement_rule_p", "PRAGMATIC-REQUIREMENT-RULE-P", 1, 0, false);
            declareFunction("meta_assertion_el_formula", "META-ASSERTION-EL-FORMULA", 3, 0, false);
            declareFunction("mt_of_assertions_p", "MT-OF-ASSERTIONS-P", 2, 0, false);
            declareFunction("assertions_of_mt", "ASSERTIONS-OF-MT", 2, 0, false);
            declareFunction("mts_of_assertions", "MTS-OF-ASSERTIONS", 1, 0, false);
            declareFunction("assertions_min_mt", "ASSERTIONS-MIN-MT", 1, 0, false);
            declareFunction("sort_assertions", "SORT-ASSERTIONS", 1, 0, false);
            declareFunction("sort_gafs_by_term", "SORT-GAFS-BY-TERM", 1, 2, false);
            declareFunction("rule_type_constraints", "RULE-TYPE-CONSTRAINTS", 1, 0, false);
            declareFunction("self_looping_ruleP", "SELF-LOOPING-RULE?", 1, 0, false);
            declareFunction("clear_cached_self_looping_rule_assertionP", "CLEAR-CACHED-SELF-LOOPING-RULE-ASSERTION?", 0, 0, false);
            declareFunction("remove_cached_self_looping_rule_assertionP", "REMOVE-CACHED-SELF-LOOPING-RULE-ASSERTION?", 1, 0, false);
            declareFunction("cached_self_looping_rule_assertionP_internal", "CACHED-SELF-LOOPING-RULE-ASSERTION?-INTERNAL", 1, 0, false);
            declareFunction("cached_self_looping_rule_assertionP", "CACHED-SELF-LOOPING-RULE-ASSERTION?", 1, 0, false);
            declareFunction("self_expanding_ruleP", "SELF-EXPANDING-RULE?", 1, 0, false);
            declareFunction("clear_cached_self_expanding_rule_assertionP", "CLEAR-CACHED-SELF-EXPANDING-RULE-ASSERTION?", 0, 0, false);
            declareFunction("remove_cached_self_expanding_rule_assertionP", "REMOVE-CACHED-SELF-EXPANDING-RULE-ASSERTION?", 1, 0, false);
            declareFunction("cached_self_expanding_rule_assertionP_internal", "CACHED-SELF-EXPANDING-RULE-ASSERTION?-INTERNAL", 1, 0, false);
            declareFunction("cached_self_expanding_rule_assertionP", "CACHED-SELF-EXPANDING-RULE-ASSERTION?", 1, 0, false);
            declareFunction("safe_all_forward_rules_relevant_to_term", "SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERM", 1, 0, false);
            declareFunction("all_forward_rules_relevant_to_term", "ALL-FORWARD-RULES-RELEVANT-TO-TERM", 1, 0, false);
            declareFunction("safe_all_forward_rules_relevant_to_terms", "SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERMS", 1, 0, false);
            declareFunction("all_forward_rules_relevant_to_terms", "ALL-FORWARD-RULES-RELEVANT-TO-TERMS", 1, 0, false);
            declareFunction("possibly_safe_all_forward_rules_relevant_to_term", "POSSIBLY-SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERM", 2, 0, false);
            declareFunction("possibly_safe_all_forward_rules_relevant_to_terms", "POSSIBLY-SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERMS", 2, 0, false);
            declareFunction("deduction_forward_rule_supports", "DEDUCTION-FORWARD-RULE-SUPPORTS", 1, 0, false);
            declareFunction("all_forward_rules_relevant_to_term_int", "ALL-FORWARD-RULES-RELEVANT-TO-TERM-INT", 1, 0, false);
            declareFunction("compute_all_forward_rules_relevant_to_term", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-TERM", 2, 0, false);
            declareFunction("compute_all_forward_rules_relevant_to_assertion", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-ASSERTION", 2, 0, false);
            declareFunction("compute_all_forward_rules_relevant_to_assertion_int", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-ASSERTION-INT", 2, 0, false);
            declareFunction("deduction_asserted_assertion_supports", "DEDUCTION-ASSERTED-ASSERTION-SUPPORTS", 1, 1, false);
            declareFunction("deduction_asserted_assertion_supports_int", "DEDUCTION-ASSERTED-ASSERTION-SUPPORTS-INT", 2, 0, false);
            declareFunction("assertion_asserted_assertion_supports", "ASSERTION-ASSERTED-ASSERTION-SUPPORTS", 1, 1, false);
            declareFunction("gather_all_exception_rules", "GATHER-ALL-EXCEPTION-RULES", 0, 1, false);
            declareFunction("gather_all_pragma_rules", "GATHER-ALL-PRAGMA-RULES", 0, 1, false);
            declareFunction("gather_all_lifting_rules", "GATHER-ALL-LIFTING-RULES", 0, 0, false);
            declareFunction("lifting_ruleP", "LIFTING-RULE?", 1, 0, false);
            declareFunction("lifting_consequent_ruleP", "LIFTING-CONSEQUENT-RULE?", 1, 0, false);
            declareFunction("universal_lifting_ruleP", "UNIVERSAL-LIFTING-RULE?", 1, 0, false);
            declareFunction("rule_has_unlabelled_dont_care_variableP", "RULE-HAS-UNLABELLED-DONT-CARE-VARIABLE?", 1, 0, false);
            declareFunction("rule_unlabelled_dont_care_variables", "RULE-UNLABELLED-DONT-CARE-VARIABLES", 1, 0, false);
            declareFunction("assertion_findable_by_idP", "ASSERTION-FINDABLE-BY-ID?", 1, 0, false);
            declareFunction("embedded_assertions", "EMBEDDED-ASSERTIONS", 1, 2, false);
            declareFunction("embedded_assertions_findable_by_idP", "EMBEDDED-ASSERTIONS-FINDABLE-BY-ID?", 1, 1, false);
            declareFunction("assertions_containing_assertions_not_findable_by_id", "ASSERTIONS-CONTAINING-ASSERTIONS-NOT-FINDABLE-BY-ID", 0, 0, false);
            declareFunction("assertions_with_no_arguments", "ASSERTIONS-WITH-NO-ARGUMENTS", 0, 1, false);
            declareFunction("syntactically_ill_formed_assertion_count", "SYNTACTICALLY-ILL-FORMED-ASSERTION-COUNT", 0, 0, false);
            declareFunction("syntactically_ill_formed_assertions", "SYNTACTICALLY-ILL-FORMED-ASSERTIONS", 0, 0, false);
            declareFunction("syntactically_ill_formed_assertionP", "SYNTACTICALLY-ILL-FORMED-ASSERTION?", 1, 0, false);
            declareFunction("assertion_rarest_term", "ASSERTION-RAREST-TERM", 1, 0, false);
            declareFunction("assertion_term_rarity", "ASSERTION-TERM-RARITY", 1, 0, false);
            declareFunction("sort_assertions_via_term_rarity", "SORT-ASSERTIONS-VIA-TERM-RARITY", 1, 0, false);
            declareFunction("update_rarest_term", "UPDATE-RAREST-TERM", 1, 0, false);
            declareFunction("memoized_assertion_term_rarity_internal", "MEMOIZED-ASSERTION-TERM-RARITY-INTERNAL", 1, 0, false);
            declareFunction("memoized_assertion_term_rarity", "MEMOIZED-ASSERTION-TERM-RARITY", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("excepted_assertionP", "EXCEPTED-ASSERTION?", 1, 0, false);
            declareFunction("excepted_assertionP_int", "EXCEPTED-ASSERTION?-INT", 1, 1, false);
            declareFunction("excepted_assertion_in_mtP", "EXCEPTED-ASSERTION-IN-MT?", 2, 0, false);
            declareFunction("sibling_mt_assertions", "SIBLING-MT-ASSERTIONS", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_assertion_utilities_file_Previous() {
        declareMacro("do_rules", "DO-RULES");
        declareMacro("do_gafs", "DO-GAFS");
        declareMacro("do_assertions_backwards", "DO-ASSERTIONS-BACKWARDS");
        declareMacro("do_assertion_dependent_assertions", "DO-ASSERTION-DEPENDENT-ASSERTIONS");
        declareMacro("do_assertion_supporting_assertions", "DO-ASSERTION-SUPPORTING-ASSERTIONS");
        declareFunction("assertion_list_p", "ASSERTION-LIST-P", 1, 0, false);
        declareFunction("list_of_rule_assertion_p", "LIST-OF-RULE-ASSERTION-P", 1, 0, false);
        declareFunction("assertion_dependent_assertions", "ASSERTION-DEPENDENT-ASSERTIONS", 1, 0, false);
        declareFunction("remove_relevant_assertion_dependents", "REMOVE-RELEVANT-ASSERTION-DEPENDENTS", 2, 0, false);
        declareFunction("remove_relevant_assertions_dependents", "REMOVE-RELEVANT-ASSERTIONS-DEPENDENTS", 2, 0, false);
        declareFunction("deduction_dependent_deductions", "DEDUCTION-DEPENDENT-DEDUCTIONS", 1, 0, false);
        declareFunction("assertion_dependent_supported_object_counts", "ASSERTION-DEPENDENT-SUPPORTED-OBJECT-COUNTS", 1, 0, false);
        declareFunction("true_assertionP", "TRUE-ASSERTION?", 1, 0, false);
        declareFunction("false_assertionP", "FALSE-ASSERTION?", 1, 0, false);
        declareFunction("unknown_assertionP", "UNKNOWN-ASSERTION?", 1, 0, false);
        declareFunction("true_gaf_assertionP", "TRUE-GAF-ASSERTION?", 1, 0, false);
        declareFunction("false_gaf_assertionP", "FALSE-GAF-ASSERTION?", 1, 0, false);
        declareFunction("nl_semantic_assertionP", "NL-SEMANTIC-ASSERTION?", 1, 0, false);
        declareFunction("obsolete_ruleP", "OBSOLETE-RULE?", 1, 0, false);
        declareFunction("assertion_matches_typeP", "ASSERTION-MATCHES-TYPE?", 2, 0, false);
        declareFunction("assertion_matches_truthP", "ASSERTION-MATCHES-TRUTH?", 2, 0, false);
        declareFunction("assertion_matches_directionP", "ASSERTION-MATCHES-DIRECTION?", 2, 0, false);
        declareFunction("assertion_matches_truth_and_directionP", "ASSERTION-MATCHES-TRUTH-AND-DIRECTION?", 3, 0, false);
        declareFunction("assertion_matches_type_truth_and_directionP", "ASSERTION-MATCHES-TYPE-TRUTH-AND-DIRECTION?", 4, 0, false);
        declareFunction("gaf_has_term_in_argnumP", "GAF-HAS-TERM-IN-ARGNUM?", 3, 0, false);
        declareFunction("gaf_has_term_in_some_argnumP", "GAF-HAS-TERM-IN-SOME-ARGNUM?", 2, 0, false);
        declareFunction("true_gaf_assertion_with_pred_p", "TRUE-GAF-ASSERTION-WITH-PRED-P", 2, 0, false);
        declareFunction("gaf_assertion_with_pred_p", "GAF-ASSERTION-WITH-PRED-P", 2, 0, false);
        declareFunction("gaf_assertion_has_pred_p", "GAF-ASSERTION-HAS-PRED-P", 2, 0, false);
        declareFunction("gaf_assertion_with_any_of_preds_p", "GAF-ASSERTION-WITH-ANY-OF-PREDS-P", 2, 0, false);
        declareFunction("isa_gaf_p", "ISA-GAF-P", 1, 0, false);
        declareFunction("genls_gaf_p", "GENLS-GAF-P", 1, 0, false);
        declareFunction("assertion_cnf_with_el_vars_only", "ASSERTION-CNF-WITH-EL-VARS-ONLY", 1, 0, false);
        declareFunction("except_when_rule_p", "EXCEPT-WHEN-RULE-P", 1, 0, false);
        declareFunction("except_for_gaf_p", "EXCEPT-FOR-GAF-P", 1, 0, false);
        declareFunction("abnormal_assertion_p", "ABNORMAL-ASSERTION-P", 1, 0, false);
        declareFunction("abnormal_literal_from_assertion", "ABNORMAL-LITERAL-FROM-ASSERTION", 1, 0, false);
        declareFunction("somewhere_excepted_assertionP", "SOMEWHERE-EXCEPTED-ASSERTION?", 1, 1, false);
        declareFunction("excepted_assertionP", "EXCEPTED-ASSERTION?", 1, 2, false);
        declareFunction("excepted_assertion_in_any_mtP", "EXCEPTED-ASSERTION-IN-ANY-MT?", 1, 2, false);
        declareFunction("excepted_assertionP_int", "EXCEPTED-ASSERTION?-INT", 1, 3, false);
        declareFunction("excepted_assertion_in_mtP", "EXCEPTED-ASSERTION-IN-MT?", 2, 2, false);
        declareFunction("excepted_assertion_in_mtP_shallow", "EXCEPTED-ASSERTION-IN-MT?-SHALLOW", 2, 1, false);
        declareFunction("doomed_assertionP", "DOOMED-ASSERTION?", 1, 2, false);
        declareFunction("doomed_assertionP_int", "DOOMED-ASSERTION?-INT", 1, 3, false);
        declareFunction("assertion_matches_mtP", "ASSERTION-MATCHES-MT?", 1, 0, false);
        declareFunction("assertion_has_argumentsP", "ASSERTION-HAS-ARGUMENTS?", 1, 0, false);
        declareFunction("assertion_argument_count", "ASSERTION-ARGUMENT-COUNT", 1, 0, false);
        declareFunction("assertion_has_deduction_with_supportP", "ASSERTION-HAS-DEDUCTION-WITH-SUPPORT?", 2, 0, false);
        declareFunction("assertion_has_dependent_with_supportP", "ASSERTION-HAS-DEPENDENT-WITH-SUPPORT?", 2, 0, false);
        declareFunction("assertion_has_dependent_with_supportP_kb_hl_support_aware_version", "ASSERTION-HAS-DEPENDENT-WITH-SUPPORT?-KB-HL-SUPPORT-AWARE-VERSION", 2, 0, false);
        declareFunction("assertion_mentions_asserted_more_specificallyP", "ASSERTION-MENTIONS-ASSERTED-MORE-SPECIFICALLY?", 1, 0, false);
        declareFunction("assertion_mentions_any_of_termsP", "ASSERTION-MENTIONS-ANY-OF-TERMS?", 2, 0, false);
        declareFunction("assertion_mentions_any_of_terms_in_set_lambda", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-SET-LAMBDA", 1, 0, false);
        declareFunction("assertion_mentions_any_of_terms_in_setP", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-SET?", 2, 0, false);
        declareFunction("assertion_mentions_any_of_terms_in_dict_lambda", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-DICT-LAMBDA", 1, 0, false);
        declareFunction("assertion_mentions_any_of_terms_in_dictionary_keysP", "ASSERTION-MENTIONS-ANY-OF-TERMS-IN-DICTIONARY-KEYS?", 2, 0, false);
        declareFunction("random_gaf_with_pred", "RANDOM-GAF-WITH-PRED", 1, 0, false);
        declareFunction("random_gaf_with_predicate", "RANDOM-GAF-WITH-PREDICATE", 1, 0, false);
        declareFunction("random_gaf_with_predicate_and_arg", "RANDOM-GAF-WITH-PREDICATE-AND-ARG", 3, 0, false);
        declareFunction("random_rule_mentioning", "RANDOM-RULE-MENTIONING", 1, 0, false);
        declareFunction("rules_mentioning", "RULES-MENTIONING", 1, 0, false);
        declareFunction("rule_count_mentioning", "RULE-COUNT-MENTIONING", 1, 0, false);
        declareFunction("random_assertions", "RANDOM-ASSERTIONS", 1, 0, false);
        declareFunction("assertion_earlierP", "ASSERTION-EARLIER?", 2, 0, false);
        declareFunction("assertion_laterP", "ASSERTION-LATER?", 2, 0, false);
        declareFunction("earliest_assertion", "EARLIEST-ASSERTION", 1, 0, false);
        declareFunction("rename_assertion_variables", "RENAME-ASSERTION-VARIABLES", 2, 0, false);
        declareFunction("possibly_rename_assertion_variables", "POSSIBLY-RENAME-ASSERTION-VARIABLES", 2, 0, false);
        declareFunction("assertion_antecedent_query_formula", "ASSERTION-ANTECEDENT-QUERY-FORMULA", 1, 0, false);
        declareFunction("assertion_known_extent_query_formula", "ASSERTION-KNOWN-EXTENT-QUERY-FORMULA", 1, 0, false);
        declareFunction("assertion_unknown_extent_query_formula", "ASSERTION-UNKNOWN-EXTENT-QUERY-FORMULA", 1, 0, false);
        declareFunction("assertion_known_extent_query_formula_int", "ASSERTION-KNOWN-EXTENT-QUERY-FORMULA-INT", 2, 0, false);
        declareFunction("assertion_info", "ASSERTION-INFO", 1, 0, false);
        declareFunction("assertion_literal_count", "ASSERTION-LITERAL-COUNT", 1, 0, false);
        declareFunction("rule_literal_count", "RULE-LITERAL-COUNT", 1, 0, false);
        declareFunction("assertion_supporting_assertions", "ASSERTION-SUPPORTING-ASSERTIONS", 1, 0, false);
        declareFunction("assertion_supporting_forward_assertions", "ASSERTION-SUPPORTING-FORWARD-ASSERTIONS", 1, 0, false);
        declareFunction("assertion_cheapest_forward_supporting_assertion", "ASSERTION-CHEAPEST-FORWARD-SUPPORTING-ASSERTION", 1, 0, false);
        declareFunction("assertion_universal_time", "ASSERTION-UNIVERSAL-TIME", 1, 0, false);
        declareFunction("all_assertions_sorted_by_creation_time_estimate", "ALL-ASSERTIONS-SORTED-BY-CREATION-TIME-ESTIMATE", 0, 0, false);
        declareFunction("assertion_newest_constant", "ASSERTION-NEWEST-CONSTANT", 1, 0, false);
        declareFunction("initialize_newest_constant_table", "INITIALIZE-NEWEST-CONSTANT-TABLE", 0, 0, false);
        declareFunction("assertion_has_meta_assertionsP", "ASSERTION-HAS-META-ASSERTIONS?", 1, 0, false);
        declareFunction("all_meta_assertions", "ALL-META-ASSERTIONS", 1, 0, false);
        declareFunction("meta_assertion_list_for_editing", "META-ASSERTION-LIST-FOR-EDITING", 1, 0, false);
        declareFunction("meta_assertion_p", "META-ASSERTION-P", 1, 0, false);
        declareFunction("rule_meta_assertion_p", "RULE-META-ASSERTION-P", 1, 0, false);
        declareFunction("pragmatic_requirement_rule_p", "PRAGMATIC-REQUIREMENT-RULE-P", 1, 0, false);
        declareFunction("meta_assertion_el_formula", "META-ASSERTION-EL-FORMULA", 3, 0, false);
        declareFunction("mt_of_assertions_p", "MT-OF-ASSERTIONS-P", 2, 0, false);
        declareFunction("assertions_of_mt", "ASSERTIONS-OF-MT", 2, 0, false);
        declareFunction("mts_of_assertions", "MTS-OF-ASSERTIONS", 1, 0, false);
        declareFunction("assertions_min_mt", "ASSERTIONS-MIN-MT", 1, 0, false);
        declareFunction("sort_assertions", "SORT-ASSERTIONS", 1, 0, false);
        declareFunction("sort_gafs_by_term", "SORT-GAFS-BY-TERM", 1, 2, false);
        declareFunction("rule_type_constraints", "RULE-TYPE-CONSTRAINTS", 1, 0, false);
        declareFunction("self_looping_ruleP", "SELF-LOOPING-RULE?", 1, 0, false);
        declareFunction("clear_cached_self_looping_rule_assertionP", "CLEAR-CACHED-SELF-LOOPING-RULE-ASSERTION?", 0, 0, false);
        declareFunction("remove_cached_self_looping_rule_assertionP", "REMOVE-CACHED-SELF-LOOPING-RULE-ASSERTION?", 1, 0, false);
        declareFunction("cached_self_looping_rule_assertionP_internal", "CACHED-SELF-LOOPING-RULE-ASSERTION?-INTERNAL", 1, 0, false);
        declareFunction("cached_self_looping_rule_assertionP", "CACHED-SELF-LOOPING-RULE-ASSERTION?", 1, 0, false);
        declareFunction("self_expanding_ruleP", "SELF-EXPANDING-RULE?", 1, 0, false);
        declareFunction("clear_cached_self_expanding_rule_assertionP", "CLEAR-CACHED-SELF-EXPANDING-RULE-ASSERTION?", 0, 0, false);
        declareFunction("remove_cached_self_expanding_rule_assertionP", "REMOVE-CACHED-SELF-EXPANDING-RULE-ASSERTION?", 1, 0, false);
        declareFunction("cached_self_expanding_rule_assertionP_internal", "CACHED-SELF-EXPANDING-RULE-ASSERTION?-INTERNAL", 1, 0, false);
        declareFunction("cached_self_expanding_rule_assertionP", "CACHED-SELF-EXPANDING-RULE-ASSERTION?", 1, 0, false);
        declareFunction("safe_all_forward_rules_relevant_to_term", "SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERM", 1, 0, false);
        declareFunction("all_forward_rules_relevant_to_term", "ALL-FORWARD-RULES-RELEVANT-TO-TERM", 1, 0, false);
        declareFunction("safe_all_forward_rules_relevant_to_terms", "SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERMS", 1, 0, false);
        declareFunction("all_forward_rules_relevant_to_terms", "ALL-FORWARD-RULES-RELEVANT-TO-TERMS", 1, 0, false);
        declareFunction("possibly_safe_all_forward_rules_relevant_to_term", "POSSIBLY-SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERM", 2, 0, false);
        declareFunction("possibly_safe_all_forward_rules_relevant_to_terms", "POSSIBLY-SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERMS", 2, 0, false);
        declareFunction("deduction_forward_rule_supports", "DEDUCTION-FORWARD-RULE-SUPPORTS", 1, 0, false);
        declareFunction("all_forward_rules_relevant_to_term_int", "ALL-FORWARD-RULES-RELEVANT-TO-TERM-INT", 1, 0, false);
        declareFunction("compute_all_forward_rules_relevant_to_term", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-TERM", 2, 0, false);
        declareFunction("compute_all_forward_rules_relevant_to_assertion", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-ASSERTION", 2, 0, false);
        declareFunction("compute_all_forward_rules_relevant_to_assertion_int", "COMPUTE-ALL-FORWARD-RULES-RELEVANT-TO-ASSERTION-INT", 2, 0, false);
        declareFunction("deduction_asserted_assertion_supports", "DEDUCTION-ASSERTED-ASSERTION-SUPPORTS", 1, 1, false);
        declareFunction("deduction_asserted_assertion_supports_int", "DEDUCTION-ASSERTED-ASSERTION-SUPPORTS-INT", 2, 0, false);
        declareFunction("assertion_asserted_assertion_supports", "ASSERTION-ASSERTED-ASSERTION-SUPPORTS", 1, 1, false);
        declareFunction("gather_all_exception_rules", "GATHER-ALL-EXCEPTION-RULES", 0, 1, false);
        declareFunction("gather_all_pragma_rules", "GATHER-ALL-PRAGMA-RULES", 0, 1, false);
        declareFunction("gather_all_lifting_rules", "GATHER-ALL-LIFTING-RULES", 0, 0, false);
        declareFunction("lifting_ruleP", "LIFTING-RULE?", 1, 0, false);
        declareFunction("lifting_consequent_ruleP", "LIFTING-CONSEQUENT-RULE?", 1, 0, false);
        declareFunction("universal_lifting_ruleP", "UNIVERSAL-LIFTING-RULE?", 1, 0, false);
        declareFunction("rule_has_unlabelled_dont_care_variableP", "RULE-HAS-UNLABELLED-DONT-CARE-VARIABLE?", 1, 0, false);
        declareFunction("rule_unlabelled_dont_care_variables", "RULE-UNLABELLED-DONT-CARE-VARIABLES", 1, 0, false);
        declareFunction("assertion_findable_by_idP", "ASSERTION-FINDABLE-BY-ID?", 1, 0, false);
        declareFunction("embedded_assertions", "EMBEDDED-ASSERTIONS", 1, 2, false);
        declareFunction("embedded_assertions_findable_by_idP", "EMBEDDED-ASSERTIONS-FINDABLE-BY-ID?", 1, 1, false);
        declareFunction("assertions_containing_assertions_not_findable_by_id", "ASSERTIONS-CONTAINING-ASSERTIONS-NOT-FINDABLE-BY-ID", 0, 0, false);
        declareFunction("assertions_with_no_arguments", "ASSERTIONS-WITH-NO-ARGUMENTS", 0, 1, false);
        declareFunction("syntactically_ill_formed_assertion_count", "SYNTACTICALLY-ILL-FORMED-ASSERTION-COUNT", 0, 0, false);
        declareFunction("syntactically_ill_formed_assertions", "SYNTACTICALLY-ILL-FORMED-ASSERTIONS", 0, 0, false);
        declareFunction("syntactically_ill_formed_assertionP", "SYNTACTICALLY-ILL-FORMED-ASSERTION?", 1, 0, false);
        declareFunction("assertion_rarest_term", "ASSERTION-RAREST-TERM", 1, 0, false);
        declareFunction("assertion_term_rarity", "ASSERTION-TERM-RARITY", 1, 0, false);
        declareFunction("sort_assertions_via_term_rarity", "SORT-ASSERTIONS-VIA-TERM-RARITY", 1, 0, false);
        declareFunction("update_rarest_term", "UPDATE-RAREST-TERM", 1, 0, false);
        declareFunction("memoized_assertion_term_rarity_internal", "MEMOIZED-ASSERTION-TERM-RARITY-INTERNAL", 1, 0, false);
        declareFunction("memoized_assertion_term_rarity", "MEMOIZED-ASSERTION-TERM-RARITY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_assertion_utilities_file() {
        defparameter("*EXCEPTED-ASSERTION-MAX-DEPTH*", NIL);
        defparameter("*EXCEPTED-ASSERTION-SHALLOW-MAX-DEPTH*", FIVE_INTEGER);
        defparameter("*DOOMED-ASSERTION-MAX-DEPTH*", NIL);
        deflexical("*ASSERTION-MENTIONS-ANY-OF-TERMS-SET-WATERMARK*", $int$30);
        defparameter("*ASSERTION-MENTIONS-ANY-OF-TERMS-SET-LAMBDA*", NIL);
        defparameter("*ASSERTION-MENTIONS-ANY-OF-TERMS-DICT-LAMBDA*", NIL);
        defparameter("*NEWEST-CONSTANT-OF-ASSERTIONS*", NIL);
        deflexical("*CACHED-SELF-LOOPING-RULE-ASSERTION?-CACHING-STATE*", NIL);
        deflexical("*CACHED-SELF-EXPANDING-RULE-ASSERTION?-CACHING-STATE*", NIL);
        defparameter("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-THRESHOLD*", $int$212);
        defparameter("*WITHIN-SAFE-ALL-FORWARD-RULES-RELEVANT-TO-TERM?*", NIL);
        defparameter("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-ARGUMENT-SET*", NIL);
        defparameter("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-DEPENDENT-SET*", NIL);
        defparameter("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-NART-SET*", NIL);
        defparameter("*ALL-FORWARD-RULES-RELEVANT-TO-TERM-RESULT-SET*", NIL);
        defparameter("*DEDUCTION-ASSERTED-ASSERTION-SUPPORTS-DEDUCTIONS-PROCESSED*", NIL);
        defparameter("*DEDUCTION-ASSERTED-ASSERTION-COUNTS*", NIL);
        defparameter("*RAREST-TERM*", NIL);
        defparameter("*RAREST-COUNT*", NIL);
        return NIL;
    }

    public static final SubLObject setup_assertion_utilities_file_alt() {
        register_cyc_api_function($sym64$ASSERTION_HAS_META_ASSERTIONS_, $list_alt65, $str_alt66$Return_T_iff_ASSERTION_has_some_m, $list_alt67, $list_alt68);
        memoization_state.note_globally_cached_function($sym83$CACHED_SELF_LOOPING_RULE_ASSERTION_);
        memoization_state.note_globally_cached_function($sym86$CACHED_SELF_EXPANDING_RULE_ASSERTION_);
        return NIL;
    }

    public static SubLObject setup_assertion_utilities_file() {
        if (SubLFiles.USE_V1) {
            register_cyc_api_function($sym87$ASSERTION_HAS_META_ASSERTIONS_, $list88, $str89$Return_T_iff_ASSERTION_has_some_m, $list90, $list91);
            memoization_state.note_globally_cached_function($sym108$CACHED_SELF_LOOPING_RULE_ASSERTION_);
            memoization_state.note_globally_cached_function($sym110$CACHED_SELF_EXPANDING_RULE_ASSERTION_);
            memoization_state.note_memoized_function(MEMOIZED_ASSERTION_TERM_RARITY);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function($sym64$ASSERTION_HAS_META_ASSERTIONS_, $list_alt65, $str_alt66$Return_T_iff_ASSERTION_has_some_m, $list_alt67, $list_alt68);
            memoization_state.note_globally_cached_function($sym83$CACHED_SELF_LOOPING_RULE_ASSERTION_);
            memoization_state.note_globally_cached_function($sym86$CACHED_SELF_EXPANDING_RULE_ASSERTION_);
        }
        return NIL;
    }

    public static SubLObject setup_assertion_utilities_file_Previous() {
        register_cyc_api_function($sym87$ASSERTION_HAS_META_ASSERTIONS_, $list88, $str89$Return_T_iff_ASSERTION_has_some_m, $list90, $list91);
        memoization_state.note_globally_cached_function($sym108$CACHED_SELF_LOOPING_RULE_ASSERTION_);
        memoization_state.note_globally_cached_function($sym110$CACHED_SELF_EXPANDING_RULE_ASSERTION_);
        memoization_state.note_memoized_function(MEMOIZED_ASSERTION_TERM_RARITY);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_assertion_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_assertion_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_assertion_utilities_file();
    }

    static {
    }
}

