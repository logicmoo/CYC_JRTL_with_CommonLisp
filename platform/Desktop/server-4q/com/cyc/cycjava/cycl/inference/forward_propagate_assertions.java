package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class forward_propagate_assertions extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.forward_propagate_assertions";
    public static final String myFingerPrint = "0d325bd78fc1451a2e616f80e4de19cab14912623c0a871964fdd9395f34fb88";
    @SubLTranslatedFile.SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 936L)
    public static SubLSymbol $forward_propagate_assertions_skolem_depth$;
    private static final SubLSymbol $sym0$HLMT_P;
    private static final SubLSymbol $sym1$LISTP;
    private static final SubLSymbol $sym2$ASSERTION_P;
    private static final SubLString $str3$ASSERTIONS_was_not_a_list_of_asse;
    private static final SubLSymbol $sym4$FORWARD_PROPAGATE_P;
    private static final SubLObject $const5$InferencePSC;
    private static final SubLSymbol $kw6$ERROR;
    private static final SubLSymbol $kw7$MAX_TIME;
    private static final SubLSymbol $kw8$EXHAUST_TOTAL;
    private static final SubLSymbol $sym9$RULE_ASSERTION_;
    private static final SubLSymbol $kw10$ASSERTION_FORWARD_PROPAGATION;
    private static final SubLSymbol $kw11$DEPTH;
    private static final SubLSymbol $sym12$QUEUE_P;
    private static final SubLString $str13$_____Level__S;
    private static final SubLString $str14$__ERROR_from__S_____a;
    private static final SubLSymbol $kw15$NUMBER;
    private static final SubLSymbol $kw16$TIME;
    private static final SubLSymbol $kw17$EXHAUST;
    private static final SubLSymbol $kw18$ALL;
    private static final SubLSymbol $sym19$GAF_ASSERTION_;
    private static final SubLString $str20$Seed_GAF__a_is_not_visible_from_s;
    private static final SubLSymbol $sym21$NON_DOTTED_LIST_P;
    private static final SubLString $str22$Specified_rule__a_is_not_visible_;
    private static final SubLSymbol $sym23$_EXIT;
    private static final SubLSymbol $sym24$HL_ASSERTIBLE_P;
    private static final SubLSymbol $sym25$DEDUCTION_SPEC_P;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 1164L)
    public static SubLObject forward_propagate_mt(final SubLObject source_mt, SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (target_mt == forward_propagate_assertions.UNPROVIDED) {
            target_mt = source_mt;
        }
        if (number == forward_propagate_assertions.UNPROVIDED) {
            number = (SubLObject)forward_propagate_assertions.NIL;
        }
        if (time == forward_propagate_assertions.UNPROVIDED) {
            time = (SubLObject)forward_propagate_assertions.NIL;
        }
        if (depth == forward_propagate_assertions.UNPROVIDED) {
            depth = (SubLObject)forward_propagate_assertions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert forward_propagate_assertions.NIL != hlmt.hlmt_p(source_mt) : source_mt;
        assert forward_propagate_assertions.NIL != hlmt.hlmt_p(target_mt) : target_mt;
        SubLObject result = (SubLObject)forward_propagate_assertions.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind((SubLObject)forward_propagate_assertions.T, thread);
            utilities_macros.$current_forward_problem_store$.bind((SubLObject)forward_propagate_assertions.NIL, thread);
            try {
                result = forward_propagate_assertions_in_mt_internal(kb_mapping.gather_mt_index(source_mt), target_mt, number, time, depth);
            }
            finally {
                final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward_propagate_assertions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    forward.clear_current_forward_problem_store();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        }
        finally {
            utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 2140L)
    public static SubLObject forward_propagate_assertions_in_mt(final SubLObject assertions, final SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (number == forward_propagate_assertions.UNPROVIDED) {
            number = (SubLObject)forward_propagate_assertions.NIL;
        }
        if (time == forward_propagate_assertions.UNPROVIDED) {
            time = (SubLObject)forward_propagate_assertions.NIL;
        }
        if (depth == forward_propagate_assertions.UNPROVIDED) {
            depth = (SubLObject)forward_propagate_assertions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert forward_propagate_assertions.NIL != Types.listp(assertions) : assertions;
        assert forward_propagate_assertions.NIL != hlmt.hlmt_p(target_mt) : target_mt;
        if (forward_propagate_assertions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && forward_propagate_assertions.NIL == list_utilities.every_in_list(Symbols.symbol_function((SubLObject)forward_propagate_assertions.$sym2$ASSERTION_P), assertions, (SubLObject)forward_propagate_assertions.UNPROVIDED)) {
            Errors.error((SubLObject)forward_propagate_assertions.$str3$ASSERTIONS_was_not_a_list_of_asse);
        }
        SubLObject result = (SubLObject)forward_propagate_assertions.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind((SubLObject)forward_propagate_assertions.T, thread);
            utilities_macros.$current_forward_problem_store$.bind((SubLObject)forward_propagate_assertions.NIL, thread);
            try {
                result = forward_propagate_assertions_in_mt_internal(assertions, target_mt, number, time, depth);
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward_propagate_assertions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    forward.clear_current_forward_problem_store();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        }
        finally {
            utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 3122L)
    public static SubLObject forward_propagate_assertion_in_mt(final SubLObject assertion, final SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (number == forward_propagate_assertions.UNPROVIDED) {
            number = (SubLObject)forward_propagate_assertions.NIL;
        }
        if (time == forward_propagate_assertions.UNPROVIDED) {
            time = (SubLObject)forward_propagate_assertions.NIL;
        }
        if (depth == forward_propagate_assertions.UNPROVIDED) {
            depth = (SubLObject)forward_propagate_assertions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert forward_propagate_assertions.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert forward_propagate_assertions.NIL != hlmt.hlmt_p(target_mt) : target_mt;
        SubLObject result = (SubLObject)forward_propagate_assertions.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind((SubLObject)forward_propagate_assertions.T, thread);
            utilities_macros.$current_forward_problem_store$.bind((SubLObject)forward_propagate_assertions.NIL, thread);
            try {
                result = forward_propagate_assertions_in_mt_internal((SubLObject)ConsesLow.list(assertion), target_mt, number, time, depth);
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward_propagate_assertions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    forward.clear_current_forward_problem_store();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 3997L)
    public static SubLObject inference_forward_propagate_mt(final SubLObject forward_propagate, final SubLObject target_mt, final SubLObject number, final SubLObject time, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forward_propagate_assertions.NIL != forward_propagate && !forward_propagate_assertions.assertionsDisabledInClass && forward_propagate_assertions.NIL == inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate)) {
            throw new AssertionError(forward_propagate);
        }
        SubLObject result = (SubLObject)forward_propagate_assertions.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind((SubLObject)forward_propagate_assertions.T, thread);
            utilities_macros.$current_forward_problem_store$.bind((SubLObject)forward_propagate_assertions.NIL, thread);
            try {
                result = forward_propagate_assertions_from_struct(forward_propagate, target_mt, number, (SubLObject)(time.isInteger() ? numeric_date_utilities.time_from_now(time) : forward_propagate_assertions.NIL), depth);
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward_propagate_assertions.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    forward.clear_current_forward_problem_store();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        }
        finally {
            utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 4526L)
    public static SubLObject forward_propagate_assertion_against_rules_in_mt(final SubLObject assertion, final SubLObject rules, final SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (number == forward_propagate_assertions.UNPROVIDED) {
            number = (SubLObject)forward_propagate_assertions.NIL;
        }
        if (time == forward_propagate_assertions.UNPROVIDED) {
            time = (SubLObject)forward_propagate_assertions.NIL;
        }
        if (depth == forward_propagate_assertions.UNPROVIDED) {
            depth = (SubLObject)forward_propagate_assertions.NIL;
        }
        return forward_propagate_assertions_against_rules_in_mt((SubLObject)ConsesLow.list(assertion), rules, target_mt, number, time, depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 4757L)
    public static SubLObject forward_propagate_assertions_against_rules_in_mt(final SubLObject assertions, final SubLObject rules, final SubLObject target_mt, SubLObject number, SubLObject time, SubLObject depth) {
        if (number == forward_propagate_assertions.UNPROVIDED) {
            number = (SubLObject)forward_propagate_assertions.NIL;
        }
        if (time == forward_propagate_assertions.UNPROVIDED) {
            time = (SubLObject)forward_propagate_assertions.NIL;
        }
        if (depth == forward_propagate_assertions.UNPROVIDED) {
            depth = (SubLObject)forward_propagate_assertions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = (SubLObject)forward_propagate_assertions.ZERO_INTEGER;
        final SubLObject suspend_status = (SubLObject)forward_propagate_assertions.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
            thread.resetMultipleValues();
            final SubLObject this_total = forward_propagate_assertions_in_mt_internal(assertions, target_mt, number, time, depth);
            final SubLObject this_suspend_status = thread.secondMultipleValue();
            thread.resetMultipleValues();
            total = Numbers.add(total, this_total);
        }
        finally {
            kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
        }
        return Values.values(total, suspend_status);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 5261L)
    public static SubLObject forward_consequences_of_assertion(final SubLObject assertion, SubLObject propagation_mt, SubLObject max_time) {
        if (propagation_mt == forward_propagate_assertions.UNPROVIDED) {
            propagation_mt = forward_propagate_assertions.$const5$InferencePSC;
        }
        if (max_time == forward_propagate_assertions.UNPROVIDED) {
            max_time = (SubLObject)forward_propagate_assertions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)forward_propagate_assertions.NIL;
        SubLObject halt_reason = (SubLObject)forward_propagate_assertions.$kw6$ERROR;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
        try {
            kb_control_vars.$within_assertion_forward_propagationP$.bind((SubLObject)forward_propagate_assertions.T, thread);
            SubLObject timed_outP = (SubLObject)forward_propagate_assertions.NIL;
            if (forward_propagate_assertions.NIL != max_time) {
                final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                try {
                    thread.throwStack.push(tag);
                    final SubLObject _prev_bind_0_$5 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$within_with_timeout$.bind((SubLObject)forward_propagate_assertions.T, thread);
                        SubLObject timer = (SubLObject)forward_propagate_assertions.NIL;
                        try {
                            final SubLObject _prev_bind_0_$6 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)forward_propagate_assertions.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                timer = subl_macro_promotions.with_timeout_start_timer(max_time, tag);
                                result = forward.forward_propagate_assertion_int(assertion, propagation_mt, (SubLObject)forward_propagate_assertions.NIL);
                            }
                            finally {
                                subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forward_propagate_assertions.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                subl_macro_promotions.with_timeout_stop_timer(timer);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                            }
                        }
                    }
                    finally {
                        subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_$5, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            else {
                result = forward.forward_propagate_assertion_int(assertion, propagation_mt, (SubLObject)forward_propagate_assertions.NIL);
            }
            halt_reason = (SubLObject)((forward_propagate_assertions.NIL != timed_outP) ? forward_propagate_assertions.$kw7$MAX_TIME : forward_propagate_assertions.$kw8$EXHAUST_TOTAL);
        }
        finally {
            kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result, halt_reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 6165L)
    public static SubLObject forward_propagate_assertions_in_mt_internal(SubLObject assertions, final SubLObject target_mt, final SubLObject number, final SubLObject time, final SubLObject depth) {
        assertions = list_utilities.sort_via_test(conses_high.copy_list(assertions), Symbols.symbol_function((SubLObject)forward_propagate_assertions.$sym9$RULE_ASSERTION_), (SubLObject)forward_propagate_assertions.UNPROVIDED);
        final SubLObject before_count = kb_indexing.num_mt_index(target_mt);
        final SubLObject time_cutoff = (SubLObject)(time.isInteger() ? numeric_date_utilities.time_from_now(time) : forward_propagate_assertions.NIL);
        final SubLObject forward_propagate = inference_datastructures_forward_propagate.new_forward_propagate((SubLObject)forward_propagate_assertions.UNPROVIDED);
        final SubLObject reason = (SubLObject)forward_propagate_assertions.NIL;
        inference_datastructures_forward_propagate.enqueue_forward_propagate_assertions_to_new_queue(forward_propagate, assertions);
        forward_propagate_assertions_from_struct(forward_propagate, target_mt, number, time_cutoff, depth);
        return Values.values(Numbers.subtract(kb_indexing.num_mt_index(target_mt), before_count), reason);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 6869L)
    public static SubLObject forward_propagate_assertions_from_struct(final SubLObject forward_propagate, final SubLObject target_mt, final SubLObject number, final SubLObject time_cutoff, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reason = (SubLObject)forward_propagate_assertions.NIL;
        try {
            thread.throwStack.push(forward_propagate_assertions.$kw10$ASSERTION_FORWARD_PROPAGATION);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(target_mt, thread);
                SubLObject level = (SubLObject)forward_propagate_assertions.ZERO_INTEGER;
                final SubLObject before_count = kb_indexing.num_mt_index(target_mt);
                while (forward_propagate_assertions.NIL == queues.queue_empty_p(inference_datastructures_forward_propagate.forward_propagate_new_queue(forward_propagate)) || forward_propagate_assertions.NIL == queues.queue_empty_p(inference_datastructures_forward_propagate.forward_propagate_old_queue(forward_propagate))) {
                    if (depth.isInteger() && level.numGE(depth)) {
                        Dynamic.sublisp_throw((SubLObject)forward_propagate_assertions.$kw10$ASSERTION_FORWARD_PROPAGATION, (SubLObject)forward_propagate_assertions.$kw11$DEPTH);
                    }
                    if (forward_propagate_assertions.NIL != queues.queue_empty_p(inference_datastructures_forward_propagate.forward_propagate_old_queue(forward_propagate))) {
                        inference_datastructures_forward_propagate.swap_forward_propagate_queues(forward_propagate);
                    }
                    assert forward_propagate_assertions.NIL != queues.queue_p(inference_datastructures_forward_propagate.forward_propagate_new_queue(forward_propagate)) : inference_datastructures_forward_propagate.forward_propagate_new_queue(forward_propagate);
                    final SubLObject _prev_bind_0_$8 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_environment$.bind(inference_datastructures_forward_propagate.forward_propagate_new_queue(forward_propagate), thread);
                        if (forward_propagate_assertions.NIL != forward.$tracing_forward_inference$.getDynamicValue(thread)) {
                            PrintLow.format((SubLObject)forward_propagate_assertions.T, (SubLObject)forward_propagate_assertions.$str13$_____Level__S, Numbers.add(level, (SubLObject)forward_propagate_assertions.ONE_INTEGER));
                        }
                        final SubLObject _prev_bind_0_$9 = control_vars.$allow_forward_skolemization$.currentBinding(thread);
                        try {
                            control_vars.$allow_forward_skolemization$.bind((SubLObject)SubLObjectFactory.makeBoolean(forward_propagate_assertions.NIL != control_vars.$allow_forward_skolemization$.getDynamicValue(thread) && level.numL(forward_propagate_assertions.$forward_propagate_assertions_skolem_depth$.getDynamicValue(thread))), thread);
                            while (forward_propagate_assertions.NIL == queues.queue_empty_p(inference_datastructures_forward_propagate.forward_propagate_old_queue(forward_propagate))) {
                                final SubLObject assertion = inference_datastructures_forward_propagate.dequeue_forward_propagate_assertion_from_old_queue(forward_propagate);
                                final SubLObject error_message = (SubLObject)forward_propagate_assertions.NIL;
                                forward.forward_propagate_assertion(assertion, target_mt);
                                if (forward_propagate_assertions.NIL != error_message && forward_propagate_assertions.NIL != forward.$tracing_forward_inference$.getDynamicValue(thread)) {
                                    PrintLow.format((SubLObject)forward_propagate_assertions.T, (SubLObject)forward_propagate_assertions.$str14$__ERROR_from__S_____a, assertion, error_message);
                                }
                                if (number.isInteger() && Numbers.subtract(kb_indexing.num_mt_index(target_mt), before_count).numGE(number)) {
                                    Dynamic.sublisp_throw((SubLObject)forward_propagate_assertions.$kw10$ASSERTION_FORWARD_PROPAGATION, (SubLObject)forward_propagate_assertions.$kw15$NUMBER);
                                }
                                if (forward_propagate_assertions.NIL != time_cutoff && forward_propagate_assertions.NIL != Time.time_has_arrivedP(time_cutoff)) {
                                    Dynamic.sublisp_throw((SubLObject)forward_propagate_assertions.$kw10$ASSERTION_FORWARD_PROPAGATION, (SubLObject)forward_propagate_assertions.$kw16$TIME);
                                }
                            }
                        }
                        finally {
                            control_vars.$allow_forward_skolemization$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                    finally {
                        kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$8, thread);
                    }
                    level = Numbers.add(level, (SubLObject)forward_propagate_assertions.ONE_INTEGER);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            reason = (SubLObject)forward_propagate_assertions.$kw17$EXHAUST;
        }
        catch (Throwable ccatch_env_var) {
            reason = Errors.handleThrowable(ccatch_env_var, (SubLObject)forward_propagate_assertions.$kw10$ASSERTION_FORWARD_PROPAGATION);
        }
        finally {
            thread.throwStack.pop();
        }
        return reason;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 9223L)
    public static SubLObject generate_consequences(final SubLObject seed_gaf, SubLObject rules, SubLObject mt, SubLObject max_time) {
        if (rules == forward_propagate_assertions.UNPROVIDED) {
            rules = (SubLObject)forward_propagate_assertions.$kw18$ALL;
        }
        if (mt == forward_propagate_assertions.UNPROVIDED) {
            mt = forward_propagate_assertions.$const5$InferencePSC;
        }
        if (max_time == forward_propagate_assertions.UNPROVIDED) {
            max_time = (SubLObject)forward_propagate_assertions.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert forward_propagate_assertions.NIL != hlmt.hlmt_p(mt) : mt;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            assert forward_propagate_assertions.NIL != assertions_high.gaf_assertionP(seed_gaf) : seed_gaf;
            if (forward_propagate_assertions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && forward_propagate_assertions.NIL == mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(seed_gaf))) {
                Errors.error((SubLObject)forward_propagate_assertions.$str20$Seed_GAF__a_is_not_visible_from_s, seed_gaf, mt);
            }
            if (forward_propagate_assertions.$kw18$ALL != rules) {
                final SubLObject list_var = rules;
                assert forward_propagate_assertions.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = (SubLObject)forward_propagate_assertions.NIL;
                elem = cdolist_list_var.first();
                while (forward_propagate_assertions.NIL != cdolist_list_var) {
                    assert forward_propagate_assertions.NIL != assertions_high.rule_assertionP(elem) : elem;
                    cdolist_list_var = cdolist_list_var.rest();
                    elem = cdolist_list_var.first();
                }
                SubLObject cdolist_list_var2 = rules;
                SubLObject rule = (SubLObject)forward_propagate_assertions.NIL;
                rule = cdolist_list_var2.first();
                while (forward_propagate_assertions.NIL != cdolist_list_var2) {
                    if (forward_propagate_assertions.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && forward_propagate_assertions.NIL == mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(rule))) {
                        Errors.error((SubLObject)forward_propagate_assertions.$str22$Specified_rule__a_is_not_visible_, rule, mt);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    rule = cdolist_list_var2.first();
                }
            }
            SubLObject queryables = (SubLObject)forward_propagate_assertions.NIL;
            SubLObject halt_reason = (SubLObject)forward_propagate_assertions.NIL;
            SubLObject consequences = (SubLObject)forward_propagate_assertions.NIL;
            final SubLObject _prev_bind_0_$10 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
                thread.resetMultipleValues();
                final SubLObject consequences_$11 = forward_consequences_of_assertion(seed_gaf, mt, max_time);
                final SubLObject halt_reason_$12 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                consequences = consequences_$11;
                halt_reason = halt_reason_$12;
            }
            finally {
                kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0_$10, thread);
            }
            SubLObject cdolist_list_var3 = consequences;
            SubLObject assertible = (SubLObject)forward_propagate_assertions.NIL;
            assertible = cdolist_list_var3.first();
            while (forward_propagate_assertions.NIL != cdolist_list_var3) {
                queryables = (SubLObject)ConsesLow.cons(hl_assertible_to_queryable(assertible), queryables);
                cdolist_list_var3 = cdolist_list_var3.rest();
                assertible = cdolist_list_var3.first();
            }
            return Values.values(queryables, halt_reason);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/forward-propagate-assertions.lisp", position = 10371L)
    public static SubLObject hl_assertible_to_queryable(final SubLObject assertible) {
        assert forward_propagate_assertions.NIL != hl_storage_modules.hl_assertible_p(assertible) : assertible;
        final SubLObject argument_spec = hl_storage_modules.hl_assertible_argument_spec(assertible);
        final SubLObject hl_assertion_spec_var_$13;
        final SubLObject hl_assertion_spec_var = hl_assertion_spec_var_$13 = hl_storage_modules.hl_assertible_hl_assertion_spec(assertible);
        final SubLObject cnf = hl_storage_modules.hl_assertion_spec_cnf(hl_assertion_spec_var_$13);
        final SubLObject mt = hl_storage_modules.hl_assertion_spec_mt(hl_assertion_spec_var_$13);
        assert forward_propagate_assertions.NIL != deductions_high.deduction_spec_p(argument_spec) : argument_spec;
        final SubLObject supports = deductions_high.deduction_spec_supports(argument_spec);
        final SubLObject query_el_formula = uncanonicalizer.cnf_el_formula(cnf, mt, (SubLObject)forward_propagate_assertions.UNPROVIDED);
        final SubLObject queryable = (SubLObject)ConsesLow.list(query_el_formula, mt, supports);
        return queryable;
    }
    
    public static SubLObject declare_forward_propagate_assertions_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.forward_propagate_assertions", "forward_propagate_mt", "FORWARD-PROPAGATE-MT", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.forward_propagate_assertions", "forward_propagate_assertions_in_mt", "FORWARD-PROPAGATE-ASSERTIONS-IN-MT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.forward_propagate_assertions", "forward_propagate_assertion_in_mt", "FORWARD-PROPAGATE-ASSERTION-IN-MT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.forward_propagate_assertions", "inference_forward_propagate_mt", "INFERENCE-FORWARD-PROPAGATE-MT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.forward_propagate_assertions", "forward_propagate_assertion_against_rules_in_mt", "FORWARD-PROPAGATE-ASSERTION-AGAINST-RULES-IN-MT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.forward_propagate_assertions", "forward_propagate_assertions_against_rules_in_mt", "FORWARD-PROPAGATE-ASSERTIONS-AGAINST-RULES-IN-MT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.forward_propagate_assertions", "forward_consequences_of_assertion", "FORWARD-CONSEQUENCES-OF-ASSERTION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.forward_propagate_assertions", "forward_propagate_assertions_in_mt_internal", "FORWARD-PROPAGATE-ASSERTIONS-IN-MT-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.forward_propagate_assertions", "forward_propagate_assertions_from_struct", "FORWARD-PROPAGATE-ASSERTIONS-FROM-STRUCT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.forward_propagate_assertions", "generate_consequences", "GENERATE-CONSEQUENCES", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.forward_propagate_assertions", "hl_assertible_to_queryable", "HL-ASSERTIBLE-TO-QUERYABLE", 1, 0, false);
        return (SubLObject)forward_propagate_assertions.NIL;
    }
    
    public static SubLObject init_forward_propagate_assertions_file() {
        forward_propagate_assertions.$forward_propagate_assertions_skolem_depth$ = SubLFiles.defparameter("*FORWARD-PROPAGATE-ASSERTIONS-SKOLEM-DEPTH*", (SubLObject)forward_propagate_assertions.ZERO_INTEGER);
        return (SubLObject)forward_propagate_assertions.NIL;
    }
    
    public static SubLObject setup_forward_propagate_assertions_file() {
        return (SubLObject)forward_propagate_assertions.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_forward_propagate_assertions_file();
    }
    
    @Override
	public void initializeVariables() {
        init_forward_propagate_assertions_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_forward_propagate_assertions_file();
    }
    
    static {
        me = (SubLFile)new forward_propagate_assertions();
        forward_propagate_assertions.$forward_propagate_assertions_skolem_depth$ = null;
        $sym0$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym1$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym2$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $str3$ASSERTIONS_was_not_a_list_of_asse = SubLObjectFactory.makeString("ASSERTIONS was not a list of assertions");
        $sym4$FORWARD_PROPAGATE_P = SubLObjectFactory.makeSymbol("FORWARD-PROPAGATE-P");
        $const5$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw6$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $kw7$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw8$EXHAUST_TOTAL = SubLObjectFactory.makeKeyword("EXHAUST-TOTAL");
        $sym9$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
        $kw10$ASSERTION_FORWARD_PROPAGATION = SubLObjectFactory.makeKeyword("ASSERTION-FORWARD-PROPAGATION");
        $kw11$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $sym12$QUEUE_P = SubLObjectFactory.makeSymbol("QUEUE-P");
        $str13$_____Level__S = SubLObjectFactory.makeString("~%;; Level ~S");
        $str14$__ERROR_from__S_____a = SubLObjectFactory.makeString("~%ERROR from ~S~%  ~a");
        $kw15$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
        $kw16$TIME = SubLObjectFactory.makeKeyword("TIME");
        $kw17$EXHAUST = SubLObjectFactory.makeKeyword("EXHAUST");
        $kw18$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym19$GAF_ASSERTION_ = SubLObjectFactory.makeSymbol("GAF-ASSERTION?");
        $str20$Seed_GAF__a_is_not_visible_from_s = SubLObjectFactory.makeString("Seed GAF ~a is not visible from specified mt ~a");
        $sym21$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $str22$Specified_rule__a_is_not_visible_ = SubLObjectFactory.makeString("Specified rule ~a is not visible from specified mt ~a");
        $sym23$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym24$HL_ASSERTIBLE_P = SubLObjectFactory.makeSymbol("HL-ASSERTIBLE-P");
        $sym25$DEDUCTION_SPEC_P = SubLObjectFactory.makeSymbol("DEDUCTION-SPEC-P");
    }
}

/*

	Total time: 175 ms
	 synthetic 
*/