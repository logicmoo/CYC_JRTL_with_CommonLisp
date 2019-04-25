package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kbs_cleanup extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kbs_cleanup";
    public static final String myFingerPrint = "89c1808003801a3723dded26027942a24d517e424f24cd751badf370e066450a";
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 804L)
    private static SubLSymbol $kbs_clear_extent$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 945L)
    private static SubLSymbol $show_kbs_cleanup_warningsP$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 5936L)
    private static SubLSymbol $sparse_nart_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 10068L)
    private static SubLSymbol $uninteresting_nart_predicates_wrt_opencyc$;
    private static final SubLList $list0;
    private static final SubLString $str1$opencyc;
    private static final SubLString $str2$Clearing_invalid_bookkeeping_asse;
    private static final SubLSymbol $sym3$STRINGP;
    private static final SubLSymbol $kw4$SKIP;
    private static final SubLObject $const5$myCreator;
    private static final SubLObject $const6$BookkeepingMt;
    private static final SubLObject $const7$myCreationPurpose;
    private static final SubLString $str8$Fixing_invalid_deductions;
    private static final SubLString $str9$invalid_deduction___S;
    private static final SubLSymbol $sym10$DEDUCTION_P;
    private static final SubLString $str11$clearing_extent_of__S;
    private static final SubLSymbol $kw12$GAF;
    private static final SubLSymbol $kw13$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym14$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str15$Killing_terms_without_isa_asserti;
    private static final SubLObject $const16$isa;
    private static final SubLString $str17$Killing__S___S_;
    private static final SubLSymbol $sym18$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const19$EverythingPSC;
    private static final SubLObject $const20$HLPrototypicalTerm;
    private static final SubLString $str21$Killing_naked_prototypicals;
    private static final SubLString $str22$cdolist;
    private static final SubLObject $const23$hlPrototypicalInstance;
    private static final SubLString $str24$Killing__S;
    private static final SubLObject $const25$SkolemFunction;
    private static final SubLString $str26$Killing_empty_skolems;
    private static final SubLString $str27$Removing_bad___termOfUnit_asserti;
    private static final SubLObject $const28$termOfUnit;
    private static final SubLString $str29$Removing__A;
    private static final SubLList $list30;
    private static final SubLString $str31$Killing_NARTs_with_only_definitio;
    private static final SubLString $str32$Keeping__S___S_;
    private static final SubLString $str33$Removing_invalid_arguments;
    private static final SubLString $str34$Assertion__S_removed_;
    private static final SubLString $str35$Removing_redundant_true_asserted_;
    private static final SubLSymbol $kw36$TRUE;
    private static final SubLSymbol $kw37$FALSE;
    private static final SubLSymbol $sym38$ARGUMENT_TRUTH;
    private static final SubLString $str39$Assertion_removed_;
    private static final SubLString $str40$Removing_invalid_KB_queries;
    private static final SubLObject $const41$KBContentTest_FullySpecified;
    private static final SubLSymbol $kw42$BREADTH;
    private static final SubLSymbol $kw43$QUEUE;
    private static final SubLSymbol $kw44$STACK;
    private static final SubLSymbol $sym45$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw46$ERROR;
    private static final SubLString $str47$_A_is_not_a__A;
    private static final SubLSymbol $sym48$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw49$CERROR;
    private static final SubLString $str50$continue_anyway;
    private static final SubLSymbol $kw51$WARN;
    private static final SubLString $str52$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str53$Killing_query__A_because_it_has_n;
    private static final SubLString $str54$Killing_invalid_query__A_because_;
    private static final SubLString $str55$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str56$attempting_to_bind_direction_link;
    private static final SubLList $list57;
    private static final SubLString $str58$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLString $str59$Forgetting_useless_NARTs_wrt_Open;
    private static final SubLString $str60$Gathering_useless_NARTs_wrt_OpenC;
    private static final SubLSymbol $sym61$NART_P;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$ASSERTION_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 1002L)
    public static SubLObject kbs_cleanup() {
        fix_invalid_deductions();
        kbs_clear_extent();
        kill_empty_kbs_terms();
        kill_empty_skolems();
        kill_naked_prototypicals();
        remove_bad_term_of_unit_assertions();
        kill_sparse_narts();
        at_defns.initialize_sufficient_defns_cache();
        at_defns.initialize_sufficient_functions_cache();
        skolems.reset_skolem_defn_table((SubLObject)kbs_cleanup.T, (SubLObject)kbs_cleanup.NIL);
        kbs_kill_unrunnable_kb_queries();
        if (kbs_cleanup.$str1$opencyc.equal(kbs_utilities.get_kbs_name())) {
            forget_useless_narts_wrt_opencyc_until_quiescence();
        }
        clean_invalid_bookkeeping_info();
        return (SubLObject)kbs_cleanup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 2227L)
    public static SubLObject clean_invalid_bookkeeping_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = (SubLObject)kbs_cleanup.ZERO_INTEGER;
        final SubLObject idx = constant_handles.do_constants_table();
        final SubLObject mess = (SubLObject)kbs_cleanup.$str2$Clearing_invalid_bookkeeping_asse;
        final SubLObject total_$1 = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kbs_cleanup.ZERO_INTEGER;
        assert kbs_cleanup.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$2 = idx;
                if (kbs_cleanup.NIL == id_index.id_index_objects_empty_p(idx_$2, (SubLObject)kbs_cleanup.$kw4$SKIP)) {
                    final SubLObject idx_$3 = idx_$2;
                    if (kbs_cleanup.NIL == id_index.id_index_dense_objects_empty_p(idx_$3, (SubLObject)kbs_cleanup.$kw4$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$3);
                        final SubLObject backwardP_var = (SubLObject)kbs_cleanup.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject constant;
                        SubLObject creator;
                        SubLObject purpose;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kbs_cleanup.NIL, v_iteration = (SubLObject)kbs_cleanup.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kbs_cleanup.ONE_INTEGER)) {
                            id = ((kbs_cleanup.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kbs_cleanup.ONE_INTEGER) : v_iteration);
                            constant = Vectors.aref(vector_var, id);
                            if (kbs_cleanup.NIL == id_index.id_index_tombstone_p(constant) || kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) {
                                if (kbs_cleanup.NIL != id_index.id_index_tombstone_p(constant)) {
                                    constant = (SubLObject)kbs_cleanup.$kw4$SKIP;
                                }
                                creator = bookkeeping_store.creator(constant, (SubLObject)kbs_cleanup.UNPROVIDED);
                                if (kbs_cleanup.NIL != creator && kbs_cleanup.NIL != forts.invalid_fortP(creator) && kbs_cleanup.NIL != bookkeeping_store.hl_unassert_bookkeeping_binary_gaf(kbs_cleanup.$const5$myCreator, constant, creator, kbs_cleanup.$const6$BookkeepingMt)) {
                                    total = Numbers.add(total, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                }
                                purpose = bookkeeping_store.creation_purpose(constant, (SubLObject)kbs_cleanup.UNPROVIDED);
                                if (kbs_cleanup.NIL != purpose && kbs_cleanup.NIL != forts.invalid_fortP(purpose) && kbs_cleanup.NIL != bookkeeping_store.hl_unassert_bookkeeping_binary_gaf(kbs_cleanup.$const7$myCreationPurpose, constant, purpose, kbs_cleanup.$const6$BookkeepingMt)) {
                                    total = Numbers.add(total, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total_$1);
                            }
                        }
                    }
                    final SubLObject idx_$4 = idx_$2;
                    if (kbs_cleanup.NIL == id_index.id_index_sparse_objects_empty_p(idx_$4) || kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$4);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$4);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$4);
                        final SubLObject v_default = (SubLObject)((kbs_cleanup.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) ? kbs_cleanup.NIL : kbs_cleanup.$kw4$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject constant2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP) || kbs_cleanup.NIL == id_index.id_index_tombstone_p(constant2)) {
                                final SubLObject creator2 = bookkeeping_store.creator(constant2, (SubLObject)kbs_cleanup.UNPROVIDED);
                                if (kbs_cleanup.NIL != creator2 && kbs_cleanup.NIL != forts.invalid_fortP(creator2) && kbs_cleanup.NIL != bookkeeping_store.hl_unassert_bookkeeping_binary_gaf(kbs_cleanup.$const5$myCreator, constant2, creator2, kbs_cleanup.$const6$BookkeepingMt)) {
                                    total = Numbers.add(total, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                }
                                final SubLObject purpose2 = bookkeeping_store.creation_purpose(constant2, (SubLObject)kbs_cleanup.UNPROVIDED);
                                if (kbs_cleanup.NIL != purpose2 && kbs_cleanup.NIL != forts.invalid_fortP(purpose2) && kbs_cleanup.NIL != bookkeeping_store.hl_unassert_bookkeeping_binary_gaf(kbs_cleanup.$const7$myCreationPurpose, constant2, purpose2, kbs_cleanup.$const6$BookkeepingMt)) {
                                    total = Numbers.add(total, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total_$1);
                            }
                            id2 = Numbers.add(id2, (SubLObject)kbs_cleanup.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_cleanup.T, thread);
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
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 2811L)
    public static SubLObject fix_invalid_deductions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)kbs_cleanup.NIL, thread);
            Errors.$continue_cerrorP$.bind((SubLObject)kbs_cleanup.T, thread);
            final SubLObject idx = deduction_handles.do_deductions_table();
            final SubLObject mess = (SubLObject)kbs_cleanup.$str8$Fixing_invalid_deductions;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kbs_cleanup.ZERO_INTEGER;
            assert kbs_cleanup.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0_$6 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$7 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_cleanup.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_cleanup.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$8 = idx;
                    if (kbs_cleanup.NIL == id_index.id_index_objects_empty_p(idx_$8, (SubLObject)kbs_cleanup.$kw4$SKIP)) {
                        final SubLObject idx_$9 = idx_$8;
                        if (kbs_cleanup.NIL == id_index.id_index_dense_objects_empty_p(idx_$9, (SubLObject)kbs_cleanup.$kw4$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$9);
                            final SubLObject backwardP_var = (SubLObject)kbs_cleanup.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject d_id;
                            SubLObject d_handle;
                            SubLObject deduction;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kbs_cleanup.NIL, v_iteration = (SubLObject)kbs_cleanup.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kbs_cleanup.ONE_INTEGER)) {
                                d_id = ((kbs_cleanup.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kbs_cleanup.ONE_INTEGER) : v_iteration);
                                d_handle = Vectors.aref(vector_var, d_id);
                                if (kbs_cleanup.NIL == id_index.id_index_tombstone_p(d_handle) || kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) {
                                    if (kbs_cleanup.NIL != id_index.id_index_tombstone_p(d_handle)) {
                                        d_handle = (SubLObject)kbs_cleanup.$kw4$SKIP;
                                    }
                                    deduction = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                    if (kbs_cleanup.NIL == deduction_handles.valid_deduction(deduction, (SubLObject)kbs_cleanup.T)) {
                                        if (kbs_cleanup.NIL != kbs_cleanup.$show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                            Errors.warn((SubLObject)kbs_cleanup.$str9$invalid_deduction___S, deduction_handles.deduction_id(deduction));
                                        }
                                        remove_invalid_deduction(deduction);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$10 = idx_$8;
                        if (kbs_cleanup.NIL == id_index.id_index_sparse_objects_empty_p(idx_$10) || kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$10);
                            SubLObject d_id2 = id_index.id_index_sparse_id_threshold(idx_$10);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$10);
                            final SubLObject v_default = (SubLObject)((kbs_cleanup.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) ? kbs_cleanup.NIL : kbs_cleanup.$kw4$SKIP);
                            while (d_id2.numL(end_id)) {
                                final SubLObject d_handle2 = Hashtables.gethash_without_values(d_id2, sparse, v_default);
                                if (kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP) || kbs_cleanup.NIL == id_index.id_index_tombstone_p(d_handle2)) {
                                    final SubLObject deduction2 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                    if (kbs_cleanup.NIL == deduction_handles.valid_deduction(deduction2, (SubLObject)kbs_cleanup.T)) {
                                        if (kbs_cleanup.NIL != kbs_cleanup.$show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                            Errors.warn((SubLObject)kbs_cleanup.$str9$invalid_deduction___S, deduction_handles.deduction_id(deduction2));
                                        }
                                        remove_invalid_deduction(deduction2);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                d_id2 = Numbers.add(d_id2, (SubLObject)kbs_cleanup.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_cleanup.T, thread);
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
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$7, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$6, thread);
            }
        }
        finally {
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kbs_cleanup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 3193L)
    public static SubLObject remove_invalid_deduction(final SubLObject deduction) {
        assert kbs_cleanup.NIL != deduction_handles.deduction_p(deduction) : deduction;
        final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
        return tms.tms_remove_argument(deduction, supported_object, (SubLObject)kbs_cleanup.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 3413L)
    public static SubLObject kbs_clear_extent() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = kbs_cleanup.$kbs_clear_extent$.getDynamicValue(thread);
        SubLObject predicate = (SubLObject)kbs_cleanup.NIL;
        predicate = cdolist_list_var.first();
        while (kbs_cleanup.NIL != cdolist_list_var) {
            final SubLObject message = PrintLow.format((SubLObject)kbs_cleanup.NIL, (SubLObject)kbs_cleanup.$str11$clearing_extent_of__S, predicate);
            final SubLObject total = kb_indexing.num_predicate_extent_index(predicate, (SubLObject)kbs_cleanup.UNPROVIDED);
            SubLObject sofar = (SubLObject)kbs_cleanup.ZERO_INTEGER;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_cleanup.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_cleanup.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message);
                    final SubLObject pred_var = predicate;
                    if (kbs_cleanup.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = (SubLObject)kbs_cleanup.NIL;
                        final SubLObject _prev_bind_0_$12 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$13 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$14 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$15 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)kbs_cleanup.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((kbs_cleanup.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kbs_cleanup.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = (SubLObject)kbs_cleanup.NIL;
                            final SubLObject token_var = (SubLObject)kbs_cleanup.NIL;
                            while (kbs_cleanup.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (kbs_cleanup.NIL != valid) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator = (SubLObject)kbs_cleanup.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kbs_cleanup.$kw12$GAF, (SubLObject)kbs_cleanup.NIL, (SubLObject)kbs_cleanup.NIL);
                                        SubLObject done_var_$16 = (SubLObject)kbs_cleanup.NIL;
                                        final SubLObject token_var_$17 = (SubLObject)kbs_cleanup.NIL;
                                        while (kbs_cleanup.NIL == done_var_$16) {
                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$17);
                                            final SubLObject valid_$18 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$17.eql(ass));
                                            if (kbs_cleanup.NIL != valid_$18) {
                                                sofar = Numbers.add(sofar, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                                utilities_macros.note_percent_progress(sofar, total);
                                                SubLObject ignore_errors_tag = (SubLObject)kbs_cleanup.NIL;
                                                try {
                                                    thread.throwStack.push(kbs_cleanup.$kw13$IGNORE_ERRORS_TARGET);
                                                    final SubLObject _prev_bind_0_$13 = Errors.$error_handler$.currentBinding(thread);
                                                    try {
                                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)kbs_cleanup.$sym14$IGNORE_ERRORS_HANDLER), thread);
                                                        try {
                                                            tms.tms_remove_assertion(ass);
                                                        }
                                                        catch (Throwable catch_var) {
                                                            Errors.handleThrowable(catch_var, (SubLObject)kbs_cleanup.NIL);
                                                        }
                                                    }
                                                    finally {
                                                        Errors.$error_handler$.rebind(_prev_bind_0_$13, thread);
                                                    }
                                                }
                                                catch (Throwable ccatch_env_var) {
                                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)kbs_cleanup.$kw13$IGNORE_ERRORS_TARGET);
                                                }
                                                finally {
                                                    thread.throwStack.pop();
                                                }
                                            }
                                            done_var_$16 = (SubLObject)SubLObjectFactory.makeBoolean(kbs_cleanup.NIL == valid_$18);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_cleanup.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (kbs_cleanup.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kbs_cleanup.NIL == valid);
                            }
                            utilities_macros.noting_progress_postamble();
                        }
                        finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$15, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$14, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$13, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$12, thread);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_cleanup.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        return (SubLObject)kbs_cleanup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 3870L)
    public static SubLObject kill_empty_kbs_terms() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)kbs_cleanup.NIL, thread);
            Errors.$continue_cerrorP$.bind((SubLObject)kbs_cleanup.T, thread);
            final SubLObject message = (SubLObject)kbs_cleanup.$str15$Killing_terms_without_isa_asserti;
            final SubLObject total = forts.fort_count();
            SubLObject sofar = (SubLObject)kbs_cleanup.ZERO_INTEGER;
            final SubLObject _prev_bind_0_$22 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$23 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_cleanup.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_cleanup.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message);
                    SubLObject cdolist_list_var = forts.do_forts_tables();
                    SubLObject table_var = (SubLObject)kbs_cleanup.NIL;
                    table_var = cdolist_list_var.first();
                    while (kbs_cleanup.NIL != cdolist_list_var) {
                        final SubLObject idx = table_var;
                        if (kbs_cleanup.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)kbs_cleanup.$kw4$SKIP)) {
                            final SubLObject idx_$24 = idx;
                            if (kbs_cleanup.NIL == id_index.id_index_dense_objects_empty_p(idx_$24, (SubLObject)kbs_cleanup.$kw4$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$24);
                                final SubLObject backwardP_var = (SubLObject)kbs_cleanup.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject id;
                                SubLObject fort;
                                SubLObject total_$25;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kbs_cleanup.NIL, v_iteration = (SubLObject)kbs_cleanup.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kbs_cleanup.ONE_INTEGER)) {
                                    id = ((kbs_cleanup.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kbs_cleanup.ONE_INTEGER) : v_iteration);
                                    fort = Vectors.aref(vector_var, id);
                                    if (kbs_cleanup.NIL == id_index.id_index_tombstone_p(fort) || kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) {
                                        if (kbs_cleanup.NIL != id_index.id_index_tombstone_p(fort)) {
                                            fort = (SubLObject)kbs_cleanup.$kw4$SKIP;
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                        if (kbs_cleanup.NIL != forts.valid_fortP(fort) && !kb_indexing.num_gaf_arg_index(fort, (SubLObject)kbs_cleanup.ONE_INTEGER, kbs_cleanup.$const16$isa, (SubLObject)kbs_cleanup.UNPROVIDED).isPositive()) {
                                            if (kbs_cleanup.NIL != kbs_cleanup.$show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                                total_$25 = kb_indexing.num_index(fort);
                                                Errors.warn((SubLObject)kbs_cleanup.$str17$Killing__S___S_, fort, total_$25);
                                            }
                                            cyc_kernel.cyc_kill(fort);
                                        }
                                    }
                                }
                            }
                            final SubLObject idx_$25 = idx;
                            if (kbs_cleanup.NIL == id_index.id_index_sparse_objects_empty_p(idx_$25) || kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) {
                                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$25);
                                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$25);
                                final SubLObject end_id = id_index.id_index_next_id(idx_$25);
                                final SubLObject v_default = (SubLObject)((kbs_cleanup.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) ? kbs_cleanup.NIL : kbs_cleanup.$kw4$SKIP);
                                while (id2.numL(end_id)) {
                                    final SubLObject fort2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                    if (kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP) || kbs_cleanup.NIL == id_index.id_index_tombstone_p(fort2)) {
                                        sofar = Numbers.add(sofar, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                        if (kbs_cleanup.NIL != forts.valid_fortP(fort2) && !kb_indexing.num_gaf_arg_index(fort2, (SubLObject)kbs_cleanup.ONE_INTEGER, kbs_cleanup.$const16$isa, (SubLObject)kbs_cleanup.UNPROVIDED).isPositive()) {
                                            if (kbs_cleanup.NIL != kbs_cleanup.$show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                                final SubLObject total_$26 = kb_indexing.num_index(fort2);
                                                Errors.warn((SubLObject)kbs_cleanup.$str17$Killing__S___S_, fort2, total_$26);
                                            }
                                            cyc_kernel.cyc_kill(fort2);
                                        }
                                    }
                                    id2 = Numbers.add(id2, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                }
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        table_var = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_cleanup.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$23, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$22, thread);
            }
        }
        finally {
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kbs_cleanup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 4382L)
    public static SubLObject kill_naked_prototypicals() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)kbs_cleanup.NIL, thread);
            Errors.$continue_cerrorP$.bind((SubLObject)kbs_cleanup.T, thread);
            SubLObject prototypicals = (SubLObject)kbs_cleanup.NIL;
            final SubLObject _prev_bind_0_$29 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$30 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbs_cleanup.$sym18$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(kbs_cleanup.$const19$EverythingPSC, thread);
                prototypicals = isa.all_quoted_instances(kbs_cleanup.$const20$HLPrototypicalTerm, (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$30, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$29, thread);
            }
            final SubLObject list_var = prototypicals;
            final SubLObject _prev_bind_0_$30 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$31 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)kbs_cleanup.$str21$Killing_naked_prototypicals, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_cleanup.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_cleanup.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject prototypical = (SubLObject)kbs_cleanup.NIL;
                    prototypical = csome_list_var.first();
                    while (kbs_cleanup.NIL != csome_list_var) {
                        if (kbs_cleanup.NIL != forts.fort_p(prototypical) && !kb_indexing.num_gaf_arg_index(prototypical, (SubLObject)kbs_cleanup.ONE_INTEGER, kbs_cleanup.$const23$hlPrototypicalInstance, (SubLObject)kbs_cleanup.UNPROVIDED).isPositive() && kbs_cleanup.NIL != kbs_cleanup.$show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                            Errors.warn((SubLObject)kbs_cleanup.$str24$Killing__S, prototypical);
                            cyc_kernel.cyc_kill(prototypical);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kbs_cleanup.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        prototypical = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_cleanup.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$31, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$30, thread);
            }
        }
        finally {
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kbs_cleanup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 4935L)
    public static SubLObject kill_empty_skolems() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)kbs_cleanup.NIL, thread);
            Errors.$continue_cerrorP$.bind((SubLObject)kbs_cleanup.T, thread);
            SubLObject v_skolems = (SubLObject)kbs_cleanup.NIL;
            final SubLObject _prev_bind_0_$34 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$35 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbs_cleanup.$sym18$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(kbs_cleanup.$const19$EverythingPSC, thread);
                v_skolems = isa.all_fort_instances(kbs_cleanup.$const25$SkolemFunction, (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$35, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$34, thread);
            }
            final SubLObject list_var = v_skolems;
            final SubLObject _prev_bind_0_$35 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$36 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)kbs_cleanup.$str26$Killing_empty_skolems, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_cleanup.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_cleanup.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject skolem = (SubLObject)kbs_cleanup.NIL;
                    skolem = csome_list_var.first();
                    while (kbs_cleanup.NIL != csome_list_var) {
                        if (kbs_cleanup.NIL != skolems.skolem_function_has_no_defn_assertions_robustP(skolem)) {
                            if (kbs_cleanup.NIL != kbs_cleanup.$show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                Errors.warn((SubLObject)kbs_cleanup.$str24$Killing__S, skolem);
                            }
                            cyc_kernel.cyc_kill(skolem);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kbs_cleanup.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        skolem = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_cleanup.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$36, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$35, thread);
            }
        }
        finally {
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kbs_cleanup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 5422L)
    public static SubLObject remove_bad_term_of_unit_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)kbs_cleanup.$str27$Removing_bad___termOfUnit_asserti);
                final SubLObject _prev_bind_0_$39 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$40 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbs_cleanup.$sym18$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(kbs_cleanup.$const19$EverythingPSC, thread);
                    final SubLObject tou_count = kb_indexing.num_predicate_extent_index(kbs_cleanup.$const28$termOfUnit, (SubLObject)kbs_cleanup.UNPROVIDED);
                    SubLObject count = (SubLObject)kbs_cleanup.ZERO_INTEGER;
                    final SubLObject pred_var = kbs_cleanup.$const28$termOfUnit;
                    if (kbs_cleanup.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = (SubLObject)kbs_cleanup.NIL;
                        final SubLObject _prev_bind_0_$40 = utilities_macros.$progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$41 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$43 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$44 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            utilities_macros.$progress_notification_count$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
                            utilities_macros.$progress_count$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
                            utilities_macros.$is_noting_progressP$.bind((SubLObject)kbs_cleanup.T, thread);
                            utilities_macros.$silent_progressP$.bind((SubLObject)((kbs_cleanup.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kbs_cleanup.T), thread);
                            utilities_macros.noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = (SubLObject)kbs_cleanup.NIL;
                            final SubLObject token_var = (SubLObject)kbs_cleanup.NIL;
                            while (kbs_cleanup.NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (kbs_cleanup.NIL != valid) {
                                    utilities_macros.note_progress();
                                    SubLObject final_index_iterator = (SubLObject)kbs_cleanup.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kbs_cleanup.$kw12$GAF, (SubLObject)kbs_cleanup.NIL, (SubLObject)kbs_cleanup.NIL);
                                        SubLObject done_var_$45 = (SubLObject)kbs_cleanup.NIL;
                                        final SubLObject token_var_$46 = (SubLObject)kbs_cleanup.NIL;
                                        while (kbs_cleanup.NIL == done_var_$45) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$46);
                                            final SubLObject valid_$47 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$46.eql(assertion));
                                            if (kbs_cleanup.NIL != valid_$47) {
                                                if (kbs_cleanup.NIL == kb_cleanup.tou_assertion_goodP(assertion)) {
                                                    if (kbs_cleanup.NIL != kbs_cleanup.$show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                                        Errors.warn((SubLObject)kbs_cleanup.$str29$Removing__A, assertion);
                                                    }
                                                    assertions_high.remove_assertion(assertion);
                                                }
                                                count = Numbers.add(count, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                                utilities_macros.note_percent_progress(count, tou_count);
                                            }
                                            done_var_$45 = (SubLObject)SubLObjectFactory.makeBoolean(kbs_cleanup.NIL == valid_$47);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_cleanup.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            if (kbs_cleanup.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kbs_cleanup.NIL == valid);
                            }
                            utilities_macros.noting_progress_postamble();
                        }
                        finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$44, thread);
                            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$43, thread);
                            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$41, thread);
                            utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$40, thread);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$40, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$39, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_cleanup.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kbs_cleanup.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 6020L)
    public static SubLObject kill_sparse_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kill_total = (SubLObject)kbs_cleanup.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)kbs_cleanup.NIL, thread);
            Errors.$continue_cerrorP$.bind((SubLObject)kbs_cleanup.T, thread);
            final SubLObject idx = nart_handles.do_narts_table();
            final SubLObject mess = (SubLObject)kbs_cleanup.$str31$Killing_NARTs_with_only_definitio;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kbs_cleanup.ZERO_INTEGER;
            assert kbs_cleanup.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0_$50 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$51 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_cleanup.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_cleanup.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$52 = idx;
                    if (kbs_cleanup.NIL == id_index.id_index_objects_empty_p(idx_$52, (SubLObject)kbs_cleanup.$kw4$SKIP)) {
                        final SubLObject idx_$53 = idx_$52;
                        if (kbs_cleanup.NIL == id_index.id_index_dense_objects_empty_p(idx_$53, (SubLObject)kbs_cleanup.$kw4$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$53);
                            final SubLObject backwardP_var = (SubLObject)kbs_cleanup.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject nart;
                            SubLObject total_$54;
                            SubLObject def_total;
                            SubLObject cdolist_list_var;
                            SubLObject pred;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kbs_cleanup.NIL, v_iteration = (SubLObject)kbs_cleanup.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kbs_cleanup.ONE_INTEGER)) {
                                id = ((kbs_cleanup.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kbs_cleanup.ONE_INTEGER) : v_iteration);
                                nart = Vectors.aref(vector_var, id);
                                if (kbs_cleanup.NIL == id_index.id_index_tombstone_p(nart) || kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) {
                                    if (kbs_cleanup.NIL != id_index.id_index_tombstone_p(nart)) {
                                        nart = (SubLObject)kbs_cleanup.$kw4$SKIP;
                                    }
                                    if (kbs_cleanup.NIL != nart_handles.valid_nartP(nart, (SubLObject)kbs_cleanup.UNPROVIDED)) {
                                        total_$54 = kb_indexing.num_index(nart);
                                        def_total = (SubLObject)kbs_cleanup.ZERO_INTEGER;
                                        cdolist_list_var = kbs_cleanup.$sparse_nart_preds$.getDynamicValue(thread);
                                        pred = (SubLObject)kbs_cleanup.NIL;
                                        pred = cdolist_list_var.first();
                                        while (kbs_cleanup.NIL != cdolist_list_var) {
                                            def_total = Numbers.add(def_total, kb_indexing.num_gaf_arg_index(nart, (SubLObject)kbs_cleanup.ONE_INTEGER, pred, (SubLObject)kbs_cleanup.UNPROVIDED));
                                            cdolist_list_var = cdolist_list_var.rest();
                                            pred = cdolist_list_var.first();
                                        }
                                        if (total_$54.numG(def_total)) {
                                            if (kbs_cleanup.NIL != kbs_cleanup.$show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                                Errors.warn((SubLObject)kbs_cleanup.$str32$Keeping__S___S_, nart, Numbers.subtract(total_$54, def_total));
                                            }
                                        }
                                        else {
                                            cyc_kernel.cyc_kill(nart);
                                            kill_total = Numbers.add(kill_total, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                        }
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$54 = idx_$52;
                        if (kbs_cleanup.NIL == id_index.id_index_sparse_objects_empty_p(idx_$54) || kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$54);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$54);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$54);
                            final SubLObject v_default = (SubLObject)((kbs_cleanup.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) ? kbs_cleanup.NIL : kbs_cleanup.$kw4$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject nart2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP) || kbs_cleanup.NIL == id_index.id_index_tombstone_p(nart2)) {
                                    if (kbs_cleanup.NIL != nart_handles.valid_nartP(nart2, (SubLObject)kbs_cleanup.UNPROVIDED)) {
                                        final SubLObject total_$55 = kb_indexing.num_index(nart2);
                                        SubLObject def_total2 = (SubLObject)kbs_cleanup.ZERO_INTEGER;
                                        SubLObject cdolist_list_var2 = kbs_cleanup.$sparse_nart_preds$.getDynamicValue(thread);
                                        SubLObject pred2 = (SubLObject)kbs_cleanup.NIL;
                                        pred2 = cdolist_list_var2.first();
                                        while (kbs_cleanup.NIL != cdolist_list_var2) {
                                            def_total2 = Numbers.add(def_total2, kb_indexing.num_gaf_arg_index(nart2, (SubLObject)kbs_cleanup.ONE_INTEGER, pred2, (SubLObject)kbs_cleanup.UNPROVIDED));
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            pred2 = cdolist_list_var2.first();
                                        }
                                        if (total_$55.numG(def_total2)) {
                                            if (kbs_cleanup.NIL != kbs_cleanup.$show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                                Errors.warn((SubLObject)kbs_cleanup.$str32$Keeping__S___S_, nart2, Numbers.subtract(total_$55, def_total2));
                                            }
                                        }
                                        else {
                                            cyc_kernel.cyc_kill(nart2);
                                            kill_total = Numbers.add(kill_total, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                        }
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                id2 = Numbers.add(id2, (SubLObject)kbs_cleanup.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_cleanup.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$51, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$50, thread);
            }
        }
        finally {
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return kill_total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 6610L)
    public static SubLObject fix_reconsider_tms() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = (SubLObject)kbs_cleanup.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)kbs_cleanup.NIL, thread);
            Errors.$continue_cerrorP$.bind((SubLObject)kbs_cleanup.T, thread);
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = (SubLObject)kbs_cleanup.$str33$Removing_invalid_arguments;
            final SubLObject total_$58 = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kbs_cleanup.ZERO_INTEGER;
            assert kbs_cleanup.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0_$59 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$60 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_cleanup.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_cleanup.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$61 = idx;
                    if (kbs_cleanup.NIL == id_index.id_index_objects_empty_p(idx_$61, (SubLObject)kbs_cleanup.$kw4$SKIP)) {
                        final SubLObject idx_$62 = idx_$61;
                        if (kbs_cleanup.NIL == id_index.id_index_dense_objects_empty_p(idx_$62, (SubLObject)kbs_cleanup.$kw4$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$62);
                            final SubLObject backwardP_var = (SubLObject)kbs_cleanup.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion;
                            SubLObject id;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kbs_cleanup.NIL, v_iteration = (SubLObject)kbs_cleanup.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kbs_cleanup.ONE_INTEGER)) {
                                a_id = ((kbs_cleanup.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kbs_cleanup.ONE_INTEGER) : v_iteration);
                                a_handle = Vectors.aref(vector_var, a_id);
                                if (kbs_cleanup.NIL == id_index.id_index_tombstone_p(a_handle) || kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) {
                                    if (kbs_cleanup.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                        a_handle = (SubLObject)kbs_cleanup.$kw4$SKIP;
                                    }
                                    assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    if (kbs_cleanup.NIL != assertions_high.valid_assertion(assertion, (SubLObject)kbs_cleanup.UNPROVIDED)) {
                                        id = assertion_handles.assertion_id(assertion);
                                        if (kbs_cleanup.NIL != tms.tms_reconsider_assertion(assertion)) {
                                            if (kbs_cleanup.NIL != kbs_cleanup.$show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                                Errors.warn((SubLObject)kbs_cleanup.$str34$Assertion__S_removed_, id);
                                            }
                                            total = Numbers.add(total, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                        }
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$58);
                                }
                            }
                        }
                        final SubLObject idx_$63 = idx_$61;
                        if (kbs_cleanup.NIL == id_index.id_index_sparse_objects_empty_p(idx_$63) || kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$63);
                            SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$63);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$63);
                            final SubLObject v_default = (SubLObject)((kbs_cleanup.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) ? kbs_cleanup.NIL : kbs_cleanup.$kw4$SKIP);
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                if (kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP) || kbs_cleanup.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                    final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (kbs_cleanup.NIL != assertions_high.valid_assertion(assertion2, (SubLObject)kbs_cleanup.UNPROVIDED)) {
                                        final SubLObject id2 = assertion_handles.assertion_id(assertion2);
                                        if (kbs_cleanup.NIL != tms.tms_reconsider_assertion(assertion2)) {
                                            if (kbs_cleanup.NIL != kbs_cleanup.$show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                                Errors.warn((SubLObject)kbs_cleanup.$str34$Assertion__S_removed_, id2);
                                            }
                                            total = Numbers.add(total, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                        }
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$58);
                                }
                                a_id2 = Numbers.add(a_id2, (SubLObject)kbs_cleanup.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_cleanup.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$60, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$59, thread);
            }
        }
        finally {
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 7096L)
    public static SubLObject fix_remove_redundant_arguments() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = (SubLObject)kbs_cleanup.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)kbs_cleanup.NIL, thread);
            Errors.$continue_cerrorP$.bind((SubLObject)kbs_cleanup.T, thread);
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = (SubLObject)kbs_cleanup.$str35$Removing_redundant_true_asserted_;
            final SubLObject total_$65 = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kbs_cleanup.ZERO_INTEGER;
            assert kbs_cleanup.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0_$66 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$67 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_cleanup.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_cleanup.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$68 = idx;
                    if (kbs_cleanup.NIL == id_index.id_index_objects_empty_p(idx_$68, (SubLObject)kbs_cleanup.$kw4$SKIP)) {
                        final SubLObject idx_$69 = idx_$68;
                        if (kbs_cleanup.NIL == id_index.id_index_dense_objects_empty_p(idx_$69, (SubLObject)kbs_cleanup.$kw4$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$69);
                            final SubLObject backwardP_var = (SubLObject)kbs_cleanup.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion;
                            SubLObject v_arguments;
                            SubLObject asserted_argument;
                            SubLObject assertion_goneP;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kbs_cleanup.NIL, v_iteration = (SubLObject)kbs_cleanup.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kbs_cleanup.ONE_INTEGER)) {
                                a_id = ((kbs_cleanup.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kbs_cleanup.ONE_INTEGER) : v_iteration);
                                a_handle = Vectors.aref(vector_var, a_id);
                                if (kbs_cleanup.NIL == id_index.id_index_tombstone_p(a_handle) || kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) {
                                    if (kbs_cleanup.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                        a_handle = (SubLObject)kbs_cleanup.$kw4$SKIP;
                                    }
                                    assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    if (kbs_cleanup.NIL != assertions_high.valid_assertion(assertion, (SubLObject)kbs_cleanup.UNPROVIDED) && kbs_cleanup.NIL != assertions_high.gaf_assertionP(assertion) && kbs_cleanup.NIL != assertions_high.asserted_assertionP(assertion) && kbs_cleanup.NIL == assertions_high.assertion_has_dependents_p(assertion) && kbs_cleanup.NIL != assertions_high.assertion_has_truth(assertion, (SubLObject)kbs_cleanup.$kw36$TRUE)) {
                                        v_arguments = assertions_high.assertion_arguments(assertion);
                                        if (kbs_cleanup.NIL == list_utilities.singletonP(v_arguments) && kbs_cleanup.NIL == Sequences.find((SubLObject)kbs_cleanup.$kw37$FALSE, v_arguments, Symbols.symbol_function((SubLObject)kbs_cleanup.EQL), Symbols.symbol_function((SubLObject)kbs_cleanup.$sym38$ARGUMENT_TRUTH), (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED)) {
                                            asserted_argument = assertions_high.get_asserted_argument(assertion);
                                            if (kbs_cleanup.NIL != asserted_argument) {
                                                total = Numbers.add(total, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                                assertion_goneP = tms.tms_remove_argument(asserted_argument, assertion, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                if (kbs_cleanup.NIL != assertion_goneP && kbs_cleanup.NIL != kbs_cleanup.$show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                                    Errors.warn((SubLObject)kbs_cleanup.$str39$Assertion_removed_);
                                                }
                                            }
                                        }
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$65);
                                }
                            }
                        }
                        final SubLObject idx_$70 = idx_$68;
                        if (kbs_cleanup.NIL == id_index.id_index_sparse_objects_empty_p(idx_$70) || kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$70);
                            SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$70);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$70);
                            final SubLObject v_default = (SubLObject)((kbs_cleanup.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) ? kbs_cleanup.NIL : kbs_cleanup.$kw4$SKIP);
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                if (kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP) || kbs_cleanup.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                    final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (kbs_cleanup.NIL != assertions_high.valid_assertion(assertion2, (SubLObject)kbs_cleanup.UNPROVIDED) && kbs_cleanup.NIL != assertions_high.gaf_assertionP(assertion2) && kbs_cleanup.NIL != assertions_high.asserted_assertionP(assertion2) && kbs_cleanup.NIL == assertions_high.assertion_has_dependents_p(assertion2) && kbs_cleanup.NIL != assertions_high.assertion_has_truth(assertion2, (SubLObject)kbs_cleanup.$kw36$TRUE)) {
                                        final SubLObject v_arguments2 = assertions_high.assertion_arguments(assertion2);
                                        if (kbs_cleanup.NIL == list_utilities.singletonP(v_arguments2) && kbs_cleanup.NIL == Sequences.find((SubLObject)kbs_cleanup.$kw37$FALSE, v_arguments2, Symbols.symbol_function((SubLObject)kbs_cleanup.EQL), Symbols.symbol_function((SubLObject)kbs_cleanup.$sym38$ARGUMENT_TRUTH), (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED)) {
                                            final SubLObject asserted_argument2 = assertions_high.get_asserted_argument(assertion2);
                                            if (kbs_cleanup.NIL != asserted_argument2) {
                                                total = Numbers.add(total, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                                final SubLObject assertion_goneP2 = tms.tms_remove_argument(asserted_argument2, assertion2, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                if (kbs_cleanup.NIL != assertion_goneP2 && kbs_cleanup.NIL != kbs_cleanup.$show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                                    Errors.warn((SubLObject)kbs_cleanup.$str39$Assertion_removed_);
                                                }
                                            }
                                        }
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total_$65);
                                }
                                a_id2 = Numbers.add(a_id2, (SubLObject)kbs_cleanup.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_cleanup.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$67, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$66, thread);
            }
        }
        finally {
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return total;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 8172L)
    public static SubLObject kbs_kill_unrunnable_kb_queries() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)kbs_cleanup.ZERO_INTEGER;
        PrintLow.format((SubLObject)kbs_cleanup.T, (SubLObject)kbs_cleanup.$str40$Removing_invalid_KB_queries);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbs_cleanup.$sym18$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kbs_cleanup.$const19$EverythingPSC, thread);
            final SubLObject node_var = kbs_cleanup.$const41$KBContentTest_FullySpecified;
            final SubLObject _prev_bind_0_$72 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$73 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(kbs_cleanup.$const16$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$74 = node_var;
                    final SubLObject deck_type = (SubLObject)kbs_cleanup.$kw44$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$73 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)kbs_cleanup.NIL;
                            final SubLObject _prev_bind_0_$74 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$74 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((kbs_cleanup.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((kbs_cleanup.NIL != tv_var) ? kbs_cleanup.$sym45$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (kbs_cleanup.NIL != tv_var && kbs_cleanup.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && kbs_cleanup.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)kbs_cleanup.$kw46$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)kbs_cleanup.ONE_INTEGER, (SubLObject)kbs_cleanup.$str47$_A_is_not_a__A, tv_var, (SubLObject)kbs_cleanup.$sym48$SBHL_TRUE_TV_P, (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)kbs_cleanup.$kw49$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)kbs_cleanup.ONE_INTEGER, (SubLObject)kbs_cleanup.$str50$continue_anyway, (SubLObject)kbs_cleanup.$str47$_A_is_not_a__A, tv_var, (SubLObject)kbs_cleanup.$sym48$SBHL_TRUE_TV_P, (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)kbs_cleanup.$kw51$WARN)) {
                                        Errors.warn((SubLObject)kbs_cleanup.$str47$_A_is_not_a__A, tv_var, (SubLObject)kbs_cleanup.$sym48$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)kbs_cleanup.$str52$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)kbs_cleanup.$str50$continue_anyway, (SubLObject)kbs_cleanup.$str47$_A_is_not_a__A, tv_var, (SubLObject)kbs_cleanup.$sym48$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$75 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$75 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_cleanup.$const16$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_cleanup.$const16$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_cleanup.$const16$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kbs_cleanup.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_cleanup.$const16$isa)), thread);
                                    if (kbs_cleanup.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || kbs_cleanup.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_cleanup.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$76 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$76 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$82 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_cleanup.$const16$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kbs_cleanup.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$74, (SubLObject)kbs_cleanup.UNPROVIDED);
                                            while (kbs_cleanup.NIL != node_var_$74) {
                                                final SubLObject tt_node_var = node_var_$74;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(kbs_cleanup.$const16$isa));
                                                SubLObject module_var = (SubLObject)kbs_cleanup.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (kbs_cleanup.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$77 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$77 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kbs_cleanup.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kbs_cleanup.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (kbs_cleanup.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_cleanup.UNPROVIDED));
                                                            if (kbs_cleanup.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_cleanup.$const16$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_cleanup.UNPROVIDED));
                                                                if (kbs_cleanup.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kbs_cleanup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (kbs_cleanup.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$78 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$86;
                                                                                for (iteration_state_$86 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kbs_cleanup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$86); iteration_state_$86 = dictionary_contents.do_dictionary_contents_next(iteration_state_$86)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$86);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (kbs_cleanup.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$79 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (kbs_cleanup.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject query;
                                                                                                SubLObject query_spec;
                                                                                                SubLObject severity;
                                                                                                SubLObject reason;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_cleanup.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_cleanup.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (kbs_cleanup.NIL != set_contents.do_set_contents_element_validP(state, query) && kbs_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (kbs_cleanup.NIL != forts.fort_p(query)) {
                                                                                                            query_spec = kct_utils.kct_query_specification(query, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                                                                            if (kbs_cleanup.NIL == query_spec) {
                                                                                                                Errors.warn((SubLObject)kbs_cleanup.$str53$Killing_query__A_because_it_has_n, query);
                                                                                                            }
                                                                                                            else if (kbs_cleanup.NIL == kb_query.kbq_runnableP(query_spec)) {
                                                                                                                thread.resetMultipleValues();
                                                                                                                severity = kb_query.why_not_kbq_valid(query_spec, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                                                                                reason = thread.secondMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                Errors.warn((SubLObject)kbs_cleanup.$str54$Killing_invalid_query__A_because_, query, reason);
                                                                                                                cyc_kernel.cyc_kill(query);
                                                                                                                count = Numbers.add(count, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject query2 = (SubLObject)kbs_cleanup.NIL;
                                                                                                query2 = csome_list_var.first();
                                                                                                while (kbs_cleanup.NIL != csome_list_var) {
                                                                                                    if (kbs_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (kbs_cleanup.NIL != forts.fort_p(query2)) {
                                                                                                            final SubLObject query_spec2 = kct_utils.kct_query_specification(query2, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                                                                            if (kbs_cleanup.NIL == query_spec2) {
                                                                                                                Errors.warn((SubLObject)kbs_cleanup.$str53$Killing_query__A_because_it_has_n, query2);
                                                                                                            }
                                                                                                            else if (kbs_cleanup.NIL == kb_query.kbq_runnableP(query_spec2)) {
                                                                                                                thread.resetMultipleValues();
                                                                                                                final SubLObject severity2 = kb_query.why_not_kbq_valid(query_spec2, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                                                                                final SubLObject reason2 = thread.secondMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                Errors.warn((SubLObject)kbs_cleanup.$str54$Killing_invalid_query__A_because_, query2, reason2);
                                                                                                                cyc_kernel.cyc_kill(query2);
                                                                                                                count = Numbers.add(count, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    query2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)kbs_cleanup.$str55$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$79, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$86);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$78, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)kbs_cleanup.FIVE_INTEGER, (SubLObject)kbs_cleanup.$str56$attempting_to_bind_direction_link, (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                            }
                                                            if (kbs_cleanup.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_cleanup.UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = (SubLObject)kbs_cleanup.NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (kbs_cleanup.NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = (SubLObject)kbs_cleanup.NIL;
                                                                    SubLObject mt2 = (SubLObject)kbs_cleanup.NIL;
                                                                    SubLObject tv2 = (SubLObject)kbs_cleanup.NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_cleanup.$list57);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_cleanup.$list57);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_cleanup.$list57);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (kbs_cleanup.NIL == current) {
                                                                        if (kbs_cleanup.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$80 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (kbs_cleanup.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$81 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                        if (kbs_cleanup.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject query;
                                                                                            SubLObject query_spec;
                                                                                            SubLObject severity;
                                                                                            SubLObject reason;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_cleanup.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_cleanup.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (kbs_cleanup.NIL != set_contents.do_set_contents_element_validP(state, query) && kbs_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (kbs_cleanup.NIL != forts.fort_p(query)) {
                                                                                                        query_spec = kct_utils.kct_query_specification(query, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                                                                        if (kbs_cleanup.NIL == query_spec) {
                                                                                                            Errors.warn((SubLObject)kbs_cleanup.$str53$Killing_query__A_because_it_has_n, query);
                                                                                                        }
                                                                                                        else if (kbs_cleanup.NIL == kb_query.kbq_runnableP(query_spec)) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            severity = kb_query.why_not_kbq_valid(query_spec, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                                                                            reason = thread.secondMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            Errors.warn((SubLObject)kbs_cleanup.$str54$Killing_invalid_query__A_because_, query, reason);
                                                                                                            cyc_kernel.cyc_kill(query);
                                                                                                            count = Numbers.add(count, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$90 = sol;
                                                                                            SubLObject query2 = (SubLObject)kbs_cleanup.NIL;
                                                                                            query2 = csome_list_var_$90.first();
                                                                                            while (kbs_cleanup.NIL != csome_list_var_$90) {
                                                                                                if (kbs_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (kbs_cleanup.NIL != forts.fort_p(query2)) {
                                                                                                        final SubLObject query_spec2 = kct_utils.kct_query_specification(query2, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                                                                        if (kbs_cleanup.NIL == query_spec2) {
                                                                                                            Errors.warn((SubLObject)kbs_cleanup.$str53$Killing_query__A_because_it_has_n, query2);
                                                                                                        }
                                                                                                        else if (kbs_cleanup.NIL == kb_query.kbq_runnableP(query_spec2)) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            final SubLObject severity2 = kb_query.why_not_kbq_valid(query_spec2, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                                                                            final SubLObject reason2 = thread.secondMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            Errors.warn((SubLObject)kbs_cleanup.$str54$Killing_invalid_query__A_because_, query2, reason2);
                                                                                                            cyc_kernel.cyc_kill(query2);
                                                                                                            count = Numbers.add(count, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$90 = csome_list_var_$90.rest();
                                                                                                query2 = csome_list_var_$90.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)kbs_cleanup.$str55$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$81, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$80, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kbs_cleanup.$list57);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        }
                                                        else if (kbs_cleanup.NIL != obsolete.cnat_p(node, (SubLObject)kbs_cleanup.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$91;
                                                            final SubLObject new_list = cdolist_list_var_$91 = ((kbs_cleanup.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_cleanup.$const16$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_cleanup.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_cleanup.$const16$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_cleanup.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)kbs_cleanup.NIL;
                                                            generating_fn = cdolist_list_var_$91.first();
                                                            while (kbs_cleanup.NIL != cdolist_list_var_$91) {
                                                                final SubLObject _prev_bind_0_$82 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (kbs_cleanup.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject query3;
                                                                        SubLObject query_spec3;
                                                                        SubLObject severity3;
                                                                        SubLObject reason3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kbs_cleanup.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kbs_cleanup.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            query3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (kbs_cleanup.NIL != set_contents.do_set_contents_element_validP(state2, query3) && kbs_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (kbs_cleanup.NIL != forts.fort_p(query3)) {
                                                                                    query_spec3 = kct_utils.kct_query_specification(query3, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                                                    if (kbs_cleanup.NIL == query_spec3) {
                                                                                        Errors.warn((SubLObject)kbs_cleanup.$str53$Killing_query__A_because_it_has_n, query3);
                                                                                    }
                                                                                    else if (kbs_cleanup.NIL == kb_query.kbq_runnableP(query_spec3)) {
                                                                                        thread.resetMultipleValues();
                                                                                        severity3 = kb_query.why_not_kbq_valid(query_spec3, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                                                        reason3 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        Errors.warn((SubLObject)kbs_cleanup.$str54$Killing_invalid_query__A_because_, query3, reason3);
                                                                                        cyc_kernel.cyc_kill(query3);
                                                                                        count = Numbers.add(count, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var3 = sol2;
                                                                        SubLObject query4 = (SubLObject)kbs_cleanup.NIL;
                                                                        query4 = csome_list_var3.first();
                                                                        while (kbs_cleanup.NIL != csome_list_var3) {
                                                                            if (kbs_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (kbs_cleanup.NIL != forts.fort_p(query4)) {
                                                                                    final SubLObject query_spec4 = kct_utils.kct_query_specification(query4, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                                                    if (kbs_cleanup.NIL == query_spec4) {
                                                                                        Errors.warn((SubLObject)kbs_cleanup.$str53$Killing_query__A_because_it_has_n, query4);
                                                                                    }
                                                                                    else if (kbs_cleanup.NIL == kb_query.kbq_runnableP(query_spec4)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject severity4 = kb_query.why_not_kbq_valid(query_spec4, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                                                        final SubLObject reason4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        Errors.warn((SubLObject)kbs_cleanup.$str54$Killing_invalid_query__A_because_, query4, reason4);
                                                                                        cyc_kernel.cyc_kill(query4);
                                                                                        count = Numbers.add(count, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                                                                    }
                                                                                }
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            query4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)kbs_cleanup.$str55$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$82, thread);
                                                                }
                                                                cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                                                                generating_fn = cdolist_list_var_$91.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$77, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$77, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_cleanup.$const16$isa)));
                                                SubLObject module_var2 = (SubLObject)kbs_cleanup.NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (kbs_cleanup.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$83 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$78 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kbs_cleanup.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kbs_cleanup.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$74);
                                                        if (kbs_cleanup.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_cleanup.UNPROVIDED));
                                                            if (kbs_cleanup.NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_cleanup.UNPROVIDED));
                                                                if (kbs_cleanup.NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); kbs_cleanup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (kbs_cleanup.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$84 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$87;
                                                                                for (iteration_state_$87 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); kbs_cleanup.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$87); iteration_state_$87 = dictionary_contents.do_dictionary_contents_next(iteration_state_$87)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$87);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (kbs_cleanup.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$85 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (kbs_cleanup.NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)kbs_cleanup.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); kbs_cleanup.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (kbs_cleanup.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && kbs_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)kbs_cleanup.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)kbs_cleanup.NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (kbs_cleanup.NIL != csome_list_var4) {
                                                                                                    if (kbs_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)kbs_cleanup.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)kbs_cleanup.$str55$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$85, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$87);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$84, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)kbs_cleanup.FIVE_INTEGER, (SubLObject)kbs_cleanup.$str56$attempting_to_bind_direction_link, (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (kbs_cleanup.NIL != obsolete.cnat_p(node2, (SubLObject)kbs_cleanup.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$92;
                                                            final SubLObject new_list2 = cdolist_list_var_$92 = ((kbs_cleanup.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_cleanup.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_cleanup.UNPROVIDED)));
                                                            SubLObject generating_fn2 = (SubLObject)kbs_cleanup.NIL;
                                                            generating_fn2 = cdolist_list_var_$92.first();
                                                            while (kbs_cleanup.NIL != cdolist_list_var_$92) {
                                                                final SubLObject _prev_bind_0_$86 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (kbs_cleanup.NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)kbs_cleanup.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); kbs_cleanup.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (kbs_cleanup.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && kbs_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)kbs_cleanup.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        SubLObject csome_list_var5 = sol4;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)kbs_cleanup.NIL;
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                        while (kbs_cleanup.NIL != csome_list_var5) {
                                                                            if (kbs_cleanup.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)kbs_cleanup.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)kbs_cleanup.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)kbs_cleanup.$str55$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$86, thread);
                                                                }
                                                                cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                                                                generating_fn2 = cdolist_list_var_$92.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$78, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$83, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var_$74 = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$82, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$76, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$76, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)kbs_cleanup.TWO_INTEGER, (SubLObject)kbs_cleanup.$str58$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)kbs_cleanup.UNPROVIDED)), (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED, (SubLObject)kbs_cleanup.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$75, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$75, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$74, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$74, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$87 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_cleanup.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$87, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$73, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$88 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_cleanup.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$88, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$73, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$72, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 8865L)
    public static SubLObject forget_useless_narts_wrt_opencyc_until_quiescence() {
        SubLObject passes = (SubLObject)kbs_cleanup.ZERO_INTEGER;
        for (SubLObject count = (SubLObject)kbs_cleanup.ONE_INTEGER; count.numG((SubLObject)kbs_cleanup.ZERO_INTEGER); count = forget_useless_narts_wrt_opencyc()) {
            passes = Numbers.add(passes, (SubLObject)kbs_cleanup.ONE_INTEGER);
        }
        return passes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 9139L)
    public static SubLObject forget_useless_narts_wrt_opencyc() {
        return kb_cleanup.forget_narts(gather_useless_narts_wrt_opencyc(), (SubLObject)kbs_cleanup.$str59$Forgetting_useless_NARTs_wrt_Open);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 9294L)
    public static SubLObject gather_useless_narts_wrt_opencyc() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject useless_narts = (SubLObject)kbs_cleanup.NIL;
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = (SubLObject)kbs_cleanup.$str60$Gathering_useless_NARTs_wrt_OpenC;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kbs_cleanup.ZERO_INTEGER;
        assert kbs_cleanup.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_cleanup.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_cleanup.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_cleanup.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$102 = idx;
                if (kbs_cleanup.NIL == id_index.id_index_objects_empty_p(idx_$102, (SubLObject)kbs_cleanup.$kw4$SKIP)) {
                    final SubLObject idx_$103 = idx_$102;
                    if (kbs_cleanup.NIL == id_index.id_index_dense_objects_empty_p(idx_$103, (SubLObject)kbs_cleanup.$kw4$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$103);
                        final SubLObject backwardP_var = (SubLObject)kbs_cleanup.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject nart;
                        SubLObject ignore_errors_tag;
                        SubLObject _prev_bind_0_$104;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kbs_cleanup.NIL, v_iteration = (SubLObject)kbs_cleanup.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kbs_cleanup.ONE_INTEGER)) {
                            id = ((kbs_cleanup.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kbs_cleanup.ONE_INTEGER) : v_iteration);
                            nart = Vectors.aref(vector_var, id);
                            if (kbs_cleanup.NIL == id_index.id_index_tombstone_p(nart) || kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) {
                                if (kbs_cleanup.NIL != id_index.id_index_tombstone_p(nart)) {
                                    nart = (SubLObject)kbs_cleanup.$kw4$SKIP;
                                }
                                ignore_errors_tag = (SubLObject)kbs_cleanup.NIL;
                                try {
                                    thread.throwStack.push(kbs_cleanup.$kw13$IGNORE_ERRORS_TARGET);
                                    _prev_bind_0_$104 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)kbs_cleanup.$sym14$IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            if (kbs_cleanup.NIL == useful_nart_wrt_opencycP(nart)) {
                                                useless_narts = (SubLObject)ConsesLow.cons(nart, useless_narts);
                                            }
                                        }
                                        catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, (SubLObject)kbs_cleanup.NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$104, thread);
                                    }
                                }
                                catch (Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)kbs_cleanup.$kw13$IGNORE_ERRORS_TARGET);
                                }
                                finally {
                                    thread.throwStack.pop();
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$104 = idx_$102;
                    if (kbs_cleanup.NIL == id_index.id_index_sparse_objects_empty_p(idx_$104) || kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$104);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$104);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$104);
                        final SubLObject v_default = (SubLObject)((kbs_cleanup.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP)) ? kbs_cleanup.NIL : kbs_cleanup.$kw4$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject nart2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (kbs_cleanup.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_cleanup.$kw4$SKIP) || kbs_cleanup.NIL == id_index.id_index_tombstone_p(nart2)) {
                                SubLObject ignore_errors_tag2 = (SubLObject)kbs_cleanup.NIL;
                                try {
                                    thread.throwStack.push(kbs_cleanup.$kw13$IGNORE_ERRORS_TARGET);
                                    final SubLObject _prev_bind_0_$105 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)kbs_cleanup.$sym14$IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            if (kbs_cleanup.NIL == useful_nart_wrt_opencycP(nart2)) {
                                                useless_narts = (SubLObject)ConsesLow.cons(nart2, useless_narts);
                                            }
                                        }
                                        catch (Throwable catch_var2) {
                                            Errors.handleThrowable(catch_var2, (SubLObject)kbs_cleanup.NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$105, thread);
                                    }
                                }
                                catch (Throwable ccatch_env_var2) {
                                    ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, (SubLObject)kbs_cleanup.$kw13$IGNORE_ERRORS_TARGET);
                                }
                                finally {
                                    thread.throwStack.pop();
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kbs_cleanup.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)kbs_cleanup.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$106 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_cleanup.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$106, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(useless_narts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 9685L)
    public static SubLObject useful_nart_wrt_opencycP(final SubLObject nart) {
        assert kbs_cleanup.NIL != nart_handles.nart_p(nart) : nart;
        final SubLObject independent_assertions = narts_high.nart_independent_assertions(nart);
        SubLObject usefulP = (SubLObject)kbs_cleanup.NIL;
        if (kbs_cleanup.NIL == usefulP) {
            SubLObject csome_list_var = independent_assertions;
            SubLObject candidate = (SubLObject)kbs_cleanup.NIL;
            candidate = csome_list_var.first();
            while (kbs_cleanup.NIL == usefulP && kbs_cleanup.NIL != csome_list_var) {
                if (kbs_cleanup.NIL != useful_nart_assertion_wrt_opencycP(candidate)) {
                    usefulP = candidate;
                }
                csome_list_var = csome_list_var.rest();
                candidate = csome_list_var.first();
            }
        }
        return usefulP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-cleanup.lisp", position = 10209L)
    public static SubLObject useful_nart_assertion_wrt_opencycP(final SubLObject assertion) {
        assert kbs_cleanup.NIL != assertion_handles.assertion_p(assertion) : assertion;
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_cleanup.NIL != assertions_high.rule_assertionP(assertion) || kbs_cleanup.NIL == list_utilities.member_eqP(assertions_high.gaf_predicate(assertion), kbs_cleanup.$uninteresting_nart_predicates_wrt_opencyc$.getGlobalValue()));
    }
    
    public static SubLObject declare_kbs_cleanup_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "kbs_cleanup", "KBS-CLEANUP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "clean_invalid_bookkeeping_info", "CLEAN-INVALID-BOOKKEEPING-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "fix_invalid_deductions", "FIX-INVALID-DEDUCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "remove_invalid_deduction", "REMOVE-INVALID-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "kbs_clear_extent", "KBS-CLEAR-EXTENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "kill_empty_kbs_terms", "KILL-EMPTY-KBS-TERMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "kill_naked_prototypicals", "KILL-NAKED-PROTOTYPICALS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "kill_empty_skolems", "KILL-EMPTY-SKOLEMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "remove_bad_term_of_unit_assertions", "REMOVE-BAD-TERM-OF-UNIT-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "kill_sparse_narts", "KILL-SPARSE-NARTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "fix_reconsider_tms", "FIX-RECONSIDER-TMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "fix_remove_redundant_arguments", "FIX-REMOVE-REDUNDANT-ARGUMENTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "kbs_kill_unrunnable_kb_queries", "KBS-KILL-UNRUNNABLE-KB-QUERIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "forget_useless_narts_wrt_opencyc_until_quiescence", "FORGET-USELESS-NARTS-WRT-OPENCYC-UNTIL-QUIESCENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "forget_useless_narts_wrt_opencyc", "FORGET-USELESS-NARTS-WRT-OPENCYC", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "gather_useless_narts_wrt_opencyc", "GATHER-USELESS-NARTS-WRT-OPENCYC", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "useful_nart_wrt_opencycP", "USEFUL-NART-WRT-OPENCYC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_cleanup", "useful_nart_assertion_wrt_opencycP", "USEFUL-NART-ASSERTION-WRT-OPENCYC?", 1, 0, false);
        return (SubLObject)kbs_cleanup.NIL;
    }
    
    public static SubLObject init_kbs_cleanup_file() {
        kbs_cleanup.$kbs_clear_extent$ = SubLFiles.defvar("*KBS-CLEAR-EXTENT*", (SubLObject)kbs_cleanup.$list0);
        kbs_cleanup.$show_kbs_cleanup_warningsP$ = SubLFiles.defparameter("*SHOW-KBS-CLEANUP-WARNINGS?*", (SubLObject)kbs_cleanup.NIL);
        kbs_cleanup.$sparse_nart_preds$ = SubLFiles.defparameter("*SPARSE-NART-PREDS*", (SubLObject)kbs_cleanup.$list30);
        kbs_cleanup.$uninteresting_nart_predicates_wrt_opencyc$ = SubLFiles.deflexical("*UNINTERESTING-NART-PREDICATES-WRT-OPENCYC*", (SubLObject)kbs_cleanup.$list62);
        return (SubLObject)kbs_cleanup.NIL;
    }
    
    public static SubLObject setup_kbs_cleanup_file() {
        return (SubLObject)kbs_cleanup.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_kbs_cleanup_file();
    }
    
    @Override
	public void initializeVariables() {
        init_kbs_cleanup_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_kbs_cleanup_file();
    }
    
    static {
        me = (SubLFile)new kbs_cleanup();
        kbs_cleanup.$kbs_clear_extent$ = null;
        kbs_cleanup.$show_kbs_cleanup_warningsP$ = null;
        kbs_cleanup.$sparse_nart_preds$ = null;
        kbs_cleanup.$uninteresting_nart_predicates_wrt_opencyc$ = null;
        $list0 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclistNotes")));
        $str1$opencyc = SubLObjectFactory.makeString("opencyc");
        $str2$Clearing_invalid_bookkeeping_asse = SubLObjectFactory.makeString("Clearing invalid bookkeeping assertions");
        $sym3$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw4$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $const5$myCreator = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreator"));
        $const6$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $const7$myCreationPurpose = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationPurpose"));
        $str8$Fixing_invalid_deductions = SubLObjectFactory.makeString("Fixing invalid deductions");
        $str9$invalid_deduction___S = SubLObjectFactory.makeString("invalid deduction: ~S");
        $sym10$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $str11$clearing_extent_of__S = SubLObjectFactory.makeString("clearing extent of ~S");
        $kw12$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw13$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym14$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str15$Killing_terms_without_isa_asserti = SubLObjectFactory.makeString("Killing terms without isa assertions (this message will appear twice (constants then NARTs))");
        $const16$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $str17$Killing__S___S_ = SubLObjectFactory.makeString("Killing ~S (~S)");
        $sym18$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const19$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const20$HLPrototypicalTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HLPrototypicalTerm"));
        $str21$Killing_naked_prototypicals = SubLObjectFactory.makeString("Killing naked prototypicals");
        $str22$cdolist = SubLObjectFactory.makeString("cdolist");
        $const23$hlPrototypicalInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hlPrototypicalInstance"));
        $str24$Killing__S = SubLObjectFactory.makeString("Killing ~S");
        $const25$SkolemFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkolemFunction"));
        $str26$Killing_empty_skolems = SubLObjectFactory.makeString("Killing empty skolems");
        $str27$Removing_bad___termOfUnit_asserti = SubLObjectFactory.makeString("Removing bad #$termOfUnit assertions...");
        $const28$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $str29$Removing__A = SubLObjectFactory.makeString("Removing ~A");
        $list30 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")));
        $str31$Killing_NARTs_with_only_definitio = SubLObjectFactory.makeString("Killing NARTs with only definitional info");
        $str32$Keeping__S___S_ = SubLObjectFactory.makeString("Keeping ~S (~S)");
        $str33$Removing_invalid_arguments = SubLObjectFactory.makeString("Removing invalid arguments");
        $str34$Assertion__S_removed_ = SubLObjectFactory.makeString("Assertion ~S removed!");
        $str35$Removing_redundant_true_asserted_ = SubLObjectFactory.makeString("Removing redundant true asserted arguments");
        $kw36$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw37$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $sym38$ARGUMENT_TRUTH = SubLObjectFactory.makeSymbol("ARGUMENT-TRUTH");
        $str39$Assertion_removed_ = SubLObjectFactory.makeString("Assertion removed!");
        $str40$Removing_invalid_KB_queries = SubLObjectFactory.makeString("Removing invalid KB queries");
        $const41$KBContentTest_FullySpecified = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KBContentTest-FullySpecified"));
        $kw42$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw43$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw44$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym45$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw46$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str47$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym48$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw49$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str50$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw51$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str52$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str53$Killing_query__A_because_it_has_n = SubLObjectFactory.makeString("Killing query ~A because it has no query specification.");
        $str54$Killing_invalid_query__A_because_ = SubLObjectFactory.makeString("Killing invalid query ~A because: ~A");
        $str55$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str56$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $str58$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $str59$Forgetting_useless_NARTs_wrt_Open = SubLObjectFactory.makeString("Forgetting useless NARTs wrt OpenCyc");
        $str60$Gathering_useless_NARTs_wrt_OpenC = SubLObjectFactory.makeString("Gathering useless NARTs wrt OpenCyc");
        $sym61$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $list62 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prettyString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prettyString-Canonical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa")));
        $sym63$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
    }
}

/*

	Total time: 2055 ms
	
*/