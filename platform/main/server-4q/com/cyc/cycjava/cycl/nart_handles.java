package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.id_index.clear_id_index;
import static com.cyc.cycjava.cycl.id_index.clone_id_index;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_enter;
import static com.cyc.cycjava.cycl.id_index.id_index_lookup;
import static com.cyc.cycjava.cycl.id_index.id_index_missing_ids;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_old_and_new_object_counts;
import static com.cyc.cycjava.cycl.id_index.id_index_remove;
import static com.cyc.cycjava.cycl.id_index.id_index_reserve;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.id_index.new_id_index;
import static com.cyc.cycjava.cycl.id_index.new_id_index_iterator;
import static com.cyc.cycjava.cycl.id_index.new_id_index_ordered_iterator;
import static com.cyc.cycjava.cycl.id_index.new_indirect_compact_id_index;
import static com.cyc.cycjava.cycl.id_index.optimize_id_index;
import static com.cyc.cycjava.cycl.id_index.set_id_index_next_id;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.free_term_index;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.index_installed_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_macro;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.fixnump;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.arete;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class nart_handles extends SubLTranslatedFile {
    public static final SubLFile me = new nart_handles();

    public static final String myName = "com.cyc.cycjava.cycl.nart_handles";

    public static final String myFingerPrint = "cb10f8aa93201b067be365ac5c4f4ddc2bd9033a32509d1581c15e4b61e04464";





    // defconstant
    public static final SubLSymbol $dtp_nart$ = makeSymbol("*DTP-NART*");

    // Internal Constants
    public static final SubLSymbol $nart_from_id$ = makeSymbol("*NART-FROM-ID*");



    public static final SubLList $list2 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc NARTs")), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLString $$$mapping_Cyc_NARTs = makeString("mapping Cyc NARTs");

    public static final SubLList $list4 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    public static final SubLList $list8 = list(makeSymbol("DO-NARTS-TABLE"));



    public static final SubLSymbol DO_NARTS = makeSymbol("DO-NARTS");

    public static final SubLString $str11$Iterate_over_all_HL_NART_datastru = makeString("Iterate over all HL NART datastructures, executing BODY within the scope of VAR.\n   VAR is bound to the NART.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil.");

    public static final SubLSymbol DO_NARTS_TABLE = makeSymbol("DO-NARTS-TABLE");

    public static final SubLSymbol CREATE_NART_DUMP_ID_TABLE = makeSymbol("CREATE-NART-DUMP-ID-TABLE");

    public static final SubLSymbol WITH_NART_DUMP_ID_TABLE = makeSymbol("WITH-NART-DUMP-ID-TABLE");

    public static final SubLSymbol NART_COUNT = makeSymbol("NART-COUNT");

    public static final SubLString $str16$Return_the_total_number_of_NARTs_ = makeString("Return the total number of NARTs.");

    public static final SubLList $list17 = list(makeSymbol("INTEGERP"));

    private static final SubLSymbol $new_nart_id_threshold$ = makeSymbol("*NEW-NART-ID-THRESHOLD*");





    private static final SubLString $$$Determining_maximum_NART_ID = makeString("Determining maximum NART ID");





    private static final SubLList $list24 = list(list(makeSymbol("NART"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list25 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));

    private static final SubLSymbol $sym26$THRESHOLD = makeUninternedSymbol("THRESHOLD");



    private static final SubLList $list28 = list(list(makeSymbol("NEW-NART-ID-THRESHOLD")));

    private static final SubLSymbol DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID = makeSymbol("DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID");

    private static final SubLSymbol $sym30$START = makeUninternedSymbol("START");

    private static final SubLSymbol DO_KB_SUID_TABLE_STARTING_AT_ID = makeSymbol("DO-KB-SUID-TABLE-STARTING-AT-ID");

    private static final SubLSymbol $sym32$NEW_NARTS_TABLE_ENTRY_ = makeSymbol("NEW-NARTS-TABLE-ENTRY?");

    private static final SubLSymbol NARTS_TABLE_TUPLE_TO_CONSTANT = makeSymbol("NARTS-TABLE-TUPLE-TO-CONSTANT");

    public static final SubLList $list34 = list(makeSymbol("ID"), makeSymbol("PAYLOAD"));





    private static final SubLInteger $int$146 = makeInteger(146);

    private static final SubLList $list38 = list(makeSymbol("ID"));

    private static final SubLList $list39 = list(makeKeyword("ID"));

    private static final SubLList $list40 = list(makeSymbol("N-ID"));

    private static final SubLList $list41 = list(makeSymbol("_CSETF-N-ID"));

    private static final SubLSymbol PRINT_NART = makeSymbol("PRINT-NART");

    private static final SubLSymbol NART_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NART-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list44 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("NART-P"));

    private static final SubLSymbol N_ID = makeSymbol("N-ID");

    private static final SubLSymbol _CSETF_N_ID = makeSymbol("_CSETF-N-ID");



    private static final SubLString $str48$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_NART = makeSymbol("MAKE-NART");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_NART_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-NART-METHOD");

    private static final SubLString $str54$___S_ = makeString("#<~S>");

    private static final SubLString $str55$__The_CFASL_invalid_NART_ = makeString("#<The CFASL invalid NART>");

    private static final SubLString $str56$__NART__S_ = makeString("#<NART ~S>");

    private static final SubLSymbol SXHASH_NART_METHOD = makeSymbol("SXHASH-NART-METHOD");

    private static final SubLList $list58 = list(makeSymbol("OBJECT"));

    private static final SubLString $str59$Return_T_iff_OBJECT_is_a_datastru = makeString("Return T iff OBJECT is a datastructure implementing a non-atomic reified term (NART).");

    public static final SubLList $list60 = list(makeSymbol("BOOLEANP"));



    private static final SubLString $$$Freeing_NARTs = makeString("Freeing NARTs");

    private static final SubLSymbol NART_ID = makeSymbol("NART-ID");

    private static final SubLList $list64 = list(makeSymbol("NART"));

    private static final SubLString $str65$Return_the_id_of_this_NART_ = makeString("Return the id of this NART.");

    private static final SubLList $list66 = list(list(makeSymbol("NART"), makeSymbol("NART-P")));



    private static final SubLSymbol FIND_NART_BY_ID = makeSymbol("FIND-NART-BY-ID");

    private static final SubLString $str69$Return_the_NART_with_ID__or_NIL_i = makeString("Return the NART with ID, or NIL if not present.");

    private static final SubLList $list70 = list(list(makeSymbol("ID"), makeSymbol("INTEGERP")));

    private static final SubLList $list71 = list(list(makeSymbol("NIL-OR"), makeSymbol("NART-P")));

    public static SubLObject new_narts_iterator() {
        return iteration.new_indirect_iterator(new_id_index_iterator($nart_from_id$.getGlobalValue()), symbol_function(SECOND), UNPROVIDED);
    }

    public static SubLObject do_narts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        var = current.first();
        current = current.rest();
        final SubLObject progress_message = (current.isCons()) ? current.first() : $$$mapping_Cyc_NARTs;
        destructuring_bind_must_listp(current, datum, $list2);
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list2);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list2);
            if (NIL == member(current_$1, $list4, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list2);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_KB_SUID_TABLE, list(var, $list8, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL));
    }

    public static SubLObject do_narts_table() {
        return $nart_from_id$.getGlobalValue();
    }

    public static SubLObject setup_nart_table(final SubLObject size, final SubLObject exactP) {
        if (NIL != $nart_from_id$.getGlobalValue()) {
            return NIL;
        }
        $nart_from_id$.setGlobalValue(new_id_index(size, ZERO_INTEGER));
        return T;
    }

    public static SubLObject finalize_narts(SubLObject max_nart_id) {
        if (max_nart_id == UNPROVIDED) {
            max_nart_id = NIL;
        }
        set_next_nart_id(max_nart_id);
        set_new_nart_id_threshold(next_nart_id());
        if (NIL == max_nart_id) {
            optimize_nart_table();
        }
        return NIL;
    }

    public static SubLObject optimize_nart_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            optimize_id_index($nart_from_id$.getGlobalValue(), UNPROVIDED);
        } finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject clear_nart_table() {
        return clear_id_index($nart_from_id$.getGlobalValue());
    }

    public static SubLObject create_nart_dump_id_table() {
        return new_indirect_compact_id_index($nart_from_id$.getGlobalValue());
    }

    public static SubLObject new_dense_nart_id_index() {
        return clone_id_index($nart_from_id$.getGlobalValue());
    }

    public static SubLObject nart_count() {
        if (NIL == $nart_from_id$.getGlobalValue()) {
            return ZERO_INTEGER;
        }
        return id_index_count($nart_from_id$.getGlobalValue());
    }

    public static SubLObject lookup_nart(final SubLObject id) {
        return id_index_lookup($nart_from_id$.getGlobalValue(), id, UNPROVIDED);
    }

    public static SubLObject next_nart_id() {
        return id_index_next_id($nart_from_id$.getGlobalValue());
    }

    public static SubLObject new_nart_id_threshold() {
        return NIL != $new_nart_id_threshold$.getGlobalValue() ? $new_nart_id_threshold$.getGlobalValue() : get_file_backed_nart_internal_id_threshold();
    }

    public static SubLObject set_new_nart_id_threshold(final SubLObject id) {
        $new_nart_id_threshold$.setGlobalValue(id);
        return id;
    }

    public static SubLObject old_nart_count() {
        return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), id_index_old_and_new_object_counts(do_narts_table(), new_nart_id_threshold()));
    }

    public static SubLObject new_nart_count() {
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), id_index_old_and_new_object_counts(do_narts_table(), new_nart_id_threshold()));
    }

    public static SubLObject missing_old_nart_ids() {
        final SubLObject id_limit = nart_hl_formula_manager.get_file_backed_nart_id_threshold();
        return id_index_missing_ids(do_narts_table(), $DENSE, id_limit);
    }

    public static SubLObject missing_nart_id_set() {
        return set_utilities.construct_set_from_list(id_index_missing_ids(do_narts_table(), $ALL, UNPROVIDED), EQL, UNPROVIDED);
    }

    public static SubLObject deleted_nart_id_iterator() {
        return iteration.new_list_iterator(id_index_missing_ids(do_narts_table(), $ALL, UNPROVIDED));
    }

    public static SubLObject has_new_nartsP() {
        return numG(next_nart_id(), new_nart_id_threshold());
    }

    public static SubLObject set_next_nart_id(SubLObject max_nart_id) {
        if (max_nart_id == UNPROVIDED) {
            max_nart_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max = MINUS_ONE_INTEGER;
        if (NIL != max_nart_id) {
            max = max_nart_id;
        } else {
            final SubLObject idx = do_narts_table();
            final SubLObject mess = $$$Determining_maximum_NART_ID;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$2 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$2, $SKIP)) {
                        final SubLObject idx_$3 = idx_$2;
                        if (NIL == id_index_dense_objects_empty_p(idx_$3, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$3);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject nart;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                nart = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(nart)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(nart)) {
                                        nart = $SKIP;
                                    }
                                    max = max(max, nart_id(nart));
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$4 = idx_$2;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$4)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$4);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$4);
                            final SubLObject end_id = id_index_next_id(idx_$4);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject nart2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(nart2))) {
                                    max = max(max, nart_id(nart2));
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject next_id = add(max, ONE_INTEGER);
        set_id_index_next_id($nart_from_id$.getGlobalValue(), next_id);
        return next_id;
    }

    public static SubLObject register_nart_id(final SubLObject nart, final SubLObject id) {
        reset_nart_id(nart, id);
        id_index_enter($nart_from_id$.getGlobalValue(), id, nart);
        return nart;
    }

    public static SubLObject deregister_nart_id(final SubLObject id) {
        return id_index_remove($nart_from_id$.getGlobalValue(), id);
    }

    public static SubLObject make_nart_id() {
        return id_index_reserve($nart_from_id$.getGlobalValue());
    }

    public static SubLObject do_old_narts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nart = NIL;
        destructuring_bind_must_consp(current, datum, $list24);
        nart = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list24);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list24);
            if (NIL == member(current_$6, $list25, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list24);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject threshold = $sym26$THRESHOLD;
        return list(CLET, list(bq_cons(threshold, $list28)), listS(DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID, list(nart, $list8, threshold, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
    }

    public static SubLObject do_new_narts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nart = NIL;
        destructuring_bind_must_consp(current, datum, $list24);
        nart = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list24);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list24);
            if (NIL == member(current_$7, $list25, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list24);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject start = $sym30$START;
        return list(CLET, list(bq_cons(start, $list28)), listS(DO_KB_SUID_TABLE_STARTING_AT_ID, list(nart, $list8, start, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
    }

    public static SubLObject get_file_backed_nart_internal_id_threshold() {
        if (NIL != Filesys.directory_p(misc_utilities.generic_caches_directory())) {
            return dumper.get_exclusive_nart_internal_id_limit_for_kb(misc_utilities.generic_caches_directory());
        }
        return ZERO_INTEGER;
    }

    public static SubLObject new_new_narts_iterator() {
        return iteration.new_indirect_iterator(iteration.new_filter_iterator(new_id_index_ordered_iterator(do_narts_table()), $sym32$NEW_NARTS_TABLE_ENTRY_, list(new_nart_id_threshold())), NARTS_TABLE_TUPLE_TO_CONSTANT, UNPROVIDED);
    }

    public static SubLObject new_narts_table_entryP(final SubLObject tuple, final SubLObject id_threshold) {
        SubLObject id = NIL;
        SubLObject payload = NIL;
        destructuring_bind_must_consp(tuple, tuple, $list34);
        id = tuple.first();
        SubLObject current = tuple.rest();
        destructuring_bind_must_consp(current, tuple, $list34);
        payload = current.first();
        current = current.rest();
        if (NIL == current) {
            return numGE(id, id_threshold);
        }
        cdestructuring_bind_error(tuple, $list34);
        return NIL;
    }

    public static SubLObject narts_table_tuple_to_constant(final SubLObject tuple) {
        SubLObject id = NIL;
        SubLObject payload = NIL;
        destructuring_bind_must_consp(tuple, tuple, $list34);
        id = tuple.first();
        SubLObject current = tuple.rest();
        destructuring_bind_must_consp(current, tuple, $list34);
        payload = current.first();
        current = current.rest();
        if (NIL == current) {
            return find_nart_by_id(id);
        }
        cdestructuring_bind_error(tuple, $list34);
        return NIL;
    }

    public static SubLObject nart_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_nart(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject nart_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$nart_native.class ? T : NIL;
    }

    public static SubLObject n_id(final SubLObject v_object) {
        assert NIL != nart_p(v_object) : "nart_handles.nart_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_n_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != nart_p(v_object) : "nart_handles.nart_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_nart(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $nart_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_n_id(v_new, current_value);
            } else {
                Errors.error($str48$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_nart(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_NART, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, n_id(obj));
        funcall(visitor_fn, obj, $END, MAKE_NART, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_nart_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_nart(obj, visitor_fn);
    }

    public static SubLObject print_nart(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject hl_formula = narts_high.nart_hl_formula(v_object);
        final SubLObject id = nart_id(v_object);
        if (NIL != hl_formula) {
            format(stream, $str54$___S_, hl_formula);
        } else
            if (v_object.eql(cfasl_kb_methods.cfasl_invalid_nart())) {
                format(stream, $str55$__The_CFASL_invalid_NART_);
            } else
                if (id.isFixnum()) {
                    format(stream, $str56$__NART__S_, id);
                } else {
                    compatibility.default_struct_print_function(v_object, stream, depth);
                }


        return v_object;
    }

    public static SubLObject sxhash_nart_method(final SubLObject v_object) {
        final SubLObject id = n_id(v_object);
        if (id.isInteger()) {
            return id;
        }
        return ZERO_INTEGER;
    }

    public static SubLObject get_nart() {
        SubLObject nart = NIL;
        nart = make_nart(UNPROVIDED);
        return nart;
    }

    public static SubLObject free_nart(final SubLObject nart) {
        _csetf_n_id(nart, NIL);
        return nart;
    }

    public static SubLObject valid_nart_handleP(final SubLObject v_object) {
        return makeBoolean((NIL != nart_p(v_object)) && (NIL != nart_handle_validP(v_object)));
    }

    public static SubLObject valid_nartP(final SubLObject nart, SubLObject robust) {
        if (robust == UNPROVIDED) {
            robust = NIL;
        }
        arete.arete_note_nart_touched(nart);
        return valid_nart_handleP(nart);
    }

    public static SubLObject valid_nart_robustP(final SubLObject nart) {
        if (NIL != valid_nartP(nart, UNPROVIDED)) {
            final SubLObject index = narts_low.nart_index(nart);
            return index_installed_p(index);
        }
        return NIL;
    }

    public static SubLObject nart_id_p(final SubLObject v_object) {
        return integerp(v_object);
    }

    public static SubLObject create_nart_shell() {
        return make_nart_shell(NIL);
    }

    public static SubLObject make_nart_shell(SubLObject id) {
        if (id == UNPROVIDED) {
            id = NIL;
        }
        if (NIL == id) {
            id = make_nart_id();
        }
        assert NIL != fixnump(id) : "Types.fixnump(id) " + "CommonSymbols.NIL != Types.fixnump(id) " + id;
        final SubLObject nart = get_nart();
        register_nart_id(nart, id);
        return nart;
    }

    public static SubLObject partition_create_invalid_nart() {
        return create_nart_shell();
    }

    public static SubLObject create_sample_invalid_nart() {
        return get_nart();
    }

    public static SubLObject free_all_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = do_narts_table();
        final SubLObject mess = $$$Freeing_NARTs;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$8 = idx;
                if (NIL == id_index_objects_empty_p(idx_$8, $SKIP)) {
                    final SubLObject idx_$9 = idx_$8;
                    if (NIL == id_index_dense_objects_empty_p(idx_$9, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$9);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject nart;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            nart = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(nart)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(nart)) {
                                    nart = $SKIP;
                                }
                                free_term_index(nart);
                                free_nart(nart);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$10 = idx_$8;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$10)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$10);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$10);
                        final SubLObject end_id = id_index_next_id(idx_$10);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject nart2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(nart2))) {
                                free_term_index(nart2);
                                free_nart(nart2);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        clear_nart_table();
        nart_hl_formula_manager.clear_nart_hl_formula_table();
        return NIL;
    }

    public static SubLObject nart_id(final SubLObject nart) {
        SubLTrampolineFile.enforceType(nart, NART_P);
        return n_id(nart);
    }

    public static SubLObject reset_nart_id(final SubLObject nart, final SubLObject new_id) {
        assert NIL != nart_p(nart) : "nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) " + nart;
        _csetf_n_id(nart, new_id);
        return nart;
    }

    public static SubLObject nart_handle_validP(final SubLObject nart) {
        return integerp(n_id(nart));
    }

    public static SubLObject find_nart_by_id(final SubLObject id) {
        SubLTrampolineFile.enforceType(id, INTEGERP);
        return lookup_nart(id);
    }

    public static SubLObject declare_nart_handles_file() {
        declareFunction(me, "new_narts_iterator", "NEW-NARTS-ITERATOR", 0, 0, false);
        declareMacro(me, "do_narts", "DO-NARTS");
        declareFunction(me, "do_narts_table", "DO-NARTS-TABLE", 0, 0, false);
        declareFunction(me, "setup_nart_table", "SETUP-NART-TABLE", 2, 0, false);
        declareFunction(me, "finalize_narts", "FINALIZE-NARTS", 0, 1, false);
        declareFunction(me, "optimize_nart_table", "OPTIMIZE-NART-TABLE", 0, 0, false);
        declareFunction(me, "clear_nart_table", "CLEAR-NART-TABLE", 0, 0, false);
        declareFunction(me, "create_nart_dump_id_table", "CREATE-NART-DUMP-ID-TABLE", 0, 0, false);
        declareFunction(me, "new_dense_nart_id_index", "NEW-DENSE-NART-ID-INDEX", 0, 0, false);
        declareFunction(me, "nart_count", "NART-COUNT", 0, 0, false);
        declareFunction(me, "lookup_nart", "LOOKUP-NART", 1, 0, false);
        declareFunction(me, "next_nart_id", "NEXT-NART-ID", 0, 0, false);
        declareFunction(me, "new_nart_id_threshold", "NEW-NART-ID-THRESHOLD", 0, 0, false);
        declareFunction(me, "set_new_nart_id_threshold", "SET-NEW-NART-ID-THRESHOLD", 1, 0, false);
        declareFunction(me, "old_nart_count", "OLD-NART-COUNT", 0, 0, false);
        declareFunction(me, "new_nart_count", "NEW-NART-COUNT", 0, 0, false);
        declareFunction(me, "missing_old_nart_ids", "MISSING-OLD-NART-IDS", 0, 0, false);
        declareFunction(me, "missing_nart_id_set", "MISSING-NART-ID-SET", 0, 0, false);
        declareFunction(me, "deleted_nart_id_iterator", "DELETED-NART-ID-ITERATOR", 0, 0, false);
        declareFunction(me, "has_new_nartsP", "HAS-NEW-NARTS?", 0, 0, false);
        declareFunction(me, "set_next_nart_id", "SET-NEXT-NART-ID", 0, 1, false);
        declareFunction(me, "register_nart_id", "REGISTER-NART-ID", 2, 0, false);
        declareFunction(me, "deregister_nart_id", "DEREGISTER-NART-ID", 1, 0, false);
        declareFunction(me, "make_nart_id", "MAKE-NART-ID", 0, 0, false);
        declareMacro(me, "do_old_narts", "DO-OLD-NARTS");
        declareMacro(me, "do_new_narts", "DO-NEW-NARTS");
        declareFunction(me, "get_file_backed_nart_internal_id_threshold", "GET-FILE-BACKED-NART-INTERNAL-ID-THRESHOLD", 0, 0, false);
        declareFunction(me, "new_new_narts_iterator", "NEW-NEW-NARTS-ITERATOR", 0, 0, false);
        declareFunction(me, "new_narts_table_entryP", "NEW-NARTS-TABLE-ENTRY?", 2, 0, false);
        declareFunction(me, "narts_table_tuple_to_constant", "NARTS-TABLE-TUPLE-TO-CONSTANT", 1, 0, false);
        declareFunction(me, "nart_print_function_trampoline", "NART-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "nart_p", "NART-P", 1, 0, false);
        new nart_handles.$nart_p$UnaryFunction();
        declareFunction(me, "n_id", "N-ID", 1, 0, false);
        declareFunction(me, "_csetf_n_id", "_CSETF-N-ID", 2, 0, false);
        declareFunction(me, "make_nart", "MAKE-NART", 0, 1, false);
        declareFunction(me, "visit_defstruct_nart", "VISIT-DEFSTRUCT-NART", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_nart_method", "VISIT-DEFSTRUCT-OBJECT-NART-METHOD", 2, 0, false);
        declareFunction(me, "print_nart", "PRINT-NART", 3, 0, false);
        declareFunction(me, "sxhash_nart_method", "SXHASH-NART-METHOD", 1, 0, false);
        new nart_handles.$sxhash_nart_method$UnaryFunction();
        declareFunction(me, "get_nart", "GET-NART", 0, 0, false);
        declareFunction(me, "free_nart", "FREE-NART", 1, 0, false);
        declareFunction(me, "valid_nart_handleP", "VALID-NART-HANDLE?", 1, 0, false);
        declareFunction(me, "valid_nartP", "VALID-NART?", 1, 1, false);
        declareFunction(me, "valid_nart_robustP", "VALID-NART-ROBUST?", 1, 0, false);
        declareFunction(me, "nart_id_p", "NART-ID-P", 1, 0, false);
        declareFunction(me, "create_nart_shell", "CREATE-NART-SHELL", 0, 0, false);
        declareFunction(me, "make_nart_shell", "MAKE-NART-SHELL", 0, 1, false);
        declareFunction(me, "partition_create_invalid_nart", "PARTITION-CREATE-INVALID-NART", 0, 0, false);
        declareFunction(me, "create_sample_invalid_nart", "CREATE-SAMPLE-INVALID-NART", 0, 0, false);
        declareFunction(me, "free_all_narts", "FREE-ALL-NARTS", 0, 0, false);
        declareFunction(me, "nart_id", "NART-ID", 1, 0, false);
        declareFunction(me, "reset_nart_id", "RESET-NART-ID", 2, 0, false);
        declareFunction(me, "nart_handle_validP", "NART-HANDLE-VALID?", 1, 0, false);
        declareFunction(me, "find_nart_by_id", "FIND-NART-BY-ID", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_nart_handles_file() {
        deflexical("*NART-FROM-ID*", SubLTrampolineFile.maybeDefault($nart_from_id$, $nart_from_id$, NIL));
        deflexical("*NEW-NART-ID-THRESHOLD*", SubLTrampolineFile.maybeDefault($new_nart_id_threshold$, $new_nart_id_threshold$, NIL));
        defconstant("*DTP-NART*", NART);
        return NIL;
    }

    public static SubLObject setup_nart_handles_file() {
        declare_defglobal($nart_from_id$);
        register_cyc_api_macro(DO_NARTS, $list2, $str11$Iterate_over_all_HL_NART_datastru);
        register_macro_helper(DO_NARTS_TABLE, DO_NARTS);
        register_macro_helper(CREATE_NART_DUMP_ID_TABLE, WITH_NART_DUMP_ID_TABLE);
        register_cyc_api_function(NART_COUNT, NIL, $str16$Return_the_total_number_of_NARTs_, NIL, $list17);
        declare_defglobal($new_nart_id_threshold$);
        note_funcall_helper_function($sym32$NEW_NARTS_TABLE_ENTRY_);
        note_funcall_helper_function(NARTS_TABLE_TUPLE_TO_CONSTANT);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_nart$.getGlobalValue(), symbol_function(NART_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list44);
        def_csetf(N_ID, _CSETF_N_ID);
        identity(NART);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_nart$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_NART_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_nart$.getGlobalValue(), symbol_function(SXHASH_NART_METHOD));
        register_cyc_api_function(NART_P, $list58, $str59$Return_T_iff_OBJECT_is_a_datastru, NIL, $list60);
        register_cyc_api_function(NART_ID, $list64, $str65$Return_the_id_of_this_NART_, $list66, $list17);
        register_cyc_api_function(FIND_NART_BY_ID, $list38, $str69$Return_the_NART_with_ID__or_NIL_i, $list70, $list71);
        return NIL;
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

    

    public static final class $nart_native extends SubLStructNative {
        public SubLObject $id;

        private static final SubLStructDeclNative structDecl;

        private $nart_native() {
            this.$id = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative($nart_native.class, NART, NART_P, $list38, $list39, new String[]{ "$id" }, $list40, $list41, PRINT_NART);
        }
    }

    public static final class $nart_p$UnaryFunction extends UnaryFunction {
        public $nart_p$UnaryFunction() {
            super(extractFunctionNamed("NART-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return nart_p(arg1);
        }
    }

    public static final class $sxhash_nart_method$UnaryFunction extends UnaryFunction {
        public $sxhash_nart_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-NART-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sxhash_nart_method(arg1);
        }
    }
}

/**
 * Total time: 250 ms
 */
