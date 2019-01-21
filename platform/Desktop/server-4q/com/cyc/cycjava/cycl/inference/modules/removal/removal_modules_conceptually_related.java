package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.kb_gp_mapping;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_conceptually_related extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related";
    public static final String myFingerPrint = "2ba04d75e6613f80b13183db713fc9c04c4683f5c4869c614497bdf6201aa819";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 1038L)
    public static SubLSymbol $conceptually_related_generality_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 1429L)
    public static SubLSymbol $conceptually_related_generality_ratio$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 1678L)
    private static SubLSymbol $conceptually_related_answer$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 1736L)
    private static SubLSymbol $conceptually_related_answer_table$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 1800L)
    private static SubLSymbol $conceptually_related_mapping_table$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 1864L)
    private static SubLSymbol $conceptually_related_target$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 1921L)
    private static SubLSymbol $conceptually_related_start$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 1978L)
    private static SubLSymbol $conceptually_related_start_generality$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 13391L)
    private static SubLSymbol $default_conceptually_related_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 14353L)
    private static SubLSymbol $default_all_conceptually_related_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 15624L)
    private static SubLSymbol $default_max_conceptually_related_to_cost$;
    private static final SubLSymbol $sym0$FORT_P;
    private static final SubLSymbol $kw1$MAPPING_DONE;
    private static final SubLObject $const2$isa;
    private static final SubLSymbol $kw3$GAF;
    private static final SubLSymbol $kw4$TRUE;
    private static final SubLObject $const5$genls;
    private static final SubLSymbol $sym6$RELEVANT_PRED_IS_SPEC_PRED;
    private static final SubLObject $const7$conceptuallyRelated;
    private static final SubLSymbol $sym8$RELEVANT_PRED_IS_SPEC_INVERSE;
    private static final SubLObject $const9$InferencePSC;
    private static final SubLSymbol $sym10$HLMT_EQUAL_;
    private static final SubLSymbol $sym11$SPEC_MT_;
    private static final SubLSymbol $kw12$GENLS;
    private static final SubLSymbol $kw13$ISA;
    private static final SubLObject $const14$genlInverse;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$GENLPREDS;
    private static final SubLObject $const17$genlPreds;
    private static final SubLSymbol $kw18$POS;
    private static final SubLSymbol $kw19$NEG;
    private static final SubLSymbol $kw20$CONCEPTUALLY_RELATED;
    private static final SubLSymbol $kw21$REMOVAL_CONCEPTUALLY_RELATED;
    private static final SubLList $list22;
    private static final SubLInteger $int23$40;
    private static final SubLSymbol $kw24$REMOVAL_ALL_CONCEPTUALLY_RELATED;
    private static final SubLList $list25;
    private static final SubLSymbol $kw26$REMOVAL_MAX_CONCEPTUALLY_RELATED_TO;
    private static final SubLList $list27;
    private static final SubLSymbol $kw28$MAX_CONCEPTUALLY_RELATED_TO_POS;
    private static final SubLList $list29;
    private static final SubLSymbol $kw30$MINIMIZE;
    private static final SubLSymbol $kw31$REMOVAL_NOT_CONCEPTUALLY_RELATED;
    private static final SubLList $list32;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 2045L)
    public static SubLObject new_conceptually_related_mapping_table() {
        return Hashtables.make_hash_table((SubLObject)removal_modules_conceptually_related.TWENTY_INTEGER, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 2134L)
    public static SubLObject new_conceptually_related_answer_table() {
        return Hashtables.make_hash_table((SubLObject)removal_modules_conceptually_related.TEN_INTEGER, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 2222L)
    public static SubLObject conceptually_relatedP(SubLObject source, final SubLObject target, SubLObject mt, SubLObject check_superiors_of_sourceP) {
        if (mt == removal_modules_conceptually_related.UNPROVIDED) {
            mt = (SubLObject)removal_modules_conceptually_related.NIL;
        }
        if (check_superiors_of_sourceP == removal_modules_conceptually_related.UNPROVIDED) {
            check_superiors_of_sourceP = (SubLObject)removal_modules_conceptually_related.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert removal_modules_conceptually_related.NIL != forts.fort_p(source) : source;
        SubLObject v_answer = (SubLObject)removal_modules_conceptually_related.NIL;
        final SubLObject _prev_bind_0 = removal_modules_conceptually_related.$conceptually_related_mapping_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = removal_modules_conceptually_related.$conceptually_related_target$.currentBinding(thread);
        final SubLObject _prev_bind_3 = removal_modules_conceptually_related.$conceptually_related_answer$.currentBinding(thread);
        try {
            removal_modules_conceptually_related.$conceptually_related_mapping_table$.bind(new_conceptually_related_mapping_table(), thread);
            removal_modules_conceptually_related.$conceptually_related_target$.bind(target, thread);
            removal_modules_conceptually_related.$conceptually_related_answer$.bind((SubLObject)removal_modules_conceptually_related.NIL, thread);
            SubLObject catch_var = (SubLObject)removal_modules_conceptually_related.NIL;
            try {
                thread.throwStack.push(removal_modules_conceptually_related.$kw1$MAPPING_DONE);
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2_$3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    check_immediate_conceptually_related(source);
                    if (removal_modules_conceptually_related.NIL != check_superiors_of_sourceP) {
                        SubLObject isa_col = (SubLObject)removal_modules_conceptually_related.NIL;
                        final SubLObject pred_var = removal_modules_conceptually_related.$const2$isa;
                        if (removal_modules_conceptually_related.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER, pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER, pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_conceptually_related.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_conceptually_related.NIL;
                            while (removal_modules_conceptually_related.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_conceptually_related.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_conceptually_related.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_conceptually_related.$kw3$GAF, (SubLObject)removal_modules_conceptually_related.$kw4$TRUE, (SubLObject)removal_modules_conceptually_related.NIL);
                                        SubLObject done_var_$4 = (SubLObject)removal_modules_conceptually_related.NIL;
                                        final SubLObject token_var_$5 = (SubLObject)removal_modules_conceptually_related.NIL;
                                        while (removal_modules_conceptually_related.NIL == done_var_$4) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                            final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(assertion));
                                            if (removal_modules_conceptually_related.NIL != valid_$6) {
                                                isa_col = assertions_high.gaf_arg(assertion, (SubLObject)removal_modules_conceptually_related.TWO_INTEGER);
                                                final SubLObject _prev_bind_0_$2 = removal_modules_conceptually_related.$conceptually_related_start$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$3 = removal_modules_conceptually_related.$conceptually_related_start_generality$.currentBinding(thread);
                                                try {
                                                    removal_modules_conceptually_related.$conceptually_related_start$.bind(isa_col, thread);
                                                    removal_modules_conceptually_related.$conceptually_related_start_generality$.bind((SubLObject)removal_modules_conceptually_related.NIL, thread);
                                                    check_superior_conceptually_related(isa_col);
                                                }
                                                finally {
                                                    removal_modules_conceptually_related.$conceptually_related_start_generality$.rebind(_prev_bind_1_$3, thread);
                                                    removal_modules_conceptually_related.$conceptually_related_start$.rebind(_prev_bind_0_$2, thread);
                                                }
                                            }
                                            done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid_$6);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_conceptually_related.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (removal_modules_conceptually_related.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid);
                            }
                        }
                        final SubLObject _prev_bind_0_$4 = removal_modules_conceptually_related.$conceptually_related_start$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$4 = removal_modules_conceptually_related.$conceptually_related_start_generality$.currentBinding(thread);
                        try {
                            removal_modules_conceptually_related.$conceptually_related_start$.bind(source, thread);
                            removal_modules_conceptually_related.$conceptually_related_start_generality$.bind((SubLObject)removal_modules_conceptually_related.NIL, thread);
                            SubLObject genl_col = (SubLObject)removal_modules_conceptually_related.NIL;
                            final SubLObject pred_var2 = removal_modules_conceptually_related.$const5$genls;
                            if (removal_modules_conceptually_related.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER, pred_var2)) {
                                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER, pred_var2);
                                SubLObject done_var2 = (SubLObject)removal_modules_conceptually_related.NIL;
                                final SubLObject token_var2 = (SubLObject)removal_modules_conceptually_related.NIL;
                                while (removal_modules_conceptually_related.NIL == done_var2) {
                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                    final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                    if (removal_modules_conceptually_related.NIL != valid2) {
                                        SubLObject final_index_iterator2 = (SubLObject)removal_modules_conceptually_related.NIL;
                                        try {
                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_conceptually_related.$kw3$GAF, (SubLObject)removal_modules_conceptually_related.$kw4$TRUE, (SubLObject)removal_modules_conceptually_related.NIL);
                                            SubLObject done_var_$5 = (SubLObject)removal_modules_conceptually_related.NIL;
                                            final SubLObject token_var_$6 = (SubLObject)removal_modules_conceptually_related.NIL;
                                            while (removal_modules_conceptually_related.NIL == done_var_$5) {
                                                final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                                final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(assertion2));
                                                if (removal_modules_conceptually_related.NIL != valid_$7) {
                                                    genl_col = assertions_high.gaf_arg(assertion2, (SubLObject)removal_modules_conceptually_related.TWO_INTEGER);
                                                    check_superior_conceptually_related(genl_col);
                                                }
                                                done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid_$7);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_conceptually_related.T, thread);
                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                if (removal_modules_conceptually_related.NIL != final_index_iterator2) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                }
                                                Values.restoreValuesFromVector(_values2);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                            }
                                        }
                                    }
                                    done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid2);
                                }
                            }
                        }
                        finally {
                            removal_modules_conceptually_related.$conceptually_related_start_generality$.rebind(_prev_bind_1_$4, thread);
                            removal_modules_conceptually_related.$conceptually_related_start$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)removal_modules_conceptually_related.$kw1$MAPPING_DONE);
            }
            finally {
                thread.throwStack.pop();
            }
            v_answer = removal_modules_conceptually_related.$conceptually_related_answer$.getDynamicValue(thread);
        }
        finally {
            removal_modules_conceptually_related.$conceptually_related_answer$.rebind(_prev_bind_3, thread);
            removal_modules_conceptually_related.$conceptually_related_target$.rebind(_prev_bind_2, thread);
            removal_modules_conceptually_related.$conceptually_related_mapping_table$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 3700L)
    public static SubLObject check_conceptually_related_limited(SubLObject source, final SubLObject threshold, final SubLObject ratio, SubLObject mt) {
        if (mt == removal_modules_conceptually_related.UNPROVIDED) {
            mt = (SubLObject)removal_modules_conceptually_related.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert removal_modules_conceptually_related.NIL != forts.fort_p(source) : source;
        SubLObject v_answer = (SubLObject)removal_modules_conceptually_related.NIL;
        final SubLObject _prev_bind_0 = removal_modules_conceptually_related.$conceptually_related_generality_threshold$.currentBinding(thread);
        final SubLObject _prev_bind_2 = removal_modules_conceptually_related.$conceptually_related_generality_ratio$.currentBinding(thread);
        try {
            removal_modules_conceptually_related.$conceptually_related_generality_threshold$.bind(threshold, thread);
            removal_modules_conceptually_related.$conceptually_related_generality_ratio$.bind(ratio, thread);
            v_answer = all_conceptually_related(source, mt);
        }
        finally {
            removal_modules_conceptually_related.$conceptually_related_generality_ratio$.rebind(_prev_bind_2, thread);
            removal_modules_conceptually_related.$conceptually_related_generality_threshold$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 4206L)
    public static SubLObject check_conceptually_related(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_term.equal(removal_modules_conceptually_related.$conceptually_related_target$.getDynamicValue(thread))) {
            removal_modules_conceptually_related.$conceptually_related_answer$.setDynamicValue((SubLObject)removal_modules_conceptually_related.T, thread);
            utilities_macros.mapping_finished();
        }
        return (SubLObject)removal_modules_conceptually_related.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 4404L)
    public static SubLObject check_immediate_conceptually_related(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_conceptually_related.NIL == Hashtables.gethash(v_term, removal_modules_conceptually_related.$conceptually_related_mapping_table$.getDynamicValue(thread), (SubLObject)removal_modules_conceptually_related.UNPROVIDED)) {
            Hashtables.sethash(v_term, removal_modules_conceptually_related.$conceptually_related_mapping_table$.getDynamicValue(thread), (SubLObject)removal_modules_conceptually_related.T);
            if (removal_modules_conceptually_related.NIL != forts.fort_p(v_term)) {
                SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_conceptually_related.$sym6$RELEVANT_PRED_IS_SPEC_PRED, thread);
                    pred_relevance_macros.$pred$.bind(removal_modules_conceptually_related.$const7$conceptuallyRelated, thread);
                    final SubLObject pred_var = (SubLObject)removal_modules_conceptually_related.NIL;
                    if (removal_modules_conceptually_related.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_conceptually_related.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_conceptually_related.NIL;
                        while (removal_modules_conceptually_related.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_conceptually_related.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_conceptually_related.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_conceptually_related.$kw3$GAF, (SubLObject)removal_modules_conceptually_related.$kw4$TRUE, (SubLObject)removal_modules_conceptually_related.NIL);
                                    SubLObject done_var_$16 = (SubLObject)removal_modules_conceptually_related.NIL;
                                    final SubLObject token_var_$17 = (SubLObject)removal_modules_conceptually_related.NIL;
                                    while (removal_modules_conceptually_related.NIL == done_var_$16) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$17);
                                        final SubLObject valid_$18 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$17.eql(assertion));
                                        if (removal_modules_conceptually_related.NIL != valid_$18) {
                                            final SubLObject related = kb_gp_mapping.dgaivgp_arg(assertion, (SubLObject)removal_modules_conceptually_related.TWO_INTEGER);
                                            check_conceptually_related(related);
                                        }
                                        done_var_$16 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid_$18);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_conceptually_related.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (removal_modules_conceptually_related.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid);
                        }
                    }
                }
                finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                }
                if (removal_modules_conceptually_related.NIL != kb_gp_mapping.dgaigp_binaryP(removal_modules_conceptually_related.$const7$conceptuallyRelated)) {
                    _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                    _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                    try {
                        pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_conceptually_related.$sym8$RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                        pred_relevance_macros.$pred$.bind(removal_modules_conceptually_related.$const7$conceptuallyRelated, thread);
                        final SubLObject pred_var = (SubLObject)removal_modules_conceptually_related.NIL;
                        if (removal_modules_conceptually_related.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arity.binary_arg_swap((SubLObject)removal_modules_conceptually_related.ONE_INTEGER), pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arity.binary_arg_swap((SubLObject)removal_modules_conceptually_related.ONE_INTEGER), pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_conceptually_related.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_conceptually_related.NIL;
                            while (removal_modules_conceptually_related.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_conceptually_related.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_conceptually_related.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_conceptually_related.$kw3$GAF, (SubLObject)removal_modules_conceptually_related.$kw4$TRUE, (SubLObject)removal_modules_conceptually_related.NIL);
                                        SubLObject done_var_$17 = (SubLObject)removal_modules_conceptually_related.NIL;
                                        final SubLObject token_var_$18 = (SubLObject)removal_modules_conceptually_related.NIL;
                                        while (removal_modules_conceptually_related.NIL == done_var_$17) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                            final SubLObject valid_$19 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$18.eql(assertion));
                                            if (removal_modules_conceptually_related.NIL != valid_$19) {
                                                final SubLObject _prev_bind_0_$20 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                                try {
                                                    kb_gp_mapping.$mapping_arg_swap$.bind((SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                    final SubLObject related2 = kb_gp_mapping.dgaivgp_arg(assertion, (SubLObject)removal_modules_conceptually_related.TWO_INTEGER);
                                                    check_conceptually_related(related2);
                                                }
                                                finally {
                                                    kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$20, thread);
                                                }
                                            }
                                            done_var_$17 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid_$19);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_conceptually_related.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_conceptually_related.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid);
                            }
                        }
                    }
                    finally {
                        pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        return (SubLObject)removal_modules_conceptually_related.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 4755L)
    public static SubLObject check_superior_conceptually_related(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_conceptually_related.NIL == Hashtables.gethash(collection, removal_modules_conceptually_related.$conceptually_related_mapping_table$.getDynamicValue(thread), (SubLObject)removal_modules_conceptually_related.UNPROVIDED) && removal_modules_conceptually_related.NIL != conceptual_generality_acceptable(collection)) {
            check_immediate_conceptually_related(collection);
            if (removal_modules_conceptually_related.NIL != forts.fort_p(collection)) {
                SubLObject genl_col = (SubLObject)removal_modules_conceptually_related.NIL;
                final SubLObject pred_var = removal_modules_conceptually_related.$const5$genls;
                if (removal_modules_conceptually_related.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_conceptually_related.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_conceptually_related.NIL;
                    while (removal_modules_conceptually_related.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_conceptually_related.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_conceptually_related.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_conceptually_related.$kw3$GAF, (SubLObject)removal_modules_conceptually_related.$kw4$TRUE, (SubLObject)removal_modules_conceptually_related.NIL);
                                SubLObject done_var_$25 = (SubLObject)removal_modules_conceptually_related.NIL;
                                final SubLObject token_var_$26 = (SubLObject)removal_modules_conceptually_related.NIL;
                                while (removal_modules_conceptually_related.NIL == done_var_$25) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                    final SubLObject valid_$27 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$26.eql(assertion));
                                    if (removal_modules_conceptually_related.NIL != valid_$27) {
                                        genl_col = assertions_high.gaf_arg(assertion, (SubLObject)removal_modules_conceptually_related.TWO_INTEGER);
                                        check_superior_conceptually_related(genl_col);
                                    }
                                    done_var_$25 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid_$27);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_conceptually_related.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (removal_modules_conceptually_related.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid);
                    }
                }
            }
        }
        return (SubLObject)removal_modules_conceptually_related.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 5194L)
    public static SubLObject conceptual_generality_acceptable(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_conceptually_related.NIL == removal_modules_conceptually_related.$conceptually_related_generality_threshold$.getDynamicValue(thread) && removal_modules_conceptually_related.NIL == removal_modules_conceptually_related.$conceptually_related_generality_ratio$.getDynamicValue(thread)) {
            return (SubLObject)removal_modules_conceptually_related.T;
        }
        if (removal_modules_conceptually_related.NIL == forts.fort_p(collection)) {
            return (SubLObject)removal_modules_conceptually_related.NIL;
        }
        final SubLObject generality = cardinality_estimates.generality_estimate(collection);
        if (removal_modules_conceptually_related.NIL == removal_modules_conceptually_related.$conceptually_related_start_generality$.getDynamicValue(thread)) {
            removal_modules_conceptually_related.$conceptually_related_start_generality$.setDynamicValue(cardinality_estimates.generality_estimate(removal_modules_conceptually_related.$conceptually_related_start$.getDynamicValue(thread)), thread);
        }
        if (removal_modules_conceptually_related.NIL != removal_modules_conceptually_related.$conceptually_related_generality_threshold$.getDynamicValue(thread) && generality.numLE(removal_modules_conceptually_related.$conceptually_related_generality_threshold$.getDynamicValue(thread))) {
            return (SubLObject)removal_modules_conceptually_related.T;
        }
        if (removal_modules_conceptually_related.NIL == removal_modules_conceptually_related.$conceptually_related_generality_ratio$.getDynamicValue(thread)) {
            return (SubLObject)removal_modules_conceptually_related.T;
        }
        if (removal_modules_conceptually_related.$conceptually_related_generality_ratio$.getDynamicValue(thread).numE((SubLObject)removal_modules_conceptually_related.ZERO_INTEGER)) {
            return (SubLObject)removal_modules_conceptually_related.NIL;
        }
        if (removal_modules_conceptually_related.$conceptually_related_start_generality$.getDynamicValue(thread).numE((SubLObject)removal_modules_conceptually_related.ZERO_INTEGER)) {
            return (SubLObject)removal_modules_conceptually_related.NIL;
        }
        return Numbers.numLE(generality, Numbers.multiply(removal_modules_conceptually_related.$conceptually_related_generality_ratio$.getDynamicValue(thread), removal_modules_conceptually_related.$conceptually_related_start_generality$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 6429L)
    public static SubLObject all_conceptually_related(SubLObject source, SubLObject mt) {
        if (mt == removal_modules_conceptually_related.UNPROVIDED) {
            mt = (SubLObject)removal_modules_conceptually_related.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert removal_modules_conceptually_related.NIL != forts.fort_p(source) : source;
        SubLObject v_answer = (SubLObject)removal_modules_conceptually_related.NIL;
        final SubLObject _prev_bind_0 = removal_modules_conceptually_related.$conceptually_related_mapping_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = removal_modules_conceptually_related.$conceptually_related_answer_table$.currentBinding(thread);
        final SubLObject _prev_bind_3 = removal_modules_conceptually_related.$conceptually_related_answer$.currentBinding(thread);
        try {
            removal_modules_conceptually_related.$conceptually_related_mapping_table$.bind(new_conceptually_related_mapping_table(), thread);
            removal_modules_conceptually_related.$conceptually_related_answer_table$.bind(new_conceptually_related_answer_table(), thread);
            removal_modules_conceptually_related.$conceptually_related_answer$.bind((SubLObject)removal_modules_conceptually_related.NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$28 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$29 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$30 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                mark_immediate_conceptually_related(source);
                SubLObject isa_col = (SubLObject)removal_modules_conceptually_related.NIL;
                final SubLObject pred_var = removal_modules_conceptually_related.$const2$isa;
                if (removal_modules_conceptually_related.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_conceptually_related.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_conceptually_related.NIL;
                    while (removal_modules_conceptually_related.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_conceptually_related.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_conceptually_related.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_conceptually_related.$kw3$GAF, (SubLObject)removal_modules_conceptually_related.$kw4$TRUE, (SubLObject)removal_modules_conceptually_related.NIL);
                                SubLObject done_var_$31 = (SubLObject)removal_modules_conceptually_related.NIL;
                                final SubLObject token_var_$32 = (SubLObject)removal_modules_conceptually_related.NIL;
                                while (removal_modules_conceptually_related.NIL == done_var_$31) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$32);
                                    final SubLObject valid_$33 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$32.eql(assertion));
                                    if (removal_modules_conceptually_related.NIL != valid_$33) {
                                        isa_col = assertions_high.gaf_arg(assertion, (SubLObject)removal_modules_conceptually_related.TWO_INTEGER);
                                        final SubLObject _prev_bind_0_$29 = removal_modules_conceptually_related.$conceptually_related_start$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$30 = removal_modules_conceptually_related.$conceptually_related_start_generality$.currentBinding(thread);
                                        try {
                                            removal_modules_conceptually_related.$conceptually_related_start$.bind(isa_col, thread);
                                            removal_modules_conceptually_related.$conceptually_related_start_generality$.bind((SubLObject)removal_modules_conceptually_related.NIL, thread);
                                            mark_superior_conceptually_related(isa_col);
                                        }
                                        finally {
                                            removal_modules_conceptually_related.$conceptually_related_start_generality$.rebind(_prev_bind_1_$30, thread);
                                            removal_modules_conceptually_related.$conceptually_related_start$.rebind(_prev_bind_0_$29, thread);
                                        }
                                    }
                                    done_var_$31 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid_$33);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_conceptually_related.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (removal_modules_conceptually_related.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid);
                    }
                }
                final SubLObject _prev_bind_0_$31 = removal_modules_conceptually_related.$conceptually_related_start$.currentBinding(thread);
                final SubLObject _prev_bind_1_$31 = removal_modules_conceptually_related.$conceptually_related_start_generality$.currentBinding(thread);
                try {
                    removal_modules_conceptually_related.$conceptually_related_start$.bind(source, thread);
                    removal_modules_conceptually_related.$conceptually_related_start_generality$.bind((SubLObject)removal_modules_conceptually_related.NIL, thread);
                    SubLObject genl_col = (SubLObject)removal_modules_conceptually_related.NIL;
                    final SubLObject pred_var2 = removal_modules_conceptually_related.$const5$genls;
                    if (removal_modules_conceptually_related.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(source, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(source, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER, pred_var2);
                        SubLObject done_var2 = (SubLObject)removal_modules_conceptually_related.NIL;
                        final SubLObject token_var2 = (SubLObject)removal_modules_conceptually_related.NIL;
                        while (removal_modules_conceptually_related.NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                            if (removal_modules_conceptually_related.NIL != valid2) {
                                SubLObject final_index_iterator2 = (SubLObject)removal_modules_conceptually_related.NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)removal_modules_conceptually_related.$kw3$GAF, (SubLObject)removal_modules_conceptually_related.$kw4$TRUE, (SubLObject)removal_modules_conceptually_related.NIL);
                                    SubLObject done_var_$32 = (SubLObject)removal_modules_conceptually_related.NIL;
                                    final SubLObject token_var_$33 = (SubLObject)removal_modules_conceptually_related.NIL;
                                    while (removal_modules_conceptually_related.NIL == done_var_$32) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$33);
                                        final SubLObject valid_$34 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$33.eql(assertion2));
                                        if (removal_modules_conceptually_related.NIL != valid_$34) {
                                            genl_col = assertions_high.gaf_arg(assertion2, (SubLObject)removal_modules_conceptually_related.TWO_INTEGER);
                                            mark_superior_conceptually_related(genl_col);
                                        }
                                        done_var_$32 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid_$34);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_conceptually_related.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_conceptually_related.NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                                    }
                                }
                            }
                            done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid2);
                        }
                    }
                }
                finally {
                    removal_modules_conceptually_related.$conceptually_related_start_generality$.rebind(_prev_bind_1_$31, thread);
                    removal_modules_conceptually_related.$conceptually_related_start$.rebind(_prev_bind_0_$31, thread);
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$30, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$29, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$28, thread);
            }
            v_answer = Sequences.nreverse(removal_modules_conceptually_related.$conceptually_related_answer$.getDynamicValue(thread));
        }
        finally {
            removal_modules_conceptually_related.$conceptually_related_answer$.rebind(_prev_bind_3, thread);
            removal_modules_conceptually_related.$conceptually_related_answer_table$.rebind(_prev_bind_2, thread);
            removal_modules_conceptually_related.$conceptually_related_mapping_table$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 7707L)
    public static SubLObject all_conceptually_related_limited(SubLObject source, final SubLObject threshold, final SubLObject ratio, SubLObject mt) {
        if (mt == removal_modules_conceptually_related.UNPROVIDED) {
            mt = (SubLObject)removal_modules_conceptually_related.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert removal_modules_conceptually_related.NIL != forts.fort_p(source) : source;
        SubLObject v_answer = (SubLObject)removal_modules_conceptually_related.NIL;
        final SubLObject _prev_bind_0 = removal_modules_conceptually_related.$conceptually_related_generality_threshold$.currentBinding(thread);
        final SubLObject _prev_bind_2 = removal_modules_conceptually_related.$conceptually_related_generality_ratio$.currentBinding(thread);
        try {
            removal_modules_conceptually_related.$conceptually_related_generality_threshold$.bind(threshold, thread);
            removal_modules_conceptually_related.$conceptually_related_generality_ratio$.bind(ratio, thread);
            v_answer = all_conceptually_related(source, mt);
        }
        finally {
            removal_modules_conceptually_related.$conceptually_related_generality_ratio$.rebind(_prev_bind_2, thread);
            removal_modules_conceptually_related.$conceptually_related_generality_threshold$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 8210L)
    public static SubLObject mark_conceptually_related(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_conceptually_related.NIL == Hashtables.gethash(v_term, removal_modules_conceptually_related.$conceptually_related_answer_table$.getDynamicValue(thread), (SubLObject)removal_modules_conceptually_related.UNPROVIDED)) {
            Hashtables.sethash(v_term, removal_modules_conceptually_related.$conceptually_related_answer_table$.getDynamicValue(thread), (SubLObject)removal_modules_conceptually_related.T);
            removal_modules_conceptually_related.$conceptually_related_answer$.setDynamicValue((SubLObject)ConsesLow.cons(v_term, removal_modules_conceptually_related.$conceptually_related_answer$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)removal_modules_conceptually_related.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 8462L)
    public static SubLObject mark_immediate_conceptually_related(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_conceptually_related.NIL == Hashtables.gethash(v_term, removal_modules_conceptually_related.$conceptually_related_mapping_table$.getDynamicValue(thread), (SubLObject)removal_modules_conceptually_related.UNPROVIDED)) {
            Hashtables.sethash(v_term, removal_modules_conceptually_related.$conceptually_related_mapping_table$.getDynamicValue(thread), (SubLObject)removal_modules_conceptually_related.T);
            if (removal_modules_conceptually_related.NIL != forts.fort_p(v_term)) {
                SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_conceptually_related.$sym6$RELEVANT_PRED_IS_SPEC_PRED, thread);
                    pred_relevance_macros.$pred$.bind(removal_modules_conceptually_related.$const7$conceptuallyRelated, thread);
                    final SubLObject pred_var = (SubLObject)removal_modules_conceptually_related.NIL;
                    if (removal_modules_conceptually_related.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER, pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_conceptually_related.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_conceptually_related.NIL;
                        while (removal_modules_conceptually_related.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_conceptually_related.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_conceptually_related.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_conceptually_related.$kw3$GAF, (SubLObject)removal_modules_conceptually_related.$kw4$TRUE, (SubLObject)removal_modules_conceptually_related.NIL);
                                    SubLObject done_var_$43 = (SubLObject)removal_modules_conceptually_related.NIL;
                                    final SubLObject token_var_$44 = (SubLObject)removal_modules_conceptually_related.NIL;
                                    while (removal_modules_conceptually_related.NIL == done_var_$43) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$44);
                                        final SubLObject valid_$45 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$44.eql(assertion));
                                        if (removal_modules_conceptually_related.NIL != valid_$45) {
                                            final SubLObject related = kb_gp_mapping.dgaivgp_arg(assertion, (SubLObject)removal_modules_conceptually_related.TWO_INTEGER);
                                            mark_conceptually_related(related);
                                        }
                                        done_var_$43 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid_$45);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_conceptually_related.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (removal_modules_conceptually_related.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid);
                        }
                    }
                }
                finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                }
                if (removal_modules_conceptually_related.NIL != kb_gp_mapping.dgaigp_binaryP(removal_modules_conceptually_related.$const7$conceptuallyRelated)) {
                    _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                    _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                    try {
                        pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_conceptually_related.$sym8$RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                        pred_relevance_macros.$pred$.bind(removal_modules_conceptually_related.$const7$conceptuallyRelated, thread);
                        final SubLObject pred_var = (SubLObject)removal_modules_conceptually_related.NIL;
                        if (removal_modules_conceptually_related.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arity.binary_arg_swap((SubLObject)removal_modules_conceptually_related.ONE_INTEGER), pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arity.binary_arg_swap((SubLObject)removal_modules_conceptually_related.ONE_INTEGER), pred_var);
                            SubLObject done_var = (SubLObject)removal_modules_conceptually_related.NIL;
                            final SubLObject token_var = (SubLObject)removal_modules_conceptually_related.NIL;
                            while (removal_modules_conceptually_related.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (removal_modules_conceptually_related.NIL != valid) {
                                    SubLObject final_index_iterator = (SubLObject)removal_modules_conceptually_related.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_conceptually_related.$kw3$GAF, (SubLObject)removal_modules_conceptually_related.$kw4$TRUE, (SubLObject)removal_modules_conceptually_related.NIL);
                                        SubLObject done_var_$44 = (SubLObject)removal_modules_conceptually_related.NIL;
                                        final SubLObject token_var_$45 = (SubLObject)removal_modules_conceptually_related.NIL;
                                        while (removal_modules_conceptually_related.NIL == done_var_$44) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$45);
                                            final SubLObject valid_$46 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$45.eql(assertion));
                                            if (removal_modules_conceptually_related.NIL != valid_$46) {
                                                final SubLObject _prev_bind_0_$47 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                                try {
                                                    kb_gp_mapping.$mapping_arg_swap$.bind((SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                    final SubLObject related2 = kb_gp_mapping.dgaivgp_arg(assertion, (SubLObject)removal_modules_conceptually_related.TWO_INTEGER);
                                                    mark_conceptually_related(related2);
                                                }
                                                finally {
                                                    kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$47, thread);
                                                }
                                            }
                                            done_var_$44 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid_$46);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_conceptually_related.T, thread);
                                            final SubLObject _values2 = Values.getValuesAsVector();
                                            if (removal_modules_conceptually_related.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values2);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid);
                            }
                        }
                    }
                    finally {
                        pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        return (SubLObject)removal_modules_conceptually_related.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 8851L)
    public static SubLObject mark_superior_conceptually_related(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_conceptually_related.NIL == Hashtables.gethash(collection, removal_modules_conceptually_related.$conceptually_related_mapping_table$.getDynamicValue(thread), (SubLObject)removal_modules_conceptually_related.UNPROVIDED) && removal_modules_conceptually_related.NIL != conceptual_generality_acceptable(collection)) {
            mark_immediate_conceptually_related(collection);
            if (removal_modules_conceptually_related.NIL != forts.fort_p(collection)) {
                SubLObject genl_col = (SubLObject)removal_modules_conceptually_related.NIL;
                final SubLObject pred_var = removal_modules_conceptually_related.$const5$genls;
                if (removal_modules_conceptually_related.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_conceptually_related.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_conceptually_related.NIL;
                    while (removal_modules_conceptually_related.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_conceptually_related.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_conceptually_related.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_conceptually_related.$kw3$GAF, (SubLObject)removal_modules_conceptually_related.$kw4$TRUE, (SubLObject)removal_modules_conceptually_related.NIL);
                                SubLObject done_var_$52 = (SubLObject)removal_modules_conceptually_related.NIL;
                                final SubLObject token_var_$53 = (SubLObject)removal_modules_conceptually_related.NIL;
                                while (removal_modules_conceptually_related.NIL == done_var_$52) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$53);
                                    final SubLObject valid_$54 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$53.eql(assertion));
                                    if (removal_modules_conceptually_related.NIL != valid_$54) {
                                        genl_col = assertions_high.gaf_arg(assertion, (SubLObject)removal_modules_conceptually_related.TWO_INTEGER);
                                        mark_superior_conceptually_related(genl_col);
                                    }
                                    done_var_$52 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid_$54);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_conceptually_related.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (removal_modules_conceptually_related.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid);
                    }
                }
            }
        }
        return (SubLObject)removal_modules_conceptually_related.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 9287L)
    public static SubLObject max_conceptually_related_to(final SubLObject target, SubLObject mt) {
        if (mt == removal_modules_conceptually_related.UNPROVIDED) {
            mt = (SubLObject)removal_modules_conceptually_related.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert removal_modules_conceptually_related.NIL != forts.fort_p(target) : target;
        SubLObject ans = (SubLObject)removal_modules_conceptually_related.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject _prev_bind_0_$55 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$56 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_conceptually_related.$sym6$RELEVANT_PRED_IS_SPEC_PRED, thread);
                pred_relevance_macros.$pred$.bind(removal_modules_conceptually_related.$const7$conceptuallyRelated, thread);
                final SubLObject pred_var = (SubLObject)removal_modules_conceptually_related.NIL;
                if (removal_modules_conceptually_related.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(target, (SubLObject)removal_modules_conceptually_related.TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(target, (SubLObject)removal_modules_conceptually_related.TWO_INTEGER, pred_var);
                    SubLObject done_var = (SubLObject)removal_modules_conceptually_related.NIL;
                    final SubLObject token_var = (SubLObject)removal_modules_conceptually_related.NIL;
                    while (removal_modules_conceptually_related.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_conceptually_related.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_conceptually_related.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_conceptually_related.$kw3$GAF, (SubLObject)removal_modules_conceptually_related.$kw4$TRUE, (SubLObject)removal_modules_conceptually_related.NIL);
                                SubLObject done_var_$57 = (SubLObject)removal_modules_conceptually_related.NIL;
                                final SubLObject token_var_$58 = (SubLObject)removal_modules_conceptually_related.NIL;
                                while (removal_modules_conceptually_related.NIL == done_var_$57) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$58);
                                    final SubLObject valid_$59 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$58.eql(assertion));
                                    if (removal_modules_conceptually_related.NIL != valid_$59) {
                                        final SubLObject item_var;
                                        final SubLObject related_to = item_var = kb_gp_mapping.dgaivgp_arg(assertion, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER);
                                        if (removal_modules_conceptually_related.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)removal_modules_conceptually_related.EQUAL), Symbols.symbol_function((SubLObject)removal_modules_conceptually_related.IDENTITY))) {
                                            ans = (SubLObject)ConsesLow.cons(item_var, ans);
                                        }
                                    }
                                    done_var_$57 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid_$59);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_conceptually_related.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (removal_modules_conceptually_related.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid);
                    }
                }
            }
            finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_1_$56, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$55, thread);
            }
            if (removal_modules_conceptually_related.NIL != kb_gp_mapping.dgaigp_binaryP(removal_modules_conceptually_related.$const7$conceptuallyRelated)) {
                final SubLObject _prev_bind_0_$57 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$57 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_conceptually_related.$sym8$RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                    pred_relevance_macros.$pred$.bind(removal_modules_conceptually_related.$const7$conceptuallyRelated, thread);
                    final SubLObject pred_var = (SubLObject)removal_modules_conceptually_related.NIL;
                    if (removal_modules_conceptually_related.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(target, arity.binary_arg_swap((SubLObject)removal_modules_conceptually_related.TWO_INTEGER), pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(target, arity.binary_arg_swap((SubLObject)removal_modules_conceptually_related.TWO_INTEGER), pred_var);
                        SubLObject done_var = (SubLObject)removal_modules_conceptually_related.NIL;
                        final SubLObject token_var = (SubLObject)removal_modules_conceptually_related.NIL;
                        while (removal_modules_conceptually_related.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_conceptually_related.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_conceptually_related.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_conceptually_related.$kw3$GAF, (SubLObject)removal_modules_conceptually_related.$kw4$TRUE, (SubLObject)removal_modules_conceptually_related.NIL);
                                    SubLObject done_var_$58 = (SubLObject)removal_modules_conceptually_related.NIL;
                                    final SubLObject token_var_$59 = (SubLObject)removal_modules_conceptually_related.NIL;
                                    while (removal_modules_conceptually_related.NIL == done_var_$58) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$59);
                                        final SubLObject valid_$60 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$59.eql(assertion));
                                        if (removal_modules_conceptually_related.NIL != valid_$60) {
                                            final SubLObject _prev_bind_0_$58 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                            try {
                                                kb_gp_mapping.$mapping_arg_swap$.bind((SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                final SubLObject item_var2;
                                                final SubLObject related_to2 = item_var2 = kb_gp_mapping.dgaivgp_arg(assertion, (SubLObject)removal_modules_conceptually_related.ONE_INTEGER);
                                                if (removal_modules_conceptually_related.NIL == conses_high.member(item_var2, ans, Symbols.symbol_function((SubLObject)removal_modules_conceptually_related.EQUAL), Symbols.symbol_function((SubLObject)removal_modules_conceptually_related.IDENTITY))) {
                                                    ans = (SubLObject)ConsesLow.cons(item_var2, ans);
                                                }
                                            }
                                            finally {
                                                kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$58, thread);
                                            }
                                        }
                                        done_var_$58 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid_$60);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$59 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_conceptually_related.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_conceptually_related.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$59, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid);
                        }
                    }
                }
                finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_1_$57, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$57, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 9769L)
    public static SubLObject not_conceptually_relatedP(SubLObject source, final SubLObject target, SubLObject mt) {
        if (mt == removal_modules_conceptually_related.UNPROVIDED) {
            mt = (SubLObject)removal_modules_conceptually_related.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)removal_modules_conceptually_related.NIL;
        if (removal_modules_conceptually_related.NIL != forts.fort_p(source) && removal_modules_conceptually_related.NIL != forts.fort_p(target)) {
            final SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
            try {
                system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)removal_modules_conceptually_related.T, thread);
                ans = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL != genls.genlsP(source, target, mt, (SubLObject)removal_modules_conceptually_related.UNPROVIDED) || removal_modules_conceptually_related.NIL != genls.genlsP(target, source, mt, (SubLObject)removal_modules_conceptually_related.UNPROVIDED) || removal_modules_conceptually_related.NIL != isa.isaP(source, target, mt, (SubLObject)removal_modules_conceptually_related.UNPROVIDED) || removal_modules_conceptually_related.NIL != isa.isaP(target, source, mt, (SubLObject)removal_modules_conceptually_related.UNPROVIDED));
            }
            finally {
                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 10274L)
    public static SubLObject max_floor_mts_of_conceptually_related_paths(SubLObject source, final SubLObject target) {
        SubLObject mts = (SubLObject)removal_modules_conceptually_related.NIL;
        SubLObject cdolist_list_var;
        final SubLObject v_arguments = cdolist_list_var = why_conceptually_relatedP_internal(source, target, removal_modules_conceptually_related.$const9$InferencePSC, (SubLObject)removal_modules_conceptually_related.NIL);
        SubLObject argument = (SubLObject)removal_modules_conceptually_related.NIL;
        argument = cdolist_list_var.first();
        while (removal_modules_conceptually_related.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$68 = hl_supports.max_floor_mts_of_justification(argument);
            SubLObject mt = (SubLObject)removal_modules_conceptually_related.NIL;
            mt = cdolist_list_var_$68.first();
            while (removal_modules_conceptually_related.NIL != cdolist_list_var_$68) {
                final SubLObject item_var = mt;
                if (removal_modules_conceptually_related.NIL == conses_high.member(item_var, mts, Symbols.symbol_function((SubLObject)removal_modules_conceptually_related.$sym10$HLMT_EQUAL_), Symbols.symbol_function((SubLObject)removal_modules_conceptually_related.IDENTITY))) {
                    mts = (SubLObject)ConsesLow.cons(item_var, mts);
                }
                cdolist_list_var_$68 = cdolist_list_var_$68.rest();
                mt = cdolist_list_var_$68.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        }
        return list_utilities.remove_subsumed_items(mts, Symbols.symbol_function((SubLObject)removal_modules_conceptually_related.$sym11$SPEC_MT_), (SubLObject)removal_modules_conceptually_related.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 10897L)
    public static SubLObject why_conceptually_relatedP(SubLObject source, final SubLObject target, SubLObject mt) {
        if (mt == removal_modules_conceptually_related.UNPROVIDED) {
            mt = (SubLObject)removal_modules_conceptually_related.NIL;
        }
        assert removal_modules_conceptually_related.NIL != forts.fort_p(source) : source;
        assert removal_modules_conceptually_related.NIL != forts.fort_p(target) : target;
        return why_conceptually_relatedP_internal(source, target, mt, (SubLObject)removal_modules_conceptually_related.T).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 11266L)
    public static SubLObject why_conceptually_relatedP_internal(SubLObject source, final SubLObject target, final SubLObject mt, final SubLObject one_is_enoughP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_arguments = (SubLObject)removal_modules_conceptually_related.NIL;
        SubLObject doneP = (SubLObject)removal_modules_conceptually_related.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            final SubLObject _prev_bind_0_$69 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$70 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_conceptually_related.$sym6$RELEVANT_PRED_IS_SPEC_PRED, thread);
                pred_relevance_macros.$pred$.bind(removal_modules_conceptually_related.$const7$conceptuallyRelated, thread);
                final SubLObject pred_var = (SubLObject)removal_modules_conceptually_related.NIL;
                if (removal_modules_conceptually_related.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(target, (SubLObject)removal_modules_conceptually_related.TWO_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(target, (SubLObject)removal_modules_conceptually_related.TWO_INTEGER, pred_var);
                    SubLObject done_var = doneP;
                    final SubLObject token_var = (SubLObject)removal_modules_conceptually_related.NIL;
                    while (removal_modules_conceptually_related.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (removal_modules_conceptually_related.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)removal_modules_conceptually_related.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_conceptually_related.$kw3$GAF, (SubLObject)removal_modules_conceptually_related.$kw4$TRUE, (SubLObject)removal_modules_conceptually_related.NIL);
                                SubLObject done_var_$71 = doneP;
                                final SubLObject token_var_$72 = (SubLObject)removal_modules_conceptually_related.NIL;
                                while (removal_modules_conceptually_related.NIL == done_var_$71) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$72);
                                    final SubLObject valid_$73 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$72.eql(ass));
                                    if (removal_modules_conceptually_related.NIL != valid_$73) {
                                        final SubLObject predicate = assertions_high.gaf_predicate(ass);
                                        final SubLObject arg1 = assertions_high.gaf_arg1(ass);
                                        final SubLObject arg2 = assertions_high.gaf_arg2(ass);
                                        final SubLObject source_genl = (removal_modules_conceptually_related.NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? arg2 : arg1;
                                        SubLObject argument = (SubLObject)removal_modules_conceptually_related.NIL;
                                        SubLObject found = (SubLObject)removal_modules_conceptually_related.NIL;
                                        if (source.eql(source_genl)) {
                                            found = (SubLObject)removal_modules_conceptually_related.T;
                                            doneP = one_is_enoughP;
                                        }
                                        else if (removal_modules_conceptually_related.NIL != genls.genlsP(source, source_genl, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED)) {
                                            found = (SubLObject)removal_modules_conceptually_related.T;
                                            doneP = one_is_enoughP;
                                            final SubLObject formula = (SubLObject)ConsesLow.list(removal_modules_conceptually_related.$const5$genls, source, source_genl);
                                            argument = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_conceptually_related.$kw12$GENLS, formula, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED), argument);
                                        }
                                        else if (removal_modules_conceptually_related.NIL != isa.isaP(source, source_genl, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED)) {
                                            found = (SubLObject)removal_modules_conceptually_related.T;
                                            doneP = one_is_enoughP;
                                            final SubLObject formula = (SubLObject)ConsesLow.list(removal_modules_conceptually_related.$const2$isa, source, source_genl);
                                            argument = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_conceptually_related.$kw13$ISA, formula, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED), argument);
                                        }
                                        if (removal_modules_conceptually_related.NIL != found) {
                                            argument = (SubLObject)ConsesLow.cons(ass, argument);
                                            if (!predicate.eql(removal_modules_conceptually_related.$const7$conceptuallyRelated)) {
                                                if (removal_modules_conceptually_related.NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) {
                                                    final SubLObject formula = (SubLObject)ConsesLow.listS(removal_modules_conceptually_related.$const14$genlInverse, predicate, (SubLObject)removal_modules_conceptually_related.$list15);
                                                    argument = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_conceptually_related.$kw16$GENLPREDS, formula, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED), argument);
                                                }
                                                else {
                                                    final SubLObject formula = (SubLObject)ConsesLow.listS(removal_modules_conceptually_related.$const17$genlPreds, predicate, (SubLObject)removal_modules_conceptually_related.$list15);
                                                    argument = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_conceptually_related.$kw16$GENLPREDS, formula, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED), argument);
                                                }
                                            }
                                            v_arguments = (SubLObject)ConsesLow.cons(argument, v_arguments);
                                        }
                                    }
                                    done_var_$71 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid_$73 || removal_modules_conceptually_related.NIL != doneP);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$70 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_conceptually_related.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (removal_modules_conceptually_related.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid || removal_modules_conceptually_related.NIL != doneP);
                    }
                }
            }
            finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_1_$70, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$69, thread);
            }
            if (removal_modules_conceptually_related.NIL != kb_gp_mapping.dgaigp_binaryP(removal_modules_conceptually_related.$const7$conceptuallyRelated)) {
                final SubLObject _prev_bind_0_$71 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$71 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)removal_modules_conceptually_related.$sym8$RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                    pred_relevance_macros.$pred$.bind(removal_modules_conceptually_related.$const7$conceptuallyRelated, thread);
                    final SubLObject pred_var = (SubLObject)removal_modules_conceptually_related.NIL;
                    if (removal_modules_conceptually_related.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(target, arity.binary_arg_swap((SubLObject)removal_modules_conceptually_related.TWO_INTEGER), pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(target, arity.binary_arg_swap((SubLObject)removal_modules_conceptually_related.TWO_INTEGER), pred_var);
                        SubLObject done_var = doneP;
                        final SubLObject token_var = (SubLObject)removal_modules_conceptually_related.NIL;
                        while (removal_modules_conceptually_related.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (removal_modules_conceptually_related.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)removal_modules_conceptually_related.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)removal_modules_conceptually_related.$kw3$GAF, (SubLObject)removal_modules_conceptually_related.$kw4$TRUE, (SubLObject)removal_modules_conceptually_related.NIL);
                                    SubLObject done_var_$72 = doneP;
                                    final SubLObject token_var_$73 = (SubLObject)removal_modules_conceptually_related.NIL;
                                    while (removal_modules_conceptually_related.NIL == done_var_$72) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$73);
                                        final SubLObject valid_$74 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$73.eql(ass));
                                        if (removal_modules_conceptually_related.NIL != valid_$74) {
                                            final SubLObject _prev_bind_0_$72 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                            try {
                                                kb_gp_mapping.$mapping_arg_swap$.bind((SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                final SubLObject predicate2 = assertions_high.gaf_predicate(ass);
                                                final SubLObject arg3 = assertions_high.gaf_arg1(ass);
                                                final SubLObject arg4 = assertions_high.gaf_arg2(ass);
                                                final SubLObject source_genl2 = (removal_modules_conceptually_related.NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? arg4 : arg3;
                                                SubLObject argument2 = (SubLObject)removal_modules_conceptually_related.NIL;
                                                SubLObject found2 = (SubLObject)removal_modules_conceptually_related.NIL;
                                                if (source.eql(source_genl2)) {
                                                    found2 = (SubLObject)removal_modules_conceptually_related.T;
                                                    doneP = one_is_enoughP;
                                                }
                                                else if (removal_modules_conceptually_related.NIL != genls.genlsP(source, source_genl2, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED)) {
                                                    found2 = (SubLObject)removal_modules_conceptually_related.T;
                                                    doneP = one_is_enoughP;
                                                    final SubLObject formula2 = (SubLObject)ConsesLow.list(removal_modules_conceptually_related.$const5$genls, source, source_genl2);
                                                    argument2 = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_conceptually_related.$kw12$GENLS, formula2, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED), argument2);
                                                }
                                                else if (removal_modules_conceptually_related.NIL != isa.isaP(source, source_genl2, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED)) {
                                                    found2 = (SubLObject)removal_modules_conceptually_related.T;
                                                    doneP = one_is_enoughP;
                                                    final SubLObject formula2 = (SubLObject)ConsesLow.list(removal_modules_conceptually_related.$const2$isa, source, source_genl2);
                                                    argument2 = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_conceptually_related.$kw13$ISA, formula2, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED), argument2);
                                                }
                                                if (removal_modules_conceptually_related.NIL != found2) {
                                                    argument2 = (SubLObject)ConsesLow.cons(ass, argument2);
                                                    if (!predicate2.eql(removal_modules_conceptually_related.$const7$conceptuallyRelated)) {
                                                        if (removal_modules_conceptually_related.NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) {
                                                            final SubLObject formula2 = (SubLObject)ConsesLow.listS(removal_modules_conceptually_related.$const14$genlInverse, predicate2, (SubLObject)removal_modules_conceptually_related.$list15);
                                                            argument2 = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_conceptually_related.$kw16$GENLPREDS, formula2, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED), argument2);
                                                        }
                                                        else {
                                                            final SubLObject formula2 = (SubLObject)ConsesLow.listS(removal_modules_conceptually_related.$const17$genlPreds, predicate2, (SubLObject)removal_modules_conceptually_related.$list15);
                                                            argument2 = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_conceptually_related.$kw16$GENLPREDS, formula2, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED), argument2);
                                                        }
                                                    }
                                                    v_arguments = (SubLObject)ConsesLow.cons(argument2, v_arguments);
                                                }
                                            }
                                            finally {
                                                kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_$72, thread);
                                            }
                                        }
                                        done_var_$72 = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid_$74 || removal_modules_conceptually_related.NIL != doneP);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$73 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_conceptually_related.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (removal_modules_conceptually_related.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$73, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_conceptually_related.NIL == valid || removal_modules_conceptually_related.NIL != doneP);
                        }
                    }
                }
                finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_1_$71, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$71, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return v_arguments;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 12807L)
    public static SubLObject why_not_conceptually_relatedP(SubLObject source, final SubLObject target, SubLObject mt) {
        if (mt == removal_modules_conceptually_related.UNPROVIDED) {
            mt = (SubLObject)removal_modules_conceptually_related.NIL;
        }
        return (SubLObject)removal_modules_conceptually_related.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 13561L)
    public static SubLObject removal_conceptually_related_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_conceptually_related.UNPROVIDED) {
            sense = (SubLObject)removal_modules_conceptually_related.NIL;
        }
        final SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_conceptually_related.UNPROVIDED);
        final SubLObject target = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_conceptually_related.UNPROVIDED);
        if (removal_modules_conceptually_related.NIL != conceptually_relatedP(source, target, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_conceptually_related.$kw20$CONCEPTUALLY_RELATED, asent, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED), (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED);
        }
        return (SubLObject)removal_modules_conceptually_related.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 14540L)
    public static SubLObject removal_all_conceptually_related_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_conceptually_related.UNPROVIDED) {
            sense = (SubLObject)removal_modules_conceptually_related.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_conceptually_related.UNPROVIDED);
        final SubLObject variable = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_conceptually_related.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject v_related_concepts = cdolist_list_var = all_conceptually_related(source, (SubLObject)removal_modules_conceptually_related.UNPROVIDED);
        SubLObject related_concept = (SubLObject)removal_modules_conceptually_related.NIL;
        related_concept = cdolist_list_var.first();
        while (removal_modules_conceptually_related.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(variable, related_concept, (SubLObject)removal_modules_conceptually_related.T, (SubLObject)removal_modules_conceptually_related.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject formula = (SubLObject)ConsesLow.list(removal_modules_conceptually_related.$const7$conceptuallyRelated, source, related_concept);
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_conceptually_related.$kw20$CONCEPTUALLY_RELATED, formula, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED), v_bindings, unify_justification);
            cdolist_list_var = cdolist_list_var.rest();
            related_concept = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_conceptually_related.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 15837L)
    public static SubLObject removal_max_conceptually_related_to_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_conceptually_related.UNPROVIDED) {
            sense = (SubLObject)removal_modules_conceptually_related.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.max(removal_modules_conceptually_related.$default_max_conceptually_related_to_cost$.getDynamicValue(thread), kb_indexing.relevant_num_gaf_arg_index(cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_conceptually_related.UNPROVIDED), (SubLObject)removal_modules_conceptually_related.TWO_INTEGER, removal_modules_conceptually_related.$const7$conceptuallyRelated));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 16081L)
    public static SubLObject removal_max_conceptually_related_to_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_conceptually_related.UNPROVIDED) {
            sense = (SubLObject)removal_modules_conceptually_related.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject variable = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_conceptually_related.UNPROVIDED);
        final SubLObject target = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_conceptually_related.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject v_related_concepts = cdolist_list_var = max_conceptually_related_to(target, (SubLObject)removal_modules_conceptually_related.UNPROVIDED);
        SubLObject related_concept = (SubLObject)removal_modules_conceptually_related.NIL;
        related_concept = cdolist_list_var.first();
        while (removal_modules_conceptually_related.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(variable, related_concept, (SubLObject)removal_modules_conceptually_related.T, (SubLObject)removal_modules_conceptually_related.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject formula = (SubLObject)ConsesLow.list(removal_modules_conceptually_related.$const7$conceptuallyRelated, related_concept, target);
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_conceptually_related.$kw20$CONCEPTUALLY_RELATED, formula, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED), v_bindings, unify_justification);
            cdolist_list_var = cdolist_list_var.rest();
            related_concept = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_conceptually_related.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-conceptually-related.lisp", position = 17417L)
    public static SubLObject removal_not_conceptually_related_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_conceptually_related.UNPROVIDED) {
            sense = (SubLObject)removal_modules_conceptually_related.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_conceptually_related.UNPROVIDED);
        final SubLObject target = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_conceptually_related.UNPROVIDED);
        if (removal_modules_conceptually_related.NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && removal_modules_conceptually_related.NIL == conceptually_relatedP(source, target, (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_conceptually_related.$kw30$MINIMIZE, cycl_utilities.negate(asent), (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED), (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED);
        }
        else if (removal_modules_conceptually_related.NIL != not_conceptually_relatedP(source, target, (SubLObject)removal_modules_conceptually_related.UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_conceptually_related.$kw20$CONCEPTUALLY_RELATED, cycl_utilities.negate(asent), (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED), (SubLObject)removal_modules_conceptually_related.UNPROVIDED, (SubLObject)removal_modules_conceptually_related.UNPROVIDED);
        }
        return (SubLObject)removal_modules_conceptually_related.NIL;
    }
    
    public static SubLObject declare_removal_modules_conceptually_related_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "new_conceptually_related_mapping_table", "NEW-CONCEPTUALLY-RELATED-MAPPING-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "new_conceptually_related_answer_table", "NEW-CONCEPTUALLY-RELATED-ANSWER-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "conceptually_relatedP", "CONCEPTUALLY-RELATED?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "check_conceptually_related_limited", "CHECK-CONCEPTUALLY-RELATED-LIMITED", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "check_conceptually_related", "CHECK-CONCEPTUALLY-RELATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "check_immediate_conceptually_related", "CHECK-IMMEDIATE-CONCEPTUALLY-RELATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "check_superior_conceptually_related", "CHECK-SUPERIOR-CONCEPTUALLY-RELATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "conceptual_generality_acceptable", "CONCEPTUAL-GENERALITY-ACCEPTABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "all_conceptually_related", "ALL-CONCEPTUALLY-RELATED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "all_conceptually_related_limited", "ALL-CONCEPTUALLY-RELATED-LIMITED", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "mark_conceptually_related", "MARK-CONCEPTUALLY-RELATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "mark_immediate_conceptually_related", "MARK-IMMEDIATE-CONCEPTUALLY-RELATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "mark_superior_conceptually_related", "MARK-SUPERIOR-CONCEPTUALLY-RELATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "max_conceptually_related_to", "MAX-CONCEPTUALLY-RELATED-TO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "not_conceptually_relatedP", "NOT-CONCEPTUALLY-RELATED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "max_floor_mts_of_conceptually_related_paths", "MAX-FLOOR-MTS-OF-CONCEPTUALLY-RELATED-PATHS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "why_conceptually_relatedP", "WHY-CONCEPTUALLY-RELATED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "why_conceptually_relatedP_internal", "WHY-CONCEPTUALLY-RELATED?-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "why_not_conceptually_relatedP", "WHY-NOT-CONCEPTUALLY-RELATED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "removal_conceptually_related_expand", "REMOVAL-CONCEPTUALLY-RELATED-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "removal_all_conceptually_related_expand", "REMOVAL-ALL-CONCEPTUALLY-RELATED-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "removal_max_conceptually_related_to_cost", "REMOVAL-MAX-CONCEPTUALLY-RELATED-TO-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "removal_max_conceptually_related_to_expand", "REMOVAL-MAX-CONCEPTUALLY-RELATED-TO-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_conceptually_related", "removal_not_conceptually_related_expand", "REMOVAL-NOT-CONCEPTUALLY-RELATED-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_conceptually_related.NIL;
    }
    
    public static SubLObject init_removal_modules_conceptually_related_file() {
        removal_modules_conceptually_related.$conceptually_related_generality_threshold$ = SubLFiles.defparameter("*CONCEPTUALLY-RELATED-GENERALITY-THRESHOLD*", (SubLObject)removal_modules_conceptually_related.NIL);
        removal_modules_conceptually_related.$conceptually_related_generality_ratio$ = SubLFiles.defparameter("*CONCEPTUALLY-RELATED-GENERALITY-RATIO*", (SubLObject)removal_modules_conceptually_related.NIL);
        removal_modules_conceptually_related.$conceptually_related_answer$ = SubLFiles.defparameter("*CONCEPTUALLY-RELATED-ANSWER*", (SubLObject)removal_modules_conceptually_related.NIL);
        removal_modules_conceptually_related.$conceptually_related_answer_table$ = SubLFiles.defparameter("*CONCEPTUALLY-RELATED-ANSWER-TABLE*", (SubLObject)removal_modules_conceptually_related.NIL);
        removal_modules_conceptually_related.$conceptually_related_mapping_table$ = SubLFiles.defparameter("*CONCEPTUALLY-RELATED-MAPPING-TABLE*", (SubLObject)removal_modules_conceptually_related.NIL);
        removal_modules_conceptually_related.$conceptually_related_target$ = SubLFiles.defparameter("*CONCEPTUALLY-RELATED-TARGET*", (SubLObject)removal_modules_conceptually_related.NIL);
        removal_modules_conceptually_related.$conceptually_related_start$ = SubLFiles.defparameter("*CONCEPTUALLY-RELATED-START*", (SubLObject)removal_modules_conceptually_related.NIL);
        removal_modules_conceptually_related.$conceptually_related_start_generality$ = SubLFiles.defparameter("*CONCEPTUALLY-RELATED-START-GENERALITY*", (SubLObject)removal_modules_conceptually_related.NIL);
        removal_modules_conceptually_related.$default_conceptually_related_cost$ = SubLFiles.defparameter("*DEFAULT-CONCEPTUALLY-RELATED-COST*", (SubLObject)removal_modules_conceptually_related.ONE_INTEGER);
        removal_modules_conceptually_related.$default_all_conceptually_related_cost$ = SubLFiles.defparameter("*DEFAULT-ALL-CONCEPTUALLY-RELATED-COST*", (SubLObject)removal_modules_conceptually_related.$int23$40);
        removal_modules_conceptually_related.$default_max_conceptually_related_to_cost$ = SubLFiles.defparameter("*DEFAULT-MAX-CONCEPTUALLY-RELATED-TO-COST*", (SubLObject)removal_modules_conceptually_related.TWENTY_INTEGER);
        return (SubLObject)removal_modules_conceptually_related.NIL;
    }
    
    public static SubLObject setup_removal_modules_conceptually_related_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_conceptually_related.$const7$conceptuallyRelated);
        preference_modules.doomed_unless_either_arg_bindable((SubLObject)removal_modules_conceptually_related.$kw18$POS, removal_modules_conceptually_related.$const7$conceptuallyRelated);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_conceptually_related.$kw19$NEG, removal_modules_conceptually_related.$const7$conceptuallyRelated);
        inference_modules.inference_removal_module((SubLObject)removal_modules_conceptually_related.$kw21$REMOVAL_CONCEPTUALLY_RELATED, (SubLObject)removal_modules_conceptually_related.$list22);
        inference_modules.inference_removal_module((SubLObject)removal_modules_conceptually_related.$kw24$REMOVAL_ALL_CONCEPTUALLY_RELATED, (SubLObject)removal_modules_conceptually_related.$list25);
        inference_modules.inference_removal_module((SubLObject)removal_modules_conceptually_related.$kw26$REMOVAL_MAX_CONCEPTUALLY_RELATED_TO, (SubLObject)removal_modules_conceptually_related.$list27);
        preference_modules.inference_preference_module((SubLObject)removal_modules_conceptually_related.$kw28$MAX_CONCEPTUALLY_RELATED_TO_POS, (SubLObject)removal_modules_conceptually_related.$list29);
        inference_modules.inference_removal_module((SubLObject)removal_modules_conceptually_related.$kw31$REMOVAL_NOT_CONCEPTUALLY_RELATED, (SubLObject)removal_modules_conceptually_related.$list32);
        return (SubLObject)removal_modules_conceptually_related.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_conceptually_related_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_conceptually_related_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_conceptually_related_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_conceptually_related();
        removal_modules_conceptually_related.$conceptually_related_generality_threshold$ = null;
        removal_modules_conceptually_related.$conceptually_related_generality_ratio$ = null;
        removal_modules_conceptually_related.$conceptually_related_answer$ = null;
        removal_modules_conceptually_related.$conceptually_related_answer_table$ = null;
        removal_modules_conceptually_related.$conceptually_related_mapping_table$ = null;
        removal_modules_conceptually_related.$conceptually_related_target$ = null;
        removal_modules_conceptually_related.$conceptually_related_start$ = null;
        removal_modules_conceptually_related.$conceptually_related_start_generality$ = null;
        removal_modules_conceptually_related.$default_conceptually_related_cost$ = null;
        removal_modules_conceptually_related.$default_all_conceptually_related_cost$ = null;
        removal_modules_conceptually_related.$default_max_conceptually_related_to_cost$ = null;
        $sym0$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $kw1$MAPPING_DONE = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $const2$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw3$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw4$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const5$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym6$RELEVANT_PRED_IS_SPEC_PRED = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-PRED");
        $const7$conceptuallyRelated = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated"));
        $sym8$RELEVANT_PRED_IS_SPEC_INVERSE = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE");
        $const9$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym10$HLMT_EQUAL_ = SubLObjectFactory.makeSymbol("HLMT-EQUAL?");
        $sym11$SPEC_MT_ = SubLObjectFactory.makeSymbol("SPEC-MT?");
        $kw12$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $kw13$ISA = SubLObjectFactory.makeKeyword("ISA");
        $const14$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $list15 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")));
        $kw16$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $const17$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $kw18$POS = SubLObjectFactory.makeKeyword("POS");
        $kw19$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw20$CONCEPTUALLY_RELATED = SubLObjectFactory.makeKeyword("CONCEPTUALLY-RELATED");
        $kw21$REMOVAL_CONCEPTUALLY_RELATED = SubLObjectFactory.makeKeyword("REMOVAL-CONCEPTUALLY-RELATED");
        $list22 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-CONCEPTUALLY-RELATED-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-CONCEPTUALLY-RELATED-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$conceptuallyRelated <fort> <fully bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$conceptuallyRelated #$Dog #$DogFood)") });
        $int23$40 = SubLObjectFactory.makeInteger(40);
        $kw24$REMOVAL_ALL_CONCEPTUALLY_RELATED = SubLObjectFactory.makeKeyword("REMOVAL-ALL-CONCEPTUALLY-RELATED");
        $list25 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-ALL-CONCEPTUALLY-RELATED-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ALL-CONCEPTUALLY-RELATED-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$conceptuallyRelated <fort> <variable>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$conceptuallyRelated #$Dog ?WHAT)") });
        $kw26$REMOVAL_MAX_CONCEPTUALLY_RELATED_TO = SubLObjectFactory.makeKeyword("REMOVAL-MAX-CONCEPTUALLY-RELATED-TO");
        $list27 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-MAX-CONCEPTUALLY-RELATED-TO-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("GROSSLY-INCOMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-MAX-CONCEPTUALLY-RELATED-TO-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$conceptuallyRelated <variable> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$conceptuallyRelated ?WHAT #$DogFood)") });
        $kw28$MAX_CONCEPTUALLY_RELATED_TO_POS = SubLObjectFactory.makeKeyword("MAX-CONCEPTUALLY-RELATED-TO-POS");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $kw30$MINIMIZE = SubLObjectFactory.makeKeyword("MINIMIZE");
        $kw31$REMOVAL_NOT_CONCEPTUALLY_RELATED = SubLObjectFactory.makeKeyword("REMOVAL-NOT-CONCEPTUALLY-RELATED");
        $list32 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-CONCEPTUALLY-RELATED-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-NOT-CONCEPTUALLY-RELATED-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$conceptuallyRelated <fort> <fort>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not (#$conceptuallyRelated #$Dog #$Animal))") });
    }
}

/*

	Total time: 813 ms
	
*/