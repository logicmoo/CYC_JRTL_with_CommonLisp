package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_proof_spec_store extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store";
    public static final String myFingerPrint = "8e34e9995de1906ff0095b83deac3484e7cbd9e51bfd2e4f707598e367ef98ce";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 3441L)
    public static SubLSymbol $default_proof_spec_store_host$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 3565L)
    public static SubLSymbol $default_proof_spec_store_port$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 3625L)
    public static SubLSymbol $proof_spec_store_host$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 3768L)
    public static SubLSymbol $proof_spec_store_port$;
    private static final SubLSymbol $kw0$NON_PROVIDED;
    private static final SubLObject $const1$ist;
    private static final SubLString $str2$localhost;
    private static final SubLInteger $int3$2112;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$CLET;
    private static final SubLSymbol $sym6$_PROOF_SPEC_STORE_HOST_;
    private static final SubLSymbol $sym7$_PROOF_SPEC_STORE_PORT_;
    private static final SubLSymbol $kw8$PROOF_SPEC;
    private static final SubLSymbol $sym9$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw10$PUBLIC;
    private static final SubLSymbol $kw11$EOF;
    private static final SubLSymbol $kw12$ERROR;
    private static final SubLString $str13$Unexpected_reply_;
    private static final SubLString $str14$_from_TCP_IP_layer_;
    private static final SubLSymbol $kw15$OK;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$PROGN;
    private static final SubLSymbol $sym18$WRITE_STRING;
    private static final SubLString $str19$_;
    private static final SubLString $str20$_;
    private static final SubLString $str21$__;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$CWITH_OUTPUT_TO_STRING;
    private static final SubLSymbol $sym24$WITH_XML_TAG;
    private static final SubLList $list25;
    private static final SubLString $str26$request;
    private static final SubLString $str27$suggest;
    private static final SubLString $str28$version;
    private static final SubLString $str29$queryKey;
    private static final SubLString $str30$keyItems;
    private static final SubLString $str31$keyItem;
    private static final SubLString $str32$_fixnum_value__;
    private static final SubLString $str33$___;
    private static final SubLString $str34$_string_value__;
    private static final SubLString $str35$Invalid_key_item__A____neither_st;
    private static final SubLSymbol $kw36$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym37$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym38$_EXIT;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 1268L)
    public static SubLObject query_to_proof_spec_lookup_key(SubLObject el_query, SubLObject elmt) {
        if (elmt == inference_proof_spec_store.UNPROVIDED) {
            elmt = (SubLObject)inference_proof_spec_store.$kw0$NON_PROVIDED;
        }
        if (inference_proof_spec_store.$kw0$NON_PROVIDED != elmt) {
            el_query = el_utilities.make_binary_formula(inference_proof_spec_store.$const1$ist, elmt, el_query);
        }
        final SubLObject problem_query = problem_query_for_el_query(el_query);
        return problem_query_to_proof_spec_lookup_key(problem_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 1753L)
    public static SubLObject problem_query_to_proof_spec_lookup_key(final SubLObject problem_query) {
        final SubLObject generlized_query = inference_proof_spec.genericize_problem_query(problem_query);
        final SubLObject signature = problem_query_signature_for_problem_query(generlized_query);
        return signature;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 2008L)
    public static SubLObject externalize_proof_spec_lookup_key(final SubLObject proof_spec_key) {
        SubLObject externalized_key = (SubLObject)inference_proof_spec_store.NIL;
        SubLObject cdolist_list_var = proof_spec_key;
        SubLObject item = (SubLObject)inference_proof_spec_store.NIL;
        item = cdolist_list_var.first();
        while (inference_proof_spec_store.NIL != cdolist_list_var) {
            if (!item.isFixnum()) {
                if (inference_proof_spec_store.NIL != constant_handles.constant_p(item)) {
                    item = Guids.guid_to_string(constants_high.constant_external_id(item));
                }
                else if (item.isSymbol()) {
                    item = string_utilities.to_string(item);
                }
                else {
                    item = kb_utilities.hl_external_id_string(item);
                }
            }
            externalized_key = (SubLObject)ConsesLow.cons(item, externalized_key);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return Sequences.nreverse(externalized_key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 2528L)
    public static SubLObject problem_query_signature_for_problem_query(final SubLObject problem_query) {
        final SubLObject signature = inference_datastructures_problem_query.problem_query_term_signature(problem_query);
        return signature;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 2694L)
    public static SubLObject problem_query_for_el_query(final SubLObject el_query) {
        final SubLObject inference = inference_kernel.new_continuable_inference(el_query, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
        final SubLObject problem_query = inference_datastructures_inference.inference_hl_query(inference);
        return problem_query;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 2961L)
    public static SubLObject pickle_individual_proof_spec(final SubLObject proof_spec) {
        final SubLObject generic_proof_spec = inference_proof_spec.genericize_proof_spec(proof_spec);
        return pickle_genericized_proof_spec(generic_proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 3197L)
    public static SubLObject pickle_genericized_proof_spec(final SubLObject generic_proof_spec) {
        return kb_utilities.hl_external_id_string(generic_proof_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 3317L)
    public static SubLObject unpickle_genericized_proof_spec(final SubLObject pickled_form) {
        return kb_utilities.find_object_by_hl_external_id_string(pickled_form);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 3908L)
    public static SubLObject with_proof_spec_store(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec_store.$list4);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject host = (SubLObject)inference_proof_spec_store.NIL;
        SubLObject port = (SubLObject)inference_proof_spec_store.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec_store.$list4);
        host = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec_store.$list4);
        port = current.first();
        current = current.rest();
        if (inference_proof_spec_store.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)inference_proof_spec_store.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_proof_spec_store.$sym6$_PROOF_SPEC_STORE_HOST_, host), (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec_store.$sym7$_PROOF_SPEC_STORE_PORT_, port)), ConsesLow.append(body, (SubLObject)inference_proof_spec_store.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_proof_spec_store.$list4);
        return (SubLObject)inference_proof_spec_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 4154L)
    public static SubLObject is_proof_spec_store_availableP() {
        return list_utilities.sublisp_boolean(proof_spec_store_version());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 4323L)
    public static SubLObject suggest_proof_specs_for_problem_query(final SubLObject problem_query) {
        final SubLObject externalized_key = externalize_proof_spec_lookup_key(problem_query_to_proof_spec_lookup_key(problem_query));
        final SubLObject command = generate_suggest_command(externalized_key);
        final SubLObject result = communicate_with_proof_spec_store(command);
        if (inference_proof_spec_store.NIL != proof_spec_store_success_reply_p(result)) {
            SubLObject cdolist_list_var;
            final SubLObject descriptions = cdolist_list_var = proof_spec_store_reply_nth_result((SubLObject)inference_proof_spec_store.ZERO_INTEGER, result);
            SubLObject description = (SubLObject)inference_proof_spec_store.NIL;
            description = cdolist_list_var.first();
            while (inference_proof_spec_store.NIL != cdolist_list_var) {
                final SubLObject pickled_proof_spec = conses_high.getf(description, (SubLObject)inference_proof_spec_store.$kw8$PROOF_SPEC, (SubLObject)inference_proof_spec_store.UNPROVIDED);
                final SubLObject proof_spec = unpickle_genericized_proof_spec(pickled_proof_spec);
                conses_high.putf(description, (SubLObject)inference_proof_spec_store.$kw8$PROOF_SPEC, proof_spec);
                cdolist_list_var = cdolist_list_var.rest();
                description = cdolist_list_var.first();
            }
            return descriptions;
        }
        return (SubLObject)inference_proof_spec_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 5200L)
    public static SubLObject proof_spec_store_version() {
        final SubLObject command = generate_version_command();
        final SubLObject result = communicate_with_proof_spec_store(command);
        if (inference_proof_spec_store.NIL != proof_spec_store_success_reply_p(result)) {
            return proof_spec_store_reply_results(result);
        }
        return (SubLObject)inference_proof_spec_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 5598L)
    public static SubLObject communicate_with_proof_spec_store(final SubLObject command) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)inference_proof_spec_store.NIL;
        SubLObject message = (SubLObject)inference_proof_spec_store.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)inference_proof_spec_store.$sym9$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject s = (SubLObject)inference_proof_spec_store.NIL;
                    try {
                        s = subl_promotions.open_tcp_stream_with_timeout(inference_proof_spec_store.$proof_spec_store_host$.getDynamicValue(thread), inference_proof_spec_store.$proof_spec_store_port$.getDynamicValue(thread), (SubLObject)inference_proof_spec_store.NIL, (SubLObject)inference_proof_spec_store.$kw10$PUBLIC);
                        if (inference_proof_spec_store.NIL != subl_macro_promotions.validate_tcp_connection(s, inference_proof_spec_store.$proof_spec_store_host$.getDynamicValue(thread), inference_proof_spec_store.$proof_spec_store_port$.getDynamicValue(thread))) {
                            streams_high.write_string(command, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
                            string_utilities.network_terpri(s);
                            streams_high.force_output(s);
                            final SubLObject reply = reader.read(s, (SubLObject)inference_proof_spec_store.NIL, (SubLObject)inference_proof_spec_store.$kw11$EOF, (SubLObject)inference_proof_spec_store.UNPROVIDED);
                            if (reply.isCons()) {
                                result = Eval.eval(reply);
                            }
                            else {
                                result = (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec_store.$kw12$ERROR, Sequences.cconcatenate((SubLObject)inference_proof_spec_store.$str13$Unexpected_reply_, new SubLObject[] { format_nil.format_nil_a_no_copy(reply), inference_proof_spec_store.$str14$_from_TCP_IP_layer_ }));
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_proof_spec_store.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (inference_proof_spec_store.NIL != s) {
                                streams_high.close(s, (SubLObject)inference_proof_spec_store.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)inference_proof_spec_store.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (inference_proof_spec_store.NIL == result) {
            result = (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec_store.$kw12$ERROR, message);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 6474L)
    public static SubLObject proof_spec_store_reply_p(final SubLObject result) {
        return (SubLObject)SubLObjectFactory.makeBoolean(result.isCons() && result.first().isKeyword());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 6595L)
    public static SubLObject proof_spec_store_error_reply_p(final SubLObject result) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_proof_spec_store.NIL != proof_spec_store_reply_p(result) && inference_proof_spec_store.$kw12$ERROR == result.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 6743L)
    public static SubLObject proof_spec_store_success_reply_p(final SubLObject result) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_proof_spec_store.NIL != proof_spec_store_reply_p(result) && inference_proof_spec_store.$kw15$OK == result.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 6890L)
    public static SubLObject proof_spec_store_reply_results(final SubLObject result) {
        return (SubLObject)((inference_proof_spec_store.NIL != proof_spec_store_reply_p(result)) ? result.rest() : inference_proof_spec_store.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 7022L)
    public static SubLObject proof_spec_store_reply_nth_result(final SubLObject n, final SubLObject result) {
        final SubLObject results = proof_spec_store_reply_results(result);
        return ConsesLow.nth(n, results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 7172L)
    public static SubLObject with_xml_tag(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec_store.$list16);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = (SubLObject)inference_proof_spec_store.NIL;
        SubLObject tag = (SubLObject)inference_proof_spec_store.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec_store.$list16);
        stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec_store.$list16);
        tag = current.first();
        current = current.rest();
        if (inference_proof_spec_store.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)inference_proof_spec_store.$sym17$PROGN, (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec_store.$sym18$WRITE_STRING, (SubLObject)inference_proof_spec_store.$str19$_, stream), (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec_store.$sym18$WRITE_STRING, tag, stream), (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec_store.$sym18$WRITE_STRING, (SubLObject)inference_proof_spec_store.$str20$_, stream), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_proof_spec_store.$sym18$WRITE_STRING, (SubLObject)inference_proof_spec_store.$str21$__, stream), (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec_store.$sym18$WRITE_STRING, tag, stream), (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec_store.$sym18$WRITE_STRING, (SubLObject)inference_proof_spec_store.$str20$_, stream))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_proof_spec_store.$list16);
        return (SubLObject)inference_proof_spec_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 7660L)
    public static SubLObject with_request_to_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec_store.$list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject stream = (SubLObject)inference_proof_spec_store.NIL;
        SubLObject request_string = (SubLObject)inference_proof_spec_store.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec_store.$list22);
        stream = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_proof_spec_store.$list22);
        request_string = current.first();
        current = current.rest();
        if (inference_proof_spec_store.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)inference_proof_spec_store.$sym23$CWITH_OUTPUT_TO_STRING, (SubLObject)ConsesLow.list(stream, request_string), (SubLObject)ConsesLow.listS((SubLObject)inference_proof_spec_store.$sym24$WITH_XML_TAG, reader.bq_cons(stream, (SubLObject)inference_proof_spec_store.$list25), ConsesLow.append(body, (SubLObject)inference_proof_spec_store.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_proof_spec_store.$list22);
        return (SubLObject)inference_proof_spec_store.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 7920L)
    public static SubLObject generate_suggest_command(final SubLObject externalized_key) {
        SubLObject result = (SubLObject)inference_proof_spec_store.NIL;
        SubLObject s = (SubLObject)inference_proof_spec_store.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str19$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str26$request, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str20$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str19$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str27$suggest, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str20$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            generate_query_key_command_section(externalized_key, s);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str21$__, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str27$suggest, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str20$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str21$__, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str26$request, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str20$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            result = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)inference_proof_spec_store.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)inference_proof_spec_store.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 8156L)
    public static SubLObject generate_version_command() {
        SubLObject result = (SubLObject)inference_proof_spec_store.NIL;
        SubLObject s = (SubLObject)inference_proof_spec_store.NIL;
        try {
            s = streams_high.make_private_string_output_stream();
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str19$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str26$request, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str20$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str19$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str28$version, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str20$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str21$__, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str28$version, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str20$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str21$__, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str26$request, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str20$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            result = streams_high.get_output_stream_string(s);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)inference_proof_spec_store.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)inference_proof_spec_store.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 8312L)
    public static SubLObject generate_query_key_command_section(final SubLObject externalized_key, final SubLObject s) {
        streams_high.write_string((SubLObject)inference_proof_spec_store.$str19$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
        streams_high.write_string((SubLObject)inference_proof_spec_store.$str29$queryKey, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
        streams_high.write_string((SubLObject)inference_proof_spec_store.$str20$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
        streams_high.write_string((SubLObject)inference_proof_spec_store.$str19$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
        streams_high.write_string((SubLObject)inference_proof_spec_store.$str30$keyItems, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
        streams_high.write_string((SubLObject)inference_proof_spec_store.$str20$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
        SubLObject cdolist_list_var = externalized_key;
        SubLObject key_item = (SubLObject)inference_proof_spec_store.NIL;
        key_item = cdolist_list_var.first();
        while (inference_proof_spec_store.NIL != cdolist_list_var) {
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str19$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str31$keyItem, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str20$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            if (key_item.isFixnum()) {
                streams_high.write_string((SubLObject)inference_proof_spec_store.$str32$_fixnum_value__, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
                print_high.princ(key_item, s);
                streams_high.write_string((SubLObject)inference_proof_spec_store.$str33$___, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            }
            else if (key_item.isString()) {
                streams_high.write_string((SubLObject)inference_proof_spec_store.$str34$_string_value__, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
                print_high.princ(key_item, s);
                streams_high.write_string((SubLObject)inference_proof_spec_store.$str33$___, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            }
            else {
                Errors.error((SubLObject)inference_proof_spec_store.$str35$Invalid_key_item__A____neither_st, key_item);
            }
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str21$__, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str31$keyItem, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            streams_high.write_string((SubLObject)inference_proof_spec_store.$str20$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            key_item = cdolist_list_var.first();
        }
        streams_high.write_string((SubLObject)inference_proof_spec_store.$str21$__, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
        streams_high.write_string((SubLObject)inference_proof_spec_store.$str30$keyItems, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
        streams_high.write_string((SubLObject)inference_proof_spec_store.$str20$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
        streams_high.write_string((SubLObject)inference_proof_spec_store.$str21$__, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
        streams_high.write_string((SubLObject)inference_proof_spec_store.$str29$queryKey, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
        streams_high.write_string((SubLObject)inference_proof_spec_store.$str20$_, s, (SubLObject)inference_proof_spec_store.UNPROVIDED, (SubLObject)inference_proof_spec_store.UNPROVIDED);
        return externalized_key;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 8974L)
    public static SubLObject generate_proof_spec_from_kbq(final SubLObject kbq_term, final SubLObject proof_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)inference_proof_spec_store.NIL;
        try {
            thread.throwStack.push(inference_proof_spec_store.$kw36$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)inference_proof_spec_store.$sym37$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject sentence = kb_query.kbq_sentence(kbq_term);
                    final SubLObject mt = kb_query.kbq_mt(kbq_term);
                    final SubLObject lookup_key = query_to_proof_spec_lookup_key(sentence, mt);
                    final SubLObject externalized_key = externalize_proof_spec_lookup_key(lookup_key);
                    final SubLObject pickled_proof_spec = pickle_individual_proof_spec(proof_spec);
                    return Values.values(externalized_key, pickled_proof_spec);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)inference_proof_spec_store.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)inference_proof_spec_store.$kw36$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values((SubLObject)inference_proof_spec_store.NIL, (SubLObject)inference_proof_spec_store.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-proof-spec-store.lisp", position = 9745L)
    public static SubLObject generate_query_lookup_key_from_kbq(final SubLObject kbq_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)inference_proof_spec_store.NIL;
        try {
            thread.throwStack.push(inference_proof_spec_store.$kw36$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)inference_proof_spec_store.$sym37$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject sentence = kb_query.kbq_sentence(kbq_term);
                    final SubLObject mt = kb_query.kbq_mt(kbq_term);
                    final SubLObject lookup_key = query_to_proof_spec_lookup_key(sentence, mt);
                    final SubLObject externalized_key = externalize_proof_spec_lookup_key(lookup_key);
                    return externalized_key;
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)inference_proof_spec_store.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)inference_proof_spec_store.$kw36$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)inference_proof_spec_store.NIL;
    }
    
    public static SubLObject declare_inference_proof_spec_store_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "query_to_proof_spec_lookup_key", "QUERY-TO-PROOF-SPEC-LOOKUP-KEY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "problem_query_to_proof_spec_lookup_key", "PROBLEM-QUERY-TO-PROOF-SPEC-LOOKUP-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "externalize_proof_spec_lookup_key", "EXTERNALIZE-PROOF-SPEC-LOOKUP-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "problem_query_signature_for_problem_query", "PROBLEM-QUERY-SIGNATURE-FOR-PROBLEM-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "problem_query_for_el_query", "PROBLEM-QUERY-FOR-EL-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "pickle_individual_proof_spec", "PICKLE-INDIVIDUAL-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "pickle_genericized_proof_spec", "PICKLE-GENERICIZED-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "unpickle_genericized_proof_spec", "UNPICKLE-GENERICIZED-PROOF-SPEC", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "with_proof_spec_store", "WITH-PROOF-SPEC-STORE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "is_proof_spec_store_availableP", "IS-PROOF-SPEC-STORE-AVAILABLE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "suggest_proof_specs_for_problem_query", "SUGGEST-PROOF-SPECS-FOR-PROBLEM-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "proof_spec_store_version", "PROOF-SPEC-STORE-VERSION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "communicate_with_proof_spec_store", "COMMUNICATE-WITH-PROOF-SPEC-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "proof_spec_store_reply_p", "PROOF-SPEC-STORE-REPLY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "proof_spec_store_error_reply_p", "PROOF-SPEC-STORE-ERROR-REPLY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "proof_spec_store_success_reply_p", "PROOF-SPEC-STORE-SUCCESS-REPLY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "proof_spec_store_reply_results", "PROOF-SPEC-STORE-REPLY-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "proof_spec_store_reply_nth_result", "PROOF-SPEC-STORE-REPLY-NTH-RESULT", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "with_xml_tag", "WITH-XML-TAG");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "with_request_to_string", "WITH-REQUEST-TO-STRING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "generate_suggest_command", "GENERATE-SUGGEST-COMMAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "generate_version_command", "GENERATE-VERSION-COMMAND", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "generate_query_key_command_section", "GENERATE-QUERY-KEY-COMMAND-SECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "generate_proof_spec_from_kbq", "GENERATE-PROOF-SPEC-FROM-KBQ", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_proof_spec_store", "generate_query_lookup_key_from_kbq", "GENERATE-QUERY-LOOKUP-KEY-FROM-KBQ", 1, 0, false);
        return (SubLObject)inference_proof_spec_store.NIL;
    }
    
    public static SubLObject init_inference_proof_spec_store_file() {
        inference_proof_spec_store.$default_proof_spec_store_host$ = SubLFiles.deflexical("*DEFAULT-PROOF-SPEC-STORE-HOST*", (SubLObject)inference_proof_spec_store.$str2$localhost);
        inference_proof_spec_store.$default_proof_spec_store_port$ = SubLFiles.deflexical("*DEFAULT-PROOF-SPEC-STORE-PORT*", (SubLObject)inference_proof_spec_store.$int3$2112);
        inference_proof_spec_store.$proof_spec_store_host$ = SubLFiles.defparameter("*PROOF-SPEC-STORE-HOST*", inference_proof_spec_store.$default_proof_spec_store_host$.getGlobalValue());
        inference_proof_spec_store.$proof_spec_store_port$ = SubLFiles.defparameter("*PROOF-SPEC-STORE-PORT*", inference_proof_spec_store.$default_proof_spec_store_port$.getGlobalValue());
        return (SubLObject)inference_proof_spec_store.NIL;
    }
    
    public static SubLObject setup_inference_proof_spec_store_file() {
        return (SubLObject)inference_proof_spec_store.NIL;
    }
    
    public void declareFunctions() {
        declare_inference_proof_spec_store_file();
    }
    
    public void initializeVariables() {
        init_inference_proof_spec_store_file();
    }
    
    public void runTopLevelForms() {
        setup_inference_proof_spec_store_file();
    }
    
    static {
        me = (SubLFile)new inference_proof_spec_store();
        inference_proof_spec_store.$default_proof_spec_store_host$ = null;
        inference_proof_spec_store.$default_proof_spec_store_port$ = null;
        inference_proof_spec_store.$proof_spec_store_host$ = null;
        inference_proof_spec_store.$proof_spec_store_port$ = null;
        $kw0$NON_PROVIDED = SubLObjectFactory.makeKeyword("NON-PROVIDED");
        $const1$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $str2$localhost = SubLObjectFactory.makeString("localhost");
        $int3$2112 = SubLObjectFactory.makeInteger(2112);
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HOST"), (SubLObject)SubLObjectFactory.makeSymbol("PORT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym5$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym6$_PROOF_SPEC_STORE_HOST_ = SubLObjectFactory.makeSymbol("*PROOF-SPEC-STORE-HOST*");
        $sym7$_PROOF_SPEC_STORE_PORT_ = SubLObjectFactory.makeSymbol("*PROOF-SPEC-STORE-PORT*");
        $kw8$PROOF_SPEC = SubLObjectFactory.makeKeyword("PROOF-SPEC");
        $sym9$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw10$PUBLIC = SubLObjectFactory.makeKeyword("PUBLIC");
        $kw11$EOF = SubLObjectFactory.makeKeyword("EOF");
        $kw12$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str13$Unexpected_reply_ = SubLObjectFactory.makeString("Unexpected reply ");
        $str14$_from_TCP_IP_layer_ = SubLObjectFactory.makeString(" from TCP/IP layer.");
        $kw15$OK = SubLObjectFactory.makeKeyword("OK");
        $list16 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("TAG")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym17$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym18$WRITE_STRING = SubLObjectFactory.makeSymbol("WRITE-STRING");
        $str19$_ = SubLObjectFactory.makeString("<");
        $str20$_ = SubLObjectFactory.makeString(">");
        $str21$__ = SubLObjectFactory.makeString("</");
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("REQUEST-STRING")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym23$CWITH_OUTPUT_TO_STRING = SubLObjectFactory.makeSymbol("CWITH-OUTPUT-TO-STRING");
        $sym24$WITH_XML_TAG = SubLObjectFactory.makeSymbol("WITH-XML-TAG");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("request"));
        $str26$request = SubLObjectFactory.makeString("request");
        $str27$suggest = SubLObjectFactory.makeString("suggest");
        $str28$version = SubLObjectFactory.makeString("version");
        $str29$queryKey = SubLObjectFactory.makeString("queryKey");
        $str30$keyItems = SubLObjectFactory.makeString("keyItems");
        $str31$keyItem = SubLObjectFactory.makeString("keyItem");
        $str32$_fixnum_value__ = SubLObjectFactory.makeString("<fixnum value=\"");
        $str33$___ = SubLObjectFactory.makeString("\"/>");
        $str34$_string_value__ = SubLObjectFactory.makeString("<string value=\"");
        $str35$Invalid_key_item__A____neither_st = SubLObjectFactory.makeString("Invalid key item ~A -- neither string nor fixnum.");
        $kw36$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym37$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym38$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
    }
}

/*

	Total time: 180 ms
	
*/