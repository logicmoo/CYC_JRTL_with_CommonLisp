package com.cyc.cycjava.cycl.inference.harness;


import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
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

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class inference_proof_spec_store extends SubLTranslatedFile {
    public static final SubLFile me = new inference_proof_spec_store();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store";

    public static final String myFingerPrint = "8e34e9995de1906ff0095b83deac3484e7cbd9e51bfd2e4f707598e367ef98ce";

    // deflexical
    public static final SubLSymbol $default_proof_spec_store_host$ = makeSymbol("*DEFAULT-PROOF-SPEC-STORE-HOST*");

    // deflexical
    public static final SubLSymbol $default_proof_spec_store_port$ = makeSymbol("*DEFAULT-PROOF-SPEC-STORE-PORT*");







    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    public static final SubLString $$$localhost = makeString("localhost");

    private static final SubLInteger $int$2112 = makeInteger(2112);

    public static final SubLList $list4 = list(list(makeSymbol("HOST"), makeSymbol("PORT")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $proof_spec_store_host$ = makeSymbol("*PROOF-SPEC-STORE-HOST*");

    public static final SubLSymbol $proof_spec_store_port$ = makeSymbol("*PROOF-SPEC-STORE-PORT*");











    public static final SubLString $$$Unexpected_reply_ = makeString("Unexpected reply ");

    public static final SubLString $str14$_from_TCP_IP_layer_ = makeString(" from TCP/IP layer.");



    public static final SubLList $list16 = list(list(makeSymbol("STREAM"), makeSymbol("TAG")), makeSymbol("&BODY"), makeSymbol("BODY"));





    public static final SubLString $str19$_ = makeString("<");

    public static final SubLString $str20$_ = makeString(">");

    public static final SubLString $str21$__ = makeString("</");

    public static final SubLList $list22 = list(list(makeSymbol("STREAM"), makeSymbol("REQUEST-STRING")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol WITH_XML_TAG = makeSymbol("WITH-XML-TAG");

    public static final SubLList $list25 = list(makeString("request"));

    public static final SubLString $$$request = makeString("request");

    public static final SubLString $$$suggest = makeString("suggest");

    public static final SubLString $$$version = makeString("version");

    public static final SubLString $$$queryKey = makeString("queryKey");

    public static final SubLString $$$keyItems = makeString("keyItems");

    public static final SubLString $$$keyItem = makeString("keyItem");

    public static final SubLString $str32$_fixnum_value__ = makeString("<fixnum value=\"");

    public static final SubLString $str33$___ = makeString("\"/>");

    public static final SubLString $str34$_string_value__ = makeString("<string value=\"");

    public static final SubLString $str35$Invalid_key_item__A____neither_st = makeString("Invalid key item ~A -- neither string nor fixnum.");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    public static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    public static final SubLSymbol $sym38$_EXIT = makeSymbol("%EXIT");

    public static SubLObject query_to_proof_spec_lookup_key(SubLObject el_query, SubLObject elmt) {
        if (elmt == UNPROVIDED) {
            elmt = $NON_PROVIDED;
        }
        if ($NON_PROVIDED != elmt) {
            el_query = make_binary_formula($$ist, elmt, el_query);
        }
        final SubLObject problem_query = problem_query_for_el_query(el_query);
        return problem_query_to_proof_spec_lookup_key(problem_query);
    }

    public static SubLObject problem_query_to_proof_spec_lookup_key(final SubLObject problem_query) {
        final SubLObject generlized_query = inference_proof_spec.genericize_problem_query(problem_query);
        final SubLObject signature = problem_query_signature_for_problem_query(generlized_query);
        return signature;
    }

    public static SubLObject externalize_proof_spec_lookup_key(final SubLObject proof_spec_key) {
        SubLObject externalized_key = NIL;
        SubLObject cdolist_list_var = proof_spec_key;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!item.isFixnum()) {
                if (NIL != constant_p(item)) {
                    item = Guids.guid_to_string(constants_high.constant_external_id(item));
                } else
                    if (item.isSymbol()) {
                        item = string_utilities.to_string(item);
                    } else {
                        item = kb_utilities.hl_external_id_string(item);
                    }

            }
            externalized_key = cons(item, externalized_key);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return nreverse(externalized_key);
    }

    public static SubLObject problem_query_signature_for_problem_query(final SubLObject problem_query) {
        final SubLObject signature = inference_datastructures_problem_query.problem_query_term_signature(problem_query);
        return signature;
    }

    public static SubLObject problem_query_for_el_query(final SubLObject el_query) {
        final SubLObject inference = inference_kernel.new_continuable_inference(el_query, UNPROVIDED, UNPROVIDED);
        final SubLObject problem_query = inference_datastructures_inference.inference_hl_query(inference);
        return problem_query;
    }

    public static SubLObject pickle_individual_proof_spec(final SubLObject proof_spec) {
        final SubLObject generic_proof_spec = inference_proof_spec.genericize_proof_spec(proof_spec);
        return pickle_genericized_proof_spec(generic_proof_spec);
    }

    public static SubLObject pickle_genericized_proof_spec(final SubLObject generic_proof_spec) {
        return kb_utilities.hl_external_id_string(generic_proof_spec);
    }

    public static SubLObject unpickle_genericized_proof_spec(final SubLObject pickled_form) {
        return kb_utilities.find_object_by_hl_external_id_string(pickled_form);
    }

    public static SubLObject with_proof_spec_store(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject host = NIL;
        SubLObject port = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        host = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        port = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($proof_spec_store_host$, host), list($proof_spec_store_port$, port)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list4);
        return NIL;
    }

    public static SubLObject is_proof_spec_store_availableP() {
        return list_utilities.sublisp_boolean(proof_spec_store_version());
    }

    public static SubLObject suggest_proof_specs_for_problem_query(final SubLObject problem_query) {
        final SubLObject externalized_key = externalize_proof_spec_lookup_key(problem_query_to_proof_spec_lookup_key(problem_query));
        final SubLObject command = generate_suggest_command(externalized_key);
        final SubLObject result = communicate_with_proof_spec_store(command);
        if (NIL != proof_spec_store_success_reply_p(result)) {
            SubLObject cdolist_list_var;
            final SubLObject descriptions = cdolist_list_var = proof_spec_store_reply_nth_result(ZERO_INTEGER, result);
            SubLObject description = NIL;
            description = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pickled_proof_spec = getf(description, $PROOF_SPEC, UNPROVIDED);
                final SubLObject proof_spec = unpickle_genericized_proof_spec(pickled_proof_spec);
                putf(description, $PROOF_SPEC, proof_spec);
                cdolist_list_var = cdolist_list_var.rest();
                description = cdolist_list_var.first();
            } 
            return descriptions;
        }
        return NIL;
    }

    public static SubLObject proof_spec_store_version() {
        final SubLObject command = generate_version_command();
        final SubLObject result = communicate_with_proof_spec_store(command);
        if (NIL != proof_spec_store_success_reply_p(result)) {
            return proof_spec_store_reply_results(result);
        }
        return NIL;
    }

    public static SubLObject communicate_with_proof_spec_store(final SubLObject command) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject s = NIL;
                    try {
                        s = subl_promotions.open_tcp_stream_with_timeout($proof_spec_store_host$.getDynamicValue(thread), $proof_spec_store_port$.getDynamicValue(thread), NIL, $PUBLIC);
                        if (NIL != validate_tcp_connection(s, $proof_spec_store_host$.getDynamicValue(thread), $proof_spec_store_port$.getDynamicValue(thread))) {
                            write_string(command, s, UNPROVIDED, UNPROVIDED);
                            string_utilities.network_terpri(s);
                            force_output(s);
                            final SubLObject reply = read(s, NIL, $EOF, UNPROVIDED);
                            if (reply.isCons()) {
                                result = eval(reply);
                            } else {
                                result = list($ERROR, cconcatenate($$$Unexpected_reply_, new SubLObject[]{ format_nil.format_nil_a_no_copy(reply), $str14$_from_TCP_IP_layer_ }));
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != s) {
                                close(s, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            result = list($ERROR, message);
        }
        return result;
    }

    public static SubLObject proof_spec_store_reply_p(final SubLObject result) {
        return makeBoolean(result.isCons() && result.first().isKeyword());
    }

    public static SubLObject proof_spec_store_error_reply_p(final SubLObject result) {
        return makeBoolean((NIL != proof_spec_store_reply_p(result)) && ($ERROR == result.first()));
    }

    public static SubLObject proof_spec_store_success_reply_p(final SubLObject result) {
        return makeBoolean((NIL != proof_spec_store_reply_p(result)) && ($OK == result.first()));
    }

    public static SubLObject proof_spec_store_reply_results(final SubLObject result) {
        return NIL != proof_spec_store_reply_p(result) ? result.rest() : NIL;
    }

    public static SubLObject proof_spec_store_reply_nth_result(final SubLObject n, final SubLObject result) {
        final SubLObject results = proof_spec_store_reply_results(result);
        return nth(n, results);
    }

    public static SubLObject with_xml_tag(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        SubLObject tag = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        tag = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(PROGN, list(WRITE_STRING, $str19$_, stream), list(WRITE_STRING, tag, stream), list(WRITE_STRING, $str20$_, stream), append(body, list(list(WRITE_STRING, $str21$__, stream), list(WRITE_STRING, tag, stream), list(WRITE_STRING, $str20$_, stream))));
        }
        cdestructuring_bind_error(datum, $list16);
        return NIL;
    }

    public static SubLObject with_request_to_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        SubLObject request_string = NIL;
        destructuring_bind_must_consp(current, datum, $list22);
        stream = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        request_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CWITH_OUTPUT_TO_STRING, list(stream, request_string), listS(WITH_XML_TAG, bq_cons(stream, $list25), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list22);
        return NIL;
    }

    public static SubLObject generate_suggest_command(final SubLObject externalized_key) {
        SubLObject result = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            write_string($str19$_, s, UNPROVIDED, UNPROVIDED);
            write_string($$$request, s, UNPROVIDED, UNPROVIDED);
            write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            write_string($str19$_, s, UNPROVIDED, UNPROVIDED);
            write_string($$$suggest, s, UNPROVIDED, UNPROVIDED);
            write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            generate_query_key_command_section(externalized_key, s);
            write_string($str21$__, s, UNPROVIDED, UNPROVIDED);
            write_string($$$suggest, s, UNPROVIDED, UNPROVIDED);
            write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            write_string($str21$__, s, UNPROVIDED, UNPROVIDED);
            write_string($$$request, s, UNPROVIDED, UNPROVIDED);
            write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            result = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    public static SubLObject generate_version_command() {
        SubLObject result = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            write_string($str19$_, s, UNPROVIDED, UNPROVIDED);
            write_string($$$request, s, UNPROVIDED, UNPROVIDED);
            write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            write_string($str19$_, s, UNPROVIDED, UNPROVIDED);
            write_string($$$version, s, UNPROVIDED, UNPROVIDED);
            write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            write_string($str21$__, s, UNPROVIDED, UNPROVIDED);
            write_string($$$version, s, UNPROVIDED, UNPROVIDED);
            write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            write_string($str21$__, s, UNPROVIDED, UNPROVIDED);
            write_string($$$request, s, UNPROVIDED, UNPROVIDED);
            write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            result = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    public static SubLObject generate_query_key_command_section(final SubLObject externalized_key, final SubLObject s) {
        write_string($str19$_, s, UNPROVIDED, UNPROVIDED);
        write_string($$$queryKey, s, UNPROVIDED, UNPROVIDED);
        write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
        write_string($str19$_, s, UNPROVIDED, UNPROVIDED);
        write_string($$$keyItems, s, UNPROVIDED, UNPROVIDED);
        write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = externalized_key;
        SubLObject key_item = NIL;
        key_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            write_string($str19$_, s, UNPROVIDED, UNPROVIDED);
            write_string($$$keyItem, s, UNPROVIDED, UNPROVIDED);
            write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            if (key_item.isFixnum()) {
                write_string($str32$_fixnum_value__, s, UNPROVIDED, UNPROVIDED);
                princ(key_item, s);
                write_string($str33$___, s, UNPROVIDED, UNPROVIDED);
            } else
                if (key_item.isString()) {
                    write_string($str34$_string_value__, s, UNPROVIDED, UNPROVIDED);
                    princ(key_item, s);
                    write_string($str33$___, s, UNPROVIDED, UNPROVIDED);
                } else {
                    Errors.error($str35$Invalid_key_item__A____neither_st, key_item);
                }

            write_string($str21$__, s, UNPROVIDED, UNPROVIDED);
            write_string($$$keyItem, s, UNPROVIDED, UNPROVIDED);
            write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            key_item = cdolist_list_var.first();
        } 
        write_string($str21$__, s, UNPROVIDED, UNPROVIDED);
        write_string($$$keyItems, s, UNPROVIDED, UNPROVIDED);
        write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
        write_string($str21$__, s, UNPROVIDED, UNPROVIDED);
        write_string($$$queryKey, s, UNPROVIDED, UNPROVIDED);
        write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
        return externalized_key;
    }

    public static SubLObject generate_proof_spec_from_kbq(final SubLObject kbq_term, final SubLObject proof_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject sentence = kb_query.kbq_sentence(kbq_term);
                    final SubLObject mt = kb_query.kbq_mt(kbq_term);
                    final SubLObject lookup_key = query_to_proof_spec_lookup_key(sentence, mt);
                    final SubLObject externalized_key = externalize_proof_spec_lookup_key(lookup_key);
                    final SubLObject pickled_proof_spec = pickle_individual_proof_spec(proof_spec);
                    return values(externalized_key, pickled_proof_spec);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return values(NIL, NIL);
    }

    public static SubLObject generate_query_lookup_key_from_kbq(final SubLObject kbq_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject sentence = kb_query.kbq_sentence(kbq_term);
                    final SubLObject mt = kb_query.kbq_mt(kbq_term);
                    final SubLObject lookup_key = query_to_proof_spec_lookup_key(sentence, mt);
                    final SubLObject externalized_key = externalize_proof_spec_lookup_key(lookup_key);
                    return externalized_key;
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static SubLObject declare_inference_proof_spec_store_file() {
        declareFunction(me, "query_to_proof_spec_lookup_key", "QUERY-TO-PROOF-SPEC-LOOKUP-KEY", 1, 1, false);
        declareFunction(me, "problem_query_to_proof_spec_lookup_key", "PROBLEM-QUERY-TO-PROOF-SPEC-LOOKUP-KEY", 1, 0, false);
        declareFunction(me, "externalize_proof_spec_lookup_key", "EXTERNALIZE-PROOF-SPEC-LOOKUP-KEY", 1, 0, false);
        declareFunction(me, "problem_query_signature_for_problem_query", "PROBLEM-QUERY-SIGNATURE-FOR-PROBLEM-QUERY", 1, 0, false);
        declareFunction(me, "problem_query_for_el_query", "PROBLEM-QUERY-FOR-EL-QUERY", 1, 0, false);
        declareFunction(me, "pickle_individual_proof_spec", "PICKLE-INDIVIDUAL-PROOF-SPEC", 1, 0, false);
        declareFunction(me, "pickle_genericized_proof_spec", "PICKLE-GENERICIZED-PROOF-SPEC", 1, 0, false);
        declareFunction(me, "unpickle_genericized_proof_spec", "UNPICKLE-GENERICIZED-PROOF-SPEC", 1, 0, false);
        declareMacro(me, "with_proof_spec_store", "WITH-PROOF-SPEC-STORE");
        declareFunction(me, "is_proof_spec_store_availableP", "IS-PROOF-SPEC-STORE-AVAILABLE?", 0, 0, false);
        declareFunction(me, "suggest_proof_specs_for_problem_query", "SUGGEST-PROOF-SPECS-FOR-PROBLEM-QUERY", 1, 0, false);
        declareFunction(me, "proof_spec_store_version", "PROOF-SPEC-STORE-VERSION", 0, 0, false);
        declareFunction(me, "communicate_with_proof_spec_store", "COMMUNICATE-WITH-PROOF-SPEC-STORE", 1, 0, false);
        declareFunction(me, "proof_spec_store_reply_p", "PROOF-SPEC-STORE-REPLY-P", 1, 0, false);
        declareFunction(me, "proof_spec_store_error_reply_p", "PROOF-SPEC-STORE-ERROR-REPLY-P", 1, 0, false);
        declareFunction(me, "proof_spec_store_success_reply_p", "PROOF-SPEC-STORE-SUCCESS-REPLY-P", 1, 0, false);
        declareFunction(me, "proof_spec_store_reply_results", "PROOF-SPEC-STORE-REPLY-RESULTS", 1, 0, false);
        declareFunction(me, "proof_spec_store_reply_nth_result", "PROOF-SPEC-STORE-REPLY-NTH-RESULT", 2, 0, false);
        declareMacro(me, "with_xml_tag", "WITH-XML-TAG");
        declareMacro(me, "with_request_to_string", "WITH-REQUEST-TO-STRING");
        declareFunction(me, "generate_suggest_command", "GENERATE-SUGGEST-COMMAND", 1, 0, false);
        declareFunction(me, "generate_version_command", "GENERATE-VERSION-COMMAND", 0, 0, false);
        declareFunction(me, "generate_query_key_command_section", "GENERATE-QUERY-KEY-COMMAND-SECTION", 2, 0, false);
        declareFunction(me, "generate_proof_spec_from_kbq", "GENERATE-PROOF-SPEC-FROM-KBQ", 2, 0, false);
        declareFunction(me, "generate_query_lookup_key_from_kbq", "GENERATE-QUERY-LOOKUP-KEY-FROM-KBQ", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_proof_spec_store_file() {
        deflexical("*DEFAULT-PROOF-SPEC-STORE-HOST*", $$$localhost);
        deflexical("*DEFAULT-PROOF-SPEC-STORE-PORT*", $int$2112);
        defparameter("*PROOF-SPEC-STORE-HOST*", $default_proof_spec_store_host$.getGlobalValue());
        defparameter("*PROOF-SPEC-STORE-PORT*", $default_proof_spec_store_port$.getGlobalValue());
        return NIL;
    }

    public static SubLObject setup_inference_proof_spec_store_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_proof_spec_store_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_proof_spec_store_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_proof_spec_store_file();
    }

    static {












































    }
}

/**
 * Total time: 180 ms
 */
