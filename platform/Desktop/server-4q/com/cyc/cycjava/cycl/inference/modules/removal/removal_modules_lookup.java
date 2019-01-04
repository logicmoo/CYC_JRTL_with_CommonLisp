package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.inference.inference_completeness_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_lookup extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup";
    public static final String myFingerPrint = "2f1559201bb3ce65a5b5b2f0a14e34e3fc30af0dfd1577d5ce59048102611a35";
    private static final SubLSymbol $kw0$POS;
    private static final SubLSymbol $kw1$GAF_ARG;
    private static final SubLSymbol $kw2$GAF;
    private static final SubLSymbol $kw3$PREDICATE_EXTENT;
    private static final SubLSymbol $kw4$OVERLAP;
    private static final SubLSymbol $kw5$REMOVAL_LOOKUP_POS;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$NEG;
    private static final SubLSymbol $kw8$GROSSLY_INCOMPLETE;
    private static final SubLSymbol $kw9$INCOMPLETE;
    private static final SubLSymbol $kw10$REMOVAL_LOOKUP_NEG;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const13$EverythingPSC;
    private static final SubLSymbol $kw14$REMOVAL_PRED_UNBOUND;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$PRED_UNBOUND_POS;
    private static final SubLList $list17;
    private static final SubLSymbol $kw18$GROSSLY_DISPREFERRED;
    private static final SubLSymbol $kw19$DISALLOWED;
    private static final SubLSymbol $sym20$INDEXED_TERM_P;
    private static final SubLSymbol $sym21$FORT_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 882L)
    public static SubLObject removal_lookup_pos_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lookup.NIL;
        }
        if (removal_modules_lookup.NIL != variables.fully_bound_p(asent)) {
            return control_vars.$cheap_hl_module_check_cost$.getGlobalValue();
        }
        return inference_trampolines.inference_num_gaf_lookup_index(asent, (SubLObject)removal_modules_lookup.$kw0$POS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 1589L)
    public static SubLObject removal_completely_asserted_asentP(final SubLObject asent) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL != inference_completeness_utilities.inference_completely_asserted_asentP(asent, mt_relevance_macros.inference_relevant_mt()) && removal_modules_lookup.NIL == kb_utilities.at_least_partially_commutative_predicate_p(cycl_utilities.atomic_sentence_predicate(asent)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 1828L)
    public static SubLObject removal_lookup_pos_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_lookup.NIL;
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, (SubLObject)removal_modules_lookup.$kw0$POS);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql((SubLObject)removal_modules_lookup.$kw1$GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_lookup.NIL != argnum) {
                if (removal_modules_lookup.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_lookup.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_lookup.NIL;
                        while (removal_modules_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_lookup.$kw2$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw0$POS), (SubLObject)removal_modules_lookup.NIL);
                                    SubLObject done_var_$1 = (SubLObject)removal_modules_lookup.NIL;
                                    final SubLObject token_var_$2 = (SubLObject)removal_modules_lookup.NIL;
                                    while (removal_modules_lookup.NIL == done_var_$1) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                        final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(assertion));
                                        if (removal_modules_lookup.NIL != valid_$3 && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_lookup.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_lookup.UNPROVIDED, (SubLObject)removal_modules_lookup.UNPROVIDED)) {
                                            result = (SubLObject)ConsesLow.cons(assertion, result);
                                        }
                                        done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid_$3);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lookup.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (removal_modules_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_lookup.NIL;
                    if (removal_modules_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_lookup.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_lookup.NIL;
                        while (removal_modules_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_lookup.$kw2$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw0$POS), (SubLObject)removal_modules_lookup.NIL);
                                    SubLObject done_var_$2 = (SubLObject)removal_modules_lookup.NIL;
                                    final SubLObject token_var_$3 = (SubLObject)removal_modules_lookup.NIL;
                                    while (removal_modules_lookup.NIL == done_var_$2) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(assertion));
                                        if (removal_modules_lookup.NIL != valid_$4 && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_lookup.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_lookup.UNPROVIDED, (SubLObject)removal_modules_lookup.UNPROVIDED)) {
                                            result = (SubLObject)ConsesLow.cons(assertion, result);
                                        }
                                        done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid_$4);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lookup.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid);
                        }
                    }
                }
            }
            else if (removal_modules_lookup.NIL != predicate) {
                final SubLObject pred_var = predicate;
                if (removal_modules_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_lookup.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_lookup.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_lookup.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_lookup.NIL;
                    while (removal_modules_lookup.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_lookup.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_lookup.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_lookup.$kw2$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw0$POS), (SubLObject)removal_modules_lookup.NIL);
                                SubLObject done_var_$3 = (SubLObject)removal_modules_lookup.NIL;
                                final SubLObject token_var_$4 = (SubLObject)removal_modules_lookup.NIL;
                                while (removal_modules_lookup.NIL == done_var_$3) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                    final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(assertion));
                                    if (removal_modules_lookup.NIL != valid_$5 && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_lookup.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_lookup.UNPROVIDED, (SubLObject)removal_modules_lookup.UNPROVIDED)) {
                                        result = (SubLObject)ConsesLow.cons(assertion, result);
                                    }
                                    done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid_$5);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lookup.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (removal_modules_lookup.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid);
                    }
                }
            }
            else {
                final SubLObject pred_var = (SubLObject)removal_modules_lookup.NIL;
                if (removal_modules_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_lookup.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_lookup.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_lookup.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_lookup.NIL;
                    while (removal_modules_lookup.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_lookup.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_lookup.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_lookup.$kw2$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw0$POS), (SubLObject)removal_modules_lookup.NIL);
                                SubLObject done_var_$4 = (SubLObject)removal_modules_lookup.NIL;
                                final SubLObject token_var_$5 = (SubLObject)removal_modules_lookup.NIL;
                                while (removal_modules_lookup.NIL == done_var_$4) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                    final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(assertion));
                                    if (removal_modules_lookup.NIL != valid_$6 && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_lookup.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_lookup.UNPROVIDED, (SubLObject)removal_modules_lookup.UNPROVIDED)) {
                                        result = (SubLObject)ConsesLow.cons(assertion, result);
                                    }
                                    done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid_$6);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lookup.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (removal_modules_lookup.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_lookup.$kw3$PREDICATE_EXTENT)) {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (removal_modules_lookup.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                final SubLObject str = (SubLObject)removal_modules_lookup.NIL;
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
                    utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_lookup.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_lookup.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)removal_modules_lookup.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_lookup.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_lookup.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_lookup.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = (SubLObject)removal_modules_lookup.NIL;
                    final SubLObject token_var2 = (SubLObject)removal_modules_lookup.NIL;
                    while (removal_modules_lookup.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (removal_modules_lookup.NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = (SubLObject)removal_modules_lookup.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_lookup.$kw2$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw0$POS), (SubLObject)removal_modules_lookup.NIL);
                                SubLObject done_var_$5 = (SubLObject)removal_modules_lookup.NIL;
                                final SubLObject token_var_$6 = (SubLObject)removal_modules_lookup.NIL;
                                while (removal_modules_lookup.NIL == done_var_$5) {
                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                    final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(assertion2));
                                    if (removal_modules_lookup.NIL != valid_$7 && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion2) && removal_modules_lookup.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion2), (SubLObject)removal_modules_lookup.UNPROVIDED, (SubLObject)removal_modules_lookup.UNPROVIDED)) {
                                        result = (SubLObject)ConsesLow.cons(assertion2, result);
                                    }
                                    done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid_$7);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lookup.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (removal_modules_lookup.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid2);
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
        else if (pcase_var.eql((SubLObject)removal_modules_lookup.$kw4$OVERLAP)) {
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_lookup.UNPROVIDED);
            SubLObject assertion3 = (SubLObject)removal_modules_lookup.NIL;
            assertion3 = cdolist_list_var.first();
            while (removal_modules_lookup.NIL != cdolist_list_var) {
                if ((removal_modules_lookup.NIL == enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw0$POS) || removal_modules_lookup.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw0$POS))) && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion3) && removal_modules_lookup.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion3), (SubLObject)removal_modules_lookup.UNPROVIDED, (SubLObject)removal_modules_lookup.UNPROVIDED)) {
                    result = (SubLObject)ConsesLow.cons(assertion3, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion3 = cdolist_list_var.first();
            }
        }
        else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        if (removal_modules_lookup.NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return (SubLObject)removal_modules_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 2994L)
    public static SubLObject removal_lookup_neg_completeness(final SubLObject asent) {
        if (removal_modules_lookup.NIL != removal_module_utilities.negation_grossly_incompleteP(asent, (SubLObject)removal_modules_lookup.$kw7$NEG)) {
            return (SubLObject)removal_modules_lookup.$kw8$GROSSLY_INCOMPLETE;
        }
        return (SubLObject)removal_modules_lookup.$kw9$INCOMPLETE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 3162L)
    public static SubLObject removal_lookup_neg_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lookup.NIL;
        }
        return inference_trampolines.inference_num_gaf_lookup_index(asent, (SubLObject)removal_modules_lookup.$kw7$NEG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 3299L)
    public static SubLObject removal_lookup_neg_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_lookup.NIL;
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, (SubLObject)removal_modules_lookup.$kw7$NEG);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql((SubLObject)removal_modules_lookup.$kw1$GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_lookup.NIL != argnum) {
                if (removal_modules_lookup.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_lookup.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_lookup.NIL;
                        while (removal_modules_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_lookup.$kw2$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw7$NEG), (SubLObject)removal_modules_lookup.NIL);
                                    SubLObject done_var_$17 = (SubLObject)removal_modules_lookup.NIL;
                                    final SubLObject token_var_$18 = (SubLObject)removal_modules_lookup.NIL;
                                    while (removal_modules_lookup.NIL == done_var_$17) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                        final SubLObject valid_$19 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$18.eql(assertion));
                                        if (removal_modules_lookup.NIL != valid_$19 && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion)) {
                                            result = (SubLObject)ConsesLow.cons(assertion, result);
                                        }
                                        done_var_$17 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid_$19);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lookup.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (removal_modules_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_lookup.NIL;
                    if (removal_modules_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_lookup.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_lookup.NIL;
                        while (removal_modules_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_lookup.$kw2$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw7$NEG), (SubLObject)removal_modules_lookup.NIL);
                                    SubLObject done_var_$18 = (SubLObject)removal_modules_lookup.NIL;
                                    final SubLObject token_var_$19 = (SubLObject)removal_modules_lookup.NIL;
                                    while (removal_modules_lookup.NIL == done_var_$18) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                        final SubLObject valid_$20 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$19.eql(assertion));
                                        if (removal_modules_lookup.NIL != valid_$20 && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion)) {
                                            result = (SubLObject)ConsesLow.cons(assertion, result);
                                        }
                                        done_var_$18 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid_$20);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lookup.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid);
                        }
                    }
                }
            }
            else if (removal_modules_lookup.NIL != predicate) {
                final SubLObject pred_var = predicate;
                if (removal_modules_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_lookup.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_lookup.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_lookup.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_lookup.NIL;
                    while (removal_modules_lookup.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_lookup.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_lookup.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_lookup.$kw2$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw7$NEG), (SubLObject)removal_modules_lookup.NIL);
                                SubLObject done_var_$19 = (SubLObject)removal_modules_lookup.NIL;
                                final SubLObject token_var_$20 = (SubLObject)removal_modules_lookup.NIL;
                                while (removal_modules_lookup.NIL == done_var_$19) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                    final SubLObject valid_$21 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$20.eql(assertion));
                                    if (removal_modules_lookup.NIL != valid_$21 && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion)) {
                                        result = (SubLObject)ConsesLow.cons(assertion, result);
                                    }
                                    done_var_$19 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid_$21);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lookup.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (removal_modules_lookup.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid);
                    }
                }
            }
            else {
                final SubLObject pred_var = (SubLObject)removal_modules_lookup.NIL;
                if (removal_modules_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_lookup.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_lookup.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_lookup.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_lookup.NIL;
                    while (removal_modules_lookup.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_lookup.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_lookup.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_lookup.$kw2$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw7$NEG), (SubLObject)removal_modules_lookup.NIL);
                                SubLObject done_var_$20 = (SubLObject)removal_modules_lookup.NIL;
                                final SubLObject token_var_$21 = (SubLObject)removal_modules_lookup.NIL;
                                while (removal_modules_lookup.NIL == done_var_$20) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$21);
                                    final SubLObject valid_$22 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$21.eql(assertion));
                                    if (removal_modules_lookup.NIL != valid_$22 && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion)) {
                                        result = (SubLObject)ConsesLow.cons(assertion, result);
                                    }
                                    done_var_$20 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid_$22);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lookup.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (removal_modules_lookup.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_lookup.$kw3$PREDICATE_EXTENT)) {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (removal_modules_lookup.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                final SubLObject str = (SubLObject)removal_modules_lookup.NIL;
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
                    utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_lookup.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_lookup.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)removal_modules_lookup.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_lookup.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_lookup.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_lookup.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = (SubLObject)removal_modules_lookup.NIL;
                    final SubLObject token_var2 = (SubLObject)removal_modules_lookup.NIL;
                    while (removal_modules_lookup.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (removal_modules_lookup.NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = (SubLObject)removal_modules_lookup.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_lookup.$kw2$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw7$NEG), (SubLObject)removal_modules_lookup.NIL);
                                SubLObject done_var_$21 = (SubLObject)removal_modules_lookup.NIL;
                                final SubLObject token_var_$22 = (SubLObject)removal_modules_lookup.NIL;
                                while (removal_modules_lookup.NIL == done_var_$21) {
                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$22);
                                    final SubLObject valid_$23 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$22.eql(assertion2));
                                    if (removal_modules_lookup.NIL != valid_$23 && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion2)) {
                                        result = (SubLObject)ConsesLow.cons(assertion2, result);
                                    }
                                    done_var_$21 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid_$23);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lookup.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (removal_modules_lookup.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid2);
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
        else if (pcase_var.eql((SubLObject)removal_modules_lookup.$kw4$OVERLAP)) {
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_lookup.UNPROVIDED);
            SubLObject assertion3 = (SubLObject)removal_modules_lookup.NIL;
            assertion3 = cdolist_list_var.first();
            while (removal_modules_lookup.NIL != cdolist_list_var) {
                if ((removal_modules_lookup.NIL == enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw7$NEG) || removal_modules_lookup.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw7$NEG))) && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion3)) {
                    result = (SubLObject)ConsesLow.cons(assertion3, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion3 = cdolist_list_var.first();
            }
        }
        else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        if (removal_modules_lookup.NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return (SubLObject)removal_modules_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 4266L)
    public static SubLObject removal_lookup_expand_internal(final SubLObject assertion, final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.gaf_asent_unify(asent, gaf_formula, (SubLObject)removal_modules_lookup.T, (SubLObject)removal_modules_lookup.T);
            final SubLObject gaf_asent = thread.secondMultipleValue();
            final SubLObject unify_justification = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_lookup.NIL != v_bindings) {
                backward.removal_add_node(assertion, v_bindings, unify_justification);
            }
        }
        return (SubLObject)removal_modules_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 4725L)
    public static SubLObject removal_pred_unbound_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lookup.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lookup.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_lookup.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_lookup.$sym12$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(removal_modules_lookup.$const13$EverythingPSC, thread);
            result = inference_trampolines.inference_num_gaf_lookup_index(asent, (SubLObject)removal_modules_lookup.$kw0$POS);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 5123L)
    public static SubLObject removal_pred_unbound_iterator(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_lookup.NIL;
        final SubLObject l_index = inference_trampolines.inference_gaf_lookup_index(asent, (SubLObject)removal_modules_lookup.$kw0$POS);
        final SubLObject pcase_var;
        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var.eql((SubLObject)removal_modules_lookup.$kw1$GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_lookup.NIL != argnum) {
                if (removal_modules_lookup.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (removal_modules_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_lookup.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_lookup.NIL;
                        while (removal_modules_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_lookup.$kw2$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw0$POS), (SubLObject)removal_modules_lookup.NIL);
                                    SubLObject done_var_$33 = (SubLObject)removal_modules_lookup.NIL;
                                    final SubLObject token_var_$34 = (SubLObject)removal_modules_lookup.NIL;
                                    while (removal_modules_lookup.NIL == done_var_$33) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$34);
                                        final SubLObject valid_$35 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$34.eql(assertion));
                                        if (removal_modules_lookup.NIL != valid_$35 && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_lookup.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_lookup.UNPROVIDED, (SubLObject)removal_modules_lookup.UNPROVIDED)) {
                                            result = (SubLObject)ConsesLow.cons(assertion, result);
                                        }
                                        done_var_$33 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid_$35);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lookup.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (removal_modules_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)removal_modules_lookup.NIL;
                    if (removal_modules_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_lookup.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_lookup.NIL;
                        while (removal_modules_lookup.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_lookup.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_lookup.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_lookup.$kw2$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw0$POS), (SubLObject)removal_modules_lookup.NIL);
                                    SubLObject done_var_$34 = (SubLObject)removal_modules_lookup.NIL;
                                    final SubLObject token_var_$35 = (SubLObject)removal_modules_lookup.NIL;
                                    while (removal_modules_lookup.NIL == done_var_$34) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
                                        final SubLObject valid_$36 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$35.eql(assertion));
                                        if (removal_modules_lookup.NIL != valid_$36 && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_lookup.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_lookup.UNPROVIDED, (SubLObject)removal_modules_lookup.UNPROVIDED)) {
                                            result = (SubLObject)ConsesLow.cons(assertion, result);
                                        }
                                        done_var_$34 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid_$36);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lookup.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_lookup.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid);
                        }
                    }
                }
            }
            else if (removal_modules_lookup.NIL != predicate) {
                final SubLObject pred_var = predicate;
                if (removal_modules_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_lookup.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_lookup.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_lookup.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_lookup.NIL;
                    while (removal_modules_lookup.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_lookup.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_lookup.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_lookup.$kw2$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw0$POS), (SubLObject)removal_modules_lookup.NIL);
                                SubLObject done_var_$35 = (SubLObject)removal_modules_lookup.NIL;
                                final SubLObject token_var_$36 = (SubLObject)removal_modules_lookup.NIL;
                                while (removal_modules_lookup.NIL == done_var_$35) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$36);
                                    final SubLObject valid_$37 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$36.eql(assertion));
                                    if (removal_modules_lookup.NIL != valid_$37 && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_lookup.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_lookup.UNPROVIDED, (SubLObject)removal_modules_lookup.UNPROVIDED)) {
                                        result = (SubLObject)ConsesLow.cons(assertion, result);
                                    }
                                    done_var_$35 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid_$37);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lookup.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (removal_modules_lookup.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid);
                    }
                }
            }
            else {
                final SubLObject pred_var = (SubLObject)removal_modules_lookup.NIL;
                if (removal_modules_lookup.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_lookup.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_lookup.NIL, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_lookup.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_lookup.NIL;
                    while (removal_modules_lookup.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_lookup.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_lookup.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_lookup.$kw2$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw0$POS), (SubLObject)removal_modules_lookup.NIL);
                                SubLObject done_var_$36 = (SubLObject)removal_modules_lookup.NIL;
                                final SubLObject token_var_$37 = (SubLObject)removal_modules_lookup.NIL;
                                while (removal_modules_lookup.NIL == done_var_$36) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$37);
                                    final SubLObject valid_$38 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$37.eql(assertion));
                                    if (removal_modules_lookup.NIL != valid_$38 && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion) && removal_modules_lookup.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_lookup.UNPROVIDED, (SubLObject)removal_modules_lookup.UNPROVIDED)) {
                                        result = (SubLObject)ConsesLow.cons(assertion, result);
                                    }
                                    done_var_$36 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid_$38);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lookup.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (removal_modules_lookup.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)removal_modules_lookup.$kw3$PREDICATE_EXTENT)) {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (removal_modules_lookup.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                final SubLObject str = (SubLObject)removal_modules_lookup.NIL;
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
                    utilities_macros.$progress_notification_count$.bind((SubLObject)removal_modules_lookup.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)removal_modules_lookup.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)removal_modules_lookup.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)removal_modules_lookup.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((removal_modules_lookup.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : removal_modules_lookup.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = (SubLObject)removal_modules_lookup.NIL;
                    final SubLObject token_var2 = (SubLObject)removal_modules_lookup.NIL;
                    while (removal_modules_lookup.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (removal_modules_lookup.NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = (SubLObject)removal_modules_lookup.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_lookup.$kw2$GAF, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw0$POS), (SubLObject)removal_modules_lookup.NIL);
                                SubLObject done_var_$37 = (SubLObject)removal_modules_lookup.NIL;
                                final SubLObject token_var_$38 = (SubLObject)removal_modules_lookup.NIL;
                                while (removal_modules_lookup.NIL == done_var_$37) {
                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$38);
                                    final SubLObject valid_$39 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$38.eql(assertion2));
                                    if (removal_modules_lookup.NIL != valid_$39 && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion2) && removal_modules_lookup.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion2), (SubLObject)removal_modules_lookup.UNPROVIDED, (SubLObject)removal_modules_lookup.UNPROVIDED)) {
                                        result = (SubLObject)ConsesLow.cons(assertion2, result);
                                    }
                                    done_var_$37 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid_$39);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lookup.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (removal_modules_lookup.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lookup.NIL == valid2);
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
        else if (pcase_var.eql((SubLObject)removal_modules_lookup.$kw4$OVERLAP)) {
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)removal_modules_lookup.UNPROVIDED);
            SubLObject assertion3 = (SubLObject)removal_modules_lookup.NIL;
            assertion3 = cdolist_list_var.first();
            while (removal_modules_lookup.NIL != cdolist_list_var) {
                if ((removal_modules_lookup.NIL == enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw0$POS) || removal_modules_lookup.NIL != assertions_high.assertion_has_truth(assertion3, enumeration_types.sense_truth((SubLObject)removal_modules_lookup.$kw0$POS))) && removal_modules_lookup.NIL != backward_utilities.direction_is_relevant(assertion3) && removal_modules_lookup.NIL != unification_utilities.gaf_asent_unify(asent, assertions_high.gaf_formula(assertion3), (SubLObject)removal_modules_lookup.UNPROVIDED, (SubLObject)removal_modules_lookup.UNPROVIDED)) {
                    result = (SubLObject)ConsesLow.cons(assertion3, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion3 = cdolist_list_var.first();
            }
        }
        else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        if (removal_modules_lookup.NIL != result) {
            return iteration.new_inference_list_iterator(result);
        }
        return (SubLObject)removal_modules_lookup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 6577L)
    public static SubLObject pred_unbound_pos_preference(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        if (removal_modules_lookup.NIL != formula_contains_indexed_termP(asent, (SubLObject)removal_modules_lookup.UNPROVIDED) && removal_modules_lookup.NIL == list_utilities.member_eqP(cycl_utilities.atomic_sentence_predicate(asent), bindable_vars)) {
            return (SubLObject)removal_modules_lookup.$kw18$GROSSLY_DISPREFERRED;
        }
        return (SubLObject)removal_modules_lookup.$kw19$DISALLOWED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 6891L)
    public static SubLObject formula_contains_indexed_termP(final SubLObject formula, SubLObject penetrate_hl_structuresP) {
        if (penetrate_hl_structuresP == removal_modules_lookup.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)removal_modules_lookup.NIL;
        }
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find_if(Symbols.symbol_function((SubLObject)removal_modules_lookup.$sym20$INDEXED_TERM_P), formula, penetrate_hl_structuresP, (SubLObject)removal_modules_lookup.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 7141L)
    public static SubLObject formula_has_indexed_term_arg_p(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == removal_modules_lookup.UNPROVIDED) {
            seqvar_handling = (SubLObject)removal_modules_lookup.NIL;
        }
        return list_utilities.sublisp_boolean(Sequences.find_if(Symbols.symbol_function((SubLObject)removal_modules_lookup.$sym20$INDEXED_TERM_P), cycl_utilities.formula_args(formula, seqvar_handling), (SubLObject)removal_modules_lookup.UNPROVIDED, (SubLObject)removal_modules_lookup.UNPROVIDED, (SubLObject)removal_modules_lookup.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 7361L)
    public static SubLObject formula_has_fort_arg_p(final SubLObject formula, SubLObject seqvar_handling) {
        if (seqvar_handling == removal_modules_lookup.UNPROVIDED) {
            seqvar_handling = (SubLObject)removal_modules_lookup.NIL;
        }
        return list_utilities.sublisp_boolean(Sequences.find_if(Symbols.symbol_function((SubLObject)removal_modules_lookup.$sym21$FORT_P), cycl_utilities.formula_args(formula, seqvar_handling), (SubLObject)removal_modules_lookup.UNPROVIDED, (SubLObject)removal_modules_lookup.UNPROVIDED, (SubLObject)removal_modules_lookup.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 7565L)
    public static SubLObject asent_has_fort_arg_p(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == removal_modules_lookup.UNPROVIDED) {
            seqvar_handling = (SubLObject)removal_modules_lookup.NIL;
        }
        return formula_has_fort_arg_p(asent, seqvar_handling);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lookup.lisp", position = 7744L)
    public static SubLObject asent_has_indexed_term_arg_p(final SubLObject asent, SubLObject seqvar_handling) {
        if (seqvar_handling == removal_modules_lookup.UNPROVIDED) {
            seqvar_handling = (SubLObject)removal_modules_lookup.NIL;
        }
        return formula_has_indexed_term_arg_p(asent, seqvar_handling);
    }
    
    public static SubLObject declare_removal_modules_lookup_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup", "removal_lookup_pos_cost", "REMOVAL-LOOKUP-POS-COST", 1, 1, false);
        new $removal_lookup_pos_cost$UnaryFunction();
        new $removal_lookup_pos_cost$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup", "removal_completely_asserted_asentP", "REMOVAL-COMPLETELY-ASSERTED-ASENT?", 1, 0, false);
        new $removal_completely_asserted_asentP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup", "removal_lookup_pos_iterator", "REMOVAL-LOOKUP-POS-ITERATOR", 1, 0, false);
        new $removal_lookup_pos_iterator$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup", "removal_lookup_neg_completeness", "REMOVAL-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup", "removal_lookup_neg_cost", "REMOVAL-LOOKUP-NEG-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup", "removal_lookup_neg_iterator", "REMOVAL-LOOKUP-NEG-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup", "removal_lookup_expand_internal", "REMOVAL-LOOKUP-EXPAND-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup", "removal_pred_unbound_cost", "REMOVAL-PRED-UNBOUND-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup", "removal_pred_unbound_iterator", "REMOVAL-PRED-UNBOUND-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup", "pred_unbound_pos_preference", "PRED-UNBOUND-POS-PREFERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup", "formula_contains_indexed_termP", "FORMULA-CONTAINS-INDEXED-TERM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup", "formula_has_indexed_term_arg_p", "FORMULA-HAS-INDEXED-TERM-ARG-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup", "formula_has_fort_arg_p", "FORMULA-HAS-FORT-ARG-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup", "asent_has_fort_arg_p", "ASENT-HAS-FORT-ARG-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lookup", "asent_has_indexed_term_arg_p", "ASENT-HAS-INDEXED-TERM-ARG-P", 1, 1, false);
        new $asent_has_indexed_term_arg_p$UnaryFunction();
        new $asent_has_indexed_term_arg_p$BinaryFunction();
        return (SubLObject)removal_modules_lookup.NIL;
    }
    
    public static SubLObject init_removal_modules_lookup_file() {
        return (SubLObject)removal_modules_lookup.NIL;
    }
    
    public static SubLObject setup_removal_modules_lookup_file() {
        inference_modules.inference_removal_module((SubLObject)removal_modules_lookup.$kw5$REMOVAL_LOOKUP_POS, (SubLObject)removal_modules_lookup.$list6);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lookup.$kw10$REMOVAL_LOOKUP_NEG, (SubLObject)removal_modules_lookup.$list11);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lookup.$kw14$REMOVAL_PRED_UNBOUND, (SubLObject)removal_modules_lookup.$list15);
        preference_modules.inference_preference_module((SubLObject)removal_modules_lookup.$kw16$PRED_UNBOUND_POS, (SubLObject)removal_modules_lookup.$list17);
        return (SubLObject)removal_modules_lookup.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_lookup_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_lookup_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_lookup_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_lookup();
        $kw0$POS = SubLObjectFactory.makeKeyword("POS");
        $kw1$GAF_ARG = SubLObjectFactory.makeKeyword("GAF-ARG");
        $kw2$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw3$PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $kw4$OVERLAP = SubLObjectFactory.makeKeyword("OVERLAP");
        $kw5$REMOVAL_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-LOOKUP-POS");
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_lookup.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-LOOKUP-POS-COST"), SubLObjectFactory.makeKeyword("COMPLETE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-COMPLETELY-ASSERTED-ASENT?")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-LOOKUP-POS-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<fort> . <whatever>)\nusing true assertions and GAF indexing in the KB"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$bordersOn #$UnitedStatesOfAmerica ?COUNTRY)\n (#$bordersOn #$UnitedStatesOfAmerica #$Canada)\n (#$resultIsa #$JuvenileFn #$JuvenileAnimal)") });
        $kw7$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw8$GROSSLY_INCOMPLETE = SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE");
        $kw9$INCOMPLETE = SubLObjectFactory.makeKeyword("INCOMPLETE");
        $kw10$REMOVAL_LOOKUP_NEG = SubLObjectFactory.makeKeyword("REMOVAL-LOOKUP-NEG");
        $list11 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_lookup.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-LOOKUP-NEG-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-LOOKUP-NEG-COMPLETENESS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-LOOKUP-NEG-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> . <whatever>))\nusing false assertions and GAF indexing in the KB") });
        $sym12$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const13$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw14$REMOVAL_PRED_UNBOUND = SubLObjectFactory.makeKeyword("REMOVAL-PRED-UNBOUND");
        $list15 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_lookup.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-CONTAINS-INDEXED-TERM?"))), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-PRED-UNBOUND-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-PRED-UNBOUND-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-DECODE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("GAF-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<variable> ... <fort> ... )\nusing true assertions and GAF indexing on <fort>.\nThis is a last-resort if <variable> occurs elsewhere."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(?PREDICATE #$UnitedStatesOfAmerica #$Canada)") });
        $kw16$PRED_UNBOUND_POS = SubLObjectFactory.makeKeyword("PRED-UNBOUND-POS");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("PRED-UNBOUND-POS-PREFERENCE"));
        $kw18$GROSSLY_DISPREFERRED = SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED");
        $kw19$DISALLOWED = SubLObjectFactory.makeKeyword("DISALLOWED");
        $sym20$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $sym21$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
    }
    
    public static final class $removal_lookup_pos_cost$UnaryFunction extends UnaryFunction
    {
        public $removal_lookup_pos_cost$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-LOOKUP-POS-COST"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_lookup.removal_lookup_pos_cost(arg1, (SubLObject)$removal_lookup_pos_cost$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $removal_lookup_pos_cost$BinaryFunction extends BinaryFunction
    {
        public $removal_lookup_pos_cost$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-LOOKUP-POS-COST"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_modules_lookup.removal_lookup_pos_cost(arg1, arg2);
        }
    }
    
    public static final class $removal_completely_asserted_asentP$UnaryFunction extends UnaryFunction
    {
        public $removal_completely_asserted_asentP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-COMPLETELY-ASSERTED-ASENT?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_lookup.removal_completely_asserted_asentP(arg1);
        }
    }
    
    public static final class $removal_lookup_pos_iterator$UnaryFunction extends UnaryFunction
    {
        public $removal_lookup_pos_iterator$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-LOOKUP-POS-ITERATOR"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_lookup.removal_lookup_pos_iterator(arg1);
        }
    }
    
    public static final class $asent_has_indexed_term_arg_p$UnaryFunction extends UnaryFunction
    {
        public $asent_has_indexed_term_arg_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ASENT-HAS-INDEXED-TERM-ARG-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_lookup.asent_has_indexed_term_arg_p(arg1, (SubLObject)$asent_has_indexed_term_arg_p$UnaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $asent_has_indexed_term_arg_p$BinaryFunction extends BinaryFunction
    {
        public $asent_has_indexed_term_arg_p$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ASENT-HAS-INDEXED-TERM-ARG-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_modules_lookup.asent_has_indexed_term_arg_p(arg1, arg2);
        }
    }
}

/*

	Total time: 754 ms
	
*/