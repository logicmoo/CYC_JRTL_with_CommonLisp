package com.cyc.cycjava.cycl.cyc_testing;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.regular_expression_utilities;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapper;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_cyc_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_testing_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities";
    public static final String myFingerPrint = "ff47dca27dfbb4984912829ba5b08fc2ea93ac2db75fdd8a7f8be9833b95c3c8";
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 1205L)
    private static SubLSymbol $default_rerun_crashing_tests$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 1578L)
    public static SubLSymbol $cyc_test_write_image_directory$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 25742L)
    private static SubLSymbol $tests_that_dont_work_with_real_time_pruning$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 28969L)
    private static SubLSymbol $file_size_change_tolerance$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 29096L)
    private static SubLSymbol $file_size_ignore_regexes$;
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 32179L)
    private static SubLSymbol $size_logs_directory$;
    private static final SubLSymbol $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str3$_lisp;
    private static final SubLSymbol $sym4$CSETQ;
    private static final SubLString $str5$_A;
    private static final SubLString $str6$_;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLSymbol $kw9$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw10$VERBOSITY;
    private static final SubLSymbol $kw11$TERSE;
    private static final SubLSymbol $kw12$BROWSABLE_;
    private static final SubLSymbol $kw13$BLOCK_;
    private static final SubLSymbol $kw14$OUTPUT_FORMAT;
    private static final SubLSymbol $kw15$STANDARD;
    private static final SubLSymbol $kw16$STREAM;
    private static final SubLSymbol $sym17$_STANDARD_OUTPUT_;
    private static final SubLSymbol $kw18$RUN_TINY_KB_TESTS_IN_FULL_KB_;
    private static final SubLSymbol $sym19$_RUN_TINY_KB_TESTS_IN_FULL_KB__;
    private static final SubLSymbol $sym20$RUN_CYC_TEST_INT;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$RUN_CYC_TEST_IN_RANGE_INT;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLSymbol $kw25$VERBOSE;
    private static final SubLSymbol $sym26$RUN_CYC_TEST;
    private static final SubLSymbol $sym27$CYC_TEST_VERBOSITY_LEVEL_P;
    private static final SubLSymbol $sym28$BOOLEANP;
    private static final SubLSymbol $sym29$CYC_TEST_OUTPUT_FORMAT_P;
    private static final SubLSymbol $sym30$STREAMP;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLSymbol $kw33$NTHREADS;
    private static final SubLSymbol $kw34$NTIMES;
    private static final SubLSymbol $sym35$RUN_CYC_TEST_PARALLEL_INT;
    private static final SubLSymbol $sym36$RUN_CYC_TEST_PARALLEL;
    private static final SubLSymbol $sym37$NON_NEGATIVE_INTEGER_P;
    private static final SubLString $str38$Parallel_Test_Thread_for_;
    private static final SubLString $str39$_No__;
    private static final SubLSymbol $sym40$RUN_CYC_TEST_OBJECT_PARALLEL;
    private static final SubLSymbol $kw41$IUT;
    private static final SubLSymbol $kw42$IT;
    private static final SubLSymbol $kw43$RMT;
    private static final SubLSymbol $kw44$TMT;
    private static final SubLSymbol $kw45$RMCT;
    private static final SubLSymbol $kw46$ERT;
    private static final SubLSymbol $kw47$TCT;
    private static final SubLSymbol $kw48$KCT;
    private static final SubLString $str49$Cyc_test_of_unexpected_type___s;
    private static final SubLSymbol $kw50$SILENT;
    private static final SubLString $str51$Can_t_run_inference_tests_in_brow;
    private static final SubLString $str52$Can_t_run_inference_tests_in_bloc;
    private static final SubLSymbol $kw53$BACKWARD;
    private static final SubLSymbol $kw54$FORWARD;
    private static final SubLString $str55$Unexpected_testing_direction____S;
    private static final SubLSymbol $kw56$ERROR;
    private static final SubLString $str57$Can_t_run_removal_module_cost_tes;
    private static final SubLString $str58$Can_t_run_removal_module_cost_tes;
    private static final SubLString $str59$Can_t_run_evaluatable_relation_te;
    private static final SubLString $str60$Can_t_run_test_case_tables_in_bro;
    private static final SubLString $str61$Can_t_run_test_case_tables_in_blo;
    private static final SubLSymbol $kw62$POST_BUILD;
    private static final SubLSymbol $sym63$CYC_TEST_TYPE_SPEC_P;
    private static final SubLSymbol $sym64$FILE_VALID_FOR_WRITING_P;
    private static final SubLSymbol $sym65$DIRECTORY_WRITEABLE_P;
    private static final SubLString $str66$Invalid_phase__A_of__A_specified_;
    private static final SubLSymbol $kw67$APPEND;
    private static final SubLString $str68$Unable_to_open__S;
    private static final SubLString $str69$___HARNESS_ERROR___A__;
    private static final SubLSymbol $kw70$HARNESS_ERROR;
    private static final SubLSymbol $kw71$INPUT;
    private static final SubLSymbol $kw72$EOF;
    private static final SubLSymbol $sym73$CYC_TEST_RUN_P;
    private static final SubLSymbol $kw74$NOT_RUN;
    private static final SubLSymbol $kw75$INVALID;
    private static final SubLList $list76;
    private static final SubLSymbol $kw77$ONLY;
    private static final SubLString $str78$Unexpected_value__s_for__run_non_;
    private static final SubLString $str79$____Failing_regression_tests___;
    private static final SubLSymbol $sym80$FAILING_CYC_TEST_RUN_P;
    private static final SubLString $str81$None____;
    private static final SubLString $str82$____Succeeding_regression_tests__;
    private static final SubLSymbol $sym83$SUCCEEDING_CYC_TEST_RUN_P;
    private static final SubLString $str84$None____;
    private static final SubLSymbol $sym85$IGNORED_CYC_TEST_RUN_P;
    private static final SubLString $str86$____Non_regression_tests__None_;
    private static final SubLSymbol $kw87$NON_REGRESSION_SUCCESS;
    private static final SubLSymbol $kw88$NON_REGRESSION_FAILURE;
    private static final SubLString $str89$__Failing_non_regression_tests___;
    private static final SubLString $str90$__Succeeding_non_regression_tests;
    private static final SubLString $str91$_Running_a_specified_list_of_test;
    private static final SubLString $str92$_Running__a_file_P_of_tests_;
    private static final SubLString $str93$in_the__a_KB__KB__a___System__a_S;
    private static final SubLString $str94$Tiny;
    private static final SubLString $str95$Full;
    private static final SubLString $str96$;
    private static final SubLString $str97$_;
    private static final SubLString $str98$_of_;
    private static final SubLString $str99$_phases_;
    private static final SubLString $str100$__No_tests_were_run___;
    private static final SubLSymbol $sym101$CYC_TEST_NAME;
    private static final SubLString $str102$__NOTE__The_following_cyc_tests_w;
    private static final SubLString $str103$___Tests_finished_at__a_Total_tim;
    private static final SubLSymbol $sym104$CYC_TEST_RUN_RESULT;
    private static final SubLString $str105$Overall_result___s__;
    private static final SubLString $str106$_S__A__S__A;
    private static final SubLString $str107$__A;
    private static final SubLSymbol $kw108$SUCCESS;
    private static final SubLString $str109$cyc_test_image_;
    private static final SubLString $str110$load;
    private static final SubLList $list111;
    private static final SubLFloat $float112$1_2;
    private static final SubLList $list113;
    private static final SubLSymbol $sym114$DIRECTORY_P;
    private static final SubLString $str115$cdolist;
    private static final SubLString $str116$_;
    private static final SubLString $str117$grew;
    private static final SubLString $str118$shrunk;
    private static final SubLString $str119$_from_;
    private static final SubLString $str120$_bytes_to_;
    private static final SubLString $str121$_bytes;
    private static final SubLString $str122$_disappeared;
    private static final SubLString $str123$_is_a_new_file;
    private static final SubLString $str124$filename;
    private static final SubLString $str125$size_in_bytes_as_of_;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 881L)
    public static SubLObject load_lisp_test_file_from_path(final SubLObject path, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = (SubLObject)cyc_testing_utilities.NIL;
        final SubLObject _prev_bind_0 = control_vars.$read_require_constant_exists$.currentBinding(thread);
        try {
            control_vars.$read_require_constant_exists$.bind((SubLObject)cyc_testing_utilities.NIL, thread);
            SubLObject message_var = (SubLObject)cyc_testing_utilities.NIL;
            final SubLObject was_appendingP = Eval.eval((SubLObject)cyc_testing_utilities.$sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
            Eval.eval((SubLObject)cyc_testing_utilities.$list1);
            try {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)cyc_testing_utilities.$sym2$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject pathname = Sequences.cconcatenate(path, new SubLObject[] { filename, cyc_testing_utilities.$str3$_lisp });
                            successP = Eval.load(pathname);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)cyc_testing_utilities.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_testing_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    Eval.eval((SubLObject)ConsesLow.list((SubLObject)cyc_testing_utilities.$sym4$CSETQ, (SubLObject)cyc_testing_utilities.$sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn((SubLObject)cyc_testing_utilities.$str5$_A, message_var);
            }
        }
        finally {
            control_vars.$read_require_constant_exists$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 1817L)
    public static SubLObject cyc_test_write_image_directory() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((cyc_testing_utilities.NIL != cyc_testing_utilities.$cyc_test_write_image_directory$.getDynamicValue(thread)) ? ((cyc_testing_utilities.NIL != string_utilities.ends_with(cyc_testing_utilities.$cyc_test_write_image_directory$.getDynamicValue(thread), (SubLObject)cyc_testing_utilities.$str6$_, (SubLObject)cyc_testing_utilities.UNPROVIDED)) ? cyc_testing_utilities.$cyc_test_write_image_directory$.getDynamicValue(thread) : Sequences.cconcatenate(cyc_testing_utilities.$cyc_test_write_image_directory$.getDynamicValue(thread), (SubLObject)cyc_testing_utilities.$str6$_)) : cyc_testing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 2116L)
    public static SubLObject run_cyc_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)cyc_testing_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_testing_utilities.$list7);
        name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject current_$3 = (SubLObject)cyc_testing_utilities.NIL;
        while (cyc_testing_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing_utilities.$list7);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing_utilities.$list7);
            if (cyc_testing_utilities.NIL == conses_high.member(current_$3, (SubLObject)cyc_testing_utilities.$list8, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED)) {
                bad = (SubLObject)cyc_testing_utilities.T;
            }
            if (current_$3 == cyc_testing_utilities.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cyc_testing_utilities.NIL != bad && cyc_testing_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_testing_utilities.$list7);
        }
        final SubLObject verbosity_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw10$VERBOSITY, current);
        final SubLObject verbosity = (SubLObject)((cyc_testing_utilities.NIL != verbosity_tail) ? conses_high.cadr(verbosity_tail) : cyc_testing_utilities.$kw11$TERSE);
        final SubLObject browsableP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw12$BROWSABLE_, current);
        final SubLObject browsableP = (SubLObject)((cyc_testing_utilities.NIL != browsableP_tail) ? conses_high.cadr(browsableP_tail) : cyc_testing_utilities.NIL);
        final SubLObject blockP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw13$BLOCK_, current);
        final SubLObject blockP = (SubLObject)((cyc_testing_utilities.NIL != blockP_tail) ? conses_high.cadr(blockP_tail) : cyc_testing_utilities.NIL);
        final SubLObject output_format_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw14$OUTPUT_FORMAT, current);
        final SubLObject output_format = (SubLObject)((cyc_testing_utilities.NIL != output_format_tail) ? conses_high.cadr(output_format_tail) : cyc_testing_utilities.$kw15$STANDARD);
        final SubLObject stream_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw16$STREAM, current);
        final SubLObject stream = (SubLObject)((cyc_testing_utilities.NIL != stream_tail) ? conses_high.cadr(stream_tail) : cyc_testing_utilities.$sym17$_STANDARD_OUTPUT_);
        final SubLObject run_tiny_kb_tests_in_full_kbP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw18$RUN_TINY_KB_TESTS_IN_FULL_KB_, current);
        final SubLObject run_tiny_kb_tests_in_full_kbP = (SubLObject)((cyc_testing_utilities.NIL != run_tiny_kb_tests_in_full_kbP_tail) ? conses_high.cadr(run_tiny_kb_tests_in_full_kbP_tail) : cyc_testing_utilities.$sym19$_RUN_TINY_KB_TESTS_IN_FULL_KB__);
        return (SubLObject)ConsesLow.list((SubLObject)cyc_testing_utilities.$sym20$RUN_CYC_TEST_INT, name, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 2527L)
    public static SubLObject run_cyc_test_in_range(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject min_number = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject max_number = (SubLObject)cyc_testing_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_testing_utilities.$list21);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_testing_utilities.$list21);
        min_number = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_testing_utilities.$list21);
        max_number = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject current_$4 = (SubLObject)cyc_testing_utilities.NIL;
        while (cyc_testing_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing_utilities.$list21);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing_utilities.$list21);
            if (cyc_testing_utilities.NIL == conses_high.member(current_$4, (SubLObject)cyc_testing_utilities.$list8, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED)) {
                bad = (SubLObject)cyc_testing_utilities.T;
            }
            if (current_$4 == cyc_testing_utilities.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cyc_testing_utilities.NIL != bad && cyc_testing_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_testing_utilities.$list21);
        }
        final SubLObject verbosity_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw10$VERBOSITY, current);
        final SubLObject verbosity = (SubLObject)((cyc_testing_utilities.NIL != verbosity_tail) ? conses_high.cadr(verbosity_tail) : cyc_testing_utilities.$kw11$TERSE);
        final SubLObject browsableP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw12$BROWSABLE_, current);
        final SubLObject browsableP = (SubLObject)((cyc_testing_utilities.NIL != browsableP_tail) ? conses_high.cadr(browsableP_tail) : cyc_testing_utilities.NIL);
        final SubLObject blockP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw13$BLOCK_, current);
        final SubLObject blockP = (SubLObject)((cyc_testing_utilities.NIL != blockP_tail) ? conses_high.cadr(blockP_tail) : cyc_testing_utilities.NIL);
        final SubLObject output_format_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw14$OUTPUT_FORMAT, current);
        final SubLObject output_format = (SubLObject)((cyc_testing_utilities.NIL != output_format_tail) ? conses_high.cadr(output_format_tail) : cyc_testing_utilities.$kw15$STANDARD);
        final SubLObject stream_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw16$STREAM, current);
        final SubLObject stream = (SubLObject)((cyc_testing_utilities.NIL != stream_tail) ? conses_high.cadr(stream_tail) : cyc_testing_utilities.$sym17$_STANDARD_OUTPUT_);
        final SubLObject run_tiny_kb_tests_in_full_kbP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw18$RUN_TINY_KB_TESTS_IN_FULL_KB_, current);
        final SubLObject run_tiny_kb_tests_in_full_kbP = (SubLObject)((cyc_testing_utilities.NIL != run_tiny_kb_tests_in_full_kbP_tail) ? conses_high.cadr(run_tiny_kb_tests_in_full_kbP_tail) : cyc_testing_utilities.$sym19$_RUN_TINY_KB_TESTS_IN_FULL_KB__);
        return (SubLObject)ConsesLow.list(new SubLObject[] { cyc_testing_utilities.$sym22$RUN_CYC_TEST_IN_RANGE_INT, name, min_number, max_number, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 2985L)
    public static SubLObject run_cyc_test_verbose(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)cyc_testing_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_testing_utilities.$list23);
        name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject current_$5 = (SubLObject)cyc_testing_utilities.NIL;
        while (cyc_testing_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing_utilities.$list23);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing_utilities.$list23);
            if (cyc_testing_utilities.NIL == conses_high.member(current_$5, (SubLObject)cyc_testing_utilities.$list24, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED)) {
                bad = (SubLObject)cyc_testing_utilities.T;
            }
            if (current_$5 == cyc_testing_utilities.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cyc_testing_utilities.NIL != bad && cyc_testing_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_testing_utilities.$list23);
        }
        final SubLObject browsableP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw12$BROWSABLE_, current);
        final SubLObject browsableP = (SubLObject)((cyc_testing_utilities.NIL != browsableP_tail) ? conses_high.cadr(browsableP_tail) : cyc_testing_utilities.NIL);
        final SubLObject blockP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw13$BLOCK_, current);
        final SubLObject blockP = (SubLObject)((cyc_testing_utilities.NIL != blockP_tail) ? conses_high.cadr(blockP_tail) : cyc_testing_utilities.NIL);
        final SubLObject output_format_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw14$OUTPUT_FORMAT, current);
        final SubLObject output_format = (SubLObject)((cyc_testing_utilities.NIL != output_format_tail) ? conses_high.cadr(output_format_tail) : cyc_testing_utilities.$kw15$STANDARD);
        final SubLObject stream_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw16$STREAM, current);
        final SubLObject stream = (SubLObject)((cyc_testing_utilities.NIL != stream_tail) ? conses_high.cadr(stream_tail) : cyc_testing_utilities.$sym17$_STANDARD_OUTPUT_);
        final SubLObject run_tiny_kb_tests_in_full_kbP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw18$RUN_TINY_KB_TESTS_IN_FULL_KB_, current);
        final SubLObject run_tiny_kb_tests_in_full_kbP = (SubLObject)((cyc_testing_utilities.NIL != run_tiny_kb_tests_in_full_kbP_tail) ? conses_high.cadr(run_tiny_kb_tests_in_full_kbP_tail) : cyc_testing_utilities.$sym19$_RUN_TINY_KB_TESTS_IN_FULL_KB__);
        return (SubLObject)ConsesLow.list((SubLObject)cyc_testing_utilities.$sym20$RUN_CYC_TEST_INT, name, (SubLObject)cyc_testing_utilities.$kw25$VERBOSE, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 3402L)
    public static SubLObject run_cyc_test_int(final SubLObject name, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        assert cyc_testing_utilities.NIL != cyc_testing.cyc_test_verbosity_level_p(verbosity) : verbosity;
        assert cyc_testing_utilities.NIL != Types.booleanp(browsableP) : browsableP;
        assert cyc_testing_utilities.NIL != Types.booleanp(blockP) : blockP;
        assert cyc_testing_utilities.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        assert cyc_testing_utilities.NIL != Types.streamp(stream) : stream;
        assert cyc_testing_utilities.NIL != Types.booleanp(run_tiny_kb_tests_in_full_kbP) : run_tiny_kb_tests_in_full_kbP;
        SubLObject test_runs = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject cdolist_list_var = cyc_testing.find_cyc_tests(name);
        SubLObject ct = (SubLObject)cyc_testing_utilities.NIL;
        ct = cdolist_list_var.first();
        while (cyc_testing_utilities.NIL != cdolist_list_var) {
            test_runs = ConsesLow.nconc(test_runs, run_cyc_test_object(ct, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP));
            cdolist_list_var = cdolist_list_var.rest();
            ct = cdolist_list_var.first();
        }
        return test_runs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 4076L)
    public static SubLObject run_cyc_test_in_range_int(final SubLObject name, final SubLObject min_number, final SubLObject max_number, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        assert cyc_testing_utilities.NIL != cyc_testing.cyc_test_verbosity_level_p(verbosity) : verbosity;
        assert cyc_testing_utilities.NIL != Types.booleanp(browsableP) : browsableP;
        assert cyc_testing_utilities.NIL != Types.booleanp(blockP) : blockP;
        assert cyc_testing_utilities.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        assert cyc_testing_utilities.NIL != Types.streamp(stream) : stream;
        assert cyc_testing_utilities.NIL != Types.booleanp(run_tiny_kb_tests_in_full_kbP) : run_tiny_kb_tests_in_full_kbP;
        SubLObject test_runs = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject cdolist_list_var = cyc_testing.find_cyc_tests_in_range(name, min_number, max_number);
        SubLObject ct = (SubLObject)cyc_testing_utilities.NIL;
        ct = cdolist_list_var.first();
        while (cyc_testing_utilities.NIL != cdolist_list_var) {
            test_runs = ConsesLow.nconc(test_runs, run_cyc_test_object(ct, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP));
            cdolist_list_var = cdolist_list_var.rest();
            ct = cdolist_list_var.first();
        }
        return test_runs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 4812L)
    public static SubLObject run_cyc_test_parallel(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)cyc_testing_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cyc_testing_utilities.$list31);
        name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject current_$6 = (SubLObject)cyc_testing_utilities.NIL;
        while (cyc_testing_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing_utilities.$list31);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cyc_testing_utilities.$list31);
            if (cyc_testing_utilities.NIL == conses_high.member(current_$6, (SubLObject)cyc_testing_utilities.$list32, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED)) {
                bad = (SubLObject)cyc_testing_utilities.T;
            }
            if (current_$6 == cyc_testing_utilities.$kw9$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cyc_testing_utilities.NIL != bad && cyc_testing_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cyc_testing_utilities.$list31);
        }
        final SubLObject nthreads_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw33$NTHREADS, current);
        final SubLObject nthreads = (SubLObject)((cyc_testing_utilities.NIL != nthreads_tail) ? conses_high.cadr(nthreads_tail) : cyc_testing_utilities.FOUR_INTEGER);
        final SubLObject ntimes_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw34$NTIMES, current);
        final SubLObject ntimes = (SubLObject)((cyc_testing_utilities.NIL != ntimes_tail) ? conses_high.cadr(ntimes_tail) : cyc_testing_utilities.TEN_INTEGER);
        final SubLObject verbosity_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw10$VERBOSITY, current);
        final SubLObject verbosity = (SubLObject)((cyc_testing_utilities.NIL != verbosity_tail) ? conses_high.cadr(verbosity_tail) : cyc_testing_utilities.$kw11$TERSE);
        final SubLObject browsableP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw12$BROWSABLE_, current);
        final SubLObject browsableP = (SubLObject)((cyc_testing_utilities.NIL != browsableP_tail) ? conses_high.cadr(browsableP_tail) : cyc_testing_utilities.NIL);
        final SubLObject blockP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw13$BLOCK_, current);
        final SubLObject blockP = (SubLObject)((cyc_testing_utilities.NIL != blockP_tail) ? conses_high.cadr(blockP_tail) : cyc_testing_utilities.NIL);
        final SubLObject output_format_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw14$OUTPUT_FORMAT, current);
        final SubLObject output_format = (SubLObject)((cyc_testing_utilities.NIL != output_format_tail) ? conses_high.cadr(output_format_tail) : cyc_testing_utilities.$kw15$STANDARD);
        final SubLObject stream_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw16$STREAM, current);
        final SubLObject stream = (SubLObject)((cyc_testing_utilities.NIL != stream_tail) ? conses_high.cadr(stream_tail) : cyc_testing_utilities.$sym17$_STANDARD_OUTPUT_);
        final SubLObject run_tiny_kb_tests_in_full_kbP_tail = cdestructuring_bind.property_list_member((SubLObject)cyc_testing_utilities.$kw18$RUN_TINY_KB_TESTS_IN_FULL_KB_, current);
        final SubLObject run_tiny_kb_tests_in_full_kbP = (SubLObject)((cyc_testing_utilities.NIL != run_tiny_kb_tests_in_full_kbP_tail) ? conses_high.cadr(run_tiny_kb_tests_in_full_kbP_tail) : cyc_testing_utilities.$sym19$_RUN_TINY_KB_TESTS_IN_FULL_KB__);
        return (SubLObject)ConsesLow.list(new SubLObject[] { cyc_testing_utilities.$sym35$RUN_CYC_TEST_PARALLEL_INT, name, nthreads, ntimes, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 5238L)
    public static SubLObject run_cyc_test_parallel_int(final SubLObject name, final SubLObject nthreads, final SubLObject ntimes, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        assert cyc_testing_utilities.NIL != subl_promotions.non_negative_integer_p(nthreads) : nthreads;
        assert cyc_testing_utilities.NIL != subl_promotions.non_negative_integer_p(ntimes) : ntimes;
        assert cyc_testing_utilities.NIL != cyc_testing.cyc_test_verbosity_level_p(verbosity) : verbosity;
        assert cyc_testing_utilities.NIL != cyc_testing.cyc_test_verbosity_level_p(verbosity) : verbosity;
        assert cyc_testing_utilities.NIL != Types.booleanp(browsableP) : browsableP;
        assert cyc_testing_utilities.NIL != Types.booleanp(blockP) : blockP;
        assert cyc_testing_utilities.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        assert cyc_testing_utilities.NIL != Types.streamp(stream) : stream;
        assert cyc_testing_utilities.NIL != Types.booleanp(run_tiny_kb_tests_in_full_kbP) : run_tiny_kb_tests_in_full_kbP;
        SubLObject i;
        for (i = (SubLObject)cyc_testing_utilities.NIL, i = (SubLObject)cyc_testing_utilities.ZERO_INTEGER; i.numL(nthreads); i = Numbers.add(i, (SubLObject)cyc_testing_utilities.ONE_INTEGER)) {
            subl_promotions.make_process_with_args(Sequences.cconcatenate((SubLObject)cyc_testing_utilities.$str38$Parallel_Test_Thread_for_, new SubLObject[] { format_nil.format_nil_a_no_copy(name), cyc_testing_utilities.$str39$_No__, format_nil.format_nil_a_no_copy(i) }), Symbols.symbol_function((SubLObject)cyc_testing_utilities.$sym40$RUN_CYC_TEST_OBJECT_PARALLEL), (SubLObject)ConsesLow.list(new SubLObject[] { name, i, ntimes, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP }));
        }
        return (SubLObject)cyc_testing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 6138L)
    public static SubLObject run_cyc_test_object_parallel(final SubLObject name, final SubLObject thread_num, final SubLObject ntimes, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        SubLObject test_runs = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject cdolist_list_var = cyc_testing.find_cyc_tests(name);
        SubLObject ct = (SubLObject)cyc_testing_utilities.NIL;
        ct = cdolist_list_var.first();
        while (cyc_testing_utilities.NIL != cdolist_list_var) {
            SubLObject i;
            for (i = (SubLObject)cyc_testing_utilities.NIL, i = (SubLObject)cyc_testing_utilities.ZERO_INTEGER; i.numL(ntimes); i = Numbers.add(i, (SubLObject)cyc_testing_utilities.ONE_INTEGER)) {
                test_runs = ConsesLow.nconc(test_runs, run_cyc_test_object(ct, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP));
            }
            cdolist_list_var = cdolist_list_var.rest();
            ct = cdolist_list_var.first();
        }
        return test_runs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 6692L)
    public static SubLObject run_cyc_test_object(final SubLObject ct, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject guts = cyc_testing.cyc_test_guts(ct);
        SubLObject result = (SubLObject)cyc_testing_utilities.NIL;
        final SubLObject _prev_bind_0 = control_vars.$save_asked_queriesP$.currentBinding(thread);
        try {
            control_vars.$save_asked_queriesP$.bind((SubLObject)cyc_testing_utilities.NIL, thread);
            final SubLObject pcase_var = cyc_testing.cyc_test_type(ct);
            if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw41$IUT)) {
                result = run_cyc_test_iut(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
            }
            else if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw42$IT)) {
                result = run_cyc_test_it(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
            }
            else if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw43$RMT)) {
                result = run_cyc_test_rmt(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
            }
            else if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw44$TMT)) {
                result = run_cyc_test_tmt(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
            }
            else if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw45$RMCT)) {
                result = run_cyc_test_rmct(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
            }
            else if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw46$ERT)) {
                result = run_cyc_test_ert(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
            }
            else if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw47$TCT)) {
                result = run_cyc_test_tct(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
            }
            else if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw48$KCT)) {
                result = run_cyc_test_kct(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
            }
            else {
                Errors.error((SubLObject)cyc_testing_utilities.$str49$Cyc_test_of_unexpected_type___s, guts);
            }
        }
        finally {
            control_vars.$save_asked_queriesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 8225L)
    public static SubLObject run_cyc_test_iut(final SubLObject iut, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject verboseP = (SubLObject)SubLObjectFactory.makeBoolean(cyc_testing_utilities.$kw50$SILENT != verbosity);
        thread.resetMultipleValues();
        final SubLObject result = inference_unit_tests.run_inference_unit_test_int(iut, verboseP, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
        final SubLObject test_run = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.list(test_run);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 8640L)
    public static SubLObject run_cyc_test_it(final SubLObject it, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_testing_utilities.$kw50$SILENT != verbosity) {
            if (cyc_testing_utilities.NIL != browsableP) {
                Errors.warn((SubLObject)cyc_testing_utilities.$str51$Can_t_run_inference_tests_in_brow);
            }
            if (cyc_testing_utilities.NIL != blockP) {
                Errors.warn((SubLObject)cyc_testing_utilities.$str52$Can_t_run_inference_tests_in_bloc);
            }
        }
        final SubLObject progress_blipP = (SubLObject)SubLObjectFactory.makeBoolean(cyc_testing_utilities.$kw50$SILENT != verbosity);
        final SubLObject verboseP = Equality.eq((SubLObject)cyc_testing_utilities.$kw25$VERBOSE, verbosity);
        SubLObject backward_test_run = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject forward_test_run = (SubLObject)cyc_testing_utilities.NIL;
        final SubLObject _prev_bind_0 = cyc_testing.$it_output_format$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = StreamsLow.$standard_output$.currentBinding(thread);
        try {
            cyc_testing.$it_output_format$.bind(output_format, thread);
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
            StreamsLow.$standard_output$.bind(stream, thread);
            backward_test_run = run_cyc_test_it_int(it, progress_blipP, verboseP, (SubLObject)cyc_testing_utilities.$kw53$BACKWARD);
            forward_test_run = run_cyc_test_it_int(it, progress_blipP, verboseP, (SubLObject)cyc_testing_utilities.$kw54$FORWARD);
        }
        finally {
            StreamsLow.$standard_output$.rebind(_prev_bind_3, thread);
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_2, thread);
            cyc_testing.$it_output_format$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)ConsesLow.list(backward_test_run, forward_test_run);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 9534L)
    public static SubLObject run_cyc_test_it_int(final SubLObject it, final SubLObject progress_blipP, final SubLObject verboseP, final SubLObject testing_direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject total_time = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject test_run = (SubLObject)cyc_testing_utilities.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        if (cyc_testing_utilities.NIL == cyc_testing.$cyc_test_debugP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)cyc_testing_utilities.$sym2$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (testing_direction.eql((SubLObject)cyc_testing_utilities.$kw53$BACKWARD)) {
                            test_run = inference_testing.run_test(it, progress_blipP, verboseP, (SubLObject)cyc_testing_utilities.$kw53$BACKWARD, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED);
                        }
                        else if (testing_direction.eql((SubLObject)cyc_testing_utilities.$kw54$FORWARD)) {
                            test_run = inference_testing.run_test(it, progress_blipP, verboseP, (SubLObject)cyc_testing_utilities.$kw54$FORWARD, (SubLObject)cyc_testing_utilities.NIL, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED);
                        }
                        else {
                            Errors.error((SubLObject)cyc_testing_utilities.$str55$Unexpected_testing_direction____S, testing_direction);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)cyc_testing_utilities.NIL);
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
        }
        else if (testing_direction.eql((SubLObject)cyc_testing_utilities.$kw53$BACKWARD)) {
            test_run = inference_testing.run_test(it, progress_blipP, verboseP, (SubLObject)cyc_testing_utilities.$kw53$BACKWARD, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED);
        }
        else if (testing_direction.eql((SubLObject)cyc_testing_utilities.$kw54$FORWARD)) {
            test_run = inference_testing.run_test(it, progress_blipP, verboseP, (SubLObject)cyc_testing_utilities.$kw54$FORWARD, (SubLObject)cyc_testing_utilities.NIL, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED);
        }
        else {
            Errors.error((SubLObject)cyc_testing_utilities.$str55$Unexpected_testing_direction____S, testing_direction);
        }
        total_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (cyc_testing_utilities.NIL != error_message) {
            test_run = cyc_testing.new_cyc_test_run((SubLObject)cyc_testing_utilities.$kw42$IT, (SubLObject)ConsesLow.list(it, testing_direction), (SubLObject)cyc_testing_utilities.$kw56$ERROR, total_time);
        }
        return test_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 10180L)
    public static SubLObject run_cyc_test_rmt(final SubLObject rmt, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_runs = (SubLObject)cyc_testing_utilities.NIL;
        if (cyc_testing_utilities.$kw50$SILENT == verbosity) {
            stream = StreamsLow.$null_output$.getDynamicValue(thread);
        }
        final SubLObject _prev_bind_0 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
        try {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
            thread.resetMultipleValues();
            final SubLObject result = removal_module_tests.run_removal_module_test(rmt, output_format, stream, browsableP, blockP);
            final SubLObject test_run = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = (SubLObject)ConsesLow.list(test_run);
        }
        finally {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_0, thread);
        }
        return test_runs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 10659L)
    public static SubLObject run_cyc_test_tmt(final SubLObject tmt, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_runs = (SubLObject)cyc_testing_utilities.NIL;
        if (cyc_testing_utilities.$kw50$SILENT == verbosity) {
            stream = StreamsLow.$null_output$.getDynamicValue(thread);
        }
        final SubLObject _prev_bind_0 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
        try {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
            thread.resetMultipleValues();
            final SubLObject result = transformation_module_tests.run_transformation_module_test(tmt, output_format, stream, browsableP, blockP);
            final SubLObject test_run = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = (SubLObject)ConsesLow.list(test_run);
        }
        finally {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_0, thread);
        }
        return test_runs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 11145L)
    public static SubLObject run_cyc_test_rmct(final SubLObject rmct, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_testing_utilities.$kw50$SILENT != verbosity) {
            if (cyc_testing_utilities.NIL != browsableP) {
                Errors.warn((SubLObject)cyc_testing_utilities.$str57$Can_t_run_removal_module_cost_tes);
            }
            if (cyc_testing_utilities.NIL != blockP) {
                Errors.warn((SubLObject)cyc_testing_utilities.$str58$Can_t_run_removal_module_cost_tes);
            }
        }
        SubLObject test_run = (SubLObject)cyc_testing_utilities.NIL;
        if (cyc_testing_utilities.$kw50$SILENT == verbosity) {
            stream = StreamsLow.$null_output$.getDynamicValue(thread);
        }
        final SubLObject _prev_bind_0 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
        try {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
            test_run = removal_module_cost_tests.run_removal_module_cost_test(rmct, output_format, stream);
        }
        finally {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)ConsesLow.list(test_run);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 11818L)
    public static SubLObject run_cyc_test_ert(final SubLObject ert, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_testing_utilities.$kw50$SILENT != verbosity && cyc_testing_utilities.NIL != blockP) {
            Errors.warn((SubLObject)cyc_testing_utilities.$str59$Can_t_run_evaluatable_relation_te);
        }
        SubLObject test_run = (SubLObject)cyc_testing_utilities.NIL;
        if (cyc_testing_utilities.$kw50$SILENT == verbosity) {
            stream = StreamsLow.$null_output$.getDynamicValue(thread);
        }
        final SubLObject _prev_bind_0 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
        try {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
            test_run = evaluatable_relation_tests.run_evaluatable_relation_test(ert, output_format, stream, browsableP);
        }
        finally {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)ConsesLow.list(test_run);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 12375L)
    public static SubLObject run_cyc_test_tct(final SubLObject tct, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_testing_utilities.$kw50$SILENT != verbosity) {
            if (cyc_testing_utilities.NIL != browsableP) {
                Errors.warn((SubLObject)cyc_testing_utilities.$str60$Can_t_run_test_case_tables_in_bro);
            }
            if (cyc_testing_utilities.NIL != blockP) {
                Errors.warn((SubLObject)cyc_testing_utilities.$str61$Can_t_run_test_case_tables_in_blo);
            }
        }
        SubLObject test_runs = (SubLObject)cyc_testing_utilities.NIL;
        final SubLObject generic_test_verbosity_level = (SubLObject)((cyc_testing_utilities.$kw62$POST_BUILD == output_format) ? cyc_testing_utilities.$kw62$POST_BUILD : verbosity);
        final SubLObject _prev_bind_0 = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
        try {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
            thread.resetMultipleValues();
            final SubLObject result = generic_testing.run_generic_test_case_int(stream, tct, generic_test_verbosity_level, (SubLObject)cyc_testing_utilities.NIL);
            final SubLObject tct_test_runs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = tct_test_runs;
        }
        finally {
            cyc_testing.$run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_0, thread);
        }
        return test_runs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 13218L)
    public static SubLObject run_cyc_test_kct(final SubLObject kct, final SubLObject verbosity, final SubLObject browsableP, final SubLObject blockP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        return (SubLObject)ConsesLow.list(kct_cyc_testing.kct_run_test_as_cyc_test(kct, verbosity, browsableP, blockP, output_format, stream));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 13474L)
    public static SubLObject run_all_loaded_cyc_tests_int(final SubLObject stream, final SubLObject verbosity, final SubLObject stop_at_first_failureP, final SubLObject output_format, final SubLObject run_tiny_kb_tests_in_full_kbP, final SubLObject run_test_case_tablesP, final SubLObject type, final SubLObject run_non_working_tests, final SubLObject progress_file, SubLObject rerun_crashing_tests, SubLObject tests, SubLObject phase, SubLObject phases) {
        if (tests == cyc_testing_utilities.UNPROVIDED) {
            tests = cyc_testing.cyc_tests();
        }
        if (phase == cyc_testing_utilities.UNPROVIDED) {
            phase = (SubLObject)cyc_testing_utilities.ZERO_INTEGER;
        }
        if (phases == cyc_testing_utilities.UNPROVIDED) {
            phases = (SubLObject)cyc_testing_utilities.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cyc_testing_utilities.NIL != Types.streamp(stream) : stream;
        assert cyc_testing_utilities.NIL != cyc_testing.cyc_test_verbosity_level_p(verbosity) : verbosity;
        assert cyc_testing_utilities.NIL != cyc_testing.cyc_test_output_format_p(output_format) : output_format;
        assert cyc_testing_utilities.NIL != Types.booleanp(stop_at_first_failureP) : stop_at_first_failureP;
        assert cyc_testing_utilities.NIL != Types.booleanp(run_tiny_kb_tests_in_full_kbP) : run_tiny_kb_tests_in_full_kbP;
        assert cyc_testing_utilities.NIL != cyc_testing.cyc_test_type_spec_p(type) : type;
        if (cyc_testing_utilities.NIL != progress_file && !cyc_testing_utilities.assertionsDisabledInClass && cyc_testing_utilities.NIL == file_utilities.file_valid_for_writing_p(progress_file)) {
            throw new AssertionError(progress_file);
        }
        if (cyc_testing_utilities.NIL == rerun_crashing_tests) {
            rerun_crashing_tests = cyc_testing_utilities.$default_rerun_crashing_tests$.getDynamicValue(thread);
        }
        assert cyc_testing_utilities.NIL != subl_promotions.non_negative_integer_p(rerun_crashing_tests) : rerun_crashing_tests;
        if (cyc_testing_utilities.NIL != cyc_test_write_image_directory() && !cyc_testing_utilities.assertionsDisabledInClass && cyc_testing_utilities.NIL == file_utilities.directory_writeable_p(cyc_test_write_image_directory(), (SubLObject)cyc_testing_utilities.UNPROVIDED)) {
            throw new AssertionError(cyc_test_write_image_directory());
        }
        if (cyc_testing_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !phase.numL(phases)) {
            Errors.error((SubLObject)cyc_testing_utilities.$str66$Invalid_phase__A_of__A_specified_, phase, phases);
        }
        final SubLObject silentP = Equality.eq((SubLObject)cyc_testing_utilities.$kw50$SILENT, verbosity);
        final SubLObject tests_specifiedP = (SubLObject)((cyc_testing_utilities.NIL != tests) ? SubLObjectFactory.makeBoolean(!tests.eql(cyc_testing.cyc_tests())) : cyc_testing_utilities.NIL);
        final SubLObject tests_count = Sequences.length(tests);
        SubLObject doneP = (SubLObject)cyc_testing_utilities.NIL;
        final SubLObject start_time = Time.get_universal_time();
        SubLObject harness_error = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject some_harness_errorP = (SubLObject)cyc_testing_utilities.NIL;
        thread.resetMultipleValues();
        SubLObject test_runs = load_cyc_tests_progress_file(progress_file, rerun_crashing_tests);
        final SubLObject tests_to_avoid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cyc_testing_utilities.NIL != progress_file) {
            SubLObject stream_$7 = (SubLObject)cyc_testing_utilities.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)cyc_testing_utilities.NIL, thread);
                    stream_$7 = compatibility.open_binary(progress_file, (SubLObject)cyc_testing_utilities.$kw67$APPEND);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream_$7.isStream()) {
                    Errors.error((SubLObject)cyc_testing_utilities.$str68$Unable_to_open__S, progress_file);
                }
                final SubLObject progress_stream = stream_$7;
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)cyc_testing_utilities.$sym2$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            if (cyc_testing_utilities.NIL == silentP) {
                                run_all_loaded_cyc_tests_print_header(stream, start_time, tests_specifiedP, phase, phases);
                            }
                            SubLObject list_var = (SubLObject)cyc_testing_utilities.NIL;
                            SubLObject ct = (SubLObject)cyc_testing_utilities.NIL;
                            SubLObject test_num = (SubLObject)cyc_testing_utilities.NIL;
                            list_var = tests;
                            ct = list_var.first();
                            for (test_num = (SubLObject)cyc_testing_utilities.ZERO_INTEGER; cyc_testing_utilities.NIL == doneP && cyc_testing_utilities.NIL != list_var; list_var = list_var.rest(), ct = list_var.first(), test_num = Numbers.add((SubLObject)cyc_testing_utilities.ONE_INTEGER, test_num)) {
                                SubLObject partial_test_runs = (SubLObject)cyc_testing_utilities.NIL;
                                if (cyc_testing_utilities.NIL == cyc_test_part_of_phaseP(test_num, tests_count, phase, phases) || cyc_testing_utilities.NIL == run_cyc_testP(ct, type, run_test_case_tablesP, run_non_working_tests, tests_to_avoid)) {
                                    partial_test_runs = (SubLObject)ConsesLow.list(new_cyc_test_null_run(ct));
                                }
                                else if (cyc_testing_utilities.$kw47$TCT != cyc_testing.cyc_test_type(ct) && cyc_testing_utilities.NIL != cyc_test_mentions_invalid_constantP(ct)) {
                                    partial_test_runs = (SubLObject)ConsesLow.list(new_cyc_test_invalid_run(ct));
                                }
                                else {
                                    cyc_test_possibly_write_image(ct);
                                    if (cyc_testing_utilities.NIL != progress_file) {
                                        cfasl.cfasl_output(new_cyc_test_error_run(ct), progress_stream);
                                        streams_high.force_output(progress_stream);
                                    }
                                    if (cyc_testing_utilities.NIL == cyc_testing.$cyc_test_debugP$.getDynamicValue(thread)) {
                                        try {
                                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                            final SubLObject _prev_bind_0_$8 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind((SubLObject)cyc_testing_utilities.$sym2$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    partial_test_runs = run_cyc_test_object(ct, verbosity, (SubLObject)cyc_testing_utilities.NIL, (SubLObject)cyc_testing_utilities.NIL, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                                }
                                                catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, (SubLObject)cyc_testing_utilities.NIL);
                                                }
                                            }
                                            finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_$8, thread);
                                            }
                                        }
                                        catch (Throwable ccatch_env_var) {
                                            harness_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                        }
                                        finally {
                                            thread.throwStack.pop();
                                        }
                                    }
                                    else {
                                        partial_test_runs = run_cyc_test_object(ct, verbosity, (SubLObject)cyc_testing_utilities.NIL, (SubLObject)cyc_testing_utilities.NIL, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                    }
                                    cyc_test_possibly_cleanup_write_image(ct, partial_test_runs);
                                }
                                if (cyc_testing_utilities.NIL != harness_error) {
                                    some_harness_errorP = (SubLObject)cyc_testing_utilities.T;
                                    if (cyc_testing_utilities.NIL == silentP) {
                                        format_nil.force_format(stream, (SubLObject)cyc_testing_utilities.$str69$___HARNESS_ERROR___A__, harness_error, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED);
                                    }
                                    harness_error = (SubLObject)cyc_testing_utilities.NIL;
                                }
                                test_runs = ConsesLow.nconc(test_runs, partial_test_runs);
                                if (cyc_testing_utilities.NIL != progress_file) {
                                    SubLObject cdolist_list_var = partial_test_runs;
                                    SubLObject test_run = (SubLObject)cyc_testing_utilities.NIL;
                                    test_run = cdolist_list_var.first();
                                    while (cyc_testing_utilities.NIL != cdolist_list_var) {
                                        cfasl.cfasl_output(test_run, progress_stream);
                                        streams_high.force_output(progress_stream);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        test_run = cdolist_list_var.first();
                                    }
                                }
                                if (cyc_testing_utilities.NIL != stop_at_first_failureP) {
                                    final SubLObject partial_result = cyc_testing.cyc_test_runs_overall_result(partial_test_runs);
                                    if (cyc_testing_utilities.NIL != cyc_testing.cyc_test_failure_result_p(partial_result)) {
                                        doneP = (SubLObject)cyc_testing_utilities.T;
                                    }
                                }
                            }
                            if (cyc_testing_utilities.NIL == silentP) {
                                run_all_loaded_cyc_tests_print_footer(stream, start_time, test_runs, tests_specifiedP, type);
                            }
                        }
                        catch (Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, (SubLObject)cyc_testing_utilities.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_2, thread);
                    }
                }
                catch (Throwable ccatch_env_var2) {
                    harness_error = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_testing_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream_$7.isStream()) {
                        streams_high.close(stream_$7, (SubLObject)cyc_testing_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        }
        else {
            final SubLObject progress_stream2 = (SubLObject)cyc_testing_utilities.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)cyc_testing_utilities.$sym2$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (cyc_testing_utilities.NIL == silentP) {
                            run_all_loaded_cyc_tests_print_header(stream, start_time, tests_specifiedP, phase, phases);
                        }
                        SubLObject list_var2 = (SubLObject)cyc_testing_utilities.NIL;
                        SubLObject ct2 = (SubLObject)cyc_testing_utilities.NIL;
                        SubLObject test_num2 = (SubLObject)cyc_testing_utilities.NIL;
                        list_var2 = tests;
                        ct2 = list_var2.first();
                        for (test_num2 = (SubLObject)cyc_testing_utilities.ZERO_INTEGER; cyc_testing_utilities.NIL == doneP && cyc_testing_utilities.NIL != list_var2; list_var2 = list_var2.rest(), ct2 = list_var2.first(), test_num2 = Numbers.add((SubLObject)cyc_testing_utilities.ONE_INTEGER, test_num2)) {
                            SubLObject partial_test_runs2 = (SubLObject)cyc_testing_utilities.NIL;
                            if (cyc_testing_utilities.NIL == cyc_test_part_of_phaseP(test_num2, tests_count, phase, phases) || cyc_testing_utilities.NIL == run_cyc_testP(ct2, type, run_test_case_tablesP, run_non_working_tests, tests_to_avoid)) {
                                partial_test_runs2 = (SubLObject)ConsesLow.list(new_cyc_test_null_run(ct2));
                            }
                            else if (cyc_testing_utilities.$kw47$TCT != cyc_testing.cyc_test_type(ct2) && cyc_testing_utilities.NIL != cyc_test_mentions_invalid_constantP(ct2)) {
                                partial_test_runs2 = (SubLObject)ConsesLow.list(new_cyc_test_invalid_run(ct2));
                            }
                            else {
                                cyc_test_possibly_write_image(ct2);
                                if (cyc_testing_utilities.NIL != progress_file) {
                                    cfasl.cfasl_output(new_cyc_test_error_run(ct2), progress_stream2);
                                    streams_high.force_output(progress_stream2);
                                }
                                if (cyc_testing_utilities.NIL == cyc_testing.$cyc_test_debugP$.getDynamicValue(thread)) {
                                    try {
                                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                        final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind((SubLObject)cyc_testing_utilities.$sym2$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                partial_test_runs2 = run_cyc_test_object(ct2, verbosity, (SubLObject)cyc_testing_utilities.NIL, (SubLObject)cyc_testing_utilities.NIL, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                            }
                                            catch (Throwable catch_var3) {
                                                Errors.handleThrowable(catch_var3, (SubLObject)cyc_testing_utilities.NIL);
                                            }
                                        }
                                        finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    }
                                    catch (Throwable ccatch_env_var3) {
                                        harness_error = Errors.handleThrowable(ccatch_env_var3, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                    finally {
                                        thread.throwStack.pop();
                                    }
                                }
                                else {
                                    partial_test_runs2 = run_cyc_test_object(ct2, verbosity, (SubLObject)cyc_testing_utilities.NIL, (SubLObject)cyc_testing_utilities.NIL, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                }
                                cyc_test_possibly_cleanup_write_image(ct2, partial_test_runs2);
                            }
                            if (cyc_testing_utilities.NIL != harness_error) {
                                some_harness_errorP = (SubLObject)cyc_testing_utilities.T;
                                if (cyc_testing_utilities.NIL == silentP) {
                                    format_nil.force_format(stream, (SubLObject)cyc_testing_utilities.$str69$___HARNESS_ERROR___A__, harness_error, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED);
                                }
                                harness_error = (SubLObject)cyc_testing_utilities.NIL;
                            }
                            test_runs = ConsesLow.nconc(test_runs, partial_test_runs2);
                            if (cyc_testing_utilities.NIL != progress_file) {
                                SubLObject cdolist_list_var2 = partial_test_runs2;
                                SubLObject test_run2 = (SubLObject)cyc_testing_utilities.NIL;
                                test_run2 = cdolist_list_var2.first();
                                while (cyc_testing_utilities.NIL != cdolist_list_var2) {
                                    cfasl.cfasl_output(test_run2, progress_stream2);
                                    streams_high.force_output(progress_stream2);
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    test_run2 = cdolist_list_var2.first();
                                }
                            }
                            if (cyc_testing_utilities.NIL != stop_at_first_failureP) {
                                final SubLObject partial_result2 = cyc_testing.cyc_test_runs_overall_result(partial_test_runs2);
                                if (cyc_testing_utilities.NIL != cyc_testing.cyc_test_failure_result_p(partial_result2)) {
                                    doneP = (SubLObject)cyc_testing_utilities.T;
                                }
                            }
                        }
                        if (cyc_testing_utilities.NIL == silentP) {
                            run_all_loaded_cyc_tests_print_footer(stream, start_time, test_runs, tests_specifiedP, type);
                        }
                    }
                    catch (Throwable catch_var4) {
                        Errors.handleThrowable(catch_var4, (SubLObject)cyc_testing_utilities.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var4) {
                harness_error = Errors.handleThrowable(ccatch_env_var4, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
        }
        SubLObject overall_result = cyc_testing.cyc_test_runs_overall_result(test_runs);
        if (cyc_testing_utilities.NIL != some_harness_errorP) {
            overall_result = (SubLObject)cyc_testing_utilities.$kw70$HARNESS_ERROR;
        }
        return Values.values(overall_result, test_runs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 17179L)
    public static SubLObject cyc_test_part_of_phaseP(final SubLObject test_num, final SubLObject tests_count, final SubLObject phase, final SubLObject phases) {
        return Numbers.numE(phase, Numbers.truncate(test_num, Numbers.divide(tests_count, phases)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 17318L)
    public static SubLObject load_cyc_tests_progress_file(final SubLObject progress_file, final SubLObject rerun_crashing_tests) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cyc_testing_utilities.NIL == progress_file || cyc_testing_utilities.NIL == file_utilities.file_existsP(progress_file)) {
            return Values.values((SubLObject)cyc_testing_utilities.NIL, set.new_set(Symbols.symbol_function((SubLObject)cyc_testing_utilities.EQ), (SubLObject)cyc_testing_utilities.UNPROVIDED));
        }
        final SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)cyc_testing_utilities.EQ), (SubLObject)cyc_testing_utilities.UNPROVIDED);
        final SubLObject history_dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)cyc_testing_utilities.EQ), (SubLObject)cyc_testing_utilities.UNPROVIDED);
        SubLObject current_test_run = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject last_cyc_test = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject stream = (SubLObject)cyc_testing_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)cyc_testing_utilities.NIL, thread);
                stream = compatibility.open_binary(progress_file, (SubLObject)cyc_testing_utilities.$kw71$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)cyc_testing_utilities.$str68$Unable_to_open__S, progress_file);
            }
            SubLObject stream_$10;
            for (stream_$10 = stream, current_test_run = cfasl.cfasl_input(stream_$10, (SubLObject)cyc_testing_utilities.NIL, (SubLObject)cyc_testing_utilities.$kw72$EOF); cyc_testing_utilities.$kw72$EOF != current_test_run; current_test_run = cfasl.cfasl_input(stream_$10, (SubLObject)cyc_testing_utilities.NIL, (SubLObject)cyc_testing_utilities.$kw72$EOF)) {
                assert cyc_testing_utilities.NIL != cyc_testing.cyc_test_run_p(current_test_run) : current_test_run;
                final SubLObject ct = cyc_testing.cyc_test_run_cyc_test(current_test_run);
                dictionary.dictionary_enter(dict, ct, current_test_run);
                dictionary_utilities.dictionary_increment(history_dict, ct, (SubLObject)cyc_testing_utilities.UNPROVIDED);
                last_cyc_test = ct;
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_testing_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)cyc_testing_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        final SubLObject test_runs = dictionary.dictionary_values(dict);
        final SubLObject tests_to_avoid = set_utilities.construct_set_from_list(dictionary.dictionary_keys(dict), Symbols.symbol_function((SubLObject)cyc_testing_utilities.EQ), (SubLObject)cyc_testing_utilities.UNPROVIDED);
        if (cyc_testing_utilities.NIL != last_cyc_test && rerun_crashing_tests.isPositive() && dictionary.dictionary_lookup(history_dict, last_cyc_test, (SubLObject)cyc_testing_utilities.ZERO_INTEGER).numLE(rerun_crashing_tests)) {
            set.set_remove(last_cyc_test, tests_to_avoid);
        }
        return Values.values(test_runs, tests_to_avoid);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 18595L)
    public static SubLObject new_cyc_test_null_run(final SubLObject ct) {
        final SubLObject type = cyc_testing.cyc_test_type(ct);
        final SubLObject name = cyc_testing.cyc_test_name(ct);
        return cyc_testing.new_cyc_test_run(type, name, (SubLObject)cyc_testing_utilities.$kw74$NOT_RUN, (SubLObject)cyc_testing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 18757L)
    public static SubLObject new_cyc_test_invalid_run(final SubLObject ct) {
        final SubLObject type = cyc_testing.cyc_test_type(ct);
        final SubLObject name = cyc_testing.cyc_test_name(ct);
        return cyc_testing.new_cyc_test_run(type, name, (SubLObject)cyc_testing_utilities.$kw75$INVALID, (SubLObject)cyc_testing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 18922L)
    public static SubLObject new_cyc_test_error_run(final SubLObject ct) {
        final SubLObject type = cyc_testing.cyc_test_type(ct);
        final SubLObject name = cyc_testing.cyc_test_name(ct);
        return cyc_testing.new_cyc_test_run(type, name, (SubLObject)cyc_testing_utilities.$kw56$ERROR, (SubLObject)cyc_testing_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 19089L)
    public static SubLObject run_cyc_testP(final SubLObject ct, final SubLObject type_spec, final SubLObject run_test_case_tablesP, final SubLObject run_non_working_tests, SubLObject tests_to_avoid) {
        if (tests_to_avoid == cyc_testing_utilities.UNPROVIDED) {
            tests_to_avoid = (SubLObject)cyc_testing_utilities.NIL;
        }
        if (cyc_testing_utilities.NIL != cyc_testing.testing_real_time_pruningP()) {
            if (cyc_testing_utilities.NIL != list_utilities.member_eqP(cyc_testing.cyc_test_type(ct), (SubLObject)cyc_testing_utilities.$list76)) {
                return (SubLObject)cyc_testing_utilities.NIL;
            }
            if (cyc_testing_utilities.NIL != list_utilities.member_eqP(cyc_testing.cyc_test_name(ct), cyc_testing_utilities.$tests_that_dont_work_with_real_time_pruning$.getGlobalValue())) {
                return (SubLObject)cyc_testing_utilities.NIL;
            }
        }
        if (cyc_testing_utilities.NIL != cyc_testing.cyc_test_type_p(type_spec)) {
            final SubLObject type = cyc_testing.cyc_test_type(ct);
            if (!type.eql(type_spec)) {
                return (SubLObject)cyc_testing_utilities.NIL;
            }
        }
        if (cyc_testing_utilities.NIL == run_test_case_tablesP && cyc_testing_utilities.$kw47$TCT == cyc_testing.cyc_test_type(ct)) {
            return (SubLObject)cyc_testing_utilities.NIL;
        }
        if (cyc_testing_utilities.NIL != tests_to_avoid && cyc_testing_utilities.NIL != set.set_memberP(ct, tests_to_avoid)) {
            return (SubLObject)cyc_testing_utilities.NIL;
        }
        if (cyc_testing_utilities.T != run_non_working_tests) {
            if (cyc_testing_utilities.NIL == run_non_working_tests) {
                if (cyc_testing_utilities.NIL == cyc_testing.cyc_test_workingP(ct)) {
                    return (SubLObject)cyc_testing_utilities.NIL;
                }
            }
            else {
                if (cyc_testing_utilities.$kw77$ONLY != run_non_working_tests) {
                    return Errors.error((SubLObject)cyc_testing_utilities.$str78$Unexpected_value__s_for__run_non_, run_non_working_tests);
                }
                if (cyc_testing_utilities.NIL != cyc_testing.cyc_test_workingP(ct)) {
                    return (SubLObject)cyc_testing_utilities.NIL;
                }
            }
        }
        return (SubLObject)cyc_testing_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 20194L)
    public static SubLObject print_failing_cyc_tests_message(final SubLObject stream, final SubLObject test_runs, SubLObject show_ownersP, SubLObject show_projectsP) {
        if (show_ownersP == cyc_testing_utilities.UNPROVIDED) {
            show_ownersP = (SubLObject)cyc_testing_utilities.NIL;
        }
        if (show_projectsP == cyc_testing_utilities.UNPROVIDED) {
            show_projectsP = (SubLObject)cyc_testing_utilities.NIL;
        }
        PrintLow.format(stream, (SubLObject)cyc_testing_utilities.$str79$____Failing_regression_tests___);
        final SubLObject failing_test_runs = list_utilities.remove_if_not((SubLObject)cyc_testing_utilities.$sym80$FAILING_CYC_TEST_RUN_P, test_runs, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED);
        if (cyc_testing_utilities.NIL != failing_test_runs) {
            SubLObject cdolist_list_var = failing_test_runs;
            SubLObject test_run = (SubLObject)cyc_testing_utilities.NIL;
            test_run = cdolist_list_var.first();
            while (cyc_testing_utilities.NIL != cdolist_list_var) {
                show_cyc_test_run(stream, test_run, show_ownersP, show_projectsP);
                cdolist_list_var = cdolist_list_var.rest();
                test_run = cdolist_list_var.first();
            }
        }
        else {
            PrintLow.format(stream, (SubLObject)cyc_testing_utilities.$str81$None____);
        }
        streams_high.force_output(stream);
        return (SubLObject)cyc_testing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 20638L)
    public static SubLObject print_succeeding_cyc_tests_message(final SubLObject stream, final SubLObject test_runs, SubLObject show_ownersP, SubLObject show_projectsP) {
        if (show_ownersP == cyc_testing_utilities.UNPROVIDED) {
            show_ownersP = (SubLObject)cyc_testing_utilities.NIL;
        }
        if (show_projectsP == cyc_testing_utilities.UNPROVIDED) {
            show_projectsP = (SubLObject)cyc_testing_utilities.NIL;
        }
        PrintLow.format(stream, (SubLObject)cyc_testing_utilities.$str82$____Succeeding_regression_tests__);
        final SubLObject succeeding_test_runs = list_utilities.remove_if_not((SubLObject)cyc_testing_utilities.$sym83$SUCCEEDING_CYC_TEST_RUN_P, test_runs, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED);
        if (cyc_testing_utilities.NIL != succeeding_test_runs) {
            SubLObject cdolist_list_var = succeeding_test_runs;
            SubLObject test_run = (SubLObject)cyc_testing_utilities.NIL;
            test_run = cdolist_list_var.first();
            while (cyc_testing_utilities.NIL != cdolist_list_var) {
                show_cyc_test_run(stream, test_run, show_ownersP, show_projectsP);
                cdolist_list_var = cdolist_list_var.rest();
                test_run = cdolist_list_var.first();
            }
        }
        else {
            PrintLow.format(stream, (SubLObject)cyc_testing_utilities.$str84$None____);
        }
        streams_high.force_output(stream);
        return (SubLObject)cyc_testing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 21100L)
    public static SubLObject print_ignored_cyc_tests_message(final SubLObject stream, final SubLObject test_runs, SubLObject show_ownersP, SubLObject show_projectsP) {
        if (show_ownersP == cyc_testing_utilities.UNPROVIDED) {
            show_ownersP = (SubLObject)cyc_testing_utilities.NIL;
        }
        if (show_projectsP == cyc_testing_utilities.UNPROVIDED) {
            show_projectsP = (SubLObject)cyc_testing_utilities.NIL;
        }
        final SubLObject ignored_test_runs = list_utilities.remove_if_not((SubLObject)cyc_testing_utilities.$sym85$IGNORED_CYC_TEST_RUN_P, test_runs, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED);
        if (cyc_testing_utilities.NIL == ignored_test_runs) {
            PrintLow.format(stream, (SubLObject)cyc_testing_utilities.$str86$____Non_regression_tests__None_);
        }
        else {
            SubLObject ignored_success = (SubLObject)cyc_testing_utilities.NIL;
            SubLObject ignored_fail = (SubLObject)cyc_testing_utilities.NIL;
            SubLObject cdolist_list_var = ignored_test_runs;
            SubLObject test_run = (SubLObject)cyc_testing_utilities.NIL;
            test_run = cdolist_list_var.first();
            while (cyc_testing_utilities.NIL != cdolist_list_var) {
                final SubLObject pcase_var = cyc_testing.cyc_test_run_result(test_run);
                if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw87$NON_REGRESSION_SUCCESS)) {
                    ignored_success = (SubLObject)ConsesLow.cons(test_run, ignored_success);
                }
                else if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw88$NON_REGRESSION_FAILURE)) {
                    ignored_fail = (SubLObject)ConsesLow.cons(test_run, ignored_fail);
                }
                cdolist_list_var = cdolist_list_var.rest();
                test_run = cdolist_list_var.first();
            }
            ignored_success = Sequences.nreverse(ignored_success);
            ignored_fail = Sequences.nreverse(ignored_fail);
            PrintLow.format(stream, (SubLObject)cyc_testing_utilities.$str89$__Failing_non_regression_tests___);
            cdolist_list_var = ignored_fail;
            test_run = (SubLObject)cyc_testing_utilities.NIL;
            test_run = cdolist_list_var.first();
            while (cyc_testing_utilities.NIL != cdolist_list_var) {
                show_cyc_test_run(stream, test_run, show_ownersP, show_projectsP);
                cdolist_list_var = cdolist_list_var.rest();
                test_run = cdolist_list_var.first();
            }
            PrintLow.format(stream, (SubLObject)cyc_testing_utilities.$str90$__Succeeding_non_regression_tests);
            cdolist_list_var = ignored_success;
            test_run = (SubLObject)cyc_testing_utilities.NIL;
            test_run = cdolist_list_var.first();
            while (cyc_testing_utilities.NIL != cdolist_list_var) {
                show_cyc_test_run(stream, test_run, show_ownersP, show_projectsP);
                cdolist_list_var = cdolist_list_var.rest();
                test_run = cdolist_list_var.first();
            }
        }
        streams_high.force_output(stream);
        return (SubLObject)cyc_testing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 22229L)
    public static SubLObject run_all_loaded_cyc_tests_print_header(final SubLObject stream, final SubLObject start_time, final SubLObject tests_specifiedP, SubLObject phase, SubLObject phases) {
        if (phase == cyc_testing_utilities.UNPROVIDED) {
            phase = (SubLObject)cyc_testing_utilities.ZERO_INTEGER;
        }
        if (phases == cyc_testing_utilities.UNPROVIDED) {
            phases = (SubLObject)cyc_testing_utilities.ONE_INTEGER;
        }
        final SubLObject tiny_kbP = (SubLObject)SubLObjectFactory.makeBoolean(cyc_testing_utilities.NIL == control_vars.non_tiny_kb_loadedP());
        if (cyc_testing_utilities.NIL != tests_specifiedP) {
            PrintLow.format(stream, (SubLObject)cyc_testing_utilities.$str91$_Running_a_specified_list_of_test);
        }
        else {
            PrintLow.format(stream, (SubLObject)cyc_testing_utilities.$str92$_Running__a_file_P_of_tests_, cyc_testing.cyc_test_file_count(), cyc_testing.cyc_test_file_count());
        }
        PrintLow.format(stream, (SubLObject)cyc_testing_utilities.$str93$in_the__a_KB__KB__a___System__a_S, new SubLObject[] { (cyc_testing_utilities.NIL != tiny_kbP) ? cyc_testing_utilities.$str94$Tiny : cyc_testing_utilities.$str95$Full, control_vars.kb_loaded(), system_info.cyc_revision_string(), numeric_date_utilities.timestring(start_time), (cyc_testing_utilities.ONE_INTEGER.numE(phases) && cyc_testing_utilities.ZERO_INTEGER.numE(phase)) ? cyc_testing_utilities.$str96$ : Sequences.cconcatenate((SubLObject)cyc_testing_utilities.$str97$_, new SubLObject[] { format_nil.format_nil_a_no_copy(Numbers.add((SubLObject)cyc_testing_utilities.ONE_INTEGER, phase)), cyc_testing_utilities.$str98$_of_, format_nil.format_nil_a_no_copy(phases), cyc_testing_utilities.$str99$_phases_ }) });
        streams_high.force_output(stream);
        return (SubLObject)cyc_testing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 23014L)
    public static SubLObject run_all_loaded_cyc_tests_print_footer(final SubLObject stream, final SubLObject start_time, final SubLObject test_runs, final SubLObject tests_specifiedP, final SubLObject type) {
        if (cyc_testing_utilities.NIL == test_runs) {
            PrintLow.format(stream, (SubLObject)cyc_testing_utilities.$str100$__No_tests_were_run___);
        }
        else {
            if (cyc_testing_utilities.NIL == tests_specifiedP) {
                final SubLObject non_working_tests = cyc_testing.non_working_cyc_tests(type);
                if (cyc_testing_utilities.NIL != non_working_tests) {
                    final SubLObject non_working_test_names = Mapping.mapcar(Symbols.symbol_function((SubLObject)cyc_testing_utilities.$sym101$CYC_TEST_NAME), non_working_tests);
                    PrintLow.format(stream, (SubLObject)cyc_testing_utilities.$str102$__NOTE__The_following_cyc_tests_w);
                    format_nil.print_one_per_line(non_working_test_names, stream);
                    streams_high.terpri(stream);
                }
            }
            print_failing_cyc_tests_message(stream, test_runs, (SubLObject)cyc_testing_utilities.T, (SubLObject)cyc_testing_utilities.NIL);
            final SubLObject overall_result = cyc_testing.cyc_test_runs_overall_result(test_runs);
            final SubLObject total_test_guts_time = cyc_testing.cyc_test_runs_total_time(test_runs);
            final SubLObject end_time = Time.get_universal_time();
            final SubLObject total_time = Numbers.subtract(end_time, start_time);
            PrintLow.format(stream, (SubLObject)cyc_testing_utilities.$str103$___Tests_finished_at__a_Total_tim, new SubLObject[] { numeric_date_utilities.timestring(end_time), numeric_date_utilities.elapsed_time_abbreviation_string(total_time), numeric_date_utilities.elapsed_time_abbreviation_string(total_test_guts_time) });
            list_utilities.pretty_print_plist(list_utilities.histogram_as_plist(Mapping.mapcar((SubLObject)cyc_testing_utilities.$sym104$CYC_TEST_RUN_RESULT, test_runs), (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED), (SubLObject)cyc_testing_utilities.UNPROVIDED);
            PrintLow.format(stream, (SubLObject)cyc_testing_utilities.$str105$Overall_result___s__, overall_result);
        }
        streams_high.force_output(stream);
        return (SubLObject)cyc_testing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 24276L)
    public static SubLObject show_cyc_test_run(final SubLObject stream, final SubLObject test_run, final SubLObject show_ownerP, final SubLObject show_projectP) {
        PrintLow.format(stream, (SubLObject)cyc_testing_utilities.$str106$_S__A__S__A, new SubLObject[] { cyc_testing.cyc_test_run_type(test_run), cyc_testing.cyc_test_run_name(test_run), cyc_testing.cyc_test_run_result(test_run), (cyc_testing_utilities.NIL != cyc_testing.cyc_test_run_time(test_run)) ? number_utilities.significant_digits(cyc_testing.cyc_test_run_time(test_run), (SubLObject)cyc_testing_utilities.FOUR_INTEGER) : cyc_testing_utilities.NIL });
        if (cyc_testing_utilities.NIL != show_ownerP) {
            PrintLow.format(stream, (SubLObject)cyc_testing_utilities.$str107$__A, cyc_testing.cyc_test_run_owner(test_run));
        }
        if (cyc_testing_utilities.NIL != show_projectP) {
            final SubLObject project = cyc_testing.cyc_test_run_project(test_run);
            if (cyc_testing_utilities.NIL != project) {
                PrintLow.format(stream, (SubLObject)cyc_testing_utilities.$str107$__A, project);
            }
        }
        streams_high.terpri(stream);
        streams_high.force_output(stream);
        return test_run;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 24847L)
    public static SubLObject cyc_test_possibly_write_image(final SubLObject ct) {
        final SubLObject dir = cyc_test_write_image_directory();
        if (cyc_testing_utilities.NIL != dir) {
            final SubLObject filename = cyc_test_image_filename(ct, dir);
            Mapper.write_image(filename, (SubLObject)cyc_testing_utilities.UNPROVIDED);
            return filename;
        }
        return (SubLObject)cyc_testing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 25077L)
    public static SubLObject cyc_test_possibly_cleanup_write_image(final SubLObject ct, final SubLObject test_runs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dir = cyc_test_write_image_directory();
        if (cyc_testing_utilities.NIL == dir) {
            return (SubLObject)cyc_testing_utilities.NIL;
        }
        final SubLObject filename = cyc_test_image_filename(ct, dir);
        if (cyc_testing_utilities.$kw108$SUCCESS == cyc_testing.cyc_test_runs_overall_result(test_runs)) {
            SubLObject message_var = (SubLObject)cyc_testing_utilities.NIL;
            final SubLObject was_appendingP = Eval.eval((SubLObject)cyc_testing_utilities.$sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
            Eval.eval((SubLObject)cyc_testing_utilities.$list1);
            try {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)cyc_testing_utilities.$sym2$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            Filesys.delete_file(filename);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)cyc_testing_utilities.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_testing_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    Eval.eval((SubLObject)ConsesLow.list((SubLObject)cyc_testing_utilities.$sym4$CSETQ, (SubLObject)cyc_testing_utilities.$sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn((SubLObject)cyc_testing_utilities.$str5$_A, message_var);
            }
            return (SubLObject)cyc_testing_utilities.T;
        }
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 25424L)
    public static SubLObject cyc_test_image_filename(final SubLObject ct, final SubLObject dir) {
        final SubLObject test_identifier = Strings.string_downcase(string_utilities.alphanumericize_admitting_hyphens(string_utilities.str(cyc_testing.cyc_test_name(ct))), (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED);
        final SubLObject filename = Sequences.cconcatenate((SubLObject)cyc_testing_utilities.$str109$cyc_test_image_, test_identifier);
        return Strings.string_downcase(file_utilities.relative_filename(dir, filename, (SubLObject)cyc_testing_utilities.$str110$load), (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 28144L)
    public static SubLObject cyc_test_mentions_invalid_constantP(final SubLObject ct) {
        final SubLObject guts = cyc_testing.cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_testing.cyc_test_type(ct);
        if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw41$IUT)) {
            return inference_unit_tests.inference_unit_test_mentions_invalid_constantP(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw42$IT)) {
            return inference_testing.inference_test_mentions_invalid_constantP(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw43$RMT)) {
            return removal_module_tests.removal_module_test_mentions_invalid_constantP(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw44$TMT)) {
            return transformation_module_tests.transformation_module_test_mentions_invalid_constantP(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw45$RMCT)) {
            return removal_module_cost_tests.removal_module_cost_test_mentions_invalid_constantP(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw46$ERT)) {
            return evaluatable_relation_tests.evaluatable_relation_test_mentions_invalid_constantP(guts);
        }
        if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw47$TCT)) {
            return list_utilities.sublisp_boolean(generic_testing.generic_test_case_table_tuples_mentioning_some_invalid_constant(guts));
        }
        if (pcase_var.eql((SubLObject)cyc_testing_utilities.$kw48$KCT)) {
            return kct_cyc_testing.kct_test_spec_mentions_invalid_constantP(guts);
        }
        return Errors.error((SubLObject)cyc_testing_utilities.$str49$Cyc_test_of_unexpected_type___s, guts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 29162L)
    public static SubLObject compare_directories(final SubLObject old_dir, final SubLObject new_dir) {
        final SubLObject old_dict = directory_file_size_dict(old_dir);
        final SubLObject new_dict = directory_file_size_dict(new_dir);
        return compare_file_size_dictionaries(old_dict, new_dict);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 29736L)
    public static SubLObject directory_file_size_dict(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)cyc_testing_utilities.EQUAL), (SubLObject)cyc_testing_utilities.UNPROVIDED);
        assert cyc_testing_utilities.NIL != Filesys.directory_p(directory) : directory;
        SubLObject directory_contents_var = Filesys.directory(directory, (SubLObject)cyc_testing_utilities.NIL);
        final SubLObject progress_message_var = (SubLObject)cyc_testing_utilities.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
            if (cyc_testing_utilities.NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)cyc_testing_utilities.NIL, (SubLObject)cyc_testing_utilities.UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$11 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((cyc_testing_utilities.NIL != progress_message_var) ? progress_message_var : cyc_testing_utilities.$str115$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)cyc_testing_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)cyc_testing_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)cyc_testing_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)cyc_testing_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = (SubLObject)cyc_testing_utilities.NIL;
                    file = csome_list_var.first();
                    while (cyc_testing_utilities.NIL != csome_list_var) {
                        if (cyc_testing_utilities.NIL == Filesys.directory_p(file) && cyc_testing_utilities.NIL == ignore_filename_due_to_regexP(file)) {
                            dictionary.dictionary_enter(dict, file, file_utilities.get_file_length(file_utilities.relative_filename(directory, file, (SubLObject)cyc_testing_utilities.UNPROVIDED)));
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)cyc_testing_utilities.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cyc_testing_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
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
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$11, thread);
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return dict;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 30104L)
    public static SubLObject compare_file_size_dictionaries(final SubLObject old_dict, final SubLObject new_dict) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject alerts = (SubLObject)cyc_testing_utilities.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(old_dict)); cyc_testing_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject filename = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject old_size = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject new_size = dictionary.dictionary_lookup_without_values(new_dict, filename, (SubLObject)cyc_testing_utilities.UNPROVIDED);
            if (cyc_testing_utilities.NIL == new_size) {
                alerts = (SubLObject)ConsesLow.cons(new_file_existence_difference_alert(filename, (SubLObject)cyc_testing_utilities.T), alerts);
            }
            else if (cyc_testing_utilities.NIL == file_size_difference_within_toleranceP(old_size, new_size, filename)) {
                alerts = (SubLObject)ConsesLow.cons(new_file_size_difference_alert(old_size, new_size, filename), alerts);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(new_dict)); cyc_testing_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject filename = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (cyc_testing_utilities.NIL == dictionary.dictionary_lookup_without_values(old_dict, filename, (SubLObject)cyc_testing_utilities.UNPROVIDED)) {
                alerts = (SubLObject)ConsesLow.cons(new_file_existence_difference_alert(filename, (SubLObject)cyc_testing_utilities.NIL), alerts);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Sequences.nreverse(alerts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 30788L)
    public static SubLObject file_size_difference_within_toleranceP(final SubLObject old_size, final SubLObject new_size, final SubLObject filename) {
        if (old_size.numE(new_size)) {
            return (SubLObject)cyc_testing_utilities.T;
        }
        final SubLObject grewP = file_size_grewP(old_size, new_size);
        final SubLObject small_size = (cyc_testing_utilities.NIL != grewP) ? old_size : new_size;
        final SubLObject big_size = (cyc_testing_utilities.NIL != grewP) ? new_size : old_size;
        final SubLObject tolerance = size_change_tolerance(filename);
        return Numbers.numL(Numbers.divide(big_size, small_size), tolerance);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 31158L)
    public static SubLObject size_change_tolerance(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cyc_testing_utilities.$file_size_change_tolerance$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 31274L)
    public static SubLObject file_size_grewP(final SubLObject old_size, final SubLObject new_size) {
        return Numbers.numL(old_size, new_size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 31358L)
    public static SubLObject new_file_size_difference_alert(final SubLObject old_size, final SubLObject new_size, final SubLObject filename) {
        final SubLObject grewP = file_size_grewP(old_size, new_size);
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(filename), new SubLObject[] { cyc_testing_utilities.$str116$_, format_nil.format_nil_a_no_copy((SubLObject)((cyc_testing_utilities.NIL != grewP) ? cyc_testing_utilities.$str117$grew : cyc_testing_utilities.$str118$shrunk)), cyc_testing_utilities.$str119$_from_, format_nil.format_nil_a_no_copy(old_size), cyc_testing_utilities.$str120$_bytes_to_, format_nil.format_nil_a_no_copy(new_size), cyc_testing_utilities.$str121$_bytes });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 31603L)
    public static SubLObject new_file_existence_difference_alert(final SubLObject filename, final SubLObject exists_in_oldP) {
        if (cyc_testing_utilities.NIL != exists_in_oldP) {
            return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(filename), (SubLObject)cyc_testing_utilities.$str122$_disappeared);
        }
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(filename), (SubLObject)cyc_testing_utilities.$str123$_is_a_new_file);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 31812L)
    public static SubLObject ignore_filename_due_to_regexP(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return string_matches_any_regexP(filename, cyc_testing_utilities.$file_size_ignore_regexes$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 31943L)
    public static SubLObject string_matches_any_regexP(final SubLObject string, final SubLObject regexes) {
        SubLObject cdolist_list_var = regexes;
        SubLObject regex = (SubLObject)cyc_testing_utilities.NIL;
        regex = cdolist_list_var.first();
        while (cyc_testing_utilities.NIL != cdolist_list_var) {
            if (cyc_testing_utilities.NIL != regular_expression_utilities.find_all_matches_for_regular_expression(regex, string, (SubLObject)cyc_testing_utilities.UNPROVIDED, (SubLObject)cyc_testing_utilities.UNPROVIDED)) {
                return (SubLObject)cyc_testing_utilities.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            regex = cdolist_list_var.first();
        }
        return (SubLObject)cyc_testing_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 32308L)
    public static SubLObject write_directory_file_size_log(final SubLObject directory, final SubLObject logfile) {
        final SubLObject dict = directory_file_size_dict(directory);
        final SubLObject header_1 = (SubLObject)cyc_testing_utilities.$str124$filename;
        final SubLObject header_2 = Sequences.cconcatenate((SubLObject)cyc_testing_utilities.$str125$size_in_bytes_as_of_, numeric_date_utilities.timestring((SubLObject)cyc_testing_utilities.UNPROVIDED));
        return dictionary_utilities.print_dictionary_contents_to_csv(dict, logfile, header_1, header_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 32595L)
    public static SubLObject read_directory_file_size_log(final SubLObject logfile) {
        return dictionary_utilities.new_dictionary_from_csv(logfile, Symbols.symbol_function((SubLObject)cyc_testing_utilities.EQUAL), (SubLObject)cyc_testing_utilities.T, (SubLObject)cyc_testing_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/cyc-testing-utilities.lisp", position = 32706L)
    public static SubLObject compare_file_size_logs(final SubLObject old_logfile, final SubLObject new_logfile) {
        return compare_file_size_dictionaries(read_directory_file_size_log(old_logfile), read_directory_file_size_log(new_logfile));
    }
    
    public static SubLObject declare_cyc_testing_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "load_lisp_test_file_from_path", "LOAD-LISP-TEST-FILE-FROM-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "cyc_test_write_image_directory", "CYC-TEST-WRITE-IMAGE-DIRECTORY", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test", "RUN-CYC-TEST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test_in_range", "RUN-CYC-TEST-IN-RANGE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test_verbose", "RUN-CYC-TEST-VERBOSE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test_int", "RUN-CYC-TEST-INT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test_in_range_int", "RUN-CYC-TEST-IN-RANGE-INT", 9, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test_parallel", "RUN-CYC-TEST-PARALLEL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test_parallel_int", "RUN-CYC-TEST-PARALLEL-INT", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test_object_parallel", "RUN-CYC-TEST-OBJECT-PARALLEL", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test_object", "RUN-CYC-TEST-OBJECT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test_iut", "RUN-CYC-TEST-IUT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test_it", "RUN-CYC-TEST-IT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test_it_int", "RUN-CYC-TEST-IT-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test_rmt", "RUN-CYC-TEST-RMT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test_tmt", "RUN-CYC-TEST-TMT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test_rmct", "RUN-CYC-TEST-RMCT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test_ert", "RUN-CYC-TEST-ERT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test_tct", "RUN-CYC-TEST-TCT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_test_kct", "RUN-CYC-TEST-KCT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_all_loaded_cyc_tests_int", "RUN-ALL-LOADED-CYC-TESTS-INT", 10, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "cyc_test_part_of_phaseP", "CYC-TEST-PART-OF-PHASE?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "load_cyc_tests_progress_file", "LOAD-CYC-TESTS-PROGRESS-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "new_cyc_test_null_run", "NEW-CYC-TEST-NULL-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "new_cyc_test_invalid_run", "NEW-CYC-TEST-INVALID-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "new_cyc_test_error_run", "NEW-CYC-TEST-ERROR-RUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_cyc_testP", "RUN-CYC-TEST?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "print_failing_cyc_tests_message", "PRINT-FAILING-CYC-TESTS-MESSAGE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "print_succeeding_cyc_tests_message", "PRINT-SUCCEEDING-CYC-TESTS-MESSAGE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "print_ignored_cyc_tests_message", "PRINT-IGNORED-CYC-TESTS-MESSAGE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_all_loaded_cyc_tests_print_header", "RUN-ALL-LOADED-CYC-TESTS-PRINT-HEADER", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "run_all_loaded_cyc_tests_print_footer", "RUN-ALL-LOADED-CYC-TESTS-PRINT-FOOTER", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "show_cyc_test_run", "SHOW-CYC-TEST-RUN", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "cyc_test_possibly_write_image", "CYC-TEST-POSSIBLY-WRITE-IMAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "cyc_test_possibly_cleanup_write_image", "CYC-TEST-POSSIBLY-CLEANUP-WRITE-IMAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "cyc_test_image_filename", "CYC-TEST-IMAGE-FILENAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "cyc_test_mentions_invalid_constantP", "CYC-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "compare_directories", "COMPARE-DIRECTORIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "directory_file_size_dict", "DIRECTORY-FILE-SIZE-DICT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "compare_file_size_dictionaries", "COMPARE-FILE-SIZE-DICTIONARIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "file_size_difference_within_toleranceP", "FILE-SIZE-DIFFERENCE-WITHIN-TOLERANCE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "size_change_tolerance", "SIZE-CHANGE-TOLERANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "file_size_grewP", "FILE-SIZE-GREW?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "new_file_size_difference_alert", "NEW-FILE-SIZE-DIFFERENCE-ALERT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "new_file_existence_difference_alert", "NEW-FILE-EXISTENCE-DIFFERENCE-ALERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "ignore_filename_due_to_regexP", "IGNORE-FILENAME-DUE-TO-REGEX?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "string_matches_any_regexP", "STRING-MATCHES-ANY-REGEX?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "write_directory_file_size_log", "WRITE-DIRECTORY-FILE-SIZE-LOG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "read_directory_file_size_log", "READ-DIRECTORY-FILE-SIZE-LOG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities", "compare_file_size_logs", "COMPARE-FILE-SIZE-LOGS", 2, 0, false);
        return (SubLObject)cyc_testing_utilities.NIL;
    }
    
    public static SubLObject init_cyc_testing_utilities_file() {
        cyc_testing_utilities.$default_rerun_crashing_tests$ = SubLFiles.defparameter("*DEFAULT-RERUN-CRASHING-TESTS*", (SubLObject)cyc_testing_utilities.ONE_INTEGER);
        cyc_testing_utilities.$cyc_test_write_image_directory$ = SubLFiles.defparameter("*CYC-TEST-WRITE-IMAGE-DIRECTORY*", (SubLObject)cyc_testing_utilities.NIL);
        cyc_testing_utilities.$tests_that_dont_work_with_real_time_pruning$ = SubLFiles.deflexical("*TESTS-THAT-DONT-WORK-WITH-REAL-TIME-PRUNING*", (SubLObject)cyc_testing_utilities.$list111);
        cyc_testing_utilities.$file_size_change_tolerance$ = SubLFiles.defparameter("*FILE-SIZE-CHANGE-TOLERANCE*", (SubLObject)cyc_testing_utilities.$float112$1_2);
        cyc_testing_utilities.$file_size_ignore_regexes$ = SubLFiles.defparameter("*FILE-SIZE-IGNORE-REGEXES*", (SubLObject)cyc_testing_utilities.$list113);
        cyc_testing_utilities.$size_logs_directory$ = SubLFiles.deflexical("*SIZE-LOGS-DIRECTORY*", (SubLObject)cyc_testing_utilities.$str96$);
        return (SubLObject)cyc_testing_utilities.NIL;
    }
    
    public static SubLObject setup_cyc_testing_utilities_file() {
        access_macros.register_macro_helper((SubLObject)cyc_testing_utilities.$sym20$RUN_CYC_TEST_INT, (SubLObject)cyc_testing_utilities.$sym26$RUN_CYC_TEST);
        access_macros.register_macro_helper((SubLObject)cyc_testing_utilities.$sym22$RUN_CYC_TEST_IN_RANGE_INT, (SubLObject)cyc_testing_utilities.$sym26$RUN_CYC_TEST);
        access_macros.register_macro_helper((SubLObject)cyc_testing_utilities.$sym35$RUN_CYC_TEST_PARALLEL_INT, (SubLObject)cyc_testing_utilities.$sym36$RUN_CYC_TEST_PARALLEL);
        return (SubLObject)cyc_testing_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cyc_testing_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cyc_testing_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cyc_testing_utilities_file();
    }
    
    static {
        me = (SubLFile)new cyc_testing_utilities();
        cyc_testing_utilities.$default_rerun_crashing_tests$ = null;
        cyc_testing_utilities.$cyc_test_write_image_directory$ = null;
        cyc_testing_utilities.$tests_that_dont_work_with_real_time_pruning$ = null;
        cyc_testing_utilities.$file_size_change_tolerance$ = null;
        cyc_testing_utilities.$file_size_ignore_regexes$ = null;
        cyc_testing_utilities.$size_logs_directory$ = null;
        $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), (SubLObject)cyc_testing_utilities.NIL);
        $sym2$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str3$_lisp = SubLObjectFactory.makeString(".lisp");
        $sym4$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $str5$_A = SubLObjectFactory.makeString("~A");
        $str6$_ = SubLObjectFactory.makeString("/");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBOSITY"), (SubLObject)SubLObjectFactory.makeKeyword("TERSE")), (SubLObject)SubLObjectFactory.makeSymbol("BROWSABLE?"), (SubLObject)SubLObjectFactory.makeSymbol("BLOCK?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("STANDARD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERBOSITY"), (SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)SubLObjectFactory.makeKeyword("BLOCK?"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));
        $kw9$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw10$VERBOSITY = SubLObjectFactory.makeKeyword("VERBOSITY");
        $kw11$TERSE = SubLObjectFactory.makeKeyword("TERSE");
        $kw12$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $kw13$BLOCK_ = SubLObjectFactory.makeKeyword("BLOCK?");
        $kw14$OUTPUT_FORMAT = SubLObjectFactory.makeKeyword("OUTPUT-FORMAT");
        $kw15$STANDARD = SubLObjectFactory.makeKeyword("STANDARD");
        $kw16$STREAM = SubLObjectFactory.makeKeyword("STREAM");
        $sym17$_STANDARD_OUTPUT_ = SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*");
        $kw18$RUN_TINY_KB_TESTS_IN_FULL_KB_ = SubLObjectFactory.makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?");
        $sym19$_RUN_TINY_KB_TESTS_IN_FULL_KB__ = SubLObjectFactory.makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*");
        $sym20$RUN_CYC_TEST_INT = SubLObjectFactory.makeSymbol("RUN-CYC-TEST-INT");
        $list21 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("MIN-NUMBER"), SubLObjectFactory.makeSymbol("MAX-NUMBER"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBOSITY"), (SubLObject)SubLObjectFactory.makeKeyword("TERSE")), SubLObjectFactory.makeSymbol("BROWSABLE?"), SubLObjectFactory.makeSymbol("BLOCK?"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("STANDARD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))) });
        $sym22$RUN_CYC_TEST_IN_RANGE_INT = SubLObjectFactory.makeSymbol("RUN-CYC-TEST-IN-RANGE-INT");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("BROWSABLE?"), (SubLObject)SubLObjectFactory.makeSymbol("BLOCK?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("STANDARD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)SubLObjectFactory.makeKeyword("BLOCK?"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));
        $kw25$VERBOSE = SubLObjectFactory.makeKeyword("VERBOSE");
        $sym26$RUN_CYC_TEST = SubLObjectFactory.makeSymbol("RUN-CYC-TEST");
        $sym27$CYC_TEST_VERBOSITY_LEVEL_P = SubLObjectFactory.makeSymbol("CYC-TEST-VERBOSITY-LEVEL-P");
        $sym28$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $sym29$CYC_TEST_OUTPUT_FORMAT_P = SubLObjectFactory.makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");
        $sym30$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
        $list31 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTHREADS"), (SubLObject)cyc_testing_utilities.FOUR_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTIMES"), (SubLObject)cyc_testing_utilities.TEN_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBOSITY"), (SubLObject)SubLObjectFactory.makeKeyword("TERSE")), SubLObjectFactory.makeSymbol("BROWSABLE?"), SubLObjectFactory.makeSymbol("BLOCK?"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("STANDARD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARD-OUTPUT*"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))) });
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NTHREADS"), (SubLObject)SubLObjectFactory.makeKeyword("NTIMES"), (SubLObject)SubLObjectFactory.makeKeyword("VERBOSITY"), (SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)SubLObjectFactory.makeKeyword("BLOCK?"), (SubLObject)SubLObjectFactory.makeKeyword("OUTPUT-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));
        $kw33$NTHREADS = SubLObjectFactory.makeKeyword("NTHREADS");
        $kw34$NTIMES = SubLObjectFactory.makeKeyword("NTIMES");
        $sym35$RUN_CYC_TEST_PARALLEL_INT = SubLObjectFactory.makeSymbol("RUN-CYC-TEST-PARALLEL-INT");
        $sym36$RUN_CYC_TEST_PARALLEL = SubLObjectFactory.makeSymbol("RUN-CYC-TEST-PARALLEL");
        $sym37$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $str38$Parallel_Test_Thread_for_ = SubLObjectFactory.makeString("Parallel Test Thread for ");
        $str39$_No__ = SubLObjectFactory.makeString(" No. ");
        $sym40$RUN_CYC_TEST_OBJECT_PARALLEL = SubLObjectFactory.makeSymbol("RUN-CYC-TEST-OBJECT-PARALLEL");
        $kw41$IUT = SubLObjectFactory.makeKeyword("IUT");
        $kw42$IT = SubLObjectFactory.makeKeyword("IT");
        $kw43$RMT = SubLObjectFactory.makeKeyword("RMT");
        $kw44$TMT = SubLObjectFactory.makeKeyword("TMT");
        $kw45$RMCT = SubLObjectFactory.makeKeyword("RMCT");
        $kw46$ERT = SubLObjectFactory.makeKeyword("ERT");
        $kw47$TCT = SubLObjectFactory.makeKeyword("TCT");
        $kw48$KCT = SubLObjectFactory.makeKeyword("KCT");
        $str49$Cyc_test_of_unexpected_type___s = SubLObjectFactory.makeString("Cyc test of unexpected type: ~s");
        $kw50$SILENT = SubLObjectFactory.makeKeyword("SILENT");
        $str51$Can_t_run_inference_tests_in_brow = SubLObjectFactory.makeString("Can't run inference tests in browsable mode -- ignoring :browsable? setting~%");
        $str52$Can_t_run_inference_tests_in_bloc = SubLObjectFactory.makeString("Can't run inference tests in blocking mode -- ignoring :block? setting~%");
        $kw53$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $kw54$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $str55$Unexpected_testing_direction____S = SubLObjectFactory.makeString("Unexpected testing direction : ~S");
        $kw56$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str57$Can_t_run_removal_module_cost_tes = SubLObjectFactory.makeString("Can't run removal module cost tests in browsable mode -- ignoring :browsable? setting~%");
        $str58$Can_t_run_removal_module_cost_tes = SubLObjectFactory.makeString("Can't run removal module cost tests in blocking mode -- ignoring :block? setting~%");
        $str59$Can_t_run_evaluatable_relation_te = SubLObjectFactory.makeString("Can't run evaluatable relation tests in blocking mode -- ignoring :block? setting~%");
        $str60$Can_t_run_test_case_tables_in_bro = SubLObjectFactory.makeString("Can't run test case tables in browsable mode -- ignoring :browsable? setting~%");
        $str61$Can_t_run_test_case_tables_in_blo = SubLObjectFactory.makeString("Can't run test case tables in blocking mode -- ignoring :block? setting~%");
        $kw62$POST_BUILD = SubLObjectFactory.makeKeyword("POST-BUILD");
        $sym63$CYC_TEST_TYPE_SPEC_P = SubLObjectFactory.makeSymbol("CYC-TEST-TYPE-SPEC-P");
        $sym64$FILE_VALID_FOR_WRITING_P = SubLObjectFactory.makeSymbol("FILE-VALID-FOR-WRITING-P");
        $sym65$DIRECTORY_WRITEABLE_P = SubLObjectFactory.makeSymbol("DIRECTORY-WRITEABLE-P");
        $str66$Invalid_phase__A_of__A_specified_ = SubLObjectFactory.makeString("Invalid phase ~A of ~A specified.");
        $kw67$APPEND = SubLObjectFactory.makeKeyword("APPEND");
        $str68$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str69$___HARNESS_ERROR___A__ = SubLObjectFactory.makeString("~&:HARNESS-ERROR: ~A~%");
        $kw70$HARNESS_ERROR = SubLObjectFactory.makeKeyword("HARNESS-ERROR");
        $kw71$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $kw72$EOF = SubLObjectFactory.makeKeyword("EOF");
        $sym73$CYC_TEST_RUN_P = SubLObjectFactory.makeSymbol("CYC-TEST-RUN-P");
        $kw74$NOT_RUN = SubLObjectFactory.makeKeyword("NOT-RUN");
        $kw75$INVALID = SubLObjectFactory.makeKeyword("INVALID");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RMT"), (SubLObject)SubLObjectFactory.makeKeyword("TMT"), (SubLObject)SubLObjectFactory.makeKeyword("TCT"));
        $kw77$ONLY = SubLObjectFactory.makeKeyword("ONLY");
        $str78$Unexpected_value__s_for__run_non_ = SubLObjectFactory.makeString("Unexpected value ~s for :run-non-working-tests");
        $str79$____Failing_regression_tests___ = SubLObjectFactory.makeString("~&~%Failing regression tests:~%");
        $sym80$FAILING_CYC_TEST_RUN_P = SubLObjectFactory.makeSymbol("FAILING-CYC-TEST-RUN-P");
        $str81$None____ = SubLObjectFactory.makeString("None! (:");
        $str82$____Succeeding_regression_tests__ = SubLObjectFactory.makeString("~&~%Succeeding regression tests:~%");
        $sym83$SUCCEEDING_CYC_TEST_RUN_P = SubLObjectFactory.makeSymbol("SUCCEEDING-CYC-TEST-RUN-P");
        $str84$None____ = SubLObjectFactory.makeString("None! ):");
        $sym85$IGNORED_CYC_TEST_RUN_P = SubLObjectFactory.makeSymbol("IGNORED-CYC-TEST-RUN-P");
        $str86$____Non_regression_tests__None_ = SubLObjectFactory.makeString("~&~%Non-regression tests: None.");
        $kw87$NON_REGRESSION_SUCCESS = SubLObjectFactory.makeKeyword("NON-REGRESSION-SUCCESS");
        $kw88$NON_REGRESSION_FAILURE = SubLObjectFactory.makeKeyword("NON-REGRESSION-FAILURE");
        $str89$__Failing_non_regression_tests___ = SubLObjectFactory.makeString("~&Failing non-regression tests:~%");
        $str90$__Succeeding_non_regression_tests = SubLObjectFactory.makeString("~&Succeeding non-regression tests:~%");
        $str91$_Running_a_specified_list_of_test = SubLObjectFactory.makeString("\nRunning a specified list of tests ");
        $str92$_Running__a_file_P_of_tests_ = SubLObjectFactory.makeString("\nRunning ~a file~P of tests ");
        $str93$in_the__a_KB__KB__a___System__a_S = SubLObjectFactory.makeString("in the ~a KB (KB ~a):\nSystem ~a\nStarted at ~a ~a\n\n");
        $str94$Tiny = SubLObjectFactory.makeString("Tiny");
        $str95$Full = SubLObjectFactory.makeString("Full");
        $str96$ = SubLObjectFactory.makeString("");
        $str97$_ = SubLObjectFactory.makeString("(");
        $str98$_of_ = SubLObjectFactory.makeString(" of ");
        $str99$_phases_ = SubLObjectFactory.makeString(" phases)");
        $str100$__No_tests_were_run___ = SubLObjectFactory.makeString("~&No tests were run.~%");
        $sym101$CYC_TEST_NAME = SubLObjectFactory.makeSymbol("CYC-TEST-NAME");
        $str102$__NOTE__The_following_cyc_tests_w = SubLObjectFactory.makeString("~&NOTE: The following cyc tests were noted as not working:~%");
        $str103$___Tests_finished_at__a_Total_tim = SubLObjectFactory.makeString("~&\nTests finished at ~a\nTotal time: ~a\nTotal test guts time: ~a\nHistogram of results:~%");
        $sym104$CYC_TEST_RUN_RESULT = SubLObjectFactory.makeSymbol("CYC-TEST-RUN-RESULT");
        $str105$Overall_result___s__ = SubLObjectFactory.makeString("Overall result: ~s~%");
        $str106$_S__A__S__A = SubLObjectFactory.makeString("~S ~A ~S ~A");
        $str107$__A = SubLObjectFactory.makeString(" ~A");
        $kw108$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $str109$cyc_test_image_ = SubLObjectFactory.makeString("cyc-test-image-");
        $str110$load = SubLObjectFactory.makeString("load");
        $list111 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("CANONICALIZE-INFERENCE-ANSWER-JUSTIFICATIONS"), SubLObjectFactory.makeKeyword("NON-EXPLANATORY-SENTENCE-SUPPORTS"), SubLObjectFactory.makeKeyword("NON-EXPLANATORY-VARIABLE-MAP-SUPPORTS"), SubLObjectFactory.makeKeyword("TRUE-SENTENCE-OF-ATOMIC-SENTENCE-REDUCTION"), SubLObjectFactory.makeKeyword("IST-OF-ATOMIC-SENTENCE-REDUCTION"), SubLObjectFactory.makeKeyword("RELATION-ALL-INSTANCE-ITERATE-2"), SubLObjectFactory.makeKeyword("RELATION-INSTANCE-ALL-ITERATE-2"), SubLObjectFactory.makeKeyword("REJECT-PREVIOUSLY-PROVEN-PROOFS"), SubLObjectFactory.makeKeyword("INFERENCE-HARNESS-OVERHEAD"), SubLObjectFactory.makeKeyword("TACTICALLY-UNEXAMINED-NO-GOOD-IMPLIES-STRATEGICALLY-UNEXAMINED-NO-GOOD"), SubLObjectFactory.makeKeyword("KAPPA-REMOVAL-WORKS"), SubLObjectFactory.makeKeyword("DONT-REOPEN-ANSWER-LINK"), SubLObjectFactory.makeKeyword("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-14A"), SubLObjectFactory.makeKeyword("CLOSED-ASENT-WITH-3-CHILDREN"), SubLObjectFactory.makeKeyword("SIMPLE-EXCEPT-WHEN"), SubLObjectFactory.makeKeyword("SIMPLE-EXCEPT-WHEN-RESIDUAL-TRANSFORMATION"), SubLObjectFactory.makeKeyword("PARTIAL-EXCEPT-WHEN"), SubLObjectFactory.makeKeyword("VARIABLE-MAP-EXCEPT-WHEN"), SubLObjectFactory.makeKeyword("EXCEPTION-TMS-BACKWARD-NO-OP"), SubLObjectFactory.makeKeyword("MULTIPLE-TRANSFORMATION-PROOFS-FOR-CLOSED-PROBLEM"), SubLObjectFactory.makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-1"), SubLObjectFactory.makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-2"), SubLObjectFactory.makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-3"), SubLObjectFactory.makeKeyword("EXCEPT-MT-IN-MID-MT-BLOCKS-HIGH-MT-FROM-LOW-MT"), SubLObjectFactory.makeKeyword("EXCEPT-MT-IN-HIGH-MT-HOSES-BACKWARD-INFERENCE"), SubLObjectFactory.makeKeyword("TWO-STEP"), SubLObjectFactory.makeKeyword("TWO-STEP-ARG-1"), SubLObjectFactory.makeKeyword("RECONSIDER-DEDUCTION"), SubLObjectFactory.makeKeyword("THERE-EXISTS"), SubLObjectFactory.makeKeyword("EXCEPT-WHEN"), SubLObjectFactory.makeKeyword("STRENGTH-PROPAGATION"), SubLObjectFactory.makeKeyword("SEQUENCE-VARIABLES-INFERENCE"), SubLObjectFactory.makeKeyword("INFERENCE-ANSWER-TEMPLATE"), SubLObjectFactory.makeKeyword("EXCEPT-BLOCKS-BACKWARD"), SubLObjectFactory.makeKeyword("EXCEPT-BLOCKS-FORWARD"), SubLObjectFactory.makeKeyword("TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-SCOPING"), SubLObjectFactory.makeKeyword("TMS-RECONSIDERATION-WITH-BACKCHAIN-FORBIDDEN"), SubLObjectFactory.makeKeyword("LAZILY-MANIFEST-NON-FOCALS"), SubLObjectFactory.makeKeyword("CONSIDER-NO-GOOD-AFTER-DETERMINING-TACTICS"), SubLObjectFactory.makeKeyword("IRRELEVANT-DOES-NOT-IMPLY-PENDING"), SubLObjectFactory.makeKeyword("PROBLEM-STORE-PRUNING-MAX-INSUFFICIENT"), SubLObjectFactory.makeKeyword("RESTRICTED-CLOSED-GOOD-PROBLEMS-STAY-UNEXAMINED"), SubLObjectFactory.makeKeyword("GENLS-BETWEEN"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-1"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-2"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-3"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-4"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-5"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-6"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-7"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-8"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-FOLLOWUP-ADDITIONAL-JOIN-ORDERED"), SubLObjectFactory.makeKeyword("CONJUNCTIVE-FOLLOWUP-ADDITIONAL-JOIN-ORDERED-WITHOUT-INFERENCE"), SubLObjectFactory.makeKeyword("CIRCULAR-PROOFS"), SubLObjectFactory.makeKeyword("POSSIBLE-REUSED-PROBLEMS-GET-STRATEGICALLY-EVALUATED"), SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION-PROBLEM-REUSE") });
        $float112$1_2 = (SubLFloat)SubLObjectFactory.makeDouble(1.2);
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(".*~[0-9]+~"));
        $sym114$DIRECTORY_P = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $str115$cdolist = SubLObjectFactory.makeString("cdolist");
        $str116$_ = SubLObjectFactory.makeString(" ");
        $str117$grew = SubLObjectFactory.makeString("grew");
        $str118$shrunk = SubLObjectFactory.makeString("shrunk");
        $str119$_from_ = SubLObjectFactory.makeString(" from ");
        $str120$_bytes_to_ = SubLObjectFactory.makeString(" bytes to ");
        $str121$_bytes = SubLObjectFactory.makeString(" bytes");
        $str122$_disappeared = SubLObjectFactory.makeString(" disappeared");
        $str123$_is_a_new_file = SubLObjectFactory.makeString(" is a new file");
        $str124$filename = SubLObjectFactory.makeString("filename");
        $str125$size_in_bytes_as_of_ = SubLObjectFactory.makeString("size in bytes as of ");
    }
}

/*

	Total time: 746 ms
	 synthetic 
*/