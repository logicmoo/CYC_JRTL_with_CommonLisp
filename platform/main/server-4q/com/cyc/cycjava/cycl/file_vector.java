package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_position;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.open_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class file_vector extends SubLTranslatedFile {
    public static final SubLFile me = new file_vector();

    public static final String myName = "com.cyc.cycjava.cycl.file_vector";

    public static final String myFingerPrint = "919d8aec2e2bd23ef0fcb67835d72ee80b26c98a28299f76efa22b0e8bed648c";

    // defconstant
    public static final SubLSymbol $dtp_fvector$ = makeSymbol("*DTP-FVECTOR*");

    // defconstant
    public static final SubLSymbol $default_file_vector_data_stream_buffer_size$ = makeSymbol("*DEFAULT-FILE-VECTOR-DATA-STREAM-BUFFER-SIZE*");

    // defconstant
    public static final SubLSymbol $default_file_vector_index_stream_buffer_size$ = makeSymbol("*DEFAULT-FILE-VECTOR-INDEX-STREAM-BUFFER-SIZE*");

    // defconstant
    public static final SubLSymbol $max_4byte_integer$ = makeSymbol("*MAX-4BYTE-INTEGER*");

    // defconstant
    public static final SubLSymbol $max_8byte_integer$ = makeSymbol("*MAX-8BYTE-INTEGER*");

    // deflexical
    public static final SubLSymbol $memory_map_chunk_size$ = makeSymbol("*MEMORY-MAP-CHUNK-SIZE*");

    // Internal Constants
    public static final SubLSymbol FVECTOR = makeSymbol("FVECTOR");

    public static final SubLSymbol FVECTOR_P = makeSymbol("FVECTOR-P");

    public static final SubLList $list2 = list(makeSymbol("DATA-STREAM"), makeSymbol("INDEX-STREAM"), makeSymbol("WIDE-MARK"));

    public static final SubLList $list3 = list(makeKeyword("DATA-STREAM"), makeKeyword("INDEX-STREAM"), makeKeyword("WIDE-MARK"));

    public static final SubLList $list4 = list(makeSymbol("FVECTOR-DATA-STREAM"), makeSymbol("FVECTOR-INDEX-STREAM"), makeSymbol("FVECTOR-WIDE-MARK"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-FVECTOR-DATA-STREAM"), makeSymbol("_CSETF-FVECTOR-INDEX-STREAM"), makeSymbol("_CSETF-FVECTOR-WIDE-MARK"));

    public static final SubLSymbol PRINT_FVECTOR = makeSymbol("PRINT-FVECTOR");

    public static final SubLSymbol FVECTOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FVECTOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FVECTOR-P"));

    private static final SubLSymbol FVECTOR_DATA_STREAM = makeSymbol("FVECTOR-DATA-STREAM");

    private static final SubLSymbol _CSETF_FVECTOR_DATA_STREAM = makeSymbol("_CSETF-FVECTOR-DATA-STREAM");

    private static final SubLSymbol FVECTOR_INDEX_STREAM = makeSymbol("FVECTOR-INDEX-STREAM");

    private static final SubLSymbol _CSETF_FVECTOR_INDEX_STREAM = makeSymbol("_CSETF-FVECTOR-INDEX-STREAM");

    private static final SubLSymbol FVECTOR_WIDE_MARK = makeSymbol("FVECTOR-WIDE-MARK");

    private static final SubLSymbol _CSETF_FVECTOR_WIDE_MARK = makeSymbol("_CSETF-FVECTOR-WIDE-MARK");

    private static final SubLString $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_FVECTOR = makeSymbol("MAKE-FVECTOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FVECTOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FVECTOR-METHOD");

    private static final SubLString $str24$_wide__ = makeString("(wide) ");

    private static final SubLString $str25$Data__ = makeString("Data: ");

    private static final SubLString $str26$_Index__ = makeString(" Index: ");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLString $str30$Invalid_data_filename__A_ = makeString("Invalid data filename ~A.");

    private static final SubLString $str31$Invalid_index_filename__A_ = makeString("Invalid index filename ~A.");

    private static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");

    private static final SubLSymbol FILE_VECTOR_P = makeSymbol("FILE-VECTOR-P");

    private static final SubLString $str41$Cannot_clone__A__This_method_is_c = makeString("Cannot clone ~A: This method is currently not implemented.");

    private static final SubLString $str42$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol FVECTOR_RAW_BYTE_SIZE_TO_LENGTH = makeSymbol("FVECTOR-RAW-BYTE-SIZE-TO-LENGTH");

    private static final SubLList $list50 = list(list(list(FOUR_INTEGER), ONE_INTEGER), list(list(EIGHT_INTEGER), TWO_INTEGER), list(list(TWELVE_INTEGER), THREE_INTEGER), list(list(SIXTEEN_INTEGER), FOUR_INTEGER), list(list(FOUR_INTEGER, TWO_INTEGER), ONE_INTEGER),
	    list(list(EIGHT_INTEGER, TWO_INTEGER), TWO_INTEGER), list(list(SIXTEEN_INTEGER, TWO_INTEGER), THREE_INTEGER), list(list(makeInteger(24), TWO_INTEGER), FOUR_INTEGER));

    private static final SubLInteger $int$4294967295 = makeInteger("4294967295");

    private static final SubLInteger $int$18446744073709551615 = makeInteger("18446744073709551615");

    private static final SubLString $str53$Invalid_state_transition____FILE_ = makeString("Invalid state transition -- FILE-VECTOR ~A is neither wide nor narrow?");

    private static final SubLSymbol WIDE_FVECTOR_INDEX_TO_FILE_POSITION = makeSymbol("WIDE-FVECTOR-INDEX-TO-FILE-POSITION");

    private static final SubLList $list55 = list(list(list(ZERO_INTEGER, TWO_INTEGER), ZERO_INTEGER), list(list(ONE_INTEGER, TWO_INTEGER), FOUR_INTEGER), list(list(TWO_INTEGER, TWO_INTEGER), EIGHT_INTEGER), list(list(THREE_INTEGER, TWO_INTEGER), SIXTEEN_INTEGER),
	    list(list(FOUR_INTEGER, TWO_INTEGER), makeInteger(24)));

    private static final SubLList $list56 = list(makeSymbol("&KEY"), makeSymbol("INDEX-SPOT"), makeSymbol("DATA-SPOT"));

    private static final SubLList $list57 = list(makeKeyword("INDEX-SPOT"), makeKeyword("DATA-SPOT"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLList $list61 = list(list(makeSymbol("FVECTOR"), makeSymbol("&OPTIONAL"), makeSymbol("INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym62$MEMENTO = makeUninternedSymbol("MEMENTO");

    private static final SubLSymbol BEGIN_FILE_VECTOR_EXCURSION = makeSymbol("BEGIN-FILE-VECTOR-EXCURSION");

    private static final SubLSymbol END_FILE_VECTOR_EXCURSION = makeSymbol("END-FILE-VECTOR-EXCURSION");

    private static final SubLList $list68 = list(list(makeSymbol("FVECTOR"), makeSymbol("DATA-FILE"), makeSymbol("INDEX-FILE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol NEW_FILE_VECTOR = makeSymbol("NEW-FILE-VECTOR");

    private static final SubLList $list71 = list(makeKeyword("OUTPUT"), makeSymbol("*DEFAULT-BIG-STREAM-BUFFER-SIZE*"), makeSymbol("*DEFAULT-BIG-STREAM-BUFFER-SIZE*"));

    private static final SubLSymbol CLOSE_FILE_VECTOR = makeSymbol("CLOSE-FILE-VECTOR");

    private static final SubLList $list74 = list(makeKeyword("INPUT"));

    private static final SubLSymbol FVECTOR_INDEX_ITERATOR_DONE = makeSymbol("FVECTOR-INDEX-ITERATOR-DONE");

    private static final SubLSymbol FVECTOR_INDEX_ITERATOR_NEXT = makeSymbol("FVECTOR-INDEX-ITERATOR-NEXT");

    private static final SubLList $list77 = list(makeSymbol("FVECTOR"), makeSymbol("CURRENT"), makeSymbol("SIZE"), makeSymbol("TUPLE"));

    private static final SubLSymbol GATHER_FILE_VECTOR_STATISTICS_FOR_FILENAMES = makeSymbol("GATHER-FILE-VECTOR-STATISTICS-FOR-FILENAMES");

    private static final SubLSymbol $ENABLE_MEMORY_MAPPING = makeKeyword("ENABLE-MEMORY-MAPPING");

    private static final SubLSymbol GATHER_FILE_VECTOR_STATISTICS = makeSymbol("GATHER-FILE-VECTOR-STATISTICS");

    private static final SubLList $list83 = list(makeKeyword("REVERSAL"), makeKeyword("TOMBSTONE"));

    private static final SubLSymbol $sym86$FILE_VECTOR_STATS_INDICATE_DENSE_INDEX_SPACE_ = makeSymbol("FILE-VECTOR-STATS-INDICATE-DENSE-INDEX-SPACE?");

    private static final SubLSymbol FILE_VECTOR_MEMORY_MAP_FOR_FILES = makeSymbol("FILE-VECTOR-MEMORY-MAP-FOR-FILES");

    private static final SubLInteger $int$1000000 = makeInteger(0xf4240);

    private static final SubLSymbol FILE_VECTOR_MEMORY_MAP = makeSymbol("FILE-VECTOR-MEMORY-MAP");

    private static final SubLList $list91 = cons(makeSymbol("INDEX"), makeSymbol("ADDRESS"));

    private static final SubLSymbol $sym92$FVECT_MEM_MAP_ = makeSymbol("FVECT-MEM-MAP<");

    private static final SubLList $list93 = cons(makeSymbol("ADDRESS"), makeSymbol("INDEX"));

    private static final SubLList $list94 = cons(makeSymbol("ADDRESS-A"), makeSymbol("INDEX-A"));

    private static final SubLList $list95 = cons(makeSymbol("ADDRESS-B"), makeSymbol("INDEX-B"));

    private static final SubLList $list96 = list(list(list(NIL, NIL), T), list(list(cons(makeInteger(62), ZERO_INTEGER), NIL), T), list(list(NIL, cons(makeInteger(62), ZERO_INTEGER)), NIL), list(list(cons(ZERO_INTEGER, ONE_INTEGER), cons(ZERO_INTEGER, TWO_INTEGER)), T),
	    list(list(cons(ZERO_INTEGER, THREE_INTEGER), cons(ZERO_INTEGER, TWO_INTEGER)), NIL), list(list(cons(makeInteger(80), THREE_INTEGER), cons(makeInteger(90), FOUR_INTEGER)), T), list(list(cons(makeInteger(90), FOUR_INTEGER), cons(makeInteger(80), THREE_INTEGER)), NIL));

    private static final SubLString $str98$Data_Address__A_is_past_the_end_o = makeString("Data Address ~A is past the end of the data stream (~A) of ~A.");

    private static final SubLString $str99$After__A_iterations__we_did_not_q = makeString("After ~A iterations, we did not quiesce when searching for ~A in [0,~A)");

    private static final SubLString $str100$Whoa___A_is_neither______or___to_ = makeString("Whoa, ~A is neither <, > or = to ~A???");

    private static final SubLString $$$Widening_ = makeString("Widening ");

    private static final SubLString $$$_entries_in_at_index_ = makeString(" entries in at index ");

    private static final SubLString $$$_to_ = makeString(" to ");

    private static final SubLString $str104$____ = makeString(" ...");

    private static final SubLString $$$_entries_absolutely_in_ = makeString(" entries absolutely in ");

    private static final SubLSymbol RECOVER_NARROW_FILE_VECTOR_INDEX = makeSymbol("RECOVER-NARROW-FILE-VECTOR-INDEX");

    private static final SubLString $$$_entries_from_ = makeString(" entries from ");

    private static final SubLString $str108$_____ = makeString(" ....");

    private static final SubLString $str110$Writing_wide_mark_ = makeString("Writing wide-mark ");

    private static final SubLSymbol RECOVER_WIDE_FILE_VECTOR_MARK = makeSymbol("RECOVER-WIDE-FILE-VECTOR-MARK");

    private static final SubLSymbol TEST_FILE_VECTOR_WRITING_AND_POSITIONING = makeSymbol("TEST-FILE-VECTOR-WRITING-AND-POSITIONING");

    private static final SubLList $list113 = list(list(list(TEN_INTEGER), TEN_INTEGER), list(list(makeInteger(23)), makeInteger(23)));

    private static final SubLString $str114$_tmp_ = makeString("/tmp/");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol TEST_WIDE_FILE_VECTOR_WRITING_AND_POSITIONING = makeSymbol("TEST-WIDE-FILE-VECTOR-WRITING-AND-POSITIONING");

    private static final SubLList $list118 = list(list(list(TEN_INTEGER, FIVE_INTEGER), TEN_INTEGER), list(list(makeInteger(23), TEN_INTEGER), makeInteger(23)), list(list(makeInteger(25), ZERO_INTEGER), makeInteger(25)));

    private static final SubLString $str119$A__A_entry_file_with_a_wide_mark_ = makeString("A ~A entry file with a wide-mark at ~A should be ~A bytes long, not ~A bytes.");

    private static final SubLString $str120$The_index_file_should_be_have_a_l = makeString("The index file should be have a length of ~A, not of ~A.");

    private static final SubLString $str121$We_are_loading_a_wide_file_vector = makeString("We are loading a wide file vector but it looks narrow?");

    private static final SubLString $str122$We_expected_a_wide_mark_of__A_but = makeString("We expected a wide mark of ~A but got ~A instead.");

    private static final SubLString $str123$The_next_index_is_supposed_to_be_ = makeString("The next index is supposed to be ~A, but it is ~A.");

    private static final SubLString $$$Position_ = makeString("Position ");

    private static final SubLString $str125$On_step___A__the_iteration_result = makeString("On step #~A, the iteration result was no longer valid.");

    private static final SubLList $list126 = cons(makeSymbol("ACTUAL-INDEX"), makeSymbol("ACTUAL-ADDRESS"));

    private static final SubLString $str127$The_expected_index__A_was_____act = makeString("The expected index ~A was =/= actual index ~A.");

    private static final SubLString $str128$The_expected_address__A_was_____a = makeString("The expected address ~A was =/= actual address ~A.");

    // static final boolean assertionsDisabledInClass =
    // !com/cyc/cycjava/cycl/desiredAssertionStatus();
    

    public static SubLObject fvector_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	print_fvector(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject fvector_p(final SubLObject v_object) {
	return v_object.getJavaClass() ==$fvector_native.class ? T : NIL;
    }

    public static SubLObject fvector_data_stream(final SubLObject v_object) {
	assert NIL != fvector_p(v_object) : "file_vector.fvector_p error :" + v_object;
	return v_object.getField2();
    }

    public static SubLObject fvector_index_stream(final SubLObject v_object) {
	assert NIL != fvector_p(v_object) : "file_vector.fvector_p error :" + v_object;
	return v_object.getField3();
    }

    public static SubLObject fvector_wide_mark(final SubLObject v_object) {
	assert NIL != fvector_p(v_object) : "file_vector.fvector_p error :" + v_object;
	return v_object.getField4();
    }

    public static SubLObject _csetf_fvector_data_stream(final SubLObject v_object, final SubLObject value) {
	assert NIL != fvector_p(v_object) : "file_vector.fvector_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_fvector_index_stream(final SubLObject v_object, final SubLObject value) {
	assert NIL != fvector_p(v_object) : "file_vector.fvector_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_fvector_wide_mark(final SubLObject v_object, final SubLObject value) {
	assert NIL != fvector_p(v_object) : "file_vector.fvector_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static SubLObject make_fvector(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new $fvector_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($DATA_STREAM)) {
		_csetf_fvector_data_stream(v_new, current_value);
	    } else if (pcase_var.eql($INDEX_STREAM)) {
		_csetf_fvector_index_stream(v_new, current_value);
	    } else if (pcase_var.eql($WIDE_MARK)) {
		_csetf_fvector_wide_mark(v_new, current_value);
	    } else {
		Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_fvector(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_FVECTOR, THREE_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $DATA_STREAM, fvector_data_stream(obj));
	funcall(visitor_fn, obj, $SLOT, $INDEX_STREAM, fvector_index_stream(obj));
	funcall(visitor_fn, obj, $SLOT, $WIDE_MARK, fvector_wide_mark(obj));
	funcall(visitor_fn, obj, $END, MAKE_FVECTOR, THREE_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_fvector_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_fvector(obj, visitor_fn);
    }

    public static SubLObject print_fvector(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $print_readably$.getDynamicValue(thread)) {
	    print_not_readable(v_object, stream);
	} else {
	    print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
	    if (NIL != wide_file_vectorP(v_object)) {
		write_string($str24$_wide__, stream, UNPROVIDED, UNPROVIDED);
	    }
	    write_string($str25$Data__, stream, UNPROVIDED, UNPROVIDED);
	    princ(fvector_data_stream(v_object), stream);
	    write_string($str26$_Index__, stream, UNPROVIDED, UNPROVIDED);
	    princ(fvector_index_stream(v_object), stream);
	    print_macros.print_unreadable_object_postamble(stream, v_object, NIL, NIL);
	}
	return v_object;
    }

    public static SubLObject new_fvector(final SubLObject data_stream, final SubLObject index_stream, SubLObject wide_mark) {
	if (wide_mark == UNPROVIDED) {
	    wide_mark = NIL;
	}
	final SubLObject fvector = make_fvector(UNPROVIDED);
	_csetf_fvector_data_stream(fvector, data_stream);
	_csetf_fvector_index_stream(fvector, index_stream);
	_csetf_fvector_wide_mark(fvector, wide_mark);
	return fvector;
    }

    public static SubLObject get_file_vector_wide_mark(final SubLObject fvector) {
	return fvector_wide_mark(fvector);
    }

    public static SubLObject specify_file_vector_wide_mark(final SubLObject fvector, final SubLObject wide_mark) {
	_csetf_fvector_wide_mark(fvector, wide_mark);
	return fvector;
    }

    public static SubLObject file_vector_p(final SubLObject v_object) {
	return fvector_p(v_object);
    }

    public static SubLObject new_file_vector(final SubLObject data_filename, final SubLObject index_filename, SubLObject direction, SubLObject data_stream_buffer_size, SubLObject index_stream_buffer_size, SubLObject enable_memory_mappingP) {
	if (direction == UNPROVIDED) {
	    direction = $INPUT;
	}
	if (data_stream_buffer_size == UNPROVIDED) {
	    data_stream_buffer_size = $default_file_vector_data_stream_buffer_size$.getGlobalValue();
	}
	if (index_stream_buffer_size == UNPROVIDED) {
	    index_stream_buffer_size = $default_file_vector_index_stream_buffer_size$.getGlobalValue();
	}
	if (enable_memory_mappingP == UNPROVIDED) {
	    enable_memory_mappingP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject data_stream = NIL;
	SubLObject index_stream = NIL;
	SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
	SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
	try {
	    StreamsLow.$stream_initial_input_buffer_size$.bind(data_stream_buffer_size, thread);
	    StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
	    data_stream = compatibility.open_binary(data_filename, direction);
	} finally {
	    StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
	    StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
	}
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == open_stream_p(data_stream))) {
	    Errors.error(Errors.error($str30$Invalid_data_filename__A_, data_filename));
	}
	_prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
	_prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
	try {
	    StreamsLow.$stream_initial_input_buffer_size$.bind(index_stream_buffer_size, thread);
	    StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
	    index_stream = compatibility.open_binary(index_filename, direction);
	} finally {
	    StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
	    StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
	}
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == open_stream_p(index_stream))) {
	    Errors.error(Errors.error($str31$Invalid_index_filename__A_, index_filename));
	}
	final SubLObject fv = create_file_vector(data_stream, index_stream);
	if (NIL != enable_memory_mappingP) {
	    file_vector_enable_memory_mapping(fv);
	}
	return fv;
    }

    public static SubLObject open_file_vector_for_rewrite(final SubLObject data_filename, final SubLObject index_filename, final SubLObject wide_mark_filename, SubLObject data_stream_buffer_size, SubLObject index_stream_buffer_size, SubLObject enable_memory_mappingP) {
	if (data_stream_buffer_size == UNPROVIDED) {
	    data_stream_buffer_size = $default_file_vector_data_stream_buffer_size$.getGlobalValue();
	}
	if (index_stream_buffer_size == UNPROVIDED) {
	    index_stream_buffer_size = $default_file_vector_index_stream_buffer_size$.getGlobalValue();
	}
	if (enable_memory_mappingP == UNPROVIDED) {
	    enable_memory_mappingP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject data_stream = NIL;
	SubLObject index_stream = NIL;
	SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
	SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
	try {
	    StreamsLow.$stream_initial_input_buffer_size$.bind(data_stream_buffer_size, thread);
	    StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
	    data_stream = StreamsLow.open(data_filename, new SubLObject[] { $DIRECTION, $IO, $IF_EXISTS, $OVERWRITE, $IF_DOES_NOT_EXIST, $ERROR, $ELEMENT_TYPE, $BINARY });
	} finally {
	    StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
	    StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
	}
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == open_stream_p(data_stream))) {
	    Errors.error(Errors.error($str30$Invalid_data_filename__A_, data_filename));
	}
	_prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
	_prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
	try {
	    StreamsLow.$stream_initial_input_buffer_size$.bind(index_stream_buffer_size, thread);
	    StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
	    index_stream = StreamsLow.open(index_filename, new SubLObject[] { $DIRECTION, $IO, $IF_EXISTS, $OVERWRITE, $IF_DOES_NOT_EXIST, $ERROR, $ELEMENT_TYPE, $BINARY });
	} finally {
	    StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
	    StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
	}
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == open_stream_p(index_stream))) {
	    Errors.error(Errors.error($str31$Invalid_index_filename__A_, index_filename));
	}
	final SubLObject fv = create_file_vector(data_stream, index_stream);
	if (NIL != enable_memory_mappingP) {
	    file_vector_enable_memory_mapping(fv);
	}
	final SubLObject wide_mark = possibly_load_file_vector_wide_mark(wide_mark_filename);
	if (NIL != list_utilities.sublisp_boolean(wide_mark)) {
	    specify_file_vector_wide_mark(fv, wide_mark);
	}
	return fv;
    }

    public static SubLObject open_file_vector_for_append(final SubLObject data_filename, final SubLObject index_filename, final SubLObject wide_mark_filename, SubLObject data_stream_buffer_size, SubLObject index_stream_buffer_size, SubLObject enable_memory_mappingP) {
	if (data_stream_buffer_size == UNPROVIDED) {
	    data_stream_buffer_size = $default_file_vector_data_stream_buffer_size$.getGlobalValue();
	}
	if (index_stream_buffer_size == UNPROVIDED) {
	    index_stream_buffer_size = $default_file_vector_index_stream_buffer_size$.getGlobalValue();
	}
	if (enable_memory_mappingP == UNPROVIDED) {
	    enable_memory_mappingP = NIL;
	}
	final SubLObject v_file_vector = open_file_vector_for_rewrite(data_filename, index_filename, wide_mark_filename, data_stream_buffer_size, index_stream_buffer_size, enable_memory_mappingP);
	compatibility.set_file_position(get_file_vector_data_stream(v_file_vector), $END);
	compatibility.set_file_position(get_file_vector_index_stream(v_file_vector), $END);
	return v_file_vector;
    }

    public static SubLObject new_wide_input_file_vector(final SubLObject data_filename, final SubLObject index_filename, final SubLObject wide_mark_filename, SubLObject data_stream_buffer_size, SubLObject index_stream_buffer_size, SubLObject enable_memory_mappingP) {
	if (data_stream_buffer_size == UNPROVIDED) {
	    data_stream_buffer_size = $default_file_vector_data_stream_buffer_size$.getGlobalValue();
	}
	if (index_stream_buffer_size == UNPROVIDED) {
	    index_stream_buffer_size = $default_file_vector_index_stream_buffer_size$.getGlobalValue();
	}
	if (enable_memory_mappingP == UNPROVIDED) {
	    enable_memory_mappingP = NIL;
	}
	final SubLObject wide_mark = possibly_load_file_vector_wide_mark(wide_mark_filename);
	final SubLObject fvector = new_file_vector(data_filename, index_filename, $INPUT, data_stream_buffer_size, index_stream_buffer_size, enable_memory_mappingP);
	if (NIL != list_utilities.sublisp_boolean(wide_mark)) {
	    specify_file_vector_wide_mark(fvector, wide_mark);
	}
	return fvector;
    }

    public static SubLObject create_file_vector(final SubLObject data_stream, final SubLObject index_stream) {
	return new_fvector(data_stream, index_stream, UNPROVIDED);
    }

    public static SubLObject create_wide_file_vector(final SubLObject data_stream, final SubLObject index_stream, final SubLObject wide_mark) {
	return specify_file_vector_wide_mark(create_file_vector(data_stream, index_stream), wide_mark);
    }

    public static SubLObject load_file_vector_wide_mark(final SubLObject wide_mark_filename) {
	final SubLObject wide_mark = cfasl_utilities.cfasl_load(wide_mark_filename);
	return wide_mark;
    }

    public static SubLObject possibly_load_file_vector_wide_mark(final SubLObject wide_mark_filename) {
	if (NIL != Filesys.probe_file(wide_mark_filename)) {
	    return load_file_vector_wide_mark(wide_mark_filename);
	}
	return NIL;
    }

    public static SubLObject save_file_vector_wide_mark(final SubLObject wide_mark, final SubLObject wide_mark_filename) {
	cfasl_utilities.cfasl_save_externalized(wide_mark, wide_mark_filename);
	return wide_mark;
    }

    public static SubLObject persist_file_vector_wide_mark(final SubLObject fvector, final SubLObject wide_mark_filename) {
	SubLSystemTrampolineFile.enforceType(fvector, FILE_VECTOR_P);
	return save_file_vector_wide_mark(get_file_vector_wide_mark(fvector), wide_mark_filename);
    }

    public static SubLObject clone_file_vector(final SubLObject fvector) {
	return Errors.error($str41$Cannot_clone__A__This_method_is_c, fvector);
    }

    public static SubLObject close_file_vector(final SubLObject fvector) {
	assert NIL != file_vector_p(fvector) : "file_vector.file_vector_p(fvector) " + "CommonSymbols.NIL != file_vector.file_vector_p(fvector) " + fvector;
	final SubLObject data_stream = fvector_data_stream(fvector);
	if (NIL != open_stream_p(data_stream)) {
	    close(data_stream, UNPROVIDED);
	}
	_csetf_fvector_data_stream(fvector, NIL);
	final SubLObject index_stream = fvector_index_stream(fvector);
	if (NIL != open_stream_p(index_stream)) {
	    close(index_stream, UNPROVIDED);
	}
	_csetf_fvector_index_stream(fvector, NIL);
	return fvector;
    }

    public static SubLObject file_vector_change_stream_buffer_sizes(final SubLObject v_file_vector, final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size) {
	_csetf_fvector_data_stream(v_file_vector, file_utilities.change_file_stream_buffer_size(fvector_data_stream(v_file_vector), data_stream_buffer_size));
	_csetf_fvector_index_stream(v_file_vector, file_utilities.change_file_stream_buffer_size(fvector_index_stream(v_file_vector), index_stream_buffer_size));
	return v_file_vector;
    }

    public static SubLObject file_vector_enable_memory_mapping(final SubLObject v_file_vector) {
	_csetf_fvector_data_stream(v_file_vector, file_utilities.enable_file_stream_memory_mapping(fvector_data_stream(v_file_vector)));
	_csetf_fvector_index_stream(v_file_vector, file_utilities.enable_file_stream_memory_mapping(fvector_index_stream(v_file_vector)));
	return v_file_vector;
    }

    public static SubLObject file_vector_memory_mappedP(final SubLObject v_file_vector) {
	return makeBoolean((NIL != file_utilities.file_stream_memory_mappedP(fvector_data_stream(v_file_vector))) && (NIL != file_utilities.file_stream_memory_mappedP(fvector_index_stream(v_file_vector))));
    }

    public static SubLObject get_file_vector_data_stream(final SubLObject fvector) {
	assert NIL != file_vector_p(fvector) : "file_vector.file_vector_p(fvector) " + "CommonSymbols.NIL != file_vector.file_vector_p(fvector) " + fvector;
	return fvector_data_stream(fvector);
    }

    public static SubLObject get_file_vector_index_stream(final SubLObject fvector) {
	assert NIL != file_vector_p(fvector) : "file_vector.file_vector_p(fvector) " + "CommonSymbols.NIL != file_vector.file_vector_p(fvector) " + fvector;
	return fvector_index_stream(fvector);
    }

    public static SubLObject wide_file_vectorP(final SubLObject fvector) {
	assert NIL != file_vector_p(fvector) : "file_vector.file_vector_p(fvector) " + "CommonSymbols.NIL != file_vector.file_vector_p(fvector) " + fvector;
	return list_utilities.sublisp_boolean(get_file_vector_wide_mark(fvector));
    }

    public static SubLObject narrow_file_vectorP(final SubLObject fvector) {
	return makeBoolean(NIL == wide_file_vectorP(fvector));
    }

    public static SubLObject file_vector_length(final SubLObject fvector) {
	assert NIL != file_vector_p(fvector) : "file_vector.file_vector_p(fvector) " + "CommonSymbols.NIL != file_vector.file_vector_p(fvector) " + fvector;
	return file_vector_length_from_index_stream(fvector_index_stream(fvector), get_file_vector_wide_mark(fvector));
    }

    public static SubLObject file_vector_length_from_index(final SubLObject index_filename) {
	return file_vector_length_from_index_int(index_filename, NIL);
    }

    public static SubLObject wide_file_vector_length_from_index(final SubLObject index_filename, final SubLObject wide_mark_filename) {
	final SubLObject wide_mark = load_file_vector_wide_mark(wide_mark_filename);
	return file_vector_length_from_index_int(index_filename, wide_mark);
    }

    public static SubLObject file_vector_length_from_index_int(final SubLObject index_filename, final SubLObject wide_mark) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == Filesys.probe_file(index_filename)) {
	    Errors.error($str31$Invalid_index_filename__A_, index_filename);
	}
	SubLObject length = NIL;
	SubLObject stream = NIL;
	try {
	    final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
	    try {
		stream_macros.$stream_requires_locking$.bind(NIL, thread);
		stream = compatibility.open_binary(index_filename, $INPUT);
	    } finally {
		stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
	    }
	    if (!stream.isStream()) {
		Errors.error($str42$Unable_to_open__S, index_filename);
	    }
	    final SubLObject index_stream = stream;
	    length = file_vector_length_from_index_stream(index_stream, wide_mark);
	} finally {
	    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
	    try {
		$is_thread_performing_cleanupP$.bind(T, thread);
		final SubLObject _values = getValuesAsVector();
		if (stream.isStream()) {
		    close(stream, UNPROVIDED);
		}
		restoreValuesFromVector(_values);
	    } finally {
		$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
	    }
	}
	return length;
    }

    public static SubLObject file_vector_length_from_index_stream(final SubLObject index_stream, final SubLObject wide_mark) {
	final SubLObject bytes = file_length(index_stream);
	return fvector_raw_byte_size_to_length(bytes, wide_mark);
    }

    public static SubLObject file_vector_data_size(final SubLObject fvector) {
	return file_vector_data_size_from_data_stream(fvector_data_stream(fvector));
    }

    public static SubLObject file_vector_data_size_from_filename(final SubLObject data_filename) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == Filesys.probe_file(data_filename)) {
	    Errors.error($str30$Invalid_data_filename__A_, data_filename);
	}
	SubLObject length = NIL;
	SubLObject stream = NIL;
	try {
	    final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
	    try {
		stream_macros.$stream_requires_locking$.bind(NIL, thread);
		stream = compatibility.open_binary(data_filename, $INPUT);
	    } finally {
		stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
	    }
	    if (!stream.isStream()) {
		Errors.error($str42$Unable_to_open__S, data_filename);
	    }
	    final SubLObject data_stream = stream;
	    length = file_vector_data_size_from_data_stream(data_stream);
	} finally {
	    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
	    try {
		$is_thread_performing_cleanupP$.bind(T, thread);
		final SubLObject _values = getValuesAsVector();
		if (stream.isStream()) {
		    close(stream, UNPROVIDED);
		}
		restoreValuesFromVector(_values);
	    } finally {
		$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
	    }
	}
	return length;
    }

    public static SubLObject file_vector_data_size_from_data_stream(final SubLObject data_stream) {
	return file_length(data_stream);
    }

    public static SubLObject file_vector_next_index(final SubLObject fvector) {
	return fvector_raw_byte_size_to_length(file_position(fvector_index_stream(fvector), UNPROVIDED), get_file_vector_wide_mark(fvector));
    }

    public static SubLObject fvector_raw_byte_size_to_length(final SubLObject bytes, SubLObject wide_mark) {
	if (wide_mark == UNPROVIDED) {
	    wide_mark = NIL;
	}
	if (NIL == wide_mark) {
	    return integerDivide(bytes, FOUR_INTEGER);
	}
	final SubLObject bytes_of_narrow_part = multiply(wide_mark, FOUR_INTEGER);
	if (bytes.numE(bytes_of_narrow_part)) {
	    return wide_mark;
	}
	if (bytes.numL(bytes_of_narrow_part)) {
	    return fvector_raw_byte_size_to_length(bytes, UNPROVIDED);
	}
	final SubLObject bytes_of_wide_part = subtract(bytes, bytes_of_narrow_part);
	final SubLObject length_of_wide_part = integerDivide(bytes_of_wide_part, EIGHT_INTEGER);
	return add(wide_mark, length_of_wide_part);
    }

    public static SubLObject position_file_vector(final SubLObject fvector, SubLObject index) {
	if (index == UNPROVIDED) {
	    index = NIL;
	}
	assert NIL != file_vector_p(fvector) : "file_vector.file_vector_p(fvector) " + "CommonSymbols.NIL != file_vector.file_vector_p(fvector) " + fvector;
	final SubLObject data_stream = fvector_data_stream(fvector);
	final SubLObject data_address = read_file_vector_index_entry(fvector, index);
	compatibility.set_file_position(data_stream, data_address);
	return data_stream;
    }

    public static SubLObject position_file_vector_index_for_update(final SubLObject fvector, final SubLObject index) {
	final SubLObject address = read_file_vector_index_entry(fvector, index);
	position_file_vector_index(fvector, index);
	return address;
    }

    public static SubLObject position_file_vector_index(final SubLObject fvector, final SubLObject index) {
	final SubLObject index_stream = fvector_index_stream(fvector);
	SubLObject index_address = NIL;
	if (NIL != narrow_file_vectorP(fvector)) {
	    index_address = multiply(index, FOUR_INTEGER);
	} else if (NIL != wide_file_vectorP(fvector)) {
	    final SubLObject wide_mark = get_file_vector_wide_mark(fvector);
	    index_address = wide_fvector_index_to_file_position(index, wide_mark);
	} else {
	    Errors.error($str53$Invalid_state_transition____FILE_, fvector);
	}

	compatibility.set_file_position(index_stream, index_address);
	return fvector;
    }

    public static SubLObject read_file_vector_index_entry(final SubLObject fvector, SubLObject index) {
	if (index == UNPROVIDED) {
	    index = NIL;
	}
	final SubLObject index_stream = fvector_index_stream(fvector);
	final SubLObject wide_mark = get_file_vector_wide_mark(fvector);
	SubLObject data_address = NIL;
	if (NIL != subl_promotions.non_negative_integer_p(index)) {
	    position_file_vector_index(fvector, index);
	} else if (NIL != wide_file_vectorP(fvector)) {
	    index = fvector_file_position_to_index(file_position(index_stream, UNPROVIDED), wide_mark);
	}

	data_address = (((NIL == wide_mark) || (NIL == index)) || index.numL(wide_mark)) ? file_hash_table.read_fht_uint4(index_stream) : file_hash_table.read_fht_uint8(index_stream);
	return data_address;
    }

    public static SubLObject wide_fvector_index_to_file_position(final SubLObject index, final SubLObject wide_mark) {
	if (index.numLE(wide_mark)) {
	    return multiply(index, FOUR_INTEGER);
	}
	final SubLObject narrow_part = multiply(wide_mark, FOUR_INTEGER);
	final SubLObject nth_wide = subtract(index, wide_mark);
	final SubLObject wide_part = multiply(nth_wide, EIGHT_INTEGER);
	return add(narrow_part, wide_part);
    }

    public static SubLObject fvector_file_position_to_index(final SubLObject index, SubLObject wide_mark) {
	if (wide_mark == UNPROVIDED) {
	    wide_mark = NIL;
	}
	return fvector_raw_byte_size_to_length(index, wide_mark);
    }

    public static SubLObject begin_file_vector_excursion(final SubLObject fvector, SubLObject index) {
	if (index == UNPROVIDED) {
	    index = NIL;
	}
	final SubLObject index_spot = compatibility.get_file_position(fvector_index_stream(fvector));
	final SubLObject data_spot = compatibility.get_file_position(fvector_data_stream(fvector));
	position_file_vector_index(fvector, index);
	return fvector_make_memento(index_spot, data_spot);
    }

    public static SubLObject end_file_vector_excursion(final SubLObject fvector, final SubLObject memento) {
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = memento;
	SubLObject bad = NIL;
	SubLObject current_$1 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, memento, $list56);
	    current_$1 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, memento, $list56);
	    if (NIL == member(current_$1, $list57, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$1 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(memento, $list56);
	}
	final SubLObject index_spot_tail = property_list_member($INDEX_SPOT, memento);
	final SubLObject index_spot = (NIL != index_spot_tail) ? cadr(index_spot_tail) : NIL;
	final SubLObject data_spot_tail = property_list_member($DATA_SPOT, memento);
	final SubLObject data_spot = (NIL != data_spot_tail) ? cadr(data_spot_tail) : NIL;
	compatibility.set_file_position(fvector_index_stream(fvector), index_spot);
	compatibility.set_file_position(fvector_data_stream(fvector), data_spot);
	return fvector;
    }

    public static SubLObject fvector_make_memento(final SubLObject index_spot, final SubLObject data_spot) {
	return list($INDEX_SPOT, index_spot, $DATA_SPOT, data_spot);
    }

    public static SubLObject with_file_vector_excursion(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list61);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject fvector = NIL;
	destructuring_bind_must_consp(current, datum, $list61);
	fvector = current.first();
	current = current.rest();
	final SubLObject index = (current.isCons()) ? current.first() : NIL;
	destructuring_bind_must_listp(current, datum, $list61);
	current = current.rest();
	if (NIL == current) {
	    final SubLObject body;
	    current = body = temp;
	    final SubLObject memento = $sym62$MEMENTO;
	    return list(CLET, list(list(memento, list(BEGIN_FILE_VECTOR_EXCURSION, fvector, index))), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(END_FILE_VECTOR_EXCURSION, fvector, memento)));
	}
	cdestructuring_bind_error(datum, $list61);
	return NIL;
    }

    public static SubLObject with_output_to_file_vector(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list68);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject fvector = NIL;
	SubLObject data_file = NIL;
	SubLObject index_file = NIL;
	destructuring_bind_must_consp(current, datum, $list68);
	fvector = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list68);
	data_file = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list68);
	index_file = current.first();
	current = current.rest();
	if (NIL == current) {
	    final SubLObject body;
	    current = body = temp;
	    return list(CLET, list(fvector), list(CUNWIND_PROTECT, list(PROGN, list(CSETQ, fvector, listS(NEW_FILE_VECTOR, data_file, index_file, $list71)), bq_cons(PROGN, append(body, NIL))), list(PWHEN, list(FILE_VECTOR_P, fvector), list(CLOSE_FILE_VECTOR, fvector))));
	}
	cdestructuring_bind_error(datum, $list68);
	return NIL;
    }

    public static SubLObject update_file_vector_index(final SubLObject fvector) {
	force_output(fvector_data_stream(fvector));
	return update_file_vector_index_linear(fvector);
    }

    public static SubLObject update_file_vector_index_linear(final SubLObject fvector) {
	final SubLObject data_stream = fvector_data_stream(fvector);
	final SubLObject address = file_position(data_stream, UNPROVIDED);
	write_file_vector_index_entry(fvector, address);
	return fvector;
    }

    public static SubLObject overwrite_file_vector_index(final SubLObject fvector) {
	final SubLObject index_stream = fvector_index_stream(fvector);
	update_file_vector_index_linear(fvector);
	force_output(index_stream);
	return fvector;
    }

    public static SubLObject write_file_vector_index_entry(final SubLObject fvector, final SubLObject address) {
	final SubLObject index_stream = fvector_index_stream(fvector);
	if (NIL != narrow_file_vectorP(fvector)) {
	    if (address.numL($max_4byte_integer$.getGlobalValue())) {
		file_hash_table.write_fht_uint4(index_stream, address);
		return fvector;
	    }
	    final SubLObject index_file_pos = file_position(index_stream, UNPROVIDED);
	    final SubLObject wide_mark = fvector_file_position_to_index(index_file_pos, NIL);
	    specify_file_vector_wide_mark(fvector, wide_mark);
	    file_hash_table.write_fht_uint8(index_stream, address);
	    return fvector;
	} else {
	    if (NIL != wide_file_vectorP(fvector)) {
		final SubLObject wide_mark2 = get_file_vector_wide_mark(fvector);
		final SubLObject index_file_pos2 = file_position(index_stream, UNPROVIDED);
		final SubLObject index = fvector_raw_byte_size_to_length(index_file_pos2, wide_mark2);
		if (index.numL(wide_mark2)) {
		    file_hash_table.write_fht_uint4(index_stream, address);
		} else {
		    file_hash_table.write_fht_uint8(index_stream, address);
		}
		return fvector;
	    }
	    Errors.error($str53$Invalid_state_transition____FILE_, fvector);
	    return NIL;
	}
    }

    public static SubLObject place_file_vector_index_tombstone(final SubLObject fvector) {
	place_file_vector_index_tombstone_linear(fvector);
	force_output(fvector_index_stream(fvector));
	return NIL;
    }

    public static SubLObject place_file_vector_index_tombstone_linear(final SubLObject fvector) {
	write_file_vector_index_entry(fvector, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject with_input_from_file_vector(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list68);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject fvector = NIL;
	SubLObject data_file = NIL;
	SubLObject index_file = NIL;
	destructuring_bind_must_consp(current, datum, $list68);
	fvector = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list68);
	data_file = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list68);
	index_file = current.first();
	current = current.rest();
	if (NIL == current) {
	    final SubLObject body;
	    current = body = temp;
	    return list(CLET, list(fvector), list(CUNWIND_PROTECT, list(PROGN, list(CSETQ, fvector, listS(NEW_FILE_VECTOR, data_file, index_file, $list74)), bq_cons(PROGN, append(body, NIL))), list(PWHEN, list(FILE_VECTOR_P, fvector), list(CLOSE_FILE_VECTOR, fvector))));
	}
	cdestructuring_bind_error(datum, $list68);
	return NIL;
    }

    public static SubLObject new_file_vector_index_iterator(final SubLObject fvector) {
	return iteration.new_iterator(make_file_vector_index_iterator_state(fvector), FVECTOR_INDEX_ITERATOR_DONE, FVECTOR_INDEX_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject make_file_vector_index_iterator_state(final SubLObject fvector) {
	final SubLObject size = file_vector_length(fvector);
	final SubLObject current = ZERO_INTEGER;
	final SubLObject tuple = cons(MINUS_ONE_INTEGER, MINUS_ONE_INTEGER);
	return list(fvector, current, size, tuple);
    }

    public static SubLObject fvector_index_iterator_done(final SubLObject state) {
	SubLObject fvector = NIL;
	SubLObject current_$2 = NIL;
	SubLObject size = NIL;
	SubLObject tuple = NIL;
	destructuring_bind_must_consp(state, state, $list77);
	fvector = state.first();
	SubLObject current = state.rest();
	destructuring_bind_must_consp(current, state, $list77);
	current_$2 = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, state, $list77);
	size = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, state, $list77);
	tuple = current.first();
	current = current.rest();
	if (NIL == current) {
	    return numLE(size, current_$2);
	}
	cdestructuring_bind_error(state, $list77);
	return NIL;
    }

    public static SubLObject fvector_index_iterator_next(final SubLObject state) {
	SubLObject fvector = NIL;
	SubLObject current_$3 = NIL;
	SubLObject size = NIL;
	SubLObject tuple = NIL;
	destructuring_bind_must_consp(state, state, $list77);
	fvector = state.first();
	SubLObject current = state.rest();
	destructuring_bind_must_consp(current, state, $list77);
	current_$3 = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, state, $list77);
	size = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, state, $list77);
	tuple = current.first();
	current = current.rest();
	if (NIL == current) {
	    final SubLObject address = read_file_vector_index_entry(fvector, current_$3);
	    rplaca(tuple, current_$3);
	    rplacd(tuple, address);
	    set_nth(ONE_INTEGER, state, add(current_$3, ONE_INTEGER));
	    return values(tuple, state);
	}
	cdestructuring_bind_error(state, $list77);
	return NIL;
    }

    public static SubLObject gather_file_vector_statistics_for_filenames(final SubLObject data_filename, final SubLObject index_filename) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject fvector = NIL;
	SubLObject stats = NIL;
	try {
	    final SubLObject bufsiz = file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread);
	    fvector = new_file_vector(data_filename, index_filename, $INPUT, bufsiz, bufsiz, $ENABLE_MEMORY_MAPPING);
	    stats = gather_file_vector_statistics(fvector);
	} finally {
	    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
	    try {
		$is_thread_performing_cleanupP$.bind(T, thread);
		final SubLObject _values = getValuesAsVector();
		if (NIL != file_vector_p(fvector)) {
		    close_file_vector(fvector);
		}
		restoreValuesFromVector(_values);
	    } finally {
		$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
	    }
	}
	return stats;
    }

    public static SubLObject gather_file_vector_statistics(final SubLObject fvector) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject count = file_vector_length(fvector);
	final SubLObject size = file_vector_data_size(fvector);
	final SubLObject fv_it = new_file_vector_index_iterator(fvector);
	SubLObject prev = ZERO_INTEGER;
	final SubLObject stats = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
	map_utilities.map_put(stats, $INDEX_ENTRIES, count);
	map_utilities.map_put(stats, $DATA_BYTES, size);
	SubLObject cdolist_list_var = $list83;
	SubLObject tag = NIL;
	tag = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    map_utilities.map_put(stats, tag, ZERO_INTEGER);
	    cdolist_list_var = cdolist_list_var.rest();
	    tag = cdolist_list_var.first();
	}
	SubLObject valid;
	for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
	    thread.resetMultipleValues();
	    final SubLObject tuple = iteration.iteration_next(fv_it);
	    valid = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    if (NIL != valid) {
		final SubLObject address = tuple.rest();
		if (address.isZero()) {
		    map_utilities.map_increment(stats, $TOMBSTONE, UNPROVIDED);
		} else if (prev.numG(address)) {
		    map_utilities.map_increment(stats, $REVERSAL, UNPROVIDED);
		}

		prev = address;
	    }
	}
	return stats;
    }

    public static SubLObject file_vector_stats_indicate_dense_index_spaceP(final SubLObject stats) {
	return makeBoolean(map_utilities.map_get(stats, $REVERSAL, MINUS_ONE_INTEGER).isZero() && map_utilities.map_get(stats, $TOMBSTONE, MINUS_ONE_INTEGER).isZero());
    }

    public static SubLObject file_vector_memory_map_for_files(final SubLObject data_filename, final SubLObject index_filename, final SubLObject memmap_file) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject fvector = NIL;
	try {
	    final SubLObject bufsiz = file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread);
	    fvector = new_file_vector(data_filename, index_filename, $INPUT, bufsiz, bufsiz, $ENABLE_MEMORY_MAPPING);
	    file_vector_memory_map(fvector, memmap_file);
	} finally {
	    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
	    try {
		$is_thread_performing_cleanupP$.bind(T, thread);
		final SubLObject _values = getValuesAsVector();
		if (NIL != file_vector_p(fvector)) {
		    close_file_vector(fvector);
		}
		restoreValuesFromVector(_values);
	    } finally {
		$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
	    }
	}
	return memmap_file;
    }

    public static SubLObject file_vector_memory_map(final SubLObject fvector, final SubLObject memmap_file) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
	final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
	try {
	    StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
	    StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
	    SubLObject stream = NIL;
	    try {
		final SubLObject _prev_bind_0_$4 = stream_macros.$stream_requires_locking$.currentBinding(thread);
		try {
		    stream_macros.$stream_requires_locking$.bind(NIL, thread);
		    stream = compatibility.open_binary(memmap_file, $OUTPUT);
		} finally {
		    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$4, thread);
		}
		if (!stream.isStream()) {
		    Errors.error($str42$Unable_to_open__S, memmap_file);
		}
		final SubLObject sm = stream;
		final SubLObject map_buffer = make_vector($memory_map_chunk_size$.getGlobalValue(), UNPROVIDED);
		final SubLObject fv_it = new_file_vector_index_iterator(fvector);
		SubLObject bufinx = ZERO_INTEGER;
		SubLObject valid;
		for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
		    thread.resetMultipleValues();
		    final SubLObject tuple = iteration.iteration_next(fv_it);
		    valid = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    if (NIL != valid) {
			SubLObject current;
			final SubLObject datum = current = tuple;
			SubLObject index = NIL;
			SubLObject address = NIL;
			destructuring_bind_must_consp(current, datum, $list91);
			index = current.first();
			current = address = current.rest();
			set_aref(map_buffer, bufinx, cons(address, index));
			bufinx = add(bufinx, ONE_INTEGER);
			if (!bufinx.numL(length(map_buffer))) {
			    fvectmemmap_flush_buffer(sm, map_buffer, bufinx);
			    bufinx = ZERO_INTEGER;
			}
		    }
		}
		fvectmemmap_flush_buffer(sm, map_buffer, bufinx);
	    } finally {
		final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    if (stream.isStream()) {
			close(stream, UNPROVIDED);
		    }
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
		}
	    }
	} finally {
	    StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
	    StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
	}
	return memmap_file;
    }

    public static SubLObject fvectmemmap_flush_buffer(final SubLObject sm, final SubLObject map_buffer, final SubLObject bufinx) {
	for (SubLObject padinx = bufinx; padinx.numL(length(map_buffer)); padinx = add(padinx, ONE_INTEGER)) {
	    set_aref(map_buffer, padinx, NIL);
	}
	Sort.sort(map_buffer, $sym92$FVECT_MEM_MAP_, UNPROVIDED);
	SubLObject i;
	SubLObject current;
	SubLObject datum;
	SubLObject address;
	SubLObject index;
	for (i = NIL, i = ZERO_INTEGER; i.numL(bufinx); i = add(i, ONE_INTEGER)) {
	    datum = current = aref(map_buffer, i);
	    address = NIL;
	    index = NIL;
	    destructuring_bind_must_consp(current, datum, $list93);
	    address = current.first();
	    current = index = current.rest();
	    file_hash_table.write_fht_uint8(sm, address);
	    file_hash_table.write_fht_uint4(sm, index);
	}
	return sm;
    }

    public static SubLObject fvect_mem_mapL(final SubLObject entry_a, final SubLObject entry_b) {
	if (NIL == entry_a) {
	    return sublisp_null(entry_b);
	}
	if (NIL == entry_b) {
	    return T;
	}
	SubLObject address_a = NIL;
	SubLObject index_a = NIL;
	destructuring_bind_must_consp(entry_a, entry_a, $list94);
	address_a = entry_a.first();
	final SubLObject current = index_a = entry_a.rest();
	SubLObject address_b = NIL;
	SubLObject index_b = NIL;
	destructuring_bind_must_consp(entry_b, entry_b, $list95);
	address_b = entry_b.first();
	final SubLObject current_$7 = index_b = entry_b.rest();
	if (address_a.isZero() && address_b.isZero()) {
	    return numL(index_a, index_b);
	}
	return numL(address_a, address_b);
    }

    public static SubLObject find_file_vector_data_address_in_index(final SubLObject fvector, final SubLObject data_address) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != file_vector_p(fvector) : "file_vector.file_vector_p(fvector) " + "CommonSymbols.NIL != file_vector.file_vector_p(fvector) " + fvector;
	assert NIL != subl_promotions.non_negative_integer_p(data_address) : "subl_promotions.non_negative_integer_p(data_address) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(data_address) " + data_address;
	final SubLObject max_data_position = file_length(get_file_vector_data_stream(fvector));
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!data_address.numLE(max_data_position))) {
	    Errors.error($str98$Data_Address__A_is_past_the_end_o, data_address, max_data_position, fvector);
	}
	final SubLObject max_loop = multiply(TWO_INTEGER, log(data_address, TWO_INTEGER));
	SubLObject curr_loop = ZERO_INTEGER;
	SubLObject min_index = ZERO_INTEGER;
	SubLObject max_index = file_vector_length(fvector);
	while (min_index.numL(max_index)) {
	    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!curr_loop.numL(max_loop))) {
		Errors.error($str99$After__A_iterations__we_did_not_q, curr_loop, data_address, max_data_position);
	    }
	    final SubLObject curr = integerDivide(add(max_index, min_index), TWO_INTEGER);
	    final SubLObject address = read_file_vector_index_entry(fvector, curr);
	    if (data_address.numE(address)) {
		return values(curr, address, curr, address);
	    }
	    if (data_address.numL(address)) {
		max_index = curr;
	    } else if (data_address.numG(address)) {
		min_index = add(curr, ONE_INTEGER);
	    } else {
		Errors.error($str100$Whoa___A_is_neither______or___to_, data_address, address);
	    }

	    curr_loop = add(curr_loop, ONE_INTEGER);
	}
	if (min_index.numG(max_index)) {
	    final SubLObject swap_var = min_index;
	    min_index = max_index;
	    max_index = swap_var;
	}
	return values(min_index, read_file_vector_index_entry(fvector, min_index), max_index, read_file_vector_index_entry(fvector, max_index));
    }

    public static SubLObject widen_file_vector_index_at_mark(final SubLObject old_index_filename, final SubLObject new_index_filename, final SubLObject wide_mark_filename) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject wide_mark = load_file_vector_wide_mark(wide_mark_filename);
	final SubLObject entries = file_vector_length_from_index(old_index_filename);
	final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
	final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
	try {
	    StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
	    StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
	    SubLObject stream = NIL;
	    try {
		final SubLObject _prev_bind_0_$8 = stream_macros.$stream_requires_locking$.currentBinding(thread);
		try {
		    stream_macros.$stream_requires_locking$.bind(NIL, thread);
		    stream = compatibility.open_binary(old_index_filename, $INPUT);
		} finally {
		    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$8, thread);
		}
		if (!stream.isStream()) {
		    Errors.error($str42$Unable_to_open__S, old_index_filename);
		}
		final SubLObject old = stream;
		SubLObject stream_$9 = NIL;
		try {
		    final SubLObject _prev_bind_0_$9 = stream_macros.$stream_requires_locking$.currentBinding(thread);
		    try {
			stream_macros.$stream_requires_locking$.bind(NIL, thread);
			stream_$9 = compatibility.open_binary(new_index_filename, $OUTPUT);
		    } finally {
			stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$9, thread);
		    }
		    if (!stream_$9.isStream()) {
			Errors.error($str42$Unable_to_open__S, new_index_filename);
		    }
		    final SubLObject v_new = stream_$9;
		    final SubLObject msg = cconcatenate($$$Widening_, new SubLObject[] { format_nil.format_nil_a_no_copy(entries), $$$_entries_in_at_index_, format_nil.format_nil_a_no_copy(old_index_filename), $$$_to_, format_nil.format_nil_a_no_copy(wide_mark), $str104$____ });
		    final SubLObject _prev_bind_0_$10 = $progress_note$.currentBinding(thread);
		    final SubLObject _prev_bind_1_$12 = $progress_start_time$.currentBinding(thread);
		    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
		    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
		    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
		    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
		    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
		    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
		    try {
			$progress_note$.bind(msg, thread);
			$progress_start_time$.bind(get_universal_time(), thread);
			$progress_total$.bind(entries, thread);
			$progress_sofar$.bind(ZERO_INTEGER, thread);
			$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
			$last_percent_progress_prediction$.bind(NIL, thread);
			$within_noting_percent_progress$.bind(T, thread);
			$percent_progress_start_time$.bind(get_universal_time(), thread);
			try {
			    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
			    SubLObject i;
			    SubLObject address;
			    for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
				address = file_hash_table.read_fht_uint4(old);
				if (i.numL(wide_mark)) {
				    file_hash_table.write_fht_uint4(v_new, address);
				} else {
				    file_hash_table.write_fht_uint8(v_new, address);
				}
				$progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
				note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
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
			$percent_progress_start_time$.rebind(_prev_bind_8, thread);
			$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
			$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
			$last_percent_progress_index$.rebind(_prev_bind_5, thread);
			$progress_sofar$.rebind(_prev_bind_4, thread);
			$progress_total$.rebind(_prev_bind_3, thread);
			$progress_start_time$.rebind(_prev_bind_1_$12, thread);
			$progress_note$.rebind(_prev_bind_0_$10, thread);
		    }
		} finally {
		    final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
		    try {
			$is_thread_performing_cleanupP$.bind(T, thread);
			final SubLObject _values2 = getValuesAsVector();
			if (stream_$9.isStream()) {
			    close(stream_$9, UNPROVIDED);
			}
			restoreValuesFromVector(_values2);
		    } finally {
			$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
		    }
		}
	    } finally {
		final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values3 = getValuesAsVector();
		    if (stream.isStream()) {
			close(stream, UNPROVIDED);
		    }
		    restoreValuesFromVector(_values3);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
		}
	    }
	} finally {
	    StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
	    StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
	}
	return new_index_filename;
    }

    public static SubLObject widen_file_vector_index(final SubLObject new_index_filename, final SubLObject new_wide_mark, final SubLObject old_index_filename, SubLObject old_wide_mark) {
	if (old_wide_mark == UNPROVIDED) {
	    old_wide_mark = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject entries = (NIL != old_wide_mark) ? wide_file_vector_length_from_index(old_index_filename, old_wide_mark) : file_vector_length_from_index(old_index_filename);
	SubLObject wide_mark = NIL;
	if (old_wide_mark.isString() && (NIL != Filesys.probe_file(old_wide_mark))) {
	    wide_mark = load_file_vector_wide_mark(old_wide_mark);
	} else {
	    wide_mark = add(ONE_INTEGER, entries);
	}
	final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
	final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
	try {
	    StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
	    StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
	    SubLObject stream = NIL;
	    try {
		final SubLObject _prev_bind_0_$16 = stream_macros.$stream_requires_locking$.currentBinding(thread);
		try {
		    stream_macros.$stream_requires_locking$.bind(NIL, thread);
		    stream = compatibility.open_binary(old_index_filename, $INPUT);
		} finally {
		    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$16, thread);
		}
		if (!stream.isStream()) {
		    Errors.error($str42$Unable_to_open__S, old_index_filename);
		}
		final SubLObject old = stream;
		SubLObject stream_$17 = NIL;
		try {
		    final SubLObject _prev_bind_0_$17 = stream_macros.$stream_requires_locking$.currentBinding(thread);
		    try {
			stream_macros.$stream_requires_locking$.bind(NIL, thread);
			stream_$17 = compatibility.open_binary(new_index_filename, $OUTPUT);
		    } finally {
			stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$17, thread);
		    }
		    if (!stream_$17.isStream()) {
			Errors.error($str42$Unable_to_open__S, new_index_filename);
		    }
		    final SubLObject v_new = stream_$17;
		    final SubLObject msg = cconcatenate($$$Widening_, new SubLObject[] { format_nil.format_nil_a_no_copy(entries), $$$_entries_absolutely_in_, format_nil.format_nil_a_no_copy(old_index_filename), $$$_to_, format_nil.format_nil_a_no_copy(new_index_filename), $str104$____ });
		    final SubLObject _prev_bind_0_$18 = $progress_note$.currentBinding(thread);
		    final SubLObject _prev_bind_1_$20 = $progress_start_time$.currentBinding(thread);
		    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
		    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
		    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
		    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
		    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
		    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
		    try {
			$progress_note$.bind(msg, thread);
			$progress_start_time$.bind(get_universal_time(), thread);
			$progress_total$.bind(entries, thread);
			$progress_sofar$.bind(ZERO_INTEGER, thread);
			$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
			$last_percent_progress_prediction$.bind(NIL, thread);
			$within_noting_percent_progress$.bind(T, thread);
			$percent_progress_start_time$.bind(get_universal_time(), thread);
			try {
			    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
			    SubLObject i;
			    SubLObject address;
			    for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
				address = (i.numL(wide_mark)) ? file_hash_table.read_fht_uint4(old) : file_hash_table.read_fht_uint8(old);
				file_hash_table.write_fht_uint8(v_new, address);
				$progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
				note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
			    }
			} finally {
			    final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
			    try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				noting_percent_progress_postamble();
				restoreValuesFromVector(_values);
			    } finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
			    }
			}
		    } finally {
			$percent_progress_start_time$.rebind(_prev_bind_8, thread);
			$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
			$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
			$last_percent_progress_index$.rebind(_prev_bind_5, thread);
			$progress_sofar$.rebind(_prev_bind_4, thread);
			$progress_total$.rebind(_prev_bind_3, thread);
			$progress_start_time$.rebind(_prev_bind_1_$20, thread);
			$progress_note$.rebind(_prev_bind_0_$18, thread);
		    }
		} finally {
		    final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
		    try {
			$is_thread_performing_cleanupP$.bind(T, thread);
			final SubLObject _values2 = getValuesAsVector();
			if (stream_$17.isStream()) {
			    close(stream_$17, UNPROVIDED);
			}
			restoreValuesFromVector(_values2);
		    } finally {
			$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
		    }
		}
	    } finally {
		final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values3 = getValuesAsVector();
		    if (stream.isStream()) {
			close(stream, UNPROVIDED);
		    }
		    restoreValuesFromVector(_values3);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
		}
	    }
	} finally {
	    StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
	    StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
	}
	save_file_vector_wide_mark(ZERO_INTEGER, new_wide_mark);
	return new_index_filename;
    }

    public static SubLObject recover_narrow_file_vector_index(final SubLObject old_index_filename, final SubLObject new_index_filename, final SubLObject wide_mark_filename) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
	final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
	try {
	    StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
	    StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
	    SubLObject stream = NIL;
	    try {
		final SubLObject _prev_bind_0_$24 = stream_macros.$stream_requires_locking$.currentBinding(thread);
		try {
		    stream_macros.$stream_requires_locking$.bind(NIL, thread);
		    stream = compatibility.open_binary(old_index_filename, $INPUT);
		} finally {
		    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$24, thread);
		}
		if (!stream.isStream()) {
		    Errors.error($str42$Unable_to_open__S, old_index_filename);
		}
		final SubLObject old = stream;
		SubLObject stream_$25 = NIL;
		try {
		    final SubLObject _prev_bind_0_$25 = stream_macros.$stream_requires_locking$.currentBinding(thread);
		    try {
			stream_macros.$stream_requires_locking$.bind(NIL, thread);
			stream_$25 = compatibility.open_binary(new_index_filename, $OUTPUT);
		    } finally {
			stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$25, thread);
		    }
		    if (!stream_$25.isStream()) {
			Errors.error($str42$Unable_to_open__S, new_index_filename);
		    }
		    final SubLObject v_new = stream_$25;
		    final SubLObject entries = fvector_raw_byte_size_to_length(file_length(old), UNPROVIDED);
		    SubLObject previous = MINUS_ONE_INTEGER;
		    SubLObject missing = ZERO_INTEGER;
		    final SubLObject message = cconcatenate($$$Widening_, new SubLObject[] { format_nil.format_nil_a_no_copy(entries), $$$_entries_from_, format_nil.format_nil_a_no_copy(old_index_filename), $$$_to_, format_nil.format_nil_a_no_copy(new_index_filename), $str108$_____ });
		    SubLObject wide_mark = NIL;
		    final SubLObject _prev_bind_0_$26 = $progress_note$.currentBinding(thread);
		    final SubLObject _prev_bind_1_$28 = $progress_start_time$.currentBinding(thread);
		    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
		    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
		    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
		    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
		    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
		    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
		    try {
			$progress_note$.bind(message, thread);
			$progress_start_time$.bind(get_universal_time(), thread);
			$progress_total$.bind(entries, thread);
			$progress_sofar$.bind(ZERO_INTEGER, thread);
			$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
			$last_percent_progress_prediction$.bind(NIL, thread);
			$within_noting_percent_progress$.bind(T, thread);
			$percent_progress_start_time$.bind(get_universal_time(), thread);
			try {
			    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
			    SubLObject i;
			    SubLObject current;
			    SubLObject address;
			    for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
				current = file_hash_table.read_fht_uint4(old);
				if (current.numL(previous)) {
				    if (NIL == list_utilities.sublisp_boolean(wide_mark)) {
					wide_mark = i;
				    }
				    missing = add(missing, expt(TWO_INTEGER, $int$32));
				}
				address = add(current, missing);
				if (NIL == wide_mark) {
				    file_hash_table.write_fht_uint4(v_new, address);
				} else {
				    file_hash_table.write_fht_uint8(v_new, address);
				}
				previous = current;
				$progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
				note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
			    }
			} finally {
			    final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
			    try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				noting_percent_progress_postamble();
				restoreValuesFromVector(_values);
			    } finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
			    }
			}
		    } finally {
			$percent_progress_start_time$.rebind(_prev_bind_8, thread);
			$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
			$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
			$last_percent_progress_index$.rebind(_prev_bind_5, thread);
			$progress_sofar$.rebind(_prev_bind_4, thread);
			$progress_total$.rebind(_prev_bind_3, thread);
			$progress_start_time$.rebind(_prev_bind_1_$28, thread);
			$progress_note$.rebind(_prev_bind_0_$26, thread);
		    }
		    final SubLObject str;
		    final SubLObject message_$30 = str = cconcatenate($str110$Writing_wide_mark_, new SubLObject[] { format_nil.format_nil_a_no_copy(wide_mark), $$$_to_, format_nil.format_nil_a_no_copy(wide_mark_filename), $str108$_____ });
		    final SubLObject _prev_bind_0_$28 = $progress_start_time$.currentBinding(thread);
		    final SubLObject _prev_bind_1_$29 = $progress_last_pacification_time$.currentBinding(thread);
		    final SubLObject _prev_bind_9 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
		    final SubLObject _prev_bind_10 = $progress_notification_count$.currentBinding(thread);
		    final SubLObject _prev_bind_11 = $progress_pacifications_since_last_nl$.currentBinding(thread);
		    final SubLObject _prev_bind_12 = $progress_count$.currentBinding(thread);
		    final SubLObject _prev_bind_13 = $is_noting_progressP$.currentBinding(thread);
		    final SubLObject _prev_bind_14 = $silent_progressP$.currentBinding(thread);
		    try {
			$progress_start_time$.bind(get_universal_time(), thread);
			$progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
			$progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
			$progress_notification_count$.bind(ZERO_INTEGER, thread);
			$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
			$progress_count$.bind(ZERO_INTEGER, thread);
			$is_noting_progressP$.bind(T, thread);
			$silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
			noting_progress_preamble(str);
			save_file_vector_wide_mark(wide_mark, wide_mark_filename);
			noting_progress_postamble();
		    } finally {
			$silent_progressP$.rebind(_prev_bind_14, thread);
			$is_noting_progressP$.rebind(_prev_bind_13, thread);
			$progress_count$.rebind(_prev_bind_12, thread);
			$progress_pacifications_since_last_nl$.rebind(_prev_bind_11, thread);
			$progress_notification_count$.rebind(_prev_bind_10, thread);
			$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_9, thread);
			$progress_last_pacification_time$.rebind(_prev_bind_1_$29, thread);
			$progress_start_time$.rebind(_prev_bind_0_$28, thread);
		    }
		} finally {
		    final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
		    try {
			$is_thread_performing_cleanupP$.bind(T, thread);
			final SubLObject _values2 = getValuesAsVector();
			if (stream_$25.isStream()) {
			    close(stream_$25, UNPROVIDED);
			}
			restoreValuesFromVector(_values2);
		    } finally {
			$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
		    }
		}
	    } finally {
		final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values3 = getValuesAsVector();
		    if (stream.isStream()) {
			close(stream, UNPROVIDED);
		    }
		    restoreValuesFromVector(_values3);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
		}
	    }
	} finally {
	    StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
	    StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
	}
	return wide_mark_filename;
    }

    public static SubLObject recover_wide_file_vector_mark(final SubLObject old_index_filename, final SubLObject wide_mark_filename) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject previous = MINUS_ONE_INTEGER;
	SubLObject index = ZERO_INTEGER;
	final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
	final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
	try {
	    StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
	    StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
	    SubLObject stream = NIL;
	    try {
		final SubLObject _prev_bind_0_$35 = stream_macros.$stream_requires_locking$.currentBinding(thread);
		try {
		    stream_macros.$stream_requires_locking$.bind(NIL, thread);
		    stream = compatibility.open_binary(old_index_filename, $INPUT);
		} finally {
		    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$35, thread);
		}
		if (!stream.isStream()) {
		    Errors.error($str42$Unable_to_open__S, old_index_filename);
		}
		for (SubLObject s = stream, curr = file_hash_table.read_fht_uint4(s); previous.numL(curr); previous = curr, curr = file_hash_table.read_fht_uint4(s), index = add(index, ONE_INTEGER)) {
		}
	    } finally {
		final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    if (stream.isStream()) {
			close(stream, UNPROVIDED);
		    }
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
		}
	    }
	} finally {
	    StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
	    StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
	}
	final SubLObject wide_mark = index;
	final SubLObject str;
	final SubLObject message = str = cconcatenate($str110$Writing_wide_mark_, new SubLObject[] { format_nil.format_nil_a_no_copy(wide_mark), $$$_to_, format_nil.format_nil_a_no_copy(wide_mark_filename), $str108$_____ });
	final SubLObject _prev_bind_3 = $progress_start_time$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $progress_last_pacification_time$.currentBinding(thread);
	final SubLObject _prev_bind_5 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
	final SubLObject _prev_bind_6 = $progress_notification_count$.currentBinding(thread);
	final SubLObject _prev_bind_7 = $progress_pacifications_since_last_nl$.currentBinding(thread);
	final SubLObject _prev_bind_8 = $progress_count$.currentBinding(thread);
	final SubLObject _prev_bind_9 = $is_noting_progressP$.currentBinding(thread);
	final SubLObject _prev_bind_10 = $silent_progressP$.currentBinding(thread);
	try {
	    $progress_start_time$.bind(get_universal_time(), thread);
	    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
	    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
	    $progress_notification_count$.bind(ZERO_INTEGER, thread);
	    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
	    $progress_count$.bind(ZERO_INTEGER, thread);
	    $is_noting_progressP$.bind(T, thread);
	    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
	    noting_progress_preamble(str);
	    save_file_vector_wide_mark(wide_mark, wide_mark_filename);
	    noting_progress_postamble();
	} finally {
	    $silent_progressP$.rebind(_prev_bind_10, thread);
	    $is_noting_progressP$.rebind(_prev_bind_9, thread);
	    $progress_count$.rebind(_prev_bind_8, thread);
	    $progress_pacifications_since_last_nl$.rebind(_prev_bind_7, thread);
	    $progress_notification_count$.rebind(_prev_bind_6, thread);
	    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_5, thread);
	    $progress_last_pacification_time$.rebind(_prev_bind_4, thread);
	    $progress_start_time$.rebind(_prev_bind_3, thread);
	}
	return wide_mark_filename;
    }

    public static SubLObject test_file_vector_writing_and_positioning(final SubLObject count) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject data_file = file_utilities.make_temp_filename($str114$_tmp_);
	try {
	    final SubLObject index_file = file_utilities.make_temp_filename($str114$_tmp_);
	    try {
		test_file_vector_writing_and_positioning_internal(data_file, index_file, count, NIL);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    SubLObject ignore_errors_tag = NIL;
		    try {
			thread.throwStack.push($IGNORE_ERRORS_TARGET);
			final SubLObject _prev_bind_0_$37 = Errors.$error_handler$.currentBinding(thread);
			try {
			    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
			    try {
				Filesys.delete_file(index_file);
			    } catch (final Throwable catch_var) {
				Errors.handleThrowable(catch_var, NIL);
			    }
			} finally {
			    Errors.$error_handler$.rebind(_prev_bind_0_$37, thread);
			}
		    } catch (final Throwable ccatch_env_var) {
			ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
			thread.throwStack.pop();
		    } finally {
			thread.throwStack.pop();
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
		SubLObject ignore_errors_tag2 = NIL;
		try {
		    thread.throwStack.push($IGNORE_ERRORS_TARGET);
		    final SubLObject _prev_bind_0_$38 = Errors.$error_handler$.currentBinding(thread);
		    try {
			Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
			try {
			    Filesys.delete_file(data_file);
			} catch (final Throwable catch_var2) {
			    Errors.handleThrowable(catch_var2, NIL);
			}
		    } finally {
			Errors.$error_handler$.rebind(_prev_bind_0_$38, thread);
		    }
		} catch (final Throwable ccatch_env_var2) {
		    ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
		    thread.throwStack.pop();
		} finally {
		    thread.throwStack.pop();
		}
		restoreValuesFromVector(_values2);
	    } finally {
		$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
	    }
	}
	return count;
    }

    public static SubLObject test_wide_file_vector_writing_and_positioning(final SubLObject count, final SubLObject wide_mark) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject wide_mark_file = file_utilities.make_temp_filename($str114$_tmp_);
	try {
	    save_file_vector_wide_mark(wide_mark, wide_mark_file);
	    final SubLObject index_file = file_utilities.make_temp_filename($str114$_tmp_);
	    try {
		final SubLObject data_file = file_utilities.make_temp_filename($str114$_tmp_);
		try {
		    test_file_vector_writing_and_positioning_internal(data_file, index_file, count, wide_mark);
		    final SubLObject estimate = add(multiply(FOUR_INTEGER, wide_mark), multiply(EIGHT_INTEGER, subtract(count, wide_mark)));
		    SubLObject actual = NIL;
		    SubLObject stream = NIL;
		    try {
			final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
			try {
			    stream_macros.$stream_requires_locking$.bind(NIL, thread);
			    stream = compatibility.open_binary(index_file, $INPUT);
			} finally {
			    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
			}
			if (!stream.isStream()) {
			    Errors.error($str42$Unable_to_open__S, index_file);
			}
			final SubLObject index_stream = stream;
			actual = file_length(index_stream);
		    } finally {
			final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
			    $is_thread_performing_cleanupP$.bind(T, thread);
			    final SubLObject _values = getValuesAsVector();
			    if (stream.isStream()) {
				close(stream, UNPROVIDED);
			    }
			    restoreValuesFromVector(_values);
			} finally {
			    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
			}
		    }
		    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!estimate.numE(actual))) {
			Errors.error($str119$A__A_entry_file_with_a_wide_mark_, new SubLObject[] { count, wide_mark, estimate, actual });
		    }
		    final SubLObject length = wide_file_vector_length_from_index(index_file, wide_mark_file);
		    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!count.numE(length))) {
			Errors.error($str120$The_index_file_should_be_have_a_l);
		    }
		    final SubLObject fvector = new_wide_input_file_vector(data_file, index_file, wide_mark_file, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == wide_file_vectorP(fvector))) {
			Errors.error($str121$We_are_loading_a_wide_file_vector);
		    }
		    if (NIL != narrow_file_vectorP(fvector)) {
			Errors.error($str121$We_are_loading_a_wide_file_vector);
		    }
		    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!wide_mark.numE(get_file_vector_wide_mark(fvector)))) {
			Errors.error($str122$We_expected_a_wide_mark_of__A_but, wide_mark, get_file_vector_wide_mark(fvector));
		    }
		} finally {
		    final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
		    try {
			$is_thread_performing_cleanupP$.bind(T, thread);
			final SubLObject _values2 = getValuesAsVector();
			SubLObject ignore_errors_tag = NIL;
			try {
			    thread.throwStack.push($IGNORE_ERRORS_TARGET);
			    final SubLObject _prev_bind_0_$39 = Errors.$error_handler$.currentBinding(thread);
			    try {
				Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
				try {
				    Filesys.delete_file(data_file);
				} catch (final Throwable catch_var) {
				    Errors.handleThrowable(catch_var, NIL);
				}
			    } finally {
				Errors.$error_handler$.rebind(_prev_bind_0_$39, thread);
			    }
			} catch (final Throwable ccatch_env_var) {
			    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
			    thread.throwStack.pop();
			} finally {
			    thread.throwStack.pop();
			}
			restoreValuesFromVector(_values2);
		    } finally {
			$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
		    }
		}
	    } finally {
		final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values3 = getValuesAsVector();
		    SubLObject ignore_errors_tag2 = NIL;
		    try {
			thread.throwStack.push($IGNORE_ERRORS_TARGET);
			final SubLObject _prev_bind_0_$40 = Errors.$error_handler$.currentBinding(thread);
			try {
			    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
			    try {
				Filesys.delete_file(index_file);
			    } catch (final Throwable catch_var2) {
				Errors.handleThrowable(catch_var2, NIL);
			    }
			} finally {
			    Errors.$error_handler$.rebind(_prev_bind_0_$40, thread);
			}
		    } catch (final Throwable ccatch_env_var2) {
			ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
			thread.throwStack.pop();
		    } finally {
			thread.throwStack.pop();
		    }
		    restoreValuesFromVector(_values3);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
		}
	    }
	} finally {
	    final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
	    try {
		$is_thread_performing_cleanupP$.bind(T, thread);
		final SubLObject _values4 = getValuesAsVector();
		SubLObject ignore_errors_tag3 = NIL;
		try {
		    thread.throwStack.push($IGNORE_ERRORS_TARGET);
		    final SubLObject _prev_bind_0_$41 = Errors.$error_handler$.currentBinding(thread);
		    try {
			Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
			try {
			    Filesys.delete_file(wide_mark_file);
			} catch (final Throwable catch_var3) {
			    Errors.handleThrowable(catch_var3, NIL);
			}
		    } finally {
			Errors.$error_handler$.rebind(_prev_bind_0_$41, thread);
		    }
		} catch (final Throwable ccatch_env_var3) {
		    ignore_errors_tag3 = Errors.handleThrowable(ccatch_env_var3, $IGNORE_ERRORS_TARGET);
		    thread.throwStack.pop();
		} finally {
		    thread.throwStack.pop();
		}
		restoreValuesFromVector(_values4);
	    } finally {
		$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
	    }
	}
	return count;
    }

    public static SubLObject test_file_vector_writing_and_positioning_internal(final SubLObject data_file, final SubLObject index_file, final SubLObject count, final SubLObject wide_mark) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject addresses = NIL;
	SubLObject fvector = NIL;
	try {
	    fvector = new_file_vector(data_file, index_file, $OUTPUT, file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), UNPROVIDED);
	    if (NIL != list_utilities.sublisp_boolean(wide_mark)) {
		specify_file_vector_wide_mark(fvector, wide_mark);
	    }
	    final SubLObject data_stream = get_file_vector_data_stream(fvector);
	    SubLObject i;
	    SubLObject next_index;
	    for (i = NIL, i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
		next_index = file_vector_next_index(fvector);
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!i.numE(next_index))) {
		    Errors.error(Errors.error($str123$The_next_index_is_supposed_to_be_, i, next_index));
		}
		update_file_vector_index_linear(fvector);
		cfasl_output(cconcatenate($$$Position_, format_nil.format_nil_a_no_copy(i)), data_stream);
	    }
	} finally {
	    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
	    try {
		$is_thread_performing_cleanupP$.bind(T, thread);
		final SubLObject _values = getValuesAsVector();
		if (NIL != file_vector_p(fvector)) {
		    close_file_vector(fvector);
		}
		restoreValuesFromVector(_values);
	    } finally {
		$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
	    }
	}
	addresses = nreverse(addresses);
	fvector = NIL;
	try {
	    fvector = new_file_vector(data_file, index_file, $INPUT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    if (NIL != list_utilities.sublisp_boolean(wide_mark)) {
		specify_file_vector_wide_mark(fvector, wide_mark);
	    }
	    final SubLObject iterator = new_file_vector_index_iterator(fvector);
	    SubLObject list_var = NIL;
	    SubLObject expected_address = NIL;
	    SubLObject expected_index = NIL;
	    list_var = addresses;
	    expected_address = list_var.first();
	    for (expected_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), expected_address = list_var.first(), expected_index = add(ONE_INTEGER, expected_index)) {
		thread.resetMultipleValues();
		final SubLObject tuple = iteration.iteration_next(iterator);
		final SubLObject validP = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL == validP) {
		    Errors.error($str125$On_step___A__the_iteration_result, expected_index);
		}
		SubLObject current;
		final SubLObject datum = current = tuple;
		SubLObject actual_index = NIL;
		SubLObject actual_address = NIL;
		destructuring_bind_must_consp(current, datum, $list126);
		actual_index = current.first();
		current = actual_address = current.rest();
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!actual_index.numE(expected_index))) {
		    Errors.error($str127$The_expected_index__A_was_____act, expected_index, actual_index);
		}
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!expected_address.numE(actual_address))) {
		    Errors.error($str128$The_expected_address__A_was_____a, expected_address, actual_address);
		}
	    }
	} finally {
	    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
	    try {
		$is_thread_performing_cleanupP$.bind(T, thread);
		final SubLObject _values2 = getValuesAsVector();
		if (NIL != file_vector_p(fvector)) {
		    close_file_vector(fvector);
		}
		restoreValuesFromVector(_values2);
	    } finally {
		$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
	    }
	}
	return count;
    }

    public static SubLObject declare_file_vector_file() {
	declareFunction(me, "fvector_print_function_trampoline", "FVECTOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction(me, "fvector_p", "FVECTOR-P", 1, 0, false);
	new file_vector.$fvector_p$UnaryFunction();
	declareFunction(me, "fvector_data_stream", "FVECTOR-DATA-STREAM", 1, 0, false);
	declareFunction(me, "fvector_index_stream", "FVECTOR-INDEX-STREAM", 1, 0, false);
	declareFunction(me, "fvector_wide_mark", "FVECTOR-WIDE-MARK", 1, 0, false);
	declareFunction(me, "_csetf_fvector_data_stream", "_CSETF-FVECTOR-DATA-STREAM", 2, 0, false);
	declareFunction(me, "_csetf_fvector_index_stream", "_CSETF-FVECTOR-INDEX-STREAM", 2, 0, false);
	declareFunction(me, "_csetf_fvector_wide_mark", "_CSETF-FVECTOR-WIDE-MARK", 2, 0, false);
	declareFunction(me, "make_fvector", "MAKE-FVECTOR", 0, 1, false);
	declareFunction(me, "visit_defstruct_fvector", "VISIT-DEFSTRUCT-FVECTOR", 2, 0, false);
	declareFunction(me, "visit_defstruct_object_fvector_method", "VISIT-DEFSTRUCT-OBJECT-FVECTOR-METHOD", 2, 0, false);
	declareFunction(me, "print_fvector", "PRINT-FVECTOR", 3, 0, false);
	declareFunction(me, "new_fvector", "NEW-FVECTOR", 2, 1, false);
	declareFunction(me, "get_file_vector_wide_mark", "GET-FILE-VECTOR-WIDE-MARK", 1, 0, false);
	declareFunction(me, "specify_file_vector_wide_mark", "SPECIFY-FILE-VECTOR-WIDE-MARK", 2, 0, false);
	declareFunction(me, "file_vector_p", "FILE-VECTOR-P", 1, 0, false);
	declareFunction(me, "new_file_vector", "NEW-FILE-VECTOR", 2, 4, false);
	declareFunction(me, "open_file_vector_for_rewrite", "OPEN-FILE-VECTOR-FOR-REWRITE", 3, 3, false);
	declareFunction(me, "open_file_vector_for_append", "OPEN-FILE-VECTOR-FOR-APPEND", 3, 3, false);
	declareFunction(me, "new_wide_input_file_vector", "NEW-WIDE-INPUT-FILE-VECTOR", 3, 3, false);
	declareFunction(me, "create_file_vector", "CREATE-FILE-VECTOR", 2, 0, false);
	declareFunction(me, "create_wide_file_vector", "CREATE-WIDE-FILE-VECTOR", 3, 0, false);
	declareFunction(me, "load_file_vector_wide_mark", "LOAD-FILE-VECTOR-WIDE-MARK", 1, 0, false);
	declareFunction(me, "possibly_load_file_vector_wide_mark", "POSSIBLY-LOAD-FILE-VECTOR-WIDE-MARK", 1, 0, false);
	declareFunction(me, "save_file_vector_wide_mark", "SAVE-FILE-VECTOR-WIDE-MARK", 2, 0, false);
	declareFunction(me, "persist_file_vector_wide_mark", "PERSIST-FILE-VECTOR-WIDE-MARK", 2, 0, false);
	declareFunction(me, "clone_file_vector", "CLONE-FILE-VECTOR", 1, 0, false);
	declareFunction(me, "close_file_vector", "CLOSE-FILE-VECTOR", 1, 0, false);
	declareFunction(me, "file_vector_change_stream_buffer_sizes", "FILE-VECTOR-CHANGE-STREAM-BUFFER-SIZES", 3, 0, false);
	declareFunction(me, "file_vector_enable_memory_mapping", "FILE-VECTOR-ENABLE-MEMORY-MAPPING", 1, 0, false);
	declareFunction(me, "file_vector_memory_mappedP", "FILE-VECTOR-MEMORY-MAPPED?", 1, 0, false);
	declareFunction(me, "get_file_vector_data_stream", "GET-FILE-VECTOR-DATA-STREAM", 1, 0, false);
	declareFunction(me, "get_file_vector_index_stream", "GET-FILE-VECTOR-INDEX-STREAM", 1, 0, false);
	declareFunction(me, "wide_file_vectorP", "WIDE-FILE-VECTOR?", 1, 0, false);
	declareFunction(me, "narrow_file_vectorP", "NARROW-FILE-VECTOR?", 1, 0, false);
	declareFunction(me, "file_vector_length", "FILE-VECTOR-LENGTH", 1, 0, false);
	declareFunction(me, "file_vector_length_from_index", "FILE-VECTOR-LENGTH-FROM-INDEX", 1, 0, false);
	declareFunction(me, "wide_file_vector_length_from_index", "WIDE-FILE-VECTOR-LENGTH-FROM-INDEX", 2, 0, false);
	declareFunction(me, "file_vector_length_from_index_int", "FILE-VECTOR-LENGTH-FROM-INDEX-INT", 2, 0, false);
	declareFunction(me, "file_vector_length_from_index_stream", "FILE-VECTOR-LENGTH-FROM-INDEX-STREAM", 2, 0, false);
	declareFunction(me, "file_vector_data_size", "FILE-VECTOR-DATA-SIZE", 1, 0, false);
	declareFunction(me, "file_vector_data_size_from_filename", "FILE-VECTOR-DATA-SIZE-FROM-FILENAME", 1, 0, false);
	declareFunction(me, "file_vector_data_size_from_data_stream", "FILE-VECTOR-DATA-SIZE-FROM-DATA-STREAM", 1, 0, false);
	declareFunction(me, "file_vector_next_index", "FILE-VECTOR-NEXT-INDEX", 1, 0, false);
	declareFunction(me, "fvector_raw_byte_size_to_length", "FVECTOR-RAW-BYTE-SIZE-TO-LENGTH", 1, 1, false);
	declareFunction(me, "position_file_vector", "POSITION-FILE-VECTOR", 1, 1, false);
	declareFunction(me, "position_file_vector_index_for_update", "POSITION-FILE-VECTOR-INDEX-FOR-UPDATE", 2, 0, false);
	declareFunction(me, "position_file_vector_index", "POSITION-FILE-VECTOR-INDEX", 2, 0, false);
	declareFunction(me, "read_file_vector_index_entry", "READ-FILE-VECTOR-INDEX-ENTRY", 1, 1, false);
	declareFunction(me, "wide_fvector_index_to_file_position", "WIDE-FVECTOR-INDEX-TO-FILE-POSITION", 2, 0, false);
	declareFunction(me, "fvector_file_position_to_index", "FVECTOR-FILE-POSITION-TO-INDEX", 1, 1, false);
	declareFunction(me, "begin_file_vector_excursion", "BEGIN-FILE-VECTOR-EXCURSION", 1, 1, false);
	declareFunction(me, "end_file_vector_excursion", "END-FILE-VECTOR-EXCURSION", 2, 0, false);
	declareFunction(me, "fvector_make_memento", "FVECTOR-MAKE-MEMENTO", 2, 0, false);
	declareMacro(me, "with_file_vector_excursion", "WITH-FILE-VECTOR-EXCURSION");
	declareMacro(me, "with_output_to_file_vector", "WITH-OUTPUT-TO-FILE-VECTOR");
	declareFunction(me, "update_file_vector_index", "UPDATE-FILE-VECTOR-INDEX", 1, 0, false);
	declareFunction(me, "update_file_vector_index_linear", "UPDATE-FILE-VECTOR-INDEX-LINEAR", 1, 0, false);
	declareFunction(me, "overwrite_file_vector_index", "OVERWRITE-FILE-VECTOR-INDEX", 1, 0, false);
	declareFunction(me, "write_file_vector_index_entry", "WRITE-FILE-VECTOR-INDEX-ENTRY", 2, 0, false);
	declareFunction(me, "place_file_vector_index_tombstone", "PLACE-FILE-VECTOR-INDEX-TOMBSTONE", 1, 0, false);
	declareFunction(me, "place_file_vector_index_tombstone_linear", "PLACE-FILE-VECTOR-INDEX-TOMBSTONE-LINEAR", 1, 0, false);
	declareMacro(me, "with_input_from_file_vector", "WITH-INPUT-FROM-FILE-VECTOR");
	declareFunction(me, "new_file_vector_index_iterator", "NEW-FILE-VECTOR-INDEX-ITERATOR", 1, 0, false);
	declareFunction(me, "make_file_vector_index_iterator_state", "MAKE-FILE-VECTOR-INDEX-ITERATOR-STATE", 1, 0, false);
	declareFunction(me, "fvector_index_iterator_done", "FVECTOR-INDEX-ITERATOR-DONE", 1, 0, false);
	declareFunction(me, "fvector_index_iterator_next", "FVECTOR-INDEX-ITERATOR-NEXT", 1, 0, false);
	declareFunction(me, "gather_file_vector_statistics_for_filenames", "GATHER-FILE-VECTOR-STATISTICS-FOR-FILENAMES", 2, 0, false);
	declareFunction(me, "gather_file_vector_statistics", "GATHER-FILE-VECTOR-STATISTICS", 1, 0, false);
	declareFunction(me, "file_vector_stats_indicate_dense_index_spaceP", "FILE-VECTOR-STATS-INDICATE-DENSE-INDEX-SPACE?", 1, 0, false);
	declareFunction(me, "file_vector_memory_map_for_files", "FILE-VECTOR-MEMORY-MAP-FOR-FILES", 3, 0, false);
	declareFunction(me, "file_vector_memory_map", "FILE-VECTOR-MEMORY-MAP", 2, 0, false);
	declareFunction(me, "fvectmemmap_flush_buffer", "FVECTMEMMAP-FLUSH-BUFFER", 3, 0, false);
	declareFunction(me, "fvect_mem_mapL", "FVECT-MEM-MAP<", 2, 0, false);
	declareFunction(me, "find_file_vector_data_address_in_index", "FIND-FILE-VECTOR-DATA-ADDRESS-IN-INDEX", 2, 0, false);
	declareFunction(me, "widen_file_vector_index_at_mark", "WIDEN-FILE-VECTOR-INDEX-AT-MARK", 3, 0, false);
	declareFunction(me, "widen_file_vector_index", "WIDEN-FILE-VECTOR-INDEX", 3, 1, false);
	declareFunction(me, "recover_narrow_file_vector_index", "RECOVER-NARROW-FILE-VECTOR-INDEX", 3, 0, false);
	declareFunction(me, "recover_wide_file_vector_mark", "RECOVER-WIDE-FILE-VECTOR-MARK", 2, 0, false);
	declareFunction(me, "test_file_vector_writing_and_positioning", "TEST-FILE-VECTOR-WRITING-AND-POSITIONING", 1, 0, false);
	declareFunction(me, "test_wide_file_vector_writing_and_positioning", "TEST-WIDE-FILE-VECTOR-WRITING-AND-POSITIONING", 2, 0, false);
	declareFunction(me, "test_file_vector_writing_and_positioning_internal", "TEST-FILE-VECTOR-WRITING-AND-POSITIONING-INTERNAL", 4, 0, false);
	return NIL;
    }

    public static SubLObject init_file_vector_file() {
	defconstant("*DTP-FVECTOR*", FVECTOR);
	defconstant("*DEFAULT-FILE-VECTOR-DATA-STREAM-BUFFER-SIZE*", $int$1024);
	defconstant("*DEFAULT-FILE-VECTOR-INDEX-STREAM-BUFFER-SIZE*", $int$256);
	defconstant("*MAX-4BYTE-INTEGER*", $int$4294967295);
	defconstant("*MAX-8BYTE-INTEGER*", $int$18446744073709551615);
	deflexical("*MEMORY-MAP-CHUNK-SIZE*", $int$1000000);
	return NIL;
    }

    public static SubLObject setup_file_vector_file() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_fvector$.getGlobalValue(), symbol_function(FVECTOR_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list8);
	def_csetf(FVECTOR_DATA_STREAM, _CSETF_FVECTOR_DATA_STREAM);
	def_csetf(FVECTOR_INDEX_STREAM, _CSETF_FVECTOR_INDEX_STREAM);
	def_csetf(FVECTOR_WIDE_MARK, _CSETF_FVECTOR_WIDE_MARK);
	identity(FVECTOR);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_fvector$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FVECTOR_METHOD));
	define_test_case_table_int(FVECTOR_RAW_BYTE_SIZE_TO_LENGTH, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list50);
	define_test_case_table_int(WIDE_FVECTOR_INDEX_TO_FILE_POSITION, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list55);
	register_external_symbol(GATHER_FILE_VECTOR_STATISTICS_FOR_FILENAMES);
	register_external_symbol(GATHER_FILE_VECTOR_STATISTICS);
	register_external_symbol($sym86$FILE_VECTOR_STATS_INDICATE_DENSE_INDEX_SPACE_);
	register_external_symbol(FILE_VECTOR_MEMORY_MAP_FOR_FILES);
	register_external_symbol(FILE_VECTOR_MEMORY_MAP);
	note_funcall_helper_function($sym92$FVECT_MEM_MAP_);
	define_test_case_table_int($sym92$FVECT_MEM_MAP_, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list96);
	register_external_symbol(RECOVER_NARROW_FILE_VECTOR_INDEX);
	register_external_symbol(RECOVER_WIDE_FILE_VECTOR_MARK);
	define_test_case_table_int(TEST_FILE_VECTOR_WRITING_AND_POSITIONING, list(new SubLObject[] { $TEST, EQL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list113);
	define_test_case_table_int(TEST_WIDE_FILE_VECTOR_WRITING_AND_POSITIONING, list(new SubLObject[] { $TEST, EQL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list118);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_file_vector_file();
    }

    @Override
    public void initializeVariables() {
	init_file_vector_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_file_vector_file();
    }

    public static final class $fvector_native extends SubLStructNative {
	public SubLObject $data_stream;

	public SubLObject $index_stream;

	public SubLObject $wide_mark;

	private static final SubLStructDeclNative structDecl;

	public $fvector_native() {
	    this.$data_stream = Lisp.NIL;
	    this.$index_stream = Lisp.NIL;
	    this.$wide_mark = Lisp.NIL;
	}

	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return this.$data_stream;
	}

	@Override
	public SubLObject getField3() {
	    return this.$index_stream;
	}

	@Override
	public SubLObject getField4() {
	    return this.$wide_mark;
	}

	@Override
	public SubLObject setField2(final SubLObject value) {
	    return this.$data_stream = value;
	}

	@Override
	public SubLObject setField3(final SubLObject value) {
	    return this.$index_stream = value;
	}

	@Override
	public SubLObject setField4(final SubLObject value) {
	    return this.$wide_mark = value;
	}

	static {
	    structDecl = makeStructDeclNative($fvector_native.class, FVECTOR, FVECTOR_P, $list2, $list3, new String[] { "$data_stream", "$index_stream", "$wide_mark" }, $list4, $list5, PRINT_FVECTOR);
	}
    }

    public static final class $fvector_p$UnaryFunction extends UnaryFunction {
	public $fvector_p$UnaryFunction() {
	    super(extractFunctionNamed("FVECTOR-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return fvector_p(arg1);
	}
    }
}

/**
 * Total time: 1065 ms
 */
