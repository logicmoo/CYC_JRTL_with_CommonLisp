package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.Iterator;
import java.util.Map;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class id_index extends SubLTranslatedFile {
    public static final SubLFile me = new id_index();

    public static final String myName = "com.cyc.cycjava.cycl.id_index";

    public static final String myFingerPrint = "2852b7796a403c18d7c80755e03d94b38080a4e917900ed85e350aa194835e0f";

    public static final SubLSymbol $id_index_empty_list$ = makeSymbol("*ID-INDEX-EMPTY-LIST*"); 
    // defconstant
    public static final SubLSymbol $dtp_id_index$ = makeSymbol("*DTP-ID-INDEX*");

    // deflexical
    // Number of old entries anticipated for each new entry.
    private static final SubLSymbol $id_index_default_scaling_factor$ = makeSymbol("*ID-INDEX-DEFAULT-SCALING-FACTOR*");

    // deflexical
    private static final SubLSymbol $id_index_equality_test$ = makeSymbol("*ID-INDEX-EQUALITY-TEST*");



    // defconstant
    private static final SubLSymbol $cfasl_wide_opcode_id_index$ = makeSymbol("*CFASL-WIDE-OPCODE-ID-INDEX*");

    // Internal Constants
    public static final SubLSymbol ID_INDEX = makeSymbol("ID-INDEX");

    public static final SubLSymbol ID_INDEX_P = makeSymbol("ID-INDEX-P");

    public static final SubLList $list2 = list(makeSymbol("LOCK"), makeSymbol("COUNT"), makeSymbol("NEXT-ID"), makeSymbol("DENSE-OBJECTS"), makeSymbol("SPARSE-OBJECTS"));

    public static final SubLList $list3 = list(makeKeyword("LOCK"), makeKeyword("COUNT"), makeKeyword("NEXT-ID"), makeKeyword("DENSE-OBJECTS"), makeKeyword("SPARSE-OBJECTS"));

    public static final SubLList $list4 = list(makeSymbol("IDIX-LOCK"), makeSymbol("IDIX-COUNT"), makeSymbol("IDIX-NEXT-ID"), makeSymbol("IDIX-DENSE-OBJECTS"), makeSymbol("IDIX-SPARSE-OBJECTS"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-IDIX-LOCK"), makeSymbol("_CSETF-IDIX-COUNT"), makeSymbol("_CSETF-IDIX-NEXT-ID"), makeSymbol("_CSETF-IDIX-DENSE-OBJECTS"), makeSymbol("_CSETF-IDIX-SPARSE-OBJECTS"));

    public static final SubLSymbol PRINT_ID_INDEX = makeSymbol("PRINT-ID-INDEX");

    public static final SubLSymbol ID_INDEX_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ID-INDEX-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ID-INDEX-P"));

    private static final SubLSymbol IDIX_LOCK = makeSymbol("IDIX-LOCK");

    private static final SubLSymbol _CSETF_IDIX_LOCK = makeSymbol("_CSETF-IDIX-LOCK");

    private static final SubLSymbol IDIX_COUNT = makeSymbol("IDIX-COUNT");

    private static final SubLSymbol _CSETF_IDIX_COUNT = makeSymbol("_CSETF-IDIX-COUNT");

    private static final SubLSymbol IDIX_NEXT_ID = makeSymbol("IDIX-NEXT-ID");

    private static final SubLSymbol _CSETF_IDIX_NEXT_ID = makeSymbol("_CSETF-IDIX-NEXT-ID");

    private static final SubLSymbol IDIX_DENSE_OBJECTS = makeSymbol("IDIX-DENSE-OBJECTS");

    private static final SubLSymbol _CSETF_IDIX_DENSE_OBJECTS = makeSymbol("_CSETF-IDIX-DENSE-OBJECTS");

    private static final SubLSymbol IDIX_SPARSE_OBJECTS = makeSymbol("IDIX-SPARSE-OBJECTS");

    private static final SubLSymbol _CSETF_IDIX_SPARSE_OBJECTS = makeSymbol("_CSETF-IDIX-SPARSE-OBJECTS");











    private static final SubLString $str24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_ID_INDEX = makeSymbol("MAKE-ID-INDEX");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ID_INDEX_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ID-INDEX-METHOD");

    private static final SubLString $str30$COUNT_ = makeString("COUNT=");

    private static final SubLString $str31$_NEXT_ = makeString(" NEXT=");



    private static final SubLString $str33$_A_has_had_next_id_reduced_from__ = makeString("~A has had next-id reduced from ~A to ~A.  This may result in errors.");

    private static final SubLSymbol ID_INDEX_DENSE_OBJECTS = makeSymbol("ID-INDEX-DENSE-OBJECTS");

    private static final SubLSymbol DO_ID_INDEX_DENSE_OBJECTS = makeSymbol("DO-ID-INDEX-DENSE-OBJECTS");

    private static final SubLSymbol ID_INDEX_SPARSE_OBJECTS = makeSymbol("ID-INDEX-SPARSE-OBJECTS");

    private static final SubLSymbol DO_ID_INDEX_SPARSE_OBJECTS = makeSymbol("DO-ID-INDEX-SPARSE-OBJECTS");

    private static final SubLList $list38 = list(makeSymbol("ID-INDEX"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym39$ID_INDEX_LOCK = makeUninternedSymbol("ID-INDEX-LOCK");



    private static final SubLSymbol ID_INDEX_LOCK = makeSymbol("ID-INDEX-LOCK");



    private static final SubLSymbol WITH_ID_INDEX_LOCKED = makeSymbol("WITH-ID-INDEX-LOCKED");





    private static final SubLString $str46$ID_INDEX = makeString("ID-INDEX");

    private static final SubLString $str47$THE_EMPTY_LIST = makeString("THE-EMPTY-LIST");

    private static final SubLSymbol ID_INDEX_TOMBSTONE_P = makeSymbol("ID-INDEX-TOMBSTONE-P");



    private static final SubLSymbol $sym50$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str51$Fill_cannot_extend_into_sparse_sp = makeString("Fill cannot extend into sparse space.~%");

    public static final SubLList $list52 = list(makeSymbol("NEW-ID-INDEX-DENSE-OBJECTS-ITERATOR"), makeSymbol("NEW-ID-INDEX-SPARSE-OBJECTS-ITERATOR"));

    public static final SubLList $list53 = list(makeSymbol("NEW-ID-INDEX-DENSE-OBJECTS-VALUES-ITERATOR"), makeSymbol("NEW-ID-INDEX-SPARSE-OBJECTS-VALUES-ITERATOR"));

    private static final SubLList $list54 = list(makeSymbol("NEW-ID-INDEX-DENSE-OBJECTS-ITERATOR"), makeSymbol("NEW-ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR"));

    private static final SubLSymbol ITERATE_ID_INDEX_DENSE_OBJECTS_NECESSARY = makeSymbol("ITERATE-ID-INDEX-DENSE-OBJECTS-NECESSARY");

    private static final SubLList $list56 = list(makeSymbol("ID"), makeSymbol("VALUE"));



    private static final SubLSymbol $sym58$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_DONE_ = makeSymbol("ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR-DONE?");

    private static final SubLSymbol ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_NEXT = makeSymbol("ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR-NEXT");





    public static final SubLList $list62 = list(makeSymbol("ID"), makeSymbol("SPARSE-OBJECTS"), makeSymbol("END-ID"), makeSymbol("KEY-VALUE-TUPLE"));

    private static final SubLList $list63 = list(list(makeSymbol("ID"), makeSymbol("OBJECT"), makeSymbol("ID-INDEX"), makeSymbol("&KEY"), list(makeSymbol("TOMBSTONE"), makeKeyword("SKIP")), makeSymbol("ORDERED"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list64 = list(makeKeyword("TOMBSTONE"), makeKeyword("ORDERED"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");











    private static final SubLSymbol OLD_DO_ID_INDEX = makeSymbol("OLD-DO-ID-INDEX");

    private static final SubLSymbol $sym72$IDX = makeUninternedSymbol("IDX");



    private static final SubLSymbol ID_INDEX_OBJECTS_EMPTY_P = makeSymbol("ID-INDEX-OBJECTS-EMPTY-P");

    private static final SubLSymbol $sym75$IDX = makeUninternedSymbol("IDX");

    private static final SubLSymbol $sym76$MESS = makeUninternedSymbol("MESS");

    private static final SubLSymbol $sym77$TOTAL = makeUninternedSymbol("TOTAL");

    private static final SubLSymbol $sym78$SOFAR = makeUninternedSymbol("SOFAR");

    private static final SubLSymbol ID_INDEX_COUNT = makeSymbol("ID-INDEX-COUNT");

    private static final SubLList $list80 = list(ZERO_INTEGER);



    private static final SubLList $list82 = list(makeSymbol("STRINGP"));







    private static final SubLList $list86 = list(list(makeSymbol("ID"), makeSymbol("OBJECT"), makeSymbol("ID-INDEX"), makeSymbol("&KEY"), list(makeSymbol("TOMBSTONE"), makeKeyword("SKIP")), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list87 = list(makeKeyword("TOMBSTONE"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));

    private static final SubLSymbol $sym88$IDX = makeUninternedSymbol("IDX");

    private static final SubLSymbol ID_INDEX_DENSE_OBJECTS_EMPTY_P = makeSymbol("ID-INDEX-DENSE-OBJECTS-EMPTY-P");

    private static final SubLSymbol DO_VECTOR_INDEX = makeSymbol("DO-VECTOR-INDEX");



    private static final SubLSymbol ID_INDEX_SKIP_TOMBSTONES_P = makeSymbol("ID-INDEX-SKIP-TOMBSTONES-P");





    private static final SubLSymbol $sym95$IDX = makeUninternedSymbol("IDX");

    private static final SubLSymbol $sym96$MESS = makeUninternedSymbol("MESS");

    private static final SubLSymbol $sym97$TOTAL = makeUninternedSymbol("TOTAL");

    private static final SubLSymbol $sym98$SOFAR = makeUninternedSymbol("SOFAR");

    private static final SubLSymbol ID_INDEX_DENSE_OBJECT_COUNT = makeSymbol("ID-INDEX-DENSE-OBJECT-COUNT");

    private static final SubLList $list100 = list(makeSymbol("DO-ID-INDEX-DENSE-OBJECTS"), makeSymbol("DO-ID-INDEX-SPARSE-OBJECTS"));

    private static final SubLSymbol $sym101$IDX = makeUninternedSymbol("IDX");

    private static final SubLSymbol $sym102$MESS = makeUninternedSymbol("MESS");

    private static final SubLSymbol $sym103$TOTAL = makeUninternedSymbol("TOTAL");

    private static final SubLSymbol $sym104$SOFAR = makeUninternedSymbol("SOFAR");

    private static final SubLSymbol ID_INDEX_SPARSE_OBJECT_COUNT = makeSymbol("ID-INDEX-SPARSE-OBJECT-COUNT");

    private static final SubLSymbol $sym106$IDX = makeUninternedSymbol("IDX");



    private static final SubLSymbol $sym108$IDX = makeUninternedSymbol("IDX");

    private static final SubLSymbol $sym109$SPARSE = makeUninternedSymbol("SPARSE");

    private static final SubLSymbol $sym110$END_ID = makeUninternedSymbol("END-ID");

    private static final SubLSymbol $sym111$DEFAULT = makeUninternedSymbol("DEFAULT");

    private static final SubLSymbol ID_INDEX_SPARSE_OBJECTS_EMPTY_P = makeSymbol("ID-INDEX-SPARSE-OBJECTS-EMPTY-P");

    private static final SubLSymbol ID_INDEX_SPARSE_ID_THRESHOLD = makeSymbol("ID-INDEX-SPARSE-ID-THRESHOLD");

    private static final SubLSymbol ID_INDEX_NEXT_ID = makeSymbol("ID-INDEX-NEXT-ID");





    private static final SubLSymbol $sym117$_ = makeSymbol("<");





    private static final SubLString $str120$Setting__TOMBSTONE_to__A_requires = makeString("Setting :TOMBSTONE to ~A requires that :ORDERED be set to T");

    private static final SubLSymbol $sym121$IDX = makeUninternedSymbol("IDX");



    private static final SubLSymbol ID_INDEX_SPARSE_OBJECT_IDS = makeSymbol("ID-INDEX-SPARSE-OBJECT-IDS");

    private static final SubLList $list124 = list(list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("OBJECT"), makeSymbol("ID-INDEX"), makeSymbol("&KEY"), makeSymbol("START-ID"), makeSymbol("END-ID"), list(makeSymbol("TOMBSTONE"), makeKeyword("SKIP")), makeSymbol("ORDERED"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list125 = list(makeKeyword("START-ID"), makeKeyword("END-ID"), makeKeyword("TOMBSTONE"), makeKeyword("ORDERED"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));





    private static final SubLSymbol $sym128$IDX = makeUninternedSymbol("IDX");

    private static final SubLSymbol NEW_DO_ID_INDEX = makeSymbol("NEW-DO-ID-INDEX");

    private static final SubLSymbol $sym130$MESS = makeUninternedSymbol("MESS");

    private static final SubLSymbol $sym131$TOTAL = makeUninternedSymbol("TOTAL");

    private static final SubLSymbol $sym132$SOFAR = makeUninternedSymbol("SOFAR");

    private static final SubLSymbol $sym133$TOMB = makeUninternedSymbol("TOMB");

    private static final SubLSymbol $sym134$ORD = makeUninternedSymbol("ORD");

    private static final SubLSymbol $sym135$LAST_ID = makeUninternedSymbol("LAST-ID");

    private static final SubLSymbol $sym136$STATE_VAR = makeUninternedSymbol("STATE-VAR");

    private static final SubLSymbol $sym137$__ = makeSymbol("<=");



    private static final SubLSymbol $sym139$_ = makeSymbol("-");

    private static final SubLList $list140 = list(ONE_INTEGER);

    private static final SubLList $list141 = list(NIL);

    private static final SubLSymbol DO_ID_INDEX_NEXT_ID = makeSymbol("DO-ID-INDEX-NEXT-ID");

    private static final SubLSymbol DO_ID_INDEX_NEXT_STATE = makeSymbol("DO-ID-INDEX-NEXT-STATE");

    private static final SubLSymbol DO_ID_INDEX_STATE_OBJECT = makeSymbol("DO-ID-INDEX-STATE-OBJECT");

    private static final SubLSymbol $sym145$DO_ID_INDEX_OBJECT_VALID_ = makeSymbol("DO-ID-INDEX-OBJECT-VALID?");

    private static final SubLString $str146$unexpected_new_do_id_index_iterat = makeString("unexpected new-do-id-index iteration state ~S");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLSymbol CFASL_INPUT_ID_INDEX = makeSymbol("CFASL-INPUT-ID-INDEX");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_ID_INDEX_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-ID-INDEX-METHOD");

    private static final SubLString $str150$Expected__A_dense_elements__got__ = makeString("Expected ~A dense elements, got ~A instead.");

    private static final SubLString $str151$Expected__A_sparse_elements__got_ = makeString("Expected ~A sparse elements, got ~A instead.");

    private static final SubLString $str152$The_sparse_ID_index_should_have__ = makeString("The sparse ID index should have ~A entries, but it has ~A.");

    private static final SubLString $str153$The_sparse_ID_index_should_have_a = makeString("The sparse ID index should have a dense space size of ~A, not ~A.");

    private static final SubLSymbol TEST_ID_INDEX_CFASL_SERIALIZATION = makeSymbol("TEST-ID-INDEX-CFASL-SERIALIZATION");













    private static final SubLList $list161 = list(list(list(makeInteger(100), TWENTY_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(100), TWENTY_INTEGER, makeSymbol("TO-HEX-STRING"), EQUAL), makeKeyword("SUCCESS")));



    private static final SubLString $str163$We_did_not_get_an_ID_index_back__ = makeString("We did not get an ID index back, but got ~A instead.");

    private static final SubLString $str164$The_dense_ID_index__A_does_not_ha = makeString("The dense ID index ~A does not have the same number of elements as the new ID index ~A.");



    private static final SubLSymbol ID_INDEX_PESSIMIZED_P = makeSymbol("ID-INDEX-PESSIMIZED-P");

    private static final SubLString $$$Compacting_ID_index = makeString("Compacting ID index");





    private static final SubLString $$$Updating_object_IDs = makeString("Updating object IDs");



    private static final SubLList $list172 = list(makeKeyword("ALL"), makeKeyword("DENSE"), makeKeyword("SPARSE"));

    private static final SubLString $str173$Type_must_be_one_of_____ALL__DENS = makeString("Type must be one of -- :ALL :DENSE :SPARSE");



    private static final SubLList $list175 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));



    private static final SubLSymbol TEST_ID_INDEX_MISSING_IDS = makeSymbol("TEST-ID-INDEX-MISSING-IDS");

    private static final SubLList $list178 = list(list(list(makeInteger(100), TWENTY_INTEGER, TWENTY_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(1000), makeInteger(200), makeInteger(200)), makeKeyword("SUCCESS")), list(list(makeInteger(255), ZERO_INTEGER, makeInteger(40)), makeKeyword("SUCCESS")));

    private static final SubLString $str179$ID__A_is_missing__it_is__A_ = makeString("ID ~A is missing; it is ~A.");

    private static final SubLString $$$expected_to_be_present = makeString("expected to be present");

    private static final SubLString $$$expected_to_be_absent = makeString("expected to be absent");

    private static final SubLList $list182 = list(makeSymbol("KEY"), makeSymbol("ID"));

    private static final SubLSymbol TEST_NEW_INDEX_FROM_REVERSE_INDEX = makeSymbol("TEST-NEW-INDEX-FROM-REVERSE-INDEX");

    private static final SubLString $str184$The_dense_ID_index__A_is_of_a_dif = makeString("The dense ID index ~A is of a different size than the new ID index ~A.");



    private static final SubLString $str186$The_reverse_index_for__A_does_not = makeString("The reverse index for ~A does not contain ~A.");

    private static final SubLString $str187$The_new_ID_index_does_not_have__A = makeString("The new ID index does not have ~A at location ~A.");

    private static final SubLString $str188$There_is_a_mismatch_between_the__ = makeString("There is a mismatch between the ~A-nth expected next ID, ~A and the actual ID suggested ~A.");

    private static final SubLSymbol TEST_DO_ID_INDEX_WITH_TOMBSTONES = makeSymbol("TEST-DO-ID-INDEX-WITH-TOMBSTONES");



    private static final SubLString $str191$Error__the_ID_range_is_not_truely = makeString("Error, the ID range is not truely consecutive; expected ~A got ~A.");

    private static final SubLString $str192$Error_at_index__A__expected_tombs = makeString("Error at index ~A, expected tombstone, got ~A.");

    private static final SubLString $str193$Error_at_index__A__expected_objec = makeString("Error at index ~A, expected object, got tombstone.");

    private static final SubLString $str194$There_are_holes_that_we_did_not_s = makeString("There are holes that we did not see: ~A were missing.");

    private static final SubLString $str195$Error__ID__A_is_not_in_line_with_ = makeString("Error, ID ~A is not in line with counter ~A.");

    private static final SubLString $str196$_DONE_should_have_taken_us_to__A_ = makeString(":DONE should have taken us to ~A but it got us to ~A.");

    private static final SubLString $str197$Hey__we_deleted_everything_and_th = makeString("Hey, we deleted everything and the ID index is not empty?");

    private static final SubLString $str198$Error__an_empty_ID_index_contains = makeString("Error, an empty ID index contains non-tombstone ~A???");

    private static final SubLString $str199$Hey___A______A__they_did_not_show = makeString("Hey, ~A =/= ~A; they did not show us all the tombstones ...!");

    private static final SubLSymbol TEST_ID_INDEX_WITH_SWIZZLING = makeSymbol("TEST-ID-INDEX-WITH-SWIZZLING");

    private static final SubLList $list201 = list(list(list(makeInteger(100), TWENTY_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(100), makeInteger(200)), makeKeyword("SUCCESS")));

    private static final SubLString $str202$The_test_is_badly_designed__no_bi = makeString("The test is badly designed, no bignum IDs were produced.~%");

    private static final SubLString $str203$ = makeString("");

    private static final SubLString $str204$We_could_not_retrieve__S_from_the = makeString("We could not retrieve ~S from the ID index using ~A.");

    private static final SubLSymbol TEST_ID_INDEX_ORDERED_ITERATION = makeSymbol("TEST-ID-INDEX-ORDERED-ITERATION");

    private static final SubLList $list206 = list(list(list(TEN_INTEGER, TWENTY_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(100), makeInteger(200)), makeKeyword("SUCCESS")));

    private static final SubLString $str207$We_expected_something_larger_than = makeString("We expected something larger than ~A, but got ~A.~%");

    private static final SubLString $$$a = makeString("a");

    private static final SubLString $$$b = makeString("b");

    private static final SubLString $$$c = makeString("c");

    private static final SubLList $list211 = list(makeString("a"), makeString("b"), makeString("c"));

    private static final SubLString $$$d = makeString("d");

    private static final SubLString $$$e = makeString("e");

    private static final SubLSymbol $ID_INDEX_RELOOKUP_FAILURE = makeKeyword("ID-INDEX-RELOOKUP-FAILURE");

    private static final SubLSymbol $ID_INDEX_RECOUNT_FAILURE = makeKeyword("ID-INDEX-RECOUNT-FAILURE");

    private static final SubLSymbol $DO_ID_INDEX_FAILURE = makeKeyword("DO-ID-INDEX-FAILURE");

    private static final SubLSymbol $ID_INDEX_LOOKUP_FAILURE = makeKeyword("ID-INDEX-LOOKUP-FAILURE");

    private static final SubLSymbol $ID_INDEX_COUNT_FAILURE = makeKeyword("ID-INDEX-COUNT-FAILURE");

    private static final SubLSymbol $INITIAL_ID_INDEX_COUNT_FAILURE = makeKeyword("INITIAL-ID-INDEX-COUNT-FAILURE");



    private static final SubLSymbol TEST_PESSIMIZE_ID_INDEX = makeSymbol("TEST-PESSIMIZE-ID-INDEX");

    private static final SubLList $list222 = list(list(NIL, makeKeyword("SUCCESS")));

    private static final SubLList $list223 = list(makeInteger(100), makeInteger(1000), makeInteger(10000), makeInteger(100000), makeInteger(1000000));

    private static final SubLInteger $int$212 = makeInteger(212);

    static final boolean assertionsDisabledSynth = true;

    public static SubLObject id_index_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_id_index(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject id_index_p(final SubLObject v_object) {
        return v_object.getClass() == id_index.$id_index_native.class ? T : NIL;
    }

    public static SubLObject idix_lock(final SubLObject v_object) {
        assert NIL != id_index_p(v_object) : "id_index.id_index_p(v_object) " + "CommonSymbols.NIL != id_index.id_index_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject idix_count(final SubLObject v_object) {
        assert NIL != id_index_p(v_object) : "id_index.id_index_p(v_object) " + "CommonSymbols.NIL != id_index.id_index_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject idix_next_id(final SubLObject v_object) {
        assert NIL != id_index_p(v_object) : "id_index.id_index_p(v_object) " + "CommonSymbols.NIL != id_index.id_index_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject idix_dense_objects(final SubLObject v_object) {
        assert NIL != id_index_p(v_object) : "id_index.id_index_p(v_object) " + "CommonSymbols.NIL != id_index.id_index_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject idix_sparse_objects(final SubLObject v_object) {
        assert NIL != id_index_p(v_object) : "id_index.id_index_p(v_object) " + "CommonSymbols.NIL != id_index.id_index_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_idix_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != id_index_p(v_object) : "id_index.id_index_p(v_object) " + "CommonSymbols.NIL != id_index.id_index_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_idix_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != id_index_p(v_object) : "id_index.id_index_p(v_object) " + "CommonSymbols.NIL != id_index.id_index_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_idix_next_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != id_index_p(v_object) : "id_index.id_index_p(v_object) " + "CommonSymbols.NIL != id_index.id_index_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_idix_dense_objects(final SubLObject v_object, final SubLObject value) {
        assert NIL != id_index_p(v_object) : "id_index.id_index_p(v_object) " + "CommonSymbols.NIL != id_index.id_index_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_idix_sparse_objects(final SubLObject v_object, final SubLObject value) {
        assert NIL != id_index_p(v_object) : "id_index.id_index_p(v_object) " + "CommonSymbols.NIL != id_index.id_index_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_id_index(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new id_index.$id_index_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                _csetf_idix_lock(v_new, current_value);
            } else
                if (pcase_var.eql($COUNT)) {
                    _csetf_idix_count(v_new, current_value);
                } else
                    if (pcase_var.eql($NEXT_ID)) {
                        _csetf_idix_next_id(v_new, current_value);
                    } else
                        if (pcase_var.eql($DENSE_OBJECTS)) {
                            _csetf_idix_dense_objects(v_new, current_value);
                        } else
                            if (pcase_var.eql($SPARSE_OBJECTS)) {
                                _csetf_idix_sparse_objects(v_new, current_value);
                            } else {
                                Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_id_index(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ID_INDEX, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, idix_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $COUNT, idix_count(obj));
        funcall(visitor_fn, obj, $SLOT, $NEXT_ID, idix_next_id(obj));
        funcall(visitor_fn, obj, $SLOT, $DENSE_OBJECTS, idix_dense_objects(obj));
        funcall(visitor_fn, obj, $SLOT, $SPARSE_OBJECTS, idix_sparse_objects(obj));
        funcall(visitor_fn, obj, $END, MAKE_ID_INDEX, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_id_index_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_id_index(obj, visitor_fn);
    }

    public static SubLObject print_id_index(final SubLObject v_id_index, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_id_index, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_id_index, T, T);
            write_string($str30$COUNT_, stream, UNPROVIDED, UNPROVIDED);
            princ(id_index_count(v_id_index), stream);
            princ($str31$_NEXT_, stream);
            princ(id_index_next_id(v_id_index), stream);
            print_macros.print_unreadable_object_postamble(stream, v_id_index, NIL, NIL);
        }
        return v_id_index;
    }

    public static SubLObject id_index_count(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        return idix_count(v_id_index);
    }

    public static SubLObject id_index_empty_p(final SubLObject v_id_index) {
        return numE(ZERO_INTEGER, id_index_count(v_id_index));
    }

    public static SubLObject id_index_dense_object_count(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        return subtract(id_index_count(v_id_index), id_index_sparse_object_count(v_id_index));
    }

    public static SubLObject id_index_sparse_object_count(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        return hash_table_count(id_index_sparse_objects(v_id_index));
    }

    public static SubLObject id_index_sparse_id_threshold(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        return length(id_index_dense_objects(v_id_index));
    }

    public static SubLObject id_index_next_id(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        return idix_next_id(v_id_index);
    }

    public static SubLObject set_id_index_next_id(final SubLObject v_id_index, final SubLObject next_id) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        assert NIL != integerp(next_id) : "Types.integerp(next_id) " + "CommonSymbols.NIL != Types.integerp(next_id) " + next_id;
        if (next_id.numL(idix_next_id(v_id_index)) && (NIL != subl_promotions.positive_integer_p(idix_count(v_id_index)))) {
            Errors.warn($str33$_A_has_had_next_id_reduced_from__, v_id_index, idix_next_id(v_id_index), next_id);
        }
        _csetf_idix_next_id(v_id_index, next_id);
        return next_id;
    }

    public static SubLObject id_index_dense_objects(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        return idix_dense_objects(v_id_index);
    }

    public static SubLObject id_index_sparse_objects(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        return idix_sparse_objects(v_id_index);
    }

    public static SubLObject with_id_index_locked(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_id_index = NIL;
        destructuring_bind_must_consp(current, datum, $list38);
        v_id_index = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject id_index_lock = $sym39$ID_INDEX_LOCK;
        return list(CLET, list(list(id_index_lock, list(ID_INDEX_LOCK, v_id_index))), listS(WITH_LOCK_HELD, list(id_index_lock), append(body, NIL)));
    }

    public static SubLObject id_index_lock(final SubLObject v_id_index) {
        return idix_lock(v_id_index);
    }

    public static SubLObject convert_id_index_key_test(final SubLObject v_id_index, SubLObject from, SubLObject to) {
        if (from == UNPROVIDED) {
            from = EQL;
        }
        if (to == UNPROVIDED) {
            to = EQ;
        }
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        final SubLObject sparse_objects_table = id_index_sparse_objects(v_id_index);
        if (sparse_objects_table.isHashtable()) {
            final SubLObject test = hash_table_utilities.hash_test_to_symbol(hash_table_test(sparse_objects_table));
            final SubLObject from_test = hash_table_utilities.hash_test_to_symbol(from);
            if (from_test.eql(test)) {
                final SubLObject sparse_table = make_hash_table(hash_table_size(sparse_objects_table), to, UNPROVIDED);
                SubLObject key = NIL;
                SubLObject value = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(sparse_objects_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        value = getEntryValue(cdohash_entry);
                        sethash(key, sparse_table, value);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
                _csetf_idix_sparse_objects(v_id_index, sparse_table);
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject new_id_index(SubLObject dense_objects_size, SubLObject initial_next_id) {
        if (dense_objects_size == UNPROVIDED) {
            dense_objects_size = ZERO_INTEGER;
        }
        if (initial_next_id == UNPROVIDED) {
            initial_next_id = ZERO_INTEGER;
        }
        assert NIL != subl_promotions.non_negative_integer_p(initial_next_id) : "subl_promotions.non_negative_integer_p(initial_next_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(initial_next_id) " + initial_next_id;
        assert NIL != subl_promotions.non_negative_integer_p(dense_objects_size) : "subl_promotions.non_negative_integer_p(dense_objects_size) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(dense_objects_size) " + dense_objects_size;
        final SubLObject sparse_objects_size = max(TEN_INTEGER, integerDivide(dense_objects_size, $id_index_default_scaling_factor$.getGlobalValue()));
        final SubLObject v_id_index = make_id_index(UNPROVIDED);
        final SubLObject lock = make_lock($str46$ID_INDEX);
        final SubLObject dense_objects = make_vector(dense_objects_size, NIL);
        final SubLObject sparse_objects = make_hash_table(sparse_objects_size, $id_index_equality_test$.getGlobalValue(), UNPROVIDED);
        _csetf_idix_lock(v_id_index, lock);
        _csetf_idix_count(v_id_index, ZERO_INTEGER);
        _csetf_idix_next_id(v_id_index, initial_next_id);
        _csetf_idix_dense_objects(v_id_index, dense_objects);
        _csetf_idix_sparse_objects(v_id_index, sparse_objects);
        return v_id_index;
    }

    public static SubLObject id_index_reserve(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        SubLObject id = NIL;
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = NIL;
        try {
            release = seize_lock(id_index_lock);
            final SubLObject next_id = id_index_next_id(v_id_index);
            _csetf_idix_next_id(v_id_index, add(idix_next_id(v_id_index), ONE_INTEGER));
            id = next_id;
        } finally {
            if (NIL != release) {
                release_lock(id_index_lock);
            }
        }
        return id;
    }

    public static SubLObject id_index_empty_list() {
        return $id_index_empty_list$.getGlobalValue();
    }

    public static SubLObject id_index_empty_list_p(final SubLObject v_object) {
        return uninterned_symbols_with_same_name_p(v_object, id_index_empty_list());
    }

    public static SubLObject uninterned_symbols_with_same_name_p(final SubLObject symbol1, final SubLObject symbol2) {
        return makeBoolean((symbol1.isSymbol() && (NIL == symbol_package(symbol1))) && (symbol1.eql(symbol2) || ((symbol2.isSymbol() && (NIL == symbol_package(symbol2))) && symbol_name(symbol1).equal(symbol_name(symbol2)))));
    }

    public static SubLObject id_index_tombstone() {
        return NIL;
    }

    public static SubLObject id_index_tombstone_p(final SubLObject v_object) {
        return eq(v_object, id_index_tombstone());
    }

    public static SubLObject id_index_lookup(final SubLObject v_id_index, final SubLObject id, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLObject result = id_index_lookup_int(v_id_index, id);
        if (NIL != id_index_tombstone_p(result)) {
            return v_default;
        }
        if (NIL != id_index_empty_list_p(result)) {
            return NIL;
        }
        return result;
    }

    public static SubLObject id_index_lookup_int(final SubLObject v_id_index, final SubLObject id) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        assert NIL != integerp(id) : "Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) " + id;
        if (NIL != id_index_dense_object_id_p(v_id_index, id)) {
            final SubLObject dense_objects = id_index_dense_objects(v_id_index);
            return aref(dense_objects, id);
        }
        final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
        return gethash_without_values(id, sparse_objects, NIL);
    }

    public static SubLObject id_index_enter(final SubLObject v_id_index, final SubLObject id, final SubLObject v_object) {
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = NIL;
        try {
            release = seize_lock(id_index_lock);
            id_index_enter_unlocked(v_id_index, id, v_object);
        } finally {
            if (NIL != release) {
                release_lock(id_index_lock);
            }
        }
        return v_id_index;
    }

    public static SubLObject id_index_enter_unlocked(final SubLObject v_id_index, final SubLObject id, final SubLObject v_object) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        assert NIL != integerp(id) : "Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) " + id;
        final SubLObject existing = id_index_lookup_int(v_id_index, id);
        final SubLObject dwimmed_object = (NIL != v_object) ? v_object : id_index_empty_list();
        if (NIL != id_index_dense_object_id_p(v_id_index, id)) {
            final SubLObject dense_objects = id_index_dense_objects(v_id_index);
            set_aref(dense_objects, id, dwimmed_object);
        } else {
            final SubLObject sparse_objects = get_appropriate_id_index_sparse_objects(v_id_index, id);
            sethash(id, sparse_objects, dwimmed_object);
        }
        if (NIL != id_index_tombstone_p(existing)) {
            _csetf_idix_count(v_id_index, add(idix_count(v_id_index), ONE_INTEGER));
        }
        if (id.numGE(idix_next_id(v_id_index))) {
            _csetf_idix_next_id(v_id_index, add(ONE_INTEGER, id));
        }
        return v_id_index;
    }

    public static SubLObject get_appropriate_id_index_sparse_objects(final SubLObject v_id_index, final SubLObject id) {
        SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
        if (!id.isFixnum()) {
            convert_id_index_key_test(v_id_index, EQ, EQL);
            sparse_objects = id_index_sparse_objects(v_id_index);
        }
        return sparse_objects;
    }

    public static SubLObject id_index_enter_autoextend(final SubLObject v_id_index, final SubLObject id, final SubLObject v_object, SubLObject extend_if_pessimizedP) {
        if (extend_if_pessimizedP == UNPROVIDED) {
            extend_if_pessimizedP = T;
        }
        id_index_enter(v_id_index, id, v_object);
        return id_index_possibly_autoextend(v_id_index, id, extend_if_pessimizedP);
    }

    public static SubLObject id_index_enter_unlocked_autoextend(final SubLObject v_id_index, final SubLObject id, final SubLObject v_object, SubLObject extend_if_pessimizedP) {
        if (extend_if_pessimizedP == UNPROVIDED) {
            extend_if_pessimizedP = T;
        }
        id_index_enter_unlocked(v_id_index, id, v_object);
        return id_index_possibly_autoextend(v_id_index, id, extend_if_pessimizedP);
    }

    public static SubLObject id_index_possibly_autoextend(final SubLObject v_id_index, final SubLObject id, final SubLObject extend_if_pessimizedP) {
        if ((NIL == extend_if_pessimizedP) && (NIL != id_index_pessimized_p(v_id_index))) {
            return v_id_index;
        }
        final SubLObject threshold = id_index_sparse_id_threshold(v_id_index);
        if (number_utilities.f_1X(id).numGE(threshold)) {
            optimize_id_index(v_id_index, number_utilities.f_2X(max(threshold, id)));
        }
        return v_id_index;
    }

    public static SubLObject id_index_remove(final SubLObject v_id_index, final SubLObject id) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        assert NIL != integerp(id) : "Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) " + id;
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = NIL;
        try {
            release = seize_lock(id_index_lock);
            final SubLObject existing = id_index_lookup_int(v_id_index, id);
            if (NIL != id_index_dense_object_id_p(v_id_index, id)) {
                final SubLObject dense_objects = id_index_dense_objects(v_id_index);
                set_aref(dense_objects, id, id_index_tombstone());
            } else {
                final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
                remhash(id, sparse_objects);
            }
            if (NIL == id_index_tombstone_p(existing)) {
                _csetf_idix_count(v_id_index, subtract(idix_count(v_id_index), ONE_INTEGER));
            }
        } finally {
            if (NIL != release) {
                release_lock(id_index_lock);
            }
        }
        return v_id_index;
    }

    public static SubLObject clear_id_index(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = NIL;
        try {
            release = seize_lock(id_index_lock);
            _csetf_idix_count(v_id_index, ZERO_INTEGER);
            fill(id_index_dense_objects(v_id_index), NIL, UNPROVIDED, UNPROVIDED);
            clrhash(id_index_sparse_objects(v_id_index));
        } finally {
            if (NIL != release) {
                release_lock(id_index_lock);
            }
        }
        return v_id_index;
    }

    public static SubLObject fill_id_index_dense_space(final SubLObject v_id_index, final SubLObject value, SubLObject end) {
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = NIL;
        try {
            release = seize_lock(id_index_lock);
            if (NIL == end) {
                end = length(id_index_dense_objects(v_id_index));
            }
            if (end.isZero()) {
                return v_id_index;
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == id_index_dense_object_id_p(v_id_index, subtract(end, ONE_INTEGER)))) {
                Errors.error($str51$Fill_cannot_extend_into_sparse_sp);
            }
            fill(id_index_dense_objects(v_id_index), value, ZERO_INTEGER, end);
            if (id_index_next_id(v_id_index).numL(end)) {
                set_id_index_next_id(v_id_index, end);
            }
            if (id_index_count(v_id_index).numL(end)) {
                _csetf_idix_count(v_id_index, end);
            }
        } finally {
            if (NIL != release) {
                release_lock(id_index_lock);
            }
        }
        return v_id_index;
    }

    public static SubLObject id_index_dense_object_id_p(final SubLObject v_id_index, final SubLObject id) {
        return makeBoolean((!id.isNegative()) && id.numL(id_index_sparse_id_threshold(v_id_index)));
    }

    public static SubLObject new_id_index_iterator(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        return iteration.new_factory_iterator($list52, list(v_id_index), UNPROVIDED);
    }

    public static SubLObject new_id_index_values_iterator(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        return iteration.new_factory_iterator($list53, list(v_id_index), UNPROVIDED);
    }

    public static SubLObject new_id_index_ordered_iterator(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        return iteration.new_factory_iterator($list54, list(v_id_index), UNPROVIDED);
    }

    public static SubLObject new_id_index_dense_objects_iterator(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        final SubLObject dense_objects = id_index_dense_objects(v_id_index);
        final SubLObject subiterator = iteration.new_vector_index_iterator(dense_objects);
        return iteration.new_filter_iterator(subiterator, ITERATE_ID_INDEX_DENSE_OBJECTS_NECESSARY, UNPROVIDED);
    }

    public static SubLObject iterate_id_index_dense_objects_necessary(final SubLObject entry) {
        SubLObject id = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(entry, entry, $list56);
        id = entry.first();
        SubLObject current = entry.rest();
        destructuring_bind_must_consp(current, entry, $list56);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean(NIL == id_index_tombstone_p(value));
        }
        cdestructuring_bind_error(entry, $list56);
        return NIL;
    }

    public static SubLObject new_id_index_dense_objects_values_iterator(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        final SubLObject dense_objects = id_index_dense_objects(v_id_index);
        final SubLObject subiterator = iteration.new_vector_iterator(dense_objects);
        return iteration.new_filter_iterator(subiterator, BOOLEAN, UNPROVIDED);
    }

    public static SubLObject new_id_index_sparse_objects_iterator(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
        return iteration.new_hash_table_iterator(sparse_objects);
    }

    public static SubLObject new_id_index_sparse_objects_values_iterator(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
        return iteration.new_hash_table_values_iterator(sparse_objects);
    }

    public static SubLObject new_id_index_sparse_objects_ordered_iterator(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        if (NIL != id_index_sparse_objects_empty_p(v_id_index)) {
            return iteration.new_null_iterator();
        }
        return iteration.new_iterator(make_id_index_sparse_objects_ordered_iterator_state(v_id_index), $sym58$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_DONE_, ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject make_id_index_sparse_objects_ordered_iterator_state(final SubLObject v_id_index) {
        final SubLObject id = id_index_sparse_id_threshold(v_id_index);
        final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
        final SubLObject end_id = id_index_next_id(v_id_index);
        final SubLObject key_value_tuple = list($KEY, $VALUE);
        return list(id, sparse_objects, end_id, key_value_tuple);
    }

    public static SubLObject id_index_sparse_objects_ordered_iterator_doneP(final SubLObject state) {
        SubLObject id = NIL;
        SubLObject sparse_objects = NIL;
        SubLObject end_id = NIL;
        SubLObject key_value_tuple = NIL;
        destructuring_bind_must_consp(state, state, $list62);
        id = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list62);
        sparse_objects = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list62);
        end_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list62);
        key_value_tuple = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean(!id.numL(end_id));
        }
        cdestructuring_bind_error(state, $list62);
        return NIL;
    }

    public static SubLObject id_index_sparse_objects_ordered_iterator_next(final SubLObject state) {
        SubLObject id = NIL;
        SubLObject sparse_objects = NIL;
        SubLObject end_id = NIL;
        SubLObject key_value_tuple = NIL;
        destructuring_bind_must_consp(state, state, $list62);
        id = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list62);
        sparse_objects = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list62);
        end_id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list62);
        key_value_tuple = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject v_object = id_index_tombstone();
            SubLObject spot = id;
            while (id.numL(end_id) && (NIL != id_index_tombstone_p(v_object))) {
                v_object = gethash_without_values(id, sparse_objects, id_index_tombstone());
                spot = id;
                id = add(id, ONE_INTEGER);
            } 
            set_nth(ZERO_INTEGER, state, id);
            set_nth(ZERO_INTEGER, key_value_tuple, spot);
            set_nth(ONE_INTEGER, key_value_tuple, v_object);
            return values(key_value_tuple, state, id_index_sparse_objects_ordered_iterator_doneP(state));
        }
        cdestructuring_bind_error(state, $list62);
        return NIL;
    }

    public static SubLObject do_id_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list63);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = NIL;
        SubLObject v_object = NIL;
        SubLObject v_id_index = NIL;
        destructuring_bind_must_consp(current, datum, $list63);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list63);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list63);
        v_id_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list63);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list63);
            if (NIL == member(current_$1, $list64, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list63);
        }
        final SubLObject tombstone_tail = property_list_member($TOMBSTONE, current);
        final SubLObject tombstone = (NIL != tombstone_tail) ? cadr(tombstone_tail) : $SKIP;
        final SubLObject ordered_tail = property_list_member($ORDERED, current);
        final SubLObject ordered = (NIL != ordered_tail) ? cadr(ordered_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(OLD_DO_ID_INDEX, list(new SubLObject[]{ id, v_object, v_id_index, $TOMBSTONE, tombstone, $ORDERED, ordered, $PROGRESS_MESSAGE, progress_message, $DONE, done }), append(body, NIL));
    }

    public static SubLObject old_do_id_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list63);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = NIL;
        SubLObject v_object = NIL;
        SubLObject v_id_index = NIL;
        destructuring_bind_must_consp(current, datum, $list63);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list63);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list63);
        v_id_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list63);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list63);
            if (NIL == member(current_$2, $list64, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list63);
        }
        final SubLObject tombstone_tail = property_list_member($TOMBSTONE, current);
        final SubLObject tombstone = (NIL != tombstone_tail) ? cadr(tombstone_tail) : $SKIP;
        final SubLObject ordered_tail = property_list_member($ORDERED, current);
        final SubLObject ordered = (NIL != ordered_tail) ? cadr(ordered_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL == progress_message) {
            final SubLObject idx = $sym72$IDX;
            return list(CLET, list(list(idx, v_id_index)), list(PUNLESS, list(ID_INDEX_OBJECTS_EMPTY_P, idx, tombstone), listS(DO_ID_INDEX_DENSE_OBJECTS, list(id, v_object, idx, $DONE, done, $TOMBSTONE, tombstone), append(body, NIL)), listS(DO_ID_INDEX_SPARSE_OBJECTS, list(new SubLObject[]{ id, v_object, idx, $ORDERED, ordered, $TOMBSTONE, tombstone, $DONE, done }), append(body, NIL))));
        }
        final SubLObject idx = $sym75$IDX;
        final SubLObject mess = $sym76$MESS;
        final SubLObject total = $sym77$TOTAL;
        final SubLObject sofar = $sym78$SOFAR;
        return list(CLET, list(list(idx, v_id_index), list(mess, progress_message), list(total, list(ID_INDEX_COUNT, idx)), bq_cons(sofar, $list80)), listS(CHECK_TYPE, mess, $list82), list(NOTING_PERCENT_PROGRESS, mess, listS(DO_ID_INDEX, list(id, v_object, idx, $DONE, done, $ORDERED, ordered), append(body, list(list(CINC, sofar), list(NOTE_PERCENT_PROGRESS, sofar, total))))));
    }

    public static SubLObject id_index_objects_empty_p(final SubLObject v_id_index, final SubLObject tombstone) {
        if (NIL != id_index_skip_tombstones_p(tombstone)) {
            return id_index_empty_p(v_id_index);
        }
        return NIL;
    }

    public static SubLObject do_id_index_dense_objects(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list86);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = NIL;
        SubLObject v_object = NIL;
        SubLObject v_id_index = NIL;
        destructuring_bind_must_consp(current, datum, $list86);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list86);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list86);
        v_id_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list86);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list86);
            if (NIL == member(current_$3, $list87, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list86);
        }
        final SubLObject tombstone_tail = property_list_member($TOMBSTONE, current);
        final SubLObject tombstone = (NIL != tombstone_tail) ? cadr(tombstone_tail) : $SKIP;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL == progress_message) {
            final SubLObject idx = $sym88$IDX;
            return list(CLET, list(list(idx, v_id_index)), list(PUNLESS, list(ID_INDEX_DENSE_OBJECTS_EMPTY_P, idx, tombstone), list(DO_VECTOR_INDEX, list(id, v_object, list(ID_INDEX_DENSE_OBJECTS, idx), $DONE, done), listS(PUNLESS, list(CAND, list(ID_INDEX_TOMBSTONE_P, v_object), list(ID_INDEX_SKIP_TOMBSTONES_P, tombstone)), list(PWHEN, list(ID_INDEX_TOMBSTONE_P, v_object), list(CSETQ, v_object, tombstone)), append(body, NIL)))));
        }
        final SubLObject idx = $sym95$IDX;
        final SubLObject mess = $sym96$MESS;
        final SubLObject total = $sym97$TOTAL;
        final SubLObject sofar = $sym98$SOFAR;
        return list(CLET, list(list(idx, v_id_index), list(mess, progress_message), list(total, list(ID_INDEX_DENSE_OBJECT_COUNT, idx)), bq_cons(sofar, $list80)), listS(CHECK_TYPE, mess, $list82), list(NOTING_PERCENT_PROGRESS, mess, listS(DO_ID_INDEX_DENSE_OBJECTS, list(id, v_object, idx, $DONE, done), append(body, list(list(CINC, sofar), list(NOTE_PERCENT_PROGRESS, sofar, total))))));
    }

    public static SubLObject id_index_dense_objects_empty_p(final SubLObject v_id_index, final SubLObject tombstone) {
        if (NIL != id_index_skip_tombstones_p(tombstone)) {
            return numE(ZERO_INTEGER, id_index_dense_object_count(v_id_index));
        }
        return NIL;
    }

    public static SubLObject id_index_skip_tombstones_p(final SubLObject tombstone) {
        return eq($SKIP, tombstone);
    }

    public static SubLObject do_id_index_sparse_objects(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list63);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = NIL;
        SubLObject v_object = NIL;
        SubLObject v_id_index = NIL;
        destructuring_bind_must_consp(current, datum, $list63);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list63);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list63);
        v_id_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list63);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list63);
            if (NIL == member(current_$4, $list64, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list63);
        }
        final SubLObject tombstone_tail = property_list_member($TOMBSTONE, current);
        final SubLObject tombstone = (NIL != tombstone_tail) ? cadr(tombstone_tail) : $SKIP;
        final SubLObject ordered_tail = property_list_member($ORDERED, current);
        final SubLObject ordered = (NIL != ordered_tail) ? cadr(ordered_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL != progress_message) {
            final SubLObject idx = $sym101$IDX;
            final SubLObject mess = $sym102$MESS;
            final SubLObject total = $sym103$TOTAL;
            final SubLObject sofar = $sym104$SOFAR;
            return list(CLET, list(list(idx, v_id_index), list(mess, progress_message), list(total, list(ID_INDEX_SPARSE_OBJECT_COUNT, idx)), bq_cons(sofar, $list80)), listS(CHECK_TYPE, mess, $list82), list(NOTING_PERCENT_PROGRESS, mess, listS(DO_ID_INDEX_SPARSE_OBJECTS, list(id, v_object, idx, $ORDERED, ordered, $DONE, done), append(body, list(list(CINC, sofar), list(NOTE_PERCENT_PROGRESS, sofar, total))))));
        }
        if (((NIL != ordered) && (T != ordered)) && (NIL != ordered)) {
            final SubLObject idx = $sym106$IDX;
            return list(CLET, list(list(idx, v_id_index)), list(PIF, ordered, listS(DO_ID_INDEX_SPARSE_OBJECTS, list(id, v_object, idx, $ORDERED, T, $DONE, done), append(body, NIL)), listS(DO_ID_INDEX_SPARSE_OBJECTS, list(id, v_object, idx, $ORDERED, NIL, $DONE, done), append(body, NIL))));
        }
        if (T == ordered) {
            final SubLObject idx = $sym108$IDX;
            final SubLObject sparse = $sym109$SPARSE;
            final SubLObject end_id = $sym110$END_ID;
            final SubLObject v_default = $sym111$DEFAULT;
            return list(CLET, list(list(idx, v_id_index)), list(PUNLESS, list(CAND, list(ID_INDEX_SPARSE_OBJECTS_EMPTY_P, idx), list(ID_INDEX_SKIP_TOMBSTONES_P, tombstone)), list(CLET, list(list(sparse, list(ID_INDEX_SPARSE_OBJECTS, idx)), list(id, list(ID_INDEX_SPARSE_ID_THRESHOLD, idx)), list(end_id, list(ID_INDEX_NEXT_ID, idx)), list(v_default, list(FUNLESS, list(ID_INDEX_SKIP_TOMBSTONES_P, tombstone), tombstone))), list(WHILE, list(CAND, list($sym117$_, id, end_id), list(CNOT, done)), list(CLET, list(list(v_object, list(GETHASH_WITHOUT_VALUES, id, sparse, v_default))), listS(PUNLESS, list(CAND, list(ID_INDEX_SKIP_TOMBSTONES_P, tombstone), list(ID_INDEX_TOMBSTONE_P, v_object)), append(body, NIL))), list(CINC, id)))));
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($SKIP != tombstone)) {
            Errors.error($str120$Setting__TOMBSTONE_to__A_requires, tombstone);
        }
        final SubLObject idx = $sym121$IDX;
        return list(CLET, list(list(idx, v_id_index)), list(PUNLESS, list(ID_INDEX_SPARSE_OBJECTS_EMPTY_P, idx), listS(DO_HASH_TABLE, list(id, v_object, list(ID_INDEX_SPARSE_OBJECTS, idx), $DONE, done), append(body, NIL))));
    }

    public static SubLObject id_index_sparse_objects_empty_p(final SubLObject v_id_index) {
        return numE(ZERO_INTEGER, id_index_sparse_object_count(v_id_index));
    }

    public static SubLObject id_index_sparse_object_ids(final SubLObject v_id_index) {
        final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
        final SubLObject ids = hash_table_utilities.hash_table_keys(sparse_objects);
        return Sort.sort(ids, symbol_function($sym117$_), UNPROVIDED);
    }

    public static SubLObject new_do_id_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list124);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id = NIL;
        SubLObject v_object = NIL;
        SubLObject v_id_index = NIL;
        destructuring_bind_must_consp(current, datum, $list124);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list124);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list124);
        v_id_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list124);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list124);
            if (NIL == member(current_$5, $list125, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list124);
        }
        final SubLObject start_id_tail = property_list_member($START_ID, current);
        final SubLObject start_id = (NIL != start_id_tail) ? cadr(start_id_tail) : NIL;
        final SubLObject end_id_tail = property_list_member($END_ID, current);
        final SubLObject end_id = (NIL != end_id_tail) ? cadr(end_id_tail) : NIL;
        final SubLObject tombstone_tail = property_list_member($TOMBSTONE, current);
        final SubLObject tombstone = (NIL != tombstone_tail) ? cadr(tombstone_tail) : $SKIP;
        final SubLObject ordered_tail = property_list_member($ORDERED, current);
        final SubLObject ordered = (NIL != ordered_tail) ? cadr(ordered_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (!v_id_index.isAtom()) {
            final SubLObject idx = $sym128$IDX;
            return list(CLET, list(list(idx, v_id_index)), listS(NEW_DO_ID_INDEX, list(new SubLObject[]{ id, v_object, idx, $START_ID, start_id, $END_ID, end_id, $TOMBSTONE, tombstone, $ORDERED, ordered, $PROGRESS_MESSAGE, progress_message, $DONE, done }), append(body, NIL)));
        }
        if (!progress_message.isAtom()) {
            final SubLObject mess = $sym130$MESS;
            return list(CLET, list(list(mess, progress_message)), listS(NEW_DO_ID_INDEX, list(new SubLObject[]{ id, v_object, v_id_index, $START_ID, start_id, $END_ID, end_id, $TOMBSTONE, tombstone, $ORDERED, ordered, $PROGRESS_MESSAGE, mess, $DONE, done }), append(body, NIL)));
        }
        if (NIL != progress_message) {
            final SubLObject total = $sym131$TOTAL;
            final SubLObject sofar = $sym132$SOFAR;
            return list(CLET, list(list(total, list(ID_INDEX_COUNT, v_id_index)), bq_cons(sofar, $list80)), listS(CHECK_TYPE, progress_message, $list82), list(NOTING_PERCENT_PROGRESS, progress_message, listS(NEW_DO_ID_INDEX, list(new SubLObject[]{ id, v_object, v_id_index, $START_ID, start_id, $END_ID, end_id, $TOMBSTONE, tombstone, $ORDERED, ordered, $DONE, done }), append(body, list(list(CINC, sofar), list(NOTE_PERCENT_PROGRESS, sofar, total))))));
        }
        if (!tombstone.isAtom()) {
            final SubLObject tomb = $sym133$TOMB;
            return list(CLET, list(list(tomb, tombstone)), listS(NEW_DO_ID_INDEX, list(new SubLObject[]{ id, v_object, v_id_index, $START_ID, start_id, $END_ID, end_id, $TOMBSTONE, tomb, $ORDERED, ordered, $DONE, done }), append(body, NIL)));
        }
        if (!ordered.isAtom()) {
            final SubLObject ord = $sym134$ORD;
            return list(CLET, list(list(ord, ordered)), listS(NEW_DO_ID_INDEX, list(new SubLObject[]{ id, v_object, v_id_index, $START_ID, start_id, $END_ID, end_id, $TOMBSTONE, tombstone, $ORDERED, ord, $DONE, done }), append(body, NIL)));
        }
        final SubLObject last_id = $sym135$LAST_ID;
        final SubLObject state_var = $sym136$STATE_VAR;
        SubLObject loop_form = id;
        if (NIL != done) {
            loop_form = list(CAND, loop_form, list(CNOT, done));
        }
        if (NIL != subl_promotions.non_negative_integer_p(end_id)) {
            loop_form = list(CAND, loop_form, list($sym137$__, id, end_id));
        }
        return list(PUNLESS, list(ID_INDEX_OBJECTS_EMPTY_P, v_id_index, tombstone), list(CLET, list(list(last_id, listS(FIF, list(NON_NEGATIVE_INTEGER_P, start_id), listS($sym139$_, start_id, $list140), $list141)), list(id, listS(DO_ID_INDEX_NEXT_ID, v_id_index, ordered, last_id, $list141)), list(state_var, listS(DO_ID_INDEX_NEXT_STATE, v_id_index, ordered, id, $list141)), v_object), list(WHILE, loop_form, list(CSETQ, v_object, list(DO_ID_INDEX_STATE_OBJECT, v_id_index, tombstone, id, state_var)), listS(PWHEN, list($sym145$DO_ID_INDEX_OBJECT_VALID_, v_object, tombstone), append(body, NIL)), list(CSETQ, id, list(DO_ID_INDEX_NEXT_ID, v_id_index, ordered, id, state_var)), list(CSETQ, state_var, list(DO_ID_INDEX_NEXT_STATE, v_id_index, ordered, id, state_var)))));
    }

    public static SubLObject do_id_index_next_id(final SubLObject v_id_index, final SubLObject orderedP, final SubLObject last_id, final SubLObject state) {
        if (NIL == state) {
            return ZERO_INTEGER;
        }
        if (NIL == last_id) {
            return NIL;
        }
        final SubLObject next_id = number_utilities.f_1X(last_id);
        if (next_id.numGE(id_index_next_id(v_id_index))) {
            return NIL;
        }
        return next_id;
    }

    public static SubLObject do_id_index_next_state(final SubLObject v_id_index, final SubLObject orderedP, final SubLObject id, final SubLObject state) {
        if (NIL == id) {
            return NIL;
        }
        if (NIL == state) {
            return NIL != id_index_dense_object_id_p(v_id_index, id) ? id_index_dense_objects(v_id_index) : id_index_sparse_objects(v_id_index);
        }
        if (NIL != id_index_dense_object_id_p(v_id_index, id)) {
            return state.isVector() ? state : id_index_dense_objects(v_id_index);
        }
        if (state.isVector()) {
            return id_index_sparse_objects(v_id_index);
        }
        return state;
    }

    public static SubLObject do_id_index_state_object(final SubLObject v_id_index, final SubLObject tombstone, final SubLObject id, final SubLObject state) {
        SubLObject v_object = NIL;
        if (state.isVector()) {
            v_object = aref(state, id);
        } else
            if (state.isHashtable()) {
                v_object = gethash_without_values(id, state, id_index_tombstone());
            } else {
                Errors.error($str146$unexpected_new_do_id_index_iterat, state);
            }

        if (NIL != id_index_tombstone_p(v_object)) {
            v_object = tombstone;
        }
        return v_object;
    }

    public static SubLObject do_id_index_object_validP(final SubLObject v_object, final SubLObject tombstone) {
        return makeBoolean((NIL == id_index_skip_tombstones_p(tombstone)) || (!v_object.eql(tombstone)));
    }

    public static SubLObject id_index_old_and_new_object_counts(final SubLObject v_id_index, SubLObject new_id_threshhold) {
        if (new_id_threshhold == UNPROVIDED) {
            new_id_threshhold = NIL;
        }
        final SubLObject sparse_id_threshold = id_index_sparse_id_threshold(v_id_index);
        SubLObject new_count = ZERO_INTEGER;
        SubLObject old_count = NIL;
        if (NIL == new_id_threshhold) {
            new_id_threshhold = sparse_id_threshold;
        }
        if (new_id_threshhold.numL(sparse_id_threshold)) {
            final SubLObject dense_objects = id_index_dense_objects(v_id_index);
            SubLObject end_var;
            SubLObject dense_id;
            SubLObject v_object;
            for (end_var = id_index_sparse_id_threshold(v_id_index), dense_id = NIL, dense_id = new_id_threshhold; !dense_id.numGE(end_var); dense_id = number_utilities.f_1X(dense_id)) {
                v_object = aref(dense_objects, dense_id);
                if (NIL != v_object) {
                    new_count = add(new_count, ONE_INTEGER);
                }
            }
        }
        new_count = add(new_count, id_index_sparse_object_count(v_id_index));
        old_count = subtract(id_index_count(v_id_index), new_count);
        return values(old_count, new_count);
    }

    public static SubLObject cfasl_output_object_id_index_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_wide_output_id_index(v_object, stream);
    }

    public static SubLObject cfasl_wide_output_id_index(final SubLObject v_id_index, final SubLObject stream) {
        cfasl_output_wide_opcode($cfasl_wide_opcode_id_index$.getGlobalValue(), stream);
        cfasl_output_id_index_internal(v_id_index, stream);
        return v_id_index;
    }

    public static SubLObject cfasl_output_id_index_internal(final SubLObject v_id_index, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = NIL;
        try {
            release = seize_lock(id_index_lock);
            final SubLObject dense_object_count = id_index_dense_object_count(v_id_index);
            final SubLObject sparse_object_count = id_index_sparse_object_count(v_id_index);
            SubLObject counter = NIL;
            cfasl_output(id_index_count(v_id_index), stream);
            cfasl_output(id_index_sparse_id_threshold(v_id_index), stream);
            cfasl_output(dense_object_count, stream);
            cfasl_output(sparse_object_count, stream);
            counter = ZERO_INTEGER;
            if (NIL == id_index_dense_objects_empty_p(v_id_index, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(v_id_index);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_object;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_object = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_object)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_object)) {
                            v_object = $SKIP;
                        }
                        cfasl_output(id, stream);
                        cfasl_output(v_object, stream);
                        counter = add(counter, ONE_INTEGER);
                    }
                }
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!counter.numE(dense_object_count))) {
                Errors.error($str150$Expected__A_dense_elements__got__, dense_object_count, counter);
            }
            counter = ZERO_INTEGER;
            if (NIL == id_index_sparse_objects_empty_p(v_id_index)) {
                final SubLObject cdohash_table = id_index_sparse_objects(v_id_index);
                SubLObject id2 = NIL;
                SubLObject v_object2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        v_object2 = getEntryValue(cdohash_entry);
                        cfasl_output(id2, stream);
                        cfasl_output(v_object2, stream);
                        counter = add(counter, ONE_INTEGER);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!counter.numE(sparse_object_count))) {
                Errors.error($str151$Expected__A_sparse_elements__got_, sparse_object_count, counter);
            }
        } finally {
            if (NIL != release) {
                release_lock(id_index_lock);
            }
        }
        return v_id_index;
    }

    public static SubLObject cfasl_input_id_index(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject dense_objects_size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject dense_count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject sparse_count = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject v_id_index = new_id_index(dense_objects_size, UNPROVIDED);
        SubLObject i;
        SubLObject id;
        SubLObject v_object;
        for (i = NIL, i = ZERO_INTEGER; i.numL(dense_count); i = add(i, ONE_INTEGER)) {
            id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            v_object = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            id_index_enter(v_id_index, id, v_object);
        }
        for (i = NIL, i = ZERO_INTEGER; i.numL(sparse_count); i = add(i, ONE_INTEGER)) {
            id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            v_object = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            id_index_enter(v_id_index, id, v_object);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!count.numE(id_index_count(v_id_index)))) {
            Errors.error($str152$The_sparse_ID_index_should_have__, count, id_index_count(v_id_index));
        }
        return v_id_index;
    }

    public static SubLObject test_id_index_cfasl_serialization(final SubLObject num_of_dense, final SubLObject num_of_sparse, SubLObject id_to_value_fn, SubLObject testfn) {
        if (id_to_value_fn == UNPROVIDED) {
            id_to_value_fn = TO_STRING;
        }
        if (testfn == UNPROVIDED) {
            testfn = symbol_function(EQUAL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_id_index = new_id_index_for_testing_purposes(num_of_dense, num_of_sparse, id_to_value_fn);
        SubLObject new_id_index = NIL;
        SubLObject tombs;
        SubLObject i;
        for (tombs = max(FIVE_INTEGER, integerDivide(num_of_dense, TWENTY_INTEGER)), i = NIL, i = ZERO_INTEGER; i.numL(tombs); i = add(i, ONE_INTEGER)) {
            id_index_remove(v_id_index, random.random(num_of_dense));
        }
        new_id_index = cfasl_utilities.cfasl_copy_object(v_id_index);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == id_index_p(new_id_index))) {
            Errors.error($str163$We_did_not_get_an_ID_index_back__, new_id_index);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!id_index_count(v_id_index).numE(id_index_count(new_id_index)))) {
            Errors.error($str164$The_dense_ID_index__A_does_not_ha, v_id_index, new_id_index);
        }
        return $SUCCESS;
    }

    public static SubLObject id_index_optimized_p(final SubLObject v_id_index) {
        return numLE(id_index_next_id(v_id_index), id_index_sparse_id_threshold(v_id_index));
    }

    public static SubLObject optimize_id_index(final SubLObject v_id_index, SubLObject size) {
        if (size == UNPROVIDED) {
            size = NIL;
        }
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        if (((NIL != size) && (!assertionsDisabledSynth)) && (NIL == subl_promotions.non_negative_integer_p(size))) {
            throw new AssertionError(size);
        }
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = NIL;
        try {
            release = seize_lock(id_index_lock);
            final SubLObject next_id = id_index_next_id(v_id_index);
            final SubLObject sparse_size = (NIL != size) ? max(size, next_id) : next_id;
            final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
            final SubLObject dense_objects = id_index_dense_objects(v_id_index);
            final SubLObject dense_object_limit = length(dense_objects);
            if (sparse_size.numG(dense_object_limit)) {
                final SubLObject optimized_dense_objects = make_vector(sparse_size, NIL);
                replace(optimized_dense_objects, dense_objects, ZERO_INTEGER, min(sparse_size, dense_object_limit), ZERO_INTEGER, min(sparse_size, dense_object_limit));
                SubLObject id = NIL;
                SubLObject v_object = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(sparse_objects);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id = getEntryKey(cdohash_entry);
                        v_object = getEntryValue(cdohash_entry);
                        set_aref(optimized_dense_objects, id, v_object);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
                _csetf_idix_dense_objects(v_id_index, optimized_dense_objects);
                clrhash(sparse_objects);
            }
        } finally {
            if (NIL != release) {
                release_lock(id_index_lock);
            }
        }
        return v_id_index;
    }

    public static SubLObject id_index_pessimized_p(final SubLObject v_id_index) {
        return zerop(length(id_index_dense_objects(v_id_index)));
    }

    public static SubLObject pessimize_id_index(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = NIL;
        try {
            release = seize_lock(id_index_lock);
            final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
            if (NIL == id_index_dense_objects_empty_p(v_id_index, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(v_id_index);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_object;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_object = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_object)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_object)) {
                            v_object = $SKIP;
                        }
                        sethash(id, sparse_objects, v_object);
                    }
                }
            }
            _csetf_idix_dense_objects(v_id_index, make_vector(ZERO_INTEGER, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock(id_index_lock);
            }
        }
        assert NIL != id_index_pessimized_p(v_id_index) : "id_index.id_index_pessimized_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_pessimized_p(v_id_index) " + v_id_index;
        return v_id_index;
    }

    public static SubLObject id_index_compact_p(final SubLObject v_id_index) {
        return numE(id_index_next_id(v_id_index), id_index_count(v_id_index));
    }

    public static SubLObject compact_id_index(final SubLObject v_id_index, SubLObject new_id_notification_function) {
        if (new_id_notification_function == UNPROVIDED) {
            new_id_notification_function = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        if (NIL != id_index_compact_p(v_id_index)) {
            return v_id_index;
        }
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = NIL;
        try {
            release = seize_lock(id_index_lock);
            final SubLObject dense_total = id_index_count(v_id_index);
            final SubLObject compact_dense_objects = make_vector(dense_total, NIL);
            SubLObject next_id = ZERO_INTEGER;
            final SubLObject mess = $$$Compacting_ID_index;
            final SubLObject total = id_index_count(v_id_index);
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
                    if (NIL == id_index_objects_empty_p(v_id_index, $SKIP)) {
                        if (NIL == id_index_dense_objects_empty_p(v_id_index, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(v_id_index);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject dense_id;
                            SubLObject v_object;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                dense_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                v_object = aref(vector_var, dense_id);
                                if ((NIL == id_index_tombstone_p(v_object)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(v_object)) {
                                        v_object = $SKIP;
                                    }
                                    set_aref(compact_dense_objects, next_id, v_object);
                                    next_id = add(next_id, ONE_INTEGER);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        if (NIL == id_index_sparse_objects_empty_p(v_id_index)) {
                            final SubLObject cdohash_table = id_index_sparse_objects(v_id_index);
                            SubLObject dense_id2 = NIL;
                            SubLObject v_object2 = NIL;
                            final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                            try {
                                while (iteratorHasNext(cdohash_iterator)) {
                                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                    dense_id2 = getEntryKey(cdohash_entry);
                                    v_object2 = getEntryValue(cdohash_entry);
                                    set_aref(compact_dense_objects, next_id, v_object2);
                                    next_id = add(next_id, ONE_INTEGER);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                } 
                            } finally {
                                releaseEntrySetIterator(cdohash_iterator);
                            }
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
            _csetf_idix_next_id(v_id_index, next_id);
            _csetf_idix_dense_objects(v_id_index, compact_dense_objects);
            clrhash(id_index_sparse_objects(v_id_index));
            if (NIL != new_id_notification_function) {
                assert NIL != function_spec_p(new_id_notification_function) : "Types.function_spec_p(new_id_notification_function) " + "CommonSymbols.NIL != Types.function_spec_p(new_id_notification_function) " + new_id_notification_function;
                final SubLObject mess2 = $$$Updating_object_IDs;
                final SubLObject total2 = id_index_count(v_id_index);
                SubLObject sofar2 = ZERO_INTEGER;
                assert NIL != stringp(mess2) : "Types.stringp(mess2) " + "CommonSymbols.NIL != Types.stringp(mess2) " + mess2;
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(mess2);
                        if (NIL == id_index_objects_empty_p(v_id_index, $SKIP)) {
                            if (NIL == id_index_dense_objects_empty_p(v_id_index, $SKIP)) {
                                final SubLObject vector_var2 = id_index_dense_objects(v_id_index);
                                final SubLObject backwardP_var2 = NIL;
                                SubLObject v_object2;
                                SubLObject length2;
                                SubLObject v_iteration2;
                                SubLObject sparse_id;
                                for (length2 = length(vector_var2), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = add(v_iteration2, ONE_INTEGER)) {
                                    sparse_id = (NIL != backwardP_var2) ? subtract(length2, v_iteration2, ONE_INTEGER) : v_iteration2;
                                    v_object2 = aref(vector_var2, sparse_id);
                                    if ((NIL == id_index_tombstone_p(v_object2)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(v_object2)) {
                                            v_object2 = $SKIP;
                                        }
                                        funcall(new_id_notification_function, v_object2, sparse_id);
                                        sofar2 = add(sofar2, ONE_INTEGER);
                                        note_percent_progress(sofar2, total2);
                                    }
                                }
                            }
                            if (NIL == id_index_sparse_objects_empty_p(v_id_index)) {
                                final SubLObject cdohash_table2 = id_index_sparse_objects(v_id_index);
                                SubLObject sparse_id2 = NIL;
                                SubLObject v_object3 = NIL;
                                final Iterator cdohash_iterator2 = getEntrySetIterator(cdohash_table2);
                                try {
                                    while (iteratorHasNext(cdohash_iterator2)) {
                                        final Map.Entry cdohash_entry2 = iteratorNextEntry(cdohash_iterator2);
                                        sparse_id2 = getEntryKey(cdohash_entry2);
                                        v_object3 = getEntryValue(cdohash_entry2);
                                        funcall(new_id_notification_function, v_object3, sparse_id2);
                                        sofar2 = add(sofar2, ONE_INTEGER);
                                        note_percent_progress(sofar2, total2);
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator2);
                                }
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                }
            }
        } finally {
            if (NIL != release) {
                release_lock(id_index_lock);
            }
        }
        return v_id_index;
    }

    public static SubLObject new_indirect_compact_id_index(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        SubLObject compact_id = ZERO_INTEGER;
        SubLObject new_id_index = NIL;
        final SubLObject id_index_lock = id_index_lock(v_id_index);
        SubLObject release = NIL;
        try {
            release = seize_lock(id_index_lock);
            final SubLObject dense_objects = id_index_dense_objects(v_id_index);
            final SubLObject dense_objects_size = length(dense_objects);
            final SubLObject initial_next_id = id_index_next_id(v_id_index);
            new_id_index = new_id_index(dense_objects_size, initial_next_id);
            SubLObject dense_id;
            SubLObject v_object;
            for (dense_id = NIL, dense_id = ZERO_INTEGER; dense_id.numL(dense_objects_size); dense_id = add(dense_id, ONE_INTEGER)) {
                v_object = aref(dense_objects, dense_id);
                if (NIL != v_object) {
                    id_index_enter(new_id_index, dense_id, compact_id);
                    compact_id = add(compact_id, ONE_INTEGER);
                }
            }
            final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
            final SubLObject sparse_objects_size = hash_table_count(sparse_objects);
            SubLObject sparse_object_id_store = make_vector(sparse_objects_size, NIL);
            SubLObject sparse_object_id_position = ZERO_INTEGER;
            SubLObject dense_id2 = NIL;
            SubLObject v_object2 = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(sparse_objects);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    dense_id2 = getEntryKey(cdohash_entry);
                    v_object2 = getEntryValue(cdohash_entry);
                    if (NIL != v_object2) {
                        set_aref(sparse_object_id_store, sparse_object_id_position, dense_id2);
                        sparse_object_id_position = add(sparse_object_id_position, ONE_INTEGER);
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            final SubLObject vector_var;
            sparse_object_id_store = vector_var = Sort.sort(sparse_object_id_store, symbol_function($sym117$_), UNPROVIDED);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dense_id3;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dense_id3 = aref(vector_var, element_num);
                id_index_enter(new_id_index, dense_id3, compact_id);
                compact_id = add(compact_id, ONE_INTEGER);
            }
        } finally {
            if (NIL != release) {
                release_lock(id_index_lock);
            }
        }
        return new_id_index;
    }

    public static SubLObject id_index_ids(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        SubLObject ids = NIL;
        if (NIL == id_index_objects_empty_p(v_id_index, $SKIP)) {
            if (NIL == id_index_dense_objects_empty_p(v_id_index, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(v_id_index);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_object;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_object = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_object)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_object)) {
                            v_object = $SKIP;
                        }
                        ids = cons(id, ids);
                    }
                }
            }
            if (NIL == id_index_sparse_objects_empty_p(v_id_index)) {
                final SubLObject cdohash_table = id_index_sparse_objects(v_id_index);
                SubLObject id2 = NIL;
                SubLObject v_object2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        v_object2 = getEntryValue(cdohash_entry);
                        ids = cons(id2, ids);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return nreverse(ids);
    }

    public static SubLObject id_index_values(final SubLObject v_id_index) {
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        SubLObject values = NIL;
        if (NIL == id_index_objects_empty_p(v_id_index, $SKIP)) {
            if (NIL == id_index_dense_objects_empty_p(v_id_index, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(v_id_index);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_object;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_object = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_object)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_object)) {
                            v_object = $SKIP;
                        }
                        values = cons(v_object, values);
                    }
                }
            }
            if (NIL == id_index_sparse_objects_empty_p(v_id_index)) {
                final SubLObject cdohash_table = id_index_sparse_objects(v_id_index);
                SubLObject id2 = NIL;
                SubLObject v_object2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        v_object2 = getEntryValue(cdohash_entry);
                        values = cons(v_object2, values);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return nreverse(values);
    }

    public static SubLObject clone_id_index(final SubLObject v_id_index) {
        final SubLObject dense_objects_size = id_index_sparse_id_threshold(v_id_index);
        final SubLObject initial_next_id = id_index_next_id(v_id_index);
        return new_id_index(dense_objects_size, initial_next_id);
    }

    public static SubLObject copy_id_index(final SubLObject v_id_index, SubLObject optimizeP) {
        if (optimizeP == UNPROVIDED) {
            optimizeP = NIL;
        }
        final SubLObject next_id = id_index_next_id(v_id_index);
        final SubLObject new_id_index = (NIL != optimizeP) ? new_id_index(next_id, UNPROVIDED) : clone_id_index(v_id_index);
        if (NIL == id_index_objects_empty_p(v_id_index, $SKIP)) {
            if (NIL == id_index_dense_objects_empty_p(v_id_index, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(v_id_index);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_object;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_object = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_object)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_object)) {
                            v_object = $SKIP;
                        }
                        id_index_enter(new_id_index, id, v_object);
                    }
                }
            }
            if (NIL == id_index_sparse_objects_empty_p(v_id_index)) {
                final SubLObject cdohash_table = id_index_sparse_objects(v_id_index);
                SubLObject id2 = NIL;
                SubLObject v_object2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        v_object2 = getEntryValue(cdohash_entry);
                        id_index_enter(new_id_index, id2, v_object2);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return new_id_index;
    }

    public static SubLObject id_index_missing_ids(final SubLObject v_id_index, SubLObject type, SubLObject before_id) {
        if (type == UNPROVIDED) {
            type = $ALL;
        }
        if (before_id == UNPROVIDED) {
            before_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != id_index_p(v_id_index) : "id_index.id_index_p(v_id_index) " + "CommonSymbols.NIL != id_index.id_index_p(v_id_index) " + v_id_index;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(type, $list172, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str173$Type_must_be_one_of_____ALL__DENS);
        }
        if (NIL == before_id) {
            before_id = id_index_next_id(v_id_index);
        }
        SubLObject missing_ids = NIL;
        if ($SPARSE != type) {
            final SubLObject dense_objects = id_index_dense_objects(v_id_index);
            SubLObject doneP = NIL;
            final SubLObject vector_var = dense_objects;
            final SubLObject backwardP_var = NIL;
            final SubLObject length = length(vector_var);
            SubLObject current;
            final SubLObject datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
            SubLObject start = NIL;
            SubLObject end = NIL;
            SubLObject delta = NIL;
            destructuring_bind_must_consp(current, datum, $list175);
            start = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list175);
            end = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list175);
            delta = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL == doneP) {
                    SubLObject end_var;
                    SubLObject id;
                    SubLObject v_object;
                    for (end_var = end, id = NIL, id = start; (NIL == doneP) && (NIL == subl_macros.do_numbers_endtest(id, delta, end_var)); id = add(id, delta)) {
                        v_object = aref(vector_var, id);
                        if (NIL == v_object) {
                            if (before_id.numLE(id)) {
                                doneP = T;
                            } else {
                                missing_ids = cons(id, missing_ids);
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list175);
            }
        }
        if ($DENSE != type) {
            final SubLObject sparse_objects = id_index_sparse_objects(v_id_index);
            final SubLObject sparse_id_start = id_index_sparse_id_threshold(v_id_index);
            final SubLObject max_id_end = id_index_next_id(v_id_index);
            SubLObject end_var2;
            SubLObject sparse_id_end;
            SubLObject id2;
            SubLObject v_object2;
            for (sparse_id_end = end_var2 = min(before_id, max_id_end), id2 = NIL, id2 = sparse_id_start; !id2.numGE(end_var2); id2 = number_utilities.f_1X(id2)) {
                v_object2 = gethash_without_values(id2, sparse_objects, UNPROVIDED);
                if (NIL == v_object2) {
                    missing_ids = cons(id2, missing_ids);
                }
            }
        }
        return nreverse(missing_ids);
    }

    public static SubLObject test_id_index_missing_ids(final SubLObject dense, final SubLObject sparse, final SubLObject holes) {
        final SubLObject v_id_index = new_id_index_for_testing_purposes_with_random_holes(dense, sparse, holes, UNPROVIDED);
        final SubLObject max_id = id_index_next_id(v_id_index);
        final SubLObject present_ids = set_utilities.construct_set_from_list(id_index_ids(v_id_index), UNPROVIDED, UNPROVIDED);
        final SubLObject absent_ids = set_utilities.construct_set_from_list(id_index_missing_ids(v_id_index, $ALL, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        SubLObject id;
        SubLObject expected;
        for (id = NIL, id = ZERO_INTEGER; id.numL(max_id); id = add(id, ONE_INTEGER)) {
            if ((NIL == set.set_memberP(id, present_ids)) && (NIL == set.set_memberP(id, absent_ids))) {
                expected = stringp(id_index_lookup(v_id_index, id, UNPROVIDED));
                Errors.error($str179$ID__A_is_missing__it_is__A_, NIL != expected ? $$$expected_to_be_present : $$$expected_to_be_absent);
            }
        }
        return $SUCCESS;
    }

    public static SubLObject build_reverse_index_for_id_index(final SubLObject v_id_index, final SubLObject map, SubLObject collate_duplicatesP) {
        if (collate_duplicatesP == UNPROVIDED) {
            collate_duplicatesP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == id_index_objects_empty_p(v_id_index, $SKIP)) {
            if (NIL == id_index_dense_objects_empty_p(v_id_index, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(v_id_index);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject value;
                SubLObject ids;
                SubLObject foundp;
                SubLObject prev_id;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    value = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(value)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(value)) {
                            value = $SKIP;
                        }
                        if (NIL != collate_duplicatesP) {
                            thread.resetMultipleValues();
                            ids = map_utilities.map_get(map, value, UNPROVIDED);
                            foundp = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != foundp) {
                                if (ids.isList()) {
                                    ids = cons(id, ids);
                                    map_utilities.map_put(map, value, ids);
                                } else {
                                    prev_id = ids;
                                    map_utilities.map_put(map, value, list(id, prev_id));
                                }
                            } else {
                                map_utilities.map_put(map, value, id);
                            }
                        } else {
                            map_utilities.map_put(map, value, id);
                        }
                    }
                }
            }
            if (NIL == id_index_sparse_objects_empty_p(v_id_index)) {
                final SubLObject cdohash_table = id_index_sparse_objects(v_id_index);
                SubLObject id2 = NIL;
                SubLObject value2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        value2 = getEntryValue(cdohash_entry);
                        if (NIL != collate_duplicatesP) {
                            thread.resetMultipleValues();
                            SubLObject ids2 = map_utilities.map_get(map, value2, UNPROVIDED);
                            final SubLObject foundp2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != foundp2) {
                                if (ids2.isList()) {
                                    ids2 = cons(id2, ids2);
                                    map_utilities.map_put(map, value2, ids2);
                                } else {
                                    final SubLObject prev_id2 = ids2;
                                    map_utilities.map_put(map, value2, list(id2, prev_id2));
                                }
                            } else {
                                map_utilities.map_put(map, value2, id2);
                            }
                        } else {
                            map_utilities.map_put(map, value2, id2);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return map;
    }

    public static SubLObject new_id_index_from_reverse_index(final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject max_id = find_max_index_id_in_reverse_index(map);
        final SubLObject new_id_index = new_id_index(max_id, UNPROVIDED);
        final SubLObject iterator = map_utilities.new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject entry = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = entry;
                SubLObject key = NIL;
                SubLObject id = NIL;
                destructuring_bind_must_consp(current, datum, $list182);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list182);
                id = current.first();
                current = current.rest();
                if (NIL == current) {
                    id_index_enter(new_id_index, id, key);
                } else {
                    cdestructuring_bind_error(datum, $list182);
                }
            }
        }
        return new_id_index;
    }

    public static SubLObject find_max_index_id_in_reverse_index(final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max = MINUS_ONE_INTEGER;
        SubLObject max_key = NIL;
        final SubLObject iterator = map_utilities.new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject entry = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = entry;
                SubLObject key = NIL;
                SubLObject id = NIL;
                destructuring_bind_must_consp(current, datum, $list182);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list182);
                id = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (max.numL(id)) {
                        max = id;
                        max_key = key;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list182);
                }
            }
        }
        return values(max, max_key);
    }

    public static SubLObject test_new_index_from_reverse_index(final SubLObject num_of_dense, final SubLObject num_of_sparse, SubLObject id_to_value_fn, SubLObject testfn) {
        if (id_to_value_fn == UNPROVIDED) {
            id_to_value_fn = TO_STRING;
        }
        if (testfn == UNPROVIDED) {
            testfn = symbol_function(EQUAL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_id_index = new_id_index_for_testing_purposes(num_of_dense, num_of_sparse, id_to_value_fn);
        final SubLObject reverse_index = populate_reverse_index_for_id_index(v_id_index, testfn);
        final SubLObject new_id_index = new_id_index_from_reverse_index(reverse_index);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!id_index_count(new_id_index).numE(id_index_count(v_id_index)))) {
            Errors.error($str184$The_dense_ID_index__A_is_of_a_dif, v_id_index, new_id_index);
        }
        final SubLObject idx = v_id_index;
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$22 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$22, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$22);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject value;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    value = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(value)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(value)) {
                            value = $SKIP;
                        }
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!id.numE(map_utilities.map_get(reverse_index, value, $NOT_FOUND)))) {
                            Errors.error($str186$The_reverse_index_for__A_does_not, value, id);
                        }
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == funcall(testfn, value, id_index_lookup(new_id_index, id, UNPROVIDED)))) {
                            Errors.error($str187$The_new_ID_index_does_not_have__A, value, id);
                        }
                    }
                }
            }
            final SubLObject idx_$23 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$23)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$23);
                SubLObject id2 = NIL;
                SubLObject value2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        value2 = getEntryValue(cdohash_entry);
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!id2.numE(map_utilities.map_get(reverse_index, value2, $NOT_FOUND)))) {
                            Errors.error($str186$The_reverse_index_for__A_does_not, value2, id2);
                        }
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == funcall(testfn, value2, id_index_lookup(new_id_index, id2, UNPROVIDED)))) {
                            Errors.error($str187$The_new_ID_index_does_not_have__A, value2, id2);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return $SUCCESS;
    }

    public static SubLObject new_id_index_for_testing_purposes(final SubLObject num_of_dense, final SubLObject num_of_sparse, SubLObject id_to_value_fn) {
        if (id_to_value_fn == UNPROVIDED) {
            id_to_value_fn = TO_STRING;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_id_index = new_id_index(num_of_dense, UNPROVIDED);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(num_of_dense); i = add(i, ONE_INTEGER)) {
            id_index_enter(v_id_index, i, funcall(id_to_value_fn, i));
        }
        SubLObject j;
        SubLObject expected;
        SubLObject suggested;
        SubLObject value;
        for (j = NIL, j = ZERO_INTEGER; j.numL(num_of_sparse); j = add(j, ONE_INTEGER)) {
            expected = add(j, num_of_dense);
            suggested = id_index_reserve(v_id_index);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!expected.numE(suggested))) {
                Errors.error($str188$There_is_a_mismatch_between_the__, j, expected, suggested);
            }
            value = funcall(id_to_value_fn, suggested);
            id_index_enter(v_id_index, suggested, value);
        }
        return v_id_index;
    }

    public static SubLObject test_do_id_index_with_tombstones(final SubLObject num_of_dense, final SubLObject num_of_sparse, final SubLObject hole_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_id_index = new_id_index_for_testing_purposes_with_random_holes(num_of_dense, num_of_sparse, hole_count, UNPROVIDED);
        final SubLObject hole_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject holes = set_utilities.construct_set_from_list(hole_list, UNPROVIDED, UNPROVIDED);
        final SubLObject seen_holes = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject last_id = MINUS_ONE_INTEGER;
        final SubLObject idx = v_id_index;
        if (NIL == id_index_objects_empty_p(idx, $RIP)) {
            final SubLObject idx_$24 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$24, $RIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$24);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_object;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_object = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_object)) || (NIL == id_index_skip_tombstones_p($RIP))) {
                        if (NIL != id_index_tombstone_p(v_object)) {
                            v_object = $RIP;
                        }
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!ONE_INTEGER.numE(subtract(id, last_id)))) {
                            Errors.error($str191$Error__the_ID_range_is_not_truely, add(last_id, ONE_INTEGER), id);
                        }
                        if (NIL != set.set_memberP(id, holes)) {
                            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($RIP != v_object)) {
                                Errors.error($str192$Error_at_index__A__expected_tombs, id, v_object);
                            }
                            set.set_add(id, seen_holes);
                        } else
                            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($RIP == v_object)) {
                                Errors.error($str193$Error_at_index__A__expected_objec, id);
                            }

                        last_id = id;
                    }
                }
            }
            final SubLObject idx_$25 = idx;
            if ((NIL == id_index_sparse_objects_empty_p(idx_$25)) || (NIL == id_index_skip_tombstones_p($RIP))) {
                final SubLObject sparse = id_index_sparse_objects(idx_$25);
                SubLObject id2 = id_index_sparse_id_threshold(idx_$25);
                final SubLObject end_id = id_index_next_id(idx_$25);
                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($RIP)) ? NIL : $RIP;
                while (id2.numL(end_id)) {
                    final SubLObject v_object2 = gethash_without_values(id2, sparse, v_default);
                    if ((NIL == id_index_skip_tombstones_p($RIP)) || (NIL == id_index_tombstone_p(v_object2))) {
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!ONE_INTEGER.numE(subtract(id2, last_id)))) {
                            Errors.error($str191$Error__the_ID_range_is_not_truely, add(last_id, ONE_INTEGER), id2);
                        }
                        if (NIL != set.set_memberP(id2, holes)) {
                            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($RIP != v_object2)) {
                                Errors.error($str192$Error_at_index__A__expected_tombs, id2, v_object2);
                            }
                            set.set_add(id2, seen_holes);
                        } else
                            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($RIP == v_object2)) {
                                Errors.error($str193$Error_at_index__A__expected_objec, id2);
                            }

                        last_id = id2;
                    }
                    id2 = add(id2, ONE_INTEGER);
                } 
            }
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == set_utilities.sets_coextensionalP(holes, seen_holes))) {
            Errors.error($str194$There_are_holes_that_we_did_not_s, set.set_element_list(set_utilities.set_prune(holes, seen_holes)));
        }
        final SubLObject last_index;
        final SubLObject somewhere_in_sparsespace = last_index = add(num_of_dense, integerDivide(num_of_sparse, TWO_INTEGER));
        final SubLObject last_object = id_index_lookup(v_id_index, last_index, $RIP);
        SubLObject counter = ZERO_INTEGER;
        SubLObject curr_object = NIL;
        SubLObject finishedP = NIL;
        final SubLObject idx2 = v_id_index;
        if (NIL == id_index_objects_empty_p(idx2, $RIP)) {
            final SubLObject idx_$26 = idx2;
            if (NIL == id_index_dense_objects_empty_p(idx_$26, $RIP)) {
                final SubLObject vector_var2 = id_index_dense_objects(idx_$26);
                final SubLObject backwardP_var2 = NIL;
                final SubLObject length2 = length(vector_var2);
                SubLObject current;
                final SubLObject datum = current = (NIL != backwardP_var2) ? list(subtract(length2, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length2, ONE_INTEGER);
                SubLObject start = NIL;
                SubLObject end = NIL;
                SubLObject delta = NIL;
                destructuring_bind_must_consp(current, datum, $list175);
                start = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list175);
                end = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list175);
                delta = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == finishedP) {
                        SubLObject end_var;
                        SubLObject id3;
                        SubLObject v_object3;
                        for (end_var = end, id3 = NIL, id3 = start; (NIL == finishedP) && (NIL == subl_macros.do_numbers_endtest(id3, delta, end_var)); id3 = add(id3, delta)) {
                            v_object3 = aref(vector_var2, id3);
                            if ((NIL == id_index_tombstone_p(v_object3)) || (NIL == id_index_skip_tombstones_p($RIP))) {
                                if (NIL != id_index_tombstone_p(v_object3)) {
                                    v_object3 = $RIP;
                                }
                                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!id3.numE(counter))) {
                                    Errors.error($str195$Error__ID__A_is_not_in_line_with_, id3, counter);
                                }
                                counter = add(counter, ONE_INTEGER);
                                curr_object = v_object3;
                                finishedP = numL(last_index, counter);
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list175);
                }
            }
            final SubLObject idx_$27 = idx2;
            if ((NIL == id_index_sparse_objects_empty_p(idx_$27)) || (NIL == id_index_skip_tombstones_p($RIP))) {
                final SubLObject sparse2 = id_index_sparse_objects(idx_$27);
                SubLObject id4 = id_index_sparse_id_threshold(idx_$27);
                final SubLObject end_id2 = id_index_next_id(idx_$27);
                final SubLObject v_default2 = (NIL != id_index_skip_tombstones_p($RIP)) ? NIL : $RIP;
                while (id4.numL(end_id2) && (NIL == finishedP)) {
                    final SubLObject v_object4 = gethash_without_values(id4, sparse2, v_default2);
                    if ((NIL == id_index_skip_tombstones_p($RIP)) || (NIL == id_index_tombstone_p(v_object4))) {
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!id4.numE(counter))) {
                            Errors.error($str195$Error__ID__A_is_not_in_line_with_, id4, counter);
                        }
                        counter = add(counter, ONE_INTEGER);
                        curr_object = v_object4;
                        finishedP = numL(last_index, counter);
                    }
                    id4 = add(id4, ONE_INTEGER);
                } 
            }
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!curr_object.eql(last_object))) {
            Errors.error($str196$_DONE_should_have_taken_us_to__A_, last_object, curr_object);
        }
        SubLObject limit;
        SubLObject i;
        for (limit = add(num_of_dense, num_of_sparse), i = NIL, i = ZERO_INTEGER; i.numL(limit); i = add(i, ONE_INTEGER)) {
            id_index_remove(v_id_index, i);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == id_index_empty_p(v_id_index))) {
            Errors.error($str197$Hey__we_deleted_everything_and_th);
        }
        SubLObject counter2 = ZERO_INTEGER;
        final SubLObject idx3 = v_id_index;
        if (NIL == id_index_objects_empty_p(idx3, $RIP)) {
            final SubLObject idx_$28 = idx3;
            if (NIL == id_index_dense_objects_empty_p(idx_$28, $RIP)) {
                final SubLObject vector_var3 = id_index_dense_objects(idx_$28);
                final SubLObject backwardP_var3 = NIL;
                SubLObject id4;
                SubLObject length3;
                SubLObject v_iteration2;
                SubLObject v_object5;
                for (length3 = length(vector_var3), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL(length3); v_iteration2 = add(v_iteration2, ONE_INTEGER)) {
                    id4 = (NIL != backwardP_var3) ? subtract(length3, v_iteration2, ONE_INTEGER) : v_iteration2;
                    v_object5 = aref(vector_var3, id4);
                    if ((NIL == id_index_tombstone_p(v_object5)) || (NIL == id_index_skip_tombstones_p($RIP))) {
                        if (NIL != id_index_tombstone_p(v_object5)) {
                            v_object5 = $RIP;
                        }
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!counter2.numE(id4))) {
                            Errors.error($str195$Error__ID__A_is_not_in_line_with_, id4, counter2);
                        }
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($RIP != v_object5)) {
                            Errors.error($str198$Error__an_empty_ID_index_contains, v_object5);
                        }
                        counter2 = add(counter2, ONE_INTEGER);
                    }
                }
            }
            final SubLObject idx_$29 = idx3;
            if ((NIL == id_index_sparse_objects_empty_p(idx_$29)) || (NIL == id_index_skip_tombstones_p($RIP))) {
                final SubLObject sparse3 = id_index_sparse_objects(idx_$29);
                SubLObject id = id_index_sparse_id_threshold(idx_$29);
                final SubLObject end_id3 = id_index_next_id(idx_$29);
                final SubLObject v_default3 = (NIL != id_index_skip_tombstones_p($RIP)) ? NIL : $RIP;
                while (id.numL(end_id3)) {
                    final SubLObject v_object6 = gethash_without_values(id, sparse3, v_default3);
                    if ((NIL == id_index_skip_tombstones_p($RIP)) || (NIL == id_index_tombstone_p(v_object6))) {
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!counter2.numE(id))) {
                            Errors.error($str195$Error__ID__A_is_not_in_line_with_, id, counter2);
                        }
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($RIP != v_object6)) {
                            Errors.error($str198$Error__an_empty_ID_index_contains, v_object6);
                        }
                        counter2 = add(counter2, ONE_INTEGER);
                    }
                    id = add(id, ONE_INTEGER);
                } 
            }
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!counter2.numE(limit))) {
            Errors.error($str199$Hey___A______A__they_did_not_show, counter2, limit);
        }
        return $SUCCESS;
    }

    public static SubLObject new_id_index_for_testing_purposes_with_random_holes(final SubLObject num_of_dense, final SubLObject num_of_sparse, final SubLObject hole_count, SubLObject id_to_value_fn) {
        if (id_to_value_fn == UNPROVIDED) {
            id_to_value_fn = TO_STRING;
        }
        final SubLObject v_id_index = new_id_index_for_testing_purposes(num_of_dense, num_of_sparse, id_to_value_fn);
        final SubLObject hole_range = add(num_of_sparse, num_of_dense);
        final SubLObject holes = set.new_set(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = list(ZERO_INTEGER, subtract(num_of_dense, ONE_INTEGER));
        SubLObject id = NIL;
        id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            id_index_remove(v_id_index, id);
            set.set_add(id, holes);
            cdolist_list_var = cdolist_list_var.rest();
            id = cdolist_list_var.first();
        } 
        while (set.set_size(holes).numL(hole_count)) {
            final SubLObject index = random.random(hole_range);
            if (NIL == set.set_memberP(index, holes)) {
                id_index_remove(v_id_index, index);
                set.set_add(index, holes);
            }
        } 
        return values(v_id_index, set.set_element_list(holes));
    }

    public static SubLObject populate_reverse_index_for_id_index(final SubLObject v_id_index, final SubLObject testfn) {
        final SubLObject map = dictionary.new_dictionary(testfn, UNPROVIDED);
        return build_reverse_index_for_id_index(v_id_index, map, UNPROVIDED);
    }

    public static SubLObject test_id_index_with_swizzling(final SubLObject dense, final SubLObject sparse) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = new_id_index(dense, $most_positive_fixnum$.getGlobalValue());
        final SubLObject side_cache = dictionary.new_dictionary(EQL, UNPROVIDED);
        final SubLObject bignums = set.new_set(EQL, UNPROVIDED);
        SubLObject i;
        SubLObject value;
        SubLObject id;
        for (i = NIL, i = ZERO_INTEGER; i.numL(sparse); i = add(i, ONE_INTEGER)) {
            value = string_utilities.to_string(i);
            id = id_index_reserve(idx);
            if (!id.isFixnum()) {
                set.set_add(id, bignums);
            }
            id_index_enter(idx, id, value);
            map_utilities.map_put(side_cache, id, value);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != set.set_emptyP(bignums))) {
            Errors.error($str202$The_test_is_badly_designed__no_bi);
        }
        SubLObject id2;
        SubLObject value2;
        SubLObject id_value;
        for (i = NIL, i = ZERO_INTEGER; i.numL(sparse); i = add(i, ONE_INTEGER)) {
            id2 = add($most_positive_fixnum$.getGlobalValue(), i);
            value2 = map_utilities.map_get(side_cache, id2, UNPROVIDED);
            id_value = id_index_lookup(idx, id2, $str203$);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == Strings.stringE(value2, id_value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                Errors.error($str204$We_could_not_retrieve__S_from_the, value2, id2);
            }
        }
        return $SUCCESS;
    }

    public static SubLObject test_id_index_ordered_iteration(final SubLObject dense, final SubLObject sparse) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = new_id_index(dense, UNPROVIDED);
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject value;
        SubLObject id;
        for (cdotimes_end_var = add(dense, sparse), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            value = string_utilities.to_string(i);
            id = id_index_reserve(idx);
            id_index_enter(idx, id, value);
        }
        SubLObject previous = MINUS_ONE_INTEGER;
        final SubLObject iterator_var = new_id_index_ordered_iterator(idx);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject entry = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = entry;
                SubLObject id2 = NIL;
                SubLObject value2 = NIL;
                destructuring_bind_must_consp(current, datum, $list56);
                id2 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list56);
                value2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!previous.numL(id2))) {
                        Errors.error($str207$We_expected_something_larger_than, previous, id2);
                    }
                    previous = id2;
                } else {
                    cdestructuring_bind_error(datum, $list56);
                }
            }
        }
        return $SUCCESS;
    }

    public static SubLObject test_pessimize_id_index() {
        final SubLObject v_id_index = new_id_index(THREE_INTEGER, ZERO_INTEGER);
        final SubLObject id_a = id_index_reserve(v_id_index);
        final SubLObject id_b = id_index_reserve(v_id_index);
        final SubLObject id_c = id_index_reserve(v_id_index);
        final SubLObject id_d = id_index_reserve(v_id_index);
        id_index_enter(v_id_index, id_a, $$$a);
        id_index_enter(v_id_index, id_b, $$$b);
        id_index_enter(v_id_index, id_c, $$$c);
        if ((((NIL != id_index_pessimized_p(v_id_index)) || (!THREE_INTEGER.numE(id_index_count(v_id_index)))) || (!THREE_INTEGER.numE(id_index_dense_object_count(v_id_index)))) || (!ZERO_INTEGER.numE(id_index_sparse_object_count(v_id_index)))) {
            return $INITIAL_ID_INDEX_COUNT_FAILURE;
        }
        pessimize_id_index(v_id_index);
        if ((((NIL == id_index_pessimized_p(v_id_index)) || (!THREE_INTEGER.numE(id_index_count(v_id_index)))) || (!ZERO_INTEGER.numE(id_index_dense_object_count(v_id_index)))) || (!THREE_INTEGER.numE(id_index_sparse_object_count(v_id_index)))) {
            return $ID_INDEX_COUNT_FAILURE;
        }
        if (((!$$$a.equal(id_index_lookup(v_id_index, id_a, UNPROVIDED))) || (!$$$b.equal(id_index_lookup(v_id_index, id_b, UNPROVIDED)))) || (!$$$c.equal(id_index_lookup(v_id_index, id_c, UNPROVIDED)))) {
            return $ID_INDEX_LOOKUP_FAILURE;
        }
        SubLObject values = NIL;
        final SubLObject idx = v_id_index;
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$30 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$30, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$30);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_object;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_object = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_object)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_object)) {
                            v_object = $SKIP;
                        }
                        values = cons(v_object, values);
                    }
                }
            }
            final SubLObject idx_$31 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$31)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$31);
                SubLObject id2 = NIL;
                SubLObject v_object2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        v_object2 = getEntryValue(cdohash_entry);
                        values = cons(v_object2, values);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        if (NIL == list_utilities.sets_equal_equalP(values, $list211)) {
            return $DO_ID_INDEX_FAILURE;
        }
        final SubLObject id_e = id_index_reserve(v_id_index);
        id_index_enter(v_id_index, id_d, $$$d);
        id_index_enter(v_id_index, id_e, $$$e);
        if ((((NIL == id_index_pessimized_p(v_id_index)) || (!FIVE_INTEGER.numE(id_index_count(v_id_index)))) || (!ZERO_INTEGER.numE(id_index_dense_object_count(v_id_index)))) || (!FIVE_INTEGER.numE(id_index_sparse_object_count(v_id_index)))) {
            return $ID_INDEX_RECOUNT_FAILURE;
        }
        if (((($$$a.equal(id_index_lookup(v_id_index, id_a, UNPROVIDED)) && $$$b.equal(id_index_lookup(v_id_index, id_b, UNPROVIDED))) && $$$c.equal(id_index_lookup(v_id_index, id_c, UNPROVIDED))) && $$$d.equal(id_index_lookup(v_id_index, id_d, UNPROVIDED))) && $$$e.equal(id_index_lookup(v_id_index, id_e, UNPROVIDED))) {
            return $SUCCESS;
        }
        return $ID_INDEX_RELOOKUP_FAILURE;
    }

    public static SubLObject benchmark_id_index_iteration() {
        return benchmark_id_index_iteration_int($list223, $int$212);
    }

    public static SubLObject benchmark_id_index_iteration_int(final SubLObject size_list, final SubLObject multiplier) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = size_list;
        SubLObject size = NIL;
        size = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject id_index_time = NIL;
            SubLObject hash_time = NIL;
            final SubLObject v_id_index = new_id_index(size, ZERO_INTEGER);
            SubLObject time_var = get_internal_real_time();
            SubLObject i;
            SubLObject idx;
            SubLObject idx_$32;
            SubLObject vector_var;
            SubLObject backwardP_var;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject id;
            SubLObject v_object;
            SubLObject idx_$33;
            SubLObject cdohash_table;
            SubLObject id2;
            SubLObject v_object2;
            Iterator cdohash_iterator;
            Map.Entry cdohash_entry;
            for (i = NIL, i = ZERO_INTEGER; i.numL(multiplier); i = add(i, ONE_INTEGER)) {
                idx = v_id_index;
                if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                    idx_$32 = idx;
                    if (NIL == id_index_dense_objects_empty_p(idx_$32, $SKIP)) {
                        vector_var = id_index_dense_objects(idx_$32);
                        backwardP_var = NIL;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            v_object = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(v_object)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(v_object)) {
                                    v_object = $SKIP;
                                }
                                sublisp_false(id, v_object);
                            }
                        }
                    }
                    idx_$33 = idx;
                    if (NIL == id_index_sparse_objects_empty_p(idx_$33)) {
                        cdohash_table = id_index_sparse_objects(idx_$33);
                        id2 = NIL;
                        v_object2 = NIL;
                        cdohash_iterator = getEntrySetIterator(cdohash_table);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                id2 = getEntryKey(cdohash_entry);
                                v_object2 = getEntryValue(cdohash_entry);
                                sublisp_false(id2, v_object2);
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            }
            id_index_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            final SubLObject hash = make_hash_table(size, UNPROVIDED, UNPROVIDED);
            time_var = get_internal_real_time();
            SubLObject key;
            SubLObject val;
            Iterator cdohash_iterator2;
            Map.Entry cdohash_entry2;
            for (i = NIL, i = ZERO_INTEGER; i.numL(multiplier); i = add(i, ONE_INTEGER)) {
                key = NIL;
                val = NIL;
                cdohash_iterator2 = getEntrySetIterator(hash);
                try {
                    while (iteratorHasNext(cdohash_iterator2)) {
                        cdohash_entry2 = iteratorNextEntry(cdohash_iterator2);
                        key = getEntryKey(cdohash_entry2);
                        val = getEntryValue(cdohash_entry2);
                        sublisp_false(key, val);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator2);
                }
            }
            hash_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            result = cons(list(size, id_index_time, hash_time), result);
            cdolist_list_var = cdolist_list_var.rest();
            size = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject declare_id_index_file() {
        declareFunction(me, "id_index_print_function_trampoline", "ID-INDEX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "id_index_p", "ID-INDEX-P", 1, 0, false);
        new id_index.$id_index_p$UnaryFunction();
        declareFunction(me, "idix_lock", "IDIX-LOCK", 1, 0, false);
        declareFunction(me, "idix_count", "IDIX-COUNT", 1, 0, false);
        declareFunction(me, "idix_next_id", "IDIX-NEXT-ID", 1, 0, false);
        declareFunction(me, "idix_dense_objects", "IDIX-DENSE-OBJECTS", 1, 0, false);
        declareFunction(me, "idix_sparse_objects", "IDIX-SPARSE-OBJECTS", 1, 0, false);
        declareFunction(me, "_csetf_idix_lock", "_CSETF-IDIX-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_idix_count", "_CSETF-IDIX-COUNT", 2, 0, false);
        declareFunction(me, "_csetf_idix_next_id", "_CSETF-IDIX-NEXT-ID", 2, 0, false);
        declareFunction(me, "_csetf_idix_dense_objects", "_CSETF-IDIX-DENSE-OBJECTS", 2, 0, false);
        declareFunction(me, "_csetf_idix_sparse_objects", "_CSETF-IDIX-SPARSE-OBJECTS", 2, 0, false);
        declareFunction(me, "make_id_index", "MAKE-ID-INDEX", 0, 1, false);
        declareFunction(me, "visit_defstruct_id_index", "VISIT-DEFSTRUCT-ID-INDEX", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_id_index_method", "VISIT-DEFSTRUCT-OBJECT-ID-INDEX-METHOD", 2, 0, false);
        declareFunction(me, "print_id_index", "PRINT-ID-INDEX", 3, 0, false);
        declareFunction(me, "id_index_count", "ID-INDEX-COUNT", 1, 0, false);
        declareFunction(me, "id_index_empty_p", "ID-INDEX-EMPTY-P", 1, 0, false);
        declareFunction(me, "id_index_dense_object_count", "ID-INDEX-DENSE-OBJECT-COUNT", 1, 0, false);
        declareFunction(me, "id_index_sparse_object_count", "ID-INDEX-SPARSE-OBJECT-COUNT", 1, 0, false);
        declareFunction(me, "id_index_sparse_id_threshold", "ID-INDEX-SPARSE-ID-THRESHOLD", 1, 0, false);
        declareFunction(me, "id_index_next_id", "ID-INDEX-NEXT-ID", 1, 0, false);
        declareFunction(me, "set_id_index_next_id", "SET-ID-INDEX-NEXT-ID", 2, 0, false);
        declareFunction(me, "id_index_dense_objects", "ID-INDEX-DENSE-OBJECTS", 1, 0, false);
        declareFunction(me, "id_index_sparse_objects", "ID-INDEX-SPARSE-OBJECTS", 1, 0, false);
        declareMacro(me, "with_id_index_locked", "WITH-ID-INDEX-LOCKED");
        declareFunction(me, "id_index_lock", "ID-INDEX-LOCK", 1, 0, false);
        declareFunction(me, "convert_id_index_key_test", "CONVERT-ID-INDEX-KEY-TEST", 1, 2, false);
        declareFunction(me, "new_id_index", "NEW-ID-INDEX", 0, 2, false);
        declareFunction(me, "id_index_reserve", "ID-INDEX-RESERVE", 1, 0, false);
        declareFunction(me, "id_index_empty_list", "ID-INDEX-EMPTY-LIST", 0, 0, false);
        declareFunction(me, "id_index_empty_list_p", "ID-INDEX-EMPTY-LIST-P", 1, 0, false);
        declareFunction(me, "uninterned_symbols_with_same_name_p", "UNINTERNED-SYMBOLS-WITH-SAME-NAME-P", 2, 0, false);
        declareFunction(me, "id_index_tombstone", "ID-INDEX-TOMBSTONE", 0, 0, false);
        declareFunction(me, "id_index_tombstone_p", "ID-INDEX-TOMBSTONE-P", 1, 0, false);
        declareFunction(me, "id_index_lookup", "ID-INDEX-LOOKUP", 2, 1, false);
        declareFunction(me, "id_index_lookup_int", "ID-INDEX-LOOKUP-INT", 2, 0, false);
        declareFunction(me, "id_index_enter", "ID-INDEX-ENTER", 3, 0, false);
        declareFunction(me, "id_index_enter_unlocked", "ID-INDEX-ENTER-UNLOCKED", 3, 0, false);
        declareFunction(me, "get_appropriate_id_index_sparse_objects", "GET-APPROPRIATE-ID-INDEX-SPARSE-OBJECTS", 2, 0, false);
        declareFunction(me, "id_index_enter_autoextend", "ID-INDEX-ENTER-AUTOEXTEND", 3, 1, false);
        declareFunction(me, "id_index_enter_unlocked_autoextend", "ID-INDEX-ENTER-UNLOCKED-AUTOEXTEND", 3, 1, false);
        declareFunction(me, "id_index_possibly_autoextend", "ID-INDEX-POSSIBLY-AUTOEXTEND", 3, 0, false);
        declareFunction(me, "id_index_remove", "ID-INDEX-REMOVE", 2, 0, false);
        declareFunction(me, "clear_id_index", "CLEAR-ID-INDEX", 1, 0, false);
        declareFunction(me, "fill_id_index_dense_space", "FILL-ID-INDEX-DENSE-SPACE", 2, 1, false);
        declareFunction(me, "id_index_dense_object_id_p", "ID-INDEX-DENSE-OBJECT-ID-P", 2, 0, false);
        declareFunction(me, "new_id_index_iterator", "NEW-ID-INDEX-ITERATOR", 1, 0, false);
        declareFunction(me, "new_id_index_values_iterator", "NEW-ID-INDEX-VALUES-ITERATOR", 1, 0, false);
        declareFunction(me, "new_id_index_ordered_iterator", "NEW-ID-INDEX-ORDERED-ITERATOR", 1, 0, false);
        declareFunction(me, "new_id_index_dense_objects_iterator", "NEW-ID-INDEX-DENSE-OBJECTS-ITERATOR", 1, 0, false);
        declareFunction(me, "iterate_id_index_dense_objects_necessary", "ITERATE-ID-INDEX-DENSE-OBJECTS-NECESSARY", 1, 0, false);
        declareFunction(me, "new_id_index_dense_objects_values_iterator", "NEW-ID-INDEX-DENSE-OBJECTS-VALUES-ITERATOR", 1, 0, false);
        declareFunction(me, "new_id_index_sparse_objects_iterator", "NEW-ID-INDEX-SPARSE-OBJECTS-ITERATOR", 1, 0, false);
        declareFunction(me, "new_id_index_sparse_objects_values_iterator", "NEW-ID-INDEX-SPARSE-OBJECTS-VALUES-ITERATOR", 1, 0, false);
        declareFunction(me, "new_id_index_sparse_objects_ordered_iterator", "NEW-ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR", 1, 0, false);
        declareFunction(me, "make_id_index_sparse_objects_ordered_iterator_state", "MAKE-ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR-STATE", 1, 0, false);
        declareFunction(me, "id_index_sparse_objects_ordered_iterator_doneP", "ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR-DONE?", 1, 0, false);
        declareFunction(me, "id_index_sparse_objects_ordered_iterator_next", "ID-INDEX-SPARSE-OBJECTS-ORDERED-ITERATOR-NEXT", 1, 0, false);
        declareMacro(me, "do_id_index", "DO-ID-INDEX");
        declareMacro(me, "old_do_id_index", "OLD-DO-ID-INDEX");
        declareFunction(me, "id_index_objects_empty_p", "ID-INDEX-OBJECTS-EMPTY-P", 2, 0, false);
        declareMacro(me, "do_id_index_dense_objects", "DO-ID-INDEX-DENSE-OBJECTS");
        declareFunction(me, "id_index_dense_objects_empty_p", "ID-INDEX-DENSE-OBJECTS-EMPTY-P", 2, 0, false);
        declareFunction(me, "id_index_skip_tombstones_p", "ID-INDEX-SKIP-TOMBSTONES-P", 1, 0, false);
        declareMacro(me, "do_id_index_sparse_objects", "DO-ID-INDEX-SPARSE-OBJECTS");
        declareFunction(me, "id_index_sparse_objects_empty_p", "ID-INDEX-SPARSE-OBJECTS-EMPTY-P", 1, 0, false);
        declareFunction(me, "id_index_sparse_object_ids", "ID-INDEX-SPARSE-OBJECT-IDS", 1, 0, false);
        declareMacro(me, "new_do_id_index", "NEW-DO-ID-INDEX");
        declareFunction(me, "do_id_index_next_id", "DO-ID-INDEX-NEXT-ID", 4, 0, false);
        declareFunction(me, "do_id_index_next_state", "DO-ID-INDEX-NEXT-STATE", 4, 0, false);
        declareFunction(me, "do_id_index_state_object", "DO-ID-INDEX-STATE-OBJECT", 4, 0, false);
        declareFunction(me, "do_id_index_object_validP", "DO-ID-INDEX-OBJECT-VALID?", 2, 0, false);
        declareFunction(me, "id_index_old_and_new_object_counts", "ID-INDEX-OLD-AND-NEW-OBJECT-COUNTS", 1, 1, false);
        declareFunction(me, "cfasl_output_object_id_index_method", "CFASL-OUTPUT-OBJECT-ID-INDEX-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_wide_output_id_index", "CFASL-WIDE-OUTPUT-ID-INDEX", 2, 0, false);
        declareFunction(me, "cfasl_output_id_index_internal", "CFASL-OUTPUT-ID-INDEX-INTERNAL", 2, 0, false);
        declareFunction(me, "cfasl_input_id_index", "CFASL-INPUT-ID-INDEX", 1, 0, false);
        declareFunction(me, "test_id_index_cfasl_serialization", "TEST-ID-INDEX-CFASL-SERIALIZATION", 2, 2, false);
        declareFunction(me, "id_index_optimized_p", "ID-INDEX-OPTIMIZED-P", 1, 0, false);
        declareFunction(me, "optimize_id_index", "OPTIMIZE-ID-INDEX", 1, 1, false);
        declareFunction(me, "id_index_pessimized_p", "ID-INDEX-PESSIMIZED-P", 1, 0, false);
        declareFunction(me, "pessimize_id_index", "PESSIMIZE-ID-INDEX", 1, 0, false);
        declareFunction(me, "id_index_compact_p", "ID-INDEX-COMPACT-P", 1, 0, false);
        declareFunction(me, "compact_id_index", "COMPACT-ID-INDEX", 1, 1, false);
        declareFunction(me, "new_indirect_compact_id_index", "NEW-INDIRECT-COMPACT-ID-INDEX", 1, 0, false);
        declareFunction(me, "id_index_ids", "ID-INDEX-IDS", 1, 0, false);
        declareFunction(me, "id_index_values", "ID-INDEX-VALUES", 1, 0, false);
        declareFunction(me, "clone_id_index", "CLONE-ID-INDEX", 1, 0, false);
        declareFunction(me, "copy_id_index", "COPY-ID-INDEX", 1, 1, false);
        declareFunction(me, "id_index_missing_ids", "ID-INDEX-MISSING-IDS", 1, 2, false);
        declareFunction(me, "test_id_index_missing_ids", "TEST-ID-INDEX-MISSING-IDS", 3, 0, false);
        declareFunction(me, "build_reverse_index_for_id_index", "BUILD-REVERSE-INDEX-FOR-ID-INDEX", 2, 1, false);
        declareFunction(me, "new_id_index_from_reverse_index", "NEW-ID-INDEX-FROM-REVERSE-INDEX", 1, 0, false);
        declareFunction(me, "find_max_index_id_in_reverse_index", "FIND-MAX-INDEX-ID-IN-REVERSE-INDEX", 1, 0, false);
        declareFunction(me, "test_new_index_from_reverse_index", "TEST-NEW-INDEX-FROM-REVERSE-INDEX", 2, 2, false);
        declareFunction(me, "new_id_index_for_testing_purposes", "NEW-ID-INDEX-FOR-TESTING-PURPOSES", 2, 1, false);
        declareFunction(me, "test_do_id_index_with_tombstones", "TEST-DO-ID-INDEX-WITH-TOMBSTONES", 3, 0, false);
        declareFunction(me, "new_id_index_for_testing_purposes_with_random_holes", "NEW-ID-INDEX-FOR-TESTING-PURPOSES-WITH-RANDOM-HOLES", 3, 1, false);
        declareFunction(me, "populate_reverse_index_for_id_index", "POPULATE-REVERSE-INDEX-FOR-ID-INDEX", 2, 0, false);
        declareFunction(me, "test_id_index_with_swizzling", "TEST-ID-INDEX-WITH-SWIZZLING", 2, 0, false);
        declareFunction(me, "test_id_index_ordered_iteration", "TEST-ID-INDEX-ORDERED-ITERATION", 2, 0, false);
        declareFunction(me, "test_pessimize_id_index", "TEST-PESSIMIZE-ID-INDEX", 0, 0, false);
        declareFunction(me, "benchmark_id_index_iteration", "BENCHMARK-ID-INDEX-ITERATION", 0, 0, false);
        declareFunction(me, "benchmark_id_index_iteration_int", "BENCHMARK-ID-INDEX-ITERATION-INT", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_id_index_file() {
        defconstant("*DTP-ID-INDEX*", ID_INDEX);
        deflexical("*ID-INDEX-DEFAULT-SCALING-FACTOR*", $int$100);
        deflexical("*ID-INDEX-EQUALITY-TEST*", EQL);
        defconstant("*ID-INDEX-EMPTY-LIST*", make_symbol($str47$THE_EMPTY_LIST));
        defconstant("*CFASL-WIDE-OPCODE-ID-INDEX*", $int$128);
        return NIL;
    }

    public static SubLObject setup_id_index_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_id_index$.getGlobalValue(), symbol_function(ID_INDEX_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(IDIX_LOCK, _CSETF_IDIX_LOCK);
        def_csetf(IDIX_COUNT, _CSETF_IDIX_COUNT);
        def_csetf(IDIX_NEXT_ID, _CSETF_IDIX_NEXT_ID);
        def_csetf(IDIX_DENSE_OBJECTS, _CSETF_IDIX_DENSE_OBJECTS);
        def_csetf(IDIX_SPARSE_OBJECTS, _CSETF_IDIX_SPARSE_OBJECTS);
        identity(ID_INDEX);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_id_index$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ID_INDEX_METHOD));
        register_macro_helper(ID_INDEX_DENSE_OBJECTS, DO_ID_INDEX_DENSE_OBJECTS);
        register_macro_helper(ID_INDEX_SPARSE_OBJECTS, DO_ID_INDEX_SPARSE_OBJECTS);
        register_macro_helper(ID_INDEX_LOCK, WITH_ID_INDEX_LOCKED);
        register_macro_helper(ID_INDEX_TOMBSTONE_P, DO_ID_INDEX);
        note_funcall_helper_function($sym58$ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_DONE_);
        note_funcall_helper_function(ID_INDEX_SPARSE_OBJECTS_ORDERED_ITERATOR_NEXT);
        register_macro_helper(ID_INDEX_OBJECTS_EMPTY_P, DO_ID_INDEX);
        register_macro_helper(DO_ID_INDEX_DENSE_OBJECTS, DO_ID_INDEX);
        register_macro_helper(ID_INDEX_DENSE_OBJECTS_EMPTY_P, DO_ID_INDEX_DENSE_OBJECTS);
        register_macro_helper(ID_INDEX_SKIP_TOMBSTONES_P, $list100);
        register_macro_helper(DO_ID_INDEX_SPARSE_OBJECTS, DO_ID_INDEX);
        register_macro_helper(ID_INDEX_SPARSE_OBJECTS_EMPTY_P, DO_ID_INDEX_SPARSE_OBJECTS);
        register_macro_helper(ID_INDEX_SPARSE_OBJECT_IDS, DO_ID_INDEX_SPARSE_OBJECTS);
        register_macro_helper(DO_ID_INDEX_NEXT_ID, NEW_DO_ID_INDEX);
        register_macro_helper(DO_ID_INDEX_NEXT_STATE, NEW_DO_ID_INDEX);
        register_macro_helper(DO_ID_INDEX_STATE_OBJECT, NEW_DO_ID_INDEX);
        register_macro_helper($sym145$DO_ID_INDEX_OBJECT_VALID_, NEW_DO_ID_INDEX);
        register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_id_index$.getGlobalValue(), CFASL_INPUT_ID_INDEX);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_id_index$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_ID_INDEX_METHOD));
        define_test_case_table_int(TEST_ID_INDEX_CFASL_SERIALIZATION, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list161);
        define_test_case_table_int(TEST_ID_INDEX_MISSING_IDS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list178);
        define_test_case_table_int(TEST_NEW_INDEX_FROM_REVERSE_INDEX, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list161);
        define_test_case_table_int(TEST_DO_ID_INDEX_WITH_TOMBSTONES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, NIL }), $list178);
        define_test_case_table_int(TEST_ID_INDEX_WITH_SWIZZLING, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list201);
        define_test_case_table_int(TEST_ID_INDEX_ORDERED_ITERATION, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list206);
        define_test_case_table_int(TEST_PESSIMIZE_ID_INDEX, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list222);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_id_index_file();
    }

    @Override
    public void initializeVariables() {
        init_id_index_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_id_index_file();
    }

    static {







































































































































































































































    }

    public static final class $id_index_native extends SubLStructNative {
        public SubLObject $lock;

        public SubLObject $count;

        public SubLObject $next_id;

        public SubLObject $dense_objects;

        public SubLObject $sparse_objects;

        private static final SubLStructDeclNative structDecl;

        public $id_index_native() {
            this.$lock = Lisp.NIL;
            this.$count = Lisp.NIL;
            this.$next_id = Lisp.NIL;
            this.$dense_objects = Lisp.NIL;
            this.$sparse_objects = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$lock;
        }

        @Override
        public SubLObject getField3() {
            return this.$count;
        }

        @Override
        public SubLObject getField4() {
            return this.$next_id;
        }

        @Override
        public SubLObject getField5() {
            return this.$dense_objects;
        }

        @Override
        public SubLObject getField6() {
            return this.$sparse_objects;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$count = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$next_id = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$dense_objects = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$sparse_objects = value;
        }

        static {
            structDecl = makeStructDeclNative(id_index.$id_index_native.class, ID_INDEX, ID_INDEX_P, $list2, $list3, new String[]{ "$lock", "$count", "$next_id", "$dense_objects", "$sparse_objects" }, $list4, $list5, PRINT_ID_INDEX);
        }
    }

    public static final class $id_index_p$UnaryFunction extends UnaryFunction {
        public $id_index_p$UnaryFunction() {
            super(extractFunctionNamed("ID-INDEX-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return id_index_p(arg1);
        }
    }
}

/**
 * Total time: 1086 ms synthetic
 */
