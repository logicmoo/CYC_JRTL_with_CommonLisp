/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.plusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$process_normal_priority$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_wait;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.set_process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_eval$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      RKF-COLLABORATOR-POWERLOOM
 *  source file: /cyc/top/cycl/rkf-collaborator-powerloom.lisp
 *  created:     2019/07/03 17:38:01
 */
public final class rkf_collaborator_powerloom extends SubLTranslatedFile implements V02 {
    // // Constructor
    private rkf_collaborator_powerloom() {
    }

    public static final SubLFile me = new rkf_collaborator_powerloom();


    // // Definitions
    // defparameter
    private static final SubLSymbol $within_powerloom_server$ = makeSymbol("*WITHIN-POWERLOOM-SERVER*");

    // defparameter
    private static final SubLSymbol $powerloom_server_port$ = makeSymbol("*POWERLOOM-SERVER-PORT*");

    // defparameter
    private static final SubLSymbol $use_virb3_for_powerloom$ = makeSymbol("*USE-VIRB3-FOR-POWERLOOM*");

    public static final SubLObject powerloom_server_handler(SubLObject in_stream, SubLObject out_stream) {
        return powerloom_server_top_level(in_stream, out_stream);
    }

    public static final SubLObject powerloom_server_top_level(SubLObject in_stream, SubLObject out_stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                SubLObject _prev_bind_1 = $read_default_float_format$.currentBinding(thread);
                SubLObject _prev_bind_2 = $print_readably$.currentBinding(thread);
                SubLObject _prev_bind_3 = $read_eval$.currentBinding(thread);
                try {
                    $package$.bind(find_package($$$CYC), thread);
                    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                    $print_readably$.bind(NIL, thread);
                    $read_eval$.bind(NIL, thread);
                    {
                        SubLObject old_priority = process_priority(current_process());
                        try {
                            set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                            {
                                SubLObject catch_var = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_1 = $within_powerloom_server$.currentBinding(thread);
                                        try {
                                            $within_powerloom_server$.bind(T, thread);
                                            powerloom_server_handler_internal(in_stream, out_stream);
                                        } finally {
                                            $within_powerloom_server$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    catch_var = Errors.handleThrowable(ccatch_env_var, $POWERLOOM_QUIT);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    set_process_priority(current_process(), old_priority);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                        }
                    }
                } finally {
                    $read_eval$.rebind(_prev_bind_3, thread);
                    $print_readably$.rebind(_prev_bind_2, thread);
                    $read_default_float_format$.rebind(_prev_bind_1, thread);
                    $package$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    // deflexical
    private static final SubLSymbol $powerloom_emname$ = makeSymbol("*POWERLOOM-EMNAME*");

    // deflexical
    private static final SubLSymbol $powerloom_appname$ = makeSymbol("*POWERLOOM-APPNAME*");

    // defparameter
    private static final SubLSymbol $powerloom_sid$ = makeSymbol("*POWERLOOM-SID*");

    // defparameter
    private static final SubLSymbol $powerloom_emid$ = makeSymbol("*POWERLOOM-EMID*");

    // defparameter
    private static final SubLSymbol $powerloom_tid$ = makeSymbol("*POWERLOOM-TID*");

    // defparameter
    private static final SubLSymbol $powerloom_transaction_stack$ = makeSymbol("*POWERLOOM-TRANSACTION-STACK*");

    public static final SubLObject powerloom_trace(SubLObject message) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $powerloom_transaction_stack$.setDynamicValue(cons(message, $powerloom_transaction_stack$.getDynamicValue(thread)), thread);
            return message;
        }
    }

    public static final SubLObject powerloom_server_handler_internal(SubLObject in, SubLObject out) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $powerloom_transaction_stack$.currentBinding(thread);
                SubLObject _prev_bind_1 = $powerloom_sid$.currentBinding(thread);
                SubLObject _prev_bind_2 = $powerloom_emid$.currentBinding(thread);
                SubLObject _prev_bind_3 = $powerloom_tid$.currentBinding(thread);
                try {
                    $powerloom_transaction_stack$.bind(NIL, thread);
                    $powerloom_sid$.bind(Guids.new_guid(), thread);
                    $powerloom_emid$.bind(Guids.new_guid(), thread);
                    $powerloom_tid$.bind(Guids.new_guid(), thread);
                    {
                        SubLObject doneP = NIL;
                        powerloom_process_invitation(in, out);
                        powerloom_spawn_listener(in, out, $powerloom_sid$.getDynamicValue(thread), $powerloom_emid$.getDynamicValue(thread), $powerloom_tid$.getDynamicValue(thread));
                        while (NIL == doneP) {
                            thread.resetMultipleValues();
                            {
                                SubLObject query = powerloom_obtain_problematic_query();
                                SubLObject mt = thread.secondMultipleValue();
                                SubLObject backchains = thread.thirdMultipleValue();
                                SubLObject number = thread.fourthMultipleValue();
                                SubLObject time = thread.fifthMultipleValue();
                                SubLObject depth = thread.sixthMultipleValue();
                                thread.resetMultipleValues();
                                powerloom_process_stimulate(in, out, query, mt, backchains, number, time, depth);
                            }
                        } 
                    }
                } finally {
                    $powerloom_tid$.rebind(_prev_bind_3, thread);
                    $powerloom_emid$.rebind(_prev_bind_2, thread);
                    $powerloom_sid$.rebind(_prev_bind_1, thread);
                    $powerloom_transaction_stack$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject powerloom_process_invitation(SubLObject in, SubLObject out) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject message = list(new SubLObject[]{ $INVITE, $SID, Guids.guid_to_string($powerloom_sid$.getDynamicValue(thread)), $EMID, Guids.guid_to_string($powerloom_emid$.getDynamicValue(thread)), $TID, Guids.guid_to_string($powerloom_tid$.getDynamicValue(thread)), $APPNAME, $powerloom_appname$.getGlobalValue(), $EMNAME, $powerloom_emname$.getGlobalValue() });
                SubLObject reply = NIL;
                write_powerloom_server_reaction(out, message);
                powerloom_trace(message);
                reply = read_powerloom_server_request(in);
                powerloom_trace(reply);
            }
            return in;
        }
    }

    public static final SubLObject powerloom_process_stimulate(SubLObject in, SubLObject out, SubLObject query, SubLObject mt, SubLObject backchains, SubLObject number, SubLObject time, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject aal = powerloom_construct_aal_from_query(query, mt, backchains, number, time, depth);
                SubLObject message = list(new SubLObject[]{ $STIMULATE, $SID, Guids.guid_to_string($powerloom_sid$.getDynamicValue(thread)), $EMID, Guids.guid_to_string($powerloom_emid$.getDynamicValue(thread)), $TID, Guids.guid_to_string($powerloom_tid$.getDynamicValue(thread)), $PROPID, Guids.guid_to_string(Guids.new_guid()), $AAL, aal });
                write_powerloom_server_reaction(out, message);
                powerloom_trace(message);
            }
            return in;
        }
    }

    // deflexical
    private static final SubLSymbol $powerloom_internal_pid_counter$ = makeSymbol("*POWERLOOM-INTERNAL-PID-COUNTER*");

    public static final SubLObject powerloom_construct_aal_from_query(SubLObject query, SubLObject mt, SubLObject backchains, SubLObject number, SubLObject time, SubLObject depth) {
        {
            SubLObject problem_list = NIL;
            SubLObject int_pid_problem = integer_sequence_generator.integer_sequence_generator_next($powerloom_internal_pid_counter$.getGlobalValue());
            SubLObject int_pid_posting = integer_sequence_generator.integer_sequence_generator_next($powerloom_internal_pid_counter$.getGlobalValue());
            SubLObject problem_pid = string_utilities.to_string(int_pid_problem);
            SubLObject posting_pid = string_utilities.to_string(int_pid_posting);
            SubLObject result = NIL;
            problem_list = cons(list($DEPTH, string_utilities.to_string(depth)), problem_list);
            problem_list = cons(list($TIME, string_utilities.to_string(time)), problem_list);
            problem_list = cons(list($NUMBER, string_utilities.to_string(number)), problem_list);
            problem_list = cons(list($BACKCHAINS, string_utilities.to_string(backchains)), problem_list);
            problem_list = cons(list($MT, kb_paths.fort_name(mt)), problem_list);
            problem_list = cons(list($FORMULA, stringify_formula(query)), problem_list);
            result = list(list($sym24$_QUERY, $str_alt25$FAILED_QUERY, list($PROBLEM, problem_list), $INTERNAL_PID, problem_pid), list($sym28$_THE_POSTING, $$$POSTING, list($PROBLEM, problem_list), $INTERNAL_PID, posting_pid));
            return result;
        }
    }

    public static final SubLObject stringify_formula(SubLObject query) {
        return cycl_expression_to_string_expression(query);
    }

    public static final SubLObject cycl_expression_to_string_expression(SubLObject expr) {
        if (expr.isSymbol()) {
            return expr;
        } else
            if (NIL != constant_handles.constant_p(expr)) {
                return constants_high.constant_name(expr);
            } else
                if (NIL != nart_handles.nart_p(expr)) {
                    return cycl_expression_to_string_expression(narts_high.nart_el_formula(expr));
                } else
                    if (expr.isAtom()) {
                        return expr;
                    } else {
                        return cons(cycl_expression_to_string_expression(expr.first()), cycl_expression_to_string_expression(expr.rest()));
                    }



    }

    public static final SubLObject string_expression_to_cycl_expression(SubLObject expr) {
        if (expr.isSymbol()) {
            return expr;
        } else
            if (expr.isString()) {
                {
                    SubLObject constant = constants_high.find_constant(expr);
                    return NIL != constant ? ((SubLObject) (constant)) : expr;
                }
            } else
                if (expr.isAtom()) {
                    return expr;
                } else
                    if (expr.isCons()) {
                        {
                            SubLObject part = cons(string_expression_to_cycl_expression(expr.first()), string_expression_to_cycl_expression(expr.rest()));
                            if (NIL != rkf_collaborator_fire.is_potential_nat_expressionP(part)) {
                                part = string_nat_expression_to_nat(part);
                            }
                            return part;
                        }
                    } else {
                        return expr;
                    }



    }

    public static final SubLObject string_nat_expression_to_nat(SubLObject expr) {
        {
            SubLObject nart = narts_high.find_nart(expr);
            return NIL == nart ? ((SubLObject) (expr)) : nart;
        }
    }

    public static final SubLObject powerloom_spawn_listener(SubLObject in, SubLObject out, SubLObject sid, SubLObject emid, SubLObject tid) {
        return subl_promotions.make_process_with_args($$$PowerLoom_Listener, POWERLOOM_REPLY_POSTING_LISTENER, list(in, out, sid, emid, tid));
    }

    public static final SubLObject powerloom_reply_posting_listener(SubLObject in, SubLObject out, SubLObject sid, SubLObject emid, SubLObject tid) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $powerloom_sid$.currentBinding(thread);
                SubLObject _prev_bind_1 = $powerloom_emid$.currentBinding(thread);
                SubLObject _prev_bind_2 = $powerloom_tid$.currentBinding(thread);
                try {
                    $powerloom_sid$.bind(sid, thread);
                    $powerloom_emid$.bind(emid, thread);
                    $powerloom_tid$.bind(tid, thread);
                    {
                        SubLObject propid = NIL;
                        SubLObject reply = NIL;
                        SubLObject doneP = NIL;
                        {
                            SubLObject _prev_bind_0_3 = $package$.currentBinding(thread);
                            SubLObject _prev_bind_1_4 = $read_default_float_format$.currentBinding(thread);
                            SubLObject _prev_bind_2_5 = $print_readably$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $read_eval$.currentBinding(thread);
                            try {
                                $package$.bind(find_package($$$CYC), thread);
                                $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                                $print_readably$.bind(NIL, thread);
                                $read_eval$.bind(NIL, thread);
                                {
                                    SubLObject old_priority = process_priority(current_process());
                                    try {
                                        set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                                        {
                                            SubLObject catch_var = NIL;
                                            try {
                                                while (NIL == doneP) {
                                                    reply = read_powerloom_server_request(in);
                                                    powerloom_trace(reply);
                                                    if (reply == $EOF) {
                                                        doneP = T;
                                                    } else
                                                        if (reply == $DISCONNECT) {
                                                            Errors.warn($str_alt34$PowerLOOM_errored_out_and_generat);
                                                            doneP = T;
                                                        } else
                                                            if (!reply.isList()) {
                                                                Errors.warn($str_alt35$Protocol_violation____received__A, reply);
                                                                doneP = T;
                                                            } else {
                                                                {
                                                                    SubLObject pcase_var = reply.first();
                                                                    if (pcase_var.eql($PROPOSE)) {
                                                                        propid = second(member($PROPID, reply, UNPROVIDED, UNPROVIDED));
                                                                        {
                                                                            SubLObject message = list(new SubLObject[]{ $EXECUTE, $SID, Guids.guid_to_string($powerloom_sid$.getDynamicValue(thread)), $EMID, Guids.guid_to_string($powerloom_emid$.getDynamicValue(thread)), $TID, Guids.guid_to_string($powerloom_tid$.getDynamicValue(thread)), $PROPID, propid });
                                                                            write_powerloom_server_reaction(out, message);
                                                                            powerloom_trace(message);
                                                                        }
                                                                    } else
                                                                        if (pcase_var.eql($CONTRIBUTE)) {
                                                                            powerloom_generate_response(reply);
                                                                        }

                                                                }
                                                            }


                                                } 
                                            } catch (Throwable ccatch_env_var) {
                                                catch_var = Errors.handleThrowable(ccatch_env_var, $POWERLOOM_QUIT);
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                set_process_priority(current_process(), old_priority);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                $read_eval$.rebind(_prev_bind_3, thread);
                                $print_readably$.rebind(_prev_bind_2_5, thread);
                                $read_default_float_format$.rebind(_prev_bind_1_4, thread);
                                $package$.rebind(_prev_bind_0_3, thread);
                            }
                        }
                    }
                } finally {
                    $powerloom_tid$.rebind(_prev_bind_2, thread);
                    $powerloom_emid$.rebind(_prev_bind_1, thread);
                    $powerloom_sid$.rebind(_prev_bind_0, thread);
                }
            }
            return $DONE;
        }
    }

    public static final SubLObject read_powerloom_server_request(SubLObject in) {
        {
            SubLObject input = NIL;
            input = read(in, NIL, $EOF, UNPROVIDED);
            return input;
        }
    }

    public static final SubLObject write_powerloom_server_reaction(SubLObject out, SubLObject reply) {
        prin1(reply, out);
        string_utilities.network_terpri(out);
        force_output(out);
        return out;
    }

    // deflexical
    private static final SubLSymbol $powerloom_problematic_queries$ = makeSymbol("*POWERLOOM-PROBLEMATIC-QUERIES*");

    public static final SubLObject enqueue_powerloom_problematic_query(SubLObject query, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = TWO_INTEGER;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = $int$30;
        }
        if (depth == UNPROVIDED) {
            depth = TWENTY_INTEGER;
        }
        {
            SubLObject request = list(new SubLObject[]{ $QUERY, query, $MT, mt, $BACKCHAIN, backchain, $NUMBER, number, $TIME, time, $DEPTH, depth });
            queues.enqueue(request, $powerloom_problematic_queries$.getGlobalValue());
            return request;
        }
    }

    public static final SubLObject wait_on_powerloom_problematic_query() {
        return plusp(queues.queue_size($powerloom_problematic_queries$.getGlobalValue()));
    }

    public static final SubLObject powerloom_obtain_problematic_query() {
        process_wait($$$waiting_for_query, WAIT_ON_POWERLOOM_PROBLEMATIC_QUERY);
        {
            SubLObject item = queues.dequeue($powerloom_problematic_queries$.getGlobalValue());
            SubLObject datum = item;
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_7 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt45);
                current_7 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt45);
                if (NIL == member(current_7, $list_alt46, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_7 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt45);
            }
            {
                SubLObject query_tail = property_list_member($QUERY, current);
                SubLObject query = (NIL != query_tail) ? ((SubLObject) (cadr(query_tail))) : NIL;
                SubLObject mt_tail = property_list_member($MT, current);
                SubLObject mt = (NIL != mt_tail) ? ((SubLObject) (cadr(mt_tail))) : NIL;
                SubLObject backchain_tail = property_list_member($BACKCHAIN, current);
                SubLObject backchain = (NIL != backchain_tail) ? ((SubLObject) (cadr(backchain_tail))) : NIL;
                SubLObject number_tail = property_list_member($NUMBER, current);
                SubLObject number = (NIL != number_tail) ? ((SubLObject) (cadr(number_tail))) : NIL;
                SubLObject time_tail = property_list_member($TIME, current);
                SubLObject time = (NIL != time_tail) ? ((SubLObject) (cadr(time_tail))) : NIL;
                SubLObject depth_tail = property_list_member($DEPTH, current);
                SubLObject depth = (NIL != depth_tail) ? ((SubLObject) (cadr(depth_tail))) : NIL;
                return values(query, mt, backchain, number, time, depth);
            }
        }
    }

    // deflexical
    private static final SubLSymbol $most_recent_powerloom_result$ = makeSymbol("*MOST-RECENT-POWERLOOM-RESULT*");

    // deflexical
    private static final SubLSymbol $powerloom_result_lock$ = makeSymbol("*POWERLOOM-RESULT-LOCK*");

    // deflexical
    public static final SubLSymbol $powerloom_result_handlers$ = makeSymbol("*POWERLOOM-RESULT-HANDLERS*");

    public static final SubLObject register_powerloom_result_handler(SubLObject function) {
        {
            SubLObject lock = $powerloom_result_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL == subl_promotions.memberP(function, $powerloom_result_handlers$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                    $powerloom_result_handlers$.setGlobalValue(cons(function, $powerloom_result_handlers$.getGlobalValue()));
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return function;
    }

    public static final SubLObject powerloom_generate_response(SubLObject reply) {
        $most_recent_powerloom_result$.setGlobalValue(reply);
        {
            SubLObject lock = $powerloom_result_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject functions = $powerloom_result_handlers$.getGlobalValue();
                    SubLObject cdolist_list_var = functions;
                    SubLObject function = NIL;
                    for (function = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , function = cdolist_list_var.first()) {
                        funcall(function, reply);
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return reply;
    }

    public static final SubLObject debugging_setup_powerloom_problematic_query() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $use_virb3_for_powerloom$.getDynamicValue(thread)) {
                {
                    SubLObject query = cb_uia_collaborators.$powerloom_test_query$.getDynamicValue(thread);
                    SubLObject mt = cb_uia_collaborators.$powerloom_test_mt$.getDynamicValue(thread);
                    SubLObject backchains = SIX_INTEGER;
                    SubLObject number = NIL;
                    SubLObject time = $int$2400;
                    SubLObject depth = TWENTY_INTEGER;
                    cb_uia_collaborators.bb_enqueue_powerloom_problematic_query(query, mt, backchains, number, time, depth);
                }
            } else {
                thread.resetMultipleValues();
                {
                    SubLObject query = current_powerloom_debugging_query();
                    SubLObject mt = thread.secondMultipleValue();
                    SubLObject backchains = thread.thirdMultipleValue();
                    SubLObject number = thread.fourthMultipleValue();
                    SubLObject time = thread.fifthMultipleValue();
                    SubLObject depth = thread.sixthMultipleValue();
                    thread.resetMultipleValues();
                    enqueue_powerloom_problematic_query(query, mt, backchains, number, time, depth);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject current_powerloom_debugging_query() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return values(cb_uia_collaborators.$powerloom_test_query$.getDynamicValue(thread), cb_uia_collaborators.$powerloom_test_mt$.getDynamicValue(thread), SIX_INTEGER, NIL, $int$120, TWENTY_INTEGER);
        }
    }

    public static final SubLObject initialize_powerloom_handling() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tcp_server_utilities.enable_tcp_server($POWERLOOM, $powerloom_server_port$.getDynamicValue(thread));
            queues.clear_queue($powerloom_problematic_queries$.getGlobalValue());
            $powerloom_result_handlers$.setGlobalValue(NIL);
            return $INITIALIZED;
        }
    }

    public static final SubLObject declare_rkf_collaborator_powerloom_file() {
        declareFunction("powerloom_server_handler", "POWERLOOM-SERVER-HANDLER", 2, 0, false);
        declareFunction("powerloom_server_top_level", "POWERLOOM-SERVER-TOP-LEVEL", 2, 0, false);
        declareFunction("powerloom_trace", "POWERLOOM-TRACE", 1, 0, false);
        declareFunction("powerloom_server_handler_internal", "POWERLOOM-SERVER-HANDLER-INTERNAL", 2, 0, false);
        declareFunction("powerloom_process_invitation", "POWERLOOM-PROCESS-INVITATION", 2, 0, false);
        declareFunction("powerloom_process_stimulate", "POWERLOOM-PROCESS-STIMULATE", 8, 0, false);
        declareFunction("powerloom_construct_aal_from_query", "POWERLOOM-CONSTRUCT-AAL-FROM-QUERY", 6, 0, false);
        declareFunction("stringify_formula", "STRINGIFY-FORMULA", 1, 0, false);
        declareFunction("cycl_expression_to_string_expression", "CYCL-EXPRESSION-TO-STRING-EXPRESSION", 1, 0, false);
        declareFunction("string_expression_to_cycl_expression", "STRING-EXPRESSION-TO-CYCL-EXPRESSION", 1, 0, false);
        declareFunction("string_nat_expression_to_nat", "STRING-NAT-EXPRESSION-TO-NAT", 1, 0, false);
        declareFunction("powerloom_spawn_listener", "POWERLOOM-SPAWN-LISTENER", 5, 0, false);
        declareFunction("powerloom_reply_posting_listener", "POWERLOOM-REPLY-POSTING-LISTENER", 5, 0, false);
        declareFunction("read_powerloom_server_request", "READ-POWERLOOM-SERVER-REQUEST", 1, 0, false);
        declareFunction("write_powerloom_server_reaction", "WRITE-POWERLOOM-SERVER-REACTION", 2, 0, false);
        declareFunction("enqueue_powerloom_problematic_query", "ENQUEUE-POWERLOOM-PROBLEMATIC-QUERY", 2, 4, false);
        declareFunction("wait_on_powerloom_problematic_query", "WAIT-ON-POWERLOOM-PROBLEMATIC-QUERY", 0, 0, false);
        declareFunction("powerloom_obtain_problematic_query", "POWERLOOM-OBTAIN-PROBLEMATIC-QUERY", 0, 0, false);
        declareFunction("register_powerloom_result_handler", "REGISTER-POWERLOOM-RESULT-HANDLER", 1, 0, false);
        declareFunction("powerloom_generate_response", "POWERLOOM-GENERATE-RESPONSE", 1, 0, false);
        declareFunction("debugging_setup_powerloom_problematic_query", "DEBUGGING-SETUP-POWERLOOM-PROBLEMATIC-QUERY", 0, 0, false);
        declareFunction("current_powerloom_debugging_query", "CURRENT-POWERLOOM-DEBUGGING-QUERY", 0, 0, false);
        declareFunction("initialize_powerloom_handling", "INITIALIZE-POWERLOOM-HANDLING", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_rkf_collaborator_powerloom_file() {
        defparameter("*WITHIN-POWERLOOM-SERVER*", NIL);
        defparameter("*POWERLOOM-SERVER-PORT*", $int$3599);
        defparameter("*USE-VIRB3-FOR-POWERLOOM*", NIL);
        deflexical("*POWERLOOM-EMNAME*", $$$WhyNot);
        deflexical("*POWERLOOM-APPNAME*", $$$KRAKEN);
        defparameter("*POWERLOOM-SID*", NIL);
        defparameter("*POWERLOOM-EMID*", NIL);
        defparameter("*POWERLOOM-TID*", NIL);
        defparameter("*POWERLOOM-TRANSACTION-STACK*", NIL);
        deflexical("*POWERLOOM-INTERNAL-PID-COUNTER*", integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        deflexical("*POWERLOOM-PROBLEMATIC-QUERIES*", queues.create_queue());
        deflexical("*MOST-RECENT-POWERLOOM-RESULT*", NIL);
        deflexical("*POWERLOOM-RESULT-LOCK*", make_lock($$$PowerLOOM_Results));
        deflexical("*POWERLOOM-RESULT-HANDLERS*", NIL);
        return NIL;
    }

    public static final SubLObject setup_rkf_collaborator_powerloom_file() {
                tcp_server_utilities.register_tcp_server_type($POWERLOOM, POWERLOOM_SERVER_HANDLER, $TEXT);
        return NIL;
    }

    // // Internal Constants
    public static final SubLInteger $int$3599 = makeInteger(3599);

    private static final SubLSymbol $POWERLOOM = makeKeyword("POWERLOOM");

    private static final SubLSymbol POWERLOOM_SERVER_HANDLER = makeSymbol("POWERLOOM-SERVER-HANDLER");



    static private final SubLString $$$CYC = makeString("CYC");



    private static final SubLSymbol $POWERLOOM_QUIT = makeKeyword("POWERLOOM-QUIT");

    static private final SubLString $$$WhyNot = makeString("WhyNot");

    static private final SubLString $$$KRAKEN = makeString("KRAKEN");

























    private static final SubLSymbol $BACKCHAINS = makeKeyword("BACKCHAINS");





    static private final SubLSymbol $sym24$_QUERY = makeSymbol("?QUERY");

    static private final SubLString $str_alt25$FAILED_QUERY = makeString("FAILED-QUERY");



    private static final SubLSymbol $INTERNAL_PID = makeKeyword("INTERNAL-PID");

    static private final SubLSymbol $sym28$_THE_POSTING = makeSymbol("?THE-POSTING");

    static private final SubLString $$$POSTING = makeString("POSTING");

    static private final SubLString $$$PowerLoom_Listener = makeString("PowerLoom Listener");

    private static final SubLSymbol POWERLOOM_REPLY_POSTING_LISTENER = makeSymbol("POWERLOOM-REPLY-POSTING-LISTENER");





    static private final SubLString $str_alt34$PowerLOOM_errored_out_and_generat = makeString("PowerLOOM errored out and generated a disconnect message.");

    static private final SubLString $str_alt35$Protocol_violation____received__A = makeString("Protocol violation -- received ~A instead of a valid message.");



    private static final SubLSymbol $EXECUTE = makeKeyword("EXECUTE");





    public static final SubLInteger $int$30 = makeInteger(30);





    static private final SubLString $$$waiting_for_query = makeString("waiting for query");

    private static final SubLSymbol WAIT_ON_POWERLOOM_PROBLEMATIC_QUERY = makeSymbol("WAIT-ON-POWERLOOM-PROBLEMATIC-QUERY");

    static private final SubLList $list_alt45 = list(makeSymbol("&KEY"), makeSymbol("QUERY"), makeSymbol("MT"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt46 = list(makeKeyword("QUERY"), makeKeyword("MT"), makeKeyword("BACKCHAIN"), makeKeyword("NUMBER"), $TIME, makeKeyword("DEPTH"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLString $$$PowerLOOM_Results = makeString("PowerLOOM Results");

    public static final SubLInteger $int$2400 = makeInteger(2400);

    public static final SubLInteger $int$120 = makeInteger(120);



    // // Initializers
    public void declareFunctions() {
        declare_rkf_collaborator_powerloom_file();
    }

    public void initializeVariables() {
        init_rkf_collaborator_powerloom_file();
    }

    public void runTopLevelForms() {
        setup_rkf_collaborator_powerloom_file();
    }
}

