/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.data_warehousing;


import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-DATA-WAREHOUSING-UTILITIES
 * source file: /cyc/top/cycl/sksi/data-warehousing/sksi-data-warehousing-utilities.lisp
 * created:     2019/07/03 17:38:33
 */
public final class sksi_data_warehousing_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_data_warehousing_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SKSI_ENCODE_MEMOIZED = makeSymbol("SKSI-ENCODE-MEMOIZED");

    private static final SubLSymbol COMPARISON_LITERAL_P = makeSymbol("COMPARISON-LITERAL-P");

    private static final SubLSymbol $sym3$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_ = makeSymbol("CLOSED-DECODED-SENTENCE-SATISFIES-CONDITION?");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");







    private static final SubLSymbol $sym12$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLString $str13$Unexpected_SKSI_template_type__s = makeString("Unexpected SKSI template type ~s");

    private static final SubLSymbol $sym15$ATOMIC_SENTENCE_MEMOIZED_ = makeSymbol("ATOMIC-SENTENCE-MEMOIZED?");

    private static final SubLSymbol LOGICAL_FIELD_INDEXICAL_P = makeSymbol("LOGICAL-FIELD-INDEXICAL-P");

    // Definitions
    public static final SubLObject sksi_encode_memoized_internal_alt(SubLObject cycl, SubLObject ls, SubLObject sks, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = NIL;
        }
        return sksi_reformulate.sksi_encode(cycl, ls, sks);
    }

    // Definitions
    public static SubLObject sksi_encode_memoized_internal(final SubLObject cycl, final SubLObject ls, final SubLObject sks, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = NIL;
        }
        return sksi_reformulate.sksi_encode(cycl, ls, sks);
    }

    public static final SubLObject sksi_encode_memoized_alt(SubLObject cycl, SubLObject ls, SubLObject sks, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.sksi_encode_memoized_internal(cycl, ls, sks, mt_info);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_ENCODE_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_ENCODE_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, SKSI_ENCODE_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_4(cycl, ls, sks, mt_info);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (cycl.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (ls.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (sks.equal(cached_args.first())) {
                                                cached_args = cached_args.rest();
                                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                                    return memoization_state.caching_results(results2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.sksi_encode_memoized_internal(cycl, ls, sks, mt_info)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(cycl, ls, sks, mt_info));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject sksi_encode_memoized(final SubLObject cycl, final SubLObject ls, final SubLObject sks, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_encode_memoized_internal(cycl, ls, sks, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_ENCODE_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_ENCODE_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_ENCODE_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(cycl, ls, sks, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (cycl.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (ls.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sks.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_encode_memoized_internal(cycl, ls, sks, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cycl, ls, sks, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject construct_lfi_value_cache_alt(SubLObject decoded_sentence) {
        {
            SubLObject v_cache = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            SubLObject args = cycl_utilities.formula_args(decoded_sentence, $IGNORE);
            SubLObject cdolist_list_var = args;
            SubLObject ind_ref_sentence = NIL;
            for (ind_ref_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ind_ref_sentence = cdolist_list_var.first()) {
                dictionary.dictionary_enter(v_cache, cycl_utilities.formula_arg1(ind_ref_sentence, UNPROVIDED), cycl_utilities.formula_arg2(ind_ref_sentence, UNPROVIDED));
            }
            return v_cache;
        }
    }

    public static SubLObject construct_lfi_value_cache(final SubLObject decoded_sentence) {
        final SubLObject v_cache = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(decoded_sentence, $IGNORE);
        SubLObject ind_ref_sentence = NIL;
        ind_ref_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary.dictionary_enter(v_cache, cycl_utilities.formula_arg1(ind_ref_sentence, UNPROVIDED), cycl_utilities.formula_arg2(ind_ref_sentence, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            ind_ref_sentence = cdolist_list_var.first();
        } 
        return v_cache;
    }

    public static final SubLObject decoded_sentence_satisfies_conditionP_alt(SubLObject cms, SubLObject lfi_value_cache, SubLObject content_mt, SubLObject meta_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ant_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_conditional_meaning_sentence(cms);
                SubLObject ant_sen_lfis = sksi_infrastructure_utilities.expression_logical_field_indexicals(ant_sentence, T, T);
                SubLObject result_exp = copy_expression(ant_sentence);
                SubLObject missingP = NIL;
                SubLObject cdolist_list_var = ant_sen_lfis;
                SubLObject lfi = NIL;
                for (lfi = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lfi = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject lfi_value = dictionary.dictionary_lookup(lfi_value_cache, lfi, UNPROVIDED);
                        SubLObject foundP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != foundP) {
                            result_exp = cycl_utilities.expression_nsubst(lfi_value, lfi, result_exp, UNPROVIDED, UNPROVIDED);
                        } else {
                            missingP = T;
                        }
                    }
                }
                if ((NIL == missingP) && (((NIL != sksi_query_utilities.comparison_literal_p(result_exp)) || ((NIL != cycl_utilities.negatedP(result_exp)) && (NIL != sksi_query_utilities.comparison_literal_p(cycl_utilities.formula_arg1(result_exp, UNPROVIDED))))) || (NIL != cycl_grammar.cycl_boolean_combination_of_type(COMPARISON_LITERAL_P, result_exp)))) {
                    return com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.closed_decoded_sentence_satisfies_conditionP(result_exp, content_mt, UNPROVIDED);
                } else {
                    return com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.decoded_sentence_satisfies_condition_intP(result_exp, cms, content_mt, meta_mt);
                }
            }
        }
    }

    public static SubLObject decoded_sentence_satisfies_conditionP(final SubLObject cms, final SubLObject lfi_value_cache, final SubLObject content_mt, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ant_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_conditional_meaning_sentence(cms);
        final SubLObject ant_sen_lfis = sksi_infrastructure_utilities.expression_logical_field_indexicals(ant_sentence, T, T);
        SubLObject result_exp = copy_expression(ant_sentence);
        SubLObject missingP = NIL;
        SubLObject cdolist_list_var = ant_sen_lfis;
        SubLObject lfi = NIL;
        lfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject lfi_value = dictionary.dictionary_lookup(lfi_value_cache, lfi, UNPROVIDED);
            final SubLObject foundP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != foundP) {
                result_exp = cycl_utilities.expression_nsubst(lfi_value, lfi, result_exp, UNPROVIDED, UNPROVIDED);
            } else {
                missingP = T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            lfi = cdolist_list_var.first();
        } 
        if ((NIL == missingP) && (((NIL != sksi_query_utilities.comparison_literal_p(result_exp)) || ((NIL != cycl_utilities.negatedP(result_exp)) && (NIL != sksi_query_utilities.comparison_literal_p(cycl_utilities.formula_arg1(result_exp, UNPROVIDED))))) || (NIL != cycl_grammar.cycl_boolean_combination_of_type(COMPARISON_LITERAL_P, result_exp)))) {
            return closed_decoded_sentence_satisfies_conditionP(result_exp, content_mt, UNPROVIDED);
        }
        return decoded_sentence_satisfies_condition_intP(result_exp, cms, content_mt, meta_mt);
    }

    public static final SubLObject closed_decoded_sentence_satisfies_conditionP_internal_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return cyc_kernel.closed_query_success_result_p(NIL != v_properties ? ((SubLObject) (inference_kernel.new_cyc_query(sentence, mt, v_properties))) : inference_kernel.new_cyc_query(sentence, mt, UNPROVIDED));
    }

    public static SubLObject closed_decoded_sentence_satisfies_conditionP_internal(final SubLObject sentence, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return cyc_kernel.closed_query_success_result_p(NIL != v_properties ? inference_kernel.new_cyc_query(sentence, mt, v_properties) : inference_kernel.new_cyc_query(sentence, mt, UNPROVIDED));
    }

    public static final SubLObject closed_decoded_sentence_satisfies_conditionP_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.closed_decoded_sentence_satisfies_conditionP_internal(sentence, mt, v_properties);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym4$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym4$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_, THREE_INTEGER, TWENTY_INTEGER, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym4$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, v_properties);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (sentence.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (mt.equal(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_properties.equal(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.closed_decoded_sentence_satisfies_conditionP_internal(sentence, mt, v_properties)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(sentence, mt, v_properties));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject closed_decoded_sentence_satisfies_conditionP(final SubLObject sentence, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return closed_decoded_sentence_satisfies_conditionP_internal(sentence, mt, v_properties);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym3$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym3$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_, THREE_INTEGER, TWENTY_INTEGER, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym3$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, v_properties);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && v_properties.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(closed_decoded_sentence_satisfies_conditionP_internal(sentence, mt, v_properties)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt, v_properties));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject decoded_sentence_satisfies_condition_intP_alt(SubLObject sentence, SubLObject cms, SubLObject content_mt, SubLObject meta_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result1 = NIL;
                SubLObject result2 = NIL;
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                {
                                    SubLObject antecedent_logical_schema_set = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence(cms);
                                    SubLObject antecedent_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_conditional_meaning_sentence(cms);
                                    SubLObject consequent_logical_schema_set = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence(cms);
                                    SubLObject consequent_sentence = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_conditional_meaning_sentence(cms);
                                    SubLObject consequent_physical_schema_set = sksi_kb_accessors.logical_schemata_physical_schemata(consequent_logical_schema_set);
                                    SubLObject con_ls = consequent_logical_schema_set.first();
                                    SubLObject conditions = (NIL != atomic_sentenceP(sentence)) ? ((SubLObject) (list(sentence))) : cycl_utilities.formula_args(sentence, UNPROVIDED);
                                    SubLObject cons_lf_conditions = NIL;
                                    SubLObject other_conditions = NIL;
                                    SubLObject cdolist_list_var = conditions;
                                    SubLObject cond = NIL;
                                    for (cond = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cond = cdolist_list_var.first()) {
                                        {
                                            SubLObject cond_lfis = sksi_infrastructure_utilities.expression_logical_field_indexicals(cond, T, UNPROVIDED);
                                            SubLObject doneP = NIL;
                                            if (NIL == doneP) {
                                                {
                                                    SubLObject csome_list_var = cond_lfis;
                                                    SubLObject lfi = NIL;
                                                    for (lfi = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lfi = csome_list_var.first()) {
                                                        if (sksi_kb_accessors.logical_field_indexical_schema(lfi) != con_ls) {
                                                            doneP = T;
                                                        }
                                                    }
                                                }
                                            }
                                            if (NIL != doneP) {
                                                other_conditions = cons(cond, other_conditions);
                                            } else {
                                                cons_lf_conditions = cons(cond, cons_lf_conditions);
                                            }
                                        }
                                    }
                                    if (NIL != atomic_sentenceP(sentence)) {
                                        if (NIL != other_conditions) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject from_expression = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, other_conditions.first(), antecedent_sentence, consequent_sentence, meta_mt);
                                                SubLObject where_expression = thread.secondMultipleValue();
                                                SubLObject sk_source = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                result1 = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.check_csql_conditions_with_sk_source(from_expression, where_expression, sk_source);
                                                result2 = NIL;
                                            }
                                        } else {
                                            if (NIL != cons_lf_conditions) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject from_expression = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, cons_lf_conditions.first(), antecedent_sentence, consequent_sentence, meta_mt);
                                                    SubLObject where_expression = thread.secondMultipleValue();
                                                    SubLObject sk_source = thread.thirdMultipleValue();
                                                    thread.resetMultipleValues();
                                                    result1 = from_expression;
                                                    result2 = where_expression;
                                                }
                                            }
                                        }
                                    } else {
                                        if (NIL != cycl_utilities.negatedP(sentence)) {
                                            if (NIL != other_conditions) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject from_expression = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, make_negation(other_conditions.first()), antecedent_sentence, consequent_sentence, meta_mt);
                                                    SubLObject where_expression = thread.secondMultipleValue();
                                                    SubLObject sk_source = thread.thirdMultipleValue();
                                                    thread.resetMultipleValues();
                                                    result1 = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.check_csql_conditions_with_sk_source(from_expression, where_expression, sk_source);
                                                    result2 = NIL;
                                                }
                                            } else {
                                                if (NIL != cons_lf_conditions) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject from_expression = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, make_negation(cons_lf_conditions.first()), antecedent_sentence, consequent_sentence, meta_mt);
                                                        SubLObject where_expression = thread.secondMultipleValue();
                                                        SubLObject sk_source = thread.thirdMultipleValue();
                                                        thread.resetMultipleValues();
                                                        result1 = from_expression;
                                                        result2 = where_expression;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (NIL != el_conjunction_p(sentence)) {
                                                {
                                                    SubLObject failP = NIL;
                                                    if (NIL != other_conditions) {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject from_expression = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, make_conjunction(other_conditions), antecedent_sentence, consequent_sentence, meta_mt);
                                                            SubLObject where_expression = thread.secondMultipleValue();
                                                            SubLObject sk_source = thread.thirdMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL == com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.check_csql_conditions_with_sk_source(from_expression, where_expression, sk_source)) {
                                                                failP = T;
                                                                result1 = NIL;
                                                                result2 = NIL;
                                                            }
                                                        }
                                                    }
                                                    if (NIL == failP) {
                                                        if (NIL != cons_lf_conditions) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject from_expression = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, make_conjunction(cons_lf_conditions), antecedent_sentence, consequent_sentence, meta_mt);
                                                                SubLObject where_expression = thread.secondMultipleValue();
                                                                SubLObject sk_source = thread.thirdMultipleValue();
                                                                thread.resetMultipleValues();
                                                                result1 = from_expression;
                                                                result2 = where_expression;
                                                            }
                                                        } else {
                                                            result1 = T;
                                                            result2 = NIL;
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (NIL != el_disjunction_p(sentence)) {
                                                    {
                                                        SubLObject successP = NIL;
                                                        if (NIL != other_conditions) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject from_expression = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, make_disjunction(other_conditions), antecedent_sentence, consequent_sentence, meta_mt);
                                                                SubLObject where_expression = thread.secondMultipleValue();
                                                                SubLObject sk_source = thread.thirdMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.check_csql_conditions_with_sk_source(from_expression, where_expression, sk_source)) {
                                                                    successP = T;
                                                                    result1 = T;
                                                                    result2 = NIL;
                                                                }
                                                            }
                                                        }
                                                        if (NIL == successP) {
                                                            if (NIL != cons_lf_conditions) {
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject from_expression = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, make_disjunction(cons_lf_conditions), antecedent_sentence, consequent_sentence, meta_mt);
                                                                    SubLObject where_expression = thread.secondMultipleValue();
                                                                    SubLObject sk_source = thread.thirdMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    result1 = from_expression;
                                                                    result2 = where_expression;
                                                                }
                                                            } else {
                                                                result1 = NIL;
                                                                result2 = NIL;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
                return values(result1, result2);
            }
        }
    }

    public static SubLObject decoded_sentence_satisfies_condition_intP(final SubLObject sentence, final SubLObject cms, final SubLObject content_mt, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result1 = NIL;
        SubLObject result2 = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject antecedent_logical_schema_set = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence(cms);
                    final SubLObject antecedent_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_conditional_meaning_sentence(cms);
                    final SubLObject consequent_logical_schema_set = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence(cms);
                    final SubLObject consequent_sentence = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_conditional_meaning_sentence(cms);
                    final SubLObject consequent_physical_schema_set = sksi_kb_accessors.logical_schemata_physical_schemata(consequent_logical_schema_set);
                    final SubLObject con_ls = consequent_logical_schema_set.first();
                    final SubLObject conditions = (NIL != atomic_sentenceP(sentence)) ? list(sentence) : cycl_utilities.formula_args(sentence, UNPROVIDED);
                    SubLObject cons_lf_conditions = NIL;
                    SubLObject other_conditions = NIL;
                    SubLObject cdolist_list_var = conditions;
                    SubLObject cond = NIL;
                    cond = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject cond_lfis = sksi_infrastructure_utilities.expression_logical_field_indexicals(cond, T, UNPROVIDED);
                        SubLObject doneP = NIL;
                        if (NIL == doneP) {
                            SubLObject csome_list_var = cond_lfis;
                            SubLObject lfi = NIL;
                            lfi = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                if (!sksi_kb_accessors.logical_field_indexical_schema(lfi).eql(con_ls)) {
                                    doneP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                lfi = csome_list_var.first();
                            } 
                        }
                        if (NIL != doneP) {
                            other_conditions = cons(cond, other_conditions);
                        } else {
                            cons_lf_conditions = cons(cond, cons_lf_conditions);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        cond = cdolist_list_var.first();
                    } 
                    if (NIL != atomic_sentenceP(sentence)) {
                        if (NIL != other_conditions) {
                            thread.resetMultipleValues();
                            final SubLObject from_expression = get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, other_conditions.first(), antecedent_sentence, consequent_sentence, meta_mt);
                            final SubLObject where_expression = thread.secondMultipleValue();
                            final SubLObject sk_source = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            result1 = check_csql_conditions_with_sk_source(from_expression, where_expression, sk_source);
                            result2 = NIL;
                        } else
                            if (NIL != cons_lf_conditions) {
                                thread.resetMultipleValues();
                                final SubLObject from_expression = get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, cons_lf_conditions.first(), antecedent_sentence, consequent_sentence, meta_mt);
                                final SubLObject where_expression = thread.secondMultipleValue();
                                final SubLObject sk_source = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                result1 = from_expression;
                                result2 = where_expression;
                            }

                    } else
                        if (NIL != cycl_utilities.negatedP(sentence)) {
                            if (NIL != other_conditions) {
                                thread.resetMultipleValues();
                                final SubLObject from_expression = get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, make_negation(other_conditions.first()), antecedent_sentence, consequent_sentence, meta_mt);
                                final SubLObject where_expression = thread.secondMultipleValue();
                                final SubLObject sk_source = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                result1 = check_csql_conditions_with_sk_source(from_expression, where_expression, sk_source);
                                result2 = NIL;
                            } else
                                if (NIL != cons_lf_conditions) {
                                    thread.resetMultipleValues();
                                    final SubLObject from_expression = get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, make_negation(cons_lf_conditions.first()), antecedent_sentence, consequent_sentence, meta_mt);
                                    final SubLObject where_expression = thread.secondMultipleValue();
                                    final SubLObject sk_source = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    result1 = from_expression;
                                    result2 = where_expression;
                                }

                        } else
                            if (NIL != el_conjunction_p(sentence)) {
                                SubLObject failP = NIL;
                                if (NIL != other_conditions) {
                                    thread.resetMultipleValues();
                                    final SubLObject from_expression2 = get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, make_conjunction(other_conditions), antecedent_sentence, consequent_sentence, meta_mt);
                                    final SubLObject where_expression2 = thread.secondMultipleValue();
                                    final SubLObject sk_source2 = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL == check_csql_conditions_with_sk_source(from_expression2, where_expression2, sk_source2)) {
                                        failP = T;
                                        result1 = NIL;
                                        result2 = NIL;
                                    }
                                }
                                if (NIL == failP) {
                                    if (NIL != cons_lf_conditions) {
                                        thread.resetMultipleValues();
                                        final SubLObject from_expression2 = get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, make_conjunction(cons_lf_conditions), antecedent_sentence, consequent_sentence, meta_mt);
                                        final SubLObject where_expression2 = thread.secondMultipleValue();
                                        final SubLObject sk_source2 = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        result1 = from_expression2;
                                        result2 = where_expression2;
                                    } else {
                                        result1 = T;
                                        result2 = NIL;
                                    }
                                }
                            } else
                                if (NIL != el_disjunction_p(sentence)) {
                                    SubLObject successP = NIL;
                                    if (NIL != other_conditions) {
                                        thread.resetMultipleValues();
                                        final SubLObject from_expression2 = get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, make_disjunction(other_conditions), antecedent_sentence, consequent_sentence, meta_mt);
                                        final SubLObject where_expression2 = thread.secondMultipleValue();
                                        final SubLObject sk_source2 = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != check_csql_conditions_with_sk_source(from_expression2, where_expression2, sk_source2)) {
                                            successP = T;
                                            result1 = T;
                                            result2 = NIL;
                                        }
                                    }
                                    if (NIL == successP) {
                                        if (NIL != cons_lf_conditions) {
                                            thread.resetMultipleValues();
                                            final SubLObject from_expression2 = get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, make_disjunction(cons_lf_conditions), antecedent_sentence, consequent_sentence, meta_mt);
                                            final SubLObject where_expression2 = thread.secondMultipleValue();
                                            final SubLObject sk_source2 = thread.thirdMultipleValue();
                                            thread.resetMultipleValues();
                                            result1 = from_expression2;
                                            result2 = where_expression2;
                                        } else {
                                            result1 = NIL;
                                            result2 = NIL;
                                        }
                                    }
                                }



                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return values(result1, result2);
    }

    public static final SubLObject check_csql_conditions_with_sk_source_alt(SubLObject from_expression, SubLObject where_expression, SubLObject sk_source) {
        {
            SubLObject csql = sksi_csql_generation.sksi_make_boolean_csql_query(from_expression, where_expression);
            SubLObject result = sksi_sks_interaction.generate_boolean_from_csql(csql, sk_source, UNPROVIDED);
            return result;
        }
    }

    public static SubLObject check_csql_conditions_with_sk_source(final SubLObject from_expression, final SubLObject where_expression, final SubLObject sk_source) {
        final SubLObject csql = sksi_csql_generation.sksi_make_boolean_csql_query(from_expression, where_expression);
        final SubLObject result = sksi_sks_interaction.generate_boolean_from_csql(csql, sk_source, UNPROVIDED);
        return result;
    }

    public static final SubLObject get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence_alt(SubLObject cms, SubLObject consequent_ps_list, SubLObject consequent_logical_schema_set, SubLObject antecedent_logical_schema_set, SubLObject antecedent_sentence, SubLObject antecedent_meaning_sentence, SubLObject consequent_sentence, SubLObject meta_mt) {
        {
            SubLObject antecedent_physical_schemata = sksi_kb_accessors.logical_schemata_physical_schemata(antecedent_logical_schema_set);
            SubLObject all_physical_schemata = union(consequent_ps_list, antecedent_physical_schemata, UNPROVIDED, UNPROVIDED);
            SubLObject new_sk_source = sksi_kb_accessors.nearest_common_super_ks_for_ls_list(union(consequent_logical_schema_set, antecedent_logical_schema_set, UNPROVIDED, UNPROVIDED));
            SubLObject new_content_mt = sksi_kb_accessors.sk_source_content_mt(new_sk_source);
            SubLObject from_expression = NIL;
            SubLObject where_expression = NIL;
            from_expression = sksi_query_utilities.get_from_expression_from_antecedent_meaning_sentence_int(antecedent_logical_schema_set, antecedent_sentence, consequent_logical_schema_set, consequent_sentence, new_content_mt, new_sk_source, all_physical_schemata, NIL);
            where_expression = sksi_query_utilities.get_where_expression_from_antecedent_meaning_sentence_int(sksi_infrastructure_utilities.find_assertion_cycl_memoized(cms, meta_mt, UNPROVIDED), antecedent_meaning_sentence, antecedent_logical_schema_set, consequent_sentence, consequent_logical_schema_set, new_content_mt, new_sk_source, all_physical_schemata, NIL, NIL);
            if (NIL != where_expression) {
                where_expression = list(where_expression);
            } else {
                where_expression = sksi_query_utilities.get_where_expression_from_antecedent_meaning_sentence_int(sksi_infrastructure_utilities.find_assertion_cycl_memoized(cms, meta_mt, UNPROVIDED), antecedent_meaning_sentence, antecedent_logical_schema_set, consequent_sentence, consequent_logical_schema_set, new_content_mt, new_sk_source, all_physical_schemata, NIL, NIL);
                where_expression = list(where_expression);
                {
                    SubLObject lfi_list = sksi_infrastructure_utilities.expression_logical_field_indexicals(antecedent_meaning_sentence, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = lfi_list;
                    SubLObject lfi = NIL;
                    for (lfi = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lfi = cdolist_list_var.first()) {
                        {
                            SubLObject lfi_pos = cycl_utilities.arg_positions_dfs(lfi, antecedent_meaning_sentence, UNPROVIDED);
                            SubLObject lf = sksi_kb_accessors.logical_field_for_indexical(lfi);
                            SubLObject pf_list = sksi_kb_accessors.sksi_get_encoding_mapped_physical_fields_for_logical_field(lf);
                            SubLObject sentence_arg = cycl_utilities.formula_arg_position(antecedent_sentence, lfi_pos.first(), UNPROVIDED);
                            SubLObject cdolist_list_var_1 = pf_list;
                            SubLObject pf = NIL;
                            for (pf = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , pf = cdolist_list_var_1.first()) {
                                {
                                    SubLObject pf_name = sksi_kb_accessors.physical_field_name(pf);
                                    SubLObject table_name = sksi_kb_accessors.physical_field_sk_source_name(pf);
                                    SubLObject csql_field = sksi_csql_utilities.make_csql_field_expression(pf_name, table_name, UNPROVIDED);
                                    SubLObject pfi = sksi_kb_accessors.indexical_for_physical_field(pf);
                                    SubLObject field_encoding_list = sksi_field_translation_utilities.get_field_encodings_for_physical_field_indexical(pfi, UNPROVIDED, UNPROVIDED);
                                    SubLObject cdolist_list_var_2 = field_encoding_list;
                                    SubLObject encoding = NIL;
                                    for (encoding = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , encoding = cdolist_list_var_2.first()) {
                                        if (NIL != cycl_utilities.expression_find(lfi, encoding, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                            {
                                                SubLObject new_encoding = cycl_utilities.expression_subst(sentence_arg, lfi, encoding, UNPROVIDED, UNPROVIDED);
                                                SubLObject reformulated_encoding = sksi_reformulate.sksi_reformulate(new_encoding, $ENCODE, new_sk_source);
                                                where_expression = cons(sksi_csql_utilities.make_csql_expression($$CSQLEquals, list(csql_field, reformulated_encoding)), where_expression);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return values(from_expression, where_expression, new_sk_source);
        }
    }

    public static SubLObject get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(final SubLObject cms, final SubLObject consequent_ps_list, final SubLObject consequent_logical_schema_set, final SubLObject antecedent_logical_schema_set, final SubLObject antecedent_sentence, final SubLObject antecedent_meaning_sentence, final SubLObject consequent_sentence, final SubLObject meta_mt) {
        final SubLObject antecedent_physical_schemata = sksi_kb_accessors.logical_schemata_physical_schemata(antecedent_logical_schema_set);
        final SubLObject all_physical_schemata = union(consequent_ps_list, antecedent_physical_schemata, UNPROVIDED, UNPROVIDED);
        final SubLObject new_sk_source = sksi_kb_accessors.nearest_common_super_ks_for_ls_list(union(consequent_logical_schema_set, antecedent_logical_schema_set, UNPROVIDED, UNPROVIDED));
        final SubLObject new_content_mt = sksi_kb_accessors.sk_source_content_mt(new_sk_source);
        SubLObject from_expression = NIL;
        SubLObject where_expression = NIL;
        from_expression = sksi_query_utilities.get_from_expression_from_antecedent_meaning_sentence_int(antecedent_logical_schema_set, antecedent_sentence, consequent_logical_schema_set, consequent_sentence, new_content_mt, new_sk_source, all_physical_schemata, NIL);
        where_expression = sksi_query_utilities.get_where_expression_from_antecedent_meaning_sentence_int(sksi_infrastructure_utilities.find_assertion_cycl_memoized(cms, meta_mt, UNPROVIDED), antecedent_meaning_sentence, antecedent_logical_schema_set, consequent_sentence, consequent_logical_schema_set, new_content_mt, new_sk_source, all_physical_schemata, NIL, NIL);
        if (NIL != where_expression) {
            where_expression = list(where_expression);
        } else {
            where_expression = sksi_query_utilities.get_where_expression_from_antecedent_meaning_sentence_int(sksi_infrastructure_utilities.find_assertion_cycl_memoized(cms, meta_mt, UNPROVIDED), antecedent_meaning_sentence, antecedent_logical_schema_set, consequent_sentence, consequent_logical_schema_set, new_content_mt, new_sk_source, all_physical_schemata, NIL, NIL);
            where_expression = list(where_expression);
            SubLObject cdolist_list_var;
            final SubLObject lfi_list = cdolist_list_var = sksi_infrastructure_utilities.expression_logical_field_indexicals(antecedent_meaning_sentence, UNPROVIDED, UNPROVIDED);
            SubLObject lfi = NIL;
            lfi = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject lfi_pos = cycl_utilities.arg_positions_dfs(lfi, antecedent_meaning_sentence, UNPROVIDED);
                final SubLObject lf = sksi_kb_accessors.logical_field_for_indexical(lfi);
                final SubLObject pf_list = sksi_kb_accessors.sksi_get_encoding_mapped_physical_fields_for_logical_field(lf);
                final SubLObject sentence_arg = cycl_utilities.formula_arg_position(antecedent_sentence, lfi_pos.first(), UNPROVIDED);
                SubLObject cdolist_list_var_$1 = pf_list;
                SubLObject pf = NIL;
                pf = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    final SubLObject pf_name = sksi_kb_accessors.physical_field_name(pf);
                    final SubLObject table_name = sksi_kb_accessors.physical_field_sk_source_name(pf);
                    final SubLObject table_namespace = sksi_kb_accessors.physical_field_sk_source_namespace(pf);
                    final SubLObject csql_field = sksi_csql_utilities.construct_csql_field_expression(pf_name, table_name, table_namespace);
                    final SubLObject pfi = sksi_kb_accessors.indexical_for_physical_field(pf);
                    SubLObject cdolist_list_var_$2;
                    final SubLObject field_encoding_list = cdolist_list_var_$2 = sksi_field_translation_utilities.get_field_encodings_for_physical_field_indexical(pfi, UNPROVIDED, UNPROVIDED);
                    SubLObject encoding = NIL;
                    encoding = cdolist_list_var_$2.first();
                    while (NIL != cdolist_list_var_$2) {
                        if (NIL != cycl_utilities.expression_find(lfi, encoding, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            final SubLObject new_encoding = cycl_utilities.expression_subst(sentence_arg, lfi, encoding, UNPROVIDED, UNPROVIDED);
                            final SubLObject reformulated_encoding = sksi_reformulate.sksi_reformulate(new_encoding, $ENCODE, new_sk_source);
                            where_expression = cons(sksi_csql_utilities.make_csql_expression($$CSQLEquals, list(csql_field, reformulated_encoding)), where_expression);
                        }
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        encoding = cdolist_list_var_$2.first();
                    } 
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    pf = cdolist_list_var_$1.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                lfi = cdolist_list_var.first();
            } 
        }
        return values(from_expression, where_expression, new_sk_source);
    }

    public static final SubLObject decoded_sentence_satisfies_condition_recursiveP_alt(SubLObject sentence, SubLObject antecedent_sentence, SubLObject content_mt) {
        if (NIL != atomic_sentenceP(sentence)) {
            return com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.atomic_sentence_satisfies_conditionP(sentence, antecedent_sentence, content_mt);
        } else {
            if (NIL != cycl_utilities.negatedP(sentence)) {
                return makeBoolean(NIL == com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.decoded_sentence_satisfies_condition_recursiveP(sentence, antecedent_sentence, content_mt));
            } else {
                if (NIL != el_conjunction_p(sentence)) {
                    {
                        SubLObject failP = NIL;
                        SubLObject conjunct_index = ZERO_INTEGER;
                        SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
                        SubLObject rest = NIL;
                        for (rest = args; !((NIL != failP) || (NIL == rest)); rest = rest.rest()) {
                            {
                                SubLObject conjunct = rest.first();
                                conjunct_index = add(conjunct_index, ONE_INTEGER);
                                if (NIL == com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.decoded_sentence_satisfies_condition_recursiveP(conjunct, cycl_utilities.formula_arg(antecedent_sentence, conjunct_index, UNPROVIDED), content_mt)) {
                                    failP = T;
                                }
                            }
                        }
                        return makeBoolean(NIL == failP);
                    }
                } else {
                    if (NIL != el_disjunction_p(sentence)) {
                        {
                            SubLObject successP = NIL;
                            SubLObject disjunct_index = ZERO_INTEGER;
                            SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
                            SubLObject rest = NIL;
                            for (rest = args; !((NIL != successP) || (NIL == rest)); rest = rest.rest()) {
                                {
                                    SubLObject disjunct = rest.first();
                                    disjunct_index = add(disjunct_index, ONE_INTEGER);
                                    if (NIL != com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.decoded_sentence_satisfies_condition_recursiveP(disjunct, cycl_utilities.formula_arg(antecedent_sentence, disjunct_index, UNPROVIDED), content_mt)) {
                                        successP = T;
                                    }
                                }
                            }
                            return successP;
                        }
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    public static SubLObject decoded_sentence_satisfies_condition_recursiveP(final SubLObject sentence, final SubLObject antecedent_sentence, final SubLObject content_mt) {
        if (NIL != atomic_sentenceP(sentence)) {
            return atomic_sentence_satisfies_conditionP(sentence, antecedent_sentence, content_mt);
        }
        if (NIL != cycl_utilities.negatedP(sentence)) {
            return makeBoolean(NIL == decoded_sentence_satisfies_condition_recursiveP(sentence, antecedent_sentence, content_mt));
        }
        if (NIL != el_conjunction_p(sentence)) {
            SubLObject failP = NIL;
            SubLObject conjunct_index = ZERO_INTEGER;
            final SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject rest;
            SubLObject conjunct;
            for (rest = NIL, rest = args; (NIL == failP) && (NIL != rest); rest = rest.rest()) {
                conjunct = rest.first();
                conjunct_index = add(conjunct_index, ONE_INTEGER);
                if (NIL == decoded_sentence_satisfies_condition_recursiveP(conjunct, cycl_utilities.formula_arg(antecedent_sentence, conjunct_index, UNPROVIDED), content_mt)) {
                    failP = T;
                }
            }
            return makeBoolean(NIL == failP);
        }
        if (NIL != el_disjunction_p(sentence)) {
            SubLObject successP = NIL;
            SubLObject disjunct_index = ZERO_INTEGER;
            final SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject rest;
            SubLObject disjunct;
            for (rest = NIL, rest = args; (NIL == successP) && (NIL != rest); rest = rest.rest()) {
                disjunct = rest.first();
                disjunct_index = add(disjunct_index, ONE_INTEGER);
                if (NIL != decoded_sentence_satisfies_condition_recursiveP(disjunct, cycl_utilities.formula_arg(antecedent_sentence, disjunct_index, UNPROVIDED), content_mt)) {
                    successP = T;
                }
            }
            return successP;
        }
        return NIL;
    }

    public static final SubLObject atomic_sentence_satisfies_conditionP_alt(SubLObject sentence, SubLObject antecedent_sentence, SubLObject content_mt) {
        {
            SubLObject lfi_list = sksi_infrastructure_utilities.expression_logical_field_indexicals(sentence, UNPROVIDED, UNPROVIDED);
            if (NIL != lfi_list) {
                return com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.open_decoded_sentence_satisfies_conditionP(sentence, antecedent_sentence, content_mt, lfi_list);
            } else {
                return com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.closed_decoded_sentence_satisfies_conditionP(sentence, content_mt, UNPROVIDED);
            }
        }
    }

    public static SubLObject atomic_sentence_satisfies_conditionP(final SubLObject sentence, final SubLObject antecedent_sentence, final SubLObject content_mt) {
        final SubLObject lfi_list = sksi_infrastructure_utilities.expression_logical_field_indexicals(sentence, UNPROVIDED, UNPROVIDED);
        if (NIL != lfi_list) {
            return open_decoded_sentence_satisfies_conditionP(sentence, antecedent_sentence, content_mt, lfi_list);
        }
        return closed_decoded_sentence_satisfies_conditionP(sentence, content_mt, UNPROVIDED);
    }

    public static final SubLObject open_decoded_sentence_satisfies_conditionP_alt(SubLObject sentence, SubLObject antecedent_sentence, SubLObject content_mt, SubLObject lfi_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($$equals != cycl_utilities.formula_operator(sentence)) {
                return NIL;
            }
            if (NIL == list_utilities.singletonP(lfi_list)) {
                return NIL;
            }
            {
                SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt(content_mt);
                SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                SubLObject lfi = lfi_list.first();
                SubLObject bound_arg = set_difference(cycl_utilities.formula_args(sentence, UNPROVIDED), lfi_list, UNPROVIDED, UNPROVIDED).first();
                SubLObject original_bound_arg = cycl_utilities.formula_arg_position(antecedent_sentence, cycl_utilities.arg_positions_dfs(bound_arg, sentence, symbol_function(EQUAL)).first(), UNPROVIDED);
                if (NIL != sksi_kb_accessors.logical_field_indexical_p(original_bound_arg)) {
                    {
                        SubLObject top_ks = NIL;
                        SubLObject lf = NIL;
                        SubLObject field_isa = NIL;
                        SubLObject ls = NIL;
                        SubLObject sub_ks = NIL;
                        SubLObject query_sentence = NIL;
                        SubLObject query_mt = NIL;
                        SubLObject allowed_modules_list = NIL;
                        SubLObject mt_var = mapping_mt;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                ls = sksi_kb_accessors.logical_field_indexical_schema(lfi);
                                top_ks = sksi_kb_accessors.max_genl_ks(sks);
                                if (NIL == sub_ks) {
                                    {
                                        SubLObject csome_list_var = sksi_kb_accessors.logical_schema_sk_sources_memoized(ls);
                                        SubLObject candidate = NIL;
                                        for (candidate = csome_list_var.first(); !((NIL != sub_ks) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , candidate = csome_list_var.first()) {
                                            if (NIL != sksi_kb_accessors.sk_source_sub_ksP(top_ks, candidate)) {
                                                sub_ks = candidate;
                                            }
                                        }
                                    }
                                }
                                lf = sksi_kb_accessors.logical_field_for_indexical(lfi);
                                field_isa = sksi_kb_accessors.logical_field_isa(lf).first();
                                query_sentence = make_el_formula($$isa, list(bound_arg, field_isa), UNPROVIDED);
                                query_mt = sksi_kb_accessors.sk_source_content_mt(sub_ks);
                                allowed_modules_list = sksi_infrastructure_utilities.sks_to_allowed_modules_list(sub_ks);
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (sub_ks == sks) {
                            return query_sentence;
                        } else {
                            return com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.closed_decoded_sentence_satisfies_conditionP(query_sentence, query_mt, list($ALLOWED_MODULES, allowed_modules_list));
                        }
                    }
                } else {
                    return sentence;
                }
            }
        }
    }

    public static SubLObject open_decoded_sentence_satisfies_conditionP(final SubLObject sentence, final SubLObject antecedent_sentence, final SubLObject content_mt, final SubLObject lfi_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$$equals.eql(cycl_utilities.formula_operator(sentence))) {
            return NIL;
        }
        if (NIL == list_utilities.singletonP(lfi_list)) {
            return NIL;
        }
        final SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt(content_mt);
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        final SubLObject lfi = lfi_list.first();
        final SubLObject bound_arg = set_difference(cycl_utilities.formula_args(sentence, UNPROVIDED), lfi_list, UNPROVIDED, UNPROVIDED).first();
        final SubLObject original_bound_arg = cycl_utilities.formula_arg_position(antecedent_sentence, cycl_utilities.arg_positions_dfs(bound_arg, sentence, symbol_function(EQUAL)).first(), UNPROVIDED);
        if (NIL == sksi_kb_accessors.logical_field_indexical_p(original_bound_arg)) {
            return sentence;
        }
        SubLObject top_ks = NIL;
        SubLObject lf = NIL;
        SubLObject field_isa = NIL;
        SubLObject ls = NIL;
        SubLObject sub_ks = NIL;
        SubLObject query_sentence = NIL;
        SubLObject query_mt = NIL;
        SubLObject allowed_modules_list = NIL;
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ls = sksi_kb_accessors.logical_field_indexical_schema(lfi);
            top_ks = sksi_kb_accessors.max_genl_ks(sks);
            if (NIL == sub_ks) {
                SubLObject csome_list_var = sksi_kb_accessors.logical_schema_sk_sources_memoized(ls);
                SubLObject candidate = NIL;
                candidate = csome_list_var.first();
                while ((NIL == sub_ks) && (NIL != csome_list_var)) {
                    if (NIL != sksi_kb_accessors.sk_source_sub_ksP(top_ks, candidate)) {
                        sub_ks = candidate;
                    }
                    csome_list_var = csome_list_var.rest();
                    candidate = csome_list_var.first();
                } 
            }
            lf = sksi_kb_accessors.logical_field_for_indexical(lfi);
            field_isa = sksi_kb_accessors.logical_field_isa(lf).first();
            query_sentence = make_el_formula($$isa, list(bound_arg, field_isa), UNPROVIDED);
            query_mt = sksi_kb_accessors.sk_source_content_mt(sub_ks);
            allowed_modules_list = sksi_infrastructure_utilities.sks_to_allowed_modules_list(sub_ks);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (sub_ks.eql(sks)) {
            return query_sentence;
        }
        return closed_decoded_sentence_satisfies_conditionP(query_sentence, query_mt, list($ALLOWED_MODULES, allowed_modules_list));
    }

    public static final SubLObject make_sentence_template_alt(SubLObject sentence) {
        return subst_if($X, $sym13$CYC_VAR_, sentence, UNPROVIDED);
    }

    public static SubLObject make_sentence_template(final SubLObject sentence) {
        return subst_if($X, $sym12$CYC_VAR_, sentence, UNPROVIDED);
    }

    public static final SubLObject sksi_template_appropriate_for_schemasP_alt(SubLObject template, SubLObject logical_schema, SubLObject physical_schema, SubLObject replace_atomic_sentence_argsP) {
        if (replace_atomic_sentence_argsP == UNPROVIDED) {
            replace_atomic_sentence_argsP = NIL;
        }
        {
            SubLObject template_pred = cycl_utilities.formula_operator(template);
            SubLObject appropriateP = NIL;
            SubLObject meaning_sentences = sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(logical_schema, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != fort_types_interface.predicate_p(template_pred)) {
                if (NIL == appropriateP) {
                    {
                        SubLObject csome_list_var = meaning_sentences;
                        SubLObject meaning_sentence = NIL;
                        for (meaning_sentence = csome_list_var.first(); !((NIL != appropriateP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , meaning_sentence = csome_list_var.first()) {
                            appropriateP = com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.sksi_template_appropriate_for_schemas_intP(template_pred, template, meaning_sentence, logical_schema, physical_schema, replace_atomic_sentence_argsP);
                        }
                    }
                }
            } else {
                if (NIL != cyc_const_logical_operator_p(template_pred)) {
                    {
                        SubLObject some_meaning_sentence_inappropriateP = NIL;
                        if (NIL == some_meaning_sentence_inappropriateP) {
                            {
                                SubLObject csome_list_var = meaning_sentences;
                                SubLObject meaning_sentence = NIL;
                                for (meaning_sentence = csome_list_var.first(); !((NIL != some_meaning_sentence_inappropriateP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , meaning_sentence = csome_list_var.first()) {
                                    {
                                        SubLObject some_conjunct_appropriateP = NIL;
                                        SubLObject args = cycl_utilities.formula_args(template, $IGNORE);
                                        SubLObject rest = NIL;
                                        for (rest = args; !((NIL != some_conjunct_appropriateP) || (NIL == rest)); rest = rest.rest()) {
                                            {
                                                SubLObject conjunct = rest.first();
                                                if (NIL != com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.sksi_template_appropriate_for_schemas_intP(cycl_utilities.formula_operator(conjunct), conjunct, meaning_sentence, logical_schema, physical_schema, replace_atomic_sentence_argsP)) {
                                                    some_conjunct_appropriateP = T;
                                                }
                                            }
                                        }
                                        if (NIL == some_conjunct_appropriateP) {
                                            some_meaning_sentence_inappropriateP = T;
                                        }
                                    }
                                }
                            }
                        }
                        appropriateP = makeBoolean(NIL == some_meaning_sentence_inappropriateP);
                    }
                } else {
                    Errors.warn($str_alt14$Unexpected_SKSI_template_type__s, template);
                }
            }
            if (NIL == appropriateP) {
                {
                    SubLObject conditional_meaning_sentence_gafs = sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, T, NIL, NIL);
                    if (NIL == appropriateP) {
                        {
                            SubLObject csome_list_var = conditional_meaning_sentence_gafs;
                            SubLObject cms_gaf = NIL;
                            for (cms_gaf = csome_list_var.first(); !((NIL != appropriateP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , cms_gaf = csome_list_var.first()) {
                                {
                                    SubLObject antecedent_meaning_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(cms_gaf);
                                    SubLObject consequent_meaning_sentence = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(cms_gaf, UNPROVIDED);
                                    SubLObject new_consequent_sentence = (NIL != sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(consequent_meaning_sentence)) ? ((SubLObject) (sksi_meaning_sentence_utilities.possibly_constrain_consequent_meaning_sentence(antecedent_meaning_sentence, consequent_meaning_sentence))) : consequent_meaning_sentence;
                                    if ((NIL != com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities.sksi_template_appropriate_for_schemas_intP(template_pred, template, new_consequent_sentence, logical_schema, physical_schema, replace_atomic_sentence_argsP)) && (NIL != sksi_meaning_sentence_utilities.supported_conditional_meaning_sentence_gaf_p(cms_gaf, UNPROVIDED))) {
                                        appropriateP = consequent_meaning_sentence;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return appropriateP;
        }
    }

    public static SubLObject sksi_template_appropriate_for_schemasP(final SubLObject template, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject replace_atomic_sentence_argsP) {
        if (replace_atomic_sentence_argsP == UNPROVIDED) {
            replace_atomic_sentence_argsP = NIL;
        }
        final SubLObject template_pred = cycl_utilities.formula_operator(template);
        SubLObject appropriateP = NIL;
        final SubLObject meaning_sentences = sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(logical_schema, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != fort_types_interface.predicate_p(template_pred)) {
            if (NIL == appropriateP) {
                SubLObject csome_list_var;
                SubLObject meaning_sentence;
                for (csome_list_var = meaning_sentences, meaning_sentence = NIL, meaning_sentence = csome_list_var.first(); (NIL == appropriateP) && (NIL != csome_list_var); appropriateP = sksi_template_appropriate_for_schemas_intP(template_pred, template, meaning_sentence, logical_schema, physical_schema, replace_atomic_sentence_argsP) , csome_list_var = csome_list_var.rest() , meaning_sentence = csome_list_var.first()) {
                }
            }
        } else
            if (NIL != cyc_const_logical_operator_p(template_pred)) {
                SubLObject some_meaning_sentence_inappropriateP = NIL;
                if (NIL == some_meaning_sentence_inappropriateP) {
                    SubLObject csome_list_var2 = meaning_sentences;
                    SubLObject meaning_sentence2 = NIL;
                    meaning_sentence2 = csome_list_var2.first();
                    while ((NIL == some_meaning_sentence_inappropriateP) && (NIL != csome_list_var2)) {
                        SubLObject some_conjunct_appropriateP = NIL;
                        final SubLObject args = cycl_utilities.formula_args(template, $IGNORE);
                        SubLObject rest;
                        SubLObject conjunct;
                        for (rest = NIL, rest = args; (NIL == some_conjunct_appropriateP) && (NIL != rest); rest = rest.rest()) {
                            conjunct = rest.first();
                            if (NIL != sksi_template_appropriate_for_schemas_intP(cycl_utilities.formula_operator(conjunct), conjunct, meaning_sentence2, logical_schema, physical_schema, replace_atomic_sentence_argsP)) {
                                some_conjunct_appropriateP = T;
                            }
                        }
                        if (NIL == some_conjunct_appropriateP) {
                            some_meaning_sentence_inappropriateP = T;
                        }
                        csome_list_var2 = csome_list_var2.rest();
                        meaning_sentence2 = csome_list_var2.first();
                    } 
                }
                appropriateP = makeBoolean(NIL == some_meaning_sentence_inappropriateP);
            } else {
                Errors.warn($str13$Unexpected_SKSI_template_type__s, template);
            }

        if (NIL == appropriateP) {
            final SubLObject conditional_meaning_sentence_gafs = sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, T, NIL, NIL);
            if (NIL == appropriateP) {
                SubLObject csome_list_var2 = conditional_meaning_sentence_gafs;
                SubLObject cms_gaf = NIL;
                cms_gaf = csome_list_var2.first();
                while ((NIL == appropriateP) && (NIL != csome_list_var2)) {
                    final SubLObject antecedent_meaning_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(cms_gaf);
                    final SubLObject consequent_meaning_sentence = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(cms_gaf, UNPROVIDED);
                    final SubLObject new_consequent_sentence = (NIL != sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(consequent_meaning_sentence)) ? sksi_meaning_sentence_utilities.possibly_constrain_consequent_meaning_sentence(antecedent_meaning_sentence, consequent_meaning_sentence) : consequent_meaning_sentence;
                    if ((NIL != sksi_template_appropriate_for_schemas_intP(template_pred, template, new_consequent_sentence, logical_schema, physical_schema, replace_atomic_sentence_argsP)) && (NIL != sksi_meaning_sentence_utilities.supported_conditional_meaning_sentence_gaf_p(cms_gaf, UNPROVIDED))) {
                        appropriateP = consequent_meaning_sentence;
                    }
                    csome_list_var2 = csome_list_var2.rest();
                    cms_gaf = csome_list_var2.first();
                } 
            }
        }
        return appropriateP;
    }

    public static final SubLObject sksi_template_appropriate_for_schemas_intP_alt(SubLObject template_pred, SubLObject template, SubLObject meaning_sentence, SubLObject logical_schema, SubLObject physical_schema, SubLObject replace_atomic_sentence_argsP) {
        {
            SubLObject appropriateP = NIL;
            SubLObject inappropriateP = NIL;
            SubLObject pred = cycl_utilities.atomic_sentence_predicate(meaning_sentence);
            if (NIL != sksi_kb_accessors.logical_field_indexical_p(pred)) {
                {
                    SubLObject pred_list = sksi_infrastructure_utilities.sksi_get_code_mapping_relations_for_logical_field_predicate(pred, logical_schema, physical_schema, UNPROVIDED);
                    if ((NIL != pred_list) && (NIL == list_utilities.member_equalP(template_pred, pred_list))) {
                        inappropriateP = T;
                    }
                }
            } else {
                if (!template_pred.equal(pred)) {
                    inappropriateP = T;
                }
            }
            if (NIL == inappropriateP) {
                {
                    SubLObject sentence = sksi_meaning_sentence_utilities.sksi_reconstruct_meaning_sentence(meaning_sentence);
                    SubLObject pattern = sentence;
                    if (NIL != replace_atomic_sentence_argsP) {
                        pattern = subst_if($FULLY_BOUND, $sym16$ATOMIC_SENTENCE_MEMOIZED_, pattern, UNPROVIDED);
                    }
                    pattern = subst_if($FULLY_BOUND, LOGICAL_FIELD_INDEXICAL_P, pattern, UNPROVIDED);
                    appropriateP = formula_pattern_match.pattern_matches_formula_without_bindings(pattern, template);
                    if (NIL != appropriateP) {
                        appropriateP = meaning_sentence;
                    }
                }
            }
            return appropriateP;
        }
    }

    public static SubLObject sksi_template_appropriate_for_schemas_intP(final SubLObject template_pred, final SubLObject template, final SubLObject meaning_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject replace_atomic_sentence_argsP) {
        SubLObject appropriateP = NIL;
        SubLObject inappropriateP = NIL;
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(meaning_sentence);
        if (NIL != sksi_kb_accessors.logical_field_indexical_p(pred)) {
            final SubLObject pred_list = sksi_infrastructure_utilities.sksi_get_code_mapping_relations_for_logical_field_predicate(pred, logical_schema, physical_schema, UNPROVIDED);
            if ((NIL != pred_list) && (NIL == list_utilities.member_equalP(template_pred, pred_list))) {
                inappropriateP = T;
            }
        } else
            if (!template_pred.equal(pred)) {
                inappropriateP = T;
            }

        if (NIL == inappropriateP) {
            SubLObject pattern;
            final SubLObject sentence = pattern = sksi_meaning_sentence_utilities.sksi_reconstruct_meaning_sentence(meaning_sentence);
            if (NIL != replace_atomic_sentence_argsP) {
                pattern = subst_if($FULLY_BOUND, $sym15$ATOMIC_SENTENCE_MEMOIZED_, pattern, UNPROVIDED);
            }
            pattern = subst_if($FULLY_BOUND, LOGICAL_FIELD_INDEXICAL_P, pattern, UNPROVIDED);
            appropriateP = formula_pattern_match.pattern_matches_formula_without_bindings(pattern, template);
            if (NIL != appropriateP) {
                appropriateP = meaning_sentence;
            }
        }
        return appropriateP;
    }

    public static SubLObject declare_sksi_data_warehousing_utilities_file() {
        declareFunction("sksi_encode_memoized_internal", "SKSI-ENCODE-MEMOIZED-INTERNAL", 3, 1, false);
        declareFunction("sksi_encode_memoized", "SKSI-ENCODE-MEMOIZED", 3, 1, false);
        declareFunction("construct_lfi_value_cache", "CONSTRUCT-LFI-VALUE-CACHE", 1, 0, false);
        declareFunction("decoded_sentence_satisfies_conditionP", "DECODED-SENTENCE-SATISFIES-CONDITION?", 4, 0, false);
        declareFunction("closed_decoded_sentence_satisfies_conditionP_internal", "CLOSED-DECODED-SENTENCE-SATISFIES-CONDITION?-INTERNAL", 2, 1, false);
        declareFunction("closed_decoded_sentence_satisfies_conditionP", "CLOSED-DECODED-SENTENCE-SATISFIES-CONDITION?", 2, 1, false);
        declareFunction("decoded_sentence_satisfies_condition_intP", "DECODED-SENTENCE-SATISFIES-CONDITION-INT?", 4, 0, false);
        declareFunction("check_csql_conditions_with_sk_source", "CHECK-CSQL-CONDITIONS-WITH-SK-SOURCE", 3, 0, false);
        declareFunction("get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence", "GET-FROM-AND-WHERE-EXPRESSION-FOR-ANTECEDENT-OF-CONDITIONAL-MEANING-SENTENCE", 8, 0, false);
        declareFunction("decoded_sentence_satisfies_condition_recursiveP", "DECODED-SENTENCE-SATISFIES-CONDITION-RECURSIVE?", 3, 0, false);
        declareFunction("atomic_sentence_satisfies_conditionP", "ATOMIC-SENTENCE-SATISFIES-CONDITION?", 3, 0, false);
        declareFunction("open_decoded_sentence_satisfies_conditionP", "OPEN-DECODED-SENTENCE-SATISFIES-CONDITION?", 4, 0, false);
        declareFunction("make_sentence_template", "MAKE-SENTENCE-TEMPLATE", 1, 0, false);
        declareFunction("sksi_template_appropriate_for_schemasP", "SKSI-TEMPLATE-APPROPRIATE-FOR-SCHEMAS?", 3, 1, false);
        declareFunction("sksi_template_appropriate_for_schemas_intP", "SKSI-TEMPLATE-APPROPRIATE-FOR-SCHEMAS-INT?", 6, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_data_warehousing_utilities_file() {
        return NIL;
    }

    public static final SubLObject setup_sksi_data_warehousing_utilities_file_alt() {
        memoization_state.note_memoized_function(SKSI_ENCODE_MEMOIZED);
        memoization_state.note_memoized_function($sym4$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_);
        return NIL;
    }

    public static SubLObject setup_sksi_data_warehousing_utilities_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_memoized_function(SKSI_ENCODE_MEMOIZED);
            memoization_state.note_memoized_function($sym3$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function($sym4$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_);
        }
        return NIL;
    }

    public static SubLObject setup_sksi_data_warehousing_utilities_file_Previous() {
        memoization_state.note_memoized_function(SKSI_ENCODE_MEMOIZED);
        memoization_state.note_memoized_function($sym3$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_data_warehousing_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_data_warehousing_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_data_warehousing_utilities_file();
    }

    static {
    }

    public static final SubLSymbol $kw1$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym4$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_ = makeSymbol("CLOSED-DECODED-SENTENCE-SATISFIES-CONDITION?");

    static private final SubLSymbol $sym13$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLString $str_alt14$Unexpected_SKSI_template_type__s = makeString("Unexpected SKSI template type ~s");

    static private final SubLSymbol $sym16$ATOMIC_SENTENCE_MEMOIZED_ = makeSymbol("ATOMIC-SENTENCE-MEMOIZED?");
}

/**
 * Total time: 180 ms
 */
