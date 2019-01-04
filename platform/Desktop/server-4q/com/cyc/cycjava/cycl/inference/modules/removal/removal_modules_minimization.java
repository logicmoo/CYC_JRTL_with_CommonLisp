package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.inference_completeness_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.harness.inference_trivial;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_minimization extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_minimization";
    public static final String myFingerPrint = "4293429246dc9867d2d3d53382ff592b8783e3e55eb5227f53673eda04121a30";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 2689L)
    private static SubLSymbol $default_minimize_extent_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 4104L)
    private static SubLSymbol $default_completely_decidable_neg_cost$;
    private static final SubLObject $const0$unknownSentence;
    private static final SubLSymbol $kw1$MINIMIZE;
    private static final SubLSymbol $kw2$TRUE_DEF;
    private static final SubLSymbol $kw3$COMPLETENESS_MINIMIZATION_ALLOWED_;
    private static final SubLSymbol $kw4$UNKNOWN;
    private static final SubLFloat $float5$1_5;
    private static final SubLObject $const6$minimizeExtent;
    private static final SubLSymbol $kw7$GAF;
    private static final SubLSymbol $kw8$TRUE;
    private static final SubLSymbol $kw9$REMOVAL_MINIMIZE_EXTENT;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$REMOVAL_COMPLETELY_DECIDABLE_NEG;
    private static final SubLList $list12;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 926L)
    public static SubLObject make_minimization_support(final SubLObject minimized_sentence, final SubLObject mt) {
        final SubLObject sentence = el_utilities.make_unary_formula(removal_modules_minimization.$const0$unknownSentence, minimized_sentence);
        return arguments.make_hl_support((SubLObject)removal_modules_minimization.$kw1$MINIMIZE, sentence, mt, (SubLObject)removal_modules_minimization.$kw2$TRUE_DEF);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 1196L)
    public static SubLObject removal_completeness_minimization_allowedP() {
        final SubLObject store = inference_worker.currently_active_problem_store();
        if (removal_modules_minimization.NIL != store) {
            return inference_datastructures_problem_store.problem_store_completeness_minimization_allowedP(store);
        }
        return inference_trivial.current_query_property_lookup((SubLObject)removal_modules_minimization.$kw3$COMPLETENESS_MINIMIZATION_ALLOWED_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 1471L)
    public static SubLObject removal_unprovable_negation(final SubLObject asent, final SubLObject mt, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_minimization.NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject _prev_bind_0 = control_vars.$negation_by_failure$.currentBinding(thread);
            final SubLObject _prev_bind_2 = control_vars.$complete_extent_minimization$.currentBinding(thread);
            final SubLObject _prev_bind_3 = inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.currentBinding(thread);
            try {
                control_vars.$negation_by_failure$.bind((SubLObject)removal_modules_minimization.NIL, thread);
                control_vars.$complete_extent_minimization$.bind((SubLObject)removal_modules_minimization.NIL, thread);
                inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.bind((SubLObject)removal_modules_minimization.NIL, thread);
                if (removal_modules_minimization.$kw4$UNKNOWN == ask_utilities.inference_literal_truth(asent, mt)) {
                    final SubLObject hl_support = make_minimization_support(asent, mt);
                    final SubLObject more_supports = (SubLObject)ConsesLow.list(assertion);
                    backward.removal_add_node(hl_support, (SubLObject)removal_modules_minimization.NIL, more_supports);
                }
            }
            finally {
                inference_strategist.$recursive_queries_in_currently_active_problem_storeP$.rebind(_prev_bind_3, thread);
                control_vars.$complete_extent_minimization$.rebind(_prev_bind_2, thread);
                control_vars.$negation_by_failure$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)removal_modules_minimization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 2307L)
    public static SubLObject removal_minimize_extent_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_minimization.UNPROVIDED) {
            sense = (SubLObject)removal_modules_minimization.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_minimization.NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && removal_modules_minimization.NIL != inference_completeness_utilities.inference_minimize_extentP(cycl_utilities.atomic_sentence_predicate(asent)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 2756L)
    public static SubLObject removal_minimize_extent_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_minimization.UNPROVIDED) {
            sense = (SubLObject)removal_modules_minimization.NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject pred_var = removal_modules_minimization.$const6$minimizeExtent;
        if (removal_modules_minimization.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, (SubLObject)removal_modules_minimization.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, (SubLObject)removal_modules_minimization.ONE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)removal_modules_minimization.NIL;
            final SubLObject token_var = (SubLObject)removal_modules_minimization.NIL;
            while (removal_modules_minimization.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (removal_modules_minimization.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)removal_modules_minimization.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_minimization.$kw7$GAF, (SubLObject)removal_modules_minimization.$kw8$TRUE, (SubLObject)removal_modules_minimization.NIL);
                        SubLObject done_var_$1 = (SubLObject)removal_modules_minimization.NIL;
                        final SubLObject token_var_$2 = (SubLObject)removal_modules_minimization.NIL;
                        while (removal_modules_minimization.NIL == done_var_$1) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                            final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(assertion));
                            if (removal_modules_minimization.NIL != valid_$3) {
                                removal_unprovable_negation(asent, mt_relevance_macros.inference_relevant_mt(), assertion);
                            }
                            done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_minimization.NIL == valid_$3);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)removal_modules_minimization.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (removal_modules_minimization.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_minimization.NIL == valid);
            }
        }
        return (SubLObject)removal_modules_minimization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 3652L)
    public static SubLObject removal_completely_decidable_neg_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_minimization.UNPROVIDED) {
            sense = (SubLObject)removal_modules_minimization.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_minimization.NIL != removal_completeness_minimization_allowedP() && removal_modules_minimization.NIL != inference_completeness_utilities.inference_completely_decidable_asentP(asent, mt_relevance_macros.inference_relevant_mt()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-minimization.lisp", position = 4180L)
    public static SubLObject removal_completely_decidable_neg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_minimization.UNPROVIDED) {
            sense = (SubLObject)removal_modules_minimization.NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject complete_extent_assertions = cdolist_list_var = inference_completeness_utilities.inference_completely_decidable_asent_gafs(asent, mt_relevance_macros.inference_relevant_mt());
        SubLObject assertion = (SubLObject)removal_modules_minimization.NIL;
        assertion = cdolist_list_var.first();
        while (removal_modules_minimization.NIL != cdolist_list_var) {
            removal_unprovable_negation(asent, mt_relevance_macros.inference_relevant_mt(), assertion);
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_minimization.NIL;
    }
    
    public static SubLObject declare_removal_modules_minimization_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_minimization", "make_minimization_support", "MAKE-MINIMIZATION-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_minimization", "removal_completeness_minimization_allowedP", "REMOVAL-COMPLETENESS-MINIMIZATION-ALLOWED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_minimization", "removal_unprovable_negation", "REMOVAL-UNPROVABLE-NEGATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_minimization", "removal_minimize_extent_required", "REMOVAL-MINIMIZE-EXTENT-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_minimization", "removal_minimize_extent_expand", "REMOVAL-MINIMIZE-EXTENT-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_minimization", "removal_completely_decidable_neg_required", "REMOVAL-COMPLETELY-DECIDABLE-NEG-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_minimization", "removal_completely_decidable_neg_expand", "REMOVAL-COMPLETELY-DECIDABLE-NEG-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_minimization.NIL;
    }
    
    public static SubLObject init_removal_modules_minimization_file() {
        removal_modules_minimization.$default_minimize_extent_cost$ = SubLFiles.defparameter("*DEFAULT-MINIMIZE-EXTENT-COST*", (SubLObject)removal_modules_minimization.$float5$1_5);
        removal_modules_minimization.$default_completely_decidable_neg_cost$ = SubLFiles.defparameter("*DEFAULT-COMPLETELY-DECIDABLE-NEG-COST*", (SubLObject)removal_modules_minimization.$float5$1_5);
        return (SubLObject)removal_modules_minimization.NIL;
    }
    
    public static SubLObject setup_removal_modules_minimization_file() {
        inference_modules.inference_removal_module((SubLObject)removal_modules_minimization.$kw9$REMOVAL_MINIMIZE_EXTENT, (SubLObject)removal_modules_minimization.$list10);
        inference_modules.inference_removal_module((SubLObject)removal_modules_minimization.$kw11$REMOVAL_COMPLETELY_DECIDABLE_NEG, (SubLObject)removal_modules_minimization.$list12);
        return (SubLObject)removal_modules_minimization.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_minimization_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_minimization_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_minimization_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_minimization();
        removal_modules_minimization.$default_minimize_extent_cost$ = null;
        removal_modules_minimization.$default_completely_decidable_neg_cost$ = null;
        $const0$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $kw1$MINIMIZE = SubLObjectFactory.makeKeyword("MINIMIZE");
        $kw2$TRUE_DEF = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $kw3$COMPLETENESS_MINIMIZATION_ALLOWED_ = SubLObjectFactory.makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
        $kw4$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $float5$1_5 = (SubLFloat)SubLObjectFactory.makeDouble(1.5);
        $const6$minimizeExtent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("minimizeExtent"));
        $kw7$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw8$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw9$REMOVAL_MINIMIZE_EXTENT = SubLObjectFactory.makeKeyword("REMOVAL-MINIMIZE-EXTENT");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_minimization.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-MINIMIZE-EXTENT-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MINIMIZE-EXTENT-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MINIMIZE-EXTENT-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> . <fully bound>))\n    from (#$minimizeExtent <predicate>)\n    when negation-by-failure is enabled"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$citizens #$AbrahamLincoln #$France))\n    from (#$minimizeExtent #$citizens)") });
        $kw11$REMOVAL_COMPLETELY_DECIDABLE_NEG = SubLObjectFactory.makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("ARITY"), removal_modules_minimization.NIL, SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-COMPLETELY-DECIDABLE-NEG-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-COMPLETELY-DECIDABLE-NEG-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-COMPLETELY-DECIDABLE-NEG-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (<predicate> . <fully bound>))\n    from (#$completeExtentDecidable <predicate>)\n    or   (#$completeExtentDecidableForValueInArg <predicate> <fort> <argnum>"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$bordersOn #$Canada #$France))\n    from (#$completeExtentDecidable #$bordersOn)") });
    }
}

/*

	Total time: 46 ms
	
*/