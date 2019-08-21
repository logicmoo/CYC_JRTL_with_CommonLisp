package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class el_partitions
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.el_partitions";
  public static final String myFingerPrint = "dd5356a0ed437d6abb178de9da8071b2d38625c576c60b83444be2875200cb17";
  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 993L)
  public static SubLSymbol $default_pickling_stream_buffer_size$;
  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 2710L)
  public static SubLSymbol $pickling_stream_buffer_size$;
  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 29320L)
  public static SubLSymbol $pickled_kb_comparison_strategy$;
  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
  public static SubLSymbol $dtp_elpart_as_desc$;
  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 56636L)
  private static SubLSymbol $debug_scan_enumerateP$;
  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLSymbol $dtp_el_partition_data_sink$;
  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 75138L)
  public static SubLSymbol $el_partition_creator_override$;
  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 75343L)
  public static SubLSymbol $el_partition_creation_purpose_override$;
  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 75489L)
  public static SubLSymbol $el_partition_mt_override$;
  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 75619L)
  public static SubLSymbol $el_partition_direction_override$;
  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 85181L)
  private static SubLSymbol $transcript_marker_guest_cyclist$;
  private static final SubLInteger $int0$1024;
  private static final SubLSymbol $sym1$WITH_STREAM_BUFFER_SIZE;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$CURR;
  private static final SubLSymbol $sym5$CLET;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$NOTING_PERCENT_PROGRESS;
  private static final SubLSymbol $sym8$PROGN;
  private static final SubLSymbol $sym9$CINC;
  private static final SubLSymbol $sym10$NOTE_PERCENT_PROGRESS;
  private static final SubLSymbol $sym11$HL_PROTOTYPICAL_INSTANCE_;
  private static final SubLSymbol $sym12$PICKLE_CONSTANTS;
  private static final SubLString $str13$Pickling_constants_to_;
  private static final SubLString $str14$_____;
  private static final SubLSymbol $kw15$OUTPUT;
  private static final SubLString $str16$Unable_to_open__S;
  private static final SubLSymbol $sym17$STRINGP;
  private static final SubLSymbol $kw18$SKIP;
  private static final SubLSymbol $sym19$DO_PICKLED_CONSTANTS;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLSymbol $kw22$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw23$MESSAGE;
  private static final SubLSymbol $sym24$STREAM;
  private static final SubLSymbol $sym25$COUNT;
  private static final SubLSymbol $sym26$MSG;
  private static final SubLSymbol $sym27$WITH_PICKLING_STREAM_BUFFER_SIZE;
  private static final SubLSymbol $sym28$WITH_PRIVATE_BINARY_FILE;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$CFASL_INPUT;
  private static final SubLSymbol $sym31$FIF;
  private static final SubLSymbol $sym32$NULL;
  private static final SubLSymbol $sym33$FORMAT_NIL;
  private static final SubLString $str34$Reading_pickled_constants_from__A;
  private static final SubLSymbol $sym35$WITH_PICKLING_PACFICIATION;
  private static final SubLSymbol $sym36$CDO;
  private static final SubLSymbol $sym37$MUST;
  private static final SubLSymbol $sym38$NON_NEGATIVE_INTEGER_P;
  private static final SubLString $str39$Read_invalid_SUID__A_from__A_;
  private static final SubLString $str40$Read_invalid_NAME__A_from__A_;
  private static final SubLSymbol $sym41$GUID_P;
  private static final SubLString $str42$Read_invalid_GUID__A_from__A_;
  private static final SubLSymbol $sym43$PICKLE_ASSERTIONS;
  private static final SubLString $str44$Pickling_assertions_to_file_vecto;
  private static final SubLString $str45$_index_cfasl;
  private static final SubLString $str46$_cfasl;
  private static final SubLSymbol $sym47$ASSERTION_TO_PICKLING_FORMAT;
  private static final SubLSymbol $sym48$CONVERT_GUID_TO_PICKLING_FORMAT;
  private static final SubLSymbol $sym49$UNPICKLE_ASSERTION_PICKLING_FORMAT;
  private static final SubLSymbol $sym50$PICKLED_GUID_FORMAT_P;
  private static final SubLSymbol $sym51$RESTORE_GUID_FROM_PICKLING_FORMAT;
  private static final SubLSymbol $kw52$GUID;
  private static final SubLList $list53;
  private static final SubLString $str54$Cannot_restore__A_____not_a_pickl;
  private static final SubLSymbol $sym55$NEW_RELEVANT_ASSERTIONS_ID_SPACE;
  private static final SubLString $str56$Computing_EL_Partition_relevant_a;
  private static final SubLString $str57$Whoa__we_underflowed_the_ID_space;
  private static final SubLSymbol $sym58$COMPARE_PICKLED_KB_TO_CURRENT_KB;
  private static final SubLSymbol $sym59$ENUMERATE_ADDITIONS_TO_CURRENT_KB;
  private static final SubLString $str60$Enumerating_new_constants_____;
  private static final SubLString $str61$Enumerating_new_assertions_____;
  private static final SubLSymbol $sym62$EL_PARTITION_DATA_SINK_P;
  private static final SubLSymbol $sym63$EL_PARTITION_RELEVANT_CONSTANT_;
  private static final SubLSymbol $kw64$DONE;
  private static final SubLSymbol $kw65$INPUT;
  private static final SubLString $str66$Reading_pickled_constants_from_;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$CSETQ;
  private static final SubLSymbol $sym69$ITERATION_NEXT_WITHOUT_VALUES;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$FWHEN;
  private static final SubLSymbol $sym72$ASSERTION_P;
  private static final SubLSymbol $sym73$TL_ENCAPSULATE;
  private static final SubLSymbol $sym74$ASSERTION_TL_IST_FORMULA;
  private static final SubLList $list75;
  private static final SubLSymbol $sym76$CDEC;
  private static final SubLSymbol $sym77$UNTIL;
  private static final SubLSymbol $sym78$EL_PARTITION_RELEVANT_ASSERTION_;
  private static final SubLSymbol $sym79$FIND_ASSERTION_BY_ID;
  private static final SubLString $str80$Implementation_error__Tip_index__;
  private static final SubLString $str81$Implementation_error__branch_inde;
  private static final SubLString $str82$Implementation_error__tip_index_u;
  private static final SubLSymbol $kw83$NOT_FOUND;
  private static final SubLSymbol $kw84$SHARED_ASSERTION;
  private static final SubLSymbol $kw85$BRANCH_AS_ID;
  private static final SubLSymbol $kw86$BRANCH_INDEX;
  private static final SubLSymbol $kw87$BRANCH_COUNT;
  private static final SubLSymbol $kw88$JUST_ASSERTED_P;
  private static final SubLSymbol $kw89$SCAN_FORWARD_STEADY;
  private static final SubLSymbol $kw90$CLASSIC_BACKWARD;
  private static final SubLSymbol $kw91$NOVEL_FORWARD;
  private static final SubLSymbol $kw92$SCAN_FORWARD_FAST;
  private static final SubLString $str93$Pickled_KB_Comparison_Strategy__S;
  private static final SubLString $str94$Analyzing_;
  private static final SubLString $str95$_new_assertions_____;
  private static final SubLString $str96$This_algorithm_is_not_designed_to;
  private static final SubLSymbol $sym97$ELPART_AS_DESC;
  private static final SubLSymbol $sym98$ELPART_AS_DESC_P;
  private static final SubLList $list99;
  private static final SubLList $list100;
  private static final SubLList $list101;
  private static final SubLList $list102;
  private static final SubLSymbol $sym103$PRINT_ELPART_AS_DESC;
  private static final SubLSymbol $sym104$ELPART_AS_DESC_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list105;
  private static final SubLSymbol $sym106$ELPART_AS_DESC_ID;
  private static final SubLSymbol $sym107$_CSETF_ELPART_AS_DESC_ID;
  private static final SubLSymbol $sym108$ELPART_AS_DESC_TL_IST_FORMULA;
  private static final SubLSymbol $sym109$_CSETF_ELPART_AS_DESC_TL_IST_FORMULA;
  private static final SubLSymbol $sym110$ELPART_AS_DESC_HASH;
  private static final SubLSymbol $sym111$_CSETF_ELPART_AS_DESC_HASH;
  private static final SubLSymbol $sym112$ELPART_AS_DESC_EXTRA;
  private static final SubLSymbol $sym113$_CSETF_ELPART_AS_DESC_EXTRA;
  private static final SubLSymbol $sym114$ELPART_AS_DESC_WEAK_IST_FORMULA;
  private static final SubLSymbol $sym115$_CSETF_ELPART_AS_DESC_WEAK_IST_FORMULA;
  private static final SubLSymbol $kw116$ID;
  private static final SubLSymbol $kw117$TL_IST_FORMULA;
  private static final SubLSymbol $kw118$HASH;
  private static final SubLSymbol $kw119$EXTRA;
  private static final SubLSymbol $kw120$WEAK_IST_FORMULA;
  private static final SubLString $str121$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw122$BEGIN;
  private static final SubLSymbol $sym123$MAKE_ELPART_AS_DESC;
  private static final SubLSymbol $kw124$SLOT;
  private static final SubLSymbol $kw125$END;
  private static final SubLSymbol $sym126$VISIT_DEFSTRUCT_OBJECT_ELPART_AS_DESC_METHOD;
  private static final SubLString $str127$_id__;
  private static final SubLString $str128$_hc__;
  private static final SubLString $str129$_AS_ID__;
  private static final SubLString $str130$_FVecInx__;
  private static final SubLString $str131$_xtr__;
  private static final SubLString $str132$_;
  private static final SubLString $str133$_assertions_____;
  private static final SubLString $str134$Not_yet_implemented_;
  private static final SubLString $str135$Mhm__only__A_gaps_across_all_asse;
  private static final SubLString $str136$Finding_start_of_relevant_asserti;
  private static final SubLString $str137$_assertion_gaps_____;
  private static final SubLString $str138$Error_realigning_BRANCH___A__now_;
  private static final SubLList $list139;
  private static final SubLSymbol $sym140$ENUMMISS_TL_HP_NOTATION;
  private static final SubLSymbol $kw141$HP;
  private static final SubLString $str142$Sorry__FAST_is_currently_not_impl;
  private static final SubLString $str143$_branch_assertions_____;
  private static final SubLSymbol $kw144$BOTH_INVALID;
  private static final SubLSymbol $kw145$INVALID_BRANCH;
  private static final SubLSymbol $kw146$INVALID_TIP;
  private static final SubLSymbol $kw147$DIFFERENT;
  private static final SubLSymbol $kw148$EQUAL;
  private static final SubLString $str149$Unknown_state__A____do_not_know_w;
  private static final SubLSymbol $sym150$TEST_EL_PARTITION_SIMPLE_SCAN_ALGORITHM;
  private static final SubLSymbol $kw151$TEST;
  private static final SubLSymbol $kw152$OWNER;
  private static final SubLSymbol $kw153$CLASSES;
  private static final SubLSymbol $kw154$KB;
  private static final SubLSymbol $kw155$TINY;
  private static final SubLSymbol $kw156$WORKING_;
  private static final SubLObject $list157;
  private static final SubLSymbol $kw158$INVALID;
  private static final SubLString $str159$Someone_is_whaffling_____;
  private static final SubLSymbol $kw160$CREATE;
  private static final SubLSymbol $kw161$DELETE;
  private static final SubLSymbol $sym162$TEST_RANDOM_EL_PARTITION_SIMPLE_SCAN_CASES;
  private static final SubLList $list163;
  private static final SubLString $str164$Expected__A__got__A_instead_;
  private static final SubLSymbol $kw165$OK;
  private static final SubLSymbol $sym166$EL_PARTITION_DATA_SINK;
  private static final SubLList $list167;
  private static final SubLList $list168;
  private static final SubLList $list169;
  private static final SubLList $list170;
  private static final SubLSymbol $sym171$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym172$EL_PARTITION_DATA_SINK_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list173;
  private static final SubLSymbol $sym174$ELPART_DSINK_STATE;
  private static final SubLSymbol $sym175$_CSETF_ELPART_DSINK_STATE;
  private static final SubLSymbol $sym176$ELPART_DSINK_BRANCH_CDEL_FN;
  private static final SubLSymbol $sym177$_CSETF_ELPART_DSINK_BRANCH_CDEL_FN;
  private static final SubLSymbol $sym178$ELPART_DSINK_BRANCH_ASDEL_FN;
  private static final SubLSymbol $sym179$_CSETF_ELPART_DSINK_BRANCH_ASDEL_FN;
  private static final SubLSymbol $sym180$ELPART_DSINK_TIP_CCREATE_FN;
  private static final SubLSymbol $sym181$_CSETF_ELPART_DSINK_TIP_CCREATE_FN;
  private static final SubLSymbol $sym182$ELPART_DSINK_TIP_ASCREATE_FN;
  private static final SubLSymbol $sym183$_CSETF_ELPART_DSINK_TIP_ASCREATE_FN;
  private static final SubLSymbol $sym184$ELPART_DSINK_TIP_ASREASSERT_FN;
  private static final SubLSymbol $sym185$_CSETF_ELPART_DSINK_TIP_ASREASSERT_FN;
  private static final SubLSymbol $kw186$STATE;
  private static final SubLSymbol $kw187$BRANCH_CDEL_FN;
  private static final SubLSymbol $kw188$BRANCH_ASDEL_FN;
  private static final SubLSymbol $kw189$TIP_CCREATE_FN;
  private static final SubLSymbol $kw190$TIP_ASCREATE_FN;
  private static final SubLSymbol $kw191$TIP_ASREASSERT_FN;
  private static final SubLSymbol $sym192$MAKE_EL_PARTITION_DATA_SINK;
  private static final SubLSymbol $sym193$VISIT_DEFSTRUCT_OBJECT_EL_PARTITION_DATA_SINK_METHOD;
  private static final SubLSymbol $sym194$NOTE_EL_PARTITION_BRANCH_CONSTANT_DELETE;
  private static final SubLSymbol $sym195$NOTE_EL_PARTITION_BRANCH_ASSERTION_DELETE;
  private static final SubLSymbol $sym196$NOTE_EL_PARTITION_TIP_CONSTANT_CREATE;
  private static final SubLSymbol $sym197$NOTE_EL_PARTITION_TIP_ASSERTION_CREATE;
  private static final SubLSymbol $sym198$NOTE_EL_PARTITION_TIP_ASSERTION_REASSERT;
  private static final SubLList $list199;
  private static final SubLSymbol $sym200$_EL_PARTITION_CREATOR_OVERRIDE_;
  private static final SubLList $list201;
  private static final SubLSymbol $sym202$_EL_PARTITION_CREATION_PURPOSE_OVERRIDE_;
  private static final SubLList $list203;
  private static final SubLSymbol $sym204$_EL_PARTITION_MT_OVERRIDE_;
  private static final SubLList $list205;
  private static final SubLSymbol $sym206$_EL_PARTITION_DIRECTION_OVERRIDE_;
  private static final SubLList $list207;
  private static final SubLSymbol $sym208$TRANSCRIPT_DATA_SINK_BRANCH_CONSTANT_DELETE;
  private static final SubLSymbol $sym209$TRANSCRIPT_DATA_SINK_BRANCH_ASSERTION_DELETE;
  private static final SubLSymbol $sym210$TRANSCRIPT_DATA_SINK_TIP_CONSTANT_CREATE;
  private static final SubLSymbol $sym211$TRANSCRIPT_DATA_SINK_TIP_ASSERTION_CREATE;
  private static final SubLSymbol $sym212$TRANSCRIPT_DATA_SINK_TIP_ASSERTION_REASSERT;
  private static final SubLString $str213$_FI_KILL____HP__S__S__;
  private static final SubLString $str214$_FI_UNASSERT___S___S_;
  private static final SubLString $str215$_FI_CREATE___S__S_;
  private static final SubLString $str216$_FI_ASSERT___S___S___S___S_;
  private static final SubLString $str217$_FI_REASSERT___S___S___S___S_;
  private static final SubLString $str218$_FI_TIMESTAMP_CONSTANT___S___S___;
  private static final SubLString $str219$_FI_TIMESTAMP_ASSERTION___S___S__;
  private static final SubLList $list220;
  private static final SubLString $str221$_;
  private static final SubLString $str222$_;
  private static final SubLSymbol $sym223$DEBUG_DATA_SINK_BRANCH_CONSTANT_DELETE;
  private static final SubLSymbol $sym224$DEBUG_DATA_SINK_BRANCH_ASSERTION_DELETE;
  private static final SubLSymbol $sym225$DEBUG_DATA_SINK_TIP_CONSTANT_CREATE;
  private static final SubLSymbol $sym226$DEBUG_DATA_SINK_TIP_ASSERTION_CREATE;
  private static final SubLSymbol $sym227$DEBUG_DATA_SINK_TIP_ASSERTION_REASSERT;
  private static final SubLString $str228$___kill__A__A__;
  private static final SubLString $str229$___unassert__A__;
  private static final SubLString $str230$___create__A__A__;
  private static final SubLString $str231$___assert__A__;
  private static final SubLString $str232$___reassert__A__A__A__;

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 2898L)
  public static SubLObject with_pickling_stream_buffer_size(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$WITH_STREAM_BUFFER_SIZE, $list2, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 3113L)
  public static SubLObject with_pickling_pacficiation(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject total = NIL;
    SubLObject message = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    total = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    message = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject curr = $sym4$CURR;
      return ConsesLow.list( $sym5$CLET, ConsesLow.list( reader.bq_cons( curr, $list6 ) ), ConsesLow.list( $sym7$NOTING_PERCENT_PROGRESS, message, reader.bq_cons( $sym8$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow
          .list( $sym9$CINC, curr ), ConsesLow.list( $sym10$NOTE_PERCENT_PROGRESS, curr, total ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 3489L)
  public static SubLObject el_partition_relevant_constantP(final SubLObject v_term)
  {
    return makeBoolean( NIL != constant_handles.constant_p( v_term ) && NIL == hl_prototypes.hl_prototypical_instanceP( v_term ) && NIL == fort_types_interface.skolem_function_p( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 4132L)
  public static SubLObject el_partition_relevant_assertionP(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && NIL != assertions_high.asserted_assertionP( assertion ) && NIL == function_terms.term_of_unit_assertion_p( assertion ) && NIL == list_utilities
        .tree_find_if( $sym11$HL_PROTOTYPICAL_INSTANCE_, assertions_high.assertion_cons( assertion ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 4511L)
  public static SubLObject pickle_constants(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = Sequences.cconcatenate( $str13$Pickling_constants_to_, new SubLObject[] { format_nil.format_nil_a_no_copy( filename ), $str14$_____
    } );
    final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( $pickling_stream_buffer_size$.getDynamicValue( thread ), thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$1 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_binary( filename, $kw15$OUTPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$1, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str16$Unable_to_open__S, filename );
        }
        final SubLObject s = stream;
        cfasl.cfasl_output( misc_utilities.copyright_notice(), s );
        cfasl.cfasl_output( constant_handles.constant_count(), s );
        final SubLObject idx = constant_handles.do_constants_table();
        final SubLObject mess = message;
        final SubLObject total = id_index.id_index_count( idx );
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != Types.stringp( mess ) : mess;
        final SubLObject _prev_bind_0_$2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_1_$3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( mess );
            final SubLObject idx_$4 = idx;
            if( NIL == id_index.id_index_objects_empty_p( idx_$4, $kw18$SKIP ) )
            {
              final SubLObject idx_$5 = idx_$4;
              if( NIL == id_index.id_index_dense_objects_empty_p( idx_$5, $kw18$SKIP ) )
              {
                final SubLObject vector_var = id_index.id_index_dense_objects( idx_$5 );
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject c;
                for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                {
                  id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                  c = Vectors.aref( vector_var, id );
                  if( NIL == id_index.id_index_tombstone_p( c ) || NIL == id_index.id_index_skip_tombstones_p( $kw18$SKIP ) )
                  {
                    if( NIL != id_index.id_index_tombstone_p( c ) )
                    {
                      c = $kw18$SKIP;
                    }
                    if( NIL != el_partition_relevant_constantP( c ) )
                    {
                      cfasl.cfasl_output( constant_handles.constant_suid( c ), s );
                      cfasl.cfasl_output( constants_high.constant_name( c ), s );
                      cfasl.cfasl_output( constants_high.constant_guid( c ), s );
                    }
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                  }
                }
              }
              final SubLObject idx_$6 = idx_$4;
              if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$6 ) || NIL == id_index.id_index_skip_tombstones_p( $kw18$SKIP ) )
              {
                final SubLObject sparse = id_index.id_index_sparse_objects( idx_$6 );
                SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$6 );
                final SubLObject end_id = id_index.id_index_next_id( idx_$6 );
                final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw18$SKIP ) ) ? NIL : $kw18$SKIP;
                while ( id2.numL( end_id ))
                {
                  final SubLObject c2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                  if( NIL == id_index.id_index_skip_tombstones_p( $kw18$SKIP ) || NIL == id_index.id_index_tombstone_p( c2 ) )
                  {
                    if( NIL != el_partition_relevant_constantP( c2 ) )
                    {
                      cfasl.cfasl_output( constant_handles.constant_suid( c2 ), s );
                      cfasl.cfasl_output( constants_high.constant_name( c2 ), s );
                      cfasl.cfasl_output( constants_high.constant_guid( c2 ), s );
                    }
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                  }
                  id2 = Numbers.add( id2, ONE_INTEGER );
                }
              }
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$3, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$2, thread );
        }
        cfasl.cfasl_output( NIL, s );
        cfasl.cfasl_output( NIL, s );
        cfasl.cfasl_output( NIL, s );
      }
      finally
      {
        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_2, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_0, thread );
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 5576L)
  public static SubLObject do_pickled_constants(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject suid = NIL;
    SubLObject name = NIL;
    SubLObject guid = NIL;
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    suid = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    guid = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    filename = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$9 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list20 );
      current_$9 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list20 );
      if( NIL == conses_high.member( current_$9, $list21, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$9 == $kw22$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
    }
    final SubLObject message_tail = cdestructuring_bind.property_list_member( $kw23$MESSAGE, current );
    final SubLObject message = ( NIL != message_tail ) ? conses_high.cadr( message_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject stream = $sym24$STREAM;
    final SubLObject count = $sym25$COUNT;
    final SubLObject msg = $sym26$MSG;
    return ConsesLow.list( $sym27$WITH_PICKLING_STREAM_BUFFER_SIZE, ConsesLow.list( $sym28$WITH_PRIVATE_BINARY_FILE, ConsesLow.listS( stream, filename, $list29 ), ConsesLow.list( $sym30$CFASL_INPUT, stream ), ConsesLow
        .list( $sym5$CLET, ConsesLow.list( ConsesLow.list( count, ConsesLow.list( $sym30$CFASL_INPUT, stream ) ), ConsesLow.list( msg, ConsesLow.list( $sym31$FIF, ConsesLow.list( $sym32$NULL, message ), ConsesLow.list(
            $sym33$FORMAT_NIL, $str34$Reading_pickled_constants_from__A, filename ), message ) ) ), ConsesLow.list( $sym35$WITH_PICKLING_PACFICIATION, ConsesLow.list( count, msg ), ConsesLow.list( $sym36$CDO, ConsesLow
                .list( ConsesLow.list( suid, ConsesLow.list( $sym30$CFASL_INPUT, stream ), ConsesLow.list( $sym30$CFASL_INPUT, stream ) ), ConsesLow.list( name, ConsesLow.list( $sym30$CFASL_INPUT, stream ), ConsesLow
                    .list( $sym30$CFASL_INPUT, stream ) ), ConsesLow.list( guid, ConsesLow.list( $sym30$CFASL_INPUT, stream ), ConsesLow.list( $sym30$CFASL_INPUT, stream ) ) ), ConsesLow.list( ConsesLow.list(
                        $sym32$NULL, guid ) ), ConsesLow.list( $sym37$MUST, ConsesLow.list( $sym38$NON_NEGATIVE_INTEGER_P, suid ), $str39$Read_invalid_SUID__A_from__A_, suid, stream ), ConsesLow.list( $sym37$MUST,
                            ConsesLow.list( $sym17$STRINGP, name ), $str40$Read_invalid_NAME__A_from__A_, name, stream ), ConsesLow.list( $sym37$MUST, ConsesLow.list( $sym41$GUID_P, guid ),
                                $str42$Read_invalid_GUID__A_from__A_, guid, stream ), ConsesLow.list( $sym10$NOTE_PERCENT_PROGRESS, suid, count ), reader.bq_cons( $sym8$PROGN, ConsesLow.append( body, NIL ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 7107L)
  public static SubLObject pickle_assertions(final SubLObject filestem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = Sequences.cconcatenate( $str44$Pickling_assertions_to_file_vecto, new SubLObject[] { format_nil.format_nil_a_no_copy( filestem ), $str14$_____
    } );
    final SubLObject index_file = pickling_index_filename( filestem );
    final SubLObject data_file = pickling_data_filename( filestem );
    final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( $pickling_stream_buffer_size$.getDynamicValue( thread ), thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$10 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_binary( index_file, $kw15$OUTPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$10, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str16$Unable_to_open__S, index_file );
        }
        final SubLObject index_stream = stream;
        SubLObject stream_$11 = NIL;
        try
        {
          final SubLObject _prev_bind_0_$11 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream_$11 = compatibility.open_binary( data_file, $kw15$OUTPUT );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$11, thread );
          }
          if( !stream_$11.isStream() )
          {
            Errors.error( $str16$Unable_to_open__S, data_file );
          }
          final SubLObject data_stream = stream_$11;
          final SubLObject fvector = file_vector.create_file_vector( data_stream, index_stream );
          cfasl.cfasl_output( misc_utilities.copyright_notice(), data_stream );
          cfasl.cfasl_output( assertion_handles.assertion_count(), data_stream );
          cfasl.cfasl_output( T, data_stream );
          final SubLObject idx = assertion_handles.do_assertions_table();
          final SubLObject mess = message;
          final SubLObject total = id_index.id_index_count( idx );
          SubLObject sofar = ZERO_INTEGER;
          assert NIL != Types.stringp( mess ) : mess;
          final SubLObject _prev_bind_0_$12 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_1_$14 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( mess );
              final SubLObject idx_$15 = idx;
              if( NIL == id_index.id_index_objects_empty_p( idx_$15, $kw18$SKIP ) )
              {
                final SubLObject idx_$16 = idx_$15;
                if( NIL == id_index.id_index_dense_objects_empty_p( idx_$16, $kw18$SKIP ) )
                {
                  final SubLObject vector_var = id_index.id_index_dense_objects( idx_$16 );
                  final SubLObject backwardP_var = NIL;
                  SubLObject length;
                  SubLObject v_iteration;
                  SubLObject a_id;
                  SubLObject a_handle;
                  SubLObject as;
                  for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                  {
                    a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                    a_handle = Vectors.aref( vector_var, a_id );
                    if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw18$SKIP ) )
                    {
                      if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                      {
                        a_handle = $kw18$SKIP;
                      }
                      as = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                      if( NIL != el_partition_relevant_assertionP( as ) )
                      {
                        file_vector.update_file_vector_index_linear( fvector );
                        cfasl.cfasl_output( assertion_handles.assertion_id( as ), data_stream );
                        cfasl.cfasl_output( assertion_to_pickling_format( as ), data_stream );
                      }
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                  }
                }
                final SubLObject idx_$17 = idx_$15;
                if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$17 ) || NIL == id_index.id_index_skip_tombstones_p( $kw18$SKIP ) )
                {
                  final SubLObject sparse = id_index.id_index_sparse_objects( idx_$17 );
                  SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$17 );
                  final SubLObject end_id = id_index.id_index_next_id( idx_$17 );
                  final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw18$SKIP ) ) ? NIL : $kw18$SKIP;
                  while ( a_id2.numL( end_id ))
                  {
                    final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                    if( NIL == id_index.id_index_skip_tombstones_p( $kw18$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                    {
                      final SubLObject as2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                      if( NIL != el_partition_relevant_assertionP( as2 ) )
                      {
                        file_vector.update_file_vector_index_linear( fvector );
                        cfasl.cfasl_output( assertion_handles.assertion_id( as2 ), data_stream );
                        cfasl.cfasl_output( assertion_to_pickling_format( as2 ), data_stream );
                      }
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                    a_id2 = Numbers.add( a_id2, ONE_INTEGER );
                  }
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$14, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$12, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            if( stream_$11.isStream() )
            {
              streams_high.close( stream_$11, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_2, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_0, thread );
    }
    return Values.values( index_file, data_file );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 8234L)
  public static SubLObject pickling_index_filename(final SubLObject filestem)
  {
    return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( filestem ), $str45$_index_cfasl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 8334L)
  public static SubLObject pickling_data_filename(final SubLObject filestem)
  {
    return Sequences.cconcatenate( filestem, $str46$_cfasl );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 8426L)
  public static SubLObject assertion_to_pickling_format(final SubLObject assertion)
  {
    final SubLObject formula = canon_tl.assertion_tl_ist_formula( assertion );
    final SubLObject encapsulated = canon_tl.tl_encapsulate( formula );
    final SubLObject rewritten = transform_list_utilities.ntransform( encapsulated, $sym41$GUID_P, $sym48$CONVERT_GUID_TO_PICKLING_FORMAT, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return rewritten;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 8954L)
  public static SubLObject unpickle_assertion_pickling_format(final SubLObject pickled_formula)
  {
    return transform_list_utilities.transform( pickled_formula, $sym50$PICKLED_GUID_FORMAT_P, $sym51$RESTORE_GUID_FROM_PICKLING_FORMAT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 9284L)
  public static SubLObject convert_guid_to_pickling_format(final SubLObject guid)
  {
    return ConsesLow.list( $kw52$GUID, Guids.guid_to_string( guid ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 9464L)
  public static SubLObject pickled_guid_format_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.proper_list_p( v_object ) && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) && $kw52$GUID == v_object.first() && NIL != Guids.guid_string_p( conses_high
        .second( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 9698L)
  public static SubLObject restore_guid_from_pickling_format(final SubLObject pickled_guid)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject guid_marker = NIL;
    SubLObject guid_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( pickled_guid, pickled_guid, $list53 );
    guid_marker = pickled_guid.first();
    SubLObject current = pickled_guid.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, pickled_guid, $list53 );
    guid_string = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && $kw52$GUID != guid_marker )
      {
        Errors.error( $str54$Cannot_restore__A_____not_a_pickl, pickled_guid );
      }
      return Guids.string_to_guid( guid_string );
    }
    cdestructuring_bind.cdestructuring_bind_error( pickled_guid, $list53 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 9970L)
  public static SubLObject new_relevant_assertions_id_space(SubLObject message)
  {
    if( message == UNPROVIDED )
    {
      message = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    SubLObject keepers = NIL;
    if( !message.isString() )
    {
      message = $str56$Computing_EL_Partition_relevant_a;
    }
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = message;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$21 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$21, $kw18$SKIP ) )
        {
          final SubLObject idx_$22 = idx_$21;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$22, $kw18$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$22 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject assertion;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw18$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw18$SKIP;
                }
                assertion = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != el_partition_relevant_assertionP( assertion ) )
                {
                  keepers = ConsesLow.cons( assertion_handles.assertion_id( assertion ), keepers );
                  count = Numbers.add( count, ONE_INTEGER );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$23 = idx_$21;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$23 ) || NIL == id_index.id_index_skip_tombstones_p( $kw18$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$23 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$23 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$23 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw18$SKIP ) ) ? NIL : $kw18$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw18$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != el_partition_relevant_assertionP( assertion2 ) )
                {
                  keepers = ConsesLow.cons( assertion_handles.assertion_id( assertion2 ), keepers );
                  count = Numbers.add( count, ONE_INTEGER );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$24, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    final SubLObject id_space = Vectors.make_vector( count, UNPROVIDED );
    SubLObject index = count;
    while ( NIL != list_utilities.sublisp_boolean( keepers ))
    {
      index = Numbers.subtract( index, ONE_INTEGER );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.non_negative_integer_p( index ) )
      {
        Errors.error( $str57$Whoa__we_underflowed_the_ID_space );
      }
      Vectors.set_aref( id_space, index, keepers.first() );
      keepers = keepers.rest();
    }
    return id_space;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 21954L)
  public static SubLObject compare_pickled_kb_to_current_kb(final SubLObject pickled_constant_file, final SubLObject pickled_assertion_filestem, final SubLObject data_sink)
  {
    compare_pickled_kb_to_current_kb_assertions_internal( pickled_assertion_filestem, data_sink, pickled_constant_file );
    return data_sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 22702L)
  public static SubLObject enumerate_additions_to_current_kb(final SubLObject data_sink)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject start = constant_handles.new_constant_suid_threshold();
    SubLObject table_var = constant_handles.do_constants_table();
    SubLObject total = Numbers.subtract( id_index.id_index_next_id( table_var ), start );
    SubLObject sofar = ZERO_INTEGER;
    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( $str60$Enumerating_new_constants_____ );
        SubLObject end_var;
        SubLObject end;
        SubLObject id;
        SubLObject tip_constant;
        for( end = ( end_var = id_index.id_index_next_id( table_var ) ), id = NIL, id = start; !id.numGE( end_var ); id = number_utilities.f_1X( id ) )
        {
          tip_constant = id_index.id_index_lookup( table_var, id, UNPROVIDED );
          if( NIL != tip_constant )
          {
            utilities_macros.note_percent_progress( sofar, total );
            sofar = Numbers.add( sofar, ONE_INTEGER );
            if( NIL != el_partition_relevant_constantP( tip_constant ) )
            {
              note_el_partition_tip_constant_create( data_sink, tip_constant );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    start = assertion_handles.get_file_backed_assertion_internal_id_threshold();
    table_var = assertion_handles.do_assertions_table();
    total = Numbers.subtract( id_index.id_index_next_id( table_var ), start );
    sofar = ZERO_INTEGER;
    _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( $str61$Enumerating_new_assertions_____ );
        SubLObject end_var;
        SubLObject end;
        SubLObject id;
        SubLObject tip_assertion;
        for( end = ( end_var = id_index.id_index_next_id( table_var ) ), id = NIL, id = start; !id.numGE( end_var ); id = number_utilities.f_1X( id ) )
        {
          tip_assertion = id_index.id_index_lookup( table_var, id, UNPROVIDED );
          if( NIL != tip_assertion )
          {
            utilities_macros.note_percent_progress( sofar, total );
            sofar = Numbers.add( sofar, ONE_INTEGER );
            if( NIL != el_partition_relevant_assertionP( tip_assertion ) )
            {
              note_el_partition_tip_assertion_create( data_sink, tip_assertion );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return data_sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 23449L)
  public static SubLObject compare_pickled_kb_to_current_kb_constants(final SubLObject pickled_file, final SubLObject data_sink)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != el_partition_data_sink_p( data_sink ) : data_sink;
    final SubLObject raw_tip_iterator = constant_handles.new_constants_iterator();
    final SubLObject tip_iterator = iteration.new_filter_iterator( raw_tip_iterator, $sym63$EL_PARTITION_RELEVANT_CONSTANT_, UNPROVIDED );
    SubLObject tip_constant = iteration.iteration_next_without_values( tip_iterator, $kw64$DONE );
    final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( thread );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( $pickling_stream_buffer_size$.getDynamicValue( thread ), thread );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( thread ), thread );
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0_$27 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_binary( pickled_file, $kw65$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$27, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str16$Unable_to_open__S, pickled_file );
        }
        final SubLObject stream_$28 = stream;
        cfasl.cfasl_input( stream_$28, UNPROVIDED, UNPROVIDED );
        final SubLObject count = cfasl.cfasl_input( stream_$28, UNPROVIDED, UNPROVIDED );
        final SubLObject msg = Sequences.cconcatenate( $str66$Reading_pickled_constants_from_, new SubLObject[] { format_nil.format_nil_a_no_copy( pickled_file ), $str14$_____
        } );
        SubLObject curr = ZERO_INTEGER;
        final SubLObject _prev_bind_0_$28 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_1_$30 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( msg );
            SubLObject suid = NIL;
            SubLObject branch_name = NIL;
            SubLObject branch_guid = NIL;
            suid = cfasl.cfasl_input( stream_$28, UNPROVIDED, UNPROVIDED );
            branch_name = cfasl.cfasl_input( stream_$28, UNPROVIDED, UNPROVIDED );
            for( branch_guid = cfasl.cfasl_input( stream_$28, UNPROVIDED, UNPROVIDED ); NIL != branch_guid; branch_guid = cfasl.cfasl_input( stream_$28, UNPROVIDED, UNPROVIDED ) )
            {
              if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.non_negative_integer_p( suid ) )
              {
                Errors.error( $str39$Read_invalid_SUID__A_from__A_, suid, stream_$28 );
              }
              if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !branch_name.isString() )
              {
                Errors.error( $str40$Read_invalid_NAME__A_from__A_, branch_name, stream_$28 );
              }
              if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == Guids.guid_p( branch_guid ) )
              {
                Errors.error( $str42$Read_invalid_GUID__A_from__A_, branch_guid, stream_$28 );
              }
              utilities_macros.note_percent_progress( suid, count );
              if( NIL != constant_handles.constant_p( tip_constant ) && NIL != Guids.guidE( branch_guid, constants_high.constant_guid( tip_constant ) ) )
              {
                tip_constant = iteration.iteration_next_without_values( tip_iterator, $kw64$DONE );
              }
              else
              {
                note_el_partition_branch_constant_delete( data_sink, branch_name, branch_guid );
              }
              suid = cfasl.cfasl_input( stream_$28, UNPROVIDED, UNPROVIDED );
              branch_name = cfasl.cfasl_input( stream_$28, UNPROVIDED, UNPROVIDED );
            }
            curr = Numbers.add( curr, ONE_INTEGER );
            utilities_macros.note_percent_progress( curr, count );
          }
          finally
          {
            final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$29, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$30, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$28, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( _prev_bind_2, thread );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( _prev_bind_0, thread );
    }
    while ( NIL != constant_handles.constant_p( tip_constant ))
    {
      note_el_partition_tip_constant_create( data_sink, tip_constant );
      tip_constant = iteration.iteration_next_without_values( tip_iterator, $kw64$DONE );
    }
    return pickled_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 24947L)
  public static SubLObject update_as_iteration_state(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject it = NIL;
    SubLObject as = NIL;
    SubLObject tl_ist_formula = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    it = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    as = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list67 );
    tl_ist_formula = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym68$CSETQ, as, ConsesLow.listS( $sym69$ITERATION_NEXT_WITHOUT_VALUES, it, $list70 ), tl_ist_formula, ConsesLow.list( $sym71$FWHEN, ConsesLow.list( $sym72$ASSERTION_P, as ), ConsesLow.list(
          $sym73$TL_ENCAPSULATE, ConsesLow.list( $sym74$ASSERTION_TL_IST_FORMULA, as ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list67 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 25309L)
  public static SubLObject decrement_tip_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject tip_index = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
    tip_index = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym8$PROGN, ConsesLow.list( $sym76$CDEC, tip_index ), ConsesLow.list( $sym77$UNTIL, ConsesLow.list( $sym78$EL_PARTITION_RELEVANT_ASSERTION_, ConsesLow.list( $sym79$FIND_ASSERTION_BY_ID,
          tip_index ) ), ConsesLow.list( $sym76$CDEC, tip_index ), ConsesLow.list( $sym37$MUST, ConsesLow.list( $sym38$NON_NEGATIVE_INTEGER_P, tip_index ), $str80$Implementation_error__Tip_index__, tip_index ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list75 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 25768L)
  public static SubLObject find_most_recent_assertion_shared_with_branch(final SubLObject pickled_file_stem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject data_file = pickling_data_filename( pickled_file_stem );
    final SubLObject index_file = pickling_index_filename( pickled_file_stem );
    final SubLObject branch_ids_to_index = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    SubLObject tip_assertion = NIL;
    SubLObject corresponding_branch_as_id = NIL;
    SubLObject total_branch_assertions = NIL;
    SubLObject fvector = NIL;
    try
    {
      fvector = file_vector.new_file_vector( data_file, index_file, $kw65$INPUT, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      thread.resetMultipleValues();
      final SubLObject branch_index_limit = fetch_branch_limit_information_for_pickled_kb( fvector );
      final SubLObject branch_assertions_count = thread.secondMultipleValue();
      thread.resetMultipleValues();
      total_branch_assertions = branch_assertions_count;
      final SubLObject window = dictionary.new_dictionary( EQUAL, UNPROVIDED );
      final SubLObject data_stream = file_vector.get_file_vector_data_stream( fvector );
      SubLObject tip_index = Numbers.min( total_branch_assertions, assertion_handles.assertion_count() );
      SubLObject branch_index = branch_index_limit;
      for( SubLObject doneP = NIL; NIL == doneP; doneP = subl_promotions.non_negative_integer_p( corresponding_branch_as_id ) )
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !branch_index.isPositive() )
        {
          Errors.error( $str81$Implementation_error__branch_inde );
        }
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !tip_index.isPositive() )
        {
          Errors.error( $str82$Implementation_error__tip_index_u );
        }
        branch_index = Numbers.subtract( branch_index, ONE_INTEGER );
        file_vector.position_file_vector( fvector, branch_index );
        final SubLObject branch_as_id = cfasl.cfasl_input( data_stream, UNPROVIDED, UNPROVIDED );
        final SubLObject branch_tl_ist_formula = cfasl.cfasl_input( data_stream, UNPROVIDED, UNPROVIDED );
        map_utilities.map_put( branch_ids_to_index, branch_as_id, branch_index );
        map_utilities.map_put( window, branch_tl_ist_formula, branch_as_id );
        tip_index = Numbers.subtract( tip_index, ONE_INTEGER );
        while ( NIL == el_partition_relevant_assertionP( assertion_handles.find_assertion_by_id( tip_index ) ))
        {
          tip_index = Numbers.subtract( tip_index, ONE_INTEGER );
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.non_negative_integer_p( tip_index ) )
          {
            Errors.error( $str80$Implementation_error__Tip_index__, tip_index );
          }
        }
        tip_assertion = assertion_handles.find_assertion_by_id( tip_index );
        final SubLObject tip_tl_ist_formula = assertion_to_pickling_format( tip_assertion );
        corresponding_branch_as_id = map_utilities.map_get( window, tip_tl_ist_formula, $kw83$NOT_FOUND );
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != file_vector.file_vector_p( fvector ) )
        {
          file_vector.close_file_vector( fvector );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    final SubLObject branch_index2 = map_utilities.map_get( branch_ids_to_index, corresponding_branch_as_id, UNPROVIDED );
    return ConsesLow.list( new SubLObject[] { $kw84$SHARED_ASSERTION, tip_assertion, $kw85$BRANCH_AS_ID, corresponding_branch_as_id, $kw86$BRANCH_INDEX, branch_index2, $kw87$BRANCH_COUNT, total_branch_assertions,
      $kw88$JUST_ASSERTED_P, T
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 28720L)
  public static SubLObject compare_pickled_kb_to_current_kb_assertions(final SubLObject pickled_file_stem, final SubLObject data_sink)
  {
    assert NIL != el_partition_data_sink_p( data_sink ) : data_sink;
    return compare_pickled_kb_to_current_kb_assertions_internal( pickled_file_stem, data_sink, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 29442L)
  public static SubLObject compare_pickled_kb_to_current_kb_assertions_internal(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject pickled_constants_file)
  {
    if( pickled_constants_file == UNPROVIDED )
    {
      pickled_constants_file = NIL;
    }
    final SubLObject pcase_var;
    final SubLObject strategy = pcase_var = $pickled_kb_comparison_strategy$.getGlobalValue();
    if( pcase_var.eql( $kw90$CLASSIC_BACKWARD ) )
    {
      return compare_pickled_kb_to_current_kb_assertions_classic_backward( pickled_file_stem, data_sink, pickled_constants_file );
    }
    if( pcase_var.eql( $kw91$NOVEL_FORWARD ) )
    {
      return compare_pickled_kb_to_current_kb_assertions_novel_forward( pickled_file_stem, data_sink, pickled_constants_file );
    }
    if( pcase_var.eql( $kw92$SCAN_FORWARD_FAST ) )
    {
      return compare_pickled_kb_to_current_kb_assertions_scan_forward_fast( pickled_file_stem, data_sink, pickled_constants_file );
    }
    if( pcase_var.eql( $kw89$SCAN_FORWARD_STEADY ) )
    {
      return compare_pickled_kb_to_current_kb_assertions_scan_forward_steady( pickled_file_stem, data_sink, pickled_constants_file );
    }
    return Errors.error( $str93$Pickled_KB_Comparison_Strategy__S, strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 30739L)
  public static SubLObject compare_pickled_kb_to_current_kb_assertions_scan_forward_fast(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject pickled_constants_file)
  {
    if( pickled_constants_file == UNPROVIDED )
    {
      pickled_constants_file = NIL;
    }
    final SubLObject last_shared = scan_enumerate_branch_assertions_missing_from_current_kb( pickled_file_stem, data_sink, UNPROVIDED );
    if( pickled_constants_file.isString() )
    {
      compare_pickled_kb_to_current_kb_constants( pickled_constants_file, data_sink );
    }
    enumerate_tip_assertions_from_current_kb( data_sink, last_shared );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 31610L)
  public static SubLObject compare_pickled_kb_to_current_kb_assertions_scan_forward_steady(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject pickled_constants_file)
  {
    if( pickled_constants_file == UNPROVIDED )
    {
      pickled_constants_file = NIL;
    }
    final SubLObject relevant_id_space = new_relevant_assertions_id_space( UNPROVIDED );
    final SubLObject last_shared = scan_enumerate_branch_assertions_missing_from_current_kb( pickled_file_stem, data_sink, relevant_id_space );
    if( pickled_constants_file.isString() )
    {
      compare_pickled_kb_to_current_kb_constants( pickled_constants_file, data_sink );
    }
    enumerate_tip_assertions_from_current_kb( data_sink, last_shared );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 32611L)
  public static SubLObject compare_pickled_kb_to_current_kb_assertions_novel_forward(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject pickled_constants_file)
  {
    if( pickled_constants_file == UNPROVIDED )
    {
      pickled_constants_file = NIL;
    }
    final SubLObject last_shared = identify_branch_assertions_absent_from_current_kb( pickled_file_stem, data_sink );
    if( pickled_constants_file.isString() )
    {
      compare_pickled_kb_to_current_kb_constants( pickled_constants_file, data_sink );
    }
    enumerate_tip_assertions_from_current_kb( data_sink, last_shared );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 33443L)
  public static SubLObject compare_pickled_kb_to_current_kb_assertions_classic_backward(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject pickled_constants_file)
  {
    if( pickled_constants_file == UNPROVIDED )
    {
      pickled_constants_file = NIL;
    }
    final SubLObject cmp_properties = find_most_recent_assertion_shared_with_branch( pickled_file_stem );
    final SubLObject last_shared = conses_high.getf( cmp_properties, $kw84$SHARED_ASSERTION, UNPROVIDED );
    final SubLObject just_assertedP = conses_high.getf( cmp_properties, $kw88$JUST_ASSERTED_P, UNPROVIDED );
    enumerate_branch_assertions_absent_from_current_kb( pickled_file_stem, data_sink, cmp_properties );
    if( pickled_constants_file.isString() )
    {
      compare_pickled_kb_to_current_kb_constants( pickled_constants_file, data_sink );
    }
    enumerate_tip_assertions_from_current_kb( data_sink, last_shared );
    return just_assertedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 34567L)
  public static SubLObject enumerate_tip_assertions_from_current_kb(final SubLObject data_sink, final SubLObject last_shared)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject new_space_id;
    final SubLObject new_space_start = new_space_id = Numbers.add( assertion_handles.assertion_id( last_shared ), ONE_INTEGER );
    final SubLObject tip_assertion_count = assertion_handles.assertion_count();
    final SubLObject additions = Numbers.subtract( tip_assertion_count, new_space_id );
    final SubLObject message = Sequences.cconcatenate( $str94$Analyzing_, new SubLObject[] { format_nil.format_nil_a_no_copy( additions ), $str95$_new_assertions_____
    } );
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( message );
        while ( new_space_id.numL( tip_assertion_count ))
        {
          utilities_macros.note_percent_progress( Numbers.subtract( new_space_id, new_space_start ), tip_assertion_count );
          final SubLObject new_assertion = assertion_handles.find_assertion_by_id( new_space_id );
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == assertion_handles.assertion_p( new_assertion ) )
          {
            Errors.error( $str96$This_algorithm_is_not_designed_to );
          }
          if( NIL != el_partition_relevant_assertionP( new_assertion ) )
          {
            note_el_partition_tip_assertion_create( data_sink, new_assertion );
          }
          new_space_id = Numbers.add( new_space_id, ONE_INTEGER );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$33, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return data_sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 35595L)
  public static SubLObject enumerate_branch_assertions_absent_from_current_kb(final SubLObject pickled_file_stem, final SubLObject data_sink, final SubLObject cmp_properties)
  {
    final SubLObject shared_assertion = conses_high.getf( cmp_properties, $kw84$SHARED_ASSERTION, UNPROVIDED );
    final SubLObject branch_as_id = conses_high.getf( cmp_properties, $kw85$BRANCH_AS_ID, UNPROVIDED );
    final SubLObject branch_index = conses_high.getf( cmp_properties, $kw86$BRANCH_INDEX, UNPROVIDED );
    final SubLObject branch_count = conses_high.getf( cmp_properties, $kw87$BRANCH_COUNT, UNPROVIDED );
    return enumerate_branch_assertions_missing_from_current_kb( pickled_file_stem, data_sink, shared_assertion, branch_as_id, branch_index, branch_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
  public static SubLObject elpart_as_desc_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_elpart_as_desc( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
  public static SubLObject elpart_as_desc_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $elpart_as_desc_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
  public static SubLObject elpart_as_desc_id(final SubLObject v_object)
  {
    assert NIL != elpart_as_desc_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
  public static SubLObject elpart_as_desc_tl_ist_formula(final SubLObject v_object)
  {
    assert NIL != elpart_as_desc_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
  public static SubLObject elpart_as_desc_hash(final SubLObject v_object)
  {
    assert NIL != elpart_as_desc_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
  public static SubLObject elpart_as_desc_extra(final SubLObject v_object)
  {
    assert NIL != elpart_as_desc_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
  public static SubLObject elpart_as_desc_weak_ist_formula(final SubLObject v_object)
  {
    assert NIL != elpart_as_desc_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
  public static SubLObject _csetf_elpart_as_desc_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != elpart_as_desc_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
  public static SubLObject _csetf_elpart_as_desc_tl_ist_formula(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != elpart_as_desc_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
  public static SubLObject _csetf_elpart_as_desc_hash(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != elpart_as_desc_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
  public static SubLObject _csetf_elpart_as_desc_extra(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != elpart_as_desc_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
  public static SubLObject _csetf_elpart_as_desc_weak_ist_formula(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != elpart_as_desc_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
  public static SubLObject make_elpart_as_desc(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $elpart_as_desc_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw116$ID ) )
      {
        _csetf_elpart_as_desc_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw117$TL_IST_FORMULA ) )
      {
        _csetf_elpart_as_desc_tl_ist_formula( v_new, current_value );
      }
      else if( pcase_var.eql( $kw118$HASH ) )
      {
        _csetf_elpart_as_desc_hash( v_new, current_value );
      }
      else if( pcase_var.eql( $kw119$EXTRA ) )
      {
        _csetf_elpart_as_desc_extra( v_new, current_value );
      }
      else if( pcase_var.eql( $kw120$WEAK_IST_FORMULA ) )
      {
        _csetf_elpart_as_desc_weak_ist_formula( v_new, current_value );
      }
      else
      {
        Errors.error( $str121$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
  public static SubLObject visit_defstruct_elpart_as_desc(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw122$BEGIN, $sym123$MAKE_ELPART_AS_DESC, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw124$SLOT, $kw116$ID, elpart_as_desc_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw124$SLOT, $kw117$TL_IST_FORMULA, elpart_as_desc_tl_ist_formula( obj ) );
    Functions.funcall( visitor_fn, obj, $kw124$SLOT, $kw118$HASH, elpart_as_desc_hash( obj ) );
    Functions.funcall( visitor_fn, obj, $kw124$SLOT, $kw119$EXTRA, elpart_as_desc_extra( obj ) );
    Functions.funcall( visitor_fn, obj, $kw124$SLOT, $kw120$WEAK_IST_FORMULA, elpart_as_desc_weak_ist_formula( obj ) );
    Functions.funcall( visitor_fn, obj, $kw125$END, $sym123$MAKE_ELPART_AS_DESC, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36193L)
  public static SubLObject visit_defstruct_object_elpart_as_desc_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_elpart_as_desc( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 36655L)
  public static SubLObject print_elpart_as_desc(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      streams_high.write_string( $str127$_id__, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( elpart_as_desc_id( v_object ), stream );
      streams_high.write_string( $str128$_hc__, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( elpart_as_desc_hash( v_object ), stream );
      final SubLObject extra = elpart_as_desc_extra( v_object );
      if( NIL == extra )
      {
        print_high.princ( extra, stream );
      }
      else if( NIL != assertion_handles.assertion_p( extra ) )
      {
        streams_high.write_string( $str129$_AS_ID__, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( assertion_handles.assertion_id( extra ), stream );
      }
      else if( NIL != subl_promotions.non_negative_integer_p( extra ) )
      {
        streams_high.write_string( $str130$_FVecInx__, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( extra, stream );
      }
      else
      {
        streams_high.write_string( $str131$_xtr__, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( extra, stream );
      }
      streams_high.write_string( $str132$_, stream, UNPROVIDED, UNPROVIDED );
      print_macros.print_unreadable_object_postamble( stream, v_object, NIL, NIL );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 37410L)
  public static SubLObject identify_branch_assertions_absent_from_current_kb(final SubLObject pickled_file_stem, final SubLObject data_sink)
  {
    final SubLObject data_file = pickling_data_filename( pickled_file_stem );
    final SubLObject index_file = pickling_index_filename( pickled_file_stem );
    SubLObject shared_assertion = NIL;
    SubLObject fvector = NIL;
    try
    {
      fvector = file_vector.new_file_vector( data_file, index_file, $kw65$INPUT, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      shared_assertion = identify_branch_assertions_absent_from_current_kb_int( fvector, data_sink );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != file_vector.file_vector_p( fvector ) )
        {
          file_vector.close_file_vector( fvector );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return shared_assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 38287L)
  public static SubLObject identify_branch_assertions_absent_from_current_kb_int(final SubLObject fvector, final SubLObject data_sink)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject last_shared = NIL;
    thread.resetMultipleValues();
    final SubLObject branch_index_limit = fetch_branch_limit_information_for_pickled_kb( fvector );
    final SubLObject branch_assertions_count = thread.secondMultipleValue();
    final SubLObject first_branch_as_id = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject assertions_to_do = Numbers.subtract( branch_assertions_count, first_branch_as_id );
    final SubLObject message = Sequences.cconcatenate( $str94$Analyzing_, new SubLObject[] { format_nil.format_nil_a_no_copy( assertions_to_do ), $str133$_assertions_____
    } );
    SubLObject left_wall = ZERO_INTEGER;
    SubLObject id_skew = ZERO_INTEGER;
    SubLObject deletions_noted = ZERO_INTEGER;
    final SubLObject first_tip_as_id = find_start_of_el_partition_relevant_assertions( first_branch_as_id );
    id_skew = Numbers.subtract( first_branch_as_id, first_tip_as_id );
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( message );
        while ( left_wall.numL( branch_index_limit ))
        {
          utilities_macros.note_percent_progress( left_wall, branch_index_limit );
          SubLObject probe_index = Numbers.integerDivide( Numbers.add( left_wall, branch_index_limit ), TWO_INTEGER );
          final SubLObject branch_desc = make_elpart_as_desc( UNPROVIDED );
          final SubLObject tip_desc = make_elpart_as_desc( UNPROVIDED );
          enummiss_fetch_specific_assertion_information( fvector, branch_desc, probe_index );
          final SubLObject tip_as_id = Numbers.subtract( elpart_as_desc_id( branch_desc ), id_skew );
          enummiss_compute_specific_assertion_information( tip_desc, tip_as_id );
          if( NIL != same_elpart_as_descP( branch_desc, tip_desc ) )
          {
            last_shared = elpart_as_desc_extra( tip_desc );
            if( probe_index.numE( left_wall ) )
            {
              left_wall = branch_index_limit;
            }
            else
            {
              left_wall = probe_index;
            }
          }
          else
          {
            SubLObject right_wall = probe_index;
            while ( left_wall.numLE( right_wall ))
            {
              probe_index = Numbers.integerDivide( Numbers.add( left_wall, right_wall ), TWO_INTEGER );
              enummiss_fetch_specific_assertion_information( fvector, branch_desc, probe_index );
              final SubLObject tip_as_id2 = Numbers.subtract( elpart_as_desc_id( branch_desc ), id_skew );
              enummiss_compute_specific_assertion_information( tip_desc, tip_as_id2 );
              if( NIL != same_elpart_as_descP( branch_desc, tip_desc ) )
              {
                left_wall = Numbers.add( probe_index, ONE_INTEGER );
                last_shared = elpart_as_desc_extra( tip_desc );
              }
              else
              {
                right_wall = Numbers.subtract( probe_index, ONE_INTEGER );
              }
            }
            enummiss_fetch_specific_assertion_information( fvector, branch_desc, right_wall );
            final SubLObject tip_last_good = Numbers.subtract( elpart_as_desc_id( branch_desc ), id_skew );
            final SubLObject tip_cursor = enummiss_find_next_relevant_assertion( tip_last_good );
            if( tip_cursor.isNegative() )
            {
              Errors.error( $str134$Not_yet_implemented_ );
            }
            else
            {
              enummiss_compute_specific_assertion_information( tip_desc, tip_cursor );
              enummiss_fetch_specific_assertion_information( fvector, branch_desc, left_wall );
              id_skew = Numbers.subtract( elpart_as_desc_id( branch_desc ), tip_cursor );
              while ( left_wall.numL( branch_index_limit ) && NIL == same_elpart_as_descP( branch_desc, tip_desc ))
              {
                deletions_noted = Numbers.add( deletions_noted, ONE_INTEGER );
                note_el_partition_branch_assertion_delete( data_sink, elpart_as_desc_tl_ist_formula( branch_desc ) );
                left_wall = Numbers.add( left_wall, ONE_INTEGER );
                enummiss_fetch_specific_assertion_information( fvector, branch_desc, left_wall );
                id_skew = Numbers.subtract( elpart_as_desc_id( branch_desc ), tip_cursor );
                if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && id_skew.numL( deletions_noted ) )
                {
                  Errors.error( $str135$Mhm__only__A_gaps_across_all_asse, id_skew, deletions_noted );
                }
              }
              if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && id_skew.numLE( deletions_noted ) )
              {
                Errors.error( $str135$Mhm__only__A_gaps_across_all_asse, id_skew, deletions_noted );
              }
              if( !left_wall.numL( branch_index_limit ) )
              {
                continue;
              }
              last_shared = elpart_as_desc_extra( tip_desc );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return last_shared;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 43637L)
  public static SubLObject find_start_of_el_partition_relevant_assertions(final SubLObject ceiling)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject tip_as_id = MINUS_ONE_INTEGER;
    SubLObject doneP = NIL;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( $str136$Finding_start_of_relevant_asserti );
        while ( NIL == doneP)
        {
          tip_as_id = Numbers.add( tip_as_id, ONE_INTEGER );
          utilities_macros.note_percent_progress( tip_as_id, ceiling );
          final SubLObject tip_assertion = assertion_handles.find_assertion_by_id( tip_as_id );
          doneP = makeBoolean( NIL != el_partition_relevant_assertionP( tip_assertion ) || tip_as_id.numG( ceiling ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$35, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return tip_as_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 44215L)
  public static SubLObject fetch_branch_limit_information_for_pickled_kb(final SubLObject fvector)
  {
    SubLObject branch_assertions_count = NIL;
    SubLObject branch_index_limit = NIL;
    SubLObject first_as_id = NIL;
    final SubLObject data_stream = file_vector.get_file_vector_data_stream( fvector );
    compatibility.set_file_position( data_stream, ZERO_INTEGER );
    cfasl.cfasl_input( data_stream, UNPROVIDED, UNPROVIDED );
    branch_assertions_count = cfasl.cfasl_input( data_stream, UNPROVIDED, UNPROVIDED );
    cfasl.cfasl_input( data_stream, UNPROVIDED, UNPROVIDED );
    branch_index_limit = file_vector.file_vector_length( fvector );
    final SubLObject branch_desc = make_elpart_as_desc( UNPROVIDED );
    enummiss_fetch_specific_assertion_information( fvector, branch_desc, ZERO_INTEGER );
    first_as_id = elpart_as_desc_id( branch_desc );
    return Values.values( branch_index_limit, branch_assertions_count, first_as_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 45059L)
  public static SubLObject enumerate_branch_assertions_missing_from_current_kb(final SubLObject pickled_file_stem, final SubLObject data_sink, final SubLObject shared_assertion, final SubLObject branch_as_id,
      final SubLObject branch_index, final SubLObject branch_count)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject data_file = pickling_data_filename( pickled_file_stem );
    final SubLObject index_file = pickling_index_filename( pickled_file_stem );
    SubLObject fvector = NIL;
    try
    {
      fvector = file_vector.new_file_vector( data_file, index_file, $kw65$INPUT, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      enumerate_missing_assertions_before_shared( fvector, data_sink, branch_index );
      SubLObject prev_cursor;
      SubLObject cursor = prev_cursor = branch_index;
      final SubLObject total_id_skew = Numbers.subtract( branch_as_id, assertion_handles.assertion_id( shared_assertion ) );
      final SubLObject message = Sequences.cconcatenate( $str94$Analyzing_, new SubLObject[] { format_nil.format_nil_a_no_copy( total_id_skew ), $str137$_assertion_gaps_____
      } );
      SubLObject id_skew = total_id_skew;
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( message );
          while ( ZERO_INTEGER.numL( id_skew ))
          {
            utilities_macros.note_percent_progress( Numbers.subtract( total_id_skew, id_skew ), total_id_skew );
            final SubLObject run_length_guess = Numbers.max( ONE_INTEGER, Numbers.integerDivide( cursor, id_skew ) );
            final SubLObject probe_index = Numbers.max( ZERO_INTEGER, Numbers.subtract( cursor, run_length_guess ) );
            final SubLObject branch_desc = make_elpart_as_desc( UNPROVIDED );
            final SubLObject tip_desc = make_elpart_as_desc( UNPROVIDED );
            enummiss_fetch_specific_assertion_information( fvector, branch_desc, probe_index );
            final SubLObject tip_as_id = Numbers.subtract( elpart_as_desc_id( branch_desc ), id_skew );
            enummiss_compute_specific_assertion_information( tip_desc, tip_as_id );
            if( NIL != same_elpart_as_descP( branch_desc, tip_desc ) )
            {
              prev_cursor = cursor;
              cursor = probe_index;
              if( !prev_cursor.numE( cursor ) )
              {
                continue;
              }
              id_skew = ZERO_INTEGER;
            }
            else
            {
              SubLObject branch_last_good = probe_index;
              while ( branch_last_good.numLE( cursor ))
              {
                final SubLObject search_cursor = Numbers.integerDivide( Numbers.add( branch_last_good, cursor ), TWO_INTEGER );
                enummiss_fetch_specific_assertion_information( fvector, branch_desc, search_cursor );
                final SubLObject tip_as_id2 = Numbers.subtract( elpart_as_desc_id( branch_desc ), id_skew );
                enummiss_compute_specific_assertion_information( tip_desc, tip_as_id2 );
                if( NIL != same_elpart_as_descP( branch_desc, tip_desc ) )
                {
                  cursor = Numbers.subtract( search_cursor, ONE_INTEGER );
                }
                else
                {
                  branch_last_good = Numbers.add( search_cursor, ONE_INTEGER );
                }
              }
              enummiss_fetch_specific_assertion_information( fvector, branch_desc, branch_last_good );
              final SubLObject tip_last_good = Numbers.subtract( elpart_as_desc_id( branch_desc ), id_skew );
              final SubLObject tip_cursor = enummiss_find_previous_relevant_assertion( tip_last_good );
              if( tip_cursor.isNegative() )
              {
                while ( NIL != subl_promotions.non_negative_integer_p( cursor ))
                {
                  enummiss_fetch_specific_assertion_information( fvector, branch_desc, cursor );
                  note_el_partition_branch_assertion_delete( data_sink, elpart_as_desc_tl_ist_formula( branch_desc ) );
                  cursor = Numbers.subtract( cursor, ONE_INTEGER );
                }
                id_skew = ZERO_INTEGER;
              }
              else
              {
                enummiss_compute_specific_assertion_information( tip_desc, tip_cursor );
                enummiss_fetch_specific_assertion_information( fvector, branch_desc, cursor );
                id_skew = Numbers.subtract( elpart_as_desc_id( branch_desc ), tip_cursor );
                while ( NIL == same_elpart_as_descP( branch_desc, tip_desc ))
                {
                  note_el_partition_branch_assertion_delete( data_sink, elpart_as_desc_tl_ist_formula( branch_desc ) );
                  cursor = Numbers.subtract( cursor, ONE_INTEGER );
                  enummiss_fetch_specific_assertion_information( fvector, branch_desc, cursor );
                  id_skew = Numbers.subtract( elpart_as_desc_id( branch_desc ), tip_cursor );
                  if( NIL == subl_promotions.non_negative_integer_p( id_skew ) )
                  {
                    final SubLObject last_good_desc = make_elpart_as_desc( UNPROVIDED );
                    enummiss_fetch_specific_assertion_information( fvector, last_good_desc, branch_last_good );
                    Errors.error( $str138$Error_realigning_BRANCH___A__now_, last_good_desc, branch_desc, tip_desc );
                  }
                }
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$36, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( NIL != file_vector.file_vector_p( fvector ) )
        {
          file_vector.close_file_vector( fvector );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    return pickled_file_stem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 51214L)
  public static SubLObject same_elpart_as_descP(final SubLObject a_desc, final SubLObject b_desc)
  {
    return makeBoolean( elpart_as_desc_hash( a_desc ).eql( elpart_as_desc_hash( b_desc ) ) && elpart_as_desc_weak_ist_formula( a_desc ).equal( elpart_as_desc_weak_ist_formula( b_desc ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 51701L)
  public static SubLObject enummiss_find_previous_relevant_assertion(final SubLObject tip_last_good)
  {
    SubLObject tip_cursor;
    for( tip_cursor = Numbers.subtract( tip_last_good, ONE_INTEGER ); NIL != subl_promotions.non_negative_integer_p( tip_cursor ); tip_cursor = Numbers.subtract( tip_cursor, ONE_INTEGER ) )
    {
      final SubLObject tip_assertion = assertion_handles.find_assertion_by_id( tip_cursor );
      if( NIL != el_partition_relevant_assertionP( tip_assertion ) )
      {
        return tip_cursor;
      }
    }
    return tip_cursor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 52219L)
  public static SubLObject enummiss_find_next_relevant_assertion(final SubLObject tip_last_good)
  {
    for( SubLObject tip_cursor = Numbers.add( tip_last_good, ONE_INTEGER ), limit = assertion_handles.get_file_backed_assertion_internal_id_threshold(); tip_cursor.numL( limit ); tip_cursor = Numbers.add( tip_cursor,
        ONE_INTEGER ) )
    {
      final SubLObject tip_assertion = assertion_handles.find_assertion_by_id( tip_cursor );
      if( NIL != el_partition_relevant_assertionP( tip_assertion ) )
      {
        return tip_cursor;
      }
    }
    return MINUS_ONE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 52777L)
  public static SubLObject enummiss_fetch_specific_assertion_information(final SubLObject fvector, final SubLObject branch_desc, final SubLObject index)
  {
    final SubLObject data_stream = file_vector.get_file_vector_data_stream( fvector );
    file_vector.position_file_vector( fvector, index );
    _csetf_elpart_as_desc_extra( branch_desc, index );
    _csetf_elpart_as_desc_id( branch_desc, cfasl.cfasl_input( data_stream, UNPROVIDED, UNPROVIDED ) );
    final SubLObject as_tl_ist_formula = cfasl.cfasl_input( data_stream, UNPROVIDED, UNPROVIDED );
    final SubLObject weak_ist_formula = enummiss_compute_weakened_ist_formula( as_tl_ist_formula );
    _csetf_elpart_as_desc_tl_ist_formula( branch_desc, as_tl_ist_formula );
    _csetf_elpart_as_desc_weak_ist_formula( branch_desc, weak_ist_formula );
    _csetf_elpart_as_desc_hash( branch_desc, Sxhash.sxhash( weak_ist_formula ) );
    return branch_desc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 53548L)
  public static SubLObject enummiss_compute_specific_assertion_information(final SubLObject tip_desc, final SubLObject potential_id)
  {
    enummiss_clear_specific_assertion_information( tip_desc );
    _csetf_elpart_as_desc_id( tip_desc, potential_id );
    if( NIL != subl_promotions.non_negative_integer_p( potential_id ) )
    {
      final SubLObject tip_assertion = assertion_handles.find_assertion_by_id( potential_id );
      final SubLObject tl_ist_formula = assertion_to_pickling_format( tip_assertion );
      final SubLObject weak_ist_formula = enummiss_compute_weakened_ist_formula( tl_ist_formula );
      _csetf_elpart_as_desc_extra( tip_desc, tip_assertion );
      _csetf_elpart_as_desc_tl_ist_formula( tip_desc, tl_ist_formula );
      _csetf_elpart_as_desc_weak_ist_formula( tip_desc, weak_ist_formula );
      _csetf_elpart_as_desc_hash( tip_desc, Sxhash.sxhash( weak_ist_formula ) );
    }
    return tip_desc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 54312L)
  public static SubLObject enummiss_clear_specific_assertion_information(final SubLObject desc)
  {
    _csetf_elpart_as_desc_id( desc, NIL );
    _csetf_elpart_as_desc_extra( desc, NIL );
    _csetf_elpart_as_desc_hash( desc, NIL );
    _csetf_elpart_as_desc_tl_ist_formula( desc, NIL );
    _csetf_elpart_as_desc_weak_ist_formula( desc, NIL );
    return desc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 54622L)
  public static SubLObject enummiss_compute_weakened_ist_formula(final SubLObject tl_ist_formula)
  {
    SubLObject weak_formula = conses_high.copy_tree( tl_ist_formula );
    SubLObject cdolist_list_var = cycl_utilities.expression_gather( weak_formula, $sym140$ENUMMISS_TL_HP_NOTATION, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject named_term = NIL;
    named_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = named_term;
      SubLObject hp_marker = NIL;
      SubLObject constant_name = NIL;
      SubLObject guid = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list139 );
      hp_marker = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list139 );
      constant_name = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list139 );
      guid = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject current_$38;
        final SubLObject datum_$37 = current_$38 = guid;
        SubLObject guid_marker = NIL;
        SubLObject guid_string = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$38, datum_$37, $list53 );
        guid_marker = current_$38.first();
        current_$38 = current_$38.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$38, datum_$37, $list53 );
        guid_string = current_$38.first();
        current_$38 = current_$38.rest();
        if( NIL == current_$38 )
        {
          final SubLObject new_named_term = guid_string;
          weak_formula = cycl_utilities.expression_nsubst( new_named_term, named_term, weak_formula, EQUAL, UNPROVIDED );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$37, $list53 );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list139 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      named_term = cdolist_list_var.first();
    }
    return weak_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 55464L)
  public static SubLObject enummiss_tl_hp_notation(final SubLObject v_object)
  {
    if( !v_object.isCons() || $kw141$HP != ConsesLow.nth( ZERO_INTEGER, v_object ) || !ConsesLow.nth( ONE_INTEGER, v_object ).isString() || NIL == list_utilities.lengthE( v_object, THREE_INTEGER, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject guid_part = ConsesLow.nth( TWO_INTEGER, v_object );
    return makeBoolean( guid_part.isCons() && $kw52$GUID == ConsesLow.nth( ZERO_INTEGER, guid_part ) && ConsesLow.nth( ONE_INTEGER, guid_part ).isString() && NIL != list_utilities.lengthE( guid_part, TWO_INTEGER,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 55928L)
  public static SubLObject enumerate_missing_assertions_before_shared(final SubLObject fvector, final SubLObject data_sink, final SubLObject branch_index)
  {
    SubLObject last_index = Numbers.subtract( file_vector.file_vector_length( fvector ), ONE_INTEGER );
    final SubLObject data_stream = file_vector.get_file_vector_data_stream( fvector );
    while ( branch_index.numL( last_index ))
    {
      file_vector.position_file_vector( fvector, last_index );
      final SubLObject branch_as_id = cfasl.cfasl_input( data_stream, UNPROVIDED, UNPROVIDED );
      final SubLObject branch_tl_ist_formula = cfasl.cfasl_input( data_stream, UNPROVIDED, UNPROVIDED );
      note_el_partition_branch_assertion_delete( data_sink, branch_tl_ist_formula );
      last_index = Numbers.subtract( last_index, ONE_INTEGER );
    }
    return data_sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 56751L)
  public static SubLObject scan_enumerate_branch_assertions_missing_from_current_kb(final SubLObject pickled_file_stem, final SubLObject data_sink, SubLObject relevant_id_space)
  {
    if( relevant_id_space == UNPROVIDED )
    {
      relevant_id_space = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !relevant_id_space.isVector() )
    {
      Errors.error( $str142$Sorry__FAST_is_currently_not_impl );
    }
    final SubLObject data_file = pickling_data_filename( pickled_file_stem );
    final SubLObject index_file = pickling_index_filename( pickled_file_stem );
    SubLObject last_shared_as_id = MINUS_ONE_INTEGER;
    SubLObject fvector = NIL;
    try
    {
      fvector = file_vector.new_file_vector( data_file, index_file, $kw65$INPUT, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject branch_count = file_vector.file_vector_length( fvector );
      SubLObject last_shared_branch_index = MINUS_ONE_INTEGER;
      SubLObject index_skew = ZERO_INTEGER;
      final SubLObject message = Sequences.cconcatenate( $str94$Analyzing_, new SubLObject[] { format_nil.format_nil_a_no_copy( branch_count ), $str143$_branch_assertions_____
      } );
      final SubLObject branch_as = make_elpart_as_desc( UNPROVIDED );
      final SubLObject tip_as = make_elpart_as_desc( UNPROVIDED );
      final SubLObject branch_limit = Numbers.subtract( branch_count, ONE_INTEGER );
      final SubLObject tip_limit = relevant_id_space.isVector() ? Sequences.length( relevant_id_space ) : Numbers.subtract( assertion_handles.assertion_count(), ONE_INTEGER );
      SubLObject doneP = NIL;
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( message );
          while ( NIL == doneP)
          {
            SubLObject offset = ONE_INTEGER;
            SubLObject branch_index = Numbers.add( last_shared_branch_index, offset );
            SubLObject situation = NIL;
            utilities_macros.note_percent_progress( branch_index, branch_limit );
            scan_enummiss_load_branch_assertion( branch_as, fvector, branch_index, branch_limit );
            if( relevant_id_space.isVector() )
            {
              scan_enummiss_corresponding_relevant_tip_assertion( tip_as, branch_index, index_skew, relevant_id_space );
            }
            else
            {
              scan_enummiss_corresponding_tip_assertion( tip_as, branch_as, index_skew, tip_limit );
            }
            final SubLObject pcase_var;
            situation = ( pcase_var = scan_enummiss_classify_situation( branch_as, tip_as ) );
            if( pcase_var.eql( $kw144$BOTH_INVALID ) )
            {
              doneP = T;
            }
            else if( pcase_var.eql( $kw145$INVALID_BRANCH ) )
            {
              doneP = T;
            }
            else if( pcase_var.eql( $kw146$INVALID_TIP ) )
            {
              enumerate_missing_assertions_before_shared( fvector, data_sink, branch_count );
              doneP = T;
            }
            else if( pcase_var.eql( $kw147$DIFFERENT ) )
            {
              note_el_partition_branch_assertion_delete( data_sink, elpart_as_desc_tl_ist_formula( branch_as ) );
              index_skew = Numbers.add( index_skew, ONE_INTEGER );
              last_shared_branch_index = branch_index;
            }
            else if( pcase_var.eql( $kw148$EQUAL ) )
            {
              while ( situation == $kw148$EQUAL)
              {
                last_shared_branch_index = branch_index;
                last_shared_as_id = elpart_as_desc_id( tip_as );
                utilities_macros.note_percent_progress( last_shared_branch_index, branch_limit );
                branch_index = Numbers.add( last_shared_branch_index, offset );
                offset = Numbers.add( offset, offset );
                scan_enummiss_load_branch_assertion( branch_as, fvector, branch_index, branch_limit );
                if( relevant_id_space.isVector() )
                {
                  scan_enummiss_corresponding_relevant_tip_assertion( tip_as, branch_index, index_skew, relevant_id_space );
                }
                else
                {
                  scan_enummiss_corresponding_tip_assertion( tip_as, branch_as, index_skew, tip_limit );
                }
                situation = scan_enummiss_classify_situation( branch_as, tip_as );
              }
            }
            else
            {
              Errors.error( $str149$Unknown_state__A____do_not_know_w, situation );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$39, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( NIL != file_vector.file_vector_p( fvector ) )
        {
          file_vector.close_file_vector( fvector );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    return assertion_handles.find_assertion_by_id( last_shared_as_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 61509L)
  public static SubLObject scan_enummiss_load_branch_assertion(final SubLObject branch_as, final SubLObject fvector, final SubLObject branch_index, final SubLObject branch_limit)
  {
    if( branch_limit.numL( branch_index ) )
    {
      enummiss_clear_specific_assertion_information( branch_as );
    }
    else
    {
      enummiss_fetch_specific_assertion_information( fvector, branch_as, branch_index );
    }
    return branch_as;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 61825L)
  public static SubLObject scan_enummiss_corresponding_relevant_tip_assertion(final SubLObject tip_as, final SubLObject branch_index, final SubLObject index_skew, final SubLObject relevant_id_space)
  {
    final SubLObject tip_index = Numbers.subtract( branch_index, index_skew );
    enummiss_clear_specific_assertion_information( tip_as );
    if( NIL != subl_promotions.non_negative_integer_p( tip_index ) && tip_index.numL( Sequences.length( relevant_id_space ) ) )
    {
      final SubLObject tip_as_id = Vectors.aref( relevant_id_space, tip_index );
      enummiss_compute_specific_assertion_information( tip_as, tip_as_id );
    }
    return tip_as;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 62325L)
  public static SubLObject scan_enummiss_corresponding_tip_assertion(final SubLObject tip_as, final SubLObject branch_as, final SubLObject index_skew, final SubLObject tip_limit)
  {
    final SubLObject branch_as_id = elpart_as_desc_id( branch_as );
    if( NIL != subl_promotions.non_negative_integer_p( branch_as_id ) )
    {
      final SubLObject tip_index = Numbers.subtract( branch_as_id, index_skew );
      scan_enummiss_load_tip_assertion( tip_as, tip_index, tip_limit );
    }
    else
    {
      enummiss_clear_specific_assertion_information( tip_as );
    }
    return tip_as;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 62747L)
  public static SubLObject scan_enummiss_load_tip_assertion(final SubLObject tip_as, final SubLObject tip_index, final SubLObject tip_limit)
  {
    if( tip_limit.numL( tip_index ) )
    {
      enummiss_clear_specific_assertion_information( tip_as );
    }
    else
    {
      final SubLObject tip_as_id = enummiss_find_previous_relevant_assertion( Numbers.add( ONE_INTEGER, tip_index ) );
      enummiss_compute_specific_assertion_information( tip_as, tip_as_id );
    }
    return tip_as;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 63188L)
  public static SubLObject scan_enummiss_classify_situation(final SubLObject branch_as, final SubLObject tip_as)
  {
    if( NIL == elpart_as_desc_hash( branch_as ) )
    {
      if( NIL == elpart_as_desc_hash( tip_as ) )
      {
        return $kw144$BOTH_INVALID;
      }
      return $kw145$INVALID_BRANCH;
    }
    else
    {
      if( NIL == elpart_as_desc_hash( tip_as ) )
      {
        return $kw146$INVALID_TIP;
      }
      if( NIL != same_elpart_as_descP( branch_as, tip_as ) )
      {
        return $kw148$EQUAL;
      }
      return $kw147$DIFFERENT;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 65709L)
  public static SubLObject test_helper_get_assertion(final SubLObject v, final SubLObject i)
  {
    if( NIL != subl_promotions.non_negative_integer_p( i ) && i.numL( Sequences.length( v ) ) )
    {
      return Vectors.aref( v, i );
    }
    return $kw158$INVALID;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 65878L)
  public static SubLObject test_helper_classify_situation(final SubLObject branch_as, final SubLObject tip_as)
  {
    if( $kw158$INVALID == branch_as )
    {
      if( $kw158$INVALID == tip_as )
      {
        return $kw144$BOTH_INVALID;
      }
      return $kw145$INVALID_BRANCH;
    }
    else
    {
      if( $kw158$INVALID == tip_as )
      {
        return $kw146$INVALID_TIP;
      }
      if( branch_as.equal( tip_as ) )
      {
        return $kw148$EQUAL;
      }
      return $kw147$DIFFERENT;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 66222L)
  public static SubLObject test_el_partition_simple_scan_algorithm(final SubLObject branch_ases, final SubLObject tip_ases)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject operations = NIL;
    SubLObject last_shared_branch_index = MINUS_ONE_INTEGER;
    SubLObject index_skew = ZERO_INTEGER;
    final SubLObject limit = Numbers.multiply( Sequences.length( branch_ases ), Sequences.length( tip_ases ) );
    SubLObject step = ZERO_INTEGER;
    SubLObject doneP = NIL;
    while ( NIL == doneP)
    {
      step = Numbers.add( step, ONE_INTEGER );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !step.numL( limit ) )
      {
        Errors.error( $str159$Someone_is_whaffling_____ );
      }
      SubLObject offset = ONE_INTEGER;
      SubLObject branch_index = Numbers.add( last_shared_branch_index, offset );
      SubLObject tip_index = Numbers.subtract( branch_index, index_skew );
      SubLObject branch_as = test_helper_get_assertion( branch_ases, branch_index );
      SubLObject tip_as = test_helper_get_assertion( tip_ases, tip_index );
      final SubLObject pcase_var;
      SubLObject situation = pcase_var = test_helper_classify_situation( branch_as, tip_as );
      if( pcase_var.eql( $kw144$BOTH_INVALID ) )
      {
        doneP = T;
      }
      else if( pcase_var.eql( $kw145$INVALID_BRANCH ) )
      {
        for( SubLObject sequence_var = Sequences.subseq( tip_ases, tip_index, UNPROVIDED ), end_index = sequence_var.isList() ? NIL
            : Sequences.length( sequence_var ), element_num = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP( element_num, end_index,
                sequence_var ); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP( element_num, end_index, sequence_var ) )
        {
          final SubLObject as = subl_macros.do_sequence_index_valueP( element_num, sequence_var );
          operations = ConsesLow.cons( ConsesLow.list( $kw160$CREATE, as ), operations );
          sequence_var = subl_macros.do_sequence_index_update( sequence_var );
          element_num = Numbers.add( element_num, ONE_INTEGER );
        }
        doneP = T;
      }
      else if( pcase_var.eql( $kw146$INVALID_TIP ) )
      {
        for( SubLObject sequence_var = Sequences.subseq( branch_ases, branch_index, UNPROVIDED ), end_index = sequence_var.isList() ? NIL
            : Sequences.length( sequence_var ), element_num = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP( element_num, end_index,
                sequence_var ); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP( element_num, end_index, sequence_var ) )
        {
          final SubLObject as = subl_macros.do_sequence_index_valueP( element_num, sequence_var );
          operations = ConsesLow.cons( ConsesLow.list( $kw161$DELETE, as ), operations );
          sequence_var = subl_macros.do_sequence_index_update( sequence_var );
          element_num = Numbers.add( element_num, ONE_INTEGER );
        }
        doneP = T;
      }
      else if( pcase_var.eql( $kw147$DIFFERENT ) )
      {
        operations = ConsesLow.cons( ConsesLow.list( $kw161$DELETE, branch_as ), operations );
        index_skew = Numbers.add( index_skew, ONE_INTEGER );
        last_shared_branch_index = branch_index;
      }
      else if( pcase_var.eql( $kw148$EQUAL ) )
      {
        while ( situation == $kw148$EQUAL)
        {
          last_shared_branch_index = branch_index;
          branch_index = Numbers.add( last_shared_branch_index, offset );
          offset = Numbers.add( offset, offset );
          tip_index = Numbers.subtract( branch_index, index_skew );
          branch_as = test_helper_get_assertion( branch_ases, branch_index );
          tip_as = test_helper_get_assertion( tip_ases, tip_index );
          situation = test_helper_classify_situation( branch_as, tip_as );
          step = Numbers.add( step, ONE_INTEGER );
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !step.numL( limit ) )
          {
            Errors.error( $str159$Someone_is_whaffling_____ );
          }
        }
      }
      else
      {
        Errors.error( $str149$Unknown_state__A____do_not_know_w, situation );
      }
    }
    return Sequences.nreverse( operations );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 68585L)
  public static SubLObject generate_el_partition_simple_scan_case(final SubLObject size, final SubLObject additions, final SubLObject deletions)
  {
    final SubLObject blacklist = set.new_set( EQ, deletions );
    SubLObject change_log = NIL;
    SubLObject branch_ases = NIL;
    SubLObject tip_ases = NIL;
    branch_ases = Vectors.make_vector( size, UNPROVIDED );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( size ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      Vectors.set_aref( branch_ases, i, i );
    }
    while ( set.set_size( blacklist ).numL( deletions ))
    {
      set.set_add( random.random( size ), blacklist );
    }
    final SubLObject tip_size = Numbers.add( size, additions, Numbers.minus( deletions ) );
    tip_ases = Vectors.make_vector( tip_size, UNPROVIDED );
    SubLObject index = ZERO_INTEGER;
    SubLObject j;
    for( j = NIL, j = ZERO_INTEGER; j.numL( size ); j = Numbers.add( j, ONE_INTEGER ) )
    {
      if( NIL != set.set_memberP( j, blacklist ) )
      {
        change_log = ConsesLow.cons( ConsesLow.list( $kw161$DELETE, j ), change_log );
      }
      else
      {
        Vectors.set_aref( tip_ases, index, j );
        index = Numbers.add( index, ONE_INTEGER );
      }
    }
    SubLObject value;
    for( j = NIL, j = ZERO_INTEGER; j.numL( additions ); j = Numbers.add( j, ONE_INTEGER ) )
    {
      value = Numbers.add( size, j );
      change_log = ConsesLow.cons( ConsesLow.list( $kw160$CREATE, value ), change_log );
      Vectors.set_aref( tip_ases, index, value );
      index = Numbers.add( index, ONE_INTEGER );
    }
    return Values.values( branch_ases, tip_ases, Sequences.nreverse( change_log ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 70162L)
  public static SubLObject test_random_el_partition_simple_scan_cases(final SubLObject n, final SubLObject size, final SubLObject addition_range, final SubLObject deletions_range)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject i;
    SubLObject additions;
    SubLObject deletions;
    SubLObject branch_ases;
    SubLObject tip_ases;
    SubLObject expected_change_log;
    SubLObject actual_change_log;
    for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      additions = random.random( addition_range );
      deletions = random.random( deletions_range );
      thread.resetMultipleValues();
      branch_ases = generate_el_partition_simple_scan_case( size, additions, deletions );
      tip_ases = thread.secondMultipleValue();
      expected_change_log = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      actual_change_log = test_el_partition_simple_scan_algorithm( branch_ases, tip_ases );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !expected_change_log.equal( actual_change_log ) )
      {
        Errors.error( $str164$Expected__A__got__A_instead_, expected_change_log, actual_change_log );
      }
    }
    return $kw165$OK;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLObject el_partition_data_sink_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLObject el_partition_data_sink_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $el_partition_data_sink_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLObject elpart_dsink_state(final SubLObject v_object)
  {
    assert NIL != el_partition_data_sink_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLObject elpart_dsink_branch_cdel_fn(final SubLObject v_object)
  {
    assert NIL != el_partition_data_sink_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLObject elpart_dsink_branch_asdel_fn(final SubLObject v_object)
  {
    assert NIL != el_partition_data_sink_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLObject elpart_dsink_tip_ccreate_fn(final SubLObject v_object)
  {
    assert NIL != el_partition_data_sink_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLObject elpart_dsink_tip_ascreate_fn(final SubLObject v_object)
  {
    assert NIL != el_partition_data_sink_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLObject elpart_dsink_tip_asreassert_fn(final SubLObject v_object)
  {
    assert NIL != el_partition_data_sink_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLObject _csetf_elpart_dsink_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != el_partition_data_sink_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLObject _csetf_elpart_dsink_branch_cdel_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != el_partition_data_sink_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLObject _csetf_elpart_dsink_branch_asdel_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != el_partition_data_sink_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLObject _csetf_elpart_dsink_tip_ccreate_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != el_partition_data_sink_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLObject _csetf_elpart_dsink_tip_ascreate_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != el_partition_data_sink_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLObject _csetf_elpart_dsink_tip_asreassert_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != el_partition_data_sink_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLObject make_el_partition_data_sink(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $el_partition_data_sink_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw186$STATE ) )
      {
        _csetf_elpart_dsink_state( v_new, current_value );
      }
      else if( pcase_var.eql( $kw187$BRANCH_CDEL_FN ) )
      {
        _csetf_elpart_dsink_branch_cdel_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw188$BRANCH_ASDEL_FN ) )
      {
        _csetf_elpart_dsink_branch_asdel_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw189$TIP_CCREATE_FN ) )
      {
        _csetf_elpart_dsink_tip_ccreate_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw190$TIP_ASCREATE_FN ) )
      {
        _csetf_elpart_dsink_tip_ascreate_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw191$TIP_ASREASSERT_FN ) )
      {
        _csetf_elpart_dsink_tip_asreassert_fn( v_new, current_value );
      }
      else
      {
        Errors.error( $str121$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLObject visit_defstruct_el_partition_data_sink(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw122$BEGIN, $sym192$MAKE_EL_PARTITION_DATA_SINK, SIX_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw124$SLOT, $kw186$STATE, elpart_dsink_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw124$SLOT, $kw187$BRANCH_CDEL_FN, elpart_dsink_branch_cdel_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw124$SLOT, $kw188$BRANCH_ASDEL_FN, elpart_dsink_branch_asdel_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw124$SLOT, $kw189$TIP_CCREATE_FN, elpart_dsink_tip_ccreate_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw124$SLOT, $kw190$TIP_ASCREATE_FN, elpart_dsink_tip_ascreate_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw124$SLOT, $kw191$TIP_ASREASSERT_FN, elpart_dsink_tip_asreassert_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw125$END, $sym192$MAKE_EL_PARTITION_DATA_SINK, SIX_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72266L)
  public static SubLObject visit_defstruct_object_el_partition_data_sink_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_el_partition_data_sink( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 72628L)
  public static SubLObject new_el_partition_data_sink(final SubLObject state, final SubLObject branch_constant_delete_fn, final SubLObject branch_assertion_delete_fn, final SubLObject tip_constant_create_fn,
      final SubLObject tip_assertion_create_fn, final SubLObject tip_assertion_reassert_fn)
  {
    final SubLObject sink = make_el_partition_data_sink( UNPROVIDED );
    _csetf_elpart_dsink_state( sink, state );
    _csetf_elpart_dsink_branch_cdel_fn( sink, branch_constant_delete_fn );
    _csetf_elpart_dsink_branch_asdel_fn( sink, branch_assertion_delete_fn );
    _csetf_elpart_dsink_tip_ccreate_fn( sink, tip_constant_create_fn );
    _csetf_elpart_dsink_tip_ascreate_fn( sink, tip_assertion_create_fn );
    _csetf_elpart_dsink_tip_asreassert_fn( sink, tip_assertion_reassert_fn );
    return sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 73455L)
  public static SubLObject note_el_partition_branch_constant_delete(final SubLObject sink, final SubLObject name, final SubLObject guid)
  {
    final SubLObject cdel_fn = elpart_dsink_branch_cdel_fn( sink );
    Functions.funcall( cdel_fn, sink, name, guid );
    return sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 73722L)
  public static SubLObject note_el_partition_branch_assertion_delete(final SubLObject sink, final SubLObject tl_ist_formula)
  {
    final SubLObject asdel_fn = elpart_dsink_branch_asdel_fn( sink );
    Functions.funcall( asdel_fn, sink, tl_ist_formula );
    return sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 74002L)
  public static SubLObject note_el_partition_tip_constant_create(final SubLObject sink, final SubLObject constant)
  {
    final SubLObject ccreate_fn = elpart_dsink_tip_ccreate_fn( sink );
    Functions.funcall( ccreate_fn, sink, constant );
    return sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 74296L)
  public static SubLObject note_el_partition_tip_assertion_create(final SubLObject sink, final SubLObject assertion)
  {
    final SubLObject ascreate_fn = elpart_dsink_tip_ascreate_fn( sink );
    Functions.funcall( ascreate_fn, sink, assertion );
    return sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 74598L)
  public static SubLObject note_el_partition_tip_assertion_reassert(final SubLObject sink, final SubLObject assertion, SubLObject strength, SubLObject direction)
  {
    if( strength == UNPROVIDED )
    {
      strength = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLObject ascreate_fn = elpart_dsink_tip_asreassert_fn( sink );
    Functions.funcall( ascreate_fn, sink, assertion, strength, direction );
    return sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 74952L)
  public static SubLObject get_el_partition_data_sink_state(final SubLObject sink)
  {
    return elpart_dsink_state( sink );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 75758L)
  public static SubLObject with_el_partition_creator(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject creator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
    creator = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym200$_EL_PARTITION_CREATOR_OVERRIDE_, creator ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list199 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 75938L)
  public static SubLObject with_el_partition_creation_purpose(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list201 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject purpose = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list201 );
    purpose = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym202$_EL_PARTITION_CREATION_PURPOSE_OVERRIDE_, purpose ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list201 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 76140L)
  public static SubLObject with_el_partition_mt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list203 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list203 );
    mt = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym204$_EL_PARTITION_MT_OVERRIDE_, mt ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list203 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 76298L)
  public static SubLObject with_el_partition_direction(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list205 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject direction = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list205 );
    direction = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym5$CLET, ConsesLow.list( ConsesLow.list( $sym206$_EL_PARTITION_DIRECTION_OVERRIDE_, direction ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list205 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 76484L)
  public static SubLObject without_el_partition_creation_purpose(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym5$CLET, $list207, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 76762L)
  public static SubLObject new_transcript_el_partition_data_sink(final SubLObject stream)
  {
    return new_el_partition_data_sink( stream, $sym208$TRANSCRIPT_DATA_SINK_BRANCH_CONSTANT_DELETE, $sym209$TRANSCRIPT_DATA_SINK_BRANCH_ASSERTION_DELETE, $sym210$TRANSCRIPT_DATA_SINK_TIP_CONSTANT_CREATE,
        $sym211$TRANSCRIPT_DATA_SINK_TIP_ASSERTION_CREATE, $sym212$TRANSCRIPT_DATA_SINK_TIP_ASSERTION_REASSERT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 77290L)
  public static SubLObject transcript_data_sink_branch_constant_delete(final SubLObject sink, final SubLObject name, final SubLObject guid)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject stream = get_el_partition_data_sink_state( sink );
    transcript_data_sink_form_prologue( stream );
    final SubLObject _prev_bind_0 = print_high.$print_level$.currentBinding( thread );
    final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding( thread );
    try
    {
      print_high.$print_level$.bind( NIL, thread );
      print_high.$print_length$.bind( NIL, thread );
      PrintLow.format( stream, $str213$_FI_KILL____HP__S__S__, name, guid );
    }
    finally
    {
      print_high.$print_length$.rebind( _prev_bind_2, thread );
      print_high.$print_level$.rebind( _prev_bind_0, thread );
    }
    transcript_data_sink_form_epilogue( stream );
    return sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 77874L)
  public static SubLObject transcript_data_sink_branch_assertion_delete(final SubLObject sink, final SubLObject pickled_tl_ist_formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject stream = get_el_partition_data_sink_state( sink );
    final SubLObject tl_ist_formula = unpickle_assertion_pickling_format( pickled_tl_ist_formula );
    final SubLObject tl_elmt = cycl_utilities.formula_arg1( tl_ist_formula, UNPROVIDED );
    transcript_data_sink_form_prologue( stream );
    final SubLObject _prev_bind_0 = print_high.$print_level$.currentBinding( thread );
    final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding( thread );
    try
    {
      print_high.$print_level$.bind( NIL, thread );
      print_high.$print_length$.bind( NIL, thread );
      PrintLow.format( stream, $str214$_FI_UNASSERT___S___S_, tl_ist_formula, tl_elmt );
    }
    finally
    {
      print_high.$print_length$.rebind( _prev_bind_2, thread );
      print_high.$print_level$.rebind( _prev_bind_0, thread );
    }
    transcript_data_sink_form_epilogue( stream );
    return sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 78961L)
  public static SubLObject transcript_data_sink_tip_constant_create(final SubLObject sink, final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject stream = get_el_partition_data_sink_state( sink );
    final SubLObject name = constants_high.constant_name( constant );
    final SubLObject guid = constants_high.constant_external_id( constant );
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding( thread );
    final SubLObject _prev_bind_3 = print_high.$print_level$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      print_high.$print_length$.bind( NIL, thread );
      print_high.$print_level$.bind( NIL, thread );
      transcript_data_sink_form_prologue( stream );
      PrintLow.format( stream, $str215$_FI_CREATE___S__S_, name, guid );
      transcript_data_sink_form_epilogue( stream );
    }
    finally
    {
      print_high.$print_level$.rebind( _prev_bind_3, thread );
      print_high.$print_length$.rebind( _prev_bind_2, thread );
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    transcript_data_sink_tip_constant_timestamp( sink, constant );
    return sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 79638L)
  public static SubLObject transcript_data_sink_tip_assertion_create(final SubLObject sink, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject stream = get_el_partition_data_sink_state( sink );
    final SubLObject ist_formula = uncanonicalizer.assertion_el_ist_formula( assertion );
    final SubLObject elmt = ( NIL != $el_partition_mt_override$.getDynamicValue( thread ) ) ? $el_partition_mt_override$.getDynamicValue( thread ) : cycl_utilities.formula_arg1( ist_formula, UNPROVIDED );
    final SubLObject formula = cycl_utilities.formula_arg2( ist_formula, UNPROVIDED );
    final SubLObject direction = ( NIL != $el_partition_direction_override$.getDynamicValue( thread ) ) ? $el_partition_direction_override$.getDynamicValue( thread ) : assertions_high.assertion_direction( assertion );
    final SubLObject strength = assertions_high.assertion_strength( assertion );
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding( thread );
    final SubLObject _prev_bind_3 = print_high.$print_level$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      print_high.$print_length$.bind( NIL, thread );
      print_high.$print_level$.bind( NIL, thread );
      transcript_data_sink_form_prologue( stream );
      PrintLow.format( stream, $str216$_FI_ASSERT___S___S___S___S_, new SubLObject[] { encapsulation.encapsulate( formula ), encapsulation.encapsulate( elmt ), strength, direction
      } );
      transcript_data_sink_form_epilogue( stream );
    }
    finally
    {
      print_high.$print_level$.rebind( _prev_bind_3, thread );
      print_high.$print_length$.rebind( _prev_bind_2, thread );
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    transcript_data_sink_tip_assertion_timestamp( sink, assertion );
    return sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 80928L)
  public static SubLObject transcript_data_sink_tip_assertion_reassert(final SubLObject sink, final SubLObject assertion, SubLObject new_strength, SubLObject new_direction)
  {
    if( new_strength == UNPROVIDED )
    {
      new_strength = NIL;
    }
    if( new_direction == UNPROVIDED )
    {
      new_direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject stream = get_el_partition_data_sink_state( sink );
    final SubLObject ist_formula = canon_tl.assertion_tl_ist_formula( assertion );
    final SubLObject elmt = ( NIL != $el_partition_mt_override$.getDynamicValue( thread ) ) ? $el_partition_mt_override$.getDynamicValue( thread ) : cycl_utilities.formula_arg1( ist_formula, UNPROVIDED );
    final SubLObject direction = ( NIL != $el_partition_direction_override$.getDynamicValue( thread ) ) ? $el_partition_direction_override$.getDynamicValue( thread )
        : ( ( NIL != new_direction ) ? new_direction : assertions_high.assertion_direction( assertion ) );
    final SubLObject strength = ( NIL != new_strength ) ? new_strength : assertions_high.assertion_strength( assertion );
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding( thread );
    final SubLObject _prev_bind_3 = print_high.$print_level$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      print_high.$print_length$.bind( NIL, thread );
      print_high.$print_level$.bind( NIL, thread );
      transcript_data_sink_form_prologue( stream );
      PrintLow.format( stream, $str217$_FI_REASSERT___S___S___S___S_, new SubLObject[] { encapsulation.encapsulate( ist_formula ), encapsulation.encapsulate( elmt ), strength, direction
      } );
      transcript_data_sink_form_epilogue( stream );
    }
    finally
    {
      print_high.$print_level$.rebind( _prev_bind_3, thread );
      print_high.$print_length$.rebind( _prev_bind_2, thread );
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    transcript_data_sink_tip_assertion_timestamp( sink, assertion );
    return sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 82749L)
  public static SubLObject transcript_data_sink_tip_constant_timestamp(final SubLObject sink, final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject stream = get_el_partition_data_sink_state( sink );
    final SubLObject creator = transcript_data_sink_clean_fort( ( NIL != $el_partition_creator_override$.getDynamicValue( thread ) ) ? $el_partition_creator_override$.getDynamicValue( thread )
        : bookkeeping_store.creator( constant, UNPROVIDED ) );
    final SubLObject time = bookkeeping_store.creation_time( constant, UNPROVIDED );
    final SubLObject purpose = transcript_data_sink_clean_fort( ( NIL != $el_partition_creation_purpose_override$.getDynamicValue( thread ) ) ? $el_partition_creation_purpose_override$.getDynamicValue( thread )
        : bookkeeping_store.creation_purpose( constant, UNPROVIDED ) );
    final SubLObject second = bookkeeping_store.creation_second( constant, UNPROVIDED );
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding( thread );
    final SubLObject _prev_bind_3 = print_high.$print_level$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      print_high.$print_length$.bind( NIL, thread );
      print_high.$print_level$.bind( NIL, thread );
      transcript_data_sink_form_prologue( stream );
      PrintLow.format( stream, $str218$_FI_TIMESTAMP_CONSTANT___S___S___, new SubLObject[] { encapsulation.encapsulate( creator ), encapsulation.encapsulate( time ), encapsulation.encapsulate( purpose ), encapsulation
          .encapsulate( second )
      } );
    }
    finally
    {
      print_high.$print_level$.rebind( _prev_bind_3, thread );
      print_high.$print_length$.rebind( _prev_bind_2, thread );
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    transcript_data_sink_form_epilogue( stream );
    return sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 83908L)
  public static SubLObject transcript_data_sink_tip_assertion_timestamp(final SubLObject sink, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject stream = get_el_partition_data_sink_state( sink );
    final SubLObject creator = transcript_data_sink_clean_fort( ( NIL != $el_partition_creator_override$.getDynamicValue( thread ) ) ? $el_partition_creator_override$.getDynamicValue( thread )
        : assertions_high.asserted_by( assertion ) );
    final SubLObject time = assertions_high.asserted_when( assertion );
    final SubLObject purpose = transcript_data_sink_clean_fort( ( NIL != $el_partition_creation_purpose_override$.getDynamicValue( thread ) ) ? $el_partition_creation_purpose_override$.getDynamicValue( thread )
        : assertions_high.asserted_why( assertion ) );
    final SubLObject second = assertions_high.asserted_second( assertion );
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding( thread );
    final SubLObject _prev_bind_3 = print_high.$print_level$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      print_high.$print_length$.bind( NIL, thread );
      print_high.$print_level$.bind( NIL, thread );
      transcript_data_sink_form_prologue( stream );
      PrintLow.format( stream, $str219$_FI_TIMESTAMP_ASSERTION___S___S__, new SubLObject[] { encapsulation.encapsulate( creator ), encapsulation.encapsulate( time ), encapsulation.encapsulate( purpose ), encapsulation
          .encapsulate( second )
      } );
      transcript_data_sink_form_epilogue( stream );
    }
    finally
    {
      print_high.$print_level$.rebind( _prev_bind_3, thread );
      print_high.$print_length$.rebind( _prev_bind_2, thread );
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    return sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 85075L)
  public static SubLObject transcript_data_sink_clean_fort(final SubLObject v_object)
  {
    return ( NIL != forts.valid_fortP( v_object ) ) ? v_object : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 85395L)
  public static SubLObject transcript_data_sink_form_prologue(final SubLObject stream)
  {
    streams_high.fresh_line( stream );
    streams_high.write_string( $str221$_, stream, UNPROVIDED, UNPROVIDED );
    print_high.prin1( $transcript_marker_guest_cyclist$.getGlobalValue(), stream );
    streams_high.write_string( $str132$_, stream, UNPROVIDED, UNPROVIDED );
    print_high.prin1( control_vars.cyc_image_id(), stream );
    streams_high.write_string( $str132$_, stream, UNPROVIDED, UNPROVIDED );
    print_high.prin1( numeric_date_utilities.get_universal_date( UNPROVIDED, UNPROVIDED ), stream );
    streams_high.write_string( $str132$_, stream, UNPROVIDED, UNPROVIDED );
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 85727L)
  public static SubLObject transcript_data_sink_form_epilogue(final SubLObject stream)
  {
    streams_high.write_string( $str222$_, stream, UNPROVIDED, UNPROVIDED );
    streams_high.terpri( stream );
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 85850L)
  public static SubLObject new_debug_el_partition_data_sink(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    return new_el_partition_data_sink( stream, $sym223$DEBUG_DATA_SINK_BRANCH_CONSTANT_DELETE, $sym224$DEBUG_DATA_SINK_BRANCH_ASSERTION_DELETE, $sym225$DEBUG_DATA_SINK_TIP_CONSTANT_CREATE,
        $sym226$DEBUG_DATA_SINK_TIP_ASSERTION_CREATE, $sym227$DEBUG_DATA_SINK_TIP_ASSERTION_REASSERT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 86486L)
  public static SubLObject debug_data_sink_branch_constant_delete(final SubLObject sink, final SubLObject name, final SubLObject guid)
  {
    final SubLObject stream = get_el_partition_data_sink_state( sink );
    PrintLow.format( stream, $str228$___kill__A__A__, name, guid );
    return sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 86682L)
  public static SubLObject debug_data_sink_branch_assertion_delete(final SubLObject sink, final SubLObject tl_ist_formula)
  {
    final SubLObject stream = get_el_partition_data_sink_state( sink );
    PrintLow.format( stream, $str229$___unassert__A__, tl_ist_formula );
    return sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 86889L)
  public static SubLObject debug_data_sink_tip_constant_create(final SubLObject sink, final SubLObject constant)
  {
    final SubLObject stream = get_el_partition_data_sink_state( sink );
    final SubLObject name = constants_high.constant_name( constant );
    final SubLObject guid = constants_high.constant_external_id( constant );
    PrintLow.format( stream, $str230$___create__A__A__, name, guid );
    return sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 87172L)
  public static SubLObject debug_data_sink_tip_assertion_create(final SubLObject sink, final SubLObject assertion)
  {
    final SubLObject stream = get_el_partition_data_sink_state( sink );
    final SubLObject ist_formula = uncanonicalizer.assertion_el_ist_formula( assertion );
    PrintLow.format( stream, $str231$___assert__A__, ist_formula );
    return sink;
  }

  @SubLTranslatedFile.SubL(source = "cycl/el-partitions.lisp", position = 87426L)
  public static SubLObject debug_data_sink_tip_assertion_reassert(final SubLObject sink, final SubLObject assertion, SubLObject strength, SubLObject direction)
  {
    if( strength == UNPROVIDED )
    {
      strength = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLObject stream = get_el_partition_data_sink_state( sink );
    final SubLObject ist_formula = uncanonicalizer.assertion_el_ist_formula( assertion );
    PrintLow.format( stream, $str232$___reassert__A__A__A__, new SubLObject[] { ist_formula, strength, direction
    } );
    return sink;
  }

  public static SubLObject declare_el_partitions_file()
  {
    SubLFiles.declareMacro( me, "with_pickling_stream_buffer_size", "WITH-PICKLING-STREAM-BUFFER-SIZE" );
    SubLFiles.declareMacro( me, "with_pickling_pacficiation", "WITH-PICKLING-PACFICIATION" );
    SubLFiles.declareFunction( me, "el_partition_relevant_constantP", "EL-PARTITION-RELEVANT-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "el_partition_relevant_assertionP", "EL-PARTITION-RELEVANT-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "pickle_constants", "PICKLE-CONSTANTS", 1, 0, false );
    SubLFiles.declareMacro( me, "do_pickled_constants", "DO-PICKLED-CONSTANTS" );
    SubLFiles.declareFunction( me, "pickle_assertions", "PICKLE-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "pickling_index_filename", "PICKLING-INDEX-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "pickling_data_filename", "PICKLING-DATA-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_to_pickling_format", "ASSERTION-TO-PICKLING-FORMAT", 1, 0, false );
    SubLFiles.declareFunction( me, "unpickle_assertion_pickling_format", "UNPICKLE-ASSERTION-PICKLING-FORMAT", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_guid_to_pickling_format", "CONVERT-GUID-TO-PICKLING-FORMAT", 1, 0, false );
    SubLFiles.declareFunction( me, "pickled_guid_format_p", "PICKLED-GUID-FORMAT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "restore_guid_from_pickling_format", "RESTORE-GUID-FROM-PICKLING-FORMAT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_relevant_assertions_id_space", "NEW-RELEVANT-ASSERTIONS-ID-SPACE", 0, 1, false );
    SubLFiles.declareFunction( me, "compare_pickled_kb_to_current_kb", "COMPARE-PICKLED-KB-TO-CURRENT-KB", 3, 0, false );
    SubLFiles.declareFunction( me, "enumerate_additions_to_current_kb", "ENUMERATE-ADDITIONS-TO-CURRENT-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "compare_pickled_kb_to_current_kb_constants", "COMPARE-PICKLED-KB-TO-CURRENT-KB-CONSTANTS", 2, 0, false );
    SubLFiles.declareMacro( me, "update_as_iteration_state", "UPDATE-AS-ITERATION-STATE" );
    SubLFiles.declareMacro( me, "decrement_tip_index", "DECREMENT-TIP-INDEX" );
    SubLFiles.declareFunction( me, "find_most_recent_assertion_shared_with_branch", "FIND-MOST-RECENT-ASSERTION-SHARED-WITH-BRANCH", 1, 0, false );
    SubLFiles.declareFunction( me, "compare_pickled_kb_to_current_kb_assertions", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "compare_pickled_kb_to_current_kb_assertions_internal", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "compare_pickled_kb_to_current_kb_assertions_scan_forward_fast", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS-SCAN-FORWARD-FAST", 2, 1, false );
    SubLFiles.declareFunction( me, "compare_pickled_kb_to_current_kb_assertions_scan_forward_steady", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS-SCAN-FORWARD-STEADY", 2, 1, false );
    SubLFiles.declareFunction( me, "compare_pickled_kb_to_current_kb_assertions_novel_forward", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS-NOVEL-FORWARD", 2, 1, false );
    SubLFiles.declareFunction( me, "compare_pickled_kb_to_current_kb_assertions_classic_backward", "COMPARE-PICKLED-KB-TO-CURRENT-KB-ASSERTIONS-CLASSIC-BACKWARD", 2, 1, false );
    SubLFiles.declareFunction( me, "enumerate_tip_assertions_from_current_kb", "ENUMERATE-TIP-ASSERTIONS-FROM-CURRENT-KB", 2, 0, false );
    SubLFiles.declareFunction( me, "enumerate_branch_assertions_absent_from_current_kb", "ENUMERATE-BRANCH-ASSERTIONS-ABSENT-FROM-CURRENT-KB", 3, 0, false );
    SubLFiles.declareFunction( me, "elpart_as_desc_print_function_trampoline", "ELPART-AS-DESC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "elpart_as_desc_p", "ELPART-AS-DESC-P", 1, 0, false );
    new $elpart_as_desc_p$UnaryFunction();
    SubLFiles.declareFunction( me, "elpart_as_desc_id", "ELPART-AS-DESC-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "elpart_as_desc_tl_ist_formula", "ELPART-AS-DESC-TL-IST-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "elpart_as_desc_hash", "ELPART-AS-DESC-HASH", 1, 0, false );
    SubLFiles.declareFunction( me, "elpart_as_desc_extra", "ELPART-AS-DESC-EXTRA", 1, 0, false );
    SubLFiles.declareFunction( me, "elpart_as_desc_weak_ist_formula", "ELPART-AS-DESC-WEAK-IST-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_elpart_as_desc_id", "_CSETF-ELPART-AS-DESC-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_elpart_as_desc_tl_ist_formula", "_CSETF-ELPART-AS-DESC-TL-IST-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_elpart_as_desc_hash", "_CSETF-ELPART-AS-DESC-HASH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_elpart_as_desc_extra", "_CSETF-ELPART-AS-DESC-EXTRA", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_elpart_as_desc_weak_ist_formula", "_CSETF-ELPART-AS-DESC-WEAK-IST-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "make_elpart_as_desc", "MAKE-ELPART-AS-DESC", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_elpart_as_desc", "VISIT-DEFSTRUCT-ELPART-AS-DESC", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_elpart_as_desc_method", "VISIT-DEFSTRUCT-OBJECT-ELPART-AS-DESC-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_elpart_as_desc", "PRINT-ELPART-AS-DESC", 3, 0, false );
    SubLFiles.declareFunction( me, "identify_branch_assertions_absent_from_current_kb", "IDENTIFY-BRANCH-ASSERTIONS-ABSENT-FROM-CURRENT-KB", 2, 0, false );
    SubLFiles.declareFunction( me, "identify_branch_assertions_absent_from_current_kb_int", "IDENTIFY-BRANCH-ASSERTIONS-ABSENT-FROM-CURRENT-KB-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "find_start_of_el_partition_relevant_assertions", "FIND-START-OF-EL-PARTITION-RELEVANT-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "fetch_branch_limit_information_for_pickled_kb", "FETCH-BRANCH-LIMIT-INFORMATION-FOR-PICKLED-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerate_branch_assertions_missing_from_current_kb", "ENUMERATE-BRANCH-ASSERTIONS-MISSING-FROM-CURRENT-KB", 6, 0, false );
    SubLFiles.declareFunction( me, "same_elpart_as_descP", "SAME-ELPART-AS-DESC?", 2, 0, false );
    SubLFiles.declareFunction( me, "enummiss_find_previous_relevant_assertion", "ENUMMISS-FIND-PREVIOUS-RELEVANT-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "enummiss_find_next_relevant_assertion", "ENUMMISS-FIND-NEXT-RELEVANT-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "enummiss_fetch_specific_assertion_information", "ENUMMISS-FETCH-SPECIFIC-ASSERTION-INFORMATION", 3, 0, false );
    SubLFiles.declareFunction( me, "enummiss_compute_specific_assertion_information", "ENUMMISS-COMPUTE-SPECIFIC-ASSERTION-INFORMATION", 2, 0, false );
    SubLFiles.declareFunction( me, "enummiss_clear_specific_assertion_information", "ENUMMISS-CLEAR-SPECIFIC-ASSERTION-INFORMATION", 1, 0, false );
    SubLFiles.declareFunction( me, "enummiss_compute_weakened_ist_formula", "ENUMMISS-COMPUTE-WEAKENED-IST-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "enummiss_tl_hp_notation", "ENUMMISS-TL-HP-NOTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerate_missing_assertions_before_shared", "ENUMERATE-MISSING-ASSERTIONS-BEFORE-SHARED", 3, 0, false );
    SubLFiles.declareFunction( me, "scan_enumerate_branch_assertions_missing_from_current_kb", "SCAN-ENUMERATE-BRANCH-ASSERTIONS-MISSING-FROM-CURRENT-KB", 2, 1, false );
    SubLFiles.declareFunction( me, "scan_enummiss_load_branch_assertion", "SCAN-ENUMMISS-LOAD-BRANCH-ASSERTION", 4, 0, false );
    SubLFiles.declareFunction( me, "scan_enummiss_corresponding_relevant_tip_assertion", "SCAN-ENUMMISS-CORRESPONDING-RELEVANT-TIP-ASSERTION", 4, 0, false );
    SubLFiles.declareFunction( me, "scan_enummiss_corresponding_tip_assertion", "SCAN-ENUMMISS-CORRESPONDING-TIP-ASSERTION", 4, 0, false );
    SubLFiles.declareFunction( me, "scan_enummiss_load_tip_assertion", "SCAN-ENUMMISS-LOAD-TIP-ASSERTION", 3, 0, false );
    SubLFiles.declareFunction( me, "scan_enummiss_classify_situation", "SCAN-ENUMMISS-CLASSIFY-SITUATION", 2, 0, false );
    SubLFiles.declareFunction( me, "test_helper_get_assertion", "TEST-HELPER-GET-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "test_helper_classify_situation", "TEST-HELPER-CLASSIFY-SITUATION", 2, 0, false );
    SubLFiles.declareFunction( me, "test_el_partition_simple_scan_algorithm", "TEST-EL-PARTITION-SIMPLE-SCAN-ALGORITHM", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_el_partition_simple_scan_case", "GENERATE-EL-PARTITION-SIMPLE-SCAN-CASE", 3, 0, false );
    SubLFiles.declareFunction( me, "test_random_el_partition_simple_scan_cases", "TEST-RANDOM-EL-PARTITION-SIMPLE-SCAN-CASES", 4, 0, false );
    SubLFiles.declareFunction( me, "el_partition_data_sink_print_function_trampoline", "EL-PARTITION-DATA-SINK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "el_partition_data_sink_p", "EL-PARTITION-DATA-SINK-P", 1, 0, false );
    new $el_partition_data_sink_p$UnaryFunction();
    SubLFiles.declareFunction( me, "elpart_dsink_state", "ELPART-DSINK-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "elpart_dsink_branch_cdel_fn", "ELPART-DSINK-BRANCH-CDEL-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "elpart_dsink_branch_asdel_fn", "ELPART-DSINK-BRANCH-ASDEL-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "elpart_dsink_tip_ccreate_fn", "ELPART-DSINK-TIP-CCREATE-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "elpart_dsink_tip_ascreate_fn", "ELPART-DSINK-TIP-ASCREATE-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "elpart_dsink_tip_asreassert_fn", "ELPART-DSINK-TIP-ASREASSERT-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_elpart_dsink_state", "_CSETF-ELPART-DSINK-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_elpart_dsink_branch_cdel_fn", "_CSETF-ELPART-DSINK-BRANCH-CDEL-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_elpart_dsink_branch_asdel_fn", "_CSETF-ELPART-DSINK-BRANCH-ASDEL-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_elpart_dsink_tip_ccreate_fn", "_CSETF-ELPART-DSINK-TIP-CCREATE-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_elpart_dsink_tip_ascreate_fn", "_CSETF-ELPART-DSINK-TIP-ASCREATE-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_elpart_dsink_tip_asreassert_fn", "_CSETF-ELPART-DSINK-TIP-ASREASSERT-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "make_el_partition_data_sink", "MAKE-EL-PARTITION-DATA-SINK", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_el_partition_data_sink", "VISIT-DEFSTRUCT-EL-PARTITION-DATA-SINK", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_el_partition_data_sink_method", "VISIT-DEFSTRUCT-OBJECT-EL-PARTITION-DATA-SINK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_el_partition_data_sink", "NEW-EL-PARTITION-DATA-SINK", 6, 0, false );
    SubLFiles.declareFunction( me, "note_el_partition_branch_constant_delete", "NOTE-EL-PARTITION-BRANCH-CONSTANT-DELETE", 3, 0, false );
    SubLFiles.declareFunction( me, "note_el_partition_branch_assertion_delete", "NOTE-EL-PARTITION-BRANCH-ASSERTION-DELETE", 2, 0, false );
    SubLFiles.declareFunction( me, "note_el_partition_tip_constant_create", "NOTE-EL-PARTITION-TIP-CONSTANT-CREATE", 2, 0, false );
    SubLFiles.declareFunction( me, "note_el_partition_tip_assertion_create", "NOTE-EL-PARTITION-TIP-ASSERTION-CREATE", 2, 0, false );
    SubLFiles.declareFunction( me, "note_el_partition_tip_assertion_reassert", "NOTE-EL-PARTITION-TIP-ASSERTION-REASSERT", 2, 2, false );
    SubLFiles.declareFunction( me, "get_el_partition_data_sink_state", "GET-EL-PARTITION-DATA-SINK-STATE", 1, 0, false );
    SubLFiles.declareMacro( me, "with_el_partition_creator", "WITH-EL-PARTITION-CREATOR" );
    SubLFiles.declareMacro( me, "with_el_partition_creation_purpose", "WITH-EL-PARTITION-CREATION-PURPOSE" );
    SubLFiles.declareMacro( me, "with_el_partition_mt", "WITH-EL-PARTITION-MT" );
    SubLFiles.declareMacro( me, "with_el_partition_direction", "WITH-EL-PARTITION-DIRECTION" );
    SubLFiles.declareMacro( me, "without_el_partition_creation_purpose", "WITHOUT-EL-PARTITION-CREATION-PURPOSE" );
    SubLFiles.declareFunction( me, "new_transcript_el_partition_data_sink", "NEW-TRANSCRIPT-EL-PARTITION-DATA-SINK", 1, 0, false );
    SubLFiles.declareFunction( me, "transcript_data_sink_branch_constant_delete", "TRANSCRIPT-DATA-SINK-BRANCH-CONSTANT-DELETE", 3, 0, false );
    SubLFiles.declareFunction( me, "transcript_data_sink_branch_assertion_delete", "TRANSCRIPT-DATA-SINK-BRANCH-ASSERTION-DELETE", 2, 0, false );
    SubLFiles.declareFunction( me, "transcript_data_sink_tip_constant_create", "TRANSCRIPT-DATA-SINK-TIP-CONSTANT-CREATE", 2, 0, false );
    SubLFiles.declareFunction( me, "transcript_data_sink_tip_assertion_create", "TRANSCRIPT-DATA-SINK-TIP-ASSERTION-CREATE", 2, 0, false );
    SubLFiles.declareFunction( me, "transcript_data_sink_tip_assertion_reassert", "TRANSCRIPT-DATA-SINK-TIP-ASSERTION-REASSERT", 2, 2, false );
    SubLFiles.declareFunction( me, "transcript_data_sink_tip_constant_timestamp", "TRANSCRIPT-DATA-SINK-TIP-CONSTANT-TIMESTAMP", 2, 0, false );
    SubLFiles.declareFunction( me, "transcript_data_sink_tip_assertion_timestamp", "TRANSCRIPT-DATA-SINK-TIP-ASSERTION-TIMESTAMP", 2, 0, false );
    SubLFiles.declareFunction( me, "transcript_data_sink_clean_fort", "TRANSCRIPT-DATA-SINK-CLEAN-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "transcript_data_sink_form_prologue", "TRANSCRIPT-DATA-SINK-FORM-PROLOGUE", 1, 0, false );
    SubLFiles.declareFunction( me, "transcript_data_sink_form_epilogue", "TRANSCRIPT-DATA-SINK-FORM-EPILOGUE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_debug_el_partition_data_sink", "NEW-DEBUG-EL-PARTITION-DATA-SINK", 0, 1, false );
    SubLFiles.declareFunction( me, "debug_data_sink_branch_constant_delete", "DEBUG-DATA-SINK-BRANCH-CONSTANT-DELETE", 3, 0, false );
    SubLFiles.declareFunction( me, "debug_data_sink_branch_assertion_delete", "DEBUG-DATA-SINK-BRANCH-ASSERTION-DELETE", 2, 0, false );
    SubLFiles.declareFunction( me, "debug_data_sink_tip_constant_create", "DEBUG-DATA-SINK-TIP-CONSTANT-CREATE", 2, 0, false );
    SubLFiles.declareFunction( me, "debug_data_sink_tip_assertion_create", "DEBUG-DATA-SINK-TIP-ASSERTION-CREATE", 2, 0, false );
    SubLFiles.declareFunction( me, "debug_data_sink_tip_assertion_reassert", "DEBUG-DATA-SINK-TIP-ASSERTION-REASSERT", 2, 2, false );
    return NIL;
  }

  public static SubLObject init_el_partitions_file()
  {
    $default_pickling_stream_buffer_size$ = SubLFiles.deflexical( "*DEFAULT-PICKLING-STREAM-BUFFER-SIZE*", Numbers.multiply( FOUR_INTEGER, $int0$1024, $int0$1024 ) );
    $pickling_stream_buffer_size$ = SubLFiles.defparameter( "*PICKLING-STREAM-BUFFER-SIZE*", $default_pickling_stream_buffer_size$.getGlobalValue() );
    $pickled_kb_comparison_strategy$ = SubLFiles.deflexical( "*PICKLED-KB-COMPARISON-STRATEGY*", $kw89$SCAN_FORWARD_STEADY );
    $dtp_elpart_as_desc$ = SubLFiles.defconstant( "*DTP-ELPART-AS-DESC*", $sym97$ELPART_AS_DESC );
    $debug_scan_enumerateP$ = SubLFiles.deflexical( "*DEBUG-SCAN-ENUMERATE?*", NIL );
    $dtp_el_partition_data_sink$ = SubLFiles.defconstant( "*DTP-EL-PARTITION-DATA-SINK*", $sym166$EL_PARTITION_DATA_SINK );
    $el_partition_creator_override$ = SubLFiles.defparameter( "*EL-PARTITION-CREATOR-OVERRIDE*", NIL );
    $el_partition_creation_purpose_override$ = SubLFiles.defparameter( "*EL-PARTITION-CREATION-PURPOSE-OVERRIDE*", NIL );
    $el_partition_mt_override$ = SubLFiles.defparameter( "*EL-PARTITION-MT-OVERRIDE*", NIL );
    $el_partition_direction_override$ = SubLFiles.defparameter( "*EL-PARTITION-DIRECTION-OVERRIDE*", NIL );
    $transcript_marker_guest_cyclist$ = SubLFiles.deflexical( "*TRANSCRIPT-MARKER-GUEST-CYCLIST*", $list220 );
    return NIL;
  }

  public static SubLObject setup_el_partitions_file()
  {
    access_macros.register_external_symbol( $sym12$PICKLE_CONSTANTS );
    access_macros.register_external_symbol( $sym19$DO_PICKLED_CONSTANTS );
    access_macros.register_external_symbol( $sym43$PICKLE_ASSERTIONS );
    access_macros.register_external_symbol( $sym47$ASSERTION_TO_PICKLING_FORMAT );
    access_macros.register_external_symbol( $sym49$UNPICKLE_ASSERTION_PICKLING_FORMAT );
    access_macros.register_external_symbol( $sym55$NEW_RELEVANT_ASSERTIONS_ID_SPACE );
    access_macros.register_external_symbol( $sym58$COMPARE_PICKLED_KB_TO_CURRENT_KB );
    access_macros.register_external_symbol( $sym59$ENUMERATE_ADDITIONS_TO_CURRENT_KB );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_elpart_as_desc$.getGlobalValue(), Symbols.symbol_function( $sym104$ELPART_AS_DESC_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list105 );
    Structures.def_csetf( $sym106$ELPART_AS_DESC_ID, $sym107$_CSETF_ELPART_AS_DESC_ID );
    Structures.def_csetf( $sym108$ELPART_AS_DESC_TL_IST_FORMULA, $sym109$_CSETF_ELPART_AS_DESC_TL_IST_FORMULA );
    Structures.def_csetf( $sym110$ELPART_AS_DESC_HASH, $sym111$_CSETF_ELPART_AS_DESC_HASH );
    Structures.def_csetf( $sym112$ELPART_AS_DESC_EXTRA, $sym113$_CSETF_ELPART_AS_DESC_EXTRA );
    Structures.def_csetf( $sym114$ELPART_AS_DESC_WEAK_IST_FORMULA, $sym115$_CSETF_ELPART_AS_DESC_WEAK_IST_FORMULA );
    Equality.identity( $sym97$ELPART_AS_DESC );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_elpart_as_desc$.getGlobalValue(), Symbols.symbol_function( $sym126$VISIT_DEFSTRUCT_OBJECT_ELPART_AS_DESC_METHOD ) );
    generic_testing.define_test_case_table_int( $sym150$TEST_EL_PARTITION_SIMPLE_SCAN_ALGORITHM, ConsesLow.list( new SubLObject[] { $kw151$TEST, EQUAL, $kw152$OWNER, NIL, $kw153$CLASSES, NIL, $kw154$KB, $kw155$TINY,
      $kw156$WORKING_, T
    } ), $list157 );
    generic_testing.define_test_case_table_int( $sym162$TEST_RANDOM_EL_PARTITION_SIMPLE_SCAN_CASES, ConsesLow.list( new SubLObject[] { $kw151$TEST, EQUAL, $kw152$OWNER, NIL, $kw153$CLASSES, NIL, $kw154$KB, $kw155$TINY,
      $kw156$WORKING_, T
    } ), $list163 );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_el_partition_data_sink$.getGlobalValue(), Symbols.symbol_function(
        $sym172$EL_PARTITION_DATA_SINK_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list173 );
    Structures.def_csetf( $sym174$ELPART_DSINK_STATE, $sym175$_CSETF_ELPART_DSINK_STATE );
    Structures.def_csetf( $sym176$ELPART_DSINK_BRANCH_CDEL_FN, $sym177$_CSETF_ELPART_DSINK_BRANCH_CDEL_FN );
    Structures.def_csetf( $sym178$ELPART_DSINK_BRANCH_ASDEL_FN, $sym179$_CSETF_ELPART_DSINK_BRANCH_ASDEL_FN );
    Structures.def_csetf( $sym180$ELPART_DSINK_TIP_CCREATE_FN, $sym181$_CSETF_ELPART_DSINK_TIP_CCREATE_FN );
    Structures.def_csetf( $sym182$ELPART_DSINK_TIP_ASCREATE_FN, $sym183$_CSETF_ELPART_DSINK_TIP_ASCREATE_FN );
    Structures.def_csetf( $sym184$ELPART_DSINK_TIP_ASREASSERT_FN, $sym185$_CSETF_ELPART_DSINK_TIP_ASREASSERT_FN );
    Equality.identity( $sym166$EL_PARTITION_DATA_SINK );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_el_partition_data_sink$.getGlobalValue(), Symbols.symbol_function(
        $sym193$VISIT_DEFSTRUCT_OBJECT_EL_PARTITION_DATA_SINK_METHOD ) );
    access_macros.register_external_symbol( $sym194$NOTE_EL_PARTITION_BRANCH_CONSTANT_DELETE );
    access_macros.register_external_symbol( $sym195$NOTE_EL_PARTITION_BRANCH_ASSERTION_DELETE );
    access_macros.register_external_symbol( $sym196$NOTE_EL_PARTITION_TIP_CONSTANT_CREATE );
    access_macros.register_external_symbol( $sym197$NOTE_EL_PARTITION_TIP_ASSERTION_CREATE );
    access_macros.register_external_symbol( $sym198$NOTE_EL_PARTITION_TIP_ASSERTION_REASSERT );
    return NIL;
  }

  private static SubLObject _constant_157_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { makeSymbol( "A" ), makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "D" ), makeSymbol( "E" )
        } ), Vectors.vector( new SubLObject[] { makeSymbol( "A" ), makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "D" ), makeSymbol( "E" )
        } ) ), NIL ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { makeSymbol( "A" ), makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "D" )
        } ), Vectors.vector( new SubLObject[] { makeSymbol( "A" ), makeSymbol( "D" )
        } ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "DELETE" ), makeSymbol( "B" ) ), ConsesLow.list( makeKeyword( "DELETE" ), makeSymbol( "C" ) ) ) ), ConsesLow.list( ConsesLow.list( Vectors.vector(
            new SubLObject[]
            { makeSymbol( "A" ), makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "D" ), makeSymbol( "E" )
            } ), Vectors.vector( new SubLObject[] { makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "D" )
        } ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "DELETE" ), makeSymbol( "A" ) ), ConsesLow.list( makeKeyword( "DELETE" ), makeSymbol( "E" ) ) ) ), ConsesLow.list( ConsesLow.list( Vectors.vector(
            new SubLObject[]
            { makeSymbol( "A" ), makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "D" ), makeSymbol( "E" )
            } ), Vectors.vector( new SubLObject[] { makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "E" ), makeSymbol( "F" ), makeSymbol( "G" )
        } ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "DELETE" ), makeSymbol( "A" ) ), ConsesLow.list( makeKeyword( "DELETE" ), makeSymbol( "D" ) ), ConsesLow.list( makeKeyword( "CREATE" ), makeSymbol( "F" ) ),
            ConsesLow.list( makeKeyword( "CREATE" ), makeSymbol( "G" ) ) ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[]
            { makeSymbol( "A" ), makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "D" ), makeSymbol( "E" )
        } ), Vectors.vector( new SubLObject[] { makeSymbol( "F" ), makeSymbol( "G" ), makeSymbol( "H" ), makeSymbol( "I" ), makeSymbol( "J" )
        } ) ), ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword( "DELETE" ), makeSymbol( "A" ) ), ConsesLow.list( makeKeyword( "DELETE" ), makeSymbol( "B" ) ), ConsesLow.list( makeKeyword( "DELETE" ),
            makeSymbol( "C" ) ), ConsesLow.list( makeKeyword( "DELETE" ), makeSymbol( "D" ) ), ConsesLow.list( makeKeyword( "DELETE" ), makeSymbol( "E" ) ), ConsesLow.list( makeKeyword( "CREATE" ), makeSymbol( "F" ) ),
          ConsesLow.list( makeKeyword( "CREATE" ), makeSymbol( "G" ) ), ConsesLow.list( makeKeyword( "CREATE" ), makeSymbol( "H" ) ), ConsesLow.list( makeKeyword( "CREATE" ), makeSymbol( "I" ) ), ConsesLow.list(
              makeKeyword( "CREATE" ), makeSymbol( "J" ) )
        } ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { makeSymbol( "A" ), makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "D" ), makeSymbol( "E" ), makeSymbol( "F" ), makeSymbol( "G" ),
          makeSymbol( "H" ), makeSymbol( "I" ), makeSymbol( "J" ), makeSymbol( "K" ), makeSymbol( "L" ), makeSymbol( "M" ), makeSymbol( "N" )
        } ), Vectors.vector( new SubLObject[] { makeSymbol( "A" ), makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "H" ), makeSymbol( "I" ), makeSymbol( "J" ), makeSymbol( "K" ), makeSymbol( "L" ), makeSymbol( "M" ),
          makeSymbol( "N" )
        } ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "DELETE" ), makeSymbol( "D" ) ), ConsesLow.list( makeKeyword( "DELETE" ), makeSymbol( "E" ) ), ConsesLow.list( makeKeyword( "DELETE" ), makeSymbol( "F" ) ),
            ConsesLow.list( makeKeyword( "DELETE" ), makeSymbol( "G" ) ) ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[]
            { ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER,
              FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger( 21 ), makeInteger( 22 ), makeInteger( 23 ), makeInteger( 24 ),
              makeInteger( 25 ), makeInteger( 26 ), makeInteger( 27 ), makeInteger( 28 ), makeInteger( 29 )
        } ), Vectors.vector( new SubLObject[] { ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER,
          THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger( 21 ), makeInteger( 22 ), makeInteger( 23 ), makeInteger( 24 ),
          makeInteger( 26 ), makeInteger( 27 ), makeInteger( 28 ), makeInteger( 29 ), makeInteger( 30 ), makeInteger( 31 ), makeInteger( 32 )
        } ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "DELETE" ), FOUR_INTEGER ), ConsesLow.list( makeKeyword( "DELETE" ), NINE_INTEGER ), ConsesLow.list( makeKeyword( "DELETE" ), SIXTEEN_INTEGER ), ConsesLow.list(
            makeKeyword( "DELETE" ), makeInteger( 25 ) ), ConsesLow.list( makeKeyword( "CREATE" ), makeInteger( 30 ) ), ConsesLow.list( makeKeyword( "CREATE" ), makeInteger( 31 ) ), ConsesLow.list( makeKeyword(
                "CREATE" ), makeInteger( 32 ) ) ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[]
                { ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER,
                  FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger( 21 ), makeInteger( 22 ), makeInteger( 23 ), makeInteger( 24 ),
                  makeInteger( 25 ), makeInteger( 26 ), makeInteger( 27 ), makeInteger( 28 ), makeInteger( 29 )
        } ), Vectors.vector( new SubLObject[] { ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER,
          TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger( 21 ), makeInteger( 22 ), makeInteger(
              23 ), makeInteger( 24 ), makeInteger( 25 ), makeInteger( 26 ), makeInteger( 27 ), makeInteger( 28 )
        } ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "DELETE" ), makeInteger( 29 ) ) ) ), ConsesLow.list( ConsesLow.list( Vectors.vector( new SubLObject[] { ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER,
          FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER,
          SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger( 21 ), makeInteger( 22 ), makeInteger( 23 ), makeInteger( 24 ), makeInteger( 25 ), makeInteger( 26 ), makeInteger( 27 ),
          makeInteger( 28 ), makeInteger( 29 ), makeInteger( 30 ), makeInteger( 31 ), makeInteger( 32 ), makeInteger( 33 ), makeInteger( 34 ), makeInteger( 35 ), makeInteger( 36 ), makeInteger( 37 ), makeInteger( 38 ),
          makeInteger( 39 )
        } ), Vectors.vector( new SubLObject[] { ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER,
          TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger( 21 ), makeInteger( 22 ), makeInteger(
              23 ), makeInteger( 24 ), makeInteger( 25 ), makeInteger( 26 ), makeInteger( 27 ), makeInteger( 28 ), makeInteger( 29 ), makeInteger( 30 ), makeInteger( 31 ), makeInteger( 32 ), makeInteger( 33 ),
          makeInteger( 34 ), makeInteger( 35 ), makeInteger( 36 ), makeInteger( 37 ), makeInteger( 38 ), makeInteger( 40 )
        } ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "DELETE" ), makeInteger( 39 ) ), ConsesLow.list( makeKeyword( "CREATE" ), makeInteger( 40 ) ) ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_el_partitions_file();
  }

  @Override
  public void initializeVariables()
  {
    init_el_partitions_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_el_partitions_file();
  }
  static
  {
    me = new el_partitions();
    $default_pickling_stream_buffer_size$ = null;
    $pickling_stream_buffer_size$ = null;
    $pickled_kb_comparison_strategy$ = null;
    $dtp_elpart_as_desc$ = null;
    $debug_scan_enumerateP$ = null;
    $dtp_el_partition_data_sink$ = null;
    $el_partition_creator_override$ = null;
    $el_partition_creation_purpose_override$ = null;
    $el_partition_mt_override$ = null;
    $el_partition_direction_override$ = null;
    $transcript_marker_guest_cyclist$ = null;
    $int0$1024 = makeInteger( 1024 );
    $sym1$WITH_STREAM_BUFFER_SIZE = makeSymbol( "WITH-STREAM-BUFFER-SIZE" );
    $list2 = ConsesLow.list( makeSymbol( "*PICKLING-STREAM-BUFFER-SIZE*" ) );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "TOTAL" ), makeSymbol( "MESSAGE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym4$CURR = makeUninternedSymbol( "CURR" );
    $sym5$CLET = makeSymbol( "CLET" );
    $list6 = ConsesLow.list( ZERO_INTEGER );
    $sym7$NOTING_PERCENT_PROGRESS = makeSymbol( "NOTING-PERCENT-PROGRESS" );
    $sym8$PROGN = makeSymbol( "PROGN" );
    $sym9$CINC = makeSymbol( "CINC" );
    $sym10$NOTE_PERCENT_PROGRESS = makeSymbol( "NOTE-PERCENT-PROGRESS" );
    $sym11$HL_PROTOTYPICAL_INSTANCE_ = makeSymbol( "HL-PROTOTYPICAL-INSTANCE?" );
    $sym12$PICKLE_CONSTANTS = makeSymbol( "PICKLE-CONSTANTS" );
    $str13$Pickling_constants_to_ = makeString( "Pickling constants to " );
    $str14$_____ = makeString( " ...." );
    $kw15$OUTPUT = makeKeyword( "OUTPUT" );
    $str16$Unable_to_open__S = makeString( "Unable to open ~S" );
    $sym17$STRINGP = makeSymbol( "STRINGP" );
    $kw18$SKIP = makeKeyword( "SKIP" );
    $sym19$DO_PICKLED_CONSTANTS = makeSymbol( "DO-PICKLED-CONSTANTS" );
    $list20 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUID" ), makeSymbol( "NAME" ), makeSymbol( "GUID" ), makeSymbol( "FILENAME" ), makeSymbol( "&KEY" ), makeSymbol( "MESSAGE" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list21 = ConsesLow.list( makeKeyword( "MESSAGE" ) );
    $kw22$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw23$MESSAGE = makeKeyword( "MESSAGE" );
    $sym24$STREAM = makeUninternedSymbol( "STREAM" );
    $sym25$COUNT = makeUninternedSymbol( "COUNT" );
    $sym26$MSG = makeUninternedSymbol( "MSG" );
    $sym27$WITH_PICKLING_STREAM_BUFFER_SIZE = makeSymbol( "WITH-PICKLING-STREAM-BUFFER-SIZE" );
    $sym28$WITH_PRIVATE_BINARY_FILE = makeSymbol( "WITH-PRIVATE-BINARY-FILE" );
    $list29 = ConsesLow.list( makeKeyword( "INPUT" ) );
    $sym30$CFASL_INPUT = makeSymbol( "CFASL-INPUT" );
    $sym31$FIF = makeSymbol( "FIF" );
    $sym32$NULL = makeSymbol( "NULL" );
    $sym33$FORMAT_NIL = makeSymbol( "FORMAT-NIL" );
    $str34$Reading_pickled_constants_from__A = makeString( "Reading pickled constants from ~A ...." );
    $sym35$WITH_PICKLING_PACFICIATION = makeSymbol( "WITH-PICKLING-PACFICIATION" );
    $sym36$CDO = makeSymbol( "CDO" );
    $sym37$MUST = makeSymbol( "MUST" );
    $sym38$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $str39$Read_invalid_SUID__A_from__A_ = makeString( "Read invalid SUID ~A from ~A." );
    $str40$Read_invalid_NAME__A_from__A_ = makeString( "Read invalid NAME ~A from ~A." );
    $sym41$GUID_P = makeSymbol( "GUID-P" );
    $str42$Read_invalid_GUID__A_from__A_ = makeString( "Read invalid GUID ~A from ~A." );
    $sym43$PICKLE_ASSERTIONS = makeSymbol( "PICKLE-ASSERTIONS" );
    $str44$Pickling_assertions_to_file_vecto = makeString( "Pickling assertions to file-vector with prefix " );
    $str45$_index_cfasl = makeString( "-index.cfasl" );
    $str46$_cfasl = makeString( ".cfasl" );
    $sym47$ASSERTION_TO_PICKLING_FORMAT = makeSymbol( "ASSERTION-TO-PICKLING-FORMAT" );
    $sym48$CONVERT_GUID_TO_PICKLING_FORMAT = makeSymbol( "CONVERT-GUID-TO-PICKLING-FORMAT" );
    $sym49$UNPICKLE_ASSERTION_PICKLING_FORMAT = makeSymbol( "UNPICKLE-ASSERTION-PICKLING-FORMAT" );
    $sym50$PICKLED_GUID_FORMAT_P = makeSymbol( "PICKLED-GUID-FORMAT-P" );
    $sym51$RESTORE_GUID_FROM_PICKLING_FORMAT = makeSymbol( "RESTORE-GUID-FROM-PICKLING-FORMAT" );
    $kw52$GUID = makeKeyword( "GUID" );
    $list53 = ConsesLow.list( makeSymbol( "GUID-MARKER" ), makeSymbol( "GUID-STRING" ) );
    $str54$Cannot_restore__A_____not_a_pickl = makeString( "Cannot restore ~A ... not a pickled GUID." );
    $sym55$NEW_RELEVANT_ASSERTIONS_ID_SPACE = makeSymbol( "NEW-RELEVANT-ASSERTIONS-ID-SPACE" );
    $str56$Computing_EL_Partition_relevant_a = makeString( "Computing EL Partition relevant assertion ID space ...." );
    $str57$Whoa__we_underflowed_the_ID_space = makeString( "Whoa, we underflowed the ID space counter." );
    $sym58$COMPARE_PICKLED_KB_TO_CURRENT_KB = makeSymbol( "COMPARE-PICKLED-KB-TO-CURRENT-KB" );
    $sym59$ENUMERATE_ADDITIONS_TO_CURRENT_KB = makeSymbol( "ENUMERATE-ADDITIONS-TO-CURRENT-KB" );
    $str60$Enumerating_new_constants_____ = makeString( "Enumerating new constants ...." );
    $str61$Enumerating_new_assertions_____ = makeString( "Enumerating new assertions ...." );
    $sym62$EL_PARTITION_DATA_SINK_P = makeSymbol( "EL-PARTITION-DATA-SINK-P" );
    $sym63$EL_PARTITION_RELEVANT_CONSTANT_ = makeSymbol( "EL-PARTITION-RELEVANT-CONSTANT?" );
    $kw64$DONE = makeKeyword( "DONE" );
    $kw65$INPUT = makeKeyword( "INPUT" );
    $str66$Reading_pickled_constants_from_ = makeString( "Reading pickled constants from " );
    $list67 = ConsesLow.list( makeSymbol( "IT" ), makeSymbol( "AS" ), makeSymbol( "TL-IST-FORMULA" ) );
    $sym68$CSETQ = makeSymbol( "CSETQ" );
    $sym69$ITERATION_NEXT_WITHOUT_VALUES = makeSymbol( "ITERATION-NEXT-WITHOUT-VALUES" );
    $list70 = ConsesLow.list( makeKeyword( "DONE" ) );
    $sym71$FWHEN = makeSymbol( "FWHEN" );
    $sym72$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $sym73$TL_ENCAPSULATE = makeSymbol( "TL-ENCAPSULATE" );
    $sym74$ASSERTION_TL_IST_FORMULA = makeSymbol( "ASSERTION-TL-IST-FORMULA" );
    $list75 = ConsesLow.list( makeSymbol( "TIP-INDEX" ) );
    $sym76$CDEC = makeSymbol( "CDEC" );
    $sym77$UNTIL = makeSymbol( "UNTIL" );
    $sym78$EL_PARTITION_RELEVANT_ASSERTION_ = makeSymbol( "EL-PARTITION-RELEVANT-ASSERTION?" );
    $sym79$FIND_ASSERTION_BY_ID = makeSymbol( "FIND-ASSERTION-BY-ID" );
    $str80$Implementation_error__Tip_index__ = makeString( "Implementation error: Tip index ~A underflowed." );
    $str81$Implementation_error__branch_inde = makeString( "Implementation error: branch index underflowed." );
    $str82$Implementation_error__tip_index_u = makeString( "Implementation error: tip index underflowed." );
    $kw83$NOT_FOUND = makeKeyword( "NOT-FOUND" );
    $kw84$SHARED_ASSERTION = makeKeyword( "SHARED-ASSERTION" );
    $kw85$BRANCH_AS_ID = makeKeyword( "BRANCH-AS-ID" );
    $kw86$BRANCH_INDEX = makeKeyword( "BRANCH-INDEX" );
    $kw87$BRANCH_COUNT = makeKeyword( "BRANCH-COUNT" );
    $kw88$JUST_ASSERTED_P = makeKeyword( "JUST-ASSERTED-P" );
    $kw89$SCAN_FORWARD_STEADY = makeKeyword( "SCAN-FORWARD-STEADY" );
    $kw90$CLASSIC_BACKWARD = makeKeyword( "CLASSIC-BACKWARD" );
    $kw91$NOVEL_FORWARD = makeKeyword( "NOVEL-FORWARD" );
    $kw92$SCAN_FORWARD_FAST = makeKeyword( "SCAN-FORWARD-FAST" );
    $str93$Pickled_KB_Comparison_Strategy__S = makeString( "Pickled KB Comparison Strategy ~S not yet implemented." );
    $str94$Analyzing_ = makeString( "Analyzing " );
    $str95$_new_assertions_____ = makeString( " new assertions ...." );
    $str96$This_algorithm_is_not_designed_to = makeString( "This algorithm is not designed to deal with gaps in assertion ID space. Dump KB first." );
    $sym97$ELPART_AS_DESC = makeSymbol( "ELPART-AS-DESC" );
    $sym98$ELPART_AS_DESC_P = makeSymbol( "ELPART-AS-DESC-P" );
    $list99 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "TL-IST-FORMULA" ), makeSymbol( "HASH" ), makeSymbol( "EXTRA" ), makeSymbol( "WEAK-IST-FORMULA" ) );
    $list100 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "TL-IST-FORMULA" ), makeKeyword( "HASH" ), makeKeyword( "EXTRA" ), makeKeyword( "WEAK-IST-FORMULA" ) );
    $list101 = ConsesLow.list( makeSymbol( "ELPART-AS-DESC-ID" ), makeSymbol( "ELPART-AS-DESC-TL-IST-FORMULA" ), makeSymbol( "ELPART-AS-DESC-HASH" ), makeSymbol( "ELPART-AS-DESC-EXTRA" ), makeSymbol(
        "ELPART-AS-DESC-WEAK-IST-FORMULA" ) );
    $list102 = ConsesLow.list( makeSymbol( "_CSETF-ELPART-AS-DESC-ID" ), makeSymbol( "_CSETF-ELPART-AS-DESC-TL-IST-FORMULA" ), makeSymbol( "_CSETF-ELPART-AS-DESC-HASH" ), makeSymbol( "_CSETF-ELPART-AS-DESC-EXTRA" ),
        makeSymbol( "_CSETF-ELPART-AS-DESC-WEAK-IST-FORMULA" ) );
    $sym103$PRINT_ELPART_AS_DESC = makeSymbol( "PRINT-ELPART-AS-DESC" );
    $sym104$ELPART_AS_DESC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ELPART-AS-DESC-PRINT-FUNCTION-TRAMPOLINE" );
    $list105 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ELPART-AS-DESC-P" ) );
    $sym106$ELPART_AS_DESC_ID = makeSymbol( "ELPART-AS-DESC-ID" );
    $sym107$_CSETF_ELPART_AS_DESC_ID = makeSymbol( "_CSETF-ELPART-AS-DESC-ID" );
    $sym108$ELPART_AS_DESC_TL_IST_FORMULA = makeSymbol( "ELPART-AS-DESC-TL-IST-FORMULA" );
    $sym109$_CSETF_ELPART_AS_DESC_TL_IST_FORMULA = makeSymbol( "_CSETF-ELPART-AS-DESC-TL-IST-FORMULA" );
    $sym110$ELPART_AS_DESC_HASH = makeSymbol( "ELPART-AS-DESC-HASH" );
    $sym111$_CSETF_ELPART_AS_DESC_HASH = makeSymbol( "_CSETF-ELPART-AS-DESC-HASH" );
    $sym112$ELPART_AS_DESC_EXTRA = makeSymbol( "ELPART-AS-DESC-EXTRA" );
    $sym113$_CSETF_ELPART_AS_DESC_EXTRA = makeSymbol( "_CSETF-ELPART-AS-DESC-EXTRA" );
    $sym114$ELPART_AS_DESC_WEAK_IST_FORMULA = makeSymbol( "ELPART-AS-DESC-WEAK-IST-FORMULA" );
    $sym115$_CSETF_ELPART_AS_DESC_WEAK_IST_FORMULA = makeSymbol( "_CSETF-ELPART-AS-DESC-WEAK-IST-FORMULA" );
    $kw116$ID = makeKeyword( "ID" );
    $kw117$TL_IST_FORMULA = makeKeyword( "TL-IST-FORMULA" );
    $kw118$HASH = makeKeyword( "HASH" );
    $kw119$EXTRA = makeKeyword( "EXTRA" );
    $kw120$WEAK_IST_FORMULA = makeKeyword( "WEAK-IST-FORMULA" );
    $str121$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw122$BEGIN = makeKeyword( "BEGIN" );
    $sym123$MAKE_ELPART_AS_DESC = makeSymbol( "MAKE-ELPART-AS-DESC" );
    $kw124$SLOT = makeKeyword( "SLOT" );
    $kw125$END = makeKeyword( "END" );
    $sym126$VISIT_DEFSTRUCT_OBJECT_ELPART_AS_DESC_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ELPART-AS-DESC-METHOD" );
    $str127$_id__ = makeString( " id# " );
    $str128$_hc__ = makeString( " hc: " );
    $str129$_AS_ID__ = makeString( " AS-ID: " );
    $str130$_FVecInx__ = makeString( " FVecInx: " );
    $str131$_xtr__ = makeString( " xtr: " );
    $str132$_ = makeString( " " );
    $str133$_assertions_____ = makeString( " assertions ...." );
    $str134$Not_yet_implemented_ = makeString( "Not yet implemented." );
    $str135$Mhm__only__A_gaps_across_all_asse = makeString( "Mhm, only ~A gaps across all assertion types, but ~A deletions???" );
    $str136$Finding_start_of_relevant_asserti = makeString( "Finding start of relevant assertions in TIP KB ...." );
    $str137$_assertion_gaps_____ = makeString( " assertion gaps ...." );
    $str138$Error_realigning_BRANCH___A__now_ = makeString( "Error realigning BRANCH (~A, now at ~A) and TIP (~A)" );
    $list139 = ConsesLow.list( makeSymbol( "HP-MARKER" ), makeSymbol( "CONSTANT-NAME" ), makeSymbol( "GUID" ) );
    $sym140$ENUMMISS_TL_HP_NOTATION = makeSymbol( "ENUMMISS-TL-HP-NOTATION" );
    $kw141$HP = makeKeyword( "HP" );
    $str142$Sorry__FAST_is_currently_not_impl = makeString( "Sorry, FAST is currently not implemented." );
    $str143$_branch_assertions_____ = makeString( " branch assertions ...." );
    $kw144$BOTH_INVALID = makeKeyword( "BOTH-INVALID" );
    $kw145$INVALID_BRANCH = makeKeyword( "INVALID-BRANCH" );
    $kw146$INVALID_TIP = makeKeyword( "INVALID-TIP" );
    $kw147$DIFFERENT = makeKeyword( "DIFFERENT" );
    $kw148$EQUAL = makeKeyword( "EQUAL" );
    $str149$Unknown_state__A____do_not_know_w = makeString( "Unknown state ~A -- do not know what to do.~%" );
    $sym150$TEST_EL_PARTITION_SIMPLE_SCAN_ALGORITHM = makeSymbol( "TEST-EL-PARTITION-SIMPLE-SCAN-ALGORITHM" );
    $kw151$TEST = makeKeyword( "TEST" );
    $kw152$OWNER = makeKeyword( "OWNER" );
    $kw153$CLASSES = makeKeyword( "CLASSES" );
    $kw154$KB = makeKeyword( "KB" );
    $kw155$TINY = makeKeyword( "TINY" );
    $kw156$WORKING_ = makeKeyword( "WORKING?" );
    $list157 = _constant_157_initializer();
    $kw158$INVALID = makeKeyword( "INVALID" );
    $str159$Someone_is_whaffling_____ = makeString( "Someone is whaffling ...." );
    $kw160$CREATE = makeKeyword( "CREATE" );
    $kw161$DELETE = makeKeyword( "DELETE" );
    $sym162$TEST_RANDOM_EL_PARTITION_SIMPLE_SCAN_CASES = makeSymbol( "TEST-RANDOM-EL-PARTITION-SIMPLE-SCAN-CASES" );
    $list163 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeInteger( 50 ), makeInteger( 100 ), TWENTY_INTEGER, TWENTY_INTEGER ), makeKeyword( "OK" ) ), ConsesLow.list( ConsesLow.list( TEN_INTEGER, makeInteger(
        1000 ), makeInteger( 50 ), makeInteger( 50 ) ), makeKeyword( "OK" ) ) );
    $str164$Expected__A__got__A_instead_ = makeString( "Expected ~A, got ~A instead." );
    $kw165$OK = makeKeyword( "OK" );
    $sym166$EL_PARTITION_DATA_SINK = makeSymbol( "EL-PARTITION-DATA-SINK" );
    $list167 = ConsesLow.list( makeSymbol( "STATE" ), makeSymbol( "BRANCH-CDEL-FN" ), makeSymbol( "BRANCH-ASDEL-FN" ), makeSymbol( "TIP-CCREATE-FN" ), makeSymbol( "TIP-ASCREATE-FN" ), makeSymbol( "TIP-ASREASSERT-FN" ) );
    $list168 = ConsesLow.list( makeKeyword( "STATE" ), makeKeyword( "BRANCH-CDEL-FN" ), makeKeyword( "BRANCH-ASDEL-FN" ), makeKeyword( "TIP-CCREATE-FN" ), makeKeyword( "TIP-ASCREATE-FN" ), makeKeyword(
        "TIP-ASREASSERT-FN" ) );
    $list169 = ConsesLow.list( makeSymbol( "ELPART-DSINK-STATE" ), makeSymbol( "ELPART-DSINK-BRANCH-CDEL-FN" ), makeSymbol( "ELPART-DSINK-BRANCH-ASDEL-FN" ), makeSymbol( "ELPART-DSINK-TIP-CCREATE-FN" ), makeSymbol(
        "ELPART-DSINK-TIP-ASCREATE-FN" ), makeSymbol( "ELPART-DSINK-TIP-ASREASSERT-FN" ) );
    $list170 = ConsesLow.list( makeSymbol( "_CSETF-ELPART-DSINK-STATE" ), makeSymbol( "_CSETF-ELPART-DSINK-BRANCH-CDEL-FN" ), makeSymbol( "_CSETF-ELPART-DSINK-BRANCH-ASDEL-FN" ), makeSymbol(
        "_CSETF-ELPART-DSINK-TIP-CCREATE-FN" ), makeSymbol( "_CSETF-ELPART-DSINK-TIP-ASCREATE-FN" ), makeSymbol( "_CSETF-ELPART-DSINK-TIP-ASREASSERT-FN" ) );
    $sym171$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym172$EL_PARTITION_DATA_SINK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "EL-PARTITION-DATA-SINK-PRINT-FUNCTION-TRAMPOLINE" );
    $list173 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "EL-PARTITION-DATA-SINK-P" ) );
    $sym174$ELPART_DSINK_STATE = makeSymbol( "ELPART-DSINK-STATE" );
    $sym175$_CSETF_ELPART_DSINK_STATE = makeSymbol( "_CSETF-ELPART-DSINK-STATE" );
    $sym176$ELPART_DSINK_BRANCH_CDEL_FN = makeSymbol( "ELPART-DSINK-BRANCH-CDEL-FN" );
    $sym177$_CSETF_ELPART_DSINK_BRANCH_CDEL_FN = makeSymbol( "_CSETF-ELPART-DSINK-BRANCH-CDEL-FN" );
    $sym178$ELPART_DSINK_BRANCH_ASDEL_FN = makeSymbol( "ELPART-DSINK-BRANCH-ASDEL-FN" );
    $sym179$_CSETF_ELPART_DSINK_BRANCH_ASDEL_FN = makeSymbol( "_CSETF-ELPART-DSINK-BRANCH-ASDEL-FN" );
    $sym180$ELPART_DSINK_TIP_CCREATE_FN = makeSymbol( "ELPART-DSINK-TIP-CCREATE-FN" );
    $sym181$_CSETF_ELPART_DSINK_TIP_CCREATE_FN = makeSymbol( "_CSETF-ELPART-DSINK-TIP-CCREATE-FN" );
    $sym182$ELPART_DSINK_TIP_ASCREATE_FN = makeSymbol( "ELPART-DSINK-TIP-ASCREATE-FN" );
    $sym183$_CSETF_ELPART_DSINK_TIP_ASCREATE_FN = makeSymbol( "_CSETF-ELPART-DSINK-TIP-ASCREATE-FN" );
    $sym184$ELPART_DSINK_TIP_ASREASSERT_FN = makeSymbol( "ELPART-DSINK-TIP-ASREASSERT-FN" );
    $sym185$_CSETF_ELPART_DSINK_TIP_ASREASSERT_FN = makeSymbol( "_CSETF-ELPART-DSINK-TIP-ASREASSERT-FN" );
    $kw186$STATE = makeKeyword( "STATE" );
    $kw187$BRANCH_CDEL_FN = makeKeyword( "BRANCH-CDEL-FN" );
    $kw188$BRANCH_ASDEL_FN = makeKeyword( "BRANCH-ASDEL-FN" );
    $kw189$TIP_CCREATE_FN = makeKeyword( "TIP-CCREATE-FN" );
    $kw190$TIP_ASCREATE_FN = makeKeyword( "TIP-ASCREATE-FN" );
    $kw191$TIP_ASREASSERT_FN = makeKeyword( "TIP-ASREASSERT-FN" );
    $sym192$MAKE_EL_PARTITION_DATA_SINK = makeSymbol( "MAKE-EL-PARTITION-DATA-SINK" );
    $sym193$VISIT_DEFSTRUCT_OBJECT_EL_PARTITION_DATA_SINK_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-EL-PARTITION-DATA-SINK-METHOD" );
    $sym194$NOTE_EL_PARTITION_BRANCH_CONSTANT_DELETE = makeSymbol( "NOTE-EL-PARTITION-BRANCH-CONSTANT-DELETE" );
    $sym195$NOTE_EL_PARTITION_BRANCH_ASSERTION_DELETE = makeSymbol( "NOTE-EL-PARTITION-BRANCH-ASSERTION-DELETE" );
    $sym196$NOTE_EL_PARTITION_TIP_CONSTANT_CREATE = makeSymbol( "NOTE-EL-PARTITION-TIP-CONSTANT-CREATE" );
    $sym197$NOTE_EL_PARTITION_TIP_ASSERTION_CREATE = makeSymbol( "NOTE-EL-PARTITION-TIP-ASSERTION-CREATE" );
    $sym198$NOTE_EL_PARTITION_TIP_ASSERTION_REASSERT = makeSymbol( "NOTE-EL-PARTITION-TIP-ASSERTION-REASSERT" );
    $list199 = ConsesLow.list( ConsesLow.list( makeSymbol( "CREATOR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym200$_EL_PARTITION_CREATOR_OVERRIDE_ = makeSymbol( "*EL-PARTITION-CREATOR-OVERRIDE*" );
    $list201 = ConsesLow.list( ConsesLow.list( makeSymbol( "PURPOSE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym202$_EL_PARTITION_CREATION_PURPOSE_OVERRIDE_ = makeSymbol( "*EL-PARTITION-CREATION-PURPOSE-OVERRIDE*" );
    $list203 = ConsesLow.list( ConsesLow.list( makeSymbol( "MT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym204$_EL_PARTITION_MT_OVERRIDE_ = makeSymbol( "*EL-PARTITION-MT-OVERRIDE*" );
    $list205 = ConsesLow.list( ConsesLow.list( makeSymbol( "DIRECTION" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym206$_EL_PARTITION_DIRECTION_OVERRIDE_ = makeSymbol( "*EL-PARTITION-DIRECTION-OVERRIDE*" );
    $list207 = ConsesLow.list( ConsesLow.list( makeSymbol( "*EL-PARTITION-CREATION-PURPOSE-OVERRIDE*" ), makeInteger( 212 ) ) );
    $sym208$TRANSCRIPT_DATA_SINK_BRANCH_CONSTANT_DELETE = makeSymbol( "TRANSCRIPT-DATA-SINK-BRANCH-CONSTANT-DELETE" );
    $sym209$TRANSCRIPT_DATA_SINK_BRANCH_ASSERTION_DELETE = makeSymbol( "TRANSCRIPT-DATA-SINK-BRANCH-ASSERTION-DELETE" );
    $sym210$TRANSCRIPT_DATA_SINK_TIP_CONSTANT_CREATE = makeSymbol( "TRANSCRIPT-DATA-SINK-TIP-CONSTANT-CREATE" );
    $sym211$TRANSCRIPT_DATA_SINK_TIP_ASSERTION_CREATE = makeSymbol( "TRANSCRIPT-DATA-SINK-TIP-ASSERTION-CREATE" );
    $sym212$TRANSCRIPT_DATA_SINK_TIP_ASSERTION_REASSERT = makeSymbol( "TRANSCRIPT-DATA-SINK-TIP-ASSERTION-REASSERT" );
    $str213$_FI_KILL____HP__S__S__ = makeString( "(FI-KILL '(:HP ~S ~S))" );
    $str214$_FI_UNASSERT___S___S_ = makeString( "(FI-UNASSERT '~S '~S)" );
    $str215$_FI_CREATE___S__S_ = makeString( "(FI-CREATE '~S ~S)" );
    $str216$_FI_ASSERT___S___S___S___S_ = makeString( "(FI-ASSERT '~S '~S '~S '~S)" );
    $str217$_FI_REASSERT___S___S___S___S_ = makeString( "(FI-REASSERT '~S '~S '~S '~S)" );
    $str218$_FI_TIMESTAMP_CONSTANT___S___S___ = makeString( "(FI-TIMESTAMP-CONSTANT '~S '~S '~S '~S)" );
    $str219$_FI_TIMESTAMP_ASSERTION___S___S__ = makeString( "(FI-TIMESTAMP-ASSERTION '~S '~S '~S '~S)" );
    $list220 = ConsesLow.list( makeKeyword( "HP" ), makeString( "Guest" ), makeGuid( "bd5ad700-9c29-11b1-9dad-c379636f7270" ) );
    $str221$_ = makeString( "(" );
    $str222$_ = makeString( ")" );
    $sym223$DEBUG_DATA_SINK_BRANCH_CONSTANT_DELETE = makeSymbol( "DEBUG-DATA-SINK-BRANCH-CONSTANT-DELETE" );
    $sym224$DEBUG_DATA_SINK_BRANCH_ASSERTION_DELETE = makeSymbol( "DEBUG-DATA-SINK-BRANCH-ASSERTION-DELETE" );
    $sym225$DEBUG_DATA_SINK_TIP_CONSTANT_CREATE = makeSymbol( "DEBUG-DATA-SINK-TIP-CONSTANT-CREATE" );
    $sym226$DEBUG_DATA_SINK_TIP_ASSERTION_CREATE = makeSymbol( "DEBUG-DATA-SINK-TIP-ASSERTION-CREATE" );
    $sym227$DEBUG_DATA_SINK_TIP_ASSERTION_REASSERT = makeSymbol( "DEBUG-DATA-SINK-TIP-ASSERTION-REASSERT" );
    $str228$___kill__A__A__ = makeString( "~&:kill ~A ~A~%" );
    $str229$___unassert__A__ = makeString( "~&:unassert ~A~%" );
    $str230$___create__A__A__ = makeString( "~&:create ~A ~A~%" );
    $str231$___assert__A__ = makeString( "~&:assert ~A~%" );
    $str232$___reassert__A__A__A__ = makeString( "~&:reassert ~A ~A ~A~%" );
  }

  public static final class $elpart_as_desc_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $tl_ist_formula;
    public SubLObject $hash;
    public SubLObject $extra;
    public SubLObject $weak_ist_formula;
    private static final SubLStructDeclNative structDecl;

    public $elpart_as_desc_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$tl_ist_formula = CommonSymbols.NIL;
      this.$hash = CommonSymbols.NIL;
      this.$extra = CommonSymbols.NIL;
      this.$weak_ist_formula = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $elpart_as_desc_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$tl_ist_formula;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$hash;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$extra;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$weak_ist_formula;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$tl_ist_formula = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$hash = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$extra = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$weak_ist_formula = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $elpart_as_desc_native.class, $sym97$ELPART_AS_DESC, $sym98$ELPART_AS_DESC_P, $list99, $list100, new String[] { "$id", "$tl_ist_formula", "$hash", "$extra",
        "$weak_ist_formula"
      }, $list101, $list102, $sym103$PRINT_ELPART_AS_DESC );
    }
  }

  public static final class $elpart_as_desc_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $elpart_as_desc_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ELPART-AS-DESC-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return elpart_as_desc_p( arg1 );
    }
  }

  public static final class $el_partition_data_sink_native
      extends
        SubLStructNative
  {
    public SubLObject $state;
    public SubLObject $branch_cdel_fn;
    public SubLObject $branch_asdel_fn;
    public SubLObject $tip_ccreate_fn;
    public SubLObject $tip_ascreate_fn;
    public SubLObject $tip_asreassert_fn;
    private static final SubLStructDeclNative structDecl;

    public $el_partition_data_sink_native()
    {
      this.$state = CommonSymbols.NIL;
      this.$branch_cdel_fn = CommonSymbols.NIL;
      this.$branch_asdel_fn = CommonSymbols.NIL;
      this.$tip_ccreate_fn = CommonSymbols.NIL;
      this.$tip_ascreate_fn = CommonSymbols.NIL;
      this.$tip_asreassert_fn = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $el_partition_data_sink_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$state;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$branch_cdel_fn;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$branch_asdel_fn;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$tip_ccreate_fn;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$tip_ascreate_fn;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$tip_asreassert_fn;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$state = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$branch_cdel_fn = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$branch_asdel_fn = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$tip_ccreate_fn = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$tip_ascreate_fn = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$tip_asreassert_fn = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $el_partition_data_sink_native.class, $sym166$EL_PARTITION_DATA_SINK, $sym62$EL_PARTITION_DATA_SINK_P, $list167, $list168, new String[] { "$state", "$branch_cdel_fn",
        "$branch_asdel_fn", "$tip_ccreate_fn", "$tip_ascreate_fn", "$tip_asreassert_fn"
      }, $list169, $list170, $sym171$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $el_partition_data_sink_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $el_partition_data_sink_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EL-PARTITION-DATA-SINK-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return el_partition_data_sink_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 2248 ms
 * 
 */