package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rule_after_adding extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.rule_after_adding";
    public static final String myFingerPrint = "0e7a823bd51bc74ba604db023a0bda43ca065e6a6a3b66988f6ceb31f65372a5";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 756L)
    public static SubLSymbol $rule_after_adding_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 959L)
    private static SubLSymbol $rule_after_addings_hash$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 1073L)
    private static SubLSymbol $rule_after_removings_hash$;
    private static final SubLSymbol $sym0$_RULE_AFTER_ADDINGS_HASH_;
    private static final SubLSymbol $sym1$_RULE_AFTER_REMOVINGS_HASH_;
    private static final SubLSymbol $sym2$ARGUMENT_P;
    private static final SubLSymbol $sym3$ASSERTION_P;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym6$IGNORE_ERRORS_HANDLER;
    private static final SubLInteger $int7$100;
    private static final SubLSymbol $sym8$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const9$EverythingPSC;
    private static final SubLObject $const10$ruleAfterAdding;
    private static final SubLSymbol $kw11$GAF;
    private static final SubLList $list12;
    private static final SubLObject $const13$ruleAfterRemoving;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$FORT_P;
    private static final SubLSymbol $kw16$TRUE;
    private static final SubLSymbol $sym17$PROPAGATE_RULE_AFTER_ADDING;
    private static final SubLSymbol $sym18$SYMBOLP;
    private static final SubLSymbol $sym19$HLMT_P;
    private static final SubLSymbol $sym20$RELEVANT_MT_IS_SPEC_MT;
    private static final SubLSymbol $kw21$RULE;
    private static final SubLSymbol $sym22$RELEVANT_MT_IS_GENL_MT;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 1137L)
    public static SubLObject clear_rule_after_addings() {
        if (rule_after_adding.NIL != rule_after_adding.$rule_after_addings_hash$.getGlobalValue()) {
            Hashtables.clrhash(rule_after_adding.$rule_after_addings_hash$.getGlobalValue());
        }
        return (SubLObject)rule_after_adding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 1310L)
    public static SubLObject clear_rule_after_removings() {
        if (rule_after_adding.NIL != rule_after_adding.$rule_after_removings_hash$.getGlobalValue()) {
            Hashtables.clrhash(rule_after_adding.$rule_after_removings_hash$.getGlobalValue());
        }
        return (SubLObject)rule_after_adding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 1452L)
    public static SubLObject handle_rule_after_addings(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rule_after_adding.NIL != arguments.argument_p(argument) : argument;
        assert rule_after_adding.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (rule_after_adding.NIL == after_adding.$after_addings_disabledP$.getDynamicValue(thread) && rule_after_adding.NIL != assertions_high.rule_assertionP(assertion)) {
            final SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf);
            SubLObject literal = (SubLObject)rule_after_adding.NIL;
            literal = cdolist_list_var.first();
            while (rule_after_adding.NIL != cdolist_list_var) {
                handle_rule_after_addings_int(argument, literal, assertion);
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            }
            cdolist_list_var = clauses.pos_lits(cnf);
            literal = (SubLObject)rule_after_adding.NIL;
            literal = cdolist_list_var.first();
            while (rule_after_adding.NIL != cdolist_list_var) {
                handle_rule_after_addings_int(argument, literal, assertion);
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            }
        }
        return (SubLObject)rule_after_adding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 1958L)
    public static SubLObject handle_rule_after_addings_int(final SubLObject argument, final SubLObject literal, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = el_utilities.literal_arg(literal, (SubLObject)rule_after_adding.ZERO_INTEGER, (SubLObject)rule_after_adding.UNPROVIDED);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        if (rule_after_adding.NIL != forts.fort_p(pred)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var = get_rule_after_addings(pred);
                SubLObject info = (SubLObject)rule_after_adding.NIL;
                info = cdolist_list_var.first();
                while (rule_after_adding.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = info;
                    SubLObject fun = (SubLObject)rule_after_adding.NIL;
                    SubLObject fun_mt = (SubLObject)rule_after_adding.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_after_adding.$list4);
                    fun = current.first();
                    current = (fun_mt = current.rest());
                    if (fun.isFunctionSpec() && rule_after_adding.NIL != mt_relevance_macros.relevant_mtP(fun_mt)) {
                        SubLObject ignore_errors_tag = (SubLObject)rule_after_adding.NIL;
                        try {
                            thread.throwStack.push(rule_after_adding.$kw5$IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rule_after_adding.$sym6$IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    handle_rule_after_adding(fun, argument, literal, assertion);
                                }
                                catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, (SubLObject)rule_after_adding.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rule_after_adding.$kw5$IGNORE_ERRORS_TARGET);
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    info = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)rule_after_adding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 2471L)
    public static SubLObject handle_rule_after_removings(final SubLObject argument, final SubLObject assertion) {
        assert rule_after_adding.NIL != arguments.argument_p(argument) : argument;
        assert rule_after_adding.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (rule_after_adding.NIL != assertions_high.rule_assertionP(assertion)) {
            final SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject cdolist_list_var = clauses.neg_lits(cnf);
            SubLObject literal = (SubLObject)rule_after_adding.NIL;
            literal = cdolist_list_var.first();
            while (rule_after_adding.NIL != cdolist_list_var) {
                handle_rule_after_removings_int(argument, literal, assertion);
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            }
            cdolist_list_var = clauses.pos_lits(cnf);
            literal = (SubLObject)rule_after_adding.NIL;
            literal = cdolist_list_var.first();
            while (rule_after_adding.NIL != cdolist_list_var) {
                handle_rule_after_removings_int(argument, literal, assertion);
                cdolist_list_var = cdolist_list_var.rest();
                literal = cdolist_list_var.first();
            }
        }
        return (SubLObject)rule_after_adding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 2904L)
    public static SubLObject handle_rule_after_removings_int(final SubLObject argument, final SubLObject literal, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = el_utilities.literal_arg(assertion, (SubLObject)rule_after_adding.ZERO_INTEGER, (SubLObject)rule_after_adding.UNPROVIDED);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        if (rule_after_adding.NIL != forts.fort_p(pred)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var = get_rule_after_removings(pred);
                SubLObject info = (SubLObject)rule_after_adding.NIL;
                info = cdolist_list_var.first();
                while (rule_after_adding.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = info;
                    SubLObject fun = (SubLObject)rule_after_adding.NIL;
                    SubLObject fun_mt = (SubLObject)rule_after_adding.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_after_adding.$list4);
                    fun = current.first();
                    current = (fun_mt = current.rest());
                    if (fun.isFunctionSpec() && rule_after_adding.NIL != mt_relevance_macros.relevant_mtP(fun_mt)) {
                        SubLObject ignore_errors_tag = (SubLObject)rule_after_adding.NIL;
                        try {
                            thread.throwStack.push(rule_after_adding.$kw5$IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rule_after_adding.$sym6$IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    handle_rule_after_removing(fun, argument, literal, assertion);
                                }
                                catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, (SubLObject)rule_after_adding.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rule_after_adding.$kw5$IGNORE_ERRORS_TARGET);
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    info = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)rule_after_adding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 3431L)
    public static SubLObject get_rule_after_addings(final SubLObject pred) {
        if (rule_after_adding.NIL == rule_after_adding.$rule_after_addings_hash$.getGlobalValue()) {
            initialize_rule_after_addings_hash();
        }
        return Hashtables.gethash_without_values(pred, rule_after_adding.$rule_after_addings_hash$.getGlobalValue(), (SubLObject)rule_after_adding.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 3640L)
    public static SubLObject get_rule_after_removings(final SubLObject pred) {
        if (rule_after_adding.NIL == rule_after_adding.$rule_after_removings_hash$.getGlobalValue()) {
            initialize_rule_after_removings_hash();
        }
        return Hashtables.gethash_without_values(pred, rule_after_adding.$rule_after_removings_hash$.getGlobalValue(), (SubLObject)rule_after_adding.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 3843L)
    public static SubLObject handle_rule_after_adding(final SubLObject function, final SubLObject argument, final SubLObject literal, final SubLObject assertion) {
        SubLObject release = (SubLObject)rule_after_adding.NIL;
        try {
            release = Locks.seize_lock(control_vars.$hl_lock$.getGlobalValue());
            Functions.funcall(function, argument, literal, assertion);
        }
        finally {
            if (rule_after_adding.NIL != release) {
                Locks.release_lock(control_vars.$hl_lock$.getGlobalValue());
            }
        }
        return (SubLObject)rule_after_adding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 4013L)
    public static SubLObject handle_rule_after_removing(final SubLObject function, final SubLObject argument, final SubLObject literal, final SubLObject assertion) {
        SubLObject release = (SubLObject)rule_after_adding.NIL;
        try {
            release = Locks.seize_lock(control_vars.$hl_lock$.getGlobalValue());
            Functions.funcall(function, argument, literal, assertion);
        }
        finally {
            if (rule_after_adding.NIL != release) {
                Locks.release_lock(control_vars.$hl_lock$.getGlobalValue());
            }
        }
        return (SubLObject)rule_after_adding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 4185L)
    public static SubLObject rebuild_rule_after_adding_caches() {
        initialize_rule_after_addings_hash();
        initialize_rule_after_removings_hash();
        return (SubLObject)rule_after_adding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 4389L)
    public static SubLObject initialize_rule_after_addings_hash() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rule_after_adding.NIL != rule_after_adding.$rule_after_addings_hash$.getGlobalValue()) {
            Hashtables.clrhash(rule_after_adding.$rule_after_addings_hash$.getGlobalValue());
        }
        else {
            rule_after_adding.$rule_after_addings_hash$.setGlobalValue(Hashtables.make_hash_table((SubLObject)rule_after_adding.$int7$100, (SubLObject)rule_after_adding.UNPROVIDED, (SubLObject)rule_after_adding.UNPROVIDED));
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rule_after_adding.$sym8$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rule_after_adding.$const9$EverythingPSC, thread);
            final SubLObject pred_var = rule_after_adding.$const10$ruleAfterAdding;
            if (rule_after_adding.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)rule_after_adding.NIL;
                final SubLObject _prev_bind_0_$3 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$4 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                    utilities_macros.$progress_notification_count$.bind((SubLObject)rule_after_adding.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)rule_after_adding.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)rule_after_adding.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)rule_after_adding.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((rule_after_adding.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : rule_after_adding.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)rule_after_adding.NIL;
                    final SubLObject token_var = (SubLObject)rule_after_adding.NIL;
                    while (rule_after_adding.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (rule_after_adding.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)rule_after_adding.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rule_after_adding.$kw11$GAF, (SubLObject)rule_after_adding.NIL, (SubLObject)rule_after_adding.NIL);
                                SubLObject done_var_$5 = (SubLObject)rule_after_adding.NIL;
                                final SubLObject token_var_$6 = (SubLObject)rule_after_adding.NIL;
                                while (rule_after_adding.NIL == done_var_$5) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                    final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(ass));
                                    if (rule_after_adding.NIL != valid_$7) {
                                        final SubLObject formula = assertions_high.gaf_formula(ass);
                                        SubLObject current;
                                        final SubLObject datum = current = formula;
                                        SubLObject rule_after_adding_pred = (SubLObject)rule_after_adding.NIL;
                                        SubLObject pred = (SubLObject)rule_after_adding.NIL;
                                        SubLObject v_rule_after_adding = (SubLObject)rule_after_adding.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_after_adding.$list12);
                                        rule_after_adding_pred = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_after_adding.$list12);
                                        pred = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_after_adding.$list12);
                                        v_rule_after_adding = current.first();
                                        current = current.rest();
                                        if (rule_after_adding.NIL == current) {
                                            if (rule_after_adding.NIL != forts.valid_fortP(pred)) {
                                                v_rule_after_adding = el_utilities.cycl_subl_symbol_symbol(v_rule_after_adding);
                                                final SubLObject item_var = (SubLObject)ConsesLow.cons(v_rule_after_adding, assertions_high.assertion_mt(ass));
                                                if (rule_after_adding.NIL == conses_high.member(item_var, Hashtables.gethash(pred, rule_after_adding.$rule_after_addings_hash$.getGlobalValue(), (SubLObject)rule_after_adding.UNPROVIDED), Symbols.symbol_function((SubLObject)rule_after_adding.EQL), Symbols.symbol_function((SubLObject)rule_after_adding.IDENTITY))) {
                                                    Hashtables.sethash(pred, rule_after_adding.$rule_after_addings_hash$.getGlobalValue(), (SubLObject)ConsesLow.cons(item_var, Hashtables.gethash(pred, rule_after_adding.$rule_after_addings_hash$.getGlobalValue(), (SubLObject)rule_after_adding.UNPROVIDED)));
                                                }
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rule_after_adding.$list12);
                                        }
                                    }
                                    done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(rule_after_adding.NIL == valid_$7);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_after_adding.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (rule_after_adding.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(rule_after_adding.NIL == valid);
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
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$4, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)rule_after_adding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 5056L)
    public static SubLObject initialize_rule_after_removings_hash() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!rule_after_adding.$rule_after_removings_hash$.getGlobalValue().isHashtable()) {
            rule_after_adding.$rule_after_removings_hash$.setGlobalValue(Hashtables.make_hash_table((SubLObject)rule_after_adding.$int7$100, (SubLObject)rule_after_adding.UNPROVIDED, (SubLObject)rule_after_adding.UNPROVIDED));
        }
        else {
            Hashtables.clrhash(rule_after_adding.$rule_after_removings_hash$.getGlobalValue());
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rule_after_adding.$sym8$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rule_after_adding.$const9$EverythingPSC, thread);
            final SubLObject pred_var = rule_after_adding.$const13$ruleAfterRemoving;
            if (rule_after_adding.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)rule_after_adding.NIL;
                final SubLObject _prev_bind_0_$9 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$10 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                    utilities_macros.$progress_notification_count$.bind((SubLObject)rule_after_adding.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)rule_after_adding.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)rule_after_adding.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)rule_after_adding.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((rule_after_adding.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : rule_after_adding.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)rule_after_adding.NIL;
                    final SubLObject token_var = (SubLObject)rule_after_adding.NIL;
                    while (rule_after_adding.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (rule_after_adding.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)rule_after_adding.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rule_after_adding.$kw11$GAF, (SubLObject)rule_after_adding.NIL, (SubLObject)rule_after_adding.NIL);
                                SubLObject done_var_$11 = (SubLObject)rule_after_adding.NIL;
                                final SubLObject token_var_$12 = (SubLObject)rule_after_adding.NIL;
                                while (rule_after_adding.NIL == done_var_$11) {
                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$12);
                                    final SubLObject valid_$13 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$12.eql(ass));
                                    if (rule_after_adding.NIL != valid_$13) {
                                        final SubLObject formula = assertions_high.gaf_formula(ass);
                                        SubLObject current;
                                        final SubLObject datum = current = formula;
                                        SubLObject rule_after_removing_pred = (SubLObject)rule_after_adding.NIL;
                                        SubLObject pred = (SubLObject)rule_after_adding.NIL;
                                        SubLObject rule_after_removing = (SubLObject)rule_after_adding.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_after_adding.$list14);
                                        rule_after_removing_pred = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_after_adding.$list14);
                                        pred = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_after_adding.$list14);
                                        rule_after_removing = current.first();
                                        current = current.rest();
                                        if (rule_after_adding.NIL == current) {
                                            if (rule_after_adding.NIL != forts.valid_fortP(pred)) {
                                                rule_after_removing = el_utilities.cycl_subl_symbol_symbol(rule_after_removing);
                                                final SubLObject item_var = (SubLObject)ConsesLow.cons(rule_after_removing, assertions_high.assertion_mt(ass));
                                                if (rule_after_adding.NIL == conses_high.member(item_var, Hashtables.gethash(pred, rule_after_adding.$rule_after_removings_hash$.getGlobalValue(), (SubLObject)rule_after_adding.UNPROVIDED), Symbols.symbol_function((SubLObject)rule_after_adding.EQL), Symbols.symbol_function((SubLObject)rule_after_adding.IDENTITY))) {
                                                    Hashtables.sethash(pred, rule_after_adding.$rule_after_removings_hash$.getGlobalValue(), (SubLObject)ConsesLow.cons(item_var, Hashtables.gethash(pred, rule_after_adding.$rule_after_removings_hash$.getGlobalValue(), (SubLObject)rule_after_adding.UNPROVIDED)));
                                                }
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rule_after_adding.$list14);
                                        }
                                    }
                                    done_var_$11 = (SubLObject)SubLObjectFactory.makeBoolean(rule_after_adding.NIL == valid_$13);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_after_adding.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (rule_after_adding.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(rule_after_adding.NIL == valid);
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
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$10, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$9, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)rule_after_adding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 5754L)
    public static SubLObject recache_rule_after_addings(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rule_after_adding.NIL != forts.fort_p(predicate) : predicate;
        if (rule_after_adding.NIL == rule_after_adding.$rule_after_addings_hash$.getGlobalValue()) {
            initialize_rule_after_addings_hash();
        }
        Hashtables.remhash(predicate, rule_after_adding.$rule_after_addings_hash$.getGlobalValue());
        SubLObject ans = (SubLObject)rule_after_adding.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rule_after_adding.$sym8$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rule_after_adding.$const9$EverythingPSC, thread);
            final SubLObject pred_var = rule_after_adding.$const10$ruleAfterAdding;
            if (rule_after_adding.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, (SubLObject)rule_after_adding.NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, (SubLObject)rule_after_adding.NIL, pred_var);
                SubLObject done_var = (SubLObject)rule_after_adding.NIL;
                final SubLObject token_var = (SubLObject)rule_after_adding.NIL;
                while (rule_after_adding.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (rule_after_adding.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)rule_after_adding.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rule_after_adding.$kw11$GAF, (SubLObject)rule_after_adding.NIL, (SubLObject)rule_after_adding.NIL);
                            SubLObject done_var_$15 = (SubLObject)rule_after_adding.NIL;
                            final SubLObject token_var_$16 = (SubLObject)rule_after_adding.NIL;
                            while (rule_after_adding.NIL == done_var_$15) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$16);
                                final SubLObject valid_$17 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$16.eql(ass));
                                if (rule_after_adding.NIL != valid_$17 && rule_after_adding.NIL != assertions_high.assertion_arguments(ass)) {
                                    final SubLObject v_rule_after_adding = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg(ass, (SubLObject)rule_after_adding.TWO_INTEGER));
                                    final SubLObject item_var = (SubLObject)ConsesLow.cons(v_rule_after_adding, assertions_high.assertion_mt(ass));
                                    if (rule_after_adding.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)rule_after_adding.EQL), Symbols.symbol_function((SubLObject)rule_after_adding.IDENTITY))) {
                                        ans = (SubLObject)ConsesLow.cons(item_var, ans);
                                    }
                                }
                                done_var_$15 = (SubLObject)SubLObjectFactory.makeBoolean(rule_after_adding.NIL == valid_$17);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_after_adding.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (rule_after_adding.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(rule_after_adding.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (rule_after_adding.NIL != ans) {
            Hashtables.sethash(predicate, rule_after_adding.$rule_after_addings_hash$.getGlobalValue(), Sequences.nreverse(ans));
        }
        return (SubLObject)rule_after_adding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 6392L)
    public static SubLObject recache_rule_after_removings(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rule_after_adding.NIL != forts.fort_p(predicate) : predicate;
        if (rule_after_adding.NIL == rule_after_adding.$rule_after_removings_hash$.getGlobalValue()) {
            initialize_rule_after_removings_hash();
        }
        Hashtables.remhash(predicate, rule_after_adding.$rule_after_removings_hash$.getGlobalValue());
        SubLObject ans = (SubLObject)rule_after_adding.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rule_after_adding.$sym8$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rule_after_adding.$const9$EverythingPSC, thread);
            final SubLObject pred_var = rule_after_adding.$const13$ruleAfterRemoving;
            if (rule_after_adding.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, (SubLObject)rule_after_adding.NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, (SubLObject)rule_after_adding.NIL, pred_var);
                SubLObject done_var = (SubLObject)rule_after_adding.NIL;
                final SubLObject token_var = (SubLObject)rule_after_adding.NIL;
                while (rule_after_adding.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (rule_after_adding.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)rule_after_adding.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rule_after_adding.$kw11$GAF, (SubLObject)rule_after_adding.NIL, (SubLObject)rule_after_adding.NIL);
                            SubLObject done_var_$19 = (SubLObject)rule_after_adding.NIL;
                            final SubLObject token_var_$20 = (SubLObject)rule_after_adding.NIL;
                            while (rule_after_adding.NIL == done_var_$19) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                final SubLObject valid_$21 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$20.eql(ass));
                                if (rule_after_adding.NIL != valid_$21 && rule_after_adding.NIL != assertions_high.assertion_arguments(ass)) {
                                    final SubLObject rule_after_removing = el_utilities.cycl_subl_symbol_symbol(assertions_high.gaf_arg(ass, (SubLObject)rule_after_adding.TWO_INTEGER));
                                    final SubLObject item_var = (SubLObject)ConsesLow.cons(rule_after_removing, assertions_high.assertion_mt(ass));
                                    if (rule_after_adding.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)rule_after_adding.EQL), Symbols.symbol_function((SubLObject)rule_after_adding.IDENTITY))) {
                                        ans = (SubLObject)ConsesLow.cons(item_var, ans);
                                    }
                                }
                                done_var_$19 = (SubLObject)SubLObjectFactory.makeBoolean(rule_after_adding.NIL == valid_$21);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_after_adding.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (rule_after_adding.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(rule_after_adding.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (rule_after_adding.NIL != ans) {
            Hashtables.sethash(predicate, rule_after_adding.$rule_after_removings_hash$.getGlobalValue(), Sequences.nreverse(ans));
        }
        return (SubLObject)rule_after_adding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 7006L)
    public static SubLObject propagate_rule_after_adding(final SubLObject argument, final SubLObject assertion) {
        assert rule_after_adding.NIL != arguments.argument_p(argument) : argument;
        if (rule_after_adding.NIL != assertions_high.gaf_assertionP(assertion) && rule_after_adding.NIL != assertions_high.assertion_has_truth(assertion, (SubLObject)rule_after_adding.$kw16$TRUE)) {
            final SubLObject formula = assertions_high.gaf_formula(assertion);
            if (el_utilities.literal_arity(formula, (SubLObject)rule_after_adding.UNPROVIDED).numE((SubLObject)rule_after_adding.TWO_INTEGER)) {
                final SubLObject predicate = el_utilities.literal_arg1(formula, (SubLObject)rule_after_adding.UNPROVIDED);
                final SubLObject function = el_utilities.cycl_subl_symbol_symbol(el_utilities.literal_arg2(formula, (SubLObject)rule_after_adding.UNPROVIDED));
                final SubLObject mt = assertions_high.assertion_mt(assertion);
                if (rule_after_adding.NIL != forts.fort_p(predicate) && function.isSymbol() && rule_after_adding.NIL != Symbols.fboundp(function) && function != rule_after_adding.$sym17$PROPAGATE_RULE_AFTER_ADDING) {
                    repropagate_rule_after_adding(predicate, function, mt);
                }
            }
        }
        return (SubLObject)rule_after_adding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 7789L)
    public static SubLObject repropagate_rule_after_adding(final SubLObject predicate, final SubLObject function, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rule_after_adding.NIL != forts.fort_p(predicate) : predicate;
        assert rule_after_adding.NIL != Types.symbolp(function) : function;
        assert rule_after_adding.NIL != hlmt.hlmt_p(mt) : mt;
        if (rule_after_adding.NIL != Symbols.fboundp(function)) {
            final SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                control_vars.$mapping_target$.bind(function, thread);
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rule_after_adding.$sym20$RELEVANT_MT_IS_SPEC_MT, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                if (rule_after_adding.NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(predicate, (SubLObject)rule_after_adding.NIL, (SubLObject)rule_after_adding.NIL)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(predicate, (SubLObject)rule_after_adding.NIL, (SubLObject)rule_after_adding.NIL);
                    SubLObject done_var = (SubLObject)rule_after_adding.NIL;
                    final SubLObject token_var = (SubLObject)rule_after_adding.NIL;
                    while (rule_after_adding.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (rule_after_adding.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)rule_after_adding.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)rule_after_adding.$kw21$RULE, (SubLObject)rule_after_adding.NIL, (SubLObject)rule_after_adding.NIL);
                                SubLObject done_var_$23 = (SubLObject)rule_after_adding.NIL;
                                final SubLObject token_var_$24 = (SubLObject)rule_after_adding.NIL;
                                while (rule_after_adding.NIL == done_var_$23) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$24);
                                    final SubLObject valid_$25 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$24.eql(assertion));
                                    if (rule_after_adding.NIL != valid_$25) {
                                        repropagate_rule_after_adding_internal(assertion, predicate);
                                    }
                                    done_var_$23 = (SubLObject)SubLObjectFactory.makeBoolean(rule_after_adding.NIL == valid_$25);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_after_adding.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (rule_after_adding.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(rule_after_adding.NIL == valid);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)rule_after_adding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 8313L)
    public static SubLObject repropagate_rule_after_adding_internal(final SubLObject assertion, final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rule_after_adding.$sym22$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(assertions_high.assertion_mt(assertion), thread);
            SubLObject cdolist_list_var = v_arguments;
            SubLObject argument = (SubLObject)rule_after_adding.NIL;
            argument = cdolist_list_var.first();
            while (rule_after_adding.NIL != cdolist_list_var) {
                SubLObject ignore_errors_tag = (SubLObject)rule_after_adding.NIL;
                try {
                    thread.throwStack.push(rule_after_adding.$kw5$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$27 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rule_after_adding.$sym6$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            SubLObject cdolist_list_var_$28 = gather_literals_with_pred(assertion, predicate);
                            SubLObject literal = (SubLObject)rule_after_adding.NIL;
                            literal = cdolist_list_var_$28.first();
                            while (rule_after_adding.NIL != cdolist_list_var_$28) {
                                handle_rule_after_adding(control_vars.$mapping_target$.getDynamicValue(thread), argument, literal, assertion);
                                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                                literal = cdolist_list_var_$28.first();
                            }
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)rule_after_adding.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$27, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rule_after_adding.$kw5$IGNORE_ERRORS_TARGET);
                }
                finally {
                    thread.throwStack.pop();
                }
                cdolist_list_var = cdolist_list_var.rest();
                argument = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)rule_after_adding.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/rule-after-adding.lisp", position = 8787L)
    public static SubLObject gather_literals_with_pred(final SubLObject assertion, final SubLObject pred) {
        SubLObject literals = (SubLObject)rule_after_adding.NIL;
        final SubLObject v_arity = arity.arity(pred);
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        SubLObject cdolist_list_var = clauses.pos_lits(cnf);
        SubLObject literal = (SubLObject)rule_after_adding.NIL;
        literal = cdolist_list_var.first();
        while (rule_after_adding.NIL != cdolist_list_var) {
            if (pred.eql(el_utilities.literal_arg(literal, (SubLObject)rule_after_adding.ZERO_INTEGER, (SubLObject)rule_after_adding.UNPROVIDED)) && rule_after_adding.NIL != el_utilities.formula_arityE(literal, v_arity, (SubLObject)rule_after_adding.UNPROVIDED)) {
                literals = (SubLObject)ConsesLow.cons(literal, literals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        return literals;
    }
    
    public static SubLObject declare_rule_after_adding_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "clear_rule_after_addings", "CLEAR-RULE-AFTER-ADDINGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "clear_rule_after_removings", "CLEAR-RULE-AFTER-REMOVINGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "handle_rule_after_addings", "HANDLE-RULE-AFTER-ADDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "handle_rule_after_addings_int", "HANDLE-RULE-AFTER-ADDINGS-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "handle_rule_after_removings", "HANDLE-RULE-AFTER-REMOVINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "handle_rule_after_removings_int", "HANDLE-RULE-AFTER-REMOVINGS-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "get_rule_after_addings", "GET-RULE-AFTER-ADDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "get_rule_after_removings", "GET-RULE-AFTER-REMOVINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "handle_rule_after_adding", "HANDLE-RULE-AFTER-ADDING", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "handle_rule_after_removing", "HANDLE-RULE-AFTER-REMOVING", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "rebuild_rule_after_adding_caches", "REBUILD-RULE-AFTER-ADDING-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "initialize_rule_after_addings_hash", "INITIALIZE-RULE-AFTER-ADDINGS-HASH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "initialize_rule_after_removings_hash", "INITIALIZE-RULE-AFTER-REMOVINGS-HASH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "recache_rule_after_addings", "RECACHE-RULE-AFTER-ADDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "recache_rule_after_removings", "RECACHE-RULE-AFTER-REMOVINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "propagate_rule_after_adding", "PROPAGATE-RULE-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "repropagate_rule_after_adding", "REPROPAGATE-RULE-AFTER-ADDING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "repropagate_rule_after_adding_internal", "REPROPAGATE-RULE-AFTER-ADDING-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.rule_after_adding", "gather_literals_with_pred", "GATHER-LITERALS-WITH-PRED", 2, 0, false);
        return (SubLObject)rule_after_adding.NIL;
    }
    
    public static SubLObject init_rule_after_adding_file() {
        rule_after_adding.$rule_after_adding_predicates$ = SubLFiles.deflexical("*RULE-AFTER-ADDING-PREDICATES*", (SubLObject)rule_after_adding.NIL);
        rule_after_adding.$rule_after_addings_hash$ = SubLFiles.deflexical("*RULE-AFTER-ADDINGS-HASH*", (SubLObject)((rule_after_adding.NIL != Symbols.boundp((SubLObject)rule_after_adding.$sym0$_RULE_AFTER_ADDINGS_HASH_)) ? rule_after_adding.$rule_after_addings_hash$.getGlobalValue() : rule_after_adding.NIL));
        rule_after_adding.$rule_after_removings_hash$ = SubLFiles.deflexical("*RULE-AFTER-REMOVINGS-HASH*", (SubLObject)((rule_after_adding.NIL != Symbols.boundp((SubLObject)rule_after_adding.$sym1$_RULE_AFTER_REMOVINGS_HASH_)) ? rule_after_adding.$rule_after_removings_hash$.getGlobalValue() : rule_after_adding.NIL));
        return (SubLObject)rule_after_adding.NIL;
    }
    
    public static SubLObject setup_rule_after_adding_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)rule_after_adding.$sym0$_RULE_AFTER_ADDINGS_HASH_);
        subl_macro_promotions.declare_defglobal((SubLObject)rule_after_adding.$sym1$_RULE_AFTER_REMOVINGS_HASH_);
        return (SubLObject)rule_after_adding.NIL;
    }
    
    public void declareFunctions() {
        declare_rule_after_adding_file();
    }
    
    public void initializeVariables() {
        init_rule_after_adding_file();
    }
    
    public void runTopLevelForms() {
        setup_rule_after_adding_file();
    }
    
    static {
        me = (SubLFile)new rule_after_adding();
        rule_after_adding.$rule_after_adding_predicates$ = null;
        rule_after_adding.$rule_after_addings_hash$ = null;
        rule_after_adding.$rule_after_removings_hash$ = null;
        $sym0$_RULE_AFTER_ADDINGS_HASH_ = SubLObjectFactory.makeSymbol("*RULE-AFTER-ADDINGS-HASH*");
        $sym1$_RULE_AFTER_REMOVINGS_HASH_ = SubLObjectFactory.makeSymbol("*RULE-AFTER-REMOVINGS-HASH*");
        $sym2$ARGUMENT_P = SubLObjectFactory.makeSymbol("ARGUMENT-P");
        $sym3$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $list4 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FUN"), (SubLObject)SubLObjectFactory.makeSymbol("FUN-MT"));
        $kw5$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym6$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $int7$100 = SubLObjectFactory.makeInteger(100);
        $sym8$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const9$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const10$ruleAfterAdding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ruleAfterAdding"));
        $kw11$GAF = SubLObjectFactory.makeKeyword("GAF");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-AFTER-ADDING-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-AFTER-ADDING"));
        $const13$ruleAfterRemoving = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ruleAfterRemoving"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-AFTER-REMOVING-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-AFTER-REMOVING"));
        $sym15$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $kw16$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym17$PROPAGATE_RULE_AFTER_ADDING = SubLObjectFactory.makeSymbol("PROPAGATE-RULE-AFTER-ADDING");
        $sym18$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym19$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym20$RELEVANT_MT_IS_SPEC_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-SPEC-MT");
        $kw21$RULE = SubLObjectFactory.makeKeyword("RULE");
        $sym22$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
    }
}

/*

	Total time: 388 ms
	
*/