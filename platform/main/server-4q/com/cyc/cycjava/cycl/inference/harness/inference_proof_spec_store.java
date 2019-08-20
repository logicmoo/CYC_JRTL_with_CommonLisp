package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_proof_spec_store extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "8e34e9995de1906ff0095b83deac3484e7cbd9e51bfd2e4f707598e367ef98ce";
    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 3400L)
    public static SubLSymbol $default_proof_spec_store_host$;
    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 3500L)
    public static SubLSymbol $default_proof_spec_store_port$;
    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 3600L)
    public static SubLSymbol $proof_spec_store_host$;
    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 3700L)
    public static SubLSymbol $proof_spec_store_port$;
    private static SubLSymbol $NON_PROVIDED;
    private static SubLObject $$ist;
    private static SubLString $str2$localhost;
    private static SubLInteger $int$2112;
    private static SubLList $list4;
    private static SubLSymbol $sym5$CLET;
    private static SubLSymbol $sym6$_PROOF_SPEC_STORE_HOST_;
    private static SubLSymbol $sym7$_PROOF_SPEC_STORE_PORT_;
    private static SubLSymbol $PROOF_SPEC;
    private static SubLSymbol $sym9$CATCH_ERROR_MESSAGE_HANDLER;
    private static SubLSymbol $PUBLIC;
    private static SubLSymbol $EOF;
    private static SubLSymbol $ERROR;
    private static SubLString $str13$Unexpected_reply_;
    private static SubLString $str14$_from_TCP_IP_layer_;
    private static SubLSymbol $OK;
    private static SubLList $list16;
    private static SubLSymbol $sym17$PROGN;
    private static SubLSymbol $sym18$WRITE_STRING;
    private static SubLString $str19$_;
    private static SubLString $str20$_;
    private static SubLString $str21$__;
    private static SubLList $list22;
    private static SubLSymbol $sym23$CWITH_OUTPUT_TO_STRING;
    private static SubLSymbol $sym24$WITH_XML_TAG;
    private static SubLList $list25;
    private static SubLString $str26$request;
    private static SubLString $str27$suggest;
    private static SubLString $str28$version;
    private static SubLString $str29$queryKey;
    private static SubLString $str30$keyItems;
    private static SubLString $str31$keyItem;
    private static SubLString $str32$_fixnum_value__;
    private static SubLString $str33$___;
    private static SubLString $str34$_string_value__;
    private static SubLString $str35$Invalid_key_item__A____neither_st;
    private static SubLSymbol $IGNORE_ERRORS_TARGET;
    private static SubLSymbol $sym37$IGNORE_ERRORS_HANDLER;
    private static SubLSymbol $sym38$_EXIT;

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 1200L)
    public static SubLObject query_to_proof_spec_lookup_key(SubLObject el_query, SubLObject elmt) {
        if (elmt == UNPROVIDED) {
            elmt = $NON_PROVIDED;
        }
        if ($NON_PROVIDED != elmt) {
            el_query = el_utilities.make_binary_formula($$ist, elmt, el_query);
        }
        SubLObject problem_query = problem_query_for_el_query(el_query);
        return problem_query_to_proof_spec_lookup_key(problem_query);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 1700L)
    public static SubLObject problem_query_to_proof_spec_lookup_key(SubLObject problem_query) {
        SubLObject generlized_query = inference_proof_spec.genericize_problem_query(problem_query);
        SubLObject signature = problem_query_signature_for_problem_query(generlized_query);
        return signature;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 2000L)
    public static SubLObject externalize_proof_spec_lookup_key(SubLObject proof_spec_key) {
        SubLObject externalized_key = NIL;
        SubLObject cdolist_list_var = proof_spec_key;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!item.isFixnum()) {
                if (isConstSym(item)) {
                    item = Guids.guid_to_string(constants_high.constant_external_id(item));
                } else if (item.isSymbol()) {
                    item = string_utilities.to_string(item);
                } else {
                    item = kb_utilities.hl_external_id_string(item);
                }
            }
            externalized_key = cons(item, externalized_key);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return Sequences.nreverse(externalized_key);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 2500L)
    public static SubLObject problem_query_signature_for_problem_query(SubLObject problem_query) {
        SubLObject signature = inference_datastructures_problem_query.problem_query_term_signature(problem_query);
        return signature;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 2600L)
    public static SubLObject problem_query_for_el_query(SubLObject el_query) {
        SubLObject inference = inference_kernel.new_continuable_inference(el_query, UNPROVIDED, UNPROVIDED);
        SubLObject problem_query = inference_datastructures_inference.inference_hl_query(inference);
        return problem_query;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 2900L)
    public static SubLObject pickle_individual_proof_spec(SubLObject proof_spec) {
        SubLObject generic_proof_spec = inference_proof_spec.genericize_proof_spec(proof_spec);
        return pickle_genericized_proof_spec(generic_proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 3100L)
    public static SubLObject pickle_genericized_proof_spec(SubLObject generic_proof_spec) {
        return kb_utilities.hl_external_id_string(generic_proof_spec);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 3300L)
    public static SubLObject unpickle_genericized_proof_spec(SubLObject pickled_form) {
        return kb_utilities.find_object_by_hl_external_id_string(pickled_form);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 3900L)
    public static SubLObject with_proof_spec_store(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject host = NIL;
        SubLObject port = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
        host = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list4);
        port = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return listS($sym5$CLET, list(list($sym6$_PROOF_SPEC_STORE_HOST_, host), list($sym7$_PROOF_SPEC_STORE_PORT_, port)), append(body, NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list4);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 4100L)
    public static SubLObject is_proof_spec_store_availableP() {
        return list_utilities.sublisp_boolean(proof_spec_store_version());
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 4300L)
    public static SubLObject suggest_proof_specs_for_problem_query(SubLObject problem_query) {
        SubLObject externalized_key = externalize_proof_spec_lookup_key(problem_query_to_proof_spec_lookup_key(problem_query));
        SubLObject command = generate_suggest_command(externalized_key);
        SubLObject result = communicate_with_proof_spec_store(command);
        if (NIL != proof_spec_store_success_reply_p(result)) {
            SubLObject cdolist_list_var;
            SubLObject descriptions = cdolist_list_var = proof_spec_store_reply_nth_result(ZERO_INTEGER, result);
            SubLObject description = NIL;
            description = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject pickled_proof_spec = conses_high.getf(description, $PROOF_SPEC, UNPROVIDED);
                SubLObject proof_spec = unpickle_genericized_proof_spec(pickled_proof_spec);
                conses_high.putf(description, $PROOF_SPEC, proof_spec);
                cdolist_list_var = cdolist_list_var.rest();
                description = cdolist_list_var.first();
            }
            return descriptions;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 5200L)
    public static SubLObject proof_spec_store_version() {
        SubLObject command = generate_version_command();
        SubLObject result = communicate_with_proof_spec_store(command);
        if (NIL != proof_spec_store_success_reply_p(result)) {
            return proof_spec_store_reply_results(result);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 5500L)
    public static SubLObject communicate_with_proof_spec_store(SubLObject command) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject message = NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind($sym9$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject s = NIL;
                    try {
                        s = subl_promotions.open_tcp_stream_with_timeout($proof_spec_store_host$.getDynamicValue(thread), $proof_spec_store_port$.getDynamicValue(thread), NIL, $PUBLIC);
                        if (NIL != subl_macro_promotions.validate_tcp_connection(s, $proof_spec_store_host$.getDynamicValue(thread), $proof_spec_store_port$.getDynamicValue(thread))) {
                            streams_high.write_string(command, s, UNPROVIDED, UNPROVIDED);
                            string_utilities.network_terpri(s);
                            streams_high.force_output(s);
                            SubLObject reply = reader.read(s, NIL, $EOF, UNPROVIDED);
                            if (reply.isCons()) {
                                result = Eval.eval(reply);
                            } else {
                                result = list($ERROR, Sequences.cconcatenate($str13$Unexpected_reply_, new SubLObject[] { format_nil.format_nil_a_no_copy(reply), $str14$_from_TCP_IP_layer_ }));
                            }
                        }
                    } finally {
                        SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                            SubLObject _values = Values.getValuesAsVector();
                            if (NIL != s) {
                                streams_high.close(s, UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        } finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                } catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (Throwable ccatch_env_var) {
            message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            result = list($ERROR, message);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 6400L)
    public static SubLObject proof_spec_store_reply_p(SubLObject result) {
        return makeBoolean(result.isCons() && result.first().isKeyword());
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 6500L)
    public static SubLObject proof_spec_store_error_reply_p(SubLObject result) {
        return makeBoolean(NIL != proof_spec_store_reply_p(result) && $ERROR == result.first());
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 6700L)
    public static SubLObject proof_spec_store_success_reply_p(SubLObject result) {
        return makeBoolean(NIL != proof_spec_store_reply_p(result) && $OK == result.first());
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 6800L)
    public static SubLObject proof_spec_store_reply_results(SubLObject result) {
        return (NIL != proof_spec_store_reply_p(result)) ? result.rest() : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 7000L)
    public static SubLObject proof_spec_store_reply_nth_result(SubLObject n, SubLObject result) {
        SubLObject results = proof_spec_store_reply_results(result);
        return nth(n, results);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 7100L)
    public static SubLObject with_xml_tag(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        SubLObject tag = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
        stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
        tag = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return listS($sym17$PROGN, list($sym18$WRITE_STRING, $str19$_, stream), list($sym18$WRITE_STRING, tag, stream), list($sym18$WRITE_STRING, $str20$_, stream),
                    append(body, list(list($sym18$WRITE_STRING, $str21$__, stream), list($sym18$WRITE_STRING, tag, stream), list($sym18$WRITE_STRING, $str20$_, stream))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 7600L)
    public static SubLObject with_request_to_string(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = NIL;
        SubLObject request_string = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
        stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list22);
        request_string = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            return list($sym23$CWITH_OUTPUT_TO_STRING, list(stream, request_string), listS($sym24$WITH_XML_TAG, reader.bq_cons(stream, $list25), append(body, NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list22);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 7900L)
    public static SubLObject generate_suggest_command(SubLObject externalized_key) {
        SubLObject result = NIL;
        SubLObject s = NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            streams_high.write_string($str19$_, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str26$request, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str19$_, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str27$suggest, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            generate_query_key_command_section(externalized_key, s);
            streams_high.write_string($str21$__, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str27$suggest, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str21$__, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str26$request, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            result = streams_high.get_output_stream_string(s);
        } finally {
            SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            } finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 8100L)
    public static SubLObject generate_version_command() {
        SubLObject result = NIL;
        SubLObject s = NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            streams_high.write_string($str19$_, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str26$request, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str19$_, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str28$version, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str21$__, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str28$version, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str21$__, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str26$request, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            result = streams_high.get_output_stream_string(s);
        } finally {
            SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            } finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 8300L)
    public static SubLObject generate_query_key_command_section(SubLObject externalized_key, SubLObject s) {
        streams_high.write_string($str19$_, s, UNPROVIDED, UNPROVIDED);
        streams_high.write_string($str29$queryKey, s, UNPROVIDED, UNPROVIDED);
        streams_high.write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
        streams_high.write_string($str19$_, s, UNPROVIDED, UNPROVIDED);
        streams_high.write_string($str30$keyItems, s, UNPROVIDED, UNPROVIDED);
        streams_high.write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = externalized_key;
        SubLObject key_item = NIL;
        key_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            streams_high.write_string($str19$_, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str31$keyItem, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            if (key_item.isFixnum()) {
                streams_high.write_string($str32$_fixnum_value__, s, UNPROVIDED, UNPROVIDED);
                print_high.princ(key_item, s);
                streams_high.write_string($str33$___, s, UNPROVIDED, UNPROVIDED);
            } else if (key_item.isString()) {
                streams_high.write_string($str34$_string_value__, s, UNPROVIDED, UNPROVIDED);
                print_high.princ(key_item, s);
                streams_high.write_string($str33$___, s, UNPROVIDED, UNPROVIDED);
            } else {
                Errors.error($str35$Invalid_key_item__A____neither_st, key_item);
            }
            streams_high.write_string($str21$__, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str31$keyItem, s, UNPROVIDED, UNPROVIDED);
            streams_high.write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            key_item = cdolist_list_var.first();
        }
        streams_high.write_string($str21$__, s, UNPROVIDED, UNPROVIDED);
        streams_high.write_string($str30$keyItems, s, UNPROVIDED, UNPROVIDED);
        streams_high.write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
        streams_high.write_string($str21$__, s, UNPROVIDED, UNPROVIDED);
        streams_high.write_string($str29$queryKey, s, UNPROVIDED, UNPROVIDED);
        streams_high.write_string($str20$_, s, UNPROVIDED, UNPROVIDED);
        return externalized_key;
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 8900L)
    public static SubLObject generate_proof_spec_from_kbq(SubLObject kbq_term, SubLObject proof_spec) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function($sym37$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject sentence = kb_query.kbq_sentence(kbq_term);
                    SubLObject mt = kb_query.kbq_mt(kbq_term);
                    SubLObject lookup_key = query_to_proof_spec_lookup_key(sentence, mt);
                    SubLObject externalized_key = externalize_proof_spec_lookup_key(lookup_key);
                    SubLObject pickled_proof_spec = pickle_individual_proof_spec(proof_spec);
                    return Values.values(externalized_key, pickled_proof_spec);
                } catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return Values.values(NIL, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 9700L)
    public static SubLObject generate_query_lookup_key_from_kbq(SubLObject kbq_term) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function($sym37$IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject sentence = kb_query.kbq_sentence(kbq_term);
                    SubLObject mt = kb_query.kbq_mt(kbq_term);
                    SubLObject lookup_key = query_to_proof_spec_lookup_key(sentence, mt);
                    SubLObject externalized_key = externalize_proof_spec_lookup_key(lookup_key);
                    return externalized_key;
                } catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static SubLObject declare_inference_proof_spec_store_file() {
        declareFunction("query_to_proof_spec_lookup_key", "QUERY-TO-PROOF-SPEC-LOOKUP-KEY", 1, 1, false);
        declareFunction("problem_query_to_proof_spec_lookup_key", "PROBLEM-QUERY-TO-PROOF-SPEC-LOOKUP-KEY", 1, 0, false);
        declareFunction("externalize_proof_spec_lookup_key", "EXTERNALIZE-PROOF-SPEC-LOOKUP-KEY", 1, 0, false);
        declareFunction("problem_query_signature_for_problem_query", "PROBLEM-QUERY-SIGNATURE-FOR-PROBLEM-QUERY", 1, 0, false);
        declareFunction("problem_query_for_el_query", "PROBLEM-QUERY-FOR-EL-QUERY", 1, 0, false);
        declareFunction("pickle_individual_proof_spec", "PICKLE-INDIVIDUAL-PROOF-SPEC", 1, 0, false);
        declareFunction("pickle_genericized_proof_spec", "PICKLE-GENERICIZED-PROOF-SPEC", 1, 0, false);
        declareFunction("unpickle_genericized_proof_spec", "UNPICKLE-GENERICIZED-PROOF-SPEC", 1, 0, false);
        declareMacro("with_proof_spec_store", "WITH-PROOF-SPEC-STORE");
        declareFunction("is_proof_spec_store_availableP", "IS-PROOF-SPEC-STORE-AVAILABLE?", 0, 0, false);
        declareFunction("suggest_proof_specs_for_problem_query", "SUGGEST-PROOF-SPECS-FOR-PROBLEM-QUERY", 1, 0, false);
        declareFunction("proof_spec_store_version", "PROOF-SPEC-STORE-VERSION", 0, 0, false);
        declareFunction("communicate_with_proof_spec_store", "COMMUNICATE-WITH-PROOF-SPEC-STORE", 1, 0, false);
        declareFunction("proof_spec_store_reply_p", "PROOF-SPEC-STORE-REPLY-P", 1, 0, false);
        declareFunction("proof_spec_store_error_reply_p", "PROOF-SPEC-STORE-ERROR-REPLY-P", 1, 0, false);
        declareFunction("proof_spec_store_success_reply_p", "PROOF-SPEC-STORE-SUCCESS-REPLY-P", 1, 0, false);
        declareFunction("proof_spec_store_reply_results", "PROOF-SPEC-STORE-REPLY-RESULTS", 1, 0, false);
        declareFunction("proof_spec_store_reply_nth_result", "PROOF-SPEC-STORE-REPLY-NTH-RESULT", 2, 0, false);
        declareMacro("with_xml_tag", "WITH-XML-TAG");
        declareMacro("with_request_to_string", "WITH-REQUEST-TO-STRING");
        declareFunction("generate_suggest_command", "GENERATE-SUGGEST-COMMAND", 1, 0, false);
        declareFunction("generate_version_command", "GENERATE-VERSION-COMMAND", 0, 0, false);
        declareFunction("generate_query_key_command_section", "GENERATE-QUERY-KEY-COMMAND-SECTION", 2, 0, false);
        declareFunction("generate_proof_spec_from_kbq", "GENERATE-PROOF-SPEC-FROM-KBQ", 2, 0, false);
        declareFunction("generate_query_lookup_key_from_kbq", "GENERATE-QUERY-LOOKUP-KEY-FROM-KBQ", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_proof_spec_store_file() {
        $default_proof_spec_store_host$ = deflexical("*DEFAULT-PROOF-SPEC-STORE-HOST*", $str2$localhost);
        $default_proof_spec_store_port$ = deflexical("*DEFAULT-PROOF-SPEC-STORE-PORT*", $int$2112);
        $proof_spec_store_host$ = defparameter("*PROOF-SPEC-STORE-HOST*", $default_proof_spec_store_host$.getGlobalValue());
        $proof_spec_store_port$ = defparameter("*PROOF-SPEC-STORE-PORT*", $default_proof_spec_store_port$.getGlobalValue());
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
        me = new inference_proof_spec_store();
        $default_proof_spec_store_host$ = null;
        $default_proof_spec_store_port$ = null;
        $proof_spec_store_host$ = null;
        $proof_spec_store_port$ = null;
        $NON_PROVIDED = makeKeyword("NON-PROVIDED");
        $$ist = makeConstSym(("ist"));
        $str2$localhost = makeString("localhost");
        $int$2112 = makeInteger(2112);
        $list4 = list(list(makeSymbol("HOST"), makeSymbol("PORT")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym5$CLET = makeSymbol("CLET");
        $sym6$_PROOF_SPEC_STORE_HOST_ = makeSymbol("*PROOF-SPEC-STORE-HOST*");
        $sym7$_PROOF_SPEC_STORE_PORT_ = makeSymbol("*PROOF-SPEC-STORE-PORT*");
        $PROOF_SPEC = makeKeyword("PROOF-SPEC");
        $sym9$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $PUBLIC = makeKeyword("PUBLIC");
        $EOF = makeKeyword("EOF");
        $ERROR = makeKeyword("ERROR");
        $str13$Unexpected_reply_ = makeString("Unexpected reply ");
        $str14$_from_TCP_IP_layer_ = makeString(" from TCP/IP layer.");
        $OK = makeKeyword("OK");
        $list16 = list(list(makeSymbol("STREAM"), makeSymbol("TAG")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym17$PROGN = makeSymbol("PROGN");
        $sym18$WRITE_STRING = makeSymbol("WRITE-STRING");
        $str19$_ = makeString("<");
        $str20$_ = makeString(">");
        $str21$__ = makeString("</");
        $list22 = list(list(makeSymbol("STREAM"), makeSymbol("REQUEST-STRING")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym23$CWITH_OUTPUT_TO_STRING = makeSymbol("CWITH-OUTPUT-TO-STRING");
        $sym24$WITH_XML_TAG = makeSymbol("WITH-XML-TAG");
        $list25 = list(makeString("request"));
        $str26$request = makeString("request");
        $str27$suggest = makeString("suggest");
        $str28$version = makeString("version");
        $str29$queryKey = makeString("queryKey");
        $str30$keyItems = makeString("keyItems");
        $str31$keyItem = makeString("keyItem");
        $str32$_fixnum_value__ = makeString("<fixnum value=\"");
        $str33$___ = makeString("\"/>");
        $str34$_string_value__ = makeString("<string value=\"");
        $str35$Invalid_key_item__A____neither_st = makeString("Invalid key item ~A -- neither string nor fixnum.");
        $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
        $sym37$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym38$_EXIT = makeSymbol("%EXIT");
    }
}
/*
 *
 * Total time: 180 ms
 *
 */