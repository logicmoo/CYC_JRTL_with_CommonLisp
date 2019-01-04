package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_noun_compound extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_noun_compound";
    public static final String myFingerPrint = "f1744f7afba865ba5467c60e9f580f60666de89480326f93cba2a5a842e93799";
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 1008L)
    private static SubLSymbol $pph_nc_rule_list_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2096L)
    private static SubLSymbol $nc_pos_constraint_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2207L)
    private static SubLSymbol $nc_pos_pred_constraint_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2281L)
    private static SubLSymbol $nc_equals_constraint_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2352L)
    private static SubLSymbol $nc_genls_constraint_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2421L)
    private static SubLSymbol $nc_isa_constraint_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2486L)
    private static SubLSymbol $the_nc_modifier$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2542L)
    private static SubLSymbol $the_nc_head$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2590L)
    private static SubLSymbol $noun_compound_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2652L)
    private static SubLSymbol $nc_rule_template$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2710L)
    private static SubLSymbol $nc_rule_constraint$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2772L)
    private static SubLSymbol $nc_mt$;
    private static final SubLSymbol $sym0$PPH_NC_RULE_LIST;
    private static final SubLObject $const1$isa;
    private static final SubLSymbol $kw2$BREADTH;
    private static final SubLSymbol $kw3$QUEUE;
    private static final SubLSymbol $kw4$STACK;
    private static final SubLObject $const5$True_JustificationTruth;
    private static final SubLSymbol $sym6$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw7$ERROR;
    private static final SubLString $str8$_A_is_not_a__A;
    private static final SubLSymbol $sym9$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw10$CERROR;
    private static final SubLString $str11$continue_anyway;
    private static final SubLSymbol $kw12$WARN;
    private static final SubLString $str13$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str14$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str15$attempting_to_bind_direction_link;
    private static final SubLList $list16;
    private static final SubLString $str17$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym18$_PPH_NC_RULE_LIST_CACHING_STATE_;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$RULE;
    private static final SubLSymbol $sym21$CSOME;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym24$PROGN;
    private static final SubLObject $const25$NCPOSConstraintFn;
    private static final SubLObject $const26$NCPOSPredConstraintFn;
    private static final SubLObject $const27$NCEqualsConstraintFn;
    private static final SubLObject $const28$NCGenlsConstraintFn;
    private static final SubLObject $const29$NCIsaConstraintFn;
    private static final SubLObject $const30$TheNCModifier;
    private static final SubLObject $const31$TheNCHead;
    private static final SubLObject $const32$NounCompoundRule;
    private static final SubLObject $const33$ncRuleTemplate;
    private static final SubLObject $const34$ncRuleConstraint;
    private static final SubLObject $const35$GeneralLexiconMt;
    private static final SubLSymbol $sym36$GENERATE_NOUN_COMPOUND_PHRASE;
    private static final SubLSymbol $kw37$COLLECTION_DENOTING_NAT;
    private static final SubLSymbol $kw38$BEST;
    private static final SubLSymbol $sym39$PPH_FIND_NC_RULE_FOR_NAUT;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLObject $const42$CountNoun;
    private static final SubLString $str43$_PPH_error_level_;
    private static final SubLString $str44$__;
    private static final SubLString $str45$___S_isn_t_a_semantic_constraint_;
    private static final SubLSymbol $sym46$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const47$EverythingPSC;
    private static final SubLString $str48$___S_isn_t_a_recognized_noun_comp;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 1008L)
    public static SubLObject clear_pph_nc_rule_list() {
        final SubLObject cs = pph_noun_compound.$pph_nc_rule_list_caching_state$.getGlobalValue();
        if (pph_noun_compound.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)pph_noun_compound.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 1008L)
    public static SubLObject remove_pph_nc_rule_list(SubLObject mt) {
        if (mt == pph_noun_compound.UNPROVIDED) {
            mt = pph_noun_compound.$nc_mt$.getGlobalValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(pph_noun_compound.$pph_nc_rule_list_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(mt), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 1008L)
    public static SubLObject pph_nc_rule_list_internal(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)pph_noun_compound.NIL;
        final SubLObject node_var = pph_noun_compound.$noun_compound_rule$.getGlobalValue();
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pph_noun_compound.$const1$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$1 = node_var;
                final SubLObject deck_type = (SubLObject)pph_noun_compound.$kw4$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                            final SubLObject tv_var = pph_noun_compound.$const5$True_JustificationTruth;
                            final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((pph_noun_compound.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((pph_noun_compound.NIL != tv_var) ? pph_noun_compound.$sym6$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (pph_noun_compound.NIL != tv_var && pph_noun_compound.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && pph_noun_compound.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)pph_noun_compound.$kw7$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)pph_noun_compound.ONE_INTEGER, (SubLObject)pph_noun_compound.$str8$_A_is_not_a__A, tv_var, (SubLObject)pph_noun_compound.$sym9$SBHL_TRUE_TV_P, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)pph_noun_compound.$kw10$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)pph_noun_compound.ONE_INTEGER, (SubLObject)pph_noun_compound.$str11$continue_anyway, (SubLObject)pph_noun_compound.$str8$_A_is_not_a__A, tv_var, (SubLObject)pph_noun_compound.$sym9$SBHL_TRUE_TV_P, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)pph_noun_compound.$kw12$WARN)) {
                                        Errors.warn((SubLObject)pph_noun_compound.$str8$_A_is_not_a__A, tv_var, (SubLObject)pph_noun_compound.$sym9$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)pph_noun_compound.$str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)pph_noun_compound.$str11$continue_anyway, (SubLObject)pph_noun_compound.$str8$_A_is_not_a__A, tv_var, (SubLObject)pph_noun_compound.$sym9$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_noun_compound.$const1$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_noun_compound.$const1$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_noun_compound.$const1$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_noun_compound.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_noun_compound.$const1$isa)), thread);
                                    if (pph_noun_compound.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || pph_noun_compound.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)pph_noun_compound.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$7 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_noun_compound.$const1$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_noun_compound.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$1, (SubLObject)pph_noun_compound.UNPROVIDED);
                                            while (pph_noun_compound.NIL != node_var_$1) {
                                                final SubLObject tt_node_var = node_var_$1;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(pph_noun_compound.$const1$isa));
                                                SubLObject module_var = (SubLObject)pph_noun_compound.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (pph_noun_compound.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_noun_compound.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_noun_compound.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (pph_noun_compound.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)pph_noun_compound.UNPROVIDED));
                                                            if (pph_noun_compound.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(pph_noun_compound.$const1$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)pph_noun_compound.UNPROVIDED));
                                                                if (pph_noun_compound.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); pph_noun_compound.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$15 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (pph_noun_compound.NIL != mt_relevance_macros.relevant_mtP(mt_$15)) {
                                                                            final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$15, thread);
                                                                                SubLObject iteration_state_$17;
                                                                                for (iteration_state_$17 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); pph_noun_compound.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$17); iteration_state_$17 = dictionary_contents.do_dictionary_contents_next(iteration_state_$17)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$17);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (pph_noun_compound.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (pph_noun_compound.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject rule;
                                                                                                SubLObject template;
                                                                                                SubLObject constraints;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_noun_compound.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_noun_compound.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    rule = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (pph_noun_compound.NIL != set_contents.do_set_contents_element_validP(state, rule) && pph_noun_compound.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(rule, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (pph_noun_compound.NIL != forts.fort_p(rule)) {
                                                                                                            template = kb_mapping_utilities.fpred_value(rule, pph_noun_compound.$nc_rule_template$.getGlobalValue(), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                                                                            constraints = kb_mapping_utilities.pred_values(rule, pph_noun_compound.$nc_rule_constraint$.getGlobalValue(), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                                                                            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rule, template, constraints), result);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject rule2 = (SubLObject)pph_noun_compound.NIL;
                                                                                                rule2 = csome_list_var.first();
                                                                                                while (pph_noun_compound.NIL != csome_list_var) {
                                                                                                    if (pph_noun_compound.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(rule2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (pph_noun_compound.NIL != forts.fort_p(rule2)) {
                                                                                                            final SubLObject template2 = kb_mapping_utilities.fpred_value(rule2, pph_noun_compound.$nc_rule_template$.getGlobalValue(), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                                                                            final SubLObject constraints2 = kb_mapping_utilities.pred_values(rule2, pph_noun_compound.$nc_rule_constraint$.getGlobalValue(), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                                                                            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rule2, template2, constraints2), result);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    rule2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)pph_noun_compound.$str14$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$9, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$17);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$8, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)pph_noun_compound.FIVE_INTEGER, (SubLObject)pph_noun_compound.$str15$attempting_to_bind_direction_link, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                            }
                                                            if (pph_noun_compound.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)pph_noun_compound.UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = (SubLObject)pph_noun_compound.NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (pph_noun_compound.NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = (SubLObject)pph_noun_compound.NIL;
                                                                    SubLObject mt_$16 = (SubLObject)pph_noun_compound.NIL;
                                                                    SubLObject tv2 = (SubLObject)pph_noun_compound.NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_noun_compound.$list16);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_noun_compound.$list16);
                                                                    mt_$16 = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_noun_compound.$list16);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (pph_noun_compound.NIL == current) {
                                                                        if (pph_noun_compound.NIL != mt_relevance_macros.relevant_mtP(mt_$16)) {
                                                                            final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$16, thread);
                                                                                if (pph_noun_compound.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                        if (pph_noun_compound.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject rule;
                                                                                            SubLObject template;
                                                                                            SubLObject constraints;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_noun_compound.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_noun_compound.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                rule = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (pph_noun_compound.NIL != set_contents.do_set_contents_element_validP(state, rule) && pph_noun_compound.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(rule, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (pph_noun_compound.NIL != forts.fort_p(rule)) {
                                                                                                        template = kb_mapping_utilities.fpred_value(rule, pph_noun_compound.$nc_rule_template$.getGlobalValue(), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                                                                        constraints = kb_mapping_utilities.pred_values(rule, pph_noun_compound.$nc_rule_constraint$.getGlobalValue(), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                                                                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rule, template, constraints), result);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$22 = sol;
                                                                                            SubLObject rule2 = (SubLObject)pph_noun_compound.NIL;
                                                                                            rule2 = csome_list_var_$22.first();
                                                                                            while (pph_noun_compound.NIL != csome_list_var_$22) {
                                                                                                if (pph_noun_compound.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(rule2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (pph_noun_compound.NIL != forts.fort_p(rule2)) {
                                                                                                        final SubLObject template2 = kb_mapping_utilities.fpred_value(rule2, pph_noun_compound.$nc_rule_template$.getGlobalValue(), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                                                                        final SubLObject constraints2 = kb_mapping_utilities.pred_values(rule2, pph_noun_compound.$nc_rule_constraint$.getGlobalValue(), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                                                                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rule2, template2, constraints2), result);
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$22 = csome_list_var_$22.rest();
                                                                                                rule2 = csome_list_var_$22.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)pph_noun_compound.$str14$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$11, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$10, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_noun_compound.$list16);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        }
                                                        else if (pph_noun_compound.NIL != obsolete.cnat_p(node, (SubLObject)pph_noun_compound.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$23;
                                                            final SubLObject new_list = cdolist_list_var_$23 = ((pph_noun_compound.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(pph_noun_compound.$const1$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_noun_compound.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(pph_noun_compound.$const1$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_noun_compound.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)pph_noun_compound.NIL;
                                                            generating_fn = cdolist_list_var_$23.first();
                                                            while (pph_noun_compound.NIL != cdolist_list_var_$23) {
                                                                final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (pph_noun_compound.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject rule3;
                                                                        SubLObject template3;
                                                                        SubLObject constraints3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)pph_noun_compound.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); pph_noun_compound.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            rule3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (pph_noun_compound.NIL != set_contents.do_set_contents_element_validP(state2, rule3) && pph_noun_compound.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(rule3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (pph_noun_compound.NIL != forts.fort_p(rule3)) {
                                                                                    template3 = kb_mapping_utilities.fpred_value(rule3, pph_noun_compound.$nc_rule_template$.getGlobalValue(), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                                                    constraints3 = kb_mapping_utilities.pred_values(rule3, pph_noun_compound.$nc_rule_constraint$.getGlobalValue(), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                                                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rule3, template3, constraints3), result);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var3 = sol2;
                                                                        SubLObject rule4 = (SubLObject)pph_noun_compound.NIL;
                                                                        rule4 = csome_list_var3.first();
                                                                        while (pph_noun_compound.NIL != csome_list_var3) {
                                                                            if (pph_noun_compound.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(rule4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (pph_noun_compound.NIL != forts.fort_p(rule4)) {
                                                                                    final SubLObject template4 = kb_mapping_utilities.fpred_value(rule4, pph_noun_compound.$nc_rule_template$.getGlobalValue(), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                                                    final SubLObject constraints4 = kb_mapping_utilities.pred_values(rule4, pph_noun_compound.$nc_rule_constraint$.getGlobalValue(), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                                                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rule4, template4, constraints4), result);
                                                                                }
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            rule4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)pph_noun_compound.$str14$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$12, thread);
                                                                }
                                                                cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                                                                generating_fn = cdolist_list_var_$23.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$8, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$7, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(pph_noun_compound.$const1$isa)));
                                                SubLObject module_var2 = (SubLObject)pph_noun_compound.NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (pph_noun_compound.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$13 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_noun_compound.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_noun_compound.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$1);
                                                        if (pph_noun_compound.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)pph_noun_compound.UNPROVIDED));
                                                            if (pph_noun_compound.NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)pph_noun_compound.UNPROVIDED));
                                                                if (pph_noun_compound.NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); pph_noun_compound.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$17 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (pph_noun_compound.NIL != mt_relevance_macros.relevant_mtP(mt_$17)) {
                                                                            final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$17, thread);
                                                                                SubLObject iteration_state_$18;
                                                                                for (iteration_state_$18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); pph_noun_compound.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$18); iteration_state_$18 = dictionary_contents.do_dictionary_contents_next(iteration_state_$18)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$18);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (pph_noun_compound.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (pph_noun_compound.NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)pph_noun_compound.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); pph_noun_compound.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (pph_noun_compound.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && pph_noun_compound.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)pph_noun_compound.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)pph_noun_compound.NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (pph_noun_compound.NIL != csome_list_var4) {
                                                                                                    if (pph_noun_compound.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)pph_noun_compound.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)pph_noun_compound.$str14$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$15, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$18);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$14, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)pph_noun_compound.FIVE_INTEGER, (SubLObject)pph_noun_compound.$str15$attempting_to_bind_direction_link, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (pph_noun_compound.NIL != obsolete.cnat_p(node2, (SubLObject)pph_noun_compound.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$24;
                                                            final SubLObject new_list2 = cdolist_list_var_$24 = ((pph_noun_compound.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_noun_compound.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_noun_compound.UNPROVIDED)));
                                                            SubLObject generating_fn2 = (SubLObject)pph_noun_compound.NIL;
                                                            generating_fn2 = cdolist_list_var_$24.first();
                                                            while (pph_noun_compound.NIL != cdolist_list_var_$24) {
                                                                final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (pph_noun_compound.NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)pph_noun_compound.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); pph_noun_compound.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (pph_noun_compound.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && pph_noun_compound.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)pph_noun_compound.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        SubLObject csome_list_var5 = sol4;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)pph_noun_compound.NIL;
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                        while (pph_noun_compound.NIL != csome_list_var5) {
                                                                            if (pph_noun_compound.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)pph_noun_compound.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)pph_noun_compound.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)pph_noun_compound.$str14$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$16, thread);
                                                                }
                                                                cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                                                                generating_fn2 = cdolist_list_var_$24.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$9, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$13, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var_$1 = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$10, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$7, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)pph_noun_compound.TWO_INTEGER, (SubLObject)pph_noun_compound.$str17$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)pph_noun_compound.UNPROVIDED)), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$9, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$6, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$5, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$4, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_noun_compound.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$2, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_noun_compound.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 1008L)
    public static SubLObject pph_nc_rule_list(SubLObject mt) {
        if (mt == pph_noun_compound.UNPROVIDED) {
            mt = pph_noun_compound.$nc_mt$.getGlobalValue();
        }
        SubLObject caching_state = pph_noun_compound.$pph_nc_rule_list_caching_state$.getGlobalValue();
        if (pph_noun_compound.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)pph_noun_compound.$sym0$PPH_NC_RULE_LIST, (SubLObject)pph_noun_compound.$sym18$_PPH_NC_RULE_LIST_CACHING_STATE_, (SubLObject)pph_noun_compound.NIL, (SubLObject)pph_noun_compound.EQUAL, (SubLObject)pph_noun_compound.ONE_INTEGER, (SubLObject)pph_noun_compound.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_nc_rule_list_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, (SubLObject)pph_noun_compound.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 1488L)
    public static SubLObject do_nc_rules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_noun_compound.$list19);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rule_var = (SubLObject)pph_noun_compound.NIL;
        SubLObject template_var = (SubLObject)pph_noun_compound.NIL;
        SubLObject constraints_var = (SubLObject)pph_noun_compound.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_noun_compound.$list19);
        rule_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_noun_compound.$list19);
        template_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_noun_compound.$list19);
        constraints_var = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : pph_noun_compound.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)pph_noun_compound.$list19);
        current = current.rest();
        if (pph_noun_compound.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject rule = (SubLObject)pph_noun_compound.$sym20$RULE;
            return (SubLObject)ConsesLow.list((SubLObject)pph_noun_compound.$sym21$CSOME, (SubLObject)ConsesLow.list(rule, (SubLObject)pph_noun_compound.$list22, done_var), (SubLObject)ConsesLow.list((SubLObject)pph_noun_compound.$sym23$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(rule_var, template_var, constraints_var), rule, reader.bq_cons((SubLObject)pph_noun_compound.$sym24$PROGN, ConsesLow.append(body, (SubLObject)pph_noun_compound.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_noun_compound.$list19);
        return (SubLObject)pph_noun_compound.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 2954L)
    public static SubLObject generate_noun_compound_phrase(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_noun_compound.NIL == pph_utilities.pph_current_precision()) {
            return (SubLObject)pph_noun_compound.NIL;
        }
        final SubLObject naut = function_terms.nart_to_naut(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_noun_compound.UNPROVIDED));
        thread.resetMultipleValues();
        final SubLObject rule = pph_find_nc_rule_for_naut(naut);
        final SubLObject mod_cycl = thread.secondMultipleValue();
        final SubLObject head_cycl = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (pph_noun_compound.NIL != forts.fort_p(rule)) {
            final SubLObject syn_constraints = organize_rule_syntactic_constraints(rule);
            final SubLObject mod_phrase = pph_phrase.new_pph_phrase_for_cycl(mod_cycl, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
            final SubLObject head_phrase = pph_phrase.new_pph_phrase_for_cycl(head_cycl, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
            set_nc_phrase_constraints(syn_constraints, head_phrase, mod_phrase);
            pph_phrase.set_pph_phrase_dtrs_from_list(phrase, (SubLObject)ConsesLow.list(mod_phrase, head_phrase), (SubLObject)pph_noun_compound.ONE_INTEGER);
            pph_phrase_resolution.pph_phrase_get_string(phrase, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
            pph_phrase.pph_phrase_add_justification(phrase, rule);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 3717L)
    public static SubLObject pph_find_nc_rule_for_naut_internal(final SubLObject naut) {
        SubLObject found_rule = (SubLObject)pph_noun_compound.NIL;
        SubLObject mod_cycl = (SubLObject)pph_noun_compound.NIL;
        SubLObject head_cycl = (SubLObject)pph_noun_compound.NIL;
        if (pph_noun_compound.NIL == found_rule) {
            SubLObject csome_list_var = pph_nc_rule_list((SubLObject)pph_noun_compound.UNPROVIDED);
            SubLObject rule = (SubLObject)pph_noun_compound.NIL;
            rule = csome_list_var.first();
            while (pph_noun_compound.NIL == found_rule && pph_noun_compound.NIL != csome_list_var) {
                SubLObject current;
                final SubLObject datum = current = rule;
                SubLObject rule_$35 = (SubLObject)pph_noun_compound.NIL;
                SubLObject template = (SubLObject)pph_noun_compound.NIL;
                SubLObject constraints = (SubLObject)pph_noun_compound.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_noun_compound.$list40);
                rule_$35 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_noun_compound.$list40);
                template = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_noun_compound.$list40);
                constraints = current.first();
                current = current.rest();
                if (pph_noun_compound.NIL == current) {
                    template = function_terms.nart_to_naut(template);
                    final SubLObject v_bindings = nc_rule_match_template(template, naut, constraints);
                    if (pph_noun_compound.NIL != nc_rule_bindings_completeP(v_bindings)) {
                        mod_cycl = bindings_get_modifier_target(v_bindings);
                        head_cycl = bindings_get_head_target(v_bindings);
                        found_rule = rule_$35;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_noun_compound.$list40);
                }
                csome_list_var = csome_list_var.rest();
                rule = csome_list_var.first();
            }
        }
        return Values.values(found_rule, mod_cycl, head_cycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 3717L)
    public static SubLObject pph_find_nc_rule_for_naut(final SubLObject naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_noun_compound.NIL;
        if (pph_noun_compound.NIL == v_memoization_state) {
            return pph_find_nc_rule_for_naut_internal(naut);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_noun_compound.$sym39$PPH_FIND_NC_RULE_FOR_NAUT, (SubLObject)pph_noun_compound.UNPROVIDED);
        if (pph_noun_compound.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_noun_compound.$sym39$PPH_FIND_NC_RULE_FOR_NAUT, (SubLObject)pph_noun_compound.ONE_INTEGER, (SubLObject)pph_noun_compound.NIL, (SubLObject)pph_noun_compound.EQUALP, (SubLObject)pph_noun_compound.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_noun_compound.$sym39$PPH_FIND_NC_RULE_FOR_NAUT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, naut, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_find_nc_rule_for_naut_internal(naut)));
            memoization_state.caching_state_put(caching_state, naut, results, (SubLObject)pph_noun_compound.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 4321L)
    public static SubLObject generate_noun_compound(final SubLObject cycl) {
        final SubLObject phrase = pph_phrase.new_pph_phrase_for_cycl(cycl, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
        generate_noun_compound_phrase(phrase);
        return pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_noun_compound.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 4647L)
    public static SubLObject all_noun_compounds_for_term(final SubLObject cycl) {
        SubLObject noun_compounds = (SubLObject)pph_noun_compound.NIL;
        SubLObject csome_list_var = pph_nc_rule_list((SubLObject)pph_noun_compound.UNPROVIDED);
        SubLObject rule = (SubLObject)pph_noun_compound.NIL;
        rule = csome_list_var.first();
        while (pph_noun_compound.NIL != csome_list_var) {
            SubLObject current;
            final SubLObject datum = current = rule;
            SubLObject rule_$36 = (SubLObject)pph_noun_compound.NIL;
            SubLObject template = (SubLObject)pph_noun_compound.NIL;
            SubLObject constraints = (SubLObject)pph_noun_compound.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_noun_compound.$list40);
            rule_$36 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_noun_compound.$list40);
            template = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_noun_compound.$list40);
            constraints = current.first();
            current = current.rest();
            if (pph_noun_compound.NIL == current) {
                template = function_terms.nart_to_naut(template);
                final SubLObject v_bindings = nc_rule_match_template(template, cycl, constraints);
                if (pph_noun_compound.NIL != nc_rule_bindings_completeP(v_bindings)) {
                    final SubLObject syn_constraints = organize_rule_syntactic_constraints(rule_$36);
                    final SubLObject mod_phrase = pph_phrase.new_pph_phrase_for_cycl(bindings_get_modifier_target(v_bindings), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                    final SubLObject head_phrase = pph_phrase.new_pph_phrase_for_cycl(bindings_get_head_target(v_bindings), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                    final SubLObject phrase = pph_phrase.new_pph_phrase_for_cycl(cycl, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                    set_nc_phrase_constraints(syn_constraints, head_phrase, mod_phrase);
                    pph_phrase.set_pph_phrase_dtrs_from_list(phrase, (SubLObject)ConsesLow.list(mod_phrase, head_phrase), (SubLObject)pph_noun_compound.UNPROVIDED);
                    pph_phrase.pph_phrase_set_head_dtr_num(phrase, (SubLObject)pph_noun_compound.ONE_INTEGER);
                    pph_phrase_resolution.pph_phrase_get_string(phrase, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
                    if (pph_noun_compound.NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                        noun_compounds = (SubLObject)ConsesLow.cons(pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_noun_compound.UNPROVIDED), noun_compounds);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_noun_compound.$list40);
            }
            csome_list_var = csome_list_var.rest();
            rule = csome_list_var.first();
        }
        return noun_compounds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 5656L)
    public static SubLObject nc_rule_pos_constraint_p(final SubLObject constraint) {
        return Equality.eq(nc_constraint_op(constraint), pph_noun_compound.$nc_pos_constraint_fn$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 5831L)
    public static SubLObject nc_rule_pos_pred_constraint_p(final SubLObject constraint) {
        return Equality.eq(nc_constraint_op(constraint), pph_noun_compound.$nc_pos_pred_constraint_fn$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 5963L)
    public static SubLObject nc_rule_modifier_constraint_p(final SubLObject constraint) {
        return Equality.eq(nc_constraint_subject(constraint), pph_noun_compound.$the_nc_modifier$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6090L)
    public static SubLObject nc_rule_head_constraint_p(final SubLObject constraint) {
        return Equality.eq(nc_constraint_subject(constraint), pph_noun_compound.$the_nc_head$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6209L)
    public static SubLObject nc_rule_indexical_p(final SubLObject base) {
        return subl_promotions.memberP(base, (SubLObject)ConsesLow.list(pph_noun_compound.$the_nc_head$.getGlobalValue(), pph_noun_compound.$the_nc_modifier$.getGlobalValue()), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6314L)
    public static SubLObject nc_rule_semantic_constraint_p(final SubLObject constraint) {
        return conses_high.member(nc_constraint_op(constraint), (SubLObject)ConsesLow.list(pph_noun_compound.$nc_isa_constraint_fn$.getGlobalValue(), pph_noun_compound.$nc_genls_constraint_fn$.getGlobalValue(), pph_noun_compound.$nc_equals_constraint_fn$.getGlobalValue()), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6516L)
    public static SubLObject nc_constraint_op(final SubLObject constraint) {
        return cycl_utilities.nat_arg0(constraint);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6662L)
    public static SubLObject nc_constraint_subject(final SubLObject constraint) {
        return cycl_utilities.nat_arg1(constraint, (SubLObject)pph_noun_compound.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6745L)
    public static SubLObject nc_constraint_object(final SubLObject constraint) {
        return cycl_utilities.nat_arg2(constraint, (SubLObject)pph_noun_compound.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6827L)
    public static SubLObject binding_base(final SubLObject binding) {
        return binding.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6904L)
    public static SubLObject binding_target(final SubLObject binding) {
        return binding.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 6969L)
    public static SubLObject nc_rule_bindings_completeP(final SubLObject v_bindings) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_bindings.isList() && pph_noun_compound.NIL != list_utilities.lengthE(v_bindings, (SubLObject)pph_noun_compound.TWO_INTEGER, (SubLObject)pph_noun_compound.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 7101L)
    public static SubLObject bindings_get_modifier_target(final SubLObject v_bindings) {
        final SubLObject binding = conses_high.assoc(pph_noun_compound.$the_nc_modifier$.getGlobalValue(), v_bindings, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
        return binding_target(binding);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 7376L)
    public static SubLObject bindings_get_head_target(final SubLObject v_bindings) {
        final SubLObject binding = conses_high.assoc(pph_noun_compound.$the_nc_head$.getGlobalValue(), v_bindings, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
        return binding_target(binding);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 7639L)
    public static SubLObject set_nc_phrase_constraints(final SubLObject constraints, final SubLObject head_phrase, final SubLObject mod_phrase) {
        SubLObject head_pos_constraint = (SubLObject)pph_noun_compound.NIL;
        SubLObject mod_pos_constraint = (SubLObject)pph_noun_compound.NIL;
        SubLObject head_pos_pred_constraint = (SubLObject)pph_noun_compound.NIL;
        SubLObject mod_pos_pred_constraint = (SubLObject)pph_noun_compound.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(constraints, constraints, (SubLObject)pph_noun_compound.$list41);
        head_pos_constraint = constraints.first();
        SubLObject current = constraints.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, constraints, (SubLObject)pph_noun_compound.$list41);
        mod_pos_constraint = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, constraints, (SubLObject)pph_noun_compound.$list41);
        head_pos_pred_constraint = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, constraints, (SubLObject)pph_noun_compound.$list41);
        mod_pos_pred_constraint = current.first();
        current = current.rest();
        if (pph_noun_compound.NIL == current) {
            pph_phrase.pph_phrase_set_category(head_phrase, (pph_noun_compound.NIL != head_pos_constraint) ? head_pos_constraint : pph_noun_compound.$const42$CountNoun, (SubLObject)pph_noun_compound.UNPROVIDED);
            pph_phrase.pph_phrase_set_category(mod_phrase, mod_pos_constraint, (SubLObject)pph_noun_compound.UNPROVIDED);
            pph_phrase.pph_phrase_set_agr_pred_unless_nil(head_phrase, head_pos_pred_constraint);
            pph_phrase.pph_phrase_set_agr_pred_unless_nil(mod_phrase, mod_pos_pred_constraint);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(constraints, (SubLObject)pph_noun_compound.$list41);
        }
        return Values.values(head_phrase, mod_phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 8476L)
    public static SubLObject organize_rule_syntactic_constraints(final SubLObject rule) {
        final SubLObject constraints = kb_mapping_utilities.pred_values_in_mt(rule, pph_noun_compound.$nc_rule_constraint$.getGlobalValue(), pph_noun_compound.$nc_mt$.getGlobalValue(), (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED, (SubLObject)pph_noun_compound.UNPROVIDED);
        return organize_syntactic_constraints(constraints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 8736L)
    public static SubLObject organize_syntactic_constraints(final SubLObject constraints) {
        SubLObject head_pos = (SubLObject)pph_noun_compound.NIL;
        SubLObject head_pos_pred = (SubLObject)pph_noun_compound.NIL;
        SubLObject mod_pos = (SubLObject)pph_noun_compound.NIL;
        SubLObject mod_pos_pred = (SubLObject)pph_noun_compound.NIL;
        SubLObject cdolist_list_var = constraints;
        SubLObject constraint = (SubLObject)pph_noun_compound.NIL;
        constraint = cdolist_list_var.first();
        while (pph_noun_compound.NIL != cdolist_list_var) {
            final SubLObject obj = nc_constraint_object(constraint);
            if (pph_noun_compound.NIL != nc_rule_pos_constraint_p(constraint)) {
                if (pph_noun_compound.NIL != nc_rule_head_constraint_p(constraint)) {
                    head_pos = obj;
                }
                else if (pph_noun_compound.NIL != nc_rule_modifier_constraint_p(constraint)) {
                    mod_pos = obj;
                }
            }
            else if (pph_noun_compound.NIL != nc_rule_pos_pred_constraint_p(constraint)) {
                if (pph_noun_compound.NIL != nc_rule_head_constraint_p(constraint)) {
                    head_pos_pred = obj;
                }
                else if (pph_noun_compound.NIL != nc_rule_modifier_constraint_p(constraint)) {
                    mod_pos_pred = obj;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list(head_pos, head_pos_pred, mod_pos, mod_pos_pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 9557L)
    public static SubLObject nc_rule_match_template(SubLObject template, final SubLObject nat, final SubLObject constraints) {
        template = function_terms.nart_to_naut(template);
        if (pph_noun_compound.NIL == el_utilities.el_formula_without_sequence_termP(template) || pph_noun_compound.NIL == el_utilities.el_formula_without_sequence_termP(nat) || pph_noun_compound.NIL == list_utilities.same_length_p(template, nat)) {
            return (SubLObject)pph_noun_compound.NIL;
        }
        SubLObject v_bindings = (SubLObject)pph_noun_compound.NIL;
        SubLObject failP = (SubLObject)pph_noun_compound.NIL;
        if (pph_noun_compound.NIL == failP) {
            SubLObject base = (SubLObject)pph_noun_compound.NIL;
            SubLObject base_$37 = (SubLObject)pph_noun_compound.NIL;
            SubLObject target = (SubLObject)pph_noun_compound.NIL;
            SubLObject target_$38 = (SubLObject)pph_noun_compound.NIL;
            base = template;
            base_$37 = base.first();
            target = nat;
            target_$38 = target.first();
            while (pph_noun_compound.NIL == failP && (pph_noun_compound.NIL != target || pph_noun_compound.NIL != base)) {
                if (pph_noun_compound.NIL != el_utilities.el_formula_p(base_$37) || pph_noun_compound.NIL != el_utilities.el_formula_p(target_$38)) {
                    final SubLObject match = nc_rule_match_template(base_$37, target_$38, constraints);
                    if (pph_noun_compound.NIL != match) {
                        if (match.isList()) {
                            v_bindings = ConsesLow.append(match, v_bindings);
                        }
                    }
                    else {
                        failP = (SubLObject)pph_noun_compound.T;
                    }
                }
                else {
                    final SubLObject match = nc_rule_pat_match(base_$37, target_$38, constraints);
                    if (pph_noun_compound.NIL != match) {
                        if (match.isCons()) {
                            v_bindings = (SubLObject)ConsesLow.cons(match, v_bindings);
                        }
                    }
                    else {
                        failP = (SubLObject)pph_noun_compound.T;
                    }
                }
                base = base.rest();
                base_$37 = base.first();
                target = target.rest();
                target_$38 = target.first();
            }
        }
        if (pph_noun_compound.NIL != failP) {
            return (SubLObject)pph_noun_compound.NIL;
        }
        return (SubLObject)((pph_noun_compound.NIL != v_bindings) ? v_bindings : pph_noun_compound.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 10504L)
    public static SubLObject nc_rule_pat_match(final SubLObject base, final SubLObject target, final SubLObject constraints) {
        if (pph_noun_compound.NIL != nc_rule_indexical_p(base)) {
            return (SubLObject)((pph_noun_compound.NIL != binding_satisfies_nc_rule_semantic_constraintsP(base, target, constraints)) ? ConsesLow.cons(base, target) : pph_noun_compound.NIL);
        }
        if (base.eql(target)) {
            return (SubLObject)pph_noun_compound.T;
        }
        return (SubLObject)pph_noun_compound.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 10866L)
    public static SubLObject binding_satisfies_nc_rule_semantic_constraintsP(final SubLObject base, final SubLObject target, final SubLObject constraints) {
        SubLObject failP = (SubLObject)pph_noun_compound.NIL;
        if (pph_noun_compound.NIL == failP) {
            SubLObject csome_list_var;
            SubLObject constraint;
            for (csome_list_var = constraints, constraint = (SubLObject)pph_noun_compound.NIL, constraint = csome_list_var.first(); pph_noun_compound.NIL == failP && pph_noun_compound.NIL != csome_list_var; failP = (SubLObject)SubLObjectFactory.makeBoolean(pph_noun_compound.NIL != nc_rule_semantic_constraint_p(constraint) && pph_noun_compound.NIL != nc_constraint_appliesP(constraint, base) && pph_noun_compound.NIL == target_satisfies_nc_rule_semantic_constraintP(target, constraint)), csome_list_var = csome_list_var.rest(), constraint = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_noun_compound.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 11320L)
    public static SubLObject target_satisfies_nc_rule_semantic_constraintP(final SubLObject target, final SubLObject constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_noun_compound.NIL == nc_rule_semantic_constraint_p(constraint)) {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_noun_compound.$str43$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_noun_compound.ONE_INTEGER), pph_noun_compound.$str44$__, format_nil.format_nil_a_no_copy((SubLObject)pph_noun_compound.$str45$___S_isn_t_a_semantic_constraint_) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(constraint));
        }
        SubLObject ans = (SubLObject)pph_noun_compound.T;
        final SubLObject obj = nc_constraint_object(constraint);
        final SubLObject op = nc_constraint_op(constraint);
        if (op.eql(pph_noun_compound.$nc_equals_constraint_fn$.getGlobalValue())) {
            return Equality.equal(target, obj);
        }
        if (op.eql(pph_noun_compound.$nc_genls_constraint_fn$.getGlobalValue())) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_noun_compound.$sym46$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(pph_noun_compound.$const47$EverythingPSC, thread);
                ans = pph_utilities.pph_genlP(target, obj, (SubLObject)pph_noun_compound.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (op.eql(pph_noun_compound.$nc_isa_constraint_fn$.getGlobalValue())) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_noun_compound.$sym46$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(pph_noun_compound.$const47$EverythingPSC, thread);
                ans = pph_utilities.pph_isaP(target, obj, (SubLObject)pph_noun_compound.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject new_format_string2 = Sequences.cconcatenate((SubLObject)pph_noun_compound.$str43$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_noun_compound.ONE_INTEGER), pph_noun_compound.$str44$__, format_nil.format_nil_a_no_copy((SubLObject)pph_noun_compound.$str48$___S_isn_t_a_recognized_noun_comp) });
            pph_error.pph_handle_error(new_format_string2, (SubLObject)ConsesLow.list(op));
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-noun-compound.lisp", position = 12127L)
    public static SubLObject nc_constraint_appliesP(final SubLObject constraint, final SubLObject base) {
        return Equality.eq(nc_constraint_subject(constraint), base);
    }
    
    public static SubLObject declare_pph_noun_compound_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "clear_pph_nc_rule_list", "CLEAR-PPH-NC-RULE-LIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "remove_pph_nc_rule_list", "REMOVE-PPH-NC-RULE-LIST", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "pph_nc_rule_list_internal", "PPH-NC-RULE-LIST-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "pph_nc_rule_list", "PPH-NC-RULE-LIST", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_noun_compound", "do_nc_rules", "DO-NC-RULES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "generate_noun_compound_phrase", "GENERATE-NOUN-COMPOUND-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "pph_find_nc_rule_for_naut_internal", "PPH-FIND-NC-RULE-FOR-NAUT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "pph_find_nc_rule_for_naut", "PPH-FIND-NC-RULE-FOR-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "generate_noun_compound", "GENERATE-NOUN-COMPOUND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "all_noun_compounds_for_term", "ALL-NOUN-COMPOUNDS-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "nc_rule_pos_constraint_p", "NC-RULE-POS-CONSTRAINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "nc_rule_pos_pred_constraint_p", "NC-RULE-POS-PRED-CONSTRAINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "nc_rule_modifier_constraint_p", "NC-RULE-MODIFIER-CONSTRAINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "nc_rule_head_constraint_p", "NC-RULE-HEAD-CONSTRAINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "nc_rule_indexical_p", "NC-RULE-INDEXICAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "nc_rule_semantic_constraint_p", "NC-RULE-SEMANTIC-CONSTRAINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "nc_constraint_op", "NC-CONSTRAINT-OP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "nc_constraint_subject", "NC-CONSTRAINT-SUBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "nc_constraint_object", "NC-CONSTRAINT-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "binding_base", "BINDING-BASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "binding_target", "BINDING-TARGET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "nc_rule_bindings_completeP", "NC-RULE-BINDINGS-COMPLETE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "bindings_get_modifier_target", "BINDINGS-GET-MODIFIER-TARGET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "bindings_get_head_target", "BINDINGS-GET-HEAD-TARGET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "set_nc_phrase_constraints", "SET-NC-PHRASE-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "organize_rule_syntactic_constraints", "ORGANIZE-RULE-SYNTACTIC-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "organize_syntactic_constraints", "ORGANIZE-SYNTACTIC-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "nc_rule_match_template", "NC-RULE-MATCH-TEMPLATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "nc_rule_pat_match", "NC-RULE-PAT-MATCH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "binding_satisfies_nc_rule_semantic_constraintsP", "BINDING-SATISFIES-NC-RULE-SEMANTIC-CONSTRAINTS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "target_satisfies_nc_rule_semantic_constraintP", "TARGET-SATISFIES-NC-RULE-SEMANTIC-CONSTRAINT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_noun_compound", "nc_constraint_appliesP", "NC-CONSTRAINT-APPLIES?", 2, 0, false);
        return (SubLObject)pph_noun_compound.NIL;
    }
    
    public static SubLObject init_pph_noun_compound_file() {
        pph_noun_compound.$pph_nc_rule_list_caching_state$ = SubLFiles.deflexical("*PPH-NC-RULE-LIST-CACHING-STATE*", (SubLObject)pph_noun_compound.NIL);
        pph_noun_compound.$nc_pos_constraint_fn$ = SubLFiles.defconstant("*NC-POS-CONSTRAINT-FN*", pph_noun_compound.$const25$NCPOSConstraintFn);
        pph_noun_compound.$nc_pos_pred_constraint_fn$ = SubLFiles.defconstant("*NC-POS-PRED-CONSTRAINT-FN*", pph_noun_compound.$const26$NCPOSPredConstraintFn);
        pph_noun_compound.$nc_equals_constraint_fn$ = SubLFiles.defconstant("*NC-EQUALS-CONSTRAINT-FN*", pph_noun_compound.$const27$NCEqualsConstraintFn);
        pph_noun_compound.$nc_genls_constraint_fn$ = SubLFiles.defconstant("*NC-GENLS-CONSTRAINT-FN*", pph_noun_compound.$const28$NCGenlsConstraintFn);
        pph_noun_compound.$nc_isa_constraint_fn$ = SubLFiles.defconstant("*NC-ISA-CONSTRAINT-FN*", pph_noun_compound.$const29$NCIsaConstraintFn);
        pph_noun_compound.$the_nc_modifier$ = SubLFiles.defconstant("*THE-NC-MODIFIER*", pph_noun_compound.$const30$TheNCModifier);
        pph_noun_compound.$the_nc_head$ = SubLFiles.defconstant("*THE-NC-HEAD*", pph_noun_compound.$const31$TheNCHead);
        pph_noun_compound.$noun_compound_rule$ = SubLFiles.defconstant("*NOUN-COMPOUND-RULE*", pph_noun_compound.$const32$NounCompoundRule);
        pph_noun_compound.$nc_rule_template$ = SubLFiles.defconstant("*NC-RULE-TEMPLATE*", pph_noun_compound.$const33$ncRuleTemplate);
        pph_noun_compound.$nc_rule_constraint$ = SubLFiles.defconstant("*NC-RULE-CONSTRAINT*", pph_noun_compound.$const34$ncRuleConstraint);
        pph_noun_compound.$nc_mt$ = SubLFiles.deflexical("*NC-MT*", pph_noun_compound.$const35$GeneralLexiconMt);
        return (SubLObject)pph_noun_compound.NIL;
    }
    
    public static SubLObject setup_pph_noun_compound_file() {
        memoization_state.note_globally_cached_function((SubLObject)pph_noun_compound.$sym0$PPH_NC_RULE_LIST);
        pph_types.pph_register_method((SubLObject)pph_noun_compound.$sym36$GENERATE_NOUN_COMPOUND_PHRASE, (SubLObject)pph_noun_compound.$kw37$COLLECTION_DENOTING_NAT, (SubLObject)pph_noun_compound.$kw38$BEST);
        memoization_state.note_memoized_function((SubLObject)pph_noun_compound.$sym39$PPH_FIND_NC_RULE_FOR_NAUT);
        return (SubLObject)pph_noun_compound.NIL;
    }
    
    public void declareFunctions() {
        declare_pph_noun_compound_file();
    }
    
    public void initializeVariables() {
        init_pph_noun_compound_file();
    }
    
    public void runTopLevelForms() {
        setup_pph_noun_compound_file();
    }
    
    static {
        me = (SubLFile)new pph_noun_compound();
        pph_noun_compound.$pph_nc_rule_list_caching_state$ = null;
        pph_noun_compound.$nc_pos_constraint_fn$ = null;
        pph_noun_compound.$nc_pos_pred_constraint_fn$ = null;
        pph_noun_compound.$nc_equals_constraint_fn$ = null;
        pph_noun_compound.$nc_genls_constraint_fn$ = null;
        pph_noun_compound.$nc_isa_constraint_fn$ = null;
        pph_noun_compound.$the_nc_modifier$ = null;
        pph_noun_compound.$the_nc_head$ = null;
        pph_noun_compound.$noun_compound_rule$ = null;
        pph_noun_compound.$nc_rule_template$ = null;
        pph_noun_compound.$nc_rule_constraint$ = null;
        pph_noun_compound.$nc_mt$ = null;
        $sym0$PPH_NC_RULE_LIST = SubLObjectFactory.makeSymbol("PPH-NC-RULE-LIST");
        $const1$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw2$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw3$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw4$STACK = SubLObjectFactory.makeKeyword("STACK");
        $const5$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $sym6$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw7$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str8$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym9$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw10$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str11$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw12$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str13$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str14$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str15$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $str17$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym18$_PPH_NC_RULE_LIST_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PPH-NC-RULE-LIST-CACHING-STATE*");
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINTS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym20$RULE = SubLObjectFactory.makeUninternedSymbol("RULE");
        $sym21$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-NC-RULE-LIST"));
        $sym23$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym24$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $const25$NCPOSConstraintFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCPOSConstraintFn"));
        $const26$NCPOSPredConstraintFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCPOSPredConstraintFn"));
        $const27$NCEqualsConstraintFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCEqualsConstraintFn"));
        $const28$NCGenlsConstraintFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCGenlsConstraintFn"));
        $const29$NCIsaConstraintFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCIsaConstraintFn"));
        $const30$TheNCModifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNCModifier"));
        $const31$TheNCHead = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNCHead"));
        $const32$NounCompoundRule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounCompoundRule"));
        $const33$ncRuleTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ncRuleTemplate"));
        $const34$ncRuleConstraint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ncRuleConstraint"));
        $const35$GeneralLexiconMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralLexiconMt"));
        $sym36$GENERATE_NOUN_COMPOUND_PHRASE = SubLObjectFactory.makeSymbol("GENERATE-NOUN-COMPOUND-PHRASE");
        $kw37$COLLECTION_DENOTING_NAT = SubLObjectFactory.makeKeyword("COLLECTION-DENOTING-NAT");
        $kw38$BEST = SubLObjectFactory.makeKeyword("BEST");
        $sym39$PPH_FIND_NC_RULE_FOR_NAUT = SubLObjectFactory.makeSymbol("PPH-FIND-NC-RULE-FOR-NAUT");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINTS"));
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD-POS-CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-POS-CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-POS-PRED-CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("MOD-POS-PRED-CONSTRAINT"));
        $const42$CountNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun"));
        $str43$_PPH_error_level_ = SubLObjectFactory.makeString("(PPH error level ");
        $str44$__ = SubLObjectFactory.makeString(") ");
        $str45$___S_isn_t_a_semantic_constraint_ = SubLObjectFactory.makeString("~&~S isn't a semantic constraint.~%");
        $sym46$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const47$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str48$___S_isn_t_a_recognized_noun_comp = SubLObjectFactory.makeString("~&~S isn't a recognized noun-compound constraint function.~%");
    }
}

/*

	Total time: 1090 ms
	
*/