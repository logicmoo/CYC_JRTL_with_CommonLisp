/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.constant_handles.do_constants_table;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
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
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.kb_cleanup;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_paths;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      HL-PROTOTYPES
 * source file: /cyc/top/cycl/inference/harness/hl-prototypes.lisp
 * created:     2019/07/03 17:37:48
 */
public final class hl_prototypes extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new hl_prototypes();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.hl_prototypes";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $hl_prototypes_enabledP$ = makeSymbol("*HL-PROTOTYPES-ENABLED?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $gather_hl_prototype_statisticsP$ = makeSymbol("*GATHER-HL-PROTOTYPE-STATISTICS?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $hl_prototype_hits$ = makeSymbol("*HL-PROTOTYPE-HITS*");

    public static final SubLSymbol $hl_prototype_hit_table$ = makeSymbol("*HL-PROTOTYPE-HIT-TABLE*");

    public static final SubLSymbol $hl_prototype_misses$ = makeSymbol("*HL-PROTOTYPE-MISSES*");

    private static final SubLSymbol HL_PROTOTYPICAL_INSTANCE_AFTER_ADDING = makeSymbol("HL-PROTOTYPICAL-INSTANCE-AFTER-ADDING");

    private static final SubLSymbol HL_PROTOTYPICAL_INSTANCE_AFTER_REMOVING = makeSymbol("HL-PROTOTYPICAL-INSTANCE-AFTER-REMOVING");

    private static final SubLSymbol THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE = makeSymbol("THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE");



    private static final SubLList $list7 = list(reader_make_constant_shell("HLPrototypicalTerm"));





    private static final SubLSymbol $the_hl_prototype_ke_irrelevant_rule_caching_state$ = makeSymbol("*THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-CACHING-STATE*");





    private static final SubLString $$$ThePrototypical = makeString("ThePrototypical");

    private static final SubLString $str17$Hits_____a__ = makeString("Hits:   ~a~%");

    private static final SubLString $str18$Misses___a__ = makeString("Misses: ~a~%");

    private static final SubLString $str19$Ratio____a___ = makeString("Ratio:  ~a%~%");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol $sym22$_ = makeSymbol(">");

    private static final SubLString $$$mapping_Cyc_constants = makeString("mapping Cyc constants");

    private static final SubLSymbol $sym27$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

    private static final SubLString $$$Foo = makeString("Foo");

    private static final SubLList $list29 = list(reader_make_constant_shell("Individual"));

    private static final SubLList $list33 = list(reader_make_constant_shell("Person"));

    public static final SubLObject hl_prototypes_enabledP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != $hl_prototypes_enabledP$.getDynamicValue(thread)) && (NIL != valid_constantP($$hlPrototypicalInstance, UNPROVIDED))) && (NIL != valid_constantP($$HLPrototypicalTerm, UNPROVIDED)));
        }
    }

    public static SubLObject hl_prototypes_enabledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $hl_prototypes_enabledP$.getDynamicValue(thread);
    }

    public static final SubLObject hl_prototype_allowed_forward_rules_alt(SubLObject assertions_found_or_created) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.inference.harness.hl_prototypes.hl_prototypes_enabledP()) {
                if (NIL != list_utilities.singletonP(assertions_found_or_created)) {
                    {
                        SubLObject assertion = assertions_found_or_created.first();
                        if (NIL != com.cyc.cycjava.cycl.inference.harness.hl_prototypes.possibly_hl_prototype_assertionP(assertion)) {
                            {
                                SubLObject col = assertions_high.gaf_arg2(assertion);
                                SubLObject prototypical_instance = com.cyc.cycjava.cycl.inference.harness.hl_prototypes.find_or_create_hl_prototypical_instance(col, UNPROVIDED);
                                SubLObject rules = com.cyc.cycjava.cycl.inference.harness.hl_prototypes.relevant_hl_prototype_rules(prototypical_instance);
                                if (NIL != $gather_hl_prototype_statisticsP$.getDynamicValue(thread)) {
                                    $hl_prototype_hits$.setGlobalValue(add($hl_prototype_hits$.getGlobalValue(), ONE_INTEGER));
                                    dictionary_utilities.dictionary_increment($hl_prototype_hit_table$.getGlobalValue(), col, UNPROVIDED);
                                }
                                return rules;
                            }
                        }
                    }
                }
            }
            if (NIL != $gather_hl_prototype_statisticsP$.getDynamicValue(thread)) {
                $hl_prototype_misses$.setGlobalValue(add($hl_prototype_misses$.getGlobalValue(), ONE_INTEGER));
            }
            return forward.forward_inference_allowed_rules();
        }
    }

    public static SubLObject hl_prototype_allowed_forward_rules(final SubLObject assertions_found_or_created) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != hl_prototypes_enabledP()) && (NIL != list_utilities.singletonP(assertions_found_or_created))) {
            final SubLObject assertion = assertions_found_or_created.first();
            if (NIL != possibly_hl_prototype_assertionP(assertion)) {
                final SubLObject col = assertions_high.gaf_arg2(assertion);
                final SubLObject prototypical_instance = find_or_create_hl_prototypical_instance(col, UNPROVIDED);
                final SubLObject rules = relevant_hl_prototype_rules(prototypical_instance);
                if (NIL != $gather_hl_prototype_statisticsP$.getDynamicValue(thread)) {
                    $hl_prototype_hits$.setGlobalValue(add($hl_prototype_hits$.getGlobalValue(), ONE_INTEGER));
                    dictionary_utilities.dictionary_increment($hl_prototype_hit_table$.getGlobalValue(), col, UNPROVIDED);
                }
                return rules;
            }
        }
        if (NIL != $gather_hl_prototype_statisticsP$.getDynamicValue(thread)) {
            $hl_prototype_misses$.setGlobalValue(add($hl_prototype_misses$.getGlobalValue(), ONE_INTEGER));
        }
        return forward.forward_inference_allowed_rules();
    }

    public static SubLObject hl_prototype_forbidden_forward_rules(final SubLObject assertions_found_or_created) {
        if ((NIL != hl_prototypes_enabledP()) && (NIL != list_utilities.singletonP(assertions_found_or_created))) {
            final SubLObject assertion = assertions_found_or_created.first();
            if (NIL != possibly_hl_prototype_assertionP(assertion)) {
                if (forward.forward_inference_forbidden_rules().isCons()) {
                    return list_utilities.fast_remove_duplicates(cons(the_hl_prototype_ke_irrelevant_rule(), forward.forward_inference_forbidden_rules()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return list(the_hl_prototype_ke_irrelevant_rule());
            }
        }
        return forward.forward_inference_forbidden_rules();
    }

    public static final SubLObject hl_prototypical_instance_after_adding_alt(SubLObject assertion, SubLObject argument) {
        return NIL;
    }

    public static SubLObject hl_prototypical_instance_after_adding(final SubLObject assertion, final SubLObject argument) {
        return NIL;
    }

    public static final SubLObject hl_prototypical_instance_after_removing_alt(SubLObject assertion, SubLObject argument) {
        return NIL;
    }

    public static SubLObject hl_prototypical_instance_after_removing(final SubLObject assertion, final SubLObject argument) {
        return NIL;
    }

    public static final SubLObject clear_the_hl_prototype_ke_irrelevant_rule_alt() {
        {
            SubLObject cs = $the_hl_prototype_ke_irrelevant_rule_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_the_hl_prototype_ke_irrelevant_rule() {
        final SubLObject cs = $the_hl_prototype_ke_irrelevant_rule_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_the_hl_prototype_ke_irrelevant_rule_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($the_hl_prototype_ke_irrelevant_rule_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_the_hl_prototype_ke_irrelevant_rule() {
        return memoization_state.caching_state_remove_function_results_with_args($the_hl_prototype_ke_irrelevant_rule_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    /**
     * The CNF of the forward rule that implements #$keIrrelevantTerm for HL prototypical instances.
     * We don't want to include this in the forward inference allowed rules.
     */
    @LispMethod(comment = "The CNF of the forward rule that implements #$keIrrelevantTerm for HL prototypical instances.\r\nWe don\'t want to include this in the forward inference allowed rules.\nThe CNF of the forward rule that implements #$keIrrelevantTerm for HL prototypical instances.\nWe don\'t want to include this in the forward inference allowed rules.")
    public static final SubLObject the_hl_prototype_ke_irrelevant_rule_internal_alt() {
        return kb_indexing.find_assertion(list(list(listS($$quotedIsa, variables.find_variable_by_id(ZERO_INTEGER), $list_alt9)), list(list($$keIrrelevantTerm, variables.find_variable_by_id(ZERO_INTEGER)))), $$UniversalVocabularyMt);
    }

    /**
     * The CNF of the forward rule that implements #$keIrrelevantTerm for HL prototypical instances.
     * We don't want to include this in the forward inference allowed rules.
     */
    @LispMethod(comment = "The CNF of the forward rule that implements #$keIrrelevantTerm for HL prototypical instances.\r\nWe don\'t want to include this in the forward inference allowed rules.\nThe CNF of the forward rule that implements #$keIrrelevantTerm for HL prototypical instances.\nWe don\'t want to include this in the forward inference allowed rules.")
    public static SubLObject the_hl_prototype_ke_irrelevant_rule_internal() {
        return kb_indexing.find_assertion(list(list(listS($$quotedIsa, variables.find_variable_by_id(ZERO_INTEGER), $list7)), list(list($$keIrrelevantTerm, variables.find_variable_by_id(ZERO_INTEGER)))), $$UniversalVocabularyMt);
    }

    public static final SubLObject the_hl_prototype_ke_irrelevant_rule_alt() {
        {
            SubLObject caching_state = $the_hl_prototype_ke_irrelevant_rule_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE, $the_hl_prototype_ke_irrelevant_rule_caching_state$, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw13$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.inference.harness.hl_prototypes.the_hl_prototype_ke_irrelevant_rule_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject the_hl_prototype_ke_irrelevant_rule() {
        SubLObject caching_state = $the_hl_prototype_ke_irrelevant_rule_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE, $the_hl_prototype_ke_irrelevant_rule_caching_state$, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(the_hl_prototype_ke_irrelevant_rule_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject relevant_hl_prototype_rules_alt(SubLObject v_term) {
        {
            SubLObject rules = assertion_utilities.all_forward_rules_relevant_to_term(v_term);
            return remove(com.cyc.cycjava.cycl.inference.harness.hl_prototypes.the_hl_prototype_ke_irrelevant_rule(), rules, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject relevant_hl_prototype_rules(final SubLObject v_term) {
        final SubLObject rules = assertion_utilities.safe_all_forward_rules_relevant_to_term(v_term);
        if (rules.isCons()) {
            return rules;
        }
        return forward.forward_inference_allowed_rules();
    }

    public static final SubLObject clear_hl_prototype_caches_alt() {
        com.cyc.cycjava.cycl.inference.harness.hl_prototypes.clear_the_hl_prototype_ke_irrelevant_rule();
        return NIL;
    }

    public static SubLObject clear_hl_prototype_caches() {
        clear_the_hl_prototype_ke_irrelevant_rule();
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether ASSERTION is of the form (#$isa NEW-TERM COL),
    where NEW-TERM has no assertions other than ASSERTION, and COL is an HL prototype collection
     */
    @LispMethod(comment = "@return booleanp; whether ASSERTION is of the form (#$isa NEW-TERM COL),\r\nwhere NEW-TERM has no assertions other than ASSERTION, and COL is an HL prototype collection")
    public static final SubLObject possibly_hl_prototype_assertionP_alt(SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$isa)) {
            {
                SubLObject mt = assertions_high.assertion_mt(assertion);
                if ((mt == mt_vars.$anect_mt$.getGlobalValue()) || (mt == mt_vars.$core_mt_floor$.getGlobalValue())) {
                    {
                        SubLObject new_term = assertions_high.gaf_arg1(assertion);
                        if (NIL != number_utilities.onep(kb_indexing.num_index(new_term))) {
                            return T;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether ASSERTION is of the form (#$isa NEW-TERM COL),
    where NEW-TERM has no assertions other than ASSERTION, and COL is an HL prototype collection
     */
    @LispMethod(comment = "@return booleanp; whether ASSERTION is of the form (#$isa NEW-TERM COL),\r\nwhere NEW-TERM has no assertions other than ASSERTION, and COL is an HL prototype collection")
    public static SubLObject possibly_hl_prototype_assertionP(final SubLObject assertion) {
        if (NIL != assertion_utilities.gaf_assertion_with_pred_p(assertion, $$isa)) {
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            if (mt.eql(mt_vars.$anect_mt$.getGlobalValue()) || mt.eql(mt_vars.$core_mt_floor$.getGlobalValue())) {
                final SubLObject new_term = assertions_high.gaf_arg1(assertion);
                if (NIL != number_utilities.onep(kb_indexing.num_index(new_term))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject find_or_create_hl_prototypical_instance_alt(SubLObject col, SubLObject use_transcriptP) {
        if (use_transcriptP == UNPROVIDED) {
            use_transcriptP = NIL;
        }
        {
            SubLObject prototypical_instance = com.cyc.cycjava.cycl.inference.harness.hl_prototypes.hl_prototypical_instance(col);
            return NIL != prototypical_instance ? ((SubLObject) (prototypical_instance)) : com.cyc.cycjava.cycl.inference.harness.hl_prototypes.create_hl_prototypical_instance(col, use_transcriptP);
        }
    }

    public static SubLObject find_or_create_hl_prototypical_instance(final SubLObject col, SubLObject use_transcriptP) {
        if (use_transcriptP == UNPROVIDED) {
            use_transcriptP = NIL;
        }
        final SubLObject prototypical_instance = hl_prototypical_instance(col);
        return NIL != prototypical_instance ? prototypical_instance : create_hl_prototypical_instance(col, use_transcriptP);
    }

    /**
     *
     *
     * @return constant-p; the constant denoting the prototypical instance of COL
     */
    @LispMethod(comment = "@return constant-p; the constant denoting the prototypical instance of COL")
    public static final SubLObject hl_prototypical_instance_alt(SubLObject col) {
        return kb_mapping_utilities.fpred_value(col, $$hlPrototypicalInstance, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    /**
     *
     *
     * @return constant-p; the constant denoting the prototypical instance of COL
     */
    @LispMethod(comment = "@return constant-p; the constant denoting the prototypical instance of COL")
    public static SubLObject hl_prototypical_instance(final SubLObject col) {
        return kb_mapping_utilities.fpred_value(col, $$hlPrototypicalInstance, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    /**
     *
     *
     * @return constant-p; a newly created prototypical instance of COL
     */
    @LispMethod(comment = "@return constant-p; a newly created prototypical instance of COL")
    public static final SubLObject create_hl_prototypical_instance_alt(SubLObject col, SubLObject use_transcriptP) {
        if (use_transcriptP == UNPROVIDED) {
            use_transcriptP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject name = com.cyc.cycjava.cycl.inference.harness.hl_prototypes.hl_prototypical_instance_name(col);
                SubLObject v_const = (NIL != use_transcriptP) ? ((SubLObject) (ke.ke_create_now(name, UNPROVIDED))) : cyc_kernel.cyc_create_new_ephemeral(name);
                SubLObject environment = forward.get_forward_inference_environment();
                SubLTrampolineFile.checkType(environment, QUEUE_P);
                {
                    SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $hl_prototypes_enabledP$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                        $hl_prototypes_enabledP$.bind(NIL, thread);
                        {
                            SubLObject _prev_bind_0_1 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                            try {
                                kb_control_vars.$forward_inference_allowed_rules$.bind(removal_module_utilities.non_null_answer_to_singleton(com.cyc.cycjava.cycl.inference.harness.hl_prototypes.the_hl_prototype_ke_irrelevant_rule()), thread);
                                if (NIL != use_transcriptP) {
                                    ke.ke_assert_now(listS($$quotedIsa, v_const, $list_alt9), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                                } else {
                                    cyc_kernel.cyc_assert_wff(listS($$quotedIsa, v_const, $list_alt9), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
                                }
                            } finally {
                                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        {
                            SubLObject _prev_bind_0_2 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                            try {
                                kb_control_vars.$forward_inference_allowed_rules$.bind(NIL, thread);
                                if (NIL != use_transcriptP) {
                                    ke.ke_assert_now(list($$hlPrototypicalInstance, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                                } else {
                                    cyc_kernel.cyc_assert_wff(list($$hlPrototypicalInstance, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
                                }
                            } finally {
                                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_2, thread);
                            }
                        }
                        {
                            SubLObject _prev_bind_0_3 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                            try {
                                kb_control_vars.$forward_inference_allowed_rules$.bind($ALL, thread);
                                if (NIL != use_transcriptP) {
                                    ke.ke_assert_now(list($$isa, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                                } else {
                                    cyc_kernel.cyc_assert_wff(list($$isa, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
                                }
                            } finally {
                                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_3, thread);
                            }
                        }
                    } finally {
                        $hl_prototypes_enabledP$.rebind(_prev_bind_1, thread);
                        kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_const;
            }
        }
    }

    /**
     *
     *
     * @return constant-p; a newly created prototypical instance of COL
     */
    @LispMethod(comment = "@return constant-p; a newly created prototypical instance of COL")
    public static SubLObject create_hl_prototypical_instance(final SubLObject col, SubLObject use_transcriptP) {
        if (use_transcriptP == UNPROVIDED) {
            use_transcriptP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = hl_prototypical_instance_name(col);
        final SubLObject v_const = (NIL != use_transcriptP) ? ke.ke_create_now(name, UNPROVIDED) : cyc_kernel.cyc_create_new_ephemeral(name);
        final SubLObject environment = forward.get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : "! queues.queue_p(environment) " + ("queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) ") + environment;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $hl_prototypes_enabledP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            $hl_prototypes_enabledP$.bind(NIL, thread);
            final SubLObject _prev_bind_0_$1 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(removal_module_utilities.non_null_answer_to_singleton(the_hl_prototype_ke_irrelevant_rule()), thread);
                if (NIL != use_transcriptP) {
                    ke.ke_assert_now(listS($$quotedIsa, v_const, $list7), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                } else {
                    cyc_kernel.cyc_assert_wff(listS($$quotedIsa, v_const, $list7), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
                }
            } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_$1, thread);
            }
            final SubLObject _prev_bind_0_$2 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(NIL, thread);
                if (NIL != use_transcriptP) {
                    ke.ke_assert_now(list($$hlPrototypicalInstance, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                } else {
                    cyc_kernel.cyc_assert_wff(list($$hlPrototypicalInstance, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
                }
            } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_$2, thread);
            }
            final SubLObject _prev_bind_0_$3 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind($ALL, thread);
                if (NIL != use_transcriptP) {
                    ke.ke_assert_now(list($$isa, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                } else {
                    cyc_kernel.cyc_assert_wff(list($$isa, v_const, col), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
                }
            } finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_$3, thread);
            }
        } finally {
            $hl_prototypes_enabledP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        return v_const;
    }

    public static final SubLObject hl_prototypical_instance_name_alt(SubLObject col) {
        return string_utilities.make_valid_constant_name(cconcatenate($$$ThePrototypical, kb_paths.fort_name(col)), UNPROVIDED);
    }

    public static SubLObject hl_prototypical_instance_name(final SubLObject col) {
        return string_utilities.make_valid_constant_name(cconcatenate($$$ThePrototypical, kb_paths.fort_name(col)), UNPROVIDED);
    }

    /**
     *
     *
     * @return list of collection-p; the list of all collections that have a prototypical instance
     */
    @LispMethod(comment = "@return list of collection-p; the list of all collections that have a prototypical instance")
    public static final SubLObject hl_prototype_collections_alt() {
        return Mapping.mapcar(GAF_ARG2, kb_mapping.gather_predicate_extent_index($$hlPrototypicalInstance, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return list of collection-p; the list of all collections that have a prototypical instance
     */
    @LispMethod(comment = "@return list of collection-p; the list of all collections that have a prototypical instance")
    public static SubLObject hl_prototype_collections() {
        return Mapping.mapcar(GAF_ARG2, kb_mapping.gather_predicate_extent_index($$hlPrototypicalInstance, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return collection-p; the collection of which PROTOTYPICAL-INSTANCE is a prototypical instance.
     */
    @LispMethod(comment = "@return collection-p; the collection of which PROTOTYPICAL-INSTANCE is a prototypical instance.")
    public static final SubLObject hl_prototypical_collection_alt(SubLObject prototypical_instance) {
        return NIL != indexed_term_p(prototypical_instance) ? ((SubLObject) (kb_mapping_utilities.fpred_value(prototypical_instance, $$hlPrototypicalInstance, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
    }

    /**
     *
     *
     * @return collection-p; the collection of which PROTOTYPICAL-INSTANCE is a prototypical instance.
     */
    @LispMethod(comment = "@return collection-p; the collection of which PROTOTYPICAL-INSTANCE is a prototypical instance.")
    public static SubLObject hl_prototypical_collection(final SubLObject prototypical_instance) {
        return NIL != indexed_term_p(prototypical_instance) ? kb_mapping_utilities.fpred_value(prototypical_instance, $$hlPrototypicalInstance, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
    }

    public static final SubLObject hl_prototypical_instanceP_alt(SubLObject thing) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.inference.harness.hl_prototypes.hl_prototypical_collection(thing));
    }

    public static SubLObject hl_prototypical_instanceP(final SubLObject thing) {
        return list_utilities.sublisp_boolean(hl_prototypical_collection(thing));
    }

    public static final SubLObject show_hl_prototype_statistics_alt() {
        dictionary_utilities.print_dictionary_contents($hl_prototype_hit_table$.getGlobalValue(), UNPROVIDED);
        format(T, $str_alt19$Hits_____a__, $hl_prototype_hits$.getGlobalValue());
        format(T, $str_alt20$Misses___a__, $hl_prototype_misses$.getGlobalValue());
        {
            SubLObject total = add($hl_prototype_hits$.getGlobalValue(), $hl_prototype_misses$.getGlobalValue());
            if (total.isPositive()) {
                {
                    SubLObject hit_ratio = number_utilities.percent(divide($hl_prototype_hits$.getGlobalValue(), total), ONE_INTEGER, FOUR_INTEGER);
                    format(T, $str_alt21$Ratio____a___, hit_ratio);
                    return hit_ratio;
                }
            }
        }
        return NIL;
    }

    public static SubLObject show_hl_prototype_statistics() {
        dictionary_utilities.print_dictionary_contents($hl_prototype_hit_table$.getGlobalValue(), UNPROVIDED);
        format(T, $str17$Hits_____a__, $hl_prototype_hits$.getGlobalValue());
        format(T, $str18$Misses___a__, $hl_prototype_misses$.getGlobalValue());
        final SubLObject total = add($hl_prototype_hits$.getGlobalValue(), $hl_prototype_misses$.getGlobalValue());
        if (total.isPositive()) {
            final SubLObject hit_ratio = number_utilities.percent(divide($hl_prototype_hits$.getGlobalValue(), total), ONE_INTEGER, FOUR_INTEGER);
            format(T, $str19$Ratio____a___, hit_ratio);
            return hit_ratio;
        }
        return NIL;
    }

    public static final SubLObject clear_hl_prototype_statistics_alt() {
        $hl_prototype_misses$.setGlobalValue(ZERO_INTEGER);
        $hl_prototype_hits$.setGlobalValue(ZERO_INTEGER);
        dictionary.clear_dictionary($hl_prototype_hit_table$.getGlobalValue());
        return ZERO_INTEGER;
    }

    public static SubLObject clear_hl_prototype_statistics() {
        $hl_prototype_misses$.setGlobalValue(ZERO_INTEGER);
        $hl_prototype_hits$.setGlobalValue(ZERO_INTEGER);
        dictionary.clear_dictionary($hl_prototype_hit_table$.getGlobalValue());
        return ZERO_INTEGER;
    }

    public static final SubLObject create_hl_prototypical_instances_for_common_collections_alt(SubLObject n, SubLObject dict) {
        if (dict == UNPROVIDED) {
            dict = com.cyc.cycjava.cycl.inference.harness.hl_prototypes.most_useful_hl_prototypical_instances_dict();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject list_var = com.cyc.cycjava.cycl.inference.harness.hl_prototypes.n_most_useful_hl_prototype_collections(n, dict);
                $progress_note$.setDynamicValue($$$cdolist, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
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
                            SubLObject csome_list_var = list_var;
                            SubLObject col = NIL;
                            for (col = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                com.cyc.cycjava.cycl.inference.harness.hl_prototypes.find_or_create_hl_prototypical_instance(col, T);
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
            return n;
        }
    }

    public static SubLObject create_hl_prototypical_instances_for_common_collections(final SubLObject n, SubLObject dict) {
        if (dict == UNPROVIDED) {
            dict = most_useful_hl_prototypical_instances_dict();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_var = n_most_useful_hl_prototype_collections(n, dict);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject col = NIL;
                col = csome_list_var.first();
                while (NIL != csome_list_var) {
                    find_or_create_hl_prototypical_instance(col, T);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    col = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return n;
    }

    public static final SubLObject n_most_useful_hl_prototype_collections_alt(SubLObject n, SubLObject dict) {
        if (dict == UNPROVIDED) {
            dict = com.cyc.cycjava.cycl.inference.harness.hl_prototypes.most_useful_hl_prototypical_instances_dict();
        }
        return list_utilities.first_n(n, Mapping.mapcar(symbol_function(CAR), dictionary_utilities.sort_dictionary_by_values(dict, symbol_function($sym24$_))));
    }

    public static SubLObject n_most_useful_hl_prototype_collections(final SubLObject n, SubLObject dict) {
        if (dict == UNPROVIDED) {
            dict = most_useful_hl_prototypical_instances_dict();
        }
        return list_utilities.first_n(n, Mapping.mapcar(symbol_function(CAR), dictionary_utilities.sort_dictionary_by_values(dict, symbol_function($sym22$_))));
    }

    public static final SubLObject most_useful_hl_prototypical_instances_dict_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dict = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                SubLObject idx = do_constants_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$mapping_Cyc_constants, STRINGP);
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
                        noting_percent_progress_preamble($$$mapping_Cyc_constants);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject c = NIL;
                                while (NIL != id) {
                                    c = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, c, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        {
                                            SubLObject col = com.cyc.cycjava.cycl.inference.harness.hl_prototypes.likely_first_asserted_isa_col(c);
                                            if (NIL != col) {
                                                dictionary_utilities.dictionary_increment(dict, col, UNPROVIDED);
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
                return dict;
            }
        }
    }

    public static SubLObject most_useful_hl_prototypical_instances_dict() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        final SubLObject idx = do_constants_table();
        final SubLObject mess = $$$mapping_Cyc_constants;
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
                final SubLObject idx_$5 = idx;
                if (NIL == id_index_objects_empty_p(idx_$5, $SKIP)) {
                    final SubLObject idx_$6 = idx_$5;
                    if (NIL == id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$6);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject c;
                        SubLObject col;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            c = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(c)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(c)) {
                                    c = $SKIP;
                                }
                                col = likely_first_asserted_isa_col(c);
                                if (NIL != col) {
                                    dictionary_utilities.dictionary_increment(dict, col, UNPROVIDED);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$7 = idx_$5;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$7)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$7);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$7);
                        final SubLObject end_id = id_index_next_id(idx_$7);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject c2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(c2))) {
                                final SubLObject col2 = likely_first_asserted_isa_col(c2);
                                if (NIL != col2) {
                                    dictionary_utilities.dictionary_increment(dict, col2, UNPROVIDED);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return dict;
    }

    public static final SubLObject likely_first_asserted_isa_col_alt(SubLObject v_const) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_vars.$anect_mt$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject gafs = kb_mapping.gather_gaf_arg_index(v_const, ONE_INTEGER, $$isa, NIL, $TRUE);
                            SubLObject first_gaf = com.cyc.cycjava.cycl.inference.harness.hl_prototypes.likely_first_asserted_isa_gaf(gafs);
                            SubLObject col = (NIL != first_gaf) ? ((SubLObject) (assertions_high.gaf_arg2(first_gaf))) : NIL;
                            result = col;
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject likely_first_asserted_isa_col(final SubLObject v_const) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_vars.$anect_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject gafs = kb_mapping.gather_gaf_arg_index(v_const, ONE_INTEGER, $$isa, NIL, $TRUE);
            final SubLObject first_gaf = likely_first_asserted_isa_gaf(gafs);
            final SubLObject col = result = (NIL != first_gaf) ? assertions_high.gaf_arg2(first_gaf) : NIL;
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject likely_first_asserted_isa_gaf_alt(SubLObject gafs) {
        gafs = list_utilities.remove_if_not($sym29$ASSERTED_ASSERTION_, gafs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        {
            SubLObject earliest_gaf = assertion_utilities.earliest_assertion(gafs);
            return NIL != earliest_gaf ? ((SubLObject) (earliest_gaf)) : list_utilities.random_element(gafs);
        }
    }

    public static SubLObject likely_first_asserted_isa_gaf(SubLObject gafs) {
        gafs = list_utilities.remove_if_not($sym27$ASSERTED_ASSERTION_, gafs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject earliest_gaf = assertion_utilities.earliest_assertion(gafs);
        return NIL != earliest_gaf ? earliest_gaf : list_utilities.random_element(gafs);
    }

    public static final SubLObject hl_prototype_benchmark_1_alt(SubLObject n) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        {
            SubLObject total_time = ZERO_INTEGER;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject v_const = NIL;
                    v_const = cyc_kernel.cyc_create_new_permanent($$$Foo);
                    {
                        SubLObject time = NIL;
                        SubLObject time_var = get_internal_real_time();
                        cyc_kernel.cyc_assert(listS($$isa, v_const, $list_alt31), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                        total_time = add(total_time, time);
                    }
                    cyc_kernel.cyc_kill(v_const);
                }
            }
            return total_time;
        }
    }

    public static SubLObject hl_prototype_benchmark_1(SubLObject n) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        SubLObject total_time = ZERO_INTEGER;
        SubLObject i;
        SubLObject v_const;
        SubLObject time;
        SubLObject time_var;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
            v_const = NIL;
            v_const = cyc_kernel.cyc_create_new_permanent($$$Foo);
            time = NIL;
            time_var = get_internal_real_time();
            cyc_kernel.cyc_assert(listS($$isa, v_const, $list29), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            total_time = add(total_time, time);
            cyc_kernel.cyc_kill(v_const);
        }
        return total_time;
    }

    /**
     * Assumes that :simplest-hypothetical is loaded
     */
    @LispMethod(comment = "Assumes that :simplest-hypothetical is loaded")
    public static final SubLObject hl_prototype_benchmark_2_alt(SubLObject n) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total_time = ZERO_INTEGER;
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                    kb_cleanup.forget_ephemeral_terms(UNPROVIDED);
                    {
                        SubLObject time = NIL;
                        SubLObject time_var = get_internal_real_time();
                        cyc_testing.run_cyc_test_int($SIMPLEST_HYPOTHETICAL, $TERSE, NIL, NIL, $STANDARD, StreamsLow.$standard_output$.getDynamicValue(thread), cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread));
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                        total_time = add(total_time, time);
                    }
                }
                return total_time;
            }
        }
    }

    /**
     * Assumes that :simplest-hypothetical is loaded
     */
    @LispMethod(comment = "Assumes that :simplest-hypothetical is loaded")
    public static SubLObject hl_prototype_benchmark_2(SubLObject n) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total_time = ZERO_INTEGER;
        SubLObject i;
        SubLObject time;
        SubLObject time_var;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
            kb_cleanup.forget_ephemeral_terms(UNPROVIDED);
            time = NIL;
            time_var = get_internal_real_time();
            cyc_testing_utilities.run_cyc_test_int($SIMPLEST_HYPOTHETICAL, $TERSE, NIL, NIL, $STANDARD, StreamsLow.$standard_output$.getDynamicValue(thread), cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread));
            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            total_time = add(total_time, time);
        }
        return total_time;
    }

    public static final SubLObject hl_prototype_benchmark_3_alt(SubLObject n) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        {
            SubLObject total_time = ZERO_INTEGER;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject v_const = NIL;
                    v_const = cyc_kernel.cyc_create_new_permanent($$$Foo);
                    {
                        SubLObject time = NIL;
                        SubLObject time_var = get_internal_real_time();
                        cyc_kernel.cyc_assert(listS($$isa, v_const, $list_alt35), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                        total_time = add(total_time, time);
                    }
                    cyc_kernel.cyc_kill(v_const);
                }
            }
            return total_time;
        }
    }

    public static SubLObject hl_prototype_benchmark_3(SubLObject n) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        SubLObject total_time = ZERO_INTEGER;
        SubLObject i;
        SubLObject v_const;
        SubLObject time;
        SubLObject time_var;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
            v_const = NIL;
            v_const = cyc_kernel.cyc_create_new_permanent($$$Foo);
            time = NIL;
            time_var = get_internal_real_time();
            cyc_kernel.cyc_assert(listS($$isa, v_const, $list33), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED);
            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            total_time = add(total_time, time);
            cyc_kernel.cyc_kill(v_const);
        }
        return total_time;
    }

    public static SubLObject declare_hl_prototypes_file() {
        declareFunction("hl_prototypes_enabledP", "HL-PROTOTYPES-ENABLED?", 0, 0, false);
        declareFunction("hl_prototype_allowed_forward_rules", "HL-PROTOTYPE-ALLOWED-FORWARD-RULES", 1, 0, false);
        declareFunction("hl_prototype_forbidden_forward_rules", "HL-PROTOTYPE-FORBIDDEN-FORWARD-RULES", 1, 0, false);
        declareFunction("hl_prototypical_instance_after_adding", "HL-PROTOTYPICAL-INSTANCE-AFTER-ADDING", 2, 0, false);
        declareFunction("hl_prototypical_instance_after_removing", "HL-PROTOTYPICAL-INSTANCE-AFTER-REMOVING", 2, 0, false);
        declareFunction("clear_the_hl_prototype_ke_irrelevant_rule", "CLEAR-THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE", 0, 0, false);
        declareFunction("remove_the_hl_prototype_ke_irrelevant_rule", "REMOVE-THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE", 0, 0, false);
        declareFunction("the_hl_prototype_ke_irrelevant_rule_internal", "THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-INTERNAL", 0, 0, false);
        declareFunction("the_hl_prototype_ke_irrelevant_rule", "THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE", 0, 0, false);
        declareFunction("relevant_hl_prototype_rules", "RELEVANT-HL-PROTOTYPE-RULES", 1, 0, false);
        declareFunction("clear_hl_prototype_caches", "CLEAR-HL-PROTOTYPE-CACHES", 0, 0, false);
        declareFunction("possibly_hl_prototype_assertionP", "POSSIBLY-HL-PROTOTYPE-ASSERTION?", 1, 0, false);
        declareFunction("find_or_create_hl_prototypical_instance", "FIND-OR-CREATE-HL-PROTOTYPICAL-INSTANCE", 1, 1, false);
        declareFunction("hl_prototypical_instance", "HL-PROTOTYPICAL-INSTANCE", 1, 0, false);
        declareFunction("create_hl_prototypical_instance", "CREATE-HL-PROTOTYPICAL-INSTANCE", 1, 1, false);
        declareFunction("hl_prototypical_instance_name", "HL-PROTOTYPICAL-INSTANCE-NAME", 1, 0, false);
        declareFunction("hl_prototype_collections", "HL-PROTOTYPE-COLLECTIONS", 0, 0, false);
        declareFunction("hl_prototypical_collection", "HL-PROTOTYPICAL-COLLECTION", 1, 0, false);
        declareFunction("hl_prototypical_instanceP", "HL-PROTOTYPICAL-INSTANCE?", 1, 0, false);
        declareFunction("show_hl_prototype_statistics", "SHOW-HL-PROTOTYPE-STATISTICS", 0, 0, false);
        declareFunction("clear_hl_prototype_statistics", "CLEAR-HL-PROTOTYPE-STATISTICS", 0, 0, false);
        declareFunction("create_hl_prototypical_instances_for_common_collections", "CREATE-HL-PROTOTYPICAL-INSTANCES-FOR-COMMON-COLLECTIONS", 1, 1, false);
        declareFunction("n_most_useful_hl_prototype_collections", "N-MOST-USEFUL-HL-PROTOTYPE-COLLECTIONS", 1, 1, false);
        declareFunction("most_useful_hl_prototypical_instances_dict", "MOST-USEFUL-HL-PROTOTYPICAL-INSTANCES-DICT", 0, 0, false);
        declareFunction("likely_first_asserted_isa_col", "LIKELY-FIRST-ASSERTED-ISA-COL", 1, 0, false);
        declareFunction("likely_first_asserted_isa_gaf", "LIKELY-FIRST-ASSERTED-ISA-GAF", 1, 0, false);
        declareFunction("hl_prototype_benchmark_1", "HL-PROTOTYPE-BENCHMARK-1", 0, 1, false);
        declareFunction("hl_prototype_benchmark_2", "HL-PROTOTYPE-BENCHMARK-2", 0, 1, false);
        declareFunction("hl_prototype_benchmark_3", "HL-PROTOTYPE-BENCHMARK-3", 0, 1, false);
        return NIL;
    }



    static private final SubLList $list_alt9 = list(reader_make_constant_shell("HLPrototypicalTerm"));

    public static final SubLSymbol $kw13$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt19$Hits_____a__ = makeString("Hits:   ~a~%");

    static private final SubLString $str_alt20$Misses___a__ = makeString("Misses: ~a~%");

    static private final SubLString $str_alt21$Ratio____a___ = makeString("Ratio:  ~a%~%");

    static private final SubLSymbol $sym24$_ = makeSymbol(">");

    static private final SubLSymbol $sym29$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");

    static private final SubLList $list_alt31 = list(reader_make_constant_shell("Individual"));

    static private final SubLList $list_alt35 = list(reader_make_constant_shell("Person"));

    public static final SubLObject init_hl_prototypes_file_alt() {
        defparameter("*HL-PROTOTYPES-ENABLED?*", T);
        defparameter("*GATHER-HL-PROTOTYPE-STATISTICS?*", T);
        deflexical("*HL-PROTOTYPE-HITS*", NIL != boundp($hl_prototype_hits$) ? ((SubLObject) ($hl_prototype_hits$.getGlobalValue())) : ZERO_INTEGER);
        deflexical("*HL-PROTOTYPE-HIT-TABLE*", NIL != boundp($hl_prototype_hit_table$) ? ((SubLObject) ($hl_prototype_hit_table$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        deflexical("*HL-PROTOTYPE-MISSES*", NIL != boundp($hl_prototype_misses$) ? ((SubLObject) ($hl_prototype_misses$.getGlobalValue())) : ZERO_INTEGER);
        deflexical("*THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject init_hl_prototypes_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*HL-PROTOTYPES-ENABLED?*", T);
            defparameter("*GATHER-HL-PROTOTYPE-STATISTICS?*", T);
            deflexical("*HL-PROTOTYPE-HITS*", SubLTrampolineFile.maybeDefault($hl_prototype_hits$, $hl_prototype_hits$, ZERO_INTEGER));
            deflexical("*HL-PROTOTYPE-HIT-TABLE*", SubLTrampolineFile.maybeDefault($hl_prototype_hit_table$, $hl_prototype_hit_table$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
            deflexical("*HL-PROTOTYPE-MISSES*", SubLTrampolineFile.maybeDefault($hl_prototype_misses$, $hl_prototype_misses$, ZERO_INTEGER));
            deflexical("*THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-CACHING-STATE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*HL-PROTOTYPE-HITS*", NIL != boundp($hl_prototype_hits$) ? ((SubLObject) ($hl_prototype_hits$.getGlobalValue())) : ZERO_INTEGER);
            deflexical("*HL-PROTOTYPE-HIT-TABLE*", NIL != boundp($hl_prototype_hit_table$) ? ((SubLObject) ($hl_prototype_hit_table$.getGlobalValue())) : dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            deflexical("*HL-PROTOTYPE-MISSES*", NIL != boundp($hl_prototype_misses$) ? ((SubLObject) ($hl_prototype_misses$.getGlobalValue())) : ZERO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject init_hl_prototypes_file_Previous() {
        defparameter("*HL-PROTOTYPES-ENABLED?*", T);
        defparameter("*GATHER-HL-PROTOTYPE-STATISTICS?*", T);
        deflexical("*HL-PROTOTYPE-HITS*", SubLTrampolineFile.maybeDefault($hl_prototype_hits$, $hl_prototype_hits$, ZERO_INTEGER));
        deflexical("*HL-PROTOTYPE-HIT-TABLE*", SubLTrampolineFile.maybeDefault($hl_prototype_hit_table$, $hl_prototype_hit_table$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*HL-PROTOTYPE-MISSES*", SubLTrampolineFile.maybeDefault($hl_prototype_misses$, $hl_prototype_misses$, ZERO_INTEGER));
        deflexical("*THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_hl_prototypes_file() {
        declare_defglobal($hl_prototype_hits$);
        declare_defglobal($hl_prototype_hit_table$);
        declare_defglobal($hl_prototype_misses$);
        register_kb_function(HL_PROTOTYPICAL_INSTANCE_AFTER_ADDING);
        register_kb_function(HL_PROTOTYPICAL_INSTANCE_AFTER_REMOVING);
        memoization_state.note_globally_cached_function(THE_HL_PROTOTYPE_KE_IRRELEVANT_RULE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_hl_prototypes_file();
    }

    @Override
    public void initializeVariables() {
        init_hl_prototypes_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_hl_prototypes_file();
    }

    
}

/**
 * Total time: 205 ms
 */
