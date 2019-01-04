package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class function_terms extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.function_terms";
    public static final String myFingerPrint = "cc631df5d6c9938f5f267fd10b971d30c60d95aa8cc5e0ffe1a8dd50f990e330";
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 2172L)
    public static SubLSymbol $term_functional_complexity_internal_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 4213L)
    public static SubLSymbol $term_relational_complexity_internal_method_table$;
    private static final SubLSymbol $sym0$TERM_OF_UNIT;
    private static final SubLSymbol $sym1$NART_P;
    private static final SubLSymbol $sym2$RELEVANT_MT_IS_EQ;
    private static final SubLObject $const3$termOfUnit;
    private static final SubLSymbol $kw4$GAF;
    private static final SubLSymbol $sym5$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const6$EverythingPSC;
    private static final SubLInteger $int7$256;
    private static final SubLSymbol $sym8$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD;
    private static final SubLSymbol $sym9$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_NART_METHOD;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONS_METHOD;
    private static final SubLSymbol $sym12$TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD;
    private static final SubLSymbol $sym13$TERM_RELATIONAL_COMPLEXITY_INTERNAL_NART_METHOD;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONS_METHOD;
    private static final SubLSymbol $sym16$FORT_P;
    private static final SubLSymbol $sym17$INTEGERP;
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 377L)
    public static SubLObject term_of_unit(final SubLObject nart) {
        if (function_terms.NIL != nart_handles.nart_p(nart)) {
            return narts_high.nart_hl_formula(nart);
        }
        return (SubLObject)function_terms.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 478L)
    public static SubLObject term_of_unit_assertion(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert function_terms.NIL != nart_handles.nart_p(nart) : nart;
        SubLObject ans = (SubLObject)function_terms.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)function_terms.$sym2$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt_vars.$tou_mt$.getGlobalValue(), thread);
            final SubLObject pred_var = function_terms.$const3$termOfUnit;
            if (function_terms.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(nart, (SubLObject)function_terms.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(nart, (SubLObject)function_terms.ONE_INTEGER, pred_var);
                SubLObject done_var = ans;
                final SubLObject token_var = (SubLObject)function_terms.NIL;
                while (function_terms.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (function_terms.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)function_terms.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)function_terms.$kw4$GAF, (SubLObject)function_terms.NIL, (SubLObject)function_terms.NIL);
                            SubLObject done_var_$1 = ans;
                            final SubLObject token_var_$2 = (SubLObject)function_terms.NIL;
                            while (function_terms.NIL == done_var_$1) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(assertion));
                                if (function_terms.NIL != valid_$3) {
                                    ans = assertion;
                                }
                                done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(function_terms.NIL == valid_$3 || function_terms.NIL != ans);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)function_terms.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (function_terms.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(function_terms.NIL == valid || function_terms.NIL != ans);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 844L)
    public static SubLObject term_of_unit_assertions(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert function_terms.NIL != nart_handles.nart_p(nart) : nart;
        SubLObject ans = (SubLObject)function_terms.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)function_terms.$sym2$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt_vars.$tou_mt$.getGlobalValue(), thread);
            final SubLObject pred_var = function_terms.$const3$termOfUnit;
            if (function_terms.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(nart, (SubLObject)function_terms.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(nart, (SubLObject)function_terms.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)function_terms.NIL;
                final SubLObject token_var = (SubLObject)function_terms.NIL;
                while (function_terms.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (function_terms.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)function_terms.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)function_terms.$kw4$GAF, (SubLObject)function_terms.NIL, (SubLObject)function_terms.NIL);
                            SubLObject done_var_$5 = (SubLObject)function_terms.NIL;
                            final SubLObject token_var_$6 = (SubLObject)function_terms.NIL;
                            while (function_terms.NIL == done_var_$5) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(assertion));
                                if (function_terms.NIL != valid_$7) {
                                    ans = (SubLObject)ConsesLow.cons(assertion, ans);
                                }
                                done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(function_terms.NIL == valid_$7);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)function_terms.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (function_terms.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(function_terms.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 1175L)
    public static SubLObject nart_hl_formula_via_term_of_unit_assertion(final SubLObject nart) {
        final SubLObject tou_ass = term_of_unit_assertion(nart);
        if (function_terms.NIL != tou_ass) {
            return assertions_high.gaf_arg2(tou_ass);
        }
        return (SubLObject)function_terms.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 1344L)
    public static SubLObject term_of_unit_assertion_p(final SubLObject v_object) {
        return assertion_utilities.gaf_assertion_with_pred_p(v_object, function_terms.$const3$termOfUnit);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 1451L)
    public static SubLObject tou_assertionP(final SubLObject assertion) {
        return term_of_unit_assertion_p(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 1546L)
    public static SubLObject term_functional_complexity(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)function_terms.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)function_terms.$sym5$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(function_terms.$const6$EverythingPSC, thread);
            ans = term_functional_complexity_internal(v_object);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 1862L)
    public static SubLObject within_term_functional_complexity_cutoffP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (function_terms.NIL == control_vars.$term_functional_complexity_cutoff$.getDynamicValue(thread)) {
            return (SubLObject)function_terms.T;
        }
        return Numbers.numLE(term_functional_complexity(v_term), control_vars.$term_functional_complexity_cutoff$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 2172L)
    public static SubLObject term_functional_complexity_internal(final SubLObject v_object) {
        final SubLObject method_function = Structures.method_func(v_object, function_terms.$term_functional_complexity_internal_method_table$.getGlobalValue());
        if (function_terms.NIL != method_function) {
            return Functions.funcall(method_function, v_object);
        }
        return (SubLObject)function_terms.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 2263L)
    public static SubLObject term_functional_complexity_internal_constant_method(final SubLObject v_object) {
        return (SubLObject)function_terms.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 2364L)
    public static SubLObject term_functional_complexity_internal_nart_method(final SubLObject v_object) {
        return term_functional_complexity_nart(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 2482L)
    public static SubLObject term_functional_complexity_nart(final SubLObject nart) {
        return term_functional_complexity(narts_high.nart_hl_formula(nart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 2599L)
    public static SubLObject term_functional_complexity_internal_cons_method(final SubLObject v_object) {
        SubLObject function = (SubLObject)function_terms.NIL;
        SubLObject args = (SubLObject)function_terms.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, (SubLObject)function_terms.$list10);
        function = v_object.first();
        final SubLObject current = args = v_object.rest();
        if (function_terms.NIL != forts.fort_p(function) && function_terms.NIL == fort_types_interface.non_predicate_functionP(function)) {
            return (SubLObject)function_terms.ZERO_INTEGER;
        }
        SubLObject arg_max_complexity = term_functional_complexity_internal(function);
        SubLObject rest;
        SubLObject arg;
        SubLObject arg_complexity;
        for (rest = (SubLObject)function_terms.NIL, rest = args; !rest.isAtom(); rest = rest.rest()) {
            arg = rest.first();
            arg_complexity = term_functional_complexity_internal(arg);
            arg_max_complexity = Numbers.max(arg_max_complexity, arg_complexity);
        }
        return Numbers.add(arg_max_complexity, (SubLObject)function_terms.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 3250L)
    public static SubLObject term_relational_complexity(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)function_terms.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)function_terms.$sym5$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(function_terms.$const6$EverythingPSC, thread);
            ans = term_relational_complexity_internal(v_object);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 3564L)
    public static SubLObject within_term_relational_complexity_cutoffP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (function_terms.NIL == control_vars.$term_relational_complexity_cutoff$.getDynamicValue(thread)) {
            return (SubLObject)function_terms.T;
        }
        return Numbers.numLE(term_relational_complexity(v_term), control_vars.$term_relational_complexity_cutoff$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 3789L)
    public static SubLObject relational_complexity_L(final SubLObject obj1, final SubLObject obj2) {
        if (obj2.isAtom()) {
            return (SubLObject)function_terms.NIL;
        }
        if (function_terms.NIL == obj1) {
            return (SubLObject)function_terms.NIL;
        }
        if (obj1.isAtom()) {
            return (SubLObject)function_terms.T;
        }
        final SubLObject depth1 = term_relational_complexity(obj1);
        final SubLObject depth2 = term_relational_complexity(obj2);
        if (depth1.numL(depth2)) {
            return (SubLObject)function_terms.T;
        }
        return (SubLObject)function_terms.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 4213L)
    public static SubLObject term_relational_complexity_internal(final SubLObject v_object) {
        final SubLObject method_function = Structures.method_func(v_object, function_terms.$term_relational_complexity_internal_method_table$.getGlobalValue());
        if (function_terms.NIL != method_function) {
            return Functions.funcall(method_function, v_object);
        }
        return (SubLObject)function_terms.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 4304L)
    public static SubLObject term_relational_complexity_internal_constant_method(final SubLObject v_object) {
        return (SubLObject)function_terms.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 4405L)
    public static SubLObject term_relational_complexity_internal_nart_method(final SubLObject v_object) {
        return term_relational_complexity_nart(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 4523L)
    public static SubLObject term_relational_complexity_nart(final SubLObject nart) {
        return term_relational_complexity(narts_high.nart_hl_formula(nart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 4640L)
    public static SubLObject term_relational_complexity_internal_cons_method(final SubLObject v_object) {
        SubLObject relation = (SubLObject)function_terms.NIL;
        SubLObject args = (SubLObject)function_terms.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, (SubLObject)function_terms.$list14);
        relation = v_object.first();
        final SubLObject current = args = v_object.rest();
        SubLObject arg_max_complexity = term_relational_complexity_internal(relation);
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)function_terms.NIL;
        arg = cdolist_list_var.first();
        while (function_terms.NIL != cdolist_list_var) {
            final SubLObject arg_complexity = term_relational_complexity_internal(arg);
            arg_max_complexity = Numbers.max(arg_max_complexity, arg_complexity);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return Numbers.add(arg_max_complexity, (SubLObject)function_terms.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 5042L)
    public static SubLObject nat_formula_p(final SubLObject v_object) {
        return el_utilities.possibly_naut_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 5267L)
    public static SubLObject narts_of_function(final SubLObject function) {
        assert function_terms.NIL != forts.fort_p(function) : function;
        SubLObject result = (SubLObject)function_terms.NIL;
        if (function_terms.NIL != kb_mapping_macros.do_function_extent_index_key_validator(function)) {
            final SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec(function);
            SubLObject final_index_iterator = (SubLObject)function_terms.NIL;
            try {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)function_terms.$kw4$GAF, (SubLObject)function_terms.NIL, (SubLObject)function_terms.NIL);
                SubLObject done_var = (SubLObject)function_terms.NIL;
                final SubLObject token_var = (SubLObject)function_terms.NIL;
                while (function_terms.NIL == done_var) {
                    final SubLObject tou = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(tou));
                    if (function_terms.NIL != valid) {
                        final SubLObject nart = assertions_high.gaf_arg1(tou);
                        result = (SubLObject)ConsesLow.cons(nart, result);
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(function_terms.NIL == valid);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)function_terms.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (function_terms.NIL != final_index_iterator) {
                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 5532L)
    public static SubLObject narts_of_term(final SubLObject function, final SubLObject v_term, SubLObject arg) {
        if (arg == function_terms.UNPROVIDED) {
            arg = (SubLObject)function_terms.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert function_terms.NIL != forts.fort_p(function) : function;
        assert function_terms.NIL != forts.fort_p(v_term) : v_term;
        assert function_terms.NIL != Types.integerp(arg) : arg;
        SubLObject result = (SubLObject)function_terms.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)function_terms.$sym2$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt_vars.$tou_mt$.getGlobalValue(), thread);
            if (function_terms.NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, arg, function)) {
                final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, arg, function);
                SubLObject done_var = (SubLObject)function_terms.NIL;
                final SubLObject token_var = (SubLObject)function_terms.NIL;
                while (function_terms.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (function_terms.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)function_terms.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)function_terms.$kw4$GAF, (SubLObject)function_terms.NIL, (SubLObject)function_terms.NIL);
                            SubLObject done_var_$9 = (SubLObject)function_terms.NIL;
                            final SubLObject token_var_$10 = (SubLObject)function_terms.NIL;
                            while (function_terms.NIL == done_var_$9) {
                                final SubLObject tou_ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                final SubLObject valid_$11 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$10.eql(tou_ass));
                                if (function_terms.NIL != valid_$11) {
                                    final SubLObject nart = assertions_high.gaf_arg1(tou_ass);
                                    result = (SubLObject)ConsesLow.cons(nart, result);
                                }
                                done_var_$9 = (SubLObject)SubLObjectFactory.makeBoolean(function_terms.NIL == valid_$11);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)function_terms.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (function_terms.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(function_terms.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 5966L)
    public static SubLObject unnatify_terms(final SubLObject terms) {
        SubLObject result = (SubLObject)function_terms.NIL;
        SubLObject v_const = (SubLObject)function_terms.NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)function_terms.NIL;
        v_term = cdolist_list_var.first();
        while (function_terms.NIL != cdolist_list_var) {
            if (function_terms.NIL != term.nautP(v_term, (SubLObject)function_terms.UNPROVIDED)) {
                v_const = narts_high.find_nart(v_term);
                if (function_terms.NIL != v_const) {
                    result = (SubLObject)ConsesLow.cons(v_const, result);
                }
            }
            else {
                result = (SubLObject)ConsesLow.cons(v_term, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 6285L)
    public static SubLObject naut_to_nart(final SubLObject obj) {
        if (function_terms.NIL != term.closed_nautP(obj, (SubLObject)function_terms.UNPROVIDED)) {
            final SubLObject nart = narts_high.find_nart(obj);
            return (function_terms.NIL != nart) ? nart : obj;
        }
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/function-terms.lisp", position = 6523L)
    public static SubLObject nart_to_naut(final SubLObject obj) {
        if (function_terms.NIL != nart_handles.nart_p(obj)) {
            return narts_high.nart_el_formula(obj);
        }
        return obj;
    }
    
    public static SubLObject declare_function_terms_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "term_of_unit", "TERM-OF-UNIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "term_of_unit_assertion", "TERM-OF-UNIT-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "term_of_unit_assertions", "TERM-OF-UNIT-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "nart_hl_formula_via_term_of_unit_assertion", "NART-HL-FORMULA-VIA-TERM-OF-UNIT-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "term_of_unit_assertion_p", "TERM-OF-UNIT-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "tou_assertionP", "TOU-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "term_functional_complexity", "TERM-FUNCTIONAL-COMPLEXITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "within_term_functional_complexity_cutoffP", "WITHIN-TERM-FUNCTIONAL-COMPLEXITY-CUTOFF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "term_functional_complexity_internal", "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "term_functional_complexity_internal_constant_method", "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-CONSTANT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "term_functional_complexity_internal_nart_method", "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-NART-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "term_functional_complexity_nart", "TERM-FUNCTIONAL-COMPLEXITY-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "term_functional_complexity_internal_cons_method", "TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-CONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "term_relational_complexity", "TERM-RELATIONAL-COMPLEXITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "within_term_relational_complexity_cutoffP", "WITHIN-TERM-RELATIONAL-COMPLEXITY-CUTOFF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "relational_complexity_L", "RELATIONAL-COMPLEXITY-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "term_relational_complexity_internal", "TERM-RELATIONAL-COMPLEXITY-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "term_relational_complexity_internal_constant_method", "TERM-RELATIONAL-COMPLEXITY-INTERNAL-CONSTANT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "term_relational_complexity_internal_nart_method", "TERM-RELATIONAL-COMPLEXITY-INTERNAL-NART-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "term_relational_complexity_nart", "TERM-RELATIONAL-COMPLEXITY-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "term_relational_complexity_internal_cons_method", "TERM-RELATIONAL-COMPLEXITY-INTERNAL-CONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "nat_formula_p", "NAT-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "narts_of_function", "NARTS-OF-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "narts_of_term", "NARTS-OF-TERM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "unnatify_terms", "UNNATIFY-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "naut_to_nart", "NAUT-TO-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.function_terms", "nart_to_naut", "NART-TO-NAUT", 1, 0, false);
        return (SubLObject)function_terms.NIL;
    }
    
    public static SubLObject init_function_terms_file() {
        function_terms.$term_functional_complexity_internal_method_table$ = SubLFiles.deflexical("*TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-METHOD-TABLE*", Vectors.make_vector((SubLObject)function_terms.$int7$256, (SubLObject)function_terms.NIL));
        function_terms.$term_relational_complexity_internal_method_table$ = SubLFiles.deflexical("*TERM-RELATIONAL-COMPLEXITY-INTERNAL-METHOD-TABLE*", Vectors.make_vector((SubLObject)function_terms.$int7$256, (SubLObject)function_terms.NIL));
        return (SubLObject)function_terms.NIL;
    }
    
    public static SubLObject setup_function_terms_file() {
        access_macros.define_obsolete_register((SubLObject)function_terms.$sym0$TERM_OF_UNIT, (SubLObject)function_terms.NIL);
        Structures.register_method(function_terms.$term_functional_complexity_internal_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function((SubLObject)function_terms.$sym8$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD));
        Structures.register_method(function_terms.$term_functional_complexity_internal_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function((SubLObject)function_terms.$sym9$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_NART_METHOD));
        Structures.register_method(function_terms.$term_functional_complexity_internal_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function((SubLObject)function_terms.$sym11$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONS_METHOD));
        Structures.register_method(function_terms.$term_relational_complexity_internal_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function((SubLObject)function_terms.$sym12$TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD));
        Structures.register_method(function_terms.$term_relational_complexity_internal_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function((SubLObject)function_terms.$sym13$TERM_RELATIONAL_COMPLEXITY_INTERNAL_NART_METHOD));
        Structures.register_method(function_terms.$term_relational_complexity_internal_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function((SubLObject)function_terms.$sym15$TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONS_METHOD));
        return (SubLObject)function_terms.NIL;
    }
    
    public void declareFunctions() {
        declare_function_terms_file();
    }
    
    public void initializeVariables() {
        init_function_terms_file();
    }
    
    public void runTopLevelForms() {
        setup_function_terms_file();
    }
    
    static {
        me = (SubLFile)new function_terms();
        function_terms.$term_functional_complexity_internal_method_table$ = null;
        function_terms.$term_relational_complexity_internal_method_table$ = null;
        $sym0$TERM_OF_UNIT = SubLObjectFactory.makeSymbol("TERM-OF-UNIT");
        $sym1$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $sym2$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $const3$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $kw4$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym5$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const6$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $int7$256 = SubLObjectFactory.makeInteger(256);
        $sym8$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD = SubLObjectFactory.makeSymbol("TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-CONSTANT-METHOD");
        $sym9$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_NART_METHOD = SubLObjectFactory.makeSymbol("TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-NART-METHOD");
        $list10 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym11$TERM_FUNCTIONAL_COMPLEXITY_INTERNAL_CONS_METHOD = SubLObjectFactory.makeSymbol("TERM-FUNCTIONAL-COMPLEXITY-INTERNAL-CONS-METHOD");
        $sym12$TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONSTANT_METHOD = SubLObjectFactory.makeSymbol("TERM-RELATIONAL-COMPLEXITY-INTERNAL-CONSTANT-METHOD");
        $sym13$TERM_RELATIONAL_COMPLEXITY_INTERNAL_NART_METHOD = SubLObjectFactory.makeSymbol("TERM-RELATIONAL-COMPLEXITY-INTERNAL-NART-METHOD");
        $list14 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RELATION"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym15$TERM_RELATIONAL_COMPLEXITY_INTERNAL_CONS_METHOD = SubLObjectFactory.makeSymbol("TERM-RELATIONAL-COMPLEXITY-INTERNAL-CONS-METHOD");
        $sym16$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym17$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
    }
}

/*

	Total time: 223 ms
	
*/