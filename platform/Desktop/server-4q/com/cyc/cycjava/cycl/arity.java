package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class arity extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.arity";
    public static final String myFingerPrint = "691188bf4da41ee12ffc8746cc84350ef3927345ef7f7a31f5c49f23ac5864c0";
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 711L)
    private static SubLSymbol $kb_arity_table_equality_test$;
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 856L)
    private static SubLSymbol $kb_arity_table$;
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 4870L)
    private static SubLSymbol $kb_arity_min_table$;
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 8623L)
    private static SubLSymbol $kb_arity_max_table$;
    private static final SubLSymbol $sym0$_KB_ARITY_TABLE_;
    private static final SubLObject $const1$Relation;
    private static final SubLSymbol $sym2$FORT_P;
    private static final SubLSymbol $sym3$CYC_VAR_;
    private static final SubLSymbol $sym4$ARITY;
    private static final SubLList $list5;
    private static final SubLString $str6$Return_the_arity_for_relation_con;
    private static final SubLSymbol $sym7$_X;
    private static final SubLObject $const8$arity;
    private static final SubLList $list9;
    private static final SubLObject $const10$InferencePSC;
    private static final SubLList $list11;
    private static final SubLString $str12$Initializing_all_arities___;
    private static final SubLSymbol $sym13$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const14$EverythingPSC;
    private static final SubLSymbol $kw15$GAF;
    private static final SubLSymbol $kw16$TRUE;
    private static final SubLSymbol $sym17$INTEGERP;
    private static final SubLString $str18$Trying_to_overload_arity_for__A_f;
    private static final SubLSymbol $sym19$_KB_ARITY_MIN_TABLE_;
    private static final SubLObject $const20$VariableArityRelation;
    private static final SubLObject $const21$arityMin;
    private static final SubLString $str22$Trying_to_overload_arityMin_for__;
    private static final SubLSymbol $sym23$MIN_ARITY;
    private static final SubLSymbol $sym24$_KB_ARITY_MAX_TABLE_;
    private static final SubLObject $const25$arityMax;
    private static final SubLString $str26$Trying_to_overload_arityMax_for__;
    private static final SubLSymbol $sym27$MAX_ARITY;
    private static final SubLSymbol $sym28$RELATION_P;
    private static final SubLSymbol $sym29$ARITY_ADMITS_;
    private static final SubLSymbol $kw30$TEST;
    private static final SubLSymbol $kw31$OWNER;
    private static final SubLSymbol $kw32$CLASSES;
    private static final SubLSymbol $kw33$KB;
    private static final SubLSymbol $kw34$TINY;
    private static final SubLSymbol $kw35$WORKING_;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$ARITY_ADMITS__;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$ARITY_ADMITS_;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$ARITY_ADMITS__;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$ARITY_ADMITS_;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$RELATION_ARITY_CONSTRAINT_SENTENCES;
    private static final SubLSymbol $kw46$FULL;
    private static final SubLList $list47;
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 929L)
    public static SubLObject initialize_arity_table() {
        arity.$kb_arity_table$.setGlobalValue(Hashtables.make_hash_table(cardinality_estimates.instance_cardinality(arity.$const1$Relation), arity.$kb_arity_table_equality_test$.getGlobalValue(), (SubLObject)arity.UNPROVIDED));
        return arity.$kb_arity_table$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 1115L)
    public static SubLObject arity_lookup(final SubLObject relation) {
        assert arity.NIL != forts.fort_p(relation) : relation;
        return Hashtables.gethash_without_values(relation, arity.$kb_arity_table$.getGlobalValue(), (SubLObject)arity.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 1248L)
    public static SubLObject set_arity(final SubLObject relation, final SubLObject v_arity) {
        assert arity.NIL != forts.fort_p(relation) : relation;
        return Hashtables.sethash(relation, arity.$kb_arity_table$.getGlobalValue(), v_arity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 1374L)
    public static SubLObject rem_arity(final SubLObject relation) {
        Hashtables.remhash(relation, arity.$kb_arity_table$.getGlobalValue());
        return relation;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 1500L)
    public static SubLObject arity(final SubLObject relation) {
        if (arity.NIL != forts.fort_p(relation)) {
            return arity_lookup(relation);
        }
        if (arity.NIL != obsolete.reifiable_natP(relation, Symbols.symbol_function((SubLObject)arity.$sym3$CYC_VAR_), mt_vars.$anect_mt$.getGlobalValue())) {
            return arity(narts_high.find_nart(relation));
        }
        if (arity.NIL != el_utilities.kappa_predicate_p(relation)) {
            return el_utilities.kappa_predicate_arity(relation);
        }
        if (arity.NIL != el_utilities.lambda_function_p(relation)) {
            return el_utilities.lambda_function_arity(relation);
        }
        return (SubLObject)arity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 1924L)
    public static SubLObject arity_robust(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject first_val = arity(relation);
        final SubLObject second_val = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (arity.NIL == first_val && arity.NIL != narts_high.naut_p(relation)) {
            final SubLObject query_results = ask_utilities.query_template((SubLObject)arity.$sym7$_X, (SubLObject)ConsesLow.listS(arity.$const8$arity, relation, (SubLObject)arity.$list9), arity.$const10$InferencePSC, (SubLObject)arity.$list11);
            return Values.values(query_results.first(), list_utilities.sublisp_boolean(query_results));
        }
        return Values.values(first_val, second_val);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 2323L)
    public static SubLObject initialize_all_arities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = (SubLObject)arity.$str12$Initializing_all_arities___;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            utilities_macros.$progress_notification_count$.bind((SubLObject)arity.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)arity.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)arity.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)arity.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((arity.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : arity.T), thread);
            utilities_macros.noting_progress_preamble(str);
            initialize_arities();
            initialize_min_arities();
            initialize_max_arities();
            utilities_macros.noting_progress_postamble();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)arity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 2512L)
    public static SubLObject initialize_arities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (arity.NIL != arity.$kb_arity_table$.getGlobalValue()) {
            Hashtables.clrhash(arity.$kb_arity_table$.getGlobalValue());
        }
        else {
            initialize_arity_table();
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)arity.$sym13$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(arity.$const14$EverythingPSC, thread);
            final SubLObject pred_var = arity.$const8$arity;
            if (arity.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject pred_var_$1 = arity.$const8$arity;
                if (arity.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var_$1)) {
                    final SubLObject str = (SubLObject)arity.NIL;
                    final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)arity.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)arity.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)arity.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)arity.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((arity.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : arity.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var_$1);
                        SubLObject done_var = (SubLObject)arity.NIL;
                        final SubLObject token_var = (SubLObject)arity.NIL;
                        while (arity.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (arity.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)arity.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)arity.$kw15$GAF, (SubLObject)arity.$kw16$TRUE, (SubLObject)arity.NIL);
                                    SubLObject done_var_$4 = (SubLObject)arity.NIL;
                                    final SubLObject token_var_$5 = (SubLObject)arity.NIL;
                                    while (arity.NIL == done_var_$4) {
                                        final SubLObject assertion_var = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(assertion_var));
                                        if (arity.NIL != valid_$6) {
                                            final SubLObject formula = assertions_high.gaf_formula(assertion_var);
                                            initialize_arity_from_formula(formula);
                                        }
                                        done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(arity.NIL == valid_$6);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)arity.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (arity.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(arity.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Hashtables.hash_table_count(arity.$kb_arity_table$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 2824L)
    public static SubLObject initialize_arity_from_formula(final SubLObject formula) {
        final SubLObject relation = cycl_utilities.formula_arg1(formula, (SubLObject)arity.UNPROVIDED);
        if (arity.NIL != forts.fort_p(relation)) {
            final SubLObject v_arity = cycl_utilities.formula_arg2(formula, (SubLObject)arity.UNPROVIDED);
            return initialize_arity_for_relation_guts(relation, v_arity);
        }
        return (SubLObject)arity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 3062L)
    public static SubLObject initialize_arity_from_assertion(final SubLObject assertion) {
        return initialize_arity_from_formula(assertions_high.gaf_formula(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 3188L)
    public static SubLObject initialize_arity_for_relation(final SubLObject relation) {
        final SubLObject v_arity = kb_mapping_utilities.fpred_value_in_any_mt(relation, arity.$const8$arity, (SubLObject)arity.UNPROVIDED, (SubLObject)arity.UNPROVIDED, (SubLObject)arity.UNPROVIDED);
        if (arity.NIL == v_arity) {
            return (SubLObject)arity.NIL;
        }
        return initialize_arity_for_relation_guts(relation, v_arity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 3407L)
    public static SubLObject initialize_arity_for_relation_guts(final SubLObject relation, SubLObject v_arity) {
        v_arity = possibly_simplify_arity(v_arity);
        assert arity.NIL != Types.integerp(v_arity) : v_arity;
        set_arity(relation, v_arity);
        return v_arity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 3663L)
    public static SubLObject possibly_simplify_arity(SubLObject v_arity) {
        if (!v_arity.isInteger() && arity.NIL != kb_control_vars.quant_kb_loaded_p()) {
            v_arity = quantities.cycl_real_number_to_number(v_arity);
        }
        return v_arity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 3876L)
    public static SubLObject maybe_add_arity_for_relation(final SubLObject relation, SubLObject v_arity) {
        v_arity = possibly_simplify_arity(v_arity);
        assert arity.NIL != Types.integerp(v_arity) : v_arity;
        final SubLObject arity_in_table = arity(relation);
        if (arity.NIL != arity_in_table && !arity_in_table.eql(v_arity)) {
            Errors.error((SubLObject)arity.$str18$Trying_to_overload_arity_for__A_f, relation, arity_in_table, v_arity);
        }
        set_arity(relation, v_arity);
        return v_arity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 4267L)
    public static SubLObject maybe_remove_arity_for_relation(final SubLObject relation, final SubLObject v_arity) {
        SubLObject dont_remove = (SubLObject)arity.NIL;
        SubLObject other_arity = (SubLObject)arity.NIL;
        final SubLObject pred_var = arity.$const8$arity;
        if (arity.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, (SubLObject)arity.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, (SubLObject)arity.ONE_INTEGER, pred_var);
            SubLObject done_var = dont_remove;
            final SubLObject token_var = (SubLObject)arity.NIL;
            while (arity.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (arity.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)arity.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)arity.$kw15$GAF, (SubLObject)arity.$kw16$TRUE, (SubLObject)arity.NIL);
                        SubLObject done_var_$8 = dont_remove;
                        final SubLObject token_var_$9 = (SubLObject)arity.NIL;
                        while (arity.NIL == done_var_$8) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$9);
                            final SubLObject valid_$10 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$9.eql(assertion));
                            if (arity.NIL != valid_$10) {
                                final SubLObject asserted_arity = assertions_high.gaf_arg2(assertion);
                                if (v_arity.numE(asserted_arity)) {
                                    dont_remove = kb_accessors.assertion_still_thereP(assertion, (SubLObject)arity.$kw16$TRUE);
                                }
                                else {
                                    other_arity = asserted_arity;
                                }
                            }
                            done_var_$8 = (SubLObject)SubLObjectFactory.makeBoolean(arity.NIL == valid_$10 || arity.NIL != dont_remove);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)arity.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (arity.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(arity.NIL == valid || arity.NIL != dont_remove);
            }
        }
        if (arity.NIL == dont_remove) {
            rem_arity(relation);
        }
        if (arity.NIL != other_arity) {
            set_arity(relation, other_arity);
        }
        return relation;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 4956L)
    public static SubLObject initialize_arity_min_table() {
        arity.$kb_arity_min_table$.setGlobalValue(Hashtables.make_hash_table(cardinality_estimates.instance_cardinality(arity.$const20$VariableArityRelation), arity.$kb_arity_table_equality_test$.getGlobalValue(), (SubLObject)arity.UNPROVIDED));
        return arity.$kb_arity_min_table$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 5169L)
    public static SubLObject arity_min_lookup(final SubLObject relation) {
        assert arity.NIL != forts.fort_p(relation) : relation;
        return Hashtables.gethash_without_values(relation, arity.$kb_arity_min_table$.getGlobalValue(), (SubLObject)arity.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 5310L)
    public static SubLObject set_arity_min(final SubLObject relation, final SubLObject arity_min) {
        assert arity.NIL != forts.fort_p(relation) : relation;
        return Hashtables.sethash(relation, arity.$kb_arity_min_table$.getGlobalValue(), arity_min);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 5452L)
    public static SubLObject rem_arity_min(final SubLObject relation) {
        Hashtables.remhash(relation, arity.$kb_arity_min_table$.getGlobalValue());
        return relation;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 5586L)
    public static SubLObject arity_min(final SubLObject relation) {
        final SubLObject arity_min = arity_min_int(relation);
        return (SubLObject)((arity.NIL != arity_min) ? arity_min : arity.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 5748L)
    public static SubLObject arity_min_int(final SubLObject relation) {
        if (arity.NIL != forts.fort_p(relation)) {
            final SubLObject arity_min_in_table = arity_min_lookup(relation);
            if (arity.NIL != arity_min_in_table) {
                return arity_min_in_table;
            }
            return initialize_arity_min_for_relation(relation);
        }
        else {
            if (arity.NIL != obsolete.reifiable_natP(relation, Symbols.symbol_function((SubLObject)arity.$sym3$CYC_VAR_), mt_vars.$anect_mt$.getGlobalValue())) {
                return arity_min(narts_high.find_nart(relation));
            }
            return (SubLObject)arity.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 6274L)
    public static SubLObject initialize_min_arities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (arity.NIL != arity.$kb_arity_min_table$.getGlobalValue()) {
            Hashtables.clrhash(arity.$kb_arity_min_table$.getGlobalValue());
        }
        else {
            initialize_arity_min_table();
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)arity.$sym13$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(arity.$const14$EverythingPSC, thread);
            final SubLObject pred_var = arity.$const21$arityMin;
            if (arity.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject pred_var_$11 = arity.$const21$arityMin;
                if (arity.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var_$11)) {
                    final SubLObject str = (SubLObject)arity.NIL;
                    final SubLObject _prev_bind_0_$12 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$13 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)arity.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)arity.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)arity.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)arity.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((arity.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : arity.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var_$11);
                        SubLObject done_var = (SubLObject)arity.NIL;
                        final SubLObject token_var = (SubLObject)arity.NIL;
                        while (arity.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (arity.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)arity.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)arity.$kw15$GAF, (SubLObject)arity.$kw16$TRUE, (SubLObject)arity.NIL);
                                    SubLObject done_var_$14 = (SubLObject)arity.NIL;
                                    final SubLObject token_var_$15 = (SubLObject)arity.NIL;
                                    while (arity.NIL == done_var_$14) {
                                        final SubLObject assertion_var = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$15);
                                        final SubLObject valid_$16 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$15.eql(assertion_var));
                                        if (arity.NIL != valid_$16) {
                                            final SubLObject formula = assertions_high.gaf_formula(assertion_var);
                                            initialize_arity_min_from_formula(formula);
                                        }
                                        done_var_$14 = (SubLObject)SubLObjectFactory.makeBoolean(arity.NIL == valid_$16);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)arity.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (arity.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(arity.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$13, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Hashtables.hash_table_count(arity.$kb_arity_min_table$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 6613L)
    public static SubLObject initialize_arity_min_from_formula(final SubLObject formula) {
        final SubLObject relation = cycl_utilities.formula_arg1(formula, (SubLObject)arity.UNPROVIDED);
        if (arity.NIL != forts.fort_p(relation)) {
            final SubLObject arity_min = cycl_utilities.formula_arg2(formula, (SubLObject)arity.UNPROVIDED);
            return initialize_arity_min_for_relation_guts(relation, arity_min);
        }
        return (SubLObject)arity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 6867L)
    public static SubLObject initialize_arity_min_from_assertion(final SubLObject assertion) {
        return initialize_arity_min_from_formula(assertions_high.gaf_formula(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 7001L)
    public static SubLObject initialize_arity_min_for_relation(final SubLObject relation) {
        final SubLObject arity_min = kb_mapping_utilities.fpred_value_in_any_mt(relation, arity.$const21$arityMin, (SubLObject)arity.UNPROVIDED, (SubLObject)arity.UNPROVIDED, (SubLObject)arity.UNPROVIDED);
        if (arity.NIL == arity_min) {
            return (SubLObject)arity.NIL;
        }
        return initialize_arity_min_for_relation_guts(relation, arity_min);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 7243L)
    public static SubLObject initialize_arity_min_for_relation_guts(final SubLObject relation, SubLObject arity_min) {
        arity_min = possibly_simplify_arity(arity_min);
        assert arity.NIL != Types.integerp(arity_min) : arity_min;
        set_arity_min(relation, arity_min);
        return arity_min;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 7531L)
    public static SubLObject maybe_add_arity_min_for_relation(final SubLObject relation, SubLObject arity_min) {
        arity_min = possibly_simplify_arity(arity_min);
        assert arity.NIL != Types.integerp(arity_min) : arity_min;
        final SubLObject arity_min_in_table = arity_min(relation);
        if (arity.NIL != arity_min_in_table && !arity_min_in_table.eql(arity_min)) {
            Errors.error((SubLObject)arity.$str22$Trying_to_overload_arityMin_for__, relation, arity_min_in_table, arity_min);
        }
        set_arity_min(relation, arity_min);
        return arity_min;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 7985L)
    public static SubLObject maybe_remove_arity_min_for_relation(final SubLObject relation) {
        SubLObject dont_remove = (SubLObject)arity.NIL;
        final SubLObject pred_var = arity.$const21$arityMin;
        if (arity.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, (SubLObject)arity.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, (SubLObject)arity.ONE_INTEGER, pred_var);
            SubLObject done_var = dont_remove;
            final SubLObject token_var = (SubLObject)arity.NIL;
            while (arity.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (arity.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)arity.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)arity.$kw15$GAF, (SubLObject)arity.$kw16$TRUE, (SubLObject)arity.NIL);
                        SubLObject done_var_$18 = dont_remove;
                        final SubLObject token_var_$19 = (SubLObject)arity.NIL;
                        while (arity.NIL == done_var_$18) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                            final SubLObject valid_$20 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$19.eql(assertion));
                            if (arity.NIL != valid_$20) {
                                dont_remove = kb_accessors.assertion_still_thereP(assertion, (SubLObject)arity.$kw16$TRUE);
                            }
                            done_var_$18 = (SubLObject)SubLObjectFactory.makeBoolean(arity.NIL == valid_$20 || arity.NIL != dont_remove);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)arity.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (arity.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(arity.NIL == valid || arity.NIL != dont_remove);
            }
        }
        if (arity.NIL == dont_remove) {
            rem_arity_min(relation);
        }
        return relation;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 8322L)
    public static SubLObject min_arity(final SubLObject relation) {
        final SubLObject v_arity = arity(relation);
        if (arity.NIL != v_arity) {
            return v_arity;
        }
        return arity_min(relation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 8709L)
    public static SubLObject initialize_arity_max_table() {
        arity.$kb_arity_max_table$.setGlobalValue(Hashtables.make_hash_table(cardinality_estimates.instance_cardinality(arity.$const20$VariableArityRelation), arity.$kb_arity_table_equality_test$.getGlobalValue(), (SubLObject)arity.UNPROVIDED));
        return arity.$kb_arity_max_table$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 8922L)
    public static SubLObject arity_max_lookup(final SubLObject relation) {
        assert arity.NIL != forts.fort_p(relation) : relation;
        return Hashtables.gethash_without_values(relation, arity.$kb_arity_max_table$.getGlobalValue(), (SubLObject)arity.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 9063L)
    public static SubLObject set_arity_max(final SubLObject relation, final SubLObject arity_max) {
        assert arity.NIL != forts.fort_p(relation) : relation;
        return Hashtables.sethash(relation, arity.$kb_arity_max_table$.getGlobalValue(), arity_max);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 9205L)
    public static SubLObject rem_arity_max(final SubLObject relation) {
        Hashtables.remhash(relation, arity.$kb_arity_max_table$.getGlobalValue());
        return relation;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 9339L)
    public static SubLObject arity_max(final SubLObject relation) {
        if (arity.NIL != forts.fort_p(relation)) {
            final SubLObject arity_max_in_table = arity_max_lookup(relation);
            if (arity.NIL != arity_max_in_table) {
                return arity_max_in_table;
            }
            return initialize_arity_max_for_relation(relation);
        }
        else {
            if (arity.NIL != obsolete.reifiable_natP(relation, Symbols.symbol_function((SubLObject)arity.$sym3$CYC_VAR_), mt_vars.$anect_mt$.getGlobalValue())) {
                return arity_max(narts_high.find_nart(relation));
            }
            return (SubLObject)arity.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 9903L)
    public static SubLObject initialize_max_arities() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (arity.NIL != arity.$kb_arity_max_table$.getGlobalValue()) {
            Hashtables.clrhash(arity.$kb_arity_max_table$.getGlobalValue());
        }
        else {
            initialize_arity_max_table();
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)arity.$sym13$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(arity.$const14$EverythingPSC, thread);
            final SubLObject pred_var = arity.$const25$arityMax;
            if (arity.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject pred_var_$21 = arity.$const25$arityMax;
                if (arity.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var_$21)) {
                    final SubLObject str = (SubLObject)arity.NIL;
                    final SubLObject _prev_bind_0_$22 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$23 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)arity.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)arity.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)arity.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)arity.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((arity.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : arity.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var_$21);
                        SubLObject done_var = (SubLObject)arity.NIL;
                        final SubLObject token_var = (SubLObject)arity.NIL;
                        while (arity.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (arity.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)arity.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)arity.$kw15$GAF, (SubLObject)arity.$kw16$TRUE, (SubLObject)arity.NIL);
                                    SubLObject done_var_$24 = (SubLObject)arity.NIL;
                                    final SubLObject token_var_$25 = (SubLObject)arity.NIL;
                                    while (arity.NIL == done_var_$24) {
                                        final SubLObject assertion_var = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$25);
                                        final SubLObject valid_$26 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$25.eql(assertion_var));
                                        if (arity.NIL != valid_$26) {
                                            final SubLObject formula = assertions_high.gaf_formula(assertion_var);
                                            initialize_arity_max_from_formula(formula);
                                        }
                                        done_var_$24 = (SubLObject)SubLObjectFactory.makeBoolean(arity.NIL == valid_$26);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)arity.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (arity.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(arity.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$23, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$22, thread);
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Hashtables.hash_table_count(arity.$kb_arity_max_table$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 10242L)
    public static SubLObject initialize_arity_max_from_formula(final SubLObject formula) {
        final SubLObject relation = cycl_utilities.formula_arg1(formula, (SubLObject)arity.UNPROVIDED);
        if (arity.NIL != forts.fort_p(relation)) {
            final SubLObject arity_max = cycl_utilities.formula_arg2(formula, (SubLObject)arity.UNPROVIDED);
            return initialize_arity_max_for_relation_guts(relation, arity_max);
        }
        return (SubLObject)arity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 10496L)
    public static SubLObject initialize_arity_max_from_assertion(final SubLObject assertion) {
        return initialize_arity_max_from_formula(assertions_high.gaf_formula(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 10630L)
    public static SubLObject initialize_arity_max_for_relation(final SubLObject relation) {
        final SubLObject arity_max = kb_mapping_utilities.fpred_value_in_any_mt(relation, arity.$const25$arityMax, (SubLObject)arity.UNPROVIDED, (SubLObject)arity.UNPROVIDED, (SubLObject)arity.UNPROVIDED);
        if (arity.NIL == arity_max) {
            return (SubLObject)arity.NIL;
        }
        return initialize_arity_max_for_relation_guts(relation, arity_max);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 10872L)
    public static SubLObject initialize_arity_max_for_relation_guts(final SubLObject relation, SubLObject arity_max) {
        arity_max = possibly_simplify_arity(arity_max);
        assert arity.NIL != Types.integerp(arity_max) : arity_max;
        set_arity_max(relation, arity_max);
        return arity_max;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 11160L)
    public static SubLObject maybe_add_arity_max_for_relation(final SubLObject relation, SubLObject arity_max) {
        arity_max = possibly_simplify_arity(arity_max);
        assert arity.NIL != Types.integerp(arity_max) : arity_max;
        final SubLObject arity_max_in_table = arity_max(relation);
        if (arity.NIL != arity_max_in_table && !arity_max_in_table.eql(arity_max)) {
            Errors.error((SubLObject)arity.$str26$Trying_to_overload_arityMax_for__, relation, arity_max_in_table, arity_max);
        }
        set_arity_max(relation, arity_max);
        return arity_max;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 11614L)
    public static SubLObject maybe_remove_arity_max_for_relation(final SubLObject relation) {
        SubLObject dont_remove = (SubLObject)arity.NIL;
        final SubLObject pred_var = arity.$const25$arityMax;
        if (arity.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, (SubLObject)arity.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, (SubLObject)arity.ONE_INTEGER, pred_var);
            SubLObject done_var = dont_remove;
            final SubLObject token_var = (SubLObject)arity.NIL;
            while (arity.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (arity.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)arity.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)arity.$kw15$GAF, (SubLObject)arity.$kw16$TRUE, (SubLObject)arity.NIL);
                        SubLObject done_var_$28 = dont_remove;
                        final SubLObject token_var_$29 = (SubLObject)arity.NIL;
                        while (arity.NIL == done_var_$28) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$29);
                            final SubLObject valid_$30 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$29.eql(assertion));
                            if (arity.NIL != valid_$30) {
                                dont_remove = kb_accessors.assertion_still_thereP(assertion, (SubLObject)arity.$kw16$TRUE);
                            }
                            done_var_$28 = (SubLObject)SubLObjectFactory.makeBoolean(arity.NIL == valid_$30 || arity.NIL != dont_remove);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)arity.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (arity.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(arity.NIL == valid || arity.NIL != dont_remove);
            }
        }
        if (arity.NIL == dont_remove) {
            rem_arity_max(relation);
        }
        return relation;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 12019L)
    public static SubLObject max_arity(final SubLObject relation) {
        final SubLObject v_arity = arity(relation);
        if (arity.NIL != v_arity) {
            return v_arity;
        }
        return arity_max(relation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 12319L)
    public static SubLObject valid_relation_argnumP(final SubLObject relation, final SubLObject argnum) {
        final SubLObject max_arity = max_arity(relation);
        return (SubLObject)SubLObjectFactory.makeBoolean((arity.NIL == max_arity && arity.NIL != variable_arityP(relation)) || (max_arity.isNumber() && argnum.isNumber() && max_arity.numGE(argnum)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 12583L)
    public static SubLObject arity_admitsP(final SubLObject relation, final SubLObject n) {
        assert arity.NIL != Types.integerp(n) : n;
        final SubLObject v_arity = arity(relation);
        if (v_arity.isInteger()) {
            return Numbers.numE(v_arity, n);
        }
        if (arity.NIL != variable_arityP(relation)) {
            final SubLObject arity_min = arity_min(relation);
            final SubLObject arity_max = arity_max(relation);
            return (SubLObject)SubLObjectFactory.makeBoolean((arity.NIL == arity_min || n.numGE(arity_min)) && (arity.NIL == arity_max || n.numLE(arity_max)));
        }
        return (SubLObject)arity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 13289L)
    public static SubLObject any_arity_admitsP(final SubLObject relations, final SubLObject n) {
        SubLObject cdolist_list_var = relations;
        SubLObject relation = (SubLObject)arity.NIL;
        relation = cdolist_list_var.first();
        while (arity.NIL != cdolist_list_var) {
            if (arity.NIL != arity_admitsP(relation, n)) {
                return (SubLObject)arity.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            relation = cdolist_list_var.first();
        }
        return (SubLObject)arity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 13509L)
    public static SubLObject arity_admitsGE(final SubLObject relation, final SubLObject n) {
        assert arity.NIL != Types.integerp(n) : n;
        final SubLObject v_arity = arity(relation);
        if (v_arity.isInteger()) {
            return Numbers.numGE(v_arity, n);
        }
        if (arity.NIL != variable_arityP(relation)) {
            final SubLObject arity_max = arity_max(relation);
            return (SubLObject)SubLObjectFactory.makeBoolean(arity.NIL == arity_max || n.numLE(arity_max));
        }
        return (SubLObject)arity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 13961L)
    public static SubLObject arity_admitsG(final SubLObject relation, final SubLObject n) {
        assert arity.NIL != Types.integerp(n) : n;
        final SubLObject v_arity = arity(relation);
        if (v_arity.isInteger()) {
            return Numbers.numG(v_arity, n);
        }
        if (arity.NIL != variable_arityP(relation)) {
            final SubLObject arity_max = arity_max(relation);
            return (SubLObject)SubLObjectFactory.makeBoolean(arity.NIL == arity_max || n.numL(arity_max));
        }
        return (SubLObject)arity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 14458L)
    public static SubLObject arity_admitsLE(final SubLObject relation, final SubLObject n) {
        assert arity.NIL != Types.integerp(n) : n;
        final SubLObject v_arity = arity(relation);
        if (v_arity.isInteger()) {
            return Numbers.numLE(v_arity, n);
        }
        if (arity.NIL != variable_arityP(relation)) {
            final SubLObject arity_min = arity_min(relation);
            return (SubLObject)SubLObjectFactory.makeBoolean(arity.NIL == arity_min || n.numGE(arity_min));
        }
        return (SubLObject)arity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 15016L)
    public static SubLObject arity_admitsL(final SubLObject relation, final SubLObject n) {
        assert arity.NIL != Types.integerp(n) : n;
        final SubLObject v_arity = arity(relation);
        if (v_arity.isInteger()) {
            return Numbers.numL(v_arity, n);
        }
        if (arity.NIL != variable_arityP(relation)) {
            final SubLObject arity_min = arity_min(relation);
            return (SubLObject)SubLObjectFactory.makeBoolean(arity.NIL == arity_min || n.numG(arity_min));
        }
        return (SubLObject)arity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 15622L)
    public static SubLObject binaryP(final SubLObject relation) {
        return Equality.eql(arity(relation), (SubLObject)arity.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 15746L)
    public static SubLObject binary_arg_swap(final SubLObject arg) {
        if (arg.eql((SubLObject)arity.ONE_INTEGER)) {
            return (SubLObject)arity.TWO_INTEGER;
        }
        if (arg.eql((SubLObject)arity.TWO_INTEGER)) {
            return (SubLObject)arity.ONE_INTEGER;
        }
        return arg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 15850L)
    public static SubLObject logical_operator_arity(final SubLObject v_object) {
        if (arity.NIL != el_utilities.cyc_const_unary_logical_op_p(v_object)) {
            return (SubLObject)arity.ONE_INTEGER;
        }
        if (arity.NIL != el_utilities.cyc_const_binary_logical_op_p(v_object)) {
            return (SubLObject)arity.TWO_INTEGER;
        }
        if (arity.NIL != el_utilities.cyc_const_ternary_logical_op_p(v_object)) {
            return (SubLObject)arity.THREE_INTEGER;
        }
        if (arity.NIL != el_utilities.cyc_const_quaternary_logical_op_p(v_object)) {
            return (SubLObject)arity.FOUR_INTEGER;
        }
        if (arity.NIL != el_utilities.cyc_const_quintary_logical_op_p(v_object)) {
            return (SubLObject)arity.FIVE_INTEGER;
        }
        return (SubLObject)arity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 16335L)
    public static SubLObject variable_arityP(final SubLObject relation) {
        return fort_types_interface.isa_variable_arity_relationP(relation, mt_vars.$anect_mt$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 16438L)
    public static SubLObject relation_arity_constraint_sentences(final SubLObject relation) {
        assert arity.NIL != fort_types_interface.relation_p(relation) : relation;
        if (arity.NIL != fort_types_interface.variable_arity_relation_p(relation)) {
            final SubLObject max_arity = max_arity(relation);
            final SubLObject min_arity = min_arity(relation);
            SubLObject arity_constraints = (SubLObject)arity.NIL;
            arity_constraints = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(arity.$const21$arityMin, relation, min_arity), arity_constraints);
            if (arity.NIL != max_arity) {
                arity_constraints = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(arity.$const25$arityMax, relation, max_arity), arity_constraints);
            }
            return Sequences.nreverse(arity_constraints);
        }
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(arity.$const8$arity, relation, arity(relation)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 17157L)
    public static SubLObject arity_cache_unbuiltP() {
        return Types.sublisp_null(arity.$kb_arity_table$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 17288L)
    public static SubLObject rebuild_arity_cache() {
        return initialize_all_arities();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 17364L)
    public static SubLObject dump_arity_cache_to_stream(final SubLObject stream) {
        cfasl.cfasl_output(arity.$kb_arity_table$.getGlobalValue(), stream);
        cfasl.cfasl_output(arity.$kb_arity_min_table$.getGlobalValue(), stream);
        cfasl.cfasl_output(arity.$kb_arity_max_table$.getGlobalValue(), stream);
        cfasl.cfasl_output((SubLObject)arity.NIL, stream);
        return (SubLObject)arity.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/arity.lisp", position = 17624L)
    public static SubLObject load_arity_cache_from_stream(final SubLObject stream) {
        SubLObject dummy = (SubLObject)arity.NIL;
        arity.$kb_arity_table$.setGlobalValue(cfasl.cfasl_input(stream, (SubLObject)arity.UNPROVIDED, (SubLObject)arity.UNPROVIDED));
        arity.$kb_arity_min_table$.setGlobalValue(cfasl.cfasl_input(stream, (SubLObject)arity.UNPROVIDED, (SubLObject)arity.UNPROVIDED));
        arity.$kb_arity_max_table$.setGlobalValue(cfasl.cfasl_input(stream, (SubLObject)arity.UNPROVIDED, (SubLObject)arity.UNPROVIDED));
        dummy = cfasl.cfasl_input(stream, (SubLObject)arity.UNPROVIDED, (SubLObject)arity.UNPROVIDED);
        return (SubLObject)arity.NIL;
    }
    
    public static SubLObject declare_arity_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_arity_table", "INITIALIZE-ARITY-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "arity_lookup", "ARITY-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "set_arity", "SET-ARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "rem_arity", "REM-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "arity", "ARITY", 1, 0, false);
        new $arity$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "arity_robust", "ARITY-ROBUST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_all_arities", "INITIALIZE-ALL-ARITIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_arities", "INITIALIZE-ARITIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_arity_from_formula", "INITIALIZE-ARITY-FROM-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_arity_from_assertion", "INITIALIZE-ARITY-FROM-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_arity_for_relation", "INITIALIZE-ARITY-FOR-RELATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_arity_for_relation_guts", "INITIALIZE-ARITY-FOR-RELATION-GUTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "possibly_simplify_arity", "POSSIBLY-SIMPLIFY-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "maybe_add_arity_for_relation", "MAYBE-ADD-ARITY-FOR-RELATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "maybe_remove_arity_for_relation", "MAYBE-REMOVE-ARITY-FOR-RELATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_arity_min_table", "INITIALIZE-ARITY-MIN-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "arity_min_lookup", "ARITY-MIN-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "set_arity_min", "SET-ARITY-MIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "rem_arity_min", "REM-ARITY-MIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "arity_min", "ARITY-MIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "arity_min_int", "ARITY-MIN-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_min_arities", "INITIALIZE-MIN-ARITIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_arity_min_from_formula", "INITIALIZE-ARITY-MIN-FROM-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_arity_min_from_assertion", "INITIALIZE-ARITY-MIN-FROM-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_arity_min_for_relation", "INITIALIZE-ARITY-MIN-FOR-RELATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_arity_min_for_relation_guts", "INITIALIZE-ARITY-MIN-FOR-RELATION-GUTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "maybe_add_arity_min_for_relation", "MAYBE-ADD-ARITY-MIN-FOR-RELATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "maybe_remove_arity_min_for_relation", "MAYBE-REMOVE-ARITY-MIN-FOR-RELATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "min_arity", "MIN-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_arity_max_table", "INITIALIZE-ARITY-MAX-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "arity_max_lookup", "ARITY-MAX-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "set_arity_max", "SET-ARITY-MAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "rem_arity_max", "REM-ARITY-MAX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "arity_max", "ARITY-MAX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_max_arities", "INITIALIZE-MAX-ARITIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_arity_max_from_formula", "INITIALIZE-ARITY-MAX-FROM-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_arity_max_from_assertion", "INITIALIZE-ARITY-MAX-FROM-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_arity_max_for_relation", "INITIALIZE-ARITY-MAX-FOR-RELATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "initialize_arity_max_for_relation_guts", "INITIALIZE-ARITY-MAX-FOR-RELATION-GUTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "maybe_add_arity_max_for_relation", "MAYBE-ADD-ARITY-MAX-FOR-RELATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "maybe_remove_arity_max_for_relation", "MAYBE-REMOVE-ARITY-MAX-FOR-RELATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "max_arity", "MAX-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "valid_relation_argnumP", "VALID-RELATION-ARGNUM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "arity_admitsP", "ARITY-ADMITS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "any_arity_admitsP", "ANY-ARITY-ADMITS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "arity_admitsGE", "ARITY-ADMITS>=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "arity_admitsG", "ARITY-ADMITS>", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "arity_admitsLE", "ARITY-ADMITS<=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "arity_admitsL", "ARITY-ADMITS<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "binaryP", "BINARY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "binary_arg_swap", "BINARY-ARG-SWAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "logical_operator_arity", "LOGICAL-OPERATOR-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "variable_arityP", "VARIABLE-ARITY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "relation_arity_constraint_sentences", "RELATION-ARITY-CONSTRAINT-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "arity_cache_unbuiltP", "ARITY-CACHE-UNBUILT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "rebuild_arity_cache", "REBUILD-ARITY-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "dump_arity_cache_to_stream", "DUMP-ARITY-CACHE-TO-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.arity", "load_arity_cache_from_stream", "LOAD-ARITY-CACHE-FROM-STREAM", 1, 0, false);
        return (SubLObject)arity.NIL;
    }
    
    public static SubLObject init_arity_file() {
        arity.$kb_arity_table_equality_test$ = SubLFiles.deflexical("*KB-ARITY-TABLE-EQUALITY-TEST*", Symbols.symbol_function((SubLObject)arity.EQL));
        arity.$kb_arity_table$ = SubLFiles.deflexical("*KB-ARITY-TABLE*", (SubLObject)(maybeDefault((SubLObject)arity.$sym0$_KB_ARITY_TABLE_, arity.$kb_arity_table$, arity.NIL)));
        arity.$kb_arity_min_table$ = SubLFiles.deflexical("*KB-ARITY-MIN-TABLE*", (SubLObject)(maybeDefault((SubLObject)arity.$sym19$_KB_ARITY_MIN_TABLE_, arity.$kb_arity_min_table$, arity.NIL)));
        arity.$kb_arity_max_table$ = SubLFiles.deflexical("*KB-ARITY-MAX-TABLE*", (SubLObject)(maybeDefault((SubLObject)arity.$sym24$_KB_ARITY_MAX_TABLE_, arity.$kb_arity_max_table$, arity.NIL)));
        return (SubLObject)arity.NIL;
    }
    
    public static SubLObject setup_arity_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)arity.$sym0$_KB_ARITY_TABLE_);
        utilities_macros.register_cyc_api_function((SubLObject)arity.$sym4$ARITY, (SubLObject)arity.$list5, (SubLObject)arity.$str6$Return_the_arity_for_relation_con, (SubLObject)arity.NIL, (SubLObject)arity.NIL);
        subl_macro_promotions.declare_defglobal((SubLObject)arity.$sym19$_KB_ARITY_MIN_TABLE_);
        access_macros.register_external_symbol((SubLObject)arity.$sym23$MIN_ARITY);
        subl_macro_promotions.declare_defglobal((SubLObject)arity.$sym24$_KB_ARITY_MAX_TABLE_);
        access_macros.register_external_symbol((SubLObject)arity.$sym27$MAX_ARITY);
        generic_testing.define_test_case_table_int((SubLObject)arity.$sym29$ARITY_ADMITS_, (SubLObject)ConsesLow.list(new SubLObject[] { arity.$kw30$TEST, arity.NIL, arity.$kw31$OWNER, arity.NIL, arity.$kw32$CLASSES, arity.NIL, arity.$kw33$KB, arity.$kw34$TINY, arity.$kw35$WORKING_, arity.T }), (SubLObject)arity.$list36);
        generic_testing.define_test_case_table_int((SubLObject)arity.$sym37$ARITY_ADMITS__, (SubLObject)ConsesLow.list(new SubLObject[] { arity.$kw30$TEST, arity.NIL, arity.$kw31$OWNER, arity.NIL, arity.$kw32$CLASSES, arity.NIL, arity.$kw33$KB, arity.$kw34$TINY, arity.$kw35$WORKING_, arity.T }), (SubLObject)arity.$list38);
        generic_testing.define_test_case_table_int((SubLObject)arity.$sym39$ARITY_ADMITS_, (SubLObject)ConsesLow.list(new SubLObject[] { arity.$kw30$TEST, arity.NIL, arity.$kw31$OWNER, arity.NIL, arity.$kw32$CLASSES, arity.NIL, arity.$kw33$KB, arity.$kw34$TINY, arity.$kw35$WORKING_, arity.T }), (SubLObject)arity.$list40);
        generic_testing.define_test_case_table_int((SubLObject)arity.$sym41$ARITY_ADMITS__, (SubLObject)ConsesLow.list(new SubLObject[] { arity.$kw30$TEST, arity.NIL, arity.$kw31$OWNER, arity.NIL, arity.$kw32$CLASSES, arity.NIL, arity.$kw33$KB, arity.$kw34$TINY, arity.$kw35$WORKING_, arity.T }), (SubLObject)arity.$list42);
        generic_testing.define_test_case_table_int((SubLObject)arity.$sym43$ARITY_ADMITS_, (SubLObject)ConsesLow.list(new SubLObject[] { arity.$kw30$TEST, arity.NIL, arity.$kw31$OWNER, arity.NIL, arity.$kw32$CLASSES, arity.NIL, arity.$kw33$KB, arity.$kw34$TINY, arity.$kw35$WORKING_, arity.T }), (SubLObject)arity.$list44);
        generic_testing.define_test_case_table_int((SubLObject)arity.$sym45$RELATION_ARITY_CONSTRAINT_SENTENCES, (SubLObject)ConsesLow.list(new SubLObject[] { arity.$kw30$TEST, arity.NIL, arity.$kw31$OWNER, arity.NIL, arity.$kw32$CLASSES, arity.NIL, arity.$kw33$KB, arity.$kw46$FULL, arity.$kw35$WORKING_, arity.T }), (SubLObject)arity.$list47);
        return (SubLObject)arity.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_arity_file();
    }
    
    @Override
	public void initializeVariables() {
        init_arity_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_arity_file();
    }
    
    static {
        me = (SubLFile)new arity();
        arity.$kb_arity_table_equality_test$ = null;
        arity.$kb_arity_table$ = null;
        arity.$kb_arity_min_table$ = null;
        arity.$kb_arity_max_table$ = null;
        $sym0$_KB_ARITY_TABLE_ = SubLObjectFactory.makeSymbol("*KB-ARITY-TABLE*");
        $const1$Relation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation"));
        $sym2$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym3$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $sym4$ARITY = SubLObjectFactory.makeSymbol("ARITY");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELATION"));
        $str6$Return_the_arity_for_relation_con = SubLObjectFactory.makeString("Return the arity for relation constant RELATION.");
        $sym7$_X = SubLObjectFactory.makeSymbol("?X");
        $const8$arity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arity"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"));
        $const10$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), (SubLObject)arity.NIL);
        $str12$Initializing_all_arities___ = SubLObjectFactory.makeString("Initializing all arities...");
        $sym13$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const14$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw15$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw16$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym17$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str18$Trying_to_overload_arity_for__A_f = SubLObjectFactory.makeString("Trying to overload arity for ~A from ~A to ~A");
        $sym19$_KB_ARITY_MIN_TABLE_ = SubLObjectFactory.makeSymbol("*KB-ARITY-MIN-TABLE*");
        $const20$VariableArityRelation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VariableArityRelation"));
        $const21$arityMin = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMin"));
        $str22$Trying_to_overload_arityMin_for__ = SubLObjectFactory.makeString("Trying to overload arityMin for ~A from ~A to ~A");
        $sym23$MIN_ARITY = SubLObjectFactory.makeSymbol("MIN-ARITY");
        $sym24$_KB_ARITY_MAX_TABLE_ = SubLObjectFactory.makeSymbol("*KB-ARITY-MAX-TABLE*");
        $const25$arityMax = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMax"));
        $str26$Trying_to_overload_arityMax_for__ = SubLObjectFactory.makeString("Trying to overload arityMax for ~A from ~A to ~A");
        $sym27$MAX_ARITY = SubLObjectFactory.makeSymbol("MAX-ARITY");
        $sym28$RELATION_P = SubLObjectFactory.makeSymbol("RELATION-P");
        $sym29$ARITY_ADMITS_ = SubLObjectFactory.makeSymbol("ARITY-ADMITS?");
        $kw30$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw31$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw32$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw33$KB = SubLObjectFactory.makeKeyword("KB");
        $kw34$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw35$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list36 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("commutativeInArgs")), (SubLObject)arity.TWO_INTEGER), (SubLObject)arity.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("commutativeInArgs")), (SubLObject)arity.THREE_INTEGER), (SubLObject)arity.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("commutativeInArgs")), (SubLObject)arity.FOUR_INTEGER), (SubLObject)arity.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("commutativeInArgs")), (SubLObject)arity.FIVE_INTEGER), (SubLObject)arity.T));
        $sym37$ARITY_ADMITS__ = SubLObjectFactory.makeSymbol("ARITY-ADMITS>=");
        $list38 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("commutativeInArgs")), (SubLObject)SubLObjectFactory.makeInteger(212)), (SubLObject)arity.T));
        $sym39$ARITY_ADMITS_ = SubLObjectFactory.makeSymbol("ARITY-ADMITS>");
        $list40 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("commutativeInArgs")), (SubLObject)arity.ONE_INTEGER), (SubLObject)arity.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("commutativeInArgs")), (SubLObject)arity.SEVEN_INTEGER), (SubLObject)arity.T));
        $sym41$ARITY_ADMITS__ = SubLObjectFactory.makeSymbol("ARITY-ADMITS<=");
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("commutativeInArgs")), (SubLObject)arity.THREE_INTEGER), (SubLObject)arity.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("commutativeInArgs")), (SubLObject)arity.FOUR_INTEGER), (SubLObject)arity.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("commutativeInArgs")), (SubLObject)arity.TWO_INTEGER), (SubLObject)arity.NIL));
        $sym43$ARITY_ADMITS_ = SubLObjectFactory.makeSymbol("ARITY-ADMITS<");
        $list44 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("commutativeInArgs")), (SubLObject)arity.SEVEN_INTEGER), (SubLObject)arity.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("commutativeInArgs")), (SubLObject)arity.ONE_INTEGER), (SubLObject)arity.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("commutativeInArgs")), (SubLObject)arity.FOUR_INTEGER), (SubLObject)arity.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("commutativeInArgs")), (SubLObject)arity.THREE_INTEGER), (SubLObject)arity.NIL));
        $sym45$RELATION_ARITY_CONSTRAINT_SENTENCES = SubLObjectFactory.makeSymbol("RELATION-ARITY-CONSTRAINT-SENTENCES");
        $kw46$FULL = SubLObjectFactory.makeKeyword("FULL");
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arity")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)arity.TWO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMin")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different")), (SubLObject)arity.TWO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Percent"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMin")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Percent")), (SubLObject)arity.ONE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMax")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Percent")), (SubLObject)arity.TWO_INTEGER))));
    }
    
    public static final class $arity$UnaryFunction extends UnaryFunction
    {
        public $arity$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ARITY"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return arity.arity(arg1);
        }
    }
}

/*

	Total time: 636 ms
	
*/