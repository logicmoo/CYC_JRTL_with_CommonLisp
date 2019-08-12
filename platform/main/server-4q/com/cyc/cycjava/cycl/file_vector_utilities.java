/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      FILE-VECTOR-UTILITIES
 * source file: /cyc/top/cycl/file-vector-utilities.lisp
 * created:     2019/07/03 17:37:16
 */
public final class file_vector_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLObject with_potential_data_stream_lock(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject data_stream_lock = $sym32$DATA_STREAM_LOCK;
            return list(CLET, list(bq_cons(data_stream_lock, $list_alt34)), list(PIF, list(LOCK_P, data_stream_lock), listS(WITH_LOCK_HELD, list(data_stream_lock), append(body, NIL)), bq_cons(PROGN, append(body, NIL))));
        }
    }

    public static final SubLFile me = new file_vector_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.file_vector_utilities";


    // defparameter
    /**
     * Rebind this to T in order to see the contents of the file-vector reference
     * payloads.
     */
    @LispMethod(comment = "Rebind this to T in order to see the contents of the file-vector reference\r\npayloads.\ndefparameter\nRebind this to T in order to see the contents of the file-vector reference\npayloads.")
    public static final SubLSymbol $show_file_vector_reference_payload_in_print$ = makeSymbol("*SHOW-FILE-VECTOR-REFERENCE-PAYLOAD-IN-PRINT*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_file_vector_reference$ = makeSymbol("*DTP-FILE-VECTOR-REFERENCE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_opcode_fvector_reference$ = makeSymbol("*CFASL-OPCODE-FVECTOR-REFERENCE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $file_vector_get_recursion_guard$ = makeSymbol("*FILE-VECTOR-GET-RECURSION-GUARD*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_backed_map$ = makeSymbol("*DTP-BACKED-MAP*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_opcode_backed_map$ = makeSymbol("*CFASL-OPCODE-BACKED-MAP*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cfasl_outer_fvector_for_backed_maps$ = makeSymbol("*CFASL-OUTER-FVECTOR-FOR-BACKED-MAPS*");

    static private final SubLString $str1$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLList $list2 = list(makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLString $str3$Error__writing_file_vector_backin = makeString("Error, writing file vector backing for map is not contiguous: expected ~A, got ~A~%");

    private static final SubLSymbol FILE_VECTOR_REFERENCE = makeSymbol("FILE-VECTOR-REFERENCE");

    private static final SubLSymbol FILE_VECTOR_REFERENCE_P = makeSymbol("FILE-VECTOR-REFERENCE-P");

    static private final SubLList $list6 = list(makeSymbol("INDEX"), makeSymbol("PAYLOAD"));

    static private final SubLList $list7 = list(makeKeyword("INDEX"), makeKeyword("PAYLOAD"));

    static private final SubLList $list8 = list(makeSymbol("FVECTOR-REF-INDEX"), makeSymbol("FVECTOR-REF-PAYLOAD"));

    static private final SubLList $list9 = list(makeSymbol("_CSETF-FVECTOR-REF-INDEX"), makeSymbol("_CSETF-FVECTOR-REF-PAYLOAD"));

    private static final SubLSymbol PRINT_FVECTOR_REF = makeSymbol("PRINT-FVECTOR-REF");

    private static final SubLSymbol FILE_VECTOR_REFERENCE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FILE-VECTOR-REFERENCE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list12 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FILE-VECTOR-REFERENCE-P"));

    private static final SubLSymbol FVECTOR_REF_INDEX = makeSymbol("FVECTOR-REF-INDEX");

    private static final SubLSymbol _CSETF_FVECTOR_REF_INDEX = makeSymbol("_CSETF-FVECTOR-REF-INDEX");

    private static final SubLSymbol FVECTOR_REF_PAYLOAD = makeSymbol("FVECTOR-REF-PAYLOAD");

    private static final SubLSymbol _CSETF_FVECTOR_REF_PAYLOAD = makeSymbol("_CSETF-FVECTOR-REF-PAYLOAD");

    private static final SubLString $str19$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_FILE_VECTOR_REFERENCE = makeSymbol("MAKE-FILE-VECTOR-REFERENCE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FILE_VECTOR_REFERENCE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FILE-VECTOR-REFERENCE-METHOD");

    private static final SubLString $str25$__FILE_VECTOR_REF__ = makeString("#<FILE-VECTOR-REF #");

    private static final SubLString $str26$__ = makeString(" (");

    private static final SubLString $str27$__ = makeString(") ");

    private static final SubLString $str28$_ = makeString(">");

    private static final SubLString $str29$File_Vector_references_cannot_be_ = makeString("File Vector references cannot be zero.");

    private static final SubLString $$$swapped_out = makeString("swapped out");

    private static final SubLString $str31$present___pristine = makeString("present & pristine");

    private static final SubLString $$$present_but_mutated = makeString("present but mutated");

    private static final SubLString $$$present_but_deleted = makeString("present but deleted");

    private static final SubLString $$$invalid_state = makeString("invalid state");

    private static final SubLInteger $int$69 = makeInteger(69);

    private static final SubLSymbol CFASL_INPUT_FILE_VECTOR_REFERENCE = makeSymbol("CFASL-INPUT-FILE-VECTOR-REFERENCE");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_FILE_VECTOR_REFERENCE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-FILE-VECTOR-REFERENCE-METHOD");

    private static final SubLSymbol $sym38$DATA_STREAM_LOCK = makeUninternedSymbol("DATA-STREAM-LOCK");

    private static final SubLList $list40 = list(makeSymbol("*FILE-VECTOR-BACKED-MAP-READ-LOCK*"));

    private static final SubLList $list45 = list(list(makeSymbol("LOCK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $file_vector_backed_map_read_lock$ = makeSymbol("*FILE-VECTOR-BACKED-MAP-READ-LOCK*");

    private static final SubLSymbol CACHE_STRATEGY_OR_SYMBOL_P = makeSymbol("CACHE-STRATEGY-OR-SYMBOL-P");

    private static final SubLSymbol $sym50$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str51$We_are_already_using_that_file_ve = makeString("We are already using that file vector ~A ... cannot reuse!~%");

    private static final SubLString $str52$Invalid_state_transition___A_is_n = makeString("Invalid state transition: ~A is neither present, nor deleted nor swapped out.");

    private static final SubLSymbol FILE_VECTOR_P = makeSymbol("FILE-VECTOR-P");

    private static final SubLList $list58 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("MAP"), makeSymbol("FILE-VECTOR"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("CACHE-STRATEGY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list59 = list($DONE, makeKeyword("CACHE-STRATEGY"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym63$IMPL_VALUE = makeUninternedSymbol("IMPL-VALUE");

    private static final SubLSymbol DO_MAP = makeSymbol("DO-MAP");

    private static final SubLSymbol $sym67$FILE_VECTOR_REFERENCE_DELETED_ = makeSymbol("FILE-VECTOR-REFERENCE-DELETED?");

    private static final SubLSymbol $sym69$FILE_VECTOR_BACKED_MAP_W__CACHE_GET = makeSymbol("FILE-VECTOR-BACKED-MAP-W/-CACHE-GET");

    private static final SubLSymbol FILE_VECTOR_BACKED_MAP_ITERATOR_DONE = makeSymbol("FILE-VECTOR-BACKED-MAP-ITERATOR-DONE");

    private static final SubLSymbol FILE_VECTOR_BACKED_MAP_ITERATOR_NEXT = makeSymbol("FILE-VECTOR-BACKED-MAP-ITERATOR-NEXT");

    static private final SubLList $list72 = list(makeSymbol("CURR-ITEM"), makeSymbol("ITERATOR"), makeSymbol("MAP"), makeSymbol("FILE-VECTOR"), makeSymbol("COMMON-SYMBOLS"), makeSymbol("CACHE-STRATEGY"));

    private static final SubLSymbol $ITERATION_HALTED_PREMATURELY = makeKeyword("ITERATION-HALTED-PREMATURELY");

    private static final SubLString $str74$Cannot_convert_a_file_backed_map_ = makeString("Cannot convert a file-backed map entry that is not all swapped in. Skipping. (map=~S value=~S)");

    private static final SubLString $str75$Cannot_upgrade_a_map_with_a_delet = makeString("Cannot upgrade a map with a deleted file vector reference, but entry ~A:~A is precisely that.~%");

    private static final SubLString $str76$Cannot_upgrade_a_map_with_muted_f = makeString("Cannot upgrade a map with muted file vector references, but entry ~A:~A is precisely that.~%");

    private static final SubLSymbol $file_vector_indexical_registry$ = makeSymbol("*FILE-VECTOR-INDEXICAL-REGISTRY*");

    private static final SubLSymbol $file_vector_indexical_lock_registry$ = makeSymbol("*FILE-VECTOR-INDEXICAL-LOCK-REGISTRY*");

    private static final SubLSymbol FILE_VECTOR_INDEXICAL_P = makeSymbol("FILE-VECTOR-INDEXICAL-P");

    private static final SubLString $str80$File_Vector_indexical__S_is_not_a = makeString("File Vector indexical ~S is not a KB dump default common symbol ... this will lead to file bloat.~%");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $$$Lock_for_File_Vector_ = makeString("Lock for File Vector ");

    private static final SubLSymbol BACKED_MAP = makeSymbol("BACKED-MAP");

    private static final SubLSymbol BACKED_MAP_P = makeSymbol("BACKED-MAP-P");

    private static final SubLList $list86 = list(makeSymbol("MAP"), makeSymbol("FVECTOR"), makeSymbol("COMMON-SYMBOLS"));

    private static final SubLList $list87 = list(makeKeyword("MAP"), makeKeyword("FVECTOR"), makeKeyword("COMMON-SYMBOLS"));

    private static final SubLList $list88 = list(makeSymbol("BACKED-MAP-MAP"), makeSymbol("BACKED-MAP-FVECTOR"), makeSymbol("BACKED-MAP-COMMON-SYMBOLS"));

    private static final SubLList $list89 = list(makeSymbol("_CSETF-BACKED-MAP-MAP"), makeSymbol("_CSETF-BACKED-MAP-FVECTOR"), makeSymbol("_CSETF-BACKED-MAP-COMMON-SYMBOLS"));

    private static final SubLSymbol PRINT_BACKED_MAP = makeSymbol("PRINT-BACKED-MAP");

    private static final SubLSymbol BACKED_MAP_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("BACKED-MAP-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list92 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("BACKED-MAP-P"));

    private static final SubLSymbol BACKED_MAP_MAP = makeSymbol("BACKED-MAP-MAP");

    private static final SubLSymbol _CSETF_BACKED_MAP_MAP = makeSymbol("_CSETF-BACKED-MAP-MAP");

    private static final SubLSymbol BACKED_MAP_FVECTOR = makeSymbol("BACKED-MAP-FVECTOR");

    private static final SubLSymbol _CSETF_BACKED_MAP_FVECTOR = makeSymbol("_CSETF-BACKED-MAP-FVECTOR");

    private static final SubLSymbol BACKED_MAP_COMMON_SYMBOLS = makeSymbol("BACKED-MAP-COMMON-SYMBOLS");

    private static final SubLSymbol _CSETF_BACKED_MAP_COMMON_SYMBOLS = makeSymbol("_CSETF-BACKED-MAP-COMMON-SYMBOLS");

    private static final SubLSymbol MAKE_BACKED_MAP = makeSymbol("MAKE-BACKED-MAP");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_BACKED_MAP_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-BACKED-MAP-METHOD");

    private static final SubLSymbol MAP_P = makeSymbol("MAP-P");

    private static final SubLList $list105 = list(list(makeSymbol("BACKED-MAP")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym106$COMMON_SYMBOLS = makeUninternedSymbol("COMMON-SYMBOLS");

    private static final SubLSymbol WITH_CFASL_COMMON_SYMBOLS_SIMPLE = makeSymbol("WITH-CFASL-COMMON-SYMBOLS-SIMPLE");

    private static final SubLString $$$_Map_ = makeString(" Map ");

    private static final SubLString $$$_FVector_ = makeString(" FVector ");

    private static final SubLString $$$_CFASL_ComSym_ = makeString(" CFASL ComSym ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str112$Unexpected_file_vector_reference_ = makeString("Unexpected file vector reference ~A in backed map ~A.");

    private static final SubLInteger $int$76 = makeInteger(76);

    private static final SubLSymbol CFASL_INPUT_BACKED_MAP = makeSymbol("CFASL-INPUT-BACKED-MAP");

    private static final SubLString $str115$Unexpected_value__A_in_BACKED_MAP = makeString("Unexpected value ~A in BACKED-MAP-P read.");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_BACKED_MAP_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-BACKED-MAP-METHOD");

    private static final SubLList $list117 = list(list(makeSymbol("STRATEGY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $current_backed_map_cache_strategy$ = makeSymbol("*CURRENT-BACKED-MAP-CACHE-STRATEGY*");

    private static final SubLSymbol IS_MAP_OBJECT_P_BACKED_MAP_METHOD = makeSymbol("IS-MAP-OBJECT-P-BACKED-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_SIZE_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-SIZE-BACKED-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_TEST_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-TEST-BACKED-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_PUT_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-PUT-BACKED-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_GET_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-GET-BACKED-MAP-METHOD");

    private static final SubLString $str124$Cannot_access_backed_map__A_witho = makeString("Cannot access backed map ~A without stream level locking ....~%");

    private static final SubLSymbol MAP_OBJECT_GET_WITHOUT_VALUES_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-GET-WITHOUT-VALUES-BACKED-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_REMOVE_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-REMOVE-BACKED-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_REMOVE_ALL_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-REMOVE-ALL-BACKED-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_TOUCH_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-TOUCH-BACKED-MAP-METHOD");

    private static final SubLSymbol MAP_OBJECT_CHANGE_SET_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-CHANGE-SET-BACKED-MAP-METHOD");

    private static final SubLSymbol NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_BACKED_MAP_METHOD = makeSymbol("NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-BACKED-MAP-METHOD");

    private static final SubLString $str131$The_test_of_the_interior_map__A_d = makeString("The test of the interior map ~A does not correspond to the provided test ~A.");

    private static final SubLString $str132$The_size_of_the_interior_map__A_d = makeString("The size of the interior map ~A does not correspond to the provided size ~A.");

    private static final SubLSymbol NEW_MAP_OBJECT_ITERATOR_BACKED_MAP_METHOD = makeSymbol("NEW-MAP-OBJECT-ITERATOR-BACKED-MAP-METHOD");

    private static final SubLSymbol MAP_BACKED_MAP_ITERATOR_DONE = makeSymbol("MAP-BACKED-MAP-ITERATOR-DONE");

    private static final SubLSymbol MAP_BACKED_MAP_ITERATOR_NEXT = makeSymbol("MAP-BACKED-MAP-ITERATOR-NEXT");

    private static final SubLList $list136 = list(makeSymbol("BACKED-MAP"), makeSymbol("ITERATOR"), makeSymbol("CACHE-STRATEGY"));

    private static final SubLSymbol MAP_OBJECT_ARBITRARY_KEY_BACKED_MAP_METHOD = makeSymbol("MAP-OBJECT-ARBITRARY-KEY-BACKED-MAP-METHOD");

    private static final SubLString $str138$Error_in_swap_out_algorithm___A_i = makeString("Error in swap-out algorithm: ~A is NOT a backed map.");

    private static final SubLString $str139$Error_in_non_pristine_object_coun = makeString("Error in non-pristine object count algorithm: ~A is NOT a backed map.");

    private static final SubLSymbol TEST_FILE_VECTOR_BACKED_MAP_WITH_ALIST = makeSymbol("TEST-FILE-VECTOR-BACKED-MAP-WITH-ALIST");

    private static final SubLObject $list147 = _constant_147_initializer();

    private static final SubLSymbol TEST_MAP_TO_FILE_VECTOR_BACKED_MAP_CONVERSION_WITH_ALIST = makeSymbol("TEST-MAP-TO-FILE-VECTOR-BACKED-MAP-CONVERSION-WITH-ALIST");

    private static final SubLString $str149$_tmp_ = makeString("/tmp/");

    private static final SubLString $str150$Key__A_should_be_in_the_map_but_i = makeString("Key ~A should be in the map but is not.");

    private static final SubLString $str151$The_value_for_the_key__A_is_missi = makeString("The value for the key ~A is missing altogether from the new map.");

    private static final SubLString $str152$The_old_value__A_does_not_match_t = makeString("The old value ~A does not match the new value ~A according to ~A.");

    private static final SubLString $str153$There_are_supposed_to_be__A_keys_ = makeString("There are supposed to be ~A keys, but there are ~A.");

    private static final SubLString $str154$There_are_supposed_to_be__A_value = makeString("There are supposed to be ~A values, but there are ~A.");

    private static final SubLString $str155$The_value_for_the_key__A_can_all_ = makeString("The value for the key ~A can all of a sudden no longer be found.");

    private static final SubLString $str156$The_accessing_of_the_value_for__A = makeString("The accessing of the value for ~A did not swap in the value.");

    private static final SubLString $str157$The_touching_of_the_object_did_no = makeString("The touching of the object did not mutate the object.");

    private static final SubLString $str158$Undoing_the_change_for_key__A_did = makeString("Undoing the change for key ~A did actually not succeed.");

    private static final SubLString $str159$The_modification_of_the_entry_for = makeString("The modification of the entry for ~A did not mutate anything.");

    private static final SubLString $str160$The_modified_entry_for__A_no_long = makeString("The modified entry for ~A no longer contains the new value ~A but rather ~A.");

    private static final SubLString $str161$The_stored_entry_for__A_is_not_a_ = makeString("The stored entry for ~A is not a present and mutated file vector reference.");

    private static final SubLString $str163$_A_should_be_paged_in__but__A_are = makeString("~A should be paged in, but ~A are actually paged in.");

    private static final SubLString $str164$_A_should_be_paged_out__but__A_ar = makeString("~A should be paged out, but ~A are actually paged out.");

    private static final SubLList $list166 = list(makeSymbol("KEY"), makeSymbol("REFERENCE"));

    private static final SubLString $str167$The_entry_for__A_in_the_original_ = makeString("The entry for ~A in the original map is not a file vector reference.~%");

    private static final SubLString $str168$The_loaded_map_does_not_have_the_ = makeString("The loaded map does not have the same size as the original map: ~A =/= ~A~%");

    private static final SubLString $str169$The_entry_for__A_in_the_new_map_i = makeString("The entry for ~A in the new map is not a file vector reference.");

    private static final SubLList $list170 = list(makeSymbol("NEW-KEY"), makeUninternedSymbol("IMPL-VALUE"));

    private static final SubLString $str171$The_new_map_has_an_entry_for_key_ = makeString("The new map has an entry for key ~A while the old one has none.");

    private static final SubLString $str172$The_values_for_key__A_are_not_equ = makeString("The values for key ~A are not equal according to ~A: ~A =/= ~A (new =/= old).~%");

    private static final SubLString $str173$New_map__A_and_backup_key_set__A_ = makeString("New map ~A and backup key set ~A have diverged; ~A not present.");

    private static final SubLString $str175$We_are_getting__A_back__but_that_ = makeString("We are getting ~A back, but that's not one of the missing keys ~A.");

    private static final SubLString $str176$We_are_getting_the_removed_key__A = makeString("We are getting the removed key ~A returned to us with value ~A~%!");

    private static final SubLString $str177$We_are_not_getting_back_the_same_ = makeString("We are not getting back the same reference for ~A: we expected ~A and got ~A.");

    private static final SubLString $str178$We_no_longer_visited__A_____inves = makeString("We no longer visited ~A ... investigating.");

    private static final SubLString $str179$_____A_is_still_present_in_map___ = makeString("... ~A is still present in map.~%");

    private static final SubLString $str180$_____A_is_not_even_findable_in_th = makeString("... ~A is not even findable in the map anymore.~%");

    private static final SubLString $str181$Deleting__A_to_produce__A_did_not = makeString("Deleting ~A to produce ~A did not work right.");

    private static final SubLString $str182$We_visited__A_entries_but_we_shou = makeString("We visited ~A entries but we should have visited ~A entries.");

    private static final SubLList $list183 = cons(makeSymbol("INDEX"), makeSymbol("ADDRESS"));

    private static final SubLString $str184$The_index__A_is_outside_of_the_ra = makeString("The index ~A is outside of the range [0,~A).");

    static final boolean assertionsDisabledSynth = true;

    // Definitions
    /**
     * Write the contents of the map out to the data file and the index file
     * in the order of the map entries.
     */
    @LispMethod(comment = "Write the contents of the map out to the data file and the index file\r\nin the order of the map entries.\nWrite the contents of the map out to the data file and the index file\nin the order of the map entries.")
    public static final SubLObject create_file_backing_for_map_alt(SubLObject map, SubLObject data_file, SubLObject index_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(data_file, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt1$Unable_to_open__S, data_file);
                    }
                    {
                        SubLObject data_stream = stream;
                        SubLObject stream_1 = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream_1 = compatibility.open_binary(index_file, $OUTPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream_1.isStream()) {
                                Errors.error($str_alt1$Unable_to_open__S, index_file);
                            }
                            {
                                SubLObject index_stream = stream_1;
                                SubLObject v_file_vector = file_vector.create_file_vector(data_stream, index_stream);
                                result = create_file_vector_backing_for_map(map, v_file_vector);
                                file_vector.close_file_vector(v_file_vector);
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (stream_1.isStream()) {
                                        close(stream_1, UNPROVIDED);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    // Definitions
    /**
     * Write the contents of the map out to the data file and the index file
     * in the order of the map entries.
     */
    @LispMethod(comment = "Write the contents of the map out to the data file and the index file\r\nin the order of the map entries.\nWrite the contents of the map out to the data file and the index file\nin the order of the map entries.")
    public static SubLObject create_file_backing_for_map(final SubLObject map, final SubLObject data_file, final SubLObject index_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(data_file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str1$Unable_to_open__S, data_file);
            }
            final SubLObject data_stream = stream;
            SubLObject stream_$1 = NIL;
            try {
                final SubLObject _prev_bind_2 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream_$1 = compatibility.open_binary(index_file, $OUTPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_2, thread);
                }
                if (!stream_$1.isStream()) {
                    Errors.error($str1$Unable_to_open__S, index_file);
                }
                final SubLObject index_stream = stream_$1;
                final SubLObject v_file_vector = file_vector.create_file_vector(data_stream, index_stream);
                result = create_file_vector_backing_for_map(map, v_file_vector);
                file_vector.close_file_vector(v_file_vector);
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream_$1.isStream()) {
                        close(stream_$1, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return result;
    }

    /**
     * Write the contents of the map out to the file vector in the order of the
     * map entries.
     *
     * @return the map
     */
    @LispMethod(comment = "Write the contents of the map out to the file vector in the order of the\r\nmap entries.\r\n\r\n@return the map\nWrite the contents of the map out to the file vector in the order of the\nmap entries.")
    public static final SubLObject create_file_vector_backing_for_map_alt(SubLObject map, SubLObject v_file_vector) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
                write_file_vector_backing_map_prologue_to_data_stream(map, data_stream);
                {
                    SubLObject iterator = map_utilities.new_map_iterator(map);
                    SubLObject done_var = NIL;
                    while (NIL == done_var) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = iteration.iteration_next(iterator);
                            SubLObject valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                {
                                    SubLObject datum = var;
                                    SubLObject current = datum;
                                    SubLObject key = NIL;
                                    SubLObject value = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt2);
                                    key = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt2);
                                    value = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        write_file_vector_backing_map_entry(key, value, v_file_vector);
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt2);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        }
                    } 
                }
            }
            return map;
        }
    }

    /**
     * Write the contents of the map out to the file vector in the order of the
     * map entries.
     *
     * @return the map
     */
    @LispMethod(comment = "Write the contents of the map out to the file vector in the order of the\r\nmap entries.\r\n\r\n@return the map\nWrite the contents of the map out to the file vector in the order of the\nmap entries.")
    public static SubLObject create_file_vector_backing_for_map(final SubLObject map, final SubLObject v_file_vector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
        write_file_vector_backing_map_prologue_to_data_stream(map, data_stream);
        final SubLObject iterator = map_utilities.new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list2);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list2);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    write_file_vector_backing_map_entry(key, value, v_file_vector);
                } else {
                    cdestructuring_bind_error(datum, $list2);
                }
            }
        }
        return map;
    }

    public static final SubLObject write_file_vector_backing_map_prologue_alt(SubLObject map, SubLObject v_file_vector) {
        {
            SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
            return write_file_vector_backing_map_prologue_to_data_stream(map, data_stream);
        }
    }

    public static SubLObject write_file_vector_backing_map_prologue(final SubLObject map, final SubLObject v_file_vector) {
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
        return write_file_vector_backing_map_prologue_to_data_stream(map, data_stream);
    }

    /**
     * Writes one map entry to the backing file vector and returns the index
     * that the key of the map entry received. The method enforces that the
     * data item will receive the index entry predicted by
     * FILE-VECTOR-VALUE-INDEX-FROM-KEY-INDEX
     *
     * @return FIXNUMP the index of the key entry
     */
    @LispMethod(comment = "Writes one map entry to the backing file vector and returns the index\r\nthat the key of the map entry received. The method enforces that the\r\ndata item will receive the index entry predicted by\r\nFILE-VECTOR-VALUE-INDEX-FROM-KEY-INDEX\r\n\r\n@return FIXNUMP the index of the key entry\nWrites one map entry to the backing file vector and returns the index\nthat the key of the map entry received. The method enforces that the\ndata item will receive the index entry predicted by\nFILE-VECTOR-VALUE-INDEX-FROM-KEY-INDEX")
    public static final SubLObject write_file_vector_backing_map_entry_alt(SubLObject key, SubLObject value, SubLObject v_file_vector) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
                SubLObject index = NIL;
                index = file_vector.file_vector_next_index(v_file_vector);
                file_vector.update_file_vector_index_linear(v_file_vector);
                cfasl_output(key, data_stream);
                {
                    SubLObject expected_next_index = file_vector_value_index_from_key_index(index);
                    SubLObject next_index = file_vector.file_vector_next_index(v_file_vector);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!expected_next_index.numE(next_index)) {
                            Errors.error($str_alt3$Error__writing_file_vector_backin, expected_next_index, next_index);
                        }
                    }
                }
                file_vector.update_file_vector_index_linear(v_file_vector);
                cfasl_output(value, data_stream);
                return index;
            }
        }
    }

    /**
     * Writes one map entry to the backing file vector and returns the index
     * that the key of the map entry received. The method enforces that the
     * data item will receive the index entry predicted by
     * FILE-VECTOR-VALUE-INDEX-FROM-KEY-INDEX
     *
     * @return FIXNUMP the index of the key entry
     */
    @LispMethod(comment = "Writes one map entry to the backing file vector and returns the index\r\nthat the key of the map entry received. The method enforces that the\r\ndata item will receive the index entry predicted by\r\nFILE-VECTOR-VALUE-INDEX-FROM-KEY-INDEX\r\n\r\n@return FIXNUMP the index of the key entry\nWrites one map entry to the backing file vector and returns the index\nthat the key of the map entry received. The method enforces that the\ndata item will receive the index entry predicted by\nFILE-VECTOR-VALUE-INDEX-FROM-KEY-INDEX")
    public static SubLObject write_file_vector_backing_map_entry(final SubLObject key, final SubLObject value, final SubLObject v_file_vector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index = write_file_vector_backing_map_entry_key(key, v_file_vector);
        final SubLObject expected_next_index = file_vector_value_index_from_key_index(index);
        final SubLObject next_index = file_vector.file_vector_next_index(v_file_vector);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!expected_next_index.numE(next_index))) {
            Errors.error($str3$Error__writing_file_vector_backin, expected_next_index, next_index);
        }
        return write_file_vector_backing_map_entry_value(value, v_file_vector, index);
    }

    public static SubLObject write_file_vector_backing_map_entry_key(final SubLObject key, final SubLObject v_file_vector) {
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
        final SubLObject index = file_vector.file_vector_next_index(v_file_vector);
        file_vector.update_file_vector_index_linear(v_file_vector);
        cfasl_output(key, data_stream);
        return index;
    }

    public static SubLObject write_file_vector_backing_map_entry_value(final SubLObject value, final SubLObject v_file_vector, SubLObject index) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (NIL == index) {
            index = file_vector.file_vector_next_index(v_file_vector);
        }
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
        file_vector.update_file_vector_index_linear(v_file_vector);
        cfasl_output(value, data_stream);
        return index;
    }

    public static final SubLObject write_file_vector_backing_map_prologue_to_data_stream_alt(SubLObject map, SubLObject data_stream) {
        cfasl_output(map_utilities.map_test_symbol(map), data_stream);
        cfasl_output(map_utilities.map_size(map), data_stream);
        return map;
    }

    public static SubLObject write_file_vector_backing_map_prologue_to_data_stream(final SubLObject map, final SubLObject data_stream) {
        cfasl_output(map_utilities.map_test_symbol(map), data_stream);
        cfasl_output(map_utilities.map_size(map), data_stream);
        return map;
    }

    /**
     *
     *
     * @see CREATE-FILE-BACKING-FOR-MAP
     * @see CREATE-FILE-VECTOR-BACKING-FOR-MAPS
     * @param MAP-LIST
     * 		
     * @return MAP-LIST
     */
    @LispMethod(comment = "@see CREATE-FILE-BACKING-FOR-MAP\r\n@see CREATE-FILE-VECTOR-BACKING-FOR-MAPS\r\n@param MAP-LIST\r\n\t\t\r\n@return MAP-LIST")
    public static final SubLObject create_file_backing_for_maps_alt(SubLObject map_list, SubLObject data_file, SubLObject index_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_binary(data_file, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt1$Unable_to_open__S, data_file);
                    }
                    {
                        SubLObject data_stream = stream;
                        SubLObject stream_2 = NIL;
                        try {
                            {
                                SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                try {
                                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                    stream_2 = compatibility.open_binary(index_file, $OUTPUT, NIL);
                                } finally {
                                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (!stream_2.isStream()) {
                                Errors.error($str_alt1$Unable_to_open__S, index_file);
                            }
                            {
                                SubLObject index_stream = stream_2;
                                SubLObject v_file_vector = file_vector.create_file_vector(data_stream, index_stream);
                                result = create_file_vector_backing_for_maps(map_list, v_file_vector);
                                file_vector.close_file_vector(v_file_vector);
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (stream_2.isStream()) {
                                        close(stream_2, UNPROVIDED);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @see CREATE-FILE-BACKING-FOR-MAP
     * @see CREATE-FILE-VECTOR-BACKING-FOR-MAPS
     * @param MAP-LIST
     * 		
     * @return MAP-LIST
     */
    @LispMethod(comment = "@see CREATE-FILE-BACKING-FOR-MAP\r\n@see CREATE-FILE-VECTOR-BACKING-FOR-MAPS\r\n@param MAP-LIST\r\n\t\t\r\n@return MAP-LIST")
    public static SubLObject create_file_backing_for_maps(final SubLObject map_list, final SubLObject data_file, final SubLObject index_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(data_file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str1$Unable_to_open__S, data_file);
            }
            final SubLObject data_stream = stream;
            SubLObject stream_$2 = NIL;
            try {
                final SubLObject _prev_bind_2 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream_$2 = compatibility.open_binary(index_file, $OUTPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_2, thread);
                }
                if (!stream_$2.isStream()) {
                    Errors.error($str1$Unable_to_open__S, index_file);
                }
                final SubLObject index_stream = stream_$2;
                final SubLObject v_file_vector = file_vector.create_file_vector(data_stream, index_stream);
                result = create_file_vector_backing_for_maps(map_list, v_file_vector);
                file_vector.close_file_vector(v_file_vector);
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream_$2.isStream()) {
                        close(stream_$2, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return result;
    }

    /**
     * Write the contents of all of the maps passed in out to the file vector
     * in the order of the map entries.
     *
     * @param MAP-LIST
     * 		LISTP of MAP-P
     * @return MAP-LIST parameter
     */
    @LispMethod(comment = "Write the contents of all of the maps passed in out to the file vector\r\nin the order of the map entries.\r\n\r\n@param MAP-LIST\r\n\t\tLISTP of MAP-P\r\n@return MAP-LIST parameter\nWrite the contents of all of the maps passed in out to the file vector\nin the order of the map entries.")
    public static final SubLObject create_file_vector_backing_for_maps_alt(SubLObject map_list, SubLObject v_file_vector) {
        {
            SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
            cfasl_output(length(map_list), data_stream);
            {
                SubLObject cdolist_list_var = map_list;
                SubLObject map = NIL;
                for (map = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , map = cdolist_list_var.first()) {
                    create_file_vector_backing_for_map(map, v_file_vector);
                }
            }
        }
        return map_list;
    }

    /**
     * Write the contents of all of the maps passed in out to the file vector
     * in the order of the map entries.
     *
     * @param MAP-LIST
     * 		LISTP of MAP-P
     * @return MAP-LIST parameter
     */
    @LispMethod(comment = "Write the contents of all of the maps passed in out to the file vector\r\nin the order of the map entries.\r\n\r\n@param MAP-LIST\r\n\t\tLISTP of MAP-P\r\n@return MAP-LIST parameter\nWrite the contents of all of the maps passed in out to the file vector\nin the order of the map entries.")
    public static SubLObject create_file_vector_backing_for_maps(final SubLObject map_list, final SubLObject v_file_vector) {
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
        cfasl_output(length(map_list), data_stream);
        SubLObject cdolist_list_var = map_list;
        SubLObject map = NIL;
        map = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            create_file_vector_backing_for_map(map, v_file_vector);
            cdolist_list_var = cdolist_list_var.rest();
            map = cdolist_list_var.first();
        } 
        return map_list;
    }

    public static final SubLObject file_vector_reference_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_fvector_ref(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject file_vector_reference_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_fvector_ref(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject file_vector_reference_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_vector_utilities.$file_vector_reference_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject file_vector_reference_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_vector_utilities.$file_vector_reference_native.class ? T : NIL;
    }

    public static final SubLObject fvector_ref_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_VECTOR_REFERENCE_P);
        return v_object.getField2();
    }

    public static SubLObject fvector_ref_index(final SubLObject v_object) {
        assert NIL != file_vector_reference_p(v_object) : "! file_vector_utilities.file_vector_reference_p(v_object) " + "file_vector_utilities.file_vector_reference_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject fvector_ref_payload_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FILE_VECTOR_REFERENCE_P);
        return v_object.getField3();
    }

    public static SubLObject fvector_ref_payload(final SubLObject v_object) {
        assert NIL != file_vector_reference_p(v_object) : "! file_vector_utilities.file_vector_reference_p(v_object) " + "file_vector_utilities.file_vector_reference_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_fvector_ref_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_VECTOR_REFERENCE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fvector_ref_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_vector_reference_p(v_object) : "! file_vector_utilities.file_vector_reference_p(v_object) " + "file_vector_utilities.file_vector_reference_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_fvector_ref_payload_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FILE_VECTOR_REFERENCE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fvector_ref_payload(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_vector_reference_p(v_object) : "! file_vector_utilities.file_vector_reference_p(v_object) " + "file_vector_utilities.file_vector_reference_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_file_vector_reference_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.file_vector_utilities.$file_vector_reference_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($INDEX)) {
                        _csetf_fvector_ref_index(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PAYLOAD)) {
                            _csetf_fvector_ref_payload(v_new, current_value);
                        } else {
                            Errors.error($str_alt18$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_file_vector_reference(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.file_vector_utilities.$file_vector_reference_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INDEX)) {
                _csetf_fvector_ref_index(v_new, current_value);
            } else
                if (pcase_var.eql($PAYLOAD)) {
                    _csetf_fvector_ref_payload(v_new, current_value);
                } else {
                    Errors.error($str19$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_file_vector_reference(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FILE_VECTOR_REFERENCE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INDEX, fvector_ref_index(obj));
        funcall(visitor_fn, obj, $SLOT, $PAYLOAD, fvector_ref_payload(obj));
        funcall(visitor_fn, obj, $END, MAKE_FILE_VECTOR_REFERENCE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_file_vector_reference_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_file_vector_reference(obj, visitor_fn);
    }

    public static final SubLObject print_fvector_ref_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            write_string($str_alt19$__FILE_VECTOR_REF__, stream, UNPROVIDED, UNPROVIDED);
            princ(file_vector_reference_index(v_object), stream);
            princ($str_alt20$__, stream);
            if (NIL != $show_file_vector_reference_payload_in_print$.getDynamicValue(thread)) {
                princ(file_vector_reference_referenced_object(v_object), stream);
            } else {
                princ(file_vector_reference_status(v_object), stream);
            }
            princ($str_alt21$__, stream);
            write_string($str_alt22$_, stream, UNPROVIDED, UNPROVIDED);
            return v_object;
        }
    }

    public static SubLObject print_fvector_ref(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        write_string($str25$__FILE_VECTOR_REF__, stream, UNPROVIDED, UNPROVIDED);
        princ(file_vector_reference_index(v_object), stream);
        princ($str26$__, stream);
        if (NIL != $show_file_vector_reference_payload_in_print$.getDynamicValue(thread)) {
            princ(file_vector_reference_referenced_object(v_object), stream);
        } else {
            princ(file_vector_reference_status(v_object), stream);
        }
        princ($str27$__, stream);
        write_string($str28$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static final SubLObject new_file_vector_reference_alt(SubLObject index) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!index.isPositive()) {
                    Errors.error($str_alt23$File_Vector_references_cannot_be_);
                }
            }
            {
                SubLObject ref = make_file_vector_reference(UNPROVIDED);
                _csetf_fvector_ref_index(ref, index);
                clear_file_vector_reference_referenced_object(ref);
                return ref;
            }
        }
    }

    public static SubLObject new_file_vector_reference(final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!index.isPositive())) {
            Errors.error($str29$File_Vector_references_cannot_be_);
        }
        final SubLObject ref = make_file_vector_reference(UNPROVIDED);
        _csetf_fvector_ref_index(ref, index);
        clear_file_vector_reference_referenced_object(ref);
        return ref;
    }

    public static final SubLObject new_file_vector_reference_wX_payload_alt(SubLObject index, SubLObject payload) {
        {
            SubLObject ref = new_file_vector_reference(index);
            set_file_vector_reference_referenced_object(ref, payload);
            return ref;
        }
    }

    public static SubLObject new_file_vector_reference_wX_payload(final SubLObject index, final SubLObject payload) {
        final SubLObject ref = new_file_vector_reference(index);
        set_file_vector_reference_referenced_object(ref, payload);
        return ref;
    }

    public static final SubLObject file_vector_reference_index_alt(SubLObject ref) {
        return fvector_ref_index(ref);
    }

    public static SubLObject file_vector_reference_index(final SubLObject ref) {
        return fvector_ref_index(ref);
    }

    public static final SubLObject mark_file_vector_reference_as_mutated_alt(SubLObject ref) {
        {
            SubLObject index = fvector_ref_index(ref);
            SubLObject mutated_index = minus(abs(index));
            _csetf_fvector_ref_index(ref, mutated_index);
        }
        return ref;
    }

    public static SubLObject mark_file_vector_reference_as_mutated(final SubLObject ref) {
        final SubLObject index = fvector_ref_index(ref);
        final SubLObject mutated_index = minus(abs(index));
        _csetf_fvector_ref_index(ref, mutated_index);
        return ref;
    }

    public static final SubLObject recover_mutated_file_vector_reference_alt(SubLObject ref) {
        {
            SubLObject index = fvector_ref_index(ref);
            return abs(index);
        }
    }

    public static SubLObject recover_mutated_file_vector_reference(final SubLObject ref) {
        final SubLObject index = fvector_ref_index(ref);
        return abs(index);
    }

    public static final SubLObject restore_file_vector_reference_alt(SubLObject ref) {
        {
            SubLObject index = recover_mutated_file_vector_reference(ref);
            _csetf_fvector_ref_index(ref, index);
            clear_file_vector_reference_referenced_object(ref);
        }
        return ref;
    }

    public static SubLObject restore_file_vector_reference(final SubLObject ref) {
        final SubLObject index = recover_mutated_file_vector_reference(ref);
        _csetf_fvector_ref_index(ref, index);
        clear_file_vector_reference_referenced_object(ref);
        return ref;
    }

    public static final SubLObject set_file_vector_reference_referenced_object_alt(SubLObject ref, SubLObject v_object) {
        _csetf_fvector_ref_payload(ref, v_object);
        return ref;
    }

    public static SubLObject set_file_vector_reference_referenced_object(final SubLObject ref, final SubLObject v_object) {
        _csetf_fvector_ref_payload(ref, v_object);
        return ref;
    }

    public static final SubLObject clear_file_vector_reference_referenced_object_alt(SubLObject ref) {
        return set_file_vector_reference_referenced_object(ref, NIL);
    }

    public static SubLObject clear_file_vector_reference_referenced_object(final SubLObject ref) {
        return set_file_vector_reference_referenced_object(ref, NIL);
    }

    public static final SubLObject file_vector_reference_referenced_object_alt(SubLObject ref) {
        return fvector_ref_payload(ref);
    }

    public static SubLObject file_vector_reference_referenced_object(final SubLObject ref) {
        return fvector_ref_payload(ref);
    }

    public static final SubLObject mark_file_vector_reference_as_deleted_alt(SubLObject ref) {
        mark_file_vector_reference_as_mutated(ref);
        return clear_file_vector_reference_referenced_object(ref);
    }

    public static SubLObject mark_file_vector_reference_as_deleted(final SubLObject ref) {
        mark_file_vector_reference_as_mutated(ref);
        return clear_file_vector_reference_referenced_object(ref);
    }

    public static final SubLObject fvector_ref_payload_in_memory_p_alt(SubLObject ref) {
        return makeBoolean(NIL != fvector_ref_payload(ref));
    }

    public static SubLObject fvector_ref_payload_in_memory_p(final SubLObject ref) {
        return makeBoolean(NIL != fvector_ref_payload(ref));
    }

    public static final SubLObject fvector_ref_valid_index_p_alt(SubLObject index) {
        return plusp(index);
    }

    public static SubLObject fvector_ref_valid_index_p(final SubLObject index) {
        return plusp(index);
    }

    public static final SubLObject fvector_ref_has_valid_index_p_alt(SubLObject ref) {
        return fvector_ref_valid_index_p(fvector_ref_index(ref));
    }

    public static SubLObject fvector_ref_has_valid_index_p(final SubLObject ref) {
        return fvector_ref_valid_index_p(fvector_ref_index(ref));
    }

    public static final SubLObject fvector_ref_mutated_index_p_alt(SubLObject index) {
        return minusp(index);
    }

    public static SubLObject fvector_ref_mutated_index_p(final SubLObject index) {
        return minusp(index);
    }

    public static final SubLObject fvector_ref_has_mutated_index_p_alt(SubLObject ref) {
        return fvector_ref_mutated_index_p(fvector_ref_index(ref));
    }

    public static SubLObject fvector_ref_has_mutated_index_p(final SubLObject ref) {
        return fvector_ref_mutated_index_p(fvector_ref_index(ref));
    }

    /**
     * The file vector reference refers to an object in the file vector
     * but that object does not reside yet in memory.
     */
    @LispMethod(comment = "The file vector reference refers to an object in the file vector\r\nbut that object does not reside yet in memory.\nThe file vector reference refers to an object in the file vector\nbut that object does not reside yet in memory.")
    public static final SubLObject file_vector_reference_swapped_outP_alt(SubLObject ref) {
        return makeBoolean((NIL != fvector_ref_has_valid_index_p(ref)) && (NIL == fvector_ref_payload_in_memory_p(ref)));
    }

    /**
     * The file vector reference refers to an object in the file vector
     * but that object does not reside yet in memory.
     */
    @LispMethod(comment = "The file vector reference refers to an object in the file vector\r\nbut that object does not reside yet in memory.\nThe file vector reference refers to an object in the file vector\nbut that object does not reside yet in memory.")
    public static SubLObject file_vector_reference_swapped_outP(final SubLObject ref) {
        return makeBoolean((NIL != fvector_ref_has_valid_index_p(ref)) && (NIL == fvector_ref_payload_in_memory_p(ref)));
    }

    /**
     * The file vector reference has brought the referenced object in
     * from the index in the reference and holds on to it in the payload.
     */
    @LispMethod(comment = "The file vector reference has brought the referenced object in\r\nfrom the index in the reference and holds on to it in the payload.\nThe file vector reference has brought the referenced object in\nfrom the index in the reference and holds on to it in the payload.")
    public static final SubLObject file_vector_reference_present_pristineP_alt(SubLObject ref) {
        return makeBoolean((NIL != fvector_ref_has_valid_index_p(ref)) && (NIL != fvector_ref_payload_in_memory_p(ref)));
    }

    /**
     * The file vector reference has brought the referenced object in
     * from the index in the reference and holds on to it in the payload.
     */
    @LispMethod(comment = "The file vector reference has brought the referenced object in\r\nfrom the index in the reference and holds on to it in the payload.\nThe file vector reference has brought the referenced object in\nfrom the index in the reference and holds on to it in the payload.")
    public static SubLObject file_vector_reference_present_pristineP(final SubLObject ref) {
        return makeBoolean((NIL != fvector_ref_has_valid_index_p(ref)) && (NIL != fvector_ref_payload_in_memory_p(ref)));
    }

    /**
     * The file vector reference stands in for an object that is not the one that
     * was swapped in.
     */
    @LispMethod(comment = "The file vector reference stands in for an object that is not the one that\r\nwas swapped in.\nThe file vector reference stands in for an object that is not the one that\nwas swapped in.")
    public static final SubLObject file_vector_reference_present_mutatedP_alt(SubLObject ref) {
        return makeBoolean((NIL != fvector_ref_has_mutated_index_p(ref)) && (NIL != fvector_ref_payload_in_memory_p(ref)));
    }

    /**
     * The file vector reference stands in for an object that is not the one that
     * was swapped in.
     */
    @LispMethod(comment = "The file vector reference stands in for an object that is not the one that\r\nwas swapped in.\nThe file vector reference stands in for an object that is not the one that\nwas swapped in.")
    public static SubLObject file_vector_reference_present_mutatedP(final SubLObject ref) {
        return makeBoolean((NIL != fvector_ref_has_mutated_index_p(ref)) && (NIL != fvector_ref_payload_in_memory_p(ref)));
    }

    /**
     * The file vector reference refers to a deleted object.
     */
    @LispMethod(comment = "The file vector reference refers to a deleted object.")
    public static final SubLObject file_vector_reference_deletedP_alt(SubLObject ref) {
        return makeBoolean((NIL != fvector_ref_has_mutated_index_p(ref)) && (NIL == fvector_ref_payload_in_memory_p(ref)));
    }

    /**
     * The file vector reference refers to a deleted object.
     */
    @LispMethod(comment = "The file vector reference refers to a deleted object.")
    public static SubLObject file_vector_reference_deletedP(final SubLObject ref) {
        return makeBoolean((NIL != fvector_ref_has_mutated_index_p(ref)) && (NIL == fvector_ref_payload_in_memory_p(ref)));
    }

    public static final SubLObject file_vector_reference_status_alt(SubLObject ref) {
        if (NIL != file_vector_reference_swapped_outP(ref)) {
            return $$$swapped_out;
        } else {
            if (NIL != file_vector_reference_present_pristineP(ref)) {
                return $str_alt25$present___pristine;
            } else {
                if (NIL != file_vector_reference_present_mutatedP(ref)) {
                    return $$$present_but_mutated;
                } else {
                    if (NIL != file_vector_reference_deletedP(ref)) {
                        return $$$present_but_deleted;
                    } else {
                        return $$$invalid_state;
                    }
                }
            }
        }
    }

    public static SubLObject file_vector_reference_status(final SubLObject ref) {
        if (NIL != file_vector_reference_swapped_outP(ref)) {
            return $$$swapped_out;
        }
        if (NIL != file_vector_reference_present_pristineP(ref)) {
            return $str31$present___pristine;
        }
        if (NIL != file_vector_reference_present_mutatedP(ref)) {
            return $$$present_but_mutated;
        }
        if (NIL != file_vector_reference_deletedP(ref)) {
            return $$$present_but_deleted;
        }
        return $$$invalid_state;
    }

    public static final SubLObject file_vector_reference_presentP_alt(SubLObject ref) {
        return makeBoolean((NIL != file_vector_reference_present_pristineP(ref)) || (NIL != file_vector_reference_present_mutatedP(ref)));
    }

    public static SubLObject file_vector_reference_presentP(final SubLObject ref) {
        return makeBoolean((NIL != file_vector_reference_present_pristineP(ref)) || (NIL != file_vector_reference_present_mutatedP(ref)));
    }

    public static final SubLObject cfasl_input_file_vector_reference_alt(SubLObject stream) {
        {
            SubLObject index = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            if (NIL != fvector_ref_valid_index_p(index)) {
                return new_file_vector_reference(index);
            } else {
                {
                    SubLObject payload = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    return new_file_vector_reference_wX_payload(index, payload);
                }
            }
        }
    }

    public static SubLObject cfasl_input_file_vector_reference(final SubLObject stream) {
        final SubLObject index = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (NIL != fvector_ref_valid_index_p(index)) {
            return new_file_vector_reference(index);
        }
        final SubLObject payload = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        return new_file_vector_reference_wX_payload(index, payload);
    }

    public static final SubLObject cfasl_output_file_vector_reference_alt(SubLObject v_object, SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_fvector_reference$.getGlobalValue(), stream);
        {
            SubLObject index = file_vector_reference_index(v_object);
            cfasl_output(index, stream);
            if (NIL != fvector_ref_mutated_index_p(index)) {
                cfasl_output(file_vector_reference_referenced_object(v_object), stream);
            }
        }
        return v_object;
    }

    public static SubLObject cfasl_output_file_vector_reference(final SubLObject v_object, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_fvector_reference$.getGlobalValue(), stream);
        final SubLObject index = file_vector_reference_index(v_object);
        cfasl_output(index, stream);
        if (NIL != fvector_ref_mutated_index_p(index)) {
            cfasl_output(file_vector_reference_referenced_object(v_object), stream);
        }
        return v_object;
    }

    public static final SubLObject cfasl_output_object_file_vector_reference_method_alt(SubLObject v_object, SubLObject stream) {
        return cfasl_output_file_vector_reference(v_object, stream);
    }

    public static SubLObject cfasl_output_object_file_vector_reference_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_file_vector_reference(v_object, stream);
    }

    public static SubLObject stamp_file_vector_for_references(final SubLObject fvector, SubLObject datum_1, SubLObject datum_2) {
        if (datum_1 == UNPROVIDED) {
            datum_1 = NIL;
        }
        if (datum_2 == UNPROVIDED) {
            datum_2 = NIL;
        }
        if (NIL == datum_2) {
            datum_2 = datum_1;
        }
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(fvector);
        cfasl_output(datum_1, data_stream);
        file_vector.update_file_vector_index_linear(fvector);
        cfasl_output(datum_2, data_stream);
        return fvector;
    }

    public static SubLObject with_potential_file_vector_backed_map_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject data_stream_lock = $sym38$DATA_STREAM_LOCK;
        return list(CLET, list(bq_cons(data_stream_lock, $list40)), list(PIF, list(LOCK_P, data_stream_lock), listS(WITH_LOCK_HELD, list(data_stream_lock), append(body, NIL)), bq_cons(PROGN, append(body, NIL))));
    }

    /**
     * Ensures that the File Vector stream manipulation, if necessary, are serialized.
     */
    @LispMethod(comment = "Ensures that the File Vector stream manipulation, if necessary, are serialized.")
    public static final SubLObject with_file_vector_backed_map_stream_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject lock = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt39);
                    lock = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($file_vector_backed_map_read_lock$, lock)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt39);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Ensures that the File Vector stream manipulation, if necessary, are serialized.
     */
    @LispMethod(comment = "Ensures that the File Vector stream manipulation, if necessary, are serialized.")
    public static SubLObject with_file_vector_backed_map_stream_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lock = NIL;
        destructuring_bind_must_consp(current, datum, $list45);
        lock = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($file_vector_backed_map_read_lock$, lock)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list45);
        return NIL;
    }

    /**
     * Create a new map and populate it with references to the indices in the
     * file-vector backed map (FILE-VECTOR-REFERENCE-P).
     */
    @LispMethod(comment = "Create a new map and populate it with references to the indices in the\r\nfile-vector backed map (FILE-VECTOR-REFERENCE-P).\nCreate a new map and populate it with references to the indices in the\nfile-vector backed map (FILE-VECTOR-REFERENCE-P).")
    public static final SubLObject new_file_vector_backed_map_alt(SubLObject v_file_vector, SubLObject test, SubLObject size, SubLObject start_pos) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        if (size == UNPROVIDED) {
            size = $UNPROVIDED;
        }
        if (start_pos == UNPROVIDED) {
            start_pos = ZERO_INTEGER;
        }
        if ($UNPROVIDED == size) {
            size = map_size_from_file_vector_length(v_file_vector);
        }
        {
            SubLObject target = dictionary.new_dictionary(test, size);
            SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject key = NIL;
                    SubLObject datum_index = NIL;
                    SubLObject datum = NIL;
                    if (i.isZero()) {
                        file_vector.position_file_vector(v_file_vector, start_pos);
                    } else {
                        file_vector.position_file_vector(v_file_vector, UNPROVIDED);
                    }
                    key = file_vector_backed_map_read_key(data_stream);
                    file_vector.position_file_vector(v_file_vector, UNPROVIDED);
                    datum_index = file_vector_index_from_map_element_number(add(start_pos, i));
                    datum = new_file_vector_reference(datum_index);
                    map_utilities.map_put(target, key, datum);
                }
            }
            return target;
        }
    }

    /**
     * Create a new map and populate it with references to the indices in the
     * file-vector backed map (FILE-VECTOR-REFERENCE-P).
     */
    @LispMethod(comment = "Create a new map and populate it with references to the indices in the\r\nfile-vector backed map (FILE-VECTOR-REFERENCE-P).\nCreate a new map and populate it with references to the indices in the\nfile-vector backed map (FILE-VECTOR-REFERENCE-P).")
    public static SubLObject new_file_vector_backed_map(final SubLObject v_file_vector, SubLObject test, SubLObject size, SubLObject start_pos) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        if (size == UNPROVIDED) {
            size = $UNPROVIDED;
        }
        if (start_pos == UNPROVIDED) {
            start_pos = ZERO_INTEGER;
        }
        if ($UNPROVIDED == size) {
            size = map_size_from_file_vector_length(v_file_vector);
        }
        final SubLObject target = dictionary.new_dictionary(test, size);
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
        SubLObject i;
        SubLObject key;
        SubLObject datum_index;
        SubLObject datum;
        for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
            key = NIL;
            datum_index = NIL;
            datum = NIL;
            if (i.isZero()) {
                file_vector.position_file_vector(v_file_vector, start_pos);
            } else {
                file_vector.position_file_vector(v_file_vector, UNPROVIDED);
            }
            key = file_vector_backed_map_read_key(data_stream);
            file_vector.position_file_vector(v_file_vector, UNPROVIDED);
            datum_index = file_vector_index_from_map_element_number(add(start_pos, i));
            datum = new_file_vector_reference(datum_index);
            map_utilities.map_put(target, key, datum);
        }
        return target;
    }

    /**
     * Load a file vector backed map from a file that was written out using
     * CREATE-FILE-VECTOR-BACKING-FOR-MAP.
     *
     * @see NEW-FILE-VECTOR-BACKED-MAP
     * @param the
     * 		new map
     */
    @LispMethod(comment = "Load a file vector backed map from a file that was written out using\r\nCREATE-FILE-VECTOR-BACKING-FOR-MAP.\r\n\r\n@see NEW-FILE-VECTOR-BACKED-MAP\r\n@param the\r\n\t\tnew map\nLoad a file vector backed map from a file that was written out using\nCREATE-FILE-VECTOR-BACKING-FOR-MAP.")
    public static final SubLObject load_file_vector_backed_map_alt(SubLObject data_file, SubLObject index_file) {
        {
            SubLObject new_map = NIL;
            SubLObject v_file_vector = NIL;
            try {
                v_file_vector = file_vector.new_file_vector(data_file, index_file, $INPUT);
                new_map = load_one_file_vector_backed_map(v_file_vector, UNPROVIDED);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (NIL != file_vector.file_vector_p(v_file_vector)) {
                            file_vector.close_file_vector(v_file_vector);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return new_map;
        }
    }

    /**
     * Load a file vector backed map from a file that was written out using
     * CREATE-FILE-VECTOR-BACKING-FOR-MAP.
     *
     * @see NEW-FILE-VECTOR-BACKED-MAP
     * @param the
     * 		new map
     */
    @LispMethod(comment = "Load a file vector backed map from a file that was written out using\r\nCREATE-FILE-VECTOR-BACKING-FOR-MAP.\r\n\r\n@see NEW-FILE-VECTOR-BACKED-MAP\r\n@param the\r\n\t\tnew map\nLoad a file vector backed map from a file that was written out using\nCREATE-FILE-VECTOR-BACKING-FOR-MAP.")
    public static SubLObject load_file_vector_backed_map(final SubLObject data_file, final SubLObject index_file) {
        SubLObject new_map = NIL;
        SubLObject v_file_vector = NIL;
        try {
            v_file_vector = file_vector.new_file_vector(data_file, index_file, $INPUT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            new_map = load_one_file_vector_backed_map(v_file_vector, UNPROVIDED);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != file_vector.file_vector_p(v_file_vector)) {
                    file_vector.close_file_vector(v_file_vector);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return new_map;
    }

    /**
     * Reads one map out of the data stream
     */
    @LispMethod(comment = "Reads one map out of the data stream")
    public static final SubLObject load_one_file_vector_backed_map_alt(SubLObject v_file_vector, SubLObject start_pos) {
        if (start_pos == UNPROVIDED) {
            start_pos = ZERO_INTEGER;
        }
        {
            SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
            SubLObject test_symbol = cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
            SubLObject map_size = cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
            return new_file_vector_backed_map(v_file_vector, test_symbol, map_size, start_pos);
        }
    }

    /**
     * Reads one map out of the data stream
     */
    @LispMethod(comment = "Reads one map out of the data stream")
    public static SubLObject load_one_file_vector_backed_map(final SubLObject v_file_vector, SubLObject start_pos) {
        if (start_pos == UNPROVIDED) {
            start_pos = ZERO_INTEGER;
        }
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
        final SubLObject test_symbol = cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
        final SubLObject map_size = cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
        return new_file_vector_backed_map(v_file_vector, test_symbol, map_size, start_pos);
    }

    /**
     * Load a series of vector backed maps from a file that was written out using
     * CREATE-FILE-VECTOR-BACKING-FOR-MAPS
     *
     * @see LOAD-FILE-VECTOR-BACKED-MAP
     * @return the LISTP of MAP-P in the order in which they are in the file.
     */
    @LispMethod(comment = "Load a series of vector backed maps from a file that was written out using\r\nCREATE-FILE-VECTOR-BACKING-FOR-MAPS\r\n\r\n@see LOAD-FILE-VECTOR-BACKED-MAP\r\n@return the LISTP of MAP-P in the order in which they are in the file.\nLoad a series of vector backed maps from a file that was written out using\nCREATE-FILE-VECTOR-BACKING-FOR-MAPS")
    public static final SubLObject load_file_vector_backed_maps_alt(SubLObject data_file, SubLObject index_file) {
        {
            SubLObject new_maps = NIL;
            SubLObject v_file_vector = NIL;
            try {
                v_file_vector = file_vector.new_file_vector(data_file, index_file, $INPUT);
                {
                    SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
                    SubLObject num_of_maps = cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
                    SubLObject start_pos = ZERO_INTEGER;
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(num_of_maps); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject map = load_one_file_vector_backed_map(v_file_vector, start_pos);
                            new_maps = cons(map, new_maps);
                            start_pos = add(start_pos, map_utilities.map_size(map));
                        }
                    }
                    new_maps = nreverse(new_maps);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (NIL != file_vector.file_vector_p(v_file_vector)) {
                            file_vector.close_file_vector(v_file_vector);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return new_maps;
        }
    }

    /**
     * Load a series of vector backed maps from a file that was written out using
     * CREATE-FILE-VECTOR-BACKING-FOR-MAPS
     *
     * @see LOAD-FILE-VECTOR-BACKED-MAP
     * @return the LISTP of MAP-P in the order in which they are in the file.
     */
    @LispMethod(comment = "Load a series of vector backed maps from a file that was written out using\r\nCREATE-FILE-VECTOR-BACKING-FOR-MAPS\r\n\r\n@see LOAD-FILE-VECTOR-BACKED-MAP\r\n@return the LISTP of MAP-P in the order in which they are in the file.\nLoad a series of vector backed maps from a file that was written out using\nCREATE-FILE-VECTOR-BACKING-FOR-MAPS")
    public static SubLObject load_file_vector_backed_maps(final SubLObject data_file, final SubLObject index_file) {
        SubLObject new_maps = NIL;
        SubLObject v_file_vector = NIL;
        try {
            v_file_vector = file_vector.new_file_vector(data_file, index_file, $INPUT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
            final SubLObject num_of_maps = cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
            SubLObject start_pos = ZERO_INTEGER;
            SubLObject i;
            SubLObject map;
            for (i = NIL, i = ZERO_INTEGER; i.numL(num_of_maps); i = add(i, ONE_INTEGER)) {
                map = load_one_file_vector_backed_map(v_file_vector, start_pos);
                new_maps = cons(map, new_maps);
                start_pos = add(start_pos, map_utilities.map_size(map));
            }
            new_maps = nreverse(new_maps);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != file_vector.file_vector_p(v_file_vector)) {
                    file_vector.close_file_vector(v_file_vector);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return new_maps;
    }

    /**
     * Lookup the value. If the stored result is a FILE-VECTOR-REFERENCE-P, then
     * update the payload with the value loaded from that file.
     *
     * @return the value retrieved under the KEY or NOT-FOUND if not present
     */
    @LispMethod(comment = "Lookup the value. If the stored result is a FILE-VECTOR-REFERENCE-P, then\r\nupdate the payload with the value loaded from that file.\r\n\r\n@return the value retrieved under the KEY or NOT-FOUND if not present\nLookup the value. If the stored result is a FILE-VECTOR-REFERENCE-P, then\nupdate the payload with the value loaded from that file.")
    public static final SubLObject file_vector_backed_map_get_alt(SubLObject map, SubLObject v_file_vector, SubLObject key, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        return file_vector_backed_map_wX_cache_get(map, v_file_vector, NIL, key, not_found);
    }

    /**
     * Lookup the value. If the stored result is a FILE-VECTOR-REFERENCE-P, then
     * update the payload with the value loaded from that file.
     *
     * @return the value retrieved under the KEY or NOT-FOUND if not present
     */
    @LispMethod(comment = "Lookup the value. If the stored result is a FILE-VECTOR-REFERENCE-P, then\r\nupdate the payload with the value loaded from that file.\r\n\r\n@return the value retrieved under the KEY or NOT-FOUND if not present\nLookup the value. If the stored result is a FILE-VECTOR-REFERENCE-P, then\nupdate the payload with the value loaded from that file.")
    public static SubLObject file_vector_backed_map_get(final SubLObject map, final SubLObject v_file_vector, final SubLObject key, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        return file_vector_backed_map_wX_cache_get(map, v_file_vector, NIL, key, not_found);
    }

    /**
     * Lookup the value. If the stored result is a FILE-VECTOR-REFERENCE-P,
     * check whether it is loaded in. If it is present & pristine, update the
     * cache-strategy's tracking. If it is not loaded, load the information,
     * enable tracking with the cache-strategy for the key, and page out
     * the key least likely to be needed according to the cache-strategy.
     *
     * @param CACHE-STRATEGY
     * 		can be SYMBOLP if no cache strategy is needed.
     * @return the value retrieved under the KEY or NOT-FOUND if not present
     */
    @LispMethod(comment = "Lookup the value. If the stored result is a FILE-VECTOR-REFERENCE-P,\r\ncheck whether it is loaded in. If it is present & pristine, update the\r\ncache-strategy\'s tracking. If it is not loaded, load the information,\r\nenable tracking with the cache-strategy for the key, and page out\r\nthe key least likely to be needed according to the cache-strategy.\r\n\r\n@param CACHE-STRATEGY\r\n\t\tcan be SYMBOLP if no cache strategy is needed.\r\n@return the value retrieved under the KEY or NOT-FOUND if not present\nLookup the value. If the stored result is a FILE-VECTOR-REFERENCE-P,\ncheck whether it is loaded in. If it is present & pristine, update the\ncache-strategy\'s tracking. If it is not loaded, load the information,\nenable tracking with the cache-strategy for the key, and page out\nthe key least likely to be needed according to the cache-strategy.")
    public static final SubLObject file_vector_backed_map_wX_cache_get_alt(SubLObject map, SubLObject v_file_vector, SubLObject cache_strategy, SubLObject key, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(cache_strategy, CACHE_STRATEGY_OR_SYMBOL_P);
            {
                SubLObject datum = map_utilities.map_get_without_values(map, key, not_found);
                if (NIL != file_vector_reference_p(datum)) {
                    if (NIL != file_vector_reference_presentP(datum)) {
                        {
                            SubLObject value = file_vector_reference_referenced_object(datum);
                            if (NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                                if (NIL != file_vector_reference_present_pristineP(datum)) {
                                    {
                                        SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
                                        if (data_stream_lock.isLock()) {
                                            {
                                                SubLObject lock = data_stream_lock;
                                                SubLObject release = NIL;
                                                try {
                                                    release = seize_lock(lock);
                                                    cache_utilities.cache_strategy_note_cache_hit(cache_strategy);
                                                    cache_utilities.cache_strategy_note_reference(cache_strategy, key);
                                                } finally {
                                                    if (NIL != release) {
                                                        release_lock(lock);
                                                    }
                                                }
                                            }
                                        } else {
                                            cache_utilities.cache_strategy_note_cache_hit(cache_strategy);
                                            cache_utilities.cache_strategy_note_reference(cache_strategy, key);
                                        }
                                    }
                                }
                            }
                            return value;
                        }
                    } else {
                        if (NIL != file_vector_reference_deletedP(datum)) {
                            return not_found;
                        } else {
                            if (NIL != file_vector_reference_swapped_outP(datum)) {
                                {
                                    SubLObject index = file_vector_reference_index(datum);
                                    SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
                                    SubLObject payload = NIL;
                                    {
                                        SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
                                        if (data_stream_lock.isLock()) {
                                            {
                                                SubLObject lock = data_stream_lock;
                                                SubLObject release = NIL;
                                                try {
                                                    release = seize_lock(lock);
                                                    file_vector.position_file_vector(v_file_vector, index);
                                                    payload = file_vector_backed_map_read_value(data_stream);
                                                } finally {
                                                    if (NIL != release) {
                                                        release_lock(lock);
                                                    }
                                                }
                                            }
                                        } else {
                                            file_vector.position_file_vector(v_file_vector, index);
                                            payload = file_vector_backed_map_read_value(data_stream);
                                        }
                                    }
                                    set_file_vector_reference_referenced_object(datum, payload);
                                    if (NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                                        {
                                            SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
                                            if (data_stream_lock.isLock()) {
                                                {
                                                    SubLObject lock = data_stream_lock;
                                                    SubLObject release = NIL;
                                                    try {
                                                        release = seize_lock(lock);
                                                        {
                                                            SubLObject potential_loser = cache_utilities.cache_strategy_track(cache_strategy, key);
                                                            if (potential_loser != key) {
                                                                swap_out_pristine_file_vector_backed_map_object(map, potential_loser);
                                                            }
                                                        }
                                                        cache_utilities.cache_strategy_note_cache_miss(cache_strategy);
                                                    } finally {
                                                        if (NIL != release) {
                                                            release_lock(lock);
                                                        }
                                                    }
                                                }
                                            } else {
                                                {
                                                    SubLObject potential_loser = cache_utilities.cache_strategy_track(cache_strategy, key);
                                                    if (potential_loser != key) {
                                                        swap_out_pristine_file_vector_backed_map_object(map, potential_loser);
                                                    }
                                                    cache_utilities.cache_strategy_note_cache_miss(cache_strategy);
                                                }
                                            }
                                        }
                                    }
                                    return payload;
                                }
                            } else {
                                Errors.error($str_alt44$Invalid_state_transition___A_is_n, datum);
                            }
                        }
                    }
                }
                return datum;
            }
        }
    }

    /**
     * Lookup the value. If the stored result is a FILE-VECTOR-REFERENCE-P,
     * check whether it is loaded in. If it is present & pristine, update the
     * cache-strategy's tracking. If it is not loaded, load the information,
     * enable tracking with the cache-strategy for the key, and page out
     * the key least likely to be needed according to the cache-strategy.
     *
     * @param CACHE-STRATEGY
     * 		can be SYMBOLP if no cache strategy is needed.
     * @return the value retrieved under the KEY or NOT-FOUND if not present
     */
    @LispMethod(comment = "Lookup the value. If the stored result is a FILE-VECTOR-REFERENCE-P,\r\ncheck whether it is loaded in. If it is present & pristine, update the\r\ncache-strategy\'s tracking. If it is not loaded, load the information,\r\nenable tracking with the cache-strategy for the key, and page out\r\nthe key least likely to be needed according to the cache-strategy.\r\n\r\n@param CACHE-STRATEGY\r\n\t\tcan be SYMBOLP if no cache strategy is needed.\r\n@return the value retrieved under the KEY or NOT-FOUND if not present\nLookup the value. If the stored result is a FILE-VECTOR-REFERENCE-P,\ncheck whether it is loaded in. If it is present & pristine, update the\ncache-strategy\'s tracking. If it is not loaded, load the information,\nenable tracking with the cache-strategy for the key, and page out\nthe key least likely to be needed according to the cache-strategy.")
    public static SubLObject file_vector_backed_map_wX_cache_get(final SubLObject map, final SubLObject v_file_vector, final SubLObject cache_strategy, final SubLObject key, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) : "! cache_utilities.cache_strategy_or_symbol_p(cache_strategy) " + ("cache_utilities.cache_strategy_or_symbol_p(cache_strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) ") + cache_strategy;
        final SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
        if (data_stream_lock.isLock()) {
            SubLObject release = NIL;
            try {
                release = seize_lock(data_stream_lock);
                final SubLObject datum = map_utilities.map_get_without_values(map, key, not_found);
                if (NIL != file_vector_reference_p(datum)) {
                    if (NIL != file_vector_reference_presentP(datum)) {
                        final SubLObject value = file_vector_reference_referenced_object(datum);
                        if ((NIL != cache_utilities.cache_strategy_p(cache_strategy)) && (NIL != file_vector_reference_present_pristineP(datum))) {
                            cache_utilities.cache_strategy_note_cache_hit(cache_strategy);
                            cache_utilities.cache_strategy_note_reference(cache_strategy, key);
                        }
                        return value;
                    }
                    if (NIL != file_vector_reference_deletedP(datum)) {
                        return not_found;
                    }
                    if (NIL != file_vector_reference_swapped_outP(datum)) {
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != subl_promotions.memberP(v_file_vector, $file_vector_get_recursion_guard$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
                            Errors.error($str51$We_are_already_using_that_file_ve, v_file_vector);
                        }
                        final SubLObject index = file_vector_reference_index(datum);
                        SubLObject payload = NIL;
                        final SubLObject _prev_bind_0 = $file_vector_get_recursion_guard$.currentBinding(thread);
                        try {
                            $file_vector_get_recursion_guard$.bind(cons(v_file_vector, $file_vector_get_recursion_guard$.getDynamicValue(thread)), thread);
                            kb_storage_logging.maybe_kb_storage_log_load_in_context(index, v_file_vector);
                            file_vector.position_file_vector(v_file_vector, index);
                            payload = file_vector_backed_map_read_value(file_vector.get_file_vector_data_stream(v_file_vector));
                        } finally {
                            $file_vector_get_recursion_guard$.rebind(_prev_bind_0, thread);
                        }
                        set_file_vector_reference_referenced_object(datum, payload);
                        if (NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                            final SubLObject potential_loser = cache_utilities.cache_strategy_track(cache_strategy, key);
                            if (!potential_loser.eql(key)) {
                                swap_out_pristine_file_vector_backed_map_object(map, potential_loser);
                            }
                            cache_utilities.cache_strategy_note_cache_miss(cache_strategy);
                        }
                        return payload;
                    }
                    Errors.error($str52$Invalid_state_transition___A_is_n, datum);
                }
                return datum;
            } finally {
                if (NIL != release) {
                    release_lock(data_stream_lock);
                }
            }
        }
        final SubLObject datum2 = map_utilities.map_get_without_values(map, key, not_found);
        if (NIL != file_vector_reference_p(datum2)) {
            if (NIL != file_vector_reference_presentP(datum2)) {
                final SubLObject value2 = file_vector_reference_referenced_object(datum2);
                if ((NIL != cache_utilities.cache_strategy_p(cache_strategy)) && (NIL != file_vector_reference_present_pristineP(datum2))) {
                    cache_utilities.cache_strategy_note_cache_hit(cache_strategy);
                    cache_utilities.cache_strategy_note_reference(cache_strategy, key);
                }
                return value2;
            }
            if (NIL != file_vector_reference_deletedP(datum2)) {
                return not_found;
            }
            if (NIL != file_vector_reference_swapped_outP(datum2)) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != subl_promotions.memberP(v_file_vector, $file_vector_get_recursion_guard$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
                    Errors.error($str51$We_are_already_using_that_file_ve, v_file_vector);
                }
                final SubLObject index2 = file_vector_reference_index(datum2);
                SubLObject payload2 = NIL;
                final SubLObject _prev_bind_2 = $file_vector_get_recursion_guard$.currentBinding(thread);
                try {
                    $file_vector_get_recursion_guard$.bind(cons(v_file_vector, $file_vector_get_recursion_guard$.getDynamicValue(thread)), thread);
                    kb_storage_logging.maybe_kb_storage_log_load_in_context(index2, v_file_vector);
                    file_vector.position_file_vector(v_file_vector, index2);
                    payload2 = file_vector_backed_map_read_value(file_vector.get_file_vector_data_stream(v_file_vector));
                } finally {
                    $file_vector_get_recursion_guard$.rebind(_prev_bind_2, thread);
                }
                set_file_vector_reference_referenced_object(datum2, payload2);
                if (NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                    final SubLObject potential_loser2 = cache_utilities.cache_strategy_track(cache_strategy, key);
                    if (!potential_loser2.eql(key)) {
                        swap_out_pristine_file_vector_backed_map_object(map, potential_loser2);
                    }
                    cache_utilities.cache_strategy_note_cache_miss(cache_strategy);
                }
                return payload2;
            }
            Errors.error($str52$Invalid_state_transition___A_is_n, datum2);
        }
        return datum2;
    }

    /**
     * Put the value into the file-vector backed map. If the entry denoted by the key has
     * a file-vector backed reference, then mark the file vector reference as mutated and
     * replace the payload with value. Otherwise simply store the passed-in new value.
     *
     * @return :mutated if the entry was a file-vector reference, nil otherwise
     */
    @LispMethod(comment = "Put the value into the file-vector backed map. If the entry denoted by the key has\r\na file-vector backed reference, then mark the file vector reference as mutated and\r\nreplace the payload with value. Otherwise simply store the passed-in new value.\r\n\r\n@return :mutated if the entry was a file-vector reference, nil otherwise\nPut the value into the file-vector backed map. If the entry denoted by the key has\na file-vector backed reference, then mark the file vector reference as mutated and\nreplace the payload with value. Otherwise simply store the passed-in new value.")
    public static final SubLObject file_vector_backed_map_put_alt(SubLObject map, SubLObject key, SubLObject value) {
        return file_vector_backed_map_wX_cache_put(map, NIL, key, value);
    }

    /**
     * Put the value into the file-vector backed map. If the entry denoted by the key has
     * a file-vector backed reference, then mark the file vector reference as mutated and
     * replace the payload with value. Otherwise simply store the passed-in new value.
     *
     * @return :mutated if the entry was a file-vector reference, nil otherwise
     */
    @LispMethod(comment = "Put the value into the file-vector backed map. If the entry denoted by the key has\r\na file-vector backed reference, then mark the file vector reference as mutated and\r\nreplace the payload with value. Otherwise simply store the passed-in new value.\r\n\r\n@return :mutated if the entry was a file-vector reference, nil otherwise\nPut the value into the file-vector backed map. If the entry denoted by the key has\na file-vector backed reference, then mark the file vector reference as mutated and\nreplace the payload with value. Otherwise simply store the passed-in new value.")
    public static SubLObject file_vector_backed_map_put(final SubLObject map, final SubLObject key, final SubLObject value) {
        return file_vector_backed_map_wX_cache_put(map, NIL, key, value);
    }

    /**
     * Put the value into the file-vector backed map. If the entry denoted by the key
     * has a file vector backed reference, then mark the file vector reference as mutated
     * and replace the payload with the value. If the CACHE-STRATEGY is valid, then
     * untrack the key.
     * Otherwise, simply store the passed-in new value.
     *
     * @param CACHE-STRATEGY
     * 		can be SYMBOLP if no cache strategy is needed.
     * @return :mutated if the entry was a file-vector reference, nil otherwise
     */
    @LispMethod(comment = "Put the value into the file-vector backed map. If the entry denoted by the key\r\nhas a file vector backed reference, then mark the file vector reference as mutated\r\nand replace the payload with the value. If the CACHE-STRATEGY is valid, then\r\nuntrack the key.\r\nOtherwise, simply store the passed-in new value.\r\n\r\n@param CACHE-STRATEGY\r\n\t\tcan be SYMBOLP if no cache strategy is needed.\r\n@return :mutated if the entry was a file-vector reference, nil otherwise\nPut the value into the file-vector backed map. If the entry denoted by the key\nhas a file vector backed reference, then mark the file vector reference as mutated\nand replace the payload with the value. If the CACHE-STRATEGY is valid, then\nuntrack the key.\nOtherwise, simply store the passed-in new value.")
    public static final SubLObject file_vector_backed_map_wX_cache_put_alt(SubLObject map, SubLObject cache_strategy, SubLObject key, SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(cache_strategy, CACHE_STRATEGY_OR_SYMBOL_P);
            {
                SubLObject new_value = value;
                SubLObject current_value = map_utilities.map_get_without_values(map, key, $NOT_FOUND);
                SubLObject mutated_p = NIL;
                if (NIL != file_vector_reference_p(current_value)) {
                    {
                        SubLObject ref = current_value;
                        mark_file_vector_reference_as_mutated(ref);
                        set_file_vector_reference_referenced_object(ref, value);
                        if (NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                            {
                                SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
                                if (data_stream_lock.isLock()) {
                                    {
                                        SubLObject lock = data_stream_lock;
                                        SubLObject release = NIL;
                                        try {
                                            release = seize_lock(lock);
                                            cache_utilities.cache_strategy_untrack(cache_strategy, key);
                                        } finally {
                                            if (NIL != release) {
                                                release_lock(lock);
                                            }
                                        }
                                    }
                                } else {
                                    cache_utilities.cache_strategy_untrack(cache_strategy, key);
                                }
                            }
                        }
                    }
                    mutated_p = $MUTATED;
                } else {
                    map_utilities.map_put(map, key, new_value);
                }
                return mutated_p;
            }
        }
    }

    /**
     * Put the value into the file-vector backed map. If the entry denoted by the key
     * has a file vector backed reference, then mark the file vector reference as mutated
     * and replace the payload with the value. If the CACHE-STRATEGY is valid, then
     * untrack the key.
     * Otherwise, simply store the passed-in new value.
     *
     * @param CACHE-STRATEGY
     * 		can be SYMBOLP if no cache strategy is needed.
     * @return :mutated if the entry was a file-vector reference, nil otherwise
     */
    @LispMethod(comment = "Put the value into the file-vector backed map. If the entry denoted by the key\r\nhas a file vector backed reference, then mark the file vector reference as mutated\r\nand replace the payload with the value. If the CACHE-STRATEGY is valid, then\r\nuntrack the key.\r\nOtherwise, simply store the passed-in new value.\r\n\r\n@param CACHE-STRATEGY\r\n\t\tcan be SYMBOLP if no cache strategy is needed.\r\n@return :mutated if the entry was a file-vector reference, nil otherwise\nPut the value into the file-vector backed map. If the entry denoted by the key\nhas a file vector backed reference, then mark the file vector reference as mutated\nand replace the payload with the value. If the CACHE-STRATEGY is valid, then\nuntrack the key.\nOtherwise, simply store the passed-in new value.")
    public static SubLObject file_vector_backed_map_wX_cache_put(final SubLObject map, final SubLObject cache_strategy, final SubLObject key, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) : "! cache_utilities.cache_strategy_or_symbol_p(cache_strategy) " + ("cache_utilities.cache_strategy_or_symbol_p(cache_strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) ") + cache_strategy;
        final SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
        if (data_stream_lock.isLock()) {
            SubLObject release = NIL;
            try {
                release = seize_lock(data_stream_lock);
                final SubLObject current_value = map_utilities.map_get_without_values(map, key, $NOT_FOUND);
                SubLObject mutated_p = NIL;
                if (NIL != file_vector_reference_p(current_value)) {
                    final SubLObject ref = current_value;
                    mark_file_vector_reference_as_mutated(ref);
                    set_file_vector_reference_referenced_object(ref, value);
                    kb_storage_logging.maybe_kb_storage_log_mutate(file_vector_reference_index(ref));
                    if (NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                        cache_utilities.cache_strategy_untrack(cache_strategy, key);
                    }
                    mutated_p = $MUTATED;
                } else {
                    map_utilities.map_put(map, key, value);
                }
                return mutated_p;
            } finally {
                if (NIL != release) {
                    release_lock(data_stream_lock);
                }
            }
        }
        final SubLObject current_value2 = map_utilities.map_get_without_values(map, key, $NOT_FOUND);
        SubLObject mutated_p2 = NIL;
        if (NIL != file_vector_reference_p(current_value2)) {
            final SubLObject ref2 = current_value2;
            mark_file_vector_reference_as_mutated(ref2);
            set_file_vector_reference_referenced_object(ref2, value);
            kb_storage_logging.maybe_kb_storage_log_mutate(file_vector_reference_index(ref2));
            if (NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                cache_utilities.cache_strategy_untrack(cache_strategy, key);
            }
            mutated_p2 = $MUTATED;
        } else {
            map_utilities.map_put(map, key, value);
        }
        return mutated_p2;
    }

    /**
     * Produce the effect of removing the key from the file vector backed map. If the entry
     * denoted by the key has a file-vector backed reference and SUPPORT-UNDO-P
     * is true, then mark the file vector reference as deleted (which nulls out the
     * payload). Otherwise simply remove the entry from the map.
     *
     * @return :deleted if the entry was a file vector reference, nil otherwise.
     */
    @LispMethod(comment = "Produce the effect of removing the key from the file vector backed map. If the entry\r\ndenoted by the key has a file-vector backed reference and SUPPORT-UNDO-P\r\nis true, then mark the file vector reference as deleted (which nulls out the\r\npayload). Otherwise simply remove the entry from the map.\r\n\r\n@return :deleted if the entry was a file vector reference, nil otherwise.\nProduce the effect of removing the key from the file vector backed map. If the entry\ndenoted by the key has a file-vector backed reference and SUPPORT-UNDO-P\nis true, then mark the file vector reference as deleted (which nulls out the\npayload). Otherwise simply remove the entry from the map.")
    public static final SubLObject file_vector_backed_map_remove_alt(SubLObject map, SubLObject key, SubLObject support_undo_p) {
        if (support_undo_p == UNPROVIDED) {
            support_undo_p = NIL;
        }
        return file_vector_backed_map_wX_cache_remove(map, NIL, key, support_undo_p);
    }

    /**
     * Produce the effect of removing the key from the file vector backed map. If the entry
     * denoted by the key has a file-vector backed reference and SUPPORT-UNDO-P
     * is true, then mark the file vector reference as deleted (which nulls out the
     * payload). Otherwise simply remove the entry from the map.
     *
     * @return :deleted if the entry was a file vector reference, nil otherwise.
     */
    @LispMethod(comment = "Produce the effect of removing the key from the file vector backed map. If the entry\r\ndenoted by the key has a file-vector backed reference and SUPPORT-UNDO-P\r\nis true, then mark the file vector reference as deleted (which nulls out the\r\npayload). Otherwise simply remove the entry from the map.\r\n\r\n@return :deleted if the entry was a file vector reference, nil otherwise.\nProduce the effect of removing the key from the file vector backed map. If the entry\ndenoted by the key has a file-vector backed reference and SUPPORT-UNDO-P\nis true, then mark the file vector reference as deleted (which nulls out the\npayload). Otherwise simply remove the entry from the map.")
    public static SubLObject file_vector_backed_map_remove(final SubLObject map, final SubLObject key, SubLObject support_undo_p) {
        if (support_undo_p == UNPROVIDED) {
            support_undo_p = NIL;
        }
        return file_vector_backed_map_wX_cache_remove(map, NIL, key, support_undo_p);
    }

    /**
     * Produce the effect of removing the key from the file vector backed map. If the entry
     * denoted by the key has a file-vector backed reference and SUPPORT-UNDO-P
     * is true, then mark the file vector reference as deleted (which nulls out the
     * payload). Otherwise simply remove the entry from the map.
     * If the cache-strategy is valid and the entry was a file vector reference, then the
     * key is untracked.
     *
     * @param CACHE-STRATEGY
     * 		can be SYMBOLP if no cache strategy is needed.
     * @return :deleted if the entry was a file vector reference, nil otherwise.
     */
    @LispMethod(comment = "Produce the effect of removing the key from the file vector backed map. If the entry\r\ndenoted by the key has a file-vector backed reference and SUPPORT-UNDO-P\r\nis true, then mark the file vector reference as deleted (which nulls out the\r\npayload). Otherwise simply remove the entry from the map.\r\nIf the cache-strategy is valid and the entry was a file vector reference, then the\r\nkey is untracked.\r\n\r\n@param CACHE-STRATEGY\r\n\t\tcan be SYMBOLP if no cache strategy is needed.\r\n@return :deleted if the entry was a file vector reference, nil otherwise.\nProduce the effect of removing the key from the file vector backed map. If the entry\ndenoted by the key has a file-vector backed reference and SUPPORT-UNDO-P\nis true, then mark the file vector reference as deleted (which nulls out the\npayload). Otherwise simply remove the entry from the map.\nIf the cache-strategy is valid and the entry was a file vector reference, then the\nkey is untracked.")
    public static final SubLObject file_vector_backed_map_wX_cache_remove_alt(SubLObject map, SubLObject cache_strategy, SubLObject key, SubLObject support_undo_p) {
        if (support_undo_p == UNPROVIDED) {
            support_undo_p = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(cache_strategy, CACHE_STRATEGY_OR_SYMBOL_P);
            {
                SubLObject current_value = map_utilities.map_get_without_values(map, key, $NOT_FOUND);
                SubLObject is_file_vector_reference = file_vector_reference_p(current_value);
                SubLObject deleted_p = NIL;
                if ((NIL != support_undo_p) && (NIL != is_file_vector_reference)) {
                    {
                        SubLObject ref = current_value;
                        mark_file_vector_reference_as_deleted(ref);
                    }
                    deleted_p = $DELETED;
                } else {
                    map_utilities.map_remove(map, key);
                }
                if ((NIL != is_file_vector_reference) && (NIL != cache_utilities.cache_strategy_p(cache_strategy))) {
                    {
                        SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
                        if (data_stream_lock.isLock()) {
                            {
                                SubLObject lock = data_stream_lock;
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock);
                                    cache_utilities.cache_strategy_untrack(cache_strategy, key);
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock);
                                    }
                                }
                            }
                        } else {
                            cache_utilities.cache_strategy_untrack(cache_strategy, key);
                        }
                    }
                }
                return deleted_p;
            }
        }
    }

    /**
     * Produce the effect of removing the key from the file vector backed map. If the entry
     * denoted by the key has a file-vector backed reference and SUPPORT-UNDO-P
     * is true, then mark the file vector reference as deleted (which nulls out the
     * payload). Otherwise simply remove the entry from the map.
     * If the cache-strategy is valid and the entry was a file vector reference, then the
     * key is untracked.
     *
     * @param CACHE-STRATEGY
     * 		can be SYMBOLP if no cache strategy is needed.
     * @return :deleted if the entry was a file vector reference, nil otherwise.
     */
    @LispMethod(comment = "Produce the effect of removing the key from the file vector backed map. If the entry\r\ndenoted by the key has a file-vector backed reference and SUPPORT-UNDO-P\r\nis true, then mark the file vector reference as deleted (which nulls out the\r\npayload). Otherwise simply remove the entry from the map.\r\nIf the cache-strategy is valid and the entry was a file vector reference, then the\r\nkey is untracked.\r\n\r\n@param CACHE-STRATEGY\r\n\t\tcan be SYMBOLP if no cache strategy is needed.\r\n@return :deleted if the entry was a file vector reference, nil otherwise.\nProduce the effect of removing the key from the file vector backed map. If the entry\ndenoted by the key has a file-vector backed reference and SUPPORT-UNDO-P\nis true, then mark the file vector reference as deleted (which nulls out the\npayload). Otherwise simply remove the entry from the map.\nIf the cache-strategy is valid and the entry was a file vector reference, then the\nkey is untracked.")
    public static SubLObject file_vector_backed_map_wX_cache_remove(final SubLObject map, final SubLObject cache_strategy, final SubLObject key, SubLObject support_undo_p) {
        if (support_undo_p == UNPROVIDED) {
            support_undo_p = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) : "! cache_utilities.cache_strategy_or_symbol_p(cache_strategy) " + ("cache_utilities.cache_strategy_or_symbol_p(cache_strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) ") + cache_strategy;
        final SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
        if (data_stream_lock.isLock()) {
            SubLObject release = NIL;
            try {
                release = seize_lock(data_stream_lock);
                final SubLObject current_value = map_utilities.map_get_without_values(map, key, $NOT_FOUND);
                final SubLObject is_file_vector_reference = file_vector_reference_p(current_value);
                SubLObject deleted_p = NIL;
                if ((NIL != support_undo_p) && (NIL != is_file_vector_reference)) {
                    final SubLObject ref = current_value;
                    mark_file_vector_reference_as_deleted(ref);
                    deleted_p = $DELETED;
                } else {
                    map_utilities.map_remove(map, key);
                }
                if ((NIL != is_file_vector_reference) && (NIL != cache_utilities.cache_strategy_p(cache_strategy))) {
                    cache_utilities.cache_strategy_untrack(cache_strategy, key);
                }
                return deleted_p;
            } finally {
                if (NIL != release) {
                    release_lock(data_stream_lock);
                }
            }
        }
        final SubLObject current_value2 = map_utilities.map_get_without_values(map, key, $NOT_FOUND);
        final SubLObject is_file_vector_reference2 = file_vector_reference_p(current_value2);
        SubLObject deleted_p2 = NIL;
        if ((NIL != support_undo_p) && (NIL != is_file_vector_reference2)) {
            final SubLObject ref2 = current_value2;
            mark_file_vector_reference_as_deleted(ref2);
            deleted_p2 = $DELETED;
        } else {
            map_utilities.map_remove(map, key);
        }
        if ((NIL != is_file_vector_reference2) && (NIL != cache_utilities.cache_strategy_p(cache_strategy))) {
            cache_utilities.cache_strategy_untrack(cache_strategy, key);
        }
        return deleted_p2;
    }

    /**
     * If the entry denoted by key has a file-vector backed reference, then mark
     * the reference as mutated. This allows to percolate change information
     * properly in situations where the value of a map is a container.
     *
     * @param FVECTOR
     * 		this value need only be valid if the entry is swapped out
     * 		at the time of the call, because touch must page the absent values in
     * @return :MUTATED if the entry was a file vecotr reference, nil otherwise
     */
    @LispMethod(comment = "If the entry denoted by key has a file-vector backed reference, then mark\r\nthe reference as mutated. This allows to percolate change information\r\nproperly in situations where the value of a map is a container.\r\n\r\n@param FVECTOR\r\n\t\tthis value need only be valid if the entry is swapped out\r\n\t\tat the time of the call, because touch must page the absent values in\r\n@return :MUTATED if the entry was a file vecotr reference, nil otherwise\nIf the entry denoted by key has a file-vector backed reference, then mark\nthe reference as mutated. This allows to percolate change information\nproperly in situations where the value of a map is a container.")
    public static final SubLObject file_vector_backed_map_touch_alt(SubLObject map, SubLObject key, SubLObject fvector) {
        if (fvector == UNPROVIDED) {
            fvector = NIL;
        }
        return file_vector_backed_map_wX_cache_touch(map, NIL, key, fvector);
    }

    /**
     * If the entry denoted by key has a file-vector backed reference, then mark
     * the reference as mutated. This allows to percolate change information
     * properly in situations where the value of a map is a container.
     *
     * @param FVECTOR
     * 		this value need only be valid if the entry is swapped out
     * 		at the time of the call, because touch must page the absent values in
     * @return :MUTATED if the entry was a file vecotr reference, nil otherwise
     */
    @LispMethod(comment = "If the entry denoted by key has a file-vector backed reference, then mark\r\nthe reference as mutated. This allows to percolate change information\r\nproperly in situations where the value of a map is a container.\r\n\r\n@param FVECTOR\r\n\t\tthis value need only be valid if the entry is swapped out\r\n\t\tat the time of the call, because touch must page the absent values in\r\n@return :MUTATED if the entry was a file vecotr reference, nil otherwise\nIf the entry denoted by key has a file-vector backed reference, then mark\nthe reference as mutated. This allows to percolate change information\nproperly in situations where the value of a map is a container.")
    public static SubLObject file_vector_backed_map_touch(final SubLObject map, final SubLObject key, SubLObject fvector) {
        if (fvector == UNPROVIDED) {
            fvector = NIL;
        }
        return file_vector_backed_map_wX_cache_touch(map, NIL, key, fvector);
    }

    /**
     * If the entry denoted by key has a file-vector backed reference, then mark
     * the reference as mutated. This allows to percolate change information
     * properly in situations where the value of a map is a container.
     * Touched items have to be untracked in the cache strategy if caching is active.
     *
     * @param CACHE-STRATEGY
     * 		can be SYMBOLP if no cache strategy is needed.
     * @param FVECTOR
     * 		this value need only be valid if the entry is swapped out
     * 		at the time of the call, because touch must page the absent values in
     * @return :MUTATED if the entry was a file vecotr reference, nil otherwise
     */
    @LispMethod(comment = "If the entry denoted by key has a file-vector backed reference, then mark\r\nthe reference as mutated. This allows to percolate change information\r\nproperly in situations where the value of a map is a container.\r\nTouched items have to be untracked in the cache strategy if caching is active.\r\n\r\n@param CACHE-STRATEGY\r\n\t\tcan be SYMBOLP if no cache strategy is needed.\r\n@param FVECTOR\r\n\t\tthis value need only be valid if the entry is swapped out\r\n\t\tat the time of the call, because touch must page the absent values in\r\n@return :MUTATED if the entry was a file vecotr reference, nil otherwise\nIf the entry denoted by key has a file-vector backed reference, then mark\nthe reference as mutated. This allows to percolate change information\nproperly in situations where the value of a map is a container.\nTouched items have to be untracked in the cache strategy if caching is active.")
    public static final SubLObject file_vector_backed_map_wX_cache_touch_alt(SubLObject map, SubLObject cache_strategy, SubLObject key, SubLObject fvector) {
        if (fvector == UNPROVIDED) {
            fvector = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(cache_strategy, CACHE_STRATEGY_OR_SYMBOL_P);
            {
                SubLObject current_value = map_utilities.map_get_without_values(map, key, $NOT_FOUND);
                SubLObject mutated_p = NIL;
                if (NIL != file_vector_reference_p(current_value)) {
                    {
                        SubLObject ref = current_value;
                        if (NIL != file_vector_reference_swapped_outP(ref)) {
                            SubLTrampolineFile.checkType(fvector, FILE_VECTOR_P);
                            file_vector_backed_map_wX_cache_get(map, fvector, cache_strategy, key, UNPROVIDED);
                        }
                        mark_file_vector_reference_as_mutated(ref);
                        if (NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                            {
                                SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
                                if (data_stream_lock.isLock()) {
                                    {
                                        SubLObject lock = data_stream_lock;
                                        SubLObject release = NIL;
                                        try {
                                            release = seize_lock(lock);
                                            cache_utilities.cache_strategy_untrack(cache_strategy, key);
                                        } finally {
                                            if (NIL != release) {
                                                release_lock(lock);
                                            }
                                        }
                                    }
                                } else {
                                    cache_utilities.cache_strategy_untrack(cache_strategy, key);
                                }
                            }
                        }
                    }
                    mutated_p = $MUTATED;
                }
                return mutated_p;
            }
        }
    }

    /**
     * If the entry denoted by key has a file-vector backed reference, then mark
     * the reference as mutated. This allows to percolate change information
     * properly in situations where the value of a map is a container.
     * Touched items have to be untracked in the cache strategy if caching is active.
     *
     * @param CACHE-STRATEGY
     * 		can be SYMBOLP if no cache strategy is needed.
     * @param FVECTOR
     * 		this value need only be valid if the entry is swapped out
     * 		at the time of the call, because touch must page the absent values in
     * @return :MUTATED if the entry was a file vecotr reference, nil otherwise
     */
    @LispMethod(comment = "If the entry denoted by key has a file-vector backed reference, then mark\r\nthe reference as mutated. This allows to percolate change information\r\nproperly in situations where the value of a map is a container.\r\nTouched items have to be untracked in the cache strategy if caching is active.\r\n\r\n@param CACHE-STRATEGY\r\n\t\tcan be SYMBOLP if no cache strategy is needed.\r\n@param FVECTOR\r\n\t\tthis value need only be valid if the entry is swapped out\r\n\t\tat the time of the call, because touch must page the absent values in\r\n@return :MUTATED if the entry was a file vecotr reference, nil otherwise\nIf the entry denoted by key has a file-vector backed reference, then mark\nthe reference as mutated. This allows to percolate change information\nproperly in situations where the value of a map is a container.\nTouched items have to be untracked in the cache strategy if caching is active.")
    public static SubLObject file_vector_backed_map_wX_cache_touch(final SubLObject map, final SubLObject cache_strategy, final SubLObject key, SubLObject fvector) {
        if (fvector == UNPROVIDED) {
            fvector = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) : "! cache_utilities.cache_strategy_or_symbol_p(cache_strategy) " + ("cache_utilities.cache_strategy_or_symbol_p(cache_strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) ") + cache_strategy;
        final SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
        if (data_stream_lock.isLock()) {
            SubLObject release = NIL;
            try {
                release = seize_lock(data_stream_lock);
                final SubLObject current_value = map_utilities.map_get_without_values(map, key, $NOT_FOUND);
                SubLObject mutated_p = NIL;
                if (NIL != file_vector_reference_p(current_value)) {
                    final SubLObject ref = current_value;
                    if (NIL != file_vector_reference_swapped_outP(ref)) {
                        assert NIL != file_vector.file_vector_p(fvector) : "! file_vector.file_vector_p(fvector) " + ("file_vector.file_vector_p(fvector) " + "CommonSymbols.NIL != file_vector.file_vector_p(fvector) ") + fvector;
                        file_vector_backed_map_wX_cache_get(map, fvector, cache_strategy, key, UNPROVIDED);
                    }
                    mark_file_vector_reference_as_mutated(ref);
                    final SubLObject index = file_vector_reference_index(ref);
                    if (NIL != file_vector.file_vector_p(fvector)) {
                        kb_storage_logging.maybe_kb_storage_log_mutate_in_context(index, fvector);
                    } else {
                        kb_storage_logging.maybe_kb_storage_log_mutate(index);
                    }
                    if (NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                        cache_utilities.cache_strategy_untrack(cache_strategy, key);
                    }
                    mutated_p = $MUTATED;
                }
                return mutated_p;
            } finally {
                if (NIL != release) {
                    release_lock(data_stream_lock);
                }
            }
        }
        final SubLObject current_value2 = map_utilities.map_get_without_values(map, key, $NOT_FOUND);
        SubLObject mutated_p2 = NIL;
        if (NIL != file_vector_reference_p(current_value2)) {
            final SubLObject ref2 = current_value2;
            if (NIL != file_vector_reference_swapped_outP(ref2)) {
                assert NIL != file_vector.file_vector_p(fvector) : "! file_vector.file_vector_p(fvector) " + ("file_vector.file_vector_p(fvector) " + "CommonSymbols.NIL != file_vector.file_vector_p(fvector) ") + fvector;
                file_vector_backed_map_wX_cache_get(map, fvector, cache_strategy, key, UNPROVIDED);
            }
            mark_file_vector_reference_as_mutated(ref2);
            final SubLObject index2 = file_vector_reference_index(ref2);
            if (NIL != file_vector.file_vector_p(fvector)) {
                kb_storage_logging.maybe_kb_storage_log_mutate_in_context(index2, fvector);
            } else {
                kb_storage_logging.maybe_kb_storage_log_mutate(index2);
            }
            if (NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                cache_utilities.cache_strategy_untrack(cache_strategy, key);
            }
            mutated_p2 = $MUTATED;
        }
        return mutated_p2;
    }

    /**
     * If the entry is a mutated file vector reference, then the reference index
     * is recovered and the old payload dropped. Otherwise, the method is a no-op.
     *
     * @return :RECOVERED if the entry was a mutated file vector reference, NIL otherwise.
     */
    @LispMethod(comment = "If the entry is a mutated file vector reference, then the reference index\r\nis recovered and the old payload dropped. Otherwise, the method is a no-op.\r\n\r\n@return :RECOVERED if the entry was a mutated file vector reference, NIL otherwise.\nIf the entry is a mutated file vector reference, then the reference index\nis recovered and the old payload dropped. Otherwise, the method is a no-op.")
    public static final SubLObject undo_change_to_file_vector_backed_map_alt(SubLObject map, SubLObject key) {
        return undo_change_to_file_vector_backed_map_wX_cache(map, NIL, key);
    }

    /**
     * If the entry is a mutated file vector reference, then the reference index
     * is recovered and the old payload dropped. Otherwise, the method is a no-op.
     *
     * @return :RECOVERED if the entry was a mutated file vector reference, NIL otherwise.
     */
    @LispMethod(comment = "If the entry is a mutated file vector reference, then the reference index\r\nis recovered and the old payload dropped. Otherwise, the method is a no-op.\r\n\r\n@return :RECOVERED if the entry was a mutated file vector reference, NIL otherwise.\nIf the entry is a mutated file vector reference, then the reference index\nis recovered and the old payload dropped. Otherwise, the method is a no-op.")
    public static SubLObject undo_change_to_file_vector_backed_map(final SubLObject map, final SubLObject key) {
        return undo_change_to_file_vector_backed_map_wX_cache(map, NIL, key);
    }

    /**
     * If the entry is a mutated file vector reference, then the reference index
     * is recovered and the old payload dropped. Otherwise, the method is a no-op.
     * If the cache-strategy is valid, then the key is tracked and counted as a cache miss.
     *
     * @param CACHE-STRATEGY
     * 		can be SYMBOLP if no cache strategy is needed.
     * @return :RECOVERED if the entry was a mutated file vector reference, NIL otherwise.
     */
    @LispMethod(comment = "If the entry is a mutated file vector reference, then the reference index\r\nis recovered and the old payload dropped. Otherwise, the method is a no-op.\r\nIf the cache-strategy is valid, then the key is tracked and counted as a cache miss.\r\n\r\n@param CACHE-STRATEGY\r\n\t\tcan be SYMBOLP if no cache strategy is needed.\r\n@return :RECOVERED if the entry was a mutated file vector reference, NIL otherwise.\nIf the entry is a mutated file vector reference, then the reference index\nis recovered and the old payload dropped. Otherwise, the method is a no-op.\nIf the cache-strategy is valid, then the key is tracked and counted as a cache miss.")
    public static final SubLObject undo_change_to_file_vector_backed_map_wX_cache_alt(SubLObject map, SubLObject cache_strategy, SubLObject key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(cache_strategy, CACHE_STRATEGY_OR_SYMBOL_P);
            {
                SubLObject current_value = map_utilities.map_get_without_values(map, key, $NOT_FOUND);
                SubLObject recovered_p = NIL;
                if (NIL != file_vector_reference_p(current_value)) {
                    {
                        SubLObject ref = current_value;
                        if (NIL != fvector_ref_has_mutated_index_p(ref)) {
                            restore_file_vector_reference(ref);
                            if (NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                                {
                                    SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
                                    if (data_stream_lock.isLock()) {
                                        {
                                            SubLObject lock = data_stream_lock;
                                            SubLObject release = NIL;
                                            try {
                                                release = seize_lock(lock);
                                                cache_utilities.cache_strategy_track(cache_strategy, key);
                                                cache_utilities.cache_strategy_note_cache_miss(cache_strategy);
                                            } finally {
                                                if (NIL != release) {
                                                    release_lock(lock);
                                                }
                                            }
                                        }
                                    } else {
                                        cache_utilities.cache_strategy_track(cache_strategy, key);
                                        cache_utilities.cache_strategy_note_cache_miss(cache_strategy);
                                    }
                                }
                            }
                            recovered_p = $RECOVERED;
                        }
                    }
                }
                return recovered_p;
            }
        }
    }

    /**
     * If the entry is a mutated file vector reference, then the reference index
     * is recovered and the old payload dropped. Otherwise, the method is a no-op.
     * If the cache-strategy is valid, then the key is tracked and counted as a cache miss.
     *
     * @param CACHE-STRATEGY
     * 		can be SYMBOLP if no cache strategy is needed.
     * @return :RECOVERED if the entry was a mutated file vector reference, NIL otherwise.
     */
    @LispMethod(comment = "If the entry is a mutated file vector reference, then the reference index\r\nis recovered and the old payload dropped. Otherwise, the method is a no-op.\r\nIf the cache-strategy is valid, then the key is tracked and counted as a cache miss.\r\n\r\n@param CACHE-STRATEGY\r\n\t\tcan be SYMBOLP if no cache strategy is needed.\r\n@return :RECOVERED if the entry was a mutated file vector reference, NIL otherwise.\nIf the entry is a mutated file vector reference, then the reference index\nis recovered and the old payload dropped. Otherwise, the method is a no-op.\nIf the cache-strategy is valid, then the key is tracked and counted as a cache miss.")
    public static SubLObject undo_change_to_file_vector_backed_map_wX_cache(final SubLObject map, final SubLObject cache_strategy, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) : "! cache_utilities.cache_strategy_or_symbol_p(cache_strategy) " + ("cache_utilities.cache_strategy_or_symbol_p(cache_strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) ") + cache_strategy;
        final SubLObject data_stream_lock = $file_vector_backed_map_read_lock$.getDynamicValue(thread);
        if (data_stream_lock.isLock()) {
            SubLObject release = NIL;
            try {
                release = seize_lock(data_stream_lock);
                final SubLObject current_value = map_utilities.map_get_without_values(map, key, $NOT_FOUND);
                SubLObject recovered_p = NIL;
                if (NIL != file_vector_reference_p(current_value)) {
                    final SubLObject ref = current_value;
                    if (NIL != fvector_ref_has_mutated_index_p(ref)) {
                        restore_file_vector_reference(ref);
                        if (NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                            cache_utilities.cache_strategy_track(cache_strategy, key);
                            cache_utilities.cache_strategy_note_cache_miss(cache_strategy);
                        }
                        recovered_p = $RECOVERED;
                    }
                }
                return recovered_p;
            } finally {
                if (NIL != release) {
                    release_lock(data_stream_lock);
                }
            }
        }
        final SubLObject current_value2 = map_utilities.map_get_without_values(map, key, $NOT_FOUND);
        SubLObject recovered_p2 = NIL;
        if (NIL != file_vector_reference_p(current_value2)) {
            final SubLObject ref2 = current_value2;
            if (NIL != fvector_ref_has_mutated_index_p(ref2)) {
                restore_file_vector_reference(ref2);
                if (NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                    cache_utilities.cache_strategy_track(cache_strategy, key);
                    cache_utilities.cache_strategy_note_cache_miss(cache_strategy);
                }
                recovered_p2 = $RECOVERED;
            }
        }
        return recovered_p2;
    }

    /**
     *
     *
     * @unknown In the case of a file-vector backed map this will swap in all values by side-effect.
     * @unknown This will not iterate over the deleted values ... these will simply be skipped.
     */
    @LispMethod(comment = "@unknown In the case of a file-vector backed map this will swap in all values by side-effect.\r\n@unknown This will not iterate over the deleted values ... these will simply be skipped.")
    public static final SubLObject do_file_vector_backed_map_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt50);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    SubLObject map = NIL;
                    SubLObject v_file_vector = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt50);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt50);
                    value = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt50);
                    map = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt50);
                    v_file_vector = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt50);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt50);
                            if (NIL == member(current_3, $list_alt51, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt50);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            SubLObject cache_strategy_tail = property_list_member($CACHE_STRATEGY, current);
                            SubLObject cache_strategy = (NIL != cache_strategy_tail) ? ((SubLObject) (cadr(cache_strategy_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject impl_value = $sym55$IMPL_VALUE;
                                return list(CLET, list(value), list(DO_MAP, list(key, impl_value, map, $DONE, done), listS(PUNLESS, list(CAND, list(FILE_VECTOR_REFERENCE_P, impl_value), list($sym59$FILE_VECTOR_REFERENCE_DELETED_, impl_value)), list(CSETQ, value, list($sym61$FILE_VECTOR_BACKED_MAP_W__CACHE_GET, map, v_file_vector, cache_strategy, key)), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown In the case of a file-vector backed map this will swap in all values by side-effect.
     * @unknown This will not iterate over the deleted values ... these will simply be skipped.
     */
    @LispMethod(comment = "@unknown In the case of a file-vector backed map this will swap in all values by side-effect.\r\n@unknown This will not iterate over the deleted values ... these will simply be skipped.")
    public static SubLObject do_file_vector_backed_map(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject map = NIL;
        SubLObject v_file_vector = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        map = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        v_file_vector = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list58);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list58);
            if (NIL == member(current_$3, $list59, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list58);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject cache_strategy_tail = property_list_member($CACHE_STRATEGY, current);
        final SubLObject cache_strategy = (NIL != cache_strategy_tail) ? cadr(cache_strategy_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject impl_value = $sym63$IMPL_VALUE;
        return list(CLET, list(value), list(DO_MAP, list(key, impl_value, map, $DONE, done), listS(PUNLESS, list(CAND, list(FILE_VECTOR_REFERENCE_P, impl_value), list($sym67$FILE_VECTOR_REFERENCE_DELETED_, impl_value)), list(CSETQ, value, list($sym69$FILE_VECTOR_BACKED_MAP_W__CACHE_GET, map, v_file_vector, cache_strategy, key)), append(body, NIL))));
    }

    /**
     * Create a bew iterator for walking over a file-vector backed map.
     *
     * @see DO-FILE-VECTOR-BACKED-MAP for some of the cost concerns
     */
    @LispMethod(comment = "Create a bew iterator for walking over a file-vector backed map.\r\n\r\n@see DO-FILE-VECTOR-BACKED-MAP for some of the cost concerns")
    public static final SubLObject new_file_vector_backed_map_iterator_alt(SubLObject map, SubLObject v_file_vector, SubLObject common_symbols, SubLObject cache_strategy) {
        if (common_symbols == UNPROVIDED) {
            common_symbols = NIL;
        }
        if (cache_strategy == UNPROVIDED) {
            cache_strategy = NIL;
        }
        if (NIL == common_symbols) {
            common_symbols = cfasl_current_common_symbols();
        }
        return iteration.new_iterator(new_file_vector_backed_map_iterator_state(map, v_file_vector, common_symbols, cache_strategy), FILE_VECTOR_BACKED_MAP_ITERATOR_DONE, FILE_VECTOR_BACKED_MAP_ITERATOR_NEXT, UNPROVIDED);
    }

    /**
     * Create a bew iterator for walking over a file-vector backed map.
     *
     * @see DO-FILE-VECTOR-BACKED-MAP for some of the cost concerns
     */
    @LispMethod(comment = "Create a bew iterator for walking over a file-vector backed map.\r\n\r\n@see DO-FILE-VECTOR-BACKED-MAP for some of the cost concerns")
    public static SubLObject new_file_vector_backed_map_iterator(final SubLObject map, final SubLObject v_file_vector, SubLObject common_symbols, SubLObject cache_strategy) {
        if (common_symbols == UNPROVIDED) {
            common_symbols = NIL;
        }
        if (cache_strategy == UNPROVIDED) {
            cache_strategy = NIL;
        }
        if (NIL == common_symbols) {
            common_symbols = cfasl_current_common_symbols();
        }
        return iteration.new_iterator(new_file_vector_backed_map_iterator_state(map, v_file_vector, common_symbols, cache_strategy), FILE_VECTOR_BACKED_MAP_ITERATOR_DONE, FILE_VECTOR_BACKED_MAP_ITERATOR_NEXT, UNPROVIDED);
    }

    public static final SubLObject new_file_vector_backed_map_iterator_state_alt(SubLObject map, SubLObject v_file_vector, SubLObject common_symbols, SubLObject cache_strategy) {
        {
            SubLObject iterator = map_utilities.new_map_iterator(map);
            SubLObject curr_item = iteration.iteration_next(iterator);
            return list(curr_item, iterator, map, v_file_vector, common_symbols, cache_strategy);
        }
    }

    public static SubLObject new_file_vector_backed_map_iterator_state(final SubLObject map, final SubLObject v_file_vector, final SubLObject common_symbols, final SubLObject cache_strategy) {
        final SubLObject iterator = map_utilities.new_map_iterator(map);
        final SubLObject curr_item = iteration.iteration_next(iterator);
        return list(curr_item, iterator, map, v_file_vector, common_symbols, cache_strategy);
    }

    public static final SubLObject file_vector_backed_map_iterator_done_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject curr_item = NIL;
            SubLObject iterator = NIL;
            SubLObject map = NIL;
            SubLObject v_file_vector = NIL;
            SubLObject common_symbols = NIL;
            SubLObject cache_strategy = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt64);
            curr_item = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt64);
            iterator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt64);
            map = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt64);
            v_file_vector = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt64);
            common_symbols = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt64);
            cache_strategy = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean((NIL != iteration.iteration_done(iterator)) && (NIL == curr_item));
            } else {
                cdestructuring_bind_error(datum, $list_alt64);
            }
        }
        return NIL;
    }

    public static SubLObject file_vector_backed_map_iterator_done(final SubLObject state) {
        SubLObject curr_item = NIL;
        SubLObject iterator = NIL;
        SubLObject map = NIL;
        SubLObject v_file_vector = NIL;
        SubLObject common_symbols = NIL;
        SubLObject cache_strategy = NIL;
        destructuring_bind_must_consp(state, state, $list72);
        curr_item = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list72);
        iterator = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list72);
        map = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list72);
        v_file_vector = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list72);
        common_symbols = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list72);
        cache_strategy = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((NIL != iteration.iteration_done(iterator)) && (NIL == curr_item));
        }
        cdestructuring_bind_error(state, $list72);
        return NIL;
    }

    public static final SubLObject file_vector_backed_map_iterator_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = state;
                SubLObject current = datum;
                SubLObject curr_item = NIL;
                SubLObject iterator = NIL;
                SubLObject map = NIL;
                SubLObject v_file_vector = NIL;
                SubLObject common_symbols = NIL;
                SubLObject cache_strategy = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt64);
                curr_item = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt64);
                iterator = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt64);
                map = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt64);
                v_file_vector = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt64);
                common_symbols = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt64);
                cache_strategy = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject not_found_flag = state;
                        SubLObject value = not_found_flag;
                        SubLObject key = NIL;
                        while (value == not_found_flag) {
                            key = curr_item.first();
                            {
                                SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                                try {
                                    $cfasl_common_symbols$.bind(NIL, thread);
                                    cfasl_set_common_symbols_simple(common_symbols);
                                    value = file_vector_backed_map_wX_cache_get(map, v_file_vector, cache_strategy, key, not_found_flag);
                                } finally {
                                    $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                                }
                            }
                            if (NIL != iteration.iteration_done(iterator)) {
                                set_nth(ZERO_INTEGER, state, NIL);
                                return values(NIL, state, $ITERATION_HALTED_PREMATURELY);
                            }
                            {
                                SubLObject next_item = iteration.iteration_next(iterator);
                                set_nth(ZERO_INTEGER, state, next_item);
                                curr_item = next_item;
                            }
                        } 
                        curr_item = list(key, value);
                        return values(curr_item, state);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt64);
                }
            }
            return NIL;
        }
    }

    public static SubLObject file_vector_backed_map_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject curr_item = NIL;
        SubLObject iterator = NIL;
        SubLObject map = NIL;
        SubLObject v_file_vector = NIL;
        SubLObject common_symbols = NIL;
        SubLObject cache_strategy = NIL;
        destructuring_bind_must_consp(state, state, $list72);
        curr_item = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list72);
        iterator = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list72);
        map = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list72);
        v_file_vector = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list72);
        common_symbols = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list72);
        cache_strategy = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject value = state;
            SubLObject key = NIL;
            while (value.eql(state)) {
                key = curr_item.first();
                final SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                try {
                    $cfasl_common_symbols$.bind(NIL, thread);
                    cfasl_set_common_symbols_simple(common_symbols);
                    value = file_vector_backed_map_wX_cache_get(map, v_file_vector, cache_strategy, key, state);
                } finally {
                    $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                }
                if (value.eql(state) && (NIL != iteration.iteration_done(iterator))) {
                    set_nth(ZERO_INTEGER, state, NIL);
                    return subl_promotions.values3(NIL, state, $ITERATION_HALTED_PREMATURELY);
                }
                final SubLObject next_item = iteration.iteration_next(iterator);
                set_nth(ZERO_INTEGER, state, next_item);
                curr_item = next_item;
            } 
            curr_item = list(key, value);
            return subl_promotions.values3(curr_item, state, NIL);
        }
        cdestructuring_bind_error(state, $list72);
        return NIL;
    }

    /**
     * Determine the ratio of paged in and paged out elements in the map.
     * Be agnostic about whether all objects have to be backed by file vector reference
     * objects or not.
     */
    @LispMethod(comment = "Determine the ratio of paged in and paged out elements in the map.\r\nBe agnostic about whether all objects have to be backed by file vector reference\r\nobjects or not.\nDetermine the ratio of paged in and paged out elements in the map.\nBe agnostic about whether all objects have to be backed by file vector reference\nobjects or not.")
    public static final SubLObject file_vector_backed_map_cache_ratio_alt(SubLObject map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject paged_in = ZERO_INTEGER;
                SubLObject paged_out = ZERO_INTEGER;
                SubLObject iterator = map_utilities.new_map_iterator(map);
                SubLObject done_var = NIL;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject var = iteration.iteration_next(iterator);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            {
                                SubLObject datum = var;
                                SubLObject current = datum;
                                SubLObject key = NIL;
                                SubLObject value = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt2);
                                key = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt2);
                                value = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != file_vector_reference_p(value)) {
                                        if (NIL != file_vector_reference_presentP(value)) {
                                            paged_in = add(paged_in, ONE_INTEGER);
                                        } else {
                                            if (NIL != file_vector_reference_swapped_outP(value)) {
                                                paged_out = add(paged_out, ONE_INTEGER);
                                            }
                                        }
                                    } else {
                                        paged_in = add(paged_in, ONE_INTEGER);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt2);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
                return values(paged_in, paged_out);
            }
        }
    }

    /**
     * Determine the ratio of paged in and paged out elements in the map.
     * Be agnostic about whether all objects have to be backed by file vector reference
     * objects or not.
     */
    @LispMethod(comment = "Determine the ratio of paged in and paged out elements in the map.\r\nBe agnostic about whether all objects have to be backed by file vector reference\r\nobjects or not.\nDetermine the ratio of paged in and paged out elements in the map.\nBe agnostic about whether all objects have to be backed by file vector reference\nobjects or not.")
    public static SubLObject file_vector_backed_map_cache_ratio(final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paged_in = ZERO_INTEGER;
        SubLObject paged_out = ZERO_INTEGER;
        final SubLObject iterator = map_utilities.new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list2);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list2);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != file_vector_reference_p(value)) {
                        if (NIL != file_vector_reference_presentP(value)) {
                            paged_in = add(paged_in, ONE_INTEGER);
                        } else
                            if (NIL != file_vector_reference_swapped_outP(value)) {
                                paged_out = add(paged_out, ONE_INTEGER);
                            }

                    } else {
                        paged_in = add(paged_in, ONE_INTEGER);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list2);
                }
            }
        }
        return values(paged_in, paged_out);
    }

    /**
     * For all values in the MAP, if the value is a pristine file
     * vector reference, then zero out its payload to make that data
     * available for garbage collection.
     *
     * @return 0 the MAP
     * @return 1 the count of paged out items
     */
    @LispMethod(comment = "For all values in the MAP, if the value is a pristine file\r\nvector reference, then zero out its payload to make that data\r\navailable for garbage collection.\r\n\r\n@return 0 the MAP\r\n@return 1 the count of paged out items\nFor all values in the MAP, if the value is a pristine file\nvector reference, then zero out its payload to make that data\navailable for garbage collection.")
    public static final SubLObject swap_out_all_pristine_file_vector_backed_map_objects_alt(SubLObject map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject swapped_out = ZERO_INTEGER;
                SubLObject iterator = map_utilities.new_map_iterator(map);
                SubLObject done_var = NIL;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject var = iteration.iteration_next(iterator);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            {
                                SubLObject datum = var;
                                SubLObject current = datum;
                                SubLObject key = NIL;
                                SubLObject value = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt2);
                                key = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt2);
                                value = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != potentially_swap_out_pristine_file_vector_backed_map_object(value)) {
                                        swapped_out = add(swapped_out, ONE_INTEGER);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt2);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
                return values(map, swapped_out);
            }
        }
    }

    /**
     * For all values in the MAP, if the value is a pristine file
     * vector reference, then zero out its payload to make that data
     * available for garbage collection.
     *
     * @return 0 the MAP
     * @return 1 the count of paged out items
     */
    @LispMethod(comment = "For all values in the MAP, if the value is a pristine file\r\nvector reference, then zero out its payload to make that data\r\navailable for garbage collection.\r\n\r\n@return 0 the MAP\r\n@return 1 the count of paged out items\nFor all values in the MAP, if the value is a pristine file\nvector reference, then zero out its payload to make that data\navailable for garbage collection.")
    public static SubLObject swap_out_all_pristine_file_vector_backed_map_objects(final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject swapped_out = ZERO_INTEGER;
        final SubLObject iterator = map_utilities.new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list2);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list2);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != potentially_swap_out_pristine_file_vector_backed_map_object(value)) {
                        swapped_out = add(swapped_out, ONE_INTEGER);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list2);
                }
            }
        }
        return values(map, swapped_out);
    }

    /**
     * Swaps out one potentially pristine file vector reference, then
     * zeroes out its payload to make that data available for garbage
     * collection.
     *
     * @return T if the file vector reference was pristine, NIL otherwise
     */
    @LispMethod(comment = "Swaps out one potentially pristine file vector reference, then\r\nzeroes out its payload to make that data available for garbage\r\ncollection.\r\n\r\n@return T if the file vector reference was pristine, NIL otherwise\nSwaps out one potentially pristine file vector reference, then\nzeroes out its payload to make that data available for garbage\ncollection.")
    public static final SubLObject swap_out_pristine_file_vector_backed_map_object_alt(SubLObject map, SubLObject key) {
        {
            SubLObject value = map_utilities.map_get(map, key, UNPROVIDED);
            return potentially_swap_out_pristine_file_vector_backed_map_object(value);
        }
    }

    /**
     * Swaps out one potentially pristine file vector reference, then
     * zeroes out its payload to make that data available for garbage
     * collection.
     *
     * @return T if the file vector reference was pristine, NIL otherwise
     */
    @LispMethod(comment = "Swaps out one potentially pristine file vector reference, then\r\nzeroes out its payload to make that data available for garbage\r\ncollection.\r\n\r\n@return T if the file vector reference was pristine, NIL otherwise\nSwaps out one potentially pristine file vector reference, then\nzeroes out its payload to make that data available for garbage\ncollection.")
    public static SubLObject swap_out_pristine_file_vector_backed_map_object(final SubLObject map, final SubLObject key) {
        final SubLObject value = map_utilities.map_get(map, key, UNPROVIDED);
        return potentially_swap_out_pristine_file_vector_backed_map_object(value);
    }

    /**
     * Helper for swapping out, both in the larger context of swapping out all and
     * in the more specific context of swapping out some.
     *
     * @return T if there was a file vector reference that was pristine and swapped
    out, NIL otherwise
     */
    @LispMethod(comment = "Helper for swapping out, both in the larger context of swapping out all and\r\nin the more specific context of swapping out some.\r\n\r\n@return T if there was a file vector reference that was pristine and swapped\r\nout, NIL otherwise\nHelper for swapping out, both in the larger context of swapping out all and\nin the more specific context of swapping out some.")
    public static final SubLObject potentially_swap_out_pristine_file_vector_backed_map_object_alt(SubLObject value) {
        if (NIL != file_vector_reference_p(value)) {
            if (NIL != file_vector_reference_present_pristineP(value)) {
                clear_file_vector_reference_referenced_object(value);
                return T;
            }
        }
        return NIL;
    }

    /**
     * Helper for swapping out, both in the larger context of swapping out all and
     * in the more specific context of swapping out some.
     *
     * @return T if there was a file vector reference that was pristine and swapped
    out, NIL otherwise
     */
    @LispMethod(comment = "Helper for swapping out, both in the larger context of swapping out all and\r\nin the more specific context of swapping out some.\r\n\r\n@return T if there was a file vector reference that was pristine and swapped\r\nout, NIL otherwise\nHelper for swapping out, both in the larger context of swapping out all and\nin the more specific context of swapping out some.")
    public static SubLObject potentially_swap_out_pristine_file_vector_backed_map_object(final SubLObject value) {
        if ((NIL != file_vector_reference_p(value)) && (NIL != file_vector_reference_present_pristineP(value))) {
            kb_storage_logging.maybe_kb_storage_log_page_out(file_vector_reference_index(value));
            clear_file_vector_reference_referenced_object(value);
            return T;
        }
        return NIL;
    }

    /**
     * Remove all of the deleted file-vector references; replace all the
     * mutated references with just the payload; leave the others alone.
     *
     * @param the
     * 		map to be compacted
     * @param the
    map
     * 		
     */
    @LispMethod(comment = "Remove all of the deleted file-vector references; replace all the\r\nmutated references with just the payload; leave the others alone.\r\n\r\n@param the\r\n\t\tmap to be compacted\r\n@param the\nmap\nRemove all of the deleted file-vector references; replace all the\nmutated references with just the payload; leave the others alone.")
    public static final SubLObject compact_file_vector_backed_map_representation_alt(SubLObject map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iterator = map_utilities.new_map_iterator(map);
                SubLObject done_var = NIL;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject var = iteration.iteration_next(iterator);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            {
                                SubLObject datum = var;
                                SubLObject current = datum;
                                SubLObject key = NIL;
                                SubLObject value = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt2);
                                key = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt2);
                                value = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (NIL != file_vector_reference_p(value)) {
                                        if (NIL != file_vector_reference_deletedP(value)) {
                                            map_utilities.map_remove(map, key);
                                        } else {
                                            if (NIL != file_vector_reference_present_mutatedP(value)) {
                                                {
                                                    SubLObject payload = file_vector_reference_referenced_object(value);
                                                    map_utilities.map_put(map, key, payload);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt2);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
            }
            return map;
        }
    }

    /**
     * Remove all of the deleted file-vector references; replace all the
     * mutated references with just the payload; leave the others alone.
     *
     * @param the
     * 		map to be compacted
     * @param the
    		map
     * 		
     */
    @LispMethod(comment = "Remove all of the deleted file-vector references; replace all the\r\nmutated references with just the payload; leave the others alone.\r\n\r\n@param the\r\n\t\tmap to be compacted\r\n@param the\n\t\tmap\nRemove all of the deleted file-vector references; replace all the\nmutated references with just the payload; leave the others alone.")
    public static SubLObject compact_file_vector_backed_map_representation(final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = map_utilities.new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list2);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list2);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != file_vector_reference_p(value)) {
                        if (NIL != file_vector_reference_deletedP(value)) {
                            map_utilities.map_remove(map, key);
                        } else
                            if (NIL != file_vector_reference_present_mutatedP(value)) {
                                final SubLObject payload = file_vector_reference_referenced_object(value);
                                map_utilities.map_put(map, key, payload);
                            }

                    }
                } else {
                    cdestructuring_bind_error(datum, $list2);
                }
            }
        }
        return map;
    }

    /**
     * Since we use one entry for the key and one for the datum, we
     * can simply multiply the element number by two (because the entries
     * are two wide) and then offset into the second part of the entry.
     *
     * @return FIXNUMP
     */
    @LispMethod(comment = "Since we use one entry for the key and one for the datum, we\r\ncan simply multiply the element number by two (because the entries\r\nare two wide) and then offset into the second part of the entry.\r\n\r\n@return FIXNUMP\nSince we use one entry for the key and one for the datum, we\ncan simply multiply the element number by two (because the entries\nare two wide) and then offset into the second part of the entry.")
    public static final SubLObject file_vector_index_from_map_element_number_alt(SubLObject elem_num) {
        {
            SubLObject key_index = multiply(elem_num, TWO_INTEGER);
            return file_vector_value_index_from_key_index(key_index);
        }
    }

    /**
     * Since we use one entry for the key and one for the datum, we
     * can simply multiply the element number by two (because the entries
     * are two wide) and then offset into the second part of the entry.
     *
     * @return FIXNUMP
     */
    @LispMethod(comment = "Since we use one entry for the key and one for the datum, we\r\ncan simply multiply the element number by two (because the entries\r\nare two wide) and then offset into the second part of the entry.\r\n\r\n@return FIXNUMP\nSince we use one entry for the key and one for the datum, we\ncan simply multiply the element number by two (because the entries\nare two wide) and then offset into the second part of the entry.")
    public static SubLObject file_vector_index_from_map_element_number(final SubLObject elem_num) {
        final SubLObject key_index = multiply(elem_num, TWO_INTEGER);
        return file_vector_value_index_from_key_index(key_index);
    }

    /**
     * The entries are written key/value, so the second part of the
     * entry is at one-off from the key index.
     *
     * @return FIXNUMP
     */
    @LispMethod(comment = "The entries are written key/value, so the second part of the\r\nentry is at one-off from the key index.\r\n\r\n@return FIXNUMP\nThe entries are written key/value, so the second part of the\nentry is at one-off from the key index.")
    public static final SubLObject file_vector_value_index_from_key_index_alt(SubLObject key_index) {
        return add(key_index, ONE_INTEGER);
    }

    /**
     * The entries are written key/value, so the second part of the
     * entry is at one-off from the key index.
     *
     * @return FIXNUMP
     */
    @LispMethod(comment = "The entries are written key/value, so the second part of the\r\nentry is at one-off from the key index.\r\n\r\n@return FIXNUMP\nThe entries are written key/value, so the second part of the\nentry is at one-off from the key index.")
    public static SubLObject file_vector_value_index_from_key_index(final SubLObject key_index) {
        return add(key_index, ONE_INTEGER);
    }

    /**
     * Since we use one entry for the key and one for the datum, we
     * can simply divide the size. Note that other storage schemes need
     * to reimplement this function.
     *
     * @return FIXNUMP
     */
    @LispMethod(comment = "Since we use one entry for the key and one for the datum, we\r\ncan simply divide the size. Note that other storage schemes need\r\nto reimplement this function.\r\n\r\n@return FIXNUMP\nSince we use one entry for the key and one for the datum, we\ncan simply divide the size. Note that other storage schemes need\nto reimplement this function.")
    public static final SubLObject map_size_from_file_vector_length_alt(SubLObject v_file_vector) {
        return integerDivide(file_vector.file_vector_length(v_file_vector), TWO_INTEGER);
    }

    /**
     * Since we use one entry for the key and one for the datum, we
     * can simply divide the size. Note that other storage schemes need
     * to reimplement this function.
     *
     * @return FIXNUMP
     */
    @LispMethod(comment = "Since we use one entry for the key and one for the datum, we\r\ncan simply divide the size. Note that other storage schemes need\r\nto reimplement this function.\r\n\r\n@return FIXNUMP\nSince we use one entry for the key and one for the datum, we\ncan simply divide the size. Note that other storage schemes need\nto reimplement this function.")
    public static SubLObject map_size_from_file_vector_length(final SubLObject v_file_vector) {
        return integerDivide(file_vector.file_vector_length(v_file_vector), TWO_INTEGER);
    }

    public static final SubLObject file_vector_backed_map_read_key_alt(SubLObject data_stream) {
        return cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject file_vector_backed_map_read_key(final SubLObject data_stream) {
        return cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject file_vector_backed_map_read_value_alt(SubLObject data_stream) {
        return cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject file_vector_backed_map_read_value(final SubLObject data_stream) {
        return cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Destructively change a map in place into a file vector backed map. If the map is
     * one that already has backing, then all of the items have to be swapped in.
     *
     * @return the modified map
     */
    @LispMethod(comment = "Destructively change a map in place into a file vector backed map. If the map is\r\none that already has backing, then all of the items have to be swapped in.\r\n\r\n@return the modified map\nDestructively change a map in place into a file vector backed map. If the map is\none that already has backing, then all of the items have to be swapped in.")
    public static final SubLObject convert_map_to_file_vector_backed_map(SubLObject map, SubLObject v_file_vector, SubLObject swapped_out_p) {
        if (swapped_out_p == UNPROVIDED) {
            swapped_out_p = NIL;
        }
        return build_file_vector_backed_map_from_map(map, map, v_file_vector, swapped_out_p);
    }

    public static SubLObject convert_map_to_file_vector_backed_map(final SubLObject map, final SubLObject v_file_vector, SubLObject swapped_out_p, SubLObject compact_p) {
        if (swapped_out_p == UNPROVIDED) {
            swapped_out_p = NIL;
        }
        if (compact_p == UNPROVIDED) {
            compact_p = NIL;
        }
        return build_file_vector_backed_map_from_map(map, map, v_file_vector, swapped_out_p, compact_p);
    }

    /**
     * Create a new map with the same test and size as the old map, then build a file vector
     * backed map in it from the contents of hte old-map, using file-vector for the backing.
     * SWAPPED-OUT-P controls whether the file references have only references or payloads as well
     *
     * @return the new map
     */
    @LispMethod(comment = "Create a new map with the same test and size as the old map, then build a file vector\r\nbacked map in it from the contents of hte old-map, using file-vector for the backing.\r\nSWAPPED-OUT-P controls whether the file references have only references or payloads as well\r\n\r\n@return the new map\nCreate a new map with the same test and size as the old map, then build a file vector\nbacked map in it from the contents of hte old-map, using file-vector for the backing.\nSWAPPED-OUT-P controls whether the file references have only references or payloads as well")
    public static final SubLObject create_file_vector_backed_map_from_map(SubLObject old_map, SubLObject v_file_vector, SubLObject swapped_out_p) {
        if (swapped_out_p == UNPROVIDED) {
            swapped_out_p = NIL;
        }
        {
            SubLObject new_map = map_utilities.new_map_with_same_properties(old_map);
            return build_file_vector_backed_map_from_map(old_map, new_map, v_file_vector, swapped_out_p);
        }
    }

    public static SubLObject create_file_vector_backed_map_from_map(final SubLObject old_map, final SubLObject v_file_vector, SubLObject swapped_out_p, SubLObject compact_p) {
        if (swapped_out_p == UNPROVIDED) {
            swapped_out_p = NIL;
        }
        if (compact_p == UNPROVIDED) {
            compact_p = NIL;
        }
        final SubLObject new_map = map_utilities.new_map_with_same_properties(old_map);
        return build_file_vector_backed_map_from_map(old_map, new_map, v_file_vector, swapped_out_p, compact_p);
    }

    /**
     *
     *
     * @return the new map
     */
    @LispMethod(comment = "@return the new map")
    public static final SubLObject populate_file_vector_backed_map_from_map(SubLObject old_map, SubLObject new_map, SubLObject v_file_vector, SubLObject swapped_out_p) {
        if (swapped_out_p == UNPROVIDED) {
            swapped_out_p = NIL;
        }
        return build_file_vector_backed_map_from_map(old_map, new_map, v_file_vector, swapped_out_p);
    }

    public static SubLObject populate_file_vector_backed_map_from_map(final SubLObject old_map, final SubLObject new_map, final SubLObject v_file_vector, SubLObject swapped_out_p, SubLObject compact_p) {
        if (swapped_out_p == UNPROVIDED) {
            swapped_out_p = NIL;
        }
        if (compact_p == UNPROVIDED) {
            compact_p = NIL;
        }
        return build_file_vector_backed_map_from_map(old_map, new_map, v_file_vector, swapped_out_p, compact_p);
    }

    /**
     * Put all of the entries of the old map out into the file vector and enter the keys with
     * file references (appropriately swapped in or out, depending on the SWAPPED-OUT-P option),
     * into the new map.
     *
     * @return the new map
     */
    @LispMethod(comment = "Put all of the entries of the old map out into the file vector and enter the keys with\r\nfile references (appropriately swapped in or out, depending on the SWAPPED-OUT-P option),\r\ninto the new map.\r\n\r\n@return the new map\nPut all of the entries of the old map out into the file vector and enter the keys with\nfile references (appropriately swapped in or out, depending on the SWAPPED-OUT-P option),\ninto the new map.")
    public static final SubLObject build_file_vector_backed_map_from_map(SubLObject old_map, SubLObject new_map, SubLObject v_file_vector, SubLObject swapped_out_p) {
        if (swapped_out_p == UNPROVIDED) {
            swapped_out_p = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            write_file_vector_backing_map_prologue(new_map, v_file_vector);
            {
                SubLObject iterator = map_utilities.new_map_iterator(old_map);
                SubLObject done_var = NIL;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject var = iteration.iteration_next(iterator);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            {
                                SubLObject datum = var;
                                SubLObject current = datum;
                                SubLObject key = NIL;
                                SubLObject value = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt2);
                                key = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt2);
                                value = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    if (!((NIL != file_vector_reference_p(value)) && (NIL != file_vector_reference_deletedP(value)))) {
                                        if (NIL != file_vector_reference_p(value)) {
                                            if (NIL == file_vector_reference_presentP(value)) {
                                                Errors.error($str_alt66$Cannot_convert_a_file_backed_map_);
                                            }
                                            value = file_vector_reference_referenced_object(value);
                                        }
                                        {
                                            SubLObject key_index = write_file_vector_backing_map_entry(key, value, v_file_vector);
                                            SubLObject value_index = file_vector_value_index_from_key_index(key_index);
                                            SubLObject reference = (NIL != swapped_out_p) ? ((SubLObject) (new_file_vector_reference(value_index))) : new_file_vector_reference_wX_payload(value_index, value);
                                            map_utilities.map_put(new_map, key, reference);
                                        }
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt2);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
            }
            return new_map;
        }
    }

    public static SubLObject build_file_vector_backed_map_from_map(final SubLObject old_map, final SubLObject new_map, final SubLObject v_file_vector, SubLObject swapped_out_p, SubLObject compact_p) {
        if (swapped_out_p == UNPROVIDED) {
            swapped_out_p = NIL;
        }
        if (compact_p == UNPROVIDED) {
            compact_p = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == compact_p) {
            write_file_vector_backing_map_prologue(new_map, v_file_vector);
        }
        final SubLObject iterator = map_utilities.new_map_iterator(old_map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list2);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list2);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL == file_vector_reference_p(value)) || (NIL == file_vector_reference_deletedP(value))) {
                        if ((NIL != file_vector_reference_p(value)) && (NIL == file_vector_reference_presentP(value))) {
                            Errors.warn($str74$Cannot_convert_a_file_backed_map_, old_map, value);
                        } else {
                            if (NIL != file_vector_reference_p(value)) {
                                value = file_vector_reference_referenced_object(value);
                            }
                            SubLObject value_index = NIL;
                            if (NIL != compact_p) {
                                value_index = write_file_vector_backing_map_entry_value(value, v_file_vector, UNPROVIDED);
                            } else {
                                final SubLObject key_index = write_file_vector_backing_map_entry(key, value, v_file_vector);
                                value_index = file_vector_value_index_from_key_index(key_index);
                            }
                            final SubLObject reference = (NIL != swapped_out_p) ? new_file_vector_reference(value_index) : new_file_vector_reference_wX_payload(value_index, value);
                            map_utilities.map_put(new_map, key, reference);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list2);
                }
            }
        }
        return new_map;
    }

    public static SubLObject upgrade_map_to_file_vector_backed_map(final SubLObject map, final SubLObject v_file_vector, SubLObject swapped_out_p) {
        if (swapped_out_p == UNPROVIDED) {
            swapped_out_p = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = map_utilities.new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list2);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list2);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != file_vector_reference_p(value)) {
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != file_vector_reference_deletedP(value))) {
                            Errors.error($str75$Cannot_upgrade_a_map_with_a_delet, key, value);
                        }
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != file_vector_reference_present_mutatedP(value))) {
                            Errors.error($str76$Cannot_upgrade_a_map_with_muted_f, key, value);
                        }
                    } else {
                        final SubLObject value_index = write_file_vector_backing_map_entry_value(value, v_file_vector, UNPROVIDED);
                        final SubLObject reference = (NIL != swapped_out_p) ? new_file_vector_reference(value_index) : new_file_vector_reference_wX_payload(value_index, value);
                        map_utilities.map_put(map, key, reference);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list2);
                }
            }
        }
        return map;
    }

    public static SubLObject file_vector_indexical_p(final SubLObject v_object) {
        return keywordp(v_object);
    }

    public static SubLObject register_indexical_file_vector_reference(final SubLObject indexical, final SubLObject v_file_vector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(indexical, FILE_VECTOR_INDEXICAL_P);
        SubLTrampolineFile.enforceType(v_file_vector, FILE_VECTOR_P);
        if (NIL == subl_promotions.memberP(indexical, dumper.kb_dump_default_common_symbols(), UNPROVIDED, UNPROVIDED)) {
            Errors.warn($str80$File_Vector_indexical__S_is_not_a, indexical);
        }
        final SubLObject current = map_utilities.map_get_without_values($file_vector_indexical_registry$.getGlobalValue(), indexical, UNPROVIDED);
        if (NIL != file_vector.file_vector_p(current)) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        file_vector.close_file_vector(current);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        }
        map_utilities.map_put($file_vector_indexical_registry$.getGlobalValue(), indexical, v_file_vector);
        map_utilities.map_put($file_vector_indexical_lock_registry$.getGlobalValue(), indexical, make_lock(cconcatenate($$$Lock_for_File_Vector_, format_nil.format_nil_s_no_copy(indexical))));
        return indexical;
    }

    public static SubLObject dereference_file_vector_indexical(final SubLObject indexical, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        assert NIL != file_vector_indexical_p(indexical) : "! file_vector_utilities.file_vector_indexical_p(indexical) " + ("file_vector_utilities.file_vector_indexical_p(indexical) " + "CommonSymbols.NIL != file_vector_utilities.file_vector_indexical_p(indexical) ") + indexical;
        return map_utilities.map_get_without_values($file_vector_indexical_registry$.getGlobalValue(), indexical, not_found);
    }

    public static SubLObject dereference_file_vector_indexical_lock(final SubLObject indexical, SubLObject not_found) {
        if (not_found == UNPROVIDED) {
            not_found = NIL;
        }
        assert NIL != file_vector_indexical_p(indexical) : "! file_vector_utilities.file_vector_indexical_p(indexical) " + ("file_vector_utilities.file_vector_indexical_p(indexical) " + "CommonSymbols.NIL != file_vector_utilities.file_vector_indexical_p(indexical) ") + indexical;
        return map_utilities.map_get_without_values($file_vector_indexical_lock_registry$.getGlobalValue(), indexical, not_found);
    }

    public static final SubLObject backed_map_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_backed_map(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject backed_map_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_backed_map(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject backed_map_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_vector_utilities.$backed_map_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject backed_map_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.file_vector_utilities.$backed_map_native.class ? T : NIL;
    }

    public static final SubLObject backed_map_map_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BACKED_MAP_P);
        return v_object.getField2();
    }

    public static SubLObject backed_map_map(final SubLObject v_object) {
        assert NIL != backed_map_p(v_object) : "! file_vector_utilities.backed_map_p(v_object) " + "file_vector_utilities.backed_map_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject backed_map_fvector_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BACKED_MAP_P);
        return v_object.getField3();
    }

    public static SubLObject backed_map_fvector(final SubLObject v_object) {
        assert NIL != backed_map_p(v_object) : "! file_vector_utilities.backed_map_p(v_object) " + "file_vector_utilities.backed_map_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject backed_map_common_symbols_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, BACKED_MAP_P);
        return v_object.getField4();
    }

    public static SubLObject backed_map_common_symbols(final SubLObject v_object) {
        assert NIL != backed_map_p(v_object) : "! file_vector_utilities.backed_map_p(v_object) " + "file_vector_utilities.backed_map_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_backed_map_map_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BACKED_MAP_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_backed_map_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != backed_map_p(v_object) : "! file_vector_utilities.backed_map_p(v_object) " + "file_vector_utilities.backed_map_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_backed_map_fvector_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BACKED_MAP_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_backed_map_fvector(final SubLObject v_object, final SubLObject value) {
        assert NIL != backed_map_p(v_object) : "! file_vector_utilities.backed_map_p(v_object) " + "file_vector_utilities.backed_map_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_backed_map_common_symbols_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, BACKED_MAP_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_backed_map_common_symbols(final SubLObject v_object, final SubLObject value) {
        assert NIL != backed_map_p(v_object) : "! file_vector_utilities.backed_map_p(v_object) " + "file_vector_utilities.backed_map_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_backed_map_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.file_vector_utilities.$backed_map_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($MAP)) {
                        _csetf_backed_map_map(v_new, current_value);
                    } else {
                        if (pcase_var.eql($FVECTOR)) {
                            _csetf_backed_map_fvector(v_new, current_value);
                        } else {
                            if (pcase_var.eql($COMMON_SYMBOLS)) {
                                _csetf_backed_map_common_symbols(v_new, current_value);
                            } else {
                                Errors.error($str_alt18$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_backed_map(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.file_vector_utilities.$backed_map_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($MAP)) {
                _csetf_backed_map_map(v_new, current_value);
            } else
                if (pcase_var.eql($FVECTOR)) {
                    _csetf_backed_map_fvector(v_new, current_value);
                } else
                    if (pcase_var.eql($COMMON_SYMBOLS)) {
                        _csetf_backed_map_common_symbols(v_new, current_value);
                    } else {
                        Errors.error($str19$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_backed_map(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_BACKED_MAP, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $MAP, backed_map_map(obj));
        funcall(visitor_fn, obj, $SLOT, $FVECTOR, backed_map_fvector(obj));
        funcall(visitor_fn, obj, $SLOT, $COMMON_SYMBOLS, backed_map_common_symbols(obj));
        funcall(visitor_fn, obj, $END, MAKE_BACKED_MAP, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_backed_map_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_backed_map(obj, visitor_fn);
    }

    /**
     * Establish a new MAP-P that combines the interior map and the file
     * vector that resolves the file references in the map.
     */
    @LispMethod(comment = "Establish a new MAP-P that combines the interior map and the file\r\nvector that resolves the file references in the map.\nEstablish a new MAP-P that combines the interior map and the file\nvector that resolves the file references in the map.")
    public static final SubLObject new_backed_map_alt(SubLObject map, SubLObject fvector, SubLObject common_symbols) {
        if (common_symbols == UNPROVIDED) {
            common_symbols = NIL;
        }
        SubLTrampolineFile.checkType(map, MAP_P);
        if (NIL != fvector) {
            SubLTrampolineFile.checkType(fvector, FILE_VECTOR_P);
        }
        {
            SubLObject b_map = make_backed_map(UNPROVIDED);
            _csetf_backed_map_map(b_map, map);
            _csetf_backed_map_fvector(b_map, fvector);
            _csetf_backed_map_common_symbols(b_map, common_symbols);
            return b_map;
        }
    }

    /**
     * Establish a new MAP-P that combines the interior map and the file
     * vector that resolves the file references in the map.
     */
    @LispMethod(comment = "Establish a new MAP-P that combines the interior map and the file\r\nvector that resolves the file references in the map.\nEstablish a new MAP-P that combines the interior map and the file\nvector that resolves the file references in the map.")
    public static SubLObject new_backed_map(final SubLObject map, final SubLObject fvector, SubLObject common_symbols) {
        if (common_symbols == UNPROVIDED) {
            common_symbols = NIL;
        }
        assert NIL != map_utilities.map_p(map) : "! map_utilities.map_p(map) " + ("map_utilities.map_p(map) " + "CommonSymbols.NIL != map_utilities.map_p(map) ") + map;
        if ((((NIL != fvector) && (NIL == file_vector_indexical_p(fvector))) && (!assertionsDisabledSynth)) && (NIL == file_vector.file_vector_p(fvector))) {
            throw new AssertionError(fvector);
        }
        final SubLObject b_map = make_backed_map(UNPROVIDED);
        _csetf_backed_map_map(b_map, map);
        _csetf_backed_map_fvector(b_map, fvector);
        _csetf_backed_map_common_symbols(b_map, common_symbols);
        return b_map;
    }

    /**
     * KB load Helper to construct the map directly from the data files.
     */
    @LispMethod(comment = "KB load Helper to construct the map directly from the data files.")
    public static final SubLObject new_backed_map_from_files_alt(SubLObject map, SubLObject data_file, SubLObject index_file, SubLObject common_symbols) {
        if (common_symbols == UNPROVIDED) {
            common_symbols = NIL;
        }
        {
            SubLObject fvector = file_vector.new_file_vector(data_file, index_file, UNPROVIDED);
            return new_backed_map(map, fvector, common_symbols);
        }
    }

    /**
     * KB load Helper to construct the map directly from the data files.
     */
    @LispMethod(comment = "KB load Helper to construct the map directly from the data files.")
    public static SubLObject new_backed_map_from_files(final SubLObject map, final SubLObject data_file, final SubLObject index_file, SubLObject common_symbols) {
        if (common_symbols == UNPROVIDED) {
            common_symbols = NIL;
        }
        final SubLObject fvector = file_vector.new_file_vector(data_file, index_file, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return new_backed_map(map, fvector, common_symbols);
    }

    /**
     * Binds the CFASL common symbols to the one defined for the map.
     */
    @LispMethod(comment = "Binds the CFASL common symbols to the one defined for the map.")
    public static final SubLObject with_backed_map_common_symbols_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt85);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject backed_map = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt85);
                    backed_map = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject common_symbols = $sym86$COMMON_SYMBOLS;
                            return list(CLET, list(list(common_symbols, list(BACKED_MAP_COMMON_SYMBOLS, backed_map))), listS(WITH_CFASL_COMMON_SYMBOLS_SIMPLE, common_symbols, append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt85);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Binds the CFASL common symbols to the one defined for the map.
     */
    @LispMethod(comment = "Binds the CFASL common symbols to the one defined for the map.")
    public static SubLObject with_backed_map_common_symbols(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list105);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject backed_map = NIL;
        destructuring_bind_must_consp(current, datum, $list105);
        backed_map = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject common_symbols = $sym106$COMMON_SYMBOLS;
            return list(CLET, list(list(common_symbols, list(BACKED_MAP_COMMON_SYMBOLS, backed_map))), listS(WITH_CFASL_COMMON_SYMBOLS_SIMPLE, common_symbols, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list105);
        return NIL;
    }

    public static final SubLObject print_backed_map_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_4 = v_object;
                    SubLObject stream_5 = stream;
                    write_string($str_alt88$__, stream_5, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_4), new SubLObject[]{ $STREAM, stream_5 });
                    write_char(CHAR_space, stream_5);
                    write_string($str_alt90$_Map_, stream, UNPROVIDED, UNPROVIDED);
                    princ(backed_map_map(v_object), stream);
                    write_string($str_alt91$_FVector_, stream, UNPROVIDED, UNPROVIDED);
                    princ(backed_map_fvector(v_object), stream);
                    write_string($str_alt92$_CFASL_ComSym_, stream, UNPROVIDED, UNPROVIDED);
                    princ(length(backed_map_common_symbols(v_object)), stream);
                    write_string($str_alt93$_, stream, UNPROVIDED, UNPROVIDED);
                    write_char(CHAR_space, stream_5);
                    write(pointer(v_object_4), new SubLObject[]{ $STREAM, stream_5, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_5);
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_backed_map(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            write_string($$$_Map_, stream, UNPROVIDED, UNPROVIDED);
            princ(backed_map_map(v_object), stream);
            write_string($$$_FVector_, stream, UNPROVIDED, UNPROVIDED);
            princ(backed_map_fvector(v_object), stream);
            write_string($$$_CFASL_ComSym_, stream, UNPROVIDED, UNPROVIDED);
            princ(length(backed_map_common_symbols(v_object)), stream);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    /**
     * A constructor for maps that are to receive their backing in the future; used by
     * the dumper.
     */
    @LispMethod(comment = "A constructor for maps that are to receive their backing in the future; used by\r\nthe dumper.\nA constructor for maps that are to receive their backing in the future; used by\nthe dumper.")
    public static final SubLObject new_future_backed_map_alt(SubLObject map) {
        return new_backed_map(map, NIL, NIL);
    }

    /**
     * A constructor for maps that are to receive their backing in the future; used by
     * the dumper.
     */
    @LispMethod(comment = "A constructor for maps that are to receive their backing in the future; used by\r\nthe dumper.\nA constructor for maps that are to receive their backing in the future; used by\nthe dumper.")
    public static SubLObject new_future_backed_map(final SubLObject map) {
        return new_backed_map(map, NIL, NIL);
    }

    public static SubLObject new_indexical_backed_map(final SubLObject map, final SubLObject indexical) {
        SubLTrampolineFile.enforceType(indexical, FILE_VECTOR_INDEXICAL_P);
        return new_backed_map(map, indexical, NIL);
    }

    /**
     * Reconnect a backed map once it is loaded into an image.
     */
    @LispMethod(comment = "Reconnect a backed map once it is loaded into an image.")
    public static final SubLObject reconnect_backed_map_alt(SubLObject backed_map, SubLObject fvector, SubLObject common_symbols) {
        if (common_symbols == UNPROVIDED) {
            common_symbols = NIL;
        }
        _csetf_backed_map_fvector(backed_map, fvector);
        _csetf_backed_map_common_symbols(backed_map, common_symbols);
        return backed_map;
    }

    /**
     * Reconnect a backed map once it is loaded into an image.
     */
    @LispMethod(comment = "Reconnect a backed map once it is loaded into an image.")
    public static SubLObject reconnect_backed_map(final SubLObject backed_map, final SubLObject fvector, SubLObject common_symbols) {
        if (common_symbols == UNPROVIDED) {
            common_symbols = NIL;
        }
        _csetf_backed_map_fvector(backed_map, fvector);
        _csetf_backed_map_common_symbols(backed_map, common_symbols);
        return backed_map;
    }

    public static final SubLObject reconnect_backed_map_based_on_backed_map_alt(SubLObject backed_map, SubLObject model_backed_map) {
        {
            SubLObject fvector = backed_map_fvector(model_backed_map);
            SubLObject common_symbols = backed_map_common_symbols(model_backed_map);
            reconnect_backed_map(backed_map, fvector, common_symbols);
            return backed_map;
        }
    }

    public static SubLObject reconnect_backed_map_based_on_backed_map(final SubLObject backed_map, final SubLObject model_backed_map) {
        final SubLObject fvector = backed_map_fvector(model_backed_map);
        final SubLObject common_symbols = backed_map_common_symbols(model_backed_map);
        reconnect_backed_map(backed_map, fvector, common_symbols);
        return backed_map;
    }

    public static SubLObject get_backed_map_file_vector(final SubLObject backed_map) {
        final SubLObject fvector_ref = backed_map_fvector(backed_map);
        if (NIL != file_vector_indexical_p(fvector_ref)) {
            return dereference_file_vector_indexical(fvector_ref, UNPROVIDED);
        }
        if (NIL != file_vector.file_vector_p(fvector_ref)) {
            return fvector_ref;
        }
        Errors.error($str112$Unexpected_file_vector_reference_, fvector_ref, backed_map);
        return NIL;
    }

    public static SubLObject get_backed_map_file_vector_lock(final SubLObject backed_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fvector_ref = backed_map_fvector(backed_map);
        if (NIL != file_vector_indexical_p(fvector_ref)) {
            return dereference_file_vector_indexical_lock(fvector_ref, UNPROVIDED);
        }
        if (NIL != file_vector.file_vector_p(fvector_ref)) {
            return $file_vector_backed_map_read_lock$.getDynamicValue(thread);
        }
        Errors.error($str112$Unexpected_file_vector_reference_, fvector_ref, backed_map);
        return NIL;
    }

    public static final SubLObject cfasl_input_backed_map_alt(SubLObject stream) {
        {
            SubLObject interior_map = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            return new_backed_map(interior_map, NIL, NIL);
        }
    }

    public static SubLObject cfasl_input_backed_map(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject symbols = cfasl_current_common_symbols();
        SubLObject interior_map = NIL;
        SubLObject fvector = NIL;
        final SubLObject v_object = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (NIL != map_utilities.map_p(v_object)) {
            interior_map = v_object;
            fvector = $cfasl_outer_fvector_for_backed_maps$.getDynamicValue(thread);
        } else
            if (NIL != file_vector_indexical_p(v_object)) {
                interior_map = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                fvector = v_object;
            } else {
                Errors.error($str115$Unexpected_value__A_in_BACKED_MAP, v_object);
            }

        return new_backed_map(interior_map, fvector, symbols);
    }

    public static final SubLObject cfasl_output_backed_map_alt(SubLObject v_object, SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_backed_map$.getGlobalValue(), stream);
        cfasl_output(backed_map_map(v_object), stream);
        return v_object;
    }

    public static SubLObject cfasl_output_backed_map(final SubLObject v_object, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_backed_map$.getGlobalValue(), stream);
        final SubLObject fvector_indicator = backed_map_fvector(v_object);
        if (NIL != file_vector_indexical_p(fvector_indicator)) {
            cfasl_output(fvector_indicator, stream);
        }
        cfasl_output(backed_map_map(v_object), stream);
        return v_object;
    }

    public static final SubLObject cfasl_output_object_backed_map_method_alt(SubLObject v_object, SubLObject stream) {
        return cfasl_output_backed_map(v_object, stream);
    }

    public static SubLObject cfasl_output_object_backed_map_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_backed_map(v_object, stream);
    }

    /**
     * Provide a cache strategy to the enclosed file vector operations.
     */
    @LispMethod(comment = "Provide a cache strategy to the enclosed file vector operations.")
    public static final SubLObject with_backed_map_cache_strategy_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt98);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject strategy = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt98);
                    strategy = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($current_backed_map_cache_strategy$, strategy)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt98);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Provide a cache strategy to the enclosed file vector operations.
     */
    @LispMethod(comment = "Provide a cache strategy to the enclosed file vector operations.")
    public static SubLObject with_backed_map_cache_strategy(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list117);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy = NIL;
        destructuring_bind_must_consp(current, datum, $list117);
        strategy = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($current_backed_map_cache_strategy$, strategy)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list117);
        return NIL;
    }

    /**
     * Accessor for the active file vector-backed map cache strategy.
     *
     * @return CACHE-STRATEGY-OR-SYMBOL-P
     */
    @LispMethod(comment = "Accessor for the active file vector-backed map cache strategy.\r\n\r\n@return CACHE-STRATEGY-OR-SYMBOL-P")
    public static final SubLObject backed_map_cache_strategy_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $current_backed_map_cache_strategy$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor for the active file vector-backed map cache strategy.
     *
     * @return CACHE-STRATEGY-OR-SYMBOL-P
     */
    @LispMethod(comment = "Accessor for the active file vector-backed map cache strategy.\r\n\r\n@return CACHE-STRATEGY-OR-SYMBOL-P")
    public static SubLObject backed_map_cache_strategy() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $current_backed_map_cache_strategy$.getDynamicValue(thread);
    }

    public static final SubLObject is_map_object_p_backed_map_method_alt(SubLObject v_object) {
        return T;
    }

    public static SubLObject is_map_object_p_backed_map_method(final SubLObject v_object) {
        return T;
    }

    public static final SubLObject map_object_size_backed_map_method_alt(SubLObject v_object) {
        return map_backed_map_size(v_object);
    }

    public static SubLObject map_object_size_backed_map_method(final SubLObject v_object) {
        return map_backed_map_size(v_object);
    }

    public static final SubLObject map_backed_map_size_alt(SubLObject backed_map) {
        {
            SubLObject interior_map = backed_map_map(backed_map);
            return map_utilities.map_size(interior_map);
        }
    }

    public static SubLObject map_backed_map_size(final SubLObject backed_map) {
        final SubLObject interior_map = backed_map_map(backed_map);
        return map_utilities.map_size(interior_map);
    }

    public static final SubLObject map_object_test_backed_map_method_alt(SubLObject v_object) {
        return map_backed_map_test(v_object);
    }

    public static SubLObject map_object_test_backed_map_method(final SubLObject v_object) {
        return map_backed_map_test(v_object);
    }

    public static final SubLObject map_backed_map_test_alt(SubLObject v_object) {
        {
            SubLObject interior_map = backed_map_map(v_object);
            return map_utilities.map_test(interior_map);
        }
    }

    public static SubLObject map_backed_map_test(final SubLObject v_object) {
        final SubLObject interior_map = backed_map_map(v_object);
        return map_utilities.map_test(interior_map);
    }

    public static final SubLObject map_object_put_backed_map_method_alt(SubLObject v_object, SubLObject key, SubLObject value) {
        return map_backed_map_put(v_object, key, value);
    }

    public static SubLObject map_object_put_backed_map_method(final SubLObject v_object, final SubLObject key, final SubLObject value) {
        return map_backed_map_put(v_object, key, value);
    }

    public static final SubLObject map_backed_map_put_alt(SubLObject v_object, SubLObject key, SubLObject value) {
        {
            SubLObject interior_map = backed_map_map(v_object);
            return file_vector_backed_map_wX_cache_put(interior_map, backed_map_cache_strategy(), key, value);
        }
    }

    public static SubLObject map_backed_map_put(final SubLObject v_object, final SubLObject key, final SubLObject value) {
        final SubLObject interior_map = backed_map_map(v_object);
        return file_vector_backed_map_wX_cache_put(interior_map, backed_map_cache_strategy(), key, value);
    }

    public static final SubLObject map_object_get_backed_map_method_alt(SubLObject v_object, SubLObject key, SubLObject not_found) {
        return map_backed_map_get(v_object, key, not_found);
    }

    public static SubLObject map_object_get_backed_map_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return map_backed_map_get(v_object, key, not_found);
    }

    public static final SubLObject map_backed_map_get_alt(SubLObject v_object, SubLObject key, SubLObject not_found) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interior_map = backed_map_map(v_object);
                SubLObject fvector = backed_map_fvector(v_object);
                SubLObject result = NIL;
                SubLObject found_p = NIL;
                SubLObject common_symbols = backed_map_common_symbols(v_object);
                {
                    SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(common_symbols);
                        result = file_vector_backed_map_wX_cache_get(interior_map, fvector, backed_map_cache_strategy(), key, not_found);
                        found_p = makeBoolean(result != not_found);
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != backed_map_p(result)) {
                    reconnect_backed_map_based_on_backed_map(result, v_object);
                }
                return values(result, found_p);
            }
        }
    }

    public static SubLObject map_backed_map_get(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interior_map = backed_map_map(v_object);
        final SubLObject fvector = get_backed_map_file_vector(v_object);
        final SubLObject fvector_lock = get_backed_map_file_vector_lock(v_object);
        SubLObject result = NIL;
        SubLObject found_p = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!fvector_lock.isLock())) {
            Errors.error($str124$Cannot_access_backed_map__A_witho, v_object);
        }
        final SubLObject _prev_bind_0 = $within_cfasl_externalization$.currentBinding(thread);
        try {
            $within_cfasl_externalization$.bind(NIL, thread);
            final SubLObject common_symbols = backed_map_common_symbols(v_object);
            final SubLObject _prev_bind_0_$4 = $cfasl_common_symbols$.currentBinding(thread);
            try {
                $cfasl_common_symbols$.bind(NIL, thread);
                cfasl_set_common_symbols_simple(common_symbols);
                final SubLObject _prev_bind_0_$5 = $cfasl_outer_fvector_for_backed_maps$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $file_vector_backed_map_read_lock$.currentBinding(thread);
                try {
                    $cfasl_outer_fvector_for_backed_maps$.bind(fvector, thread);
                    $file_vector_backed_map_read_lock$.bind(fvector_lock, thread);
                    result = file_vector_backed_map_wX_cache_get(interior_map, fvector, backed_map_cache_strategy(), key, not_found);
                    found_p = makeBoolean(!result.eql(not_found));
                } finally {
                    $file_vector_backed_map_read_lock$.rebind(_prev_bind_2, thread);
                    $cfasl_outer_fvector_for_backed_maps$.rebind(_prev_bind_0_$5, thread);
                }
            } finally {
                $cfasl_common_symbols$.rebind(_prev_bind_0_$4, thread);
            }
        } finally {
            $within_cfasl_externalization$.rebind(_prev_bind_0, thread);
        }
        return values(result, found_p);
    }

    public static final SubLObject map_object_get_without_values_backed_map_method_alt(SubLObject v_object, SubLObject key, SubLObject not_found) {
        return map_backed_map_get_without_values(v_object, key, not_found);
    }

    public static SubLObject map_object_get_without_values_backed_map_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return map_backed_map_get_without_values(v_object, key, not_found);
    }

    public static final SubLObject map_backed_map_get_without_values_alt(SubLObject v_object, SubLObject key, SubLObject not_found) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interior_map = backed_map_map(v_object);
                SubLObject fvector = backed_map_fvector(v_object);
                SubLObject result = NIL;
                SubLObject common_symbols = backed_map_common_symbols(v_object);
                {
                    SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(common_symbols);
                        result = file_vector_backed_map_wX_cache_get(interior_map, fvector, backed_map_cache_strategy(), key, not_found);
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != backed_map_p(result)) {
                    reconnect_backed_map_based_on_backed_map(result, v_object);
                }
                return result;
            }
        }
    }

    public static SubLObject map_backed_map_get_without_values(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interior_map = backed_map_map(v_object);
        final SubLObject fvector = get_backed_map_file_vector(v_object);
        final SubLObject fvector_lock = get_backed_map_file_vector_lock(v_object);
        SubLObject result = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!fvector_lock.isLock())) {
            Errors.error($str124$Cannot_access_backed_map__A_witho, v_object);
        }
        final SubLObject _prev_bind_0 = $within_cfasl_externalization$.currentBinding(thread);
        try {
            $within_cfasl_externalization$.bind(NIL, thread);
            final SubLObject common_symbols = backed_map_common_symbols(v_object);
            final SubLObject _prev_bind_0_$6 = $cfasl_common_symbols$.currentBinding(thread);
            try {
                $cfasl_common_symbols$.bind(NIL, thread);
                cfasl_set_common_symbols_simple(common_symbols);
                final SubLObject _prev_bind_0_$7 = $cfasl_outer_fvector_for_backed_maps$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $file_vector_backed_map_read_lock$.currentBinding(thread);
                try {
                    $cfasl_outer_fvector_for_backed_maps$.bind(fvector, thread);
                    $file_vector_backed_map_read_lock$.bind(fvector_lock, thread);
                    result = file_vector_backed_map_wX_cache_get(interior_map, fvector, backed_map_cache_strategy(), key, not_found);
                } finally {
                    $file_vector_backed_map_read_lock$.rebind(_prev_bind_2, thread);
                    $cfasl_outer_fvector_for_backed_maps$.rebind(_prev_bind_0_$7, thread);
                }
            } finally {
                $cfasl_common_symbols$.rebind(_prev_bind_0_$6, thread);
            }
        } finally {
            $within_cfasl_externalization$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject map_object_remove_backed_map_method_alt(SubLObject v_object, SubLObject key) {
        return map_backed_map_remove(v_object, key);
    }

    public static SubLObject map_object_remove_backed_map_method(final SubLObject v_object, final SubLObject key) {
        return map_backed_map_remove(v_object, key);
    }

    public static final SubLObject map_backed_map_remove_alt(SubLObject v_object, SubLObject key) {
        {
            SubLObject interior_map = backed_map_map(v_object);
            return file_vector_backed_map_wX_cache_remove(interior_map, backed_map_cache_strategy(), key, NIL);
        }
    }

    public static SubLObject map_backed_map_remove(final SubLObject v_object, final SubLObject key) {
        final SubLObject interior_map = backed_map_map(v_object);
        return file_vector_backed_map_wX_cache_remove(interior_map, backed_map_cache_strategy(), key, NIL);
    }

    public static final SubLObject map_object_remove_all_backed_map_method_alt(SubLObject v_object) {
        return map_backed_map_remove_all(v_object);
    }

    public static SubLObject map_object_remove_all_backed_map_method(final SubLObject v_object) {
        return map_backed_map_remove_all(v_object);
    }

    /**
     *
     *
     * @unknown this is one interpretation of remove all, but file vector backed
    maps would allow for another one, namely one that marks all objects
    as deleted, but supports the undo
     */
    @LispMethod(comment = "@unknown this is one interpretation of remove all, but file vector backed\r\nmaps would allow for another one, namely one that marks all objects\r\nas deleted, but supports the undo")
    public static final SubLObject map_backed_map_remove_all_alt(SubLObject v_object) {
        {
            SubLObject interior_map = backed_map_map(v_object);
            map_utilities.map_remove_all(interior_map);
            return v_object;
        }
    }

    /**
     *
     *
     * @unknown this is one interpretation of remove all, but file vector backed
    maps would allow for another one, namely one that marks all objects
    as deleted, but supports the undo
     */
    @LispMethod(comment = "@unknown this is one interpretation of remove all, but file vector backed\r\nmaps would allow for another one, namely one that marks all objects\r\nas deleted, but supports the undo")
    public static SubLObject map_backed_map_remove_all(final SubLObject v_object) {
        final SubLObject interior_map = backed_map_map(v_object);
        map_utilities.map_remove_all(interior_map);
        return v_object;
    }

    public static final SubLObject map_object_touch_backed_map_method_alt(SubLObject v_object, SubLObject key) {
        return map_backed_map_touch(v_object, key);
    }

    public static SubLObject map_object_touch_backed_map_method(final SubLObject v_object, final SubLObject key) {
        return map_backed_map_touch(v_object, key);
    }

    public static final SubLObject map_backed_map_touch_alt(SubLObject v_object, SubLObject key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interior_map = backed_map_map(v_object);
                SubLObject fvector = backed_map_fvector(v_object);
                SubLObject result = NIL;
                SubLObject common_symbols = backed_map_common_symbols(v_object);
                {
                    SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(common_symbols);
                        result = file_vector_backed_map_wX_cache_touch(interior_map, backed_map_cache_strategy(), key, fvector);
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject map_backed_map_touch(final SubLObject v_object, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interior_map = backed_map_map(v_object);
        final SubLObject fvector = get_backed_map_file_vector(v_object);
        SubLObject result = NIL;
        final SubLObject common_symbols = backed_map_common_symbols(v_object);
        final SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols_simple(common_symbols);
            result = file_vector_backed_map_wX_cache_touch(interior_map, backed_map_cache_strategy(), key, fvector);
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject map_object_change_set_backed_map_method(final SubLObject v_object, SubLObject unchanged) {
        if (unchanged == UNPROVIDED) {
            unchanged = NIL;
        }
        return map_backed_map_change_set(v_object, unchanged);
    }

    public static SubLObject map_backed_map_change_set(final SubLObject map, final SubLObject unchanged) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interior_map = backed_map_map(map);
        SubLObject changed_keys = NIL;
        SubLObject delete_hints = NIL;
        SubLObject edit_hints = NIL;
        final SubLObject iterator = map_utilities.new_map_iterator(interior_map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list2);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list2);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject changedP = NIL;
                    if (NIL != file_vector_reference_p(value)) {
                        if (NIL != file_vector_reference_present_mutatedP(value)) {
                            edit_hints = cons(recover_mutated_file_vector_reference(value), edit_hints);
                            changedP = T;
                        } else
                            if (NIL != file_vector_reference_deletedP(value)) {
                                delete_hints = cons(recover_mutated_file_vector_reference(value), delete_hints);
                                changedP = T;
                            } else {
                                changedP = NIL;
                            }

                    } else {
                        changedP = T;
                    }
                    if (NIL != changedP) {
                        changed_keys = cons(key, changed_keys);
                    } else
                        if (NIL != map_utilities.map_p(unchanged)) {
                            map_utilities.map_put(unchanged, key, value);
                        }

                } else {
                    cdestructuring_bind_error(datum, $list2);
                }
            }
        }
        return values(changed_keys, delete_hints, edit_hints);
    }

    public static final SubLObject new_map_object_with_same_properties_backed_map_method_alt(SubLObject v_object, SubLObject test, SubLObject size) {
        return new_map_backed_map_with_same_properties(v_object, test, size);
    }

    public static SubLObject new_map_object_with_same_properties_backed_map_method(final SubLObject v_object, final SubLObject test, final SubLObject size) {
        return new_map_backed_map_with_same_properties(v_object, test, size);
    }

    /**
     *
     *
     * @unknown this might not work correctly for a copied version, since the
    exterior copying code is not able to do the lookup to the underlying
    file reference objects
     */
    @LispMethod(comment = "@unknown this might not work correctly for a copied version, since the\r\nexterior copying code is not able to do the lookup to the underlying\r\nfile reference objects")
    public static final SubLObject new_map_backed_map_with_same_properties_alt(SubLObject v_object, SubLObject test, SubLObject size) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interior_map = backed_map_map(v_object);
                SubLObject fvector = backed_map_fvector(v_object);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (test != map_utilities.map_test(interior_map)) {
                        Errors.error($str_alt110$The_test_of_the_interior_map__A_d, map_utilities.map_test(interior_map), test);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!size.numE(map_utilities.map_size(interior_map))) {
                        Errors.error($str_alt111$The_size_of_the_interior_map__A_d, map_utilities.map_size(interior_map), size);
                    }
                }
                {
                    SubLObject new_map = map_utilities.new_map_with_same_properties(interior_map);
                    SubLObject new_fvector = file_vector.clone_file_vector(fvector);
                    return new_backed_map(new_map, new_fvector, UNPROVIDED);
                }
            }
        }
    }

    /**
     *
     *
     * @unknown this might not work correctly for a copied version, since the
    exterior copying code is not able to do the lookup to the underlying
    file reference objects
     */
    @LispMethod(comment = "@unknown this might not work correctly for a copied version, since the\r\nexterior copying code is not able to do the lookup to the underlying\r\nfile reference objects")
    public static SubLObject new_map_backed_map_with_same_properties(final SubLObject v_object, final SubLObject test, final SubLObject size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interior_map = backed_map_map(v_object);
        final SubLObject fvector = backed_map_fvector(v_object);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!test.eql(map_utilities.map_test(interior_map)))) {
            Errors.error($str131$The_test_of_the_interior_map__A_d, map_utilities.map_test(interior_map), test);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!size.numE(map_utilities.map_size(interior_map)))) {
            Errors.error($str132$The_size_of_the_interior_map__A_d, map_utilities.map_size(interior_map), size);
        }
        final SubLObject new_map = map_utilities.new_map_with_same_properties(interior_map);
        final SubLObject new_fvector = (NIL != file_vector_indexical_p(fvector)) ? fvector : file_vector.clone_file_vector(fvector);
        return new_backed_map(new_map, new_fvector, UNPROVIDED);
    }

    public static final SubLObject new_map_object_iterator_backed_map_method_alt(SubLObject v_object) {
        return new_map_backed_map_iterator(v_object);
    }

    public static SubLObject new_map_object_iterator_backed_map_method(final SubLObject v_object) {
        return new_map_backed_map_iterator(v_object);
    }

    public static final SubLObject new_map_backed_map_iterator_alt(SubLObject v_object) {
        return iteration.new_iterator(new_map_backed_map_iterator_state(v_object), MAP_BACKED_MAP_ITERATOR_DONE, MAP_BACKED_MAP_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject new_map_backed_map_iterator(final SubLObject v_object) {
        return iteration.new_iterator(new_map_backed_map_iterator_state(v_object), MAP_BACKED_MAP_ITERATOR_DONE, MAP_BACKED_MAP_ITERATOR_NEXT, UNPROVIDED);
    }

    public static final SubLObject new_map_backed_map_iterator_state_alt(SubLObject backed_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interior_map = backed_map_map(backed_map);
                SubLObject fvector = backed_map_fvector(backed_map);
                SubLObject cache_strategy = backed_map_cache_strategy();
                SubLObject iterator = NIL;
                SubLObject common_symbols = backed_map_common_symbols(backed_map);
                {
                    SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(common_symbols);
                        iterator = new_file_vector_backed_map_iterator(interior_map, fvector, NIL, cache_strategy);
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                    }
                }
                return list(backed_map, iterator, cache_strategy);
            }
        }
    }

    public static SubLObject new_map_backed_map_iterator_state(final SubLObject backed_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interior_map = backed_map_map(backed_map);
        final SubLObject fvector = get_backed_map_file_vector(backed_map);
        final SubLObject cache_strategy = backed_map_cache_strategy();
        SubLObject iterator = NIL;
        final SubLObject common_symbols = backed_map_common_symbols(backed_map);
        final SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols_simple(common_symbols);
            iterator = new_file_vector_backed_map_iterator(interior_map, fvector, NIL, cache_strategy);
        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return list(backed_map, iterator, cache_strategy);
    }

    public static final SubLObject map_backed_map_iterator_done_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject backed_map = NIL;
            SubLObject iterator = NIL;
            SubLObject cache_strategy = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt115);
            backed_map = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt115);
            iterator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt115);
            cache_strategy = current.first();
            current = current.rest();
            if (NIL == current) {
                return iteration.iteration_done(iterator);
            } else {
                cdestructuring_bind_error(datum, $list_alt115);
            }
        }
        return NIL;
    }

    public static SubLObject map_backed_map_iterator_done(final SubLObject state) {
        SubLObject backed_map = NIL;
        SubLObject iterator = NIL;
        SubLObject cache_strategy = NIL;
        destructuring_bind_must_consp(state, state, $list136);
        backed_map = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list136);
        iterator = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list136);
        cache_strategy = current.first();
        current = current.rest();
        if (NIL == current) {
            return iteration.iteration_done(iterator);
        }
        cdestructuring_bind_error(state, $list136);
        return NIL;
    }

    public static final SubLObject map_backed_map_iterator_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject entry = NIL;
                SubLObject validP = NIL;
                SubLObject datum = state;
                SubLObject current = datum;
                SubLObject backed_map = NIL;
                SubLObject iterator = NIL;
                SubLObject cache_strategy = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt115);
                backed_map = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt115);
                iterator = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt115);
                cache_strategy = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject _prev_bind_0 = $current_backed_map_cache_strategy$.currentBinding(thread);
                        try {
                            $current_backed_map_cache_strategy$.bind(cache_strategy, thread);
                            thread.resetMultipleValues();
                            {
                                SubLObject entry_6 = iteration.iteration_next(iterator);
                                SubLObject validP_7 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                entry = entry_6;
                                validP = validP_7;
                            }
                            if (NIL != validP) {
                                {
                                    SubLObject datum_8 = entry;
                                    SubLObject current_9 = datum_8;
                                    SubLObject key = NIL;
                                    SubLObject value = NIL;
                                    destructuring_bind_must_consp(current_9, datum_8, $list_alt2);
                                    key = current_9.first();
                                    current_9 = current_9.rest();
                                    destructuring_bind_must_consp(current_9, datum_8, $list_alt2);
                                    value = current_9.first();
                                    current_9 = current_9.rest();
                                    if (NIL == current_9) {
                                        if (NIL != backed_map_p(value)) {
                                            {
                                                SubLObject common_symbols = backed_map_common_symbols(backed_map);
                                                {
                                                    SubLObject _prev_bind_0_10 = $cfasl_common_symbols$.currentBinding(thread);
                                                    try {
                                                        $cfasl_common_symbols$.bind(NIL, thread);
                                                        cfasl_set_common_symbols_simple(common_symbols);
                                                        {
                                                            SubLObject v_file_vector = backed_map_fvector(backed_map);
                                                            reconnect_backed_map(value, v_file_vector, cfasl_current_common_symbols());
                                                        }
                                                    } finally {
                                                        $cfasl_common_symbols$.rebind(_prev_bind_0_10, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum_8, $list_alt2);
                                    }
                                }
                            }
                        } finally {
                            $current_backed_map_cache_strategy$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return values(entry, state, makeBoolean(NIL == validP));
                } else {
                    cdestructuring_bind_error(datum, $list_alt115);
                }
            }
            return NIL;
        }
    }

    public static SubLObject map_backed_map_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject entry = NIL;
        SubLObject validP = NIL;
        SubLObject backed_map = NIL;
        SubLObject iterator = NIL;
        SubLObject cache_strategy = NIL;
        destructuring_bind_must_consp(state, state, $list136);
        backed_map = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list136);
        iterator = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list136);
        cache_strategy = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject _prev_bind_0 = $within_cfasl_externalization$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $current_backed_map_cache_strategy$.currentBinding(thread);
            try {
                $within_cfasl_externalization$.bind(NIL, thread);
                $current_backed_map_cache_strategy$.bind(cache_strategy, thread);
                final SubLObject common_symbols = backed_map_common_symbols(backed_map);
                final SubLObject _prev_bind_0_$8 = $cfasl_common_symbols$.currentBinding(thread);
                try {
                    $cfasl_common_symbols$.bind(NIL, thread);
                    cfasl_set_common_symbols_simple(common_symbols);
                    final SubLObject _prev_bind_0_$9 = $cfasl_outer_fvector_for_backed_maps$.currentBinding(thread);
                    try {
                        $cfasl_outer_fvector_for_backed_maps$.bind(get_backed_map_file_vector(backed_map), thread);
                        final SubLObject fvector_lock = get_backed_map_file_vector_lock(backed_map);
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!fvector_lock.isLock())) {
                            Errors.error($str124$Cannot_access_backed_map__A_witho, backed_map);
                        }
                        final SubLObject _prev_bind_0_$10 = $file_vector_backed_map_read_lock$.currentBinding(thread);
                        try {
                            $file_vector_backed_map_read_lock$.bind(fvector_lock, thread);
                            thread.resetMultipleValues();
                            final SubLObject entry_$11 = iteration.iteration_next(iterator);
                            final SubLObject validP_$12 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            entry = entry_$11;
                            validP = validP_$12;
                        } finally {
                            $file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$10, thread);
                        }
                    } finally {
                        $cfasl_outer_fvector_for_backed_maps$.rebind(_prev_bind_0_$9, thread);
                    }
                } finally {
                    $cfasl_common_symbols$.rebind(_prev_bind_0_$8, thread);
                }
            } finally {
                $current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                $within_cfasl_externalization$.rebind(_prev_bind_0, thread);
            }
            return subl_promotions.values3(entry, state, makeBoolean(NIL == validP));
        }
        cdestructuring_bind_error(state, $list136);
        return NIL;
    }

    public static final SubLObject map_object_arbitrary_key_backed_map_method_alt(SubLObject v_object) {
        return map_backed_map_arbitrary_key(v_object);
    }

    public static SubLObject map_object_arbitrary_key_backed_map_method(final SubLObject v_object) {
        return map_backed_map_arbitrary_key(v_object);
    }

    public static final SubLObject map_backed_map_arbitrary_key_alt(SubLObject v_object) {
        {
            SubLObject interior_map = backed_map_map(v_object);
            return map_utilities.map_arbitrary_key(interior_map, UNPROVIDED);
        }
    }

    public static SubLObject map_backed_map_arbitrary_key(final SubLObject v_object) {
        final SubLObject interior_map = backed_map_map(v_object);
        return map_utilities.map_arbitrary_key(interior_map, UNPROVIDED);
    }

    /**
     * Walk the backed map provided, swapping out all the pristine objects
     * of the underlying file-vector backed map.
     */
    @LispMethod(comment = "Walk the backed map provided, swapping out all the pristine objects\r\nof the underlying file-vector backed map.\nWalk the backed map provided, swapping out all the pristine objects\nof the underlying file-vector backed map.")
    public static final SubLObject swap_out_all_pristine_backed_map_objects_alt(SubLObject backed_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject maps_to_do = queues.create_queue();
                SubLObject swapped_out = ZERO_INTEGER;
                queues.enqueue(backed_map, maps_to_do);
                while (NIL == queues.queue_empty_p(maps_to_do)) {
                    {
                        SubLObject curr_map = queues.dequeue(maps_to_do);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == backed_map_p(curr_map)) {
                                Errors.error($str_alt117$Error_in_swap_out_algorithm___A_i, curr_map);
                            }
                        }
                        {
                            SubLObject internal_map = backed_map_map(curr_map);
                            thread.resetMultipleValues();
                            {
                                SubLObject the_curr_map = swap_out_all_pristine_file_vector_backed_map_objects(internal_map);
                                SubLObject curr_swapped_out = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                swapped_out = add(swapped_out, curr_swapped_out);
                            }
                            {
                                SubLObject iterator = map_utilities.new_map_iterator(internal_map);
                                SubLObject done_var = NIL;
                                while (NIL == done_var) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject var = iteration.iteration_next(iterator);
                                        SubLObject valid = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != valid) {
                                            {
                                                SubLObject datum = var;
                                                SubLObject current = datum;
                                                SubLObject key = NIL;
                                                SubLObject value = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt2);
                                                key = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt2);
                                                value = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    if (NIL != backed_map_p(value)) {
                                                        queues.enqueue(value, maps_to_do);
                                                    } else {
                                                        if ((NIL != file_vector_reference_p(value)) && (NIL != file_vector_reference_present_mutatedP(value))) {
                                                            {
                                                                SubLObject payload = file_vector_reference_referenced_object(value);
                                                                if (NIL != backed_map_p(payload)) {
                                                                    queues.enqueue(payload, maps_to_do);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt2);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    }
                                } 
                            }
                        }
                    }
                } 
                return values(backed_map, swapped_out);
            }
        }
    }

    /**
     * Walk the backed map provided, swapping out all the pristine objects
     * of the underlying file-vector backed map.
     */
    @LispMethod(comment = "Walk the backed map provided, swapping out all the pristine objects\r\nof the underlying file-vector backed map.\nWalk the backed map provided, swapping out all the pristine objects\nof the underlying file-vector backed map.")
    public static SubLObject swap_out_all_pristine_backed_map_objects(final SubLObject backed_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject maps_to_do = queues.create_queue(UNPROVIDED);
        SubLObject swapped_out = ZERO_INTEGER;
        queues.enqueue(backed_map, maps_to_do);
        while (NIL == queues.queue_empty_p(maps_to_do)) {
            final SubLObject curr_map = queues.dequeue(maps_to_do);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == backed_map_p(curr_map))) {
                Errors.error($str138$Error_in_swap_out_algorithm___A_i, curr_map);
            }
            final SubLObject internal_map = backed_map_map(curr_map);
            thread.resetMultipleValues();
            final SubLObject the_curr_map = swap_out_all_pristine_file_vector_backed_map_objects(internal_map);
            final SubLObject curr_swapped_out = thread.secondMultipleValue();
            thread.resetMultipleValues();
            swapped_out = add(swapped_out, curr_swapped_out);
            final SubLObject iterator = map_utilities.new_map_iterator(internal_map);
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list2);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list2);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != backed_map_p(value)) {
                            queues.enqueue(value, maps_to_do);
                        } else
                            if ((NIL != file_vector_reference_p(value)) && (NIL != file_vector_reference_present_mutatedP(value))) {
                                final SubLObject payload = file_vector_reference_referenced_object(value);
                                if (NIL != backed_map_p(payload)) {
                                    queues.enqueue(payload, maps_to_do);
                                }
                            }

                    } else {
                        cdestructuring_bind_error(datum, $list2);
                    }
                }
            }
        } 
        return values(backed_map, swapped_out);
    }

    /**
     * Walk the backed map, counting all non pristine objects.
     * This includes mutated backed maps. The method does NOT swap any
     * objects in--since these would all be pristine by definition.
     * The count does not include any actual maps, even mutated ones;
     * these are returned as a separate value.
     */
    @LispMethod(comment = "Walk the backed map, counting all non pristine objects.\r\nThis includes mutated backed maps. The method does NOT swap any\r\nobjects in--since these would all be pristine by definition.\r\nThe count does not include any actual maps, even mutated ones;\r\nthese are returned as a separate value.\nWalk the backed map, counting all non pristine objects.\nThis includes mutated backed maps. The method does NOT swap any\nobjects in--since these would all be pristine by definition.\nThe count does not include any actual maps, even mutated ones;\nthese are returned as a separate value.")
    public static final SubLObject get_backed_map_non_pristine_object_count_alt(SubLObject backed_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject maps_to_do = queues.create_queue();
                SubLObject count = ZERO_INTEGER;
                SubLObject map_count = ZERO_INTEGER;
                queues.enqueue(backed_map, maps_to_do);
                while (NIL == queues.queue_empty_p(maps_to_do)) {
                    {
                        SubLObject curr_map = queues.dequeue(maps_to_do);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == backed_map_p(curr_map)) {
                                Errors.error($str_alt118$Error_in_non_pristine_object_coun, curr_map);
                            }
                        }
                        map_count = add(map_count, ONE_INTEGER);
                        {
                            SubLObject internal_map = backed_map_map(curr_map);
                            SubLObject iterator = map_utilities.new_map_iterator(internal_map);
                            SubLObject done_var = NIL;
                            while (NIL == done_var) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject var = iteration.iteration_next(iterator);
                                    SubLObject valid = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != valid) {
                                        {
                                            SubLObject datum = var;
                                            SubLObject current = datum;
                                            SubLObject key = NIL;
                                            SubLObject value = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt2);
                                            key = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt2);
                                            value = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                if (NIL != file_vector_reference_p(value)) {
                                                    if (NIL != file_vector_reference_present_mutatedP(value)) {
                                                        {
                                                            SubLObject payload = file_vector_reference_referenced_object(value);
                                                            if (NIL != backed_map_p(payload)) {
                                                                queues.enqueue(payload, maps_to_do);
                                                            } else {
                                                                count = add(count, ONE_INTEGER);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    count = add(count, ONE_INTEGER);
                                                    if (NIL != backed_map_p(value)) {
                                                        queues.enqueue(value, maps_to_do);
                                                    }
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt2);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean(NIL == valid);
                                }
                            } 
                        }
                    }
                } 
                return values(count, map_count);
            }
        }
    }

    /**
     * Walk the backed map, counting all non pristine objects.
     * This includes mutated backed maps. The method does NOT swap any
     * objects in--since these would all be pristine by definition.
     * The count does not include any actual maps, even mutated ones;
     * these are returned as a separate value.
     */
    @LispMethod(comment = "Walk the backed map, counting all non pristine objects.\r\nThis includes mutated backed maps. The method does NOT swap any\r\nobjects in--since these would all be pristine by definition.\r\nThe count does not include any actual maps, even mutated ones;\r\nthese are returned as a separate value.\nWalk the backed map, counting all non pristine objects.\nThis includes mutated backed maps. The method does NOT swap any\nobjects in--since these would all be pristine by definition.\nThe count does not include any actual maps, even mutated ones;\nthese are returned as a separate value.")
    public static SubLObject get_backed_map_non_pristine_object_count(final SubLObject backed_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject maps_to_do = queues.create_queue(UNPROVIDED);
        SubLObject count = ZERO_INTEGER;
        SubLObject map_count = ZERO_INTEGER;
        queues.enqueue(backed_map, maps_to_do);
        while (NIL == queues.queue_empty_p(maps_to_do)) {
            final SubLObject curr_map = queues.dequeue(maps_to_do);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == backed_map_p(curr_map))) {
                Errors.error($str139$Error_in_non_pristine_object_coun, curr_map);
            }
            map_count = add(map_count, ONE_INTEGER);
            final SubLObject internal_map = backed_map_map(curr_map);
            final SubLObject iterator = map_utilities.new_map_iterator(internal_map);
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list2);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list2);
                    value = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != file_vector_reference_p(value)) {
                            if (NIL != file_vector_reference_present_mutatedP(value)) {
                                final SubLObject payload = file_vector_reference_referenced_object(value);
                                if (NIL != backed_map_p(payload)) {
                                    queues.enqueue(payload, maps_to_do);
                                } else {
                                    count = add(count, ONE_INTEGER);
                                }
                            }
                        } else {
                            count = add(count, ONE_INTEGER);
                            if (NIL != backed_map_p(value)) {
                                queues.enqueue(value, maps_to_do);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list2);
                    }
                }
            }
        } 
        return values(count, map_count);
    }

    public static final SubLObject test_file_vector_backed_map_with_alist_alt(SubLObject alist, SubLObject value_equal_fn) {
        if (value_equal_fn == UNPROVIDED) {
            value_equal_fn = EQUAL;
        }
        {
            SubLObject map = dictionary_utilities.new_dictionary_from_alist(alist, UNPROVIDED);
            return test_file_vector_backed_map(map, value_equal_fn);
        }
    }

    public static SubLObject test_file_vector_backed_map_with_alist(final SubLObject alist, SubLObject value_equal_fn) {
        if (value_equal_fn == UNPROVIDED) {
            value_equal_fn = EQUAL;
        }
        final SubLObject map = dictionary_utilities.new_dictionary_from_alist(alist, EQUALP);
        return test_file_vector_backed_map(map, value_equal_fn);
    }

    public static final SubLObject test_file_vector_backed_map_alt(SubLObject map, SubLObject value_equal_fn) {
        if (value_equal_fn == UNPROVIDED) {
            value_equal_fn = EQUAL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject data_file = file_utilities.make_temp_filename($str_alt129$_tmp_);
                try {
                    {
                        SubLObject index_file = file_utilities.make_temp_filename($str_alt129$_tmp_);
                        try {
                            {
                                SubLObject canonical_map_size = map_utilities.map_size(map);
                                SubLObject new_map = NIL;
                                create_file_backing_for_map(map, data_file, index_file);
                                {
                                    SubLObject fvector = NIL;
                                    try {
                                        fvector = file_vector.new_file_vector(data_file, index_file, $INPUT);
                                        new_map = new_file_vector_backed_map(fvector, map_utilities.map_test(map), map_utilities.map_size(map), UNPROVIDED);
                                        test_enforce_map_specific_cache_ratios(new_map, ZERO_INTEGER, canonical_map_size);
                                        {
                                            SubLObject iterator = map_utilities.new_map_iterator(new_map);
                                            SubLObject done_var = NIL;
                                            while (NIL == done_var) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject var = iteration.iteration_next(iterator);
                                                    SubLObject valid = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject datum = var;
                                                            SubLObject current = datum;
                                                            SubLObject key = NIL;
                                                            SubLObject value = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list_alt2);
                                                            key = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt2);
                                                            value = current.first();
                                                            current = current.rest();
                                                            if (NIL == current) {
                                                                if ($NOT_FOUND == map_utilities.map_get(map, key, $NOT_FOUND)) {
                                                                    Errors.error($str_alt130$Key__A_should_be_in_the_map_but_i, key);
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list_alt2);
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                        {
                                            SubLObject iterator = map_utilities.new_map_iterator(map);
                                            SubLObject done_var = NIL;
                                            while (NIL == done_var) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject var = iteration.iteration_next(iterator);
                                                    SubLObject valid = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject datum = var;
                                                            SubLObject current = datum;
                                                            SubLObject key = NIL;
                                                            SubLObject value = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list_alt2);
                                                            key = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt2);
                                                            value = current.first();
                                                            current = current.rest();
                                                            if (NIL == current) {
                                                                {
                                                                    SubLObject new_value = file_vector_backed_map_get(new_map, fvector, key, $NOT_FOUND);
                                                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                                        if ($NOT_FOUND == new_value) {
                                                                            Errors.error($str_alt131$The_value_for_the_key__A_is_missi, key);
                                                                        }
                                                                    }
                                                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                                        if (NIL == list_utilities.sublisp_boolean(funcall(value_equal_fn, value, new_value))) {
                                                                            Errors.error($str_alt132$The_old_value__A_does_not_match_t, value, new_value, value_equal_fn);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list_alt2);
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                        test_enforce_map_specific_cache_ratios(new_map, canonical_map_size, ZERO_INTEGER);
                                        swap_out_all_pristine_file_vector_backed_map_objects(new_map);
                                        test_enforce_map_specific_cache_ratios(new_map, ZERO_INTEGER, canonical_map_size);
                                        {
                                            SubLObject some_key = map_utilities.map_arbitrary_key(new_map, UNPROVIDED);
                                            SubLObject remaining_paged_out = subtract(canonical_map_size, ONE_INTEGER);
                                            SubLObject new_value = Guids.new_guid();
                                            SubLObject some_value = NIL;
                                            some_value = file_vector_backed_map_get(new_map, fvector, some_key, $NOT_FOUND);
                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                if ($NOT_FOUND == some_value) {
                                                    Errors.error($str_alt133$The_value_for_the_key__A_can_all_, some_key);
                                                }
                                            }
                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                if (NIL == file_vector_reference_p(map_utilities.map_get(new_map, some_key, $NOT_FOUND))) {
                                                    Errors.error($str_alt134$The_accessing_of_the_value_for__A, some_key);
                                                }
                                            }
                                            test_enforce_map_specific_cache_ratios(new_map, ONE_INTEGER, remaining_paged_out);
                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                if ($MUTATED != file_vector_backed_map_touch(new_map, some_key, UNPROVIDED)) {
                                                    Errors.error($str_alt135$The_touching_of_the_object_did_no);
                                                }
                                            }
                                            swap_out_all_pristine_file_vector_backed_map_objects(new_map);
                                            test_enforce_map_specific_cache_ratios(new_map, ONE_INTEGER, remaining_paged_out);
                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                if ($RECOVERED != undo_change_to_file_vector_backed_map(new_map, some_key)) {
                                                    Errors.error($str_alt136$Undoing_the_change_for_key__A_did, some_key);
                                                }
                                            }
                                            test_enforce_map_specific_cache_ratios(new_map, ZERO_INTEGER, canonical_map_size);
                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                if ($MUTATED != file_vector_backed_map_put(new_map, some_key, new_value)) {
                                                    Errors.error($str_alt137$The_modification_of_the_entry_for, some_key);
                                                }
                                            }
                                            {
                                                SubLObject curr_value = file_vector_backed_map_get(new_map, NIL, some_key, $NOT_FOUND);
                                                if (!new_value.equalp(curr_value)) {
                                                    dictionary_utilities.print_dictionary_contents(new_map, UNPROVIDED);
                                                    Errors.error($str_alt138$The_modified_entry_for__A_no_long, some_key, new_value, curr_value);
                                                }
                                            }
                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                if (NIL == file_vector_reference_present_mutatedP(map_utilities.map_get(new_map, some_key, UNPROVIDED))) {
                                                    Errors.error($str_alt139$The_stored_entry_for__A_is_not_a_, some_key);
                                                }
                                            }
                                            test_enforce_map_specific_cache_ratios(new_map, ONE_INTEGER, remaining_paged_out);
                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                if ($RECOVERED != undo_change_to_file_vector_backed_map(new_map, some_key)) {
                                                    Errors.error($str_alt136$Undoing_the_change_for_key__A_did, some_key);
                                                }
                                            }
                                            test_enforce_map_specific_cache_ratios(new_map, ZERO_INTEGER, canonical_map_size);
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL != file_vector.file_vector_p(fvector)) {
                                                    file_vector.close_file_vector(fvector);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    {
                                        SubLObject ignore_errors_tag = NIL;
                                        try {
                                            {
                                                SubLObject _prev_bind_0_11 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                    try {
                                                        Filesys.delete_file(index_file);
                                                    } catch (Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, NIL);
                                                    }
                                                } finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_0_11, thread);
                                                }
                                            }
                                        } catch (Throwable ccatch_env_var) {
                                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                        }
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            {
                                SubLObject ignore_errors_tag = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_12 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                            try {
                                                Filesys.delete_file(data_file);
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_12, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                }
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return $SUCCESS;
        }
    }

    public static SubLObject test_file_vector_backed_map(final SubLObject map, SubLObject value_equal_fn) {
        if (value_equal_fn == UNPROVIDED) {
            value_equal_fn = EQUAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data_file = file_utilities.make_temp_filename($str149$_tmp_);
        try {
            final SubLObject index_file = file_utilities.make_temp_filename($str149$_tmp_);
            try {
                final SubLObject canonical_map_size = map_utilities.map_size(map);
                SubLObject new_map = NIL;
                create_file_backing_for_map(map, data_file, index_file);
                SubLObject fvector = NIL;
                try {
                    fvector = file_vector.new_file_vector(data_file, index_file, $INPUT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    new_map = new_file_vector_backed_map(fvector, map_utilities.map_test(map), map_utilities.map_size(map), UNPROVIDED);
                    test_enforce_map_specific_cache_ratios(new_map, ZERO_INTEGER, canonical_map_size);
                    SubLObject iterator = map_utilities.new_map_iterator(new_map);
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject var = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            SubLObject current;
                            final SubLObject datum = current = var;
                            SubLObject key = NIL;
                            SubLObject value = NIL;
                            destructuring_bind_must_consp(current, datum, $list2);
                            key = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list2);
                            value = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if ($NOT_FOUND == map_utilities.map_get(map, key, $NOT_FOUND)) {
                                    Errors.error($str150$Key__A_should_be_in_the_map_but_i, key);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list2);
                            }
                        }
                    }
                    iterator = map_utilities.new_map_iterator(map);
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject var = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            SubLObject current;
                            final SubLObject datum = current = var;
                            SubLObject key = NIL;
                            SubLObject value = NIL;
                            destructuring_bind_must_consp(current, datum, $list2);
                            key = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list2);
                            value = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                final SubLObject new_value = file_vector_backed_map_get(new_map, fvector, key, $NOT_FOUND);
                                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($NOT_FOUND == new_value)) {
                                    Errors.error($str151$The_value_for_the_key__A_is_missi, key);
                                }
                                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.sublisp_boolean(funcall(value_equal_fn, value, new_value)))) {
                                    Errors.error($str152$The_old_value__A_does_not_match_t, value, new_value, value_equal_fn);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list2);
                            }
                        }
                    }
                    final SubLObject keys = map_utilities.map_keys(map);
                    final SubLObject num_of_keys = length(keys);
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!canonical_map_size.numE(num_of_keys))) {
                        Errors.error($str153$There_are_supposed_to_be__A_keys_, canonical_map_size, num_of_keys);
                    }
                    final SubLObject values = map_utilities.map_values(map);
                    final SubLObject num_of_values = length(values);
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!canonical_map_size.numE(num_of_values))) {
                        Errors.error($str154$There_are_supposed_to_be__A_value, canonical_map_size, num_of_values);
                    }
                    test_enforce_map_specific_cache_ratios(new_map, canonical_map_size, ZERO_INTEGER);
                    swap_out_all_pristine_file_vector_backed_map_objects(new_map);
                    test_enforce_map_specific_cache_ratios(new_map, ZERO_INTEGER, canonical_map_size);
                    final SubLObject some_key = map_utilities.map_arbitrary_key(new_map, UNPROVIDED);
                    final SubLObject remaining_paged_out = subtract(canonical_map_size, ONE_INTEGER);
                    final SubLObject new_value2 = Guids.new_guid();
                    SubLObject some_value = NIL;
                    some_value = file_vector_backed_map_get(new_map, fvector, some_key, $NOT_FOUND);
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($NOT_FOUND == some_value)) {
                        Errors.error($str155$The_value_for_the_key__A_can_all_, some_key);
                    }
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == file_vector_reference_p(map_utilities.map_get(new_map, some_key, $NOT_FOUND)))) {
                        Errors.error($str156$The_accessing_of_the_value_for__A, some_key);
                    }
                    test_enforce_map_specific_cache_ratios(new_map, ONE_INTEGER, remaining_paged_out);
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($MUTATED != file_vector_backed_map_touch(new_map, some_key, UNPROVIDED))) {
                        Errors.error($str157$The_touching_of_the_object_did_no);
                    }
                    swap_out_all_pristine_file_vector_backed_map_objects(new_map);
                    test_enforce_map_specific_cache_ratios(new_map, ONE_INTEGER, remaining_paged_out);
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($RECOVERED != undo_change_to_file_vector_backed_map(new_map, some_key))) {
                        Errors.error($str158$Undoing_the_change_for_key__A_did, some_key);
                    }
                    test_enforce_map_specific_cache_ratios(new_map, ZERO_INTEGER, canonical_map_size);
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($MUTATED != file_vector_backed_map_put(new_map, some_key, new_value2))) {
                        Errors.error($str159$The_modification_of_the_entry_for, some_key);
                    }
                    final SubLObject curr_value = file_vector_backed_map_get(new_map, NIL, some_key, $NOT_FOUND);
                    if (!new_value2.equalp(curr_value)) {
                        dictionary_utilities.print_dictionary_contents(new_map, UNPROVIDED);
                        Errors.error($str160$The_modified_entry_for__A_no_long, some_key, new_value2, curr_value);
                    }
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == file_vector_reference_present_mutatedP(map_utilities.map_get(new_map, some_key, UNPROVIDED)))) {
                        Errors.error($str161$The_stored_entry_for__A_is_not_a_, some_key);
                    }
                    test_enforce_map_specific_cache_ratios(new_map, ONE_INTEGER, remaining_paged_out);
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($RECOVERED != undo_change_to_file_vector_backed_map(new_map, some_key))) {
                        Errors.error($str158$Undoing_the_change_for_key__A_did, some_key);
                    }
                    test_enforce_map_specific_cache_ratios(new_map, ZERO_INTEGER, canonical_map_size);
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != file_vector.file_vector_p(fvector)) {
                            file_vector.close_file_vector(fvector);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        thread.throwStack.push($IGNORE_ERRORS_TARGET);
                        final SubLObject _prev_bind_0_$13 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                Filesys.delete_file(index_file);
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$13, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        thread.throwStack.pop();
                    } finally {
                        thread.throwStack.pop();
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                SubLObject ignore_errors_tag2 = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$14 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            Filesys.delete_file(data_file);
                        } catch (final Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$14, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                    thread.throwStack.pop();
                } finally {
                    thread.throwStack.pop();
                }
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return $SUCCESS;
    }

    public static final SubLObject test_enforce_map_specific_cache_ratios_alt(SubLObject map, SubLObject paged_in, SubLObject paged_out) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject actual_paged_in = file_vector_backed_map_cache_ratio(map);
                SubLObject actual_paged_out = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!paged_in.numE(actual_paged_in)) {
                        Errors.error($str_alt143$_A_should_be_paged_in__but__A_are, paged_in, actual_paged_in);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!paged_out.numE(actual_paged_out)) {
                        Errors.error($str_alt144$_A_should_be_paged_out__but__A_ar, paged_out, actual_paged_out);
                    }
                }
            }
            return map;
        }
    }

    public static SubLObject test_enforce_map_specific_cache_ratios(final SubLObject map, final SubLObject paged_in, final SubLObject paged_out) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject actual_paged_in = file_vector_backed_map_cache_ratio(map);
        final SubLObject actual_paged_out = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!paged_in.numE(actual_paged_in))) {
            Errors.error($str163$_A_should_be_paged_in__but__A_are, paged_in, actual_paged_in);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!paged_out.numE(actual_paged_out))) {
            Errors.error($str164$_A_should_be_paged_out__but__A_ar, paged_out, actual_paged_out);
        }
        return map;
    }

    public static final SubLObject test_map_to_file_vector_backed_map_conversion_with_alist_alt(SubLObject alist, SubLObject value_equal_fn) {
        if (value_equal_fn == UNPROVIDED) {
            value_equal_fn = EQUAL;
        }
        {
            SubLObject map = dictionary_utilities.new_dictionary_from_alist(alist, UNPROVIDED);
            return test_map_to_file_vector_backed_map_conversion(map, value_equal_fn);
        }
    }

    public static SubLObject test_map_to_file_vector_backed_map_conversion_with_alist(final SubLObject alist, SubLObject value_equal_fn) {
        if (value_equal_fn == UNPROVIDED) {
            value_equal_fn = EQUAL;
        }
        final SubLObject map = dictionary_utilities.new_dictionary_from_alist(alist, EQUALP);
        return test_map_to_file_vector_backed_map_conversion(map, value_equal_fn);
    }

    public static final SubLObject test_map_to_file_vector_backed_map_conversion_alt(SubLObject map, SubLObject value_equal_fn) {
        if (value_equal_fn == UNPROVIDED) {
            value_equal_fn = EQUAL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject backup_map = map_utilities.clone_map(map, $COPY_CONTENTS);
                SubLObject data_file = file_utilities.make_temp_filename($str_alt129$_tmp_);
                try {
                    {
                        SubLObject index_file = file_utilities.make_temp_filename($str_alt129$_tmp_);
                        try {
                            {
                                SubLObject fvector = NIL;
                                try {
                                    fvector = file_vector.new_file_vector(data_file, index_file, $OUTPUT);
                                    convert_map_to_file_vector_backed_map(map, fvector, UNPROVIDED);
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            if (NIL != file_vector.file_vector_p(fvector)) {
                                                file_vector.close_file_vector(fvector);
                                            }
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject iterator = map_utilities.new_map_iterator(map);
                                SubLObject done_var = NIL;
                                while (NIL == done_var) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject var = iteration.iteration_next(iterator);
                                        SubLObject valid = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != valid) {
                                            {
                                                SubLObject datum = var;
                                                SubLObject current = datum;
                                                SubLObject key = NIL;
                                                SubLObject reference = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt146);
                                                key = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt146);
                                                reference = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                        if (NIL == file_vector_reference_p(reference)) {
                                                            Errors.error($str_alt147$The_entry_for__A_in_the_original_, key);
                                                        }
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt146);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    }
                                } 
                            }
                            {
                                SubLObject new_map = NIL;
                                {
                                    SubLObject fvector = NIL;
                                    try {
                                        fvector = file_vector.new_file_vector(data_file, index_file, $INPUT);
                                        new_map = new_file_vector_backed_map(fvector, map_utilities.map_test(map), map_utilities.map_size(map), UNPROVIDED);
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL != file_vector.file_vector_p(fvector)) {
                                                    file_vector.close_file_vector(fvector);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (!map_utilities.map_size(new_map).numE(map_utilities.map_size(map))) {
                                        Errors.error($str_alt148$The_loaded_map_does_not_have_the_, map_utilities.map_size(new_map), map_utilities.map_size(map));
                                    }
                                }
                                {
                                    SubLObject iterator = map_utilities.new_map_iterator(new_map);
                                    SubLObject done_var = NIL;
                                    while (NIL == done_var) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject var = iteration.iteration_next(iterator);
                                            SubLObject valid = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != valid) {
                                                {
                                                    SubLObject datum = var;
                                                    SubLObject current = datum;
                                                    SubLObject key = NIL;
                                                    SubLObject reference = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt146);
                                                    key = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt146);
                                                    reference = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                            if (NIL == file_vector_reference_p(reference)) {
                                                                Errors.error($str_alt149$The_entry_for__A_in_the_new_map_i, key);
                                                            }
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt146);
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                                {
                                    SubLObject fvector = NIL;
                                    try {
                                        fvector = file_vector.new_file_vector(data_file, index_file, $INPUT);
                                        {
                                            SubLObject new_value = NIL;
                                            SubLObject iterator = map_utilities.new_map_iterator(new_map);
                                            SubLObject done_var = NIL;
                                            while (NIL == done_var) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject var = iteration.iteration_next(iterator);
                                                    SubLObject valid = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject datum = var;
                                                            SubLObject current = datum;
                                                            SubLObject new_key = NIL;
                                                            SubLObject impl_value = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list_alt150);
                                                            new_key = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt150);
                                                            impl_value = current.first();
                                                            current = current.rest();
                                                            if (NIL == current) {
                                                                if (!((NIL != file_vector_reference_p(impl_value)) && (NIL != file_vector_reference_deletedP(impl_value)))) {
                                                                    new_value = file_vector_backed_map_wX_cache_get(new_map, fvector, NIL, new_key, UNPROVIDED);
                                                                    {
                                                                        SubLObject old_value = file_vector_backed_map_get(map, NIL, new_key, $NOT_FOUND);
                                                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                                            if ($NOT_FOUND == old_value) {
                                                                                Errors.error($str_alt151$The_new_map_has_an_entry_for_key_, new_key);
                                                                            }
                                                                        }
                                                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                                            if (NIL == list_utilities.sublisp_boolean(funcall(value_equal_fn, new_value, old_value))) {
                                                                                Errors.error($str_alt152$The_values_for_key__A_are_not_equ, new SubLObject[]{ new_key, value_equal_fn, new_value, old_value });
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list_alt150);
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL != file_vector.file_vector_p(fvector)) {
                                                    file_vector.close_file_vector(fvector);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                                {
                                    SubLObject fvector = NIL;
                                    try {
                                        fvector = file_vector.new_file_vector(data_file, index_file, $INPUT);
                                        {
                                            SubLObject cdotimes_end_var = map_utilities.map_size(new_map);
                                            SubLObject i = NIL;
                                            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                                                {
                                                    SubLObject some_key = map_utilities.map_arbitrary_key(new_map, UNPROVIDED);
                                                    file_vector_backed_map_remove(new_map, some_key, $SUPPORT_UNDO);
                                                    {
                                                        SubLObject count = ZERO_INTEGER;
                                                        SubLObject conceptual_size = subtract(map_utilities.map_size(new_map), ONE_INTEGER);
                                                        SubLObject fvbm_iterator = new_file_vector_backed_map_iterator(new_map, fvector, UNPROVIDED, UNPROVIDED);
                                                        SubLObject done_var = NIL;
                                                        while (NIL == done_var) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject data_bundle = iteration.iteration_next(fvbm_iterator);
                                                                SubLObject valid = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != valid) {
                                                                    {
                                                                        SubLObject datum = data_bundle;
                                                                        SubLObject current = datum;
                                                                        SubLObject key = NIL;
                                                                        SubLObject reference = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list_alt146);
                                                                        key = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list_alt146);
                                                                        reference = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            count = add(count, ONE_INTEGER);
                                                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                                                if (key == some_key) {
                                                                                    Errors.error($str_alt154$We_are_getting_the_removed_key__A, some_key, reference);
                                                                                }
                                                                            }
                                                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                                                if (!map_utilities.map_get(backup_map, key, UNPROVIDED).equalp(reference)) {
                                                                                    Errors.error($str_alt155$We_are_not_getting_back_the_same_, key, map_utilities.map_get(backup_map, key, UNPROVIDED), reference);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list_alt146);
                                                                        }
                                                                    }
                                                                }
                                                                done_var = makeBoolean(NIL == valid);
                                                            }
                                                        } 
                                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                            if (!count.numE(conceptual_size)) {
                                                                Errors.error($str_alt156$We_visited__A_entries_but_we_shou, count, conceptual_size);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL != file_vector.file_vector_p(fvector)) {
                                                    file_vector.close_file_vector(fvector);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    {
                                        SubLObject ignore_errors_tag = NIL;
                                        try {
                                            {
                                                SubLObject _prev_bind_0_13 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                    try {
                                                        Filesys.delete_file(index_file);
                                                    } catch (Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, NIL);
                                                    }
                                                } finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_0_13, thread);
                                                }
                                            }
                                        } catch (Throwable ccatch_env_var) {
                                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                        }
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            {
                                SubLObject ignore_errors_tag = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_14 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                            try {
                                                Filesys.delete_file(data_file);
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_14, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                }
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return $SUCCESS;
        }
    }

    public static SubLObject test_map_to_file_vector_backed_map_conversion(final SubLObject map, SubLObject value_equal_fn) {
        if (value_equal_fn == UNPROVIDED) {
            value_equal_fn = EQUAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject backup_map = map_utilities.clone_map(map, $COPY_CONTENTS);
        final SubLObject data_file = file_utilities.make_temp_filename($str149$_tmp_);
        try {
            final SubLObject index_file = file_utilities.make_temp_filename($str149$_tmp_);
            try {
                SubLObject fvector = NIL;
                try {
                    fvector = file_vector.new_file_vector(data_file, index_file, $OUTPUT, file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), UNPROVIDED);
                    convert_map_to_file_vector_backed_map(map, fvector, UNPROVIDED, UNPROVIDED);
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != file_vector.file_vector_p(fvector)) {
                            file_vector.close_file_vector(fvector);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
                final SubLObject iterator = map_utilities.new_map_iterator(map);
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject key = NIL;
                        SubLObject reference = NIL;
                        destructuring_bind_must_consp(current, datum, $list166);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list166);
                        reference = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == file_vector_reference_p(reference))) {
                                Errors.error($str167$The_entry_for__A_in_the_original_, key);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list166);
                        }
                    }
                }
                SubLObject new_map = NIL;
                SubLObject fvector2 = NIL;
                try {
                    fvector2 = file_vector.new_file_vector(data_file, index_file, $INPUT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    new_map = new_file_vector_backed_map(fvector2, map_utilities.map_test(map), map_utilities.map_size(map), UNPROVIDED);
                } finally {
                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL != file_vector.file_vector_p(fvector2)) {
                            file_vector.close_file_vector(fvector2);
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!map_utilities.map_size(new_map).numE(map_utilities.map_size(map)))) {
                    Errors.error($str168$The_loaded_map_does_not_have_the_, map_utilities.map_size(new_map), map_utilities.map_size(map));
                }
                final SubLObject iterator2 = map_utilities.new_map_iterator(new_map);
                SubLObject valid2;
                for (SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean(NIL == valid2)) {
                    thread.resetMultipleValues();
                    final SubLObject var2 = iteration.iteration_next(iterator2);
                    valid2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid2) {
                        SubLObject current2;
                        final SubLObject datum2 = current2 = var2;
                        SubLObject key2 = NIL;
                        SubLObject reference2 = NIL;
                        destructuring_bind_must_consp(current2, datum2, $list166);
                        key2 = current2.first();
                        current2 = current2.rest();
                        destructuring_bind_must_consp(current2, datum2, $list166);
                        reference2 = current2.first();
                        current2 = current2.rest();
                        if (NIL == current2) {
                            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == file_vector_reference_p(reference2))) {
                                Errors.error($str169$The_entry_for__A_in_the_new_map_i, key2);
                            }
                        } else {
                            cdestructuring_bind_error(datum2, $list166);
                        }
                    }
                }
                fvector2 = NIL;
                try {
                    fvector2 = file_vector.new_file_vector(data_file, index_file, $INPUT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject new_value = NIL;
                    final SubLObject iterator3 = map_utilities.new_map_iterator(new_map);
                    SubLObject valid3;
                    for (SubLObject done_var3 = NIL; NIL == done_var3; done_var3 = makeBoolean(NIL == valid3)) {
                        thread.resetMultipleValues();
                        final SubLObject var3 = iteration.iteration_next(iterator3);
                        valid3 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid3) {
                            SubLObject current3;
                            final SubLObject datum3 = current3 = var3;
                            SubLObject new_key = NIL;
                            SubLObject impl_value = NIL;
                            destructuring_bind_must_consp(current3, datum3, $list170);
                            new_key = current3.first();
                            current3 = current3.rest();
                            destructuring_bind_must_consp(current3, datum3, $list170);
                            impl_value = current3.first();
                            current3 = current3.rest();
                            if (NIL == current3) {
                                if ((NIL == file_vector_reference_p(impl_value)) || (NIL == file_vector_reference_deletedP(impl_value))) {
                                    new_value = file_vector_backed_map_wX_cache_get(new_map, fvector2, NIL, new_key, UNPROVIDED);
                                    final SubLObject old_value = file_vector_backed_map_get(map, NIL, new_key, $NOT_FOUND);
                                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($NOT_FOUND == old_value)) {
                                        Errors.error($str171$The_new_map_has_an_entry_for_key_, new_key);
                                    }
                                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.sublisp_boolean(funcall(value_equal_fn, new_value, old_value)))) {
                                        Errors.error($str172$The_values_for_key__A_are_not_equ, new SubLObject[]{ new_key, value_equal_fn, new_value, old_value });
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum3, $list170);
                            }
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        if (NIL != file_vector.file_vector_p(fvector2)) {
                            file_vector.close_file_vector(fvector2);
                        }
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                    }
                }
                final SubLObject backup_key_set = set_utilities.construct_set_from_list(map_utilities.map_keys(backup_map), map_utilities.map_test(backup_map), UNPROVIDED);
                SubLObject fvector3 = NIL;
                try {
                    fvector3 = file_vector.new_file_vector(data_file, index_file, $INPUT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject cdotimes_end_var;
                    SubLObject i;
                    SubLObject conceptual_size;
                    SubLObject some_key;
                    SubLObject count;
                    SubLObject fvbm_iterator;
                    SubLObject checking_set;
                    SubLObject done_var4;
                    SubLObject data_bundle;
                    SubLObject valid4;
                    SubLObject current4;
                    SubLObject datum4;
                    SubLObject key3;
                    SubLObject reference3;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject checking_key;
                    for (cdotimes_end_var = set.set_size(backup_key_set), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        conceptual_size = subtract(set.set_size(backup_key_set), ONE_INTEGER);
                        some_key = list_utilities.random_element(set.set_element_list(backup_key_set));
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == map_utilities.map_has_keyP(new_map, some_key))) {
                            Errors.error($str173$New_map__A_and_backup_key_set__A_, new_map, backup_key_set, some_key);
                        }
                        file_vector_backed_map_remove(new_map, some_key, $SUPPORT_UNDO);
                        set.set_remove(some_key, backup_key_set);
                        count = ZERO_INTEGER;
                        fvbm_iterator = new_file_vector_backed_map_iterator(new_map, fvector3, UNPROVIDED, UNPROVIDED);
                        checking_set = set.copy_set(backup_key_set);
                        for (done_var4 = NIL; NIL == done_var4; done_var4 = makeBoolean(NIL == valid4)) {
                            thread.resetMultipleValues();
                            data_bundle = iteration.iteration_next(fvbm_iterator);
                            valid4 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid4) {
                                datum4 = current4 = data_bundle;
                                key3 = NIL;
                                reference3 = NIL;
                                destructuring_bind_must_consp(current4, datum4, $list166);
                                key3 = current4.first();
                                current4 = current4.rest();
                                destructuring_bind_must_consp(current4, datum4, $list166);
                                reference3 = current4.first();
                                current4 = current4.rest();
                                if (NIL == current4) {
                                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == set.set_memberP(key3, checking_set))) {
                                        Errors.error($str175$We_are_getting__A_back__but_that_, key3, set.set_element_list(checking_set));
                                    }
                                    count = add(count, ONE_INTEGER);
                                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && key3.eql(some_key)) {
                                        Errors.error($str176$We_are_getting_the_removed_key__A, some_key, reference3);
                                    }
                                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!map_utilities.map_get(backup_map, key3, UNPROVIDED).equalp(reference3))) {
                                        Errors.error($str177$We_are_not_getting_back_the_same_, key3, map_utilities.map_get(backup_map, key3, UNPROVIDED), reference3);
                                    }
                                    set.set_remove(key3, checking_set);
                                } else {
                                    cdestructuring_bind_error(datum4, $list166);
                                }
                            }
                        }
                        if (NIL == set.empty_set_p(checking_set)) {
                            Errors.warn($str178$We_no_longer_visited__A_____inves, set.set_element_list(checking_set));
                            set_contents_var = set.do_set_internal(checking_set);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                checking_key = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, checking_key)) {
                                    if (NIL != map_utilities.map_has_keyP(new_map, checking_key)) {
                                        Errors.warn($str179$_____A_is_still_present_in_map___, checking_key);
                                    } else {
                                        Errors.warn($str180$_____A_is_not_even_findable_in_th, checking_key);
                                    }
                                }
                            }
                            Errors.error($str181$Deleting__A_to_produce__A_did_not, some_key, set.set_element_list(backup_key_set));
                        }
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!count.numE(conceptual_size))) {
                            Errors.error($str182$We_visited__A_entries_but_we_shou, count, conceptual_size);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values4 = getValuesAsVector();
                        if (NIL != file_vector.file_vector_p(fvector3)) {
                            file_vector.close_file_vector(fvector3);
                        }
                        restoreValuesFromVector(_values4);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values5 = getValuesAsVector();
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        thread.throwStack.push($IGNORE_ERRORS_TARGET);
                        final SubLObject _prev_bind_0_$15 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                Filesys.delete_file(index_file);
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$15, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        thread.throwStack.pop();
                    } finally {
                        thread.throwStack.pop();
                    }
                    restoreValuesFromVector(_values5);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values6 = getValuesAsVector();
                SubLObject ignore_errors_tag2 = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$16 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            Filesys.delete_file(data_file);
                        } catch (final Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$16, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                    thread.throwStack.pop();
                } finally {
                    thread.throwStack.pop();
                }
                restoreValuesFromVector(_values6);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return $SUCCESS;
    }

    public static SubLObject segment_file_vector_data_stream(final SubLObject fvector, SubLObject stream, SubLObject include_indexP) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (include_indexP == UNPROVIDED) {
            include_indexP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(fvector);
        SubLObject last = NIL;
        final SubLObject iterator_var = file_vector.new_file_vector_index_iterator(fvector);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject tuple = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = tuple;
                SubLObject index = NIL;
                SubLObject address = NIL;
                destructuring_bind_must_consp(current, datum, $list183);
                index = current.first();
                current = address = current.rest();
                if (NIL != last) {
                    if (NIL != include_indexP) {
                        princ(index, stream);
                        write_char(CHAR_space, stream);
                    }
                    file_utilities.copy_binary_data_to_hex_stream(data_stream, stream, last, address);
                    terpri(stream);
                }
                last = address;
            }
        }
        file_utilities.copy_binary_data_to_hex_stream(data_stream, stream, last, UNPROVIDED);
        terpri(stream);
        return fvector;
    }

    public static SubLObject inspect_file_vector_data_record(final SubLObject fvector, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject size = file_vector.file_vector_length(fvector);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!index.numL(size))) {
            Errors.error($str184$The_index__A_is_outside_of_the_ra, index, size);
        }
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(fvector);
        final SubLObject start = file_vector.read_file_vector_index_entry(fvector, index);
        final SubLObject end_index = add(index, ONE_INTEGER);
        if (end_index.numL(size)) {
            final SubLObject end = file_vector.read_file_vector_index_entry(fvector, add(index, ONE_INTEGER));
            return file_utilities.get_binary_data_from_stream(data_stream, start, end);
        }
        return file_utilities.get_binary_data_from_stream(data_stream, start, UNPROVIDED);
    }

    public static final SubLObject declare_file_vector_utilities_file_alt() {
        declareFunction("create_file_backing_for_map", "CREATE-FILE-BACKING-FOR-MAP", 3, 0, false);
        declareFunction("create_file_vector_backing_for_map", "CREATE-FILE-VECTOR-BACKING-FOR-MAP", 2, 0, false);
        declareFunction("write_file_vector_backing_map_prologue", "WRITE-FILE-VECTOR-BACKING-MAP-PROLOGUE", 2, 0, false);
        declareFunction("write_file_vector_backing_map_entry", "WRITE-FILE-VECTOR-BACKING-MAP-ENTRY", 3, 0, false);
        declareFunction("write_file_vector_backing_map_prologue_to_data_stream", "WRITE-FILE-VECTOR-BACKING-MAP-PROLOGUE-TO-DATA-STREAM", 2, 0, false);
        declareFunction("create_file_backing_for_maps", "CREATE-FILE-BACKING-FOR-MAPS", 3, 0, false);
        declareFunction("create_file_vector_backing_for_maps", "CREATE-FILE-VECTOR-BACKING-FOR-MAPS", 2, 0, false);
        declareFunction("file_vector_reference_print_function_trampoline", "FILE-VECTOR-REFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("file_vector_reference_p", "FILE-VECTOR-REFERENCE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.file_vector_utilities.$file_vector_reference_p$UnaryFunction();
        declareFunction("fvector_ref_index", "FVECTOR-REF-INDEX", 1, 0, false);
        declareFunction("fvector_ref_payload", "FVECTOR-REF-PAYLOAD", 1, 0, false);
        declareFunction("_csetf_fvector_ref_index", "_CSETF-FVECTOR-REF-INDEX", 2, 0, false);
        declareFunction("_csetf_fvector_ref_payload", "_CSETF-FVECTOR-REF-PAYLOAD", 2, 0, false);
        declareFunction("make_file_vector_reference", "MAKE-FILE-VECTOR-REFERENCE", 0, 1, false);
        declareFunction("print_fvector_ref", "PRINT-FVECTOR-REF", 3, 0, false);
        declareFunction("new_file_vector_reference", "NEW-FILE-VECTOR-REFERENCE", 1, 0, false);
        declareFunction("new_file_vector_reference_wX_payload", "NEW-FILE-VECTOR-REFERENCE-W/-PAYLOAD", 2, 0, false);
        declareFunction("file_vector_reference_index", "FILE-VECTOR-REFERENCE-INDEX", 1, 0, false);
        declareFunction("mark_file_vector_reference_as_mutated", "MARK-FILE-VECTOR-REFERENCE-AS-MUTATED", 1, 0, false);
        declareFunction("recover_mutated_file_vector_reference", "RECOVER-MUTATED-FILE-VECTOR-REFERENCE", 1, 0, false);
        declareFunction("restore_file_vector_reference", "RESTORE-FILE-VECTOR-REFERENCE", 1, 0, false);
        declareFunction("set_file_vector_reference_referenced_object", "SET-FILE-VECTOR-REFERENCE-REFERENCED-OBJECT", 2, 0, false);
        declareFunction("clear_file_vector_reference_referenced_object", "CLEAR-FILE-VECTOR-REFERENCE-REFERENCED-OBJECT", 1, 0, false);
        declareFunction("file_vector_reference_referenced_object", "FILE-VECTOR-REFERENCE-REFERENCED-OBJECT", 1, 0, false);
        declareFunction("mark_file_vector_reference_as_deleted", "MARK-FILE-VECTOR-REFERENCE-AS-DELETED", 1, 0, false);
        declareFunction("fvector_ref_payload_in_memory_p", "FVECTOR-REF-PAYLOAD-IN-MEMORY-P", 1, 0, false);
        declareFunction("fvector_ref_valid_index_p", "FVECTOR-REF-VALID-INDEX-P", 1, 0, false);
        declareFunction("fvector_ref_has_valid_index_p", "FVECTOR-REF-HAS-VALID-INDEX-P", 1, 0, false);
        declareFunction("fvector_ref_mutated_index_p", "FVECTOR-REF-MUTATED-INDEX-P", 1, 0, false);
        declareFunction("fvector_ref_has_mutated_index_p", "FVECTOR-REF-HAS-MUTATED-INDEX-P", 1, 0, false);
        declareFunction("file_vector_reference_swapped_outP", "FILE-VECTOR-REFERENCE-SWAPPED-OUT?", 1, 0, false);
        declareFunction("file_vector_reference_present_pristineP", "FILE-VECTOR-REFERENCE-PRESENT-PRISTINE?", 1, 0, false);
        declareFunction("file_vector_reference_present_mutatedP", "FILE-VECTOR-REFERENCE-PRESENT-MUTATED?", 1, 0, false);
        declareFunction("file_vector_reference_deletedP", "FILE-VECTOR-REFERENCE-DELETED?", 1, 0, false);
        declareFunction("file_vector_reference_status", "FILE-VECTOR-REFERENCE-STATUS", 1, 0, false);
        declareFunction("file_vector_reference_presentP", "FILE-VECTOR-REFERENCE-PRESENT?", 1, 0, false);
        declareFunction("cfasl_input_file_vector_reference", "CFASL-INPUT-FILE-VECTOR-REFERENCE", 1, 0, false);
        declareFunction("cfasl_output_file_vector_reference", "CFASL-OUTPUT-FILE-VECTOR-REFERENCE", 2, 0, false);
        declareFunction("cfasl_output_object_file_vector_reference_method", "CFASL-OUTPUT-OBJECT-FILE-VECTOR-REFERENCE-METHOD", 2, 0, false);
        declareMacro("with_potential_data_stream_lock", "WITH-POTENTIAL-DATA-STREAM-LOCK");
        declareMacro("with_file_vector_backed_map_stream_lock", "WITH-FILE-VECTOR-BACKED-MAP-STREAM-LOCK");
        declareFunction("new_file_vector_backed_map", "NEW-FILE-VECTOR-BACKED-MAP", 1, 3, false);
        declareFunction("load_file_vector_backed_map", "LOAD-FILE-VECTOR-BACKED-MAP", 2, 0, false);
        declareFunction("load_one_file_vector_backed_map", "LOAD-ONE-FILE-VECTOR-BACKED-MAP", 1, 1, false);
        declareFunction("load_file_vector_backed_maps", "LOAD-FILE-VECTOR-BACKED-MAPS", 2, 0, false);
        declareFunction("file_vector_backed_map_get", "FILE-VECTOR-BACKED-MAP-GET", 3, 1, false);
        declareFunction("file_vector_backed_map_wX_cache_get", "FILE-VECTOR-BACKED-MAP-W/-CACHE-GET", 4, 1, false);
        declareFunction("file_vector_backed_map_put", "FILE-VECTOR-BACKED-MAP-PUT", 3, 0, false);
        declareFunction("file_vector_backed_map_wX_cache_put", "FILE-VECTOR-BACKED-MAP-W/-CACHE-PUT", 4, 0, false);
        declareFunction("file_vector_backed_map_remove", "FILE-VECTOR-BACKED-MAP-REMOVE", 2, 1, false);
        declareFunction("file_vector_backed_map_wX_cache_remove", "FILE-VECTOR-BACKED-MAP-W/-CACHE-REMOVE", 3, 1, false);
        declareFunction("file_vector_backed_map_touch", "FILE-VECTOR-BACKED-MAP-TOUCH", 2, 1, false);
        declareFunction("file_vector_backed_map_wX_cache_touch", "FILE-VECTOR-BACKED-MAP-W/-CACHE-TOUCH", 3, 1, false);
        declareFunction("undo_change_to_file_vector_backed_map", "UNDO-CHANGE-TO-FILE-VECTOR-BACKED-MAP", 2, 0, false);
        declareFunction("undo_change_to_file_vector_backed_map_wX_cache", "UNDO-CHANGE-TO-FILE-VECTOR-BACKED-MAP-W/-CACHE", 3, 0, false);
        declareMacro("do_file_vector_backed_map", "DO-FILE-VECTOR-BACKED-MAP");
        declareFunction("new_file_vector_backed_map_iterator", "NEW-FILE-VECTOR-BACKED-MAP-ITERATOR", 2, 2, false);
        declareFunction("new_file_vector_backed_map_iterator_state", "NEW-FILE-VECTOR-BACKED-MAP-ITERATOR-STATE", 4, 0, false);
        declareFunction("file_vector_backed_map_iterator_done", "FILE-VECTOR-BACKED-MAP-ITERATOR-DONE", 1, 0, false);
        declareFunction("file_vector_backed_map_iterator_next", "FILE-VECTOR-BACKED-MAP-ITERATOR-NEXT", 1, 0, false);
        declareFunction("file_vector_backed_map_cache_ratio", "FILE-VECTOR-BACKED-MAP-CACHE-RATIO", 1, 0, false);
        declareFunction("swap_out_all_pristine_file_vector_backed_map_objects", "SWAP-OUT-ALL-PRISTINE-FILE-VECTOR-BACKED-MAP-OBJECTS", 1, 0, false);
        declareFunction("swap_out_pristine_file_vector_backed_map_object", "SWAP-OUT-PRISTINE-FILE-VECTOR-BACKED-MAP-OBJECT", 2, 0, false);
        declareFunction("potentially_swap_out_pristine_file_vector_backed_map_object", "POTENTIALLY-SWAP-OUT-PRISTINE-FILE-VECTOR-BACKED-MAP-OBJECT", 1, 0, false);
        declareFunction("compact_file_vector_backed_map_representation", "COMPACT-FILE-VECTOR-BACKED-MAP-REPRESENTATION", 1, 0, false);
        declareFunction("file_vector_index_from_map_element_number", "FILE-VECTOR-INDEX-FROM-MAP-ELEMENT-NUMBER", 1, 0, false);
        declareFunction("file_vector_value_index_from_key_index", "FILE-VECTOR-VALUE-INDEX-FROM-KEY-INDEX", 1, 0, false);
        declareFunction("map_size_from_file_vector_length", "MAP-SIZE-FROM-FILE-VECTOR-LENGTH", 1, 0, false);
        declareFunction("file_vector_backed_map_read_key", "FILE-VECTOR-BACKED-MAP-READ-KEY", 1, 0, false);
        declareFunction("file_vector_backed_map_read_value", "FILE-VECTOR-BACKED-MAP-READ-VALUE", 1, 0, false);
        declareFunction("convert_map_to_file_vector_backed_map", "CONVERT-MAP-TO-FILE-VECTOR-BACKED-MAP", 2, 1, false);
        declareFunction("create_file_vector_backed_map_from_map", "CREATE-FILE-VECTOR-BACKED-MAP-FROM-MAP", 2, 1, false);
        declareFunction("populate_file_vector_backed_map_from_map", "POPULATE-FILE-VECTOR-BACKED-MAP-FROM-MAP", 3, 1, false);
        declareFunction("build_file_vector_backed_map_from_map", "BUILD-FILE-VECTOR-BACKED-MAP-FROM-MAP", 3, 1, false);
        declareFunction("backed_map_print_function_trampoline", "BACKED-MAP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("backed_map_p", "BACKED-MAP-P", 1, 0, false);
        new com.cyc.cycjava.cycl.file_vector_utilities.$backed_map_p$UnaryFunction();
        declareFunction("backed_map_map", "BACKED-MAP-MAP", 1, 0, false);
        declareFunction("backed_map_fvector", "BACKED-MAP-FVECTOR", 1, 0, false);
        declareFunction("backed_map_common_symbols", "BACKED-MAP-COMMON-SYMBOLS", 1, 0, false);
        declareFunction("_csetf_backed_map_map", "_CSETF-BACKED-MAP-MAP", 2, 0, false);
        declareFunction("_csetf_backed_map_fvector", "_CSETF-BACKED-MAP-FVECTOR", 2, 0, false);
        declareFunction("_csetf_backed_map_common_symbols", "_CSETF-BACKED-MAP-COMMON-SYMBOLS", 2, 0, false);
        declareFunction("make_backed_map", "MAKE-BACKED-MAP", 0, 1, false);
        declareFunction("new_backed_map", "NEW-BACKED-MAP", 2, 1, false);
        declareFunction("new_backed_map_from_files", "NEW-BACKED-MAP-FROM-FILES", 3, 1, false);
        declareMacro("with_backed_map_common_symbols", "WITH-BACKED-MAP-COMMON-SYMBOLS");
        declareFunction("print_backed_map", "PRINT-BACKED-MAP", 3, 0, false);
        declareFunction("new_future_backed_map", "NEW-FUTURE-BACKED-MAP", 1, 0, false);
        declareFunction("reconnect_backed_map", "RECONNECT-BACKED-MAP", 2, 1, false);
        declareFunction("reconnect_backed_map_based_on_backed_map", "RECONNECT-BACKED-MAP-BASED-ON-BACKED-MAP", 2, 0, false);
        declareFunction("cfasl_input_backed_map", "CFASL-INPUT-BACKED-MAP", 1, 0, false);
        declareFunction("cfasl_output_backed_map", "CFASL-OUTPUT-BACKED-MAP", 2, 0, false);
        declareFunction("cfasl_output_object_backed_map_method", "CFASL-OUTPUT-OBJECT-BACKED-MAP-METHOD", 2, 0, false);
        declareMacro("with_backed_map_cache_strategy", "WITH-BACKED-MAP-CACHE-STRATEGY");
        declareFunction("backed_map_cache_strategy", "BACKED-MAP-CACHE-STRATEGY", 0, 0, false);
        declareFunction("is_map_object_p_backed_map_method", "IS-MAP-OBJECT-P-BACKED-MAP-METHOD", 1, 0, false);
        declareFunction("map_object_size_backed_map_method", "MAP-OBJECT-SIZE-BACKED-MAP-METHOD", 1, 0, false);
        declareFunction("map_backed_map_size", "MAP-BACKED-MAP-SIZE", 1, 0, false);
        declareFunction("map_object_test_backed_map_method", "MAP-OBJECT-TEST-BACKED-MAP-METHOD", 1, 0, false);
        declareFunction("map_backed_map_test", "MAP-BACKED-MAP-TEST", 1, 0, false);
        declareFunction("map_object_put_backed_map_method", "MAP-OBJECT-PUT-BACKED-MAP-METHOD", 3, 0, false);
        declareFunction("map_backed_map_put", "MAP-BACKED-MAP-PUT", 3, 0, false);
        declareFunction("map_object_get_backed_map_method", "MAP-OBJECT-GET-BACKED-MAP-METHOD", 3, 0, false);
        declareFunction("map_backed_map_get", "MAP-BACKED-MAP-GET", 3, 0, false);
        declareFunction("map_object_get_without_values_backed_map_method", "MAP-OBJECT-GET-WITHOUT-VALUES-BACKED-MAP-METHOD", 3, 0, false);
        declareFunction("map_backed_map_get_without_values", "MAP-BACKED-MAP-GET-WITHOUT-VALUES", 3, 0, false);
        declareFunction("map_object_remove_backed_map_method", "MAP-OBJECT-REMOVE-BACKED-MAP-METHOD", 2, 0, false);
        declareFunction("map_backed_map_remove", "MAP-BACKED-MAP-REMOVE", 2, 0, false);
        declareFunction("map_object_remove_all_backed_map_method", "MAP-OBJECT-REMOVE-ALL-BACKED-MAP-METHOD", 1, 0, false);
        declareFunction("map_backed_map_remove_all", "MAP-BACKED-MAP-REMOVE-ALL", 1, 0, false);
        declareFunction("map_object_touch_backed_map_method", "MAP-OBJECT-TOUCH-BACKED-MAP-METHOD", 2, 0, false);
        declareFunction("map_backed_map_touch", "MAP-BACKED-MAP-TOUCH", 2, 0, false);
        declareFunction("new_map_object_with_same_properties_backed_map_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-BACKED-MAP-METHOD", 3, 0, false);
        declareFunction("new_map_backed_map_with_same_properties", "NEW-MAP-BACKED-MAP-WITH-SAME-PROPERTIES", 3, 0, false);
        declareFunction("new_map_object_iterator_backed_map_method", "NEW-MAP-OBJECT-ITERATOR-BACKED-MAP-METHOD", 1, 0, false);
        declareFunction("new_map_backed_map_iterator", "NEW-MAP-BACKED-MAP-ITERATOR", 1, 0, false);
        declareFunction("new_map_backed_map_iterator_state", "NEW-MAP-BACKED-MAP-ITERATOR-STATE", 1, 0, false);
        declareFunction("map_backed_map_iterator_done", "MAP-BACKED-MAP-ITERATOR-DONE", 1, 0, false);
        declareFunction("map_backed_map_iterator_next", "MAP-BACKED-MAP-ITERATOR-NEXT", 1, 0, false);
        declareFunction("map_object_arbitrary_key_backed_map_method", "MAP-OBJECT-ARBITRARY-KEY-BACKED-MAP-METHOD", 1, 0, false);
        declareFunction("map_backed_map_arbitrary_key", "MAP-BACKED-MAP-ARBITRARY-KEY", 1, 0, false);
        declareFunction("swap_out_all_pristine_backed_map_objects", "SWAP-OUT-ALL-PRISTINE-BACKED-MAP-OBJECTS", 1, 0, false);
        declareFunction("get_backed_map_non_pristine_object_count", "GET-BACKED-MAP-NON-PRISTINE-OBJECT-COUNT", 1, 0, false);
        declareFunction("test_file_vector_backed_map_with_alist", "TEST-FILE-VECTOR-BACKED-MAP-WITH-ALIST", 1, 1, false);
        declareFunction("test_file_vector_backed_map", "TEST-FILE-VECTOR-BACKED-MAP", 1, 1, false);
        declareFunction("test_enforce_map_specific_cache_ratios", "TEST-ENFORCE-MAP-SPECIFIC-CACHE-RATIOS", 3, 0, false);
        declareFunction("test_map_to_file_vector_backed_map_conversion_with_alist", "TEST-MAP-TO-FILE-VECTOR-BACKED-MAP-CONVERSION-WITH-ALIST", 1, 1, false);
        declareFunction("test_map_to_file_vector_backed_map_conversion", "TEST-MAP-TO-FILE-VECTOR-BACKED-MAP-CONVERSION", 1, 1, false);
        return NIL;
    }

    public static SubLObject declare_file_vector_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("create_file_backing_for_map", "CREATE-FILE-BACKING-FOR-MAP", 3, 0, false);
            declareFunction("create_file_vector_backing_for_map", "CREATE-FILE-VECTOR-BACKING-FOR-MAP", 2, 0, false);
            declareFunction("write_file_vector_backing_map_prologue", "WRITE-FILE-VECTOR-BACKING-MAP-PROLOGUE", 2, 0, false);
            declareFunction("write_file_vector_backing_map_entry", "WRITE-FILE-VECTOR-BACKING-MAP-ENTRY", 3, 0, false);
            declareFunction("write_file_vector_backing_map_entry_key", "WRITE-FILE-VECTOR-BACKING-MAP-ENTRY-KEY", 2, 0, false);
            declareFunction("write_file_vector_backing_map_entry_value", "WRITE-FILE-VECTOR-BACKING-MAP-ENTRY-VALUE", 2, 1, false);
            declareFunction("write_file_vector_backing_map_prologue_to_data_stream", "WRITE-FILE-VECTOR-BACKING-MAP-PROLOGUE-TO-DATA-STREAM", 2, 0, false);
            declareFunction("create_file_backing_for_maps", "CREATE-FILE-BACKING-FOR-MAPS", 3, 0, false);
            declareFunction("create_file_vector_backing_for_maps", "CREATE-FILE-VECTOR-BACKING-FOR-MAPS", 2, 0, false);
            declareFunction("file_vector_reference_print_function_trampoline", "FILE-VECTOR-REFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("file_vector_reference_p", "FILE-VECTOR-REFERENCE-P", 1, 0, false);
            new file_vector_utilities.$file_vector_reference_p$UnaryFunction();
            declareFunction("fvector_ref_index", "FVECTOR-REF-INDEX", 1, 0, false);
            declareFunction("fvector_ref_payload", "FVECTOR-REF-PAYLOAD", 1, 0, false);
            declareFunction("_csetf_fvector_ref_index", "_CSETF-FVECTOR-REF-INDEX", 2, 0, false);
            declareFunction("_csetf_fvector_ref_payload", "_CSETF-FVECTOR-REF-PAYLOAD", 2, 0, false);
            declareFunction("make_file_vector_reference", "MAKE-FILE-VECTOR-REFERENCE", 0, 1, false);
            declareFunction("visit_defstruct_file_vector_reference", "VISIT-DEFSTRUCT-FILE-VECTOR-REFERENCE", 2, 0, false);
            declareFunction("visit_defstruct_object_file_vector_reference_method", "VISIT-DEFSTRUCT-OBJECT-FILE-VECTOR-REFERENCE-METHOD", 2, 0, false);
            declareFunction("print_fvector_ref", "PRINT-FVECTOR-REF", 3, 0, false);
            declareFunction("new_file_vector_reference", "NEW-FILE-VECTOR-REFERENCE", 1, 0, false);
            declareFunction("new_file_vector_reference_wX_payload", "NEW-FILE-VECTOR-REFERENCE-W/-PAYLOAD", 2, 0, false);
            declareFunction("file_vector_reference_index", "FILE-VECTOR-REFERENCE-INDEX", 1, 0, false);
            declareFunction("mark_file_vector_reference_as_mutated", "MARK-FILE-VECTOR-REFERENCE-AS-MUTATED", 1, 0, false);
            declareFunction("recover_mutated_file_vector_reference", "RECOVER-MUTATED-FILE-VECTOR-REFERENCE", 1, 0, false);
            declareFunction("restore_file_vector_reference", "RESTORE-FILE-VECTOR-REFERENCE", 1, 0, false);
            declareFunction("set_file_vector_reference_referenced_object", "SET-FILE-VECTOR-REFERENCE-REFERENCED-OBJECT", 2, 0, false);
            declareFunction("clear_file_vector_reference_referenced_object", "CLEAR-FILE-VECTOR-REFERENCE-REFERENCED-OBJECT", 1, 0, false);
            declareFunction("file_vector_reference_referenced_object", "FILE-VECTOR-REFERENCE-REFERENCED-OBJECT", 1, 0, false);
            declareFunction("mark_file_vector_reference_as_deleted", "MARK-FILE-VECTOR-REFERENCE-AS-DELETED", 1, 0, false);
            declareFunction("fvector_ref_payload_in_memory_p", "FVECTOR-REF-PAYLOAD-IN-MEMORY-P", 1, 0, false);
            declareFunction("fvector_ref_valid_index_p", "FVECTOR-REF-VALID-INDEX-P", 1, 0, false);
            declareFunction("fvector_ref_has_valid_index_p", "FVECTOR-REF-HAS-VALID-INDEX-P", 1, 0, false);
            declareFunction("fvector_ref_mutated_index_p", "FVECTOR-REF-MUTATED-INDEX-P", 1, 0, false);
            declareFunction("fvector_ref_has_mutated_index_p", "FVECTOR-REF-HAS-MUTATED-INDEX-P", 1, 0, false);
            declareFunction("file_vector_reference_swapped_outP", "FILE-VECTOR-REFERENCE-SWAPPED-OUT?", 1, 0, false);
            declareFunction("file_vector_reference_present_pristineP", "FILE-VECTOR-REFERENCE-PRESENT-PRISTINE?", 1, 0, false);
            declareFunction("file_vector_reference_present_mutatedP", "FILE-VECTOR-REFERENCE-PRESENT-MUTATED?", 1, 0, false);
            declareFunction("file_vector_reference_deletedP", "FILE-VECTOR-REFERENCE-DELETED?", 1, 0, false);
            declareFunction("file_vector_reference_status", "FILE-VECTOR-REFERENCE-STATUS", 1, 0, false);
            declareFunction("file_vector_reference_presentP", "FILE-VECTOR-REFERENCE-PRESENT?", 1, 0, false);
            declareFunction("cfasl_input_file_vector_reference", "CFASL-INPUT-FILE-VECTOR-REFERENCE", 1, 0, false);
            declareFunction("cfasl_output_file_vector_reference", "CFASL-OUTPUT-FILE-VECTOR-REFERENCE", 2, 0, false);
            declareFunction("cfasl_output_object_file_vector_reference_method", "CFASL-OUTPUT-OBJECT-FILE-VECTOR-REFERENCE-METHOD", 2, 0, false);
            declareFunction("stamp_file_vector_for_references", "STAMP-FILE-VECTOR-FOR-REFERENCES", 1, 2, false);
            declareMacro("with_potential_file_vector_backed_map_lock", "WITH-POTENTIAL-FILE-VECTOR-BACKED-MAP-LOCK");
            declareMacro("with_file_vector_backed_map_stream_lock", "WITH-FILE-VECTOR-BACKED-MAP-STREAM-LOCK");
            declareFunction("new_file_vector_backed_map", "NEW-FILE-VECTOR-BACKED-MAP", 1, 3, false);
            declareFunction("load_file_vector_backed_map", "LOAD-FILE-VECTOR-BACKED-MAP", 2, 0, false);
            declareFunction("load_one_file_vector_backed_map", "LOAD-ONE-FILE-VECTOR-BACKED-MAP", 1, 1, false);
            declareFunction("load_file_vector_backed_maps", "LOAD-FILE-VECTOR-BACKED-MAPS", 2, 0, false);
            declareFunction("file_vector_backed_map_get", "FILE-VECTOR-BACKED-MAP-GET", 3, 1, false);
            declareFunction("file_vector_backed_map_wX_cache_get", "FILE-VECTOR-BACKED-MAP-W/-CACHE-GET", 4, 1, false);
            declareFunction("file_vector_backed_map_put", "FILE-VECTOR-BACKED-MAP-PUT", 3, 0, false);
            declareFunction("file_vector_backed_map_wX_cache_put", "FILE-VECTOR-BACKED-MAP-W/-CACHE-PUT", 4, 0, false);
            declareFunction("file_vector_backed_map_remove", "FILE-VECTOR-BACKED-MAP-REMOVE", 2, 1, false);
            declareFunction("file_vector_backed_map_wX_cache_remove", "FILE-VECTOR-BACKED-MAP-W/-CACHE-REMOVE", 3, 1, false);
            declareFunction("file_vector_backed_map_touch", "FILE-VECTOR-BACKED-MAP-TOUCH", 2, 1, false);
            declareFunction("file_vector_backed_map_wX_cache_touch", "FILE-VECTOR-BACKED-MAP-W/-CACHE-TOUCH", 3, 1, false);
            declareFunction("undo_change_to_file_vector_backed_map", "UNDO-CHANGE-TO-FILE-VECTOR-BACKED-MAP", 2, 0, false);
            declareFunction("undo_change_to_file_vector_backed_map_wX_cache", "UNDO-CHANGE-TO-FILE-VECTOR-BACKED-MAP-W/-CACHE", 3, 0, false);
            declareMacro("do_file_vector_backed_map", "DO-FILE-VECTOR-BACKED-MAP");
            declareFunction("new_file_vector_backed_map_iterator", "NEW-FILE-VECTOR-BACKED-MAP-ITERATOR", 2, 2, false);
            declareFunction("new_file_vector_backed_map_iterator_state", "NEW-FILE-VECTOR-BACKED-MAP-ITERATOR-STATE", 4, 0, false);
            declareFunction("file_vector_backed_map_iterator_done", "FILE-VECTOR-BACKED-MAP-ITERATOR-DONE", 1, 0, false);
            declareFunction("file_vector_backed_map_iterator_next", "FILE-VECTOR-BACKED-MAP-ITERATOR-NEXT", 1, 0, false);
            declareFunction("file_vector_backed_map_cache_ratio", "FILE-VECTOR-BACKED-MAP-CACHE-RATIO", 1, 0, false);
            declareFunction("swap_out_all_pristine_file_vector_backed_map_objects", "SWAP-OUT-ALL-PRISTINE-FILE-VECTOR-BACKED-MAP-OBJECTS", 1, 0, false);
            declareFunction("swap_out_pristine_file_vector_backed_map_object", "SWAP-OUT-PRISTINE-FILE-VECTOR-BACKED-MAP-OBJECT", 2, 0, false);
            declareFunction("potentially_swap_out_pristine_file_vector_backed_map_object", "POTENTIALLY-SWAP-OUT-PRISTINE-FILE-VECTOR-BACKED-MAP-OBJECT", 1, 0, false);
            declareFunction("compact_file_vector_backed_map_representation", "COMPACT-FILE-VECTOR-BACKED-MAP-REPRESENTATION", 1, 0, false);
            declareFunction("file_vector_index_from_map_element_number", "FILE-VECTOR-INDEX-FROM-MAP-ELEMENT-NUMBER", 1, 0, false);
            declareFunction("file_vector_value_index_from_key_index", "FILE-VECTOR-VALUE-INDEX-FROM-KEY-INDEX", 1, 0, false);
            declareFunction("map_size_from_file_vector_length", "MAP-SIZE-FROM-FILE-VECTOR-LENGTH", 1, 0, false);
            declareFunction("file_vector_backed_map_read_key", "FILE-VECTOR-BACKED-MAP-READ-KEY", 1, 0, false);
            declareFunction("file_vector_backed_map_read_value", "FILE-VECTOR-BACKED-MAP-READ-VALUE", 1, 0, false);
            declareFunction("convert_map_to_file_vector_backed_map", "CONVERT-MAP-TO-FILE-VECTOR-BACKED-MAP", 2, 2, false);
            declareFunction("create_file_vector_backed_map_from_map", "CREATE-FILE-VECTOR-BACKED-MAP-FROM-MAP", 2, 2, false);
            declareFunction("populate_file_vector_backed_map_from_map", "POPULATE-FILE-VECTOR-BACKED-MAP-FROM-MAP", 3, 2, false);
            declareFunction("build_file_vector_backed_map_from_map", "BUILD-FILE-VECTOR-BACKED-MAP-FROM-MAP", 3, 2, false);
            declareFunction("upgrade_map_to_file_vector_backed_map", "UPGRADE-MAP-TO-FILE-VECTOR-BACKED-MAP", 2, 1, false);
            declareFunction("file_vector_indexical_p", "FILE-VECTOR-INDEXICAL-P", 1, 0, false);
            declareFunction("register_indexical_file_vector_reference", "REGISTER-INDEXICAL-FILE-VECTOR-REFERENCE", 2, 0, false);
            declareFunction("dereference_file_vector_indexical", "DEREFERENCE-FILE-VECTOR-INDEXICAL", 1, 1, false);
            declareFunction("dereference_file_vector_indexical_lock", "DEREFERENCE-FILE-VECTOR-INDEXICAL-LOCK", 1, 1, false);
            declareFunction("backed_map_print_function_trampoline", "BACKED-MAP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("backed_map_p", "BACKED-MAP-P", 1, 0, false);
            new file_vector_utilities.$backed_map_p$UnaryFunction();
            declareFunction("backed_map_map", "BACKED-MAP-MAP", 1, 0, false);
            declareFunction("backed_map_fvector", "BACKED-MAP-FVECTOR", 1, 0, false);
            declareFunction("backed_map_common_symbols", "BACKED-MAP-COMMON-SYMBOLS", 1, 0, false);
            declareFunction("_csetf_backed_map_map", "_CSETF-BACKED-MAP-MAP", 2, 0, false);
            declareFunction("_csetf_backed_map_fvector", "_CSETF-BACKED-MAP-FVECTOR", 2, 0, false);
            declareFunction("_csetf_backed_map_common_symbols", "_CSETF-BACKED-MAP-COMMON-SYMBOLS", 2, 0, false);
            declareFunction("make_backed_map", "MAKE-BACKED-MAP", 0, 1, false);
            declareFunction("visit_defstruct_backed_map", "VISIT-DEFSTRUCT-BACKED-MAP", 2, 0, false);
            declareFunction("visit_defstruct_object_backed_map_method", "VISIT-DEFSTRUCT-OBJECT-BACKED-MAP-METHOD", 2, 0, false);
            declareFunction("new_backed_map", "NEW-BACKED-MAP", 2, 1, false);
            declareFunction("new_backed_map_from_files", "NEW-BACKED-MAP-FROM-FILES", 3, 1, false);
            declareMacro("with_backed_map_common_symbols", "WITH-BACKED-MAP-COMMON-SYMBOLS");
            declareFunction("print_backed_map", "PRINT-BACKED-MAP", 3, 0, false);
            declareFunction("new_future_backed_map", "NEW-FUTURE-BACKED-MAP", 1, 0, false);
            declareFunction("new_indexical_backed_map", "NEW-INDEXICAL-BACKED-MAP", 2, 0, false);
            declareFunction("reconnect_backed_map", "RECONNECT-BACKED-MAP", 2, 1, false);
            declareFunction("reconnect_backed_map_based_on_backed_map", "RECONNECT-BACKED-MAP-BASED-ON-BACKED-MAP", 2, 0, false);
            declareFunction("get_backed_map_file_vector", "GET-BACKED-MAP-FILE-VECTOR", 1, 0, false);
            declareFunction("get_backed_map_file_vector_lock", "GET-BACKED-MAP-FILE-VECTOR-LOCK", 1, 0, false);
            declareFunction("cfasl_input_backed_map", "CFASL-INPUT-BACKED-MAP", 1, 0, false);
            declareFunction("cfasl_output_backed_map", "CFASL-OUTPUT-BACKED-MAP", 2, 0, false);
            declareFunction("cfasl_output_object_backed_map_method", "CFASL-OUTPUT-OBJECT-BACKED-MAP-METHOD", 2, 0, false);
            declareMacro("with_backed_map_cache_strategy", "WITH-BACKED-MAP-CACHE-STRATEGY");
            declareFunction("backed_map_cache_strategy", "BACKED-MAP-CACHE-STRATEGY", 0, 0, false);
            declareFunction("is_map_object_p_backed_map_method", "IS-MAP-OBJECT-P-BACKED-MAP-METHOD", 1, 0, false);
            declareFunction("map_object_size_backed_map_method", "MAP-OBJECT-SIZE-BACKED-MAP-METHOD", 1, 0, false);
            declareFunction("map_backed_map_size", "MAP-BACKED-MAP-SIZE", 1, 0, false);
            declareFunction("map_object_test_backed_map_method", "MAP-OBJECT-TEST-BACKED-MAP-METHOD", 1, 0, false);
            declareFunction("map_backed_map_test", "MAP-BACKED-MAP-TEST", 1, 0, false);
            declareFunction("map_object_put_backed_map_method", "MAP-OBJECT-PUT-BACKED-MAP-METHOD", 3, 0, false);
            declareFunction("map_backed_map_put", "MAP-BACKED-MAP-PUT", 3, 0, false);
            declareFunction("map_object_get_backed_map_method", "MAP-OBJECT-GET-BACKED-MAP-METHOD", 3, 0, false);
            declareFunction("map_backed_map_get", "MAP-BACKED-MAP-GET", 3, 0, false);
            declareFunction("map_object_get_without_values_backed_map_method", "MAP-OBJECT-GET-WITHOUT-VALUES-BACKED-MAP-METHOD", 3, 0, false);
            declareFunction("map_backed_map_get_without_values", "MAP-BACKED-MAP-GET-WITHOUT-VALUES", 3, 0, false);
            declareFunction("map_object_remove_backed_map_method", "MAP-OBJECT-REMOVE-BACKED-MAP-METHOD", 2, 0, false);
            declareFunction("map_backed_map_remove", "MAP-BACKED-MAP-REMOVE", 2, 0, false);
            declareFunction("map_object_remove_all_backed_map_method", "MAP-OBJECT-REMOVE-ALL-BACKED-MAP-METHOD", 1, 0, false);
            declareFunction("map_backed_map_remove_all", "MAP-BACKED-MAP-REMOVE-ALL", 1, 0, false);
            declareFunction("map_object_touch_backed_map_method", "MAP-OBJECT-TOUCH-BACKED-MAP-METHOD", 2, 0, false);
            declareFunction("map_backed_map_touch", "MAP-BACKED-MAP-TOUCH", 2, 0, false);
            declareFunction("map_object_change_set_backed_map_method", "MAP-OBJECT-CHANGE-SET-BACKED-MAP-METHOD", 1, 1, false);
            declareFunction("map_backed_map_change_set", "MAP-BACKED-MAP-CHANGE-SET", 2, 0, false);
            declareFunction("new_map_object_with_same_properties_backed_map_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-BACKED-MAP-METHOD", 3, 0, false);
            declareFunction("new_map_backed_map_with_same_properties", "NEW-MAP-BACKED-MAP-WITH-SAME-PROPERTIES", 3, 0, false);
            declareFunction("new_map_object_iterator_backed_map_method", "NEW-MAP-OBJECT-ITERATOR-BACKED-MAP-METHOD", 1, 0, false);
            declareFunction("new_map_backed_map_iterator", "NEW-MAP-BACKED-MAP-ITERATOR", 1, 0, false);
            declareFunction("new_map_backed_map_iterator_state", "NEW-MAP-BACKED-MAP-ITERATOR-STATE", 1, 0, false);
            declareFunction("map_backed_map_iterator_done", "MAP-BACKED-MAP-ITERATOR-DONE", 1, 0, false);
            declareFunction("map_backed_map_iterator_next", "MAP-BACKED-MAP-ITERATOR-NEXT", 1, 0, false);
            declareFunction("map_object_arbitrary_key_backed_map_method", "MAP-OBJECT-ARBITRARY-KEY-BACKED-MAP-METHOD", 1, 0, false);
            declareFunction("map_backed_map_arbitrary_key", "MAP-BACKED-MAP-ARBITRARY-KEY", 1, 0, false);
            declareFunction("swap_out_all_pristine_backed_map_objects", "SWAP-OUT-ALL-PRISTINE-BACKED-MAP-OBJECTS", 1, 0, false);
            declareFunction("get_backed_map_non_pristine_object_count", "GET-BACKED-MAP-NON-PRISTINE-OBJECT-COUNT", 1, 0, false);
            declareFunction("test_file_vector_backed_map_with_alist", "TEST-FILE-VECTOR-BACKED-MAP-WITH-ALIST", 1, 1, false);
            declareFunction("test_file_vector_backed_map", "TEST-FILE-VECTOR-BACKED-MAP", 1, 1, false);
            declareFunction("test_enforce_map_specific_cache_ratios", "TEST-ENFORCE-MAP-SPECIFIC-CACHE-RATIOS", 3, 0, false);
            declareFunction("test_map_to_file_vector_backed_map_conversion_with_alist", "TEST-MAP-TO-FILE-VECTOR-BACKED-MAP-CONVERSION-WITH-ALIST", 1, 1, false);
            declareFunction("test_map_to_file_vector_backed_map_conversion", "TEST-MAP-TO-FILE-VECTOR-BACKED-MAP-CONVERSION", 1, 1, false);
            declareFunction("segment_file_vector_data_stream", "SEGMENT-FILE-VECTOR-DATA-STREAM", 1, 2, false);
            declareFunction("inspect_file_vector_data_record", "INSPECT-FILE-VECTOR-DATA-RECORD", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareMacro("with_potential_data_stream_lock", "WITH-POTENTIAL-DATA-STREAM-LOCK");
            declareFunction("convert_map_to_file_vector_backed_map", "CONVERT-MAP-TO-FILE-VECTOR-BACKED-MAP", 2, 1, false);
            declareFunction("create_file_vector_backed_map_from_map", "CREATE-FILE-VECTOR-BACKED-MAP-FROM-MAP", 2, 1, false);
            declareFunction("populate_file_vector_backed_map_from_map", "POPULATE-FILE-VECTOR-BACKED-MAP-FROM-MAP", 3, 1, false);
            declareFunction("build_file_vector_backed_map_from_map", "BUILD-FILE-VECTOR-BACKED-MAP-FROM-MAP", 3, 1, false);
        }
        return NIL;
    }

    public static SubLObject declare_file_vector_utilities_file_Previous() {
        declareFunction("create_file_backing_for_map", "CREATE-FILE-BACKING-FOR-MAP", 3, 0, false);
        declareFunction("create_file_vector_backing_for_map", "CREATE-FILE-VECTOR-BACKING-FOR-MAP", 2, 0, false);
        declareFunction("write_file_vector_backing_map_prologue", "WRITE-FILE-VECTOR-BACKING-MAP-PROLOGUE", 2, 0, false);
        declareFunction("write_file_vector_backing_map_entry", "WRITE-FILE-VECTOR-BACKING-MAP-ENTRY", 3, 0, false);
        declareFunction("write_file_vector_backing_map_entry_key", "WRITE-FILE-VECTOR-BACKING-MAP-ENTRY-KEY", 2, 0, false);
        declareFunction("write_file_vector_backing_map_entry_value", "WRITE-FILE-VECTOR-BACKING-MAP-ENTRY-VALUE", 2, 1, false);
        declareFunction("write_file_vector_backing_map_prologue_to_data_stream", "WRITE-FILE-VECTOR-BACKING-MAP-PROLOGUE-TO-DATA-STREAM", 2, 0, false);
        declareFunction("create_file_backing_for_maps", "CREATE-FILE-BACKING-FOR-MAPS", 3, 0, false);
        declareFunction("create_file_vector_backing_for_maps", "CREATE-FILE-VECTOR-BACKING-FOR-MAPS", 2, 0, false);
        declareFunction("file_vector_reference_print_function_trampoline", "FILE-VECTOR-REFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("file_vector_reference_p", "FILE-VECTOR-REFERENCE-P", 1, 0, false);
        new file_vector_utilities.$file_vector_reference_p$UnaryFunction();
        declareFunction("fvector_ref_index", "FVECTOR-REF-INDEX", 1, 0, false);
        declareFunction("fvector_ref_payload", "FVECTOR-REF-PAYLOAD", 1, 0, false);
        declareFunction("_csetf_fvector_ref_index", "_CSETF-FVECTOR-REF-INDEX", 2, 0, false);
        declareFunction("_csetf_fvector_ref_payload", "_CSETF-FVECTOR-REF-PAYLOAD", 2, 0, false);
        declareFunction("make_file_vector_reference", "MAKE-FILE-VECTOR-REFERENCE", 0, 1, false);
        declareFunction("visit_defstruct_file_vector_reference", "VISIT-DEFSTRUCT-FILE-VECTOR-REFERENCE", 2, 0, false);
        declareFunction("visit_defstruct_object_file_vector_reference_method", "VISIT-DEFSTRUCT-OBJECT-FILE-VECTOR-REFERENCE-METHOD", 2, 0, false);
        declareFunction("print_fvector_ref", "PRINT-FVECTOR-REF", 3, 0, false);
        declareFunction("new_file_vector_reference", "NEW-FILE-VECTOR-REFERENCE", 1, 0, false);
        declareFunction("new_file_vector_reference_wX_payload", "NEW-FILE-VECTOR-REFERENCE-W/-PAYLOAD", 2, 0, false);
        declareFunction("file_vector_reference_index", "FILE-VECTOR-REFERENCE-INDEX", 1, 0, false);
        declareFunction("mark_file_vector_reference_as_mutated", "MARK-FILE-VECTOR-REFERENCE-AS-MUTATED", 1, 0, false);
        declareFunction("recover_mutated_file_vector_reference", "RECOVER-MUTATED-FILE-VECTOR-REFERENCE", 1, 0, false);
        declareFunction("restore_file_vector_reference", "RESTORE-FILE-VECTOR-REFERENCE", 1, 0, false);
        declareFunction("set_file_vector_reference_referenced_object", "SET-FILE-VECTOR-REFERENCE-REFERENCED-OBJECT", 2, 0, false);
        declareFunction("clear_file_vector_reference_referenced_object", "CLEAR-FILE-VECTOR-REFERENCE-REFERENCED-OBJECT", 1, 0, false);
        declareFunction("file_vector_reference_referenced_object", "FILE-VECTOR-REFERENCE-REFERENCED-OBJECT", 1, 0, false);
        declareFunction("mark_file_vector_reference_as_deleted", "MARK-FILE-VECTOR-REFERENCE-AS-DELETED", 1, 0, false);
        declareFunction("fvector_ref_payload_in_memory_p", "FVECTOR-REF-PAYLOAD-IN-MEMORY-P", 1, 0, false);
        declareFunction("fvector_ref_valid_index_p", "FVECTOR-REF-VALID-INDEX-P", 1, 0, false);
        declareFunction("fvector_ref_has_valid_index_p", "FVECTOR-REF-HAS-VALID-INDEX-P", 1, 0, false);
        declareFunction("fvector_ref_mutated_index_p", "FVECTOR-REF-MUTATED-INDEX-P", 1, 0, false);
        declareFunction("fvector_ref_has_mutated_index_p", "FVECTOR-REF-HAS-MUTATED-INDEX-P", 1, 0, false);
        declareFunction("file_vector_reference_swapped_outP", "FILE-VECTOR-REFERENCE-SWAPPED-OUT?", 1, 0, false);
        declareFunction("file_vector_reference_present_pristineP", "FILE-VECTOR-REFERENCE-PRESENT-PRISTINE?", 1, 0, false);
        declareFunction("file_vector_reference_present_mutatedP", "FILE-VECTOR-REFERENCE-PRESENT-MUTATED?", 1, 0, false);
        declareFunction("file_vector_reference_deletedP", "FILE-VECTOR-REFERENCE-DELETED?", 1, 0, false);
        declareFunction("file_vector_reference_status", "FILE-VECTOR-REFERENCE-STATUS", 1, 0, false);
        declareFunction("file_vector_reference_presentP", "FILE-VECTOR-REFERENCE-PRESENT?", 1, 0, false);
        declareFunction("cfasl_input_file_vector_reference", "CFASL-INPUT-FILE-VECTOR-REFERENCE", 1, 0, false);
        declareFunction("cfasl_output_file_vector_reference", "CFASL-OUTPUT-FILE-VECTOR-REFERENCE", 2, 0, false);
        declareFunction("cfasl_output_object_file_vector_reference_method", "CFASL-OUTPUT-OBJECT-FILE-VECTOR-REFERENCE-METHOD", 2, 0, false);
        declareFunction("stamp_file_vector_for_references", "STAMP-FILE-VECTOR-FOR-REFERENCES", 1, 2, false);
        declareMacro("with_potential_file_vector_backed_map_lock", "WITH-POTENTIAL-FILE-VECTOR-BACKED-MAP-LOCK");
        declareMacro("with_file_vector_backed_map_stream_lock", "WITH-FILE-VECTOR-BACKED-MAP-STREAM-LOCK");
        declareFunction("new_file_vector_backed_map", "NEW-FILE-VECTOR-BACKED-MAP", 1, 3, false);
        declareFunction("load_file_vector_backed_map", "LOAD-FILE-VECTOR-BACKED-MAP", 2, 0, false);
        declareFunction("load_one_file_vector_backed_map", "LOAD-ONE-FILE-VECTOR-BACKED-MAP", 1, 1, false);
        declareFunction("load_file_vector_backed_maps", "LOAD-FILE-VECTOR-BACKED-MAPS", 2, 0, false);
        declareFunction("file_vector_backed_map_get", "FILE-VECTOR-BACKED-MAP-GET", 3, 1, false);
        declareFunction("file_vector_backed_map_wX_cache_get", "FILE-VECTOR-BACKED-MAP-W/-CACHE-GET", 4, 1, false);
        declareFunction("file_vector_backed_map_put", "FILE-VECTOR-BACKED-MAP-PUT", 3, 0, false);
        declareFunction("file_vector_backed_map_wX_cache_put", "FILE-VECTOR-BACKED-MAP-W/-CACHE-PUT", 4, 0, false);
        declareFunction("file_vector_backed_map_remove", "FILE-VECTOR-BACKED-MAP-REMOVE", 2, 1, false);
        declareFunction("file_vector_backed_map_wX_cache_remove", "FILE-VECTOR-BACKED-MAP-W/-CACHE-REMOVE", 3, 1, false);
        declareFunction("file_vector_backed_map_touch", "FILE-VECTOR-BACKED-MAP-TOUCH", 2, 1, false);
        declareFunction("file_vector_backed_map_wX_cache_touch", "FILE-VECTOR-BACKED-MAP-W/-CACHE-TOUCH", 3, 1, false);
        declareFunction("undo_change_to_file_vector_backed_map", "UNDO-CHANGE-TO-FILE-VECTOR-BACKED-MAP", 2, 0, false);
        declareFunction("undo_change_to_file_vector_backed_map_wX_cache", "UNDO-CHANGE-TO-FILE-VECTOR-BACKED-MAP-W/-CACHE", 3, 0, false);
        declareMacro("do_file_vector_backed_map", "DO-FILE-VECTOR-BACKED-MAP");
        declareFunction("new_file_vector_backed_map_iterator", "NEW-FILE-VECTOR-BACKED-MAP-ITERATOR", 2, 2, false);
        declareFunction("new_file_vector_backed_map_iterator_state", "NEW-FILE-VECTOR-BACKED-MAP-ITERATOR-STATE", 4, 0, false);
        declareFunction("file_vector_backed_map_iterator_done", "FILE-VECTOR-BACKED-MAP-ITERATOR-DONE", 1, 0, false);
        declareFunction("file_vector_backed_map_iterator_next", "FILE-VECTOR-BACKED-MAP-ITERATOR-NEXT", 1, 0, false);
        declareFunction("file_vector_backed_map_cache_ratio", "FILE-VECTOR-BACKED-MAP-CACHE-RATIO", 1, 0, false);
        declareFunction("swap_out_all_pristine_file_vector_backed_map_objects", "SWAP-OUT-ALL-PRISTINE-FILE-VECTOR-BACKED-MAP-OBJECTS", 1, 0, false);
        declareFunction("swap_out_pristine_file_vector_backed_map_object", "SWAP-OUT-PRISTINE-FILE-VECTOR-BACKED-MAP-OBJECT", 2, 0, false);
        declareFunction("potentially_swap_out_pristine_file_vector_backed_map_object", "POTENTIALLY-SWAP-OUT-PRISTINE-FILE-VECTOR-BACKED-MAP-OBJECT", 1, 0, false);
        declareFunction("compact_file_vector_backed_map_representation", "COMPACT-FILE-VECTOR-BACKED-MAP-REPRESENTATION", 1, 0, false);
        declareFunction("file_vector_index_from_map_element_number", "FILE-VECTOR-INDEX-FROM-MAP-ELEMENT-NUMBER", 1, 0, false);
        declareFunction("file_vector_value_index_from_key_index", "FILE-VECTOR-VALUE-INDEX-FROM-KEY-INDEX", 1, 0, false);
        declareFunction("map_size_from_file_vector_length", "MAP-SIZE-FROM-FILE-VECTOR-LENGTH", 1, 0, false);
        declareFunction("file_vector_backed_map_read_key", "FILE-VECTOR-BACKED-MAP-READ-KEY", 1, 0, false);
        declareFunction("file_vector_backed_map_read_value", "FILE-VECTOR-BACKED-MAP-READ-VALUE", 1, 0, false);
        declareFunction("convert_map_to_file_vector_backed_map", "CONVERT-MAP-TO-FILE-VECTOR-BACKED-MAP", 2, 2, false);
        declareFunction("create_file_vector_backed_map_from_map", "CREATE-FILE-VECTOR-BACKED-MAP-FROM-MAP", 2, 2, false);
        declareFunction("populate_file_vector_backed_map_from_map", "POPULATE-FILE-VECTOR-BACKED-MAP-FROM-MAP", 3, 2, false);
        declareFunction("build_file_vector_backed_map_from_map", "BUILD-FILE-VECTOR-BACKED-MAP-FROM-MAP", 3, 2, false);
        declareFunction("upgrade_map_to_file_vector_backed_map", "UPGRADE-MAP-TO-FILE-VECTOR-BACKED-MAP", 2, 1, false);
        declareFunction("file_vector_indexical_p", "FILE-VECTOR-INDEXICAL-P", 1, 0, false);
        declareFunction("register_indexical_file_vector_reference", "REGISTER-INDEXICAL-FILE-VECTOR-REFERENCE", 2, 0, false);
        declareFunction("dereference_file_vector_indexical", "DEREFERENCE-FILE-VECTOR-INDEXICAL", 1, 1, false);
        declareFunction("dereference_file_vector_indexical_lock", "DEREFERENCE-FILE-VECTOR-INDEXICAL-LOCK", 1, 1, false);
        declareFunction("backed_map_print_function_trampoline", "BACKED-MAP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("backed_map_p", "BACKED-MAP-P", 1, 0, false);
        new file_vector_utilities.$backed_map_p$UnaryFunction();
        declareFunction("backed_map_map", "BACKED-MAP-MAP", 1, 0, false);
        declareFunction("backed_map_fvector", "BACKED-MAP-FVECTOR", 1, 0, false);
        declareFunction("backed_map_common_symbols", "BACKED-MAP-COMMON-SYMBOLS", 1, 0, false);
        declareFunction("_csetf_backed_map_map", "_CSETF-BACKED-MAP-MAP", 2, 0, false);
        declareFunction("_csetf_backed_map_fvector", "_CSETF-BACKED-MAP-FVECTOR", 2, 0, false);
        declareFunction("_csetf_backed_map_common_symbols", "_CSETF-BACKED-MAP-COMMON-SYMBOLS", 2, 0, false);
        declareFunction("make_backed_map", "MAKE-BACKED-MAP", 0, 1, false);
        declareFunction("visit_defstruct_backed_map", "VISIT-DEFSTRUCT-BACKED-MAP", 2, 0, false);
        declareFunction("visit_defstruct_object_backed_map_method", "VISIT-DEFSTRUCT-OBJECT-BACKED-MAP-METHOD", 2, 0, false);
        declareFunction("new_backed_map", "NEW-BACKED-MAP", 2, 1, false);
        declareFunction("new_backed_map_from_files", "NEW-BACKED-MAP-FROM-FILES", 3, 1, false);
        declareMacro("with_backed_map_common_symbols", "WITH-BACKED-MAP-COMMON-SYMBOLS");
        declareFunction("print_backed_map", "PRINT-BACKED-MAP", 3, 0, false);
        declareFunction("new_future_backed_map", "NEW-FUTURE-BACKED-MAP", 1, 0, false);
        declareFunction("new_indexical_backed_map", "NEW-INDEXICAL-BACKED-MAP", 2, 0, false);
        declareFunction("reconnect_backed_map", "RECONNECT-BACKED-MAP", 2, 1, false);
        declareFunction("reconnect_backed_map_based_on_backed_map", "RECONNECT-BACKED-MAP-BASED-ON-BACKED-MAP", 2, 0, false);
        declareFunction("get_backed_map_file_vector", "GET-BACKED-MAP-FILE-VECTOR", 1, 0, false);
        declareFunction("get_backed_map_file_vector_lock", "GET-BACKED-MAP-FILE-VECTOR-LOCK", 1, 0, false);
        declareFunction("cfasl_input_backed_map", "CFASL-INPUT-BACKED-MAP", 1, 0, false);
        declareFunction("cfasl_output_backed_map", "CFASL-OUTPUT-BACKED-MAP", 2, 0, false);
        declareFunction("cfasl_output_object_backed_map_method", "CFASL-OUTPUT-OBJECT-BACKED-MAP-METHOD", 2, 0, false);
        declareMacro("with_backed_map_cache_strategy", "WITH-BACKED-MAP-CACHE-STRATEGY");
        declareFunction("backed_map_cache_strategy", "BACKED-MAP-CACHE-STRATEGY", 0, 0, false);
        declareFunction("is_map_object_p_backed_map_method", "IS-MAP-OBJECT-P-BACKED-MAP-METHOD", 1, 0, false);
        declareFunction("map_object_size_backed_map_method", "MAP-OBJECT-SIZE-BACKED-MAP-METHOD", 1, 0, false);
        declareFunction("map_backed_map_size", "MAP-BACKED-MAP-SIZE", 1, 0, false);
        declareFunction("map_object_test_backed_map_method", "MAP-OBJECT-TEST-BACKED-MAP-METHOD", 1, 0, false);
        declareFunction("map_backed_map_test", "MAP-BACKED-MAP-TEST", 1, 0, false);
        declareFunction("map_object_put_backed_map_method", "MAP-OBJECT-PUT-BACKED-MAP-METHOD", 3, 0, false);
        declareFunction("map_backed_map_put", "MAP-BACKED-MAP-PUT", 3, 0, false);
        declareFunction("map_object_get_backed_map_method", "MAP-OBJECT-GET-BACKED-MAP-METHOD", 3, 0, false);
        declareFunction("map_backed_map_get", "MAP-BACKED-MAP-GET", 3, 0, false);
        declareFunction("map_object_get_without_values_backed_map_method", "MAP-OBJECT-GET-WITHOUT-VALUES-BACKED-MAP-METHOD", 3, 0, false);
        declareFunction("map_backed_map_get_without_values", "MAP-BACKED-MAP-GET-WITHOUT-VALUES", 3, 0, false);
        declareFunction("map_object_remove_backed_map_method", "MAP-OBJECT-REMOVE-BACKED-MAP-METHOD", 2, 0, false);
        declareFunction("map_backed_map_remove", "MAP-BACKED-MAP-REMOVE", 2, 0, false);
        declareFunction("map_object_remove_all_backed_map_method", "MAP-OBJECT-REMOVE-ALL-BACKED-MAP-METHOD", 1, 0, false);
        declareFunction("map_backed_map_remove_all", "MAP-BACKED-MAP-REMOVE-ALL", 1, 0, false);
        declareFunction("map_object_touch_backed_map_method", "MAP-OBJECT-TOUCH-BACKED-MAP-METHOD", 2, 0, false);
        declareFunction("map_backed_map_touch", "MAP-BACKED-MAP-TOUCH", 2, 0, false);
        declareFunction("map_object_change_set_backed_map_method", "MAP-OBJECT-CHANGE-SET-BACKED-MAP-METHOD", 1, 1, false);
        declareFunction("map_backed_map_change_set", "MAP-BACKED-MAP-CHANGE-SET", 2, 0, false);
        declareFunction("new_map_object_with_same_properties_backed_map_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-BACKED-MAP-METHOD", 3, 0, false);
        declareFunction("new_map_backed_map_with_same_properties", "NEW-MAP-BACKED-MAP-WITH-SAME-PROPERTIES", 3, 0, false);
        declareFunction("new_map_object_iterator_backed_map_method", "NEW-MAP-OBJECT-ITERATOR-BACKED-MAP-METHOD", 1, 0, false);
        declareFunction("new_map_backed_map_iterator", "NEW-MAP-BACKED-MAP-ITERATOR", 1, 0, false);
        declareFunction("new_map_backed_map_iterator_state", "NEW-MAP-BACKED-MAP-ITERATOR-STATE", 1, 0, false);
        declareFunction("map_backed_map_iterator_done", "MAP-BACKED-MAP-ITERATOR-DONE", 1, 0, false);
        declareFunction("map_backed_map_iterator_next", "MAP-BACKED-MAP-ITERATOR-NEXT", 1, 0, false);
        declareFunction("map_object_arbitrary_key_backed_map_method", "MAP-OBJECT-ARBITRARY-KEY-BACKED-MAP-METHOD", 1, 0, false);
        declareFunction("map_backed_map_arbitrary_key", "MAP-BACKED-MAP-ARBITRARY-KEY", 1, 0, false);
        declareFunction("swap_out_all_pristine_backed_map_objects", "SWAP-OUT-ALL-PRISTINE-BACKED-MAP-OBJECTS", 1, 0, false);
        declareFunction("get_backed_map_non_pristine_object_count", "GET-BACKED-MAP-NON-PRISTINE-OBJECT-COUNT", 1, 0, false);
        declareFunction("test_file_vector_backed_map_with_alist", "TEST-FILE-VECTOR-BACKED-MAP-WITH-ALIST", 1, 1, false);
        declareFunction("test_file_vector_backed_map", "TEST-FILE-VECTOR-BACKED-MAP", 1, 1, false);
        declareFunction("test_enforce_map_specific_cache_ratios", "TEST-ENFORCE-MAP-SPECIFIC-CACHE-RATIOS", 3, 0, false);
        declareFunction("test_map_to_file_vector_backed_map_conversion_with_alist", "TEST-MAP-TO-FILE-VECTOR-BACKED-MAP-CONVERSION-WITH-ALIST", 1, 1, false);
        declareFunction("test_map_to_file_vector_backed_map_conversion", "TEST-MAP-TO-FILE-VECTOR-BACKED-MAP-CONVERSION", 1, 1, false);
        declareFunction("segment_file_vector_data_stream", "SEGMENT-FILE-VECTOR-DATA-STREAM", 1, 2, false);
        declareFunction("inspect_file_vector_data_record", "INSPECT-FILE-VECTOR-DATA-RECORD", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_file_vector_utilities_file() {
        defparameter("*SHOW-FILE-VECTOR-REFERENCE-PAYLOAD-IN-PRINT*", NIL);
        defconstant("*DTP-FILE-VECTOR-REFERENCE*", FILE_VECTOR_REFERENCE);
        defconstant("*CFASL-OPCODE-FVECTOR-REFERENCE*", $int$69);
        defparameter("*FILE-VECTOR-BACKED-MAP-READ-LOCK*", NIL);
        defparameter("*FILE-VECTOR-GET-RECURSION-GUARD*", NIL);
        deflexical("*FILE-VECTOR-INDEXICAL-REGISTRY*", SubLTrampolineFile.maybeDefault($file_vector_indexical_registry$, $file_vector_indexical_registry$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*FILE-VECTOR-INDEXICAL-LOCK-REGISTRY*", SubLTrampolineFile.maybeDefault($file_vector_indexical_lock_registry$, $file_vector_indexical_lock_registry$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        defconstant("*DTP-BACKED-MAP*", BACKED_MAP);
        defconstant("*CFASL-OPCODE-BACKED-MAP*", $int$76);
        defparameter("*CFASL-OUTER-FVECTOR-FOR-BACKED-MAPS*", NIL);
        defparameter("*CURRENT-BACKED-MAP-CACHE-STRATEGY*", NIL);
        return NIL;
    }

    public static final SubLObject setup_file_vector_utilities_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_file_vector_reference$.getGlobalValue(), symbol_function(FILE_VECTOR_REFERENCE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(FVECTOR_REF_INDEX, _CSETF_FVECTOR_REF_INDEX);
        def_csetf(FVECTOR_REF_PAYLOAD, _CSETF_FVECTOR_REF_PAYLOAD);
        identity(FILE_VECTOR_REFERENCE);
        register_cfasl_input_function($cfasl_opcode_fvector_reference$.getGlobalValue(), CFASL_INPUT_FILE_VECTOR_REFERENCE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_file_vector_reference$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_FILE_VECTOR_REFERENCE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(BACKED_MAP_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(BACKED_MAP_MAP, _CSETF_BACKED_MAP_MAP);
        def_csetf(BACKED_MAP_FVECTOR, _CSETF_BACKED_MAP_FVECTOR);
        def_csetf(BACKED_MAP_COMMON_SYMBOLS, _CSETF_BACKED_MAP_COMMON_SYMBOLS);
        identity(BACKED_MAP);
        register_cfasl_input_function($cfasl_opcode_backed_map$.getGlobalValue(), CFASL_INPUT_BACKED_MAP);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_BACKED_MAP_METHOD));
        register_method(map_utilities.$is_map_object_p_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(IS_MAP_OBJECT_P_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_size_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_SIZE_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_test_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_TEST_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_put_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_PUT_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_get_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_get_without_values_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_WITHOUT_VALUES_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_remove_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_remove_all_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_ALL_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_touch_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_TOUCH_BACKED_MAP_METHOD));
        register_method(map_utilities.$new_map_object_with_same_properties_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_BACKED_MAP_METHOD));
        register_method(map_utilities.$new_map_object_iterator_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(NEW_MAP_OBJECT_ITERATOR_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_arbitrary_key_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_ARBITRARY_KEY_BACKED_MAP_METHOD));
        define_test_case_table_int(TEST_FILE_VECTOR_BACKED_MAP_WITH_ALIST, list(new SubLObject[]{ $TEST, EQUALP, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt127);
        define_test_case_table_int(TEST_MAP_TO_FILE_VECTOR_BACKED_MAP_CONVERSION_WITH_ALIST, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt127);
        return NIL;
    }

    public static SubLObject setup_file_vector_utilities_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_file_vector_reference$.getGlobalValue(), symbol_function(FILE_VECTOR_REFERENCE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list12);
            def_csetf(FVECTOR_REF_INDEX, _CSETF_FVECTOR_REF_INDEX);
            def_csetf(FVECTOR_REF_PAYLOAD, _CSETF_FVECTOR_REF_PAYLOAD);
            identity(FILE_VECTOR_REFERENCE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_file_vector_reference$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FILE_VECTOR_REFERENCE_METHOD));
            register_cfasl_input_function($cfasl_opcode_fvector_reference$.getGlobalValue(), CFASL_INPUT_FILE_VECTOR_REFERENCE);
            register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_file_vector_reference$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_FILE_VECTOR_REFERENCE_METHOD));
            declare_defglobal($file_vector_indexical_registry$);
            declare_defglobal($file_vector_indexical_lock_registry$);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(BACKED_MAP_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list92);
            def_csetf(BACKED_MAP_MAP, _CSETF_BACKED_MAP_MAP);
            def_csetf(BACKED_MAP_FVECTOR, _CSETF_BACKED_MAP_FVECTOR);
            def_csetf(BACKED_MAP_COMMON_SYMBOLS, _CSETF_BACKED_MAP_COMMON_SYMBOLS);
            identity(BACKED_MAP);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_BACKED_MAP_METHOD));
            register_cfasl_input_function($cfasl_opcode_backed_map$.getGlobalValue(), CFASL_INPUT_BACKED_MAP);
            register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_BACKED_MAP_METHOD));
            register_method(map_utilities.$is_map_object_p_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(IS_MAP_OBJECT_P_BACKED_MAP_METHOD));
            register_method(map_utilities.$map_object_size_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_SIZE_BACKED_MAP_METHOD));
            register_method(map_utilities.$map_object_test_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_TEST_BACKED_MAP_METHOD));
            register_method(map_utilities.$map_object_put_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_PUT_BACKED_MAP_METHOD));
            register_method(map_utilities.$map_object_get_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_BACKED_MAP_METHOD));
            register_method(map_utilities.$map_object_get_without_values_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_WITHOUT_VALUES_BACKED_MAP_METHOD));
            register_method(map_utilities.$map_object_remove_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_BACKED_MAP_METHOD));
            register_method(map_utilities.$map_object_remove_all_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_ALL_BACKED_MAP_METHOD));
            register_method(map_utilities.$map_object_touch_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_TOUCH_BACKED_MAP_METHOD));
            register_method(map_utilities.$map_object_change_set_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_CHANGE_SET_BACKED_MAP_METHOD));
            register_method(map_utilities.$new_map_object_with_same_properties_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_BACKED_MAP_METHOD));
            register_method(map_utilities.$new_map_object_iterator_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(NEW_MAP_OBJECT_ITERATOR_BACKED_MAP_METHOD));
            register_method(map_utilities.$map_object_arbitrary_key_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_ARBITRARY_KEY_BACKED_MAP_METHOD));
            define_test_case_table_int(TEST_FILE_VECTOR_BACKED_MAP_WITH_ALIST, list(new SubLObject[]{ $TEST, EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list147);
            define_test_case_table_int(TEST_MAP_TO_FILE_VECTOR_BACKED_MAP_CONVERSION_WITH_ALIST, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list147);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(TEST_FILE_VECTOR_BACKED_MAP_WITH_ALIST, list(new SubLObject[]{ $TEST, EQUALP, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt127);
            define_test_case_table_int(TEST_MAP_TO_FILE_VECTOR_BACKED_MAP_CONVERSION_WITH_ALIST, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt127);
        }
        return NIL;
    }

    public static SubLObject setup_file_vector_utilities_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_file_vector_reference$.getGlobalValue(), symbol_function(FILE_VECTOR_REFERENCE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list12);
        def_csetf(FVECTOR_REF_INDEX, _CSETF_FVECTOR_REF_INDEX);
        def_csetf(FVECTOR_REF_PAYLOAD, _CSETF_FVECTOR_REF_PAYLOAD);
        identity(FILE_VECTOR_REFERENCE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_file_vector_reference$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FILE_VECTOR_REFERENCE_METHOD));
        register_cfasl_input_function($cfasl_opcode_fvector_reference$.getGlobalValue(), CFASL_INPUT_FILE_VECTOR_REFERENCE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_file_vector_reference$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_FILE_VECTOR_REFERENCE_METHOD));
        declare_defglobal($file_vector_indexical_registry$);
        declare_defglobal($file_vector_indexical_lock_registry$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(BACKED_MAP_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list92);
        def_csetf(BACKED_MAP_MAP, _CSETF_BACKED_MAP_MAP);
        def_csetf(BACKED_MAP_FVECTOR, _CSETF_BACKED_MAP_FVECTOR);
        def_csetf(BACKED_MAP_COMMON_SYMBOLS, _CSETF_BACKED_MAP_COMMON_SYMBOLS);
        identity(BACKED_MAP);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_BACKED_MAP_METHOD));
        register_cfasl_input_function($cfasl_opcode_backed_map$.getGlobalValue(), CFASL_INPUT_BACKED_MAP);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_BACKED_MAP_METHOD));
        register_method(map_utilities.$is_map_object_p_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(IS_MAP_OBJECT_P_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_size_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_SIZE_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_test_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_TEST_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_put_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_PUT_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_get_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_get_without_values_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_GET_WITHOUT_VALUES_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_remove_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_remove_all_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_REMOVE_ALL_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_touch_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_TOUCH_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_change_set_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_CHANGE_SET_BACKED_MAP_METHOD));
        register_method(map_utilities.$new_map_object_with_same_properties_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_BACKED_MAP_METHOD));
        register_method(map_utilities.$new_map_object_iterator_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(NEW_MAP_OBJECT_ITERATOR_BACKED_MAP_METHOD));
        register_method(map_utilities.$map_object_arbitrary_key_method_table$.getGlobalValue(), $dtp_backed_map$.getGlobalValue(), symbol_function(MAP_OBJECT_ARBITRARY_KEY_BACKED_MAP_METHOD));
        define_test_case_table_int(TEST_FILE_VECTOR_BACKED_MAP_WITH_ALIST, list(new SubLObject[]{ $TEST, EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list147);
        define_test_case_table_int(TEST_MAP_TO_FILE_VECTOR_BACKED_MAP_CONVERSION_WITH_ALIST, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list147);
        return NIL;
    }

    static private final SubLString $str_alt1$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLList $list_alt2 = list(makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLString $str_alt3$Error__writing_file_vector_backin = makeString("Error, writing file vector backing for map is not contiguous: expected ~A, got ~A~%");

    static private final SubLList $list_alt6 = list(makeSymbol("INDEX"), makeSymbol("PAYLOAD"));

    static private final SubLList $list_alt7 = list(makeKeyword("INDEX"), makeKeyword("PAYLOAD"));

    static private final SubLList $list_alt8 = list(makeSymbol("FVECTOR-REF-INDEX"), makeSymbol("FVECTOR-REF-PAYLOAD"));

    static private final SubLList $list_alt9 = list(makeSymbol("_CSETF-FVECTOR-REF-INDEX"), makeSymbol("_CSETF-FVECTOR-REF-PAYLOAD"));

    static private final SubLString $str_alt18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt19$__FILE_VECTOR_REF__ = makeString("#<FILE-VECTOR-REF #");

    static private final SubLString $str_alt20$__ = makeString(" (");

    static private final SubLString $str_alt21$__ = makeString(") ");

    static private final SubLString $str_alt22$_ = makeString(">");

    static private final SubLString $str_alt23$File_Vector_references_cannot_be_ = makeString("File Vector references cannot be zero.");

    static private final SubLString $str_alt25$present___pristine = makeString("present & pristine");

    static private final SubLSymbol $sym32$DATA_STREAM_LOCK = makeUninternedSymbol("DATA-STREAM-LOCK");

    static private final SubLList $list_alt34 = list(makeSymbol("*FILE-VECTOR-BACKED-MAP-READ-LOCK*"));

    static private final SubLList $list_alt39 = list(list(makeSymbol("LOCK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt44$Invalid_state_transition___A_is_n = makeString("Invalid state transition: ~A is neither present, nor deleted nor swapped out.");

    static private final SubLList $list_alt50 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("MAP"), makeSymbol("FILE-VECTOR"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("CACHE-STRATEGY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static SubLObject _constant_147_initializer() {
        return list(list(list(list(cons(ONE_INTEGER, makeString("Eins")), cons(TWO_INTEGER, makeString("Zwei")), cons(THREE_INTEGER, makeString("Drei")), cons(FOUR_INTEGER, makeString("Vier"))), EQUAL), makeKeyword("SUCCESS")), list(list(list(new SubLObject[]{ cons(ONE_INTEGER, makeString("Eins")), cons(TWO_INTEGER, makeString("Zwei")), cons(THREE_INTEGER, makeString("Drei")), cons(FOUR_INTEGER, makeString("Vier")), cons(FIVE_INTEGER, makeString("Fuenf")), cons(SIX_INTEGER, makeString("Sechs")), cons(SEVEN_INTEGER, makeString("Sieben")), cons(EIGHT_INTEGER, makeString("Acht")), cons(NINE_INTEGER, makeString("Neun")), cons(TEN_INTEGER, makeString("Zehn")), cons(ELEVEN_INTEGER, makeString("Elf")), cons(TWELVE_INTEGER, makeString("Zwoelf")), cons(THIRTEEN_INTEGER, makeString("Dreizehn")), cons(FOURTEEN_INTEGER, makeString("Vierzehtn")), cons(FIFTEEN_INTEGER, makeString("Fuenfzehn")), cons(SIXTEEN_INTEGER, makeString("Sechszehn")), cons(SEVENTEEN_INTEGER, makeString("Siebzehn")), cons(EIGHTEEN_INTEGER, makeString("Achtzehn")), cons(NINETEEN_INTEGER, makeString("Neunzehn")), cons(TWENTY_INTEGER, makeString("Zwanzig")), cons(makeInteger(21), makeString("Einundzwanzig")), cons(makeInteger(22), makeString("Zweiundzwanzig")), cons(makeInteger(23), makeString("Dreiundzwanzig")), cons(makeInteger(24), makeString("Vierundzwanzig")), cons(makeInteger(25), makeString("Fuenfundzwanzig")), cons(makeInteger(26), makeString("Sechsundzwanzig")), cons(makeInteger(27), makeString("Siebenundzwanzig")), cons(makeInteger(28), makeString("Achtundzwanzig")), cons(makeInteger(29), makeString("Neunundzwanzig")), cons(makeInteger(30), makeString("Dreissig")), cons(makeInteger(31), makeString("Einunddreissig")), cons(makeInteger(32), makeString("Zweiunddreissig")), cons(makeInteger(33), makeString("Dreiunddreissig")), cons(makeInteger(34), makeString("Vierunddreissig")), cons(makeInteger(35), makeString("Fuenfunddreissig")), cons(makeInteger(36), makeString("Sechsunddreissig")), cons(makeInteger(37), makeString("Siebenunddreissig")), cons(makeInteger(38), makeString("Achtunddreissig")), cons(makeInteger(39), makeString("Neununddreissig")), cons(makeInteger(40), makeString("Vierzig")), cons(makeInteger(41), makeString("Einundvierzig")), cons(makeInteger(42), makeString("Zweiundvierzig")) }), EQUAL), makeKeyword("SUCCESS")), list(list(list(new SubLObject[]{ cons(makeString("C"), makeInteger(100)), cons(makeString("LXXXXVIIII"), makeInteger(99)), cons(makeString("LXXXXVIII"), makeInteger(98)), cons(makeString("LXXXXVII"), makeInteger(97)), cons(makeString("LXXXXVI"), makeInteger(96)), cons(makeString("LXXXXV"), makeInteger(95)), cons(makeString("LXXXXIIII"), makeInteger(94)), cons(makeString("LXXXXIII"), makeInteger(93)), cons(makeString("LXXXXII"), makeInteger(92)), cons(makeString("LXXXXI"), makeInteger(91)), cons(makeString("LXXXX"), makeInteger(90)), cons(makeString("LXXXVIIII"), makeInteger(89)), cons(makeString("LXXXVIII"), makeInteger(88)), cons(makeString("LXXXVII"), makeInteger(87)), cons(makeString("LXXXVI"), makeInteger(86)), cons(makeString("LXXXV"), makeInteger(85)), cons(makeString("LXXXIIII"), makeInteger(84)), cons(makeString("LXXXIII"), makeInteger(83)), cons(makeString("LXXXII"), makeInteger(82)), cons(makeString("LXXXI"), makeInteger(81)), cons(makeString("LXXX"), makeInteger(80)), cons(makeString("LXXVIIII"), makeInteger(79)), cons(makeString("LXXVIII"), makeInteger(78)), cons(makeString("LXXVII"), makeInteger(77)), cons(makeString("LXXVI"), makeInteger(76)), cons(makeString("LXXV"), makeInteger(75)), cons(makeString("LXXIIII"), makeInteger(74)), cons(makeString("LXXIII"), makeInteger(73)), cons(makeString("LXXII"), makeInteger(72)), cons(makeString("LXXI"), makeInteger(71)), cons(makeString("LXX"), makeInteger(70)), cons(makeString("LXVIIII"), makeInteger(69)), cons(makeString("LXVIII"), makeInteger(68)), cons(makeString("LXVII"), makeInteger(67)), cons(makeString("LXVI"), makeInteger(66)), cons(makeString("LXV"), makeInteger(65)), cons(makeString("LXIIII"), makeInteger(64)), cons(makeString("LXIII"), makeInteger(63)), cons(makeString("LXII"), makeInteger(62)), cons(makeString("LXI"), makeInteger(61)), cons(makeString("LX"), makeInteger(60)), cons(makeString("LVIIII"), makeInteger(59)), cons(makeString("LVIII"), makeInteger(58)), cons(makeString("LVII"), makeInteger(57)), cons(makeString("LVI"), makeInteger(56)), cons(makeString("LV"), makeInteger(55)), cons(makeString("LIIII"), makeInteger(54)), cons(makeString("LIII"), makeInteger(53)), cons(makeString("LII"), makeInteger(52)), cons(makeString("LI"), makeInteger(51)), cons(makeString("L"), makeInteger(50)), cons(makeString("XXXXVIIII"), makeInteger(49)), cons(makeString("XXXXVIII"), makeInteger(48)), cons(makeString("XXXXVII"), makeInteger(47)), cons(makeString("XXXXVI"), makeInteger(46)), cons(makeString("XXXXV"), makeInteger(45)), cons(makeString("XXXXIIII"), makeInteger(44)), cons(makeString("XXXXIII"), makeInteger(43)), cons(makeString("XXXXII"), makeInteger(42)), cons(makeString("XXXXI"), makeInteger(41)), cons(makeString("XXXX"), makeInteger(40)), cons(makeString("XXXVIIII"), makeInteger(39)), cons(makeString("XXXVIII"), makeInteger(38)), cons(makeString("XXXVII"), makeInteger(37)), cons(makeString("XXXVI"), makeInteger(36)), cons(makeString("XXXV"), makeInteger(35)), cons(makeString("XXXIIII"), makeInteger(34)), cons(makeString("XXXIII"), makeInteger(33)), cons(makeString("XXXII"), makeInteger(32)), cons(makeString("XXXI"), makeInteger(31)), cons(makeString("XXX"), makeInteger(30)), cons(makeString("XXVIIII"), makeInteger(29)), cons(makeString("XXVIII"), makeInteger(28)), cons(makeString("XXVII"), makeInteger(27)), cons(makeString("XXVI"), makeInteger(26)), cons(makeString("XXV"), makeInteger(25)), cons(makeString("XXIIII"), makeInteger(24)), cons(makeString("XXIII"), makeInteger(23)), cons(makeString("XXII"), makeInteger(22)), cons(makeString("XXI"), makeInteger(21)), cons(makeString("XX"), TWENTY_INTEGER), cons(makeString("XVIIII"), NINETEEN_INTEGER), cons(makeString("XVIII"), EIGHTEEN_INTEGER), cons(makeString("XVII"), SEVENTEEN_INTEGER), cons(makeString("XVI"), SIXTEEN_INTEGER), cons(makeString("XV"), FIFTEEN_INTEGER), cons(makeString("XIIII"), FOURTEEN_INTEGER), cons(makeString("XIII"), THIRTEEN_INTEGER), cons(makeString("XII"), TWELVE_INTEGER), cons(makeString("XI"), ELEVEN_INTEGER), cons(makeString("X"), TEN_INTEGER), cons(makeString("VIIII"), NINE_INTEGER), cons(makeString("VIII"), EIGHT_INTEGER), cons(makeString("VII"), SEVEN_INTEGER), cons(makeString("VI"), SIX_INTEGER), cons(makeString("V"), FIVE_INTEGER), cons(makeString("IIII"), FOUR_INTEGER), cons(makeString("III"), THREE_INTEGER), cons(makeString("II"), TWO_INTEGER), cons(makeString("I"), ONE_INTEGER) }), EQUALP), makeKeyword("SUCCESS")));
    }

    static private final SubLList $list_alt51 = list($DONE, makeKeyword("CACHE-STRATEGY"));

    static private final SubLSymbol $sym55$IMPL_VALUE = makeUninternedSymbol("IMPL-VALUE");

    static private final SubLSymbol $sym59$FILE_VECTOR_REFERENCE_DELETED_ = makeSymbol("FILE-VECTOR-REFERENCE-DELETED?");

    static private final SubLSymbol $sym61$FILE_VECTOR_BACKED_MAP_W__CACHE_GET = makeSymbol("FILE-VECTOR-BACKED-MAP-W/-CACHE-GET");

    static private final SubLList $list_alt64 = list(makeSymbol("CURR-ITEM"), makeSymbol("ITERATOR"), makeSymbol("MAP"), makeSymbol("FILE-VECTOR"), makeSymbol("COMMON-SYMBOLS"), makeSymbol("CACHE-STRATEGY"));

    static private final SubLString $str_alt66$Cannot_convert_a_file_backed_map_ = makeString("Cannot convert a file-backed map that is not all swapped in.");

    static private final SubLList $list_alt69 = list(makeSymbol("MAP"), makeSymbol("FVECTOR"), makeSymbol("COMMON-SYMBOLS"));

    static private final SubLList $list_alt70 = list(makeKeyword("MAP"), makeKeyword("FVECTOR"), makeKeyword("COMMON-SYMBOLS"));

    static private final SubLList $list_alt71 = list(makeSymbol("BACKED-MAP-MAP"), makeSymbol("BACKED-MAP-FVECTOR"), makeSymbol("BACKED-MAP-COMMON-SYMBOLS"));

    static private final SubLList $list_alt72 = list(makeSymbol("_CSETF-BACKED-MAP-MAP"), makeSymbol("_CSETF-BACKED-MAP-FVECTOR"), makeSymbol("_CSETF-BACKED-MAP-COMMON-SYMBOLS"));

    static private final SubLList $list_alt85 = list(list(makeSymbol("BACKED-MAP")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym86$COMMON_SYMBOLS = makeUninternedSymbol("COMMON-SYMBOLS");

    static private final SubLString $str_alt88$__ = makeString("#<");

    static private final SubLString $str_alt90$_Map_ = makeString(" Map ");

    static private final SubLString $str_alt91$_FVector_ = makeString(" FVector ");

    static private final SubLString $str_alt92$_CFASL_ComSym_ = makeString(" CFASL ComSym ");

    static private final SubLString $str_alt93$_ = makeString(" ");

    static private final SubLList $list_alt98 = list(list(makeSymbol("STRATEGY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt110$The_test_of_the_interior_map__A_d = makeString("The test of the interior map ~A does not correspond to the provided test ~A.");

    static private final SubLString $str_alt111$The_size_of_the_interior_map__A_d = makeString("The size of the interior map ~A does not correspond to the provided size ~A.");

    static private final SubLList $list_alt115 = list(makeSymbol("BACKED-MAP"), makeSymbol("ITERATOR"), makeSymbol("CACHE-STRATEGY"));

    @Override
    public void declareFunctions() {
        declare_file_vector_utilities_file();
    }

    static private final SubLString $str_alt117$Error_in_swap_out_algorithm___A_i = makeString("Error in swap-out algorithm: ~A is NOT a backed map.");

    @Override
    public void initializeVariables() {
        init_file_vector_utilities_file();
    }

    static private final SubLString $str_alt118$Error_in_non_pristine_object_coun = makeString("Error in non-pristine object count algorithm: ~A is NOT a backed map.");

    @Override
    public void runTopLevelForms() {
        setup_file_vector_utilities_file();
    }

    static {
    }

    static private final SubLString $$$rck = makeString("rck");

    static private final SubLList $list_alt127 = list(list(list(list(cons(ONE_INTEGER, makeString("Eins")), cons(TWO_INTEGER, makeString("Zwei")), cons(THREE_INTEGER, makeString("Drei")), cons(FOUR_INTEGER, makeString("Vier"))), EQUAL), makeKeyword("SUCCESS")));

    public static final class $file_vector_reference_native extends SubLStructNative {
        public SubLObject $index;

        public SubLObject $payload;

        private static final SubLStructDeclNative structDecl;

        public $file_vector_reference_native() {
            file_vector_utilities.$file_vector_reference_native.this.$index = Lisp.NIL;
            file_vector_utilities.$file_vector_reference_native.this.$payload = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return file_vector_utilities.$file_vector_reference_native.this.$index;
        }

        @Override
        public SubLObject getField3() {
            return file_vector_utilities.$file_vector_reference_native.this.$payload;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return file_vector_utilities.$file_vector_reference_native.this.$index = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return file_vector_utilities.$file_vector_reference_native.this.$payload = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.file_vector_utilities.$file_vector_reference_native.class, FILE_VECTOR_REFERENCE, FILE_VECTOR_REFERENCE_P, $list6, $list7, new String[]{ "$index", "$payload" }, $list8, $list9, PRINT_FVECTOR_REF);
        }
    }

    static private final SubLString $str_alt129$_tmp_ = makeString("/tmp/");

    static private final SubLString $str_alt130$Key__A_should_be_in_the_map_but_i = makeString("Key ~A should be in the map but is not.");

    static private final SubLString $str_alt131$The_value_for_the_key__A_is_missi = makeString("The value for the key ~A is missing altogether from the new map.");

    static private final SubLString $str_alt132$The_old_value__A_does_not_match_t = makeString("The old value ~A does not match the new value ~A according to ~A.");

    static private final SubLString $str_alt133$The_value_for_the_key__A_can_all_ = makeString("The value for the key ~A can all of a sudden no longer be found.");

    static private final SubLString $str_alt134$The_accessing_of_the_value_for__A = makeString("The accessing of the value for ~A did not swap in the value.");

    static private final SubLString $str_alt135$The_touching_of_the_object_did_no = makeString("The touching of the object did not mutate the object.");

    public static final class $file_vector_reference_p$UnaryFunction extends UnaryFunction {
        public $file_vector_reference_p$UnaryFunction() {
            super(extractFunctionNamed("FILE-VECTOR-REFERENCE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return file_vector_reference_p(arg1);
        }
    }

    static private final SubLString $str_alt136$Undoing_the_change_for_key__A_did = makeString("Undoing the change for key ~A did actually not succeed.");

    static private final SubLString $str_alt137$The_modification_of_the_entry_for = makeString("The modification of the entry for ~A did not mutate anything.");

    static private final SubLString $str_alt138$The_modified_entry_for__A_no_long = makeString("The modified entry for ~A no longer contains the new value ~A but rather ~A.");

    public static final class $backed_map_native extends SubLStructNative {
        public SubLObject $map;

        public SubLObject $fvector;

        public SubLObject $common_symbols;

        private static final SubLStructDeclNative structDecl;

        public $backed_map_native() {
            file_vector_utilities.$backed_map_native.this.$map = Lisp.NIL;
            file_vector_utilities.$backed_map_native.this.$fvector = Lisp.NIL;
            file_vector_utilities.$backed_map_native.this.$common_symbols = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return file_vector_utilities.$backed_map_native.this.$map;
        }

        @Override
        public SubLObject getField3() {
            return file_vector_utilities.$backed_map_native.this.$fvector;
        }

        @Override
        public SubLObject getField4() {
            return file_vector_utilities.$backed_map_native.this.$common_symbols;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return file_vector_utilities.$backed_map_native.this.$map = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return file_vector_utilities.$backed_map_native.this.$fvector = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return file_vector_utilities.$backed_map_native.this.$common_symbols = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.file_vector_utilities.$backed_map_native.class, BACKED_MAP, BACKED_MAP_P, $list86, $list87, new String[]{ "$map", "$fvector", "$common_symbols" }, $list88, $list89, PRINT_BACKED_MAP);
        }
    }

    static private final SubLString $str_alt139$The_stored_entry_for__A_is_not_a_ = makeString("The stored entry for ~A is not a present and mutated file vector reference.");

    static private final SubLString $str_alt143$_A_should_be_paged_in__but__A_are = makeString("~A should be paged in, but ~A are actually paged in.");

    static private final SubLString $str_alt144$_A_should_be_paged_out__but__A_ar = makeString("~A should be paged out, but ~A are actually paged out.");

    static private final SubLList $list_alt146 = list(makeSymbol("KEY"), makeSymbol("REFERENCE"));

    static private final SubLString $str_alt147$The_entry_for__A_in_the_original_ = makeString("The entry for ~A in the original map is not a file vector reference.~%");

    static private final SubLString $str_alt148$The_loaded_map_does_not_have_the_ = makeString("The loaded map does not have the same size as the original map: ~A =/= ~A~%");

    static private final SubLString $str_alt149$The_entry_for__A_in_the_new_map_i = makeString("The entry for ~A in the new map is not a file vector reference.");

    static private final SubLList $list_alt150 = list(makeSymbol("NEW-KEY"), makeUninternedSymbol("IMPL-VALUE"));

    public static final class $backed_map_p$UnaryFunction extends UnaryFunction {
        public $backed_map_p$UnaryFunction() {
            super(extractFunctionNamed("BACKED-MAP-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return backed_map_p(arg1);
        }
    }

    static private final SubLString $str_alt151$The_new_map_has_an_entry_for_key_ = makeString("The new map has an entry for key ~A while the old one has none.");

    static private final SubLString $str_alt152$The_values_for_key__A_are_not_equ = makeString("The values for key ~A are not equal according to ~A: ~A =/= ~A (new =/= old).~%");

    static private final SubLString $str_alt154$We_are_getting_the_removed_key__A = makeString("We are getting the removed key ~A returned to us with value ~A~%!");

    static private final SubLString $str_alt155$We_are_not_getting_back_the_same_ = makeString("We are not getting back the same reference for ~A: we expected ~A and got ~A.");

    static private final SubLString $str_alt156$We_visited__A_entries_but_we_shou = makeString("We visited ~A entries but we should have visited ~A entries.");
}

/**
 * Total time: 1495 ms synthetic
 */
