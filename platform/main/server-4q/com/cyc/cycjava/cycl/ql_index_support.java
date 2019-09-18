package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cfasl.cfasl_encode_externalized;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backslash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_vertical;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.kill_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.make_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_active_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.valid_process_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.processp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class ql_index_support extends SubLTranslatedFile {
    public static final SubLFile me = new ql_index_support();

    public static final String myName = "com.cyc.cycjava.cycl.ql_index_support";

    public static final String myFingerPrint = "61791dd6e7e97992bbe084333d1a4869137423d15f3c4d6f9b0b3d4e91ebd4cc";

    // defconstant
    private static final SubLSymbol $ql_index_sc_index$ = makeSymbol("*QL-INDEX-SC-INDEX*");

    // defconstant
    private static final SubLSymbol $ql_index_sc_input$ = makeSymbol("*QL-INDEX-SC-INPUT*");

    // defconstant
    private static final SubLSymbol $ql_index_sc_segments$ = makeSymbol("*QL-INDEX-SC-SEGMENTS*");

    // defconstant
    private static final SubLSymbol $ql_index_sc_xml$ = makeSymbol("*QL-INDEX-SC-XML*");

    // defconstant
    /**
     * The string constant denoting the permission setting for the standard input
     * file used to build the QL index for each new KB.
     */
    private static final SubLSymbol $ql_index_sc_file_permission$ = makeSymbol("*QL-INDEX-SC-FILE-PERMISSION*");

    // defconstant
    /**
     * The string constant denoting the from address to be used when sending QL
     * index email error reports.
     */
    private static final SubLSymbol $ql_index_sc_from_address$ = makeSymbol("*QL-INDEX-SC-FROM-ADDRESS*");

    // defconstant
    /**
     * The string constant denoting the destination address to be used when sending
     * QL index email error reports.
     */
    private static final SubLSymbol $ql_index_sc_to_address$ = makeSymbol("*QL-INDEX-SC-TO-ADDRESS*");

    // defvar
    // If not NIL, enables verbose ouput for debugging
    private static final SubLSymbol $ql_index_support_verbose$ = makeSymbol("*QL-INDEX-SUPPORT-VERBOSE*");















    // Internal Constants
    public static final SubLString $$$index = makeString("index");

    public static final SubLString $$$input = makeString("input");

    public static final SubLString $$$segments = makeString("segments");

    public static final SubLString $$$xml = makeString("xml");

    public static final SubLString $$$777 = makeString("777");

    public static final SubLString $str5$ql_qa_cyc_com = makeString("ql-qa@cyc.com");

    public static final SubLString $str6$nsiegel_cyc_com = makeString("nsiegel@cyc.com");

    public static final SubLList $list7 = list(makeString("application.cyc-ir.lucene.ql-index.threshold"));

    public static final SubLSymbol $ql_index_threshold$ = makeSymbol("*QL-INDEX-THRESHOLD*");

    public static final SubLString $$$3380 = makeString("3380");



    private static final SubLFloat $float$0_3 = makeDouble(0.3);

    public static final SubLList $list12 = list(makeString("application.cyc-ir.lucene.ql-index.distance"));

    public static final SubLSymbol $ql_index_distance$ = makeSymbol("*QL-INDEX-DISTANCE*");

    public static final SubLString $$$3381 = makeString("3381");

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLSymbol INDEX_QUERIES_FROM_NODE = makeSymbol("INDEX-QUERIES-FROM-NODE");













    public static final SubLString $str23$___add_template_with_formula_and_ = makeString("~%(add-template-with-formula-and-gloss ~a ~a ~s) => ~a");

    public static final SubLSymbol INDEXED_QUERIES_FROM_STRING = makeSymbol("INDEXED-QUERIES-FROM-STRING");

    public static final SubLSymbol EXTRACT_CYCL_TERM_FROM_PLIST = makeSymbol("EXTRACT-CYCL-TERM-FROM-PLIST");



    public static final SubLList $list27 = list(makeSymbol("ID-STRING"), makeSymbol("SCORE"));



    public static final SubLSymbol GET_OBJECT_BY_HL_ID_STRING = makeSymbol("GET-OBJECT-BY-HL-ID-STRING");

    public static final SubLSymbol $get_object_by_hl_id_string_caching_state$ = makeSymbol("*GET-OBJECT-BY-HL-ID-STRING-CACHING-STATE*");

    private static final SubLInteger $int$5000 = makeInteger(5000);

    private static final SubLObject $$FormulaTemplate = reader_make_constant_shell(makeString("FormulaTemplate"));



    private static final SubLString $str34$Collecting_all_instances_of__S = makeString("Collecting all instances of ~S");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLString $str37$___a_template_a_collected = makeString("~%~a template~a collected");

    private static final SubLString $str38$ = makeString("");

    private static final SubLString $$$s = makeString("s");





    private static final SubLString $str42$__QL_Index___s = makeString("~%QL Index: ~s");

    private static final SubLString $str43$__Enter___process_ql_index_queue_ = makeString("~%Enter: (process-ql-index-queue-entries-int ~s ~s)");



    private static final SubLString $str45$__Exit___process_ql_index_queue_e = makeString("~%Exit: (process-ql-index-queue-entries-int ~s ~s) => ~a");

    private static final SubLSymbol $ql_index_update_procedure$ = makeSymbol("*QL-INDEX-UPDATE-PROCEDURE*");

    private static final SubLSymbol ENQUEUE_FOR_QL_INDEXING = makeSymbol("ENQUEUE-FOR-QL-INDEXING");

    private static final SubLString $str48$___maybe_update_ql_index__a__a_ = makeString("~%(maybe-update-ql-index ~a ~a)");

    private static final SubLString $str49$___maybe_update_ql_index__a__a___ = makeString("~%(maybe-update-ql-index ~a ~a) : ~a");

    private static final SubLSymbol $ql_index_update_queue$ = makeSymbol("*QL-INDEX-UPDATE-QUEUE*");

    private static final SubLString $str51$ql_index = makeString("ql-index");

    private static final SubLSymbol $ql_index_dequeue_procedure$ = makeSymbol("*QL-INDEX-DEQUEUE-PROCEDURE*");

    private static final SubLSymbol PROCESS_QL_INDEX_QUEUE_ENTRIES = makeSymbol("PROCESS-QL-INDEX-QUEUE-ENTRIES");

    private static final SubLSymbol $ql_index_update_process$ = makeSymbol("*QL-INDEX-UPDATE-PROCESS*");

    private static final SubLString $str55$The_process_object_responsible_fo = makeString("The process object responsible for unloading the \n   update queue for the QL Index Server index.");

    private static final SubLString $$$Update_QL_Index = makeString("Update QL Index");



    private static final SubLString $str58$Unable_to_open__S = makeString("Unable to open ~S");







    private static final SubLInteger $int$200 = makeInteger(200);

    public static final SubLString $str63$___A_template_forms_written_to__S = makeString("~%~A template forms written to ~S");

    public static final SubLString $str64$___s = makeString("~%~s");

    private static final SubLObject $$formulaTemplateGloss = reader_make_constant_shell(makeString("formulaTemplateGloss"));

    private static final SubLObject $const66$querySpecificationForFormulaTempl = reader_make_constant_shell(makeString("querySpecificationForFormulaTemplate"));















    public static final SubLSymbol NON_EMPTY_STRING_P = makeSymbol("NON-EMPTY-STRING-P");

    public static final SubLList $list75 = list(CHAR_vertical, CHAR_slash, CHAR_colon, CHAR_backslash);

    public static SubLObject get_ql_index_threshold() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject val = kb_utilities.find_object_by_hl_external_id_string($ql_index_threshold$.getDynamicValue(thread));
        if (((!val.isNumber()) || (!val.numGE(ZERO_INTEGER))) || (!val.numLE(ONE_INTEGER))) {
            val = $float$0_3;
            $ql_index_threshold$.setDynamicValue(kb_utilities.hl_external_id_string(val), thread);
        }
        return val;
    }

    public static SubLObject set_ql_index_threshold(final SubLObject n) {
        if (n.numGE(ZERO_INTEGER) && n.numLE(ONE_INTEGER)) {
            $ql_index_threshold$.setDynamicValue(kb_utilities.hl_external_id_string(n));
        }
        return get_ql_index_threshold();
    }

    public static SubLObject get_ql_index_distance() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject val = kb_utilities.find_object_by_hl_external_id_string($ql_index_distance$.getDynamicValue(thread));
        if ((!val.numGE(ZERO_INTEGER)) || (!val.numLE(ONE_INTEGER))) {
            val = $float$0_5;
            $ql_index_distance$.setDynamicValue(kb_utilities.hl_external_id_string(val), thread);
        }
        return val;
    }

    public static SubLObject set_ql_index_distance(final SubLObject n) {
        if (n.numGE(ZERO_INTEGER) && n.numLE(ONE_INTEGER)) {
            $ql_index_distance$.setDynamicValue(kb_utilities.hl_external_id_string(n));
        }
        return get_ql_index_distance();
    }

    public static SubLObject get_ql_index_input_file_base_name() {
        return lucene_index.$ql_index_sc_query_index_forms$.getGlobalValue();
    }

    public static SubLObject set_ql_index_support_verbose(SubLObject boolean_value) {
        if (boolean_value == UNPROVIDED) {
            boolean_value = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        $ql_index_support_verbose$.setDynamicValue(boolean_value, thread);
        return $ql_index_support_verbose$.getDynamicValue(thread);
    }

    public static SubLObject get_ql_index_support_verbose() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ql_index_support_verbose$.getDynamicValue(thread);
    }

    public static SubLObject index_queries_from_node(final SubLObject root_node) {
        if (NIL != inverted_index_query_library.get_ql_build_index_in_memory()) {
            return inverted_index_query_library.index_queries_from_node_in_memory(root_node);
        }
        return $INDEXED;
    }

    public static SubLObject add_template_with_formula_and_gloss(final SubLObject template, final SubLObject formula, final SubLObject gloss) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = $INDEX_UNINITIALIZED;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$1 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$2 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$3 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    if (NIL != inverted_index_query_library.get_ql_build_index_in_memory()) {
                                        SubLObject fm = formula;
                                        SubLObject gl = gloss;
                                        if ((NIL == fm) || (NIL == gl)) {
                                            final SubLObject v_encapsulation = encapsulate_query_template(template, formula, gloss);
                                            fm = getf(v_encapsulation, $CYCL, NIL);
                                            gl = getf(v_encapsulation, $GLOSS, NIL);
                                        }
                                        result = inverted_index_query_library.add_template_with_formula_and_gloss_in_memory(template, fm, gl);
                                    } else {
                                        start_ql_index_update_thread(UNPROVIDED);
                                        final SubLObject v_answer = maybe_update_ql_index(encapsulate_query_template(template, formula, gloss), UNPROVIDED);
                                        if (v_answer != $ERROR) {
                                            result = $INDEXED;
                                        }
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$4, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$3, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        if (NIL != get_ql_index_support_verbose()) {
            format(T, $str23$___add_template_with_formula_and_, new SubLObject[]{ template, formula, gloss, result });
        }
        return result;
    }

    public static SubLObject indexed_queries_from_string(final SubLObject string) {
        if (NIL != inverted_index_query_library.get_ql_build_index_in_memory()) {
            return inverted_index_query_library.indexed_queries_from_string_in_memory(string);
        }
        return Mapping.mapcar(EXTRACT_CYCL_TERM_FROM_PLIST, cae_query_search.indexed_queries_from_string_with_confidences(string, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject old_indexed_queries_from_string_with_confidences(final SubLObject string, SubLObject threshold, SubLObject distance) {
        if (threshold == UNPROVIDED) {
            threshold = get_ql_index_threshold();
        }
        if (distance == UNPROVIDED) {
            distance = get_ql_index_distance();
        }
        assert NIL != numberp(threshold) : "Types.numberp(threshold) " + "CommonSymbols.NIL != Types.numberp(threshold) " + threshold;
        assert NIL != numberp(distance) : "Types.numberp(distance) " + "CommonSymbols.NIL != Types.numberp(distance) " + distance;
        SubLObject result = NIL;
        if (NIL != inverted_index_query_library.ql_ir_search_allowedP()) {
            if (NIL != inverted_index_query_library.get_ql_build_index_in_memory()) {
                result = inverted_index_query_library.indexed_queries_from_string_with_confidences_in_memory(string);
            } else {
                final SubLObject found = lucene_index.ql_index_find_queries(kb_loaded(), string, UNPROVIDED, UNPROVIDED);
                SubLObject max = ZERO_INTEGER;
                SubLObject tmp = NIL;
                if (NIL != list_utilities.non_empty_list_p(found)) {
                    SubLObject cdolist_list_var = found;
                    SubLObject pair = NIL;
                    pair = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = pair;
                        SubLObject id_string = NIL;
                        SubLObject score = NIL;
                        destructuring_bind_must_consp(current, datum, $list27);
                        id_string = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list27);
                        score = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            final SubLObject v_term = get_object_by_hl_id_string(id_string);
                            if (((NIL != v_term) && score.isNumber()) && score.numGE(threshold)) {
                                tmp = cons(query_library_utils.new_ql_parse(v_term, score, UNPROVIDED), tmp);
                                if (score.numG(max)) {
                                    max = score;
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list27);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        pair = cdolist_list_var.first();
                    } 
                    if (max.numG(ZERO_INTEGER) && max.numGE(threshold)) {
                        cdolist_list_var = tmp;
                        SubLObject obj = NIL;
                        obj = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject score2 = getf(obj, $WEIGHT, UNPROVIDED);
                            if (score2.numG(ZERO_INTEGER) && divide(score2, max).numLE(distance)) {
                                result = cons(obj, result);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            obj = cdolist_list_var.first();
                        } 
                    }
                }
            }
        }
        return result;
    }

    public static SubLObject clear_get_object_by_hl_id_string() {
        final SubLObject cs = $get_object_by_hl_id_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_object_by_hl_id_string(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args($get_object_by_hl_id_string_caching_state$.getGlobalValue(), list(string), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_object_by_hl_id_string_internal(final SubLObject string) {
        return string.isString() ? kb_utilities.find_object_by_hl_external_id_string(string) : NIL;
    }

    public static SubLObject get_object_by_hl_id_string(final SubLObject string) {
        SubLObject caching_state = $get_object_by_hl_id_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_OBJECT_BY_HL_ID_STRING, $get_object_by_hl_id_string_caching_state$, $int$5000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_object_by_hl_id_string_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject build_query_template_index(SubLObject kb, SubLObject collection, SubLObject verbose) {
        if (kb == UNPROVIDED) {
            kb = kb_loaded();
        }
        if (collection == UNPROVIDED) {
            collection = $$FormulaTemplate;
        }
        if (verbose == UNPROVIDED) {
            verbose = get_ql_index_support_verbose();
        }
        SubLObject status = NIL;
        if (NIL != write_ql_index_input_file(NIL, kb, collection, verbose)) {
            final SubLObject index_dir = find_or_create_index_directory(kb, $INDEX);
            if (NIL != index_dir) {
                lucene_index.ql_index_build_from_file(kb, UNPROVIDED, UNPROVIDED);
                status = segments_file_exists_p(kb);
            }
        }
        return status;
    }

    public static SubLObject write_ql_index_input_file(SubLObject pathname, SubLObject kb, SubLObject collection, SubLObject verbose) {
        if (pathname == UNPROVIDED) {
            pathname = NIL;
        }
        if (kb == UNPROVIDED) {
            kb = kb_loaded();
        }
        if (collection == UNPROVIDED) {
            collection = $$FormulaTemplate;
        }
        if (verbose == UNPROVIDED) {
            verbose = get_ql_index_support_verbose();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject templates = NIL;
        SubLObject status = NIL;
        if (NIL != verbose) {
            format(T, $str34$Collecting_all_instances_of__S, collection);
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            templates = isa.all_fort_instances(collection, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != verbose) {
            final SubLObject tlen = length(templates);
            format(T, $str37$___a_template_a_collected, tlen, tlen.eql(ONE_INTEGER) ? $str38$ : $$$s);
        }
        if ((NIL != templates) && ((NIL != string_utilities.non_empty_string_p(pathname)) || (NIL != find_or_create_index_directory(kb, $INDEX)))) {
            final SubLObject file_pathname = (NIL != pathname) ? pathname : get_ql_index_input_file_pathname(kb);
            if (NIL != string_utilities.non_empty_string_p(file_pathname)) {
                write_template_index_source_file(templates, file_pathname, kb, UNPROVIDED);
                status = list_utilities.sublisp_boolean(Filesys.probe_file(file_pathname));
            }
        }
        return status;
    }

    public static SubLObject process_ql_index_queue_entries() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject queue = get_ql_index_update_queue();
        final SubLObject htbl = make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED);
        SubLObject error = NIL;
        if (NIL != process_utilities.ipc_queue_p(queue)) {
            final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
            try {
                pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$7 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                try {
                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                    final SubLObject reuseP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$8 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                            final SubLObject new_or_reused = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$9 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                            try {
                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                final SubLObject _prev_bind_0_$10 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                    try {
                                        while (true) {
                                            try {
                                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                                final SubLObject _prev_bind_0_$11 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                    try {
                                                        final SubLObject entry = process_utilities.ipc_dequeue(queue, UNPROVIDED);
                                                        if (NIL != entry) {
                                                            process_ql_index_queue_entries_int(list(entry), htbl);
                                                        }
                                                    } catch (final Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, NIL);
                                                    }
                                                } finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_0_$11, thread);
                                                }
                                            } catch (final Throwable ccatch_env_var) {
                                                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                            } finally {
                                                thread.throwStack.pop();
                                            }
                                            if (NIL != error) {
                                                format(T, $str42$__QL_Index___s, error);
                                                error = NIL;
                                            }
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$10, thread);
                                }
                            } finally {
                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$9, thread);
                            }
                        } finally {
                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$8, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (NIL == reuseP) {
                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                } finally {
                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$7, thread);
                }
            } finally {
                pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject process_ql_index_queue_entries_int(final SubLObject entries, SubLObject hashtable) {
        if (hashtable == UNPROVIDED) {
            hashtable = NIL;
        }
        if (NIL != get_ql_index_support_verbose()) {
            format(T, $str43$__Enter___process_ql_index_queue_, entries, hashtable);
        }
        SubLObject encapsulated_templates = NIL;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != ke_interaction_folder.cycl_formula_templateP(entry)) {
                encapsulated_templates = cons(encapsulate_query_template(entry, UNPROVIDED, UNPROVIDED), encapsulated_templates);
            } else
                if (NIL != list_utilities.property_list_p(entry)) {
                    encapsulated_templates = cons(entry, encapsulated_templates);
                }

            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        if (NIL != encapsulated_templates) {
            if (NIL != inverted_index_query_library.get_ql_build_index_in_memory()) {
                cdolist_list_var = encapsulated_templates;
                SubLObject v_encapsulation = NIL;
                v_encapsulation = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject v_term = getf(v_encapsulation, $TERM, UNPROVIDED);
                    final SubLObject formula = getf(v_encapsulation, $CYCL, UNPROVIDED);
                    final SubLObject gloss = getf(v_encapsulation, $GLOSS, UNPROVIDED);
                    result = inverted_index_query_library.add_template_with_formula_and_gloss_in_memory(v_term, formula, gloss);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_encapsulation = cdolist_list_var.first();
                } 
            } else {
                result = lucene_index.ql_index_add_queries(encapsulated_templates, UNPROVIDED, UNPROVIDED);
            }
        }
        if (NIL != get_ql_index_support_verbose()) {
            format(T, $str45$__Exit___process_ql_index_queue_e, new SubLObject[]{ entries, hashtable, result });
        }
        return result;
    }

    public static SubLObject get_adler_checksum(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject bv = cfasl_encode_externalized(obj);
        SubLObject checksum = NIL;
        final SubLObject _prev_bind_0 = number_utilities.$checksum_sum$.currentBinding(thread);
        final SubLObject _prev_bind_2 = number_utilities.$checksum_length$.currentBinding(thread);
        try {
            number_utilities.$checksum_sum$.bind(number_utilities.$checksum_initial_value_sum$.getGlobalValue(), thread);
            number_utilities.$checksum_length$.bind(number_utilities.$checksum_initial_value_length$.getGlobalValue(), thread);
            final SubLObject vector_var = bv;
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject v_byte;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                v_byte = aref(vector_var, element_num);
                number_utilities.checksum_update(v_byte);
            }
            checksum = number_utilities.checksum_finalize();
        } finally {
            number_utilities.$checksum_length$.rebind(_prev_bind_2, thread);
            number_utilities.$checksum_sum$.rebind(_prev_bind_0, thread);
        }
        return checksum;
    }

    public static SubLObject get_ql_index_update_procedure() {
        return $ql_index_update_procedure$.getGlobalValue();
    }

    public static SubLObject set_ql_index_update_procedure(final SubLObject fsym) {
        $ql_index_update_procedure$.setGlobalValue(fsym);
        return $ql_index_update_procedure$.getGlobalValue();
    }

    public static SubLObject maybe_update_ql_index(final SubLObject obj, SubLObject fsym) {
        if (fsym == UNPROVIDED) {
            fsym = get_ql_index_update_procedure();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(T, $str48$___maybe_update_ql_index__a__a_, obj, fsym);
        SubLObject result = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (NIL != fboundp(fsym)) {
                        result = apply(symbol_function(fsym), obj, NIL);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            format(T, $str49$___maybe_update_ql_index__a__a___, new SubLObject[]{ obj, fsym, error });
            result = $ERROR;
        }
        return result;
    }

    public static SubLObject enqueue_for_ql_indexing(final SubLObject obj) {
        return process_utilities.ipc_enqueue(obj, get_ql_index_update_queue(), UNPROVIDED);
    }

    public static SubLObject get_ql_index_update_queue() {
        if (NIL == process_utilities.ipc_queue_p($ql_index_update_queue$.getGlobalValue())) {
            $ql_index_update_queue$.setGlobalValue(process_utilities.new_ipc_queue($str51$ql_index));
        }
        return $ql_index_update_queue$.getGlobalValue();
    }

    public static SubLObject get_ql_index_dequeue_procedure() {
        return $ql_index_dequeue_procedure$.getGlobalValue();
    }

    public static SubLObject set_ql_index_dequeue_procedure(final SubLObject fsym) {
        $ql_index_dequeue_procedure$.setGlobalValue(fsym);
        return $ql_index_dequeue_procedure$.getGlobalValue();
    }

    public static SubLObject get_ql_index_update_process() {
        return $ql_index_update_process$.getGlobalValue();
    }

    public static SubLObject start_ql_index_update_thread(SubLObject fsym) {
        if (fsym == UNPROVIDED) {
            fsym = get_ql_index_dequeue_procedure();
        }
        final SubLObject ql_queue = get_ql_index_update_queue();
        if (((NIL != process_utilities.ipc_queue_p(ql_queue)) && (NIL != fboundp(fsym))) && (((NIL == processp($ql_index_update_process$.getGlobalValue())) || (NIL == valid_process_p($ql_index_update_process$.getGlobalValue()))) || (NIL == process_active_p($ql_index_update_process$.getGlobalValue())))) {
            if (NIL != processp($ql_index_update_process$.getGlobalValue())) {
                kill_process($ql_index_update_process$.getGlobalValue());
                $ql_index_update_process$.setGlobalValue(NIL);
            }
            $ql_index_update_process$.setGlobalValue(make_process($$$Update_QL_Index, symbol_function(fsym)));
        }
        return $ql_index_update_process$.getGlobalValue();
    }

    public static SubLObject initialize_ql_index_globals() {
        $ql_index_update_queue$.setGlobalValue(NIL);
        get_ql_index_update_queue();
        set_ql_index_update_procedure(ENQUEUE_FOR_QL_INDEXING);
        set_ql_index_dequeue_procedure(PROCESS_QL_INDEX_QUEUE_ENTRIES);
        if (NIL != processp($ql_index_update_process$.getGlobalValue())) {
            kill_process($ql_index_update_process$.getGlobalValue());
        }
        $ql_index_update_process$.setGlobalValue(NIL);
        return T;
    }

    public static SubLObject extract_cycl_term_from_plist(final SubLObject plist) {
        return getf(plist, $CYCL, UNPROVIDED);
    }

    public static SubLObject write_template_index_source_file(final SubLObject templates, final SubLObject pathname, SubLObject kb, SubLObject verbose) {
        if (kb == UNPROVIDED) {
            kb = kb_loaded();
        }
        if (verbose == UNPROVIDED) {
            verbose = get_ql_index_support_verbose();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
        if ((((NIL != list_utilities.non_empty_list_p(templates)) && (NIL != string_utilities.non_empty_string_p(pathname))) && (NIL != subl_promotions.positive_integer_p(kb))) && (NIL != obsolete.booleanP(verbose))) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(pathname, $OUTPUT);
                if (!stream.isStream()) {
                    Errors.error($str58$Unable_to_open__S, pathname);
                }
                final SubLObject out = stream;
                if (out.isStream()) {
                    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                    try {
                        xml_vars.$xml_stream$.bind(out, thread);
                        xml_utilities.xml_header(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        try {
                            final SubLObject _prev_bind_0_$14 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal(get_ql_index_input_file_base_name(), list(lucene_index.$ql_index_sc_kb$.getGlobalValue(), format_nil.format_nil_a(kb)), NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$16 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
                                    thread.resetMultipleValues();
                                    final SubLObject _prev_bind_0_$16 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                                        final SubLObject reuseP = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        try {
                                            thread.resetMultipleValues();
                                            final SubLObject _prev_bind_0_$17 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                            try {
                                                pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                                final SubLObject new_or_reused = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                final SubLObject _prev_bind_0_$18 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                try {
                                                    pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                    final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                    final SubLObject _prev_bind_0_$19 = memoization_state.$memoization_state$.currentBinding(thread);
                                                    try {
                                                        memoization_state.$memoization_state$.bind(local_state, thread);
                                                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                                        try {
                                                            SubLObject count = ZERO_INTEGER;
                                                            SubLObject cdolist_list_var = templates;
                                                            SubLObject template = NIL;
                                                            template = cdolist_list_var.first();
                                                            while (NIL != cdolist_list_var) {
                                                                try {
                                                                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                                                    final SubLObject _prev_bind_0_$20 = Errors.$error_handler$.currentBinding(thread);
                                                                    try {
                                                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                        try {
                                                                            final SubLObject wrapper = encapsulate_query_template(template, UNPROVIDED, UNPROVIDED);
                                                                            final SubLObject id_string = getf(wrapper, $ID, UNPROVIDED);
                                                                            final SubLObject cycl = getf(wrapper, $CYCL, UNPROVIDED);
                                                                            final SubLObject template_gloss = getf(wrapper, $GLOSS, UNPROVIDED);
                                                                            final SubLObject query_string = getf(wrapper, $GENERATION, UNPROVIDED);
                                                                            Label_2331 : {
                                                                                if ((NIL != string_utilities.non_empty_string_p(id_string)) && (NIL != cycl)) {
                                                                                    if (NIL == string_utilities.non_empty_string_p(template_gloss)) {
                                                                                        if (NIL == string_utilities.non_empty_string_p(query_string)) {
                                                                                            break Label_2331;
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        final SubLObject _prev_bind_0_$21 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                        final SubLObject _prev_bind_1_$17 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                        try {
                                                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                            xml_utilities.xml_start_tag_internal(lucene_index.$ql_index_sc_form$.getGlobalValue(), list(lucene_index.$ql_index_sc_id$.getGlobalValue(), id_string), NIL, NIL, $UNINITIALIZED);
                                                                                            final SubLObject _prev_bind_0_$22 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                            try {
                                                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                if (NIL != cycl) {
                                                                                                    try {
                                                                                                        final SubLObject _prev_bind_0_$23 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                        final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                        try {
                                                                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                            xml_utilities.xml_start_tag_internal(lucene_index.$ql_index_sc_cycl$.getGlobalValue(), NIL, NIL, NIL, $UNINITIALIZED);
                                                                                                            final SubLObject _prev_bind_0_$24 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                            try {
                                                                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                                xml_utilities.xml_cdata(format_nil.format_nil_a(cycl));
                                                                                                            } finally {
                                                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$24, thread);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$18, thread);
                                                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$23, thread);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                        try {
                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                            final SubLObject _values = getValuesAsVector();
                                                                                                            xml_utilities.xml_terpri();
                                                                                                            xml_utilities.xml_end_tag_internal(lucene_index.$ql_index_sc_cycl$.getGlobalValue());
                                                                                                            restoreValuesFromVector(_values);
                                                                                                        } finally {
                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (NIL != string_utilities.non_empty_string_p(template_gloss)) {
                                                                                                    try {
                                                                                                        final SubLObject _prev_bind_0_$26 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                        final SubLObject _prev_bind_1_$19 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                        try {
                                                                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                            xml_utilities.xml_start_tag_internal(lucene_index.$ql_index_sc_gloss$.getGlobalValue(), NIL, NIL, NIL, $UNINITIALIZED);
                                                                                                            final SubLObject _prev_bind_0_$27 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                            try {
                                                                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                                xml_utilities.xml_cdata(template_gloss);
                                                                                                            } finally {
                                                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$27, thread);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$19, thread);
                                                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$26, thread);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                        try {
                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                            final SubLObject _values2 = getValuesAsVector();
                                                                                                            xml_utilities.xml_terpri();
                                                                                                            xml_utilities.xml_end_tag_internal(lucene_index.$ql_index_sc_gloss$.getGlobalValue());
                                                                                                            restoreValuesFromVector(_values2);
                                                                                                        } finally {
                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (NIL != string_utilities.non_empty_string_p(query_string)) {
                                                                                                    try {
                                                                                                        final SubLObject _prev_bind_0_$29 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                                                                        final SubLObject _prev_bind_1_$20 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                                                                        try {
                                                                                                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                                                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                                                            xml_utilities.xml_start_tag_internal(lucene_index.$ql_index_sc_generation$.getGlobalValue(), NIL, NIL, NIL, $UNINITIALIZED);
                                                                                                            final SubLObject _prev_bind_0_$30 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                                                            try {
                                                                                                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                                                                                                xml_utilities.xml_cdata(query_string);
                                                                                                            } finally {
                                                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$30, thread);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$20, thread);
                                                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$29, thread);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                        try {
                                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                            final SubLObject _values3 = getValuesAsVector();
                                                                                                            xml_utilities.xml_terpri();
                                                                                                            xml_utilities.xml_end_tag_internal(lucene_index.$ql_index_sc_generation$.getGlobalValue());
                                                                                                            restoreValuesFromVector(_values3);
                                                                                                        } finally {
                                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$22, thread);
                                                                                            }
                                                                                        } finally {
                                                                                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$17, thread);
                                                                                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$21, thread);
                                                                                        }
                                                                                    } finally {
                                                                                        final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            final SubLObject _values4 = getValuesAsVector();
                                                                                            xml_utilities.xml_terpri();
                                                                                            xml_utilities.xml_end_tag_internal(lucene_index.$ql_index_sc_form$.getGlobalValue());
                                                                                            restoreValuesFromVector(_values4);
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                                                                                        }
                                                                                    }
                                                                                    count = add(count, ONE_INTEGER);
                                                                                    if ((NIL != verbose) && (count.eql(FIVE_INTEGER) || mod(count, $int$200).eql(ZERO_INTEGER))) {
                                                                                        format(T, $str63$___A_template_forms_written_to__S, count, pathname);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (final Throwable catch_var) {
                                                                            Errors.handleThrowable(catch_var, NIL);
                                                                        }
                                                                    } finally {
                                                                        Errors.$error_handler$.rebind(_prev_bind_0_$20, thread);
                                                                    }
                                                                } catch (final Throwable ccatch_env_var) {
                                                                    error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                                } finally {
                                                                    thread.throwStack.pop();
                                                                }
                                                                if (NIL != error) {
                                                                    if (NIL != verbose) {
                                                                        format(T, $str64$___s, error);
                                                                    }
                                                                    report_ql_indexing_error(template, error);
                                                                    error = NIL;
                                                                }
                                                                cdolist_list_var = cdolist_list_var.rest();
                                                                template = cdolist_list_var.first();
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values5 = getValuesAsVector();
                                                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                                restoreValuesFromVector(_values5);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$19, thread);
                                                    }
                                                } finally {
                                                    pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$18, thread);
                                                }
                                                if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                    memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$17, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values6 = getValuesAsVector();
                                                if (NIL == reuseP) {
                                                    pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                                }
                                                restoreValuesFromVector(_values6);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                            }
                                        }
                                    } finally {
                                        pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$16, thread);
                                    }
                                } finally {
                                    pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_1_$16, thread);
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$15, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$14, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values7 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal(get_ql_index_input_file_base_name());
                                restoreValuesFromVector(_values7);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                            }
                        }
                    } finally {
                        xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values8 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values8);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        }
        error = file_utilities.why_not_probe_fileP(pathname);
        if (NIL != error) {
            report_ql_indexing_error(pathname, error);
            error = NIL;
        }
        return NIL;
    }

    public static SubLObject encapsulate_query_template(final SubLObject template, SubLObject formula, SubLObject gloss) {
        if (formula == UNPROVIDED) {
            formula = NIL;
        }
        if (gloss == UNPROVIDED) {
            gloss = NIL;
        }
        final SubLObject id_string = kb_utilities.hl_external_id_string(template);
        final SubLObject template_gloss = (NIL != string_utilities.non_empty_string_p(gloss)) ? gloss : NIL != indexed_term_p(template) ? kb_mapping_utilities.fpred_value_in_any_mt(template, $$formulaTemplateGloss, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject query_spec = (NIL != indexed_term_p(template)) ? kb_mapping_utilities.fpred_value_in_any_mt(template, $const66$querySpecificationForFormulaTempl, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject query_cycl = (((NIL != cycl_grammar.cycl_term_p(formula)) && (!formula.isString())) && (!formula.isKeyword())) ? formula : NIL != indexed_term_p(query_spec) ? cycl_for_test_query_in_any_mt(query_spec) : NIL;
        final SubLObject query_string = (NIL != query_cycl) ? pph_question.generate_question(query_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        SubLObject v_encapsulation = NIL;
        if (NIL != string_utilities.non_empty_string_p(id_string)) {
            v_encapsulation = list($TERM, template);
            putf(v_encapsulation, $ID, id_string);
            if (NIL != query_cycl) {
                putf(v_encapsulation, $CYCL, query_cycl);
                if (NIL != string_utilities.non_empty_string_p(query_string)) {
                    putf(v_encapsulation, $GENERATION, query_string);
                }
                if (NIL != string_utilities.non_empty_string_p(template_gloss)) {
                    putf(v_encapsulation, $GLOSS, template_gloss);
                }
            }
            putf(v_encapsulation, $KB, kb_loaded());
            putf(v_encapsulation, $PROCESS, format_nil.format_nil_a(current_process()));
            putf(v_encapsulation, $HOST, Environment.get_machine_name(UNPROVIDED));
            putf(v_encapsulation, $USER, format_nil.format_nil_a(operation_communication.the_cyclist()));
            putf(v_encapsulation, $TIME, numeric_date_utilities.safe_timestring(get_universal_time()));
        }
        return v_encapsulation;
    }

    public static SubLObject get_ql_index_input_file_pathname(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = kb_loaded();
        }
        SubLObject subdir_path = NIL;
        SubLObject pathname = NIL;
        if (NIL != subl_promotions.positive_integer_p(kb)) {
            subdir_path = find_or_create_index_directory(kb, $ROOT);
            if (NIL != string_utilities.non_empty_string_p(subdir_path)) {
                pathname = subl_promotions.ensure_physical_pathname(file_utilities.relative_filename(subdir_path, get_ql_index_input_file_base_name(), $ql_index_sc_xml$.getGlobalValue()));
            }
        }
        return pathname;
    }

    public static SubLObject segments_file_exists_p(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = kb_loaded();
        }
        SubLObject ans = NIL;
        if (NIL != subl_promotions.positive_integer_p(kb)) {
            final SubLObject subdir_path = make_index_directory_path(kb, $INDEX);
            final SubLObject filename = subl_promotions.ensure_physical_pathname(file_utilities.relative_filename(subdir_path, $ql_index_sc_segments$.getGlobalValue(), NIL));
            ans = list_utilities.sublisp_boolean(Filesys.probe_file(filename));
        }
        return ans;
    }

    public static SubLObject find_ql_index_directory(SubLObject type) {
        if (type == UNPROVIDED) {
            type = $ROOT;
        }
        SubLObject kb = kb_loaded();
        SubLObject path_string = make_index_directory_path(kb, type);
        for (SubLObject v_tries = ZERO_INTEGER; v_tries.numL(TEN_INTEGER); v_tries = add(v_tries, ONE_INTEGER)) {
            if (NIL != Filesys.probe_file(path_string)) {
                return path_string;
            }
            kb = number_utilities.f_1_(kb);
            path_string = make_index_directory_path(kb, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject find_or_create_index_directory(final SubLObject kb, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $ROOT;
        }
        final SubLObject path_string = make_index_directory_path(kb, type);
        if (NIL != file_utilities.make_directory_recursive(path_string, T, $ql_index_sc_file_permission$.getGlobalValue())) {
            return subl_promotions.ensure_physical_pathname(path_string);
        }
        return NIL;
    }

    public static SubLObject make_index_directory_path(final SubLObject kb, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $ROOT;
        }
        final SubLObject dir_list = make_index_directory_list(kb, type);
        return subl_promotions.ensure_physical_pathname(file_utilities.cyc_home_subdirectory(dir_list));
    }

    public static SubLObject make_index_directory_list(final SubLObject kb, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $ROOT;
        }
        final SubLObject root_dir_list = append(get_ql_root_dir_list(), list(format_nil.format_nil_s(kb)));
        SubLObject sub_dir_list = NIL;
        final SubLObject pcase_var = type;
        if (pcase_var.eql($INPUT)) {
            sub_dir_list = list($ql_index_sc_input$.getGlobalValue());
        } else
            if (pcase_var.eql($INDEX)) {
                sub_dir_list = list($ql_index_sc_index$.getGlobalValue());
            }

        return append(root_dir_list, sub_dir_list);
    }

    public static SubLObject get_ql_root_dir_list() {
        return list_utilities.remove_if_not(NON_EMPTY_STRING_P, string_utilities.split_string(lucene_index.get_ql_index_root_dir_names(), $list75), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cycl_for_test_query_in_any_mt(final SubLObject test_query) {
        return kb_query.kbq_sentences(test_query).first();
    }

    public static SubLObject report_ql_indexing_error(final SubLObject v_object, final SubLObject error) {
        return NIL;
    }

    public static SubLObject declare_ql_index_support_file() {
        declareFunction(me, "get_ql_index_threshold", "GET-QL-INDEX-THRESHOLD", 0, 0, false);
        declareFunction(me, "set_ql_index_threshold", "SET-QL-INDEX-THRESHOLD", 1, 0, false);
        declareFunction(me, "get_ql_index_distance", "GET-QL-INDEX-DISTANCE", 0, 0, false);
        declareFunction(me, "set_ql_index_distance", "SET-QL-INDEX-DISTANCE", 1, 0, false);
        declareFunction(me, "get_ql_index_input_file_base_name", "GET-QL-INDEX-INPUT-FILE-BASE-NAME", 0, 0, false);
        declareFunction(me, "set_ql_index_support_verbose", "SET-QL-INDEX-SUPPORT-VERBOSE", 0, 1, false);
        declareFunction(me, "get_ql_index_support_verbose", "GET-QL-INDEX-SUPPORT-VERBOSE", 0, 0, false);
        declareFunction(me, "index_queries_from_node", "INDEX-QUERIES-FROM-NODE", 1, 0, false);
        declareFunction(me, "add_template_with_formula_and_gloss", "ADD-TEMPLATE-WITH-FORMULA-AND-GLOSS", 3, 0, false);
        declareFunction(me, "indexed_queries_from_string", "INDEXED-QUERIES-FROM-STRING", 1, 0, false);
        declareFunction(me, "old_indexed_queries_from_string_with_confidences", "OLD-INDEXED-QUERIES-FROM-STRING-WITH-CONFIDENCES", 1, 2, false);
        declareFunction(me, "clear_get_object_by_hl_id_string", "CLEAR-GET-OBJECT-BY-HL-ID-STRING", 0, 0, false);
        declareFunction(me, "remove_get_object_by_hl_id_string", "REMOVE-GET-OBJECT-BY-HL-ID-STRING", 1, 0, false);
        declareFunction(me, "get_object_by_hl_id_string_internal", "GET-OBJECT-BY-HL-ID-STRING-INTERNAL", 1, 0, false);
        declareFunction(me, "get_object_by_hl_id_string", "GET-OBJECT-BY-HL-ID-STRING", 1, 0, false);
        declareFunction(me, "build_query_template_index", "BUILD-QUERY-TEMPLATE-INDEX", 0, 3, false);
        declareFunction(me, "write_ql_index_input_file", "WRITE-QL-INDEX-INPUT-FILE", 0, 4, false);
        declareFunction(me, "process_ql_index_queue_entries", "PROCESS-QL-INDEX-QUEUE-ENTRIES", 0, 0, false);
        declareFunction(me, "process_ql_index_queue_entries_int", "PROCESS-QL-INDEX-QUEUE-ENTRIES-INT", 1, 1, false);
        declareFunction(me, "get_adler_checksum", "GET-ADLER-CHECKSUM", 1, 0, false);
        declareFunction(me, "get_ql_index_update_procedure", "GET-QL-INDEX-UPDATE-PROCEDURE", 0, 0, false);
        declareFunction(me, "set_ql_index_update_procedure", "SET-QL-INDEX-UPDATE-PROCEDURE", 1, 0, false);
        declareFunction(me, "maybe_update_ql_index", "MAYBE-UPDATE-QL-INDEX", 1, 1, false);
        declareFunction(me, "enqueue_for_ql_indexing", "ENQUEUE-FOR-QL-INDEXING", 1, 0, false);
        declareFunction(me, "get_ql_index_update_queue", "GET-QL-INDEX-UPDATE-QUEUE", 0, 0, false);
        declareFunction(me, "get_ql_index_dequeue_procedure", "GET-QL-INDEX-DEQUEUE-PROCEDURE", 0, 0, false);
        declareFunction(me, "set_ql_index_dequeue_procedure", "SET-QL-INDEX-DEQUEUE-PROCEDURE", 1, 0, false);
        declareFunction(me, "get_ql_index_update_process", "GET-QL-INDEX-UPDATE-PROCESS", 0, 0, false);
        declareFunction(me, "start_ql_index_update_thread", "START-QL-INDEX-UPDATE-THREAD", 0, 1, false);
        declareFunction(me, "initialize_ql_index_globals", "INITIALIZE-QL-INDEX-GLOBALS", 0, 0, false);
        declareFunction(me, "extract_cycl_term_from_plist", "EXTRACT-CYCL-TERM-FROM-PLIST", 1, 0, false);
        declareFunction(me, "write_template_index_source_file", "WRITE-TEMPLATE-INDEX-SOURCE-FILE", 2, 2, false);
        declareFunction(me, "encapsulate_query_template", "ENCAPSULATE-QUERY-TEMPLATE", 1, 2, false);
        declareFunction(me, "get_ql_index_input_file_pathname", "GET-QL-INDEX-INPUT-FILE-PATHNAME", 0, 1, false);
        declareFunction(me, "segments_file_exists_p", "SEGMENTS-FILE-EXISTS-P", 0, 1, false);
        declareFunction(me, "find_ql_index_directory", "FIND-QL-INDEX-DIRECTORY", 0, 1, false);
        declareFunction(me, "find_or_create_index_directory", "FIND-OR-CREATE-INDEX-DIRECTORY", 1, 1, false);
        declareFunction(me, "make_index_directory_path", "MAKE-INDEX-DIRECTORY-PATH", 1, 1, false);
        declareFunction(me, "make_index_directory_list", "MAKE-INDEX-DIRECTORY-LIST", 1, 1, false);
        declareFunction(me, "get_ql_root_dir_list", "GET-QL-ROOT-DIR-LIST", 0, 0, false);
        declareFunction(me, "cycl_for_test_query_in_any_mt", "CYCL-FOR-TEST-QUERY-IN-ANY-MT", 1, 0, false);
        declareFunction(me, "report_ql_indexing_error", "REPORT-QL-INDEXING-ERROR", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_ql_index_support_file() {
        defconstant("*QL-INDEX-SC-INDEX*", $$$index);
        defconstant("*QL-INDEX-SC-INPUT*", $$$input);
        defconstant("*QL-INDEX-SC-SEGMENTS*", $$$segments);
        defconstant("*QL-INDEX-SC-XML*", $$$xml);
        defconstant("*QL-INDEX-SC-FILE-PERMISSION*", $$$777);
        defconstant("*QL-INDEX-SC-FROM-ADDRESS*", $str5$ql_qa_cyc_com);
        defconstant("*QL-INDEX-SC-TO-ADDRESS*", $str6$nsiegel_cyc_com);
        defvar("*QL-INDEX-SUPPORT-VERBOSE*", NIL);
        defparameter("*QL-INDEX-THRESHOLD*", red_infrastructure_macros.red_def_helper($list7.isSymbol() ? symbol_value($list7) : $list7, $ql_index_threshold$, $$$3380.isSymbol() ? symbol_value($$$3380) : $$$3380, $PARAMETER, UNPROVIDED));
        defparameter("*QL-INDEX-DISTANCE*", red_infrastructure_macros.red_def_helper($list12.isSymbol() ? symbol_value($list12) : $list12, $ql_index_distance$, $$$3381.isSymbol() ? symbol_value($$$3381) : $$$3381, $PARAMETER, UNPROVIDED));
        deflexical("*GET-OBJECT-BY-HL-ID-STRING-CACHING-STATE*", NIL);
        deflexical("*QL-INDEX-UPDATE-PROCEDURE*", SubLSystemTrampolineFile.maybeDefault($ql_index_update_procedure$, $ql_index_update_procedure$, ENQUEUE_FOR_QL_INDEXING));
        deflexical("*QL-INDEX-UPDATE-QUEUE*", SubLSystemTrampolineFile.maybeDefault($ql_index_update_queue$, $ql_index_update_queue$, NIL));
        deflexical("*QL-INDEX-DEQUEUE-PROCEDURE*", SubLSystemTrampolineFile.maybeDefault($ql_index_dequeue_procedure$, $ql_index_dequeue_procedure$, PROCESS_QL_INDEX_QUEUE_ENTRIES));
        deflexical("*QL-INDEX-UPDATE-PROCESS*", SubLSystemTrampolineFile.maybeDefault($ql_index_update_process$, $ql_index_update_process$, $str55$The_process_object_responsible_fo));
        return NIL;
    }

    public static SubLObject setup_ql_index_support_file() {
        register_external_symbol(INDEX_QUERIES_FROM_NODE);
        register_external_symbol(INDEXED_QUERIES_FROM_STRING);
        memoization_state.note_globally_cached_function(GET_OBJECT_BY_HL_ID_STRING);
        declare_defglobal($ql_index_update_procedure$);
        declare_defglobal($ql_index_update_queue$);
        declare_defglobal($ql_index_dequeue_procedure$);
        declare_defglobal($ql_index_update_process$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ql_index_support_file();
    }

    @Override
    public void initializeVariables() {
        init_ql_index_support_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ql_index_support_file();
    }

    
}

/**
 * Total time: 1080 ms
 */
