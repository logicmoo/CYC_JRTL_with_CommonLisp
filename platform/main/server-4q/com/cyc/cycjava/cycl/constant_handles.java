/**
 *
 */
/**
 *
 */
package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.arete;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class constant_handles extends SubLTranslatedFile {
    public static final SubLFile me = new constant_handles();

    public static final String myName = "com.cyc.cycjava.cycl.constant_handles";

    public static final String myFingerPrint = "f5cc4ea17805d295d895ba5a6bcd9295852d41f313387c7751b3db5975e8dc24";





    // defconstant
    public static final SubLSymbol $dtp_constant$ = makeSymbol("*DTP-CONSTANT*");



    // Internal Constants
    public static final SubLSymbol $constant_from_suid$ = makeSymbol("*CONSTANT-FROM-SUID*");



    public static final SubLList $list2 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc constants")), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLString $$$mapping_Cyc_constants = makeString("mapping Cyc constants");

    public static final SubLList $list4 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    public static final SubLList $list8 = list(makeSymbol("DO-CONSTANTS-TABLE"));



    public static final SubLSymbol DO_CONSTANTS = makeSymbol("DO-CONSTANTS");

    public static final SubLString $str11$Iterate_over_all_HL_constant_data = makeString("Iterate over all HL constant datastructures, executing BODY within the scope of VAR.\n   VAR is bound to each constant in turn.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil.");

    public static final SubLSymbol DO_CONSTANTS_TABLE = makeSymbol("DO-CONSTANTS-TABLE");





    public static final SubLSymbol CREATE_CONSTANT_DUMP_ID_TABLE = makeSymbol("CREATE-CONSTANT-DUMP-ID-TABLE");

    public static final SubLSymbol WITH_CONSTANT_DUMP_ID_TABLE = makeSymbol("WITH-CONSTANT-DUMP-ID-TABLE");

    public static final SubLSymbol CONSTANT_COUNT = makeSymbol("CONSTANT-COUNT");

    public static final SubLString $str18$Return_the_total_number_of_consta = makeString("Return the total number of constants.");

    public static final SubLList $list19 = list(makeSymbol("INTEGERP"));

    private static final SubLSymbol $new_constant_suid_threshold$ = makeSymbol("*NEW-CONSTANT-SUID-THRESHOLD*");





    public static final SubLList $list23 = list(list(makeSymbol("ID"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym24$ITERATOR = makeUninternedSymbol("ITERATOR");



    public static final SubLList $list26 = list(list(makeSymbol("DELETED-CONSTANT-ID-ITERATOR")));



    private static final SubLString $$$Determining_maximum_constant_SUID = makeString("Determining maximum constant SUID");

    public static final SubLList $list29 = list(list(makeSymbol("CONSTANT"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list30 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));

    private static final SubLSymbol $sym31$THRESHOLD = makeUninternedSymbol("THRESHOLD");

    private static final SubLList $list32 = list(list(makeSymbol("NEW-CONSTANT-SUID-THRESHOLD")));

    private static final SubLSymbol DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID = makeSymbol("DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID");

    private static final SubLSymbol $sym34$START = makeUninternedSymbol("START");

    private static final SubLSymbol DO_KB_SUID_TABLE_STARTING_AT_ID = makeSymbol("DO-KB-SUID-TABLE-STARTING-AT-ID");

    private static final SubLSymbol $sym36$NEW_CONSTANTS_TABLE_ENTRY_ = makeSymbol("NEW-CONSTANTS-TABLE-ENTRY?");

    private static final SubLSymbol CONSTANTS_TABLE_TUPLE_TO_CONSTANT = makeSymbol("CONSTANTS-TABLE-TUPLE-TO-CONSTANT");

    private static final SubLList $list38 = list(makeSymbol("ID"), makeSymbol("PAYLOAD"));





    private static final SubLInteger $int$140 = makeInteger(140);

    static final SubLList $list42 = list(makeSymbol("SUID"), makeSymbol("NAME"));

    static final SubLList $list43 = list(makeKeyword("SUID"), makeKeyword("NAME"));

    static final SubLList $list44 = list(makeSymbol("C-SUID"), makeSymbol("C-NAME"));

    static final SubLList $list45 = list(makeSymbol("_CSETF-C-SUID"), makeSymbol("_CSETF-C-NAME"));

    static final SubLSymbol PRINT_CONSTANT = makeSymbol("PRINT-CONSTANT");

    private static final SubLSymbol CONSTANT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CONSTANT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list48 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CONSTANT-P"));

    private static final SubLSymbol C_SUID = makeSymbol("C-SUID");

    private static final SubLSymbol _CSETF_C_SUID = makeSymbol("_CSETF-C-SUID");

    private static final SubLSymbol C_NAME = makeSymbol("C-NAME");

    private static final SubLSymbol _CSETF_C_NAME = makeSymbol("_CSETF-C-NAME");





    private static final SubLString $str55$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_CONSTANT = makeSymbol("MAKE-CONSTANT");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CONSTANT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CONSTANT-METHOD");

    private static final SubLString $str61$___a = makeString("#$~a");

    private static final SubLString $str62$_The_CFASL_invalid_constant_ = makeString("<The CFASL invalid constant>");

    private static final SubLString $str63$_Constant__a_ = makeString("<Constant ~a>");

    private static final SubLSymbol SXHASH_CONSTANT_METHOD = makeSymbol("SXHASH-CONSTANT-METHOD");

    public static final SubLList $list65 = list(makeSymbol("OBJECT"));

    private static final SubLString $str66$Return_T_iff_the_argument_is_a_Cy = makeString("Return T iff the argument is a CycL constant");

    private static final SubLList $list67 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol $sym68$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    private static final SubLList $list69 = list(makeSymbol("CONSTANT"), makeSymbol("&OPTIONAL"), makeSymbol("ROBUST"));

    private static final SubLString $str70$Return_T_if_CONSTANT_is_a_valid__ = makeString("Return T if CONSTANT is a valid, fully-formed constant.");



    private static final SubLSymbol VALID_CONSTANT = makeSymbol("VALID-CONSTANT");

    private static final SubLList $list73 = list(makeSymbol("VALID-CONSTANT?"));

    private static final SubLString $str74$Deprecated_in_favor_of_valid_cons = makeString("Deprecated in favor of valid-constant?\n   Return T if CONSTANT is a valid constant.");

    private static final SubLSymbol $invalid_constants$ = makeSymbol("*INVALID-CONSTANTS*");

    private static final SubLInteger $int$4000 = makeInteger(4000);

    private static final SubLString $str77$clearing_local_constant_informati = makeString("clearing local constant information");

    private static final SubLInteger $int$50000 = makeInteger(50000);

    private static final SubLList $list79 = list(makeSymbol("INTERNAL-ID"), makeSymbol("NAME"), makeSymbol("EXTERNAL-ID"));

    private static final SubLSymbol CONSTANT_NAME_SPEC_P = makeSymbol("CONSTANT-NAME-SPEC-P");

    private static final SubLString $$$Freeing_constants = makeString("Freeing constants");



    private static final SubLString $str83$Rebuilding_constant_completion_ta = makeString("Rebuilding constant completion table");

    public static SubLObject new_constants_iterator() {
        return iteration.new_indirect_iterator(new_id_index_iterator($constant_from_suid$.getGlobalValue()), symbol_function(SECOND), UNPROVIDED);
    }

    public static SubLObject do_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        var = current.first();
        current = current.rest();
        final SubLObject progress_message = (current.isCons()) ? current.first() : $$$mapping_Cyc_constants;
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

    public static SubLObject do_constants_table() {
        return $constant_from_suid$.getGlobalValue();
    }

    public static SubLObject map_constants(final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = do_constants_table();
        final SubLObject mess = $$$mapping_Cyc_constants;
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
                        SubLObject c;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            c = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(c)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(c)) {
                                    c = $SKIP;
                                }
                                funcall(function, c);
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
                            final SubLObject c2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(c2))) {
                                funcall(function, c2);
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
        return NIL;
    }

    public static SubLObject setup_constant_suid_table(final SubLObject size, final SubLObject exactP) {
        if (NIL != $constant_from_suid$.getGlobalValue()) {
            return NIL;
        }
        constant_completion.initialize_constant_names_in_code();
        $constant_from_suid$.setGlobalValue(new_id_index(size, ZERO_INTEGER));
        return T;
    }

    public static SubLObject finalize_constant_suid_table(SubLObject max_constant_suid) {
        if (max_constant_suid == UNPROVIDED) {
            max_constant_suid = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        set_next_constant_suid(max_constant_suid);
        set_new_constant_suid_threshold(next_constant_suid());
        if (NIL == max_constant_suid) {
            final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
            try {
                Storage.$current_area$.bind(Storage.get_static_area(), thread);
                optimize_id_index($constant_from_suid$.getGlobalValue(), UNPROVIDED);
            } finally {
                Storage.$current_area$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject clear_constant_suid_table() {
        return clear_id_index($constant_from_suid$.getGlobalValue());
    }

    public static SubLObject create_constant_dump_id_table() {
        return new_indirect_compact_id_index($constant_from_suid$.getGlobalValue());
    }

    public static SubLObject new_dense_constant_id_index() {
        return clone_id_index(do_constants_table());
    }

    public static SubLObject constant_count() {
        if (NIL == $constant_from_suid$.getGlobalValue()) {
            return ZERO_INTEGER;
        }
        return id_index_count($constant_from_suid$.getGlobalValue());
    }

    public static SubLObject lookup_constant_by_suid(final SubLObject suid) {
        return id_index_lookup($constant_from_suid$.getGlobalValue(), suid, UNPROVIDED);
    }

    public static SubLObject next_constant_suid() {
        return id_index_next_id($constant_from_suid$.getGlobalValue());
    }

    public static SubLObject new_constant_suid_threshold() {
        return NIL != $new_constant_suid_threshold$.getGlobalValue() ? $new_constant_suid_threshold$.getGlobalValue() : constant_index_manager.get_file_backed_constant_internal_id_threshold();
    }

    public static SubLObject set_new_constant_suid_threshold(final SubLObject id) {
        $new_constant_suid_threshold$.setGlobalValue(id);
        return id;
    }

    public static SubLObject old_constant_count() {
        return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), id_index_old_and_new_object_counts(do_constants_table(), new_constant_suid_threshold()));
    }

    public static SubLObject new_constant_count() {
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), id_index_old_and_new_object_counts(do_constants_table(), new_constant_suid_threshold()));
    }

    public static SubLObject missing_old_constant_internal_ids() {
        final SubLObject id_limit = new_constant_suid_threshold();
        return id_index_missing_ids(do_constants_table(), $DENSE, id_limit);
    }

    public static SubLObject missing_constant_id_set() {
        return set_utilities.construct_set_from_list(id_index_missing_ids(do_constants_table(), $ALL, UNPROVIDED), EQL, UNPROVIDED);
    }

    public static SubLObject deleted_constant_id_iterator() {
        return iteration.new_list_iterator(id_index_missing_ids(do_constants_table(), $ALL, UNPROVIDED));
    }

    public static SubLObject do_deleted_constant_ids(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list23);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        id = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list23);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list23);
            if (NIL == member(current_$6, $list4, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list23);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject iterator = $sym24$ITERATOR;
        return list(CLET, list(bq_cons(iterator, $list26)), listS(DO_ITERATOR, list(id, iterator, $DONE, done), append(body, NIL)));
    }

    public static SubLObject has_new_constantsP() {
        return numG(next_constant_suid(), new_constant_suid_threshold());
    }

    public static SubLObject set_next_constant_suid(SubLObject max_constant_suid) {
        if (max_constant_suid == UNPROVIDED) {
            max_constant_suid = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max = MINUS_ONE_INTEGER;
        if (NIL != max_constant_suid) {
            max = max_constant_suid;
        } else {
            final SubLObject idx = do_constants_table();
            final SubLObject mess = $$$Determining_maximum_constant_SUID;
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
                    final SubLObject idx_$7 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$7, $SKIP)) {
                        final SubLObject idx_$8 = idx_$7;
                        if (NIL == id_index_dense_objects_empty_p(idx_$8, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$8);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject constant;
                            SubLObject suid;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                constant = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(constant)) {
                                        constant = $SKIP;
                                    }
                                    suid = constant_suid(constant);
                                    max = max(max, suid);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$9 = idx_$7;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$9)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$9);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$9);
                            final SubLObject end_id = id_index_next_id(idx_$9);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
                                    final SubLObject suid2 = constant_suid(constant2);
                                    max = max(max, suid2);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject next_suid = add(max, ONE_INTEGER);
        set_id_index_next_id($constant_from_suid$.getGlobalValue(), next_suid);
        return next_suid;
    }

    public static SubLObject register_constant_suid(final SubLObject constant, final SubLObject suid) {
        reset_constant_suid(constant, suid);
        id_index_enter($constant_from_suid$.getGlobalValue(), suid, constant);
        return constant;
    }

    public static SubLObject deregister_constant_suid(final SubLObject suid) {
        return id_index_remove($constant_from_suid$.getGlobalValue(), suid);
    }

    public static SubLObject make_constant_suid() {
        return id_index_reserve($constant_from_suid$.getGlobalValue());
    }

    public static SubLObject do_old_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        constant = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$11 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list29);
            current_$11 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list29);
            if (NIL == member(current_$11, $list30, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$11 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list29);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject threshold = $sym31$THRESHOLD;
        return list(CLET, list(bq_cons(threshold, $list32)), listS(DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID, list(constant, $list8, threshold, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
    }

    public static SubLObject do_new_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        constant = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$12 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list29);
            current_$12 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list29);
            if (NIL == member(current_$12, $list30, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$12 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list29);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject start = $sym34$START;
        return list(CLET, list(bq_cons(start, $list32)), listS(DO_KB_SUID_TABLE_STARTING_AT_ID, list(constant, $list8, start, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
    }

    public static SubLObject new_new_constants_iterator() {
        return iteration.new_indirect_iterator(iteration.new_filter_iterator(new_id_index_ordered_iterator(do_constants_table()), $sym36$NEW_CONSTANTS_TABLE_ENTRY_, list(new_constant_suid_threshold())), CONSTANTS_TABLE_TUPLE_TO_CONSTANT, UNPROVIDED);
    }

    public static SubLObject new_constants_table_entryP(final SubLObject tuple, final SubLObject id_threshold) {
        SubLObject id = NIL;
        SubLObject payload = NIL;
        destructuring_bind_must_consp(tuple, tuple, $list38);
        id = tuple.first();
        SubLObject current = tuple.rest();
        destructuring_bind_must_consp(current, tuple, $list38);
        payload = current.first();
        current = current.rest();
        if (NIL == current) {
            return numGE(id, id_threshold);
        }
        cdestructuring_bind_error(tuple, $list38);
        return NIL;
    }

    public static SubLObject constants_table_tuple_to_constant(final SubLObject tuple) {
        SubLObject id = NIL;
        SubLObject payload = NIL;
        destructuring_bind_must_consp(tuple, tuple, $list38);
        id = tuple.first();
        SubLObject current = tuple.rest();
        destructuring_bind_must_consp(current, tuple, $list38);
        payload = current.first();
        current = current.rest();
        if (NIL == current) {
            return find_constant_by_suid(id);
        }
        cdestructuring_bind_error(tuple, $list38);
        return NIL;
    }

    public static SubLObject constant_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_constant(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject constant_p(final SubLObject v_object) {
        return v_object.getClass() == constant_handles.$constant_native.class ? T : NIL;
    }

    public static SubLObject c_suid(final SubLObject v_object) {
        assert NIL != constant_p(v_object) : "constant_handles.constant_p(v_object) " + "CommonSymbols.NIL != constant_handles.constant_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject c_name(final SubLObject v_object) {
        assert NIL != constant_p(v_object) : "constant_handles.constant_p(v_object) " + "CommonSymbols.NIL != constant_handles.constant_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_c_suid(final SubLObject v_object, final SubLObject value) {
        assert NIL != constant_p(v_object) : "constant_handles.constant_p(v_object) " + "CommonSymbols.NIL != constant_handles.constant_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_c_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != constant_p(v_object) : "constant_handles.constant_p(v_object) " + "CommonSymbols.NIL != constant_handles.constant_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_constant(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new constant_handles.$constant_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SUID)) {
                _csetf_c_suid(v_new, current_value);
            } else
                if (pcase_var.eql($NAME)) {
                    _csetf_c_name(v_new, current_value);
                } else {
                    Errors.error($str55$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_constant(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CONSTANT, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SUID, c_suid(obj));
        funcall(visitor_fn, obj, $SLOT, $NAME, c_name(obj));
        funcall(visitor_fn, obj, $END, MAKE_CONSTANT, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_constant_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_constant(obj, visitor_fn);
    }

    public static SubLObject print_constant(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject name = c_name(v_object);
        final SubLObject suid = c_suid(v_object);
        if (name.isString()) {
            format(stream, $str61$___a, name);
        } else
            if (v_object.eql(cfasl_kb_methods.cfasl_invalid_constant())) {
                format(stream, $str62$_The_CFASL_invalid_constant_);
            } else
                if (suid.isInteger()) {
                    format(stream, $str63$_Constant__a_, suid);
                } else {
                    compatibility.default_struct_print_function(v_object, stream, depth);
                }


        return v_object;
    }

    public static SubLObject sxhash_constant_method(final SubLObject v_object) {
        final SubLObject suid = c_suid(v_object);
        if (suid.isInteger()) {
            return suid;
        }
        return ZERO_INTEGER;
    }

    public static SubLObject get_constant() {
        SubLObject constant = NIL;
        constant = make_constant(UNPROVIDED);
        return constant;
    }

    public static SubLObject init_constant(final SubLObject constant) {
        _csetf_c_suid(constant, NIL);
        return constant;
    }

    public static SubLObject free_constant(final SubLObject constant) {
        return init_constant(constant);
    }

    public static SubLObject valid_constant_handleP(final SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && (NIL != constant_handle_validP(constant)));
    }

    public static SubLObject valid_constantP(final SubLObject constant, SubLObject robust) {
        if (robust == UNPROVIDED) {
            robust = NIL;
        }
        arete.arete_note_constant_touched(constant);
        return valid_constant_handleP(constant);
    }

    public static SubLObject valid_constant_robustP(final SubLObject constant) {
        if (NIL != valid_constantP(constant, UNPROVIDED)) {
            final SubLObject name = constants_high.constant_name(constant);
            final SubLObject index = constants_low.constant_index(constant);
            return makeBoolean((name.isString() || ($UNNAMED == name)) && (NIL != index_installed_p(index)));
        }
        return NIL;
    }

    public static SubLObject valid_constant(final SubLObject constant, SubLObject robust) {
        if (robust == UNPROVIDED) {
            robust = NIL;
        }
        return valid_constantP(constant, UNPROVIDED);
    }

    public static SubLObject invalid_constant_handleP(final SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && (NIL == valid_constant_handleP(constant)));
    }

    public static SubLObject invalid_constantP(final SubLObject constant, SubLObject robust) {
        if (robust == UNPROVIDED) {
            robust = NIL;
        }
        return makeBoolean((NIL != constant_p(constant)) && (NIL == valid_constantP(constant, UNPROVIDED)));
    }

    public static SubLObject invalid_constant_robustP(final SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && (NIL == valid_constant_robustP(constant)));
    }

    public static SubLObject invalid_constant_names() {
        return hash_table_utilities.hash_table_keys($invalid_constants$.getGlobalValue());
    }

    public static SubLObject clear_invalid_constants_table() {
        return clrhash($invalid_constants$.getGlobalValue());
    }

    public static SubLObject find_invalid_constant(final SubLObject name) {
        return gethash(name, $invalid_constants$.getGlobalValue(), NIL);
    }

    public static SubLObject register_invalid_constant_by_name(final SubLObject constant, final SubLObject name) {
        return sethash(name, $invalid_constants$.getGlobalValue(), constant);
    }

    public static SubLObject deregister_invalid_constant_by_name(final SubLObject name) {
        return remhash(name, $invalid_constants$.getGlobalValue());
    }

    public static SubLObject synchronize_constants_with_hl_store() {
        return NIL != hl_interface_infrastructure.hl_access_remoteP() ? synchronize_constants_with_remote_hl_store() : synchronize_constants_with_local_hl_store();
    }

    public static SubLObject synchronize_constants_with_remote_hl_store() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = do_constants_table();
        final SubLObject mess = $str77$clearing_local_constant_informati;
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
                final SubLObject idx_$13 = idx;
                if (NIL == id_index_objects_empty_p(idx_$13, $SKIP)) {
                    final SubLObject idx_$14 = idx_$13;
                    if (NIL == id_index_dense_objects_empty_p(idx_$14, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$14);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject constant;
                        SubLObject suid;
                        SubLObject name;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            constant = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(constant)) {
                                    constant = $SKIP;
                                }
                                suid = constant_suid(constant);
                                if (suid.isInteger()) {
                                    deregister_constant_suid(suid);
                                    reset_constant_suid(constant, NIL);
                                    name = constants_high.constant_name(constant);
                                    if (name.isString()) {
                                        register_invalid_constant_by_name(constant, name);
                                    }
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$15 = idx_$13;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$15)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$15);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$15);
                        final SubLObject end_id = id_index_next_id(idx_$15);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
                                final SubLObject suid2 = constant_suid(constant2);
                                if (suid2.isInteger()) {
                                    deregister_constant_suid(suid2);
                                    reset_constant_suid(constant2, NIL);
                                    final SubLObject name2 = constants_high.constant_name(constant2);
                                    if (name2.isString()) {
                                        register_invalid_constant_by_name(constant2, name2);
                                    }
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
            constants_low.clear_constant_guid_table();
            constant_completion_low.clear_constant_completion_table();
        }
        final SubLObject constant_info_iterator = constants_interface.kb_new_constant_info_iterator($int$50000);
        SubLObject count = ZERO_INTEGER;
        try {
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject constant_info = iteration.iteration_next(constant_info_iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = constant_info;
                    SubLObject internal_id = NIL;
                    SubLObject name3 = NIL;
                    SubLObject external_id = NIL;
                    destructuring_bind_must_consp(current, datum, $list79);
                    internal_id = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list79);
                    name3 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list79);
                    external_id = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject constant3 = make_constant_shell(name3, T);
                        if (internal_id.isInteger()) {
                            constants_low.install_constant_internal_id(constant3, internal_id);
                            if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
                                constants_low.install_constant_external_id(constant3, external_id);
                                constant_completion_low.add_constant_to_completions(constant3, name3);
                            }
                            deregister_invalid_constant_by_name(name3);
                            count = add(count, ONE_INTEGER);
                        } else {
                            if (constant_suid(constant3).isInteger()) {
                                reset_constant_suid(constant3, NIL);
                            }
                            register_invalid_constant_by_name(constant3, name3);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list79);
                    }
                }
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                hl_interface_infrastructure.destroy_hl_store_iterator(constant_info_iterator);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return count;
    }

    public static SubLObject synchronize_constants_with_local_hl_store() {
        SubLObject name = NIL;
        SubLObject constant = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator($invalid_constants$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                name = getEntryKey(cdohash_entry);
                constant = getEntryValue(cdohash_entry);
                final SubLObject old_constant = constant_completion_low.constant_shell_from_name(name);
                if (NIL != constant_p(old_constant)) {
                    SubLObject current;
                    final SubLObject datum = current = constants_low.constant_info(old_constant);
                    SubLObject internal_id = NIL;
                    SubLObject name_$17 = NIL;
                    SubLObject external_id = NIL;
                    destructuring_bind_must_consp(current, datum, $list79);
                    internal_id = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list79);
                    name_$17 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list79);
                    external_id = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        constants_low.kb_remove_constant_internal(old_constant);
                        constants_low.install_constant_internal_id(constant, internal_id);
                        constants_low.install_constant_external_id(constant, external_id);
                        constant_completion_low.add_constant_to_completions(constant, name_$17);
                        deregister_invalid_constant_by_name(name_$17);
                    } else {
                        cdestructuring_bind_error(datum, $list79);
                    }
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static SubLObject make_constant_shell(final SubLObject name, SubLObject use_existingP) {
        if (use_existingP == UNPROVIDED) {
            use_existingP = NIL;
        }
        assert NIL != constant_completion_high.constant_name_spec_p(name) : "constant_completion_high.constant_name_spec_p(name) " + "CommonSymbols.NIL != constant_completion_high.constant_name_spec_p(name) " + name;
        if ((NIL != use_existingP) && name.isString()) {
            SubLObject found = constant_completion_low.constant_shell_from_name(name);
            if (NIL != found) {
                return found;
            }
            found = find_invalid_constant(name);
            if (NIL != found) {
                return found;
            }
        }
        final SubLObject constant = make_constant_shell_internal(name, T);
        if (name.isString()) {
            register_invalid_constant_by_name(constant, name);
        }
        return constant;
    }

    public static SubLObject make_constant_shell_internal(final SubLObject name, final SubLObject v_static) {
        SubLObject constant = NIL;
        constant = get_constant();
        _csetf_c_name(constant, name);
        return constant;
    }

    public static SubLObject reader_make_constant_shell(final SubLObject constant_name) {
        return make_constant_shell(constant_name, T);
    }

    public static SubLObject reader_make_constant_shell(final String constant_name) {
        return reader_make_constant_shell(makeString(constant_name));
    }

    public static SubLObject make_bogus_constant_shell(final SubLObject name) {
        assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
        return make_constant_shell_internal(name, NIL);
    }

    public static SubLObject create_sample_invalid_constant() {
        return make_constant_shell_internal(NIL, NIL);
    }

    public static SubLObject partition_create_invalid_constant() {
        return make_constant_shell($UNNAMED, UNPROVIDED);
    }

    public static SubLObject free_all_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = do_constants_table();
        final SubLObject mess = $$$Freeing_constants;
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
                final SubLObject idx_$18 = idx;
                if (NIL == id_index_objects_empty_p(idx_$18, $SKIP)) {
                    final SubLObject idx_$19 = idx_$18;
                    if (NIL == id_index_dense_objects_empty_p(idx_$19, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$19);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject constant;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            constant = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(constant)) {
                                    constant = $SKIP;
                                }
                                free_term_index(constant);
                                free_constant(constant);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$20 = idx_$18;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$20)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$20);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$20);
                        final SubLObject end_id = id_index_next_id(idx_$20);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
                                free_term_index(constant2);
                                free_constant(constant2);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        clear_constant_tables();
        return NIL;
    }

    public static SubLObject constant_suid(final SubLObject constant) {
        assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
        return c_suid(constant);
    }

    public static SubLObject install_constant_suid(final SubLObject constant, final SubLObject suid) {
        assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
        assert NIL != integerp(suid) : "Types.integerp(suid) " + "CommonSymbols.NIL != Types.integerp(suid) " + suid;
        if (!constant_suid(constant).isInteger()) {
            register_constant_suid(constant, suid);
        }
        return constant;
    }

    public static SubLObject reset_constant_suid(final SubLObject constant, final SubLObject new_suid) {
        _csetf_c_suid(constant, new_suid);
        return constant;
    }

    public static SubLObject constant_handle_validP(final SubLObject constant) {
        return integerp(constant_suid(constant));
    }

    public static SubLObject find_constant_by_suid(final SubLObject suid) {
        assert NIL != integerp(suid) : "Types.integerp(suid) " + "CommonSymbols.NIL != Types.integerp(suid) " + suid;
        return lookup_constant_by_suid(suid);
    }

    public static SubLObject setup_constant_tables(final SubLObject size, final SubLObject exactP) {
        constants_low.setup_constant_guid_table(size, exactP);
        setup_constant_suid_table(size, exactP);
        constant_index_manager.setup_constant_index_table(size, exactP);
        return NIL;
    }

    public static SubLObject finalize_constants(SubLObject max_constant_suid) {
        if (max_constant_suid == UNPROVIDED) {
            max_constant_suid = NIL;
        }
        finalize_constant_suid_table(max_constant_suid);
        return NIL;
    }

    public static SubLObject clear_constant_tables() {
        constants_low.clear_constant_guid_table();
        clear_constant_suid_table();
        return NIL;
    }

    public static SubLObject rebuild_constant_completion_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject code_constants = constant_completion.constants_mentioned_in_code();
        constant_completion_low.clear_constant_completion_table();
        final SubLObject idx = do_constants_table();
        final SubLObject mess = $str83$Rebuilding_constant_completion_ta;
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
                final SubLObject idx_$22 = idx;
                if (NIL == id_index_objects_empty_p(idx_$22, $SKIP)) {
                    final SubLObject idx_$23 = idx_$22;
                    if (NIL == id_index_dense_objects_empty_p(idx_$23, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$23);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject constant;
                        SubLObject name;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            constant = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(constant)) {
                                    constant = $SKIP;
                                }
                                if (NIL != valid_constantP(constant, UNPROVIDED)) {
                                    name = constants_high.constant_name(constant);
                                    if (name.isString()) {
                                        constant_completion_low.add_constant_to_completions(constant, name);
                                    }
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$24 = idx_$22;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$24)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$24);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$24);
                        final SubLObject end_id = id_index_next_id(idx_$24);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
                                if (NIL != valid_constantP(constant2, UNPROVIDED)) {
                                    final SubLObject name2 = constants_high.constant_name(constant2);
                                    if (name2.isString()) {
                                        constant_completion_low.add_constant_to_completions(constant2, name2);
                                    }
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = code_constants;
        SubLObject constant3 = NIL;
        constant3 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == valid_constantP(constant3, UNPROVIDED)) {
                final SubLObject name3 = constants_high.constant_name(constant3);
                if (name3.isString()) {
                    constant_completion_low.add_constant_to_completions(constant3, name3);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            constant3 = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject remove_invalid_constants_from_completions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalid_constants = NIL;
        final SubLObject iterator = constant_completion_high.new_constant_completion_iterator(T, UNPROVIDED);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject constant = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != valid) && (NIL != invalid_constant_handleP(constant))) {
                invalid_constants = cons(constant, invalid_constants);
            }
        }
        iteration.iteration_finalize(iterator);
        SubLObject cdolist_list_var = invalid_constants;
        SubLObject constant2 = NIL;
        constant2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject name = constants_high.constant_name(constant2);
            if (name.isString()) {
                constant_completion_low.remove_constant_from_completions(constant2, name);
                register_invalid_constant_by_name(constant2, name);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constant2 = cdolist_list_var.first();
        } 
        return length(invalid_constants);
    }

    public static SubLObject declare_constant_handles_file() {
        SubLPackage.setCurrentPackage("CYC");
        declareFunction(me, "new_constants_iterator", "NEW-CONSTANTS-ITERATOR", 0, 0, false);
        declareMacro(me, "do_constants", "DO-CONSTANTS");
        declareFunction(me, "do_constants_table", "DO-CONSTANTS-TABLE", 0, 0, false);
        declareFunction(me, "map_constants", "MAP-CONSTANTS", 1, 0, false);
        declareFunction(me, "setup_constant_suid_table", "SETUP-CONSTANT-SUID-TABLE", 2, 0, false);
        declareFunction(me, "finalize_constant_suid_table", "FINALIZE-CONSTANT-SUID-TABLE", 0, 1, false);
        declareFunction(me, "clear_constant_suid_table", "CLEAR-CONSTANT-SUID-TABLE", 0, 0, false);
        declareFunction(me, "create_constant_dump_id_table", "CREATE-CONSTANT-DUMP-ID-TABLE", 0, 0, false);
        declareFunction(me, "new_dense_constant_id_index", "NEW-DENSE-CONSTANT-ID-INDEX", 0, 0, false);
        declareFunction(me, "constant_count", "CONSTANT-COUNT", 0, 0, false);
        declareFunction(me, "lookup_constant_by_suid", "LOOKUP-CONSTANT-BY-SUID", 1, 0, false);
        declareFunction(me, "next_constant_suid", "NEXT-CONSTANT-SUID", 0, 0, false);
        declareFunction(me, "new_constant_suid_threshold", "NEW-CONSTANT-SUID-THRESHOLD", 0, 0, false);
        declareFunction(me, "set_new_constant_suid_threshold", "SET-NEW-CONSTANT-SUID-THRESHOLD", 1, 0, false);
        declareFunction(me, "old_constant_count", "OLD-CONSTANT-COUNT", 0, 0, false);
        declareFunction(me, "new_constant_count", "NEW-CONSTANT-COUNT", 0, 0, false);
        declareFunction(me, "missing_old_constant_internal_ids", "MISSING-OLD-CONSTANT-INTERNAL-IDS", 0, 0, false);
        declareFunction(me, "missing_constant_id_set", "MISSING-CONSTANT-ID-SET", 0, 0, false);
        declareFunction(me, "deleted_constant_id_iterator", "DELETED-CONSTANT-ID-ITERATOR", 0, 0, false);
        declareMacro(me, "do_deleted_constant_ids", "DO-DELETED-CONSTANT-IDS");
        declareFunction(me, "has_new_constantsP", "HAS-NEW-CONSTANTS?", 0, 0, false);
        declareFunction(me, "set_next_constant_suid", "SET-NEXT-CONSTANT-SUID", 0, 1, false);
        declareFunction(me, "register_constant_suid", "REGISTER-CONSTANT-SUID", 2, 0, false);
        declareFunction(me, "deregister_constant_suid", "DEREGISTER-CONSTANT-SUID", 1, 0, false);
        declareFunction(me, "make_constant_suid", "MAKE-CONSTANT-SUID", 0, 0, false);
        declareMacro(me, "do_old_constants", "DO-OLD-CONSTANTS");
        declareMacro(me, "do_new_constants", "DO-NEW-CONSTANTS");
        declareFunction(me, "new_new_constants_iterator", "NEW-NEW-CONSTANTS-ITERATOR", 0, 0, false);
        declareFunction(me, "new_constants_table_entryP", "NEW-CONSTANTS-TABLE-ENTRY?", 2, 0, false);
        declareFunction(me, "constants_table_tuple_to_constant", "CONSTANTS-TABLE-TUPLE-TO-CONSTANT", 1, 0, false);
        declareFunction(me, "constant_print_function_trampoline", "CONSTANT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        new constant_handles.$constant_print_function_trampoline$BinaryFunction();
        declareFunction(me, "constant_p", "CONSTANT-P", 1, 0, false);
        new constant_handles.$constant_p$UnaryFunction();
        declareFunction(me, "c_suid", "C-SUID", 1, 0, false);
        declareFunction(me, "c_name", "C-NAME", 1, 0, false);
        declareFunction(me, "_csetf_c_suid", "_CSETF-C-SUID", 2, 0, false);
        declareFunction(me, "_csetf_c_name", "_CSETF-C-NAME", 2, 0, false);
        declareFunction(me, "make_constant", "MAKE-CONSTANT", 0, 1, false);
        declareFunction(me, "visit_defstruct_constant", "VISIT-DEFSTRUCT-CONSTANT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_constant_method", "VISIT-DEFSTRUCT-OBJECT-CONSTANT-METHOD", 2, 0, false);
        declareFunction(me, "print_constant", "PRINT-CONSTANT", 3, 0, false);
        declareFunction(me, "sxhash_constant_method", "SXHASH-CONSTANT-METHOD", 1, 0, false);
        new constant_handles.$sxhash_constant_method$UnaryFunction();
        declareFunction(me, "get_constant", "GET-CONSTANT", 0, 0, false);
        declareFunction(me, "init_constant", "INIT-CONSTANT", 1, 0, false);
        declareFunction(me, "free_constant", "FREE-CONSTANT", 1, 0, false);
        declareFunction(me, "valid_constant_handleP", "VALID-CONSTANT-HANDLE?", 1, 0, false);
        declareFunction(me, "valid_constantP", "VALID-CONSTANT?", 1, 1, false);
        new constant_handles.$valid_constantP$UnaryFunction();
        new constant_handles.$valid_constantP$BinaryFunction();
        declareFunction(me, "valid_constant_robustP", "VALID-CONSTANT-ROBUST?", 1, 0, false);
        declareFunction(me, "valid_constant", "VALID-CONSTANT", 1, 1, false);
        declareFunction(me, "invalid_constant_handleP", "INVALID-CONSTANT-HANDLE?", 1, 0, false);
        declareFunction(me, "invalid_constantP", "INVALID-CONSTANT?", 1, 1, false);
        new constant_handles.$invalid_constantP$UnaryFunction();
        new constant_handles.$invalid_constantP$BinaryFunction();
        declareFunction(me, "invalid_constant_robustP", "INVALID-CONSTANT-ROBUST?", 1, 0, false);
        declareFunction(me, "invalid_constant_names", "INVALID-CONSTANT-NAMES", 0, 0, false);
        declareFunction(me, "clear_invalid_constants_table", "CLEAR-INVALID-CONSTANTS-TABLE", 0, 0, false);
        declareFunction(me, "find_invalid_constant", "FIND-INVALID-CONSTANT", 1, 0, false);
        declareFunction(me, "register_invalid_constant_by_name", "REGISTER-INVALID-CONSTANT-BY-NAME", 2, 0, false);
        declareFunction(me, "deregister_invalid_constant_by_name", "DEREGISTER-INVALID-CONSTANT-BY-NAME", 1, 0, false);
        declareFunction(me, "synchronize_constants_with_hl_store", "SYNCHRONIZE-CONSTANTS-WITH-HL-STORE", 0, 0, false);
        declareFunction(me, "synchronize_constants_with_remote_hl_store", "SYNCHRONIZE-CONSTANTS-WITH-REMOTE-HL-STORE", 0, 0, false);
        declareFunction(me, "synchronize_constants_with_local_hl_store", "SYNCHRONIZE-CONSTANTS-WITH-LOCAL-HL-STORE", 0, 0, false);
        declareFunction(me, "make_constant_shell", "MAKE-CONSTANT-SHELL", 1, 1, false);
        declareFunction(me, "make_constant_shell_internal", "MAKE-CONSTANT-SHELL-INTERNAL", 2, 0, false);
        declareFunction(me, "reader_make_constant_shell", "READER-MAKE-CONSTANT-SHELL", 1, 0, false);
        declareFunction(me, "make_bogus_constant_shell", "MAKE-BOGUS-CONSTANT-SHELL", 1, 0, false);
        declareFunction(me, "create_sample_invalid_constant", "CREATE-SAMPLE-INVALID-CONSTANT", 0, 0, false);
        declareFunction(me, "partition_create_invalid_constant", "PARTITION-CREATE-INVALID-CONSTANT", 0, 0, false);
        declareFunction(me, "free_all_constants", "FREE-ALL-CONSTANTS", 0, 0, false);
        declareFunction(me, "constant_suid", "CONSTANT-SUID", 1, 0, false);
        declareFunction(me, "install_constant_suid", "INSTALL-CONSTANT-SUID", 2, 0, false);
        declareFunction(me, "reset_constant_suid", "RESET-CONSTANT-SUID", 2, 0, false);
        declareFunction(me, "constant_handle_validP", "CONSTANT-HANDLE-VALID?", 1, 0, false);
        declareFunction(me, "find_constant_by_suid", "FIND-CONSTANT-BY-SUID", 1, 0, false);
        declareFunction(me, "setup_constant_tables", "SETUP-CONSTANT-TABLES", 2, 0, false);
        declareFunction(me, "finalize_constants", "FINALIZE-CONSTANTS", 0, 1, false);
        declareFunction(me, "clear_constant_tables", "CLEAR-CONSTANT-TABLES", 0, 0, false);
        declareFunction(me, "rebuild_constant_completion_table", "REBUILD-CONSTANT-COMPLETION-TABLE", 0, 0, false);
        declareFunction(me, "remove_invalid_constants_from_completions", "REMOVE-INVALID-CONSTANTS-FROM-COMPLETIONS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_constant_handles_file() {
        deflexical("*CONSTANT-FROM-SUID*", SubLTrampolineFile.maybeDefault($constant_from_suid$, $constant_from_suid$, NIL));
        deflexical("*NEW-CONSTANT-SUID-THRESHOLD*", SubLTrampolineFile.maybeDefault($new_constant_suid_threshold$, $new_constant_suid_threshold$, NIL));
        defconstant("*DTP-CONSTANT*", CONSTANT);
        deflexical("*INVALID-CONSTANTS*", SubLTrampolineFile.maybeDefault($invalid_constants$, $invalid_constants$, () -> make_hash_table($int$4000, symbol_function(EQUAL), UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_constant_handles_file() {
        declare_defglobal($constant_from_suid$);
        register_cyc_api_macro(DO_CONSTANTS, $list2, $str11$Iterate_over_all_HL_constant_data);
        register_macro_helper(DO_CONSTANTS_TABLE, DO_CONSTANTS);
        register_macro_helper(CREATE_CONSTANT_DUMP_ID_TABLE, WITH_CONSTANT_DUMP_ID_TABLE);
        register_cyc_api_function(CONSTANT_COUNT, NIL, $str18$Return_the_total_number_of_consta, NIL, $list19);
        declare_defglobal($new_constant_suid_threshold$);
        note_funcall_helper_function($sym36$NEW_CONSTANTS_TABLE_ENTRY_);
        note_funcall_helper_function(CONSTANTS_TABLE_TUPLE_TO_CONSTANT);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(CONSTANT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list48);
        def_csetf(C_SUID, _CSETF_C_SUID);
        def_csetf(C_NAME, _CSETF_C_NAME);
        identity(CONSTANT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CONSTANT_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(SXHASH_CONSTANT_METHOD));
        register_cyc_api_function(CONSTANT_P, $list65, $str66$Return_T_iff_the_argument_is_a_Cy, NIL, $list67);
        register_cyc_api_function($sym68$VALID_CONSTANT_, $list69, $str70$Return_T_if_CONSTANT_is_a_valid__, NIL, $list67);
        register_obsolete_cyc_api_function(VALID_CONSTANT, $list73, $list69, $str74$Deprecated_in_favor_of_valid_cons, NIL, $list67);
        declare_defglobal($invalid_constants$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_constant_handles_file();
    }

    @Override
    public void initializeVariables() {
        init_constant_handles_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_constant_handles_file();
    }

    static {

























































































    }

    public static final class $constant_native extends SubLStructNative {
        public SubLObject $suid;

        public SubLObject $name;

        private static final SubLStructDeclNative structDecl;

        public $constant_native() {
            this.$suid = Lisp.NIL;
            this.$name = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$suid;
        }

        @Override
        public SubLObject getField3() {
            return this.$name;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$suid = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$name = value;
        }

        static {
            structDecl = makeStructDeclNative(constant_handles.$constant_native.class, CONSTANT, CONSTANT_P, $list42, $list43, new String[]{ "$suid", "$name" }, $list44, $list45, PRINT_CONSTANT);
            structDecl.setTrackStructInstance(true, -1);
        }
    }

    public static final class $constant_print_function_trampoline$BinaryFunction extends BinaryFunction {
        public $constant_print_function_trampoline$BinaryFunction() {
            super(extractFunctionNamed("CONSTANT-PRINT-FUNCTION-TRAMPOLINE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return constant_print_function_trampoline(arg1, arg2);
        }
    }

    public static final class $constant_p$UnaryFunction extends UnaryFunction {
        public $constant_p$UnaryFunction() {
            super(extractFunctionNamed("CONSTANT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return constant_p(arg1);
        }
    }

    public static final class $sxhash_constant_method$UnaryFunction extends UnaryFunction {
        public $sxhash_constant_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-CONSTANT-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sxhash_constant_method(arg1);
        }
    }

    public static final class $valid_constantP$UnaryFunction extends UnaryFunction {
        public $valid_constantP$UnaryFunction() {
            super(extractFunctionNamed("VALID-CONSTANT?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return valid_constantP(arg1, constant_handles.$valid_constantP$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $valid_constantP$BinaryFunction extends BinaryFunction {
        public $valid_constantP$BinaryFunction() {
            super(extractFunctionNamed("VALID-CONSTANT?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return valid_constantP(arg1, arg2);
        }
    }

    public static final class $invalid_constantP$UnaryFunction extends UnaryFunction {
        public $invalid_constantP$UnaryFunction() {
            super(extractFunctionNamed("INVALID-CONSTANT?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return invalid_constantP(arg1, constant_handles.$invalid_constantP$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $invalid_constantP$BinaryFunction extends BinaryFunction {
        public $invalid_constantP$BinaryFunction() {
            super(extractFunctionNamed("INVALID-CONSTANT?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return invalid_constantP(arg1, arg2);
        }
    }
}

