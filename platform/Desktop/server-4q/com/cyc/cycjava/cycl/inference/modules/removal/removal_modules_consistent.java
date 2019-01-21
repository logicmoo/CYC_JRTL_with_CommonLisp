package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.conflicts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_consistent extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_consistent";
    public static final String myFingerPrint = "62f538f66c6010f9351e7722e22ebf103ecdd3f36c1440fc3b3206ba8eb31281";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-consistent.lisp", position = 1846L)
    private static SubLSymbol $default_removal_consistent_check_cost$;
    private static final SubLObject $const0$consistent;
    private static final SubLSymbol $kw1$BOTH;
    private static final SubLSymbol $kw2$CONSISTENT;
    private static final SubLSymbol $kw3$REMOVAL_CONSISTENT_POS;
    private static final SubLList $list4;
    private static final SubLFloat $float5$1_5;
    private static final SubLObject $const6$thereExists;
    private static final SubLSymbol $kw7$QUERY;
    private static final SubLSymbol $kw8$REMOVAL_CONSISTENT_NEG;
    private static final SubLList $list9;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-consistent.lisp", position = 826L)
    public static SubLObject removal_consistent_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_consistent.UNPROVIDED) {
            sense = (SubLObject)removal_modules_consistent.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current_mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        final SubLObject formula = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_consistent.UNPROVIDED);
        final SubLObject consistent = inference_consistent_check(formula, current_mt);
        if (removal_modules_consistent.NIL != consistent) {
            final SubLObject hl_support = arguments.make_hl_support((SubLObject)removal_modules_consistent.$kw2$CONSISTENT, asent, (SubLObject)removal_modules_consistent.UNPROVIDED, (SubLObject)removal_modules_consistent.UNPROVIDED);
            backward.removal_add_node(hl_support, (SubLObject)removal_modules_consistent.UNPROVIDED, (SubLObject)removal_modules_consistent.UNPROVIDED);
        }
        return (SubLObject)removal_modules_consistent.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-consistent.lisp", position = 1934L)
    public static SubLObject inference_consistent_check(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hypothetical_mt = (SubLObject)removal_modules_consistent.NIL;
        SubLObject hypothesized_bindings = (SubLObject)removal_modules_consistent.NIL;
        SubLObject done = (SubLObject)removal_modules_consistent.NIL;
        SubLObject v_answer = (SubLObject)removal_modules_consistent.NIL;
        try {
            if (removal_modules_consistent.NIL == done) {
                final SubLObject _prev_bind_0 = control_vars.$negation_by_failure$.currentBinding(thread);
                try {
                    control_vars.$negation_by_failure$.bind((SubLObject)removal_modules_consistent.NIL, thread);
                    final SubLObject positive_result = ask_utilities.inference_recursive_query(formula, mt, (SubLObject)removal_modules_consistent.UNPROVIDED);
                    if (removal_modules_consistent.NIL != list_utilities.sublisp_boolean(positive_result)) {
                        v_answer = (SubLObject)removal_modules_consistent.T;
                        done = (SubLObject)removal_modules_consistent.T;
                    }
                }
                finally {
                    control_vars.$negation_by_failure$.rebind(_prev_bind_0, thread);
                }
            }
            if (removal_modules_consistent.NIL == done && removal_modules_consistent.NIL == list_utilities.tree_find(removal_modules_consistent.$const6$thereExists, formula, (SubLObject)removal_modules_consistent.UNPROVIDED, (SubLObject)removal_modules_consistent.UNPROVIDED)) {
                final SubLObject negated_formula = cycl_utilities.negate(formula);
                final SubLObject _prev_bind_2 = control_vars.$negation_by_failure$.currentBinding(thread);
                try {
                    control_vars.$negation_by_failure$.bind((SubLObject)removal_modules_consistent.NIL, thread);
                    final SubLObject negated_result = ask_utilities.inference_recursive_query(negated_formula, mt, (SubLObject)removal_modules_consistent.UNPROVIDED);
                    if (removal_modules_consistent.NIL != list_utilities.sublisp_boolean(negated_result)) {
                        inference_note_inconsistent_supports(formula, mt, conses_high.second(negated_result.first()));
                        v_answer = (SubLObject)removal_modules_consistent.NIL;
                        done = (SubLObject)removal_modules_consistent.T;
                    }
                }
                finally {
                    control_vars.$negation_by_failure$.rebind(_prev_bind_2, thread);
                }
            }
            if (removal_modules_consistent.NIL == done) {
                hypothetical_mt = prove.hypothesize_spec_mt(mt, (SubLObject)removal_modules_consistent.UNPROVIDED);
                hypothesized_bindings = prove.fi_hypothesize_int(formula, hypothetical_mt, (SubLObject)removal_modules_consistent.UNPROVIDED, (SubLObject)removal_modules_consistent.UNPROVIDED);
                v_answer = list_utilities.sublisp_boolean(hypothesized_bindings);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_consistent.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (removal_modules_consistent.NIL != hypothesized_bindings && removal_modules_consistent.NIL == bindings.unification_success_token_p(hypothesized_bindings)) {
                    SubLObject cdolist_list_var = hypothesized_bindings;
                    SubLObject binding = (SubLObject)removal_modules_consistent.NIL;
                    binding = cdolist_list_var.first();
                    while (removal_modules_consistent.NIL != cdolist_list_var) {
                        final SubLObject hypothetical_term = bindings.variable_binding_value(binding);
                        if (removal_modules_consistent.NIL != forts.fort_p(hypothetical_term)) {
                            fi.fi_kill_int(hypothetical_term);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        binding = cdolist_list_var.first();
                    }
                }
                if (removal_modules_consistent.NIL != hypothetical_mt && removal_modules_consistent.NIL != forts.fort_p(hlmt.hlmt_monad_mt(hypothetical_mt))) {
                    fi.fi_kill_int(hlmt.hlmt_monad_mt(hypothetical_mt));
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-consistent.lisp", position = 3683L)
    public static SubLObject inference_note_inconsistent_supports(final SubLObject formula, final SubLObject mt, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_consistent.NIL != control_vars.$record_inconsistent_support_sets$.getDynamicValue(thread)) {
            final SubLObject support = arguments.make_hl_support((SubLObject)removal_modules_consistent.$kw7$QUERY, formula, mt, (SubLObject)removal_modules_consistent.UNPROVIDED);
            conflicts.add_inconsistent_support_set((SubLObject)ConsesLow.cons(support, supports));
        }
        return (SubLObject)removal_modules_consistent.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-consistent.lisp", position = 3949L)
    public static SubLObject removal_consistent_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_consistent.UNPROVIDED) {
            sense = (SubLObject)removal_modules_consistent.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current_mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        final SubLObject formula = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_consistent.UNPROVIDED);
        final SubLObject inconsistent = inference_inconsistent_check(formula, current_mt);
        if (removal_modules_consistent.NIL != inconsistent) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_consistent.$kw2$CONSISTENT, cycl_utilities.negate(asent), (SubLObject)removal_modules_consistent.UNPROVIDED, (SubLObject)removal_modules_consistent.UNPROVIDED), (SubLObject)removal_modules_consistent.UNPROVIDED, (SubLObject)removal_modules_consistent.UNPROVIDED);
        }
        return (SubLObject)removal_modules_consistent.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-consistent.lisp", position = 4947L)
    public static SubLObject inference_inconsistent_check(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hypothetical_mt = (SubLObject)removal_modules_consistent.NIL;
        SubLObject hypothesized_bindings = (SubLObject)removal_modules_consistent.NIL;
        SubLObject done = (SubLObject)removal_modules_consistent.NIL;
        SubLObject v_answer = (SubLObject)removal_modules_consistent.NIL;
        try {
            if (removal_modules_consistent.NIL == done) {
                final SubLObject _prev_bind_0 = control_vars.$negation_by_failure$.currentBinding(thread);
                final SubLObject _prev_bind_2 = control_vars.$cache_inference_results$.currentBinding(thread);
                try {
                    control_vars.$negation_by_failure$.bind((SubLObject)removal_modules_consistent.NIL, thread);
                    control_vars.$cache_inference_results$.bind((SubLObject)removal_modules_consistent.NIL, thread);
                    final SubLObject positive_result = ask_utilities.inference_recursive_query(formula, mt, (SubLObject)removal_modules_consistent.UNPROVIDED);
                    if (removal_modules_consistent.NIL != list_utilities.sublisp_boolean(positive_result)) {
                        v_answer = (SubLObject)removal_modules_consistent.NIL;
                        done = (SubLObject)removal_modules_consistent.T;
                    }
                }
                finally {
                    control_vars.$cache_inference_results$.rebind(_prev_bind_2, thread);
                    control_vars.$negation_by_failure$.rebind(_prev_bind_0, thread);
                }
            }
            if (removal_modules_consistent.NIL == done && removal_modules_consistent.NIL == list_utilities.tree_find(removal_modules_consistent.$const6$thereExists, formula, (SubLObject)removal_modules_consistent.UNPROVIDED, (SubLObject)removal_modules_consistent.UNPROVIDED)) {
                final SubLObject negated_formula = cycl_utilities.negate(formula);
                final SubLObject _prev_bind_3 = control_vars.$negation_by_failure$.currentBinding(thread);
                final SubLObject _prev_bind_4 = control_vars.$cache_inference_results$.currentBinding(thread);
                try {
                    control_vars.$negation_by_failure$.bind((SubLObject)removal_modules_consistent.NIL, thread);
                    control_vars.$cache_inference_results$.bind((SubLObject)removal_modules_consistent.NIL, thread);
                    final SubLObject negated_result = ask_utilities.inference_recursive_query(negated_formula, mt, (SubLObject)removal_modules_consistent.UNPROVIDED);
                    if (removal_modules_consistent.NIL != list_utilities.sublisp_boolean(negated_result)) {
                        inference_note_inconsistent_supports(formula, mt, conses_high.second(negated_result.first()));
                        v_answer = (SubLObject)removal_modules_consistent.T;
                        done = (SubLObject)removal_modules_consistent.T;
                    }
                }
                finally {
                    control_vars.$cache_inference_results$.rebind(_prev_bind_4, thread);
                    control_vars.$negation_by_failure$.rebind(_prev_bind_3, thread);
                }
            }
            if (removal_modules_consistent.NIL == done) {
                hypothetical_mt = prove.hypothesize_spec_mt(mt, (SubLObject)removal_modules_consistent.UNPROVIDED);
                hypothesized_bindings = prove.fi_hypothesize_int(formula, hypothetical_mt, (SubLObject)removal_modules_consistent.UNPROVIDED, (SubLObject)removal_modules_consistent.UNPROVIDED);
                v_answer = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_consistent.NIL == list_utilities.sublisp_boolean(hypothesized_bindings));
            }
        }
        finally {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_consistent.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (removal_modules_consistent.NIL != hypothesized_bindings && removal_modules_consistent.NIL == bindings.unification_success_token_p(hypothesized_bindings)) {
                    SubLObject cdolist_list_var = hypothesized_bindings;
                    SubLObject binding = (SubLObject)removal_modules_consistent.NIL;
                    binding = cdolist_list_var.first();
                    while (removal_modules_consistent.NIL != cdolist_list_var) {
                        final SubLObject hypothetical_term = bindings.variable_binding_value(binding);
                        if (removal_modules_consistent.NIL != forts.fort_p(hypothetical_term)) {
                            fi.fi_kill_int(hypothetical_term);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        binding = cdolist_list_var.first();
                    }
                }
                if (removal_modules_consistent.NIL != hypothetical_mt && removal_modules_consistent.NIL != forts.fort_p(hlmt.hlmt_monad_mt(hypothetical_mt))) {
                    fi.fi_kill_int(hlmt.hlmt_monad_mt(hypothetical_mt));
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return v_answer;
    }
    
    public static SubLObject declare_removal_modules_consistent_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_consistent", "removal_consistent_pos_expand", "REMOVAL-CONSISTENT-POS-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_consistent", "inference_consistent_check", "INFERENCE-CONSISTENT-CHECK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_consistent", "inference_note_inconsistent_supports", "INFERENCE-NOTE-INCONSISTENT-SUPPORTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_consistent", "removal_consistent_neg_expand", "REMOVAL-CONSISTENT-NEG-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_consistent", "inference_inconsistent_check", "INFERENCE-INCONSISTENT-CHECK", 2, 0, false);
        return (SubLObject)removal_modules_consistent.NIL;
    }
    
    public static SubLObject init_removal_modules_consistent_file() {
        removal_modules_consistent.$default_removal_consistent_check_cost$ = SubLFiles.deflexical("*DEFAULT-REMOVAL-CONSISTENT-CHECK-COST*", (SubLObject)removal_modules_consistent.$float5$1_5);
        return (SubLObject)removal_modules_consistent.NIL;
    }
    
    public static SubLObject setup_removal_modules_consistent_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_consistent.$const0$consistent);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_consistent.$kw1$BOTH, removal_modules_consistent.$const0$consistent);
        inference_modules.inference_removal_module((SubLObject)removal_modules_consistent.$kw3$REMOVAL_CONSISTENT_POS, (SubLObject)removal_modules_consistent.$list4);
        inference_modules.inference_removal_module((SubLObject)removal_modules_consistent.$kw8$REMOVAL_CONSISTENT_NEG, (SubLObject)removal_modules_consistent.$list9);
        return (SubLObject)removal_modules_consistent.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_consistent_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_consistent_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_consistent_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_consistent();
        removal_modules_consistent.$default_removal_consistent_check_cost$ = null;
        $const0$consistent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("consistent"));
        $kw1$BOTH = SubLObjectFactory.makeKeyword("BOTH");
        $kw2$CONSISTENT = SubLObjectFactory.makeKeyword("CONSISTENT");
        $kw3$REMOVAL_CONSISTENT_POS = SubLObjectFactory.makeKeyword("REMOVAL-CONSISTENT-POS");
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("consistent")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("consistent")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORMULA-P")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REMOVAL-CONSISTENT-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-CONSISTENT-POS-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$consistent <fully-bound>)\nby hypothesizing the formula and checking for lack of a contradiction"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$consistent (#$languagesSpokenHere #$Texas-State #$SpanishLanguage))") });
        $float5$1_5 = (SubLFloat)SubLObjectFactory.makeDouble(1.5);
        $const6$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $kw7$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw8$REMOVAL_CONSISTENT_NEG = SubLObjectFactory.makeKeyword("REMOVAL-CONSISTENT-NEG");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("consistent")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("consistent")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORMULA-P")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-REMOVAL-CONSISTENT-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-CONSISTENT-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$consistent <fully-bound>))\nby hypothesizing the formula and checking for a contradiction"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$consistent (#$bordersOn #$Canada #$Canada)))") });
    }
}

/*

	Total time: 79 ms
	
*/