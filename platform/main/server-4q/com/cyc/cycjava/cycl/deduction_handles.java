/**
 *
 */
/**
 *
 */
package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.utilities_macros;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.deduction_handles.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class deduction_handles extends SubLTranslatedFile {
    public static final SubLFile me = new deduction_handles();

    public static final String myName = "com.cyc.cycjava.cycl.deduction_handles";

    public static final String myFingerPrint = "e3494013c220626c570895576bf8e411fc6fd905caf261c043eb0351a2040670";





    // defconstant
    public static final SubLSymbol $dtp_deduction$ = makeSymbol("*DTP-DEDUCTION*");

    // Internal Constants
    public static final SubLSymbol $deduction_from_id$ = makeSymbol("*DEDUCTION-FROM-ID*");

    private static final SubLSymbol DEDUCTIONS_TABLE_TUPLE_TO_DEDUCTION = makeSymbol("DEDUCTIONS-TABLE-TUPLE-TO-DEDUCTION");

    public static final SubLList $list2 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc deductions")), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLString $$$mapping_Cyc_deductions = makeString("mapping Cyc deductions");

    public static final SubLList $list4 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $sym7$D_ID = makeUninternedSymbol("D-ID");

    private static final SubLSymbol $sym8$D_HANDLE = makeUninternedSymbol("D-HANDLE");



    private static final SubLList $list10 = list(makeSymbol("DO-DEDUCTIONS-TABLE"));







    private static final SubLSymbol RESOLVE_DEDUCTION_ID_VALUE_PAIR = makeSymbol("RESOLVE-DEDUCTION-ID-VALUE-PAIR");

    private static final SubLSymbol DO_DEDUCTIONS = makeSymbol("DO-DEDUCTIONS");

    private static final SubLString $str16$Iterate_over_all_HL_deduction_dat = makeString("Iterate over all HL deduction datastructures, executing BODY within the scope of VAR.\n   VAR is a deduction.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil.");



    private static final SubLSymbol DO_DEDUCTIONS_TABLE = makeSymbol("DO-DEDUCTIONS-TABLE");

    private static final SubLSymbol $sym19$NEW_DEDUCTIONS_TABLE_ENTRY_ = makeSymbol("NEW-DEDUCTIONS-TABLE-ENTRY?");

    private static final SubLList $list20 = list(makeSymbol("ID"), makeSymbol("PAYLOAD"));

    private static final SubLSymbol CREATE_DEDUCTION_DUMP_ID_TABLE = makeSymbol("CREATE-DEDUCTION-DUMP-ID-TABLE");

    private static final SubLSymbol WITH_DEDUCTION_DUMP_ID_TABLE = makeSymbol("WITH-DEDUCTION-DUMP-ID-TABLE");

    private static final SubLSymbol DEDUCTION_COUNT = makeSymbol("DEDUCTION-COUNT");

    private static final SubLString $str24$Return_the_total_number_of_deduct = makeString("Return the total number of deductions.");

    private static final SubLList $list25 = list(makeSymbol("INTEGERP"));

    private static final SubLSymbol $new_deduction_id_threshold$ = makeSymbol("*NEW-DEDUCTION-ID-THRESHOLD*");





    public static final SubLList $list29 = list(list(makeSymbol("ID"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym30$ITERATOR = makeUninternedSymbol("ITERATOR");

    private static final SubLList $list31 = list(list(makeSymbol("DELETED-DEDUCTION-ID-ITERATOR")));



    private static final SubLString $$$Determining_maximum_deduction_ID = makeString("Determining maximum deduction ID");





    public static final SubLList $list36 = list(list(makeSymbol("DEDUCTION"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list37 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));

    private static final SubLSymbol $sym38$THRESHOLD = makeUninternedSymbol("THRESHOLD");

    private static final SubLList $list39 = list(list(makeSymbol("GET-FILE-BACKED-DEDUCTION-INTERNAL-ID-THRESHOLD")));

    private static final SubLSymbol DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID = makeSymbol("DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID");

    private static final SubLSymbol $sym41$START = makeUninternedSymbol("START");

    private static final SubLSymbol DO_KB_SUID_TABLE_STARTING_AT_ID = makeSymbol("DO-KB-SUID-TABLE-STARTING-AT-ID");





    private static final SubLInteger $int$144 = makeInteger(144);

    private static final SubLList $list46 = list(makeSymbol("ID"));

    private static final SubLList $list47 = list(makeKeyword("ID"));

    private static final SubLList $list48 = list(makeSymbol("D-ID"));

    private static final SubLList $list49 = list(makeSymbol("_CSETF-D-ID"));

    private static final SubLSymbol PRINT_DEDUCTION = makeSymbol("PRINT-DEDUCTION");

    private static final SubLSymbol DEDUCTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DEDUCTION-PRINT-FUNCTION-TRAMPOLINE");

    public static final SubLList $list52 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("DEDUCTION-P"));

    private static final SubLSymbol D_ID = makeSymbol("D-ID");

    private static final SubLSymbol _CSETF_D_ID = makeSymbol("_CSETF-D-ID");



    private static final SubLString $str56$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_DEDUCTION = makeSymbol("MAKE-DEDUCTION");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_DEDUCTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-DEDUCTION-METHOD");

    private static final SubLString $str62$_The_CFASL_invalid_deduction_ = makeString("<The CFASL invalid deduction>");

    private static final SubLInteger $int$786 = makeInteger(786);

    private static final SubLSymbol SXHASH_DEDUCTION_METHOD = makeSymbol("SXHASH-DEDUCTION-METHOD");

    public static final SubLList $list65 = list(makeSymbol("OBJECT"));

    private static final SubLString $str66$Return_T_iff_OBJECT_is_a_CycL_ded = makeString("Return T iff OBJECT is a CycL deduction.");

    private static final SubLList $list67 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol VALID_DEDUCTION = makeSymbol("VALID-DEDUCTION");

    private static final SubLList $list69 = list(makeSymbol("VALID-DEDUCTION?"));

    private static final SubLSymbol $sym70$VALID_SUPPORT_ = makeSymbol("VALID-SUPPORT?");



    private static final SubLString $$$Freeing_deductions = makeString("Freeing deductions");

    private static final SubLSymbol DEDUCTION_ID = makeSymbol("DEDUCTION-ID");

    private static final SubLList $list74 = list(makeSymbol("DEDUCTION"));

    private static final SubLString $str75$Return_the_id_of_DEDUCTION_ = makeString("Return the id of DEDUCTION.");

    private static final SubLList $list76 = list(list(makeSymbol("DEDUCTION"), makeSymbol("DEDUCTION-P")));

    private static final SubLSymbol FIND_DEDUCTION_BY_ID = makeSymbol("FIND-DEDUCTION-BY-ID");

    private static final SubLString $str78$Return_the_deduction_with_ID__or_ = makeString("Return the deduction with ID, or NIL if not present.");

    private static final SubLList $list79 = list(list(makeSymbol("ID"), makeSymbol("INTEGERP")));

    private static final SubLList $list80 = list(list(makeSymbol("NIL-OR"), makeSymbol("DEDUCTION-P")));

    public static SubLObject new_deductions_iterator() {
        return iteration.new_indirect_iterator(new_id_index_iterator($deduction_from_id$.getGlobalValue()), DEDUCTIONS_TABLE_TUPLE_TO_DEDUCTION, UNPROVIDED);
    }

    public static SubLObject do_deductions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        var = current.first();
        current = current.rest();
        final SubLObject progress_message = (current.isCons()) ? current.first() : $$$mapping_Cyc_deductions;
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
        final SubLObject d_id = $sym7$D_ID;
        final SubLObject d_handle = $sym8$D_HANDLE;
        return list(DO_ID_INDEX, list(new SubLObject[]{ d_id, d_handle, $list10, $PROGRESS_MESSAGE, progress_message, $ORDERED, T, $DONE, done }), listS(CLET, list(list(var, list(RESOLVE_DEDUCTION_ID_VALUE_PAIR, d_id, d_handle))), append(body, NIL)));
    }

    public static SubLObject resolve_deduction_id_value_pair(final SubLObject id, SubLObject deduction) {
        if ($PAGED_OUT == deduction) {
            deduction = find_deduction_by_id(id);
        }
        return deduction;
    }

    public static SubLObject do_deductions_table() {
        return $deduction_from_id$.getGlobalValue();
    }

    public static SubLObject new_new_deductions_iterator() {
        return iteration.new_indirect_iterator(iteration.new_filter_iterator(new_id_index_ordered_iterator(do_deductions_table()), $sym19$NEW_DEDUCTIONS_TABLE_ENTRY_, list(new_deduction_id_threshold())), DEDUCTIONS_TABLE_TUPLE_TO_DEDUCTION, UNPROVIDED);
    }

    public static SubLObject new_deductions_table_entryP(final SubLObject tuple, final SubLObject id_threshold) {
        SubLObject id = NIL;
        SubLObject payload = NIL;
        destructuring_bind_must_consp(tuple, tuple, $list20);
        id = tuple.first();
        SubLObject current = tuple.rest();
        destructuring_bind_must_consp(current, tuple, $list20);
        payload = current.first();
        current = current.rest();
        if (NIL == current) {
            return numGE(id, id_threshold);
        }
        cdestructuring_bind_error(tuple, $list20);
        return NIL;
    }

    public static SubLObject deductions_table_tuple_to_deduction(final SubLObject tuple) {
        SubLObject id = NIL;
        SubLObject payload = NIL;
        destructuring_bind_must_consp(tuple, tuple, $list20);
        id = tuple.first();
        SubLObject current = tuple.rest();
        destructuring_bind_must_consp(current, tuple, $list20);
        payload = current.first();
        current = current.rest();
        if (NIL == current) {
            return find_deduction_by_id(id);
        }
        cdestructuring_bind_error(tuple, $list20);
        return NIL;
    }

    public static SubLObject setup_deduction_table(final SubLObject size, final SubLObject exactP) {
        if (NIL != $deduction_from_id$.getGlobalValue()) {
            return NIL;
        }
        $deduction_from_id$.setGlobalValue(new_id_index(size, ZERO_INTEGER));
        return T;
    }

    public static SubLObject finalize_deductions(SubLObject max_deduction_id) {
        if (max_deduction_id == UNPROVIDED) {
            max_deduction_id = NIL;
        }
        set_next_deduction_id(max_deduction_id);
        set_new_deduction_id_threshold(next_deduction_id());
        if (NIL == max_deduction_id) {
            optimize_deduction_table();
            deduction_manager.optimize_deduction_content_table(new_deduction_id_threshold());
        }
        return NIL;
    }

    public static SubLObject optimize_deduction_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            optimize_id_index($deduction_from_id$.getGlobalValue(), UNPROVIDED);
        } finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject clear_deduction_table() {
        return clear_id_index($deduction_from_id$.getGlobalValue());
    }

    public static SubLObject create_deduction_dump_id_table() {
        return new_indirect_compact_id_index($deduction_from_id$.getGlobalValue());
    }

    public static SubLObject new_dense_deduction_id_index() {
        return clone_id_index($deduction_from_id$.getGlobalValue());
    }

    public static SubLObject deduction_count() {
        if (NIL == $deduction_from_id$.getGlobalValue()) {
            return ZERO_INTEGER;
        }
        return id_index_count($deduction_from_id$.getGlobalValue());
    }

    public static SubLObject lookup_deduction(final SubLObject id) {
        final SubLObject deduction = id_index_lookup($deduction_from_id$.getGlobalValue(), id, UNPROVIDED);
        if (NIL == deduction) {
            return NIL;
        }
        if ($PAGED_OUT == deduction) {
            return make_deduction_shell(id);
        }
        return deduction;
    }

    public static SubLObject next_deduction_id() {
        return id_index_next_id($deduction_from_id$.getGlobalValue());
    }

    public static SubLObject new_deduction_id_threshold() {
        return NIL != $new_deduction_id_threshold$.getGlobalValue() ? $new_deduction_id_threshold$.getGlobalValue() : deduction_manager.get_file_backed_deduction_id_threshold();
    }

    public static SubLObject set_new_deduction_id_threshold(final SubLObject id) {
        $new_deduction_id_threshold$.setGlobalValue(id);
        return id;
    }

    public static SubLObject old_deduction_count() {
        return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), id_index_old_and_new_object_counts(do_deductions_table(), new_deduction_id_threshold()));
    }

    public static SubLObject new_deduction_count() {
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), id_index_old_and_new_object_counts(do_deductions_table(), new_deduction_id_threshold()));
    }

    public static SubLObject missing_old_deduction_ids() {
        final SubLObject id_limit = new_deduction_id_threshold();
        return id_index_missing_ids($deduction_from_id$.getGlobalValue(), $DENSE, id_limit);
    }

    public static SubLObject missing_deduction_id_set() {
        return set_utilities.construct_set_from_list(id_index_missing_ids($deduction_from_id$.getGlobalValue(), $ALL, UNPROVIDED), EQL, UNPROVIDED);
    }

    public static SubLObject deleted_deduction_id_iterator() {
        return iteration.new_list_iterator(id_index_missing_ids(do_deductions_table(), $ALL, UNPROVIDED));
    }

    public static SubLObject do_deleted_deduction_ids(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list29);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list29);
            if (NIL == member(current_$2, $list4, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list29);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject iterator = $sym30$ITERATOR;
        return list(CLET, list(bq_cons(iterator, $list31)), listS(DO_ITERATOR, list(id, iterator, $DONE, done), append(body, NIL)));
    }

    public static SubLObject has_new_deductionsP() {
        return numG(next_deduction_id(), new_deduction_id_threshold());
    }

    public static SubLObject set_next_deduction_id(SubLObject max_deduction_id) {
        if (max_deduction_id == UNPROVIDED) {
            max_deduction_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max = MINUS_ONE_INTEGER;
        if (NIL != max_deduction_id) {
            max = max_deduction_id;
        } else {
            final SubLObject idx = do_deductions_table();
            final SubLObject mess = $$$Determining_maximum_deduction_ID;
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
                    final SubLObject idx_$3 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$3, $SKIP)) {
                        final SubLObject idx_$4 = idx_$3;
                        if (NIL == id_index_dense_objects_empty_p(idx_$4, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$4);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject d_id;
                            SubLObject d_handle;
                            SubLObject deduction;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                d_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                d_handle = aref(vector_var, d_id);
                                if ((NIL == id_index_tombstone_p(d_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(d_handle)) {
                                        d_handle = $SKIP;
                                    }
                                    deduction = resolve_deduction_id_value_pair(d_id, d_handle);
                                    max = max(max, deduction_id(deduction));
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$5 = idx_$3;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$5)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$5);
                            SubLObject d_id2 = id_index_sparse_id_threshold(idx_$5);
                            final SubLObject end_id = id_index_next_id(idx_$5);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (d_id2.numL(end_id)) {
                                final SubLObject d_handle2 = gethash_without_values(d_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(d_handle2))) {
                                    final SubLObject deduction2 = resolve_deduction_id_value_pair(d_id2, d_handle2);
                                    max = max(max, deduction_id(deduction2));
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                d_id2 = add(d_id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
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
        set_id_index_next_id($deduction_from_id$.getGlobalValue(), next_id);
        return next_id;
    }

    public static SubLObject register_deduction_id(final SubLObject deduction, final SubLObject id) {
        reset_deduction_id(deduction, id);
        id_index_enter($deduction_from_id$.getGlobalValue(), id, deduction);
        return deduction;
    }

    public static SubLObject deregister_deduction_id(final SubLObject id) {
        return id_index_remove($deduction_from_id$.getGlobalValue(), id);
    }

    public static SubLObject make_deduction_id() {
        return id_index_reserve($deduction_from_id$.getGlobalValue());
    }

    public static SubLObject do_old_deductions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject deduction = NIL;
        destructuring_bind_must_consp(current, datum, $list36);
        deduction = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list36);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list36);
            if (NIL == member(current_$7, $list37, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list36);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject threshold = $sym38$THRESHOLD;
        return list(CLET, list(bq_cons(threshold, $list39)), listS(DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID, list(deduction, $list10, threshold, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
    }

    public static SubLObject do_new_deductions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject deduction = NIL;
        destructuring_bind_must_consp(current, datum, $list36);
        deduction = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list36);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list36);
            if (NIL == member(current_$8, $list37, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list36);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject start = $sym41$START;
        return list(CLET, list(bq_cons(start, $list39)), listS(DO_KB_SUID_TABLE_STARTING_AT_ID, list(deduction, $list10, start, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
    }

    public static SubLObject get_file_backed_deduction_internal_id_threshold() {
        if (NIL != Filesys.directory_p(misc_utilities.generic_caches_directory())) {
            return dumper.get_exclusive_deduction_internal_id_limit_for_kb(misc_utilities.generic_caches_directory());
        }
        return ZERO_INTEGER;
    }

    public static SubLObject deduction_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_deduction(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject deduction_p(final SubLObject v_object) {
        return v_object.getClass() == deduction_handles.$deduction_native.class ? T : NIL;
    }

    public static SubLObject d_id(final SubLObject v_object) {
        assert NIL != deduction_p(v_object) : "deduction_handles.deduction_p(v_object) " + "CommonSymbols.NIL != deduction_handles.deduction_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_d_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != deduction_p(v_object) : "deduction_handles.deduction_p(v_object) " + "CommonSymbols.NIL != deduction_handles.deduction_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_deduction(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new deduction_handles.$deduction_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_d_id(v_new, current_value);
            } else {
                Errors.error($str56$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_deduction(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_DEDUCTION, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, d_id(obj));
        funcall(visitor_fn, obj, $END, MAKE_DEDUCTION, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_deduction_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_deduction(obj, visitor_fn);
    }

    public static SubLObject print_deduction(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != valid_deduction(v_object, UNPROVIDED)) {
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
                princ(deduction_id(v_object), stream);
                print_macros.print_unreadable_object_postamble(stream, v_object, NIL, NIL);
            }
        } else
            if (v_object.eql(cfasl_kb_methods.cfasl_invalid_deduction())) {
                format(stream, $str62$_The_CFASL_invalid_deduction_);
            } else {
                compatibility.default_struct_print_function(v_object, stream, depth);
            }

        return v_object;
    }

    public static SubLObject sxhash_deduction_method(final SubLObject v_object) {
        final SubLObject id = d_id(v_object);
        if (id.isInteger()) {
            return id;
        }
        return $int$786;
    }

    public static SubLObject get_deduction() {
        SubLObject deduction = NIL;
        deduction = make_deduction(UNPROVIDED);
        return deduction;
    }

    public static SubLObject free_deduction(final SubLObject deduction) {
        _csetf_d_id(deduction, NIL);
        return deduction;
    }

    public static SubLObject valid_deduction_handleP(final SubLObject v_object) {
        return makeBoolean((NIL != deduction_p(v_object)) && (NIL != deduction_handle_validP(v_object)));
    }

    public static SubLObject valid_deduction(final SubLObject deduction, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return valid_deductionP(deduction, robustP);
    }

    public static SubLObject valid_deductionP(final SubLObject deduction, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        if (NIL == valid_deduction_handleP(deduction)) {
            return NIL;
        }
        if (NIL == robustP) {
            return T;
        }
        final SubLObject supports = deductions_high.deduction_supports(deduction);
        return makeBoolean(((NIL != arguments.valid_supportP(deductions_high.deduction_supported_object(deduction), UNPROVIDED)) && supports.isCons()) && (NIL != list_utilities.every_in_list($sym70$VALID_SUPPORT_, supports, UNPROVIDED)));
    }

    public static SubLObject mark_available_deductions(final SubLObject max_id, SubLObject deleted_set) {
        if (deleted_set == UNPROVIDED) {
            deleted_set = NIL;
        }
        fill_id_index_dense_space($deduction_from_id$.getGlobalValue(), $PAGED_OUT, max_id);
        if (NIL != set.set_p(deleted_set)) {
            final SubLObject set_contents_var = set.do_set_internal(deleted_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject deleted_id;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                deleted_id = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, deleted_id)) {
                    id_index_remove($deduction_from_id$.getGlobalValue(), deleted_id);
                }
            }
        }
        return max_id;
    }

    public static SubLObject mark_deduction_available(final SubLObject id) {
        return id_index_enter($deduction_from_id$.getGlobalValue(), id, $PAGED_OUT);
    }

    public static SubLObject make_deduction_shell(SubLObject id) {
        if (id == UNPROVIDED) {
            id = NIL;
        }
        if (NIL == id) {
            id = make_deduction_id();
        }
        assert NIL != integerp(id) : "Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) " + id;
        final SubLObject deduction = get_deduction();
        register_deduction_id(deduction, id);
        return deduction;
    }

    public static SubLObject create_sample_invalid_deduction() {
        return get_deduction();
    }

    public static SubLObject free_all_deductions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = do_deductions_table();
        final SubLObject mess = $$$Freeing_deductions;
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
                final SubLObject idx_$9 = idx;
                if (NIL == id_index_objects_empty_p(idx_$9, $SKIP)) {
                    final SubLObject idx_$10 = idx_$9;
                    if (NIL == id_index_dense_objects_empty_p(idx_$10, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$10);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject d_id;
                        SubLObject d_handle;
                        SubLObject deduction;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            d_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            d_handle = aref(vector_var, d_id);
                            if ((NIL == id_index_tombstone_p(d_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(d_handle)) {
                                    d_handle = $SKIP;
                                }
                                deduction = resolve_deduction_id_value_pair(d_id, d_handle);
                                free_deduction(deduction);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$11 = idx_$9;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$11)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$11);
                        SubLObject d_id2 = id_index_sparse_id_threshold(idx_$11);
                        final SubLObject end_id = id_index_next_id(idx_$11);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (d_id2.numL(end_id)) {
                            final SubLObject d_handle2 = gethash_without_values(d_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(d_handle2))) {
                                final SubLObject deduction2 = resolve_deduction_id_value_pair(d_id2, d_handle2);
                                free_deduction(deduction2);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            d_id2 = add(d_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        clear_deduction_table();
        deduction_manager.clear_deduction_content_table();
        return NIL;
    }

    public static SubLObject deduction_id(final SubLObject deduction) {
        SubLTrampolineFile.enforceType(deduction, DEDUCTION_P);
        return d_id(deduction);
    }

    public static SubLObject reset_deduction_id(final SubLObject deduction, final SubLObject new_id) {
        _csetf_d_id(deduction, new_id);
        return deduction;
    }

    public static SubLObject deduction_handle_validP(final SubLObject deduction) {
        return integerp(d_id(deduction));
    }

    public static SubLObject find_deduction_by_id(final SubLObject id) {
        SubLTrampolineFile.enforceType(id, INTEGERP);
        return lookup_deduction(id);
    }

    public static SubLObject declare_deduction_handles_file() {
        declareFunction(me, "new_deductions_iterator", "NEW-DEDUCTIONS-ITERATOR", 0, 0, false);
        declareMacro(me, "do_deductions", "DO-DEDUCTIONS");
        declareFunction(me, "resolve_deduction_id_value_pair", "RESOLVE-DEDUCTION-ID-VALUE-PAIR", 2, 0, false);
        declareFunction(me, "do_deductions_table", "DO-DEDUCTIONS-TABLE", 0, 0, false);
        declareFunction(me, "new_new_deductions_iterator", "NEW-NEW-DEDUCTIONS-ITERATOR", 0, 0, false);
        declareFunction(me, "new_deductions_table_entryP", "NEW-DEDUCTIONS-TABLE-ENTRY?", 2, 0, false);
        declareFunction(me, "deductions_table_tuple_to_deduction", "DEDUCTIONS-TABLE-TUPLE-TO-DEDUCTION", 1, 0, false);
        declareFunction(me, "setup_deduction_table", "SETUP-DEDUCTION-TABLE", 2, 0, false);
        declareFunction(me, "finalize_deductions", "FINALIZE-DEDUCTIONS", 0, 1, false);
        declareFunction(me, "optimize_deduction_table", "OPTIMIZE-DEDUCTION-TABLE", 0, 0, false);
        declareFunction(me, "clear_deduction_table", "CLEAR-DEDUCTION-TABLE", 0, 0, false);
        declareFunction(me, "create_deduction_dump_id_table", "CREATE-DEDUCTION-DUMP-ID-TABLE", 0, 0, false);
        declareFunction(me, "new_dense_deduction_id_index", "NEW-DENSE-DEDUCTION-ID-INDEX", 0, 0, false);
        declareFunction(me, "deduction_count", "DEDUCTION-COUNT", 0, 0, false);
        declareFunction(me, "lookup_deduction", "LOOKUP-DEDUCTION", 1, 0, false);
        declareFunction(me, "next_deduction_id", "NEXT-DEDUCTION-ID", 0, 0, false);
        declareFunction(me, "new_deduction_id_threshold", "NEW-DEDUCTION-ID-THRESHOLD", 0, 0, false);
        declareFunction(me, "set_new_deduction_id_threshold", "SET-NEW-DEDUCTION-ID-THRESHOLD", 1, 0, false);
        declareFunction(me, "old_deduction_count", "OLD-DEDUCTION-COUNT", 0, 0, false);
        declareFunction(me, "new_deduction_count", "NEW-DEDUCTION-COUNT", 0, 0, false);
        declareFunction(me, "missing_old_deduction_ids", "MISSING-OLD-DEDUCTION-IDS", 0, 0, false);
        declareFunction(me, "missing_deduction_id_set", "MISSING-DEDUCTION-ID-SET", 0, 0, false);
        declareFunction(me, "deleted_deduction_id_iterator", "DELETED-DEDUCTION-ID-ITERATOR", 0, 0, false);
        declareMacro(me, "do_deleted_deduction_ids", "DO-DELETED-DEDUCTION-IDS");
        declareFunction(me, "has_new_deductionsP", "HAS-NEW-DEDUCTIONS?", 0, 0, false);
        declareFunction(me, "set_next_deduction_id", "SET-NEXT-DEDUCTION-ID", 0, 1, false);
        declareFunction(me, "register_deduction_id", "REGISTER-DEDUCTION-ID", 2, 0, false);
        declareFunction(me, "deregister_deduction_id", "DEREGISTER-DEDUCTION-ID", 1, 0, false);
        declareFunction(me, "make_deduction_id", "MAKE-DEDUCTION-ID", 0, 0, false);
        declareMacro(me, "do_old_deductions", "DO-OLD-DEDUCTIONS");
        declareMacro(me, "do_new_deductions", "DO-NEW-DEDUCTIONS");
        declareFunction(me, "get_file_backed_deduction_internal_id_threshold", "GET-FILE-BACKED-DEDUCTION-INTERNAL-ID-THRESHOLD", 0, 0, false);
        declareFunction(me, "deduction_print_function_trampoline", "DEDUCTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "deduction_p", "DEDUCTION-P", 1, 0, false);
        new deduction_handles.$deduction_p$UnaryFunction();
        declareFunction(me, "d_id", "D-ID", 1, 0, false);
        declareFunction(me, "_csetf_d_id", "_CSETF-D-ID", 2, 0, false);
        declareFunction(me, "make_deduction", "MAKE-DEDUCTION", 0, 1, false);
        declareFunction(me, "visit_defstruct_deduction", "VISIT-DEFSTRUCT-DEDUCTION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_deduction_method", "VISIT-DEFSTRUCT-OBJECT-DEDUCTION-METHOD", 2, 0, false);
        declareFunction(me, "print_deduction", "PRINT-DEDUCTION", 3, 0, false);
        declareFunction(me, "sxhash_deduction_method", "SXHASH-DEDUCTION-METHOD", 1, 0, false);
        new deduction_handles.$sxhash_deduction_method$UnaryFunction();
        declareFunction(me, "get_deduction", "GET-DEDUCTION", 0, 0, false);
        declareFunction(me, "free_deduction", "FREE-DEDUCTION", 1, 0, false);
        declareFunction(me, "valid_deduction_handleP", "VALID-DEDUCTION-HANDLE?", 1, 0, false);
        declareFunction(me, "valid_deduction", "VALID-DEDUCTION", 1, 1, false);
        declareFunction(me, "valid_deductionP", "VALID-DEDUCTION?", 1, 1, false);
        declareFunction(me, "mark_available_deductions", "MARK-AVAILABLE-DEDUCTIONS", 1, 1, false);
        declareFunction(me, "mark_deduction_available", "MARK-DEDUCTION-AVAILABLE", 1, 0, false);
        declareFunction(me, "make_deduction_shell", "MAKE-DEDUCTION-SHELL", 0, 1, false);
        declareFunction(me, "create_sample_invalid_deduction", "CREATE-SAMPLE-INVALID-DEDUCTION", 0, 0, false);
        declareFunction(me, "free_all_deductions", "FREE-ALL-DEDUCTIONS", 0, 0, false);
        declareFunction(me, "deduction_id", "DEDUCTION-ID", 1, 0, false);
        declareFunction(me, "reset_deduction_id", "RESET-DEDUCTION-ID", 2, 0, false);
        declareFunction(me, "deduction_handle_validP", "DEDUCTION-HANDLE-VALID?", 1, 0, false);
        declareFunction(me, "find_deduction_by_id", "FIND-DEDUCTION-BY-ID", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_deduction_handles_file() {
        deflexical("*DEDUCTION-FROM-ID*", SubLTrampolineFile.maybeDefault($deduction_from_id$, $deduction_from_id$, NIL));
        deflexical("*NEW-DEDUCTION-ID-THRESHOLD*", SubLTrampolineFile.maybeDefault($new_deduction_id_threshold$, $new_deduction_id_threshold$, NIL));
        defconstant("*DTP-DEDUCTION*", DEDUCTION);
        return NIL;
    }

    public static SubLObject setup_deduction_handles_file() {
        declare_defglobal($deduction_from_id$);
        register_cyc_api_macro(DO_DEDUCTIONS, $list2, $str16$Iterate_over_all_HL_deduction_dat);
        register_macro_helper(RESOLVE_DEDUCTION_ID_VALUE_PAIR, DO_DEDUCTIONS);
        register_macro_helper(DO_DEDUCTIONS_TABLE, DO_DEDUCTIONS);
        note_funcall_helper_function($sym19$NEW_DEDUCTIONS_TABLE_ENTRY_);
        note_funcall_helper_function(DEDUCTIONS_TABLE_TUPLE_TO_DEDUCTION);
        register_macro_helper(CREATE_DEDUCTION_DUMP_ID_TABLE, WITH_DEDUCTION_DUMP_ID_TABLE);
        register_cyc_api_function(DEDUCTION_COUNT, NIL, $str24$Return_the_total_number_of_deduct, NIL, $list25);
        declare_defglobal($new_deduction_id_threshold$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_deduction$.getGlobalValue(), symbol_function(DEDUCTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list52);
        def_csetf(D_ID, _CSETF_D_ID);
        identity(DEDUCTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_deduction$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_DEDUCTION_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_deduction$.getGlobalValue(), symbol_function(SXHASH_DEDUCTION_METHOD));
        register_cyc_api_function(DEDUCTION_P, $list65, $str66$Return_T_iff_OBJECT_is_a_CycL_ded, NIL, $list67);
        define_obsolete_register(VALID_DEDUCTION, $list69);
        register_cyc_api_function(DEDUCTION_ID, $list74, $str75$Return_the_id_of_DEDUCTION_, $list76, $list25);
        register_cyc_api_function(FIND_DEDUCTION_BY_ID, $list46, $str78$Return_the_deduction_with_ID__or_, $list79, $list80);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_deduction_handles_file();
    }

    @Override
    public void initializeVariables() {
        init_deduction_handles_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_deduction_handles_file();
    }

    static {





















































































    }

    public static final class $deduction_native extends SubLStructNative {
        public SubLObject $id;

        private static final SubLStructDeclNative structDecl;

        public $deduction_native() {
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
            structDecl = makeStructDeclNative(deduction_handles.$deduction_native.class, DEDUCTION, DEDUCTION_P, $list46, $list47, new String[]{ "$id" }, $list48, $list49, PRINT_DEDUCTION);
        }
    }

    public static final class $deduction_p$UnaryFunction extends UnaryFunction {
        public $deduction_p$UnaryFunction() {
            super(extractFunctionNamed("DEDUCTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return deduction_p(arg1);
        }
    }

    public static final class $sxhash_deduction_method$UnaryFunction extends UnaryFunction {
        public $sxhash_deduction_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-DEDUCTION-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sxhash_deduction_method(arg1);
        }
    }
}

