/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.possibly_nat_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_basis_object;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_doneP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_element_validP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_initial_state;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_next;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_update_state;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PSP-RULES
 * source file: /cyc/top/cycl/psp-rules.lisp
 * created:     2019/07/03 17:38:24
 */
public final class psp_rules extends SubLTranslatedFile implements V12 {
    public static final SubLObject remove_psp_det_string_agreement_warn(SubLObject det_string) {
        return memoization_state.caching_state_remove_function_results_with_args($psp_det_string_agreement_warn_caching_state$.getGlobalValue(), list(det_string), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return INTEGERP; How many vanilla VBARs can we parse?
     */
    @LispMethod(comment = "@return INTEGERP; How many vanilla VBARs can we parse?")
    public static final SubLObject psp_vbar_count() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = ZERO_INTEGER;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_utilities.psp_lexicon_root_mt(UNPROVIDED));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject cdolist_list_var = lexicon_vars.verb_frames(UNPROVIDED);
                            SubLObject frame = NIL;
                            for (frame = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , frame = cdolist_list_var.first()) {
                                {
                                    SubLObject frame_usage = kb_indexing.num_gaf_arg_index(frame, THREE_INTEGER, $$verbSemTrans, UNPROVIDED);
                                    if (frame_usage.isPositive()) {
                                        {
                                            SubLObject frame_factor = psp_perms_for_verb_frame(frame);
                                            ans = add(ans, multiply(frame_factor, frame_usage));
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
                format(T, $str_alt166$Estimated_Vbar_count___A___, pph_main.generate_phrase(ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return INTEGERP; How many vanilla PPs headed by WU can we parse?
     */
    @LispMethod(comment = "@return INTEGERP; How many vanilla PPs headed by WU can we parse?")
    public static final SubLObject psp_pp_count(SubLObject wu) {
        if (wu == UNPROVIDED) {
            wu = $ANY;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject prep_count = ZERO_INTEGER;
                SubLObject foundP = NIL;
                SubLObject node_var = $$Preposition;
                SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                SubLObject recur_deck = deck.create_deck(deck_type);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject mt_var = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_100 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = foundP;
                                        {
                                            SubLObject _prev_bind_0_101 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_102 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt49$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_103 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_104 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_105 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$Preposition, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_106 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_107 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_108 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    while (NIL != node_var) {
                                                                        {
                                                                            SubLObject pos = node_var;
                                                                            SubLObject assertions = kb_mapping.gather_gaf_arg_index(pos, TWO_INTEGER, $$posForms, UNPROVIDED, UNPROVIDED);
                                                                            if (NIL != assertions) {
                                                                                if (wu == $ANY) {
                                                                                    prep_count = add(prep_count, length(assertions));
                                                                                } else {
                                                                                    if (NIL != member(wu, assertions, symbol_function(EQ), GAF_ARG1)) {
                                                                                        foundP = T;
                                                                                        prep_count = add(prep_count, ONE_INTEGER);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        {
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_109 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_110 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                {
                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    if (NIL != d_link) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != mt_links) {
                                                                                                                {
                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_111 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_112 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_112)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_112);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_113 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_114 = new_list;
                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_114.first(); NIL != cdolist_list_var_114; cdolist_list_var_114 = cdolist_list_var_114.rest() , node_vars_link_node = cdolist_list_var_114.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_113, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_112 = dictionary_contents.do_dictionary_contents_next(iteration_state_112);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_112);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_111, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt50$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_115 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_115.first(); NIL != cdolist_list_var_115; cdolist_list_var_115 = cdolist_list_var_115.rest() , generating_fn = cdolist_list_var_115.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_116 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_117 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_118 = new_list_117;
                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                        for (node_vars_link_node = cdolist_list_var_118.first(); NIL != cdolist_list_var_118; cdolist_list_var_118 = cdolist_list_var_118.rest() , node_vars_link_node = cdolist_list_var_118.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_116, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_110, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_109, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        node_var = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_108, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_107, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_106, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt52$Node__a_does_not_pass_sbhl_type_t, $$Preposition, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_105, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_104, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_103, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_102, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_101, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_100, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
                ans = multiply(prep_count, psp_np_count());
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return INTEGERP; How many sets of phrases satisfying FRAME can we parse?
     */
    @LispMethod(comment = "@return INTEGERP; How many sets of phrases satisfying FRAME can we parse?")
    public static final SubLObject psp_perms_for_verb_frame(SubLObject frame) {
        {
            SubLObject ans = ONE_INTEGER;
            SubLObject constraint_lists = psp_new_dtr_constraints_from_frame(frame);
            SubLObject i = NIL;
            SubLObject constraints = NIL;
            for (i = ZERO_INTEGER, constraints = nth(i, constraint_lists); !(ans.numE(ZERO_INTEGER) || (NIL == constraints)); i = number_utilities.f_1X(i) , constraints = nth(i, constraint_lists)) {
                {
                    SubLObject prepP = NIL;
                    SubLObject wu = NIL;
                    SubLObject type = NIL;
                    if (NIL == type) {
                        {
                            SubLObject csome_list_var = constraints;
                            SubLObject constraint = NIL;
                            for (constraint = csome_list_var.first(); !((NIL != type) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , constraint = csome_list_var.first()) {
                                if (constraint.first() == $$ConstituentTypeConstraintFn) {
                                    {
                                        SubLObject target = psp_rewrite(second(constraint));
                                        if (target == $$NounPhrase) {
                                            type = $NP;
                                            ans = multiply(ans, psp_np_count());
                                        } else {
                                            if (NIL != genls.genl_in_any_mtP(target, $$Preposition)) {
                                                prepP = T;
                                                if (NIL != wu) {
                                                    type = $PP;
                                                    ans = multiply(ans, psp_pp_count(wu));
                                                }
                                            } else {
                                                if (NIL != psp_lexeme_constraintP(function_terms.nart_to_naut(target))) {
                                                    wu = cycl_utilities.formula_arg3(target, UNPROVIDED);
                                                    if (NIL != prepP) {
                                                        type = $PP;
                                                        ans = multiply(ans, psp_pp_count(wu));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (type == $PP) {
                        i = add(i, ONE_INTEGER);
                    }
                    if (NIL == type) {
                        if (NIL != prepP) {
                            print(frame, UNPROVIDED);
                            ans = multiply(ans, psp_pp_count(UNPROVIDED));
                        } else {
                            if (NIL != wu) {
                                ans = multiply(ans, psp_pp_count(wu));
                            } else {
                                ans = ZERO_INTEGER;
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    public static final SubLObject psp_np_count() {
        if ($psp_np_count$.getGlobalValue() == $UNKNOWN) {
            compute_psp_np_count();
        }
        return $psp_np_count$.getGlobalValue();
    }

    /**
     *
     *
     * @return INTEGERP; How many determiners does PRED agree with?
     */
    @LispMethod(comment = "@return INTEGERP; How many determiners does PRED agree with?")
    public static final SubLObject psp_determiner_agreement_cardinality(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = ZERO_INTEGER;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_utilities.psp_lexicon_root_mt(UNPROVIDED));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject node_var = $$Determiner;
                            SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            {
                                SubLObject _prev_bind_0_157 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_158 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_159 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt49$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_160 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_161 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_162 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$Determiner, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_163 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_164 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_165 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    while (NIL != node_var) {
                                                                        {
                                                                            SubLObject pos = node_var;
                                                                            SubLObject wu = NIL;
                                                                            SubLObject pred_var = $$posForms;
                                                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pos, TWO_INTEGER, pred_var)) {
                                                                                {
                                                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pos, TWO_INTEGER, pred_var);
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
                                                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                                        {
                                                                                                            SubLObject done_var_166 = NIL;
                                                                                                            SubLObject token_var_167 = NIL;
                                                                                                            while (NIL == done_var_166) {
                                                                                                                {
                                                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_167);
                                                                                                                    SubLObject valid_168 = makeBoolean(token_var_167 != assertion);
                                                                                                                    if (NIL != valid_168) {
                                                                                                                        wu = assertions_high.gaf_arg(assertion, ONE_INTEGER);
                                                                                                                        {
                                                                                                                            SubLObject agr_pred = NIL;
                                                                                                                            SubLObject pred_var_169 = $$determinerAgreement;
                                                                                                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(wu, ONE_INTEGER, pred_var_169)) {
                                                                                                                                {
                                                                                                                                    SubLObject iterator_var_170 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(wu, ONE_INTEGER, pred_var_169);
                                                                                                                                    SubLObject done_var_171 = NIL;
                                                                                                                                    SubLObject token_var_172 = NIL;
                                                                                                                                    while (NIL == done_var_171) {
                                                                                                                                        {
                                                                                                                                            SubLObject final_index_spec_173 = iteration.iteration_next_without_values_macro_helper(iterator_var_170, token_var_172);
                                                                                                                                            SubLObject valid_174 = makeBoolean(token_var_172 != final_index_spec_173);
                                                                                                                                            if (NIL != valid_174) {
                                                                                                                                                {
                                                                                                                                                    SubLObject final_index_iterator_175 = NIL;
                                                                                                                                                    try {
                                                                                                                                                        final_index_iterator_175 = kb_mapping_macros.new_final_index_iterator(final_index_spec_173, $GAF, $TRUE, NIL);
                                                                                                                                                        {
                                                                                                                                                            SubLObject done_var_176 = NIL;
                                                                                                                                                            SubLObject token_var_177 = NIL;
                                                                                                                                                            while (NIL == done_var_176) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject assertion_178 = iteration.iteration_next_without_values_macro_helper(final_index_iterator_175, token_var_177);
                                                                                                                                                                    SubLObject valid_179 = makeBoolean(token_var_177 != assertion_178);
                                                                                                                                                                    if (NIL != valid_179) {
                                                                                                                                                                        agr_pred = assertions_high.gaf_arg(assertion_178, TWO_INTEGER);
                                                                                                                                                                        if (NIL != lexicon_accessors.genl_pos_predP(pred, agr_pred, UNPROVIDED)) {
                                                                                                                                                                            ans = add(ans, ONE_INTEGER);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    done_var_176 = makeBoolean(NIL == valid_179);
                                                                                                                                                                }
                                                                                                                                                            } 
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_180 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                                                                if (NIL != final_index_iterator_175) {
                                                                                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_175);
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_180, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            done_var_171 = makeBoolean(NIL == valid_174);
                                                                                                                                        }
                                                                                                                                    } 
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    done_var_166 = makeBoolean(NIL == valid_168);
                                                                                                                }
                                                                                                            } 
                                                                                                        }
                                                                                                    } finally {
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_181 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                            try {
                                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                                if (NIL != final_index_iterator) {
                                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                                }
                                                                                                            } finally {
                                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_181, thread);
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
                                                                        {
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_182 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_183 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                {
                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    if (NIL != d_link) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != mt_links) {
                                                                                                                {
                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_184 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_185 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_185)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_185);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_186 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_187 = new_list;
                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_187.first(); NIL != cdolist_list_var_187; cdolist_list_var_187 = cdolist_list_var_187.rest() , node_vars_link_node = cdolist_list_var_187.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_186, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_185 = dictionary_contents.do_dictionary_contents_next(iteration_state_185);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_185);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_184, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt50$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_188 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_188.first(); NIL != cdolist_list_var_188; cdolist_list_var_188 = cdolist_list_var_188.rest() , generating_fn = cdolist_list_var_188.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_189 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_190 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_191 = new_list_190;
                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                        for (node_vars_link_node = cdolist_list_var_191.first(); NIL != cdolist_list_var_191; cdolist_list_var_191 = cdolist_list_var_191.rest() , node_vars_link_node = cdolist_list_var_191.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_189, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_183, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_182, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        node_var = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_165, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_164, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_163, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt52$Node__a_does_not_pass_sbhl_type_t, $$Determiner, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_162, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_161, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_160, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_159, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_158, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_157, thread);
                                }
                            }
                            if (NIL != lexicon_accessors.genl_pos_predP(pred, $$nonSingular_Generic, UNPROVIDED)) {
                                ans = add(ans, ONE_INTEGER);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject psp_det_string_agreement_warn_internal(SubLObject det_string) {
        Errors.warn($str_alt135$Determiner_agreement_not_known_fo, det_string);
        return det_string;
    }

    public static final SubLObject psp_det_string_agreement_warn(SubLObject det_string) {
        {
            SubLObject caching_state = $psp_det_string_agreement_warn_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PSP_DET_STRING_AGREEMENT_WARN, $psp_det_string_agreement_warn_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, det_string, $kw85$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw85$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(psp_det_string_agreement_warn_internal(det_string)));
                    memoization_state.caching_state_put(caching_state, det_string, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    /**
     *
     *
     * @return INTEGERP; How many word forms can be derived from PRED?
    By convention, include PRED itself in the total.
     */
    @LispMethod(comment = "@return INTEGERP; How many word forms can be derived from PRED?\r\nBy convention, include PRED itself in the total.")
    public static final SubLObject psp_derivable_preds_cardinality(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = ZERO_INTEGER;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_utilities.psp_lexicon_root_mt(UNPROVIDED));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        ans = number_utilities.f_1X(kb_indexing.num_gaf_arg_index(pred, TWO_INTEGER, $$regularSuffix, UNPROVIDED));
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static final SubLObject psp_average_denot_cardinality() {
        if ($psp_average_denot_cardinality$.getGlobalValue() == $UNKNOWN) {
            compute_psp_average_denot_cardinality();
        }
        return $psp_average_denot_cardinality$.getGlobalValue();
    }

    /**
     *
     *
     * @return INTEGERP; How many vanilla NPs can we parse?
     */
    @LispMethod(comment = "@return INTEGERP; How many vanilla NPs can we parse?")
    public static final SubLObject compute_psp_np_count() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $psp_np_count$.setGlobalValue(ZERO_INTEGER);
            {
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_utilities.psp_lexicon_root_mt(UNPROVIDED));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject node_var = $$Noun;
                            SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                            SubLObject recur_deck = deck.create_deck(deck_type);
                            {
                                SubLObject _prev_bind_0_46 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_47 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_48 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt49$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_49 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_50 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_51 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$Noun, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                            {
                                                                SubLObject _prev_bind_0_52 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_53 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                    while (NIL != node_var) {
                                                                        {
                                                                            SubLObject pos = node_var;
                                                                            SubLObject pred = kb_mapping_utilities.fpred_value(pos, $$basicSpeechPartPred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            if (NIL != pred) {
                                                                                {
                                                                                    SubLObject det_factor = psp_determiner_agreement_cardinality(pred);
                                                                                    SubLObject der_factor = psp_derivable_preds_cardinality(pred);
                                                                                    SubLObject ass_factor = kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
                                                                                    SubLObject np_cardinality = multiply(new SubLObject[]{ det_factor, der_factor, ass_factor, psp_average_denot_cardinality() });
                                                                                    $psp_np_count$.setGlobalValue(add($psp_np_count$.getGlobalValue(), np_cardinality));
                                                                                }
                                                                            }
                                                                        }
                                                                        {
                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                            SubLObject module_var = NIL;
                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_55 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_56 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                        {
                                                                                            SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                {
                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                    if (NIL != d_link) {
                                                                                                        {
                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            if (NIL != mt_links) {
                                                                                                                {
                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        {
                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_57 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject iteration_state_58 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_58)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_58);
                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_59 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                {
                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                    SubLObject cdolist_list_var_60 = new_list;
                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_60.first(); NIL != cdolist_list_var_60; cdolist_list_var_60 = cdolist_list_var_60.rest() , node_vars_link_node = cdolist_list_var_60.first()) {
                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_59, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    iteration_state_58 = dictionary_contents.do_dictionary_contents_next(iteration_state_58);
                                                                                                                                                }
                                                                                                                                            } 
                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_58);
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_57, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                        }
                                                                                                                    } 
                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt50$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                    {
                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        SubLObject cdolist_list_var_61 = new_list;
                                                                                                        SubLObject generating_fn = NIL;
                                                                                                        for (generating_fn = cdolist_list_var_61.first(); NIL != cdolist_list_var_61; cdolist_list_var_61 = cdolist_list_var_61.rest() , generating_fn = cdolist_list_var_61.first()) {
                                                                                                            {
                                                                                                                SubLObject _prev_bind_0_62 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                try {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                    {
                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                        SubLObject new_list_63 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                        SubLObject cdolist_list_var_64 = new_list_63;
                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                        for (node_vars_link_node = cdolist_list_var_64.first(); NIL != cdolist_list_var_64; cdolist_list_var_64 = cdolist_list_var_64.rest() , node_vars_link_node = cdolist_list_var_64.first()) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_62, thread);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_56, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_55, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        node_var = deck.deck_pop(recur_deck);
                                                                    } 
                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_54, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_53, thread);
                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_52, thread);
                                                                }
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt52$Node__a_does_not_pass_sbhl_type_t, $$Noun, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } finally {
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_51, thread);
                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_50, thread);
                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_49, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_48, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_47, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_46, thread);
                                }
                            }
                        }
                        {
                            SubLObject node_var = $$ProperNamePredicate_Strict;
                            {
                                SubLObject _prev_bind_0_65 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                SubLObject _prev_bind_1_66 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                try {
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject node_var_67 = node_var;
                                        SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                        SubLObject recur_deck = deck.create_deck(deck_type);
                                        {
                                            SubLObject _prev_bind_0_68 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                {
                                                    SubLObject tv_var = NIL;
                                                    {
                                                        SubLObject _prev_bind_0_69 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_70 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                            if (NIL != tv_var) {
                                                                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                    if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                        {
                                                                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                            if (pcase_var.eql($ERROR)) {
                                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (pcase_var.eql($CERROR)) {
                                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                } else {
                                                                                    if (pcase_var.eql($WARN)) {
                                                                                        Errors.warn($str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    } else {
                                                                                        Errors.warn($str_alt49$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                        Errors.cerror($$$continue_anyway, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            {
                                                                SubLObject _prev_bind_0_71 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_72 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_73 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                        {
                                                                            SubLObject _prev_bind_0_74 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_75 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_2_76 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_67, UNPROVIDED);
                                                                                while (NIL != node_var_67) {
                                                                                    {
                                                                                        SubLObject tt_node_var = node_var_67;
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_77 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_78 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_79 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_80 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_80)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_80);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_81 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_82 = new_list;
                                                                                                                                                                                SubLObject pred = NIL;
                                                                                                                                                                                for (pred = cdolist_list_var_82.first(); NIL != cdolist_list_var_82; cdolist_list_var_82 = cdolist_list_var_82.rest() , pred = cdolist_list_var_82.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                                        $psp_np_count$.setGlobalValue(add($psp_np_count$.getGlobalValue(), kb_indexing.num_predicate_extent_index(pred, UNPROVIDED)));
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_81, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_80 = dictionary_contents.do_dictionary_contents_next(iteration_state_80);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_80);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_79, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt50$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                                                                {
                                                                                                                    SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                                                                    SubLObject instance_tuple = NIL;
                                                                                                                    for (instance_tuple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , instance_tuple = csome_list_var.first()) {
                                                                                                                        {
                                                                                                                            SubLObject datum = instance_tuple;
                                                                                                                            SubLObject current = datum;
                                                                                                                            SubLObject link_node = NIL;
                                                                                                                            SubLObject mt = NIL;
                                                                                                                            SubLObject tv = NIL;
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt51);
                                                                                                                            link_node = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt51);
                                                                                                                            mt = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt51);
                                                                                                                            tv = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            if (NIL == current) {
                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_83 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_84 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject link_nodes = list(link_node);
                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                            SubLObject cdolist_list_var_85 = new_list;
                                                                                                                                                            SubLObject pred = NIL;
                                                                                                                                                            for (pred = cdolist_list_var_85.first(); NIL != cdolist_list_var_85; cdolist_list_var_85 = cdolist_list_var_85.rest() , pred = cdolist_list_var_85.first()) {
                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                    $psp_np_count$.setGlobalValue(add($psp_np_count$.getGlobalValue(), kb_indexing.num_predicate_extent_index(pred, UNPROVIDED)));
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_84, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_83, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                cdestructuring_bind_error(datum, $list_alt51);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_86 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_86.first(); NIL != cdolist_list_var_86; cdolist_list_var_86 = cdolist_list_var_86.rest() , generating_fn = cdolist_list_var_86.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_87 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_88 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_89 = new_list_88;
                                                                                                                                    SubLObject pred = NIL;
                                                                                                                                    for (pred = cdolist_list_var_89.first(); NIL != cdolist_list_var_89; cdolist_list_var_89 = cdolist_list_var_89.rest() , pred = cdolist_list_var_89.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                            $psp_np_count$.setGlobalValue(add($psp_np_count$.getGlobalValue(), kb_indexing.num_predicate_extent_index(pred, UNPROVIDED)));
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_87, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_78, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_77, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_90 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_91 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(node_var_67);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_92 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_93 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_93)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_93);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_94 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_95 = new_list;
                                                                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                for (node_vars_link_node = cdolist_list_var_95.first(); NIL != cdolist_list_var_95; cdolist_list_var_95 = cdolist_list_var_95.rest() , node_vars_link_node = cdolist_list_var_95.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_94, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_93 = dictionary_contents.do_dictionary_contents_next(iteration_state_93);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_93);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_92, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt50$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_96 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_96.first(); NIL != cdolist_list_var_96; cdolist_list_var_96 = cdolist_list_var_96.rest() , generating_fn = cdolist_list_var_96.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_97 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_98 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_99 = new_list_98;
                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                    for (node_vars_link_node = cdolist_list_var_99.first(); NIL != cdolist_list_var_99; cdolist_list_var_99 = cdolist_list_var_99.rest() , node_vars_link_node = cdolist_list_var_99.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_97, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_91, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_90, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    node_var_67 = deck.deck_pop(recur_deck);
                                                                                } 
                                                                            } finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_76, thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_75, thread);
                                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_74, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt52$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } finally {
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_73, thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_72, thread);
                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_71, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_70, thread);
                                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_69, thread);
                                                        }
                                                    }
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_68, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_66, thread);
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_65, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            $psp_np_count$.setGlobalValue(floor($psp_np_count$.getGlobalValue(), UNPROVIDED));
            format(T, $str_alt172$Estimated_NP_count___A___, pph_main.generate_phrase($psp_np_count$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            return $psp_np_count$.getGlobalValue();
        }
    }

    public static final SubLObject compute_psp_average_denot_cardinality() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pair_count = ZERO_INTEGER;
                SubLObject denot_count = ZERO_INTEGER;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_utilities.psp_lexicon_root_mt(UNPROVIDED));
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject node_var = $$LexicalWord;
                            {
                                SubLObject _prev_bind_0_119 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                SubLObject _prev_bind_1_120 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                try {
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject node_var_121 = node_var;
                                        SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                        SubLObject recur_deck = deck.create_deck(deck_type);
                                        {
                                            SubLObject _prev_bind_0_122 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                {
                                                    SubLObject tv_var = NIL;
                                                    {
                                                        SubLObject _prev_bind_0_123 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_124 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                            if (NIL != tv_var) {
                                                                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                    if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                        {
                                                                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                            if (pcase_var.eql($ERROR)) {
                                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (pcase_var.eql($CERROR)) {
                                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                } else {
                                                                                    if (pcase_var.eql($WARN)) {
                                                                                        Errors.warn($str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    } else {
                                                                                        Errors.warn($str_alt49$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                        Errors.cerror($$$continue_anyway, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            {
                                                                SubLObject _prev_bind_0_125 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_126 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_127 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                        {
                                                                            SubLObject _prev_bind_0_128 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_129 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_2_130 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_121, UNPROVIDED);
                                                                                while (NIL != node_var_121) {
                                                                                    {
                                                                                        SubLObject tt_node_var = node_var_121;
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_131 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_132 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_133 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_134 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_134)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_134);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_135 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_136 = new_list;
                                                                                                                                                                                SubLObject wu = NIL;
                                                                                                                                                                                for (wu = cdolist_list_var_136.first(); NIL != cdolist_list_var_136; cdolist_list_var_136 = cdolist_list_var_136.rest() , wu = cdolist_list_var_136.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(wu, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(wu, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                                        if (NIL != indexed_term_p(wu)) {
                                                                                                                                                                                            {
                                                                                                                                                                                                SubLObject denot_assertions = kb_mapping.gather_gaf_arg_index(wu, ONE_INTEGER, $$denotation, UNPROVIDED, UNPROVIDED);
                                                                                                                                                                                                SubLObject cdolist_list_var_137 = lexicon_accessors.all_speech_parts(UNPROVIDED);
                                                                                                                                                                                                SubLObject pos = NIL;
                                                                                                                                                                                                for (pos = cdolist_list_var_137.first(); NIL != cdolist_list_var_137; cdolist_list_var_137 = cdolist_list_var_137.rest() , pos = cdolist_list_var_137.first()) {
                                                                                                                                                                                                    {
                                                                                                                                                                                                        SubLObject wu_pos_count = count(pos, denot_assertions, symbol_function(EQ), GAF_ARG2, UNPROVIDED, UNPROVIDED);
                                                                                                                                                                                                        if (wu_pos_count.isPositive()) {
                                                                                                                                                                                                            pair_count = add(pair_count, ONE_INTEGER);
                                                                                                                                                                                                            denot_count = add(denot_count, wu_pos_count);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_135, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_134 = dictionary_contents.do_dictionary_contents_next(iteration_state_134);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_134);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_133, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt50$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                                                                {
                                                                                                                    SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                                                                    SubLObject instance_tuple = NIL;
                                                                                                                    for (instance_tuple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , instance_tuple = csome_list_var.first()) {
                                                                                                                        {
                                                                                                                            SubLObject datum = instance_tuple;
                                                                                                                            SubLObject current = datum;
                                                                                                                            SubLObject link_node = NIL;
                                                                                                                            SubLObject mt = NIL;
                                                                                                                            SubLObject tv = NIL;
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt51);
                                                                                                                            link_node = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt51);
                                                                                                                            mt = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt51);
                                                                                                                            tv = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            if (NIL == current) {
                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_138 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_139 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject link_nodes = list(link_node);
                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                            SubLObject cdolist_list_var_140 = new_list;
                                                                                                                                                            SubLObject wu = NIL;
                                                                                                                                                            for (wu = cdolist_list_var_140.first(); NIL != cdolist_list_var_140; cdolist_list_var_140 = cdolist_list_var_140.rest() , wu = cdolist_list_var_140.first()) {
                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(wu, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(wu, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                    if (NIL != indexed_term_p(wu)) {
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject denot_assertions = kb_mapping.gather_gaf_arg_index(wu, ONE_INTEGER, $$denotation, UNPROVIDED, UNPROVIDED);
                                                                                                                                                                            SubLObject cdolist_list_var_141 = lexicon_accessors.all_speech_parts(UNPROVIDED);
                                                                                                                                                                            SubLObject pos = NIL;
                                                                                                                                                                            for (pos = cdolist_list_var_141.first(); NIL != cdolist_list_var_141; cdolist_list_var_141 = cdolist_list_var_141.rest() , pos = cdolist_list_var_141.first()) {
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject wu_pos_count = count(pos, denot_assertions, symbol_function(EQ), GAF_ARG2, UNPROVIDED, UNPROVIDED);
                                                                                                                                                                                    if (wu_pos_count.isPositive()) {
                                                                                                                                                                                        pair_count = add(pair_count, ONE_INTEGER);
                                                                                                                                                                                        denot_count = add(denot_count, wu_pos_count);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_139, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_138, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                cdestructuring_bind_error(datum, $list_alt51);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_142 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_142.first(); NIL != cdolist_list_var_142; cdolist_list_var_142 = cdolist_list_var_142.rest() , generating_fn = cdolist_list_var_142.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_143 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_144 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_145 = new_list_144;
                                                                                                                                    SubLObject wu = NIL;
                                                                                                                                    for (wu = cdolist_list_var_145.first(); NIL != cdolist_list_var_145; cdolist_list_var_145 = cdolist_list_var_145.rest() , wu = cdolist_list_var_145.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(wu, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(wu, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                            if (NIL != indexed_term_p(wu)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject denot_assertions = kb_mapping.gather_gaf_arg_index(wu, ONE_INTEGER, $$denotation, UNPROVIDED, UNPROVIDED);
                                                                                                                                                    SubLObject cdolist_list_var_146 = lexicon_accessors.all_speech_parts(UNPROVIDED);
                                                                                                                                                    SubLObject pos = NIL;
                                                                                                                                                    for (pos = cdolist_list_var_146.first(); NIL != cdolist_list_var_146; cdolist_list_var_146 = cdolist_list_var_146.rest() , pos = cdolist_list_var_146.first()) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject wu_pos_count = count(pos, denot_assertions, symbol_function(EQ), GAF_ARG2, UNPROVIDED, UNPROVIDED);
                                                                                                                                                            if (wu_pos_count.isPositive()) {
                                                                                                                                                                pair_count = add(pair_count, ONE_INTEGER);
                                                                                                                                                                denot_count = add(denot_count, wu_pos_count);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_143, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_132, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_131, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_147 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_148 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(node_var_121);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_149 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_150 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_150)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_150);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_151 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_152 = new_list;
                                                                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                for (node_vars_link_node = cdolist_list_var_152.first(); NIL != cdolist_list_var_152; cdolist_list_var_152 = cdolist_list_var_152.rest() , node_vars_link_node = cdolist_list_var_152.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_151, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_150 = dictionary_contents.do_dictionary_contents_next(iteration_state_150);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_150);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_149, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt50$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_153 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_153.first(); NIL != cdolist_list_var_153; cdolist_list_var_153 = cdolist_list_var_153.rest() , generating_fn = cdolist_list_var_153.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_154 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_155 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_156 = new_list_155;
                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                    for (node_vars_link_node = cdolist_list_var_156.first(); NIL != cdolist_list_var_156; cdolist_list_var_156 = cdolist_list_var_156.rest() , node_vars_link_node = cdolist_list_var_156.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_154, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_148, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_147, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    node_var_121 = deck.deck_pop(recur_deck);
                                                                                } 
                                                                            } finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_130, thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_129, thread);
                                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_128, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt52$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } finally {
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_127, thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_126, thread);
                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_125, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_124, thread);
                                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_123, thread);
                                                        }
                                                    }
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_122, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_120, thread);
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_119, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                format(T, $str_alt182$_D_pairs___D_denots___, pair_count, denot_count);
                $psp_average_denot_cardinality$.setGlobalValue(divide(denot_count, pair_count));
            }
            return $psp_average_denot_cardinality$.getGlobalValue();
        }
    }

    public static final SubLObject clear_psp_det_string_agreement_warn() {
        {
            SubLObject cs = $psp_det_string_agreement_warn_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLSymbol $psp_average_denot_cardinality$ = makeSymbol("*PSP-AVERAGE-DENOT-CARDINALITY*");

    public static final SubLSymbol $psp_np_count$ = makeSymbol("*PSP-NP-COUNT*");

    public static final SubLSymbol $psp_det_string_agreement_warn_caching_state$ = makeSymbol("*PSP-DET-STRING-AGREEMENT-WARN-CACHING-STATE*");

    public static final SubLFile me = new psp_rules();

 public static final String myName = "com.cyc.cycjava.cycl.psp_rules";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_phrase_structure_parser_rule$ = makeSymbol("*DTP-PHRASE-STRUCTURE-PARSER-RULE*");

    // defparameter
    // Hashtable for storing phrase-structure rules used for parsing.
    /**
     * Hashtable for storing phrase-structure rules used for parsing.
     */
    @LispMethod(comment = "Hashtable for storing phrase-structure rules used for parsing.\ndefparameter")
    private static final SubLSymbol $psp_rules$ = makeSymbol("*PSP-RULES*");

    // deflexical
    /**
     *
     *
     * @unknown until #$psRuleWeight has been created
     */
    @LispMethod(comment = "@unknown until #$psRuleWeight has been created\ndeflexical")
    private static final SubLSymbol $psp_rule_fort_weights$ = makeSymbol("*PSP-RULE-FORT-WEIGHTS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $psp_rule_arity_weight$ = makeSymbol("*PSP-RULE-ARITY-WEIGHT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $psp_cycl_fails_constraintP_caching_state$ = makeSymbol("*PSP-CYCL-FAILS-CONSTRAINT?-CACHING-STATE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol PHRASE_STRUCTURE_PARSER_RULE = makeSymbol("PHRASE-STRUCTURE-PARSER-RULE");

    private static final SubLSymbol PHRASE_STRUCTURE_PARSER_RULE_P = makeSymbol("PHRASE-STRUCTURE-PARSER-RULE-P");

    static private final SubLList $list2 = list(makeSymbol("FORT"), makeSymbol("ARITY"), makeSymbol("CATEGORY"), makeSymbol("HEAD"), makeSymbol("CONSTRAINTS"), makeSymbol("SEMX"), makeSymbol("WEIGHT"));

    static private final SubLList $list3 = list($FORT, makeKeyword("ARITY"), makeKeyword("CATEGORY"), $HEAD, makeKeyword("CONSTRAINTS"), $SEMX, makeKeyword("WEIGHT"));

    static private final SubLList $list4 = list(makeSymbol("PSP-RULE-FORT"), makeSymbol("PSP-RULE-ARITY"), makeSymbol("PSP-RULE-CATEGORY"), makeSymbol("PSP-RULE-HEAD"), makeSymbol("PSP-RULE-CONSTRAINTS"), makeSymbol("PSP-RULE-SEMX"), makeSymbol("PSP-RULE-WEIGHT"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-PSP-RULE-FORT"), makeSymbol("_CSETF-PSP-RULE-ARITY"), makeSymbol("_CSETF-PSP-RULE-CATEGORY"), makeSymbol("_CSETF-PSP-RULE-HEAD"), makeSymbol("_CSETF-PSP-RULE-CONSTRAINTS"), makeSymbol("_CSETF-PSP-RULE-SEMX"), makeSymbol("_CSETF-PSP-RULE-WEIGHT"));

    private static final SubLSymbol PPRINT_PSP_RULE = makeSymbol("PPRINT-PSP-RULE");

    private static final SubLSymbol PHRASE_STRUCTURE_PARSER_RULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PHRASE-STRUCTURE-PARSER-RULE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PHRASE-STRUCTURE-PARSER-RULE-P"));

    private static final SubLSymbol PSP_RULE_FORT = makeSymbol("PSP-RULE-FORT");

    private static final SubLSymbol _CSETF_PSP_RULE_FORT = makeSymbol("_CSETF-PSP-RULE-FORT");

    private static final SubLSymbol PSP_RULE_ARITY = makeSymbol("PSP-RULE-ARITY");

    private static final SubLSymbol _CSETF_PSP_RULE_ARITY = makeSymbol("_CSETF-PSP-RULE-ARITY");

    private static final SubLSymbol PSP_RULE_CATEGORY = makeSymbol("PSP-RULE-CATEGORY");

    private static final SubLSymbol _CSETF_PSP_RULE_CATEGORY = makeSymbol("_CSETF-PSP-RULE-CATEGORY");

    private static final SubLSymbol PSP_RULE_HEAD = makeSymbol("PSP-RULE-HEAD");

    private static final SubLSymbol _CSETF_PSP_RULE_HEAD = makeSymbol("_CSETF-PSP-RULE-HEAD");

    private static final SubLSymbol PSP_RULE_CONSTRAINTS = makeSymbol("PSP-RULE-CONSTRAINTS");

    private static final SubLSymbol _CSETF_PSP_RULE_CONSTRAINTS = makeSymbol("_CSETF-PSP-RULE-CONSTRAINTS");

    private static final SubLSymbol PSP_RULE_SEMX = makeSymbol("PSP-RULE-SEMX");

    private static final SubLSymbol _CSETF_PSP_RULE_SEMX = makeSymbol("_CSETF-PSP-RULE-SEMX");

    private static final SubLSymbol PSP_RULE_WEIGHT = makeSymbol("PSP-RULE-WEIGHT");

    private static final SubLSymbol _CSETF_PSP_RULE_WEIGHT = makeSymbol("_CSETF-PSP-RULE-WEIGHT");

    private static final SubLString $str30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_PHRASE_STRUCTURE_PARSER_RULE = makeSymbol("MAKE-PHRASE-STRUCTURE-PARSER-RULE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_RULE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-RULE-METHOD");

    private static final SubLString $str36$__PSP_RULE___S_ = makeString("#<PSP-RULE: ~S>");

    private static final SubLList $list37 = list(list(makeSymbol("TYPE"), makeSymbol("TARGET")), makeSymbol("CONSTRAINT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLSymbol ADD_PHRASE_STRUCTURE_RULE = makeSymbol("ADD-PHRASE-STRUCTURE-RULE");

    private static final SubLSymbol REMOVE_PHRASE_STRUCTURE_RULE = makeSymbol("REMOVE-PHRASE-STRUCTURE-RULE");





    private static final SubLString $str49$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str54$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str55$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str56$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLList $list57 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str58$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");









    private static final SubLList $list64 = list(makeSymbol("C-TYPE"), makeSymbol("DTR"), makeSymbol("TARGET"));









    private static final SubLObject $$PSBindingFn_TypeLevel = reader_make_constant_shell("PSBindingFn-TypeLevel");



    private static final SubLObject $$PSRule_NounNounCompound = reader_make_constant_shell("PSRule-NounNounCompound");

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLObject $$PSRule_NameNounCompound = reader_make_constant_shell("PSRule-NameNounCompound");

    private static final SubLObject $$PSRule_AdjectiveNameCompound = reader_make_constant_shell("PSRule-AdjectiveNameCompound");

    private static final SubLObject $$PSRule_NameNameNounCompound = reader_make_constant_shell("PSRule-NameNameNounCompound");

    private static final SubLSymbol PSP_RULE_FORT_WEIGHTS = makeSymbol("PSP-RULE-FORT-WEIGHTS");

    private static final SubLString $$$psRuleWeight = makeString("psRuleWeight");

    private static final SubLList $list85 = cons(makeSymbol("?RULE"), makeSymbol("?WEIGHT"));

    private static final SubLList $list86 = list(makeSymbol("?RULE"), makeSymbol("?WEIGHT"));

    private static final SubLList $list87 = cons(makeSymbol("RULE"), makeSymbol("RAW-WEIGHT"));

    private static final SubLFloat $float$0_95 = makeDouble(0.95);

    private static final SubLSymbol $INFINITE_RECURSION_RULE = makeKeyword("INFINITE-RECURSION-RULE");

    private static final SubLList $list90 = list(makeSymbol("TYPE"), makeSymbol("TARGET"));





    private static final SubLSymbol $psp_traced_rules$ = makeSymbol("*PSP-TRACED-RULES*");

    private static final SubLList $list97 = list(makeSymbol("RULE-FORT"), makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLSymbol $sym99$PSP_TRACED_RULE_ = makeSymbol("PSP-TRACED-RULE?");

    private static final SubLSymbol DO_PSP_TRACE_REPORT = makeSymbol("DO-PSP-TRACE-REPORT");

    private static final SubLList $list101 = list(makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLString $str103$___S___meets_the_first_dtr_constr = makeString("~&~S~% meets the first-dtr constraints of ~S. Frame = ~S");

    private static final SubLSymbol $sym104$PSP_SEMANTIC_CONSTRAINT_ = makeSymbol("PSP-SEMANTIC-CONSTRAINT?");

    private static final SubLString $str105$___S____A_constraint__S___ = makeString("~&~S~% ~A constraint ~S.~%");

    private static final SubLString $$$failed = makeString("failed");

    private static final SubLString $$$met = makeString("met");

    private static final SubLString $str110$___S___failed_constraint__S___S = makeString("~&~S~% failed constraint ~S: ~S");

    private static final SubLSymbol $psp_syntactic_constraint_types$ = makeSymbol("*PSP-SYNTACTIC-CONSTRAINT-TYPES*");

    private static final SubLObject $const112$PhraseStructureConstraint_Syntact = reader_make_constant_shell("PhraseStructureConstraint-Syntactic");



    private static final SubLSymbol $psp_semantic_constraint_types$ = makeSymbol("*PSP-SEMANTIC-CONSTRAINT-TYPES*");

    private static final SubLObject $const115$PhraseStructureConstraint_Semanti = reader_make_constant_shell("PhraseStructureConstraint-Semantic");

    private static final SubLSymbol $sym116$PSP_CYCL_FAILS_CONSTRAINT_ = makeSymbol("PSP-CYCL-FAILS-CONSTRAINT?");

    private static final SubLList $list117 = list(makeSymbol("C-TYPE"), makeSymbol("TARGET"));





    private static final SubLSymbol $sym120$_PSP_CYCL_FAILS_CONSTRAINT__CACHING_STATE_ = makeSymbol("*PSP-CYCL-FAILS-CONSTRAINT?-CACHING-STATE*");





    private static final SubLSymbol PSP_PHRASE_TYPES = makeSymbol("PSP-PHRASE-TYPES");



    private static final SubLSymbol $psp_phrase_types_caching_state$ = makeSymbol("*PSP-PHRASE-TYPES-CACHING-STATE*");

    private static final SubLSymbol $sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_ = makeSymbol("PSP-CONSTRAINTS-REQUIRE-PHRASE?");



    static private final SubLList $list130 = list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("NLWordForm"), reader_make_constant_shell("lexemeOfWordForm"));

    private static final SubLList $list131 = list(reader_make_constant_shell("NLPhraseWithFrameFn"), reader_make_constant_shell("NLWordFormWithFrameFn"));

    private static final SubLObject $$Number_SP = reader_make_constant_shell("Number-SP");

    private static final SubLList $list133 = list(reader_make_constant_shell("nounStrings"));

    private static final SubLSymbol $sym134$GENL_POS_PRED_ = makeSymbol("GENL-POS-PRED?");

    private static final SubLSymbol PSP_SUB_CATEGORIES = makeSymbol("PSP-SUB-CATEGORIES");

    private static final SubLSymbol $psp_sub_categories_caching_state$ = makeSymbol("*PSP-SUB-CATEGORIES-CACHING-STATE*");

    private static final SubLSymbol PSP_SUB_POS_PREDS = makeSymbol("PSP-SUB-POS-PREDS");

    private static final SubLSymbol $psp_sub_pos_preds_caching_state$ = makeSymbol("*PSP-SUB-POS-PREDS-CACHING-STATE*");

    private static final SubLSymbol PSP_FRAME_TYPE_INSTANCES = makeSymbol("PSP-FRAME-TYPE-INSTANCES");

    private static final SubLSymbol $psp_frame_type_instances_caching_state$ = makeSymbol("*PSP-FRAME-TYPE-INSTANCES-CACHING-STATE*");

    private static final SubLSymbol PSP_REWRITE = makeSymbol("PSP-REWRITE");



    private static final SubLSymbol $psp_rewrite_caching_state$ = makeSymbol("*PSP-REWRITE-CACHING-STATE*");

    private static final SubLSymbol $sym146$PSP_ISA_ = makeSymbol("PSP-ISA?");

    private static final SubLSymbol $sym147$PSP_GENL_ = makeSymbol("PSP-GENL?");

    private static final SubLList $list148 = list(makeSymbol("N"), makeSymbol("TARGET"));

    private static final SubLSymbol $sym149$PSP_SPEC_CONST_CONSTRAINT_ = makeSymbol("PSP-SPEC-CONST-CONSTRAINT?");

    private static final SubLSymbol $PASSIVE_WITH_BY = makeKeyword("PASSIVE-WITH-BY");

    private static final SubLList $list151 = list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("NLWordForm"), reader_make_constant_shell("lexemeOfWordForm"), reader_make_constant_shell("By-TheWord"));





    private static final SubLList $list154 = list(TWO_INTEGER, THREE_INTEGER);













    private static final SubLList $list161 = list(makeSymbol("C1-TYPE"), makeSymbol("C1-TARGET"));

    private static final SubLList $list162 = list(makeSymbol("C2-TYPE"), makeSymbol("C2-TARGET"));

    private static final SubLSymbol PSP_PARSE_TREE_FOR_EDGE = makeSymbol("PSP-PARSE-TREE-FOR-EDGE");

    public static final SubLObject phrase_structure_parser_rule_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        pprint_psp_rule(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject phrase_structure_parser_rule_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_psp_rule(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject phrase_structure_parser_rule_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.psp_rules.$phrase_structure_parser_rule_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject phrase_structure_parser_rule_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.psp_rules.$phrase_structure_parser_rule_native.class ? T : NIL;
    }

    public static final SubLObject psp_rule_fort_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_RULE_P);
        return v_object.getField2();
    }

    public static SubLObject psp_rule_fort(final SubLObject v_object) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "! psp_rules.phrase_structure_parser_rule_p(v_object) " + "psp_rules.phrase_structure_parser_rule_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject psp_rule_arity_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_RULE_P);
        return v_object.getField3();
    }

    public static SubLObject psp_rule_arity(final SubLObject v_object) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "! psp_rules.phrase_structure_parser_rule_p(v_object) " + "psp_rules.phrase_structure_parser_rule_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject psp_rule_category_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_RULE_P);
        return v_object.getField4();
    }

    public static SubLObject psp_rule_category(final SubLObject v_object) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "! psp_rules.phrase_structure_parser_rule_p(v_object) " + "psp_rules.phrase_structure_parser_rule_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject psp_rule_head_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_RULE_P);
        return v_object.getField5();
    }

    public static SubLObject psp_rule_head(final SubLObject v_object) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "! psp_rules.phrase_structure_parser_rule_p(v_object) " + "psp_rules.phrase_structure_parser_rule_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject psp_rule_constraints_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_RULE_P);
        return v_object.getField6();
    }

    public static SubLObject psp_rule_constraints(final SubLObject v_object) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "! psp_rules.phrase_structure_parser_rule_p(v_object) " + "psp_rules.phrase_structure_parser_rule_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject psp_rule_semx_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_RULE_P);
        return v_object.getField7();
    }

    public static SubLObject psp_rule_semx(final SubLObject v_object) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "! psp_rules.phrase_structure_parser_rule_p(v_object) " + "psp_rules.phrase_structure_parser_rule_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject psp_rule_weight_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_RULE_P);
        return v_object.getField8();
    }

    public static SubLObject psp_rule_weight(final SubLObject v_object) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "! psp_rules.phrase_structure_parser_rule_p(v_object) " + "psp_rules.phrase_structure_parser_rule_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject _csetf_psp_rule_fort_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_RULE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_psp_rule_fort(final SubLObject v_object, final SubLObject value) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "! psp_rules.phrase_structure_parser_rule_p(v_object) " + "psp_rules.phrase_structure_parser_rule_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_psp_rule_arity_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_RULE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_psp_rule_arity(final SubLObject v_object, final SubLObject value) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "! psp_rules.phrase_structure_parser_rule_p(v_object) " + "psp_rules.phrase_structure_parser_rule_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_psp_rule_category_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_RULE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_psp_rule_category(final SubLObject v_object, final SubLObject value) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "! psp_rules.phrase_structure_parser_rule_p(v_object) " + "psp_rules.phrase_structure_parser_rule_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_psp_rule_head_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_RULE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_psp_rule_head(final SubLObject v_object, final SubLObject value) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "! psp_rules.phrase_structure_parser_rule_p(v_object) " + "psp_rules.phrase_structure_parser_rule_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_psp_rule_constraints_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_RULE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_psp_rule_constraints(final SubLObject v_object, final SubLObject value) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "! psp_rules.phrase_structure_parser_rule_p(v_object) " + "psp_rules.phrase_structure_parser_rule_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_psp_rule_semx_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_RULE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_psp_rule_semx(final SubLObject v_object, final SubLObject value) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "! psp_rules.phrase_structure_parser_rule_p(v_object) " + "psp_rules.phrase_structure_parser_rule_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_psp_rule_weight_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PHRASE_STRUCTURE_PARSER_RULE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_psp_rule_weight(final SubLObject v_object, final SubLObject value) {
        assert NIL != phrase_structure_parser_rule_p(v_object) : "! psp_rules.phrase_structure_parser_rule_p(v_object) " + "psp_rules.phrase_structure_parser_rule_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject make_phrase_structure_parser_rule_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.psp_rules.$phrase_structure_parser_rule_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($FORT)) {
                        _csetf_psp_rule_fort(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ARITY)) {
                            _csetf_psp_rule_arity(v_new, current_value);
                        } else {
                            if (pcase_var.eql($CATEGORY)) {
                                _csetf_psp_rule_category(v_new, current_value);
                            } else {
                                if (pcase_var.eql($HEAD)) {
                                    _csetf_psp_rule_head(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($CONSTRAINTS)) {
                                        _csetf_psp_rule_constraints(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($SEMX)) {
                                            _csetf_psp_rule_semx(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($WEIGHT)) {
                                                _csetf_psp_rule_weight(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt29$Invalid_slot__S_for_construction_, current_arg);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_phrase_structure_parser_rule(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.psp_rules.$phrase_structure_parser_rule_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FORT)) {
                _csetf_psp_rule_fort(v_new, current_value);
            } else
                if (pcase_var.eql($ARITY)) {
                    _csetf_psp_rule_arity(v_new, current_value);
                } else
                    if (pcase_var.eql($CATEGORY)) {
                        _csetf_psp_rule_category(v_new, current_value);
                    } else
                        if (pcase_var.eql($HEAD)) {
                            _csetf_psp_rule_head(v_new, current_value);
                        } else
                            if (pcase_var.eql($CONSTRAINTS)) {
                                _csetf_psp_rule_constraints(v_new, current_value);
                            } else
                                if (pcase_var.eql($SEMX)) {
                                    _csetf_psp_rule_semx(v_new, current_value);
                                } else
                                    if (pcase_var.eql($WEIGHT)) {
                                        _csetf_psp_rule_weight(v_new, current_value);
                                    } else {
                                        Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_phrase_structure_parser_rule(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PHRASE_STRUCTURE_PARSER_RULE, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $FORT, psp_rule_fort(obj));
        funcall(visitor_fn, obj, $SLOT, $ARITY, psp_rule_arity(obj));
        funcall(visitor_fn, obj, $SLOT, $CATEGORY, psp_rule_category(obj));
        funcall(visitor_fn, obj, $SLOT, $HEAD, psp_rule_head(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINTS, psp_rule_constraints(obj));
        funcall(visitor_fn, obj, $SLOT, $SEMX, psp_rule_semx(obj));
        funcall(visitor_fn, obj, $SLOT, $WEIGHT, psp_rule_weight(obj));
        funcall(visitor_fn, obj, $END, MAKE_PHRASE_STRUCTURE_PARSER_RULE, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_phrase_structure_parser_rule_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_phrase_structure_parser_rule(obj, visitor_fn);
    }

    public static final SubLObject pprint_psp_rule_alt(SubLObject psp_rule, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str_alt30$__PSP_RULE___S_, psp_rule_fort(psp_rule));
        return psp_rule;
    }

    public static SubLObject pprint_psp_rule(final SubLObject psp_rule, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str36$__PSP_RULE___S_, psp_rule_fort(psp_rule));
        return psp_rule;
    }

    public static final SubLObject new_psp_rule_alt(SubLObject fort, SubLObject v_arity, SubLObject category, SubLObject head, SubLObject constraints, SubLObject semx, SubLObject weight) {
        if (fort == UNPROVIDED) {
            fort = NIL;
        }
        if (v_arity == UNPROVIDED) {
            v_arity = NIL;
        }
        if (category == UNPROVIDED) {
            category = NIL;
        }
        if (head == UNPROVIDED) {
            head = NIL;
        }
        if (constraints == UNPROVIDED) {
            constraints = psp_new_constraints();
        }
        if (semx == UNPROVIDED) {
            semx = NIL;
        }
        if (weight == UNPROVIDED) {
            weight = NIL;
        }
        {
            SubLObject rule = make_phrase_structure_parser_rule(UNPROVIDED);
            _csetf_psp_rule_arity(rule, v_arity);
            _csetf_psp_rule_fort(rule, fort);
            _csetf_psp_rule_category(rule, category);
            _csetf_psp_rule_head(rule, head);
            _csetf_psp_rule_constraints(rule, constraints);
            _csetf_psp_rule_semx(rule, semx);
            _csetf_psp_rule_weight(rule, weight);
            return rule;
        }
    }

    public static SubLObject new_psp_rule(SubLObject fort, SubLObject v_arity, SubLObject category, SubLObject head, SubLObject constraints, SubLObject semx, SubLObject weight) {
        if (fort == UNPROVIDED) {
            fort = NIL;
        }
        if (v_arity == UNPROVIDED) {
            v_arity = NIL;
        }
        if (category == UNPROVIDED) {
            category = NIL;
        }
        if (head == UNPROVIDED) {
            head = NIL;
        }
        if (constraints == UNPROVIDED) {
            constraints = psp_new_constraints();
        }
        if (semx == UNPROVIDED) {
            semx = NIL;
        }
        if (weight == UNPROVIDED) {
            weight = NIL;
        }
        final SubLObject rule = make_phrase_structure_parser_rule(UNPROVIDED);
        _csetf_psp_rule_arity(rule, v_arity);
        _csetf_psp_rule_fort(rule, fort);
        _csetf_psp_rule_category(rule, category);
        _csetf_psp_rule_head(rule, head);
        _csetf_psp_rule_constraints(rule, constraints);
        _csetf_psp_rule_semx(rule, semx);
        _csetf_psp_rule_weight(rule, weight);
        return rule;
    }

    public static final SubLObject psp_new_constraints_alt() {
        return dictionary.new_dictionary(symbol_function(EQL), EIGHT_INTEGER);
    }

    public static SubLObject psp_new_constraints() {
        return dictionary.new_dictionary(symbol_function(EQL), EIGHT_INTEGER);
    }

    public static final SubLObject psp_constraints_on_dtr_alt(SubLObject dtr_num, SubLObject constraints) {
        return dictionary.dictionary_lookup_without_values(constraints, dtr_num, UNPROVIDED);
    }

    public static SubLObject psp_constraints_on_dtr(final SubLObject dtr_num, final SubLObject constraints) {
        return dictionary.dictionary_lookup_without_values(constraints, dtr_num, UNPROVIDED);
    }

    public static final SubLObject psp_new_constraint_alt(SubLObject type, SubLObject target) {
        return list(type, target);
    }

    public static SubLObject psp_new_constraint(final SubLObject type, final SubLObject target) {
        return list(type, target);
    }

    public static final SubLObject psp_constraint_type_alt(SubLObject constraint) {
        return constraint.first();
    }

    public static SubLObject psp_constraint_type(final SubLObject constraint) {
        return constraint.first();
    }

    public static final SubLObject psp_constraint_target_alt(SubLObject constraint) {
        return second(constraint);
    }

    public static SubLObject psp_constraint_target(final SubLObject constraint) {
        return second(constraint);
    }

    /**
     * Execute BODY with TYPE and TARGET bound to the type and target of CONSTRAINT.
     */
    @LispMethod(comment = "Execute BODY with TYPE and TARGET bound to the type and target of CONSTRAINT.")
    public static final SubLObject psp_destructure_constraint_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject type = NIL;
                    SubLObject target = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt31);
                    type = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt31);
                    target = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject constraint = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt31);
                            constraint = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                return listS(CDESTRUCTURING_BIND, list(type, target), constraint, append(body, NIL));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt31);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with TYPE and TARGET bound to the type and target of CONSTRAINT.
     */
    @LispMethod(comment = "Execute BODY with TYPE and TARGET bound to the type and target of CONSTRAINT.")
    public static SubLObject psp_destructure_constraint(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject type = NIL;
        SubLObject target = NIL;
        destructuring_bind_must_consp(current, datum, $list37);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        target = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject constraint = NIL;
            destructuring_bind_must_consp(current, datum, $list37);
            constraint = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CDESTRUCTURING_BIND, list(type, target), constraint, append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list37);
        return NIL;
    }

    public static final SubLObject psp_rules_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $psp_rules$.getDynamicValue(thread);
        }
    }

    public static SubLObject psp_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $psp_rules$.getDynamicValue(thread);
    }

    public static final SubLObject clear_psp_rules_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            psp_semantics.psp_semx_clear_handlers();
            psp_main.clear_psp_caches();
            clear_psp_rules_caches();
            return set.clear_set($psp_rules$.getDynamicValue(thread));
        }
    }

    public static SubLObject clear_psp_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        psp_semantics.psp_semx_clear_handlers();
        psp_main.clear_psp_caches();
        clear_psp_rules_caches();
        return set.clear_set($psp_rules$.getDynamicValue(thread));
    }

    /**
     * #$afterAdding for predicates involving #$PhraseStructureRules.
     */
    @LispMethod(comment = "#$afterAdding for predicates involving #$PhraseStructureRules.")
    public static final SubLObject add_phrase_structure_rule_alt(SubLObject argument, SubLObject assertion) {
        clear_psp_rules();
        return NIL;
    }

    /**
     * #$afterAdding for predicates involving #$PhraseStructureRules.
     */
    @LispMethod(comment = "#$afterAdding for predicates involving #$PhraseStructureRules.")
    public static SubLObject add_phrase_structure_rule(final SubLObject argument, final SubLObject assertion) {
        clear_psp_rules();
        return NIL;
    }

    /**
     * #$afterRemoving for predicates involving #$PhraseStructureRules.
     */
    @LispMethod(comment = "#$afterRemoving for predicates involving #$PhraseStructureRules.")
    public static final SubLObject remove_phrase_structure_rule_alt(SubLObject argument, SubLObject assertion) {
        clear_psp_rules();
        return NIL;
    }

    /**
     * #$afterRemoving for predicates involving #$PhraseStructureRules.
     */
    @LispMethod(comment = "#$afterRemoving for predicates involving #$PhraseStructureRules.")
    public static SubLObject remove_phrase_structure_rule(final SubLObject argument, final SubLObject assertion) {
        clear_psp_rules();
        return NIL;
    }

    /**
     * Initialize the internal store of phrase-structure rules using assertions
     * visible from MT.
     */
    @LispMethod(comment = "Initialize the internal store of phrase-structure rules using assertions\r\nvisible from MT.\nInitialize the internal store of phrase-structure rules using assertions\nvisible from MT.")
    public static final SubLObject initialize_psp_rules_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_vars.$psp_rule_lookup_mt$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            clear_psp_rules();
            {
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject local_state = state;
                            {
                                SubLObject _prev_bind_0_1 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    {
                                        SubLObject original_memoization_process = NIL;
                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                            {
                                                SubLObject current_proc = current_process();
                                                if (NIL == original_memoization_process) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                } else {
                                                    if (original_memoization_process != current_proc) {
                                                        Errors.error($str_alt36$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            {
                                                SubLObject node_var = $$PhraseStructureRule;
                                                {
                                                    SubLObject _prev_bind_0_2 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_3 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                        {
                                                            SubLObject node_var_4 = node_var;
                                                            SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                                            SubLObject recur_deck = deck.create_deck(deck_type);
                                                            {
                                                                SubLObject _prev_bind_0_5 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                    {
                                                                        SubLObject tv_var = NIL;
                                                                        {
                                                                            SubLObject _prev_bind_0_6 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                                if (NIL != tv_var) {
                                                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                            {
                                                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                                if (pcase_var.eql($ERROR)) {
                                                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                } else {
                                                                                                    if (pcase_var.eql($CERROR)) {
                                                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    } else {
                                                                                                        if (pcase_var.eql($WARN)) {
                                                                                                            Errors.warn($str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                        } else {
                                                                                                            Errors.warn($str_alt49$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                                            Errors.cerror($$$continue_anyway, $str_alt44$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                {
                                                                                    SubLObject _prev_bind_0_8 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_9 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_2_10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_2_13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var_4, UNPROVIDED);
                                                                                                    while (NIL != node_var_4) {
                                                                                                        {
                                                                                                            SubLObject tt_node_var = node_var_4;
                                                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                                                            SubLObject module_var = NIL;
                                                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_14 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                                    SubLObject _prev_bind_1_15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                                        {
                                                                                                                            SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                                {
                                                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                    if (NIL != d_link) {
                                                                                                                                        {
                                                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                            if (NIL != mt_links) {
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject mt_16 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_16)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_17 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_16, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject iteration_state_18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_18)) {
                                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_18);
                                                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                                        {
                                                                                                                                                                                            SubLObject _prev_bind_0_19 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                            try {
                                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                                {
                                                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                                    SubLObject cdolist_list_var_20 = new_list;
                                                                                                                                                                                                    SubLObject rule_fort = NIL;
                                                                                                                                                                                                    for (rule_fort = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest() , rule_fort = cdolist_list_var_20.first()) {
                                                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                                                            if (NIL != forts.fort_p(rule_fort)) {
                                                                                                                                                                                                                store_one_psp_rule_fort(rule_fort);
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            } finally {
                                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_19, thread);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    iteration_state_18 = dictionary_contents.do_dictionary_contents_next(iteration_state_18);
                                                                                                                                                                                }
                                                                                                                                                                            } 
                                                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_18);
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_17, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt50$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                                                                                    {
                                                                                                                                        SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                                                                                        SubLObject instance_tuple = NIL;
                                                                                                                                        for (instance_tuple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , instance_tuple = csome_list_var.first()) {
                                                                                                                                            {
                                                                                                                                                SubLObject datum = instance_tuple;
                                                                                                                                                SubLObject current = datum;
                                                                                                                                                SubLObject link_node = NIL;
                                                                                                                                                SubLObject mt_21 = NIL;
                                                                                                                                                SubLObject tv = NIL;
                                                                                                                                                destructuring_bind_must_consp(current, datum, $list_alt51);
                                                                                                                                                link_node = current.first();
                                                                                                                                                current = current.rest();
                                                                                                                                                destructuring_bind_must_consp(current, datum, $list_alt51);
                                                                                                                                                mt_21 = current.first();
                                                                                                                                                current = current.rest();
                                                                                                                                                destructuring_bind_must_consp(current, datum, $list_alt51);
                                                                                                                                                tv = current.first();
                                                                                                                                                current = current.rest();
                                                                                                                                                if (NIL == current) {
                                                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_21)) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject _prev_bind_0_22 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                            try {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_21, thread);
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_23 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject link_nodes = list(link_node);
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_24 = new_list;
                                                                                                                                                                                SubLObject rule_fort = NIL;
                                                                                                                                                                                for (rule_fort = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest() , rule_fort = cdolist_list_var_24.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                                        if (NIL != forts.fort_p(rule_fort)) {
                                                                                                                                                                                            store_one_psp_rule_fort(rule_fort);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_23, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } finally {
                                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_22, thread);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    cdestructuring_bind_error(datum, $list_alt51);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                                    {
                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                        SubLObject cdolist_list_var_25 = new_list;
                                                                                                                                        SubLObject generating_fn = NIL;
                                                                                                                                        for (generating_fn = cdolist_list_var_25.first(); NIL != cdolist_list_var_25; cdolist_list_var_25 = cdolist_list_var_25.rest() , generating_fn = cdolist_list_var_25.first()) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_26 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                                        SubLObject new_list_27 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                        SubLObject cdolist_list_var_28 = new_list_27;
                                                                                                                                                        SubLObject rule_fort = NIL;
                                                                                                                                                        for (rule_fort = cdolist_list_var_28.first(); NIL != cdolist_list_var_28; cdolist_list_var_28 = cdolist_list_var_28.rest() , rule_fort = cdolist_list_var_28.first()) {
                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                if (NIL != forts.fort_p(rule_fort)) {
                                                                                                                                                                    store_one_psp_rule_fort(rule_fort);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_26, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_15, thread);
                                                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_14, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        {
                                                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                                                            SubLObject module_var = NIL;
                                                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_29 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                                    SubLObject _prev_bind_1_30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                                        {
                                                                                                                            SubLObject node = function_terms.naut_to_nart(node_var_4);
                                                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                                {
                                                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                    if (NIL != d_link) {
                                                                                                                                        {
                                                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                            if (NIL != mt_links) {
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject mt_31 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_31)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_32 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_31, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject iteration_state_33 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_33)) {
                                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_33);
                                                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                                        {
                                                                                                                                                                                            SubLObject _prev_bind_0_34 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                            try {
                                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                                {
                                                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                                    SubLObject cdolist_list_var_35 = new_list;
                                                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_35.first(); NIL != cdolist_list_var_35; cdolist_list_var_35 = cdolist_list_var_35.rest() , node_vars_link_node = cdolist_list_var_35.first()) {
                                                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            } finally {
                                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_34, thread);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    iteration_state_33 = dictionary_contents.do_dictionary_contents_next(iteration_state_33);
                                                                                                                                                                                }
                                                                                                                                                                            } 
                                                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_33);
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_32, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt50$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                                    {
                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                        SubLObject cdolist_list_var_36 = new_list;
                                                                                                                                        SubLObject generating_fn = NIL;
                                                                                                                                        for (generating_fn = cdolist_list_var_36.first(); NIL != cdolist_list_var_36; cdolist_list_var_36 = cdolist_list_var_36.rest() , generating_fn = cdolist_list_var_36.first()) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_37 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                                        SubLObject new_list_38 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                        SubLObject cdolist_list_var_39 = new_list_38;
                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_39.first(); NIL != cdolist_list_var_39; cdolist_list_var_39 = cdolist_list_var_39.rest() , node_vars_link_node = cdolist_list_var_39.first()) {
                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_37, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_30, thread);
                                                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_29, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        node_var_4 = deck.deck_pop(recur_deck);
                                                                                                    } 
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_13, thread);
                                                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_12, thread);
                                                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_11, thread);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt52$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_10, thread);
                                                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_9, thread);
                                                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_8, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_7, thread);
                                                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_6, thread);
                                                                            }
                                                                        }
                                                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                    }
                                                                } finally {
                                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_5, thread);
                                                                }
                                                            }
                                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                        }
                                                    } finally {
                                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_3, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_2, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_40 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_40, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return $psp_rules$.getDynamicValue(thread);
        }
    }

    /**
     * Initialize the internal store of phrase-structure rules using assertions
     * visible from MT.
     */
    @LispMethod(comment = "Initialize the internal store of phrase-structure rules using assertions\r\nvisible from MT.\nInitialize the internal store of phrase-structure rules using assertions\nvisible from MT.")
    public static SubLObject initialize_psp_rules(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_vars.$psp_rule_lookup_mt$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_psp_rules();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject node_var = $$PhraseStructureRule;
                    final SubLObject _prev_bind_0_$2 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            SubLObject node_var_$4 = node_var;
                            final SubLObject deck_type = $STACK;
                            final SubLObject recur_deck = deck.create_deck(deck_type);
                            final SubLObject _prev_bind_0_$3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject tv_var = NIL;
                                    final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                            if (pcase_var.eql($ERROR)) {
                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($CERROR)) {
                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } else
                                                    if (pcase_var.eql($WARN)) {
                                                        Errors.warn($str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                    } else {
                                                        Errors.warn($str54$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                        Errors.cerror($$$continue_anyway, $str49$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                    }


                                        }
                                        final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$6 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$4, UNPROVIDED);
                                                    while (NIL != node_var_$4) {
                                                        final SubLObject tt_node_var = node_var_$4;
                                                        SubLObject cdolist_list_var;
                                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                        SubLObject module_var = NIL;
                                                        module_var = cdolist_list_var.first();
                                                        while (NIL != cdolist_list_var) {
                                                            final SubLObject _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != d_link) {
                                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        if (NIL != mt_links) {
                                                                            SubLObject iteration_state;
                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject mt_$16 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$16)) {
                                                                                    final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$16, thread);
                                                                                        SubLObject iteration_state_$18;
                                                                                        for (iteration_state_$18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$18); iteration_state_$18 = dictionary_contents.do_dictionary_contents_next(iteration_state_$18)) {
                                                                                            thread.resetMultipleValues();
                                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$18);
                                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    final SubLObject sol = link_nodes;
                                                                                                    if (NIL != set.set_p(sol)) {
                                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                        SubLObject basis_object;
                                                                                                        SubLObject state_$20;
                                                                                                        SubLObject rule_fort;
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$20 = NIL, state_$20 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state_$20); state_$20 = set_contents.do_set_contents_update_state(state_$20)) {
                                                                                                            rule_fort = set_contents.do_set_contents_next(basis_object, state_$20);
                                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state_$20, rule_fort)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (NIL != forts.fort_p(rule_fort)) {
                                                                                                                    store_one_psp_rule_fort(rule_fort);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else
                                                                                                        if (sol.isList()) {
                                                                                                            SubLObject csome_list_var = sol;
                                                                                                            SubLObject rule_fort2 = NIL;
                                                                                                            rule_fort2 = csome_list_var.first();
                                                                                                            while (NIL != csome_list_var) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                    if (NIL != forts.fort_p(rule_fort2)) {
                                                                                                                        store_one_psp_rule_fort(rule_fort2);
                                                                                                                    }
                                                                                                                }
                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                rule_fort2 = csome_list_var.first();
                                                                                                            } 
                                                                                                        } else {
                                                                                                            Errors.error($str55$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                        }

                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$9, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$18);
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$8, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str56$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                    if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                        SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                        SubLObject instance_tuple = NIL;
                                                                        instance_tuple = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            SubLObject current;
                                                                            final SubLObject datum = current = instance_tuple;
                                                                            SubLObject link_node = NIL;
                                                                            SubLObject mt_$17 = NIL;
                                                                            SubLObject tv2 = NIL;
                                                                            destructuring_bind_must_consp(current, datum, $list57);
                                                                            link_node = current.first();
                                                                            current = current.rest();
                                                                            destructuring_bind_must_consp(current, datum, $list57);
                                                                            mt_$17 = current.first();
                                                                            current = current.rest();
                                                                            destructuring_bind_must_consp(current, datum, $list57);
                                                                            tv2 = current.first();
                                                                            current = current.rest();
                                                                            if (NIL == current) {
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$17)) {
                                                                                    final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$17, thread);
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol;
                                                                                                final SubLObject link_nodes2 = sol = list(link_node);
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject rule_fort;
                                                                                                    SubLObject state_$21;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$21 = NIL, state_$21 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state_$21); state_$21 = set_contents.do_set_contents_update_state(state_$21)) {
                                                                                                        rule_fort = set_contents.do_set_contents_next(basis_object, state_$21);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state_$21, rule_fort)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(rule_fort)) {
                                                                                                                store_one_psp_rule_fort(rule_fort);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        SubLObject csome_list_var_$25 = sol;
                                                                                                        SubLObject rule_fort2 = NIL;
                                                                                                        rule_fort2 = csome_list_var_$25.first();
                                                                                                        while (NIL != csome_list_var_$25) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (NIL != forts.fort_p(rule_fort2)) {
                                                                                                                    store_one_psp_rule_fort(rule_fort2);
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var_$25 = csome_list_var_$25.rest();
                                                                                                            rule_fort2 = csome_list_var_$25.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str55$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$11, thread);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$10, thread);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                cdestructuring_bind_error(datum, $list57);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            instance_tuple = csome_list_var2.first();
                                                                        } 
                                                                    }
                                                                } else
                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                        SubLObject cdolist_list_var_$26;
                                                                        final SubLObject new_list = cdolist_list_var_$26 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        SubLObject generating_fn = NIL;
                                                                        generating_fn = cdolist_list_var_$26.first();
                                                                        while (NIL != cdolist_list_var_$26) {
                                                                            final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                final SubLObject sol2;
                                                                                final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                                if (NIL != set.set_p(sol2)) {
                                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                    SubLObject basis_object2;
                                                                                    SubLObject state_$22;
                                                                                    SubLObject rule_fort3;
                                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state_$22 = NIL, state_$22 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state_$22); state_$22 = set_contents.do_set_contents_update_state(state_$22)) {
                                                                                        rule_fort3 = set_contents.do_set_contents_next(basis_object2, state_$22);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state_$22, rule_fort3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                            if (NIL != forts.fort_p(rule_fort3)) {
                                                                                                store_one_psp_rule_fort(rule_fort3);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol2.isList()) {
                                                                                        SubLObject csome_list_var3 = sol2;
                                                                                        SubLObject rule_fort4 = NIL;
                                                                                        rule_fort4 = csome_list_var3.first();
                                                                                        while (NIL != csome_list_var3) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(rule_fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(rule_fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (NIL != forts.fort_p(rule_fort4)) {
                                                                                                    store_one_psp_rule_fort(rule_fort4);
                                                                                                }
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            rule_fort4 = csome_list_var3.first();
                                                                                        } 
                                                                                    } else {
                                                                                        Errors.error($str55$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$12, thread);
                                                                            }
                                                                            cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                                                                            generating_fn = cdolist_list_var_$26.first();
                                                                        } 
                                                                    }

                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$7, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$7, thread);
                                                            }
                                                            cdolist_list_var = cdolist_list_var.rest();
                                                            module_var = cdolist_list_var.first();
                                                        } 
                                                        SubLObject cdolist_list_var2;
                                                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                        SubLObject module_var2 = NIL;
                                                        module_var2 = cdolist_list_var2.first();
                                                        while (NIL != cdolist_list_var2) {
                                                            final SubLObject _prev_bind_0_$13 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                final SubLObject node2 = function_terms.naut_to_nart(node_var_$4);
                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                    final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != d_link2) {
                                                                        final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        if (NIL != mt_links2) {
                                                                            SubLObject iteration_state2;
                                                                            for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject mt_$18 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                                final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$18)) {
                                                                                    final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$18, thread);
                                                                                        SubLObject iteration_state_$19;
                                                                                        for (iteration_state_$19 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$19); iteration_state_$19 = dictionary_contents.do_dictionary_contents_next(iteration_state_$19)) {
                                                                                            thread.resetMultipleValues();
                                                                                            final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$19);
                                                                                            final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                                final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                    final SubLObject sol3 = link_nodes4;
                                                                                                    if (NIL != set.set_p(sol3)) {
                                                                                                        final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                        SubLObject basis_object3;
                                                                                                        SubLObject state_$23;
                                                                                                        SubLObject node_vars_link_node;
                                                                                                        for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state_$23 = NIL, state_$23 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state_$23); state_$23 = set_contents.do_set_contents_update_state(state_$23)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state_$23);
                                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state_$23, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    } else
                                                                                                        if (sol3.isList()) {
                                                                                                            SubLObject csome_list_var4 = sol3;
                                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                            while (NIL != csome_list_var4) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                }
                                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                            } 
                                                                                                        } else {
                                                                                                            Errors.error($str55$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                        }

                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$15, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$19);
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$14, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str56$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } else
                                                                    if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                        SubLObject cdolist_list_var_$27;
                                                                        final SubLObject new_list2 = cdolist_list_var_$27 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        SubLObject generating_fn2 = NIL;
                                                                        generating_fn2 = cdolist_list_var_$27.first();
                                                                        while (NIL != cdolist_list_var_$27) {
                                                                            final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                                final SubLObject sol4;
                                                                                final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                                if (NIL != set.set_p(sol4)) {
                                                                                    final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                                    SubLObject basis_object4;
                                                                                    SubLObject state_$24;
                                                                                    SubLObject node_vars_link_node3;
                                                                                    for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state_$24 = NIL, state_$24 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state_$24); state_$24 = set_contents.do_set_contents_update_state(state_$24)) {
                                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state_$24);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state_$24, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol4.isList()) {
                                                                                        SubLObject csome_list_var5 = sol4;
                                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                        while (NIL != csome_list_var5) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                            }
                                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                                        } 
                                                                                    } else {
                                                                                        Errors.error($str55$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$16, thread);
                                                                            }
                                                                            cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                                                                            generating_fn2 = cdolist_list_var_$27.first();
                                                                        } 
                                                                    }

                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$8, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$13, thread);
                                                            }
                                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                                            module_var2 = cdolist_list_var2.first();
                                                        } 
                                                        node_var_$4 = deck.deck_pop(recur_deck);
                                                    } 
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$11, thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$6, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$6, thread);
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str58$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$10, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$5, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    } finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$4, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$4, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$3, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$3, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return $psp_rules$.getDynamicValue(thread);
    }

    public static final SubLObject psp_check_initializations_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == set.non_empty_set_p($psp_rules$.getDynamicValue(thread))) {
                initialize_psp_rules(UNPROVIDED);
            }
            return $INITIALIZED;
        }
    }

    public static SubLObject psp_check_initializations() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == set.non_empty_set_p($psp_rules$.getDynamicValue(thread))) {
            initialize_psp_rules(UNPROVIDED);
        }
        return $INITIALIZED;
    }

    /**
     * Store contents of RULE-FORT for use in parsing.
     */
    @LispMethod(comment = "Store contents of RULE-FORT for use in parsing.")
    public static final SubLObject store_one_psp_rule_fort_alt(SubLObject rule_fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject v_arity = kb_mapping_utilities.fpred_value(rule_fort, $$psRuleArity, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject category = kb_mapping_utilities.fpred_value(rule_fort, $$psRuleCategory, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject head = kb_mapping_utilities.fpred_value(rule_fort, $$psRuleSyntacticHeadDtr, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject weight = psp_rule_fort_weight_factor(rule_fort, v_arity);
                            SubLObject raw_constraints = kb_mapping_utilities.pred_values(rule_fort, $$psRuleConstraint, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject constraints = psp_new_constraints();
                            SubLObject semx = psp_get_semx_for_rule_fort(rule_fort);
                            if (NIL == category) {
                                Errors.warn($str_alt58$_S_has_no_category___, rule_fort);
                            }
                            if (NIL == head) {
                                Errors.warn($str_alt59$_S_has_no_syntactic_head___, rule_fort);
                            }
                            if (NIL != raw_constraints) {
                                {
                                    SubLObject cdolist_list_var = raw_constraints;
                                    SubLObject constraint = NIL;
                                    for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                        if (NIL != psp_valid_raw_constraintP(constraint)) {
                                            {
                                                SubLObject datum = psp_parse_constraint(constraint);
                                                SubLObject current = datum;
                                                SubLObject c_type = NIL;
                                                SubLObject dtr = NIL;
                                                SubLObject target = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt60);
                                                c_type = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt60);
                                                dtr = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt60);
                                                target = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    dictionary_utilities.dictionary_push(constraints, dtr, psp_new_constraint(c_type, target));
                                                    if (NIL != psp_frame_specific_raw_constraintP(constraint)) {
                                                        dictionary_utilities.dictionary_push(constraints, dtr, psp_frame_constraint_from_raw_constraint(constraint));
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt60);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                Errors.warn($str_alt61$Rule__S_has_no_constraints_, rule_fort);
                            }
                            if (((NIL != category) && (NIL != head)) && (NIL != raw_constraints)) {
                                {
                                    SubLObject new_rule = add_psp_rule(rule_fort, v_arity, category, head, constraints, semx, weight);
                                    psp_add_derivable_rules(new_rule);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return $STORED;
        }
    }

    /**
     * Store contents of RULE-FORT for use in parsing.
     */
    @LispMethod(comment = "Store contents of RULE-FORT for use in parsing.")
    public static SubLObject store_one_psp_rule_fort(final SubLObject rule_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject v_arity = kb_mapping_utilities.fpred_value(rule_fort, $$psRuleArity, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject category = kb_mapping_utilities.fpred_value(rule_fort, $$psRuleCategory, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject head = kb_mapping_utilities.fpred_value(rule_fort, $$psRuleSyntacticHeadDtr, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject weight = psp_rule_fort_weight_factor(rule_fort, v_arity);
            final SubLObject raw_constraints = kb_mapping_utilities.pred_values(rule_fort, $$psRuleConstraint, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject constraints = psp_new_constraints();
            final SubLObject semx = psp_get_semx_for_rule_fort(rule_fort);
            if (NIL == category) {
            }
            if (NIL == head) {
            }
            if (NIL != raw_constraints) {
                SubLObject cdolist_list_var = raw_constraints;
                SubLObject constraint = NIL;
                constraint = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != psp_valid_raw_constraintP(constraint)) {
                        SubLObject current;
                        final SubLObject datum = current = psp_parse_constraint(constraint);
                        SubLObject c_type = NIL;
                        SubLObject dtr = NIL;
                        SubLObject target = NIL;
                        destructuring_bind_must_consp(current, datum, $list64);
                        c_type = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list64);
                        dtr = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list64);
                        target = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            dictionary_utilities.dictionary_push(constraints, dtr, psp_new_constraint(c_type, target));
                            if (NIL != psp_frame_specific_raw_constraintP(constraint)) {
                                dictionary_utilities.dictionary_push(constraints, dtr, psp_frame_constraint_from_raw_constraint(constraint));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list64);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    constraint = cdolist_list_var.first();
                } 
            }
            if (((NIL != category) && (NIL != head)) && (NIL != raw_constraints)) {
                final SubLObject new_rule = add_psp_rule(rule_fort, v_arity, category, head, constraints, semx, weight);
                psp_add_derivable_rules(new_rule);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return $STORED;
    }

    public static final SubLObject psp_valid_raw_constraintP_alt(SubLObject constraint) {
        return makeBoolean((NIL != nart_handles.valid_nartP(constraint, UNPROVIDED)) && (NIL != formula_arityE(narts_high.nart_hl_formula(constraint), TWO_INTEGER, UNPROVIDED)));
    }

    public static SubLObject psp_valid_raw_constraintP(final SubLObject constraint) {
        return makeBoolean((NIL != nart_handles.valid_nartP(constraint, UNPROVIDED)) && (NIL != formula_arityE(narts_high.nart_hl_formula(constraint), TWO_INTEGER, UNPROVIDED)));
    }

    /**
     *
     *
     * @param RULE-FORT;
     * 		FORT-P a #$PhraseStructureRule.
     * @return LISTP; (<semx-type-keyword> <semantic-head-dtr-num> . <binding-expressions>).
     */
    @LispMethod(comment = "@param RULE-FORT;\r\n\t\tFORT-P a #$PhraseStructureRule.\r\n@return LISTP; (<semx-type-keyword> <semantic-head-dtr-num> . <binding-expressions>).")
    public static final SubLObject psp_get_semx_for_rule_fort_alt(SubLObject rule_fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject type = NIL;
                SubLObject head_dtr_num = NIL;
                SubLObject binding_expressions = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject identity_arg = kb_mapping_utilities.fpred_value(rule_fort, $$psRuleSemanticsFromDtr, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != identity_arg) {
                                type = $IDENTITY;
                                head_dtr_num = identity_arg;
                            } else {
                                binding_expressions = psp_binding_expressions_for_rule_fort(rule_fort);
                                type = $TEMPLATE;
                                head_dtr_num = kb_mapping_utilities.fpred_value(rule_fort, $$psRuleTemplateDtr, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return listS(type, head_dtr_num, binding_expressions);
            }
        }
    }

    /**
     *
     *
     * @param RULE-FORT;
     * 		FORT-P a #$PhraseStructureRule.
     * @return LISTP; (<semx-type-keyword> <semantic-head-dtr-num> . <binding-expressions>).
     */
    @LispMethod(comment = "@param RULE-FORT;\r\n\t\tFORT-P a #$PhraseStructureRule.\r\n@return LISTP; (<semx-type-keyword> <semantic-head-dtr-num> . <binding-expressions>).")
    public static SubLObject psp_get_semx_for_rule_fort(final SubLObject rule_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject type = NIL;
        SubLObject head_dtr_num = NIL;
        SubLObject binding_expressions = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject identity_arg = kb_mapping_utilities.fpred_value(rule_fort, $$psRuleSemanticsFromDtr, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != identity_arg) {
                type = $IDENTITY;
                head_dtr_num = identity_arg;
            } else {
                binding_expressions = psp_binding_expressions_for_rule_fort(rule_fort);
                type = $TEMPLATE;
                head_dtr_num = kb_mapping_utilities.fpred_value(rule_fort, $$psRuleTemplateDtr, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return listS(type, head_dtr_num, binding_expressions);
    }

    /**
     *
     *
     * @return LISTP; of (<type> <dtr-num> <keyword>) binding expressions.
     */
    @LispMethod(comment = "@return LISTP; of (<type> <dtr-num> <keyword>) binding expressions.")
    public static final SubLObject psp_binding_expressions_for_rule_fort_alt(SubLObject rule_fort) {
        {
            SubLObject binding_expressions = NIL;
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(rule_fort, $$psRuleTemplateBindings, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject nat = NIL;
            for (nat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nat = cdolist_list_var.first()) {
                binding_expressions = cons(subst($INSTANCE, $$PSBindingFn, subst($TYPE, $$PSBindingFn_TypeLevel, nat, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), binding_expressions);
            }
            return binding_expressions;
        }
    }

    /**
     *
     *
     * @return LISTP; of (<type> <dtr-num> <keyword>) binding expressions.
     */
    @LispMethod(comment = "@return LISTP; of (<type> <dtr-num> <keyword>) binding expressions.")
    public static SubLObject psp_binding_expressions_for_rule_fort(final SubLObject rule_fort) {
        SubLObject binding_expressions = NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(rule_fort, $$psRuleTemplateBindings, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject nat = NIL;
        nat = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            binding_expressions = cons(subst($INSTANCE, $$PSBindingFn, subst($TYPE, $$PSBindingFn_TypeLevel, nat, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), binding_expressions);
            cdolist_list_var = cdolist_list_var.rest();
            nat = cdolist_list_var.first();
        } 
        return binding_expressions;
    }

    /**
     *
     *
     * @return PSP-WEIGHT-P associated with RULE-FORT.
     */
    @LispMethod(comment = "@return PSP-WEIGHT-P associated with RULE-FORT.")
    public static final SubLObject psp_rule_fort_weight_factor_alt(SubLObject rule_fort, SubLObject v_arity) {
        if (v_arity == UNPROVIDED) {
            v_arity = NIL;
        }
        {
            SubLObject explicit_weight_factor = psp_explicit_weight_factor_for_rule_fort(rule_fort);
            return NIL != psp_chart.psp_weight_p(explicit_weight_factor) ? ((SubLObject) (explicit_weight_factor)) : psp_rule_weight_factor_from_arity(v_arity);
        }
    }

    /**
     *
     *
     * @return PSP-WEIGHT-P associated with RULE-FORT.
     */
    @LispMethod(comment = "@return PSP-WEIGHT-P associated with RULE-FORT.")
    public static SubLObject psp_rule_fort_weight_factor(final SubLObject rule_fort, SubLObject v_arity) {
        if (v_arity == UNPROVIDED) {
            v_arity = NIL;
        }
        final SubLObject explicit_weight_factor = psp_explicit_weight_factor_for_rule_fort(rule_fort);
        return NIL != psp_chart.psp_weight_p(explicit_weight_factor) ? explicit_weight_factor : psp_rule_weight_factor_from_arity(v_arity);
    }

    /**
     *
     *
     * @return PSP-WEIGHT-P or :NONE.
     */
    @LispMethod(comment = "@return PSP-WEIGHT-P or :NONE.")
    public static final SubLObject psp_explicit_weight_factor_for_rule_fort_alt(SubLObject rule_fort) {
        return list_utilities.alist_lookup(psp_rule_fort_weights(), rule_fort, symbol_function(EQL), $NONE);
    }

    /**
     *
     *
     * @return PSP-WEIGHT-P or :NONE.
     */
    @LispMethod(comment = "@return PSP-WEIGHT-P or :NONE.")
    public static SubLObject psp_explicit_weight_factor_for_rule_fort(final SubLObject rule_fort) {
        return list_utilities.alist_lookup(psp_rule_fort_weights(), rule_fort, symbol_function(EQL), $NONE);
    }

    /**
     *
     *
     * @return ALIST-P of rule-fort -> weight mappings.
     */
    @LispMethod(comment = "@return ALIST-P of rule-fort -> weight mappings.")
    public static final SubLObject psp_rule_fort_weights_internal_alt() {
        {
            SubLObject weight_pred = constants_high.find_constant($$$psRuleWeight);
            if (NIL != valid_constantP(weight_pred, UNPROVIDED)) {
                {
                    SubLObject raw_alist = ask_utilities.ask_template($list_alt82, bq_cons(weight_pred, $list_alt83), parsing_vars.$psp_rule_lookup_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject adjusted_alist = NIL;
                    SubLObject cdolist_list_var = raw_alist;
                    SubLObject cons = NIL;
                    for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                        {
                            SubLObject datum = cons;
                            SubLObject current = datum;
                            SubLObject rule = NIL;
                            SubLObject raw_weight = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt84);
                            rule = current.first();
                            current = current.rest();
                            raw_weight = current;
                            adjusted_alist = list_utilities.alist_enter(adjusted_alist, rule, parsing_utilities.psp_weight_from_float(raw_weight), UNPROVIDED);
                        }
                    }
                    return adjusted_alist;
                }
            } else {
                return $psp_rule_fort_weights$.getGlobalValue();
            }
        }
    }

    /**
     *
     *
     * @return ALIST-P of rule-fort -> weight mappings.
     */
    @LispMethod(comment = "@return ALIST-P of rule-fort -> weight mappings.")
    public static SubLObject psp_rule_fort_weights_internal() {
        final SubLObject weight_pred = constants_high.find_constant($$$psRuleWeight);
        if (NIL != valid_constantP(weight_pred, UNPROVIDED)) {
            final SubLObject raw_alist = ask_utilities.ask_template($list85, bq_cons(weight_pred, $list86), parsing_vars.$psp_rule_lookup_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject adjusted_alist = NIL;
            SubLObject cdolist_list_var = raw_alist;
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject rule = NIL;
                SubLObject raw_weight = NIL;
                destructuring_bind_must_consp(current, datum, $list87);
                rule = current.first();
                current = raw_weight = current.rest();
                adjusted_alist = list_utilities.alist_enter(adjusted_alist, rule, parsing_utilities.psp_weight_from_float(raw_weight), UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
            return adjusted_alist;
        }
        return $psp_rule_fort_weights$.getGlobalValue();
    }

    public static final SubLObject psp_rule_fort_weights_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_rule_fort_weights_internal();
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_RULE_FORT_WEIGHTS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_RULE_FORT_WEIGHTS, ZERO_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, PSP_RULE_FORT_WEIGHTS, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                    if (results == $kw85$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_rule_fort_weights_internal()));
                        memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject psp_rule_fort_weights() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_rule_fort_weights_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PSP_RULE_FORT_WEIGHTS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PSP_RULE_FORT_WEIGHTS, ZERO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PSP_RULE_FORT_WEIGHTS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_rule_fort_weights_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     *
     *
     * @return PSP-WEIGHT-P appropriate for a rule based on its arity.
     */
    @LispMethod(comment = "@return PSP-WEIGHT-P appropriate for a rule based on its arity.")
    public static final SubLObject psp_rule_weight_factor_from_arity_alt(SubLObject rule_arity) {
        if ((NIL != subl_promotions.positive_integer_p(rule_arity)) && rule_arity.numG(ONE_INTEGER)) {
            {
                SubLObject extra_dtr_count = number_utilities.f_1_(rule_arity);
                return psp_chart.psp_weight_compose(make_list(extra_dtr_count, $psp_rule_arity_weight$.getGlobalValue()));
            }
        } else {
            return parsing_vars.$psp_max_weight$.getGlobalValue();
        }
    }

    /**
     *
     *
     * @return PSP-WEIGHT-P appropriate for a rule based on its arity.
     */
    @LispMethod(comment = "@return PSP-WEIGHT-P appropriate for a rule based on its arity.")
    public static SubLObject psp_rule_weight_factor_from_arity(final SubLObject rule_arity) {
        if ((NIL != subl_promotions.positive_integer_p(rule_arity)) && rule_arity.numG(ONE_INTEGER)) {
            final SubLObject extra_dtr_count = number_utilities.f_1_(rule_arity);
            return psp_chart.psp_weight_compose(make_list(extra_dtr_count, $psp_rule_arity_weight$.getGlobalValue()));
        }
        return parsing_vars.$psp_max_weight$.getGlobalValue();
    }

    /**
     * Add a fully parsed and specified new rule to *PSP-RULES*.
     */
    @LispMethod(comment = "Add a fully parsed and specified new rule to *PSP-RULES*.")
    public static final SubLObject add_psp_rule_alt(SubLObject rule_fort, SubLObject v_arity, SubLObject category, SubLObject head, SubLObject constraints, SubLObject semx, SubLObject weight) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL == v_arity) || v_arity.eql(ONE_INTEGER)) && (NIL != psp_category_meets_constraintsP(category, constraints))) {
                Errors.warn($str_alt87$___S_was_skipped_because_it_would, rule_fort);
                return $INFINITE_RECURSION_RULE;
            }
            {
                SubLObject new_rule = new_psp_rule(rule_fort, v_arity, category, head, constraints, semx, weight);
                set.set_add(new_rule, $psp_rules$.getDynamicValue(thread));
                return new_rule;
            }
        }
    }

    /**
     * Add a fully parsed and specified new rule to *PSP-RULES*.
     */
    @LispMethod(comment = "Add a fully parsed and specified new rule to *PSP-RULES*.")
    public static SubLObject add_psp_rule(final SubLObject rule_fort, final SubLObject v_arity, final SubLObject category, final SubLObject head, final SubLObject constraints, final SubLObject semx, final SubLObject weight) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == v_arity) || v_arity.eql(ONE_INTEGER)) && (NIL != psp_category_meets_constraintsP(category, constraints))) {
            return $INFINITE_RECURSION_RULE;
        }
        final SubLObject new_rule = new_psp_rule(rule_fort, v_arity, category, head, constraints, semx, weight);
        set.set_add(new_rule, $psp_rules$.getDynamicValue(thread));
        return new_rule;
    }/**
     * Add a fully parsed and specified new rule to *PSP-RULES*.
     */


    public static final SubLObject psp_rule_struct_for_rule_fort_alt(SubLObject rule_fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject set_contents_var = set.do_set_internal($psp_rules$.getDynamicValue(thread));
                SubLObject basis_object = do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != ans) || (NIL != do_set_contents_doneP(basis_object, state))); state = do_set_contents_update_state(state)) {
                    {
                        SubLObject rule_struct = do_set_contents_next(basis_object, state);
                        if (NIL != do_set_contents_element_validP(state, rule_struct)) {
                            if (rule_fort.eql(psp_rule_fort(rule_struct))) {
                                ans = rule_struct;
                            }
                        }
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject psp_rule_struct_for_rule_fort(final SubLObject rule_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject set_contents_var = set.do_set_internal($psp_rules$.getDynamicValue(thread));
        SubLObject basis_object;
        SubLObject state;
        SubLObject rule_struct;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == ans) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            rule_struct = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, rule_struct)) && rule_fort.eql(psp_rule_fort(rule_struct))) {
                ans = rule_struct;
            }
        }
        return ans;
    }

    public static final SubLObject psp_category_meets_constraintsP_alt(SubLObject category, SubLObject constraints) {
        {
            SubLObject failP = NIL;
            if (NIL == failP) {
                {
                    SubLObject csome_list_var = psp_constraints_on_dtr(ONE_INTEGER, constraints);
                    SubLObject constraint = NIL;
                    for (constraint = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , constraint = csome_list_var.first()) {
                        {
                            SubLObject datum = constraint;
                            SubLObject current = datum;
                            SubLObject type = NIL;
                            SubLObject target = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt89);
                            type = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt89);
                            target = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if ((type == $$ConstituentTypeConstraintFn) && (NIL == psp_constraint_target_includesP(target, category, UNPROVIDED))) {
                                    failP = T;
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt89);
                            }
                        }
                    }
                }
            }
            return makeBoolean(NIL == failP);
        }
    }

    public static SubLObject psp_category_meets_constraintsP(final SubLObject category, final SubLObject constraints) {
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = psp_constraints_on_dtr(ONE_INTEGER, constraints);
            SubLObject constraint = NIL;
            constraint = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = constraint;
                SubLObject type = NIL;
                SubLObject target = NIL;
                destructuring_bind_must_consp(current, datum, $list90);
                type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list90);
                target = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (type.eql($$ConstituentTypeConstraintFn) && (NIL == psp_constraint_target_includesP(target, category, UNPROVIDED))) {
                        failP = T;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list90);
                }
                csome_list_var = csome_list_var.rest();
                constraint = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == failP);
    }

    /**
     * Convert CONSTRAINT into a (<constraint-type> <dtr-num> <target>) triple.
     */
    @LispMethod(comment = "Convert CONSTRAINT into a (<constraint-type> <dtr-num> <target>) triple.")
    public static final SubLObject psp_parse_constraint_alt(SubLObject constraint) {
        {
            SubLObject datum = function_terms.nart_to_naut(constraint);
            SubLObject current = datum;
            SubLObject c_type = NIL;
            SubLObject dtr = NIL;
            SubLObject target = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt60);
            c_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt60);
            dtr = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt60);
            target = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pcase_var = c_type;
                    if (pcase_var.eql($$ConstituentTypeConstraintFn)) {
                        target = psp_sub_categories(target);
                    } else {
                        if (pcase_var.eql($$POSPredConstraintFn)) {
                            target = psp_sub_pos_preds(target, UNPROVIDED);
                        }
                    }
                }
                return list(c_type, dtr, target);
            } else {
                cdestructuring_bind_error(datum, $list_alt60);
            }
        }
        return NIL;
    }

    /**
     * Convert CONSTRAINT into a (<constraint-type> <dtr-num> <target>) triple.
     */
    @LispMethod(comment = "Convert CONSTRAINT into a (<constraint-type> <dtr-num> <target>) triple.")
    public static SubLObject psp_parse_constraint(final SubLObject constraint) {
        SubLObject current;
        final SubLObject datum = current = function_terms.nart_to_naut(constraint);
        SubLObject c_type = NIL;
        SubLObject dtr = NIL;
        SubLObject target = NIL;
        destructuring_bind_must_consp(current, datum, $list64);
        c_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        dtr = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        target = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = c_type;
            if (pcase_var.eql($$ConstituentTypeConstraintFn)) {
                target = psp_sub_categories(target);
            } else
                if (pcase_var.eql($$POSPredConstraintFn)) {
                    target = psp_sub_pos_preds(target, UNPROVIDED);
                }

            return list(c_type, dtr, target);
        }
        cdestructuring_bind_error(datum, $list64);
        return NIL;
    }/**
     * Convert CONSTRAINT into a (<constraint-type> <dtr-num> <target>) triple.
     */


    /**
     *
     *
     * @return BOOLEAN; Is CONSTRAINT a frame-specific constraint?
     */
    @LispMethod(comment = "@return BOOLEAN; Is CONSTRAINT a frame-specific constraint?")
    public static final SubLObject psp_frame_specific_raw_constraintP_alt(SubLObject constraint) {
        {
            SubLObject datum = function_terms.nart_to_naut(constraint);
            SubLObject current = datum;
            SubLObject c_type = NIL;
            SubLObject dtr = NIL;
            SubLObject target = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt60);
            c_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt60);
            dtr = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt60);
            target = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean((c_type == $$ConstituentTypeConstraintFn) && (NIL != psp_frame_specific_constituent_typeP(target)));
            } else {
                cdestructuring_bind_error(datum, $list_alt60);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEAN; Is CONSTRAINT a frame-specific constraint?
     */
    @LispMethod(comment = "@return BOOLEAN; Is CONSTRAINT a frame-specific constraint?")
    public static SubLObject psp_frame_specific_raw_constraintP(final SubLObject constraint) {
        SubLObject current;
        final SubLObject datum = current = function_terms.nart_to_naut(constraint);
        SubLObject c_type = NIL;
        SubLObject dtr = NIL;
        SubLObject target = NIL;
        destructuring_bind_must_consp(current, datum, $list64);
        c_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        dtr = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        target = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean(c_type.eql($$ConstituentTypeConstraintFn) && (NIL != psp_frame_specific_constituent_typeP(target)));
        }
        cdestructuring_bind_error(datum, $list64);
        return NIL;
    }

    public static final SubLObject psp_frame_constraint_from_raw_constraint_alt(SubLObject constraint) {
        {
            SubLObject target = cycl_utilities.nat_arg2(constraint, UNPROVIDED);
            SubLObject target_frame_type = psp_frame_type_from_constituent_type(target);
            SubLObject target_set = psp_frame_type_instances(target_frame_type, UNPROVIDED);
            return psp_new_constraint($FRAME, target_set);
        }
    }

    public static SubLObject psp_frame_constraint_from_raw_constraint(final SubLObject constraint) {
        final SubLObject target = cycl_utilities.nat_arg2(constraint, UNPROVIDED);
        final SubLObject target_frame_type = psp_frame_type_from_constituent_type(target);
        final SubLObject target_set = psp_frame_type_instances(target_frame_type, UNPROVIDED);
        return psp_new_constraint($FRAME, target_set);
    }

    /**
     * Add other rules derivable from NEW-RULE.
     */
    @LispMethod(comment = "Add other rules derivable from NEW-RULE.")
    public static final SubLObject psp_add_derivable_rules_alt(SubLObject new_rule) {
        return $STUB;
    }

    /**
     * Add other rules derivable from NEW-RULE.
     */
    @LispMethod(comment = "Add other rules derivable from NEW-RULE.")
    public static SubLObject psp_add_derivable_rules(final SubLObject new_rule) {
        return $STUB;
    }/**
     * Add other rules derivable from NEW-RULE.
     */


    public static final SubLObject psp_trace_alt(SubLObject rule_fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(rule_fort, FORT_P);
            {
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL != isa.isaP(rule_fort, $$PhraseStructureRule, UNPROVIDED, UNPROVIDED)) {
                            {
                                SubLObject item_var = rule_fort;
                                if (NIL == member(item_var, $psp_traced_rules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                                    $psp_traced_rules$.setGlobalValue(cons(item_var, $psp_traced_rules$.getGlobalValue()));
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return $psp_traced_rules$.getGlobalValue();
        }
    }

    public static SubLObject psp_trace(final SubLObject rule_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(rule_fort) : "! forts.fort_p(rule_fort) " + ("forts.fort_p(rule_fort) " + "CommonSymbols.NIL != forts.fort_p(rule_fort) ") + rule_fort;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL != isa.isaP(rule_fort, $$PhraseStructureRule, UNPROVIDED, UNPROVIDED)) && (NIL == member(rule_fort, $psp_traced_rules$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY)))) {
                $psp_traced_rules$.setGlobalValue(cons(rule_fort, $psp_traced_rules$.getGlobalValue()));
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return $psp_traced_rules$.getGlobalValue();
    }

    public static final SubLObject psp_untrace_alt(SubLObject rule_fort) {
        if (rule_fort == UNPROVIDED) {
            rule_fort = NIL;
        }
        $psp_traced_rules$.setGlobalValue(NIL != rule_fort ? ((SubLObject) (remove(rule_fort, $psp_traced_rules$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL);
        return $psp_traced_rules$.getGlobalValue();
    }

    public static SubLObject psp_untrace(SubLObject rule_fort) {
        if (rule_fort == UNPROVIDED) {
            rule_fort = NIL;
        }
        $psp_traced_rules$.setGlobalValue(NIL != rule_fort ? remove(rule_fort, $psp_traced_rules$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL);
        return $psp_traced_rules$.getGlobalValue();
    }

    public static final SubLObject psp_traced_ruleP_alt(SubLObject rule_fort) {
        return subl_promotions.memberP(rule_fort, $psp_traced_rules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject psp_traced_ruleP(final SubLObject rule_fort) {
        return subl_promotions.memberP(rule_fort, $psp_traced_rules$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Report tracing info for RULE-FORT, if it is traced.
     */
    @LispMethod(comment = "Report tracing info for RULE-FORT, if it is traced.")
    public static final SubLObject psp_trace_report_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject rule_fort = NIL;
            SubLObject format_str = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            rule_fort = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            format_str = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(PWHEN, list($sym98$PSP_TRACED_RULE_, rule_fort), listS(DO_PSP_TRACE_REPORT, format_str, append(args, NIL)));
            }
        }
    }

    /**
     * Report tracing info for RULE-FORT, if it is traced.
     */
    @LispMethod(comment = "Report tracing info for RULE-FORT, if it is traced.")
    public static SubLObject psp_trace_report(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject rule_fort = NIL;
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, $list97);
        rule_fort = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list97);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        return list(PWHEN, list($sym99$PSP_TRACED_RULE_, rule_fort), listS(DO_PSP_TRACE_REPORT, format_str, append(args, NIL)));
    }/**
     * Report tracing info for RULE-FORT, if it is traced.
     */


    /**
     * Print out a tracing report, without doing any checks first.
     */
    @LispMethod(comment = "Print out a tracing report, without doing any checks first.")
    public static final SubLObject do_psp_trace_report_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject format_str = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt100);
            format_str = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return listS(FORMAT, T, format_str, append(args, NIL));
            }
        }
    }

    /**
     * Print out a tracing report, without doing any checks first.
     */
    @LispMethod(comment = "Print out a tracing report, without doing any checks first.")
    public static SubLObject do_psp_trace_report(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, $list101);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(FORMAT, T, format_str, append(args, NIL));
    }/**
     * Print out a tracing report, without doing any checks first.
     */


    /**
     *
     *
     * @return LISTP of PS-RULE structs licensing phrases of category ROOT-CATEGORY (if non-nil)
    and starting with EDGE.
     */
    @LispMethod(comment = "@return LISTP of PS-RULE structs licensing phrases of category ROOT-CATEGORY (if non-nil)\r\nand starting with EDGE.")
    public static final SubLObject psp_rules_starting_with_edge_alt(SubLObject edge, SubLObject root_category) {
        if (root_category == UNPROVIDED) {
            root_category = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rules = NIL;
                SubLObject edge_left_index = interval_span.interval_span_start(psp_chart.get_psp_edge_span(edge));
                SubLObject set_contents_var = set.do_set_internal($psp_rules$.getDynamicValue(thread));
                SubLObject basis_object = do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                    {
                        SubLObject rule = do_set_contents_next(basis_object, state);
                        if (NIL != do_set_contents_element_validP(state, rule)) {
                            {
                                SubLObject dtr1_constraints = psp_constraints_on_dtr(ONE_INTEGER, psp_rule_constraints(rule));
                                if (((NIL != psp_rule_could_start_at_indexP(rule, edge_left_index)) && ((NIL == root_category) || (NIL != psp_valid_constituent_typeP(psp_rule_category(rule), root_category)))) && (NIL != psp_edge_meets_syntax_constraintsP(edge, dtr1_constraints, UNPROVIDED, UNPROVIDED))) {
                                    rules = cons(rule, rules);
                                    if (NIL != psp_traced_ruleP(psp_rule_fort(rule))) {
                                        format(T, $str_alt102$___S___meets_the_first_dtr_constr, new SubLObject[]{ edge, psp_rule_fort(rule), psp_chart.get_psp_edge_frame(edge) });
                                    }
                                }
                            }
                        }
                    }
                }
                return rules;
            }
        }
    }

    /**
     *
     *
     * @return LISTP of PS-RULE structs licensing phrases of category ROOT-CATEGORY (if non-nil)
    and starting with EDGE.
     */
    @LispMethod(comment = "@return LISTP of PS-RULE structs licensing phrases of category ROOT-CATEGORY (if non-nil)\r\nand starting with EDGE.")
    public static SubLObject psp_rules_starting_with_edge(final SubLObject edge, SubLObject root_category) {
        if (root_category == UNPROVIDED) {
            root_category = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rules = NIL;
        final SubLObject edge_left_index = interval_span.interval_span_start(psp_chart.get_psp_edge_span(edge));
        final SubLObject set_contents_var = set.do_set_internal($psp_rules$.getDynamicValue(thread));
        SubLObject basis_object;
        SubLObject state;
        SubLObject rule;
        SubLObject dtr1_constraints;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            rule = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, rule)) {
                dtr1_constraints = psp_constraints_on_dtr(ONE_INTEGER, psp_rule_constraints(rule));
                if (((NIL != psp_rule_could_start_at_indexP(rule, edge_left_index)) && ((NIL == root_category) || (NIL != psp_valid_constituent_typeP(psp_rule_category(rule), root_category)))) && (NIL != psp_edge_meets_syntax_constraintsP(edge, dtr1_constraints, UNPROVIDED, UNPROVIDED))) {
                    rules = cons(rule, rules);
                    if (NIL != psp_traced_ruleP(psp_rule_fort(rule))) {
                        format(T, $str103$___S___meets_the_first_dtr_constr, new SubLObject[]{ edge, psp_rule_fort(rule), psp_chart.get_psp_edge_frame(edge) });
                    }
                }
            }
        }
        return rules;
    }

    /**
     *
     *
     * @return BOOLEAN; Could a new edge formed with RULE start at INDEX?
     */
    @LispMethod(comment = "@return BOOLEAN; Could a new edge formed with RULE start at INDEX?")
    public static final SubLObject psp_rule_could_start_at_indexP_alt(SubLObject rule, SubLObject index) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject chart_end_index = (NIL != parsing_vars.$psp_chart_end_index$.getDynamicValue(thread)) ? ((SubLObject) (parsing_vars.$psp_chart_end_index$.getDynamicValue(thread))) : psp_chart.psp_chart_length(parsing_vars.$psp_chart$.getDynamicValue(thread));
                SubLObject known_arity = psp_rule_arity(rule);
                SubLObject rule_min_arity = (NIL != known_arity) ? ((SubLObject) (known_arity)) : ONE_INTEGER;
                SubLObject minimal_end_index = add(index, rule_min_arity);
                if (NIL != psp_chart.psp_gap_allowedP()) {
                    minimal_end_index = subtract(minimal_end_index, ONE_INTEGER);
                }
                return numGE(chart_end_index, minimal_end_index);
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Could a new edge formed with RULE start at INDEX?
     */
    @LispMethod(comment = "@return BOOLEAN; Could a new edge formed with RULE start at INDEX?")
    public static SubLObject psp_rule_could_start_at_indexP(final SubLObject rule, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject chart_end_index = (NIL != parsing_vars.$psp_chart_end_index$.getDynamicValue(thread)) ? parsing_vars.$psp_chart_end_index$.getDynamicValue(thread) : psp_chart.psp_chart_length(parsing_vars.$psp_chart$.getDynamicValue(thread));
        final SubLObject known_arity = psp_rule_arity(rule);
        final SubLObject rule_min_arity = (NIL != known_arity) ? known_arity : ONE_INTEGER;
        SubLObject minimal_end_index = add(index, rule_min_arity);
        if (NIL != psp_chart.psp_gap_allowedP()) {
            minimal_end_index = subtract(minimal_end_index, ONE_INTEGER);
        }
        return numGE(chart_end_index, minimal_end_index);
    }

    /**
     *
     *
     * @return LISTP of DTR-CYCLS that meet the semantic constraints for
    daughter DTR-NUM of RULE.
     */
    @LispMethod(comment = "@return LISTP of DTR-CYCLS that meet the semantic constraints for\r\ndaughter DTR-NUM of RULE.")
    public static final SubLObject psp_filter_cycls_alt(SubLObject dtr_cycls, SubLObject dtr_num, SubLObject rule, SubLObject edge) {
        {
            SubLObject filtered_cycls = NIL;
            SubLObject constraint_table = psp_rule_constraints(rule);
            SubLObject constraints = list_utilities.remove_if_not($sym103$PSP_SEMANTIC_CONSTRAINT_, psp_constraints_on_dtr(dtr_num, constraint_table), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = dtr_cycls;
            SubLObject cycl = NIL;
            for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                {
                    SubLObject failP = NIL;
                    if (NIL == failP) {
                        {
                            SubLObject csome_list_var = constraints;
                            SubLObject constraint = NIL;
                            for (constraint = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , constraint = csome_list_var.first()) {
                                constraint = psp_cyclify_targets(constraint, edge);
                                failP = psp_cycl_fails_constraintP(cycl, constraint);
                                if (NIL != psp_traced_ruleP(psp_chart.psp_edge_rule_fort(edge))) {
                                    format(T, $str_alt104$___S____A_constraint__S___, new SubLObject[]{ cycl, NIL != failP ? ((SubLObject) ($$$failed)) : $$$met, constraint });
                                }
                            }
                        }
                    }
                    if (NIL == failP) {
                        filtered_cycls = cons(cycl, filtered_cycls);
                    }
                }
            }
            return filtered_cycls;
        }
    }

    /**
     *
     *
     * @return LISTP of DTR-CYCLS that meet the semantic constraints for
    daughter DTR-NUM of RULE.
     */
    @LispMethod(comment = "@return LISTP of DTR-CYCLS that meet the semantic constraints for\r\ndaughter DTR-NUM of RULE.")
    public static SubLObject psp_filter_cycls(final SubLObject dtr_cycls, final SubLObject dtr_num, final SubLObject rule, final SubLObject edge) {
        SubLObject filtered_cycls = NIL;
        final SubLObject constraint_table = psp_rule_constraints(rule);
        final SubLObject constraints = list_utilities.remove_if_not($sym104$PSP_SEMANTIC_CONSTRAINT_, psp_constraints_on_dtr(dtr_num, constraint_table), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = dtr_cycls;
        SubLObject cycl = NIL;
        cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject failP = NIL;
            if (NIL == failP) {
                SubLObject csome_list_var = constraints;
                SubLObject constraint = NIL;
                constraint = csome_list_var.first();
                while ((NIL == failP) && (NIL != csome_list_var)) {
                    constraint = psp_cyclify_targets(constraint, edge);
                    failP = psp_cycl_fails_constraintP(cycl, constraint);
                    if (NIL != psp_traced_ruleP(psp_chart.psp_edge_rule_fort(edge))) {
                        format(T, $str105$___S____A_constraint__S___, new SubLObject[]{ cycl, NIL != failP ? $$$failed : $$$met, constraint });
                    }
                    csome_list_var = csome_list_var.rest();
                    constraint = csome_list_var.first();
                } 
            }
            if (NIL == failP) {
                filtered_cycls = cons(cycl, filtered_cycls);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cycl = cdolist_list_var.first();
        } 
        return filtered_cycls;
    }

    /**
     * If the target in CONSTRAINT is an integer, replace it with the corresponding CycL expressions.
     */
    @LispMethod(comment = "If the target in CONSTRAINT is an integer, replace it with the corresponding CycL expressions.")
    public static final SubLObject psp_cyclify_targets_alt(SubLObject constraint, SubLObject edge) {
        {
            SubLObject datum = constraint;
            SubLObject current = datum;
            SubLObject type = NIL;
            SubLObject target = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt89);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt89);
            target = current.first();
            current = current.rest();
            if (NIL == current) {
                if (target.isInteger()) {
                    {
                        SubLObject target_dtr = psp_chart.psp_edge_nth_dtr(target, edge);
                        SubLObject target_cycls = psp_semantics.psp_cycls_to_cycls(psp_semantics.psp_semantics_for_edge(target_dtr, UNPROVIDED, UNPROVIDED));
                        constraint = list(type, bq_cons($LIST, target_cycls));
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt89);
            }
        }
        return constraint;
    }

    /**
     * If the target in CONSTRAINT is an integer, replace it with the corresponding CycL expressions.
     */
    @LispMethod(comment = "If the target in CONSTRAINT is an integer, replace it with the corresponding CycL expressions.")
    public static SubLObject psp_cyclify_targets(SubLObject constraint, final SubLObject edge) {
        SubLObject current;
        final SubLObject datum = current = constraint;
        SubLObject type = NIL;
        SubLObject target = NIL;
        destructuring_bind_must_consp(current, datum, $list90);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list90);
        target = current.first();
        current = current.rest();
        if (NIL == current) {
            if (target.isInteger()) {
                final SubLObject target_dtr = psp_chart.psp_edge_nth_dtr(target, edge);
                final SubLObject target_cycls = psp_semantics.psp_cycls_to_cycls(psp_semantics.psp_semantics_for_edge(target_dtr, UNPROVIDED, UNPROVIDED));
                constraint = list(type, bq_cons($LIST, target_cycls));
            }
        } else {
            cdestructuring_bind_error(datum, $list90);
        }
        return constraint;
    }/**
     * If the target in CONSTRAINT is an integer, replace it with the corresponding CycL expressions.
     */


    /**
     *
     *
     * @return BOOLEAN.
     */
    @LispMethod(comment = "@return BOOLEAN.")
    public static final SubLObject psp_edge_passes_semantic_constraintsP_alt(SubLObject edge) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rule_struct = psp_chart.psp_edge_rule_struct(edge);
                SubLObject constraint_table = psp_rule_constraints(rule_struct);
                SubLObject dtrs = psp_chart.psp_edge_dtrs(edge);
                SubLObject failP = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(constraint_table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject dtr_num = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject constraints = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == failP) {
                            {
                                SubLObject csome_list_var = constraints;
                                SubLObject constraint = NIL;
                                for (constraint = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , constraint = csome_list_var.first()) {
                                    if ((NIL != psp_semantic_constraintP(constraint)) && (NIL != psp_edge_fails_constraintP(nth(number_utilities.f_1_(dtr_num), dtrs), constraint, dtrs))) {
                                        failP = T;
                                    }
                                }
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return makeBoolean(NIL == failP);
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN.
     */
    @LispMethod(comment = "@return BOOLEAN.")
    public static SubLObject psp_edge_passes_semantic_constraintsP(final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_struct = psp_chart.psp_edge_rule_struct(edge);
        final SubLObject constraint_table = psp_rule_constraints(rule_struct);
        final SubLObject dtrs = psp_chart.psp_edge_dtrs(edge);
        SubLObject failP = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(constraint_table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject dtr_num = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject constraints = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == failP) {
                SubLObject csome_list_var = constraints;
                SubLObject constraint = NIL;
                constraint = csome_list_var.first();
                while ((NIL == failP) && (NIL != csome_list_var)) {
                    if ((NIL != psp_semantic_constraintP(constraint)) && (NIL != psp_edge_fails_constraintP(nth(number_utilities.f_1_(dtr_num), dtrs), constraint, dtrs))) {
                        failP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    constraint = csome_list_var.first();
                } 
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return makeBoolean(NIL == failP);
    }

    /**
     * Check EDGE against the syntactic constraints in CONSTRAINTS, some of which may refer to
     * a potential left-hand sister (in OLD-DTRS) of EDGE, e.g. for agreement.
     */
    @LispMethod(comment = "Check EDGE against the syntactic constraints in CONSTRAINTS, some of which may refer to\r\na potential left-hand sister (in OLD-DTRS) of EDGE, e.g. for agreement.\nCheck EDGE against the syntactic constraints in CONSTRAINTS, some of which may refer to\na potential left-hand sister (in OLD-DTRS) of EDGE, e.g. for agreement.")
    public static final SubLObject psp_edge_meets_syntax_constraintsP_alt(SubLObject edge, SubLObject constraints, SubLObject mother, SubLObject traced_rule_fort) {
        if (mother == UNPROVIDED) {
            mother = NIL;
        }
        if (traced_rule_fort == UNPROVIDED) {
            traced_rule_fort = NIL;
        }
        {
            SubLObject pcase_var = constraints;
            if (pcase_var.eql($UNKNOWN)) {
                return T;
            } else {
                {
                    SubLObject failP = NIL;
                    if (NIL == failP) {
                        {
                            SubLObject csome_list_var = constraints;
                            SubLObject constraint = NIL;
                            for (constraint = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , constraint = csome_list_var.first()) {
                                if ((NIL != psp_syntactic_constraintP(constraint)) && (NIL != psp_edge_fails_constraintP(edge, constraint, mother))) {
                                    failP = T;
                                    if (NIL != traced_rule_fort) {
                                        {
                                            SubLObject target = psp_constraint_target(constraint);
                                            format(T, $str_alt109$___S___failed_constraint__S___S, new SubLObject[]{ edge, psp_constraint_type(constraint), NIL != set.set_p(target) ? ((SubLObject) (set.set_element_list(target))) : target });
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return sublisp_null(failP);
                }
            }
        }
    }

    /**
     * Check EDGE against the syntactic constraints in CONSTRAINTS, some of which may refer to
     * a potential left-hand sister (in OLD-DTRS) of EDGE, e.g. for agreement.
     */
    @LispMethod(comment = "Check EDGE against the syntactic constraints in CONSTRAINTS, some of which may refer to\r\na potential left-hand sister (in OLD-DTRS) of EDGE, e.g. for agreement.\nCheck EDGE against the syntactic constraints in CONSTRAINTS, some of which may refer to\na potential left-hand sister (in OLD-DTRS) of EDGE, e.g. for agreement.")
    public static SubLObject psp_edge_meets_syntax_constraintsP(final SubLObject edge, final SubLObject constraints, SubLObject mother, SubLObject traced_rule_fort) {
        if (mother == UNPROVIDED) {
            mother = NIL;
        }
        if (traced_rule_fort == UNPROVIDED) {
            traced_rule_fort = NIL;
        }
        if (constraints.eql($UNKNOWN)) {
            return T;
        }
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = constraints;
            SubLObject constraint = NIL;
            constraint = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                if ((NIL != psp_syntactic_constraintP(constraint)) && (NIL != psp_edge_fails_constraintP(edge, constraint, mother))) {
                    failP = T;
                    if (NIL != traced_rule_fort) {
                        final SubLObject target = psp_constraint_target(constraint);
                        format(T, $str110$___S___failed_constraint__S___S, new SubLObject[]{ edge, psp_constraint_type(constraint), NIL != set.set_p(target) ? set.set_element_list(target) : target });
                    }
                }
                csome_list_var = csome_list_var.rest();
                constraint = csome_list_var.first();
            } 
        }
        return sublisp_null(failP);
    }/**
     * Check EDGE against the syntactic constraints in CONSTRAINTS, some of which may refer to
     * a potential left-hand sister (in OLD-DTRS) of EDGE, e.g. for agreement.
     */


    /**
     *
     *
     * @return BOOLEAN.
     */
    @LispMethod(comment = "@return BOOLEAN.")
    public static final SubLObject psp_syntactic_constraintP_alt(SubLObject constraint) {
        return psp_syntactic_constraint_typeP(psp_constraint_type(constraint));
    }

    /**
     *
     *
     * @return BOOLEAN.
     */
    @LispMethod(comment = "@return BOOLEAN.")
    public static SubLObject psp_syntactic_constraintP(final SubLObject constraint) {
        return psp_syntactic_constraint_typeP(psp_constraint_type(constraint));
    }

    public static final SubLObject clear_psp_syntactic_constraint_types_alt() {
        $psp_syntactic_constraint_types$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject clear_psp_syntactic_constraint_types() {
        $psp_syntactic_constraint_types$.setGlobalValue(NIL);
        return NIL;
    }

    public static final SubLObject psp_syntactic_constraint_typeP_alt(SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $psp_syntactic_constraint_types$.getGlobalValue()) {
                {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            $psp_syntactic_constraint_types$.setGlobalValue(cons($FRAME, kb_mapping_utilities.pred_values($const111$PhraseStructureConstraint_Syntact, $$resultIsa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED)));
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return subl_promotions.memberP(type, $psp_syntactic_constraint_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject psp_syntactic_constraint_typeP(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $psp_syntactic_constraint_types$.getGlobalValue()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                $psp_syntactic_constraint_types$.setGlobalValue(cons($FRAME, kb_mapping_utilities.pred_values($const112$PhraseStructureConstraint_Syntact, $$resultIsa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED)));
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return subl_promotions.memberP(type, $psp_syntactic_constraint_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return BOOLEAN.
     */
    @LispMethod(comment = "@return BOOLEAN.")
    public static final SubLObject psp_semantic_constraintP_alt(SubLObject constraint) {
        return psp_semantic_constraint_typeP(psp_constraint_type(constraint));
    }

    /**
     *
     *
     * @return BOOLEAN.
     */
    @LispMethod(comment = "@return BOOLEAN.")
    public static SubLObject psp_semantic_constraintP(final SubLObject constraint) {
        return psp_semantic_constraint_typeP(psp_constraint_type(constraint));
    }

    public static final SubLObject clear_psp_semantic_constraint_types_alt() {
        $psp_semantic_constraint_types$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject clear_psp_semantic_constraint_types() {
        $psp_semantic_constraint_types$.setGlobalValue(NIL);
        return NIL;
    }

    public static final SubLObject psp_semantic_constraint_typeP_alt(SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $psp_semantic_constraint_types$.getGlobalValue()) {
                {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            $psp_semantic_constraint_types$.setGlobalValue(kb_mapping_utilities.pred_values($const114$PhraseStructureConstraint_Semanti, $$resultIsa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED));
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return subl_promotions.memberP(type, $psp_semantic_constraint_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject psp_semantic_constraint_typeP(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $psp_semantic_constraint_types$.getGlobalValue()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                $psp_semantic_constraint_types$.setGlobalValue(kb_mapping_utilities.pred_values($const115$PhraseStructureConstraint_Semanti, $$resultIsa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED));
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return subl_promotions.memberP(type, $psp_semantic_constraint_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject clear_psp_cycl_fails_constraintP_alt() {
        {
            SubLObject cs = $psp_cycl_fails_constraintP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_psp_cycl_fails_constraintP() {
        final SubLObject cs = $psp_cycl_fails_constraintP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_psp_cycl_fails_constraintP_alt(SubLObject psp_cycl, SubLObject constraint) {
        return memoization_state.caching_state_remove_function_results_with_args($psp_cycl_fails_constraintP_caching_state$.getGlobalValue(), list(psp_cycl, constraint), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_psp_cycl_fails_constraintP(final SubLObject psp_cycl, final SubLObject constraint) {
        return memoization_state.caching_state_remove_function_results_with_args($psp_cycl_fails_constraintP_caching_state$.getGlobalValue(), list(psp_cycl, constraint), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject psp_cycl_fails_constraintP_internal_alt(SubLObject psp_cycl, SubLObject constraint) {
        {
            SubLObject cycl = psp_semantics.psp_cycl_cycl(psp_cycl);
            SubLObject failP = T;
            SubLObject datum = constraint;
            SubLObject current = datum;
            SubLObject c_type = NIL;
            SubLObject target = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt116);
            c_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt116);
            target = current.first();
            current = current.rest();
            if (NIL == current) {
                if (target.isList() && (target.first() == $LIST)) {
                    {
                        SubLObject succeedP = NIL;
                        if (NIL == succeedP) {
                            {
                                SubLObject csome_list_var = target.rest();
                                SubLObject item = NIL;
                                for (item = csome_list_var.first(); !((NIL != succeedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , item = csome_list_var.first()) {
                                    if (NIL == psp_cycl_fails_constraintP(cycl, list(c_type, item))) {
                                        succeedP = T;
                                    }
                                }
                            }
                        }
                        failP = makeBoolean(NIL == succeedP);
                    }
                } else {
                    cycl = parsing_utilities.strip_nl_tags(cycl, UNPROVIDED);
                    target = parsing_utilities.strip_nl_tags(target, UNPROVIDED);
                    {
                        SubLObject pcase_var = c_type;
                        if (pcase_var.eql($$PSRuleIsaConstraintFn)) {
                            failP = makeBoolean(NIL == psp_isaP(cycl, target));
                        } else {
                            if (pcase_var.eql($$PSRuleGenlsConstraintFn)) {
                                failP = makeBoolean(NIL == psp_genlP(cycl, target));
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt116);
            }
            return failP;
        }
    }

    public static SubLObject psp_cycl_fails_constraintP_internal(final SubLObject psp_cycl, final SubLObject constraint) {
        SubLObject cycl = psp_semantics.psp_cycl_cycl(psp_cycl);
        SubLObject failP = T;
        SubLObject c_type = NIL;
        SubLObject target = NIL;
        destructuring_bind_must_consp(constraint, constraint, $list117);
        c_type = constraint.first();
        SubLObject current = constraint.rest();
        destructuring_bind_must_consp(current, constraint, $list117);
        target = current.first();
        current = current.rest();
        if (NIL == current) {
            if (target.isList() && (target.first() == $LIST)) {
                SubLObject succeedP = NIL;
                if (NIL == succeedP) {
                    SubLObject csome_list_var = target.rest();
                    SubLObject item = NIL;
                    item = csome_list_var.first();
                    while ((NIL == succeedP) && (NIL != csome_list_var)) {
                        if (NIL == psp_cycl_fails_constraintP(cycl, list(c_type, item))) {
                            succeedP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        item = csome_list_var.first();
                    } 
                }
                failP = makeBoolean(NIL == succeedP);
            } else {
                cycl = parsing_utilities.strip_nl_tags(cycl, UNPROVIDED);
                target = parsing_utilities.strip_nl_tags(target, UNPROVIDED);
                final SubLObject pcase_var = c_type;
                if (pcase_var.eql($$PSRuleIsaConstraintFn)) {
                    failP = makeBoolean(NIL == psp_isaP(cycl, target));
                } else
                    if (pcase_var.eql($$PSRuleGenlsConstraintFn)) {
                        failP = makeBoolean(NIL == psp_genlP(cycl, target));
                    }

            }
        } else {
            cdestructuring_bind_error(constraint, $list117);
        }
        return failP;
    }

    public static final SubLObject psp_cycl_fails_constraintP_alt(SubLObject psp_cycl, SubLObject constraint) {
        {
            SubLObject caching_state = $psp_cycl_fails_constraintP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym115$PSP_CYCL_FAILS_CONSTRAINT_, $sym119$_PSP_CYCL_FAILS_CONSTRAINT__CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, $int$256);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(psp_cycl, constraint);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw85$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (psp_cycl.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && constraint.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(psp_cycl_fails_constraintP_internal(psp_cycl, constraint)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(psp_cycl, constraint));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject psp_cycl_fails_constraintP(final SubLObject psp_cycl, final SubLObject constraint) {
        SubLObject caching_state = $psp_cycl_fails_constraintP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym116$PSP_CYCL_FAILS_CONSTRAINT_, $sym120$_PSP_CYCL_FAILS_CONSTRAINT__CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, $int$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(psp_cycl, constraint);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (psp_cycl.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && constraint.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(psp_cycl_fails_constraintP_internal(psp_cycl, constraint)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(psp_cycl, constraint));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @return BOOLEAN.
     */
    @LispMethod(comment = "@return BOOLEAN.")
    public static final SubLObject psp_edge_fails_constraintP_alt(SubLObject edge, SubLObject constraint, SubLObject mother) {
        {
            SubLObject edge_is_gapP = eq(edge, $GAP);
            if ((NIL != edge_is_gapP) && (NIL == psp_chart.psp_gap_allowedP())) {
                return T;
            }
            {
                SubLObject datum = constraint;
                SubLObject current = datum;
                SubLObject c_type = NIL;
                SubLObject target = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt116);
                c_type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt116);
                target = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject pcase_var = c_type;
                        if (pcase_var.eql($$ConstituentTypeConstraintFn)) {
                            if (NIL != psp_lexeme_constraintP(target)) {
                                return psp_edge_fails_lexeme_constraintP(edge, target);
                            } else {
                                {
                                    SubLObject edge_cat = (NIL != edge_is_gapP) ? ((SubLObject) (psp_chart.psp_allowed_gap_category())) : psp_chart.get_psp_edge_category(edge);
                                    if ((NIL != psp_chart.psp_pp_gap_allowedP()) && (NIL != psp_constraint_target_includesP(target, $$PrepositionalPhrase, UNPROVIDED))) {
                                        return NIL;
                                    } else {
                                        if (NIL != psp_constraint_target_includesP(target, edge_cat, UNPROVIDED)) {
                                            return NIL;
                                        } else {
                                            return T;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (pcase_var.eql($$DetNbarAgrConstraintFn)) {
                                return makeBoolean((NIL != edge_is_gapP) || (NIL == psp_det_nbar_agreeP(edge, target, mother)));
                            } else {
                                if (pcase_var.eql($$POSPredConstraintFn)) {
                                    {
                                        SubLObject failsP = makeBoolean((NIL == edge_is_gapP) && (NIL == psp_constraint_target_includesP(target, psp_chart.get_psp_edge_pos_pred(edge), UNPROVIDED)));
                                        return failsP;
                                    }
                                } else {
                                    if (pcase_var.eql($FRAME)) {
                                        if (NIL != edge_is_gapP) {
                                            return NIL;
                                        }
                                        {
                                            SubLObject lexical_head_dtr = psp_chart.psp_edge_lexical_head_dtr(edge);
                                            SubLObject edge_frame = (NIL != lexical_head_dtr) ? ((SubLObject) (psp_chart.get_psp_edge_frame(lexical_head_dtr))) : NIL;
                                            return makeBoolean(NIL == psp_constraint_target_includesP(target, edge_frame, UNPROVIDED));
                                        }
                                    } else {
                                        return T;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt116);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEAN.
     */
    @LispMethod(comment = "@return BOOLEAN.")
    public static SubLObject psp_edge_fails_constraintP(final SubLObject edge, final SubLObject constraint, final SubLObject mother) {
        final SubLObject edge_is_gapP = eq(edge, $GAP);
        if ((NIL != edge_is_gapP) && (NIL == psp_chart.psp_gap_allowedP())) {
            return T;
        }
        SubLObject c_type = NIL;
        SubLObject target = NIL;
        destructuring_bind_must_consp(constraint, constraint, $list117);
        c_type = constraint.first();
        SubLObject current = constraint.rest();
        destructuring_bind_must_consp(current, constraint, $list117);
        target = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(constraint, $list117);
            return NIL;
        }
        final SubLObject pcase_var = c_type;
        if (pcase_var.eql($$ConstituentTypeConstraintFn)) {
            if (NIL != psp_lexeme_constraintP(target)) {
                return psp_edge_fails_lexeme_constraintP(edge, target);
            }
            final SubLObject edge_cat = (NIL != edge_is_gapP) ? psp_chart.psp_allowed_gap_category() : psp_chart.get_psp_edge_category(edge);
            if ((NIL != psp_chart.psp_pp_gap_allowedP()) && (NIL != psp_constraint_target_includesP(target, $$PrepositionalPhrase, UNPROVIDED))) {
                return NIL;
            }
            if (NIL != psp_constraint_target_includesP(target, edge_cat, UNPROVIDED)) {
                return NIL;
            }
            return T;
        } else {
            if (pcase_var.eql($$DetNbarAgrConstraintFn)) {
                return makeBoolean((NIL != edge_is_gapP) || (NIL == psp_det_nbar_agreeP(edge, target, mother)));
            }
            if (pcase_var.eql($$POSPredConstraintFn)) {
                final SubLObject failsP = makeBoolean((NIL == edge_is_gapP) && (NIL == psp_constraint_target_includesP(target, psp_chart.get_psp_edge_pos_pred(edge), UNPROVIDED)));
                return failsP;
            }
            if (!pcase_var.eql($FRAME)) {
                return T;
            }
            if (NIL != edge_is_gapP) {
                return NIL;
            }
            final SubLObject lexical_head_dtr = psp_chart.psp_edge_lexical_head_dtr(edge);
            final SubLObject edge_frame = (NIL != lexical_head_dtr) ? psp_chart.get_psp_edge_frame(lexical_head_dtr) : NIL;
            return makeBoolean(NIL == psp_constraint_target_includesP(target, edge_frame, UNPROVIDED));
        }
    }

    public static final SubLObject clear_psp_phrase_types_alt() {
        {
            SubLObject cs = $psp_phrase_types_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_psp_phrase_types() {
        final SubLObject cs = $psp_phrase_types_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_psp_phrase_types_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($psp_phrase_types_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_psp_phrase_types(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($psp_phrase_types_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject psp_phrase_types_internal_alt(SubLObject mt) {
        return genls.all_specs($$NLPhrase, mt, UNPROVIDED);
    }

    public static SubLObject psp_phrase_types_internal(final SubLObject mt) {
        return genls.all_specs($$NLPhrase, mt, UNPROVIDED);
    }

    public static final SubLObject psp_phrase_types_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        {
            SubLObject caching_state = $psp_phrase_types_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PSP_PHRASE_TYPES, $psp_phrase_types_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, $kw85$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw85$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(psp_phrase_types_internal(mt)));
                    memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject psp_phrase_types(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        SubLObject caching_state = $psp_phrase_types_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PSP_PHRASE_TYPES, $psp_phrase_types_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(psp_phrase_types_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject psp_constraints_require_phraseP_internal_alt(SubLObject constraints) {
        {
            SubLObject ans = NIL;
            if (NIL == ans) {
                {
                    SubLObject csome_list_var = constraints;
                    SubLObject constraint = NIL;
                    for (constraint = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , constraint = csome_list_var.first()) {
                        {
                            SubLObject datum = constraint;
                            SubLObject current = datum;
                            SubLObject c_type = NIL;
                            SubLObject target = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt116);
                            c_type = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt116);
                            target = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (c_type == $$ConstituentTypeConstraintFn) {
                                    if (NIL == ans) {
                                        {
                                            SubLObject csome_list_var_41 = psp_phrase_types(UNPROVIDED);
                                            SubLObject phrase_type = NIL;
                                            for (phrase_type = csome_list_var_41.first(); !((NIL != ans) || (NIL == csome_list_var_41)); csome_list_var_41 = csome_list_var_41.rest() , phrase_type = csome_list_var_41.first()) {
                                                ans = set.set_memberP(phrase_type, target);
                                            }
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt116);
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    public static SubLObject psp_constraints_require_phraseP_internal(final SubLObject constraints) {
        SubLObject ans = NIL;
        if (NIL == ans) {
            SubLObject csome_list_var = constraints;
            SubLObject constraint = NIL;
            constraint = csome_list_var.first();
            while ((NIL == ans) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = constraint;
                SubLObject c_type = NIL;
                SubLObject target = NIL;
                destructuring_bind_must_consp(current, datum, $list117);
                c_type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list117);
                target = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (c_type.eql($$ConstituentTypeConstraintFn) && (NIL == ans)) {
                        SubLObject csome_list_var_$42;
                        SubLObject phrase_type;
                        for (csome_list_var_$42 = psp_phrase_types(UNPROVIDED), phrase_type = NIL, phrase_type = csome_list_var_$42.first(); (NIL == ans) && (NIL != csome_list_var_$42); ans = set.set_memberP(phrase_type, target) , csome_list_var_$42 = csome_list_var_$42.rest() , phrase_type = csome_list_var_$42.first()) {
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list117);
                }
                csome_list_var = csome_list_var.rest();
                constraint = csome_list_var.first();
            } 
        }
        return ans;
    }

    public static final SubLObject psp_constraints_require_phraseP_alt(SubLObject constraints) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_constraints_require_phraseP_internal(constraints);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym127$PSP_CONSTRAINTS_REQUIRE_PHRASE_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym127$PSP_CONSTRAINTS_REQUIRE_PHRASE_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym127$PSP_CONSTRAINTS_REQUIRE_PHRASE_, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, constraints, $kw85$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw85$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_constraints_require_phraseP_internal(constraints)));
                        memoization_state.caching_state_put(caching_state, constraints, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject psp_constraints_require_phraseP(final SubLObject constraints) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_constraints_require_phraseP_internal(constraints);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, constraints, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_constraints_require_phraseP_internal(constraints)));
            memoization_state.caching_state_put(caching_state, constraints, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject psp_edge_fails_lexeme_constraintP_alt(SubLObject edge, SubLObject target) {
        {
            SubLObject target_wu = cycl_utilities.nat_arg3(set.set_element_list(target).first(), UNPROVIDED);
            if (NIL != psp_chart.psp_pp_gap_allowedP()) {
                {
                    SubLObject gap_string = psp_chart.psp_pp_gap_string();
                    SubLObject csome_list_var = lexicon_accessors.words_of_stringXspeech_part(gap_string, $$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject wu = NIL;
                    for (wu = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , wu = csome_list_var.first()) {
                        if (wu.equal(target_wu)) {
                            return NIL;
                        }
                    }
                    return T;
                }
            } else {
                if (edge == $GAP) {
                    return NIL;
                } else {
                    return makeBoolean(NIL == psp_edge_has_wuP(edge, target_wu));
                }
            }
        }
    }

    public static SubLObject psp_edge_fails_lexeme_constraintP(final SubLObject edge, final SubLObject target) {
        final SubLObject target_wu = cycl_utilities.nat_arg3(set.set_element_list(target).first(), UNPROVIDED);
        if (NIL != psp_chart.psp_pp_gap_allowedP()) {
            final SubLObject gap_string = psp_chart.psp_pp_gap_string();
            SubLObject csome_list_var = lexicon_accessors.words_of_stringXspeech_part(gap_string, $$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject wu = NIL;
            wu = csome_list_var.first();
            while (NIL != csome_list_var) {
                if (wu.equal(target_wu)) {
                    return NIL;
                }
                csome_list_var = csome_list_var.rest();
                wu = csome_list_var.first();
            } 
            return T;
        }
        if (edge == $GAP) {
            return NIL;
        }
        return makeBoolean(NIL == psp_edge_has_wuP(edge, target_wu));
    }

    public static final SubLObject psp_lexeme_constraintP_alt(SubLObject target) {
        {
            SubLObject successP = NIL;
            SubLObject set_contents_var = set.do_set_internal(target);
            SubLObject basis_object = do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != successP) || (NIL != do_set_contents_doneP(basis_object, state))); state = do_set_contents_update_state(state)) {
                {
                    SubLObject target_cycl = do_set_contents_next(basis_object, state);
                    if (NIL != do_set_contents_element_validP(state, target_cycl)) {
                        if (NIL != possibly_naut_p(target_cycl)) {
                            {
                                SubLObject failP = NIL;
                                if (NIL == failP) {
                                    {
                                        SubLObject arg = NIL;
                                        SubLObject arg_42 = NIL;
                                        SubLObject target_arg = NIL;
                                        SubLObject target_arg_43 = NIL;
                                        for (arg = target_cycl, arg_42 = arg.first(), target_arg = $list_alt129, target_arg_43 = target_arg.first(); !((NIL != failP) || ((NIL == target_arg) && (NIL == arg))); arg = arg.rest() , arg_42 = arg.first() , target_arg = target_arg.rest() , target_arg_43 = target_arg.first()) {
                                            if (NIL == target_arg_43) {
                                            } else {
                                                if (arg_42 != target_arg_43) {
                                                    failP = T;
                                                }
                                            }
                                        }
                                    }
                                }
                                successP = makeBoolean(NIL == failP);
                            }
                        }
                    }
                }
            }
            return successP;
        }
    }

    public static SubLObject psp_lexeme_constraintP(final SubLObject target) {
        SubLObject successP = NIL;
        final SubLObject set_contents_var = set.do_set_internal(target);
        SubLObject basis_object;
        SubLObject state;
        SubLObject target_cycl;
        SubLObject failP;
        SubLObject arg;
        SubLObject arg_$43;
        SubLObject target_arg;
        SubLObject target_arg_$44;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == successP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            target_cycl = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, target_cycl)) && (NIL != possibly_naut_p(target_cycl))) {
                failP = NIL;
                if (NIL == failP) {
                    arg = NIL;
                    arg_$43 = NIL;
                    target_arg = NIL;
                    target_arg_$44 = NIL;
                    arg = target_cycl;
                    arg_$43 = arg.first();
                    target_arg = $list130;
                    target_arg_$44 = target_arg.first();
                    while ((NIL == failP) && ((NIL != target_arg) || (NIL != arg))) {
                        if (NIL != target_arg_$44) {
                            if (!arg_$43.eql(target_arg_$44)) {
                                failP = T;
                            }
                        }
                        arg = arg.rest();
                        arg_$43 = arg.first();
                        target_arg = target_arg.rest();
                        target_arg_$44 = target_arg.first();
                    } 
                }
                successP = makeBoolean(NIL == failP);
            }
        }
        return successP;
    }

    /**
     *
     *
     * @return BOOLEAN; does TARGET-ELEMENT require a particular frame type?
     */
    @LispMethod(comment = "@return BOOLEAN; does TARGET-ELEMENT require a particular frame type?")
    public static final SubLObject psp_frame_specific_constituent_typeP_alt(SubLObject target_element) {
        return makeBoolean((NIL != possibly_nat_p(target_element)) && (NIL != member(cycl_utilities.nat_functor(target_element), $list_alt130, UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @return BOOLEAN; does TARGET-ELEMENT require a particular frame type?
     */
    @LispMethod(comment = "@return BOOLEAN; does TARGET-ELEMENT require a particular frame type?")
    public static SubLObject psp_frame_specific_constituent_typeP(final SubLObject target_element) {
        return makeBoolean((NIL != possibly_nat_p(target_element)) && (NIL != member(cycl_utilities.nat_functor(target_element), $list131, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject psp_frame_type_from_constituent_type_alt(SubLObject constituent_type) {
        return cycl_utilities.nat_arg2(constituent_type, UNPROVIDED);
    }

    public static SubLObject psp_frame_type_from_constituent_type(final SubLObject constituent_type) {
        return cycl_utilities.nat_arg2(constituent_type, UNPROVIDED);
    }

    /**
     *
     *
     * @return BOOLEAN; Does TARGET-SET include ITEM?
     * @param TARGET-SET
    set-p.
     * 		
     */
    @LispMethod(comment = "@return BOOLEAN; Does TARGET-SET include ITEM?\r\n@param TARGET-SET\nset-p.")
    public static final SubLObject psp_constraint_target_includesP_alt(SubLObject target_set, SubLObject item, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (key == symbol_function(IDENTITY)) {
            return set.set_memberP(item, target_set);
        }
        {
            SubLObject test_fn = set.set_test(target_set);
            SubLObject set_contents_var = set.do_set_internal(target_set);
            SubLObject basis_object = do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
                {
                    SubLObject target_element = do_set_contents_next(basis_object, state);
                    if (NIL != do_set_contents_element_validP(state, target_element)) {
                        if (NIL != funcall(test_fn, item, funcall(key, target_element))) {
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
     * @return BOOLEAN; Does TARGET-SET include ITEM?
     * @param TARGET-SET
    set-p.
     * 		
     */
    @LispMethod(comment = "@return BOOLEAN; Does TARGET-SET include ITEM?\r\n@param TARGET-SET\nset-p.")
    public static SubLObject psp_constraint_target_includesP(final SubLObject target_set, final SubLObject item, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (key.eql(symbol_function(IDENTITY))) {
            return set.set_memberP(item, target_set);
        }
        final SubLObject test_fn = set.set_test(target_set);
        final SubLObject set_contents_var = set.do_set_internal(target_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject target_element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            target_element = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, target_element)) && (NIL != funcall(test_fn, item, funcall(key, target_element)))) {
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject psp_edge_has_wuP_alt(SubLObject edge, SubLObject wu) {
        return eq(psp_chart.get_psp_edge_wu(edge), wu);
    }

    public static SubLObject psp_edge_has_wuP(final SubLObject edge, final SubLObject wu) {
        return eq(psp_chart.get_psp_edge_wu(edge), wu);
    }

    /**
     *
     *
     * @return BOOLEAN.
     */
    @LispMethod(comment = "@return BOOLEAN.")
    public static final SubLObject psp_det_nbar_agreeP_alt(SubLObject nbar_edge, SubLObject target, SubLObject mother) {
        {
            SubLObject nbar_pos_pred = psp_chart.get_psp_edge_pos_pred(nbar_edge);
            SubLObject old_dtrs = (NIL != mother) ? ((SubLObject) (psp_chart.psp_edge_dtrs(mother))) : NIL;
            SubLObject detp_edge = nth(number_utilities.f_1_(target), old_dtrs);
            SubLObject det_edge = psp_chart.psp_edge_lexical_head_dtr(detp_edge);
            SubLObject det_string = psp_chart.get_psp_edge_string(det_edge);
            SubLObject ok_preds = lexicon_accessors.agr_of_det_string(det_string);
            if (NIL != lexicon_vars.name_string_predP(nbar_pos_pred)) {
                {
                    SubLObject csome_list_var = psp_semantics.psp_semantics_for_edge(nbar_edge, UNPROVIDED, UNPROVIDED);
                    SubLObject denot = NIL;
                    for (denot = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , denot = csome_list_var.first()) {
                        if (NIL != rbp_wff.npp_collectionP(parsing_utilities.strip_nl_tags(denot, UNPROVIDED))) {
                            return T;
                        }
                    }
                }
                return NIL;
            } else {
                if (NIL != ok_preds) {
                } else {
                    if (NIL != psp_semantics.psp_genl_posP(psp_chart.get_psp_edge_category(det_edge), $$Number_SP, UNPROVIDED)) {
                        {
                            SubLObject denots = psp_semantics.psp_semantics_for_edge(det_edge, UNPROVIDED, UNPROVIDED);
                            if (NIL == ok_preds) {
                                {
                                    SubLObject csome_list_var = denots;
                                    SubLObject denot = NIL;
                                    for (denot = csome_list_var.first(); !((NIL != ok_preds) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , denot = csome_list_var.first()) {
                                        {
                                            SubLObject denot_cycl = psp_semantics.psp_cycl_cycl(denot);
                                            if (NIL != parsing_utilities.determiner_number_denotP(denot_cycl)) {
                                                ok_preds = parsing_utilities.agr_preds_for_number(denot_cycl);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        psp_det_string_agreement_warn(det_string);
                        ok_preds = $list_alt132;
                    }
                }
            }
            return makeBoolean((NIL != forts.fort_p(nbar_pos_pred)) && (NIL != member(nbar_pos_pred, ok_preds, $sym133$GENL_POS_PRED_, UNPROVIDED)));
        }
    }

    /**
     *
     *
     * @return BOOLEAN.
     */
    @LispMethod(comment = "@return BOOLEAN.")
    public static SubLObject psp_det_nbar_agreeP(final SubLObject nbar_edge, final SubLObject target, final SubLObject mother) {
        final SubLObject nbar_pos_pred = psp_chart.get_psp_edge_pos_pred(nbar_edge);
        final SubLObject old_dtrs = (NIL != mother) ? psp_chart.psp_edge_dtrs(mother) : NIL;
        final SubLObject detp_edge = nth(number_utilities.f_1_(target), old_dtrs);
        final SubLObject det_edge = psp_chart.psp_edge_lexical_head_dtr(detp_edge);
        final SubLObject det_string = psp_chart.get_psp_edge_string(det_edge);
        SubLObject ok_preds = lexicon_accessors.agr_of_det_string(det_string);
        if (NIL != lexicon_vars.name_string_predP(nbar_pos_pred)) {
            SubLObject csome_list_var = psp_semantics.psp_semantics_for_edge(nbar_edge, UNPROVIDED, UNPROVIDED);
            SubLObject denot = NIL;
            denot = csome_list_var.first();
            while (NIL != csome_list_var) {
                if (NIL != rbp_wff.npp_collectionP(parsing_utilities.strip_nl_tags(denot, UNPROVIDED))) {
                    return T;
                }
                csome_list_var = csome_list_var.rest();
                denot = csome_list_var.first();
            } 
            return NIL;
        }
        if (NIL == ok_preds) {
            if (NIL != psp_semantics.psp_genl_posP(psp_chart.get_psp_edge_category(det_edge), $$Number_SP, UNPROVIDED)) {
                final SubLObject denots = psp_semantics.psp_semantics_for_edge(det_edge, UNPROVIDED, UNPROVIDED);
                if (NIL == ok_preds) {
                    SubLObject csome_list_var2 = denots;
                    SubLObject denot2 = NIL;
                    denot2 = csome_list_var2.first();
                    while ((NIL == ok_preds) && (NIL != csome_list_var2)) {
                        final SubLObject denot_cycl = psp_semantics.psp_cycl_cycl(denot2);
                        if (NIL != parsing_utilities.determiner_number_denotP(denot_cycl)) {
                            ok_preds = parsing_utilities.agr_preds_for_number(denot_cycl);
                        }
                        csome_list_var2 = csome_list_var2.rest();
                        denot2 = csome_list_var2.first();
                    } 
                }
            } else {
                ok_preds = $list133;
            }
        }
        return makeBoolean((NIL != forts.fort_p(nbar_pos_pred)) && (NIL != member(nbar_pos_pred, ok_preds, $sym134$GENL_POS_PRED_, UNPROVIDED)));
    }

    public static final SubLObject psp_valid_constituent_typeP_alt(SubLObject type, SubLObject target) {
        return set.set_memberP(psp_rewrite(type), psp_sub_categories(target));
    }

    public static SubLObject psp_valid_constituent_typeP(final SubLObject type, final SubLObject target) {
        return set.set_memberP(psp_rewrite(type), psp_sub_categories(target));
    }

    public static final SubLObject clear_psp_sub_categories_alt() {
        {
            SubLObject cs = $psp_sub_categories_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_psp_sub_categories() {
        final SubLObject cs = $psp_sub_categories_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_psp_sub_categories_alt(SubLObject target) {
        return memoization_state.caching_state_remove_function_results_with_args($psp_sub_categories_caching_state$.getGlobalValue(), list(target), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_psp_sub_categories(final SubLObject target) {
        return memoization_state.caching_state_remove_function_results_with_args($psp_sub_categories_caching_state$.getGlobalValue(), list(target), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return SET-P
     */
    @LispMethod(comment = "@return SET-P")
    public static final SubLObject psp_sub_categories_internal_alt(SubLObject target) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject core_type = psp_simplify_if_frame_specific_type(target);
                SubLObject category = psp_rewrite(core_type);
                SubLObject ans = set.new_set(symbol_function(EQUAL), $int$32);
                if (NIL != forts.fort_p(category)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            {
                                SubLObject cdolist_list_var = genls.all_specs(category, UNPROVIDED, UNPROVIDED);
                                SubLObject spec = NIL;
                                for (spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec = cdolist_list_var.first()) {
                                    spec = psp_simplify_if_frame_specific_type(spec);
                                    set.set_add(spec, ans);
                                    if (NIL != nart_handles.nart_p(spec)) {
                                        set.set_add(function_terms.nart_to_naut(spec), ans);
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                set.set_add(target, ans);
                if (NIL != possibly_naut_p(core_type)) {
                    {
                        SubLObject nart = function_terms.naut_to_nart(core_type);
                        if (NIL != nart_handles.nart_p(nart)) {
                            set.set_add(nart, ans);
                        }
                    }
                }
                if (NIL != possibly_naut_p(target)) {
                    {
                        SubLObject nart = function_terms.naut_to_nart(target);
                        if (NIL != nart_handles.nart_p(nart)) {
                            set.set_add(nart, ans);
                        }
                    }
                }
                if (NIL != nart_handles.nart_p(target)) {
                    set.set_add(function_terms.nart_to_naut(target), ans);
                }
                set.set_add(core_type, ans);
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return SET-P
     */
    @LispMethod(comment = "@return SET-P")
    public static SubLObject psp_sub_categories_internal(final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject core_type = psp_simplify_if_frame_specific_type(target);
        final SubLObject category = psp_rewrite(core_type);
        final SubLObject ans = set.new_set(symbol_function(EQUAL), $int$32);
        if (NIL != forts.fort_p(category)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                SubLObject cdolist_list_var = genls.all_specs(category, UNPROVIDED, UNPROVIDED);
                SubLObject spec = NIL;
                spec = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    spec = psp_simplify_if_frame_specific_type(spec);
                    set.set_add(spec, ans);
                    if (NIL != nart_handles.nart_p(spec)) {
                        set.set_add(function_terms.nart_to_naut(spec), ans);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    spec = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        set.set_add(target, ans);
        if (NIL != possibly_naut_p(core_type)) {
            final SubLObject nart = function_terms.naut_to_nart(core_type);
            if (NIL != nart_handles.nart_p(nart)) {
                set.set_add(nart, ans);
            }
        }
        if (NIL != possibly_naut_p(target)) {
            final SubLObject nart = function_terms.naut_to_nart(target);
            if (NIL != nart_handles.nart_p(nart)) {
                set.set_add(nart, ans);
            }
        }
        if (NIL != nart_handles.nart_p(target)) {
            set.set_add(function_terms.nart_to_naut(target), ans);
        }
        set.set_add(core_type, ans);
        return ans;
    }

    public static final SubLObject psp_sub_categories_alt(SubLObject target) {
        {
            SubLObject caching_state = $psp_sub_categories_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PSP_SUB_CATEGORIES, $psp_sub_categories_caching_state$, NIL, EQUAL, ONE_INTEGER, $int$128);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, target, $kw85$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw85$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(psp_sub_categories_internal(target)));
                    memoization_state.caching_state_put(caching_state, target, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject psp_sub_categories(final SubLObject target) {
        SubLObject caching_state = $psp_sub_categories_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PSP_SUB_CATEGORIES, $psp_sub_categories_caching_state$, NIL, EQUAL, ONE_INTEGER, $int$128);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, target, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(psp_sub_categories_internal(target)));
            memoization_state.caching_state_put(caching_state, target, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject psp_simplify_if_frame_specific_type_alt(SubLObject type) {
        return NIL != psp_frame_specific_constituent_typeP(type) ? ((SubLObject) (cycl_utilities.nat_arg1(type, UNPROVIDED))) : type;
    }

    public static SubLObject psp_simplify_if_frame_specific_type(final SubLObject type) {
        return NIL != psp_frame_specific_constituent_typeP(type) ? cycl_utilities.nat_arg1(type, UNPROVIDED) : type;
    }

    public static final SubLObject clear_psp_sub_pos_preds_alt() {
        {
            SubLObject cs = $psp_sub_pos_preds_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_psp_sub_pos_preds() {
        final SubLObject cs = $psp_sub_pos_preds_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_psp_sub_pos_preds_alt(SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($psp_sub_pos_preds_caching_state$.getGlobalValue(), list(target, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_psp_sub_pos_preds(final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($psp_sub_pos_preds_caching_state$.getGlobalValue(), list(target, mt), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return SET-P
     */
    @LispMethod(comment = "@return SET-P")
    public static final SubLObject psp_sub_pos_preds_internal_alt(SubLObject target, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = set.new_set(symbol_function(EQ), $int$64);
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject cdolist_list_var = genl_predicates.all_spec_predicates(target, UNPROVIDED, UNPROVIDED);
                            SubLObject spec_pred = NIL;
                            for (spec_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_pred = cdolist_list_var.first()) {
                                set.set_add(spec_pred, ans);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return SET-P
     */
    @LispMethod(comment = "@return SET-P")
    public static SubLObject psp_sub_pos_preds_internal(final SubLObject target, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ans = set.new_set(symbol_function(EQ), $int$64);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = genl_predicates.all_spec_predicates(target, UNPROVIDED, UNPROVIDED);
            SubLObject spec_pred = NIL;
            spec_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                set.set_add(spec_pred, ans);
                cdolist_list_var = cdolist_list_var.rest();
                spec_pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject psp_sub_pos_preds_alt(SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        {
            SubLObject caching_state = $psp_sub_pos_preds_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PSP_SUB_POS_PREDS, $psp_sub_pos_preds_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$128);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(target, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw85$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (target.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(psp_sub_pos_preds_internal(target, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(target, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject psp_sub_pos_preds(final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        SubLObject caching_state = $psp_sub_pos_preds_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PSP_SUB_POS_PREDS, $psp_sub_pos_preds_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$128);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(target, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (target.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(psp_sub_pos_preds_internal(target, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(target, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject clear_psp_frame_type_instances_alt() {
        {
            SubLObject cs = $psp_frame_type_instances_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_psp_frame_type_instances() {
        final SubLObject cs = $psp_frame_type_instances_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_psp_frame_type_instances_alt(SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($psp_frame_type_instances_caching_state$.getGlobalValue(), list(target, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_psp_frame_type_instances(final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args($psp_frame_type_instances_caching_state$.getGlobalValue(), list(target, mt), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return SET-P
     */
    @LispMethod(comment = "@return SET-P")
    public static final SubLObject psp_frame_type_instances_internal_alt(SubLObject target, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = set.new_set(symbol_function(EQUAL), $int$64);
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject cdolist_list_var = isa.all_fort_instances(target, UNPROVIDED, UNPROVIDED);
                            SubLObject frame = NIL;
                            for (frame = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , frame = cdolist_list_var.first()) {
                                set.set_add(frame, ans);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return SET-P
     */
    @LispMethod(comment = "@return SET-P")
    public static SubLObject psp_frame_type_instances_internal(final SubLObject target, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ans = set.new_set(symbol_function(EQUAL), $int$64);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = isa.all_fort_instances(target, UNPROVIDED, UNPROVIDED);
            SubLObject frame = NIL;
            frame = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                set.set_add(frame, ans);
                cdolist_list_var = cdolist_list_var.rest();
                frame = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject psp_frame_type_instances_alt(SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        {
            SubLObject caching_state = $psp_frame_type_instances_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PSP_FRAME_TYPE_INSTANCES, $psp_frame_type_instances_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$128);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(target, mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw85$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (target.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(psp_frame_type_instances_internal(target, mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(target, mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject psp_frame_type_instances(final SubLObject target, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        SubLObject caching_state = $psp_frame_type_instances_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PSP_FRAME_TYPE_INSTANCES, $psp_frame_type_instances_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$128);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(target, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (target.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(psp_frame_type_instances_internal(target, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(target, mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject clear_psp_rewrite_alt() {
        {
            SubLObject cs = $psp_rewrite_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_psp_rewrite() {
        final SubLObject cs = $psp_rewrite_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_psp_rewrite_alt(SubLObject obj) {
        return memoization_state.caching_state_remove_function_results_with_args($psp_rewrite_caching_state$.getGlobalValue(), list(obj), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_psp_rewrite(final SubLObject obj) {
        return memoization_state.caching_state_remove_function_results_with_args($psp_rewrite_caching_state$.getGlobalValue(), list(obj), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject psp_rewrite_internal_alt(SubLObject obj) {
        if (NIL != term.nautP(obj, UNPROVIDED)) {
            {
                SubLObject nart = narts_high.find_nart(obj);
                obj = (NIL != nart) ? ((SubLObject) (nart)) : obj;
            }
        }
        if (NIL == nart_handles.nart_p(obj)) {
            return obj;
        }
        {
            SubLObject rewrite = kb_mapping_utilities.fpred_value_in_any_mt(obj, $$rewriteOf, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
            return NIL != rewrite ? ((SubLObject) (rewrite)) : obj;
        }
    }

    public static SubLObject psp_rewrite_internal(SubLObject obj) {
        if (NIL != term.nautP(obj, UNPROVIDED)) {
            final SubLObject nart = narts_high.find_nart(obj);
            obj = (NIL != nart) ? nart : obj;
        }
        if (NIL == nart_handles.nart_p(obj)) {
            return obj;
        }
        final SubLObject rewrite = kb_mapping_utilities.fpred_value_in_any_mt(obj, $$rewriteOf, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
        return NIL != rewrite ? rewrite : obj;
    }

    public static final SubLObject psp_rewrite_alt(SubLObject obj) {
        {
            SubLObject caching_state = $psp_rewrite_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PSP_REWRITE, $psp_rewrite_caching_state$, NIL, EQUAL, ONE_INTEGER, $int$256);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, $kw85$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw85$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(psp_rewrite_internal(obj)));
                    memoization_state.caching_state_put(caching_state, obj, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject psp_rewrite(final SubLObject obj) {
        SubLObject caching_state = $psp_rewrite_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PSP_REWRITE, $psp_rewrite_caching_state$, NIL, EQUAL, ONE_INTEGER, $int$256);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(psp_rewrite_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject psp_isaP_internal_alt(SubLObject obj, SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = at_defns.quick_quiet_has_typeP(parsing_utilities.strip_nl_tags(obj, UNPROVIDED), col, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject psp_isaP_internal(final SubLObject obj, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = at_defns.quick_quiet_has_typeP(parsing_utilities.strip_nl_tags(obj, UNPROVIDED), col, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject psp_isaP_alt(SubLObject obj, SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_isaP_internal(obj, col);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym148$PSP_ISA_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym148$PSP_ISA_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym148$PSP_ISA_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(obj, col);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw85$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (obj.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && col.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_isaP_internal(obj, col)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(obj, col));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject psp_isaP(final SubLObject obj, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_isaP_internal(obj, col);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym146$PSP_ISA_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym146$PSP_ISA_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym146$PSP_ISA_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(obj, col);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (obj.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && col.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(psp_isaP_internal(obj, col)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(obj, col));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject psp_genlP_internal_alt(SubLObject type1, SubLObject type2) {
        return rbp_wff.npp_genlP(type1, type2, UNPROVIDED);
    }

    public static SubLObject psp_genlP_internal(final SubLObject type1, final SubLObject type2) {
        return rbp_wff.npp_genlP(type1, type2, UNPROVIDED);
    }

    public static final SubLObject psp_genlP_alt(SubLObject type1, SubLObject type2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return psp_genlP_internal(type1, type2);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym149$PSP_GENL_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym149$PSP_GENL_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym149$PSP_GENL_, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(type1, type2);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw85$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (type1.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && type2.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(psp_genlP_internal(type1, type2)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(type1, type2));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject psp_genlP(final SubLObject type1, final SubLObject type2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return psp_genlP_internal(type1, type2);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym147$PSP_GENL_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym147$PSP_GENL_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym147$PSP_GENL_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(type1, type2);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (type1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && type2.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(psp_genlP_internal(type1, type2)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(type1, type2));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @param RULE;
     * 		the PSP-RULE used to make the new phrase.
     * @param FRAME;
     * 		the #$SubcategorizationFrame of the first daughter, or NIL.
     * @return LISTP of lists of constraints on daughters after the first daughter,
    or :UNKNOWN.
     */
    @LispMethod(comment = "@param RULE;\r\n\t\tthe PSP-RULE used to make the new phrase.\r\n@param FRAME;\r\n\t\tthe #$SubcategorizationFrame of the first daughter, or NIL.\r\n@return LISTP of lists of constraints on daughters after the first daughter,\r\nor :UNKNOWN.")
    public static final SubLObject psp_rule_new_dtr_constraints_alt(SubLObject rule, SubLObject frame) {
        if (NIL != psp_rule_arity(rule)) {
            {
                SubLObject new_dtr_constraint_stack = NIL;
                SubLObject cdotimes_end_var = psp_rule_arity(rule);
                SubLObject n = NIL;
                for (n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                    if (!n.isZero()) {
                        new_dtr_constraint_stack = cons(psp_constraints_on_dtr(number_utilities.f_1X(n), psp_rule_constraints(rule)), new_dtr_constraint_stack);
                    }
                }
                return reverse(new_dtr_constraint_stack);
            }
        } else {
            return NIL != frame ? ((SubLObject) (psp_new_dtr_constraints_from_frame(frame))) : NIL;
        }
    }

    /**
     *
     *
     * @param RULE;
     * 		the PSP-RULE used to make the new phrase.
     * @param FRAME;
     * 		the #$SubcategorizationFrame of the first daughter, or NIL.
     * @return LISTP of lists of constraints on daughters after the first daughter,
    or :UNKNOWN.
     */
    @LispMethod(comment = "@param RULE;\r\n\t\tthe PSP-RULE used to make the new phrase.\r\n@param FRAME;\r\n\t\tthe #$SubcategorizationFrame of the first daughter, or NIL.\r\n@return LISTP of lists of constraints on daughters after the first daughter,\r\nor :UNKNOWN.")
    public static SubLObject psp_rule_new_dtr_constraints(final SubLObject rule, final SubLObject frame) {
        if (NIL != psp_rule_arity(rule)) {
            SubLObject new_dtr_constraint_stack = NIL;
            SubLObject cdotimes_end_var;
            SubLObject n;
            for (cdotimes_end_var = psp_rule_arity(rule), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                if (!n.isZero()) {
                    new_dtr_constraint_stack = cons(psp_constraints_on_dtr(number_utilities.f_1X(n), psp_rule_constraints(rule)), new_dtr_constraint_stack);
                }
            }
            return reverse(new_dtr_constraint_stack);
        }
        return NIL != frame ? psp_new_dtr_constraints_from_frame(frame) : NIL;
    }

    /**
     *
     *
     * @unknown This could stand to be cached, but it's not terribly slow.
     */
    @LispMethod(comment = "@unknown This could stand to be cached, but it\'s not terribly slow.")
    public static final SubLObject psp_new_dtr_constraints_from_frame_alt(SubLObject frame) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (frame == $UNKNOWN) {
                return $UNKNOWN;
            }
            {
                SubLObject active_frame = (NIL != psp_chart.psp_passive_frameP(frame)) ? ((SubLObject) (psp_chart.psp_active_frame(frame))) : frame;
                SubLObject ndc_stack = NIL;
                SubLObject v_arity = lexicon_accessors.subcat_frame_arity(active_frame);
                SubLObject ndc_alist = NIL;
                if (v_arity.isInteger()) {
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_utilities.psp_lexicon_root_mt(UNPROVIDED));
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                {
                                    SubLObject constraints = psp_constraints_for_frame(active_frame);
                                    SubLObject cdolist_list_var = constraints;
                                    SubLObject active_constraint = NIL;
                                    for (active_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , active_constraint = cdolist_list_var.first()) {
                                        {
                                            SubLObject datum = active_constraint;
                                            SubLObject current = datum;
                                            SubLObject n = NIL;
                                            SubLObject target = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt150);
                                            n = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt150);
                                            target = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                {
                                                    SubLObject constraint = NIL;
                                                    SubLObject existing = assoc(n, ndc_alist, UNPROVIDED, UNPROVIDED);
                                                    if (NIL != lexicon_accessors.speech_part_predP(target, UNPROVIDED)) {
                                                        constraint = psp_new_constraint($$POSPredConstraintFn, psp_sub_pos_preds(target, UNPROVIDED));
                                                    } else {
                                                        constraint = psp_new_constraint($$ConstituentTypeConstraintFn, psp_sub_categories(target));
                                                    }
                                                    ndc_alist = delete(existing, ndc_alist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    if (NIL != existing) {
                                                        if (NIL == subl_promotions.memberP(constraint, existing.rest(), $sym151$PSP_SPEC_CONST_CONSTRAINT_, UNPROVIDED)) {
                                                            rplacd(existing, cons(constraint, existing.rest()));
                                                        }
                                                    } else {
                                                        existing = cons(n, list(constraint));
                                                    }
                                                    ndc_alist = cons(existing, ndc_alist);
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt150);
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
                    }
                    {
                        SubLObject n = NIL;
                        for (n = ZERO_INTEGER; n.numL(v_arity); n = add(n, ONE_INTEGER)) {
                            if (NIL == psp_passivized_dtrP(n, frame)) {
                                ndc_stack = cons(assoc(number_utilities.f_1X(n), ndc_alist, UNPROVIDED, UNPROVIDED).rest(), ndc_stack);
                            }
                        }
                    }
                }
                if ((NIL != psp_chart.psp_passive_frameP(frame)) && (frame.first() == $PASSIVE_WITH_BY)) {
                    ndc_stack = psp_add_by_phrase_constraints(ndc_stack);
                }
                return reverse(ndc_stack);
            }
        }
    }

    /**
     *
     *
     * @unknown This could stand to be cached, but it's not terribly slow.
     */
    @LispMethod(comment = "@unknown This could stand to be cached, but it\'s not terribly slow.")
    public static SubLObject psp_new_dtr_constraints_from_frame(final SubLObject frame) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (frame == $UNKNOWN) {
            return $UNKNOWN;
        }
        final SubLObject active_frame = (NIL != psp_chart.psp_passive_frameP(frame)) ? psp_chart.psp_active_frame(frame) : frame;
        SubLObject ndc_stack = NIL;
        final SubLObject v_arity = lexicon_accessors.subcat_frame_arity(active_frame);
        SubLObject ndc_alist = NIL;
        if (v_arity.isInteger()) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_utilities.psp_lexicon_root_mt(UNPROVIDED));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var;
                final SubLObject constraints = cdolist_list_var = psp_constraints_for_frame(active_frame);
                SubLObject active_constraint = NIL;
                active_constraint = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = active_constraint;
                    SubLObject n = NIL;
                    SubLObject target = NIL;
                    destructuring_bind_must_consp(current, datum, $list148);
                    n = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list148);
                    target = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject constraint = NIL;
                        SubLObject existing = assoc(n, ndc_alist, UNPROVIDED, UNPROVIDED);
                        if (NIL != lexicon_accessors.speech_part_predP(target, UNPROVIDED)) {
                            constraint = psp_new_constraint($$POSPredConstraintFn, psp_sub_pos_preds(target, UNPROVIDED));
                        } else {
                            constraint = psp_new_constraint($$ConstituentTypeConstraintFn, psp_sub_categories(target));
                        }
                        ndc_alist = delete(existing, ndc_alist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != existing) {
                            if (NIL == subl_promotions.memberP(constraint, existing.rest(), $sym149$PSP_SPEC_CONST_CONSTRAINT_, UNPROVIDED)) {
                                rplacd(existing, cons(constraint, existing.rest()));
                            }
                        } else {
                            existing = cons(n, list(constraint));
                        }
                        ndc_alist = cons(existing, ndc_alist);
                    } else {
                        cdestructuring_bind_error(datum, $list148);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    active_constraint = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            SubLObject n2;
            for (n2 = NIL, n2 = ZERO_INTEGER; n2.numL(v_arity); n2 = add(n2, ONE_INTEGER)) {
                if (NIL == psp_passivized_dtrP(n2, frame)) {
                    ndc_stack = cons(assoc(number_utilities.f_1X(n2), ndc_alist, UNPROVIDED, UNPROVIDED).rest(), ndc_stack);
                }
            }
        }
        if ((NIL != psp_chart.psp_passive_frameP(frame)) && (frame.first() == $PASSIVE_WITH_BY)) {
            ndc_stack = psp_add_by_phrase_constraints(ndc_stack);
        }
        return reverse(ndc_stack);
    }

    public static final SubLObject psp_add_by_phrase_constraints_alt(SubLObject stack) {
        stack = cons(list(list($$ConstituentTypeConstraintFn, psp_sub_categories($list_alt153))), stack);
        stack = cons(list(list($$ConstituentTypeConstraintFn, psp_sub_categories($$NounPhrase))), stack);
        return stack;
    }

    public static SubLObject psp_add_by_phrase_constraints(SubLObject stack) {
        stack = cons(list(list($$ConstituentTypeConstraintFn, psp_sub_categories($list151))), stack);
        stack = cons(list(list($$ConstituentTypeConstraintFn, psp_sub_categories($$NounPhrase))), stack);
        return stack;
    }

    /**
     *
     *
     * @param FRAME;
     * 		a possibly-passive subcat frame.
     * @return BOOLEAN; Is the Nth daughter for FRAME the one that gets passivized?
     */
    @LispMethod(comment = "@param FRAME;\r\n\t\ta possibly-passive subcat frame.\r\n@return BOOLEAN; Is the Nth daughter for FRAME the one that gets passivized?")
    public static final SubLObject psp_passivized_dtrP_alt(SubLObject n, SubLObject frame) {
        if (!((n.isInteger() && n.numL(TWO_INTEGER)) && (NIL != psp_chart.psp_passive_frameP(frame)))) {
            return NIL;
        }
        {
            SubLObject active_frame = psp_chart.psp_active_frame(frame);
            SubLObject dtr_num = psp_chart.psp_passivized_dtr_num(active_frame, UNPROVIDED);
            return dtr_num.isInteger() ? ((SubLObject) (numE(n, subtract(dtr_num, TWO_INTEGER)))) : NIL;
        }
    }

    /**
     *
     *
     * @param FRAME;
     * 		a possibly-passive subcat frame.
     * @return BOOLEAN; Is the Nth daughter for FRAME the one that gets passivized?
     */
    @LispMethod(comment = "@param FRAME;\r\n\t\ta possibly-passive subcat frame.\r\n@return BOOLEAN; Is the Nth daughter for FRAME the one that gets passivized?")
    public static SubLObject psp_passivized_dtrP(final SubLObject n, final SubLObject frame) {
        if (((!n.isInteger()) || (!n.numL(TWO_INTEGER))) || (NIL == psp_chart.psp_passive_frameP(frame))) {
            return NIL;
        }
        final SubLObject active_frame = psp_chart.psp_active_frame(frame);
        final SubLObject dtr_num = psp_chart.psp_passivized_dtr_num(active_frame, UNPROVIDED);
        return dtr_num.isInteger() ? numE(n, subtract(dtr_num, TWO_INTEGER)) : NIL;
    }

    /**
     *
     *
     * @return LISTP of (<type> <target>) pairs.
     */
    @LispMethod(comment = "@return LISTP of (<type> <target>) pairs.")
    public static final SubLObject psp_constraints_for_frame_alt(SubLObject frame) {
        {
            SubLObject pairs = kb_mapping_utilities.pred_value_tuples(frame, $$subcatFrameDependentConstraint, ONE_INTEGER, $list_alt156, UNPROVIDED);
            if ((NIL != nart_handles.nart_p(frame)) && (cycl_utilities.nat_function(frame) == $$PPCompFrameFn)) {
                {
                    SubLObject wu = cycl_utilities.nat_arg2(frame, UNPROVIDED);
                    SubLObject pcase_var = cycl_utilities.nat_arg1(frame, UNPROVIDED);
                    if (pcase_var.eql($$TransitivePPFrameType)) {
                        pairs = cons(list(ONE_INTEGER, list($$SubcollectionOfWithRelationToFn, $$NLWordForm, $$lexemeOfWordForm, wu)), pairs);
                    } else {
                        if (pcase_var.eql($$DitransitivePPFrameType)) {
                            pairs = cons(list(TWO_INTEGER, list($$SubcollectionOfWithRelationToFn, $$NLWordForm, $$lexemeOfWordForm, wu)), pairs);
                        }
                    }
                }
            }
            return pairs;
        }
    }

    /**
     *
     *
     * @return LISTP of (<type> <target>) pairs.
     */
    @LispMethod(comment = "@return LISTP of (<type> <target>) pairs.")
    public static SubLObject psp_constraints_for_frame(final SubLObject frame) {
        SubLObject pairs = kb_mapping_utilities.pred_value_tuples(frame, $$subcatFrameDependentConstraint, ONE_INTEGER, $list154, UNPROVIDED);
        if ((NIL != nart_handles.nart_p(frame)) && cycl_utilities.nat_function(frame).eql($$PPCompFrameFn)) {
            final SubLObject wu = cycl_utilities.nat_arg2(frame, UNPROVIDED);
            final SubLObject pcase_var = cycl_utilities.nat_arg1(frame, UNPROVIDED);
            if (pcase_var.eql($$TransitivePPFrameType)) {
                pairs = cons(list(ONE_INTEGER, list($$SubcollectionOfWithRelationToFn, $$NLWordForm, $$lexemeOfWordForm, wu)), pairs);
            } else
                if (pcase_var.eql($$DitransitivePPFrameType)) {
                    pairs = cons(list(TWO_INTEGER, list($$SubcollectionOfWithRelationToFn, $$NLWordForm, $$lexemeOfWordForm, wu)), pairs);
                }

        }
        return pairs;
    }

    /**
     *
     *
     * @return BOOLEAN; Is C1 subsumed by C2?
     */
    @LispMethod(comment = "@return BOOLEAN; Is C1 subsumed by C2?")
    public static final SubLObject psp_spec_const_constraintP_alt(SubLObject c1, SubLObject c2) {
        {
            SubLObject datum = c1;
            SubLObject current = datum;
            SubLObject c1_type = NIL;
            SubLObject c1_target = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt163);
            c1_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt163);
            c1_target = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject datum_44 = c2;
                    SubLObject current_45 = datum_44;
                    SubLObject c2_type = NIL;
                    SubLObject c2_target = NIL;
                    destructuring_bind_must_consp(current_45, datum_44, $list_alt164);
                    c2_type = current_45.first();
                    current_45 = current_45.rest();
                    destructuring_bind_must_consp(current_45, datum_44, $list_alt164);
                    c2_target = current_45.first();
                    current_45 = current_45.rest();
                    if (NIL == current_45) {
                        return makeBoolean((c1_type == c2_type) && (NIL != set_utilities.set_subsetP(c1_target, c2_target)));
                    } else {
                        cdestructuring_bind_error(datum_44, $list_alt164);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt163);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return BOOLEAN; Is C1 subsumed by C2?
     */
    @LispMethod(comment = "@return BOOLEAN; Is C1 subsumed by C2?")
    public static SubLObject psp_spec_const_constraintP(final SubLObject c1, final SubLObject c2) {
        SubLObject c1_type = NIL;
        SubLObject c1_target = NIL;
        destructuring_bind_must_consp(c1, c1, $list161);
        c1_type = c1.first();
        SubLObject current = c1.rest();
        destructuring_bind_must_consp(current, c1, $list161);
        c1_target = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject c2_type = NIL;
            SubLObject c2_target = NIL;
            destructuring_bind_must_consp(c2, c2, $list162);
            c2_type = c2.first();
            SubLObject current_$46 = c2.rest();
            destructuring_bind_must_consp(current_$46, c2, $list162);
            c2_target = current_$46.first();
            current_$46 = current_$46.rest();
            if (NIL == current_$46) {
                return makeBoolean(c1_type.eql(c2_type) && (NIL != set_utilities.set_subsetP(c1_target, c2_target)));
            }
            cdestructuring_bind_error(c2, $list162);
        } else {
            cdestructuring_bind_error(c1, $list161);
        }
        return NIL;
    }

    /**
     *
     *
     * @return LISTP of #$SubcategorizationFrame or NIL; the constraint on the frame of daughter N.
     */
    @LispMethod(comment = "@return LISTP of #$SubcategorizationFrame or NIL; the constraint on the frame of daughter N.")
    public static final SubLObject psp_find_dtr_frame_type_alt(SubLObject rule, SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_type = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject rule_fort = psp_rule_fort(rule);
                            SubLObject raw_constraints = kb_mapping_utilities.pred_values(rule_fort, $$psRuleConstraint, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL == frame_type) {
                                {
                                    SubLObject csome_list_var = raw_constraints;
                                    SubLObject constraint = NIL;
                                    for (constraint = csome_list_var.first(); !((NIL != frame_type) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , constraint = csome_list_var.first()) {
                                        if (cycl_utilities.nat_arg1(constraint, UNPROVIDED).eql(n) && (NIL != psp_frame_specific_raw_constraintP(constraint))) {
                                            frame_type = psp_frame_type_from_constituent_type(cycl_utilities.nat_arg2(constraint, UNPROVIDED));
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
                return frame_type;
            }
        }
    }

    /**
     *
     *
     * @return LISTP of #$SubcategorizationFrame or NIL; the constraint on the frame of daughter N.
     */
    @LispMethod(comment = "@return LISTP of #$SubcategorizationFrame or NIL; the constraint on the frame of daughter N.")
    public static SubLObject psp_find_dtr_frame_type(final SubLObject rule, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject frame_type = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$psp_rule_lookup_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject rule_fort = psp_rule_fort(rule);
            final SubLObject raw_constraints = kb_mapping_utilities.pred_values(rule_fort, $$psRuleConstraint, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == frame_type) {
                SubLObject csome_list_var = raw_constraints;
                SubLObject constraint = NIL;
                constraint = csome_list_var.first();
                while ((NIL == frame_type) && (NIL != csome_list_var)) {
                    if (cycl_utilities.nat_arg1(constraint, UNPROVIDED).eql(n) && (NIL != psp_frame_specific_raw_constraintP(constraint))) {
                        frame_type = psp_frame_type_from_constituent_type(cycl_utilities.nat_arg2(constraint, UNPROVIDED));
                    }
                    csome_list_var = csome_list_var.rest();
                    constraint = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return frame_type;
    }

    /**
     *
     *
     * @return LISTP; of rules and lexical strings used to build EDGE,
    nested to reflect phrase structure.
     */
    @LispMethod(comment = "@return LISTP; of rules and lexical strings used to build EDGE,\r\nnested to reflect phrase structure.")
    public static final SubLObject psp_parse_tree_for_edge_alt(SubLObject edge) {
        if (NIL != psp_chart.psp_phrasal_edgeP(edge)) {
            return cons(psp_chart.psp_edge_rule_fort(edge), Mapping.mapcar(PSP_PARSE_TREE_FOR_EDGE, psp_chart.psp_edge_dtrs(edge)));
        } else {
            return list(psp_chart.get_psp_edge_category(edge), psp_chart.get_psp_edge_string(edge));
        }
    }

    /**
     *
     *
     * @return LISTP; of rules and lexical strings used to build EDGE,
    nested to reflect phrase structure.
     */
    @LispMethod(comment = "@return LISTP; of rules and lexical strings used to build EDGE,\r\nnested to reflect phrase structure.")
    public static SubLObject psp_parse_tree_for_edge(final SubLObject edge) {
        if (NIL != psp_chart.psp_phrasal_edgeP(edge)) {
            return cons(psp_chart.psp_edge_rule_fort(edge), Mapping.mapcar(PSP_PARSE_TREE_FOR_EDGE, psp_chart.psp_edge_dtrs(edge)));
        }
        return list(psp_chart.get_psp_edge_category(edge), psp_chart.get_psp_edge_string(edge));
    }

    public static final SubLObject clear_psp_rules_caches_alt() {
        clear_psp_cycl_fails_constraintP();
        clear_psp_sub_categories();
        clear_psp_sub_pos_preds();
        clear_psp_phrase_types();
        clear_psp_rewrite();
        clear_psp_syntactic_constraint_types();
        clear_psp_semantic_constraint_types();
        return NIL;
    }

    public static SubLObject clear_psp_rules_caches() {
        clear_psp_cycl_fails_constraintP();
        clear_psp_sub_categories();
        clear_psp_sub_pos_preds();
        clear_psp_phrase_types();
        clear_psp_rewrite();
        clear_psp_syntactic_constraint_types();
        clear_psp_semantic_constraint_types();
        return NIL;
    }

    public static final SubLObject declare_psp_rules_file_alt() {
        declareFunction("phrase_structure_parser_rule_print_function_trampoline", "PHRASE-STRUCTURE-PARSER-RULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("phrase_structure_parser_rule_p", "PHRASE-STRUCTURE-PARSER-RULE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.psp_rules.$phrase_structure_parser_rule_p$UnaryFunction();
        declareFunction("psp_rule_fort", "PSP-RULE-FORT", 1, 0, false);
        declareFunction("psp_rule_arity", "PSP-RULE-ARITY", 1, 0, false);
        declareFunction("psp_rule_category", "PSP-RULE-CATEGORY", 1, 0, false);
        declareFunction("psp_rule_head", "PSP-RULE-HEAD", 1, 0, false);
        declareFunction("psp_rule_constraints", "PSP-RULE-CONSTRAINTS", 1, 0, false);
        declareFunction("psp_rule_semx", "PSP-RULE-SEMX", 1, 0, false);
        declareFunction("psp_rule_weight", "PSP-RULE-WEIGHT", 1, 0, false);
        declareFunction("_csetf_psp_rule_fort", "_CSETF-PSP-RULE-FORT", 2, 0, false);
        declareFunction("_csetf_psp_rule_arity", "_CSETF-PSP-RULE-ARITY", 2, 0, false);
        declareFunction("_csetf_psp_rule_category", "_CSETF-PSP-RULE-CATEGORY", 2, 0, false);
        declareFunction("_csetf_psp_rule_head", "_CSETF-PSP-RULE-HEAD", 2, 0, false);
        declareFunction("_csetf_psp_rule_constraints", "_CSETF-PSP-RULE-CONSTRAINTS", 2, 0, false);
        declareFunction("_csetf_psp_rule_semx", "_CSETF-PSP-RULE-SEMX", 2, 0, false);
        declareFunction("_csetf_psp_rule_weight", "_CSETF-PSP-RULE-WEIGHT", 2, 0, false);
        declareFunction("make_phrase_structure_parser_rule", "MAKE-PHRASE-STRUCTURE-PARSER-RULE", 0, 1, false);
        declareFunction("pprint_psp_rule", "PPRINT-PSP-RULE", 1, 2, false);
        declareFunction("new_psp_rule", "NEW-PSP-RULE", 0, 7, false);
        declareFunction("psp_new_constraints", "PSP-NEW-CONSTRAINTS", 0, 0, false);
        declareFunction("psp_constraints_on_dtr", "PSP-CONSTRAINTS-ON-DTR", 2, 0, false);
        declareFunction("psp_new_constraint", "PSP-NEW-CONSTRAINT", 2, 0, false);
        declareFunction("psp_constraint_type", "PSP-CONSTRAINT-TYPE", 1, 0, false);
        declareFunction("psp_constraint_target", "PSP-CONSTRAINT-TARGET", 1, 0, false);
        declareMacro("psp_destructure_constraint", "PSP-DESTRUCTURE-CONSTRAINT");
        declareFunction("psp_rules", "PSP-RULES", 0, 0, false);
        declareFunction("clear_psp_rules", "CLEAR-PSP-RULES", 0, 0, false);
        declareFunction("add_phrase_structure_rule", "ADD-PHRASE-STRUCTURE-RULE", 2, 0, false);
        declareFunction("remove_phrase_structure_rule", "REMOVE-PHRASE-STRUCTURE-RULE", 2, 0, false);
        declareFunction("initialize_psp_rules", "INITIALIZE-PSP-RULES", 0, 1, false);
        declareFunction("psp_check_initializations", "PSP-CHECK-INITIALIZATIONS", 0, 0, false);
        declareFunction("store_one_psp_rule_fort", "STORE-ONE-PSP-RULE-FORT", 1, 0, false);
        declareFunction("psp_valid_raw_constraintP", "PSP-VALID-RAW-CONSTRAINT?", 1, 0, false);
        declareFunction("psp_get_semx_for_rule_fort", "PSP-GET-SEMX-FOR-RULE-FORT", 1, 0, false);
        declareFunction("psp_binding_expressions_for_rule_fort", "PSP-BINDING-EXPRESSIONS-FOR-RULE-FORT", 1, 0, false);
        declareFunction("psp_rule_fort_weight_factor", "PSP-RULE-FORT-WEIGHT-FACTOR", 1, 1, false);
        declareFunction("psp_explicit_weight_factor_for_rule_fort", "PSP-EXPLICIT-WEIGHT-FACTOR-FOR-RULE-FORT", 1, 0, false);
        declareFunction("psp_rule_fort_weights_internal", "PSP-RULE-FORT-WEIGHTS-INTERNAL", 0, 0, false);
        declareFunction("psp_rule_fort_weights", "PSP-RULE-FORT-WEIGHTS", 0, 0, false);
        declareFunction("psp_rule_weight_factor_from_arity", "PSP-RULE-WEIGHT-FACTOR-FROM-ARITY", 1, 0, false);
        declareFunction("add_psp_rule", "ADD-PSP-RULE", 7, 0, false);
        declareFunction("psp_rule_struct_for_rule_fort", "PSP-RULE-STRUCT-FOR-RULE-FORT", 1, 0, false);
        declareFunction("psp_category_meets_constraintsP", "PSP-CATEGORY-MEETS-CONSTRAINTS?", 2, 0, false);
        declareFunction("psp_parse_constraint", "PSP-PARSE-CONSTRAINT", 1, 0, false);
        declareFunction("psp_frame_specific_raw_constraintP", "PSP-FRAME-SPECIFIC-RAW-CONSTRAINT?", 1, 0, false);
        declareFunction("psp_frame_constraint_from_raw_constraint", "PSP-FRAME-CONSTRAINT-FROM-RAW-CONSTRAINT", 1, 0, false);
        declareFunction("psp_add_derivable_rules", "PSP-ADD-DERIVABLE-RULES", 1, 0, false);
        declareFunction("psp_trace", "PSP-TRACE", 1, 0, false);
        declareFunction("psp_untrace", "PSP-UNTRACE", 0, 1, false);
        declareFunction("psp_traced_ruleP", "PSP-TRACED-RULE?", 1, 0, false);
        declareMacro("psp_trace_report", "PSP-TRACE-REPORT");
        declareMacro("do_psp_trace_report", "DO-PSP-TRACE-REPORT");
        declareFunction("psp_rules_starting_with_edge", "PSP-RULES-STARTING-WITH-EDGE", 1, 1, false);
        declareFunction("psp_rule_could_start_at_indexP", "PSP-RULE-COULD-START-AT-INDEX?", 2, 0, false);
        declareFunction("psp_filter_cycls", "PSP-FILTER-CYCLS", 4, 0, false);
        declareFunction("psp_cyclify_targets", "PSP-CYCLIFY-TARGETS", 2, 0, false);
        declareFunction("psp_edge_passes_semantic_constraintsP", "PSP-EDGE-PASSES-SEMANTIC-CONSTRAINTS?", 1, 0, false);
        declareFunction("psp_edge_meets_syntax_constraintsP", "PSP-EDGE-MEETS-SYNTAX-CONSTRAINTS?", 2, 2, false);
        declareFunction("psp_syntactic_constraintP", "PSP-SYNTACTIC-CONSTRAINT?", 1, 0, false);
        declareFunction("clear_psp_syntactic_constraint_types", "CLEAR-PSP-SYNTACTIC-CONSTRAINT-TYPES", 0, 0, false);
        declareFunction("psp_syntactic_constraint_typeP", "PSP-SYNTACTIC-CONSTRAINT-TYPE?", 1, 0, false);
        declareFunction("psp_semantic_constraintP", "PSP-SEMANTIC-CONSTRAINT?", 1, 0, false);
        declareFunction("clear_psp_semantic_constraint_types", "CLEAR-PSP-SEMANTIC-CONSTRAINT-TYPES", 0, 0, false);
        declareFunction("psp_semantic_constraint_typeP", "PSP-SEMANTIC-CONSTRAINT-TYPE?", 1, 0, false);
        declareFunction("clear_psp_cycl_fails_constraintP", "CLEAR-PSP-CYCL-FAILS-CONSTRAINT?", 0, 0, false);
        declareFunction("remove_psp_cycl_fails_constraintP", "REMOVE-PSP-CYCL-FAILS-CONSTRAINT?", 2, 0, false);
        declareFunction("psp_cycl_fails_constraintP_internal", "PSP-CYCL-FAILS-CONSTRAINT?-INTERNAL", 2, 0, false);
        declareFunction("psp_cycl_fails_constraintP", "PSP-CYCL-FAILS-CONSTRAINT?", 2, 0, false);
        declareFunction("psp_edge_fails_constraintP", "PSP-EDGE-FAILS-CONSTRAINT?", 3, 0, false);
        declareFunction("clear_psp_phrase_types", "CLEAR-PSP-PHRASE-TYPES", 0, 0, false);
        declareFunction("remove_psp_phrase_types", "REMOVE-PSP-PHRASE-TYPES", 0, 1, false);
        declareFunction("psp_phrase_types_internal", "PSP-PHRASE-TYPES-INTERNAL", 1, 0, false);
        declareFunction("psp_phrase_types", "PSP-PHRASE-TYPES", 0, 1, false);
        declareFunction("psp_constraints_require_phraseP_internal", "PSP-CONSTRAINTS-REQUIRE-PHRASE?-INTERNAL", 1, 0, false);
        declareFunction("psp_constraints_require_phraseP", "PSP-CONSTRAINTS-REQUIRE-PHRASE?", 1, 0, false);
        declareFunction("psp_edge_fails_lexeme_constraintP", "PSP-EDGE-FAILS-LEXEME-CONSTRAINT?", 2, 0, false);
        declareFunction("psp_lexeme_constraintP", "PSP-LEXEME-CONSTRAINT?", 1, 0, false);
        declareFunction("psp_frame_specific_constituent_typeP", "PSP-FRAME-SPECIFIC-CONSTITUENT-TYPE?", 1, 0, false);
        declareFunction("psp_frame_type_from_constituent_type", "PSP-FRAME-TYPE-FROM-CONSTITUENT-TYPE", 1, 0, false);
        declareFunction("psp_constraint_target_includesP", "PSP-CONSTRAINT-TARGET-INCLUDES?", 2, 1, false);
        declareFunction("psp_edge_has_wuP", "PSP-EDGE-HAS-WU?", 2, 0, false);
        declareFunction("psp_det_nbar_agreeP", "PSP-DET-NBAR-AGREE?", 3, 0, false);
        declareFunction("clear_psp_det_string_agreement_warn", "CLEAR-PSP-DET-STRING-AGREEMENT-WARN", 0, 0, false);
        declareFunction("remove_psp_det_string_agreement_warn", "REMOVE-PSP-DET-STRING-AGREEMENT-WARN", 1, 0, false);
        declareFunction("psp_det_string_agreement_warn_internal", "PSP-DET-STRING-AGREEMENT-WARN-INTERNAL", 1, 0, false);
        declareFunction("psp_det_string_agreement_warn", "PSP-DET-STRING-AGREEMENT-WARN", 1, 0, false);
        declareFunction("psp_valid_constituent_typeP", "PSP-VALID-CONSTITUENT-TYPE?", 2, 0, false);
        declareFunction("clear_psp_sub_categories", "CLEAR-PSP-SUB-CATEGORIES", 0, 0, false);
        declareFunction("remove_psp_sub_categories", "REMOVE-PSP-SUB-CATEGORIES", 1, 0, false);
        declareFunction("psp_sub_categories_internal", "PSP-SUB-CATEGORIES-INTERNAL", 1, 0, false);
        declareFunction("psp_sub_categories", "PSP-SUB-CATEGORIES", 1, 0, false);
        declareFunction("psp_simplify_if_frame_specific_type", "PSP-SIMPLIFY-IF-FRAME-SPECIFIC-TYPE", 1, 0, false);
        declareFunction("clear_psp_sub_pos_preds", "CLEAR-PSP-SUB-POS-PREDS", 0, 0, false);
        declareFunction("remove_psp_sub_pos_preds", "REMOVE-PSP-SUB-POS-PREDS", 1, 1, false);
        declareFunction("psp_sub_pos_preds_internal", "PSP-SUB-POS-PREDS-INTERNAL", 2, 0, false);
        declareFunction("psp_sub_pos_preds", "PSP-SUB-POS-PREDS", 1, 1, false);
        declareFunction("clear_psp_frame_type_instances", "CLEAR-PSP-FRAME-TYPE-INSTANCES", 0, 0, false);
        declareFunction("remove_psp_frame_type_instances", "REMOVE-PSP-FRAME-TYPE-INSTANCES", 1, 1, false);
        declareFunction("psp_frame_type_instances_internal", "PSP-FRAME-TYPE-INSTANCES-INTERNAL", 2, 0, false);
        declareFunction("psp_frame_type_instances", "PSP-FRAME-TYPE-INSTANCES", 1, 1, false);
        declareFunction("clear_psp_rewrite", "CLEAR-PSP-REWRITE", 0, 0, false);
        declareFunction("remove_psp_rewrite", "REMOVE-PSP-REWRITE", 1, 0, false);
        declareFunction("psp_rewrite_internal", "PSP-REWRITE-INTERNAL", 1, 0, false);
        declareFunction("psp_rewrite", "PSP-REWRITE", 1, 0, false);
        declareFunction("psp_isaP_internal", "PSP-ISA?-INTERNAL", 2, 0, false);
        declareFunction("psp_isaP", "PSP-ISA?", 2, 0, false);
        declareFunction("psp_genlP_internal", "PSP-GENL?-INTERNAL", 2, 0, false);
        declareFunction("psp_genlP", "PSP-GENL?", 2, 0, false);
        declareFunction("psp_rule_new_dtr_constraints", "PSP-RULE-NEW-DTR-CONSTRAINTS", 2, 0, false);
        declareFunction("psp_new_dtr_constraints_from_frame", "PSP-NEW-DTR-CONSTRAINTS-FROM-FRAME", 1, 0, false);
        declareFunction("psp_add_by_phrase_constraints", "PSP-ADD-BY-PHRASE-CONSTRAINTS", 1, 0, false);
        declareFunction("psp_passivized_dtrP", "PSP-PASSIVIZED-DTR?", 2, 0, false);
        declareFunction("psp_constraints_for_frame", "PSP-CONSTRAINTS-FOR-FRAME", 1, 0, false);
        declareFunction("psp_spec_const_constraintP", "PSP-SPEC-CONST-CONSTRAINT?", 2, 0, false);
        declareFunction("psp_vbar_count", "PSP-VBAR-COUNT", 0, 0, false);
        declareFunction("psp_np_count", "PSP-NP-COUNT", 0, 0, false);
        declareFunction("compute_psp_np_count", "COMPUTE-PSP-NP-COUNT", 0, 0, false);
        declareFunction("psp_pp_count", "PSP-PP-COUNT", 0, 1, false);
        declareFunction("psp_perms_for_verb_frame", "PSP-PERMS-FOR-VERB-FRAME", 1, 0, false);
        declareFunction("psp_average_denot_cardinality", "PSP-AVERAGE-DENOT-CARDINALITY", 0, 0, false);
        declareFunction("compute_psp_average_denot_cardinality", "COMPUTE-PSP-AVERAGE-DENOT-CARDINALITY", 0, 0, false);
        declareFunction("psp_determiner_agreement_cardinality", "PSP-DETERMINER-AGREEMENT-CARDINALITY", 1, 0, false);
        declareFunction("psp_derivable_preds_cardinality", "PSP-DERIVABLE-PREDS-CARDINALITY", 1, 0, false);
        declareFunction("psp_find_dtr_frame_type", "PSP-FIND-DTR-FRAME-TYPE", 2, 0, false);
        declareFunction("psp_parse_tree_for_edge", "PSP-PARSE-TREE-FOR-EDGE", 1, 0, false);
        declareFunction("clear_psp_rules_caches", "CLEAR-PSP-RULES-CACHES", 0, 0, false);
        return NIL;
    }

    public static SubLObject declare_psp_rules_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("phrase_structure_parser_rule_print_function_trampoline", "PHRASE-STRUCTURE-PARSER-RULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("phrase_structure_parser_rule_p", "PHRASE-STRUCTURE-PARSER-RULE-P", 1, 0, false);
            new psp_rules.$phrase_structure_parser_rule_p$UnaryFunction();
            declareFunction("psp_rule_fort", "PSP-RULE-FORT", 1, 0, false);
            declareFunction("psp_rule_arity", "PSP-RULE-ARITY", 1, 0, false);
            declareFunction("psp_rule_category", "PSP-RULE-CATEGORY", 1, 0, false);
            declareFunction("psp_rule_head", "PSP-RULE-HEAD", 1, 0, false);
            declareFunction("psp_rule_constraints", "PSP-RULE-CONSTRAINTS", 1, 0, false);
            declareFunction("psp_rule_semx", "PSP-RULE-SEMX", 1, 0, false);
            declareFunction("psp_rule_weight", "PSP-RULE-WEIGHT", 1, 0, false);
            declareFunction("_csetf_psp_rule_fort", "_CSETF-PSP-RULE-FORT", 2, 0, false);
            declareFunction("_csetf_psp_rule_arity", "_CSETF-PSP-RULE-ARITY", 2, 0, false);
            declareFunction("_csetf_psp_rule_category", "_CSETF-PSP-RULE-CATEGORY", 2, 0, false);
            declareFunction("_csetf_psp_rule_head", "_CSETF-PSP-RULE-HEAD", 2, 0, false);
            declareFunction("_csetf_psp_rule_constraints", "_CSETF-PSP-RULE-CONSTRAINTS", 2, 0, false);
            declareFunction("_csetf_psp_rule_semx", "_CSETF-PSP-RULE-SEMX", 2, 0, false);
            declareFunction("_csetf_psp_rule_weight", "_CSETF-PSP-RULE-WEIGHT", 2, 0, false);
            declareFunction("make_phrase_structure_parser_rule", "MAKE-PHRASE-STRUCTURE-PARSER-RULE", 0, 1, false);
            declareFunction("visit_defstruct_phrase_structure_parser_rule", "VISIT-DEFSTRUCT-PHRASE-STRUCTURE-PARSER-RULE", 2, 0, false);
            declareFunction("visit_defstruct_object_phrase_structure_parser_rule_method", "VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-RULE-METHOD", 2, 0, false);
            declareFunction("pprint_psp_rule", "PPRINT-PSP-RULE", 1, 2, false);
            declareFunction("new_psp_rule", "NEW-PSP-RULE", 0, 7, false);
            declareFunction("psp_new_constraints", "PSP-NEW-CONSTRAINTS", 0, 0, false);
            declareFunction("psp_constraints_on_dtr", "PSP-CONSTRAINTS-ON-DTR", 2, 0, false);
            declareFunction("psp_new_constraint", "PSP-NEW-CONSTRAINT", 2, 0, false);
            declareFunction("psp_constraint_type", "PSP-CONSTRAINT-TYPE", 1, 0, false);
            declareFunction("psp_constraint_target", "PSP-CONSTRAINT-TARGET", 1, 0, false);
            declareMacro("psp_destructure_constraint", "PSP-DESTRUCTURE-CONSTRAINT");
            declareFunction("psp_rules", "PSP-RULES", 0, 0, false);
            declareFunction("clear_psp_rules", "CLEAR-PSP-RULES", 0, 0, false);
            declareFunction("add_phrase_structure_rule", "ADD-PHRASE-STRUCTURE-RULE", 2, 0, false);
            declareFunction("remove_phrase_structure_rule", "REMOVE-PHRASE-STRUCTURE-RULE", 2, 0, false);
            declareFunction("initialize_psp_rules", "INITIALIZE-PSP-RULES", 0, 1, false);
            declareFunction("psp_check_initializations", "PSP-CHECK-INITIALIZATIONS", 0, 0, false);
            declareFunction("store_one_psp_rule_fort", "STORE-ONE-PSP-RULE-FORT", 1, 0, false);
            declareFunction("psp_valid_raw_constraintP", "PSP-VALID-RAW-CONSTRAINT?", 1, 0, false);
            declareFunction("psp_get_semx_for_rule_fort", "PSP-GET-SEMX-FOR-RULE-FORT", 1, 0, false);
            declareFunction("psp_binding_expressions_for_rule_fort", "PSP-BINDING-EXPRESSIONS-FOR-RULE-FORT", 1, 0, false);
            declareFunction("psp_rule_fort_weight_factor", "PSP-RULE-FORT-WEIGHT-FACTOR", 1, 1, false);
            declareFunction("psp_explicit_weight_factor_for_rule_fort", "PSP-EXPLICIT-WEIGHT-FACTOR-FOR-RULE-FORT", 1, 0, false);
            declareFunction("psp_rule_fort_weights_internal", "PSP-RULE-FORT-WEIGHTS-INTERNAL", 0, 0, false);
            declareFunction("psp_rule_fort_weights", "PSP-RULE-FORT-WEIGHTS", 0, 0, false);
            declareFunction("psp_rule_weight_factor_from_arity", "PSP-RULE-WEIGHT-FACTOR-FROM-ARITY", 1, 0, false);
            declareFunction("add_psp_rule", "ADD-PSP-RULE", 7, 0, false);
            declareFunction("psp_rule_struct_for_rule_fort", "PSP-RULE-STRUCT-FOR-RULE-FORT", 1, 0, false);
            declareFunction("psp_category_meets_constraintsP", "PSP-CATEGORY-MEETS-CONSTRAINTS?", 2, 0, false);
            declareFunction("psp_parse_constraint", "PSP-PARSE-CONSTRAINT", 1, 0, false);
            declareFunction("psp_frame_specific_raw_constraintP", "PSP-FRAME-SPECIFIC-RAW-CONSTRAINT?", 1, 0, false);
            declareFunction("psp_frame_constraint_from_raw_constraint", "PSP-FRAME-CONSTRAINT-FROM-RAW-CONSTRAINT", 1, 0, false);
            declareFunction("psp_add_derivable_rules", "PSP-ADD-DERIVABLE-RULES", 1, 0, false);
            declareFunction("psp_trace", "PSP-TRACE", 1, 0, false);
            declareFunction("psp_untrace", "PSP-UNTRACE", 0, 1, false);
            declareFunction("psp_traced_ruleP", "PSP-TRACED-RULE?", 1, 0, false);
            declareMacro("psp_trace_report", "PSP-TRACE-REPORT");
            declareMacro("do_psp_trace_report", "DO-PSP-TRACE-REPORT");
            declareFunction("psp_rules_starting_with_edge", "PSP-RULES-STARTING-WITH-EDGE", 1, 1, false);
            declareFunction("psp_rule_could_start_at_indexP", "PSP-RULE-COULD-START-AT-INDEX?", 2, 0, false);
            declareFunction("psp_filter_cycls", "PSP-FILTER-CYCLS", 4, 0, false);
            declareFunction("psp_cyclify_targets", "PSP-CYCLIFY-TARGETS", 2, 0, false);
            declareFunction("psp_edge_passes_semantic_constraintsP", "PSP-EDGE-PASSES-SEMANTIC-CONSTRAINTS?", 1, 0, false);
            declareFunction("psp_edge_meets_syntax_constraintsP", "PSP-EDGE-MEETS-SYNTAX-CONSTRAINTS?", 2, 2, false);
            declareFunction("psp_syntactic_constraintP", "PSP-SYNTACTIC-CONSTRAINT?", 1, 0, false);
            declareFunction("clear_psp_syntactic_constraint_types", "CLEAR-PSP-SYNTACTIC-CONSTRAINT-TYPES", 0, 0, false);
            declareFunction("psp_syntactic_constraint_typeP", "PSP-SYNTACTIC-CONSTRAINT-TYPE?", 1, 0, false);
            declareFunction("psp_semantic_constraintP", "PSP-SEMANTIC-CONSTRAINT?", 1, 0, false);
            declareFunction("clear_psp_semantic_constraint_types", "CLEAR-PSP-SEMANTIC-CONSTRAINT-TYPES", 0, 0, false);
            declareFunction("psp_semantic_constraint_typeP", "PSP-SEMANTIC-CONSTRAINT-TYPE?", 1, 0, false);
            declareFunction("clear_psp_cycl_fails_constraintP", "CLEAR-PSP-CYCL-FAILS-CONSTRAINT?", 0, 0, false);
            declareFunction("remove_psp_cycl_fails_constraintP", "REMOVE-PSP-CYCL-FAILS-CONSTRAINT?", 2, 0, false);
            declareFunction("psp_cycl_fails_constraintP_internal", "PSP-CYCL-FAILS-CONSTRAINT?-INTERNAL", 2, 0, false);
            declareFunction("psp_cycl_fails_constraintP", "PSP-CYCL-FAILS-CONSTRAINT?", 2, 0, false);
            declareFunction("psp_edge_fails_constraintP", "PSP-EDGE-FAILS-CONSTRAINT?", 3, 0, false);
            declareFunction("clear_psp_phrase_types", "CLEAR-PSP-PHRASE-TYPES", 0, 0, false);
            declareFunction("remove_psp_phrase_types", "REMOVE-PSP-PHRASE-TYPES", 0, 1, false);
            declareFunction("psp_phrase_types_internal", "PSP-PHRASE-TYPES-INTERNAL", 1, 0, false);
            declareFunction("psp_phrase_types", "PSP-PHRASE-TYPES", 0, 1, false);
            declareFunction("psp_constraints_require_phraseP_internal", "PSP-CONSTRAINTS-REQUIRE-PHRASE?-INTERNAL", 1, 0, false);
            declareFunction("psp_constraints_require_phraseP", "PSP-CONSTRAINTS-REQUIRE-PHRASE?", 1, 0, false);
            declareFunction("psp_edge_fails_lexeme_constraintP", "PSP-EDGE-FAILS-LEXEME-CONSTRAINT?", 2, 0, false);
            declareFunction("psp_lexeme_constraintP", "PSP-LEXEME-CONSTRAINT?", 1, 0, false);
            declareFunction("psp_frame_specific_constituent_typeP", "PSP-FRAME-SPECIFIC-CONSTITUENT-TYPE?", 1, 0, false);
            declareFunction("psp_frame_type_from_constituent_type", "PSP-FRAME-TYPE-FROM-CONSTITUENT-TYPE", 1, 0, false);
            declareFunction("psp_constraint_target_includesP", "PSP-CONSTRAINT-TARGET-INCLUDES?", 2, 1, false);
            declareFunction("psp_edge_has_wuP", "PSP-EDGE-HAS-WU?", 2, 0, false);
            declareFunction("psp_det_nbar_agreeP", "PSP-DET-NBAR-AGREE?", 3, 0, false);
            declareFunction("psp_valid_constituent_typeP", "PSP-VALID-CONSTITUENT-TYPE?", 2, 0, false);
            declareFunction("clear_psp_sub_categories", "CLEAR-PSP-SUB-CATEGORIES", 0, 0, false);
            declareFunction("remove_psp_sub_categories", "REMOVE-PSP-SUB-CATEGORIES", 1, 0, false);
            declareFunction("psp_sub_categories_internal", "PSP-SUB-CATEGORIES-INTERNAL", 1, 0, false);
            declareFunction("psp_sub_categories", "PSP-SUB-CATEGORIES", 1, 0, false);
            declareFunction("psp_simplify_if_frame_specific_type", "PSP-SIMPLIFY-IF-FRAME-SPECIFIC-TYPE", 1, 0, false);
            declareFunction("clear_psp_sub_pos_preds", "CLEAR-PSP-SUB-POS-PREDS", 0, 0, false);
            declareFunction("remove_psp_sub_pos_preds", "REMOVE-PSP-SUB-POS-PREDS", 1, 1, false);
            declareFunction("psp_sub_pos_preds_internal", "PSP-SUB-POS-PREDS-INTERNAL", 2, 0, false);
            declareFunction("psp_sub_pos_preds", "PSP-SUB-POS-PREDS", 1, 1, false);
            declareFunction("clear_psp_frame_type_instances", "CLEAR-PSP-FRAME-TYPE-INSTANCES", 0, 0, false);
            declareFunction("remove_psp_frame_type_instances", "REMOVE-PSP-FRAME-TYPE-INSTANCES", 1, 1, false);
            declareFunction("psp_frame_type_instances_internal", "PSP-FRAME-TYPE-INSTANCES-INTERNAL", 2, 0, false);
            declareFunction("psp_frame_type_instances", "PSP-FRAME-TYPE-INSTANCES", 1, 1, false);
            declareFunction("clear_psp_rewrite", "CLEAR-PSP-REWRITE", 0, 0, false);
            declareFunction("remove_psp_rewrite", "REMOVE-PSP-REWRITE", 1, 0, false);
            declareFunction("psp_rewrite_internal", "PSP-REWRITE-INTERNAL", 1, 0, false);
            declareFunction("psp_rewrite", "PSP-REWRITE", 1, 0, false);
            declareFunction("psp_isaP_internal", "PSP-ISA?-INTERNAL", 2, 0, false);
            declareFunction("psp_isaP", "PSP-ISA?", 2, 0, false);
            declareFunction("psp_genlP_internal", "PSP-GENL?-INTERNAL", 2, 0, false);
            declareFunction("psp_genlP", "PSP-GENL?", 2, 0, false);
            declareFunction("psp_rule_new_dtr_constraints", "PSP-RULE-NEW-DTR-CONSTRAINTS", 2, 0, false);
            declareFunction("psp_new_dtr_constraints_from_frame", "PSP-NEW-DTR-CONSTRAINTS-FROM-FRAME", 1, 0, false);
            declareFunction("psp_add_by_phrase_constraints", "PSP-ADD-BY-PHRASE-CONSTRAINTS", 1, 0, false);
            declareFunction("psp_passivized_dtrP", "PSP-PASSIVIZED-DTR?", 2, 0, false);
            declareFunction("psp_constraints_for_frame", "PSP-CONSTRAINTS-FOR-FRAME", 1, 0, false);
            declareFunction("psp_spec_const_constraintP", "PSP-SPEC-CONST-CONSTRAINT?", 2, 0, false);
            declareFunction("psp_find_dtr_frame_type", "PSP-FIND-DTR-FRAME-TYPE", 2, 0, false);
            declareFunction("psp_parse_tree_for_edge", "PSP-PARSE-TREE-FOR-EDGE", 1, 0, false);
            declareFunction("clear_psp_rules_caches", "CLEAR-PSP-RULES-CACHES", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("clear_psp_det_string_agreement_warn", "CLEAR-PSP-DET-STRING-AGREEMENT-WARN", 0, 0, false);
            declareFunction("remove_psp_det_string_agreement_warn", "REMOVE-PSP-DET-STRING-AGREEMENT-WARN", 1, 0, false);
            declareFunction("psp_det_string_agreement_warn_internal", "PSP-DET-STRING-AGREEMENT-WARN-INTERNAL", 1, 0, false);
            declareFunction("psp_det_string_agreement_warn", "PSP-DET-STRING-AGREEMENT-WARN", 1, 0, false);
            declareFunction("psp_vbar_count", "PSP-VBAR-COUNT", 0, 0, false);
            declareFunction("psp_np_count", "PSP-NP-COUNT", 0, 0, false);
            declareFunction("compute_psp_np_count", "COMPUTE-PSP-NP-COUNT", 0, 0, false);
            declareFunction("psp_pp_count", "PSP-PP-COUNT", 0, 1, false);
            declareFunction("psp_perms_for_verb_frame", "PSP-PERMS-FOR-VERB-FRAME", 1, 0, false);
            declareFunction("psp_average_denot_cardinality", "PSP-AVERAGE-DENOT-CARDINALITY", 0, 0, false);
            declareFunction("compute_psp_average_denot_cardinality", "COMPUTE-PSP-AVERAGE-DENOT-CARDINALITY", 0, 0, false);
            declareFunction("psp_determiner_agreement_cardinality", "PSP-DETERMINER-AGREEMENT-CARDINALITY", 1, 0, false);
            declareFunction("psp_derivable_preds_cardinality", "PSP-DERIVABLE-PREDS-CARDINALITY", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_psp_rules_file_Previous() {
        declareFunction("phrase_structure_parser_rule_print_function_trampoline", "PHRASE-STRUCTURE-PARSER-RULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("phrase_structure_parser_rule_p", "PHRASE-STRUCTURE-PARSER-RULE-P", 1, 0, false);
        new psp_rules.$phrase_structure_parser_rule_p$UnaryFunction();
        declareFunction("psp_rule_fort", "PSP-RULE-FORT", 1, 0, false);
        declareFunction("psp_rule_arity", "PSP-RULE-ARITY", 1, 0, false);
        declareFunction("psp_rule_category", "PSP-RULE-CATEGORY", 1, 0, false);
        declareFunction("psp_rule_head", "PSP-RULE-HEAD", 1, 0, false);
        declareFunction("psp_rule_constraints", "PSP-RULE-CONSTRAINTS", 1, 0, false);
        declareFunction("psp_rule_semx", "PSP-RULE-SEMX", 1, 0, false);
        declareFunction("psp_rule_weight", "PSP-RULE-WEIGHT", 1, 0, false);
        declareFunction("_csetf_psp_rule_fort", "_CSETF-PSP-RULE-FORT", 2, 0, false);
        declareFunction("_csetf_psp_rule_arity", "_CSETF-PSP-RULE-ARITY", 2, 0, false);
        declareFunction("_csetf_psp_rule_category", "_CSETF-PSP-RULE-CATEGORY", 2, 0, false);
        declareFunction("_csetf_psp_rule_head", "_CSETF-PSP-RULE-HEAD", 2, 0, false);
        declareFunction("_csetf_psp_rule_constraints", "_CSETF-PSP-RULE-CONSTRAINTS", 2, 0, false);
        declareFunction("_csetf_psp_rule_semx", "_CSETF-PSP-RULE-SEMX", 2, 0, false);
        declareFunction("_csetf_psp_rule_weight", "_CSETF-PSP-RULE-WEIGHT", 2, 0, false);
        declareFunction("make_phrase_structure_parser_rule", "MAKE-PHRASE-STRUCTURE-PARSER-RULE", 0, 1, false);
        declareFunction("visit_defstruct_phrase_structure_parser_rule", "VISIT-DEFSTRUCT-PHRASE-STRUCTURE-PARSER-RULE", 2, 0, false);
        declareFunction("visit_defstruct_object_phrase_structure_parser_rule_method", "VISIT-DEFSTRUCT-OBJECT-PHRASE-STRUCTURE-PARSER-RULE-METHOD", 2, 0, false);
        declareFunction("pprint_psp_rule", "PPRINT-PSP-RULE", 1, 2, false);
        declareFunction("new_psp_rule", "NEW-PSP-RULE", 0, 7, false);
        declareFunction("psp_new_constraints", "PSP-NEW-CONSTRAINTS", 0, 0, false);
        declareFunction("psp_constraints_on_dtr", "PSP-CONSTRAINTS-ON-DTR", 2, 0, false);
        declareFunction("psp_new_constraint", "PSP-NEW-CONSTRAINT", 2, 0, false);
        declareFunction("psp_constraint_type", "PSP-CONSTRAINT-TYPE", 1, 0, false);
        declareFunction("psp_constraint_target", "PSP-CONSTRAINT-TARGET", 1, 0, false);
        declareMacro("psp_destructure_constraint", "PSP-DESTRUCTURE-CONSTRAINT");
        declareFunction("psp_rules", "PSP-RULES", 0, 0, false);
        declareFunction("clear_psp_rules", "CLEAR-PSP-RULES", 0, 0, false);
        declareFunction("add_phrase_structure_rule", "ADD-PHRASE-STRUCTURE-RULE", 2, 0, false);
        declareFunction("remove_phrase_structure_rule", "REMOVE-PHRASE-STRUCTURE-RULE", 2, 0, false);
        declareFunction("initialize_psp_rules", "INITIALIZE-PSP-RULES", 0, 1, false);
        declareFunction("psp_check_initializations", "PSP-CHECK-INITIALIZATIONS", 0, 0, false);
        declareFunction("store_one_psp_rule_fort", "STORE-ONE-PSP-RULE-FORT", 1, 0, false);
        declareFunction("psp_valid_raw_constraintP", "PSP-VALID-RAW-CONSTRAINT?", 1, 0, false);
        declareFunction("psp_get_semx_for_rule_fort", "PSP-GET-SEMX-FOR-RULE-FORT", 1, 0, false);
        declareFunction("psp_binding_expressions_for_rule_fort", "PSP-BINDING-EXPRESSIONS-FOR-RULE-FORT", 1, 0, false);
        declareFunction("psp_rule_fort_weight_factor", "PSP-RULE-FORT-WEIGHT-FACTOR", 1, 1, false);
        declareFunction("psp_explicit_weight_factor_for_rule_fort", "PSP-EXPLICIT-WEIGHT-FACTOR-FOR-RULE-FORT", 1, 0, false);
        declareFunction("psp_rule_fort_weights_internal", "PSP-RULE-FORT-WEIGHTS-INTERNAL", 0, 0, false);
        declareFunction("psp_rule_fort_weights", "PSP-RULE-FORT-WEIGHTS", 0, 0, false);
        declareFunction("psp_rule_weight_factor_from_arity", "PSP-RULE-WEIGHT-FACTOR-FROM-ARITY", 1, 0, false);
        declareFunction("add_psp_rule", "ADD-PSP-RULE", 7, 0, false);
        declareFunction("psp_rule_struct_for_rule_fort", "PSP-RULE-STRUCT-FOR-RULE-FORT", 1, 0, false);
        declareFunction("psp_category_meets_constraintsP", "PSP-CATEGORY-MEETS-CONSTRAINTS?", 2, 0, false);
        declareFunction("psp_parse_constraint", "PSP-PARSE-CONSTRAINT", 1, 0, false);
        declareFunction("psp_frame_specific_raw_constraintP", "PSP-FRAME-SPECIFIC-RAW-CONSTRAINT?", 1, 0, false);
        declareFunction("psp_frame_constraint_from_raw_constraint", "PSP-FRAME-CONSTRAINT-FROM-RAW-CONSTRAINT", 1, 0, false);
        declareFunction("psp_add_derivable_rules", "PSP-ADD-DERIVABLE-RULES", 1, 0, false);
        declareFunction("psp_trace", "PSP-TRACE", 1, 0, false);
        declareFunction("psp_untrace", "PSP-UNTRACE", 0, 1, false);
        declareFunction("psp_traced_ruleP", "PSP-TRACED-RULE?", 1, 0, false);
        declareMacro("psp_trace_report", "PSP-TRACE-REPORT");
        declareMacro("do_psp_trace_report", "DO-PSP-TRACE-REPORT");
        declareFunction("psp_rules_starting_with_edge", "PSP-RULES-STARTING-WITH-EDGE", 1, 1, false);
        declareFunction("psp_rule_could_start_at_indexP", "PSP-RULE-COULD-START-AT-INDEX?", 2, 0, false);
        declareFunction("psp_filter_cycls", "PSP-FILTER-CYCLS", 4, 0, false);
        declareFunction("psp_cyclify_targets", "PSP-CYCLIFY-TARGETS", 2, 0, false);
        declareFunction("psp_edge_passes_semantic_constraintsP", "PSP-EDGE-PASSES-SEMANTIC-CONSTRAINTS?", 1, 0, false);
        declareFunction("psp_edge_meets_syntax_constraintsP", "PSP-EDGE-MEETS-SYNTAX-CONSTRAINTS?", 2, 2, false);
        declareFunction("psp_syntactic_constraintP", "PSP-SYNTACTIC-CONSTRAINT?", 1, 0, false);
        declareFunction("clear_psp_syntactic_constraint_types", "CLEAR-PSP-SYNTACTIC-CONSTRAINT-TYPES", 0, 0, false);
        declareFunction("psp_syntactic_constraint_typeP", "PSP-SYNTACTIC-CONSTRAINT-TYPE?", 1, 0, false);
        declareFunction("psp_semantic_constraintP", "PSP-SEMANTIC-CONSTRAINT?", 1, 0, false);
        declareFunction("clear_psp_semantic_constraint_types", "CLEAR-PSP-SEMANTIC-CONSTRAINT-TYPES", 0, 0, false);
        declareFunction("psp_semantic_constraint_typeP", "PSP-SEMANTIC-CONSTRAINT-TYPE?", 1, 0, false);
        declareFunction("clear_psp_cycl_fails_constraintP", "CLEAR-PSP-CYCL-FAILS-CONSTRAINT?", 0, 0, false);
        declareFunction("remove_psp_cycl_fails_constraintP", "REMOVE-PSP-CYCL-FAILS-CONSTRAINT?", 2, 0, false);
        declareFunction("psp_cycl_fails_constraintP_internal", "PSP-CYCL-FAILS-CONSTRAINT?-INTERNAL", 2, 0, false);
        declareFunction("psp_cycl_fails_constraintP", "PSP-CYCL-FAILS-CONSTRAINT?", 2, 0, false);
        declareFunction("psp_edge_fails_constraintP", "PSP-EDGE-FAILS-CONSTRAINT?", 3, 0, false);
        declareFunction("clear_psp_phrase_types", "CLEAR-PSP-PHRASE-TYPES", 0, 0, false);
        declareFunction("remove_psp_phrase_types", "REMOVE-PSP-PHRASE-TYPES", 0, 1, false);
        declareFunction("psp_phrase_types_internal", "PSP-PHRASE-TYPES-INTERNAL", 1, 0, false);
        declareFunction("psp_phrase_types", "PSP-PHRASE-TYPES", 0, 1, false);
        declareFunction("psp_constraints_require_phraseP_internal", "PSP-CONSTRAINTS-REQUIRE-PHRASE?-INTERNAL", 1, 0, false);
        declareFunction("psp_constraints_require_phraseP", "PSP-CONSTRAINTS-REQUIRE-PHRASE?", 1, 0, false);
        declareFunction("psp_edge_fails_lexeme_constraintP", "PSP-EDGE-FAILS-LEXEME-CONSTRAINT?", 2, 0, false);
        declareFunction("psp_lexeme_constraintP", "PSP-LEXEME-CONSTRAINT?", 1, 0, false);
        declareFunction("psp_frame_specific_constituent_typeP", "PSP-FRAME-SPECIFIC-CONSTITUENT-TYPE?", 1, 0, false);
        declareFunction("psp_frame_type_from_constituent_type", "PSP-FRAME-TYPE-FROM-CONSTITUENT-TYPE", 1, 0, false);
        declareFunction("psp_constraint_target_includesP", "PSP-CONSTRAINT-TARGET-INCLUDES?", 2, 1, false);
        declareFunction("psp_edge_has_wuP", "PSP-EDGE-HAS-WU?", 2, 0, false);
        declareFunction("psp_det_nbar_agreeP", "PSP-DET-NBAR-AGREE?", 3, 0, false);
        declareFunction("psp_valid_constituent_typeP", "PSP-VALID-CONSTITUENT-TYPE?", 2, 0, false);
        declareFunction("clear_psp_sub_categories", "CLEAR-PSP-SUB-CATEGORIES", 0, 0, false);
        declareFunction("remove_psp_sub_categories", "REMOVE-PSP-SUB-CATEGORIES", 1, 0, false);
        declareFunction("psp_sub_categories_internal", "PSP-SUB-CATEGORIES-INTERNAL", 1, 0, false);
        declareFunction("psp_sub_categories", "PSP-SUB-CATEGORIES", 1, 0, false);
        declareFunction("psp_simplify_if_frame_specific_type", "PSP-SIMPLIFY-IF-FRAME-SPECIFIC-TYPE", 1, 0, false);
        declareFunction("clear_psp_sub_pos_preds", "CLEAR-PSP-SUB-POS-PREDS", 0, 0, false);
        declareFunction("remove_psp_sub_pos_preds", "REMOVE-PSP-SUB-POS-PREDS", 1, 1, false);
        declareFunction("psp_sub_pos_preds_internal", "PSP-SUB-POS-PREDS-INTERNAL", 2, 0, false);
        declareFunction("psp_sub_pos_preds", "PSP-SUB-POS-PREDS", 1, 1, false);
        declareFunction("clear_psp_frame_type_instances", "CLEAR-PSP-FRAME-TYPE-INSTANCES", 0, 0, false);
        declareFunction("remove_psp_frame_type_instances", "REMOVE-PSP-FRAME-TYPE-INSTANCES", 1, 1, false);
        declareFunction("psp_frame_type_instances_internal", "PSP-FRAME-TYPE-INSTANCES-INTERNAL", 2, 0, false);
        declareFunction("psp_frame_type_instances", "PSP-FRAME-TYPE-INSTANCES", 1, 1, false);
        declareFunction("clear_psp_rewrite", "CLEAR-PSP-REWRITE", 0, 0, false);
        declareFunction("remove_psp_rewrite", "REMOVE-PSP-REWRITE", 1, 0, false);
        declareFunction("psp_rewrite_internal", "PSP-REWRITE-INTERNAL", 1, 0, false);
        declareFunction("psp_rewrite", "PSP-REWRITE", 1, 0, false);
        declareFunction("psp_isaP_internal", "PSP-ISA?-INTERNAL", 2, 0, false);
        declareFunction("psp_isaP", "PSP-ISA?", 2, 0, false);
        declareFunction("psp_genlP_internal", "PSP-GENL?-INTERNAL", 2, 0, false);
        declareFunction("psp_genlP", "PSP-GENL?", 2, 0, false);
        declareFunction("psp_rule_new_dtr_constraints", "PSP-RULE-NEW-DTR-CONSTRAINTS", 2, 0, false);
        declareFunction("psp_new_dtr_constraints_from_frame", "PSP-NEW-DTR-CONSTRAINTS-FROM-FRAME", 1, 0, false);
        declareFunction("psp_add_by_phrase_constraints", "PSP-ADD-BY-PHRASE-CONSTRAINTS", 1, 0, false);
        declareFunction("psp_passivized_dtrP", "PSP-PASSIVIZED-DTR?", 2, 0, false);
        declareFunction("psp_constraints_for_frame", "PSP-CONSTRAINTS-FOR-FRAME", 1, 0, false);
        declareFunction("psp_spec_const_constraintP", "PSP-SPEC-CONST-CONSTRAINT?", 2, 0, false);
        declareFunction("psp_find_dtr_frame_type", "PSP-FIND-DTR-FRAME-TYPE", 2, 0, false);
        declareFunction("psp_parse_tree_for_edge", "PSP-PARSE-TREE-FOR-EDGE", 1, 0, false);
        declareFunction("clear_psp_rules_caches", "CLEAR-PSP-RULES-CACHES", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_psp_rules_file_alt() {
        defconstant("*DTP-PHRASE-STRUCTURE-PARSER-RULE*", PHRASE_STRUCTURE_PARSER_RULE);
        defparameter("*PSP-RULES*", set.new_set(symbol_function(EQUALP), $int$128));
        deflexical("*PSP-RULE-FORT-WEIGHTS*", list(bq_cons($$PSRule_NounNounCompound, parsing_utilities.psp_weight_from_float($float$0_5)), bq_cons($$PSRule_NameNounCompound, parsing_utilities.psp_weight_from_float($float$0_5)), bq_cons($$PSRule_AdjectiveNameCompound, parsing_utilities.psp_weight_from_float($float$0_5)), bq_cons($$PSRule_NameNameNounCompound, parsing_utilities.psp_weight_from_float($float$0_5))));
        defconstant("*PSP-RULE-ARITY-WEIGHT*", parsing_utilities.psp_weight_from_float($float$0_95));
        deflexical("*PSP-TRACED-RULES*", NIL != boundp($psp_traced_rules$) ? ((SubLObject) ($psp_traced_rules$.getGlobalValue())) : NIL);
        deflexical("*PSP-SYNTACTIC-CONSTRAINT-TYPES*", NIL != boundp($psp_syntactic_constraint_types$) ? ((SubLObject) ($psp_syntactic_constraint_types$.getGlobalValue())) : NIL);
        deflexical("*PSP-SEMANTIC-CONSTRAINT-TYPES*", NIL != boundp($psp_semantic_constraint_types$) ? ((SubLObject) ($psp_semantic_constraint_types$.getGlobalValue())) : NIL);
        deflexical("*PSP-CYCL-FAILS-CONSTRAINT?-CACHING-STATE*", NIL);
        deflexical("*PSP-PHRASE-TYPES-CACHING-STATE*", NIL);
        deflexical("*PSP-DET-STRING-AGREEMENT-WARN-CACHING-STATE*", NIL);
        deflexical("*PSP-SUB-CATEGORIES-CACHING-STATE*", NIL);
        deflexical("*PSP-SUB-POS-PREDS-CACHING-STATE*", NIL);
        deflexical("*PSP-FRAME-TYPE-INSTANCES-CACHING-STATE*", NIL);
        deflexical("*PSP-REWRITE-CACHING-STATE*", NIL);
        deflexical("*PSP-NP-COUNT*", NIL != boundp($psp_np_count$) ? ((SubLObject) ($psp_np_count$.getGlobalValue())) : $UNKNOWN);
        deflexical("*PSP-AVERAGE-DENOT-CARDINALITY*", NIL != boundp($psp_average_denot_cardinality$) ? ((SubLObject) ($psp_average_denot_cardinality$.getGlobalValue())) : $UNKNOWN);
        return NIL;
    }

    public static SubLObject init_psp_rules_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-PHRASE-STRUCTURE-PARSER-RULE*", PHRASE_STRUCTURE_PARSER_RULE);
            defparameter("*PSP-RULES*", set.new_set(symbol_function(EQUALP), $int$128));
            deflexical("*PSP-RULE-FORT-WEIGHTS*", list(bq_cons($$PSRule_NounNounCompound, parsing_utilities.psp_weight_from_float($float$0_5)), bq_cons($$PSRule_NameNounCompound, parsing_utilities.psp_weight_from_float($float$0_5)), bq_cons($$PSRule_AdjectiveNameCompound, parsing_utilities.psp_weight_from_float($float$0_5)), bq_cons($$PSRule_NameNameNounCompound, parsing_utilities.psp_weight_from_float($float$0_5))));
            defconstant("*PSP-RULE-ARITY-WEIGHT*", parsing_utilities.psp_weight_from_float($float$0_95));
            deflexical("*PSP-TRACED-RULES*", SubLTrampolineFile.maybeDefault($psp_traced_rules$, $psp_traced_rules$, NIL));
            deflexical("*PSP-SYNTACTIC-CONSTRAINT-TYPES*", SubLTrampolineFile.maybeDefault($psp_syntactic_constraint_types$, $psp_syntactic_constraint_types$, NIL));
            deflexical("*PSP-SEMANTIC-CONSTRAINT-TYPES*", SubLTrampolineFile.maybeDefault($psp_semantic_constraint_types$, $psp_semantic_constraint_types$, NIL));
            deflexical("*PSP-CYCL-FAILS-CONSTRAINT?-CACHING-STATE*", NIL);
            deflexical("*PSP-PHRASE-TYPES-CACHING-STATE*", NIL);
            deflexical("*PSP-SUB-CATEGORIES-CACHING-STATE*", NIL);
            deflexical("*PSP-SUB-POS-PREDS-CACHING-STATE*", NIL);
            deflexical("*PSP-FRAME-TYPE-INSTANCES-CACHING-STATE*", NIL);
            deflexical("*PSP-REWRITE-CACHING-STATE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*PSP-TRACED-RULES*", NIL != boundp($psp_traced_rules$) ? ((SubLObject) ($psp_traced_rules$.getGlobalValue())) : NIL);
            deflexical("*PSP-SYNTACTIC-CONSTRAINT-TYPES*", NIL != boundp($psp_syntactic_constraint_types$) ? ((SubLObject) ($psp_syntactic_constraint_types$.getGlobalValue())) : NIL);
            deflexical("*PSP-SEMANTIC-CONSTRAINT-TYPES*", NIL != boundp($psp_semantic_constraint_types$) ? ((SubLObject) ($psp_semantic_constraint_types$.getGlobalValue())) : NIL);
            deflexical("*PSP-DET-STRING-AGREEMENT-WARN-CACHING-STATE*", NIL);
            deflexical("*PSP-NP-COUNT*", NIL != boundp($psp_np_count$) ? ((SubLObject) ($psp_np_count$.getGlobalValue())) : $UNKNOWN);
            deflexical("*PSP-AVERAGE-DENOT-CARDINALITY*", NIL != boundp($psp_average_denot_cardinality$) ? ((SubLObject) ($psp_average_denot_cardinality$.getGlobalValue())) : $UNKNOWN);
        }
        return NIL;
    }

    public static SubLObject init_psp_rules_file_Previous() {
        defconstant("*DTP-PHRASE-STRUCTURE-PARSER-RULE*", PHRASE_STRUCTURE_PARSER_RULE);
        defparameter("*PSP-RULES*", set.new_set(symbol_function(EQUALP), $int$128));
        deflexical("*PSP-RULE-FORT-WEIGHTS*", list(bq_cons($$PSRule_NounNounCompound, parsing_utilities.psp_weight_from_float($float$0_5)), bq_cons($$PSRule_NameNounCompound, parsing_utilities.psp_weight_from_float($float$0_5)), bq_cons($$PSRule_AdjectiveNameCompound, parsing_utilities.psp_weight_from_float($float$0_5)), bq_cons($$PSRule_NameNameNounCompound, parsing_utilities.psp_weight_from_float($float$0_5))));
        defconstant("*PSP-RULE-ARITY-WEIGHT*", parsing_utilities.psp_weight_from_float($float$0_95));
        deflexical("*PSP-TRACED-RULES*", SubLTrampolineFile.maybeDefault($psp_traced_rules$, $psp_traced_rules$, NIL));
        deflexical("*PSP-SYNTACTIC-CONSTRAINT-TYPES*", SubLTrampolineFile.maybeDefault($psp_syntactic_constraint_types$, $psp_syntactic_constraint_types$, NIL));
        deflexical("*PSP-SEMANTIC-CONSTRAINT-TYPES*", SubLTrampolineFile.maybeDefault($psp_semantic_constraint_types$, $psp_semantic_constraint_types$, NIL));
        deflexical("*PSP-CYCL-FAILS-CONSTRAINT?-CACHING-STATE*", NIL);
        deflexical("*PSP-PHRASE-TYPES-CACHING-STATE*", NIL);
        deflexical("*PSP-SUB-CATEGORIES-CACHING-STATE*", NIL);
        deflexical("*PSP-SUB-POS-PREDS-CACHING-STATE*", NIL);
        deflexical("*PSP-FRAME-TYPE-INSTANCES-CACHING-STATE*", NIL);
        deflexical("*PSP-REWRITE-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_psp_rules_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_phrase_structure_parser_rule$.getGlobalValue(), symbol_function(PHRASE_STRUCTURE_PARSER_RULE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(PSP_RULE_FORT, _CSETF_PSP_RULE_FORT);
        def_csetf(PSP_RULE_ARITY, _CSETF_PSP_RULE_ARITY);
        def_csetf(PSP_RULE_CATEGORY, _CSETF_PSP_RULE_CATEGORY);
        def_csetf(PSP_RULE_HEAD, _CSETF_PSP_RULE_HEAD);
        def_csetf(PSP_RULE_CONSTRAINTS, _CSETF_PSP_RULE_CONSTRAINTS);
        def_csetf(PSP_RULE_SEMX, _CSETF_PSP_RULE_SEMX);
        def_csetf(PSP_RULE_WEIGHT, _CSETF_PSP_RULE_WEIGHT);
        identity(PHRASE_STRUCTURE_PARSER_RULE);
        register_kb_function(ADD_PHRASE_STRUCTURE_RULE);
        register_kb_function(REMOVE_PHRASE_STRUCTURE_RULE);
        memoization_state.note_memoized_function(PSP_RULE_FORT_WEIGHTS);
        declare_defglobal($psp_traced_rules$);
        declare_defglobal($psp_syntactic_constraint_types$);
        declare_defglobal($psp_semantic_constraint_types$);
        memoization_state.note_globally_cached_function($sym115$PSP_CYCL_FAILS_CONSTRAINT_);
        memoization_state.note_globally_cached_function(PSP_PHRASE_TYPES);
        memoization_state.note_memoized_function($sym127$PSP_CONSTRAINTS_REQUIRE_PHRASE_);
        memoization_state.note_globally_cached_function(PSP_DET_STRING_AGREEMENT_WARN);
        memoization_state.note_globally_cached_function(PSP_SUB_CATEGORIES);
        memoization_state.note_globally_cached_function(PSP_SUB_POS_PREDS);
        memoization_state.note_globally_cached_function(PSP_FRAME_TYPE_INSTANCES);
        memoization_state.note_globally_cached_function(PSP_REWRITE);
        memoization_state.note_memoized_function($sym148$PSP_ISA_);
        memoization_state.note_memoized_function($sym149$PSP_GENL_);
        declare_defglobal($psp_np_count$);
        declare_defglobal($psp_average_denot_cardinality$);
        return NIL;
    }

    public static SubLObject setup_psp_rules_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_phrase_structure_parser_rule$.getGlobalValue(), symbol_function(PHRASE_STRUCTURE_PARSER_RULE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list8);
            def_csetf(PSP_RULE_FORT, _CSETF_PSP_RULE_FORT);
            def_csetf(PSP_RULE_ARITY, _CSETF_PSP_RULE_ARITY);
            def_csetf(PSP_RULE_CATEGORY, _CSETF_PSP_RULE_CATEGORY);
            def_csetf(PSP_RULE_HEAD, _CSETF_PSP_RULE_HEAD);
            def_csetf(PSP_RULE_CONSTRAINTS, _CSETF_PSP_RULE_CONSTRAINTS);
            def_csetf(PSP_RULE_SEMX, _CSETF_PSP_RULE_SEMX);
            def_csetf(PSP_RULE_WEIGHT, _CSETF_PSP_RULE_WEIGHT);
            identity(PHRASE_STRUCTURE_PARSER_RULE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_phrase_structure_parser_rule$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_RULE_METHOD));
            register_kb_function(ADD_PHRASE_STRUCTURE_RULE);
            register_kb_function(REMOVE_PHRASE_STRUCTURE_RULE);
            memoization_state.note_memoized_function(PSP_RULE_FORT_WEIGHTS);
            declare_defglobal($psp_traced_rules$);
            declare_defglobal($psp_syntactic_constraint_types$);
            declare_defglobal($psp_semantic_constraint_types$);
            memoization_state.note_globally_cached_function($sym116$PSP_CYCL_FAILS_CONSTRAINT_);
            memoization_state.note_globally_cached_function(PSP_PHRASE_TYPES);
            memoization_state.note_memoized_function($sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_);
            memoization_state.note_globally_cached_function(PSP_SUB_CATEGORIES);
            memoization_state.note_globally_cached_function(PSP_SUB_POS_PREDS);
            memoization_state.note_globally_cached_function(PSP_FRAME_TYPE_INSTANCES);
            memoization_state.note_globally_cached_function(PSP_REWRITE);
            memoization_state.note_memoized_function($sym146$PSP_ISA_);
            memoization_state.note_memoized_function($sym147$PSP_GENL_);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_globally_cached_function($sym115$PSP_CYCL_FAILS_CONSTRAINT_);
            memoization_state.note_memoized_function($sym127$PSP_CONSTRAINTS_REQUIRE_PHRASE_);
            memoization_state.note_globally_cached_function(PSP_DET_STRING_AGREEMENT_WARN);
            memoization_state.note_memoized_function($sym148$PSP_ISA_);
            memoization_state.note_memoized_function($sym149$PSP_GENL_);
            declare_defglobal($psp_np_count$);
            declare_defglobal($psp_average_denot_cardinality$);
        }
        return NIL;
    }

    public static SubLObject setup_psp_rules_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_phrase_structure_parser_rule$.getGlobalValue(), symbol_function(PHRASE_STRUCTURE_PARSER_RULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(PSP_RULE_FORT, _CSETF_PSP_RULE_FORT);
        def_csetf(PSP_RULE_ARITY, _CSETF_PSP_RULE_ARITY);
        def_csetf(PSP_RULE_CATEGORY, _CSETF_PSP_RULE_CATEGORY);
        def_csetf(PSP_RULE_HEAD, _CSETF_PSP_RULE_HEAD);
        def_csetf(PSP_RULE_CONSTRAINTS, _CSETF_PSP_RULE_CONSTRAINTS);
        def_csetf(PSP_RULE_SEMX, _CSETF_PSP_RULE_SEMX);
        def_csetf(PSP_RULE_WEIGHT, _CSETF_PSP_RULE_WEIGHT);
        identity(PHRASE_STRUCTURE_PARSER_RULE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_phrase_structure_parser_rule$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PHRASE_STRUCTURE_PARSER_RULE_METHOD));
        register_kb_function(ADD_PHRASE_STRUCTURE_RULE);
        register_kb_function(REMOVE_PHRASE_STRUCTURE_RULE);
        memoization_state.note_memoized_function(PSP_RULE_FORT_WEIGHTS);
        declare_defglobal($psp_traced_rules$);
        declare_defglobal($psp_syntactic_constraint_types$);
        declare_defglobal($psp_semantic_constraint_types$);
        memoization_state.note_globally_cached_function($sym116$PSP_CYCL_FAILS_CONSTRAINT_);
        memoization_state.note_globally_cached_function(PSP_PHRASE_TYPES);
        memoization_state.note_memoized_function($sym128$PSP_CONSTRAINTS_REQUIRE_PHRASE_);
        memoization_state.note_globally_cached_function(PSP_SUB_CATEGORIES);
        memoization_state.note_globally_cached_function(PSP_SUB_POS_PREDS);
        memoization_state.note_globally_cached_function(PSP_FRAME_TYPE_INSTANCES);
        memoization_state.note_globally_cached_function(PSP_REWRITE);
        memoization_state.note_memoized_function($sym146$PSP_ISA_);
        memoization_state.note_memoized_function($sym147$PSP_GENL_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_psp_rules_file();
    }

    @Override
    public void initializeVariables() {
        init_psp_rules_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_psp_rules_file();
    }

    static {
    }

    public static final class $phrase_structure_parser_rule_native extends SubLStructNative {
        public SubLObject $fort;

        public SubLObject $arity;

        public SubLObject $category;

        public SubLObject $head;

        public SubLObject $constraints;

        public SubLObject $semx;

        public SubLObject $weight;

        private static final SubLStructDeclNative structDecl;

        public $phrase_structure_parser_rule_native() {
            psp_rules.$phrase_structure_parser_rule_native.this.$fort = Lisp.NIL;
            psp_rules.$phrase_structure_parser_rule_native.this.$arity = Lisp.NIL;
            psp_rules.$phrase_structure_parser_rule_native.this.$category = Lisp.NIL;
            psp_rules.$phrase_structure_parser_rule_native.this.$head = Lisp.NIL;
            psp_rules.$phrase_structure_parser_rule_native.this.$constraints = Lisp.NIL;
            psp_rules.$phrase_structure_parser_rule_native.this.$semx = Lisp.NIL;
            psp_rules.$phrase_structure_parser_rule_native.this.$weight = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return psp_rules.$phrase_structure_parser_rule_native.this.$fort;
        }

        @Override
        public SubLObject getField3() {
            return psp_rules.$phrase_structure_parser_rule_native.this.$arity;
        }

        @Override
        public SubLObject getField4() {
            return psp_rules.$phrase_structure_parser_rule_native.this.$category;
        }

        @Override
        public SubLObject getField5() {
            return psp_rules.$phrase_structure_parser_rule_native.this.$head;
        }

        @Override
        public SubLObject getField6() {
            return psp_rules.$phrase_structure_parser_rule_native.this.$constraints;
        }

        @Override
        public SubLObject getField7() {
            return psp_rules.$phrase_structure_parser_rule_native.this.$semx;
        }

        @Override
        public SubLObject getField8() {
            return psp_rules.$phrase_structure_parser_rule_native.this.$weight;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return psp_rules.$phrase_structure_parser_rule_native.this.$fort = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return psp_rules.$phrase_structure_parser_rule_native.this.$arity = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return psp_rules.$phrase_structure_parser_rule_native.this.$category = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return psp_rules.$phrase_structure_parser_rule_native.this.$head = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return psp_rules.$phrase_structure_parser_rule_native.this.$constraints = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return psp_rules.$phrase_structure_parser_rule_native.this.$semx = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return psp_rules.$phrase_structure_parser_rule_native.this.$weight = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.psp_rules.$phrase_structure_parser_rule_native.class, PHRASE_STRUCTURE_PARSER_RULE, PHRASE_STRUCTURE_PARSER_RULE_P, $list2, $list3, new String[]{ "$fort", "$arity", "$category", "$head", "$constraints", "$semx", "$weight" }, $list4, $list5, PPRINT_PSP_RULE);
        }
    }

    public static final class $phrase_structure_parser_rule_p$UnaryFunction extends UnaryFunction {
        public $phrase_structure_parser_rule_p$UnaryFunction() {
            super(extractFunctionNamed("PHRASE-STRUCTURE-PARSER-RULE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return phrase_structure_parser_rule_p(arg1);
        }
    }

    static private final SubLList $list_alt2 = list(makeSymbol("FORT"), makeSymbol("ARITY"), makeSymbol("CATEGORY"), makeSymbol("HEAD"), makeSymbol("CONSTRAINTS"), makeSymbol("SEMX"), makeSymbol("WEIGHT"));

    static private final SubLList $list_alt3 = list($FORT, makeKeyword("ARITY"), makeKeyword("CATEGORY"), $HEAD, makeKeyword("CONSTRAINTS"), $SEMX, makeKeyword("WEIGHT"));

    static private final SubLList $list_alt4 = list(makeSymbol("PSP-RULE-FORT"), makeSymbol("PSP-RULE-ARITY"), makeSymbol("PSP-RULE-CATEGORY"), makeSymbol("PSP-RULE-HEAD"), makeSymbol("PSP-RULE-CONSTRAINTS"), makeSymbol("PSP-RULE-SEMX"), makeSymbol("PSP-RULE-WEIGHT"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-PSP-RULE-FORT"), makeSymbol("_CSETF-PSP-RULE-ARITY"), makeSymbol("_CSETF-PSP-RULE-CATEGORY"), makeSymbol("_CSETF-PSP-RULE-HEAD"), makeSymbol("_CSETF-PSP-RULE-CONSTRAINTS"), makeSymbol("_CSETF-PSP-RULE-SEMX"), makeSymbol("_CSETF-PSP-RULE-WEIGHT"));

    static private final SubLString $str_alt29$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt30$__PSP_RULE___S_ = makeString("#<PSP-RULE: ~S>");

    static private final SubLList $list_alt31 = list(list(makeSymbol("TYPE"), makeSymbol("TARGET")), makeSymbol("CONSTRAINT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt36$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt44$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt49$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt50$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLList $list_alt51 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    static private final SubLString $str_alt52$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLString $str_alt58$_S_has_no_category___ = makeString("~S has no category.~%");

    static private final SubLString $str_alt59$_S_has_no_syntactic_head___ = makeString("~S has no syntactic head.~%");

    static private final SubLList $list_alt60 = list(makeSymbol("C-TYPE"), makeSymbol("DTR"), makeSymbol("TARGET"));

    static private final SubLString $str_alt61$Rule__S_has_no_constraints_ = makeString("Rule ~S has no constraints.");

    static private final SubLList $list_alt82 = cons(makeSymbol("?RULE"), makeSymbol("?WEIGHT"));

    static private final SubLList $list_alt83 = list(makeSymbol("?RULE"), makeSymbol("?WEIGHT"));

    static private final SubLList $list_alt84 = cons(makeSymbol("RULE"), makeSymbol("RAW-WEIGHT"));

    public static final SubLSymbol $kw85$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt87$___S_was_skipped_because_it_would = makeString("~&~S was skipped because it would allow infinite recursion.~%");

    static private final SubLList $list_alt89 = list(makeSymbol("TYPE"), makeSymbol("TARGET"));

    static private final SubLList $list_alt96 = list(makeSymbol("RULE-FORT"), makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLSymbol $sym98$PSP_TRACED_RULE_ = makeSymbol("PSP-TRACED-RULE?");

    static private final SubLList $list_alt100 = list(makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLString $str_alt102$___S___meets_the_first_dtr_constr = makeString("~&~S~% meets the first-dtr constraints of ~S. Frame = ~S");

    static private final SubLSymbol $sym103$PSP_SEMANTIC_CONSTRAINT_ = makeSymbol("PSP-SEMANTIC-CONSTRAINT?");

    static private final SubLString $str_alt104$___S____A_constraint__S___ = makeString("~&~S~% ~A constraint ~S.~%");

    static private final SubLString $str_alt109$___S___failed_constraint__S___S = makeString("~&~S~% failed constraint ~S: ~S");

    public static final SubLObject $const111$PhraseStructureConstraint_Syntact = reader_make_constant_shell("PhraseStructureConstraint-Syntactic");

    public static final SubLObject $const114$PhraseStructureConstraint_Semanti = reader_make_constant_shell("PhraseStructureConstraint-Semantic");

    static private final SubLSymbol $sym115$PSP_CYCL_FAILS_CONSTRAINT_ = makeSymbol("PSP-CYCL-FAILS-CONSTRAINT?");

    static private final SubLList $list_alt116 = list(makeSymbol("C-TYPE"), makeSymbol("TARGET"));

    static private final SubLSymbol $sym119$_PSP_CYCL_FAILS_CONSTRAINT__CACHING_STATE_ = makeSymbol("*PSP-CYCL-FAILS-CONSTRAINT?-CACHING-STATE*");

    static private final SubLSymbol $sym127$PSP_CONSTRAINTS_REQUIRE_PHRASE_ = makeSymbol("PSP-CONSTRAINTS-REQUIRE-PHRASE?");

    static private final SubLList $list_alt129 = list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("NLWordForm"), reader_make_constant_shell("lexemeOfWordForm"));

    static private final SubLList $list_alt130 = list(reader_make_constant_shell("NLPhraseWithFrameFn"), reader_make_constant_shell("NLWordFormWithFrameFn"));

    static private final SubLList $list_alt132 = list(reader_make_constant_shell("nounStrings"));

    static private final SubLSymbol $sym133$GENL_POS_PRED_ = makeSymbol("GENL-POS-PRED?");

    private static final SubLSymbol PSP_DET_STRING_AGREEMENT_WARN = makeSymbol("PSP-DET-STRING-AGREEMENT-WARN");

    static private final SubLString $str_alt135$Determiner_agreement_not_known_fo = makeString("Determiner agreement not known for ~S. Assuming it agrees with any nbar.~%");

    static private final SubLSymbol $sym148$PSP_ISA_ = makeSymbol("PSP-ISA?");

    static private final SubLSymbol $sym149$PSP_GENL_ = makeSymbol("PSP-GENL?");

    static private final SubLList $list_alt150 = list(makeSymbol("N"), makeSymbol("TARGET"));

    static private final SubLSymbol $sym151$PSP_SPEC_CONST_CONSTRAINT_ = makeSymbol("PSP-SPEC-CONST-CONSTRAINT?");

    static private final SubLList $list_alt153 = list(reader_make_constant_shell("SubcollectionOfWithRelationToFn"), reader_make_constant_shell("NLWordForm"), reader_make_constant_shell("lexemeOfWordForm"), reader_make_constant_shell("By-TheWord"));

    static private final SubLList $list_alt156 = list(TWO_INTEGER, THREE_INTEGER);

    static private final SubLList $list_alt163 = list(makeSymbol("C1-TYPE"), makeSymbol("C1-TARGET"));

    static private final SubLList $list_alt164 = list(makeSymbol("C2-TYPE"), makeSymbol("C2-TARGET"));



    static private final SubLString $str_alt166$Estimated_Vbar_count___A___ = makeString("Estimated Vbar count: ~A.~%");







    public static final SubLObject $$ProperNamePredicate_Strict = reader_make_constant_shell("ProperNamePredicate-Strict");

    static private final SubLString $str_alt172$Estimated_NP_count___A___ = makeString("Estimated NP count: ~A.~%");







    static private final SubLString $str_alt182$_D_pairs___D_denots___ = makeString("~D pairs, ~D denots.~%");





    public static final SubLObject $$nonSingular_Generic = reader_make_constant_shell("nonSingular-Generic");


}

/**
 * Total time: 1561 ms
 */
