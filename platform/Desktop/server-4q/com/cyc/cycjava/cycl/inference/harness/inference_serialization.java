package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.list_utilities;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.cfasl_kb_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_serialization extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_serialization";
    public static final String myFingerPrint = "0c8edd6c871644b82d56b2d5def6e38d26bc89d6a51db812f95cb18605f33e30";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 966L)
    private static SubLSymbol $inference_serialization_supports_problem_free_hl_var_optimizationP$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 2449L)
    private static SubLSymbol $current_cfasl_save_problem_store_version$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 3653L)
    public static SubLSymbol $cfasl_load_ps_problem_table$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 3767L)
    public static SubLSymbol $cfasl_load_ps_link_table$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 3877L)
    public static SubLSymbol $cfasl_load_ps_proof_table$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 5860L)
    public static SubLSymbol $cfasl_load_ps_constant_table$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 9165L)
    private static SubLSymbol $problem_store_common_constants$;
    private static final SubLSymbol $kw0$CFASL;
    private static final SubLSymbol $sym1$PROBLEM_STORE_P;
    private static final SubLSymbol $sym2$STRINGP;
    private static final SubLSymbol $kw3$OUTPUT;
    private static final SubLString $str4$Unable_to_open__S;
    private static final SubLSymbol $kw5$XML;
    private static final SubLString $str6$Time_to_implement_XML_problem_sto;
    private static final SubLString $str7$Unexpected_protocol__S;
    private static final SubLSymbol $kw8$INPUT;
    private static final SubLString $str9$Time_to_implement_XML_problem_sto;
    private static final SubLString $str10$1_0;
    private static final SubLSymbol $sym11$STREAMP;
    private static final SubLString $str12$Unsupported_serialization_version;
    private static final SubLSymbol $sym13$CLET;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$UNINITIALIZED;
    private static final SubLSymbol $sym16$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_PROBLEM_COUNT;
    private static final SubLSymbol $sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS;
    private static final SubLSymbol $sym18$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_LINK_COUNT;
    private static final SubLSymbol $sym19$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_PROOF_COUNT;
    private static final SubLSymbol $sym20$CFASL_LOAD_PS_NOTE_PROBLEM_ID;
    private static final SubLSymbol $sym21$CFASL_LOAD_PS_LOOKUP_PROBLEM;
    private static final SubLSymbol $sym22$CFASL_LOAD_PS_NOTE_LINK_ID;
    private static final SubLSymbol $sym23$CFASL_LOAD_PS_LOOKUP_LINK;
    private static final SubLSymbol $sym24$CFASL_LOAD_PS_NOTE_PROOF_ID;
    private static final SubLSymbol $sym25$CFASL_LOAD_PS_LOOKUP_PROOF;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$_CFASL_LOAD_PS_CONSTANT_TABLE_;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$CFASL_LOAD_PS_LOOKUP_CONSTANT;
    private static final SubLSymbol $sym30$WITH_CFASL_LOAD_PS_CONSTANT_TABLE;
    private static final SubLString $str31$Unable_to_lookup_a_constant_from_;
    private static final SubLSymbol $kw32$PROBLEM;
    private static final SubLSymbol $kw33$PROBLEM_LINK;
    private static final SubLSymbol $kw34$PROOF;
    private static final SubLSymbol $kw35$DONE;
    private static final SubLString $str36$Unexpected_section__S;
    private static final SubLSymbol $kw37$SKIP;
    private static final SubLSymbol $sym38$STRING_LESSP;
    private static final SubLSymbol $sym39$SYMBOL_NAME;
    private static final SubLSymbol $sym40$POSSIBLY_NOTE_PROBLEM_STORE_COMMON_CONSTANT;
    private static final SubLInteger $int41$100;
    private static final SubLSymbol $sym42$CONSTANT_INTERNAL_ID;
    private static final SubLSymbol $sym43$SET_P;
    private static final SubLSymbol $sym44$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym45$PROBLEM_STORE_PROPERTIES_P;
    private static final SubLSymbol $sym46$PROBLEM_LINK_P;
    private static final SubLSymbol $kw47$REMOVAL;
    private static final SubLSymbol $kw48$REWRITE;
    private static final SubLSymbol $kw49$TRANSFORMATION;
    private static final SubLSymbol $kw50$RESIDUAL_TRANSFORMATION;
    private static final SubLSymbol $kw51$RESTRICTION;
    private static final SubLSymbol $kw52$SPLIT;
    private static final SubLSymbol $kw53$JOIN_ORDERED;
    private static final SubLSymbol $kw54$JOIN;
    private static final SubLSymbol $kw55$UNION;
    private static final SubLString $str56$Unexpected_link_type__S;
    private static final SubLSymbol $sym57$SPLIT_LINK_P;
    private static final SubLSymbol $sym58$JOIN_LINK_P;
    private static final SubLSymbol $sym59$UNION_LINK_P;
    private static final SubLSymbol $sym60$PROBLEM_P;
    private static final SubLSymbol $sym61$MAPPED_PROBLEM_P;
    private static final SubLSymbol $sym62$PROOF_P;
    private static final SubLSymbol $sym63$HL_MODULE_P;
    private static final SubLString $str64$CFASL_does_not_support_objects_of;
    private static final SubLSymbol $sym65$CFASL_OUTPUT_OBJECT_PROBLEM_STORE_METHOD;
    private static final SubLSymbol $sym66$CFASL_OUTPUT_OBJECT_PROBLEM_METHOD;
    private static final SubLSymbol $sym67$CFASL_OUTPUT_OBJECT_TACTIC_METHOD;
    private static final SubLSymbol $sym68$CFASL_OUTPUT_OBJECT_PROBLEM_LINK_METHOD;
    private static final SubLSymbol $sym69$CFASL_OUTPUT_OBJECT_PROOF_METHOD;
    private static final SubLSymbol $sym70$CFASL_OUTPUT_OBJECT_STRATEGY_METHOD;
    private static final SubLSymbol $sym71$CFASL_OUTPUT_OBJECT_INFERENCE_METHOD;
    private static final SubLSymbol $sym72$CFASL_OUTPUT_OBJECT_INFERENCE_ANSWER_METHOD;
    private static final SubLSymbol $sym73$CFASL_OUTPUT_OBJECT_INFERENCE_ANSWER_JUSTIFICATION_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 1063L)
    public static SubLObject save_problem_store(final SubLObject store, final SubLObject filename, SubLObject protocol) {
        if (protocol == inference_serialization.UNPROVIDED) {
            protocol = (SubLObject)inference_serialization.$kw0$CFASL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_serialization.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        assert inference_serialization.NIL != Types.stringp(filename) : filename;
        SubLObject result = (SubLObject)inference_serialization.NIL;
        final SubLObject pcase_var = protocol;
        if (pcase_var.eql((SubLObject)inference_serialization.$kw0$CFASL)) {
            SubLObject stream = (SubLObject)inference_serialization.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)inference_serialization.NIL, thread);
                    stream = compatibility.open_binary(filename, (SubLObject)inference_serialization.$kw3$OUTPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)inference_serialization.$str4$Unable_to_open__S, filename);
                }
                final SubLObject stream_$1 = stream;
                result = cfasl_save_problem_store(store, stream_$1);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_serialization.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)inference_serialization.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw5$XML)) {
            Errors.error((SubLObject)inference_serialization.$str6$Time_to_implement_XML_problem_sto);
        }
        else {
            Errors.error((SubLObject)inference_serialization.$str7$Unexpected_protocol__S, protocol);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 1792L)
    public static SubLObject load_problem_store(final SubLObject filename, SubLObject protocol, SubLObject validateP) {
        if (protocol == inference_serialization.UNPROVIDED) {
            protocol = (SubLObject)inference_serialization.$kw0$CFASL;
        }
        if (validateP == inference_serialization.UNPROVIDED) {
            validateP = (SubLObject)inference_serialization.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_serialization.NIL != Types.stringp(filename) : filename;
        SubLObject store = (SubLObject)inference_serialization.NIL;
        final SubLObject pcase_var = protocol;
        if (pcase_var.eql((SubLObject)inference_serialization.$kw0$CFASL)) {
            SubLObject stream = (SubLObject)inference_serialization.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)inference_serialization.NIL, thread);
                    stream = compatibility.open_binary(filename, (SubLObject)inference_serialization.$kw8$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)inference_serialization.$str4$Unable_to_open__S, filename);
                }
                final SubLObject stream_$2 = stream;
                final SubLObject _prev_bind_2 = cfasl_kb_methods.$cfasl_error_on_invalid_assertion_inputP$.currentBinding(thread);
                try {
                    cfasl_kb_methods.$cfasl_error_on_invalid_assertion_inputP$.bind(validateP, thread);
                    store = cfasl_load_problem_store(stream_$2);
                }
                finally {
                    cfasl_kb_methods.$cfasl_error_on_invalid_assertion_inputP$.rebind(_prev_bind_2, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_serialization.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)inference_serialization.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw5$XML)) {
            Errors.error((SubLObject)inference_serialization.$str9$Time_to_implement_XML_problem_sto);
        }
        else {
            Errors.error((SubLObject)inference_serialization.$str7$Unexpected_protocol__S, protocol);
        }
        return store;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 2701L)
    public static SubLObject cfasl_save_problem_store(final SubLObject store, final SubLObject stream) {
        assert inference_serialization.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        assert inference_serialization.NIL != Types.streamp(stream) : stream;
        final SubLObject version = inference_serialization.$current_cfasl_save_problem_store_version$.getGlobalValue();
        cfasl.cfasl_output(version, stream);
        if (version.equal((SubLObject)inference_serialization.$str10$1_0)) {
            return cfasl_save_problem_store_1_0(store, stream);
        }
        return Errors.error((SubLObject)inference_serialization.$str12$Unsupported_serialization_version, version);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 3098L)
    public static SubLObject cfasl_load_problem_store(final SubLObject stream) {
        assert inference_serialization.NIL != Types.streamp(stream) : stream;
        final SubLObject version = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        if (version.equal((SubLObject)inference_serialization.$str10$1_0)) {
            return cfasl_load_problem_store_1_0(stream);
        }
        return Errors.error((SubLObject)inference_serialization.$str12$Unsupported_serialization_version, version);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 3390L)
    public static SubLObject with_clean_cfasl_load_ps_ids(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)inference_serialization.$sym13$CLET, (SubLObject)inference_serialization.$list14, ConsesLow.append(body, (SubLObject)inference_serialization.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 3988L)
    public static SubLObject cfasl_load_ps_prepare_for_expected_problem_count(final SubLObject count) {
        inference_serialization.$cfasl_load_ps_problem_table$.setDynamicValue(Hashtables.make_hash_table(count, Symbols.symbol_function((SubLObject)inference_serialization.EQ), (SubLObject)inference_serialization.UNPROVIDED));
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 4191L)
    public static SubLObject cfasl_load_ps_prepare_for_expected_link_count(final SubLObject count) {
        inference_serialization.$cfasl_load_ps_link_table$.setDynamicValue(Hashtables.make_hash_table(count, Symbols.symbol_function((SubLObject)inference_serialization.EQ), (SubLObject)inference_serialization.UNPROVIDED));
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 4388L)
    public static SubLObject cfasl_load_ps_prepare_for_expected_proof_count(final SubLObject count) {
        inference_serialization.$cfasl_load_ps_proof_table$.setDynamicValue(Hashtables.make_hash_table(count, Symbols.symbol_function((SubLObject)inference_serialization.EQ), (SubLObject)inference_serialization.UNPROVIDED));
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 4587L)
    public static SubLObject cfasl_load_ps_note_problem_id(final SubLObject problem, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.sethash(id, inference_serialization.$cfasl_load_ps_problem_table$.getDynamicValue(thread), problem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 4753L)
    public static SubLObject cfasl_load_ps_lookup_problem(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.gethash_without_values(id, inference_serialization.$cfasl_load_ps_problem_table$.getDynamicValue(thread), (SubLObject)inference_serialization.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 4916L)
    public static SubLObject cfasl_load_ps_note_link_id(final SubLObject link, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.sethash(id, inference_serialization.$cfasl_load_ps_link_table$.getDynamicValue(thread), link);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 5070L)
    public static SubLObject cfasl_load_ps_lookup_link(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.gethash_without_values(id, inference_serialization.$cfasl_load_ps_link_table$.getDynamicValue(thread), (SubLObject)inference_serialization.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 5227L)
    public static SubLObject cfasl_load_ps_note_proof_id(final SubLObject proof, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.sethash(id, inference_serialization.$cfasl_load_ps_proof_table$.getDynamicValue(thread), proof);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 5385L)
    public static SubLObject cfasl_load_ps_lookup_proof(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.gethash_without_values(id, inference_serialization.$cfasl_load_ps_proof_table$.getDynamicValue(thread), (SubLObject)inference_serialization.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 5544L)
    public static SubLObject with_cfasl_load_ps_constant_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject constant_table = (SubLObject)inference_serialization.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_serialization.$list26);
        constant_table = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)inference_serialization.$sym13$CLET, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)inference_serialization.$sym27$_CFASL_LOAD_PS_CONSTANT_TABLE_, constant_table), (SubLObject)inference_serialization.$list28), ConsesLow.append(body, (SubLObject)inference_serialization.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 5980L)
    public static SubLObject cfasl_load_ps_lookup_constant(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constant = Hashtables.gethash_without_values(id, inference_serialization.$cfasl_load_ps_constant_table$.getDynamicValue(thread), (SubLObject)inference_serialization.UNPROVIDED);
        if (inference_serialization.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && inference_serialization.NIL == constant_handles.constant_p(constant)) {
            Errors.error((SubLObject)inference_serialization.$str31$Unable_to_lookup_a_constant_from_, id);
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 6263L)
    public static SubLObject cfasl_save_problem_store_1_0(final SubLObject store, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_serialization.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        assert inference_serialization.NIL != Types.streamp(stream) : stream;
        final SubLObject common_symbols = compute_problem_store_common_symbols(store);
        final SubLObject common_constants = compute_problem_store_common_constants(store);
        final SubLObject constant_table = make_constant_internal_id_map(common_constants);
        SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)inference_serialization.NIL, thread);
            cfasl.cfasl_set_common_symbols((SubLObject)inference_serialization.NIL);
            cfasl.cfasl_output(common_symbols, stream);
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)inference_serialization.NIL, thread);
            cfasl.cfasl_set_common_symbols(common_symbols);
            final SubLObject _prev_bind_0_$3 = cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.currentBinding(thread);
            try {
                cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.bind((SubLObject)inference_serialization.NIL, thread);
                cfasl.cfasl_output_externalized(constant_table, stream);
            }
            finally {
                cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.rebind(_prev_bind_0_$3, thread);
            }
            final SubLObject _prev_bind_0_$4 = cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.currentBinding(thread);
            try {
                cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.bind(common_constants, thread);
                cfasl_save_problem_store_properties(store, stream);
                cfasl.cfasl_output((SubLObject)inference_serialization.$kw32$PROBLEM, stream);
                cfasl_save_problem_store_problems(store, stream);
                cfasl.cfasl_output((SubLObject)inference_serialization.$kw33$PROBLEM_LINK, stream);
                cfasl_save_problem_store_problem_links(store, stream);
                cfasl.cfasl_output((SubLObject)inference_serialization.$kw34$PROOF, stream);
                cfasl_save_problem_store_proofs(store, stream);
                cfasl.cfasl_output((SubLObject)inference_serialization.$kw35$DONE, stream);
            }
            finally {
                cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.rebind(_prev_bind_0_$4, thread);
            }
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return store;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 7342L)
    public static SubLObject cfasl_load_problem_store_1_0(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_serialization.NIL != Types.streamp(stream) : stream;
        SubLObject common_symbols = (SubLObject)inference_serialization.NIL;
        SubLObject constant_table = (SubLObject)inference_serialization.NIL;
        SubLObject problem_store_properties = (SubLObject)inference_serialization.NIL;
        SubLObject store = (SubLObject)inference_serialization.NIL;
        SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)inference_serialization.NIL, thread);
            cfasl.cfasl_set_common_symbols((SubLObject)inference_serialization.NIL);
            common_symbols = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)inference_serialization.NIL, thread);
            cfasl.cfasl_set_common_symbols(common_symbols);
            constant_table = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
            final SubLObject _prev_bind_0_$5 = inference_serialization.$cfasl_load_ps_constant_table$.currentBinding(thread);
            final SubLObject _prev_bind_2 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
            final SubLObject _prev_bind_3 = cfasl.$cfasl_input_guid_string_resource$.currentBinding(thread);
            final SubLObject _prev_bind_4 = inference_serialization.$cfasl_load_ps_problem_table$.currentBinding(thread);
            final SubLObject _prev_bind_5 = inference_serialization.$cfasl_load_ps_link_table$.currentBinding(thread);
            final SubLObject _prev_bind_6 = inference_serialization.$cfasl_load_ps_proof_table$.currentBinding(thread);
            try {
                inference_serialization.$cfasl_load_ps_constant_table$.bind(constant_table, thread);
                api_control_vars.$cfasl_constant_handle_lookup_func$.bind((SubLObject)inference_serialization.$sym29$CFASL_LOAD_PS_LOOKUP_CONSTANT, thread);
                cfasl.$cfasl_input_guid_string_resource$.bind(Guids.guid_to_string(Guids.new_guid()), thread);
                inference_serialization.$cfasl_load_ps_problem_table$.bind((SubLObject)inference_serialization.$kw15$UNINITIALIZED, thread);
                inference_serialization.$cfasl_load_ps_link_table$.bind((SubLObject)inference_serialization.$kw15$UNINITIALIZED, thread);
                inference_serialization.$cfasl_load_ps_proof_table$.bind((SubLObject)inference_serialization.$kw15$UNINITIALIZED, thread);
                problem_store_properties = cfasl_load_problem_store_properties(stream);
                store = inference_datastructures_problem_store.new_problem_store(problem_store_properties);
                for (SubLObject section = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED); inference_serialization.$kw35$DONE != section; section = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED)) {
                    final SubLObject pcase_var = section;
                    if (pcase_var.eql((SubLObject)inference_serialization.$kw32$PROBLEM)) {
                        cfasl_load_problem_store_problems(store, stream);
                    }
                    else if (pcase_var.eql((SubLObject)inference_serialization.$kw33$PROBLEM_LINK)) {
                        cfasl_load_problem_store_problem_links(store, stream);
                    }
                    else if (pcase_var.eql((SubLObject)inference_serialization.$kw34$PROOF)) {
                        cfasl_load_problem_store_proofs(store, stream);
                    }
                    else {
                        Errors.error((SubLObject)inference_serialization.$str36$Unexpected_section__S, section);
                    }
                }
            }
            finally {
                inference_serialization.$cfasl_load_ps_proof_table$.rebind(_prev_bind_6, thread);
                inference_serialization.$cfasl_load_ps_link_table$.rebind(_prev_bind_5, thread);
                inference_serialization.$cfasl_load_ps_problem_table$.rebind(_prev_bind_4, thread);
                cfasl.$cfasl_input_guid_string_resource$.rebind(_prev_bind_3, thread);
                api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_2, thread);
                inference_serialization.$cfasl_load_ps_constant_table$.rebind(_prev_bind_0_$5, thread);
            }
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return store;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 8352L)
    public static SubLObject compute_problem_store_common_symbols(final SubLObject store) {
        assert inference_serialization.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        final SubLObject common_symbols = set.new_set(Symbols.symbol_function((SubLObject)inference_serialization.EQ), (SubLObject)inference_serialization.UNPROVIDED);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_link_id_index(store);
        if (inference_serialization.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_serialization.$kw37$SKIP)) {
            final SubLObject idx_$6 = idx;
            if (inference_serialization.NIL == id_index.id_index_dense_objects_empty_p(idx_$6, (SubLObject)inference_serialization.$kw37$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$6);
                final SubLObject backwardP_var = (SubLObject)inference_serialization.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject link;
                SubLObject link_type;
                SubLObject hl_module_name;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_serialization.NIL, v_iteration = (SubLObject)inference_serialization.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_serialization.ONE_INTEGER)) {
                    id = ((inference_serialization.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_serialization.ONE_INTEGER) : v_iteration);
                    link = Vectors.aref(vector_var, id);
                    if (inference_serialization.NIL == id_index.id_index_tombstone_p(link) || inference_serialization.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_serialization.$kw37$SKIP)) {
                        if (inference_serialization.NIL != id_index.id_index_tombstone_p(link)) {
                            link = (SubLObject)inference_serialization.$kw37$SKIP;
                        }
                        link_type = inference_datastructures_problem_link.problem_link_type(link);
                        set.set_add(link_type, common_symbols);
                        if (inference_serialization.NIL != inference_worker.content_link_p(link)) {
                            hl_module_name = inference_modules.hl_module_name(inference_worker.content_link_hl_module(link));
                            if (hl_module_name.isSymbol()) {
                                set.set_add(hl_module_name, common_symbols);
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$7 = idx;
            if (inference_serialization.NIL == id_index.id_index_sparse_objects_empty_p(idx_$7)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$7);
                SubLObject id2 = (SubLObject)inference_serialization.NIL;
                SubLObject link2 = (SubLObject)inference_serialization.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        link2 = Hashtables.getEntryValue(cdohash_entry);
                        final SubLObject link_type2 = inference_datastructures_problem_link.problem_link_type(link2);
                        set.set_add(link_type2, common_symbols);
                        if (inference_serialization.NIL != inference_worker.content_link_p(link2)) {
                            final SubLObject hl_module_name2 = inference_modules.hl_module_name(inference_worker.content_link_hl_module(link2));
                            if (!hl_module_name2.isSymbol()) {
                                continue;
                            }
                            set.set_add(hl_module_name2, common_symbols);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        SubLObject cdolist_list_var = inference_datastructures_enumerated_types.all_problem_store_properties();
        SubLObject property = (SubLObject)inference_serialization.NIL;
        property = cdolist_list_var.first();
        while (inference_serialization.NIL != cdolist_list_var) {
            set.set_add(property, common_symbols);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        }
        return Sort.sort(set.set_element_list(common_symbols), Symbols.symbol_function((SubLObject)inference_serialization.$sym38$STRING_LESSP), Symbols.symbol_function((SubLObject)inference_serialization.$sym39$SYMBOL_NAME));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 9226L)
    public static SubLObject possibly_note_problem_store_common_constant(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_serialization.NIL != constant_handles.constant_p(v_object)) {
            set.set_add(v_object, inference_serialization.$problem_store_common_constants$.getDynamicValue(thread));
            return (SubLObject)inference_serialization.T;
        }
        return (SubLObject)inference_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 9401L)
    public static SubLObject compute_problem_store_common_constants(final SubLObject store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_serialization.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        final SubLObject common_constants = set.new_set(Symbols.symbol_function((SubLObject)inference_serialization.EQ), (SubLObject)inference_serialization.$int41$100);
        final SubLObject _prev_bind_0 = inference_serialization.$problem_store_common_constants$.currentBinding(thread);
        try {
            inference_serialization.$problem_store_common_constants$.bind(common_constants, thread);
            final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
            if (inference_serialization.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_serialization.$kw37$SKIP)) {
                final SubLObject idx_$8 = idx;
                if (inference_serialization.NIL == id_index.id_index_dense_objects_empty_p(idx_$8, (SubLObject)inference_serialization.$kw37$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$8);
                    final SubLObject backwardP_var = (SubLObject)inference_serialization.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject problem;
                    SubLObject query;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_serialization.NIL, v_iteration = (SubLObject)inference_serialization.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_serialization.ONE_INTEGER)) {
                        id = ((inference_serialization.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_serialization.ONE_INTEGER) : v_iteration);
                        problem = Vectors.aref(vector_var, id);
                        if (inference_serialization.NIL == id_index.id_index_tombstone_p(problem) || inference_serialization.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_serialization.$kw37$SKIP)) {
                            if (inference_serialization.NIL != id_index.id_index_tombstone_p(problem)) {
                                problem = (SubLObject)inference_serialization.$kw37$SKIP;
                            }
                            query = inference_datastructures_problem.problem_query(problem);
                            list_utilities.tree_map((SubLObject)inference_serialization.$sym40$POSSIBLY_NOTE_PROBLEM_STORE_COMMON_CONSTANT, query, (SubLObject)inference_serialization.UNPROVIDED);
                        }
                    }
                }
                final SubLObject idx_$9 = idx;
                if (inference_serialization.NIL == id_index.id_index_sparse_objects_empty_p(idx_$9)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$9);
                    SubLObject id2 = (SubLObject)inference_serialization.NIL;
                    SubLObject problem2 = (SubLObject)inference_serialization.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            problem2 = Hashtables.getEntryValue(cdohash_entry);
                            final SubLObject query2 = inference_datastructures_problem.problem_query(problem2);
                            list_utilities.tree_map((SubLObject)inference_serialization.$sym40$POSSIBLY_NOTE_PROBLEM_STORE_COMMON_CONSTANT, query2, (SubLObject)inference_serialization.UNPROVIDED);
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        }
        finally {
            inference_serialization.$problem_store_common_constants$.rebind(_prev_bind_0, thread);
        }
        return common_constants;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 9843L)
    public static SubLObject make_constant_internal_id_map(final SubLObject constants) {
        return make_hash_table_from_set(constants, Symbols.symbol_function((SubLObject)inference_serialization.IDENTITY), Symbols.symbol_function((SubLObject)inference_serialization.$sym42$CONSTANT_INTERNAL_ID), Symbols.symbol_function((SubLObject)inference_serialization.EQL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 9988L)
    public static SubLObject make_hash_table_from_set(final SubLObject v_set, SubLObject value_method, SubLObject key_method, SubLObject test) {
        if (value_method == inference_serialization.UNPROVIDED) {
            value_method = Symbols.symbol_function((SubLObject)inference_serialization.IDENTITY);
        }
        if (key_method == inference_serialization.UNPROVIDED) {
            key_method = Symbols.symbol_function((SubLObject)inference_serialization.IDENTITY);
        }
        if (test == inference_serialization.UNPROVIDED) {
            test = set.set_test(v_set);
        }
        assert inference_serialization.NIL != set.set_p(v_set) : v_set;
        assert inference_serialization.NIL != Types.function_spec_p(value_method) : value_method;
        assert inference_serialization.NIL != Types.function_spec_p(key_method) : key_method;
        assert inference_serialization.NIL != Types.function_spec_p(test) : test;
        final SubLObject table = Hashtables.make_hash_table(set.set_size(v_set), test, (SubLObject)inference_serialization.UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        SubLObject key;
        SubLObject value;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)inference_serialization.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); inference_serialization.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (inference_serialization.NIL != set_contents.do_set_contents_element_validP(state, element)) {
                key = Functions.funcall(key_method, element);
                value = Functions.funcall(value_method, element);
                Hashtables.sethash(key, table, value);
            }
        }
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 10853L)
    public static SubLObject cfasl_save_problem_store_properties(final SubLObject store, final SubLObject stream) {
        assert inference_serialization.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        final SubLObject v_properties = inference_datastructures_problem_store.problem_store_properties(store);
        cfasl.cfasl_output(v_properties, stream);
        return v_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 11089L)
    public static SubLObject cfasl_load_problem_store_properties(final SubLObject stream) {
        final SubLObject v_properties = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        assert inference_serialization.NIL != inference_datastructures_enumerated_types.problem_store_properties_p(v_properties) : v_properties;
        return v_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 11339L)
    public static SubLObject cfasl_save_problem_store_problems(final SubLObject store, final SubLObject stream) {
        assert inference_serialization.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        final SubLObject total = inference_datastructures_problem_store.problem_store_problem_count(store);
        cfasl.cfasl_output(total, stream);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (inference_serialization.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_serialization.$kw37$SKIP)) {
            final SubLObject idx_$10 = idx;
            if (inference_serialization.NIL == id_index.id_index_dense_objects_empty_p(idx_$10, (SubLObject)inference_serialization.$kw37$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$10);
                final SubLObject backwardP_var = (SubLObject)inference_serialization.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_serialization.NIL, v_iteration = (SubLObject)inference_serialization.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_serialization.ONE_INTEGER)) {
                    id = ((inference_serialization.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_serialization.ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (inference_serialization.NIL == id_index.id_index_tombstone_p(problem) || inference_serialization.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_serialization.$kw37$SKIP)) {
                        if (inference_serialization.NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = (SubLObject)inference_serialization.$kw37$SKIP;
                        }
                        cfasl_save_problem_store_problem(problem, stream);
                    }
                }
            }
            final SubLObject idx_$11 = idx;
            if (inference_serialization.NIL == id_index.id_index_sparse_objects_empty_p(idx_$11) || inference_serialization.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_serialization.$kw37$SKIP)) {
                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$11);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$11);
                final SubLObject end_id = id_index.id_index_next_id(idx_$11);
                final SubLObject v_default = (SubLObject)((inference_serialization.NIL != id_index.id_index_skip_tombstones_p((SubLObject)inference_serialization.$kw37$SKIP)) ? inference_serialization.NIL : inference_serialization.$kw37$SKIP);
                while (id2.numL(end_id)) {
                    final SubLObject problem2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if (inference_serialization.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_serialization.$kw37$SKIP) || inference_serialization.NIL == id_index.id_index_tombstone_p(problem2)) {
                        cfasl_save_problem_store_problem(problem2, stream);
                    }
                    id2 = Numbers.add(id2, (SubLObject)inference_serialization.ONE_INTEGER);
                }
            }
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 11704L)
    public static SubLObject cfasl_load_problem_store_problems(final SubLObject store, final SubLObject stream) {
        assert inference_serialization.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        final SubLObject total = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        cfasl_load_ps_prepare_for_expected_problem_count(total);
        inference_datastructures_problem_store.problem_store_prepare_for_expected_problem_count(store, total);
        SubLObject i;
        for (i = (SubLObject)inference_serialization.NIL, i = (SubLObject)inference_serialization.ZERO_INTEGER; i.numL(total); i = Numbers.add(i, (SubLObject)inference_serialization.ONE_INTEGER)) {
            cfasl_load_problem_store_problem(store, stream);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 12071L)
    public static SubLObject cfasl_save_problem_store_problem(final SubLObject problem, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject suid = inference_datastructures_problem.problem_suid(problem);
        final SubLObject query = inference_datastructures_problem.problem_query(problem);
        final SubLObject free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(problem);
        cfasl.cfasl_output(suid, stream);
        cfasl.cfasl_output_externalized(query, stream);
        if (inference_serialization.NIL != inference_serialization.$inference_serialization_supports_problem_free_hl_var_optimizationP$.getDynamicValue(thread)) {
            cfasl.cfasl_output_externalized(free_hl_vars, stream);
        }
        return suid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 12490L)
    public static SubLObject cfasl_load_problem_store_problem(final SubLObject store, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject suid = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        final SubLObject query = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        SubLObject free_hl_vars = (SubLObject)inference_serialization.NIL;
        if (inference_serialization.NIL != inference_serialization.$inference_serialization_supports_problem_free_hl_var_optimizationP$.getDynamicValue(thread)) {
            final SubLObject possible_free_hl_vars_opcode = cfasl.cfasl_opcode_peek(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
            if (possible_free_hl_vars_opcode.eql((SubLObject)inference_serialization.TWELVE_INTEGER) || possible_free_hl_vars_opcode.eql((SubLObject)inference_serialization.THIRTEEN_INTEGER)) {
                free_hl_vars = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
            }
        }
        final SubLObject problem = inference_datastructures_problem.new_problem(store, query, free_hl_vars);
        cfasl_load_ps_note_problem_id(problem, suid);
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 13138L)
    public static SubLObject cfasl_save_problem_store_proofs(final SubLObject store, final SubLObject stream) {
        assert inference_serialization.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        final SubLObject total = inference_datastructures_problem_store.problem_store_proof_count(store);
        cfasl.cfasl_output(total, stream);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_proof_id_index(store);
        if (inference_serialization.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_serialization.$kw37$SKIP)) {
            final SubLObject idx_$12 = idx;
            if (inference_serialization.NIL == id_index.id_index_dense_objects_empty_p(idx_$12, (SubLObject)inference_serialization.$kw37$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$12);
                final SubLObject backwardP_var = (SubLObject)inference_serialization.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject proof;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_serialization.NIL, v_iteration = (SubLObject)inference_serialization.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_serialization.ONE_INTEGER)) {
                    id = ((inference_serialization.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_serialization.ONE_INTEGER) : v_iteration);
                    proof = Vectors.aref(vector_var, id);
                    if (inference_serialization.NIL == id_index.id_index_tombstone_p(proof) || inference_serialization.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_serialization.$kw37$SKIP)) {
                        if (inference_serialization.NIL != id_index.id_index_tombstone_p(proof)) {
                            proof = (SubLObject)inference_serialization.$kw37$SKIP;
                        }
                        cfasl_save_problem_store_proof(proof, stream);
                    }
                }
            }
            final SubLObject idx_$13 = idx;
            if (inference_serialization.NIL == id_index.id_index_sparse_objects_empty_p(idx_$13) || inference_serialization.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_serialization.$kw37$SKIP)) {
                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$13);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$13);
                final SubLObject end_id = id_index.id_index_next_id(idx_$13);
                final SubLObject v_default = (SubLObject)((inference_serialization.NIL != id_index.id_index_skip_tombstones_p((SubLObject)inference_serialization.$kw37$SKIP)) ? inference_serialization.NIL : inference_serialization.$kw37$SKIP);
                while (id2.numL(end_id)) {
                    final SubLObject proof2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if (inference_serialization.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_serialization.$kw37$SKIP) || inference_serialization.NIL == id_index.id_index_tombstone_p(proof2)) {
                        cfasl_save_problem_store_proof(proof2, stream);
                    }
                    id2 = Numbers.add(id2, (SubLObject)inference_serialization.ONE_INTEGER);
                }
            }
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 13487L)
    public static SubLObject cfasl_load_problem_store_proofs(final SubLObject store, final SubLObject stream) {
        assert inference_serialization.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        final SubLObject total = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        cfasl_load_ps_prepare_for_expected_proof_count(total);
        inference_datastructures_problem_store.problem_store_prepare_for_expected_proof_count(store, total);
        SubLObject i;
        for (i = (SubLObject)inference_serialization.NIL, i = (SubLObject)inference_serialization.ZERO_INTEGER; i.numL(total); i = Numbers.add(i, (SubLObject)inference_serialization.ONE_INTEGER)) {
            cfasl_load_problem_store_proof(store, stream);
        }
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (inference_serialization.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_serialization.$kw37$SKIP)) {
            final SubLObject idx_$14 = idx;
            if (inference_serialization.NIL == id_index.id_index_dense_objects_empty_p(idx_$14, (SubLObject)inference_serialization.$kw37$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$14);
                final SubLObject backwardP_var = (SubLObject)inference_serialization.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_serialization.NIL, v_iteration = (SubLObject)inference_serialization.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_serialization.ONE_INTEGER)) {
                    id = ((inference_serialization.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_serialization.ONE_INTEGER) : v_iteration);
                    problem = Vectors.aref(vector_var, id);
                    if (inference_serialization.NIL == id_index.id_index_tombstone_p(problem) || inference_serialization.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_serialization.$kw37$SKIP)) {
                        if (inference_serialization.NIL != id_index.id_index_tombstone_p(problem)) {
                            problem = (SubLObject)inference_serialization.$kw37$SKIP;
                        }
                        inference_worker.consider_that_problem_could_be_good(problem);
                    }
                }
            }
            final SubLObject idx_$15 = idx;
            if (inference_serialization.NIL == id_index.id_index_sparse_objects_empty_p(idx_$15)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$15);
                SubLObject id2 = (SubLObject)inference_serialization.NIL;
                SubLObject problem2 = (SubLObject)inference_serialization.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        problem2 = Hashtables.getEntryValue(cdohash_entry);
                        inference_worker.consider_that_problem_could_be_good(problem2);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 13946L)
    public static SubLObject cfasl_save_problem_store_proof(final SubLObject proof, final SubLObject stream) {
        cfasl.cfasl_output(inference_datastructures_proof.proof_suid(proof), stream);
        cfasl.cfasl_output_externalized(inference_datastructures_proof.proof_bindings(proof), stream);
        cfasl_save_problem_link_reference(inference_datastructures_proof.proof_link(proof), stream);
        final SubLObject subproofs = inference_datastructures_proof.proof_direct_subproofs(proof);
        cfasl.cfasl_output(Sequences.length(subproofs), stream);
        SubLObject cdolist_list_var = subproofs;
        SubLObject subproof = (SubLObject)inference_serialization.NIL;
        subproof = cdolist_list_var.first();
        while (inference_serialization.NIL != cdolist_list_var) {
            cfasl_save_proof_reference(subproof, stream);
            cdolist_list_var = cdolist_list_var.rest();
            subproof = cdolist_list_var.first();
        }
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 14413L)
    public static SubLObject cfasl_load_problem_store_proof(final SubLObject store, final SubLObject stream) {
        final SubLObject suid = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        final SubLObject v_bindings = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        final SubLObject link = cfasl_load_problem_link_reference(store, stream);
        final SubLObject subproofs = cfasl_load_proof_subproofs(store, stream);
        final SubLObject proof = inference_datastructures_proof.new_proof_with_bindings(link, v_bindings, subproofs);
        cfasl_load_ps_note_proof_id(proof, suid);
        return proof;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 14806L)
    public static SubLObject cfasl_load_proof_subproofs(final SubLObject store, final SubLObject stream) {
        SubLObject subproofs = (SubLObject)inference_serialization.NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject subproof;
        for (cdotimes_end_var = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED), i = (SubLObject)inference_serialization.NIL, i = (SubLObject)inference_serialization.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)inference_serialization.ONE_INTEGER)) {
            subproof = cfasl_load_proof_reference(store, stream);
            subproofs = (SubLObject)ConsesLow.cons(subproof, subproofs);
        }
        return Sequences.nreverse(subproofs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 15059L)
    public static SubLObject cfasl_save_problem_store_problem_links(final SubLObject store, final SubLObject stream) {
        assert inference_serialization.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        final SubLObject total = Numbers.subtract(inference_datastructures_problem_store.problem_store_link_count(store), inference_datastructures_problem_store.problem_store_answer_link_count(store));
        cfasl.cfasl_output(total, stream);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_link_id_index(store);
        if (inference_serialization.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)inference_serialization.$kw37$SKIP)) {
            final SubLObject idx_$16 = idx;
            if (inference_serialization.NIL == id_index.id_index_dense_objects_empty_p(idx_$16, (SubLObject)inference_serialization.$kw37$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$16);
                final SubLObject backwardP_var = (SubLObject)inference_serialization.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject link;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)inference_serialization.NIL, v_iteration = (SubLObject)inference_serialization.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)inference_serialization.ONE_INTEGER)) {
                    id = ((inference_serialization.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)inference_serialization.ONE_INTEGER) : v_iteration);
                    link = Vectors.aref(vector_var, id);
                    if (inference_serialization.NIL == id_index.id_index_tombstone_p(link) || inference_serialization.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_serialization.$kw37$SKIP)) {
                        if (inference_serialization.NIL != id_index.id_index_tombstone_p(link)) {
                            link = (SubLObject)inference_serialization.$kw37$SKIP;
                        }
                        if (inference_serialization.NIL == inference_worker_answer.answer_link_p(link)) {
                            cfasl_save_problem_store_problem_link(link, stream);
                        }
                    }
                }
            }
            final SubLObject idx_$17 = idx;
            if (inference_serialization.NIL == id_index.id_index_sparse_objects_empty_p(idx_$17) || inference_serialization.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_serialization.$kw37$SKIP)) {
                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$17);
                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$17);
                final SubLObject end_id = id_index.id_index_next_id(idx_$17);
                final SubLObject v_default = (SubLObject)((inference_serialization.NIL != id_index.id_index_skip_tombstones_p((SubLObject)inference_serialization.$kw37$SKIP)) ? inference_serialization.NIL : inference_serialization.$kw37$SKIP);
                while (id2.numL(end_id)) {
                    final SubLObject link2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                    if ((inference_serialization.NIL == id_index.id_index_skip_tombstones_p((SubLObject)inference_serialization.$kw37$SKIP) || inference_serialization.NIL == id_index.id_index_tombstone_p(link2)) && inference_serialization.NIL == inference_worker_answer.answer_link_p(link2)) {
                        cfasl_save_problem_store_problem_link(link2, stream);
                    }
                    id2 = Numbers.add(id2, (SubLObject)inference_serialization.ONE_INTEGER);
                }
            }
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 15528L)
    public static SubLObject cfasl_load_problem_store_problem_links(final SubLObject store, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_serialization.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        final SubLObject total = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        cfasl_load_ps_prepare_for_expected_link_count(total);
        inference_datastructures_problem_store.problem_store_prepare_for_expected_link_count(store, total);
        final SubLObject _prev_bind_0 = inference_worker.$disable_link_propagationP$.currentBinding(thread);
        try {
            inference_worker.$disable_link_propagationP$.bind((SubLObject)inference_serialization.T, thread);
            SubLObject i;
            for (i = (SubLObject)inference_serialization.NIL, i = (SubLObject)inference_serialization.ZERO_INTEGER; i.numL(total); i = Numbers.add(i, (SubLObject)inference_serialization.ONE_INTEGER)) {
                cfasl_load_problem_store_problem_link(store, stream);
            }
        }
        finally {
            inference_worker.$disable_link_propagationP$.rebind(_prev_bind_0, thread);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 16008L)
    public static SubLObject cfasl_save_problem_store_problem_link(final SubLObject link, final SubLObject stream) {
        assert inference_serialization.NIL != inference_datastructures_problem_link.problem_link_p(link) : link;
        final SubLObject suid = inference_datastructures_problem_link.problem_link_suid(link);
        final SubLObject type = inference_datastructures_problem_link.problem_link_type(link);
        cfasl.cfasl_output(suid, stream);
        cfasl.cfasl_output(type, stream);
        final SubLObject pcase_var = type;
        if (pcase_var.eql((SubLObject)inference_serialization.$kw47$REMOVAL)) {
            cfasl_save_removal_link(link, stream);
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw48$REWRITE)) {
            cfasl_save_rewrite_link(link, stream);
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw49$TRANSFORMATION)) {
            cfasl_save_transformation_link(link, stream);
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw50$RESIDUAL_TRANSFORMATION)) {
            cfasl_save_residual_transformation_link(link, stream);
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw51$RESTRICTION)) {
            cfasl_save_restriction_link(link, stream);
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw52$SPLIT)) {
            cfasl_save_split_link(link, stream);
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw53$JOIN_ORDERED)) {
            cfasl_save_join_ordered_link(link, stream);
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw54$JOIN)) {
            cfasl_save_join_link(link, stream);
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw55$UNION)) {
            cfasl_save_union_link(link, stream);
        }
        else {
            Errors.error((SubLObject)inference_serialization.$str56$Unexpected_link_type__S, type);
        }
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 17141L)
    public static SubLObject cfasl_load_problem_store_problem_link(final SubLObject store, final SubLObject stream) {
        assert inference_serialization.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        final SubLObject suid = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        final SubLObject type = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        SubLObject link = (SubLObject)inference_serialization.NIL;
        final SubLObject pcase_var = type;
        if (pcase_var.eql((SubLObject)inference_serialization.$kw47$REMOVAL)) {
            link = cfasl_load_removal_link(store, stream);
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw48$REWRITE)) {
            link = cfasl_load_rewrite_link(store, stream);
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw49$TRANSFORMATION)) {
            link = cfasl_load_transformation_link(store, stream);
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw50$RESIDUAL_TRANSFORMATION)) {
            link = cfasl_load_residual_transformation_link(store, stream);
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw51$RESTRICTION)) {
            link = cfasl_load_restriction_link(store, stream);
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw52$SPLIT)) {
            link = cfasl_load_split_link(store, stream);
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw53$JOIN_ORDERED)) {
            link = cfasl_load_join_ordered_link(store, stream);
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw54$JOIN)) {
            link = cfasl_load_join_link(store, stream);
        }
        else if (pcase_var.eql((SubLObject)inference_serialization.$kw55$UNION)) {
            link = cfasl_load_union_link(store, stream);
        }
        else {
            Errors.error((SubLObject)inference_serialization.$str56$Unexpected_link_type__S, type);
        }
        cfasl_load_ps_note_link_id(link, suid);
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 18401L)
    public static SubLObject cfasl_save_removal_link(final SubLObject removal_link, final SubLObject stream) {
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(removal_link), stream);
        cfasl_save_hl_module_reference(inference_worker_removal.removal_link_hl_module(removal_link), stream);
        cfasl.cfasl_output_externalized(inference_worker_removal.removal_link_bindings(removal_link), stream);
        cfasl.cfasl_output_externalized(inference_worker_removal.removal_link_supports(removal_link), stream);
        return removal_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 18855L)
    public static SubLObject cfasl_load_removal_link(final SubLObject store, final SubLObject stream) {
        final SubLObject problem = cfasl_load_problem_reference(store, stream);
        final SubLObject hl_module = cfasl_load_hl_module_reference(stream);
        final SubLObject removal_bindings = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        final SubLObject supports = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        final SubLObject removal_link = inference_worker_removal.new_removal_link(problem, hl_module, removal_bindings, supports);
        return removal_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 19249L)
    public static SubLObject cfasl_save_rewrite_link(final SubLObject rewrite_link, final SubLObject stream) {
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link), stream);
        cfasl_save_mapped_problem_reference(inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(rewrite_link), stream);
        cfasl_save_hl_module_reference(inference_worker_rewrite.rewrite_link_hl_module(rewrite_link), stream);
        cfasl.cfasl_output_externalized(inference_worker_rewrite.rewrite_link_supports(rewrite_link), stream);
        return rewrite_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 19779L)
    public static SubLObject cfasl_load_rewrite_link(final SubLObject store, final SubLObject stream) {
        final SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        final SubLObject supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        final SubLObject hl_module = cfasl_load_hl_module_reference(stream);
        final SubLObject supports = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        final SubLObject rewrite_link = inference_worker_rewrite.new_rewrite_link(supported_problem, supporting_mapped_problem, hl_module, supports);
        return rewrite_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 20280L)
    public static SubLObject cfasl_save_transformation_link(final SubLObject t_link, final SubLObject stream) {
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(t_link), stream);
        cfasl_save_optional_mapped_problem_reference(inference_worker_transformation.transformation_link_supporting_mapped_problem(t_link), stream);
        cfasl_save_hl_module_reference(inference_worker_transformation.transformation_link_hl_module(t_link), stream);
        cfasl.cfasl_output_externalized(inference_worker_transformation.transformation_link_bindings(t_link), stream);
        cfasl.cfasl_output_externalized(inference_worker_transformation.transformation_link_rule_assertion(t_link), stream);
        cfasl.cfasl_output_externalized(inference_worker_transformation.transformation_link_more_supports(t_link), stream);
        cfasl.cfasl_output_externalized(inference_worker_transformation.transformation_link_non_explanatory_subquery(t_link), stream);
        return t_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 21161L)
    public static SubLObject cfasl_load_transformation_link(final SubLObject store, final SubLObject stream) {
        final SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        final SubLObject supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        final SubLObject hl_module = cfasl_load_hl_module_reference(stream);
        final SubLObject transformation_bindings = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        final SubLObject rule_assertion = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        final SubLObject more_supports = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        final SubLObject non_explanatory_subquery = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        final SubLObject transformation_link = inference_worker_transformation.new_transformation_link(supported_problem, supporting_mapped_problem, hl_module, transformation_bindings, rule_assertion, more_supports, non_explanatory_subquery);
        return transformation_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 21898L)
    public static SubLObject cfasl_save_residual_transformation_link(final SubLObject rt_link, final SubLObject stream) {
        cfasl_save_problem_link_reference(inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link), stream);
        cfasl_save_problem_link_reference(inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link), stream);
        cfasl_save_mapped_problem_reference(inference_worker_residual_transformation.residual_transformation_link_supporting_mapped_problem(rt_link), stream);
        cfasl.cfasl_output(inference_worker_residual_transformation.residual_transformation_link_conjunctive_problem_dont_care_variable_map(rt_link), stream);
        cfasl.cfasl_output(inference_worker_residual_transformation.residual_transformation_link_residual_conjunction_literal_map(rt_link), stream);
        return rt_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 22631L)
    public static SubLObject cfasl_load_residual_transformation_link(final SubLObject store, final SubLObject stream) {
        final SubLObject join_ordered_link = cfasl_load_problem_link_reference(store, stream);
        final SubLObject transformation_link = cfasl_load_problem_link_reference(store, stream);
        final SubLObject supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        final SubLObject conjunctive_problem_dont_care_variable_map = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        final SubLObject residual_conjunction_literal_map = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        final SubLObject residual_transformation_link = inference_worker_residual_transformation.new_residual_transformation_link(supporting_mapped_problem, join_ordered_link, transformation_link, conjunctive_problem_dont_care_variable_map, residual_conjunction_literal_map);
        return residual_transformation_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 23354L)
    public static SubLObject cfasl_save_restriction_link(final SubLObject restriction_link, final SubLObject stream) {
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(restriction_link), stream);
        cfasl_save_mapped_problem_reference(inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(restriction_link), stream);
        cfasl.cfasl_output_externalized(inference_worker_restriction.restriction_link_bindings(restriction_link), stream);
        cfasl.cfasl_output(inference_worker_restriction.restriction_listening_link_p(restriction_link), stream);
        cfasl_save_optional_hl_module_reference(inference_worker_restriction.restriction_link_hl_module(restriction_link), stream);
        return restriction_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 24042L)
    public static SubLObject cfasl_load_restriction_link(final SubLObject store, final SubLObject stream) {
        final SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        final SubLObject supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        final SubLObject restriction_bindings = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        final SubLObject listening_linkP = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        final SubLObject hl_module = cfasl_load_optional_hl_module_reference(stream);
        final SubLObject restriction_link = inference_worker_restriction.new_restriction_link(supported_problem, supporting_mapped_problem, restriction_bindings, listening_linkP, hl_module);
        return restriction_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 24629L)
    public static SubLObject cfasl_save_split_link(final SubLObject split_link, final SubLObject stream) {
        assert inference_serialization.NIL != inference_worker_split.split_link_p(split_link) : split_link;
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(split_link), stream);
        final SubLObject mapped_problems = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
        cfasl.cfasl_output(Sequences.length(mapped_problems), stream);
        SubLObject cdolist_list_var = Sequences.reverse(mapped_problems);
        SubLObject mapped_problem = (SubLObject)inference_serialization.NIL;
        mapped_problem = cdolist_list_var.first();
        while (inference_serialization.NIL != cdolist_list_var) {
            cfasl_save_mapped_problem_reference(mapped_problem, stream);
            cdolist_list_var = cdolist_list_var.rest();
            mapped_problem = cdolist_list_var.first();
        }
        return split_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 25172L)
    public static SubLObject cfasl_load_split_link(final SubLObject store, final SubLObject stream) {
        final SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        final SubLObject supporting_mapped_problems = cfasl_load_split_link_conjuncts(store, stream);
        final SubLObject split_link = inference_worker_split.new_split_link(supported_problem, supporting_mapped_problems);
        return split_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 25501L)
    public static SubLObject cfasl_load_split_link_conjuncts(final SubLObject store, final SubLObject stream) {
        final SubLObject supporting_problem_count = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        SubLObject supporting_mapped_problems = (SubLObject)inference_serialization.NIL;
        SubLObject i;
        SubLObject supporting_mapped_problem;
        for (i = (SubLObject)inference_serialization.NIL, i = (SubLObject)inference_serialization.ZERO_INTEGER; i.numL(supporting_problem_count); i = Numbers.add(i, (SubLObject)inference_serialization.ONE_INTEGER)) {
            supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
            supporting_mapped_problems = (SubLObject)ConsesLow.cons(supporting_mapped_problem, supporting_mapped_problems);
        }
        return Sequences.nreverse(supporting_mapped_problems);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 25907L)
    public static SubLObject cfasl_save_join_ordered_link(final SubLObject jo_link, final SubLObject stream) {
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(jo_link), stream);
        cfasl_save_mapped_problem_reference(inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link), stream);
        if (inference_serialization.NIL != inference_worker_join_ordered.join_ordered_link_has_non_focal_mapped_problemP(jo_link)) {
            cfasl_save_mapped_problem_reference(inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(jo_link), stream);
        }
        else {
            cfasl.cfasl_output((SubLObject)inference_serialization.NIL, stream);
        }
        return jo_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 26405L)
    public static SubLObject cfasl_load_join_ordered_link(final SubLObject store, final SubLObject stream) {
        final SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        final SubLObject focal_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        final SubLObject non_focal_mapped_problem = cfasl_load_optional_mapped_problem_reference(store, stream);
        final SubLObject join_ordered_link = inference_worker_join_ordered.new_join_ordered_link(supported_problem, focal_mapped_problem, non_focal_mapped_problem);
        return join_ordered_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 26896L)
    public static SubLObject cfasl_save_join_link(final SubLObject join_link, final SubLObject stream) {
        assert inference_serialization.NIL != inference_worker_join.join_link_p(join_link) : join_link;
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(join_link), stream);
        cfasl_save_mapped_problem_reference(inference_worker_join.join_link_first_mapped_problem(join_link), stream);
        cfasl_save_mapped_problem_reference(inference_worker_join.join_link_second_mapped_problem(join_link), stream);
        return join_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 27296L)
    public static SubLObject cfasl_load_join_link(final SubLObject store, final SubLObject stream) {
        final SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        final SubLObject first_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        final SubLObject second_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        final SubLObject join_link = inference_worker_join.new_join_link(supported_problem, first_mapped_problem, second_mapped_problem);
        return join_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 27716L)
    public static SubLObject cfasl_save_union_link(final SubLObject union_link, final SubLObject stream) {
        assert inference_serialization.NIL != inference_worker_union.union_link_p(union_link) : union_link;
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(union_link), stream);
        cfasl_save_mapped_problem_reference(inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(union_link), stream);
        return union_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 28057L)
    public static SubLObject cfasl_load_union_link(final SubLObject store, final SubLObject stream) {
        final SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        final SubLObject supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        final SubLObject union_link = inference_worker_union.new_union_link(supported_problem, supporting_mapped_problem);
        return union_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 28391L)
    public static SubLObject cfasl_save_problem_reference(final SubLObject problem, final SubLObject stream) {
        assert inference_serialization.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return cfasl.cfasl_output(inference_datastructures_problem.problem_suid(problem), stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 28553L)
    public static SubLObject cfasl_load_problem_reference(final SubLObject store, final SubLObject stream) {
        return cfasl_load_ps_lookup_problem(cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 28692L)
    public static SubLObject cfasl_save_mapped_problem_reference(final SubLObject mapped_problem, final SubLObject stream) {
        return cfasl_save_mapped_problem_reference_int(mapped_problem, stream, (SubLObject)inference_serialization.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 28845L)
    public static SubLObject cfasl_load_mapped_problem_reference(final SubLObject store, final SubLObject stream) {
        return cfasl_load_mapped_problem_reference_int(store, stream, (SubLObject)inference_serialization.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 28979L)
    public static SubLObject cfasl_save_optional_mapped_problem_reference(final SubLObject mapped_problem, final SubLObject stream) {
        return cfasl_save_mapped_problem_reference_int(mapped_problem, stream, (SubLObject)inference_serialization.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 29142L)
    public static SubLObject cfasl_load_optional_mapped_problem_reference(final SubLObject store, final SubLObject stream) {
        return cfasl_load_mapped_problem_reference_int(store, stream, (SubLObject)inference_serialization.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 29287L)
    public static SubLObject cfasl_save_mapped_problem_reference_int(final SubLObject mapped_problem, final SubLObject stream, final SubLObject requiredP) {
        if (inference_serialization.NIL == mapped_problem && inference_serialization.NIL == requiredP) {
            return cfasl.cfasl_output((SubLObject)inference_serialization.NIL, stream);
        }
        assert inference_serialization.NIL != inference_datastructures_problem_link.mapped_problem_p(mapped_problem) : mapped_problem;
        final SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
        final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
        final SubLObject suid = inference_datastructures_problem.problem_suid(problem);
        cfasl.cfasl_output(suid, stream);
        cfasl.cfasl_output_externalized(variable_map, stream);
        return suid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 29805L)
    public static SubLObject cfasl_load_mapped_problem_reference_int(final SubLObject store, final SubLObject stream, final SubLObject requiredP) {
        final SubLObject suid = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        if (inference_serialization.NIL != suid || inference_serialization.NIL != requiredP) {
            final SubLObject variable_map = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
            final SubLObject problem = cfasl_load_ps_lookup_problem(suid);
            final SubLObject mapped_problem = inference_datastructures_problem_link.new_mapped_problem(problem, variable_map);
            return mapped_problem;
        }
        return (SubLObject)inference_serialization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 30193L)
    public static SubLObject cfasl_save_problem_link_reference(final SubLObject link, final SubLObject stream) {
        assert inference_serialization.NIL != inference_datastructures_problem_link.problem_link_p(link) : link;
        return cfasl.cfasl_output(inference_datastructures_problem_link.problem_link_suid(link), stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 30350L)
    public static SubLObject cfasl_load_problem_link_reference(final SubLObject store, final SubLObject stream) {
        return cfasl_load_ps_lookup_link(cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 30491L)
    public static SubLObject cfasl_save_proof_reference(final SubLObject proof, final SubLObject stream) {
        assert inference_serialization.NIL != inference_datastructures_proof.proof_p(proof) : proof;
        return cfasl.cfasl_output(inference_datastructures_proof.proof_suid(proof), stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 30630L)
    public static SubLObject cfasl_load_proof_reference(final SubLObject store, final SubLObject stream) {
        return cfasl_load_ps_lookup_proof(cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 30765L)
    public static SubLObject cfasl_save_hl_module_reference(final SubLObject hl_module, final SubLObject stream) {
        return cfasl_save_hl_module_reference_int(hl_module, stream, (SubLObject)inference_serialization.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 30898L)
    public static SubLObject cfasl_load_hl_module_reference(final SubLObject stream) {
        return cfasl_load_hl_module_reference_int(stream, (SubLObject)inference_serialization.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 31010L)
    public static SubLObject cfasl_save_optional_hl_module_reference(final SubLObject hl_module, final SubLObject stream) {
        return cfasl_save_hl_module_reference_int(hl_module, stream, (SubLObject)inference_serialization.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 31153L)
    public static SubLObject cfasl_load_optional_hl_module_reference(final SubLObject stream) {
        return cfasl_load_hl_module_reference_int(stream, (SubLObject)inference_serialization.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 31276L)
    public static SubLObject cfasl_save_hl_module_reference_int(final SubLObject hl_module, final SubLObject stream, final SubLObject requiredP) {
        if (inference_serialization.NIL == hl_module && inference_serialization.NIL == requiredP) {
            return cfasl.cfasl_output((SubLObject)inference_serialization.NIL, stream);
        }
        assert inference_serialization.NIL != inference_modules.hl_module_p(hl_module) : hl_module;
        final SubLObject name = inference_modules.hl_module_name(hl_module);
        cfasl.cfasl_output(name, stream);
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 31573L)
    public static SubLObject cfasl_load_hl_module_reference_int(final SubLObject stream, final SubLObject requiredP) {
        final SubLObject name = cfasl.cfasl_input(stream, (SubLObject)inference_serialization.UNPROVIDED, (SubLObject)inference_serialization.UNPROVIDED);
        if (inference_serialization.NIL == name && inference_serialization.NIL == requiredP) {
            return (SubLObject)inference_serialization.NIL;
        }
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (inference_serialization.NIL != hl_module) {
            return hl_module;
        }
        return inference_modules.cfasl_create_invalid_hl_module(name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 31873L)
    public static SubLObject cfasl_unsupported_type_error(final SubLObject type) {
        return Errors.error((SubLObject)inference_serialization.$str64$CFASL_does_not_support_objects_of, type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 32415L)
    public static SubLObject cfasl_output_object_problem_store_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error((SubLObject)Types.type_of(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 32558L)
    public static SubLObject cfasl_output_object_problem_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error((SubLObject)Types.type_of(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 32706L)
    public static SubLObject cfasl_output_object_tactic_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error((SubLObject)Types.type_of(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 32842L)
    public static SubLObject cfasl_output_object_problem_link_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error((SubLObject)Types.type_of(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 32984L)
    public static SubLObject cfasl_output_object_proof_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error((SubLObject)Types.type_of(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 33119L)
    public static SubLObject cfasl_output_object_strategy_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error((SubLObject)Types.type_of(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 33271L)
    public static SubLObject cfasl_output_object_inference_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error((SubLObject)Types.type_of(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 33425L)
    public static SubLObject cfasl_output_object_inference_answer_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error((SubLObject)Types.type_of(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-serialization.lisp", position = 33571L)
    public static SubLObject cfasl_output_object_inference_answer_justification_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error((SubLObject)Types.type_of(v_object));
    }
    
    public static SubLObject declare_inference_serialization_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "save_problem_store", "SAVE-PROBLEM-STORE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "load_problem_store", "LOAD-PROBLEM-STORE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_problem_store", "CFASL-SAVE-PROBLEM-STORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_problem_store", "CFASL-LOAD-PROBLEM-STORE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "with_clean_cfasl_load_ps_ids", "WITH-CLEAN-CFASL-LOAD-PS-IDS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_ps_prepare_for_expected_problem_count", "CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-PROBLEM-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_ps_prepare_for_expected_link_count", "CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-LINK-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_ps_prepare_for_expected_proof_count", "CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-PROOF-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_ps_note_problem_id", "CFASL-LOAD-PS-NOTE-PROBLEM-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_ps_lookup_problem", "CFASL-LOAD-PS-LOOKUP-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_ps_note_link_id", "CFASL-LOAD-PS-NOTE-LINK-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_ps_lookup_link", "CFASL-LOAD-PS-LOOKUP-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_ps_note_proof_id", "CFASL-LOAD-PS-NOTE-PROOF-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_ps_lookup_proof", "CFASL-LOAD-PS-LOOKUP-PROOF", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "with_cfasl_load_ps_constant_table", "WITH-CFASL-LOAD-PS-CONSTANT-TABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_ps_lookup_constant", "CFASL-LOAD-PS-LOOKUP-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_problem_store_1_0", "CFASL-SAVE-PROBLEM-STORE-1-0", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_problem_store_1_0", "CFASL-LOAD-PROBLEM-STORE-1-0", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "compute_problem_store_common_symbols", "COMPUTE-PROBLEM-STORE-COMMON-SYMBOLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "possibly_note_problem_store_common_constant", "POSSIBLY-NOTE-PROBLEM-STORE-COMMON-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "compute_problem_store_common_constants", "COMPUTE-PROBLEM-STORE-COMMON-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "make_constant_internal_id_map", "MAKE-CONSTANT-INTERNAL-ID-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "make_hash_table_from_set", "MAKE-HASH-TABLE-FROM-SET", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_problem_store_properties", "CFASL-SAVE-PROBLEM-STORE-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_problem_store_properties", "CFASL-LOAD-PROBLEM-STORE-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_problem_store_problems", "CFASL-SAVE-PROBLEM-STORE-PROBLEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_problem_store_problems", "CFASL-LOAD-PROBLEM-STORE-PROBLEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_problem_store_problem", "CFASL-SAVE-PROBLEM-STORE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_problem_store_problem", "CFASL-LOAD-PROBLEM-STORE-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_problem_store_proofs", "CFASL-SAVE-PROBLEM-STORE-PROOFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_problem_store_proofs", "CFASL-LOAD-PROBLEM-STORE-PROOFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_problem_store_proof", "CFASL-SAVE-PROBLEM-STORE-PROOF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_problem_store_proof", "CFASL-LOAD-PROBLEM-STORE-PROOF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_proof_subproofs", "CFASL-LOAD-PROOF-SUBPROOFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_problem_store_problem_links", "CFASL-SAVE-PROBLEM-STORE-PROBLEM-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_problem_store_problem_links", "CFASL-LOAD-PROBLEM-STORE-PROBLEM-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_problem_store_problem_link", "CFASL-SAVE-PROBLEM-STORE-PROBLEM-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_problem_store_problem_link", "CFASL-LOAD-PROBLEM-STORE-PROBLEM-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_removal_link", "CFASL-SAVE-REMOVAL-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_removal_link", "CFASL-LOAD-REMOVAL-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_rewrite_link", "CFASL-SAVE-REWRITE-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_rewrite_link", "CFASL-LOAD-REWRITE-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_transformation_link", "CFASL-SAVE-TRANSFORMATION-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_transformation_link", "CFASL-LOAD-TRANSFORMATION-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_residual_transformation_link", "CFASL-SAVE-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_residual_transformation_link", "CFASL-LOAD-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_restriction_link", "CFASL-SAVE-RESTRICTION-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_restriction_link", "CFASL-LOAD-RESTRICTION-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_split_link", "CFASL-SAVE-SPLIT-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_split_link", "CFASL-LOAD-SPLIT-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_split_link_conjuncts", "CFASL-LOAD-SPLIT-LINK-CONJUNCTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_join_ordered_link", "CFASL-SAVE-JOIN-ORDERED-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_join_ordered_link", "CFASL-LOAD-JOIN-ORDERED-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_join_link", "CFASL-SAVE-JOIN-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_join_link", "CFASL-LOAD-JOIN-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_union_link", "CFASL-SAVE-UNION-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_union_link", "CFASL-LOAD-UNION-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_problem_reference", "CFASL-SAVE-PROBLEM-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_problem_reference", "CFASL-LOAD-PROBLEM-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_mapped_problem_reference", "CFASL-SAVE-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_mapped_problem_reference", "CFASL-LOAD-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_optional_mapped_problem_reference", "CFASL-SAVE-OPTIONAL-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_optional_mapped_problem_reference", "CFASL-LOAD-OPTIONAL-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_mapped_problem_reference_int", "CFASL-SAVE-MAPPED-PROBLEM-REFERENCE-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_mapped_problem_reference_int", "CFASL-LOAD-MAPPED-PROBLEM-REFERENCE-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_problem_link_reference", "CFASL-SAVE-PROBLEM-LINK-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_problem_link_reference", "CFASL-LOAD-PROBLEM-LINK-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_proof_reference", "CFASL-SAVE-PROOF-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_proof_reference", "CFASL-LOAD-PROOF-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_hl_module_reference", "CFASL-SAVE-HL-MODULE-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_hl_module_reference", "CFASL-LOAD-HL-MODULE-REFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_optional_hl_module_reference", "CFASL-SAVE-OPTIONAL-HL-MODULE-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_optional_hl_module_reference", "CFASL-LOAD-OPTIONAL-HL-MODULE-REFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_save_hl_module_reference_int", "CFASL-SAVE-HL-MODULE-REFERENCE-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_load_hl_module_reference_int", "CFASL-LOAD-HL-MODULE-REFERENCE-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_unsupported_type_error", "CFASL-UNSUPPORTED-TYPE-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_output_object_problem_store_method", "CFASL-OUTPUT-OBJECT-PROBLEM-STORE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_output_object_problem_method", "CFASL-OUTPUT-OBJECT-PROBLEM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_output_object_tactic_method", "CFASL-OUTPUT-OBJECT-TACTIC-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_output_object_problem_link_method", "CFASL-OUTPUT-OBJECT-PROBLEM-LINK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_output_object_proof_method", "CFASL-OUTPUT-OBJECT-PROOF-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_output_object_strategy_method", "CFASL-OUTPUT-OBJECT-STRATEGY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_output_object_inference_method", "CFASL-OUTPUT-OBJECT-INFERENCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_output_object_inference_answer_method", "CFASL-OUTPUT-OBJECT-INFERENCE-ANSWER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_serialization", "cfasl_output_object_inference_answer_justification_method", "CFASL-OUTPUT-OBJECT-INFERENCE-ANSWER-JUSTIFICATION-METHOD", 2, 0, false);
        return (SubLObject)inference_serialization.NIL;
    }
    
    public static SubLObject init_inference_serialization_file() {
        inference_serialization.$inference_serialization_supports_problem_free_hl_var_optimizationP$ = SubLFiles.defparameter("*INFERENCE-SERIALIZATION-SUPPORTS-PROBLEM-FREE-HL-VAR-OPTIMIZATION?*", (SubLObject)inference_serialization.NIL);
        inference_serialization.$current_cfasl_save_problem_store_version$ = SubLFiles.deflexical("*CURRENT-CFASL-SAVE-PROBLEM-STORE-VERSION*", (SubLObject)inference_serialization.$str10$1_0);
        inference_serialization.$cfasl_load_ps_problem_table$ = SubLFiles.defparameter("*CFASL-LOAD-PS-PROBLEM-TABLE*", (SubLObject)inference_serialization.$kw15$UNINITIALIZED);
        inference_serialization.$cfasl_load_ps_link_table$ = SubLFiles.defparameter("*CFASL-LOAD-PS-LINK-TABLE*", (SubLObject)inference_serialization.$kw15$UNINITIALIZED);
        inference_serialization.$cfasl_load_ps_proof_table$ = SubLFiles.defparameter("*CFASL-LOAD-PS-PROOF-TABLE*", (SubLObject)inference_serialization.$kw15$UNINITIALIZED);
        inference_serialization.$cfasl_load_ps_constant_table$ = SubLFiles.defparameter("*CFASL-LOAD-PS-CONSTANT-TABLE*", (SubLObject)inference_serialization.$kw15$UNINITIALIZED);
        inference_serialization.$problem_store_common_constants$ = SubLFiles.defparameter("*PROBLEM-STORE-COMMON-CONSTANTS*", (SubLObject)inference_serialization.NIL);
        return (SubLObject)inference_serialization.NIL;
    }
    
    public static SubLObject setup_inference_serialization_file() {
        access_macros.register_macro_helper((SubLObject)inference_serialization.$sym16$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_PROBLEM_COUNT, (SubLObject)inference_serialization.$sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper((SubLObject)inference_serialization.$sym18$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_LINK_COUNT, (SubLObject)inference_serialization.$sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper((SubLObject)inference_serialization.$sym19$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_PROOF_COUNT, (SubLObject)inference_serialization.$sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper((SubLObject)inference_serialization.$sym20$CFASL_LOAD_PS_NOTE_PROBLEM_ID, (SubLObject)inference_serialization.$sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper((SubLObject)inference_serialization.$sym21$CFASL_LOAD_PS_LOOKUP_PROBLEM, (SubLObject)inference_serialization.$sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper((SubLObject)inference_serialization.$sym22$CFASL_LOAD_PS_NOTE_LINK_ID, (SubLObject)inference_serialization.$sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper((SubLObject)inference_serialization.$sym23$CFASL_LOAD_PS_LOOKUP_LINK, (SubLObject)inference_serialization.$sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper((SubLObject)inference_serialization.$sym24$CFASL_LOAD_PS_NOTE_PROOF_ID, (SubLObject)inference_serialization.$sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper((SubLObject)inference_serialization.$sym25$CFASL_LOAD_PS_LOOKUP_PROOF, (SubLObject)inference_serialization.$sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS);
        access_macros.register_macro_helper((SubLObject)inference_serialization.$sym29$CFASL_LOAD_PS_LOOKUP_CONSTANT, (SubLObject)inference_serialization.$sym30$WITH_CFASL_LOAD_PS_CONSTANT_TABLE);
        utilities_macros.note_funcall_helper_function((SubLObject)inference_serialization.$sym40$POSSIBLY_NOTE_PROBLEM_STORE_COMMON_CONSTANT);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_problem_store.$dtp_problem_store$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_serialization.$sym65$CFASL_OUTPUT_OBJECT_PROBLEM_STORE_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_problem.$dtp_problem$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_serialization.$sym66$CFASL_OUTPUT_OBJECT_PROBLEM_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_tactic.$dtp_tactic$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_serialization.$sym67$CFASL_OUTPUT_OBJECT_TACTIC_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_problem_link$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_serialization.$sym68$CFASL_OUTPUT_OBJECT_PROBLEM_LINK_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_proof.$dtp_proof$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_serialization.$sym69$CFASL_OUTPUT_OBJECT_PROOF_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_strategy.$dtp_strategy$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_serialization.$sym70$CFASL_OUTPUT_OBJECT_STRATEGY_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_inference.$dtp_inference$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_serialization.$sym71$CFASL_OUTPUT_OBJECT_INFERENCE_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_inference.$dtp_inference_answer$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_serialization.$sym72$CFASL_OUTPUT_OBJECT_INFERENCE_ANSWER_METHOD));
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_inference.$dtp_inference_answer_justification$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_serialization.$sym73$CFASL_OUTPUT_OBJECT_INFERENCE_ANSWER_JUSTIFICATION_METHOD));
        return (SubLObject)inference_serialization.NIL;
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
        me = (SubLFile)new inference_serialization();
        inference_serialization.$inference_serialization_supports_problem_free_hl_var_optimizationP$ = null;
        inference_serialization.$current_cfasl_save_problem_store_version$ = null;
        inference_serialization.$cfasl_load_ps_problem_table$ = null;
        inference_serialization.$cfasl_load_ps_link_table$ = null;
        inference_serialization.$cfasl_load_ps_proof_table$ = null;
        inference_serialization.$cfasl_load_ps_constant_table$ = null;
        inference_serialization.$problem_store_common_constants$ = null;
        $kw0$CFASL = SubLObjectFactory.makeKeyword("CFASL");
        $sym1$PROBLEM_STORE_P = SubLObjectFactory.makeSymbol("PROBLEM-STORE-P");
        $sym2$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw3$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str4$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $kw5$XML = SubLObjectFactory.makeKeyword("XML");
        $str6$Time_to_implement_XML_problem_sto = SubLObjectFactory.makeString("Time to implement XML problem-store output serialization.");
        $str7$Unexpected_protocol__S = SubLObjectFactory.makeString("Unexpected protocol ~S");
        $kw8$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str9$Time_to_implement_XML_problem_sto = SubLObjectFactory.makeString("Time to implement XML problem-store input serialization.");
        $str10$1_0 = SubLObjectFactory.makeString("1.0");
        $sym11$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
        $str12$Unsupported_serialization_version = SubLObjectFactory.makeString("Unsupported serialization version ~A");
        $sym13$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-LOAD-PS-PROBLEM-TABLE*"), (SubLObject)SubLObjectFactory.makeKeyword("UNINITIALIZED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-LOAD-PS-LINK-TABLE*"), (SubLObject)SubLObjectFactory.makeKeyword("UNINITIALIZED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-LOAD-PS-PROOF-TABLE*"), (SubLObject)SubLObjectFactory.makeKeyword("UNINITIALIZED")));
        $kw15$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym16$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_PROBLEM_COUNT = SubLObjectFactory.makeSymbol("CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-PROBLEM-COUNT");
        $sym17$WITH_CLEAN_CFASL_LOAD_PS_IDS = SubLObjectFactory.makeSymbol("WITH-CLEAN-CFASL-LOAD-PS-IDS");
        $sym18$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_LINK_COUNT = SubLObjectFactory.makeSymbol("CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-LINK-COUNT");
        $sym19$CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_PROOF_COUNT = SubLObjectFactory.makeSymbol("CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-PROOF-COUNT");
        $sym20$CFASL_LOAD_PS_NOTE_PROBLEM_ID = SubLObjectFactory.makeSymbol("CFASL-LOAD-PS-NOTE-PROBLEM-ID");
        $sym21$CFASL_LOAD_PS_LOOKUP_PROBLEM = SubLObjectFactory.makeSymbol("CFASL-LOAD-PS-LOOKUP-PROBLEM");
        $sym22$CFASL_LOAD_PS_NOTE_LINK_ID = SubLObjectFactory.makeSymbol("CFASL-LOAD-PS-NOTE-LINK-ID");
        $sym23$CFASL_LOAD_PS_LOOKUP_LINK = SubLObjectFactory.makeSymbol("CFASL-LOAD-PS-LOOKUP-LINK");
        $sym24$CFASL_LOAD_PS_NOTE_PROOF_ID = SubLObjectFactory.makeSymbol("CFASL-LOAD-PS-NOTE-PROOF-ID");
        $sym25$CFASL_LOAD_PS_LOOKUP_PROOF = SubLObjectFactory.makeSymbol("CFASL-LOAD-PS-LOOKUP-PROOF");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym27$_CFASL_LOAD_PS_CONSTANT_TABLE_ = SubLObjectFactory.makeSymbol("*CFASL-LOAD-PS-CONSTANT-TABLE*");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-CONSTANT-HANDLE-LOOKUP-FUNC*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CFASL-LOAD-PS-LOOKUP-CONSTANT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CFASL-INPUT-GUID-STRING-RESOURCE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GUID-TO-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GUID")))));
        $sym29$CFASL_LOAD_PS_LOOKUP_CONSTANT = SubLObjectFactory.makeSymbol("CFASL-LOAD-PS-LOOKUP-CONSTANT");
        $sym30$WITH_CFASL_LOAD_PS_CONSTANT_TABLE = SubLObjectFactory.makeSymbol("WITH-CFASL-LOAD-PS-CONSTANT-TABLE");
        $str31$Unable_to_lookup_a_constant_from_ = SubLObjectFactory.makeString("Unable to lookup a constant from ~S");
        $kw32$PROBLEM = SubLObjectFactory.makeKeyword("PROBLEM");
        $kw33$PROBLEM_LINK = SubLObjectFactory.makeKeyword("PROBLEM-LINK");
        $kw34$PROOF = SubLObjectFactory.makeKeyword("PROOF");
        $kw35$DONE = SubLObjectFactory.makeKeyword("DONE");
        $str36$Unexpected_section__S = SubLObjectFactory.makeString("Unexpected section ~S");
        $kw37$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym38$STRING_LESSP = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $sym39$SYMBOL_NAME = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $sym40$POSSIBLY_NOTE_PROBLEM_STORE_COMMON_CONSTANT = SubLObjectFactory.makeSymbol("POSSIBLY-NOTE-PROBLEM-STORE-COMMON-CONSTANT");
        $int41$100 = SubLObjectFactory.makeInteger(100);
        $sym42$CONSTANT_INTERNAL_ID = SubLObjectFactory.makeSymbol("CONSTANT-INTERNAL-ID");
        $sym43$SET_P = SubLObjectFactory.makeSymbol("SET-P");
        $sym44$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym45$PROBLEM_STORE_PROPERTIES_P = SubLObjectFactory.makeSymbol("PROBLEM-STORE-PROPERTIES-P");
        $sym46$PROBLEM_LINK_P = SubLObjectFactory.makeSymbol("PROBLEM-LINK-P");
        $kw47$REMOVAL = SubLObjectFactory.makeKeyword("REMOVAL");
        $kw48$REWRITE = SubLObjectFactory.makeKeyword("REWRITE");
        $kw49$TRANSFORMATION = SubLObjectFactory.makeKeyword("TRANSFORMATION");
        $kw50$RESIDUAL_TRANSFORMATION = SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION");
        $kw51$RESTRICTION = SubLObjectFactory.makeKeyword("RESTRICTION");
        $kw52$SPLIT = SubLObjectFactory.makeKeyword("SPLIT");
        $kw53$JOIN_ORDERED = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $kw54$JOIN = SubLObjectFactory.makeKeyword("JOIN");
        $kw55$UNION = SubLObjectFactory.makeKeyword("UNION");
        $str56$Unexpected_link_type__S = SubLObjectFactory.makeString("Unexpected link type ~S");
        $sym57$SPLIT_LINK_P = SubLObjectFactory.makeSymbol("SPLIT-LINK-P");
        $sym58$JOIN_LINK_P = SubLObjectFactory.makeSymbol("JOIN-LINK-P");
        $sym59$UNION_LINK_P = SubLObjectFactory.makeSymbol("UNION-LINK-P");
        $sym60$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
        $sym61$MAPPED_PROBLEM_P = SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-P");
        $sym62$PROOF_P = SubLObjectFactory.makeSymbol("PROOF-P");
        $sym63$HL_MODULE_P = SubLObjectFactory.makeSymbol("HL-MODULE-P");
        $str64$CFASL_does_not_support_objects_of = SubLObjectFactory.makeString("CFASL does not support objects of type ~A");
        $sym65$CFASL_OUTPUT_OBJECT_PROBLEM_STORE_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-PROBLEM-STORE-METHOD");
        $sym66$CFASL_OUTPUT_OBJECT_PROBLEM_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-PROBLEM-METHOD");
        $sym67$CFASL_OUTPUT_OBJECT_TACTIC_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-TACTIC-METHOD");
        $sym68$CFASL_OUTPUT_OBJECT_PROBLEM_LINK_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-PROBLEM-LINK-METHOD");
        $sym69$CFASL_OUTPUT_OBJECT_PROOF_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-PROOF-METHOD");
        $sym70$CFASL_OUTPUT_OBJECT_STRATEGY_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-STRATEGY-METHOD");
        $sym71$CFASL_OUTPUT_OBJECT_INFERENCE_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-INFERENCE-METHOD");
        $sym72$CFASL_OUTPUT_OBJECT_INFERENCE_ANSWER_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-INFERENCE-ANSWER-METHOD");
        $sym73$CFASL_OUTPUT_OBJECT_INFERENCE_ANSWER_JUSTIFICATION_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-INFERENCE-ANSWER-JUSTIFICATION-METHOD");
    }
}

/*

	Total time: 429 ms
	
*/