/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_output_object_method_table$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input_object;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_raw_write_byte;
import static com.cyc.cycjava.cycl.cfasl.register_cfasl_input_function;
import static com.cyc.cycjava.cycl.constant_handles.constant_count;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.do_constants_table;
import static com.cyc.cycjava.cycl.constant_handles.invalid_constantP;
import static com.cyc.cycjava.cycl.constant_handles.invalid_constant_robustP;
import static com.cyc.cycjava.cycl.constant_handles.new_constants_iterator;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.constant_handles.valid_constant_robustP;
import static com.cyc.cycjava.cycl.id_index.clear_id_index;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_enter;
import static com.cyc.cycjava.cycl.id_index.id_index_lookup;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_optimized_p;
import static com.cyc.cycjava.cycl.id_index.id_index_remove;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.id_index.new_id_index;
import static com.cyc.cycjava.cycl.id_index.optimize_id_index;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.new_simple_index;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_macro;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      FORTS
 * source file: /cyc/top/cycl/forts.lisp
 * created:     2019/07/03 17:37:20
 */
public final class forts extends SubLTranslatedFile implements V12 {
    public static final class $fort_id_index_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.forts.$fort_id_index_native.this.$constants;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.forts.$fort_id_index_native.this.$narts;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.forts.$fort_id_index_native.this.$constants = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.forts.$fort_id_index_native.this.$narts = value;
        }

        public SubLObject $constants = Lisp.NIL;

        public SubLObject $narts = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.forts.$fort_id_index_native.class, FORT_ID_INDEX, FORT_ID_INDEX_P, $list_alt40, $list_alt41, new String[]{ "$constants", "$narts" }, $list_alt42, $list_alt43, PRINT_FORT_ID_INDEX);
    }

    public static final SubLFile me = new forts();



    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_fort_id_index$ = makeSymbol("*DTP-FORT-ID-INDEX*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_opcode_fort_id_index$ = makeSymbol("*CFASL-OPCODE-FORT-ID-INDEX*");

    static private final SubLList $list1 = list(makeSymbol("OBJECT"));

    static private final SubLString $str2$Return_T_iff_OBJECT_is_a_first_or = makeString("Return T iff OBJECT is a first order reified term (FORT).");

    static private final SubLList $list3 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol FORT_EL_FORMULA = makeSymbol("FORT-EL-FORMULA");

    static private final SubLList $list5 = list(makeSymbol("FORT"));

    static private final SubLString $str6$Return_the_EL_formula_for_any_FOR = makeString("Return the EL formula for any FORT.");

    static private final SubLList $list7 = list(list(makeSymbol("FORT"), makeSymbol("FORT-P")));

    static private final SubLList $list8 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSP")));

    static private final SubLList $list9 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc FORTs")), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $$$mapping_Cyc_FORTs = makeString("mapping Cyc FORTs");

    static private final SubLList $list11 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym14$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");

    static private final SubLList $list16 = list(makeSymbol("DO-FORTS-TABLES"));

    static private final SubLSymbol $sym19$MESSAGE = makeUninternedSymbol("MESSAGE");

    static private final SubLSymbol $sym20$TOTAL = makeUninternedSymbol("TOTAL");

    static private final SubLSymbol $sym21$SOFAR = makeUninternedSymbol("SOFAR");

    static private final SubLList $list23 = list(list(makeSymbol("FORT-COUNT")));

    static private final SubLList $list24 = list(ZERO_INTEGER);

    private static final SubLSymbol DO_FORTS = makeSymbol("DO-FORTS");

    static private final SubLString $str29$Iterate_over_all_HL_FORT_datastru = makeString("Iterate over all HL FORT datastructures, executing BODY within the scope of VAR.\n   VAR is bound to the FORT.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts as soon as DONE becomes non-nil.");

    private static final SubLSymbol DO_FORTS_TABLES = makeSymbol("DO-FORTS-TABLES");

    private static final SubLSymbol FORT_COUNT = makeSymbol("FORT-COUNT");

    static private final SubLString $str32$Return_the_total_number_of_FORTs_ = makeString("Return the total number of FORTs.");

    static private final SubLList $list33 = list(makeSymbol("INTEGERP"));

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLString $str37$_S_was_not_a_FORT = makeString("~S was not a FORT");

    private static final SubLSymbol REMOVE_FORT = makeSymbol("REMOVE-FORT");

    private static final SubLString $str39$Remove_FORT_from_the_KB_ = makeString("Remove FORT from the KB.");

    static private final SubLList $list40 = list(makeSymbol("NULL"));

    private static final SubLSymbol FORT_ID_INDEX = makeSymbol("FORT-ID-INDEX");

    private static final SubLSymbol FORT_ID_INDEX_P = makeSymbol("FORT-ID-INDEX-P");

    static private final SubLList $list43 = list(makeSymbol("CONSTANTS"), makeSymbol("NARTS"));

    private static final SubLList $list44 = list(makeKeyword("CONSTANTS"), makeKeyword("NARTS"));

    private static final SubLList $list45 = list(makeSymbol("FORT-ID-INDEX-CONSTANTS"), makeSymbol("FORT-ID-INDEX-NARTS"));

    private static final SubLList $list46 = list(makeSymbol("_CSETF-FORT-ID-INDEX-CONSTANTS"), makeSymbol("_CSETF-FORT-ID-INDEX-NARTS"));

    private static final SubLSymbol PRINT_FORT_ID_INDEX = makeSymbol("PRINT-FORT-ID-INDEX");

    private static final SubLSymbol FORT_ID_INDEX_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FORT-ID-INDEX-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list49 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FORT-ID-INDEX-P"));

    private static final SubLSymbol FORT_ID_INDEX_CONSTANTS = makeSymbol("FORT-ID-INDEX-CONSTANTS");

    private static final SubLSymbol _CSETF_FORT_ID_INDEX_CONSTANTS = makeSymbol("_CSETF-FORT-ID-INDEX-CONSTANTS");

    private static final SubLSymbol FORT_ID_INDEX_NARTS = makeSymbol("FORT-ID-INDEX-NARTS");

    private static final SubLSymbol _CSETF_FORT_ID_INDEX_NARTS = makeSymbol("_CSETF-FORT-ID-INDEX-NARTS");

    private static final SubLString $str56$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_FORT_ID_INDEX = makeSymbol("MAKE-FORT-ID-INDEX");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FORT_ID_INDEX_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORT-ID-INDEX-METHOD");

    private static final SubLString $str62$Constant_Index_ = makeString("Constant Index:");

    private static final SubLString $str63$Nart_Index_ = makeString("Nart Index:");

    private static final SubLList $list64 = list(list(makeSymbol("ID-INDEX-VAR"), makeSymbol("ID-VAR"), makeSymbol("FORT"), makeSymbol("FORT-ID-INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list67 = list(makeSymbol("FORT-P"));

    private static final SubLList $list68 = list(makeSymbol("FORT-ID-INDEX-P"));

    private static final SubLSymbol $sym70$VALID_FORT_ = makeSymbol("VALID-FORT?");

    private static final SubLSymbol CONSTANT_INTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID");

    private static final SubLSymbol NART_ID = makeSymbol("NART-ID");

    private static final SubLList $list75 = list(list(makeSymbol("FORT"), makeSymbol("VALUE"), makeSymbol("FORT-ID-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym76$FII = makeUninternedSymbol("FII");

    private static final SubLSymbol DO_FORT_ID_INDEX_CONSTANTS = makeSymbol("DO-FORT-ID-INDEX-CONSTANTS");

    private static final SubLSymbol DO_FORT_ID_INDEX_NARTS = makeSymbol("DO-FORT-ID-INDEX-NARTS");

    private static final SubLSymbol DO_FORT_ID_INDEX = makeSymbol("DO-FORT-ID-INDEX");

    private static final SubLList $list80 = list(list(makeSymbol("CONSTANT"), makeSymbol("VALUE"), makeSymbol("FORT-ID-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym81$ID = makeUninternedSymbol("ID");

    private static final SubLSymbol DO_FII_GET_CONSTANTS = makeSymbol("DO-FII-GET-CONSTANTS");

    private static final SubLList $list85 = list(list(makeSymbol("NART"), makeSymbol("VALUE"), makeSymbol("FORT-ID-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym86$ID = makeUninternedSymbol("ID");

    private static final SubLSymbol DO_FII_GET_NARTS = makeSymbol("DO-FII-GET-NARTS");

    private static final SubLSymbol FIND_NART_BY_ID = makeSymbol("FIND-NART-BY-ID");

    private static final SubLInteger $int$99 = makeInteger(99);

    private static final SubLSymbol CFASL_INPUT_FORT_ID_INDEX = makeSymbol("CFASL-INPUT-FORT-ID-INDEX");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_FORT_ID_INDEX_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-FORT-ID-INDEX-METHOD");

    private static final SubLString $str93$Checking_that_forts_iterators_wor = makeString("Checking that forts iterators work.");

    private static final SubLSymbol $sym95$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str97$FORTS_ITERATOR_exhausted_before_D = makeString("FORTS-ITERATOR exhausted before DO-FORTS");

    private static final SubLString $str99$FORTS_ITERATOR_returned_non_fort_ = makeString("FORTS-ITERATOR returned non-fort!");

    private static final SubLString $str101$FORTS_ITERATOR_and_DO_FORTS_diffe = makeString("FORTS-ITERATOR and DO-FORTS differ in which FORT they think is next");

    private static final SubLString $str103$The_FORTS_iterator_has_more_value = makeString("The FORTS iterator has more values than DO-FORTS.");

    // Definitions
    /**
     * Return T iff OBJECT is a first order reified term (FORT).
     */
    @LispMethod(comment = "Return T iff OBJECT is a first order reified term (FORT).")
    public static final SubLObject fort_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) || (NIL != nart_handles.nart_p(v_object)));
    }

    // Definitions
    /**
     * Return T iff OBJECT is a first order reified term (FORT).
     */
    @LispMethod(comment = "Return T iff OBJECT is a first order reified term (FORT).")
    public static SubLObject fort_p(final SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) || (NIL != nart_handles.nart_p(v_object)));
    }

    public static final SubLObject non_fort_p_alt(SubLObject v_object) {
        return makeBoolean(NIL == fort_p(v_object));
    }

    public static SubLObject non_fort_p(final SubLObject v_object) {
        return makeBoolean(NIL == fort_p(v_object));
    }

    public static final SubLObject list_of_fort_p_alt(SubLObject v_object) {
        return list_utilities.list_of_type_p(FORT_P, v_object);
    }

    public static SubLObject list_of_fort_p(final SubLObject v_object) {
        return list_utilities.list_of_type_p(FORT_P, v_object);
    }

    /**
     * Return the EL formula for any FORT.
     */
    @LispMethod(comment = "Return the EL formula for any FORT.")
    public static final SubLObject fort_el_formula_alt(SubLObject fort) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        if (NIL != constant_p(fort)) {
            return fort;
        } else {
            return narts_high.nart_el_formula(fort);
        }
    }

    /**
     * Return the EL formula for any FORT.
     */
    @LispMethod(comment = "Return the EL formula for any FORT.")
    public static SubLObject fort_el_formula(final SubLObject fort) {
        SubLTrampolineFile.enforceType(fort, FORT_P);
        if (NIL != constant_p(fort)) {
            return fort;
        }
        return narts_high.nart_el_formula(fort);
    }

    /**
     * Iterate over the CONSTANTS and the NARTs in order.
     */
    @LispMethod(comment = "Iterate over the CONSTANTS and the NARTs in order.")
    public static final SubLObject new_forts_iterator_alt() {
        return iteration.new_iterator_iterator(list(new_constants_iterator(), nart_handles.new_narts_iterator()));
    }

    /**
     * Iterate over the CONSTANTS and the NARTs in order.
     */
    @LispMethod(comment = "Iterate over the CONSTANTS and the NARTs in order.")
    public static SubLObject new_forts_iterator() {
        return iteration.new_iterator_iterator(list(new_constants_iterator(), nart_handles.new_narts_iterator()));
    }

    /**
     * Iterate over all HL FORT datastructures, executing BODY within the scope of VAR.
     * VAR is bound to the FORT.
     * PROGRESS-MESSAGE is a progress message string.
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over all HL FORT datastructures, executing BODY within the scope of VAR.\r\nVAR is bound to the FORT.\r\nPROGRESS-MESSAGE is a progress message string.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over all HL FORT datastructures, executing BODY within the scope of VAR.\nVAR is bound to the FORT.\nPROGRESS-MESSAGE is a progress message string.\nIteration halts as soon as DONE becomes non-nil.")
    public static final SubLObject do_forts_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    var = current.first();
                    current = current.rest();
                    {
                        SubLObject progress_message = (current.isCons()) ? ((SubLObject) (current.first())) : $$$mapping_Cyc_FORTs;
                        destructuring_bind_must_listp(current, datum, $list_alt9);
                        current = current.rest();
                        {
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current;
                            SubLObject bad = NIL;
                            SubLObject current_1 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum, $list_alt9);
                                current_1 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum, $list_alt9);
                                if (NIL == member(current_1, $list_alt11, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_1 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum, $list_alt9);
                            }
                            {
                                SubLObject done_tail = property_list_member($DONE, current);
                                SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                                current = temp;
                                {
                                    SubLObject body = current;
                                    if (NIL == progress_message) {
                                        {
                                            SubLObject table_var = $sym14$TABLE_VAR;
                                            return list(DO_LIST, list(table_var, $list_alt16, $DONE, done), listS(DO_KB_SUID_TABLE, list(var, table_var, $PROGRESS_MESSAGE, NIL, $DONE, done), append(body, NIL)));
                                        }
                                    }
                                    {
                                        SubLObject message = $sym19$MESSAGE;
                                        SubLObject total = $sym20$TOTAL;
                                        SubLObject sofar = $sym21$SOFAR;
                                        return list(CLET, list(list(message, progress_message), bq_cons(total, $list_alt23), bq_cons(sofar, $list_alt24)), list(NOTING_PERCENT_PROGRESS, message, listS(DO_FORTS, list(var, NIL, $DONE, done), list(CINC, sofar), list(NOTE_PERCENT_PROGRESS, sofar, total), append(body, NIL))));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate over all HL FORT datastructures, executing BODY within the scope of VAR.
     * VAR is bound to the FORT.
     * PROGRESS-MESSAGE is a progress message string.
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over all HL FORT datastructures, executing BODY within the scope of VAR.\r\nVAR is bound to the FORT.\r\nPROGRESS-MESSAGE is a progress message string.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over all HL FORT datastructures, executing BODY within the scope of VAR.\nVAR is bound to the FORT.\nPROGRESS-MESSAGE is a progress message string.\nIteration halts as soon as DONE becomes non-nil.")
    public static SubLObject do_forts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        var = current.first();
        current = current.rest();
        final SubLObject progress_message = (current.isCons()) ? current.first() : $$$mapping_Cyc_FORTs;
        destructuring_bind_must_listp(current, datum, $list9);
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list9);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list9);
            if (NIL == member(current_$1, $list11, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list9);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL == progress_message) {
            final SubLObject table_var = $sym14$TABLE_VAR;
            return list(DO_LIST, list(table_var, $list16, $DONE, done), listS(DO_KB_SUID_TABLE, list(var, table_var, $PROGRESS_MESSAGE, NIL, $DONE, done), append(body, NIL)));
        }
        final SubLObject message = $sym19$MESSAGE;
        final SubLObject total = $sym20$TOTAL;
        final SubLObject sofar = $sym21$SOFAR;
        return list(CLET, list(list(message, progress_message), bq_cons(total, $list23), bq_cons(sofar, $list24)), list(NOTING_PERCENT_PROGRESS, message, listS(DO_FORTS, list(var, NIL, $DONE, done), list(CINC, sofar), list(NOTE_PERCENT_PROGRESS, sofar, total), append(body, NIL))));
    }

    public static final SubLObject do_forts_tables_alt() {
        return list(do_constants_table(), nart_handles.do_narts_table());
    }

    public static SubLObject do_forts_tables() {
        return list(do_constants_table(), nart_handles.do_narts_table());
    }

    /**
     * Return the total number of FORTs.
     */
    @LispMethod(comment = "Return the total number of FORTs.")
    public static final SubLObject fort_count_alt() {
        return add(constant_count(), nart_handles.nart_count());
    }

    /**
     * Return the total number of FORTs.
     */
    @LispMethod(comment = "Return the total number of FORTs.")
    public static SubLObject fort_count() {
        return add(constant_count(), nart_handles.nart_count());
    }

    /**
     * Return a randomly chosen FORT.
     */
    @LispMethod(comment = "Return a randomly chosen FORT.")
    public static final SubLObject random_fort() {
        {
            SubLObject fort_count = fort_count();
            SubLObject fort_type_indicator = random.random(fort_count);
            SubLObject constant_threshold = constant_count();
            if (fort_type_indicator.numL(constant_threshold)) {
                return constants_high.random_constant(UNPROVIDED);
            } else {
                return narts_high.random_nart(UNPROVIDED);
            }
        }
    }

    public static SubLObject random_fort(SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        final SubLObject fort_count = fort_count();
        if (fort_count.numG(ZERO_INTEGER)) {
            final SubLObject constant_threshold = constant_count();
            SubLObject v_answer;
            SubLObject candidate;
            for (v_answer = NIL; NIL == v_answer; v_answer = candidate) {
                final SubLObject fort_type_indicator = random.random(fort_count);
                candidate = (fort_type_indicator.numL(constant_threshold)) ? constants_high.random_constant(UNPROVIDED) : narts_high.random_nart(UNPROVIDED);
                if ((NIL != candidate) && (NIL != funcall(test, candidate))) {
                }
            }
            return v_answer;
        }
        return NIL;
    }

    public static SubLObject sample_forts(SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
        if (n == UNPROVIDED) {
            n = $int$500;
        }
        if (allow_repeatsP == UNPROVIDED) {
            allow_repeatsP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        assert NIL != subl_promotions.non_negative_integer_p(n) : "! subl_promotions.non_negative_integer_p(n) " + ("subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) ") + n;
        if (NIL != allow_repeatsP) {
            SubLObject result = NIL;
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                result = cons(random_fort(test), result);
            }
            return result;
        }
        SubLObject result;
        for (result = set_contents.new_set_contents(n, symbol_function(EQL)); set_contents.set_contents_size(result).numL(n); result = set_contents.set_contents_add(random_fort(test), result, symbol_function(EQL))) {
        }
        return set_contents.set_contents_element_list(result);
    }

    /**
     * Return the indexing structure for FORT.
     */
    @LispMethod(comment = "Return the indexing structure for FORT.")
    public static final SubLObject fort_index_alt(SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return constants_low.constant_index(fort);
        } else {
            if (NIL != nart_handles.nart_p(fort)) {
                return narts_low.nart_index(fort);
            } else {
                Errors.error($str_alt34$_S_was_not_a_FORT, fort);
            }
        }
        return NIL;
    }

    /**
     * Return the indexing structure for FORT.
     */
    @LispMethod(comment = "Return the indexing structure for FORT.")
    public static SubLObject fort_index(final SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return constants_low.constant_index(fort);
        }
        if (NIL != nart_handles.nart_p(fort)) {
            return narts_low.nart_index(fort);
        }
        Errors.error($str37$_S_was_not_a_FORT, fort);
        return NIL;
    }

    /**
     * Primitively change the assertion index for FORT to NEW-INDEX.
     */
    @LispMethod(comment = "Primitively change the assertion index for FORT to NEW-INDEX.")
    public static final SubLObject reset_fort_index_alt(SubLObject fort, SubLObject new_index) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        if (NIL != constant_p(fort)) {
            return constants_low.reset_constant_index(fort, new_index);
        } else {
            return narts_low.reset_nart_index(fort, new_index);
        }
    }

    /**
     * Primitively change the assertion index for FORT to NEW-INDEX.
     */
    @LispMethod(comment = "Primitively change the assertion index for FORT to NEW-INDEX.")
    public static SubLObject reset_fort_index(final SubLObject fort, final SubLObject new_index) {
        assert NIL != fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        if (NIL != constant_p(fort)) {
            return constants_low.reset_constant_index(fort, new_index);
        }
        return narts_low.reset_nart_index(fort, new_index);
    }

    /**
     * Primitively clear the assertion index for FORT.
     */
    @LispMethod(comment = "Primitively clear the assertion index for FORT.")
    public static final SubLObject clear_fort_index_alt(SubLObject fort) {
        return reset_fort_index(fort, new_simple_index());
    }

    /**
     * Primitively clear the assertion index for FORT.
     */
    @LispMethod(comment = "Primitively clear the assertion index for FORT.")
    public static SubLObject clear_fort_index(final SubLObject fort) {
        return reset_fort_index(fort, new_simple_index());
    }

    public static final SubLObject fort_internal_id_alt(SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return constants_high.constant_internal_id(fort);
        } else {
            return number_utilities.f_1_(minus(nart_handles.nart_id(fort)));
        }
    }

    public static SubLObject fort_internal_id(final SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return constants_high.constant_internal_id(fort);
        }
        return number_utilities.f_1_(minus(nart_handles.nart_id(fort)));
    }

    public static final SubLObject fort_external_id_alt(SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return constants_high.constant_external_id(fort);
        } else {
            return number_utilities.f_1_(minus(nart_handles.nart_id(fort)));
        }
    }

    public static SubLObject fort_external_id(final SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return constants_high.constant_external_id(fort);
        }
        return number_utilities.f_1_(minus(nart_handles.nart_id(fort)));
    }

    /**
     * Return T if FORT is a valid FORT.
     */
    @LispMethod(comment = "Return T if FORT is a valid FORT.")
    public static final SubLObject valid_fortP_alt(SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return valid_constantP(fort, UNPROVIDED);
        } else {
            if (NIL != nart_handles.nart_p(fort)) {
                return nart_handles.valid_nartP(fort, UNPROVIDED);
            } else {
                return NIL;
            }
        }
    }

    /**
     * Return T if FORT is a valid FORT.
     */
    @LispMethod(comment = "Return T if FORT is a valid FORT.")
    public static SubLObject valid_fortP(final SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return valid_constantP(fort, UNPROVIDED);
        }
        if (NIL != nart_handles.nart_p(fort)) {
            return nart_handles.valid_nartP(fort, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Return T if FORT is a valid FORT.
     * Performs more thorough checking than @xref VALID-FORT?.
     */
    @LispMethod(comment = "Return T if FORT is a valid FORT.\r\nPerforms more thorough checking than @xref VALID-FORT?.\nReturn T if FORT is a valid FORT.\nPerforms more thorough checking than @xref VALID-FORT?.")
    public static final SubLObject valid_fort_robustP_alt(SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return valid_constant_robustP(fort);
        } else {
            if (NIL != nart_handles.nart_p(fort)) {
                return nart_handles.valid_nart_robustP(fort);
            } else {
                return NIL;
            }
        }
    }

    /**
     * Return T if FORT is a valid FORT.
     * Performs more thorough checking than @xref VALID-FORT?.
     */
    @LispMethod(comment = "Return T if FORT is a valid FORT.\r\nPerforms more thorough checking than @xref VALID-FORT?.\nReturn T if FORT is a valid FORT.\nPerforms more thorough checking than @xref VALID-FORT?.")
    public static SubLObject valid_fort_robustP(final SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return valid_constant_robustP(fort);
        }
        if (NIL != nart_handles.nart_p(fort)) {
            return nart_handles.valid_nart_robustP(fort);
        }
        return NIL;
    }

    /**
     * Return T if FORT is an invalid FORT.
     */
    @LispMethod(comment = "Return T if FORT is an invalid FORT.")
    public static final SubLObject invalid_fortP_alt(SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return invalid_constantP(fort, UNPROVIDED);
        } else {
            if (NIL != nart_handles.nart_p(fort)) {
                return narts_high.invalid_nartP(fort, UNPROVIDED);
            } else {
                return NIL;
            }
        }
    }

    /**
     * Return T if FORT is an invalid FORT.
     */
    @LispMethod(comment = "Return T if FORT is an invalid FORT.")
    public static SubLObject invalid_fortP(final SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return invalid_constantP(fort, UNPROVIDED);
        }
        if (NIL != nart_handles.nart_p(fort)) {
            return narts_high.invalid_nartP(fort, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Return T if FORT is an invalid FORT.
     * Performs more thorough checking than @xref INVALID-FORT?.
     */
    @LispMethod(comment = "Return T if FORT is an invalid FORT.\r\nPerforms more thorough checking than @xref INVALID-FORT?.\nReturn T if FORT is an invalid FORT.\nPerforms more thorough checking than @xref INVALID-FORT?.")
    public static final SubLObject invalid_fort_robustP_alt(SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return invalid_constant_robustP(fort);
        } else {
            if (NIL != nart_handles.nart_p(fort)) {
                return narts_high.invalid_nart_robustP(fort);
            } else {
                return NIL;
            }
        }
    }

    /**
     * Return T if FORT is an invalid FORT.
     * Performs more thorough checking than @xref INVALID-FORT?.
     */
    @LispMethod(comment = "Return T if FORT is an invalid FORT.\r\nPerforms more thorough checking than @xref INVALID-FORT?.\nReturn T if FORT is an invalid FORT.\nPerforms more thorough checking than @xref INVALID-FORT?.")
    public static SubLObject invalid_fort_robustP(final SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return invalid_constant_robustP(fort);
        }
        if (NIL != nart_handles.nart_p(fort)) {
            return narts_high.invalid_nart_robustP(fort);
        }
        return NIL;
    }

    /**
     * Remove FORT from the KB.
     */
    @LispMethod(comment = "Remove FORT from the KB.")
    public static final SubLObject remove_fort_alt(SubLObject fort) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        if (NIL != constant_p(fort)) {
            return constants_high.remove_constant(fort);
        } else {
            return narts_high.remove_nart(fort);
        }
    }

    /**
     * Remove FORT from the KB.
     */
    @LispMethod(comment = "Remove FORT from the KB.")
    public static SubLObject remove_fort(final SubLObject fort) {
        SubLTrampolineFile.enforceType(fort, FORT_P);
        if (NIL != constant_p(fort)) {
            return constants_high.remove_constant(fort);
        }
        return narts_high.remove_nart(fort);
    }

    public static final SubLObject fort_id_index_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_fort_id_index(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject fort_id_index_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_fort_id_index(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject fort_id_index_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.forts.$fort_id_index_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject fort_id_index_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.forts.$fort_id_index_native.class ? T : NIL;
    }

    public static final SubLObject fort_id_index_constants_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FORT_ID_INDEX_P);
        return v_object.getField2();
    }

    public static SubLObject fort_id_index_constants(final SubLObject v_object) {
        assert NIL != fort_id_index_p(v_object) : "! forts.fort_id_index_p(v_object) " + "forts.fort_id_index_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject fort_id_index_narts_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FORT_ID_INDEX_P);
        return v_object.getField3();
    }

    public static SubLObject fort_id_index_narts(final SubLObject v_object) {
        assert NIL != fort_id_index_p(v_object) : "! forts.fort_id_index_p(v_object) " + "forts.fort_id_index_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_fort_id_index_constants_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FORT_ID_INDEX_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fort_id_index_constants(final SubLObject v_object, final SubLObject value) {
        assert NIL != fort_id_index_p(v_object) : "! forts.fort_id_index_p(v_object) " + "forts.fort_id_index_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_fort_id_index_narts_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FORT_ID_INDEX_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fort_id_index_narts(final SubLObject v_object, final SubLObject value) {
        assert NIL != fort_id_index_p(v_object) : "! forts.fort_id_index_p(v_object) " + "forts.fort_id_index_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_fort_id_index_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.forts.$fort_id_index_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CONSTANTS)) {
                        _csetf_fort_id_index_constants(v_new, current_value);
                    } else {
                        if (pcase_var.eql($NARTS)) {
                            _csetf_fort_id_index_narts(v_new, current_value);
                        } else {
                            Errors.error($str_alt52$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_fort_id_index(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.forts.$fort_id_index_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CONSTANTS)) {
                _csetf_fort_id_index_constants(v_new, current_value);
            } else
                if (pcase_var.eql($NARTS)) {
                    _csetf_fort_id_index_narts(v_new, current_value);
                } else {
                    Errors.error($str56$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_fort_id_index(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FORT_ID_INDEX, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CONSTANTS, fort_id_index_constants(obj));
        funcall(visitor_fn, obj, $SLOT, $NARTS, fort_id_index_narts(obj));
        funcall(visitor_fn, obj, $END, MAKE_FORT_ID_INDEX, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_fort_id_index_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_fort_id_index(obj, visitor_fn);
    }

    public static final SubLObject print_fort_id_index_alt(SubLObject fort_id_index, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(fort_id_index, stream);
            } else {
                {
                    SubLObject v_object = fort_id_index;
                    SubLObject stream_2 = stream;
                    write_string($str_alt53$__, stream_2, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object), new SubLObject[]{ $STREAM, stream_2 });
                    write_char(CHAR_space, stream_2);
                    write_string($str_alt55$Constant_Index_, stream, UNPROVIDED, UNPROVIDED);
                    princ(fort_id_index_constants(fort_id_index), stream);
                    write_string($str_alt56$Nart_Index_, stream, UNPROVIDED, UNPROVIDED);
                    princ(fort_id_index_narts(fort_id_index), stream);
                    write_char(CHAR_greater, stream_2);
                }
            }
            return fort_id_index;
        }
    }

    public static SubLObject print_fort_id_index(final SubLObject fort_id_index, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(fort_id_index, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, fort_id_index, T, T);
            write_string($str62$Constant_Index_, stream, UNPROVIDED, UNPROVIDED);
            princ(fort_id_index_constants(fort_id_index), stream);
            write_string($str63$Nart_Index_, stream, UNPROVIDED, UNPROVIDED);
            princ(fort_id_index_narts(fort_id_index), stream);
            print_macros.print_unreadable_object_postamble(stream, fort_id_index, NIL, NIL);
        }
        return fort_id_index;
    }

    public static final SubLObject with_fort_id_index_index_and_id_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt58);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject id_index_var = NIL;
                    SubLObject id_var = NIL;
                    SubLObject fort = NIL;
                    SubLObject fort_id_index = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt58);
                    id_index_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt58);
                    id_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt58);
                    fort = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt58);
                    fort_id_index = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(PROGN, listS(CHECK_TYPE, fort, $list_alt61), listS(CHECK_TYPE, fort_id_index, $list_alt62), list(PWHEN, list($sym64$VALID_FORT_, fort), listS(CLET, list(list(id_index_var, list(FIF, list(CONSTANT_P, fort), list(FORT_ID_INDEX_CONSTANTS, fort_id_index), list(FORT_ID_INDEX_NARTS, fort_id_index))), list(id_var, list(FIF, list(CONSTANT_P, fort), list(CONSTANT_INTERNAL_ID, fort), list(NART_ID, fort)))), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt58);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_fort_id_index_index_and_id(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id_index_var = NIL;
        SubLObject id_var = NIL;
        SubLObject fort = NIL;
        SubLObject fort_id_index = NIL;
        destructuring_bind_must_consp(current, datum, $list64);
        id_index_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        id_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        fort = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        fort_id_index = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, listS(CHECK_TYPE, fort, $list67), listS(CHECK_TYPE, fort_id_index, $list68), list(PWHEN, list($sym70$VALID_FORT_, fort), listS(CLET, list(list(id_index_var, list(FIF, list(CONSTANT_P, fort), list(FORT_ID_INDEX_CONSTANTS, fort_id_index), list(FORT_ID_INDEX_NARTS, fort_id_index))), list(id_var, list(FIF, list(CONSTANT_P, fort), list(CONSTANT_INTERNAL_ID, fort), list(NART_ID, fort)))), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list64);
        return NIL;
    }

    /**
     * Constructor. @return fort-id-index-p; Returns a new fort index.
     */
    @LispMethod(comment = "Constructor. @return fort-id-index-p; Returns a new fort index.")
    public static final SubLObject new_fort_id_index_alt() {
        {
            SubLObject fort_id_index = make_fort_id_index(UNPROVIDED);
            _csetf_fort_id_index_constants(fort_id_index, new_fort_id_index_constants());
            _csetf_fort_id_index_narts(fort_id_index, new_fort_id_index_narts());
            return fort_id_index;
        }
    }

    /**
     * Constructor. @return fort-id-index-p; Returns a new fort index.
     */
    @LispMethod(comment = "Constructor. @return fort-id-index-p; Returns a new fort index.")
    public static SubLObject new_fort_id_index() {
        final SubLObject fort_id_index = make_fort_id_index(UNPROVIDED);
        _csetf_fort_id_index_constants(fort_id_index, new_fort_id_index_constants());
        _csetf_fort_id_index_narts(fort_id_index, new_fort_id_index_narts());
        return fort_id_index;
    }

    /**
     * Accessor. Return the total number of objects indexed in FORT-ID-INDEX
     */
    @LispMethod(comment = "Accessor. Return the total number of objects indexed in FORT-ID-INDEX")
    public static final SubLObject fort_id_index_count_alt(SubLObject fort_id_index) {
        SubLTrampolineFile.checkType(fort_id_index, FORT_ID_INDEX_P);
        return add(id_index_count(fort_id_index_constants(fort_id_index)), id_index_count(fort_id_index_narts(fort_id_index)));
    }

    /**
     * Accessor. Return the total number of objects indexed in FORT-ID-INDEX
     */
    @LispMethod(comment = "Accessor. Return the total number of objects indexed in FORT-ID-INDEX")
    public static SubLObject fort_id_index_count(final SubLObject fort_id_index) {
        assert NIL != fort_id_index_p(fort_id_index) : "! forts.fort_id_index_p(fort_id_index) " + ("forts.fort_id_index_p(fort_id_index) " + "CommonSymbols.NIL != forts.fort_id_index_p(fort_id_index) ") + fort_id_index;
        return add(id_index_count(fort_id_index_constants(fort_id_index)), id_index_count(fort_id_index_narts(fort_id_index)));
    }

    public static final SubLObject fort_id_index_emptyP_alt(SubLObject fort_id_index) {
        SubLTrampolineFile.checkType(fort_id_index, FORT_ID_INDEX_P);
        return eq(fort_id_index_count(fort_id_index), ZERO_INTEGER);
    }

    public static SubLObject fort_id_index_emptyP(final SubLObject fort_id_index) {
        assert NIL != fort_id_index_p(fort_id_index) : "! forts.fort_id_index_p(fort_id_index) " + ("forts.fort_id_index_p(fort_id_index) " + "CommonSymbols.NIL != forts.fort_id_index_p(fort_id_index) ") + fort_id_index;
        return eq(fort_id_index_count(fort_id_index), ZERO_INTEGER);
    }

    /**
     * Accessor. Returns the object associated with FORT in FORT-ID-INDEX.
     */
    @LispMethod(comment = "Accessor. Returns the object associated with FORT in FORT-ID-INDEX.")
    public static final SubLObject fort_id_index_lookup_alt(SubLObject fort_id_index, SubLObject fort) {
        {
            SubLObject v_answer = NIL;
            SubLTrampolineFile.checkType(fort, FORT_P);
            SubLTrampolineFile.checkType(fort_id_index, FORT_ID_INDEX_P);
            if (NIL != valid_fortP(fort)) {
                {
                    SubLObject v_id_index = (NIL != constant_p(fort)) ? ((SubLObject) (fort_id_index_constants(fort_id_index))) : fort_id_index_narts(fort_id_index);
                    SubLObject id = (NIL != constant_p(fort)) ? ((SubLObject) (constants_high.constant_internal_id(fort))) : nart_handles.nart_id(fort);
                    v_answer = id_index_lookup(v_id_index, id, UNPROVIDED);
                }
            }
            return v_answer;
        }
    }

    /**
     * Accessor. Returns the object associated with FORT in FORT-ID-INDEX.
     */
    @LispMethod(comment = "Accessor. Returns the object associated with FORT in FORT-ID-INDEX.")
    public static SubLObject fort_id_index_lookup(final SubLObject fort_id_index, final SubLObject fort) {
        SubLObject v_answer = NIL;
        assert NIL != fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        assert NIL != fort_id_index_p(fort_id_index) : "! forts.fort_id_index_p(fort_id_index) " + ("forts.fort_id_index_p(fort_id_index) " + "CommonSymbols.NIL != forts.fort_id_index_p(fort_id_index) ") + fort_id_index;
        if (NIL != valid_fortP(fort)) {
            final SubLObject v_id_index = (NIL != constant_p(fort)) ? fort_id_index_constants(fort_id_index) : fort_id_index_narts(fort_id_index);
            final SubLObject id = (NIL != constant_p(fort)) ? constants_high.constant_internal_id(fort) : nart_handles.nart_id(fort);
            v_answer = id_index_lookup(v_id_index, id, UNPROVIDED);
        }
        return v_answer;
    }

    /**
     * Modifier. Enter OBJECT in FORT-ID-INDEX as the object associated with FORT.
     */
    @LispMethod(comment = "Modifier. Enter OBJECT in FORT-ID-INDEX as the object associated with FORT.")
    public static final SubLObject fort_id_index_enter_alt(SubLObject fort_id_index, SubLObject fort, SubLObject v_object) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        SubLTrampolineFile.checkType(fort_id_index, FORT_ID_INDEX_P);
        if (NIL != valid_fortP(fort)) {
            {
                SubLObject v_id_index = (NIL != constant_p(fort)) ? ((SubLObject) (fort_id_index_constants(fort_id_index))) : fort_id_index_narts(fort_id_index);
                SubLObject id = (NIL != constant_p(fort)) ? ((SubLObject) (constants_high.constant_internal_id(fort))) : nart_handles.nart_id(fort);
                id_index_enter(v_id_index, id, v_object);
            }
        }
        return NIL;
    }

    /**
     * Modifier. Enter OBJECT in FORT-ID-INDEX as the object associated with FORT.
     */
    @LispMethod(comment = "Modifier. Enter OBJECT in FORT-ID-INDEX as the object associated with FORT.")
    public static SubLObject fort_id_index_enter(final SubLObject fort_id_index, final SubLObject fort, final SubLObject v_object) {
        assert NIL != fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        assert NIL != fort_id_index_p(fort_id_index) : "! forts.fort_id_index_p(fort_id_index) " + ("forts.fort_id_index_p(fort_id_index) " + "CommonSymbols.NIL != forts.fort_id_index_p(fort_id_index) ") + fort_id_index;
        if (NIL != valid_fortP(fort)) {
            final SubLObject v_id_index = (NIL != constant_p(fort)) ? fort_id_index_constants(fort_id_index) : fort_id_index_narts(fort_id_index);
            final SubLObject id = (NIL != constant_p(fort)) ? constants_high.constant_internal_id(fort) : nart_handles.nart_id(fort);
            id_index_enter(v_id_index, id, v_object);
        }
        return NIL;
    }

    /**
     * Modifier. Remove all FORT associations in FORT-ID-INDEX.
     */
    @LispMethod(comment = "Modifier. Remove all FORT associations in FORT-ID-INDEX.")
    public static final SubLObject fort_id_index_remove_alt(SubLObject fort_id_index, SubLObject fort) {
        SubLTrampolineFile.checkType(fort, FORT_P);
        SubLTrampolineFile.checkType(fort_id_index, FORT_ID_INDEX_P);
        if (NIL != valid_fortP(fort)) {
            {
                SubLObject v_id_index = (NIL != constant_p(fort)) ? ((SubLObject) (fort_id_index_constants(fort_id_index))) : fort_id_index_narts(fort_id_index);
                SubLObject id = (NIL != constant_p(fort)) ? ((SubLObject) (constants_high.constant_internal_id(fort))) : nart_handles.nart_id(fort);
                id_index_remove(v_id_index, id);
            }
        }
        return NIL;
    }

    /**
     * Modifier. Remove all FORT associations in FORT-ID-INDEX.
     */
    @LispMethod(comment = "Modifier. Remove all FORT associations in FORT-ID-INDEX.")
    public static SubLObject fort_id_index_remove(final SubLObject fort_id_index, final SubLObject fort) {
        assert NIL != fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        assert NIL != fort_id_index_p(fort_id_index) : "! forts.fort_id_index_p(fort_id_index) " + ("forts.fort_id_index_p(fort_id_index) " + "CommonSymbols.NIL != forts.fort_id_index_p(fort_id_index) ") + fort_id_index;
        if (NIL != valid_fortP(fort)) {
            final SubLObject v_id_index = (NIL != constant_p(fort)) ? fort_id_index_constants(fort_id_index) : fort_id_index_narts(fort_id_index);
            final SubLObject id = (NIL != constant_p(fort)) ? constants_high.constant_internal_id(fort) : nart_handles.nart_id(fort);
            id_index_remove(v_id_index, id);
        }
        return NIL;
    }

    /**
     * Modifier. Clears the id indexes of FORT-ID-INDEX.
     */
    @LispMethod(comment = "Modifier. Clears the id indexes of FORT-ID-INDEX.")
    public static final SubLObject clear_fort_id_index_alt(SubLObject fort_id_index) {
        SubLTrampolineFile.checkType(fort_id_index, FORT_ID_INDEX_P);
        clear_id_index(fort_id_index_constants(fort_id_index));
        clear_id_index(fort_id_index_narts(fort_id_index));
        return NIL;
    }

    /**
     * Modifier. Clears the id indexes of FORT-ID-INDEX.
     */
    @LispMethod(comment = "Modifier. Clears the id indexes of FORT-ID-INDEX.")
    public static SubLObject clear_fort_id_index(final SubLObject fort_id_index) {
        assert NIL != fort_id_index_p(fort_id_index) : "! forts.fort_id_index_p(fort_id_index) " + ("forts.fort_id_index_p(fort_id_index) " + "CommonSymbols.NIL != forts.fort_id_index_p(fort_id_index) ") + fort_id_index;
        clear_id_index(fort_id_index_constants(fort_id_index));
        clear_id_index(fort_id_index_narts(fort_id_index));
        return NIL;
    }

    /**
     * Modifier. Optimizes the storage of FORT-ID-INDEX, moving new objects from hashtables
     * to vectors. @xref optimize-id-index.
     */
    @LispMethod(comment = "Modifier. Optimizes the storage of FORT-ID-INDEX, moving new objects from hashtables\r\nto vectors. @xref optimize-id-index.\nModifier. Optimizes the storage of FORT-ID-INDEX, moving new objects from hashtables\nto vectors. @xref optimize-id-index.")
    public static final SubLObject optimize_fort_id_index_alt(SubLObject fort_id_index) {
        SubLTrampolineFile.checkType(fort_id_index, FORT_ID_INDEX_P);
        optimize_id_index(fort_id_index_constants(fort_id_index), UNPROVIDED);
        optimize_id_index(fort_id_index_narts(fort_id_index), UNPROVIDED);
        return NIL;
    }

    /**
     * Modifier. Optimizes the storage of FORT-ID-INDEX, moving new objects from hashtables
     * to vectors. @xref optimize-id-index.
     */
    @LispMethod(comment = "Modifier. Optimizes the storage of FORT-ID-INDEX, moving new objects from hashtables\r\nto vectors. @xref optimize-id-index.\nModifier. Optimizes the storage of FORT-ID-INDEX, moving new objects from hashtables\nto vectors. @xref optimize-id-index.")
    public static SubLObject optimize_fort_id_index(final SubLObject fort_id_index) {
        assert NIL != fort_id_index_p(fort_id_index) : "! forts.fort_id_index_p(fort_id_index) " + ("forts.fort_id_index_p(fort_id_index) " + "CommonSymbols.NIL != forts.fort_id_index_p(fort_id_index) ") + fort_id_index;
        optimize_id_index(fort_id_index_constants(fort_id_index), UNPROVIDED);
        optimize_id_index(fort_id_index_narts(fort_id_index), UNPROVIDED);
        return NIL;
    }

    /**
     * Accessor. @return booleanp. Returns whether both the constant and nart
     * index in FORT-ID-INDEX are optimized.
     */
    @LispMethod(comment = "Accessor. @return booleanp. Returns whether both the constant and nart\r\nindex in FORT-ID-INDEX are optimized.\nAccessor. @return booleanp. Returns whether both the constant and nart\nindex in FORT-ID-INDEX are optimized.")
    public static final SubLObject fort_id_index_optimized_p_alt(SubLObject fort_id_index) {
        SubLTrampolineFile.checkType(fort_id_index, FORT_ID_INDEX_P);
        return makeBoolean((NIL != id_index_optimized_p(fort_id_index_constants(fort_id_index))) && (NIL != id_index_optimized_p(fort_id_index_narts(fort_id_index))));
    }

    /**
     * Accessor. @return booleanp. Returns whether both the constant and nart
     * index in FORT-ID-INDEX are optimized.
     */
    @LispMethod(comment = "Accessor. @return booleanp. Returns whether both the constant and nart\r\nindex in FORT-ID-INDEX are optimized.\nAccessor. @return booleanp. Returns whether both the constant and nart\nindex in FORT-ID-INDEX are optimized.")
    public static SubLObject fort_id_index_optimized_p(final SubLObject fort_id_index) {
        assert NIL != fort_id_index_p(fort_id_index) : "! forts.fort_id_index_p(fort_id_index) " + ("forts.fort_id_index_p(fort_id_index) " + "CommonSymbols.NIL != forts.fort_id_index_p(fort_id_index) ") + fort_id_index;
        return makeBoolean((NIL != id_index_optimized_p(fort_id_index_constants(fort_id_index))) && (NIL != id_index_optimized_p(fort_id_index_narts(fort_id_index))));
    }

    public static final SubLObject new_fort_id_index_constants_alt() {
        return new_id_index(constants_high.new_constant_internal_id_threshold(), UNPROVIDED);
    }

    public static SubLObject new_fort_id_index_constants() {
        return new_id_index(constants_high.new_constant_internal_id_threshold(), UNPROVIDED);
    }

    public static final SubLObject new_fort_id_index_narts_alt() {
        return new_id_index(nart_handles.new_nart_id_threshold(), UNPROVIDED);
    }

    public static SubLObject new_fort_id_index_narts() {
        return new_id_index(nart_handles.new_nart_id_threshold(), UNPROVIDED);
    }

    /**
     * Iterate over FORT-ID-INDEX, binding FORT and VALUE to each FORT and value indexed.
     * BODY is executed once within the scope of each binding of FORT VALUE.
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over FORT-ID-INDEX, binding FORT and VALUE to each FORT and value indexed.\r\nBODY is executed once within the scope of each binding of FORT VALUE.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over FORT-ID-INDEX, binding FORT and VALUE to each FORT and value indexed.\nBODY is executed once within the scope of each binding of FORT VALUE.\nIteration halts as soon as DONE becomes non-nil.")
    public static final SubLObject do_fort_id_index_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt69);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject fort = NIL;
                    SubLObject value = NIL;
                    SubLObject fort_id_index = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    fort = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    fort_id_index = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt69);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt69);
                            if (NIL == member(current_3, $list_alt11, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt69);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject fii = $sym70$FII;
                                return list(CLET, list(list(fii, fort_id_index)), listS(DO_FORT_ID_INDEX_CONSTANTS, list(fort, value, fii, $DONE, done), append(body, NIL)), listS(DO_FORT_ID_INDEX_NARTS, list(fort, value, fii, $DONE, done), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate over FORT-ID-INDEX, binding FORT and VALUE to each FORT and value indexed.
     * BODY is executed once within the scope of each binding of FORT VALUE.
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over FORT-ID-INDEX, binding FORT and VALUE to each FORT and value indexed.\r\nBODY is executed once within the scope of each binding of FORT VALUE.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over FORT-ID-INDEX, binding FORT and VALUE to each FORT and value indexed.\nBODY is executed once within the scope of each binding of FORT VALUE.\nIteration halts as soon as DONE becomes non-nil.")
    public static SubLObject do_fort_id_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list75);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fort = NIL;
        SubLObject value = NIL;
        SubLObject fort_id_index = NIL;
        destructuring_bind_must_consp(current, datum, $list75);
        fort = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list75);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list75);
        fort_id_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list75);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list75);
            if (NIL == member(current_$2, $list11, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list75);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject fii = $sym76$FII;
        return list(CLET, list(list(fii, fort_id_index)), listS(DO_FORT_ID_INDEX_CONSTANTS, list(fort, value, fii, $DONE, done), append(body, NIL)), listS(DO_FORT_ID_INDEX_NARTS, list(fort, value, fii, $DONE, done), append(body, NIL)));
    }

    public static final SubLObject do_fort_id_index_constants_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt74);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject constant = NIL;
                    SubLObject value = NIL;
                    SubLObject fort_id_index = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    constant = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    fort_id_index = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt74);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt74);
                            if (NIL == member(current_4, $list_alt11, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt74);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject id = $sym75$ID;
                                return list(DO_ID_INDEX, list(id, value, list(DO_FII_GET_CONSTANTS, fort_id_index), $DONE, done), list(CLET, list(list(constant, list(FIND_CONSTANT_BY_INTERNAL_ID, id))), listS(PWHEN, constant, append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_fort_id_index_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list80);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant = NIL;
        SubLObject value = NIL;
        SubLObject fort_id_index = NIL;
        destructuring_bind_must_consp(current, datum, $list80);
        constant = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list80);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list80);
        fort_id_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list80);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list80);
            if (NIL == member(current_$3, $list11, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list80);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject id = $sym81$ID;
        return list(DO_ID_INDEX, list(id, value, list(DO_FII_GET_CONSTANTS, fort_id_index), $DONE, done), list(CLET, list(list(constant, list(FIND_CONSTANT_BY_INTERNAL_ID, id))), listS(PWHEN, constant, append(body, NIL))));
    }

    public static final SubLObject do_fii_get_constants_alt(SubLObject fort_id_index) {
        return fort_id_index_constants(fort_id_index);
    }

    public static SubLObject do_fii_get_constants(final SubLObject fort_id_index) {
        return fort_id_index_constants(fort_id_index);
    }

    public static final SubLObject do_fort_id_index_narts_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt79);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject nart = NIL;
                    SubLObject value = NIL;
                    SubLObject fort_id_index = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt79);
                    nart = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt79);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt79);
                    fort_id_index = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt79);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt79);
                            if (NIL == member(current_5, $list_alt11, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt79);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject id = $sym80$ID;
                                return list(DO_ID_INDEX, list(id, value, list(DO_FII_GET_NARTS, fort_id_index), $DONE, done), list(CLET, list(list(nart, list(FIND_NART_BY_ID, id))), listS(PWHEN, nart, append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_fort_id_index_narts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nart = NIL;
        SubLObject value = NIL;
        SubLObject fort_id_index = NIL;
        destructuring_bind_must_consp(current, datum, $list85);
        nart = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list85);
        fort_id_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list85);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list85);
            if (NIL == member(current_$4, $list11, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list85);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject id = $sym86$ID;
        return list(DO_ID_INDEX, list(id, value, list(DO_FII_GET_NARTS, fort_id_index), $DONE, done), list(CLET, list(list(nart, list(FIND_NART_BY_ID, id))), listS(PWHEN, nart, append(body, NIL))));
    }

    public static final SubLObject do_fii_get_narts_alt(SubLObject fort_id_index) {
        return fort_id_index_narts(fort_id_index);
    }

    public static SubLObject do_fii_get_narts(final SubLObject fort_id_index) {
        return fort_id_index_narts(fort_id_index);
    }

    public static final SubLObject cfasl_output_object_fort_id_index_method_alt(SubLObject v_object, SubLObject stream) {
        return cfasl_output_fort_id_index(v_object, stream);
    }

    public static SubLObject cfasl_output_object_fort_id_index_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_fort_id_index(v_object, stream);
    }

    public static final SubLObject cfasl_output_fort_id_index_alt(SubLObject fort_id_index, SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_fort_id_index$.getGlobalValue(), stream);
        {
            SubLObject count = fort_id_index_count(fort_id_index);
            cfasl_output(count, stream);
            {
                SubLObject fii = fort_id_index;
                {
                    SubLObject idx = do_fii_get_constants(fii);
                    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                        {
                            SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                            SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                            SubLObject value = NIL;
                            while (NIL != id) {
                                value = do_id_index_state_object(idx, $SKIP, id, state_var);
                                if (NIL != do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                    {
                                        SubLObject fort = constants_high.find_constant_by_internal_id(id);
                                        if (NIL != fort) {
                                            cfasl_output(fort, stream);
                                            cfasl_output(value, stream);
                                        }
                                    }
                                }
                                id = do_id_index_next_id(idx, NIL, id, state_var);
                                state_var = do_id_index_next_state(idx, NIL, id, state_var);
                            } 
                        }
                    }
                }
                {
                    SubLObject idx = do_fii_get_narts(fii);
                    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                        {
                            SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                            SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                            SubLObject value = NIL;
                            while (NIL != id) {
                                value = do_id_index_state_object(idx, $SKIP, id, state_var);
                                if (NIL != do_id_index_id_and_object_validP(id, value, $SKIP)) {
                                    {
                                        SubLObject fort = nart_handles.find_nart_by_id(id);
                                        if (NIL != fort) {
                                            cfasl_output(fort, stream);
                                            cfasl_output(value, stream);
                                        }
                                    }
                                }
                                id = do_id_index_next_id(idx, NIL, id, state_var);
                                state_var = do_id_index_next_state(idx, NIL, id, state_var);
                            } 
                        }
                    }
                }
            }
        }
        return fort_id_index;
    }

    public static SubLObject cfasl_output_fort_id_index(final SubLObject fort_id_index, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_fort_id_index$.getGlobalValue(), stream);
        final SubLObject count = fort_id_index_count(fort_id_index);
        cfasl_output(count, stream);
        SubLObject idx = do_fii_get_constants(fort_id_index);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$5 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$5, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$5);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject value;
                SubLObject fort;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    value = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(value)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(value)) {
                            value = $SKIP;
                        }
                        fort = constants_high.find_constant_by_internal_id(id);
                        if (NIL != fort) {
                            cfasl_output(fort, stream);
                            cfasl_output(value, stream);
                        }
                    }
                }
            }
            final SubLObject idx_$6 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$6)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$6);
                SubLObject id2 = NIL;
                SubLObject value2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        value2 = getEntryValue(cdohash_entry);
                        final SubLObject fort2 = constants_high.find_constant_by_internal_id(id2);
                        if (NIL != fort2) {
                            cfasl_output(fort2, stream);
                            cfasl_output(value2, stream);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        idx = do_fii_get_narts(fort_id_index);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$7 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$7, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$7);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject value;
                SubLObject fort;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    value = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(value)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(value)) {
                            value = $SKIP;
                        }
                        fort = nart_handles.find_nart_by_id(id);
                        if (NIL != fort) {
                            cfasl_output(fort, stream);
                            cfasl_output(value, stream);
                        }
                    }
                }
            }
            final SubLObject idx_$8 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$8)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$8);
                SubLObject id2 = NIL;
                SubLObject value2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        value2 = getEntryValue(cdohash_entry);
                        final SubLObject fort2 = nart_handles.find_nart_by_id(id2);
                        if (NIL != fort2) {
                            cfasl_output(fort2, stream);
                            cfasl_output(value2, stream);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return fort_id_index;
    }

    public static final SubLObject cfasl_input_fort_id_index_alt(SubLObject stream) {
        {
            SubLObject count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject fort_id_index = NIL;
            fort_id_index = new_fort_id_index();
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject fort = cfasl_input_object(stream);
                        SubLObject value = cfasl_input_object(stream);
                        fort_id_index_enter(fort_id_index, fort, value);
                    }
                }
            }
            return fort_id_index;
        }
    }

    public static SubLObject cfasl_input_fort_id_index(final SubLObject stream) {
        final SubLObject count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject fort_id_index = NIL;
        fort_id_index = new_fort_id_index();
        SubLObject i;
        SubLObject fort;
        SubLObject value;
        for (i = NIL, i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
            fort = cfasl_input_object(stream);
            value = cfasl_input_object(stream);
            fort_id_index_enter(fort_id_index, fort, value);
        }
        return fort_id_index;
    }

    /**
     * Verify that the DO-FORTS macro and the FORTS-ITERATOR have equivalent capabilities.
     *
     * @return either an error description or NIL if all is well
     */
    @LispMethod(comment = "Verify that the DO-FORTS macro and the FORTS-ITERATOR have equivalent capabilities.\r\n\r\n@return either an error description or NIL if all is well")
    public static final SubLObject verify_do_forts_macro_iteration_equivalence_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject index = ZERO_INTEGER;
                SubLObject iter = new_forts_iterator();
                SubLObject message = $str_alt87$Checking_that_forts_iterators_wor;
                SubLObject total = fort_count();
                SubLObject sofar = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble(message);
                        {
                            SubLObject cdolist_list_var = do_forts_tables();
                            SubLObject table_var = NIL;
                            for (table_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table_var = cdolist_list_var.first()) {
                                if (NIL == do_id_index_empty_p(table_var, $SKIP)) {
                                    {
                                        SubLObject id = do_id_index_next_id(table_var, T, NIL, NIL);
                                        SubLObject state_var = do_id_index_next_state(table_var, T, id, NIL);
                                        SubLObject fort = NIL;
                                        while (NIL != id) {
                                            fort = do_id_index_state_object(table_var, $SKIP, id, state_var);
                                            if (NIL != do_id_index_id_and_object_validP(id, fort, $SKIP)) {
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                                index = add(index, ONE_INTEGER);
                                                {
                                                    SubLObject candidate = iteration.iteration_next_without_values(iter, $EXHAUSTED);
                                                    if (NIL == fort_p(candidate)) {
                                                        if (candidate == $EXHAUSTED) {
                                                            return list($ERROR, $str_alt91$FORTS_ITERATOR_exhausted_before_D, $INDEX, index);
                                                        } else {
                                                            return list($ERROR, $str_alt93$FORTS_ITERATOR_returned_non_fort_, $CANDIDATE, candidate, $INDEX, index);
                                                        }
                                                    }
                                                    if (candidate != fort) {
                                                        return list($ERROR, $str_alt95$FORTS_ITERATOR_and_DO_FORTS_diffe, $CANDIDATE, candidate, $FORT, fort, $INDEX, index);
                                                    }
                                                }
                                            }
                                            id = do_id_index_next_id(table_var, T, id, state_var);
                                            state_var = do_id_index_next_state(table_var, T, id, state_var);
                                        } 
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject exhausted = iteration.iteration_next_without_values(iter, $EXHAUSTED);
                    if ($EXHAUSTED != exhausted) {
                        return list($ERROR, $str_alt97$The_FORTS_iterator_has_more_value, $INDEX, index, $CANDIDATE, exhausted);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Verify that the DO-FORTS macro and the FORTS-ITERATOR have equivalent capabilities.
     *
     * @return either an error description or NIL if all is well
     */
    @LispMethod(comment = "Verify that the DO-FORTS macro and the FORTS-ITERATOR have equivalent capabilities.\r\n\r\n@return either an error description or NIL if all is well")
    public static SubLObject verify_do_forts_macro_iteration_equivalence() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index = ZERO_INTEGER;
        final SubLObject iter = new_forts_iterator();
        final SubLObject message = $str93$Checking_that_forts_iterators_wor;
        final SubLObject total = fort_count();
        SubLObject sofar = ZERO_INTEGER;
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
                noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = do_forts_tables();
                SubLObject table_var = NIL;
                table_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                        final SubLObject idx_$9 = idx;
                        if (NIL == id_index_dense_objects_empty_p(idx_$9, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$9);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject fort;
                            SubLObject candidate;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                fort = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(fort)) {
                                        fort = $SKIP;
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    index = add(index, ONE_INTEGER);
                                    candidate = iteration.iteration_next_without_values(iter, $EXHAUSTED);
                                    if (NIL == fort_p(candidate)) {
                                        if (candidate == $EXHAUSTED) {
                                            return list($ERROR, $str97$FORTS_ITERATOR_exhausted_before_D, $INDEX, index);
                                        }
                                        return list($ERROR, $str99$FORTS_ITERATOR_returned_non_fort_, $CANDIDATE, candidate, $INDEX, index);
                                    } else
                                        if (!candidate.eql(fort)) {
                                            return list($ERROR, $str101$FORTS_ITERATOR_and_DO_FORTS_diffe, $CANDIDATE, candidate, $FORT, fort, $INDEX, index);
                                        }

                                }
                            }
                        }
                        final SubLObject idx_$10 = idx;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$10)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$10);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$10);
                            final SubLObject end_id = id_index_next_id(idx_$10);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    index = add(index, ONE_INTEGER);
                                    final SubLObject candidate2 = iteration.iteration_next_without_values(iter, $EXHAUSTED);
                                    if (NIL == fort_p(candidate2)) {
                                        if (candidate2 == $EXHAUSTED) {
                                            return list($ERROR, $str97$FORTS_ITERATOR_exhausted_before_D, $INDEX, index);
                                        }
                                        return list($ERROR, $str99$FORTS_ITERATOR_returned_non_fort_, $CANDIDATE, candidate2, $INDEX, index);
                                    } else
                                        if (!candidate2.eql(fort2)) {
                                            return list($ERROR, $str101$FORTS_ITERATOR_and_DO_FORTS_diffe, $CANDIDATE, candidate2, $FORT, fort2, $INDEX, index);
                                        }

                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
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
        final SubLObject exhausted = iteration.iteration_next_without_values(iter, $EXHAUSTED);
        if ($EXHAUSTED != exhausted) {
            return list($ERROR, $str103$The_FORTS_iterator_has_more_value, $INDEX, index, $CANDIDATE, exhausted);
        }
        return NIL;
    }

    public static final SubLObject declare_forts_file_alt() {
        declareFunction("fort_p", "FORT-P", 1, 0, false);
        new com.cyc.cycjava.cycl.forts.$fort_p$UnaryFunction();
        declareFunction("non_fort_p", "NON-FORT-P", 1, 0, false);
        declareFunction("list_of_fort_p", "LIST-OF-FORT-P", 1, 0, false);
        declareFunction("fort_el_formula", "FORT-EL-FORMULA", 1, 0, false);
        declareFunction("new_forts_iterator", "NEW-FORTS-ITERATOR", 0, 0, false);
        declareMacro("do_forts", "DO-FORTS");
        declareFunction("do_forts_tables", "DO-FORTS-TABLES", 0, 0, false);
        declareFunction("fort_count", "FORT-COUNT", 0, 0, false);
        declareFunction("random_fort", "RANDOM-FORT", 0, 0, false);
        declareFunction("fort_index", "FORT-INDEX", 1, 0, false);
        declareFunction("reset_fort_index", "RESET-FORT-INDEX", 2, 0, false);
        declareFunction("clear_fort_index", "CLEAR-FORT-INDEX", 1, 0, false);
        declareFunction("fort_internal_id", "FORT-INTERNAL-ID", 1, 0, false);
        new com.cyc.cycjava.cycl.forts.$fort_internal_id$UnaryFunction();
        declareFunction("fort_external_id", "FORT-EXTERNAL-ID", 1, 0, false);
        declareFunction("valid_fortP", "VALID-FORT?", 1, 0, false);
        declareFunction("valid_fort_robustP", "VALID-FORT-ROBUST?", 1, 0, false);
        declareFunction("invalid_fortP", "INVALID-FORT?", 1, 0, false);
        new com.cyc.cycjava.cycl.forts.$invalid_fortP$UnaryFunction();
        declareFunction("invalid_fort_robustP", "INVALID-FORT-ROBUST?", 1, 0, false);
        declareFunction("remove_fort", "REMOVE-FORT", 1, 0, false);
        declareFunction("fort_id_index_print_function_trampoline", "FORT-ID-INDEX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("fort_id_index_p", "FORT-ID-INDEX-P", 1, 0, false);
        new com.cyc.cycjava.cycl.forts.$fort_id_index_p$UnaryFunction();
        declareFunction("fort_id_index_constants", "FORT-ID-INDEX-CONSTANTS", 1, 0, false);
        declareFunction("fort_id_index_narts", "FORT-ID-INDEX-NARTS", 1, 0, false);
        declareFunction("_csetf_fort_id_index_constants", "_CSETF-FORT-ID-INDEX-CONSTANTS", 2, 0, false);
        declareFunction("_csetf_fort_id_index_narts", "_CSETF-FORT-ID-INDEX-NARTS", 2, 0, false);
        declareFunction("make_fort_id_index", "MAKE-FORT-ID-INDEX", 0, 1, false);
        declareFunction("print_fort_id_index", "PRINT-FORT-ID-INDEX", 3, 0, false);
        declareMacro("with_fort_id_index_index_and_id", "WITH-FORT-ID-INDEX-INDEX-AND-ID");
        declareFunction("new_fort_id_index", "NEW-FORT-ID-INDEX", 0, 0, false);
        declareFunction("fort_id_index_count", "FORT-ID-INDEX-COUNT", 1, 0, false);
        declareFunction("fort_id_index_emptyP", "FORT-ID-INDEX-EMPTY?", 1, 0, false);
        declareFunction("fort_id_index_lookup", "FORT-ID-INDEX-LOOKUP", 2, 0, false);
        declareFunction("fort_id_index_enter", "FORT-ID-INDEX-ENTER", 3, 0, false);
        declareFunction("fort_id_index_remove", "FORT-ID-INDEX-REMOVE", 2, 0, false);
        declareFunction("clear_fort_id_index", "CLEAR-FORT-ID-INDEX", 1, 0, false);
        declareFunction("optimize_fort_id_index", "OPTIMIZE-FORT-ID-INDEX", 1, 0, false);
        declareFunction("fort_id_index_optimized_p", "FORT-ID-INDEX-OPTIMIZED-P", 1, 0, false);
        declareFunction("new_fort_id_index_constants", "NEW-FORT-ID-INDEX-CONSTANTS", 0, 0, false);
        declareFunction("new_fort_id_index_narts", "NEW-FORT-ID-INDEX-NARTS", 0, 0, false);
        declareMacro("do_fort_id_index", "DO-FORT-ID-INDEX");
        declareMacro("do_fort_id_index_constants", "DO-FORT-ID-INDEX-CONSTANTS");
        declareFunction("do_fii_get_constants", "DO-FII-GET-CONSTANTS", 1, 0, false);
        declareMacro("do_fort_id_index_narts", "DO-FORT-ID-INDEX-NARTS");
        declareFunction("do_fii_get_narts", "DO-FII-GET-NARTS", 1, 0, false);
        declareFunction("cfasl_output_object_fort_id_index_method", "CFASL-OUTPUT-OBJECT-FORT-ID-INDEX-METHOD", 2, 0, false);
        declareFunction("cfasl_output_fort_id_index", "CFASL-OUTPUT-FORT-ID-INDEX", 2, 0, false);
        declareFunction("cfasl_input_fort_id_index", "CFASL-INPUT-FORT-ID-INDEX", 1, 0, false);
        declareFunction("verify_do_forts_macro_iteration_equivalence", "VERIFY-DO-FORTS-MACRO-ITERATION-EQUIVALENCE", 0, 0, false);
        return NIL;
    }

    public static SubLObject declare_forts_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("fort_p", "FORT-P", 1, 0, false);
            new forts.$fort_p$UnaryFunction();
            declareFunction("non_fort_p", "NON-FORT-P", 1, 0, false);
            declareFunction("list_of_fort_p", "LIST-OF-FORT-P", 1, 0, false);
            declareFunction("fort_el_formula", "FORT-EL-FORMULA", 1, 0, false);
            declareFunction("new_forts_iterator", "NEW-FORTS-ITERATOR", 0, 0, false);
            declareMacro("do_forts", "DO-FORTS");
            declareFunction("do_forts_tables", "DO-FORTS-TABLES", 0, 0, false);
            declareFunction("fort_count", "FORT-COUNT", 0, 0, false);
            declareFunction("random_fort", "RANDOM-FORT", 0, 1, false);
            declareFunction("sample_forts", "SAMPLE-FORTS", 0, 3, false);
            declareFunction("fort_index", "FORT-INDEX", 1, 0, false);
            declareFunction("reset_fort_index", "RESET-FORT-INDEX", 2, 0, false);
            declareFunction("clear_fort_index", "CLEAR-FORT-INDEX", 1, 0, false);
            declareFunction("fort_internal_id", "FORT-INTERNAL-ID", 1, 0, false);
            new forts.$fort_internal_id$UnaryFunction();
            declareFunction("fort_external_id", "FORT-EXTERNAL-ID", 1, 0, false);
            declareFunction("valid_fortP", "VALID-FORT?", 1, 0, false);
            declareFunction("valid_fort_robustP", "VALID-FORT-ROBUST?", 1, 0, false);
            declareFunction("invalid_fortP", "INVALID-FORT?", 1, 0, false);
            new forts.$invalid_fortP$UnaryFunction();
            declareFunction("invalid_fort_robustP", "INVALID-FORT-ROBUST?", 1, 0, false);
            declareFunction("remove_fort", "REMOVE-FORT", 1, 0, false);
            declareFunction("fort_id_index_print_function_trampoline", "FORT-ID-INDEX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("fort_id_index_p", "FORT-ID-INDEX-P", 1, 0, false);
            new forts.$fort_id_index_p$UnaryFunction();
            declareFunction("fort_id_index_constants", "FORT-ID-INDEX-CONSTANTS", 1, 0, false);
            declareFunction("fort_id_index_narts", "FORT-ID-INDEX-NARTS", 1, 0, false);
            declareFunction("_csetf_fort_id_index_constants", "_CSETF-FORT-ID-INDEX-CONSTANTS", 2, 0, false);
            declareFunction("_csetf_fort_id_index_narts", "_CSETF-FORT-ID-INDEX-NARTS", 2, 0, false);
            declareFunction("make_fort_id_index", "MAKE-FORT-ID-INDEX", 0, 1, false);
            declareFunction("visit_defstruct_fort_id_index", "VISIT-DEFSTRUCT-FORT-ID-INDEX", 2, 0, false);
            declareFunction("visit_defstruct_object_fort_id_index_method", "VISIT-DEFSTRUCT-OBJECT-FORT-ID-INDEX-METHOD", 2, 0, false);
            declareFunction("print_fort_id_index", "PRINT-FORT-ID-INDEX", 3, 0, false);
            declareMacro("with_fort_id_index_index_and_id", "WITH-FORT-ID-INDEX-INDEX-AND-ID");
            declareFunction("new_fort_id_index", "NEW-FORT-ID-INDEX", 0, 0, false);
            declareFunction("fort_id_index_count", "FORT-ID-INDEX-COUNT", 1, 0, false);
            declareFunction("fort_id_index_emptyP", "FORT-ID-INDEX-EMPTY?", 1, 0, false);
            declareFunction("fort_id_index_lookup", "FORT-ID-INDEX-LOOKUP", 2, 0, false);
            declareFunction("fort_id_index_enter", "FORT-ID-INDEX-ENTER", 3, 0, false);
            declareFunction("fort_id_index_remove", "FORT-ID-INDEX-REMOVE", 2, 0, false);
            declareFunction("clear_fort_id_index", "CLEAR-FORT-ID-INDEX", 1, 0, false);
            declareFunction("optimize_fort_id_index", "OPTIMIZE-FORT-ID-INDEX", 1, 0, false);
            declareFunction("fort_id_index_optimized_p", "FORT-ID-INDEX-OPTIMIZED-P", 1, 0, false);
            declareFunction("new_fort_id_index_constants", "NEW-FORT-ID-INDEX-CONSTANTS", 0, 0, false);
            declareFunction("new_fort_id_index_narts", "NEW-FORT-ID-INDEX-NARTS", 0, 0, false);
            declareMacro("do_fort_id_index", "DO-FORT-ID-INDEX");
            declareMacro("do_fort_id_index_constants", "DO-FORT-ID-INDEX-CONSTANTS");
            declareFunction("do_fii_get_constants", "DO-FII-GET-CONSTANTS", 1, 0, false);
            declareMacro("do_fort_id_index_narts", "DO-FORT-ID-INDEX-NARTS");
            declareFunction("do_fii_get_narts", "DO-FII-GET-NARTS", 1, 0, false);
            declareFunction("cfasl_output_object_fort_id_index_method", "CFASL-OUTPUT-OBJECT-FORT-ID-INDEX-METHOD", 2, 0, false);
            declareFunction("cfasl_output_fort_id_index", "CFASL-OUTPUT-FORT-ID-INDEX", 2, 0, false);
            declareFunction("cfasl_input_fort_id_index", "CFASL-INPUT-FORT-ID-INDEX", 1, 0, false);
            declareFunction("verify_do_forts_macro_iteration_equivalence", "VERIFY-DO-FORTS-MACRO-ITERATION-EQUIVALENCE", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("random_fort", "RANDOM-FORT", 0, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_forts_file_Previous() {
        declareFunction("fort_p", "FORT-P", 1, 0, false);
        new forts.$fort_p$UnaryFunction();
        declareFunction("non_fort_p", "NON-FORT-P", 1, 0, false);
        declareFunction("list_of_fort_p", "LIST-OF-FORT-P", 1, 0, false);
        declareFunction("fort_el_formula", "FORT-EL-FORMULA", 1, 0, false);
        declareFunction("new_forts_iterator", "NEW-FORTS-ITERATOR", 0, 0, false);
        declareMacro("do_forts", "DO-FORTS");
        declareFunction("do_forts_tables", "DO-FORTS-TABLES", 0, 0, false);
        declareFunction("fort_count", "FORT-COUNT", 0, 0, false);
        declareFunction("random_fort", "RANDOM-FORT", 0, 1, false);
        declareFunction("sample_forts", "SAMPLE-FORTS", 0, 3, false);
        declareFunction("fort_index", "FORT-INDEX", 1, 0, false);
        declareFunction("reset_fort_index", "RESET-FORT-INDEX", 2, 0, false);
        declareFunction("clear_fort_index", "CLEAR-FORT-INDEX", 1, 0, false);
        declareFunction("fort_internal_id", "FORT-INTERNAL-ID", 1, 0, false);
        new forts.$fort_internal_id$UnaryFunction();
        declareFunction("fort_external_id", "FORT-EXTERNAL-ID", 1, 0, false);
        declareFunction("valid_fortP", "VALID-FORT?", 1, 0, false);
        declareFunction("valid_fort_robustP", "VALID-FORT-ROBUST?", 1, 0, false);
        declareFunction("invalid_fortP", "INVALID-FORT?", 1, 0, false);
        new forts.$invalid_fortP$UnaryFunction();
        declareFunction("invalid_fort_robustP", "INVALID-FORT-ROBUST?", 1, 0, false);
        declareFunction("remove_fort", "REMOVE-FORT", 1, 0, false);
        declareFunction("fort_id_index_print_function_trampoline", "FORT-ID-INDEX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("fort_id_index_p", "FORT-ID-INDEX-P", 1, 0, false);
        new forts.$fort_id_index_p$UnaryFunction();
        declareFunction("fort_id_index_constants", "FORT-ID-INDEX-CONSTANTS", 1, 0, false);
        declareFunction("fort_id_index_narts", "FORT-ID-INDEX-NARTS", 1, 0, false);
        declareFunction("_csetf_fort_id_index_constants", "_CSETF-FORT-ID-INDEX-CONSTANTS", 2, 0, false);
        declareFunction("_csetf_fort_id_index_narts", "_CSETF-FORT-ID-INDEX-NARTS", 2, 0, false);
        declareFunction("make_fort_id_index", "MAKE-FORT-ID-INDEX", 0, 1, false);
        declareFunction("visit_defstruct_fort_id_index", "VISIT-DEFSTRUCT-FORT-ID-INDEX", 2, 0, false);
        declareFunction("visit_defstruct_object_fort_id_index_method", "VISIT-DEFSTRUCT-OBJECT-FORT-ID-INDEX-METHOD", 2, 0, false);
        declareFunction("print_fort_id_index", "PRINT-FORT-ID-INDEX", 3, 0, false);
        declareMacro("with_fort_id_index_index_and_id", "WITH-FORT-ID-INDEX-INDEX-AND-ID");
        declareFunction("new_fort_id_index", "NEW-FORT-ID-INDEX", 0, 0, false);
        declareFunction("fort_id_index_count", "FORT-ID-INDEX-COUNT", 1, 0, false);
        declareFunction("fort_id_index_emptyP", "FORT-ID-INDEX-EMPTY?", 1, 0, false);
        declareFunction("fort_id_index_lookup", "FORT-ID-INDEX-LOOKUP", 2, 0, false);
        declareFunction("fort_id_index_enter", "FORT-ID-INDEX-ENTER", 3, 0, false);
        declareFunction("fort_id_index_remove", "FORT-ID-INDEX-REMOVE", 2, 0, false);
        declareFunction("clear_fort_id_index", "CLEAR-FORT-ID-INDEX", 1, 0, false);
        declareFunction("optimize_fort_id_index", "OPTIMIZE-FORT-ID-INDEX", 1, 0, false);
        declareFunction("fort_id_index_optimized_p", "FORT-ID-INDEX-OPTIMIZED-P", 1, 0, false);
        declareFunction("new_fort_id_index_constants", "NEW-FORT-ID-INDEX-CONSTANTS", 0, 0, false);
        declareFunction("new_fort_id_index_narts", "NEW-FORT-ID-INDEX-NARTS", 0, 0, false);
        declareMacro("do_fort_id_index", "DO-FORT-ID-INDEX");
        declareMacro("do_fort_id_index_constants", "DO-FORT-ID-INDEX-CONSTANTS");
        declareFunction("do_fii_get_constants", "DO-FII-GET-CONSTANTS", 1, 0, false);
        declareMacro("do_fort_id_index_narts", "DO-FORT-ID-INDEX-NARTS");
        declareFunction("do_fii_get_narts", "DO-FII-GET-NARTS", 1, 0, false);
        declareFunction("cfasl_output_object_fort_id_index_method", "CFASL-OUTPUT-OBJECT-FORT-ID-INDEX-METHOD", 2, 0, false);
        declareFunction("cfasl_output_fort_id_index", "CFASL-OUTPUT-FORT-ID-INDEX", 2, 0, false);
        declareFunction("cfasl_input_fort_id_index", "CFASL-INPUT-FORT-ID-INDEX", 1, 0, false);
        declareFunction("verify_do_forts_macro_iteration_equivalence", "VERIFY-DO-FORTS-MACRO-ITERATION-EQUIVALENCE", 0, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt1 = list(makeSymbol("OBJECT"));

    static private final SubLString $str_alt2$Return_T_iff_OBJECT_is_a_first_or = makeString("Return T iff OBJECT is a first order reified term (FORT).");

    static private final SubLList $list_alt3 = list(makeSymbol("BOOLEANP"));

    static private final SubLList $list_alt5 = list(makeSymbol("FORT"));

    static private final SubLString $str_alt6$Return_the_EL_formula_for_any_FOR = makeString("Return the EL formula for any FORT.");

    static private final SubLList $list_alt7 = list(list(makeSymbol("FORT"), makeSymbol("FORT-P")));

    static private final SubLList $list_alt8 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSP")));

    static private final SubLList $list_alt9 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc FORTs")), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt11 = list($DONE);

    static private final SubLList $list_alt16 = list(makeSymbol("DO-FORTS-TABLES"));

    static private final SubLList $list_alt23 = list(list(makeSymbol("FORT-COUNT")));

    static private final SubLList $list_alt24 = list(ZERO_INTEGER);

    static private final SubLString $str_alt29$Iterate_over_all_HL_FORT_datastru = makeString("Iterate over all HL FORT datastructures, executing BODY within the scope of VAR.\n   VAR is bound to the FORT.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts as soon as DONE becomes non-nil.");

    static private final SubLString $str_alt32$Return_the_total_number_of_FORTs_ = makeString("Return the total number of FORTs.");

    static private final SubLList $list_alt33 = list(makeSymbol("INTEGERP"));

    static private final SubLString $str_alt34$_S_was_not_a_FORT = makeString("~S was not a FORT");

    static private final SubLString $str_alt36$Remove_FORT_from_the_KB_ = makeString("Remove FORT from the KB.");

    static private final SubLList $list_alt37 = list(makeSymbol("NULL"));

    static private final SubLList $list_alt40 = list(makeSymbol("CONSTANTS"), makeSymbol("NARTS"));

    static private final SubLList $list_alt41 = list(makeKeyword("CONSTANTS"), makeKeyword("NARTS"));

    static private final SubLList $list_alt42 = list(makeSymbol("FORT-ID-INDEX-CONSTANTS"), makeSymbol("FORT-ID-INDEX-NARTS"));

    static private final SubLList $list_alt43 = list(makeSymbol("_CSETF-FORT-ID-INDEX-CONSTANTS"), makeSymbol("_CSETF-FORT-ID-INDEX-NARTS"));

    public static SubLObject init_forts_file() {
        defconstant("*DTP-FORT-ID-INDEX*", FORT_ID_INDEX);
        defconstant("*CFASL-OPCODE-FORT-ID-INDEX*", $int$99);
        return NIL;
    }

    public static final SubLObject setup_forts_file_alt() {
        register_cyc_api_function(FORT_P, $list_alt1, $str_alt2$Return_T_iff_OBJECT_is_a_first_or, NIL, $list_alt3);
        register_cyc_api_function(FORT_EL_FORMULA, $list_alt5, $str_alt6$Return_the_EL_formula_for_any_FOR, $list_alt7, $list_alt8);
        register_cyc_api_macro(DO_FORTS, $list_alt9, $str_alt29$Iterate_over_all_HL_FORT_datastru);
        register_macro_helper(DO_FORTS_TABLES, DO_FORTS);
        register_cyc_api_function(FORT_COUNT, NIL, $str_alt32$Return_the_total_number_of_FORTs_, NIL, $list_alt33);
        register_cyc_api_function(REMOVE_FORT, $list_alt5, $str_alt36$Remove_FORT_from_the_KB_, $list_alt7, $list_alt37);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_fort_id_index$.getGlobalValue(), symbol_function(FORT_ID_INDEX_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(FORT_ID_INDEX_CONSTANTS, _CSETF_FORT_ID_INDEX_CONSTANTS);
        def_csetf(FORT_ID_INDEX_NARTS, _CSETF_FORT_ID_INDEX_NARTS);
        identity(FORT_ID_INDEX);
        register_macro_helper(DO_FORT_ID_INDEX_CONSTANTS, DO_FORT_ID_INDEX);
        register_macro_helper(DO_FII_GET_CONSTANTS, DO_FORT_ID_INDEX_CONSTANTS);
        register_macro_helper(DO_FORT_ID_INDEX_NARTS, DO_FORT_ID_INDEX);
        register_macro_helper(DO_FII_GET_NARTS, DO_FORT_ID_INDEX_NARTS);
        register_cfasl_input_function($cfasl_opcode_fort_id_index$.getGlobalValue(), CFASL_INPUT_FORT_ID_INDEX);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_fort_id_index$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_FORT_ID_INDEX_METHOD));
        return NIL;
    }

    public static SubLObject setup_forts_file() {
        if (SubLFiles.USE_V1) {
            register_cyc_api_function(FORT_P, $list1, $str2$Return_T_iff_OBJECT_is_a_first_or, NIL, $list3);
            register_cyc_api_function(FORT_EL_FORMULA, $list5, $str6$Return_the_EL_formula_for_any_FOR, $list7, $list8);
            register_cyc_api_macro(DO_FORTS, $list9, $str29$Iterate_over_all_HL_FORT_datastru);
            register_macro_helper(DO_FORTS_TABLES, DO_FORTS);
            register_cyc_api_function(FORT_COUNT, NIL, $str32$Return_the_total_number_of_FORTs_, NIL, $list33);
            register_cyc_api_function(REMOVE_FORT, $list5, $str39$Remove_FORT_from_the_KB_, $list7, $list40);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_fort_id_index$.getGlobalValue(), symbol_function(FORT_ID_INDEX_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list49);
            def_csetf(FORT_ID_INDEX_CONSTANTS, _CSETF_FORT_ID_INDEX_CONSTANTS);
            def_csetf(FORT_ID_INDEX_NARTS, _CSETF_FORT_ID_INDEX_NARTS);
            identity(FORT_ID_INDEX);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_fort_id_index$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FORT_ID_INDEX_METHOD));
            register_macro_helper(DO_FORT_ID_INDEX_CONSTANTS, DO_FORT_ID_INDEX);
            register_macro_helper(DO_FII_GET_CONSTANTS, DO_FORT_ID_INDEX_CONSTANTS);
            register_macro_helper(DO_FORT_ID_INDEX_NARTS, DO_FORT_ID_INDEX);
            register_macro_helper(DO_FII_GET_NARTS, DO_FORT_ID_INDEX_NARTS);
            register_cfasl_input_function($cfasl_opcode_fort_id_index$.getGlobalValue(), CFASL_INPUT_FORT_ID_INDEX);
            register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_fort_id_index$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_FORT_ID_INDEX_METHOD));
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(REMOVE_FORT, $list_alt5, $str_alt36$Remove_FORT_from_the_KB_, $list_alt7, $list_alt37);
        }
        return NIL;
    }

    public static SubLObject setup_forts_file_Previous() {
        register_cyc_api_function(FORT_P, $list1, $str2$Return_T_iff_OBJECT_is_a_first_or, NIL, $list3);
        register_cyc_api_function(FORT_EL_FORMULA, $list5, $str6$Return_the_EL_formula_for_any_FOR, $list7, $list8);
        register_cyc_api_macro(DO_FORTS, $list9, $str29$Iterate_over_all_HL_FORT_datastru);
        register_macro_helper(DO_FORTS_TABLES, DO_FORTS);
        register_cyc_api_function(FORT_COUNT, NIL, $str32$Return_the_total_number_of_FORTs_, NIL, $list33);
        register_cyc_api_function(REMOVE_FORT, $list5, $str39$Remove_FORT_from_the_KB_, $list7, $list40);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_fort_id_index$.getGlobalValue(), symbol_function(FORT_ID_INDEX_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list49);
        def_csetf(FORT_ID_INDEX_CONSTANTS, _CSETF_FORT_ID_INDEX_CONSTANTS);
        def_csetf(FORT_ID_INDEX_NARTS, _CSETF_FORT_ID_INDEX_NARTS);
        identity(FORT_ID_INDEX);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_fort_id_index$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FORT_ID_INDEX_METHOD));
        register_macro_helper(DO_FORT_ID_INDEX_CONSTANTS, DO_FORT_ID_INDEX);
        register_macro_helper(DO_FII_GET_CONSTANTS, DO_FORT_ID_INDEX_CONSTANTS);
        register_macro_helper(DO_FORT_ID_INDEX_NARTS, DO_FORT_ID_INDEX);
        register_macro_helper(DO_FII_GET_NARTS, DO_FORT_ID_INDEX_NARTS);
        register_cfasl_input_function($cfasl_opcode_fort_id_index$.getGlobalValue(), CFASL_INPUT_FORT_ID_INDEX);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_fort_id_index$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_FORT_ID_INDEX_METHOD));
        return NIL;
    }

    static private final SubLString $str_alt52$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt53$__ = makeString("#<");

    static private final SubLString $str_alt55$Constant_Index_ = makeString("Constant Index:");

    static private final SubLString $str_alt56$Nart_Index_ = makeString("Nart Index:");

    static private final SubLList $list_alt58 = list(list(makeSymbol("ID-INDEX-VAR"), makeSymbol("ID-VAR"), makeSymbol("FORT"), makeSymbol("FORT-ID-INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt61 = list(makeSymbol("FORT-P"));

    static private final SubLList $list_alt62 = list(makeSymbol("FORT-ID-INDEX-P"));

    static private final SubLSymbol $sym64$VALID_FORT_ = makeSymbol("VALID-FORT?");

    static private final SubLList $list_alt69 = list(list(makeSymbol("FORT"), makeSymbol("VALUE"), makeSymbol("FORT-ID-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym70$FII = makeUninternedSymbol("FII");

    @Override
    public void declareFunctions() {
        declare_forts_file();
    }

    @Override
    public void initializeVariables() {
        init_forts_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_forts_file();
    }

    static {
    }

    static private final SubLList $list_alt74 = list(list(makeSymbol("CONSTANT"), makeSymbol("VALUE"), makeSymbol("FORT-ID-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final class $fort_p$UnaryFunction extends UnaryFunction {
        public $fort_p$UnaryFunction() {
            super(extractFunctionNamed("FORT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return fort_p(arg1);
        }
    }

    static private final SubLSymbol $sym75$ID = makeUninternedSymbol("ID");

    static private final SubLList $list_alt79 = list(list(makeSymbol("NART"), makeSymbol("VALUE"), makeSymbol("FORT-ID-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final class $fort_internal_id$UnaryFunction extends UnaryFunction {
        public $fort_internal_id$UnaryFunction() {
            super(extractFunctionNamed("FORT-INTERNAL-ID"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return fort_internal_id(arg1);
        }
    }

    static private final SubLSymbol $sym80$ID = makeUninternedSymbol("ID");

    public static final class $invalid_fortP$UnaryFunction extends UnaryFunction {
        public $invalid_fortP$UnaryFunction() {
            super(extractFunctionNamed("INVALID-FORT?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return invalid_fortP(arg1);
        }
    }

    static private final SubLString $str_alt87$Checking_that_forts_iterators_wor = makeString("Checking that forts iterators work.");

    static private final SubLSymbol $sym89$_EXIT = makeSymbol("%EXIT");

    static private final SubLString $str_alt91$FORTS_ITERATOR_exhausted_before_D = makeString("FORTS-ITERATOR exhausted before DO-FORTS");

    static private final SubLString $str_alt93$FORTS_ITERATOR_returned_non_fort_ = makeString("FORTS-ITERATOR returned non-fort!");

    static private final SubLString $str_alt95$FORTS_ITERATOR_and_DO_FORTS_diffe = makeString("FORTS-ITERATOR and DO-FORTS differ in which FORT they think is next");

    static private final SubLString $str_alt97$The_FORTS_iterator_has_more_value = makeString("The FORTS iterator has more values than DO-FORTS.");

    public static final class $fort_id_index_p$UnaryFunction extends UnaryFunction {
        public $fort_id_index_p$UnaryFunction() {
            super(extractFunctionNamed("FORT-ID-INDEX-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return fort_id_index_p(arg1);
        }
    }
}

/**
 * Total time: 411 ms
 */
