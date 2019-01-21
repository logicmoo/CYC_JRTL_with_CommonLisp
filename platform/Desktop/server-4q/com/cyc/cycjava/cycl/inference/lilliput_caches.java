package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lilliput_caches extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.lilliput_caches";
    public static final String myFingerPrint = "2b411b76e458d076a67868768a57c87f0c3daa5318645109ee6759493777db16";
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput-caches.lisp", position = 958L)
    private static SubLSymbol $lilliput_all_instances_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput-caches.lisp", position = 1250L)
    private static SubLSymbol $lilliput_all_instances_if_tkb_fort_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput-caches.lisp", position = 1582L)
    private static SubLSymbol $all_valid_lilliput_queries_caching_state$;
    private static final SubLSymbol $sym0$LILLIPUT_ALL_INSTANCES;
    private static final SubLObject $const1$SpecsFn;
    private static final SubLSymbol $sym2$FORT_P;
    private static final SubLSymbol $sym3$_LILLIPUT_ALL_INSTANCES_CACHING_STATE_;
    private static final SubLSymbol $sym4$LILLIPUT_ALL_INSTANCES_IF_TKB_FORT;
    private static final SubLSymbol $sym5$TKB_FORT_;
    private static final SubLSymbol $sym6$_LILLIPUT_ALL_INSTANCES_IF_TKB_FORT_CACHING_STATE_;
    private static final SubLSymbol $sym7$ALL_VALID_LILLIPUT_QUERIES;
    private static final SubLObject $const8$isa;
    private static final SubLSymbol $kw9$BREADTH;
    private static final SubLSymbol $kw10$QUEUE;
    private static final SubLSymbol $kw11$STACK;
    private static final SubLSymbol $sym12$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw13$ERROR;
    private static final SubLString $str14$_A_is_not_a__A;
    private static final SubLSymbol $sym15$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw16$CERROR;
    private static final SubLString $str17$continue_anyway;
    private static final SubLSymbol $kw18$WARN;
    private static final SubLString $str19$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str20$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str21$attempting_to_bind_direction_link;
    private static final SubLList $list22;
    private static final SubLString $str23$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym24$_ALL_VALID_LILLIPUT_QUERIES_CACHING_STATE_;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput-caches.lisp", position = 958L)
    public static SubLObject clear_lilliput_all_instances() {
        final SubLObject cs = lilliput_caches.$lilliput_all_instances_caching_state$.getGlobalValue();
        if (lilliput_caches.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lilliput_caches.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput-caches.lisp", position = 958L)
    public static SubLObject remove_lilliput_all_instances(final SubLObject collection) {
        return memoization_state.caching_state_remove_function_results_with_args(lilliput_caches.$lilliput_all_instances_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(collection), (SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput-caches.lisp", position = 958L)
    public static SubLObject lilliput_all_instances_internal(final SubLObject collection) {
        if (lilliput_caches.NIL != el_utilities.el_formula_with_operator_p(collection, lilliput_caches.$const1$SpecsFn)) {
            return genls.all_specs(cycl_utilities.formula_arg1(collection, (SubLObject)lilliput_caches.UNPROVIDED), lilliput.$lilliput_mt$.getGlobalValue(), (SubLObject)lilliput_caches.UNPROVIDED);
        }
        assert lilliput_caches.NIL != forts.fort_p(collection) : collection;
        return isa.all_instances(collection, lilliput.$lilliput_mt$.getGlobalValue(), (SubLObject)lilliput_caches.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput-caches.lisp", position = 958L)
    public static SubLObject lilliput_all_instances(final SubLObject collection) {
        SubLObject caching_state = lilliput_caches.$lilliput_all_instances_caching_state$.getGlobalValue();
        if (lilliput_caches.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lilliput_caches.$sym0$LILLIPUT_ALL_INSTANCES, (SubLObject)lilliput_caches.$sym3$_LILLIPUT_ALL_INSTANCES_CACHING_STATE_, (SubLObject)lilliput_caches.NIL, (SubLObject)lilliput_caches.EQ, (SubLObject)lilliput_caches.ONE_INTEGER, (SubLObject)lilliput_caches.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, collection, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(lilliput_all_instances_internal(collection)));
            memoization_state.caching_state_put(caching_state, collection, results, (SubLObject)lilliput_caches.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput-caches.lisp", position = 1250L)
    public static SubLObject clear_lilliput_all_instances_if_tkb_fort() {
        final SubLObject cs = lilliput_caches.$lilliput_all_instances_if_tkb_fort_caching_state$.getGlobalValue();
        if (lilliput_caches.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lilliput_caches.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput-caches.lisp", position = 1250L)
    public static SubLObject remove_lilliput_all_instances_if_tkb_fort(final SubLObject collection) {
        return memoization_state.caching_state_remove_function_results_with_args(lilliput_caches.$lilliput_all_instances_if_tkb_fort_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(collection), (SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput-caches.lisp", position = 1250L)
    public static SubLObject lilliput_all_instances_if_tkb_fort_internal(final SubLObject collection) {
        if (lilliput_caches.NIL != el_utilities.el_formula_with_operator_p(collection, lilliput_caches.$const1$SpecsFn)) {
            return genls.all_specs_if((SubLObject)lilliput_caches.$sym5$TKB_FORT_, cycl_utilities.formula_arg1(collection, (SubLObject)lilliput_caches.UNPROVIDED), lilliput.$lilliput_mt$.getGlobalValue(), (SubLObject)lilliput_caches.UNPROVIDED);
        }
        assert lilliput_caches.NIL != forts.fort_p(collection) : collection;
        return isa.all_instances_if((SubLObject)lilliput_caches.$sym5$TKB_FORT_, collection, lilliput.$lilliput_mt$.getGlobalValue(), (SubLObject)lilliput_caches.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput-caches.lisp", position = 1250L)
    public static SubLObject lilliput_all_instances_if_tkb_fort(final SubLObject collection) {
        SubLObject caching_state = lilliput_caches.$lilliput_all_instances_if_tkb_fort_caching_state$.getGlobalValue();
        if (lilliput_caches.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lilliput_caches.$sym4$LILLIPUT_ALL_INSTANCES_IF_TKB_FORT, (SubLObject)lilliput_caches.$sym6$_LILLIPUT_ALL_INSTANCES_IF_TKB_FORT_CACHING_STATE_, (SubLObject)lilliput_caches.NIL, (SubLObject)lilliput_caches.EQ, (SubLObject)lilliput_caches.ONE_INTEGER, (SubLObject)lilliput_caches.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, collection, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(lilliput_all_instances_if_tkb_fort_internal(collection)));
            memoization_state.caching_state_put(caching_state, collection, results, (SubLObject)lilliput_caches.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput-caches.lisp", position = 1582L)
    public static SubLObject clear_all_valid_lilliput_queries() {
        final SubLObject cs = lilliput_caches.$all_valid_lilliput_queries_caching_state$.getGlobalValue();
        if (lilliput_caches.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lilliput_caches.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput-caches.lisp", position = 1582L)
    public static SubLObject remove_all_valid_lilliput_queries() {
        return memoization_state.caching_state_remove_function_results_with_args(lilliput_caches.$all_valid_lilliput_queries_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(lilliput_caches.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput-caches.lisp", position = 1582L)
    public static SubLObject all_valid_lilliput_queries_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject queries = (SubLObject)lilliput_caches.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(lilliput.$lilliput_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject node_var = lilliput.$lilliput_master_query_collection$.getGlobalValue();
            final SubLObject _prev_bind_0_$1 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(lilliput_caches.$const8$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$3 = node_var;
                    final SubLObject deck_type = (SubLObject)lilliput_caches.$kw11$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)lilliput_caches.NIL;
                            final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((lilliput_caches.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((lilliput_caches.NIL != tv_var) ? lilliput_caches.$sym12$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (lilliput_caches.NIL != tv_var && lilliput_caches.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && lilliput_caches.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)lilliput_caches.$kw13$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)lilliput_caches.ONE_INTEGER, (SubLObject)lilliput_caches.$str14$_A_is_not_a__A, tv_var, (SubLObject)lilliput_caches.$sym15$SBHL_TRUE_TV_P, (SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)lilliput_caches.$kw16$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)lilliput_caches.ONE_INTEGER, (SubLObject)lilliput_caches.$str17$continue_anyway, (SubLObject)lilliput_caches.$str14$_A_is_not_a__A, tv_var, (SubLObject)lilliput_caches.$sym15$SBHL_TRUE_TV_P, (SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)lilliput_caches.$kw18$WARN)) {
                                        Errors.warn((SubLObject)lilliput_caches.$str14$_A_is_not_a__A, tv_var, (SubLObject)lilliput_caches.$sym15$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)lilliput_caches.$str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)lilliput_caches.$str17$continue_anyway, (SubLObject)lilliput_caches.$str14$_A_is_not_a__A, tv_var, (SubLObject)lilliput_caches.$sym15$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(lilliput_caches.$const8$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(lilliput_caches.$const8$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(lilliput_caches.$const8$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)lilliput_caches.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(lilliput_caches.$const8$isa)), thread);
                                    if (lilliput_caches.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || lilliput_caches.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)lilliput_caches.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(lilliput_caches.$const8$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)lilliput_caches.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$3, (SubLObject)lilliput_caches.UNPROVIDED);
                                            while (lilliput_caches.NIL != node_var_$3) {
                                                final SubLObject tt_node_var = node_var_$3;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(lilliput_caches.$const8$isa));
                                                SubLObject module_var = (SubLObject)lilliput_caches.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (lilliput_caches.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$6 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((lilliput_caches.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(lilliput_caches.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (lilliput_caches.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)lilliput_caches.UNPROVIDED));
                                                            if (lilliput_caches.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(lilliput_caches.$const8$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)lilliput_caches.UNPROVIDED));
                                                                if (lilliput_caches.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); lilliput_caches.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (lilliput_caches.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$16;
                                                                                for (iteration_state_$16 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); lilliput_caches.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$16); iteration_state_$16 = dictionary_contents.do_dictionary_contents_next(iteration_state_$16)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$16);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (lilliput_caches.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (lilliput_caches.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject query;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)lilliput_caches.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); lilliput_caches.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (lilliput_caches.NIL != set_contents.do_set_contents_element_validP(state, query) && lilliput_caches.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (lilliput_caches.NIL != forts.fort_p(query) && !lilliput.lilliput_query_type(query).eql(lilliput.$lilliput_master_query_collection$.getGlobalValue())) {
                                                                                                            queries = (SubLObject)ConsesLow.cons(query, queries);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject query2 = (SubLObject)lilliput_caches.NIL;
                                                                                                query2 = csome_list_var.first();
                                                                                                while (lilliput_caches.NIL != csome_list_var) {
                                                                                                    if (lilliput_caches.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (lilliput_caches.NIL != forts.fort_p(query2) && !lilliput.lilliput_query_type(query2).eql(lilliput.$lilliput_master_query_collection$.getGlobalValue())) {
                                                                                                            queries = (SubLObject)ConsesLow.cons(query2, queries);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    query2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)lilliput_caches.$str20$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$8, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$16);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$7, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)lilliput_caches.FIVE_INTEGER, (SubLObject)lilliput_caches.$str21$attempting_to_bind_direction_link, (SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED);
                                                            }
                                                            if (lilliput_caches.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)lilliput_caches.UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = (SubLObject)lilliput_caches.NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (lilliput_caches.NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = (SubLObject)lilliput_caches.NIL;
                                                                    SubLObject mt2 = (SubLObject)lilliput_caches.NIL;
                                                                    SubLObject tv2 = (SubLObject)lilliput_caches.NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lilliput_caches.$list22);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lilliput_caches.$list22);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lilliput_caches.$list22);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (lilliput_caches.NIL == current) {
                                                                        if (lilliput_caches.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (lilliput_caches.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                        if (lilliput_caches.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject query;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)lilliput_caches.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); lilliput_caches.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (lilliput_caches.NIL != set_contents.do_set_contents_element_validP(state, query) && lilliput_caches.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (lilliput_caches.NIL != forts.fort_p(query) && !lilliput.lilliput_query_type(query).eql(lilliput.$lilliput_master_query_collection$.getGlobalValue())) {
                                                                                                        queries = (SubLObject)ConsesLow.cons(query, queries);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$20 = sol;
                                                                                            SubLObject query2 = (SubLObject)lilliput_caches.NIL;
                                                                                            query2 = csome_list_var_$20.first();
                                                                                            while (lilliput_caches.NIL != csome_list_var_$20) {
                                                                                                if (lilliput_caches.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (lilliput_caches.NIL != forts.fort_p(query2) && !lilliput.lilliput_query_type(query2).eql(lilliput.$lilliput_master_query_collection$.getGlobalValue())) {
                                                                                                        queries = (SubLObject)ConsesLow.cons(query2, queries);
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$20 = csome_list_var_$20.rest();
                                                                                                query2 = csome_list_var_$20.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)lilliput_caches.$str20$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$10, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$9, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)lilliput_caches.$list22);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        }
                                                        else if (lilliput_caches.NIL != obsolete.cnat_p(node, (SubLObject)lilliput_caches.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$21;
                                                            final SubLObject new_list = cdolist_list_var_$21 = ((lilliput_caches.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(lilliput_caches.$const8$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lilliput_caches.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(lilliput_caches.$const8$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lilliput_caches.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)lilliput_caches.NIL;
                                                            generating_fn = cdolist_list_var_$21.first();
                                                            while (lilliput_caches.NIL != cdolist_list_var_$21) {
                                                                final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (lilliput_caches.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject query3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)lilliput_caches.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); lilliput_caches.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            query3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (lilliput_caches.NIL != set_contents.do_set_contents_element_validP(state2, query3) && lilliput_caches.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (lilliput_caches.NIL != forts.fort_p(query3) && !lilliput.lilliput_query_type(query3).eql(lilliput.$lilliput_master_query_collection$.getGlobalValue())) {
                                                                                    queries = (SubLObject)ConsesLow.cons(query3, queries);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var3 = sol2;
                                                                        SubLObject query4 = (SubLObject)lilliput_caches.NIL;
                                                                        query4 = csome_list_var3.first();
                                                                        while (lilliput_caches.NIL != csome_list_var3) {
                                                                            if (lilliput_caches.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (lilliput_caches.NIL != forts.fort_p(query4) && !lilliput.lilliput_query_type(query4).eql(lilliput.$lilliput_master_query_collection$.getGlobalValue())) {
                                                                                    queries = (SubLObject)ConsesLow.cons(query4, queries);
                                                                                }
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            query4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)lilliput_caches.$str20$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$11, thread);
                                                                }
                                                                cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                                                                generating_fn = cdolist_list_var_$21.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$6, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$6, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(lilliput_caches.$const8$isa)));
                                                SubLObject module_var2 = (SubLObject)lilliput_caches.NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (lilliput_caches.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$12 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((lilliput_caches.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(lilliput_caches.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$3);
                                                        if (lilliput_caches.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)lilliput_caches.UNPROVIDED));
                                                            if (lilliput_caches.NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)lilliput_caches.UNPROVIDED));
                                                                if (lilliput_caches.NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); lilliput_caches.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (lilliput_caches.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$17;
                                                                                for (iteration_state_$17 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); lilliput_caches.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$17); iteration_state_$17 = dictionary_contents.do_dictionary_contents_next(iteration_state_$17)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$17);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (lilliput_caches.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (lilliput_caches.NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)lilliput_caches.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); lilliput_caches.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (lilliput_caches.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && lilliput_caches.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)lilliput_caches.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)lilliput_caches.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)lilliput_caches.NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (lilliput_caches.NIL != csome_list_var4) {
                                                                                                    if (lilliput_caches.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)lilliput_caches.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)lilliput_caches.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)lilliput_caches.$str20$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$14, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$17);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$13, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)lilliput_caches.FIVE_INTEGER, (SubLObject)lilliput_caches.$str21$attempting_to_bind_direction_link, (SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (lilliput_caches.NIL != obsolete.cnat_p(node2, (SubLObject)lilliput_caches.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$22;
                                                            final SubLObject new_list2 = cdolist_list_var_$22 = ((lilliput_caches.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lilliput_caches.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lilliput_caches.UNPROVIDED)));
                                                            SubLObject generating_fn2 = (SubLObject)lilliput_caches.NIL;
                                                            generating_fn2 = cdolist_list_var_$22.first();
                                                            while (lilliput_caches.NIL != cdolist_list_var_$22) {
                                                                final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (lilliput_caches.NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)lilliput_caches.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); lilliput_caches.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (lilliput_caches.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && lilliput_caches.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)lilliput_caches.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)lilliput_caches.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        SubLObject csome_list_var5 = sol4;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)lilliput_caches.NIL;
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                        while (lilliput_caches.NIL != csome_list_var5) {
                                                                            if (lilliput_caches.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)lilliput_caches.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)lilliput_caches.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)lilliput_caches.$str20$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$15, thread);
                                                                }
                                                                cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                                                                generating_fn2 = cdolist_list_var_$22.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$7, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$12, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var_$3 = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$10, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$5, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)lilliput_caches.TWO_INTEGER, (SubLObject)lilliput_caches.$str23$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)lilliput_caches.UNPROVIDED)), (SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED, (SubLObject)lilliput_caches.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$9, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$4, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$3, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lilliput_caches.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lilliput_caches.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(queries);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput-caches.lisp", position = 1582L)
    public static SubLObject all_valid_lilliput_queries() {
        SubLObject caching_state = lilliput_caches.$all_valid_lilliput_queries_caching_state$.getGlobalValue();
        if (lilliput_caches.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lilliput_caches.$sym7$ALL_VALID_LILLIPUT_QUERIES, (SubLObject)lilliput_caches.$sym24$_ALL_VALID_LILLIPUT_QUERIES_CACHING_STATE_, (SubLObject)lilliput_caches.NIL, (SubLObject)lilliput_caches.EQ, (SubLObject)lilliput_caches.ZERO_INTEGER, (SubLObject)lilliput_caches.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)lilliput_caches.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(all_valid_lilliput_queries_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)lilliput_caches.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/lilliput-caches.lisp", position = 1926L)
    public static SubLObject clear_lilliput_caches() {
        clear_lilliput_all_instances();
        clear_lilliput_all_instances_if_tkb_fort();
        clear_all_valid_lilliput_queries();
        return (SubLObject)lilliput_caches.NIL;
    }
    
    public static SubLObject declare_lilliput_caches_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput_caches", "clear_lilliput_all_instances", "CLEAR-LILLIPUT-ALL-INSTANCES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput_caches", "remove_lilliput_all_instances", "REMOVE-LILLIPUT-ALL-INSTANCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput_caches", "lilliput_all_instances_internal", "LILLIPUT-ALL-INSTANCES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput_caches", "lilliput_all_instances", "LILLIPUT-ALL-INSTANCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput_caches", "clear_lilliput_all_instances_if_tkb_fort", "CLEAR-LILLIPUT-ALL-INSTANCES-IF-TKB-FORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput_caches", "remove_lilliput_all_instances_if_tkb_fort", "REMOVE-LILLIPUT-ALL-INSTANCES-IF-TKB-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput_caches", "lilliput_all_instances_if_tkb_fort_internal", "LILLIPUT-ALL-INSTANCES-IF-TKB-FORT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput_caches", "lilliput_all_instances_if_tkb_fort", "LILLIPUT-ALL-INSTANCES-IF-TKB-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput_caches", "clear_all_valid_lilliput_queries", "CLEAR-ALL-VALID-LILLIPUT-QUERIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput_caches", "remove_all_valid_lilliput_queries", "REMOVE-ALL-VALID-LILLIPUT-QUERIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput_caches", "all_valid_lilliput_queries_internal", "ALL-VALID-LILLIPUT-QUERIES-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput_caches", "all_valid_lilliput_queries", "ALL-VALID-LILLIPUT-QUERIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.lilliput_caches", "clear_lilliput_caches", "CLEAR-LILLIPUT-CACHES", 0, 0, false);
        return (SubLObject)lilliput_caches.NIL;
    }
    
    public static SubLObject init_lilliput_caches_file() {
        lilliput_caches.$lilliput_all_instances_caching_state$ = SubLFiles.deflexical("*LILLIPUT-ALL-INSTANCES-CACHING-STATE*", (SubLObject)lilliput_caches.NIL);
        lilliput_caches.$lilliput_all_instances_if_tkb_fort_caching_state$ = SubLFiles.deflexical("*LILLIPUT-ALL-INSTANCES-IF-TKB-FORT-CACHING-STATE*", (SubLObject)lilliput_caches.NIL);
        lilliput_caches.$all_valid_lilliput_queries_caching_state$ = SubLFiles.deflexical("*ALL-VALID-LILLIPUT-QUERIES-CACHING-STATE*", (SubLObject)lilliput_caches.NIL);
        return (SubLObject)lilliput_caches.NIL;
    }
    
    public static SubLObject setup_lilliput_caches_file() {
        memoization_state.note_globally_cached_function((SubLObject)lilliput_caches.$sym0$LILLIPUT_ALL_INSTANCES);
        memoization_state.note_globally_cached_function((SubLObject)lilliput_caches.$sym4$LILLIPUT_ALL_INSTANCES_IF_TKB_FORT);
        memoization_state.note_globally_cached_function((SubLObject)lilliput_caches.$sym7$ALL_VALID_LILLIPUT_QUERIES);
        return (SubLObject)lilliput_caches.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_lilliput_caches_file();
    }
    
    @Override
	public void initializeVariables() {
        init_lilliput_caches_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_lilliput_caches_file();
    }
    
    static {
        me = (SubLFile)new lilliput_caches();
        lilliput_caches.$lilliput_all_instances_caching_state$ = null;
        lilliput_caches.$lilliput_all_instances_if_tkb_fort_caching_state$ = null;
        lilliput_caches.$all_valid_lilliput_queries_caching_state$ = null;
        $sym0$LILLIPUT_ALL_INSTANCES = SubLObjectFactory.makeSymbol("LILLIPUT-ALL-INSTANCES");
        $const1$SpecsFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpecsFn"));
        $sym2$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym3$_LILLIPUT_ALL_INSTANCES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*LILLIPUT-ALL-INSTANCES-CACHING-STATE*");
        $sym4$LILLIPUT_ALL_INSTANCES_IF_TKB_FORT = SubLObjectFactory.makeSymbol("LILLIPUT-ALL-INSTANCES-IF-TKB-FORT");
        $sym5$TKB_FORT_ = SubLObjectFactory.makeSymbol("TKB-FORT?");
        $sym6$_LILLIPUT_ALL_INSTANCES_IF_TKB_FORT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*LILLIPUT-ALL-INSTANCES-IF-TKB-FORT-CACHING-STATE*");
        $sym7$ALL_VALID_LILLIPUT_QUERIES = SubLObjectFactory.makeSymbol("ALL-VALID-LILLIPUT-QUERIES");
        $const8$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw9$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw10$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw11$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym12$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw13$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str14$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym15$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw16$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str17$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw18$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str19$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str20$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str21$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $str23$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym24$_ALL_VALID_LILLIPUT_QUERIES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ALL-VALID-LILLIPUT-QUERIES-CACHING-STATE*");
    }
}

/*

	Total time: 961 ms
	
*/