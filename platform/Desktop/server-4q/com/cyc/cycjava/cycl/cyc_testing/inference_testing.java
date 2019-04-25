package com.cyc.cycjava.cycl.cyc_testing;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.eval_in_api;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.kb_paths;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.fi;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_testing
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.inference_testing";
  public static final String myFingerPrint = "7caeea3f8b941d1d1b17053c87e46596f2d4c16901fde64d2594adaadb80b750";
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 1687L)
  public static SubLSymbol $default_cyc_test_file$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 1893L)
  public static SubLSymbol $inference_tests$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 1924L)
  public static SubLSymbol $test_constants_created$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 1968L)
  public static SubLSymbol $current_test$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2003L)
  public static SubLSymbol $test_status$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2036L)
  public static SubLSymbol $test_results$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2070L)
  public static SubLSymbol $break_on_failure$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2109L)
  public static SubLSymbol $break_on_failureP$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2148L)
  public static SubLSymbol $break_before_test_endP$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2192L)
  public static SubLSymbol $elapsed_time$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2226L)
  public static SubLSymbol $it_failing_verbose$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2374L)
  public static SubLSymbol $it_verbose$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2404L)
  public static SubLSymbol $it_backchain$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2486L)
  public static SubLSymbol $it_number$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2515L)
  public static SubLSymbol $it_time$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2543L)
  public static SubLSymbol $it_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2572L)
  public static SubLSymbol $test_direction$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2614L)
  public static SubLSymbol $verify_as_continuableP$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2733L)
  public static SubLSymbol $index_collection$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2772L)
  public static SubLSymbol $debug_continue$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2872L)
  public static SubLSymbol $it_show_all_failures$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 2992L)
  public static SubLSymbol $evaluate_previously_failing_tests$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 3120L)
  public static SubLSymbol $known_bug_types_to_check$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 3308L)
  public static SubLSymbol $check_all_it_bug_types$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 34690L)
  public static SubLSymbol $clean_up_test_constantsP$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 44193L)
  public static SubLSymbol $time_inference_tests$;
  private static final SubLString $str0$inference_tests;
  private static final SubLString $str1$lisp;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$BACKWARD;
  private static final SubLString $str4$___s;
  private static final SubLString $str5$__No_assertions_found_;
  private static final SubLSymbol $kw6$UNKNOWN;
  private static final SubLSymbol $kw7$CONTINUABLE_;
  private static final SubLSymbol $sym8$NEW_CYC_QUERY;
  private static final SubLString $str9$_____s;
  private static final SubLString $str10$__Success___s________________s;
  private static final SubLSymbol $kw11$FAILURE;
  private static final SubLString $str12$__Failure___s________________s;
  private static final SubLString $str13$Failure___s________________s;
  private static final SubLString $str14$__Success___s________________s__;
  private static final SubLString $str15$__Failure___s________________s__;
  private static final SubLSymbol $sym16$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str17$_A;
  private static final SubLString $str18$__Success___A__;
  private static final SubLString $str19$__Failure___s_______________NO_ER;
  private static final SubLString $str20$__Failure___A__;
  private static final SubLString $str21$__Success___s_______________NO_ER;
  private static final SubLString $str22$__Success___s________________s__C;
  private static final SubLString $str23$__Failure___s________________s__C;
  private static final SubLString $str24$Failure___s________________s__Com;
  private static final SubLSymbol $kw25$EVAL_AGAIN;
  private static final SubLSymbol $kw26$APPLY;
  private static final SubLString $str27$__Success___s________________s__p;
  private static final SubLString $str28$__Failure___s________________s_fa;
  private static final SubLString $str29$Failure___s________________s_fail;
  private static final SubLSymbol $sym30$RETURN_LIST_OF_VALUES;
  private static final SubLString $str31$__Normal___s_______________s__Exp;
  private static final SubLSymbol $kw32$ABNORMAL;
  private static final SubLString $str33$__Abnormal___s_________________s_;
  private static final SubLString $str34$Abnormal___s_________________s__E;
  private static final SubLSymbol $sym35$EQUAL_BINDINGS;
  private static final SubLString $str36$__Abnormal___s_______________s__E;
  private static final SubLString $str37$Abnormal___s_______________s__Exp;
  private static final SubLSymbol $kw38$DEFAULT;
  private static final SubLSymbol $kw39$STRENGTH;
  private static final SubLSymbol $kw40$DIRECTION;
  private static final SubLSymbol $sym41$CYC_ASSERT;
  private static final SubLString $str42$__Failure__Assertion__s_failed_;
  private static final SubLString $str43$Failure__Assertion__s_failed_;
  private static final SubLSymbol $sym44$CYC_ASSERT_WFF;
  private static final SubLSymbol $kw45$FORWARD;
  private static final SubLSymbol $kw46$SILENT;
  private static final SubLString $str47$___A__;
  private static final SubLString $str48$___s_constant_A__A__;
  private static final SubLString $str49$s_were;
  private static final SubLString $str50$_was;
  private static final SubLString $str51$created;
  private static final SubLString $str52$destroyed;
  private static final SubLString $str53$___s_nart_A__A__;
  private static final SubLString $str54$___s_assertion_A__A__;
  private static final SubLString $str55$___s_kb_hl_support_A__A__;
  private static final SubLString $str56$___s_deduction_A__A__;
  private static final SubLString $str57$__Assert_time____A;
  private static final SubLSymbol $sym58$FI_UNASSERT_INT;
  private static final SubLSymbol $sym59$FI_BLAST_INT;
  private static final SubLSymbol $sym60$FI_JUSTIFY_INT;
  private static final SubLString $str61$__Justification_____s;
  private static final SubLSymbol $sym62$FI_KILL_INT;
  private static final SubLSymbol $sym63$FI_FIND_OR_CREATE_INT;
  private static final SubLString $str64$__Failure__Did_not_find_unique_na;
  private static final SubLString $str65$Failure__Create_constant__s_faile;
  private static final SubLSymbol $sym66$FI_TMS_RECONSIDER_FORMULA_INT;
  private static final SubLSymbol $sym67$FI_TMS_RECONSIDER_MT_INT;
  private static final SubLSymbol $kw68$SUCCESS;
  private static final SubLSymbol $sym69$CAR;
  private static final SubLSymbol $kw70$TRANSMIT_AND_RECEIVE;
  private static final SubLSymbol $kw71$DEAF;
  private static final SubLSymbol $kw72$STANDARD;
  private static final SubLString $str73$___IT___S__S_;
  private static final SubLSymbol $kw74$POST_BUILD;
  private static final SubLString $str75$_____Starting__IT___S__S__at__A__;
  private static final SubLSymbol $kw76$IT;
  private static final SubLString $str77$_____s____3f_;
  private static final SubLSymbol $kw78$VERBOSE;
  private static final SubLString $str79$Warning__Test__;
  private static final SubLString $str80$_;
  private static final SubLString $str81$__changed_the_KB_;
  private static final SubLString $str82$__There_is_no_test_in__s_associat;
  private static final SubLSymbol $sym83$_INFERENCE_TESTS_;
  private static final SubLString $str84$__In_fact__there_are_no_tests_in_;
  private static final SubLString $str85$__The__s_argument_is__s__which_is;
  private static final SubLSymbol $sym86$KEYWORD_LIST;
  private static final SubLSymbol $sym87$TERM__;
  private static final SubLSymbol $sym88$CDR;
  private static final SubLString $str89$__;
  private static final SubLString $str90$__;
  private static final SubLString $str91$_IT;
  private static final SubLString $str92$Unknown_output_format__A;
  private static final SubLString $str93$___s__a__s;
  private static final SubLString $str94$___s_____s;
  private static final SubLList $list95;
  private static final SubLList $list96;
  private static final SubLSymbol $sym97$PIF;
  private static final SubLSymbol $sym98$CAND;
  private static final SubLSymbol $sym99$_EVALUATE_PREVIOUSLY_FAILING_TESTS_;
  private static final SubLSymbol $sym100$COR;
  private static final SubLSymbol $sym101$NULL;
  private static final SubLSymbol $sym102$_CHECK_ALL_IT_BUG_TYPES_;
  private static final SubLSymbol $sym103$MEMBER;
  private static final SubLSymbol $sym104$_KNOWN_BUG_TYPES_TO_CHECK_;
  private static final SubLSymbol $sym105$PROGN;
  private static final SubLSymbol $sym106$_IT_FAILING_VERBOSE_;
  private static final SubLSymbol $sym107$CLET;
  private static final SubLList $list108;
  private static final SubLSymbol $sym109$FORMAT;
  private static final SubLString $str110$__The_previously_failing_test____;
  private static final SubLSymbol $sym111$QUOTE;
  private static final SubLSymbol $sym112$PWHEN;
  private static final SubLSymbol $sym113$APPLY;
  private static final SubLList $list114;
  private static final SubLSymbol $sym115$CNOT;
  private static final SubLString $str116$__This_previously_failing_test___;
  private static final SubLString $str117$__This_previously_failing_test___;
  private static final SubLString $str118$__Starting__a____;
  private static final SubLSymbol $sym119$DEF_INFERENCE_TEST;
  private static final SubLSymbol $sym120$DEFINE_INFERENCE_TEST;
  private static final SubLSymbol $sym121$INVALID_CONSTANT_;
  private static final SubLSymbol $sym122$FIRST;
  private static final SubLString $str123$_s;
  private static final SubLString $str124$_s_is_not_an_accessible_pathname_;
  private static final SubLSymbol $sym125$STRING_;
  private static final SubLSymbol $sym126$OBJ__STRING;
  private static final SubLString $str127$___ERROR__LOADING__A__S;
  private static final SubLString $str128$___s_is_bound_to__s__which_is_not;
  private static final SubLSymbol $sym129$PATHNAME;
  private static final SubLList $list130;
  private static final SubLSymbol $sym131$VAR_SPEC_VAR;
  private static final SubLSymbol $sym132$TEST_CONSTANTS;
  private static final SubLSymbol $sym133$CUNWIND_PROTECT;
  private static final SubLSymbol $sym134$PRINT_CREATE_VAR_SPEC_CONSTANT;
  private static final SubLSymbol $sym135$CSETQ;
  private static final SubLSymbol $sym136$LIST;
  private static final SubLSymbol $sym137$PRINT_ASSERT;
  private static final SubLSymbol $sym138$VAR_SPEC_DEF;
  private static final SubLList $list139;
  private static final SubLList $list140;
  private static final SubLSymbol $sym141$_CLEAN_UP_TEST_CONSTANTS__;
  private static final SubLSymbol $sym142$PRINT_KILL;
  private static final SubLList $list143;
  private static final SubLSymbol $sym144$TEST_ASSERTIONS;
  private static final SubLSymbol $sym145$PRINT_UNASSERT;
  private static final SubLSymbol $sym146$TEST_ASSERTIONS;
  private static final SubLSymbol $sym147$APPEND;
  private static final SubLList $list148;
  private static final SubLSymbol $sym149$ARGLIST;
  private static final SubLSymbol $sym150$DEFMACRO;
  private static final SubLSymbol $sym151$_REST;
  private static final SubLSymbol $sym152$RET;
  private static final SubLSymbol $sym153$BQ_LIST;
  private static final SubLList $list154;
  private static final SubLSymbol $sym155$BQ_CONS;
  private static final SubLList $list156;
  private static final SubLSymbol $sym157$BQ_APPEND;
  private static final SubLList $list158;
  private static final SubLList $list159;
  private static final SubLList $list160;
  private static final SubLList $list161;
  private static final SubLString $str162$___________A__S;
  private static final SubLList $list163;
  private static final SubLString $str164$___________A__S;
  private static final SubLSymbol $sym165$B_VERIFY;
  private static final SubLList $list166;
  private static final SubLList $list167;
  private static final SubLSymbol $kw168$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw169$KB;
  private static final SubLSymbol $kw170$OWNER;
  private static final SubLSymbol $kw171$COMMENT;
  private static final SubLSymbol $kw172$BUG;
  private static final SubLSymbol $kw173$CREATED;
  private static final SubLSymbol $kw174$CREATOR;
  private static final SubLSymbol $kw175$WORKING_;
  private static final SubLList $list176;
  private static final SubLSymbol $sym177$PCOND;
  private static final SubLSymbol $sym178$RUN_INFERENCE_TEST_;
  private static final SubLList $list179;
  private static final SubLSymbol $sym180$INFERENCE_TEST_MENTIONS_INVALID_CONSTANT_;
  private static final SubLList $list181;
  private static final SubLList $list182;
  private static final SubLSymbol $sym183$NEW_INFERENCE_TEST;
  private static final SubLSymbol $kw184$BOTH;
  private static final SubLSymbol $kw185$FULL;
  private static final SubLSymbol $kw186$TINY;
  private static final SubLSymbol $sym187$KEYWORDP;
  private static final SubLList $list188;
  private static final SubLSymbol $sym189$INFERENCE_TEST_DIRECTION_P;
  private static final SubLSymbol $sym190$CYC_TEST_KB_P;
  private static final SubLSymbol $sym191$INFERENCE_TEST_OWNER_P;
  private static final SubLSymbol $sym192$STRINGP;
  private static final SubLSymbol $sym193$POSITIVE_INTEGER_P;
  private static final SubLSymbol $kw194$BUG_NUMBER;
  private static final SubLSymbol $sym195$UNIVERSAL_DATE_P;
  private static final SubLSymbol $kw196$CREATION_DATE;
  private static final SubLSymbol $sym197$BOOLEANP;
  private static final SubLSymbol $sym198$INFERENCE_TEST_WORKING_;
  private static final SubLSymbol $sym199$DEF_TIME_INFERENCE_TEST;
  private static final SubLSymbol $sym200$DEFINED_TIME_INFERENCE_TESTS;
  private static final SubLSymbol $sym201$DO_TIME_TESTS_BACKWARD;

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 1745L)
  public static SubLObject construct_cyc_test_filename(SubLObject name, SubLObject suffix)
  {
    if( name == UNPROVIDED )
    {
      name = $default_cyc_test_file$.getDynamicValue();
    }
    if( suffix == UNPROVIDED )
    {
      suffix = $str1$lisp;
    }
    return file_utilities.cyc_home_filename( $list2, name, suffix );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 3496L)
  public static SubLObject break_on_failureP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $break_on_failure$.getDynamicValue( thread ) || NIL != $break_on_failureP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 3580L)
  public static SubLObject return_list_of_values(final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLObject v_bindings = inference_kernel.new_cyc_query( sentence, mt, query_properties );
    SubLObject constants = NIL;
    SubLObject cdolist_list_var = v_bindings;
    SubLObject bl = NIL;
    bl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( Sequences.length( bl ).numG( ONE_INTEGER ) )
      {
        constants = ConsesLow.cons( bindings.bindings_values( bl ), constants );
      }
      else
      {
        constants = ConsesLow.append( bindings.bindings_values( bl ), constants );
      }
      cdolist_list_var = cdolist_list_var.rest();
      bl = cdolist_list_var.first();
    }
    return constants;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 4061L)
  public static SubLObject list_assertions(final SubLObject query, final SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth)
  {
    if( backchainP == UNPROVIDED )
    {
      backchainP = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLObject v_bindings = fi.fi_ask_int( query, mt, backchainP, number, time, depth );
    SubLObject assertions = NIL;
    SubLObject cdolist_list_var = v_bindings;
    SubLObject bl = NIL;
    bl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assertions = ConsesLow.cons( conses_high.sublis( bl, query, Symbols.symbol_function( EQUAL ), UNPROVIDED ), assertions );
      cdolist_list_var = cdolist_list_var.rest();
      bl = cdolist_list_var.first();
    }
    return assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 4329L)
  public static SubLObject print_assertions(final SubLObject query, final SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth, SubLObject stream)
  {
    if( backchainP == UNPROVIDED )
    {
      backchainP = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLObject assertions = list_assertions( query, mt, backchainP, number, time, depth );
    if( NIL != assertions )
    {
      SubLObject cdolist_list_var = assertions;
      SubLObject as = NIL;
      as = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( stream, $str4$___s, as );
        cdolist_list_var = cdolist_list_var.rest();
        as = cdolist_list_var.first();
      }
    }
    else
    {
      PrintLow.format( stream, $str5$__No_assertions_found_ );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 4633L)
  public static SubLObject instanceofP(final SubLObject x, final SubLObject collection)
  {
    return isa.isa_in_any_mtP( x, collection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 4708L)
  public static SubLObject legacy_b_verify(final SubLObject query_expr, final SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth)
  {
    if( backchainP == UNPROVIDED )
    {
      backchainP = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters( backchainP, number, time, depth );
    return b_verify( query_expr, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 5006L)
  public static SubLObject b_verify(final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      query_properties = conses_high.putf( query_properties, $kw7$CONTINUABLE_, $verify_as_continuableP$.getDynamicValue( thread ) );
      final SubLObject form = ConsesLow.list( $sym8$NEW_CYC_QUERY, list_utilities.quotify( sentence ), list_utilities.quotify( mt ), list_utilities.quotify( query_properties ) );
      if( NIL != $it_verbose$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str9$_____s, form );
      }
      final SubLObject val = Eval.eval( form );
      if( NIL != val )
      {
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str10$__Success___s________________s, form, val );
        }
      }
      else
      {
        $test_status$.setDynamicValue( $kw11$FAILURE, thread );
        if( NIL != $it_verbose$.getDynamicValue( thread ) || NIL != $it_show_all_failures$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str12$__Failure___s________________s, form, val );
        }
        if( NIL != break_on_failureP() )
        {
          Errors.sublisp_break( $str13$Failure___s________________s, new SubLObject[] { form, val
          } );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 5825L)
  public static SubLObject print_and_eval(final SubLObject expr_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      SubLObject cdolist_list_var = expr_list;
      SubLObject expr = NIL;
      expr = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str9$_____s, expr );
        }
        Eval.eval( expr );
        cdolist_list_var = cdolist_list_var.rest();
        expr = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 6039L)
  public static SubLObject b_test_form(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      if( NIL != $it_verbose$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str9$_____s, form );
      }
      final SubLObject returned = Eval.eval( form );
      if( NIL != returned )
      {
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str14$__Success___s________________s__, form, returned );
        }
      }
      else
      {
        $test_status$.setDynamicValue( $kw11$FAILURE, thread );
        if( NIL != $it_verbose$.getDynamicValue( thread ) || NIL != $it_show_all_failures$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str15$__Failure___s________________s__, form, returned );
        }
        if( NIL != break_on_failureP() )
        {
          Errors.sublisp_break( $str13$Failure___s________________s, new SubLObject[] { form, returned
          } );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 6626L)
  public static SubLObject test_error(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      if( NIL != $it_verbose$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str9$_____s, form );
      }
      SubLObject error_message = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym16$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            final SubLObject _prev_bind_0_$1 = api_control_vars.$use_local_queueP$.currentBinding( thread );
            try
            {
              api_control_vars.$use_local_queueP$.bind( NIL, thread );
              Eval.eval( form );
              if( NIL != fi.fi_error_signaledP() )
              {
                Errors.error( $str17$_A, fi.fi_get_error_string_int() );
              }
            }
            finally
            {
              api_control_vars.$use_local_queueP$.rebind( _prev_bind_0_$1, thread );
            }
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != error_message )
      {
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str18$__Success___A__, error_message );
        }
      }
      else
      {
        $test_status$.setDynamicValue( $kw11$FAILURE, thread );
        if( NIL != $it_verbose$.getDynamicValue( thread ) || NIL != $it_show_all_failures$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str19$__Failure___s_______________NO_ER, form );
        }
        if( NIL != break_on_failureP() )
        {
          Errors.sublisp_break( $str19$__Failure___s_______________NO_ER, new SubLObject[] { form
          } );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 7713L)
  public static SubLObject test_warning(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      if( NIL != $it_verbose$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str9$_____s, form );
      }
      SubLObject error_message = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym16$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            final SubLObject _prev_bind_0_$2 = api_control_vars.$use_local_queueP$.currentBinding( thread );
            try
            {
              api_control_vars.$use_local_queueP$.bind( NIL, thread );
              Eval.eval( form );
              if( NIL != fi.fi_warning_signaledP() )
              {
                Errors.error( $str17$_A, fi.fi_get_warning_int() );
              }
            }
            finally
            {
              api_control_vars.$use_local_queueP$.rebind( _prev_bind_0_$2, thread );
            }
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != error_message )
      {
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str18$__Success___A__, error_message );
        }
      }
      else
      {
        $test_status$.setDynamicValue( $kw11$FAILURE, thread );
        if( NIL != $it_verbose$.getDynamicValue( thread ) || NIL != $it_show_all_failures$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str19$__Failure___s_______________NO_ER, form );
        }
        if( NIL != break_on_failureP() )
        {
          Errors.sublisp_break( $str19$__Failure___s_______________NO_ER, new SubLObject[] { form
          } );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 8664L)
  public static SubLObject test_no_warning(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      if( NIL != $it_verbose$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str9$_____s, form );
      }
      SubLObject error_message = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym16$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            final SubLObject _prev_bind_0_$3 = api_control_vars.$use_local_queueP$.currentBinding( thread );
            try
            {
              api_control_vars.$use_local_queueP$.bind( NIL, thread );
              Eval.eval( form );
              if( NIL != fi.fi_warning_signaledP() )
              {
                Errors.error( $str17$_A, fi.fi_get_warning_int() );
              }
            }
            finally
            {
              api_control_vars.$use_local_queueP$.rebind( _prev_bind_0_$3, thread );
            }
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != error_message )
      {
        $test_status$.setDynamicValue( $kw11$FAILURE, thread );
        if( NIL != $it_verbose$.getDynamicValue( thread ) || NIL != $it_show_all_failures$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str20$__Failure___A__, error_message );
        }
        if( NIL != break_on_failureP() )
        {
          Errors.sublisp_break( $str19$__Failure___s_______________NO_ER, new SubLObject[] { form
          } );
        }
      }
      else if( NIL != $it_verbose$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str21$__Success___s_______________NO_ER );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 9617L)
  public static SubLObject form_verify(final SubLObject test_function, final SubLObject value, final SubLObject form_to_eval, SubLObject test_predicate)
  {
    if( test_predicate == UNPROVIDED )
    {
      test_predicate = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      if( NIL != $it_verbose$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str9$_____s, form_to_eval );
      }
      final SubLObject returned = Eval.eval( form_to_eval );
      if( NIL != ( ( NIL != test_predicate ) ? Functions.funcall( test_function, value, returned, test_predicate ) : Functions.funcall( test_function, value, returned ) ) )
      {
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str22$__Success___s________________s__C, new SubLObject[] { form_to_eval, returned, value, test_function
          } );
        }
      }
      else
      {
        $test_status$.setDynamicValue( $kw11$FAILURE, thread );
        if( NIL != $it_verbose$.getDynamicValue( thread ) || NIL != $it_show_all_failures$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str23$__Failure___s________________s__C, new SubLObject[] { form_to_eval, returned, value, test_function
          } );
        }
        if( NIL != break_on_failureP() )
        {
          Errors.sublisp_break( $str24$Failure___s________________s__Com, new SubLObject[] { form_to_eval, returned, value, test_function
          } );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 10765L)
  public static SubLObject test_verify(final SubLObject predicate, final SubLObject form_to_eval)
  {
    return test_verify_guts( predicate, form_to_eval, $kw25$EVAL_AGAIN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 11020L)
  public static SubLObject test_verify_new(final SubLObject predicate, final SubLObject form_to_eval)
  {
    return test_verify_guts( predicate, form_to_eval, $kw26$APPLY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 11268L)
  public static SubLObject test_verify_guts(final SubLObject predicate, final SubLObject form_to_eval, final SubLObject eval_method)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      if( NIL != $it_verbose$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str9$_____s, form_to_eval );
      }
      final SubLObject evaluated_form = Eval.eval( form_to_eval );
      final SubLObject results = ( eval_method == $kw25$EVAL_AGAIN ) ? Eval.eval( ConsesLow.list( predicate, evaluated_form ) ) : Functions.apply( predicate, ConsesLow.list( evaluated_form ) );
      if( NIL != results )
      {
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str27$__Success___s________________s__p, new SubLObject[] { form_to_eval, evaluated_form, predicate
          } );
        }
      }
      else
      {
        $test_status$.setDynamicValue( $kw11$FAILURE, thread );
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str28$__Failure___s________________s_fa, new SubLObject[] { form_to_eval, evaluated_form, predicate
          } );
        }
        if( NIL != break_on_failureP() )
        {
          Errors.sublisp_break( $str29$Failure___s________________s_fail, new SubLObject[] { form_to_eval, evaluated_form, predicate
          } );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 12129L)
  public static SubLObject m_verify(final SubLObject expected, final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      final SubLObject form = ConsesLow.list( $sym30$RETURN_LIST_OF_VALUES, list_utilities.quotify( sentence ), list_utilities.quotify( mt ), list_utilities.quotify( query_properties ) );
      if( NIL != $it_verbose$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str9$_____s, form );
      }
      final SubLObject result = Eval.eval( form );
      final SubLObject found = conses_high.intersection( expected, result, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      final SubLObject not_found = conses_high.set_difference( expected, found, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      final SubLObject unexpected = conses_high.set_difference( result, expected, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      if( NIL != list_utilities.sets_equalP( expected, found, Symbols.symbol_function( EQUAL ) ) )
      {
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str31$__Normal___s_______________s__Exp, new SubLObject[] { form, found, expected
          } );
        }
      }
      else
      {
        $test_status$.setDynamicValue( $kw32$ABNORMAL, thread );
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str33$__Abnormal___s_________________s_, new SubLObject[] { form, found, expected, not_found, unexpected
          } );
        }
        if( NIL != break_on_failureP() )
        {
          Errors.sublisp_break( $str34$Abnormal___s_________________s__E, new SubLObject[] { form, found, expected, not_found, unexpected
          } );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 13296L)
  public static SubLObject legacy_binding_verify(final SubLObject expected_bindings, final SubLObject query_expr, final SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth)
  {
    if( backchainP == UNPROVIDED )
    {
      backchainP = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters( backchainP, number, time, depth );
    return binding_verify( expected_bindings, query_expr, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 13664L)
  public static SubLObject binding_verify(final SubLObject expected_bindings, final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      query_properties = conses_high.putf( query_properties, $kw7$CONTINUABLE_, $verify_as_continuableP$.getDynamicValue( thread ) );
      final SubLObject form = ConsesLow.list( $sym8$NEW_CYC_QUERY, list_utilities.quotify( sentence ), list_utilities.quotify( mt ), list_utilities.quotify( query_properties ) );
      if( NIL != $it_verbose$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str9$_____s, form );
      }
      final SubLObject result_bindings = Eval.eval( form );
      if( NIL != list_utilities.sets_equalP( expected_bindings, result_bindings, Symbols.symbol_function( $sym35$EQUAL_BINDINGS ) ) )
      {
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str31$__Normal___s_______________s__Exp, new SubLObject[] { form, result_bindings, expected_bindings
          } );
        }
      }
      else
      {
        $test_status$.setDynamicValue( $kw32$ABNORMAL, thread );
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str36$__Abnormal___s_______________s__E, new SubLObject[] { form, result_bindings, expected_bindings
          } );
        }
        if( NIL != break_on_failureP() )
        {
          Errors.sublisp_break( $str37$Abnormal___s_______________s__Exp, new SubLObject[] { form, result_bindings, expected_bindings
          } );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 14734L)
  public static SubLObject legacy_verify_not(final SubLObject query_expr, final SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth)
  {
    if( backchainP == UNPROVIDED )
    {
      backchainP = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters( backchainP, number, time, depth );
    return verify_not( query_expr, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 15026L)
  public static SubLObject verify_not(final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      query_properties = conses_high.putf( query_properties, $kw7$CONTINUABLE_, $verify_as_continuableP$.getDynamicValue( thread ) );
      final SubLObject form = ConsesLow.list( $sym8$NEW_CYC_QUERY, list_utilities.quotify( sentence ), list_utilities.quotify( mt ), list_utilities.quotify( query_properties ) );
      if( NIL != $it_verbose$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str9$_____s, form );
      }
      final SubLObject val = Eval.eval( form );
      if( NIL == val )
      {
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str10$__Success___s________________s, form, val );
        }
      }
      else
      {
        $test_status$.setDynamicValue( $kw11$FAILURE, thread );
        if( NIL != $it_verbose$.getDynamicValue( thread ) || NIL != $it_show_all_failures$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str12$__Failure___s________________s, form, val );
        }
        if( NIL != break_on_failureP() )
        {
          Errors.sublisp_break( $str13$Failure___s________________s, new SubLObject[] { form, val
          } );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 15830L)
  public static SubLObject print_assert(final SubLObject expr_list, final SubLObject mt, SubLObject el_tv, SubLObject direction)
  {
    if( el_tv == UNPROVIDED )
    {
      el_tv = $kw38$DEFAULT;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      SubLObject cdolist_list_var = expr_list;
      SubLObject expr = NIL;
      expr = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject v_properties = ConsesLow.listS( $kw39$STRENGTH, el_tv, ConsesLow.append( ( NIL != direction ) ? ConsesLow.list( $kw40$DIRECTION, direction ) : NIL, NIL ) );
        final SubLObject form = ConsesLow.list( $sym41$CYC_ASSERT, list_utilities.quotify( expr ), list_utilities.quotify( mt ), list_utilities.quotify( v_properties ) );
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str9$_____s, form );
        }
        final SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding( thread );
        final SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding( thread );
        try
        {
          control_vars.$use_transcriptP$.bind( NIL, thread );
          api_control_vars.$use_local_queueP$.bind( NIL, thread );
          final SubLObject success = Eval.eval( form );
          if( NIL == success )
          {
            $test_status$.setDynamicValue( $kw11$FAILURE, thread );
            if( NIL != $it_verbose$.getDynamicValue( thread ) || NIL != $it_show_all_failures$.getDynamicValue( thread ) )
            {
              PrintLow.format( T, $str42$__Failure__Assertion__s_failed_, form );
            }
            if( NIL != break_on_failureP() )
            {
              Errors.sublisp_break( $str43$Failure__Assertion__s_failed_, new SubLObject[] { form
              } );
            }
          }
        }
        finally
        {
          api_control_vars.$use_local_queueP$.rebind( _prev_bind_2, thread );
          control_vars.$use_transcriptP$.rebind( _prev_bind_0, thread );
        }
        cdolist_list_var = cdolist_list_var.rest();
        expr = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 16672L)
  public static SubLObject print_assert_wff(final SubLObject expr_list, final SubLObject mt, SubLObject el_tv, SubLObject direction)
  {
    if( el_tv == UNPROVIDED )
    {
      el_tv = $kw38$DEFAULT;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      SubLObject cdolist_list_var = expr_list;
      SubLObject expr = NIL;
      expr = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject v_properties = ConsesLow.listS( $kw39$STRENGTH, el_tv, ConsesLow.append( ( NIL != direction ) ? ConsesLow.list( $kw40$DIRECTION, direction ) : NIL, NIL ) );
        final SubLObject form = ConsesLow.list( $sym44$CYC_ASSERT_WFF, list_utilities.quotify( expr ), list_utilities.quotify( mt ), list_utilities.quotify( v_properties ) );
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str9$_____s, form );
        }
        final SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding( thread );
        final SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding( thread );
        try
        {
          control_vars.$use_transcriptP$.bind( NIL, thread );
          api_control_vars.$use_local_queueP$.bind( NIL, thread );
          final SubLObject success = Eval.eval( form );
          if( NIL == success )
          {
            $test_status$.setDynamicValue( $kw11$FAILURE, thread );
            if( NIL != $it_verbose$.getDynamicValue( thread ) || NIL != $it_show_all_failures$.getDynamicValue( thread ) )
            {
              PrintLow.format( T, $str42$__Failure__Assertion__s_failed_, form );
            }
            if( NIL != break_on_failureP() )
            {
              Errors.sublisp_break( $str43$Failure__Assertion__s_failed_, new SubLObject[] { form
              } );
            }
          }
        }
        finally
        {
          api_control_vars.$use_local_queueP$.rebind( _prev_bind_2, thread );
          control_vars.$use_transcriptP$.rebind( _prev_bind_0, thread );
        }
        cdolist_list_var = cdolist_list_var.rest();
        expr = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 17565L)
  public static SubLObject print_assert_with_time(final SubLObject forms, final SubLObject mt, SubLObject strength, SubLObject direction)
  {
    if( strength == UNPROVIDED )
    {
      strength = $kw38$DEFAULT;
    }
    if( direction == UNPROVIDED )
    {
      direction = $kw45$FORWARD;
    }
    SubLObject assert_time = ZERO_INTEGER;
    SubLObject result = NIL;
    final SubLObject time_var = Time.get_internal_real_time();
    final SubLObject kb_object_count_list_1 = kb_utilities.kb_object_count_list();
    result = print_assert( forms, mt, strength, direction );
    final SubLObject kb_object_count_list_2 = kb_utilities.kb_object_count_list();
    final SubLObject new_constant_count = kb_utilities.kb_object_count_lists_new_constant_count( kb_object_count_list_2, kb_object_count_list_1 );
    final SubLObject new_nart_count = kb_utilities.kb_object_count_lists_new_nart_count( kb_object_count_list_2, kb_object_count_list_1 );
    final SubLObject new_assertion_count = kb_utilities.kb_object_count_lists_new_assertion_count( kb_object_count_list_2, kb_object_count_list_1 );
    final SubLObject new_kb_hl_support_count = kb_utilities.kb_object_count_lists_new_kb_hl_support_count( kb_object_count_list_2, kb_object_count_list_1 );
    final SubLObject new_deduction_count = kb_utilities.kb_object_count_lists_new_deduction_count( kb_object_count_list_2, kb_object_count_list_1 );
    if( NIL != subl_promotions.non_zero_integer_p( new_constant_count ) || NIL != subl_promotions.non_zero_integer_p( new_nart_count ) || NIL != subl_promotions.non_zero_integer_p( new_assertion_count )
        || NIL != subl_promotions.non_zero_integer_p( new_kb_hl_support_count ) || NIL != subl_promotions.non_zero_integer_p( new_deduction_count ) )
    {
      if( NIL.isString() )
      {
        PrintLow.format( T, $str47$___A__, NIL );
      }
      if( NIL != subl_promotions.non_zero_integer_p( new_constant_count ) )
      {
        PrintLow.format( T, $str48$___s_constant_A__A__, new SubLObject[] { Numbers.abs( new_constant_count ), Numbers.abs( new_constant_count ).numG( ONE_INTEGER ) ? $str49$s_were : $str50$_was, ( NIL != subl_promotions
            .positive_integer_p( new_constant_count ) ) ? $str51$created : $str52$destroyed
        } );
      }
      if( NIL != subl_promotions.non_zero_integer_p( new_nart_count ) )
      {
        PrintLow.format( T, $str53$___s_nart_A__A__, new SubLObject[] { Numbers.abs( new_nart_count ), Numbers.abs( new_nart_count ).numG( ONE_INTEGER ) ? $str49$s_were : $str50$_was, ( NIL != subl_promotions
            .positive_integer_p( new_nart_count ) ) ? $str51$created : $str52$destroyed
        } );
      }
      if( NIL != subl_promotions.non_zero_integer_p( new_assertion_count ) )
      {
        PrintLow.format( T, $str54$___s_assertion_A__A__, new SubLObject[] { Numbers.abs( new_assertion_count ), Numbers.abs( new_assertion_count ).numG( ONE_INTEGER ) ? $str49$s_were : $str50$_was,
          ( NIL != subl_promotions.positive_integer_p( new_assertion_count ) ) ? $str51$created : $str52$destroyed
        } );
      }
      if( NIL != subl_promotions.non_zero_integer_p( new_kb_hl_support_count ) )
      {
        PrintLow.format( T, $str55$___s_kb_hl_support_A__A__, new SubLObject[] { Numbers.abs( new_kb_hl_support_count ), Numbers.abs( new_kb_hl_support_count ).numG( ONE_INTEGER ) ? $str49$s_were : $str50$_was,
          ( NIL != subl_promotions.positive_integer_p( new_kb_hl_support_count ) ) ? $str51$created : $str52$destroyed
        } );
      }
      if( NIL != subl_promotions.non_zero_integer_p( new_deduction_count ) )
      {
        PrintLow.format( T, $str56$___s_deduction_A__A__, new SubLObject[] { Numbers.abs( new_deduction_count ), Numbers.abs( new_deduction_count ).numG( ONE_INTEGER ) ? $str49$s_were : $str50$_was,
          ( NIL != subl_promotions.positive_integer_p( new_deduction_count ) ) ? $str51$created : $str52$destroyed
        } );
      }
    }
    else if( NIL.isString() )
    {
      PrintLow.format( T, $str47$___A__, NIL );
    }
    streams_high.force_output( T );
    assert_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
    PrintLow.format( T, $str57$__Assert_time____A, assert_time );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 17890L)
  public static SubLObject print_unassert(final SubLObject expr_list, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      SubLObject cdolist_list_var = expr_list;
      SubLObject expr = NIL;
      expr = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject form = ConsesLow.list( $sym58$FI_UNASSERT_INT, list_utilities.quotify( expr ), list_utilities.quotify( mt ) );
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str9$_____s, form );
        }
        Eval.eval( form );
        cdolist_list_var = cdolist_list_var.rest();
        expr = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 18247L)
  public static SubLObject print_blast(final SubLObject expr_list, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      SubLObject cdolist_list_var = expr_list;
      SubLObject expr = NIL;
      expr = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject form = ConsesLow.list( $sym59$FI_BLAST_INT, list_utilities.quotify( expr ), list_utilities.quotify( mt ) );
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str9$_____s, form );
        }
        Eval.eval( form );
        cdolist_list_var = cdolist_list_var.rest();
        expr = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 18591L)
  public static SubLObject print_justify(final SubLObject expr, final SubLObject mt, SubLObject fullP)
  {
    if( fullP == UNPROVIDED )
    {
      fullP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      final SubLObject form = ConsesLow.list( $sym60$FI_JUSTIFY_INT, list_utilities.quotify( expr ), list_utilities.quotify( mt ), fullP );
      if( NIL != $it_verbose$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str9$_____s, form );
        PrintLow.format( T, $str61$__Justification_____s, Eval.eval( form ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 18893L)
  public static SubLObject print_kill(final SubLObject term_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = term_list;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != forts.valid_fortP( v_term ) )
      {
        if( NIL != $it_verbose$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str9$_____s, ConsesLow.list( $sym62$FI_KILL_INT, v_term ) );
        }
        final SubLObject name = kb_paths.fort_name( v_term );
        fi.fi_kill_int( v_term );
        if( NIL == fi.fi_find_int( name ) )
        {
          $test_constants_created$.setDynamicValue( Sequences.delete( name, $test_constants_created$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ),
              thread );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 19298L)
  public static SubLObject print_create(final SubLObject name, SubLObject var_name)
  {
    if( var_name == UNPROVIDED )
    {
      var_name = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject unique_name = NIL;
    SubLObject form = NIL;
    SubLObject v_new = NIL;
    SubLObject unique = NIL;
    unique_name = constant_completion_high.uniquify_constant_name( name, UNPROVIDED );
    form = ConsesLow.list( $sym63$FI_FIND_OR_CREATE_INT, unique_name );
    if( NIL == fi.fi_find_int( unique_name ) )
    {
      unique = T;
      v_new = Eval.eval( form );
    }
    if( NIL == unique )
    {
      $test_status$.setDynamicValue( $kw11$FAILURE, thread );
      if( NIL != $it_verbose$.getDynamicValue( thread ) || NIL != $it_show_all_failures$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str64$__Failure__Did_not_find_unique_na, name );
      }
      if( NIL != break_on_failureP() )
      {
        Errors.sublisp_break( $str65$Failure__Create_constant__s_faile, new SubLObject[] { unique_name
        } );
      }
    }
    else if( NIL != v_new )
    {
      if( NIL != $it_verbose$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str9$_____s, form );
      }
      final SubLObject item_var = unique_name;
      if( NIL == conses_high.member( item_var, $test_constants_created$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        $test_constants_created$.setDynamicValue( ConsesLow.cons( item_var, $test_constants_created$.getDynamicValue( thread ) ), thread );
      }
      return v_new;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 20483L)
  public static SubLObject print_tms_formula(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      if( NIL != $it_verbose$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str9$_____s, ConsesLow.list( $sym66$FI_TMS_RECONSIDER_FORMULA_INT, list_utilities.quotify( formula ), list_utilities.quotify( mt ) ) );
      }
      fi.fi_tms_reconsider_formula_int( formula, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 20764L)
  public static SubLObject print_tms_mt(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) || NIL != $debug_continue$.getDynamicValue( thread ) )
    {
      if( NIL != $it_verbose$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str9$_____s, ConsesLow.list( $sym67$FI_TMS_RECONSIDER_MT_INT, list_utilities.quotify( mt ) ) );
      }
      fi.fi_tms_reconsider_mt_int( mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 20995L)
  public static SubLObject update_test_results(final SubLObject test_keyword)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $test_status$.getDynamicValue( thread ).equal( $kw6$UNKNOWN ) )
    {
      $test_status$.setDynamicValue( $kw68$SUCCESS, thread );
    }
    final SubLObject pair = ConsesLow.list( test_keyword, $test_direction$.getDynamicValue( thread ) );
    if( NIL != Sequences.find( pair, $test_results$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym69$CAR ), UNPROVIDED, UNPROVIDED ) )
    {
      $test_results$.setDynamicValue( ConsesLow.cons( ConsesLow.cons( pair, $test_status$.getDynamicValue( thread ) ), Sequences.remove( pair, $test_results$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ),
          Symbols.symbol_function( $sym69$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), thread );
    }
    else
    {
      $test_results$.setDynamicValue( ConsesLow.cons( ConsesLow.cons( pair, $test_status$.getDynamicValue( thread ) ), $test_results$.getDynamicValue( thread ) ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 21393L)
  public static SubLObject kill_test_constants_created()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $clean_up_test_constantsP$.getDynamicValue( thread ) )
    {
      SubLObject cdolist_list_var = $test_constants_created$.getDynamicValue( thread );
      SubLObject name = NIL;
      name = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject constant = fi.fi_find_int( name );
        if( NIL != constant )
        {
          print_kill( ConsesLow.list( constant ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        name = cdolist_list_var.first();
      }
      $test_constants_created$.setDynamicValue( NIL, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 21693L)
  public static SubLObject run_test(final SubLObject test_keyword, SubLObject progress_blipP, SubLObject verboseP, SubLObject testing_direction, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
  {
    final SubLObject backchain_provided_p = makeBoolean( backchain != UNPROVIDED );
    if( progress_blipP == UNPROVIDED )
    {
      progress_blipP = T;
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( testing_direction == UNPROVIDED )
    {
      testing_direction = $kw3$BACKWARD;
    }
    if( backchain == UNPROVIDED )
    {
      backchain = T;
    }
    if( number == UNPROVIDED )
    {
      number = ONE_INTEGER;
    }
    if( time == UNPROVIDED )
    {
      time = TEN_INTEGER;
    }
    if( depth == UNPROVIDED )
    {
      depth = TWENTY_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( operation_communication.communication_mode() == $kw70$TRANSMIT_AND_RECEIVE )
    {
      operation_communication.set_communication_mode( $kw71$DEAF );
    }
    if( testing_direction == $kw45$FORWARD && NIL == backchain_provided_p )
    {
      backchain = NIL;
    }
    final SubLObject form = inference_test_form( test_keyword );
    SubLObject test_run = NIL;
    final SubLObject _prev_bind_0 = $test_constants_created$.currentBinding( thread );
    try
    {
      $test_constants_created$.bind( NIL, thread );
      if( form.isCons() )
      {
        final SubLObject kb_object_count_list_1 = kb_utilities.kb_object_count_list();
        try
        {
          final SubLObject _prev_bind_0_$4 = $current_test$.currentBinding( thread );
          final SubLObject _prev_bind_2 = $test_status$.currentBinding( thread );
          final SubLObject _prev_bind_3 = $elapsed_time$.currentBinding( thread );
          final SubLObject _prev_bind_4 = $it_backchain$.currentBinding( thread );
          final SubLObject _prev_bind_5 = $it_number$.currentBinding( thread );
          final SubLObject _prev_bind_6 = $it_time$.currentBinding( thread );
          final SubLObject _prev_bind_7 = $it_depth$.currentBinding( thread );
          final SubLObject _prev_bind_8 = $it_verbose$.currentBinding( thread );
          final SubLObject _prev_bind_9 = $test_direction$.currentBinding( thread );
          try
          {
            $current_test$.bind( test_keyword, thread );
            $test_status$.bind( $kw6$UNKNOWN, thread );
            $elapsed_time$.bind( NIL, thread );
            $it_backchain$.bind( backchain, thread );
            $it_number$.bind( number, thread );
            $it_time$.bind( time, thread );
            $it_depth$.bind( depth, thread );
            $it_verbose$.bind( verboseP, thread );
            $test_direction$.bind( testing_direction, thread );
            if( NIL != progress_blipP )
            {
              final SubLObject pcase_var = cyc_testing.$it_output_format$.getDynamicValue( thread );
              if( pcase_var.eql( $kw72$STANDARD ) )
              {
                PrintLow.format( T, $str73$___IT___S__S_, test_keyword, $test_direction$.getDynamicValue( thread ) );
                streams_high.force_output( UNPROVIDED );
              }
              else if( pcase_var.eql( $kw74$POST_BUILD ) && NIL != verboseP )
              {
                format_nil.force_format( T, $str75$_____Starting__IT___S__S__at__A__, test_keyword, $test_direction$.getDynamicValue( thread ), numeric_date_utilities.timestring_ms( UNPROVIDED, UNPROVIDED ), UNPROVIDED,
                    UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
            }
            SubLObject time_$5 = NIL;
            final SubLObject time_var = Time.get_internal_real_time();
            SubLObject cdolist_list_var = form;
            SubLObject expr = NIL;
            expr = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              eval_in_api.cyc_api_eval( expr );
              cdolist_list_var = cdolist_list_var.rest();
              expr = cdolist_list_var.first();
            }
            time_$5 = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
            final SubLObject name = ConsesLow.list( test_keyword, testing_direction );
            test_run = cyc_testing.new_cyc_test_run( $kw76$IT, name, $test_status$.getDynamicValue( thread ), time_$5 );
            if( NIL != progress_blipP )
            {
              final SubLObject result = conses_high.assoc( ConsesLow.list( test_keyword, $test_direction$.getDynamicValue( thread ) ), $test_results$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ),
                  UNPROVIDED ).rest();
              final SubLObject pcase_var2 = cyc_testing.$it_output_format$.getDynamicValue( thread );
              if( pcase_var2.eql( $kw72$STANDARD ) )
              {
                PrintLow.format( T, $str77$_____s____3f_, result, time_$5 );
              }
              else if( pcase_var2.eql( $kw74$POST_BUILD ) )
              {
                cyc_testing.print_post_build_test_summary( T, result, $kw76$IT, ConsesLow.list( test_keyword, testing_direction ), time_$5, inference_test_owner( test_keyword ) );
              }
            }
          }
          finally
          {
            $test_direction$.rebind( _prev_bind_9, thread );
            $it_verbose$.rebind( _prev_bind_8, thread );
            $it_depth$.rebind( _prev_bind_7, thread );
            $it_time$.rebind( _prev_bind_6, thread );
            $it_number$.rebind( _prev_bind_5, thread );
            $it_backchain$.rebind( _prev_bind_4, thread );
            $elapsed_time$.rebind( _prev_bind_3, thread );
            $test_status$.rebind( _prev_bind_2, thread );
            $current_test$.rebind( _prev_bind_0_$4, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            kill_test_constants_created();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
          }
        }
        final SubLObject kb_object_count_list_2 = kb_utilities.kb_object_count_list();
        final SubLObject new_constant_count = kb_utilities.kb_object_count_lists_new_constant_count( kb_object_count_list_2, kb_object_count_list_1 );
        final SubLObject new_nart_count = kb_utilities.kb_object_count_lists_new_nart_count( kb_object_count_list_2, kb_object_count_list_1 );
        final SubLObject new_assertion_count = kb_utilities.kb_object_count_lists_new_assertion_count( kb_object_count_list_2, kb_object_count_list_1 );
        final SubLObject new_kb_hl_support_count = kb_utilities.kb_object_count_lists_new_kb_hl_support_count( kb_object_count_list_2, kb_object_count_list_1 );
        final SubLObject new_deduction_count = kb_utilities.kb_object_count_lists_new_deduction_count( kb_object_count_list_2, kb_object_count_list_1 );
        if( ( ( NIL != verboseP ) ? $kw78$VERBOSE : $kw46$SILENT ) != $kw46$SILENT )
        {
          if( NIL != subl_promotions.non_zero_integer_p( new_constant_count ) || NIL != subl_promotions.non_zero_integer_p( new_nart_count ) || NIL != subl_promotions.non_zero_integer_p( new_assertion_count )
              || NIL != subl_promotions.non_zero_integer_p( new_kb_hl_support_count ) || NIL != subl_promotions.non_zero_integer_p( new_deduction_count ) )
          {
            if( Sequences.cconcatenate( $str79$Warning__Test__, new SubLObject[] { format_nil.format_nil_s_no_copy( test_keyword ), $str80$_, format_nil.format_nil_s_no_copy( testing_direction ), $str81$__changed_the_KB_
            } ).isString() )
            {
              PrintLow.format( T, $str47$___A__, Sequences.cconcatenate( $str79$Warning__Test__, new SubLObject[] { format_nil.format_nil_s_no_copy( test_keyword ), $str80$_, format_nil.format_nil_s_no_copy(
                  testing_direction ), $str81$__changed_the_KB_
              } ) );
            }
            if( NIL != subl_promotions.non_zero_integer_p( new_constant_count ) )
            {
              PrintLow.format( T, $str48$___s_constant_A__A__, new SubLObject[] { Numbers.abs( new_constant_count ), Numbers.abs( new_constant_count ).numG( ONE_INTEGER ) ? $str49$s_were : $str50$_was,
                ( NIL != subl_promotions.positive_integer_p( new_constant_count ) ) ? $str51$created : $str52$destroyed
              } );
            }
            if( NIL != subl_promotions.non_zero_integer_p( new_nart_count ) )
            {
              PrintLow.format( T, $str53$___s_nart_A__A__, new SubLObject[] { Numbers.abs( new_nart_count ), Numbers.abs( new_nart_count ).numG( ONE_INTEGER ) ? $str49$s_were : $str50$_was, ( NIL != subl_promotions
                  .positive_integer_p( new_nart_count ) ) ? $str51$created : $str52$destroyed
              } );
            }
            if( NIL != subl_promotions.non_zero_integer_p( new_assertion_count ) )
            {
              PrintLow.format( T, $str54$___s_assertion_A__A__, new SubLObject[] { Numbers.abs( new_assertion_count ), Numbers.abs( new_assertion_count ).numG( ONE_INTEGER ) ? $str49$s_were : $str50$_was,
                ( NIL != subl_promotions.positive_integer_p( new_assertion_count ) ) ? $str51$created : $str52$destroyed
              } );
            }
            if( NIL != subl_promotions.non_zero_integer_p( new_kb_hl_support_count ) )
            {
              PrintLow.format( T, $str55$___s_kb_hl_support_A__A__, new SubLObject[] { Numbers.abs( new_kb_hl_support_count ), Numbers.abs( new_kb_hl_support_count ).numG( ONE_INTEGER ) ? $str49$s_were : $str50$_was,
                ( NIL != subl_promotions.positive_integer_p( new_kb_hl_support_count ) ) ? $str51$created : $str52$destroyed
              } );
            }
            if( NIL != subl_promotions.non_zero_integer_p( new_deduction_count ) )
            {
              PrintLow.format( T, $str56$___s_deduction_A__A__, new SubLObject[] { Numbers.abs( new_deduction_count ), Numbers.abs( new_deduction_count ).numG( ONE_INTEGER ) ? $str49$s_were : $str50$_was,
                ( NIL != subl_promotions.positive_integer_p( new_deduction_count ) ) ? $str51$created : $str52$destroyed
              } );
            }
          }
          else if( NIL.isString() )
          {
            PrintLow.format( T, $str47$___A__, NIL );
          }
        }
        streams_high.force_output( T );
      }
      else
      {
        PrintLow.format( T, $str82$__There_is_no_test_in__s_associat, $sym83$_INFERENCE_TESTS_, test_keyword );
        if( NIL == $inference_tests$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str84$__In_fact__there_are_no_tests_in_, $sym83$_INFERENCE_TESTS_ );
        }
      }
    }
    finally
    {
      $test_constants_created$.rebind( _prev_bind_0, thread );
    }
    return test_run;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 24192L)
  public static SubLObject do_tests(SubLObject keyword_list, SubLObject progress_blipP, SubLObject verboseP, SubLObject load_testsP, SubLObject return_test_runsP, SubLObject testing_direction, SubLObject backchain,
      SubLObject number, SubLObject time, SubLObject depth)
  {
    if( keyword_list == UNPROVIDED )
    {
      keyword_list = defined_inference_tests( UNPROVIDED );
    }
    if( progress_blipP == UNPROVIDED )
    {
      progress_blipP = T;
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( load_testsP == UNPROVIDED )
    {
      load_testsP = NIL;
    }
    if( return_test_runsP == UNPROVIDED )
    {
      return_test_runsP = NIL;
    }
    if( testing_direction == UNPROVIDED )
    {
      testing_direction = $kw3$BACKWARD;
    }
    if( backchain == UNPROVIDED )
    {
      backchain = T;
    }
    if( number == UNPROVIDED )
    {
      number = ONE_INTEGER;
    }
    if( time == UNPROVIDED )
    {
      time = TEN_INTEGER;
    }
    if( depth == UNPROVIDED )
    {
      depth = TWENTY_INTEGER;
    }
    if( keyword_list.isCons() )
    {
      SubLObject test_runs = NIL;
      SubLObject cdolist_list_var = keyword_list;
      SubLObject keyword = NIL;
      keyword = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject test_run = run_test( keyword, progress_blipP, verboseP, testing_direction, backchain, number, time, depth );
        test_runs = ConsesLow.cons( test_run, test_runs );
        cdolist_list_var = cdolist_list_var.rest();
        keyword = cdolist_list_var.first();
      }
      print_test_results( UNPROVIDED );
      final SubLObject overall_result = cyc_testing.cyc_test_runs_overall_result( test_runs );
      return Values.values( overall_result, ( NIL != return_test_runsP ) ? test_runs : NIL );
    }
    if( NIL == load_testsP )
    {
      return NIL;
    }
    final SubLObject try2 = defined_inference_tests( T );
    if( NIL != try2 )
    {
      return do_tests( try2, progress_blipP, verboseP, NIL, testing_direction, backchain, number, time, depth, UNPROVIDED );
    }
    PrintLow.format( T, $str85$__The__s_argument_is__s__which_is, $sym86$KEYWORD_LIST, keyword_list );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 25376L)
  public static SubLObject sorted_test_results(SubLObject results)
  {
    if( results == UNPROVIDED )
    {
      results = $test_results$.getDynamicValue();
    }
    results = Sort.sort( conses_high.copy_list( results ), Symbols.symbol_function( $sym87$TERM__ ), Symbols.symbol_function( $sym69$CAR ) );
    results = Sort.stable_sort( results, Symbols.symbol_function( $sym87$TERM__ ), Symbols.symbol_function( $sym88$CDR ) );
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 25690L)
  public static SubLObject print_test_results(SubLObject output_format)
  {
    if( output_format == UNPROVIDED )
    {
      output_format = cyc_testing.$it_output_format$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $kw46$SILENT != output_format )
    {
      final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
      try
      {
        print_high.$print_pretty$.bind( NIL, thread );
        PrintLow.format( T, $str89$__ );
        SubLObject separator = NIL;
        final SubLObject pcase_var = output_format;
        if( pcase_var.eql( $kw72$STANDARD ) )
        {
          separator = $str90$__;
        }
        else if( pcase_var.eql( $kw74$POST_BUILD ) )
        {
          separator = $str91$_IT;
        }
        else
        {
          Errors.error( $str92$Unknown_output_format__A, output_format );
        }
        SubLObject cdolist_list_var = sorted_test_results( UNPROVIDED );
        SubLObject x = NIL;
        x = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( output_format == $kw74$POST_BUILD )
          {
            cyc_testing.print_post_build_test_summary( T, x.rest(), separator, x.first(), NIL, inference_test_owner( conses_high.caar( x ) ) );
          }
          else
          {
            PrintLow.format( T, $str93$___s__a__s, new SubLObject[] { x.rest(), separator, x.first()
            } );
          }
          cdolist_list_var = cdolist_list_var.rest();
          x = cdolist_list_var.first();
        }
        PrintLow.format( T, $str89$__ );
      }
      finally
      {
        print_high.$print_pretty$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 26335L)
  public static SubLObject print_failing_tests()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      PrintLow.format( T, $str89$__ );
      SubLObject cdolist_list_var = sorted_test_results( UNPROVIDED );
      SubLObject x = NIL;
      x = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( x.rest().equal( $kw11$FAILURE ) )
        {
          PrintLow.format( T, $str94$___s_____s, x.rest(), x.first() );
        }
        cdolist_list_var = cdolist_list_var.rest();
        x = cdolist_list_var.first();
      }
      PrintLow.format( T, $str89$__ );
    }
    finally
    {
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 26572L)
  public static SubLObject parameterized_test_value(final SubLObject assoc_list, SubLObject parameter, SubLObject function_symbol, SubLObject fn_arg_list)
  {
    if( parameter == UNPROVIDED )
    {
      parameter = NIL;
    }
    if( function_symbol == UNPROVIDED )
    {
      function_symbol = NIL;
    }
    if( fn_arg_list == UNPROVIDED )
    {
      fn_arg_list = NIL;
    }
    if( NIL != parameter )
    {
      if( NIL != Symbols.boundp( parameter ) )
      {
        return conses_high.assoc( Symbols.symbol_value( parameter ), conses_high.assoc( parameter, assoc_list, UNPROVIDED, UNPROVIDED ).rest(), UNPROVIDED, UNPROVIDED ).rest();
      }
      return NIL;
    }
    else
    {
      if( NIL == function_symbol )
      {
        return NIL;
      }
      if( NIL != Symbols.fboundp( function_symbol ) )
      {
        return conses_high.assoc( Functions.apply( function_symbol, fn_arg_list ), conses_high.assoc( function_symbol, assoc_list, UNPROVIDED, UNPROVIDED ).rest(), UNPROVIDED, UNPROVIDED ).rest();
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 27892L)
  public static SubLObject print_failing_form(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
    form = current.first();
    current = current.rest();
    final SubLObject keyword = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list95 );
    current = current.rest();
    final SubLObject keyword_test = current.isCons() ? current.first() : $list96;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list95 );
    current = current.rest();
    final SubLObject message = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list95 );
    current = current.rest();
    final SubLObject message_list = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list95 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym97$PIF, ConsesLow.list( $sym98$CAND, $sym99$_EVALUATE_PREVIOUSLY_FAILING_TESTS_, ConsesLow.list( $sym100$COR, ConsesLow.list( $sym101$NULL, keyword ), $sym102$_CHECK_ALL_IT_BUG_TYPES_,
          ConsesLow.list( $sym103$MEMBER, keyword, $sym104$_KNOWN_BUG_TYPES_TO_CHECK_, keyword_test ) ) ), ConsesLow.list( $sym105$PROGN, ConsesLow.list( $sym97$PIF, $sym106$_IT_FAILING_VERBOSE_, ConsesLow.list(
              $sym107$CLET, $list108, ConsesLow.list( $sym109$FORMAT, T, $str110$__The_previously_failing_test____, ConsesLow.list( $sym111$QUOTE, form ), keyword ), form, ConsesLow.list( $sym112$PWHEN, message,
                  ConsesLow.list( $sym113$APPLY, $list114, T, message, message_list ) ) ), form ) ), ConsesLow.list( $sym112$PWHEN, $sym106$_IT_FAILING_VERBOSE_, ConsesLow.list( $sym97$PIF, ConsesLow.list( $sym115$CNOT,
                      ConsesLow.list( $sym101$NULL, keyword ) ), ConsesLow.list( $sym109$FORMAT, T, $str116$__This_previously_failing_test___, ConsesLow.list( $sym111$QUOTE, form ), keyword ), ConsesLow.list(
                          $sym109$FORMAT, T, $str117$__This_previously_failing_test___, ConsesLow.list( $sym111$QUOTE, form ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list95 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 29624L)
  public static SubLObject failing_it_form_identifier(final SubLObject bug_type, SubLObject other_identifiers)
  {
    if( other_identifiers == UNPROVIDED )
    {
      other_identifiers = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ConsesLow.nconc( ConsesLow.list( $current_test$.getDynamicValue( thread ), bug_type ), other_identifiers );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 29860L)
  public static SubLObject herald_start()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $it_verbose$.getDynamicValue( thread ) )
    {
      PrintLow.format( T, $str118$__Starting__a____, $current_test$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 29973L)
  public static SubLObject def_inference_test(final SubLObject test_keyword, final SubLObject quoted_test_body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != subl_promotions.memberP( test_keyword, $inference_tests$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym69$CAR ) ) )
    {
      $inference_tests$.setDynamicValue( ConsesLow.cons( ConsesLow.list( test_keyword, quoted_test_body ), Sequences.remove( test_keyword, $inference_tests$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ),
          Symbols.symbol_function( $sym69$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), thread );
    }
    else
    {
      $inference_tests$.setDynamicValue( ConsesLow.cons( ConsesLow.list( test_keyword, quoted_test_body ), $inference_tests$.getDynamicValue( thread ) ), thread );
    }
    return test_keyword;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 30503L)
  public static SubLObject inference_test_p(final SubLObject keyword)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != conses_high.assoc( keyword, $inference_tests$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 30614L)
  public static SubLObject inference_test_form(final SubLObject keyword)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.second( conses_high.assoc( keyword, $inference_tests$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 30715L)
  public static SubLObject inference_test_mentions_invalid_constantP(final SubLObject it)
  {
    return list_utilities.tree_find_if( $sym121$INVALID_CONSTANT_, inference_test_form( it ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 30849L)
  public static SubLObject inference_test_invalid_constants(final SubLObject it)
  {
    return cycl_utilities.expression_gather( inference_test_form( it ), $sym121$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 30979L)
  public static SubLObject inference_test_names()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Mapping.mapcar( Symbols.symbol_function( $sym122$FIRST ), $inference_tests$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 31066L)
  public static SubLObject obj_Gstring(final SubLObject obj)
  {
    if( obj.isString() )
    {
      return obj;
    }
    return PrintLow.format( NIL, $str123$_s, obj );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 31168L)
  public static SubLObject defined_inference_tests(SubLObject forceP)
  {
    if( forceP == UNPROVIDED )
    {
      forceP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forceP )
    {
      final SubLObject pathname = construct_cyc_test_filename( UNPROVIDED, UNPROVIDED );
      if( pathname.isString() && NIL != Filesys.probe_file( pathname ) )
      {
        Eval.load( pathname );
      }
      else
      {
        PrintLow.format( T, $str124$_s_is_not_an_accessible_pathname_, pathname );
      }
    }
    final SubLObject keywords = Mapping.mapcar( Symbols.symbol_function( $sym69$CAR ), $inference_tests$.getDynamicValue( thread ) );
    if( NIL != keywords )
    {
      return Sort.sort( conses_high.copy_list( keywords ), Symbols.symbol_function( $sym125$STRING_ ), Symbols.symbol_function( $sym126$OBJ__STRING ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 31584L)
  public static SubLObject load_inference_tests(SubLObject pathname_string)
  {
    if( pathname_string == UNPROVIDED )
    {
      pathname_string = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pathname = pathname_string.isString() ? pathname_string : construct_cyc_test_filename( UNPROVIDED, UNPROVIDED );
    if( pathname.isString() && NIL != Filesys.probe_file( pathname ) )
    {
      thread.resetMultipleValues();
      final SubLObject success = file_utilities.load_file_catching_error( pathname );
      final SubLObject error = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != error )
      {
        PrintLow.format( T, $str127$___ERROR__LOADING__A__S, pathname_string, error );
      }
      return success;
    }
    PrintLow.format( T, $str128$___s_is_bound_to__s__which_is_not, $sym129$PATHNAME, pathname );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 32131L)
  public static SubLObject clear_inference_tests()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $inference_tests$.setDynamicValue( NIL, thread );
    return $inference_tests$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 32228L)
  public static SubLObject clear_inference_test_results()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $test_results$.setDynamicValue( NIL, thread );
    return $test_results$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 32322L)
  public static SubLObject do_all_tests(SubLObject progress_blipP, SubLObject verboseP, SubLObject output_format, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject load_testsP, SubLObject return_test_runsP)
  {
    if( progress_blipP == UNPROVIDED )
    {
      progress_blipP = NIL;
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( output_format == UNPROVIDED )
    {
      output_format = cyc_testing.$it_output_format$.getDynamicValue();
    }
    if( run_tiny_kb_tests_in_full_kbP == UNPROVIDED )
    {
      run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
    }
    if( load_testsP == UNPROVIDED )
    {
      load_testsP = T;
    }
    if( return_test_runsP == UNPROVIDED )
    {
      return_test_runsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject test_runs = NIL;
    final SubLObject _prev_bind_0 = cyc_testing.$it_output_format$.currentBinding( thread );
    final SubLObject _prev_bind_2 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding( thread );
    try
    {
      cyc_testing.$it_output_format$.bind( output_format, thread );
      cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind( run_tiny_kb_tests_in_full_kbP, thread );
      clear_inference_test_results();
      thread.resetMultipleValues();
      final SubLObject backward_overall_result = do_tests_backward( progress_blipP, verboseP, load_testsP, T );
      final SubLObject backward_test_runs = thread.secondMultipleValue();
      thread.resetMultipleValues();
      test_runs = ConsesLow.nconc( test_runs, backward_test_runs );
      clear_inference_test_results();
      thread.resetMultipleValues();
      final SubLObject forward_overall_result = do_tests_forward( progress_blipP, verboseP, load_testsP, T );
      final SubLObject forward_test_runs = thread.secondMultipleValue();
      thread.resetMultipleValues();
      test_runs = ConsesLow.nconc( test_runs, forward_test_runs );
    }
    finally
    {
      cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind( _prev_bind_2, thread );
      cyc_testing.$it_output_format$.rebind( _prev_bind_0, thread );
    }
    final SubLObject overall_result = cyc_testing.cyc_test_runs_overall_result( test_runs );
    return Values.values( overall_result, ( NIL != return_test_runsP ) ? test_runs : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 33648L)
  public static SubLObject do_tests_backward(SubLObject progress_blipP, SubLObject verboseP, SubLObject load_testsP, SubLObject return_test_runsP)
  {
    if( progress_blipP == UNPROVIDED )
    {
      progress_blipP = NIL;
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( load_testsP == UNPROVIDED )
    {
      load_testsP = NIL;
    }
    if( return_test_runsP == UNPROVIDED )
    {
      return_test_runsP = NIL;
    }
    return do_tests( defined_inference_tests( UNPROVIDED ), progress_blipP, verboseP, load_testsP, return_test_runsP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 34163L)
  public static SubLObject do_tests_forward(SubLObject progress_blipP, SubLObject verboseP, SubLObject load_testsP, SubLObject return_test_runsP)
  {
    if( progress_blipP == UNPROVIDED )
    {
      progress_blipP = NIL;
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( load_testsP == UNPROVIDED )
    {
      load_testsP = NIL;
    }
    if( return_test_runsP == UNPROVIDED )
    {
      return_test_runsP = NIL;
    }
    return do_tests( defined_inference_tests( UNPROVIDED ), progress_blipP, verboseP, load_testsP, return_test_runsP, $kw45$FORWARD, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 34765L)
  public static SubLObject with_test_constants(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject specialP = NIL;
    SubLObject var_specs = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list130 );
    specialP = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list130 );
    var_specs = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject vars = list_utilities.flatten( Mapping.mapcar( Symbols.symbol_function( $sym131$VAR_SPEC_VAR ), var_specs ) );
    final SubLObject test_constants = $sym132$TEST_CONSTANTS;
    return ConsesLow.list( $sym107$CLET, reader.bq_cons( test_constants, ConsesLow.append( vars, NIL ) ), ConsesLow.list( $sym133$CUNWIND_PROTECT, reader.bq_cons( $sym105$PROGN, ConsesLow.append( Mapping.mapcan( Symbols
        .symbol_function( $sym134$PRINT_CREATE_VAR_SPEC_CONSTANT ), var_specs, EMPTY_SUBL_OBJECT_ARRAY ), ConsesLow.listS( ConsesLow.list( $sym135$CSETQ, test_constants, reader.bq_cons( $sym136$LIST, ConsesLow.append(
            vars, NIL ) ) ), ConsesLow.listS( $sym137$PRINT_ASSERT, reader.bq_cons( $sym136$LIST, ConsesLow.append( Mapping.mapcan( Symbols.symbol_function( $sym138$VAR_SPEC_DEF ), var_specs, EMPTY_SUBL_OBJECT_ARRAY ),
                NIL ) ), $list139 ), ConsesLow.append( body, NIL ) ) ) ), ConsesLow.list( $sym105$PROGN, $list140, ConsesLow.list( $sym112$PWHEN, $sym141$_CLEAN_UP_TEST_CONSTANTS__, ConsesLow.list( $sym142$PRINT_KILL,
                    test_constants ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 35619L)
  public static SubLObject with_test_assertions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject specialP = NIL;
    SubLObject mt = NIL;
    SubLObject truth_value = NIL;
    SubLObject direction = NIL;
    SubLObject var_specs = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    specialP = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    truth_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    var_specs = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject vars = Mapping.mapcar( Symbols.symbol_function( $sym131$VAR_SPEC_VAR ), var_specs );
    final SubLObject test_assertions = $sym144$TEST_ASSERTIONS;
    return ConsesLow.list( $sym107$CLET, ConsesLow.append( var_specs, ConsesLow.list( ConsesLow.list( test_assertions, reader.bq_cons( $sym136$LIST, ConsesLow.append( vars, NIL ) ) ) ) ), ConsesLow.list(
        $sym133$CUNWIND_PROTECT, ConsesLow.listS( $sym105$PROGN, ConsesLow.list( $sym137$PRINT_ASSERT, test_assertions, mt, truth_value, direction ), ConsesLow.append( body, NIL ) ), ConsesLow.list(
            $sym145$PRINT_UNASSERT, test_assertions, mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 36213L)
  public static SubLObject with_test_assertion_lists(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject specialP = NIL;
    SubLObject mt = NIL;
    SubLObject truth_value = NIL;
    SubLObject direction = NIL;
    SubLObject var_specs = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    specialP = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    truth_value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    direction = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list143 );
    var_specs = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject vars = Mapping.mapcar( Symbols.symbol_function( $sym131$VAR_SPEC_VAR ), var_specs );
    final SubLObject test_assertions = $sym146$TEST_ASSERTIONS;
    return ConsesLow.list( $sym107$CLET, ConsesLow.append( var_specs, ConsesLow.list( ConsesLow.list( test_assertions, reader.bq_cons( $sym147$APPEND, ConsesLow.append( vars, NIL ) ) ) ) ), ConsesLow.list(
        $sym133$CUNWIND_PROTECT, ConsesLow.listS( $sym105$PROGN, ConsesLow.list( $sym137$PRINT_ASSERT, test_assertions, mt, truth_value, direction ), ConsesLow.append( body, NIL ) ), ConsesLow.list(
            $sym145$PRINT_UNASSERT, test_assertions, mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 36824L)
  public static SubLObject define_subtest(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject vars = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list148 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list148 );
    vars = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject arglist = $sym149$ARGLIST;
    return ConsesLow.list( $sym150$DEFMACRO, name, ConsesLow.list( $sym151$_REST, arglist ), ConsesLow.list( $sym152$RET, ConsesLow.list( $sym153$BQ_LIST, $list154, ConsesLow.list( $sym111$QUOTE, vars ), ConsesLow.list(
        $sym155$BQ_CONS, $list156, ConsesLow.listS( $sym157$BQ_APPEND, arglist, $list158 ) ), ConsesLow.list( $sym153$BQ_LIST, $list159, $list160, ConsesLow.list( $sym153$BQ_LIST, $list161, T, $str162$___________A__S,
            ConsesLow.list( $sym111$QUOTE, ConsesLow.list( $sym111$QUOTE, name ) ), ConsesLow.list( $sym155$BQ_CONS, $list156, ConsesLow.listS( $sym157$BQ_APPEND, arglist, $list158 ) ) ) ), ConsesLow.list(
                $sym155$BQ_CONS, $list163, ConsesLow.list( $sym111$QUOTE, body ) ), ConsesLow.list( $sym153$BQ_LIST, $list159, $list160, ConsesLow.list( $sym153$BQ_LIST, $list161, T, $str164$___________A__S, ConsesLow
                    .list( $sym111$QUOTE, ConsesLow.list( $sym111$QUOTE, name ) ), ConsesLow.list( $sym155$BQ_CONS, $list156, ConsesLow.listS( $sym157$BQ_APPEND, arglist, $list158 ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 37691L)
  public static SubLObject assert_query_test(final SubLObject assertion_formulas, final SubLObject queries, SubLObject test_fun, SubLObject specialP, SubLObject mt, SubLObject truth_value, SubLObject direction)
  {
    if( test_fun == UNPROVIDED )
    {
      test_fun = Symbols.symbol_function( $sym165$B_VERIFY );
    }
    if( specialP == UNPROVIDED )
    {
      specialP = T;
    }
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( truth_value == UNPROVIDED )
    {
      truth_value = $kw38$DEFAULT;
    }
    if( direction == UNPROVIDED )
    {
      direction = $test_direction$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject test_assertions = ConsesLow.append( new SubLObject[] { assertion_formulas
    } );
    try
    {
      print_assert( test_assertions, mt, truth_value, direction );
      SubLObject cdolist_list_var = queries;
      SubLObject query = NIL;
      query = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        Functions.funcall( test_fun, query, mt, $it_backchain$.getDynamicValue( thread ), $it_number$.getDynamicValue( thread ), $it_time$.getDynamicValue( thread ), $it_depth$.getDynamicValue( thread ) );
        cdolist_list_var = cdolist_list_var.rest();
        query = cdolist_list_var.first();
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        print_unassert( test_assertions, mt );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 38157L)
  public static SubLObject define_inference_test(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject test_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list166 );
    test_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list166 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list166 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list166 );
      if( NIL == conses_high.member( current_$7, $list167, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw168$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list166 );
    }
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw40$DIRECTION, current );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : $kw3$BACKWARD;
    final SubLObject kb_tail = cdestructuring_bind.property_list_member( $kw169$KB, current );
    final SubLObject kb = ( NIL != kb_tail ) ? conses_high.cadr( kb_tail ) : NIL;
    final SubLObject owner_tail = cdestructuring_bind.property_list_member( $kw170$OWNER, current );
    final SubLObject owner = ( NIL != owner_tail ) ? conses_high.cadr( owner_tail ) : NIL;
    final SubLObject comment_tail = cdestructuring_bind.property_list_member( $kw171$COMMENT, current );
    final SubLObject comment = ( NIL != comment_tail ) ? conses_high.cadr( comment_tail ) : NIL;
    final SubLObject bug_tail = cdestructuring_bind.property_list_member( $kw172$BUG, current );
    final SubLObject bug = ( NIL != bug_tail ) ? conses_high.cadr( bug_tail ) : NIL;
    final SubLObject created_tail = cdestructuring_bind.property_list_member( $kw173$CREATED, current );
    final SubLObject created = ( NIL != created_tail ) ? conses_high.cadr( created_tail ) : NIL;
    final SubLObject creator_tail = cdestructuring_bind.property_list_member( $kw174$CREATOR, current );
    final SubLObject creator = ( NIL != creator_tail ) ? conses_high.cadr( creator_tail ) : NIL;
    final SubLObject workingP_tail = cdestructuring_bind.property_list_member( $kw175$WORKING_, current );
    final SubLObject workingP = ( NIL != workingP_tail ) ? conses_high.cadr( workingP_tail ) : T;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym105$PROGN, ConsesLow.list( $sym119$DEF_INFERENCE_TEST, test_name, ConsesLow.list( $sym111$QUOTE, ConsesLow.listS( $list176, ConsesLow.list( $sym177$PCOND, reader.bq_cons( ConsesLow.list(
        $sym115$CNOT, ConsesLow.list( $sym178$RUN_INFERENCE_TEST_, test_name ) ), $list179 ), reader.bq_cons( ConsesLow.list( $sym180$INFERENCE_TEST_MENTIONS_INVALID_CONSTANT_, test_name ), $list181 ), reader.bq_cons( T,
            ConsesLow.append( body, NIL ) ) ), $list182 ) ) ), ConsesLow.list( new SubLObject[]
            { $sym183$NEW_INFERENCE_TEST, test_name, direction, kb, owner, comment, bug, created, creator, workingP
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 39587L)
  public static SubLObject run_inference_testP(final SubLObject test_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject direction = inference_test_direction( test_name );
    if( $kw184$BOTH != direction && !direction.eql( $test_direction$.getDynamicValue( thread ) ) )
    {
      return NIL;
    }
    final SubLObject test_kb = inference_test_kb( test_name );
    if( NIL == kb_matches_expectationsP( test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue( thread ) ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 40260L)
  public static SubLObject kb_matches_expectationsP(final SubLObject expected_kb, final SubLObject expected_tiny_implies_bothP)
  {
    final SubLObject non_tiny_kbP = control_vars.non_tiny_kb_loadedP();
    final SubLObject tiny_kbP = makeBoolean( NIL == non_tiny_kbP );
    if( NIL != tiny_kbP && $kw185$FULL == expected_kb )
    {
      return NIL;
    }
    if( NIL != non_tiny_kbP && $kw186$TINY == expected_kb && NIL == expected_tiny_implies_bothP )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 40770L)
  public static SubLObject new_inference_test(final SubLObject test_name, final SubLObject direction, final SubLObject kb, final SubLObject owner, final SubLObject comment, final SubLObject bug,
      final SubLObject creation_date, final SubLObject creator, final SubLObject workingP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.keywordp( test_name ) : test_name;
    note_inference_test_direction( test_name, direction );
    note_inference_test_kb( test_name, kb );
    note_inference_test_owner( test_name, owner );
    note_inference_test_comment( test_name, comment );
    note_inference_test_bug_number( test_name, bug );
    note_inference_test_creation_date( test_name, creation_date );
    note_inference_test_creator( test_name, creator );
    note_inference_test_working( test_name, workingP );
    cyc_testing.new_cyc_test( cyc_testing.$cyc_test_filename$.getDynamicValue( thread ), test_name );
    return test_name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 41481L)
  public static SubLObject inference_test_comment_p(final SubLObject v_object)
  {
    return Types.stringp( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 41560L)
  public static SubLObject inference_test_direction_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $list188, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 41669L)
  public static SubLObject inference_test_owner_p(final SubLObject v_object)
  {
    return Types.stringp( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 41746L)
  public static SubLObject note_inference_test_direction(final SubLObject test_name, SubLObject direction)
  {
    if( NIL == direction )
    {
      direction = $kw184$BOTH;
    }
    assert NIL != inference_test_direction_p( direction ) : direction;
    Symbols.put( test_name, $kw40$DIRECTION, direction );
    return direction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 41980L)
  public static SubLObject inference_test_direction(final SubLObject test_name)
  {
    return Symbols.get( test_name, $kw40$DIRECTION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 42072L)
  public static SubLObject note_inference_test_kb(final SubLObject test_name, final SubLObject kb)
  {
    assert NIL != cyc_testing.cyc_test_kb_p( kb ) : kb;
    if( NIL != kb )
    {
      Symbols.put( test_name, $kw169$KB, kb );
    }
    return kb;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 42211L)
  public static SubLObject inference_test_kb(final SubLObject test_name)
  {
    return Symbols.get( test_name, $kw169$KB, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 42289L)
  public static SubLObject note_inference_test_owner(final SubLObject test_name, final SubLObject owner)
  {
    assert NIL != inference_test_owner_p( owner ) : owner;
    if( NIL != owner )
    {
      Symbols.put( test_name, $kw170$OWNER, owner );
    }
    return owner;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 42458L)
  public static SubLObject inference_test_owner(final SubLObject test_name)
  {
    return Symbols.get( test_name, $kw170$OWNER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 42542L)
  public static SubLObject note_inference_test_comment(final SubLObject test_name, final SubLObject comment)
  {
    if( NIL != comment && !assertionsDisabledInClass && NIL == Types.stringp( comment ) )
    {
      throw new AssertionError( comment );
    }
    if( NIL != comment )
    {
      Symbols.put( test_name, $kw171$COMMENT, comment );
    }
    return comment;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 42721L)
  public static SubLObject inference_test_comment(final SubLObject test_name)
  {
    return Symbols.get( test_name, $kw171$COMMENT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 42809L)
  public static SubLObject note_inference_test_bug_number(final SubLObject test_name, final SubLObject bug_number)
  {
    if( NIL != bug_number && !assertionsDisabledInClass && NIL == subl_promotions.positive_integer_p( bug_number ) )
    {
      throw new AssertionError( bug_number );
    }
    if( NIL != bug_number )
    {
      Symbols.put( test_name, $kw194$BUG_NUMBER, bug_number );
    }
    return bug_number;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 43020L)
  public static SubLObject inference_test_bug_number(final SubLObject test_name)
  {
    return Symbols.get( test_name, $kw194$BUG_NUMBER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 43114L)
  public static SubLObject note_inference_test_creation_date(final SubLObject test_name, final SubLObject creation_date)
  {
    if( NIL != creation_date && !assertionsDisabledInClass && NIL == numeric_date_utilities.universal_date_p( creation_date ) )
    {
      throw new AssertionError( creation_date );
    }
    if( NIL != creation_date )
    {
      Symbols.put( test_name, $kw196$CREATION_DATE, creation_date );
    }
    return creation_date;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 43344L)
  public static SubLObject inference_test_creation_date(final SubLObject test_name)
  {
    return Symbols.get( test_name, $kw196$CREATION_DATE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 43444L)
  public static SubLObject note_inference_test_creator(final SubLObject test_name, final SubLObject creator)
  {
    if( NIL != creator && !assertionsDisabledInClass && NIL == Types.stringp( creator ) )
    {
      throw new AssertionError( creator );
    }
    if( NIL != creator )
    {
      Symbols.put( test_name, $kw174$CREATOR, creator );
    }
    return creator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 43623L)
  public static SubLObject inference_test_creator(final SubLObject test_name)
  {
    return Symbols.get( test_name, $kw174$CREATOR, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 43711L)
  public static SubLObject note_inference_test_working(final SubLObject test_name, final SubLObject workingP)
  {
    assert NIL != Types.booleanp( workingP ) : workingP;
    Symbols.put( test_name, $kw175$WORKING_, workingP );
    return workingP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 43865L)
  public static SubLObject inference_test_workingP(final SubLObject test_name)
  {
    return Symbols.get( test_name, $kw175$WORKING_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 43955L)
  public static SubLObject working_inference_tests()
  {
    return list_utilities.remove_if_not( $sym198$INFERENCE_TEST_WORKING_, inference_test_names(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 44074L)
  public static SubLObject non_working_inference_tests()
  {
    return Sequences.remove_if( $sym198$INFERENCE_TEST_WORKING_, inference_test_names(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 44321L)
  public static SubLObject def_time_inference_test(final SubLObject test_keyword, final SubLObject quoted_test_body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != subl_promotions.memberP( test_keyword, $inference_tests$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym69$CAR ) ) )
    {
      $time_inference_tests$.setDynamicValue( ConsesLow.cons( ConsesLow.list( test_keyword, quoted_test_body ), Sequences.remove( test_keyword, $time_inference_tests$.getDynamicValue( thread ), Symbols.symbol_function(
          EQUAL ), Symbols.symbol_function( $sym69$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), thread );
    }
    else
    {
      $inference_tests$.setDynamicValue( ConsesLow.cons( ConsesLow.list( test_keyword, quoted_test_body ), $inference_tests$.getDynamicValue( thread ) ), thread );
    }
    return test_keyword;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 44705L)
  public static SubLObject defined_time_inference_tests(SubLObject forceP)
  {
    if( forceP == UNPROVIDED )
    {
      forceP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forceP )
    {
      final SubLObject pathname = construct_cyc_test_filename( UNPROVIDED, UNPROVIDED );
      if( pathname.isString() && NIL != Filesys.probe_file( pathname ) )
      {
        Eval.load( pathname );
      }
      else
      {
        PrintLow.format( T, $str124$_s_is_not_an_accessible_pathname_, pathname );
      }
    }
    final SubLObject keywords = Mapping.mapcar( Symbols.symbol_function( $sym69$CAR ), $time_inference_tests$.getDynamicValue( thread ) );
    if( NIL != keywords )
    {
      return Sort.sort( conses_high.copy_list( keywords ), Symbols.symbol_function( $sym125$STRING_ ), Symbols.symbol_function( $sym126$OBJ__STRING ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 45144L)
  public static SubLObject do_time_tests_backward(SubLObject progress_blipP, SubLObject verboseP)
  {
    if( progress_blipP == UNPROVIDED )
    {
      progress_blipP = NIL;
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    do_tests( defined_time_inference_tests( UNPROVIDED ), progress_blipP, verboseP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  public static SubLObject declare_inference_testing_file()
  {
    SubLFiles.declareFunction( me, "construct_cyc_test_filename", "CONSTRUCT-CYC-TEST-FILENAME", 0, 2, false );
    SubLFiles.declareFunction( me, "break_on_failureP", "BREAK-ON-FAILURE?", 0, 0, false );
    SubLFiles.declareFunction( me, "return_list_of_values", "RETURN-LIST-OF-VALUES", 1, 2, false );
    SubLFiles.declareFunction( me, "list_assertions", "LIST-ASSERTIONS", 2, 4, false );
    SubLFiles.declareFunction( me, "print_assertions", "PRINT-ASSERTIONS", 2, 5, false );
    SubLFiles.declareFunction( me, "instanceofP", "INSTANCEOF?", 2, 0, false );
    SubLFiles.declareFunction( me, "legacy_b_verify", "LEGACY-B-VERIFY", 2, 4, false );
    SubLFiles.declareFunction( me, "b_verify", "B-VERIFY", 1, 2, false );
    SubLFiles.declareFunction( me, "print_and_eval", "PRINT-AND-EVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "b_test_form", "B-TEST-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "test_error", "TEST-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "test_warning", "TEST-WARNING", 1, 0, false );
    SubLFiles.declareFunction( me, "test_no_warning", "TEST-NO-WARNING", 1, 0, false );
    SubLFiles.declareFunction( me, "form_verify", "FORM-VERIFY", 3, 1, false );
    SubLFiles.declareFunction( me, "test_verify", "TEST-VERIFY", 2, 0, false );
    SubLFiles.declareFunction( me, "test_verify_new", "TEST-VERIFY-NEW", 2, 0, false );
    SubLFiles.declareFunction( me, "test_verify_guts", "TEST-VERIFY-GUTS", 3, 0, false );
    SubLFiles.declareFunction( me, "m_verify", "M-VERIFY", 2, 2, false );
    SubLFiles.declareFunction( me, "legacy_binding_verify", "LEGACY-BINDING-VERIFY", 3, 4, false );
    SubLFiles.declareFunction( me, "binding_verify", "BINDING-VERIFY", 2, 2, false );
    SubLFiles.declareFunction( me, "legacy_verify_not", "LEGACY-VERIFY-NOT", 2, 4, false );
    SubLFiles.declareFunction( me, "verify_not", "VERIFY-NOT", 1, 2, false );
    SubLFiles.declareFunction( me, "print_assert", "PRINT-ASSERT", 2, 2, false );
    SubLFiles.declareFunction( me, "print_assert_wff", "PRINT-ASSERT-WFF", 2, 2, false );
    SubLFiles.declareFunction( me, "print_assert_with_time", "PRINT-ASSERT-WITH-TIME", 2, 2, false );
    SubLFiles.declareFunction( me, "print_unassert", "PRINT-UNASSERT", 2, 0, false );
    SubLFiles.declareFunction( me, "print_blast", "PRINT-BLAST", 2, 0, false );
    SubLFiles.declareFunction( me, "print_justify", "PRINT-JUSTIFY", 2, 1, false );
    SubLFiles.declareFunction( me, "print_kill", "PRINT-KILL", 1, 0, false );
    SubLFiles.declareFunction( me, "print_create", "PRINT-CREATE", 1, 1, false );
    SubLFiles.declareFunction( me, "print_tms_formula", "PRINT-TMS-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "print_tms_mt", "PRINT-TMS-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "update_test_results", "UPDATE-TEST-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kill_test_constants_created", "KILL-TEST-CONSTANTS-CREATED", 0, 0, false );
    SubLFiles.declareFunction( me, "run_test", "RUN-TEST", 1, 7, false );
    SubLFiles.declareFunction( me, "do_tests", "DO-TESTS", 0, 10, false );
    SubLFiles.declareFunction( me, "sorted_test_results", "SORTED-TEST-RESULTS", 0, 1, false );
    SubLFiles.declareFunction( me, "print_test_results", "PRINT-TEST-RESULTS", 0, 1, false );
    SubLFiles.declareFunction( me, "print_failing_tests", "PRINT-FAILING-TESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "parameterized_test_value", "PARAMETERIZED-TEST-VALUE", 1, 3, false );
    SubLFiles.declareMacro( me, "print_failing_form", "PRINT-FAILING-FORM" );
    SubLFiles.declareFunction( me, "failing_it_form_identifier", "FAILING-IT-FORM-IDENTIFIER", 1, 1, false );
    SubLFiles.declareFunction( me, "herald_start", "HERALD-START", 0, 0, false );
    SubLFiles.declareFunction( me, "def_inference_test", "DEF-INFERENCE-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_test_p", "INFERENCE-TEST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_test_form", "INFERENCE-TEST-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_test_mentions_invalid_constantP", "INFERENCE-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_test_invalid_constants", "INFERENCE-TEST-INVALID-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_test_names", "INFERENCE-TEST-NAMES", 0, 0, false );
    SubLFiles.declareFunction( me, "obj_Gstring", "OBJ->STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "defined_inference_tests", "DEFINED-INFERENCE-TESTS", 0, 1, false );
    SubLFiles.declareFunction( me, "load_inference_tests", "LOAD-INFERENCE-TESTS", 0, 1, false );
    SubLFiles.declareFunction( me, "clear_inference_tests", "CLEAR-INFERENCE-TESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_inference_test_results", "CLEAR-INFERENCE-TEST-RESULTS", 0, 0, false );
    SubLFiles.declareFunction( me, "do_all_tests", "DO-ALL-TESTS", 0, 6, false );
    SubLFiles.declareFunction( me, "do_tests_backward", "DO-TESTS-BACKWARD", 0, 4, false );
    SubLFiles.declareFunction( me, "do_tests_forward", "DO-TESTS-FORWARD", 0, 4, false );
    SubLFiles.declareMacro( me, "with_test_constants", "WITH-TEST-CONSTANTS" );
    SubLFiles.declareMacro( me, "with_test_assertions", "WITH-TEST-ASSERTIONS" );
    SubLFiles.declareMacro( me, "with_test_assertion_lists", "WITH-TEST-ASSERTION-LISTS" );
    SubLFiles.declareMacro( me, "define_subtest", "DEFINE-SUBTEST" );
    SubLFiles.declareFunction( me, "assert_query_test", "ASSERT-QUERY-TEST", 2, 5, false );
    SubLFiles.declareMacro( me, "define_inference_test", "DEFINE-INFERENCE-TEST" );
    SubLFiles.declareFunction( me, "run_inference_testP", "RUN-INFERENCE-TEST?", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_matches_expectationsP", "KB-MATCHES-EXPECTATIONS?", 2, 0, false );
    SubLFiles.declareFunction( me, "new_inference_test", "NEW-INFERENCE-TEST", 9, 0, false );
    SubLFiles.declareFunction( me, "inference_test_comment_p", "INFERENCE-TEST-COMMENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_test_direction_p", "INFERENCE-TEST-DIRECTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_test_owner_p", "INFERENCE-TEST-OWNER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "note_inference_test_direction", "NOTE-INFERENCE-TEST-DIRECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_test_direction", "INFERENCE-TEST-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "note_inference_test_kb", "NOTE-INFERENCE-TEST-KB", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_test_kb", "INFERENCE-TEST-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "note_inference_test_owner", "NOTE-INFERENCE-TEST-OWNER", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_test_owner", "INFERENCE-TEST-OWNER", 1, 0, false );
    SubLFiles.declareFunction( me, "note_inference_test_comment", "NOTE-INFERENCE-TEST-COMMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_test_comment", "INFERENCE-TEST-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "note_inference_test_bug_number", "NOTE-INFERENCE-TEST-BUG-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_test_bug_number", "INFERENCE-TEST-BUG-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "note_inference_test_creation_date", "NOTE-INFERENCE-TEST-CREATION-DATE", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_test_creation_date", "INFERENCE-TEST-CREATION-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "note_inference_test_creator", "NOTE-INFERENCE-TEST-CREATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_test_creator", "INFERENCE-TEST-CREATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "note_inference_test_working", "NOTE-INFERENCE-TEST-WORKING", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_test_workingP", "INFERENCE-TEST-WORKING?", 1, 0, false );
    SubLFiles.declareFunction( me, "working_inference_tests", "WORKING-INFERENCE-TESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "non_working_inference_tests", "NON-WORKING-INFERENCE-TESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "def_time_inference_test", "DEF-TIME-INFERENCE-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "defined_time_inference_tests", "DEFINED-TIME-INFERENCE-TESTS", 0, 1, false );
    SubLFiles.declareFunction( me, "do_time_tests_backward", "DO-TIME-TESTS-BACKWARD", 0, 2, false );
    return NIL;
  }

  public static SubLObject init_inference_testing_file()
  {
    $default_cyc_test_file$ = SubLFiles.defparameter( "*DEFAULT-CYC-TEST-FILE*", $str0$inference_tests );
    $inference_tests$ = SubLFiles.defvar( "*INFERENCE-TESTS*", NIL );
    $test_constants_created$ = SubLFiles.defparameter( "*TEST-CONSTANTS-CREATED*", NIL );
    $current_test$ = SubLFiles.defparameter( "*CURRENT-TEST*", NIL );
    $test_status$ = SubLFiles.defparameter( "*TEST-STATUS*", NIL );
    $test_results$ = SubLFiles.defparameter( "*TEST-RESULTS*", NIL );
    $break_on_failure$ = SubLFiles.defparameter( "*BREAK-ON-FAILURE*", NIL );
    $break_on_failureP$ = SubLFiles.defparameter( "*BREAK-ON-FAILURE?*", NIL );
    $break_before_test_endP$ = SubLFiles.defparameter( "*BREAK-BEFORE-TEST-END?*", NIL );
    $elapsed_time$ = SubLFiles.defparameter( "*ELAPSED-TIME*", NIL );
    $it_failing_verbose$ = SubLFiles.defparameter( "*IT-FAILING-VERBOSE*", T );
    $it_verbose$ = SubLFiles.defparameter( "*IT-VERBOSE*", T );
    $it_backchain$ = SubLFiles.defparameter( "*IT-BACKCHAIN*", NIL );
    $it_number$ = SubLFiles.defparameter( "*IT-NUMBER*", ONE_INTEGER );
    $it_time$ = SubLFiles.defparameter( "*IT-TIME*", TWENTY_INTEGER );
    $it_depth$ = SubLFiles.defparameter( "*IT-DEPTH*", TWENTY_INTEGER );
    $test_direction$ = SubLFiles.defparameter( "*TEST-DIRECTION*", $kw3$BACKWARD );
    $verify_as_continuableP$ = SubLFiles.defparameter( "*VERIFY-AS-CONTINUABLE?*", NIL );
    $index_collection$ = SubLFiles.defparameter( "*INDEX-COLLECTION*", NIL );
    $debug_continue$ = SubLFiles.defparameter( "*DEBUG-CONTINUE*", NIL );
    $it_show_all_failures$ = SubLFiles.defparameter( "*IT-SHOW-ALL-FAILURES*", NIL );
    $evaluate_previously_failing_tests$ = SubLFiles.defparameter( "*EVALUATE-PREVIOUSLY-FAILING-TESTS*", NIL );
    $known_bug_types_to_check$ = SubLFiles.defparameter( "*KNOWN-BUG-TYPES-TO-CHECK*", NIL );
    $check_all_it_bug_types$ = SubLFiles.defparameter( "*CHECK-ALL-IT-BUG-TYPES*", NIL );
    $clean_up_test_constantsP$ = SubLFiles.defparameter( "*CLEAN-UP-TEST-CONSTANTS?*", T );
    $time_inference_tests$ = SubLFiles.defvar( "*TIME-INFERENCE-TESTS*", NIL );
    return NIL;
  }

  public static SubLObject setup_inference_testing_file()
  {
    access_macros.register_macro_helper( $sym119$DEF_INFERENCE_TEST, $sym120$DEFINE_INFERENCE_TEST );
    access_macros.register_macro_helper( $sym178$RUN_INFERENCE_TEST_, $sym120$DEFINE_INFERENCE_TEST );
    access_macros.register_macro_helper( $sym183$NEW_INFERENCE_TEST, $sym120$DEFINE_INFERENCE_TEST );
    access_macros.define_obsolete_register( $sym199$DEF_TIME_INFERENCE_TEST, NIL );
    access_macros.define_obsolete_register( $sym200$DEFINED_TIME_INFERENCE_TESTS, NIL );
    access_macros.define_obsolete_register( $sym201$DO_TIME_TESTS_BACKWARD, NIL );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_testing_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_testing_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_testing_file();
  }
  static
  {
    me = new inference_testing();
    $default_cyc_test_file$ = null;
    $inference_tests$ = null;
    $test_constants_created$ = null;
    $current_test$ = null;
    $test_status$ = null;
    $test_results$ = null;
    $break_on_failure$ = null;
    $break_on_failureP$ = null;
    $break_before_test_endP$ = null;
    $elapsed_time$ = null;
    $it_failing_verbose$ = null;
    $it_verbose$ = null;
    $it_backchain$ = null;
    $it_number$ = null;
    $it_time$ = null;
    $it_depth$ = null;
    $test_direction$ = null;
    $verify_as_continuableP$ = null;
    $index_collection$ = null;
    $debug_continue$ = null;
    $it_show_all_failures$ = null;
    $evaluate_previously_failing_tests$ = null;
    $known_bug_types_to_check$ = null;
    $check_all_it_bug_types$ = null;
    $clean_up_test_constantsP$ = null;
    $time_inference_tests$ = null;
    $str0$inference_tests = makeString( "inference-tests" );
    $str1$lisp = makeString( "lisp" );
    $list2 = ConsesLow.list( makeString( "tests" ) );
    $kw3$BACKWARD = makeKeyword( "BACKWARD" );
    $str4$___s = makeString( "~%~s" );
    $str5$__No_assertions_found_ = makeString( "~%No assertions found." );
    $kw6$UNKNOWN = makeKeyword( "UNKNOWN" );
    $kw7$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $sym8$NEW_CYC_QUERY = makeSymbol( "NEW-CYC-QUERY" );
    $str9$_____s = makeString( "~&  ~s" );
    $str10$__Success___s________________s = makeString( "~&Success: ~s~%         ==> ~s" );
    $kw11$FAILURE = makeKeyword( "FAILURE" );
    $str12$__Failure___s________________s = makeString( "~&Failure: ~s~%         ==> ~s" );
    $str13$Failure___s________________s = makeString( "Failure: ~s~%         ==> ~s" );
    $str14$__Success___s________________s__ = makeString( "~&Success: ~s~%         ==> ~s~%" );
    $str15$__Failure___s________________s__ = makeString( "~&Failure: ~s~%         ==> ~s~%" );
    $sym16$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str17$_A = makeString( "~A" );
    $str18$__Success___A__ = makeString( "~&Success: ~A~%" );
    $str19$__Failure___s_______________NO_ER = makeString( "~&Failure: ~s~%         ==> NO ERROR~%" );
    $str20$__Failure___A__ = makeString( "~&Failure: ~A~%" );
    $str21$__Success___s_______________NO_ER = makeString( "~&Success: ~s~%         ==> NO ERROR~%" );
    $str22$__Success___s________________s__C = makeString( "~&Success: ~s~%         ==> ~s~%Compared against: ~s~%Test function: ~s" );
    $str23$__Failure___s________________s__C = makeString( "~&Failure: ~s~%         ==> ~s~%Compared against desired value : ~s~%Test function: ~s" );
    $str24$Failure___s________________s__Com = makeString( "Failure: ~s~%         ==> ~s~%Compared against desired value: ~s~%Test function: ~s" );
    $kw25$EVAL_AGAIN = makeKeyword( "EVAL-AGAIN" );
    $kw26$APPLY = makeKeyword( "APPLY" );
    $str27$__Success___s________________s__p = makeString( "~&Success: ~s~%         ==> ~s  passes ~s" );
    $str28$__Failure___s________________s_fa = makeString( "~&Failure: ~s~%         ==> ~s fails ~s" );
    $str29$Failure___s________________s_fail = makeString( "Failure: ~s~%         ==> ~s fails ~s" );
    $sym30$RETURN_LIST_OF_VALUES = makeSymbol( "RETURN-LIST-OF-VALUES" );
    $str31$__Normal___s_______________s__Exp = makeString( "~&Normal: ~s~%        ==> ~s~%Expected: ~s" );
    $kw32$ABNORMAL = makeKeyword( "ABNORMAL" );
    $str33$__Abnormal___s_________________s_ = makeString( "~&Abnormal: ~s~%          ==> ~s~%Expected: ~s~%Not found: ~s~%Unexpected: ~s" );
    $str34$Abnormal___s_________________s__E = makeString( "Abnormal: ~s~%          ==> ~s~%Expected: ~s~%Not found: ~s~%Unexpected: ~s" );
    $sym35$EQUAL_BINDINGS = makeSymbol( "EQUAL-BINDINGS" );
    $str36$__Abnormal___s_______________s__E = makeString( "~&Abnormal: ~s~%        ==> ~s~%Expected: ~s" );
    $str37$Abnormal___s_______________s__Exp = makeString( "Abnormal: ~s~%        ==> ~s~%Expected: ~s" );
    $kw38$DEFAULT = makeKeyword( "DEFAULT" );
    $kw39$STRENGTH = makeKeyword( "STRENGTH" );
    $kw40$DIRECTION = makeKeyword( "DIRECTION" );
    $sym41$CYC_ASSERT = makeSymbol( "CYC-ASSERT" );
    $str42$__Failure__Assertion__s_failed_ = makeString( "~&Failure: Assertion ~s failed." );
    $str43$Failure__Assertion__s_failed_ = makeString( "Failure: Assertion ~s failed." );
    $sym44$CYC_ASSERT_WFF = makeSymbol( "CYC-ASSERT-WFF" );
    $kw45$FORWARD = makeKeyword( "FORWARD" );
    $kw46$SILENT = makeKeyword( "SILENT" );
    $str47$___A__ = makeString( "~&~A~%" );
    $str48$___s_constant_A__A__ = makeString( "  ~s constant~A ~A~%" );
    $str49$s_were = makeString( "s were" );
    $str50$_was = makeString( " was" );
    $str51$created = makeString( "created" );
    $str52$destroyed = makeString( "destroyed" );
    $str53$___s_nart_A__A__ = makeString( "  ~s nart~A ~A~%" );
    $str54$___s_assertion_A__A__ = makeString( "  ~s assertion~A ~A~%" );
    $str55$___s_kb_hl_support_A__A__ = makeString( "  ~s kb-hl-support~A ~A~%" );
    $str56$___s_deduction_A__A__ = makeString( "  ~s deduction~A ~A~%" );
    $str57$__Assert_time____A = makeString( "~%Assert time = ~A" );
    $sym58$FI_UNASSERT_INT = makeSymbol( "FI-UNASSERT-INT" );
    $sym59$FI_BLAST_INT = makeSymbol( "FI-BLAST-INT" );
    $sym60$FI_JUSTIFY_INT = makeSymbol( "FI-JUSTIFY-INT" );
    $str61$__Justification_____s = makeString( "~%Justification => ~s" );
    $sym62$FI_KILL_INT = makeSymbol( "FI-KILL-INT" );
    $sym63$FI_FIND_OR_CREATE_INT = makeSymbol( "FI-FIND-OR-CREATE-INT" );
    $str64$__Failure__Did_not_find_unique_na = makeString( "~&Failure: Did not find unique name to create a constant for ~s." );
    $str65$Failure__Create_constant__s_faile = makeString( "Failure: Create constant ~s failed." );
    $sym66$FI_TMS_RECONSIDER_FORMULA_INT = makeSymbol( "FI-TMS-RECONSIDER-FORMULA-INT" );
    $sym67$FI_TMS_RECONSIDER_MT_INT = makeSymbol( "FI-TMS-RECONSIDER-MT-INT" );
    $kw68$SUCCESS = makeKeyword( "SUCCESS" );
    $sym69$CAR = makeSymbol( "CAR" );
    $kw70$TRANSMIT_AND_RECEIVE = makeKeyword( "TRANSMIT-AND-RECEIVE" );
    $kw71$DEAF = makeKeyword( "DEAF" );
    $kw72$STANDARD = makeKeyword( "STANDARD" );
    $str73$___IT___S__S_ = makeString( "~&:IT (~S ~S)" );
    $kw74$POST_BUILD = makeKeyword( "POST-BUILD" );
    $str75$_____Starting__IT___S__S__at__A__ = makeString( "~&;; Starting :IT (~S ~S) at ~A~&" );
    $kw76$IT = makeKeyword( "IT" );
    $str77$_____s____3f_ = makeString( " -> ~s (~,3f)" );
    $kw78$VERBOSE = makeKeyword( "VERBOSE" );
    $str79$Warning__Test__ = makeString( "Warning: Test (" );
    $str80$_ = makeString( " " );
    $str81$__changed_the_KB_ = makeString( ") changed the KB!" );
    $str82$__There_is_no_test_in__s_associat = makeString( "~&There is no test in ~s associated with ~s.~%" );
    $sym83$_INFERENCE_TESTS_ = makeSymbol( "*INFERENCE-TESTS*" );
    $str84$__In_fact__there_are_no_tests_in_ = makeString( "~&In fact, there are no tests in ~s at all!~%" );
    $str85$__The__s_argument_is__s__which_is = makeString( "~%The ~s argument is ~s, which is not a list of test keywords." );
    $sym86$KEYWORD_LIST = makeSymbol( "KEYWORD-LIST" );
    $sym87$TERM__ = makeSymbol( "TERM-<" );
    $sym88$CDR = makeSymbol( "CDR" );
    $str89$__ = makeString( "~%" );
    $str90$__ = makeString( "->" );
    $str91$_IT = makeString( ":IT" );
    $str92$Unknown_output_format__A = makeString( "Unknown output format ~A" );
    $str93$___s__a__s = makeString( "~%~s ~a ~s" );
    $str94$___s_____s = makeString( "~%~s -> ~s" );
    $list95 = ConsesLow.list( makeSymbol( "FORM" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "KEYWORD" ), ConsesLow.list( makeSymbol( "KEYWORD-TEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol(
        "FUNCTION" ), EQUAL ) ) ), makeSymbol( "MESSAGE" ), makeSymbol( "MESSAGE-LIST" ) );
    $list96 = ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL );
    $sym97$PIF = makeSymbol( "PIF" );
    $sym98$CAND = makeSymbol( "CAND" );
    $sym99$_EVALUATE_PREVIOUSLY_FAILING_TESTS_ = makeSymbol( "*EVALUATE-PREVIOUSLY-FAILING-TESTS*" );
    $sym100$COR = makeSymbol( "COR" );
    $sym101$NULL = makeSymbol( "NULL" );
    $sym102$_CHECK_ALL_IT_BUG_TYPES_ = makeSymbol( "*CHECK-ALL-IT-BUG-TYPES*" );
    $sym103$MEMBER = makeSymbol( "MEMBER" );
    $sym104$_KNOWN_BUG_TYPES_TO_CHECK_ = makeSymbol( "*KNOWN-BUG-TYPES-TO-CHECK*" );
    $sym105$PROGN = makeSymbol( "PROGN" );
    $sym106$_IT_FAILING_VERBOSE_ = makeSymbol( "*IT-FAILING-VERBOSE*" );
    $sym107$CLET = makeSymbol( "CLET" );
    $list108 = ConsesLow.list( ConsesLow.list( makeSymbol( "*IT-VERBOSE*" ), T ), ConsesLow.list( makeSymbol( "*TEST-STATUS*" ), NIL ) );
    $sym109$FORMAT = makeSymbol( "FORMAT" );
    $str110$__The_previously_failing_test____ = makeString( "~&The previously failing test~%  ~s~%of type ~s was evaluated immediately after this.~%" );
    $sym111$QUOTE = makeSymbol( "QUOTE" );
    $sym112$PWHEN = makeSymbol( "PWHEN" );
    $sym113$APPLY = makeSymbol( "APPLY" );
    $list114 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "FORMAT" ) );
    $sym115$CNOT = makeSymbol( "CNOT" );
    $str116$__This_previously_failing_test___ = makeString( "~&This previously failing test~%  ~s~%of type ~s was not evaluated.~%" );
    $str117$__This_previously_failing_test___ = makeString( "~&This previously failing test~%  ~s~%was not evaluated.~%" );
    $str118$__Starting__a____ = makeString( "~&Starting ~a ..." );
    $sym119$DEF_INFERENCE_TEST = makeSymbol( "DEF-INFERENCE-TEST" );
    $sym120$DEFINE_INFERENCE_TEST = makeSymbol( "DEFINE-INFERENCE-TEST" );
    $sym121$INVALID_CONSTANT_ = makeSymbol( "INVALID-CONSTANT?" );
    $sym122$FIRST = makeSymbol( "FIRST" );
    $str123$_s = makeString( "~s" );
    $str124$_s_is_not_an_accessible_pathname_ = makeString( "~s is not an accessible pathname." );
    $sym125$STRING_ = makeSymbol( "STRING<" );
    $sym126$OBJ__STRING = makeSymbol( "OBJ->STRING" );
    $str127$___ERROR__LOADING__A__S = makeString( "~%:ERROR :LOADING ~A ~S" );
    $str128$___s_is_bound_to__s__which_is_not = makeString( "~%~s is bound to ~s, which is not known to be a valid pathname." );
    $sym129$PATHNAME = makeSymbol( "PATHNAME" );
    $list130 = ConsesLow.list( makeSymbol( "SPECIAL?" ), makeSymbol( "VAR-SPECS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym131$VAR_SPEC_VAR = makeSymbol( "VAR-SPEC-VAR" );
    $sym132$TEST_CONSTANTS = makeUninternedSymbol( "TEST-CONSTANTS" );
    $sym133$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym134$PRINT_CREATE_VAR_SPEC_CONSTANT = makeSymbol( "PRINT-CREATE-VAR-SPEC-CONSTANT" );
    $sym135$CSETQ = makeSymbol( "CSETQ" );
    $sym136$LIST = makeSymbol( "LIST" );
    $sym137$PRINT_ASSERT = makeSymbol( "PRINT-ASSERT" );
    $sym138$VAR_SPEC_DEF = makeSymbol( "VAR-SPEC-DEF" );
    $list139 = ConsesLow.list( makeSymbol( "*DEFAULT-ASSERT-MT*" ), makeKeyword( "MONOTONIC" ), makeKeyword( "FORWARD" ) );
    $list140 = ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "*BREAK-BEFORE-TEST-END?*" ), ConsesLow.list( makeSymbol( "BREAK" ), makeString( "Test ~A before cleanup" ), makeSymbol( "*CURRENT-TEST*" ) ) );
    $sym141$_CLEAN_UP_TEST_CONSTANTS__ = makeSymbol( "*CLEAN-UP-TEST-CONSTANTS?*" );
    $sym142$PRINT_KILL = makeSymbol( "PRINT-KILL" );
    $list143 = ConsesLow.list( makeSymbol( "SPECIAL?" ), makeSymbol( "MT" ), makeSymbol( "TRUTH-VALUE" ), makeSymbol( "DIRECTION" ), makeSymbol( "VAR-SPECS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym144$TEST_ASSERTIONS = makeUninternedSymbol( "TEST-ASSERTIONS" );
    $sym145$PRINT_UNASSERT = makeSymbol( "PRINT-UNASSERT" );
    $sym146$TEST_ASSERTIONS = makeUninternedSymbol( "TEST-ASSERTIONS" );
    $sym147$APPEND = makeSymbol( "APPEND" );
    $list148 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "VARS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym149$ARGLIST = makeUninternedSymbol( "ARGLIST" );
    $sym150$DEFMACRO = makeSymbol( "DEFMACRO" );
    $sym151$_REST = makeSymbol( "&REST" );
    $sym152$RET = makeSymbol( "RET" );
    $sym153$BQ_LIST = makeSymbol( "BQ-LIST" );
    $list154 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CDESTRUCTURING-BIND" ) );
    $sym155$BQ_CONS = makeSymbol( "BQ-CONS" );
    $list156 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LIST" ) );
    $sym157$BQ_APPEND = makeSymbol( "BQ-APPEND" );
    $list158 = ConsesLow.list( NIL );
    $list159 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PWHEN" ) );
    $list160 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*IT-VERBOSE*" ) );
    $list161 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FORMAT" ) );
    $str162$___________A__S = makeString( "~&~%>>>>> ~A ~S" );
    $list163 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PROGN" ) );
    $str164$___________A__S = makeString( "~&~%<<<<< ~A ~S" );
    $sym165$B_VERIFY = makeSymbol( "B-VERIFY" );
    $list166 = ConsesLow.list( makeSymbol( "TEST-NAME" ), ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "DIRECTION" ), makeKeyword( "BACKWARD" ) ), makeSymbol( "KB" ), makeSymbol(
        "OWNER" ), makeSymbol( "COMMENT" ), makeSymbol( "BUG" ), makeSymbol( "CREATED" ), makeSymbol( "CREATOR" ), ConsesLow.list( makeSymbol( "WORKING?" ), T )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list167 = ConsesLow.list( makeKeyword( "DIRECTION" ), makeKeyword( "KB" ), makeKeyword( "OWNER" ), makeKeyword( "COMMENT" ), makeKeyword( "BUG" ), makeKeyword( "CREATED" ), makeKeyword( "CREATOR" ), makeKeyword(
        "WORKING?" ) );
    $kw168$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw169$KB = makeKeyword( "KB" );
    $kw170$OWNER = makeKeyword( "OWNER" );
    $kw171$COMMENT = makeKeyword( "COMMENT" );
    $kw172$BUG = makeKeyword( "BUG" );
    $kw173$CREATED = makeKeyword( "CREATED" );
    $kw174$CREATOR = makeKeyword( "CREATOR" );
    $kw175$WORKING_ = makeKeyword( "WORKING?" );
    $list176 = ConsesLow.list( makeSymbol( "HERALD-START" ) );
    $sym177$PCOND = makeSymbol( "PCOND" );
    $sym178$RUN_INFERENCE_TEST_ = makeSymbol( "RUN-INFERENCE-TEST?" );
    $list179 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*TEST-STATUS*" ), makeKeyword( "NOT-RUN" ) ) );
    $sym180$INFERENCE_TEST_MENTIONS_INVALID_CONSTANT_ = makeSymbol( "INFERENCE-TEST-MENTIONS-INVALID-CONSTANT?" );
    $list181 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*TEST-STATUS*" ), makeKeyword( "INVALID" ) ) );
    $list182 = ConsesLow.list( ConsesLow.list( makeSymbol( "UPDATE-TEST-RESULTS" ), makeSymbol( "*CURRENT-TEST*" ) ) );
    $sym183$NEW_INFERENCE_TEST = makeSymbol( "NEW-INFERENCE-TEST" );
    $kw184$BOTH = makeKeyword( "BOTH" );
    $kw185$FULL = makeKeyword( "FULL" );
    $kw186$TINY = makeKeyword( "TINY" );
    $sym187$KEYWORDP = makeSymbol( "KEYWORDP" );
    $list188 = ConsesLow.list( makeKeyword( "FORWARD" ), makeKeyword( "BACKWARD" ), makeKeyword( "BOTH" ) );
    $sym189$INFERENCE_TEST_DIRECTION_P = makeSymbol( "INFERENCE-TEST-DIRECTION-P" );
    $sym190$CYC_TEST_KB_P = makeSymbol( "CYC-TEST-KB-P" );
    $sym191$INFERENCE_TEST_OWNER_P = makeSymbol( "INFERENCE-TEST-OWNER-P" );
    $sym192$STRINGP = makeSymbol( "STRINGP" );
    $sym193$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $kw194$BUG_NUMBER = makeKeyword( "BUG-NUMBER" );
    $sym195$UNIVERSAL_DATE_P = makeSymbol( "UNIVERSAL-DATE-P" );
    $kw196$CREATION_DATE = makeKeyword( "CREATION-DATE" );
    $sym197$BOOLEANP = makeSymbol( "BOOLEANP" );
    $sym198$INFERENCE_TEST_WORKING_ = makeSymbol( "INFERENCE-TEST-WORKING?" );
    $sym199$DEF_TIME_INFERENCE_TEST = makeSymbol( "DEF-TIME-INFERENCE-TEST" );
    $sym200$DEFINED_TIME_INFERENCE_TESTS = makeSymbol( "DEFINED-TIME-INFERENCE-TESTS" );
    $sym201$DO_TIME_TESTS_BACKWARD = makeSymbol( "DO-TIME-TESTS-BACKWARD" );
  }
}
/*
 * 
 * Total time: 794 ms synthetic
 */