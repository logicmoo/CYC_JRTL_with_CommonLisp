package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_denotes extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes";
    public static final String myFingerPrint = "98a64ca3dab6338fb1b2bf952ba73ce04c95926ef9b62684609f631e557f4a8f";
    private static final SubLObject $const0$means;
    private static final SubLSymbol $kw1$REMOVAL_NON_WFF_CHECK_NEG;
    private static final SubLSymbol $kw2$POS;
    private static final SubLSymbol $kw3$NEG;
    private static final SubLSymbol $kw4$MEANS_UNIFY_ARG1_POS;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$MEANS_UNIFY_ARG1_NEG;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$REMOVAL_MEANS_CHECK_POS;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$OPAQUE;
    private static final SubLList $list11;
    private static final SubLObject $const12$expresses;
    private static final SubLObject $const13$denotes;
    private static final SubLObject $const14$QuasiQuote;
    private static final SubLObject $const15$Quote;
    private static final SubLSymbol $kw16$GAF_ARG;
    private static final SubLSymbol $kw17$GAF;
    private static final SubLSymbol $kw18$PREDICATE_EXTENT;
    private static final SubLSymbol $kw19$OVERLAP;
    private static final SubLSymbol $kw20$REMOVAL_MEANS_UNIFY_ARG1_POS;
    private static final SubLList $list21;
    private static final SubLSymbol $kw22$REMOVAL_MEANS_UNIFY_ARG2_POS;
    private static final SubLList $list23;
    private static final SubLSymbol $kw24$REMOVAL_MEANS_NEG;
    private static final SubLList $list25;
    private static final SubLObject $const26$CycLTerm;
    private static final SubLObject $const27$CycLDenotationalTerm;
    private static final SubLObject $const28$CycLSentence;
    private static final SubLSymbol $kw29$DENOTES_UNIFY_ARG1_POS;
    private static final SubLList $list30;
    private static final SubLSymbol $kw31$DENOTES_UNIFY_ARG1_NEG;
    private static final SubLList $list32;
    private static final SubLSymbol $kw33$REMOVAL_DENOTES_CHECK_POS;
    private static final SubLList $list34;
    private static final SubLSymbol $kw35$REMOVAL_DENOTES_UNIFY_ARG1_POS;
    private static final SubLList $list36;
    private static final SubLSymbol $kw37$REMOVAL_DENOTES_UNIFY_ARG2_POS;
    private static final SubLList $list38;
    private static final SubLSymbol $kw39$REMOVAL_DENOTES_NEG;
    private static final SubLList $list40;
    private static final SubLSymbol $kw41$EXPRESSES_UNIFY_ARG1_POS;
    private static final SubLList $list42;
    private static final SubLSymbol $kw43$EXPRESSES_UNIFY_ARG1_NEG;
    private static final SubLList $list44;
    private static final SubLSymbol $kw45$REMOVAL_EXPRESSES_CHECK_POS;
    private static final SubLList $list46;
    private static final SubLSymbol $kw47$REMOVAL_EXPRESSES_UNIFY_ARG1_POS;
    private static final SubLList $list48;
    private static final SubLSymbol $kw49$REMOVAL_EXPRESSES_UNIFY_ARG2_POS;
    private static final SubLList $list50;
    private static final SubLSymbol $kw51$REMOVAL_EXPRESSES_NEG;
    private static final SubLList $list52;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 2095L)
    public static SubLObject make_means_support(final SubLObject asent) {
        return arguments.make_hl_support((SubLObject)removal_modules_denotes.$kw10$OPAQUE, asent, (SubLObject)removal_modules_denotes.UNPROVIDED, (SubLObject)removal_modules_denotes.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 2180L)
    public static SubLObject removal_means_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_denotes.UNPROVIDED);
        if (removal_modules_denotes.NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            return control_vars.$hl_module_check_cost$.getDynamicValue(thread);
        }
        return removal_means_lookup_cost(asent, (SubLObject)removal_modules_denotes.$kw2$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 2434L)
    public static SubLObject removal_means_lookup_cost(final SubLObject asent, final SubLObject sense) {
        SubLObject cost = inference_trampolines.inference_num_gaf_lookup_index(asent, sense);
        if (removal_modules_denotes.$const0$means.eql(cycl_utilities.atomic_sentence_predicate(asent))) {
            final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_denotes.UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_denotes.UNPROVIDED);
            SubLObject cdolist_list_var = (SubLObject)removal_modules_denotes.$list11;
            SubLObject spec_pred = (SubLObject)removal_modules_denotes.NIL;
            spec_pred = cdolist_list_var.first();
            while (removal_modules_denotes.NIL != cdolist_list_var) {
                cost = Numbers.add(cost, inference_trampolines.inference_num_gaf_lookup_index((SubLObject)ConsesLow.list(spec_pred, arg1, arg2), sense));
                cdolist_list_var = cdolist_list_var.rest();
                spec_pred = cdolist_list_var.first();
            }
        }
        return cost;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 2851L)
    public static SubLObject removal_means_correct_arg2(final SubLObject pred, final SubLObject arg2) {
        if (pred.eql(removal_modules_denotes.$const0$means)) {
            return cycl_grammar.cycl_term_p(arg2);
        }
        if (pred.eql(removal_modules_denotes.$const12$expresses)) {
            return cycl_grammar.cycl_sentence_p(arg2);
        }
        if (pred.eql(removal_modules_denotes.$const13$denotes)) {
            return cycl_grammar.cycl_denotational_term_p(arg2);
        }
        return (SubLObject)removal_modules_denotes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 3078L)
    public static SubLObject removal_means_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_denotes.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_denotes.UNPROVIDED);
        if (removal_modules_denotes.NIL == removal_means_correct_arg2(pred, arg2)) {
            return (SubLObject)removal_modules_denotes.NIL;
        }
        if (removal_modules_denotes.NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            return removal_means_check_pos_quoted_expand(pred, arg1, arg2, (SubLObject)removal_modules_denotes.NIL);
        }
        return removal_means_check_lookup_expand(asent, (SubLObject)removal_modules_denotes.$kw2$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 3528L)
    public static SubLObject removal_means_check_pos_quoted_expand(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject use_quasiquoteP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canon_term = (removal_modules_denotes.NIL != variables.variable_p(arg1)) ? arg1 : czer_main.canonicalize_quoted_term(arg1, (SubLObject)removal_modules_denotes.T);
        final SubLObject quoted_term = (SubLObject)((removal_modules_denotes.NIL != use_quasiquoteP) ? ConsesLow.list(removal_modules_denotes.$const14$QuasiQuote, arg2) : ConsesLow.list(removal_modules_denotes.$const15$Quote, arg2));
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(canon_term, quoted_term, (SubLObject)removal_modules_denotes.T, (SubLObject)removal_modules_denotes.T);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_denotes.NIL != v_bindings) {
            final SubLObject unified_term = bindings.subst_bindings(v_bindings, canon_term);
            final SubLObject unified_asent = (SubLObject)ConsesLow.list(pred, unified_term, arg2);
            return backward.removal_add_node(make_means_support(unified_asent), v_bindings, unify_justification);
        }
        return (SubLObject)removal_modules_denotes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 4114L)
    public static SubLObject removal_means_check_lookup_expand(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, sense);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql((SubLObject)removal_modules_denotes.$kw16$GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_denotes.NIL != argnum) {
                if (removal_modules_denotes.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_denotes.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_denotes.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_denotes.NIL;
                        while (removal_modules_denotes.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_denotes.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_denotes.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_denotes.$kw17$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_denotes.NIL);
                                    SubLObject done_var_$1 = (SubLObject)removal_modules_denotes.NIL;
                                    final SubLObject token_var_$2 = (SubLObject)removal_modules_denotes.NIL;
                                    while (removal_modules_denotes.NIL == done_var_$1) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                        final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(assertion));
                                        if (removal_modules_denotes.NIL != valid_$3) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                        }
                                        done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid_$3);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_denotes.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (removal_modules_denotes.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_denotes.NIL;
                    if (removal_modules_denotes.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_denotes.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_denotes.NIL;
                        while (removal_modules_denotes.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_denotes.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_denotes.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_denotes.$kw17$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_denotes.NIL);
                                    SubLObject done_var_$2 = (SubLObject)removal_modules_denotes.NIL;
                                    final SubLObject token_var_$3 = (SubLObject)removal_modules_denotes.NIL;
                                    while (removal_modules_denotes.NIL == done_var_$2) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(assertion));
                                        if (removal_modules_denotes.NIL != valid_$4) {
                                            removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                        }
                                        done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid_$4);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_denotes.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_denotes.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid);
                        }
                    }
                }
            }
            else if (removal_modules_denotes.NIL != predicate) {
                final SubLObject pred_var = predicate;
                if (removal_modules_denotes.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_denotes.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_denotes.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_denotes.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_denotes.NIL;
                    while (removal_modules_denotes.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_denotes.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_denotes.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_denotes.$kw17$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_denotes.NIL);
                                SubLObject done_var_$3 = (SubLObject)removal_modules_denotes.NIL;
                                final SubLObject token_var_$4 = (SubLObject)removal_modules_denotes.NIL;
                                while (removal_modules_denotes.NIL == done_var_$3) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                    final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(assertion));
                                    if (removal_modules_denotes.NIL != valid_$5) {
                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                    }
                                    done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid_$5);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_denotes.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (removal_modules_denotes.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid);
                    }
                }
            }
            else {
                final SubLObject pred_var = (SubLObject)removal_modules_denotes.NIL;
                if (removal_modules_denotes.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_denotes.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_denotes.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_denotes.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_denotes.NIL;
                    while (removal_modules_denotes.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_denotes.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_denotes.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_denotes.$kw17$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_denotes.NIL);
                                SubLObject done_var_$4 = (SubLObject)removal_modules_denotes.NIL;
                                final SubLObject token_var_$5 = (SubLObject)removal_modules_denotes.NIL;
                                while (removal_modules_denotes.NIL == done_var_$4) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                    final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(assertion));
                                    if (removal_modules_denotes.NIL != valid_$6) {
                                        removal_modules_lookup.removal_lookup_expand_internal(assertion, asent);
                                    }
                                    done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid_$6);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_denotes.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (removal_modules_denotes.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_denotes.$kw18$PREDICATE_EXTENT)) {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (removal_modules_denotes.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                final SubLObject str = (SubLObject)removal_modules_denotes.NIL;
                final SubLObject _prev_bind_5 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_9 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_11 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_denotes.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_denotes.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)removal_modules_denotes.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_denotes.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_denotes.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_denotes.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = (SubLObject)removal_modules_denotes.NIL;
                    final SubLObject token_var2 = (SubLObject)removal_modules_denotes.NIL;
                    while (removal_modules_denotes.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (removal_modules_denotes.NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = (SubLObject)removal_modules_denotes.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_denotes.$kw17$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_denotes.NIL);
                                SubLObject done_var_$5 = (SubLObject)removal_modules_denotes.NIL;
                                final SubLObject token_var_$6 = (SubLObject)removal_modules_denotes.NIL;
                                while (removal_modules_denotes.NIL == done_var_$5) {
                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                    final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(assertion2));
                                    if (removal_modules_denotes.NIL != valid_$7) {
                                        removal_modules_lookup.removal_lookup_expand_internal(assertion2, asent);
                                    }
                                    done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid_$7);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_denotes.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (removal_modules_denotes.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid2);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_12, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_11, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_10, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_9, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_8, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_5, thread);
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_denotes.$kw19$OVERLAP)) {
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_denotes.UNPROVIDED);
            SubLObject assertion3 = (SubLObject)removal_modules_denotes.NIL;
            assertion3 = cdolist_list_var.first();
            while (removal_modules_denotes.NIL != cdolist_list_var) {
                if (removal_modules_denotes.NIL == enumeration_types.sense_truth(sense) || removal_modules_denotes.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth(sense))) {
                    removal_modules_lookup.removal_lookup_expand_internal(assertion3, asent);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion3 = cdolist_list_var.first();
            }
        }
        else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject arg1 = (SubLObject)removal_modules_denotes.NIL;
        SubLObject arg2 = (SubLObject)removal_modules_denotes.NIL;
        if (removal_modules_denotes.$const0$means.eql(pred)) {
            arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_denotes.UNPROVIDED);
            arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_denotes.UNPROVIDED);
            SubLObject cdolist_list_var = (SubLObject)removal_modules_denotes.$list11;
            SubLObject spec_pred = (SubLObject)removal_modules_denotes.NIL;
            spec_pred = cdolist_list_var.first();
            while (removal_modules_denotes.NIL != cdolist_list_var) {
                final SubLObject spec_asent = (SubLObject)ConsesLow.list(spec_pred, arg1, arg2);
                final SubLObject l_index2 = inference_trampolines.inference_gaf_lookup_index(spec_asent, sense);
                final SubLObject pcase_var2;
                final SubLObject method2 = pcase_var2 = kb_mapping_macros.do_gli_extract_method(l_index2);
                if (pcase_var2.eql((SubLObject)removal_modules_denotes.$kw16$GAF_ARG)) {
                    thread.resetMultipleValues();
                    final SubLObject v_term2 = kb_mapping_macros.do_gli_vga_extract_keys(l_index2);
                    final SubLObject argnum2 = thread.secondMultipleValue();
                    final SubLObject predicate2 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (removal_modules_denotes.NIL != argnum2) {
                        if (removal_modules_denotes.NIL != predicate2) {
                            final SubLObject pred_var3 = predicate2;
                            if (removal_modules_denotes.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum2, pred_var3)) {
                                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum2, pred_var3);
                                SubLObject done_var2 = (SubLObject)removal_modules_denotes.NIL;
                                final SubLObject token_var2 = (SubLObject)removal_modules_denotes.NIL;
                                while (removal_modules_denotes.NIL == done_var2) {
                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                    final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                    if (removal_modules_denotes.NIL != valid2) {
                                        SubLObject final_index_iterator2 = (SubLObject)removal_modules_denotes.NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_denotes.$kw17$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_denotes.NIL);
                                            SubLObject done_var_$6 = (SubLObject)removal_modules_denotes.NIL;
                                            final SubLObject token_var_$7 = (SubLObject)removal_modules_denotes.NIL;
                                            while (removal_modules_denotes.NIL == done_var_$6) {
                                                final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$7);
                                                final SubLObject valid_$8 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$7.eql(assertion2));
                                                if (removal_modules_denotes.NIL != valid_$8) {
                                                    removal_modules_lookup.removal_lookup_expand_internal(assertion2, spec_asent);
                                                }
                                                done_var_$6 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid_$8);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_denotes.T, thread);
                                                final SubLObject _values6 = Values.getValuesAsVector();
                                                if (removal_modules_denotes.NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                Values.restoreValuesFromVector(_values6);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_13, thread);
                                            }
                                        }
                                    }
                                    done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid2);
                                }
                            }
                        }
                        else {
                            final SubLObject pred_var3 = (SubLObject)removal_modules_denotes.NIL;
                            if (removal_modules_denotes.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum2, pred_var3)) {
                                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum2, pred_var3);
                                SubLObject done_var2 = (SubLObject)removal_modules_denotes.NIL;
                                final SubLObject token_var2 = (SubLObject)removal_modules_denotes.NIL;
                                while (removal_modules_denotes.NIL == done_var2) {
                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                    final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                    if (removal_modules_denotes.NIL != valid2) {
                                        SubLObject final_index_iterator2 = (SubLObject)removal_modules_denotes.NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_denotes.$kw17$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_denotes.NIL);
                                            SubLObject done_var_$7 = (SubLObject)removal_modules_denotes.NIL;
                                            final SubLObject token_var_$8 = (SubLObject)removal_modules_denotes.NIL;
                                            while (removal_modules_denotes.NIL == done_var_$7) {
                                                final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$8);
                                                final SubLObject valid_$9 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$8.eql(assertion2));
                                                if (removal_modules_denotes.NIL != valid_$9) {
                                                    removal_modules_lookup.removal_lookup_expand_internal(assertion2, spec_asent);
                                                }
                                                done_var_$7 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid_$9);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_denotes.T, thread);
                                                final SubLObject _values7 = Values.getValuesAsVector();
                                                if (removal_modules_denotes.NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                Values.restoreValuesFromVector(_values7);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_14, thread);
                                            }
                                        }
                                    }
                                    done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid2);
                                }
                            }
                        }
                    }
                    else if (removal_modules_denotes.NIL != predicate2) {
                        final SubLObject pred_var3 = predicate2;
                        if (removal_modules_denotes.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, (SubLObject)removal_modules_denotes.NIL, pred_var3)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, (SubLObject)removal_modules_denotes.NIL, pred_var3);
                            SubLObject done_var2 = (SubLObject)removal_modules_denotes.NIL;
                            final SubLObject token_var2 = (SubLObject)removal_modules_denotes.NIL;
                            while (removal_modules_denotes.NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                if (removal_modules_denotes.NIL != valid2) {
                                    SubLObject final_index_iterator2 = (SubLObject)removal_modules_denotes.NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_denotes.$kw17$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_denotes.NIL);
                                        SubLObject done_var_$8 = (SubLObject)removal_modules_denotes.NIL;
                                        final SubLObject token_var_$9 = (SubLObject)removal_modules_denotes.NIL;
                                        while (removal_modules_denotes.NIL == done_var_$8) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$9);
                                            final SubLObject valid_$10 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$9.eql(assertion2));
                                            if (removal_modules_denotes.NIL != valid_$10) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion2, spec_asent);
                                            }
                                            done_var_$8 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid_$10);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_denotes.T, thread);
                                            final SubLObject _values8 = Values.getValuesAsVector();
                                            if (removal_modules_denotes.NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            Values.restoreValuesFromVector(_values8);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_15, thread);
                                        }
                                    }
                                }
                                done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid2);
                            }
                        }
                    }
                    else {
                        final SubLObject pred_var3 = (SubLObject)removal_modules_denotes.NIL;
                        if (removal_modules_denotes.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, (SubLObject)removal_modules_denotes.NIL, pred_var3)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, (SubLObject)removal_modules_denotes.NIL, pred_var3);
                            SubLObject done_var2 = (SubLObject)removal_modules_denotes.NIL;
                            final SubLObject token_var2 = (SubLObject)removal_modules_denotes.NIL;
                            while (removal_modules_denotes.NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                if (removal_modules_denotes.NIL != valid2) {
                                    SubLObject final_index_iterator2 = (SubLObject)removal_modules_denotes.NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_denotes.$kw17$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_denotes.NIL);
                                        SubLObject done_var_$9 = (SubLObject)removal_modules_denotes.NIL;
                                        final SubLObject token_var_$10 = (SubLObject)removal_modules_denotes.NIL;
                                        while (removal_modules_denotes.NIL == done_var_$9) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$10);
                                            final SubLObject valid_$11 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$10.eql(assertion2));
                                            if (removal_modules_denotes.NIL != valid_$11) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion2, spec_asent);
                                            }
                                            done_var_$9 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid_$11);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_denotes.T, thread);
                                            final SubLObject _values9 = Values.getValuesAsVector();
                                            if (removal_modules_denotes.NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            Values.restoreValuesFromVector(_values9);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_16, thread);
                                        }
                                    }
                                }
                                done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid2);
                            }
                        }
                    }
                }
                else if (pcase_var2.eql((SubLObject)removal_modules_denotes.$kw18$PREDICATE_EXTENT)) {
                    final SubLObject pred_var4 = kb_mapping_macros.do_gli_vpe_extract_key(l_index2);
                    if (removal_modules_denotes.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var4)) {
                        final SubLObject str2 = (SubLObject)removal_modules_denotes.NIL;
                        final SubLObject _prev_bind_17 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_18 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_19 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_20 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_21 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_22 = utilities_macros.$progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_23 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_24 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_denotes.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_denotes.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)removal_modules_denotes.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_denotes.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_denotes.NIL != str2) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_denotes.T), thread);
                            utilities_macros.noting_progress_preamble(str2);
                            final SubLObject iterator_var3 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var4);
                            SubLObject done_var3 = (SubLObject)removal_modules_denotes.NIL;
                            final SubLObject token_var3 = (SubLObject)removal_modules_denotes.NIL;
                            while (removal_modules_denotes.NIL == done_var3) {
                                final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                                final SubLObject valid3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var3.eql(final_index_spec3));
                                if (removal_modules_denotes.NIL != valid3) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator3 = (SubLObject)removal_modules_denotes.NIL;
                                    try {
                                        final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, (SubLObject)removal_modules_denotes.$kw17$GAF, enumeration_types.sense_truth(sense), (SubLObject)removal_modules_denotes.NIL);
                                        SubLObject done_var_$10 = (SubLObject)removal_modules_denotes.NIL;
                                        final SubLObject token_var_$11 = (SubLObject)removal_modules_denotes.NIL;
                                        while (removal_modules_denotes.NIL == done_var_$10) {
                                            final SubLObject assertion4 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$11);
                                            final SubLObject valid_$12 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$11.eql(assertion4));
                                            if (removal_modules_denotes.NIL != valid_$12) {
                                                removal_modules_lookup.removal_lookup_expand_internal(assertion4, spec_asent);
                                            }
                                            done_var_$10 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid_$12);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_denotes.T, thread);
                                            final SubLObject _values10 = Values.getValuesAsVector();
                                            if (removal_modules_denotes.NIL != final_index_iterator3) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                            }
                                            Values.restoreValuesFromVector(_values10);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                        }
                                    }
                                }
                                done_var3 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_denotes.NIL == valid3);
                            }
                            utilities_macros.noting_progress_postamble();
                        }
                        finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_24, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_23, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_22, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_21, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_20, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_19, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_18, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_17, thread);
                        }
                    }
                }
                else if (pcase_var2.eql((SubLObject)removal_modules_denotes.$kw19$OVERLAP)) {
                    SubLObject cdolist_list_var_$33 = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index2), (SubLObject)removal_modules_denotes.UNPROVIDED);
                    SubLObject assertion5 = (SubLObject)removal_modules_denotes.NIL;
                    assertion5 = cdolist_list_var_$33.first();
                    while (removal_modules_denotes.NIL != cdolist_list_var_$33) {
                        if (removal_modules_denotes.NIL == enumeration_types.sense_truth(sense) || removal_modules_denotes.NIL != assertions_high.assertion_has_truth(assertion5, enumeration_types.sense_truth(sense))) {
                            removal_modules_lookup.removal_lookup_expand_internal(assertion5, spec_asent);
                        }
                        cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                        assertion5 = cdolist_list_var_$33.first();
                    }
                }
                else {
                    kb_mapping_macros.do_gli_method_error(l_index2, method2);
                }
                cdolist_list_var = cdolist_list_var.rest();
                spec_pred = cdolist_list_var.first();
            }
        }
        return (SubLObject)removal_modules_denotes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 5582L)
    public static SubLObject removal_means_unify_arg1_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_denotes.UNPROVIDED);
        if (removal_modules_denotes.NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            return (SubLObject)removal_modules_denotes.ONE_INTEGER;
        }
        return Numbers.add((SubLObject)removal_modules_denotes.ONE_INTEGER, removal_means_lookup_cost(asent, (SubLObject)removal_modules_denotes.$kw2$POS));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 5834L)
    public static SubLObject removal_means_unify_arg1_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_denotes.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_denotes.UNPROVIDED);
        if (removal_modules_denotes.NIL == removal_means_correct_arg2(pred, arg2)) {
            return (SubLObject)removal_modules_denotes.NIL;
        }
        if (removal_modules_denotes.NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            removal_means_check_pos_quoted_expand(pred, arg1, arg2, (SubLObject)removal_modules_denotes.NIL);
        }
        else {
            if (removal_modules_denotes.NIL != variables.variable_p(arg1)) {
                removal_means_check_pos_quoted_expand(pred, arg1, arg2, (SubLObject)removal_modules_denotes.NIL);
            }
            else {
                removal_means_check_pos_quoted_expand(pred, arg1, arg2, (SubLObject)removal_modules_denotes.T);
            }
            removal_means_check_lookup_expand(asent, (SubLObject)removal_modules_denotes.$kw2$POS);
        }
        return (SubLObject)removal_modules_denotes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 6964L)
    public static SubLObject removal_means_unify_arg2_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_denotes.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_denotes.UNPROVIDED);
        if (removal_modules_denotes.NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            return removal_means_unify_arg2_pos_quoted_expand(pred, arg1, arg2);
        }
        return removal_means_check_lookup_expand(asent, (SubLObject)removal_modules_denotes.$kw2$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 7351L)
    public static SubLObject removal_means_unify_arg2_pos_quoted_expand(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unquoted_term = cycl_utilities.formula_arg1(czer_main.canonicalize_quoted_term(arg1, (SubLObject)removal_modules_denotes.UNPROVIDED), (SubLObject)removal_modules_denotes.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(unquoted_term, arg2, (SubLObject)removal_modules_denotes.T, (SubLObject)removal_modules_denotes.T);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_denotes.NIL != v_bindings) {
            final SubLObject unified_term = bindings.subst_bindings(v_bindings, arg2);
            SubLObject unified_asent = (SubLObject)removal_modules_denotes.NIL;
            if (removal_modules_denotes.NIL != removal_means_correct_arg2(pred, unified_term)) {
                unified_asent = (SubLObject)ConsesLow.list(pred, arg1, unified_term);
                return backward.removal_add_node(make_means_support(unified_asent), v_bindings, unify_justification);
            }
        }
        return (SubLObject)removal_modules_denotes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 8620L)
    public static SubLObject removal_means_arg1_isaP(final SubLObject pred, final SubLObject arg1) {
        if (pred.eql(removal_modules_denotes.$const0$means)) {
            return isa.isaP(arg1, removal_modules_denotes.$const26$CycLTerm, (SubLObject)removal_modules_denotes.UNPROVIDED, (SubLObject)removal_modules_denotes.UNPROVIDED);
        }
        if (pred.eql(removal_modules_denotes.$const13$denotes)) {
            return isa.isaP(arg1, removal_modules_denotes.$const27$CycLDenotationalTerm, (SubLObject)removal_modules_denotes.UNPROVIDED, (SubLObject)removal_modules_denotes.UNPROVIDED);
        }
        if (pred.eql(removal_modules_denotes.$const12$expresses)) {
            return isa.isaP(arg1, removal_modules_denotes.$const28$CycLSentence, (SubLObject)removal_modules_denotes.UNPROVIDED, (SubLObject)removal_modules_denotes.UNPROVIDED);
        }
        return (SubLObject)removal_modules_denotes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 8855L)
    public static SubLObject removal_means_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_denotes.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_denotes.UNPROVIDED);
        if (removal_modules_denotes.NIL != variables.fully_bound_p(arg1) && removal_modules_denotes.NIL == removal_means_correct_arg2(pred, arg2)) {
            return backward.removal_add_node(make_means_support(cycl_utilities.negate(asent)), (SubLObject)removal_modules_denotes.NIL, (SubLObject)removal_modules_denotes.UNPROVIDED);
        }
        if (removal_modules_denotes.NIL != cycl_grammar.fast_cycl_quoted_term_p(arg1)) {
            return removal_means_neg_quoted_expand(asent, arg1, arg2);
        }
        if (removal_modules_denotes.NIL != removal_means_arg1_isaP(pred, arg1)) {
            return removal_means_check_lookup_expand(asent, (SubLObject)removal_modules_denotes.$kw3$NEG);
        }
        return backward.removal_add_node(make_means_support(cycl_utilities.negate(asent)), (SubLObject)removal_modules_denotes.NIL, (SubLObject)removal_modules_denotes.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 9505L)
    public static SubLObject removal_means_neg_quoted_expand(final SubLObject asent, final SubLObject arg1, final SubLObject arg2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canon_term = czer_main.canonicalize_quoted_term(arg1, (SubLObject)removal_modules_denotes.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(canon_term, (SubLObject)ConsesLow.list(removal_modules_denotes.$const15$Quote, arg2), (SubLObject)removal_modules_denotes.UNPROVIDED, (SubLObject)removal_modules_denotes.UNPROVIDED);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_denotes.NIL == v_bindings) {
            return backward.removal_add_node(make_means_support(cycl_utilities.negate(asent)), (SubLObject)removal_modules_denotes.NIL, (SubLObject)removal_modules_denotes.UNPROVIDED);
        }
        return (SubLObject)removal_modules_denotes.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 11140L)
    public static SubLObject removal_denotes_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        return removal_means_check_pos_cost(asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 11264L)
    public static SubLObject removal_denotes_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        return removal_means_check_pos_expand(asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 12057L)
    public static SubLObject removal_denotes_unify_arg1_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        return removal_means_unify_arg1_pos_cost(asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 12191L)
    public static SubLObject removal_denotes_unify_arg1_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        return removal_means_unify_arg1_pos_expand(asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 12782L)
    public static SubLObject removal_denotes_unify_arg2_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        return removal_means_unify_arg2_pos_expand(asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 13446L)
    public static SubLObject removal_denotes_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        return removal_means_neg_expand(asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 14936L)
    public static SubLObject removal_expresses_check_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        return removal_means_check_pos_cost(asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 15062L)
    public static SubLObject removal_expresses_check_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        return removal_means_check_pos_expand(asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 15960L)
    public static SubLObject removal_expresses_unify_arg1_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        return removal_means_unify_arg1_pos_cost(asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 16096L)
    public static SubLObject removal_expresses_unify_arg1_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        return removal_means_unify_arg1_pos_expand(asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 16716L)
    public static SubLObject removal_expresses_unify_arg2_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        return removal_means_unify_arg2_pos_expand(asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-denotes.lisp", position = 17485L)
    public static SubLObject removal_expresses_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_denotes.UNPROVIDED) {
            sense = (SubLObject)removal_modules_denotes.NIL;
        }
        return removal_means_neg_expand(asent, sense);
    }
    
    public static SubLObject declare_removal_modules_denotes_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "make_means_support", "MAKE-MEANS-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_means_check_pos_cost", "REMOVAL-MEANS-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_means_lookup_cost", "REMOVAL-MEANS-LOOKUP-COST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_means_correct_arg2", "REMOVAL-MEANS-CORRECT-ARG2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_means_check_pos_expand", "REMOVAL-MEANS-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_means_check_pos_quoted_expand", "REMOVAL-MEANS-CHECK-POS-QUOTED-EXPAND", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_means_check_lookup_expand", "REMOVAL-MEANS-CHECK-LOOKUP-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_means_unify_arg1_pos_cost", "REMOVAL-MEANS-UNIFY-ARG1-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_means_unify_arg1_pos_expand", "REMOVAL-MEANS-UNIFY-ARG1-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_means_unify_arg2_pos_expand", "REMOVAL-MEANS-UNIFY-ARG2-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_means_unify_arg2_pos_quoted_expand", "REMOVAL-MEANS-UNIFY-ARG2-POS-QUOTED-EXPAND", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_means_arg1_isaP", "REMOVAL-MEANS-ARG1-ISA?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_means_neg_expand", "REMOVAL-MEANS-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_means_neg_quoted_expand", "REMOVAL-MEANS-NEG-QUOTED-EXPAND", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_denotes_check_pos_cost", "REMOVAL-DENOTES-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_denotes_check_pos_expand", "REMOVAL-DENOTES-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_denotes_unify_arg1_pos_cost", "REMOVAL-DENOTES-UNIFY-ARG1-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_denotes_unify_arg1_pos_expand", "REMOVAL-DENOTES-UNIFY-ARG1-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_denotes_unify_arg2_pos_expand", "REMOVAL-DENOTES-UNIFY-ARG2-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_denotes_neg_expand", "REMOVAL-DENOTES-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_expresses_check_pos_cost", "REMOVAL-EXPRESSES-CHECK-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_expresses_check_pos_expand", "REMOVAL-EXPRESSES-CHECK-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_expresses_unify_arg1_pos_cost", "REMOVAL-EXPRESSES-UNIFY-ARG1-POS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_expresses_unify_arg1_pos_expand", "REMOVAL-EXPRESSES-UNIFY-ARG1-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_expresses_unify_arg2_pos_expand", "REMOVAL-EXPRESSES-UNIFY-ARG2-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_denotes", "removal_expresses_neg_expand", "REMOVAL-EXPRESSES-NEG-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_denotes.NIL;
    }
    
    public static SubLObject init_removal_modules_denotes_file() {
        return (SubLObject)removal_modules_denotes.NIL;
    }
    
    public static SubLObject setup_removal_modules_denotes_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_denotes.$const0$means);
        inference_modules.inference_removal_module_dont_use_universal(removal_modules_denotes.$const0$means, (SubLObject)removal_modules_denotes.$kw1$REMOVAL_NON_WFF_CHECK_NEG);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_denotes.$kw2$POS, removal_modules_denotes.$const0$means);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_denotes.$kw3$NEG, removal_modules_denotes.$const0$means, (SubLObject)removal_modules_denotes.TWO_INTEGER);
        preference_modules.inference_preference_module((SubLObject)removal_modules_denotes.$kw4$MEANS_UNIFY_ARG1_POS, (SubLObject)removal_modules_denotes.$list5);
        preference_modules.inference_preference_module((SubLObject)removal_modules_denotes.$kw6$MEANS_UNIFY_ARG1_NEG, (SubLObject)removal_modules_denotes.$list7);
        inference_modules.inference_removal_module((SubLObject)removal_modules_denotes.$kw8$REMOVAL_MEANS_CHECK_POS, (SubLObject)removal_modules_denotes.$list9);
        inference_modules.inference_removal_module((SubLObject)removal_modules_denotes.$kw20$REMOVAL_MEANS_UNIFY_ARG1_POS, (SubLObject)removal_modules_denotes.$list21);
        inference_modules.inference_removal_module((SubLObject)removal_modules_denotes.$kw22$REMOVAL_MEANS_UNIFY_ARG2_POS, (SubLObject)removal_modules_denotes.$list23);
        inference_modules.inference_removal_module((SubLObject)removal_modules_denotes.$kw24$REMOVAL_MEANS_NEG, (SubLObject)removal_modules_denotes.$list25);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_denotes.$const13$denotes);
        inference_modules.inference_removal_module_dont_use_universal(removal_modules_denotes.$const13$denotes, (SubLObject)removal_modules_denotes.$kw1$REMOVAL_NON_WFF_CHECK_NEG);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_denotes.$kw2$POS, removal_modules_denotes.$const13$denotes);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_denotes.$kw3$NEG, removal_modules_denotes.$const13$denotes, (SubLObject)removal_modules_denotes.TWO_INTEGER);
        preference_modules.inference_preference_module((SubLObject)removal_modules_denotes.$kw29$DENOTES_UNIFY_ARG1_POS, (SubLObject)removal_modules_denotes.$list30);
        preference_modules.inference_preference_module((SubLObject)removal_modules_denotes.$kw31$DENOTES_UNIFY_ARG1_NEG, (SubLObject)removal_modules_denotes.$list32);
        inference_modules.inference_removal_module((SubLObject)removal_modules_denotes.$kw33$REMOVAL_DENOTES_CHECK_POS, (SubLObject)removal_modules_denotes.$list34);
        inference_modules.inference_removal_module((SubLObject)removal_modules_denotes.$kw35$REMOVAL_DENOTES_UNIFY_ARG1_POS, (SubLObject)removal_modules_denotes.$list36);
        inference_modules.inference_removal_module((SubLObject)removal_modules_denotes.$kw37$REMOVAL_DENOTES_UNIFY_ARG2_POS, (SubLObject)removal_modules_denotes.$list38);
        inference_modules.inference_removal_module((SubLObject)removal_modules_denotes.$kw39$REMOVAL_DENOTES_NEG, (SubLObject)removal_modules_denotes.$list40);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_denotes.$const12$expresses);
        inference_modules.inference_removal_module_dont_use_universal(removal_modules_denotes.$const12$expresses, (SubLObject)removal_modules_denotes.$kw1$REMOVAL_NON_WFF_CHECK_NEG);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_denotes.$kw2$POS, removal_modules_denotes.$const12$expresses);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_denotes.$kw3$NEG, removal_modules_denotes.$const12$expresses, (SubLObject)removal_modules_denotes.TWO_INTEGER);
        preference_modules.inference_preference_module((SubLObject)removal_modules_denotes.$kw41$EXPRESSES_UNIFY_ARG1_POS, (SubLObject)removal_modules_denotes.$list42);
        preference_modules.inference_preference_module((SubLObject)removal_modules_denotes.$kw43$EXPRESSES_UNIFY_ARG1_NEG, (SubLObject)removal_modules_denotes.$list44);
        inference_modules.inference_removal_module((SubLObject)removal_modules_denotes.$kw45$REMOVAL_EXPRESSES_CHECK_POS, (SubLObject)removal_modules_denotes.$list46);
        inference_modules.inference_removal_module((SubLObject)removal_modules_denotes.$kw47$REMOVAL_EXPRESSES_UNIFY_ARG1_POS, (SubLObject)removal_modules_denotes.$list48);
        inference_modules.inference_removal_module((SubLObject)removal_modules_denotes.$kw49$REMOVAL_EXPRESSES_UNIFY_ARG2_POS, (SubLObject)removal_modules_denotes.$list50);
        inference_modules.inference_removal_module((SubLObject)removal_modules_denotes.$kw51$REMOVAL_EXPRESSES_NEG, (SubLObject)removal_modules_denotes.$list52);
        return (SubLObject)removal_modules_denotes.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_denotes_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_denotes_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_denotes_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_denotes();
        $const0$means = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("means"));
        $kw1$REMOVAL_NON_WFF_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-NON-WFF-CHECK-NEG");
        $kw2$POS = SubLObjectFactory.makeKeyword("POS");
        $kw3$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw4$MEANS_UNIFY_ARG1_POS = SubLObjectFactory.makeKeyword("MEANS-UNIFY-ARG1-POS");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("means")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("means")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISPREFERRED"));
        $kw6$MEANS_UNIFY_ARG1_NEG = SubLObjectFactory.makeKeyword("MEANS-UNIFY-ARG1-NEG");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("NEG"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("means")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("means")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISPREFERRED"));
        $kw8$REMOVAL_MEANS_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-MEANS-CHECK-POS");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("means")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("means")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MEANS-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MEANS-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$means <fully-bound quoted term> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$means (#$Quote #$Dog) #$Dog)\n(#$means #$MyFavoriteConstant #$Dog)\n(#$means (#$Quote (#$isa #$Muffet #$Dog)) (#$isa #$Muffet #$Dog))\n(#$means #$MyFavoriteSentence (#$isa #$Muffet #$Dog))") });
        $kw10$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $list11 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expresses")));
        $const12$expresses = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expresses"));
        $const13$denotes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotes"));
        $const14$QuasiQuote = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuasiQuote"));
        $const15$Quote = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Quote"));
        $kw16$GAF_ARG = SubLObjectFactory.makeKeyword("GAF-ARG");
        $kw17$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw18$PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $kw19$OVERLAP = SubLObjectFactory.makeKeyword("OVERLAP");
        $kw20$REMOVAL_MEANS_UNIFY_ARG1_POS = SubLObjectFactory.makeKeyword("REMOVAL-MEANS-UNIFY-ARG1-POS");
        $list21 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("means")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("means")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MEANS-UNIFY-ARG1-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MEANS-UNIFY-ARG1-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$means <not-fully-bound> <fully-bound>) from asserted sentences\n    (#$means <variable> <fully-bound>) by unifying variable with (#$Quote <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$means ?X #$Dog)\n    from assertion (#$denotes #$MyFavoriteConstant #$Dog)\n(#$means ?X (#$isa #$Muffet #$Dog))\n    from assertion (#$expresses #$MyFavoriteSentence (#$isa #$Muffet #$Dog))\n(#$means ?X #$Dog)\n    as (#$denotes (#$Quote #$Dog) #$Dog)\n(#$means ?X (#$isa #$Muffet #$Dog))\n    as (#$expresses (#$Quote (#$isa #$Muffet #$Dog)) (#$isa #$Muffet #$Dog))\n") });
        $kw22$REMOVAL_MEANS_UNIFY_ARG2_POS = SubLObjectFactory.makeKeyword("REMOVAL-MEANS-UNIFY-ARG2-POS");
        $list23 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("means")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("means")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_denotes.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MEANS-UNIFY-ARG2-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$means <fully-bound quoted-term> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$means (#$Quote #$Dog) ?X)\n(#$means #$MyFavoriteConstant ?X)\n(#$means (#$Quote (#$isa #$Muffet #$Dog)) ?X)\n(#$means #$MyFavoriteSentence ?X)") });
        $kw24$REMOVAL_MEANS_NEG = SubLObjectFactory.makeKeyword("REMOVAL-MEANS-NEG");
        $list25 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("means")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("means")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_denotes.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MEANS-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$means <anything> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$means #$Cat #$Dog))\n(#$not (#$means (#$Quote ?X) #$Dog))\n(#$not (#$means (#$Quote (#$EscapeQuote #$Cat)) #$Dog))\n(#$not (#$means #$Cat (#$isa #$Muffet #$Dog)))\n(#$not (#$means (#$isa #$Muffet #$Cat) (#$isa #$Muffet #$Dog)))\n(#$not (#$means (#$Quote ?X) (#$isa #$Muffet #$Dog)))\n(#$not (#$means (#$Quote (#$EscapeQuote (#$isa #$Muffet #$Cat))) (#$isa #$Muffet #$Dog)))") });
        $const26$CycLTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLTerm"));
        $const27$CycLDenotationalTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLDenotationalTerm"));
        $const28$CycLSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLSentence"));
        $kw29$DENOTES_UNIFY_ARG1_POS = SubLObjectFactory.makeKeyword("DENOTES-UNIFY-ARG1-POS");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotes")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotes")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISPREFERRED"));
        $kw31$DENOTES_UNIFY_ARG1_NEG = SubLObjectFactory.makeKeyword("DENOTES-UNIFY-ARG1-NEG");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("NEG"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotes")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotes")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISPREFERRED"));
        $kw33$REMOVAL_DENOTES_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-DENOTES-CHECK-POS");
        $list34 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotes")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotes")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-DENOTES-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-DENOTES-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$denotes <fully-bound quoted term> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$denotes (#$Quote #$Dog) #$Dog)\n(#$denotes #$MyFavoriteConstant #$Dog)") });
        $kw35$REMOVAL_DENOTES_UNIFY_ARG1_POS = SubLObjectFactory.makeKeyword("REMOVAL-DENOTES-UNIFY-ARG1-POS");
        $list36 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotes")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotes")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-DENOTES-UNIFY-ARG1-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-DENOTES-UNIFY-ARG1-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$denotes <not-fully-bound> <fully-bound>) from asserted sentences\n    (#$denotes <variable> <fully-bound>) by unifying variable with (#$Quote <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$denotes ?X #$Dog)\n    from assertion (#$denotes #$MyFavoriteConstant #$Dog)\n\n    (#$denotes ?X #$Dog)\n    as (#$denotes (#$Quote #$Dog) #$Dog)") });
        $kw37$REMOVAL_DENOTES_UNIFY_ARG2_POS = SubLObjectFactory.makeKeyword("REMOVAL-DENOTES-UNIFY-ARG2-POS");
        $list38 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotes")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotes")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_denotes.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-DENOTES-UNIFY-ARG2-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$denotes <fully-bound quoted-term> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$denotes (#$Quote #$Dog) ?X)\n    (#$denotes #$MyFavoriteConstant ?X)") });
        $kw39$REMOVAL_DENOTES_NEG = SubLObjectFactory.makeKeyword("REMOVAL-DENOTES-NEG");
        $list40 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotes")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotes")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_denotes.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-DENOTES-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$denotes <anything> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$denotes #$Cat #$Dog))\n(#$not (#$denotes #$Cat (#$isa #$Muffet #$Dog)))\n(#$not (#$denotes (#$Quote ?X) #$Dog))\n(#$not (#$denotes (#$Quote (#$EscapeQuote #$Cat)) #$Dog))") });
        $kw41$EXPRESSES_UNIFY_ARG1_POS = SubLObjectFactory.makeKeyword("EXPRESSES-UNIFY-ARG1-POS");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expresses")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expresses")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISPREFERRED"));
        $kw43$EXPRESSES_UNIFY_ARG1_NEG = SubLObjectFactory.makeKeyword("EXPRESSES-UNIFY-ARG1-NEG");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("NEG"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expresses")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expresses")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISPREFERRED"));
        $kw45$REMOVAL_EXPRESSES_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-EXPRESSES-CHECK-POS");
        $list46 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expresses")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expresses")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-EXPRESSES-CHECK-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-EXPRESSES-CHECK-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$expresses <fully-bound quoted term> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$expresses (#$Quote (#$isa #$Muffet #$Dog)) (#$isa #$Muffet #$Dog))\n(#$expresses #$MyFavoriteSentence (#$isa #$Muffet #$Dog))") });
        $kw47$REMOVAL_EXPRESSES_UNIFY_ARG1_POS = SubLObjectFactory.makeKeyword("REMOVAL-EXPRESSES-UNIFY-ARG1-POS");
        $list48 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expresses")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expresses")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-EXPRESSES-UNIFY-ARG1-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-EXPRESSES-UNIFY-ARG1-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$expresses <not-fully-bound> <fully-bound>) from asserted sentences\n    (#$expresses <variable> <fully-bound>) by unifying variable with (#$Quote <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$expresses ?X (#$isa #$Muffet #$Dog))\n    from assertion (#$expresses #$MyFavoriteSentence (#$isa #$Muffet #$Dog))\n\n(#$expresses ?X (#$isa #$Muffet #$Dog))\n    as (#$expresses (#$Quote (#$isa #$Muffet #$Dog)) (#$isa #$Muffet #$Dog))") });
        $kw49$REMOVAL_EXPRESSES_UNIFY_ARG2_POS = SubLObjectFactory.makeKeyword("REMOVAL-EXPRESSES-UNIFY-ARG2-POS");
        $list50 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expresses")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expresses")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_denotes.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-EXPRESSES-UNIFY-ARG2-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$expresses <fully-bound quoted-term> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$expresses (#$Quote (#$isa #$Muffet #$Dog)) ?X)\n(#$expresses #$MyFavoriteSentence ?X)") });
        $kw51$REMOVAL_EXPRESSES_NEG = SubLObjectFactory.makeKeyword("REMOVAL-EXPRESSES-NEG");
        $list52 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expresses")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expresses")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_denotes.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-EXPRESSES-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$expresses <anything> <fully-bound>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$expresses #$Cat (#$isa #$Muffet #$Dog)))\n(#$not (#$expresses (#$isa #$Muffet #$Cat) (#$isa #$Muffet #$Dog)))\n(#$not (#$expresses (#$Quote ?X) (#$isa #$Muffet #$Dog)))\n(#$not (#$expresses (#$Quote (#$EscapeQuote (#$isa #$Muffet #$Cat))) (#$isa #$Muffet #$Dog)))") });
    }
}

/*

	Total time: 1134 ms
	
*/