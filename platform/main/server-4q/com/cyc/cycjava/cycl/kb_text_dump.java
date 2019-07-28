package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.kb_text_dump;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.kb_text_dump.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class kb_text_dump extends SubLTranslatedFile {
    public static final SubLFile me = new kb_text_dump();

    public static final String myName = "com.cyc.cycjava.cycl.kb_text_dump";

    public static final String myFingerPrint = "462e52903d1041a717bb1fc91ae493bf1e66466307e35224ab95c1fab2edb3ce";

    // defparameter
    private static final SubLSymbol $kb_text_hl_prototypical_terms$ = makeSymbol("*KB-TEXT-HL-PROTOTYPICAL-TERMS*");



    private static final SubLObject $$HLPrototypicalTerm = reader_make_constant_shell(makeString("HLPrototypicalTerm"));

    private static final SubLSymbol $sym1$KB_TEXT_HL_PROTOTYPICAL_TERM_ = makeSymbol("KB-TEXT-HL-PROTOTYPICAL-TERM?");



    private static final SubLSymbol KB_TEXT_DUMP_ESSENTIAL_KB = makeSymbol("KB-TEXT-DUMP-ESSENTIAL-KB");

    private static final SubLSymbol KB_TEXT_DUMP_KB = makeSymbol("KB-TEXT-DUMP-KB");

    private static final SubLString $$$constants = makeString("constants");



    private static final SubLString $str7$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $$$Text_dumping_constants = makeString("Text dumping constants");





    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$narts = makeString("narts");

    private static final SubLString $$$Text_dumping_narts = makeString("Text dumping narts");

    private static final SubLString $$$assertions = makeString("assertions");

    private static final SubLString $$$Text_dumping_assertions = makeString("Text dumping assertions");





    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLString $str19$Mapping_meta_assertions = makeString("Mapping meta-assertions");



    private static final SubLString $str21$_A_ = makeString("~A ");

    private static final SubLString $$$deductions = makeString("deductions");

    private static final SubLString $$$Text_dumping_deductions = makeString("Text dumping deductions");

    private static final SubLString $str24$_A__A__A__A = makeString("~A ~A ~A ~A");

    private static final SubLString $str25$kb_hl_supports = makeString("kb-hl-supports");

    private static final SubLString $$$Text_dumping_KB_HL_supports = makeString("Text dumping KB HL supports");

    private static final SubLString $str27$unrepresented_terms = makeString("unrepresented-terms");

    private static final SubLString $$$Text_dumping_unrepresented_terms = makeString("Text dumping unrepresented terms");

    private static final SubLSymbol LOOKUP_UNREPRESENTED_TERM_SUID = makeSymbol("LOOKUP-UNREPRESENTED-TERM-SUID");

    private static final SubLString $str30$constant_indexing = makeString("constant-indexing");



    private static final SubLString $$$Text_dumping_constant_indexing = makeString("Text dumping constant indexing");

    private static final SubLString $str33$Unsupported_index_type__A___ = makeString("Unsupported index type ~A.~%");

    private static final SubLString $str34$nart_indexing = makeString("nart-indexing");

    private static final SubLString $$$Text_dumping_NAT_indexing = makeString("Text dumping NAT indexing");

    private static final SubLString $str36$unrepresented_term_indexing = makeString("unrepresented-term-indexing");

    private static final SubLString $str37$Text_dumping_unrepresented_term_i = makeString("Text dumping unrepresented term indexing");

    private static final SubLString $str38$____Old_Space = makeString(" -- Old Space");

    private static final SubLString $str39$____New_Space = makeString(" -- New Space");

    private static final SubLString $$$cdolist = makeString("cdolist");



    private static final SubLSymbol KB_TEXT_DUMP_COMPINX_VISIT_BEGIN_VISIT = makeSymbol("KB-TEXT-DUMP-COMPINX-VISIT-BEGIN-VISIT");

    private static final SubLSymbol KB_TEXT_DUMP_COMPINX_VISIT_BEGIN_SUBINDEX = makeSymbol("KB-TEXT-DUMP-COMPINX-VISIT-BEGIN-SUBINDEX");

    private static final SubLSymbol KB_TEXT_DUMP_COMPINX_VISIT_FINAL_INDEX = makeSymbol("KB-TEXT-DUMP-COMPINX-VISIT-FINAL-INDEX");

    private static final SubLSymbol KB_TEXT_DUMP_COMPINX_VISIT_END_SUBINDEX = makeSymbol("KB-TEXT-DUMP-COMPINX-VISIT-END-SUBINDEX");

    private static final SubLSymbol KB_TEXT_DUMP_COMPINX_VISIT_END_VISIT = makeSymbol("KB-TEXT-DUMP-COMPINX-VISIT-END-VISIT");

    private static final SubLString $str47$Skipping_final_top_N_index__A___ = makeString("Skipping final top-N index ~A.~%");

    private static final SubLSymbol $sym48$_ = makeSymbol("<");

    private static final SubLSymbol FINAL_INDEX_P = makeSymbol("FINAL-INDEX-P");

    private static final SubLSymbol DO_STACK_ELEMENTS_STACK_ELEMENTS = makeSymbol("DO-STACK-ELEMENTS-STACK-ELEMENTS");

    private static final SubLList $list51 = list(makeSymbol("ITEM"), makeSymbol("&REST"), makeSymbol("ITEMS"));

    private static final SubLString $str52$A_ = makeString("A_");

    private static final SubLSymbol KB_TEXT_CONVERT_DEDUCTION_SUPPORT_TO_RECIPE = makeSymbol("KB-TEXT-CONVERT-DEDUCTION-SUPPORT-TO-RECIPE");

    private static final SubLSymbol $sym54$STRING_ = makeSymbol("STRING<");

    private static final SubLSymbol KB_TEXT_COMPACT_HL_EXTERNAL_ID_STRING_CACHED = makeSymbol("KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED");

    private static final SubLSymbol $kb_text_compact_hl_external_id_string_cached_caching_state$ = makeSymbol("*KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED-CACHING-STATE*");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLString $$$kbtext = makeString("kbtext");

    public static SubLObject get_hl_prototypical_terms() {
        return set_utilities.construct_set_from_list(isa.quoted_instances($$HLPrototypicalTerm, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject kb_text_hl_prototypical_termP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_memberP(v_term, $kb_text_hl_prototypical_terms$.getDynamicValue(thread));
    }

    public static SubLObject kb_text_convert_potential_prototypical_terms(final SubLObject cons) {
        if (NIL == list_utilities.tree_find_if($sym1$KB_TEXT_HL_PROTOTYPICAL_TERM_, cons, UNPROVIDED)) {
            return cons;
        }
        return list_utilities.tree_transform_if(cons, $sym1$KB_TEXT_HL_PROTOTYPICAL_TERM_, CONSTANT_NAME, UNPROVIDED);
    }

    public static SubLObject kb_text_dump_essential_kb(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $kb_text_hl_prototypical_terms$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_3 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            $kb_text_hl_prototypical_terms$.bind(get_hl_prototypical_terms(), thread);
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            kb_text_dump_constants(directory);
            kb_text_dump_narts(directory);
            kb_text_dump_assertions(directory);
            kb_text_dump_deductions(directory);
            kb_text_dump_kb_hl_supports(directory);
        } finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_3, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_2, thread);
            $kb_text_hl_prototypical_terms$.rebind(_prev_bind_0, thread);
        }
        return directory;
    }

    public static SubLObject kb_text_dump_kb(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kb_text_dump_essential_kb(directory);
        final SubLObject _prev_bind_0 = $kb_text_hl_prototypical_terms$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_3 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            $kb_text_hl_prototypical_terms$.bind(get_hl_prototypical_terms(), thread);
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            kb_text_dump_unrepresented_terms(directory);
            kb_text_dump_indexing(directory);
        } finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_3, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_2, thread);
            $kb_text_hl_prototypical_terms$.rebind(_prev_bind_0, thread);
        }
        return directory;
    }

    public static SubLObject kb_text_dump_indexing(final SubLObject directory) {
        kb_text_dump_constant_indexing(directory);
        kb_text_dump_nart_indexing(directory);
        kb_text_dump_unrepresented_term_indexing(directory);
        return directory;
    }

    public static SubLObject kb_text_dump_constants(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, $$$constants);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str7$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            final SubLObject idx = do_constants_table();
            final SubLObject mess = $$$Text_dumping_constants;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
            final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$1 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$1, $SKIP)) {
                        final SubLObject idx_$2 = idx_$1;
                        if (NIL == id_index_dense_objects_empty_p(idx_$2, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$2);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject constant;
                            SubLObject name;
                            SubLObject suid;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                constant = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(constant)) {
                                        constant = $SKIP;
                                    }
                                    name = constants_high.constant_name(constant);
                                    suid = constants_high.constant_internal_id(constant);
                                    write_string(kb_text_term_tag(constant), s, UNPROVIDED, UNPROVIDED);
                                    write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                    write_string(name, s, UNPROVIDED, UNPROVIDED);
                                    write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                    princ(suid, s);
                                    terpri(s);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$3 = idx_$1;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$3)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$3);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$3);
                            final SubLObject end_id = id_index_next_id(idx_$3);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
                                    final SubLObject name2 = constants_high.constant_name(constant2);
                                    final SubLObject suid2 = constants_high.constant_internal_id(constant2);
                                    write_string(kb_text_term_tag(constant2), s, UNPROVIDED, UNPROVIDED);
                                    write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                    write_string(name2, s, UNPROVIDED, UNPROVIDED);
                                    write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                    princ(suid2, s);
                                    terpri(s);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                $last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return directory;
    }

    public static SubLObject kb_text_dump_narts(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, $$$narts);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str7$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            final SubLObject idx = nart_handles.do_narts_table();
            final SubLObject mess = $$$Text_dumping_narts;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
            final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$5 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$5, $SKIP)) {
                        final SubLObject idx_$6 = idx_$5;
                        if (NIL == id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$6);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject nart;
                            SubLObject suid;
                            SubLObject formula;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                nart = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(nart)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(nart)) {
                                        nart = $SKIP;
                                    }
                                    suid = nart_handles.nart_id(nart);
                                    formula = kb_text_cons_id_string(narts_high.nart_hl_formula(nart));
                                    write_string(formula, s, UNPROVIDED, UNPROVIDED);
                                    write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                    princ(suid, s);
                                    terpri(s);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$7 = idx_$5;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$7)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$7);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$7);
                            final SubLObject end_id = id_index_next_id(idx_$7);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject nart2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(nart2))) {
                                    final SubLObject suid2 = nart_handles.nart_id(nart2);
                                    final SubLObject formula2 = kb_text_cons_id_string(narts_high.nart_hl_formula(nart2));
                                    write_string(formula2, s, UNPROVIDED, UNPROVIDED);
                                    write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                    princ(suid2, s);
                                    terpri(s);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                $last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return directory;
    }

    public static SubLObject kb_text_dump_assertions(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, $$$assertions);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str7$Unable_to_open__S, file);
            }
            final SubLObject stream_$9 = stream;
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = $$$Text_dumping_assertions;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
            final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$10 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$10, $SKIP)) {
                        final SubLObject idx_$11 = idx_$10;
                        if (NIL == id_index_dense_objects_empty_p(idx_$11, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$11);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                a_handle = aref(vector_var, a_id);
                                if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(a_handle)) {
                                        a_handle = $SKIP;
                                    }
                                    assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    kb_text_dump_assertion_to_stream(assertion, stream_$9);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$12 = idx_$10;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$12)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$12);
                            SubLObject a_id2 = id_index_sparse_id_threshold(idx_$12);
                            final SubLObject end_id = id_index_next_id(idx_$12);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                    final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    kb_text_dump_assertion_to_stream(assertion2, stream_$9);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                a_id2 = add(a_id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                $last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return directory;
    }

    public static SubLObject kb_text_dump_meta_assertions(final SubLObject filename, SubLObject test, SubLObject limit) {
        if (test == UNPROVIDED) {
            test = IDENTITY;
        }
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str7$Unable_to_open__S, filename);
            }
            final SubLObject stream_$14 = stream;
            result = kb_text_dump_meta_assertions_to_stream(stream_$14, test, limit);
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
        return result;
    }

    public static SubLObject kb_text_dump_meta_assertions_to_stream(final SubLObject stream, SubLObject test, SubLObject limit) {
        if (test == UNPROVIDED) {
            test = IDENTITY;
        }
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != streamp(stream) : "Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) " + stream;
        SubLObject total = ZERO_INTEGER;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject total_$15 = assertions_with_meta_assertions_count();
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0_$16 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$17 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($str19$Mapping_meta_assertions);
                    final SubLObject iterator_var = new_assertions_with_meta_assertions_iterator();
                    SubLObject valid;
                    for (SubLObject done_var = doneP; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != doneP))) {
                        thread.resetMultipleValues();
                        final SubLObject non_meta = iteration.iteration_next(iterator_var);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            if (NIL != kb_mapping_macros.do_term_index_key_validator(non_meta, NIL)) {
                                final SubLObject iterator_var_$18 = kb_mapping_macros.new_term_final_index_spec_iterator(non_meta, NIL);
                                SubLObject done_var_$19 = doneP;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var_$19) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var_$18, token_var);
                                    final SubLObject valid_$20 = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid_$20) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                            SubLObject done_var_$20 = doneP;
                                            final SubLObject token_var_$22 = NIL;
                                            while (NIL == done_var_$20) {
                                                final SubLObject meta = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$22);
                                                final SubLObject valid_$21 = makeBoolean(!token_var_$22.eql(meta));
                                                if (((NIL != valid_$21) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(meta, final_index_spec))) && (NIL != funcall(test, meta))) {
                                                    kb_text_dump_assertion_to_stream(meta, stream);
                                                    total = add(total, ONE_INTEGER);
                                                    if (NIL != limit) {
                                                        doneP = numGE(total, limit);
                                                    }
                                                }
                                                done_var_$20 = makeBoolean((NIL == valid_$21) || (NIL != doneP));
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                            }
                                        }
                                    }
                                    done_var_$19 = makeBoolean((NIL == valid_$20) || (NIL != doneP));
                                } 
                            }
                            sofar = add(sofar, ONE_INTEGER);
                            note_percent_progress(sofar, total_$15);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$17, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$16, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return total;
    }

    public static SubLObject kb_text_dump_assertion_to_stream(final SubLObject assertion, final SubLObject stream) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        final SubLObject suid = assertion_handles.assertion_id(assertion);
        final SubLObject elmt = kb_text_compact_hl_external_id_string_cached(uncanonicalizer.assertion_elmt(assertion));
        final SubLObject sentence = kb_text_cons_id_string(assertions_high.assertion_cnf(assertion));
        format(stream, $str21$_A_, suid);
        write_string(elmt, stream, UNPROVIDED, UNPROVIDED);
        write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
        write_string(sentence, stream, UNPROVIDED, UNPROVIDED);
        write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        return assertion;
    }

    public static SubLObject kb_text_dump_deductions(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, $$$deductions);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str7$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            final SubLObject idx = deduction_handles.do_deductions_table();
            final SubLObject mess = $$$Text_dumping_deductions;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
            final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$26 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$26, $SKIP)) {
                        final SubLObject idx_$27 = idx_$26;
                        if (NIL == id_index_dense_objects_empty_p(idx_$27, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$27);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject d_id;
                            SubLObject d_handle;
                            SubLObject d;
                            SubLObject id;
                            SubLObject supported_object;
                            SubLObject supported_recipe;
                            SubLObject support_recipes;
                            SubLObject truth;
                            SubLObject strength;
                            SubLObject cdolist_list_var;
                            SubLObject support_item;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                d_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                d_handle = aref(vector_var, d_id);
                                if ((NIL == id_index_tombstone_p(d_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(d_handle)) {
                                        d_handle = $SKIP;
                                    }
                                    d = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                    id = deduction_handles.deduction_id(d);
                                    supported_object = deductions_interface.kb_deduction_supported_object(d);
                                    supported_recipe = kb_text_convert_deduction_support_to_recipe(supported_object);
                                    support_recipes = (NIL != assertion_handles.assertion_p(supported_object)) ? kb_text_convert_deduction_supports_to_support_recipe(deductions_interface.kb_deduction_supports(d)) : NIL;
                                    truth = deductions_interface.kb_deduction_truth(d);
                                    strength = deductions_interface.kb_deduction_strength(d);
                                    format(s, $str24$_A__A__A__A, new SubLObject[]{ id, supported_recipe, truth, strength });
                                    cdolist_list_var = support_recipes;
                                    support_item = NIL;
                                    support_item = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        princ($$$_, s);
                                        princ(support_item, s);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        support_item = cdolist_list_var.first();
                                    } 
                                    terpri(s);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$28 = idx_$26;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$28)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$28);
                            SubLObject d_id2 = id_index_sparse_id_threshold(idx_$28);
                            final SubLObject end_id = id_index_next_id(idx_$28);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (d_id2.numL(end_id)) {
                                final SubLObject d_handle2 = gethash_without_values(d_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(d_handle2))) {
                                    final SubLObject d2 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                    final SubLObject id2 = deduction_handles.deduction_id(d2);
                                    final SubLObject supported_object2 = deductions_interface.kb_deduction_supported_object(d2);
                                    final SubLObject supported_recipe2 = kb_text_convert_deduction_support_to_recipe(supported_object2);
                                    final SubLObject support_recipes2 = (NIL != assertion_handles.assertion_p(supported_object2)) ? kb_text_convert_deduction_supports_to_support_recipe(deductions_interface.kb_deduction_supports(d2)) : NIL;
                                    final SubLObject truth2 = deductions_interface.kb_deduction_truth(d2);
                                    final SubLObject strength2 = deductions_interface.kb_deduction_strength(d2);
                                    format(s, $str24$_A__A__A__A, new SubLObject[]{ id2, supported_recipe2, truth2, strength2 });
                                    SubLObject cdolist_list_var2 = support_recipes2;
                                    SubLObject support_item2 = NIL;
                                    support_item2 = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        princ($$$_, s);
                                        princ(support_item2, s);
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        support_item2 = cdolist_list_var2.first();
                                    } 
                                    terpri(s);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                d_id2 = add(d_id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                $last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return directory;
    }

    public static SubLObject kb_text_dump_kb_hl_supports(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, $str25$kb_hl_supports);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str7$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
            final SubLObject mess = $$$Text_dumping_KB_HL_supports;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
            final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$30 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$30, $SKIP)) {
                        final SubLObject idx_$31 = idx_$30;
                        if (NIL == id_index_dense_objects_empty_p(idx_$31, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$31);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject s_id;
                            SubLObject s_handle;
                            SubLObject hl_support;
                            SubLObject module;
                            SubLObject elmt;
                            SubLObject sentence;
                            SubLObject tv;
                            SubLObject support;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                s_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                s_handle = aref(vector_var, s_id);
                                if ((NIL == id_index_tombstone_p(s_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(s_handle)) {
                                        s_handle = $SKIP;
                                    }
                                    hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                    module = kb_hl_supports_high.kb_hl_support_module(hl_support);
                                    elmt = kb_text_compact_hl_external_id_string_cached(cycl_utilities.hl_to_el(kb_hl_supports_high.kb_hl_support_mt(hl_support)));
                                    sentence = kb_text_cons_id_string(kb_hl_supports_high.kb_hl_support_el_sentence(hl_support));
                                    tv = kb_hl_supports_high.kb_hl_support_tv(hl_support);
                                    support = kb_text_cons_id_string(kb_hl_supports_high.kb_hl_support_hl_support(hl_support));
                                    princ(module, s);
                                    write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                    write_string(sentence, s, UNPROVIDED, UNPROVIDED);
                                    write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                    write_string(elmt, s, UNPROVIDED, UNPROVIDED);
                                    write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                    princ(tv, s);
                                    write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                    write_string(support, s, UNPROVIDED, UNPROVIDED);
                                    terpri(s);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$32 = idx_$30;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$32)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$32);
                            SubLObject s_id2 = id_index_sparse_id_threshold(idx_$32);
                            final SubLObject end_id = id_index_next_id(idx_$32);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (s_id2.numL(end_id)) {
                                final SubLObject s_handle2 = gethash_without_values(s_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(s_handle2))) {
                                    final SubLObject hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                    final SubLObject module2 = kb_hl_supports_high.kb_hl_support_module(hl_support2);
                                    final SubLObject elmt2 = kb_text_compact_hl_external_id_string_cached(cycl_utilities.hl_to_el(kb_hl_supports_high.kb_hl_support_mt(hl_support2)));
                                    final SubLObject sentence2 = kb_text_cons_id_string(kb_hl_supports_high.kb_hl_support_el_sentence(hl_support2));
                                    final SubLObject tv2 = kb_hl_supports_high.kb_hl_support_tv(hl_support2);
                                    final SubLObject support2 = kb_text_cons_id_string(kb_hl_supports_high.kb_hl_support_hl_support(hl_support2));
                                    princ(module2, s);
                                    write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                    write_string(sentence2, s, UNPROVIDED, UNPROVIDED);
                                    write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                    write_string(elmt2, s, UNPROVIDED, UNPROVIDED);
                                    write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                    princ(tv2, s);
                                    write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                    write_string(support2, s, UNPROVIDED, UNPROVIDED);
                                    terpri(s);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                s_id2 = add(s_id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                $last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return directory;
    }

    public static SubLObject kb_text_dump_unrepresented_terms(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, $str27$unrepresented_terms);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str7$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            final SubLObject str = $$$Text_dumping_unrepresented_terms;
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $silent_progressP$.currentBinding(thread);
            try {
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                $progress_notification_count$.bind(ZERO_INTEGER, thread);
                $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                $progress_count$.bind(ZERO_INTEGER, thread);
                $is_noting_progressP$.bind(T, thread);
                $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                noting_progress_preamble(str);
                final SubLObject iterator_var = unrepresented_terms.new_unrepresented_terms_iterator();
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject v_term = iteration.iteration_next(iterator_var);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        final SubLObject suid = funcall(LOOKUP_UNREPRESENTED_TERM_SUID, v_term);
                        princ(v_term, s);
                        write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                        princ(suid, s);
                        terpri(s);
                    }
                }
                noting_progress_postamble();
            } finally {
                $silent_progressP$.rebind(_prev_bind_9, thread);
                $is_noting_progressP$.rebind(_prev_bind_8, thread);
                $progress_count$.rebind(_prev_bind_7, thread);
                $progress_pacifications_since_last_nl$.rebind(_prev_bind_6, thread);
                $progress_notification_count$.rebind(_prev_bind_5, thread);
                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_4, thread);
                $progress_last_pacification_time$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_10, thread);
            }
        }
        return directory;
    }

    public static SubLObject kb_text_dump_index_assertion(final SubLObject s, final SubLObject assertion) {
        return princ(assertion_handles.assertion_id(assertion), s);
    }

    public static SubLObject kb_text_dump_constant_indexing(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, $str30$constant_indexing);
        final SubLObject tag_stack = stacks.create_stack();
        thread.resetMultipleValues();
        final SubLObject visitor = new_kb_text_dump_complex_visitor(tag_stack);
        final SubLObject parameters = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str7$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            putf(parameters, $STREAM, s);
            final SubLObject idx = do_constants_table();
            final SubLObject mess = $$$Text_dumping_constant_indexing;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
            final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$34 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$34, $SKIP)) {
                        final SubLObject idx_$35 = idx_$34;
                        if (NIL == id_index_dense_objects_empty_p(idx_$35, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$35);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject constant;
                            SubLObject index;
                            SubLObject tag;
                            SubLObject cdolist_list_var;
                            SubLObject assertion;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                constant = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(constant)) {
                                        constant = $SKIP;
                                    }
                                    index = term_index(constant);
                                    tag = kb_text_term_tag(constant);
                                    if (NIL != simple_index_p(index)) {
                                        cdolist_list_var = kb_text_sorted_term_assertion_list(constant);
                                        assertion = NIL;
                                        assertion = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            write_string(tag, s, UNPROVIDED, UNPROVIDED);
                                            write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                            kb_text_dump_index_assertion(s, assertion);
                                            terpri(s);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            assertion = cdolist_list_var.first();
                                        } 
                                    } else
                                        if (NIL != complex_index_p(index)) {
                                            stacks.clear_stack(tag_stack);
                                            stacks.stack_push(tag, tag_stack);
                                            indexing_utilities.visit_complex_index(index, visitor);
                                        } else {
                                            Errors.error($str33$Unsupported_index_type__A___, index);
                                        }

                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$36 = idx_$34;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$36)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$36);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$36);
                            final SubLObject end_id = id_index_next_id(idx_$36);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
                                    final SubLObject index2 = term_index(constant2);
                                    final SubLObject tag2 = kb_text_term_tag(constant2);
                                    if (NIL != simple_index_p(index2)) {
                                        SubLObject cdolist_list_var2 = kb_text_sorted_term_assertion_list(constant2);
                                        SubLObject assertion2 = NIL;
                                        assertion2 = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            write_string(tag2, s, UNPROVIDED, UNPROVIDED);
                                            write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                            kb_text_dump_index_assertion(s, assertion2);
                                            terpri(s);
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            assertion2 = cdolist_list_var2.first();
                                        } 
                                    } else
                                        if (NIL != complex_index_p(index2)) {
                                            stacks.clear_stack(tag_stack);
                                            stacks.stack_push(tag2, tag_stack);
                                            indexing_utilities.visit_complex_index(index2, visitor);
                                        } else {
                                            Errors.error($str33$Unsupported_index_type__A___, index2);
                                        }

                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                $last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return directory;
    }

    public static SubLObject kb_text_dump_nart_indexing(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, $str34$nart_indexing);
        final SubLObject tag_stack = stacks.create_stack();
        thread.resetMultipleValues();
        final SubLObject visitor = new_kb_text_dump_complex_visitor(tag_stack);
        final SubLObject parameters = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str7$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            putf(parameters, $STREAM, s);
            final SubLObject idx = nart_handles.do_narts_table();
            final SubLObject mess = $$$Text_dumping_NAT_indexing;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
            final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$38 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$38, $SKIP)) {
                        final SubLObject idx_$39 = idx_$38;
                        if (NIL == id_index_dense_objects_empty_p(idx_$39, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$39);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject nart;
                            SubLObject index;
                            SubLObject tag;
                            SubLObject cdolist_list_var;
                            SubLObject assertion;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                nart = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(nart)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(nart)) {
                                        nart = $SKIP;
                                    }
                                    index = term_index(nart);
                                    tag = kb_text_term_tag(nart);
                                    if (NIL != simple_index_p(index)) {
                                        cdolist_list_var = kb_text_sorted_term_assertion_list(nart);
                                        assertion = NIL;
                                        assertion = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            write_string(tag, s, UNPROVIDED, UNPROVIDED);
                                            write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                            kb_text_dump_index_assertion(s, assertion);
                                            terpri(s);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            assertion = cdolist_list_var.first();
                                        } 
                                    } else
                                        if (NIL != complex_index_p(index)) {
                                            stacks.clear_stack(tag_stack);
                                            stacks.stack_push(tag, tag_stack);
                                            indexing_utilities.visit_complex_index(index, visitor);
                                        } else {
                                            Errors.error($str33$Unsupported_index_type__A___, index);
                                        }

                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$40 = idx_$38;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$40)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$40);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$40);
                            final SubLObject end_id = id_index_next_id(idx_$40);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject nart2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(nart2))) {
                                    final SubLObject index2 = term_index(nart2);
                                    final SubLObject tag2 = kb_text_term_tag(nart2);
                                    if (NIL != simple_index_p(index2)) {
                                        SubLObject cdolist_list_var2 = kb_text_sorted_term_assertion_list(nart2);
                                        SubLObject assertion2 = NIL;
                                        assertion2 = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            write_string(tag2, s, UNPROVIDED, UNPROVIDED);
                                            write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                            kb_text_dump_index_assertion(s, assertion2);
                                            terpri(s);
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            assertion2 = cdolist_list_var2.first();
                                        } 
                                    } else
                                        if (NIL != complex_index_p(index2)) {
                                            stacks.clear_stack(tag_stack);
                                            stacks.stack_push(tag2, tag_stack);
                                            indexing_utilities.visit_complex_index(index2, visitor);
                                        } else {
                                            Errors.error($str33$Unsupported_index_type__A___, index2);
                                        }

                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                $last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return directory;
    }

    public static SubLObject kb_text_dump_unrepresented_term_indexing(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, $str36$unrepresented_term_indexing);
        final SubLObject tag_stack = stacks.create_stack();
        thread.resetMultipleValues();
        final SubLObject visitor = new_kb_text_dump_complex_visitor(tag_stack);
        final SubLObject parameters = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str7$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            putf(parameters, $STREAM, s);
            if (NIL != unrepresented_terms.use_unrepresented_term_fhtP()) {
                SubLObject msg = cconcatenate($str37$Text_dumping_unrepresented_term_i, $str38$____Old_Space);
                SubLObject release = NIL;
                try {
                    release = seize_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                    final SubLObject table_var = unrepresented_terms.get_unrepresented_term_fht();
                    $progress_note$.setDynamicValue(msg, thread);
                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    $progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                    final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject continuation = NIL;
                            SubLObject next;
                            for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
                                thread.resetMultipleValues();
                                final SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, NIL);
                                final SubLObject the_value = thread.secondMultipleValue();
                                next = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != next) {
                                    final SubLObject key = the_key;
                                    final SubLObject v_term = the_value;
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    if ((NIL == unrepresented_terms.deleted_unrepresented_term_itemP(key)) && (NIL != unrepresented_terms.fht_suid_item_p(key))) {
                                        final SubLObject id = unrepresented_terms.get_fht_suid_item_suid(key);
                                        final SubLObject index = term_index(v_term);
                                        final SubLObject tag = kb_text_term_tag(v_term);
                                        if (NIL != simple_index_p(index)) {
                                            SubLObject cdolist_list_var = kb_text_sorted_term_assertion_list(v_term);
                                            SubLObject assertion = NIL;
                                            assertion = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                write_string(tag, s, UNPROVIDED, UNPROVIDED);
                                                write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                                kb_text_dump_index_assertion(s, assertion);
                                                terpri(s);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                assertion = cdolist_list_var.first();
                                            } 
                                        } else
                                            if (NIL != complex_index_p(index)) {
                                                stacks.clear_stack(tag_stack);
                                                stacks.stack_push(tag, tag_stack);
                                                indexing_utilities.visit_complex_index(index, visitor);
                                            } else {
                                                Errors.error($str33$Unsupported_index_type__A___, index);
                                            }

                                    }
                                }
                                continuation = next;
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_2, thread);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                    }
                }
                msg = cconcatenate($str37$Text_dumping_unrepresented_term_i, $str39$____New_Space);
                if (NIL != unrepresented_terms.use_unrepresented_term_fhtP()) {
                    final SubLObject list_var = unrepresented_terms.get_unrepresented_term_new_space_ascending_suid_keys();
                    final SubLObject _prev_bind_2 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind(NIL != msg ? msg : $$$cdolist, thread);
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_total$.bind(length(list_var), thread);
                        $progress_sofar$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject suid_item = NIL;
                            suid_item = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                final SubLObject id2 = unrepresented_terms.get_fht_suid_item_suid(suid_item);
                                final SubLObject v_term2 = unrepresented_terms.find_unrepresented_term_by_suid(id2);
                                final SubLObject index = term_index(v_term2);
                                final SubLObject tag = kb_text_term_tag(v_term2);
                                if (NIL != simple_index_p(index)) {
                                    SubLObject cdolist_list_var = kb_text_sorted_term_assertion_list(v_term2);
                                    SubLObject assertion = NIL;
                                    assertion = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        write_string(tag, s, UNPROVIDED, UNPROVIDED);
                                        write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                        kb_text_dump_index_assertion(s, assertion);
                                        terpri(s);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        assertion = cdolist_list_var.first();
                                    } 
                                } else
                                    if (NIL != complex_index_p(index)) {
                                        stacks.clear_stack(tag_stack);
                                        stacks.stack_push(tag, tag_stack);
                                        indexing_utilities.visit_complex_index(index, visitor);
                                    } else {
                                        Errors.error($str33$Unsupported_index_type__A___, index);
                                    }

                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                suid_item = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_9, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_8, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_6, thread);
                        $progress_sofar$.rebind(_prev_bind_5, thread);
                        $progress_total$.rebind(_prev_bind_4, thread);
                        $progress_start_time$.rebind(_prev_bind_3, thread);
                        $progress_note$.rebind(_prev_bind_2, thread);
                    }
                } else {
                    final SubLObject table_var = unrepresented_terms.do_unrepresented_terms_table();
                    final SubLObject first_id_var = unrepresented_terms.new_unrepresented_term_id_threshold();
                    final SubLObject total = subtract(id_index_next_id(table_var), first_id_var);
                    SubLObject sofar = ZERO_INTEGER;
                    final SubLObject _prev_bind_10 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_13 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(msg);
                            SubLObject v_term;
                            SubLObject index;
                            SubLObject tag;
                            SubLObject cdolist_list_var;
                            SubLObject assertion;
                            SubLObject end_var;
                            SubLObject end;
                            SubLObject id3;
                            SubLObject id_$44;
                            for (end = end_var = id_index_next_id(table_var), id3 = NIL, id3 = first_id_var; !id3.numGE(end_var); id3 = number_utilities.f_1X(id3)) {
                                v_term = id_index_lookup(table_var, id3, UNPROVIDED);
                                if (NIL != v_term) {
                                    note_percent_progress(sofar, total);
                                    sofar = add(sofar, ONE_INTEGER);
                                    id_$44 = unrepresented_terms.unrepresented_term_suid(v_term);
                                    index = term_index(v_term);
                                    tag = kb_text_term_tag(v_term);
                                    if (NIL != simple_index_p(index)) {
                                        cdolist_list_var = kb_text_sorted_term_assertion_list(v_term);
                                        assertion = NIL;
                                        assertion = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            write_string(tag, s, UNPROVIDED, UNPROVIDED);
                                            write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                            kb_text_dump_index_assertion(s, assertion);
                                            terpri(s);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            assertion = cdolist_list_var.first();
                                        } 
                                    } else
                                        if (NIL != complex_index_p(index)) {
                                            stacks.clear_stack(tag_stack);
                                            stacks.stack_push(tag, tag_stack);
                                            indexing_utilities.visit_complex_index(index, visitor);
                                        } else {
                                            Errors.error($str33$Unsupported_index_type__A___, index);
                                        }

                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_13, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_12, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_11, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_10, thread);
                    }
                }
            } else {
                final SubLObject idx = unrepresented_terms.do_unrepresented_terms_table();
                final SubLObject mess = $str37$Text_dumping_unrepresented_term_i;
                final SubLObject total2 = id_index_count(idx);
                SubLObject sofar2 = ZERO_INTEGER;
                assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                final SubLObject _prev_bind_14 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_15 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_16 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_17 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(mess);
                        final SubLObject idx_$46 = idx;
                        if (NIL == id_index_objects_empty_p(idx_$46, $SKIP)) {
                            final SubLObject idx_$47 = idx_$46;
                            if (NIL == id_index_dense_objects_empty_p(idx_$47, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$47);
                                final SubLObject backwardP_var = NIL;
                                SubLObject id;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject v_term3;
                                SubLObject index2;
                                SubLObject tag2;
                                SubLObject cdolist_list_var2;
                                SubLObject assertion2;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    v_term3 = aref(vector_var, id);
                                    if ((NIL == id_index_tombstone_p(v_term3)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(v_term3)) {
                                            v_term3 = $SKIP;
                                        }
                                        index2 = term_index(v_term3);
                                        tag2 = kb_text_term_tag(v_term3);
                                        if (NIL != simple_index_p(index2)) {
                                            cdolist_list_var2 = kb_text_sorted_term_assertion_list(v_term3);
                                            assertion2 = NIL;
                                            assertion2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                write_string(tag2, s, UNPROVIDED, UNPROVIDED);
                                                write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                                kb_text_dump_index_assertion(s, assertion2);
                                                terpri(s);
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                assertion2 = cdolist_list_var2.first();
                                            } 
                                        } else
                                            if (NIL != complex_index_p(index2)) {
                                                stacks.clear_stack(tag_stack);
                                                stacks.stack_push(tag2, tag_stack);
                                                indexing_utilities.visit_complex_index(index2, visitor);
                                            } else {
                                                Errors.error($str33$Unsupported_index_type__A___, index2);
                                            }

                                        sofar2 = add(sofar2, ONE_INTEGER);
                                        note_percent_progress(sofar2, total2);
                                    }
                                }
                            }
                            final SubLObject idx_$48 = idx_$46;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$48)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$48);
                                SubLObject id4 = id_index_sparse_id_threshold(idx_$48);
                                final SubLObject end_id = id_index_next_id(idx_$48);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (id4.numL(end_id)) {
                                    final SubLObject v_term2 = gethash_without_values(id4, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(v_term2))) {
                                        final SubLObject index = term_index(v_term2);
                                        final SubLObject tag = kb_text_term_tag(v_term2);
                                        if (NIL != simple_index_p(index)) {
                                            SubLObject cdolist_list_var = kb_text_sorted_term_assertion_list(v_term2);
                                            SubLObject assertion = NIL;
                                            assertion = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                write_string(tag, s, UNPROVIDED, UNPROVIDED);
                                                write_string($$$_, s, UNPROVIDED, UNPROVIDED);
                                                kb_text_dump_index_assertion(s, assertion);
                                                terpri(s);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                assertion = cdolist_list_var.first();
                                            } 
                                        } else
                                            if (NIL != complex_index_p(index)) {
                                                stacks.clear_stack(tag_stack);
                                                stacks.stack_push(tag, tag_stack);
                                                indexing_utilities.visit_complex_index(index, visitor);
                                            } else {
                                                Errors.error($str33$Unsupported_index_type__A___, index);
                                            }

                                        sofar2 = add(sofar2, ONE_INTEGER);
                                        note_percent_progress(sofar2, total2);
                                    }
                                    id4 = add(id4, ONE_INTEGER);
                                } 
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values4 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values4);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_17, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_16, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_15, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_14, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_18 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values5 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values5);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_18, thread);
            }
        }
        return directory;
    }

    public static SubLObject kb_text_sorted_term_assertion_list(final SubLObject v_term) {
        final SubLObject raw_assertions = simple_term_assertion_list(v_term);
        final SubLObject sorted_assertions = assertion_utilities.sort_assertions(copy_list(raw_assertions));
        return sorted_assertions;
    }

    public static SubLObject new_kb_text_dump_complex_visitor(final SubLObject tag_stack) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject parameters = list($STREAM, StreamsLow.$standard_output$.getDynamicValue(thread), $PATH, tag_stack);
        final SubLObject visitor = indexing_utilities.new_complex_index_visitor(KB_TEXT_DUMP_COMPINX_VISIT_BEGIN_VISIT, KB_TEXT_DUMP_COMPINX_VISIT_BEGIN_SUBINDEX, KB_TEXT_DUMP_COMPINX_VISIT_FINAL_INDEX, KB_TEXT_DUMP_COMPINX_VISIT_END_SUBINDEX, KB_TEXT_DUMP_COMPINX_VISIT_END_VISIT, parameters);
        return values(visitor, parameters);
    }

    public static SubLObject kb_text_term_tag(final SubLObject v_term) {
        if (NIL != constant_p(v_term)) {
            return NIL != kb_text_hl_prototypical_termP(v_term) ? constants_high.constant_name(v_term) : Guids.guid_to_string(constants_high.constant_external_id(v_term));
        }
        if (v_term.isCons()) {
            return kb_text_cons_id_string(v_term);
        }
        return kb_text_compact_hl_external_id_string(v_term);
    }

    public static SubLObject kb_text_dump_compinx_visit_begin_visit(final SubLObject visitor, final SubLObject complex_index) {
        return visitor;
    }

    public static SubLObject kb_text_dump_compinx_visit_end_visit(final SubLObject visitor, final SubLObject complex_index) {
        return visitor;
    }

    public static SubLObject kb_text_dump_compinx_visit_begin_subindex(final SubLObject visitor, final SubLObject key, final SubLObject complex_index) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        final SubLObject tag_stack = getf(v_context, $PATH, UNPROVIDED);
        stacks.stack_push(kb_text_term_tag(key), tag_stack);
        return visitor;
    }

    public static SubLObject kb_text_dump_compinx_visit_final_index(final SubLObject visitor, final SubLObject final_key, final SubLObject final_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != final_topn_index_p(final_index)) {
            Errors.warn($str47$Skipping_final_top_N_index__A___, final_index);
            return visitor;
        }
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        final SubLObject tag_stack = getf(v_context, $PATH, UNPROVIDED);
        final SubLObject stream = getf(v_context, $STREAM, UNPROVIDED);
        stacks.stack_push(kb_text_term_tag(final_key), tag_stack);
        final SubLObject _prev_bind_0 = $ordered_final_index_resource$.currentBinding(thread);
        try {
            $ordered_final_index_resource$.bind(NIL, thread);
            if (NIL != final_index) {
                if (NIL != final_unified_index_p(final_index)) {
                    SubLObject leaf_items = set.set_element_list(final_unified_index_set(final_index));
                    SubLObject csome_list_var;
                    leaf_items = csome_list_var = assertion_utilities.sort_assertions(leaf_items);
                    SubLObject leaf = NIL;
                    leaf = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        kb_text_dump_dumpinx_visit_write_path(stream, tag_stack);
                        write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
                        kb_text_dump_index_assertion(stream, leaf);
                        terpri(stream);
                        csome_list_var = csome_list_var.rest();
                        leaf = csome_list_var.first();
                    } 
                } else
                    if (NIL != final_sharded_index_p(final_index)) {
                        final SubLObject shard_key_list = Sort.sort(map_utilities.map_keys(final_sharded_index_shard_map(final_index)), $sym48$_, UNPROVIDED);
                        SubLObject shard_contents = NIL;
                        SubLObject csome_list_var2 = shard_key_list;
                        SubLObject key = NIL;
                        key = csome_list_var2.first();
                        while (NIL != csome_list_var2) {
                            final SubLObject shard = map_utilities.map_get(final_sharded_index_shard_map(final_index), key, UNPROVIDED);
                            final SubLObject vector_var;
                            shard_contents = vector_var = ordered_final_sharded_index_extract_contents(shard, shard_contents);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject element_num;
                            SubLObject leaf2;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                leaf2 = aref(vector_var, element_num);
                                if (NIL != assertion_handles.assertion_p(leaf2)) {
                                    kb_text_dump_dumpinx_visit_write_path(stream, tag_stack);
                                    write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
                                    kb_text_dump_index_assertion(stream, leaf2);
                                    terpri(stream);
                                }
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            key = csome_list_var2.first();
                        } 
                    } else
                        if (NIL != final_topn_index_p(final_index)) {
                            final SubLObject iterator_var = new_ordered_final_topn_index_iterator(final_index);
                            SubLObject valid;
                            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                                thread.resetMultipleValues();
                                final SubLObject leaf = iteration.iteration_next(iterator_var);
                                valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    kb_text_dump_dumpinx_visit_write_path(stream, tag_stack);
                                    write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
                                    kb_text_dump_index_assertion(stream, leaf);
                                    terpri(stream);
                                }
                            }
                        } else {
                            SubLTrampolineFile.enforceType(final_index, FINAL_INDEX_P);
                        }


            }
        } finally {
            $ordered_final_index_resource$.rebind(_prev_bind_0, thread);
        }
        stacks.stack_pop(tag_stack);
        return visitor;
    }

    public static SubLObject kb_text_dump_compinx_visit_end_subindex(final SubLObject visitor, final SubLObject key, final SubLObject complex_index) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        final SubLObject tag_stack = getf(v_context, $PATH, UNPROVIDED);
        stacks.stack_pop(tag_stack);
        return visitor;
    }

    public static SubLObject kb_text_dump_dumpinx_visit_write_path(final SubLObject stream, final SubLObject tag_stack) {
        final SubLObject elements = funcall(DO_STACK_ELEMENTS_STACK_ELEMENTS, tag_stack);
        kb_text_dump_dumpinx_visit_write_path_item(stream, elements);
        return stream;
    }

    public static SubLObject kb_text_dump_dumpinx_visit_write_path_item(final SubLObject stream, final SubLObject elements) {
        SubLObject item = NIL;
        destructuring_bind_must_consp(elements, elements, $list51);
        item = elements.first();
        final SubLObject items;
        final SubLObject current = items = elements.rest();
        if (NIL != list_utilities.sublisp_boolean(items)) {
            kb_text_dump_dumpinx_visit_write_path_item(stream, items);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string(item, stream, UNPROVIDED, UNPROVIDED);
        return stream;
    }

    public static SubLObject kb_text_convert_deduction_support_to_recipe(final SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return cconcatenate($str52$A_, format_nil.format_nil_d_no_copy(assertion_handles.assertion_id(support)));
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_text_convert_deduction_support_to_recipe(kb_hl_supports_high.kb_hl_support_hl_support(support));
        }
        return kb_text_cons_id_string(support);
    }

    public static SubLObject kb_text_convert_deduction_supports_to_support_recipe(final SubLObject supports) {
        return Sort.sort(Mapping.mapcar(KB_TEXT_CONVERT_DEDUCTION_SUPPORT_TO_RECIPE, supports), $sym54$STRING_, UNPROVIDED);
    }

    public static SubLObject kb_text_cons_id_string(final SubLObject cons) {
        return kb_text_compact_hl_external_id_string(kb_text_convert_potential_prototypical_terms(cons));
    }

    public static SubLObject kb_text_compact_hl_external_id_string(final SubLObject v_object) {
        return kb_utilities.compact_hl_external_id_string(v_object);
    }

    public static SubLObject clear_kb_text_compact_hl_external_id_string_cached() {
        final SubLObject cs = $kb_text_compact_hl_external_id_string_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_kb_text_compact_hl_external_id_string_cached(final SubLObject v_object) {
        return memoization_state.caching_state_remove_function_results_with_args($kb_text_compact_hl_external_id_string_cached_caching_state$.getGlobalValue(), list(v_object), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject kb_text_compact_hl_external_id_string_cached_internal(final SubLObject v_object) {
        return kb_text_compact_hl_external_id_string(v_object);
    }

    public static SubLObject kb_text_compact_hl_external_id_string_cached(final SubLObject v_object) {
        SubLObject caching_state = $kb_text_compact_hl_external_id_string_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(KB_TEXT_COMPACT_HL_EXTERNAL_ID_STRING_CACHED, $kb_text_compact_hl_external_id_string_cached_caching_state$, NIL, EQL, ONE_INTEGER, $int$10000);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(kb_text_compact_hl_external_id_string_cached_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject kb_text_dump_file(final SubLObject directory, final SubLObject file) {
        return file_utilities.relative_filename(directory, file, $$$kbtext);
    }

    public static SubLObject declare_kb_text_dump_file() {
        declareFunction(me, "get_hl_prototypical_terms", "GET-HL-PROTOTYPICAL-TERMS", 0, 0, false);
        declareFunction(me, "kb_text_hl_prototypical_termP", "KB-TEXT-HL-PROTOTYPICAL-TERM?", 1, 0, false);
        declareFunction(me, "kb_text_convert_potential_prototypical_terms", "KB-TEXT-CONVERT-POTENTIAL-PROTOTYPICAL-TERMS", 1, 0, false);
        declareFunction(me, "kb_text_dump_essential_kb", "KB-TEXT-DUMP-ESSENTIAL-KB", 1, 0, false);
        declareFunction(me, "kb_text_dump_kb", "KB-TEXT-DUMP-KB", 1, 0, false);
        declareFunction(me, "kb_text_dump_indexing", "KB-TEXT-DUMP-INDEXING", 1, 0, false);
        declareFunction(me, "kb_text_dump_constants", "KB-TEXT-DUMP-CONSTANTS", 1, 0, false);
        declareFunction(me, "kb_text_dump_narts", "KB-TEXT-DUMP-NARTS", 1, 0, false);
        declareFunction(me, "kb_text_dump_assertions", "KB-TEXT-DUMP-ASSERTIONS", 1, 0, false);
        declareFunction(me, "kb_text_dump_meta_assertions", "KB-TEXT-DUMP-META-ASSERTIONS", 1, 2, false);
        declareFunction(me, "kb_text_dump_meta_assertions_to_stream", "KB-TEXT-DUMP-META-ASSERTIONS-TO-STREAM", 1, 2, false);
        declareFunction(me, "kb_text_dump_assertion_to_stream", "KB-TEXT-DUMP-ASSERTION-TO-STREAM", 2, 0, false);
        declareFunction(me, "kb_text_dump_deductions", "KB-TEXT-DUMP-DEDUCTIONS", 1, 0, false);
        declareFunction(me, "kb_text_dump_kb_hl_supports", "KB-TEXT-DUMP-KB-HL-SUPPORTS", 1, 0, false);
        declareFunction(me, "kb_text_dump_unrepresented_terms", "KB-TEXT-DUMP-UNREPRESENTED-TERMS", 1, 0, false);
        declareFunction(me, "kb_text_dump_index_assertion", "KB-TEXT-DUMP-INDEX-ASSERTION", 2, 0, false);
        declareFunction(me, "kb_text_dump_constant_indexing", "KB-TEXT-DUMP-CONSTANT-INDEXING", 1, 0, false);
        declareFunction(me, "kb_text_dump_nart_indexing", "KB-TEXT-DUMP-NART-INDEXING", 1, 0, false);
        declareFunction(me, "kb_text_dump_unrepresented_term_indexing", "KB-TEXT-DUMP-UNREPRESENTED-TERM-INDEXING", 1, 0, false);
        declareFunction(me, "kb_text_sorted_term_assertion_list", "KB-TEXT-SORTED-TERM-ASSERTION-LIST", 1, 0, false);
        declareFunction(me, "new_kb_text_dump_complex_visitor", "NEW-KB-TEXT-DUMP-COMPLEX-VISITOR", 1, 0, false);
        declareFunction(me, "kb_text_term_tag", "KB-TEXT-TERM-TAG", 1, 0, false);
        declareFunction(me, "kb_text_dump_compinx_visit_begin_visit", "KB-TEXT-DUMP-COMPINX-VISIT-BEGIN-VISIT", 2, 0, false);
        declareFunction(me, "kb_text_dump_compinx_visit_end_visit", "KB-TEXT-DUMP-COMPINX-VISIT-END-VISIT", 2, 0, false);
        declareFunction(me, "kb_text_dump_compinx_visit_begin_subindex", "KB-TEXT-DUMP-COMPINX-VISIT-BEGIN-SUBINDEX", 3, 0, false);
        declareFunction(me, "kb_text_dump_compinx_visit_final_index", "KB-TEXT-DUMP-COMPINX-VISIT-FINAL-INDEX", 3, 0, false);
        declareFunction(me, "kb_text_dump_compinx_visit_end_subindex", "KB-TEXT-DUMP-COMPINX-VISIT-END-SUBINDEX", 3, 0, false);
        declareFunction(me, "kb_text_dump_dumpinx_visit_write_path", "KB-TEXT-DUMP-DUMPINX-VISIT-WRITE-PATH", 2, 0, false);
        declareFunction(me, "kb_text_dump_dumpinx_visit_write_path_item", "KB-TEXT-DUMP-DUMPINX-VISIT-WRITE-PATH-ITEM", 2, 0, false);
        declareFunction(me, "kb_text_convert_deduction_support_to_recipe", "KB-TEXT-CONVERT-DEDUCTION-SUPPORT-TO-RECIPE", 1, 0, false);
        declareFunction(me, "kb_text_convert_deduction_supports_to_support_recipe", "KB-TEXT-CONVERT-DEDUCTION-SUPPORTS-TO-SUPPORT-RECIPE", 1, 0, false);
        declareFunction(me, "kb_text_cons_id_string", "KB-TEXT-CONS-ID-STRING", 1, 0, false);
        declareFunction(me, "kb_text_compact_hl_external_id_string", "KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        declareFunction(me, "clear_kb_text_compact_hl_external_id_string_cached", "CLEAR-KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED", 0, 0, false);
        declareFunction(me, "remove_kb_text_compact_hl_external_id_string_cached", "REMOVE-KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED", 1, 0, false);
        declareFunction(me, "kb_text_compact_hl_external_id_string_cached_internal", "KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED-INTERNAL", 1, 0, false);
        declareFunction(me, "kb_text_compact_hl_external_id_string_cached", "KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED", 1, 0, false);
        declareFunction(me, "kb_text_dump_file", "KB-TEXT-DUMP-FILE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_kb_text_dump_file() {
        defparameter("*KB-TEXT-HL-PROTOTYPICAL-TERMS*", set.new_set(UNPROVIDED, UNPROVIDED));
        deflexical("*KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_kb_text_dump_file() {
        register_external_symbol(KB_TEXT_DUMP_ESSENTIAL_KB);
        register_external_symbol(KB_TEXT_DUMP_KB);
        memoization_state.note_globally_cached_function(KB_TEXT_COMPACT_HL_EXTERNAL_ID_STRING_CACHED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_text_dump_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_text_dump_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_text_dump_file();
    }

    static {






























































    }
}

/**
 * Total time: 1330 ms
 */
