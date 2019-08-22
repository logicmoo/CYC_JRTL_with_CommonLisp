package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.constant_handles.constant_count;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.constant_suid;
import static com.cyc.cycjava.cycl.constant_handles.do_constants_table;
import static com.cyc.cycjava.cycl.constant_handles.new_constant_suid_threshold;
import static com.cyc.cycjava.cycl.constant_handles.new_constants_iterator;
import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_lookup;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.fresh_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class el_partitions extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new el_partitions();

    public static final String myName = "com.cyc.cycjava_2.cycl.el_partitions";


    // deflexical
    public static final SubLSymbol $default_pickling_stream_buffer_size$ = makeSymbol("*DEFAULT-PICKLING-STREAM-BUFFER-SIZE*");

    // defparameter
    public static final SubLSymbol $pickling_stream_buffer_size$ = makeSymbol("*PICKLING-STREAM-BUFFER-SIZE*");

    // deflexical
    public static final SubLSymbol $pickled_kb_comparison_strategy$ = makeSymbol("*PICKLED-KB-COMPARISON-STRATEGY*");

    // defconstant
    public static final SubLSymbol $dtp_elpart_as_desc$ = makeSymbol("*DTP-ELPART-AS-DESC*");

    // deflexical
    private static final SubLSymbol $debug_scan_enumerateP$ = makeSymbol("*DEBUG-SCAN-ENUMERATE?*");

    // defconstant
    public static final SubLSymbol $dtp_el_partition_data_sink$ = makeSymbol("*DTP-EL-PARTITION-DATA-SINK*");









    // deflexical
    private static final SubLSymbol $transcript_marker_guest_cyclist$ = makeSymbol("*TRANSCRIPT-MARKER-GUEST-CYCLIST*");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLSymbol WITH_STREAM_BUFFER_SIZE = makeSymbol("WITH-STREAM-BUFFER-SIZE");

    private static final SubLList $list2 = list(makeSymbol("*PICKLING-STREAM-BUFFER-SIZE*"));

    private static final SubLList $list3 = list(list(makeSymbol("TOTAL"), makeSymbol("MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym4$CURR = makeUninternedSymbol("CURR");



    private static final SubLList $list6 = list(ZERO_INTEGER);









    private static final SubLSymbol $sym11$HL_PROTOTYPICAL_INSTANCE_ = makeSymbol("HL-PROTOTYPICAL-INSTANCE?");

    private static final SubLSymbol PICKLE_CONSTANTS = makeSymbol("PICKLE-CONSTANTS");

    private static final SubLString $$$Pickling_constants_to_ = makeString("Pickling constants to ");

    private static final SubLString $str14$_____ = makeString(" ....");



    private static final SubLString $str16$Unable_to_open__S = makeString("Unable to open ~S");





    private static final SubLSymbol DO_PICKLED_CONSTANTS = makeSymbol("DO-PICKLED-CONSTANTS");

    private static final SubLList $list20 = list(list(makeSymbol("SUID"), makeSymbol("NAME"), makeSymbol("GUID"), makeSymbol("FILENAME"), makeSymbol("&KEY"), makeSymbol("MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list21 = list(makeKeyword("MESSAGE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $sym24$STREAM = makeUninternedSymbol("STREAM");

    private static final SubLSymbol $sym25$COUNT = makeUninternedSymbol("COUNT");

    private static final SubLSymbol $sym26$MSG = makeUninternedSymbol("MSG");

    private static final SubLSymbol WITH_PICKLING_STREAM_BUFFER_SIZE = makeSymbol("WITH-PICKLING-STREAM-BUFFER-SIZE");



    private static final SubLList $list29 = list(makeKeyword("INPUT"));









    private static final SubLString $str34$Reading_pickled_constants_from__A = makeString("Reading pickled constants from ~A ....");

    private static final SubLSymbol WITH_PICKLING_PACFICIATION = makeSymbol("WITH-PICKLING-PACFICIATION");







    private static final SubLString $str39$Read_invalid_SUID__A_from__A_ = makeString("Read invalid SUID ~A from ~A.");

    private static final SubLString $str40$Read_invalid_NAME__A_from__A_ = makeString("Read invalid NAME ~A from ~A.");



    private static final SubLString $str42$Read_invalid_GUID__A_from__A_ = makeString("Read invalid GUID ~A from ~A.");

    private static final SubLSymbol PICKLE_ASSERTIONS = makeSymbol("PICKLE-ASSERTIONS");

    private static final SubLString $str44$Pickling_assertions_to_file_vecto = makeString("Pickling assertions to file-vector with prefix ");

    private static final SubLString $str45$_index_cfasl = makeString("-index.cfasl");

    private static final SubLString $str46$_cfasl = makeString(".cfasl");

    private static final SubLSymbol ASSERTION_TO_PICKLING_FORMAT = makeSymbol("ASSERTION-TO-PICKLING-FORMAT");

    private static final SubLSymbol CONVERT_GUID_TO_PICKLING_FORMAT = makeSymbol("CONVERT-GUID-TO-PICKLING-FORMAT");

    private static final SubLSymbol UNPICKLE_ASSERTION_PICKLING_FORMAT = makeSymbol("UNPICKLE-ASSERTION-PICKLING-FORMAT");

    private static final SubLSymbol PICKLED_GUID_FORMAT_P = makeSymbol("PICKLED-GUID-FORMAT-P");

    private static final SubLSymbol RESTORE_GUID_FROM_PICKLING_FORMAT = makeSymbol("RESTORE-GUID-FROM-PICKLING-FORMAT");



    private static final SubLList $list53 = list(makeSymbol("GUID-MARKER"), makeSymbol("GUID-STRING"));

    private static final SubLString $str54$Cannot_restore__A_____not_a_pickl = makeString("Cannot restore ~A ... not a pickled GUID.");

    private static final SubLSymbol NEW_RELEVANT_ASSERTIONS_ID_SPACE = makeSymbol("NEW-RELEVANT-ASSERTIONS-ID-SPACE");

    private static final SubLString $str56$Computing_EL_Partition_relevant_a = makeString("Computing EL Partition relevant assertion ID space ....");

    private static final SubLString $str57$Whoa__we_underflowed_the_ID_space = makeString("Whoa, we underflowed the ID space counter.");

    private static final SubLSymbol COMPARE_PICKLED_KB_TO_CURRENT_KB = makeSymbol("COMPARE-PICKLED-KB-TO-CURRENT-KB");

    private static final SubLSymbol ENUMERATE_ADDITIONS_TO_CURRENT_KB = makeSymbol("ENUMERATE-ADDITIONS-TO-CURRENT-KB");

    private static final SubLString $str60$Enumerating_new_constants_____ = makeString("Enumerating new constants ....");

    private static final SubLString $str61$Enumerating_new_assertions_____ = makeString("Enumerating new assertions ....");

    private static final SubLSymbol EL_PARTITION_DATA_SINK_P = makeSymbol("EL-PARTITION-DATA-SINK-P");

    private static final SubLSymbol $sym63$EL_PARTITION_RELEVANT_CONSTANT_ = makeSymbol("EL-PARTITION-RELEVANT-CONSTANT?");





    private static final SubLString $$$Reading_pickled_constants_from_ = makeString("Reading pickled constants from ");

    private static final SubLList $list67 = list(makeSymbol("IT"), makeSymbol("AS"), makeSymbol("TL-IST-FORMULA"));



    private static final SubLSymbol ITERATION_NEXT_WITHOUT_VALUES = makeSymbol("ITERATION-NEXT-WITHOUT-VALUES");

    private static final SubLList $list70 = list($DONE);





    private static final SubLSymbol TL_ENCAPSULATE = makeSymbol("TL-ENCAPSULATE");

    private static final SubLSymbol ASSERTION_TL_IST_FORMULA = makeSymbol("ASSERTION-TL-IST-FORMULA");

    private static final SubLList $list75 = list(makeSymbol("TIP-INDEX"));





    private static final SubLSymbol $sym78$EL_PARTITION_RELEVANT_ASSERTION_ = makeSymbol("EL-PARTITION-RELEVANT-ASSERTION?");



    private static final SubLString $str80$Implementation_error__Tip_index__ = makeString("Implementation error: Tip index ~A underflowed.");

    private static final SubLString $str81$Implementation_error__branch_inde = makeString("Implementation error: branch index underflowed.");

    private static final SubLString $str82$Implementation_error__tip_index_u = makeString("Implementation error: tip index underflowed.");



    private static final SubLSymbol $SHARED_ASSERTION = makeKeyword("SHARED-ASSERTION");

    private static final SubLSymbol $BRANCH_AS_ID = makeKeyword("BRANCH-AS-ID");

    private static final SubLSymbol $BRANCH_INDEX = makeKeyword("BRANCH-INDEX");

    private static final SubLSymbol $BRANCH_COUNT = makeKeyword("BRANCH-COUNT");

    private static final SubLSymbol $JUST_ASSERTED_P = makeKeyword("JUST-ASSERTED-P");

    private static final SubLSymbol $SCAN_FORWARD_STEADY = makeKeyword("SCAN-FORWARD-STEADY");

    private static final SubLSymbol $CLASSIC_BACKWARD = makeKeyword("CLASSIC-BACKWARD");

    private static final SubLSymbol $NOVEL_FORWARD = makeKeyword("NOVEL-FORWARD");

    private static final SubLSymbol $SCAN_FORWARD_FAST = makeKeyword("SCAN-FORWARD-FAST");

    private static final SubLString $str93$Pickled_KB_Comparison_Strategy__S = makeString("Pickled KB Comparison Strategy ~S not yet implemented.");

    private static final SubLString $$$Analyzing_ = makeString("Analyzing ");

    private static final SubLString $str95$_new_assertions_____ = makeString(" new assertions ....");

    private static final SubLString $str96$This_algorithm_is_not_designed_to = makeString("This algorithm is not designed to deal with gaps in assertion ID space. Dump KB first.");

    private static final SubLSymbol ELPART_AS_DESC = makeSymbol("ELPART-AS-DESC");

    private static final SubLSymbol ELPART_AS_DESC_P = makeSymbol("ELPART-AS-DESC-P");

    private static final SubLList $list99 = list(makeSymbol("ID"), makeSymbol("TL-IST-FORMULA"), makeSymbol("HASH"), makeSymbol("EXTRA"), makeSymbol("WEAK-IST-FORMULA"));

    private static final SubLList $list100 = list(makeKeyword("ID"), makeKeyword("TL-IST-FORMULA"), $HASH, makeKeyword("EXTRA"), makeKeyword("WEAK-IST-FORMULA"));

    private static final SubLList $list101 = list(makeSymbol("ELPART-AS-DESC-ID"), makeSymbol("ELPART-AS-DESC-TL-IST-FORMULA"), makeSymbol("ELPART-AS-DESC-HASH"), makeSymbol("ELPART-AS-DESC-EXTRA"), makeSymbol("ELPART-AS-DESC-WEAK-IST-FORMULA"));

    private static final SubLList $list102 = list(makeSymbol("_CSETF-ELPART-AS-DESC-ID"), makeSymbol("_CSETF-ELPART-AS-DESC-TL-IST-FORMULA"), makeSymbol("_CSETF-ELPART-AS-DESC-HASH"), makeSymbol("_CSETF-ELPART-AS-DESC-EXTRA"), makeSymbol("_CSETF-ELPART-AS-DESC-WEAK-IST-FORMULA"));

    private static final SubLSymbol PRINT_ELPART_AS_DESC = makeSymbol("PRINT-ELPART-AS-DESC");

    private static final SubLSymbol ELPART_AS_DESC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ELPART-AS-DESC-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list105 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ELPART-AS-DESC-P"));

    private static final SubLSymbol ELPART_AS_DESC_ID = makeSymbol("ELPART-AS-DESC-ID");

    private static final SubLSymbol _CSETF_ELPART_AS_DESC_ID = makeSymbol("_CSETF-ELPART-AS-DESC-ID");

    private static final SubLSymbol ELPART_AS_DESC_TL_IST_FORMULA = makeSymbol("ELPART-AS-DESC-TL-IST-FORMULA");

    private static final SubLSymbol _CSETF_ELPART_AS_DESC_TL_IST_FORMULA = makeSymbol("_CSETF-ELPART-AS-DESC-TL-IST-FORMULA");

    private static final SubLSymbol ELPART_AS_DESC_HASH = makeSymbol("ELPART-AS-DESC-HASH");

    private static final SubLSymbol _CSETF_ELPART_AS_DESC_HASH = makeSymbol("_CSETF-ELPART-AS-DESC-HASH");

    private static final SubLSymbol ELPART_AS_DESC_EXTRA = makeSymbol("ELPART-AS-DESC-EXTRA");

    private static final SubLSymbol _CSETF_ELPART_AS_DESC_EXTRA = makeSymbol("_CSETF-ELPART-AS-DESC-EXTRA");

    private static final SubLSymbol ELPART_AS_DESC_WEAK_IST_FORMULA = makeSymbol("ELPART-AS-DESC-WEAK-IST-FORMULA");

    private static final SubLSymbol _CSETF_ELPART_AS_DESC_WEAK_IST_FORMULA = makeSymbol("_CSETF-ELPART-AS-DESC-WEAK-IST-FORMULA");



    private static final SubLSymbol $TL_IST_FORMULA = makeKeyword("TL-IST-FORMULA");




    private static final SubLSymbol $WEAK_IST_FORMULA = makeKeyword("WEAK-IST-FORMULA");

    private static final SubLString $str121$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_ELPART_AS_DESC = makeSymbol("MAKE-ELPART-AS-DESC");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ELPART_AS_DESC_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ELPART-AS-DESC-METHOD");

    private static final SubLString $str127$_id__ = makeString(" id# ");

    private static final SubLString $str128$_hc__ = makeString(" hc: ");

    private static final SubLString $str129$_AS_ID__ = makeString(" AS-ID: ");

    private static final SubLString $str130$_FVecInx__ = makeString(" FVecInx: ");

    private static final SubLString $str131$_xtr__ = makeString(" xtr: ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str133$_assertions_____ = makeString(" assertions ....");

    private static final SubLString $str134$Not_yet_implemented_ = makeString("Not yet implemented.");

    private static final SubLString $str135$Mhm__only__A_gaps_across_all_asse = makeString("Mhm, only ~A gaps across all assertion types, but ~A deletions???");

    private static final SubLString $str136$Finding_start_of_relevant_asserti = makeString("Finding start of relevant assertions in TIP KB ....");

    private static final SubLString $str137$_assertion_gaps_____ = makeString(" assertion gaps ....");

    private static final SubLString $str138$Error_realigning_BRANCH___A__now_ = makeString("Error realigning BRANCH (~A, now at ~A) and TIP (~A)");

    private static final SubLList $list139 = list(makeSymbol("HP-MARKER"), makeSymbol("CONSTANT-NAME"), makeSymbol("GUID"));

    private static final SubLSymbol ENUMMISS_TL_HP_NOTATION = makeSymbol("ENUMMISS-TL-HP-NOTATION");



    private static final SubLString $str142$Sorry__FAST_is_currently_not_impl = makeString("Sorry, FAST is currently not implemented.");

    private static final SubLString $str143$_branch_assertions_____ = makeString(" branch assertions ....");

    private static final SubLSymbol $BOTH_INVALID = makeKeyword("BOTH-INVALID");

    private static final SubLSymbol $INVALID_BRANCH = makeKeyword("INVALID-BRANCH");

    private static final SubLSymbol $INVALID_TIP = makeKeyword("INVALID-TIP");





    private static final SubLString $str149$Unknown_state__A____do_not_know_w = makeString("Unknown state ~A -- do not know what to do.~%");

    private static final SubLSymbol TEST_EL_PARTITION_SIMPLE_SCAN_ALGORITHM = makeSymbol("TEST-EL-PARTITION-SIMPLE-SCAN-ALGORITHM");













    private static final SubLObject $list157 = _constant_157_initializer();



    private static final SubLString $str159$Someone_is_whaffling_____ = makeString("Someone is whaffling ....");





    private static final SubLSymbol TEST_RANDOM_EL_PARTITION_SIMPLE_SCAN_CASES = makeSymbol("TEST-RANDOM-EL-PARTITION-SIMPLE-SCAN-CASES");

    private static final SubLList $list163 = list(list(list(makeInteger(50), makeInteger(100), TWENTY_INTEGER, TWENTY_INTEGER), makeKeyword("OK")), list(list(TEN_INTEGER, makeInteger(1000), makeInteger(50), makeInteger(50)), makeKeyword("OK")));

    private static final SubLString $str164$Expected__A__got__A_instead_ = makeString("Expected ~A, got ~A instead.");



    private static final SubLSymbol EL_PARTITION_DATA_SINK = makeSymbol("EL-PARTITION-DATA-SINK");

    private static final SubLList $list167 = list(makeSymbol("STATE"), makeSymbol("BRANCH-CDEL-FN"), makeSymbol("BRANCH-ASDEL-FN"), makeSymbol("TIP-CCREATE-FN"), makeSymbol("TIP-ASCREATE-FN"), makeSymbol("TIP-ASREASSERT-FN"));

    private static final SubLList $list168 = list(makeKeyword("STATE"), makeKeyword("BRANCH-CDEL-FN"), makeKeyword("BRANCH-ASDEL-FN"), makeKeyword("TIP-CCREATE-FN"), makeKeyword("TIP-ASCREATE-FN"), makeKeyword("TIP-ASREASSERT-FN"));

    private static final SubLList $list169 = list(makeSymbol("ELPART-DSINK-STATE"), makeSymbol("ELPART-DSINK-BRANCH-CDEL-FN"), makeSymbol("ELPART-DSINK-BRANCH-ASDEL-FN"), makeSymbol("ELPART-DSINK-TIP-CCREATE-FN"), makeSymbol("ELPART-DSINK-TIP-ASCREATE-FN"), makeSymbol("ELPART-DSINK-TIP-ASREASSERT-FN"));

    private static final SubLList $list170 = list(makeSymbol("_CSETF-ELPART-DSINK-STATE"), makeSymbol("_CSETF-ELPART-DSINK-BRANCH-CDEL-FN"), makeSymbol("_CSETF-ELPART-DSINK-BRANCH-ASDEL-FN"), makeSymbol("_CSETF-ELPART-DSINK-TIP-CCREATE-FN"), makeSymbol("_CSETF-ELPART-DSINK-TIP-ASCREATE-FN"), makeSymbol("_CSETF-ELPART-DSINK-TIP-ASREASSERT-FN"));



    private static final SubLSymbol EL_PARTITION_DATA_SINK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EL-PARTITION-DATA-SINK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list173 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("EL-PARTITION-DATA-SINK-P"));

    private static final SubLSymbol ELPART_DSINK_STATE = makeSymbol("ELPART-DSINK-STATE");

    private static final SubLSymbol _CSETF_ELPART_DSINK_STATE = makeSymbol("_CSETF-ELPART-DSINK-STATE");

    private static final SubLSymbol ELPART_DSINK_BRANCH_CDEL_FN = makeSymbol("ELPART-DSINK-BRANCH-CDEL-FN");

    private static final SubLSymbol _CSETF_ELPART_DSINK_BRANCH_CDEL_FN = makeSymbol("_CSETF-ELPART-DSINK-BRANCH-CDEL-FN");

    private static final SubLSymbol ELPART_DSINK_BRANCH_ASDEL_FN = makeSymbol("ELPART-DSINK-BRANCH-ASDEL-FN");

    private static final SubLSymbol _CSETF_ELPART_DSINK_BRANCH_ASDEL_FN = makeSymbol("_CSETF-ELPART-DSINK-BRANCH-ASDEL-FN");

    private static final SubLSymbol ELPART_DSINK_TIP_CCREATE_FN = makeSymbol("ELPART-DSINK-TIP-CCREATE-FN");

    private static final SubLSymbol _CSETF_ELPART_DSINK_TIP_CCREATE_FN = makeSymbol("_CSETF-ELPART-DSINK-TIP-CCREATE-FN");

    private static final SubLSymbol ELPART_DSINK_TIP_ASCREATE_FN = makeSymbol("ELPART-DSINK-TIP-ASCREATE-FN");

    private static final SubLSymbol _CSETF_ELPART_DSINK_TIP_ASCREATE_FN = makeSymbol("_CSETF-ELPART-DSINK-TIP-ASCREATE-FN");

    private static final SubLSymbol ELPART_DSINK_TIP_ASREASSERT_FN = makeSymbol("ELPART-DSINK-TIP-ASREASSERT-FN");

    private static final SubLSymbol _CSETF_ELPART_DSINK_TIP_ASREASSERT_FN = makeSymbol("_CSETF-ELPART-DSINK-TIP-ASREASSERT-FN");



    private static final SubLSymbol $BRANCH_CDEL_FN = makeKeyword("BRANCH-CDEL-FN");

    private static final SubLSymbol $BRANCH_ASDEL_FN = makeKeyword("BRANCH-ASDEL-FN");

    private static final SubLSymbol $TIP_CCREATE_FN = makeKeyword("TIP-CCREATE-FN");

    private static final SubLSymbol $TIP_ASCREATE_FN = makeKeyword("TIP-ASCREATE-FN");

    private static final SubLSymbol $TIP_ASREASSERT_FN = makeKeyword("TIP-ASREASSERT-FN");

    private static final SubLSymbol MAKE_EL_PARTITION_DATA_SINK = makeSymbol("MAKE-EL-PARTITION-DATA-SINK");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_EL_PARTITION_DATA_SINK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-EL-PARTITION-DATA-SINK-METHOD");

    private static final SubLSymbol NOTE_EL_PARTITION_BRANCH_CONSTANT_DELETE = makeSymbol("NOTE-EL-PARTITION-BRANCH-CONSTANT-DELETE");

    private static final SubLSymbol NOTE_EL_PARTITION_BRANCH_ASSERTION_DELETE = makeSymbol("NOTE-EL-PARTITION-BRANCH-ASSERTION-DELETE");

    private static final SubLSymbol NOTE_EL_PARTITION_TIP_CONSTANT_CREATE = makeSymbol("NOTE-EL-PARTITION-TIP-CONSTANT-CREATE");

    private static final SubLSymbol NOTE_EL_PARTITION_TIP_ASSERTION_CREATE = makeSymbol("NOTE-EL-PARTITION-TIP-ASSERTION-CREATE");

    private static final SubLSymbol NOTE_EL_PARTITION_TIP_ASSERTION_REASSERT = makeSymbol("NOTE-EL-PARTITION-TIP-ASSERTION-REASSERT");

    private static final SubLList $list199 = list(list(makeSymbol("CREATOR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $el_partition_creator_override$ = makeSymbol("*EL-PARTITION-CREATOR-OVERRIDE*");

    private static final SubLList $list201 = list(list(makeSymbol("PURPOSE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $el_partition_creation_purpose_override$ = makeSymbol("*EL-PARTITION-CREATION-PURPOSE-OVERRIDE*");

    private static final SubLList $list203 = list(list(makeSymbol("MT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $el_partition_mt_override$ = makeSymbol("*EL-PARTITION-MT-OVERRIDE*");

    private static final SubLList $list205 = list(list(makeSymbol("DIRECTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $el_partition_direction_override$ = makeSymbol("*EL-PARTITION-DIRECTION-OVERRIDE*");

    private static final SubLList $list207 = list(list(makeSymbol("*EL-PARTITION-CREATION-PURPOSE-OVERRIDE*"), makeInteger(212)));

    private static final SubLSymbol TRANSCRIPT_DATA_SINK_BRANCH_CONSTANT_DELETE = makeSymbol("TRANSCRIPT-DATA-SINK-BRANCH-CONSTANT-DELETE");

    private static final SubLSymbol TRANSCRIPT_DATA_SINK_BRANCH_ASSERTION_DELETE = makeSymbol("TRANSCRIPT-DATA-SINK-BRANCH-ASSERTION-DELETE");

    private static final SubLSymbol TRANSCRIPT_DATA_SINK_TIP_CONSTANT_CREATE = makeSymbol("TRANSCRIPT-DATA-SINK-TIP-CONSTANT-CREATE");

    private static final SubLSymbol TRANSCRIPT_DATA_SINK_TIP_ASSERTION_CREATE = makeSymbol("TRANSCRIPT-DATA-SINK-TIP-ASSERTION-CREATE");

    private static final SubLSymbol TRANSCRIPT_DATA_SINK_TIP_ASSERTION_REASSERT = makeSymbol("TRANSCRIPT-DATA-SINK-TIP-ASSERTION-REASSERT");

    private static final SubLString $str213$_FI_KILL____HP__S__S__ = makeString("(FI-KILL '(:HP ~S ~S))");

    private static final SubLString $str214$_FI_UNASSERT___S___S_ = makeString("(FI-UNASSERT '~S '~S)");

    private static final SubLString $str215$_FI_CREATE___S__S_ = makeString("(FI-CREATE '~S ~S)");

    private static final SubLString $str216$_FI_ASSERT___S___S___S___S_ = makeString("(FI-ASSERT '~S '~S '~S '~S)");

    private static final SubLString $str217$_FI_REASSERT___S___S___S___S_ = makeString("(FI-REASSERT '~S '~S '~S '~S)");

    private static final SubLString $str218$_FI_TIMESTAMP_CONSTANT___S___S___ = makeString("(FI-TIMESTAMP-CONSTANT '~S '~S '~S '~S)");

    private static final SubLString $str219$_FI_TIMESTAMP_ASSERTION___S___S__ = makeString("(FI-TIMESTAMP-ASSERTION '~S '~S '~S '~S)");

    private static final SubLList $list220 = list(makeKeyword("HP"), makeString("Guest"), makeGuid("bd5ad700-9c29-11b1-9dad-c379636f7270"));

    private static final SubLString $str221$_ = makeString("(");

    private static final SubLString $str222$_ = makeString(")");

    private static final SubLSymbol DEBUG_DATA_SINK_BRANCH_CONSTANT_DELETE = makeSymbol("DEBUG-DATA-SINK-BRANCH-CONSTANT-DELETE");

    private static final SubLSymbol DEBUG_DATA_SINK_BRANCH_ASSERTION_DELETE = makeSymbol("DEBUG-DATA-SINK-BRANCH-ASSERTION-DELETE");

    private static final SubLSymbol DEBUG_DATA_SINK_TIP_CONSTANT_CREATE = makeSymbol("DEBUG-DATA-SINK-TIP-CONSTANT-CREATE");

    private static final SubLSymbol DEBUG_DATA_SINK_TIP_ASSERTION_CREATE = makeSymbol("DEBUG-DATA-SINK-TIP-ASSERTION-CREATE");

    private static final SubLSymbol DEBUG_DATA_SINK_TIP_ASSERTION_REASSERT = makeSymbol("DEBUG-DATA-SINK-TIP-ASSERTION-REASSERT");

    private static final SubLString $str228$___kill__A__A__ = makeString("~&:kill ~A ~A~%");

    private static final SubLString $str229$___unassert__A__ = makeString("~&:unassert ~A~%");

    private static final SubLString $str230$___create__A__A__ = makeString("~&:create ~A ~A~%");

    private static final SubLString $str231$___assert__A__ = makeString("~&:assert ~A~%");

    private static final SubLString $str232$___reassert__A__A__A__ = makeString("~&:reassert ~A ~A ~A~%");

    public static SubLObject with_pickling_stream_buffer_size(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_STREAM_BUFFER_SIZE, $list2, append(body, NIL));
    }

    public static SubLObject with_pickling_pacficiation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject total = NIL;
        SubLObject message = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        total = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        message = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject curr = $sym4$CURR;
            return list(CLET, list(bq_cons(curr, $list6)), list(NOTING_PERCENT_PROGRESS, message, bq_cons(PROGN, append(body, NIL)), list(CINC, curr), list(NOTE_PERCENT_PROGRESS, curr, total)));
        }
        cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    public static SubLObject el_partition_relevant_constantP(final SubLObject v_term) {
        return makeBoolean(((NIL != constant_p(v_term)) && (NIL == hl_prototypes.hl_prototypical_instanceP(v_term))) && (NIL == fort_types_interface.skolem_function_p(v_term)));
    }

    public static SubLObject el_partition_relevant_assertionP(final SubLObject assertion) {
        return makeBoolean((((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertions_high.asserted_assertionP(assertion))) && (NIL == function_terms.term_of_unit_assertion_p(assertion))) && (NIL == list_utilities.tree_find_if($sym11$HL_PROTOTYPICAL_INSTANCE_, assertions_high.assertion_cons(assertion), UNPROVIDED)));
    }

    public static SubLObject pickle_constants(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = cconcatenate($$$Pickling_constants_to_, new SubLObject[]{ format_nil.format_nil_a_no_copy(filename), $str14$_____ });
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind($pickling_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0_$1 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_binary(filename, $OUTPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$1, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str16$Unable_to_open__S, filename);
                }
                final SubLObject s = stream;
                cfasl_output(misc_utilities.copyright_notice(), s);
                cfasl_output(constant_count(), s);
                final SubLObject idx = do_constants_table();
                final SubLObject mess = message;
                final SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                final SubLObject _prev_bind_0_$2 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$3 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(mess);
                        final SubLObject idx_$4 = idx;
                        if (NIL == id_index_objects_empty_p(idx_$4, $SKIP)) {
                            final SubLObject idx_$5 = idx_$4;
                            if (NIL == id_index_dense_objects_empty_p(idx_$5, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$5);
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
                                        if (NIL != el_partition_relevant_constantP(c)) {
                                            cfasl_output(constant_suid(c), s);
                                            cfasl_output(constants_high.constant_name(c), s);
                                            cfasl_output(constants_high.constant_guid(c), s);
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$6 = idx_$4;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$6)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$6);
                                SubLObject id2 = id_index_sparse_id_threshold(idx_$6);
                                final SubLObject end_id = id_index_next_id(idx_$6);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (id2.numL(end_id)) {
                                    final SubLObject c2 = gethash_without_values(id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(c2))) {
                                        if (NIL != el_partition_relevant_constantP(c2)) {
                                            cfasl_output(constant_suid(c2), s);
                                            cfasl_output(constants_high.constant_name(c2), s);
                                            cfasl_output(constants_high.constant_guid(c2), s);
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                    id2 = add(id2, ONE_INTEGER);
                                } 
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_1_$3, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0_$2, thread);
                }
                cfasl_output(NIL, s);
                cfasl_output(NIL, s);
                cfasl_output(NIL, s);
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        return filename;
    }

    public static SubLObject do_pickled_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject suid = NIL;
        SubLObject name = NIL;
        SubLObject guid = NIL;
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        suid = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        guid = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list20);
            current_$9 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list20);
            if (NIL == member(current_$9, $list21, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list20);
        }
        final SubLObject message_tail = property_list_member($MESSAGE, current);
        final SubLObject message = (NIL != message_tail) ? cadr(message_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject stream = $sym24$STREAM;
        final SubLObject count = $sym25$COUNT;
        final SubLObject msg = $sym26$MSG;
        return list(WITH_PICKLING_STREAM_BUFFER_SIZE, list(WITH_PRIVATE_BINARY_FILE, listS(stream, filename, $list29), list(CFASL_INPUT, stream), list(CLET, list(list(count, list(CFASL_INPUT, stream)), list(msg, list(FIF, list(NULL, message), list(FORMAT_NIL, $str34$Reading_pickled_constants_from__A, filename), message))), list(WITH_PICKLING_PACFICIATION, list(count, msg), list(CDO, list(list(suid, list(CFASL_INPUT, stream), list(CFASL_INPUT, stream)), list(name, list(CFASL_INPUT, stream), list(CFASL_INPUT, stream)), list(guid, list(CFASL_INPUT, stream), list(CFASL_INPUT, stream))), list(list(NULL, guid)), list(MUST, list(NON_NEGATIVE_INTEGER_P, suid), $str39$Read_invalid_SUID__A_from__A_, suid, stream), list(MUST, list(STRINGP, name), $str40$Read_invalid_NAME__A_from__A_, name, stream), list(MUST, list(GUID_P, guid), $str42$Read_invalid_GUID__A_from__A_, guid, stream), list(NOTE_PERCENT_PROGRESS, suid, count), bq_cons(PROGN, append(body, NIL)))))));
    }

    public static SubLObject pickle_assertions(final SubLObject filestem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = cconcatenate($str44$Pickling_assertions_to_file_vecto, new SubLObject[]{ format_nil.format_nil_a_no_copy(filestem), $str14$_____ });
        final SubLObject index_file = pickling_index_filename(filestem);
        final SubLObject data_file = pickling_data_filename(filestem);
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind($pickling_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0_$10 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_binary(index_file, $OUTPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$10, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str16$Unable_to_open__S, index_file);
                }
                final SubLObject index_stream = stream;
                SubLObject stream_$11 = NIL;
                try {
                    final SubLObject _prev_bind_0_$11 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                        stream_$11 = compatibility.open_binary(data_file, $OUTPUT);
                    } finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$11, thread);
                    }
                    if (!stream_$11.isStream()) {
                        Errors.error($str16$Unable_to_open__S, data_file);
                    }
                    final SubLObject data_stream = stream_$11;
                    final SubLObject fvector = file_vector.create_file_vector(data_stream, index_stream);
                    cfasl_output(misc_utilities.copyright_notice(), data_stream);
                    cfasl_output(assertion_handles.assertion_count(), data_stream);
                    cfasl_output(T, data_stream);
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = message;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                    final SubLObject _prev_bind_0_$12 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$14 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$15 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$15, $SKIP)) {
                                final SubLObject idx_$16 = idx_$15;
                                if (NIL == id_index_dense_objects_empty_p(idx_$16, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$16);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject as;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        a_handle = aref(vector_var, a_id);
                                        if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(a_handle)) {
                                                a_handle = $SKIP;
                                            }
                                            as = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            if (NIL != el_partition_relevant_assertionP(as)) {
                                                file_vector.update_file_vector_index_linear(fvector);
                                                cfasl_output(assertion_handles.assertion_id(as), data_stream);
                                                cfasl_output(assertion_to_pickling_format(as), data_stream);
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$17 = idx_$15;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$17)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$17);
                                    SubLObject a_id2 = id_index_sparse_id_threshold(idx_$17);
                                    final SubLObject end_id = id_index_next_id(idx_$17);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                            final SubLObject as2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            if (NIL != el_partition_relevant_assertionP(as2)) {
                                                file_vector.update_file_vector_index_linear(fvector);
                                                cfasl_output(assertion_handles.assertion_id(as2), data_stream);
                                                cfasl_output(assertion_to_pickling_format(as2), data_stream);
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        a_id2 = add(a_id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1_$14, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0_$12, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (stream_$11.isStream()) {
                            close(stream_$11, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        } finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        return values(index_file, data_file);
    }

    public static SubLObject pickling_index_filename(final SubLObject filestem) {
        return cconcatenate(format_nil.format_nil_a_no_copy(filestem), $str45$_index_cfasl);
    }

    public static SubLObject pickling_data_filename(final SubLObject filestem) {
        return cconcatenate(filestem, $str46$_cfasl);
    }

    public static SubLObject assertion_to_pickling_format(final SubLObject assertion) {
        final SubLObject formula = canon_tl.assertion_tl_ist_formula(assertion);
        final SubLObject encapsulated = canon_tl.tl_encapsulate(formula);
        final SubLObject rewritten = transform_list_utilities.ntransform(encapsulated, GUID_P, CONVERT_GUID_TO_PICKLING_FORMAT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return rewritten;
    }

    public static SubLObject unpickle_assertion_pickling_format(final SubLObject pickled_formula) {
        return transform_list_utilities.transform(pickled_formula, PICKLED_GUID_FORMAT_P, RESTORE_GUID_FROM_PICKLING_FORMAT, UNPROVIDED);
    }

    public static SubLObject convert_guid_to_pickling_format(final SubLObject guid) {
        return list($GUID, Guids.guid_to_string(guid));
    }

    public static SubLObject pickled_guid_format_p(final SubLObject v_object) {
        return makeBoolean((((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && ($GUID == v_object.first())) && (NIL != Guids.guid_string_p(second(v_object))));
    }

    public static SubLObject restore_guid_from_pickling_format(final SubLObject pickled_guid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject guid_marker = NIL;
        SubLObject guid_string = NIL;
        destructuring_bind_must_consp(pickled_guid, pickled_guid, $list53);
        guid_marker = pickled_guid.first();
        SubLObject current = pickled_guid.rest();
        destructuring_bind_must_consp(current, pickled_guid, $list53);
        guid_string = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($GUID != guid_marker)) {
                Errors.error($str54$Cannot_restore__A_____not_a_pickl, pickled_guid);
            }
            return Guids.string_to_guid(guid_string);
        }
        cdestructuring_bind_error(pickled_guid, $list53);
        return NIL;
    }

    public static SubLObject new_relevant_assertions_id_space(SubLObject message) {
        if (message == UNPROVIDED) {
            message = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject keepers = NIL;
        if (!message.isString()) {
            message = $str56$Computing_EL_Partition_relevant_a;
        }
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = message;
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
                final SubLObject idx_$21 = idx;
                if (NIL == id_index_objects_empty_p(idx_$21, $SKIP)) {
                    final SubLObject idx_$22 = idx_$21;
                    if (NIL == id_index_dense_objects_empty_p(idx_$22, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$22);
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
                                assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != el_partition_relevant_assertionP(assertion)) {
                                    keepers = cons(assertion_handles.assertion_id(assertion), keepers);
                                    count = add(count, ONE_INTEGER);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$23 = idx_$21;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$23)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$23);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$23);
                        final SubLObject end_id = id_index_next_id(idx_$23);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != el_partition_relevant_assertionP(assertion2)) {
                                    keepers = cons(assertion_handles.assertion_id(assertion2), keepers);
                                    count = add(count, ONE_INTEGER);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        final SubLObject id_space = make_vector(count, UNPROVIDED);
        SubLObject index = count;
        while (NIL != list_utilities.sublisp_boolean(keepers)) {
            index = subtract(index, ONE_INTEGER);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.non_negative_integer_p(index))) {
                Errors.error($str57$Whoa__we_underflowed_the_ID_space);
            }
            set_aref(id_space, index, keepers.first());
            keepers = keepers.rest();
        } 
        return id_space;
    }

    public static SubLObject compare_pickled_kb_to_current_kb(final SubLObject pickled_constant_file, final SubLObject pickled_assertion_filestem, final SubLObject data_sink) {
        compare_pickled_kb_to_current_kb_assertions_internal(pickled_assertion_filestem, data_sink, pickled_constant_file);
        return data_sink;
    }

    public static SubLObject enumerate_additions_to_current_kb(final SubLObject data_sink) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject start = new_constant_suid_threshold();
        SubLObject table_var = do_constants_table();
        SubLObject total = subtract(id_index_next_id(table_var), start);
        SubLObject sofar = ZERO_INTEGER;
        SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($str60$Enumerating_new_constants_____);
                SubLObject end_var;
                SubLObject end;
                SubLObject id;
                SubLObject tip_constant;
                for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                    tip_constant = id_index_lookup(table_var, id, UNPROVIDED);
                    if (NIL != tip_constant) {
                        note_percent_progress(sofar, total);
                        sofar = add(sofar, ONE_INTEGER);
                        if (NIL != el_partition_relevant_constantP(tip_constant)) {
                            note_el_partition_tip_constant_create(data_sink, tip_constant);
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
        start = assertion_handles.get_file_backed_assertion_internal_id_threshold();
        table_var = assertion_handles.do_assertions_table();
        total = subtract(id_index_next_id(table_var), start);
        sofar = ZERO_INTEGER;
        _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($str61$Enumerating_new_assertions_____);
                SubLObject end_var;
                SubLObject end;
                SubLObject id;
                SubLObject tip_assertion;
                for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                    tip_assertion = id_index_lookup(table_var, id, UNPROVIDED);
                    if (NIL != tip_assertion) {
                        note_percent_progress(sofar, total);
                        sofar = add(sofar, ONE_INTEGER);
                        if (NIL != el_partition_relevant_assertionP(tip_assertion)) {
                            note_el_partition_tip_assertion_create(data_sink, tip_assertion);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return data_sink;
    }

    public static SubLObject compare_pickled_kb_to_current_kb_constants(final SubLObject pickled_file, final SubLObject data_sink) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != el_partition_data_sink_p(data_sink) : "el_partitions.el_partition_data_sink_p(data_sink) " + "CommonSymbols.NIL != el_partitions.el_partition_data_sink_p(data_sink) " + data_sink;
        final SubLObject raw_tip_iterator = new_constants_iterator();
        final SubLObject tip_iterator = iteration.new_filter_iterator(raw_tip_iterator, $sym63$EL_PARTITION_RELEVANT_CONSTANT_, UNPROVIDED);
        SubLObject tip_constant = iteration.iteration_next_without_values(tip_iterator, $DONE);
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind($pickling_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0_$27 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_binary(pickled_file, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$27, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str16$Unable_to_open__S, pickled_file);
                }
                final SubLObject stream_$28 = stream;
                cfasl_input(stream_$28, UNPROVIDED, UNPROVIDED);
                final SubLObject count = cfasl_input(stream_$28, UNPROVIDED, UNPROVIDED);
                final SubLObject msg = cconcatenate($$$Reading_pickled_constants_from_, new SubLObject[]{ format_nil.format_nil_a_no_copy(pickled_file), $str14$_____ });
                SubLObject curr = ZERO_INTEGER;
                final SubLObject _prev_bind_0_$28 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$30 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(msg);
                        SubLObject suid = NIL;
                        SubLObject branch_name = NIL;
                        SubLObject branch_guid = NIL;
                        suid = cfasl_input(stream_$28, UNPROVIDED, UNPROVIDED);
                        branch_name = cfasl_input(stream_$28, UNPROVIDED, UNPROVIDED);
                        for (branch_guid = cfasl_input(stream_$28, UNPROVIDED, UNPROVIDED); NIL != branch_guid; branch_guid = cfasl_input(stream_$28, UNPROVIDED, UNPROVIDED)) {
                            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.non_negative_integer_p(suid))) {
                                Errors.error($str39$Read_invalid_SUID__A_from__A_, suid, stream_$28);
                            }
                            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!branch_name.isString())) {
                                Errors.error($str40$Read_invalid_NAME__A_from__A_, branch_name, stream_$28);
                            }
                            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == Guids.guid_p(branch_guid))) {
                                Errors.error($str42$Read_invalid_GUID__A_from__A_, branch_guid, stream_$28);
                            }
                            note_percent_progress(suid, count);
                            if ((NIL != constant_p(tip_constant)) && (NIL != Guids.guidE(branch_guid, constants_high.constant_guid(tip_constant)))) {
                                tip_constant = iteration.iteration_next_without_values(tip_iterator, $DONE);
                            } else {
                                note_el_partition_branch_constant_delete(data_sink, branch_name, branch_guid);
                            }
                            suid = cfasl_input(stream_$28, UNPROVIDED, UNPROVIDED);
                            branch_name = cfasl_input(stream_$28, UNPROVIDED, UNPROVIDED);
                        }
                        curr = add(curr, ONE_INTEGER);
                        note_percent_progress(curr, count);
                    } finally {
                        final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_1_$30, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0_$28, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                }
            }
        } finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        while (NIL != constant_p(tip_constant)) {
            note_el_partition_tip_constant_create(data_sink, tip_constant);
            tip_constant = iteration.iteration_next_without_values(tip_iterator, $DONE);
        } 
        return pickled_file;
    }

    public static SubLObject update_as_iteration_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject it = NIL;
        SubLObject as = NIL;
        SubLObject tl_ist_formula = NIL;
        destructuring_bind_must_consp(current, datum, $list67);
        it = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list67);
        as = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list67);
        tl_ist_formula = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CSETQ, as, listS(ITERATION_NEXT_WITHOUT_VALUES, it, $list70), tl_ist_formula, list(FWHEN, list(ASSERTION_P, as), list(TL_ENCAPSULATE, list(ASSERTION_TL_IST_FORMULA, as))));
        }
        cdestructuring_bind_error(datum, $list67);
        return NIL;
    }

    public static SubLObject decrement_tip_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tip_index = NIL;
        destructuring_bind_must_consp(current, datum, $list75);
        tip_index = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(CDEC, tip_index), list(UNTIL, list($sym78$EL_PARTITION_RELEVANT_ASSERTION_, list(FIND_ASSERTION_BY_ID, tip_index)), list(CDEC, tip_index), list(MUST, list(NON_NEGATIVE_INTEGER_P, tip_index), $str80$Implementation_error__Tip_index__, tip_index)));
        }
        cdestructuring_bind_error(datum, $list75);
        return NIL;
    }

    public static SubLObject find_most_recent_assertion_shared_with_branch(final SubLObject pickled_file_stem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data_file = pickling_data_filename(pickled_file_stem);
        final SubLObject index_file = pickling_index_filename(pickled_file_stem);
        final SubLObject branch_ids_to_index = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject tip_assertion = NIL;
        SubLObject corresponding_branch_as_id = NIL;
        SubLObject total_branch_assertions = NIL;
        SubLObject fvector = NIL;
        try {
            fvector = file_vector.new_file_vector(data_file, index_file, $INPUT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject branch_index_limit = fetch_branch_limit_information_for_pickled_kb(fvector);
            final SubLObject branch_assertions_count = thread.secondMultipleValue();
            thread.resetMultipleValues();
            total_branch_assertions = branch_assertions_count;
            final SubLObject window = dictionary.new_dictionary(EQUAL, UNPROVIDED);
            final SubLObject data_stream = file_vector.get_file_vector_data_stream(fvector);
            SubLObject tip_index = min(total_branch_assertions, assertion_handles.assertion_count());
            SubLObject branch_index = branch_index_limit;
            for (SubLObject doneP = NIL; NIL == doneP; doneP = subl_promotions.non_negative_integer_p(corresponding_branch_as_id)) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!branch_index.isPositive())) {
                    Errors.error($str81$Implementation_error__branch_inde);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!tip_index.isPositive())) {
                    Errors.error($str82$Implementation_error__tip_index_u);
                }
                branch_index = subtract(branch_index, ONE_INTEGER);
                file_vector.position_file_vector(fvector, branch_index);
                final SubLObject branch_as_id = cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
                final SubLObject branch_tl_ist_formula = cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
                map_utilities.map_put(branch_ids_to_index, branch_as_id, branch_index);
                map_utilities.map_put(window, branch_tl_ist_formula, branch_as_id);
                tip_index = subtract(tip_index, ONE_INTEGER);
                while (NIL == el_partition_relevant_assertionP(assertion_handles.find_assertion_by_id(tip_index))) {
                    tip_index = subtract(tip_index, ONE_INTEGER);
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.non_negative_integer_p(tip_index))) {
                        Errors.error($str80$Implementation_error__Tip_index__, tip_index);
                    }
                } 
                tip_assertion = assertion_handles.find_assertion_by_id(tip_index);
                final SubLObject tip_tl_ist_formula = assertion_to_pickling_format(tip_assertion);
                corresponding_branch_as_id = map_utilities.map_get(window, tip_tl_ist_formula, $NOT_FOUND);
            }
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
        final SubLObject branch_index2 = map_utilities.map_get(branch_ids_to_index, corresponding_branch_as_id, UNPROVIDED);
        return list(new SubLObject[]{ $SHARED_ASSERTION, tip_assertion, $BRANCH_AS_ID, corresponding_branch_as_id, $BRANCH_INDEX, branch_index2, $BRANCH_COUNT, total_branch_assertions, $JUST_ASSERTED_P, T });
    }

    public static SubLObject compare_pickled_kb_to_current_kb_assertions(final SubLObject pickled_file_stem, final SubLObject data_sink) {
        assert NIL != el_partition_data_sink_p(data_sink) : "el_partitions.el_partition_data_sink_p(data_sink) " + "CommonSymbols.NIL != el_partitions.el_partition_data_sink_p(data_sink) " + data_sink;
        return compare_pickled_kb_to_current_kb_assertions_internal(pickled_file_stem, data_sink, UNPROVIDED);
    }

    public static SubLObject compare_pickled_kb_to_current_kb_assertions_internal(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject pickled_constants_file) {
        if (pickled_constants_file == UNPROVIDED) {
            pickled_constants_file = NIL;
        }
        final SubLObject pcase_var;
        final SubLObject strategy = pcase_var = $pickled_kb_comparison_strategy$.getGlobalValue();
        if (pcase_var.eql($CLASSIC_BACKWARD)) {
            return compare_pickled_kb_to_current_kb_assertions_classic_backward(pickled_file_stem, data_sink, pickled_constants_file);
        }
        if (pcase_var.eql($NOVEL_FORWARD)) {
            return compare_pickled_kb_to_current_kb_assertions_novel_forward(pickled_file_stem, data_sink, pickled_constants_file);
        }
        if (pcase_var.eql($SCAN_FORWARD_FAST)) {
            return compare_pickled_kb_to_current_kb_assertions_scan_forward_fast(pickled_file_stem, data_sink, pickled_constants_file);
        }
        if (pcase_var.eql($SCAN_FORWARD_STEADY)) {
            return compare_pickled_kb_to_current_kb_assertions_scan_forward_steady(pickled_file_stem, data_sink, pickled_constants_file);
        }
        return Errors.error($str93$Pickled_KB_Comparison_Strategy__S, strategy);
    }

    public static SubLObject compare_pickled_kb_to_current_kb_assertions_scan_forward_fast(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject pickled_constants_file) {
        if (pickled_constants_file == UNPROVIDED) {
            pickled_constants_file = NIL;
        }
        final SubLObject last_shared = scan_enumerate_branch_assertions_missing_from_current_kb(pickled_file_stem, data_sink, UNPROVIDED);
        if (pickled_constants_file.isString()) {
            compare_pickled_kb_to_current_kb_constants(pickled_constants_file, data_sink);
        }
        enumerate_tip_assertions_from_current_kb(data_sink, last_shared);
        return T;
    }

    public static SubLObject compare_pickled_kb_to_current_kb_assertions_scan_forward_steady(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject pickled_constants_file) {
        if (pickled_constants_file == UNPROVIDED) {
            pickled_constants_file = NIL;
        }
        final SubLObject relevant_id_space = new_relevant_assertions_id_space(UNPROVIDED);
        final SubLObject last_shared = scan_enumerate_branch_assertions_missing_from_current_kb(pickled_file_stem, data_sink, relevant_id_space);
        if (pickled_constants_file.isString()) {
            compare_pickled_kb_to_current_kb_constants(pickled_constants_file, data_sink);
        }
        enumerate_tip_assertions_from_current_kb(data_sink, last_shared);
        return T;
    }

    public static SubLObject compare_pickled_kb_to_current_kb_assertions_novel_forward(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject pickled_constants_file) {
        if (pickled_constants_file == UNPROVIDED) {
            pickled_constants_file = NIL;
        }
        final SubLObject last_shared = identify_branch_assertions_absent_from_current_kb(pickled_file_stem, data_sink);
        if (pickled_constants_file.isString()) {
            compare_pickled_kb_to_current_kb_constants(pickled_constants_file, data_sink);
        }
        enumerate_tip_assertions_from_current_kb(data_sink, last_shared);
        return T;
    }

    public static SubLObject compare_pickled_kb_to_current_kb_assertions_classic_backward(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject pickled_constants_file) {
        if (pickled_constants_file == UNPROVIDED) {
            pickled_constants_file = NIL;
        }
        final SubLObject cmp_properties = find_most_recent_assertion_shared_with_branch(pickled_file_stem);
        final SubLObject last_shared = getf(cmp_properties, $SHARED_ASSERTION, UNPROVIDED);
        final SubLObject just_assertedP = getf(cmp_properties, $JUST_ASSERTED_P, UNPROVIDED);
        enumerate_branch_assertions_absent_from_current_kb(pickled_file_stem, data_sink, cmp_properties);
        if (pickled_constants_file.isString()) {
            compare_pickled_kb_to_current_kb_constants(pickled_constants_file, data_sink);
        }
        enumerate_tip_assertions_from_current_kb(data_sink, last_shared);
        return just_assertedP;
    }

    public static SubLObject enumerate_tip_assertions_from_current_kb(final SubLObject data_sink, final SubLObject last_shared) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_space_id;
        final SubLObject new_space_start = new_space_id = add(assertion_handles.assertion_id(last_shared), ONE_INTEGER);
        final SubLObject tip_assertion_count = assertion_handles.assertion_count();
        final SubLObject additions = subtract(tip_assertion_count, new_space_id);
        final SubLObject message = cconcatenate($$$Analyzing_, new SubLObject[]{ format_nil.format_nil_a_no_copy(additions), $str95$_new_assertions_____ });
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
                while (new_space_id.numL(tip_assertion_count)) {
                    note_percent_progress(subtract(new_space_id, new_space_start), tip_assertion_count);
                    final SubLObject new_assertion = assertion_handles.find_assertion_by_id(new_space_id);
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == assertion_handles.assertion_p(new_assertion))) {
                        Errors.error($str96$This_algorithm_is_not_designed_to);
                    }
                    if (NIL != el_partition_relevant_assertionP(new_assertion)) {
                        note_el_partition_tip_assertion_create(data_sink, new_assertion);
                    }
                    new_space_id = add(new_space_id, ONE_INTEGER);
                } 
            } finally {
                final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return data_sink;
    }

    public static SubLObject enumerate_branch_assertions_absent_from_current_kb(final SubLObject pickled_file_stem, final SubLObject data_sink, final SubLObject cmp_properties) {
        final SubLObject shared_assertion = getf(cmp_properties, $SHARED_ASSERTION, UNPROVIDED);
        final SubLObject branch_as_id = getf(cmp_properties, $BRANCH_AS_ID, UNPROVIDED);
        final SubLObject branch_index = getf(cmp_properties, $BRANCH_INDEX, UNPROVIDED);
        final SubLObject branch_count = getf(cmp_properties, $BRANCH_COUNT, UNPROVIDED);
        return enumerate_branch_assertions_missing_from_current_kb(pickled_file_stem, data_sink, shared_assertion, branch_as_id, branch_index, branch_count);
    }

    public static SubLObject elpart_as_desc_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_elpart_as_desc(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject elpart_as_desc_p(final SubLObject v_object) {
        return v_object.getClass() == $elpart_as_desc_native.class ? T : NIL;
    }

    public static SubLObject elpart_as_desc_id(final SubLObject v_object) {
        assert NIL != elpart_as_desc_p(v_object) : "el_partitions.elpart_as_desc_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject elpart_as_desc_tl_ist_formula(final SubLObject v_object) {
        assert NIL != elpart_as_desc_p(v_object) : "el_partitions.elpart_as_desc_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject elpart_as_desc_hash(final SubLObject v_object) {
        assert NIL != elpart_as_desc_p(v_object) : "el_partitions.elpart_as_desc_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject elpart_as_desc_extra(final SubLObject v_object) {
        assert NIL != elpart_as_desc_p(v_object) : "el_partitions.elpart_as_desc_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject elpart_as_desc_weak_ist_formula(final SubLObject v_object) {
        assert NIL != elpart_as_desc_p(v_object) : "el_partitions.elpart_as_desc_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_elpart_as_desc_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != elpart_as_desc_p(v_object) : "el_partitions.elpart_as_desc_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_elpart_as_desc_tl_ist_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != elpart_as_desc_p(v_object) : "el_partitions.elpart_as_desc_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_elpart_as_desc_hash(final SubLObject v_object, final SubLObject value) {
        assert NIL != elpart_as_desc_p(v_object) : "el_partitions.elpart_as_desc_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_elpart_as_desc_extra(final SubLObject v_object, final SubLObject value) {
        assert NIL != elpart_as_desc_p(v_object) : "el_partitions.elpart_as_desc_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_elpart_as_desc_weak_ist_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != elpart_as_desc_p(v_object) : "el_partitions.elpart_as_desc_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_elpart_as_desc(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $elpart_as_desc_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_elpart_as_desc_id(v_new, current_value);
            } else
                if (pcase_var.eql($TL_IST_FORMULA)) {
                    _csetf_elpart_as_desc_tl_ist_formula(v_new, current_value);
                } else
                    if (pcase_var.eql($HASH)) {
                        _csetf_elpart_as_desc_hash(v_new, current_value);
                    } else
                        if (pcase_var.eql($EXTRA)) {
                            _csetf_elpart_as_desc_extra(v_new, current_value);
                        } else
                            if (pcase_var.eql($WEAK_IST_FORMULA)) {
                                _csetf_elpart_as_desc_weak_ist_formula(v_new, current_value);
                            } else {
                                Errors.error($str121$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_elpart_as_desc(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ELPART_AS_DESC, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, elpart_as_desc_id(obj));
        funcall(visitor_fn, obj, $SLOT, $TL_IST_FORMULA, elpart_as_desc_tl_ist_formula(obj));
        funcall(visitor_fn, obj, $SLOT, $HASH, elpart_as_desc_hash(obj));
        funcall(visitor_fn, obj, $SLOT, $EXTRA, elpart_as_desc_extra(obj));
        funcall(visitor_fn, obj, $SLOT, $WEAK_IST_FORMULA, elpart_as_desc_weak_ist_formula(obj));
        funcall(visitor_fn, obj, $END, MAKE_ELPART_AS_DESC, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_elpart_as_desc_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_elpart_as_desc(obj, visitor_fn);
    }

    public static SubLObject print_elpart_as_desc(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            write_string($str127$_id__, stream, UNPROVIDED, UNPROVIDED);
            princ(elpart_as_desc_id(v_object), stream);
            write_string($str128$_hc__, stream, UNPROVIDED, UNPROVIDED);
            princ(elpart_as_desc_hash(v_object), stream);
            final SubLObject extra = elpart_as_desc_extra(v_object);
            if (NIL == extra) {
                princ(extra, stream);
            } else
                if (NIL != assertion_handles.assertion_p(extra)) {
                    write_string($str129$_AS_ID__, stream, UNPROVIDED, UNPROVIDED);
                    princ(assertion_handles.assertion_id(extra), stream);
                } else
                    if (NIL != subl_promotions.non_negative_integer_p(extra)) {
                        write_string($str130$_FVecInx__, stream, UNPROVIDED, UNPROVIDED);
                        princ(extra, stream);
                    } else {
                        write_string($str131$_xtr__, stream, UNPROVIDED, UNPROVIDED);
                        princ(extra, stream);
                    }


            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            print_macros.print_unreadable_object_postamble(stream, v_object, NIL, NIL);
        }
        return v_object;
    }

    public static SubLObject identify_branch_assertions_absent_from_current_kb(final SubLObject pickled_file_stem, final SubLObject data_sink) {
        final SubLObject data_file = pickling_data_filename(pickled_file_stem);
        final SubLObject index_file = pickling_index_filename(pickled_file_stem);
        SubLObject shared_assertion = NIL;
        SubLObject fvector = NIL;
        try {
            fvector = file_vector.new_file_vector(data_file, index_file, $INPUT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            shared_assertion = identify_branch_assertions_absent_from_current_kb_int(fvector, data_sink);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != file_vector.file_vector_p(fvector)) {
                    file_vector.close_file_vector(fvector);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return shared_assertion;
    }

    public static SubLObject identify_branch_assertions_absent_from_current_kb_int(final SubLObject fvector, final SubLObject data_sink) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject last_shared = NIL;
        thread.resetMultipleValues();
        final SubLObject branch_index_limit = fetch_branch_limit_information_for_pickled_kb(fvector);
        final SubLObject branch_assertions_count = thread.secondMultipleValue();
        final SubLObject first_branch_as_id = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject assertions_to_do = subtract(branch_assertions_count, first_branch_as_id);
        final SubLObject message = cconcatenate($$$Analyzing_, new SubLObject[]{ format_nil.format_nil_a_no_copy(assertions_to_do), $str133$_assertions_____ });
        SubLObject left_wall = ZERO_INTEGER;
        SubLObject id_skew = ZERO_INTEGER;
        SubLObject deletions_noted = ZERO_INTEGER;
        final SubLObject first_tip_as_id = find_start_of_el_partition_relevant_assertions(first_branch_as_id);
        id_skew = subtract(first_branch_as_id, first_tip_as_id);
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
                while (left_wall.numL(branch_index_limit)) {
                    note_percent_progress(left_wall, branch_index_limit);
                    SubLObject probe_index = integerDivide(add(left_wall, branch_index_limit), TWO_INTEGER);
                    final SubLObject branch_desc = make_elpart_as_desc(UNPROVIDED);
                    final SubLObject tip_desc = make_elpart_as_desc(UNPROVIDED);
                    enummiss_fetch_specific_assertion_information(fvector, branch_desc, probe_index);
                    final SubLObject tip_as_id = subtract(elpart_as_desc_id(branch_desc), id_skew);
                    enummiss_compute_specific_assertion_information(tip_desc, tip_as_id);
                    if (NIL != same_elpart_as_descP(branch_desc, tip_desc)) {
                        last_shared = elpart_as_desc_extra(tip_desc);
                        if (probe_index.numE(left_wall)) {
                            left_wall = branch_index_limit;
                        } else {
                            left_wall = probe_index;
                        }
                    } else {
                        SubLObject right_wall = probe_index;
                        while (left_wall.numLE(right_wall)) {
                            probe_index = integerDivide(add(left_wall, right_wall), TWO_INTEGER);
                            enummiss_fetch_specific_assertion_information(fvector, branch_desc, probe_index);
                            final SubLObject tip_as_id2 = subtract(elpart_as_desc_id(branch_desc), id_skew);
                            enummiss_compute_specific_assertion_information(tip_desc, tip_as_id2);
                            if (NIL != same_elpart_as_descP(branch_desc, tip_desc)) {
                                left_wall = add(probe_index, ONE_INTEGER);
                                last_shared = elpart_as_desc_extra(tip_desc);
                            } else {
                                right_wall = subtract(probe_index, ONE_INTEGER);
                            }
                        } 
                        enummiss_fetch_specific_assertion_information(fvector, branch_desc, right_wall);
                        final SubLObject tip_last_good = subtract(elpart_as_desc_id(branch_desc), id_skew);
                        final SubLObject tip_cursor = enummiss_find_next_relevant_assertion(tip_last_good);
                        if (tip_cursor.isNegative()) {
                            Errors.error($str134$Not_yet_implemented_);
                        } else {
                            enummiss_compute_specific_assertion_information(tip_desc, tip_cursor);
                            enummiss_fetch_specific_assertion_information(fvector, branch_desc, left_wall);
                            id_skew = subtract(elpart_as_desc_id(branch_desc), tip_cursor);
                            while (left_wall.numL(branch_index_limit) && (NIL == same_elpart_as_descP(branch_desc, tip_desc))) {
                                deletions_noted = add(deletions_noted, ONE_INTEGER);
                                note_el_partition_branch_assertion_delete(data_sink, elpart_as_desc_tl_ist_formula(branch_desc));
                                left_wall = add(left_wall, ONE_INTEGER);
                                enummiss_fetch_specific_assertion_information(fvector, branch_desc, left_wall);
                                id_skew = subtract(elpart_as_desc_id(branch_desc), tip_cursor);
                                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && id_skew.numL(deletions_noted)) {
                                    Errors.error($str135$Mhm__only__A_gaps_across_all_asse, id_skew, deletions_noted);
                                }
                            } 
                            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && id_skew.numLE(deletions_noted)) {
                                Errors.error($str135$Mhm__only__A_gaps_across_all_asse, id_skew, deletions_noted);
                            }
                            if (!left_wall.numL(branch_index_limit)) {
                                continue;
                            }
                            last_shared = elpart_as_desc_extra(tip_desc);
                        }
                    }
                } 
            } finally {
                final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return last_shared;
    }

    public static SubLObject find_start_of_el_partition_relevant_assertions(final SubLObject ceiling) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tip_as_id = MINUS_ONE_INTEGER;
        SubLObject doneP = NIL;
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
                noting_percent_progress_preamble($str136$Finding_start_of_relevant_asserti);
                while (NIL == doneP) {
                    tip_as_id = add(tip_as_id, ONE_INTEGER);
                    note_percent_progress(tip_as_id, ceiling);
                    final SubLObject tip_assertion = assertion_handles.find_assertion_by_id(tip_as_id);
                    doneP = makeBoolean((NIL != el_partition_relevant_assertionP(tip_assertion)) || tip_as_id.numG(ceiling));
                } 
            } finally {
                final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return tip_as_id;
    }

    public static SubLObject fetch_branch_limit_information_for_pickled_kb(final SubLObject fvector) {
        SubLObject branch_assertions_count = NIL;
        SubLObject branch_index_limit = NIL;
        SubLObject first_as_id = NIL;
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(fvector);
        compatibility.set_file_position(data_stream, ZERO_INTEGER);
        cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
        branch_assertions_count = cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
        cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
        branch_index_limit = file_vector.file_vector_length(fvector);
        final SubLObject branch_desc = make_elpart_as_desc(UNPROVIDED);
        enummiss_fetch_specific_assertion_information(fvector, branch_desc, ZERO_INTEGER);
        first_as_id = elpart_as_desc_id(branch_desc);
        return values(branch_index_limit, branch_assertions_count, first_as_id);
    }

    public static SubLObject enumerate_branch_assertions_missing_from_current_kb(final SubLObject pickled_file_stem, final SubLObject data_sink, final SubLObject shared_assertion, final SubLObject branch_as_id, final SubLObject branch_index, final SubLObject branch_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data_file = pickling_data_filename(pickled_file_stem);
        final SubLObject index_file = pickling_index_filename(pickled_file_stem);
        SubLObject fvector = NIL;
        try {
            fvector = file_vector.new_file_vector(data_file, index_file, $INPUT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            enumerate_missing_assertions_before_shared(fvector, data_sink, branch_index);
            SubLObject prev_cursor;
            SubLObject cursor = prev_cursor = branch_index;
            final SubLObject total_id_skew = subtract(branch_as_id, assertion_handles.assertion_id(shared_assertion));
            final SubLObject message = cconcatenate($$$Analyzing_, new SubLObject[]{ format_nil.format_nil_a_no_copy(total_id_skew), $str137$_assertion_gaps_____ });
            SubLObject id_skew = total_id_skew;
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
                    while (ZERO_INTEGER.numL(id_skew)) {
                        note_percent_progress(subtract(total_id_skew, id_skew), total_id_skew);
                        final SubLObject run_length_guess = max(ONE_INTEGER, integerDivide(cursor, id_skew));
                        final SubLObject probe_index = max(ZERO_INTEGER, subtract(cursor, run_length_guess));
                        final SubLObject branch_desc = make_elpart_as_desc(UNPROVIDED);
                        final SubLObject tip_desc = make_elpart_as_desc(UNPROVIDED);
                        enummiss_fetch_specific_assertion_information(fvector, branch_desc, probe_index);
                        final SubLObject tip_as_id = subtract(elpart_as_desc_id(branch_desc), id_skew);
                        enummiss_compute_specific_assertion_information(tip_desc, tip_as_id);
                        if (NIL != same_elpart_as_descP(branch_desc, tip_desc)) {
                            prev_cursor = cursor;
                            cursor = probe_index;
                            if (!prev_cursor.numE(cursor)) {
                                continue;
                            }
                            id_skew = ZERO_INTEGER;
                        } else {
                            SubLObject branch_last_good = probe_index;
                            while (branch_last_good.numLE(cursor)) {
                                final SubLObject search_cursor = integerDivide(add(branch_last_good, cursor), TWO_INTEGER);
                                enummiss_fetch_specific_assertion_information(fvector, branch_desc, search_cursor);
                                final SubLObject tip_as_id2 = subtract(elpart_as_desc_id(branch_desc), id_skew);
                                enummiss_compute_specific_assertion_information(tip_desc, tip_as_id2);
                                if (NIL != same_elpart_as_descP(branch_desc, tip_desc)) {
                                    cursor = subtract(search_cursor, ONE_INTEGER);
                                } else {
                                    branch_last_good = add(search_cursor, ONE_INTEGER);
                                }
                            } 
                            enummiss_fetch_specific_assertion_information(fvector, branch_desc, branch_last_good);
                            final SubLObject tip_last_good = subtract(elpart_as_desc_id(branch_desc), id_skew);
                            final SubLObject tip_cursor = enummiss_find_previous_relevant_assertion(tip_last_good);
                            if (tip_cursor.isNegative()) {
                                while (NIL != subl_promotions.non_negative_integer_p(cursor)) {
                                    enummiss_fetch_specific_assertion_information(fvector, branch_desc, cursor);
                                    note_el_partition_branch_assertion_delete(data_sink, elpart_as_desc_tl_ist_formula(branch_desc));
                                    cursor = subtract(cursor, ONE_INTEGER);
                                } 
                                id_skew = ZERO_INTEGER;
                            } else {
                                enummiss_compute_specific_assertion_information(tip_desc, tip_cursor);
                                enummiss_fetch_specific_assertion_information(fvector, branch_desc, cursor);
                                id_skew = subtract(elpart_as_desc_id(branch_desc), tip_cursor);
                                while (NIL == same_elpart_as_descP(branch_desc, tip_desc)) {
                                    note_el_partition_branch_assertion_delete(data_sink, elpart_as_desc_tl_ist_formula(branch_desc));
                                    cursor = subtract(cursor, ONE_INTEGER);
                                    enummiss_fetch_specific_assertion_information(fvector, branch_desc, cursor);
                                    id_skew = subtract(elpart_as_desc_id(branch_desc), tip_cursor);
                                    if (NIL == subl_promotions.non_negative_integer_p(id_skew)) {
                                        final SubLObject last_good_desc = make_elpart_as_desc(UNPROVIDED);
                                        enummiss_fetch_specific_assertion_information(fvector, last_good_desc, branch_last_good);
                                        Errors.error($str138$Error_realigning_BRANCH___A__now_, last_good_desc, branch_desc, tip_desc);
                                    }
                                } 
                            }
                        }
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (NIL != file_vector.file_vector_p(fvector)) {
                    file_vector.close_file_vector(fvector);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return pickled_file_stem;
    }

    public static SubLObject same_elpart_as_descP(final SubLObject a_desc, final SubLObject b_desc) {
        return makeBoolean(elpart_as_desc_hash(a_desc).eql(elpart_as_desc_hash(b_desc)) && elpart_as_desc_weak_ist_formula(a_desc).equal(elpart_as_desc_weak_ist_formula(b_desc)));
    }

    public static SubLObject enummiss_find_previous_relevant_assertion(final SubLObject tip_last_good) {
        SubLObject tip_cursor;
        for (tip_cursor = subtract(tip_last_good, ONE_INTEGER); NIL != subl_promotions.non_negative_integer_p(tip_cursor); tip_cursor = subtract(tip_cursor, ONE_INTEGER)) {
            final SubLObject tip_assertion = assertion_handles.find_assertion_by_id(tip_cursor);
            if (NIL != el_partition_relevant_assertionP(tip_assertion)) {
                return tip_cursor;
            }
        }
        return tip_cursor;
    }

    public static SubLObject enummiss_find_next_relevant_assertion(final SubLObject tip_last_good) {
        for (SubLObject tip_cursor = add(tip_last_good, ONE_INTEGER), limit = assertion_handles.get_file_backed_assertion_internal_id_threshold(); tip_cursor.numL(limit); tip_cursor = add(tip_cursor, ONE_INTEGER)) {
            final SubLObject tip_assertion = assertion_handles.find_assertion_by_id(tip_cursor);
            if (NIL != el_partition_relevant_assertionP(tip_assertion)) {
                return tip_cursor;
            }
        }
        return MINUS_ONE_INTEGER;
    }

    public static SubLObject enummiss_fetch_specific_assertion_information(final SubLObject fvector, final SubLObject branch_desc, final SubLObject index) {
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(fvector);
        file_vector.position_file_vector(fvector, index);
        _csetf_elpart_as_desc_extra(branch_desc, index);
        _csetf_elpart_as_desc_id(branch_desc, cfasl_input(data_stream, UNPROVIDED, UNPROVIDED));
        final SubLObject as_tl_ist_formula = cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
        final SubLObject weak_ist_formula = enummiss_compute_weakened_ist_formula(as_tl_ist_formula);
        _csetf_elpart_as_desc_tl_ist_formula(branch_desc, as_tl_ist_formula);
        _csetf_elpart_as_desc_weak_ist_formula(branch_desc, weak_ist_formula);
        _csetf_elpart_as_desc_hash(branch_desc, Sxhash.sxhash(weak_ist_formula));
        return branch_desc;
    }

    public static SubLObject enummiss_compute_specific_assertion_information(final SubLObject tip_desc, final SubLObject potential_id) {
        enummiss_clear_specific_assertion_information(tip_desc);
        _csetf_elpart_as_desc_id(tip_desc, potential_id);
        if (NIL != subl_promotions.non_negative_integer_p(potential_id)) {
            final SubLObject tip_assertion = assertion_handles.find_assertion_by_id(potential_id);
            final SubLObject tl_ist_formula = assertion_to_pickling_format(tip_assertion);
            final SubLObject weak_ist_formula = enummiss_compute_weakened_ist_formula(tl_ist_formula);
            _csetf_elpart_as_desc_extra(tip_desc, tip_assertion);
            _csetf_elpart_as_desc_tl_ist_formula(tip_desc, tl_ist_formula);
            _csetf_elpart_as_desc_weak_ist_formula(tip_desc, weak_ist_formula);
            _csetf_elpart_as_desc_hash(tip_desc, Sxhash.sxhash(weak_ist_formula));
        }
        return tip_desc;
    }

    public static SubLObject enummiss_clear_specific_assertion_information(final SubLObject desc) {
        _csetf_elpart_as_desc_id(desc, NIL);
        _csetf_elpart_as_desc_extra(desc, NIL);
        _csetf_elpart_as_desc_hash(desc, NIL);
        _csetf_elpart_as_desc_tl_ist_formula(desc, NIL);
        _csetf_elpart_as_desc_weak_ist_formula(desc, NIL);
        return desc;
    }

    public static SubLObject enummiss_compute_weakened_ist_formula(final SubLObject tl_ist_formula) {
        SubLObject weak_formula = copy_tree(tl_ist_formula);
        SubLObject cdolist_list_var = cycl_utilities.expression_gather(weak_formula, ENUMMISS_TL_HP_NOTATION, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject named_term = NIL;
        named_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = named_term;
            SubLObject hp_marker = NIL;
            SubLObject constant_name = NIL;
            SubLObject guid = NIL;
            destructuring_bind_must_consp(current, datum, $list139);
            hp_marker = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list139);
            constant_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list139);
            guid = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject current_$38;
                final SubLObject datum_$37 = current_$38 = guid;
                SubLObject guid_marker = NIL;
                SubLObject guid_string = NIL;
                destructuring_bind_must_consp(current_$38, datum_$37, $list53);
                guid_marker = current_$38.first();
                current_$38 = current_$38.rest();
                destructuring_bind_must_consp(current_$38, datum_$37, $list53);
                guid_string = current_$38.first();
                current_$38 = current_$38.rest();
                if (NIL == current_$38) {
                    final SubLObject new_named_term = guid_string;
                    weak_formula = cycl_utilities.expression_nsubst(new_named_term, named_term, weak_formula, EQUAL, UNPROVIDED);
                } else {
                    cdestructuring_bind_error(datum_$37, $list53);
                }
            } else {
                cdestructuring_bind_error(datum, $list139);
            }
            cdolist_list_var = cdolist_list_var.rest();
            named_term = cdolist_list_var.first();
        } 
        return weak_formula;
    }

    public static SubLObject enummiss_tl_hp_notation(final SubLObject v_object) {
        if ((((!v_object.isCons()) || ($HP != nth(ZERO_INTEGER, v_object))) || (!nth(ONE_INTEGER, v_object).isString())) || (NIL == list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) {
            return NIL;
        }
        final SubLObject guid_part = nth(TWO_INTEGER, v_object);
        return makeBoolean(((guid_part.isCons() && ($GUID == nth(ZERO_INTEGER, guid_part))) && nth(ONE_INTEGER, guid_part).isString()) && (NIL != list_utilities.lengthE(guid_part, TWO_INTEGER, UNPROVIDED)));
    }

    public static SubLObject enumerate_missing_assertions_before_shared(final SubLObject fvector, final SubLObject data_sink, final SubLObject branch_index) {
        SubLObject last_index = subtract(file_vector.file_vector_length(fvector), ONE_INTEGER);
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(fvector);
        while (branch_index.numL(last_index)) {
            file_vector.position_file_vector(fvector, last_index);
            final SubLObject branch_as_id = cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
            final SubLObject branch_tl_ist_formula = cfasl_input(data_stream, UNPROVIDED, UNPROVIDED);
            note_el_partition_branch_assertion_delete(data_sink, branch_tl_ist_formula);
            last_index = subtract(last_index, ONE_INTEGER);
        } 
        return data_sink;
    }

    public static SubLObject scan_enumerate_branch_assertions_missing_from_current_kb(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject relevant_id_space) {
        if (relevant_id_space == UNPROVIDED) {
            relevant_id_space = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!relevant_id_space.isVector())) {
            Errors.error($str142$Sorry__FAST_is_currently_not_impl);
        }
        final SubLObject data_file = pickling_data_filename(pickled_file_stem);
        final SubLObject index_file = pickling_index_filename(pickled_file_stem);
        SubLObject last_shared_as_id = MINUS_ONE_INTEGER;
        SubLObject fvector = NIL;
        try {
            fvector = file_vector.new_file_vector(data_file, index_file, $INPUT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject branch_count = file_vector.file_vector_length(fvector);
            SubLObject last_shared_branch_index = MINUS_ONE_INTEGER;
            SubLObject index_skew = ZERO_INTEGER;
            final SubLObject message = cconcatenate($$$Analyzing_, new SubLObject[]{ format_nil.format_nil_a_no_copy(branch_count), $str143$_branch_assertions_____ });
            final SubLObject branch_as = make_elpart_as_desc(UNPROVIDED);
            final SubLObject tip_as = make_elpart_as_desc(UNPROVIDED);
            final SubLObject branch_limit = subtract(branch_count, ONE_INTEGER);
            final SubLObject tip_limit = (relevant_id_space.isVector()) ? length(relevant_id_space) : subtract(assertion_handles.assertion_count(), ONE_INTEGER);
            SubLObject doneP = NIL;
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
                    while (NIL == doneP) {
                        SubLObject offset = ONE_INTEGER;
                        SubLObject branch_index = add(last_shared_branch_index, offset);
                        SubLObject situation = NIL;
                        note_percent_progress(branch_index, branch_limit);
                        scan_enummiss_load_branch_assertion(branch_as, fvector, branch_index, branch_limit);
                        if (relevant_id_space.isVector()) {
                            scan_enummiss_corresponding_relevant_tip_assertion(tip_as, branch_index, index_skew, relevant_id_space);
                        } else {
                            scan_enummiss_corresponding_tip_assertion(tip_as, branch_as, index_skew, tip_limit);
                        }
                        final SubLObject pcase_var;
                        situation = pcase_var = scan_enummiss_classify_situation(branch_as, tip_as);
                        if (pcase_var.eql($BOTH_INVALID)) {
                            doneP = T;
                        } else
                            if (pcase_var.eql($INVALID_BRANCH)) {
                                doneP = T;
                            } else
                                if (pcase_var.eql($INVALID_TIP)) {
                                    enumerate_missing_assertions_before_shared(fvector, data_sink, branch_count);
                                    doneP = T;
                                } else
                                    if (pcase_var.eql($DIFFERENT)) {
                                        note_el_partition_branch_assertion_delete(data_sink, elpart_as_desc_tl_ist_formula(branch_as));
                                        index_skew = add(index_skew, ONE_INTEGER);
                                        last_shared_branch_index = branch_index;
                                    } else
                                        if (pcase_var.eql($EQUAL)) {
                                            while (situation == $EQUAL) {
                                                last_shared_branch_index = branch_index;
                                                last_shared_as_id = elpart_as_desc_id(tip_as);
                                                note_percent_progress(last_shared_branch_index, branch_limit);
                                                branch_index = add(last_shared_branch_index, offset);
                                                offset = add(offset, offset);
                                                scan_enummiss_load_branch_assertion(branch_as, fvector, branch_index, branch_limit);
                                                if (relevant_id_space.isVector()) {
                                                    scan_enummiss_corresponding_relevant_tip_assertion(tip_as, branch_index, index_skew, relevant_id_space);
                                                } else {
                                                    scan_enummiss_corresponding_tip_assertion(tip_as, branch_as, index_skew, tip_limit);
                                                }
                                                situation = scan_enummiss_classify_situation(branch_as, tip_as);
                                            } 
                                        } else {
                                            Errors.error($str149$Unknown_state__A____do_not_know_w, situation);
                                        }




                    } 
                } finally {
                    final SubLObject _prev_bind_0_$39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (NIL != file_vector.file_vector_p(fvector)) {
                    file_vector.close_file_vector(fvector);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return assertion_handles.find_assertion_by_id(last_shared_as_id);
    }

    public static SubLObject scan_enummiss_load_branch_assertion(final SubLObject branch_as, final SubLObject fvector, final SubLObject branch_index, final SubLObject branch_limit) {
        if (branch_limit.numL(branch_index)) {
            enummiss_clear_specific_assertion_information(branch_as);
        } else {
            enummiss_fetch_specific_assertion_information(fvector, branch_as, branch_index);
        }
        return branch_as;
    }

    public static SubLObject scan_enummiss_corresponding_relevant_tip_assertion(final SubLObject tip_as, final SubLObject branch_index, final SubLObject index_skew, final SubLObject relevant_id_space) {
        final SubLObject tip_index = subtract(branch_index, index_skew);
        enummiss_clear_specific_assertion_information(tip_as);
        if ((NIL != subl_promotions.non_negative_integer_p(tip_index)) && tip_index.numL(length(relevant_id_space))) {
            final SubLObject tip_as_id = aref(relevant_id_space, tip_index);
            enummiss_compute_specific_assertion_information(tip_as, tip_as_id);
        }
        return tip_as;
    }

    public static SubLObject scan_enummiss_corresponding_tip_assertion(final SubLObject tip_as, final SubLObject branch_as, final SubLObject index_skew, final SubLObject tip_limit) {
        final SubLObject branch_as_id = elpart_as_desc_id(branch_as);
        if (NIL != subl_promotions.non_negative_integer_p(branch_as_id)) {
            final SubLObject tip_index = subtract(branch_as_id, index_skew);
            scan_enummiss_load_tip_assertion(tip_as, tip_index, tip_limit);
        } else {
            enummiss_clear_specific_assertion_information(tip_as);
        }
        return tip_as;
    }

    public static SubLObject scan_enummiss_load_tip_assertion(final SubLObject tip_as, final SubLObject tip_index, final SubLObject tip_limit) {
        if (tip_limit.numL(tip_index)) {
            enummiss_clear_specific_assertion_information(tip_as);
        } else {
            final SubLObject tip_as_id = enummiss_find_previous_relevant_assertion(add(ONE_INTEGER, tip_index));
            enummiss_compute_specific_assertion_information(tip_as, tip_as_id);
        }
        return tip_as;
    }

    public static SubLObject scan_enummiss_classify_situation(final SubLObject branch_as, final SubLObject tip_as) {
        if (NIL == elpart_as_desc_hash(branch_as)) {
            if (NIL == elpart_as_desc_hash(tip_as)) {
                return $BOTH_INVALID;
            }
            return $INVALID_BRANCH;
        } else {
            if (NIL == elpart_as_desc_hash(tip_as)) {
                return $INVALID_TIP;
            }
            if (NIL != same_elpart_as_descP(branch_as, tip_as)) {
                return $EQUAL;
            }
            return $DIFFERENT;
        }
    }

    public static SubLObject test_helper_get_assertion(final SubLObject v, final SubLObject i) {
        if ((NIL != subl_promotions.non_negative_integer_p(i)) && i.numL(length(v))) {
            return aref(v, i);
        }
        return $INVALID;
    }

    public static SubLObject test_helper_classify_situation(final SubLObject branch_as, final SubLObject tip_as) {
        if ($INVALID == branch_as) {
            if ($INVALID == tip_as) {
                return $BOTH_INVALID;
            }
            return $INVALID_BRANCH;
        } else {
            if ($INVALID == tip_as) {
                return $INVALID_TIP;
            }
            if (branch_as.equal(tip_as)) {
                return $EQUAL;
            }
            return $DIFFERENT;
        }
    }

    public static SubLObject test_el_partition_simple_scan_algorithm(final SubLObject branch_ases, final SubLObject tip_ases) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operations = NIL;
        SubLObject last_shared_branch_index = MINUS_ONE_INTEGER;
        SubLObject index_skew = ZERO_INTEGER;
        final SubLObject limit = multiply(length(branch_ases), length(tip_ases));
        SubLObject step = ZERO_INTEGER;
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            step = add(step, ONE_INTEGER);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!step.numL(limit))) {
                Errors.error($str159$Someone_is_whaffling_____);
            }
            SubLObject offset = ONE_INTEGER;
            SubLObject branch_index = add(last_shared_branch_index, offset);
            SubLObject tip_index = subtract(branch_index, index_skew);
            SubLObject branch_as = test_helper_get_assertion(branch_ases, branch_index);
            SubLObject tip_as = test_helper_get_assertion(tip_ases, tip_index);
            final SubLObject pcase_var;
            SubLObject situation = pcase_var = test_helper_classify_situation(branch_as, tip_as);
            if (pcase_var.eql($BOTH_INVALID)) {
                doneP = T;
            } else
                if (pcase_var.eql($INVALID_BRANCH)) {
                    for (SubLObject sequence_var = subseq(tip_ases, tip_index, UNPROVIDED), end_index = (sequence_var.isList()) ? NIL : length(sequence_var), element_num = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var)) {
                        final SubLObject as = subl_macros.do_sequence_index_valueP(element_num, sequence_var);
                        operations = cons(list($CREATE, as), operations);
                        sequence_var = subl_macros.do_sequence_index_update(sequence_var);
                        element_num = add(element_num, ONE_INTEGER);
                    }
                    doneP = T;
                } else
                    if (pcase_var.eql($INVALID_TIP)) {
                        for (SubLObject sequence_var = subseq(branch_ases, branch_index, UNPROVIDED), end_index = (sequence_var.isList()) ? NIL : length(sequence_var), element_num = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var)) {
                            final SubLObject as = subl_macros.do_sequence_index_valueP(element_num, sequence_var);
                            operations = cons(list($DELETE, as), operations);
                            sequence_var = subl_macros.do_sequence_index_update(sequence_var);
                            element_num = add(element_num, ONE_INTEGER);
                        }
                        doneP = T;
                    } else
                        if (pcase_var.eql($DIFFERENT)) {
                            operations = cons(list($DELETE, branch_as), operations);
                            index_skew = add(index_skew, ONE_INTEGER);
                            last_shared_branch_index = branch_index;
                        } else
                            if (pcase_var.eql($EQUAL)) {
                                while (situation == $EQUAL) {
                                    last_shared_branch_index = branch_index;
                                    branch_index = add(last_shared_branch_index, offset);
                                    offset = add(offset, offset);
                                    tip_index = subtract(branch_index, index_skew);
                                    branch_as = test_helper_get_assertion(branch_ases, branch_index);
                                    tip_as = test_helper_get_assertion(tip_ases, tip_index);
                                    situation = test_helper_classify_situation(branch_as, tip_as);
                                    step = add(step, ONE_INTEGER);
                                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!step.numL(limit))) {
                                        Errors.error($str159$Someone_is_whaffling_____);
                                    }
                                } 
                            } else {
                                Errors.error($str149$Unknown_state__A____do_not_know_w, situation);
                            }




        } 
        return nreverse(operations);
    }

    public static SubLObject generate_el_partition_simple_scan_case(final SubLObject size, final SubLObject additions, final SubLObject deletions) {
        final SubLObject blacklist = set.new_set(EQ, deletions);
        SubLObject change_log = NIL;
        SubLObject branch_ases = NIL;
        SubLObject tip_ases = NIL;
        branch_ases = make_vector(size, UNPROVIDED);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
            set_aref(branch_ases, i, i);
        }
        while (set.set_size(blacklist).numL(deletions)) {
            set.set_add(random.random(size), blacklist);
        } 
        final SubLObject tip_size = add(size, additions, minus(deletions));
        tip_ases = make_vector(tip_size, UNPROVIDED);
        SubLObject index = ZERO_INTEGER;
        SubLObject j;
        for (j = NIL, j = ZERO_INTEGER; j.numL(size); j = add(j, ONE_INTEGER)) {
            if (NIL != set.set_memberP(j, blacklist)) {
                change_log = cons(list($DELETE, j), change_log);
            } else {
                set_aref(tip_ases, index, j);
                index = add(index, ONE_INTEGER);
            }
        }
        SubLObject value;
        for (j = NIL, j = ZERO_INTEGER; j.numL(additions); j = add(j, ONE_INTEGER)) {
            value = add(size, j);
            change_log = cons(list($CREATE, value), change_log);
            set_aref(tip_ases, index, value);
            index = add(index, ONE_INTEGER);
        }
        return values(branch_ases, tip_ases, nreverse(change_log));
    }

    public static SubLObject test_random_el_partition_simple_scan_cases(final SubLObject n, final SubLObject size, final SubLObject addition_range, final SubLObject deletions_range) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject i;
        SubLObject additions;
        SubLObject deletions;
        SubLObject branch_ases;
        SubLObject tip_ases;
        SubLObject expected_change_log;
        SubLObject actual_change_log;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
            additions = random.random(addition_range);
            deletions = random.random(deletions_range);
            thread.resetMultipleValues();
            branch_ases = generate_el_partition_simple_scan_case(size, additions, deletions);
            tip_ases = thread.secondMultipleValue();
            expected_change_log = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            actual_change_log = test_el_partition_simple_scan_algorithm(branch_ases, tip_ases);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!expected_change_log.equal(actual_change_log))) {
                Errors.error($str164$Expected__A__got__A_instead_, expected_change_log, actual_change_log);
            }
        }
        return $OK;
    }

    public static SubLObject el_partition_data_sink_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject el_partition_data_sink_p(final SubLObject v_object) {
        return v_object.getClass() == $el_partition_data_sink_native.class ? T : NIL;
    }

    public static SubLObject elpart_dsink_state(final SubLObject v_object) {
        assert NIL != el_partition_data_sink_p(v_object) : "el_partitions.el_partition_data_sink_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject elpart_dsink_branch_cdel_fn(final SubLObject v_object) {
        assert NIL != el_partition_data_sink_p(v_object) : "el_partitions.el_partition_data_sink_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject elpart_dsink_branch_asdel_fn(final SubLObject v_object) {
        assert NIL != el_partition_data_sink_p(v_object) : "el_partitions.el_partition_data_sink_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject elpart_dsink_tip_ccreate_fn(final SubLObject v_object) {
        assert NIL != el_partition_data_sink_p(v_object) : "el_partitions.el_partition_data_sink_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject elpart_dsink_tip_ascreate_fn(final SubLObject v_object) {
        assert NIL != el_partition_data_sink_p(v_object) : "el_partitions.el_partition_data_sink_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject elpart_dsink_tip_asreassert_fn(final SubLObject v_object) {
        assert NIL != el_partition_data_sink_p(v_object) : "el_partitions.el_partition_data_sink_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_elpart_dsink_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != el_partition_data_sink_p(v_object) : "el_partitions.el_partition_data_sink_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_elpart_dsink_branch_cdel_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != el_partition_data_sink_p(v_object) : "el_partitions.el_partition_data_sink_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_elpart_dsink_branch_asdel_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != el_partition_data_sink_p(v_object) : "el_partitions.el_partition_data_sink_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_elpart_dsink_tip_ccreate_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != el_partition_data_sink_p(v_object) : "el_partitions.el_partition_data_sink_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_elpart_dsink_tip_ascreate_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != el_partition_data_sink_p(v_object) : "el_partitions.el_partition_data_sink_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_elpart_dsink_tip_asreassert_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != el_partition_data_sink_p(v_object) : "el_partitions.el_partition_data_sink_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_el_partition_data_sink(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $el_partition_data_sink_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STATE)) {
                _csetf_elpart_dsink_state(v_new, current_value);
            } else
                if (pcase_var.eql($BRANCH_CDEL_FN)) {
                    _csetf_elpart_dsink_branch_cdel_fn(v_new, current_value);
                } else
                    if (pcase_var.eql($BRANCH_ASDEL_FN)) {
                        _csetf_elpart_dsink_branch_asdel_fn(v_new, current_value);
                    } else
                        if (pcase_var.eql($TIP_CCREATE_FN)) {
                            _csetf_elpart_dsink_tip_ccreate_fn(v_new, current_value);
                        } else
                            if (pcase_var.eql($TIP_ASCREATE_FN)) {
                                _csetf_elpart_dsink_tip_ascreate_fn(v_new, current_value);
                            } else
                                if (pcase_var.eql($TIP_ASREASSERT_FN)) {
                                    _csetf_elpart_dsink_tip_asreassert_fn(v_new, current_value);
                                } else {
                                    Errors.error($str121$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_el_partition_data_sink(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_EL_PARTITION_DATA_SINK, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STATE, elpart_dsink_state(obj));
        funcall(visitor_fn, obj, $SLOT, $BRANCH_CDEL_FN, elpart_dsink_branch_cdel_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $BRANCH_ASDEL_FN, elpart_dsink_branch_asdel_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $TIP_CCREATE_FN, elpart_dsink_tip_ccreate_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $TIP_ASCREATE_FN, elpart_dsink_tip_ascreate_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $TIP_ASREASSERT_FN, elpart_dsink_tip_asreassert_fn(obj));
        funcall(visitor_fn, obj, $END, MAKE_EL_PARTITION_DATA_SINK, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_el_partition_data_sink_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_el_partition_data_sink(obj, visitor_fn);
    }

    public static SubLObject new_el_partition_data_sink(final SubLObject state, final SubLObject branch_constant_delete_fn, final SubLObject branch_assertion_delete_fn, final SubLObject tip_constant_create_fn, final SubLObject tip_assertion_create_fn, final SubLObject tip_assertion_reassert_fn) {
        final SubLObject sink = make_el_partition_data_sink(UNPROVIDED);
        _csetf_elpart_dsink_state(sink, state);
        _csetf_elpart_dsink_branch_cdel_fn(sink, branch_constant_delete_fn);
        _csetf_elpart_dsink_branch_asdel_fn(sink, branch_assertion_delete_fn);
        _csetf_elpart_dsink_tip_ccreate_fn(sink, tip_constant_create_fn);
        _csetf_elpart_dsink_tip_ascreate_fn(sink, tip_assertion_create_fn);
        _csetf_elpart_dsink_tip_asreassert_fn(sink, tip_assertion_reassert_fn);
        return sink;
    }

    public static SubLObject note_el_partition_branch_constant_delete(final SubLObject sink, final SubLObject name, final SubLObject guid) {
        final SubLObject cdel_fn = elpart_dsink_branch_cdel_fn(sink);
        funcall(cdel_fn, sink, name, guid);
        return sink;
    }

    public static SubLObject note_el_partition_branch_assertion_delete(final SubLObject sink, final SubLObject tl_ist_formula) {
        final SubLObject asdel_fn = elpart_dsink_branch_asdel_fn(sink);
        funcall(asdel_fn, sink, tl_ist_formula);
        return sink;
    }

    public static SubLObject note_el_partition_tip_constant_create(final SubLObject sink, final SubLObject constant) {
        final SubLObject ccreate_fn = elpart_dsink_tip_ccreate_fn(sink);
        funcall(ccreate_fn, sink, constant);
        return sink;
    }

    public static SubLObject note_el_partition_tip_assertion_create(final SubLObject sink, final SubLObject assertion) {
        final SubLObject ascreate_fn = elpart_dsink_tip_ascreate_fn(sink);
        funcall(ascreate_fn, sink, assertion);
        return sink;
    }

    public static SubLObject note_el_partition_tip_assertion_reassert(final SubLObject sink, final SubLObject assertion, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLObject ascreate_fn = elpart_dsink_tip_asreassert_fn(sink);
        funcall(ascreate_fn, sink, assertion, strength, direction);
        return sink;
    }

    public static SubLObject get_el_partition_data_sink_state(final SubLObject sink) {
        return elpart_dsink_state(sink);
    }

    public static SubLObject with_el_partition_creator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list199);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject creator = NIL;
        destructuring_bind_must_consp(current, datum, $list199);
        creator = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($el_partition_creator_override$, creator)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list199);
        return NIL;
    }

    public static SubLObject with_el_partition_creation_purpose(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list201);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject purpose = NIL;
        destructuring_bind_must_consp(current, datum, $list201);
        purpose = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($el_partition_creation_purpose_override$, purpose)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list201);
        return NIL;
    }

    public static SubLObject with_el_partition_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list203);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list203);
        mt = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($el_partition_mt_override$, mt)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list203);
        return NIL;
    }

    public static SubLObject with_el_partition_direction(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list205);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject direction = NIL;
        destructuring_bind_must_consp(current, datum, $list205);
        direction = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($el_partition_direction_override$, direction)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list205);
        return NIL;
    }

    public static SubLObject without_el_partition_creation_purpose(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list207, append(body, NIL));
    }

    public static SubLObject new_transcript_el_partition_data_sink(final SubLObject stream) {
        return new_el_partition_data_sink(stream, TRANSCRIPT_DATA_SINK_BRANCH_CONSTANT_DELETE, TRANSCRIPT_DATA_SINK_BRANCH_ASSERTION_DELETE, TRANSCRIPT_DATA_SINK_TIP_CONSTANT_CREATE, TRANSCRIPT_DATA_SINK_TIP_ASSERTION_CREATE, TRANSCRIPT_DATA_SINK_TIP_ASSERTION_REASSERT);
    }

    public static SubLObject transcript_data_sink_branch_constant_delete(final SubLObject sink, final SubLObject name, final SubLObject guid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        transcript_data_sink_form_prologue(stream);
        final SubLObject _prev_bind_0 = $print_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $print_length$.currentBinding(thread);
        try {
            $print_level$.bind(NIL, thread);
            $print_length$.bind(NIL, thread);
            format(stream, $str213$_FI_KILL____HP__S__S__, name, guid);
        } finally {
            $print_length$.rebind(_prev_bind_2, thread);
            $print_level$.rebind(_prev_bind_0, thread);
        }
        transcript_data_sink_form_epilogue(stream);
        return sink;
    }

    public static SubLObject transcript_data_sink_branch_assertion_delete(final SubLObject sink, final SubLObject pickled_tl_ist_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject tl_ist_formula = unpickle_assertion_pickling_format(pickled_tl_ist_formula);
        final SubLObject tl_elmt = cycl_utilities.formula_arg1(tl_ist_formula, UNPROVIDED);
        transcript_data_sink_form_prologue(stream);
        final SubLObject _prev_bind_0 = $print_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $print_length$.currentBinding(thread);
        try {
            $print_level$.bind(NIL, thread);
            $print_length$.bind(NIL, thread);
            format(stream, $str214$_FI_UNASSERT___S___S_, tl_ist_formula, tl_elmt);
        } finally {
            $print_length$.rebind(_prev_bind_2, thread);
            $print_level$.rebind(_prev_bind_0, thread);
        }
        transcript_data_sink_form_epilogue(stream);
        return sink;
    }

    public static SubLObject transcript_data_sink_tip_constant_create(final SubLObject sink, final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject name = constants_high.constant_name(constant);
        final SubLObject guid = constants_high.constant_external_id(constant);
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_level$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            $print_length$.bind(NIL, thread);
            $print_level$.bind(NIL, thread);
            transcript_data_sink_form_prologue(stream);
            format(stream, $str215$_FI_CREATE___S__S_, name, guid);
            transcript_data_sink_form_epilogue(stream);
        } finally {
            $print_level$.rebind(_prev_bind_3, thread);
            $print_length$.rebind(_prev_bind_2, thread);
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        transcript_data_sink_tip_constant_timestamp(sink, constant);
        return sink;
    }

    public static SubLObject transcript_data_sink_tip_assertion_create(final SubLObject sink, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject ist_formula = uncanonicalizer.assertion_el_ist_formula(assertion);
        final SubLObject elmt = (NIL != $el_partition_mt_override$.getDynamicValue(thread)) ? $el_partition_mt_override$.getDynamicValue(thread) : cycl_utilities.formula_arg1(ist_formula, UNPROVIDED);
        final SubLObject formula = cycl_utilities.formula_arg2(ist_formula, UNPROVIDED);
        final SubLObject direction = (NIL != $el_partition_direction_override$.getDynamicValue(thread)) ? $el_partition_direction_override$.getDynamicValue(thread) : assertions_high.assertion_direction(assertion);
        final SubLObject strength = assertions_high.assertion_strength(assertion);
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_level$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            $print_length$.bind(NIL, thread);
            $print_level$.bind(NIL, thread);
            transcript_data_sink_form_prologue(stream);
            format(stream, $str216$_FI_ASSERT___S___S___S___S_, new SubLObject[]{ encapsulation.encapsulate(formula), encapsulation.encapsulate(elmt), strength, direction });
            transcript_data_sink_form_epilogue(stream);
        } finally {
            $print_level$.rebind(_prev_bind_3, thread);
            $print_length$.rebind(_prev_bind_2, thread);
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        transcript_data_sink_tip_assertion_timestamp(sink, assertion);
        return sink;
    }

    public static SubLObject transcript_data_sink_tip_assertion_reassert(final SubLObject sink, final SubLObject assertion, SubLObject new_strength, SubLObject new_direction) {
        if (new_strength == UNPROVIDED) {
            new_strength = NIL;
        }
        if (new_direction == UNPROVIDED) {
            new_direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject ist_formula = canon_tl.assertion_tl_ist_formula(assertion);
        final SubLObject elmt = (NIL != $el_partition_mt_override$.getDynamicValue(thread)) ? $el_partition_mt_override$.getDynamicValue(thread) : cycl_utilities.formula_arg1(ist_formula, UNPROVIDED);
        final SubLObject direction = (NIL != $el_partition_direction_override$.getDynamicValue(thread)) ? $el_partition_direction_override$.getDynamicValue(thread) : NIL != new_direction ? new_direction : assertions_high.assertion_direction(assertion);
        final SubLObject strength = (NIL != new_strength) ? new_strength : assertions_high.assertion_strength(assertion);
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_level$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            $print_length$.bind(NIL, thread);
            $print_level$.bind(NIL, thread);
            transcript_data_sink_form_prologue(stream);
            format(stream, $str217$_FI_REASSERT___S___S___S___S_, new SubLObject[]{ encapsulation.encapsulate(ist_formula), encapsulation.encapsulate(elmt), strength, direction });
            transcript_data_sink_form_epilogue(stream);
        } finally {
            $print_level$.rebind(_prev_bind_3, thread);
            $print_length$.rebind(_prev_bind_2, thread);
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        transcript_data_sink_tip_assertion_timestamp(sink, assertion);
        return sink;
    }

    public static SubLObject transcript_data_sink_tip_constant_timestamp(final SubLObject sink, final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject creator = transcript_data_sink_clean_fort(NIL != $el_partition_creator_override$.getDynamicValue(thread) ? $el_partition_creator_override$.getDynamicValue(thread) : bookkeeping_store.creator(constant, UNPROVIDED));
        final SubLObject time = bookkeeping_store.creation_time(constant, UNPROVIDED);
        final SubLObject purpose = transcript_data_sink_clean_fort(NIL != $el_partition_creation_purpose_override$.getDynamicValue(thread) ? $el_partition_creation_purpose_override$.getDynamicValue(thread) : bookkeeping_store.creation_purpose(constant, UNPROVIDED));
        final SubLObject second = bookkeeping_store.creation_second(constant, UNPROVIDED);
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_level$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            $print_length$.bind(NIL, thread);
            $print_level$.bind(NIL, thread);
            transcript_data_sink_form_prologue(stream);
            format(stream, $str218$_FI_TIMESTAMP_CONSTANT___S___S___, new SubLObject[]{ encapsulation.encapsulate(creator), encapsulation.encapsulate(time), encapsulation.encapsulate(purpose), encapsulation.encapsulate(second) });
        } finally {
            $print_level$.rebind(_prev_bind_3, thread);
            $print_length$.rebind(_prev_bind_2, thread);
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        transcript_data_sink_form_epilogue(stream);
        return sink;
    }

    public static SubLObject transcript_data_sink_tip_assertion_timestamp(final SubLObject sink, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject creator = transcript_data_sink_clean_fort(NIL != $el_partition_creator_override$.getDynamicValue(thread) ? $el_partition_creator_override$.getDynamicValue(thread) : assertions_high.asserted_by(assertion));
        final SubLObject time = assertions_high.asserted_when(assertion);
        final SubLObject purpose = transcript_data_sink_clean_fort(NIL != $el_partition_creation_purpose_override$.getDynamicValue(thread) ? $el_partition_creation_purpose_override$.getDynamicValue(thread) : assertions_high.asserted_why(assertion));
        final SubLObject second = assertions_high.asserted_second(assertion);
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_level$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            $print_length$.bind(NIL, thread);
            $print_level$.bind(NIL, thread);
            transcript_data_sink_form_prologue(stream);
            format(stream, $str219$_FI_TIMESTAMP_ASSERTION___S___S__, new SubLObject[]{ encapsulation.encapsulate(creator), encapsulation.encapsulate(time), encapsulation.encapsulate(purpose), encapsulation.encapsulate(second) });
            transcript_data_sink_form_epilogue(stream);
        } finally {
            $print_level$.rebind(_prev_bind_3, thread);
            $print_length$.rebind(_prev_bind_2, thread);
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        return sink;
    }

    public static SubLObject transcript_data_sink_clean_fort(final SubLObject v_object) {
        return NIL != forts.valid_fortP(v_object) ? v_object : NIL;
    }

    public static SubLObject transcript_data_sink_form_prologue(final SubLObject stream) {
        fresh_line(stream);
        write_string($str221$_, stream, UNPROVIDED, UNPROVIDED);
        prin1($transcript_marker_guest_cyclist$.getGlobalValue(), stream);
        write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
        prin1(cyc_image_id(), stream);
        write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
        prin1(numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), stream);
        write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
        return stream;
    }

    public static SubLObject transcript_data_sink_form_epilogue(final SubLObject stream) {
        write_string($str222$_, stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        return stream;
    }

    public static SubLObject new_debug_el_partition_data_sink(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return new_el_partition_data_sink(stream, DEBUG_DATA_SINK_BRANCH_CONSTANT_DELETE, DEBUG_DATA_SINK_BRANCH_ASSERTION_DELETE, DEBUG_DATA_SINK_TIP_CONSTANT_CREATE, DEBUG_DATA_SINK_TIP_ASSERTION_CREATE, DEBUG_DATA_SINK_TIP_ASSERTION_REASSERT);
    }

    public static SubLObject debug_data_sink_branch_constant_delete(final SubLObject sink, final SubLObject name, final SubLObject guid) {
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        format(stream, $str228$___kill__A__A__, name, guid);
        return sink;
    }

    public static SubLObject debug_data_sink_branch_assertion_delete(final SubLObject sink, final SubLObject tl_ist_formula) {
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        format(stream, $str229$___unassert__A__, tl_ist_formula);
        return sink;
    }

    public static SubLObject debug_data_sink_tip_constant_create(final SubLObject sink, final SubLObject constant) {
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject name = constants_high.constant_name(constant);
        final SubLObject guid = constants_high.constant_external_id(constant);
        format(stream, $str230$___create__A__A__, name, guid);
        return sink;
    }

    public static SubLObject debug_data_sink_tip_assertion_create(final SubLObject sink, final SubLObject assertion) {
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject ist_formula = uncanonicalizer.assertion_el_ist_formula(assertion);
        format(stream, $str231$___assert__A__, ist_formula);
        return sink;
    }

    public static SubLObject debug_data_sink_tip_assertion_reassert(final SubLObject sink, final SubLObject assertion, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = NIL;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLObject stream = get_el_partition_data_sink_state(sink);
        final SubLObject ist_formula = uncanonicalizer.assertion_el_ist_formula(assertion);
        format(stream, $str232$___reassert__A__A__A__, new SubLObject[]{ ist_formula, strength, direction });
        return sink;
    }

    public static SubLObject declare_el_partitions_file() {
        declareMacro("with_pickling_stream_buffer_size", "WITH-PICKLING-STREAM-BUFFER-SIZE");
        declareMacro("with_pickling_pacficiation", "WITH-PICKLING-PACFICIATION");
        declareFunction("el_partition_relevant_constantP", "EL-PARTITION-RELEVANT-CONSTANT?", 1, 0, false);
        declareFunction("el_partition_relevant_assertionP", "EL-PARTITION-RELEVANT-ASSERTION?", 1, 0, false);
        declareFunction("pickle_constants", "PICKLE-CONSTANTS", 1, 0, false);
        declareMacro("do_pickled_constants", "DO-PICKLED-CONSTANTS");
        declareFunction("pickle_assertions", "PICKLE-ASSERTIONS", 1, 0, false);
        declareFunction("pickling_index_filename", "PICKLING-INDEX-FILENAME", 1, 0, false);
        declareFunction("pickling_data_filename", "PICKLING-DATA-FILENAME", 1, 0, false);
        declareFunction("assertion_to_pickling_format", "ASSERTION-TO-PICKLING-FORMAT", 1, 0, false);
        declareFunction("unpickle_assertion_pickling_format", "UNPICKLE-ASSERTION-PICKLING-FORMAT", 1, 0, false);
        declareFunction("convert_guid_to_pickling_format", "CONVERT-GUID-TO-PICKLING-FORMAT", 1, 0, false);
        declareFunction("pickled_guid_format_p", "PICKLED-GUID-FORMAT-P", 1, 0, false);
        declareFunction("restore_guid_from_pickling_format", "RESTORE-GUID-FROM-PICKLING-FORMAT", 1, 0, false);
        declareFunction("new_relevant_assertions_id_space", "NEW-RELEVANT-ASSERTIONS-ID-SPACE", 0, 1, false);
        declareFunction("compare_pickled_kb_to_current_kb", "COMPARE-PICKLED-KB-TO-CURRENT-KB", 3, 0, false);
        declareFunction("enumerate_additions_to_current_kb", "ENUMERATE-ADDITIONS-TO-CURRENT-KB", 1, 0, false);
        declareFunction("compare_pickled_kb_to_current_kb_constants", "COMPARE-PICKLED-KB-TO-CURRENT-KB-CONSTANTS", 2, 0, false);
        declareMacro("update_as_iteration_state", "UPDATE-AS-ITERATION-STATE");
        declareMacro("decrement_tip_index", "DECREMENT-TIP-INDEX");
        declareFunction("find_most_recent_assertion_shared_with_branch", "FIND-MOST-RECENT-ASSERTION-SHARED-WITH-BRANCH", 1, 0, false);
        declareFunction("compare_pickled_kb_to_current_kb_assertions", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS", 2, 0, false);
        declareFunction("compare_pickled_kb_to_current_kb_assertions_internal", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS-INTERNAL", 2, 1, false);
        declareFunction("compare_pickled_kb_to_current_kb_assertions_scan_forward_fast", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS-SCAN-FORWARD-FAST", 2, 1, false);
        declareFunction("compare_pickled_kb_to_current_kb_assertions_scan_forward_steady", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS-SCAN-FORWARD-STEADY", 2, 1, false);
        declareFunction("compare_pickled_kb_to_current_kb_assertions_novel_forward", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS-NOVEL-FORWARD", 2, 1, false);
        declareFunction("compare_pickled_kb_to_current_kb_assertions_classic_backward", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS-CLASSIC-BACKWARD", 2, 1, false);
        declareFunction("enumerate_tip_assertions_from_current_kb", "ENUMERATE-TIP-ASSERTIONS-FROM-CURRENT-KB", 2, 0, false);
        declareFunction("enumerate_branch_assertions_absent_from_current_kb", "ENUMERATE-BRANCH-ASSERTIONS-ABSENT-FROM-CURRENT-KB", 3, 0, false);
        declareFunction("elpart_as_desc_print_function_trampoline", "ELPART-AS-DESC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("elpart_as_desc_p", "ELPART-AS-DESC-P", 1, 0, false);
        new el_partitions.$elpart_as_desc_p$UnaryFunction();
        declareFunction("elpart_as_desc_id", "ELPART-AS-DESC-ID", 1, 0, false);
        declareFunction("elpart_as_desc_tl_ist_formula", "ELPART-AS-DESC-TL-IST-FORMULA", 1, 0, false);
        declareFunction("elpart_as_desc_hash", "ELPART-AS-DESC-HASH", 1, 0, false);
        declareFunction("elpart_as_desc_extra", "ELPART-AS-DESC-EXTRA", 1, 0, false);
        declareFunction("elpart_as_desc_weak_ist_formula", "ELPART-AS-DESC-WEAK-IST-FORMULA", 1, 0, false);
        declareFunction("_csetf_elpart_as_desc_id", "_CSETF-ELPART-AS-DESC-ID", 2, 0, false);
        declareFunction("_csetf_elpart_as_desc_tl_ist_formula", "_CSETF-ELPART-AS-DESC-TL-IST-FORMULA", 2, 0, false);
        declareFunction("_csetf_elpart_as_desc_hash", "_CSETF-ELPART-AS-DESC-HASH", 2, 0, false);
        declareFunction("_csetf_elpart_as_desc_extra", "_CSETF-ELPART-AS-DESC-EXTRA", 2, 0, false);
        declareFunction("_csetf_elpart_as_desc_weak_ist_formula", "_CSETF-ELPART-AS-DESC-WEAK-IST-FORMULA", 2, 0, false);
        declareFunction("make_elpart_as_desc", "MAKE-ELPART-AS-DESC", 0, 1, false);
        declareFunction("visit_defstruct_elpart_as_desc", "VISIT-DEFSTRUCT-ELPART-AS-DESC", 2, 0, false);
        declareFunction("visit_defstruct_object_elpart_as_desc_method", "VISIT-DEFSTRUCT-OBJECT-ELPART-AS-DESC-METHOD", 2, 0, false);
        declareFunction("print_elpart_as_desc", "PRINT-ELPART-AS-DESC", 3, 0, false);
        declareFunction("identify_branch_assertions_absent_from_current_kb", "IDENTIFY-BRANCH-ASSERTIONS-ABSENT-FROM-CURRENT-KB", 2, 0, false);
        declareFunction("identify_branch_assertions_absent_from_current_kb_int", "IDENTIFY-BRANCH-ASSERTIONS-ABSENT-FROM-CURRENT-KB-INT", 2, 0, false);
        declareFunction("find_start_of_el_partition_relevant_assertions", "FIND-START-OF-EL-PARTITION-RELEVANT-ASSERTIONS", 1, 0, false);
        declareFunction("fetch_branch_limit_information_for_pickled_kb", "FETCH-BRANCH-LIMIT-INFORMATION-FOR-PICKLED-KB", 1, 0, false);
        declareFunction("enumerate_branch_assertions_missing_from_current_kb", "ENUMERATE-BRANCH-ASSERTIONS-MISSING-FROM-CURRENT-KB", 6, 0, false);
        declareFunction("same_elpart_as_descP", "SAME-ELPART-AS-DESC?", 2, 0, false);
        declareFunction("enummiss_find_previous_relevant_assertion", "ENUMMISS-FIND-PREVIOUS-RELEVANT-ASSERTION", 1, 0, false);
        declareFunction("enummiss_find_next_relevant_assertion", "ENUMMISS-FIND-NEXT-RELEVANT-ASSERTION", 1, 0, false);
        declareFunction("enummiss_fetch_specific_assertion_information", "ENUMMISS-FETCH-SPECIFIC-ASSERTION-INFORMATION", 3, 0, false);
        declareFunction("enummiss_compute_specific_assertion_information", "ENUMMISS-COMPUTE-SPECIFIC-ASSERTION-INFORMATION", 2, 0, false);
        declareFunction("enummiss_clear_specific_assertion_information", "ENUMMISS-CLEAR-SPECIFIC-ASSERTION-INFORMATION", 1, 0, false);
        declareFunction("enummiss_compute_weakened_ist_formula", "ENUMMISS-COMPUTE-WEAKENED-IST-FORMULA", 1, 0, false);
        declareFunction("enummiss_tl_hp_notation", "ENUMMISS-TL-HP-NOTATION", 1, 0, false);
        declareFunction("enumerate_missing_assertions_before_shared", "ENUMERATE-MISSING-ASSERTIONS-BEFORE-SHARED", 3, 0, false);
        declareFunction("scan_enumerate_branch_assertions_missing_from_current_kb", "SCAN-ENUMERATE-BRANCH-ASSERTIONS-MISSING-FROM-CURRENT-KB", 2, 1, false);
        declareFunction("scan_enummiss_load_branch_assertion", "SCAN-ENUMMISS-LOAD-BRANCH-ASSERTION", 4, 0, false);
        declareFunction("scan_enummiss_corresponding_relevant_tip_assertion", "SCAN-ENUMMISS-CORRESPONDING-RELEVANT-TIP-ASSERTION", 4, 0, false);
        declareFunction("scan_enummiss_corresponding_tip_assertion", "SCAN-ENUMMISS-CORRESPONDING-TIP-ASSERTION", 4, 0, false);
        declareFunction("scan_enummiss_load_tip_assertion", "SCAN-ENUMMISS-LOAD-TIP-ASSERTION", 3, 0, false);
        declareFunction("scan_enummiss_classify_situation", "SCAN-ENUMMISS-CLASSIFY-SITUATION", 2, 0, false);
        declareFunction("test_helper_get_assertion", "TEST-HELPER-GET-ASSERTION", 2, 0, false);
        declareFunction("test_helper_classify_situation", "TEST-HELPER-CLASSIFY-SITUATION", 2, 0, false);
        declareFunction("test_el_partition_simple_scan_algorithm", "TEST-EL-PARTITION-SIMPLE-SCAN-ALGORITHM", 2, 0, false);
        declareFunction("generate_el_partition_simple_scan_case", "GENERATE-EL-PARTITION-SIMPLE-SCAN-CASE", 3, 0, false);
        declareFunction("test_random_el_partition_simple_scan_cases", "TEST-RANDOM-EL-PARTITION-SIMPLE-SCAN-CASES", 4, 0, false);
        declareFunction("el_partition_data_sink_print_function_trampoline", "EL-PARTITION-DATA-SINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("el_partition_data_sink_p", "EL-PARTITION-DATA-SINK-P", 1, 0, false);
        new el_partitions.$el_partition_data_sink_p$UnaryFunction();
        declareFunction("elpart_dsink_state", "ELPART-DSINK-STATE", 1, 0, false);
        declareFunction("elpart_dsink_branch_cdel_fn", "ELPART-DSINK-BRANCH-CDEL-FN", 1, 0, false);
        declareFunction("elpart_dsink_branch_asdel_fn", "ELPART-DSINK-BRANCH-ASDEL-FN", 1, 0, false);
        declareFunction("elpart_dsink_tip_ccreate_fn", "ELPART-DSINK-TIP-CCREATE-FN", 1, 0, false);
        declareFunction("elpart_dsink_tip_ascreate_fn", "ELPART-DSINK-TIP-ASCREATE-FN", 1, 0, false);
        declareFunction("elpart_dsink_tip_asreassert_fn", "ELPART-DSINK-TIP-ASREASSERT-FN", 1, 0, false);
        declareFunction("_csetf_elpart_dsink_state", "_CSETF-ELPART-DSINK-STATE", 2, 0, false);
        declareFunction("_csetf_elpart_dsink_branch_cdel_fn", "_CSETF-ELPART-DSINK-BRANCH-CDEL-FN", 2, 0, false);
        declareFunction("_csetf_elpart_dsink_branch_asdel_fn", "_CSETF-ELPART-DSINK-BRANCH-ASDEL-FN", 2, 0, false);
        declareFunction("_csetf_elpart_dsink_tip_ccreate_fn", "_CSETF-ELPART-DSINK-TIP-CCREATE-FN", 2, 0, false);
        declareFunction("_csetf_elpart_dsink_tip_ascreate_fn", "_CSETF-ELPART-DSINK-TIP-ASCREATE-FN", 2, 0, false);
        declareFunction("_csetf_elpart_dsink_tip_asreassert_fn", "_CSETF-ELPART-DSINK-TIP-ASREASSERT-FN", 2, 0, false);
        declareFunction("make_el_partition_data_sink", "MAKE-EL-PARTITION-DATA-SINK", 0, 1, false);
        declareFunction("visit_defstruct_el_partition_data_sink", "VISIT-DEFSTRUCT-EL-PARTITION-DATA-SINK", 2, 0, false);
        declareFunction("visit_defstruct_object_el_partition_data_sink_method", "VISIT-DEFSTRUCT-OBJECT-EL-PARTITION-DATA-SINK-METHOD", 2, 0, false);
        declareFunction("new_el_partition_data_sink", "NEW-EL-PARTITION-DATA-SINK", 6, 0, false);
        declareFunction("note_el_partition_branch_constant_delete", "NOTE-EL-PARTITION-BRANCH-CONSTANT-DELETE", 3, 0, false);
        declareFunction("note_el_partition_branch_assertion_delete", "NOTE-EL-PARTITION-BRANCH-ASSERTION-DELETE", 2, 0, false);
        declareFunction("note_el_partition_tip_constant_create", "NOTE-EL-PARTITION-TIP-CONSTANT-CREATE", 2, 0, false);
        declareFunction("note_el_partition_tip_assertion_create", "NOTE-EL-PARTITION-TIP-ASSERTION-CREATE", 2, 0, false);
        declareFunction("note_el_partition_tip_assertion_reassert", "NOTE-EL-PARTITION-TIP-ASSERTION-REASSERT", 2, 2, false);
        declareFunction("get_el_partition_data_sink_state", "GET-EL-PARTITION-DATA-SINK-STATE", 1, 0, false);
        declareMacro("with_el_partition_creator", "WITH-EL-PARTITION-CREATOR");
        declareMacro("with_el_partition_creation_purpose", "WITH-EL-PARTITION-CREATION-PURPOSE");
        declareMacro("with_el_partition_mt", "WITH-EL-PARTITION-MT");
        declareMacro("with_el_partition_direction", "WITH-EL-PARTITION-DIRECTION");
        declareMacro("without_el_partition_creation_purpose", "WITHOUT-EL-PARTITION-CREATION-PURPOSE");
        declareFunction("new_transcript_el_partition_data_sink", "NEW-TRANSCRIPT-EL-PARTITION-DATA-SINK", 1, 0, false);
        declareFunction("transcript_data_sink_branch_constant_delete", "TRANSCRIPT-DATA-SINK-BRANCH-CONSTANT-DELETE", 3, 0, false);
        declareFunction("transcript_data_sink_branch_assertion_delete", "TRANSCRIPT-DATA-SINK-BRANCH-ASSERTION-DELETE", 2, 0, false);
        declareFunction("transcript_data_sink_tip_constant_create", "TRANSCRIPT-DATA-SINK-TIP-CONSTANT-CREATE", 2, 0, false);
        declareFunction("transcript_data_sink_tip_assertion_create", "TRANSCRIPT-DATA-SINK-TIP-ASSERTION-CREATE", 2, 0, false);
        declareFunction("transcript_data_sink_tip_assertion_reassert", "TRANSCRIPT-DATA-SINK-TIP-ASSERTION-REASSERT", 2, 2, false);
        declareFunction("transcript_data_sink_tip_constant_timestamp", "TRANSCRIPT-DATA-SINK-TIP-CONSTANT-TIMESTAMP", 2, 0, false);
        declareFunction("transcript_data_sink_tip_assertion_timestamp", "TRANSCRIPT-DATA-SINK-TIP-ASSERTION-TIMESTAMP", 2, 0, false);
        declareFunction("transcript_data_sink_clean_fort", "TRANSCRIPT-DATA-SINK-CLEAN-FORT", 1, 0, false);
        declareFunction("transcript_data_sink_form_prologue", "TRANSCRIPT-DATA-SINK-FORM-PROLOGUE", 1, 0, false);
        declareFunction("transcript_data_sink_form_epilogue", "TRANSCRIPT-DATA-SINK-FORM-EPILOGUE", 1, 0, false);
        declareFunction("new_debug_el_partition_data_sink", "NEW-DEBUG-EL-PARTITION-DATA-SINK", 0, 1, false);
        declareFunction("debug_data_sink_branch_constant_delete", "DEBUG-DATA-SINK-BRANCH-CONSTANT-DELETE", 3, 0, false);
        declareFunction("debug_data_sink_branch_assertion_delete", "DEBUG-DATA-SINK-BRANCH-ASSERTION-DELETE", 2, 0, false);
        declareFunction("debug_data_sink_tip_constant_create", "DEBUG-DATA-SINK-TIP-CONSTANT-CREATE", 2, 0, false);
        declareFunction("debug_data_sink_tip_assertion_create", "DEBUG-DATA-SINK-TIP-ASSERTION-CREATE", 2, 0, false);
        declareFunction("debug_data_sink_tip_assertion_reassert", "DEBUG-DATA-SINK-TIP-ASSERTION-REASSERT", 2, 2, false);
        return NIL;
    }

    public static SubLObject init_el_partitions_file() {
        deflexical("*DEFAULT-PICKLING-STREAM-BUFFER-SIZE*", multiply(FOUR_INTEGER, $int$1024, $int$1024));
        defparameter("*PICKLING-STREAM-BUFFER-SIZE*", $default_pickling_stream_buffer_size$.getGlobalValue());
        deflexical("*PICKLED-KB-COMPARISON-STRATEGY*", $SCAN_FORWARD_STEADY);
        defconstant("*DTP-ELPART-AS-DESC*", ELPART_AS_DESC);
        deflexical("*DEBUG-SCAN-ENUMERATE?*", NIL);
        defconstant("*DTP-EL-PARTITION-DATA-SINK*", EL_PARTITION_DATA_SINK);
        defparameter("*EL-PARTITION-CREATOR-OVERRIDE*", NIL);
        defparameter("*EL-PARTITION-CREATION-PURPOSE-OVERRIDE*", NIL);
        defparameter("*EL-PARTITION-MT-OVERRIDE*", NIL);
        defparameter("*EL-PARTITION-DIRECTION-OVERRIDE*", NIL);
        deflexical("*TRANSCRIPT-MARKER-GUEST-CYCLIST*", $list220);
        return NIL;
    }

    public static SubLObject setup_el_partitions_file() {
        register_external_symbol(PICKLE_CONSTANTS);
        register_external_symbol(DO_PICKLED_CONSTANTS);
        register_external_symbol(PICKLE_ASSERTIONS);
        register_external_symbol(ASSERTION_TO_PICKLING_FORMAT);
        register_external_symbol(UNPICKLE_ASSERTION_PICKLING_FORMAT);
        register_external_symbol(NEW_RELEVANT_ASSERTIONS_ID_SPACE);
        register_external_symbol(COMPARE_PICKLED_KB_TO_CURRENT_KB);
        register_external_symbol(ENUMERATE_ADDITIONS_TO_CURRENT_KB);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_elpart_as_desc$.getGlobalValue(), symbol_function(ELPART_AS_DESC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list105);
        def_csetf(ELPART_AS_DESC_ID, _CSETF_ELPART_AS_DESC_ID);
        def_csetf(ELPART_AS_DESC_TL_IST_FORMULA, _CSETF_ELPART_AS_DESC_TL_IST_FORMULA);
        def_csetf(ELPART_AS_DESC_HASH, _CSETF_ELPART_AS_DESC_HASH);
        def_csetf(ELPART_AS_DESC_EXTRA, _CSETF_ELPART_AS_DESC_EXTRA);
        def_csetf(ELPART_AS_DESC_WEAK_IST_FORMULA, _CSETF_ELPART_AS_DESC_WEAK_IST_FORMULA);
        identity(ELPART_AS_DESC);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_elpart_as_desc$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ELPART_AS_DESC_METHOD));
        define_test_case_table_int(TEST_EL_PARTITION_SIMPLE_SCAN_ALGORITHM, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list157);
        define_test_case_table_int(TEST_RANDOM_EL_PARTITION_SIMPLE_SCAN_CASES, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list163);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_el_partition_data_sink$.getGlobalValue(), symbol_function(EL_PARTITION_DATA_SINK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list173);
        def_csetf(ELPART_DSINK_STATE, _CSETF_ELPART_DSINK_STATE);
        def_csetf(ELPART_DSINK_BRANCH_CDEL_FN, _CSETF_ELPART_DSINK_BRANCH_CDEL_FN);
        def_csetf(ELPART_DSINK_BRANCH_ASDEL_FN, _CSETF_ELPART_DSINK_BRANCH_ASDEL_FN);
        def_csetf(ELPART_DSINK_TIP_CCREATE_FN, _CSETF_ELPART_DSINK_TIP_CCREATE_FN);
        def_csetf(ELPART_DSINK_TIP_ASCREATE_FN, _CSETF_ELPART_DSINK_TIP_ASCREATE_FN);
        def_csetf(ELPART_DSINK_TIP_ASREASSERT_FN, _CSETF_ELPART_DSINK_TIP_ASREASSERT_FN);
        identity(EL_PARTITION_DATA_SINK);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_el_partition_data_sink$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_EL_PARTITION_DATA_SINK_METHOD));
        register_external_symbol(NOTE_EL_PARTITION_BRANCH_CONSTANT_DELETE);
        register_external_symbol(NOTE_EL_PARTITION_BRANCH_ASSERTION_DELETE);
        register_external_symbol(NOTE_EL_PARTITION_TIP_CONSTANT_CREATE);
        register_external_symbol(NOTE_EL_PARTITION_TIP_ASSERTION_CREATE);
        register_external_symbol(NOTE_EL_PARTITION_TIP_ASSERTION_REASSERT);
        return NIL;
    }

    private static SubLObject _constant_157_initializer() {
        return list(new SubLObject[]{ list(list(vector(new SubLObject[]{ makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E") }), vector(new SubLObject[]{ makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E") })), NIL), list(list(vector(new SubLObject[]{ makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D") }), vector(new SubLObject[]{ makeSymbol("A"), makeSymbol("D") })), list(list(makeKeyword("DELETE"), makeSymbol("B")), list(makeKeyword("DELETE"), makeSymbol("C")))), list(list(vector(new SubLObject[]{ makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E") }), vector(new SubLObject[]{ makeSymbol("B"), makeSymbol("C"), makeSymbol("D") })), list(list(makeKeyword("DELETE"), makeSymbol("A")), list(makeKeyword("DELETE"), makeSymbol("E")))), list(list(vector(new SubLObject[]{ makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E") }), vector(new SubLObject[]{ makeSymbol("B"), makeSymbol("C"), makeSymbol("E"), makeSymbol("F"), makeSymbol("G") })), list(list(makeKeyword("DELETE"), makeSymbol("A")), list(makeKeyword("DELETE"), makeSymbol("D")), list(makeKeyword("CREATE"), makeSymbol("F")), list(makeKeyword("CREATE"), makeSymbol("G")))), list(list(vector(new SubLObject[]{ makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E") }), vector(new SubLObject[]{ makeSymbol("F"), makeSymbol("G"), makeSymbol("H"), makeSymbol("I"), makeSymbol("J") })), list(new SubLObject[]{ list(makeKeyword("DELETE"), makeSymbol("A")), list(makeKeyword("DELETE"), makeSymbol("B")), list(makeKeyword("DELETE"), makeSymbol("C")), list(makeKeyword("DELETE"), makeSymbol("D")), list(makeKeyword("DELETE"), makeSymbol("E")), list(makeKeyword("CREATE"), makeSymbol("F")), list(makeKeyword("CREATE"), makeSymbol("G")), list(makeKeyword("CREATE"), makeSymbol("H")), list(makeKeyword("CREATE"), makeSymbol("I")), list(makeKeyword("CREATE"), makeSymbol("J")) })), list(list(vector(new SubLObject[]{ makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("D"), makeSymbol("E"), makeSymbol("F"), makeSymbol("G"), makeSymbol("H"), makeSymbol("I"), makeSymbol("J"), makeSymbol("K"), makeSymbol("L"), makeSymbol("M"), makeSymbol("N") }), vector(new SubLObject[]{ makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), makeSymbol("H"), makeSymbol("I"), makeSymbol("J"), makeSymbol("K"), makeSymbol("L"), makeSymbol("M"), makeSymbol("N") })), list(list(makeKeyword("DELETE"), makeSymbol("D")), list(makeKeyword("DELETE"), makeSymbol("E")), list(makeKeyword("DELETE"), makeSymbol("F")), list(makeKeyword("DELETE"), makeSymbol("G")))), list(list(vector(new SubLObject[]{ ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger(21), makeInteger(22), makeInteger(23), makeInteger(24), makeInteger(25), makeInteger(26), makeInteger(27), makeInteger(28), makeInteger(29) }), vector(new SubLObject[]{ ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger(21), makeInteger(22), makeInteger(23), makeInteger(24), makeInteger(26), makeInteger(27), makeInteger(28), makeInteger(29), makeInteger(30), makeInteger(31), makeInteger(32) })), list(list(makeKeyword("DELETE"), FOUR_INTEGER), list(makeKeyword("DELETE"), NINE_INTEGER), list(makeKeyword("DELETE"), SIXTEEN_INTEGER), list(makeKeyword("DELETE"), makeInteger(25)), list(makeKeyword("CREATE"), makeInteger(30)), list(makeKeyword("CREATE"), makeInteger(31)), list(makeKeyword("CREATE"), makeInteger(32)))), list(list(vector(new SubLObject[]{ ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger(21), makeInteger(22), makeInteger(23), makeInteger(24), makeInteger(25), makeInteger(26), makeInteger(27), makeInteger(28), makeInteger(29) }), vector(new SubLObject[]{ ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger(21), makeInteger(22), makeInteger(23), makeInteger(24), makeInteger(25), makeInteger(26), makeInteger(27), makeInteger(28) })), list(list(makeKeyword("DELETE"), makeInteger(29)))), list(list(vector(new SubLObject[]{ ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger(21), makeInteger(22), makeInteger(23), makeInteger(24), makeInteger(25), makeInteger(26), makeInteger(27), makeInteger(28), makeInteger(29), makeInteger(30), makeInteger(31), makeInteger(32), makeInteger(33), makeInteger(34), makeInteger(35), makeInteger(36), makeInteger(37), makeInteger(38), makeInteger(39) }), vector(new SubLObject[]{ ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger(21), makeInteger(22), makeInteger(23), makeInteger(24), makeInteger(25), makeInteger(26), makeInteger(27), makeInteger(28), makeInteger(29), makeInteger(30), makeInteger(31), makeInteger(32), makeInteger(33), makeInteger(34), makeInteger(35), makeInteger(36), makeInteger(37), makeInteger(38), makeInteger(40) })), list(list(makeKeyword("DELETE"), makeInteger(39)), list(makeKeyword("CREATE"), makeInteger(40)))) });
    }

    @Override
    public void declareFunctions() {
        declare_el_partitions_file();
    }

    @Override
    public void initializeVariables() {
        init_el_partitions_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_el_partitions_file();
    }

    

    public static final class $elpart_as_desc_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $tl_ist_formula;

        public SubLObject $hash;

        public SubLObject $extra;

        public SubLObject $weak_ist_formula;

        private static final SubLStructDeclNative structDecl;

        private $elpart_as_desc_native() {
            this.$id = Lisp.NIL;
            this.$tl_ist_formula = Lisp.NIL;
            this.$hash = Lisp.NIL;
            this.$extra = Lisp.NIL;
            this.$weak_ist_formula = Lisp.NIL;
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
        public SubLObject getField3() {
            return this.$tl_ist_formula;
        }

        @Override
        public SubLObject getField4() {
            return this.$hash;
        }

        @Override
        public SubLObject getField5() {
            return this.$extra;
        }

        @Override
        public SubLObject getField6() {
            return this.$weak_ist_formula;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$tl_ist_formula = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$hash = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$extra = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$weak_ist_formula = value;
        }

        static {
            structDecl = makeStructDeclNative($elpart_as_desc_native.class, ELPART_AS_DESC, ELPART_AS_DESC_P, $list99, $list100, new String[]{ "$id", "$tl_ist_formula", "$hash", "$extra", "$weak_ist_formula" }, $list101, $list102, PRINT_ELPART_AS_DESC);
        }
    }

    public static final class $elpart_as_desc_p$UnaryFunction extends UnaryFunction {
        public $elpart_as_desc_p$UnaryFunction() {
            super(extractFunctionNamed("ELPART-AS-DESC-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return elpart_as_desc_p(arg1);
        }
    }

    public static final class $el_partition_data_sink_native extends SubLStructNative {
        public SubLObject $state;

        public SubLObject $branch_cdel_fn;

        public SubLObject $branch_asdel_fn;

        public SubLObject $tip_ccreate_fn;

        public SubLObject $tip_ascreate_fn;

        public SubLObject $tip_asreassert_fn;

        private static final SubLStructDeclNative structDecl;

        private $el_partition_data_sink_native() {
            this.$state = Lisp.NIL;
            this.$branch_cdel_fn = Lisp.NIL;
            this.$branch_asdel_fn = Lisp.NIL;
            this.$tip_ccreate_fn = Lisp.NIL;
            this.$tip_ascreate_fn = Lisp.NIL;
            this.$tip_asreassert_fn = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$state;
        }

        @Override
        public SubLObject getField3() {
            return this.$branch_cdel_fn;
        }

        @Override
        public SubLObject getField4() {
            return this.$branch_asdel_fn;
        }

        @Override
        public SubLObject getField5() {
            return this.$tip_ccreate_fn;
        }

        @Override
        public SubLObject getField6() {
            return this.$tip_ascreate_fn;
        }

        @Override
        public SubLObject getField7() {
            return this.$tip_asreassert_fn;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$state = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$branch_cdel_fn = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$branch_asdel_fn = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$tip_ccreate_fn = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$tip_ascreate_fn = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$tip_asreassert_fn = value;
        }

        static {
            structDecl = makeStructDeclNative($el_partition_data_sink_native.class, EL_PARTITION_DATA_SINK, EL_PARTITION_DATA_SINK_P, $list167, $list168, new String[]{ "$state", "$branch_cdel_fn", "$branch_asdel_fn", "$tip_ccreate_fn", "$tip_ascreate_fn", "$tip_asreassert_fn" }, $list169, $list170, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $el_partition_data_sink_p$UnaryFunction extends UnaryFunction {
        public $el_partition_data_sink_p$UnaryFunction() {
            super(extractFunctionNamed("EL-PARTITION-DATA-SINK-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return el_partition_data_sink_p(arg1);
        }
    }
}

/**
 * Total time: 2248 ms
 */
