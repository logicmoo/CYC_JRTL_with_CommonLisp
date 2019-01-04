package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.backward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_relation_all extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all";
    public static final String myFingerPrint = "2b509e8e853db926767f6557d255411fa42b69ab0c3a55b12c601d2defe7fa72";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all.lisp", position = 1380L)
    private static SubLSymbol $estimated_per_collection_relation_all_fraction$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all.lisp", position = 1836L)
    private static SubLSymbol $relation_all_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all.lisp", position = 1991L)
    public static SubLSymbol $relation_all_defining_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all.lisp", position = 2585L)
    private static SubLSymbol $removal_relation_all_check_cost$;
    private static final SubLObject $const0$relationAll;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$_RELATION_ALL_DEFINING_MT_;
    private static final SubLObject $const3$BaseKB;
    private static final SubLSymbol $kw4$CODE;
    private static final SubLSymbol $kw5$TRUE_MON;
    private static final SubLFloat $float6$1_5;
    private static final SubLSymbol $kw7$GAF;
    private static final SubLSymbol $kw8$TRUE;
    private static final SubLSymbol $kw9$REMOVAL_RELATION_ALL_CHECK;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$ISA;
    private static final SubLObject $const12$isa;
    private static final SubLSymbol $sym13$FORT_P;
    private static final SubLSymbol $kw14$BREADTH;
    private static final SubLSymbol $kw15$DEPTH;
    private static final SubLSymbol $kw16$STACK;
    private static final SubLSymbol $kw17$QUEUE;
    private static final SubLSymbol $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw19$ERROR;
    private static final SubLString $str20$_A_is_not_a__A;
    private static final SubLSymbol $sym21$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw22$CERROR;
    private static final SubLString $str23$continue_anyway;
    private static final SubLSymbol $kw24$WARN;
    private static final SubLString $str25$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str26$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str27$attempting_to_bind_direction_link;
    private static final SubLString $str28$Node__a_does_not_pass_sbhl_type_t;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all.lisp", position = 641L)
    public static SubLObject removal_some_relation_all_for_predicate(final SubLObject predicate, SubLObject mt) {
        if (mt == removal_modules_relation_all.UNPROVIDED) {
            mt = (SubLObject)removal_modules_relation_all.NIL;
        }
        if (removal_modules_relation_all.NIL != forts.fort_p(predicate)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, removal_modules_relation_all.$const0$relationAll, mt, (SubLObject)removal_modules_relation_all.ONE_INTEGER, (SubLObject)removal_modules_relation_all.UNPROVIDED);
        }
        return (SubLObject)removal_modules_relation_all.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all.lisp", position = 1060L)
    public static SubLObject removal_some_relation_all_for_collection(final SubLObject collection, SubLObject mt) {
        if (mt == removal_modules_relation_all.UNPROVIDED) {
            mt = (SubLObject)removal_modules_relation_all.NIL;
        }
        if (removal_modules_relation_all.NIL != forts.fort_p(collection)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(collection, removal_modules_relation_all.$const0$relationAll, mt, (SubLObject)removal_modules_relation_all.TWO_INTEGER, (SubLObject)removal_modules_relation_all.UNPROVIDED);
        }
        return (SubLObject)removal_modules_relation_all.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all.lisp", position = 1249L)
    public static SubLObject relation_all_predicate_cost_estimate(final SubLObject predicate) {
        return kb_indexing.relevant_num_gaf_arg_index(predicate, (SubLObject)removal_modules_relation_all.ONE_INTEGER, removal_modules_relation_all.$const0$relationAll);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all.lisp", position = 1456L)
    public static SubLObject relation_all_collection_cost_estimate() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.integerDivide(control_vars.$average_all_isa_count$.getDynamicValue(thread), removal_modules_relation_all.$estimated_per_collection_relation_all_fraction$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all.lisp", position = 1609L)
    public static SubLObject removal_relation_all_required(final SubLObject asent) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all.NIL == hl_supports.hl_predicate_p(predicate) && removal_modules_relation_all.NIL != removal_some_relation_all_for_predicate(predicate, (SubLObject)removal_modules_relation_all.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all.lisp", position = 2061L)
    public static SubLObject make_relation_all_support() {
        return arguments.make_hl_support((SubLObject)removal_modules_relation_all.$kw4$CODE, removal_modules_relation_all.$relation_all_rule$.getGlobalValue(), removal_modules_relation_all.$relation_all_defining_mt$.getGlobalValue(), (SubLObject)removal_modules_relation_all.$kw5$TRUE_MON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all.lisp", position = 2197L)
    public static SubLObject removal_relation_all_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_relation_all.UNPROVIDED) {
            sense = (SubLObject)removal_modules_relation_all.NIL;
        }
        return removal_relation_all_required(asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all.lisp", position = 2655L)
    public static SubLObject removal_relation_all_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_relation_all.UNPROVIDED) {
            sense = (SubLObject)removal_modules_relation_all.NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_relation_all.UNPROVIDED);
        final SubLObject predicate_cost_estimate = relation_all_predicate_cost_estimate(predicate);
        final SubLObject collection_cost_estimate = relation_all_collection_cost_estimate();
        if (predicate_cost_estimate.numLE(collection_cost_estimate)) {
            final SubLObject pred_var = removal_modules_relation_all.$const0$relationAll;
            if (removal_modules_relation_all.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, (SubLObject)removal_modules_relation_all.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, (SubLObject)removal_modules_relation_all.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)removal_modules_relation_all.NIL;
                final SubLObject token_var = (SubLObject)removal_modules_relation_all.NIL;
                while (removal_modules_relation_all.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (removal_modules_relation_all.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)removal_modules_relation_all.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_relation_all.$kw7$GAF, (SubLObject)removal_modules_relation_all.$kw8$TRUE, (SubLObject)removal_modules_relation_all.NIL);
                            SubLObject done_var_$1 = (SubLObject)removal_modules_relation_all.NIL;
                            final SubLObject token_var_$2 = (SubLObject)removal_modules_relation_all.NIL;
                            while (removal_modules_relation_all.NIL == done_var_$1) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(assertion));
                                if (removal_modules_relation_all.NIL != valid_$3) {
                                    removal_relation_all_check_via_predicate_expand(asent, assertion);
                                }
                                done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all.NIL == valid_$3);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)removal_modules_relation_all.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (removal_modules_relation_all.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all.NIL == valid);
                }
            }
        }
        else {
            SubLObject cdolist_list_var;
            final SubLObject all_isa = cdolist_list_var = isa.all_isa(v_object, (SubLObject)removal_modules_relation_all.NIL, (SubLObject)removal_modules_relation_all.UNPROVIDED);
            SubLObject collection = (SubLObject)removal_modules_relation_all.NIL;
            collection = cdolist_list_var.first();
            while (removal_modules_relation_all.NIL != cdolist_list_var) {
                if (removal_modules_relation_all.NIL != removal_some_relation_all_for_collection(collection, (SubLObject)removal_modules_relation_all.NIL)) {
                    final SubLObject pred_var2 = removal_modules_relation_all.$const0$relationAll;
                    if (removal_modules_relation_all.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, (SubLObject)removal_modules_relation_all.TWO_INTEGER, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, (SubLObject)removal_modules_relation_all.TWO_INTEGER, pred_var2);
                        SubLObject done_var2 = (SubLObject)removal_modules_relation_all.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_relation_all.NIL;
                        while (removal_modules_relation_all.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_relation_all.NIL != valid2) {
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_relation_all.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_relation_all.$kw7$GAF, (SubLObject)removal_modules_relation_all.$kw8$TRUE, (SubLObject)removal_modules_relation_all.NIL);
                                    SubLObject done_var_$2 = (SubLObject)removal_modules_relation_all.NIL;
                                    final SubLObject token_var_$3 = (SubLObject)removal_modules_relation_all.NIL;
                                    while (removal_modules_relation_all.NIL == done_var_$2) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$3);
                                        final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(assertion2));
                                        if (removal_modules_relation_all.NIL != valid_$4) {
                                            removal_relation_all_check_via_collection_expand(asent, assertion2);
                                        }
                                        done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all.NIL == valid_$4);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                    try {
                                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)removal_modules_relation_all.T);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_relation_all.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_relation_all.NIL == valid2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collection = cdolist_list_var.first();
            }
        }
        return (SubLObject)removal_modules_relation_all.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all.lisp", position = 4214L)
    public static SubLObject removal_relation_all_check_via_collection_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (!predicate.eql(assertions_high.gaf_arg1(assertion))) {
            return (SubLObject)removal_modules_relation_all.NIL;
        }
        return removal_relation_all_check_expand_guts(asent, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all.lisp", position = 4594L)
    public static SubLObject removal_relation_all_check_via_predicate_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_relation_all.UNPROVIDED);
        if (removal_modules_relation_all.NIL == isa.isaP(v_object, assertions_high.gaf_arg2(assertion), (SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED)) {
            return (SubLObject)removal_modules_relation_all.NIL;
        }
        return removal_relation_all_check_expand_guts(asent, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all.lisp", position = 4959L)
    public static SubLObject removal_relation_all_check_expand_guts(final SubLObject asent, final SubLObject assertion) {
        if (removal_modules_relation_all.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_relation_all.UNPROVIDED);
            final SubLObject collection = assertions_high.gaf_arg2(assertion);
            final SubLObject rule_support = make_relation_all_support();
            final SubLObject isa_support = arguments.make_hl_support((SubLObject)removal_modules_relation_all.$kw11$ISA, (SubLObject)ConsesLow.list(removal_modules_relation_all.$const12$isa, v_object, collection), (SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED);
            final SubLObject more_supports = (SubLObject)ConsesLow.list(rule_support, isa_support);
            backward.removal_add_node(assertion, (SubLObject)removal_modules_relation_all.NIL, more_supports);
        }
        return (SubLObject)removal_modules_relation_all.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all.lisp", position = 5458L)
    public static SubLObject unary_pred_holds(final SubLObject predicate, final SubLObject v_term, SubLObject mt) {
        if (mt == removal_modules_relation_all.UNPROVIDED) {
            mt = (SubLObject)removal_modules_relation_all.NIL;
        }
        assert removal_modules_relation_all.NIL != forts.fort_p(predicate) : predicate;
        assert removal_modules_relation_all.NIL != forts.fort_p(v_term) : v_term;
        return kb_mapping_utilities.some_pred_value_in_relevant_mts(v_term, predicate, mt, (SubLObject)removal_modules_relation_all.ONE_INTEGER, (SubLObject)removal_modules_relation_all.$kw8$TRUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all.lisp", position = 5695L)
    public static SubLObject unary_pred_holds_via_relation_all(final SubLObject predicate, final SubLObject v_term, SubLObject mt) {
        if (mt == removal_modules_relation_all.UNPROVIDED) {
            mt = (SubLObject)removal_modules_relation_all.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert removal_modules_relation_all.NIL != forts.fort_p(predicate) : predicate;
        assert removal_modules_relation_all.NIL != forts.fort_p(v_term) : v_term;
        SubLObject ans = (SubLObject)removal_modules_relation_all.NIL;
        if (removal_modules_relation_all.NIL == ans) {
            final SubLObject deck_type = (SubLObject)((removal_modules_relation_all.$kw14$BREADTH == removal_modules_relation_all.$kw15$DEPTH) ? removal_modules_relation_all.$kw16$STACK : removal_modules_relation_all.$kw17$QUEUE);
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$7 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = (SubLObject)removal_modules_relation_all.NIL;
                        final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((removal_modules_relation_all.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((removal_modules_relation_all.NIL != tv_var) ? removal_modules_relation_all.$sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (removal_modules_relation_all.NIL != tv_var && removal_modules_relation_all.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && removal_modules_relation_all.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)removal_modules_relation_all.$kw19$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)removal_modules_relation_all.ONE_INTEGER, (SubLObject)removal_modules_relation_all.$str20$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_relation_all.$sym21$SBHL_TRUE_TV_P, (SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)removal_modules_relation_all.$kw22$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)removal_modules_relation_all.ONE_INTEGER, (SubLObject)removal_modules_relation_all.$str23$continue_anyway, (SubLObject)removal_modules_relation_all.$str20$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_relation_all.$sym21$SBHL_TRUE_TV_P, (SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)removal_modules_relation_all.$kw24$WARN)) {
                                    Errors.warn((SubLObject)removal_modules_relation_all.$str20$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_relation_all.$sym21$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)removal_modules_relation_all.$str25$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)removal_modules_relation_all.$str23$continue_anyway, (SubLObject)removal_modules_relation_all.$str20$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_relation_all.$sym21$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$12 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_relation_all.$const12$isa), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(removal_modules_relation_all.$const12$isa)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(removal_modules_relation_all.$const12$isa)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_relation_all.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_relation_all.$const12$isa), thread);
                                if (removal_modules_relation_all.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || removal_modules_relation_all.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(v_term, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_relation_all.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$11 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_relation_all.UNPROVIDED)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_relation_all.NIL, thread);
                                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(removal_modules_relation_all.$const12$isa));
                                        SubLObject rest;
                                        SubLObject module_var;
                                        SubLObject _prev_bind_0_$11;
                                        SubLObject _prev_bind_1_$12;
                                        SubLObject node;
                                        SubLObject d_link;
                                        SubLObject mt_links;
                                        SubLObject iteration_state;
                                        SubLObject mt_$18;
                                        SubLObject tv_links;
                                        SubLObject _prev_bind_0_$12;
                                        SubLObject iteration_state_$20;
                                        SubLObject tv;
                                        SubLObject link_nodes;
                                        SubLObject _prev_bind_0_$13;
                                        SubLObject sol;
                                        SubLObject set_contents_var;
                                        SubLObject basis_object;
                                        SubLObject state;
                                        SubLObject node_vars_link_node;
                                        SubLObject csome_list_var;
                                        SubLObject node_vars_link_node2;
                                        SubLObject new_list;
                                        SubLObject rest_$22;
                                        SubLObject generating_fn;
                                        SubLObject _prev_bind_0_$14;
                                        SubLObject sol2;
                                        SubLObject link_nodes2;
                                        SubLObject set_contents_var2;
                                        SubLObject basis_object2;
                                        SubLObject state2;
                                        SubLObject node_vars_link_node3;
                                        SubLObject csome_list_var2;
                                        SubLObject node_vars_link_node4;
                                        for (rest = (SubLObject)removal_modules_relation_all.NIL, rest = accessible_modules; removal_modules_relation_all.NIL == ans && removal_modules_relation_all.NIL != rest; rest = rest.rest()) {
                                            module_var = rest.first();
                                            _prev_bind_0_$11 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            _prev_bind_1_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_relation_all.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_relation_all.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                node = function_terms.naut_to_nart(v_term);
                                                if (removal_modules_relation_all.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_relation_all.UNPROVIDED));
                                                    if (removal_modules_relation_all.NIL != d_link) {
                                                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_relation_all.UNPROVIDED));
                                                        if (removal_modules_relation_all.NIL != mt_links) {
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); removal_modules_relation_all.NIL == ans && removal_modules_relation_all.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                mt_$18 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (removal_modules_relation_all.NIL != mt_relevance_macros.relevant_mtP(mt_$18)) {
                                                                    _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$18, thread);
                                                                        for (iteration_state_$20 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); removal_modules_relation_all.NIL == ans && removal_modules_relation_all.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$20); iteration_state_$20 = dictionary_contents.do_dictionary_contents_next(iteration_state_$20)) {
                                                                            thread.resetMultipleValues();
                                                                            tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$20);
                                                                            link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (removal_modules_relation_all.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    sol = link_nodes;
                                                                                    if (removal_modules_relation_all.NIL != set.set_p(sol)) {
                                                                                        set_contents_var = set.do_set_internal(sol);
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_relation_all.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_relation_all.NIL == ans && removal_modules_relation_all.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (removal_modules_relation_all.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && removal_modules_relation_all.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)removal_modules_relation_all.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)removal_modules_relation_all.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        if (removal_modules_relation_all.NIL == ans) {
                                                                                            csome_list_var = sol;
                                                                                            node_vars_link_node2 = (SubLObject)removal_modules_relation_all.NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (removal_modules_relation_all.NIL == ans && removal_modules_relation_all.NIL != csome_list_var) {
                                                                                                if (removal_modules_relation_all.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)removal_modules_relation_all.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)removal_modules_relation_all.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)removal_modules_relation_all.$str26$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$13, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$20);
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$12, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_error((SubLObject)removal_modules_relation_all.FIVE_INTEGER, (SubLObject)removal_modules_relation_all.$str27$attempting_to_bind_direction_link, (SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED);
                                                    }
                                                }
                                                else if (removal_modules_relation_all.NIL != obsolete.cnat_p(node, (SubLObject)removal_modules_relation_all.UNPROVIDED)) {
                                                    new_list = ((removal_modules_relation_all.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_relation_all.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_relation_all.UNPROVIDED)));
                                                    for (rest_$22 = (SubLObject)removal_modules_relation_all.NIL, rest_$22 = new_list; removal_modules_relation_all.NIL == ans && removal_modules_relation_all.NIL != rest_$22; rest_$22 = rest_$22.rest()) {
                                                        generating_fn = rest_$22.first();
                                                        _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                            if (removal_modules_relation_all.NIL != set.set_p(sol2)) {
                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)removal_modules_relation_all.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); removal_modules_relation_all.NIL == ans && removal_modules_relation_all.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if (removal_modules_relation_all.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && removal_modules_relation_all.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)removal_modules_relation_all.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)removal_modules_relation_all.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol2.isList()) {
                                                                if (removal_modules_relation_all.NIL == ans) {
                                                                    csome_list_var2 = sol2;
                                                                    node_vars_link_node4 = (SubLObject)removal_modules_relation_all.NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (removal_modules_relation_all.NIL == ans && removal_modules_relation_all.NIL != csome_list_var2) {
                                                                        if (removal_modules_relation_all.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)removal_modules_relation_all.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)removal_modules_relation_all.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)removal_modules_relation_all.$str26$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$14, thread);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$12, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$11, thread);
                                            }
                                        }
                                        SubLObject node_var = deck.deck_pop(recur_deck);
                                        final SubLObject _prev_bind_0_$15 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$14 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_relation_all.NIL, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_relation_all.UNPROVIDED)), thread);
                                            while (removal_modules_relation_all.NIL != node_var && removal_modules_relation_all.NIL == ans) {
                                                final SubLObject col = node_var;
                                                ans = kb_mapping_utilities.pred_u_v_holds(removal_modules_relation_all.$const0$relationAll, predicate, col, (SubLObject)removal_modules_relation_all.ONE_INTEGER, (SubLObject)removal_modules_relation_all.TWO_INTEGER, (SubLObject)removal_modules_relation_all.$kw8$TRUE);
                                                final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_relation_all.UNPROVIDED));
                                                SubLObject rest2;
                                                SubLObject module_var2;
                                                SubLObject _prev_bind_0_$16;
                                                SubLObject _prev_bind_1_$14;
                                                SubLObject node2;
                                                SubLObject d_link2;
                                                SubLObject mt_links2;
                                                SubLObject iteration_state2;
                                                SubLObject mt_$19;
                                                SubLObject tv_links2;
                                                SubLObject _prev_bind_0_$17;
                                                SubLObject iteration_state_$21;
                                                SubLObject tv2;
                                                SubLObject link_nodes3;
                                                SubLObject _prev_bind_0_$18;
                                                SubLObject sol3;
                                                SubLObject set_contents_var3;
                                                SubLObject basis_object3;
                                                SubLObject state3;
                                                SubLObject node_vars_link_node5;
                                                SubLObject csome_list_var3;
                                                SubLObject node_vars_link_node6;
                                                SubLObject new_list2;
                                                SubLObject rest_$23;
                                                SubLObject generating_fn2;
                                                SubLObject _prev_bind_0_$19;
                                                SubLObject sol4;
                                                SubLObject link_nodes4;
                                                SubLObject set_contents_var4;
                                                SubLObject basis_object4;
                                                SubLObject state4;
                                                SubLObject csome_list_var4;
                                                SubLObject node_vars_link_node7;
                                                for (rest2 = (SubLObject)removal_modules_relation_all.NIL, rest2 = accessible_modules2; removal_modules_relation_all.NIL == ans && removal_modules_relation_all.NIL != rest2; rest2 = rest2.rest()) {
                                                    module_var2 = rest2.first();
                                                    _prev_bind_0_$16 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_relation_all.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_relation_all.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        node2 = function_terms.naut_to_nart(node_var);
                                                        if (removal_modules_relation_all.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_relation_all.UNPROVIDED));
                                                            if (removal_modules_relation_all.NIL != d_link2) {
                                                                mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_relation_all.UNPROVIDED));
                                                                if (removal_modules_relation_all.NIL != mt_links2) {
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); removal_modules_relation_all.NIL == ans && removal_modules_relation_all.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        mt_$19 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (removal_modules_relation_all.NIL != mt_relevance_macros.relevant_mtP(mt_$19)) {
                                                                            _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$19, thread);
                                                                                for (iteration_state_$21 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); removal_modules_relation_all.NIL == ans && removal_modules_relation_all.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$21); iteration_state_$21 = dictionary_contents.do_dictionary_contents_next(iteration_state_$21)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$21);
                                                                                    link_nodes3 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (removal_modules_relation_all.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            sol3 = link_nodes3;
                                                                                            if (removal_modules_relation_all.NIL != set.set_p(sol3)) {
                                                                                                set_contents_var3 = set.do_set_internal(sol3);
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)removal_modules_relation_all.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); removal_modules_relation_all.NIL == ans && removal_modules_relation_all.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node5 = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (removal_modules_relation_all.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node5) && removal_modules_relation_all.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node5, (SubLObject)removal_modules_relation_all.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node5, (SubLObject)removal_modules_relation_all.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node5, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                if (removal_modules_relation_all.NIL == ans) {
                                                                                                    csome_list_var3 = sol3;
                                                                                                    node_vars_link_node6 = (SubLObject)removal_modules_relation_all.NIL;
                                                                                                    node_vars_link_node6 = csome_list_var3.first();
                                                                                                    while (removal_modules_relation_all.NIL == ans && removal_modules_relation_all.NIL != csome_list_var3) {
                                                                                                        if (removal_modules_relation_all.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node6, (SubLObject)removal_modules_relation_all.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node6, (SubLObject)removal_modules_relation_all.UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node6, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                                        node_vars_link_node6 = csome_list_var3.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)removal_modules_relation_all.$str26$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$18, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$21);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$17, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)removal_modules_relation_all.FIVE_INTEGER, (SubLObject)removal_modules_relation_all.$str27$attempting_to_bind_direction_link, (SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (removal_modules_relation_all.NIL != obsolete.cnat_p(node2, (SubLObject)removal_modules_relation_all.UNPROVIDED)) {
                                                            new_list2 = ((removal_modules_relation_all.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_relation_all.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_relation_all.UNPROVIDED)));
                                                            for (rest_$23 = (SubLObject)removal_modules_relation_all.NIL, rest_$23 = new_list2; removal_modules_relation_all.NIL == ans && removal_modules_relation_all.NIL != rest_$23; rest_$23 = rest_$23.rest()) {
                                                                generating_fn2 = rest_$23.first();
                                                                _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    link_nodes4 = (sol4 = Functions.funcall(generating_fn2, node2));
                                                                    if (removal_modules_relation_all.NIL != set.set_p(sol4)) {
                                                                        set_contents_var4 = set.do_set_internal(sol4);
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)removal_modules_relation_all.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); removal_modules_relation_all.NIL == ans && removal_modules_relation_all.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node2 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (removal_modules_relation_all.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node2) && removal_modules_relation_all.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)removal_modules_relation_all.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)removal_modules_relation_all.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        if (removal_modules_relation_all.NIL == ans) {
                                                                            csome_list_var4 = sol4;
                                                                            node_vars_link_node7 = (SubLObject)removal_modules_relation_all.NIL;
                                                                            node_vars_link_node7 = csome_list_var4.first();
                                                                            while (removal_modules_relation_all.NIL == ans && removal_modules_relation_all.NIL != csome_list_var4) {
                                                                                if (removal_modules_relation_all.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node7, (SubLObject)removal_modules_relation_all.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node7, (SubLObject)removal_modules_relation_all.UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node7, recur_deck);
                                                                                }
                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                node_vars_link_node7 = csome_list_var4.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)removal_modules_relation_all.$str26$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$19, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$14, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$16, thread);
                                                    }
                                                }
                                                node_var = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$14, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$13, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$15, thread);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$13, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$11, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$10, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)removal_modules_relation_all.TWO_INTEGER, (SubLObject)removal_modules_relation_all.$str28$Node__a_does_not_pass_sbhl_type_t, v_term, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_relation_all.UNPROVIDED)), (SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED, (SubLObject)removal_modules_relation_all.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$12, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$10, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$9, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$9, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$7, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_relation_all.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    public static SubLObject declare_removal_modules_relation_all_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all", "removal_some_relation_all_for_predicate", "REMOVAL-SOME-RELATION-ALL-FOR-PREDICATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all", "removal_some_relation_all_for_collection", "REMOVAL-SOME-RELATION-ALL-FOR-COLLECTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all", "relation_all_predicate_cost_estimate", "RELATION-ALL-PREDICATE-COST-ESTIMATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all", "relation_all_collection_cost_estimate", "RELATION-ALL-COLLECTION-COST-ESTIMATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all", "removal_relation_all_required", "REMOVAL-RELATION-ALL-REQUIRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all", "make_relation_all_support", "MAKE-RELATION-ALL-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all", "removal_relation_all_check_required", "REMOVAL-RELATION-ALL-CHECK-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all", "removal_relation_all_check_expand", "REMOVAL-RELATION-ALL-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all", "removal_relation_all_check_via_collection_expand", "REMOVAL-RELATION-ALL-CHECK-VIA-COLLECTION-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all", "removal_relation_all_check_via_predicate_expand", "REMOVAL-RELATION-ALL-CHECK-VIA-PREDICATE-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all", "removal_relation_all_check_expand_guts", "REMOVAL-RELATION-ALL-CHECK-EXPAND-GUTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all", "unary_pred_holds", "UNARY-PRED-HOLDS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all", "unary_pred_holds_via_relation_all", "UNARY-PRED-HOLDS-VIA-RELATION-ALL", 2, 1, false);
        return (SubLObject)removal_modules_relation_all.NIL;
    }
    
    public static SubLObject init_removal_modules_relation_all_file() {
        removal_modules_relation_all.$estimated_per_collection_relation_all_fraction$ = SubLFiles.defparameter("*ESTIMATED-PER-COLLECTION-RELATION-ALL-FRACTION*", (SubLObject)removal_modules_relation_all.TEN_INTEGER);
        removal_modules_relation_all.$relation_all_rule$ = SubLFiles.deflexical("*RELATION-ALL-RULE*", (SubLObject)removal_modules_relation_all.$list1);
        removal_modules_relation_all.$relation_all_defining_mt$ = SubLFiles.deflexical("*RELATION-ALL-DEFINING-MT*", (removal_modules_relation_all.NIL != Symbols.boundp((SubLObject)removal_modules_relation_all.$sym2$_RELATION_ALL_DEFINING_MT_)) ? removal_modules_relation_all.$relation_all_defining_mt$.getGlobalValue() : removal_modules_relation_all.$const3$BaseKB);
        removal_modules_relation_all.$removal_relation_all_check_cost$ = SubLFiles.defparameter("*REMOVAL-RELATION-ALL-CHECK-COST*", (SubLObject)removal_modules_relation_all.$float6$1_5);
        return (SubLObject)removal_modules_relation_all.NIL;
    }
    
    public static SubLObject setup_removal_modules_relation_all_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)removal_modules_relation_all.$sym2$_RELATION_ALL_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)removal_modules_relation_all.$sym2$_RELATION_ALL_DEFINING_MT_, removal_modules_relation_all.$const0$relationAll);
        inference_modules.inference_removal_module((SubLObject)removal_modules_relation_all.$kw9$REMOVAL_RELATION_ALL_CHECK, (SubLObject)removal_modules_relation_all.$list10);
        return (SubLObject)removal_modules_relation_all.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_relation_all_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_relation_all_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_relation_all_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_relation_all();
        removal_modules_relation_all.$estimated_per_collection_relation_all_fraction$ = null;
        removal_modules_relation_all.$relation_all_rule$ = null;
        removal_modules_relation_all.$relation_all_defining_mt$ = null;
        removal_modules_relation_all.$removal_relation_all_check_cost$ = null;
        $const0$relationAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAll"));
        $list1 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAll")), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?COL")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?OBJ"), (SubLObject)SubLObjectFactory.makeSymbol("?COL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?OBJ")));
        $sym2$_RELATION_ALL_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*RELATION-ALL-DEFINING-MT*");
        $const3$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $kw4$CODE = SubLObjectFactory.makeKeyword("CODE");
        $kw5$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $float6$1_5 = (SubLFloat)SubLObjectFactory.makeDouble(1.5);
        $kw7$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw8$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw9$REMOVAL_RELATION_ALL_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-RELATION-ALL-CHECK");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_relation_all.ONE_INTEGER, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-RELATION-ALL-CHECK-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*REMOVAL-RELATION-ALL-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-RELATION-ALL-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<predicate> <object>) where <object> is a FORT\nfrom (#$relationAll <predicate> <collection>) \nand (#$isa <object> <collection>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$temporallyContinuous #$AbrahamLincoln)\nfrom (#$relationAll #$temporallyContinuous #$Entity)\nand (#$isa #$AbrahamLincoln #$Entity)") });
        $kw11$ISA = SubLObjectFactory.makeKeyword("ISA");
        $const12$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym13$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $kw14$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw15$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw16$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw17$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw19$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str20$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym21$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw22$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str23$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw24$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str25$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str26$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str27$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str28$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
    }
}

/*

	Total time: 781 ms
	
*/