/**
 *
 */
/**
 *
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.control_vars.$assertion_truth$;
import static com.cyc.cycjava.cycl.control_vars.$variable_names$;
import static com.cyc.cycjava.cycl.id_index.clear_id_index;
import static com.cyc.cycjava.cycl.id_index.clone_id_index;
import static com.cyc.cycjava.cycl.id_index.fill_id_index_dense_space;
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
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class assertion_handles extends SubLTranslatedFile {
    public static final SubLFile me = new assertion_handles();

    public static final String myName = "com.cyc.cycjava.cycl.assertion_handles";

    public static final String myFingerPrint = "f80c889b3eac69ffe44762c0e23b7d885990a37c86ba630de9407b9fed1a92f3";





    // defconstant
    public static final SubLSymbol $dtp_assertion$ = makeSymbol("*DTP-ASSERTION*");

    // defparameter
    public static final SubLSymbol $print_assertions_in_cnf$ = makeSymbol("*PRINT-ASSERTIONS-IN-CNF*");

    // Internal Constants
    public static final SubLSymbol $assertion_from_id$ = makeSymbol("*ASSERTION-FROM-ID*");

    private static final SubLSymbol ASSERTIONS_TABLE_TUPLE_TO_ASSERTION = makeSymbol("ASSERTIONS-TABLE-TUPLE-TO-ASSERTION");

    private static final SubLList $list2 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc assertions")), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $$$mapping_Cyc_assertions = makeString("mapping Cyc assertions");

    private static final SubLList $list4 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $sym7$A_ID = makeUninternedSymbol("A-ID");

    private static final SubLSymbol $sym8$A_HANDLE = makeUninternedSymbol("A-HANDLE");



    private static final SubLList $list10 = list(makeSymbol("DO-ASSERTIONS-TABLE"));







    private static final SubLSymbol RESOLVE_ASSERTION_ID_VALUE_PAIR = makeSymbol("RESOLVE-ASSERTION-ID-VALUE-PAIR");

    private static final SubLSymbol DO_ASSERTIONS = makeSymbol("DO-ASSERTIONS");

    private static final SubLString $str16$Iterate_over_all_HL_assertion_dat = makeString("Iterate over all HL assertion datastructures, executing BODY within the scope of VAR.\n   VAR is bound to the assertion.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil.");



    private static final SubLSymbol DO_ASSERTIONS_TABLE = makeSymbol("DO-ASSERTIONS-TABLE");

    private static final SubLSymbol $sym19$NEW_ASSERTIONS_TABLE_ENTRY_ = makeSymbol("NEW-ASSERTIONS-TABLE-ENTRY?");

    private static final SubLList $list20 = list(makeSymbol("ID"), makeSymbol("PAYLOAD"));

    private static final SubLSymbol CREATE_ASSERTION_DUMP_ID_TABLE = makeSymbol("CREATE-ASSERTION-DUMP-ID-TABLE");

    private static final SubLSymbol WITH_ASSERTION_DUMP_ID_TABLE = makeSymbol("WITH-ASSERTION-DUMP-ID-TABLE");

    private static final SubLSymbol ASSERTION_COUNT = makeSymbol("ASSERTION-COUNT");

    private static final SubLString $str24$Return_the_total_number_of_assert = makeString("Return the total number of assertions.");

    public static final SubLList $list25 = list(makeSymbol("INTEGERP"));

    private static final SubLSymbol $new_assertion_id_threshold$ = makeSymbol("*NEW-ASSERTION-ID-THRESHOLD*");





    private static final SubLList $list29 = list(list(makeSymbol("ID"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym30$ITERATOR = makeUninternedSymbol("ITERATOR");

    private static final SubLList $list31 = list(list(makeSymbol("DELETED-ASSERTION-ID-ITERATOR")));



    private static final SubLString $$$Determining_maximum_assertion_ID = makeString("Determining maximum assertion ID");





    public static final SubLList $list36 = list(list(makeSymbol("ASSERTION"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list37 = list(makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));

    private static final SubLSymbol $sym38$THRESHOLD = makeUninternedSymbol("THRESHOLD");

    private static final SubLList $list39 = list(list(makeSymbol("GET-FILE-BACKED-ASSERTION-INTERNAL-ID-THRESHOLD")));

    private static final SubLSymbol DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID = makeSymbol("DO-KB-SUID-TABLE-UPTO-EXCLUDING-ID");

    private static final SubLSymbol $sym41$START = makeUninternedSymbol("START");

    private static final SubLSymbol DO_KB_SUID_TABLE_STARTING_AT_ID = makeSymbol("DO-KB-SUID-TABLE-STARTING-AT-ID");





    private static final SubLInteger $int$141 = makeInteger(141);

    static final SubLList $list46 = list(makeSymbol("ID"));

    static final SubLList $list47 = list(makeKeyword("ID"));

    public static final SubLList $list48 = list(makeSymbol("AS-ID"));

    static final SubLList $list49 = list(makeSymbol("_CSETF-AS-ID"));

    static final SubLSymbol PRINT_ASSERTION = makeSymbol("PRINT-ASSERTION");

    private static final SubLSymbol ASSERTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ASSERTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list52 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ASSERTION-P"));

    private static final SubLSymbol AS_ID = makeSymbol("AS-ID");

    private static final SubLSymbol _CSETF_AS_ID = makeSymbol("_CSETF-AS-ID");



    private static final SubLString $str56$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_ASSERTION = makeSymbol("MAKE-ASSERTION");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ASSERTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ASSERTION-METHOD");

    private static final SubLString $str62$__AS__S__S_ = makeString("#<AS:~S:~S>");

    private static final SubLString $str63$__AS__S_ = makeString("#<AS:~S>");

    private static final SubLString $str64$_The_CFASL_invalid_assertion_ = makeString("<The CFASL invalid assertion>");

    private static final SubLInteger $int$23 = makeInteger(23);

    private static final SubLSymbol SXHASH_ASSERTION_METHOD = makeSymbol("SXHASH-ASSERTION-METHOD");

    private static final SubLList $list67 = list(makeSymbol("OBJECT"));

    private static final SubLString $str68$Return_T_iff_OBJECT_is_an_HL_asse = makeString("Return T iff OBJECT is an HL assertion");

    private static final SubLList $list69 = list(makeSymbol("BOOLEANP"));



    private static final SubLString $$$Freeing_assertions = makeString("Freeing assertions");



    private static final SubLList $list73 = list(makeSymbol("ASSERTION"));

    private static final SubLString $str74$Return_the_id_of_this_ASSERTION_ = makeString("Return the id of this ASSERTION.");

    private static final SubLList $list75 = list(list(makeSymbol("ASSERTION"), makeSymbol("ASSERTION-P")));





    private static final SubLString $str78$Return_the_assertion_with_ID__or_ = makeString("Return the assertion with ID, or NIL if not present.");

    private static final SubLList $list79 = list(list(makeSymbol("ID"), makeSymbol("INTEGERP")));

    private static final SubLList $list80 = list(list(makeSymbol("NIL-OR"), makeSymbol("ASSERTION-P")));

    public static SubLObject new_assertions_iterator() {
        return iteration.new_indirect_iterator(new_id_index_iterator($assertion_from_id$.getGlobalValue()), ASSERTIONS_TABLE_TUPLE_TO_ASSERTION, UNPROVIDED);
    }

    public static SubLObject do_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        var = current.first();
        current = current.rest();
        final SubLObject progress_message = (current.isCons()) ? current.first() : $$$mapping_Cyc_assertions;
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
        final SubLObject a_id = $sym7$A_ID;
        final SubLObject a_handle = $sym8$A_HANDLE;
        return list(DO_ID_INDEX, list(new SubLObject[]{ a_id, a_handle, $list10, $PROGRESS_MESSAGE, progress_message, $ORDERED, T, $DONE, done }), listS(CLET, list(list(var, list(RESOLVE_ASSERTION_ID_VALUE_PAIR, a_id, a_handle))), append(body, NIL)));
    }

    public static SubLObject resolve_assertion_id_value_pair(final SubLObject id, SubLObject assertion) {
        if ($PAGED_OUT == assertion) {
            assertion = find_assertion_by_id(id);
        }
        return assertion;
    }

    public static SubLObject do_assertions_table() {
        return $assertion_from_id$.getGlobalValue();
    }

    public static SubLObject new_new_assertions_iterator() {
        return iteration.new_indirect_iterator(iteration.new_filter_iterator(new_id_index_ordered_iterator(do_assertions_table()), $sym19$NEW_ASSERTIONS_TABLE_ENTRY_, list(new_assertion_id_threshold())), ASSERTIONS_TABLE_TUPLE_TO_ASSERTION, UNPROVIDED);
    }

    public static SubLObject new_assertions_table_entryP(final SubLObject tuple, final SubLObject id_threshold) {
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

    public static SubLObject assertions_table_tuple_to_assertion(final SubLObject tuple) {
        SubLObject id = NIL;
        SubLObject payload = NIL;
        destructuring_bind_must_consp(tuple, tuple, $list20);
        id = tuple.first();
        SubLObject current = tuple.rest();
        destructuring_bind_must_consp(current, tuple, $list20);
        payload = current.first();
        current = current.rest();
        if (NIL == current) {
            return find_assertion_by_id(id);
        }
        cdestructuring_bind_error(tuple, $list20);
        return NIL;
    }

    public static SubLObject setup_assertion_table(final SubLObject size, final SubLObject exactP) {
        if (NIL != $assertion_from_id$.getGlobalValue()) {
            return NIL;
        }
        $assertion_from_id$.setGlobalValue(new_id_index(size, ZERO_INTEGER));
        return T;
    }

    public static SubLObject finalize_assertions(SubLObject max_assertion_id) {
        if (max_assertion_id == UNPROVIDED) {
            max_assertion_id = NIL;
        }
        set_next_assertion_id(max_assertion_id);
        set_new_assertion_id_threshold(next_assertion_id());
        if (NIL == max_assertion_id) {
            optimize_assertion_table();
            assertion_manager.optimize_assertion_content_table(new_assertion_id_threshold());
        }
        return NIL;
    }

    public static SubLObject optimize_assertion_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            optimize_id_index($assertion_from_id$.getGlobalValue(), UNPROVIDED);
        } finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject clear_assertion_table() {
        return clear_id_index($assertion_from_id$.getGlobalValue());
    }

    public static SubLObject create_assertion_dump_id_table() {
        return new_indirect_compact_id_index($assertion_from_id$.getGlobalValue());
    }

    public static SubLObject new_dense_assertion_id_index() {
        return clone_id_index(do_assertions_table());
    }

    public static SubLObject assertion_count() {
        if (NIL == $assertion_from_id$.getGlobalValue()) {
            return ZERO_INTEGER;
        }
        return id_index_count($assertion_from_id$.getGlobalValue());
    }

    public static SubLObject lookup_assertion(final SubLObject id) {
        final SubLObject assertion = id_index_lookup($assertion_from_id$.getGlobalValue(), id, UNPROVIDED);
        if (NIL == assertion) {
            return NIL;
        }
        if ($PAGED_OUT == assertion) {
            return make_assertion_shell(id);
        }
        return assertion;
    }

    public static SubLObject next_assertion_id() {
        return id_index_next_id($assertion_from_id$.getGlobalValue());
    }

    public static SubLObject set_new_assertion_id_threshold(final SubLObject id) {
        $new_assertion_id_threshold$.setGlobalValue(id);
        return id;
    }

    public static SubLObject new_assertion_id_threshold() {
        return NIL != $new_assertion_id_threshold$.getGlobalValue() ? $new_assertion_id_threshold$.getGlobalValue() : assertion_manager.get_file_backed_assertion_id_threshold();
    }

    public static SubLObject old_assertion_count() {
        return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), id_index_old_and_new_object_counts(do_assertions_table(), new_assertion_id_threshold()));
    }

    public static SubLObject new_assertion_count() {
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), id_index_old_and_new_object_counts(do_assertions_table(), new_assertion_id_threshold()));
    }

    public static SubLObject missing_old_assertion_ids() {
        final SubLObject id_limit = new_assertion_id_threshold();
        return id_index_missing_ids(do_assertions_table(), $DENSE, id_limit);
    }

    public static SubLObject missing_assertion_id_set() {
        return set_utilities.construct_set_from_list(id_index_missing_ids(do_assertions_table(), $ALL, UNPROVIDED), EQL, UNPROVIDED);
    }

    public static SubLObject deleted_assertion_id_iterator() {
        return iteration.new_list_iterator(id_index_missing_ids(do_assertions_table(), $ALL, UNPROVIDED));
    }

    public static SubLObject do_deleted_assertion_ids(final SubLObject macroform, final SubLObject environment) {
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

    public static SubLObject has_new_assertionsP() {
        return numG(next_assertion_id(), new_assertion_id_threshold());
    }

    public static SubLObject set_next_assertion_id(SubLObject max_assertion_id) {
        if (max_assertion_id == UNPROVIDED) {
            max_assertion_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max = MINUS_ONE_INTEGER;
        if (NIL != max_assertion_id) {
            max = max_assertion_id;
        } else {
            final SubLObject idx = do_assertions_table();
            final SubLObject mess = $$$Determining_maximum_assertion_ID;
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
                                    assertion = resolve_assertion_id_value_pair(a_id, a_handle);
                                    max = max(max, assertion_id(assertion));
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$5 = idx_$3;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$5)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$5);
                            SubLObject a_id2 = id_index_sparse_id_threshold(idx_$5);
                            final SubLObject end_id = id_index_next_id(idx_$5);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                    final SubLObject assertion2 = resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    max = max(max, assertion_id(assertion2));
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                a_id2 = add(a_id2, ONE_INTEGER);
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
        set_id_index_next_id($assertion_from_id$.getGlobalValue(), next_id);
        return next_id;
    }

    public static SubLObject register_assertion_id(final SubLObject assertion, final SubLObject id) {
        reset_assertion_id(assertion, id);
        id_index_enter($assertion_from_id$.getGlobalValue(), id, assertion);
        return assertion;
    }

    public static SubLObject deregister_assertion_id(final SubLObject id) {
        return id_index_remove($assertion_from_id$.getGlobalValue(), id);
    }

    public static SubLObject make_assertion_id() {
        return id_index_reserve($assertion_from_id$.getGlobalValue());
    }

    public static SubLObject do_old_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion = NIL;
        destructuring_bind_must_consp(current, datum, $list36);
        assertion = current.first();
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
        return list(CLET, list(bq_cons(threshold, $list39)), listS(DO_KB_SUID_TABLE_UPTO_EXCLUDING_ID, list(assertion, $list10, threshold, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
    }

    public static SubLObject do_new_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion = NIL;
        destructuring_bind_must_consp(current, datum, $list36);
        assertion = current.first();
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
        return list(CLET, list(bq_cons(start, $list39)), listS(DO_KB_SUID_TABLE_STARTING_AT_ID, list(assertion, $list10, start, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL)));
    }

    public static SubLObject get_file_backed_assertion_internal_id_threshold() {
        if (NIL != Filesys.directory_p(misc_utilities.generic_caches_directory())) {
            return dumper.get_exclusive_assertion_internal_id_limit_for_kb(misc_utilities.generic_caches_directory());
        }
        return ZERO_INTEGER;
    }

    public static SubLObject assertion_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_assertion(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject assertion_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$assertion_native.class ? T : NIL;
    }

    public static SubLObject as_id(final SubLObject v_object) {
        assert NIL != assertion_p(v_object) : "assertion_handles.assertion_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_as_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != assertion_p(v_object) : "assertion_handles.assertion_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_assertion(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $assertion_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_as_id(v_new, current_value);
            } else {
                Errors.error($str56$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_assertion(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ASSERTION, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, as_id(obj));
        funcall(visitor_fn, obj, $END, MAKE_ASSERTION, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_assertion_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_assertion(obj, visitor_fn);
    }

    public static SubLObject print_assertion(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != valid_assertionP(v_object, UNPROVIDED)) {
            final SubLObject cnf = assertions_high.possibly_assertion_cnf(v_object);
            if (NIL != cnf) {
                final SubLObject _prev_bind_0 = $variable_names$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $assertion_truth$.currentBinding(thread);
                try {
                    $variable_names$.bind(assertions_high.assertion_variable_names(v_object), thread);
                    $assertion_truth$.bind(assertions_high.assertion_truth(v_object), thread);
                    final SubLObject formula_data = (NIL != $print_assertions_in_cnf$.getDynamicValue(thread)) ? czer_utilities.possibly_escape_quote_hl_vars(cnf, UNPROVIDED) : clauses.cnf_formula(cnf, $assertion_truth$.getDynamicValue(thread));
                    final SubLObject formula_mt = assertions_high.assertion_mt(v_object);
                    format(stream, $str62$__AS__S__S_, formula_data, formula_mt);
                } finally {
                    $assertion_truth$.rebind(_prev_bind_2, thread);
                    $variable_names$.rebind(_prev_bind_0, thread);
                }
            } else {
                final SubLObject assertion_id = assertion_id(v_object);
                format(stream, $str63$__AS__S_, assertion_id);
            }
        } else
            if (v_object.eql(cfasl_kb_methods.cfasl_invalid_assertion())) {
                format(stream, $str64$_The_CFASL_invalid_assertion_);
            } else {
                compatibility.default_struct_print_function(v_object, stream, depth);
            }

        return v_object;
    }

    public static SubLObject sxhash_assertion_method(final SubLObject v_object) {
        final SubLObject id = as_id(v_object);
        if (id.isInteger()) {
            return id;
        }
        return $int$23;
    }

    public static SubLObject get_assertion() {
        SubLObject assertion = NIL;
        assertion = make_assertion(UNPROVIDED);
        return assertion;
    }

    public static SubLObject free_assertion(final SubLObject assertion) {
        _csetf_as_id(assertion, NIL);
        return assertion;
    }

    public static SubLObject valid_assertion_handleP(final SubLObject v_object) {
        return makeBoolean((NIL != assertion_p(v_object)) && (NIL != assertion_handle_validP(v_object)));
    }

    public static SubLObject valid_assertionP(final SubLObject assertion, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return valid_assertion_handleP(assertion);
    }

    public static SubLObject assertion_has_contentP(final SubLObject assertion) {
        return makeBoolean((NIL != valid_assertion_handleP(assertion)) && (NIL != list_utilities.sublisp_boolean(assertion_manager.lookup_assertion_content(assertion_id(assertion)))));
    }

    public static SubLObject assertion_id_p(final SubLObject v_object) {
        return integerp(v_object);
    }

    public static SubLObject mark_available_assertions(final SubLObject max_id, SubLObject deleted_set) {
        if (deleted_set == UNPROVIDED) {
            deleted_set = NIL;
        }
        fill_id_index_dense_space($assertion_from_id$.getGlobalValue(), $PAGED_OUT, max_id);
        if (NIL != set.set_p(deleted_set)) {
            final SubLObject set_contents_var = set.do_set_internal(deleted_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject deleted_id;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                deleted_id = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, deleted_id)) {
                    id_index_remove($assertion_from_id$.getGlobalValue(), deleted_id);
                }
            }
        }
        return max_id;
    }

    public static SubLObject make_assertion_shell(SubLObject id) {
        if (id == UNPROVIDED) {
            id = NIL;
        }
        if (NIL == id) {
            id = make_assertion_id();
        }
        assert NIL != fixnump(id) : "Types.fixnump(id) " + "CommonSymbols.NIL != Types.fixnump(id) " + id;
        final SubLObject assertion = get_assertion();
        register_assertion_id(assertion, id);
        return assertion;
    }

    public static SubLObject create_sample_invalid_assertion() {
        return get_assertion();
    }

    public static SubLObject partition_create_invalid_assertion() {
        return make_assertion_shell(UNPROVIDED);
    }

    public static SubLObject free_all_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = do_assertions_table();
        final SubLObject mess = $$$Freeing_assertions;
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
                                assertion = resolve_assertion_id_value_pair(a_id, a_handle);
                                free_assertion(assertion);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$11 = idx_$9;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$11)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$11);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$11);
                        final SubLObject end_id = id_index_next_id(idx_$11);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject assertion2 = resolve_assertion_id_value_pair(a_id2, a_handle2);
                                free_assertion(assertion2);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
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
        clear_assertion_table();
        assertion_manager.clear_assertion_content_table();
        return NIL;
    }

    public static SubLObject assertion_id(final SubLObject assertion) {
        SubLSystemTrampolineFile.enforceType(assertion, ASSERTION_P);
        return as_id(assertion);
    }

    public static SubLObject reset_assertion_id(final SubLObject assertion, final SubLObject new_id) {
        _csetf_as_id(assertion, new_id);
        return assertion;
    }

    public static SubLObject assertion_handle_validP(final SubLObject assertion) {
        return integerp(as_id(assertion));
    }

    public static SubLObject find_assertion_by_id(final SubLObject id) {
        SubLSystemTrampolineFile.enforceType(id, INTEGERP);
        return lookup_assertion(id);
    }

    public static SubLObject declare_assertion_handles_file() {
        declareFunction(me, "new_assertions_iterator", "NEW-ASSERTIONS-ITERATOR", 0, 0, false);
        declareMacro(me, "do_assertions", "DO-ASSERTIONS");
        declareFunction(me, "resolve_assertion_id_value_pair", "RESOLVE-ASSERTION-ID-VALUE-PAIR", 2, 0, false);
        declareFunction(me, "do_assertions_table", "DO-ASSERTIONS-TABLE", 0, 0, false);
        declareFunction(me, "new_new_assertions_iterator", "NEW-NEW-ASSERTIONS-ITERATOR", 0, 0, false);
        declareFunction(me, "new_assertions_table_entryP", "NEW-ASSERTIONS-TABLE-ENTRY?", 2, 0, false);
        declareFunction(me, "assertions_table_tuple_to_assertion", "ASSERTIONS-TABLE-TUPLE-TO-ASSERTION", 1, 0, false);
        declareFunction(me, "setup_assertion_table", "SETUP-ASSERTION-TABLE", 2, 0, false);
        declareFunction(me, "finalize_assertions", "FINALIZE-ASSERTIONS", 0, 1, false);
        declareFunction(me, "optimize_assertion_table", "OPTIMIZE-ASSERTION-TABLE", 0, 0, false);
        declareFunction(me, "clear_assertion_table", "CLEAR-ASSERTION-TABLE", 0, 0, false);
        declareFunction(me, "create_assertion_dump_id_table", "CREATE-ASSERTION-DUMP-ID-TABLE", 0, 0, false);
        declareFunction(me, "new_dense_assertion_id_index", "NEW-DENSE-ASSERTION-ID-INDEX", 0, 0, false);
        declareFunction(me, "assertion_count", "ASSERTION-COUNT", 0, 0, false);
        declareFunction(me, "lookup_assertion", "LOOKUP-ASSERTION", 1, 0, false);
        declareFunction(me, "next_assertion_id", "NEXT-ASSERTION-ID", 0, 0, false);
        declareFunction(me, "set_new_assertion_id_threshold", "SET-NEW-ASSERTION-ID-THRESHOLD", 1, 0, false);
        declareFunction(me, "new_assertion_id_threshold", "NEW-ASSERTION-ID-THRESHOLD", 0, 0, false);
        declareFunction(me, "old_assertion_count", "OLD-ASSERTION-COUNT", 0, 0, false);
        declareFunction(me, "new_assertion_count", "NEW-ASSERTION-COUNT", 0, 0, false);
        declareFunction(me, "missing_old_assertion_ids", "MISSING-OLD-ASSERTION-IDS", 0, 0, false);
        declareFunction(me, "missing_assertion_id_set", "MISSING-ASSERTION-ID-SET", 0, 0, false);
        declareFunction(me, "deleted_assertion_id_iterator", "DELETED-ASSERTION-ID-ITERATOR", 0, 0, false);
        declareMacro(me, "do_deleted_assertion_ids", "DO-DELETED-ASSERTION-IDS");
        declareFunction(me, "has_new_assertionsP", "HAS-NEW-ASSERTIONS?", 0, 0, false);
        declareFunction(me, "set_next_assertion_id", "SET-NEXT-ASSERTION-ID", 0, 1, false);
        declareFunction(me, "register_assertion_id", "REGISTER-ASSERTION-ID", 2, 0, false);
        declareFunction(me, "deregister_assertion_id", "DEREGISTER-ASSERTION-ID", 1, 0, false);
        declareFunction(me, "make_assertion_id", "MAKE-ASSERTION-ID", 0, 0, false);
        declareMacro(me, "do_old_assertions", "DO-OLD-ASSERTIONS");
        declareMacro(me, "do_new_assertions", "DO-NEW-ASSERTIONS");
        declareFunction(me, "get_file_backed_assertion_internal_id_threshold", "GET-FILE-BACKED-ASSERTION-INTERNAL-ID-THRESHOLD", 0, 0, false);
        declareFunction(me, "assertion_print_function_trampoline", "ASSERTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "assertion_p", "ASSERTION-P", 1, 0, false);
        new assertion_handles.$assertion_p$UnaryFunction();
        declareFunction(me, "as_id", "AS-ID", 1, 0, false);
        declareFunction(me, "_csetf_as_id", "_CSETF-AS-ID", 2, 0, false);
        declareFunction(me, "make_assertion", "MAKE-ASSERTION", 0, 1, false);
        declareFunction(me, "visit_defstruct_assertion", "VISIT-DEFSTRUCT-ASSERTION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_assertion_method", "VISIT-DEFSTRUCT-OBJECT-ASSERTION-METHOD", 2, 0, false);
        declareFunction(me, "print_assertion", "PRINT-ASSERTION", 3, 0, false);
        declareFunction(me, "sxhash_assertion_method", "SXHASH-ASSERTION-METHOD", 1, 0, false);
        new assertion_handles.$sxhash_assertion_method$UnaryFunction();
        declareFunction(me, "get_assertion", "GET-ASSERTION", 0, 0, false);
        declareFunction(me, "free_assertion", "FREE-ASSERTION", 1, 0, false);
        declareFunction(me, "valid_assertion_handleP", "VALID-ASSERTION-HANDLE?", 1, 0, false);
        declareFunction(me, "valid_assertionP", "VALID-ASSERTION?", 1, 1, false);
        declareFunction(me, "assertion_has_contentP", "ASSERTION-HAS-CONTENT?", 1, 0, false);
        declareFunction(me, "assertion_id_p", "ASSERTION-ID-P", 1, 0, false);
        declareFunction(me, "mark_available_assertions", "MARK-AVAILABLE-ASSERTIONS", 1, 1, false);
        declareFunction(me, "make_assertion_shell", "MAKE-ASSERTION-SHELL", 0, 1, false);
        declareFunction(me, "create_sample_invalid_assertion", "CREATE-SAMPLE-INVALID-ASSERTION", 0, 0, false);
        declareFunction(me, "partition_create_invalid_assertion", "PARTITION-CREATE-INVALID-ASSERTION", 0, 0, false);
        declareFunction(me, "free_all_assertions", "FREE-ALL-ASSERTIONS", 0, 0, false);
        declareFunction(me, "assertion_id", "ASSERTION-ID", 1, 0, false);
        declareFunction(me, "reset_assertion_id", "RESET-ASSERTION-ID", 2, 0, false);
        declareFunction(me, "assertion_handle_validP", "ASSERTION-HANDLE-VALID?", 1, 0, false);
        declareFunction(me, "find_assertion_by_id", "FIND-ASSERTION-BY-ID", 1, 0, false);
        new assertion_handles.$find_assertion_by_id$UnaryFunction();
        return NIL;
    }

    public static SubLObject init_assertion_handles_file() {
        deflexical("*ASSERTION-FROM-ID*", SubLSystemTrampolineFile.maybeDefault($assertion_from_id$, $assertion_from_id$, NIL));
        deflexical("*NEW-ASSERTION-ID-THRESHOLD*", SubLSystemTrampolineFile.maybeDefault($new_assertion_id_threshold$, $new_assertion_id_threshold$, NIL));
        defconstant("*DTP-ASSERTION*", ASSERTION);
        defparameter("*PRINT-ASSERTIONS-IN-CNF*", NIL);
        return NIL;
    }

    public static SubLObject setup_assertion_handles_file() {
        declare_defglobal($assertion_from_id$);
        register_cyc_api_macro(DO_ASSERTIONS, $list2, $str16$Iterate_over_all_HL_assertion_dat);
        register_macro_helper(RESOLVE_ASSERTION_ID_VALUE_PAIR, DO_ASSERTIONS);
        register_macro_helper(DO_ASSERTIONS_TABLE, DO_ASSERTIONS);
        note_funcall_helper_function($sym19$NEW_ASSERTIONS_TABLE_ENTRY_);
        note_funcall_helper_function(ASSERTIONS_TABLE_TUPLE_TO_ASSERTION);
        register_macro_helper(CREATE_ASSERTION_DUMP_ID_TABLE, WITH_ASSERTION_DUMP_ID_TABLE);
        register_cyc_api_function(ASSERTION_COUNT, NIL, $str24$Return_the_total_number_of_assert, NIL, $list25);
        declare_defglobal($new_assertion_id_threshold$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_assertion$.getGlobalValue(), symbol_function(ASSERTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list52);
        def_csetf(AS_ID, _CSETF_AS_ID);
        identity(ASSERTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_assertion$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ASSERTION_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_assertion$.getGlobalValue(), symbol_function(SXHASH_ASSERTION_METHOD));
        register_cyc_api_function(ASSERTION_P, $list67, $str68$Return_T_iff_OBJECT_is_an_HL_asse, NIL, $list69);
        register_cyc_api_function(ASSERTION_ID, $list73, $str74$Return_the_id_of_this_ASSERTION_, $list75, $list25);
        register_cyc_api_function(FIND_ASSERTION_BY_ID, $list46, $str78$Return_the_assertion_with_ID__or_, $list79, $list80);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_assertion_handles_file();
    }

    @Override
    public void initializeVariables() {
        init_assertion_handles_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_assertion_handles_file();
    }

    

    public static final class $assertion_native extends SubLStructNative {
        public SubLObject $id;

        private static final SubLStructDeclNative structDecl;

        private $assertion_native() {
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
            structDecl = makeStructDeclNative($assertion_native.class, ASSERTION, ASSERTION_P, $list46, $list47, new String[]{ "$id" }, $list48, $list49, PRINT_ASSERTION);
        }
    }

    public static final class $assertion_p$UnaryFunction extends UnaryFunction {
        public $assertion_p$UnaryFunction() {
            super(extractFunctionNamed("ASSERTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return assertion_p(arg1);
        }
    }

    public static final class $sxhash_assertion_method$UnaryFunction extends UnaryFunction {
        public $sxhash_assertion_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-ASSERTION-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sxhash_assertion_method(arg1);
        }
    }

    public static final class $find_assertion_by_id$UnaryFunction extends UnaryFunction {
        public $find_assertion_by_id$UnaryFunction() {
            super(extractFunctionNamed("FIND-ASSERTION-BY-ID"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return find_assertion_by_id(arg1);
        }
    }
}

