package com.cyc.cycjava.cycl.cyc_testing;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_cyc_testing;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.numeric_date_utilities;

import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_testing
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyc_testing";
  public static final String myFingerPrint = "23520720437c6009feaad1eceef5734e29e4b1368630385d8d6771dc8c766361";
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 1480L)
  public static SubLSymbol $it_output_format$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 1705L)
  public static SubLSymbol $cyc_test_debugP$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 1821L)
  public static SubLSymbol $run_tiny_kb_tests_in_full_kbP$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 2089L)
  private static SubLSymbol $test_real_time_pruningP$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 2396L)
  private static SubLSymbol $cyc_test_verbosity_levels$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 2525L)
  public static SubLSymbol $cyc_test_filename$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 2667L)
  public static SubLSymbol $cyc_base_testdcl$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 2722L)
  public static SubLSymbol $warn_on_duplicate_cyc_test_namesP$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 2994L)
  public static SubLSymbol $only_undeclare_tests_and_test_filesP$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 3426L)
  private static SubLSymbol $cyc_test_result_success_values$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 3582L)
  private static SubLSymbol $cyc_test_result_failure_values$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 3734L)
  private static SubLSymbol $cyc_test_result_ignore_values$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 4002L)
  private static SubLSymbol $cyc_test_result_values$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 4788L)
  private static SubLSymbol $cyc_test_type_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 5774L)
  private static SubLSymbol $cyc_tests$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 6636L)
  private static SubLSymbol $cyc_test_by_name$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 6748L)
  private static SubLSymbol $cyc_test_by_dwimmed_name$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
  public static SubLSymbol $dtp_cyc_test$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 19189L)
  public static SubLSymbol $print_post_build_test_summary_timestampP$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 23216L)
  private static SubLSymbol $cfasl_wide_opcode_cyc_test$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 28657L)
  private static SubLSymbol $cyc_test_files$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
  public static SubLSymbol $dtp_cyc_test_file$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 30316L)
  private static SubLSymbol $most_recent_cyc_test_runs$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 30547L)
  private static SubLSymbol $most_recent_cyc_test_file_load_failures$;
  private static final SubLSymbol $kw0$STANDARD;
  private static final SubLList $list1;
  private static final SubLString $str2$testdcl;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$FIRST;
  private static final SubLSymbol $kw10$ALL;
  private static final SubLSymbol $sym11$CYC_TEST_TYPE_P;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLSymbol $kw14$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw15$DONE;
  private static final SubLSymbol $sym16$CSOME;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLString $str19$Iterating_over_all_Cyc_tests;
  private static final SubLSymbol $sym20$PROGRESS_CDOLIST;
  private static final SubLSymbol $sym21$_CYC_TEST_BY_NAME_;
  private static final SubLInteger $int22$212;
  private static final SubLSymbol $sym23$_CYC_TEST_BY_DWIMMED_NAME_;
  private static final SubLString $str24$A_Cyc_test_named__a_already_exist;
  private static final SubLSymbol $sym25$REMOVAL_MODULE_TEST_P;
  private static final SubLSymbol $sym26$REMOVAL_MODULE_TEST_PREDICATE;
  private static final SubLSymbol $sym27$REMOVAL_MODULE_COST_TEST_P;
  private static final SubLSymbol $sym28$REMOVAL_MODULE_COST_TEST_PREDICATE;
  private static final SubLSymbol $sym29$CYC_TEST;
  private static final SubLSymbol $sym30$CYC_TEST_P;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$PRINT_CYC_TEST;
  private static final SubLSymbol $sym36$CYC_TEST_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$CT_FILE;
  private static final SubLSymbol $sym39$_CSETF_CT_FILE;
  private static final SubLSymbol $sym40$CT_GUTS;
  private static final SubLSymbol $sym41$_CSETF_CT_GUTS;
  private static final SubLSymbol $kw42$FILE;
  private static final SubLSymbol $kw43$GUTS;
  private static final SubLString $str44$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw45$BEGIN;
  private static final SubLSymbol $sym46$MAKE_CYC_TEST;
  private static final SubLSymbol $kw47$SLOT;
  private static final SubLSymbol $kw48$END;
  private static final SubLSymbol $sym49$VISIT_DEFSTRUCT_OBJECT_CYC_TEST_METHOD;
  private static final SubLString $str50$__CYC_TEST__a__a_;
  private static final SubLString $str51$__CYC_TEST__a_;
  private static final SubLSymbol $sym52$STRINGP;
  private static final SubLSymbol $sym53$CYC_TEST_GUTS_P;
  private static final SubLString $str54$_s_is_not_a_CYC_TEST_GUTS_P;
  private static final SubLSymbol $sym55$GENERIC_TEST_CASE_TABLE_P;
  private static final SubLSymbol $sym56$CYC_TEST_NAME;
  private static final SubLString $str57$Cyc_test_of_unexpected_type___s;
  private static final SubLSymbol $kw58$TCT;
  private static final SubLSymbol $kw59$IUT;
  private static final SubLSymbol $kw60$RMT;
  private static final SubLSymbol $kw61$RMCT;
  private static final SubLSymbol $kw62$TMT;
  private static final SubLSymbol $kw63$ERT;
  private static final SubLSymbol $kw64$IT;
  private static final SubLSymbol $kw65$KCT;
  private static final SubLSymbol $kw66$NOT_RUN;
  private static final SubLString $str67$___A__S__S__S____3f___OWNER__S__;
  private static final SubLString $str68$___S__S__S____3f___OWNER__S__;
  private static final SubLSymbol $kw69$TINY;
  private static final SubLSymbol $kw70$BOTH;
  private static final SubLSymbol $kw71$FULL;
  private static final SubLSymbol $sym72$CYC_TEST_TYPE_SPEC_P;
  private static final SubLSymbol $sym73$CYC_TEST_WORKING_;
  private static final SubLSymbol $sym74$NOT_EQ;
  private static final SubLSymbol $sym75$CYC_TEST_TYPE;
  private static final SubLSymbol $sym76$FIND_CYC_TEST;
  private static final SubLInteger $int77$514;
  private static final SubLSymbol $sym78$CFASL_INPUT_CYC_TEST;
  private static final SubLSymbol $sym79$CFASL_OUTPUT_OBJECT_CYC_TEST_METHOD;
  private static final SubLSymbol $sym80$CYC_TEST_RESULT_P;
  private static final SubLSymbol $sym81$NON_NEGATIVE_NUMBER_P;
  private static final SubLSymbol $sym82$CYC_TEST_RUN_P;
  private static final SubLList $list83;
  private static final SubLSymbol $kw84$FAILURE;
  private static final SubLSymbol $kw85$SUCCESS;
  private static final SubLSymbol $kw86$SILENT;
  private static final SubLString $str87$___S__S_____S___S_;
  private static final SubLSymbol $kw88$POST_BUILD;
  private static final SubLString $str89$Unknown_output_format__A;
  private static final SubLSymbol $kw90$WITH_OWNER;
  private static final SubLString $str91$_;
  private static final SubLString $str92$Unknown_output_format_;
  private static final SubLSymbol $sym93$_CYC_TEST_FILES_;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$CDOLIST;
  private static final SubLList $list96;
  private static final SubLList $list97;
  private static final SubLString $str98$Iterating_over_all_test_files;
  private static final SubLList $list99;
  private static final SubLSymbol $sym100$CYC_TEST_FILE;
  private static final SubLSymbol $sym101$CYC_TEST_FILE_P;
  private static final SubLList $list102;
  private static final SubLList $list103;
  private static final SubLList $list104;
  private static final SubLList $list105;
  private static final SubLSymbol $sym106$PRINT_CYC_TEST_FILE;
  private static final SubLSymbol $sym107$CYC_TEST_FILE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list108;
  private static final SubLSymbol $sym109$CTF_FILENAME;
  private static final SubLSymbol $sym110$_CSETF_CTF_FILENAME;
  private static final SubLSymbol $sym111$CTF_KB;
  private static final SubLSymbol $sym112$_CSETF_CTF_KB;
  private static final SubLSymbol $kw113$FILENAME;
  private static final SubLSymbol $kw114$KB;
  private static final SubLSymbol $sym115$MAKE_CYC_TEST_FILE;
  private static final SubLSymbol $sym116$VISIT_DEFSTRUCT_OBJECT_CYC_TEST_FILE_METHOD;
  private static final SubLString $str117$__CTF__a_;
  private static final SubLSymbol $sym118$CYC_TEST_KB_P;
  private static final SubLSymbol $sym119$_MOST_RECENT_CYC_TEST_RUNS_;
  private static final SubLSymbol $sym120$_MOST_RECENT_CYC_TEST_FILE_LOAD_FAILURES_;
  private static final SubLSymbol $sym121$FAILING_CYC_TEST_RUN_P;
  private static final SubLSymbol $sym122$CYC_TEST_RUN_CYC_TEST;
  private static final SubLList $list123;
  private static final SubLList $list124;
  private static final SubLSymbol $kw125$STREAM;
  private static final SubLSymbol $sym126$_STANDARD_OUTPUT_;
  private static final SubLSymbol $kw127$VERBOSITY;
  private static final SubLSymbol $kw128$TERSE;
  private static final SubLSymbol $kw129$STOP_AT_FIRST_FAILURE_;
  private static final SubLSymbol $kw130$OUTPUT_FORMAT;
  private static final SubLSymbol $kw131$RUN_TINY_KB_TESTS_IN_FULL_KB_;
  private static final SubLSymbol $sym132$_RUN_TINY_KB_TESTS_IN_FULL_KB__;
  private static final SubLSymbol $kw133$RUN_TEST_CASE_TABLES_;
  private static final SubLSymbol $kw134$RETURN_TEST_RUNS_;
  private static final SubLSymbol $kw135$TYPE;
  private static final SubLSymbol $kw136$RUN_NON_WORKING_TESTS;
  private static final SubLSymbol $kw137$PROGRESS_FILE;
  private static final SubLSymbol $kw138$RERUN_CRASHING_TESTS;
  private static final SubLSymbol $sym139$RUN_ALL_CYC_TESTS_INT;
  private static final SubLList $list140;
  private static final SubLList $list141;
  private static final SubLSymbol $kw142$VERBOSE;
  private static final SubLSymbol $sym143$RUN_ALL_LOADED_CYC_TESTS;
  private static final SubLSymbol $sym144$QUOTE;
  private static final SubLList $list145;
  private static final SubLList $list146;
  private static final SubLSymbol $sym147$DECLARE_CYC_TEST_FILE_INT;
  private static final SubLList $list148;
  private static final SubLList $list149;
  private static final SubLSymbol $sym150$FIND_CYC_TESTS_BY_NAME;
  private static final SubLSymbol $sym151$STREAMP;
  private static final SubLSymbol $sym152$BOOLEANP;
  private static final SubLSymbol $sym153$CYC_TEST_VERBOSITY_LEVEL_P;
  private static final SubLString $str154$could_not_load__a_lisp_from__s;
  private static final SubLString $str155$Loading_test_files;
  private static final SubLString $str156$cdolist;
  private static final SubLString $str157$_lisp;
  private static final SubLString $str158$Invalid_phase__A_of__A_specified_;
  private static final SubLSymbol $sym159$DECLARE_CYC_TEST_FILE;
  private static final SubLSymbol $sym160$TINY_KB_CYC_TEST_P;
  private static final SubLInteger $int161$100;
  private static final SubLSymbol $sym162$SERVER_SUMMARY;
  private static final SubLSymbol $kw163$TEST;
  private static final SubLSymbol $kw164$OWNER;
  private static final SubLSymbol $kw165$CLASSES;
  private static final SubLSymbol $kw166$WORKING_;
  private static final SubLList $list167;
  private static final SubLSymbol $sym168$KB_STATISTICS;
  private static final SubLSymbol $sym169$CYC_MEMORY_HOGS;
  private static final SubLSymbol $sym170$ALL_CYC_TESTS_ARE_VALID;

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 2313L)
  public static SubLObject testing_real_time_pruningP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $test_real_time_pruningP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 3063L)
  public static SubLObject cyc_test_kb_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $list3, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 3149L)
  public static SubLObject cyc_test_verbosity_level_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $cyc_test_verbosity_levels$.getGlobalValue(), Symbols.symbol_function( EQ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 3260L)
  public static SubLObject cyc_test_output_format_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $list4, Symbols.symbol_function( EQ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 4190L)
  public static SubLObject cyc_test_result_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $cyc_test_result_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 4345L)
  public static SubLObject cyc_test_success_result_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $cyc_test_result_success_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 4455L)
  public static SubLObject cyc_test_failure_result_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $cyc_test_result_failure_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 4565L)
  public static SubLObject cyc_test_ignore_result_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $cyc_test_result_ignore_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 4673L)
  public static SubLObject cyc_test_result_L(final SubLObject result1, final SubLObject result2)
  {
    return list_utilities.position_L( result1, result2, $cyc_test_result_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 5405L)
  public static SubLObject cyc_test_type_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $cyc_test_type_table$.getGlobalValue(), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym9$FIRST ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 5507L)
  public static SubLObject cyc_test_type_spec_p(final SubLObject v_object)
  {
    return makeBoolean( $kw10$ALL == v_object || NIL != cyc_test_type_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 5615L)
  public static SubLObject cyc_test_type_pretty_name(final SubLObject test_type)
  {
    assert NIL != cyc_test_type_p( test_type ) : test_type;
    return list_utilities.alist_lookup( $cyc_test_type_table$.getGlobalValue(), test_type, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 5916L)
  public static SubLObject cyc_tests()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cyc_tests$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 6036L)
  public static SubLObject undefine_all_cyc_tests()
  {
    $cyc_tests$.setDynamicValue( NIL );
    Hashtables.clrhash( $cyc_test_by_name$.getGlobalValue() );
    Hashtables.clrhash( $cyc_test_by_dwimmed_name$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 6187L)
  public static SubLObject do_cyc_tests(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject cyc_test = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    cyc_test = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list12 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list12 );
      if( NIL == conses_high.member( current_$1, $list13, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list12 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw15$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym16$CSOME, ConsesLow.list( cyc_test, $list17, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 6311L)
  public static SubLObject progress_do_cyc_tests(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject cyc_test = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    cyc_test = current.first();
    current = current.rest();
    final SubLObject message = current.isCons() ? current.first() : $str19$Iterating_over_all_Cyc_tests;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list18 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym20$PROGRESS_CDOLIST, ConsesLow.list( cyc_test, $list17, message ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 6501L)
  public static SubLObject cyc_test_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Sequences.length( $cyc_tests$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 6567L)
  public static SubLObject no_cyc_tests_definedP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL == $cyc_tests$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 6885L)
  public static SubLObject index_cyc_test_by_name(final SubLObject ct, final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $warn_on_duplicate_cyc_test_namesP$.getDynamicValue( thread ) && NIL != Hashtables.gethash( name, $cyc_test_by_name$.getGlobalValue(), UNPROVIDED ) )
    {
      Errors.warn( $str24$A_Cyc_test_named__a_already_exist, name );
    }
    Hashtables.sethash( name, $cyc_test_by_name$.getGlobalValue(), ct );
    Hashtables.sethash( name, $cyc_test_by_dwimmed_name$.getGlobalValue(), ConsesLow.nconc( Hashtables.gethash( name, $cyc_test_by_dwimmed_name$.getGlobalValue(), UNPROVIDED ), ConsesLow.list( ct ) ) );
    if( name.isCons() )
    {
      my_pushnew_to_end_hash( name.first(), ct, $cyc_test_by_dwimmed_name$.getGlobalValue() );
    }
    if( NIL != cyc_testing_initialization.cyc_tests_initializedP() )
    {
      final SubLObject rmt = cyc_test_guts( ct );
      if( NIL != Functions.funcall( $sym25$REMOVAL_MODULE_TEST_P, rmt ) )
      {
        my_pushnew_to_end_hash( Functions.funcall( $sym26$REMOVAL_MODULE_TEST_PREDICATE, rmt ), ct, $cyc_test_by_dwimmed_name$.getGlobalValue() );
      }
    }
    if( NIL != cyc_testing_initialization.cyc_tests_initializedP() )
    {
      final SubLObject rmct = cyc_test_guts( ct );
      if( NIL != Functions.funcall( $sym27$REMOVAL_MODULE_COST_TEST_P, rmct ) )
      {
        my_pushnew_to_end_hash( Functions.funcall( $sym28$REMOVAL_MODULE_COST_TEST_PREDICATE, rmct ), ct, $cyc_test_by_dwimmed_name$.getGlobalValue() );
      }
    }
    return ct;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 8328L)
  public static SubLObject unindex_cyc_test_by_name(final SubLObject ct, final SubLObject name)
  {
    Hashtables.remhash( name, $cyc_test_by_name$.getGlobalValue() );
    my_delete_value_from_hash( name, ct, $cyc_test_by_dwimmed_name$.getGlobalValue() );
    if( name.isCons() )
    {
      my_delete_value_from_hash( name.first(), ct, $cyc_test_by_dwimmed_name$.getGlobalValue() );
    }
    if( NIL != cyc_testing_initialization.cyc_tests_initializedP() )
    {
      final SubLObject rmt = cyc_test_guts( ct );
      if( NIL != Functions.funcall( $sym25$REMOVAL_MODULE_TEST_P, rmt ) )
      {
        my_delete_value_from_hash( Functions.funcall( $sym26$REMOVAL_MODULE_TEST_PREDICATE, rmt ), ct, $cyc_test_by_dwimmed_name$.getGlobalValue() );
      }
    }
    if( NIL != cyc_testing_initialization.cyc_tests_initializedP() )
    {
      final SubLObject rmct = cyc_test_guts( ct );
      if( NIL != Functions.funcall( $sym27$REMOVAL_MODULE_COST_TEST_P, rmct ) )
      {
        my_delete_value_from_hash( Functions.funcall( $sym28$REMOVAL_MODULE_COST_TEST_PREDICATE, rmct ), ct, $cyc_test_by_dwimmed_name$.getGlobalValue() );
      }
    }
    return ct;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9127L)
  public static SubLObject my_pushnew_to_end_hash(final SubLObject key, final SubLObject item, final SubLObject table)
  {
    return Hashtables.sethash( key, table, ConsesLow.nconc( Sequences.delete( item, Hashtables.gethash( key, table, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), ConsesLow.list( item ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9307L)
  public static SubLObject my_delete_value_from_hash(final SubLObject key, final SubLObject item, final SubLObject table)
  {
    return Hashtables.sethash( key, table, Sequences.delete( item, Hashtables.gethash( key, table, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9470L)
  public static SubLObject index_all_cyc_tests_by_name()
  {
    SubLObject csome_list_var = cyc_tests();
    SubLObject ct = NIL;
    ct = csome_list_var.first();
    while ( NIL != csome_list_var)
    {
      index_cyc_test_by_name( ct, cyc_test_name( ct ) );
      csome_list_var = csome_list_var.rest();
      ct = csome_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
  public static SubLObject cyc_test_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_cyc_test( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
  public static SubLObject cyc_test_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $cyc_test_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
  public static SubLObject ct_file(final SubLObject v_object)
  {
    assert NIL != cyc_test_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
  public static SubLObject ct_guts(final SubLObject v_object)
  {
    assert NIL != cyc_test_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
  public static SubLObject _csetf_ct_file(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cyc_test_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
  public static SubLObject _csetf_ct_guts(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cyc_test_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
  public static SubLObject make_cyc_test(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $cyc_test_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw42$FILE ) )
      {
        _csetf_ct_file( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$GUTS ) )
      {
        _csetf_ct_guts( v_new, current_value );
      }
      else
      {
        Errors.error( $str44$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
  public static SubLObject visit_defstruct_cyc_test(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw45$BEGIN, $sym46$MAKE_CYC_TEST, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw42$FILE, ct_file( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw43$GUTS, ct_guts( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$END, $sym46$MAKE_CYC_TEST, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
  public static SubLObject visit_defstruct_object_cyc_test_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_cyc_test( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9932L)
  public static SubLObject print_cyc_test(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject file = ct_file( v_object );
    if( NIL != file )
    {
      PrintLow.format( stream, $str50$__CYC_TEST__a__a_, Strings.string_upcase( file, UNPROVIDED, UNPROVIDED ), ct_guts( v_object ) );
    }
    else
    {
      PrintLow.format( stream, $str51$__CYC_TEST__a_, ct_guts( v_object ) );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 10197L)
  public static SubLObject new_cyc_test(final SubLObject file, final SubLObject guts)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != file && !assertionsDisabledInClass && NIL == Types.stringp( file ) )
    {
      throw new AssertionError( file );
    }
    if( NIL != cyc_testing_initialization.cyc_tests_initializedP() )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == Functions.funcall( $sym53$CYC_TEST_GUTS_P, guts ) )
      {
        Errors.error( $str54$_s_is_not_a_CYC_TEST_GUTS_P, guts );
      }
    }
    else
    {
      assert NIL != generic_testing.generic_test_case_table_p( guts ) : guts;
    }
    final SubLObject ct = make_cyc_test( UNPROVIDED );
    _csetf_ct_file( ct, file );
    _csetf_ct_guts( ct, guts );
    final SubLObject name = ( NIL != cyc_testing_initialization.cyc_tests_initializedP() ) ? Functions.funcall( $sym56$CYC_TEST_NAME, ct ) : generic_testing.generic_test_case_table_name( guts );
    final SubLObject existing_ct = find_cyc_test_by_exact_name( name );
    if( NIL != existing_ct )
    {
      $cyc_tests$.setDynamicValue( Sequences.delete( existing_ct, $cyc_tests$.getDynamicValue( thread ), Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      unindex_cyc_test_by_name( existing_ct, name );
    }
    final SubLObject new_cons = ConsesLow.cons( ct, NIL );
    final SubLObject list = $cyc_tests$.getDynamicValue( thread );
    if( NIL != list )
    {
      subl_macros.rplacd_last( list, new_cons );
    }
    else
    {
      $cyc_tests$.setDynamicValue( new_cons, thread );
    }
    index_cyc_test_by_name( ct, name );
    return ct;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11104L)
  public static SubLObject undeclare_cyc_test(final SubLObject test_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject existing_ct = find_cyc_test_by_exact_name( test_name );
    if( NIL != existing_ct )
    {
      $cyc_tests$.setDynamicValue( Sequences.delete( existing_ct, $cyc_tests$.getDynamicValue( thread ), Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      unindex_cyc_test_by_name( existing_ct, test_name );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11471L)
  public static SubLObject cyc_test_file(final SubLObject ct)
  {
    return ct_file( ct );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11540L)
  public static SubLObject cyc_test_guts(final SubLObject ct)
  {
    return ct_guts( ct );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11600L)
  public static SubLObject cyc_test_type(final SubLObject ct)
  {
    final SubLObject type = cyc_test_type_permissive( ct );
    if( NIL != type )
    {
      return type;
    }
    return Errors.error( $str57$Cyc_test_of_unexpected_type___s, ct );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11781L)
  public static SubLObject cyc_test_guts_p(final SubLObject v_object)
  {
    return list_utilities.sublisp_boolean( cyc_test_guts_type( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11870L)
  public static SubLObject cyc_test_type_permissive(final SubLObject ct)
  {
    final SubLObject guts = cyc_test_guts( ct );
    return cyc_test_guts_type( guts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11991L)
  public static SubLObject cyc_test_guts_type(final SubLObject guts)
  {
    if( NIL != generic_testing.generic_test_case_table_p( guts ) )
    {
      return $kw58$TCT;
    }
    if( NIL != inference_unit_tests.inference_unit_test_p( guts ) )
    {
      return $kw59$IUT;
    }
    if( NIL != removal_module_tests.removal_module_test_p( guts ) )
    {
      return $kw60$RMT;
    }
    if( NIL != removal_module_cost_tests.removal_module_cost_test_p( guts ) )
    {
      return $kw61$RMCT;
    }
    if( NIL != transformation_module_tests.transformation_module_test_p( guts ) )
    {
      return $kw62$TMT;
    }
    if( NIL != evaluatable_relation_tests.evaluatable_relation_test_p( guts ) )
    {
      return $kw63$ERT;
    }
    if( NIL != inference_testing.inference_test_p( guts ) )
    {
      return $kw64$IT;
    }
    if( NIL != kct_utils.kct_test_spec_permissive_p( guts ) )
    {
      return $kw65$KCT;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 12460L)
  public static SubLObject cyc_test_name(final SubLObject ct)
  {
    final SubLObject guts = cyc_test_guts( ct );
    final SubLObject pcase_var = cyc_test_type( ct );
    if( pcase_var.eql( $kw59$IUT ) )
    {
      return inference_unit_tests.inference_unit_test_name( guts );
    }
    if( pcase_var.eql( $kw64$IT ) )
    {
      return guts;
    }
    if( pcase_var.eql( $kw60$RMT ) )
    {
      return removal_module_tests.removal_module_test_name( guts );
    }
    if( pcase_var.eql( $kw62$TMT ) )
    {
      return transformation_module_tests.transformation_module_test_name( guts );
    }
    if( pcase_var.eql( $kw61$RMCT ) )
    {
      return removal_module_cost_tests.removal_module_cost_test_name( guts );
    }
    if( pcase_var.eql( $kw63$ERT ) )
    {
      return evaluatable_relation_tests.evaluatable_relation_test_name( guts );
    }
    if( pcase_var.eql( $kw58$TCT ) )
    {
      return generic_testing.generic_test_case_table_name( guts );
    }
    if( pcase_var.eql( $kw65$KCT ) )
    {
      return kct_cyc_testing.kct_test_spec_name( guts );
    }
    return Errors.error( $str57$Cyc_test_of_unexpected_type___s, guts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 13093L)
  public static SubLObject cyc_test_id(final SubLObject ct)
  {
    final SubLObject guts = cyc_test_guts( ct );
    final SubLObject pcase_var = cyc_test_type( ct );
    if( pcase_var.eql( $kw59$IUT ) )
    {
      return NIL;
    }
    if( pcase_var.eql( $kw64$IT ) )
    {
      return NIL;
    }
    if( pcase_var.eql( $kw60$RMT ) )
    {
      return removal_module_tests.removal_module_test_id( guts );
    }
    if( pcase_var.eql( $kw62$TMT ) )
    {
      return transformation_module_tests.transformation_module_test_id( guts );
    }
    if( pcase_var.eql( $kw61$RMCT ) )
    {
      return removal_module_cost_tests.removal_module_cost_test_id( guts );
    }
    if( pcase_var.eql( $kw63$ERT ) )
    {
      return evaluatable_relation_tests.evaluatable_relation_test_id( guts );
    }
    if( pcase_var.eql( $kw58$TCT ) )
    {
      return NIL;
    }
    if( pcase_var.eql( $kw65$KCT ) )
    {
      return NIL;
    }
    return Errors.error( $str57$Cyc_test_of_unexpected_type___s, guts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 13633L)
  public static SubLObject cyc_test_kb(final SubLObject ct)
  {
    final SubLObject guts = cyc_test_guts( ct );
    final SubLObject pcase_var = cyc_test_type( ct );
    if( pcase_var.eql( $kw59$IUT ) )
    {
      return inference_unit_tests.inference_unit_test_kb( guts );
    }
    if( pcase_var.eql( $kw64$IT ) )
    {
      return inference_testing.inference_test_kb( guts );
    }
    if( pcase_var.eql( $kw60$RMT ) )
    {
      return removal_module_tests.removal_module_test_kb( guts );
    }
    if( pcase_var.eql( $kw62$TMT ) )
    {
      return transformation_module_tests.transformation_module_test_kb( guts );
    }
    if( pcase_var.eql( $kw61$RMCT ) )
    {
      return removal_module_cost_tests.removal_module_cost_test_kb( guts );
    }
    if( pcase_var.eql( $kw63$ERT ) )
    {
      return evaluatable_relation_tests.evaluatable_relation_test_kb( guts );
    }
    if( pcase_var.eql( $kw58$TCT ) )
    {
      return generic_testing.generic_test_case_table_kb( guts );
    }
    if( pcase_var.eql( $kw65$KCT ) )
    {
      return kct_cyc_testing.kct_test_spec_kb( guts );
    }
    return Errors.error( $str57$Cyc_test_of_unexpected_type___s, guts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 14217L)
  public static SubLObject cyc_test_owner(final SubLObject ct)
  {
    final SubLObject guts = cyc_test_guts( ct );
    final SubLObject pcase_var = cyc_test_type( ct );
    if( pcase_var.eql( $kw59$IUT ) )
    {
      return inference_unit_tests.inference_unit_test_owner( guts );
    }
    if( pcase_var.eql( $kw64$IT ) )
    {
      return inference_testing.inference_test_owner( guts );
    }
    if( pcase_var.eql( $kw60$RMT ) )
    {
      return removal_module_tests.removal_module_test_owner( guts );
    }
    if( pcase_var.eql( $kw62$TMT ) )
    {
      return transformation_module_tests.transformation_module_test_owner( guts );
    }
    if( pcase_var.eql( $kw61$RMCT ) )
    {
      return removal_module_cost_tests.removal_module_cost_test_owner( guts );
    }
    if( pcase_var.eql( $kw63$ERT ) )
    {
      return evaluatable_relation_tests.evaluatable_relation_test_owner( guts );
    }
    if( pcase_var.eql( $kw58$TCT ) )
    {
      return generic_testing.generic_test_case_table_owner( guts );
    }
    if( pcase_var.eql( $kw65$KCT ) )
    {
      return kct_cyc_testing.kct_test_spec_owner( guts );
    }
    return Errors.error( $str57$Cyc_test_of_unexpected_type___s, guts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 14828L)
  public static SubLObject cyc_test_workingP(final SubLObject ct)
  {
    final SubLObject guts = cyc_test_guts( ct );
    final SubLObject pcase_var = cyc_test_type( ct );
    if( pcase_var.eql( $kw59$IUT ) )
    {
      return inference_unit_tests.inference_unit_test_workingP( guts );
    }
    if( pcase_var.eql( $kw64$IT ) )
    {
      return inference_testing.inference_test_workingP( guts );
    }
    if( pcase_var.eql( $kw60$RMT ) )
    {
      return removal_module_tests.removal_module_test_workingP( guts );
    }
    if( pcase_var.eql( $kw62$TMT ) )
    {
      return transformation_module_tests.transformation_module_test_workingP( guts );
    }
    if( pcase_var.eql( $kw61$RMCT ) )
    {
      return removal_module_cost_tests.removal_module_cost_test_workingP( guts );
    }
    if( pcase_var.eql( $kw63$ERT ) )
    {
      return evaluatable_relation_tests.evaluatable_relation_test_workingP( guts );
    }
    if( pcase_var.eql( $kw58$TCT ) )
    {
      return generic_testing.generic_test_case_table_workingP( guts );
    }
    if( pcase_var.eql( $kw65$KCT ) )
    {
      return kct_cyc_testing.kct_test_spec_workingP( guts );
    }
    return Errors.error( $str57$Cyc_test_of_unexpected_type___s, guts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 15466L)
  public static SubLObject cyc_test_comment(final SubLObject ct)
  {
    final SubLObject guts = cyc_test_guts( ct );
    final SubLObject pcase_var = cyc_test_type( ct );
    if( pcase_var.eql( $kw59$IUT ) )
    {
      return inference_unit_tests.inference_unit_test_comment( guts );
    }
    if( pcase_var.eql( $kw64$IT ) )
    {
      return inference_testing.inference_test_comment( guts );
    }
    if( pcase_var.eql( $kw60$RMT ) )
    {
      return removal_module_tests.removal_module_test_comment( guts );
    }
    if( pcase_var.eql( $kw62$TMT ) )
    {
      return transformation_module_tests.transformation_module_test_comment( guts );
    }
    if( pcase_var.eql( $kw61$RMCT ) )
    {
      return removal_module_cost_tests.removal_module_cost_test_comment( guts );
    }
    if( pcase_var.eql( $kw63$ERT ) )
    {
      return evaluatable_relation_tests.evaluatable_relation_test_comment( guts );
    }
    if( pcase_var.eql( $kw58$TCT ) )
    {
      return generic_testing.generic_test_case_table_comment( guts );
    }
    if( pcase_var.eql( $kw65$KCT ) )
    {
      return kct_cyc_testing.kct_test_spec_comment( guts );
    }
    return Errors.error( $str57$Cyc_test_of_unexpected_type___s, guts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 16095L)
  public static SubLObject cyc_test_project(final SubLObject ct)
  {
    final SubLObject guts = cyc_test_guts( ct );
    final SubLObject pcase_var = cyc_test_type( ct );
    if( pcase_var.eql( $kw59$IUT ) )
    {
      return NIL;
    }
    if( pcase_var.eql( $kw64$IT ) )
    {
      return NIL;
    }
    if( pcase_var.eql( $kw60$RMT ) )
    {
      return NIL;
    }
    if( pcase_var.eql( $kw62$TMT ) )
    {
      return NIL;
    }
    if( pcase_var.eql( $kw61$RMCT ) )
    {
      return NIL;
    }
    if( pcase_var.eql( $kw63$ERT ) )
    {
      return NIL;
    }
    if( pcase_var.eql( $kw58$TCT ) )
    {
      return NIL;
    }
    if( pcase_var.eql( $kw65$KCT ) )
    {
      return kct_cyc_testing.kct_test_spec_project( guts );
    }
    return Errors.error( $str57$Cyc_test_of_unexpected_type___s, guts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 16490L)
  public static SubLObject cyc_test_names_mentioning_invalid_constants(SubLObject tests)
  {
    if( tests == UNPROVIDED )
    {
      tests = cyc_tests();
    }
    SubLObject all_invalid_test_names = NIL;
    SubLObject cdolist_list_var = tests;
    SubLObject test = NIL;
    test = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$2;
      final SubLObject invalid_test_names = cdolist_list_var_$2 = cyc_test_invalid_constant_test_names( test );
      SubLObject invalid_test_name = NIL;
      invalid_test_name = cdolist_list_var_$2.first();
      while ( NIL != cdolist_list_var_$2)
      {
        all_invalid_test_names = ConsesLow.cons( invalid_test_name, all_invalid_test_names );
        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
        invalid_test_name = cdolist_list_var_$2.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      test = cdolist_list_var.first();
    }
    return Sequences.nreverse( all_invalid_test_names );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 17014L)
  public static SubLObject cyc_test_invalid_constant_test_names(final SubLObject ct)
  {
    final SubLObject guts = cyc_test_guts( ct );
    final SubLObject pcase_var = cyc_test_type( ct );
    if( pcase_var.eql( $kw59$IUT ) )
    {
      if( NIL != inference_unit_tests.inference_unit_test_mentions_invalid_constantP( guts ) )
      {
        return ConsesLow.list( cyc_test_name( ct ) );
      }
    }
    else if( pcase_var.eql( $kw64$IT ) )
    {
      if( NIL != inference_testing.inference_test_mentions_invalid_constantP( guts ) )
      {
        return ConsesLow.list( cyc_test_name( ct ) );
      }
    }
    else if( pcase_var.eql( $kw60$RMT ) )
    {
      if( NIL != removal_module_tests.removal_module_test_mentions_invalid_constantP( guts ) )
      {
        return ConsesLow.list( cyc_test_name( ct ) );
      }
    }
    else if( pcase_var.eql( $kw62$TMT ) )
    {
      if( NIL != transformation_module_tests.transformation_module_test_mentions_invalid_constantP( guts ) )
      {
        return ConsesLow.list( cyc_test_name( ct ) );
      }
    }
    else if( pcase_var.eql( $kw61$RMCT ) )
    {
      if( NIL != removal_module_cost_tests.removal_module_cost_test_mentions_invalid_constantP( guts ) )
      {
        return ConsesLow.list( cyc_test_name( ct ) );
      }
    }
    else if( pcase_var.eql( $kw63$ERT ) )
    {
      if( NIL != evaluatable_relation_tests.evaluatable_relation_test_mentions_invalid_constantP( guts ) )
      {
        return ConsesLow.list( cyc_test_name( ct ) );
      }
    }
    else
    {
      if( pcase_var.eql( $kw58$TCT ) )
      {
        return generic_testing.generic_test_case_table_tuples_mentioning_some_invalid_constant( guts );
      }
      if( !pcase_var.eql( $kw65$KCT ) )
      {
        return Errors.error( $str57$Cyc_test_of_unexpected_type___s, guts );
      }
      if( NIL != kct_cyc_testing.kct_test_spec_mentions_invalid_constantP( guts ) )
      {
        return ConsesLow.list( cyc_test_name( ct ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 18124L)
  public static SubLObject cyc_tests_mentioning_invalid_constants(SubLObject tests)
  {
    if( tests == UNPROVIDED )
    {
      tests = cyc_tests();
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = tests;
    SubLObject ct = NIL;
    ct = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != cyc_test_workingP( ct ) && NIL != cyc_test_invalidP( ct ) )
      {
        result = ConsesLow.cons( ct, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ct = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 18369L)
  public static SubLObject cyc_test_invalidP(final SubLObject ct)
  {
    return list_utilities.sublisp_boolean( cyc_test_invalid_constants( ct ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 18460L)
  public static SubLObject cyc_test_invalid_constants(final SubLObject ct)
  {
    final SubLObject guts = cyc_test_guts( ct );
    final SubLObject pcase_var = cyc_test_type( ct );
    if( pcase_var.eql( $kw59$IUT ) )
    {
      return inference_unit_tests.inference_unit_test_invalid_constants( guts );
    }
    if( pcase_var.eql( $kw64$IT ) )
    {
      return inference_testing.inference_test_invalid_constants( guts );
    }
    if( pcase_var.eql( $kw60$RMT ) )
    {
      return removal_module_tests.removal_module_test_invalid_constants( guts );
    }
    if( pcase_var.eql( $kw62$TMT ) )
    {
      return transformation_module_tests.transformation_module_test_invalid_constants( guts );
    }
    if( pcase_var.eql( $kw61$RMCT ) )
    {
      return removal_module_cost_tests.removal_module_cost_test_invalid_constants( guts );
    }
    if( pcase_var.eql( $kw63$ERT ) )
    {
      return evaluatable_relation_tests.evaluatable_relation_test_invalid_constants( guts );
    }
    if( pcase_var.eql( $kw58$TCT ) )
    {
      return generic_testing.generic_test_case_table_tuples_invalid_constants( guts );
    }
    if( pcase_var.eql( $kw65$KCT ) )
    {
      return kct_cyc_testing.kct_test_spec_invalid_constants( guts );
    }
    return Errors.error( $str57$Cyc_test_of_unexpected_type___s, guts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 19641L)
  public static SubLObject print_post_build_test_summary(final SubLObject stream, final SubLObject result, final SubLObject type, final SubLObject name, final SubLObject time, final SubLObject owner)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( result == $kw66$NOT_RUN )
    {
      return NIL;
    }
    if( NIL != $print_post_build_test_summary_timestampP$.getDynamicValue( thread ) )
    {
      return format_nil.force_format( stream, $str67$___A__S__S__S____3f___OWNER__S__, numeric_date_utilities.timestring_ms( UNPROVIDED, UNPROVIDED ), result, type, name, time, owner, UNPROVIDED, UNPROVIDED );
    }
    return format_nil.force_format( stream, $str68$___S__S__S____3f___OWNER__S__, result, type, name, time, owner, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 20111L)
  public static SubLObject tiny_kb_cyc_test_p(final SubLObject v_object)
  {
    if( NIL != cyc_test_p( v_object ) )
    {
      final SubLObject kb = cyc_test_kb( v_object );
      return makeBoolean( $kw69$TINY == kb || $kw70$BOTH == kb );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 20469L)
  public static SubLObject full_kb_cyc_test_p(final SubLObject v_object)
  {
    if( NIL != cyc_test_p( v_object ) )
    {
      final SubLObject kb = cyc_test_kb( v_object );
      return makeBoolean( $kw71$FULL == kb || $kw70$BOTH == kb );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 20813L)
  public static SubLObject non_working_cyc_tests(SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = NIL;
    }
    if( NIL != type && !assertionsDisabledInClass && NIL == cyc_test_type_spec_p( type ) )
    {
      throw new AssertionError( type );
    }
    final SubLObject all_tests = cyc_tests();
    SubLObject all_non_working_tests = Sequences.remove_if( Symbols.symbol_function( $sym73$CYC_TEST_WORKING_ ), all_tests, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != type )
    {
      all_non_working_tests = Sequences.remove( type, all_non_working_tests, Symbols.symbol_function( $sym74$NOT_EQ ), Symbols.symbol_function( $sym75$CYC_TEST_TYPE ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return all_non_working_tests;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 21338L)
  public static SubLObject find_cyc_test_by_exact_name(final SubLObject name)
  {
    return Hashtables.gethash( name, $cyc_test_by_name$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 21478L)
  public static SubLObject find_cyc_test(final SubLObject name)
  {
    return find_cyc_tests( name ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 21554L)
  public static SubLObject find_cyc_tests(final SubLObject name)
  {
    SubLObject tests = NIL;
    SubLObject cdolist_list_var;
    final SubLObject dwimmed_names = cdolist_list_var = ConsesLow.cons( name, generic_testing.test_cases_of_class( name ) );
    SubLObject dwimmed_name = NIL;
    dwimmed_name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$3 = Hashtables.gethash_without_values( dwimmed_name, $cyc_test_by_dwimmed_name$.getGlobalValue(), UNPROVIDED );
      SubLObject test = NIL;
      test = cdolist_list_var_$3.first();
      while ( NIL != cdolist_list_var_$3)
      {
        final SubLObject item_var = test;
        if( NIL == conses_high.member( item_var, tests, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          tests = ConsesLow.cons( item_var, tests );
        }
        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
        test = cdolist_list_var_$3.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      dwimmed_name = cdolist_list_var.first();
    }
    return tests;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 21925L)
  public static SubLObject find_cyc_test_number(final SubLObject name, final SubLObject test_number)
  {
    return find_cyc_tests_in_range( name, test_number, test_number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 22048L)
  public static SubLObject find_cyc_tests_in_range(final SubLObject name, final SubLObject min_number, final SubLObject max_number)
  {
    SubLObject tests = NIL;
    SubLObject cdolist_list_var;
    final SubLObject dwimmed_names = cdolist_list_var = ConsesLow.cons( name, generic_testing.test_cases_of_class( name ) );
    SubLObject dwimmed_name = NIL;
    dwimmed_name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$4 = Hashtables.gethash_without_values( dwimmed_name, $cyc_test_by_dwimmed_name$.getGlobalValue(), UNPROVIDED );
      SubLObject test = NIL;
      test = cdolist_list_var_$4.first();
      while ( NIL != cdolist_list_var_$4)
      {
        final SubLObject test_id = cyc_test_id( test );
        if( NIL != test_id )
        {
          if( test_id.numGE( min_number ) && test_id.numLE( max_number ) )
          {
            final SubLObject item_var = test;
            if( NIL == conses_high.member( item_var, tests, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              tests = ConsesLow.cons( item_var, tests );
            }
          }
        }
        else
        {
          final SubLObject item_var = test;
          if( NIL == conses_high.member( item_var, tests, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            tests = ConsesLow.cons( item_var, tests );
          }
        }
        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
        test = cdolist_list_var_$4.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      dwimmed_name = cdolist_list_var.first();
    }
    return tests;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 22736L)
  public static SubLObject find_cyc_tests_by_name(final SubLObject names)
  {
    return Sequences.delete( NIL, Mapping.mapcar( Symbols.symbol_function( $sym76$FIND_CYC_TEST ), names ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 22867L)
  public static SubLObject find_cyc_test_filename(final SubLObject name)
  {
    final SubLObject cyc_test = find_cyc_test( name );
    if( NIL != cyc_test )
    {
      return cyc_test_file( cyc_test );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 23317L)
  public static SubLObject cfasl_output_object_cyc_test_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_wide_output_cyc_test( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 23433L)
  public static SubLObject cfasl_wide_output_cyc_test(final SubLObject cyc_test, final SubLObject stream)
  {
    cfasl.cfasl_output_wide_opcode( $cfasl_wide_opcode_cyc_test$.getGlobalValue(), stream );
    return cfasl_output_cyc_test_internal( cyc_test, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 23619L)
  public static SubLObject cfasl_output_cyc_test_internal(final SubLObject cyc_test, final SubLObject stream)
  {
    cfasl.cfasl_output( cyc_test_file( cyc_test ), stream );
    cfasl.cfasl_output( cyc_test_guts( cyc_test ), stream );
    return cyc_test;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 23801L)
  public static SubLObject cfasl_input_cyc_test(final SubLObject stream)
  {
    final SubLObject file = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject guts = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    return new_cyc_test( file, guts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 23961L)
  public static SubLObject new_cyc_test_run(final SubLObject type, final SubLObject name, final SubLObject result, final SubLObject time)
  {
    assert NIL != cyc_test_type_p( type ) : type;
    assert NIL != cyc_test_result_p( result ) : result;
    if( NIL != time && !assertionsDisabledInClass && NIL == number_utilities.non_negative_number_p( time ) )
    {
      throw new AssertionError( time );
    }
    return ConsesLow.list( type, name, result, time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 24268L)
  public static SubLObject cyc_test_run_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && NIL != list_utilities.lengthE( v_object, FOUR_INTEGER, UNPROVIDED ) && NIL != cyc_test_type_p( v_object.first() ) && NIL != cyc_test_result_p( conses_high.third(
        v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 24459L)
  public static SubLObject cyc_test_run_type(final SubLObject test_run)
  {
    assert NIL != cyc_test_run_p( test_run ) : test_run;
    return test_run.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 24581L)
  public static SubLObject cyc_test_run_name(final SubLObject test_run)
  {
    assert NIL != cyc_test_run_p( test_run ) : test_run;
    return conses_high.second( test_run );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 24692L)
  public static SubLObject cyc_test_run_result(final SubLObject test_run)
  {
    assert NIL != cyc_test_run_p( test_run ) : test_run;
    return conses_high.third( test_run );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 24804L)
  public static SubLObject cyc_test_run_time(final SubLObject test_run)
  {
    assert NIL != cyc_test_run_p( test_run ) : test_run;
    return conses_high.fourth( test_run );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 24915L)
  public static SubLObject cyc_test_run_cyc_test(final SubLObject test_run)
  {
    SubLObject name = cyc_test_run_name( test_run );
    if( $kw64$IT == cyc_test_run_type( test_run ) && NIL == list_utilities.member_eqP( cyc_test_run_result( test_run ), $list83 ) )
    {
      name = name.first();
    }
    if( $kw58$TCT == cyc_test_run_type( test_run ) && cyc_test_run_result( test_run ) != $kw66$NOT_RUN )
    {
      name = name.first();
    }
    return find_cyc_test_by_exact_name( name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 25648L)
  public static SubLObject cyc_test_runs_overall_result(final SubLObject test_runs)
  {
    SubLObject overall_result = $kw66$NOT_RUN;
    SubLObject cdolist_list_var = test_runs;
    SubLObject test_run = NIL;
    test_run = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject test_result = cyc_test_run_result( test_run );
      overall_result = cyc_test_result_update( overall_result, test_result );
      cdolist_list_var = cdolist_list_var.rest();
      test_run = cdolist_list_var.first();
    }
    return overall_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 25953L)
  public static SubLObject cyc_test_result_update(final SubLObject overall_result, final SubLObject test_result)
  {
    if( NIL != cyc_test_ignore_result_p( overall_result ) )
    {
      return test_result;
    }
    if( NIL != cyc_test_failure_result_p( overall_result ) )
    {
      return $kw84$FAILURE;
    }
    if( NIL == cyc_test_success_result_p( overall_result ) )
    {
      return NIL;
    }
    if( NIL != cyc_test_failure_result_p( test_result ) )
    {
      return $kw84$FAILURE;
    }
    return $kw85$SUCCESS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 26305L)
  public static SubLObject cyc_test_runs_total_time(final SubLObject test_runs)
  {
    SubLObject total_time = ZERO_INTEGER;
    SubLObject cdolist_list_var = test_runs;
    SubLObject test_run = NIL;
    test_run = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject test_time = cyc_test_run_time( test_run );
      if( NIL != test_time )
      {
        total_time = Numbers.add( total_time, test_time );
      }
      cdolist_list_var = cdolist_list_var.rest();
      test_run = cdolist_list_var.first();
    }
    return total_time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 26547L)
  public static SubLObject failing_cyc_test_run_p(final SubLObject test_run)
  {
    final SubLObject result = cyc_test_run_result( test_run );
    return cyc_test_failure_result_p( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 26694L)
  public static SubLObject succeeding_cyc_test_run_p(final SubLObject test_run)
  {
    final SubLObject result = cyc_test_run_result( test_run );
    return cyc_test_success_result_p( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 26844L)
  public static SubLObject ignored_cyc_test_run_p(final SubLObject test_run)
  {
    final SubLObject result = cyc_test_run_result( test_run );
    return cyc_test_ignore_result_p( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 26990L)
  public static SubLObject cyc_test_run_owner(final SubLObject test_run)
  {
    final SubLObject ct = cyc_test_run_cyc_test( test_run );
    if( NIL != ct )
    {
      return cyc_test_owner( ct );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 27133L)
  public static SubLObject cyc_test_run_project(final SubLObject test_run)
  {
    final SubLObject ct = cyc_test_run_cyc_test( test_run );
    if( NIL != ct )
    {
      return cyc_test_project( ct );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 27280L)
  public static SubLObject print_cyc_test_run_summary(final SubLObject test_run, final SubLObject stream, final SubLObject output_format, final SubLObject verbosity)
  {
    if( $kw86$SILENT != verbosity )
    {
      final SubLObject name = cyc_test_run_name( test_run );
      final SubLObject type = cyc_test_run_type( test_run );
      final SubLObject result = cyc_test_run_result( test_run );
      final SubLObject owner = cyc_test_run_owner( test_run );
      final SubLObject time = cyc_test_run_time( test_run );
      if( output_format.eql( $kw0$STANDARD ) )
      {
        PrintLow.format( stream, $str87$___S__S_____S___S_, new SubLObject[] { type, name, result, time
        } );
      }
      else if( output_format.eql( $kw88$POST_BUILD ) )
      {
        print_post_build_test_summary( stream, result, type, name, time, owner );
      }
      else
      {
        PrintLow.format( stream, $str89$Unknown_output_format__A, output_format );
      }
      streams_high.force_output( stream );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 27932L)
  public static SubLObject cyc_test_run_summary(final SubLObject test_run, final SubLObject output_format, final SubLObject verbosity)
  {
    if( $kw86$SILENT == verbosity )
    {
      return NIL;
    }
    final SubLObject name = cyc_test_run_name( test_run );
    final SubLObject type = cyc_test_run_type( test_run );
    final SubLObject result = cyc_test_run_result( test_run );
    final SubLObject owner = cyc_test_run_owner( test_run );
    final SubLObject time = cyc_test_run_time( test_run );
    if( output_format.eql( $kw0$STANDARD ) )
    {
      return PrintLow.format( NIL, $str87$___S__S_____S___S_, new SubLObject[] { type, name, result, time
      } );
    }
    if( output_format.eql( $kw88$POST_BUILD ) )
    {
      return print_post_build_test_summary( NIL, result, type, name, time, owner );
    }
    if( output_format.eql( $kw90$WITH_OWNER ) )
    {
      return Sequences.cconcatenate( format_nil.format_nil_s_no_copy( result ), new SubLObject[] { $str91$_, format_nil.format_nil_s_no_copy( time ), $str91$_, format_nil.format_nil_s_no_copy( type ), $str91$_,
        format_nil.format_nil_s_no_copy( name ), $str91$_, format_nil.format_nil_s_no_copy( owner ), format_nil.$format_nil_percent$.getGlobalValue()
      } );
    }
    return Sequences.cconcatenate( $str92$Unknown_output_format_, format_nil.format_nil_a_no_copy( output_format ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 28827L)
  public static SubLObject cyc_test_files()
  {
    return $cyc_test_files$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 28890L)
  public static SubLObject do_cyc_test_files(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject cyc_test_file = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list94 );
    cyc_test_file = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym95$CDOLIST, reader.bq_cons( cyc_test_file, $list96 ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list94 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29020L)
  public static SubLObject progress_do_cyc_test_files(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list97 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject cyc_test_file = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list97 );
    cyc_test_file = current.first();
    current = current.rest();
    final SubLObject message = current.isCons() ? current.first() : $str98$Iterating_over_all_test_files;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list97 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym20$PROGRESS_CDOLIST, ConsesLow.list( cyc_test_file, $list99, message ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list97 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29231L)
  public static SubLObject cyc_test_file_count()
  {
    return Sequences.length( $cyc_test_files$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
  public static SubLObject cyc_test_file_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_cyc_test_file( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
  public static SubLObject cyc_test_file_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $cyc_test_file_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
  public static SubLObject ctf_filename(final SubLObject v_object)
  {
    assert NIL != cyc_test_file_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
  public static SubLObject ctf_kb(final SubLObject v_object)
  {
    assert NIL != cyc_test_file_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
  public static SubLObject _csetf_ctf_filename(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cyc_test_file_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
  public static SubLObject _csetf_ctf_kb(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cyc_test_file_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
  public static SubLObject make_cyc_test_file(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $cyc_test_file_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw113$FILENAME ) )
      {
        _csetf_ctf_filename( v_new, current_value );
      }
      else if( pcase_var.eql( $kw114$KB ) )
      {
        _csetf_ctf_kb( v_new, current_value );
      }
      else
      {
        Errors.error( $str44$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
  public static SubLObject visit_defstruct_cyc_test_file(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw45$BEGIN, $sym115$MAKE_CYC_TEST_FILE, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw113$FILENAME, ctf_filename( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw114$KB, ctf_kb( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$END, $sym115$MAKE_CYC_TEST_FILE, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
  public static SubLObject visit_defstruct_object_cyc_test_file_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_cyc_test_file( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29613L)
  public static SubLObject print_cyc_test_file(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str117$__CTF__a_, ctf_filename( v_object ) );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29757L)
  public static SubLObject new_cyc_test_file(final SubLObject filename, final SubLObject kb)
  {
    assert NIL != Types.stringp( filename ) : filename;
    assert NIL != cyc_test_kb_p( kb ) : kb;
    final SubLObject cyc_test_file = make_cyc_test_file( UNPROVIDED );
    _csetf_ctf_filename( cyc_test_file, filename );
    _csetf_ctf_kb( cyc_test_file, kb );
    return cyc_test_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 30031L)
  public static SubLObject cyc_test_file_filename(final SubLObject cyc_test_file)
  {
    return ctf_filename( cyc_test_file );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 30127L)
  public static SubLObject find_cyc_test_file(final SubLObject filename)
  {
    SubLObject cdolist_list_var = $cyc_test_files$.getGlobalValue();
    SubLObject cyc_test_file = NIL;
    cyc_test_file = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( filename.equal( ctf_filename( cyc_test_file ) ) )
      {
        return cyc_test_file;
      }
      cdolist_list_var = cdolist_list_var.rest();
      cyc_test_file = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 30706L)
  public static SubLObject most_recent_cyc_test_runs()
  {
    return $most_recent_cyc_test_runs$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 30809L)
  public static SubLObject most_recent_failing_cyc_test_runs()
  {
    return list_utilities.remove_if_not( $sym121$FAILING_CYC_TEST_RUN_P, most_recent_cyc_test_runs(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 30939L)
  public static SubLObject most_recent_failing_cyc_tests()
  {
    return Mapping.mapcar( $sym122$CYC_TEST_RUN_CYC_TEST, most_recent_failing_cyc_test_runs() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 31065L)
  public static SubLObject most_recent_cyc_test_file_load_failures()
  {
    return $most_recent_cyc_test_file_load_failures$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 31175L)
  public static SubLObject run_all_cyc_tests(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject path = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list123 );
    path = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list123 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list123 );
      if( NIL == conses_high.member( current_$5, $list124, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list123 );
    }
    final SubLObject stream_tail = cdestructuring_bind.property_list_member( $kw125$STREAM, current );
    final SubLObject stream = ( NIL != stream_tail ) ? conses_high.cadr( stream_tail ) : $sym126$_STANDARD_OUTPUT_;
    final SubLObject verbosity_tail = cdestructuring_bind.property_list_member( $kw127$VERBOSITY, current );
    final SubLObject verbosity = ( NIL != verbosity_tail ) ? conses_high.cadr( verbosity_tail ) : $kw128$TERSE;
    final SubLObject stop_at_first_failureP_tail = cdestructuring_bind.property_list_member( $kw129$STOP_AT_FIRST_FAILURE_, current );
    final SubLObject stop_at_first_failureP = ( NIL != stop_at_first_failureP_tail ) ? conses_high.cadr( stop_at_first_failureP_tail ) : NIL;
    final SubLObject output_format_tail = cdestructuring_bind.property_list_member( $kw130$OUTPUT_FORMAT, current );
    final SubLObject output_format = ( NIL != output_format_tail ) ? conses_high.cadr( output_format_tail ) : $kw0$STANDARD;
    final SubLObject run_tiny_kb_tests_in_full_kbP_tail = cdestructuring_bind.property_list_member( $kw131$RUN_TINY_KB_TESTS_IN_FULL_KB_, current );
    final SubLObject run_tiny_kb_tests_in_full_kbP = ( NIL != run_tiny_kb_tests_in_full_kbP_tail ) ? conses_high.cadr( run_tiny_kb_tests_in_full_kbP_tail ) : $sym132$_RUN_TINY_KB_TESTS_IN_FULL_KB__;
    final SubLObject run_test_case_tablesP_tail = cdestructuring_bind.property_list_member( $kw133$RUN_TEST_CASE_TABLES_, current );
    final SubLObject run_test_case_tablesP = ( NIL != run_test_case_tablesP_tail ) ? conses_high.cadr( run_test_case_tablesP_tail ) : T;
    final SubLObject return_test_runsP_tail = cdestructuring_bind.property_list_member( $kw134$RETURN_TEST_RUNS_, current );
    final SubLObject return_test_runsP = ( NIL != return_test_runsP_tail ) ? conses_high.cadr( return_test_runsP_tail ) : NIL;
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw135$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : $kw10$ALL;
    final SubLObject run_non_working_tests_tail = cdestructuring_bind.property_list_member( $kw136$RUN_NON_WORKING_TESTS, current );
    final SubLObject run_non_working_tests = ( NIL != run_non_working_tests_tail ) ? conses_high.cadr( run_non_working_tests_tail ) : NIL;
    final SubLObject progress_file_tail = cdestructuring_bind.property_list_member( $kw137$PROGRESS_FILE, current );
    final SubLObject progress_file = ( NIL != progress_file_tail ) ? conses_high.cadr( progress_file_tail ) : NIL;
    final SubLObject rerun_crashing_tests_tail = cdestructuring_bind.property_list_member( $kw138$RERUN_CRASHING_TESTS, current );
    final SubLObject rerun_crashing_tests = ( NIL != rerun_crashing_tests_tail ) ? conses_high.cadr( rerun_crashing_tests_tail ) : NIL;
    return ConsesLow.list( new SubLObject[] { $sym139$RUN_ALL_CYC_TESTS_INT, path, stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, run_test_case_tablesP, return_test_runsP, type,
      run_non_working_tests, progress_file, rerun_crashing_tests
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 33011L)
  public static SubLObject run_all_cyc_tests_int(final SubLObject path, SubLObject stream, SubLObject verbosity, SubLObject stop_at_first_failureP, SubLObject output_format, SubLObject run_tiny_kb_tests_in_full_kbP,
      SubLObject run_test_case_tablesP, SubLObject return_test_runsP, SubLObject type, SubLObject run_non_working_tests, SubLObject progress_file, SubLObject rerun_crashing_tests, SubLObject phase, SubLObject phases)
  {
    if( stream == UNPROVIDED )
    {
      stream = $sym126$_STANDARD_OUTPUT_;
    }
    if( verbosity == UNPROVIDED )
    {
      verbosity = $kw128$TERSE;
    }
    if( stop_at_first_failureP == UNPROVIDED )
    {
      stop_at_first_failureP = NIL;
    }
    if( output_format == UNPROVIDED )
    {
      output_format = $kw0$STANDARD;
    }
    if( run_tiny_kb_tests_in_full_kbP == UNPROVIDED )
    {
      run_tiny_kb_tests_in_full_kbP = $sym132$_RUN_TINY_KB_TESTS_IN_FULL_KB__;
    }
    if( run_test_case_tablesP == UNPROVIDED )
    {
      run_test_case_tablesP = T;
    }
    if( return_test_runsP == UNPROVIDED )
    {
      return_test_runsP = NIL;
    }
    if( type == UNPROVIDED )
    {
      type = $kw10$ALL;
    }
    if( run_non_working_tests == UNPROVIDED )
    {
      run_non_working_tests = NIL;
    }
    if( progress_file == UNPROVIDED )
    {
      progress_file = NIL;
    }
    if( rerun_crashing_tests == UNPROVIDED )
    {
      rerun_crashing_tests = NIL;
    }
    if( phase == UNPROVIDED )
    {
      phase = ZERO_INTEGER;
    }
    if( phases == UNPROVIDED )
    {
      phases = ONE_INTEGER;
    }
    if( NIL != path )
    {
      undeclare_all_cyc_test_files();
      load_all_cyc_tests( path, stream, run_tiny_kb_tests_in_full_kbP, verbosity );
    }
    return run_all_loaded_cyc_tests( stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, run_test_case_tablesP, return_test_runsP, type, run_non_working_tests, progress_file,
        rerun_crashing_tests, cyc_tests(), phase, phases );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 34091L)
  public static SubLObject rerun_failing_cyc_tests(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list140 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list140 );
      if( NIL == conses_high.member( current_$6, $list141, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list140 );
    }
    final SubLObject stream_tail = cdestructuring_bind.property_list_member( $kw125$STREAM, current );
    final SubLObject stream = ( NIL != stream_tail ) ? conses_high.cadr( stream_tail ) : $sym126$_STANDARD_OUTPUT_;
    final SubLObject verbosity_tail = cdestructuring_bind.property_list_member( $kw127$VERBOSITY, current );
    final SubLObject verbosity = ( NIL != verbosity_tail ) ? conses_high.cadr( verbosity_tail ) : $kw142$VERBOSE;
    final SubLObject stop_at_first_failureP_tail = cdestructuring_bind.property_list_member( $kw129$STOP_AT_FIRST_FAILURE_, current );
    final SubLObject stop_at_first_failureP = ( NIL != stop_at_first_failureP_tail ) ? conses_high.cadr( stop_at_first_failureP_tail ) : NIL;
    final SubLObject output_format_tail = cdestructuring_bind.property_list_member( $kw130$OUTPUT_FORMAT, current );
    final SubLObject output_format = ( NIL != output_format_tail ) ? conses_high.cadr( output_format_tail ) : $kw0$STANDARD;
    final SubLObject return_test_runsP_tail = cdestructuring_bind.property_list_member( $kw134$RETURN_TEST_RUNS_, current );
    final SubLObject return_test_runsP = ( NIL != return_test_runsP_tail ) ? conses_high.cadr( return_test_runsP_tail ) : NIL;
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw135$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : $kw10$ALL;
    final SubLObject run_non_working_tests_tail = cdestructuring_bind.property_list_member( $kw136$RUN_NON_WORKING_TESTS, current );
    final SubLObject run_non_working_tests = ( NIL != run_non_working_tests_tail ) ? conses_high.cadr( run_non_working_tests_tail ) : NIL;
    final SubLObject progress_file_tail = cdestructuring_bind.property_list_member( $kw137$PROGRESS_FILE, current );
    final SubLObject progress_file = ( NIL != progress_file_tail ) ? conses_high.cadr( progress_file_tail ) : NIL;
    final SubLObject rerun_crashing_tests_tail = cdestructuring_bind.property_list_member( $kw138$RERUN_CRASHING_TESTS, current );
    final SubLObject rerun_crashing_tests = ( NIL != rerun_crashing_tests_tail ) ? conses_high.cadr( rerun_crashing_tests_tail ) : NIL;
    return ConsesLow.list( new SubLObject[] { $sym143$RUN_ALL_LOADED_CYC_TESTS, stream, verbosity, stop_at_first_failureP, output_format, T, T, return_test_runsP, type, run_non_working_tests, progress_file,
      rerun_crashing_tests, ConsesLow.list( $sym144$QUOTE, most_recent_failing_cyc_tests() )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 34773L)
  public static SubLObject declare_cyc_test_file(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list145 );
    filename = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list145 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list145 );
      if( NIL == conses_high.member( current_$7, $list146, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list145 );
    }
    final SubLObject kb_tail = cdestructuring_bind.property_list_member( $kw114$KB, current );
    final SubLObject kb = ( NIL != kb_tail ) ? conses_high.cadr( kb_tail ) : NIL;
    return ConsesLow.list( $sym147$DECLARE_CYC_TEST_FILE_INT, filename, kb );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 35160L)
  public static SubLObject run_cyc_tests(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject names = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list148 );
    names = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$8 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list148 );
      current_$8 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list148 );
      if( NIL == conses_high.member( current_$8, $list149, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$8 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list148 );
    }
    final SubLObject stream_tail = cdestructuring_bind.property_list_member( $kw125$STREAM, current );
    final SubLObject stream = ( NIL != stream_tail ) ? conses_high.cadr( stream_tail ) : $sym126$_STANDARD_OUTPUT_;
    final SubLObject verbosity_tail = cdestructuring_bind.property_list_member( $kw127$VERBOSITY, current );
    final SubLObject verbosity = ( NIL != verbosity_tail ) ? conses_high.cadr( verbosity_tail ) : $kw142$VERBOSE;
    final SubLObject stop_at_first_failureP_tail = cdestructuring_bind.property_list_member( $kw129$STOP_AT_FIRST_FAILURE_, current );
    final SubLObject stop_at_first_failureP = ( NIL != stop_at_first_failureP_tail ) ? conses_high.cadr( stop_at_first_failureP_tail ) : NIL;
    final SubLObject output_format_tail = cdestructuring_bind.property_list_member( $kw130$OUTPUT_FORMAT, current );
    final SubLObject output_format = ( NIL != output_format_tail ) ? conses_high.cadr( output_format_tail ) : $kw0$STANDARD;
    final SubLObject return_test_runsP_tail = cdestructuring_bind.property_list_member( $kw134$RETURN_TEST_RUNS_, current );
    final SubLObject return_test_runsP = ( NIL != return_test_runsP_tail ) ? conses_high.cadr( return_test_runsP_tail ) : NIL;
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw135$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : $kw10$ALL;
    final SubLObject run_non_working_tests_tail = cdestructuring_bind.property_list_member( $kw136$RUN_NON_WORKING_TESTS, current );
    final SubLObject run_non_working_tests = ( NIL != run_non_working_tests_tail ) ? conses_high.cadr( run_non_working_tests_tail ) : NIL;
    return ConsesLow.list( new SubLObject[] { $sym143$RUN_ALL_LOADED_CYC_TESTS, stream, verbosity, stop_at_first_failureP, output_format, T, T, return_test_runsP, type, run_non_working_tests, NIL, NIL, ConsesLow.list(
        $sym150$FIND_CYC_TESTS_BY_NAME, names )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 35632L)
  public static SubLObject load_all_cyc_tests(final SubLObject path, SubLObject stream, SubLObject load_tiny_kb_tests_in_full_kbP, SubLObject verbosity)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( load_tiny_kb_tests_in_full_kbP == UNPROVIDED )
    {
      load_tiny_kb_tests_in_full_kbP = $run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
    }
    if( verbosity == UNPROVIDED )
    {
      verbosity = $kw128$TERSE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( path ) : path;
    assert NIL != Types.streamp( stream ) : stream;
    assert NIL != Types.booleanp( load_tiny_kb_tests_in_full_kbP ) : load_tiny_kb_tests_in_full_kbP;
    assert NIL != cyc_test_verbosity_level_p( verbosity ) : verbosity;
    thread.resetMultipleValues();
    final SubLObject tests_directory = parse_testdcl_path( path );
    final SubLObject extra_filename = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject count = ZERO_INTEGER;
    final SubLObject warn_on_duplicate_cyc_test_namesP = no_cyc_tests_definedP();
    final SubLObject _prev_bind_0 = StreamsLow.$standard_output$.currentBinding( thread );
    try
    {
      StreamsLow.$standard_output$.bind( stream, thread );
      if( NIL == load_testdcl( tests_directory, extra_filename ) )
      {
        Errors.error( $str154$could_not_load__a_lisp_from__s, ( NIL != extra_filename ) ? extra_filename : $cyc_base_testdcl$.getDynamicValue( thread ), tests_directory );
      }
      if( $kw142$VERBOSE == verbosity )
      {
        final SubLObject list_var = cyc_test_files();
        final SubLObject _prev_bind_0_$9 = utilities_macros.$progress_note$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_note$.bind( $str155$Loading_test_files, thread );
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
          utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
            SubLObject csome_list_var = list_var;
            SubLObject cyc_test_file = NIL;
            cyc_test_file = csome_list_var.first();
            while ( NIL != csome_list_var)
            {
              if( NIL != load_cyc_test_file( cyc_test_file, tests_directory, load_tiny_kb_tests_in_full_kbP, warn_on_duplicate_cyc_test_namesP ) )
              {
                count = Numbers.add( count, ONE_INTEGER );
              }
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
              csome_list_var = csome_list_var.rest();
              cyc_test_file = csome_list_var.first();
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_note$.rebind( _prev_bind_0_$9, thread );
        }
      }
      else
      {
        SubLObject cdolist_list_var = cyc_test_files();
        SubLObject cyc_test_file2 = NIL;
        cyc_test_file2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != load_cyc_test_file( cyc_test_file2, tests_directory, load_tiny_kb_tests_in_full_kbP, warn_on_duplicate_cyc_test_namesP ) )
          {
            count = Numbers.add( count, ONE_INTEGER );
          }
          else if( NIL != inference_testing.kb_matches_expectationsP( ctf_kb( cyc_test_file2 ), load_tiny_kb_tests_in_full_kbP ) )
          {
            $most_recent_cyc_test_file_load_failures$.setGlobalValue( ConsesLow.cons( cyc_test_file2, $most_recent_cyc_test_file_load_failures$.getGlobalValue() ) );
          }
          cdolist_list_var = cdolist_list_var.rest();
          cyc_test_file2 = cdolist_list_var.first();
        }
      }
      if( NIL != extra_filename )
      {
        final SubLObject _prev_bind_0_$11 = $only_undeclare_tests_and_test_filesP$.currentBinding( thread );
        try
        {
          $only_undeclare_tests_and_test_filesP$.bind( T, thread );
          load_testdcl( tests_directory, extra_filename );
        }
        finally
        {
          $only_undeclare_tests_and_test_filesP$.rebind( _prev_bind_0_$11, thread );
        }
      }
    }
    finally
    {
      StreamsLow.$standard_output$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 37388L)
  public static SubLObject parse_testdcl_path(SubLObject path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject extra_filename = NIL;
    if( NIL != string_utilities.ends_with( path, $str157$_lisp, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject directory = file_utilities.partially_deconstruct_path( path );
      final SubLObject filename = thread.secondMultipleValue();
      thread.resetMultipleValues();
      extra_filename = string_utilities.post_remove( filename, $str157$_lisp, UNPROVIDED );
      path = directory;
    }
    path = file_utilities.possibly_append_path_separator_char( path );
    return Values.values( path, extra_filename );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 37763L)
  public static SubLObject run_all_loaded_cyc_tests(SubLObject stream, SubLObject verbosity, SubLObject stop_at_first_failureP, SubLObject output_format, SubLObject run_tiny_kb_tests_in_full_kbP,
      SubLObject run_test_case_tablesP, SubLObject return_test_runsP, SubLObject type, SubLObject run_non_working_tests, SubLObject progress_file, SubLObject rerun_crashing_tests, SubLObject tests, SubLObject phase,
      SubLObject phases)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( verbosity == UNPROVIDED )
    {
      verbosity = $kw128$TERSE;
    }
    if( stop_at_first_failureP == UNPROVIDED )
    {
      stop_at_first_failureP = NIL;
    }
    if( output_format == UNPROVIDED )
    {
      output_format = $kw0$STANDARD;
    }
    if( run_tiny_kb_tests_in_full_kbP == UNPROVIDED )
    {
      run_tiny_kb_tests_in_full_kbP = $run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
    }
    if( run_test_case_tablesP == UNPROVIDED )
    {
      run_test_case_tablesP = T;
    }
    if( return_test_runsP == UNPROVIDED )
    {
      return_test_runsP = NIL;
    }
    if( type == UNPROVIDED )
    {
      type = $kw10$ALL;
    }
    if( run_non_working_tests == UNPROVIDED )
    {
      run_non_working_tests = NIL;
    }
    if( progress_file == UNPROVIDED )
    {
      progress_file = NIL;
    }
    if( rerun_crashing_tests == UNPROVIDED )
    {
      rerun_crashing_tests = NIL;
    }
    if( tests == UNPROVIDED )
    {
      tests = cyc_tests();
    }
    if( phase == UNPROVIDED )
    {
      phase = ZERO_INTEGER;
    }
    if( phases == UNPROVIDED )
    {
      phases = ONE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !phase.numL( phases ) )
    {
      Errors.error( $str158$Invalid_phase__A_of__A_specified_, phase, phases );
    }
    thread.resetMultipleValues();
    final SubLObject overall_result = cyc_testing_utilities.run_all_loaded_cyc_tests_int( stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, run_test_case_tablesP, type,
        run_non_working_tests, progress_file, rerun_crashing_tests, tests, phase, phases );
    final SubLObject test_runs = thread.secondMultipleValue();
    thread.resetMultipleValues();
    $most_recent_cyc_test_runs$.setGlobalValue( test_runs );
    return Values.values( overall_result, ( NIL != return_test_runsP ) ? test_runs : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 38659L)
  public static SubLObject undeclare_all_cyc_test_files()
  {
    $cyc_test_files$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 38751L)
  public static SubLObject undeclare_cyc_test_file(final SubLObject filename)
  {
    final SubLObject existing_cyc_test_file = find_cyc_test_file( filename );
    if( NIL != existing_cyc_test_file )
    {
      $cyc_test_files$.setGlobalValue( Sequences.delete( existing_cyc_test_file, $cyc_test_files$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 39010L)
  public static SubLObject declare_cyc_test_file_int(final SubLObject filename, final SubLObject kb)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $only_undeclare_tests_and_test_filesP$.getDynamicValue( thread ) )
    {
      undeclare_cyc_test_file( filename );
      final SubLObject cyc_test_file = new_cyc_test_file( filename, kb );
      final SubLObject new_cons = ConsesLow.cons( cyc_test_file, NIL );
      final SubLObject list = $cyc_test_files$.getGlobalValue();
      if( NIL != list )
      {
        subl_macros.rplacd_last( list, new_cons );
      }
      else
      {
        $cyc_test_files$.setGlobalValue( new_cons );
      }
      return cyc_test_file;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 39346L)
  public static SubLObject load_cyc_test_file(final SubLObject cyc_test_file, final SubLObject path, final SubLObject load_tiny_kb_tests_in_full_kbP, final SubLObject warn_on_duplicate_cyc_test_namesP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject successP = NIL;
    final SubLObject test_kb = ctf_kb( cyc_test_file );
    if( NIL != inference_testing.kb_matches_expectationsP( test_kb, load_tiny_kb_tests_in_full_kbP ) )
    {
      final SubLObject filename = ctf_filename( cyc_test_file );
      final SubLObject _prev_bind_0 = $cyc_test_filename$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $warn_on_duplicate_cyc_test_namesP$.currentBinding( thread );
      try
      {
        $cyc_test_filename$.bind( filename, thread );
        $warn_on_duplicate_cyc_test_namesP$.bind( warn_on_duplicate_cyc_test_namesP, thread );
        if( NIL != cyc_testing_utilities.load_lisp_test_file_from_path( path, filename ) )
        {
          successP = T;
        }
      }
      finally
      {
        $warn_on_duplicate_cyc_test_namesP$.rebind( _prev_bind_2, thread );
        $cyc_test_filename$.rebind( _prev_bind_0, thread );
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 39893L)
  public static SubLObject load_testdcl(final SubLObject path, SubLObject extra_filename)
  {
    if( extra_filename == UNPROVIDED )
    {
      extra_filename = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != cyc_testing_utilities.load_lisp_test_file_from_path( path, $cyc_base_testdcl$.getDynamicValue( thread ) ) && ( NIL == extra_filename || NIL != cyc_testing_utilities
        .load_lisp_test_file_from_path( path, extra_filename ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 40218L)
  public static SubLObject cyc_invalid_tests_with_info()
  {
    final SubLObject all_relevant_tests = ( NIL != control_vars.non_tiny_kb_loadedP() ) ? cyc_tests() : list_utilities.find_all_if( $sym160$TINY_KB_CYC_TEST_P, cyc_tests(), UNPROVIDED );
    final SubLObject invalid_tests = cyc_tests_mentioning_invalid_constants( all_relevant_tests );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = invalid_tests;
    SubLObject invalid_test = NIL;
    invalid_test = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject test_name = cyc_test_name( invalid_test );
      final SubLObject test_type = cyc_test_type( invalid_test );
      final SubLObject test_owner = cyc_test_owner( invalid_test );
      final SubLObject invalid_constants = cyc_test_invalid_constants( invalid_test );
      result = ConsesLow.cons( ConsesLow.list( test_type, test_name, test_owner, invalid_constants ), result );
      cdolist_list_var = cdolist_list_var.rest();
      invalid_test = cdolist_list_var.first();
    }
    if( NIL != result && NIL != list_utilities.lengthLE( result, $int161$100, UNPROVIDED ) )
    {
      format_nil.p1( result, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 41006L)
  public static SubLObject run_cyc_test_after_every_test(final SubLObject path, final SubLObject test_to_interleave, SubLObject stream, SubLObject load_tiny_kb_tests_in_full_kbP, SubLObject verbosity)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( load_tiny_kb_tests_in_full_kbP == UNPROVIDED )
    {
      load_tiny_kb_tests_in_full_kbP = T;
    }
    if( verbosity == UNPROVIDED )
    {
      verbosity = $kw128$TERSE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    load_all_cyc_tests( path, stream, load_tiny_kb_tests_in_full_kbP, verbosity );
    SubLObject test_count;
    SubLObject n;
    for( test_count = cyc_test_count(), n = NIL, n = ZERO_INTEGER; n.numL( test_count ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      run_all_loaded_cyc_tests( StreamsLow.$standard_output$.getDynamicValue( thread ), verbosity, T, $kw0$STANDARD, T, T, NIL, $kw10$ALL, NIL, NIL, NIL, cyc_tests(), n, test_count );
      cyc_testing_utilities.run_cyc_test_int( test_to_interleave, verbosity, NIL, NIL, $kw0$STANDARD, stream, T );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 41536L)
  public static SubLObject all_cyc_tests_are_valid()
  {
    return cyc_invalid_tests_with_info();
  }

  public static SubLObject declare_cyc_testing_file()
  {
    SubLFiles.declareFunction( me, "testing_real_time_pruningP", "TESTING-REAL-TIME-PRUNING?", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_kb_p", "CYC-TEST-KB-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_verbosity_level_p", "CYC-TEST-VERBOSITY-LEVEL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_output_format_p", "CYC-TEST-OUTPUT-FORMAT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_result_p", "CYC-TEST-RESULT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_success_result_p", "CYC-TEST-SUCCESS-RESULT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_failure_result_p", "CYC-TEST-FAILURE-RESULT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_ignore_result_p", "CYC-TEST-IGNORE-RESULT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_result_L", "CYC-TEST-RESULT-<", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_type_p", "CYC-TEST-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_type_spec_p", "CYC-TEST-TYPE-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_type_pretty_name", "CYC-TEST-TYPE-PRETTY-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_tests", "CYC-TESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "undefine_all_cyc_tests", "UNDEFINE-ALL-CYC-TESTS", 0, 0, false );
    SubLFiles.declareMacro( me, "do_cyc_tests", "DO-CYC-TESTS" );
    SubLFiles.declareMacro( me, "progress_do_cyc_tests", "PROGRESS-DO-CYC-TESTS" );
    SubLFiles.declareFunction( me, "cyc_test_count", "CYC-TEST-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "no_cyc_tests_definedP", "NO-CYC-TESTS-DEFINED?", 0, 0, false );
    SubLFiles.declareFunction( me, "index_cyc_test_by_name", "INDEX-CYC-TEST-BY-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "unindex_cyc_test_by_name", "UNINDEX-CYC-TEST-BY-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "my_pushnew_to_end_hash", "MY-PUSHNEW-TO-END-HASH", 3, 0, false );
    SubLFiles.declareFunction( me, "my_delete_value_from_hash", "MY-DELETE-VALUE-FROM-HASH", 3, 0, false );
    SubLFiles.declareFunction( me, "index_all_cyc_tests_by_name", "INDEX-ALL-CYC-TESTS-BY-NAME", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_print_function_trampoline", "CYC-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_p", "CYC-TEST-P", 1, 0, false );
    new $cyc_test_p$UnaryFunction();
    SubLFiles.declareFunction( me, "ct_file", "CT-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "ct_guts", "CT-GUTS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ct_file", "_CSETF-CT-FILE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ct_guts", "_CSETF-CT-GUTS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cyc_test", "MAKE-CYC-TEST", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_cyc_test", "VISIT-DEFSTRUCT-CYC-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_cyc_test_method", "VISIT-DEFSTRUCT-OBJECT-CYC-TEST-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_cyc_test", "PRINT-CYC-TEST", 3, 0, false );
    SubLFiles.declareFunction( me, "new_cyc_test", "NEW-CYC-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "undeclare_cyc_test", "UNDECLARE-CYC-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_file", "CYC-TEST-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_guts", "CYC-TEST-GUTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_type", "CYC-TEST-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_guts_p", "CYC-TEST-GUTS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_type_permissive", "CYC-TEST-TYPE-PERMISSIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_guts_type", "CYC-TEST-GUTS-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_name", "CYC-TEST-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_id", "CYC-TEST-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_kb", "CYC-TEST-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_owner", "CYC-TEST-OWNER", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_workingP", "CYC-TEST-WORKING?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_comment", "CYC-TEST-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_project", "CYC-TEST-PROJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_names_mentioning_invalid_constants", "CYC-TEST-NAMES-MENTIONING-INVALID-CONSTANTS", 0, 1, false );
    SubLFiles.declareFunction( me, "cyc_test_invalid_constant_test_names", "CYC-TEST-INVALID-CONSTANT-TEST-NAMES", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_tests_mentioning_invalid_constants", "CYC-TESTS-MENTIONING-INVALID-CONSTANTS", 0, 1, false );
    SubLFiles.declareFunction( me, "cyc_test_invalidP", "CYC-TEST-INVALID?", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_invalid_constants", "CYC-TEST-INVALID-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "print_post_build_test_summary", "PRINT-POST-BUILD-TEST-SUMMARY", 6, 0, false );
    SubLFiles.declareFunction( me, "tiny_kb_cyc_test_p", "TINY-KB-CYC-TEST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "full_kb_cyc_test_p", "FULL-KB-CYC-TEST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_working_cyc_tests", "NON-WORKING-CYC-TESTS", 0, 1, false );
    SubLFiles.declareFunction( me, "find_cyc_test_by_exact_name", "FIND-CYC-TEST-BY-EXACT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "find_cyc_test", "FIND-CYC-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "find_cyc_tests", "FIND-CYC-TESTS", 1, 0, false );
    SubLFiles.declareFunction( me, "find_cyc_test_number", "FIND-CYC-TEST-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "find_cyc_tests_in_range", "FIND-CYC-TESTS-IN-RANGE", 3, 0, false );
    SubLFiles.declareFunction( me, "find_cyc_tests_by_name", "FIND-CYC-TESTS-BY-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "find_cyc_test_filename", "FIND-CYC-TEST-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_cyc_test_method", "CFASL-OUTPUT-OBJECT-CYC-TEST-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_wide_output_cyc_test", "CFASL-WIDE-OUTPUT-CYC-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_cyc_test_internal", "CFASL-OUTPUT-CYC-TEST-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_cyc_test", "CFASL-INPUT-CYC-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cyc_test_run", "NEW-CYC-TEST-RUN", 4, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_run_p", "CYC-TEST-RUN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_run_type", "CYC-TEST-RUN-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_run_name", "CYC-TEST-RUN-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_run_result", "CYC-TEST-RUN-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_run_time", "CYC-TEST-RUN-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_run_cyc_test", "CYC-TEST-RUN-CYC-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_runs_overall_result", "CYC-TEST-RUNS-OVERALL-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_result_update", "CYC-TEST-RESULT-UPDATE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_runs_total_time", "CYC-TEST-RUNS-TOTAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "failing_cyc_test_run_p", "FAILING-CYC-TEST-RUN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "succeeding_cyc_test_run_p", "SUCCEEDING-CYC-TEST-RUN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ignored_cyc_test_run_p", "IGNORED-CYC-TEST-RUN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_run_owner", "CYC-TEST-RUN-OWNER", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_run_project", "CYC-TEST-RUN-PROJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "print_cyc_test_run_summary", "PRINT-CYC-TEST-RUN-SUMMARY", 4, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_run_summary", "CYC-TEST-RUN-SUMMARY", 3, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_files", "CYC-TEST-FILES", 0, 0, false );
    SubLFiles.declareMacro( me, "do_cyc_test_files", "DO-CYC-TEST-FILES" );
    SubLFiles.declareMacro( me, "progress_do_cyc_test_files", "PROGRESS-DO-CYC-TEST-FILES" );
    SubLFiles.declareFunction( me, "cyc_test_file_count", "CYC-TEST-FILE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_file_print_function_trampoline", "CYC-TEST-FILE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_file_p", "CYC-TEST-FILE-P", 1, 0, false );
    new $cyc_test_file_p$UnaryFunction();
    SubLFiles.declareFunction( me, "ctf_filename", "CTF-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "ctf_kb", "CTF-KB", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ctf_filename", "_CSETF-CTF-FILENAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ctf_kb", "_CSETF-CTF-KB", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cyc_test_file", "MAKE-CYC-TEST-FILE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_cyc_test_file", "VISIT-DEFSTRUCT-CYC-TEST-FILE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_cyc_test_file_method", "VISIT-DEFSTRUCT-OBJECT-CYC-TEST-FILE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_cyc_test_file", "PRINT-CYC-TEST-FILE", 3, 0, false );
    SubLFiles.declareFunction( me, "new_cyc_test_file", "NEW-CYC-TEST-FILE", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_test_file_filename", "CYC-TEST-FILE-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "find_cyc_test_file", "FIND-CYC-TEST-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "most_recent_cyc_test_runs", "MOST-RECENT-CYC-TEST-RUNS", 0, 0, false );
    SubLFiles.declareFunction( me, "most_recent_failing_cyc_test_runs", "MOST-RECENT-FAILING-CYC-TEST-RUNS", 0, 0, false );
    SubLFiles.declareFunction( me, "most_recent_failing_cyc_tests", "MOST-RECENT-FAILING-CYC-TESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "most_recent_cyc_test_file_load_failures", "MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES", 0, 0, false );
    SubLFiles.declareMacro( me, "run_all_cyc_tests", "RUN-ALL-CYC-TESTS" );
    SubLFiles.declareFunction( me, "run_all_cyc_tests_int", "RUN-ALL-CYC-TESTS-INT", 1, 13, false );
    SubLFiles.declareMacro( me, "rerun_failing_cyc_tests", "RERUN-FAILING-CYC-TESTS" );
    SubLFiles.declareMacro( me, "declare_cyc_test_file", "DECLARE-CYC-TEST-FILE" );
    SubLFiles.declareMacro( me, "run_cyc_tests", "RUN-CYC-TESTS" );
    SubLFiles.declareFunction( me, "load_all_cyc_tests", "LOAD-ALL-CYC-TESTS", 1, 3, false );
    SubLFiles.declareFunction( me, "parse_testdcl_path", "PARSE-TESTDCL-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "run_all_loaded_cyc_tests", "RUN-ALL-LOADED-CYC-TESTS", 0, 14, false );
    SubLFiles.declareFunction( me, "undeclare_all_cyc_test_files", "UNDECLARE-ALL-CYC-TEST-FILES", 0, 0, false );
    SubLFiles.declareFunction( me, "undeclare_cyc_test_file", "UNDECLARE-CYC-TEST-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "declare_cyc_test_file_int", "DECLARE-CYC-TEST-FILE-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "load_cyc_test_file", "LOAD-CYC-TEST-FILE", 4, 0, false );
    SubLFiles.declareFunction( me, "load_testdcl", "LOAD-TESTDCL", 1, 1, false );
    SubLFiles.declareFunction( me, "cyc_invalid_tests_with_info", "CYC-INVALID-TESTS-WITH-INFO", 0, 0, false );
    SubLFiles.declareFunction( me, "run_cyc_test_after_every_test", "RUN-CYC-TEST-AFTER-EVERY-TEST", 2, 3, false );
    SubLFiles.declareFunction( me, "all_cyc_tests_are_valid", "ALL-CYC-TESTS-ARE-VALID", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_cyc_testing_file()
  {
    $it_output_format$ = SubLFiles.defparameter( "*IT-OUTPUT-FORMAT*", $kw0$STANDARD );
    $cyc_test_debugP$ = SubLFiles.defparameter( "*CYC-TEST-DEBUG?*", NIL );
    $run_tiny_kb_tests_in_full_kbP$ = SubLFiles.defparameter( "*RUN-TINY-KB-TESTS-IN-FULL-KB?*", T );
    $test_real_time_pruningP$ = SubLFiles.defparameter( "*TEST-REAL-TIME-PRUNING?*", NIL );
    $cyc_test_verbosity_levels$ = SubLFiles.deflexical( "*CYC-TEST-VERBOSITY-LEVELS*", $list1 );
    $cyc_test_filename$ = SubLFiles.defparameter( "*CYC-TEST-FILENAME*", NIL );
    $cyc_base_testdcl$ = SubLFiles.defparameter( "*CYC-BASE-TESTDCL*", $str2$testdcl );
    $warn_on_duplicate_cyc_test_namesP$ = SubLFiles.defparameter( "*WARN-ON-DUPLICATE-CYC-TEST-NAMES?*", NIL );
    $only_undeclare_tests_and_test_filesP$ = SubLFiles.defparameter( "*ONLY-UNDECLARE-TESTS-AND-TEST-FILES?*", NIL );
    $cyc_test_result_success_values$ = SubLFiles.deflexical( "*CYC-TEST-RESULT-SUCCESS-VALUES*", $list5 );
    $cyc_test_result_failure_values$ = SubLFiles.deflexical( "*CYC-TEST-RESULT-FAILURE-VALUES*", $list6 );
    $cyc_test_result_ignore_values$ = SubLFiles.deflexical( "*CYC-TEST-RESULT-IGNORE-VALUES*", $list7 );
    $cyc_test_result_values$ = SubLFiles.deflexical( "*CYC-TEST-RESULT-VALUES*", ConsesLow.append( $cyc_test_result_success_values$.getGlobalValue(), $cyc_test_result_failure_values$.getGlobalValue(),
        $cyc_test_result_ignore_values$.getGlobalValue() ) );
    $cyc_test_type_table$ = SubLFiles.deflexical( "*CYC-TEST-TYPE-TABLE*", $list8 );
    $cyc_tests$ = SubLFiles.defvar( "*CYC-TESTS*", NIL );
    $cyc_test_by_name$ = SubLFiles.deflexical( "*CYC-TEST-BY-NAME*", maybeDefault( $sym21$_CYC_TEST_BY_NAME_, $cyc_test_by_name$, () -> ( Hashtables.make_hash_table( $int22$212, Symbols.symbol_function( EQUAL ),
        UNPROVIDED ) ) ) );
    $cyc_test_by_dwimmed_name$ = SubLFiles.deflexical( "*CYC-TEST-BY-DWIMMED-NAME*", maybeDefault( $sym23$_CYC_TEST_BY_DWIMMED_NAME_, $cyc_test_by_dwimmed_name$, () -> ( Hashtables.make_hash_table( $int22$212, Symbols
        .symbol_function( EQUAL ), UNPROVIDED ) ) ) );
    $dtp_cyc_test$ = SubLFiles.defconstant( "*DTP-CYC-TEST*", $sym29$CYC_TEST );
    $print_post_build_test_summary_timestampP$ = SubLFiles.defparameter( "*PRINT-POST-BUILD-TEST-SUMMARY-TIMESTAMP?*", T );
    $cfasl_wide_opcode_cyc_test$ = SubLFiles.defconstant( "*CFASL-WIDE-OPCODE-CYC-TEST*", $int77$514 );
    $cyc_test_files$ = SubLFiles.deflexical( "*CYC-TEST-FILES*", ( maybeDefault( $sym93$_CYC_TEST_FILES_, $cyc_test_files$, NIL ) ) );
    $dtp_cyc_test_file$ = SubLFiles.defconstant( "*DTP-CYC-TEST-FILE*", $sym100$CYC_TEST_FILE );
    $most_recent_cyc_test_runs$ = SubLFiles.deflexical( "*MOST-RECENT-CYC-TEST-RUNS*", ( maybeDefault( $sym119$_MOST_RECENT_CYC_TEST_RUNS_, $most_recent_cyc_test_runs$, NIL ) ) );
    $most_recent_cyc_test_file_load_failures$ = SubLFiles.deflexical( "*MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES*", ( maybeDefault( $sym120$_MOST_RECENT_CYC_TEST_FILE_LOAD_FAILURES_,
        $most_recent_cyc_test_file_load_failures$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_cyc_testing_file()
  {
    subl_macro_promotions.declare_defglobal( $sym21$_CYC_TEST_BY_NAME_ );
    subl_macro_promotions.declare_defglobal( $sym23$_CYC_TEST_BY_DWIMMED_NAME_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_cyc_test$.getGlobalValue(), Symbols.symbol_function( $sym36$CYC_TEST_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list37 );
    Structures.def_csetf( $sym38$CT_FILE, $sym39$_CSETF_CT_FILE );
    Structures.def_csetf( $sym40$CT_GUTS, $sym41$_CSETF_CT_GUTS );
    Equality.identity( $sym29$CYC_TEST );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cyc_test$.getGlobalValue(), Symbols.symbol_function( $sym49$VISIT_DEFSTRUCT_OBJECT_CYC_TEST_METHOD ) );
    cfasl.register_wide_cfasl_opcode_input_function( $cfasl_wide_opcode_cyc_test$.getGlobalValue(), $sym78$CFASL_INPUT_CYC_TEST );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_cyc_test$.getGlobalValue(), Symbols.symbol_function( $sym79$CFASL_OUTPUT_OBJECT_CYC_TEST_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym93$_CYC_TEST_FILES_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_cyc_test_file$.getGlobalValue(), Symbols.symbol_function( $sym107$CYC_TEST_FILE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list108 );
    Structures.def_csetf( $sym109$CTF_FILENAME, $sym110$_CSETF_CTF_FILENAME );
    Structures.def_csetf( $sym111$CTF_KB, $sym112$_CSETF_CTF_KB );
    Equality.identity( $sym100$CYC_TEST_FILE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cyc_test_file$.getGlobalValue(), Symbols.symbol_function( $sym116$VISIT_DEFSTRUCT_OBJECT_CYC_TEST_FILE_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym119$_MOST_RECENT_CYC_TEST_RUNS_ );
    subl_macro_promotions.declare_defglobal( $sym120$_MOST_RECENT_CYC_TEST_FILE_LOAD_FAILURES_ );
    access_macros.register_macro_helper( $sym147$DECLARE_CYC_TEST_FILE_INT, $sym159$DECLARE_CYC_TEST_FILE );
    generic_testing.define_test_case_table_int( $sym162$SERVER_SUMMARY, ConsesLow.list( new SubLObject[] { $kw163$TEST, NIL, $kw164$OWNER, NIL, $kw165$CLASSES, NIL, $kw114$KB, $kw70$BOTH, $kw166$WORKING_, T
    } ), $list167 );
    generic_testing.define_test_case_table_int( $sym168$KB_STATISTICS, ConsesLow.list( new SubLObject[] { $kw163$TEST, NIL, $kw164$OWNER, NIL, $kw165$CLASSES, NIL, $kw114$KB, $kw70$BOTH, $kw166$WORKING_, T
    } ), $list167 );
    generic_testing.define_test_case_table_int( $sym169$CYC_MEMORY_HOGS, ConsesLow.list( new SubLObject[] { $kw163$TEST, NIL, $kw164$OWNER, NIL, $kw165$CLASSES, NIL, $kw114$KB, $kw70$BOTH, $kw166$WORKING_, T
    } ), $list167 );
    generic_testing.define_test_case_table_int( $sym170$ALL_CYC_TESTS_ARE_VALID, ConsesLow.list( new SubLObject[] { $kw163$TEST, NIL, $kw164$OWNER, NIL, $kw165$CLASSES, NIL, $kw114$KB, $kw70$BOTH, $kw166$WORKING_, T
    } ), $list167 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cyc_testing_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cyc_testing_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cyc_testing_file();
  }
  static
  {
    me = new cyc_testing();
    $it_output_format$ = null;
    $cyc_test_debugP$ = null;
    $run_tiny_kb_tests_in_full_kbP$ = null;
    $test_real_time_pruningP$ = null;
    $cyc_test_verbosity_levels$ = null;
    $cyc_test_filename$ = null;
    $cyc_base_testdcl$ = null;
    $warn_on_duplicate_cyc_test_namesP$ = null;
    $only_undeclare_tests_and_test_filesP$ = null;
    $cyc_test_result_success_values$ = null;
    $cyc_test_result_failure_values$ = null;
    $cyc_test_result_ignore_values$ = null;
    $cyc_test_result_values$ = null;
    $cyc_test_type_table$ = null;
    $cyc_tests$ = null;
    $cyc_test_by_name$ = null;
    $cyc_test_by_dwimmed_name$ = null;
    $dtp_cyc_test$ = null;
    $print_post_build_test_summary_timestampP$ = null;
    $cfasl_wide_opcode_cyc_test$ = null;
    $cyc_test_files$ = null;
    $dtp_cyc_test_file$ = null;
    $most_recent_cyc_test_runs$ = null;
    $most_recent_cyc_test_file_load_failures$ = null;
    $kw0$STANDARD = makeKeyword( "STANDARD" );
    $list1 = ConsesLow.list( makeKeyword( "SILENT" ), makeKeyword( "TERSE" ), makeKeyword( "VERBOSE" ) );
    $str2$testdcl = makeString( "testdcl" );
    $list3 = ConsesLow.list( makeKeyword( "TINY" ), makeKeyword( "FULL" ), makeKeyword( "BOTH" ) );
    $list4 = ConsesLow.list( makeKeyword( "STANDARD" ), makeKeyword( "POST-BUILD" ) );
    $list5 = ConsesLow.list( makeKeyword( "SUCCESS" ), makeKeyword( "REGRESSION-SUCCESS" ) );
    $list6 = ConsesLow.list( makeKeyword( "FAILURE" ), makeKeyword( "REGRESSION-FAILURE" ), makeKeyword( "ABNORMAL" ), makeKeyword( "ERROR" ) );
    $list7 = ConsesLow.list( makeKeyword( "NON-REGRESSION-SUCCESS" ), makeKeyword( "NON-REGRESSION-FAILURE" ), makeKeyword( "NOT-RUN" ), makeKeyword( "INVALID" ) );
    $list8 = ConsesLow.list( ConsesLow.list( makeKeyword( "IUT" ), makeString( "inference unit test" ) ), ConsesLow.list( makeKeyword( "IT" ), makeString( "inference test" ) ), ConsesLow.list( makeKeyword( "RMT" ),
        makeString( "removal module test" ) ), ConsesLow.list( makeKeyword( "TMT" ), makeString( "transformation module test" ) ), ConsesLow.list( makeKeyword( "RMCT" ), makeString( "removal module cost test" ) ),
        ConsesLow.list( makeKeyword( "ERT" ), makeString( "evaluatable relation test" ) ), ConsesLow.list( makeKeyword( "TCT" ), makeString( "test case table" ) ), ConsesLow.list( makeKeyword( "KCT" ), makeString(
            "KB content test" ) ) );
    $sym9$FIRST = makeSymbol( "FIRST" );
    $kw10$ALL = makeKeyword( "ALL" );
    $sym11$CYC_TEST_TYPE_P = makeSymbol( "CYC-TEST-TYPE-P" );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "CYC-TEST" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list13 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw14$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw15$DONE = makeKeyword( "DONE" );
    $sym16$CSOME = makeSymbol( "CSOME" );
    $list17 = ConsesLow.list( makeSymbol( "CYC-TESTS" ) );
    $list18 = ConsesLow.list( ConsesLow.list( makeSymbol( "CYC-TEST" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MESSAGE" ), makeString( "Iterating over all Cyc tests" ) ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $str19$Iterating_over_all_Cyc_tests = makeString( "Iterating over all Cyc tests" );
    $sym20$PROGRESS_CDOLIST = makeSymbol( "PROGRESS-CDOLIST" );
    $sym21$_CYC_TEST_BY_NAME_ = makeSymbol( "*CYC-TEST-BY-NAME*" );
    $int22$212 = makeInteger( 212 );
    $sym23$_CYC_TEST_BY_DWIMMED_NAME_ = makeSymbol( "*CYC-TEST-BY-DWIMMED-NAME*" );
    $str24$A_Cyc_test_named__a_already_exist = makeString( "A Cyc test named ~a already existed; overwriting" );
    $sym25$REMOVAL_MODULE_TEST_P = makeSymbol( "REMOVAL-MODULE-TEST-P" );
    $sym26$REMOVAL_MODULE_TEST_PREDICATE = makeSymbol( "REMOVAL-MODULE-TEST-PREDICATE" );
    $sym27$REMOVAL_MODULE_COST_TEST_P = makeSymbol( "REMOVAL-MODULE-COST-TEST-P" );
    $sym28$REMOVAL_MODULE_COST_TEST_PREDICATE = makeSymbol( "REMOVAL-MODULE-COST-TEST-PREDICATE" );
    $sym29$CYC_TEST = makeSymbol( "CYC-TEST" );
    $sym30$CYC_TEST_P = makeSymbol( "CYC-TEST-P" );
    $list31 = ConsesLow.list( makeSymbol( "FILE" ), makeSymbol( "GUTS" ) );
    $list32 = ConsesLow.list( makeKeyword( "FILE" ), makeKeyword( "GUTS" ) );
    $list33 = ConsesLow.list( makeSymbol( "CT-FILE" ), makeSymbol( "CT-GUTS" ) );
    $list34 = ConsesLow.list( makeSymbol( "_CSETF-CT-FILE" ), makeSymbol( "_CSETF-CT-GUTS" ) );
    $sym35$PRINT_CYC_TEST = makeSymbol( "PRINT-CYC-TEST" );
    $sym36$CYC_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CYC-TEST-PRINT-FUNCTION-TRAMPOLINE" );
    $list37 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CYC-TEST-P" ) );
    $sym38$CT_FILE = makeSymbol( "CT-FILE" );
    $sym39$_CSETF_CT_FILE = makeSymbol( "_CSETF-CT-FILE" );
    $sym40$CT_GUTS = makeSymbol( "CT-GUTS" );
    $sym41$_CSETF_CT_GUTS = makeSymbol( "_CSETF-CT-GUTS" );
    $kw42$FILE = makeKeyword( "FILE" );
    $kw43$GUTS = makeKeyword( "GUTS" );
    $str44$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw45$BEGIN = makeKeyword( "BEGIN" );
    $sym46$MAKE_CYC_TEST = makeSymbol( "MAKE-CYC-TEST" );
    $kw47$SLOT = makeKeyword( "SLOT" );
    $kw48$END = makeKeyword( "END" );
    $sym49$VISIT_DEFSTRUCT_OBJECT_CYC_TEST_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CYC-TEST-METHOD" );
    $str50$__CYC_TEST__a__a_ = makeString( "#<CYC-TEST:~a:~a>" );
    $str51$__CYC_TEST__a_ = makeString( "#<CYC-TEST:~a>" );
    $sym52$STRINGP = makeSymbol( "STRINGP" );
    $sym53$CYC_TEST_GUTS_P = makeSymbol( "CYC-TEST-GUTS-P" );
    $str54$_s_is_not_a_CYC_TEST_GUTS_P = makeString( "~s is not a CYC-TEST-GUTS-P" );
    $sym55$GENERIC_TEST_CASE_TABLE_P = makeSymbol( "GENERIC-TEST-CASE-TABLE-P" );
    $sym56$CYC_TEST_NAME = makeSymbol( "CYC-TEST-NAME" );
    $str57$Cyc_test_of_unexpected_type___s = makeString( "Cyc test of unexpected type: ~s" );
    $kw58$TCT = makeKeyword( "TCT" );
    $kw59$IUT = makeKeyword( "IUT" );
    $kw60$RMT = makeKeyword( "RMT" );
    $kw61$RMCT = makeKeyword( "RMCT" );
    $kw62$TMT = makeKeyword( "TMT" );
    $kw63$ERT = makeKeyword( "ERT" );
    $kw64$IT = makeKeyword( "IT" );
    $kw65$KCT = makeKeyword( "KCT" );
    $kw66$NOT_RUN = makeKeyword( "NOT-RUN" );
    $str67$___A__S__S__S____3f___OWNER__S__ = makeString( "~&~A ~S ~S ~S (~,3f) :OWNER ~S~%" );
    $str68$___S__S__S____3f___OWNER__S__ = makeString( "~&~S ~S ~S (~,3f) :OWNER ~S~%" );
    $kw69$TINY = makeKeyword( "TINY" );
    $kw70$BOTH = makeKeyword( "BOTH" );
    $kw71$FULL = makeKeyword( "FULL" );
    $sym72$CYC_TEST_TYPE_SPEC_P = makeSymbol( "CYC-TEST-TYPE-SPEC-P" );
    $sym73$CYC_TEST_WORKING_ = makeSymbol( "CYC-TEST-WORKING?" );
    $sym74$NOT_EQ = makeSymbol( "NOT-EQ" );
    $sym75$CYC_TEST_TYPE = makeSymbol( "CYC-TEST-TYPE" );
    $sym76$FIND_CYC_TEST = makeSymbol( "FIND-CYC-TEST" );
    $int77$514 = makeInteger( 514 );
    $sym78$CFASL_INPUT_CYC_TEST = makeSymbol( "CFASL-INPUT-CYC-TEST" );
    $sym79$CFASL_OUTPUT_OBJECT_CYC_TEST_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-CYC-TEST-METHOD" );
    $sym80$CYC_TEST_RESULT_P = makeSymbol( "CYC-TEST-RESULT-P" );
    $sym81$NON_NEGATIVE_NUMBER_P = makeSymbol( "NON-NEGATIVE-NUMBER-P" );
    $sym82$CYC_TEST_RUN_P = makeSymbol( "CYC-TEST-RUN-P" );
    $list83 = ConsesLow.list( makeKeyword( "NOT-RUN" ), makeKeyword( "INVALID" ) );
    $kw84$FAILURE = makeKeyword( "FAILURE" );
    $kw85$SUCCESS = makeKeyword( "SUCCESS" );
    $kw86$SILENT = makeKeyword( "SILENT" );
    $str87$___S__S_____S___S_ = makeString( "~&~S ~S -> ~S (~S)" );
    $kw88$POST_BUILD = makeKeyword( "POST-BUILD" );
    $str89$Unknown_output_format__A = makeString( "Unknown output format ~A" );
    $kw90$WITH_OWNER = makeKeyword( "WITH-OWNER" );
    $str91$_ = makeString( " " );
    $str92$Unknown_output_format_ = makeString( "Unknown output format " );
    $sym93$_CYC_TEST_FILES_ = makeSymbol( "*CYC-TEST-FILES*" );
    $list94 = ConsesLow.list( ConsesLow.list( makeSymbol( "CYC-TEST-FILE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym95$CDOLIST = makeSymbol( "CDOLIST" );
    $list96 = ConsesLow.list( ConsesLow.list( makeSymbol( "CYC-TEST-FILES" ) ) );
    $list97 = ConsesLow.list( ConsesLow.list( makeSymbol( "CYC-TEST-FILE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MESSAGE" ), makeString( "Iterating over all test files" ) ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $str98$Iterating_over_all_test_files = makeString( "Iterating over all test files" );
    $list99 = ConsesLow.list( makeSymbol( "CYC-TEST-FILES" ) );
    $sym100$CYC_TEST_FILE = makeSymbol( "CYC-TEST-FILE" );
    $sym101$CYC_TEST_FILE_P = makeSymbol( "CYC-TEST-FILE-P" );
    $list102 = ConsesLow.list( makeSymbol( "FILENAME" ), makeSymbol( "KB" ) );
    $list103 = ConsesLow.list( makeKeyword( "FILENAME" ), makeKeyword( "KB" ) );
    $list104 = ConsesLow.list( makeSymbol( "CTF-FILENAME" ), makeSymbol( "CTF-KB" ) );
    $list105 = ConsesLow.list( makeSymbol( "_CSETF-CTF-FILENAME" ), makeSymbol( "_CSETF-CTF-KB" ) );
    $sym106$PRINT_CYC_TEST_FILE = makeSymbol( "PRINT-CYC-TEST-FILE" );
    $sym107$CYC_TEST_FILE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CYC-TEST-FILE-PRINT-FUNCTION-TRAMPOLINE" );
    $list108 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CYC-TEST-FILE-P" ) );
    $sym109$CTF_FILENAME = makeSymbol( "CTF-FILENAME" );
    $sym110$_CSETF_CTF_FILENAME = makeSymbol( "_CSETF-CTF-FILENAME" );
    $sym111$CTF_KB = makeSymbol( "CTF-KB" );
    $sym112$_CSETF_CTF_KB = makeSymbol( "_CSETF-CTF-KB" );
    $kw113$FILENAME = makeKeyword( "FILENAME" );
    $kw114$KB = makeKeyword( "KB" );
    $sym115$MAKE_CYC_TEST_FILE = makeSymbol( "MAKE-CYC-TEST-FILE" );
    $sym116$VISIT_DEFSTRUCT_OBJECT_CYC_TEST_FILE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CYC-TEST-FILE-METHOD" );
    $str117$__CTF__a_ = makeString( "#<CTF:~a>" );
    $sym118$CYC_TEST_KB_P = makeSymbol( "CYC-TEST-KB-P" );
    $sym119$_MOST_RECENT_CYC_TEST_RUNS_ = makeSymbol( "*MOST-RECENT-CYC-TEST-RUNS*" );
    $sym120$_MOST_RECENT_CYC_TEST_FILE_LOAD_FAILURES_ = makeSymbol( "*MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES*" );
    $sym121$FAILING_CYC_TEST_RUN_P = makeSymbol( "FAILING-CYC-TEST-RUN-P" );
    $sym122$CYC_TEST_RUN_CYC_TEST = makeSymbol( "CYC-TEST-RUN-CYC-TEST" );
    $list123 = ConsesLow.list( new SubLObject[] { makeSymbol( "PATH" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "STREAM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*STANDARD-OUTPUT*" ) ) ),
      ConsesLow.list( makeSymbol( "VERBOSITY" ), makeKeyword( "TERSE" ) ), ConsesLow.list( makeSymbol( "STOP-AT-FIRST-FAILURE?" ), NIL ), ConsesLow.list( makeSymbol( "OUTPUT-FORMAT" ), makeKeyword( "STANDARD" ) ),
      ConsesLow.list( makeSymbol( "RUN-TINY-KB-TESTS-IN-FULL-KB?" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*RUN-TINY-KB-TESTS-IN-FULL-KB?*" ) ) ), ConsesLow.list( makeSymbol( "RUN-TEST-CASE-TABLES?" ), T ),
      ConsesLow.list( makeSymbol( "RETURN-TEST-RUNS?" ), NIL ), ConsesLow.list( makeSymbol( "TYPE" ), makeKeyword( "ALL" ) ), ConsesLow.list( makeSymbol( "RUN-NON-WORKING-TESTS" ), NIL ), ConsesLow.list( makeSymbol(
          "PROGRESS-FILE" ), NIL ), ConsesLow.list( makeSymbol( "RERUN-CRASHING-TESTS" ), NIL )
    } );
    $list124 = ConsesLow.list( new SubLObject[] { makeKeyword( "STREAM" ), makeKeyword( "VERBOSITY" ), makeKeyword( "STOP-AT-FIRST-FAILURE?" ), makeKeyword( "OUTPUT-FORMAT" ), makeKeyword(
        "RUN-TINY-KB-TESTS-IN-FULL-KB?" ), makeKeyword( "RUN-TEST-CASE-TABLES?" ), makeKeyword( "RETURN-TEST-RUNS?" ), makeKeyword( "TYPE" ), makeKeyword( "RUN-NON-WORKING-TESTS" ), makeKeyword( "PROGRESS-FILE" ),
      makeKeyword( "RERUN-CRASHING-TESTS" )
    } );
    $kw125$STREAM = makeKeyword( "STREAM" );
    $sym126$_STANDARD_OUTPUT_ = makeSymbol( "*STANDARD-OUTPUT*" );
    $kw127$VERBOSITY = makeKeyword( "VERBOSITY" );
    $kw128$TERSE = makeKeyword( "TERSE" );
    $kw129$STOP_AT_FIRST_FAILURE_ = makeKeyword( "STOP-AT-FIRST-FAILURE?" );
    $kw130$OUTPUT_FORMAT = makeKeyword( "OUTPUT-FORMAT" );
    $kw131$RUN_TINY_KB_TESTS_IN_FULL_KB_ = makeKeyword( "RUN-TINY-KB-TESTS-IN-FULL-KB?" );
    $sym132$_RUN_TINY_KB_TESTS_IN_FULL_KB__ = makeSymbol( "*RUN-TINY-KB-TESTS-IN-FULL-KB?*" );
    $kw133$RUN_TEST_CASE_TABLES_ = makeKeyword( "RUN-TEST-CASE-TABLES?" );
    $kw134$RETURN_TEST_RUNS_ = makeKeyword( "RETURN-TEST-RUNS?" );
    $kw135$TYPE = makeKeyword( "TYPE" );
    $kw136$RUN_NON_WORKING_TESTS = makeKeyword( "RUN-NON-WORKING-TESTS" );
    $kw137$PROGRESS_FILE = makeKeyword( "PROGRESS-FILE" );
    $kw138$RERUN_CRASHING_TESTS = makeKeyword( "RERUN-CRASHING-TESTS" );
    $sym139$RUN_ALL_CYC_TESTS_INT = makeSymbol( "RUN-ALL-CYC-TESTS-INT" );
    $list140 = ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "STREAM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*STANDARD-OUTPUT*" ) ) ), ConsesLow.list( makeSymbol(
        "VERBOSITY" ), makeKeyword( "VERBOSE" ) ), ConsesLow.list( makeSymbol( "STOP-AT-FIRST-FAILURE?" ), NIL ), ConsesLow.list( makeSymbol( "OUTPUT-FORMAT" ), makeKeyword( "STANDARD" ) ), ConsesLow.list( makeSymbol(
            "RETURN-TEST-RUNS?" ), NIL ), ConsesLow.list( makeSymbol( "TYPE" ), makeKeyword( "ALL" ) ), ConsesLow.list( makeSymbol( "RUN-NON-WORKING-TESTS" ), NIL ), ConsesLow.list( makeSymbol( "PROGRESS-FILE" ), NIL ),
      ConsesLow.list( makeSymbol( "RERUN-CRASHING-TESTS" ), NIL )
    } );
    $list141 = ConsesLow.list( new SubLObject[] { makeKeyword( "STREAM" ), makeKeyword( "VERBOSITY" ), makeKeyword( "STOP-AT-FIRST-FAILURE?" ), makeKeyword( "OUTPUT-FORMAT" ), makeKeyword( "RETURN-TEST-RUNS?" ),
      makeKeyword( "TYPE" ), makeKeyword( "RUN-NON-WORKING-TESTS" ), makeKeyword( "PROGRESS-FILE" ), makeKeyword( "RERUN-CRASHING-TESTS" )
    } );
    $kw142$VERBOSE = makeKeyword( "VERBOSE" );
    $sym143$RUN_ALL_LOADED_CYC_TESTS = makeSymbol( "RUN-ALL-LOADED-CYC-TESTS" );
    $sym144$QUOTE = makeSymbol( "QUOTE" );
    $list145 = ConsesLow.list( makeSymbol( "FILENAME" ), makeSymbol( "&KEY" ), makeSymbol( "KB" ) );
    $list146 = ConsesLow.list( makeKeyword( "KB" ) );
    $sym147$DECLARE_CYC_TEST_FILE_INT = makeSymbol( "DECLARE-CYC-TEST-FILE-INT" );
    $list148 = ConsesLow.list( new SubLObject[] { makeSymbol( "NAMES" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "STREAM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*STANDARD-OUTPUT*" ) ) ),
      ConsesLow.list( makeSymbol( "VERBOSITY" ), makeKeyword( "VERBOSE" ) ), ConsesLow.list( makeSymbol( "STOP-AT-FIRST-FAILURE?" ), NIL ), ConsesLow.list( makeSymbol( "OUTPUT-FORMAT" ), makeKeyword( "STANDARD" ) ),
      ConsesLow.list( makeSymbol( "RETURN-TEST-RUNS?" ), NIL ), ConsesLow.list( makeSymbol( "TYPE" ), makeKeyword( "ALL" ) ), ConsesLow.list( makeSymbol( "RUN-NON-WORKING-TESTS" ), NIL )
    } );
    $list149 = ConsesLow.list( makeKeyword( "STREAM" ), makeKeyword( "VERBOSITY" ), makeKeyword( "STOP-AT-FIRST-FAILURE?" ), makeKeyword( "OUTPUT-FORMAT" ), makeKeyword( "RETURN-TEST-RUNS?" ), makeKeyword( "TYPE" ),
        makeKeyword( "RUN-NON-WORKING-TESTS" ) );
    $sym150$FIND_CYC_TESTS_BY_NAME = makeSymbol( "FIND-CYC-TESTS-BY-NAME" );
    $sym151$STREAMP = makeSymbol( "STREAMP" );
    $sym152$BOOLEANP = makeSymbol( "BOOLEANP" );
    $sym153$CYC_TEST_VERBOSITY_LEVEL_P = makeSymbol( "CYC-TEST-VERBOSITY-LEVEL-P" );
    $str154$could_not_load__a_lisp_from__s = makeString( "could not load ~a.lisp from ~s" );
    $str155$Loading_test_files = makeString( "Loading test files" );
    $str156$cdolist = makeString( "cdolist" );
    $str157$_lisp = makeString( ".lisp" );
    $str158$Invalid_phase__A_of__A_specified_ = makeString( "Invalid phase ~A of ~A specified." );
    $sym159$DECLARE_CYC_TEST_FILE = makeSymbol( "DECLARE-CYC-TEST-FILE" );
    $sym160$TINY_KB_CYC_TEST_P = makeSymbol( "TINY-KB-CYC-TEST-P" );
    $int161$100 = makeInteger( 100 );
    $sym162$SERVER_SUMMARY = makeSymbol( "SERVER-SUMMARY" );
    $kw163$TEST = makeKeyword( "TEST" );
    $kw164$OWNER = makeKeyword( "OWNER" );
    $kw165$CLASSES = makeKeyword( "CLASSES" );
    $kw166$WORKING_ = makeKeyword( "WORKING?" );
    $list167 = ConsesLow.list( ConsesLow.list( NIL, NIL ) );
    $sym168$KB_STATISTICS = makeSymbol( "KB-STATISTICS" );
    $sym169$CYC_MEMORY_HOGS = makeSymbol( "CYC-MEMORY-HOGS" );
    $sym170$ALL_CYC_TESTS_ARE_VALID = makeSymbol( "ALL-CYC-TESTS-ARE-VALID" );
  }

  public static final class $cyc_test_native
      extends
        SubLStructNative
  {
    public SubLObject $file;
    public SubLObject $guts;
    private static final SubLStructDeclNative structDecl;

    public $cyc_test_native()
    {
      this.$file = CommonSymbols.NIL;
      this.$guts = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $cyc_test_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$file;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$guts;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$file = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$guts = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $cyc_test_native.class, $sym29$CYC_TEST, $sym30$CYC_TEST_P, $list31, $list32, new String[] { "$file", "$guts"
      }, $list33, $list34, $sym35$PRINT_CYC_TEST );
    }
  }

  public static final class $cyc_test_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $cyc_test_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CYC-TEST-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cyc_test_p( arg1 );
    }
  }

  public static final class $cyc_test_file_native
      extends
        SubLStructNative
  {
    public SubLObject $filename;
    public SubLObject $kb;
    private static final SubLStructDeclNative structDecl;

    public $cyc_test_file_native()
    {
      this.$filename = CommonSymbols.NIL;
      this.$kb = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $cyc_test_file_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$filename;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$kb;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$filename = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$kb = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $cyc_test_file_native.class, $sym100$CYC_TEST_FILE, $sym101$CYC_TEST_FILE_P, $list102, $list103, new String[] { "$filename", "$kb"
      }, $list104, $list105, $sym106$PRINT_CYC_TEST_FILE );
    }
  }

  public static final class $cyc_test_file_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $cyc_test_file_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CYC-TEST-FILE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cyc_test_file_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 586 ms synthetic
 */