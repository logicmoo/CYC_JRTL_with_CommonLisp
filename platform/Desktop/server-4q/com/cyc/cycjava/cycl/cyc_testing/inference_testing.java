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

public final class inference_testing extends SubLTranslatedFile
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
    public static SubLObject construct_cyc_test_filename(SubLObject name, SubLObject suffix) {
        if (name == inference_testing.UNPROVIDED) {
            name = inference_testing.$default_cyc_test_file$.getDynamicValue();
        }
        if (suffix == inference_testing.UNPROVIDED) {
            suffix = (SubLObject)inference_testing.$str1$lisp;
        }
        return file_utilities.cyc_home_filename((SubLObject)inference_testing.$list2, name, suffix);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 3496L)
    public static SubLObject break_on_failureP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_testing.NIL != inference_testing.$break_on_failure$.getDynamicValue(thread) || inference_testing.NIL != inference_testing.$break_on_failureP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 3580L)
    public static SubLObject return_list_of_values(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == inference_testing.UNPROVIDED) {
            mt = (SubLObject)inference_testing.NIL;
        }
        if (query_properties == inference_testing.UNPROVIDED) {
            query_properties = (SubLObject)inference_testing.NIL;
        }
        final SubLObject v_bindings = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        SubLObject constants = (SubLObject)inference_testing.NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject bl = (SubLObject)inference_testing.NIL;
        bl = cdolist_list_var.first();
        while (inference_testing.NIL != cdolist_list_var) {
            if (Sequences.length(bl).numG((SubLObject)inference_testing.ONE_INTEGER)) {
                constants = (SubLObject)ConsesLow.cons(bindings.bindings_values(bl), constants);
            }
            else {
                constants = ConsesLow.append(bindings.bindings_values(bl), constants);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bl = cdolist_list_var.first();
        }
        return constants;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 4061L)
    public static SubLObject list_assertions(final SubLObject query, final SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchainP == inference_testing.UNPROVIDED) {
            backchainP = (SubLObject)inference_testing.NIL;
        }
        if (number == inference_testing.UNPROVIDED) {
            number = (SubLObject)inference_testing.NIL;
        }
        if (time == inference_testing.UNPROVIDED) {
            time = (SubLObject)inference_testing.NIL;
        }
        if (depth == inference_testing.UNPROVIDED) {
            depth = (SubLObject)inference_testing.NIL;
        }
        final SubLObject v_bindings = fi.fi_ask_int(query, mt, backchainP, number, time, depth);
        SubLObject assertions = (SubLObject)inference_testing.NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject bl = (SubLObject)inference_testing.NIL;
        bl = cdolist_list_var.first();
        while (inference_testing.NIL != cdolist_list_var) {
            assertions = (SubLObject)ConsesLow.cons(conses_high.sublis(bl, query, Symbols.symbol_function((SubLObject)inference_testing.EQUAL), (SubLObject)inference_testing.UNPROVIDED), assertions);
            cdolist_list_var = cdolist_list_var.rest();
            bl = cdolist_list_var.first();
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 4329L)
    public static SubLObject print_assertions(final SubLObject query, final SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth, SubLObject stream) {
        if (backchainP == inference_testing.UNPROVIDED) {
            backchainP = (SubLObject)inference_testing.NIL;
        }
        if (number == inference_testing.UNPROVIDED) {
            number = (SubLObject)inference_testing.NIL;
        }
        if (time == inference_testing.UNPROVIDED) {
            time = (SubLObject)inference_testing.NIL;
        }
        if (depth == inference_testing.UNPROVIDED) {
            depth = (SubLObject)inference_testing.NIL;
        }
        if (stream == inference_testing.UNPROVIDED) {
            stream = (SubLObject)inference_testing.T;
        }
        final SubLObject assertions = list_assertions(query, mt, backchainP, number, time, depth);
        if (inference_testing.NIL != assertions) {
            SubLObject cdolist_list_var = assertions;
            SubLObject as = (SubLObject)inference_testing.NIL;
            as = cdolist_list_var.first();
            while (inference_testing.NIL != cdolist_list_var) {
                PrintLow.format(stream, (SubLObject)inference_testing.$str4$___s, as);
                cdolist_list_var = cdolist_list_var.rest();
                as = cdolist_list_var.first();
            }
        }
        else {
            PrintLow.format(stream, (SubLObject)inference_testing.$str5$__No_assertions_found_);
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 4633L)
    public static SubLObject instanceofP(final SubLObject x, final SubLObject collection) {
        return isa.isa_in_any_mtP(x, collection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 4708L)
    public static SubLObject legacy_b_verify(final SubLObject query_expr, final SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchainP == inference_testing.UNPROVIDED) {
            backchainP = (SubLObject)inference_testing.NIL;
        }
        if (number == inference_testing.UNPROVIDED) {
            number = (SubLObject)inference_testing.NIL;
        }
        if (time == inference_testing.UNPROVIDED) {
            time = (SubLObject)inference_testing.NIL;
        }
        if (depth == inference_testing.UNPROVIDED) {
            depth = (SubLObject)inference_testing.NIL;
        }
        final SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchainP, number, time, depth);
        return b_verify(query_expr, mt, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 5006L)
    public static SubLObject b_verify(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == inference_testing.UNPROVIDED) {
            mt = (SubLObject)inference_testing.NIL;
        }
        if (query_properties == inference_testing.UNPROVIDED) {
            query_properties = (SubLObject)inference_testing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            query_properties = conses_high.putf(query_properties, (SubLObject)inference_testing.$kw7$CONTINUABLE_, inference_testing.$verify_as_continuableP$.getDynamicValue(thread));
            final SubLObject form = (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym8$NEW_CYC_QUERY, list_utilities.quotify(sentence), list_utilities.quotify(mt), list_utilities.quotify(query_properties));
            if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, form);
            }
            final SubLObject val = Eval.eval(form);
            if (inference_testing.NIL != val) {
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str10$__Success___s________________s, form, val);
                }
            }
            else {
                inference_testing.$test_status$.setDynamicValue((SubLObject)inference_testing.$kw11$FAILURE, thread);
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread) || inference_testing.NIL != inference_testing.$it_show_all_failures$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str12$__Failure___s________________s, form, val);
                }
                if (inference_testing.NIL != break_on_failureP()) {
                    Errors.sublisp_break((SubLObject)inference_testing.$str13$Failure___s________________s, new SubLObject[] { form, val });
                }
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 5825L)
    public static SubLObject print_and_eval(final SubLObject expr_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var = expr_list;
            SubLObject expr = (SubLObject)inference_testing.NIL;
            expr = cdolist_list_var.first();
            while (inference_testing.NIL != cdolist_list_var) {
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, expr);
                }
                Eval.eval(expr);
                cdolist_list_var = cdolist_list_var.rest();
                expr = cdolist_list_var.first();
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 6039L)
    public static SubLObject b_test_form(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, form);
            }
            final SubLObject returned = Eval.eval(form);
            if (inference_testing.NIL != returned) {
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str14$__Success___s________________s__, form, returned);
                }
            }
            else {
                inference_testing.$test_status$.setDynamicValue((SubLObject)inference_testing.$kw11$FAILURE, thread);
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread) || inference_testing.NIL != inference_testing.$it_show_all_failures$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str15$__Failure___s________________s__, form, returned);
                }
                if (inference_testing.NIL != break_on_failureP()) {
                    Errors.sublisp_break((SubLObject)inference_testing.$str13$Failure___s________________s, new SubLObject[] { form, returned });
                }
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 6626L)
    public static SubLObject test_error(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, form);
            }
            SubLObject error_message = (SubLObject)inference_testing.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)inference_testing.$sym16$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject _prev_bind_0_$1 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                        try {
                            api_control_vars.$use_local_queueP$.bind((SubLObject)inference_testing.NIL, thread);
                            Eval.eval(form);
                            if (inference_testing.NIL != fi.fi_error_signaledP()) {
                                Errors.error((SubLObject)inference_testing.$str17$_A, fi.fi_get_error_string_int());
                            }
                        }
                        finally {
                            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)inference_testing.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (inference_testing.NIL != error_message) {
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str18$__Success___A__, error_message);
                }
            }
            else {
                inference_testing.$test_status$.setDynamicValue((SubLObject)inference_testing.$kw11$FAILURE, thread);
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread) || inference_testing.NIL != inference_testing.$it_show_all_failures$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str19$__Failure___s_______________NO_ER, form);
                }
                if (inference_testing.NIL != break_on_failureP()) {
                    Errors.sublisp_break((SubLObject)inference_testing.$str19$__Failure___s_______________NO_ER, new SubLObject[] { form });
                }
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 7713L)
    public static SubLObject test_warning(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, form);
            }
            SubLObject error_message = (SubLObject)inference_testing.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)inference_testing.$sym16$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject _prev_bind_0_$2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                        try {
                            api_control_vars.$use_local_queueP$.bind((SubLObject)inference_testing.NIL, thread);
                            Eval.eval(form);
                            if (inference_testing.NIL != fi.fi_warning_signaledP()) {
                                Errors.error((SubLObject)inference_testing.$str17$_A, fi.fi_get_warning_int());
                            }
                        }
                        finally {
                            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)inference_testing.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (inference_testing.NIL != error_message) {
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str18$__Success___A__, error_message);
                }
            }
            else {
                inference_testing.$test_status$.setDynamicValue((SubLObject)inference_testing.$kw11$FAILURE, thread);
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread) || inference_testing.NIL != inference_testing.$it_show_all_failures$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str19$__Failure___s_______________NO_ER, form);
                }
                if (inference_testing.NIL != break_on_failureP()) {
                    Errors.sublisp_break((SubLObject)inference_testing.$str19$__Failure___s_______________NO_ER, new SubLObject[] { form });
                }
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 8664L)
    public static SubLObject test_no_warning(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, form);
            }
            SubLObject error_message = (SubLObject)inference_testing.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)inference_testing.$sym16$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject _prev_bind_0_$3 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                        try {
                            api_control_vars.$use_local_queueP$.bind((SubLObject)inference_testing.NIL, thread);
                            Eval.eval(form);
                            if (inference_testing.NIL != fi.fi_warning_signaledP()) {
                                Errors.error((SubLObject)inference_testing.$str17$_A, fi.fi_get_warning_int());
                            }
                        }
                        finally {
                            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)inference_testing.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (inference_testing.NIL != error_message) {
                inference_testing.$test_status$.setDynamicValue((SubLObject)inference_testing.$kw11$FAILURE, thread);
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread) || inference_testing.NIL != inference_testing.$it_show_all_failures$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str20$__Failure___A__, error_message);
                }
                if (inference_testing.NIL != break_on_failureP()) {
                    Errors.sublisp_break((SubLObject)inference_testing.$str19$__Failure___s_______________NO_ER, new SubLObject[] { form });
                }
            }
            else if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str21$__Success___s_______________NO_ER);
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 9617L)
    public static SubLObject form_verify(final SubLObject test_function, final SubLObject value, final SubLObject form_to_eval, SubLObject test_predicate) {
        if (test_predicate == inference_testing.UNPROVIDED) {
            test_predicate = (SubLObject)inference_testing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, form_to_eval);
            }
            final SubLObject returned = Eval.eval(form_to_eval);
            if (inference_testing.NIL != ((inference_testing.NIL != test_predicate) ? Functions.funcall(test_function, value, returned, test_predicate) : Functions.funcall(test_function, value, returned))) {
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str22$__Success___s________________s__C, new SubLObject[] { form_to_eval, returned, value, test_function });
                }
            }
            else {
                inference_testing.$test_status$.setDynamicValue((SubLObject)inference_testing.$kw11$FAILURE, thread);
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread) || inference_testing.NIL != inference_testing.$it_show_all_failures$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str23$__Failure___s________________s__C, new SubLObject[] { form_to_eval, returned, value, test_function });
                }
                if (inference_testing.NIL != break_on_failureP()) {
                    Errors.sublisp_break((SubLObject)inference_testing.$str24$Failure___s________________s__Com, new SubLObject[] { form_to_eval, returned, value, test_function });
                }
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 10765L)
    public static SubLObject test_verify(final SubLObject predicate, final SubLObject form_to_eval) {
        return test_verify_guts(predicate, form_to_eval, (SubLObject)inference_testing.$kw25$EVAL_AGAIN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 11020L)
    public static SubLObject test_verify_new(final SubLObject predicate, final SubLObject form_to_eval) {
        return test_verify_guts(predicate, form_to_eval, (SubLObject)inference_testing.$kw26$APPLY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 11268L)
    public static SubLObject test_verify_guts(final SubLObject predicate, final SubLObject form_to_eval, final SubLObject eval_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, form_to_eval);
            }
            final SubLObject evaluated_form = Eval.eval(form_to_eval);
            final SubLObject results = (eval_method == inference_testing.$kw25$EVAL_AGAIN) ? Eval.eval((SubLObject)ConsesLow.list(predicate, evaluated_form)) : Functions.apply(predicate, (SubLObject)ConsesLow.list(evaluated_form));
            if (inference_testing.NIL != results) {
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str27$__Success___s________________s__p, new SubLObject[] { form_to_eval, evaluated_form, predicate });
                }
            }
            else {
                inference_testing.$test_status$.setDynamicValue((SubLObject)inference_testing.$kw11$FAILURE, thread);
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str28$__Failure___s________________s_fa, new SubLObject[] { form_to_eval, evaluated_form, predicate });
                }
                if (inference_testing.NIL != break_on_failureP()) {
                    Errors.sublisp_break((SubLObject)inference_testing.$str29$Failure___s________________s_fail, new SubLObject[] { form_to_eval, evaluated_form, predicate });
                }
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 12129L)
    public static SubLObject m_verify(final SubLObject expected, final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == inference_testing.UNPROVIDED) {
            mt = (SubLObject)inference_testing.NIL;
        }
        if (query_properties == inference_testing.UNPROVIDED) {
            query_properties = (SubLObject)inference_testing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            final SubLObject form = (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym30$RETURN_LIST_OF_VALUES, list_utilities.quotify(sentence), list_utilities.quotify(mt), list_utilities.quotify(query_properties));
            if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, form);
            }
            final SubLObject result = Eval.eval(form);
            final SubLObject found = conses_high.intersection(expected, result, Symbols.symbol_function((SubLObject)inference_testing.EQUAL), (SubLObject)inference_testing.UNPROVIDED);
            final SubLObject not_found = conses_high.set_difference(expected, found, Symbols.symbol_function((SubLObject)inference_testing.EQUAL), (SubLObject)inference_testing.UNPROVIDED);
            final SubLObject unexpected = conses_high.set_difference(result, expected, Symbols.symbol_function((SubLObject)inference_testing.EQUAL), (SubLObject)inference_testing.UNPROVIDED);
            if (inference_testing.NIL != list_utilities.sets_equalP(expected, found, Symbols.symbol_function((SubLObject)inference_testing.EQUAL))) {
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str31$__Normal___s_______________s__Exp, new SubLObject[] { form, found, expected });
                }
            }
            else {
                inference_testing.$test_status$.setDynamicValue((SubLObject)inference_testing.$kw32$ABNORMAL, thread);
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str33$__Abnormal___s_________________s_, new SubLObject[] { form, found, expected, not_found, unexpected });
                }
                if (inference_testing.NIL != break_on_failureP()) {
                    Errors.sublisp_break((SubLObject)inference_testing.$str34$Abnormal___s_________________s__E, new SubLObject[] { form, found, expected, not_found, unexpected });
                }
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 13296L)
    public static SubLObject legacy_binding_verify(final SubLObject expected_bindings, final SubLObject query_expr, final SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchainP == inference_testing.UNPROVIDED) {
            backchainP = (SubLObject)inference_testing.NIL;
        }
        if (number == inference_testing.UNPROVIDED) {
            number = (SubLObject)inference_testing.NIL;
        }
        if (time == inference_testing.UNPROVIDED) {
            time = (SubLObject)inference_testing.NIL;
        }
        if (depth == inference_testing.UNPROVIDED) {
            depth = (SubLObject)inference_testing.NIL;
        }
        final SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchainP, number, time, depth);
        return binding_verify(expected_bindings, query_expr, mt, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 13664L)
    public static SubLObject binding_verify(final SubLObject expected_bindings, final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == inference_testing.UNPROVIDED) {
            mt = (SubLObject)inference_testing.NIL;
        }
        if (query_properties == inference_testing.UNPROVIDED) {
            query_properties = (SubLObject)inference_testing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            query_properties = conses_high.putf(query_properties, (SubLObject)inference_testing.$kw7$CONTINUABLE_, inference_testing.$verify_as_continuableP$.getDynamicValue(thread));
            final SubLObject form = (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym8$NEW_CYC_QUERY, list_utilities.quotify(sentence), list_utilities.quotify(mt), list_utilities.quotify(query_properties));
            if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, form);
            }
            final SubLObject result_bindings = Eval.eval(form);
            if (inference_testing.NIL != list_utilities.sets_equalP(expected_bindings, result_bindings, Symbols.symbol_function((SubLObject)inference_testing.$sym35$EQUAL_BINDINGS))) {
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str31$__Normal___s_______________s__Exp, new SubLObject[] { form, result_bindings, expected_bindings });
                }
            }
            else {
                inference_testing.$test_status$.setDynamicValue((SubLObject)inference_testing.$kw32$ABNORMAL, thread);
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str36$__Abnormal___s_______________s__E, new SubLObject[] { form, result_bindings, expected_bindings });
                }
                if (inference_testing.NIL != break_on_failureP()) {
                    Errors.sublisp_break((SubLObject)inference_testing.$str37$Abnormal___s_______________s__Exp, new SubLObject[] { form, result_bindings, expected_bindings });
                }
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 14734L)
    public static SubLObject legacy_verify_not(final SubLObject query_expr, final SubLObject mt, SubLObject backchainP, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchainP == inference_testing.UNPROVIDED) {
            backchainP = (SubLObject)inference_testing.NIL;
        }
        if (number == inference_testing.UNPROVIDED) {
            number = (SubLObject)inference_testing.NIL;
        }
        if (time == inference_testing.UNPROVIDED) {
            time = (SubLObject)inference_testing.NIL;
        }
        if (depth == inference_testing.UNPROVIDED) {
            depth = (SubLObject)inference_testing.NIL;
        }
        final SubLObject query_properties = ask_utilities.query_properties_from_legacy_ask_parameters(backchainP, number, time, depth);
        return verify_not(query_expr, mt, query_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 15026L)
    public static SubLObject verify_not(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == inference_testing.UNPROVIDED) {
            mt = (SubLObject)inference_testing.NIL;
        }
        if (query_properties == inference_testing.UNPROVIDED) {
            query_properties = (SubLObject)inference_testing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            query_properties = conses_high.putf(query_properties, (SubLObject)inference_testing.$kw7$CONTINUABLE_, inference_testing.$verify_as_continuableP$.getDynamicValue(thread));
            final SubLObject form = (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym8$NEW_CYC_QUERY, list_utilities.quotify(sentence), list_utilities.quotify(mt), list_utilities.quotify(query_properties));
            if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, form);
            }
            final SubLObject val = Eval.eval(form);
            if (inference_testing.NIL == val) {
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str10$__Success___s________________s, form, val);
                }
            }
            else {
                inference_testing.$test_status$.setDynamicValue((SubLObject)inference_testing.$kw11$FAILURE, thread);
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread) || inference_testing.NIL != inference_testing.$it_show_all_failures$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str12$__Failure___s________________s, form, val);
                }
                if (inference_testing.NIL != break_on_failureP()) {
                    Errors.sublisp_break((SubLObject)inference_testing.$str13$Failure___s________________s, new SubLObject[] { form, val });
                }
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 15830L)
    public static SubLObject print_assert(final SubLObject expr_list, final SubLObject mt, SubLObject el_tv, SubLObject direction) {
        if (el_tv == inference_testing.UNPROVIDED) {
            el_tv = (SubLObject)inference_testing.$kw38$DEFAULT;
        }
        if (direction == inference_testing.UNPROVIDED) {
            direction = (SubLObject)inference_testing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var = expr_list;
            SubLObject expr = (SubLObject)inference_testing.NIL;
            expr = cdolist_list_var.first();
            while (inference_testing.NIL != cdolist_list_var) {
                final SubLObject v_properties = (SubLObject)ConsesLow.listS((SubLObject)inference_testing.$kw39$STRENGTH, el_tv, ConsesLow.append((SubLObject)((inference_testing.NIL != direction) ? ConsesLow.list((SubLObject)inference_testing.$kw40$DIRECTION, direction) : inference_testing.NIL), (SubLObject)inference_testing.NIL));
                final SubLObject form = (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym41$CYC_ASSERT, list_utilities.quotify(expr), list_utilities.quotify(mt), list_utilities.quotify(v_properties));
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, form);
                }
                final SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                try {
                    control_vars.$use_transcriptP$.bind((SubLObject)inference_testing.NIL, thread);
                    api_control_vars.$use_local_queueP$.bind((SubLObject)inference_testing.NIL, thread);
                    final SubLObject success = Eval.eval(form);
                    if (inference_testing.NIL == success) {
                        inference_testing.$test_status$.setDynamicValue((SubLObject)inference_testing.$kw11$FAILURE, thread);
                        if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread) || inference_testing.NIL != inference_testing.$it_show_all_failures$.getDynamicValue(thread)) {
                            PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str42$__Failure__Assertion__s_failed_, form);
                        }
                        if (inference_testing.NIL != break_on_failureP()) {
                            Errors.sublisp_break((SubLObject)inference_testing.$str43$Failure__Assertion__s_failed_, new SubLObject[] { form });
                        }
                    }
                }
                finally {
                    api_control_vars.$use_local_queueP$.rebind(_prev_bind_2, thread);
                    control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                expr = cdolist_list_var.first();
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 16672L)
    public static SubLObject print_assert_wff(final SubLObject expr_list, final SubLObject mt, SubLObject el_tv, SubLObject direction) {
        if (el_tv == inference_testing.UNPROVIDED) {
            el_tv = (SubLObject)inference_testing.$kw38$DEFAULT;
        }
        if (direction == inference_testing.UNPROVIDED) {
            direction = (SubLObject)inference_testing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var = expr_list;
            SubLObject expr = (SubLObject)inference_testing.NIL;
            expr = cdolist_list_var.first();
            while (inference_testing.NIL != cdolist_list_var) {
                final SubLObject v_properties = (SubLObject)ConsesLow.listS((SubLObject)inference_testing.$kw39$STRENGTH, el_tv, ConsesLow.append((SubLObject)((inference_testing.NIL != direction) ? ConsesLow.list((SubLObject)inference_testing.$kw40$DIRECTION, direction) : inference_testing.NIL), (SubLObject)inference_testing.NIL));
                final SubLObject form = (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym44$CYC_ASSERT_WFF, list_utilities.quotify(expr), list_utilities.quotify(mt), list_utilities.quotify(v_properties));
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, form);
                }
                final SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                try {
                    control_vars.$use_transcriptP$.bind((SubLObject)inference_testing.NIL, thread);
                    api_control_vars.$use_local_queueP$.bind((SubLObject)inference_testing.NIL, thread);
                    final SubLObject success = Eval.eval(form);
                    if (inference_testing.NIL == success) {
                        inference_testing.$test_status$.setDynamicValue((SubLObject)inference_testing.$kw11$FAILURE, thread);
                        if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread) || inference_testing.NIL != inference_testing.$it_show_all_failures$.getDynamicValue(thread)) {
                            PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str42$__Failure__Assertion__s_failed_, form);
                        }
                        if (inference_testing.NIL != break_on_failureP()) {
                            Errors.sublisp_break((SubLObject)inference_testing.$str43$Failure__Assertion__s_failed_, new SubLObject[] { form });
                        }
                    }
                }
                finally {
                    api_control_vars.$use_local_queueP$.rebind(_prev_bind_2, thread);
                    control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                expr = cdolist_list_var.first();
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 17565L)
    public static SubLObject print_assert_with_time(final SubLObject forms, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == inference_testing.UNPROVIDED) {
            strength = (SubLObject)inference_testing.$kw38$DEFAULT;
        }
        if (direction == inference_testing.UNPROVIDED) {
            direction = (SubLObject)inference_testing.$kw45$FORWARD;
        }
        SubLObject assert_time = (SubLObject)inference_testing.ZERO_INTEGER;
        SubLObject result = (SubLObject)inference_testing.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        final SubLObject kb_object_count_list_1 = kb_utilities.kb_object_count_list();
        result = print_assert(forms, mt, strength, direction);
        final SubLObject kb_object_count_list_2 = kb_utilities.kb_object_count_list();
        final SubLObject new_constant_count = kb_utilities.kb_object_count_lists_new_constant_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_nart_count = kb_utilities.kb_object_count_lists_new_nart_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_assertion_count = kb_utilities.kb_object_count_lists_new_assertion_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_kb_hl_support_count = kb_utilities.kb_object_count_lists_new_kb_hl_support_count(kb_object_count_list_2, kb_object_count_list_1);
        final SubLObject new_deduction_count = kb_utilities.kb_object_count_lists_new_deduction_count(kb_object_count_list_2, kb_object_count_list_1);
        if (inference_testing.NIL != subl_promotions.non_zero_integer_p(new_constant_count) || inference_testing.NIL != subl_promotions.non_zero_integer_p(new_nart_count) || inference_testing.NIL != subl_promotions.non_zero_integer_p(new_assertion_count) || inference_testing.NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count) || inference_testing.NIL != subl_promotions.non_zero_integer_p(new_deduction_count)) {
            if (inference_testing.NIL.isString()) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str47$___A__, (SubLObject)inference_testing.NIL);
            }
            if (inference_testing.NIL != subl_promotions.non_zero_integer_p(new_constant_count)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str48$___s_constant_A__A__, new SubLObject[] { Numbers.abs(new_constant_count), Numbers.abs(new_constant_count).numG((SubLObject)inference_testing.ONE_INTEGER) ? inference_testing.$str49$s_were : inference_testing.$str50$_was, (inference_testing.NIL != subl_promotions.positive_integer_p(new_constant_count)) ? inference_testing.$str51$created : inference_testing.$str52$destroyed });
            }
            if (inference_testing.NIL != subl_promotions.non_zero_integer_p(new_nart_count)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str53$___s_nart_A__A__, new SubLObject[] { Numbers.abs(new_nart_count), Numbers.abs(new_nart_count).numG((SubLObject)inference_testing.ONE_INTEGER) ? inference_testing.$str49$s_were : inference_testing.$str50$_was, (inference_testing.NIL != subl_promotions.positive_integer_p(new_nart_count)) ? inference_testing.$str51$created : inference_testing.$str52$destroyed });
            }
            if (inference_testing.NIL != subl_promotions.non_zero_integer_p(new_assertion_count)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str54$___s_assertion_A__A__, new SubLObject[] { Numbers.abs(new_assertion_count), Numbers.abs(new_assertion_count).numG((SubLObject)inference_testing.ONE_INTEGER) ? inference_testing.$str49$s_were : inference_testing.$str50$_was, (inference_testing.NIL != subl_promotions.positive_integer_p(new_assertion_count)) ? inference_testing.$str51$created : inference_testing.$str52$destroyed });
            }
            if (inference_testing.NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str55$___s_kb_hl_support_A__A__, new SubLObject[] { Numbers.abs(new_kb_hl_support_count), Numbers.abs(new_kb_hl_support_count).numG((SubLObject)inference_testing.ONE_INTEGER) ? inference_testing.$str49$s_were : inference_testing.$str50$_was, (inference_testing.NIL != subl_promotions.positive_integer_p(new_kb_hl_support_count)) ? inference_testing.$str51$created : inference_testing.$str52$destroyed });
            }
            if (inference_testing.NIL != subl_promotions.non_zero_integer_p(new_deduction_count)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str56$___s_deduction_A__A__, new SubLObject[] { Numbers.abs(new_deduction_count), Numbers.abs(new_deduction_count).numG((SubLObject)inference_testing.ONE_INTEGER) ? inference_testing.$str49$s_were : inference_testing.$str50$_was, (inference_testing.NIL != subl_promotions.positive_integer_p(new_deduction_count)) ? inference_testing.$str51$created : inference_testing.$str52$destroyed });
            }
        }
        else if (inference_testing.NIL.isString()) {
            PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str47$___A__, (SubLObject)inference_testing.NIL);
        }
        streams_high.force_output((SubLObject)inference_testing.T);
        assert_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str57$__Assert_time____A, assert_time);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 17890L)
    public static SubLObject print_unassert(final SubLObject expr_list, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var = expr_list;
            SubLObject expr = (SubLObject)inference_testing.NIL;
            expr = cdolist_list_var.first();
            while (inference_testing.NIL != cdolist_list_var) {
                final SubLObject form = (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym58$FI_UNASSERT_INT, list_utilities.quotify(expr), list_utilities.quotify(mt));
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, form);
                }
                Eval.eval(form);
                cdolist_list_var = cdolist_list_var.rest();
                expr = cdolist_list_var.first();
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 18247L)
    public static SubLObject print_blast(final SubLObject expr_list, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var = expr_list;
            SubLObject expr = (SubLObject)inference_testing.NIL;
            expr = cdolist_list_var.first();
            while (inference_testing.NIL != cdolist_list_var) {
                final SubLObject form = (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym59$FI_BLAST_INT, list_utilities.quotify(expr), list_utilities.quotify(mt));
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, form);
                }
                Eval.eval(form);
                cdolist_list_var = cdolist_list_var.rest();
                expr = cdolist_list_var.first();
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 18591L)
    public static SubLObject print_justify(final SubLObject expr, final SubLObject mt, SubLObject fullP) {
        if (fullP == inference_testing.UNPROVIDED) {
            fullP = (SubLObject)inference_testing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            final SubLObject form = (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym60$FI_JUSTIFY_INT, list_utilities.quotify(expr), list_utilities.quotify(mt), fullP);
            if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, form);
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str61$__Justification_____s, Eval.eval(form));
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 18893L)
    public static SubLObject print_kill(final SubLObject term_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = term_list;
        SubLObject v_term = (SubLObject)inference_testing.NIL;
        v_term = cdolist_list_var.first();
        while (inference_testing.NIL != cdolist_list_var) {
            if (inference_testing.NIL != forts.valid_fortP(v_term)) {
                if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym62$FI_KILL_INT, v_term));
                }
                final SubLObject name = kb_paths.fort_name(v_term);
                fi.fi_kill_int(v_term);
                if (inference_testing.NIL == fi.fi_find_int(name)) {
                    inference_testing.$test_constants_created$.setDynamicValue(Sequences.delete(name, inference_testing.$test_constants_created$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)inference_testing.EQUAL), (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED), thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 19298L)
    public static SubLObject print_create(final SubLObject name, SubLObject var_name) {
        if (var_name == inference_testing.UNPROVIDED) {
            var_name = (SubLObject)inference_testing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unique_name = (SubLObject)inference_testing.NIL;
        SubLObject form = (SubLObject)inference_testing.NIL;
        SubLObject v_new = (SubLObject)inference_testing.NIL;
        SubLObject unique = (SubLObject)inference_testing.NIL;
        unique_name = constant_completion_high.uniquify_constant_name(name, (SubLObject)inference_testing.UNPROVIDED);
        form = (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym63$FI_FIND_OR_CREATE_INT, unique_name);
        if (inference_testing.NIL == fi.fi_find_int(unique_name)) {
            unique = (SubLObject)inference_testing.T;
            v_new = Eval.eval(form);
        }
        if (inference_testing.NIL == unique) {
            inference_testing.$test_status$.setDynamicValue((SubLObject)inference_testing.$kw11$FAILURE, thread);
            if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread) || inference_testing.NIL != inference_testing.$it_show_all_failures$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str64$__Failure__Did_not_find_unique_na, name);
            }
            if (inference_testing.NIL != break_on_failureP()) {
                Errors.sublisp_break((SubLObject)inference_testing.$str65$Failure__Create_constant__s_faile, new SubLObject[] { unique_name });
            }
        }
        else if (inference_testing.NIL != v_new) {
            if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, form);
            }
            final SubLObject item_var = unique_name;
            if (inference_testing.NIL == conses_high.member(item_var, inference_testing.$test_constants_created$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)inference_testing.EQUAL), Symbols.symbol_function((SubLObject)inference_testing.IDENTITY))) {
                inference_testing.$test_constants_created$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, inference_testing.$test_constants_created$.getDynamicValue(thread)), thread);
            }
            return v_new;
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 20483L)
    public static SubLObject print_tms_formula(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym66$FI_TMS_RECONSIDER_FORMULA_INT, list_utilities.quotify(formula), list_utilities.quotify(mt)));
            }
            fi.fi_tms_reconsider_formula_int(formula, mt);
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 20764L)
    public static SubLObject print_tms_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN) || inference_testing.NIL != inference_testing.$debug_continue$.getDynamicValue(thread)) {
            if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str9$_____s, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym67$FI_TMS_RECONSIDER_MT_INT, list_utilities.quotify(mt)));
            }
            fi.fi_tms_reconsider_mt_int(mt);
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 20995L)
    public static SubLObject update_test_results(final SubLObject test_keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$test_status$.getDynamicValue(thread).equal((SubLObject)inference_testing.$kw6$UNKNOWN)) {
            inference_testing.$test_status$.setDynamicValue((SubLObject)inference_testing.$kw68$SUCCESS, thread);
        }
        final SubLObject pair = (SubLObject)ConsesLow.list(test_keyword, inference_testing.$test_direction$.getDynamicValue(thread));
        if (inference_testing.NIL != Sequences.find(pair, inference_testing.$test_results$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)inference_testing.EQUAL), Symbols.symbol_function((SubLObject)inference_testing.$sym69$CAR), (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED)) {
            inference_testing.$test_results$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(pair, inference_testing.$test_status$.getDynamicValue(thread)), Sequences.remove(pair, inference_testing.$test_results$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)inference_testing.EQUAL), Symbols.symbol_function((SubLObject)inference_testing.$sym69$CAR), (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED)), thread);
        }
        else {
            inference_testing.$test_results$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(pair, inference_testing.$test_status$.getDynamicValue(thread)), inference_testing.$test_results$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 21393L)
    public static SubLObject kill_test_constants_created() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.NIL != inference_testing.$clean_up_test_constantsP$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var = inference_testing.$test_constants_created$.getDynamicValue(thread);
            SubLObject name = (SubLObject)inference_testing.NIL;
            name = cdolist_list_var.first();
            while (inference_testing.NIL != cdolist_list_var) {
                final SubLObject constant = fi.fi_find_int(name);
                if (inference_testing.NIL != constant) {
                    print_kill((SubLObject)ConsesLow.list(constant));
                }
                cdolist_list_var = cdolist_list_var.rest();
                name = cdolist_list_var.first();
            }
            inference_testing.$test_constants_created$.setDynamicValue((SubLObject)inference_testing.NIL, thread);
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 21693L)
    public static SubLObject run_test(final SubLObject test_keyword, SubLObject progress_blipP, SubLObject verboseP, SubLObject testing_direction, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        final SubLObject backchain_provided_p = (SubLObject)SubLObjectFactory.makeBoolean(backchain != inference_testing.UNPROVIDED);
        if (progress_blipP == inference_testing.UNPROVIDED) {
            progress_blipP = (SubLObject)inference_testing.T;
        }
        if (verboseP == inference_testing.UNPROVIDED) {
            verboseP = (SubLObject)inference_testing.NIL;
        }
        if (testing_direction == inference_testing.UNPROVIDED) {
            testing_direction = (SubLObject)inference_testing.$kw3$BACKWARD;
        }
        if (backchain == inference_testing.UNPROVIDED) {
            backchain = (SubLObject)inference_testing.T;
        }
        if (number == inference_testing.UNPROVIDED) {
            number = (SubLObject)inference_testing.ONE_INTEGER;
        }
        if (time == inference_testing.UNPROVIDED) {
            time = (SubLObject)inference_testing.TEN_INTEGER;
        }
        if (depth == inference_testing.UNPROVIDED) {
            depth = (SubLObject)inference_testing.TWENTY_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (operation_communication.communication_mode() == inference_testing.$kw70$TRANSMIT_AND_RECEIVE) {
            operation_communication.set_communication_mode((SubLObject)inference_testing.$kw71$DEAF);
        }
        if (testing_direction == inference_testing.$kw45$FORWARD && inference_testing.NIL == backchain_provided_p) {
            backchain = (SubLObject)inference_testing.NIL;
        }
        final SubLObject form = inference_test_form(test_keyword);
        SubLObject test_run = (SubLObject)inference_testing.NIL;
        final SubLObject _prev_bind_0 = inference_testing.$test_constants_created$.currentBinding(thread);
        try {
            inference_testing.$test_constants_created$.bind((SubLObject)inference_testing.NIL, thread);
            if (form.isCons()) {
                final SubLObject kb_object_count_list_1 = kb_utilities.kb_object_count_list();
                try {
                    final SubLObject _prev_bind_0_$4 = inference_testing.$current_test$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = inference_testing.$test_status$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = inference_testing.$elapsed_time$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = inference_testing.$it_backchain$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = inference_testing.$it_number$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = inference_testing.$it_time$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = inference_testing.$it_depth$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = inference_testing.$it_verbose$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = inference_testing.$test_direction$.currentBinding(thread);
                    try {
                        inference_testing.$current_test$.bind(test_keyword, thread);
                        inference_testing.$test_status$.bind((SubLObject)inference_testing.$kw6$UNKNOWN, thread);
                        inference_testing.$elapsed_time$.bind((SubLObject)inference_testing.NIL, thread);
                        inference_testing.$it_backchain$.bind(backchain, thread);
                        inference_testing.$it_number$.bind(number, thread);
                        inference_testing.$it_time$.bind(time, thread);
                        inference_testing.$it_depth$.bind(depth, thread);
                        inference_testing.$it_verbose$.bind(verboseP, thread);
                        inference_testing.$test_direction$.bind(testing_direction, thread);
                        if (inference_testing.NIL != progress_blipP) {
                            final SubLObject pcase_var = cyc_testing.$it_output_format$.getDynamicValue(thread);
                            if (pcase_var.eql((SubLObject)inference_testing.$kw72$STANDARD)) {
                                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str73$___IT___S__S_, test_keyword, inference_testing.$test_direction$.getDynamicValue(thread));
                                streams_high.force_output((SubLObject)inference_testing.UNPROVIDED);
                            }
                            else if (pcase_var.eql((SubLObject)inference_testing.$kw74$POST_BUILD) && inference_testing.NIL != verboseP) {
                                format_nil.force_format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str75$_____Starting__IT___S__S__at__A__, test_keyword, inference_testing.$test_direction$.getDynamicValue(thread), numeric_date_utilities.timestring_ms((SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED), (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED);
                            }
                        }
                        SubLObject time_$5 = (SubLObject)inference_testing.NIL;
                        final SubLObject time_var = Time.get_internal_real_time();
                        SubLObject cdolist_list_var = form;
                        SubLObject expr = (SubLObject)inference_testing.NIL;
                        expr = cdolist_list_var.first();
                        while (inference_testing.NIL != cdolist_list_var) {
                            eval_in_api.cyc_api_eval(expr);
                            cdolist_list_var = cdolist_list_var.rest();
                            expr = cdolist_list_var.first();
                        }
                        time_$5 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                        final SubLObject name = (SubLObject)ConsesLow.list(test_keyword, testing_direction);
                        test_run = cyc_testing.new_cyc_test_run((SubLObject)inference_testing.$kw76$IT, name, inference_testing.$test_status$.getDynamicValue(thread), time_$5);
                        if (inference_testing.NIL != progress_blipP) {
                            final SubLObject result = conses_high.assoc((SubLObject)ConsesLow.list(test_keyword, inference_testing.$test_direction$.getDynamicValue(thread)), inference_testing.$test_results$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)inference_testing.EQUAL), (SubLObject)inference_testing.UNPROVIDED).rest();
                            final SubLObject pcase_var2 = cyc_testing.$it_output_format$.getDynamicValue(thread);
                            if (pcase_var2.eql((SubLObject)inference_testing.$kw72$STANDARD)) {
                                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str77$_____s____3f_, result, time_$5);
                            }
                            else if (pcase_var2.eql((SubLObject)inference_testing.$kw74$POST_BUILD)) {
                                cyc_testing.print_post_build_test_summary((SubLObject)inference_testing.T, result, (SubLObject)inference_testing.$kw76$IT, (SubLObject)ConsesLow.list(test_keyword, testing_direction), time_$5, inference_test_owner(test_keyword));
                            }
                        }
                    }
                    finally {
                        inference_testing.$test_direction$.rebind(_prev_bind_9, thread);
                        inference_testing.$it_verbose$.rebind(_prev_bind_8, thread);
                        inference_testing.$it_depth$.rebind(_prev_bind_7, thread);
                        inference_testing.$it_time$.rebind(_prev_bind_6, thread);
                        inference_testing.$it_number$.rebind(_prev_bind_5, thread);
                        inference_testing.$it_backchain$.rebind(_prev_bind_4, thread);
                        inference_testing.$elapsed_time$.rebind(_prev_bind_3, thread);
                        inference_testing.$test_status$.rebind(_prev_bind_2, thread);
                        inference_testing.$current_test$.rebind(_prev_bind_0_$4, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_testing.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        kill_test_constants_created();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
                final SubLObject kb_object_count_list_2 = kb_utilities.kb_object_count_list();
                final SubLObject new_constant_count = kb_utilities.kb_object_count_lists_new_constant_count(kb_object_count_list_2, kb_object_count_list_1);
                final SubLObject new_nart_count = kb_utilities.kb_object_count_lists_new_nart_count(kb_object_count_list_2, kb_object_count_list_1);
                final SubLObject new_assertion_count = kb_utilities.kb_object_count_lists_new_assertion_count(kb_object_count_list_2, kb_object_count_list_1);
                final SubLObject new_kb_hl_support_count = kb_utilities.kb_object_count_lists_new_kb_hl_support_count(kb_object_count_list_2, kb_object_count_list_1);
                final SubLObject new_deduction_count = kb_utilities.kb_object_count_lists_new_deduction_count(kb_object_count_list_2, kb_object_count_list_1);
                if (((inference_testing.NIL != verboseP) ? inference_testing.$kw78$VERBOSE : inference_testing.$kw46$SILENT) != inference_testing.$kw46$SILENT) {
                    if (inference_testing.NIL != subl_promotions.non_zero_integer_p(new_constant_count) || inference_testing.NIL != subl_promotions.non_zero_integer_p(new_nart_count) || inference_testing.NIL != subl_promotions.non_zero_integer_p(new_assertion_count) || inference_testing.NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count) || inference_testing.NIL != subl_promotions.non_zero_integer_p(new_deduction_count)) {
                        if (Sequences.cconcatenate((SubLObject)inference_testing.$str79$Warning__Test__, new SubLObject[] { format_nil.format_nil_s_no_copy(test_keyword), inference_testing.$str80$_, format_nil.format_nil_s_no_copy(testing_direction), inference_testing.$str81$__changed_the_KB_ }).isString()) {
                            PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str47$___A__, Sequences.cconcatenate((SubLObject)inference_testing.$str79$Warning__Test__, new SubLObject[] { format_nil.format_nil_s_no_copy(test_keyword), inference_testing.$str80$_, format_nil.format_nil_s_no_copy(testing_direction), inference_testing.$str81$__changed_the_KB_ }));
                        }
                        if (inference_testing.NIL != subl_promotions.non_zero_integer_p(new_constant_count)) {
                            PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str48$___s_constant_A__A__, new SubLObject[] { Numbers.abs(new_constant_count), Numbers.abs(new_constant_count).numG((SubLObject)inference_testing.ONE_INTEGER) ? inference_testing.$str49$s_were : inference_testing.$str50$_was, (inference_testing.NIL != subl_promotions.positive_integer_p(new_constant_count)) ? inference_testing.$str51$created : inference_testing.$str52$destroyed });
                        }
                        if (inference_testing.NIL != subl_promotions.non_zero_integer_p(new_nart_count)) {
                            PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str53$___s_nart_A__A__, new SubLObject[] { Numbers.abs(new_nart_count), Numbers.abs(new_nart_count).numG((SubLObject)inference_testing.ONE_INTEGER) ? inference_testing.$str49$s_were : inference_testing.$str50$_was, (inference_testing.NIL != subl_promotions.positive_integer_p(new_nart_count)) ? inference_testing.$str51$created : inference_testing.$str52$destroyed });
                        }
                        if (inference_testing.NIL != subl_promotions.non_zero_integer_p(new_assertion_count)) {
                            PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str54$___s_assertion_A__A__, new SubLObject[] { Numbers.abs(new_assertion_count), Numbers.abs(new_assertion_count).numG((SubLObject)inference_testing.ONE_INTEGER) ? inference_testing.$str49$s_were : inference_testing.$str50$_was, (inference_testing.NIL != subl_promotions.positive_integer_p(new_assertion_count)) ? inference_testing.$str51$created : inference_testing.$str52$destroyed });
                        }
                        if (inference_testing.NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count)) {
                            PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str55$___s_kb_hl_support_A__A__, new SubLObject[] { Numbers.abs(new_kb_hl_support_count), Numbers.abs(new_kb_hl_support_count).numG((SubLObject)inference_testing.ONE_INTEGER) ? inference_testing.$str49$s_were : inference_testing.$str50$_was, (inference_testing.NIL != subl_promotions.positive_integer_p(new_kb_hl_support_count)) ? inference_testing.$str51$created : inference_testing.$str52$destroyed });
                        }
                        if (inference_testing.NIL != subl_promotions.non_zero_integer_p(new_deduction_count)) {
                            PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str56$___s_deduction_A__A__, new SubLObject[] { Numbers.abs(new_deduction_count), Numbers.abs(new_deduction_count).numG((SubLObject)inference_testing.ONE_INTEGER) ? inference_testing.$str49$s_were : inference_testing.$str50$_was, (inference_testing.NIL != subl_promotions.positive_integer_p(new_deduction_count)) ? inference_testing.$str51$created : inference_testing.$str52$destroyed });
                        }
                    }
                    else if (inference_testing.NIL.isString()) {
                        PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str47$___A__, (SubLObject)inference_testing.NIL);
                    }
                }
                streams_high.force_output((SubLObject)inference_testing.T);
            }
            else {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str82$__There_is_no_test_in__s_associat, (SubLObject)inference_testing.$sym83$_INFERENCE_TESTS_, test_keyword);
                if (inference_testing.NIL == inference_testing.$inference_tests$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str84$__In_fact__there_are_no_tests_in_, (SubLObject)inference_testing.$sym83$_INFERENCE_TESTS_);
                }
            }
        }
        finally {
            inference_testing.$test_constants_created$.rebind(_prev_bind_0, thread);
        }
        return test_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 24192L)
    public static SubLObject do_tests(SubLObject keyword_list, SubLObject progress_blipP, SubLObject verboseP, SubLObject load_testsP, SubLObject return_test_runsP, SubLObject testing_direction, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (keyword_list == inference_testing.UNPROVIDED) {
            keyword_list = defined_inference_tests((SubLObject)inference_testing.UNPROVIDED);
        }
        if (progress_blipP == inference_testing.UNPROVIDED) {
            progress_blipP = (SubLObject)inference_testing.T;
        }
        if (verboseP == inference_testing.UNPROVIDED) {
            verboseP = (SubLObject)inference_testing.NIL;
        }
        if (load_testsP == inference_testing.UNPROVIDED) {
            load_testsP = (SubLObject)inference_testing.NIL;
        }
        if (return_test_runsP == inference_testing.UNPROVIDED) {
            return_test_runsP = (SubLObject)inference_testing.NIL;
        }
        if (testing_direction == inference_testing.UNPROVIDED) {
            testing_direction = (SubLObject)inference_testing.$kw3$BACKWARD;
        }
        if (backchain == inference_testing.UNPROVIDED) {
            backchain = (SubLObject)inference_testing.T;
        }
        if (number == inference_testing.UNPROVIDED) {
            number = (SubLObject)inference_testing.ONE_INTEGER;
        }
        if (time == inference_testing.UNPROVIDED) {
            time = (SubLObject)inference_testing.TEN_INTEGER;
        }
        if (depth == inference_testing.UNPROVIDED) {
            depth = (SubLObject)inference_testing.TWENTY_INTEGER;
        }
        if (keyword_list.isCons()) {
            SubLObject test_runs = (SubLObject)inference_testing.NIL;
            SubLObject cdolist_list_var = keyword_list;
            SubLObject keyword = (SubLObject)inference_testing.NIL;
            keyword = cdolist_list_var.first();
            while (inference_testing.NIL != cdolist_list_var) {
                final SubLObject test_run = run_test(keyword, progress_blipP, verboseP, testing_direction, backchain, number, time, depth);
                test_runs = (SubLObject)ConsesLow.cons(test_run, test_runs);
                cdolist_list_var = cdolist_list_var.rest();
                keyword = cdolist_list_var.first();
            }
            print_test_results((SubLObject)inference_testing.UNPROVIDED);
            final SubLObject overall_result = cyc_testing.cyc_test_runs_overall_result(test_runs);
            return Values.values(overall_result, (SubLObject)((inference_testing.NIL != return_test_runsP) ? test_runs : inference_testing.NIL));
        }
        if (inference_testing.NIL == load_testsP) {
            return (SubLObject)inference_testing.NIL;
        }
        final SubLObject try2 = defined_inference_tests((SubLObject)inference_testing.T);
        if (inference_testing.NIL != try2) {
            return do_tests(try2, progress_blipP, verboseP, (SubLObject)inference_testing.NIL, testing_direction, backchain, number, time, depth, (SubLObject)inference_testing.UNPROVIDED);
        }
        PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str85$__The__s_argument_is__s__which_is, (SubLObject)inference_testing.$sym86$KEYWORD_LIST, keyword_list);
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 25376L)
    public static SubLObject sorted_test_results(SubLObject results) {
        if (results == inference_testing.UNPROVIDED) {
            results = inference_testing.$test_results$.getDynamicValue();
        }
        results = Sort.sort(conses_high.copy_list(results), Symbols.symbol_function((SubLObject)inference_testing.$sym87$TERM__), Symbols.symbol_function((SubLObject)inference_testing.$sym69$CAR));
        results = Sort.stable_sort(results, Symbols.symbol_function((SubLObject)inference_testing.$sym87$TERM__), Symbols.symbol_function((SubLObject)inference_testing.$sym88$CDR));
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 25690L)
    public static SubLObject print_test_results(SubLObject output_format) {
        if (output_format == inference_testing.UNPROVIDED) {
            output_format = cyc_testing.$it_output_format$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.$kw46$SILENT != output_format) {
            final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
            try {
                print_high.$print_pretty$.bind((SubLObject)inference_testing.NIL, thread);
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str89$__);
                SubLObject separator = (SubLObject)inference_testing.NIL;
                final SubLObject pcase_var = output_format;
                if (pcase_var.eql((SubLObject)inference_testing.$kw72$STANDARD)) {
                    separator = (SubLObject)inference_testing.$str90$__;
                }
                else if (pcase_var.eql((SubLObject)inference_testing.$kw74$POST_BUILD)) {
                    separator = (SubLObject)inference_testing.$str91$_IT;
                }
                else {
                    Errors.error((SubLObject)inference_testing.$str92$Unknown_output_format__A, output_format);
                }
                SubLObject cdolist_list_var = sorted_test_results((SubLObject)inference_testing.UNPROVIDED);
                SubLObject x = (SubLObject)inference_testing.NIL;
                x = cdolist_list_var.first();
                while (inference_testing.NIL != cdolist_list_var) {
                    if (output_format == inference_testing.$kw74$POST_BUILD) {
                        cyc_testing.print_post_build_test_summary((SubLObject)inference_testing.T, x.rest(), separator, x.first(), (SubLObject)inference_testing.NIL, inference_test_owner(conses_high.caar(x)));
                    }
                    else {
                        PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str93$___s__a__s, new SubLObject[] { x.rest(), separator, x.first() });
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    x = cdolist_list_var.first();
                }
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str89$__);
            }
            finally {
                print_high.$print_pretty$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 26335L)
    public static SubLObject print_failing_tests() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)inference_testing.NIL, thread);
            PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str89$__);
            SubLObject cdolist_list_var = sorted_test_results((SubLObject)inference_testing.UNPROVIDED);
            SubLObject x = (SubLObject)inference_testing.NIL;
            x = cdolist_list_var.first();
            while (inference_testing.NIL != cdolist_list_var) {
                if (x.rest().equal((SubLObject)inference_testing.$kw11$FAILURE)) {
                    PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str94$___s_____s, x.rest(), x.first());
                }
                cdolist_list_var = cdolist_list_var.rest();
                x = cdolist_list_var.first();
            }
            PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str89$__);
        }
        finally {
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 26572L)
    public static SubLObject parameterized_test_value(final SubLObject assoc_list, SubLObject parameter, SubLObject function_symbol, SubLObject fn_arg_list) {
        if (parameter == inference_testing.UNPROVIDED) {
            parameter = (SubLObject)inference_testing.NIL;
        }
        if (function_symbol == inference_testing.UNPROVIDED) {
            function_symbol = (SubLObject)inference_testing.NIL;
        }
        if (fn_arg_list == inference_testing.UNPROVIDED) {
            fn_arg_list = (SubLObject)inference_testing.NIL;
        }
        if (inference_testing.NIL != parameter) {
            if (inference_testing.NIL != Symbols.boundp(parameter)) {
                return conses_high.assoc(Symbols.symbol_value(parameter), conses_high.assoc(parameter, assoc_list, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED).rest(), (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED).rest();
            }
            return (SubLObject)inference_testing.NIL;
        }
        else {
            if (inference_testing.NIL == function_symbol) {
                return (SubLObject)inference_testing.NIL;
            }
            if (inference_testing.NIL != Symbols.fboundp(function_symbol)) {
                return conses_high.assoc(Functions.apply(function_symbol, fn_arg_list), conses_high.assoc(function_symbol, assoc_list, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED).rest(), (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED).rest();
            }
            return (SubLObject)inference_testing.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 27892L)
    public static SubLObject print_failing_form(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = (SubLObject)inference_testing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_testing.$list95);
        form = current.first();
        current = current.rest();
        final SubLObject keyword = (SubLObject)(current.isCons() ? current.first() : inference_testing.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)inference_testing.$list95);
        current = current.rest();
        final SubLObject keyword_test = (SubLObject)(current.isCons() ? current.first() : inference_testing.$list96);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)inference_testing.$list95);
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : inference_testing.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)inference_testing.$list95);
        current = current.rest();
        final SubLObject message_list = (SubLObject)(current.isCons() ? current.first() : inference_testing.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)inference_testing.$list95);
        current = current.rest();
        if (inference_testing.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym97$PIF, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym98$CAND, (SubLObject)inference_testing.$sym99$_EVALUATE_PREVIOUSLY_FAILING_TESTS_, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym100$COR, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym101$NULL, keyword), (SubLObject)inference_testing.$sym102$_CHECK_ALL_IT_BUG_TYPES_, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym103$MEMBER, keyword, (SubLObject)inference_testing.$sym104$_KNOWN_BUG_TYPES_TO_CHECK_, keyword_test))), (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym105$PROGN, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym97$PIF, (SubLObject)inference_testing.$sym106$_IT_FAILING_VERBOSE_, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym107$CLET, (SubLObject)inference_testing.$list108, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym109$FORMAT, (SubLObject)inference_testing.T, (SubLObject)inference_testing.$str110$__The_previously_failing_test____, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym111$QUOTE, form), keyword), form, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym112$PWHEN, message, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym113$APPLY, (SubLObject)inference_testing.$list114, (SubLObject)inference_testing.T, message, message_list))), form)), (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym112$PWHEN, (SubLObject)inference_testing.$sym106$_IT_FAILING_VERBOSE_, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym97$PIF, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym115$CNOT, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym101$NULL, keyword)), (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym109$FORMAT, (SubLObject)inference_testing.T, (SubLObject)inference_testing.$str116$__This_previously_failing_test___, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym111$QUOTE, form), keyword), (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym109$FORMAT, (SubLObject)inference_testing.T, (SubLObject)inference_testing.$str117$__This_previously_failing_test___, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym111$QUOTE, form)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_testing.$list95);
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 29624L)
    public static SubLObject failing_it_form_identifier(final SubLObject bug_type, SubLObject other_identifiers) {
        if (other_identifiers == inference_testing.UNPROVIDED) {
            other_identifiers = (SubLObject)inference_testing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ConsesLow.nconc((SubLObject)ConsesLow.list(inference_testing.$current_test$.getDynamicValue(thread), bug_type), other_identifiers);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 29860L)
    public static SubLObject herald_start() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.NIL != inference_testing.$it_verbose$.getDynamicValue(thread)) {
            PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str118$__Starting__a____, inference_testing.$current_test$.getDynamicValue(thread));
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 29973L)
    public static SubLObject def_inference_test(final SubLObject test_keyword, final SubLObject quoted_test_body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.NIL != subl_promotions.memberP(test_keyword, inference_testing.$inference_tests$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)inference_testing.EQUAL), Symbols.symbol_function((SubLObject)inference_testing.$sym69$CAR))) {
            inference_testing.$inference_tests$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(test_keyword, quoted_test_body), Sequences.remove(test_keyword, inference_testing.$inference_tests$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)inference_testing.EQUAL), Symbols.symbol_function((SubLObject)inference_testing.$sym69$CAR), (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED)), thread);
        }
        else {
            inference_testing.$inference_tests$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(test_keyword, quoted_test_body), inference_testing.$inference_tests$.getDynamicValue(thread)), thread);
        }
        return test_keyword;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 30503L)
    public static SubLObject inference_test_p(final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.NIL != conses_high.assoc(keyword, inference_testing.$inference_tests$.getDynamicValue(thread), (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED)) {
            return (SubLObject)inference_testing.T;
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 30614L)
    public static SubLObject inference_test_form(final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.second(conses_high.assoc(keyword, inference_testing.$inference_tests$.getDynamicValue(thread), (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 30715L)
    public static SubLObject inference_test_mentions_invalid_constantP(final SubLObject it) {
        return list_utilities.tree_find_if((SubLObject)inference_testing.$sym121$INVALID_CONSTANT_, inference_test_form(it), (SubLObject)inference_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 30849L)
    public static SubLObject inference_test_invalid_constants(final SubLObject it) {
        return cycl_utilities.expression_gather(inference_test_form(it), (SubLObject)inference_testing.$sym121$INVALID_CONSTANT_, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 30979L)
    public static SubLObject inference_test_names() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)inference_testing.$sym122$FIRST), inference_testing.$inference_tests$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 31066L)
    public static SubLObject obj_Gstring(final SubLObject obj) {
        if (obj.isString()) {
            return obj;
        }
        return PrintLow.format((SubLObject)inference_testing.NIL, (SubLObject)inference_testing.$str123$_s, obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 31168L)
    public static SubLObject defined_inference_tests(SubLObject forceP) {
        if (forceP == inference_testing.UNPROVIDED) {
            forceP = (SubLObject)inference_testing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.NIL != forceP) {
            final SubLObject pathname = construct_cyc_test_filename((SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED);
            if (pathname.isString() && inference_testing.NIL != Filesys.probe_file(pathname)) {
                Eval.load(pathname);
            }
            else {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str124$_s_is_not_an_accessible_pathname_, pathname);
            }
        }
        final SubLObject keywords = Mapping.mapcar(Symbols.symbol_function((SubLObject)inference_testing.$sym69$CAR), inference_testing.$inference_tests$.getDynamicValue(thread));
        if (inference_testing.NIL != keywords) {
            return Sort.sort(conses_high.copy_list(keywords), Symbols.symbol_function((SubLObject)inference_testing.$sym125$STRING_), Symbols.symbol_function((SubLObject)inference_testing.$sym126$OBJ__STRING));
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 31584L)
    public static SubLObject load_inference_tests(SubLObject pathname_string) {
        if (pathname_string == inference_testing.UNPROVIDED) {
            pathname_string = (SubLObject)inference_testing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pathname = pathname_string.isString() ? pathname_string : construct_cyc_test_filename((SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED);
        if (pathname.isString() && inference_testing.NIL != Filesys.probe_file(pathname)) {
            thread.resetMultipleValues();
            final SubLObject success = file_utilities.load_file_catching_error(pathname);
            final SubLObject error = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (inference_testing.NIL != error) {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str127$___ERROR__LOADING__A__S, pathname_string, error);
            }
            return success;
        }
        PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str128$___s_is_bound_to__s__which_is_not, (SubLObject)inference_testing.$sym129$PATHNAME, pathname);
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 32131L)
    public static SubLObject clear_inference_tests() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_testing.$inference_tests$.setDynamicValue((SubLObject)inference_testing.NIL, thread);
        return inference_testing.$inference_tests$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 32228L)
    public static SubLObject clear_inference_test_results() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_testing.$test_results$.setDynamicValue((SubLObject)inference_testing.NIL, thread);
        return inference_testing.$test_results$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 32322L)
    public static SubLObject do_all_tests(SubLObject progress_blipP, SubLObject verboseP, SubLObject output_format, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject load_testsP, SubLObject return_test_runsP) {
        if (progress_blipP == inference_testing.UNPROVIDED) {
            progress_blipP = (SubLObject)inference_testing.NIL;
        }
        if (verboseP == inference_testing.UNPROVIDED) {
            verboseP = (SubLObject)inference_testing.NIL;
        }
        if (output_format == inference_testing.UNPROVIDED) {
            output_format = cyc_testing.$it_output_format$.getDynamicValue();
        }
        if (run_tiny_kb_tests_in_full_kbP == inference_testing.UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (load_testsP == inference_testing.UNPROVIDED) {
            load_testsP = (SubLObject)inference_testing.T;
        }
        if (return_test_runsP == inference_testing.UNPROVIDED) {
            return_test_runsP = (SubLObject)inference_testing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_runs = (SubLObject)inference_testing.NIL;
        final SubLObject _prev_bind_0 = cyc_testing.$it_output_format$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
        try {
            cyc_testing.$it_output_format$.bind(output_format, thread);
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
            clear_inference_test_results();
            thread.resetMultipleValues();
            final SubLObject backward_overall_result = do_tests_backward(progress_blipP, verboseP, load_testsP, (SubLObject)inference_testing.T);
            final SubLObject backward_test_runs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = ConsesLow.nconc(test_runs, backward_test_runs);
            clear_inference_test_results();
            thread.resetMultipleValues();
            final SubLObject forward_overall_result = do_tests_forward(progress_blipP, verboseP, load_testsP, (SubLObject)inference_testing.T);
            final SubLObject forward_test_runs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = ConsesLow.nconc(test_runs, forward_test_runs);
        }
        finally {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_2, thread);
            cyc_testing.$it_output_format$.rebind(_prev_bind_0, thread);
        }
        final SubLObject overall_result = cyc_testing.cyc_test_runs_overall_result(test_runs);
        return Values.values(overall_result, (SubLObject)((inference_testing.NIL != return_test_runsP) ? test_runs : inference_testing.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 33648L)
    public static SubLObject do_tests_backward(SubLObject progress_blipP, SubLObject verboseP, SubLObject load_testsP, SubLObject return_test_runsP) {
        if (progress_blipP == inference_testing.UNPROVIDED) {
            progress_blipP = (SubLObject)inference_testing.NIL;
        }
        if (verboseP == inference_testing.UNPROVIDED) {
            verboseP = (SubLObject)inference_testing.NIL;
        }
        if (load_testsP == inference_testing.UNPROVIDED) {
            load_testsP = (SubLObject)inference_testing.NIL;
        }
        if (return_test_runsP == inference_testing.UNPROVIDED) {
            return_test_runsP = (SubLObject)inference_testing.NIL;
        }
        return do_tests(defined_inference_tests((SubLObject)inference_testing.UNPROVIDED), progress_blipP, verboseP, load_testsP, return_test_runsP, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 34163L)
    public static SubLObject do_tests_forward(SubLObject progress_blipP, SubLObject verboseP, SubLObject load_testsP, SubLObject return_test_runsP) {
        if (progress_blipP == inference_testing.UNPROVIDED) {
            progress_blipP = (SubLObject)inference_testing.NIL;
        }
        if (verboseP == inference_testing.UNPROVIDED) {
            verboseP = (SubLObject)inference_testing.NIL;
        }
        if (load_testsP == inference_testing.UNPROVIDED) {
            load_testsP = (SubLObject)inference_testing.NIL;
        }
        if (return_test_runsP == inference_testing.UNPROVIDED) {
            return_test_runsP = (SubLObject)inference_testing.NIL;
        }
        return do_tests(defined_inference_tests((SubLObject)inference_testing.UNPROVIDED), progress_blipP, verboseP, load_testsP, return_test_runsP, (SubLObject)inference_testing.$kw45$FORWARD, (SubLObject)inference_testing.NIL, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 34765L)
    public static SubLObject with_test_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject specialP = (SubLObject)inference_testing.NIL;
        SubLObject var_specs = (SubLObject)inference_testing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_testing.$list130);
        specialP = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_testing.$list130);
        var_specs = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject vars = list_utilities.flatten(Mapping.mapcar(Symbols.symbol_function((SubLObject)inference_testing.$sym131$VAR_SPEC_VAR), var_specs));
        final SubLObject test_constants = (SubLObject)inference_testing.$sym132$TEST_CONSTANTS;
        return (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym107$CLET, reader.bq_cons(test_constants, ConsesLow.append(vars, (SubLObject)inference_testing.NIL)), (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym133$CUNWIND_PROTECT, reader.bq_cons((SubLObject)inference_testing.$sym105$PROGN, ConsesLow.append(Mapping.mapcan(Symbols.symbol_function((SubLObject)inference_testing.$sym134$PRINT_CREATE_VAR_SPEC_CONSTANT), var_specs, inference_testing.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym135$CSETQ, test_constants, reader.bq_cons((SubLObject)inference_testing.$sym136$LIST, ConsesLow.append(vars, (SubLObject)inference_testing.NIL))), (SubLObject)ConsesLow.listS((SubLObject)inference_testing.$sym137$PRINT_ASSERT, reader.bq_cons((SubLObject)inference_testing.$sym136$LIST, ConsesLow.append(Mapping.mapcan(Symbols.symbol_function((SubLObject)inference_testing.$sym138$VAR_SPEC_DEF), var_specs, inference_testing.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)inference_testing.NIL)), (SubLObject)inference_testing.$list139), ConsesLow.append(body, (SubLObject)inference_testing.NIL)))), (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym105$PROGN, (SubLObject)inference_testing.$list140, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym112$PWHEN, (SubLObject)inference_testing.$sym141$_CLEAN_UP_TEST_CONSTANTS__, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym142$PRINT_KILL, test_constants)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 35619L)
    public static SubLObject with_test_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject specialP = (SubLObject)inference_testing.NIL;
        SubLObject mt = (SubLObject)inference_testing.NIL;
        SubLObject truth_value = (SubLObject)inference_testing.NIL;
        SubLObject direction = (SubLObject)inference_testing.NIL;
        SubLObject var_specs = (SubLObject)inference_testing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_testing.$list143);
        specialP = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_testing.$list143);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_testing.$list143);
        truth_value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_testing.$list143);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_testing.$list143);
        var_specs = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject vars = Mapping.mapcar(Symbols.symbol_function((SubLObject)inference_testing.$sym131$VAR_SPEC_VAR), var_specs);
        final SubLObject test_assertions = (SubLObject)inference_testing.$sym144$TEST_ASSERTIONS;
        return (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym107$CLET, ConsesLow.append(var_specs, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(test_assertions, reader.bq_cons((SubLObject)inference_testing.$sym136$LIST, ConsesLow.append(vars, (SubLObject)inference_testing.NIL))))), (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym133$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)inference_testing.$sym105$PROGN, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym137$PRINT_ASSERT, test_assertions, mt, truth_value, direction), ConsesLow.append(body, (SubLObject)inference_testing.NIL)), (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym145$PRINT_UNASSERT, test_assertions, mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 36213L)
    public static SubLObject with_test_assertion_lists(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject specialP = (SubLObject)inference_testing.NIL;
        SubLObject mt = (SubLObject)inference_testing.NIL;
        SubLObject truth_value = (SubLObject)inference_testing.NIL;
        SubLObject direction = (SubLObject)inference_testing.NIL;
        SubLObject var_specs = (SubLObject)inference_testing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_testing.$list143);
        specialP = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_testing.$list143);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_testing.$list143);
        truth_value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_testing.$list143);
        direction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_testing.$list143);
        var_specs = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject vars = Mapping.mapcar(Symbols.symbol_function((SubLObject)inference_testing.$sym131$VAR_SPEC_VAR), var_specs);
        final SubLObject test_assertions = (SubLObject)inference_testing.$sym146$TEST_ASSERTIONS;
        return (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym107$CLET, ConsesLow.append(var_specs, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(test_assertions, reader.bq_cons((SubLObject)inference_testing.$sym147$APPEND, ConsesLow.append(vars, (SubLObject)inference_testing.NIL))))), (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym133$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)inference_testing.$sym105$PROGN, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym137$PRINT_ASSERT, test_assertions, mt, truth_value, direction), ConsesLow.append(body, (SubLObject)inference_testing.NIL)), (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym145$PRINT_UNASSERT, test_assertions, mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 36824L)
    public static SubLObject define_subtest(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)inference_testing.NIL;
        SubLObject vars = (SubLObject)inference_testing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_testing.$list148);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_testing.$list148);
        vars = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject arglist = (SubLObject)inference_testing.$sym149$ARGLIST;
        return (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym150$DEFMACRO, name, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym151$_REST, arglist), (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym152$RET, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym153$BQ_LIST, (SubLObject)inference_testing.$list154, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym111$QUOTE, vars), (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym155$BQ_CONS, (SubLObject)inference_testing.$list156, (SubLObject)ConsesLow.listS((SubLObject)inference_testing.$sym157$BQ_APPEND, arglist, (SubLObject)inference_testing.$list158)), (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym153$BQ_LIST, (SubLObject)inference_testing.$list159, (SubLObject)inference_testing.$list160, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym153$BQ_LIST, (SubLObject)inference_testing.$list161, (SubLObject)inference_testing.T, (SubLObject)inference_testing.$str162$___________A__S, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym111$QUOTE, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym111$QUOTE, name)), (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym155$BQ_CONS, (SubLObject)inference_testing.$list156, (SubLObject)ConsesLow.listS((SubLObject)inference_testing.$sym157$BQ_APPEND, arglist, (SubLObject)inference_testing.$list158)))), (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym155$BQ_CONS, (SubLObject)inference_testing.$list163, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym111$QUOTE, body)), (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym153$BQ_LIST, (SubLObject)inference_testing.$list159, (SubLObject)inference_testing.$list160, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym153$BQ_LIST, (SubLObject)inference_testing.$list161, (SubLObject)inference_testing.T, (SubLObject)inference_testing.$str164$___________A__S, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym111$QUOTE, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym111$QUOTE, name)), (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym155$BQ_CONS, (SubLObject)inference_testing.$list156, (SubLObject)ConsesLow.listS((SubLObject)inference_testing.$sym157$BQ_APPEND, arglist, (SubLObject)inference_testing.$list158)))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 37691L)
    public static SubLObject assert_query_test(final SubLObject assertion_formulas, final SubLObject queries, SubLObject test_fun, SubLObject specialP, SubLObject mt, SubLObject truth_value, SubLObject direction) {
        if (test_fun == inference_testing.UNPROVIDED) {
            test_fun = Symbols.symbol_function((SubLObject)inference_testing.$sym165$B_VERIFY);
        }
        if (specialP == inference_testing.UNPROVIDED) {
            specialP = (SubLObject)inference_testing.T;
        }
        if (mt == inference_testing.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (truth_value == inference_testing.UNPROVIDED) {
            truth_value = (SubLObject)inference_testing.$kw38$DEFAULT;
        }
        if (direction == inference_testing.UNPROVIDED) {
            direction = inference_testing.$test_direction$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_assertions = ConsesLow.append(new SubLObject[] { assertion_formulas });
        try {
            print_assert(test_assertions, mt, truth_value, direction);
            SubLObject cdolist_list_var = queries;
            SubLObject query = (SubLObject)inference_testing.NIL;
            query = cdolist_list_var.first();
            while (inference_testing.NIL != cdolist_list_var) {
                Functions.funcall(test_fun, query, mt, inference_testing.$it_backchain$.getDynamicValue(thread), inference_testing.$it_number$.getDynamicValue(thread), inference_testing.$it_time$.getDynamicValue(thread), inference_testing.$it_depth$.getDynamicValue(thread));
                cdolist_list_var = cdolist_list_var.rest();
                query = cdolist_list_var.first();
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inference_testing.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                print_unassert(test_assertions, mt);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 38157L)
    public static SubLObject define_inference_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject test_name = (SubLObject)inference_testing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_testing.$list166);
        test_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_testing.$list166);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)inference_testing.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_testing.NIL;
        SubLObject current_$7 = (SubLObject)inference_testing.NIL;
        while (inference_testing.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_testing.$list166);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_testing.$list166);
            if (inference_testing.NIL == conses_high.member(current_$7, (SubLObject)inference_testing.$list167, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED)) {
                bad = (SubLObject)inference_testing.T;
            }
            if (current_$7 == inference_testing.$kw168$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_testing.NIL != bad && inference_testing.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_testing.$list166);
        }
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)inference_testing.$kw40$DIRECTION, current);
        final SubLObject direction = (SubLObject)((inference_testing.NIL != direction_tail) ? conses_high.cadr(direction_tail) : inference_testing.$kw3$BACKWARD);
        final SubLObject kb_tail = cdestructuring_bind.property_list_member((SubLObject)inference_testing.$kw169$KB, current);
        final SubLObject kb = (SubLObject)((inference_testing.NIL != kb_tail) ? conses_high.cadr(kb_tail) : inference_testing.NIL);
        final SubLObject owner_tail = cdestructuring_bind.property_list_member((SubLObject)inference_testing.$kw170$OWNER, current);
        final SubLObject owner = (SubLObject)((inference_testing.NIL != owner_tail) ? conses_high.cadr(owner_tail) : inference_testing.NIL);
        final SubLObject comment_tail = cdestructuring_bind.property_list_member((SubLObject)inference_testing.$kw171$COMMENT, current);
        final SubLObject comment = (SubLObject)((inference_testing.NIL != comment_tail) ? conses_high.cadr(comment_tail) : inference_testing.NIL);
        final SubLObject bug_tail = cdestructuring_bind.property_list_member((SubLObject)inference_testing.$kw172$BUG, current);
        final SubLObject bug = (SubLObject)((inference_testing.NIL != bug_tail) ? conses_high.cadr(bug_tail) : inference_testing.NIL);
        final SubLObject created_tail = cdestructuring_bind.property_list_member((SubLObject)inference_testing.$kw173$CREATED, current);
        final SubLObject created = (SubLObject)((inference_testing.NIL != created_tail) ? conses_high.cadr(created_tail) : inference_testing.NIL);
        final SubLObject creator_tail = cdestructuring_bind.property_list_member((SubLObject)inference_testing.$kw174$CREATOR, current);
        final SubLObject creator = (SubLObject)((inference_testing.NIL != creator_tail) ? conses_high.cadr(creator_tail) : inference_testing.NIL);
        final SubLObject workingP_tail = cdestructuring_bind.property_list_member((SubLObject)inference_testing.$kw175$WORKING_, current);
        final SubLObject workingP = (SubLObject)((inference_testing.NIL != workingP_tail) ? conses_high.cadr(workingP_tail) : inference_testing.T);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym105$PROGN, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym119$DEF_INFERENCE_TEST, test_name, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym111$QUOTE, (SubLObject)ConsesLow.listS((SubLObject)inference_testing.$list176, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym177$PCOND, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym115$CNOT, (SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym178$RUN_INFERENCE_TEST_, test_name)), (SubLObject)inference_testing.$list179), reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)inference_testing.$sym180$INFERENCE_TEST_MENTIONS_INVALID_CONSTANT_, test_name), (SubLObject)inference_testing.$list181), reader.bq_cons((SubLObject)inference_testing.T, ConsesLow.append(body, (SubLObject)inference_testing.NIL))), (SubLObject)inference_testing.$list182))), (SubLObject)ConsesLow.list(new SubLObject[] { inference_testing.$sym183$NEW_INFERENCE_TEST, test_name, direction, kb, owner, comment, bug, created, creator, workingP }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 39587L)
    public static SubLObject run_inference_testP(final SubLObject test_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject direction = inference_test_direction(test_name);
        if (inference_testing.$kw184$BOTH != direction && !direction.eql(inference_testing.$test_direction$.getDynamicValue(thread))) {
            return (SubLObject)inference_testing.NIL;
        }
        final SubLObject test_kb = inference_test_kb(test_name);
        if (inference_testing.NIL == kb_matches_expectationsP(test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread))) {
            return (SubLObject)inference_testing.NIL;
        }
        return (SubLObject)inference_testing.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 40260L)
    public static SubLObject kb_matches_expectationsP(final SubLObject expected_kb, final SubLObject expected_tiny_implies_bothP) {
        final SubLObject non_tiny_kbP = control_vars.non_tiny_kb_loadedP();
        final SubLObject tiny_kbP = (SubLObject)SubLObjectFactory.makeBoolean(inference_testing.NIL == non_tiny_kbP);
        if (inference_testing.NIL != tiny_kbP && inference_testing.$kw185$FULL == expected_kb) {
            return (SubLObject)inference_testing.NIL;
        }
        if (inference_testing.NIL != non_tiny_kbP && inference_testing.$kw186$TINY == expected_kb && inference_testing.NIL == expected_tiny_implies_bothP) {
            return (SubLObject)inference_testing.NIL;
        }
        return (SubLObject)inference_testing.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 40770L)
    public static SubLObject new_inference_test(final SubLObject test_name, final SubLObject direction, final SubLObject kb, final SubLObject owner, final SubLObject comment, final SubLObject bug, final SubLObject creation_date, final SubLObject creator, final SubLObject workingP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inference_testing.NIL != Types.keywordp(test_name) : test_name;
        note_inference_test_direction(test_name, direction);
        note_inference_test_kb(test_name, kb);
        note_inference_test_owner(test_name, owner);
        note_inference_test_comment(test_name, comment);
        note_inference_test_bug_number(test_name, bug);
        note_inference_test_creation_date(test_name, creation_date);
        note_inference_test_creator(test_name, creator);
        note_inference_test_working(test_name, workingP);
        cyc_testing.new_cyc_test(cyc_testing.$cyc_test_filename$.getDynamicValue(thread), test_name);
        return test_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 41481L)
    public static SubLObject inference_test_comment_p(final SubLObject v_object) {
        return Types.stringp(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 41560L)
    public static SubLObject inference_test_direction_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, (SubLObject)inference_testing.$list188, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 41669L)
    public static SubLObject inference_test_owner_p(final SubLObject v_object) {
        return Types.stringp(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 41746L)
    public static SubLObject note_inference_test_direction(final SubLObject test_name, SubLObject direction) {
        if (inference_testing.NIL == direction) {
            direction = (SubLObject)inference_testing.$kw184$BOTH;
        }
        assert inference_testing.NIL != inference_test_direction_p(direction) : direction;
        Symbols.put(test_name, (SubLObject)inference_testing.$kw40$DIRECTION, direction);
        return direction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 41980L)
    public static SubLObject inference_test_direction(final SubLObject test_name) {
        return Symbols.get(test_name, (SubLObject)inference_testing.$kw40$DIRECTION, (SubLObject)inference_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 42072L)
    public static SubLObject note_inference_test_kb(final SubLObject test_name, final SubLObject kb) {
        assert inference_testing.NIL != cyc_testing.cyc_test_kb_p(kb) : kb;
        if (inference_testing.NIL != kb) {
            Symbols.put(test_name, (SubLObject)inference_testing.$kw169$KB, kb);
        }
        return kb;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 42211L)
    public static SubLObject inference_test_kb(final SubLObject test_name) {
        return Symbols.get(test_name, (SubLObject)inference_testing.$kw169$KB, (SubLObject)inference_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 42289L)
    public static SubLObject note_inference_test_owner(final SubLObject test_name, final SubLObject owner) {
        assert inference_testing.NIL != inference_test_owner_p(owner) : owner;
        if (inference_testing.NIL != owner) {
            Symbols.put(test_name, (SubLObject)inference_testing.$kw170$OWNER, owner);
        }
        return owner;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 42458L)
    public static SubLObject inference_test_owner(final SubLObject test_name) {
        return Symbols.get(test_name, (SubLObject)inference_testing.$kw170$OWNER, (SubLObject)inference_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 42542L)
    public static SubLObject note_inference_test_comment(final SubLObject test_name, final SubLObject comment) {
        if (inference_testing.NIL != comment && !inference_testing.assertionsDisabledInClass && inference_testing.NIL == Types.stringp(comment)) {
            throw new AssertionError(comment);
        }
        if (inference_testing.NIL != comment) {
            Symbols.put(test_name, (SubLObject)inference_testing.$kw171$COMMENT, comment);
        }
        return comment;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 42721L)
    public static SubLObject inference_test_comment(final SubLObject test_name) {
        return Symbols.get(test_name, (SubLObject)inference_testing.$kw171$COMMENT, (SubLObject)inference_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 42809L)
    public static SubLObject note_inference_test_bug_number(final SubLObject test_name, final SubLObject bug_number) {
        if (inference_testing.NIL != bug_number && !inference_testing.assertionsDisabledInClass && inference_testing.NIL == subl_promotions.positive_integer_p(bug_number)) {
            throw new AssertionError(bug_number);
        }
        if (inference_testing.NIL != bug_number) {
            Symbols.put(test_name, (SubLObject)inference_testing.$kw194$BUG_NUMBER, bug_number);
        }
        return bug_number;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 43020L)
    public static SubLObject inference_test_bug_number(final SubLObject test_name) {
        return Symbols.get(test_name, (SubLObject)inference_testing.$kw194$BUG_NUMBER, (SubLObject)inference_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 43114L)
    public static SubLObject note_inference_test_creation_date(final SubLObject test_name, final SubLObject creation_date) {
        if (inference_testing.NIL != creation_date && !inference_testing.assertionsDisabledInClass && inference_testing.NIL == numeric_date_utilities.universal_date_p(creation_date)) {
            throw new AssertionError(creation_date);
        }
        if (inference_testing.NIL != creation_date) {
            Symbols.put(test_name, (SubLObject)inference_testing.$kw196$CREATION_DATE, creation_date);
        }
        return creation_date;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 43344L)
    public static SubLObject inference_test_creation_date(final SubLObject test_name) {
        return Symbols.get(test_name, (SubLObject)inference_testing.$kw196$CREATION_DATE, (SubLObject)inference_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 43444L)
    public static SubLObject note_inference_test_creator(final SubLObject test_name, final SubLObject creator) {
        if (inference_testing.NIL != creator && !inference_testing.assertionsDisabledInClass && inference_testing.NIL == Types.stringp(creator)) {
            throw new AssertionError(creator);
        }
        if (inference_testing.NIL != creator) {
            Symbols.put(test_name, (SubLObject)inference_testing.$kw174$CREATOR, creator);
        }
        return creator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 43623L)
    public static SubLObject inference_test_creator(final SubLObject test_name) {
        return Symbols.get(test_name, (SubLObject)inference_testing.$kw174$CREATOR, (SubLObject)inference_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 43711L)
    public static SubLObject note_inference_test_working(final SubLObject test_name, final SubLObject workingP) {
        assert inference_testing.NIL != Types.booleanp(workingP) : workingP;
        Symbols.put(test_name, (SubLObject)inference_testing.$kw175$WORKING_, workingP);
        return workingP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 43865L)
    public static SubLObject inference_test_workingP(final SubLObject test_name) {
        return Symbols.get(test_name, (SubLObject)inference_testing.$kw175$WORKING_, (SubLObject)inference_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 43955L)
    public static SubLObject working_inference_tests() {
        return list_utilities.remove_if_not((SubLObject)inference_testing.$sym198$INFERENCE_TEST_WORKING_, inference_test_names(), (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 44074L)
    public static SubLObject non_working_inference_tests() {
        return Sequences.remove_if((SubLObject)inference_testing.$sym198$INFERENCE_TEST_WORKING_, inference_test_names(), (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 44321L)
    public static SubLObject def_time_inference_test(final SubLObject test_keyword, final SubLObject quoted_test_body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.NIL != subl_promotions.memberP(test_keyword, inference_testing.$inference_tests$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)inference_testing.EQUAL), Symbols.symbol_function((SubLObject)inference_testing.$sym69$CAR))) {
            inference_testing.$time_inference_tests$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(test_keyword, quoted_test_body), Sequences.remove(test_keyword, inference_testing.$time_inference_tests$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)inference_testing.EQUAL), Symbols.symbol_function((SubLObject)inference_testing.$sym69$CAR), (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED)), thread);
        }
        else {
            inference_testing.$inference_tests$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(test_keyword, quoted_test_body), inference_testing.$inference_tests$.getDynamicValue(thread)), thread);
        }
        return test_keyword;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 44705L)
    public static SubLObject defined_time_inference_tests(SubLObject forceP) {
        if (forceP == inference_testing.UNPROVIDED) {
            forceP = (SubLObject)inference_testing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_testing.NIL != forceP) {
            final SubLObject pathname = construct_cyc_test_filename((SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED);
            if (pathname.isString() && inference_testing.NIL != Filesys.probe_file(pathname)) {
                Eval.load(pathname);
            }
            else {
                PrintLow.format((SubLObject)inference_testing.T, (SubLObject)inference_testing.$str124$_s_is_not_an_accessible_pathname_, pathname);
            }
        }
        final SubLObject keywords = Mapping.mapcar(Symbols.symbol_function((SubLObject)inference_testing.$sym69$CAR), inference_testing.$time_inference_tests$.getDynamicValue(thread));
        if (inference_testing.NIL != keywords) {
            return Sort.sort(conses_high.copy_list(keywords), Symbols.symbol_function((SubLObject)inference_testing.$sym125$STRING_), Symbols.symbol_function((SubLObject)inference_testing.$sym126$OBJ__STRING));
        }
        return (SubLObject)inference_testing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/inference-testing.lisp", position = 45144L)
    public static SubLObject do_time_tests_backward(SubLObject progress_blipP, SubLObject verboseP) {
        if (progress_blipP == inference_testing.UNPROVIDED) {
            progress_blipP = (SubLObject)inference_testing.NIL;
        }
        if (verboseP == inference_testing.UNPROVIDED) {
            verboseP = (SubLObject)inference_testing.NIL;
        }
        do_tests(defined_time_inference_tests((SubLObject)inference_testing.UNPROVIDED), progress_blipP, verboseP, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED, (SubLObject)inference_testing.UNPROVIDED);
        return (SubLObject)inference_testing.NIL;
    }
    
    public static SubLObject declare_inference_testing_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "construct_cyc_test_filename", "CONSTRUCT-CYC-TEST-FILENAME", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "break_on_failureP", "BREAK-ON-FAILURE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "return_list_of_values", "RETURN-LIST-OF-VALUES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "list_assertions", "LIST-ASSERTIONS", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "print_assertions", "PRINT-ASSERTIONS", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "instanceofP", "INSTANCEOF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "legacy_b_verify", "LEGACY-B-VERIFY", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "b_verify", "B-VERIFY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "print_and_eval", "PRINT-AND-EVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "b_test_form", "B-TEST-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "test_error", "TEST-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "test_warning", "TEST-WARNING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "test_no_warning", "TEST-NO-WARNING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "form_verify", "FORM-VERIFY", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "test_verify", "TEST-VERIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "test_verify_new", "TEST-VERIFY-NEW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "test_verify_guts", "TEST-VERIFY-GUTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "m_verify", "M-VERIFY", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "legacy_binding_verify", "LEGACY-BINDING-VERIFY", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "binding_verify", "BINDING-VERIFY", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "legacy_verify_not", "LEGACY-VERIFY-NOT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "verify_not", "VERIFY-NOT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "print_assert", "PRINT-ASSERT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "print_assert_wff", "PRINT-ASSERT-WFF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "print_assert_with_time", "PRINT-ASSERT-WITH-TIME", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "print_unassert", "PRINT-UNASSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "print_blast", "PRINT-BLAST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "print_justify", "PRINT-JUSTIFY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "print_kill", "PRINT-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "print_create", "PRINT-CREATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "print_tms_formula", "PRINT-TMS-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "print_tms_mt", "PRINT-TMS-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "update_test_results", "UPDATE-TEST-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "kill_test_constants_created", "KILL-TEST-CONSTANTS-CREATED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "run_test", "RUN-TEST", 1, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "do_tests", "DO-TESTS", 0, 10, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "sorted_test_results", "SORTED-TEST-RESULTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "print_test_results", "PRINT-TEST-RESULTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "print_failing_tests", "PRINT-FAILING-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "parameterized_test_value", "PARAMETERIZED-TEST-VALUE", 1, 3, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "print_failing_form", "PRINT-FAILING-FORM");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "failing_it_form_identifier", "FAILING-IT-FORM-IDENTIFIER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "herald_start", "HERALD-START", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "def_inference_test", "DEF-INFERENCE-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "inference_test_p", "INFERENCE-TEST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "inference_test_form", "INFERENCE-TEST-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "inference_test_mentions_invalid_constantP", "INFERENCE-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "inference_test_invalid_constants", "INFERENCE-TEST-INVALID-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "inference_test_names", "INFERENCE-TEST-NAMES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "obj_Gstring", "OBJ->STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "defined_inference_tests", "DEFINED-INFERENCE-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "load_inference_tests", "LOAD-INFERENCE-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "clear_inference_tests", "CLEAR-INFERENCE-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "clear_inference_test_results", "CLEAR-INFERENCE-TEST-RESULTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "do_all_tests", "DO-ALL-TESTS", 0, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "do_tests_backward", "DO-TESTS-BACKWARD", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "do_tests_forward", "DO-TESTS-FORWARD", 0, 4, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "with_test_constants", "WITH-TEST-CONSTANTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "with_test_assertions", "WITH-TEST-ASSERTIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "with_test_assertion_lists", "WITH-TEST-ASSERTION-LISTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "define_subtest", "DEFINE-SUBTEST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "assert_query_test", "ASSERT-QUERY-TEST", 2, 5, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "define_inference_test", "DEFINE-INFERENCE-TEST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "run_inference_testP", "RUN-INFERENCE-TEST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "kb_matches_expectationsP", "KB-MATCHES-EXPECTATIONS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "new_inference_test", "NEW-INFERENCE-TEST", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "inference_test_comment_p", "INFERENCE-TEST-COMMENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "inference_test_direction_p", "INFERENCE-TEST-DIRECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "inference_test_owner_p", "INFERENCE-TEST-OWNER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "note_inference_test_direction", "NOTE-INFERENCE-TEST-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "inference_test_direction", "INFERENCE-TEST-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "note_inference_test_kb", "NOTE-INFERENCE-TEST-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "inference_test_kb", "INFERENCE-TEST-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "note_inference_test_owner", "NOTE-INFERENCE-TEST-OWNER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "inference_test_owner", "INFERENCE-TEST-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "note_inference_test_comment", "NOTE-INFERENCE-TEST-COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "inference_test_comment", "INFERENCE-TEST-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "note_inference_test_bug_number", "NOTE-INFERENCE-TEST-BUG-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "inference_test_bug_number", "INFERENCE-TEST-BUG-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "note_inference_test_creation_date", "NOTE-INFERENCE-TEST-CREATION-DATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "inference_test_creation_date", "INFERENCE-TEST-CREATION-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "note_inference_test_creator", "NOTE-INFERENCE-TEST-CREATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "inference_test_creator", "INFERENCE-TEST-CREATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "note_inference_test_working", "NOTE-INFERENCE-TEST-WORKING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "inference_test_workingP", "INFERENCE-TEST-WORKING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "working_inference_tests", "WORKING-INFERENCE-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "non_working_inference_tests", "NON-WORKING-INFERENCE-TESTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "def_time_inference_test", "DEF-TIME-INFERENCE-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "defined_time_inference_tests", "DEFINED-TIME-INFERENCE-TESTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.inference_testing", "do_time_tests_backward", "DO-TIME-TESTS-BACKWARD", 0, 2, false);
        return (SubLObject)inference_testing.NIL;
    }
    
    public static SubLObject init_inference_testing_file() {
        inference_testing.$default_cyc_test_file$ = SubLFiles.defparameter("*DEFAULT-CYC-TEST-FILE*", (SubLObject)inference_testing.$str0$inference_tests);
        inference_testing.$inference_tests$ = SubLFiles.defvar("*INFERENCE-TESTS*", (SubLObject)inference_testing.NIL);
        inference_testing.$test_constants_created$ = SubLFiles.defparameter("*TEST-CONSTANTS-CREATED*", (SubLObject)inference_testing.NIL);
        inference_testing.$current_test$ = SubLFiles.defparameter("*CURRENT-TEST*", (SubLObject)inference_testing.NIL);
        inference_testing.$test_status$ = SubLFiles.defparameter("*TEST-STATUS*", (SubLObject)inference_testing.NIL);
        inference_testing.$test_results$ = SubLFiles.defparameter("*TEST-RESULTS*", (SubLObject)inference_testing.NIL);
        inference_testing.$break_on_failure$ = SubLFiles.defparameter("*BREAK-ON-FAILURE*", (SubLObject)inference_testing.NIL);
        inference_testing.$break_on_failureP$ = SubLFiles.defparameter("*BREAK-ON-FAILURE?*", (SubLObject)inference_testing.NIL);
        inference_testing.$break_before_test_endP$ = SubLFiles.defparameter("*BREAK-BEFORE-TEST-END?*", (SubLObject)inference_testing.NIL);
        inference_testing.$elapsed_time$ = SubLFiles.defparameter("*ELAPSED-TIME*", (SubLObject)inference_testing.NIL);
        inference_testing.$it_failing_verbose$ = SubLFiles.defparameter("*IT-FAILING-VERBOSE*", (SubLObject)inference_testing.T);
        inference_testing.$it_verbose$ = SubLFiles.defparameter("*IT-VERBOSE*", (SubLObject)inference_testing.T);
        inference_testing.$it_backchain$ = SubLFiles.defparameter("*IT-BACKCHAIN*", (SubLObject)inference_testing.NIL);
        inference_testing.$it_number$ = SubLFiles.defparameter("*IT-NUMBER*", (SubLObject)inference_testing.ONE_INTEGER);
        inference_testing.$it_time$ = SubLFiles.defparameter("*IT-TIME*", (SubLObject)inference_testing.TWENTY_INTEGER);
        inference_testing.$it_depth$ = SubLFiles.defparameter("*IT-DEPTH*", (SubLObject)inference_testing.TWENTY_INTEGER);
        inference_testing.$test_direction$ = SubLFiles.defparameter("*TEST-DIRECTION*", (SubLObject)inference_testing.$kw3$BACKWARD);
        inference_testing.$verify_as_continuableP$ = SubLFiles.defparameter("*VERIFY-AS-CONTINUABLE?*", (SubLObject)inference_testing.NIL);
        inference_testing.$index_collection$ = SubLFiles.defparameter("*INDEX-COLLECTION*", (SubLObject)inference_testing.NIL);
        inference_testing.$debug_continue$ = SubLFiles.defparameter("*DEBUG-CONTINUE*", (SubLObject)inference_testing.NIL);
        inference_testing.$it_show_all_failures$ = SubLFiles.defparameter("*IT-SHOW-ALL-FAILURES*", (SubLObject)inference_testing.NIL);
        inference_testing.$evaluate_previously_failing_tests$ = SubLFiles.defparameter("*EVALUATE-PREVIOUSLY-FAILING-TESTS*", (SubLObject)inference_testing.NIL);
        inference_testing.$known_bug_types_to_check$ = SubLFiles.defparameter("*KNOWN-BUG-TYPES-TO-CHECK*", (SubLObject)inference_testing.NIL);
        inference_testing.$check_all_it_bug_types$ = SubLFiles.defparameter("*CHECK-ALL-IT-BUG-TYPES*", (SubLObject)inference_testing.NIL);
        inference_testing.$clean_up_test_constantsP$ = SubLFiles.defparameter("*CLEAN-UP-TEST-CONSTANTS?*", (SubLObject)inference_testing.T);
        inference_testing.$time_inference_tests$ = SubLFiles.defvar("*TIME-INFERENCE-TESTS*", (SubLObject)inference_testing.NIL);
        return (SubLObject)inference_testing.NIL;
    }
    
    public static SubLObject setup_inference_testing_file() {
        access_macros.register_macro_helper((SubLObject)inference_testing.$sym119$DEF_INFERENCE_TEST, (SubLObject)inference_testing.$sym120$DEFINE_INFERENCE_TEST);
        access_macros.register_macro_helper((SubLObject)inference_testing.$sym178$RUN_INFERENCE_TEST_, (SubLObject)inference_testing.$sym120$DEFINE_INFERENCE_TEST);
        access_macros.register_macro_helper((SubLObject)inference_testing.$sym183$NEW_INFERENCE_TEST, (SubLObject)inference_testing.$sym120$DEFINE_INFERENCE_TEST);
        access_macros.define_obsolete_register((SubLObject)inference_testing.$sym199$DEF_TIME_INFERENCE_TEST, (SubLObject)inference_testing.NIL);
        access_macros.define_obsolete_register((SubLObject)inference_testing.$sym200$DEFINED_TIME_INFERENCE_TESTS, (SubLObject)inference_testing.NIL);
        access_macros.define_obsolete_register((SubLObject)inference_testing.$sym201$DO_TIME_TESTS_BACKWARD, (SubLObject)inference_testing.NIL);
        return (SubLObject)inference_testing.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_inference_testing_file();
    }
    
    @Override
	public void initializeVariables() {
        init_inference_testing_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_inference_testing_file();
    }
    
    static {
        me = (SubLFile)new inference_testing();
        inference_testing.$default_cyc_test_file$ = null;
        inference_testing.$inference_tests$ = null;
        inference_testing.$test_constants_created$ = null;
        inference_testing.$current_test$ = null;
        inference_testing.$test_status$ = null;
        inference_testing.$test_results$ = null;
        inference_testing.$break_on_failure$ = null;
        inference_testing.$break_on_failureP$ = null;
        inference_testing.$break_before_test_endP$ = null;
        inference_testing.$elapsed_time$ = null;
        inference_testing.$it_failing_verbose$ = null;
        inference_testing.$it_verbose$ = null;
        inference_testing.$it_backchain$ = null;
        inference_testing.$it_number$ = null;
        inference_testing.$it_time$ = null;
        inference_testing.$it_depth$ = null;
        inference_testing.$test_direction$ = null;
        inference_testing.$verify_as_continuableP$ = null;
        inference_testing.$index_collection$ = null;
        inference_testing.$debug_continue$ = null;
        inference_testing.$it_show_all_failures$ = null;
        inference_testing.$evaluate_previously_failing_tests$ = null;
        inference_testing.$known_bug_types_to_check$ = null;
        inference_testing.$check_all_it_bug_types$ = null;
        inference_testing.$clean_up_test_constantsP$ = null;
        inference_testing.$time_inference_tests$ = null;
        $str0$inference_tests = SubLObjectFactory.makeString("inference-tests");
        $str1$lisp = SubLObjectFactory.makeString("lisp");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tests"));
        $kw3$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $str4$___s = SubLObjectFactory.makeString("~%~s");
        $str5$__No_assertions_found_ = SubLObjectFactory.makeString("~%No assertions found.");
        $kw6$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $kw7$CONTINUABLE_ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $sym8$NEW_CYC_QUERY = SubLObjectFactory.makeSymbol("NEW-CYC-QUERY");
        $str9$_____s = SubLObjectFactory.makeString("~&  ~s");
        $str10$__Success___s________________s = SubLObjectFactory.makeString("~&Success: ~s~%         ==> ~s");
        $kw11$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $str12$__Failure___s________________s = SubLObjectFactory.makeString("~&Failure: ~s~%         ==> ~s");
        $str13$Failure___s________________s = SubLObjectFactory.makeString("Failure: ~s~%         ==> ~s");
        $str14$__Success___s________________s__ = SubLObjectFactory.makeString("~&Success: ~s~%         ==> ~s~%");
        $str15$__Failure___s________________s__ = SubLObjectFactory.makeString("~&Failure: ~s~%         ==> ~s~%");
        $sym16$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str17$_A = SubLObjectFactory.makeString("~A");
        $str18$__Success___A__ = SubLObjectFactory.makeString("~&Success: ~A~%");
        $str19$__Failure___s_______________NO_ER = SubLObjectFactory.makeString("~&Failure: ~s~%         ==> NO ERROR~%");
        $str20$__Failure___A__ = SubLObjectFactory.makeString("~&Failure: ~A~%");
        $str21$__Success___s_______________NO_ER = SubLObjectFactory.makeString("~&Success: ~s~%         ==> NO ERROR~%");
        $str22$__Success___s________________s__C = SubLObjectFactory.makeString("~&Success: ~s~%         ==> ~s~%Compared against: ~s~%Test function: ~s");
        $str23$__Failure___s________________s__C = SubLObjectFactory.makeString("~&Failure: ~s~%         ==> ~s~%Compared against desired value : ~s~%Test function: ~s");
        $str24$Failure___s________________s__Com = SubLObjectFactory.makeString("Failure: ~s~%         ==> ~s~%Compared against desired value: ~s~%Test function: ~s");
        $kw25$EVAL_AGAIN = SubLObjectFactory.makeKeyword("EVAL-AGAIN");
        $kw26$APPLY = SubLObjectFactory.makeKeyword("APPLY");
        $str27$__Success___s________________s__p = SubLObjectFactory.makeString("~&Success: ~s~%         ==> ~s  passes ~s");
        $str28$__Failure___s________________s_fa = SubLObjectFactory.makeString("~&Failure: ~s~%         ==> ~s fails ~s");
        $str29$Failure___s________________s_fail = SubLObjectFactory.makeString("Failure: ~s~%         ==> ~s fails ~s");
        $sym30$RETURN_LIST_OF_VALUES = SubLObjectFactory.makeSymbol("RETURN-LIST-OF-VALUES");
        $str31$__Normal___s_______________s__Exp = SubLObjectFactory.makeString("~&Normal: ~s~%        ==> ~s~%Expected: ~s");
        $kw32$ABNORMAL = SubLObjectFactory.makeKeyword("ABNORMAL");
        $str33$__Abnormal___s_________________s_ = SubLObjectFactory.makeString("~&Abnormal: ~s~%          ==> ~s~%Expected: ~s~%Not found: ~s~%Unexpected: ~s");
        $str34$Abnormal___s_________________s__E = SubLObjectFactory.makeString("Abnormal: ~s~%          ==> ~s~%Expected: ~s~%Not found: ~s~%Unexpected: ~s");
        $sym35$EQUAL_BINDINGS = SubLObjectFactory.makeSymbol("EQUAL-BINDINGS");
        $str36$__Abnormal___s_______________s__E = SubLObjectFactory.makeString("~&Abnormal: ~s~%        ==> ~s~%Expected: ~s");
        $str37$Abnormal___s_______________s__Exp = SubLObjectFactory.makeString("Abnormal: ~s~%        ==> ~s~%Expected: ~s");
        $kw38$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw39$STRENGTH = SubLObjectFactory.makeKeyword("STRENGTH");
        $kw40$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $sym41$CYC_ASSERT = SubLObjectFactory.makeSymbol("CYC-ASSERT");
        $str42$__Failure__Assertion__s_failed_ = SubLObjectFactory.makeString("~&Failure: Assertion ~s failed.");
        $str43$Failure__Assertion__s_failed_ = SubLObjectFactory.makeString("Failure: Assertion ~s failed.");
        $sym44$CYC_ASSERT_WFF = SubLObjectFactory.makeSymbol("CYC-ASSERT-WFF");
        $kw45$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $kw46$SILENT = SubLObjectFactory.makeKeyword("SILENT");
        $str47$___A__ = SubLObjectFactory.makeString("~&~A~%");
        $str48$___s_constant_A__A__ = SubLObjectFactory.makeString("  ~s constant~A ~A~%");
        $str49$s_were = SubLObjectFactory.makeString("s were");
        $str50$_was = SubLObjectFactory.makeString(" was");
        $str51$created = SubLObjectFactory.makeString("created");
        $str52$destroyed = SubLObjectFactory.makeString("destroyed");
        $str53$___s_nart_A__A__ = SubLObjectFactory.makeString("  ~s nart~A ~A~%");
        $str54$___s_assertion_A__A__ = SubLObjectFactory.makeString("  ~s assertion~A ~A~%");
        $str55$___s_kb_hl_support_A__A__ = SubLObjectFactory.makeString("  ~s kb-hl-support~A ~A~%");
        $str56$___s_deduction_A__A__ = SubLObjectFactory.makeString("  ~s deduction~A ~A~%");
        $str57$__Assert_time____A = SubLObjectFactory.makeString("~%Assert time = ~A");
        $sym58$FI_UNASSERT_INT = SubLObjectFactory.makeSymbol("FI-UNASSERT-INT");
        $sym59$FI_BLAST_INT = SubLObjectFactory.makeSymbol("FI-BLAST-INT");
        $sym60$FI_JUSTIFY_INT = SubLObjectFactory.makeSymbol("FI-JUSTIFY-INT");
        $str61$__Justification_____s = SubLObjectFactory.makeString("~%Justification => ~s");
        $sym62$FI_KILL_INT = SubLObjectFactory.makeSymbol("FI-KILL-INT");
        $sym63$FI_FIND_OR_CREATE_INT = SubLObjectFactory.makeSymbol("FI-FIND-OR-CREATE-INT");
        $str64$__Failure__Did_not_find_unique_na = SubLObjectFactory.makeString("~&Failure: Did not find unique name to create a constant for ~s.");
        $str65$Failure__Create_constant__s_faile = SubLObjectFactory.makeString("Failure: Create constant ~s failed.");
        $sym66$FI_TMS_RECONSIDER_FORMULA_INT = SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-FORMULA-INT");
        $sym67$FI_TMS_RECONSIDER_MT_INT = SubLObjectFactory.makeSymbol("FI-TMS-RECONSIDER-MT-INT");
        $kw68$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $sym69$CAR = SubLObjectFactory.makeSymbol("CAR");
        $kw70$TRANSMIT_AND_RECEIVE = SubLObjectFactory.makeKeyword("TRANSMIT-AND-RECEIVE");
        $kw71$DEAF = SubLObjectFactory.makeKeyword("DEAF");
        $kw72$STANDARD = SubLObjectFactory.makeKeyword("STANDARD");
        $str73$___IT___S__S_ = SubLObjectFactory.makeString("~&:IT (~S ~S)");
        $kw74$POST_BUILD = SubLObjectFactory.makeKeyword("POST-BUILD");
        $str75$_____Starting__IT___S__S__at__A__ = SubLObjectFactory.makeString("~&;; Starting :IT (~S ~S) at ~A~&");
        $kw76$IT = SubLObjectFactory.makeKeyword("IT");
        $str77$_____s____3f_ = SubLObjectFactory.makeString(" -> ~s (~,3f)");
        $kw78$VERBOSE = SubLObjectFactory.makeKeyword("VERBOSE");
        $str79$Warning__Test__ = SubLObjectFactory.makeString("Warning: Test (");
        $str80$_ = SubLObjectFactory.makeString(" ");
        $str81$__changed_the_KB_ = SubLObjectFactory.makeString(") changed the KB!");
        $str82$__There_is_no_test_in__s_associat = SubLObjectFactory.makeString("~&There is no test in ~s associated with ~s.~%");
        $sym83$_INFERENCE_TESTS_ = SubLObjectFactory.makeSymbol("*INFERENCE-TESTS*");
        $str84$__In_fact__there_are_no_tests_in_ = SubLObjectFactory.makeString("~&In fact, there are no tests in ~s at all!~%");
        $str85$__The__s_argument_is__s__which_is = SubLObjectFactory.makeString("~%The ~s argument is ~s, which is not a list of test keywords.");
        $sym86$KEYWORD_LIST = SubLObjectFactory.makeSymbol("KEYWORD-LIST");
        $sym87$TERM__ = SubLObjectFactory.makeSymbol("TERM-<");
        $sym88$CDR = SubLObjectFactory.makeSymbol("CDR");
        $str89$__ = SubLObjectFactory.makeString("~%");
        $str90$__ = SubLObjectFactory.makeString("->");
        $str91$_IT = SubLObjectFactory.makeString(":IT");
        $str92$Unknown_output_format__A = SubLObjectFactory.makeString("Unknown output format ~A");
        $str93$___s__a__s = SubLObjectFactory.makeString("~%~s ~a ~s");
        $str94$___s_____s = SubLObjectFactory.makeString("~%~s -> ~s");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)inference_testing.EQUAL))), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("MESSAGE-LIST"));
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)inference_testing.EQUAL);
        $sym97$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym98$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym99$_EVALUATE_PREVIOUSLY_FAILING_TESTS_ = SubLObjectFactory.makeSymbol("*EVALUATE-PREVIOUSLY-FAILING-TESTS*");
        $sym100$COR = SubLObjectFactory.makeSymbol("COR");
        $sym101$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym102$_CHECK_ALL_IT_BUG_TYPES_ = SubLObjectFactory.makeSymbol("*CHECK-ALL-IT-BUG-TYPES*");
        $sym103$MEMBER = SubLObjectFactory.makeSymbol("MEMBER");
        $sym104$_KNOWN_BUG_TYPES_TO_CHECK_ = SubLObjectFactory.makeSymbol("*KNOWN-BUG-TYPES-TO-CHECK*");
        $sym105$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym106$_IT_FAILING_VERBOSE_ = SubLObjectFactory.makeSymbol("*IT-FAILING-VERBOSE*");
        $sym107$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list108 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*IT-VERBOSE*"), (SubLObject)inference_testing.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*TEST-STATUS*"), (SubLObject)inference_testing.NIL));
        $sym109$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $str110$__The_previously_failing_test____ = SubLObjectFactory.makeString("~&The previously failing test~%  ~s~%of type ~s was evaluated immediately after this.~%");
        $sym111$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym112$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym113$APPLY = SubLObjectFactory.makeSymbol("APPLY");
        $list114 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT"));
        $sym115$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $str116$__This_previously_failing_test___ = SubLObjectFactory.makeString("~&This previously failing test~%  ~s~%of type ~s was not evaluated.~%");
        $str117$__This_previously_failing_test___ = SubLObjectFactory.makeString("~&This previously failing test~%  ~s~%was not evaluated.~%");
        $str118$__Starting__a____ = SubLObjectFactory.makeString("~&Starting ~a ...");
        $sym119$DEF_INFERENCE_TEST = SubLObjectFactory.makeSymbol("DEF-INFERENCE-TEST");
        $sym120$DEFINE_INFERENCE_TEST = SubLObjectFactory.makeSymbol("DEFINE-INFERENCE-TEST");
        $sym121$INVALID_CONSTANT_ = SubLObjectFactory.makeSymbol("INVALID-CONSTANT?");
        $sym122$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $str123$_s = SubLObjectFactory.makeString("~s");
        $str124$_s_is_not_an_accessible_pathname_ = SubLObjectFactory.makeString("~s is not an accessible pathname.");
        $sym125$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym126$OBJ__STRING = SubLObjectFactory.makeSymbol("OBJ->STRING");
        $str127$___ERROR__LOADING__A__S = SubLObjectFactory.makeString("~%:ERROR :LOADING ~A ~S");
        $str128$___s_is_bound_to__s__which_is_not = SubLObjectFactory.makeString("~%~s is bound to ~s, which is not known to be a valid pathname.");
        $sym129$PATHNAME = SubLObjectFactory.makeSymbol("PATHNAME");
        $list130 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPECIAL?"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-SPECS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym131$VAR_SPEC_VAR = SubLObjectFactory.makeSymbol("VAR-SPEC-VAR");
        $sym132$TEST_CONSTANTS = SubLObjectFactory.makeUninternedSymbol("TEST-CONSTANTS");
        $sym133$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym134$PRINT_CREATE_VAR_SPEC_CONSTANT = SubLObjectFactory.makeSymbol("PRINT-CREATE-VAR-SPEC-CONSTANT");
        $sym135$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym136$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym137$PRINT_ASSERT = SubLObjectFactory.makeSymbol("PRINT-ASSERT");
        $sym138$VAR_SPEC_DEF = SubLObjectFactory.makeSymbol("VAR-SPEC-DEF");
        $list139 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-ASSERT-MT*"), (SubLObject)SubLObjectFactory.makeKeyword("MONOTONIC"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD"));
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("*BREAK-BEFORE-TEST-END?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BREAK"), (SubLObject)SubLObjectFactory.makeString("Test ~A before cleanup"), (SubLObject)SubLObjectFactory.makeSymbol("*CURRENT-TEST*")));
        $sym141$_CLEAN_UP_TEST_CONSTANTS__ = SubLObjectFactory.makeSymbol("*CLEAN-UP-TEST-CONSTANTS?*");
        $sym142$PRINT_KILL = SubLObjectFactory.makeSymbol("PRINT-KILL");
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPECIAL?"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-SPECS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym144$TEST_ASSERTIONS = SubLObjectFactory.makeUninternedSymbol("TEST-ASSERTIONS");
        $sym145$PRINT_UNASSERT = SubLObjectFactory.makeSymbol("PRINT-UNASSERT");
        $sym146$TEST_ASSERTIONS = SubLObjectFactory.makeUninternedSymbol("TEST-ASSERTIONS");
        $sym147$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $list148 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("VARS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym149$ARGLIST = SubLObjectFactory.makeUninternedSymbol("ARGLIST");
        $sym150$DEFMACRO = SubLObjectFactory.makeSymbol("DEFMACRO");
        $sym151$_REST = SubLObjectFactory.makeSymbol("&REST");
        $sym152$RET = SubLObjectFactory.makeSymbol("RET");
        $sym153$BQ_LIST = SubLObjectFactory.makeSymbol("BQ-LIST");
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"));
        $sym155$BQ_CONS = SubLObjectFactory.makeSymbol("BQ-CONS");
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"));
        $sym157$BQ_APPEND = SubLObjectFactory.makeSymbol("BQ-APPEND");
        $list158 = ConsesLow.list((SubLObject)inference_testing.NIL);
        $list159 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PWHEN"));
        $list160 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*IT-VERBOSE*"));
        $list161 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT"));
        $str162$___________A__S = SubLObjectFactory.makeString("~&~%>>>>> ~A ~S");
        $list163 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PROGN"));
        $str164$___________A__S = SubLObjectFactory.makeString("~&~%<<<<< ~A ~S");
        $sym165$B_VERIFY = SubLObjectFactory.makeSymbol("B-VERIFY");
        $list166 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST-NAME"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD")), SubLObjectFactory.makeSymbol("KB"), SubLObjectFactory.makeSymbol("OWNER"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("BUG"), SubLObjectFactory.makeSymbol("CREATED"), SubLObjectFactory.makeSymbol("CREATOR"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORKING?"), (SubLObject)inference_testing.T) }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list167 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("KB"), (SubLObject)SubLObjectFactory.makeKeyword("OWNER"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeKeyword("BUG"), (SubLObject)SubLObjectFactory.makeKeyword("CREATED"), (SubLObject)SubLObjectFactory.makeKeyword("CREATOR"), (SubLObject)SubLObjectFactory.makeKeyword("WORKING?"));
        $kw168$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw169$KB = SubLObjectFactory.makeKeyword("KB");
        $kw170$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw171$COMMENT = SubLObjectFactory.makeKeyword("COMMENT");
        $kw172$BUG = SubLObjectFactory.makeKeyword("BUG");
        $kw173$CREATED = SubLObjectFactory.makeKeyword("CREATED");
        $kw174$CREATOR = SubLObjectFactory.makeKeyword("CREATOR");
        $kw175$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HERALD-START"));
        $sym177$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym178$RUN_INFERENCE_TEST_ = SubLObjectFactory.makeSymbol("RUN-INFERENCE-TEST?");
        $list179 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*TEST-STATUS*"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-RUN")));
        $sym180$INFERENCE_TEST_MENTIONS_INVALID_CONSTANT_ = SubLObjectFactory.makeSymbol("INFERENCE-TEST-MENTIONS-INVALID-CONSTANT?");
        $list181 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*TEST-STATUS*"), (SubLObject)SubLObjectFactory.makeKeyword("INVALID")));
        $list182 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UPDATE-TEST-RESULTS"), (SubLObject)SubLObjectFactory.makeSymbol("*CURRENT-TEST*")));
        $sym183$NEW_INFERENCE_TEST = SubLObjectFactory.makeSymbol("NEW-INFERENCE-TEST");
        $kw184$BOTH = SubLObjectFactory.makeKeyword("BOTH");
        $kw185$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw186$TINY = SubLObjectFactory.makeKeyword("TINY");
        $sym187$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $list188 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORWARD"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD"), (SubLObject)SubLObjectFactory.makeKeyword("BOTH"));
        $sym189$INFERENCE_TEST_DIRECTION_P = SubLObjectFactory.makeSymbol("INFERENCE-TEST-DIRECTION-P");
        $sym190$CYC_TEST_KB_P = SubLObjectFactory.makeSymbol("CYC-TEST-KB-P");
        $sym191$INFERENCE_TEST_OWNER_P = SubLObjectFactory.makeSymbol("INFERENCE-TEST-OWNER-P");
        $sym192$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym193$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $kw194$BUG_NUMBER = SubLObjectFactory.makeKeyword("BUG-NUMBER");
        $sym195$UNIVERSAL_DATE_P = SubLObjectFactory.makeSymbol("UNIVERSAL-DATE-P");
        $kw196$CREATION_DATE = SubLObjectFactory.makeKeyword("CREATION-DATE");
        $sym197$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $sym198$INFERENCE_TEST_WORKING_ = SubLObjectFactory.makeSymbol("INFERENCE-TEST-WORKING?");
        $sym199$DEF_TIME_INFERENCE_TEST = SubLObjectFactory.makeSymbol("DEF-TIME-INFERENCE-TEST");
        $sym200$DEFINED_TIME_INFERENCE_TESTS = SubLObjectFactory.makeSymbol("DEFINED-TIME-INFERENCE-TESTS");
        $sym201$DO_TIME_TESTS_BACKWARD = SubLObjectFactory.makeSymbol("DO-TIME-TESTS-BACKWARD");
    }
}

/*

	Total time: 794 ms
	 synthetic 
*/