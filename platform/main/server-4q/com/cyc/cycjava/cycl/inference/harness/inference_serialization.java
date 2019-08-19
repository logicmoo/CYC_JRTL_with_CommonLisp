package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.cfasl_kb_methods;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_serialization extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_serialization";
    public static String myFingerPrint = "0c8edd6c871644b82d56b2d5def6e38d26bc89d6a51db812f95cb18605f33e30";
    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 900L)
    private static SubLSymbol $inference_serialization_supports_problem_free_hl_var_optimizationP$;
    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 2400L)
    private static SubLSymbol $current_cfasl_save_problem_store_version$;
    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 3600L)
    public static SubLSymbol $cfasl_load_ps_problem_table$;
    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 3700L)
    public static SubLSymbol $cfasl_load_ps_link_table$;
    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 3800L)
    public static SubLSymbol $cfasl_load_ps_proof_table$;
    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 5800L)
    public static SubLSymbol $cfasl_load_ps_constant_table$;
    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 9100L)
    private static SubLSymbol $problem_store_common_constants$;
    private static SubLSymbol $CFASL;
    private static SubLSymbol $sym1$PROBLEM_STORE_P;
    private static SubLSymbol $sym2$STRINGP;
    private static SubLSymbol $OUTPUT;
    private static SubLString $str4$Unable_to_open__S;
    private static SubLSymbol $XML;
    private static SubLString $str6$Time_to_implement_XML_problem_sto;
    private static SubLString $str7$Unexpected_protocol__S;
    private static SubLSymbol $INPUT;
    private static SubLString $str9$Time_to_implement_XML_problem_sto;
    private static SubLString $str10$1_0;
    private static SubLSymbol $sym11$STREAMP;
    private static SubLString $str12$Unsupported_serialization_version;
    private static SubLSymbol $sym13$CLET;
    private static SubLList $list14;
    private static SubLSymbol $UNINITIALIZED;
    private static SubLSymbol $sym16$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_PROBLEM_COUNT;
    private static SubLSymbol $sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS;
    private static SubLSymbol $sym18$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_LINK_COUNT;
    private static SubLSymbol $sym19$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_PROOF_COUNT;
    private static SubLSymbol $sym20$CFASL_LOAD_PS_NOTE_PROBLEM_ID;
    private static SubLSymbol $sym21$CFASL_LOAD_PS_LOOKUP_PROBLEM;
    private static SubLSymbol $sym22$CFASL_LOAD_PS_NOTE_LINK_ID;
    private static SubLSymbol $sym23$CFASL_LOAD_PS_LOOKUP_LINK;
    private static SubLSymbol $sym24$CFASL_LOAD_PS_NOTE_PROOF_ID;
    private static SubLSymbol $sym25$CFASL_LOAD_PS_LOOKUP_PROOF;
    private static SubLList $list26;
    private static SubLSymbol $sym27$_CFASL_LOAD_PS_CONSTANT_TABLE_;
    private static SubLList $list28;
    private static SubLSymbol $sym29$CFASL_LOAD_PS_LOOKUP_CONSTANT;
    private static SubLSymbol $sym30$WITH_CFASL_LOAD_PS_CONSTANT_TABLE;
    private static SubLString $str31$Unable_to_lookup_a_constant_from_;
    private static SubLSymbol $PROBLEM;
    private static SubLSymbol $PROBLEM_LINK;
    private static SubLSymbol $PROOF;
    private static SubLSymbol $DONE;
    private static SubLString $str36$Unexpected_section__S;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $sym38$STRING_LESSP;
    private static SubLSymbol $sym39$SYMBOL_NAME;
    private static SubLSymbol $sym40$POSSIBLY_NOTE_PROBLEM_STORE_COMMON_CONSTANT;
    private static SubLInteger $int$100;
    private static SubLSymbol $sym42$CONSTANT_INTERNAL_ID;
    private static SubLSymbol $sym43$SET_P;
    private static SubLSymbol $sym44$FUNCTION_SPEC_P;
    private static SubLSymbol $sym45$PROBLEM_STORE_PROPERTIES_P;
    private static SubLSymbol $sym46$PROBLEM_LINK_P;
    private static SubLSymbol $REMOVAL;
    private static SubLSymbol $REWRITE;
    private static SubLSymbol $TRANSFORMATION;
    private static SubLSymbol $RESIDUAL_TRANSFORMATION;
    private static SubLSymbol $RESTRICTION;
    private static SubLSymbol $SPLIT;
    private static SubLSymbol $JOIN_ORDERED;
    private static SubLSymbol $JOIN;
    private static SubLSymbol $UNION;
    private static SubLString $str56$Unexpected_link_type__S;
    private static SubLSymbol $sym57$SPLIT_LINK_P;
    private static SubLSymbol $sym58$JOIN_LINK_P;
    private static SubLSymbol $sym59$UNION_LINK_P;
    private static SubLSymbol $sym60$PROBLEM_P;
    private static SubLSymbol $sym61$MAPPED_PROBLEM_P;
    private static SubLSymbol $sym62$PROOF_P;
    private static SubLSymbol $sym63$HL_MODULE_P;
    private static SubLString $str64$CFASL_does_not_support_objects_of;
    private static SubLSymbol $sym65$CFASL_OUTPUT_OBJECT_PROBLEM_STORE_METHOD;
    private static SubLSymbol $sym66$CFASL_OUTPUT_OBJECT_PROBLEM_METHOD;
    private static SubLSymbol $sym67$CFASL_OUTPUT_OBJECT_TACTIC_METHOD;
    private static SubLSymbol $sym68$CFASL_OUTPUT_OBJECT_PROBLEM_LINK_METHOD;
    private static SubLSymbol $sym69$CFASL_OUTPUT_OBJECT_PROOF_METHOD;
    private static SubLSymbol $sym70$CFASL_OUTPUT_OBJECT_STRATEGY_METHOD;
    private static SubLSymbol $sym71$CFASL_OUTPUT_OBJECT_INFERENCE_METHOD;
    private static SubLSymbol $sym72$CFASL_OUTPUT_OBJECT_INFERENCE_ANSWER_METHOD;
    private static SubLSymbol $sym73$CFASL_OUTPUT_OBJECT_INFERENCE_ANSWER_JUSTIFICATION_METHOD;

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 1000L)
    public static SubLObject save_problem_store(SubLObject store, SubLObject filename, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        assert NIL != Types.stringp(filename) : filename;
        SubLObject result = NIL;
        SubLObject pcase_var = protocol;
        if (pcase_var.eql($CFASL)) {
            SubLObject stream = NIL;
            try {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_binary(filename, $OUTPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str4$Unable_to_open__S, filename);
                }
                SubLObject stream_$1 = stream;
                result = cfasl_save_problem_store(store, stream_$1);
            } finally {
                SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } else if (pcase_var.eql($XML)) {
            Errors.error($str6$Time_to_implement_XML_problem_sto);
        } else {
            Errors.error($str7$Unexpected_protocol__S, protocol);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 1700L)
    public static SubLObject load_problem_store(SubLObject filename, SubLObject protocol, SubLObject validateP) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        if (validateP == UNPROVIDED) {
            validateP = T;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(filename) : filename;
        SubLObject store = NIL;
        SubLObject pcase_var = protocol;
        if (pcase_var.eql($CFASL)) {
            SubLObject stream = NIL;
            try {
                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_binary(filename, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str4$Unable_to_open__S, filename);
                }
                SubLObject stream_$2 = stream;
                SubLObject _prev_bind_2 = cfasl_kb_methods.$cfasl_error_on_invalid_assertion_inputP$.currentBinding(thread);
                try {
                    cfasl_kb_methods.$cfasl_error_on_invalid_assertion_inputP$.bind(validateP, thread);
                    store = cfasl_load_problem_store(stream_$2);
                } finally {
                    cfasl_kb_methods.$cfasl_error_on_invalid_assertion_inputP$.rebind(_prev_bind_2, thread);
                }
            } finally {
                SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        } else if (pcase_var.eql($XML)) {
            Errors.error($str9$Time_to_implement_XML_problem_sto);
        } else {
            Errors.error($str7$Unexpected_protocol__S, protocol);
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 2700L)
    public static SubLObject cfasl_save_problem_store(SubLObject store, SubLObject stream) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        assert NIL != Types.streamp(stream) : stream;
        SubLObject version = $current_cfasl_save_problem_store_version$.getGlobalValue();
        cfasl.cfasl_output(version, stream);
        if (version.equal($str10$1_0)) {
            return cfasl_save_problem_store_1_0(store, stream);
        }
        return Errors.error($str12$Unsupported_serialization_version, version);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 3000L)
    public static SubLObject cfasl_load_problem_store(SubLObject stream) {
        assert NIL != Types.streamp(stream) : stream;
        SubLObject version = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (version.equal($str10$1_0)) {
            return cfasl_load_problem_store_1_0(stream);
        }
        return Errors.error($str12$Unsupported_serialization_version, version);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 3300L)
    public static SubLObject with_clean_cfasl_load_ps_ids(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject body;
        SubLObject current = body = datum;
        return listS($sym13$CLET, $list14, append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 3900L)
    public static SubLObject cfasl_load_ps_prepare_for_expected_problem_count(SubLObject count) {
        $cfasl_load_ps_problem_table$.setDynamicValue(Hashtables.make_hash_table(count, Symbols.symbol_function(EQ), UNPROVIDED));
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 4100L)
    public static SubLObject cfasl_load_ps_prepare_for_expected_link_count(SubLObject count) {
        $cfasl_load_ps_link_table$.setDynamicValue(Hashtables.make_hash_table(count, Symbols.symbol_function(EQ), UNPROVIDED));
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 4300L)
    public static SubLObject cfasl_load_ps_prepare_for_expected_proof_count(SubLObject count) {
        $cfasl_load_ps_proof_table$.setDynamicValue(Hashtables.make_hash_table(count, Symbols.symbol_function(EQ), UNPROVIDED));
        return count;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 4500L)
    public static SubLObject cfasl_load_ps_note_problem_id(SubLObject problem, SubLObject id) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.sethash(id, $cfasl_load_ps_problem_table$.getDynamicValue(thread), problem);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 4700L)
    public static SubLObject cfasl_load_ps_lookup_problem(SubLObject id) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.gethash_without_values(id, $cfasl_load_ps_problem_table$.getDynamicValue(thread), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 4900L)
    public static SubLObject cfasl_load_ps_note_link_id(SubLObject link, SubLObject id) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.sethash(id, $cfasl_load_ps_link_table$.getDynamicValue(thread), link);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 5000L)
    public static SubLObject cfasl_load_ps_lookup_link(SubLObject id) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.gethash_without_values(id, $cfasl_load_ps_link_table$.getDynamicValue(thread), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 5200L)
    public static SubLObject cfasl_load_ps_note_proof_id(SubLObject proof, SubLObject id) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.sethash(id, $cfasl_load_ps_proof_table$.getDynamicValue(thread), proof);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 5300L)
    public static SubLObject cfasl_load_ps_lookup_proof(SubLObject id) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.gethash_without_values(id, $cfasl_load_ps_proof_table$.getDynamicValue(thread), UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 5500L)
    public static SubLObject with_cfasl_load_ps_constant_table(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject constant_table = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list26);
        constant_table = current.first();
        SubLObject body;
        current = (body = current.rest());
        return listS($sym13$CLET, reader.bq_cons(list($sym27$_CFASL_LOAD_PS_CONSTANT_TABLE_, constant_table), $list28), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 5900L)
    public static SubLObject cfasl_load_ps_lookup_constant(SubLObject id) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constant = Hashtables.gethash_without_values(id, $cfasl_load_ps_constant_table$.getDynamicValue(thread), UNPROVIDED);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !isConstSym(constant)) {
            Errors.error($str31$Unable_to_lookup_a_constant_from_, id);
        }
        return constant;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 6200L)
    public static SubLObject cfasl_save_problem_store_1_0(SubLObject store, SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        assert NIL != Types.streamp(stream) : stream;
        SubLObject common_symbols = compute_problem_store_common_symbols(store);
        SubLObject common_constants = compute_problem_store_common_constants(store);
        SubLObject constant_table = make_constant_internal_id_map(common_constants);
        SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind(NIL, thread);
            cfasl.cfasl_set_common_symbols(NIL);
            cfasl.cfasl_output(common_symbols, stream);
        } finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind(NIL, thread);
            cfasl.cfasl_set_common_symbols(common_symbols);
            SubLObject _prev_bind_0_$3 = cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.currentBinding(thread);
            try {
                cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.bind(NIL, thread);
                cfasl.cfasl_output_externalized(constant_table, stream);
            } finally {
                cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.rebind(_prev_bind_0_$3, thread);
            }
            SubLObject _prev_bind_0_$4 = cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.currentBinding(thread);
            try {
                cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.bind(common_constants, thread);
                cfasl_save_problem_store_properties(store, stream);
                cfasl.cfasl_output($PROBLEM, stream);
                cfasl_save_problem_store_problems(store, stream);
                cfasl.cfasl_output($PROBLEM_LINK, stream);
                cfasl_save_problem_store_problem_links(store, stream);
                cfasl.cfasl_output($PROOF, stream);
                cfasl_save_problem_store_proofs(store, stream);
                cfasl.cfasl_output($DONE, stream);
            } finally {
                cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.rebind(_prev_bind_0_$4, thread);
            }
        } finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 7300L)
    public static SubLObject cfasl_load_problem_store_1_0(SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Types.streamp(stream) : stream;
        SubLObject common_symbols = NIL;
        SubLObject constant_table = NIL;
        SubLObject problem_store_properties = NIL;
        SubLObject store = NIL;
        SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind(NIL, thread);
            cfasl.cfasl_set_common_symbols(NIL);
            common_symbols = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        } finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind(NIL, thread);
            cfasl.cfasl_set_common_symbols(common_symbols);
            constant_table = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject _prev_bind_0_$5 = $cfasl_load_ps_constant_table$.currentBinding(thread);
            SubLObject _prev_bind_2 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
            SubLObject _prev_bind_3 = cfasl.$cfasl_input_guid_string_resource$.currentBinding(thread);
            SubLObject _prev_bind_4 = $cfasl_load_ps_problem_table$.currentBinding(thread);
            SubLObject _prev_bind_5 = $cfasl_load_ps_link_table$.currentBinding(thread);
            SubLObject _prev_bind_6 = $cfasl_load_ps_proof_table$.currentBinding(thread);
            try {
                $cfasl_load_ps_constant_table$.bind(constant_table, thread);
                api_control_vars.$cfasl_constant_handle_lookup_func$.bind($sym29$CFASL_LOAD_PS_LOOKUP_CONSTANT, thread);
                cfasl.$cfasl_input_guid_string_resource$.bind(Guids.guid_to_string(Guids.new_guid()), thread);
                $cfasl_load_ps_problem_table$.bind($UNINITIALIZED, thread);
                $cfasl_load_ps_link_table$.bind($UNINITIALIZED, thread);
                $cfasl_load_ps_proof_table$.bind($UNINITIALIZED, thread);
                problem_store_properties = cfasl_load_problem_store_properties(stream);
                store = inference_datastructures_problem_store.new_problem_store(problem_store_properties);
                for (SubLObject section = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED); $DONE != section; section = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED)) {
                    SubLObject pcase_var = section;
                    if (pcase_var.eql($PROBLEM)) {
                        cfasl_load_problem_store_problems(store, stream);
                    } else if (pcase_var.eql($PROBLEM_LINK)) {
                        cfasl_load_problem_store_problem_links(store, stream);
                    } else if (pcase_var.eql($PROOF)) {
                        cfasl_load_problem_store_proofs(store, stream);
                    } else {
                        Errors.error($str36$Unexpected_section__S, section);
                    }
                }
            } finally {
                $cfasl_load_ps_proof_table$.rebind(_prev_bind_6, thread);
                $cfasl_load_ps_link_table$.rebind(_prev_bind_5, thread);
                $cfasl_load_ps_problem_table$.rebind(_prev_bind_4, thread);
                cfasl.$cfasl_input_guid_string_resource$.rebind(_prev_bind_3, thread);
                api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_2, thread);
                $cfasl_load_ps_constant_table$.rebind(_prev_bind_0_$5, thread);
            }
        } finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return store;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 8300L)
    public static SubLObject compute_problem_store_common_symbols(SubLObject store) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject common_symbols = set.new_set(Symbols.symbol_function(EQ), UNPROVIDED);
        SubLObject idx = inference_datastructures_problem_store.problem_store_link_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$6 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$6);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject link;
                SubLObject link_type;
                SubLObject hl_module_name;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    link = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(link) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(link)) {
                            link = $SKIP;
                        }
                        link_type = inference_datastructures_problem_link.problem_link_type(link);
                        set.set_add(link_type, common_symbols);
                        if (NIL != inference_worker.content_link_p(link)) {
                            hl_module_name = inference_modules.hl_module_name(inference_worker.content_link_hl_module(link));
                            if (hl_module_name.isSymbol()) {
                                set.set_add(hl_module_name, common_symbols);
                            }
                        }
                    }
                }
            }
            SubLObject idx_$7 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$7)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$7);
                SubLObject id2 = NIL;
                SubLObject link2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        link2 = Hashtables.getEntryValue(cdohash_entry);
                        SubLObject link_type2 = inference_datastructures_problem_link.problem_link_type(link2);
                        set.set_add(link_type2, common_symbols);
                        if (NIL != inference_worker.content_link_p(link2)) {
                            SubLObject hl_module_name2 = inference_modules.hl_module_name(inference_worker.content_link_hl_module(link2));
                            if (!hl_module_name2.isSymbol()) {
                                continue;
                            }
                            set.set_add(hl_module_name2, common_symbols);
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        SubLObject cdolist_list_var = inference_datastructures_enumerated_types.all_problem_store_properties();
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_add(property, common_symbols);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        }
        return Sort.sort(set.set_element_list(common_symbols), Symbols.symbol_function($sym38$STRING_LESSP), Symbols.symbol_function($sym39$SYMBOL_NAME));
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 9200L)
    public static SubLObject possibly_note_problem_store_common_constant(SubLObject v_object) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (isConstSym(v_object)) {
            set.set_add(v_object, $problem_store_common_constants$.getDynamicValue(thread));
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 9400L)
    public static SubLObject compute_problem_store_common_constants(SubLObject store) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject common_constants = set.new_set(Symbols.symbol_function(EQ), $int$100);
        SubLObject _prev_bind_0 = $problem_store_common_constants$.currentBinding(thread);
        try {
            $problem_store_common_constants$.bind(common_constants, thread);
            SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
            if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                SubLObject idx_$8 = idx;
                if (NIL == id_index.id_index_dense_objects_empty_p(idx_$8, $SKIP)) {
                    SubLObject vector_var = id_index.id_index_dense_objects(idx_$8);
                    SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject problem;
                    SubLObject query;
                    for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                        id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                        problem = Vectors.aref(vector_var, id);
                        if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                            if (NIL != id_index.id_index_tombstone_p(problem)) {
                                problem = $SKIP;
                            }
                            query = inference_datastructures_problem.problem_query(problem);
                            list_utilities.tree_map($sym40$POSSIBLY_NOTE_PROBLEM_STORE_COMMON_CONSTANT, query, UNPROVIDED);
                        }
                    }
                }
                SubLObject idx_$9 = idx;
                if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$9)) {
                    SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$9);
                    SubLObject id2 = NIL;
                    SubLObject problem2 = NIL;
                    Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            problem2 = Hashtables.getEntryValue(cdohash_entry);
                            SubLObject query2 = inference_datastructures_problem.problem_query(problem2);
                            list_utilities.tree_map($sym40$POSSIBLY_NOTE_PROBLEM_STORE_COMMON_CONSTANT, query2, UNPROVIDED);
                        }
                    } finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        } finally {
            $problem_store_common_constants$.rebind(_prev_bind_0, thread);
        }
        return common_constants;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 9800L)
    public static SubLObject make_constant_internal_id_map(SubLObject constants) {
        return make_hash_table_from_set(constants, Symbols.symbol_function(IDENTITY), Symbols.symbol_function($sym42$CONSTANT_INTERNAL_ID), Symbols.symbol_function(EQL));
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 9900L)
    public static SubLObject make_hash_table_from_set(SubLObject v_set, SubLObject value_method, SubLObject key_method, SubLObject test) {
        if (value_method == UNPROVIDED) {
            value_method = Symbols.symbol_function(IDENTITY);
        }
        if (key_method == UNPROVIDED) {
            key_method = Symbols.symbol_function(IDENTITY);
        }
        if (test == UNPROVIDED) {
            test = set.set_test(v_set);
        }
        assert NIL != set.set_p(v_set) : v_set;
        assert NIL != Types.function_spec_p(value_method) : value_method;
        assert NIL != Types.function_spec_p(key_method) : key_method;
        assert NIL != Types.function_spec_p(test) : test;
        SubLObject table = Hashtables.make_hash_table(set.set_size(v_set), test, UNPROVIDED);
        SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        SubLObject key;
        SubLObject value;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                key = Functions.funcall(key_method, element);
                value = Functions.funcall(value_method, element);
                Hashtables.sethash(key, table, value);
            }
        }
        return table;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 10800L)
    public static SubLObject cfasl_save_problem_store_properties(SubLObject store, SubLObject stream) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject v_properties = inference_datastructures_problem_store.problem_store_properties(store);
        cfasl.cfasl_output(v_properties, stream);
        return v_properties;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 11000L)
    public static SubLObject cfasl_load_problem_store_properties(SubLObject stream) {
        SubLObject v_properties = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        assert NIL != inference_datastructures_enumerated_types.problem_store_properties_p(v_properties) : v_properties;
        return v_properties;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 11300L)
    public static SubLObject cfasl_save_problem_store_problems(SubLObject store, SubLObject stream) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject total = inference_datastructures_problem_store.problem_store_problem_count(store);
        cfasl.cfasl_output(total, stream);
        SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$10 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$10, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$10);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        cfasl_save_problem_store_problem(problem, stream);
                    }
                }
            }
            SubLObject idx_$11 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$11) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                SubLObject sparse = id_index.id_index_sparse_objects(idx_$11);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$11);
                SubLObject end_id = id_index.id_index_next_id(idx_$11);
                SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    SubLObject problem2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(problem2)) {
                        cfasl_save_problem_store_problem(problem2, stream);
                    }
                    id2 = Numbers.add(id2, ONE_INTEGER);
                }
            }
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 11700L)
    public static SubLObject cfasl_load_problem_store_problems(SubLObject store, SubLObject stream) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject total = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        cfasl_load_ps_prepare_for_expected_problem_count(total);
        inference_datastructures_problem_store.problem_store_prepare_for_expected_problem_count(store, total);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(total); i = Numbers.add(i, ONE_INTEGER)) {
            cfasl_load_problem_store_problem(store, stream);
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 12000L)
    public static SubLObject cfasl_save_problem_store_problem(SubLObject problem, SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject suid = inference_datastructures_problem.problem_suid(problem);
        SubLObject query = inference_datastructures_problem.problem_query(problem);
        SubLObject free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(problem);
        cfasl.cfasl_output(suid, stream);
        cfasl.cfasl_output_externalized(query, stream);
        if (NIL != $inference_serialization_supports_problem_free_hl_var_optimizationP$.getDynamicValue(thread)) {
            cfasl.cfasl_output_externalized(free_hl_vars, stream);
        }
        return suid;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 12400L)
    public static SubLObject cfasl_load_problem_store_problem(SubLObject store, SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject suid = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject query = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject free_hl_vars = NIL;
        if (NIL != $inference_serialization_supports_problem_free_hl_var_optimizationP$.getDynamicValue(thread)) {
            SubLObject possible_free_hl_vars_opcode = cfasl.cfasl_opcode_peek(stream, UNPROVIDED, UNPROVIDED);
            if (possible_free_hl_vars_opcode.eql(TWELVE_INTEGER) || possible_free_hl_vars_opcode.eql(THIRTEEN_INTEGER)) {
                free_hl_vars = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            }
        }
        SubLObject problem = inference_datastructures_problem.new_problem(store, query, free_hl_vars);
        cfasl_load_ps_note_problem_id(problem, suid);
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 13100L)
    public static SubLObject cfasl_save_problem_store_proofs(SubLObject store, SubLObject stream) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject total = inference_datastructures_problem_store.problem_store_proof_count(store);
        cfasl.cfasl_output(total, stream);
        SubLObject idx = inference_datastructures_problem_store.problem_store_proof_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$12 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$12, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$12);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject proof;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    proof = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(proof) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(proof)) {
                            proof = $SKIP;
                        }
                        cfasl_save_problem_store_proof(proof, stream);
                    }
                }
            }
            SubLObject idx_$13 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$13) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                SubLObject sparse = id_index.id_index_sparse_objects(idx_$13);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$13);
                SubLObject end_id = id_index.id_index_next_id(idx_$13);
                SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    SubLObject proof2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if (NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(proof2)) {
                        cfasl_save_problem_store_proof(proof2, stream);
                    }
                    id2 = Numbers.add(id2, ONE_INTEGER);
                }
            }
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 13400L)
    public static SubLObject cfasl_load_problem_store_proofs(SubLObject store, SubLObject stream) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject total = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        cfasl_load_ps_prepare_for_expected_proof_count(total);
        inference_datastructures_problem_store.problem_store_prepare_for_expected_proof_count(store, total);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(total); i = Numbers.add(i, ONE_INTEGER)) {
            cfasl_load_problem_store_proof(store, stream);
        }
        SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$14 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$14, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$14);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(problem) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        inference_worker.consider_that_problem_could_be_good(problem);
                    }
                }
            }
            SubLObject idx_$15 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$15)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$15);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        inference_worker.consider_that_problem_could_be_good(problem2);
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 13900L)
    public static SubLObject cfasl_save_problem_store_proof(SubLObject proof, SubLObject stream) {
        cfasl.cfasl_output(inference_datastructures_proof.proof_suid(proof), stream);
        cfasl.cfasl_output_externalized(inference_datastructures_proof.proof_bindings(proof), stream);
        cfasl_save_problem_link_reference(inference_datastructures_proof.proof_link(proof), stream);
        SubLObject subproofs = inference_datastructures_proof.proof_direct_subproofs(proof);
        cfasl.cfasl_output(Sequences.length(subproofs), stream);
        SubLObject cdolist_list_var = subproofs;
        SubLObject subproof = NIL;
        subproof = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cfasl_save_proof_reference(subproof, stream);
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 14400L)
    public static SubLObject cfasl_load_problem_store_proof(SubLObject store, SubLObject stream) {
        SubLObject suid = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject v_bindings = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject link = cfasl_load_problem_link_reference(store, stream);
        SubLObject subproofs = cfasl_load_proof_subproofs(store, stream);
        SubLObject proof = inference_datastructures_proof.new_proof_with_bindings(link, v_bindings, subproofs);
        cfasl_load_ps_note_proof_id(proof, suid);
        return proof;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 14800L)
    public static SubLObject cfasl_load_proof_subproofs(SubLObject store, SubLObject stream) {
        SubLObject subproofs = NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject subproof;
        for (cdotimes_end_var = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, ONE_INTEGER)) {
            subproof = cfasl_load_proof_reference(store, stream);
            subproofs = cons(subproof, subproofs);
        }
        return Sequences.nreverse(subproofs);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 15000L)
    public static SubLObject cfasl_save_problem_store_problem_links(SubLObject store, SubLObject stream) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject total = Numbers.subtract(inference_datastructures_problem_store.problem_store_link_count(store), inference_datastructures_problem_store.problem_store_answer_link_count(store));
        cfasl.cfasl_output(total, stream);
        SubLObject idx = inference_datastructures_problem_store.problem_store_link_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$16 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$16, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$16);
                SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject link;
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    link = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(link) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(link)) {
                            link = $SKIP;
                        }
                        if (NIL == inference_worker_answer.answer_link_p(link)) {
                            cfasl_save_problem_store_problem_link(link, stream);
                        }
                    }
                }
            }
            SubLObject idx_$17 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$17) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                SubLObject sparse = id_index.id_index_sparse_objects(idx_$17);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$17);
                SubLObject end_id = id_index.id_index_next_id(idx_$17);
                SubLObject v_default = (NIL != id_index.id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    SubLObject link2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if ((NIL == id_index.id_index_skip_tombstones_p($SKIP) || NIL == id_index.id_index_tombstone_p(link2)) && NIL == inference_worker_answer.answer_link_p(link2)) {
                        cfasl_save_problem_store_problem_link(link2, stream);
                    }
                    id2 = Numbers.add(id2, ONE_INTEGER);
                }
            }
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 15500L)
    public static SubLObject cfasl_load_problem_store_problem_links(SubLObject store, SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject total = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        cfasl_load_ps_prepare_for_expected_link_count(total);
        inference_datastructures_problem_store.problem_store_prepare_for_expected_link_count(store, total);
        SubLObject _prev_bind_0 = inference_worker.$disable_link_propagationP$.currentBinding(thread);
        try {
            inference_worker.$disable_link_propagationP$.bind(T, thread);
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(total); i = Numbers.add(i, ONE_INTEGER)) {
                cfasl_load_problem_store_problem_link(store, stream);
            }
        } finally {
            inference_worker.$disable_link_propagationP$.rebind(_prev_bind_0, thread);
        }
        return total;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 16000L)
    public static SubLObject cfasl_save_problem_store_problem_link(SubLObject link, SubLObject stream) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : link;
        SubLObject suid = inference_datastructures_problem_link.problem_link_suid(link);
        SubLObject type = inference_datastructures_problem_link.problem_link_type(link);
        cfasl.cfasl_output(suid, stream);
        cfasl.cfasl_output(type, stream);
        SubLObject pcase_var = type;
        if (pcase_var.eql($REMOVAL)) {
            cfasl_save_removal_link(link, stream);
        } else if (pcase_var.eql($REWRITE)) {
            cfasl_save_rewrite_link(link, stream);
        } else if (pcase_var.eql($TRANSFORMATION)) {
            cfasl_save_transformation_link(link, stream);
        } else if (pcase_var.eql($RESIDUAL_TRANSFORMATION)) {
            cfasl_save_residual_transformation_link(link, stream);
        } else if (pcase_var.eql($RESTRICTION)) {
            cfasl_save_restriction_link(link, stream);
        } else if (pcase_var.eql($SPLIT)) {
            cfasl_save_split_link(link, stream);
        } else if (pcase_var.eql($JOIN_ORDERED)) {
            cfasl_save_join_ordered_link(link, stream);
        } else if (pcase_var.eql($JOIN)) {
            cfasl_save_join_link(link, stream);
        } else if (pcase_var.eql($UNION)) {
            cfasl_save_union_link(link, stream);
        } else {
            Errors.error($str56$Unexpected_link_type__S, type);
        }
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 17100L)
    public static SubLObject cfasl_load_problem_store_problem_link(SubLObject store, SubLObject stream) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject suid = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject type = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject link = NIL;
        SubLObject pcase_var = type;
        if (pcase_var.eql($REMOVAL)) {
            link = cfasl_load_removal_link(store, stream);
        } else if (pcase_var.eql($REWRITE)) {
            link = cfasl_load_rewrite_link(store, stream);
        } else if (pcase_var.eql($TRANSFORMATION)) {
            link = cfasl_load_transformation_link(store, stream);
        } else if (pcase_var.eql($RESIDUAL_TRANSFORMATION)) {
            link = cfasl_load_residual_transformation_link(store, stream);
        } else if (pcase_var.eql($RESTRICTION)) {
            link = cfasl_load_restriction_link(store, stream);
        } else if (pcase_var.eql($SPLIT)) {
            link = cfasl_load_split_link(store, stream);
        } else if (pcase_var.eql($JOIN_ORDERED)) {
            link = cfasl_load_join_ordered_link(store, stream);
        } else if (pcase_var.eql($JOIN)) {
            link = cfasl_load_join_link(store, stream);
        } else if (pcase_var.eql($UNION)) {
            link = cfasl_load_union_link(store, stream);
        } else {
            Errors.error($str56$Unexpected_link_type__S, type);
        }
        cfasl_load_ps_note_link_id(link, suid);
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 18400L)
    public static SubLObject cfasl_save_removal_link(SubLObject removal_link, SubLObject stream) {
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(removal_link), stream);
        cfasl_save_hl_module_reference(inference_worker_removal.removal_link_hl_module(removal_link), stream);
        cfasl.cfasl_output_externalized(inference_worker_removal.removal_link_bindings(removal_link), stream);
        cfasl.cfasl_output_externalized(inference_worker_removal.removal_link_supports(removal_link), stream);
        return removal_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 18800L)
    public static SubLObject cfasl_load_removal_link(SubLObject store, SubLObject stream) {
        SubLObject problem = cfasl_load_problem_reference(store, stream);
        SubLObject hl_module = cfasl_load_hl_module_reference(stream);
        SubLObject removal_bindings = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject supports = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject removal_link = inference_worker_removal.new_removal_link(problem, hl_module, removal_bindings, supports);
        return removal_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 19200L)
    public static SubLObject cfasl_save_rewrite_link(SubLObject rewrite_link, SubLObject stream) {
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link), stream);
        cfasl_save_mapped_problem_reference(inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(rewrite_link), stream);
        cfasl_save_hl_module_reference(inference_worker_rewrite.rewrite_link_hl_module(rewrite_link), stream);
        cfasl.cfasl_output_externalized(inference_worker_rewrite.rewrite_link_supports(rewrite_link), stream);
        return rewrite_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 19700L)
    public static SubLObject cfasl_load_rewrite_link(SubLObject store, SubLObject stream) {
        SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        SubLObject supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        SubLObject hl_module = cfasl_load_hl_module_reference(stream);
        SubLObject supports = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject rewrite_link = inference_worker_rewrite.new_rewrite_link(supported_problem, supporting_mapped_problem, hl_module, supports);
        return rewrite_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 20200L)
    public static SubLObject cfasl_save_transformation_link(SubLObject t_link, SubLObject stream) {
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(t_link), stream);
        cfasl_save_optional_mapped_problem_reference(inference_worker_transformation.transformation_link_supporting_mapped_problem(t_link), stream);
        cfasl_save_hl_module_reference(inference_worker_transformation.transformation_link_hl_module(t_link), stream);
        cfasl.cfasl_output_externalized(inference_worker_transformation.transformation_link_bindings(t_link), stream);
        cfasl.cfasl_output_externalized(inference_worker_transformation.transformation_link_rule_assertion(t_link), stream);
        cfasl.cfasl_output_externalized(inference_worker_transformation.transformation_link_more_supports(t_link), stream);
        cfasl.cfasl_output_externalized(inference_worker_transformation.transformation_link_non_explanatory_subquery(t_link), stream);
        return t_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 21100L)
    public static SubLObject cfasl_load_transformation_link(SubLObject store, SubLObject stream) {
        SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        SubLObject supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        SubLObject hl_module = cfasl_load_hl_module_reference(stream);
        SubLObject transformation_bindings = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject rule_assertion = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject more_supports = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject non_explanatory_subquery = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject transformation_link = inference_worker_transformation.new_transformation_link(supported_problem, supporting_mapped_problem, hl_module, transformation_bindings, rule_assertion, more_supports, non_explanatory_subquery);
        return transformation_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 21800L)
    public static SubLObject cfasl_save_residual_transformation_link(SubLObject rt_link, SubLObject stream) {
        cfasl_save_problem_link_reference(inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link), stream);
        cfasl_save_problem_link_reference(inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link), stream);
        cfasl_save_mapped_problem_reference(inference_worker_residual_transformation.residual_transformation_link_supporting_mapped_problem(rt_link), stream);
        cfasl.cfasl_output(inference_worker_residual_transformation.residual_transformation_link_conjunctive_problem_dont_care_variable_map(rt_link), stream);
        cfasl.cfasl_output(inference_worker_residual_transformation.residual_transformation_link_residual_conjunction_literal_map(rt_link), stream);
        return rt_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 22600L)
    public static SubLObject cfasl_load_residual_transformation_link(SubLObject store, SubLObject stream) {
        SubLObject join_ordered_link = cfasl_load_problem_link_reference(store, stream);
        SubLObject transformation_link = cfasl_load_problem_link_reference(store, stream);
        SubLObject supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        SubLObject conjunctive_problem_dont_care_variable_map = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject residual_conjunction_literal_map = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject residual_transformation_link = inference_worker_residual_transformation.new_residual_transformation_link(supporting_mapped_problem, join_ordered_link, transformation_link, conjunctive_problem_dont_care_variable_map, residual_conjunction_literal_map);
        return residual_transformation_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 23300L)
    public static SubLObject cfasl_save_restriction_link(SubLObject restriction_link, SubLObject stream) {
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(restriction_link), stream);
        cfasl_save_mapped_problem_reference(inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(restriction_link), stream);
        cfasl.cfasl_output_externalized(inference_worker_restriction.restriction_link_bindings(restriction_link), stream);
        cfasl.cfasl_output(inference_worker_restriction.restriction_listening_link_p(restriction_link), stream);
        cfasl_save_optional_hl_module_reference(inference_worker_restriction.restriction_link_hl_module(restriction_link), stream);
        return restriction_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 24000L)
    public static SubLObject cfasl_load_restriction_link(SubLObject store, SubLObject stream) {
        SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        SubLObject supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        SubLObject restriction_bindings = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject listening_linkP = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject hl_module = cfasl_load_optional_hl_module_reference(stream);
        SubLObject restriction_link = inference_worker_restriction.new_restriction_link(supported_problem, supporting_mapped_problem, restriction_bindings, listening_linkP, hl_module);
        return restriction_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 24600L)
    public static SubLObject cfasl_save_split_link(SubLObject split_link, SubLObject stream) {
        assert NIL != inference_worker_split.split_link_p(split_link) : split_link;
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(split_link), stream);
        SubLObject mapped_problems = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
        cfasl.cfasl_output(Sequences.length(mapped_problems), stream);
        SubLObject cdolist_list_var = Sequences.reverse(mapped_problems);
        SubLObject mapped_problem = NIL;
        mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cfasl_save_mapped_problem_reference(mapped_problem, stream);
            cdolist_list_var = cdolist_list_var.rest();
            mapped_problem = cdolist_list_var.first();
        }
        return split_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 25100L)
    public static SubLObject cfasl_load_split_link(SubLObject store, SubLObject stream) {
        SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        SubLObject supporting_mapped_problems = cfasl_load_split_link_conjuncts(store, stream);
        SubLObject split_link = inference_worker_split.new_split_link(supported_problem, supporting_mapped_problems);
        return split_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 25500L)
    public static SubLObject cfasl_load_split_link_conjuncts(SubLObject store, SubLObject stream) {
        SubLObject supporting_problem_count = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject supporting_mapped_problems = NIL;
        SubLObject i;
        SubLObject supporting_mapped_problem;
        for (i = NIL, i = ZERO_INTEGER; i.numL(supporting_problem_count); i = Numbers.add(i, ONE_INTEGER)) {
            supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
            supporting_mapped_problems = cons(supporting_mapped_problem, supporting_mapped_problems);
        }
        return Sequences.nreverse(supporting_mapped_problems);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 25900L)
    public static SubLObject cfasl_save_join_ordered_link(SubLObject jo_link, SubLObject stream) {
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(jo_link), stream);
        cfasl_save_mapped_problem_reference(inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link), stream);
        if (NIL != inference_worker_join_ordered.join_ordered_link_has_non_focal_mapped_problemP(jo_link)) {
            cfasl_save_mapped_problem_reference(inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(jo_link), stream);
        } else {
            cfasl.cfasl_output(NIL, stream);
        }
        return jo_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 26400L)
    public static SubLObject cfasl_load_join_ordered_link(SubLObject store, SubLObject stream) {
        SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        SubLObject focal_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        SubLObject non_focal_mapped_problem = cfasl_load_optional_mapped_problem_reference(store, stream);
        SubLObject join_ordered_link = inference_worker_join_ordered.new_join_ordered_link(supported_problem, focal_mapped_problem, non_focal_mapped_problem);
        return join_ordered_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 26800L)
    public static SubLObject cfasl_save_join_link(SubLObject join_link, SubLObject stream) {
        assert NIL != inference_worker_join.join_link_p(join_link) : join_link;
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(join_link), stream);
        cfasl_save_mapped_problem_reference(inference_worker_join.join_link_first_mapped_problem(join_link), stream);
        cfasl_save_mapped_problem_reference(inference_worker_join.join_link_second_mapped_problem(join_link), stream);
        return join_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 27200L)
    public static SubLObject cfasl_load_join_link(SubLObject store, SubLObject stream) {
        SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        SubLObject first_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        SubLObject second_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        SubLObject join_link = inference_worker_join.new_join_link(supported_problem, first_mapped_problem, second_mapped_problem);
        return join_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 27700L)
    public static SubLObject cfasl_save_union_link(SubLObject union_link, SubLObject stream) {
        assert NIL != inference_worker_union.union_link_p(union_link) : union_link;
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(union_link), stream);
        cfasl_save_mapped_problem_reference(inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(union_link), stream);
        return union_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 28000L)
    public static SubLObject cfasl_load_union_link(SubLObject store, SubLObject stream) {
        SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        SubLObject supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        SubLObject union_link = inference_worker_union.new_union_link(supported_problem, supporting_mapped_problem);
        return union_link;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 28300L)
    public static SubLObject cfasl_save_problem_reference(SubLObject problem, SubLObject stream) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return cfasl.cfasl_output(inference_datastructures_problem.problem_suid(problem), stream);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 28500L)
    public static SubLObject cfasl_load_problem_reference(SubLObject store, SubLObject stream) {
        return cfasl_load_ps_lookup_problem(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 28600L)
    public static SubLObject cfasl_save_mapped_problem_reference(SubLObject mapped_problem, SubLObject stream) {
        return cfasl_save_mapped_problem_reference_int(mapped_problem, stream, T);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 28800L)
    public static SubLObject cfasl_load_mapped_problem_reference(SubLObject store, SubLObject stream) {
        return cfasl_load_mapped_problem_reference_int(store, stream, T);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 28900L)
    public static SubLObject cfasl_save_optional_mapped_problem_reference(SubLObject mapped_problem, SubLObject stream) {
        return cfasl_save_mapped_problem_reference_int(mapped_problem, stream, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 29100L)
    public static SubLObject cfasl_load_optional_mapped_problem_reference(SubLObject store, SubLObject stream) {
        return cfasl_load_mapped_problem_reference_int(store, stream, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 29200L)
    public static SubLObject cfasl_save_mapped_problem_reference_int(SubLObject mapped_problem, SubLObject stream, SubLObject requiredP) {
        if (NIL == mapped_problem && NIL == requiredP) {
            return cfasl.cfasl_output(NIL, stream);
        }
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(mapped_problem) : mapped_problem;
        SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
        SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
        SubLObject suid = inference_datastructures_problem.problem_suid(problem);
        cfasl.cfasl_output(suid, stream);
        cfasl.cfasl_output_externalized(variable_map, stream);
        return suid;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 29800L)
    public static SubLObject cfasl_load_mapped_problem_reference_int(SubLObject store, SubLObject stream, SubLObject requiredP) {
        SubLObject suid = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (NIL != suid || NIL != requiredP) {
            SubLObject variable_map = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject problem = cfasl_load_ps_lookup_problem(suid);
            SubLObject mapped_problem = inference_datastructures_problem_link.new_mapped_problem(problem, variable_map);
            return mapped_problem;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 30100L)
    public static SubLObject cfasl_save_problem_link_reference(SubLObject link, SubLObject stream) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : link;
        return cfasl.cfasl_output(inference_datastructures_problem_link.problem_link_suid(link), stream);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 30300L)
    public static SubLObject cfasl_load_problem_link_reference(SubLObject store, SubLObject stream) {
        return cfasl_load_ps_lookup_link(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 30400L)
    public static SubLObject cfasl_save_proof_reference(SubLObject proof, SubLObject stream) {
        assert NIL != inference_datastructures_proof.proof_p(proof) : proof;
        return cfasl.cfasl_output(inference_datastructures_proof.proof_suid(proof), stream);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 30600L)
    public static SubLObject cfasl_load_proof_reference(SubLObject store, SubLObject stream) {
        return cfasl_load_ps_lookup_proof(cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 30700L)
    public static SubLObject cfasl_save_hl_module_reference(SubLObject hl_module, SubLObject stream) {
        return cfasl_save_hl_module_reference_int(hl_module, stream, T);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 30800L)
    public static SubLObject cfasl_load_hl_module_reference(SubLObject stream) {
        return cfasl_load_hl_module_reference_int(stream, T);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 31000L)
    public static SubLObject cfasl_save_optional_hl_module_reference(SubLObject hl_module, SubLObject stream) {
        return cfasl_save_hl_module_reference_int(hl_module, stream, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 31100L)
    public static SubLObject cfasl_load_optional_hl_module_reference(SubLObject stream) {
        return cfasl_load_hl_module_reference_int(stream, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 31200L)
    public static SubLObject cfasl_save_hl_module_reference_int(SubLObject hl_module, SubLObject stream, SubLObject requiredP) {
        if (NIL == hl_module && NIL == requiredP) {
            return cfasl.cfasl_output(NIL, stream);
        }
        assert NIL != inference_modules.hl_module_p(hl_module) : hl_module;
        SubLObject name = inference_modules.hl_module_name(hl_module);
        cfasl.cfasl_output(name, stream);
        return name;
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 31500L)
    public static SubLObject cfasl_load_hl_module_reference_int(SubLObject stream, SubLObject requiredP) {
        SubLObject name = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (NIL == name && NIL == requiredP) {
            return NIL;
        }
        SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != hl_module) {
            return hl_module;
        }
        return inference_modules.cfasl_create_invalid_hl_module(name);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 31800L)
    public static SubLObject cfasl_unsupported_type_error(SubLObject type) {
        return Errors.error($str64$CFASL_does_not_support_objects_of, type);
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 32400L)
    public static SubLObject cfasl_output_object_problem_store_method(SubLObject v_object, SubLObject stream) {
        return cfasl_unsupported_type_error(Types.type_of(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 32500L)
    public static SubLObject cfasl_output_object_problem_method(SubLObject v_object, SubLObject stream) {
        return cfasl_unsupported_type_error(Types.type_of(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 32700L)
    public static SubLObject cfasl_output_object_tactic_method(SubLObject v_object, SubLObject stream) {
        return cfasl_unsupported_type_error(Types.type_of(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 32800L)
    public static SubLObject cfasl_output_object_problem_link_method(SubLObject v_object, SubLObject stream) {
        return cfasl_unsupported_type_error(Types.type_of(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 32900L)
    public static SubLObject cfasl_output_object_proof_method(SubLObject v_object, SubLObject stream) {
        return cfasl_unsupported_type_error(Types.type_of(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 33100L)
    public static SubLObject cfasl_output_object_strategy_method(SubLObject v_object, SubLObject stream) {
        return cfasl_unsupported_type_error(Types.type_of(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 33200L)
    public static SubLObject cfasl_output_object_inference_method(SubLObject v_object, SubLObject stream) {
        return cfasl_unsupported_type_error(Types.type_of(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 33400L)
    public static SubLObject cfasl_output_object_inference_answer_method(SubLObject v_object, SubLObject stream) {
        return cfasl_unsupported_type_error(Types.type_of(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 33500L)
    public static SubLObject cfasl_output_object_inference_answer_justification_method(SubLObject v_object, SubLObject stream) {
        return cfasl_unsupported_type_error(Types.type_of(v_object));
    }

    public static SubLObject declare_inference_serialization_file() {
        declareFunction(myName, "save_problem_store", "SAVE-PROBLEM-STORE", 2, 1, false);
        declareFunction(myName, "load_problem_store", "LOAD-PROBLEM-STORE", 1, 2, false);
        declareFunction(myName, "cfasl_save_problem_store", "CFASL-SAVE-PROBLEM-STORE", 2, 0, false);
        declareFunction(myName, "cfasl_load_problem_store", "CFASL-LOAD-PROBLEM-STORE", 1, 0, false);
        declareMacro(me, "with_clean_cfasl_load_ps_ids", "WITH-CLEAN-CFASL-LOAD-PS-IDS");
        declareFunction(myName, "cfasl_load_ps_prepare_for_expected_problem_count", "CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-PROBLEM-COUNT", 1, 0, false);
        declareFunction(myName, "cfasl_load_ps_prepare_for_expected_link_count", "CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-LINK-COUNT", 1, 0, false);
        declareFunction(myName, "cfasl_load_ps_prepare_for_expected_proof_count", "CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-PROOF-COUNT", 1, 0, false);
        declareFunction(myName, "cfasl_load_ps_note_problem_id", "CFASL-LOAD-PS-NOTE-PROBLEM-ID", 2, 0, false);
        declareFunction(myName, "cfasl_load_ps_lookup_problem", "CFASL-LOAD-PS-LOOKUP-PROBLEM", 1, 0, false);
        declareFunction(myName, "cfasl_load_ps_note_link_id", "CFASL-LOAD-PS-NOTE-LINK-ID", 2, 0, false);
        declareFunction(myName, "cfasl_load_ps_lookup_link", "CFASL-LOAD-PS-LOOKUP-LINK", 1, 0, false);
        declareFunction(myName, "cfasl_load_ps_note_proof_id", "CFASL-LOAD-PS-NOTE-PROOF-ID", 2, 0, false);
        declareFunction(myName, "cfasl_load_ps_lookup_proof", "CFASL-LOAD-PS-LOOKUP-PROOF", 1, 0, false);
        declareMacro(me, "with_cfasl_load_ps_constant_table", "WITH-CFASL-LOAD-PS-CONSTANT-TABLE");
        declareFunction(myName, "cfasl_load_ps_lookup_constant", "CFASL-LOAD-PS-LOOKUP-CONSTANT", 1, 0, false);
        declareFunction(myName, "cfasl_save_problem_store_1_0", "CFASL-SAVE-PROBLEM-STORE-1-0", 2, 0, false);
        declareFunction(myName, "cfasl_load_problem_store_1_0", "CFASL-LOAD-PROBLEM-STORE-1-0", 1, 0, false);
        declareFunction(myName, "compute_problem_store_common_symbols", "COMPUTE-PROBLEM-STORE-COMMON-SYMBOLS", 1, 0, false);
        declareFunction(myName, "possibly_note_problem_store_common_constant", "POSSIBLY-NOTE-PROBLEM-STORE-COMMON-CONSTANT", 1, 0, false);
        declareFunction(myName, "compute_problem_store_common_constants", "COMPUTE-PROBLEM-STORE-COMMON-CONSTANTS", 1, 0, false);
        declareFunction(myName, "make_constant_internal_id_map", "MAKE-CONSTANT-INTERNAL-ID-MAP", 1, 0, false);
        declareFunction(myName, "make_hash_table_from_set", "MAKE-HASH-TABLE-FROM-SET", 1, 3, false);
        declareFunction(myName, "cfasl_save_problem_store_properties", "CFASL-SAVE-PROBLEM-STORE-PROPERTIES", 2, 0, false);
        declareFunction(myName, "cfasl_load_problem_store_properties", "CFASL-LOAD-PROBLEM-STORE-PROPERTIES", 1, 0, false);
        declareFunction(myName, "cfasl_save_problem_store_problems", "CFASL-SAVE-PROBLEM-STORE-PROBLEMS", 2, 0, false);
        declareFunction(myName, "cfasl_load_problem_store_problems", "CFASL-LOAD-PROBLEM-STORE-PROBLEMS", 2, 0, false);
        declareFunction(myName, "cfasl_save_problem_store_problem", "CFASL-SAVE-PROBLEM-STORE-PROBLEM", 2, 0, false);
        declareFunction(myName, "cfasl_load_problem_store_problem", "CFASL-LOAD-PROBLEM-STORE-PROBLEM", 2, 0, false);
        declareFunction(myName, "cfasl_save_problem_store_proofs", "CFASL-SAVE-PROBLEM-STORE-PROOFS", 2, 0, false);
        declareFunction(myName, "cfasl_load_problem_store_proofs", "CFASL-LOAD-PROBLEM-STORE-PROOFS", 2, 0, false);
        declareFunction(myName, "cfasl_save_problem_store_proof", "CFASL-SAVE-PROBLEM-STORE-PROOF", 2, 0, false);
        declareFunction(myName, "cfasl_load_problem_store_proof", "CFASL-LOAD-PROBLEM-STORE-PROOF", 2, 0, false);
        declareFunction(myName, "cfasl_load_proof_subproofs", "CFASL-LOAD-PROOF-SUBPROOFS", 2, 0, false);
        declareFunction(myName, "cfasl_save_problem_store_problem_links", "CFASL-SAVE-PROBLEM-STORE-PROBLEM-LINKS", 2, 0, false);
        declareFunction(myName, "cfasl_load_problem_store_problem_links", "CFASL-LOAD-PROBLEM-STORE-PROBLEM-LINKS", 2, 0, false);
        declareFunction(myName, "cfasl_save_problem_store_problem_link", "CFASL-SAVE-PROBLEM-STORE-PROBLEM-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_load_problem_store_problem_link", "CFASL-LOAD-PROBLEM-STORE-PROBLEM-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_save_removal_link", "CFASL-SAVE-REMOVAL-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_load_removal_link", "CFASL-LOAD-REMOVAL-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_save_rewrite_link", "CFASL-SAVE-REWRITE-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_load_rewrite_link", "CFASL-LOAD-REWRITE-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_save_transformation_link", "CFASL-SAVE-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_load_transformation_link", "CFASL-LOAD-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_save_residual_transformation_link", "CFASL-SAVE-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_load_residual_transformation_link", "CFASL-LOAD-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_save_restriction_link", "CFASL-SAVE-RESTRICTION-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_load_restriction_link", "CFASL-LOAD-RESTRICTION-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_save_split_link", "CFASL-SAVE-SPLIT-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_load_split_link", "CFASL-LOAD-SPLIT-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_load_split_link_conjuncts", "CFASL-LOAD-SPLIT-LINK-CONJUNCTS", 2, 0, false);
        declareFunction(myName, "cfasl_save_join_ordered_link", "CFASL-SAVE-JOIN-ORDERED-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_load_join_ordered_link", "CFASL-LOAD-JOIN-ORDERED-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_save_join_link", "CFASL-SAVE-JOIN-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_load_join_link", "CFASL-LOAD-JOIN-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_save_union_link", "CFASL-SAVE-UNION-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_load_union_link", "CFASL-LOAD-UNION-LINK", 2, 0, false);
        declareFunction(myName, "cfasl_save_problem_reference", "CFASL-SAVE-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction(myName, "cfasl_load_problem_reference", "CFASL-LOAD-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction(myName, "cfasl_save_mapped_problem_reference", "CFASL-SAVE-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction(myName, "cfasl_load_mapped_problem_reference", "CFASL-LOAD-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction(myName, "cfasl_save_optional_mapped_problem_reference", "CFASL-SAVE-OPTIONAL-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction(myName, "cfasl_load_optional_mapped_problem_reference", "CFASL-LOAD-OPTIONAL-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction(myName, "cfasl_save_mapped_problem_reference_int", "CFASL-SAVE-MAPPED-PROBLEM-REFERENCE-INT", 3, 0, false);
        declareFunction(myName, "cfasl_load_mapped_problem_reference_int", "CFASL-LOAD-MAPPED-PROBLEM-REFERENCE-INT", 3, 0, false);
        declareFunction(myName, "cfasl_save_problem_link_reference", "CFASL-SAVE-PROBLEM-LINK-REFERENCE", 2, 0, false);
        declareFunction(myName, "cfasl_load_problem_link_reference", "CFASL-LOAD-PROBLEM-LINK-REFERENCE", 2, 0, false);
        declareFunction(myName, "cfasl_save_proof_reference", "CFASL-SAVE-PROOF-REFERENCE", 2, 0, false);
        declareFunction(myName, "cfasl_load_proof_reference", "CFASL-LOAD-PROOF-REFERENCE", 2, 0, false);
        declareFunction(myName, "cfasl_save_hl_module_reference", "CFASL-SAVE-HL-MODULE-REFERENCE", 2, 0, false);
        declareFunction(myName, "cfasl_load_hl_module_reference", "CFASL-LOAD-HL-MODULE-REFERENCE", 1, 0, false);
        declareFunction(myName, "cfasl_save_optional_hl_module_reference", "CFASL-SAVE-OPTIONAL-HL-MODULE-REFERENCE", 2, 0, false);
        declareFunction(myName, "cfasl_load_optional_hl_module_reference", "CFASL-LOAD-OPTIONAL-HL-MODULE-REFERENCE", 1, 0, false);
        declareFunction(myName, "cfasl_save_hl_module_reference_int", "CFASL-SAVE-HL-MODULE-REFERENCE-INT", 3, 0, false);
        declareFunction(myName, "cfasl_load_hl_module_reference_int", "CFASL-LOAD-HL-MODULE-REFERENCE-INT", 2, 0, false);
        declareFunction(myName, "cfasl_unsupported_type_error", "CFASL-UNSUPPORTED-TYPE-ERROR", 1, 0, false);
        declareFunction(myName, "cfasl_output_object_problem_store_method", "CFASL-OUTPUT-OBJECT-PROBLEM-STORE-METHOD", 2, 0, false);
        declareFunction(myName, "cfasl_output_object_problem_method", "CFASL-OUTPUT-OBJECT-PROBLEM-METHOD", 2, 0, false);
        declareFunction(myName, "cfasl_output_object_tactic_method", "CFASL-OUTPUT-OBJECT-TACTIC-METHOD", 2, 0, false);
        declareFunction(myName, "cfasl_output_object_problem_link_method", "CFASL-OUTPUT-OBJECT-PROBLEM-LINK-METHOD", 2, 0, false);
        declareFunction(myName, "cfasl_output_object_proof_method", "CFASL-OUTPUT-OBJECT-PROOF-METHOD", 2, 0, false);
        declareFunction(myName, "cfasl_output_object_strategy_method", "CFASL-OUTPUT-OBJECT-STRATEGY-METHOD", 2, 0, false);
        declareFunction(myName, "cfasl_output_object_inference_method", "CFASL-OUTPUT-OBJECT-INFERENCE-METHOD", 2, 0, false);
        declareFunction(myName, "cfasl_output_object_inference_answer_method", "CFASL-OUTPUT-OBJECT-INFERENCE-ANSWER-METHOD", 2, 0, false);
        declareFunction(myName, "cfasl_output_object_inference_answer_justification_method", "CFASL-OUTPUT-OBJECT-INFERENCE-ANSWER-JUSTIFICATION-METHOD", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_serialization_file() {
        $inference_serialization_supports_problem_free_hl_var_optimizationP$ = SubLFiles.defparameter("*INFERENCE-SERIALIZATION-SUPPORTS-PROBLEM-FREE-HL-VAR-OPTIMIZATION?*", NIL);
        $current_cfasl_save_problem_store_version$ = deflexical("*CURRENT-CFASL-SAVE-PROBLEM-STORE-VERSION*", $str10$1_0);
        $cfasl_load_ps_problem_table$ = defparameter("*CFASL-LOAD-PS-PROBLEM-TABLE*", $UNINITIALIZED);
        $cfasl_load_ps_link_table$ = defparameter("*CFASL-LOAD-PS-LINK-TABLE*", $UNINITIALIZED);
        $cfasl_load_ps_proof_table$ = defparameter("*CFASL-LOAD-PS-PROOF-TABLE*", $UNINITIALIZED);
        $cfasl_load_ps_constant_table$ = defparameter("*CFASL-LOAD-PS-CONSTANT-TABLE*", $UNINITIALIZED);
        $problem_store_common_constants$ = defparameter("*PROBLEM-STORE-COMMON-CONSTANTS*", NIL);
        return NIL;
    }

    public static SubLObject setup_inference_serialization_file() {
        access_macros.register_macro_helper($sym16$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_PROBLEM_COUNT, $sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper($sym18$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_LINK_COUNT, $sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper($sym19$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_PROOF_COUNT, $sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper($sym20$CFASL_LOAD_PS_NOTE_PROBLEM_ID, $sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper($sym21$CFASL_LOAD_PS_LOOKUP_PROBLEM, $sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper($sym22$CFASL_LOAD_PS_NOTE_LINK_ID, $sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper($sym23$CFASL_LOAD_PS_LOOKUP_LINK, $sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper($sym24$CFASL_LOAD_PS_NOTE_PROOF_ID, $sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper($sym25$CFASL_LOAD_PS_LOOKUP_PROOF, $sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper($sym29$CFASL_LOAD_PS_LOOKUP_CONSTANT, $sym30$WITH_CFASL_LOAD_PS_CONSTANT_TABLE);
        utilities_macros.note_funcall_helper_function($sym40$POSSIBLY_NOTE_PROBLEM_STORE_COMMON_CONSTANT);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_problem_store.$dtp_problem_store$.getGlobalValue(), Symbols.symbol_function($sym65$CFASL_OUTPUT_OBJECT_PROBLEM_STORE_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_problem.$dtp_problem$.getGlobalValue(), Symbols.symbol_function($sym66$CFASL_OUTPUT_OBJECT_PROBLEM_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_tactic.$dtp_tactic$.getGlobalValue(), Symbols.symbol_function($sym67$CFASL_OUTPUT_OBJECT_TACTIC_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_problem_link$.getGlobalValue(), Symbols.symbol_function($sym68$CFASL_OUTPUT_OBJECT_PROBLEM_LINK_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_proof.$dtp_proof$.getGlobalValue(), Symbols.symbol_function($sym69$CFASL_OUTPUT_OBJECT_PROOF_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_strategy.$dtp_strategy$.getGlobalValue(), Symbols.symbol_function($sym70$CFASL_OUTPUT_OBJECT_STRATEGY_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_inference.$dtp_inference$.getGlobalValue(), Symbols.symbol_function($sym71$CFASL_OUTPUT_OBJECT_INFERENCE_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_inference.$dtp_inference_answer$.getGlobalValue(), Symbols.symbol_function($sym72$CFASL_OUTPUT_OBJECT_INFERENCE_ANSWER_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_inference.$dtp_inference_answer_justification$.getGlobalValue(), Symbols.symbol_function($sym73$CFASL_OUTPUT_OBJECT_INFERENCE_ANSWER_JUSTIFICATION_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_serialization_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_serialization_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_serialization_file();
    }

    static {
        me = new inference_serialization();
        $inference_serialization_supports_problem_free_hl_var_optimizationP$ = null;
        $current_cfasl_save_problem_store_version$ = null;
        $cfasl_load_ps_problem_table$ = null;
        $cfasl_load_ps_link_table$ = null;
        $cfasl_load_ps_proof_table$ = null;
        $cfasl_load_ps_constant_table$ = null;
        $problem_store_common_constants$ = null;
        $CFASL = makeKeyword("CFASL");
        $sym1$PROBLEM_STORE_P = makeSymbol("PROBLEM-STORE-P");
        $sym2$STRINGP = makeSymbol("STRINGP");
        $OUTPUT = makeKeyword("OUTPUT");
        $str4$Unable_to_open__S = makeString("Unable to open ~S");
        $XML = makeKeyword("XML");
        $str6$Time_to_implement_XML_problem_sto = makeString("Time to implement XML problem-store output serialization.");
        $str7$Unexpected_protocol__S = makeString("Unexpected protocol ~S");
        $INPUT = makeKeyword("INPUT");
        $str9$Time_to_implement_XML_problem_sto = makeString("Time to implement XML problem-store input serialization.");
        $str10$1_0 = makeString("1.0");
        $sym11$STREAMP = makeSymbol("STREAMP");
        $str12$Unsupported_serialization_version = makeString("Unsupported serialization version ~A");
        $sym13$CLET = makeSymbol("CLET");
        $list14 = list(list(makeSymbol("*CFASL-LOAD-PS-PROBLEM-TABLE*"), makeKeyword("UNINITIALIZED")), list(makeSymbol("*CFASL-LOAD-PS-LINK-TABLE*"), makeKeyword("UNINITIALIZED")), list(makeSymbol("*CFASL-LOAD-PS-PROOF-TABLE*"), makeKeyword("UNINITIALIZED")));
        $UNINITIALIZED = makeKeyword("UNINITIALIZED");
        $sym16$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_PROBLEM_COUNT = makeSymbol("CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-PROBLEM-COUNT");
        $sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS = makeSymbol("WITH-CLEAN-CFASL-LOAD-PS-IDS");
        $sym18$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_LINK_COUNT = makeSymbol("CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-LINK-COUNT");
        $sym19$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_PROOF_COUNT = makeSymbol("CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-PROOF-COUNT");
        $sym20$CFASL_LOAD_PS_NOTE_PROBLEM_ID = makeSymbol("CFASL-LOAD-PS-NOTE-PROBLEM-ID");
        $sym21$CFASL_LOAD_PS_LOOKUP_PROBLEM = makeSymbol("CFASL-LOAD-PS-LOOKUP-PROBLEM");
        $sym22$CFASL_LOAD_PS_NOTE_LINK_ID = makeSymbol("CFASL-LOAD-PS-NOTE-LINK-ID");
        $sym23$CFASL_LOAD_PS_LOOKUP_LINK = makeSymbol("CFASL-LOAD-PS-LOOKUP-LINK");
        $sym24$CFASL_LOAD_PS_NOTE_PROOF_ID = makeSymbol("CFASL-LOAD-PS-NOTE-PROOF-ID");
        $sym25$CFASL_LOAD_PS_LOOKUP_PROOF = makeSymbol("CFASL-LOAD-PS-LOOKUP-PROOF");
        $list26 = list(makeSymbol("CONSTANT-TABLE"), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym27$_CFASL_LOAD_PS_CONSTANT_TABLE_ = makeSymbol("*CFASL-LOAD-PS-CONSTANT-TABLE*");
        $list28 = list(list(makeSymbol("*CFASL-CONSTANT-HANDLE-LOOKUP-FUNC*"), list(makeSymbol("QUOTE"), makeSymbol("CFASL-LOAD-PS-LOOKUP-CONSTANT"))), list(makeSymbol("*CFASL-INPUT-GUID-STRING-RESOURCE*"), list(makeSymbol("GUID-TO-STRING"), list(makeSymbol("NEW-GUID")))));
        $sym29$CFASL_LOAD_PS_LOOKUP_CONSTANT = makeSymbol("CFASL-LOAD-PS-LOOKUP-CONSTANT");
        $sym30$WITH_CFASL_LOAD_PS_CONSTANT_TABLE = makeSymbol("WITH-CFASL-LOAD-PS-CONSTANT-TABLE");
        $str31$Unable_to_lookup_a_constant_from_ = makeString("Unable to lookup a constant from ~S");
        $PROBLEM = makeKeyword("PROBLEM");
        $PROBLEM_LINK = makeKeyword("PROBLEM-LINK");
        $PROOF = makeKeyword("PROOF");
        $DONE = makeKeyword("DONE");
        $str36$Unexpected_section__S = makeString("Unexpected section ~S");
        $SKIP = makeKeyword("SKIP");
        $sym38$STRING_LESSP = makeSymbol("STRING-LESSP");
        $sym39$SYMBOL_NAME = makeSymbol("SYMBOL-NAME");
        $sym40$POSSIBLY_NOTE_PROBLEM_STORE_COMMON_CONSTANT = makeSymbol("POSSIBLY-NOTE-PROBLEM-STORE-COMMON-CONSTANT");
        $int$100 = makeInteger(100);
        $sym42$CONSTANT_INTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID");
        $sym43$SET_P = makeSymbol("SET-P");
        $sym44$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
        $sym45$PROBLEM_STORE_PROPERTIES_P = makeSymbol("PROBLEM-STORE-PROPERTIES-P");
        $sym46$PROBLEM_LINK_P = makeSymbol("PROBLEM-LINK-P");
        $REMOVAL = makeKeyword("REMOVAL");
        $REWRITE = makeKeyword("REWRITE");
        $TRANSFORMATION = makeKeyword("TRANSFORMATION");
        $RESIDUAL_TRANSFORMATION = makeKeyword("RESIDUAL-TRANSFORMATION");
        $RESTRICTION = makeKeyword("RESTRICTION");
        $SPLIT = makeKeyword("SPLIT");
        $JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
        $JOIN = makeKeyword("JOIN");
        $UNION = makeKeyword("UNION");
        $str56$Unexpected_link_type__S = makeString("Unexpected link type ~S");
        $sym57$SPLIT_LINK_P = makeSymbol("SPLIT-LINK-P");
        $sym58$JOIN_LINK_P = makeSymbol("JOIN-LINK-P");
        $sym59$UNION_LINK_P = makeSymbol("UNION-LINK-P");
        $sym60$PROBLEM_P = makeSymbol("PROBLEM-P");
        $sym61$MAPPED_PROBLEM_P = makeSymbol("MAPPED-PROBLEM-P");
        $sym62$PROOF_P = makeSymbol("PROOF-P");
        $sym63$HL_MODULE_P = makeSymbol("HL-MODULE-P");
        $str64$CFASL_does_not_support_objects_of = makeString("CFASL does not support objects of type ~A");
        $sym65$CFASL_OUTPUT_OBJECT_PROBLEM_STORE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-PROBLEM-STORE-METHOD");
        $sym66$CFASL_OUTPUT_OBJECT_PROBLEM_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-PROBLEM-METHOD");
        $sym67$CFASL_OUTPUT_OBJECT_TACTIC_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-TACTIC-METHOD");
        $sym68$CFASL_OUTPUT_OBJECT_PROBLEM_LINK_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-PROBLEM-LINK-METHOD");
        $sym69$CFASL_OUTPUT_OBJECT_PROOF_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-PROOF-METHOD");
        $sym70$CFASL_OUTPUT_OBJECT_STRATEGY_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-STRATEGY-METHOD");
        $sym71$CFASL_OUTPUT_OBJECT_INFERENCE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-INFERENCE-METHOD");
        $sym72$CFASL_OUTPUT_OBJECT_INFERENCE_ANSWER_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-INFERENCE-ANSWER-METHOD");
        $sym73$CFASL_OUTPUT_OBJECT_INFERENCE_ANSWER_JUSTIFICATION_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-INFERENCE-ANSWER-JUSTIFICATION-METHOD");
    }
}
/*
 *
 * Total time: 429 ms
 *
 */