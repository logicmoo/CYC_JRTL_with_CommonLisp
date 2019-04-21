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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_cyc_testing;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils;
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

public final class cyc_testing extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.cyc_testing";
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
    public static SubLObject testing_real_time_pruningP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cyc_testing.$test_real_time_pruningP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 3063L)
    public static SubLObject cyc_test_kb_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, (SubLObject)cyc_testing.$list3, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 3149L)
    public static SubLObject cyc_test_verbosity_level_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, cyc_testing.$cyc_test_verbosity_levels$.getGlobalValue(), Symbols.symbol_function((SubLObject)cyc_testing.EQ), (SubLObject)cyc_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 3260L)
    public static SubLObject cyc_test_output_format_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, (SubLObject)cyc_testing.$list4, Symbols.symbol_function((SubLObject)cyc_testing.EQ), (SubLObject)cyc_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 4190L)
    public static SubLObject cyc_test_result_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, cyc_testing.$cyc_test_result_values$.getGlobalValue(), (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 4345L)
    public static SubLObject cyc_test_success_result_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, cyc_testing.$cyc_test_result_success_values$.getGlobalValue(), (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 4455L)
    public static SubLObject cyc_test_failure_result_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, cyc_testing.$cyc_test_result_failure_values$.getGlobalValue(), (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 4565L)
    public static SubLObject cyc_test_ignore_result_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, cyc_testing.$cyc_test_result_ignore_values$.getGlobalValue(), (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 4673L)
    public static SubLObject cyc_test_result_L(final SubLObject result1, final SubLObject result2) {
        return list_utilities.position_L(result1, result2, cyc_testing.$cyc_test_result_values$.getGlobalValue(), (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 5405L)
    public static SubLObject cyc_test_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, cyc_testing.$cyc_test_type_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)cyc_testing.EQ), Symbols.symbol_function((SubLObject)cyc_testing.$sym9$FIRST));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 5507L)
    public static SubLObject cyc_test_type_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cyc_testing.$kw10$ALL == v_object || cyc_testing.NIL != cyc_test_type_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 5615L)
    public static SubLObject cyc_test_type_pretty_name(final SubLObject test_type) {
        assert cyc_testing.NIL != cyc_test_type_p(test_type) : test_type;
        return list_utilities.alist_lookup(cyc_testing.$cyc_test_type_table$.getGlobalValue(), test_type, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 5916L)
    public static SubLObject cyc_tests() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cyc_testing.$cyc_tests$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 6036L)
    public static SubLObject undefine_all_cyc_tests() {
        cyc_testing.$cyc_tests$.setDynamicValue((SubLObject)cyc_testing.NIL);
        Hashtables.clrhash(cyc_testing.$cyc_test_by_name$.getGlobalValue());
        Hashtables.clrhash(cyc_testing.$cyc_test_by_dwimmed_name$.getGlobalValue());
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 6187L)
    public static SubLObject do_cyc_tests(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_testing.$list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cyc_test = (SubLObject)cyc_testing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_testing.$list12);
        cyc_test = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cyc_testing.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cyc_testing.NIL;
        SubLObject current_$1 = (SubLObject)cyc_testing.NIL;
        while (cyc_testing.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing.$list12);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing.$list12);
            if (cyc_testing.NIL == conses_high.member(current_$1, (SubLObject)cyc_testing.$list13, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED)) {
                bad = (SubLObject)cyc_testing.T;
            }
            if (current_$1 == cyc_testing.$kw14$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cyc_testing.NIL != bad && cyc_testing.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_testing.$list12);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw15$DONE, current);
        final SubLObject done = (SubLObject)((cyc_testing.NIL != done_tail) ? conses_high.cadr(done_tail) : cyc_testing.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)cyc_testing.$sym16$CSOME, (SubLObject)ConsesLow.list(cyc_test, (SubLObject)cyc_testing.$list17, done), ConsesLow.append(body, (SubLObject)cyc_testing.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 6311L)
    public static SubLObject progress_do_cyc_tests(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_testing.$list18);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cyc_test = (SubLObject)cyc_testing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_testing.$list18);
        cyc_test = current.first();
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : cyc_testing.$str19$Iterating_over_all_Cyc_tests);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cyc_testing.$list18);
        current = current.rest();
        if (cyc_testing.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)cyc_testing.$sym20$PROGRESS_CDOLIST, (SubLObject)ConsesLow.list(cyc_test, (SubLObject)cyc_testing.$list17, message), ConsesLow.append(body, (SubLObject)cyc_testing.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_testing.$list18);
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 6501L)
    public static SubLObject cyc_test_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sequences.length(cyc_testing.$cyc_tests$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 6567L)
    public static SubLObject no_cyc_tests_definedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(cyc_testing.NIL == cyc_testing.$cyc_tests$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 6885L)
    public static SubLObject index_cyc_test_by_name(final SubLObject ct, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_testing.NIL != cyc_testing.$warn_on_duplicate_cyc_test_namesP$.getDynamicValue(thread) && cyc_testing.NIL != Hashtables.gethash(name, cyc_testing.$cyc_test_by_name$.getGlobalValue(), (SubLObject)cyc_testing.UNPROVIDED)) {
            Errors.warn((SubLObject)cyc_testing.$str24$A_Cyc_test_named__a_already_exist, name);
        }
        Hashtables.sethash(name, cyc_testing.$cyc_test_by_name$.getGlobalValue(), ct);
        Hashtables.sethash(name, cyc_testing.$cyc_test_by_dwimmed_name$.getGlobalValue(), ConsesLow.nconc(Hashtables.gethash(name, cyc_testing.$cyc_test_by_dwimmed_name$.getGlobalValue(), (SubLObject)cyc_testing.UNPROVIDED), (SubLObject)ConsesLow.list(ct)));
        if (name.isCons()) {
            my_pushnew_to_end_hash(name.first(), ct, cyc_testing.$cyc_test_by_dwimmed_name$.getGlobalValue());
        }
        if (cyc_testing.NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
            final SubLObject rmt = cyc_test_guts(ct);
            if (cyc_testing.NIL != Functions.funcall((SubLObject)cyc_testing.$sym25$REMOVAL_MODULE_TEST_P, rmt)) {
                my_pushnew_to_end_hash(Functions.funcall((SubLObject)cyc_testing.$sym26$REMOVAL_MODULE_TEST_PREDICATE, rmt), ct, cyc_testing.$cyc_test_by_dwimmed_name$.getGlobalValue());
            }
        }
        if (cyc_testing.NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
            final SubLObject rmct = cyc_test_guts(ct);
            if (cyc_testing.NIL != Functions.funcall((SubLObject)cyc_testing.$sym27$REMOVAL_MODULE_COST_TEST_P, rmct)) {
                my_pushnew_to_end_hash(Functions.funcall((SubLObject)cyc_testing.$sym28$REMOVAL_MODULE_COST_TEST_PREDICATE, rmct), ct, cyc_testing.$cyc_test_by_dwimmed_name$.getGlobalValue());
            }
        }
        return ct;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 8328L)
    public static SubLObject unindex_cyc_test_by_name(final SubLObject ct, final SubLObject name) {
        Hashtables.remhash(name, cyc_testing.$cyc_test_by_name$.getGlobalValue());
        my_delete_value_from_hash(name, ct, cyc_testing.$cyc_test_by_dwimmed_name$.getGlobalValue());
        if (name.isCons()) {
            my_delete_value_from_hash(name.first(), ct, cyc_testing.$cyc_test_by_dwimmed_name$.getGlobalValue());
        }
        if (cyc_testing.NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
            final SubLObject rmt = cyc_test_guts(ct);
            if (cyc_testing.NIL != Functions.funcall((SubLObject)cyc_testing.$sym25$REMOVAL_MODULE_TEST_P, rmt)) {
                my_delete_value_from_hash(Functions.funcall((SubLObject)cyc_testing.$sym26$REMOVAL_MODULE_TEST_PREDICATE, rmt), ct, cyc_testing.$cyc_test_by_dwimmed_name$.getGlobalValue());
            }
        }
        if (cyc_testing.NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
            final SubLObject rmct = cyc_test_guts(ct);
            if (cyc_testing.NIL != Functions.funcall((SubLObject)cyc_testing.$sym27$REMOVAL_MODULE_COST_TEST_P, rmct)) {
                my_delete_value_from_hash(Functions.funcall((SubLObject)cyc_testing.$sym28$REMOVAL_MODULE_COST_TEST_PREDICATE, rmct), ct, cyc_testing.$cyc_test_by_dwimmed_name$.getGlobalValue());
            }
        }
        return ct;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9127L)
    public static SubLObject my_pushnew_to_end_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return Hashtables.sethash(key, table, ConsesLow.nconc(Sequences.delete(item, Hashtables.gethash(key, table, (SubLObject)cyc_testing.UNPROVIDED), (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED), (SubLObject)ConsesLow.list(item)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9307L)
    public static SubLObject my_delete_value_from_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return Hashtables.sethash(key, table, Sequences.delete(item, Hashtables.gethash(key, table, (SubLObject)cyc_testing.UNPROVIDED), (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9470L)
    public static SubLObject index_all_cyc_tests_by_name() {
        SubLObject csome_list_var = cyc_tests();
        SubLObject ct = (SubLObject)cyc_testing.NIL;
        ct = csome_list_var.first();
        while (cyc_testing.NIL != csome_list_var) {
            index_cyc_test_by_name(ct, cyc_test_name(ct));
            csome_list_var = csome_list_var.rest();
            ct = csome_list_var.first();
        }
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
    public static SubLObject cyc_test_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cyc_test(v_object, stream, (SubLObject)cyc_testing.ZERO_INTEGER);
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
    public static SubLObject cyc_test_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $cyc_test_native.class) ? cyc_testing.T : cyc_testing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
    public static SubLObject ct_file(final SubLObject v_object) {
        assert cyc_testing.NIL != cyc_test_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
    public static SubLObject ct_guts(final SubLObject v_object) {
        assert cyc_testing.NIL != cyc_test_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
    public static SubLObject _csetf_ct_file(final SubLObject v_object, final SubLObject value) {
        assert cyc_testing.NIL != cyc_test_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
    public static SubLObject _csetf_ct_guts(final SubLObject v_object, final SubLObject value) {
        assert cyc_testing.NIL != cyc_test_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
    public static SubLObject make_cyc_test(SubLObject arglist) {
        if (arglist == cyc_testing.UNPROVIDED) {
            arglist = (SubLObject)cyc_testing.NIL;
        }
        final SubLObject v_new = (SubLObject)new $cyc_test_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)cyc_testing.NIL, next = arglist; cyc_testing.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)cyc_testing.$kw42$FILE)) {
                _csetf_ct_file(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cyc_testing.$kw43$GUTS)) {
                _csetf_ct_guts(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)cyc_testing.$str44$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
    public static SubLObject visit_defstruct_cyc_test(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)cyc_testing.$kw45$BEGIN, (SubLObject)cyc_testing.$sym46$MAKE_CYC_TEST, (SubLObject)cyc_testing.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)cyc_testing.$kw47$SLOT, (SubLObject)cyc_testing.$kw42$FILE, ct_file(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cyc_testing.$kw47$SLOT, (SubLObject)cyc_testing.$kw43$GUTS, ct_guts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cyc_testing.$kw48$END, (SubLObject)cyc_testing.$sym46$MAKE_CYC_TEST, (SubLObject)cyc_testing.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9769L)
    public static SubLObject visit_defstruct_object_cyc_test_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cyc_test(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9932L)
    public static SubLObject print_cyc_test(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject file = ct_file(v_object);
        if (cyc_testing.NIL != file) {
            PrintLow.format(stream, (SubLObject)cyc_testing.$str50$__CYC_TEST__a__a_, Strings.string_upcase(file, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED), ct_guts(v_object));
        }
        else {
            PrintLow.format(stream, (SubLObject)cyc_testing.$str51$__CYC_TEST__a_, ct_guts(v_object));
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 10197L)
    public static SubLObject new_cyc_test(final SubLObject file, final SubLObject guts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_testing.NIL != file && !cyc_testing.assertionsDisabledInClass && cyc_testing.NIL == Types.stringp(file)) {
            throw new AssertionError(file);
        }
        if (cyc_testing.NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
            if (cyc_testing.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && cyc_testing.NIL == Functions.funcall((SubLObject)cyc_testing.$sym53$CYC_TEST_GUTS_P, guts)) {
                Errors.error((SubLObject)cyc_testing.$str54$_s_is_not_a_CYC_TEST_GUTS_P, guts);
            }
        }
        else {
            assert cyc_testing.NIL != generic_testing.generic_test_case_table_p(guts) : guts;
        }
        final SubLObject ct = make_cyc_test((SubLObject)cyc_testing.UNPROVIDED);
        _csetf_ct_file(ct, file);
        _csetf_ct_guts(ct, guts);
        final SubLObject name = (cyc_testing.NIL != cyc_testing_initialization.cyc_tests_initializedP()) ? Functions.funcall((SubLObject)cyc_testing.$sym56$CYC_TEST_NAME, ct) : generic_testing.generic_test_case_table_name(guts);
        final SubLObject existing_ct = find_cyc_test_by_exact_name(name);
        if (cyc_testing.NIL != existing_ct) {
            cyc_testing.$cyc_tests$.setDynamicValue(Sequences.delete(existing_ct, cyc_testing.$cyc_tests$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)cyc_testing.EQ), (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED), thread);
            unindex_cyc_test_by_name(existing_ct, name);
        }
        final SubLObject new_cons = (SubLObject)ConsesLow.cons(ct, (SubLObject)cyc_testing.NIL);
        final SubLObject list = cyc_testing.$cyc_tests$.getDynamicValue(thread);
        if (cyc_testing.NIL != list) {
            subl_macros.rplacd_last(list, new_cons);
        }
        else {
            cyc_testing.$cyc_tests$.setDynamicValue(new_cons, thread);
        }
        index_cyc_test_by_name(ct, name);
        return ct;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11104L)
    public static SubLObject undeclare_cyc_test(final SubLObject test_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing_ct = find_cyc_test_by_exact_name(test_name);
        if (cyc_testing.NIL != existing_ct) {
            cyc_testing.$cyc_tests$.setDynamicValue(Sequences.delete(existing_ct, cyc_testing.$cyc_tests$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)cyc_testing.EQ), (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED), thread);
            unindex_cyc_test_by_name(existing_ct, test_name);
            return (SubLObject)cyc_testing.T;
        }
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11471L)
    public static SubLObject cyc_test_file(final SubLObject ct) {
        return ct_file(ct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11540L)
    public static SubLObject cyc_test_guts(final SubLObject ct) {
        return ct_guts(ct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11600L)
    public static SubLObject cyc_test_type(final SubLObject ct) {
        final SubLObject type = cyc_test_type_permissive(ct);
        if (cyc_testing.NIL != type) {
            return type;
        }
        return Errors.error((SubLObject)cyc_testing.$str57$Cyc_test_of_unexpected_type___s, ct);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11781L)
    public static SubLObject cyc_test_guts_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(cyc_test_guts_type(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11870L)
    public static SubLObject cyc_test_type_permissive(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        return cyc_test_guts_type(guts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11991L)
    public static SubLObject cyc_test_guts_type(final SubLObject guts) {
        if (cyc_testing.NIL != generic_testing.generic_test_case_table_p(guts)) {
            return (SubLObject)cyc_testing.$kw58$TCT;
        }
        if (cyc_testing.NIL != inference_unit_tests.inference_unit_test_p(guts)) {
            return (SubLObject)cyc_testing.$kw59$IUT;
        }
        if (cyc_testing.NIL != removal_module_tests.removal_module_test_p(guts)) {
            return (SubLObject)cyc_testing.$kw60$RMT;
        }
        if (cyc_testing.NIL != removal_module_cost_tests.removal_module_cost_test_p(guts)) {
            return (SubLObject)cyc_testing.$kw61$RMCT;
        }
        if (cyc_testing.NIL != transformation_module_tests.transformation_module_test_p(guts)) {
            return (SubLObject)cyc_testing.$kw62$TMT;
        }
        if (cyc_testing.NIL != evaluatable_relation_tests.evaluatable_relation_test_p(guts)) {
            return (SubLObject)cyc_testing.$kw63$ERT;
        }
        if (cyc_testing.NIL != inference_testing.inference_test_p(guts)) {
            return (SubLObject)cyc_testing.$kw64$IT;
        }
        if (cyc_testing.NIL != kct_utils.kct_test_spec_permissive_p(guts)) {
            return (SubLObject)cyc_testing.$kw65$KCT;
        }
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 12460L)
    public static SubLObject cyc_test_name(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql((SubLObject)cyc_testing.$kw59$IUT)) {
            return inference_unit_tests.inference_unit_test_name(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw64$IT)) {
            return guts;
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw60$RMT)) {
            return removal_module_tests.removal_module_test_name(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw62$TMT)) {
            return transformation_module_tests.transformation_module_test_name(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw61$RMCT)) {
            return removal_module_cost_tests.removal_module_cost_test_name(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw63$ERT)) {
            return evaluatable_relation_tests.evaluatable_relation_test_name(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw58$TCT)) {
            return generic_testing.generic_test_case_table_name(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw65$KCT)) {
            return kct_cyc_testing.kct_test_spec_name(guts);
        }
        return Errors.error((SubLObject)cyc_testing.$str57$Cyc_test_of_unexpected_type___s, guts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 13093L)
    public static SubLObject cyc_test_id(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql((SubLObject)cyc_testing.$kw59$IUT)) {
            return (SubLObject)cyc_testing.NIL;
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw64$IT)) {
            return (SubLObject)cyc_testing.NIL;
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw60$RMT)) {
            return removal_module_tests.removal_module_test_id(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw62$TMT)) {
            return transformation_module_tests.transformation_module_test_id(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw61$RMCT)) {
            return removal_module_cost_tests.removal_module_cost_test_id(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw63$ERT)) {
            return evaluatable_relation_tests.evaluatable_relation_test_id(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw58$TCT)) {
            return (SubLObject)cyc_testing.NIL;
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw65$KCT)) {
            return (SubLObject)cyc_testing.NIL;
        }
        return Errors.error((SubLObject)cyc_testing.$str57$Cyc_test_of_unexpected_type___s, guts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 13633L)
    public static SubLObject cyc_test_kb(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql((SubLObject)cyc_testing.$kw59$IUT)) {
            return inference_unit_tests.inference_unit_test_kb(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw64$IT)) {
            return inference_testing.inference_test_kb(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw60$RMT)) {
            return removal_module_tests.removal_module_test_kb(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw62$TMT)) {
            return transformation_module_tests.transformation_module_test_kb(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw61$RMCT)) {
            return removal_module_cost_tests.removal_module_cost_test_kb(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw63$ERT)) {
            return evaluatable_relation_tests.evaluatable_relation_test_kb(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw58$TCT)) {
            return generic_testing.generic_test_case_table_kb(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw65$KCT)) {
            return kct_cyc_testing.kct_test_spec_kb(guts);
        }
        return Errors.error((SubLObject)cyc_testing.$str57$Cyc_test_of_unexpected_type___s, guts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 14217L)
    public static SubLObject cyc_test_owner(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql((SubLObject)cyc_testing.$kw59$IUT)) {
            return inference_unit_tests.inference_unit_test_owner(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw64$IT)) {
            return inference_testing.inference_test_owner(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw60$RMT)) {
            return removal_module_tests.removal_module_test_owner(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw62$TMT)) {
            return transformation_module_tests.transformation_module_test_owner(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw61$RMCT)) {
            return removal_module_cost_tests.removal_module_cost_test_owner(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw63$ERT)) {
            return evaluatable_relation_tests.evaluatable_relation_test_owner(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw58$TCT)) {
            return generic_testing.generic_test_case_table_owner(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw65$KCT)) {
            return kct_cyc_testing.kct_test_spec_owner(guts);
        }
        return Errors.error((SubLObject)cyc_testing.$str57$Cyc_test_of_unexpected_type___s, guts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 14828L)
    public static SubLObject cyc_test_workingP(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql((SubLObject)cyc_testing.$kw59$IUT)) {
            return inference_unit_tests.inference_unit_test_workingP(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw64$IT)) {
            return inference_testing.inference_test_workingP(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw60$RMT)) {
            return removal_module_tests.removal_module_test_workingP(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw62$TMT)) {
            return transformation_module_tests.transformation_module_test_workingP(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw61$RMCT)) {
            return removal_module_cost_tests.removal_module_cost_test_workingP(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw63$ERT)) {
            return evaluatable_relation_tests.evaluatable_relation_test_workingP(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw58$TCT)) {
            return generic_testing.generic_test_case_table_workingP(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw65$KCT)) {
            return kct_cyc_testing.kct_test_spec_workingP(guts);
        }
        return Errors.error((SubLObject)cyc_testing.$str57$Cyc_test_of_unexpected_type___s, guts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 15466L)
    public static SubLObject cyc_test_comment(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql((SubLObject)cyc_testing.$kw59$IUT)) {
            return inference_unit_tests.inference_unit_test_comment(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw64$IT)) {
            return inference_testing.inference_test_comment(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw60$RMT)) {
            return removal_module_tests.removal_module_test_comment(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw62$TMT)) {
            return transformation_module_tests.transformation_module_test_comment(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw61$RMCT)) {
            return removal_module_cost_tests.removal_module_cost_test_comment(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw63$ERT)) {
            return evaluatable_relation_tests.evaluatable_relation_test_comment(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw58$TCT)) {
            return generic_testing.generic_test_case_table_comment(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw65$KCT)) {
            return kct_cyc_testing.kct_test_spec_comment(guts);
        }
        return Errors.error((SubLObject)cyc_testing.$str57$Cyc_test_of_unexpected_type___s, guts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 16095L)
    public static SubLObject cyc_test_project(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql((SubLObject)cyc_testing.$kw59$IUT)) {
            return (SubLObject)cyc_testing.NIL;
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw64$IT)) {
            return (SubLObject)cyc_testing.NIL;
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw60$RMT)) {
            return (SubLObject)cyc_testing.NIL;
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw62$TMT)) {
            return (SubLObject)cyc_testing.NIL;
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw61$RMCT)) {
            return (SubLObject)cyc_testing.NIL;
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw63$ERT)) {
            return (SubLObject)cyc_testing.NIL;
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw58$TCT)) {
            return (SubLObject)cyc_testing.NIL;
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw65$KCT)) {
            return kct_cyc_testing.kct_test_spec_project(guts);
        }
        return Errors.error((SubLObject)cyc_testing.$str57$Cyc_test_of_unexpected_type___s, guts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 16490L)
    public static SubLObject cyc_test_names_mentioning_invalid_constants(SubLObject tests) {
        if (tests == cyc_testing.UNPROVIDED) {
            tests = cyc_tests();
        }
        SubLObject all_invalid_test_names = (SubLObject)cyc_testing.NIL;
        SubLObject cdolist_list_var = tests;
        SubLObject test = (SubLObject)cyc_testing.NIL;
        test = cdolist_list_var.first();
        while (cyc_testing.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2;
            final SubLObject invalid_test_names = cdolist_list_var_$2 = cyc_test_invalid_constant_test_names(test);
            SubLObject invalid_test_name = (SubLObject)cyc_testing.NIL;
            invalid_test_name = cdolist_list_var_$2.first();
            while (cyc_testing.NIL != cdolist_list_var_$2) {
                all_invalid_test_names = (SubLObject)ConsesLow.cons(invalid_test_name, all_invalid_test_names);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                invalid_test_name = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            test = cdolist_list_var.first();
        }
        return Sequences.nreverse(all_invalid_test_names);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 17014L)
    public static SubLObject cyc_test_invalid_constant_test_names(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql((SubLObject)cyc_testing.$kw59$IUT)) {
            if (cyc_testing.NIL != inference_unit_tests.inference_unit_test_mentions_invalid_constantP(guts)) {
                return (SubLObject)ConsesLow.list(cyc_test_name(ct));
            }
        }
        else if (pcase_var.eql((SubLObject)cyc_testing.$kw64$IT)) {
            if (cyc_testing.NIL != inference_testing.inference_test_mentions_invalid_constantP(guts)) {
                return (SubLObject)ConsesLow.list(cyc_test_name(ct));
            }
        }
        else if (pcase_var.eql((SubLObject)cyc_testing.$kw60$RMT)) {
            if (cyc_testing.NIL != removal_module_tests.removal_module_test_mentions_invalid_constantP(guts)) {
                return (SubLObject)ConsesLow.list(cyc_test_name(ct));
            }
        }
        else if (pcase_var.eql((SubLObject)cyc_testing.$kw62$TMT)) {
            if (cyc_testing.NIL != transformation_module_tests.transformation_module_test_mentions_invalid_constantP(guts)) {
                return (SubLObject)ConsesLow.list(cyc_test_name(ct));
            }
        }
        else if (pcase_var.eql((SubLObject)cyc_testing.$kw61$RMCT)) {
            if (cyc_testing.NIL != removal_module_cost_tests.removal_module_cost_test_mentions_invalid_constantP(guts)) {
                return (SubLObject)ConsesLow.list(cyc_test_name(ct));
            }
        }
        else if (pcase_var.eql((SubLObject)cyc_testing.$kw63$ERT)) {
            if (cyc_testing.NIL != evaluatable_relation_tests.evaluatable_relation_test_mentions_invalid_constantP(guts)) {
                return (SubLObject)ConsesLow.list(cyc_test_name(ct));
            }
        }
        else {
            if (pcase_var.eql((SubLObject)cyc_testing.$kw58$TCT)) {
                return generic_testing.generic_test_case_table_tuples_mentioning_some_invalid_constant(guts);
            }
            if (!pcase_var.eql((SubLObject)cyc_testing.$kw65$KCT)) {
                return Errors.error((SubLObject)cyc_testing.$str57$Cyc_test_of_unexpected_type___s, guts);
            }
            if (cyc_testing.NIL != kct_cyc_testing.kct_test_spec_mentions_invalid_constantP(guts)) {
                return (SubLObject)ConsesLow.list(cyc_test_name(ct));
            }
        }
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 18124L)
    public static SubLObject cyc_tests_mentioning_invalid_constants(SubLObject tests) {
        if (tests == cyc_testing.UNPROVIDED) {
            tests = cyc_tests();
        }
        SubLObject result = (SubLObject)cyc_testing.NIL;
        SubLObject cdolist_list_var = tests;
        SubLObject ct = (SubLObject)cyc_testing.NIL;
        ct = cdolist_list_var.first();
        while (cyc_testing.NIL != cdolist_list_var) {
            if (cyc_testing.NIL != cyc_test_workingP(ct) && cyc_testing.NIL != cyc_test_invalidP(ct)) {
                result = (SubLObject)ConsesLow.cons(ct, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ct = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 18369L)
    public static SubLObject cyc_test_invalidP(final SubLObject ct) {
        return list_utilities.sublisp_boolean(cyc_test_invalid_constants(ct));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 18460L)
    public static SubLObject cyc_test_invalid_constants(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql((SubLObject)cyc_testing.$kw59$IUT)) {
            return inference_unit_tests.inference_unit_test_invalid_constants(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw64$IT)) {
            return inference_testing.inference_test_invalid_constants(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw60$RMT)) {
            return removal_module_tests.removal_module_test_invalid_constants(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw62$TMT)) {
            return transformation_module_tests.transformation_module_test_invalid_constants(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw61$RMCT)) {
            return removal_module_cost_tests.removal_module_cost_test_invalid_constants(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw63$ERT)) {
            return evaluatable_relation_tests.evaluatable_relation_test_invalid_constants(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw58$TCT)) {
            return generic_testing.generic_test_case_table_tuples_invalid_constants(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing.$kw65$KCT)) {
            return kct_cyc_testing.kct_test_spec_invalid_constants(guts);
        }
        return Errors.error((SubLObject)cyc_testing.$str57$Cyc_test_of_unexpected_type___s, guts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 19641L)
    public static SubLObject print_post_build_test_summary(final SubLObject stream, final SubLObject result, final SubLObject type, final SubLObject name, final SubLObject time, final SubLObject owner) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (result == cyc_testing.$kw66$NOT_RUN) {
            return (SubLObject)cyc_testing.NIL;
        }
        if (cyc_testing.NIL != cyc_testing.$print_post_build_test_summary_timestampP$.getDynamicValue(thread)) {
            return format_nil.force_format(stream, (SubLObject)cyc_testing.$str67$___A__S__S__S____3f___OWNER__S__, numeric_date_utilities.timestring_ms((SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED), result, type, name, time, owner, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED);
        }
        return format_nil.force_format(stream, (SubLObject)cyc_testing.$str68$___S__S__S____3f___OWNER__S__, result, type, name, time, owner, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 20111L)
    public static SubLObject tiny_kb_cyc_test_p(final SubLObject v_object) {
        if (cyc_testing.NIL != cyc_test_p(v_object)) {
            final SubLObject kb = cyc_test_kb(v_object);
            return (SubLObject)SubLObjectFactory.makeBoolean(cyc_testing.$kw69$TINY == kb || cyc_testing.$kw70$BOTH == kb);
        }
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 20469L)
    public static SubLObject full_kb_cyc_test_p(final SubLObject v_object) {
        if (cyc_testing.NIL != cyc_test_p(v_object)) {
            final SubLObject kb = cyc_test_kb(v_object);
            return (SubLObject)SubLObjectFactory.makeBoolean(cyc_testing.$kw71$FULL == kb || cyc_testing.$kw70$BOTH == kb);
        }
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 20813L)
    public static SubLObject non_working_cyc_tests(SubLObject type) {
        if (type == cyc_testing.UNPROVIDED) {
            type = (SubLObject)cyc_testing.NIL;
        }
        if (cyc_testing.NIL != type && !cyc_testing.assertionsDisabledInClass && cyc_testing.NIL == cyc_test_type_spec_p(type)) {
            throw new AssertionError(type);
        }
        final SubLObject all_tests = cyc_tests();
        SubLObject all_non_working_tests = Sequences.remove_if(Symbols.symbol_function((SubLObject)cyc_testing.$sym73$CYC_TEST_WORKING_), all_tests, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED);
        if (cyc_testing.NIL != type) {
            all_non_working_tests = Sequences.remove(type, all_non_working_tests, Symbols.symbol_function((SubLObject)cyc_testing.$sym74$NOT_EQ), Symbols.symbol_function((SubLObject)cyc_testing.$sym75$CYC_TEST_TYPE), (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED);
        }
        return all_non_working_tests;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 21338L)
    public static SubLObject find_cyc_test_by_exact_name(final SubLObject name) {
        return Hashtables.gethash(name, cyc_testing.$cyc_test_by_name$.getGlobalValue(), (SubLObject)cyc_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 21478L)
    public static SubLObject find_cyc_test(final SubLObject name) {
        return find_cyc_tests(name).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 21554L)
    public static SubLObject find_cyc_tests(final SubLObject name) {
        SubLObject tests = (SubLObject)cyc_testing.NIL;
        SubLObject cdolist_list_var;
        final SubLObject dwimmed_names = cdolist_list_var = (SubLObject)ConsesLow.cons(name, generic_testing.test_cases_of_class(name));
        SubLObject dwimmed_name = (SubLObject)cyc_testing.NIL;
        dwimmed_name = cdolist_list_var.first();
        while (cyc_testing.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$3 = Hashtables.gethash_without_values(dwimmed_name, cyc_testing.$cyc_test_by_dwimmed_name$.getGlobalValue(), (SubLObject)cyc_testing.UNPROVIDED);
            SubLObject test = (SubLObject)cyc_testing.NIL;
            test = cdolist_list_var_$3.first();
            while (cyc_testing.NIL != cdolist_list_var_$3) {
                final SubLObject item_var = test;
                if (cyc_testing.NIL == conses_high.member(item_var, tests, Symbols.symbol_function((SubLObject)cyc_testing.EQL), Symbols.symbol_function((SubLObject)cyc_testing.IDENTITY))) {
                    tests = (SubLObject)ConsesLow.cons(item_var, tests);
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
    public static SubLObject find_cyc_test_number(final SubLObject name, final SubLObject test_number) {
        return find_cyc_tests_in_range(name, test_number, test_number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 22048L)
    public static SubLObject find_cyc_tests_in_range(final SubLObject name, final SubLObject min_number, final SubLObject max_number) {
        SubLObject tests = (SubLObject)cyc_testing.NIL;
        SubLObject cdolist_list_var;
        final SubLObject dwimmed_names = cdolist_list_var = (SubLObject)ConsesLow.cons(name, generic_testing.test_cases_of_class(name));
        SubLObject dwimmed_name = (SubLObject)cyc_testing.NIL;
        dwimmed_name = cdolist_list_var.first();
        while (cyc_testing.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$4 = Hashtables.gethash_without_values(dwimmed_name, cyc_testing.$cyc_test_by_dwimmed_name$.getGlobalValue(), (SubLObject)cyc_testing.UNPROVIDED);
            SubLObject test = (SubLObject)cyc_testing.NIL;
            test = cdolist_list_var_$4.first();
            while (cyc_testing.NIL != cdolist_list_var_$4) {
                final SubLObject test_id = cyc_test_id(test);
                if (cyc_testing.NIL != test_id) {
                    if (test_id.numGE(min_number) && test_id.numLE(max_number)) {
                        final SubLObject item_var = test;
                        if (cyc_testing.NIL == conses_high.member(item_var, tests, Symbols.symbol_function((SubLObject)cyc_testing.EQL), Symbols.symbol_function((SubLObject)cyc_testing.IDENTITY))) {
                            tests = (SubLObject)ConsesLow.cons(item_var, tests);
                        }
                    }
                }
                else {
                    final SubLObject item_var = test;
                    if (cyc_testing.NIL == conses_high.member(item_var, tests, Symbols.symbol_function((SubLObject)cyc_testing.EQL), Symbols.symbol_function((SubLObject)cyc_testing.IDENTITY))) {
                        tests = (SubLObject)ConsesLow.cons(item_var, tests);
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
    public static SubLObject find_cyc_tests_by_name(final SubLObject names) {
        return Sequences.delete((SubLObject)cyc_testing.NIL, Mapping.mapcar(Symbols.symbol_function((SubLObject)cyc_testing.$sym76$FIND_CYC_TEST), names), (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 22867L)
    public static SubLObject find_cyc_test_filename(final SubLObject name) {
        final SubLObject cyc_test = find_cyc_test(name);
        if (cyc_testing.NIL != cyc_test) {
            return cyc_test_file(cyc_test);
        }
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 23317L)
    public static SubLObject cfasl_output_object_cyc_test_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_wide_output_cyc_test(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 23433L)
    public static SubLObject cfasl_wide_output_cyc_test(final SubLObject cyc_test, final SubLObject stream) {
        cfasl.cfasl_output_wide_opcode(cyc_testing.$cfasl_wide_opcode_cyc_test$.getGlobalValue(), stream);
        return cfasl_output_cyc_test_internal(cyc_test, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 23619L)
    public static SubLObject cfasl_output_cyc_test_internal(final SubLObject cyc_test, final SubLObject stream) {
        cfasl.cfasl_output(cyc_test_file(cyc_test), stream);
        cfasl.cfasl_output(cyc_test_guts(cyc_test), stream);
        return cyc_test;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 23801L)
    public static SubLObject cfasl_input_cyc_test(final SubLObject stream) {
        final SubLObject file = cfasl.cfasl_input(stream, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED);
        final SubLObject guts = cfasl.cfasl_input(stream, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED);
        return new_cyc_test(file, guts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 23961L)
    public static SubLObject new_cyc_test_run(final SubLObject type, final SubLObject name, final SubLObject result, final SubLObject time) {
        assert cyc_testing.NIL != cyc_test_type_p(type) : type;
        assert cyc_testing.NIL != cyc_test_result_p(result) : result;
        if (cyc_testing.NIL != time && !cyc_testing.assertionsDisabledInClass && cyc_testing.NIL == number_utilities.non_negative_number_p(time)) {
            throw new AssertionError(time);
        }
        return (SubLObject)ConsesLow.list(type, name, result, time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 24268L)
    public static SubLObject cyc_test_run_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && cyc_testing.NIL != list_utilities.lengthE(v_object, (SubLObject)cyc_testing.FOUR_INTEGER, (SubLObject)cyc_testing.UNPROVIDED) && cyc_testing.NIL != cyc_test_type_p(v_object.first()) && cyc_testing.NIL != cyc_test_result_p(conses_high.third(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 24459L)
    public static SubLObject cyc_test_run_type(final SubLObject test_run) {
        assert cyc_testing.NIL != cyc_test_run_p(test_run) : test_run;
        return test_run.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 24581L)
    public static SubLObject cyc_test_run_name(final SubLObject test_run) {
        assert cyc_testing.NIL != cyc_test_run_p(test_run) : test_run;
        return conses_high.second(test_run);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 24692L)
    public static SubLObject cyc_test_run_result(final SubLObject test_run) {
        assert cyc_testing.NIL != cyc_test_run_p(test_run) : test_run;
        return conses_high.third(test_run);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 24804L)
    public static SubLObject cyc_test_run_time(final SubLObject test_run) {
        assert cyc_testing.NIL != cyc_test_run_p(test_run) : test_run;
        return conses_high.fourth(test_run);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 24915L)
    public static SubLObject cyc_test_run_cyc_test(final SubLObject test_run) {
        SubLObject name = cyc_test_run_name(test_run);
        if (cyc_testing.$kw64$IT == cyc_test_run_type(test_run) && cyc_testing.NIL == list_utilities.member_eqP(cyc_test_run_result(test_run), (SubLObject)cyc_testing.$list83)) {
            name = name.first();
        }
        if (cyc_testing.$kw58$TCT == cyc_test_run_type(test_run) && cyc_test_run_result(test_run) != cyc_testing.$kw66$NOT_RUN) {
            name = name.first();
        }
        return find_cyc_test_by_exact_name(name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 25648L)
    public static SubLObject cyc_test_runs_overall_result(final SubLObject test_runs) {
        SubLObject overall_result = (SubLObject)cyc_testing.$kw66$NOT_RUN;
        SubLObject cdolist_list_var = test_runs;
        SubLObject test_run = (SubLObject)cyc_testing.NIL;
        test_run = cdolist_list_var.first();
        while (cyc_testing.NIL != cdolist_list_var) {
            final SubLObject test_result = cyc_test_run_result(test_run);
            overall_result = cyc_test_result_update(overall_result, test_result);
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        return overall_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 25953L)
    public static SubLObject cyc_test_result_update(final SubLObject overall_result, final SubLObject test_result) {
        if (cyc_testing.NIL != cyc_test_ignore_result_p(overall_result)) {
            return test_result;
        }
        if (cyc_testing.NIL != cyc_test_failure_result_p(overall_result)) {
            return (SubLObject)cyc_testing.$kw84$FAILURE;
        }
        if (cyc_testing.NIL == cyc_test_success_result_p(overall_result)) {
            return (SubLObject)cyc_testing.NIL;
        }
        if (cyc_testing.NIL != cyc_test_failure_result_p(test_result)) {
            return (SubLObject)cyc_testing.$kw84$FAILURE;
        }
        return (SubLObject)cyc_testing.$kw85$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 26305L)
    public static SubLObject cyc_test_runs_total_time(final SubLObject test_runs) {
        SubLObject total_time = (SubLObject)cyc_testing.ZERO_INTEGER;
        SubLObject cdolist_list_var = test_runs;
        SubLObject test_run = (SubLObject)cyc_testing.NIL;
        test_run = cdolist_list_var.first();
        while (cyc_testing.NIL != cdolist_list_var) {
            final SubLObject test_time = cyc_test_run_time(test_run);
            if (cyc_testing.NIL != test_time) {
                total_time = Numbers.add(total_time, test_time);
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        }
        return total_time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 26547L)
    public static SubLObject failing_cyc_test_run_p(final SubLObject test_run) {
        final SubLObject result = cyc_test_run_result(test_run);
        return cyc_test_failure_result_p(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 26694L)
    public static SubLObject succeeding_cyc_test_run_p(final SubLObject test_run) {
        final SubLObject result = cyc_test_run_result(test_run);
        return cyc_test_success_result_p(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 26844L)
    public static SubLObject ignored_cyc_test_run_p(final SubLObject test_run) {
        final SubLObject result = cyc_test_run_result(test_run);
        return cyc_test_ignore_result_p(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 26990L)
    public static SubLObject cyc_test_run_owner(final SubLObject test_run) {
        final SubLObject ct = cyc_test_run_cyc_test(test_run);
        if (cyc_testing.NIL != ct) {
            return cyc_test_owner(ct);
        }
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 27133L)
    public static SubLObject cyc_test_run_project(final SubLObject test_run) {
        final SubLObject ct = cyc_test_run_cyc_test(test_run);
        if (cyc_testing.NIL != ct) {
            return cyc_test_project(ct);
        }
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 27280L)
    public static SubLObject print_cyc_test_run_summary(final SubLObject test_run, final SubLObject stream, final SubLObject output_format, final SubLObject verbosity) {
        if (cyc_testing.$kw86$SILENT != verbosity) {
            final SubLObject name = cyc_test_run_name(test_run);
            final SubLObject type = cyc_test_run_type(test_run);
            final SubLObject result = cyc_test_run_result(test_run);
            final SubLObject owner = cyc_test_run_owner(test_run);
            final SubLObject time = cyc_test_run_time(test_run);
            if (output_format.eql((SubLObject)cyc_testing.$kw0$STANDARD)) {
                PrintLow.format(stream, (SubLObject)cyc_testing.$str87$___S__S_____S___S_, new SubLObject[] { type, name, result, time });
            }
            else if (output_format.eql((SubLObject)cyc_testing.$kw88$POST_BUILD)) {
                print_post_build_test_summary(stream, result, type, name, time, owner);
            }
            else {
                PrintLow.format(stream, (SubLObject)cyc_testing.$str89$Unknown_output_format__A, output_format);
            }
            streams_high.force_output(stream);
        }
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 27932L)
    public static SubLObject cyc_test_run_summary(final SubLObject test_run, final SubLObject output_format, final SubLObject verbosity) {
        if (cyc_testing.$kw86$SILENT == verbosity) {
            return (SubLObject)cyc_testing.NIL;
        }
        final SubLObject name = cyc_test_run_name(test_run);
        final SubLObject type = cyc_test_run_type(test_run);
        final SubLObject result = cyc_test_run_result(test_run);
        final SubLObject owner = cyc_test_run_owner(test_run);
        final SubLObject time = cyc_test_run_time(test_run);
        if (output_format.eql((SubLObject)cyc_testing.$kw0$STANDARD)) {
            return PrintLow.format((SubLObject)cyc_testing.NIL, (SubLObject)cyc_testing.$str87$___S__S_____S___S_, new SubLObject[] { type, name, result, time });
        }
        if (output_format.eql((SubLObject)cyc_testing.$kw88$POST_BUILD)) {
            return print_post_build_test_summary((SubLObject)cyc_testing.NIL, result, type, name, time, owner);
        }
        if (output_format.eql((SubLObject)cyc_testing.$kw90$WITH_OWNER)) {
            return Sequences.cconcatenate(format_nil.format_nil_s_no_copy(result), new SubLObject[] { cyc_testing.$str91$_, format_nil.format_nil_s_no_copy(time), cyc_testing.$str91$_, format_nil.format_nil_s_no_copy(type), cyc_testing.$str91$_, format_nil.format_nil_s_no_copy(name), cyc_testing.$str91$_, format_nil.format_nil_s_no_copy(owner), format_nil.$format_nil_percent$.getGlobalValue() });
        }
        return Sequences.cconcatenate((SubLObject)cyc_testing.$str92$Unknown_output_format_, format_nil.format_nil_a_no_copy(output_format));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 28827L)
    public static SubLObject cyc_test_files() {
        return cyc_testing.$cyc_test_files$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 28890L)
    public static SubLObject do_cyc_test_files(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_testing.$list94);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cyc_test_file = (SubLObject)cyc_testing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_testing.$list94);
        cyc_test_file = current.first();
        current = current.rest();
        if (cyc_testing.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)cyc_testing.$sym95$CDOLIST, reader.bq_cons(cyc_test_file, (SubLObject)cyc_testing.$list96), ConsesLow.append(body, (SubLObject)cyc_testing.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_testing.$list94);
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29020L)
    public static SubLObject progress_do_cyc_test_files(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_testing.$list97);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cyc_test_file = (SubLObject)cyc_testing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_testing.$list97);
        cyc_test_file = current.first();
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : cyc_testing.$str98$Iterating_over_all_test_files);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)cyc_testing.$list97);
        current = current.rest();
        if (cyc_testing.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)cyc_testing.$sym20$PROGRESS_CDOLIST, (SubLObject)ConsesLow.list(cyc_test_file, (SubLObject)cyc_testing.$list99, message), ConsesLow.append(body, (SubLObject)cyc_testing.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_testing.$list97);
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29231L)
    public static SubLObject cyc_test_file_count() {
        return Sequences.length(cyc_testing.$cyc_test_files$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
    public static SubLObject cyc_test_file_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cyc_test_file(v_object, stream, (SubLObject)cyc_testing.ZERO_INTEGER);
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
    public static SubLObject cyc_test_file_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $cyc_test_file_native.class) ? cyc_testing.T : cyc_testing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
    public static SubLObject ctf_filename(final SubLObject v_object) {
        assert cyc_testing.NIL != cyc_test_file_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
    public static SubLObject ctf_kb(final SubLObject v_object) {
        assert cyc_testing.NIL != cyc_test_file_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
    public static SubLObject _csetf_ctf_filename(final SubLObject v_object, final SubLObject value) {
        assert cyc_testing.NIL != cyc_test_file_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
    public static SubLObject _csetf_ctf_kb(final SubLObject v_object, final SubLObject value) {
        assert cyc_testing.NIL != cyc_test_file_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
    public static SubLObject make_cyc_test_file(SubLObject arglist) {
        if (arglist == cyc_testing.UNPROVIDED) {
            arglist = (SubLObject)cyc_testing.NIL;
        }
        final SubLObject v_new = (SubLObject)new $cyc_test_file_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)cyc_testing.NIL, next = arglist; cyc_testing.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)cyc_testing.$kw113$FILENAME)) {
                _csetf_ctf_filename(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cyc_testing.$kw114$KB)) {
                _csetf_ctf_kb(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)cyc_testing.$str44$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
    public static SubLObject visit_defstruct_cyc_test_file(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)cyc_testing.$kw45$BEGIN, (SubLObject)cyc_testing.$sym115$MAKE_CYC_TEST_FILE, (SubLObject)cyc_testing.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)cyc_testing.$kw47$SLOT, (SubLObject)cyc_testing.$kw113$FILENAME, ctf_filename(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cyc_testing.$kw47$SLOT, (SubLObject)cyc_testing.$kw114$KB, ctf_kb(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cyc_testing.$kw48$END, (SubLObject)cyc_testing.$sym115$MAKE_CYC_TEST_FILE, (SubLObject)cyc_testing.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29499L)
    public static SubLObject visit_defstruct_object_cyc_test_file_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cyc_test_file(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29613L)
    public static SubLObject print_cyc_test_file(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)cyc_testing.$str117$__CTF__a_, ctf_filename(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 29757L)
    public static SubLObject new_cyc_test_file(final SubLObject filename, final SubLObject kb) {
        assert cyc_testing.NIL != Types.stringp(filename) : filename;
        assert cyc_testing.NIL != cyc_test_kb_p(kb) : kb;
        final SubLObject cyc_test_file = make_cyc_test_file((SubLObject)cyc_testing.UNPROVIDED);
        _csetf_ctf_filename(cyc_test_file, filename);
        _csetf_ctf_kb(cyc_test_file, kb);
        return cyc_test_file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 30031L)
    public static SubLObject cyc_test_file_filename(final SubLObject cyc_test_file) {
        return ctf_filename(cyc_test_file);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 30127L)
    public static SubLObject find_cyc_test_file(final SubLObject filename) {
        SubLObject cdolist_list_var = cyc_testing.$cyc_test_files$.getGlobalValue();
        SubLObject cyc_test_file = (SubLObject)cyc_testing.NIL;
        cyc_test_file = cdolist_list_var.first();
        while (cyc_testing.NIL != cdolist_list_var) {
            if (filename.equal(ctf_filename(cyc_test_file))) {
                return cyc_test_file;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cyc_test_file = cdolist_list_var.first();
        }
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 30706L)
    public static SubLObject most_recent_cyc_test_runs() {
        return cyc_testing.$most_recent_cyc_test_runs$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 30809L)
    public static SubLObject most_recent_failing_cyc_test_runs() {
        return list_utilities.remove_if_not((SubLObject)cyc_testing.$sym121$FAILING_CYC_TEST_RUN_P, most_recent_cyc_test_runs(), (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 30939L)
    public static SubLObject most_recent_failing_cyc_tests() {
        return Mapping.mapcar((SubLObject)cyc_testing.$sym122$CYC_TEST_RUN_CYC_TEST, most_recent_failing_cyc_test_runs());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 31065L)
    public static SubLObject most_recent_cyc_test_file_load_failures() {
        return cyc_testing.$most_recent_cyc_test_file_load_failures$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 31175L)
    public static SubLObject run_all_cyc_tests(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject path = (SubLObject)cyc_testing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_testing.$list123);
        path = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cyc_testing.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cyc_testing.NIL;
        SubLObject current_$5 = (SubLObject)cyc_testing.NIL;
        while (cyc_testing.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing.$list123);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing.$list123);
            if (cyc_testing.NIL == conses_high.member(current_$5, (SubLObject)cyc_testing.$list124, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED)) {
                bad = (SubLObject)cyc_testing.T;
            }
            if (current_$5 == cyc_testing.$kw14$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cyc_testing.NIL != bad && cyc_testing.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_testing.$list123);
        }
        final SubLObject stream_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw125$STREAM, current);
        final SubLObject stream = (SubLObject)((cyc_testing.NIL != stream_tail) ? conses_high.cadr(stream_tail) : cyc_testing.$sym126$_STANDARD_OUTPUT_);
        final SubLObject verbosity_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw127$VERBOSITY, current);
        final SubLObject verbosity = (SubLObject)((cyc_testing.NIL != verbosity_tail) ? conses_high.cadr(verbosity_tail) : cyc_testing.$kw128$TERSE);
        final SubLObject stop_at_first_failureP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw129$STOP_AT_FIRST_FAILURE_, current);
        final SubLObject stop_at_first_failureP = (SubLObject)((cyc_testing.NIL != stop_at_first_failureP_tail) ? conses_high.cadr(stop_at_first_failureP_tail) : cyc_testing.NIL);
        final SubLObject output_format_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw130$OUTPUT_FORMAT, current);
        final SubLObject output_format = (SubLObject)((cyc_testing.NIL != output_format_tail) ? conses_high.cadr(output_format_tail) : cyc_testing.$kw0$STANDARD);
        final SubLObject run_tiny_kb_tests_in_full_kbP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw131$RUN_TINY_KB_TESTS_IN_FULL_KB_, current);
        final SubLObject run_tiny_kb_tests_in_full_kbP = (SubLObject)((cyc_testing.NIL != run_tiny_kb_tests_in_full_kbP_tail) ? conses_high.cadr(run_tiny_kb_tests_in_full_kbP_tail) : cyc_testing.$sym132$_RUN_TINY_KB_TESTS_IN_FULL_KB__);
        final SubLObject run_test_case_tablesP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw133$RUN_TEST_CASE_TABLES_, current);
        final SubLObject run_test_case_tablesP = (SubLObject)((cyc_testing.NIL != run_test_case_tablesP_tail) ? conses_high.cadr(run_test_case_tablesP_tail) : cyc_testing.T);
        final SubLObject return_test_runsP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw134$RETURN_TEST_RUNS_, current);
        final SubLObject return_test_runsP = (SubLObject)((cyc_testing.NIL != return_test_runsP_tail) ? conses_high.cadr(return_test_runsP_tail) : cyc_testing.NIL);
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw135$TYPE, current);
        final SubLObject type = (SubLObject)((cyc_testing.NIL != type_tail) ? conses_high.cadr(type_tail) : cyc_testing.$kw10$ALL);
        final SubLObject run_non_working_tests_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw136$RUN_NON_WORKING_TESTS, current);
        final SubLObject run_non_working_tests = (SubLObject)((cyc_testing.NIL != run_non_working_tests_tail) ? conses_high.cadr(run_non_working_tests_tail) : cyc_testing.NIL);
        final SubLObject progress_file_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw137$PROGRESS_FILE, current);
        final SubLObject progress_file = (SubLObject)((cyc_testing.NIL != progress_file_tail) ? conses_high.cadr(progress_file_tail) : cyc_testing.NIL);
        final SubLObject rerun_crashing_tests_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw138$RERUN_CRASHING_TESTS, current);
        final SubLObject rerun_crashing_tests = (SubLObject)((cyc_testing.NIL != rerun_crashing_tests_tail) ? conses_high.cadr(rerun_crashing_tests_tail) : cyc_testing.NIL);
        return (SubLObject)ConsesLow.list(new SubLObject[] { cyc_testing.$sym139$RUN_ALL_CYC_TESTS_INT, path, stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, run_test_case_tablesP, return_test_runsP, type, run_non_working_tests, progress_file, rerun_crashing_tests });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 33011L)
    public static SubLObject run_all_cyc_tests_int(final SubLObject path, SubLObject stream, SubLObject verbosity, SubLObject stop_at_first_failureP, SubLObject output_format, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject run_test_case_tablesP, SubLObject return_test_runsP, SubLObject type, SubLObject run_non_working_tests, SubLObject progress_file, SubLObject rerun_crashing_tests, SubLObject phase, SubLObject phases) {
        if (stream == cyc_testing.UNPROVIDED) {
            stream = (SubLObject)cyc_testing.$sym126$_STANDARD_OUTPUT_;
        }
        if (verbosity == cyc_testing.UNPROVIDED) {
            verbosity = (SubLObject)cyc_testing.$kw128$TERSE;
        }
        if (stop_at_first_failureP == cyc_testing.UNPROVIDED) {
            stop_at_first_failureP = (SubLObject)cyc_testing.NIL;
        }
        if (output_format == cyc_testing.UNPROVIDED) {
            output_format = (SubLObject)cyc_testing.$kw0$STANDARD;
        }
        if (run_tiny_kb_tests_in_full_kbP == cyc_testing.UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = (SubLObject)cyc_testing.$sym132$_RUN_TINY_KB_TESTS_IN_FULL_KB__;
        }
        if (run_test_case_tablesP == cyc_testing.UNPROVIDED) {
            run_test_case_tablesP = (SubLObject)cyc_testing.T;
        }
        if (return_test_runsP == cyc_testing.UNPROVIDED) {
            return_test_runsP = (SubLObject)cyc_testing.NIL;
        }
        if (type == cyc_testing.UNPROVIDED) {
            type = (SubLObject)cyc_testing.$kw10$ALL;
        }
        if (run_non_working_tests == cyc_testing.UNPROVIDED) {
            run_non_working_tests = (SubLObject)cyc_testing.NIL;
        }
        if (progress_file == cyc_testing.UNPROVIDED) {
            progress_file = (SubLObject)cyc_testing.NIL;
        }
        if (rerun_crashing_tests == cyc_testing.UNPROVIDED) {
            rerun_crashing_tests = (SubLObject)cyc_testing.NIL;
        }
        if (phase == cyc_testing.UNPROVIDED) {
            phase = (SubLObject)cyc_testing.ZERO_INTEGER;
        }
        if (phases == cyc_testing.UNPROVIDED) {
            phases = (SubLObject)cyc_testing.ONE_INTEGER;
        }
        if (cyc_testing.NIL != path) {
            undeclare_all_cyc_test_files();
            load_all_cyc_tests(path, stream, run_tiny_kb_tests_in_full_kbP, verbosity);
        }
        return run_all_loaded_cyc_tests(stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, run_test_case_tablesP, return_test_runsP, type, run_non_working_tests, progress_file, rerun_crashing_tests, cyc_tests(), phase, phases);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 34091L)
    public static SubLObject rerun_failing_cyc_tests(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = (SubLObject)cyc_testing.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cyc_testing.NIL;
        SubLObject current_$6 = (SubLObject)cyc_testing.NIL;
        while (cyc_testing.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing.$list140);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing.$list140);
            if (cyc_testing.NIL == conses_high.member(current_$6, (SubLObject)cyc_testing.$list141, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED)) {
                bad = (SubLObject)cyc_testing.T;
            }
            if (current_$6 == cyc_testing.$kw14$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cyc_testing.NIL != bad && cyc_testing.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_testing.$list140);
        }
        final SubLObject stream_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw125$STREAM, current);
        final SubLObject stream = (SubLObject)((cyc_testing.NIL != stream_tail) ? conses_high.cadr(stream_tail) : cyc_testing.$sym126$_STANDARD_OUTPUT_);
        final SubLObject verbosity_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw127$VERBOSITY, current);
        final SubLObject verbosity = (SubLObject)((cyc_testing.NIL != verbosity_tail) ? conses_high.cadr(verbosity_tail) : cyc_testing.$kw142$VERBOSE);
        final SubLObject stop_at_first_failureP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw129$STOP_AT_FIRST_FAILURE_, current);
        final SubLObject stop_at_first_failureP = (SubLObject)((cyc_testing.NIL != stop_at_first_failureP_tail) ? conses_high.cadr(stop_at_first_failureP_tail) : cyc_testing.NIL);
        final SubLObject output_format_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw130$OUTPUT_FORMAT, current);
        final SubLObject output_format = (SubLObject)((cyc_testing.NIL != output_format_tail) ? conses_high.cadr(output_format_tail) : cyc_testing.$kw0$STANDARD);
        final SubLObject return_test_runsP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw134$RETURN_TEST_RUNS_, current);
        final SubLObject return_test_runsP = (SubLObject)((cyc_testing.NIL != return_test_runsP_tail) ? conses_high.cadr(return_test_runsP_tail) : cyc_testing.NIL);
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw135$TYPE, current);
        final SubLObject type = (SubLObject)((cyc_testing.NIL != type_tail) ? conses_high.cadr(type_tail) : cyc_testing.$kw10$ALL);
        final SubLObject run_non_working_tests_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw136$RUN_NON_WORKING_TESTS, current);
        final SubLObject run_non_working_tests = (SubLObject)((cyc_testing.NIL != run_non_working_tests_tail) ? conses_high.cadr(run_non_working_tests_tail) : cyc_testing.NIL);
        final SubLObject progress_file_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw137$PROGRESS_FILE, current);
        final SubLObject progress_file = (SubLObject)((cyc_testing.NIL != progress_file_tail) ? conses_high.cadr(progress_file_tail) : cyc_testing.NIL);
        final SubLObject rerun_crashing_tests_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw138$RERUN_CRASHING_TESTS, current);
        final SubLObject rerun_crashing_tests = (SubLObject)((cyc_testing.NIL != rerun_crashing_tests_tail) ? conses_high.cadr(rerun_crashing_tests_tail) : cyc_testing.NIL);
        return (SubLObject)ConsesLow.list(new SubLObject[] { cyc_testing.$sym143$RUN_ALL_LOADED_CYC_TESTS, stream, verbosity, stop_at_first_failureP, output_format, cyc_testing.T, cyc_testing.T, return_test_runsP, type, run_non_working_tests, progress_file, rerun_crashing_tests, ConsesLow.list((SubLObject)cyc_testing.$sym144$QUOTE, most_recent_failing_cyc_tests()) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 34773L)
    public static SubLObject declare_cyc_test_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject filename = (SubLObject)cyc_testing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_testing.$list145);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cyc_testing.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cyc_testing.NIL;
        SubLObject current_$7 = (SubLObject)cyc_testing.NIL;
        while (cyc_testing.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing.$list145);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing.$list145);
            if (cyc_testing.NIL == conses_high.member(current_$7, (SubLObject)cyc_testing.$list146, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED)) {
                bad = (SubLObject)cyc_testing.T;
            }
            if (current_$7 == cyc_testing.$kw14$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cyc_testing.NIL != bad && cyc_testing.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_testing.$list145);
        }
        final SubLObject kb_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw114$KB, current);
        final SubLObject kb = (SubLObject)((cyc_testing.NIL != kb_tail) ? conses_high.cadr(kb_tail) : cyc_testing.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)cyc_testing.$sym147$DECLARE_CYC_TEST_FILE_INT, filename, kb);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 35160L)
    public static SubLObject run_cyc_tests(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject names = (SubLObject)cyc_testing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_testing.$list148);
        names = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cyc_testing.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cyc_testing.NIL;
        SubLObject current_$8 = (SubLObject)cyc_testing.NIL;
        while (cyc_testing.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing.$list148);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing.$list148);
            if (cyc_testing.NIL == conses_high.member(current_$8, (SubLObject)cyc_testing.$list149, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED)) {
                bad = (SubLObject)cyc_testing.T;
            }
            if (current_$8 == cyc_testing.$kw14$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cyc_testing.NIL != bad && cyc_testing.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_testing.$list148);
        }
        final SubLObject stream_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw125$STREAM, current);
        final SubLObject stream = (SubLObject)((cyc_testing.NIL != stream_tail) ? conses_high.cadr(stream_tail) : cyc_testing.$sym126$_STANDARD_OUTPUT_);
        final SubLObject verbosity_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw127$VERBOSITY, current);
        final SubLObject verbosity = (SubLObject)((cyc_testing.NIL != verbosity_tail) ? conses_high.cadr(verbosity_tail) : cyc_testing.$kw142$VERBOSE);
        final SubLObject stop_at_first_failureP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw129$STOP_AT_FIRST_FAILURE_, current);
        final SubLObject stop_at_first_failureP = (SubLObject)((cyc_testing.NIL != stop_at_first_failureP_tail) ? conses_high.cadr(stop_at_first_failureP_tail) : cyc_testing.NIL);
        final SubLObject output_format_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw130$OUTPUT_FORMAT, current);
        final SubLObject output_format = (SubLObject)((cyc_testing.NIL != output_format_tail) ? conses_high.cadr(output_format_tail) : cyc_testing.$kw0$STANDARD);
        final SubLObject return_test_runsP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw134$RETURN_TEST_RUNS_, current);
        final SubLObject return_test_runsP = (SubLObject)((cyc_testing.NIL != return_test_runsP_tail) ? conses_high.cadr(return_test_runsP_tail) : cyc_testing.NIL);
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw135$TYPE, current);
        final SubLObject type = (SubLObject)((cyc_testing.NIL != type_tail) ? conses_high.cadr(type_tail) : cyc_testing.$kw10$ALL);
        final SubLObject run_non_working_tests_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing.$kw136$RUN_NON_WORKING_TESTS, current);
        final SubLObject run_non_working_tests = (SubLObject)((cyc_testing.NIL != run_non_working_tests_tail) ? conses_high.cadr(run_non_working_tests_tail) : cyc_testing.NIL);
        return (SubLObject)ConsesLow.list(new SubLObject[] { cyc_testing.$sym143$RUN_ALL_LOADED_CYC_TESTS, stream, verbosity, stop_at_first_failureP, output_format, cyc_testing.T, cyc_testing.T, return_test_runsP, type, run_non_working_tests, cyc_testing.NIL, cyc_testing.NIL, ConsesLow.list((SubLObject)cyc_testing.$sym150$FIND_CYC_TESTS_BY_NAME, names) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 35632L)
    public static SubLObject load_all_cyc_tests(final SubLObject path, SubLObject stream, SubLObject load_tiny_kb_tests_in_full_kbP, SubLObject verbosity) {
        if (stream == cyc_testing.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (load_tiny_kb_tests_in_full_kbP == cyc_testing.UNPROVIDED) {
            load_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (verbosity == cyc_testing.UNPROVIDED) {
            verbosity = (SubLObject)cyc_testing.$kw128$TERSE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cyc_testing.NIL != Types.stringp(path) : path;
        assert cyc_testing.NIL != Types.streamp(stream) : stream;
        assert cyc_testing.NIL != Types.booleanp(load_tiny_kb_tests_in_full_kbP) : load_tiny_kb_tests_in_full_kbP;
        assert cyc_testing.NIL != cyc_test_verbosity_level_p(verbosity) : verbosity;
        thread.resetMultipleValues();
        final SubLObject tests_directory = parse_testdcl_path(path);
        final SubLObject extra_filename = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject count = (SubLObject)cyc_testing.ZERO_INTEGER;
        final SubLObject warn_on_duplicate_cyc_test_namesP = no_cyc_tests_definedP();
        final SubLObject _prev_bind_0 = StreamsLow.$standard_output$.currentBinding(thread);
        try {
            StreamsLow.$standard_output$.bind(stream, thread);
            if (cyc_testing.NIL == load_testdcl(tests_directory, extra_filename)) {
                Errors.error((SubLObject)cyc_testing.$str154$could_not_load__a_lisp_from__s, (cyc_testing.NIL != extra_filename) ? extra_filename : cyc_testing.$cyc_base_testdcl$.getDynamicValue(thread), tests_directory);
            }
            if (cyc_testing.$kw142$VERBOSE == verbosity) {
                final SubLObject list_var = cyc_test_files();
                final SubLObject _prev_bind_0_$9 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)cyc_testing.$str155$Loading_test_files, thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)cyc_testing.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)cyc_testing.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cyc_testing.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cyc_testing.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject cyc_test_file = (SubLObject)cyc_testing.NIL;
                        cyc_test_file = csome_list_var.first();
                        while (cyc_testing.NIL != csome_list_var) {
                            if (cyc_testing.NIL != load_cyc_test_file(cyc_test_file, tests_directory, load_tiny_kb_tests_in_full_kbP, warn_on_duplicate_cyc_test_namesP)) {
                                count = Numbers.add(count, (SubLObject)cyc_testing.ONE_INTEGER);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)cyc_testing.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            cyc_test_file = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_testing.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$9, thread);
                }
            }
            else {
                SubLObject cdolist_list_var = cyc_test_files();
                SubLObject cyc_test_file2 = (SubLObject)cyc_testing.NIL;
                cyc_test_file2 = cdolist_list_var.first();
                while (cyc_testing.NIL != cdolist_list_var) {
                    if (cyc_testing.NIL != load_cyc_test_file(cyc_test_file2, tests_directory, load_tiny_kb_tests_in_full_kbP, warn_on_duplicate_cyc_test_namesP)) {
                        count = Numbers.add(count, (SubLObject)cyc_testing.ONE_INTEGER);
                    }
                    else if (cyc_testing.NIL != inference_testing.kb_matches_expectationsP(ctf_kb(cyc_test_file2), load_tiny_kb_tests_in_full_kbP)) {
                        cyc_testing.$most_recent_cyc_test_file_load_failures$.setGlobalValue((SubLObject)ConsesLow.cons(cyc_test_file2, cyc_testing.$most_recent_cyc_test_file_load_failures$.getGlobalValue()));
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cyc_test_file2 = cdolist_list_var.first();
                }
            }
            if (cyc_testing.NIL != extra_filename) {
                final SubLObject _prev_bind_0_$11 = cyc_testing.$only_undeclare_tests_and_test_filesP$.currentBinding(thread);
                try {
                    cyc_testing.$only_undeclare_tests_and_test_filesP$.bind((SubLObject)cyc_testing.T, thread);
                    load_testdcl(tests_directory, extra_filename);
                }
                finally {
                    cyc_testing.$only_undeclare_tests_and_test_filesP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        }
        finally {
            StreamsLow.$standard_output$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 37388L)
    public static SubLObject parse_testdcl_path(SubLObject path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject extra_filename = (SubLObject)cyc_testing.NIL;
        if (cyc_testing.NIL != string_utilities.ends_with(path, (SubLObject)cyc_testing.$str157$_lisp, (SubLObject)cyc_testing.UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject directory = file_utilities.partially_deconstruct_path(path);
            final SubLObject filename = thread.secondMultipleValue();
            thread.resetMultipleValues();
            extra_filename = string_utilities.post_remove(filename, (SubLObject)cyc_testing.$str157$_lisp, (SubLObject)cyc_testing.UNPROVIDED);
            path = directory;
        }
        path = file_utilities.possibly_append_path_separator_char(path);
        return Values.values(path, extra_filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 37763L)
    public static SubLObject run_all_loaded_cyc_tests(SubLObject stream, SubLObject verbosity, SubLObject stop_at_first_failureP, SubLObject output_format, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject run_test_case_tablesP, SubLObject return_test_runsP, SubLObject type, SubLObject run_non_working_tests, SubLObject progress_file, SubLObject rerun_crashing_tests, SubLObject tests, SubLObject phase, SubLObject phases) {
        if (stream == cyc_testing.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verbosity == cyc_testing.UNPROVIDED) {
            verbosity = (SubLObject)cyc_testing.$kw128$TERSE;
        }
        if (stop_at_first_failureP == cyc_testing.UNPROVIDED) {
            stop_at_first_failureP = (SubLObject)cyc_testing.NIL;
        }
        if (output_format == cyc_testing.UNPROVIDED) {
            output_format = (SubLObject)cyc_testing.$kw0$STANDARD;
        }
        if (run_tiny_kb_tests_in_full_kbP == cyc_testing.UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (run_test_case_tablesP == cyc_testing.UNPROVIDED) {
            run_test_case_tablesP = (SubLObject)cyc_testing.T;
        }
        if (return_test_runsP == cyc_testing.UNPROVIDED) {
            return_test_runsP = (SubLObject)cyc_testing.NIL;
        }
        if (type == cyc_testing.UNPROVIDED) {
            type = (SubLObject)cyc_testing.$kw10$ALL;
        }
        if (run_non_working_tests == cyc_testing.UNPROVIDED) {
            run_non_working_tests = (SubLObject)cyc_testing.NIL;
        }
        if (progress_file == cyc_testing.UNPROVIDED) {
            progress_file = (SubLObject)cyc_testing.NIL;
        }
        if (rerun_crashing_tests == cyc_testing.UNPROVIDED) {
            rerun_crashing_tests = (SubLObject)cyc_testing.NIL;
        }
        if (tests == cyc_testing.UNPROVIDED) {
            tests = cyc_tests();
        }
        if (phase == cyc_testing.UNPROVIDED) {
            phase = (SubLObject)cyc_testing.ZERO_INTEGER;
        }
        if (phases == cyc_testing.UNPROVIDED) {
            phases = (SubLObject)cyc_testing.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_testing.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !phase.numL(phases)) {
            Errors.error((SubLObject)cyc_testing.$str158$Invalid_phase__A_of__A_specified_, phase, phases);
        }
        thread.resetMultipleValues();
        final SubLObject overall_result = cyc_testing_utilities.run_all_loaded_cyc_tests_int(stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, run_test_case_tablesP, type, run_non_working_tests, progress_file, rerun_crashing_tests, tests, phase, phases);
        final SubLObject test_runs = thread.secondMultipleValue();
        thread.resetMultipleValues();
        cyc_testing.$most_recent_cyc_test_runs$.setGlobalValue(test_runs);
        return Values.values(overall_result, (SubLObject)((cyc_testing.NIL != return_test_runsP) ? test_runs : cyc_testing.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 38659L)
    public static SubLObject undeclare_all_cyc_test_files() {
        cyc_testing.$cyc_test_files$.setGlobalValue((SubLObject)cyc_testing.NIL);
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 38751L)
    public static SubLObject undeclare_cyc_test_file(final SubLObject filename) {
        final SubLObject existing_cyc_test_file = find_cyc_test_file(filename);
        if (cyc_testing.NIL != existing_cyc_test_file) {
            cyc_testing.$cyc_test_files$.setGlobalValue(Sequences.delete(existing_cyc_test_file, cyc_testing.$cyc_test_files$.getGlobalValue(), (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED, (SubLObject)cyc_testing.UNPROVIDED));
            return (SubLObject)cyc_testing.T;
        }
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 39010L)
    public static SubLObject declare_cyc_test_file_int(final SubLObject filename, final SubLObject kb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_testing.NIL == cyc_testing.$only_undeclare_tests_and_test_filesP$.getDynamicValue(thread)) {
            undeclare_cyc_test_file(filename);
            final SubLObject cyc_test_file = new_cyc_test_file(filename, kb);
            final SubLObject new_cons = (SubLObject)ConsesLow.cons(cyc_test_file, (SubLObject)cyc_testing.NIL);
            final SubLObject list = cyc_testing.$cyc_test_files$.getGlobalValue();
            if (cyc_testing.NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            }
            else {
                cyc_testing.$cyc_test_files$.setGlobalValue(new_cons);
            }
            return cyc_test_file;
        }
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 39346L)
    public static SubLObject load_cyc_test_file(final SubLObject cyc_test_file, final SubLObject path, final SubLObject load_tiny_kb_tests_in_full_kbP, final SubLObject warn_on_duplicate_cyc_test_namesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)cyc_testing.NIL;
        final SubLObject test_kb = ctf_kb(cyc_test_file);
        if (cyc_testing.NIL != inference_testing.kb_matches_expectationsP(test_kb, load_tiny_kb_tests_in_full_kbP)) {
            final SubLObject filename = ctf_filename(cyc_test_file);
            final SubLObject _prev_bind_0 = cyc_testing.$cyc_test_filename$.currentBinding(thread);
            final SubLObject _prev_bind_2 = cyc_testing.$warn_on_duplicate_cyc_test_namesP$.currentBinding(thread);
            try {
                cyc_testing.$cyc_test_filename$.bind(filename, thread);
                cyc_testing.$warn_on_duplicate_cyc_test_namesP$.bind(warn_on_duplicate_cyc_test_namesP, thread);
                if (cyc_testing.NIL != cyc_testing_utilities.load_lisp_test_file_from_path(path, filename)) {
                    successP = (SubLObject)cyc_testing.T;
                }
            }
            finally {
                cyc_testing.$warn_on_duplicate_cyc_test_namesP$.rebind(_prev_bind_2, thread);
                cyc_testing.$cyc_test_filename$.rebind(_prev_bind_0, thread);
            }
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 39893L)
    public static SubLObject load_testdcl(final SubLObject path, SubLObject extra_filename) {
        if (extra_filename == cyc_testing.UNPROVIDED) {
            extra_filename = (SubLObject)cyc_testing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(cyc_testing.NIL != cyc_testing_utilities.load_lisp_test_file_from_path(path, cyc_testing.$cyc_base_testdcl$.getDynamicValue(thread)) && (cyc_testing.NIL == extra_filename || cyc_testing.NIL != cyc_testing_utilities.load_lisp_test_file_from_path(path, extra_filename)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 40218L)
    public static SubLObject cyc_invalid_tests_with_info() {
        final SubLObject all_relevant_tests = (cyc_testing.NIL != control_vars.non_tiny_kb_loadedP()) ? cyc_tests() : list_utilities.find_all_if((SubLObject)cyc_testing.$sym160$TINY_KB_CYC_TEST_P, cyc_tests(), (SubLObject)cyc_testing.UNPROVIDED);
        final SubLObject invalid_tests = cyc_tests_mentioning_invalid_constants(all_relevant_tests);
        SubLObject result = (SubLObject)cyc_testing.NIL;
        SubLObject cdolist_list_var = invalid_tests;
        SubLObject invalid_test = (SubLObject)cyc_testing.NIL;
        invalid_test = cdolist_list_var.first();
        while (cyc_testing.NIL != cdolist_list_var) {
            final SubLObject test_name = cyc_test_name(invalid_test);
            final SubLObject test_type = cyc_test_type(invalid_test);
            final SubLObject test_owner = cyc_test_owner(invalid_test);
            final SubLObject invalid_constants = cyc_test_invalid_constants(invalid_test);
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(test_type, test_name, test_owner, invalid_constants), result);
            cdolist_list_var = cdolist_list_var.rest();
            invalid_test = cdolist_list_var.first();
        }
        if (cyc_testing.NIL != result && cyc_testing.NIL != list_utilities.lengthLE(result, (SubLObject)cyc_testing.$int161$100, (SubLObject)cyc_testing.UNPROVIDED)) {
            format_nil.p1(result, (SubLObject)cyc_testing.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 41006L)
    public static SubLObject run_cyc_test_after_every_test(final SubLObject path, final SubLObject test_to_interleave, SubLObject stream, SubLObject load_tiny_kb_tests_in_full_kbP, SubLObject verbosity) {
        if (stream == cyc_testing.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (load_tiny_kb_tests_in_full_kbP == cyc_testing.UNPROVIDED) {
            load_tiny_kb_tests_in_full_kbP = (SubLObject)cyc_testing.T;
        }
        if (verbosity == cyc_testing.UNPROVIDED) {
            verbosity = (SubLObject)cyc_testing.$kw128$TERSE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        load_all_cyc_tests(path, stream, load_tiny_kb_tests_in_full_kbP, verbosity);
        SubLObject test_count;
        SubLObject n;
        for (test_count = cyc_test_count(), n = (SubLObject)cyc_testing.NIL, n = (SubLObject)cyc_testing.ZERO_INTEGER; n.numL(test_count); n = Numbers.add(n, (SubLObject)cyc_testing.ONE_INTEGER)) {
            run_all_loaded_cyc_tests(StreamsLow.$standard_output$.getDynamicValue(thread), verbosity, (SubLObject)cyc_testing.T, (SubLObject)cyc_testing.$kw0$STANDARD, (SubLObject)cyc_testing.T, (SubLObject)cyc_testing.T, (SubLObject)cyc_testing.NIL, (SubLObject)cyc_testing.$kw10$ALL, (SubLObject)cyc_testing.NIL, (SubLObject)cyc_testing.NIL, (SubLObject)cyc_testing.NIL, cyc_tests(), n, test_count);
            cyc_testing_utilities.run_cyc_test_int(test_to_interleave, verbosity, (SubLObject)cyc_testing.NIL, (SubLObject)cyc_testing.NIL, (SubLObject)cyc_testing.$kw0$STANDARD, stream, (SubLObject)cyc_testing.T);
        }
        return (SubLObject)cyc_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 41536L)
    public static SubLObject all_cyc_tests_are_valid() {
        return cyc_invalid_tests_with_info();
    }
    
    public static SubLObject declare_cyc_testing_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "testing_real_time_pruningP", "TESTING-REAL-TIME-PRUNING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_kb_p", "CYC-TEST-KB-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_verbosity_level_p", "CYC-TEST-VERBOSITY-LEVEL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_output_format_p", "CYC-TEST-OUTPUT-FORMAT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_result_p", "CYC-TEST-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_success_result_p", "CYC-TEST-SUCCESS-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_failure_result_p", "CYC-TEST-FAILURE-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_ignore_result_p", "CYC-TEST-IGNORE-RESULT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_result_L", "CYC-TEST-RESULT-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_type_p", "CYC-TEST-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_type_spec_p", "CYC-TEST-TYPE-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_type_pretty_name", "CYC-TEST-TYPE-PRETTY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_tests", "CYC-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "undefine_all_cyc_tests", "UNDEFINE-ALL-CYC-TESTS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "do_cyc_tests", "DO-CYC-TESTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "progress_do_cyc_tests", "PROGRESS-DO-CYC-TESTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_count", "CYC-TEST-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "no_cyc_tests_definedP", "NO-CYC-TESTS-DEFINED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "index_cyc_test_by_name", "INDEX-CYC-TEST-BY-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "unindex_cyc_test_by_name", "UNINDEX-CYC-TEST-BY-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "my_pushnew_to_end_hash", "MY-PUSHNEW-TO-END-HASH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "my_delete_value_from_hash", "MY-DELETE-VALUE-FROM-HASH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "index_all_cyc_tests_by_name", "INDEX-ALL-CYC-TESTS-BY-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_print_function_trampoline", "CYC-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_p", "CYC-TEST-P", 1, 0, false);
        new $cyc_test_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "ct_file", "CT-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "ct_guts", "CT-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "_csetf_ct_file", "_CSETF-CT-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "_csetf_ct_guts", "_CSETF-CT-GUTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "make_cyc_test", "MAKE-CYC-TEST", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "visit_defstruct_cyc_test", "VISIT-DEFSTRUCT-CYC-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "visit_defstruct_object_cyc_test_method", "VISIT-DEFSTRUCT-OBJECT-CYC-TEST-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "print_cyc_test", "PRINT-CYC-TEST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "new_cyc_test", "NEW-CYC-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "undeclare_cyc_test", "UNDECLARE-CYC-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_file", "CYC-TEST-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_guts", "CYC-TEST-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_type", "CYC-TEST-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_guts_p", "CYC-TEST-GUTS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_type_permissive", "CYC-TEST-TYPE-PERMISSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_guts_type", "CYC-TEST-GUTS-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_name", "CYC-TEST-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_id", "CYC-TEST-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_kb", "CYC-TEST-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_owner", "CYC-TEST-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_workingP", "CYC-TEST-WORKING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_comment", "CYC-TEST-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_project", "CYC-TEST-PROJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_names_mentioning_invalid_constants", "CYC-TEST-NAMES-MENTIONING-INVALID-CONSTANTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_invalid_constant_test_names", "CYC-TEST-INVALID-CONSTANT-TEST-NAMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_tests_mentioning_invalid_constants", "CYC-TESTS-MENTIONING-INVALID-CONSTANTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_invalidP", "CYC-TEST-INVALID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_invalid_constants", "CYC-TEST-INVALID-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "print_post_build_test_summary", "PRINT-POST-BUILD-TEST-SUMMARY", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "tiny_kb_cyc_test_p", "TINY-KB-CYC-TEST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "full_kb_cyc_test_p", "FULL-KB-CYC-TEST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "non_working_cyc_tests", "NON-WORKING-CYC-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "find_cyc_test_by_exact_name", "FIND-CYC-TEST-BY-EXACT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "find_cyc_test", "FIND-CYC-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "find_cyc_tests", "FIND-CYC-TESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "find_cyc_test_number", "FIND-CYC-TEST-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "find_cyc_tests_in_range", "FIND-CYC-TESTS-IN-RANGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "find_cyc_tests_by_name", "FIND-CYC-TESTS-BY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "find_cyc_test_filename", "FIND-CYC-TEST-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cfasl_output_object_cyc_test_method", "CFASL-OUTPUT-OBJECT-CYC-TEST-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cfasl_wide_output_cyc_test", "CFASL-WIDE-OUTPUT-CYC-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cfasl_output_cyc_test_internal", "CFASL-OUTPUT-CYC-TEST-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cfasl_input_cyc_test", "CFASL-INPUT-CYC-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "new_cyc_test_run", "NEW-CYC-TEST-RUN", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_run_p", "CYC-TEST-RUN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_run_type", "CYC-TEST-RUN-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_run_name", "CYC-TEST-RUN-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_run_result", "CYC-TEST-RUN-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_run_time", "CYC-TEST-RUN-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_run_cyc_test", "CYC-TEST-RUN-CYC-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_runs_overall_result", "CYC-TEST-RUNS-OVERALL-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_result_update", "CYC-TEST-RESULT-UPDATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_runs_total_time", "CYC-TEST-RUNS-TOTAL-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "failing_cyc_test_run_p", "FAILING-CYC-TEST-RUN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "succeeding_cyc_test_run_p", "SUCCEEDING-CYC-TEST-RUN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "ignored_cyc_test_run_p", "IGNORED-CYC-TEST-RUN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_run_owner", "CYC-TEST-RUN-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_run_project", "CYC-TEST-RUN-PROJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "print_cyc_test_run_summary", "PRINT-CYC-TEST-RUN-SUMMARY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_run_summary", "CYC-TEST-RUN-SUMMARY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_files", "CYC-TEST-FILES", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "do_cyc_test_files", "DO-CYC-TEST-FILES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "progress_do_cyc_test_files", "PROGRESS-DO-CYC-TEST-FILES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_file_count", "CYC-TEST-FILE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_file_print_function_trampoline", "CYC-TEST-FILE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_file_p", "CYC-TEST-FILE-P", 1, 0, false);
        new $cyc_test_file_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "ctf_filename", "CTF-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "ctf_kb", "CTF-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "_csetf_ctf_filename", "_CSETF-CTF-FILENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "_csetf_ctf_kb", "_CSETF-CTF-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "make_cyc_test_file", "MAKE-CYC-TEST-FILE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "visit_defstruct_cyc_test_file", "VISIT-DEFSTRUCT-CYC-TEST-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "visit_defstruct_object_cyc_test_file_method", "VISIT-DEFSTRUCT-OBJECT-CYC-TEST-FILE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "print_cyc_test_file", "PRINT-CYC-TEST-FILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "new_cyc_test_file", "NEW-CYC-TEST-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_test_file_filename", "CYC-TEST-FILE-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "find_cyc_test_file", "FIND-CYC-TEST-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "most_recent_cyc_test_runs", "MOST-RECENT-CYC-TEST-RUNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "most_recent_failing_cyc_test_runs", "MOST-RECENT-FAILING-CYC-TEST-RUNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "most_recent_failing_cyc_tests", "MOST-RECENT-FAILING-CYC-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "most_recent_cyc_test_file_load_failures", "MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "run_all_cyc_tests", "RUN-ALL-CYC-TESTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "run_all_cyc_tests_int", "RUN-ALL-CYC-TESTS-INT", 1, 13, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "rerun_failing_cyc_tests", "RERUN-FAILING-CYC-TESTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "declare_cyc_test_file", "DECLARE-CYC-TEST-FILE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "run_cyc_tests", "RUN-CYC-TESTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "load_all_cyc_tests", "LOAD-ALL-CYC-TESTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "parse_testdcl_path", "PARSE-TESTDCL-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "run_all_loaded_cyc_tests", "RUN-ALL-LOADED-CYC-TESTS", 0, 14, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "undeclare_all_cyc_test_files", "UNDECLARE-ALL-CYC-TEST-FILES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "undeclare_cyc_test_file", "UNDECLARE-CYC-TEST-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "declare_cyc_test_file_int", "DECLARE-CYC-TEST-FILE-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "load_cyc_test_file", "LOAD-CYC-TEST-FILE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "load_testdcl", "LOAD-TESTDCL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "cyc_invalid_tests_with_info", "CYC-INVALID-TESTS-WITH-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "run_cyc_test_after_every_test", "RUN-CYC-TEST-AFTER-EVERY-TEST", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing", "all_cyc_tests_are_valid", "ALL-CYC-TESTS-ARE-VALID", 0, 0, false);
        return (SubLObject)cyc_testing.NIL;
    }
    
    public static SubLObject init_cyc_testing_file() {
        cyc_testing.$it_output_format$ = SubLFiles.defparameter("*IT-OUTPUT-FORMAT*", (SubLObject)cyc_testing.$kw0$STANDARD);
        cyc_testing.$cyc_test_debugP$ = SubLFiles.defparameter("*CYC-TEST-DEBUG?*", (SubLObject)cyc_testing.NIL);
        cyc_testing.$run_tiny_kb_tests_in_full_kbP$ = SubLFiles.defparameter("*RUN-TINY-KB-TESTS-IN-FULL-KB?*", (SubLObject)cyc_testing.T);
        cyc_testing.$test_real_time_pruningP$ = SubLFiles.defparameter("*TEST-REAL-TIME-PRUNING?*", (SubLObject)cyc_testing.NIL);
        cyc_testing.$cyc_test_verbosity_levels$ = SubLFiles.deflexical("*CYC-TEST-VERBOSITY-LEVELS*", (SubLObject)cyc_testing.$list1);
        cyc_testing.$cyc_test_filename$ = SubLFiles.defparameter("*CYC-TEST-FILENAME*", (SubLObject)cyc_testing.NIL);
        cyc_testing.$cyc_base_testdcl$ = SubLFiles.defparameter("*CYC-BASE-TESTDCL*", (SubLObject)cyc_testing.$str2$testdcl);
        cyc_testing.$warn_on_duplicate_cyc_test_namesP$ = SubLFiles.defparameter("*WARN-ON-DUPLICATE-CYC-TEST-NAMES?*", (SubLObject)cyc_testing.NIL);
        cyc_testing.$only_undeclare_tests_and_test_filesP$ = SubLFiles.defparameter("*ONLY-UNDECLARE-TESTS-AND-TEST-FILES?*", (SubLObject)cyc_testing.NIL);
        cyc_testing.$cyc_test_result_success_values$ = SubLFiles.deflexical("*CYC-TEST-RESULT-SUCCESS-VALUES*", (SubLObject)cyc_testing.$list5);
        cyc_testing.$cyc_test_result_failure_values$ = SubLFiles.deflexical("*CYC-TEST-RESULT-FAILURE-VALUES*", (SubLObject)cyc_testing.$list6);
        cyc_testing.$cyc_test_result_ignore_values$ = SubLFiles.deflexical("*CYC-TEST-RESULT-IGNORE-VALUES*", (SubLObject)cyc_testing.$list7);
        cyc_testing.$cyc_test_result_values$ = SubLFiles.deflexical("*CYC-TEST-RESULT-VALUES*", ConsesLow.append(cyc_testing.$cyc_test_result_success_values$.getGlobalValue(), cyc_testing.$cyc_test_result_failure_values$.getGlobalValue(), cyc_testing.$cyc_test_result_ignore_values$.getGlobalValue()));
        cyc_testing.$cyc_test_type_table$ = SubLFiles.deflexical("*CYC-TEST-TYPE-TABLE*", (SubLObject)cyc_testing.$list8);
        cyc_testing.$cyc_tests$ = SubLFiles.defvar("*CYC-TESTS*", (SubLObject)cyc_testing.NIL);
        cyc_testing.$cyc_test_by_name$ = SubLFiles.deflexical("*CYC-TEST-BY-NAME*", maybeDefault((SubLObject)cyc_testing.$sym21$_CYC_TEST_BY_NAME_, cyc_testing.$cyc_test_by_name$, ()->(Hashtables.make_hash_table((SubLObject)cyc_testing.$int22$212, Symbols.symbol_function((SubLObject)cyc_testing.EQUAL), (SubLObject)cyc_testing.UNPROVIDED))));
        cyc_testing.$cyc_test_by_dwimmed_name$ = SubLFiles.deflexical("*CYC-TEST-BY-DWIMMED-NAME*", maybeDefault((SubLObject)cyc_testing.$sym23$_CYC_TEST_BY_DWIMMED_NAME_, cyc_testing.$cyc_test_by_dwimmed_name$, ()->(Hashtables.make_hash_table((SubLObject)cyc_testing.$int22$212, Symbols.symbol_function((SubLObject)cyc_testing.EQUAL), (SubLObject)cyc_testing.UNPROVIDED))));
        cyc_testing.$dtp_cyc_test$ = SubLFiles.defconstant("*DTP-CYC-TEST*", (SubLObject)cyc_testing.$sym29$CYC_TEST);
        cyc_testing.$print_post_build_test_summary_timestampP$ = SubLFiles.defparameter("*PRINT-POST-BUILD-TEST-SUMMARY-TIMESTAMP?*", (SubLObject)cyc_testing.T);
        cyc_testing.$cfasl_wide_opcode_cyc_test$ = SubLFiles.defconstant("*CFASL-WIDE-OPCODE-CYC-TEST*", (SubLObject)cyc_testing.$int77$514);
        cyc_testing.$cyc_test_files$ = SubLFiles.deflexical("*CYC-TEST-FILES*", (SubLObject)(maybeDefault((SubLObject)cyc_testing.$sym93$_CYC_TEST_FILES_, cyc_testing.$cyc_test_files$, cyc_testing.NIL)));
        cyc_testing.$dtp_cyc_test_file$ = SubLFiles.defconstant("*DTP-CYC-TEST-FILE*", (SubLObject)cyc_testing.$sym100$CYC_TEST_FILE);
        cyc_testing.$most_recent_cyc_test_runs$ = SubLFiles.deflexical("*MOST-RECENT-CYC-TEST-RUNS*", (SubLObject)(maybeDefault((SubLObject)cyc_testing.$sym119$_MOST_RECENT_CYC_TEST_RUNS_, cyc_testing.$most_recent_cyc_test_runs$, cyc_testing.NIL)));
        cyc_testing.$most_recent_cyc_test_file_load_failures$ = SubLFiles.deflexical("*MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES*", (SubLObject)(maybeDefault((SubLObject)cyc_testing.$sym120$_MOST_RECENT_CYC_TEST_FILE_LOAD_FAILURES_, cyc_testing.$most_recent_cyc_test_file_load_failures$, cyc_testing.NIL)));
        return (SubLObject)cyc_testing.NIL;
    }
    
    public static SubLObject setup_cyc_testing_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)cyc_testing.$sym21$_CYC_TEST_BY_NAME_);
        subl_macro_promotions.declare_defglobal((SubLObject)cyc_testing.$sym23$_CYC_TEST_BY_DWIMMED_NAME_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), cyc_testing.$dtp_cyc_test$.getGlobalValue(), Symbols.symbol_function((SubLObject)cyc_testing.$sym36$CYC_TEST_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cyc_testing.$list37);
        Structures.def_csetf((SubLObject)cyc_testing.$sym38$CT_FILE, (SubLObject)cyc_testing.$sym39$_CSETF_CT_FILE);
        Structures.def_csetf((SubLObject)cyc_testing.$sym40$CT_GUTS, (SubLObject)cyc_testing.$sym41$_CSETF_CT_GUTS);
        Equality.identity((SubLObject)cyc_testing.$sym29$CYC_TEST);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), cyc_testing.$dtp_cyc_test$.getGlobalValue(), Symbols.symbol_function((SubLObject)cyc_testing.$sym49$VISIT_DEFSTRUCT_OBJECT_CYC_TEST_METHOD));
        cfasl.register_wide_cfasl_opcode_input_function(cyc_testing.$cfasl_wide_opcode_cyc_test$.getGlobalValue(), (SubLObject)cyc_testing.$sym78$CFASL_INPUT_CYC_TEST);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), cyc_testing.$dtp_cyc_test$.getGlobalValue(), Symbols.symbol_function((SubLObject)cyc_testing.$sym79$CFASL_OUTPUT_OBJECT_CYC_TEST_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)cyc_testing.$sym93$_CYC_TEST_FILES_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), cyc_testing.$dtp_cyc_test_file$.getGlobalValue(), Symbols.symbol_function((SubLObject)cyc_testing.$sym107$CYC_TEST_FILE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cyc_testing.$list108);
        Structures.def_csetf((SubLObject)cyc_testing.$sym109$CTF_FILENAME, (SubLObject)cyc_testing.$sym110$_CSETF_CTF_FILENAME);
        Structures.def_csetf((SubLObject)cyc_testing.$sym111$CTF_KB, (SubLObject)cyc_testing.$sym112$_CSETF_CTF_KB);
        Equality.identity((SubLObject)cyc_testing.$sym100$CYC_TEST_FILE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), cyc_testing.$dtp_cyc_test_file$.getGlobalValue(), Symbols.symbol_function((SubLObject)cyc_testing.$sym116$VISIT_DEFSTRUCT_OBJECT_CYC_TEST_FILE_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)cyc_testing.$sym119$_MOST_RECENT_CYC_TEST_RUNS_);
        subl_macro_promotions.declare_defglobal((SubLObject)cyc_testing.$sym120$_MOST_RECENT_CYC_TEST_FILE_LOAD_FAILURES_);
        access_macros.register_macro_helper((SubLObject)cyc_testing.$sym147$DECLARE_CYC_TEST_FILE_INT, (SubLObject)cyc_testing.$sym159$DECLARE_CYC_TEST_FILE);
        generic_testing.define_test_case_table_int((SubLObject)cyc_testing.$sym162$SERVER_SUMMARY, (SubLObject)ConsesLow.list(new SubLObject[] { cyc_testing.$kw163$TEST, cyc_testing.NIL, cyc_testing.$kw164$OWNER, cyc_testing.NIL, cyc_testing.$kw165$CLASSES, cyc_testing.NIL, cyc_testing.$kw114$KB, cyc_testing.$kw70$BOTH, cyc_testing.$kw166$WORKING_, cyc_testing.T }), (SubLObject)cyc_testing.$list167);
        generic_testing.define_test_case_table_int((SubLObject)cyc_testing.$sym168$KB_STATISTICS, (SubLObject)ConsesLow.list(new SubLObject[] { cyc_testing.$kw163$TEST, cyc_testing.NIL, cyc_testing.$kw164$OWNER, cyc_testing.NIL, cyc_testing.$kw165$CLASSES, cyc_testing.NIL, cyc_testing.$kw114$KB, cyc_testing.$kw70$BOTH, cyc_testing.$kw166$WORKING_, cyc_testing.T }), (SubLObject)cyc_testing.$list167);
        generic_testing.define_test_case_table_int((SubLObject)cyc_testing.$sym169$CYC_MEMORY_HOGS, (SubLObject)ConsesLow.list(new SubLObject[] { cyc_testing.$kw163$TEST, cyc_testing.NIL, cyc_testing.$kw164$OWNER, cyc_testing.NIL, cyc_testing.$kw165$CLASSES, cyc_testing.NIL, cyc_testing.$kw114$KB, cyc_testing.$kw70$BOTH, cyc_testing.$kw166$WORKING_, cyc_testing.T }), (SubLObject)cyc_testing.$list167);
        generic_testing.define_test_case_table_int((SubLObject)cyc_testing.$sym170$ALL_CYC_TESTS_ARE_VALID, (SubLObject)ConsesLow.list(new SubLObject[] { cyc_testing.$kw163$TEST, cyc_testing.NIL, cyc_testing.$kw164$OWNER, cyc_testing.NIL, cyc_testing.$kw165$CLASSES, cyc_testing.NIL, cyc_testing.$kw114$KB, cyc_testing.$kw70$BOTH, cyc_testing.$kw166$WORKING_, cyc_testing.T }), (SubLObject)cyc_testing.$list167);
        return (SubLObject)cyc_testing.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cyc_testing_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cyc_testing_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cyc_testing_file();
    }
    
    static {
        me = (SubLFile)new cyc_testing();
        cyc_testing.$it_output_format$ = null;
        cyc_testing.$cyc_test_debugP$ = null;
        cyc_testing.$run_tiny_kb_tests_in_full_kbP$ = null;
        cyc_testing.$test_real_time_pruningP$ = null;
        cyc_testing.$cyc_test_verbosity_levels$ = null;
        cyc_testing.$cyc_test_filename$ = null;
        cyc_testing.$cyc_base_testdcl$ = null;
        cyc_testing.$warn_on_duplicate_cyc_test_namesP$ = null;
        cyc_testing.$only_undeclare_tests_and_test_filesP$ = null;
        cyc_testing.$cyc_test_result_success_values$ = null;
        cyc_testing.$cyc_test_result_failure_values$ = null;
        cyc_testing.$cyc_test_result_ignore_values$ = null;
        cyc_testing.$cyc_test_result_values$ = null;
        cyc_testing.$cyc_test_type_table$ = null;
        cyc_testing.$cyc_tests$ = null;
        cyc_testing.$cyc_test_by_name$ = null;
        cyc_testing.$cyc_test_by_dwimmed_name$ = null;
        cyc_testing.$dtp_cyc_test$ = null;
        cyc_testing.$print_post_build_test_summary_timestampP$ = null;
        cyc_testing.$cfasl_wide_opcode_cyc_test$ = null;
        cyc_testing.$cyc_test_files$ = null;
        cyc_testing.$dtp_cyc_test_file$ = null;
        cyc_testing.$most_recent_cyc_test_runs$ = null;
        cyc_testing.$most_recent_cyc_test_file_load_failures$ = null;
        $kw0$STANDARD = SubLObjectFactory.makeKeyword("STANDARD");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SILENT"), (SubLObject)SubLObjectFactory.makeKeyword("TERSE"), (SubLObject)SubLObjectFactory.makeKeyword("VERBOSE"));
        $str2$testdcl = SubLObjectFactory.makeString("testdcl");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TINY"), (SubLObject)SubLObjectFactory.makeKeyword("FULL"), (SubLObject)SubLObjectFactory.makeKeyword("BOTH"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STANDARD"), (SubLObject)SubLObjectFactory.makeKeyword("POST-BUILD"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUCCESS"), (SubLObject)SubLObjectFactory.makeKeyword("REGRESSION-SUCCESS"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FAILURE"), (SubLObject)SubLObjectFactory.makeKeyword("REGRESSION-FAILURE"), (SubLObject)SubLObjectFactory.makeKeyword("ABNORMAL"), (SubLObject)SubLObjectFactory.makeKeyword("ERROR"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NON-REGRESSION-SUCCESS"), (SubLObject)SubLObjectFactory.makeKeyword("NON-REGRESSION-FAILURE"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-RUN"), (SubLObject)SubLObjectFactory.makeKeyword("INVALID"));
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IUT"), (SubLObject)SubLObjectFactory.makeString("inference unit test")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IT"), (SubLObject)SubLObjectFactory.makeString("inference test")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RMT"), (SubLObject)SubLObjectFactory.makeString("removal module test")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TMT"), (SubLObject)SubLObjectFactory.makeString("transformation module test")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RMCT"), (SubLObject)SubLObjectFactory.makeString("removal module cost test")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ERT"), (SubLObject)SubLObjectFactory.makeString("evaluatable relation test")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TCT"), (SubLObject)SubLObjectFactory.makeString("test case table")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KCT"), (SubLObject)SubLObjectFactory.makeString("KB content test")));
        $sym9$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $kw10$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym11$CYC_TEST_TYPE_P = SubLObjectFactory.makeSymbol("CYC-TEST-TYPE-P");
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw14$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw15$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym16$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-TESTS"));
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeString("Iterating over all Cyc tests"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str19$Iterating_over_all_Cyc_tests = SubLObjectFactory.makeString("Iterating over all Cyc tests");
        $sym20$PROGRESS_CDOLIST = SubLObjectFactory.makeSymbol("PROGRESS-CDOLIST");
        $sym21$_CYC_TEST_BY_NAME_ = SubLObjectFactory.makeSymbol("*CYC-TEST-BY-NAME*");
        $int22$212 = SubLObjectFactory.makeInteger(212);
        $sym23$_CYC_TEST_BY_DWIMMED_NAME_ = SubLObjectFactory.makeSymbol("*CYC-TEST-BY-DWIMMED-NAME*");
        $str24$A_Cyc_test_named__a_already_exist = SubLObjectFactory.makeString("A Cyc test named ~a already existed; overwriting");
        $sym25$REMOVAL_MODULE_TEST_P = SubLObjectFactory.makeSymbol("REMOVAL-MODULE-TEST-P");
        $sym26$REMOVAL_MODULE_TEST_PREDICATE = SubLObjectFactory.makeSymbol("REMOVAL-MODULE-TEST-PREDICATE");
        $sym27$REMOVAL_MODULE_COST_TEST_P = SubLObjectFactory.makeSymbol("REMOVAL-MODULE-COST-TEST-P");
        $sym28$REMOVAL_MODULE_COST_TEST_PREDICATE = SubLObjectFactory.makeSymbol("REMOVAL-MODULE-COST-TEST-PREDICATE");
        $sym29$CYC_TEST = SubLObjectFactory.makeSymbol("CYC-TEST");
        $sym30$CYC_TEST_P = SubLObjectFactory.makeSymbol("CYC-TEST-P");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILE"), (SubLObject)SubLObjectFactory.makeSymbol("GUTS"));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FILE"), (SubLObject)SubLObjectFactory.makeKeyword("GUTS"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CT-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("CT-GUTS"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CT-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CT-GUTS"));
        $sym35$PRINT_CYC_TEST = SubLObjectFactory.makeSymbol("PRINT-CYC-TEST");
        $sym36$CYC_TEST_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CYC-TEST-PRINT-FUNCTION-TRAMPOLINE");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-TEST-P"));
        $sym38$CT_FILE = SubLObjectFactory.makeSymbol("CT-FILE");
        $sym39$_CSETF_CT_FILE = SubLObjectFactory.makeSymbol("_CSETF-CT-FILE");
        $sym40$CT_GUTS = SubLObjectFactory.makeSymbol("CT-GUTS");
        $sym41$_CSETF_CT_GUTS = SubLObjectFactory.makeSymbol("_CSETF-CT-GUTS");
        $kw42$FILE = SubLObjectFactory.makeKeyword("FILE");
        $kw43$GUTS = SubLObjectFactory.makeKeyword("GUTS");
        $str44$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw45$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym46$MAKE_CYC_TEST = SubLObjectFactory.makeSymbol("MAKE-CYC-TEST");
        $kw47$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw48$END = SubLObjectFactory.makeKeyword("END");
        $sym49$VISIT_DEFSTRUCT_OBJECT_CYC_TEST_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CYC-TEST-METHOD");
        $str50$__CYC_TEST__a__a_ = SubLObjectFactory.makeString("#<CYC-TEST:~a:~a>");
        $str51$__CYC_TEST__a_ = SubLObjectFactory.makeString("#<CYC-TEST:~a>");
        $sym52$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym53$CYC_TEST_GUTS_P = SubLObjectFactory.makeSymbol("CYC-TEST-GUTS-P");
        $str54$_s_is_not_a_CYC_TEST_GUTS_P = SubLObjectFactory.makeString("~s is not a CYC-TEST-GUTS-P");
        $sym55$GENERIC_TEST_CASE_TABLE_P = SubLObjectFactory.makeSymbol("GENERIC-TEST-CASE-TABLE-P");
        $sym56$CYC_TEST_NAME = SubLObjectFactory.makeSymbol("CYC-TEST-NAME");
        $str57$Cyc_test_of_unexpected_type___s = SubLObjectFactory.makeString("Cyc test of unexpected type: ~s");
        $kw58$TCT = SubLObjectFactory.makeKeyword("TCT");
        $kw59$IUT = SubLObjectFactory.makeKeyword("IUT");
        $kw60$RMT = SubLObjectFactory.makeKeyword("RMT");
        $kw61$RMCT = SubLObjectFactory.makeKeyword("RMCT");
        $kw62$TMT = SubLObjectFactory.makeKeyword("TMT");
        $kw63$ERT = SubLObjectFactory.makeKeyword("ERT");
        $kw64$IT = SubLObjectFactory.makeKeyword("IT");
        $kw65$KCT = SubLObjectFactory.makeKeyword("KCT");
        $kw66$NOT_RUN = SubLObjectFactory.makeKeyword("NOT-RUN");
        $str67$___A__S__S__S____3f___OWNER__S__ = SubLObjectFactory.makeString("~&~A ~S ~S ~S (~,3f) :OWNER ~S~%");
        $str68$___S__S__S____3f___OWNER__S__ = SubLObjectFactory.makeString("~&~S ~S ~S (~,3f) :OWNER ~S~%");
        $kw69$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw70$BOTH = SubLObjectFactory.makeKeyword("BOTH");
        $kw71$FULL = SubLObjectFactory.makeKeyword("FULL");
        $sym72$CYC_TEST_TYPE_SPEC_P = SubLObjectFactory.makeSymbol("CYC-TEST-TYPE-SPEC-P");
        $sym73$CYC_TEST_WORKING_ = SubLObjectFactory.makeSymbol("CYC-TEST-WORKING?");
        $sym74$NOT_EQ = SubLObjectFactory.makeSymbol("NOT-EQ");
        $sym75$CYC_TEST_TYPE = SubLObjectFactory.makeSymbol("CYC-TEST-TYPE");
        $sym76$FIND_CYC_TEST = SubLObjectFactory.makeSymbol("FIND-CYC-TEST");
        $int77$514 = SubLObjectFactory.makeInteger(514);
        $sym78$CFASL_INPUT_CYC_TEST = SubLObjectFactory.makeSymbol("CFASL-INPUT-CYC-TEST");
        $sym79$CFASL_OUTPUT_OBJECT_CYC_TEST_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-CYC-TEST-METHOD");
        $sym80$CYC_TEST_RESULT_P = SubLObjectFactory.makeSymbol("CYC-TEST-RESULT-P");
        $sym81$NON_NEGATIVE_NUMBER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-NUMBER-P");
        $sym82$CYC_TEST_RUN_P = SubLObjectFactory.makeSymbol("CYC-TEST-RUN-P");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT-RUN"), (SubLObject)SubLObjectFactory.makeKeyword("INVALID"));
        $kw84$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $kw85$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $kw86$SILENT = SubLObjectFactory.makeKeyword("SILENT");
        $str87$___S__S_____S___S_ = SubLObjectFactory.makeString("~&~S ~S -> ~S (~S)");
        $kw88$POST_BUILD = SubLObjectFactory.makeKeyword("POST-BUILD");
        $str89$Unknown_output_format__A = SubLObjectFactory.makeString("Unknown output format ~A");
        $kw90$WITH_OWNER = SubLObjectFactory.makeKeyword("WITH-OWNER");
        $str91$_ = SubLObjectFactory.makeString(" ");
        $str92$Unknown_output_format_ = SubLObjectFactory.makeString("Unknown output format ");
        $sym93$_CYC_TEST_FILES_ = SubLObjectFactory.makeSymbol("*CYC-TEST-FILES*");
        $list94 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-TEST-FILE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym95$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $list96 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-TEST-FILES")));
        $list97 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-TEST-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeString("Iterating over all test files"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str98$Iterating_over_all_test_files = SubLObjectFactory.makeString("Iterating over all test files");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-TEST-FILES"));
        $sym100$CYC_TEST_FILE = SubLObjectFactory.makeSymbol("CYC-TEST-FILE");
        $sym101$CYC_TEST_FILE_P = SubLObjectFactory.makeSymbol("CYC-TEST-FILE-P");
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("KB"));
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FILENAME"), (SubLObject)SubLObjectFactory.makeKeyword("KB"));
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CTF-FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("CTF-KB"));
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CTF-FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-CTF-KB"));
        $sym106$PRINT_CYC_TEST_FILE = SubLObjectFactory.makeSymbol("PRINT-CYC-TEST-FILE");
        $sym107$CYC_TEST_FILE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CYC-TEST-FILE-PRINT-FUNCTION-TRAMPOLINE");
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-TEST-FILE-P"));
        $sym109$CTF_FILENAME = SubLObjectFactory.makeSymbol("CTF-FILENAME");
        $sym110$_CSETF_CTF_FILENAME = SubLObjectFactory.makeSymbol("_CSETF-CTF-FILENAME");
        $sym111$CTF_KB = SubLObjectFactory.makeSymbol("CTF-KB");
        $sym112$_CSETF_CTF_KB = SubLObjectFactory.makeSymbol("_CSETF-CTF-KB");
        $kw113$FILENAME = SubLObjectFactory.makeKeyword("FILENAME");
        $kw114$KB = SubLObjectFactory.makeKeyword("KB");
        $sym115$MAKE_CYC_TEST_FILE = SubLObjectFactory.makeSymbol("MAKE-CYC-TEST-FILE");
        $sym116$VISIT_DEFSTRUCT_OBJECT_CYC_TEST_FILE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CYC-TEST-FILE-METHOD");
        $str117$__CTF__a_ = SubLObjectFactory.makeString("#<CTF:~a>");
        $sym118$CYC_TEST_KB_P = SubLObjectFactory.makeSymbol("CYC-TEST-KB-P");
        $sym119$_MOST_RECENT_CYC_TEST_RUNS_ = SubLObjectFactory.makeSymbol("*MOST-RECENT-CYC-TEST-RUNS*");
        $sym120$_MOST_RECENT_CYC_TEST_FILE_LOAD_FAILURES_ = SubLObjectFactory.makeSymbol("*MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES*");
        $sym121$FAILING_CYC_TEST_RUN_P = SubLObjectFactory.makeSymbol("FAILING-CYC-TEST-RUN-P");
        $sym122$CYC_TEST_RUN_CYC_TEST = SubLObjectFactory.makeSymbol("CYC-TEST-RUN-CYC-TEST");
        $list123 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("PATH"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBOSITY"), (SubLObject)SubLObjectFactory.makeKeyword("TERSE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STOP-AT-FIRST-FAILURE?"), (SubLObject)cyc_testing.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("STANDARD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RUN-TEST-CASE-TABLES?"), (SubLObject)cyc_testing.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RETURN-TEST-RUNS?"), (SubLObject)cyc_testing.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("ALL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RUN-NON-WORKING-TESTS"), (SubLObject)cyc_testing.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-FILE"), (SubLObject)cyc_testing.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RERUN-CRASHING-TESTS"), (SubLObject)cyc_testing.NIL) });
        $list124 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("STREAM"), SubLObjectFactory.makeKeyword("VERBOSITY"), SubLObjectFactory.makeKeyword("STOP-AT-FIRST-FAILURE?"), SubLObjectFactory.makeKeyword("OUTPUT-FORMAT"), SubLObjectFactory.makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"), SubLObjectFactory.makeKeyword("RUN-TEST-CASE-TABLES?"), SubLObjectFactory.makeKeyword("RETURN-TEST-RUNS?"), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("RUN-NON-WORKING-TESTS"), SubLObjectFactory.makeKeyword("PROGRESS-FILE"), SubLObjectFactory.makeKeyword("RERUN-CRASHING-TESTS") });
        $kw125$STREAM = SubLObjectFactory.makeKeyword("STREAM");
        $sym126$_STANDARD_OUTPUT_ = SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*");
        $kw127$VERBOSITY = SubLObjectFactory.makeKeyword("VERBOSITY");
        $kw128$TERSE = SubLObjectFactory.makeKeyword("TERSE");
        $kw129$STOP_AT_FIRST_FAILURE_ = SubLObjectFactory.makeKeyword("STOP-AT-FIRST-FAILURE?");
        $kw130$OUTPUT_FORMAT = SubLObjectFactory.makeKeyword("OUTPUT-FORMAT");
        $kw131$RUN_TINY_KB_TESTS_IN_FULL_KB_ = SubLObjectFactory.makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?");
        $sym132$_RUN_TINY_KB_TESTS_IN_FULL_KB__ = SubLObjectFactory.makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*");
        $kw133$RUN_TEST_CASE_TABLES_ = SubLObjectFactory.makeKeyword("RUN-TEST-CASE-TABLES?");
        $kw134$RETURN_TEST_RUNS_ = SubLObjectFactory.makeKeyword("RETURN-TEST-RUNS?");
        $kw135$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw136$RUN_NON_WORKING_TESTS = SubLObjectFactory.makeKeyword("RUN-NON-WORKING-TESTS");
        $kw137$PROGRESS_FILE = SubLObjectFactory.makeKeyword("PROGRESS-FILE");
        $kw138$RERUN_CRASHING_TESTS = SubLObjectFactory.makeKeyword("RERUN-CRASHING-TESTS");
        $sym139$RUN_ALL_CYC_TESTS_INT = SubLObjectFactory.makeSymbol("RUN-ALL-CYC-TESTS-INT");
        $list140 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBOSITY"), (SubLObject)SubLObjectFactory.makeKeyword("VERBOSE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STOP-AT-FIRST-FAILURE?"), (SubLObject)cyc_testing.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("STANDARD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RETURN-TEST-RUNS?"), (SubLObject)cyc_testing.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("ALL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RUN-NON-WORKING-TESTS"), (SubLObject)cyc_testing.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-FILE"), (SubLObject)cyc_testing.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RERUN-CRASHING-TESTS"), (SubLObject)cyc_testing.NIL) });
        $list141 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("STREAM"), SubLObjectFactory.makeKeyword("VERBOSITY"), SubLObjectFactory.makeKeyword("STOP-AT-FIRST-FAILURE?"), SubLObjectFactory.makeKeyword("OUTPUT-FORMAT"), SubLObjectFactory.makeKeyword("RETURN-TEST-RUNS?"), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("RUN-NON-WORKING-TESTS"), SubLObjectFactory.makeKeyword("PROGRESS-FILE"), SubLObjectFactory.makeKeyword("RERUN-CRASHING-TESTS") });
        $kw142$VERBOSE = SubLObjectFactory.makeKeyword("VERBOSE");
        $sym143$RUN_ALL_LOADED_CYC_TESTS = SubLObjectFactory.makeSymbol("RUN-ALL-LOADED-CYC-TESTS");
        $sym144$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $list145 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("KB"));
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KB"));
        $sym147$DECLARE_CYC_TEST_FILE_INT = SubLObjectFactory.makeSymbol("DECLARE-CYC-TEST-FILE-INT");
        $list148 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NAMES"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBOSITY"), (SubLObject)SubLObjectFactory.makeKeyword("VERBOSE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STOP-AT-FIRST-FAILURE?"), (SubLObject)cyc_testing.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("STANDARD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RETURN-TEST-RUNS?"), (SubLObject)cyc_testing.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("ALL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RUN-NON-WORKING-TESTS"), (SubLObject)cyc_testing.NIL) });
        $list149 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("VERBOSITY"), (SubLObject)SubLObjectFactory.makeKeyword("STOP-AT-FIRST-FAILURE?"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("RETURN-TEST-RUNS?"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("RUN-NON-WORKING-TESTS"));
        $sym150$FIND_CYC_TESTS_BY_NAME = SubLObjectFactory.makeSymbol("FIND-CYC-TESTS-BY-NAME");
        $sym151$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
        $sym152$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $sym153$CYC_TEST_VERBOSITY_LEVEL_P = SubLObjectFactory.makeSymbol("CYC-TEST-VERBOSITY-LEVEL-P");
        $str154$could_not_load__a_lisp_from__s = SubLObjectFactory.makeString("could not load ~a.lisp from ~s");
        $str155$Loading_test_files = SubLObjectFactory.makeString("Loading test files");
        $str156$cdolist = SubLObjectFactory.makeString("cdolist");
        $str157$_lisp = SubLObjectFactory.makeString(".lisp");
        $str158$Invalid_phase__A_of__A_specified_ = SubLObjectFactory.makeString("Invalid phase ~A of ~A specified.");
        $sym159$DECLARE_CYC_TEST_FILE = SubLObjectFactory.makeSymbol("DECLARE-CYC-TEST-FILE");
        $sym160$TINY_KB_CYC_TEST_P = SubLObjectFactory.makeSymbol("TINY-KB-CYC-TEST-P");
        $int161$100 = SubLObjectFactory.makeInteger(100);
        $sym162$SERVER_SUMMARY = SubLObjectFactory.makeSymbol("SERVER-SUMMARY");
        $kw163$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw164$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw165$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw166$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list167 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cyc_testing.NIL, (SubLObject)cyc_testing.NIL));
        $sym168$KB_STATISTICS = SubLObjectFactory.makeSymbol("KB-STATISTICS");
        $sym169$CYC_MEMORY_HOGS = SubLObjectFactory.makeSymbol("CYC-MEMORY-HOGS");
        $sym170$ALL_CYC_TESTS_ARE_VALID = SubLObjectFactory.makeSymbol("ALL-CYC-TESTS-ARE-VALID");
    }
    
    public static final class $cyc_test_native extends SubLStructNative
    {
        public SubLObject $file;
        public SubLObject $guts;
        private static final SubLStructDeclNative structDecl;
        
        public $cyc_test_native() {
            this.$file = (SubLObject)CommonSymbols.NIL;
            this.$guts = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$cyc_test_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$file;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$guts;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$file = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$guts = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$cyc_test_native.class, cyc_testing.$sym29$CYC_TEST, cyc_testing.$sym30$CYC_TEST_P, cyc_testing.$list31, cyc_testing.$list32, new String[] { "$file", "$guts" }, cyc_testing.$list33, cyc_testing.$list34, cyc_testing.$sym35$PRINT_CYC_TEST);
        }
    }
    
    public static final class $cyc_test_p$UnaryFunction extends UnaryFunction
    {
        public $cyc_test_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-TEST-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return cyc_testing.cyc_test_p(arg1);
        }
    }
    
    public static final class $cyc_test_file_native extends SubLStructNative
    {
        public SubLObject $filename;
        public SubLObject $kb;
        private static final SubLStructDeclNative structDecl;
        
        public $cyc_test_file_native() {
            this.$filename = (SubLObject)CommonSymbols.NIL;
            this.$kb = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$cyc_test_file_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$filename;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$kb;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$filename = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$kb = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$cyc_test_file_native.class, cyc_testing.$sym100$CYC_TEST_FILE, cyc_testing.$sym101$CYC_TEST_FILE_P, cyc_testing.$list102, cyc_testing.$list103, new String[] { "$filename", "$kb" }, cyc_testing.$list104, cyc_testing.$list105, cyc_testing.$sym106$PRINT_CYC_TEST_FILE);
        }
    }
    
    public static final class $cyc_test_file_p$UnaryFunction extends UnaryFunction
    {
        public $cyc_test_file_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYC-TEST-FILE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return cyc_testing.cyc_test_file_p(arg1);
        }
    }
}

/*

	Total time: 586 ms
	 synthetic 
*/