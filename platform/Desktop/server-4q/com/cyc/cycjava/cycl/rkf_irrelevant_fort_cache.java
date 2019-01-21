package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_irrelevant_fort_cache extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache";
    public static final String myFingerPrint = "d7d6eb1fec295b96563158a166c4be395b85b66c30e969ff8c386dadc1d5b2b2";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 953L)
    private static SubLSymbol $rkf_irrelevant_fort_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 1265L)
    public static SubLSymbol $rkf_irrelevant_fht_name$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 1372L)
    public static SubLSymbol $use_rkf_irrelevant_fort_cacheP$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 1506L)
    private static SubLSymbol $rkf_irrelevant_fht_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 1683L)
    public static SubLSymbol $rkf_irrelevant_cache_base_file_name$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 2062L)
    private static SubLSymbol $max_kbs_backward_to_look_for_irrelevancy_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 3508L)
    private static SubLSymbol $preload_rkf_irrelevant_fort_cacheP$;
    private static final SubLString $str0$rkf_irrelevant_fht_lock;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$_RKF_IRRELEVANT_CACHE_BASE_FILE_NAME_;
    private static final SubLString $str3$rkf_irrelevant_fort_cache_fht;
    private static final SubLSymbol $kw4$LEXICAL;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$CLET;
    private static final SubLSymbol $sym7$_RKF_IRRELEVANT_FHT_NAME_;
    private static final SubLString $str8$_;
    private static final SubLInteger $int9$100;
    private static final SubLSymbol $kw10$HL_EXTERNALIZED_KEYS;
    private static final SubLString $str11$tmp_;
    private static final SubLString $str12$Generating_rkf_irrelevant_cache_t;
    private static final SubLString $str13$Generating_rkf_irrelevant_values_;
    private static final SubLSymbol $kw14$SKIP;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$THCL_SUPPORT;
    private static final SubLSymbol $sym17$FILE_BACKED_CACHE_P;
    private static final SubLString $str18$Looking_up_rkf_irrelevance_status;
    private static final SubLSymbol $kw19$NOT_FOUND;
    private static final SubLSymbol $sym20$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const21$EverythingPSC;
    private static final SubLSymbol $kw22$IRRELEVANT_NOWHERE;
    private static final SubLSymbol $kw23$IRRELEVANT_EVERYWHERE;
    private static final SubLSymbol $kw24$IRRELEVANT_SOMEWHERE;
    private static final SubLString $str25$Found_an_invalid_value_in_rkf_irr;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLSymbol $kw28$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw29$MESSAGE;
    private static final SubLSymbol $sym30$VALUE;
    private static final SubLSymbol $sym31$DO_FILE_HASH_TABLE;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$PWHEN;
    private static final SubLSymbol $sym34$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw35$THCL;
    private static final SubLSymbol $kw36$RESET;
    private static final SubLString $str37$Trying_to_insert_invalid_value_in;
    private static final SubLSymbol $sym38$FORT_P;
    private static final SubLString $str39$_A_can_not_be_converted_to_an_irr;
    private static final SubLSymbol $sym40$RKF_IRRELEVANT_ASSERTION_CACHE_CLEAR;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 1902L)
    public static SubLObject with_default_rkf_irrelevant_cache_file_path(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_irrelevant_fort_cache.$list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject filename = (SubLObject)rkf_irrelevant_fort_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_irrelevant_fort_cache.$list5);
        filename = current.first();
        current = current.rest();
        if (rkf_irrelevant_fort_cache.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)rkf_irrelevant_fort_cache.$sym6$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_irrelevant_fort_cache.$sym7$_RKF_IRRELEVANT_FHT_NAME_, filename)), ConsesLow.append(body, (SubLObject)rkf_irrelevant_fort_cache.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_irrelevant_fort_cache.$list5);
        return (SubLObject)rkf_irrelevant_fort_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 2294L)
    public static SubLObject get_default_rkf_irrelevant_cache_file_path(SubLObject kb) {
        if (kb == rkf_irrelevant_fort_cache.UNPROVIDED) {
            kb = control_vars.kb_loaded();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_irrelevant_fort_cache.NIL != subl_promotions.positive_integer_p(kb) && (!rkf_irrelevant_fort_cache.$rkf_irrelevant_fht_name$.getDynamicValue(thread).isString() || rkf_irrelevant_fort_cache.NIL == Filesys.probe_file(rkf_irrelevant_fort_cache.$rkf_irrelevant_fht_name$.getDynamicValue(thread)))) {
            rkf_irrelevant_fort_cache.$rkf_irrelevant_fht_name$.setDynamicValue(get_rkf_irrelevant_cache_file_path_internal(kb), thread);
        }
        return rkf_irrelevant_fort_cache.$rkf_irrelevant_fht_name$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 2720L)
    public static SubLObject get_latest_rkf_irrelevant_cache_file_path() {
        SubLObject kb;
        SubLObject path;
        for (kb = control_vars.kb_loaded(), path = (SubLObject)rkf_irrelevant_fort_cache.NIL; rkf_irrelevant_fort_cache.NIL != subl_promotions.positive_integer_p(kb) && Numbers.subtract(control_vars.kb_loaded(), kb).numLE(rkf_irrelevant_fort_cache.$max_kbs_backward_to_look_for_irrelevancy_cache$.getGlobalValue()) && (!path.isString() || rkf_irrelevant_fort_cache.NIL == Filesys.probe_file(path)); path = get_rkf_irrelevant_cache_file_path_internal(kb), kb = Numbers.subtract(kb, (SubLObject)rkf_irrelevant_fort_cache.ONE_INTEGER)) {}
        return path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 3185L)
    public static SubLObject get_rkf_irrelevant_cache_file_path_internal(final SubLObject kb) {
        final SubLObject path = Sequences.cconcatenate(file_backed_cache.$file_backed_cache_base_path$.getGlobalValue(), new SubLObject[] { operation_communication.kb_number_string(kb), rkf_irrelevant_fort_cache.$str8$_, rkf_irrelevant_fort_cache.$rkf_irrelevant_cache_base_file_name$.getGlobalValue() });
        return path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 3645L)
    public static SubLObject initialize_rkf_irrelevant_fort_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_irrelevant_fort_cache.NIL == control_vars.kb_loaded()) {
            return (SubLObject)rkf_irrelevant_fort_cache.NIL;
        }
        if (rkf_irrelevant_fort_cache.NIL == rkf_irrelevant_fort_cache.$rkf_irrelevant_fort_cache$.getGlobalValue()) {
            SubLObject release = (SubLObject)rkf_irrelevant_fort_cache.NIL;
            try {
                release = Locks.seize_lock(rkf_irrelevant_fort_cache.$rkf_irrelevant_fht_lock$.getGlobalValue());
                if (rkf_irrelevant_fort_cache.NIL == rkf_irrelevant_fort_cache.$rkf_irrelevant_fort_cache$.getGlobalValue()) {
                    final SubLObject _prev_bind_0 = file_hash_table.$fht_cache_percentage$.currentBinding(thread);
                    try {
                        file_hash_table.$fht_cache_percentage$.bind((SubLObject)rkf_irrelevant_fort_cache.$int9$100, thread);
                        final SubLObject path = get_latest_rkf_irrelevant_cache_file_path();
                        rkf_irrelevant_fort_cache.$rkf_irrelevant_fort_cache$.setGlobalValue((SubLObject)((rkf_irrelevant_fort_cache.NIL != Filesys.probe_file(path)) ? file_backed_cache.file_backed_cache_create(path, rkf_irrelevant_fort_cache.$preload_rkf_irrelevant_fort_cacheP$.getGlobalValue(), (SubLObject)rkf_irrelevant_fort_cache.T, file_hash_table.$fht_cache_percentage$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)rkf_irrelevant_fort_cache.EQUAL), (SubLObject)rkf_irrelevant_fort_cache.$kw10$HL_EXTERNALIZED_KEYS) : rkf_irrelevant_fort_cache.NIL));
                    }
                    finally {
                        file_hash_table.$fht_cache_percentage$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            finally {
                if (rkf_irrelevant_fort_cache.NIL != release) {
                    Locks.release_lock(rkf_irrelevant_fort_cache.$rkf_irrelevant_fht_lock$.getGlobalValue());
                }
            }
        }
        return (SubLObject)rkf_irrelevant_fort_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 4515L)
    public static SubLObject reset_rkf_irrelevant_fort_cache() {
        SubLObject release = (SubLObject)rkf_irrelevant_fort_cache.NIL;
        try {
            release = Locks.seize_lock(rkf_irrelevant_fort_cache.$rkf_irrelevant_fht_lock$.getGlobalValue());
            if (rkf_irrelevant_fort_cache.NIL != rkf_irrelevant_fort_cache.$rkf_irrelevant_fort_cache$.getGlobalValue()) {
                rkf_irrelevant_fort_cache.$rkf_irrelevant_fht_name$.setDynamicValue((SubLObject)rkf_irrelevant_fort_cache.NIL);
                file_backed_cache.file_backed_cache_reset(rkf_irrelevant_fort_cache.$rkf_irrelevant_fort_cache$.getGlobalValue(), get_default_rkf_irrelevant_cache_file_path((SubLObject)rkf_irrelevant_fort_cache.UNPROVIDED));
            }
        }
        finally {
            if (rkf_irrelevant_fort_cache.NIL != release) {
                Locks.release_lock(rkf_irrelevant_fort_cache.$rkf_irrelevant_fht_lock$.getGlobalValue());
            }
        }
        return (SubLObject)rkf_irrelevant_fort_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 4943L)
    public static SubLObject create_rkf_irrelevant_fort_cache(SubLObject filename, SubLObject tmp_dir) {
        if (filename == rkf_irrelevant_fort_cache.UNPROVIDED) {
            filename = get_default_rkf_irrelevant_cache_file_path((SubLObject)rkf_irrelevant_fort_cache.UNPROVIDED);
        }
        if (tmp_dir == rkf_irrelevant_fort_cache.UNPROVIDED) {
            tmp_dir = (SubLObject)rkf_irrelevant_fort_cache.$str11$tmp_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format((SubLObject)rkf_irrelevant_fort_cache.T, (SubLObject)rkf_irrelevant_fort_cache.$str12$Generating_rkf_irrelevant_cache_t, filename);
        SubLObject i = (SubLObject)rkf_irrelevant_fort_cache.ZERO_INTEGER;
        final SubLObject doneP = (SubLObject)rkf_irrelevant_fort_cache.NIL;
        final SubLObject fht = file_hash_table.fast_create_file_hash_table(filename, tmp_dir, Symbols.symbol_function((SubLObject)rkf_irrelevant_fort_cache.EQUAL), (SubLObject)rkf_irrelevant_fort_cache.$kw10$HL_EXTERNALIZED_KEYS);
        kb_cleanup.kill_duplicate_narts();
        final SubLObject message = (SubLObject)rkf_irrelevant_fort_cache.$str13$Generating_rkf_irrelevant_values_;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = (SubLObject)rkf_irrelevant_fort_cache.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)rkf_irrelevant_fort_cache.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rkf_irrelevant_fort_cache.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rkf_irrelevant_fort_cache.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message);
                SubLObject rest;
                SubLObject idx;
                SubLObject table_var;
                SubLObject idx_$1;
                SubLObject vector_var;
                SubLObject backwardP_var;
                SubLObject length;
                SubLObject current;
                SubLObject datum;
                SubLObject start;
                SubLObject end;
                SubLObject delta;
                SubLObject end_var;
                SubLObject id;
                SubLObject fort;
                SubLObject val;
                SubLObject idx_$2;
                SubLObject sparse;
                SubLObject id2;
                SubLObject end_id;
                SubLObject v_default;
                SubLObject fort2;
                SubLObject val2;
                for (rest = (SubLObject)rkf_irrelevant_fort_cache.NIL, rest = forts.do_forts_tables(); rkf_irrelevant_fort_cache.NIL == doneP && rkf_irrelevant_fort_cache.NIL != rest; rest = rest.rest()) {
                    table_var = (idx = rest.first());
                    if (rkf_irrelevant_fort_cache.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)rkf_irrelevant_fort_cache.$kw14$SKIP)) {
                        idx_$1 = idx;
                        if (rkf_irrelevant_fort_cache.NIL == id_index.id_index_dense_objects_empty_p(idx_$1, (SubLObject)rkf_irrelevant_fort_cache.$kw14$SKIP)) {
                            vector_var = id_index.id_index_dense_objects(idx_$1);
                            backwardP_var = (SubLObject)rkf_irrelevant_fort_cache.NIL;
                            length = Sequences.length(vector_var);
                            datum = (current = (SubLObject)((rkf_irrelevant_fort_cache.NIL != backwardP_var) ? ConsesLow.list(Numbers.subtract(length, (SubLObject)rkf_irrelevant_fort_cache.ONE_INTEGER), (SubLObject)rkf_irrelevant_fort_cache.MINUS_ONE_INTEGER, (SubLObject)rkf_irrelevant_fort_cache.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)rkf_irrelevant_fort_cache.ZERO_INTEGER, length, (SubLObject)rkf_irrelevant_fort_cache.ONE_INTEGER)));
                            start = (SubLObject)rkf_irrelevant_fort_cache.NIL;
                            end = (SubLObject)rkf_irrelevant_fort_cache.NIL;
                            delta = (SubLObject)rkf_irrelevant_fort_cache.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_irrelevant_fort_cache.$list15);
                            start = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_irrelevant_fort_cache.$list15);
                            end = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_irrelevant_fort_cache.$list15);
                            delta = current.first();
                            current = current.rest();
                            if (rkf_irrelevant_fort_cache.NIL == current) {
                                if (rkf_irrelevant_fort_cache.NIL == doneP) {
                                    for (end_var = end, id = (SubLObject)rkf_irrelevant_fort_cache.NIL, id = start; rkf_irrelevant_fort_cache.NIL == doneP && rkf_irrelevant_fort_cache.NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                                        fort = Vectors.aref(vector_var, id);
                                        if (rkf_irrelevant_fort_cache.NIL == id_index.id_index_tombstone_p(fort) || rkf_irrelevant_fort_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)rkf_irrelevant_fort_cache.$kw14$SKIP)) {
                                            if (rkf_irrelevant_fort_cache.NIL != id_index.id_index_tombstone_p(fort)) {
                                                fort = (SubLObject)rkf_irrelevant_fort_cache.$kw14$SKIP;
                                            }
                                            sofar = Numbers.add(sofar, (SubLObject)rkf_irrelevant_fort_cache.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                            i = Numbers.add(i, (SubLObject)rkf_irrelevant_fort_cache.ONE_INTEGER);
                                            val = compute_rkf_irrelevant_fort_cache_value(fort);
                                            if (val.isNumber()) {
                                                file_hash_table.fast_put_file_hash_table(fort, fht, val);
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_irrelevant_fort_cache.$list15);
                            }
                        }
                        idx_$2 = idx;
                        if (rkf_irrelevant_fort_cache.NIL == id_index.id_index_sparse_objects_empty_p(idx_$2) || rkf_irrelevant_fort_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)rkf_irrelevant_fort_cache.$kw14$SKIP)) {
                            sparse = id_index.id_index_sparse_objects(idx_$2);
                            id2 = id_index.id_index_sparse_id_threshold(idx_$2);
                            end_id = id_index.id_index_next_id(idx_$2);
                            v_default = (SubLObject)((rkf_irrelevant_fort_cache.NIL != id_index.id_index_skip_tombstones_p((SubLObject)rkf_irrelevant_fort_cache.$kw14$SKIP)) ? rkf_irrelevant_fort_cache.NIL : rkf_irrelevant_fort_cache.$kw14$SKIP);
                            while (id2.numL(end_id) && rkf_irrelevant_fort_cache.NIL == doneP) {
                                fort2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (rkf_irrelevant_fort_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)rkf_irrelevant_fort_cache.$kw14$SKIP) || rkf_irrelevant_fort_cache.NIL == id_index.id_index_tombstone_p(fort2)) {
                                    sofar = Numbers.add(sofar, (SubLObject)rkf_irrelevant_fort_cache.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    i = Numbers.add(i, (SubLObject)rkf_irrelevant_fort_cache.ONE_INTEGER);
                                    val2 = compute_rkf_irrelevant_fort_cache_value(fort2);
                                    if (val2.isNumber()) {
                                        file_hash_table.fast_put_file_hash_table(fort2, fht, val2);
                                    }
                                }
                                id2 = Numbers.add(id2, (SubLObject)rkf_irrelevant_fort_cache.ONE_INTEGER);
                            }
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_irrelevant_fort_cache.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        file_hash_table.fast_put_file_hash_table((SubLObject)rkf_irrelevant_fort_cache.$kw16$THCL_SUPPORT, fht, (SubLObject)rkf_irrelevant_fort_cache.T);
        file_hash_table.finalize_fast_create_file_hash_table(fht, (SubLObject)rkf_irrelevant_fort_cache.UNPROVIDED, (SubLObject)rkf_irrelevant_fort_cache.UNPROVIDED);
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 6175L)
    public static SubLObject compute_rkf_irrelevant_fort_cache_value(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject val = (SubLObject)rkf_irrelevant_fort_cache.NIL;
        final SubLObject _prev_bind_0 = rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.currentBinding(thread);
        try {
            rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.bind((SubLObject)rkf_irrelevant_fort_cache.NIL, thread);
            if (rkf_irrelevant_fort_cache.NIL == dont_want_to_test_this_oneP(fort)) {
                SubLObject store = (SubLObject)rkf_irrelevant_fort_cache.NIL;
                try {
                    store = inference_datastructures_problem_store.new_problem_store((SubLObject)rkf_irrelevant_fort_cache.NIL);
                    final SubLObject irrelevant_everywhereP = rkf_relevance_utilities.compute_fort_irrelevant_everywhere_status(fort, store);
                    final SubLObject irrelevant_nowhereP = (SubLObject)((rkf_irrelevant_fort_cache.NIL != irrelevant_everywhereP) ? rkf_irrelevant_fort_cache.NIL : rkf_relevance_utilities.compute_fort_irrelevant_nowhere_status(fort, store));
                    final SubLObject irrelevant_somewhereP = (SubLObject)SubLObjectFactory.makeBoolean(rkf_irrelevant_fort_cache.NIL == irrelevant_nowhereP);
                    final SubLObject thclP = (SubLObject)((rkf_irrelevant_fort_cache.NIL != irrelevant_nowhereP) ? thcl.compute_thcl_status_of_fort(fort, (SubLObject)rkf_irrelevant_fort_cache.NIL, (SubLObject)rkf_irrelevant_fort_cache.T, (SubLObject)rkf_irrelevant_fort_cache.UNPROVIDED) : rkf_irrelevant_fort_cache.NIL);
                    val = (SubLObject)((rkf_irrelevant_fort_cache.NIL != irrelevant_everywhereP) ? rkf_irrelevant_fort_cache.ONE_INTEGER : ((rkf_irrelevant_fort_cache.NIL != irrelevant_somewhereP) ? rkf_irrelevant_fort_cache.TWO_INTEGER : ((rkf_irrelevant_fort_cache.NIL != thclP) ? rkf_irrelevant_fort_cache.THREE_INTEGER : rkf_irrelevant_fort_cache.ZERO_INTEGER)));
                }
                finally {
                    final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_irrelevant_fort_cache.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        inference_datastructures_problem_store.destroy_problem_store(store);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                    }
                }
            }
        }
        finally {
            rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.rebind(_prev_bind_0, thread);
        }
        return val;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 6876L)
    public static SubLObject verify_rkf_irrelevant_fort_cache(SubLObject fbc) {
        if (fbc == rkf_irrelevant_fort_cache.UNPROVIDED) {
            fbc = rkf_irrelevant_fort_cache.$rkf_irrelevant_fort_cache$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_irrelevant_fort_cache.NIL != file_backed_cache.file_backed_cache_p(fbc) : fbc;
        final SubLObject bad_forts = (SubLObject)rkf_irrelevant_fort_cache.NIL;
        final SubLObject message = (SubLObject)rkf_irrelevant_fort_cache.$str18$Looking_up_rkf_irrelevance_status;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = (SubLObject)rkf_irrelevant_fort_cache.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)rkf_irrelevant_fort_cache.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rkf_irrelevant_fort_cache.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rkf_irrelevant_fort_cache.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = (SubLObject)rkf_irrelevant_fort_cache.NIL;
                table_var = cdolist_list_var.first();
                while (rkf_irrelevant_fort_cache.NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (rkf_irrelevant_fort_cache.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)rkf_irrelevant_fort_cache.$kw14$SKIP)) {
                        final SubLObject idx_$5 = idx;
                        if (rkf_irrelevant_fort_cache.NIL == id_index.id_index_dense_objects_empty_p(idx_$5, (SubLObject)rkf_irrelevant_fort_cache.$kw14$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$5);
                            final SubLObject backwardP_var = (SubLObject)rkf_irrelevant_fort_cache.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject fort;
                            SubLObject val;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)rkf_irrelevant_fort_cache.NIL, v_iteration = (SubLObject)rkf_irrelevant_fort_cache.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)rkf_irrelevant_fort_cache.ONE_INTEGER)) {
                                id = ((rkf_irrelevant_fort_cache.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)rkf_irrelevant_fort_cache.ONE_INTEGER) : v_iteration);
                                fort = Vectors.aref(vector_var, id);
                                if (rkf_irrelevant_fort_cache.NIL == id_index.id_index_tombstone_p(fort) || rkf_irrelevant_fort_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)rkf_irrelevant_fort_cache.$kw14$SKIP)) {
                                    if (rkf_irrelevant_fort_cache.NIL != id_index.id_index_tombstone_p(fort)) {
                                        fort = (SubLObject)rkf_irrelevant_fort_cache.$kw14$SKIP;
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)rkf_irrelevant_fort_cache.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    if (rkf_irrelevant_fort_cache.NIL == dont_want_to_test_this_oneP(fort)) {
                                        val = file_backed_cache.file_backed_cache_lookup(fort, fbc, (SubLObject)rkf_irrelevant_fort_cache.$kw19$NOT_FOUND, (SubLObject)rkf_irrelevant_fort_cache.UNPROVIDED);
                                        if (val == rkf_irrelevant_fort_cache.$kw19$NOT_FOUND) {
                                            fort = (SubLObject)ConsesLow.cons(bad_forts, fort);
                                        }
                                    }
                                }
                            }
                        }
                        final SubLObject idx_$6 = idx;
                        if (rkf_irrelevant_fort_cache.NIL == id_index.id_index_sparse_objects_empty_p(idx_$6) || rkf_irrelevant_fort_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)rkf_irrelevant_fort_cache.$kw14$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$6);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$6);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$6);
                            final SubLObject v_default = (SubLObject)((rkf_irrelevant_fort_cache.NIL != id_index.id_index_skip_tombstones_p((SubLObject)rkf_irrelevant_fort_cache.$kw14$SKIP)) ? rkf_irrelevant_fort_cache.NIL : rkf_irrelevant_fort_cache.$kw14$SKIP);
                            while (id2.numL(end_id)) {
                                SubLObject fort2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (rkf_irrelevant_fort_cache.NIL == id_index.id_index_skip_tombstones_p((SubLObject)rkf_irrelevant_fort_cache.$kw14$SKIP) || rkf_irrelevant_fort_cache.NIL == id_index.id_index_tombstone_p(fort2)) {
                                    sofar = Numbers.add(sofar, (SubLObject)rkf_irrelevant_fort_cache.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    if (rkf_irrelevant_fort_cache.NIL == dont_want_to_test_this_oneP(fort2)) {
                                        final SubLObject val2 = file_backed_cache.file_backed_cache_lookup(fort2, fbc, (SubLObject)rkf_irrelevant_fort_cache.$kw19$NOT_FOUND, (SubLObject)rkf_irrelevant_fort_cache.UNPROVIDED);
                                        if (val2 == rkf_irrelevant_fort_cache.$kw19$NOT_FOUND) {
                                            fort2 = (SubLObject)ConsesLow.cons(bad_forts, fort2);
                                        }
                                    }
                                }
                                id2 = Numbers.add(id2, (SubLObject)rkf_irrelevant_fort_cache.ONE_INTEGER);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_irrelevant_fort_cache.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return bad_forts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 7653L)
    public static SubLObject dont_want_to_test_this_oneP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject is_wff = (SubLObject)rkf_irrelevant_fort_cache.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_irrelevant_fort_cache.$sym20$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rkf_irrelevant_fort_cache.$const21$EverythingPSC, thread);
            is_wff = (SubLObject)((rkf_irrelevant_fort_cache.NIL != constant_handles.constant_p(fort)) ? rkf_irrelevant_fort_cache.T : wff.el_wft_fastP(narts_high.nart_el_formula(fort), (SubLObject)rkf_irrelevant_fort_cache.UNPROVIDED));
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_irrelevant_fort_cache.NIL != term.skolem_nartP(fort) || rkf_irrelevant_fort_cache.NIL != term.reified_skolem_fnP(fort) || rkf_irrelevant_fort_cache.NIL == is_wff);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 8269L)
    public static SubLObject rkf_irrelevant_cache_lookup(final SubLObject key) {
        final SubLObject default_value = (SubLObject)rkf_irrelevant_fort_cache.$kw19$NOT_FOUND;
        final SubLObject val = rkf_irrelevant_cache_value(key, default_value);
        SubLObject result = default_value;
        if (val.eql((SubLObject)rkf_irrelevant_fort_cache.ZERO_INTEGER)) {
            result = (SubLObject)rkf_irrelevant_fort_cache.$kw22$IRRELEVANT_NOWHERE;
        }
        else if (val.eql((SubLObject)rkf_irrelevant_fort_cache.ONE_INTEGER)) {
            result = (SubLObject)rkf_irrelevant_fort_cache.$kw23$IRRELEVANT_EVERYWHERE;
        }
        else if (val.eql((SubLObject)rkf_irrelevant_fort_cache.TWO_INTEGER)) {
            result = (SubLObject)rkf_irrelevant_fort_cache.$kw24$IRRELEVANT_SOMEWHERE;
        }
        else if (val.eql((SubLObject)rkf_irrelevant_fort_cache.THREE_INTEGER)) {
            result = (SubLObject)rkf_irrelevant_fort_cache.$kw22$IRRELEVANT_NOWHERE;
        }
        else if (val.eql((SubLObject)rkf_irrelevant_fort_cache.FOUR_INTEGER)) {
            reset_rkf_irrelevant_cache_for_fort(key);
            if (!rkf_irrelevant_fort_cache.FOUR_INTEGER.eql(rkf_irrelevant_cache_value(key, (SubLObject)rkf_irrelevant_fort_cache.UNPROVIDED))) {
                result = rkf_irrelevant_cache_lookup(key);
            }
        }
        else if (!val.eql(default_value)) {
            Errors.error((SubLObject)rkf_irrelevant_fort_cache.$str25$Found_an_invalid_value_in_rkf_irr, val, key);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 9460L)
    public static SubLObject rkf_irrelevant_cache_supports_thclP() {
        return rkf_irrelevant_cache_value((SubLObject)rkf_irrelevant_fort_cache.$kw16$THCL_SUPPORT, (SubLObject)rkf_irrelevant_fort_cache.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 9574L)
    public static SubLObject rkf_irrelevant_cache_thclP(final SubLObject fort) {
        return Equality.eql((SubLObject)rkf_irrelevant_fort_cache.THREE_INTEGER, rkf_irrelevant_cache_value(fort, (SubLObject)rkf_irrelevant_fort_cache.$kw19$NOT_FOUND));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 9760L)
    public static SubLObject do_thcl_forts_from_rkf_irrelevance_cache(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_irrelevant_fort_cache.$list26);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fort = (SubLObject)rkf_irrelevant_fort_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_irrelevant_fort_cache.$list26);
        fort = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)rkf_irrelevant_fort_cache.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)rkf_irrelevant_fort_cache.NIL;
        SubLObject current_$8 = (SubLObject)rkf_irrelevant_fort_cache.NIL;
        while (rkf_irrelevant_fort_cache.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_irrelevant_fort_cache.$list26);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_irrelevant_fort_cache.$list26);
            if (rkf_irrelevant_fort_cache.NIL == conses_high.member(current_$8, (SubLObject)rkf_irrelevant_fort_cache.$list27, (SubLObject)rkf_irrelevant_fort_cache.UNPROVIDED, (SubLObject)rkf_irrelevant_fort_cache.UNPROVIDED)) {
                bad = (SubLObject)rkf_irrelevant_fort_cache.T;
            }
            if (current_$8 == rkf_irrelevant_fort_cache.$kw28$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (rkf_irrelevant_fort_cache.NIL != bad && rkf_irrelevant_fort_cache.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_irrelevant_fort_cache.$list26);
        }
        final SubLObject message_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_irrelevant_fort_cache.$kw29$MESSAGE, current);
        final SubLObject message = (SubLObject)((rkf_irrelevant_fort_cache.NIL != message_tail) ? conses_high.cadr(message_tail) : rkf_irrelevant_fort_cache.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject value = (SubLObject)rkf_irrelevant_fort_cache.$sym30$VALUE;
        return (SubLObject)ConsesLow.list((SubLObject)rkf_irrelevant_fort_cache.$sym31$DO_FILE_HASH_TABLE, (SubLObject)ConsesLow.list(fort, value, (SubLObject)rkf_irrelevant_fort_cache.$list32, (SubLObject)rkf_irrelevant_fort_cache.$kw29$MESSAGE, message), (SubLObject)ConsesLow.listS((SubLObject)rkf_irrelevant_fort_cache.$sym33$PWHEN, (SubLObject)ConsesLow.list((SubLObject)rkf_irrelevant_fort_cache.EQL, (SubLObject)rkf_irrelevant_fort_cache.THREE_INTEGER, value), ConsesLow.append(body, (SubLObject)rkf_irrelevant_fort_cache.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 10174L)
    public static SubLObject rkf_irrelevant_cache_value(final SubLObject key, SubLObject default_value) {
        if (default_value == rkf_irrelevant_fort_cache.UNPROVIDED) {
            default_value = (SubLObject)rkf_irrelevant_fort_cache.$kw19$NOT_FOUND;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fbc = rkf_irrelevant_fort_cache.$rkf_irrelevant_fort_cache$.getGlobalValue();
        final SubLObject should_warn = (SubLObject)rkf_irrelevant_fort_cache.NIL;
        SubLObject msg = (SubLObject)rkf_irrelevant_fort_cache.NIL;
        SubLObject result = default_value;
        if (rkf_irrelevant_fort_cache.NIL == rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.getDynamicValue(thread)) {
            return default_value;
        }
        if (rkf_irrelevant_fort_cache.NIL == forts.fort_p(key)) {
            return default_value;
        }
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)rkf_irrelevant_fort_cache.$sym34$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (rkf_irrelevant_fort_cache.NIL == fbc) {
                        SubLObject msg_$9 = (SubLObject)rkf_irrelevant_fort_cache.NIL;
                        try {
                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            final SubLObject _prev_bind_0_$10 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind((SubLObject)rkf_irrelevant_fort_cache.$sym34$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    initialize_rkf_irrelevant_fort_cache();
                                    fbc = rkf_irrelevant_fort_cache.$rkf_irrelevant_fort_cache$.getGlobalValue();
                                }
                                catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, (SubLObject)rkf_irrelevant_fort_cache.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            msg_$9 = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        if (rkf_irrelevant_fort_cache.NIL != msg_$9 && rkf_irrelevant_fort_cache.NIL != should_warn) {
                            Errors.warn(msg_$9);
                        }
                    }
                    assert rkf_irrelevant_fort_cache.NIL != file_backed_cache.file_backed_cache_p(fbc) : fbc;
                    result = file_backed_cache.file_backed_cache_lookup(key, fbc, default_value, (SubLObject)rkf_irrelevant_fort_cache.UNPROVIDED);
                }
                catch (Throwable catch_var2) {
                    Errors.handleThrowable(catch_var2, (SubLObject)rkf_irrelevant_fort_cache.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            msg = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (rkf_irrelevant_fort_cache.NIL != msg && rkf_irrelevant_fort_cache.NIL != should_warn) {
            Errors.warn(msg);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 11037L)
    public static SubLObject rkf_irrelevant_cache_enter(final SubLObject key, final SubLObject val, SubLObject fbc) {
        if (fbc == rkf_irrelevant_fort_cache.UNPROVIDED) {
            fbc = rkf_irrelevant_fort_cache.$rkf_irrelevant_fort_cache$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_irrelevant_fort_cache.NIL == rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$.getDynamicValue(thread)) {
            return (SubLObject)rkf_irrelevant_fort_cache.NIL;
        }
        assert rkf_irrelevant_fort_cache.NIL != file_backed_cache.file_backed_cache_p(fbc) : fbc;
        if (rkf_irrelevant_fort_cache.NIL == rkf_irrelevant_fort_cache.$rkf_irrelevant_fort_cache$.getGlobalValue()) {
            SubLObject msg = (SubLObject)rkf_irrelevant_fort_cache.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)rkf_irrelevant_fort_cache.$sym34$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        initialize_rkf_irrelevant_fort_cache();
                        fbc = rkf_irrelevant_fort_cache.$rkf_irrelevant_fort_cache$.getGlobalValue();
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)rkf_irrelevant_fort_cache.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (rkf_irrelevant_fort_cache.NIL != msg) {
                Errors.warn(msg);
                return (SubLObject)rkf_irrelevant_fort_cache.NIL;
            }
        }
        final SubLObject value = (SubLObject)((val == rkf_irrelevant_fort_cache.$kw22$IRRELEVANT_NOWHERE) ? rkf_irrelevant_fort_cache.ZERO_INTEGER : ((val == rkf_irrelevant_fort_cache.$kw23$IRRELEVANT_EVERYWHERE) ? rkf_irrelevant_fort_cache.ONE_INTEGER : ((val == rkf_irrelevant_fort_cache.$kw24$IRRELEVANT_SOMEWHERE) ? rkf_irrelevant_fort_cache.TWO_INTEGER : ((val == rkf_irrelevant_fort_cache.$kw35$THCL) ? rkf_irrelevant_fort_cache.THREE_INTEGER : ((val == rkf_irrelevant_fort_cache.$kw36$RESET) ? rkf_irrelevant_fort_cache.FOUR_INTEGER : Errors.error((SubLObject)rkf_irrelevant_fort_cache.$str37$Trying_to_insert_invalid_value_in, val, key))))));
        return file_backed_cache.file_backed_cache_enter(key, value, fbc);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 12889L)
    public static SubLObject get_rkf_irrelevant_fort_cache() {
        return rkf_irrelevant_fort_cache.$rkf_irrelevant_fort_cache$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 13045L)
    public static SubLObject reset_rkf_irrelevant_cache_for_fort(final SubLObject fort) {
        assert rkf_irrelevant_fort_cache.NIL != forts.fort_p(fort) : fort;
        final SubLObject integer_value = compute_rkf_irrelevant_fort_cache_value(fort);
        final SubLObject keyword_value = convert_irrelevance_number_to_keyword(integer_value);
        if (rkf_irrelevant_fort_cache.NIL == file_backed_cache.file_backed_cache_p(get_rkf_irrelevant_fort_cache())) {
            initialize_rkf_irrelevant_fort_cache();
        }
        return rkf_irrelevant_cache_enter(fort, keyword_value, (SubLObject)rkf_irrelevant_fort_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 13449L)
    public static SubLObject convert_irrelevance_number_to_keyword(final SubLObject integer) {
        if (integer.eql((SubLObject)rkf_irrelevant_fort_cache.ZERO_INTEGER)) {
            return (SubLObject)rkf_irrelevant_fort_cache.$kw22$IRRELEVANT_NOWHERE;
        }
        if (integer.eql((SubLObject)rkf_irrelevant_fort_cache.ONE_INTEGER)) {
            return (SubLObject)rkf_irrelevant_fort_cache.$kw23$IRRELEVANT_EVERYWHERE;
        }
        if (integer.eql((SubLObject)rkf_irrelevant_fort_cache.TWO_INTEGER)) {
            return (SubLObject)rkf_irrelevant_fort_cache.$kw24$IRRELEVANT_SOMEWHERE;
        }
        if (integer.eql((SubLObject)rkf_irrelevant_fort_cache.THREE_INTEGER)) {
            return (SubLObject)rkf_irrelevant_fort_cache.$kw35$THCL;
        }
        if (integer.eql((SubLObject)rkf_irrelevant_fort_cache.FOUR_INTEGER)) {
            return (SubLObject)rkf_irrelevant_fort_cache.$kw36$RESET;
        }
        Errors.error((SubLObject)rkf_irrelevant_fort_cache.$str39$_A_can_not_be_converted_to_an_irr, integer);
        return (SubLObject)rkf_irrelevant_fort_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-irrelevant-fort-cache.lisp", position = 13765L)
    public static SubLObject rkf_irrelevant_assertion_cache_clear(SubLObject source, final SubLObject assertion) {
        final SubLObject v_term = assertions_high.gaf_arg1(assertion);
        if (rkf_irrelevant_fort_cache.NIL != forts.fort_p(v_term)) {
            rkf_irrelevant_cache_enter(v_term, (SubLObject)rkf_irrelevant_fort_cache.$kw36$RESET, (SubLObject)rkf_irrelevant_fort_cache.UNPROVIDED);
            final SubLObject event = kb_modification_event.post_kb_modify_irrelevance_event(v_term, assertion);
            if (rkf_irrelevant_fort_cache.NIL != event) {
                cure_api.clear_term_learner_irrelevancies_for_term(event, (SubLObject)rkf_irrelevant_fort_cache.UNPROVIDED);
            }
        }
        return (SubLObject)rkf_irrelevant_fort_cache.NIL;
    }
    
    public static SubLObject declare_rkf_irrelevant_fort_cache_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "with_default_rkf_irrelevant_cache_file_path", "WITH-DEFAULT-RKF-IRRELEVANT-CACHE-FILE-PATH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "get_default_rkf_irrelevant_cache_file_path", "GET-DEFAULT-RKF-IRRELEVANT-CACHE-FILE-PATH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "get_latest_rkf_irrelevant_cache_file_path", "GET-LATEST-RKF-IRRELEVANT-CACHE-FILE-PATH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "get_rkf_irrelevant_cache_file_path_internal", "GET-RKF-IRRELEVANT-CACHE-FILE-PATH-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "initialize_rkf_irrelevant_fort_cache", "INITIALIZE-RKF-IRRELEVANT-FORT-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "reset_rkf_irrelevant_fort_cache", "RESET-RKF-IRRELEVANT-FORT-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "create_rkf_irrelevant_fort_cache", "CREATE-RKF-IRRELEVANT-FORT-CACHE", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "compute_rkf_irrelevant_fort_cache_value", "COMPUTE-RKF-IRRELEVANT-FORT-CACHE-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "verify_rkf_irrelevant_fort_cache", "VERIFY-RKF-IRRELEVANT-FORT-CACHE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "dont_want_to_test_this_oneP", "DONT-WANT-TO-TEST-THIS-ONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "rkf_irrelevant_cache_lookup", "RKF-IRRELEVANT-CACHE-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "rkf_irrelevant_cache_supports_thclP", "RKF-IRRELEVANT-CACHE-SUPPORTS-THCL?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "rkf_irrelevant_cache_thclP", "RKF-IRRELEVANT-CACHE-THCL?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "do_thcl_forts_from_rkf_irrelevance_cache", "DO-THCL-FORTS-FROM-RKF-IRRELEVANCE-CACHE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "rkf_irrelevant_cache_value", "RKF-IRRELEVANT-CACHE-VALUE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "rkf_irrelevant_cache_enter", "RKF-IRRELEVANT-CACHE-ENTER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "get_rkf_irrelevant_fort_cache", "GET-RKF-IRRELEVANT-FORT-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "reset_rkf_irrelevant_cache_for_fort", "RESET-RKF-IRRELEVANT-CACHE-FOR-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "convert_irrelevance_number_to_keyword", "CONVERT-IRRELEVANCE-NUMBER-TO-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_irrelevant_fort_cache", "rkf_irrelevant_assertion_cache_clear", "RKF-IRRELEVANT-ASSERTION-CACHE-CLEAR", 2, 0, false);
        return (SubLObject)rkf_irrelevant_fort_cache.NIL;
    }
    
    public static SubLObject init_rkf_irrelevant_fort_cache_file() {
        rkf_irrelevant_fort_cache.$rkf_irrelevant_fort_cache$ = SubLFiles.deflexical("*RKF-IRRELEVANT-FORT-CACHE*", (SubLObject)rkf_irrelevant_fort_cache.NIL);
        rkf_irrelevant_fort_cache.$rkf_irrelevant_fht_name$ = SubLFiles.defparameter("*RKF-IRRELEVANT-FHT-NAME*", (SubLObject)rkf_irrelevant_fort_cache.NIL);
        rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$ = SubLFiles.defparameter("*USE-RKF-IRRELEVANT-FORT-CACHE?*", (SubLObject)rkf_irrelevant_fort_cache.T);
        rkf_irrelevant_fort_cache.$rkf_irrelevant_fht_lock$ = SubLFiles.deflexical("*RKF-IRRELEVANT-FHT-LOCK*", Locks.make_lock((SubLObject)rkf_irrelevant_fort_cache.$str0$rkf_irrelevant_fht_lock));
        rkf_irrelevant_fort_cache.$rkf_irrelevant_cache_base_file_name$ = SubLFiles.deflexical("*RKF-IRRELEVANT-CACHE-BASE-FILE-NAME*", red_infrastructure_macros.red_def_helper((SubLObject)(rkf_irrelevant_fort_cache.$list1.isSymbol() ? Symbols.symbol_value((SubLObject)rkf_irrelevant_fort_cache.$list1) : rkf_irrelevant_fort_cache.$list1), (SubLObject)rkf_irrelevant_fort_cache.$sym2$_RKF_IRRELEVANT_CACHE_BASE_FILE_NAME_, (SubLObject)(rkf_irrelevant_fort_cache.$str3$rkf_irrelevant_fort_cache_fht.isSymbol() ? Symbols.symbol_value((SubLObject)rkf_irrelevant_fort_cache.$str3$rkf_irrelevant_fort_cache_fht) : rkf_irrelevant_fort_cache.$str3$rkf_irrelevant_fort_cache_fht), (SubLObject)rkf_irrelevant_fort_cache.$kw4$LEXICAL, (SubLObject)rkf_irrelevant_fort_cache.UNPROVIDED));
        rkf_irrelevant_fort_cache.$max_kbs_backward_to_look_for_irrelevancy_cache$ = SubLFiles.deflexical("*MAX-KBS-BACKWARD-TO-LOOK-FOR-IRRELEVANCY-CACHE*", (SubLObject)rkf_irrelevant_fort_cache.FIVE_INTEGER);
        rkf_irrelevant_fort_cache.$preload_rkf_irrelevant_fort_cacheP$ = SubLFiles.deflexical("*PRELOAD-RKF-IRRELEVANT-FORT-CACHE?*", (SubLObject)rkf_irrelevant_fort_cache.NIL);
        return (SubLObject)rkf_irrelevant_fort_cache.NIL;
    }
    
    public static SubLObject setup_rkf_irrelevant_fort_cache_file() {
        utilities_macros.register_kb_function((SubLObject)rkf_irrelevant_fort_cache.$sym40$RKF_IRRELEVANT_ASSERTION_CACHE_CLEAR);
        return (SubLObject)rkf_irrelevant_fort_cache.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_rkf_irrelevant_fort_cache_file();
    }
    
    @Override
	public void initializeVariables() {
        init_rkf_irrelevant_fort_cache_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_rkf_irrelevant_fort_cache_file();
    }
    
    static {
        me = (SubLFile)new rkf_irrelevant_fort_cache();
        rkf_irrelevant_fort_cache.$rkf_irrelevant_fort_cache$ = null;
        rkf_irrelevant_fort_cache.$rkf_irrelevant_fht_name$ = null;
        rkf_irrelevant_fort_cache.$use_rkf_irrelevant_fort_cacheP$ = null;
        rkf_irrelevant_fort_cache.$rkf_irrelevant_fht_lock$ = null;
        rkf_irrelevant_fort_cache.$rkf_irrelevant_cache_base_file_name$ = null;
        rkf_irrelevant_fort_cache.$max_kbs_backward_to_look_for_irrelevancy_cache$ = null;
        rkf_irrelevant_fort_cache.$preload_rkf_irrelevant_fort_cacheP$ = null;
        $str0$rkf_irrelevant_fht_lock = SubLObjectFactory.makeString("rkf-irrelevant-fht-lock");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application.file-backed-cache.rkf-irrelevant-fort-cache-file-name"));
        $sym2$_RKF_IRRELEVANT_CACHE_BASE_FILE_NAME_ = SubLObjectFactory.makeSymbol("*RKF-IRRELEVANT-CACHE-BASE-FILE-NAME*");
        $str3$rkf_irrelevant_fort_cache_fht = SubLObjectFactory.makeString("rkf-irrelevant-fort-cache.fht");
        $kw4$LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILENAME")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym6$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym7$_RKF_IRRELEVANT_FHT_NAME_ = SubLObjectFactory.makeSymbol("*RKF-IRRELEVANT-FHT-NAME*");
        $str8$_ = SubLObjectFactory.makeString("/");
        $int9$100 = SubLObjectFactory.makeInteger(100);
        $kw10$HL_EXTERNALIZED_KEYS = SubLObjectFactory.makeKeyword("HL-EXTERNALIZED-KEYS");
        $str11$tmp_ = SubLObjectFactory.makeString("tmp/");
        $str12$Generating_rkf_irrelevant_cache_t = SubLObjectFactory.makeString("Generating rkf irrelevant cache to file: ~A");
        $str13$Generating_rkf_irrelevant_values_ = SubLObjectFactory.makeString("Generating rkf irrelevant values for all forts ....");
        $kw14$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("START"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("END"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("DELTA"));
        $kw16$THCL_SUPPORT = SubLObjectFactory.makeKeyword("THCL-SUPPORT");
        $sym17$FILE_BACKED_CACHE_P = SubLObjectFactory.makeSymbol("FILE-BACKED-CACHE-P");
        $str18$Looking_up_rkf_irrelevance_status = SubLObjectFactory.makeString("Looking up rkf-irrelevance status for all forts ....");
        $kw19$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $sym20$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const21$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw22$IRRELEVANT_NOWHERE = SubLObjectFactory.makeKeyword("IRRELEVANT-NOWHERE");
        $kw23$IRRELEVANT_EVERYWHERE = SubLObjectFactory.makeKeyword("IRRELEVANT-EVERYWHERE");
        $kw24$IRRELEVANT_SOMEWHERE = SubLObjectFactory.makeKeyword("IRRELEVANT-SOMEWHERE");
        $str25$Found_an_invalid_value_in_rkf_irr = SubLObjectFactory.makeString("Found an invalid value in rkf-irrelevant-fort-cache value: ~A for key ~A.");
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MESSAGE"));
        $kw28$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw29$MESSAGE = SubLObjectFactory.makeKeyword("MESSAGE");
        $sym30$VALUE = SubLObjectFactory.makeUninternedSymbol("VALUE");
        $sym31$DO_FILE_HASH_TABLE = SubLObjectFactory.makeSymbol("DO-FILE-HASH-TABLE");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FBC-FILE-HASH-TABLE-CACHE"), (SubLObject)SubLObjectFactory.makeSymbol("*RKF-IRRELEVANT-FORT-CACHE*"));
        $sym33$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym34$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw35$THCL = SubLObjectFactory.makeKeyword("THCL");
        $kw36$RESET = SubLObjectFactory.makeKeyword("RESET");
        $str37$Trying_to_insert_invalid_value_in = SubLObjectFactory.makeString("Trying to insert invalid value into rkf-irrelevant-fort-cache value: ~A for key: ~A.");
        $sym38$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str39$_A_can_not_be_converted_to_an_irr = SubLObjectFactory.makeString("~A can not be converted to an irrelevance keyword");
        $sym40$RKF_IRRELEVANT_ASSERTION_CACHE_CLEAR = SubLObjectFactory.makeSymbol("RKF-IRRELEVANT-ASSERTION-CACHE-CLEAR");
    }
}

/*

	Total time: 252 ms
	
*/