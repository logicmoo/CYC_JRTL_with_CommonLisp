package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_text_dump extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_text_dump";
    public static final String myFingerPrint = "462e52903d1041a717bb1fc91ae493bf1e66466307e35224ab95c1fab2edb3ce";
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 822L)
    private static SubLSymbol $kb_text_hl_prototypical_terms$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15602L)
    private static SubLSymbol $kb_text_compact_hl_external_id_string_cached_caching_state$;
    private static final SubLObject $const0$HLPrototypicalTerm;
    private static final SubLSymbol $sym1$KB_TEXT_HL_PROTOTYPICAL_TERM_;
    private static final SubLSymbol $sym2$CONSTANT_NAME;
    private static final SubLSymbol $sym3$KB_TEXT_DUMP_ESSENTIAL_KB;
    private static final SubLSymbol $sym4$KB_TEXT_DUMP_KB;
    private static final SubLString $str5$constants;
    private static final SubLSymbol $kw6$OUTPUT;
    private static final SubLString $str7$Unable_to_open__S;
    private static final SubLString $str8$Text_dumping_constants;
    private static final SubLSymbol $sym9$STRINGP;
    private static final SubLSymbol $kw10$SKIP;
    private static final SubLString $str11$_;
    private static final SubLString $str12$narts;
    private static final SubLString $str13$Text_dumping_narts;
    private static final SubLString $str14$assertions;
    private static final SubLString $str15$Text_dumping_assertions;
    private static final SubLSymbol $sym16$STREAMP;
    private static final SubLSymbol $sym17$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const18$EverythingPSC;
    private static final SubLString $str19$Mapping_meta_assertions;
    private static final SubLSymbol $sym20$ASSERTION_P;
    private static final SubLString $str21$_A_;
    private static final SubLString $str22$deductions;
    private static final SubLString $str23$Text_dumping_deductions;
    private static final SubLString $str24$_A__A__A__A;
    private static final SubLString $str25$kb_hl_supports;
    private static final SubLString $str26$Text_dumping_KB_HL_supports;
    private static final SubLString $str27$unrepresented_terms;
    private static final SubLString $str28$Text_dumping_unrepresented_terms;
    private static final SubLSymbol $sym29$LOOKUP_UNREPRESENTED_TERM_SUID;
    private static final SubLString $str30$constant_indexing;
    private static final SubLSymbol $kw31$STREAM;
    private static final SubLString $str32$Text_dumping_constant_indexing;
    private static final SubLString $str33$Unsupported_index_type__A___;
    private static final SubLString $str34$nart_indexing;
    private static final SubLString $str35$Text_dumping_NAT_indexing;
    private static final SubLString $str36$unrepresented_term_indexing;
    private static final SubLString $str37$Text_dumping_unrepresented_term_i;
    private static final SubLString $str38$____Old_Space;
    private static final SubLString $str39$____New_Space;
    private static final SubLString $str40$cdolist;
    private static final SubLSymbol $kw41$PATH;
    private static final SubLSymbol $sym42$KB_TEXT_DUMP_COMPINX_VISIT_BEGIN_VISIT;
    private static final SubLSymbol $sym43$KB_TEXT_DUMP_COMPINX_VISIT_BEGIN_SUBINDEX;
    private static final SubLSymbol $sym44$KB_TEXT_DUMP_COMPINX_VISIT_FINAL_INDEX;
    private static final SubLSymbol $sym45$KB_TEXT_DUMP_COMPINX_VISIT_END_SUBINDEX;
    private static final SubLSymbol $sym46$KB_TEXT_DUMP_COMPINX_VISIT_END_VISIT;
    private static final SubLString $str47$Skipping_final_top_N_index__A___;
    private static final SubLSymbol $sym48$_;
    private static final SubLSymbol $sym49$FINAL_INDEX_P;
    private static final SubLSymbol $sym50$DO_STACK_ELEMENTS_STACK_ELEMENTS;
    private static final SubLList $list51;
    private static final SubLString $str52$A_;
    private static final SubLSymbol $sym53$KB_TEXT_CONVERT_DEDUCTION_SUPPORT_TO_RECIPE;
    private static final SubLSymbol $sym54$STRING_;
    private static final SubLSymbol $sym55$KB_TEXT_COMPACT_HL_EXTERNAL_ID_STRING_CACHED;
    private static final SubLSymbol $sym56$_KB_TEXT_COMPACT_HL_EXTERNAL_ID_STRING_CACHED_CACHING_STATE_;
    private static final SubLInteger $int57$10000;
    private static final SubLString $str58$kbtext;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 998L)
    public static SubLObject get_hl_prototypical_terms() {
        return set_utilities.construct_set_from_list(isa.quoted_instances(kb_text_dump.$const0$HLPrototypicalTerm, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED), (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 1111L)
    public static SubLObject kb_text_hl_prototypical_termP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_memberP(v_term, kb_text_dump.$kb_text_hl_prototypical_terms$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 1217L)
    public static SubLObject kb_text_convert_potential_prototypical_terms(final SubLObject cons) {
        if (kb_text_dump.NIL == list_utilities.tree_find_if((SubLObject)kb_text_dump.$sym1$KB_TEXT_HL_PROTOTYPICAL_TERM_, cons, (SubLObject)kb_text_dump.UNPROVIDED)) {
            return cons;
        }
        return list_utilities.tree_transform_if(cons, (SubLObject)kb_text_dump.$sym1$KB_TEXT_HL_PROTOTYPICAL_TERM_, (SubLObject)kb_text_dump.$sym2$CONSTANT_NAME, (SubLObject)kb_text_dump.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 1553L)
    public static SubLObject kb_text_dump_essential_kb(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_text_dump.$kb_text_hl_prototypical_terms$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_3 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            kb_text_dump.$kb_text_hl_prototypical_terms$.bind(get_hl_prototypical_terms(), thread);
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            kb_text_dump_constants(directory);
            kb_text_dump_narts(directory);
            kb_text_dump_assertions(directory);
            kb_text_dump_deductions(directory);
            kb_text_dump_kb_hl_supports(directory);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_3, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_2, thread);
            kb_text_dump.$kb_text_hl_prototypical_terms$.rebind(_prev_bind_0, thread);
        }
        return directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 2036L)
    public static SubLObject kb_text_dump_kb(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kb_text_dump_essential_kb(directory);
        final SubLObject _prev_bind_0 = kb_text_dump.$kb_text_hl_prototypical_terms$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_3 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            kb_text_dump.$kb_text_hl_prototypical_terms$.bind(get_hl_prototypical_terms(), thread);
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            kb_text_dump_unrepresented_terms(directory);
            kb_text_dump_indexing(directory);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_3, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_2, thread);
            kb_text_dump.$kb_text_hl_prototypical_terms$.rebind(_prev_bind_0, thread);
        }
        return directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 2432L)
    public static SubLObject kb_text_dump_indexing(final SubLObject directory) {
        kb_text_dump_constant_indexing(directory);
        kb_text_dump_nart_indexing(directory);
        kb_text_dump_unrepresented_term_indexing(directory);
        return directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 2703L)
    public static SubLObject kb_text_dump_constants(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, (SubLObject)kb_text_dump.$str5$constants);
        SubLObject stream = (SubLObject)kb_text_dump.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kb_text_dump.NIL, thread);
                stream = compatibility.open_text(file, (SubLObject)kb_text_dump.$kw6$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kb_text_dump.$str7$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            final SubLObject idx = constant_handles.do_constants_table();
            final SubLObject mess = (SubLObject)kb_text_dump.$str8$Text_dumping_constants;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kb_text_dump.ZERO_INTEGER;
            assert kb_text_dump.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_text_dump.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_text_dump.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_text_dump.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$1 = idx;
                    if (kb_text_dump.NIL == id_index.id_index_objects_empty_p(idx_$1, (SubLObject)kb_text_dump.$kw10$SKIP)) {
                        final SubLObject idx_$2 = idx_$1;
                        if (kb_text_dump.NIL == id_index.id_index_dense_objects_empty_p(idx_$2, (SubLObject)kb_text_dump.$kw10$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$2);
                            final SubLObject backwardP_var = (SubLObject)kb_text_dump.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject constant;
                            SubLObject name;
                            SubLObject suid;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_text_dump.NIL, v_iteration = (SubLObject)kb_text_dump.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER)) {
                                id = ((kb_text_dump.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER) : v_iteration);
                                constant = Vectors.aref(vector_var, id);
                                if (kb_text_dump.NIL == id_index.id_index_tombstone_p(constant) || kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) {
                                    if (kb_text_dump.NIL != id_index.id_index_tombstone_p(constant)) {
                                        constant = (SubLObject)kb_text_dump.$kw10$SKIP;
                                    }
                                    name = constants_high.constant_name(constant);
                                    suid = constants_high.constant_internal_id(constant);
                                    streams_high.write_string(kb_text_term_tag(constant), s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string(name, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    print_high.princ(suid, s);
                                    streams_high.terpri(s);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_text_dump.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$3 = idx_$1;
                        if (kb_text_dump.NIL == id_index.id_index_sparse_objects_empty_p(idx_$3) || kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$3);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$3);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$3);
                            final SubLObject v_default = (SubLObject)((kb_text_dump.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) ? kb_text_dump.NIL : kb_text_dump.$kw10$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject constant2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP) || kb_text_dump.NIL == id_index.id_index_tombstone_p(constant2)) {
                                    final SubLObject name2 = constants_high.constant_name(constant2);
                                    final SubLObject suid2 = constants_high.constant_internal_id(constant2);
                                    streams_high.write_string(kb_text_term_tag(constant2), s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string(name2, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    print_high.princ(suid2, s);
                                    streams_high.terpri(s);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_text_dump.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                id2 = Numbers.add(id2, (SubLObject)kb_text_dump.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kb_text_dump.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 3261L)
    public static SubLObject kb_text_dump_narts(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, (SubLObject)kb_text_dump.$str12$narts);
        SubLObject stream = (SubLObject)kb_text_dump.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kb_text_dump.NIL, thread);
                stream = compatibility.open_text(file, (SubLObject)kb_text_dump.$kw6$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kb_text_dump.$str7$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            final SubLObject idx = nart_handles.do_narts_table();
            final SubLObject mess = (SubLObject)kb_text_dump.$str13$Text_dumping_narts;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kb_text_dump.ZERO_INTEGER;
            assert kb_text_dump.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_text_dump.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_text_dump.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_text_dump.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$5 = idx;
                    if (kb_text_dump.NIL == id_index.id_index_objects_empty_p(idx_$5, (SubLObject)kb_text_dump.$kw10$SKIP)) {
                        final SubLObject idx_$6 = idx_$5;
                        if (kb_text_dump.NIL == id_index.id_index_dense_objects_empty_p(idx_$6, (SubLObject)kb_text_dump.$kw10$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$6);
                            final SubLObject backwardP_var = (SubLObject)kb_text_dump.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject nart;
                            SubLObject suid;
                            SubLObject formula;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_text_dump.NIL, v_iteration = (SubLObject)kb_text_dump.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER)) {
                                id = ((kb_text_dump.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER) : v_iteration);
                                nart = Vectors.aref(vector_var, id);
                                if (kb_text_dump.NIL == id_index.id_index_tombstone_p(nart) || kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) {
                                    if (kb_text_dump.NIL != id_index.id_index_tombstone_p(nart)) {
                                        nart = (SubLObject)kb_text_dump.$kw10$SKIP;
                                    }
                                    suid = nart_handles.nart_id(nart);
                                    formula = kb_text_cons_id_string(narts_high.nart_hl_formula(nart));
                                    streams_high.write_string(formula, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    print_high.princ(suid, s);
                                    streams_high.terpri(s);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_text_dump.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$7 = idx_$5;
                        if (kb_text_dump.NIL == id_index.id_index_sparse_objects_empty_p(idx_$7) || kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$7);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$7);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$7);
                            final SubLObject v_default = (SubLObject)((kb_text_dump.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) ? kb_text_dump.NIL : kb_text_dump.$kw10$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject nart2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP) || kb_text_dump.NIL == id_index.id_index_tombstone_p(nart2)) {
                                    final SubLObject suid2 = nart_handles.nart_id(nart2);
                                    final SubLObject formula2 = kb_text_cons_id_string(narts_high.nart_hl_formula(nart2));
                                    streams_high.write_string(formula2, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    print_high.princ(suid2, s);
                                    streams_high.terpri(s);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_text_dump.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                id2 = Numbers.add(id2, (SubLObject)kb_text_dump.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kb_text_dump.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 3699L)
    public static SubLObject kb_text_dump_assertions(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, (SubLObject)kb_text_dump.$str14$assertions);
        SubLObject stream = (SubLObject)kb_text_dump.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kb_text_dump.NIL, thread);
                stream = compatibility.open_text(file, (SubLObject)kb_text_dump.$kw6$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kb_text_dump.$str7$Unable_to_open__S, file);
            }
            final SubLObject stream_$9 = stream;
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = (SubLObject)kb_text_dump.$str15$Text_dumping_assertions;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kb_text_dump.ZERO_INTEGER;
            assert kb_text_dump.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_text_dump.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_text_dump.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_text_dump.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$10 = idx;
                    if (kb_text_dump.NIL == id_index.id_index_objects_empty_p(idx_$10, (SubLObject)kb_text_dump.$kw10$SKIP)) {
                        final SubLObject idx_$11 = idx_$10;
                        if (kb_text_dump.NIL == id_index.id_index_dense_objects_empty_p(idx_$11, (SubLObject)kb_text_dump.$kw10$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$11);
                            final SubLObject backwardP_var = (SubLObject)kb_text_dump.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_text_dump.NIL, v_iteration = (SubLObject)kb_text_dump.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER)) {
                                a_id = ((kb_text_dump.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER) : v_iteration);
                                a_handle = Vectors.aref(vector_var, a_id);
                                if (kb_text_dump.NIL == id_index.id_index_tombstone_p(a_handle) || kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) {
                                    if (kb_text_dump.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                        a_handle = (SubLObject)kb_text_dump.$kw10$SKIP;
                                    }
                                    assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    kb_text_dump_assertion_to_stream(assertion, stream_$9);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_text_dump.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$12 = idx_$10;
                        if (kb_text_dump.NIL == id_index.id_index_sparse_objects_empty_p(idx_$12) || kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$12);
                            SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$12);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$12);
                            final SubLObject v_default = (SubLObject)((kb_text_dump.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) ? kb_text_dump.NIL : kb_text_dump.$kw10$SKIP);
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                if (kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP) || kb_text_dump.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                    final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    kb_text_dump_assertion_to_stream(assertion2, stream_$9);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_text_dump.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                a_id2 = Numbers.add(a_id2, (SubLObject)kb_text_dump.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kb_text_dump.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 3996L)
    public static SubLObject kb_text_dump_meta_assertions(final SubLObject filename, SubLObject test, SubLObject limit) {
        if (test == kb_text_dump.UNPROVIDED) {
            test = (SubLObject)kb_text_dump.IDENTITY;
        }
        if (limit == kb_text_dump.UNPROVIDED) {
            limit = (SubLObject)kb_text_dump.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_text_dump.NIL;
        SubLObject stream = (SubLObject)kb_text_dump.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kb_text_dump.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)kb_text_dump.$kw6$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kb_text_dump.$str7$Unable_to_open__S, filename);
            }
            final SubLObject stream_$14 = stream;
            result = kb_text_dump_meta_assertions_to_stream(stream_$14, test, limit);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kb_text_dump.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 4386L)
    public static SubLObject kb_text_dump_meta_assertions_to_stream(final SubLObject stream, SubLObject test, SubLObject limit) {
        if (test == kb_text_dump.UNPROVIDED) {
            test = (SubLObject)kb_text_dump.IDENTITY;
        }
        if (limit == kb_text_dump.UNPROVIDED) {
            limit = (SubLObject)kb_text_dump.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_text_dump.NIL != Types.streamp(stream) : stream;
        SubLObject total = (SubLObject)kb_text_dump.ZERO_INTEGER;
        SubLObject doneP = (SubLObject)kb_text_dump.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_text_dump.$sym17$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_text_dump.$const18$EverythingPSC, thread);
            final SubLObject total_$15 = kb_indexing_datastructures.assertions_with_meta_assertions_count();
            SubLObject sofar = (SubLObject)kb_text_dump.ZERO_INTEGER;
            final SubLObject _prev_bind_0_$16 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$17 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_text_dump.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_text_dump.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_text_dump.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble((SubLObject)kb_text_dump.$str19$Mapping_meta_assertions);
                    final SubLObject iterator_var = kb_indexing_datastructures.new_assertions_with_meta_assertions_iterator();
                    SubLObject valid;
                    for (SubLObject done_var = doneP; kb_text_dump.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_text_dump.NIL == valid || kb_text_dump.NIL != doneP)) {
                        thread.resetMultipleValues();
                        final SubLObject non_meta = iteration.iteration_next(iterator_var);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (kb_text_dump.NIL != valid) {
                            if (kb_text_dump.NIL != kb_mapping_macros.do_term_index_key_validator(non_meta, (SubLObject)kb_text_dump.NIL)) {
                                final SubLObject iterator_var_$18 = kb_mapping_macros.new_term_final_index_spec_iterator(non_meta, (SubLObject)kb_text_dump.NIL);
                                SubLObject done_var_$19 = doneP;
                                final SubLObject token_var = (SubLObject)kb_text_dump.NIL;
                                while (kb_text_dump.NIL == done_var_$19) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var_$18, token_var);
                                    final SubLObject valid_$20 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                    if (kb_text_dump.NIL != valid_$20) {
                                        SubLObject final_index_iterator = (SubLObject)kb_text_dump.NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_text_dump.NIL, (SubLObject)kb_text_dump.NIL, (SubLObject)kb_text_dump.NIL);
                                            SubLObject done_var_$20 = doneP;
                                            final SubLObject token_var_$22 = (SubLObject)kb_text_dump.NIL;
                                            while (kb_text_dump.NIL == done_var_$20) {
                                                final SubLObject meta = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$22);
                                                final SubLObject valid_$21 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$22.eql(meta));
                                                if (kb_text_dump.NIL != valid_$21 && kb_text_dump.NIL != kb_mapping_macros.do_term_index_assertion_match_p(meta, final_index_spec) && kb_text_dump.NIL != Functions.funcall(test, meta)) {
                                                    kb_text_dump_assertion_to_stream(meta, stream);
                                                    total = Numbers.add(total, (SubLObject)kb_text_dump.ONE_INTEGER);
                                                    if (kb_text_dump.NIL != limit) {
                                                        doneP = Numbers.numGE(total, limit);
                                                    }
                                                }
                                                done_var_$20 = (SubLObject)SubLObjectFactory.makeBoolean(kb_text_dump.NIL == valid_$21 || kb_text_dump.NIL != doneP);
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                if (kb_text_dump.NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                            }
                                        }
                                    }
                                    done_var_$19 = (SubLObject)SubLObjectFactory.makeBoolean(kb_text_dump.NIL == valid_$20 || kb_text_dump.NIL != doneP);
                                }
                            }
                            sofar = Numbers.add(sofar, (SubLObject)kb_text_dump.ONE_INTEGER);
                            utilities_macros.note_percent_progress(sofar, total_$15);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$17, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$16, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 5017L)
    public static SubLObject kb_text_dump_assertion_to_stream(final SubLObject assertion, final SubLObject stream) {
        assert kb_text_dump.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject suid = assertion_handles.assertion_id(assertion);
        final SubLObject elmt = kb_text_compact_hl_external_id_string_cached(uncanonicalizer.assertion_elmt(assertion));
        final SubLObject sentence = kb_text_cons_id_string(assertions_high.assertion_cnf(assertion));
        PrintLow.format(stream, (SubLObject)kb_text_dump.$str21$_A_, suid);
        streams_high.write_string(elmt, stream, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
        streams_high.write_string((SubLObject)kb_text_dump.$str11$_, stream, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
        streams_high.write_string(sentence, stream, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
        streams_high.write_string((SubLObject)kb_text_dump.$str11$_, stream, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
        streams_high.terpri(stream);
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 5509L)
    public static SubLObject kb_text_dump_deductions(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, (SubLObject)kb_text_dump.$str22$deductions);
        SubLObject stream = (SubLObject)kb_text_dump.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kb_text_dump.NIL, thread);
                stream = compatibility.open_text(file, (SubLObject)kb_text_dump.$kw6$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kb_text_dump.$str7$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            final SubLObject idx = deduction_handles.do_deductions_table();
            final SubLObject mess = (SubLObject)kb_text_dump.$str23$Text_dumping_deductions;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kb_text_dump.ZERO_INTEGER;
            assert kb_text_dump.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_text_dump.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_text_dump.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_text_dump.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$26 = idx;
                    if (kb_text_dump.NIL == id_index.id_index_objects_empty_p(idx_$26, (SubLObject)kb_text_dump.$kw10$SKIP)) {
                        final SubLObject idx_$27 = idx_$26;
                        if (kb_text_dump.NIL == id_index.id_index_dense_objects_empty_p(idx_$27, (SubLObject)kb_text_dump.$kw10$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$27);
                            final SubLObject backwardP_var = (SubLObject)kb_text_dump.NIL;
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
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_text_dump.NIL, v_iteration = (SubLObject)kb_text_dump.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER)) {
                                d_id = ((kb_text_dump.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER) : v_iteration);
                                d_handle = Vectors.aref(vector_var, d_id);
                                if (kb_text_dump.NIL == id_index.id_index_tombstone_p(d_handle) || kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) {
                                    if (kb_text_dump.NIL != id_index.id_index_tombstone_p(d_handle)) {
                                        d_handle = (SubLObject)kb_text_dump.$kw10$SKIP;
                                    }
                                    d = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                    id = deduction_handles.deduction_id(d);
                                    supported_object = deductions_interface.kb_deduction_supported_object(d);
                                    supported_recipe = kb_text_convert_deduction_support_to_recipe(supported_object);
                                    support_recipes = (SubLObject)((kb_text_dump.NIL != assertion_handles.assertion_p(supported_object)) ? kb_text_convert_deduction_supports_to_support_recipe(deductions_interface.kb_deduction_supports(d)) : kb_text_dump.NIL);
                                    truth = deductions_interface.kb_deduction_truth(d);
                                    strength = deductions_interface.kb_deduction_strength(d);
                                    PrintLow.format(s, (SubLObject)kb_text_dump.$str24$_A__A__A__A, new SubLObject[] { id, supported_recipe, truth, strength });
                                    cdolist_list_var = support_recipes;
                                    support_item = (SubLObject)kb_text_dump.NIL;
                                    support_item = cdolist_list_var.first();
                                    while (kb_text_dump.NIL != cdolist_list_var) {
                                        print_high.princ((SubLObject)kb_text_dump.$str11$_, s);
                                        print_high.princ(support_item, s);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        support_item = cdolist_list_var.first();
                                    }
                                    streams_high.terpri(s);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_text_dump.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$28 = idx_$26;
                        if (kb_text_dump.NIL == id_index.id_index_sparse_objects_empty_p(idx_$28) || kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$28);
                            SubLObject d_id2 = id_index.id_index_sparse_id_threshold(idx_$28);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$28);
                            final SubLObject v_default = (SubLObject)((kb_text_dump.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) ? kb_text_dump.NIL : kb_text_dump.$kw10$SKIP);
                            while (d_id2.numL(end_id)) {
                                final SubLObject d_handle2 = Hashtables.gethash_without_values(d_id2, sparse, v_default);
                                if (kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP) || kb_text_dump.NIL == id_index.id_index_tombstone_p(d_handle2)) {
                                    final SubLObject d2 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                    final SubLObject id2 = deduction_handles.deduction_id(d2);
                                    final SubLObject supported_object2 = deductions_interface.kb_deduction_supported_object(d2);
                                    final SubLObject supported_recipe2 = kb_text_convert_deduction_support_to_recipe(supported_object2);
                                    final SubLObject support_recipes2 = (SubLObject)((kb_text_dump.NIL != assertion_handles.assertion_p(supported_object2)) ? kb_text_convert_deduction_supports_to_support_recipe(deductions_interface.kb_deduction_supports(d2)) : kb_text_dump.NIL);
                                    final SubLObject truth2 = deductions_interface.kb_deduction_truth(d2);
                                    final SubLObject strength2 = deductions_interface.kb_deduction_strength(d2);
                                    PrintLow.format(s, (SubLObject)kb_text_dump.$str24$_A__A__A__A, new SubLObject[] { id2, supported_recipe2, truth2, strength2 });
                                    SubLObject cdolist_list_var2 = support_recipes2;
                                    SubLObject support_item2 = (SubLObject)kb_text_dump.NIL;
                                    support_item2 = cdolist_list_var2.first();
                                    while (kb_text_dump.NIL != cdolist_list_var2) {
                                        print_high.princ((SubLObject)kb_text_dump.$str11$_, s);
                                        print_high.princ(support_item2, s);
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        support_item2 = cdolist_list_var2.first();
                                    }
                                    streams_high.terpri(s);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_text_dump.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                d_id2 = Numbers.add(d_id2, (SubLObject)kb_text_dump.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kb_text_dump.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 6481L)
    public static SubLObject kb_text_dump_kb_hl_supports(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, (SubLObject)kb_text_dump.$str25$kb_hl_supports);
        SubLObject stream = (SubLObject)kb_text_dump.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kb_text_dump.NIL, thread);
                stream = compatibility.open_text(file, (SubLObject)kb_text_dump.$kw6$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kb_text_dump.$str7$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
            final SubLObject mess = (SubLObject)kb_text_dump.$str26$Text_dumping_KB_HL_supports;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kb_text_dump.ZERO_INTEGER;
            assert kb_text_dump.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_text_dump.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_text_dump.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_text_dump.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$30 = idx;
                    if (kb_text_dump.NIL == id_index.id_index_objects_empty_p(idx_$30, (SubLObject)kb_text_dump.$kw10$SKIP)) {
                        final SubLObject idx_$31 = idx_$30;
                        if (kb_text_dump.NIL == id_index.id_index_dense_objects_empty_p(idx_$31, (SubLObject)kb_text_dump.$kw10$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$31);
                            final SubLObject backwardP_var = (SubLObject)kb_text_dump.NIL;
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
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_text_dump.NIL, v_iteration = (SubLObject)kb_text_dump.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER)) {
                                s_id = ((kb_text_dump.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER) : v_iteration);
                                s_handle = Vectors.aref(vector_var, s_id);
                                if (kb_text_dump.NIL == id_index.id_index_tombstone_p(s_handle) || kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) {
                                    if (kb_text_dump.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                        s_handle = (SubLObject)kb_text_dump.$kw10$SKIP;
                                    }
                                    hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                    module = kb_hl_supports_high.kb_hl_support_module(hl_support);
                                    elmt = kb_text_compact_hl_external_id_string_cached(cycl_utilities.hl_to_el(kb_hl_supports_high.kb_hl_support_mt(hl_support)));
                                    sentence = kb_text_cons_id_string(kb_hl_supports_high.kb_hl_support_el_sentence(hl_support));
                                    tv = kb_hl_supports_high.kb_hl_support_tv(hl_support);
                                    support = kb_text_cons_id_string(kb_hl_supports_high.kb_hl_support_hl_support(hl_support));
                                    print_high.princ(module, s);
                                    streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string(sentence, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string(elmt, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    print_high.princ(tv, s);
                                    streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string(support, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.terpri(s);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_text_dump.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$32 = idx_$30;
                        if (kb_text_dump.NIL == id_index.id_index_sparse_objects_empty_p(idx_$32) || kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$32);
                            SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$32);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$32);
                            final SubLObject v_default = (SubLObject)((kb_text_dump.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) ? kb_text_dump.NIL : kb_text_dump.$kw10$SKIP);
                            while (s_id2.numL(end_id)) {
                                final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                                if (kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP) || kb_text_dump.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                    final SubLObject hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                    final SubLObject module2 = kb_hl_supports_high.kb_hl_support_module(hl_support2);
                                    final SubLObject elmt2 = kb_text_compact_hl_external_id_string_cached(cycl_utilities.hl_to_el(kb_hl_supports_high.kb_hl_support_mt(hl_support2)));
                                    final SubLObject sentence2 = kb_text_cons_id_string(kb_hl_supports_high.kb_hl_support_el_sentence(hl_support2));
                                    final SubLObject tv2 = kb_hl_supports_high.kb_hl_support_tv(hl_support2);
                                    final SubLObject support2 = kb_text_cons_id_string(kb_hl_supports_high.kb_hl_support_hl_support(hl_support2));
                                    print_high.princ(module2, s);
                                    streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string(sentence2, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string(elmt2, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    print_high.princ(tv2, s);
                                    streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.write_string(support2, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                    streams_high.terpri(s);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_text_dump.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                s_id2 = Numbers.add(s_id2, (SubLObject)kb_text_dump.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kb_text_dump.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 7464L)
    public static SubLObject kb_text_dump_unrepresented_terms(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, (SubLObject)kb_text_dump.$str27$unrepresented_terms);
        SubLObject stream = (SubLObject)kb_text_dump.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kb_text_dump.NIL, thread);
                stream = compatibility.open_text(file, (SubLObject)kb_text_dump.$kw6$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kb_text_dump.$str7$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            final SubLObject str = (SubLObject)kb_text_dump.$str28$Text_dumping_unrepresented_terms;
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_9 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                utilities_macros.$progress_notification_count$.bind((SubLObject)kb_text_dump.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_text_dump.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)kb_text_dump.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_text_dump.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((kb_text_dump.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_text_dump.T), thread);
                utilities_macros.noting_progress_preamble(str);
                final SubLObject iterator_var = unrepresented_terms.new_unrepresented_terms_iterator();
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)kb_text_dump.NIL; kb_text_dump.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_text_dump.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject v_term = iteration.iteration_next(iterator_var);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (kb_text_dump.NIL != valid) {
                        final SubLObject suid = Functions.funcall((SubLObject)kb_text_dump.$sym29$LOOKUP_UNREPRESENTED_TERM_SUID, v_term);
                        print_high.princ(v_term, s);
                        streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                        print_high.princ(suid, s);
                        streams_high.terpri(s);
                    }
                }
                utilities_macros.noting_progress_postamble();
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_9, thread);
                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_8, thread);
                utilities_macros.$progress_count$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_notification_count$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kb_text_dump.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_10, thread);
            }
        }
        return directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 7995L)
    public static SubLObject kb_text_dump_index_assertion(final SubLObject s, final SubLObject assertion) {
        return print_high.princ(assertion_handles.assertion_id(assertion), s);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 8099L)
    public static SubLObject kb_text_dump_constant_indexing(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, (SubLObject)kb_text_dump.$str30$constant_indexing);
        final SubLObject tag_stack = stacks.create_stack();
        thread.resetMultipleValues();
        final SubLObject visitor = new_kb_text_dump_complex_visitor(tag_stack);
        final SubLObject parameters = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject stream = (SubLObject)kb_text_dump.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kb_text_dump.NIL, thread);
                stream = compatibility.open_text(file, (SubLObject)kb_text_dump.$kw6$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kb_text_dump.$str7$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            conses_high.putf(parameters, (SubLObject)kb_text_dump.$kw31$STREAM, s);
            final SubLObject idx = constant_handles.do_constants_table();
            final SubLObject mess = (SubLObject)kb_text_dump.$str32$Text_dumping_constant_indexing;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kb_text_dump.ZERO_INTEGER;
            assert kb_text_dump.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_text_dump.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_text_dump.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_text_dump.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$34 = idx;
                    if (kb_text_dump.NIL == id_index.id_index_objects_empty_p(idx_$34, (SubLObject)kb_text_dump.$kw10$SKIP)) {
                        final SubLObject idx_$35 = idx_$34;
                        if (kb_text_dump.NIL == id_index.id_index_dense_objects_empty_p(idx_$35, (SubLObject)kb_text_dump.$kw10$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$35);
                            final SubLObject backwardP_var = (SubLObject)kb_text_dump.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject constant;
                            SubLObject index;
                            SubLObject tag;
                            SubLObject cdolist_list_var;
                            SubLObject assertion;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_text_dump.NIL, v_iteration = (SubLObject)kb_text_dump.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER)) {
                                id = ((kb_text_dump.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER) : v_iteration);
                                constant = Vectors.aref(vector_var, id);
                                if (kb_text_dump.NIL == id_index.id_index_tombstone_p(constant) || kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) {
                                    if (kb_text_dump.NIL != id_index.id_index_tombstone_p(constant)) {
                                        constant = (SubLObject)kb_text_dump.$kw10$SKIP;
                                    }
                                    index = kb_indexing_datastructures.term_index(constant);
                                    tag = kb_text_term_tag(constant);
                                    if (kb_text_dump.NIL != kb_indexing_datastructures.simple_index_p(index)) {
                                        cdolist_list_var = kb_text_sorted_term_assertion_list(constant);
                                        assertion = (SubLObject)kb_text_dump.NIL;
                                        assertion = cdolist_list_var.first();
                                        while (kb_text_dump.NIL != cdolist_list_var) {
                                            streams_high.write_string(tag, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                            streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                            kb_text_dump_index_assertion(s, assertion);
                                            streams_high.terpri(s);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            assertion = cdolist_list_var.first();
                                        }
                                    }
                                    else if (kb_text_dump.NIL != kb_indexing_datastructures.complex_index_p(index)) {
                                        stacks.clear_stack(tag_stack);
                                        stacks.stack_push(tag, tag_stack);
                                        indexing_utilities.visit_complex_index(index, visitor);
                                    }
                                    else {
                                        Errors.error((SubLObject)kb_text_dump.$str33$Unsupported_index_type__A___, index);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kb_text_dump.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$36 = idx_$34;
                        if (kb_text_dump.NIL == id_index.id_index_sparse_objects_empty_p(idx_$36) || kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$36);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$36);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$36);
                            final SubLObject v_default = (SubLObject)((kb_text_dump.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) ? kb_text_dump.NIL : kb_text_dump.$kw10$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject constant2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP) || kb_text_dump.NIL == id_index.id_index_tombstone_p(constant2)) {
                                    final SubLObject index2 = kb_indexing_datastructures.term_index(constant2);
                                    final SubLObject tag2 = kb_text_term_tag(constant2);
                                    if (kb_text_dump.NIL != kb_indexing_datastructures.simple_index_p(index2)) {
                                        SubLObject cdolist_list_var2 = kb_text_sorted_term_assertion_list(constant2);
                                        SubLObject assertion2 = (SubLObject)kb_text_dump.NIL;
                                        assertion2 = cdolist_list_var2.first();
                                        while (kb_text_dump.NIL != cdolist_list_var2) {
                                            streams_high.write_string(tag2, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                            streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                            kb_text_dump_index_assertion(s, assertion2);
                                            streams_high.terpri(s);
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            assertion2 = cdolist_list_var2.first();
                                        }
                                    }
                                    else if (kb_text_dump.NIL != kb_indexing_datastructures.complex_index_p(index2)) {
                                        stacks.clear_stack(tag_stack);
                                        stacks.stack_push(tag2, tag_stack);
                                        indexing_utilities.visit_complex_index(index2, visitor);
                                    }
                                    else {
                                        Errors.error((SubLObject)kb_text_dump.$str33$Unsupported_index_type__A___, index2);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kb_text_dump.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                id2 = Numbers.add(id2, (SubLObject)kb_text_dump.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kb_text_dump.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 9180L)
    public static SubLObject kb_text_dump_nart_indexing(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, (SubLObject)kb_text_dump.$str34$nart_indexing);
        final SubLObject tag_stack = stacks.create_stack();
        thread.resetMultipleValues();
        final SubLObject visitor = new_kb_text_dump_complex_visitor(tag_stack);
        final SubLObject parameters = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject stream = (SubLObject)kb_text_dump.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kb_text_dump.NIL, thread);
                stream = compatibility.open_text(file, (SubLObject)kb_text_dump.$kw6$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kb_text_dump.$str7$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            conses_high.putf(parameters, (SubLObject)kb_text_dump.$kw31$STREAM, s);
            final SubLObject idx = nart_handles.do_narts_table();
            final SubLObject mess = (SubLObject)kb_text_dump.$str35$Text_dumping_NAT_indexing;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kb_text_dump.ZERO_INTEGER;
            assert kb_text_dump.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_text_dump.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_text_dump.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_text_dump.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$38 = idx;
                    if (kb_text_dump.NIL == id_index.id_index_objects_empty_p(idx_$38, (SubLObject)kb_text_dump.$kw10$SKIP)) {
                        final SubLObject idx_$39 = idx_$38;
                        if (kb_text_dump.NIL == id_index.id_index_dense_objects_empty_p(idx_$39, (SubLObject)kb_text_dump.$kw10$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$39);
                            final SubLObject backwardP_var = (SubLObject)kb_text_dump.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject nart;
                            SubLObject index;
                            SubLObject tag;
                            SubLObject cdolist_list_var;
                            SubLObject assertion;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_text_dump.NIL, v_iteration = (SubLObject)kb_text_dump.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER)) {
                                id = ((kb_text_dump.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER) : v_iteration);
                                nart = Vectors.aref(vector_var, id);
                                if (kb_text_dump.NIL == id_index.id_index_tombstone_p(nart) || kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) {
                                    if (kb_text_dump.NIL != id_index.id_index_tombstone_p(nart)) {
                                        nart = (SubLObject)kb_text_dump.$kw10$SKIP;
                                    }
                                    index = kb_indexing_datastructures.term_index(nart);
                                    tag = kb_text_term_tag(nart);
                                    if (kb_text_dump.NIL != kb_indexing_datastructures.simple_index_p(index)) {
                                        cdolist_list_var = kb_text_sorted_term_assertion_list(nart);
                                        assertion = (SubLObject)kb_text_dump.NIL;
                                        assertion = cdolist_list_var.first();
                                        while (kb_text_dump.NIL != cdolist_list_var) {
                                            streams_high.write_string(tag, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                            streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                            kb_text_dump_index_assertion(s, assertion);
                                            streams_high.terpri(s);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            assertion = cdolist_list_var.first();
                                        }
                                    }
                                    else if (kb_text_dump.NIL != kb_indexing_datastructures.complex_index_p(index)) {
                                        stacks.clear_stack(tag_stack);
                                        stacks.stack_push(tag, tag_stack);
                                        indexing_utilities.visit_complex_index(index, visitor);
                                    }
                                    else {
                                        Errors.error((SubLObject)kb_text_dump.$str33$Unsupported_index_type__A___, index);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kb_text_dump.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$40 = idx_$38;
                        if (kb_text_dump.NIL == id_index.id_index_sparse_objects_empty_p(idx_$40) || kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$40);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$40);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$40);
                            final SubLObject v_default = (SubLObject)((kb_text_dump.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) ? kb_text_dump.NIL : kb_text_dump.$kw10$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject nart2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP) || kb_text_dump.NIL == id_index.id_index_tombstone_p(nart2)) {
                                    final SubLObject index2 = kb_indexing_datastructures.term_index(nart2);
                                    final SubLObject tag2 = kb_text_term_tag(nart2);
                                    if (kb_text_dump.NIL != kb_indexing_datastructures.simple_index_p(index2)) {
                                        SubLObject cdolist_list_var2 = kb_text_sorted_term_assertion_list(nart2);
                                        SubLObject assertion2 = (SubLObject)kb_text_dump.NIL;
                                        assertion2 = cdolist_list_var2.first();
                                        while (kb_text_dump.NIL != cdolist_list_var2) {
                                            streams_high.write_string(tag2, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                            streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                            kb_text_dump_index_assertion(s, assertion2);
                                            streams_high.terpri(s);
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            assertion2 = cdolist_list_var2.first();
                                        }
                                    }
                                    else if (kb_text_dump.NIL != kb_indexing_datastructures.complex_index_p(index2)) {
                                        stacks.clear_stack(tag_stack);
                                        stacks.stack_push(tag2, tag_stack);
                                        indexing_utilities.visit_complex_index(index2, visitor);
                                    }
                                    else {
                                        Errors.error((SubLObject)kb_text_dump.$str33$Unsupported_index_type__A___, index2);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kb_text_dump.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                id2 = Numbers.add(id2, (SubLObject)kb_text_dump.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kb_text_dump.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 10226L)
    public static SubLObject kb_text_dump_unrepresented_term_indexing(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = kb_text_dump_file(directory, (SubLObject)kb_text_dump.$str36$unrepresented_term_indexing);
        final SubLObject tag_stack = stacks.create_stack();
        thread.resetMultipleValues();
        final SubLObject visitor = new_kb_text_dump_complex_visitor(tag_stack);
        final SubLObject parameters = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject stream = (SubLObject)kb_text_dump.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kb_text_dump.NIL, thread);
                stream = compatibility.open_text(file, (SubLObject)kb_text_dump.$kw6$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kb_text_dump.$str7$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            conses_high.putf(parameters, (SubLObject)kb_text_dump.$kw31$STREAM, s);
            if (kb_text_dump.NIL != unrepresented_terms.use_unrepresented_term_fhtP()) {
                SubLObject msg = Sequences.cconcatenate((SubLObject)kb_text_dump.$str37$Text_dumping_unrepresented_term_i, (SubLObject)kb_text_dump.$str38$____Old_Space);
                SubLObject release = (SubLObject)kb_text_dump.NIL;
                try {
                    release = Locks.seize_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                    final SubLObject table_var = unrepresented_terms.get_unrepresented_term_fht();
                    utilities_macros.$progress_note$.setDynamicValue(msg, thread);
                    utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
                    utilities_macros.$progress_sofar$.setDynamicValue((SubLObject)kb_text_dump.ZERO_INTEGER, thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_text_dump.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_text_dump.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_text_dump.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject continuation = (SubLObject)kb_text_dump.NIL;
                            SubLObject next;
                            for (SubLObject completeP = (SubLObject)kb_text_dump.NIL; kb_text_dump.NIL == completeP; completeP = Types.sublisp_null(next)) {
                                thread.resetMultipleValues();
                                final SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, (SubLObject)kb_text_dump.NIL);
                                final SubLObject the_value = thread.secondMultipleValue();
                                next = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (kb_text_dump.NIL != next) {
                                    final SubLObject key = the_key;
                                    final SubLObject v_term = the_value;
                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_text_dump.ONE_INTEGER), thread);
                                    if (kb_text_dump.NIL == unrepresented_terms.deleted_unrepresented_term_itemP(key) && kb_text_dump.NIL != unrepresented_terms.fht_suid_item_p(key)) {
                                        final SubLObject id = unrepresented_terms.get_fht_suid_item_suid(key);
                                        final SubLObject index = kb_indexing_datastructures.term_index(v_term);
                                        final SubLObject tag = kb_text_term_tag(v_term);
                                        if (kb_text_dump.NIL != kb_indexing_datastructures.simple_index_p(index)) {
                                            SubLObject cdolist_list_var = kb_text_sorted_term_assertion_list(v_term);
                                            SubLObject assertion = (SubLObject)kb_text_dump.NIL;
                                            assertion = cdolist_list_var.first();
                                            while (kb_text_dump.NIL != cdolist_list_var) {
                                                streams_high.write_string(tag, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                                streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                                kb_text_dump_index_assertion(s, assertion);
                                                streams_high.terpri(s);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                assertion = cdolist_list_var.first();
                                            }
                                        }
                                        else if (kb_text_dump.NIL != kb_indexing_datastructures.complex_index_p(index)) {
                                            stacks.clear_stack(tag_stack);
                                            stacks.stack_push(tag, tag_stack);
                                            indexing_utilities.visit_complex_index(index, visitor);
                                        }
                                        else {
                                            Errors.error((SubLObject)kb_text_dump.$str33$Unsupported_index_type__A___, index);
                                        }
                                    }
                                }
                                continuation = next;
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
                    }
                }
                finally {
                    if (kb_text_dump.NIL != release) {
                        Locks.release_lock(unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue());
                    }
                }
                msg = Sequences.cconcatenate((SubLObject)kb_text_dump.$str37$Text_dumping_unrepresented_term_i, (SubLObject)kb_text_dump.$str39$____New_Space);
                if (kb_text_dump.NIL != unrepresented_terms.use_unrepresented_term_fhtP()) {
                    final SubLObject list_var = unrepresented_terms.get_unrepresented_term_new_space_ascending_suid_keys();
                    final SubLObject _prev_bind_2 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)((kb_text_dump.NIL != msg) ? msg : kb_text_dump.$str40$cdolist), thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)kb_text_dump.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_text_dump.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_text_dump.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_text_dump.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject suid_item = (SubLObject)kb_text_dump.NIL;
                            suid_item = csome_list_var.first();
                            while (kb_text_dump.NIL != csome_list_var) {
                                final SubLObject id2 = unrepresented_terms.get_fht_suid_item_suid(suid_item);
                                final SubLObject v_term2 = unrepresented_terms.find_unrepresented_term_by_suid(id2);
                                final SubLObject index = kb_indexing_datastructures.term_index(v_term2);
                                final SubLObject tag = kb_text_term_tag(v_term2);
                                if (kb_text_dump.NIL != kb_indexing_datastructures.simple_index_p(index)) {
                                    SubLObject cdolist_list_var = kb_text_sorted_term_assertion_list(v_term2);
                                    SubLObject assertion = (SubLObject)kb_text_dump.NIL;
                                    assertion = cdolist_list_var.first();
                                    while (kb_text_dump.NIL != cdolist_list_var) {
                                        streams_high.write_string(tag, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                        streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                        kb_text_dump_index_assertion(s, assertion);
                                        streams_high.terpri(s);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        assertion = cdolist_list_var.first();
                                    }
                                }
                                else if (kb_text_dump.NIL != kb_indexing_datastructures.complex_index_p(index)) {
                                    stacks.clear_stack(tag_stack);
                                    stacks.stack_push(tag, tag_stack);
                                    indexing_utilities.visit_complex_index(index, visitor);
                                }
                                else {
                                    Errors.error((SubLObject)kb_text_dump.$str33$Unsupported_index_type__A___, index);
                                }
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_text_dump.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                suid_item = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_9, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_8, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_7, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_2, thread);
                    }
                }
                else {
                    final SubLObject table_var = unrepresented_terms.do_unrepresented_terms_table();
                    final SubLObject first_id_var = unrepresented_terms.new_unrepresented_term_id_threshold();
                    final SubLObject total = Numbers.subtract(id_index.id_index_next_id(table_var), first_id_var);
                    SubLObject sofar = (SubLObject)kb_text_dump.ZERO_INTEGER;
                    final SubLObject _prev_bind_10 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_13 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_text_dump.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_text_dump.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_text_dump.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(msg);
                            SubLObject v_term;
                            SubLObject index;
                            SubLObject tag;
                            SubLObject cdolist_list_var;
                            SubLObject assertion;
                            SubLObject end_var;
                            SubLObject end;
                            SubLObject id3;
                            SubLObject id_$44;
                            for (end = (end_var = id_index.id_index_next_id(table_var)), id3 = (SubLObject)kb_text_dump.NIL, id3 = first_id_var; !id3.numGE(end_var); id3 = number_utilities.f_1X(id3)) {
                                v_term = id_index.id_index_lookup(table_var, id3, (SubLObject)kb_text_dump.UNPROVIDED);
                                if (kb_text_dump.NIL != v_term) {
                                    utilities_macros.note_percent_progress(sofar, total);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_text_dump.ONE_INTEGER);
                                    id_$44 = unrepresented_terms.unrepresented_term_suid(v_term);
                                    index = kb_indexing_datastructures.term_index(v_term);
                                    tag = kb_text_term_tag(v_term);
                                    if (kb_text_dump.NIL != kb_indexing_datastructures.simple_index_p(index)) {
                                        cdolist_list_var = kb_text_sorted_term_assertion_list(v_term);
                                        assertion = (SubLObject)kb_text_dump.NIL;
                                        assertion = cdolist_list_var.first();
                                        while (kb_text_dump.NIL != cdolist_list_var) {
                                            streams_high.write_string(tag, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                            streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                            kb_text_dump_index_assertion(s, assertion);
                                            streams_high.terpri(s);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            assertion = cdolist_list_var.first();
                                        }
                                    }
                                    else if (kb_text_dump.NIL != kb_indexing_datastructures.complex_index_p(index)) {
                                        stacks.clear_stack(tag_stack);
                                        stacks.stack_push(tag, tag_stack);
                                        indexing_utilities.visit_complex_index(index, visitor);
                                    }
                                    else {
                                        Errors.error((SubLObject)kb_text_dump.$str33$Unsupported_index_type__A___, index);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_13, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_12, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_11, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_10, thread);
                    }
                }
            }
            else {
                final SubLObject idx = unrepresented_terms.do_unrepresented_terms_table();
                final SubLObject mess = (SubLObject)kb_text_dump.$str37$Text_dumping_unrepresented_term_i;
                final SubLObject total2 = id_index.id_index_count(idx);
                SubLObject sofar2 = (SubLObject)kb_text_dump.ZERO_INTEGER;
                assert kb_text_dump.NIL != Types.stringp(mess) : mess;
                final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_15 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_16 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_17 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_text_dump.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_text_dump.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_text_dump.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(mess);
                        final SubLObject idx_$46 = idx;
                        if (kb_text_dump.NIL == id_index.id_index_objects_empty_p(idx_$46, (SubLObject)kb_text_dump.$kw10$SKIP)) {
                            final SubLObject idx_$47 = idx_$46;
                            if (kb_text_dump.NIL == id_index.id_index_dense_objects_empty_p(idx_$47, (SubLObject)kb_text_dump.$kw10$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$47);
                                final SubLObject backwardP_var = (SubLObject)kb_text_dump.NIL;
                                SubLObject id;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject v_term3;
                                SubLObject index2;
                                SubLObject tag2;
                                SubLObject cdolist_list_var2;
                                SubLObject assertion2;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_text_dump.NIL, v_iteration = (SubLObject)kb_text_dump.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER)) {
                                    id = ((kb_text_dump.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER) : v_iteration);
                                    v_term3 = Vectors.aref(vector_var, id);
                                    if (kb_text_dump.NIL == id_index.id_index_tombstone_p(v_term3) || kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) {
                                        if (kb_text_dump.NIL != id_index.id_index_tombstone_p(v_term3)) {
                                            v_term3 = (SubLObject)kb_text_dump.$kw10$SKIP;
                                        }
                                        index2 = kb_indexing_datastructures.term_index(v_term3);
                                        tag2 = kb_text_term_tag(v_term3);
                                        if (kb_text_dump.NIL != kb_indexing_datastructures.simple_index_p(index2)) {
                                            cdolist_list_var2 = kb_text_sorted_term_assertion_list(v_term3);
                                            assertion2 = (SubLObject)kb_text_dump.NIL;
                                            assertion2 = cdolist_list_var2.first();
                                            while (kb_text_dump.NIL != cdolist_list_var2) {
                                                streams_high.write_string(tag2, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                                streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                                kb_text_dump_index_assertion(s, assertion2);
                                                streams_high.terpri(s);
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                assertion2 = cdolist_list_var2.first();
                                            }
                                        }
                                        else if (kb_text_dump.NIL != kb_indexing_datastructures.complex_index_p(index2)) {
                                            stacks.clear_stack(tag_stack);
                                            stacks.stack_push(tag2, tag_stack);
                                            indexing_utilities.visit_complex_index(index2, visitor);
                                        }
                                        else {
                                            Errors.error((SubLObject)kb_text_dump.$str33$Unsupported_index_type__A___, index2);
                                        }
                                        sofar2 = Numbers.add(sofar2, (SubLObject)kb_text_dump.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar2, total2);
                                    }
                                }
                            }
                            final SubLObject idx_$48 = idx_$46;
                            if (kb_text_dump.NIL == id_index.id_index_sparse_objects_empty_p(idx_$48) || kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) {
                                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$48);
                                SubLObject id4 = id_index.id_index_sparse_id_threshold(idx_$48);
                                final SubLObject end_id = id_index.id_index_next_id(idx_$48);
                                final SubLObject v_default = (SubLObject)((kb_text_dump.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP)) ? kb_text_dump.NIL : kb_text_dump.$kw10$SKIP);
                                while (id4.numL(end_id)) {
                                    final SubLObject v_term2 = Hashtables.gethash_without_values(id4, sparse, v_default);
                                    if (kb_text_dump.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_text_dump.$kw10$SKIP) || kb_text_dump.NIL == id_index.id_index_tombstone_p(v_term2)) {
                                        final SubLObject index = kb_indexing_datastructures.term_index(v_term2);
                                        final SubLObject tag = kb_text_term_tag(v_term2);
                                        if (kb_text_dump.NIL != kb_indexing_datastructures.simple_index_p(index)) {
                                            SubLObject cdolist_list_var = kb_text_sorted_term_assertion_list(v_term2);
                                            SubLObject assertion = (SubLObject)kb_text_dump.NIL;
                                            assertion = cdolist_list_var.first();
                                            while (kb_text_dump.NIL != cdolist_list_var) {
                                                streams_high.write_string(tag, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                                streams_high.write_string((SubLObject)kb_text_dump.$str11$_, s, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                                kb_text_dump_index_assertion(s, assertion);
                                                streams_high.terpri(s);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                assertion = cdolist_list_var.first();
                                            }
                                        }
                                        else if (kb_text_dump.NIL != kb_indexing_datastructures.complex_index_p(index)) {
                                            stacks.clear_stack(tag_stack);
                                            stacks.stack_push(tag, tag_stack);
                                            indexing_utilities.visit_complex_index(index, visitor);
                                        }
                                        else {
                                            Errors.error((SubLObject)kb_text_dump.$str33$Unsupported_index_type__A___, index);
                                        }
                                        sofar2 = Numbers.add(sofar2, (SubLObject)kb_text_dump.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar2, total2);
                                    }
                                    id4 = Numbers.add(id4, (SubLObject)kb_text_dump.ONE_INTEGER);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                            final SubLObject _values4 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values4);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_17, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_16, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_15, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_14, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_text_dump.T, thread);
                final SubLObject _values5 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kb_text_dump.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values5);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_18, thread);
            }
        }
        return directory;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 11351L)
    public static SubLObject kb_text_sorted_term_assertion_list(final SubLObject v_term) {
        final SubLObject raw_assertions = kb_indexing_datastructures.simple_term_assertion_list(v_term);
        final SubLObject sorted_assertions = assertion_utilities.sort_assertions(conses_high.copy_list(raw_assertions));
        return sorted_assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 11578L)
    public static SubLObject new_kb_text_dump_complex_visitor(final SubLObject tag_stack) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject parameters = (SubLObject)ConsesLow.list((SubLObject)kb_text_dump.$kw31$STREAM, StreamsLow.$standard_output$.getDynamicValue(thread), (SubLObject)kb_text_dump.$kw41$PATH, tag_stack);
        final SubLObject visitor = indexing_utilities.new_complex_index_visitor((SubLObject)kb_text_dump.$sym42$KB_TEXT_DUMP_COMPINX_VISIT_BEGIN_VISIT, (SubLObject)kb_text_dump.$sym43$KB_TEXT_DUMP_COMPINX_VISIT_BEGIN_SUBINDEX, (SubLObject)kb_text_dump.$sym44$KB_TEXT_DUMP_COMPINX_VISIT_FINAL_INDEX, (SubLObject)kb_text_dump.$sym45$KB_TEXT_DUMP_COMPINX_VISIT_END_SUBINDEX, (SubLObject)kb_text_dump.$sym46$KB_TEXT_DUMP_COMPINX_VISIT_END_VISIT, parameters);
        return Values.values(visitor, parameters);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 12153L)
    public static SubLObject kb_text_term_tag(final SubLObject v_term) {
        if (kb_text_dump.NIL != constant_handles.constant_p(v_term)) {
            return (kb_text_dump.NIL != kb_text_hl_prototypical_termP(v_term)) ? constants_high.constant_name(v_term) : Guids.guid_to_string(constants_high.constant_external_id(v_term));
        }
        if (v_term.isCons()) {
            return kb_text_cons_id_string(v_term);
        }
        return kb_text_compact_hl_external_id_string(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 12496L)
    public static SubLObject kb_text_dump_compinx_visit_begin_visit(final SubLObject visitor, final SubLObject complex_index) {
        return visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 12627L)
    public static SubLObject kb_text_dump_compinx_visit_end_visit(final SubLObject visitor, final SubLObject complex_index) {
        return visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 12747L)
    public static SubLObject kb_text_dump_compinx_visit_begin_subindex(final SubLObject visitor, final SubLObject key, final SubLObject complex_index) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        final SubLObject tag_stack = conses_high.getf(v_context, (SubLObject)kb_text_dump.$kw41$PATH, (SubLObject)kb_text_dump.UNPROVIDED);
        stacks.stack_push(kb_text_term_tag(key), tag_stack);
        return visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 13034L)
    public static SubLObject kb_text_dump_compinx_visit_final_index(final SubLObject visitor, final SubLObject final_key, final SubLObject final_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_text_dump.NIL != kb_indexing_datastructures.final_topn_index_p(final_index)) {
            Errors.warn((SubLObject)kb_text_dump.$str47$Skipping_final_top_N_index__A___, final_index);
            return visitor;
        }
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        final SubLObject tag_stack = conses_high.getf(v_context, (SubLObject)kb_text_dump.$kw41$PATH, (SubLObject)kb_text_dump.UNPROVIDED);
        final SubLObject stream = conses_high.getf(v_context, (SubLObject)kb_text_dump.$kw31$STREAM, (SubLObject)kb_text_dump.UNPROVIDED);
        stacks.stack_push(kb_text_term_tag(final_key), tag_stack);
        final SubLObject _prev_bind_0 = kb_indexing_datastructures.$ordered_final_index_resource$.currentBinding(thread);
        try {
            kb_indexing_datastructures.$ordered_final_index_resource$.bind((SubLObject)kb_text_dump.NIL, thread);
            if (kb_text_dump.NIL != final_index) {
                if (kb_text_dump.NIL != kb_indexing_datastructures.final_unified_index_p(final_index)) {
                    SubLObject leaf_items = set.set_element_list(kb_indexing_datastructures.final_unified_index_set(final_index));
                    SubLObject csome_list_var;
                    leaf_items = (csome_list_var = assertion_utilities.sort_assertions(leaf_items));
                    SubLObject leaf = (SubLObject)kb_text_dump.NIL;
                    leaf = csome_list_var.first();
                    while (kb_text_dump.NIL != csome_list_var) {
                        kb_text_dump_dumpinx_visit_write_path(stream, tag_stack);
                        streams_high.write_string((SubLObject)kb_text_dump.$str11$_, stream, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                        kb_text_dump_index_assertion(stream, leaf);
                        streams_high.terpri(stream);
                        csome_list_var = csome_list_var.rest();
                        leaf = csome_list_var.first();
                    }
                }
                else if (kb_text_dump.NIL != kb_indexing_datastructures.final_sharded_index_p(final_index)) {
                    final SubLObject shard_key_list = Sort.sort(map_utilities.map_keys(kb_indexing_datastructures.final_sharded_index_shard_map(final_index)), (SubLObject)kb_text_dump.$sym48$_, (SubLObject)kb_text_dump.UNPROVIDED);
                    SubLObject shard_contents = (SubLObject)kb_text_dump.NIL;
                    SubLObject csome_list_var2 = shard_key_list;
                    SubLObject key = (SubLObject)kb_text_dump.NIL;
                    key = csome_list_var2.first();
                    while (kb_text_dump.NIL != csome_list_var2) {
                        final SubLObject shard = map_utilities.map_get(kb_indexing_datastructures.final_sharded_index_shard_map(final_index), key, (SubLObject)kb_text_dump.UNPROVIDED);
                        final SubLObject vector_var;
                        shard_contents = (vector_var = kb_indexing_datastructures.ordered_final_sharded_index_extract_contents(shard, shard_contents));
                        final SubLObject backwardP_var = (SubLObject)kb_text_dump.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject element_num;
                        SubLObject leaf2;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_text_dump.NIL, v_iteration = (SubLObject)kb_text_dump.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER)) {
                            element_num = ((kb_text_dump.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_text_dump.ONE_INTEGER) : v_iteration);
                            leaf2 = Vectors.aref(vector_var, element_num);
                            if (kb_text_dump.NIL != assertion_handles.assertion_p(leaf2)) {
                                kb_text_dump_dumpinx_visit_write_path(stream, tag_stack);
                                streams_high.write_string((SubLObject)kb_text_dump.$str11$_, stream, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                                kb_text_dump_index_assertion(stream, leaf2);
                                streams_high.terpri(stream);
                            }
                        }
                        csome_list_var2 = csome_list_var2.rest();
                        key = csome_list_var2.first();
                    }
                }
                else if (kb_text_dump.NIL != kb_indexing_datastructures.final_topn_index_p(final_index)) {
                    final SubLObject iterator_var = kb_indexing_datastructures.new_ordered_final_topn_index_iterator(final_index);
                    SubLObject valid;
                    for (SubLObject done_var = (SubLObject)kb_text_dump.NIL; kb_text_dump.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_text_dump.NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject leaf = iteration.iteration_next(iterator_var);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (kb_text_dump.NIL != valid) {
                            kb_text_dump_dumpinx_visit_write_path(stream, tag_stack);
                            streams_high.write_string((SubLObject)kb_text_dump.$str11$_, stream, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
                            kb_text_dump_index_assertion(stream, leaf);
                            streams_high.terpri(stream);
                        }
                    }
                }
                else {
                    enforceType(final_index, kb_text_dump.$sym49$FINAL_INDEX_P);
                }
            }
        }
        finally {
            kb_indexing_datastructures.$ordered_final_index_resource$.rebind(_prev_bind_0, thread);
        }
        stacks.stack_pop(tag_stack);
        return visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 13776L)
    public static SubLObject kb_text_dump_compinx_visit_end_subindex(final SubLObject visitor, final SubLObject key, final SubLObject complex_index) {
        final SubLObject v_context = hierarchical_visitor.get_hierarchical_visitor_parameter(visitor);
        final SubLObject tag_stack = conses_high.getf(v_context, (SubLObject)kb_text_dump.$kw41$PATH, (SubLObject)kb_text_dump.UNPROVIDED);
        stacks.stack_pop(tag_stack);
        return visitor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 14042L)
    public static SubLObject kb_text_dump_dumpinx_visit_write_path(final SubLObject stream, final SubLObject tag_stack) {
        final SubLObject elements = Functions.funcall((SubLObject)kb_text_dump.$sym50$DO_STACK_ELEMENTS_STACK_ELEMENTS, tag_stack);
        kb_text_dump_dumpinx_visit_write_path_item(stream, elements);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 14307L)
    public static SubLObject kb_text_dump_dumpinx_visit_write_path_item(final SubLObject stream, final SubLObject elements) {
        SubLObject item = (SubLObject)kb_text_dump.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(elements, elements, (SubLObject)kb_text_dump.$list51);
        item = elements.first();
        final SubLObject items;
        final SubLObject current = items = elements.rest();
        if (kb_text_dump.NIL != list_utilities.sublisp_boolean(items)) {
            kb_text_dump_dumpinx_visit_write_path_item(stream, items);
            streams_high.write_string((SubLObject)kb_text_dump.$str11$_, stream, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
        }
        streams_high.write_string(item, stream, (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 14618L)
    public static SubLObject kb_text_convert_deduction_support_to_recipe(final SubLObject support) {
        if (kb_text_dump.NIL != assertion_handles.assertion_p(support)) {
            return Sequences.cconcatenate((SubLObject)kb_text_dump.$str52$A_, format_nil.format_nil_d_no_copy(assertion_handles.assertion_id(support)));
        }
        if (kb_text_dump.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            return kb_text_convert_deduction_support_to_recipe(kb_hl_supports_high.kb_hl_support_hl_support(support));
        }
        return kb_text_cons_id_string(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15131L)
    public static SubLObject kb_text_convert_deduction_supports_to_support_recipe(final SubLObject supports) {
        return Sort.sort(Mapping.mapcar((SubLObject)kb_text_dump.$sym53$KB_TEXT_CONVERT_DEDUCTION_SUPPORT_TO_RECIPE, supports), (SubLObject)kb_text_dump.$sym54$STRING_, (SubLObject)kb_text_dump.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15292L)
    public static SubLObject kb_text_cons_id_string(final SubLObject cons) {
        return kb_text_compact_hl_external_id_string(kb_text_convert_potential_prototypical_terms(cons));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15490L)
    public static SubLObject kb_text_compact_hl_external_id_string(final SubLObject v_object) {
        return kb_utilities.compact_hl_external_id_string(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15602L)
    public static SubLObject clear_kb_text_compact_hl_external_id_string_cached() {
        final SubLObject cs = kb_text_dump.$kb_text_compact_hl_external_id_string_cached_caching_state$.getGlobalValue();
        if (kb_text_dump.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)kb_text_dump.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15602L)
    public static SubLObject remove_kb_text_compact_hl_external_id_string_cached(final SubLObject v_object) {
        return memoization_state.caching_state_remove_function_results_with_args(kb_text_dump.$kb_text_compact_hl_external_id_string_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_object), (SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15602L)
    public static SubLObject kb_text_compact_hl_external_id_string_cached_internal(final SubLObject v_object) {
        return kb_text_compact_hl_external_id_string(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15602L)
    public static SubLObject kb_text_compact_hl_external_id_string_cached(final SubLObject v_object) {
        SubLObject caching_state = kb_text_dump.$kb_text_compact_hl_external_id_string_cached_caching_state$.getGlobalValue();
        if (kb_text_dump.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)kb_text_dump.$sym55$KB_TEXT_COMPACT_HL_EXTERNAL_ID_STRING_CACHED, (SubLObject)kb_text_dump.$sym56$_KB_TEXT_COMPACT_HL_EXTERNAL_ID_STRING_CACHED_CACHING_STATE_, (SubLObject)kb_text_dump.NIL, (SubLObject)kb_text_dump.EQL, (SubLObject)kb_text_dump.ONE_INTEGER, (SubLObject)kb_text_dump.$int57$10000);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(kb_text_compact_hl_external_id_string_cached_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, (SubLObject)kb_text_dump.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-text-dump.lisp", position = 15806L)
    public static SubLObject kb_text_dump_file(final SubLObject directory, final SubLObject file) {
        return file_utilities.relative_filename(directory, file, (SubLObject)kb_text_dump.$str58$kbtext);
    }
    
    public static SubLObject declare_kb_text_dump_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "get_hl_prototypical_terms", "GET-HL-PROTOTYPICAL-TERMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_hl_prototypical_termP", "KB-TEXT-HL-PROTOTYPICAL-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_convert_potential_prototypical_terms", "KB-TEXT-CONVERT-POTENTIAL-PROTOTYPICAL-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_essential_kb", "KB-TEXT-DUMP-ESSENTIAL-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_kb", "KB-TEXT-DUMP-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_indexing", "KB-TEXT-DUMP-INDEXING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_constants", "KB-TEXT-DUMP-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_narts", "KB-TEXT-DUMP-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_assertions", "KB-TEXT-DUMP-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_meta_assertions", "KB-TEXT-DUMP-META-ASSERTIONS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_meta_assertions_to_stream", "KB-TEXT-DUMP-META-ASSERTIONS-TO-STREAM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_assertion_to_stream", "KB-TEXT-DUMP-ASSERTION-TO-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_deductions", "KB-TEXT-DUMP-DEDUCTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_kb_hl_supports", "KB-TEXT-DUMP-KB-HL-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_unrepresented_terms", "KB-TEXT-DUMP-UNREPRESENTED-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_index_assertion", "KB-TEXT-DUMP-INDEX-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_constant_indexing", "KB-TEXT-DUMP-CONSTANT-INDEXING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_nart_indexing", "KB-TEXT-DUMP-NART-INDEXING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_unrepresented_term_indexing", "KB-TEXT-DUMP-UNREPRESENTED-TERM-INDEXING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_sorted_term_assertion_list", "KB-TEXT-SORTED-TERM-ASSERTION-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "new_kb_text_dump_complex_visitor", "NEW-KB-TEXT-DUMP-COMPLEX-VISITOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_term_tag", "KB-TEXT-TERM-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_compinx_visit_begin_visit", "KB-TEXT-DUMP-COMPINX-VISIT-BEGIN-VISIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_compinx_visit_end_visit", "KB-TEXT-DUMP-COMPINX-VISIT-END-VISIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_compinx_visit_begin_subindex", "KB-TEXT-DUMP-COMPINX-VISIT-BEGIN-SUBINDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_compinx_visit_final_index", "KB-TEXT-DUMP-COMPINX-VISIT-FINAL-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_compinx_visit_end_subindex", "KB-TEXT-DUMP-COMPINX-VISIT-END-SUBINDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_dumpinx_visit_write_path", "KB-TEXT-DUMP-DUMPINX-VISIT-WRITE-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_dumpinx_visit_write_path_item", "KB-TEXT-DUMP-DUMPINX-VISIT-WRITE-PATH-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_convert_deduction_support_to_recipe", "KB-TEXT-CONVERT-DEDUCTION-SUPPORT-TO-RECIPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_convert_deduction_supports_to_support_recipe", "KB-TEXT-CONVERT-DEDUCTION-SUPPORTS-TO-SUPPORT-RECIPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_cons_id_string", "KB-TEXT-CONS-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_compact_hl_external_id_string", "KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "clear_kb_text_compact_hl_external_id_string_cached", "CLEAR-KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "remove_kb_text_compact_hl_external_id_string_cached", "REMOVE-KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_compact_hl_external_id_string_cached_internal", "KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_compact_hl_external_id_string_cached", "KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_text_dump", "kb_text_dump_file", "KB-TEXT-DUMP-FILE", 2, 0, false);
        return (SubLObject)kb_text_dump.NIL;
    }
    
    public static SubLObject init_kb_text_dump_file() {
        kb_text_dump.$kb_text_hl_prototypical_terms$ = SubLFiles.defparameter("*KB-TEXT-HL-PROTOTYPICAL-TERMS*", set.new_set((SubLObject)kb_text_dump.UNPROVIDED, (SubLObject)kb_text_dump.UNPROVIDED));
        kb_text_dump.$kb_text_compact_hl_external_id_string_cached_caching_state$ = SubLFiles.deflexical("*KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED-CACHING-STATE*", (SubLObject)kb_text_dump.NIL);
        return (SubLObject)kb_text_dump.NIL;
    }
    
    public static SubLObject setup_kb_text_dump_file() {
        access_macros.register_external_symbol((SubLObject)kb_text_dump.$sym3$KB_TEXT_DUMP_ESSENTIAL_KB);
        access_macros.register_external_symbol((SubLObject)kb_text_dump.$sym4$KB_TEXT_DUMP_KB);
        memoization_state.note_globally_cached_function((SubLObject)kb_text_dump.$sym55$KB_TEXT_COMPACT_HL_EXTERNAL_ID_STRING_CACHED);
        return (SubLObject)kb_text_dump.NIL;
    }
    
    public void declareFunctions() {
        declare_kb_text_dump_file();
    }
    
    public void initializeVariables() {
        init_kb_text_dump_file();
    }
    
    public void runTopLevelForms() {
        setup_kb_text_dump_file();
    }
    
    static {
        me = (SubLFile)new kb_text_dump();
        kb_text_dump.$kb_text_hl_prototypical_terms$ = null;
        kb_text_dump.$kb_text_compact_hl_external_id_string_cached_caching_state$ = null;
        $const0$HLPrototypicalTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HLPrototypicalTerm"));
        $sym1$KB_TEXT_HL_PROTOTYPICAL_TERM_ = SubLObjectFactory.makeSymbol("KB-TEXT-HL-PROTOTYPICAL-TERM?");
        $sym2$CONSTANT_NAME = SubLObjectFactory.makeSymbol("CONSTANT-NAME");
        $sym3$KB_TEXT_DUMP_ESSENTIAL_KB = SubLObjectFactory.makeSymbol("KB-TEXT-DUMP-ESSENTIAL-KB");
        $sym4$KB_TEXT_DUMP_KB = SubLObjectFactory.makeSymbol("KB-TEXT-DUMP-KB");
        $str5$constants = SubLObjectFactory.makeString("constants");
        $kw6$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str7$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str8$Text_dumping_constants = SubLObjectFactory.makeString("Text dumping constants");
        $sym9$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw10$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str11$_ = SubLObjectFactory.makeString(" ");
        $str12$narts = SubLObjectFactory.makeString("narts");
        $str13$Text_dumping_narts = SubLObjectFactory.makeString("Text dumping narts");
        $str14$assertions = SubLObjectFactory.makeString("assertions");
        $str15$Text_dumping_assertions = SubLObjectFactory.makeString("Text dumping assertions");
        $sym16$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
        $sym17$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const18$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str19$Mapping_meta_assertions = SubLObjectFactory.makeString("Mapping meta-assertions");
        $sym20$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $str21$_A_ = SubLObjectFactory.makeString("~A ");
        $str22$deductions = SubLObjectFactory.makeString("deductions");
        $str23$Text_dumping_deductions = SubLObjectFactory.makeString("Text dumping deductions");
        $str24$_A__A__A__A = SubLObjectFactory.makeString("~A ~A ~A ~A");
        $str25$kb_hl_supports = SubLObjectFactory.makeString("kb-hl-supports");
        $str26$Text_dumping_KB_HL_supports = SubLObjectFactory.makeString("Text dumping KB HL supports");
        $str27$unrepresented_terms = SubLObjectFactory.makeString("unrepresented-terms");
        $str28$Text_dumping_unrepresented_terms = SubLObjectFactory.makeString("Text dumping unrepresented terms");
        $sym29$LOOKUP_UNREPRESENTED_TERM_SUID = SubLObjectFactory.makeSymbol("LOOKUP-UNREPRESENTED-TERM-SUID");
        $str30$constant_indexing = SubLObjectFactory.makeString("constant-indexing");
        $kw31$STREAM = SubLObjectFactory.makeKeyword("STREAM");
        $str32$Text_dumping_constant_indexing = SubLObjectFactory.makeString("Text dumping constant indexing");
        $str33$Unsupported_index_type__A___ = SubLObjectFactory.makeString("Unsupported index type ~A.~%");
        $str34$nart_indexing = SubLObjectFactory.makeString("nart-indexing");
        $str35$Text_dumping_NAT_indexing = SubLObjectFactory.makeString("Text dumping NAT indexing");
        $str36$unrepresented_term_indexing = SubLObjectFactory.makeString("unrepresented-term-indexing");
        $str37$Text_dumping_unrepresented_term_i = SubLObjectFactory.makeString("Text dumping unrepresented term indexing");
        $str38$____Old_Space = SubLObjectFactory.makeString(" -- Old Space");
        $str39$____New_Space = SubLObjectFactory.makeString(" -- New Space");
        $str40$cdolist = SubLObjectFactory.makeString("cdolist");
        $kw41$PATH = SubLObjectFactory.makeKeyword("PATH");
        $sym42$KB_TEXT_DUMP_COMPINX_VISIT_BEGIN_VISIT = SubLObjectFactory.makeSymbol("KB-TEXT-DUMP-COMPINX-VISIT-BEGIN-VISIT");
        $sym43$KB_TEXT_DUMP_COMPINX_VISIT_BEGIN_SUBINDEX = SubLObjectFactory.makeSymbol("KB-TEXT-DUMP-COMPINX-VISIT-BEGIN-SUBINDEX");
        $sym44$KB_TEXT_DUMP_COMPINX_VISIT_FINAL_INDEX = SubLObjectFactory.makeSymbol("KB-TEXT-DUMP-COMPINX-VISIT-FINAL-INDEX");
        $sym45$KB_TEXT_DUMP_COMPINX_VISIT_END_SUBINDEX = SubLObjectFactory.makeSymbol("KB-TEXT-DUMP-COMPINX-VISIT-END-SUBINDEX");
        $sym46$KB_TEXT_DUMP_COMPINX_VISIT_END_VISIT = SubLObjectFactory.makeSymbol("KB-TEXT-DUMP-COMPINX-VISIT-END-VISIT");
        $str47$Skipping_final_top_N_index__A___ = SubLObjectFactory.makeString("Skipping final top-N index ~A.~%");
        $sym48$_ = SubLObjectFactory.makeSymbol("<");
        $sym49$FINAL_INDEX_P = SubLObjectFactory.makeSymbol("FINAL-INDEX-P");
        $sym50$DO_STACK_ELEMENTS_STACK_ELEMENTS = SubLObjectFactory.makeSymbol("DO-STACK-ELEMENTS-STACK-ELEMENTS");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ITEMS"));
        $str52$A_ = SubLObjectFactory.makeString("A_");
        $sym53$KB_TEXT_CONVERT_DEDUCTION_SUPPORT_TO_RECIPE = SubLObjectFactory.makeSymbol("KB-TEXT-CONVERT-DEDUCTION-SUPPORT-TO-RECIPE");
        $sym54$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym55$KB_TEXT_COMPACT_HL_EXTERNAL_ID_STRING_CACHED = SubLObjectFactory.makeSymbol("KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED");
        $sym56$_KB_TEXT_COMPACT_HL_EXTERNAL_ID_STRING_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED-CACHING-STATE*");
        $int57$10000 = SubLObjectFactory.makeInteger(10000);
        $str58$kbtext = SubLObjectFactory.makeString("kbtext");
    }
}

/*

	Total time: 1330 ms
	
*/