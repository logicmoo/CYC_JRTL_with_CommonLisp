/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      TERM-LEARNER
 *  source file: /cyc/top/cycl/term-learner.lisp
 *  created:     2019/07/03 17:38:58
 */
public final class term_learner extends SubLTranslatedFile implements V02 {
    // // Constructor
    private term_learner() {
    }

    public static final SubLFile me = new term_learner();


    // // Definitions
    /**
     * Returns a list of BINARY PREDICATES that can be used to add GAFS about a
     * term, using Web search.  These binary predicates are present in FET templates
     * that are specified by the inputs.
     *
     * @unknown RELEVANT-PREDICATES listp; e.g. (#$expertRegarding #$birthDate ...)
     */
    public static final SubLObject term_learner_preds_in_fet_templates(SubLObject template_topic, SubLObject template_mt) {
        {
            SubLObject predicates = ask_utilities.query_variable($sym0$_PRED, listS($$and, list($$isa, $sym3$_TEMPLATE, template_topic), $list_alt4), template_mt, UNPROVIDED);
            SubLObject relevant_predicates = NIL;
            SubLObject cdolist_list_var = predicates;
            SubLObject predicate = NIL;
            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                if ((NIL != fort_types_interface.predicate_p(predicate)) && (NIL == predicate_suggestor.fts_expert_termP(predicate))) {
                    {
                        SubLObject item_var = predicate;
                        if (NIL == member(item_var, relevant_predicates, symbol_function(EQL), symbol_function(IDENTITY))) {
                            relevant_predicates = cons(item_var, relevant_predicates);
                        }
                    }
                }
            }
            return relevant_predicates;
        }
    }

    /**
     * Returns a list of predicates that can be used for GAF generation.  These
     * predicates are present in FET templates relevant to INSTANCE.
     *
     * @param INSTANCE;
     * 		e.g. #$YassirArafat
     * @unknown RELEVANT-PREDICATES listp; e.g. (#$expertRegarding #$birthDate ...)
     */
    public static final SubLObject term_learner_preds_for_term(SubLObject instance) {
        {
            SubLObject relevant_predicates = NIL;
            SubLObject cdolist_list_var = formula_template_utilities.applicable_template_topics_for_term(instance, UNPROVIDED);
            SubLObject template = NIL;
            for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                {
                    SubLObject template_topic = template.first();
                    SubLObject template_mt = second(template);
                    SubLObject predicates = term_learner_preds_in_fet_templates(template_topic, template_mt);
                    relevant_predicates = union(predicates, relevant_predicates, symbol_function(EQUAL), UNPROVIDED);
                }
            }
            return relevant_predicates;
        }
    }

    /**
     * Returns a list of predicates that can be used to research about a term over
     * the Web and then add GAFs, depending upon COLLECTION that the term is an
     * instance of.
     */
    public static final SubLObject term_learner_preds_for_collections(SubLObject collections) {
        {
            SubLObject result_preds = NIL;
            SubLObject cdolist_list_var = collections;
            SubLObject collection = NIL;
            for (collection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collection = cdolist_list_var.first()) {
                {
                    SubLObject fet_topic_tuples = formula_template_utilities.applicable_template_topics_for_collection(collection, UNPROVIDED);
                    SubLObject cdolist_list_var_1 = fet_topic_tuples;
                    SubLObject fet_topic_tuple = NIL;
                    for (fet_topic_tuple = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , fet_topic_tuple = cdolist_list_var_1.first()) {
                        if (third(fet_topic_tuple).equal($$isa)) {
                            {
                                SubLObject template_topic = fet_topic_tuple.first();
                                SubLObject template_mt = second(fet_topic_tuple);
                                SubLObject predicates = term_learner_preds_in_fet_templates(template_topic, template_mt);
                                result_preds = nunion(predicates, result_preds, symbol_function(EQUAL), UNPROVIDED);
                            }
                        }
                    }
                }
            }
            return result_preds;
        }
    }

    /**
     * Checks if a partially bound GAF formed using the input binary predicate PRED
     * and ARG-BINDING in position ARG-POS is a WFF.
     *
     * @param PRED
     * 		predicate-p;  e.g. #$birthDate
     * @param ARG-BINDING;
     * 		e.g. #$YassirArafat
     * @param ARG-POS
     * 		positive-integer-p; can be either 1 or 2
     */
    public static final SubLObject term_learner_incomplete_binary_pred_gaf_wffP(SubLObject pred, SubLObject arg_binding, SubLObject arg_pos) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(pred, PREDICATE_P);
            SubLTrampolineFile.checkType(arg_pos, POSITIVE_INTEGER_P);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject pcase_var = arg_pos;
                            if (pcase_var.eql(ONE_INTEGER)) {
                                if (NIL != wff.el_wffP(listS(pred, arg_binding, $list_alt9), UNPROVIDED, UNPROVIDED)) {
                                    result = T;
                                }
                            } else
                                if (pcase_var.eql(TWO_INTEGER)) {
                                    if (NIL != wff.el_wffP(list(pred, $sym10$_X, arg_binding), UNPROVIDED, UNPROVIDED)) {
                                        result = T;
                                    }
                                }

                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * An experimental MT where some assertions are made related to the TERM that we
     * are researching.  Currently, it is initialized to
     * #$TermLearner-ExperimentalMt.
     */
    public static final SubLObject term_learner_mt() {
        return constants_high.find_constant_by_guid(Guids.string_to_guid($str_alt11$76d51f32_7567_41d9_9dbb_a7545ed40));
    }

    /**
     * Returns the different lists of preds after classifying them depending upon
     * the method for GAF gathering to be used.
     *
     * @param PREDS
     * 		listp;  e.g. (#$titleOfPerson #$birthDate #$maritalStatus)
     * @return DEF-PREDS listp; list of preds that must use definitional strings
    VERIFY-PREDS listp; list of preds that must use only verification
    SEARCH-VERIFY-PREDS listp; list of preds that must use web-search and
    verification
     */
    public static final SubLObject term_learner_pred_classes(SubLObject preds) {
        {
            SubLObject def_preds = NIL;
            SubLObject verify_preds = NIL;
            SubLObject search_verify_preds = NIL;
            SubLObject cdolist_list_var = preds;
            SubLObject pred = NIL;
            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                {
                    SubLObject pred_gg_methods = ask_utilities.query_variable($sym12$_METHOD, listS($$predicateGAFGatheringMethod, pred, $list_alt14), term_learner_mt(), UNPROVIDED);
                    SubLObject cdolist_list_var_2 = pred_gg_methods;
                    SubLObject pred_gg_method = NIL;
                    for (pred_gg_method = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , pred_gg_method = cdolist_list_var_2.first()) {
                        {
                            SubLObject pcase_var = second(pred_gg_method);
                            if (pcase_var.eql($VERIFY)) {
                                verify_preds = cons(pred, verify_preds);
                            } else
                                if (pcase_var.eql($SEARCH)) {
                                    search_verify_preds = cons(pred, search_verify_preds);
                                } else {
                                    def_preds = cons(pred, def_preds);
                                }

                        }
                    }
                }
            }
            return values(def_preds, verify_preds, search_verify_preds);
        }
    }

    /**
     * Add isa-assertions for the term INSTANCE in the microtheory MT.
     */
    public static final SubLObject term_learner_add_isas_for_term(SubLObject instance, SubLObject mt, SubLObject cols, SubLObject sent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject collections = second(cols);
                if (!collections.isList()) {
                    collections = NIL;
                    Errors.warn($str_alt17$No_ISAs_asserted__The_type_of__A_, instance);
                }
                {
                    SubLObject cdolist_list_var = collections;
                    SubLObject collection = NIL;
                    for (collection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collection = cdolist_list_var.first()) {
                        {
                            SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                            try {
                                api_control_vars.$the_cyclist$.bind($$CycTermLearner, thread);
                                {
                                    SubLObject isa_assertion = list($$isa, instance, collection);
                                    rkf_assertion_utilities.rkf_assert_with_implicature(isa_assertion, mt, $NOW);
                                    rkf_assertion_utilities.rkf_assert_with_implicature(list(generate_gafs.gg_meta_assert_predicate(), list($$ist, mt, isa_assertion), TWO_INTEGER, sent), mt, $NOW);
                                }
                            } finally {
                                api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return mt;
        }
    }

    public static final SubLObject kill_incomplete_terms(SubLObject user) {
        if (user == UNPROVIDED) {
            user = api_control_vars.$the_cyclist$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                try {
                    api_control_vars.$the_cyclist$.bind(user, thread);
                    {
                        SubLObject cdolist_list_var = gather_incomplete_terms();
                        SubLObject v_term = NIL;
                        for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                            ke.ke_kill(v_term);
                        }
                    }
                } finally {
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject gather_incomplete_terms() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject incomplete = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$InferencePSC);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject pred_var = $$inProgressTerm;
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        {
                                                            SubLObject done_var_3 = NIL;
                                                            SubLObject token_var_4 = NIL;
                                                            while (NIL == done_var_3) {
                                                                {
                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
                                                                    SubLObject valid_5 = makeBoolean(token_var_4 != ass);
                                                                    if (NIL != valid_5) {
                                                                        if (NIL == non_trivial_assertions(cycl_utilities.formula_arg1(ass, UNPROVIDED))) {
                                                                            incomplete = cons(cycl_utilities.formula_arg1(ass, UNPROVIDED), incomplete);
                                                                        }
                                                                    }
                                                                    done_var_3 = makeBoolean(NIL == valid_5);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
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
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return incomplete;
            }
        }
    }

    public static final SubLObject non_trivial_assertions(SubLObject v_term) {
        {
            SubLObject asserts = NIL;
            if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                {
                    SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
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
                                            SubLObject done_var_7 = NIL;
                                            SubLObject token_var_8 = NIL;
                                            while (NIL == done_var_7) {
                                                {
                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_8);
                                                    SubLObject valid_9 = makeBoolean(token_var_8 != ass);
                                                    if (NIL != valid_9) {
                                                        if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec)) {
                                                            if (!(((assertions_high.assertion_formula(ass).equalp(listS($$isa, v_term, $list_alt24)) || assertions_high.assertion_formula(ass).equalp(listS($$isa, v_term, $list_alt25))) || cycl_utilities.formula_arg0(ass).equalp($$inProgressTerm)) || cycl_utilities.formula_arg0(ass).equalp($$termString))) {
                                                                asserts = cons(ass, asserts);
                                                            }
                                                        }
                                                    }
                                                    done_var_7 = makeBoolean(NIL == valid_9);
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
            return asserts;
        }
    }

    /**
     * Adds a number of GAFs using DEF-PREDS and CycL terms that can be found
     * corresponding to DEFINITIONS for INSTANCE.
     *
     * @param INSTANCE;
     * 		e.g. #$YassirArafat
     * @param DEF-PREDS;
     * 		e.g. (#$titleOfPerson #$ethnicity)
     * @param DEFINITIONS;
     * 		e.g. ("Prof." "French diplomat")
     */
    public static final SubLObject get_info_on_cyc_term_via_definitions(SubLObject instance, SubLObject def_preds, SubLObject definitions) {
        {
            SubLObject cdolist_list_var = def_preds;
            SubLObject pred = NIL;
            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                {
                    SubLObject incomplete_gaf = NIL;
                    if (NIL != term_learner_incomplete_binary_pred_gaf_wffP(pred, instance, ONE_INTEGER)) {
                        incomplete_gaf = listS(pred, instance, $list_alt9);
                    } else
                        if (NIL != term_learner_incomplete_binary_pred_gaf_wffP(pred, instance, TWO_INTEGER)) {
                            incomplete_gaf = list(pred, $sym10$_X, instance);
                        }

                    if (NIL != incomplete_gaf) {
                        generate_gafs.add_gafs_using_definitions(incomplete_gaf, definitions, term_learner_mt());
                    }
                }
            }
        }
        return instance;
    }

    /**
     * Adds a number of GAFs using predicates that are present in FET templates
     * relevant to INSTANCE.
     *
     * @param INSTANCE;
     * 		e.g. #$YassirArafat
     */
    public static final SubLObject get_info_on_cyc_term_via_web_search(SubLObject instance, SubLObject preds, SubLObject mt) {
        if (preds == UNPROVIDED) {
            preds = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = generate_gafs.gaf_gathering_paraphrase_mt();
        }
        {
            SubLObject predicates = (NIL != preds) ? ((SubLObject) (preds)) : term_learner_preds_for_term(instance);
            SubLObject cdolist_list_var = predicates;
            SubLObject predicate = NIL;
            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                if (NIL != term_learner_incomplete_binary_pred_gaf_wffP(predicate, instance, ONE_INTEGER)) {
                    generate_gafs.add_gafs_using_text_corpus(listS(predicate, instance, $list_alt9), NIL, mt, T);
                }
                if (NIL != term_learner_incomplete_binary_pred_gaf_wffP(predicate, instance, TWO_INTEGER)) {
                    generate_gafs.add_gafs_using_text_corpus(list(predicate, $sym10$_X, instance), NIL, mt, T);
                }
            }
        }
        return instance;
    }

    /**
     * Creates complete GAFs by using all the CycL terms that can bind to the
     * EL-variable in a partially bound GAF (formed using a predicate in PREDS, and
     * INSTANCE).  Then the search-strings are generated and if there are any Google
     * hits, the GAF is added to the Cyc KB.
     *
     * @param INSTANCE;
     * 		e.g. #$YassirArafat
     * @param DEF-PREDS;
     * 		e.g. (#$maritalStatus)
     */
    public static final SubLObject get_info_on_cyc_term_via_web_verification(SubLObject instance, SubLObject preds) {
        {
            SubLObject cdolist_list_var = preds;
            SubLObject pred = NIL;
            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                {
                    SubLObject incomplete_gaf = NIL;
                    if (NIL != term_learner_incomplete_binary_pred_gaf_wffP(pred, instance, ONE_INTEGER)) {
                        incomplete_gaf = listS(pred, instance, $list_alt9);
                    } else
                        if (NIL != term_learner_incomplete_binary_pred_gaf_wffP(pred, instance, TWO_INTEGER)) {
                            incomplete_gaf = list(pred, $sym10$_X, instance);
                        }

                    if (NIL != incomplete_gaf) {
                        generate_gafs.add_gafs_using_web_verification(incomplete_gaf, term_learner_mt());
                    }
                }
            }
        }
        return instance;
    }

    /**
     * Performs research about term over the Web and determines what it is an
     * instance of.  Then finds or creates a CycL term related to TERM and uses
     * GET-INFO-ON-CYC-TERM-VIA-WEB.
     *
     * @param TERM
     * 		stringp; e.g. "Yasser Arafat"
     */
    public static final SubLObject get_info_on_term_via_web(SubLObject v_term, SubLObject mt, SubLObject tightened_onlyP) {
        if (mt == UNPROVIDED) {
            mt = term_learner_mt();
        }
        if (tightened_onlyP == UNPROVIDED) {
            tightened_onlyP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, STRINGP);
            {
                SubLObject sentences = term_learner_web_sentences_with_term(v_term);
                SubLObject relevant_preds = NIL;
                SubLObject constraining_collection = NIL;
                SubLObject types_tightened = NIL;
                SubLObject def_strings = NIL;
                SubLObject sent_cols = NIL;
                {
                    SubLObject cdolist_list_var = sentences;
                    SubLObject sentence = NIL;
                    for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                        thread.resetMultipleValues();
                        {
                            SubLObject collections = cure_api.term_learner_collections_for_term_in_sentence(sentence, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject definitions = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            def_strings = union(def_strings, definitions, symbol_function(EQUAL), UNPROVIDED);
                            if (NIL != collections) {
                                sent_cols = cons(list(sentence, collections), sent_cols);
                            }
                            {
                                SubLObject relevant_collections = second(collections);
                                if (!relevant_collections.isList()) {
                                    Errors.warn($str_alt28$There_are_more_than_one_constrain, v_term);
                                    return NIL;
                                }
                                if (NIL != constraining_collection) {
                                    if (NIL != relevant_collections) {
                                        constraining_collection = collections.first();
                                        {
                                            SubLObject item_var = collections.first();
                                            if (NIL == member(item_var, types_tightened, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                types_tightened = cons(item_var, types_tightened);
                                            }
                                        }
                                    }
                                } else {
                                    constraining_collection = collections.first();
                                }
                                if (NIL != tightened_onlyP) {
                                    collections = relevant_collections;
                                } else {
                                    if (NIL != constraining_collection) {
                                        collections = cons(constraining_collection, relevant_collections);
                                    }
                                }
                                relevant_preds = union(relevant_preds, term_learner_preds_for_collections(collections), symbol_function(EQUAL), UNPROVIDED);
                            }
                        }
                    }
                }
                if (length(types_tightened).numG(ONE_INTEGER)) {
                    Errors.warn($str_alt28$There_are_more_than_one_constrain, v_term);
                } else {
                    {
                        SubLObject instance = term_learner_find_or_create_instance(v_term, constraining_collection, mt, UNPROVIDED);
                        SubLObject cdolist_list_var = sent_cols;
                        SubLObject sent_cols_pair = NIL;
                        for (sent_cols_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sent_cols_pair = cdolist_list_var.first()) {
                            {
                                SubLObject sent = sent_cols_pair.first();
                                SubLObject cols = second(sent_cols_pair);
                                term_learner_add_isas_for_term(instance, mt, cols, sent);
                            }
                        }
                        thread.resetMultipleValues();
                        {
                            SubLObject def_preds = term_learner_pred_classes(relevant_preds);
                            SubLObject verify_preds = thread.secondMultipleValue();
                            SubLObject search_verify_preds = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            get_info_on_cyc_term_via_definitions(instance, def_preds, def_strings);
                            get_info_on_cyc_term_via_web_search(instance, search_verify_preds, UNPROVIDED);
                            get_info_on_cyc_term_via_web_verification(instance, verify_preds);
                        }
                    }
                }
                return types_tightened;
            }
        }
    }

    /**
     * Finds facts about INSTANCE and asserts them in the KB.  Assertions that are
     * obtained via definitional-strings and web-verification are added to the input
     * microtheory MT.  Also, the isa-assertions are made in MT.
     *
     * @param TERM;
     * 		a CycL term, e.g. #$YassirArafat
     */
    public static final SubLObject get_info_on_cyc_term_via_web(SubLObject instance, SubLObject mt, SubLObject preds) {
        if (mt == UNPROVIDED) {
            mt = term_learner_mt();
        }
        if (preds == UNPROVIDED) {
            preds = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relevant_preds = union(preds, term_learner_preds_for_term(instance), UNPROVIDED, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject def_preds = term_learner_pred_classes(relevant_preds);
                    SubLObject verify_preds = thread.secondMultipleValue();
                    SubLObject search_verify_preds = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != def_preds) {
                        {
                            SubLObject def_strings = NIL;
                            SubLObject cdolist_list_var = pph_methods_lexicon.all_phrases_for_term(instance, $list_alt29, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED_SYM);
                            SubLObject v_term = NIL;
                            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                {
                                    SubLObject cdolist_list_var_10 = term_learner_web_sentences_with_term(v_term);
                                    SubLObject sent = NIL;
                                    for (sent = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , sent = cdolist_list_var_10.first()) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject collections = cure_api.term_learner_collections_for_term_in_sentence(sent, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            SubLObject definitions = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            term_learner_add_isas_for_term(instance, mt, collections, sent);
                                            def_strings = union(def_strings, definitions, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                            get_info_on_cyc_term_via_definitions(instance, def_preds, def_strings);
                        }
                    }
                    get_info_on_cyc_term_via_web_search(instance, search_verify_preds, UNPROVIDED);
                    get_info_on_cyc_term_via_web_verification(instance, verify_preds);
                }
            }
            return instance;
        }
    }

    /**
     * Performs research about term over the Web and determines what it is an
     * instance of.
     *
     * @param TERM
     * 		stringp; e.g. "Yasser Arafat"
     */
    public static final SubLObject term_learner_collections_for_term(SubLObject v_term, SubLObject tightened_onlyP) {
        if (tightened_onlyP == UNPROVIDED) {
            tightened_onlyP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, STRINGP);
            {
                SubLObject sentences = term_learner_web_sentences_with_term(v_term);
                SubLObject constraining_collection = NIL;
                SubLObject types_tightened = NIL;
                SubLObject collections_all = NIL;
                SubLObject cdolist_list_var = sentences;
                SubLObject sentence = NIL;
                for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject collections = cure_api.term_learner_collections_for_term_in_sentence(sentence, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject definitions = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject relevant_collections = second(collections);
                            if (relevant_collections.isList()) {
                                if (NIL != constraining_collection) {
                                    if (NIL != relevant_collections) {
                                        constraining_collection = collections.first();
                                        {
                                            SubLObject item_var = collections.first();
                                            if (NIL == member(item_var, types_tightened, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                types_tightened = cons(item_var, types_tightened);
                                            }
                                        }
                                    }
                                } else {
                                    constraining_collection = collections.first();
                                }
                                if (NIL != tightened_onlyP) {
                                    collections = relevant_collections;
                                } else {
                                    if (NIL != constraining_collection) {
                                        collections = cons(constraining_collection, relevant_collections);
                                    }
                                }
                                collections_all = union(collections_all, collections, symbol_function(EQUAL), UNPROVIDED);
                            } else {
                                Errors.warn($str_alt30$There_are_more_than_one_constrain, v_term, sentence);
                            }
                        }
                    }
                }
                if (length(types_tightened).numG(ONE_INTEGER)) {
                    Errors.warn($str_alt31$There_are_more_than_one_constrain);
                }
                return collections_all;
            }
        }
    }

    /**
     * Tries to find an instance of CONSTRAINING-COLLECTION that has a name-string
     * STRING.  If it is not found, then such an instance is created and all
     * assertions related to this new constant are made in MT.
     */
    public static final SubLObject term_learner_find_or_create_instance(SubLObject string, SubLObject constraining_collection, SubLObject mt, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = cure_api.$term_learner_default_lexical_assertion_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(string, STRINGP);
            if (NIL != narts_high.naut_p(constraining_collection)) {
                constraining_collection = czer_main.cyc_find_or_create_nart(constraining_collection, UNPROVIDED);
            }
            if (NIL != narts_high.naut_p(mt)) {
                mt = czer_main.cyc_find_or_create_nart(mt, UNPROVIDED);
            }
            {
                SubLObject instance = second(api_widgets.get_constrained_cycl_for_string_int(string, constraining_collection, term_learner_mt(), cure_api.term_learner_default_generation_mt(), lexical_mt, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first());
                if (NIL == instance) {
                    Errors.warn($str_alt32$Could_not_find_CycL_for__A_as_an_, string, constraining_collection);
                    {
                        SubLObject instance_name = string_utilities.remove_substring(string, $str_alt33$_);
                        {
                            SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                            try {
                                api_control_vars.$the_cyclist$.bind($$CycTermLearner, thread);
                                instance = rkf_term_utilities.create_new_constant(instance_name, list(constraining_collection), NIL, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != constant_handles.valid_constantP($$DocIngesterUserCreatedTerm, UNPROVIDED)) {
                                    rkf_assertion_utilities.rkf_assert(listS($$quotedIsa, instance, $list_alt36), $$BaseKB, UNPROVIDED, UNPROVIDED);
                                }
                                cure_api.term_learner_assert_lexical_info(instance, string, mt, lexical_mt, UNPROVIDED);
                            } finally {
                                api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return instance;
            }
        }
    }

    /**
     * Tries to get information about the named-entity TERM by translating relevant
     * sentences found over the Web into CycL (using the cyclifier).
     *
     * @param TERM
     * 		stringp; e.g. "Yasser Arafat"
     * @param TERM-TYPE;
     * 		a collection that the TERM is an instance of, e.g. #$Person
     * @param DOMAIN-MT;
     * 		an MT where the TERM is/should be an instance of TERM-TYPE,
     * 		e.g. #$TermLearner-ExperimentalMt
     */
    public static final SubLObject get_info_on_term_via_cyclifier(SubLObject v_term, SubLObject term_type, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, STRINGP);
            SubLTrampolineFile.checkType(term_type, $sym38$ISA_COLLECTION_);
            SubLTrampolineFile.checkType(domain_mt, $sym39$ISA_MT_);
            {
                SubLObject instance = term_learner_find_or_create_instance(v_term, term_type, domain_mt, UNPROVIDED);
                thread.resetMultipleValues();
                {
                    SubLObject sents = term_learner_web_sentences_with_term(v_term);
                    SubLObject url_sent_pairs = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject cdolist_list_var = url_sent_pairs;
                        SubLObject url_sent_pair = NIL;
                        for (url_sent_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , url_sent_pair = cdolist_list_var.first()) {
                            {
                                SubLObject url = url_sent_pair.first();
                                SubLObject sentences = second(url_sent_pair);
                                SubLObject cdolist_list_var_11 = sentences;
                                SubLObject sentence = NIL;
                                for (sentence = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , sentence = cdolist_list_var_11.first()) {
                                    {
                                        SubLObject cycls = cyclifier.cyclify(sentence, UNPROVIDED);
                                        SubLObject translations = (NIL != cycls) ? ((SubLObject) (generate_gafs.translations_in_butler_spindle(length(cycls)))) : NIL;
                                        SubLObject cycl = NIL;
                                        SubLObject cycl_12 = NIL;
                                        SubLObject translation = NIL;
                                        SubLObject translation_13 = NIL;
                                        for (cycl = cycls, cycl_12 = cycl.first(), translation = translations, translation_13 = translation.first(); !((NIL == translation) && (NIL == cycl)); cycl = cycl.rest() , cycl_12 = cycl.first() , translation = translation.rest() , translation_13 = translation.first()) {
                                            if (NIL != cycl_utilities.expression_find(instance, cycl_12, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                {
                                                    SubLObject content_mt = generate_gafs.assert_mt_in_butler_spindle(url, translation_13);
                                                    {
                                                        SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                                                        try {
                                                            api_control_vars.$the_cyclist$.bind($$CycTermLearner, thread);
                                                            rkf_assertion_utilities.rkf_assert_with_implicature(cycl_12, content_mt, $NOW);
                                                            rkf_assertion_utilities.rkf_assert_with_implicature(list($$stringIsRepresentedByAssertion, sentence, list($$ist, content_mt, cycl_12)), content_mt, $NOW);
                                                        } finally {
                                                            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
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
                return instance;
            }
        }
    }

    // defparameter
    private static final SubLSymbol $term_learner_tighten_type_test_input_files$ = makeSymbol("*TERM-LEARNER-TIGHTEN-TYPE-TEST-INPUT-FILES*");

    // defparameter
    private static final SubLSymbol $term_learner_tighten_type_test_log_file$ = makeSymbol("*TERM-LEARNER-TIGHTEN-TYPE-TEST-LOG-FILE*");

    /**
     * Test the tighten-type for a single sentence SENTENCE using NER as the
     * named-entity recognizer.
     */
    public static final SubLObject term_learner_tighten_type_sentence_test(SubLObject sentence, SubLObject ner, SubLObject out_stream) {
        if (out_stream == UNPROVIDED) {
            out_stream = NIL;
        }
        if (NIL != string_utilities.empty_string_p(sentence)) {
            return NIL;
        }
        if (NIL != out_stream) {
            format(out_stream, $str_alt43$_A_A, sentence, CHAR_tab);
        }
        {
            SubLObject entity_clusters = methods.funcall_instance_method_with_1_args(ner, RUN, sentence);
            SubLObject named_entity_strings = NIL;
            SubLObject sent_tighter_types = NIL;
            SubLObject tightened_named_entity_strings = NIL;
            SubLObject cdolist_list_var = entity_clusters;
            SubLObject entity_cluster = NIL;
            for (entity_cluster = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entity_cluster = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_14 = entity_cluster;
                    SubLObject named_entity = NIL;
                    for (named_entity = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , named_entity = cdolist_list_var_14.first()) {
                        if (!O.eql(methods.funcall_instance_method_with_0_args(named_entity, GET_TYPE))) {
                            {
                                SubLObject type = methods.funcall_instance_method_with_0_args(named_entity, GET_CYC);
                                SubLObject string = methods.funcall_instance_method_with_0_args(named_entity, GET_STRING);
                                if (NIL != type) {
                                    {
                                        SubLObject item_var = string;
                                        if (NIL == member(item_var, named_entity_strings, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            named_entity_strings = cons(item_var, named_entity_strings);
                                        }
                                    }
                                    {
                                        SubLObject tighter_types = methods.funcall_instance_method_with_0_args(named_entity, TIGHTEN_TYPE).first();
                                        if (NIL != tighter_types) {
                                            {
                                                SubLObject item_var = tighter_types;
                                                if (NIL == member(item_var, sent_tighter_types, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    sent_tighter_types = cons(item_var, sent_tighter_types);
                                                }
                                            }
                                            {
                                                SubLObject item_var = string;
                                                if (NIL == member(item_var, tightened_named_entity_strings, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    tightened_named_entity_strings = cons(item_var, tightened_named_entity_strings);
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
            if (NIL != out_stream) {
                format(out_stream, $str_alt50$_A_A_A__, new SubLObject[]{ named_entity_strings, CHAR_tab, sent_tighter_types });
            }
            return values(named_entity_strings, sent_tighter_types, tightened_named_entity_strings);
        }
    }

    public static final SubLObject write_metrics(SubLObject metrics, SubLObject out_stream) {
        format(out_stream, $str_alt51$_A, metrics.first());
        {
            SubLObject cdolist_list_var = metrics.rest();
            SubLObject metric = NIL;
            for (metric = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , metric = cdolist_list_var.first()) {
                format(out_stream, $str_alt43$_A_A, CHAR_tab, metric);
            }
        }
        format(out_stream, $str_alt52$__);
        return T;
    }

    public static final SubLObject term_learner_tighten_type_metrics(SubLObject in_file, SubLObject out_stream1, SubLObject out_stream2) {
        if (out_stream1 == UNPROVIDED) {
            out_stream1 = T;
        }
        if (out_stream2 == UNPROVIDED) {
            out_stream2 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ner = object.new_class_instance(STANFORD_NER);
                SubLObject num_sentences = ZERO_INTEGER;
                SubLObject time_taken = NIL;
                SubLObject named_entities = NIL;
                SubLObject all_tighter_types = NIL;
                SubLObject tightened_named_entities = NIL;
                SubLObject time_var = get_internal_real_time();
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(in_file, $INPUT, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt55$Unable_to_open__S, in_file);
                        }
                        {
                            SubLObject infile = stream;
                            if (infile.isStream()) {
                                {
                                    SubLObject sentence = NIL;
                                    for (sentence = read_line(infile, NIL, NIL, UNPROVIDED); NIL != sentence; sentence = read_line(infile, NIL, NIL, UNPROVIDED)) {
                                        num_sentences = number_utilities.f_1X(num_sentences);
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject named_entity_strings = term_learner_tighten_type_sentence_test(sentence, ner, out_stream2);
                                            SubLObject sent_tighter_types = thread.secondMultipleValue();
                                            SubLObject tightened_named_entity_strings = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            named_entities = union(named_entities, named_entity_strings, symbol_function(EQUAL), UNPROVIDED);
                                            if (NIL != sent_tighter_types) {
                                                all_tighter_types = cconcatenate(all_tighter_types, sent_tighter_types);
                                            }
                                            if (NIL != tightened_named_entity_strings) {
                                                tightened_named_entities = union(tightened_named_entities, tightened_named_entity_strings, symbol_function(EQUAL), UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                time_taken = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                write_metrics(list(numeric_date_utilities.universal_timestring(UNPROVIDED), in_file, time_taken, num_sentences, length(named_entities), length(all_tighter_types), length(tightened_named_entities)), out_stream1);
                return time_taken;
            }
        }
    }

    public static final SubLObject term_learner_tighten_type_metrics_with_sentencify(SubLObject in_file, SubLObject out_stream1, SubLObject out_stream2) {
        if (out_stream1 == UNPROVIDED) {
            out_stream1 = T;
        }
        if (out_stream2 == UNPROVIDED) {
            out_stream2 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentences = document.sentencify_file(in_file);
                SubLObject ner = object.new_class_instance(STANFORD_NER);
                SubLObject named_entities = NIL;
                SubLObject all_tighter_types = NIL;
                SubLObject tightened_named_entities = NIL;
                SubLObject time_taken = NIL;
                SubLObject time_var = get_internal_real_time();
                {
                    SubLObject cdolist_list_var = sentences;
                    SubLObject sentence = NIL;
                    for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                        thread.resetMultipleValues();
                        {
                            SubLObject named_entity_strings = term_learner_tighten_type_sentence_test(sentence, ner, out_stream2);
                            SubLObject sent_tighter_types = thread.secondMultipleValue();
                            SubLObject tightened_named_entity_strings = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            named_entities = union(named_entities, named_entity_strings, symbol_function(EQUAL), UNPROVIDED);
                            if (NIL != sent_tighter_types) {
                                all_tighter_types = cconcatenate(all_tighter_types, sent_tighter_types);
                            }
                            if (NIL != tightened_named_entity_strings) {
                                tightened_named_entities = union(tightened_named_entities, tightened_named_entity_strings, symbol_function(EQUAL), UNPROVIDED);
                            }
                        }
                    }
                }
                time_taken = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                write_metrics(list(numeric_date_utilities.universal_timestring(UNPROVIDED), in_file, time_taken, length(sentences), length(named_entities), length(all_tighter_types), length(tightened_named_entities)), out_stream1);
                return time_taken;
            }
        }
    }

    public static final SubLObject term_learner_tighten_type_test(SubLObject sentencifyP, SubLObject input_files, SubLObject log_file, SubLObject output_files) {
        if (sentencifyP == UNPROVIDED) {
            sentencifyP = NIL;
        }
        if (input_files == UNPROVIDED) {
            input_files = $term_learner_tighten_type_test_input_files$.getDynamicValue();
        }
        if (log_file == UNPROVIDED) {
            log_file = $term_learner_tighten_type_test_log_file$.getDynamicValue();
        }
        if (output_files == UNPROVIDED) {
            output_files = NIL;
        }
        if (((NIL != output_files) && log_file.isString()) && (NIL != list_utilities.string_list_p(output_files))) {
            {
                SubLObject input_file = NIL;
                SubLObject input_file_15 = NIL;
                SubLObject output_file = NIL;
                SubLObject output_file_16 = NIL;
                for (input_file = input_files, input_file_15 = input_file.first(), output_file = output_files, output_file_16 = output_file.first(); !((NIL == output_file) && (NIL == input_file)); input_file = input_file.rest() , input_file_15 = input_file.first() , output_file = output_file.rest() , output_file_16 = output_file.first()) {
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(log_file, $APPEND, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt55$Unable_to_open__S, log_file);
                            }
                            {
                                SubLObject log = stream;
                                SubLObject stream_17 = NIL;
                                try {
                                    stream_17 = compatibility.open_text(output_file_16, $OUTPUT, NIL);
                                    if (!stream_17.isStream()) {
                                        Errors.error($str_alt55$Unable_to_open__S, output_file_16);
                                    }
                                    {
                                        SubLObject s_out = stream_17;
                                        if (NIL != sentencifyP) {
                                            term_learner_tighten_type_metrics_with_sentencify(input_file_15, log, s_out);
                                        } else {
                                            term_learner_tighten_type_metrics(input_file_15, log, s_out);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            if (stream_17.isStream()) {
                                                close(stream_17, UNPROVIDED);
                                            }
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                        }
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    if (stream.isStream()) {
                                        close(stream, UNPROVIDED);
                                    }
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    }
                }
            }
        } else
            if (log_file.isString()) {
                {
                    SubLObject cdolist_list_var = input_files;
                    SubLObject input_file = NIL;
                    for (input_file = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , input_file = cdolist_list_var.first()) {
                        {
                            SubLObject stream = NIL;
                            try {
                                stream = compatibility.open_text(log_file, $APPEND, NIL);
                                if (!stream.isStream()) {
                                    Errors.error($str_alt55$Unable_to_open__S, log_file);
                                }
                                {
                                    SubLObject log = stream;
                                    if (NIL != sentencifyP) {
                                        term_learner_tighten_type_metrics_with_sentencify(input_file, log, UNPROVIDED);
                                    } else {
                                        term_learner_tighten_type_metrics(input_file, log, UNPROVIDED);
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                    try {
                                        bind($is_thread_performing_cleanupP$, T);
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                    } finally {
                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                    }
                                }
                            }
                        }
                    }
                }
            } else
                if ((NIL != output_files) && (NIL != list_utilities.string_list_p(output_files))) {
                    {
                        SubLObject input_file = NIL;
                        SubLObject input_file_18 = NIL;
                        SubLObject output_file = NIL;
                        SubLObject output_file_19 = NIL;
                        for (input_file = input_files, input_file_18 = input_file.first(), output_file = output_files, output_file_19 = output_file.first(); !((NIL == output_file) && (NIL == input_file)); input_file = input_file.rest() , input_file_18 = input_file.first() , output_file = output_file.rest() , output_file_19 = output_file.first()) {
                            {
                                SubLObject stream = NIL;
                                try {
                                    stream = compatibility.open_text(output_file_19, $OUTPUT, NIL);
                                    if (!stream.isStream()) {
                                        Errors.error($str_alt55$Unable_to_open__S, output_file_19);
                                    }
                                    {
                                        SubLObject s_out = stream;
                                        if (NIL != sentencifyP) {
                                            term_learner_tighten_type_metrics_with_sentencify(input_file_18, T, s_out);
                                        } else {
                                            term_learner_tighten_type_metrics(input_file_18, T, s_out);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            if (stream.isStream()) {
                                                close(stream, UNPROVIDED);
                                            }
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = input_files;
                        SubLObject input_file = NIL;
                        for (input_file = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , input_file = cdolist_list_var.first()) {
                            if (NIL != sentencifyP) {
                                term_learner_tighten_type_metrics_with_sentencify(input_file, T, UNPROVIDED);
                            } else {
                                term_learner_tighten_type_metrics(input_file, T, UNPROVIDED);
                            }
                        }
                    }
                }


        return log_file;
    }

    /**
     * Returns a list of sentences found in search-engine results that contain
     * TERM.
     *
     * @param TERM
     * 		stringp; e.g. "Narain Karthikeyan"
     * @unknown SENTENCES listp; e.g. ("NARAIN KARTHIKEYAN IN HIS GLORIOUS
    MOMENTS" ...)
     */
    public static final SubLObject term_learner_web_sentences_with_term(SubLObject v_term) {
        SubLTrampolineFile.checkType(v_term, STRINGP);
        {
            SubLObject search_results = generate_gafs.search_engine_results(string_utilities.quote_string(v_term, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            SubLObject relevant_sentences = NIL;
            SubLObject url_sentences_pairs = NIL;
            SubLObject cdolist_list_var = search_results;
            SubLObject search_result = NIL;
            for (search_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , search_result = cdolist_list_var.first()) {
                {
                    SubLObject text = search_result.first();
                    SubLObject url = fifth(search_result);
                    SubLObject sentences = document.sentencify_string(text);
                    SubLObject current_relevant_sentences = cure_api.term_learner_relevant_sentences(sentences, v_term);
                    relevant_sentences = union(relevant_sentences, current_relevant_sentences, symbol_function(EQUAL), UNPROVIDED);
                    url_sentences_pairs = cons(list(url, current_relevant_sentences), url_sentences_pairs);
                }
            }
            return values(relevant_sentences, url_sentences_pairs);
        }
    }

    public static final SubLObject test_term_learner_on_sentences(SubLObject sentences_and_terms) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = sentences_and_terms;
            SubLObject sentence_and_terms = NIL;
            for (sentence_and_terms = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence_and_terms = cdolist_list_var.first()) {
                {
                    SubLObject datum = sentence_and_terms;
                    SubLObject current = datum;
                    SubLObject sentence = NIL;
                    SubLObject terms = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt58);
                    sentence = current.first();
                    current = current.rest();
                    terms = current;
                    {
                        SubLObject cdolist_list_var_20 = terms;
                        SubLObject v_term = NIL;
                        for (v_term = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest() , v_term = cdolist_list_var_20.first()) {
                            result = cons(cconcatenate(list(sentence, v_term), cure_api.term_learner_collections_for_term_in_sentence(sentence, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED)), result);
                        }
                    }
                }
            }
            return result;
        }
    }

    public static final SubLObject term_learner_test_gg_input(SubLObject instance, SubLObject preds, SubLObject filename) {
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(filename, $APPEND, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt55$Unable_to_open__S, filename);
                }
                {
                    SubLObject s_out = stream;
                    SubLObject cdolist_list_var = preds;
                    SubLObject predicate = NIL;
                    for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                        if (NIL != term_learner_incomplete_binary_pred_gaf_wffP(predicate, instance, ONE_INTEGER)) {
                            format(s_out, $str_alt59$_S__, listS(predicate, instance, $list_alt9));
                        }
                        if (NIL != term_learner_incomplete_binary_pred_gaf_wffP(predicate, instance, TWO_INTEGER)) {
                            format(s_out, $str_alt59$_S__, list(predicate, $sym10$_X, instance));
                        }
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return instance;
    }

    public static final SubLObject term_learner_test_write_output(SubLObject stream, SubLObject v_term, SubLObject end_char) {
        if (NIL != stream) {
            format(stream, $str_alt60$_S_A, v_term, end_char);
        }
        return stream;
    }

    public static final SubLObject term_learner_test_int(SubLObject in_file, SubLObject log, SubLObject s_out) {
        if (s_out == UNPROVIDED) {
            s_out = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject time_taken = NIL;
                SubLObject num_terms = NIL;
                SubLObject num_cols = ZERO_INTEGER;
                SubLObject total_time_cols = ZERO_INTEGER;
                SubLObject gg_search_input_file = cconcatenate($str_alt61$_home_shah_Ginko_metrics_termLear, new SubLObject[]{ format_nil.format_nil_a_no_copy(numeric_date_utilities.universal_timestring(UNPROVIDED)), $str_alt62$_txt });
                SubLObject time_var = get_internal_real_time();
                {
                    SubLObject file_var = in_file;
                    SubLObject stream = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_text(file_var, $INPUT, NIL);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (!stream.isStream()) {
                            Errors.error($str_alt55$Unable_to_open__S, file_var);
                        }
                        {
                            SubLObject stream_var = stream;
                            if (stream_var.isStream()) {
                                {
                                    SubLObject stream_var_21 = stream_var;
                                    SubLObject line_no = NIL;
                                    SubLObject v_term = NIL;
                                    for (line_no = ZERO_INTEGER, v_term = read_line(stream_var_21, NIL, NIL, UNPROVIDED); NIL != v_term; line_no = number_utilities.f_1X(line_no) , v_term = read_line(stream_var_21, NIL, NIL, UNPROVIDED)) {
                                        {
                                            SubLObject cols = NIL;
                                            SubLObject time_cols = NIL;
                                            SubLObject preds = NIL;
                                            SubLObject instance = NIL;
                                            term_learner_test_write_output(s_out, v_term, CHAR_tab);
                                            num_terms = number_utilities.f_1X(line_no);
                                            {
                                                SubLObject time_var_22 = get_internal_real_time();
                                                cols = term_learner_collections_for_term(v_term, UNPROVIDED);
                                                time_cols = divide(subtract(get_internal_real_time(), time_var_22), time_high.$internal_time_units_per_second$.getGlobalValue());
                                            }
                                            total_time_cols = add(total_time_cols, time_cols);
                                            num_cols = add(num_cols, length(cols));
                                            term_learner_test_write_output(s_out, cols, CHAR_newline);
                                            preds = term_learner_preds_for_collections(cols);
                                            instance = term_learner_find_or_create_instance(v_term, $$Person, term_learner_mt(), UNPROVIDED);
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject def_preds = term_learner_pred_classes(preds);
                                                SubLObject verify_preds = thread.secondMultipleValue();
                                                SubLObject search_verify_preds = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                term_learner_test_gg_input(instance, search_verify_preds, gg_search_input_file);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                generate_gafs.gg_metrics(gg_search_input_file, log, s_out);
                time_taken = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                write_metrics(list(numeric_date_utilities.universal_timestring(UNPROVIDED), in_file, time_taken, num_terms, num_cols, total_time_cols), log);
                return num_terms;
            }
        }
    }

    public static final SubLObject term_learner_test(SubLObject input_file, SubLObject log_file, SubLObject output_file) {
        if (input_file == UNPROVIDED) {
            input_file = $str_alt64$_home_shah_Ginko_metrics_termLear;
        }
        if (log_file == UNPROVIDED) {
            log_file = $str_alt65$_home_shah_Ginko_metrics_termLear;
        }
        if (output_file == UNPROVIDED) {
            output_file = NIL;
        }
        if (log_file.isString() && output_file.isString()) {
            {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(log_file, $APPEND, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt55$Unable_to_open__S, log_file);
                    }
                    {
                        SubLObject log = stream;
                        SubLObject stream_23 = NIL;
                        try {
                            stream_23 = compatibility.open_text(output_file, $OUTPUT, NIL);
                            if (!stream_23.isStream()) {
                                Errors.error($str_alt55$Unable_to_open__S, output_file);
                            }
                            {
                                SubLObject s_out = stream_23;
                                term_learner_test_int(input_file, log, s_out);
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    if (stream_23.isStream()) {
                                        close(stream_23, UNPROVIDED);
                                    }
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
        } else
            if (log_file.isString()) {
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(log_file, $APPEND, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt55$Unable_to_open__S, log_file);
                        }
                        {
                            SubLObject log = stream;
                            term_learner_test_int(input_file, log, UNPROVIDED);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            } else
                if (output_file.isString()) {
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(output_file, $OUTPUT, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt55$Unable_to_open__S, output_file);
                            }
                            {
                                SubLObject s_out = stream;
                                term_learner_test_int(input_file, T, s_out);
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    if (stream.isStream()) {
                                        close(stream, UNPROVIDED);
                                    }
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    }
                } else {
                    term_learner_test_int(input_file, T, UNPROVIDED);
                }


        return log_file;
    }

    /**
     *
     *
     * @param EXPECTED-ANSWERS
     * 		a list of plists, each of which contains a selection-renderer that should be present
     * 		in the output.  The actual output selection-renderer is allowed to have additional key-value pairs that
     * 		are not present in the EXPECTED-ANSWERS, but everything in the EXPECTED-ANSWERS plist must be present in the
     * 		actual output.
     */
    public static final SubLObject term_learner_user_substitution_selection_renderer_test(SubLObject cycl_sentence, SubLObject new_string, SubLObject arg_pos_string, SubLObject expected_answers) {
        {
            SubLObject actual_answer = cure_api.term_learner_user_substitution(document_annotation_widgets.term_learner_id(cycl_sentence), new_string, arg_pos_string, $$$nil, UNPROVIDED, UNPROVIDED, UNPROVIDED_SYM, UNPROVIDED_SYM, UNPROVIDED_SYM);
            SubLObject selection_renderers = NIL;
            SubLObject failP = NIL;
            SubLObject cdolist_list_var = actual_answer;
            SubLObject answer_elt = NIL;
            for (answer_elt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , answer_elt = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_24 = getf(answer_elt, $SELECTION_RENDERERS, UNPROVIDED);
                    SubLObject possible_renderer = NIL;
                    for (possible_renderer = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest() , possible_renderer = cdolist_list_var_24.first()) {
                        if (NIL != getf(possible_renderer, $STRING, UNPROVIDED)) {
                            selection_renderers = cons(possible_renderer, selection_renderers);
                        }
                    }
                }
            }
            if (NIL == failP) {
                {
                    SubLObject csome_list_var = expected_answers;
                    SubLObject expected_answer = NIL;
                    for (expected_answer = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , expected_answer = csome_list_var.first()) {
                        {
                            SubLObject successP = NIL;
                            if (NIL == successP) {
                                {
                                    SubLObject csome_list_var_25 = selection_renderers;
                                    SubLObject renderer = NIL;
                                    for (renderer = csome_list_var_25.first(); !((NIL != successP) || (NIL == csome_list_var_25)); csome_list_var_25 = csome_list_var_25.rest() , renderer = csome_list_var_25.first()) {
                                        if (NIL != list_utilities.sub_plistP(expected_answer, renderer, EQUAL)) {
                                            successP = T;
                                        }
                                    }
                                }
                            }
                            if (NIL == successP) {
                                Errors.warn($str_alt69$failed_to_find__S_in__S, expected_answer, selection_renderers);
                                failP = T;
                            }
                        }
                    }
                }
            }
            return makeBoolean(NIL == failP);
        }
    }

    /**
     * is SENTENCE (or something equals-el? to it) returned as a followup for QUERY-TERM?
     */
    public static final SubLObject term_learner_get_followups_for_term_test(SubLObject query_term, SubLObject user, SubLObject sentence) {
        {
            SubLObject term_id = document_annotation_widgets.term_learner_id(query_term);
            SubLObject followups = cure_api.term_learner_get_followups_for_term(term_id, user, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return list_utilities.sublisp_boolean(subl_promotions.memberP(sentence, followups, $sym79$ELT_MATCHES_PATTERN_, GET_CYCLS));
        }
    }

    public static final SubLObject elt_equals_elP(SubLObject el, SubLObject list) {
        return subl_promotions.memberP(el, list, $sym81$EQUALS_EL_, UNPROVIDED);
    }

    public static final SubLObject elt_matches_patternP(SubLObject el, SubLObject list) {
        return subl_promotions.memberP(el, list, PATTERN_MATCHES_FORMULA, UNPROVIDED);
    }

    public static final SubLObject declare_term_learner_file() {
        declareFunction("term_learner_preds_in_fet_templates", "TERM-LEARNER-PREDS-IN-FET-TEMPLATES", 2, 0, false);
        declareFunction("term_learner_preds_for_term", "TERM-LEARNER-PREDS-FOR-TERM", 1, 0, false);
        declareFunction("term_learner_preds_for_collections", "TERM-LEARNER-PREDS-FOR-COLLECTIONS", 1, 0, false);
        declareFunction("term_learner_incomplete_binary_pred_gaf_wffP", "TERM-LEARNER-INCOMPLETE-BINARY-PRED-GAF-WFF?", 3, 0, false);
        declareFunction("term_learner_mt", "TERM-LEARNER-MT", 0, 0, false);
        declareFunction("term_learner_pred_classes", "TERM-LEARNER-PRED-CLASSES", 1, 0, false);
        declareFunction("term_learner_add_isas_for_term", "TERM-LEARNER-ADD-ISAS-FOR-TERM", 4, 0, false);
        declareFunction("kill_incomplete_terms", "KILL-INCOMPLETE-TERMS", 0, 1, false);
        declareFunction("gather_incomplete_terms", "GATHER-INCOMPLETE-TERMS", 0, 0, false);
        declareFunction("non_trivial_assertions", "NON-TRIVIAL-ASSERTIONS", 1, 0, false);
        declareFunction("get_info_on_cyc_term_via_definitions", "GET-INFO-ON-CYC-TERM-VIA-DEFINITIONS", 3, 0, false);
        declareFunction("get_info_on_cyc_term_via_web_search", "GET-INFO-ON-CYC-TERM-VIA-WEB-SEARCH", 1, 2, false);
        declareFunction("get_info_on_cyc_term_via_web_verification", "GET-INFO-ON-CYC-TERM-VIA-WEB-VERIFICATION", 2, 0, false);
        declareFunction("get_info_on_term_via_web", "GET-INFO-ON-TERM-VIA-WEB", 1, 2, false);
        declareFunction("get_info_on_cyc_term_via_web", "GET-INFO-ON-CYC-TERM-VIA-WEB", 1, 2, false);
        declareFunction("term_learner_collections_for_term", "TERM-LEARNER-COLLECTIONS-FOR-TERM", 1, 1, false);
        declareFunction("term_learner_find_or_create_instance", "TERM-LEARNER-FIND-OR-CREATE-INSTANCE", 3, 1, false);
        declareFunction("get_info_on_term_via_cyclifier", "GET-INFO-ON-TERM-VIA-CYCLIFIER", 3, 0, false);
        declareFunction("term_learner_tighten_type_sentence_test", "TERM-LEARNER-TIGHTEN-TYPE-SENTENCE-TEST", 2, 1, false);
        declareFunction("write_metrics", "WRITE-METRICS", 2, 0, false);
        declareFunction("term_learner_tighten_type_metrics", "TERM-LEARNER-TIGHTEN-TYPE-METRICS", 1, 2, false);
        declareFunction("term_learner_tighten_type_metrics_with_sentencify", "TERM-LEARNER-TIGHTEN-TYPE-METRICS-WITH-SENTENCIFY", 1, 2, false);
        declareFunction("term_learner_tighten_type_test", "TERM-LEARNER-TIGHTEN-TYPE-TEST", 0, 4, false);
        declareFunction("term_learner_web_sentences_with_term", "TERM-LEARNER-WEB-SENTENCES-WITH-TERM", 1, 0, false);
        declareFunction("test_term_learner_on_sentences", "TEST-TERM-LEARNER-ON-SENTENCES", 1, 0, false);
        declareFunction("term_learner_test_gg_input", "TERM-LEARNER-TEST-GG-INPUT", 3, 0, false);
        declareFunction("term_learner_test_write_output", "TERM-LEARNER-TEST-WRITE-OUTPUT", 3, 0, false);
        declareFunction("term_learner_test_int", "TERM-LEARNER-TEST-INT", 2, 1, false);
        declareFunction("term_learner_test", "TERM-LEARNER-TEST", 0, 3, false);
        declareFunction("term_learner_user_substitution_selection_renderer_test", "TERM-LEARNER-USER-SUBSTITUTION-SELECTION-RENDERER-TEST", 4, 0, false);
        declareFunction("term_learner_get_followups_for_term_test", "TERM-LEARNER-GET-FOLLOWUPS-FOR-TERM-TEST", 3, 0, false);
        declareFunction("elt_equals_elP", "ELT-EQUALS-EL?", 2, 0, false);
        declareFunction("elt_matches_patternP", "ELT-MATCHES-PATTERN?", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_term_learner_file() {
        defparameter("*TERM-LEARNER-TIGHTEN-TYPE-TEST-INPUT-FILES*", $list_alt41);
        defparameter("*TERM-LEARNER-TIGHTEN-TYPE-TEST-LOG-FILE*", $str_alt42$_home_shah_Ginko_metrics_tightenT);
        return NIL;
    }

    public static final SubLObject setup_term_learner_file() {
                generic_testing.define_test_case_table_int(TERM_LEARNER_USER_SUBSTITUTION_SELECTION_RENDERER_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt78);
        generic_testing.define_test_case_table_int(TERM_LEARNER_VALID_SUBSTITUTION, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt84);
        generic_testing.define_test_case_table_int(TERM_LEARNER_GET_FOLLOWUPS_FOR_TERM_TEST, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt86);
        generic_testing.define_test_case_table_int(TERM_LEARNER_MIN_ISA, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt88);
        generic_testing.define_test_case_table_int(TERM_LEARNER_MIN_GENLS, list(new SubLObject[]{ $TEST, $sym90$SETS_EQUAL_, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt91);
        generic_testing.define_test_case_table_int(TERM_LEARNER_CONSOLIDATE_JAVALIST_FOR_ARG_POSITIONS, list(new SubLObject[]{ $TEST, JAVALISTS_MORE_OR_LESS_EQUAL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt94);
        return NIL;
    }

    // // Internal Constants
    static private final SubLSymbol $sym0$_PRED = makeSymbol("?PRED");

    public static final SubLObject $$and = constant_handles.reader_make_constant_shell(makeString("and"));

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLSymbol $sym3$_TEMPLATE = makeSymbol("?TEMPLATE");

    static private final SubLList $list_alt4 = list(list(constant_handles.reader_make_constant_shell(makeString("formulaForFormulaTemplate")), makeSymbol("?TEMPLATE"), makeSymbol("?FORMULA")), list(constant_handles.reader_make_constant_shell(makeString("termFormulas")), makeSymbol("?PRED"), makeSymbol("?FORMULA")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?PRED"), constant_handles.reader_make_constant_shell(makeString("BinaryPredicate"))));







    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLList $list_alt9 = list(makeSymbol("?X"));

    static private final SubLSymbol $sym10$_X = makeSymbol("?X");

    static private final SubLString $str_alt11$76d51f32_7567_41d9_9dbb_a7545ed40 = makeString("76d51f32-7567-41d9-9dbb-a7545ed403f9");

    static private final SubLSymbol $sym12$_METHOD = makeSymbol("?METHOD");

    public static final SubLObject $$predicateGAFGatheringMethod = constant_handles.reader_make_constant_shell(makeString("predicateGAFGatheringMethod"));

    static private final SubLList $list_alt14 = list(makeSymbol("?METHOD"));





    static private final SubLString $str_alt17$No_ISAs_asserted__The_type_of__A_ = makeString("No ISAs asserted: The type of ~A could not be determined correctly by the NER.~%");

    public static final SubLObject $$CycTermLearner = constant_handles.reader_make_constant_shell(makeString("CycTermLearner"));



    public static final SubLObject $$ist = constant_handles.reader_make_constant_shell(makeString("ist"));

    public static final SubLObject $$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));

    public static final SubLObject $$inProgressTerm = constant_handles.reader_make_constant_shell(makeString("inProgressTerm"));



    static private final SubLList $list_alt24 = list(constant_handles.reader_make_constant_shell(makeString("Individual")));

    static private final SubLList $list_alt25 = list(constant_handles.reader_make_constant_shell(makeString("Collection")));

    public static final SubLObject $$termString = constant_handles.reader_make_constant_shell(makeString("termString"));



    static private final SubLString $str_alt28$There_are_more_than_one_constrain = makeString("There are more than one constraining collections for ~A. Shall quit.~%");

    static private final SubLList $list_alt29 = list(constant_handles.reader_make_constant_shell(makeString("nameString")));

    static private final SubLString $str_alt30$There_are_more_than_one_constrain = makeString("There are more than one constraining collections for ~S in ~S. Ignoring all tighter-types provided by this sentence.~%");

    static private final SubLString $str_alt31$There_are_more_than_one_constrain = makeString("There are more than one constraining collections: ~S, for ~S.  Hence, results should not be used.");

    static private final SubLString $str_alt32$Could_not_find_CycL_for__A_as_an_ = makeString("Could not find CycL for ~A as an instance of ~A~%");

    static private final SubLString $str_alt33$_ = makeString(" ");

    public static final SubLObject $$DocIngesterUserCreatedTerm = constant_handles.reader_make_constant_shell(makeString("DocIngesterUserCreatedTerm"));

    public static final SubLObject $$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));

    static private final SubLList $list_alt36 = list(constant_handles.reader_make_constant_shell(makeString("DocIngesterUserCreatedTerm")));

    public static final SubLObject $$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));

    static private final SubLSymbol $sym38$ISA_COLLECTION_ = makeSymbol("ISA-COLLECTION?");

    static private final SubLSymbol $sym39$ISA_MT_ = makeSymbol("ISA-MT?");

    public static final SubLObject $$stringIsRepresentedByAssertion = constant_handles.reader_make_constant_shell(makeString("stringIsRepresentedByAssertion"));

    static private final SubLList $list_alt41 = list(makeString("/home/shah/Ginko/metrics/tightenType/wsj-1987-001.txt"), makeString("/home/shah/Ginko/metrics/tightenType/wsj-1988-001.txt"), makeString("/home/shah/Ginko/metrics/tightenType/wsj-1989-01.txt"));

    static private final SubLString $str_alt42$_home_shah_Ginko_metrics_tightenT = makeString("/home/shah/Ginko/metrics/tightenType/tighten-type-summary.txt");

    static private final SubLString $str_alt43$_A_A = makeString("~A~A");











    private static final SubLSymbol TIGHTEN_TYPE = makeSymbol("TIGHTEN-TYPE");

    static private final SubLString $str_alt50$_A_A_A__ = makeString("~A~A~A~%");

    static private final SubLString $str_alt51$_A = makeString("~A");

    static private final SubLString $str_alt52$__ = makeString("~%");





    static private final SubLString $str_alt55$Unable_to_open__S = makeString("Unable to open ~S");





    static private final SubLList $list_alt58 = cons(makeSymbol("SENTENCE"), makeSymbol("TERMS"));

    static private final SubLString $str_alt59$_S__ = makeString("~S~%");

    static private final SubLString $str_alt60$_S_A = makeString("~S~A");

    static private final SubLString $str_alt61$_home_shah_Ginko_metrics_termLear = makeString("/home/shah/Ginko/metrics/termLearner/web-search-");

    static private final SubLString $str_alt62$_txt = makeString(".txt");

    public static final SubLObject $$Person = constant_handles.reader_make_constant_shell(makeString("Person"));

    static private final SubLString $str_alt64$_home_shah_Ginko_metrics_termLear = makeString("/home/shah/Ginko/metrics/termLearner/input.txt");

    static private final SubLString $str_alt65$_home_shah_Ginko_metrics_termLear = makeString("/home/shah/Ginko/metrics/termLearner/summary.txt");

    static private final SubLString $$$nil = makeString("nil");





    static private final SubLString $str_alt69$failed_to_find__S_in__S = makeString("failed to find ~S in ~S");

    private static final SubLSymbol TERM_LEARNER_USER_SUBSTITUTION_SELECTION_RENDERER_TEST = makeSymbol("TERM-LEARNER-USER-SUBSTITUTION-SELECTION-RENDERER-TEST");





    static private final SubLString $$$daves = makeString("daves");









    static private final SubLList $list_alt78 = list(list(list(list(constant_handles.reader_make_constant_shell(makeString("likesAsFriend")), makeSymbol("?F"), constant_handles.reader_make_constant_shell(makeString("Lenat"))), makeString("Bill Clinton"), makeString("(1)"), list(list(makeKeyword("STRING"), makeString("Bill Clinton"), makeKeyword("VALID"), T, $CYCL, constant_handles.reader_make_constant_shell(makeString("BillClinton"))))), T), list(list(list(constant_handles.reader_make_constant_shell(makeString("lastEruptionDate")), constant_handles.reader_make_constant_shell(makeString("Krakatoa-Volcano")), makeSymbol("?F")), makeString("September 12, 2008"), makeString("(2)"), list(list(makeKeyword("STRING"), makeString("September 12, 2008"), makeKeyword("VALID"), T, $CYCL, list(constant_handles.reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(constant_handles.reader_make_constant_shell(makeString("MonthFn")), constant_handles.reader_make_constant_shell(makeString("September")), list(constant_handles.reader_make_constant_shell(makeString("YearFn")), makeInteger(2008))))))), T), list(list(list(constant_handles.reader_make_constant_shell(makeString("lastEruptionDate")), constant_handles.reader_make_constant_shell(makeString("Krakatoa-Volcano")), makeSymbol("?F")), makeString("12 September 2008"), makeString("(2)"), list(list(makeKeyword("STRING"), makeString("September 12, 2008"), makeKeyword("VALID"), T, $CYCL, list(constant_handles.reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(constant_handles.reader_make_constant_shell(makeString("MonthFn")), constant_handles.reader_make_constant_shell(makeString("September")), list(constant_handles.reader_make_constant_shell(makeString("YearFn")), makeInteger(2008))))))), T), list(list(list(constant_handles.reader_make_constant_shell(makeString("lastEruptionDate")), constant_handles.reader_make_constant_shell(makeString("Krakatoa-Volcano")), makeSymbol("?F")), makeString("15/9/2008"), makeString("(2)"), list(list(makeKeyword("STRING"), makeString("September 15, 2008"), makeKeyword("VALID"), T, $CYCL, list(constant_handles.reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(constant_handles.reader_make_constant_shell(makeString("MonthFn")), constant_handles.reader_make_constant_shell(makeString("September")), list(constant_handles.reader_make_constant_shell(makeString("YearFn")), makeInteger(2008))))))), T), list(list(list(constant_handles.reader_make_constant_shell(makeString("lastEruptionDate")), constant_handles.reader_make_constant_shell(makeString("Krakatoa-Volcano")), makeSymbol("?F")), makeString("9/15/2008"), makeString("(2)"), list(list(makeKeyword("STRING"), makeString("September 15, 2008"), makeKeyword("VALID"), T, $CYCL, list(constant_handles.reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(constant_handles.reader_make_constant_shell(makeString("MonthFn")), constant_handles.reader_make_constant_shell(makeString("September")), list(constant_handles.reader_make_constant_shell(makeString("YearFn")), makeInteger(2008))))))), T));

    static private final SubLSymbol $sym79$ELT_MATCHES_PATTERN_ = makeSymbol("ELT-MATCHES-PATTERN?");

    private static final SubLSymbol GET_CYCLS = makeSymbol("GET-CYCLS");

    static private final SubLSymbol $sym81$EQUALS_EL_ = makeSymbol("EQUALS-EL?");

    private static final SubLSymbol PATTERN_MATCHES_FORMULA = makeSymbol("PATTERN-MATCHES-FORMULA");

    private static final SubLSymbol TERM_LEARNER_VALID_SUBSTITUTION = makeSymbol("TERM-LEARNER-VALID-SUBSTITUTION");

    static private final SubLList $list_alt84 = list(list(list(constant_handles.reader_make_constant_shell(makeString("CenterOfGeographicalRegion")), list(constant_handles.reader_make_constant_shell(makeString("PhysiologicalConditionType"))), list(constant_handles.reader_make_constant_shell(makeString("PhysiologicalCondition"))), list(constant_handles.reader_make_constant_shell(makeString("contraindicatedDrug")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("Penicillin"))), constant_handles.reader_make_constant_shell(makeString("AssistedReaderSourceSpindleCollectorMt"))), NIL), list(list(constant_handles.reader_make_constant_shell(makeString("Heart")), list(constant_handles.reader_make_constant_shell(makeString("PhysiologicalConditionType"))), list(constant_handles.reader_make_constant_shell(makeString("PhysiologicalCondition"))), list(constant_handles.reader_make_constant_shell(makeString("contraindicatedDrug")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("Penicillin"))), constant_handles.reader_make_constant_shell(makeString("AssistedReaderSourceSpindleCollectorMt"))), NIL), list(list(constant_handles.reader_make_constant_shell(makeString("Heart-LocusOfFeelings")), list(constant_handles.reader_make_constant_shell(makeString("PhysiologicalConditionType"))), list(constant_handles.reader_make_constant_shell(makeString("PhysiologicalCondition"))), list(constant_handles.reader_make_constant_shell(makeString("contraindicatedDrug")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("Penicillin"))), constant_handles.reader_make_constant_shell(makeString("AssistedReaderSourceSpindleCollectorMt"))), NIL), list(list(constant_handles.reader_make_constant_shell(makeString("Criss-crossHeart")), list(constant_handles.reader_make_constant_shell(makeString("PhysiologicalConditionType"))), list(constant_handles.reader_make_constant_shell(makeString("PhysiologicalCondition"))), list(constant_handles.reader_make_constant_shell(makeString("contraindicatedDrug")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("Penicillin"))), constant_handles.reader_make_constant_shell(makeString("AssistedReaderSourceSpindleCollectorMt"))), T), list(list(list(constant_handles.reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell(makeString("Prolapse")), constant_handles.reader_make_constant_shell(makeString("situationAffectsBodyPart")), constant_handles.reader_make_constant_shell(makeString("MitralValve"))), list(constant_handles.reader_make_constant_shell(makeString("PhysiologicalConditionType"))), list(constant_handles.reader_make_constant_shell(makeString("PhysiologicalCondition"))), list(constant_handles.reader_make_constant_shell(makeString("contraindicatedDrug")), makeSymbol("?X"), constant_handles.reader_make_constant_shell(makeString("Penicillin"))), constant_handles.reader_make_constant_shell(makeString("AssistedReaderSourceSpindleCollectorMt"))), T));

    private static final SubLSymbol TERM_LEARNER_GET_FOLLOWUPS_FOR_TERM_TEST = makeSymbol("TERM-LEARNER-GET-FOLLOWUPS-FOR-TERM-TEST");

    static private final SubLList $list_alt86 = list(list(list(constant_handles.reader_make_constant_shell(makeString("Nokia")), constant_handles.reader_make_constant_shell(makeString("CycAdministrator")), list(constant_handles.reader_make_constant_shell(makeString("companyHasCEO")), constant_handles.reader_make_constant_shell(makeString("Nokia")), makeKeyword("FULLY-BOUND"))), T), list(list(constant_handles.reader_make_constant_shell(makeString("Nokia")), constant_handles.reader_make_constant_shell(makeString("CycAdministrator")), list(constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("Nokia")), constant_handles.reader_make_constant_shell(makeString("AnteriorCruciateLigament")))), NIL));

    private static final SubLSymbol TERM_LEARNER_MIN_ISA = makeSymbol("TERM-LEARNER-MIN-ISA");

    static private final SubLList $list_alt88 = list(list(list(constant_handles.reader_make_constant_shell(makeString("Telemetry-Antigua-35214-TAA-3C")), list(constant_handles.reader_make_constant_shell(makeString("MtUnionFn")), constant_handles.reader_make_constant_shell(makeString("AssistedReaderSourceSpindleCollectorMt")), constant_handles.reader_make_constant_shell(makeString("AeronauticsAndSpaceRecommendedWFFCheckingMt")))), list(constant_handles.reader_make_constant_shell(makeString("EasternRangeInstrumentationSystem")), constant_handles.reader_make_constant_shell(makeString("TAA-3C-AutotrackingTelemetryAntennaSystem")))));

    private static final SubLSymbol TERM_LEARNER_MIN_GENLS = makeSymbol("TERM-LEARNER-MIN-GENLS");

    static private final SubLSymbol $sym90$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");

    static private final SubLList $list_alt91 = list(list(list(constant_handles.reader_make_constant_shell(makeString("Dog")), constant_handles.reader_make_constant_shell(makeString("DocumentReaderFollowupSuggestionMt"))), list(constant_handles.reader_make_constant_shell(makeString("DomesticatedAnimal")), constant_handles.reader_make_constant_shell(makeString("CanisGenus")))));

    private static final SubLSymbol TERM_LEARNER_CONSOLIDATE_JAVALIST_FOR_ARG_POSITIONS = makeSymbol("TERM-LEARNER-CONSOLIDATE-JAVALIST-FOR-ARG-POSITIONS");

    private static final SubLSymbol JAVALISTS_MORE_OR_LESS_EQUAL = makeSymbol("JAVALISTS-MORE-OR-LESS-EQUAL");

    static private final SubLList $list_alt94 = list(list(list(list(constant_handles.reader_make_constant_shell(makeString("systemNoiseTemperature")), constant_handles.reader_make_constant_shell(makeString("Telemetry-Antigua-35214-TAA-3C")), list(constant_handles.reader_make_constant_shell(makeString("Kelvin")), makeInteger(262))), list(makeString("Antigua TAA-3C has a system noise temperature of 262 kelvins."), list(list(makeString("Antigua TAA-3C"), constant_handles.reader_make_constant_shell(makeString("Telemetry-Antigua-35214-TAA-3C")), list(ONE_INTEGER), makeString("<a href=\"cg?CB-CF&218266\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, FOURTEEN_INTEGER), list(makeString("has a system noise temperature of"), constant_handles.reader_make_constant_shell(makeString("systemNoiseTemperature")), list(ZERO_INTEGER), makeString("<a href=\"cg?CB-CF&224001\" target=\"_self\">"), makeString("</a>"), FIFTEEN_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(48)), list(makeString("262"), makeInteger(262), list(TWO_INTEGER, ONE_INTEGER), NIL, NIL, makeInteger(49)), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(52)), list(makeString("kelvins"), constant_handles.reader_make_constant_shell(makeString("Kelvin")), list(TWO_INTEGER, ZERO_INTEGER), makeString("<a href=\"cg?CB-CF&223\" target=\"_self\">"), makeString("</a>"), makeInteger(53)), list(makeString("."), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(60)))), list(list(TWO_INTEGER))), list(makeString("Antigua TAA-3C has a system noise temperature of 262 kelvins."), list(list(makeString("Antigua TAA-3C"), constant_handles.reader_make_constant_shell(makeString("Telemetry-Antigua-35214-TAA-3C")), list(ONE_INTEGER), makeString("<a href=\"cg?CB-CF&218266\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, FOURTEEN_INTEGER), list(makeString("has a system noise temperature of"), constant_handles.reader_make_constant_shell(makeString("systemNoiseTemperature")), list(ZERO_INTEGER), makeString("<a href=\"cg?CB-CF&224001\" target=\"_self\">"), makeString("</a>"), FIFTEEN_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(48)), list(makeString("262 kelvins"), list(constant_handles.reader_make_constant_shell(makeString("Kelvin")), makeInteger(262)), list(TWO_INTEGER), makeString("<a href=\"cg?CB-NAUT-FRAME&naut10\" target=\"_self\">"), makeString("</a>"), makeInteger(49)), list(makeString("."), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(60))))), list(list(list(constant_handles.reader_make_constant_shell(makeString("systemNoiseTemperature")), constant_handles.reader_make_constant_shell(makeString("Telemetry-Antigua-35214-TAA-3C")), list(constant_handles.reader_make_constant_shell(makeString("Kelvin")), makeInteger(262))), list(makeString("Antigua TAA-3C has a system noise temperature of 262 kelvins."), list(list(makeString("Antigua TAA-3C"), constant_handles.reader_make_constant_shell(makeString("Telemetry-Antigua-35214-TAA-3C")), list(ONE_INTEGER), makeString("<a href=\"cg?CB-CF&218266\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, FOURTEEN_INTEGER), list(makeString("has a system noise temperature of"), constant_handles.reader_make_constant_shell(makeString("systemNoiseTemperature")), list(ZERO_INTEGER), makeString("<a href=\"cg?CB-CF&224001\" target=\"_self\">"), makeString("</a>"), FIFTEEN_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(48)), list(makeString("262"), makeInteger(262), list(TWO_INTEGER, ONE_INTEGER), NIL, NIL, makeInteger(49)), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(52)), list(makeString("kelvins"), constant_handles.reader_make_constant_shell(makeString("Kelvin")), list(TWO_INTEGER, ZERO_INTEGER), makeString("<a href=\"cg?CB-CF&223\" target=\"_self\">"), makeString("</a>"), makeInteger(53)), list(makeString("."), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(60)))), NIL), list(makeString("Antigua TAA-3C has a system noise temperature of 262 kelvins."), list(list(makeString("Antigua TAA-3C"), constant_handles.reader_make_constant_shell(makeString("Telemetry-Antigua-35214-TAA-3C")), list(ONE_INTEGER), makeString("<a href=\"cg?CB-CF&218266\" target=\"_self\">"), makeString("</a>"), ZERO_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, FOURTEEN_INTEGER), list(makeString("has a system noise temperature of"), constant_handles.reader_make_constant_shell(makeString("systemNoiseTemperature")), list(ZERO_INTEGER), makeString("<a href=\"cg?CB-CF&224001\" target=\"_self\">"), makeString("</a>"), FIFTEEN_INTEGER), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(48)), list(makeString("262"), makeInteger(262), list(TWO_INTEGER, ONE_INTEGER), NIL, NIL, makeInteger(49)), list(makeString(" "), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(52)), list(makeString("kelvins"), constant_handles.reader_make_constant_shell(makeString("Kelvin")), list(TWO_INTEGER, ZERO_INTEGER), makeString("<a href=\"cg?CB-CF&223\" target=\"_self\">"), makeString("</a>"), makeInteger(53)), list(makeString("."), makeKeyword("PPH-EMPTY-CYCL"), makeKeyword("PPH-UNKNOWN-ARG-POSITION"), NIL, NIL, makeInteger(60))))));

    // // Initializers
    public void declareFunctions() {
        declare_term_learner_file();
    }

    public void initializeVariables() {
        init_term_learner_file();
    }

    public void runTopLevelForms() {
        setup_term_learner_file();
    }
}

