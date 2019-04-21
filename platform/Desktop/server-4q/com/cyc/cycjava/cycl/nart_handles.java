package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.arete;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nart_handles extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.nart_handles";
    public static final String myFingerPrint = "cb10f8aa93201b067be365ac5c4f4ddc2bd9033a32509d1581c15e4b61e04464";
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 1200L)
    private static SubLSymbol $nart_from_id$;
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 4043L)
    private static SubLSymbol $new_nart_id_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 8929L)
    public static SubLSymbol $dtp_nart$;
    private static final SubLSymbol $sym0$_NART_FROM_ID_;
    private static final SubLSymbol $sym1$SECOND;
    private static final SubLList $list2;
    private static final SubLString $str3$mapping_Cyc_NARTs;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw6$DONE;
    private static final SubLSymbol $sym7$DO_KB_SUID_TABLE;
    private static final SubLList $list8;
    private static final SubLSymbol $kw9$PROGRESS_MESSAGE;
    private static final SubLSymbol $sym10$DO_NARTS;
    private static final SubLString $str11$Iterate_over_all_HL_NART_datastru;
    private static final SubLSymbol $sym12$DO_NARTS_TABLE;
    private static final SubLSymbol $sym13$CREATE_NART_DUMP_ID_TABLE;
    private static final SubLSymbol $sym14$WITH_NART_DUMP_ID_TABLE;
    private static final SubLSymbol $sym15$NART_COUNT;
    private static final SubLString $str16$Return_the_total_number_of_NARTs_;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$_NEW_NART_ID_THRESHOLD_;
    private static final SubLSymbol $kw19$DENSE;
    private static final SubLSymbol $kw20$ALL;
    private static final SubLString $str21$Determining_maximum_NART_ID;
    private static final SubLSymbol $sym22$STRINGP;
    private static final SubLSymbol $kw23$SKIP;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$THRESHOLD;
    private static final SubLSymbol $sym27$CLET;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID;
    private static final SubLSymbol $sym30$START;
    private static final SubLSymbol $sym31$DO_KB_SUID_TABLE_STARTING_AT_ID;
    private static final SubLSymbol $sym32$NEW_NARTS_TABLE_ENTRY_;
    private static final SubLSymbol $sym33$NARTS_TABLE_TUPLE_TO_CONSTANT;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$NART;
    private static final SubLSymbol $sym36$NART_P;
    private static final SubLInteger $int37$146;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$PRINT_NART;
    private static final SubLSymbol $sym43$NART_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$N_ID;
    private static final SubLSymbol $sym46$_CSETF_N_ID;
    private static final SubLSymbol $kw47$ID;
    private static final SubLString $str48$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw49$BEGIN;
    private static final SubLSymbol $sym50$MAKE_NART;
    private static final SubLSymbol $kw51$SLOT;
    private static final SubLSymbol $kw52$END;
    private static final SubLSymbol $sym53$VISIT_DEFSTRUCT_OBJECT_NART_METHOD;
    private static final SubLString $str54$___S_;
    private static final SubLString $str55$__The_CFASL_invalid_NART_;
    private static final SubLString $str56$__NART__S_;
    private static final SubLSymbol $sym57$SXHASH_NART_METHOD;
    private static final SubLList $list58;
    private static final SubLString $str59$Return_T_iff_OBJECT_is_a_datastru;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$FIXNUMP;
    private static final SubLString $str62$Freeing_NARTs;
    private static final SubLSymbol $sym63$NART_ID;
    private static final SubLList $list64;
    private static final SubLString $str65$Return_the_id_of_this_NART_;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$INTEGERP;
    private static final SubLSymbol $sym68$FIND_NART_BY_ID;
    private static final SubLString $str69$Return_the_NART_with_ID__or_NIL_i;
    private static final SubLList $list70;
    private static final SubLList $list71;
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 1566L)
    public static SubLObject new_narts_iterator() {
        return iteration.new_indirect_iterator(id_index.new_id_index_iterator(nart_handles.$nart_from_id$.getGlobalValue()), Symbols.symbol_function((SubLObject)nart_handles.$sym1$SECOND), (SubLObject)nart_handles.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 1855L)
    public static SubLObject do_narts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nart_handles.$list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)nart_handles.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nart_handles.$list2);
        var = current.first();
        current = current.rest();
        final SubLObject progress_message = (SubLObject)(current.isCons() ? current.first() : nart_handles.$str3$mapping_Cyc_NARTs);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)nart_handles.$list2);
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nart_handles.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nart_handles.NIL;
        SubLObject current_$1 = (SubLObject)nart_handles.NIL;
        while (nart_handles.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nart_handles.$list2);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nart_handles.$list2);
            if (nart_handles.NIL == conses_high.member(current_$1, (SubLObject)nart_handles.$list4, (SubLObject)nart_handles.UNPROVIDED, (SubLObject)nart_handles.UNPROVIDED)) {
                bad = (SubLObject)nart_handles.T;
            }
            if (current_$1 == nart_handles.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nart_handles.NIL != bad && nart_handles.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nart_handles.$list2);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)nart_handles.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((nart_handles.NIL != done_tail) ? conses_high.cadr(done_tail) : nart_handles.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)nart_handles.$sym7$DO_KB_SUID_TABLE, (SubLObject)ConsesLow.list(var, (SubLObject)nart_handles.$list8, (SubLObject)nart_handles.$kw9$PROGRESS_MESSAGE, progress_message, (SubLObject)nart_handles.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)nart_handles.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 2537L)
    public static SubLObject do_narts_table() {
        return nart_handles.$nart_from_id$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 2621L)
    public static SubLObject setup_nart_table(final SubLObject size, final SubLObject exactP) {
        if (nart_handles.NIL != nart_handles.$nart_from_id$.getGlobalValue()) {
            return (SubLObject)nart_handles.NIL;
        }
        nart_handles.$nart_from_id$.setGlobalValue(id_index.new_id_index(size, (SubLObject)nart_handles.ZERO_INTEGER));
        return (SubLObject)nart_handles.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 2824L)
    public static SubLObject finalize_narts(SubLObject max_nart_id) {
        if (max_nart_id == nart_handles.UNPROVIDED) {
            max_nart_id = (SubLObject)nart_handles.NIL;
        }
        set_next_nart_id(max_nart_id);
        set_new_nart_id_threshold(next_nart_id());
        if (nart_handles.NIL == max_nart_id) {
            optimize_nart_table();
        }
        return (SubLObject)nart_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 3124L)
    public static SubLObject optimize_nart_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            id_index.optimize_id_index(nart_handles.$nart_from_id$.getGlobalValue(), (SubLObject)nart_handles.UNPROVIDED);
        }
        finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)nart_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 3237L)
    public static SubLObject clear_nart_table() {
        return id_index.clear_id_index(nart_handles.$nart_from_id$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 3315L)
    public static SubLObject create_nart_dump_id_table() {
        return id_index.new_indirect_compact_id_index(nart_handles.$nart_from_id$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 3457L)
    public static SubLObject new_dense_nart_id_index() {
        return id_index.clone_id_index(nart_handles.$nart_from_id$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 3544L)
    public static SubLObject nart_count() {
        if (nart_handles.NIL == nart_handles.$nart_from_id$.getGlobalValue()) {
            return (SubLObject)nart_handles.ZERO_INTEGER;
        }
        return id_index.id_index_count(nart_handles.$nart_from_id$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 3884L)
    public static SubLObject lookup_nart(final SubLObject id) {
        return id_index.id_index_lookup(nart_handles.$nart_from_id$.getGlobalValue(), id, (SubLObject)nart_handles.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 3965L)
    public static SubLObject next_nart_id() {
        return id_index.id_index_next_id(nart_handles.$nart_from_id$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 4166L)
    public static SubLObject new_nart_id_threshold() {
        return (nart_handles.NIL != nart_handles.$new_nart_id_threshold$.getGlobalValue()) ? nart_handles.$new_nart_id_threshold$.getGlobalValue() : get_file_backed_nart_internal_id_threshold();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 4349L)
    public static SubLObject set_new_nart_id_threshold(final SubLObject id) {
        nart_handles.$new_nart_id_threshold$.setGlobalValue(id);
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 4446L)
    public static SubLObject old_nart_count() {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)nart_handles.ZERO_INTEGER), id_index.id_index_old_and_new_object_counts(do_narts_table(), new_nart_id_threshold()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 4581L)
    public static SubLObject new_nart_count() {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)nart_handles.ONE_INTEGER), id_index.id_index_old_and_new_object_counts(do_narts_table(), new_nart_id_threshold()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 4716L)
    public static SubLObject missing_old_nart_ids() {
        final SubLObject id_limit = nart_hl_formula_manager.get_file_backed_nart_id_threshold();
        return id_index.id_index_missing_ids(do_narts_table(), (SubLObject)nart_handles.$kw19$DENSE, id_limit);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 4961L)
    public static SubLObject missing_nart_id_set() {
        return set_utilities.construct_set_from_list(id_index.id_index_missing_ids(do_narts_table(), (SubLObject)nart_handles.$kw20$ALL, (SubLObject)nart_handles.UNPROVIDED), (SubLObject)nart_handles.EQL, (SubLObject)nart_handles.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 5142L)
    public static SubLObject deleted_nart_id_iterator() {
        return iteration.new_list_iterator(id_index.id_index_missing_ids(do_narts_table(), (SubLObject)nart_handles.$kw20$ALL, (SubLObject)nart_handles.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 5311L)
    public static SubLObject has_new_nartsP() {
        return Numbers.numG(next_nart_id(), new_nart_id_threshold());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 5397L)
    public static SubLObject set_next_nart_id(SubLObject max_nart_id) {
        if (max_nart_id == nart_handles.UNPROVIDED) {
            max_nart_id = (SubLObject)nart_handles.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max = (SubLObject)nart_handles.MINUS_ONE_INTEGER;
        if (nart_handles.NIL != max_nart_id) {
            max = max_nart_id;
        }
        else {
            final SubLObject idx = do_narts_table();
            final SubLObject mess = (SubLObject)nart_handles.$str21$Determining_maximum_NART_ID;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)nart_handles.ZERO_INTEGER;
            assert nart_handles.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)nart_handles.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)nart_handles.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)nart_handles.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$2 = idx;
                    if (nart_handles.NIL == id_index.id_index_objects_empty_p(idx_$2, (SubLObject)nart_handles.$kw23$SKIP)) {
                        final SubLObject idx_$3 = idx_$2;
                        if (nart_handles.NIL == id_index.id_index_dense_objects_empty_p(idx_$3, (SubLObject)nart_handles.$kw23$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$3);
                            final SubLObject backwardP_var = (SubLObject)nart_handles.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject nart;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)nart_handles.NIL, v_iteration = (SubLObject)nart_handles.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)nart_handles.ONE_INTEGER)) {
                                id = ((nart_handles.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)nart_handles.ONE_INTEGER) : v_iteration);
                                nart = Vectors.aref(vector_var, id);
                                if (nart_handles.NIL == id_index.id_index_tombstone_p(nart) || nart_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)nart_handles.$kw23$SKIP)) {
                                    if (nart_handles.NIL != id_index.id_index_tombstone_p(nart)) {
                                        nart = (SubLObject)nart_handles.$kw23$SKIP;
                                    }
                                    max = Numbers.max(max, nart_id(nart));
                                    sofar = Numbers.add(sofar, (SubLObject)nart_handles.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$4 = idx_$2;
                        if (nart_handles.NIL == id_index.id_index_sparse_objects_empty_p(idx_$4) || nart_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)nart_handles.$kw23$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$4);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$4);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$4);
                            final SubLObject v_default = (SubLObject)((nart_handles.NIL != id_index.id_index_skip_tombstones_p((SubLObject)nart_handles.$kw23$SKIP)) ? nart_handles.NIL : nart_handles.$kw23$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject nart2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (nart_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)nart_handles.$kw23$SKIP) || nart_handles.NIL == id_index.id_index_tombstone_p(nart2)) {
                                    max = Numbers.max(max, nart_id(nart2));
                                    sofar = Numbers.add(sofar, (SubLObject)nart_handles.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                id2 = Numbers.add(id2, (SubLObject)nart_handles.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nart_handles.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject next_id = Numbers.add(max, (SubLObject)nart_handles.ONE_INTEGER);
        id_index.set_id_index_next_id(nart_handles.$nart_from_id$.getGlobalValue(), next_id);
        return next_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 5734L)
    public static SubLObject register_nart_id(final SubLObject nart, final SubLObject id) {
        reset_nart_id(nart, id);
        id_index.id_index_enter(nart_handles.$nart_from_id$.getGlobalValue(), id, nart);
        return nart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 5937L)
    public static SubLObject deregister_nart_id(final SubLObject id) {
        return id_index.id_index_remove(nart_handles.$nart_from_id$.getGlobalValue(), id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 6070L)
    public static SubLObject make_nart_id() {
        return id_index.id_index_reserve(nart_handles.$nart_from_id$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 6189L)
    public static SubLObject do_old_narts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nart_handles.$list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nart = (SubLObject)nart_handles.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nart_handles.$list24);
        nart = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nart_handles.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nart_handles.NIL;
        SubLObject current_$6 = (SubLObject)nart_handles.NIL;
        while (nart_handles.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nart_handles.$list24);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nart_handles.$list24);
            if (nart_handles.NIL == conses_high.member(current_$6, (SubLObject)nart_handles.$list25, (SubLObject)nart_handles.UNPROVIDED, (SubLObject)nart_handles.UNPROVIDED)) {
                bad = (SubLObject)nart_handles.T;
            }
            if (current_$6 == nart_handles.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nart_handles.NIL != bad && nart_handles.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nart_handles.$list24);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)nart_handles.$kw9$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((nart_handles.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : nart_handles.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)nart_handles.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((nart_handles.NIL != done_tail) ? conses_high.cadr(done_tail) : nart_handles.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject threshold = (SubLObject)nart_handles.$sym26$THRESHOLD;
        return (SubLObject)ConsesLow.list((SubLObject)nart_handles.$sym27$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(threshold, (SubLObject)nart_handles.$list28)), (SubLObject)ConsesLow.listS((SubLObject)nart_handles.$sym29$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID, (SubLObject)ConsesLow.list(nart, (SubLObject)nart_handles.$list8, threshold, (SubLObject)nart_handles.$kw9$PROGRESS_MESSAGE, progress_message, (SubLObject)nart_handles.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)nart_handles.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 7016L)
    public static SubLObject do_new_narts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nart_handles.$list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nart = (SubLObject)nart_handles.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)nart_handles.$list24);
        nart = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)nart_handles.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)nart_handles.NIL;
        SubLObject current_$7 = (SubLObject)nart_handles.NIL;
        while (nart_handles.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nart_handles.$list24);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)nart_handles.$list24);
            if (nart_handles.NIL == conses_high.member(current_$7, (SubLObject)nart_handles.$list25, (SubLObject)nart_handles.UNPROVIDED, (SubLObject)nart_handles.UNPROVIDED)) {
                bad = (SubLObject)nart_handles.T;
            }
            if (current_$7 == nart_handles.$kw5$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (nart_handles.NIL != bad && nart_handles.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)nart_handles.$list24);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)nart_handles.$kw9$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((nart_handles.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : nart_handles.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)nart_handles.$kw6$DONE, current);
        final SubLObject done = (SubLObject)((nart_handles.NIL != done_tail) ? conses_high.cadr(done_tail) : nart_handles.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject start = (SubLObject)nart_handles.$sym30$START;
        return (SubLObject)ConsesLow.list((SubLObject)nart_handles.$sym27$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(start, (SubLObject)nart_handles.$list28)), (SubLObject)ConsesLow.listS((SubLObject)nart_handles.$sym31$DO_KB_SUID_TABLE_STARTING_AT_ID, (SubLObject)ConsesLow.list(nart, (SubLObject)nart_handles.$list8, start, (SubLObject)nart_handles.$kw9$PROGRESS_MESSAGE, progress_message, (SubLObject)nart_handles.$kw6$DONE, done), ConsesLow.append(body, (SubLObject)nart_handles.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 7740L)
    public static SubLObject get_file_backed_nart_internal_id_threshold() {
        if (nart_handles.NIL != Filesys.directory_p(misc_utilities.generic_caches_directory())) {
            return dumper.get_exclusive_nart_internal_id_limit_for_kb(misc_utilities.generic_caches_directory());
        }
        return (SubLObject)nart_handles.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 8057L)
    public static SubLObject new_new_narts_iterator() {
        return iteration.new_indirect_iterator(iteration.new_filter_iterator(id_index.new_id_index_ordered_iterator(do_narts_table()), (SubLObject)nart_handles.$sym32$NEW_NARTS_TABLE_ENTRY_, (SubLObject)ConsesLow.list(new_nart_id_threshold())), (SubLObject)nart_handles.$sym33$NARTS_TABLE_TUPLE_TO_CONSTANT, (SubLObject)nart_handles.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 8337L)
    public static SubLObject new_narts_table_entryP(final SubLObject tuple, final SubLObject id_threshold) {
        SubLObject id = (SubLObject)nart_handles.NIL;
        SubLObject payload = (SubLObject)nart_handles.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tuple, tuple, (SubLObject)nart_handles.$list34);
        id = tuple.first();
        SubLObject current = tuple.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject)nart_handles.$list34);
        payload = current.first();
        current = current.rest();
        if (nart_handles.NIL == current) {
            return Numbers.numGE(id, id_threshold);
        }
        cdestructuring_bind.cdestructuring_bind_error(tuple, (SubLObject)nart_handles.$list34);
        return (SubLObject)nart_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 8502L)
    public static SubLObject narts_table_tuple_to_constant(final SubLObject tuple) {
        SubLObject id = (SubLObject)nart_handles.NIL;
        SubLObject payload = (SubLObject)nart_handles.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tuple, tuple, (SubLObject)nart_handles.$list34);
        id = tuple.first();
        SubLObject current = tuple.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tuple, (SubLObject)nart_handles.$list34);
        payload = current.first();
        current = current.rest();
        if (nart_handles.NIL == current) {
            return find_nart_by_id(id);
        }
        cdestructuring_bind.cdestructuring_bind_error(tuple, (SubLObject)nart_handles.$list34);
        return (SubLObject)nart_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 8929L)
    public static SubLObject nart_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_nart(v_object, stream, (SubLObject)nart_handles.ZERO_INTEGER);
        return (SubLObject)nart_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 8929L)
    public static SubLObject nart_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $nart_native.class) ? nart_handles.T : nart_handles.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 8929L)
    public static SubLObject n_id(final SubLObject v_object) {
        assert nart_handles.NIL != nart_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 8929L)
    public static SubLObject _csetf_n_id(final SubLObject v_object, final SubLObject value) {
        assert nart_handles.NIL != nart_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 8929L)
    public static SubLObject make_nart(SubLObject arglist) {
        if (arglist == nart_handles.UNPROVIDED) {
            arglist = (SubLObject)nart_handles.NIL;
        }
        final SubLObject v_new = (SubLObject)new $nart_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)nart_handles.NIL, next = arglist; nart_handles.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)nart_handles.$kw47$ID)) {
                _csetf_n_id(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)nart_handles.$str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 8929L)
    public static SubLObject visit_defstruct_nart(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)nart_handles.$kw49$BEGIN, (SubLObject)nart_handles.$sym50$MAKE_NART, (SubLObject)nart_handles.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)nart_handles.$kw51$SLOT, (SubLObject)nart_handles.$kw47$ID, n_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)nart_handles.$kw52$END, (SubLObject)nart_handles.$sym50$MAKE_NART, (SubLObject)nart_handles.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 8929L)
    public static SubLObject visit_defstruct_object_nart_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_nart(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 9110L)
    public static SubLObject print_nart(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject hl_formula = narts_high.nart_hl_formula(v_object);
        final SubLObject id = nart_id(v_object);
        if (nart_handles.NIL != hl_formula) {
            PrintLow.format(stream, (SubLObject)nart_handles.$str54$___S_, hl_formula);
        }
        else if (v_object.eql(cfasl_kb_methods.cfasl_invalid_nart())) {
            PrintLow.format(stream, (SubLObject)nart_handles.$str55$__The_CFASL_invalid_NART_);
        }
        else if (id.isFixnum()) {
            PrintLow.format(stream, (SubLObject)nart_handles.$str56$__NART__S_, id);
        }
        else {
            compatibility.default_struct_print_function(v_object, stream, depth);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 9602L)
    public static SubLObject sxhash_nart_method(final SubLObject v_object) {
        final SubLObject id = n_id(v_object);
        if (id.isInteger()) {
            return id;
        }
        return (SubLObject)nart_handles.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 9723L)
    public static SubLObject get_nart() {
        SubLObject nart = (SubLObject)nart_handles.NIL;
        nart = make_nart((SubLObject)nart_handles.UNPROVIDED);
        return nart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 9921L)
    public static SubLObject free_nart(final SubLObject nart) {
        _csetf_n_id(nart, (SubLObject)nart_handles.NIL);
        return nart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 10224L)
    public static SubLObject valid_nart_handleP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(nart_handles.NIL != nart_p(v_object) && nart_handles.NIL != nart_handle_validP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 10382L)
    public static SubLObject valid_nartP(final SubLObject nart, SubLObject robust) {
        if (robust == nart_handles.UNPROVIDED) {
            robust = (SubLObject)nart_handles.NIL;
        }
        arete.arete_note_nart_touched(nart);
        return valid_nart_handleP(nart);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 10577L)
    public static SubLObject valid_nart_robustP(final SubLObject nart) {
        if (nart_handles.NIL != valid_nartP(nart, (SubLObject)nart_handles.UNPROVIDED)) {
            final SubLObject index = narts_low.nart_index(nart);
            return kb_indexing_datastructures.index_installed_p(index);
        }
        return (SubLObject)nart_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 10822L)
    public static SubLObject nart_id_p(final SubLObject v_object) {
        return Types.integerp(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 10929L)
    public static SubLObject create_nart_shell() {
        return make_nart_shell((SubLObject)nart_handles.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 11059L)
    public static SubLObject make_nart_shell(SubLObject id) {
        if (id == nart_handles.UNPROVIDED) {
            id = (SubLObject)nart_handles.NIL;
        }
        if (nart_handles.NIL == id) {
            id = make_nart_id();
        }
        assert nart_handles.NIL != Types.fixnump(id) : id;
        final SubLObject nart = get_nart();
        register_nart_id(nart, id);
        return nart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 11337L)
    public static SubLObject partition_create_invalid_nart() {
        return create_nart_shell();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 11546L)
    public static SubLObject create_sample_invalid_nart() {
        return get_nart();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 11668L)
    public static SubLObject free_all_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = do_narts_table();
        final SubLObject mess = (SubLObject)nart_handles.$str62$Freeing_NARTs;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)nart_handles.ZERO_INTEGER;
        assert nart_handles.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)nart_handles.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)nart_handles.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)nart_handles.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$8 = idx;
                if (nart_handles.NIL == id_index.id_index_objects_empty_p(idx_$8, (SubLObject)nart_handles.$kw23$SKIP)) {
                    final SubLObject idx_$9 = idx_$8;
                    if (nart_handles.NIL == id_index.id_index_dense_objects_empty_p(idx_$9, (SubLObject)nart_handles.$kw23$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$9);
                        final SubLObject backwardP_var = (SubLObject)nart_handles.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject nart;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)nart_handles.NIL, v_iteration = (SubLObject)nart_handles.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)nart_handles.ONE_INTEGER)) {
                            id = ((nart_handles.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)nart_handles.ONE_INTEGER) : v_iteration);
                            nart = Vectors.aref(vector_var, id);
                            if (nart_handles.NIL == id_index.id_index_tombstone_p(nart) || nart_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)nart_handles.$kw23$SKIP)) {
                                if (nart_handles.NIL != id_index.id_index_tombstone_p(nart)) {
                                    nart = (SubLObject)nart_handles.$kw23$SKIP;
                                }
                                kb_indexing_datastructures.free_term_index(nart);
                                free_nart(nart);
                                sofar = Numbers.add(sofar, (SubLObject)nart_handles.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$10 = idx_$8;
                    if (nart_handles.NIL == id_index.id_index_sparse_objects_empty_p(idx_$10) || nart_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)nart_handles.$kw23$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$10);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$10);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$10);
                        final SubLObject v_default = (SubLObject)((nart_handles.NIL != id_index.id_index_skip_tombstones_p((SubLObject)nart_handles.$kw23$SKIP)) ? nart_handles.NIL : nart_handles.$kw23$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject nart2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (nart_handles.NIL == id_index.id_index_skip_tombstones_p((SubLObject)nart_handles.$kw23$SKIP) || nart_handles.NIL == id_index.id_index_tombstone_p(nart2)) {
                                kb_indexing_datastructures.free_term_index(nart2);
                                free_nart(nart2);
                                sofar = Numbers.add(sofar, (SubLObject)nart_handles.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)nart_handles.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nart_handles.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        clear_nart_table();
        nart_hl_formula_manager.clear_nart_hl_formula_table();
        return (SubLObject)nart_handles.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 11894L)
    public static SubLObject nart_id(final SubLObject nart) {
        enforceType(nart, nart_handles.$sym36$NART_P);
        return n_id(nart);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 12056L)
    public static SubLObject reset_nart_id(final SubLObject nart, final SubLObject new_id) {
        assert nart_handles.NIL != nart_p(nart) : nart;
        _csetf_n_id(nart, new_id);
        return nart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 12359L)
    public static SubLObject nart_handle_validP(final SubLObject nart) {
        return Types.integerp(n_id(nart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nart-handles.lisp", position = 12848L)
    public static SubLObject find_nart_by_id(final SubLObject id) {
        enforceType(id, nart_handles.$sym67$INTEGERP);
        return lookup_nart(id);
    }
    
    public static SubLObject declare_nart_handles_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "new_narts_iterator", "NEW-NARTS-ITERATOR", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nart_handles", "do_narts", "DO-NARTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "do_narts_table", "DO-NARTS-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "setup_nart_table", "SETUP-NART-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "finalize_narts", "FINALIZE-NARTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "optimize_nart_table", "OPTIMIZE-NART-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "clear_nart_table", "CLEAR-NART-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "create_nart_dump_id_table", "CREATE-NART-DUMP-ID-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "new_dense_nart_id_index", "NEW-DENSE-NART-ID-INDEX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "nart_count", "NART-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "lookup_nart", "LOOKUP-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "next_nart_id", "NEXT-NART-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "new_nart_id_threshold", "NEW-NART-ID-THRESHOLD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "set_new_nart_id_threshold", "SET-NEW-NART-ID-THRESHOLD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "old_nart_count", "OLD-NART-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "new_nart_count", "NEW-NART-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "missing_old_nart_ids", "MISSING-OLD-NART-IDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "missing_nart_id_set", "MISSING-NART-ID-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "deleted_nart_id_iterator", "DELETED-NART-ID-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "has_new_nartsP", "HAS-NEW-NARTS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "set_next_nart_id", "SET-NEXT-NART-ID", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "register_nart_id", "REGISTER-NART-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "deregister_nart_id", "DEREGISTER-NART-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "make_nart_id", "MAKE-NART-ID", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nart_handles", "do_old_narts", "DO-OLD-NARTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nart_handles", "do_new_narts", "DO-NEW-NARTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "get_file_backed_nart_internal_id_threshold", "GET-FILE-BACKED-NART-INTERNAL-ID-THRESHOLD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "new_new_narts_iterator", "NEW-NEW-NARTS-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "new_narts_table_entryP", "NEW-NARTS-TABLE-ENTRY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "narts_table_tuple_to_constant", "NARTS-TABLE-TUPLE-TO-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "nart_print_function_trampoline", "NART-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "nart_p", "NART-P", 1, 0, false);
        new $nart_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "n_id", "N-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "_csetf_n_id", "_CSETF-N-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "make_nart", "MAKE-NART", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "visit_defstruct_nart", "VISIT-DEFSTRUCT-NART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "visit_defstruct_object_nart_method", "VISIT-DEFSTRUCT-OBJECT-NART-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "print_nart", "PRINT-NART", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "sxhash_nart_method", "SXHASH-NART-METHOD", 1, 0, false);
        new $sxhash_nart_method$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "get_nart", "GET-NART", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "free_nart", "FREE-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "valid_nart_handleP", "VALID-NART-HANDLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "valid_nartP", "VALID-NART?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "valid_nart_robustP", "VALID-NART-ROBUST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "nart_id_p", "NART-ID-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "create_nart_shell", "CREATE-NART-SHELL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "make_nart_shell", "MAKE-NART-SHELL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "partition_create_invalid_nart", "PARTITION-CREATE-INVALID-NART", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "create_sample_invalid_nart", "CREATE-SAMPLE-INVALID-NART", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "free_all_narts", "FREE-ALL-NARTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "nart_id", "NART-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "reset_nart_id", "RESET-NART-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "nart_handle_validP", "NART-HANDLE-VALID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nart_handles", "find_nart_by_id", "FIND-NART-BY-ID", 1, 0, false);
        return (SubLObject)nart_handles.NIL;
    }
    
    public static SubLObject init_nart_handles_file() {
        nart_handles.$nart_from_id$ = SubLFiles.deflexical("*NART-FROM-ID*", (SubLObject)(maybeDefault((SubLObject)nart_handles.$sym0$_NART_FROM_ID_, nart_handles.$nart_from_id$, nart_handles.NIL)));
        nart_handles.$new_nart_id_threshold$ = SubLFiles.deflexical("*NEW-NART-ID-THRESHOLD*", (SubLObject)(maybeDefault((SubLObject)nart_handles.$sym18$_NEW_NART_ID_THRESHOLD_, nart_handles.$new_nart_id_threshold$, nart_handles.NIL)));
        nart_handles.$dtp_nart$ = SubLFiles.defconstant("*DTP-NART*", (SubLObject)nart_handles.$sym35$NART);
        return (SubLObject)nart_handles.NIL;
    }
    
    public static SubLObject setup_nart_handles_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)nart_handles.$sym0$_NART_FROM_ID_);
        utilities_macros.register_cyc_api_macro((SubLObject)nart_handles.$sym10$DO_NARTS, (SubLObject)nart_handles.$list2, (SubLObject)nart_handles.$str11$Iterate_over_all_HL_NART_datastru);
        access_macros.register_macro_helper((SubLObject)nart_handles.$sym12$DO_NARTS_TABLE, (SubLObject)nart_handles.$sym10$DO_NARTS);
        access_macros.register_macro_helper((SubLObject)nart_handles.$sym13$CREATE_NART_DUMP_ID_TABLE, (SubLObject)nart_handles.$sym14$WITH_NART_DUMP_ID_TABLE);
        utilities_macros.register_cyc_api_function((SubLObject)nart_handles.$sym15$NART_COUNT, (SubLObject)nart_handles.NIL, (SubLObject)nart_handles.$str16$Return_the_total_number_of_NARTs_, (SubLObject)nart_handles.NIL, (SubLObject)nart_handles.$list17);
        subl_macro_promotions.declare_defglobal((SubLObject)nart_handles.$sym18$_NEW_NART_ID_THRESHOLD_);
        utilities_macros.note_funcall_helper_function((SubLObject)nart_handles.$sym32$NEW_NARTS_TABLE_ENTRY_);
        utilities_macros.note_funcall_helper_function((SubLObject)nart_handles.$sym33$NARTS_TABLE_TUPLE_TO_CONSTANT);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function((SubLObject)nart_handles.$sym43$NART_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)nart_handles.$list44);
        Structures.def_csetf((SubLObject)nart_handles.$sym45$N_ID, (SubLObject)nart_handles.$sym46$_CSETF_N_ID);
        Equality.identity((SubLObject)nart_handles.$sym35$NART);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function((SubLObject)nart_handles.$sym53$VISIT_DEFSTRUCT_OBJECT_NART_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function((SubLObject)nart_handles.$sym57$SXHASH_NART_METHOD));
        utilities_macros.register_cyc_api_function((SubLObject)nart_handles.$sym36$NART_P, (SubLObject)nart_handles.$list58, (SubLObject)nart_handles.$str59$Return_T_iff_OBJECT_is_a_datastru, (SubLObject)nart_handles.NIL, (SubLObject)nart_handles.$list60);
        utilities_macros.register_cyc_api_function((SubLObject)nart_handles.$sym63$NART_ID, (SubLObject)nart_handles.$list64, (SubLObject)nart_handles.$str65$Return_the_id_of_this_NART_, (SubLObject)nart_handles.$list66, (SubLObject)nart_handles.$list17);
        utilities_macros.register_cyc_api_function((SubLObject)nart_handles.$sym68$FIND_NART_BY_ID, (SubLObject)nart_handles.$list38, (SubLObject)nart_handles.$str69$Return_the_NART_with_ID__or_NIL_i, (SubLObject)nart_handles.$list70, (SubLObject)nart_handles.$list71);
        return (SubLObject)nart_handles.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_nart_handles_file();
    }
    
    @Override
	public void initializeVariables() {
        init_nart_handles_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_nart_handles_file();
    }
    
    static {
        me = (SubLFile)new nart_handles();
        nart_handles.$nart_from_id$ = null;
        nart_handles.$new_nart_id_threshold$ = null;
        nart_handles.$dtp_nart$ = null;
        $sym0$_NART_FROM_ID_ = SubLObjectFactory.makeSymbol("*NART-FROM-ID*");
        $sym1$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc NARTs")), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str3$mapping_Cyc_NARTs = SubLObjectFactory.makeString("mapping Cyc NARTs");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw5$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw6$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym7$DO_KB_SUID_TABLE = SubLObjectFactory.makeSymbol("DO-KB-SUID-TABLE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-NARTS-TABLE"));
        $kw9$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $sym10$DO_NARTS = SubLObjectFactory.makeSymbol("DO-NARTS");
        $str11$Iterate_over_all_HL_NART_datastru = SubLObjectFactory.makeString("Iterate over all HL NART datastructures, executing BODY within the scope of VAR.\n   VAR is bound to the NART.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil.");
        $sym12$DO_NARTS_TABLE = SubLObjectFactory.makeSymbol("DO-NARTS-TABLE");
        $sym13$CREATE_NART_DUMP_ID_TABLE = SubLObjectFactory.makeSymbol("CREATE-NART-DUMP-ID-TABLE");
        $sym14$WITH_NART_DUMP_ID_TABLE = SubLObjectFactory.makeSymbol("WITH-NART-DUMP-ID-TABLE");
        $sym15$NART_COUNT = SubLObjectFactory.makeSymbol("NART-COUNT");
        $str16$Return_the_total_number_of_NARTs_ = SubLObjectFactory.makeString("Return the total number of NARTs.");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"));
        $sym18$_NEW_NART_ID_THRESHOLD_ = SubLObjectFactory.makeSymbol("*NEW-NART-ID-THRESHOLD*");
        $kw19$DENSE = SubLObjectFactory.makeKeyword("DENSE");
        $kw20$ALL = SubLObjectFactory.makeKeyword("ALL");
        $str21$Determining_maximum_NART_ID = SubLObjectFactory.makeString("Determining maximum NART ID");
        $sym22$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw23$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym26$THRESHOLD = SubLObjectFactory.makeUninternedSymbol("THRESHOLD");
        $sym27$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NART-ID-THRESHOLD")));
        $sym29$DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID = SubLObjectFactory.makeSymbol("DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID");
        $sym30$START = SubLObjectFactory.makeUninternedSymbol("START");
        $sym31$DO_KB_SUID_TABLE_STARTING_AT_ID = SubLObjectFactory.makeSymbol("DO-KB-SUID-TABLE-STARTING-AT-ID");
        $sym32$NEW_NARTS_TABLE_ENTRY_ = SubLObjectFactory.makeSymbol("NEW-NARTS-TABLE-ENTRY?");
        $sym33$NARTS_TABLE_TUPLE_TO_CONSTANT = SubLObjectFactory.makeSymbol("NARTS-TABLE-TUPLE-TO-CONSTANT");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("PAYLOAD"));
        $sym35$NART = SubLObjectFactory.makeSymbol("NART");
        $sym36$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $int37$146 = SubLObjectFactory.makeInteger(146);
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"));
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N-ID"));
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-N-ID"));
        $sym42$PRINT_NART = SubLObjectFactory.makeSymbol("PRINT-NART");
        $sym43$NART_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("NART-PRINT-FUNCTION-TRAMPOLINE");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("NART-P"));
        $sym45$N_ID = SubLObjectFactory.makeSymbol("N-ID");
        $sym46$_CSETF_N_ID = SubLObjectFactory.makeSymbol("_CSETF-N-ID");
        $kw47$ID = SubLObjectFactory.makeKeyword("ID");
        $str48$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw49$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym50$MAKE_NART = SubLObjectFactory.makeSymbol("MAKE-NART");
        $kw51$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw52$END = SubLObjectFactory.makeKeyword("END");
        $sym53$VISIT_DEFSTRUCT_OBJECT_NART_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-NART-METHOD");
        $str54$___S_ = SubLObjectFactory.makeString("#<~S>");
        $str55$__The_CFASL_invalid_NART_ = SubLObjectFactory.makeString("#<The CFASL invalid NART>");
        $str56$__NART__S_ = SubLObjectFactory.makeString("#<NART ~S>");
        $sym57$SXHASH_NART_METHOD = SubLObjectFactory.makeSymbol("SXHASH-NART-METHOD");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $str59$Return_T_iff_OBJECT_is_a_datastru = SubLObjectFactory.makeString("Return T iff OBJECT is a datastructure implementing a non-atomic reified term (NART).");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym61$FIXNUMP = SubLObjectFactory.makeSymbol("FIXNUMP");
        $str62$Freeing_NARTs = SubLObjectFactory.makeString("Freeing NARTs");
        $sym63$NART_ID = SubLObjectFactory.makeSymbol("NART-ID");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART"));
        $str65$Return_the_id_of_this_NART_ = SubLObjectFactory.makeString("Return the id of this NART.");
        $list66 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART"), (SubLObject)SubLObjectFactory.makeSymbol("NART-P")));
        $sym67$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym68$FIND_NART_BY_ID = SubLObjectFactory.makeSymbol("FIND-NART-BY-ID");
        $str69$Return_the_NART_with_ID__or_NIL_i = SubLObjectFactory.makeString("Return the NART with ID, or NIL if not present.");
        $list70 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")));
        $list71 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("NART-P")));
    }
    
    public static final class $nart_native extends SubLStructNative
    {
        public SubLObject $id;
        private static final SubLStructDeclNative structDecl;
        
        public $nart_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$nart_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$id;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$nart_native.class, nart_handles.$sym35$NART, nart_handles.$sym36$NART_P, nart_handles.$list38, nart_handles.$list39, new String[] { "$id" }, nart_handles.$list40, nart_handles.$list41, nart_handles.$sym42$PRINT_NART);
        }
    }
    
    public static final class $nart_p$UnaryFunction extends UnaryFunction
    {
        public $nart_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("NART-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return nart_handles.nart_p(arg1);
        }
    }
    
    public static final class $sxhash_nart_method$UnaryFunction extends UnaryFunction
    {
        public $sxhash_nart_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-NART-METHOD"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return nart_handles.sxhash_nart_method(arg1);
        }
    }
}

/*

	Total time: 250 ms
	
*/