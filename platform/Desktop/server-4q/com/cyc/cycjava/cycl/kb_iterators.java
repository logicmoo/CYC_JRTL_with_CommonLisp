package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_iterators extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_iterators";
    public static final String myFingerPrint = "062538c4085bdef2dbac8cecdac18bbd9d778d1a70376276f1709bf7148ae9c3";
    private static final SubLSymbol $kw0$INDEX_TYPE;
    private static final SubLSymbol $kw1$GAF_ARG;
    private static final SubLSymbol $kw2$TERM;
    private static final SubLSymbol $kw3$ARGNUM;
    private static final SubLSymbol $kw4$PREDICATE;
    private static final SubLSymbol $kw5$PREDICATE_EXTENT;
    private static final SubLSymbol $kw6$GAF;
    private static final SubLSymbol $kw7$OVERLAP;
    private static final SubLSymbol $sym8$FORT_P;
    private static final SubLSymbol $sym9$ITERATOR_SPECS_DONE;
    private static final SubLSymbol $sym10$ITERATOR_SPECS_NEXT;
    private static final SubLInteger $int11$100;
    private static final SubLList $list12;
    private static final SubLObject $const13$genls;
    private static final SubLString $str14$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLObject $const15$isa;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$ITERATOR_INSTANCES_DONE;
    private static final SubLSymbol $sym18$ITERATOR_INSTANCES_NEXT;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$ITERATOR_ONTOLOGY_DONE;
    private static final SubLSymbol $sym21$ITERATOR_ONTOLOGY_NEXT;
    private static final SubLString $str22$Rule_set_is_not_initialized_;
    private static final SubLSymbol $sym23$ITERATOR_TRANSITIVE_DONE;
    private static final SubLSymbol $sym24$ITERATOR_TRANSITIVE_NEXT;
    private static final SubLSymbol $kw25$TRUE;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 850L)
    public static SubLObject new_gaf_arg_index_iterator(final SubLObject v_term, final SubLObject arg, SubLObject pred, SubLObject mt) {
        if (pred == kb_iterators.UNPROVIDED) {
            pred = (SubLObject)kb_iterators.NIL;
        }
        if (mt == kb_iterators.UNPROVIDED) {
            mt = (SubLObject)kb_iterators.NIL;
        }
        return iteration.new_list_iterator(kb_mapping.gather_gaf_arg_index(v_term, arg, pred, mt, (SubLObject)kb_iterators.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 1469L)
    public static SubLObject new_nart_arg_index_iterator(final SubLObject v_term, final SubLObject arg, SubLObject func) {
        if (func == kb_iterators.UNPROVIDED) {
            func = (SubLObject)kb_iterators.NIL;
        }
        return iteration.new_list_iterator(kb_mapping.gather_nart_arg_index(v_term, arg, func));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 1710L)
    public static SubLObject new_predicate_extent_index_iterator(final SubLObject pred, SubLObject mt) {
        if (mt == kb_iterators.UNPROVIDED) {
            mt = (SubLObject)kb_iterators.NIL;
        }
        return iteration.new_list_iterator(kb_mapping.gather_predicate_extent_index(pred, mt, (SubLObject)kb_iterators.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 1957L)
    public static SubLObject new_function_extent_index_iterator(final SubLObject func) {
        return iteration.new_list_iterator(kb_mapping.gather_function_extent_index(func));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 2185L)
    public static SubLObject new_mt_index_iterator(final SubLObject v_term) {
        return iteration.new_list_iterator(kb_mapping.gather_mt_index(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 2369L)
    public static SubLObject new_best_gaf_lookup_index_iterator(final SubLObject asent, SubLObject truth, SubLObject v_methods) {
        if (truth == kb_iterators.UNPROVIDED) {
            truth = (SubLObject)kb_iterators.NIL;
        }
        if (v_methods == kb_iterators.UNPROVIDED) {
            v_methods = (SubLObject)kb_iterators.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lookup_index = kb_indexing.best_gaf_lookup_index(asent, truth, v_methods);
        final SubLObject pcase_var;
        final SubLObject index_type = pcase_var = kb_indexing.lookup_index_get_property(lookup_index, (SubLObject)kb_iterators.$kw0$INDEX_TYPE, (SubLObject)kb_iterators.UNPROVIDED);
        if (pcase_var.eql((SubLObject)kb_iterators.$kw1$GAF_ARG)) {
            final SubLObject v_term = kb_indexing.lookup_index_get_property(lookup_index, (SubLObject)kb_iterators.$kw2$TERM, (SubLObject)kb_iterators.UNPROVIDED);
            final SubLObject argnum = kb_indexing.lookup_index_get_property(lookup_index, (SubLObject)kb_iterators.$kw3$ARGNUM, (SubLObject)kb_iterators.UNPROVIDED);
            final SubLObject pred = kb_indexing.lookup_index_get_property(lookup_index, (SubLObject)kb_iterators.$kw4$PREDICATE, (SubLObject)kb_iterators.UNPROVIDED);
            return new_gaf_arg_index_iterator(v_term, argnum, pred, (SubLObject)kb_iterators.UNPROVIDED);
        }
        if (pcase_var.eql((SubLObject)kb_iterators.$kw5$PREDICATE_EXTENT)) {
            final SubLObject pred2 = kb_indexing.lookup_index_get_property(lookup_index, (SubLObject)kb_iterators.$kw4$PREDICATE, (SubLObject)kb_iterators.UNPROVIDED);
            return new_predicate_extent_index_iterator(pred2, (SubLObject)kb_iterators.UNPROVIDED);
        }
        SubLObject result = (SubLObject)kb_iterators.NIL;
        final SubLObject l_index = lookup_index;
        final SubLObject pcase_var_$1;
        final SubLObject method = pcase_var_$1 = kb_mapping_macros.do_gli_extract_method(l_index);
        if (pcase_var_$1.eql((SubLObject)kb_iterators.$kw1$GAF_ARG)) {
            thread.resetMultipleValues();
            final SubLObject v_term2 = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
            final SubLObject argnum2 = thread.secondMultipleValue();
            final SubLObject predicate = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (kb_iterators.NIL != argnum2) {
                if (kb_iterators.NIL != predicate) {
                    final SubLObject pred_var = predicate;
                    if (kb_iterators.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum2, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum2, pred_var);
                        SubLObject done_var = (SubLObject)kb_iterators.NIL;
                        final SubLObject token_var = (SubLObject)kb_iterators.NIL;
                        while (kb_iterators.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (kb_iterators.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)kb_iterators.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_iterators.$kw6$GAF, truth, (SubLObject)kb_iterators.NIL);
                                    SubLObject done_var_$2 = (SubLObject)kb_iterators.NIL;
                                    final SubLObject token_var_$3 = (SubLObject)kb_iterators.NIL;
                                    while (kb_iterators.NIL == done_var_$2) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(gaf));
                                        if (kb_iterators.NIL != valid_$4) {
                                            result = (SubLObject)ConsesLow.cons(gaf, result);
                                        }
                                        done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(kb_iterators.NIL == valid_$4);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_iterators.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (kb_iterators.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_iterators.NIL == valid);
                        }
                    }
                }
                else {
                    final SubLObject pred_var = (SubLObject)kb_iterators.NIL;
                    if (kb_iterators.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, argnum2, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, argnum2, pred_var);
                        SubLObject done_var = (SubLObject)kb_iterators.NIL;
                        final SubLObject token_var = (SubLObject)kb_iterators.NIL;
                        while (kb_iterators.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (kb_iterators.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)kb_iterators.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_iterators.$kw6$GAF, truth, (SubLObject)kb_iterators.NIL);
                                    SubLObject done_var_$3 = (SubLObject)kb_iterators.NIL;
                                    final SubLObject token_var_$4 = (SubLObject)kb_iterators.NIL;
                                    while (kb_iterators.NIL == done_var_$3) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(gaf));
                                        if (kb_iterators.NIL != valid_$5) {
                                            result = (SubLObject)ConsesLow.cons(gaf, result);
                                        }
                                        done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(kb_iterators.NIL == valid_$5);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_iterators.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (kb_iterators.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_iterators.NIL == valid);
                        }
                    }
                }
            }
            else if (kb_iterators.NIL != predicate) {
                final SubLObject pred_var = predicate;
                if (kb_iterators.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, (SubLObject)kb_iterators.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, (SubLObject)kb_iterators.NIL, pred_var);
                    SubLObject done_var = (SubLObject)kb_iterators.NIL;
                    final SubLObject token_var = (SubLObject)kb_iterators.NIL;
                    while (kb_iterators.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (kb_iterators.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)kb_iterators.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_iterators.$kw6$GAF, truth, (SubLObject)kb_iterators.NIL);
                                SubLObject done_var_$4 = (SubLObject)kb_iterators.NIL;
                                final SubLObject token_var_$5 = (SubLObject)kb_iterators.NIL;
                                while (kb_iterators.NIL == done_var_$4) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                    final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(gaf));
                                    if (kb_iterators.NIL != valid_$6) {
                                        result = (SubLObject)ConsesLow.cons(gaf, result);
                                    }
                                    done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(kb_iterators.NIL == valid_$6);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_iterators.T, thread);
                                    final SubLObject _values3 = Values.getValuesAsVector();
                                    if (kb_iterators.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values3);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_iterators.NIL == valid);
                    }
                }
            }
            else {
                final SubLObject pred_var = (SubLObject)kb_iterators.NIL;
                if (kb_iterators.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term2, (SubLObject)kb_iterators.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term2, (SubLObject)kb_iterators.NIL, pred_var);
                    SubLObject done_var = (SubLObject)kb_iterators.NIL;
                    final SubLObject token_var = (SubLObject)kb_iterators.NIL;
                    while (kb_iterators.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (kb_iterators.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)kb_iterators.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_iterators.$kw6$GAF, truth, (SubLObject)kb_iterators.NIL);
                                SubLObject done_var_$5 = (SubLObject)kb_iterators.NIL;
                                final SubLObject token_var_$6 = (SubLObject)kb_iterators.NIL;
                                while (kb_iterators.NIL == done_var_$5) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                    final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(gaf));
                                    if (kb_iterators.NIL != valid_$7) {
                                        result = (SubLObject)ConsesLow.cons(gaf, result);
                                    }
                                    done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(kb_iterators.NIL == valid_$7);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_iterators.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (kb_iterators.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_iterators.NIL == valid);
                    }
                }
            }
        }
        else if (pcase_var_$1.eql((SubLObject)kb_iterators.$kw5$PREDICATE_EXTENT)) {
            final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
            if (kb_iterators.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                final SubLObject str = (SubLObject)kb_iterators.NIL;
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
                    utilities_macros.$progress_notification_count$.bind((SubLObject)kb_iterators.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_iterators.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)kb_iterators.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_iterators.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((kb_iterators.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_iterators.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                    SubLObject done_var2 = (SubLObject)kb_iterators.NIL;
                    final SubLObject token_var2 = (SubLObject)kb_iterators.NIL;
                    while (kb_iterators.NIL == done_var2) {
                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                        final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                        if (kb_iterators.NIL != valid2) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator2 = (SubLObject)kb_iterators.NIL;
                            try {
                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)kb_iterators.$kw6$GAF, truth, (SubLObject)kb_iterators.NIL);
                                SubLObject done_var_$6 = (SubLObject)kb_iterators.NIL;
                                final SubLObject token_var_$7 = (SubLObject)kb_iterators.NIL;
                                while (kb_iterators.NIL == done_var_$6) {
                                    final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$7);
                                    final SubLObject valid_$8 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$7.eql(gaf2));
                                    if (kb_iterators.NIL != valid_$8) {
                                        result = (SubLObject)ConsesLow.cons(gaf2, result);
                                    }
                                    done_var_$6 = (SubLObject)SubLObjectFactory.makeBoolean(kb_iterators.NIL == valid_$8);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_iterators.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    if (kb_iterators.NIL != final_index_iterator2) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                    }
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                }
                            }
                        }
                        done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(kb_iterators.NIL == valid2);
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
        else if (pcase_var_$1.eql((SubLObject)kb_iterators.$kw7$OVERLAP)) {
            SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), (SubLObject)kb_iterators.UNPROVIDED);
            SubLObject gaf3 = (SubLObject)kb_iterators.NIL;
            gaf3 = cdolist_list_var.first();
            while (kb_iterators.NIL != cdolist_list_var) {
                if (kb_iterators.NIL == truth || kb_iterators.NIL != assertions_high.assertion_has_truth(gaf3, truth)) {
                    result = (SubLObject)ConsesLow.cons(gaf3, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                gaf3 = cdolist_list_var.first();
            }
        }
        else {
            kb_mapping_macros.do_gli_method_error(l_index, method);
        }
        return iteration.new_list_iterator(Sequences.nreverse(result));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 3778L)
    public static SubLObject new_genls_iterator(final SubLObject collection) {
        assert kb_iterators.NIL != forts.fort_p(collection) : collection;
        return iteration.new_list_iterator(genls.all_genls(collection, (SubLObject)kb_iterators.UNPROVIDED, (SubLObject)kb_iterators.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 4134L)
    public static SubLObject new_isa_iterator(final SubLObject fort) {
        assert kb_iterators.NIL != forts.fort_p(fort) : fort;
        return iteration.new_list_iterator(isa.all_isa(fort, (SubLObject)kb_iterators.UNPROVIDED, (SubLObject)kb_iterators.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 4307L)
    public static SubLObject new_specs_iterator(final SubLObject collection) {
        assert kb_iterators.NIL != forts.fort_p(collection) : collection;
        return iteration.new_iterator(make_iterator_specs_state(collection), Symbols.symbol_function((SubLObject)kb_iterators.$sym9$ITERATOR_SPECS_DONE), Symbols.symbol_function((SubLObject)kb_iterators.$sym10$ITERATOR_SPECS_NEXT), (SubLObject)kb_iterators.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 4576L)
    public static SubLObject make_iterator_specs_state(final SubLObject collection) {
        final SubLObject pending_queue = queues.create_queue((SubLObject)kb_iterators.UNPROVIDED);
        final SubLObject visited_table = Hashtables.make_hash_table((SubLObject)kb_iterators.$int11$100, Symbols.symbol_function((SubLObject)kb_iterators.EQL), (SubLObject)kb_iterators.UNPROVIDED);
        queues.enqueue(collection, pending_queue);
        Hashtables.sethash(collection, visited_table, (SubLObject)kb_iterators.T);
        return (SubLObject)ConsesLow.list(pending_queue, visited_table);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 5013L)
    public static SubLObject iterator_specs_done(final SubLObject state) {
        return queues.queue_empty_p(state.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 5097L)
    public static SubLObject iterator_specs_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pending_queue = (SubLObject)kb_iterators.NIL;
        SubLObject visited_table = (SubLObject)kb_iterators.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)kb_iterators.$list12);
        pending_queue = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)kb_iterators.$list12);
        visited_table = current.first();
        current = current.rest();
        if (kb_iterators.NIL == current) {
            SubLObject next_item = (SubLObject)kb_iterators.NIL;
            while (kb_iterators.NIL == queues.queue_empty_p(pending_queue) && kb_iterators.NIL == next_item) {
                next_item = queues.dequeue(pending_queue);
                final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind((kb_iterators.NIL != sbhl_module_vars.get_sbhl_module(kb_iterators.$const13$genls)) ? sbhl_module_vars.get_sbhl_module(kb_iterators.$const13$genls) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(next_item, sbhl_module_vars.get_sbhl_module(kb_iterators.$const13$genls));
                    if (kb_iterators.NIL == d_link) {
                        continue;
                    }
                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module(kb_iterators.$const13$genls));
                    SubLObject direction = (SubLObject)kb_iterators.NIL;
                    direction = cdolist_list_var.first();
                    while (kb_iterators.NIL != cdolist_list_var) {
                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module(kb_iterators.$const13$genls));
                        if (kb_iterators.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kb_iterators.$const13$genls)))) {
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kb_iterators.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject mt_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state_$18;
                                for (iteration_state_$18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kb_iterators.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$18); iteration_state_$18 = dictionary_contents.do_dictionary_contents_next(iteration_state_$18)) {
                                    thread.resetMultipleValues();
                                    final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$18);
                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (kb_iterators.NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject sol = link_nodes_var;
                                        if (kb_iterators.NIL != set.set_p(sol)) {
                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                            SubLObject basis_object;
                                            SubLObject state_$19;
                                            SubLObject spec;
                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$19 = (SubLObject)kb_iterators.NIL, state_$19 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_iterators.NIL == set_contents.do_set_contents_doneP(basis_object, state_$19); state_$19 = set_contents.do_set_contents_update_state(state_$19)) {
                                                spec = set_contents.do_set_contents_next(basis_object, state_$19);
                                                if (kb_iterators.NIL != set_contents.do_set_contents_element_validP(state_$19, spec) && kb_iterators.NIL != mt_relevance_macros.relevant_mtP(mt_var) && kb_iterators.NIL == Hashtables.gethash(spec, visited_table, (SubLObject)kb_iterators.UNPROVIDED)) {
                                                    Hashtables.sethash(spec, visited_table, (SubLObject)kb_iterators.T);
                                                    queues.enqueue(spec, pending_queue);
                                                }
                                            }
                                        }
                                        else if (sol.isList()) {
                                            SubLObject csome_list_var = sol;
                                            SubLObject spec2 = (SubLObject)kb_iterators.NIL;
                                            spec2 = csome_list_var.first();
                                            while (kb_iterators.NIL != csome_list_var) {
                                                if (kb_iterators.NIL != mt_relevance_macros.relevant_mtP(mt_var) && kb_iterators.NIL == Hashtables.gethash(spec2, visited_table, (SubLObject)kb_iterators.UNPROVIDED)) {
                                                    Hashtables.sethash(spec2, visited_table, (SubLObject)kb_iterators.T);
                                                    queues.enqueue(spec2, pending_queue);
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                spec2 = csome_list_var.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)kb_iterators.$str14$_A_is_neither_SET_P_nor_LISTP_, sol);
                                        }
                                    }
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$18);
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        direction = cdolist_list_var.first();
                    }
                }
                finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
            return Values.values(next_item, state, (SubLObject)kb_iterators.NIL);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)kb_iterators.$list12);
        return (SubLObject)kb_iterators.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 5581L)
    public static SubLObject new_local_instances_iterator(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_iterators.NIL != forts.fort_p(collection) : collection;
        SubLObject v_instances = (SubLObject)kb_iterators.NIL;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind((kb_iterators.NIL != sbhl_module_vars.get_sbhl_module(kb_iterators.$const15$isa)) ? sbhl_module_vars.get_sbhl_module(kb_iterators.$const15$isa) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(collection, sbhl_module_vars.get_sbhl_module(kb_iterators.$const15$isa));
            if (kb_iterators.NIL != d_link) {
                SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module(kb_iterators.$const15$isa));
                SubLObject direction = (SubLObject)kb_iterators.NIL;
                direction = cdolist_list_var.first();
                while (kb_iterators.NIL != cdolist_list_var) {
                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module(kb_iterators.$const15$isa));
                    if (kb_iterators.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kb_iterators.$const15$isa)))) {
                        SubLObject iteration_state;
                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kb_iterators.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                            thread.resetMultipleValues();
                            final SubLObject mt_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            final SubLObject tv_links = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            SubLObject iteration_state_$20;
                            for (iteration_state_$20 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kb_iterators.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$20); iteration_state_$20 = dictionary_contents.do_dictionary_contents_next(iteration_state_$20)) {
                                thread.resetMultipleValues();
                                final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$20);
                                final SubLObject link_nodes_var = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (kb_iterators.NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject sol = link_nodes_var;
                                    if (kb_iterators.NIL != set.set_p(sol)) {
                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                        SubLObject basis_object;
                                        SubLObject state;
                                        SubLObject instance;
                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_iterators.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_iterators.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                            instance = set_contents.do_set_contents_next(basis_object, state);
                                            if (kb_iterators.NIL != set_contents.do_set_contents_element_validP(state, instance) && kb_iterators.NIL != mt_relevance_macros.relevant_mtP(mt_var)) {
                                                v_instances = (SubLObject)ConsesLow.cons(instance, v_instances);
                                            }
                                        }
                                    }
                                    else if (sol.isList()) {
                                        SubLObject csome_list_var = sol;
                                        SubLObject instance2 = (SubLObject)kb_iterators.NIL;
                                        instance2 = csome_list_var.first();
                                        while (kb_iterators.NIL != csome_list_var) {
                                            if (kb_iterators.NIL != mt_relevance_macros.relevant_mtP(mt_var)) {
                                                v_instances = (SubLObject)ConsesLow.cons(instance2, v_instances);
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            instance2 = csome_list_var.first();
                                        }
                                    }
                                    else {
                                        Errors.error((SubLObject)kb_iterators.$str14$_A_is_neither_SET_P_nor_LISTP_, sol);
                                    }
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$20);
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    direction = cdolist_list_var.first();
                }
            }
        }
        finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(collection);
        SubLObject instance_tuple = (SubLObject)kb_iterators.NIL;
        instance_tuple = csome_list_var2.first();
        while (kb_iterators.NIL != csome_list_var2) {
            SubLObject current;
            final SubLObject datum = current = instance_tuple;
            SubLObject instance3 = (SubLObject)kb_iterators.NIL;
            SubLObject mt_var2 = (SubLObject)kb_iterators.NIL;
            SubLObject tv_var2 = (SubLObject)kb_iterators.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_iterators.$list16);
            instance3 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_iterators.$list16);
            mt_var2 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_iterators.$list16);
            tv_var2 = current.first();
            current = current.rest();
            if (kb_iterators.NIL == current) {
                if (kb_iterators.NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var2) && kb_iterators.NIL != mt_relevance_macros.relevant_mtP(mt_var2)) {
                    v_instances = (SubLObject)ConsesLow.cons(instance3, v_instances);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_iterators.$list16);
            }
            csome_list_var2 = csome_list_var2.rest();
            instance_tuple = csome_list_var2.first();
        }
        return iteration.new_list_iterator(Sequences.nreverse(v_instances));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 6068L)
    public static SubLObject new_instances_iterator(final SubLObject collection) {
        assert kb_iterators.NIL != forts.fort_p(collection) : collection;
        return iteration.new_iterator(make_iterator_instances_state(collection), Symbols.symbol_function((SubLObject)kb_iterators.$sym17$ITERATOR_INSTANCES_DONE), Symbols.symbol_function((SubLObject)kb_iterators.$sym18$ITERATOR_INSTANCES_NEXT), (SubLObject)kb_iterators.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 6365L)
    public static SubLObject make_iterator_instances_state(final SubLObject collection) {
        final SubLObject specs_iterator = new_specs_iterator(collection);
        final SubLObject local_instances_iterator = (SubLObject)kb_iterators.NIL;
        final SubLObject visited_table = Hashtables.make_hash_table((SubLObject)kb_iterators.$int11$100, Symbols.symbol_function((SubLObject)kb_iterators.EQUAL), (SubLObject)kb_iterators.UNPROVIDED);
        return (SubLObject)ConsesLow.list(specs_iterator, local_instances_iterator, visited_table);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 6869L)
    public static SubLObject iterator_instances_done(final SubLObject state) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_iterators.NIL == state.first() && kb_iterators.NIL == conses_high.second(state));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 6984L)
    public static SubLObject iterator_instances_next(final SubLObject state) {
        SubLObject specs_iterator = (SubLObject)kb_iterators.NIL;
        SubLObject local_instances_iterator = (SubLObject)kb_iterators.NIL;
        SubLObject visited_table = (SubLObject)kb_iterators.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)kb_iterators.$list19);
        specs_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)kb_iterators.$list19);
        local_instances_iterator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)kb_iterators.$list19);
        visited_table = current.first();
        current = current.rest();
        if (kb_iterators.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)kb_iterators.$list19);
            return (SubLObject)kb_iterators.NIL;
        }
        while (true) {
            if (kb_iterators.NIL != local_instances_iterator && kb_iterators.NIL == iteration.iteration_done(local_instances_iterator)) {
                final SubLObject next_instance = iteration.iteration_next(local_instances_iterator);
                if (kb_iterators.NIL == Hashtables.gethash(next_instance, visited_table, (SubLObject)kb_iterators.UNPROVIDED)) {
                    Hashtables.sethash(next_instance, visited_table, (SubLObject)kb_iterators.T);
                    return Values.values(next_instance, state, (SubLObject)kb_iterators.NIL);
                }
                continue;
            }
            else if (kb_iterators.NIL != local_instances_iterator) {
                local_instances_iterator = (SubLObject)kb_iterators.NIL;
                ConsesLow.set_nth((SubLObject)kb_iterators.ONE_INTEGER, state, local_instances_iterator);
            }
            else {
                if (kb_iterators.NIL != iteration.iteration_done(specs_iterator)) {
                    specs_iterator = (SubLObject)kb_iterators.NIL;
                    ConsesLow.set_nth((SubLObject)kb_iterators.ZERO_INTEGER, state, specs_iterator);
                    return Values.values((SubLObject)kb_iterators.NIL, state, (SubLObject)kb_iterators.T);
                }
                final SubLObject next_spec = iteration.iteration_next(specs_iterator);
                local_instances_iterator = new_local_instances_iterator(next_spec);
                ConsesLow.set_nth((SubLObject)kb_iterators.ONE_INTEGER, state, local_instances_iterator);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 8134L)
    public static SubLObject new_ontology_iterator(final SubLObject collection) {
        assert kb_iterators.NIL != forts.fort_p(collection) : collection;
        return iteration.new_iterator(make_iterator_ontology_state(collection), Symbols.symbol_function((SubLObject)kb_iterators.$sym20$ITERATOR_ONTOLOGY_DONE), Symbols.symbol_function((SubLObject)kb_iterators.$sym21$ITERATOR_ONTOLOGY_NEXT), (SubLObject)kb_iterators.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 8424L)
    public static SubLObject make_iterator_ontology_state(final SubLObject collection) {
        final SubLObject pending_specs_queue = queues.create_queue((SubLObject)kb_iterators.UNPROVIDED);
        final SubLObject pending_instances_queue = queues.create_queue((SubLObject)kb_iterators.UNPROVIDED);
        final SubLObject visited_table = Hashtables.make_hash_table(Numbers.add(cardinality_estimates.spec_cardinality(collection), cardinality_estimates.instance_cardinality(collection)), (SubLObject)kb_iterators.UNPROVIDED, (SubLObject)kb_iterators.UNPROVIDED);
        queues.enqueue(collection, pending_specs_queue);
        Hashtables.sethash(collection, visited_table, (SubLObject)kb_iterators.T);
        return (SubLObject)ConsesLow.list(pending_specs_queue, pending_instances_queue, visited_table);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 9089L)
    public static SubLObject iterator_ontology_done(final SubLObject state) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_iterators.NIL != queues.queue_empty_p(state.first()) && kb_iterators.NIL != queues.queue_empty_p(conses_high.second(state)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 9220L)
    public static SubLObject iterator_ontology_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pending_specs_queue = state.first();
        final SubLObject pending_instances_queue = conses_high.second(state);
        final SubLObject visited_table = conses_high.third(state);
        SubLObject next_item = (SubLObject)kb_iterators.NIL;
        if (kb_iterators.NIL == queues.queue_empty_p(pending_specs_queue)) {
            next_item = queues.dequeue(pending_specs_queue);
            SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind((kb_iterators.NIL != sbhl_module_vars.get_sbhl_module(kb_iterators.$const13$genls)) ? sbhl_module_vars.get_sbhl_module(kb_iterators.$const13$genls) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(next_item, sbhl_module_vars.get_sbhl_module(kb_iterators.$const13$genls));
                if (kb_iterators.NIL != d_link) {
                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module(kb_iterators.$const13$genls));
                    SubLObject direction = (SubLObject)kb_iterators.NIL;
                    direction = cdolist_list_var.first();
                    while (kb_iterators.NIL != cdolist_list_var) {
                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module(kb_iterators.$const13$genls));
                        if (kb_iterators.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kb_iterators.$const13$genls)))) {
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kb_iterators.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject mt_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state_$21;
                                for (iteration_state_$21 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kb_iterators.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$21); iteration_state_$21 = dictionary_contents.do_dictionary_contents_next(iteration_state_$21)) {
                                    thread.resetMultipleValues();
                                    final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$21);
                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (kb_iterators.NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject sol = link_nodes_var;
                                        if (kb_iterators.NIL != set.set_p(sol)) {
                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                            SubLObject basis_object;
                                            SubLObject state_$22;
                                            SubLObject spec;
                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$22 = (SubLObject)kb_iterators.NIL, state_$22 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_iterators.NIL == set_contents.do_set_contents_doneP(basis_object, state_$22); state_$22 = set_contents.do_set_contents_update_state(state_$22)) {
                                                spec = set_contents.do_set_contents_next(basis_object, state_$22);
                                                if (kb_iterators.NIL != set_contents.do_set_contents_element_validP(state_$22, spec) && kb_iterators.NIL != mt_relevance_macros.relevant_mtP(mt_var) && kb_iterators.NIL == Hashtables.gethash(spec, visited_table, (SubLObject)kb_iterators.UNPROVIDED)) {
                                                    Hashtables.sethash(spec, visited_table, (SubLObject)kb_iterators.T);
                                                    queues.enqueue(spec, pending_specs_queue);
                                                }
                                            }
                                        }
                                        else if (sol.isList()) {
                                            SubLObject csome_list_var = sol;
                                            SubLObject spec2 = (SubLObject)kb_iterators.NIL;
                                            spec2 = csome_list_var.first();
                                            while (kb_iterators.NIL != csome_list_var) {
                                                if (kb_iterators.NIL != mt_relevance_macros.relevant_mtP(mt_var) && kb_iterators.NIL == Hashtables.gethash(spec2, visited_table, (SubLObject)kb_iterators.UNPROVIDED)) {
                                                    Hashtables.sethash(spec2, visited_table, (SubLObject)kb_iterators.T);
                                                    queues.enqueue(spec2, pending_specs_queue);
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                spec2 = csome_list_var.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)kb_iterators.$str14$_A_is_neither_SET_P_nor_LISTP_, sol);
                                        }
                                    }
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$21);
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        direction = cdolist_list_var.first();
                    }
                }
            }
            finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
            _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind((kb_iterators.NIL != sbhl_module_vars.get_sbhl_module(kb_iterators.$const15$isa)) ? sbhl_module_vars.get_sbhl_module(kb_iterators.$const15$isa) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(next_item, sbhl_module_vars.get_sbhl_module(kb_iterators.$const15$isa));
                if (kb_iterators.NIL != d_link) {
                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module(kb_iterators.$const15$isa));
                    SubLObject direction = (SubLObject)kb_iterators.NIL;
                    direction = cdolist_list_var.first();
                    while (kb_iterators.NIL != cdolist_list_var) {
                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module(kb_iterators.$const15$isa));
                        if (kb_iterators.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kb_iterators.$const15$isa)))) {
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kb_iterators.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject mt_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state_$22;
                                for (iteration_state_$22 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kb_iterators.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$22); iteration_state_$22 = dictionary_contents.do_dictionary_contents_next(iteration_state_$22)) {
                                    thread.resetMultipleValues();
                                    final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$22);
                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (kb_iterators.NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject sol = link_nodes_var;
                                        if (kb_iterators.NIL != set.set_p(sol)) {
                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                            SubLObject basis_object;
                                            SubLObject state_$23;
                                            SubLObject instance;
                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state_$23 = (SubLObject)kb_iterators.NIL, state_$23 = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_iterators.NIL == set_contents.do_set_contents_doneP(basis_object, state_$23); state_$23 = set_contents.do_set_contents_update_state(state_$23)) {
                                                instance = set_contents.do_set_contents_next(basis_object, state_$23);
                                                if (kb_iterators.NIL != set_contents.do_set_contents_element_validP(state_$23, instance) && kb_iterators.NIL != mt_relevance_macros.relevant_mtP(mt_var) && kb_iterators.NIL == Hashtables.gethash(instance, visited_table, (SubLObject)kb_iterators.UNPROVIDED)) {
                                                    Hashtables.sethash(instance, visited_table, (SubLObject)kb_iterators.T);
                                                    queues.enqueue(instance, pending_instances_queue);
                                                }
                                            }
                                        }
                                        else if (sol.isList()) {
                                            SubLObject csome_list_var = sol;
                                            SubLObject instance2 = (SubLObject)kb_iterators.NIL;
                                            instance2 = csome_list_var.first();
                                            while (kb_iterators.NIL != csome_list_var) {
                                                if (kb_iterators.NIL != mt_relevance_macros.relevant_mtP(mt_var) && kb_iterators.NIL == Hashtables.gethash(instance2, visited_table, (SubLObject)kb_iterators.UNPROVIDED)) {
                                                    Hashtables.sethash(instance2, visited_table, (SubLObject)kb_iterators.T);
                                                    queues.enqueue(instance2, pending_instances_queue);
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                instance2 = csome_list_var.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)kb_iterators.$str14$_A_is_neither_SET_P_nor_LISTP_, sol);
                                        }
                                    }
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$22);
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        direction = cdolist_list_var.first();
                    }
                }
            }
            finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(next_item);
            SubLObject instance_tuple = (SubLObject)kb_iterators.NIL;
            instance_tuple = csome_list_var2.first();
            while (kb_iterators.NIL != csome_list_var2) {
                SubLObject current;
                final SubLObject datum = current = instance_tuple;
                SubLObject instance3 = (SubLObject)kb_iterators.NIL;
                SubLObject mt_var2 = (SubLObject)kb_iterators.NIL;
                SubLObject tv_var2 = (SubLObject)kb_iterators.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_iterators.$list16);
                instance3 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_iterators.$list16);
                mt_var2 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_iterators.$list16);
                tv_var2 = current.first();
                current = current.rest();
                if (kb_iterators.NIL == current) {
                    if (kb_iterators.NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var2) && kb_iterators.NIL != mt_relevance_macros.relevant_mtP(mt_var2) && kb_iterators.NIL == Hashtables.gethash(instance3, visited_table, (SubLObject)kb_iterators.UNPROVIDED)) {
                        Hashtables.sethash(instance3, visited_table, (SubLObject)kb_iterators.T);
                        queues.enqueue(instance3, pending_instances_queue);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_iterators.$list16);
                }
                csome_list_var2 = csome_list_var2.rest();
                instance_tuple = csome_list_var2.first();
            }
            return Values.values(next_item, state);
        }
        if (kb_iterators.NIL == queues.queue_empty_p(pending_instances_queue)) {
            next_item = queues.dequeue(pending_instances_queue);
            return Values.values(next_item, state);
        }
        return Values.values((SubLObject)kb_iterators.NIL, state, (SubLObject)kb_iterators.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 10262L)
    public static SubLObject new_rule_iterator() {
        final SubLObject rule_set = assertions_low.kb_rule_set();
        if (kb_iterators.NIL != keyhash.keyhash_p(rule_set)) {
            return keyhash.new_keyhash_iterator(rule_set);
        }
        if (rule_set.isHashtable()) {
            return iteration.new_hash_table_keys_iterator(rule_set);
        }
        return Errors.error((SubLObject)kb_iterators.$str22$Rule_set_is_not_initialized_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 10807L)
    public static SubLObject new_transitive_iterator(final SubLObject fort, final SubLObject predicate, SubLObject argnum) {
        if (argnum == kb_iterators.UNPROVIDED) {
            argnum = (SubLObject)kb_iterators.ONE_INTEGER;
        }
        assert kb_iterators.NIL != forts.fort_p(fort) : fort;
        assert kb_iterators.NIL != forts.fort_p(predicate) : predicate;
        return iteration.new_iterator(make_iterator_transitive_state(fort, predicate, argnum), Symbols.symbol_function((SubLObject)kb_iterators.$sym23$ITERATOR_TRANSITIVE_DONE), Symbols.symbol_function((SubLObject)kb_iterators.$sym24$ITERATOR_TRANSITIVE_NEXT), (SubLObject)kb_iterators.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 11173L)
    public static SubLObject make_iterator_transitive_state(final SubLObject fort, final SubLObject predicate, final SubLObject from_arg) {
        final SubLObject pending_queue = queues.create_queue((SubLObject)kb_iterators.UNPROVIDED);
        final SubLObject visited_table = Hashtables.make_hash_table((SubLObject)kb_iterators.TEN_INTEGER, (SubLObject)kb_iterators.UNPROVIDED, (SubLObject)kb_iterators.UNPROVIDED);
        queues.enqueue(fort, pending_queue);
        Hashtables.sethash(fort, visited_table, (SubLObject)kb_iterators.T);
        return Vectors.vector(new SubLObject[] { pending_queue, visited_table, predicate, from_arg });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 11664L)
    public static SubLObject iterator_transitive_done(final SubLObject state) {
        return queues.queue_empty_p(Vectors.aref(state, (SubLObject)kb_iterators.ZERO_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-iterators.lisp", position = 11754L)
    public static SubLObject iterator_transitive_next(final SubLObject state) {
        final SubLObject pending_queue = Vectors.aref(state, (SubLObject)kb_iterators.ZERO_INTEGER);
        final SubLObject visited_table = Vectors.aref(state, (SubLObject)kb_iterators.ONE_INTEGER);
        final SubLObject predicate = Vectors.aref(state, (SubLObject)kb_iterators.TWO_INTEGER);
        final SubLObject from_arg = Vectors.aref(state, (SubLObject)kb_iterators.THREE_INTEGER);
        final SubLObject to_arg = (SubLObject)(from_arg.eql((SubLObject)kb_iterators.ONE_INTEGER) ? kb_iterators.TWO_INTEGER : kb_iterators.ONE_INTEGER);
        SubLObject next_item = (SubLObject)kb_iterators.NIL;
        while (kb_iterators.NIL == queues.queue_empty_p(pending_queue) && kb_iterators.NIL == next_item) {
            next_item = queues.dequeue(pending_queue);
            SubLObject spec = (SubLObject)kb_iterators.NIL;
            final SubLObject pred_var = predicate;
            if (kb_iterators.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(next_item, from_arg, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(next_item, from_arg, pred_var);
                SubLObject done_var = (SubLObject)kb_iterators.NIL;
                final SubLObject token_var = (SubLObject)kb_iterators.NIL;
                while (kb_iterators.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (kb_iterators.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)kb_iterators.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_iterators.$kw6$GAF, (SubLObject)kb_iterators.$kw25$TRUE, (SubLObject)kb_iterators.NIL);
                            SubLObject done_var_$25 = (SubLObject)kb_iterators.NIL;
                            final SubLObject token_var_$26 = (SubLObject)kb_iterators.NIL;
                            while (kb_iterators.NIL == done_var_$25) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                final SubLObject valid_$27 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$26.eql(assertion));
                                if (kb_iterators.NIL != valid_$27) {
                                    spec = assertions_high.gaf_arg(assertion, to_arg);
                                    if (kb_iterators.NIL == Hashtables.gethash(spec, visited_table, (SubLObject)kb_iterators.UNPROVIDED)) {
                                        Hashtables.sethash(spec, visited_table, (SubLObject)kb_iterators.T);
                                        queues.enqueue(spec, pending_queue);
                                    }
                                }
                                done_var_$25 = (SubLObject)SubLObjectFactory.makeBoolean(kb_iterators.NIL == valid_$27);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)kb_iterators.T);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (kb_iterators.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_iterators.NIL == valid);
                }
            }
        }
        return Values.values(next_item, state, (SubLObject)kb_iterators.NIL);
    }
    
    public static SubLObject declare_kb_iterators_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "new_gaf_arg_index_iterator", "NEW-GAF-ARG-INDEX-ITERATOR", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "new_nart_arg_index_iterator", "NEW-NART-ARG-INDEX-ITERATOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "new_predicate_extent_index_iterator", "NEW-PREDICATE-EXTENT-INDEX-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "new_function_extent_index_iterator", "NEW-FUNCTION-EXTENT-INDEX-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "new_mt_index_iterator", "NEW-MT-INDEX-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "new_best_gaf_lookup_index_iterator", "NEW-BEST-GAF-LOOKUP-INDEX-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "new_genls_iterator", "NEW-GENLS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "new_isa_iterator", "NEW-ISA-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "new_specs_iterator", "NEW-SPECS-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "make_iterator_specs_state", "MAKE-ITERATOR-SPECS-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "iterator_specs_done", "ITERATOR-SPECS-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "iterator_specs_next", "ITERATOR-SPECS-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "new_local_instances_iterator", "NEW-LOCAL-INSTANCES-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "new_instances_iterator", "NEW-INSTANCES-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "make_iterator_instances_state", "MAKE-ITERATOR-INSTANCES-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "iterator_instances_done", "ITERATOR-INSTANCES-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "iterator_instances_next", "ITERATOR-INSTANCES-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "new_ontology_iterator", "NEW-ONTOLOGY-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "make_iterator_ontology_state", "MAKE-ITERATOR-ONTOLOGY-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "iterator_ontology_done", "ITERATOR-ONTOLOGY-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "iterator_ontology_next", "ITERATOR-ONTOLOGY-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "new_rule_iterator", "NEW-RULE-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "new_transitive_iterator", "NEW-TRANSITIVE-ITERATOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "make_iterator_transitive_state", "MAKE-ITERATOR-TRANSITIVE-STATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "iterator_transitive_done", "ITERATOR-TRANSITIVE-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_iterators", "iterator_transitive_next", "ITERATOR-TRANSITIVE-NEXT", 1, 0, false);
        return (SubLObject)kb_iterators.NIL;
    }
    
    public static SubLObject init_kb_iterators_file() {
        return (SubLObject)kb_iterators.NIL;
    }
    
    public static SubLObject setup_kb_iterators_file() {
        return (SubLObject)kb_iterators.NIL;
    }
    
    public void declareFunctions() {
        declare_kb_iterators_file();
    }
    
    public void initializeVariables() {
        init_kb_iterators_file();
    }
    
    public void runTopLevelForms() {
        setup_kb_iterators_file();
    }
    
    static {
        me = (SubLFile)new kb_iterators();
        $kw0$INDEX_TYPE = SubLObjectFactory.makeKeyword("INDEX-TYPE");
        $kw1$GAF_ARG = SubLObjectFactory.makeKeyword("GAF-ARG");
        $kw2$TERM = SubLObjectFactory.makeKeyword("TERM");
        $kw3$ARGNUM = SubLObjectFactory.makeKeyword("ARGNUM");
        $kw4$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw5$PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $kw6$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw7$OVERLAP = SubLObjectFactory.makeKeyword("OVERLAP");
        $sym8$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym9$ITERATOR_SPECS_DONE = SubLObjectFactory.makeSymbol("ITERATOR-SPECS-DONE");
        $sym10$ITERATOR_SPECS_NEXT = SubLObjectFactory.makeSymbol("ITERATOR-SPECS-NEXT");
        $int11$100 = SubLObjectFactory.makeInteger(100);
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PENDING-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("VISITED-TABLE"));
        $const13$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $str14$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $const15$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV-VAR"));
        $sym17$ITERATOR_INSTANCES_DONE = SubLObjectFactory.makeSymbol("ITERATOR-INSTANCES-DONE");
        $sym18$ITERATOR_INSTANCES_NEXT = SubLObjectFactory.makeSymbol("ITERATOR-INSTANCES-NEXT");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPECS-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("LOCAL-INSTANCES-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("VISITED-TABLE"));
        $sym20$ITERATOR_ONTOLOGY_DONE = SubLObjectFactory.makeSymbol("ITERATOR-ONTOLOGY-DONE");
        $sym21$ITERATOR_ONTOLOGY_NEXT = SubLObjectFactory.makeSymbol("ITERATOR-ONTOLOGY-NEXT");
        $str22$Rule_set_is_not_initialized_ = SubLObjectFactory.makeString("Rule set is not initialized.");
        $sym23$ITERATOR_TRANSITIVE_DONE = SubLObjectFactory.makeSymbol("ITERATOR-TRANSITIVE-DONE");
        $sym24$ITERATOR_TRANSITIVE_NEXT = SubLObjectFactory.makeSymbol("ITERATOR-TRANSITIVE-NEXT");
        $kw25$TRUE = SubLObjectFactory.makeKeyword("TRUE");
    }
}

/*

	Total time: 618 ms
	
*/