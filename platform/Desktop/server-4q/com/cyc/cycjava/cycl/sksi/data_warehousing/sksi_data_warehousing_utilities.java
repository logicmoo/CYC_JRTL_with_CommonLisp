package com.cyc.cycjava.cycl.sksi.data_warehousing;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_data_warehousing_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities";
    public static final String myFingerPrint = "5c36eb3189b1a27af6d4d8907b26c1cd764d3a032ee3a6fcb8892390e4296b6a";
    private static final SubLSymbol $sym0$SKSI_ENCODE_MEMOIZED;
    private static final SubLSymbol $kw1$IGNORE;
    private static final SubLSymbol $sym2$COMPARISON_LITERAL_P;
    private static final SubLSymbol $sym3$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_;
    private static final SubLSymbol $kw4$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym5$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $kw6$ENCODE;
    private static final SubLObject $const7$CSQLEquals;
    private static final SubLObject $const8$equals;
    private static final SubLObject $const9$isa;
    private static final SubLSymbol $kw10$ALLOWED_MODULES;
    private static final SubLSymbol $kw11$X;
    private static final SubLSymbol $sym12$CYC_VAR_;
    private static final SubLString $str13$Unexpected_SKSI_template_type__s;
    private static final SubLSymbol $kw14$FULLY_BOUND;
    private static final SubLSymbol $sym15$ATOMIC_SENTENCE_MEMOIZED_;
    private static final SubLSymbol $sym16$LOGICAL_FIELD_INDEXICAL_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-data-warehousing-utilities.lisp", position = 868L)
    public static SubLObject sksi_encode_memoized_internal(final SubLObject cycl, final SubLObject ls, final SubLObject sks, SubLObject mt_info) {
        if (mt_info == sksi_data_warehousing_utilities.UNPROVIDED) {
            mt_info = (SubLObject)sksi_data_warehousing_utilities.NIL;
        }
        return sksi_reformulate.sksi_encode(cycl, ls, sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-data-warehousing-utilities.lisp", position = 868L)
    public static SubLObject sksi_encode_memoized(final SubLObject cycl, final SubLObject ls, final SubLObject sks, SubLObject mt_info) {
        if (mt_info == sksi_data_warehousing_utilities.UNPROVIDED) {
            mt_info = (SubLObject)sksi_data_warehousing_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_data_warehousing_utilities.NIL;
        if (sksi_data_warehousing_utilities.NIL == v_memoization_state) {
            return sksi_encode_memoized_internal(cycl, ls, sks, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_data_warehousing_utilities.$sym0$SKSI_ENCODE_MEMOIZED, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
        if (sksi_data_warehousing_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_data_warehousing_utilities.$sym0$SKSI_ENCODE_MEMOIZED, (SubLObject)sksi_data_warehousing_utilities.FOUR_INTEGER, (SubLObject)sksi_data_warehousing_utilities.NIL, (SubLObject)sksi_data_warehousing_utilities.EQUAL, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_data_warehousing_utilities.$sym0$SKSI_ENCODE_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(cycl, ls, sks, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_data_warehousing_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_data_warehousing_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (cycl.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (ls.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sks.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sksi_data_warehousing_utilities.NIL != cached_args && sksi_data_warehousing_utilities.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_encode_memoized_internal(cycl, ls, sks, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(cycl, ls, sks, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-data-warehousing-utilities.lisp", position = 1032L)
    public static SubLObject construct_lfi_value_cache(final SubLObject decoded_sentence) {
        final SubLObject v_cache = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_data_warehousing_utilities.EQ), (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(decoded_sentence, (SubLObject)sksi_data_warehousing_utilities.$kw1$IGNORE);
        SubLObject ind_ref_sentence = (SubLObject)sksi_data_warehousing_utilities.NIL;
        ind_ref_sentence = cdolist_list_var.first();
        while (sksi_data_warehousing_utilities.NIL != cdolist_list_var) {
            dictionary.dictionary_enter(v_cache, cycl_utilities.formula_arg1(ind_ref_sentence, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED), cycl_utilities.formula_arg2(ind_ref_sentence, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            ind_ref_sentence = cdolist_list_var.first();
        }
        return v_cache;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-data-warehousing-utilities.lisp", position = 1313L)
    public static SubLObject decoded_sentence_satisfies_conditionP(final SubLObject cms, final SubLObject lfi_value_cache, final SubLObject content_mt, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ant_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_conditional_meaning_sentence(cms);
        final SubLObject ant_sen_lfis = sksi_infrastructure_utilities.expression_logical_field_indexicals(ant_sentence, (SubLObject)sksi_data_warehousing_utilities.T, (SubLObject)sksi_data_warehousing_utilities.T);
        SubLObject result_exp = el_utilities.copy_expression(ant_sentence);
        SubLObject missingP = (SubLObject)sksi_data_warehousing_utilities.NIL;
        SubLObject cdolist_list_var = ant_sen_lfis;
        SubLObject lfi = (SubLObject)sksi_data_warehousing_utilities.NIL;
        lfi = cdolist_list_var.first();
        while (sksi_data_warehousing_utilities.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject lfi_value = dictionary.dictionary_lookup(lfi_value_cache, lfi, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
            final SubLObject foundP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_data_warehousing_utilities.NIL != foundP) {
                result_exp = cycl_utilities.expression_nsubst(lfi_value, lfi, result_exp, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
            }
            else {
                missingP = (SubLObject)sksi_data_warehousing_utilities.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            lfi = cdolist_list_var.first();
        }
        if (sksi_data_warehousing_utilities.NIL == missingP && (sksi_data_warehousing_utilities.NIL != sksi_query_utilities.comparison_literal_p(result_exp) || (sksi_data_warehousing_utilities.NIL != cycl_utilities.negatedP(result_exp) && sksi_data_warehousing_utilities.NIL != sksi_query_utilities.comparison_literal_p(cycl_utilities.formula_arg1(result_exp, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED))) || sksi_data_warehousing_utilities.NIL != cycl_grammar.cycl_boolean_combination_of_type((SubLObject)sksi_data_warehousing_utilities.$sym2$COMPARISON_LITERAL_P, result_exp))) {
            return closed_decoded_sentence_satisfies_conditionP(result_exp, content_mt, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
        }
        return decoded_sentence_satisfies_condition_intP(result_exp, cms, content_mt, meta_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-data-warehousing-utilities.lisp", position = 2475L)
    public static SubLObject closed_decoded_sentence_satisfies_conditionP_internal(final SubLObject sentence, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == sksi_data_warehousing_utilities.UNPROVIDED) {
            v_properties = (SubLObject)sksi_data_warehousing_utilities.NIL;
        }
        return cyc_kernel.closed_query_success_result_p((sksi_data_warehousing_utilities.NIL != v_properties) ? inference_kernel.new_cyc_query(sentence, mt, v_properties) : inference_kernel.new_cyc_query(sentence, mt, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-data-warehousing-utilities.lisp", position = 2475L)
    public static SubLObject closed_decoded_sentence_satisfies_conditionP(final SubLObject sentence, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == sksi_data_warehousing_utilities.UNPROVIDED) {
            v_properties = (SubLObject)sksi_data_warehousing_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_data_warehousing_utilities.NIL;
        if (sksi_data_warehousing_utilities.NIL == v_memoization_state) {
            return closed_decoded_sentence_satisfies_conditionP_internal(sentence, mt, v_properties);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_data_warehousing_utilities.$sym3$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
        if (sksi_data_warehousing_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_data_warehousing_utilities.$sym3$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_, (SubLObject)sksi_data_warehousing_utilities.THREE_INTEGER, (SubLObject)sksi_data_warehousing_utilities.TWENTY_INTEGER, (SubLObject)sksi_data_warehousing_utilities.EQUAL, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_data_warehousing_utilities.$sym3$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, v_properties);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_data_warehousing_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_data_warehousing_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_data_warehousing_utilities.NIL != cached_args && sksi_data_warehousing_utilities.NIL == cached_args.rest() && v_properties.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(closed_decoded_sentence_satisfies_conditionP_internal(sentence, mt, v_properties)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sentence, mt, v_properties));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-data-warehousing-utilities.lisp", position = 2761L)
    public static SubLObject decoded_sentence_satisfies_condition_intP(final SubLObject sentence, final SubLObject cms, final SubLObject content_mt, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result1 = (SubLObject)sksi_data_warehousing_utilities.NIL;
        SubLObject result2 = (SubLObject)sksi_data_warehousing_utilities.NIL;
        SubLObject ignore_errors_tag = (SubLObject)sksi_data_warehousing_utilities.NIL;
        try {
            thread.throwStack.push(sksi_data_warehousing_utilities.$kw4$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)sksi_data_warehousing_utilities.$sym5$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject antecedent_logical_schema_set = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence(cms);
                    final SubLObject antecedent_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_conditional_meaning_sentence(cms);
                    final SubLObject consequent_logical_schema_set = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence(cms);
                    final SubLObject consequent_sentence = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_conditional_meaning_sentence(cms);
                    final SubLObject consequent_physical_schema_set = sksi_kb_accessors.logical_schemata_physical_schemata(consequent_logical_schema_set);
                    final SubLObject con_ls = consequent_logical_schema_set.first();
                    final SubLObject conditions = (SubLObject)((sksi_data_warehousing_utilities.NIL != el_utilities.atomic_sentenceP(sentence)) ? ConsesLow.list(sentence) : cycl_utilities.formula_args(sentence, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED));
                    SubLObject cons_lf_conditions = (SubLObject)sksi_data_warehousing_utilities.NIL;
                    SubLObject other_conditions = (SubLObject)sksi_data_warehousing_utilities.NIL;
                    SubLObject cdolist_list_var = conditions;
                    SubLObject cond = (SubLObject)sksi_data_warehousing_utilities.NIL;
                    cond = cdolist_list_var.first();
                    while (sksi_data_warehousing_utilities.NIL != cdolist_list_var) {
                        final SubLObject cond_lfis = sksi_infrastructure_utilities.expression_logical_field_indexicals(cond, (SubLObject)sksi_data_warehousing_utilities.T, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
                        SubLObject doneP = (SubLObject)sksi_data_warehousing_utilities.NIL;
                        if (sksi_data_warehousing_utilities.NIL == doneP) {
                            SubLObject csome_list_var = cond_lfis;
                            SubLObject lfi = (SubLObject)sksi_data_warehousing_utilities.NIL;
                            lfi = csome_list_var.first();
                            while (sksi_data_warehousing_utilities.NIL == doneP && sksi_data_warehousing_utilities.NIL != csome_list_var) {
                                if (!sksi_kb_accessors.logical_field_indexical_schema(lfi).eql(con_ls)) {
                                    doneP = (SubLObject)sksi_data_warehousing_utilities.T;
                                }
                                csome_list_var = csome_list_var.rest();
                                lfi = csome_list_var.first();
                            }
                        }
                        if (sksi_data_warehousing_utilities.NIL != doneP) {
                            other_conditions = (SubLObject)ConsesLow.cons(cond, other_conditions);
                        }
                        else {
                            cons_lf_conditions = (SubLObject)ConsesLow.cons(cond, cons_lf_conditions);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        cond = cdolist_list_var.first();
                    }
                    if (sksi_data_warehousing_utilities.NIL != el_utilities.atomic_sentenceP(sentence)) {
                        if (sksi_data_warehousing_utilities.NIL != other_conditions) {
                            thread.resetMultipleValues();
                            final SubLObject from_expression = get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, other_conditions.first(), antecedent_sentence, consequent_sentence, meta_mt);
                            final SubLObject where_expression = thread.secondMultipleValue();
                            final SubLObject sk_source = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            result1 = check_csql_conditions_with_sk_source(from_expression, where_expression, sk_source);
                            result2 = (SubLObject)sksi_data_warehousing_utilities.NIL;
                        }
                        else if (sksi_data_warehousing_utilities.NIL != cons_lf_conditions) {
                            thread.resetMultipleValues();
                            final SubLObject from_expression = get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, cons_lf_conditions.first(), antecedent_sentence, consequent_sentence, meta_mt);
                            final SubLObject where_expression = thread.secondMultipleValue();
                            final SubLObject sk_source = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            result1 = from_expression;
                            result2 = where_expression;
                        }
                    }
                    else if (sksi_data_warehousing_utilities.NIL != cycl_utilities.negatedP(sentence)) {
                        if (sksi_data_warehousing_utilities.NIL != other_conditions) {
                            thread.resetMultipleValues();
                            final SubLObject from_expression = get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, el_utilities.make_negation(other_conditions.first()), antecedent_sentence, consequent_sentence, meta_mt);
                            final SubLObject where_expression = thread.secondMultipleValue();
                            final SubLObject sk_source = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            result1 = check_csql_conditions_with_sk_source(from_expression, where_expression, sk_source);
                            result2 = (SubLObject)sksi_data_warehousing_utilities.NIL;
                        }
                        else if (sksi_data_warehousing_utilities.NIL != cons_lf_conditions) {
                            thread.resetMultipleValues();
                            final SubLObject from_expression = get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, el_utilities.make_negation(cons_lf_conditions.first()), antecedent_sentence, consequent_sentence, meta_mt);
                            final SubLObject where_expression = thread.secondMultipleValue();
                            final SubLObject sk_source = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            result1 = from_expression;
                            result2 = where_expression;
                        }
                    }
                    else if (sksi_data_warehousing_utilities.NIL != el_utilities.el_conjunction_p(sentence)) {
                        SubLObject failP = (SubLObject)sksi_data_warehousing_utilities.NIL;
                        if (sksi_data_warehousing_utilities.NIL != other_conditions) {
                            thread.resetMultipleValues();
                            final SubLObject from_expression2 = get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, el_utilities.make_conjunction(other_conditions), antecedent_sentence, consequent_sentence, meta_mt);
                            final SubLObject where_expression2 = thread.secondMultipleValue();
                            final SubLObject sk_source2 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (sksi_data_warehousing_utilities.NIL == check_csql_conditions_with_sk_source(from_expression2, where_expression2, sk_source2)) {
                                failP = (SubLObject)sksi_data_warehousing_utilities.T;
                                result1 = (SubLObject)sksi_data_warehousing_utilities.NIL;
                                result2 = (SubLObject)sksi_data_warehousing_utilities.NIL;
                            }
                        }
                        if (sksi_data_warehousing_utilities.NIL == failP) {
                            if (sksi_data_warehousing_utilities.NIL != cons_lf_conditions) {
                                thread.resetMultipleValues();
                                final SubLObject from_expression2 = get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, el_utilities.make_conjunction(cons_lf_conditions), antecedent_sentence, consequent_sentence, meta_mt);
                                final SubLObject where_expression2 = thread.secondMultipleValue();
                                final SubLObject sk_source2 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                result1 = from_expression2;
                                result2 = where_expression2;
                            }
                            else {
                                result1 = (SubLObject)sksi_data_warehousing_utilities.T;
                                result2 = (SubLObject)sksi_data_warehousing_utilities.NIL;
                            }
                        }
                    }
                    else if (sksi_data_warehousing_utilities.NIL != el_utilities.el_disjunction_p(sentence)) {
                        SubLObject successP = (SubLObject)sksi_data_warehousing_utilities.NIL;
                        if (sksi_data_warehousing_utilities.NIL != other_conditions) {
                            thread.resetMultipleValues();
                            final SubLObject from_expression2 = get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, el_utilities.make_disjunction(other_conditions), antecedent_sentence, consequent_sentence, meta_mt);
                            final SubLObject where_expression2 = thread.secondMultipleValue();
                            final SubLObject sk_source2 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (sksi_data_warehousing_utilities.NIL != check_csql_conditions_with_sk_source(from_expression2, where_expression2, sk_source2)) {
                                successP = (SubLObject)sksi_data_warehousing_utilities.T;
                                result1 = (SubLObject)sksi_data_warehousing_utilities.T;
                                result2 = (SubLObject)sksi_data_warehousing_utilities.NIL;
                            }
                        }
                        if (sksi_data_warehousing_utilities.NIL == successP) {
                            if (sksi_data_warehousing_utilities.NIL != cons_lf_conditions) {
                                thread.resetMultipleValues();
                                final SubLObject from_expression2 = get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(cms, consequent_physical_schema_set, consequent_logical_schema_set, antecedent_logical_schema_set, el_utilities.make_disjunction(cons_lf_conditions), antecedent_sentence, consequent_sentence, meta_mt);
                                final SubLObject where_expression2 = thread.secondMultipleValue();
                                final SubLObject sk_source2 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                result1 = from_expression2;
                                result2 = where_expression2;
                            }
                            else {
                                result1 = (SubLObject)sksi_data_warehousing_utilities.NIL;
                                result2 = (SubLObject)sksi_data_warehousing_utilities.NIL;
                            }
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_data_warehousing_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_data_warehousing_utilities.$kw4$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(result1, result2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-data-warehousing-utilities.lisp", position = 8197L)
    public static SubLObject check_csql_conditions_with_sk_source(final SubLObject from_expression, final SubLObject where_expression, final SubLObject sk_source) {
        final SubLObject csql = sksi_csql_generation.sksi_make_boolean_csql_query(from_expression, where_expression);
        final SubLObject result = sksi_sks_interaction.generate_boolean_from_csql(csql, sk_source, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-data-warehousing-utilities.lisp", position = 8452L)
    public static SubLObject get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence(final SubLObject cms, final SubLObject consequent_ps_list, final SubLObject consequent_logical_schema_set, final SubLObject antecedent_logical_schema_set, final SubLObject antecedent_sentence, final SubLObject antecedent_meaning_sentence, final SubLObject consequent_sentence, final SubLObject meta_mt) {
        final SubLObject antecedent_physical_schemata = sksi_kb_accessors.logical_schemata_physical_schemata(antecedent_logical_schema_set);
        final SubLObject all_physical_schemata = conses_high.union(consequent_ps_list, antecedent_physical_schemata, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
        final SubLObject new_sk_source = sksi_kb_accessors.nearest_common_super_ks_for_ls_list(conses_high.union(consequent_logical_schema_set, antecedent_logical_schema_set, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED));
        final SubLObject new_content_mt = sksi_kb_accessors.sk_source_content_mt(new_sk_source);
        SubLObject from_expression = (SubLObject)sksi_data_warehousing_utilities.NIL;
        SubLObject where_expression = (SubLObject)sksi_data_warehousing_utilities.NIL;
        from_expression = sksi_query_utilities.get_from_expression_from_antecedent_meaning_sentence_int(antecedent_logical_schema_set, antecedent_sentence, consequent_logical_schema_set, consequent_sentence, new_content_mt, new_sk_source, all_physical_schemata, (SubLObject)sksi_data_warehousing_utilities.NIL);
        where_expression = sksi_query_utilities.get_where_expression_from_antecedent_meaning_sentence_int(sksi_infrastructure_utilities.find_assertion_cycl_memoized(cms, meta_mt, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED), antecedent_meaning_sentence, antecedent_logical_schema_set, consequent_sentence, consequent_logical_schema_set, new_content_mt, new_sk_source, all_physical_schemata, (SubLObject)sksi_data_warehousing_utilities.NIL, (SubLObject)sksi_data_warehousing_utilities.NIL);
        if (sksi_data_warehousing_utilities.NIL != where_expression) {
            where_expression = (SubLObject)ConsesLow.list(where_expression);
        }
        else {
            where_expression = sksi_query_utilities.get_where_expression_from_antecedent_meaning_sentence_int(sksi_infrastructure_utilities.find_assertion_cycl_memoized(cms, meta_mt, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED), antecedent_meaning_sentence, antecedent_logical_schema_set, consequent_sentence, consequent_logical_schema_set, new_content_mt, new_sk_source, all_physical_schemata, (SubLObject)sksi_data_warehousing_utilities.NIL, (SubLObject)sksi_data_warehousing_utilities.NIL);
            where_expression = (SubLObject)ConsesLow.list(where_expression);
            SubLObject cdolist_list_var;
            final SubLObject lfi_list = cdolist_list_var = sksi_infrastructure_utilities.expression_logical_field_indexicals(antecedent_meaning_sentence, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
            SubLObject lfi = (SubLObject)sksi_data_warehousing_utilities.NIL;
            lfi = cdolist_list_var.first();
            while (sksi_data_warehousing_utilities.NIL != cdolist_list_var) {
                final SubLObject lfi_pos = cycl_utilities.arg_positions_dfs(lfi, antecedent_meaning_sentence, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
                final SubLObject lf = sksi_kb_accessors.logical_field_for_indexical(lfi);
                final SubLObject pf_list = sksi_kb_accessors.sksi_get_encoding_mapped_physical_fields_for_logical_field(lf);
                final SubLObject sentence_arg = cycl_utilities.formula_arg_position(antecedent_sentence, lfi_pos.first(), (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
                SubLObject cdolist_list_var_$1 = pf_list;
                SubLObject pf = (SubLObject)sksi_data_warehousing_utilities.NIL;
                pf = cdolist_list_var_$1.first();
                while (sksi_data_warehousing_utilities.NIL != cdolist_list_var_$1) {
                    final SubLObject pf_name = sksi_kb_accessors.physical_field_name(pf);
                    final SubLObject table_name = sksi_kb_accessors.physical_field_sk_source_name(pf);
                    final SubLObject table_namespace = sksi_kb_accessors.physical_field_sk_source_namespace(pf);
                    final SubLObject csql_field = sksi_csql_utilities.construct_csql_field_expression(pf_name, table_name, table_namespace);
                    final SubLObject pfi = sksi_kb_accessors.indexical_for_physical_field(pf);
                    SubLObject cdolist_list_var_$2;
                    final SubLObject field_encoding_list = cdolist_list_var_$2 = sksi_field_translation_utilities.get_field_encodings_for_physical_field_indexical(pfi, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
                    SubLObject encoding = (SubLObject)sksi_data_warehousing_utilities.NIL;
                    encoding = cdolist_list_var_$2.first();
                    while (sksi_data_warehousing_utilities.NIL != cdolist_list_var_$2) {
                        if (sksi_data_warehousing_utilities.NIL != cycl_utilities.expression_find(lfi, encoding, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED)) {
                            final SubLObject new_encoding = cycl_utilities.expression_subst(sentence_arg, lfi, encoding, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
                            final SubLObject reformulated_encoding = sksi_reformulate.sksi_reformulate(new_encoding, (SubLObject)sksi_data_warehousing_utilities.$kw6$ENCODE, new_sk_source);
                            where_expression = (SubLObject)ConsesLow.cons(sksi_csql_utilities.make_csql_expression(sksi_data_warehousing_utilities.$const7$CSQLEquals, (SubLObject)ConsesLow.list(csql_field, reformulated_encoding)), where_expression);
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
        return Values.values(from_expression, where_expression, new_sk_source);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-data-warehousing-utilities.lisp", position = 11789L)
    public static SubLObject decoded_sentence_satisfies_condition_recursiveP(final SubLObject sentence, final SubLObject antecedent_sentence, final SubLObject content_mt) {
        if (sksi_data_warehousing_utilities.NIL != el_utilities.atomic_sentenceP(sentence)) {
            return atomic_sentence_satisfies_conditionP(sentence, antecedent_sentence, content_mt);
        }
        if (sksi_data_warehousing_utilities.NIL != cycl_utilities.negatedP(sentence)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(sksi_data_warehousing_utilities.NIL == decoded_sentence_satisfies_condition_recursiveP(sentence, antecedent_sentence, content_mt));
        }
        if (sksi_data_warehousing_utilities.NIL != el_utilities.el_conjunction_p(sentence)) {
            SubLObject failP = (SubLObject)sksi_data_warehousing_utilities.NIL;
            SubLObject conjunct_index = (SubLObject)sksi_data_warehousing_utilities.ZERO_INTEGER;
            final SubLObject args = cycl_utilities.formula_args(sentence, (SubLObject)sksi_data_warehousing_utilities.$kw1$IGNORE);
            SubLObject rest;
            SubLObject conjunct;
            for (rest = (SubLObject)sksi_data_warehousing_utilities.NIL, rest = args; sksi_data_warehousing_utilities.NIL == failP && sksi_data_warehousing_utilities.NIL != rest; rest = rest.rest()) {
                conjunct = rest.first();
                conjunct_index = Numbers.add(conjunct_index, (SubLObject)sksi_data_warehousing_utilities.ONE_INTEGER);
                if (sksi_data_warehousing_utilities.NIL == decoded_sentence_satisfies_condition_recursiveP(conjunct, cycl_utilities.formula_arg(antecedent_sentence, conjunct_index, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED), content_mt)) {
                    failP = (SubLObject)sksi_data_warehousing_utilities.T;
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(sksi_data_warehousing_utilities.NIL == failP);
        }
        if (sksi_data_warehousing_utilities.NIL != el_utilities.el_disjunction_p(sentence)) {
            SubLObject successP = (SubLObject)sksi_data_warehousing_utilities.NIL;
            SubLObject disjunct_index = (SubLObject)sksi_data_warehousing_utilities.ZERO_INTEGER;
            final SubLObject args = cycl_utilities.formula_args(sentence, (SubLObject)sksi_data_warehousing_utilities.$kw1$IGNORE);
            SubLObject rest;
            SubLObject disjunct;
            for (rest = (SubLObject)sksi_data_warehousing_utilities.NIL, rest = args; sksi_data_warehousing_utilities.NIL == successP && sksi_data_warehousing_utilities.NIL != rest; rest = rest.rest()) {
                disjunct = rest.first();
                disjunct_index = Numbers.add(disjunct_index, (SubLObject)sksi_data_warehousing_utilities.ONE_INTEGER);
                if (sksi_data_warehousing_utilities.NIL != decoded_sentence_satisfies_condition_recursiveP(disjunct, cycl_utilities.formula_arg(antecedent_sentence, disjunct_index, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED), content_mt)) {
                    successP = (SubLObject)sksi_data_warehousing_utilities.T;
                }
            }
            return successP;
        }
        return (SubLObject)sksi_data_warehousing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-data-warehousing-utilities.lisp", position = 12805L)
    public static SubLObject atomic_sentence_satisfies_conditionP(final SubLObject sentence, final SubLObject antecedent_sentence, final SubLObject content_mt) {
        final SubLObject lfi_list = sksi_infrastructure_utilities.expression_logical_field_indexicals(sentence, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
        if (sksi_data_warehousing_utilities.NIL != lfi_list) {
            return open_decoded_sentence_satisfies_conditionP(sentence, antecedent_sentence, content_mt, lfi_list);
        }
        return closed_decoded_sentence_satisfies_conditionP(sentence, content_mt, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-data-warehousing-utilities.lisp", position = 13167L)
    public static SubLObject open_decoded_sentence_satisfies_conditionP(final SubLObject sentence, final SubLObject antecedent_sentence, final SubLObject content_mt, final SubLObject lfi_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!sksi_data_warehousing_utilities.$const8$equals.eql(cycl_utilities.formula_operator(sentence))) {
            return (SubLObject)sksi_data_warehousing_utilities.NIL;
        }
        if (sksi_data_warehousing_utilities.NIL == list_utilities.singletonP(lfi_list)) {
            return (SubLObject)sksi_data_warehousing_utilities.NIL;
        }
        final SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt(content_mt);
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        final SubLObject lfi = lfi_list.first();
        final SubLObject bound_arg = conses_high.set_difference(cycl_utilities.formula_args(sentence, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED), lfi_list, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED).first();
        final SubLObject original_bound_arg = cycl_utilities.formula_arg_position(antecedent_sentence, cycl_utilities.arg_positions_dfs(bound_arg, sentence, Symbols.symbol_function((SubLObject)sksi_data_warehousing_utilities.EQUAL)).first(), (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
        if (sksi_data_warehousing_utilities.NIL == sksi_kb_accessors.logical_field_indexical_p(original_bound_arg)) {
            return sentence;
        }
        SubLObject top_ks = (SubLObject)sksi_data_warehousing_utilities.NIL;
        SubLObject lf = (SubLObject)sksi_data_warehousing_utilities.NIL;
        SubLObject field_isa = (SubLObject)sksi_data_warehousing_utilities.NIL;
        SubLObject ls = (SubLObject)sksi_data_warehousing_utilities.NIL;
        SubLObject sub_ks = (SubLObject)sksi_data_warehousing_utilities.NIL;
        SubLObject query_sentence = (SubLObject)sksi_data_warehousing_utilities.NIL;
        SubLObject query_mt = (SubLObject)sksi_data_warehousing_utilities.NIL;
        SubLObject allowed_modules_list = (SubLObject)sksi_data_warehousing_utilities.NIL;
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
            if (sksi_data_warehousing_utilities.NIL == sub_ks) {
                SubLObject csome_list_var = sksi_kb_accessors.logical_schema_sk_sources_memoized(ls);
                SubLObject candidate = (SubLObject)sksi_data_warehousing_utilities.NIL;
                candidate = csome_list_var.first();
                while (sksi_data_warehousing_utilities.NIL == sub_ks && sksi_data_warehousing_utilities.NIL != csome_list_var) {
                    if (sksi_data_warehousing_utilities.NIL != sksi_kb_accessors.sk_source_sub_ksP(top_ks, candidate)) {
                        sub_ks = candidate;
                    }
                    csome_list_var = csome_list_var.rest();
                    candidate = csome_list_var.first();
                }
            }
            lf = sksi_kb_accessors.logical_field_for_indexical(lfi);
            field_isa = sksi_kb_accessors.logical_field_isa(lf).first();
            query_sentence = el_utilities.make_el_formula(sksi_data_warehousing_utilities.$const9$isa, (SubLObject)ConsesLow.list(bound_arg, field_isa), (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
            query_mt = sksi_kb_accessors.sk_source_content_mt(sub_ks);
            allowed_modules_list = sksi_infrastructure_utilities.sks_to_allowed_modules_list(sub_ks);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (sub_ks.eql(sks)) {
            return query_sentence;
        }
        return closed_decoded_sentence_satisfies_conditionP(query_sentence, query_mt, (SubLObject)ConsesLow.list((SubLObject)sksi_data_warehousing_utilities.$kw10$ALLOWED_MODULES, allowed_modules_list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-data-warehousing-utilities.lisp", position = 15039L)
    public static SubLObject make_sentence_template(final SubLObject sentence) {
        return conses_high.subst_if((SubLObject)sksi_data_warehousing_utilities.$kw11$X, (SubLObject)sksi_data_warehousing_utilities.$sym12$CYC_VAR_, sentence, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-data-warehousing-utilities.lisp", position = 15136L)
    public static SubLObject sksi_template_appropriate_for_schemasP(final SubLObject template, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject replace_atomic_sentence_argsP) {
        if (replace_atomic_sentence_argsP == sksi_data_warehousing_utilities.UNPROVIDED) {
            replace_atomic_sentence_argsP = (SubLObject)sksi_data_warehousing_utilities.NIL;
        }
        final SubLObject template_pred = cycl_utilities.formula_operator(template);
        SubLObject appropriateP = (SubLObject)sksi_data_warehousing_utilities.NIL;
        final SubLObject meaning_sentences = sksi_meaning_sentence_utilities.logical_schema_meaning_sentences(logical_schema, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
        if (sksi_data_warehousing_utilities.NIL != fort_types_interface.predicate_p(template_pred)) {
            if (sksi_data_warehousing_utilities.NIL == appropriateP) {
                SubLObject csome_list_var;
                SubLObject meaning_sentence;
                for (csome_list_var = meaning_sentences, meaning_sentence = (SubLObject)sksi_data_warehousing_utilities.NIL, meaning_sentence = csome_list_var.first(); sksi_data_warehousing_utilities.NIL == appropriateP && sksi_data_warehousing_utilities.NIL != csome_list_var; appropriateP = sksi_template_appropriate_for_schemas_intP(template_pred, template, meaning_sentence, logical_schema, physical_schema, replace_atomic_sentence_argsP), csome_list_var = csome_list_var.rest(), meaning_sentence = csome_list_var.first()) {}
            }
        }
        else if (sksi_data_warehousing_utilities.NIL != el_utilities.cyc_const_logical_operator_p(template_pred)) {
            SubLObject some_meaning_sentence_inappropriateP = (SubLObject)sksi_data_warehousing_utilities.NIL;
            if (sksi_data_warehousing_utilities.NIL == some_meaning_sentence_inappropriateP) {
                SubLObject csome_list_var2 = meaning_sentences;
                SubLObject meaning_sentence2 = (SubLObject)sksi_data_warehousing_utilities.NIL;
                meaning_sentence2 = csome_list_var2.first();
                while (sksi_data_warehousing_utilities.NIL == some_meaning_sentence_inappropriateP && sksi_data_warehousing_utilities.NIL != csome_list_var2) {
                    SubLObject some_conjunct_appropriateP = (SubLObject)sksi_data_warehousing_utilities.NIL;
                    final SubLObject args = cycl_utilities.formula_args(template, (SubLObject)sksi_data_warehousing_utilities.$kw1$IGNORE);
                    SubLObject rest;
                    SubLObject conjunct;
                    for (rest = (SubLObject)sksi_data_warehousing_utilities.NIL, rest = args; sksi_data_warehousing_utilities.NIL == some_conjunct_appropriateP && sksi_data_warehousing_utilities.NIL != rest; rest = rest.rest()) {
                        conjunct = rest.first();
                        if (sksi_data_warehousing_utilities.NIL != sksi_template_appropriate_for_schemas_intP(cycl_utilities.formula_operator(conjunct), conjunct, meaning_sentence2, logical_schema, physical_schema, replace_atomic_sentence_argsP)) {
                            some_conjunct_appropriateP = (SubLObject)sksi_data_warehousing_utilities.T;
                        }
                    }
                    if (sksi_data_warehousing_utilities.NIL == some_conjunct_appropriateP) {
                        some_meaning_sentence_inappropriateP = (SubLObject)sksi_data_warehousing_utilities.T;
                    }
                    csome_list_var2 = csome_list_var2.rest();
                    meaning_sentence2 = csome_list_var2.first();
                }
            }
            appropriateP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_data_warehousing_utilities.NIL == some_meaning_sentence_inappropriateP);
        }
        else {
            Errors.warn((SubLObject)sksi_data_warehousing_utilities.$str13$Unexpected_SKSI_template_type__s, template);
        }
        if (sksi_data_warehousing_utilities.NIL == appropriateP) {
            final SubLObject conditional_meaning_sentence_gafs = sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, (SubLObject)sksi_data_warehousing_utilities.T, (SubLObject)sksi_data_warehousing_utilities.NIL, (SubLObject)sksi_data_warehousing_utilities.NIL);
            if (sksi_data_warehousing_utilities.NIL == appropriateP) {
                SubLObject csome_list_var2 = conditional_meaning_sentence_gafs;
                SubLObject cms_gaf = (SubLObject)sksi_data_warehousing_utilities.NIL;
                cms_gaf = csome_list_var2.first();
                while (sksi_data_warehousing_utilities.NIL == appropriateP && sksi_data_warehousing_utilities.NIL != csome_list_var2) {
                    final SubLObject antecedent_meaning_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(cms_gaf);
                    final SubLObject consequent_meaning_sentence = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(cms_gaf, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
                    final SubLObject new_consequent_sentence = (sksi_data_warehousing_utilities.NIL != sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(consequent_meaning_sentence)) ? sksi_meaning_sentence_utilities.possibly_constrain_consequent_meaning_sentence(antecedent_meaning_sentence, consequent_meaning_sentence) : consequent_meaning_sentence;
                    if (sksi_data_warehousing_utilities.NIL != sksi_template_appropriate_for_schemas_intP(template_pred, template, new_consequent_sentence, logical_schema, physical_schema, replace_atomic_sentence_argsP) && sksi_data_warehousing_utilities.NIL != sksi_meaning_sentence_utilities.supported_conditional_meaning_sentence_gaf_p(cms_gaf, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED)) {
                        appropriateP = consequent_meaning_sentence;
                    }
                    csome_list_var2 = csome_list_var2.rest();
                    cms_gaf = csome_list_var2.first();
                }
            }
        }
        return appropriateP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-data-warehousing-utilities.lisp", position = 17482L)
    public static SubLObject sksi_template_appropriate_for_schemas_intP(final SubLObject template_pred, final SubLObject template, final SubLObject meaning_sentence, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject replace_atomic_sentence_argsP) {
        SubLObject appropriateP = (SubLObject)sksi_data_warehousing_utilities.NIL;
        SubLObject inappropriateP = (SubLObject)sksi_data_warehousing_utilities.NIL;
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(meaning_sentence);
        if (sksi_data_warehousing_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(pred)) {
            final SubLObject pred_list = sksi_infrastructure_utilities.sksi_get_code_mapping_relations_for_logical_field_predicate(pred, logical_schema, physical_schema, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
            if (sksi_data_warehousing_utilities.NIL != pred_list && sksi_data_warehousing_utilities.NIL == list_utilities.member_equalP(template_pred, pred_list)) {
                inappropriateP = (SubLObject)sksi_data_warehousing_utilities.T;
            }
        }
        else if (!template_pred.equal(pred)) {
            inappropriateP = (SubLObject)sksi_data_warehousing_utilities.T;
        }
        if (sksi_data_warehousing_utilities.NIL == inappropriateP) {
            SubLObject pattern;
            final SubLObject sentence = pattern = sksi_meaning_sentence_utilities.sksi_reconstruct_meaning_sentence(meaning_sentence);
            if (sksi_data_warehousing_utilities.NIL != replace_atomic_sentence_argsP) {
                pattern = conses_high.subst_if((SubLObject)sksi_data_warehousing_utilities.$kw14$FULLY_BOUND, (SubLObject)sksi_data_warehousing_utilities.$sym15$ATOMIC_SENTENCE_MEMOIZED_, pattern, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
            }
            pattern = conses_high.subst_if((SubLObject)sksi_data_warehousing_utilities.$kw14$FULLY_BOUND, (SubLObject)sksi_data_warehousing_utilities.$sym16$LOGICAL_FIELD_INDEXICAL_P, pattern, (SubLObject)sksi_data_warehousing_utilities.UNPROVIDED);
            appropriateP = formula_pattern_match.pattern_matches_formula_without_bindings(pattern, template);
            if (sksi_data_warehousing_utilities.NIL != appropriateP) {
                appropriateP = meaning_sentence;
            }
        }
        return appropriateP;
    }
    
    public static SubLObject declare_sksi_data_warehousing_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities", "sksi_encode_memoized_internal", "SKSI-ENCODE-MEMOIZED-INTERNAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities", "sksi_encode_memoized", "SKSI-ENCODE-MEMOIZED", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities", "construct_lfi_value_cache", "CONSTRUCT-LFI-VALUE-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities", "decoded_sentence_satisfies_conditionP", "DECODED-SENTENCE-SATISFIES-CONDITION?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities", "closed_decoded_sentence_satisfies_conditionP_internal", "CLOSED-DECODED-SENTENCE-SATISFIES-CONDITION?-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities", "closed_decoded_sentence_satisfies_conditionP", "CLOSED-DECODED-SENTENCE-SATISFIES-CONDITION?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities", "decoded_sentence_satisfies_condition_intP", "DECODED-SENTENCE-SATISFIES-CONDITION-INT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities", "check_csql_conditions_with_sk_source", "CHECK-CSQL-CONDITIONS-WITH-SK-SOURCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities", "get_from_and_where_expression_for_antecedent_of_conditional_meaning_sentence", "GET-FROM-AND-WHERE-EXPRESSION-FOR-ANTECEDENT-OF-CONDITIONAL-MEANING-SENTENCE", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities", "decoded_sentence_satisfies_condition_recursiveP", "DECODED-SENTENCE-SATISFIES-CONDITION-RECURSIVE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities", "atomic_sentence_satisfies_conditionP", "ATOMIC-SENTENCE-SATISFIES-CONDITION?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities", "open_decoded_sentence_satisfies_conditionP", "OPEN-DECODED-SENTENCE-SATISFIES-CONDITION?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities", "make_sentence_template", "MAKE-SENTENCE-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities", "sksi_template_appropriate_for_schemasP", "SKSI-TEMPLATE-APPROPRIATE-FOR-SCHEMAS?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_data_warehousing_utilities", "sksi_template_appropriate_for_schemas_intP", "SKSI-TEMPLATE-APPROPRIATE-FOR-SCHEMAS-INT?", 6, 0, false);
        return (SubLObject)sksi_data_warehousing_utilities.NIL;
    }
    
    public static SubLObject init_sksi_data_warehousing_utilities_file() {
        return (SubLObject)sksi_data_warehousing_utilities.NIL;
    }
    
    public static SubLObject setup_sksi_data_warehousing_utilities_file() {
        memoization_state.note_memoized_function((SubLObject)sksi_data_warehousing_utilities.$sym0$SKSI_ENCODE_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_data_warehousing_utilities.$sym3$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_);
        return (SubLObject)sksi_data_warehousing_utilities.NIL;
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
        me = (SubLFile)new sksi_data_warehousing_utilities();
        $sym0$SKSI_ENCODE_MEMOIZED = SubLObjectFactory.makeSymbol("SKSI-ENCODE-MEMOIZED");
        $kw1$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym2$COMPARISON_LITERAL_P = SubLObjectFactory.makeSymbol("COMPARISON-LITERAL-P");
        $sym3$CLOSED_DECODED_SENTENCE_SATISFIES_CONDITION_ = SubLObjectFactory.makeSymbol("CLOSED-DECODED-SENTENCE-SATISFIES-CONDITION?");
        $kw4$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym5$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw6$ENCODE = SubLObjectFactory.makeKeyword("ENCODE");
        $const7$CSQLEquals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals"));
        $const8$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $const9$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw10$ALLOWED_MODULES = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $kw11$X = SubLObjectFactory.makeKeyword("X");
        $sym12$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $str13$Unexpected_SKSI_template_type__s = SubLObjectFactory.makeString("Unexpected SKSI template type ~s");
        $kw14$FULLY_BOUND = SubLObjectFactory.makeKeyword("FULLY-BOUND");
        $sym15$ATOMIC_SENTENCE_MEMOIZED_ = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-MEMOIZED?");
        $sym16$LOGICAL_FIELD_INDEXICAL_P = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICAL-P");
    }
}

/*

	Total time: 180 ms
	
*/