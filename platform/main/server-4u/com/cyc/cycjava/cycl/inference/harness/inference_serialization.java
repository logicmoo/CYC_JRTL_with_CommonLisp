/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_common_symbols$;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_input_guid_string_resource$;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_output_object_method_table$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_opcode_peek;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_externalized;
import static com.cyc.cycjava.cycl.cfasl.cfasl_set_common_symbols;
import static com.cyc.cycjava.cycl.cfasl_kb_methods.$cfasl_externalized_constant_exceptions$;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.new_problem_store;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.problem_store_answer_link_count;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.problem_store_link_count;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.problem_store_link_id_index;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.problem_store_prepare_for_expected_link_count;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.problem_store_prepare_for_expected_problem_count;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.problem_store_prepare_for_expected_proof_count;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.problem_store_problem_count;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.problem_store_problem_id_index;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.problem_store_proof_count;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.problem_store_proof_id_index;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.problem_store_properties;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_split.new_split_link;
import static com.cyc.cycjava.cycl.inference.harness.inference_worker_union.new_union_link;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.streamp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.cfasl_kb_methods;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-SERIALIZATION
 * source file: /cyc/top/cycl/inference/harness/inference-serialization.lisp
 * created:     2019/07/03 17:37:42
 */
public final class inference_serialization extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new inference_serialization();



    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $inference_serialization_supports_problem_free_hl_var_optimizationP$ = makeSymbol("*INFERENCE-SERIALIZATION-SUPPORTS-PROBLEM-FREE-HL-VAR-OPTIMIZATION?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $current_cfasl_save_problem_store_version$ = makeSymbol("*CURRENT-CFASL-SAVE-PROBLEM-STORE-VERSION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cfasl_load_ps_problem_table$ = makeSymbol("*CFASL-LOAD-PS-PROBLEM-TABLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cfasl_load_ps_link_table$ = makeSymbol("*CFASL-LOAD-PS-LINK-TABLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cfasl_load_ps_proof_table$ = makeSymbol("*CFASL-LOAD-PS-PROOF-TABLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $problem_store_common_constants$ = makeSymbol("*PROBLEM-STORE-COMMON-CONSTANTS*");

    static private final SubLString $str4$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str6$Time_to_implement_XML_problem_sto = makeString("Time to implement XML problem-store output serialization.");

    static private final SubLString $str7$Unexpected_protocol__S = makeString("Unexpected protocol ~S");

    static private final SubLString $str9$Time_to_implement_XML_problem_sto = makeString("Time to implement XML problem-store input serialization.");

    static private final SubLString $str10$1_0 = makeString("1.0");

    static private final SubLString $str12$Unsupported_serialization_version = makeString("Unsupported serialization version ~A");

    static private final SubLList $list14 = list(list(makeSymbol("*CFASL-LOAD-PS-PROBLEM-TABLE*"), makeKeyword("UNINITIALIZED")), list(makeSymbol("*CFASL-LOAD-PS-LINK-TABLE*"), makeKeyword("UNINITIALIZED")), list(makeSymbol("*CFASL-LOAD-PS-PROOF-TABLE*"), makeKeyword("UNINITIALIZED")));

    private static final SubLSymbol CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_PROBLEM_COUNT = makeSymbol("CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-PROBLEM-COUNT");

    private static final SubLSymbol WITH_CLEAN_CFASL_LOAD_PS_IDS = makeSymbol("WITH-CLEAN-CFASL-LOAD-PS-IDS");

    private static final SubLSymbol CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_LINK_COUNT = makeSymbol("CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-LINK-COUNT");

    private static final SubLSymbol CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_PROOF_COUNT = makeSymbol("CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-PROOF-COUNT");

    private static final SubLSymbol CFASL_LOAD_PS_NOTE_PROBLEM_ID = makeSymbol("CFASL-LOAD-PS-NOTE-PROBLEM-ID");

    private static final SubLSymbol CFASL_LOAD_PS_LOOKUP_PROBLEM = makeSymbol("CFASL-LOAD-PS-LOOKUP-PROBLEM");

    private static final SubLSymbol CFASL_LOAD_PS_NOTE_LINK_ID = makeSymbol("CFASL-LOAD-PS-NOTE-LINK-ID");

    private static final SubLSymbol CFASL_LOAD_PS_LOOKUP_LINK = makeSymbol("CFASL-LOAD-PS-LOOKUP-LINK");

    private static final SubLSymbol CFASL_LOAD_PS_NOTE_PROOF_ID = makeSymbol("CFASL-LOAD-PS-NOTE-PROOF-ID");

    private static final SubLSymbol CFASL_LOAD_PS_LOOKUP_PROOF = makeSymbol("CFASL-LOAD-PS-LOOKUP-PROOF");

    static private final SubLList $list26 = list(makeSymbol("CONSTANT-TABLE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $cfasl_load_ps_constant_table$ = makeSymbol("*CFASL-LOAD-PS-CONSTANT-TABLE*");

    static private final SubLList $list28 = list(list(makeSymbol("*CFASL-CONSTANT-HANDLE-LOOKUP-FUNC*"), list(QUOTE, makeSymbol("CFASL-LOAD-PS-LOOKUP-CONSTANT"))), list(makeSymbol("*CFASL-INPUT-GUID-STRING-RESOURCE*"), list(makeSymbol("GUID-TO-STRING"), list(makeSymbol("NEW-GUID")))));

    private static final SubLSymbol CFASL_LOAD_PS_LOOKUP_CONSTANT = makeSymbol("CFASL-LOAD-PS-LOOKUP-CONSTANT");

    private static final SubLSymbol WITH_CFASL_LOAD_PS_CONSTANT_TABLE = makeSymbol("WITH-CFASL-LOAD-PS-CONSTANT-TABLE");

    static private final SubLString $str31$Unable_to_lookup_a_constant_from_ = makeString("Unable to lookup a constant from ~S");

    static private final SubLString $str36$Unexpected_section__S = makeString("Unexpected section ~S");

    private static final SubLSymbol POSSIBLY_NOTE_PROBLEM_STORE_COMMON_CONSTANT = makeSymbol("POSSIBLY-NOTE-PROBLEM-STORE-COMMON-CONSTANT");

    private static final SubLSymbol CONSTANT_INTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID");

    private static final SubLSymbol PROBLEM_STORE_PROPERTIES_P = makeSymbol("PROBLEM-STORE-PROPERTIES-P");

    static private final SubLString $str56$Unexpected_link_type__S = makeString("Unexpected link type ~S");

    private static final SubLSymbol SPLIT_LINK_P = makeSymbol("SPLIT-LINK-P");

    private static final SubLSymbol JOIN_LINK_P = makeSymbol("JOIN-LINK-P");

    private static final SubLSymbol UNION_LINK_P = makeSymbol("UNION-LINK-P");

    private static final SubLString $str64$CFASL_does_not_support_objects_of = makeString("CFASL does not support objects of type ~A");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_PROBLEM_STORE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-PROBLEM-STORE-METHOD");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_PROBLEM_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-PROBLEM-METHOD");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_TACTIC_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-TACTIC-METHOD");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_PROBLEM_LINK_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-PROBLEM-LINK-METHOD");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_PROOF_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-PROOF-METHOD");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_STRATEGY_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-STRATEGY-METHOD");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_INFERENCE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-INFERENCE-METHOD");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_INFERENCE_ANSWER_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-INFERENCE-ANSWER-METHOD");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_INFERENCE_ANSWER_JUSTIFICATION_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-INFERENCE-ANSWER-JUSTIFICATION-METHOD");

    // Definitions
    /**
     * Save the problem store STORE out to FILENAME.
     */
    @LispMethod(comment = "Save the problem store STORE out to FILENAME.")
    public static final SubLObject save_problem_store_alt(SubLObject store, SubLObject filename, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject result = NIL;
                SubLObject pcase_var = protocol;
                if (pcase_var.eql($CFASL)) {
                    {
                        SubLObject stream = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream = compatibility.open_binary(filename, $OUTPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream.isStream()) {
                                Errors.error($str_alt4$Unable_to_open__S, filename);
                            }
                            {
                                SubLObject stream_1 = stream;
                                result = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_store(store, stream_1);
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (stream.isStream()) {
                                        close(stream, UNPROVIDED);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($XML)) {
                        Errors.error($str_alt6$Time_to_implement_XML_problem_sto);
                    } else {
                        Errors.error($str_alt7$Unexpected_protocol__S, protocol);
                    }
                }
                return result;
            }
        }
    }

    // Definitions
    /**
     * Save the problem store STORE out to FILENAME.
     */
    @LispMethod(comment = "Save the problem store STORE out to FILENAME.")
    public static SubLObject save_problem_store(final SubLObject store, final SubLObject filename, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject result = NIL;
        final SubLObject pcase_var = protocol;
        if (pcase_var.eql($CFASL)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_binary(filename, $OUTPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str4$Unable_to_open__S, filename);
                }
                final SubLObject stream_$1 = stream;
                result = cfasl_save_problem_store(store, stream_$1);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } else
            if (pcase_var.eql($XML)) {
                Errors.error($str6$Time_to_implement_XML_problem_sto);
            } else {
                Errors.error($str7$Unexpected_protocol__S, protocol);
            }

        return result;
    }

    /**
     * Load in a new problem store that was previously saved out to FILENAME.
     */
    @LispMethod(comment = "Load in a new problem store that was previously saved out to FILENAME.")
    public static final SubLObject load_problem_store(SubLObject filename, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject store = NIL;
                SubLObject pcase_var = protocol;
                if (pcase_var.eql($CFASL)) {
                    {
                        SubLObject stream = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream = compatibility.open_binary(filename, $INPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream.isStream()) {
                                Errors.error($str_alt4$Unable_to_open__S, filename);
                            }
                            {
                                SubLObject stream_2 = stream;
                                store = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_store(stream_2);
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (stream.isStream()) {
                                        close(stream, UNPROVIDED);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($XML)) {
                        Errors.error($str_alt9$Time_to_implement_XML_problem_sto);
                    } else {
                        Errors.error($str_alt7$Unexpected_protocol__S, protocol);
                    }
                }
                return store;
            }
        }
    }

    public static SubLObject load_problem_store(final SubLObject filename, SubLObject protocol, SubLObject validateP) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        if (validateP == UNPROVIDED) {
            validateP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject store = NIL;
        final SubLObject pcase_var = protocol;
        if (pcase_var.eql($CFASL)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_binary(filename, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str4$Unable_to_open__S, filename);
                }
                final SubLObject stream_$2 = stream;
                final SubLObject _prev_bind_2 = cfasl_kb_methods.$cfasl_error_on_invalid_assertion_inputP$.currentBinding(thread);
                try {
                    cfasl_kb_methods.$cfasl_error_on_invalid_assertion_inputP$.bind(validateP, thread);
                    store = cfasl_load_problem_store(stream_$2);
                } finally {
                    cfasl_kb_methods.$cfasl_error_on_invalid_assertion_inputP$.rebind(_prev_bind_2, thread);
                }
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        } else
            if (pcase_var.eql($XML)) {
                Errors.error($str9$Time_to_implement_XML_problem_sto);
            } else {
                Errors.error($str7$Unexpected_protocol__S, protocol);
            }

        return store;
    }

    public static final SubLObject cfasl_save_problem_store_alt(SubLObject store, SubLObject stream) {
        SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
        SubLTrampolineFile.checkType(stream, STREAMP);
        {
            SubLObject version = $current_cfasl_save_problem_store_version$.getGlobalValue();
            cfasl_output(version, stream);
            if (version.equal($str_alt10$1_0)) {
                return com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_store_1_0(store, stream);
            } else {
                return Errors.error($str_alt12$Unsupported_serialization_version, version);
            }
        }
    }

    public static SubLObject cfasl_save_problem_store(final SubLObject store, final SubLObject stream) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        assert NIL != streamp(stream) : "! streamp(stream) " + ("Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) ") + stream;
        final SubLObject version = $current_cfasl_save_problem_store_version$.getGlobalValue();
        cfasl_output(version, stream);
        if (version.equal($str10$1_0)) {
            return cfasl_save_problem_store_1_0(store, stream);
        }
        return Errors.error($str12$Unsupported_serialization_version, version);
    }

    public static final SubLObject cfasl_load_problem_store_alt(SubLObject stream) {
        SubLTrampolineFile.checkType(stream, STREAMP);
        {
            SubLObject version = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            if (version.equal($str_alt10$1_0)) {
                return com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_store_1_0(stream);
            } else {
                return Errors.error($str_alt12$Unsupported_serialization_version, version);
            }
        }
    }

    public static SubLObject cfasl_load_problem_store(final SubLObject stream) {
        assert NIL != streamp(stream) : "! streamp(stream) " + ("Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) ") + stream;
        final SubLObject version = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (version.equal($str10$1_0)) {
            return cfasl_load_problem_store_1_0(stream);
        }
        return Errors.error($str12$Unsupported_serialization_version, version);
    }

    public static final SubLObject with_clean_cfasl_load_ps_ids_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt14, append(body, NIL));
        }
    }

    public static SubLObject with_clean_cfasl_load_ps_ids(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list14, append(body, NIL));
    }

    public static final SubLObject cfasl_load_ps_prepare_for_expected_problem_count_alt(SubLObject count) {
        $cfasl_load_ps_problem_table$.setDynamicValue(make_hash_table(count, symbol_function(EQ), UNPROVIDED));
        return count;
    }

    public static SubLObject cfasl_load_ps_prepare_for_expected_problem_count(final SubLObject count) {
        $cfasl_load_ps_problem_table$.setDynamicValue(make_hash_table(count, symbol_function(EQ), UNPROVIDED));
        return count;
    }

    public static final SubLObject cfasl_load_ps_prepare_for_expected_link_count_alt(SubLObject count) {
        $cfasl_load_ps_link_table$.setDynamicValue(make_hash_table(count, symbol_function(EQ), UNPROVIDED));
        return count;
    }

    public static SubLObject cfasl_load_ps_prepare_for_expected_link_count(final SubLObject count) {
        $cfasl_load_ps_link_table$.setDynamicValue(make_hash_table(count, symbol_function(EQ), UNPROVIDED));
        return count;
    }

    public static final SubLObject cfasl_load_ps_prepare_for_expected_proof_count_alt(SubLObject count) {
        $cfasl_load_ps_proof_table$.setDynamicValue(make_hash_table(count, symbol_function(EQ), UNPROVIDED));
        return count;
    }

    public static SubLObject cfasl_load_ps_prepare_for_expected_proof_count(final SubLObject count) {
        $cfasl_load_ps_proof_table$.setDynamicValue(make_hash_table(count, symbol_function(EQ), UNPROVIDED));
        return count;
    }

    public static final SubLObject cfasl_load_ps_note_problem_id_alt(SubLObject problem, SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return sethash(id, $cfasl_load_ps_problem_table$.getDynamicValue(thread), problem);
        }
    }

    public static SubLObject cfasl_load_ps_note_problem_id(final SubLObject problem, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sethash(id, $cfasl_load_ps_problem_table$.getDynamicValue(thread), problem);
    }

    public static final SubLObject cfasl_load_ps_lookup_problem_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash_without_values(id, $cfasl_load_ps_problem_table$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject cfasl_load_ps_lookup_problem(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash_without_values(id, $cfasl_load_ps_problem_table$.getDynamicValue(thread), UNPROVIDED);
    }

    public static final SubLObject cfasl_load_ps_note_link_id_alt(SubLObject link, SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return sethash(id, $cfasl_load_ps_link_table$.getDynamicValue(thread), link);
        }
    }

    public static SubLObject cfasl_load_ps_note_link_id(final SubLObject link, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sethash(id, $cfasl_load_ps_link_table$.getDynamicValue(thread), link);
    }

    public static final SubLObject cfasl_load_ps_lookup_link_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash_without_values(id, $cfasl_load_ps_link_table$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject cfasl_load_ps_lookup_link(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash_without_values(id, $cfasl_load_ps_link_table$.getDynamicValue(thread), UNPROVIDED);
    }

    public static final SubLObject cfasl_load_ps_note_proof_id_alt(SubLObject proof, SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return sethash(id, $cfasl_load_ps_proof_table$.getDynamicValue(thread), proof);
        }
    }

    public static SubLObject cfasl_load_ps_note_proof_id(final SubLObject proof, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sethash(id, $cfasl_load_ps_proof_table$.getDynamicValue(thread), proof);
    }

    public static final SubLObject cfasl_load_ps_lookup_proof_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash_without_values(id, $cfasl_load_ps_proof_table$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject cfasl_load_ps_lookup_proof(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash_without_values(id, $cfasl_load_ps_proof_table$.getDynamicValue(thread), UNPROVIDED);
    }

    public static final SubLObject with_cfasl_load_ps_constant_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject constant_table = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt26);
            constant_table = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, bq_cons(list($cfasl_load_ps_constant_table$, constant_table), $list_alt28), append(body, NIL));
            }
        }
    }

    public static SubLObject with_cfasl_load_ps_constant_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject constant_table = NIL;
        destructuring_bind_must_consp(current, datum, $list26);
        constant_table = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, bq_cons(list($cfasl_load_ps_constant_table$, constant_table), $list28), append(body, NIL));
    }

    public static final SubLObject cfasl_load_ps_lookup_constant_alt(SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject constant = gethash_without_values(id, $cfasl_load_ps_constant_table$.getDynamicValue(thread), UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == constant_p(constant)) {
                        Errors.error($str_alt31$Unable_to_lookup_a_constant_from_, id);
                    }
                }
                return constant;
            }
        }
    }

    public static SubLObject cfasl_load_ps_lookup_constant(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constant = gethash_without_values(id, $cfasl_load_ps_constant_table$.getDynamicValue(thread), UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == constant_p(constant))) {
            Errors.error($str31$Unable_to_lookup_a_constant_from_, id);
        }
        return constant;
    }

    public static final SubLObject cfasl_save_problem_store_1_0_alt(SubLObject store, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
            SubLTrampolineFile.checkType(stream, STREAMP);
            {
                SubLObject common_symbols = com.cyc.cycjava.cycl.inference.harness.inference_serialization.compute_problem_store_common_symbols(store);
                SubLObject common_constants = com.cyc.cycjava.cycl.inference.harness.inference_serialization.compute_problem_store_common_constants(store);
                SubLObject constant_table = com.cyc.cycjava.cycl.inference.harness.inference_serialization.make_constant_internal_id_map(common_constants);
                {
                    SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols(NIL);
                        cfasl_output(common_symbols, stream);
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols(common_symbols);
                        {
                            SubLObject _prev_bind_0_3 = $cfasl_externalized_constant_exceptions$.currentBinding(thread);
                            try {
                                $cfasl_externalized_constant_exceptions$.bind(NIL, thread);
                                cfasl_output_externalized(constant_table, stream);
                            } finally {
                                $cfasl_externalized_constant_exceptions$.rebind(_prev_bind_0_3, thread);
                            }
                        }
                        {
                            SubLObject _prev_bind_0_4 = $cfasl_externalized_constant_exceptions$.currentBinding(thread);
                            try {
                                $cfasl_externalized_constant_exceptions$.bind(common_constants, thread);
                                com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_store_properties(store, stream);
                                cfasl_output($PROBLEM, stream);
                                com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_store_problems(store, stream);
                                cfasl_output($PROBLEM_LINK, stream);
                                com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_store_problem_links(store, stream);
                                cfasl_output($PROOF, stream);
                                com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_store_proofs(store, stream);
                                cfasl_output($DONE, stream);
                            } finally {
                                $cfasl_externalized_constant_exceptions$.rebind(_prev_bind_0_4, thread);
                            }
                        }
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return store;
        }
    }

    public static SubLObject cfasl_save_problem_store_1_0(final SubLObject store, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        assert NIL != streamp(stream) : "! streamp(stream) " + ("Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) ") + stream;
        final SubLObject common_symbols = compute_problem_store_common_symbols(store);
        final SubLObject common_constants = compute_problem_store_common_constants(store);
        final SubLObject constant_table = make_constant_internal_id_map(common_constants);
        SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols(NIL);
            cfasl_output(common_symbols, stream);
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols(common_symbols);
            final SubLObject _prev_bind_0_$3 = cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.currentBinding(thread);
            try {
                cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.bind(NIL, thread);
                cfasl_output_externalized(constant_table, stream);
            } finally {
                cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.rebind(_prev_bind_0_$3, thread);
            }
            final SubLObject _prev_bind_0_$4 = cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.currentBinding(thread);
            try {
                cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.bind(common_constants, thread);
                cfasl_save_problem_store_properties(store, stream);
                cfasl_output($PROBLEM, stream);
                cfasl_save_problem_store_problems(store, stream);
                cfasl_output($PROBLEM_LINK, stream);
                cfasl_save_problem_store_problem_links(store, stream);
                cfasl_output($PROOF, stream);
                cfasl_save_problem_store_proofs(store, stream);
                cfasl_output($DONE, stream);
            } finally {
                cfasl_kb_methods.$cfasl_externalized_constant_exceptions$.rebind(_prev_bind_0_$4, thread);
            }
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return store;
    }

    public static final SubLObject cfasl_load_problem_store_1_0_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(stream, STREAMP);
            {
                SubLObject common_symbols = NIL;
                SubLObject constant_table = NIL;
                SubLObject problem_store_properties = NIL;
                SubLObject store = NIL;
                {
                    SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols(NIL);
                        common_symbols = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols(common_symbols);
                        constant_table = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_5 = $cfasl_load_ps_constant_table$.currentBinding(thread);
                            SubLObject _prev_bind_1 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
                            SubLObject _prev_bind_2 = $cfasl_input_guid_string_resource$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $cfasl_load_ps_problem_table$.currentBinding(thread);
                            SubLObject _prev_bind_4 = $cfasl_load_ps_link_table$.currentBinding(thread);
                            SubLObject _prev_bind_5 = $cfasl_load_ps_proof_table$.currentBinding(thread);
                            try {
                                $cfasl_load_ps_constant_table$.bind(constant_table, thread);
                                api_control_vars.$cfasl_constant_handle_lookup_func$.bind(CFASL_LOAD_PS_LOOKUP_CONSTANT, thread);
                                $cfasl_input_guid_string_resource$.bind(Guids.guid_to_string(Guids.new_guid()), thread);
                                $cfasl_load_ps_problem_table$.bind($UNINITIALIZED, thread);
                                $cfasl_load_ps_link_table$.bind($UNINITIALIZED, thread);
                                $cfasl_load_ps_proof_table$.bind($UNINITIALIZED, thread);
                                problem_store_properties = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_store_properties(stream);
                                store = new_problem_store(problem_store_properties);
                                {
                                    SubLObject section = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                                    while ($DONE != section) {
                                        {
                                            SubLObject pcase_var = section;
                                            if (pcase_var.eql($PROBLEM)) {
                                                com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_store_problems(store, stream);
                                            } else {
                                                if (pcase_var.eql($PROBLEM_LINK)) {
                                                    com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_store_problem_links(store, stream);
                                                } else {
                                                    if (pcase_var.eql($PROOF)) {
                                                        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_store_proofs(store, stream);
                                                    } else {
                                                        Errors.error($str_alt36$Unexpected_section__S, section);
                                                    }
                                                }
                                            }
                                        }
                                        section = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                                    } 
                                }
                            } finally {
                                $cfasl_load_ps_proof_table$.rebind(_prev_bind_5, thread);
                                $cfasl_load_ps_link_table$.rebind(_prev_bind_4, thread);
                                $cfasl_load_ps_problem_table$.rebind(_prev_bind_3, thread);
                                $cfasl_input_guid_string_resource$.rebind(_prev_bind_2, thread);
                                api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_1, thread);
                                $cfasl_load_ps_constant_table$.rebind(_prev_bind_0_5, thread);
                            }
                        }
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                    }
                }
                return store;
            }
        }
    }

    public static SubLObject cfasl_load_problem_store_1_0(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != streamp(stream) : "! streamp(stream) " + ("Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) ") + stream;
        SubLObject common_symbols = NIL;
        SubLObject constant_table = NIL;
        SubLObject problem_store_properties = NIL;
        SubLObject store = NIL;
        SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols(NIL);
            common_symbols = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols(common_symbols);
            constant_table = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0_$5 = $cfasl_load_ps_constant_table$.currentBinding(thread);
            final SubLObject _prev_bind_2 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $cfasl_input_guid_string_resource$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $cfasl_load_ps_problem_table$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $cfasl_load_ps_link_table$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $cfasl_load_ps_proof_table$.currentBinding(thread);
            try {
                $cfasl_load_ps_constant_table$.bind(constant_table, thread);
                api_control_vars.$cfasl_constant_handle_lookup_func$.bind(CFASL_LOAD_PS_LOOKUP_CONSTANT, thread);
                $cfasl_input_guid_string_resource$.bind(Guids.guid_to_string(Guids.new_guid()), thread);
                $cfasl_load_ps_problem_table$.bind($UNINITIALIZED, thread);
                $cfasl_load_ps_link_table$.bind($UNINITIALIZED, thread);
                $cfasl_load_ps_proof_table$.bind($UNINITIALIZED, thread);
                problem_store_properties = cfasl_load_problem_store_properties(stream);
                store = inference_datastructures_problem_store.new_problem_store(problem_store_properties);
                for (SubLObject section = cfasl_input(stream, UNPROVIDED, UNPROVIDED); $DONE != section; section = cfasl_input(stream, UNPROVIDED, UNPROVIDED)) {
                    final SubLObject pcase_var = section;
                    if (pcase_var.eql($PROBLEM)) {
                        cfasl_load_problem_store_problems(store, stream);
                    } else
                        if (pcase_var.eql($PROBLEM_LINK)) {
                            cfasl_load_problem_store_problem_links(store, stream);
                        } else
                            if (pcase_var.eql($PROOF)) {
                                cfasl_load_problem_store_proofs(store, stream);
                            } else {
                                Errors.error($str36$Unexpected_section__S, section);
                            }


                }
            } finally {
                $cfasl_load_ps_proof_table$.rebind(_prev_bind_6, thread);
                $cfasl_load_ps_link_table$.rebind(_prev_bind_5, thread);
                $cfasl_load_ps_problem_table$.rebind(_prev_bind_4, thread);
                $cfasl_input_guid_string_resource$.rebind(_prev_bind_3, thread);
                api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_2, thread);
                $cfasl_load_ps_constant_table$.rebind(_prev_bind_0_$5, thread);
            }
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return store;
    }

    public static final SubLObject compute_problem_store_common_symbols_alt(SubLObject store) {
        SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
        {
            SubLObject common_symbols = set.new_set(symbol_function(EQ), UNPROVIDED);
            SubLObject idx = problem_store_link_id_index(store);
            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                {
                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                    SubLObject link = NIL;
                    while (NIL != id) {
                        link = do_id_index_state_object(idx, $SKIP, id, state_var);
                        if (NIL != do_id_index_id_and_object_validP(id, link, $SKIP)) {
                            {
                                SubLObject link_type = inference_datastructures_problem_link.problem_link_type(link);
                                set.set_add(link_type, common_symbols);
                            }
                            if (NIL != inference_worker.content_link_p(link)) {
                                {
                                    SubLObject hl_module_name = inference_modules.hl_module_name(inference_worker.content_link_hl_module(link));
                                    if (hl_module_name.isSymbol()) {
                                        set.set_add(hl_module_name, common_symbols);
                                    }
                                }
                            }
                        }
                        id = do_id_index_next_id(idx, NIL, id, state_var);
                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                    } 
                }
            }
            {
                SubLObject cdolist_list_var = inference_datastructures_enumerated_types.all_problem_store_properties();
                SubLObject property = NIL;
                for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property = cdolist_list_var.first()) {
                    set.set_add(property, common_symbols);
                }
            }
            return Sort.sort(set.set_element_list(common_symbols), symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
        }
    }

    public static SubLObject compute_problem_store_common_symbols(final SubLObject store) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        final SubLObject common_symbols = set.new_set(symbol_function(EQ), UNPROVIDED);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_link_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$6 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$6);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject link;
                SubLObject link_type;
                SubLObject hl_module_name;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    link = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(link)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(link)) {
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
            final SubLObject idx_$7 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$7)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$7);
                SubLObject id2 = NIL;
                SubLObject link2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        link2 = getEntryValue(cdohash_entry);
                        final SubLObject link_type2 = inference_datastructures_problem_link.problem_link_type(link2);
                        set.set_add(link_type2, common_symbols);
                        if (NIL != inference_worker.content_link_p(link2)) {
                            final SubLObject hl_module_name2 = inference_modules.hl_module_name(inference_worker.content_link_hl_module(link2));
                            if (!hl_module_name2.isSymbol()) {
                                continue;
                            }
                            set.set_add(hl_module_name2, common_symbols);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
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
        return Sort.sort(set.set_element_list(common_symbols), symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
    }

    public static final SubLObject possibly_note_problem_store_common_constant_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != constant_p(v_object)) {
                set.set_add(v_object, $problem_store_common_constants$.getDynamicValue(thread));
                return T;
            }
            return NIL;
        }
    }

    public static SubLObject possibly_note_problem_store_common_constant(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != constant_p(v_object)) {
            set.set_add(v_object, $problem_store_common_constants$.getDynamicValue(thread));
            return T;
        }
        return NIL;
    }

    public static final SubLObject compute_problem_store_common_constants_alt(SubLObject store) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
            {
                SubLObject common_constants = set.new_set(symbol_function(EQ), $int$100);
                {
                    SubLObject _prev_bind_0 = $problem_store_common_constants$.currentBinding(thread);
                    try {
                        $problem_store_common_constants$.bind(common_constants, thread);
                        {
                            SubLObject idx = problem_store_problem_id_index(store);
                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                {
                                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                                    SubLObject problem = NIL;
                                    while (NIL != id) {
                                        problem = do_id_index_state_object(idx, $SKIP, id, state_var);
                                        if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
                                            {
                                                SubLObject query = inference_datastructures_problem.problem_query(problem);
                                                list_utilities.tree_map(POSSIBLY_NOTE_PROBLEM_STORE_COMMON_CONSTANT, query, UNPROVIDED);
                                            }
                                        }
                                        id = do_id_index_next_id(idx, NIL, id, state_var);
                                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                                    } 
                                }
                            }
                        }
                    } finally {
                        $problem_store_common_constants$.rebind(_prev_bind_0, thread);
                    }
                }
                return common_constants;
            }
        }
    }

    public static SubLObject compute_problem_store_common_constants(final SubLObject store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        final SubLObject common_constants = set.new_set(symbol_function(EQ), $int$100);
        final SubLObject _prev_bind_0 = $problem_store_common_constants$.currentBinding(thread);
        try {
            $problem_store_common_constants$.bind(common_constants, thread);
            final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$8 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$8, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$8);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject problem;
                    SubLObject query;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        problem = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(problem)) {
                                problem = $SKIP;
                            }
                            query = inference_datastructures_problem.problem_query(problem);
                            list_utilities.tree_map(POSSIBLY_NOTE_PROBLEM_STORE_COMMON_CONSTANT, query, UNPROVIDED);
                        }
                    }
                }
                final SubLObject idx_$9 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$9)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$9);
                    SubLObject id2 = NIL;
                    SubLObject problem2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            problem2 = getEntryValue(cdohash_entry);
                            final SubLObject query2 = inference_datastructures_problem.problem_query(problem2);
                            list_utilities.tree_map(POSSIBLY_NOTE_PROBLEM_STORE_COMMON_CONSTANT, query2, UNPROVIDED);
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        } finally {
            $problem_store_common_constants$.rebind(_prev_bind_0, thread);
        }
        return common_constants;
    }

    public static final SubLObject make_constant_internal_id_map_alt(SubLObject constants) {
        return com.cyc.cycjava.cycl.inference.harness.inference_serialization.make_hash_table_from_set(constants, symbol_function(IDENTITY), symbol_function(CONSTANT_INTERNAL_ID), symbol_function(EQL));
    }

    public static SubLObject make_constant_internal_id_map(final SubLObject constants) {
        return make_hash_table_from_set(constants, symbol_function(IDENTITY), symbol_function(CONSTANT_INTERNAL_ID), symbol_function(EQL));
    }

    /**
     * Make a new hashtable populated by each ELEMENT in SET.
     * TEST is the test used for the resulting hashtable.
     * KEY-METHOD   is the method for transforming ELEMENT into the KEY   for an entry.
     * VALUE-METHOD is the method for transforming ELEMENT into the VALUE for an entry.
     *
     * @return hash-table-p
     */
    @LispMethod(comment = "Make a new hashtable populated by each ELEMENT in SET.\r\nTEST is the test used for the resulting hashtable.\r\nKEY-METHOD   is the method for transforming ELEMENT into the KEY   for an entry.\r\nVALUE-METHOD is the method for transforming ELEMENT into the VALUE for an entry.\r\n\r\n@return hash-table-p\nMake a new hashtable populated by each ELEMENT in SET.\nTEST is the test used for the resulting hashtable.\nKEY-METHOD   is the method for transforming ELEMENT into the KEY   for an entry.\nVALUE-METHOD is the method for transforming ELEMENT into the VALUE for an entry.")
    public static final SubLObject make_hash_table_from_set_alt(SubLObject v_set, SubLObject value_method, SubLObject key_method, SubLObject test) {
        if (value_method == UNPROVIDED) {
            value_method = symbol_function(IDENTITY);
        }
        if (key_method == UNPROVIDED) {
            key_method = symbol_function(IDENTITY);
        }
        if (test == UNPROVIDED) {
            test = set.set_test(v_set);
        }
        SubLTrampolineFile.checkType(v_set, SET_P);
        SubLTrampolineFile.checkType(value_method, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(key_method, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(test, FUNCTION_SPEC_P);
        {
            SubLObject table = make_hash_table(set.set_size(v_set), test, UNPROVIDED);
            SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                        {
                            SubLObject key = funcall(key_method, element);
                            SubLObject value = funcall(value_method, element);
                            sethash(key, table, value);
                        }
                    }
                }
            }
            return table;
        }
    }

    /**
     * Make a new hashtable populated by each ELEMENT in SET.
     * TEST is the test used for the resulting hashtable.
     * KEY-METHOD   is the method for transforming ELEMENT into the KEY   for an entry.
     * VALUE-METHOD is the method for transforming ELEMENT into the VALUE for an entry.
     *
     * @return hash-table-p
     */
    @LispMethod(comment = "Make a new hashtable populated by each ELEMENT in SET.\r\nTEST is the test used for the resulting hashtable.\r\nKEY-METHOD   is the method for transforming ELEMENT into the KEY   for an entry.\r\nVALUE-METHOD is the method for transforming ELEMENT into the VALUE for an entry.\r\n\r\n@return hash-table-p\nMake a new hashtable populated by each ELEMENT in SET.\nTEST is the test used for the resulting hashtable.\nKEY-METHOD   is the method for transforming ELEMENT into the KEY   for an entry.\nVALUE-METHOD is the method for transforming ELEMENT into the VALUE for an entry.")
    public static SubLObject make_hash_table_from_set(final SubLObject v_set, SubLObject value_method, SubLObject key_method, SubLObject test) {
        if (value_method == UNPROVIDED) {
            value_method = symbol_function(IDENTITY);
        }
        if (key_method == UNPROVIDED) {
            key_method = symbol_function(IDENTITY);
        }
        if (test == UNPROVIDED) {
            test = set.set_test(v_set);
        }
        assert NIL != set.set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
        assert NIL != function_spec_p(value_method) : "! function_spec_p(value_method) " + ("Types.function_spec_p(value_method) " + "CommonSymbols.NIL != Types.function_spec_p(value_method) ") + value_method;
        assert NIL != function_spec_p(key_method) : "! function_spec_p(key_method) " + ("Types.function_spec_p(key_method) " + "CommonSymbols.NIL != Types.function_spec_p(key_method) ") + key_method;
        assert NIL != function_spec_p(test) : "! function_spec_p(test) " + ("Types.function_spec_p(test) " + "CommonSymbols.NIL != Types.function_spec_p(test) ") + test;
        final SubLObject table = make_hash_table(set.set_size(v_set), test, UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        SubLObject key;
        SubLObject value;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                key = funcall(key_method, element);
                value = funcall(value_method, element);
                sethash(key, table, value);
            }
        }
        return table;
    }

    public static final SubLObject cfasl_save_problem_store_properties_alt(SubLObject store, SubLObject stream) {
        SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
        {
            SubLObject v_properties = problem_store_properties(store);
            cfasl_output(v_properties, stream);
            return v_properties;
        }
    }

    public static SubLObject cfasl_save_problem_store_properties(final SubLObject store, final SubLObject stream) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        final SubLObject v_properties = inference_datastructures_problem_store.problem_store_properties(store);
        cfasl_output(v_properties, stream);
        return v_properties;
    }

    public static final SubLObject cfasl_load_problem_store_properties_alt(SubLObject stream) {
        {
            SubLObject v_properties = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLTrampolineFile.checkType(v_properties, PROBLEM_STORE_PROPERTIES_P);
            return v_properties;
        }
    }

    public static SubLObject cfasl_load_problem_store_properties(final SubLObject stream) {
        final SubLObject v_properties = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        assert NIL != inference_datastructures_enumerated_types.problem_store_properties_p(v_properties) : "! inference_datastructures_enumerated_types.problem_store_properties_p(v_properties) " + ("inference_datastructures_enumerated_types.problem_store_properties_p(v_properties) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.problem_store_properties_p(v_properties) ") + v_properties;
        return v_properties;
    }

    public static final SubLObject cfasl_save_problem_store_problems_alt(SubLObject store, SubLObject stream) {
        SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
        {
            SubLObject total = problem_store_problem_count(store);
            cfasl_output(total, stream);
            {
                SubLObject idx = problem_store_problem_id_index(store);
                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                        SubLObject problem = NIL;
                        while (NIL != id) {
                            problem = do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
                                com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_store_problem(problem, stream);
                            }
                            id = do_id_index_next_id(idx, T, id, state_var);
                            state_var = do_id_index_next_state(idx, T, id, state_var);
                        } 
                    }
                }
            }
            return total;
        }
    }

    public static SubLObject cfasl_save_problem_store_problems(final SubLObject store, final SubLObject stream) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        final SubLObject total = inference_datastructures_problem_store.problem_store_problem_count(store);
        cfasl_output(total, stream);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$10 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$10, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$10);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    problem = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        cfasl_save_problem_store_problem(problem, stream);
                    }
                }
            }
            final SubLObject idx_$11 = idx;
            if ((NIL == id_index_sparse_objects_empty_p(idx_$11)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                final SubLObject sparse = id_index_sparse_objects(idx_$11);
                SubLObject id2 = id_index_sparse_id_threshold(idx_$11);
                final SubLObject end_id = id_index_next_id(idx_$11);
                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    final SubLObject problem2 = gethash_without_values(id2, sparse, v_default);
                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(problem2))) {
                        cfasl_save_problem_store_problem(problem2, stream);
                    }
                    id2 = add(id2, ONE_INTEGER);
                } 
            }
        }
        return total;
    }

    public static final SubLObject cfasl_load_problem_store_problems_alt(SubLObject store, SubLObject stream) {
        SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
        {
            SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_ps_prepare_for_expected_problem_count(total);
            problem_store_prepare_for_expected_problem_count(store, total);
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(total); i = add(i, ONE_INTEGER)) {
                    com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_store_problem(store, stream);
                }
            }
            return total;
        }
    }

    public static SubLObject cfasl_load_problem_store_problems(final SubLObject store, final SubLObject stream) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        final SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        cfasl_load_ps_prepare_for_expected_problem_count(total);
        inference_datastructures_problem_store.problem_store_prepare_for_expected_problem_count(store, total);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(total); i = add(i, ONE_INTEGER)) {
            cfasl_load_problem_store_problem(store, stream);
        }
        return total;
    }

    public static final SubLObject cfasl_save_problem_store_problem_alt(SubLObject problem, SubLObject stream) {
        {
            SubLObject suid = inference_datastructures_problem.problem_suid(problem);
            SubLObject query = inference_datastructures_problem.problem_query(problem);
            cfasl_output(suid, stream);
            cfasl_output_externalized(query, stream);
            return suid;
        }
    }

    public static SubLObject cfasl_save_problem_store_problem(final SubLObject problem, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject suid = inference_datastructures_problem.problem_suid(problem);
        final SubLObject query = inference_datastructures_problem.problem_query(problem);
        final SubLObject free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(problem);
        cfasl_output(suid, stream);
        cfasl_output_externalized(query, stream);
        if (NIL != $inference_serialization_supports_problem_free_hl_var_optimizationP$.getDynamicValue(thread)) {
            cfasl_output_externalized(free_hl_vars, stream);
        }
        return suid;
    }

    public static final SubLObject cfasl_load_problem_store_problem_alt(SubLObject store, SubLObject stream) {
        {
            SubLObject suid = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject query = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject problem = inference_datastructures_problem.new_problem(store, query);
            com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_ps_note_problem_id(problem, suid);
            return problem;
        }
    }

    public static SubLObject cfasl_load_problem_store_problem(final SubLObject store, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject suid = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject query = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject free_hl_vars = NIL;
        if (NIL != $inference_serialization_supports_problem_free_hl_var_optimizationP$.getDynamicValue(thread)) {
            final SubLObject possible_free_hl_vars_opcode = cfasl_opcode_peek(stream, UNPROVIDED, UNPROVIDED);
            if (possible_free_hl_vars_opcode.eql(TWELVE_INTEGER) || possible_free_hl_vars_opcode.eql(THIRTEEN_INTEGER)) {
                free_hl_vars = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            }
        }
        final SubLObject problem = /* , free_hl_vars */
        inference_datastructures_problem.new_problem(store, query);
        cfasl_load_ps_note_problem_id(problem, suid);
        return problem;
    }

    public static final SubLObject cfasl_save_problem_store_proofs_alt(SubLObject store, SubLObject stream) {
        SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
        {
            SubLObject total = problem_store_proof_count(store);
            cfasl_output(total, stream);
            {
                SubLObject idx = problem_store_proof_id_index(store);
                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                        SubLObject proof = NIL;
                        while (NIL != id) {
                            proof = do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != do_id_index_id_and_object_validP(id, proof, $SKIP)) {
                                com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_store_proof(proof, stream);
                            }
                            id = do_id_index_next_id(idx, T, id, state_var);
                            state_var = do_id_index_next_state(idx, T, id, state_var);
                        } 
                    }
                }
            }
            return total;
        }
    }

    public static SubLObject cfasl_save_problem_store_proofs(final SubLObject store, final SubLObject stream) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        final SubLObject total = inference_datastructures_problem_store.problem_store_proof_count(store);
        cfasl_output(total, stream);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_proof_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$12 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$12, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$12);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject proof;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    proof = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(proof)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(proof)) {
                            proof = $SKIP;
                        }
                        cfasl_save_problem_store_proof(proof, stream);
                    }
                }
            }
            final SubLObject idx_$13 = idx;
            if ((NIL == id_index_sparse_objects_empty_p(idx_$13)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                final SubLObject sparse = id_index_sparse_objects(idx_$13);
                SubLObject id2 = id_index_sparse_id_threshold(idx_$13);
                final SubLObject end_id = id_index_next_id(idx_$13);
                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    final SubLObject proof2 = gethash_without_values(id2, sparse, v_default);
                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(proof2))) {
                        cfasl_save_problem_store_proof(proof2, stream);
                    }
                    id2 = add(id2, ONE_INTEGER);
                } 
            }
        }
        return total;
    }

    public static final SubLObject cfasl_load_problem_store_proofs_alt(SubLObject store, SubLObject stream) {
        SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
        {
            SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_ps_prepare_for_expected_proof_count(total);
            problem_store_prepare_for_expected_proof_count(store, total);
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(total); i = add(i, ONE_INTEGER)) {
                    com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_store_proof(store, stream);
                }
            }
            {
                SubLObject idx = problem_store_problem_id_index(store);
                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                        SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                        SubLObject problem = NIL;
                        while (NIL != id) {
                            problem = do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
                                inference_worker.consider_that_problem_could_be_good(problem);
                            }
                            id = do_id_index_next_id(idx, NIL, id, state_var);
                            state_var = do_id_index_next_state(idx, NIL, id, state_var);
                        } 
                    }
                }
            }
            return total;
        }
    }

    public static SubLObject cfasl_load_problem_store_proofs(final SubLObject store, final SubLObject stream) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        final SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        cfasl_load_ps_prepare_for_expected_proof_count(total);
        inference_datastructures_problem_store.problem_store_prepare_for_expected_proof_count(store, total);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(total); i = add(i, ONE_INTEGER)) {
            cfasl_load_problem_store_proof(store, stream);
        }
        final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$14 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$14, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$14);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject problem;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    problem = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(problem)) {
                            problem = $SKIP;
                        }
                        inference_worker.consider_that_problem_could_be_good(problem);
                    }
                }
            }
            final SubLObject idx_$15 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$15)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$15);
                SubLObject id2 = NIL;
                SubLObject problem2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        problem2 = getEntryValue(cdohash_entry);
                        inference_worker.consider_that_problem_could_be_good(problem2);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return total;
    }

    public static final SubLObject cfasl_save_problem_store_proof_alt(SubLObject proof, SubLObject stream) {
        cfasl_output(inference_datastructures_proof.proof_suid(proof), stream);
        cfasl_output_externalized(inference_datastructures_proof.proof_bindings(proof), stream);
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_link_reference(inference_datastructures_proof.proof_link(proof), stream);
        {
            SubLObject subproofs = inference_datastructures_proof.proof_direct_subproofs(proof);
            cfasl_output(length(subproofs), stream);
            {
                SubLObject cdolist_list_var = subproofs;
                SubLObject subproof = NIL;
                for (subproof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subproof = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_proof_reference(subproof, stream);
                }
            }
        }
        return proof;
    }

    public static SubLObject cfasl_save_problem_store_proof(final SubLObject proof, final SubLObject stream) {
        cfasl_output(inference_datastructures_proof.proof_suid(proof), stream);
        cfasl_output_externalized(inference_datastructures_proof.proof_bindings(proof), stream);
        cfasl_save_problem_link_reference(inference_datastructures_proof.proof_link(proof), stream);
        final SubLObject subproofs = inference_datastructures_proof.proof_direct_subproofs(proof);
        cfasl_output(length(subproofs), stream);
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

    public static final SubLObject cfasl_load_problem_store_proof_alt(SubLObject store, SubLObject stream) {
        {
            SubLObject suid = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject v_bindings = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject link = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_link_reference(store, stream);
            SubLObject subproofs = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_proof_subproofs(store, stream);
            SubLObject proof = inference_datastructures_proof.new_proof_with_bindings(link, v_bindings, subproofs);
            com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_ps_note_proof_id(proof, suid);
            return proof;
        }
    }

    public static SubLObject cfasl_load_problem_store_proof(final SubLObject store, final SubLObject stream) {
        final SubLObject suid = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject v_bindings = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject link = cfasl_load_problem_link_reference(store, stream);
        final SubLObject subproofs = cfasl_load_proof_subproofs(store, stream);
        final SubLObject proof = inference_datastructures_proof.new_proof_with_bindings(link, v_bindings, subproofs);
        cfasl_load_ps_note_proof_id(proof, suid);
        return proof;
    }

    public static final SubLObject cfasl_load_proof_subproofs_alt(SubLObject store, SubLObject stream) {
        {
            SubLObject subproofs = NIL;
            SubLObject cdotimes_end_var = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject subproof = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_proof_reference(store, stream);
                    subproofs = cons(subproof, subproofs);
                }
            }
            return nreverse(subproofs);
        }
    }

    public static SubLObject cfasl_load_proof_subproofs(final SubLObject store, final SubLObject stream) {
        SubLObject subproofs = NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject subproof;
        for (cdotimes_end_var = cfasl_input(stream, UNPROVIDED, UNPROVIDED), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            subproof = cfasl_load_proof_reference(store, stream);
            subproofs = cons(subproof, subproofs);
        }
        return nreverse(subproofs);
    }

    public static final SubLObject cfasl_save_problem_store_problem_links_alt(SubLObject store, SubLObject stream) {
        SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
        {
            SubLObject total = subtract(problem_store_link_count(store), problem_store_answer_link_count(store));
            cfasl_output(total, stream);
            {
                SubLObject idx = problem_store_link_id_index(store);
                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                    {
                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                        SubLObject link = NIL;
                        while (NIL != id) {
                            link = do_id_index_state_object(idx, $SKIP, id, state_var);
                            if (NIL != do_id_index_id_and_object_validP(id, link, $SKIP)) {
                                if (NIL == inference_worker_answer.answer_link_p(link)) {
                                    com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_store_problem_link(link, stream);
                                }
                            }
                            id = do_id_index_next_id(idx, T, id, state_var);
                            state_var = do_id_index_next_state(idx, T, id, state_var);
                        } 
                    }
                }
            }
            return total;
        }
    }

    public static SubLObject cfasl_save_problem_store_problem_links(final SubLObject store, final SubLObject stream) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        final SubLObject total = subtract(inference_datastructures_problem_store.problem_store_link_count(store), inference_datastructures_problem_store.problem_store_answer_link_count(store));
        cfasl_output(total, stream);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_link_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$16 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$16, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$16);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject link;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    link = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(link)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(link)) {
                            link = $SKIP;
                        }
                        if (NIL == inference_worker_answer.answer_link_p(link)) {
                            cfasl_save_problem_store_problem_link(link, stream);
                        }
                    }
                }
            }
            final SubLObject idx_$17 = idx;
            if ((NIL == id_index_sparse_objects_empty_p(idx_$17)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                final SubLObject sparse = id_index_sparse_objects(idx_$17);
                SubLObject id2 = id_index_sparse_id_threshold(idx_$17);
                final SubLObject end_id = id_index_next_id(idx_$17);
                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                while (id2.numL(end_id)) {
                    final SubLObject link2 = gethash_without_values(id2, sparse, v_default);
                    if (((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(link2))) && (NIL == inference_worker_answer.answer_link_p(link2))) {
                        cfasl_save_problem_store_problem_link(link2, stream);
                    }
                    id2 = add(id2, ONE_INTEGER);
                } 
            }
        }
        return total;
    }

    public static final SubLObject cfasl_load_problem_store_problem_links_alt(SubLObject store, SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
            {
                SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_ps_prepare_for_expected_link_count(total);
                problem_store_prepare_for_expected_link_count(store, total);
                {
                    SubLObject _prev_bind_0 = inference_worker.$disable_link_propagationP$.currentBinding(thread);
                    try {
                        inference_worker.$disable_link_propagationP$.bind(T, thread);
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(total); i = add(i, ONE_INTEGER)) {
                                com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_store_problem_link(store, stream);
                            }
                        }
                    } finally {
                        inference_worker.$disable_link_propagationP$.rebind(_prev_bind_0, thread);
                    }
                }
                return total;
            }
        }
    }

    public static SubLObject cfasl_load_problem_store_problem_links(final SubLObject store, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        final SubLObject total = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        cfasl_load_ps_prepare_for_expected_link_count(total);
        inference_datastructures_problem_store.problem_store_prepare_for_expected_link_count(store, total);
        final SubLObject _prev_bind_0 = inference_worker.$disable_link_propagationP$.currentBinding(thread);
        try {
            inference_worker.$disable_link_propagationP$.bind(T, thread);
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(total); i = add(i, ONE_INTEGER)) {
                cfasl_load_problem_store_problem_link(store, stream);
            }
        } finally {
            inference_worker.$disable_link_propagationP$.rebind(_prev_bind_0, thread);
        }
        return total;
    }

    public static final SubLObject cfasl_save_problem_store_problem_link_alt(SubLObject link, SubLObject stream) {
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
        {
            SubLObject suid = inference_datastructures_problem_link.problem_link_suid(link);
            SubLObject type = inference_datastructures_problem_link.problem_link_type(link);
            cfasl_output(suid, stream);
            cfasl_output(type, stream);
            {
                SubLObject pcase_var = type;
                if (pcase_var.eql($REMOVAL)) {
                    com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_removal_link(link, stream);
                } else {
                    if (pcase_var.eql($REWRITE)) {
                        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_rewrite_link(link, stream);
                    } else {
                        if (pcase_var.eql($TRANSFORMATION)) {
                            com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_transformation_link(link, stream);
                        } else {
                            if (pcase_var.eql($RESIDUAL_TRANSFORMATION)) {
                                com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_residual_transformation_link(link, stream);
                            } else {
                                if (pcase_var.eql($RESTRICTION)) {
                                    com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_restriction_link(link, stream);
                                } else {
                                    if (pcase_var.eql($SPLIT)) {
                                        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_split_link(link, stream);
                                    } else {
                                        if (pcase_var.eql($JOIN_ORDERED)) {
                                            com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_join_ordered_link(link, stream);
                                        } else {
                                            if (pcase_var.eql($JOIN)) {
                                                com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_join_link(link, stream);
                                            } else {
                                                if (pcase_var.eql($UNION)) {
                                                    com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_union_link(link, stream);
                                                } else {
                                                    Errors.error($str_alt56$Unexpected_link_type__S, type);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return link;
    }

    public static SubLObject cfasl_save_problem_store_problem_link(final SubLObject link, final SubLObject stream) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "! inference_datastructures_problem_link.problem_link_p(link) " + ("inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) ") + link;
        final SubLObject suid = inference_datastructures_problem_link.problem_link_suid(link);
        final SubLObject type = inference_datastructures_problem_link.problem_link_type(link);
        cfasl_output(suid, stream);
        cfasl_output(type, stream);
        final SubLObject pcase_var = type;
        if (pcase_var.eql($REMOVAL)) {
            cfasl_save_removal_link(link, stream);
        } else
            if (pcase_var.eql($REWRITE)) {
                cfasl_save_rewrite_link(link, stream);
            } else
                if (pcase_var.eql($TRANSFORMATION)) {
                    cfasl_save_transformation_link(link, stream);
                } else
                    if (pcase_var.eql($RESIDUAL_TRANSFORMATION)) {
                        cfasl_save_residual_transformation_link(link, stream);
                    } else
                        if (pcase_var.eql($RESTRICTION)) {
                            cfasl_save_restriction_link(link, stream);
                        } else
                            if (pcase_var.eql($SPLIT)) {
                                cfasl_save_split_link(link, stream);
                            } else
                                if (pcase_var.eql($JOIN_ORDERED)) {
                                    cfasl_save_join_ordered_link(link, stream);
                                } else
                                    if (pcase_var.eql($JOIN)) {
                                        cfasl_save_join_link(link, stream);
                                    } else
                                        if (pcase_var.eql($UNION)) {
                                            cfasl_save_union_link(link, stream);
                                        } else {
                                            Errors.error($str56$Unexpected_link_type__S, type);
                                        }








        return link;
    }

    public static final SubLObject cfasl_load_problem_store_problem_link_alt(SubLObject store, SubLObject stream) {
        SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
        {
            SubLObject suid = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject type = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject link = NIL;
            SubLObject pcase_var = type;
            if (pcase_var.eql($REMOVAL)) {
                link = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_removal_link(store, stream);
            } else {
                if (pcase_var.eql($REWRITE)) {
                    link = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_rewrite_link(store, stream);
                } else {
                    if (pcase_var.eql($TRANSFORMATION)) {
                        link = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_transformation_link(store, stream);
                    } else {
                        if (pcase_var.eql($RESIDUAL_TRANSFORMATION)) {
                            link = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_residual_transformation_link(store, stream);
                        } else {
                            if (pcase_var.eql($RESTRICTION)) {
                                link = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_restriction_link(store, stream);
                            } else {
                                if (pcase_var.eql($SPLIT)) {
                                    link = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_split_link(store, stream);
                                } else {
                                    if (pcase_var.eql($JOIN_ORDERED)) {
                                        link = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_join_ordered_link(store, stream);
                                    } else {
                                        if (pcase_var.eql($JOIN)) {
                                            link = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_join_link(store, stream);
                                        } else {
                                            if (pcase_var.eql($UNION)) {
                                                link = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_union_link(store, stream);
                                            } else {
                                                Errors.error($str_alt56$Unexpected_link_type__S, type);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_ps_note_link_id(link, suid);
            return link;
        }
    }

    public static SubLObject cfasl_load_problem_store_problem_link(final SubLObject store, final SubLObject stream) {
        assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) " + ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
        final SubLObject suid = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject type = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject link = NIL;
        final SubLObject pcase_var = type;
        if (pcase_var.eql($REMOVAL)) {
            link = cfasl_load_removal_link(store, stream);
        } else
            if (pcase_var.eql($REWRITE)) {
                link = cfasl_load_rewrite_link(store, stream);
            } else
                if (pcase_var.eql($TRANSFORMATION)) {
                    link = cfasl_load_transformation_link(store, stream);
                } else
                    if (pcase_var.eql($RESIDUAL_TRANSFORMATION)) {
                        link = cfasl_load_residual_transformation_link(store, stream);
                    } else
                        if (pcase_var.eql($RESTRICTION)) {
                            link = cfasl_load_restriction_link(store, stream);
                        } else
                            if (pcase_var.eql($SPLIT)) {
                                link = cfasl_load_split_link(store, stream);
                            } else
                                if (pcase_var.eql($JOIN_ORDERED)) {
                                    link = cfasl_load_join_ordered_link(store, stream);
                                } else
                                    if (pcase_var.eql($JOIN)) {
                                        link = cfasl_load_join_link(store, stream);
                                    } else
                                        if (pcase_var.eql($UNION)) {
                                            link = cfasl_load_union_link(store, stream);
                                        } else {
                                            Errors.error($str56$Unexpected_link_type__S, type);
                                        }








        cfasl_load_ps_note_link_id(link, suid);
        return link;
    }

    public static final SubLObject cfasl_save_removal_link_alt(SubLObject removal_link, SubLObject stream) {
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(removal_link), stream);
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_hl_module_reference(inference_worker_removal.removal_link_hl_module(removal_link), stream);
        cfasl_output_externalized(inference_worker_removal.removal_link_bindings(removal_link), stream);
        cfasl_output_externalized(inference_worker_removal.removal_link_supports(removal_link), stream);
        return removal_link;
    }

    public static SubLObject cfasl_save_removal_link(final SubLObject removal_link, final SubLObject stream) {
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(removal_link), stream);
        cfasl_save_hl_module_reference(inference_worker_removal.removal_link_hl_module(removal_link), stream);
        cfasl_output_externalized(inference_worker_removal.removal_link_bindings(removal_link), stream);
        cfasl_output_externalized(inference_worker_removal.removal_link_supports(removal_link), stream);
        return removal_link;
    }

    public static final SubLObject cfasl_load_removal_link_alt(SubLObject store, SubLObject stream) {
        {
            SubLObject problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_reference(store, stream);
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_hl_module_reference(stream);
            SubLObject removal_bindings = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject supports = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject removal_link = inference_worker_removal.new_removal_link(problem, hl_module, removal_bindings, supports);
            return removal_link;
        }
    }

    public static SubLObject cfasl_load_removal_link(final SubLObject store, final SubLObject stream) {
        final SubLObject problem = cfasl_load_problem_reference(store, stream);
        final SubLObject hl_module = cfasl_load_hl_module_reference(stream);
        final SubLObject removal_bindings = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject supports = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject removal_link = inference_worker_removal.new_removal_link(problem, hl_module, removal_bindings, supports);
        return removal_link;
    }

    public static final SubLObject cfasl_save_rewrite_link_alt(SubLObject rewrite_link, SubLObject stream) {
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link), stream);
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_mapped_problem_reference(inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(rewrite_link), stream);
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_hl_module_reference(inference_worker_rewrite.rewrite_link_hl_module(rewrite_link), stream);
        cfasl_output_externalized(inference_worker_rewrite.rewrite_link_supports(rewrite_link), stream);
        return rewrite_link;
    }

    public static SubLObject cfasl_save_rewrite_link(final SubLObject rewrite_link, final SubLObject stream) {
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(rewrite_link), stream);
        cfasl_save_mapped_problem_reference(inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(rewrite_link), stream);
        cfasl_save_hl_module_reference(inference_worker_rewrite.rewrite_link_hl_module(rewrite_link), stream);
        cfasl_output_externalized(inference_worker_rewrite.rewrite_link_supports(rewrite_link), stream);
        return rewrite_link;
    }

    public static final SubLObject cfasl_load_rewrite_link_alt(SubLObject store, SubLObject stream) {
        {
            SubLObject supported_problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_reference(store, stream);
            SubLObject supporting_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_mapped_problem_reference(store, stream);
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_hl_module_reference(stream);
            SubLObject supports = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject rewrite_link = inference_worker_rewrite.new_rewrite_link(supported_problem, supporting_mapped_problem, hl_module, supports);
            return rewrite_link;
        }
    }

    public static SubLObject cfasl_load_rewrite_link(final SubLObject store, final SubLObject stream) {
        final SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        final SubLObject supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        final SubLObject hl_module = cfasl_load_hl_module_reference(stream);
        final SubLObject supports = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject rewrite_link = inference_worker_rewrite.new_rewrite_link(supported_problem, supporting_mapped_problem, hl_module, supports);
        return rewrite_link;
    }

    public static final SubLObject cfasl_save_transformation_link_alt(SubLObject t_link, SubLObject stream) {
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(t_link), stream);
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_optional_mapped_problem_reference(inference_worker_transformation.transformation_link_supporting_mapped_problem(t_link), stream);
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_hl_module_reference(inference_worker_transformation.transformation_link_hl_module(t_link), stream);
        cfasl_output_externalized(inference_worker_transformation.transformation_link_bindings(t_link), stream);
        cfasl_output_externalized(inference_worker_transformation.transformation_link_rule_assertion(t_link), stream);
        cfasl_output_externalized(inference_worker_transformation.transformation_link_supports(t_link), stream);
        cfasl_output_externalized(inference_worker_transformation.transformation_link_non_explanatory_subquery(t_link), stream);
        return t_link;
    }

    public static SubLObject cfasl_save_transformation_link(final SubLObject t_link, final SubLObject stream) {
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(t_link), stream);
        cfasl_save_optional_mapped_problem_reference(inference_worker_transformation.transformation_link_supporting_mapped_problem(t_link), stream);
        cfasl_save_hl_module_reference(inference_worker_transformation.transformation_link_hl_module(t_link), stream);
        cfasl_output_externalized(inference_worker_transformation.transformation_link_bindings(t_link), stream);
        cfasl_output_externalized(inference_worker_transformation.transformation_link_rule_assertion(t_link), stream);
        cfasl_output_externalized(inference_worker_transformation.transformation_link_more_supports(t_link), stream);
        cfasl_output_externalized(inference_worker_transformation.transformation_link_non_explanatory_subquery(t_link), stream);
        return t_link;
    }

    public static final SubLObject cfasl_load_transformation_link_alt(SubLObject store, SubLObject stream) {
        {
            SubLObject supported_problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_reference(store, stream);
            SubLObject supporting_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_mapped_problem_reference(store, stream);
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_hl_module_reference(stream);
            SubLObject transformation_bindings = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject rule_assertion = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject more_supports = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject non_explanatory_subquery = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject transformation_link = inference_worker_transformation.new_transformation_link(supported_problem, supporting_mapped_problem, hl_module, transformation_bindings, rule_assertion, more_supports, non_explanatory_subquery);
            return transformation_link;
        }
    }

    public static SubLObject cfasl_load_transformation_link(final SubLObject store, final SubLObject stream) {
        final SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        final SubLObject supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        final SubLObject hl_module = cfasl_load_hl_module_reference(stream);
        final SubLObject transformation_bindings = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject rule_assertion = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject more_supports = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject non_explanatory_subquery = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject transformation_link = inference_worker_transformation.new_transformation_link(supported_problem, supporting_mapped_problem, hl_module, transformation_bindings, rule_assertion, more_supports, non_explanatory_subquery);
        return transformation_link;
    }

    public static final SubLObject cfasl_save_residual_transformation_link_alt(SubLObject rt_link, SubLObject stream) {
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_link_reference(inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link), stream);
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_link_reference(inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link), stream);
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_mapped_problem_reference(inference_worker_residual_transformation.residual_transformation_link_supporting_mapped_problem(rt_link), stream);
        cfasl_output(inference_worker_residual_transformation.residual_transformation_link_conjunctive_problem_dont_care_variable_map(rt_link), stream);
        cfasl_output(inference_worker_residual_transformation.residual_transformation_link_residual_conjunction_literal_map(rt_link), stream);
        return rt_link;
    }

    public static SubLObject cfasl_save_residual_transformation_link(final SubLObject rt_link, final SubLObject stream) {
        cfasl_save_problem_link_reference(inference_worker_residual_transformation.residual_transformation_link_motivating_join_ordered_link(rt_link), stream);
        cfasl_save_problem_link_reference(inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(rt_link), stream);
        cfasl_save_mapped_problem_reference(inference_worker_residual_transformation.residual_transformation_link_supporting_mapped_problem(rt_link), stream);
        cfasl_output(inference_worker_residual_transformation.residual_transformation_link_conjunctive_problem_dont_care_variable_map(rt_link), stream);
        cfasl_output(inference_worker_residual_transformation.residual_transformation_link_residual_conjunction_literal_map(rt_link), stream);
        return rt_link;
    }

    public static final SubLObject cfasl_load_residual_transformation_link_alt(SubLObject store, SubLObject stream) {
        {
            SubLObject join_ordered_link = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_link_reference(store, stream);
            SubLObject transformation_link = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_link_reference(store, stream);
            SubLObject supporting_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_mapped_problem_reference(store, stream);
            SubLObject conjunctive_problem_dont_care_variable_map = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject residual_conjunction_literal_map = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject residual_transformation_link = inference_worker_residual_transformation.new_residual_transformation_link(supporting_mapped_problem, join_ordered_link, transformation_link, conjunctive_problem_dont_care_variable_map, residual_conjunction_literal_map);
            return residual_transformation_link;
        }
    }

    public static SubLObject cfasl_load_residual_transformation_link(final SubLObject store, final SubLObject stream) {
        final SubLObject join_ordered_link = cfasl_load_problem_link_reference(store, stream);
        final SubLObject transformation_link = cfasl_load_problem_link_reference(store, stream);
        final SubLObject supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        final SubLObject conjunctive_problem_dont_care_variable_map = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject residual_conjunction_literal_map = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject residual_transformation_link = inference_worker_residual_transformation.new_residual_transformation_link(supporting_mapped_problem, join_ordered_link, transformation_link, conjunctive_problem_dont_care_variable_map, residual_conjunction_literal_map);
        return residual_transformation_link;
    }

    public static final SubLObject cfasl_save_restriction_link_alt(SubLObject restriction_link, SubLObject stream) {
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(restriction_link), stream);
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_mapped_problem_reference(inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(restriction_link), stream);
        cfasl_output_externalized(inference_worker_restriction.restriction_link_bindings(restriction_link), stream);
        cfasl_output(inference_worker_restriction.restriction_listening_link_p(restriction_link), stream);
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_optional_hl_module_reference(inference_worker_restriction.restriction_link_hl_module(restriction_link), stream);
        return restriction_link;
    }

    public static SubLObject cfasl_save_restriction_link(final SubLObject restriction_link, final SubLObject stream) {
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(restriction_link), stream);
        cfasl_save_mapped_problem_reference(inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(restriction_link), stream);
        cfasl_output_externalized(inference_worker_restriction.restriction_link_bindings(restriction_link), stream);
        cfasl_output(inference_worker_restriction.restriction_listening_link_p(restriction_link), stream);
        cfasl_save_optional_hl_module_reference(inference_worker_restriction.restriction_link_hl_module(restriction_link), stream);
        return restriction_link;
    }

    public static final SubLObject cfasl_load_restriction_link_alt(SubLObject store, SubLObject stream) {
        {
            SubLObject supported_problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_reference(store, stream);
            SubLObject supporting_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_mapped_problem_reference(store, stream);
            SubLObject restriction_bindings = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject listening_linkP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject hl_module = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_optional_hl_module_reference(stream);
            SubLObject restriction_link = inference_worker_restriction.new_restriction_link(supported_problem, supporting_mapped_problem, restriction_bindings, listening_linkP, hl_module);
            return restriction_link;
        }
    }

    public static SubLObject cfasl_load_restriction_link(final SubLObject store, final SubLObject stream) {
        final SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        final SubLObject supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        final SubLObject restriction_bindings = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject listening_linkP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject hl_module = cfasl_load_optional_hl_module_reference(stream);
        final SubLObject restriction_link = inference_worker_restriction.new_restriction_link(supported_problem, supporting_mapped_problem, restriction_bindings, listening_linkP, hl_module);
        return restriction_link;
    }

    public static final SubLObject cfasl_save_split_link_alt(SubLObject split_link, SubLObject stream) {
        SubLTrampolineFile.checkType(split_link, SPLIT_LINK_P);
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(split_link), stream);
        {
            SubLObject mapped_problems = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
            cfasl_output(length(mapped_problems), stream);
            {
                SubLObject cdolist_list_var = reverse(mapped_problems);
                SubLObject mapped_problem = NIL;
                for (mapped_problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mapped_problem = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_mapped_problem_reference(mapped_problem, stream);
                }
            }
        }
        return split_link;
    }

    public static SubLObject cfasl_save_split_link(final SubLObject split_link, final SubLObject stream) {
        assert NIL != inference_worker_split.split_link_p(split_link) : "! inference_worker_split.split_link_p(split_link) " + ("inference_worker_split.split_link_p(split_link) " + "CommonSymbols.NIL != inference_worker_split.split_link_p(split_link) ") + split_link;
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(split_link), stream);
        final SubLObject mapped_problems = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(split_link);
        cfasl_output(length(mapped_problems), stream);
        SubLObject cdolist_list_var = reverse(mapped_problems);
        SubLObject mapped_problem = NIL;
        mapped_problem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cfasl_save_mapped_problem_reference(mapped_problem, stream);
            cdolist_list_var = cdolist_list_var.rest();
            mapped_problem = cdolist_list_var.first();
        } 
        return split_link;
    }

    public static final SubLObject cfasl_load_split_link_alt(SubLObject store, SubLObject stream) {
        {
            SubLObject supported_problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_reference(store, stream);
            SubLObject supporting_mapped_problems = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_split_link_conjuncts(store, stream);
            SubLObject split_link = new_split_link(supported_problem, supporting_mapped_problems);
            return split_link;
        }
    }

    public static SubLObject cfasl_load_split_link(final SubLObject store, final SubLObject stream) {
        final SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        final SubLObject supporting_mapped_problems = cfasl_load_split_link_conjuncts(store, stream);
        final SubLObject split_link = inference_worker_split.new_split_link(supported_problem, supporting_mapped_problems);
        return split_link;
    }

    public static final SubLObject cfasl_load_split_link_conjuncts_alt(SubLObject store, SubLObject stream) {
        {
            SubLObject supporting_problem_count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject supporting_mapped_problems = NIL;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(supporting_problem_count); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject supporting_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_mapped_problem_reference(store, stream);
                    supporting_mapped_problems = cons(supporting_mapped_problem, supporting_mapped_problems);
                }
            }
            return nreverse(supporting_mapped_problems);
        }
    }

    public static SubLObject cfasl_load_split_link_conjuncts(final SubLObject store, final SubLObject stream) {
        final SubLObject supporting_problem_count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject supporting_mapped_problems = NIL;
        SubLObject i;
        SubLObject supporting_mapped_problem;
        for (i = NIL, i = ZERO_INTEGER; i.numL(supporting_problem_count); i = add(i, ONE_INTEGER)) {
            supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
            supporting_mapped_problems = cons(supporting_mapped_problem, supporting_mapped_problems);
        }
        return nreverse(supporting_mapped_problems);
    }

    public static final SubLObject cfasl_save_join_ordered_link_alt(SubLObject jo_link, SubLObject stream) {
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(jo_link), stream);
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_mapped_problem_reference(inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link), stream);
        if (NIL != inference_worker_join_ordered.join_ordered_link_has_non_focal_mapped_problemP(jo_link)) {
            com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_mapped_problem_reference(inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(jo_link), stream);
        } else {
            cfasl_output(NIL, stream);
        }
        return jo_link;
    }

    public static SubLObject cfasl_save_join_ordered_link(final SubLObject jo_link, final SubLObject stream) {
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(jo_link), stream);
        cfasl_save_mapped_problem_reference(inference_worker_join_ordered.join_ordered_link_focal_mapped_problem(jo_link), stream);
        if (NIL != inference_worker_join_ordered.join_ordered_link_has_non_focal_mapped_problemP(jo_link)) {
            cfasl_save_mapped_problem_reference(inference_worker_join_ordered.join_ordered_link_non_focal_mapped_problem(jo_link), stream);
        } else {
            cfasl_output(NIL, stream);
        }
        return jo_link;
    }

    public static final SubLObject cfasl_load_join_ordered_link_alt(SubLObject store, SubLObject stream) {
        {
            SubLObject supported_problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_reference(store, stream);
            SubLObject focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_mapped_problem_reference(store, stream);
            SubLObject non_focal_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_optional_mapped_problem_reference(store, stream);
            SubLObject join_ordered_link = inference_worker_join_ordered.new_join_ordered_link(supported_problem, focal_mapped_problem, non_focal_mapped_problem);
            return join_ordered_link;
        }
    }

    public static SubLObject cfasl_load_join_ordered_link(final SubLObject store, final SubLObject stream) {
        final SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        final SubLObject focal_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        final SubLObject non_focal_mapped_problem = cfasl_load_optional_mapped_problem_reference(store, stream);
        final SubLObject join_ordered_link = inference_worker_join_ordered.new_join_ordered_link(supported_problem, focal_mapped_problem, non_focal_mapped_problem);
        return join_ordered_link;
    }

    public static final SubLObject cfasl_save_join_link_alt(SubLObject join_link, SubLObject stream) {
        SubLTrampolineFile.checkType(join_link, JOIN_LINK_P);
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(join_link), stream);
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_mapped_problem_reference(inference_worker_join.join_link_first_mapped_problem(join_link), stream);
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_mapped_problem_reference(inference_worker_join.join_link_second_mapped_problem(join_link), stream);
        return join_link;
    }

    public static SubLObject cfasl_save_join_link(final SubLObject join_link, final SubLObject stream) {
        assert NIL != inference_worker_join.join_link_p(join_link) : "! inference_worker_join.join_link_p(join_link) " + ("inference_worker_join.join_link_p(join_link) " + "CommonSymbols.NIL != inference_worker_join.join_link_p(join_link) ") + join_link;
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(join_link), stream);
        cfasl_save_mapped_problem_reference(inference_worker_join.join_link_first_mapped_problem(join_link), stream);
        cfasl_save_mapped_problem_reference(inference_worker_join.join_link_second_mapped_problem(join_link), stream);
        return join_link;
    }

    public static final SubLObject cfasl_load_join_link_alt(SubLObject store, SubLObject stream) {
        {
            SubLObject supported_problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_reference(store, stream);
            SubLObject first_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_mapped_problem_reference(store, stream);
            SubLObject second_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_mapped_problem_reference(store, stream);
            SubLObject join_link = inference_worker_join.new_join_link(supported_problem, first_mapped_problem, second_mapped_problem);
            return join_link;
        }
    }

    public static SubLObject cfasl_load_join_link(final SubLObject store, final SubLObject stream) {
        final SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        final SubLObject first_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        final SubLObject second_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        final SubLObject join_link = inference_worker_join.new_join_link(supported_problem, first_mapped_problem, second_mapped_problem);
        return join_link;
    }

    public static final SubLObject cfasl_save_union_link_alt(SubLObject union_link, SubLObject stream) {
        SubLTrampolineFile.checkType(union_link, UNION_LINK_P);
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(union_link), stream);
        com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_mapped_problem_reference(inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(union_link), stream);
        return union_link;
    }

    public static SubLObject cfasl_save_union_link(final SubLObject union_link, final SubLObject stream) {
        assert NIL != inference_worker_union.union_link_p(union_link) : "! inference_worker_union.union_link_p(union_link) " + ("inference_worker_union.union_link_p(union_link) " + "CommonSymbols.NIL != inference_worker_union.union_link_p(union_link) ") + union_link;
        cfasl_save_problem_reference(inference_datastructures_problem_link.problem_link_supported_problem(union_link), stream);
        cfasl_save_mapped_problem_reference(inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem(union_link), stream);
        return union_link;
    }

    public static final SubLObject cfasl_load_union_link_alt(SubLObject store, SubLObject stream) {
        {
            SubLObject supported_problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_problem_reference(store, stream);
            SubLObject supporting_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_mapped_problem_reference(store, stream);
            SubLObject union_link = new_union_link(supported_problem, supporting_mapped_problem);
            return union_link;
        }
    }

    public static SubLObject cfasl_load_union_link(final SubLObject store, final SubLObject stream) {
        final SubLObject supported_problem = cfasl_load_problem_reference(store, stream);
        final SubLObject supporting_mapped_problem = cfasl_load_mapped_problem_reference(store, stream);
        final SubLObject union_link = inference_worker_union.new_union_link(supported_problem, supporting_mapped_problem);
        return union_link;
    }

    public static final SubLObject cfasl_save_problem_reference_alt(SubLObject problem, SubLObject stream) {
        SubLTrampolineFile.checkType(problem, PROBLEM_P);
        return cfasl_output(inference_datastructures_problem.problem_suid(problem), stream);
    }

    public static SubLObject cfasl_save_problem_reference(final SubLObject problem, final SubLObject stream) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
        return cfasl_output(inference_datastructures_problem.problem_suid(problem), stream);
    }

    public static final SubLObject cfasl_load_problem_reference_alt(SubLObject store, SubLObject stream) {
        return com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_ps_lookup_problem(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject cfasl_load_problem_reference(final SubLObject store, final SubLObject stream) {
        return cfasl_load_ps_lookup_problem(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cfasl_save_mapped_problem_reference_alt(SubLObject mapped_problem, SubLObject stream) {
        return com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_mapped_problem_reference_int(mapped_problem, stream, T);
    }

    public static SubLObject cfasl_save_mapped_problem_reference(final SubLObject mapped_problem, final SubLObject stream) {
        return cfasl_save_mapped_problem_reference_int(mapped_problem, stream, T);
    }

    public static final SubLObject cfasl_load_mapped_problem_reference_alt(SubLObject store, SubLObject stream) {
        return com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_mapped_problem_reference_int(store, stream, T);
    }

    public static SubLObject cfasl_load_mapped_problem_reference(final SubLObject store, final SubLObject stream) {
        return cfasl_load_mapped_problem_reference_int(store, stream, T);
    }

    public static final SubLObject cfasl_save_optional_mapped_problem_reference_alt(SubLObject mapped_problem, SubLObject stream) {
        return com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_mapped_problem_reference_int(mapped_problem, stream, NIL);
    }

    public static SubLObject cfasl_save_optional_mapped_problem_reference(final SubLObject mapped_problem, final SubLObject stream) {
        return cfasl_save_mapped_problem_reference_int(mapped_problem, stream, NIL);
    }

    public static final SubLObject cfasl_load_optional_mapped_problem_reference_alt(SubLObject store, SubLObject stream) {
        return com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_mapped_problem_reference_int(store, stream, NIL);
    }

    public static SubLObject cfasl_load_optional_mapped_problem_reference(final SubLObject store, final SubLObject stream) {
        return cfasl_load_mapped_problem_reference_int(store, stream, NIL);
    }

    public static final SubLObject cfasl_save_mapped_problem_reference_int_alt(SubLObject mapped_problem, SubLObject stream, SubLObject requiredP) {
        if ((NIL == mapped_problem) && (NIL == requiredP)) {
            return cfasl_output(NIL, stream);
        }
        SubLTrampolineFile.checkType(mapped_problem, MAPPED_PROBLEM_P);
        {
            SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
            SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
            SubLObject suid = inference_datastructures_problem.problem_suid(problem);
            cfasl_output(suid, stream);
            cfasl_output_externalized(variable_map, stream);
            return suid;
        }
    }

    public static SubLObject cfasl_save_mapped_problem_reference_int(final SubLObject mapped_problem, final SubLObject stream, final SubLObject requiredP) {
        if ((NIL == mapped_problem) && (NIL == requiredP)) {
            return cfasl_output(NIL, stream);
        }
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(mapped_problem) : "! inference_datastructures_problem_link.mapped_problem_p(mapped_problem) " + ("inference_datastructures_problem_link.mapped_problem_p(mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(mapped_problem) ") + mapped_problem;
        final SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem(mapped_problem);
        final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(mapped_problem);
        final SubLObject suid = inference_datastructures_problem.problem_suid(problem);
        cfasl_output(suid, stream);
        cfasl_output_externalized(variable_map, stream);
        return suid;
    }

    static private final SubLString $str_alt4$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt6$Time_to_implement_XML_problem_sto = makeString("Time to implement XML problem-store output serialization.");

    static private final SubLString $str_alt7$Unexpected_protocol__S = makeString("Unexpected protocol ~S");

    static private final SubLString $str_alt9$Time_to_implement_XML_problem_sto = makeString("Time to implement XML problem-store input serialization.");

    static private final SubLString $str_alt10$1_0 = makeString("1.0");

    public static final SubLObject cfasl_load_mapped_problem_reference_int_alt(SubLObject store, SubLObject stream, SubLObject requiredP) {
        {
            SubLObject suid = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            if (!((NIL == suid) && (NIL == requiredP))) {
                {
                    SubLObject variable_map = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject problem = com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_ps_lookup_problem(suid);
                    SubLObject mapped_problem = inference_datastructures_problem_link.new_mapped_problem(problem, variable_map);
                    return mapped_problem;
                }
            }
        }
        return NIL;
    }

    public static SubLObject cfasl_load_mapped_problem_reference_int(final SubLObject store, final SubLObject stream, final SubLObject requiredP) {
        final SubLObject suid = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if ((NIL != suid) || (NIL != requiredP)) {
            final SubLObject variable_map = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject problem = cfasl_load_ps_lookup_problem(suid);
            final SubLObject mapped_problem = inference_datastructures_problem_link.new_mapped_problem(problem, variable_map);
            return mapped_problem;
        }
        return NIL;
    }

    static private final SubLString $str_alt12$Unsupported_serialization_version = makeString("Unsupported serialization version ~A");

    static private final SubLList $list_alt14 = list(list(makeSymbol("*CFASL-LOAD-PS-PROBLEM-TABLE*"), makeKeyword("UNINITIALIZED")), list(makeSymbol("*CFASL-LOAD-PS-LINK-TABLE*"), makeKeyword("UNINITIALIZED")), list(makeSymbol("*CFASL-LOAD-PS-PROOF-TABLE*"), makeKeyword("UNINITIALIZED")));

    public static final SubLObject cfasl_save_problem_link_reference_alt(SubLObject link, SubLObject stream) {
        SubLTrampolineFile.checkType(link, PROBLEM_LINK_P);
        return cfasl_output(inference_datastructures_problem_link.problem_link_suid(link), stream);
    }

    public static SubLObject cfasl_save_problem_link_reference(final SubLObject link, final SubLObject stream) {
        assert NIL != inference_datastructures_problem_link.problem_link_p(link) : "! inference_datastructures_problem_link.problem_link_p(link) " + ("inference_datastructures_problem_link.problem_link_p(link) " + "CommonSymbols.NIL != inference_datastructures_problem_link.problem_link_p(link) ") + link;
        return cfasl_output(inference_datastructures_problem_link.problem_link_suid(link), stream);
    }

    public static final SubLObject cfasl_load_problem_link_reference_alt(SubLObject store, SubLObject stream) {
        return com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_ps_lookup_link(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject cfasl_load_problem_link_reference(final SubLObject store, final SubLObject stream) {
        return cfasl_load_ps_lookup_link(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cfasl_save_proof_reference_alt(SubLObject proof, SubLObject stream) {
        SubLTrampolineFile.checkType(proof, PROOF_P);
        return cfasl_output(inference_datastructures_proof.proof_suid(proof), stream);
    }

    public static SubLObject cfasl_save_proof_reference(final SubLObject proof, final SubLObject stream) {
        assert NIL != inference_datastructures_proof.proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) ") + proof;
        return cfasl_output(inference_datastructures_proof.proof_suid(proof), stream);
    }

    static private final SubLList $list_alt26 = list(makeSymbol("CONSTANT-TABLE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject cfasl_load_proof_reference_alt(SubLObject store, SubLObject stream) {
        return com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_ps_lookup_proof(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject cfasl_load_proof_reference(final SubLObject store, final SubLObject stream) {
        return cfasl_load_ps_lookup_proof(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    }

    static private final SubLList $list_alt28 = list(list(makeSymbol("*CFASL-CONSTANT-HANDLE-LOOKUP-FUNC*"), list(QUOTE, makeSymbol("CFASL-LOAD-PS-LOOKUP-CONSTANT"))), list(makeSymbol("*CFASL-INPUT-GUID-STRING-RESOURCE*"), list(makeSymbol("GUID-TO-STRING"), list(makeSymbol("NEW-GUID")))));

    public static final SubLObject cfasl_save_hl_module_reference_alt(SubLObject hl_module, SubLObject stream) {
        return com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_hl_module_reference_int(hl_module, stream, T);
    }

    public static SubLObject cfasl_save_hl_module_reference(final SubLObject hl_module, final SubLObject stream) {
        return cfasl_save_hl_module_reference_int(hl_module, stream, T);
    }

    public static final SubLObject cfasl_load_hl_module_reference_alt(SubLObject stream) {
        return com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_hl_module_reference_int(stream, T);
    }

    public static SubLObject cfasl_load_hl_module_reference(final SubLObject stream) {
        return cfasl_load_hl_module_reference_int(stream, T);
    }

    public static final SubLObject cfasl_save_optional_hl_module_reference_alt(SubLObject hl_module, SubLObject stream) {
        return com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_save_hl_module_reference_int(hl_module, stream, NIL);
    }

    public static SubLObject cfasl_save_optional_hl_module_reference(final SubLObject hl_module, final SubLObject stream) {
        return cfasl_save_hl_module_reference_int(hl_module, stream, NIL);
    }

    static private final SubLString $str_alt31$Unable_to_lookup_a_constant_from_ = makeString("Unable to lookup a constant from ~S");

    public static final SubLObject cfasl_load_optional_hl_module_reference_alt(SubLObject stream) {
        return com.cyc.cycjava.cycl.inference.harness.inference_serialization.cfasl_load_hl_module_reference_int(stream, NIL);
    }

    public static SubLObject cfasl_load_optional_hl_module_reference(final SubLObject stream) {
        return cfasl_load_hl_module_reference_int(stream, NIL);
    }

    static private final SubLString $str_alt36$Unexpected_section__S = makeString("Unexpected section ~S");

    public static final SubLObject cfasl_save_hl_module_reference_int_alt(SubLObject hl_module, SubLObject stream, SubLObject requiredP) {
        if ((NIL == hl_module) && (NIL == requiredP)) {
            return cfasl_output(NIL, stream);
        }
        SubLTrampolineFile.checkType(hl_module, HL_MODULE_P);
        {
            SubLObject name = inference_modules.hl_module_name(hl_module);
            cfasl_output(name, stream);
            return name;
        }
    }

    public static SubLObject cfasl_save_hl_module_reference_int(final SubLObject hl_module, final SubLObject stream, final SubLObject requiredP) {
        if ((NIL == hl_module) && (NIL == requiredP)) {
            return cfasl_output(NIL, stream);
        }
        assert NIL != inference_modules.hl_module_p(hl_module) : "! inference_modules.hl_module_p(hl_module) " + ("inference_modules.hl_module_p(hl_module) " + "CommonSymbols.NIL != inference_modules.hl_module_p(hl_module) ") + hl_module;
        final SubLObject name = inference_modules.hl_module_name(hl_module);
        cfasl_output(name, stream);
        return name;
    }

    static private final SubLString $str_alt56$Unexpected_link_type__S = makeString("Unexpected link type ~S");

    public static final SubLObject cfasl_load_hl_module_reference_int_alt(SubLObject stream, SubLObject requiredP) {
        {
            SubLObject name = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            if (!((NIL == name) && (NIL == requiredP))) {
                {
                    SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
                    return hl_module;
                }
            }
        }
        return NIL;
    }

    public static SubLObject cfasl_load_hl_module_reference_int(final SubLObject stream, final SubLObject requiredP) {
        final SubLObject name = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if ((NIL == name) && (NIL == requiredP)) {
            return NIL;
        }
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != hl_module) {
            return hl_module;
        }
        return inference_modules.cfasl_create_invalid_hl_module(name);
    }

    public static SubLObject cfasl_unsupported_type_error(final SubLObject type) {
        return Errors.error($str64$CFASL_does_not_support_objects_of, type);
    }

    public static SubLObject cfasl_output_object_problem_store_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error(type_of(v_object));
    }

    public static SubLObject cfasl_output_object_problem_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error(type_of(v_object));
    }

    public static SubLObject cfasl_output_object_tactic_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error(type_of(v_object));
    }

    public static SubLObject cfasl_output_object_problem_link_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error(type_of(v_object));
    }

    public static SubLObject cfasl_output_object_proof_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error(type_of(v_object));
    }

    public static SubLObject cfasl_output_object_strategy_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error(type_of(v_object));
    }

    public static SubLObject cfasl_output_object_inference_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error(type_of(v_object));
    }

    public static SubLObject cfasl_output_object_inference_answer_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error(type_of(v_object));
    }

    public static SubLObject cfasl_output_object_inference_answer_justification_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_unsupported_type_error(type_of(v_object));
    }

    public static final SubLObject declare_inference_serialization_file_alt() {
        declareFunction("save_problem_store", "SAVE-PROBLEM-STORE", 2, 1, false);
        declareFunction("load_problem_store", "LOAD-PROBLEM-STORE", 1, 1, false);
        declareFunction("cfasl_save_problem_store", "CFASL-SAVE-PROBLEM-STORE", 2, 0, false);
        declareFunction("cfasl_load_problem_store", "CFASL-LOAD-PROBLEM-STORE", 1, 0, false);
        declareMacro("with_clean_cfasl_load_ps_ids", "WITH-CLEAN-CFASL-LOAD-PS-IDS");
        declareFunction("cfasl_load_ps_prepare_for_expected_problem_count", "CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-PROBLEM-COUNT", 1, 0, false);
        declareFunction("cfasl_load_ps_prepare_for_expected_link_count", "CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-LINK-COUNT", 1, 0, false);
        declareFunction("cfasl_load_ps_prepare_for_expected_proof_count", "CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-PROOF-COUNT", 1, 0, false);
        declareFunction("cfasl_load_ps_note_problem_id", "CFASL-LOAD-PS-NOTE-PROBLEM-ID", 2, 0, false);
        declareFunction("cfasl_load_ps_lookup_problem", "CFASL-LOAD-PS-LOOKUP-PROBLEM", 1, 0, false);
        declareFunction("cfasl_load_ps_note_link_id", "CFASL-LOAD-PS-NOTE-LINK-ID", 2, 0, false);
        declareFunction("cfasl_load_ps_lookup_link", "CFASL-LOAD-PS-LOOKUP-LINK", 1, 0, false);
        declareFunction("cfasl_load_ps_note_proof_id", "CFASL-LOAD-PS-NOTE-PROOF-ID", 2, 0, false);
        declareFunction("cfasl_load_ps_lookup_proof", "CFASL-LOAD-PS-LOOKUP-PROOF", 1, 0, false);
        declareMacro("with_cfasl_load_ps_constant_table", "WITH-CFASL-LOAD-PS-CONSTANT-TABLE");
        declareFunction("cfasl_load_ps_lookup_constant", "CFASL-LOAD-PS-LOOKUP-CONSTANT", 1, 0, false);
        declareFunction("cfasl_save_problem_store_1_0", "CFASL-SAVE-PROBLEM-STORE-1-0", 2, 0, false);
        declareFunction("cfasl_load_problem_store_1_0", "CFASL-LOAD-PROBLEM-STORE-1-0", 1, 0, false);
        declareFunction("compute_problem_store_common_symbols", "COMPUTE-PROBLEM-STORE-COMMON-SYMBOLS", 1, 0, false);
        declareFunction("possibly_note_problem_store_common_constant", "POSSIBLY-NOTE-PROBLEM-STORE-COMMON-CONSTANT", 1, 0, false);
        declareFunction("compute_problem_store_common_constants", "COMPUTE-PROBLEM-STORE-COMMON-CONSTANTS", 1, 0, false);
        declareFunction("make_constant_internal_id_map", "MAKE-CONSTANT-INTERNAL-ID-MAP", 1, 0, false);
        declareFunction("make_hash_table_from_set", "MAKE-HASH-TABLE-FROM-SET", 1, 3, false);
        declareFunction("cfasl_save_problem_store_properties", "CFASL-SAVE-PROBLEM-STORE-PROPERTIES", 2, 0, false);
        declareFunction("cfasl_load_problem_store_properties", "CFASL-LOAD-PROBLEM-STORE-PROPERTIES", 1, 0, false);
        declareFunction("cfasl_save_problem_store_problems", "CFASL-SAVE-PROBLEM-STORE-PROBLEMS", 2, 0, false);
        declareFunction("cfasl_load_problem_store_problems", "CFASL-LOAD-PROBLEM-STORE-PROBLEMS", 2, 0, false);
        declareFunction("cfasl_save_problem_store_problem", "CFASL-SAVE-PROBLEM-STORE-PROBLEM", 2, 0, false);
        declareFunction("cfasl_load_problem_store_problem", "CFASL-LOAD-PROBLEM-STORE-PROBLEM", 2, 0, false);
        declareFunction("cfasl_save_problem_store_proofs", "CFASL-SAVE-PROBLEM-STORE-PROOFS", 2, 0, false);
        declareFunction("cfasl_load_problem_store_proofs", "CFASL-LOAD-PROBLEM-STORE-PROOFS", 2, 0, false);
        declareFunction("cfasl_save_problem_store_proof", "CFASL-SAVE-PROBLEM-STORE-PROOF", 2, 0, false);
        declareFunction("cfasl_load_problem_store_proof", "CFASL-LOAD-PROBLEM-STORE-PROOF", 2, 0, false);
        declareFunction("cfasl_load_proof_subproofs", "CFASL-LOAD-PROOF-SUBPROOFS", 2, 0, false);
        declareFunction("cfasl_save_problem_store_problem_links", "CFASL-SAVE-PROBLEM-STORE-PROBLEM-LINKS", 2, 0, false);
        declareFunction("cfasl_load_problem_store_problem_links", "CFASL-LOAD-PROBLEM-STORE-PROBLEM-LINKS", 2, 0, false);
        declareFunction("cfasl_save_problem_store_problem_link", "CFASL-SAVE-PROBLEM-STORE-PROBLEM-LINK", 2, 0, false);
        declareFunction("cfasl_load_problem_store_problem_link", "CFASL-LOAD-PROBLEM-STORE-PROBLEM-LINK", 2, 0, false);
        declareFunction("cfasl_save_removal_link", "CFASL-SAVE-REMOVAL-LINK", 2, 0, false);
        declareFunction("cfasl_load_removal_link", "CFASL-LOAD-REMOVAL-LINK", 2, 0, false);
        declareFunction("cfasl_save_rewrite_link", "CFASL-SAVE-REWRITE-LINK", 2, 0, false);
        declareFunction("cfasl_load_rewrite_link", "CFASL-LOAD-REWRITE-LINK", 2, 0, false);
        declareFunction("cfasl_save_transformation_link", "CFASL-SAVE-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction("cfasl_load_transformation_link", "CFASL-LOAD-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction("cfasl_save_residual_transformation_link", "CFASL-SAVE-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction("cfasl_load_residual_transformation_link", "CFASL-LOAD-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction("cfasl_save_restriction_link", "CFASL-SAVE-RESTRICTION-LINK", 2, 0, false);
        declareFunction("cfasl_load_restriction_link", "CFASL-LOAD-RESTRICTION-LINK", 2, 0, false);
        declareFunction("cfasl_save_split_link", "CFASL-SAVE-SPLIT-LINK", 2, 0, false);
        declareFunction("cfasl_load_split_link", "CFASL-LOAD-SPLIT-LINK", 2, 0, false);
        declareFunction("cfasl_load_split_link_conjuncts", "CFASL-LOAD-SPLIT-LINK-CONJUNCTS", 2, 0, false);
        declareFunction("cfasl_save_join_ordered_link", "CFASL-SAVE-JOIN-ORDERED-LINK", 2, 0, false);
        declareFunction("cfasl_load_join_ordered_link", "CFASL-LOAD-JOIN-ORDERED-LINK", 2, 0, false);
        declareFunction("cfasl_save_join_link", "CFASL-SAVE-JOIN-LINK", 2, 0, false);
        declareFunction("cfasl_load_join_link", "CFASL-LOAD-JOIN-LINK", 2, 0, false);
        declareFunction("cfasl_save_union_link", "CFASL-SAVE-UNION-LINK", 2, 0, false);
        declareFunction("cfasl_load_union_link", "CFASL-LOAD-UNION-LINK", 2, 0, false);
        declareFunction("cfasl_save_problem_reference", "CFASL-SAVE-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction("cfasl_load_problem_reference", "CFASL-LOAD-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction("cfasl_save_mapped_problem_reference", "CFASL-SAVE-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction("cfasl_load_mapped_problem_reference", "CFASL-LOAD-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction("cfasl_save_optional_mapped_problem_reference", "CFASL-SAVE-OPTIONAL-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction("cfasl_load_optional_mapped_problem_reference", "CFASL-LOAD-OPTIONAL-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction("cfasl_save_mapped_problem_reference_int", "CFASL-SAVE-MAPPED-PROBLEM-REFERENCE-INT", 3, 0, false);
        declareFunction("cfasl_load_mapped_problem_reference_int", "CFASL-LOAD-MAPPED-PROBLEM-REFERENCE-INT", 3, 0, false);
        declareFunction("cfasl_save_problem_link_reference", "CFASL-SAVE-PROBLEM-LINK-REFERENCE", 2, 0, false);
        declareFunction("cfasl_load_problem_link_reference", "CFASL-LOAD-PROBLEM-LINK-REFERENCE", 2, 0, false);
        declareFunction("cfasl_save_proof_reference", "CFASL-SAVE-PROOF-REFERENCE", 2, 0, false);
        declareFunction("cfasl_load_proof_reference", "CFASL-LOAD-PROOF-REFERENCE", 2, 0, false);
        declareFunction("cfasl_save_hl_module_reference", "CFASL-SAVE-HL-MODULE-REFERENCE", 2, 0, false);
        declareFunction("cfasl_load_hl_module_reference", "CFASL-LOAD-HL-MODULE-REFERENCE", 1, 0, false);
        declareFunction("cfasl_save_optional_hl_module_reference", "CFASL-SAVE-OPTIONAL-HL-MODULE-REFERENCE", 2, 0, false);
        declareFunction("cfasl_load_optional_hl_module_reference", "CFASL-LOAD-OPTIONAL-HL-MODULE-REFERENCE", 1, 0, false);
        declareFunction("cfasl_save_hl_module_reference_int", "CFASL-SAVE-HL-MODULE-REFERENCE-INT", 3, 0, false);
        declareFunction("cfasl_load_hl_module_reference_int", "CFASL-LOAD-HL-MODULE-REFERENCE-INT", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_inference_serialization_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("save_problem_store", "SAVE-PROBLEM-STORE", 2, 1, false);
            declareFunction("load_problem_store", "LOAD-PROBLEM-STORE", 1, 2, false);
            declareFunction("cfasl_save_problem_store", "CFASL-SAVE-PROBLEM-STORE", 2, 0, false);
            declareFunction("cfasl_load_problem_store", "CFASL-LOAD-PROBLEM-STORE", 1, 0, false);
            declareMacro("with_clean_cfasl_load_ps_ids", "WITH-CLEAN-CFASL-LOAD-PS-IDS");
            declareFunction("cfasl_load_ps_prepare_for_expected_problem_count", "CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-PROBLEM-COUNT", 1, 0, false);
            declareFunction("cfasl_load_ps_prepare_for_expected_link_count", "CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-LINK-COUNT", 1, 0, false);
            declareFunction("cfasl_load_ps_prepare_for_expected_proof_count", "CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-PROOF-COUNT", 1, 0, false);
            declareFunction("cfasl_load_ps_note_problem_id", "CFASL-LOAD-PS-NOTE-PROBLEM-ID", 2, 0, false);
            declareFunction("cfasl_load_ps_lookup_problem", "CFASL-LOAD-PS-LOOKUP-PROBLEM", 1, 0, false);
            declareFunction("cfasl_load_ps_note_link_id", "CFASL-LOAD-PS-NOTE-LINK-ID", 2, 0, false);
            declareFunction("cfasl_load_ps_lookup_link", "CFASL-LOAD-PS-LOOKUP-LINK", 1, 0, false);
            declareFunction("cfasl_load_ps_note_proof_id", "CFASL-LOAD-PS-NOTE-PROOF-ID", 2, 0, false);
            declareFunction("cfasl_load_ps_lookup_proof", "CFASL-LOAD-PS-LOOKUP-PROOF", 1, 0, false);
            declareMacro("with_cfasl_load_ps_constant_table", "WITH-CFASL-LOAD-PS-CONSTANT-TABLE");
            declareFunction("cfasl_load_ps_lookup_constant", "CFASL-LOAD-PS-LOOKUP-CONSTANT", 1, 0, false);
            declareFunction("cfasl_save_problem_store_1_0", "CFASL-SAVE-PROBLEM-STORE-1-0", 2, 0, false);
            declareFunction("cfasl_load_problem_store_1_0", "CFASL-LOAD-PROBLEM-STORE-1-0", 1, 0, false);
            declareFunction("compute_problem_store_common_symbols", "COMPUTE-PROBLEM-STORE-COMMON-SYMBOLS", 1, 0, false);
            declareFunction("possibly_note_problem_store_common_constant", "POSSIBLY-NOTE-PROBLEM-STORE-COMMON-CONSTANT", 1, 0, false);
            declareFunction("compute_problem_store_common_constants", "COMPUTE-PROBLEM-STORE-COMMON-CONSTANTS", 1, 0, false);
            declareFunction("make_constant_internal_id_map", "MAKE-CONSTANT-INTERNAL-ID-MAP", 1, 0, false);
            declareFunction("make_hash_table_from_set", "MAKE-HASH-TABLE-FROM-SET", 1, 3, false);
            declareFunction("cfasl_save_problem_store_properties", "CFASL-SAVE-PROBLEM-STORE-PROPERTIES", 2, 0, false);
            declareFunction("cfasl_load_problem_store_properties", "CFASL-LOAD-PROBLEM-STORE-PROPERTIES", 1, 0, false);
            declareFunction("cfasl_save_problem_store_problems", "CFASL-SAVE-PROBLEM-STORE-PROBLEMS", 2, 0, false);
            declareFunction("cfasl_load_problem_store_problems", "CFASL-LOAD-PROBLEM-STORE-PROBLEMS", 2, 0, false);
            declareFunction("cfasl_save_problem_store_problem", "CFASL-SAVE-PROBLEM-STORE-PROBLEM", 2, 0, false);
            declareFunction("cfasl_load_problem_store_problem", "CFASL-LOAD-PROBLEM-STORE-PROBLEM", 2, 0, false);
            declareFunction("cfasl_save_problem_store_proofs", "CFASL-SAVE-PROBLEM-STORE-PROOFS", 2, 0, false);
            declareFunction("cfasl_load_problem_store_proofs", "CFASL-LOAD-PROBLEM-STORE-PROOFS", 2, 0, false);
            declareFunction("cfasl_save_problem_store_proof", "CFASL-SAVE-PROBLEM-STORE-PROOF", 2, 0, false);
            declareFunction("cfasl_load_problem_store_proof", "CFASL-LOAD-PROBLEM-STORE-PROOF", 2, 0, false);
            declareFunction("cfasl_load_proof_subproofs", "CFASL-LOAD-PROOF-SUBPROOFS", 2, 0, false);
            declareFunction("cfasl_save_problem_store_problem_links", "CFASL-SAVE-PROBLEM-STORE-PROBLEM-LINKS", 2, 0, false);
            declareFunction("cfasl_load_problem_store_problem_links", "CFASL-LOAD-PROBLEM-STORE-PROBLEM-LINKS", 2, 0, false);
            declareFunction("cfasl_save_problem_store_problem_link", "CFASL-SAVE-PROBLEM-STORE-PROBLEM-LINK", 2, 0, false);
            declareFunction("cfasl_load_problem_store_problem_link", "CFASL-LOAD-PROBLEM-STORE-PROBLEM-LINK", 2, 0, false);
            declareFunction("cfasl_save_removal_link", "CFASL-SAVE-REMOVAL-LINK", 2, 0, false);
            declareFunction("cfasl_load_removal_link", "CFASL-LOAD-REMOVAL-LINK", 2, 0, false);
            declareFunction("cfasl_save_rewrite_link", "CFASL-SAVE-REWRITE-LINK", 2, 0, false);
            declareFunction("cfasl_load_rewrite_link", "CFASL-LOAD-REWRITE-LINK", 2, 0, false);
            declareFunction("cfasl_save_transformation_link", "CFASL-SAVE-TRANSFORMATION-LINK", 2, 0, false);
            declareFunction("cfasl_load_transformation_link", "CFASL-LOAD-TRANSFORMATION-LINK", 2, 0, false);
            declareFunction("cfasl_save_residual_transformation_link", "CFASL-SAVE-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
            declareFunction("cfasl_load_residual_transformation_link", "CFASL-LOAD-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
            declareFunction("cfasl_save_restriction_link", "CFASL-SAVE-RESTRICTION-LINK", 2, 0, false);
            declareFunction("cfasl_load_restriction_link", "CFASL-LOAD-RESTRICTION-LINK", 2, 0, false);
            declareFunction("cfasl_save_split_link", "CFASL-SAVE-SPLIT-LINK", 2, 0, false);
            declareFunction("cfasl_load_split_link", "CFASL-LOAD-SPLIT-LINK", 2, 0, false);
            declareFunction("cfasl_load_split_link_conjuncts", "CFASL-LOAD-SPLIT-LINK-CONJUNCTS", 2, 0, false);
            declareFunction("cfasl_save_join_ordered_link", "CFASL-SAVE-JOIN-ORDERED-LINK", 2, 0, false);
            declareFunction("cfasl_load_join_ordered_link", "CFASL-LOAD-JOIN-ORDERED-LINK", 2, 0, false);
            declareFunction("cfasl_save_join_link", "CFASL-SAVE-JOIN-LINK", 2, 0, false);
            declareFunction("cfasl_load_join_link", "CFASL-LOAD-JOIN-LINK", 2, 0, false);
            declareFunction("cfasl_save_union_link", "CFASL-SAVE-UNION-LINK", 2, 0, false);
            declareFunction("cfasl_load_union_link", "CFASL-LOAD-UNION-LINK", 2, 0, false);
            declareFunction("cfasl_save_problem_reference", "CFASL-SAVE-PROBLEM-REFERENCE", 2, 0, false);
            declareFunction("cfasl_load_problem_reference", "CFASL-LOAD-PROBLEM-REFERENCE", 2, 0, false);
            declareFunction("cfasl_save_mapped_problem_reference", "CFASL-SAVE-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
            declareFunction("cfasl_load_mapped_problem_reference", "CFASL-LOAD-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
            declareFunction("cfasl_save_optional_mapped_problem_reference", "CFASL-SAVE-OPTIONAL-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
            declareFunction("cfasl_load_optional_mapped_problem_reference", "CFASL-LOAD-OPTIONAL-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
            declareFunction("cfasl_save_mapped_problem_reference_int", "CFASL-SAVE-MAPPED-PROBLEM-REFERENCE-INT", 3, 0, false);
            declareFunction("cfasl_load_mapped_problem_reference_int", "CFASL-LOAD-MAPPED-PROBLEM-REFERENCE-INT", 3, 0, false);
            declareFunction("cfasl_save_problem_link_reference", "CFASL-SAVE-PROBLEM-LINK-REFERENCE", 2, 0, false);
            declareFunction("cfasl_load_problem_link_reference", "CFASL-LOAD-PROBLEM-LINK-REFERENCE", 2, 0, false);
            declareFunction("cfasl_save_proof_reference", "CFASL-SAVE-PROOF-REFERENCE", 2, 0, false);
            declareFunction("cfasl_load_proof_reference", "CFASL-LOAD-PROOF-REFERENCE", 2, 0, false);
            declareFunction("cfasl_save_hl_module_reference", "CFASL-SAVE-HL-MODULE-REFERENCE", 2, 0, false);
            declareFunction("cfasl_load_hl_module_reference", "CFASL-LOAD-HL-MODULE-REFERENCE", 1, 0, false);
            declareFunction("cfasl_save_optional_hl_module_reference", "CFASL-SAVE-OPTIONAL-HL-MODULE-REFERENCE", 2, 0, false);
            declareFunction("cfasl_load_optional_hl_module_reference", "CFASL-LOAD-OPTIONAL-HL-MODULE-REFERENCE", 1, 0, false);
            declareFunction("cfasl_save_hl_module_reference_int", "CFASL-SAVE-HL-MODULE-REFERENCE-INT", 3, 0, false);
            declareFunction("cfasl_load_hl_module_reference_int", "CFASL-LOAD-HL-MODULE-REFERENCE-INT", 2, 0, false);
            declareFunction("cfasl_unsupported_type_error", "CFASL-UNSUPPORTED-TYPE-ERROR", 1, 0, false);
            declareFunction("cfasl_output_object_problem_store_method", "CFASL-OUTPUT-OBJECT-PROBLEM-STORE-METHOD", 2, 0, false);
            declareFunction("cfasl_output_object_problem_method", "CFASL-OUTPUT-OBJECT-PROBLEM-METHOD", 2, 0, false);
            declareFunction("cfasl_output_object_tactic_method", "CFASL-OUTPUT-OBJECT-TACTIC-METHOD", 2, 0, false);
            declareFunction("cfasl_output_object_problem_link_method", "CFASL-OUTPUT-OBJECT-PROBLEM-LINK-METHOD", 2, 0, false);
            declareFunction("cfasl_output_object_proof_method", "CFASL-OUTPUT-OBJECT-PROOF-METHOD", 2, 0, false);
            declareFunction("cfasl_output_object_strategy_method", "CFASL-OUTPUT-OBJECT-STRATEGY-METHOD", 2, 0, false);
            declareFunction("cfasl_output_object_inference_method", "CFASL-OUTPUT-OBJECT-INFERENCE-METHOD", 2, 0, false);
            declareFunction("cfasl_output_object_inference_answer_method", "CFASL-OUTPUT-OBJECT-INFERENCE-ANSWER-METHOD", 2, 0, false);
            declareFunction("cfasl_output_object_inference_answer_justification_method", "CFASL-OUTPUT-OBJECT-INFERENCE-ANSWER-JUSTIFICATION-METHOD", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("load_problem_store", "LOAD-PROBLEM-STORE", 1, 1, false);
        }
        return NIL;
    }

    public static SubLObject declare_inference_serialization_file_Previous() {
        declareFunction("save_problem_store", "SAVE-PROBLEM-STORE", 2, 1, false);
        declareFunction("load_problem_store", "LOAD-PROBLEM-STORE", 1, 2, false);
        declareFunction("cfasl_save_problem_store", "CFASL-SAVE-PROBLEM-STORE", 2, 0, false);
        declareFunction("cfasl_load_problem_store", "CFASL-LOAD-PROBLEM-STORE", 1, 0, false);
        declareMacro("with_clean_cfasl_load_ps_ids", "WITH-CLEAN-CFASL-LOAD-PS-IDS");
        declareFunction("cfasl_load_ps_prepare_for_expected_problem_count", "CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-PROBLEM-COUNT", 1, 0, false);
        declareFunction("cfasl_load_ps_prepare_for_expected_link_count", "CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-LINK-COUNT", 1, 0, false);
        declareFunction("cfasl_load_ps_prepare_for_expected_proof_count", "CFASL-LOAD-PS-PREPARE-FOR-EXPECTED-PROOF-COUNT", 1, 0, false);
        declareFunction("cfasl_load_ps_note_problem_id", "CFASL-LOAD-PS-NOTE-PROBLEM-ID", 2, 0, false);
        declareFunction("cfasl_load_ps_lookup_problem", "CFASL-LOAD-PS-LOOKUP-PROBLEM", 1, 0, false);
        declareFunction("cfasl_load_ps_note_link_id", "CFASL-LOAD-PS-NOTE-LINK-ID", 2, 0, false);
        declareFunction("cfasl_load_ps_lookup_link", "CFASL-LOAD-PS-LOOKUP-LINK", 1, 0, false);
        declareFunction("cfasl_load_ps_note_proof_id", "CFASL-LOAD-PS-NOTE-PROOF-ID", 2, 0, false);
        declareFunction("cfasl_load_ps_lookup_proof", "CFASL-LOAD-PS-LOOKUP-PROOF", 1, 0, false);
        declareMacro("with_cfasl_load_ps_constant_table", "WITH-CFASL-LOAD-PS-CONSTANT-TABLE");
        declareFunction("cfasl_load_ps_lookup_constant", "CFASL-LOAD-PS-LOOKUP-CONSTANT", 1, 0, false);
        declareFunction("cfasl_save_problem_store_1_0", "CFASL-SAVE-PROBLEM-STORE-1-0", 2, 0, false);
        declareFunction("cfasl_load_problem_store_1_0", "CFASL-LOAD-PROBLEM-STORE-1-0", 1, 0, false);
        declareFunction("compute_problem_store_common_symbols", "COMPUTE-PROBLEM-STORE-COMMON-SYMBOLS", 1, 0, false);
        declareFunction("possibly_note_problem_store_common_constant", "POSSIBLY-NOTE-PROBLEM-STORE-COMMON-CONSTANT", 1, 0, false);
        declareFunction("compute_problem_store_common_constants", "COMPUTE-PROBLEM-STORE-COMMON-CONSTANTS", 1, 0, false);
        declareFunction("make_constant_internal_id_map", "MAKE-CONSTANT-INTERNAL-ID-MAP", 1, 0, false);
        declareFunction("make_hash_table_from_set", "MAKE-HASH-TABLE-FROM-SET", 1, 3, false);
        declareFunction("cfasl_save_problem_store_properties", "CFASL-SAVE-PROBLEM-STORE-PROPERTIES", 2, 0, false);
        declareFunction("cfasl_load_problem_store_properties", "CFASL-LOAD-PROBLEM-STORE-PROPERTIES", 1, 0, false);
        declareFunction("cfasl_save_problem_store_problems", "CFASL-SAVE-PROBLEM-STORE-PROBLEMS", 2, 0, false);
        declareFunction("cfasl_load_problem_store_problems", "CFASL-LOAD-PROBLEM-STORE-PROBLEMS", 2, 0, false);
        declareFunction("cfasl_save_problem_store_problem", "CFASL-SAVE-PROBLEM-STORE-PROBLEM", 2, 0, false);
        declareFunction("cfasl_load_problem_store_problem", "CFASL-LOAD-PROBLEM-STORE-PROBLEM", 2, 0, false);
        declareFunction("cfasl_save_problem_store_proofs", "CFASL-SAVE-PROBLEM-STORE-PROOFS", 2, 0, false);
        declareFunction("cfasl_load_problem_store_proofs", "CFASL-LOAD-PROBLEM-STORE-PROOFS", 2, 0, false);
        declareFunction("cfasl_save_problem_store_proof", "CFASL-SAVE-PROBLEM-STORE-PROOF", 2, 0, false);
        declareFunction("cfasl_load_problem_store_proof", "CFASL-LOAD-PROBLEM-STORE-PROOF", 2, 0, false);
        declareFunction("cfasl_load_proof_subproofs", "CFASL-LOAD-PROOF-SUBPROOFS", 2, 0, false);
        declareFunction("cfasl_save_problem_store_problem_links", "CFASL-SAVE-PROBLEM-STORE-PROBLEM-LINKS", 2, 0, false);
        declareFunction("cfasl_load_problem_store_problem_links", "CFASL-LOAD-PROBLEM-STORE-PROBLEM-LINKS", 2, 0, false);
        declareFunction("cfasl_save_problem_store_problem_link", "CFASL-SAVE-PROBLEM-STORE-PROBLEM-LINK", 2, 0, false);
        declareFunction("cfasl_load_problem_store_problem_link", "CFASL-LOAD-PROBLEM-STORE-PROBLEM-LINK", 2, 0, false);
        declareFunction("cfasl_save_removal_link", "CFASL-SAVE-REMOVAL-LINK", 2, 0, false);
        declareFunction("cfasl_load_removal_link", "CFASL-LOAD-REMOVAL-LINK", 2, 0, false);
        declareFunction("cfasl_save_rewrite_link", "CFASL-SAVE-REWRITE-LINK", 2, 0, false);
        declareFunction("cfasl_load_rewrite_link", "CFASL-LOAD-REWRITE-LINK", 2, 0, false);
        declareFunction("cfasl_save_transformation_link", "CFASL-SAVE-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction("cfasl_load_transformation_link", "CFASL-LOAD-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction("cfasl_save_residual_transformation_link", "CFASL-SAVE-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction("cfasl_load_residual_transformation_link", "CFASL-LOAD-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
        declareFunction("cfasl_save_restriction_link", "CFASL-SAVE-RESTRICTION-LINK", 2, 0, false);
        declareFunction("cfasl_load_restriction_link", "CFASL-LOAD-RESTRICTION-LINK", 2, 0, false);
        declareFunction("cfasl_save_split_link", "CFASL-SAVE-SPLIT-LINK", 2, 0, false);
        declareFunction("cfasl_load_split_link", "CFASL-LOAD-SPLIT-LINK", 2, 0, false);
        declareFunction("cfasl_load_split_link_conjuncts", "CFASL-LOAD-SPLIT-LINK-CONJUNCTS", 2, 0, false);
        declareFunction("cfasl_save_join_ordered_link", "CFASL-SAVE-JOIN-ORDERED-LINK", 2, 0, false);
        declareFunction("cfasl_load_join_ordered_link", "CFASL-LOAD-JOIN-ORDERED-LINK", 2, 0, false);
        declareFunction("cfasl_save_join_link", "CFASL-SAVE-JOIN-LINK", 2, 0, false);
        declareFunction("cfasl_load_join_link", "CFASL-LOAD-JOIN-LINK", 2, 0, false);
        declareFunction("cfasl_save_union_link", "CFASL-SAVE-UNION-LINK", 2, 0, false);
        declareFunction("cfasl_load_union_link", "CFASL-LOAD-UNION-LINK", 2, 0, false);
        declareFunction("cfasl_save_problem_reference", "CFASL-SAVE-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction("cfasl_load_problem_reference", "CFASL-LOAD-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction("cfasl_save_mapped_problem_reference", "CFASL-SAVE-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction("cfasl_load_mapped_problem_reference", "CFASL-LOAD-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction("cfasl_save_optional_mapped_problem_reference", "CFASL-SAVE-OPTIONAL-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction("cfasl_load_optional_mapped_problem_reference", "CFASL-LOAD-OPTIONAL-MAPPED-PROBLEM-REFERENCE", 2, 0, false);
        declareFunction("cfasl_save_mapped_problem_reference_int", "CFASL-SAVE-MAPPED-PROBLEM-REFERENCE-INT", 3, 0, false);
        declareFunction("cfasl_load_mapped_problem_reference_int", "CFASL-LOAD-MAPPED-PROBLEM-REFERENCE-INT", 3, 0, false);
        declareFunction("cfasl_save_problem_link_reference", "CFASL-SAVE-PROBLEM-LINK-REFERENCE", 2, 0, false);
        declareFunction("cfasl_load_problem_link_reference", "CFASL-LOAD-PROBLEM-LINK-REFERENCE", 2, 0, false);
        declareFunction("cfasl_save_proof_reference", "CFASL-SAVE-PROOF-REFERENCE", 2, 0, false);
        declareFunction("cfasl_load_proof_reference", "CFASL-LOAD-PROOF-REFERENCE", 2, 0, false);
        declareFunction("cfasl_save_hl_module_reference", "CFASL-SAVE-HL-MODULE-REFERENCE", 2, 0, false);
        declareFunction("cfasl_load_hl_module_reference", "CFASL-LOAD-HL-MODULE-REFERENCE", 1, 0, false);
        declareFunction("cfasl_save_optional_hl_module_reference", "CFASL-SAVE-OPTIONAL-HL-MODULE-REFERENCE", 2, 0, false);
        declareFunction("cfasl_load_optional_hl_module_reference", "CFASL-LOAD-OPTIONAL-HL-MODULE-REFERENCE", 1, 0, false);
        declareFunction("cfasl_save_hl_module_reference_int", "CFASL-SAVE-HL-MODULE-REFERENCE-INT", 3, 0, false);
        declareFunction("cfasl_load_hl_module_reference_int", "CFASL-LOAD-HL-MODULE-REFERENCE-INT", 2, 0, false);
        declareFunction("cfasl_unsupported_type_error", "CFASL-UNSUPPORTED-TYPE-ERROR", 1, 0, false);
        declareFunction("cfasl_output_object_problem_store_method", "CFASL-OUTPUT-OBJECT-PROBLEM-STORE-METHOD", 2, 0, false);
        declareFunction("cfasl_output_object_problem_method", "CFASL-OUTPUT-OBJECT-PROBLEM-METHOD", 2, 0, false);
        declareFunction("cfasl_output_object_tactic_method", "CFASL-OUTPUT-OBJECT-TACTIC-METHOD", 2, 0, false);
        declareFunction("cfasl_output_object_problem_link_method", "CFASL-OUTPUT-OBJECT-PROBLEM-LINK-METHOD", 2, 0, false);
        declareFunction("cfasl_output_object_proof_method", "CFASL-OUTPUT-OBJECT-PROOF-METHOD", 2, 0, false);
        declareFunction("cfasl_output_object_strategy_method", "CFASL-OUTPUT-OBJECT-STRATEGY-METHOD", 2, 0, false);
        declareFunction("cfasl_output_object_inference_method", "CFASL-OUTPUT-OBJECT-INFERENCE-METHOD", 2, 0, false);
        declareFunction("cfasl_output_object_inference_answer_method", "CFASL-OUTPUT-OBJECT-INFERENCE-ANSWER-METHOD", 2, 0, false);
        declareFunction("cfasl_output_object_inference_answer_justification_method", "CFASL-OUTPUT-OBJECT-INFERENCE-ANSWER-JUSTIFICATION-METHOD", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_serialization_file() {
        defparameter("*INFERENCE-SERIALIZATION-SUPPORTS-PROBLEM-FREE-HL-VAR-OPTIMIZATION?*", NIL);
        deflexical("*CURRENT-CFASL-SAVE-PROBLEM-STORE-VERSION*", $str10$1_0);
        defparameter("*CFASL-LOAD-PS-PROBLEM-TABLE*", $UNINITIALIZED);
        defparameter("*CFASL-LOAD-PS-LINK-TABLE*", $UNINITIALIZED);
        defparameter("*CFASL-LOAD-PS-PROOF-TABLE*", $UNINITIALIZED);
        defparameter("*CFASL-LOAD-PS-CONSTANT-TABLE*", $UNINITIALIZED);
        defparameter("*PROBLEM-STORE-COMMON-CONSTANTS*", NIL);
        return NIL;
    }

    public static SubLObject setup_inference_serialization_file() {
        register_macro_helper(CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_PROBLEM_COUNT, WITH_CLEAN_CFASL_LOAD_PS_IDS);
        register_macro_helper(CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_LINK_COUNT, WITH_CLEAN_CFASL_LOAD_PS_IDS);
        register_macro_helper(CFASL_LOAD_PS_PREPARE_FOR_EXPECTED_PROOF_COUNT, WITH_CLEAN_CFASL_LOAD_PS_IDS);
        register_macro_helper(CFASL_LOAD_PS_NOTE_PROBLEM_ID, WITH_CLEAN_CFASL_LOAD_PS_IDS);
        register_macro_helper(CFASL_LOAD_PS_LOOKUP_PROBLEM, WITH_CLEAN_CFASL_LOAD_PS_IDS);
        register_macro_helper(CFASL_LOAD_PS_NOTE_LINK_ID, WITH_CLEAN_CFASL_LOAD_PS_IDS);
        register_macro_helper(CFASL_LOAD_PS_LOOKUP_LINK, WITH_CLEAN_CFASL_LOAD_PS_IDS);
        register_macro_helper(CFASL_LOAD_PS_NOTE_PROOF_ID, WITH_CLEAN_CFASL_LOAD_PS_IDS);
        register_macro_helper(CFASL_LOAD_PS_LOOKUP_PROOF, WITH_CLEAN_CFASL_LOAD_PS_IDS);
        register_macro_helper(CFASL_LOAD_PS_LOOKUP_CONSTANT, WITH_CFASL_LOAD_PS_CONSTANT_TABLE);
        note_funcall_helper_function(POSSIBLY_NOTE_PROBLEM_STORE_COMMON_CONSTANT);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_problem_store.$dtp_problem_store$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_PROBLEM_STORE_METHOD));
        register_method($cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_problem.$dtp_problem$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_PROBLEM_METHOD));
        register_method($cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_tactic.$dtp_tactic$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_TACTIC_METHOD));
        register_method($cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_problem_link.$dtp_problem_link$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_PROBLEM_LINK_METHOD));
        register_method($cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_proof.$dtp_proof$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_PROOF_METHOD));
        register_method($cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_strategy.$dtp_strategy$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_STRATEGY_METHOD));
        register_method($cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_inference.$dtp_inference$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_INFERENCE_METHOD));
        register_method($cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_inference.$dtp_inference_answer$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_INFERENCE_ANSWER_METHOD));
        register_method($cfasl_output_object_method_table$.getGlobalValue(), inference_datastructures_inference.$dtp_inference_answer_justification$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_INFERENCE_ANSWER_JUSTIFICATION_METHOD));
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
    }
}

/**
 * Total time: 429 ms
 */
