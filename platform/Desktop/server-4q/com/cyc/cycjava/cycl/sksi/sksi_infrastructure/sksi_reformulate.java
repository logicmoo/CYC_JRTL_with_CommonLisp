package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sksi.sksi_database_fusion;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.pph_methods_lexicon;
import com.cyc.cycjava.cycl.at_defns;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.evaluation_defns;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.misc_kb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_reformulate extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate";
    public static final String myFingerPrint = "5039d1e6440a1690a7187eede6da3066f14174eee1515a79c49a4b7a1d09ad0b";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 907L)
    public static SubLSymbol $memoize_sksi_reformulateP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 1157L)
    private static SubLSymbol $sksi_reformulate_recursion_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 1452L)
    private static SubLSymbol $current_sksi_reformulate_recursion_level$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 9555L)
    public static SubLSymbol $memoize_sksi_evaluatable_expressionP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 22333L)
    private static SubLSymbol $cmls_decoding_table_caching_state$;
    private static final SubLSymbol $kw0$DONT_CARE;
    private static final SubLSymbol $kw1$UNREFORMULATABLE;
    private static final SubLSymbol $sym2$NON_SKSI_EVALUATABLE_EXPRESSION_;
    private static final SubLSymbol $kw3$ENCODE;
    private static final SubLSymbol $kw4$DECODE;
    private static final SubLSymbol $sym5$SKSI_REFORMULATE_EL_FORMULA_MEMOIZED;
    private static final SubLInteger $int6$2048;
    private static final SubLObject $const7$CSQLOr;
    private static final SubLObject $const8$FunctionToArg;
    private static final SubLObject $const9$CityNamedFn;
    private static final SubLObject $const10$NamesForTermFn;
    private static final SubLSymbol $sym11$SKSI_EVALUATABLE_EXPRESSION__MEMOIZED;
    private static final SubLSymbol $sym12$SKSI_REFORMULATE_INT_MEMOIZED;
    private static final SubLSymbol $kw13$UNINITIALIZED;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$REFORMULATE;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLObject $const18$SchemaObjectFn;
    private static final SubLList $list19;
    private static final SubLObject $const20$TheCurrentKnowledgeSource;
    private static final SubLObject $const21$SourceSchemaObjectFn;
    private static final SubLList $list22;
    private static final SubLSymbol $kw23$EVAL;
    private static final SubLList $list24;
    private static final SubLObject $const25$rewriteOf;
    private static final SubLObject $const26$evaluate;
    private static final SubLSymbol $sym27$CYC_EVALUATE_MEMOIZED;
    private static final SubLList $list28;
    private static final SubLSymbol $kw29$DENOT;
    private static final SubLObject $const30$AllLexicalMicrotheoryPSC;
    private static final SubLObject $const31$termStrings;
    private static final SubLString $str32$Dwimming__s_to__s;
    private static final SubLObject $const33$RDFTripleStore_Physical;
    private static final SubLObject $const34$TheSet;
    private static final SubLString $str35$Could_not_encode_;
    private static final SubLString $str36$_using_logical_schema_;
    private static final SubLString $str37$_as_part_of_;
    private static final SubLSymbol $sym38$SKSI_ENCODE_VIA_CODE_MAPPING;
    private static final SubLObject $const39$codeMapping;
    private static final SubLSymbol $kw40$GAF;
    private static final SubLSymbol $kw41$TRUE;
    private static final SubLSymbol $kw42$UNDECODED;
    private static final SubLObject $const43$canonicalCodeMappingLogicalSchema;
    private static final SubLObject $const44$fieldWithPhysicalValueMapsToPhysi;
    private static final SubLObject $const45$fieldWithPhysicalValueMapsToLogic;
    private static final SubLSymbol $sym46$CMLS_DECODING_TABLE;
    private static final SubLSymbol $sym47$_CMLS_DECODING_TABLE_CACHING_STATE_;
    private static final SubLSymbol $sym48$CLEAR_CMLS_DECODING_TABLE;
    private static final SubLSymbol $sym49$SK_SOURCE_CANONICAL_SK_SOURCE;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 1294L)
    public static SubLObject sksi_reformulate_recursion_limit_exceededP() {
        return Numbers.numG(current_sksi_reformulate_recursion_level(), sksi_reformulate.$sksi_reformulate_recursion_limit$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 1521L)
    public static SubLObject current_sksi_reformulate_recursion_level() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sksi_reformulate.$current_sksi_reformulate_recursion_level$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 1634L)
    public static SubLObject sksi_reformulate(final SubLObject expression, final SubLObject direction, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_reformulate.NIL != cycl_utilities.expression_find((SubLObject)sksi_reformulate.$kw0$DONT_CARE, expression, (SubLObject)sksi_reformulate.UNPROVIDED, (SubLObject)sksi_reformulate.UNPROVIDED, (SubLObject)sksi_reformulate.UNPROVIDED)) {
            return (SubLObject)sksi_reformulate.$kw0$DONT_CARE;
        }
        if (sksi_reformulate.NIL != sksi_reformulate_recursion_limit_exceededP()) {
            return (SubLObject)sksi_reformulate.$kw1$UNREFORMULATABLE;
        }
        if (sksi_reformulate.NIL == sksi_kb_accessors.sk_source_in_any_mt_p(sks)) {
            return (SubLObject)sksi_reformulate.$kw1$UNREFORMULATABLE;
        }
        SubLObject result = (SubLObject)sksi_reformulate.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sksi_evaluation_defns.$current_sksi_reformulate_sks$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sksi_reformulate.$current_sksi_reformulate_recursion_level$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_allowed_rules$.bind(sksi_batch_translate.current_sksi_batch_template_allowed_rules(), thread);
            sksi_evaluation_defns.$current_sksi_reformulate_sks$.bind(sks, thread);
            sksi_reformulate.$current_sksi_reformulate_recursion_level$.bind(number_utilities.f_1X(current_sksi_reformulate_recursion_level()), thread);
            result = sksi_reformulate_internal(expression, direction, sks);
        }
        finally {
            sksi_reformulate.$current_sksi_reformulate_recursion_level$.rebind(_prev_bind_3, thread);
            sksi_evaluation_defns.$current_sksi_reformulate_sks$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 3311L)
    public static SubLObject sksi_reformulatableP(final SubLObject expression, final SubLObject direction, final SubLObject sks) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_reformulate.NIL == sksi_query_utilities.sksi_unreformulatable_p(sksi_reformulate(expression, direction, sks)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 3470L)
    public static SubLObject sksi_reformulate_internal(final SubLObject expression, final SubLObject direction, final SubLObject sks) {
        SubLObject result = sksi_reformulate_recursive(expression, direction, sks);
        if (sksi_reformulate.NIL != cycl_utilities.expression_find_if((SubLObject)sksi_reformulate.$sym2$NON_SKSI_EVALUATABLE_EXPRESSION_, result, (SubLObject)sksi_reformulate.T, (SubLObject)sksi_reformulate.UNPROVIDED)) {
            return (SubLObject)sksi_reformulate.$kw1$UNREFORMULATABLE;
        }
        if (sksi_reformulate.NIL != sksi_true_list_p(result)) {
            result = list_utilities.fast_delete_duplicates(result, (SubLObject)sksi_reformulate.UNPROVIDED, (SubLObject)sksi_reformulate.UNPROVIDED, (SubLObject)sksi_reformulate.UNPROVIDED, (SubLObject)sksi_reformulate.UNPROVIDED, (SubLObject)sksi_reformulate.UNPROVIDED);
            if (sksi_reformulate.NIL != list_utilities.lengthG(result, (SubLObject)sksi_reformulate.ONE_INTEGER, (SubLObject)sksi_reformulate.UNPROVIDED)) {
                if (direction.eql((SubLObject)sksi_reformulate.$kw3$ENCODE)) {
                    result = make_disjunctive_reformulation(result);
                }
                else if (direction.eql((SubLObject)sksi_reformulate.$kw4$DECODE)) {
                    result = el_utilities.make_el_list(result, (SubLObject)sksi_reformulate.UNPROVIDED);
                }
            }
            else {
                result = result.first();
            }
        }
        result = narts_high.nart_substitute(result);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 5073L)
    public static SubLObject sksi_reformulate_recursive(final SubLObject expression, final SubLObject direction, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_reformulate.NIL != cycl_utilities.expression_find((SubLObject)sksi_reformulate.$kw1$UNREFORMULATABLE, expression, (SubLObject)sksi_reformulate.NIL, Symbols.symbol_function((SubLObject)sksi_reformulate.EQ), (SubLObject)sksi_reformulate.UNPROVIDED)) {
            return (SubLObject)sksi_reformulate.$kw1$UNREFORMULATABLE;
        }
        if (sksi_reformulate.NIL == el_utilities.el_formula_p(expression)) {
            return expression;
        }
        SubLObject result = (SubLObject)sksi_reformulate.NIL;
        if (sksi_reformulate.NIL != sksi_reformulate.$memoize_sksi_reformulateP$.getDynamicValue(thread)) {
            result = sksi_reformulate_el_formula_memoized(expression, direction, sks, mt_relevance_macros.mt_info((SubLObject)sksi_reformulate.UNPROVIDED));
        }
        else {
            result = sksi_reformulate_el_formula(expression, direction, sks);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 5626L)
    public static SubLObject sksi_reformulate_el_formula_memoized_internal(final SubLObject expression, final SubLObject direction, final SubLObject sks, final SubLObject mt_info) {
        return sksi_reformulate_el_formula(expression, direction, sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 5626L)
    public static SubLObject sksi_reformulate_el_formula_memoized(final SubLObject expression, final SubLObject direction, final SubLObject sks, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_reformulate.NIL;
        if (sksi_reformulate.NIL == v_memoization_state) {
            return sksi_reformulate_el_formula_memoized_internal(expression, direction, sks, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_reformulate.$sym5$SKSI_REFORMULATE_EL_FORMULA_MEMOIZED, (SubLObject)sksi_reformulate.UNPROVIDED);
        if (sksi_reformulate.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_reformulate.$sym5$SKSI_REFORMULATE_EL_FORMULA_MEMOIZED, (SubLObject)sksi_reformulate.FOUR_INTEGER, (SubLObject)sksi_reformulate.$int6$2048, (SubLObject)sksi_reformulate.EQUAL, (SubLObject)sksi_reformulate.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_reformulate.$sym5$SKSI_REFORMULATE_EL_FORMULA_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(expression, direction, sks, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_reformulate.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_reformulate.NIL;
            collision = cdolist_list_var.first();
            while (sksi_reformulate.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (expression.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (direction.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sks.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sksi_reformulate.NIL != cached_args && sksi_reformulate.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_reformulate_el_formula_memoized_internal(expression, direction, sks, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(expression, direction, sks, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 5993L)
    public static SubLObject sksi_reformulate_el_formula(final SubLObject expression, final SubLObject direction, final SubLObject sks) {
        final SubLObject term_reformulations = sksi_reformulate_terms(cycl_utilities.formula_terms(expression, (SubLObject)sksi_reformulate.UNPROVIDED), direction, sks);
        if (sksi_reformulate.NIL != list_utilities.tree_find((SubLObject)sksi_reformulate.$kw1$UNREFORMULATABLE, term_reformulations, Symbols.symbol_function((SubLObject)sksi_reformulate.EQ), (SubLObject)sksi_reformulate.UNPROVIDED)) {
            return (SubLObject)sksi_reformulate.$kw1$UNREFORMULATABLE;
        }
        if (sksi_reformulate.NIL != disjunctive_reformulation_p(term_reformulations)) {
            SubLObject result = (SubLObject)sksi_reformulate.NIL;
            SubLObject cdolist_list_var = disjunctive_reformulation_reformulations(term_reformulations);
            SubLObject each_reformulation = (SubLObject)sksi_reformulate.NIL;
            each_reformulation = cdolist_list_var.first();
            while (sksi_reformulate.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.cons(sksi_reformulate_int(each_reformulation, direction, sks), result);
                cdolist_list_var = cdolist_list_var.rest();
                each_reformulation = cdolist_list_var.first();
            }
            return Sequences.nreverse(result);
        }
        return sksi_reformulate_int(term_reformulations, direction, sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 6677L)
    public static SubLObject disjunctive_reformulation_p(final SubLObject reformulation) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulation.isCons() && reformulation.first().eql(sksi_reformulate.$const7$CSQLOr));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 6815L)
    public static SubLObject disjunctive_reformulation_reformulations(final SubLObject reformulation) {
        return reformulation.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 6920L)
    public static SubLObject make_disjunctive_reformulation(final SubLObject reformulations) {
        return (SubLObject)ConsesLow.cons(sksi_reformulate.$const7$CSQLOr, reformulations);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 7025L)
    public static SubLObject sksi_reformulate_terms(final SubLObject terms, final SubLObject direction, final SubLObject sks) {
        SubLObject result = (SubLObject)sksi_reformulate.NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)sksi_reformulate.NIL;
        v_term = cdolist_list_var.first();
        while (sksi_reformulate.NIL != cdolist_list_var) {
            final SubLObject reformulated_term = sksi_reformulate_term(v_term, direction, sks);
            if (sksi_reformulate.NIL != sksi_true_list_p(reformulated_term)) {
                final SubLObject new_result = (SubLObject)ConsesLow.make_list(Sequences.length(reformulated_term), (sksi_reformulate.NIL != disjunctive_reformulation_p(result)) ? disjunctive_reformulation_reformulations(result) : result);
                result = (SubLObject)sksi_reformulate.NIL;
                SubLObject each_reformulation = (SubLObject)sksi_reformulate.NIL;
                SubLObject each_reformulation_$1 = (SubLObject)sksi_reformulate.NIL;
                SubLObject each_result = (SubLObject)sksi_reformulate.NIL;
                SubLObject each_result_$2 = (SubLObject)sksi_reformulate.NIL;
                each_reformulation = reformulated_term;
                each_reformulation_$1 = each_reformulation.first();
                each_result = new_result;
                each_result_$2 = each_result.first();
                while (sksi_reformulate.NIL != each_result || sksi_reformulate.NIL != each_reformulation) {
                    result = (SubLObject)ConsesLow.cons(list_utilities.nadd_to_end(each_reformulation_$1, conses_high.copy_list(each_result_$2)), result);
                    each_reformulation = each_reformulation.rest();
                    each_reformulation_$1 = each_reformulation.first();
                    each_result = each_result.rest();
                    each_result_$2 = each_result.first();
                }
                result = make_disjunctive_reformulation(Sequences.nreverse(result));
            }
            else if (sksi_reformulate.NIL != disjunctive_reformulation_p(result)) {
                SubLObject new_result = (SubLObject)sksi_reformulate.NIL;
                SubLObject cdolist_list_var_$3 = disjunctive_reformulation_reformulations(result);
                SubLObject each_result2 = (SubLObject)sksi_reformulate.NIL;
                each_result2 = cdolist_list_var_$3.first();
                while (sksi_reformulate.NIL != cdolist_list_var_$3) {
                    if (each_result2.isList()) {
                        new_result = (SubLObject)ConsesLow.cons(list_utilities.nadd_to_end(reformulated_term, each_result2), new_result);
                    }
                    else {
                        new_result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(each_result2, reformulated_term), new_result);
                    }
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    each_result2 = cdolist_list_var_$3.first();
                }
                result = make_disjunctive_reformulation(Sequences.nreverse(new_result));
            }
            else {
                result = list_utilities.nadd_to_end(reformulated_term, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 8187L)
    public static SubLObject sksi_reformulate_term(final SubLObject v_term, final SubLObject direction, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_reformulate.NIL == function_to_arg_function_with_kappa_predicate_p(v_term) && sksi_reformulate.NIL == el_utilities.lambda_function_p(v_term)) {
            return sksi_reformulate_recursive(v_term, direction, sks);
        }
        if (sksi_reformulate.NIL != sksi_reformulate.$memoize_sksi_reformulateP$.getDynamicValue(thread)) {
            return sksi_reformulate_int_memoized(v_term, direction, sks, mt_relevance_macros.mt_info((SubLObject)sksi_reformulate.UNPROVIDED));
        }
        return sksi_reformulate_int(v_term, direction, sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 8595L)
    public static SubLObject function_to_arg_function_with_kappa_predicate_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_reformulate.NIL != el_utilities.el_formula_with_operator_p(v_object, sksi_reformulate.$const8$FunctionToArg) && sksi_reformulate.NIL != el_utilities.formula_arityE(v_object, (SubLObject)sksi_reformulate.TWO_INTEGER, (SubLObject)sksi_reformulate.UNPROVIDED) && cycl_utilities.nat_arg1(v_object, (SubLObject)sksi_reformulate.UNPROVIDED).isInteger() && sksi_reformulate.NIL != el_utilities.kappa_predicate_p(cycl_utilities.nat_arg2(v_object, (SubLObject)sksi_reformulate.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 8848L)
    public static SubLObject sksi_reformulatable_expressionP(final SubLObject expression) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_reformulate.NIL != sksi_kb_accessors.schema_object_id_fn_expression_p(expression) || sksi_reformulate.NIL != sksi_kb_accessors.schema_object_fn_expression_p(expression) || sksi_reformulate.NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p(expression) || sksi_reformulate.NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(expression) || sksi_reformulate.NIL != misc_kb_utilities.instance_named_fn_expression_p(expression) || sksi_reformulate.NIL != names_for_term_fn_expression_p(expression) || sksi_reformulate.NIL != sksi_evaluatable_expressionP(expression));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 9304L)
    public static SubLObject city_named_fn_expression_p(final SubLObject expression) {
        return el_utilities.el_formula_with_operator_p(expression, sksi_reformulate.$const9$CityNamedFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 9426L)
    public static SubLObject names_for_term_fn_expression_p(final SubLObject expression) {
        return el_utilities.el_formula_with_operator_p(expression, sksi_reformulate.$const10$NamesForTermFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 9622L)
    public static SubLObject sksi_evaluatable_expressionP(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_reformulate.NIL != sksi_reformulate.$memoize_sksi_evaluatable_expressionP$.getDynamicValue(thread)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(sksi_reformulate.NIL != possibly_sksi_evaluatable_expressionP(expression) && sksi_reformulate.NIL != sksi_evaluatable_expressionP_memoized(expression));
        }
        return relation_evaluation.evaluatable_expressionP(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 9905L)
    public static SubLObject possibly_sksi_evaluatable_expressionP(final SubLObject expression) {
        return el_utilities.el_formula_p(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 10068L)
    public static SubLObject sksi_evaluatable_expressionP_memoized_internal(final SubLObject expression) {
        return relation_evaluation.evaluatable_expressionP(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 10068L)
    public static SubLObject sksi_evaluatable_expressionP_memoized(final SubLObject expression) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_reformulate.NIL;
        if (sksi_reformulate.NIL == v_memoization_state) {
            return sksi_evaluatable_expressionP_memoized_internal(expression);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_reformulate.$sym11$SKSI_EVALUATABLE_EXPRESSION__MEMOIZED, (SubLObject)sksi_reformulate.UNPROVIDED);
        if (sksi_reformulate.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_reformulate.$sym11$SKSI_EVALUATABLE_EXPRESSION__MEMOIZED, (SubLObject)sksi_reformulate.ONE_INTEGER, (SubLObject)sksi_reformulate.$int6$2048, (SubLObject)sksi_reformulate.EQUAL, (SubLObject)sksi_reformulate.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_reformulate.$sym11$SKSI_EVALUATABLE_EXPRESSION__MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, expression, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_evaluatable_expressionP_memoized_internal(expression)));
            memoization_state.caching_state_put(caching_state, expression, results, (SubLObject)sksi_reformulate.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 10233L)
    public static SubLObject non_sksi_evaluatable_expressionP(final SubLObject expression) {
        if (sksi_reformulate.NIL != sksi_kb_accessors.schema_object_id_fn_expression_p(expression) || sksi_reformulate.NIL != sksi_kb_accessors.schema_object_fn_expression_p(expression) || sksi_reformulate.NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p(expression) || sksi_reformulate.NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(expression)) {
            return (SubLObject)sksi_reformulate.NIL;
        }
        return sksi_evaluatable_expressionP(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 10592L)
    public static SubLObject sksi_reformulate_int_memoized_internal(final SubLObject expression, final SubLObject direction, final SubLObject sks, final SubLObject mt_info) {
        return sksi_reformulate_int(expression, direction, sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 10592L)
    public static SubLObject sksi_reformulate_int_memoized(final SubLObject expression, final SubLObject direction, final SubLObject sks, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_reformulate.NIL;
        if (sksi_reformulate.NIL == v_memoization_state) {
            return sksi_reformulate_int_memoized_internal(expression, direction, sks, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_reformulate.$sym12$SKSI_REFORMULATE_INT_MEMOIZED, (SubLObject)sksi_reformulate.UNPROVIDED);
        if (sksi_reformulate.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_reformulate.$sym12$SKSI_REFORMULATE_INT_MEMOIZED, (SubLObject)sksi_reformulate.FOUR_INTEGER, (SubLObject)sksi_reformulate.$int6$2048, (SubLObject)sksi_reformulate.EQUAL, (SubLObject)sksi_reformulate.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_reformulate.$sym12$SKSI_REFORMULATE_INT_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(expression, direction, sks, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_reformulate.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_reformulate.NIL;
            collision = cdolist_list_var.first();
            while (sksi_reformulate.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (expression.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (direction.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sks.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sksi_reformulate.NIL != cached_args && sksi_reformulate.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_reformulate_int_memoized_internal(expression, direction, sks, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(expression, direction, sks, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 10802L)
    public static SubLObject sksi_reformulate_int(final SubLObject expression, final SubLObject direction, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_reformulate.$kw1$UNREFORMULATABLE;
        SubLObject support_method = (SubLObject)sksi_reformulate.$kw13$UNINITIALIZED;
        if (sksi_reformulate.NIL != sksi_kb_accessors.schema_object_id_fn_expression_p(expression)) {
            if (direction == sksi_reformulate.$kw3$ENCODE) {
                SubLObject current;
                final SubLObject datum = current = cycl_utilities.formula_args(expression, (SubLObject)sksi_reformulate.UNPROVIDED);
                SubLObject logical_schema = (SubLObject)sksi_reformulate.NIL;
                SubLObject cycl_input = (SubLObject)sksi_reformulate.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reformulate.$list14);
                logical_schema = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reformulate.$list14);
                cycl_input = current.first();
                current = current.rest();
                if (sksi_reformulate.NIL == current) {
                    support_method = (SubLObject)sksi_reformulate.$kw15$REFORMULATE;
                    result = sksi_encode(cycl_input, logical_schema, sks);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_reformulate.$list14);
                }
            }
            else {
                result = expression;
            }
        }
        else if (sksi_reformulate.NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p(expression)) {
            if (direction == sksi_reformulate.$kw3$ENCODE) {
                SubLObject current;
                final SubLObject datum = current = cycl_utilities.formula_args(expression, (SubLObject)sksi_reformulate.UNPROVIDED);
                SubLObject exp_sks = (SubLObject)sksi_reformulate.NIL;
                SubLObject logical_schema2 = (SubLObject)sksi_reformulate.NIL;
                SubLObject cycl_input2 = (SubLObject)sksi_reformulate.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reformulate.$list16);
                exp_sks = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reformulate.$list16);
                logical_schema2 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reformulate.$list16);
                cycl_input2 = current.first();
                current = current.rest();
                if (sksi_reformulate.NIL == current) {
                    support_method = (SubLObject)sksi_reformulate.$kw15$REFORMULATE;
                    result = sksi_encode(cycl_input2, logical_schema2, sks);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_reformulate.$list16);
                }
            }
            else {
                result = expression;
            }
        }
        else if (sksi_reformulate.NIL != sksi_kb_accessors.schema_object_fn_expression_p(expression)) {
            if (direction == sksi_reformulate.$kw4$DECODE) {
                SubLObject current;
                final SubLObject datum = current = cycl_utilities.formula_args(expression, (SubLObject)sksi_reformulate.UNPROVIDED);
                SubLObject logical_schema = (SubLObject)sksi_reformulate.NIL;
                SubLObject raw_input = (SubLObject)sksi_reformulate.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reformulate.$list17);
                logical_schema = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reformulate.$list17);
                raw_input = current.first();
                current = current.rest();
                if (sksi_reformulate.NIL == current) {
                    support_method = (SubLObject)sksi_reformulate.$kw15$REFORMULATE;
                    result = sksi_decode(raw_input, logical_schema, sks, sksi_reformulate.$const18$SchemaObjectFn);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_reformulate.$list17);
                }
            }
            else {
                result = expression;
            }
        }
        else if (sksi_reformulate.NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(expression)) {
            if (direction == sksi_reformulate.$kw4$DECODE) {
                SubLObject current;
                final SubLObject datum = current = cycl_utilities.formula_args(expression, (SubLObject)sksi_reformulate.UNPROVIDED);
                SubLObject exp_sks = (SubLObject)sksi_reformulate.NIL;
                SubLObject logical_schema2 = (SubLObject)sksi_reformulate.NIL;
                SubLObject raw_input2 = (SubLObject)sksi_reformulate.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reformulate.$list19);
                exp_sks = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reformulate.$list19);
                logical_schema2 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reformulate.$list19);
                raw_input2 = current.first();
                current = current.rest();
                if (sksi_reformulate.NIL == current) {
                    support_method = (SubLObject)sksi_reformulate.$kw15$REFORMULATE;
                    result = sksi_decode(raw_input2, logical_schema2, exp_sks.eql(sksi_reformulate.$const20$TheCurrentKnowledgeSource) ? sks : exp_sks, sksi_reformulate.$const21$SourceSchemaObjectFn);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_reformulate.$list19);
                }
            }
            else {
                result = expression;
            }
        }
        else if (sksi_reformulate.NIL != misc_kb_utilities.instance_named_fn_expression_p(expression)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(expression, (SubLObject)sksi_reformulate.UNPROVIDED);
            SubLObject cycl_input3 = (SubLObject)sksi_reformulate.NIL;
            SubLObject entity_type = (SubLObject)sksi_reformulate.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reformulate.$list22);
            cycl_input3 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reformulate.$list22);
            entity_type = current.first();
            current = current.rest();
            final SubLObject guid = (SubLObject)(current.isCons() ? current.first() : sksi_reformulate.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_reformulate.$list22);
            current = current.rest();
            if (sksi_reformulate.NIL == current) {
                if (cycl_input3.isString()) {
                    support_method = (SubLObject)sksi_reformulate.$kw15$REFORMULATE;
                    result = sksi_lexical_decode(string_utilities.trim_whitespace(cycl_input3), entity_type);
                    if (sksi_reformulate.NIL == result) {
                        result = expression;
                    }
                }
                else {
                    result = (SubLObject)sksi_reformulate.$kw1$UNREFORMULATABLE;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_reformulate.$list22);
            }
        }
        else if (sksi_reformulate.NIL != names_for_term_fn_expression_p(expression)) {
            final SubLObject v_term = cycl_utilities.formula_arg1(expression, (SubLObject)sksi_reformulate.UNPROVIDED);
            support_method = (SubLObject)sksi_reformulate.$kw15$REFORMULATE;
            result = sksi_names_for_term(v_term);
        }
        else if (sksi_reformulate.NIL != sksi_evaluatable_expressionP(expression)) {
            thread.resetMultipleValues();
            final SubLObject evaluation_result = cyc_evaluate_memoized(expression, (SubLObject)sksi_reformulate.UNPROVIDED);
            final SubLObject valid_p = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_reformulate.NIL != valid_p) {
                support_method = (SubLObject)sksi_reformulate.$kw23$EVAL;
                result = evaluation_result;
                result = sksi_reformulate_recursive(result, direction, sks);
            }
            else {
                result = expression;
            }
        }
        else {
            if (sksi_reformulate.NIL == city_named_fn_expression_p(expression)) {
                return expression;
            }
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(expression, (SubLObject)sksi_reformulate.UNPROVIDED);
            SubLObject city_string = (SubLObject)sksi_reformulate.NIL;
            SubLObject the_country = (SubLObject)sksi_reformulate.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reformulate.$list24);
            city_string = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_reformulate.$list24);
            the_country = current.first();
            current = current.rest();
            if (sksi_reformulate.NIL == current) {
                if (city_string.isString()) {
                    support_method = (SubLObject)sksi_reformulate.$kw15$REFORMULATE;
                    result = evaluation_defns.city_named_fn_defn(city_string, the_country);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_reformulate.$list24);
            }
        }
        if (result != sksi_reformulate.$kw1$UNREFORMULATABLE && sksi_reformulate.NIL == sksi_uninteresting_reformulationP(result, expression)) {
            if (sksi_reformulate.NIL != sksi_true_list_p(result)) {
                result = list_utilities.fast_delete_duplicates(result, (SubLObject)sksi_reformulate.UNPROVIDED, (SubLObject)sksi_reformulate.UNPROVIDED, (SubLObject)sksi_reformulate.UNPROVIDED, (SubLObject)sksi_reformulate.UNPROVIDED, (SubLObject)sksi_reformulate.UNPROVIDED);
                if (sksi_reformulate.NIL != list_utilities.lengthE(result, (SubLObject)sksi_reformulate.ONE_INTEGER, (SubLObject)sksi_reformulate.UNPROVIDED)) {
                    result = result.first();
                }
            }
            SubLObject support_exp = expression;
            if (sksi_reformulate.NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(expression) || sksi_reformulate.NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p(expression)) {
                final SubLObject canonical_sks = sk_source_canonical_sk_source(sks);
                support_exp = cycl_utilities.expression_subst(canonical_sks, sksi_reformulate.$const20$TheCurrentKnowledgeSource, expression, (SubLObject)sksi_reformulate.UNPROVIDED, (SubLObject)sksi_reformulate.UNPROVIDED);
            }
            final SubLObject pcase_var = support_method;
            if (pcase_var.eql((SubLObject)sksi_reformulate.$kw15$REFORMULATE)) {
                sksi_hl_support_utilities.note_sksi_support(arguments.make_hl_support((SubLObject)sksi_reformulate.$kw15$REFORMULATE, (SubLObject)ConsesLow.list(sksi_reformulate.$const25$rewriteOf, result, support_exp), (SubLObject)sksi_reformulate.UNPROVIDED, (SubLObject)sksi_reformulate.UNPROVIDED));
            }
            else if (pcase_var.eql((SubLObject)sksi_reformulate.$kw23$EVAL)) {
                sksi_hl_support_utilities.note_sksi_support(arguments.make_hl_support((SubLObject)sksi_reformulate.$kw23$EVAL, (SubLObject)ConsesLow.list(sksi_reformulate.$const26$evaluate, result, support_exp), (SubLObject)sksi_reformulate.UNPROVIDED, (SubLObject)sksi_reformulate.UNPROVIDED));
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 15195L)
    public static SubLObject cyc_evaluate_memoized_internal(final SubLObject expression, SubLObject mt_info) {
        if (mt_info == sksi_reformulate.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_reformulate.UNPROVIDED);
        }
        return relation_evaluation.cyc_evaluate(expression);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 15195L)
    public static SubLObject cyc_evaluate_memoized(final SubLObject expression, SubLObject mt_info) {
        if (mt_info == sksi_reformulate.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_reformulate.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_reformulate.NIL;
        if (sksi_reformulate.NIL == v_memoization_state) {
            return cyc_evaluate_memoized_internal(expression, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_reformulate.$sym27$CYC_EVALUATE_MEMOIZED, (SubLObject)sksi_reformulate.UNPROVIDED);
        if (sksi_reformulate.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_reformulate.$sym27$CYC_EVALUATE_MEMOIZED, (SubLObject)sksi_reformulate.TWO_INTEGER, (SubLObject)sksi_reformulate.$int6$2048, (SubLObject)sksi_reformulate.EQUAL, (SubLObject)sksi_reformulate.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_reformulate.$sym27$CYC_EVALUATE_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(expression, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_reformulate.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_reformulate.NIL;
            collision = cdolist_list_var.first();
            while (sksi_reformulate.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (expression.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_reformulate.NIL != cached_args && sksi_reformulate.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cyc_evaluate_memoized_internal(expression, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(expression, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 15385L)
    public static SubLObject sksi_true_list_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_reformulate.NIL != list_utilities.non_empty_list_p(v_object) && !v_object.first().isFunctionSpec() && sksi_reformulate.NIL == sksi_el_formulaP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 15712L)
    public static SubLObject sksi_el_formulaP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_reformulate.NIL != term.nautP(v_object, (SubLObject)sksi_reformulate.UNPROVIDED) || sksi_reformulate.NIL != cycl_grammar.cycl_sentence_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 15932L)
    public static SubLObject sksi_uninteresting_reformulationP(final SubLObject expression, final SubLObject reformulation) {
        return Equality.equal(expression, reformulation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 16297L)
    public static SubLObject sksi_lexical_decode(final SubLObject string_input, final SubLObject entity_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_reformulate.NIL != sdbc.sql_null_p(string_input)) {
            return (SubLObject)sksi_reformulate.$kw1$UNREFORMULATABLE;
        }
        if (!string_input.isString() && sksi_reformulate.NIL == forts.fort_p(entity_type)) {
            return (SubLObject)sksi_reformulate.$kw1$UNREFORMULATABLE;
        }
        SubLObject v_answer = (SubLObject)sksi_reformulate.NIL;
        thread.resetMultipleValues();
        final SubLObject all_forts = lexicon_accessors.denots_of_string(string_input, (SubLObject)sksi_reformulate.$list28, (SubLObject)sksi_reformulate.$kw29$DENOT, (SubLObject)sksi_reformulate.T, (SubLObject)sksi_reformulate.NIL, sksi_reformulate.$const30$AllLexicalMicrotheoryPSC, (SubLObject)sksi_reformulate.UNPROVIDED, (SubLObject)sksi_reformulate.UNPROVIDED, (SubLObject)sksi_reformulate.UNPROVIDED);
        final SubLObject all_pred_lists = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (sksi_reformulate.NIL == v_answer) {
            SubLObject csome_list_var = all_forts;
            SubLObject each_fort = (SubLObject)sksi_reformulate.NIL;
            each_fort = csome_list_var.first();
            while (sksi_reformulate.NIL == v_answer && sksi_reformulate.NIL != csome_list_var) {
                if (sksi_reformulate.NIL != at_defns.quiet_has_typeP(each_fort, entity_type, (SubLObject)sksi_reformulate.UNPROVIDED)) {
                    v_answer = each_fort;
                }
                csome_list_var = csome_list_var.rest();
                each_fort = csome_list_var.first();
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 17023L)
    public static SubLObject sksi_names_for_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_reformulate.NIL == forts.fort_p(v_term)) {
            return (SubLObject)sksi_reformulate.$kw1$UNREFORMULATABLE;
        }
        thread.resetMultipleValues();
        final SubLObject names = pph_methods_lexicon.names_for_term(v_term, sksi_reformulate.$const31$termStrings, sksi_reformulate.$const30$AllLexicalMicrotheoryPSC, (SubLObject)sksi_reformulate.UNPROVIDED);
        final SubLObject pred_lists = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject name = (SubLObject)sksi_reformulate.NIL;
        SubLObject name_$4 = (SubLObject)sksi_reformulate.NIL;
        SubLObject pred_list = (SubLObject)sksi_reformulate.NIL;
        SubLObject pred_list_$5 = (SubLObject)sksi_reformulate.NIL;
        name = names;
        name_$4 = name.first();
        pred_list = pred_lists;
        pred_list_$5 = pred_list.first();
        while (sksi_reformulate.NIL != pred_list || sksi_reformulate.NIL != name) {
            SubLObject cdolist_list_var = pred_list_$5;
            SubLObject pred = (SubLObject)sksi_reformulate.NIL;
            pred = cdolist_list_var.first();
            while (sksi_reformulate.NIL != cdolist_list_var) {
                final SubLObject gaf = kb_indexing.find_gaf_genl_mts(el_utilities.list_to_elf((SubLObject)ConsesLow.list(pred, v_term, name_$4)), sksi_reformulate.$const30$AllLexicalMicrotheoryPSC);
                if (sksi_reformulate.NIL != gaf) {
                    sksi_hl_support_utilities.note_sksi_support(gaf);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
            name = name.rest();
            name_$4 = name.first();
            pred_list = pred_list.rest();
            pred_list_$5 = pred_list.first();
        }
        if (sksi_reformulate.NIL != list_utilities.non_empty_list_p(names)) {
            return el_utilities.make_el_list(names, (SubLObject)sksi_reformulate.UNPROVIDED);
        }
        return (SubLObject)sksi_reformulate.$kw1$UNREFORMULATABLE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 17741L)
    public static SubLObject sksi_encode(final SubLObject cycl_input, final SubLObject logical_schema, final SubLObject sks) {
        if (sksi_reformulate.NIL != sksi_kb_accessors.schema_object_fn_expression_p(cycl_input) && logical_schema.eql(cycl_utilities.nat_arg1(cycl_input, (SubLObject)sksi_reformulate.UNPROVIDED))) {
            return cycl_utilities.nat_arg2(cycl_input, (SubLObject)sksi_reformulate.UNPROVIDED);
        }
        if (sksi_reformulate.NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(cycl_input) && logical_schema.eql(cycl_utilities.nat_arg2(cycl_input, (SubLObject)sksi_reformulate.UNPROVIDED))) {
            return cycl_utilities.nat_arg3(cycl_input, (SubLObject)sksi_reformulate.UNPROVIDED);
        }
        if (sksi_reformulate.NIL != sksi_database_fusion.within_sksi_database_fusionP() && sksi_reformulate.NIL != sksi_kb_accessors.source_schema_object_fn_expression_p(cycl_input) && sksi_reformulate.NIL != sksi_database_fusion.sksi_database_fusion_clones_or_fusionsP(logical_schema, cycl_utilities.nat_arg2(cycl_input, (SubLObject)sksi_reformulate.UNPROVIDED))) {
            if (sksi_reformulate.NIL != sksi_database_fusion.sksi_database_fusion_debugP()) {
                Errors.warn((SubLObject)sksi_reformulate.$str32$Dwimming__s_to__s, cycl_input, cycl_utilities.nat_arg3(cycl_input, (SubLObject)sksi_reformulate.UNPROVIDED));
            }
            return cycl_utilities.nat_arg3(cycl_input, (SubLObject)sksi_reformulate.UNPROVIDED);
        }
        if (sksi_reformulate.$const33$RDFTripleStore_Physical.eql(sksi_sks_accessors.sks_get_type(sks)) && sksi_reformulate.NIL != el_utilities.el_set_p(cycl_input)) {
            SubLObject set_encoding = (SubLObject)sksi_reformulate.NIL;
            set_encoding = (SubLObject)ConsesLow.cons(sksi_reformulate.$const34$TheSet, set_encoding);
            SubLObject cdolist_list_var = el_utilities.el_set_items(cycl_input);
            SubLObject set_elem = (SubLObject)sksi_reformulate.NIL;
            set_elem = cdolist_list_var.first();
            while (sksi_reformulate.NIL != cdolist_list_var) {
                final SubLObject set_elem_encoded = sksi_encode(set_elem, logical_schema, sks);
                if (sksi_reformulate.$kw1$UNREFORMULATABLE == set_elem_encoded) {
                    sksi_debugging.sksi_error(Sequences.cconcatenate((SubLObject)sksi_reformulate.$str35$Could_not_encode_, new SubLObject[] { format_nil.format_nil_a_no_copy(set_elem), sksi_reformulate.$str36$_using_logical_schema_, format_nil.format_nil_a_no_copy(logical_schema), sksi_reformulate.$str37$_as_part_of_, format_nil.format_nil_a_no_copy(cycl_input) }));
                    return (SubLObject)sksi_reformulate.$kw1$UNREFORMULATABLE;
                }
                set_encoding = (SubLObject)ConsesLow.cons(set_elem_encoded, set_encoding);
                cdolist_list_var = cdolist_list_var.rest();
                set_elem = cdolist_list_var.first();
            }
            return Sequences.nreverse(set_encoding);
        }
        return sksi_encode_via_code_mapping(cycl_input, logical_schema, sks);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 19734L)
    public static SubLObject sksi_encode_via_code_mapping_internal(final SubLObject cycl_input, final SubLObject cmls, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_reformulate.NIL;
        if (sks.eql(sksi_reformulate.$const20$TheCurrentKnowledgeSource)) {
            result = sksi_encode_via_code_mapping_int(cycl_input, cmls);
        }
        else {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(sksi_kb_accessors.sk_source_mapping_mt(sks));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                result = sksi_encode_via_code_mapping_int(cycl_input, cmls);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        if (sksi_reformulate.NIL != result) {
            return (sksi_reformulate.NIL != list_utilities.singletonP(result)) ? result.first() : result;
        }
        return (SubLObject)sksi_reformulate.$kw1$UNREFORMULATABLE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 19734L)
    public static SubLObject sksi_encode_via_code_mapping(final SubLObject cycl_input, final SubLObject cmls, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_reformulate.NIL;
        if (sksi_reformulate.NIL == v_memoization_state) {
            return sksi_encode_via_code_mapping_internal(cycl_input, cmls, sks);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_reformulate.$sym38$SKSI_ENCODE_VIA_CODE_MAPPING, (SubLObject)sksi_reformulate.UNPROVIDED);
        if (sksi_reformulate.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_reformulate.$sym38$SKSI_ENCODE_VIA_CODE_MAPPING, (SubLObject)sksi_reformulate.THREE_INTEGER, (SubLObject)sksi_reformulate.$int6$2048, (SubLObject)sksi_reformulate.EQUAL, (SubLObject)sksi_reformulate.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_reformulate.$sym38$SKSI_ENCODE_VIA_CODE_MAPPING, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(cycl_input, cmls, sks);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_reformulate.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_reformulate.NIL;
            collision = cdolist_list_var.first();
            while (sksi_reformulate.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (cycl_input.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (cmls.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_reformulate.NIL != cached_args && sksi_reformulate.NIL == cached_args.rest() && sks.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_encode_via_code_mapping_internal(cycl_input, cmls, sks)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(cycl_input, cmls, sks));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 20215L)
    public static SubLObject sksi_encode_via_code_mapping_int(final SubLObject cycl_input, final SubLObject cmls) {
        SubLObject result = (SubLObject)sksi_reformulate.NIL;
        final SubLObject pred_var = sksi_reformulate.$const39$codeMapping;
        if (sksi_reformulate.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(czer_main.canonicalize_term(cycl_input, (SubLObject)sksi_reformulate.UNPROVIDED), (SubLObject)sksi_reformulate.THREE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(czer_main.canonicalize_term(cycl_input, (SubLObject)sksi_reformulate.UNPROVIDED), (SubLObject)sksi_reformulate.THREE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)sksi_reformulate.NIL;
            final SubLObject token_var = (SubLObject)sksi_reformulate.NIL;
            while (sksi_reformulate.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (sksi_reformulate.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)sksi_reformulate.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_reformulate.$kw40$GAF, (SubLObject)sksi_reformulate.$kw41$TRUE, (SubLObject)sksi_reformulate.NIL);
                        SubLObject done_var_$6 = (SubLObject)sksi_reformulate.NIL;
                        final SubLObject token_var_$7 = (SubLObject)sksi_reformulate.NIL;
                        while (sksi_reformulate.NIL == done_var_$6) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                            final SubLObject valid_$8 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$7.eql(ass));
                            if (sksi_reformulate.NIL != valid_$8) {
                                final SubLObject ass_cmls = assertions_high.gaf_arg1(ass);
                                if (sksi_reformulate.NIL != czer_utilities.terms_equal_at_elP(ass_cmls, cmls, (SubLObject)sksi_reformulate.UNPROVIDED)) {
                                    final SubLObject raw = assertions_high.gaf_arg2(ass);
                                    result = (SubLObject)ConsesLow.cons(raw, result);
                                }
                            }
                            done_var_$6 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_reformulate.NIL == valid_$8);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_reformulate.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (sksi_reformulate.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_reformulate.NIL == valid);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 20565L)
    public static SubLObject sksi_decode(SubLObject raw_input, final SubLObject cmls, final SubLObject sks, final SubLObject func) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_reformulate.NIL;
        thread.resetMultipleValues();
        final SubLObject result_$9 = sksi_decode_via_override_assertions(raw_input, cmls, sks);
        final SubLObject raw_input_$10 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = result_$9;
        raw_input = raw_input_$10;
        if (sksi_reformulate.NIL != result) {
            return result;
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(sksi_kb_accessors.sk_source_mapping_mt(sks));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = sksi_decode_via_code_mapping_int(raw_input, cmls);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (sksi_reformulate.NIL != sdbc.sql_null_p(raw_input)) {
            return (SubLObject)sksi_reformulate.$kw42$UNDECODED;
        }
        return (sksi_reformulate.NIL != result) ? result : (func.eql(sksi_reformulate.$const18$SchemaObjectFn) ? el_utilities.make_el_formula(sksi_reformulate.$const18$SchemaObjectFn, (SubLObject)ConsesLow.list(cmls, raw_input), (SubLObject)sksi_reformulate.UNPROVIDED) : el_utilities.make_el_formula(sksi_reformulate.$const21$SourceSchemaObjectFn, (SubLObject)ConsesLow.list(sk_source_canonical_sk_source(sks), cmls, raw_input), (SubLObject)sksi_reformulate.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 21276L)
    public static SubLObject sksi_decode_via_override_assertions(SubLObject raw_input, final SubLObject cmls, final SubLObject sks) {
        SubLObject result = (SubLObject)sksi_reformulate.NIL;
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        final SubLObject pf = kb_mapping_utilities.fpred_value_in_relevant_mts(cmls, sksi_reformulate.$const43$canonicalCodeMappingLogicalSchema, mapping_mt, (SubLObject)sksi_reformulate.TWO_INTEGER, (SubLObject)sksi_reformulate.ONE_INTEGER, (SubLObject)sksi_reformulate.UNPROVIDED);
        if (sksi_reformulate.NIL != pf) {
            final SubLObject p_to_p_gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts(sksi_reformulate.$const44$fieldWithPhysicalValueMapsToPhysi, pf, raw_input, mapping_mt, (SubLObject)sksi_reformulate.ONE_INTEGER, (SubLObject)sksi_reformulate.TWO_INTEGER, (SubLObject)sksi_reformulate.UNPROVIDED);
            if (sksi_reformulate.NIL != assertions_high.gaf_assertionP(p_to_p_gaf)) {
                raw_input = assertions_high.gaf_arg3(p_to_p_gaf);
            }
            final SubLObject p_to_l_gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts(sksi_reformulate.$const45$fieldWithPhysicalValueMapsToLogic, pf, raw_input, mapping_mt, (SubLObject)sksi_reformulate.ONE_INTEGER, (SubLObject)sksi_reformulate.TWO_INTEGER, (SubLObject)sksi_reformulate.UNPROVIDED);
            if (sksi_reformulate.NIL != assertions_high.gaf_assertionP(p_to_l_gaf)) {
                result = assertions_high.gaf_arg3(p_to_l_gaf);
            }
        }
        return Values.values(result, raw_input);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 22140L)
    public static SubLObject sksi_decode_via_code_mapping_int(final SubLObject raw_input, final SubLObject cmls) {
        if (sksi_reformulate.NIL != forts.fort_p(cmls)) {
            final SubLObject table = cmls_decoding_table(cmls);
            return Hashtables.gethash_without_values(raw_input, table, (SubLObject)sksi_reformulate.UNPROVIDED);
        }
        return (SubLObject)sksi_reformulate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 22333L)
    public static SubLObject clear_cmls_decoding_table() {
        final SubLObject cs = sksi_reformulate.$cmls_decoding_table_caching_state$.getGlobalValue();
        if (sksi_reformulate.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sksi_reformulate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 22333L)
    public static SubLObject remove_cmls_decoding_table(final SubLObject cmls) {
        return memoization_state.caching_state_remove_function_results_with_args(sksi_reformulate.$cmls_decoding_table_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(cmls), (SubLObject)sksi_reformulate.UNPROVIDED, (SubLObject)sksi_reformulate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 22333L)
    public static SubLObject cmls_decoding_table_internal(final SubLObject cmls) {
        final SubLObject size = kb_indexing.num_gaf_arg_index(cmls, (SubLObject)sksi_reformulate.ONE_INTEGER, sksi_reformulate.$const39$codeMapping, (SubLObject)sksi_reformulate.UNPROVIDED);
        final SubLObject table = Hashtables.make_hash_table(size, Symbols.symbol_function((SubLObject)sksi_reformulate.EQUAL), (SubLObject)sksi_reformulate.UNPROVIDED);
        final SubLObject pred_var = sksi_reformulate.$const39$codeMapping;
        if (sksi_reformulate.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(cmls, (SubLObject)sksi_reformulate.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(cmls, (SubLObject)sksi_reformulate.ONE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)sksi_reformulate.NIL;
            final SubLObject token_var = (SubLObject)sksi_reformulate.NIL;
            while (sksi_reformulate.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (sksi_reformulate.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)sksi_reformulate.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sksi_reformulate.$kw40$GAF, (SubLObject)sksi_reformulate.$kw41$TRUE, (SubLObject)sksi_reformulate.NIL);
                        SubLObject done_var_$11 = (SubLObject)sksi_reformulate.NIL;
                        final SubLObject token_var_$12 = (SubLObject)sksi_reformulate.NIL;
                        while (sksi_reformulate.NIL == done_var_$11) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$12);
                            final SubLObject valid_$13 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$12.eql(ass));
                            if (sksi_reformulate.NIL != valid_$13) {
                                final SubLObject code = assertions_high.gaf_arg2(ass);
                                final SubLObject v_term = assertions_high.gaf_arg3(ass);
                                Hashtables.sethash(code, table, v_term);
                            }
                            done_var_$11 = (SubLObject)SubLObjectFactory.makeBoolean(sksi_reformulate.NIL == valid_$13);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_reformulate.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (sksi_reformulate.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_reformulate.NIL == valid);
            }
        }
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 22333L)
    public static SubLObject cmls_decoding_table(final SubLObject cmls) {
        SubLObject caching_state = sksi_reformulate.$cmls_decoding_table_caching_state$.getGlobalValue();
        if (sksi_reformulate.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sksi_reformulate.$sym46$CMLS_DECODING_TABLE, (SubLObject)sksi_reformulate.$sym47$_CMLS_DECODING_TABLE_CACHING_STATE_, (SubLObject)sksi_reformulate.NIL, (SubLObject)sksi_reformulate.EQ, (SubLObject)sksi_reformulate.ONE_INTEGER, (SubLObject)sksi_reformulate.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)sksi_reformulate.$sym48$CLEAR_CMLS_DECODING_TABLE);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, cmls, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cmls_decoding_table_internal(cmls)));
            memoization_state.caching_state_put(caching_state, cmls, results, (SubLObject)sksi_reformulate.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 22879L)
    public static SubLObject sk_source_canonical_sk_source_internal(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
        SubLObject canonical_sk_source = (SubLObject)sksi_reformulate.NIL;
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            canonical_sk_source = sksi_infrastructure_utilities.source_schema_object_fn_canonical_sks(sk_source);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (sksi_reformulate.NIL != canonical_sk_source) ? canonical_sk_source : sk_source;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-reformulate.lisp", position = 22879L)
    public static SubLObject sk_source_canonical_sk_source(final SubLObject sk_source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_reformulate.NIL;
        if (sksi_reformulate.NIL == v_memoization_state) {
            return sk_source_canonical_sk_source_internal(sk_source);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_reformulate.$sym49$SK_SOURCE_CANONICAL_SK_SOURCE, (SubLObject)sksi_reformulate.UNPROVIDED);
        if (sksi_reformulate.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_reformulate.$sym49$SK_SOURCE_CANONICAL_SK_SOURCE, (SubLObject)sksi_reformulate.ONE_INTEGER, (SubLObject)sksi_reformulate.NIL, (SubLObject)sksi_reformulate.EQ, (SubLObject)sksi_reformulate.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_reformulate.$sym49$SK_SOURCE_CANONICAL_SK_SOURCE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sk_source_canonical_sk_source_internal(sk_source)));
            memoization_state.caching_state_put(caching_state, sk_source, results, (SubLObject)sksi_reformulate.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    public static SubLObject declare_sksi_reformulate_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_reformulate_recursion_limit_exceededP", "SKSI-REFORMULATE-RECURSION-LIMIT-EXCEEDED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "current_sksi_reformulate_recursion_level", "CURRENT-SKSI-REFORMULATE-RECURSION-LEVEL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_reformulate", "SKSI-REFORMULATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_reformulatableP", "SKSI-REFORMULATABLE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_reformulate_internal", "SKSI-REFORMULATE-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_reformulate_recursive", "SKSI-REFORMULATE-RECURSIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_reformulate_el_formula_memoized_internal", "SKSI-REFORMULATE-EL-FORMULA-MEMOIZED-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_reformulate_el_formula_memoized", "SKSI-REFORMULATE-EL-FORMULA-MEMOIZED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_reformulate_el_formula", "SKSI-REFORMULATE-EL-FORMULA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "disjunctive_reformulation_p", "DISJUNCTIVE-REFORMULATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "disjunctive_reformulation_reformulations", "DISJUNCTIVE-REFORMULATION-REFORMULATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "make_disjunctive_reformulation", "MAKE-DISJUNCTIVE-REFORMULATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_reformulate_terms", "SKSI-REFORMULATE-TERMS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_reformulate_term", "SKSI-REFORMULATE-TERM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "function_to_arg_function_with_kappa_predicate_p", "FUNCTION-TO-ARG-FUNCTION-WITH-KAPPA-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_reformulatable_expressionP", "SKSI-REFORMULATABLE-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "city_named_fn_expression_p", "CITY-NAMED-FN-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "names_for_term_fn_expression_p", "NAMES-FOR-TERM-FN-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_evaluatable_expressionP", "SKSI-EVALUATABLE-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "possibly_sksi_evaluatable_expressionP", "POSSIBLY-SKSI-EVALUATABLE-EXPRESSION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_evaluatable_expressionP_memoized_internal", "SKSI-EVALUATABLE-EXPRESSION?-MEMOIZED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_evaluatable_expressionP_memoized", "SKSI-EVALUATABLE-EXPRESSION?-MEMOIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "non_sksi_evaluatable_expressionP", "NON-SKSI-EVALUATABLE-EXPRESSION?", 1, 0, false);
        new $non_sksi_evaluatable_expressionP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_reformulate_int_memoized_internal", "SKSI-REFORMULATE-INT-MEMOIZED-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_reformulate_int_memoized", "SKSI-REFORMULATE-INT-MEMOIZED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_reformulate_int", "SKSI-REFORMULATE-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "cyc_evaluate_memoized_internal", "CYC-EVALUATE-MEMOIZED-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "cyc_evaluate_memoized", "CYC-EVALUATE-MEMOIZED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_true_list_p", "SKSI-TRUE-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_el_formulaP", "SKSI-EL-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_uninteresting_reformulationP", "SKSI-UNINTERESTING-REFORMULATION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_lexical_decode", "SKSI-LEXICAL-DECODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_names_for_term", "SKSI-NAMES-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_encode", "SKSI-ENCODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_encode_via_code_mapping_internal", "SKSI-ENCODE-VIA-CODE-MAPPING-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_encode_via_code_mapping", "SKSI-ENCODE-VIA-CODE-MAPPING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_encode_via_code_mapping_int", "SKSI-ENCODE-VIA-CODE-MAPPING-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_decode", "SKSI-DECODE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_decode_via_override_assertions", "SKSI-DECODE-VIA-OVERRIDE-ASSERTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sksi_decode_via_code_mapping_int", "SKSI-DECODE-VIA-CODE-MAPPING-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "clear_cmls_decoding_table", "CLEAR-CMLS-DECODING-TABLE", 0, 0, false);
        new $clear_cmls_decoding_table$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "remove_cmls_decoding_table", "REMOVE-CMLS-DECODING-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "cmls_decoding_table_internal", "CMLS-DECODING-TABLE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "cmls_decoding_table", "CMLS-DECODING-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sk_source_canonical_sk_source_internal", "SK-SOURCE-CANONICAL-SK-SOURCE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate", "sk_source_canonical_sk_source", "SK-SOURCE-CANONICAL-SK-SOURCE", 1, 0, false);
        return (SubLObject)sksi_reformulate.NIL;
    }
    
    public static SubLObject init_sksi_reformulate_file() {
        sksi_reformulate.$memoize_sksi_reformulateP$ = SubLFiles.defparameter("*MEMOIZE-SKSI-REFORMULATE?*", (SubLObject)sksi_reformulate.T);
        sksi_reformulate.$sksi_reformulate_recursion_limit$ = SubLFiles.deflexical("*SKSI-REFORMULATE-RECURSION-LIMIT*", (SubLObject)sksi_reformulate.FIVE_INTEGER);
        sksi_reformulate.$current_sksi_reformulate_recursion_level$ = SubLFiles.defparameter("*CURRENT-SKSI-REFORMULATE-RECURSION-LEVEL*", (SubLObject)sksi_reformulate.ZERO_INTEGER);
        sksi_reformulate.$memoize_sksi_evaluatable_expressionP$ = SubLFiles.defparameter("*MEMOIZE-SKSI-EVALUATABLE-EXPRESSION?*", (SubLObject)sksi_reformulate.T);
        sksi_reformulate.$cmls_decoding_table_caching_state$ = SubLFiles.deflexical("*CMLS-DECODING-TABLE-CACHING-STATE*", (SubLObject)sksi_reformulate.NIL);
        return (SubLObject)sksi_reformulate.NIL;
    }
    
    public static SubLObject setup_sksi_reformulate_file() {
        memoization_state.note_memoized_function((SubLObject)sksi_reformulate.$sym5$SKSI_REFORMULATE_EL_FORMULA_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_reformulate.$sym11$SKSI_EVALUATABLE_EXPRESSION__MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_reformulate.$sym12$SKSI_REFORMULATE_INT_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_reformulate.$sym27$CYC_EVALUATE_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_reformulate.$sym38$SKSI_ENCODE_VIA_CODE_MAPPING);
        memoization_state.note_globally_cached_function((SubLObject)sksi_reformulate.$sym46$CMLS_DECODING_TABLE);
        memoization_state.note_memoized_function((SubLObject)sksi_reformulate.$sym49$SK_SOURCE_CANONICAL_SK_SOURCE);
        return (SubLObject)sksi_reformulate.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_reformulate_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_reformulate_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_reformulate_file();
    }
    
    static {
        me = (SubLFile)new sksi_reformulate();
        sksi_reformulate.$memoize_sksi_reformulateP$ = null;
        sksi_reformulate.$sksi_reformulate_recursion_limit$ = null;
        sksi_reformulate.$current_sksi_reformulate_recursion_level$ = null;
        sksi_reformulate.$memoize_sksi_evaluatable_expressionP$ = null;
        sksi_reformulate.$cmls_decoding_table_caching_state$ = null;
        $kw0$DONT_CARE = SubLObjectFactory.makeKeyword("DONT-CARE");
        $kw1$UNREFORMULATABLE = SubLObjectFactory.makeKeyword("UNREFORMULATABLE");
        $sym2$NON_SKSI_EVALUATABLE_EXPRESSION_ = SubLObjectFactory.makeSymbol("NON-SKSI-EVALUATABLE-EXPRESSION?");
        $kw3$ENCODE = SubLObjectFactory.makeKeyword("ENCODE");
        $kw4$DECODE = SubLObjectFactory.makeKeyword("DECODE");
        $sym5$SKSI_REFORMULATE_EL_FORMULA_MEMOIZED = SubLObjectFactory.makeSymbol("SKSI-REFORMULATE-EL-FORMULA-MEMOIZED");
        $int6$2048 = SubLObjectFactory.makeInteger(2048);
        $const7$CSQLOr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLOr"));
        $const8$FunctionToArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FunctionToArg"));
        $const9$CityNamedFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityNamedFn"));
        $const10$NamesForTermFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NamesForTermFn"));
        $sym11$SKSI_EVALUATABLE_EXPRESSION__MEMOIZED = SubLObjectFactory.makeSymbol("SKSI-EVALUATABLE-EXPRESSION?-MEMOIZED");
        $sym12$SKSI_REFORMULATE_INT_MEMOIZED = SubLObjectFactory.makeSymbol("SKSI-REFORMULATE-INT-MEMOIZED");
        $kw13$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-INPUT"));
        $kw15$REFORMULATE = SubLObjectFactory.makeKeyword("REFORMULATE");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXP-SKS"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-INPUT"));
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-INPUT"));
        $const18$SchemaObjectFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn"));
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXP-SKS"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-INPUT"));
        $const20$TheCurrentKnowledgeSource = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCurrentKnowledgeSource"));
        $const21$SourceSchemaObjectFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SourceSchemaObjectFn"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-INPUT"), (SubLObject)SubLObjectFactory.makeSymbol("ENTITY-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("GUID"));
        $kw23$EVAL = SubLObjectFactory.makeKeyword("EVAL");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CITY-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("THE-COUNTRY"));
        $const25$rewriteOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rewriteOf"));
        $const26$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $sym27$CYC_EVALUATE_MEMOIZED = SubLObjectFactory.makeSymbol("CYC-EVALUATE-MEMOIZED");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABBREVS"), (SubLObject)SubLObjectFactory.makeKeyword("ACRONYMS"));
        $kw29$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $const30$AllLexicalMicrotheoryPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllLexicalMicrotheoryPSC"));
        $const31$termStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $str32$Dwimming__s_to__s = SubLObjectFactory.makeString("Dwimming ~s to ~s");
        $const33$RDFTripleStore_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RDFTripleStore-Physical"));
        $const34$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $str35$Could_not_encode_ = SubLObjectFactory.makeString("Could not encode ");
        $str36$_using_logical_schema_ = SubLObjectFactory.makeString(" using logical schema ");
        $str37$_as_part_of_ = SubLObjectFactory.makeString(" as part of ");
        $sym38$SKSI_ENCODE_VIA_CODE_MAPPING = SubLObjectFactory.makeSymbol("SKSI-ENCODE-VIA-CODE-MAPPING");
        $const39$codeMapping = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("codeMapping"));
        $kw40$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw41$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw42$UNDECODED = SubLObjectFactory.makeKeyword("UNDECODED");
        $const43$canonicalCodeMappingLogicalSchema = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("canonicalCodeMappingLogicalSchema"));
        $const44$fieldWithPhysicalValueMapsToPhysi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldWithPhysicalValueMapsToPhysicalValue"));
        $const45$fieldWithPhysicalValueMapsToLogic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldWithPhysicalValueMapsToLogicalValue"));
        $sym46$CMLS_DECODING_TABLE = SubLObjectFactory.makeSymbol("CMLS-DECODING-TABLE");
        $sym47$_CMLS_DECODING_TABLE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CMLS-DECODING-TABLE-CACHING-STATE*");
        $sym48$CLEAR_CMLS_DECODING_TABLE = SubLObjectFactory.makeSymbol("CLEAR-CMLS-DECODING-TABLE");
        $sym49$SK_SOURCE_CANONICAL_SK_SOURCE = SubLObjectFactory.makeSymbol("SK-SOURCE-CANONICAL-SK-SOURCE");
    }
    
    public static final class $non_sksi_evaluatable_expressionP$UnaryFunction extends UnaryFunction
    {
        public $non_sksi_evaluatable_expressionP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NON-SKSI-EVALUATABLE-EXPRESSION?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sksi_reformulate.non_sksi_evaluatable_expressionP(arg1);
        }
    }
    
    public static final class $clear_cmls_decoding_table$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_cmls_decoding_table$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-CMLS-DECODING-TABLE"));
        }
        
        @Override
		public SubLObject processItem() {
            return sksi_reformulate.clear_cmls_decoding_table();
        }
    }
}

/*

	Total time: 268 ms
	
*/