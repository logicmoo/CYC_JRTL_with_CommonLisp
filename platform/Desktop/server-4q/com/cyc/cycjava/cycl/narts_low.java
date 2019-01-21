package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.inference.arete;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class narts_low extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.narts_low";
    public static final String myFingerPrint = "b31a4e6354885da7dce9c16c2cb30d1f35461be43919275dc795d41f7de3dabf";
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$NART_ARG;
    private static final SubLSymbol $kw2$GAF;
    private static final SubLSymbol $kw3$FUNCTION_EXTENT;
    private static final SubLSymbol $kw4$OVERLAP;
    private static final SubLSymbol $sym5$NART_P;
    private static final SubLSymbol $sym6$NAT_FORMULA_P;
    private static final SubLObject $const7$termOfUnit;
    private static final SubLSymbol $kw8$FORWARD;
    private static final SubLSymbol $kw9$TRUE;
    private static final SubLSymbol $kw10$MONOTONIC;
    private static final SubLString $str11$Initializing_NART_HL_formula_tabl;
    private static final SubLSymbol $sym12$RELEVANT_MT_IS_EQ;
    private static final SubLSymbol $sym13$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym16$CSETQ;
    private static final SubLString $str17$_A;
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-low.lisp", position = 872L)
    public static SubLObject register_nart_hl_formula_for_kb_load(final SubLObject id, final SubLObject nart_hl_formula) {
        return nart_hl_formula_manager.register_nart_hl_formula(id, nart_hl_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-low.lisp", position = 1164L)
    public static SubLObject nart_hl_formula_internal(final SubLObject nart) {
        return nart_hl_formula_manager.lookup_nart_hl_formula(nart_handles.nart_id(nart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-low.lisp", position = 1500L)
    public static SubLObject lookup_nart_internal(final SubLObject nart_hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (narts_low.NIL != el_utilities.possibly_naut_p(nart_hl_formula)) {
            final SubLObject v_methods = (SubLObject)narts_low.$list0;
            SubLObject ans = (SubLObject)narts_low.NIL;
            final SubLObject l_index = kb_indexing.best_nat_lookup_index(nart_hl_formula, v_methods);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_nli_extract_method(l_index);
            if (pcase_var.eql((SubLObject)narts_low.$kw1$NART_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_nli_vna_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject functor = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (narts_low.NIL != argnum) {
                    if (narts_low.NIL != functor) {
                        if (narts_low.NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, functor)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, functor);
                            SubLObject done_var = ans;
                            final SubLObject token_var = (SubLObject)narts_low.NIL;
                            while (narts_low.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (narts_low.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)narts_low.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)narts_low.$kw2$GAF, (SubLObject)narts_low.NIL, (SubLObject)narts_low.NIL);
                                        SubLObject done_var_$1 = ans;
                                        final SubLObject token_var_$2 = (SubLObject)narts_low.NIL;
                                        while (narts_low.NIL == done_var_$1) {
                                            final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                            final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(tou_assertion));
                                            if (narts_low.NIL != valid_$3 && narts_low.NIL != assertion_handles.valid_assertionP(tou_assertion, (SubLObject)narts_low.UNPROVIDED)) {
                                                final SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                                if (narts_low.NIL != el_utilities.possibly_naut_p(naut) && narts_low.NIL != Functions.funcall(control_vars.$nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula)) {
                                                    ans = assertions_high.gaf_arg1(tou_assertion);
                                                }
                                            }
                                            done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(narts_low.NIL == valid_$3 || narts_low.NIL != ans);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)narts_low.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (narts_low.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(narts_low.NIL == valid || narts_low.NIL != ans);
                            }
                        }
                    }
                    else if (narts_low.NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, (SubLObject)narts_low.NIL)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, (SubLObject)narts_low.NIL);
                        SubLObject done_var = ans;
                        final SubLObject token_var = (SubLObject)narts_low.NIL;
                        while (narts_low.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (narts_low.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)narts_low.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)narts_low.$kw2$GAF, (SubLObject)narts_low.NIL, (SubLObject)narts_low.NIL);
                                    SubLObject done_var_$2 = ans;
                                    final SubLObject token_var_$3 = (SubLObject)narts_low.NIL;
                                    while (narts_low.NIL == done_var_$2) {
                                        final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                        final SubLObject valid_$4 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$3.eql(tou_assertion));
                                        if (narts_low.NIL != valid_$4 && narts_low.NIL != assertion_handles.valid_assertionP(tou_assertion, (SubLObject)narts_low.UNPROVIDED)) {
                                            final SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                            if (narts_low.NIL != el_utilities.possibly_naut_p(naut) && narts_low.NIL != Functions.funcall(control_vars.$nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula)) {
                                                ans = assertions_high.gaf_arg1(tou_assertion);
                                            }
                                        }
                                        done_var_$2 = (SubLObject)SubLObjectFactory.makeBoolean(narts_low.NIL == valid_$4 || narts_low.NIL != ans);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)narts_low.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (narts_low.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(narts_low.NIL == valid || narts_low.NIL != ans);
                        }
                    }
                }
                else if (narts_low.NIL != functor) {
                    if (narts_low.NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, (SubLObject)narts_low.NIL, functor)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, (SubLObject)narts_low.NIL, functor);
                        SubLObject done_var = ans;
                        final SubLObject token_var = (SubLObject)narts_low.NIL;
                        while (narts_low.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (narts_low.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)narts_low.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)narts_low.$kw2$GAF, (SubLObject)narts_low.NIL, (SubLObject)narts_low.NIL);
                                    SubLObject done_var_$3 = ans;
                                    final SubLObject token_var_$4 = (SubLObject)narts_low.NIL;
                                    while (narts_low.NIL == done_var_$3) {
                                        final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                        final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(tou_assertion));
                                        if (narts_low.NIL != valid_$5 && narts_low.NIL != assertion_handles.valid_assertionP(tou_assertion, (SubLObject)narts_low.UNPROVIDED)) {
                                            final SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                            if (narts_low.NIL != el_utilities.possibly_naut_p(naut) && narts_low.NIL != Functions.funcall(control_vars.$nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula)) {
                                                ans = assertions_high.gaf_arg1(tou_assertion);
                                            }
                                        }
                                        done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(narts_low.NIL == valid_$5 || narts_low.NIL != ans);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)narts_low.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (narts_low.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(narts_low.NIL == valid || narts_low.NIL != ans);
                        }
                    }
                }
                else if (narts_low.NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, (SubLObject)narts_low.NIL, (SubLObject)narts_low.NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, (SubLObject)narts_low.NIL, (SubLObject)narts_low.NIL);
                    SubLObject done_var = ans;
                    final SubLObject token_var = (SubLObject)narts_low.NIL;
                    while (narts_low.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (narts_low.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)narts_low.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)narts_low.$kw2$GAF, (SubLObject)narts_low.NIL, (SubLObject)narts_low.NIL);
                                SubLObject done_var_$4 = ans;
                                final SubLObject token_var_$5 = (SubLObject)narts_low.NIL;
                                while (narts_low.NIL == done_var_$4) {
                                    final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                    final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(tou_assertion));
                                    if (narts_low.NIL != valid_$6 && narts_low.NIL != assertion_handles.valid_assertionP(tou_assertion, (SubLObject)narts_low.UNPROVIDED)) {
                                        final SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                        if (narts_low.NIL != el_utilities.possibly_naut_p(naut) && narts_low.NIL != Functions.funcall(control_vars.$nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula)) {
                                            ans = assertions_high.gaf_arg1(tou_assertion);
                                        }
                                    }
                                    done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(narts_low.NIL == valid_$6 || narts_low.NIL != ans);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)narts_low.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    if (narts_low.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(narts_low.NIL == valid || narts_low.NIL != ans);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)narts_low.$kw3$FUNCTION_EXTENT)) {
                if (narts_low.NIL != kb_mapping_macros.do_function_extent_index_key_validator(kb_mapping_macros.do_nli_vfe_extract_key(l_index))) {
                    final SubLObject final_index_spec2 = kb_mapping_macros.function_extent_final_index_spec(kb_mapping_macros.do_nli_vfe_extract_key(l_index));
                    SubLObject final_index_iterator2 = (SubLObject)narts_low.NIL;
                    try {
                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)narts_low.$kw2$GAF, (SubLObject)narts_low.NIL, (SubLObject)narts_low.NIL);
                        SubLObject done_var2 = ans;
                        final SubLObject token_var2 = (SubLObject)narts_low.NIL;
                        while (narts_low.NIL == done_var2) {
                            final SubLObject tou_assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(tou_assertion2));
                            if (narts_low.NIL != valid2 && narts_low.NIL != assertion_handles.valid_assertionP(tou_assertion2, (SubLObject)narts_low.UNPROVIDED)) {
                                final SubLObject naut2 = assertions_high.gaf_arg2(tou_assertion2);
                                if (narts_low.NIL != el_utilities.possibly_naut_p(naut2) && narts_low.NIL != Functions.funcall(control_vars.$nat_matching_predicate$.getDynamicValue(thread), naut2, nart_hl_formula)) {
                                    ans = assertions_high.gaf_arg1(tou_assertion2);
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(narts_low.NIL == valid2 || narts_low.NIL != ans);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)narts_low.T, thread);
                            final SubLObject _values5 = Values.getValuesAsVector();
                            if (narts_low.NIL != final_index_iterator2) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                            }
                            Values.restoreValuesFromVector(_values5);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)narts_low.$kw4$OVERLAP)) {
                SubLObject rest;
                SubLObject tou_assertion3;
                SubLObject naut3;
                for (rest = (SubLObject)narts_low.NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_nli_vo_extract_key(l_index), (SubLObject)narts_low.UNPROVIDED); narts_low.NIL == ans && narts_low.NIL != rest; rest = rest.rest()) {
                    tou_assertion3 = rest.first();
                    if (narts_low.NIL != assertion_handles.valid_assertionP(tou_assertion3, (SubLObject)narts_low.UNPROVIDED)) {
                        naut3 = assertions_high.gaf_arg2(tou_assertion3);
                        if (narts_low.NIL != el_utilities.possibly_naut_p(naut3) && narts_low.NIL != Functions.funcall(control_vars.$nat_matching_predicate$.getDynamicValue(thread), naut3, nart_hl_formula)) {
                            ans = assertions_high.gaf_arg1(tou_assertion3);
                        }
                    }
                }
            }
            else {
                kb_mapping_macros.do_nli_method_error(l_index, method);
            }
            return ans;
        }
        return (SubLObject)narts_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-low.lisp", position = 2352L)
    public static SubLObject nart_index(final SubLObject nart) {
        assert narts_low.NIL != nart_handles.nart_p(nart) : nart;
        return nart_index_manager.lookup_nart_index(nart_handles.nart_id(nart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-low.lisp", position = 2629L)
    public static SubLObject nart_index_swapped_inP(final SubLObject nart) {
        assert narts_low.NIL != nart_handles.nart_p(nart) : nart;
        arete.arete_note_nart_touched(nart);
        return nart_index_manager.nart_index_cachedP(nart_handles.nart_id(nart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-low.lisp", position = 2942L)
    public static SubLObject kb_create_nart_kb_store(final SubLObject nart_hl_formula) {
        SubLObject nart = lookup_nart_internal(nart_hl_formula);
        if (narts_low.NIL != nart) {
            return nart_handles.nart_id(nart);
        }
        final SubLObject internal_id = nart_handles.make_nart_id();
        nart = nart_handles.make_nart_shell(internal_id);
        kb_create_nart_int(nart, internal_id, nart_hl_formula);
        return internal_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-low.lisp", position = 3416L)
    public static SubLObject kb_create_nart_int(final SubLObject nart, final SubLObject internal_id, final SubLObject nart_hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        nart_hl_formula_manager.register_nart_hl_formula(internal_id, nart_hl_formula);
        final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
        try {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind((SubLObject)narts_low.NIL, thread);
            add_nart_indices(nart, nart_hl_formula);
        }
        finally {
            hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)narts_low.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-low.lisp", position = 3767L)
    public static SubLObject kb_create_nart_cyc(final SubLObject internal_id) {
        return nart_handles.make_nart_shell(internal_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-low.lisp", position = 3979L)
    public static SubLObject add_nart_indices(final SubLObject nart, final SubLObject nart_hl_formula) {
        assert narts_low.NIL != nart_handles.nart_p(nart) : nart;
        assert narts_low.NIL != function_terms.nat_formula_p(nart_hl_formula) : nart_hl_formula;
        final SubLObject tou_asent = el_utilities.make_binary_formula(narts_low.$const7$termOfUnit, nart, nart_hl_formula);
        final SubLObject tou_cnf = clause_utilities.make_gaf_cnf(tou_asent);
        final SubLObject tou_direction = (SubLObject)narts_low.$kw8$FORWARD;
        final SubLObject tou_assertion = assertions_interface.kb_create_assertion(tou_cnf, mt_vars.$tou_mt$.getGlobalValue(), (SubLObject)narts_low.NIL, tou_direction, (SubLObject)narts_low.$kw9$TRUE, (SubLObject)narts_low.$kw10$MONOTONIC, (SubLObject)narts_low.NIL);
        return nart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-low.lisp", position = 4831L)
    public static SubLObject reinstall_nart_hl_formula(final SubLObject nart, final SubLObject new_nart_hl_formula) {
        assert narts_low.NIL != nart_handles.nart_p(nart) : nart;
        assert narts_low.NIL != function_terms.nat_formula_p(new_nart_hl_formula) : new_nart_hl_formula;
        final SubLObject tou_ass = function_terms.term_of_unit_assertion(nart);
        final SubLObject new_tou_cnf = clause_utilities.make_gaf_cnf(el_utilities.make_binary_formula(narts_low.$const7$termOfUnit, nart, new_nart_hl_formula));
        assertions_low.reconnect_assertion(tou_ass, new_tou_cnf);
        return nart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-low.lisp", position = 5478L)
    public static SubLObject initialize_nart_hl_formulas_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        nart_hl_formula_manager.setup_nart_hl_formula_table(nart_handles.nart_count(), (SubLObject)narts_low.NIL);
        SubLObject count = (SubLObject)narts_low.ZERO_INTEGER;
        final SubLObject total = kb_indexing.num_predicate_extent_index(narts_low.$const7$termOfUnit, mt_vars.$tou_mt$.getGlobalValue());
        SubLObject sofar = (SubLObject)narts_low.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)narts_low.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)narts_low.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)narts_low.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)narts_low.$str11$Initializing_NART_HL_formula_tabl);
                final SubLObject _prev_bind_0_$13 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$14 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)narts_low.$sym12$RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(mt_vars.$tou_mt$.getGlobalValue(), thread);
                    final SubLObject pred_var = narts_low.$const7$termOfUnit;
                    if (narts_low.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = (SubLObject)narts_low.NIL;
                        final SubLObject _prev_bind_0_$14 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$15 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$17 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$18 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind((SubLObject)narts_low.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)narts_low.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)narts_low.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)narts_low.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((narts_low.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : narts_low.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = (SubLObject)narts_low.NIL;
                            final SubLObject token_var = (SubLObject)narts_low.NIL;
                            while (narts_low.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (narts_low.NIL != valid) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator = (SubLObject)narts_low.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)narts_low.$kw2$GAF, (SubLObject)narts_low.$kw9$TRUE, (SubLObject)narts_low.NIL);
                                        SubLObject done_var_$19 = (SubLObject)narts_low.NIL;
                                        final SubLObject token_var_$20 = (SubLObject)narts_low.NIL;
                                        while (narts_low.NIL == done_var_$19) {
                                            final SubLObject tou_ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                            final SubLObject valid_$21 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$20.eql(tou_ass));
                                            if (narts_low.NIL != valid_$21) {
                                                utilities_macros.note_percent_progress(sofar, total);
                                                sofar = Numbers.add(sofar, (SubLObject)narts_low.ONE_INTEGER);
                                                SubLObject message_var = (SubLObject)narts_low.NIL;
                                                final SubLObject was_appendingP = Eval.eval((SubLObject)narts_low.$sym13$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                                                Eval.eval((SubLObject)narts_low.$list14);
                                                try {
                                                    try {
                                                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                                        final SubLObject _prev_bind_0_$15 = Errors.$error_handler$.currentBinding(thread);
                                                        try {
                                                            Errors.$error_handler$.bind((SubLObject)narts_low.$sym15$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                            try {
                                                                final SubLObject nart = assertions_high.gaf_arg1(tou_ass);
                                                                final SubLObject nart_hl_formula = assertions_high.gaf_arg2(tou_ass);
                                                                if (narts_low.NIL != nart_handles.valid_nartP(nart, (SubLObject)narts_low.UNPROVIDED) && narts_low.NIL != function_terms.nat_formula_p(nart_hl_formula)) {
                                                                    reset_nart_hl_formula(nart, nart_hl_formula);
                                                                    count = Numbers.add(count, (SubLObject)narts_low.ONE_INTEGER);
                                                                }
                                                            }
                                                            catch (Throwable catch_var) {
                                                                Errors.handleThrowable(catch_var, (SubLObject)narts_low.NIL);
                                                            }
                                                        }
                                                        finally {
                                                            Errors.$error_handler$.rebind(_prev_bind_0_$15, thread);
                                                        }
                                                    }
                                                    catch (Throwable ccatch_env_var) {
                                                        message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                                    }
                                                    finally {
                                                        thread.throwStack.pop();
                                                    }
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)narts_low.T, thread);
                                                        final SubLObject _values = Values.getValuesAsVector();
                                                        Eval.eval((SubLObject)ConsesLow.list((SubLObject)narts_low.$sym16$CSETQ, (SubLObject)narts_low.$sym13$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                                                        Values.restoreValuesFromVector(_values);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                                    }
                                                }
                                                if (message_var.isString()) {
                                                    Errors.warn((SubLObject)narts_low.$str17$_A, message_var);
                                                }
                                            }
                                            done_var_$19 = (SubLObject)SubLObjectFactory.makeBoolean(narts_low.NIL == valid_$21);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)narts_low.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (narts_low.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(narts_low.NIL == valid);
                            }
                            utilities_macros.noting_progress_postamble();
                        }
                        finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$18, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$17, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$15, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$14, thread);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$14, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$13, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)narts_low.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Values.values(count, nart_handles.nart_count());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-low.lisp", position = 6456L)
    public static SubLObject reset_nart_hl_formula(final SubLObject nart, final SubLObject new_hl_formula) {
        nart_hl_formula_manager.register_nart_hl_formula(nart_handles.nart_id(nart), new_hl_formula);
        return nart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-low.lisp", position = 6655L)
    public static SubLObject reset_nart_index(final SubLObject nart, final SubLObject new_index) {
        assert narts_low.NIL != nart_handles.nart_p(nart) : nart;
        nart_index_manager.register_nart_index(nart_handles.nart_id(nart), new_index);
        return nart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/narts-low.lisp", position = 6983L)
    public static SubLObject kb_remove_nart_internal(final SubLObject nart) {
        SubLObject cdolist_list_var = function_terms.term_of_unit_assertions(nart);
        SubLObject tou_ass = (SubLObject)narts_low.NIL;
        tou_ass = cdolist_list_var.first();
        while (narts_low.NIL != cdolist_list_var) {
            if (narts_low.NIL != assertion_handles.valid_assertionP(tou_ass, (SubLObject)narts_low.UNPROVIDED)) {
                assertions_low.kb_remove_assertion_internal(tou_ass);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tou_ass = cdolist_list_var.first();
        }
        final SubLObject id = nart_handles.nart_id(nart);
        if (id.isInteger()) {
            nart_index_manager.deregister_nart_index(id);
            nart_hl_formula_manager.deregister_nart_hl_formula(id);
            nart_handles.deregister_nart_id(id);
        }
        nart_handles.free_nart(nart);
        return (SubLObject)narts_low.NIL;
    }
    
    public static SubLObject declare_narts_low_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_low", "register_nart_hl_formula_for_kb_load", "REGISTER-NART-HL-FORMULA-FOR-KB-LOAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_low", "nart_hl_formula_internal", "NART-HL-FORMULA-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_low", "lookup_nart_internal", "LOOKUP-NART-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_low", "nart_index", "NART-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_low", "nart_index_swapped_inP", "NART-INDEX-SWAPPED-IN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_low", "kb_create_nart_kb_store", "KB-CREATE-NART-KB-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_low", "kb_create_nart_int", "KB-CREATE-NART-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_low", "kb_create_nart_cyc", "KB-CREATE-NART-CYC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_low", "add_nart_indices", "ADD-NART-INDICES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_low", "reinstall_nart_hl_formula", "REINSTALL-NART-HL-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_low", "initialize_nart_hl_formulas_internal", "INITIALIZE-NART-HL-FORMULAS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_low", "reset_nart_hl_formula", "RESET-NART-HL-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_low", "reset_nart_index", "RESET-NART-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.narts_low", "kb_remove_nart_internal", "KB-REMOVE-NART-INTERNAL", 1, 0, false);
        return (SubLObject)narts_low.NIL;
    }
    
    public static SubLObject init_narts_low_file() {
        return (SubLObject)narts_low.NIL;
    }
    
    public static SubLObject setup_narts_low_file() {
        return (SubLObject)narts_low.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_narts_low_file();
    }
    
    @Override
	public void initializeVariables() {
        init_narts_low_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_narts_low_file();
    }
    
    static {
        me = (SubLFile)new narts_low();
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NART-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("FUNCTION-EXTENT"));
        $kw1$NART_ARG = SubLObjectFactory.makeKeyword("NART-ARG");
        $kw2$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw3$FUNCTION_EXTENT = SubLObjectFactory.makeKeyword("FUNCTION-EXTENT");
        $kw4$OVERLAP = SubLObjectFactory.makeKeyword("OVERLAP");
        $sym5$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $sym6$NAT_FORMULA_P = SubLObjectFactory.makeSymbol("NAT-FORMULA-P");
        $const7$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $kw8$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $kw9$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw10$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $str11$Initializing_NART_HL_formula_tabl = SubLObjectFactory.makeString("Initializing NART HL formula table");
        $sym12$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $sym13$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), (SubLObject)narts_low.NIL);
        $sym15$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym16$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $str17$_A = SubLObjectFactory.makeString("~A");
    }
}

/*

	Total time: 427 ms
	
*/